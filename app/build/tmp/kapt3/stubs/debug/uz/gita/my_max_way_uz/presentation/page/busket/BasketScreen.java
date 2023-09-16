package uz.gita.my_max_way_uz.presentation.page.busket;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J*\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000fH\u0003J\b\u0010\u0011\u001a\u00020\nH\u0017J*\u0010\u0012\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000fH\u0007J\u0016\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068WX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0018"}, d2 = {"Luz/gita/my_max_way_uz/presentation/page/busket/BasketScreen;", "Lcafe/adriel/voyager/navigator/tab/Tab;", "Lcafe/adriel/voyager/androidx/AndroidScreen;", "Luz/gita/my_max_way_uz/navigation/AppScreen;", "()V", "options", "Lcafe/adriel/voyager/navigator/tab/TabOptions;", "getOptions", "()Lcafe/adriel/voyager/navigator/tab/TabOptions;", "BasketScreenContent", "", "uiState", "Landroidx/compose/runtime/State;", "Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$UiState;", "onEventDispatcher", "Lkotlin/Function1;", "Luz/gita/my_max_way_uz/presentation/page/busket/BasketContract$Intent;", "Content", "TopBar", "getPrice", "", "foodList", "", "Luz/gita/my_max_way_uz/data/source/local/room/entity/FoodEntity;", "app_debug"})
public final class BasketScreen extends cafe.adriel.voyager.androidx.AndroidScreen implements cafe.adriel.voyager.navigator.tab.Tab {
    
    public BasketScreen() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.compose.runtime.Composable
    @java.lang.Override
    public cafe.adriel.voyager.navigator.tab.TabOptions getOptions() {
        return null;
    }
    
    @androidx.compose.runtime.Composable
    @java.lang.Override
    public void Content() {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    private final void BasketScreenContent(androidx.compose.runtime.State<? extends uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.UiState> uiState, kotlin.jvm.functions.Function1<? super uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.Intent, kotlin.Unit> onEventDispatcher) {
    }
    
    @androidx.compose.runtime.Composable
    @android.annotation.SuppressLint(value = {"MutableCollectionMutableState"})
    public final void TopBar(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.State<? extends uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.UiState> uiState, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super uz.gita.my_max_way_uz.presentation.page.busket.BasketContract.Intent, kotlin.Unit> onEventDispatcher) {
    }
    
    private final long getPrice(java.util.List<uz.gita.my_max_way_uz.data.source.local.room.entity.FoodEntity> foodList) {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.JvmName(name = "getIcon")
    @androidx.compose.runtime.Composable
    @java.lang.Deprecated
    public androidx.compose.ui.graphics.painter.Painter getIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmName(name = "getTitle")
    @androidx.compose.runtime.Composable
    @java.lang.Deprecated
    public java.lang.String getTitle() {
        return null;
    }
}