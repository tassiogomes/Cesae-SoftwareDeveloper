import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("\n***** Ficha 3 - Exercicio 5 ******\n");

    // Instância obrigatória da classe para fazer a leitura das introduções de dados
    // do utilizador
    Scanner input = new Scanner(System.in);

    // Declarar variáveis
    int n = 1, soma = 0;
    
    while (n <= 100 ) {
      System.out.println(n);
      n=n+1;
      soma = soma + n;
    }
    System.out.println("--------------------------------------------------");
    System.out.println("A soma dos númeoros é: " + soma);
  }
}