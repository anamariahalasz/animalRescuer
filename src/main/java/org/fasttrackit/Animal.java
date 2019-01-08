package org.fasttrackit;

public class Animal {

    String name;
    int age;
    int healthCondition;
    int levelOfHunger;
    FoodForAnimals nameOfFavoriteFood;
    RecreationalActivity nameOfFavoriteRecreationalActivity;

    public Animal (String name, int age, int healthCondition, int levelOfHunger, FoodForAnimals nameOfFavoriteFood, RecreationalActivity nameOfFavoriteRecreationalActivity) {
        this.name = name;
        this.age = age;
        this.healthCondition = healthCondition;
        this.levelOfHunger = levelOfHunger;
        this.nameOfFavoriteFood = nameOfFavoriteFood;
        this.nameOfFavoriteRecreationalActivity = nameOfFavoriteRecreationalActivity;
    }
}
