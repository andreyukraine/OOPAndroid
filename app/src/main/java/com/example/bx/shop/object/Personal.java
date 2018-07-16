package com.example.bx.shop.object;

import com.example.bx.shop.inteface.ICashMashine;
import com.example.bx.shop.inteface.ICashier;
import com.example.bx.shop.inteface.ICategory;
import com.example.bx.shop.inteface.IPersonal;

public abstract class Personal implements IPersonal{

    private String name;
    private String function;
    private ICategory category;
    private Double salary;

    public Personal(String name, String function, Double salary, ICategory category) {
        this.name = name;
        this.function = function;
        this.salary = salary;
        this.category = category;
    }

    public Personal(String name, String function, Double salary) {
        this.name = name;
        this.function = function;
        this.salary = salary;
    }

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

    public ICategory getCategory() {
        return category;
    }

    public void setCategory(ICategory category) {
        this.category = category;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
