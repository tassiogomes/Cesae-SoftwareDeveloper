import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    // start scanner
    Scanner input = new Scanner(System.in);

    // declare variables
    int n1;

    // entering the variable
    System.out.println("Digite um número: ");
    n1 = input.nextInt();

    // check if is even or odd
    if(n1 % 2 == 0){
      System.out.println("O número " +  n1 + " é par!");
    } else{
      System.out.println("O número " +  n1 + " é ímpar!");
    }
    
    input.close();
  
  }
}