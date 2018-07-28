package com.example.core.object;

import com.example.core.equipment.FiscalCheck;
import com.example.core.inteface.IBasket;
import com.example.core.inteface.ICashMachine;
import com.example.core.inteface.ICashier;
import com.example.core.inteface.ICheck;
import com.example.core.inteface.IClient;
import com.example.core.inteface.IProduct;

import java.util.ArrayList;

public abstract class Basket implements IBasket {

    private Double id;
    private ArrayList<IProduct> products = new ArrayList<IProduct>();
    private Double BasketAmount = 0.0;
    private IClient client;

    public Basket(IClient client) {
        this.id = Math.random();
        this.client = client;
    }

    @Override
    public void setProduct(IProduct product, Integer count) {

        product.setCountBuy(count);
        products.add(product);
        product.changeOfBalanceProduct(product);
        BasketAmount +=product.getPrice();
    }

    @Override
    public ArrayList<IProduct> getProducts() {
        return products;
    }


    @Override
    public ICheck CashRegister(IBasket basket, ICashier cashier){

        ICashMachine cashierMashine = cashier.getCashMachine();
        cashierMashine.setNumber(1);
        Integer check_number = cashierMashine.getNumber();
        ICheck check = new FiscalCheck(basket.getProducts(), cashier, cashierMashine);
        cashierMashine.Print(check);
        cashierMashine.setCount_check(1);

        return check;
    }


}
