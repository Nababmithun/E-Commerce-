package com.aman.ecommerce.ui.cart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0017H\u0014J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001c"}, d2 = {"Lcom/aman/ecommerce/ui/cart/CartViewModel;", "Landroidx/lifecycle/ViewModel;", "database", "Lcom/aman/ecommerce/persistant/AppDatabase;", "(Lcom/aman/ecommerce/persistant/AppDatabase;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "observableState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/aman/ecommerce/ui/cart/CartState;", "getObservableState", "()Landroidx/lifecycle/MutableLiveData;", "setObservableState", "(Landroidx/lifecycle/MutableLiveData;)V", "productRepoI", "Lcom/aman/ecommerce/data/repo/ProductRepoI;", "value", "state", "getState", "()Lcom/aman/ecommerce/ui/cart/CartState;", "setState", "(Lcom/aman/ecommerce/ui/cart/CartState;)V", "getLocalProductList", "", "onCleared", "publishState", "setRepository", "Companion", "app_debug"})
public final class CartViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.aman.ecommerce.ui.cart.CartState> observableState;
    private io.reactivex.disposables.CompositeDisposable compositeDisposable;
    private com.aman.ecommerce.data.repo.ProductRepoI productRepoI;
    @org.jetbrains.annotations.NotNull()
    private com.aman.ecommerce.ui.cart.CartState state;
    private final com.aman.ecommerce.persistant.AppDatabase database = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "CartViewModel";
    public static final com.aman.ecommerce.ui.cart.CartViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.aman.ecommerce.ui.cart.CartState> getObservableState() {
        return null;
    }
    
    public final void setObservableState(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.aman.ecommerce.ui.cart.CartState> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.aman.ecommerce.ui.cart.CartState getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    com.aman.ecommerce.ui.cart.CartState value) {
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.aman.ecommerce.data.repo.ProductRepoI productRepoI) {
    }
    
    public final void getLocalProductList() {
    }
    
    private final void publishState(com.aman.ecommerce.ui.cart.CartState state) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public CartViewModel(@org.jetbrains.annotations.NotNull()
    com.aman.ecommerce.persistant.AppDatabase database) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/aman/ecommerce/ui/cart/CartViewModel$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}