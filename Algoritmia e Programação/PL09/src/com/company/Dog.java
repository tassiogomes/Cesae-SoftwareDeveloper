package com.company;

public class Dog {

    // VARIABLES
    private String name;
    private String breed;


    // CONSTRUCTORS
    public Dog(){   // empty constructor

    }

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
/*---------------------------------------------------*/

    // GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    /*---------------------------------------------------*/

    // METHODS

    public void bark(){
        System.out.println("Au Au");
    }

/*---------------------------------------------------*/

    //TO STRING
    @Override
    public String toString(){
        return String.format("Name: %s\n Breed: %s", getName(), getBreed());
    }

}
