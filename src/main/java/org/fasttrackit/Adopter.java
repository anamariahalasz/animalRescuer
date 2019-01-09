package org.fasttrackit;

public class Adopter extends Person {

    private double amountOfMoney;

    public Adopter (String name, int age, String occupation, double amountOfMoney) {
        super(name, age, occupation);
        this.amountOfMoney = amountOfMoney;
    }

    public double getAmountOfMoney(){
        return this.amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney){
        this.amountOfMoney = amountOfMoney;
    }
}
