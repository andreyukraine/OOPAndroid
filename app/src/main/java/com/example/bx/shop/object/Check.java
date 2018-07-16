package com.example.bx.shop.object;

import com.example.bx.shop.inteface.ICashMashine;
import com.example.bx.shop.inteface.ICashier;
import com.example.bx.shop.inteface.ICheck;
import com.example.bx.shop.inteface.IPersonal;
import com.example.bx.shop.inteface.IProduct;
import com.example.bx.shop.personals.Cashier;

import java.util.ArrayList;

public abstract class Check implements ICheck {


    private ArrayList<IProduct> products;
    private ICashMashine cashMashine;
    private ICashier cashier;

    public Check(ArrayList<IProduct> products, ICashier cashier, ICashMashine cashMashine) {
        this.products = products;
        this.cashier = cashier;
        this.cashMashine = cashMashine;
    }

    public ArrayList<IProduct> getProducts() {
        return products;
    }
}
