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

        FoodForAnimals firstFoodForAnimals = new FoodForAnimals("chicken meat", 1.25, 5, LocalDate.of(2019, 4, 23), true);

        RecreationalActivity firstRecreationalActivity = new RecreationalActivity("running");

        Dog firstAnimal = new Dog("Oscar", 1, 8, 3, firstFoodForAnimals, firstRecreationalActivity, "Golden Retriever");

        Adopter firstAdopter = new Adopter("Jake", 29, "cop", 1000);

        VeterinaryDoctor firstVeterinaryDoctor = new VeterinaryDoctor("Julia", 32, "veterinary doctor", "epidemiology");

        Game firstGame = new Game(firstAdopter,firstAnimal,firstVeterinaryDoctor);

    }
}
