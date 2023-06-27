package uz.gita.my_max_way_uz.domain.repository.impl

import android.app.Activity
import android.util.Log
import com.google.firebase.FirebaseException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthCredential
import com.google.firebase.auth.PhoneAuthOptions
import com.google.firebase.auth.PhoneAuthProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flowOn
import uz.gita.my_max_way_uz.domain.repository.AuthRepository
import uz.gita.my_max_way_uz.utils.myLog
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor() : AuthRepository {
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()


    private lateinit var omVerificationCode: String

    override fun sendSms(phone: String, activity: Activity): Flow<Result<String>> = callbackFlow {

        myLog(auth.toString())
        val onVerificationCallback =
            object : PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                override fun onVerificationCompleted(p0: PhoneAuthCredential) {

                }

                override fun onVerificationFailed(p0: FirebaseException) {
                    trySend(Result.failure(p0))
                }

                override fun onCodeSent(
                    verificationCode: String,
                    p1: PhoneAuthProvider.ForceResendingToken
                ) {
                    super.onCodeSent(verificationCode, p1)
                    trySend(Result.success("OTP Sent Successfully"))
                    omVerificationCode = verificationCode
                    Log.d("TTT", verificationCode)
                }
            }

        val options = PhoneAuthOptions.newBuilder(auth)
            .setPhoneNumber(phone)
            .setActivity(activity)
            .setTimeout(60L, TimeUnit.SECONDS)
            .setCallbacks(onVerificationCallback)
            .build()
        PhoneAuthProvider.verifyPhoneNumber(options)
        awaitClose()
    }.flowOn(Dispatchers.IO)

    override fun signWithCredential(sms: String): Flow<Result<String>> =
        callbackFlow<Result<String>> {
            val credential = PhoneAuthProvider.getCredential(omVerificationCode, sms)
            auth.signInWithCredential(credential)
                .addOnCompleteListener {
                    if (it.isSuccessful)
                        trySend(Result.success("otp verified"))
                }.addOnFailureListener {
                    trySend(Result.failure(it))
                }
            awaitClose {
                close()
            }
        }.flowOn(Dispatchers.IO)

}