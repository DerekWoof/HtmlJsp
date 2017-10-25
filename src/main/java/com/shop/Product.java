package com.shop;

import java.math.BigDecimal;

public class Product {

    private static int ID_COUNTER = 0;
    private int id;
    private String description;
    private Money money;


    public Product(String description, BigDecimal value, String currency) {
        this.description = description;
        this.money = new Money(value,currency);
        id = ID_COUNTER++;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Money getMoney() {
        return money;
    }

    public BigDecimal getValue() {
        return money.getValue();
    }


}
