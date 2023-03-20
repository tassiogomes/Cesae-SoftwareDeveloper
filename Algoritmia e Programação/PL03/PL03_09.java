import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("\n***** Ficha 3 - Exercicio 9 ******\n");

    // Instância obrigatória da classe para fazer a leitura das introduções de dados
    // do utilizador
    Scanner input = new Scanner(System.in);

    // Declarar variáveis
    int n, incremento;
  
    // Entrada de dados
    System.out.println("Digite um número limite: ");
    n = input.nextInt();
    System.out.println("Digite um incremento: ");
    incremento = input.nextInt();
    System.out.println("--------------------------------------------------");

    // Controle
    while (n >= 0) {
      System.out.println(n);
      n= n- incremento;
    }
  }
}