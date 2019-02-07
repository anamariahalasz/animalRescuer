package org.fasttrackit;

import java.util.Scanner;

public class Dog extends Animal {

    private String breed;

    public Dog (String name, int age, int healthCondition) {
        super(name, age, healthCondition);
        this.breed = breed;
    }

    public Dog() {
        super();
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

    public void createDog(){
        super.createAnimal();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the breed: ");
        this.breed = scanner.nextLine();
        System.out.println("Your animal's breed name is: " + this.breed);
    }
}
