package com.example.bx.shop.products;

import com.example.bx.shop.inteface.ICategory;
import com.example.bx.shop.inteface.IProduct;
import com.example.bx.shop.object.Category;
import com.example.bx.shop.object.Product;

public class Phone extends Product{

    public Phone(String name, ICategory category, Double price, Integer count) {
        super(name, category, price, count);
    }
}
