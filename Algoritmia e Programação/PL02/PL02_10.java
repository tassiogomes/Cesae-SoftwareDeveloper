import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    // start scanner
    Scanner input = new Scanner(System.in);

    // declare variables
    double n1, n2, n3;

    // entering the variable
    System.out.println("Digite o primeiro número: ");
    n1 = input.nextInt();
    System.out.println("Digite o segundo número: ");
    n2 = input.nextInt();
    System.out.println("Digite o terceiro número: ");
    n3 = input.nextInt();

    
    // check smallest number
    if(n1 < n2 && n1 < n3){
      System.out.println("O menor número entre os 3 é " + n1 + "!");
    } else if(n1 > n2 && n2 < n3){
      System.out.println("O menor número entre os 3 é " + n2 + "!");
    } else{
      System.out.println("O menor número entre os 3 é " + n3 + "!");
    }
    
    input.close();
  
  }
}