package org.fasttrackit;

public class Game {

    private Adopter adopter;
    private Animal dog;
    private VeterinaryDoctor veterinaryDoctor;

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
}
