package com.example.bx.shop.object;

import com.example.bx.shop.equipment.FiskalCheck;
import com.example.bx.shop.inteface.IBasket;
import com.example.bx.shop.inteface.ICashMashine;
import com.example.bx.shop.inteface.ICashier;
import com.example.bx.shop.inteface.ICheck;
import com.example.bx.shop.inteface.IClient;
import com.example.bx.shop.inteface.IPersonal;
import com.example.bx.shop.inteface.IProduct;

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

    public void setProduct(IProduct product, Integer count) {

        product.setCountBuy(count);
        products.add(product);
        product.changeOfBalanceProduct(product);
        BasketAmount +=product.getPrice();
    }

    public ArrayList<IProduct> getProducts() {
        return products;
    }


    public ICheck CashRegister(IBasket basket, ICashier cashier){

        ICashMashine cashierMashine = cashier.getCashMashine();
        cashierMashine.setNumber(1);
        Integer check_number = cashierMashine.getNumber();
        ICheck check = new FiskalCheck(basket.getProducts(), cashier, cashierMashine);
        cashierMashine.Print(check);
        cashierMashine.setCount_check(1);

        return check;
    }


}
