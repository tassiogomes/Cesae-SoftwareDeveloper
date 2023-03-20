import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    // declare variables
    double p1, p2, p3, total, total_discount;

    // start scanner
    Scanner input = new Scanner(System.in);

    // enter variables
    System.out.println("Introduza o p1");
    p1 = input.nextInt();
    System.out.println("Introduza o p2");
    p2 = input.nextInt();
    System.out.println("Introduza o p3");
    p3 = input.nextInt();

    // total price
    total = p1 + p2 + p3;

    // total - discount
    total_discount = total - (total * 0.1);
    
    // display results

    System.out.println("O valor de p1 é: " + p1);
    System.out.println("");
    System.out.println("O valor de p2 é: " + p2);
    System.out.println("");
    System.out.println("O valor de p3 é: " + p3);
    System.out.println("");
    System.out.println("O valor total é: " + total);
    System.out.println("-------------------------------------------------");
    System.out.println("O valor com disconto de 10% é: " + total_discount);

    input.close();
    
  }
}