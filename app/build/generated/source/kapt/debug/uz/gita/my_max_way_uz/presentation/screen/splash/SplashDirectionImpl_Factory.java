// Generated by Dagger (https://dagger.dev).
package uz.gita.my_max_way_uz.presentation.screen.splash;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import uz.gita.my_max_way_uz.navigation.AppNavigator;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SplashDirectionImpl_Factory implements Factory<SplashDirectionImpl> {
  private final Provider<AppNavigator> navigatorProvider;

  public SplashDirectionImpl_Factory(Provider<AppNavigator> navigatorProvider) {
    this.navigatorProvider = navigatorProvider;
  }

  @Override
  public SplashDirectionImpl get() {
    return newInstance(navigatorProvider.get());
  }

  public static SplashDirectionImpl_Factory create(Provider<AppNavigator> navigatorProvider) {
    return new SplashDirectionImpl_Factory(navigatorProvider);
  }

  public static SplashDirectionImpl newInstance(AppNavigator navigator) {
    return new SplashDirectionImpl(navigator);
  }
}
