package com.example.bx.shop.object;

import com.example.bx.shop.category.Electornic;
import com.example.bx.shop.personals.Cashier;
import com.example.bx.shop.personals.Director;
import com.example.bx.shop.personals.Seller;
import com.example.bx.shop.products.Phone;

import java.util.ArrayList;

public class Shop {


    public void init(){
        /* TODO  include all object in shop */
        ArrayList products = new ArrayList();
        ArrayList sales = new ArrayList();
        Electornic electornic = new Electornic();
        electornic.setName("MobilePhone");
        Director director = new Director("Andrey","director", 5000.00, electornic);
        Seller seller = new Seller("Ana","sale", 400.00,electornic);
        sales.add(seller);
        Cashier cashier = new Cashier("Ulia","продавец",700.00,electornic);
        Phone phone = new Phone("Samsung",electornic,200.00f);
        products.add(phone);
        electornic.setProducts(products);
        electornic.setPersonals(sales);
        CashMashine cashMashine = new CashMashine("111222333", 0);
    }
}
