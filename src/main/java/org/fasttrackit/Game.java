package org.fasttrackit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Adopter adopter;
    private Animal animal;
    private VeterinaryDoctor veterinaryDoctor;
    private List<FoodForAnimals> availableFood = new ArrayList<>();
    private List<RecreationalActivity> availableActivity = new ArrayList<>();

    public Game () {
    }

    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
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
        initAnimal();
        initAdopter();
        String action = "";
        int nrOfRounds = 5;
        System.out.println("Level of hunger: " + animal.getLevelOfHunger());
        System.out.println("Level of happiness: " + animal.getHappinessLevel());
        while(--nrOfRounds >= 0 && !action.equals("exit")){
            action = getAction();
            animal.setLevelOfHunger(animal.getLevelOfHunger() + 1);
            animal.setHappinessLevel(animal.getHappinessLevel() - 1);

            if (action.equals("feed"))
                requireFeeding();
            else
                if (action.equals("activity"))
                    requireActivity();
                else{
                    System.out.println("Please select another action.");
                    nrOfRounds++;
                }
            if (animal.getLevelOfHunger() >= 4) {
                System.out.println("The poor animal died!");
                nrOfRounds = -1;
            }
            if (animal.getHappinessLevel() <= 0) {
                System.out.println("The poor animal died!");
                nrOfRounds = -1;
            }
            if (animal.getLevelOfHunger() < 0){
                animal.setLevelOfHunger(0);
                System.out.println("The animal cannot eat more food.");
            }
            System.out.println("Level of hunger: " + animal.getLevelOfHunger());
            System.out.println("Level of happiness: " + animal.getHappinessLevel());
        }
        System.out.println("Congratulation! The game is over!");
    }

    private void printList(){
        System.out.println();
        for (int i = 0; i < availableFood.size(); i++)
            System.out.println(availableFood.get(i).getName());
        for (RecreationalActivity j: availableActivity) {
            System.out.println(j.getName());
        }
    }

    private void initAnimal(){
        String type = getAnimalFromUser();
        if(type.equals("dog")) {
            animal = new Dog();
            ((Dog) animal).createDog();
        }
        else{
            animal = new Animal();
            animal.createAnimal();
        }
        animal.setNameOfFavoriteFood("chicken meat");
        animal.setNameOfFavoriteRecreationalActivity("running");
        animal.setLevelOfHunger(1);
        animal.setHappinessLevel(4);
    }

    private String getAnimalFromUser() {
        System.out.println("Please enter animal: ");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        System.out.println("Your animal is: " + type);
        return type;
    }

    private void initAdopter(){
        try {
            String name = getAdopterNameFromUser();
            adopter = new Adopter(name,1000);
        }catch (Exception e){
            System.out.println("The name cannot be processed.");
            initAdopter();
        }
    }

    private String getAdopterNameFromUser() throws Exception {
        String name;
        System.out.println("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Your name is: " + name);

        if (!name.equals(name.replaceAll("[*0-9]", "")) || name.equals(""))
            throw new Exception("Expected an integer number.");
        return name;
    }

    private void requireFeeding(){
        String food = "";
        String selectedFood;
        for (int i = 0; i < availableFood.size(); i++)
            food += availableFood.get(i).getName() + " ";
        System.out.println("Please select the food from the list: " + food);
        Scanner scanner = new Scanner(System.in);
        selectedFood = scanner.nextLine();
        if(!selectedFood.equals("")){
            System.out.println("Your selected food is: " + selectedFood);
            adopter.feedTheAnimal(animal, new FoodForAnimals(selectedFood));
        }
    }

    private void requireActivity(){
        String activity = "";
        String selectedActivity;
        for (int i = 0; i < availableActivity.size(); i++)
            activity += availableActivity.get(i).getName() + ", ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select the activity from the list: " + activity);
        selectedActivity = scanner.nextLine();
        if(!selectedActivity.equals("")){
            System.out.println("Your selected activity is: " + selectedActivity);
            adopter.activityWithAnimal(animal, new RecreationalActivity(selectedActivity));
        }
    }

    private String getAction() {
        System.out.println("Please select one action between feed the animal or do some recreational activity or exit");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        return action;
    }

}
