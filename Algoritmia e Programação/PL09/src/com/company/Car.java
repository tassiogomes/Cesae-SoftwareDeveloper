package com.company;

public class Car {


    // ATTRIBUTES
    private String brand, model;
    private int year;
    private double power, displacements, liters_100km;



    // CONSTRUCTORS
    public Car(){

    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;

    }


    // ENCAPSULATING GETTERS AND SETTERS

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    // METHODS

    public void turnOn(){
        System.out.println("The car is on");
    }


    // TO STRING
    @Override
    public String toString(){
        return String.format("Brand = %s\n Model = %s\n Year = %d\n", this.brand, this.model, this.year);

    }
}
