import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    // declare variables
    int n1, n2, soma;
    
    // create an object of Scanner
    Scanner input = new Scanner (System.in);

    // input from the user
    System.out.println("Introduza o primeiro número:");
    n1 = input.nextInt();
    System.out.println("Introduza o segundo número:");
    n2 = input.nextInt();
    soma = n1 + n2;

    // print results
    System.out.println(" ");
    System.out.println("A soma dos dois números é : "+soma);

    // close scanner
    input.close();
  }
}