package com.example.bx.shop.object;

import com.example.bx.shop.equipment.BasketSmall;
import com.example.bx.shop.inteface.IBasket;
import com.example.bx.shop.inteface.IClient;
import com.example.bx.shop.inteface.IPersonal;
import com.example.bx.shop.inteface.IProduct;

import java.util.ArrayList;

public abstract class Client implements IClient{

    String name;
    String phone;
    IPersonal sale;
    String status;

    public Client(String name, String phone, String status) {
        this.name = name;
        this.phone = phone;
        this.status = status;
    }

    public Client(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public IPersonal getSale() {
        return sale;
    }

    public void setSale(IPersonal sale) {
        this.sale = sale;
    }

    public void PutInBasket(IProduct product, Integer count, IBasket basket){
        basket.setProduct(product, count);
    }

}
