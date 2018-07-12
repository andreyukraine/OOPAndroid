package com.example.bx.shop.object;

import com.example.bx.shop.inteface.ICategory;
import com.example.bx.shop.inteface.IProduct;

public abstract class Product implements IProduct{

    String name;
    ICategory category;
    Float price;

    public Product(String name, ICategory category, Float price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ICategory getCategory() {
        return category;
    }

    public void setCategory(ICategory category) {
        this.category = category;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
