package org.fasttrackit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Game {

    private Adopter adopter;
    private Animal dog;
    private VeterinaryDoctor veterinaryDoctor;
    private List<FoodForAnimals> availableFood = new ArrayList<>();
    private List<RecreationalActivity> availableActivity = new ArrayList<>();

    public Game (Adopter adopter, Animal dog, VeterinaryDoctor veterinaryDoctor) {
        this.adopter = adopter;
        this.dog = dog;
        this.veterinaryDoctor = veterinaryDoctor;
    }

    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Animal getDog() {
        return dog;
    }

    public void setDog(Animal dog) {
        this.dog = dog;
    }

    public VeterinaryDoctor getVeterinaryDoctor() {
        return veterinaryDoctor;
    }

    public void setVeterinaryDoctor(VeterinaryDoctor veterinaryDoctor) {
        this.veterinaryDoctor = veterinaryDoctor;
    }

    private void initFood(){
        FoodForAnimals food1 = new FoodForAnimals("chicken meat", 1.25, 5, LocalDate.of(2019, 4, 23), true);
        FoodForAnimals food2 = new FoodForAnimals("Whiskas", 1.75, 7, LocalDate.of(2019, 5, 12), true);
        availableFood.add(food1);
        availableFood.add(food2);
    }

    private void initActivities(){
        RecreationalActivity activity1 = new RecreationalActivity("running");
        RecreationalActivity activity2 = new RecreationalActivity("sleeping");
        availableActivity.add(activity1);
        availableActivity.add(activity2);
    }

    public void start(){
        initFood();
        initActivities();
        printList();
    }

    private void printList(){
        System.out.println();
        for (int i = 0; i < availableFood.size(); i++)
            System.out.println(availableFood.get(i).getName());
        for (RecreationalActivity j: availableActivity) {
            System.out.println(j.getName());
        }
    }
}
