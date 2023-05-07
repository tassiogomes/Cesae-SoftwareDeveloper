package com.company;

public class PL09_06 {

    public static void main(String[] args) {

        // instantiating the object Pessoa manually

        Calculator calculator = new Calculator(2, 5.5);

        //calling methods
        System.out.printf("Addiction operation: %.2f\n",calculator.Addition());
        System.out.printf("Subtraction operation: %.2f\n",calculator.Subtraction());
        System.out.printf("Multiplication operation: %.2f\n",calculator.Multiplication());
        System.out.printf("Division operation: %.2f\n",calculator.Division());

    }

}
