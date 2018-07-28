package com.example.core.products;

import com.example.core.inteface.ICategory;
import com.example.core.object.Product;

public class Phone extends Product{

    public Phone(String name, ICategory category, Double price, Integer count) {
        super(name, category, price, count);
    }
}
