// Generated by Dagger (https://dagger.dev).
package uz.gita.my_max_way_uz.domain.usecase.impl;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import uz.gita.my_max_way_uz.domain.repository.NetworkRepository;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeUseCaseImpl_Factory implements Factory<HomeUseCaseImpl> {
  private final Provider<NetworkRepository> repositoryProvider;

  public HomeUseCaseImpl_Factory(Provider<NetworkRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public HomeUseCaseImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static HomeUseCaseImpl_Factory create(Provider<NetworkRepository> repositoryProvider) {
    return new HomeUseCaseImpl_Factory(repositoryProvider);
  }

  public static HomeUseCaseImpl newInstance(NetworkRepository repository) {
    return new HomeUseCaseImpl(repository);
  }
}
