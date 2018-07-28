package com.example.core.object;

import com.example.core.inteface.ICashMachine;
import com.example.core.inteface.ICashier;

public abstract class Cash implements ICashier {

    private String name;
    private String function;
    private ICashMachine cashMashine;
    private Double salary;

    public Cash(String name, String function, ICashMachine cashMashine, Double salary) {
        this.name = name;
        this.function = function;
        this.cashMashine = cashMashine;
        this.salary = salary;
    }

    @Override
    public ICashMachine getCashMachine() {
        return cashMashine;
    }
}
