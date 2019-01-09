package org.fasttrackit;

public class Animal {

    private String name;
    private int age;
    private int healthCondition;
    private int levelOfHunger;
    private FoodForAnimals nameOfFavoriteFood;
    private RecreationalActivity nameOfFavoriteRecreationalActivity;

    public Animal (String name, int age, int healthCondition, int levelOfHunger, FoodForAnimals nameOfFavoriteFood, RecreationalActivity nameOfFavoriteRecreationalActivity) {
        this.name = name;
        this.age = age;
        this.healthCondition = healthCondition;
        this.levelOfHunger = levelOfHunger;
        this.nameOfFavoriteFood = nameOfFavoriteFood;
        this.nameOfFavoriteRecreationalActivity = nameOfFavoriteRecreationalActivity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(int healthCondition) {
        this.healthCondition = healthCondition;
    }

    public int getLevelOfHunger() {
        return levelOfHunger;
    }

    public void setLevelOfHunger(int levelOfHunger) {
        this.levelOfHunger = levelOfHunger;
    }

    public FoodForAnimals getNameOfFavoriteFood() {
        return nameOfFavoriteFood;
    }

    public void setNameOfFavoriteFood(FoodForAnimals nameOfFavoriteFood) {
        this.nameOfFavoriteFood = nameOfFavoriteFood;
    }

    public RecreationalActivity getNameOfFavoriteRecreationalActivity() {
        return nameOfFavoriteRecreationalActivity;
    }

    public void setNameOfFavoriteRecreationalActivity(RecreationalActivity nameOfFavoriteRecreationalActivity) {
        this.nameOfFavoriteRecreationalActivity = nameOfFavoriteRecreationalActivity;
    }
}
