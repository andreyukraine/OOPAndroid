package com.example.bx.shop.object;

import com.example.bx.shop.inteface.ICashMashine;
import com.example.bx.shop.inteface.IProduct;

import java.util.ArrayList;

public class CashMashine implements ICashMashine{

    String series_number;
    Integer count_check;
    ArrayList<IProduct> products;

    public ArrayList<IProduct> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<IProduct> products) {
        this.products = products;
    }

    public CashMashine(String series_number, Integer count_check) {
        this.series_number = series_number;
        this.count_check = count_check;
    }

    public String getSeries_number() {
        return series_number;
    }

    public void setSeries_number(String series_number) {
        this.series_number = series_number;
    }

    public Integer getCount_check() {
        return count_check;
    }

    public void setCount_check(Integer count_check) {
        this.count_check = count_check;
    }
}
