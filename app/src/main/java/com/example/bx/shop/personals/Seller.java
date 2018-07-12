package com.example.bx.shop.personals;

import com.example.bx.shop.object.Personal;

public class Seller extends Personal {

    String department = "продавец";

    public Seller(String name, String function, Double salary, String department) {
        super(name, function, salary);
        this.department = department;
    }
}
