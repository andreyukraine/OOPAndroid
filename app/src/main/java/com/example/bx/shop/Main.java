package com.example.bx.shop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.bx.shop.dbconnect.SQLite;
import com.example.core.object.Shop;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Thread(){
            public void run(){

                    SQLite.initConnection(getApplicationContext());
                    Shop shop = new Shop();
                    shop.init();
            }
        }.start();



        setContentView(R.layout.activity_main);
    }
}
