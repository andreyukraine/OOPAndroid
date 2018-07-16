package com.example.bx.shop.inteface;

import java.util.ArrayList;

public interface ICategory {
    void setName(String name);
    void setProduct(IProduct product);
    void setPersonal(IPersonal sale);
    IPersonal freeSaler(IProduct product);
}
