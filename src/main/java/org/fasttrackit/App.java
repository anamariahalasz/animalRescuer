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

        Dog firstAnimal = new Dog("Oscar", 1, 8);

        Adopter firstAdopter = new Adopter("Jake", 29, "cop", 1000);

        VeterinaryDoctor firstVeterinaryDoctor = new VeterinaryDoctor("Julia", 32, "veterinary doctor", "epidemiology");

        Game firstGame = new Game(firstAdopter,firstAnimal,firstVeterinaryDoctor);

        firstAdopter.feedTheAnimal(firstAnimal, firstFoodForAnimals);
        firstAdopter.activityWithAnimal(firstAnimal,firstRecreationalActivity);

        Animal cat = new Animal ("Tom", 2, 9);

        firstAnimal.mood();
        cat.mood();
    }
}
