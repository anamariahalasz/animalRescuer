package org.fasttrackit;

public class Animal {

    private String name;
    private int age;
    private int healthCondition;
    private int levelOfHunger;
    private String nameOfFavoriteFood;
    private String nameOfFavoriteRecreationalActivity;

    public Animal (String name, int age, int healthCondition) {
        this.name = name;
        this.age = age;
        this.healthCondition = healthCondition;
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

    public String getNameOfFavoriteFood() {
        return nameOfFavoriteFood;
    }

    public void setNameOfFavoriteFood(String nameOfFavoriteFood) {
        this.nameOfFavoriteFood = nameOfFavoriteFood;
    }

    public String getNameOfFavoriteRecreationalActivity() {
        return nameOfFavoriteRecreationalActivity;
    }

    public void setNameOfFavoriteRecreationalActivity(String nameOfFavoriteRecreationalActivity) {
        this.nameOfFavoriteRecreationalActivity = nameOfFavoriteRecreationalActivity;
    }

    public void mood () {
        System.out.println("Happy animal.");
    }
}
