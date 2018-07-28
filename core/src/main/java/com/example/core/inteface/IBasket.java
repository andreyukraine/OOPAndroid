package com.example.core.inteface;

import java.util.ArrayList;

public interface IBasket {

    void setProduct(IProduct product, Integer count);
    ICheck CashRegister(IBasket basket, ICashier cashier);
    ArrayList<IProduct> getProducts();
}
