package uz.gita.my_max_way_uz.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0011H\'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0014H\'\u00a8\u0006\u0015"}, d2 = {"Luz/gita/my_max_way_uz/di/DirectionModule;", "", "bindBasketDirection", "Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$Directions;", "impl", "Luz/gita/my_max_way_uz/presentation/page/busket/BasketDirections;", "bindDetailsDirection", "Luz/gita/my_max_way_uz/presentation/page/details/DetailsContract$Directions;", "Luz/gita/my_max_way_uz/presentation/page/details/DetailsDirections;", "bindHomeDirection", "Luz/gita/my_max_way_uz/presentation/page/home/HomeContact$Directions;", "Luz/gita/my_max_way_uz/presentation/page/home/HomeScreenDirection;", "bindLoginDirection", "Luz/gita/my_max_way_uz/presentation/screen/login/LoginContract$LoginDirection;", "Luz/gita/my_max_way_uz/presentation/screen/login/LoginDirectionImpl;", "bindSplashDirection", "Luz/gita/my_max_way_uz/presentation/screen/splash/SplashDirection;", "Luz/gita/my_max_way_uz/presentation/screen/splash/SplashDirectionImpl;", "bindVerifyDirection", "Luz/gita/my_max_way_uz/presentation/screen/verify/VerifyContract$Direction;", "Luz/gita/my_max_way_uz/presentation/screen/verify/VerifyDirection;", "app_debug"})
@dagger.Module
public abstract interface DirectionModule {
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.my_max_way_uz.presentation.screen.splash.SplashDirection bindSplashDirection(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.presentation.screen.splash.SplashDirectionImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.my_max_way_uz.presentation.screen.login.LoginContract.LoginDirection bindLoginDirection(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.presentation.screen.login.LoginDirectionImpl impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.my_max_way_uz.presentation.screen.verify.VerifyContract.Direction bindVerifyDirection(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.presentation.screen.verify.VerifyDirection impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.my_max_way_uz.presentation.page.home.HomeContact.Directions bindHomeDirection(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.presentation.page.home.HomeScreenDirection impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.my_max_way_uz.presentation.page.details.DetailsContract.Directions bindDetailsDirection(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.presentation.page.details.DetailsDirections impl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.Directions bindBasketDirection(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.presentation.page.busket.BasketDirections impl);
}