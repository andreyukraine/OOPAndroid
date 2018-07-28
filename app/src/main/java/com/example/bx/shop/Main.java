package com.example.bx.shop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.bx.shop.dbconnect.SQLite;
import com.example.core.dbase.DBConnect;
import com.example.core.enums.ConnectionDB;

import java.io.IOException;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Thread(){
            public void run(){

                    SQLite.initConnection(getApplicationContext());

            }
        }.start();



        setContentView(R.layout.activity_main);
    }
}
