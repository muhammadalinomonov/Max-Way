package uz.gita.my_max_way_uz.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Luz/gita/my_max_way_uz/di/SharedPrefModule;", "", "()V", "providesMySharedPref", "Luz/gita/my_max_way_uz/data/source/local/sharedpref/SharedPref;", "sh", "Landroid/content/SharedPreferences;", "providesSharedPref", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module
public final class SharedPrefModule {
    
    public SharedPrefModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final android.content.SharedPreferences providesSharedPref(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final uz.gita.my_max_way_uz.data.source.local.sharedpref.SharedPref providesMySharedPref(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sh) {
        return null;
    }
}