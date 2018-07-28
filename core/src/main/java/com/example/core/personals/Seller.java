package com.example.core.personals;

import com.example.core.enums.Status;
import com.example.core.inteface.ICategory;
import com.example.core.object.Personal;

public class Seller extends Personal{

    private String status = Status.FREE.toString();

    public Seller(String name, String function, Double salary, ICategory category) {
        super(name, function, salary, category);
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

}
