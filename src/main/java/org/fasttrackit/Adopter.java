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

    public void feedTheAnimal(Animal animal,FoodForAnimals foodForAnimals) {
        System.out.println(this.getName() + " just gave some " + foodForAnimals.getName() + " food to " + animal.getName());
    }

    public void activityWithAnimal (Animal animal,RecreationalActivity recreationalActivity) {
        System.out.println(this.getName() + " " + recreationalActivity.getName() + " with " + animal.getName());
    }
}
