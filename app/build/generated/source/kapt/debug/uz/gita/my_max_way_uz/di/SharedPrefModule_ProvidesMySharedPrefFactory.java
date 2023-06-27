// Generated by Dagger (https://dagger.dev).
package uz.gita.my_max_way_uz.di;

import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import uz.gita.my_max_way_uz.data.source.local.sharedpref.SharedPref;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SharedPrefModule_ProvidesMySharedPrefFactory implements Factory<SharedPref> {
  private final SharedPrefModule module;

  private final Provider<SharedPreferences> shProvider;

  public SharedPrefModule_ProvidesMySharedPrefFactory(SharedPrefModule module,
      Provider<SharedPreferences> shProvider) {
    this.module = module;
    this.shProvider = shProvider;
  }

  @Override
  public SharedPref get() {
    return providesMySharedPref(module, shProvider.get());
  }

  public static SharedPrefModule_ProvidesMySharedPrefFactory create(SharedPrefModule module,
      Provider<SharedPreferences> shProvider) {
    return new SharedPrefModule_ProvidesMySharedPrefFactory(module, shProvider);
  }

  public static SharedPref providesMySharedPref(SharedPrefModule instance, SharedPreferences sh) {
    return Preconditions.checkNotNullFromProvides(instance.providesMySharedPref(sh));
  }
}
