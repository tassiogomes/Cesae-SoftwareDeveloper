import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("\n***** Ficha 3 - Exercicio 3 ******\n");

    // Instância obrigatória da classe para fazer a leitura das introduções de dados
    // do utilizador
    Scanner input = new Scanner(System.in);

    // Declarar variáveis
    int n1, n2;
    n2 = 0;

    // Entrada de dados
    System.out.println("Digite um valor inteiro: ");
    n1 = input.nextInt();
    
    while (n2 <= n1 ) {
      System.out.println(n2);
      n2=n2+1;
    }

  }
}