package org.fasttrackit;

public class Dog extends Animal {

    String breed;

    public Dog (String name, int age, int healthCondition, int levelOfHunger, FoodForAnimals nameOfFavoriteFood, RecreationalActivity nameOfFavoriteRecreationalActivity, String breed) {
        super(name, age, healthCondition, levelOfHunger, nameOfFavoriteFood, nameOfFavoriteRecreationalActivity);
        this.breed = breed;
    }
}
