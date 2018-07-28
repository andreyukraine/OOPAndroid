package com.example.core.object;


import com.example.core.inteface.IBasket;
import com.example.core.inteface.IClient;
import com.example.core.inteface.IPersonal;
import com.example.core.inteface.IProduct;

public abstract class Client implements IClient {

    private String name;
    private String phone;
    private IPersonal sale;
    private String status;

    public Client(String name, String phone, String status) {
        this.name = name;
        this.phone = phone;
        this.status = status;
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

    @Override
    public void setSale(IPersonal sale) {
        this.sale = sale;
    }

    @Override
    public void PutInBasket(IProduct product, Integer count, IBasket basket) {
        basket.setProduct(product, count);
    }

}
