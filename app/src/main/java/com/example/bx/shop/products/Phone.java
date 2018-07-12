package com.example.bx.shop.products;

import com.example.bx.shop.inteface.IProduct;
import com.example.bx.shop.object.Category;
import com.example.bx.shop.object.Product;

public class Phone extends Product{
    public Phone(String name, Category category, Float price) {
        super(name, category, price);
    }
}
