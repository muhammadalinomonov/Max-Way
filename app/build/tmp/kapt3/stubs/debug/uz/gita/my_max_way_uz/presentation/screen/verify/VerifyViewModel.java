package uz.gita.my_max_way_uz.presentation.screen.verify;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Luz/gita/my_max_way_uz/presentation/screen/verify/VerifyViewModel;", "Luz/gita/my_max_way_uz/presentation/screen/verify/VerifyContract$ViewModel;", "Landroidx/lifecycle/ViewModel;", "direction", "Luz/gita/my_max_way_uz/presentation/screen/verify/VerifyContract$Direction;", "repository", "Luz/gita/my_max_way_uz/domain/repository/AuthRepository;", "sharedPref", "Luz/gita/my_max_way_uz/data/source/local/sharedpref/SharedPref;", "(Luz/gita/my_max_way_uz/presentation/screen/verify/VerifyContract$Direction;Luz/gita/my_max_way_uz/domain/repository/AuthRepository;Luz/gita/my_max_way_uz/data/source/local/sharedpref/SharedPref;)V", "container", "Lorg/orbitmvi/orbit/Container;", "Luz/gita/my_max_way_uz/presentation/screen/verify/VerifyContract$UiState;", "Luz/gita/my_max_way_uz/presentation/screen/verify/VerifyContract$SideEffect;", "getContainer", "()Lorg/orbitmvi/orbit/Container;", "onEventDispatcher", "", "intent", "Luz/gita/my_max_way_uz/presentation/screen/verify/VerifyContract$Intent;", "app_debug"})
public final class VerifyViewModel extends androidx.lifecycle.ViewModel implements uz.gita.my_max_way_uz.presentation.screen.verify.VerifyContract.ViewModel {
    private final uz.gita.my_max_way_uz.presentation.screen.verify.VerifyContract.Direction direction = null;
    private final uz.gita.my_max_way_uz.domain.repository.AuthRepository repository = null;
    private final uz.gita.my_max_way_uz.data.source.local.sharedpref.SharedPref sharedPref = null;
    @org.jetbrains.annotations.NotNull
    private final org.orbitmvi.orbit.Container<uz.gita.my_max_way_uz.presentation.screen.verify.VerifyContract.UiState, uz.gita.my_max_way_uz.presentation.screen.verify.VerifyContract.SideEffect> container = null;
    
    @javax.inject.Inject
    public VerifyViewModel(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.presentation.screen.verify.VerifyContract.Direction direction, @org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.domain.repository.AuthRepository repository, @org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.data.source.local.sharedpref.SharedPref sharedPref) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.orbitmvi.orbit.Container<uz.gita.my_max_way_uz.presentation.screen.verify.VerifyContract.UiState, uz.gita.my_max_way_uz.presentation.screen.verify.VerifyContract.SideEffect> getContainer() {
        return null;
    }
    
    @java.lang.Override
    public void onEventDispatcher(@org.jetbrains.annotations.NotNull
    uz.gita.my_max_way_uz.presentation.screen.verify.VerifyContract.Intent intent) {
    }
}