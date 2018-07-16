package com.example.bx.shop.inteface;

import com.example.bx.shop.object.Product;

public interface IProduct {
    Double getPrice();
    void setCountBuy(Integer countBuy);
    Integer getCountBuy();
    void changeOfBalanceProduct(IProduct product);
    String getName();
}
