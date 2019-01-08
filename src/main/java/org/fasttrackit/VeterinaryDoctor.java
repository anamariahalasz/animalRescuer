package org.fasttrackit;

public class VeterinaryDoctor extends Person {

    String specialization;

    public VeterinaryDoctor (String name, int age, String occupation, String specialization) {
        super(name,age,occupation);
        this.specialization = specialization;
    }
}
