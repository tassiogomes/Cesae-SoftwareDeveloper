package com.company;

public class Circle {

    // ****** ATTRIBUTES ******

    private double radius;
    private double pi = 3.14;


    // ****** CONSTRUCTORS ******

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    // ****** ENCAPSULATION GETTERS AND SETTERS ******

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }


    // ****** METHODS ******

    public double Area(){
        double circle_area  = pi * Math.pow(radius, 2);
        return circle_area;
    }

    public double Circunference(){
        double circle_circunference = 2*(pi*radius);
        return circle_circunference;
    }

    // ****** TO STRING ******

    @Override
    public String toString(){
        return String.format("Area = %.2f\n", Area())
                + String.format("Perimeter = %.2f\n", Circunference());

    }


}