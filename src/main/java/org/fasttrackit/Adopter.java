package org.fasttrackit;

public class Adopter extends Person {

    private double amountOfMoney;

    public Adopter (String name, double amountOfMoney) {
        super(name);
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

        //System.out.println(animal.getName() + " Level of hunger: " + animal.getLevelOfHunger());
        animal.setLevelOfHunger(animal.getLevelOfHunger() - 2);
       // System.out.println(animal.getName() + " New level of hunger: " + animal.getLevelOfHunger());
        if(animal.getNameOfFavoriteFood().equals(foodForAnimals.getName()))
            animal.setHappinessLevel(animal.getHappinessLevel() + 1);
    }

    public void activityWithAnimal (Animal animal,RecreationalActivity recreationalActivity) {
        System.out.println(this.getName() + " " + recreationalActivity.getName() + " with " + animal.getName());

        //System.out.println(animal.getName() + " Happiness level: " + animal.getHappinessLevel());
        if (animal.getNameOfFavoriteRecreationalActivity().equals(recreationalActivity.getName()) )
            animal.setHappinessLevel(animal.getHappinessLevel() + 3);
        else
            animal.setHappinessLevel(animal.getHappinessLevel() + 2);

        //System.out.println(animal.getName() + " New happiness level: " + animal.getHappinessLevel());


    }
}
