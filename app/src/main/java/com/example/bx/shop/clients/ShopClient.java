package com.example.bx.shop.clients;

import com.example.bx.shop.enums.TypeClient;
import com.example.bx.shop.inteface.IClient;
import com.example.bx.shop.inteface.IPersonal;
import com.example.bx.shop.inteface.IProduct;
import com.example.bx.shop.object.Client;

public class ShopClient extends Client{

    public ShopClient(String name, String phone, String status) {
        super(name, phone, status);
    }
}
