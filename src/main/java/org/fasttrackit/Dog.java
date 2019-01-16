package org.fasttrackit;

public class Dog extends Animal {

    private String breed;

    public Dog (String name, int age, int healthCondition) {
        super(name, age, healthCondition);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void mood() {
        System.out.println("The dog wags his tail.");
    }
}
