package uz.gita.my_max_way_uz.presentation.page.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/home/HomeViewModel;", "Luz/gita/my_max_way_uz/presentation/page/home/HomeContact$ViewModel;", "Landroidx/lifecycle/ViewModel;", "direction", "Luz/gita/my_max_way_uz/presentation/page/home/HomeContact$Directions;", "useCase", "Luz/gita/my_max_way_uz/domain/usecase/HomeUseCase;", "(Luz/gita/my_max_way_uz/presentation/page/home/HomeContact$Directions;Luz/gita/my_max_way_uz/domain/usecase/HomeUseCase;)V", "container", "Lorg/orbitmvi/orbit/Container;", "Luz/gita/my_max_way_uz/presentation/page/home/HomeContact$UiState;", "Luz/gita/my_max_way_uz/presentation/page/home/HomeContact$SideEffect$HasError;", "getContainer", "()Lorg/orbitmvi/orbit/Container;", "onEventDispatcher", "", "intent", "Luz/gita/my_max_way_uz/presentation/page/home/HomeContact$Intent;", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel implements uz.gita.my_max_way_uz.presentation.page.home.HomeContact.ViewModel {
    private final uz.gita.my_max_way_uz.presentation.page.home.HomeContact.Directions direction = null;
    private final uz.gita.my_max_way_uz.domain.usecase.HomeUseCase useCase = null;
    @org.jetbrains.annotations.NotNull
    private final org.orbitmvi.orbit.Container<uz.gita.my_max_way_uz.presentation.page.home.HomeContact.UiState, uz.gita.my_max_way_uz.presentation.page.home.HomeContact.SideEffect.HasError> container = null;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.presentation.page.home.HomeContact.Directions direction, @org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.domain.usecase.HomeUseCase useCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.orbitmvi.orbit.Container<uz.gita.my_max_way_uz.presentation.page.home.HomeContact.UiState, uz.gita.my_max_way_uz.presentation.page.home.HomeContact.SideEffect.HasError> getContainer() {
        return null;
    }
    
    @java.lang.Override
    public void onEventDispatcher(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.presentation.page.home.HomeContact.Intent intent) {
    }
}