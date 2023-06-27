package uz.gita.my_max_way_uz.domain.usecase.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0016\u00f8\u0001\u0000J3\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u00070\u00062\u0006\u0010\f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016\u00f8\u0001\u0000J%\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u00070\u00062\u0006\u0010\f\u001a\u00020\tH\u0016\u00f8\u0001\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Luz/gita/my_max_way_uz/domain/usecase/impl/HomeUseCaseImpl;", "Luz/gita/my_max_way_uz/domain/usecase/HomeUseCase;", "repository", "Luz/gita/my_max_way_uz/domain/repository/NetworkRepository;", "(Luz/gita/my_max_way_uz/domain/repository/NetworkRepository;)V", "getCategories", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "", "getFoodsByCategory", "Luz/gita/my_max_way_uz/data/model/CategoryData;", "name", "lit", "getFoodsBySearch", "app_debug"})
public final class HomeUseCaseImpl implements uz.gita.my_max_way_uz.domain.usecase.HomeUseCase {
    private final uz.gita.my_max_way_uz.domain.repository.NetworkRepository repository = null;
    
    @javax.inject.Inject
    public HomeUseCaseImpl(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.domain.repository.NetworkRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.my_max_way_uz.data.model.CategoryData>>> getFoodsByCategory(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> lit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.my_max_way_uz.data.model.CategoryData>>> getFoodsBySearch(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<java.lang.String>>> getCategories() {
        return null;
    }
}