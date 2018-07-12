package com.example.bx.shop.object;

import com.example.bx.shop.personals.Cashier;
import com.example.bx.shop.personals.Director;
import com.example.bx.shop.products.Phone;

public class Shop {


    public void init(){
        /* TODO  include all object in shop */
        Director director = new Director("Andrey","director", 5000.00, "Администрация");
        Cashier cashier = new Cashier("Ulia","продавец",700.00);
        Phone phone = new Phone("Samsung","Phone",200.00f);
        CashMashine cashMashine = new CashMashine("111222333", 0);
    }
}
