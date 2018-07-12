package com.example.bx.shop.object;

import com.example.bx.shop.inteface.IClient;

public class Client implements IClient{

    String name;
    Integer phone;
    String status;

    public Client(String name, Integer phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
