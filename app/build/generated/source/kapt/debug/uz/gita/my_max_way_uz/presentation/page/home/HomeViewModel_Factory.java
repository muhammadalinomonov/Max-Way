// Generated by Dagger (https://dagger.dev).
package uz.gita.my_max_way_uz.presentation.page.home;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import uz.gita.my_max_way_uz.domain.usecase.HomeUseCase;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<HomeContact.Directions> directionProvider;

  private final Provider<HomeUseCase> useCaseProvider;

  public HomeViewModel_Factory(Provider<HomeContact.Directions> directionProvider,
      Provider<HomeUseCase> useCaseProvider) {
    this.directionProvider = directionProvider;
    this.useCaseProvider = useCaseProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(directionProvider.get(), useCaseProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<HomeContact.Directions> directionProvider,
      Provider<HomeUseCase> useCaseProvider) {
    return new HomeViewModel_Factory(directionProvider, useCaseProvider);
  }

  public static HomeViewModel newInstance(HomeContact.Directions direction, HomeUseCase useCase) {
    return new HomeViewModel(direction, useCase);
  }
}
