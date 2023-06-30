package uz.gita.my_max_way_uz.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import uz.gita.my_max_way_uz.presentation.page.busket.BasketContract
import uz.gita.my_max_way_uz.presentation.page.busket.BasketDirections
import uz.gita.my_max_way_uz.presentation.page.details.DetailsContract
import uz.gita.my_max_way_uz.presentation.page.details.DetailsDirections
import uz.gita.my_max_way_uz.presentation.page.editprofile.EditProfileContact
import uz.gita.my_max_way_uz.presentation.page.editprofile.EditProfileDirections
import uz.gita.my_max_way_uz.presentation.page.home.HomeContact
import uz.gita.my_max_way_uz.presentation.page.home.HomeScreenDirection
import uz.gita.my_max_way_uz.presentation.page.profile.ProfileContact
import uz.gita.my_max_way_uz.presentation.page.profile.ProfileScreenDirections
import uz.gita.my_max_way_uz.presentation.screen.login.LoginContract
import uz.gita.my_max_way_uz.presentation.screen.login.LoginDirectionImpl
import uz.gita.my_max_way_uz.presentation.screen.splash.SplashDirection
import uz.gita.my_max_way_uz.presentation.screen.splash.SplashDirectionImpl
import uz.gita.my_max_way_uz.presentation.screen.verify.VerifyContract
import uz.gita.my_max_way_uz.presentation.screen.verify.VerifyDirection

@Module
@InstallIn(ViewModelComponent::class)
interface DirectionModule {
    @Binds
    fun bindSplashDirection(impl: SplashDirectionImpl): SplashDirection

    @Binds
    fun bindLoginDirection(impl: LoginDirectionImpl): LoginContract.LoginDirection

    @Binds
    fun bindVerifyDirection(impl: VerifyDirection): VerifyContract.Direction

    @Binds
    fun bindHomeDirection(impl: HomeScreenDirection): HomeContact.Directions

    @Binds
    fun bindDetailsDirection(impl: DetailsDirections): DetailsContract.Directions

    @Binds
    fun bindBasketDirection(impl: BasketDirections): BasketContract.Directions

    @Binds
    fun bindProfileDirection(impl: ProfileScreenDirections): ProfileContact.Directions

    @Binds
    fun bindEditProfileDirection(impl: EditProfileDirections): EditProfileContact.Directions


}