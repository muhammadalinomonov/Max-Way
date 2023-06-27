// Generated by Dagger (https://dagger.dev).
package uz.gita.my_max_way_uz.presentation.screen.login;

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
public final class LoginDirectionImpl_Factory implements Factory<LoginDirectionImpl> {
  private final Provider<AppNavigator> navigatorProvider;

  public LoginDirectionImpl_Factory(Provider<AppNavigator> navigatorProvider) {
    this.navigatorProvider = navigatorProvider;
  }

  @Override
  public LoginDirectionImpl get() {
    return newInstance(navigatorProvider.get());
  }

  public static LoginDirectionImpl_Factory create(Provider<AppNavigator> navigatorProvider) {
    return new LoginDirectionImpl_Factory(navigatorProvider);
  }

  public static LoginDirectionImpl newInstance(AppNavigator navigator) {
    return new LoginDirectionImpl(navigator);
  }
}
