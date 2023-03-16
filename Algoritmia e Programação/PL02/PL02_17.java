import java.util.Scanner;
class Main {
  public static void main(String[] args) {
        
    //start scanner
    Scanner input = new Scanner(System.in);

    // declare variables
    int valor, n5, n10, n20, n50, n100, n200;

    // entering value
    do
    {
    System.out.println("Digite o valor desejado (múltiplo de 5): ");
    valor = input.nextInt();
    }
    while (valor % 5 != 0);
      

    // calculating
    
    n200 = valor / 200;
    valor = valor % 200;
    System.out.println(n200 + " "  + valor);
    n100 = valor / 100;
    valor = valor % 100;
    System.out.println(n100 + " "  + valor);
    n50 = valor / 50;
    valor = valor % 50;
    System.out.println(n50 + " "  + valor);
    n20 = valor / 20;
    valor = valor % 20;
    System.out.println(n20 + " "  + valor);
    n10 = valor / 10;
    valor = valor % 10;
    System.out.println(n10 + " "  + valor);
    n5 = valor / 5;
    valor = valor % 5;
    System.out.println(n5 + " "  + valor);
      
    }



    
}
