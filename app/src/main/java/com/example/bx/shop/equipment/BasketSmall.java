package com.example.bx.shop.equipment;

import com.example.bx.shop.inteface.IBasket;
import com.example.bx.shop.inteface.IClient;
import com.example.bx.shop.inteface.IProduct;
import com.example.bx.shop.object.Basket;
import com.example.bx.shop.object.Client;

import java.util.ArrayList;

public class BasketSmall extends Basket {

    public BasketSmall(IClient client) {
        super(client);
    }
}
