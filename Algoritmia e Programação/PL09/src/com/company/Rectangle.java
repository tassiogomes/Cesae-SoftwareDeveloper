package com.company;

public class Rectangle {

    // ATTRIBUTES
    public double width;
    public double height;

/* -------------------------------------------------------*/

    // CONSTRUCTORS
    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

/* -------------------------------------------------------*/

    // ENCAPSULING GETTERS AND SETTERS
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // METHODS
    public double Area(){
        double rectangle_area = (width * height);
        return rectangle_area;
    }

    public double Perimeter(){
        double rectangle_perimeter = 2 * (Area());
        return rectangle_perimeter;
    }

/* -------------------------------------------------------*/

    // TO STRING
    @Override
    public String toString(){
        return String.format("Area = %.2f\n", Area())
                + String.format("Perimeter = %.2f\n", Perimeter());
    }
}

