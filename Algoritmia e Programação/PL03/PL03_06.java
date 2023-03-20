import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("\n***** Ficha 3 - Exercicio 5 ******\n");

    // Instância obrigatória da classe para fazer a leitura das introduções de dados
    // do utilizador
    Scanner input = new Scanner(System.in);

    // Declarar variáveis
    int n, anterior, seguinte;
  
    // Entrada de dados
    System.out.println("Digite um número inteiro:");
    n = input.nextInt();
    System.out.println("--------------------------------------------------");
    anterior = n - 5;
    seguinte = n + 5;
    
    System.out.println("Os 5 números anteriores são: \n");
    while (anterior < n) {
      System.out.println(anterior);
      anterior=anterior+1;
    }
    
    System.out.println("--------------------------------------------------\n");
    
    while (n < seguinte)  {
      n=n+1;
      System.out.println(n);
    }
  }
}