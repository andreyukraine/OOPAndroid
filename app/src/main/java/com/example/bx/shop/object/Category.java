package com.example.bx.shop.object;

import com.example.bx.shop.inteface.ICategory;
import com.example.bx.shop.inteface.IPersonal;
import com.example.bx.shop.inteface.IProduct;

import java.util.ArrayList;

public abstract class Category implements ICategory{

    String name;
    private ArrayList<IProduct> products;
    private ArrayList<IPersonal> personals;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<IProduct> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<IProduct> products) {
        this.products = products;
    }

    public ArrayList<IPersonal> getPersonals() {
        return personals;
    }

    public void setPersonals(ArrayList<IPersonal> personals) {
        this.personals = personals;
    }
}
