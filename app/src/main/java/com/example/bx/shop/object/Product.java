package com.example.bx.shop.object;

import com.example.bx.shop.inteface.ICategory;
import com.example.bx.shop.inteface.IProduct;

public abstract class Product implements IProduct{

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCountBuy() {
        return countBuy;
    }

    public void setCountBuy(Integer countBuy) {
        this.countBuy = countBuy;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void changeOfBalanceProduct(IProduct product){
        Integer all_count = count - product.getCountBuy();
        setCount(all_count);
    }
}
