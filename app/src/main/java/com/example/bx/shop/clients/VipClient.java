package com.example.bx.shop.clients;
import com.example.bx.shop.object.Client;

public class VipClient extends Client {

    String status = "vip";

    public VipClient(String name, Integer phone, String status) {
        super(name, phone);
        this.status = status;
    }
}
