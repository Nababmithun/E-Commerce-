package com.aman.ecommerce.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/aman/ecommerce/network/ApiInterface;", "", "getProductList", "Lretrofit2/Call;", "Lcom/aman/ecommerce/data/model/Products;", "app_debug"})
public abstract interface ApiInterface {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "v2/5def7b172f000063008e0aa2")
    public abstract retrofit2.Call<com.aman.ecommerce.data.model.Products> getProductList();
}