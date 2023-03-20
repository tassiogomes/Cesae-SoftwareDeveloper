import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    //start scanner
    Scanner input = new Scanner(System.in);

    // declare variables
    double n1, n2, n3;

    // entering values
    System.out.println("Digite o primeiro número: ");
    n1 = input.nextDouble();
    System.out.println("");
    System.out.println("Digite o segundo número: ");
    n2 = input.nextDouble();
    System.out.println("Digite o terceiro número: ");
    n3 = input.nextDouble();
    System.out.println("");
    System.out.println("--------------------------------------------------");

    // ordering the values
    // n1 | n2 | n3
    if(n1 > n2 && n2 > n3){
      System.out.println("A ordenação crescente dos números é: " + n1 + " | " + n2 + " | " + n3);
      // n1 | n3 | n2 
    } else if (n1 > n2 && n2 < n3 && n1 > n3){
        System.out.println("A ordenação crescente dos números é: " + n1 + " | " + n3 + " | " + n2);
      // n2 | n1 | n3
    } else if (n2 > n1 && n1 > n3){
        System.out.println("A ordenação crescente dos números é: " + n2 + " | " + n1 + " | " + n3);
      // n2 | n3 | n2
    } else if (n2 > n1 && n1 < n3 && n2 > n3){
        System.out.println("A ordenação crescente dos números é: " + n2 + " | " + n3 + " | " + n1);
      // n3 | n1 | n2
    } else if (n3 > n1 && n1 > n2){
        System.out.println("A ordenação crescente dos números é: " + n3 + " | " + n1 + " | " + n2);
    } else{
        System.out.println("A ordenação crescente dos números é: " + n3 + " | " + n2 + " | " + n1);
          
      }

    
    input.close();

    
    }



}