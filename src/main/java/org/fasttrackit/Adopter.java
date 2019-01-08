package org.fasttrackit;

public class Adopter extends Person {

    double amountOfMoney;

    public Adopter (String name, int age, String occupation, double amountOfMoney) {
        super(name, age, occupation);
        this.amountOfMoney = amountOfMoney;
    }

}
