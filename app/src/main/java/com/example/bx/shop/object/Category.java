package com.example.bx.shop.object;

import com.example.bx.shop.enums.Status;
import com.example.bx.shop.inteface.ICategory;
import com.example.bx.shop.inteface.IPersonal;
import com.example.bx.shop.inteface.IProduct;
import com.example.bx.shop.personals.Seller;

import java.util.ArrayList;

public abstract class Category implements ICategory{

    private String name;
    private ArrayList<IProduct> products = new ArrayList<IProduct>();
    private ArrayList<IPersonal> sales = new ArrayList<IPersonal>();

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
        return sales;
    }

    public void setPersonals(ArrayList<IPersonal> personals) {
        this.sales = personals;
    }

    public void setProduct(IProduct product){
        products.add(product);
    }
    public void setPersonal(IPersonal sale){
        sales.add(sale);
    }
    public IPersonal freeSaler(IProduct product){
        for (int i = 0; i < sales.size() ; i++) {
            if (sales.get(i).getStatus() == Status.FREE.toString()) {
                //System.out.println(sales.get(i).getName());
                return sales.get(i);
            }
        }
        return null;
    }
}
