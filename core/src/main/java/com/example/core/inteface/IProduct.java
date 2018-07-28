package com.example.core.inteface;

public interface IProduct {
    Double getPrice();
    void setCountBuy(Integer countBuy);
    Integer getCountBuy();
    void changeOfBalanceProduct(IProduct product);
    String getName();
}
