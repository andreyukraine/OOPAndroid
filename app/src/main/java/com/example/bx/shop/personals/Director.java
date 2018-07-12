package com.example.bx.shop.personals;

import com.example.bx.shop.object.Personal;

public class Director extends Personal{

    String department = "директор";

    public Director(String name, String function, Double salary, String department) {
        super(name, function, salary);
        this.department = department;
    }


}
