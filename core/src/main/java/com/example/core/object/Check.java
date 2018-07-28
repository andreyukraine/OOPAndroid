package com.example.core.object;

import com.example.core.inteface.ICashMachine;
import com.example.core.inteface.ICashier;
import com.example.core.inteface.ICheck;
import com.example.core.inteface.IProduct;

import java.util.ArrayList;

public abstract class Check implements ICheck {


    private ArrayList<IProduct> products;
    private ICashMachine cashMashine;
    private ICashier cashier;

    public Check(ArrayList<IProduct> products, ICashier cashier, ICashMachine cashMashine) {
        this.products = products;
        this.cashier = cashier;
        this.cashMashine = cashMashine;
    }

    @Override
    public ArrayList<IProduct> getProducts() {
        return products;
    }
}
