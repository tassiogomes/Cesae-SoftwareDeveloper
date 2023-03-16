import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    // declare variables
    int n1, n2;

    // start scanner
    Scanner input = new Scanner(System.in);

    // enter variables
    System.out.println("Introduza o n1");
    n1 = input.nextInt();
    System.out.println("Introduza o n2");
    n2 = input.nextInt();


    // after n1 and n2 declared
    int n3 = n1;
    
    // results
      n1 = n2;
      n2 = n3;

    // display results

    System.out.println("O novo valor de n1 é: " +  n1);
    System.out.println("");
    System.out.println("O novo valor de n2 é: " +  n2);
    System.out.println(""); 
  

    // solution 2

    // valor1 passa a ser a diferença entre os dois (imaginar total 10, n1=4 e n2 = 6)
    n1 = n1 - n2;
    // valor2 passa a ser valor2 + diferença (valor 2 = 6 - 2 = 4) Já é o valor 1
    n2 = n2 + n1;
    // valor 1 (-2) passa a ser o valor2 (4) + o valor1 *-1 ( n1= 4 + (-2 * -1), n1 = 4 + 2 = 6 )
    n1 = n2 + (n1 * (-1));

    // display results 2
    System.out.println("O novo valor de n1 é: " +  n1);
    System.out.println("");
    System.out.println("O novo valor de n2 é: " +  n2);
    
    input.close();
      

  }
}