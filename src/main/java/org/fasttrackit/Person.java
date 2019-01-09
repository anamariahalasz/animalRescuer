package org.fasttrackit;

public class Person {

    private String name;
    private int age;
    private String occupation;

    public Person (String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getOccupation(){
        return this.occupation;
    }

    public void setOccupation(String occupation){
        this.occupation = occupation;
    }

}
