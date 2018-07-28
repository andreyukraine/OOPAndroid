package com.example.core.inteface;

public interface ICategory {
    void setName(String name);
    void setProduct(IProduct product);
    void setPersonal(IPersonal sale);
    IPersonal freeSaber(IProduct product);
}
