package com.company;
import java.util.Scanner;

public class PL09_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // instantiating the object Circle manually
        Circle emptyCircle = new Circle();
        Circle fullCircle = new Circle(2.3);


        // input variables
        System.out.print("Enter the radius of the circle: ");
        int radius = input.nextInt();
        Circle inputCircle = new Circle(radius); // instantiating inputCircle from inputted variables

        // print before changes
        System.out.println("Print before changes");
        System.out.println(emptyCircle);
        System.out.println(fullCircle);
        System.out.println(inputCircle);

        // set new variables
        emptyCircle.setRadius(2);
        fullCircle.setRadius(6);
        inputCircle.setRadius(12);

        // print after changes
        System.out.println("Print after changes");
        System.out.println(emptyCircle);
        System.out.println(fullCircle);
        System.out.println(inputCircle);

    }
}
