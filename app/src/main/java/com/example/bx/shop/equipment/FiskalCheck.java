package com.example.bx.shop.equipment;

import com.example.bx.shop.inteface.IBasket;
import com.example.bx.shop.inteface.ICashMashine;
import com.example.bx.shop.inteface.ICashier;
import com.example.bx.shop.inteface.IPersonal;
import com.example.bx.shop.inteface.IProduct;
import com.example.bx.shop.object.Check;
import com.example.bx.shop.object.Product;

import java.util.ArrayList;

public class FiskalCheck extends Check {
    public FiskalCheck(ArrayList<IProduct> products, ICashier cashier, ICashMashine cashMashine) {
        super(products, cashier, cashMashine);
    }


}
