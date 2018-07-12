package com.example.bx.shop.clients;

import com.example.bx.shop.inteface.IClient;
import com.example.bx.shop.object.Client;

public class SimpleClient extends Client{

    String status = "simple";

    public SimpleClient(String name, Integer phone, String status) {
        super(name, phone);
        this.status = status;
    }
}
