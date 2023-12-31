// Generated by Dagger (https://dagger.dev).
package uz.gita.my_max_way_uz.presentation.page.details;

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
public final class DetailsDirections_Factory implements Factory<DetailsDirections> {
  private final Provider<AppNavigator> navigatorProvider;

  public DetailsDirections_Factory(Provider<AppNavigator> navigatorProvider) {
    this.navigatorProvider = navigatorProvider;
  }

  @Override
  public DetailsDirections get() {
    return newInstance(navigatorProvider.get());
  }

  public static DetailsDirections_Factory create(Provider<AppNavigator> navigatorProvider) {
    return new DetailsDirections_Factory(navigatorProvider);
  }

  public static DetailsDirections newInstance(AppNavigator navigator) {
    return new DetailsDirections(navigator);
  }
}
