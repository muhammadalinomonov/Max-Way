package uz.gita.my_max_way_uz.domain.repository.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016\u00f8\u0001\u0000J\u001f\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00f8\u0001\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Luz/gita/my_max_way_uz/domain/repository/impl/AuthRepositoryImpl;", "Luz/gita/my_max_way_uz/domain/repository/AuthRepository;", "()V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "omVerificationCode", "", "sendSms", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "phone", "activity", "Landroid/app/Activity;", "signWithCredential", "sms", "app_debug"})
public final class AuthRepositoryImpl implements uz.gita.my_max_way_uz.domain.repository.AuthRepository {
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    private java.lang.String omVerificationCode;
    
    @javax.inject.Inject
    public AuthRepositoryImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.String>> sendSms(@org.jetbrains.annotations.NotNull
    java.lang.String phone, @org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.String>> signWithCredential(@org.jetbrains.annotations.NotNull
    java.lang.String sms) {
        return null;
    }
}