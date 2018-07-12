package com.example.bx.shop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.bx.shop.object.Shop;

public class Start extends AppCompatActivity {

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.init();
    }
}
