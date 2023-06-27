package uz.gita.my_max_way_uz.domain.repository

import android.app.Activity
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    fun sendSms(phone: String, activity: Activity): Flow<Result<String>>
    fun signWithCredential(
        otp: String
    ): Flow<Result<String>>

}