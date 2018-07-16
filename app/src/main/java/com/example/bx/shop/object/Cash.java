package com.example.bx.shop.object;

import com.example.bx.shop.inteface.ICashMashine;
import com.example.bx.shop.inteface.ICashier;
import com.example.bx.shop.inteface.ICategory;

public abstract class Cash implements ICashier {

    private String name;
    private String function;
    private ICashMashine cashMashine;
    private Double salary;

    public Cash(String name, String function, ICashMashine cashMashine, Double salary) {
        this.name = name;
        this.function = function;
        this.cashMashine = cashMashine;
        this.salary = salary;
    }

    public ICashMashine getCashMashine() {
        return cashMashine;
    }
}
