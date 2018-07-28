package com.example.core.object;

import com.example.core.inteface.ICategory;
import com.example.core.inteface.IPersonal;

public abstract class Personal implements IPersonal{

    private String name;
    private String function;
    private Double salary;
    private ICategory category;

    public Personal(String name, String function, Double salary, ICategory category) {
        this.name = name;
        this.function = function;
        this.salary = salary;
        this.category = category;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

}
