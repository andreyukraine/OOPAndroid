package com.example.bx.shop.inteface;

import com.example.bx.shop.object.Product;

public interface IClient {
    void PutInBasket(IProduct product, Integer count, IBasket basket);
    void setSale(IPersonal sale);
}
