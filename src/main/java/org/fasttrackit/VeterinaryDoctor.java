package org.fasttrackit;

public class VeterinaryDoctor extends Person {

    private String specialization;

    public VeterinaryDoctor (String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
