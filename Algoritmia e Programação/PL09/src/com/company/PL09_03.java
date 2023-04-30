package com.company;
import java.util.Scanner;

public class PL09_03 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // instantiating the object Pessoa manually
        Rectangle rectangleEmpty = new Rectangle();
        Rectangle fullRectangle = new Rectangle(2, 4);

        // input variables
        System.out.println("Enter the widght: ");
        int widght = input.nextInt();
        System.out.println("Enter the height: ");
        int height = input.nextInt();
        Rectangle inputRectangle = new Rectangle(widght, height); // instantiating inputRectangle

        // print before changes
        System.out.println("Before changes");
        System.out.println(rectangleEmpty);
        System.out.println("----------");
        System.out.println(fullRectangle);
        System.out.println("----------");
        System.out.println(inputRectangle);

        // setting new values
        rectangleEmpty.setWidth(10);
        rectangleEmpty.setHeight(12);
        fullRectangle.setHeight(10);

        // print after changes
        System.out.println("Before changes");
        System.out.println(rectangleEmpty);
        System.out.println("----------");
        System.out.println(fullRectangle);
        System.out.println("----------");
        System.out.println(inputRectangle);

    }

}
