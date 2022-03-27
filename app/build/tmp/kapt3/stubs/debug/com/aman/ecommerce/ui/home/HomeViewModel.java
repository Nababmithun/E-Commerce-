package com.aman.ecommerce.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001a"}, d2 = {"Lcom/aman/ecommerce/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "observableState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/aman/ecommerce/ui/home/HomeState;", "getObservableState", "()Landroidx/lifecycle/MutableLiveData;", "setObservableState", "(Landroidx/lifecycle/MutableLiveData;)V", "productRepoI", "Lcom/aman/ecommerce/data/repo/ProductRepoI;", "value", "state", "getState", "()Lcom/aman/ecommerce/ui/home/HomeState;", "setState", "(Lcom/aman/ecommerce/ui/home/HomeState;)V", "getProductList", "", "onCleared", "publishState", "setRepository", "Companion", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.aman.ecommerce.ui.home.HomeState> observableState;
    private io.reactivex.disposables.CompositeDisposable compositeDisposable;
    private com.aman.ecommerce.data.repo.ProductRepoI productRepoI;
    @org.jetbrains.annotations.NotNull()
    private com.aman.ecommerce.ui.home.HomeState state;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "HomeViewModel";
    public static final com.aman.ecommerce.ui.home.HomeViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.aman.ecommerce.ui.home.HomeState> getObservableState() {
        return null;
    }
    
    public final void setObservableState(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.aman.ecommerce.ui.home.HomeState> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.aman.ecommerce.ui.home.HomeState getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    com.aman.ecommerce.ui.home.HomeState value) {
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.aman.ecommerce.data.repo.ProductRepoI productRepoI) {
    }
    
    private final void publishState(com.aman.ecommerce.ui.home.HomeState state) {
    }
    
    public final void getProductList() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public HomeViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/aman/ecommerce/ui/home/HomeViewModel$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}