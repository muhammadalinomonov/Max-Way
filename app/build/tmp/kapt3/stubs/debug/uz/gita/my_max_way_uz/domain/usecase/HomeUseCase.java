package uz.gita.my_max_way_uz.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H&\u00f8\u0001\u0000J3\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00040\u00032\u0006\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00f8\u0001\u0000J%\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00040\u00032\u0006\u0010\t\u001a\u00020\u0006H&\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Luz/gita/my_max_way_uz/domain/usecase/HomeUseCase;", "", "getCategories", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "", "getFoodsByCategory", "Luz/gita/my_max_way_uz/data/model/CategoryData;", "name", "lit", "getFoodsBySearch", "app_debug"})
public abstract interface HomeUseCase {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.my_max_way_uz.data.model.CategoryData>>> getFoodsByCategory(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> lit);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.my_max_way_uz.data.model.CategoryData>>> getFoodsBySearch(@org.jetbrains.annotations.NotNull
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<java.lang.String>>> getCategories();
}