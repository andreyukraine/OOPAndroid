package com.example.bx.shop.personals;

import com.example.bx.shop.inteface.IPersonal;
import com.example.bx.shop.object.Category;
import com.example.bx.shop.object.Personal;

public class Cashier extends Personal{

    public Cashier(String name, String function, Double salary, Category category) {
        super(name, function, salary, category);
    }
}
