package com.example.bx.shop.object;

import com.example.bx.shop.inteface.ICashMashine;
import com.example.bx.shop.inteface.ICheck;
import com.example.bx.shop.inteface.IPersonal;
import com.example.bx.shop.inteface.IProduct;
import com.example.bx.shop.personals.Cashier;

import java.util.ArrayList;

public class Check implements ICheck {
    Integer number;
    ArrayList<IProduct> products;
    ICashMashine cashMashine;
    IPersonal equipment;

}
