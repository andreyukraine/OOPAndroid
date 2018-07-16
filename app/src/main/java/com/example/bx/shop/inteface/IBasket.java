package com.example.bx.shop.inteface;

import com.example.bx.shop.object.Client;

import java.util.ArrayList;

public interface IBasket {

    void setProduct(IProduct product, Integer count);
    ICheck CashRegister(IBasket basket, ICashier cashier);
    ArrayList<IProduct> getProducts();
}
