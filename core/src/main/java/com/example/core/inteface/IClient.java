package com.example.core.inteface;

public interface IClient {
    void PutInBasket(IProduct product, Integer count, IBasket basket);
    void setSale(IPersonal sale);
}
