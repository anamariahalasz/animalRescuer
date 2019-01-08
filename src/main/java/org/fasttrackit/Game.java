package org.fasttrackit;

public class Game {

    Adopter adopter;
    Animal dog;
    VeterinaryDoctor veterinaryDoctor;

    public Game (Adopter adopter, Animal dog, VeterinaryDoctor veterinaryDoctor) {
        this.adopter = adopter;
        this.dog = dog;
        this.veterinaryDoctor = veterinaryDoctor;
    }

}
