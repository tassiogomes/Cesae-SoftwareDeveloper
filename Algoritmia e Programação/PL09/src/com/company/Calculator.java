package com.company;

public class Calculator {

    // ATTRIBUTES
    private double number_1;
    private double number_2;


    // CONSTRUCTORS
    public Calculator() {
    }

    public Calculator(double number_1, double number_2) {               // two parameters
        this.number_1 = number_1;                                       // this call the attribute and insert in number variable
        this.number_2 = number_2;
    }


    // ENCAPSULING GETTERS AND SETTERS


    public double getNumber_1() {
        return number_1;
    }

    public void setNumber_1(double number_1) {
        this.number_1 = number_1;
    }

    public double getNumber_2() {
        return number_2;
    }

    public void setNumber_2(double number_2) {
        this.number_2 = number_2;
    }

    // METHODS

    public double Addition(){
        double addResult = (number_1 + number_2);
        return addResult;
    }

    public double Subtraction(){
        double subResult = (number_1 - number_2);
        return subResult;
    }

    public double Multiplication(){
        double multResult = (number_1 * number_2);
        return multResult;
    }

    public double Division(){
        double divResult = (number_1 / number_2);
        return divResult;
    }

    @Override
    public String toString() {
        return "Calculator{}";                          // return the class and it will be called in main
    }                                                   // System.out.printf("Addiction operation: %.2f\n",calculator.Addition();
}
