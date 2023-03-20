import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("\n***** Ficha 3 - Exercicio 1 ******\n");

    // Instância obrigatória da classe para fazer a leitura das introduções de dados
    // do utilizador
    Scanner input = new Scanner(System.in);

    // Declarar variáveis
    int n = 2;

    // Entrada de dados
    System.out.println("Digite um número inteiro maior que 2: ");
    n = input.nextInt();

    if(n%2==0){
      while (2 <= n) {
        System.out.println(n);
        n=n-2;
      }
    }else{
      n = n-1;
      while (2 <= n) {
        System.out.println(n);
        n=n-2;
      }
    }  
    
  }
}