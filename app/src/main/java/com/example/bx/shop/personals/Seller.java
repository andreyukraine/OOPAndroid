package com.example.bx.shop.personals;

import com.example.bx.shop.enums.Status;
import com.example.bx.shop.inteface.ICategory;
import com.example.bx.shop.inteface.IPersonal;
import com.example.bx.shop.object.Category;
import com.example.bx.shop.object.Personal;

public class Seller extends Personal{

    private String status = Status.FREE.toString();

    public Seller(String name, String function, Double salary, ICategory category) {
        super(name, function, salary, category);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
