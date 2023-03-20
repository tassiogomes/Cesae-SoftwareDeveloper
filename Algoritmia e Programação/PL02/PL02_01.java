import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    //start scanner
    Scanner input = new Scanner(System.in);

    // declare variables
    int n1, n2;

    // enter values
    System.out.println("Digite o primeiro número: ");
    n1 = input.nextInt();
    System.out.println("Digite o segundo número: ");
    n2 = input.nextInt();

    // conditionals
    if (n1 > n2){
      System.out.println("O maior valor é: " + n1);
    }  else if(n2 > n1){
        System.out.println("O maior valor é: " + n2);
    }  else{
        System.out.println("Os números são iguais!");
      }
    }
      
  }
