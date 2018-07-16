package com.example.bx.shop.object;

import com.example.bx.shop.equipment.Datex;
import com.example.bx.shop.inteface.IBasket;
import com.example.bx.shop.inteface.ICashMashine;
import com.example.bx.shop.inteface.ICashier;
import com.example.bx.shop.inteface.ICheck;
import com.example.bx.shop.inteface.IProduct;

import java.util.ArrayList;

public abstract class CashMashine implements ICashMashine{

    private static Integer number = 0;
    private String series_number;
    private static Integer count_check = 0;


    public CashMashine(String series_number) {
        this.series_number = series_number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        CashMashine.number += number;

    }

    public String getSeries_number() {
        return series_number;
    }

    public Integer getCount_check() {
        return count_check;
    }

    public void setCount_check(Integer count_check) {
        CashMashine.count_check += count_check;
    }

    public void Print(ICheck check){
        System.out.println("Товарный чек №");
        for (int i = 0; i < check.getProducts().size(); i++) {
            System.out.println(i + " " + check.getProducts().get(i).getName());
        }
    }
}
