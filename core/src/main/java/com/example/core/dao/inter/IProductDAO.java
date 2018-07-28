package com.example.core.dao.inter;

import com.example.core.inteface.IProduct;

import java.util.List;

public interface IProductDAO<T>  extends IGeneralDAO<T>{
    List<T> getAllProduct();
    T FindById(long id);
}
