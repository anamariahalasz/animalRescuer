package org.fasttrackit;


import java.time.LocalDate;

public class FoodForAnimals {

    String name;
    double price;
    int quantity;
    LocalDate expirationDate;
    boolean stock;

    public FoodForAnimals (String name, double price, int quantity, LocalDate expirationDate, boolean stock) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.stock = stock;
    }

}
