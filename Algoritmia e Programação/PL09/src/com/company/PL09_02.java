package com.company;
import java.util.Scanner;

public class PL09_02 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // variables
        String name = "Frederico";
        String breed = "Bulldog";

        // instantiating the Dog object
        Dog dog1 = new Dog("Thorzinho Cachorro", "Bulldog");
        Dog dog2 = new Dog(name, breed);

        // user input
        System.out.println("Enter the name: ");
        String input_name = input.next();
        System.out.println("Enter the breed: ");
        String input_breed = input.next();

        Dog inputDog = new Dog(input_name, input_breed);  // instantiating a new object

        // print before changes
        System.out.println("Before changes");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(inputDog);
        System.out.println("--------------------------------------");


        // setter updating variables
        dog1.setName("Sarajane");
        dog1.setBreed("Dog Alemão");

        // print after changes
        System.out.println("After changes");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(inputDog);

    }
}
