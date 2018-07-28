package com.example.core.object;

import com.example.core.inteface.ICategory;
import com.example.core.inteface.IProduct;

public abstract class Product implements IProduct {

    private String name;
    private ICategory category;
    private Double price;
    private Integer count;
    private Integer countBuy;

    public Product(String name, ICategory category, Double price, Integer count) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.count = count;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public Integer getCountBuy() {
        return countBuy;
    }

    @Override
    public void setCountBuy(Integer countBuy) {
        this.countBuy = countBuy;
    }

    private void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public void changeOfBalanceProduct(IProduct product) {
        Integer all_count = count - product.getCountBuy();
        setCount(all_count);
    }
}
