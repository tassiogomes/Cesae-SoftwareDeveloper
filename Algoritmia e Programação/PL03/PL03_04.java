import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("\n***** Ficha 3 - Exercicio 3 ******\n");

    // Instância obrigatória da classe para fazer a leitura das introduções de dados
    // do utilizador
    Scanner input = new Scanner(System.in);

    // Declarar variáveis
    int n1, n2;

    // Entrada de dados
    System.out.println("Digite um valor inteiro: ");
    n1 = input.nextInt();
    System.out.println("Digite um valor inteiro: ");
    n2 = input.nextInt();
    System.out.println("------------------------------------------------------");
    
    while (n1 <= n2) {
      System.out.println(n1);
      n1=n1+1;
    }

  }
}