// Generated by Dagger (https://dagger.dev).
package uz.gita.my_max_way_uz.presentation.screen.splash;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import uz.gita.my_max_way_uz.data.source.local.sharedpref.SharedPref;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SplashViewModel_Factory implements Factory<SplashViewModel> {
  private final Provider<SplashDirection> directionProvider;

  private final Provider<SharedPref> sharedPrefProvider;

  public SplashViewModel_Factory(Provider<SplashDirection> directionProvider,
      Provider<SharedPref> sharedPrefProvider) {
    this.directionProvider = directionProvider;
    this.sharedPrefProvider = sharedPrefProvider;
  }

  @Override
  public SplashViewModel get() {
    return newInstance(directionProvider.get(), sharedPrefProvider.get());
  }

  public static SplashViewModel_Factory create(Provider<SplashDirection> directionProvider,
      Provider<SharedPref> sharedPrefProvider) {
    return new SplashViewModel_Factory(directionProvider, sharedPrefProvider);
  }

  public static SplashViewModel newInstance(SplashDirection direction, SharedPref sharedPref) {
    return new SplashViewModel(direction, sharedPref);
  }
}
