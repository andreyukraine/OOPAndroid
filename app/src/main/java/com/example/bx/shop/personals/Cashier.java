package com.example.bx.shop.personals;

import com.example.bx.shop.object.Personal;

public class Cashier extends Personal{

    String department = "кассир";

    public Cashier(String name, String function, Double salary) {
        super(name, function, salary);
    }
}
