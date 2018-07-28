package com.example.core.dao.impls;

import com.example.core.dao.inter.IGeneralDAO;

public class GeneralDAO<T> implements IGeneralDAO<T>{

    //методы CRUD
    //create
    //read
    //updete
    //delete

    public boolean create(T object){
        //запись в базу
        return true;
    }

    public T read(T object){
        //читаем из базы
        return object;
    }

    public boolean update(T object){
        //обновляем значения
        return true;
    }

    public boolean delete(T object){
        //удаляем значения
        return true;
    }

}
