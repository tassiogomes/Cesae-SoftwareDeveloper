package com.company;
import java.util.Scanner;

public class PL09_05 {

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    // instantiating the object Car
    Car emptyCar = new Car();
    Car fullCar = new Car("Mercedes", "4x4", 2023);

    // entering variable
    System.out.print("Enter the brand of the car: ");
    String brand = input.next();
    System.out.print("Enter the model of the car: ");
    String model = input.next();
    System.out.print("Enter the year of the car: ");
    int year = input.nextInt();
    Car inputCar = new Car(brand, model, year); // instantiating inputCar object


    // print
    System.out.println(emptyCar);
    System.out.println(fullCar);
    System.out.println(inputCar);

    emptyCar.turnOn();
    fullCar.turnOn();
    inputCar.turnOn();

    }
}
