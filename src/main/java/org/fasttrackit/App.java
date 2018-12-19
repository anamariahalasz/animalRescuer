package org.fasttrackit;


import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        FoodForAnimals firstFoodForAnimals = new FoodForAnimals();
        firstFoodForAnimals.name = "chicken meat";
        firstFoodForAnimals.price = 1.25;
        firstFoodForAnimals.quantity = 5;
        firstFoodForAnimals.expirationDate = LocalDateTime.of(2019, 4, 23, 0, 0);
        firstFoodForAnimals.stock = true;

        RecreationalActivity firstRecreationalActivity = new RecreationalActivity();
        firstRecreationalActivity.name = "running";

        Animal firstAnimal = new Animal();
        firstAnimal.name = "Oscar";
        firstAnimal.age = 1;
        firstAnimal.healthCondition = 8;
        firstAnimal.levelOfHunger = 3;
        firstAnimal.nameOfFavoriteFood = firstFoodForAnimals;
        firstAnimal.nameOfFavoriteRecreationalActivity = firstRecreationalActivity;

        Adopter firstAdopter = new Adopter();
        firstAdopter.name = "Jake";
        firstAdopter.amountOfMoney = 1000;

        VeterinaryDoctor firstVeterinaryDoctor = new VeterinaryDoctor();
        firstVeterinaryDoctor.name = "Julia";
        firstVeterinaryDoctor.specialization = "epidemiology";

        Game firstGame = new Game();
        firstGame.adopter = firstAdopter;
        firstGame.dog = firstAnimal;
        firstGame.veterinaryDoctor = firstVeterinaryDoctor;

    }
}
