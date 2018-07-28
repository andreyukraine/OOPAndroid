package com.example.core.object;

import com.example.core.inteface.ICashMachine;
import com.example.core.inteface.ICheck;

public abstract class CashMashine implements ICashMachine {

    private static Integer number = 0;
    private String series_number;
    private static Integer count_check = 0;


    public CashMashine(String series_number) {
        this.series_number = series_number;
    }

    @Override
    public Integer getNumber() {
        return number;
    }

    @Override
    public void setNumber(Integer number) {
        CashMashine.number += number;

    }

    @Override
    public void setCount_check(Integer count_check) {
        CashMashine.count_check += count_check;
    }

    @Override
    public void Print(ICheck check) {
        System.out.println("Товарный чек №");
        for (int i = 0; i < check.getProducts().size(); i++) {
            System.out.println(i + " " + check.getProducts().get(i).getName());
        }
    }
}
