package com.example.core.object;

import com.example.core.category.Electronic;
import com.example.core.clients.ShopClient;
import com.example.core.enums.Status;
import com.example.core.enums.TypeClient;
import com.example.core.equipment.BasketSmall;
import com.example.core.equipment.Dates;
import com.example.core.inteface.IBasket;
import com.example.core.inteface.ICashMachine;
import com.example.core.inteface.ICategory;
import com.example.core.inteface.ICheck;
import com.example.core.inteface.IClient;
import com.example.core.inteface.IPersonal;
import com.example.core.inteface.IProduct;
import com.example.core.personals.Cashier;
import com.example.core.personals.Seller;
import com.example.core.products.Phone;

public class Shop {


    public void init() {
        /* TODO  include all object in shop */

        //создаем группу товара
        ICategory electornic = new Electronic();
        electornic.setName("MobilePhone");

        //создаем консультанта для категории товара
        IPersonal seller = new Seller("Ana", "sale", 400.00, electornic);
        IPersonal seller2 = new Seller("Genna", "sale", 400.00, electornic);
        seller2.setStatus(Status.NOT_FREE.toString());
        electornic.setPersonal(seller);
        electornic.setPersonal(seller2);

        //создаем кассовое место
        ICashMachine cashMashine = new Dates("111222333");
        Cashier cashier = new Cashier("Ulia", "продавец", cashMashine, 700.00);

        //создаем товары
        IProduct phone = new Phone("Samsung", electornic, 200.00, 15);
        IProduct phone2 = new Phone("IPhone", electornic, 100.00, 10);
        electornic.setProduct(phone);
        electornic.setProduct(phone2);

        //создаем простого покупателя
        IClient client = new ShopClient("Andrey", "0674682939", TypeClient.SIMPLE.name());

        //клиент берет товар который его интересует и тут ищем свободного консультанта
        IPersonal free_sale = electornic.freeSaber(phone2);
        client.setSale(free_sale);

        //клиент товар покупает
        IBasket basket = new BasketSmall(client);
        client.PutInBasket(phone, 1, basket);
        client.PutInBasket(phone2, 2, basket);

        //меняем статус у консультатнта
        free_sale.setStatus(Status.NOT_FREE.name());

        //покупает товар на кассе
        ICheck check = basket.CashRegister(basket, cashier);
        basket = null;

        System.out.println("Спасибо за покупку");
    }
}
