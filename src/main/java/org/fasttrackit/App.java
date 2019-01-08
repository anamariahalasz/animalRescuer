package org.fasttrackit;


import java.time.LocalDate;

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
        firstFoodForAnimals.expirationDate = LocalDate.of(2019, 4, 23);
        firstFoodForAnimals.stock = true;

        RecreationalActivity firstRecreationalActivity = new RecreationalActivity();
        firstRecreationalActivity.name = "running";

        Dog firstAnimal = new Dog();
        firstAnimal.name = "Oscar";
        firstAnimal.age = 1;
        firstAnimal.healthCondition = 8;
        firstAnimal.levelOfHunger = 3;
        firstAnimal.nameOfFavoriteFood = firstFoodForAnimals;
        firstAnimal.nameOfFavoriteRecreationalActivity = firstRecreationalActivity;
        firstAnimal.breed = "Golden Retriever";

        Adopter firstAdopter = new Adopter();
        firstAdopter.name = "Jake";
        firstAdopter.amountOfMoney = 1000;
        firstAdopter.age = 29;
        firstAdopter.occupation = "cop";

        VeterinaryDoctor firstVeterinaryDoctor = new VeterinaryDoctor();
        firstVeterinaryDoctor.name = "Julia";
        firstVeterinaryDoctor.specialization = "epidemiology";
        firstVeterinaryDoctor.age = 32;
        firstVeterinaryDoctor.occupation = "veterinary doctor";

        Game firstGame = new Game();
        firstGame.adopter = firstAdopter;
        firstGame.dog = firstAnimal;
        firstGame.veterinaryDoctor = firstVeterinaryDoctor;

    }
}
