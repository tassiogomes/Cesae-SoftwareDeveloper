import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("\n***** Ficha 3 - Exercicio 10 ******\n");

    // Instância obrigatória da classe para fazer a leitura das introduções de dados
    // do utilizador
    Scanner input = new Scanner(System.in);

    // Declarar variáveis
    int n=0, c1 = 0, c2= 0, c3 = 0, c4 = 0;
  
    // Entrada de dados

    System.out.println("--------------------------------------------------");

    // Controle
    while (n >= 0) {
      System.out.println("Digite um número número inteiro: ");
      n = input.nextInt();
        if(n >= 0 && n <= 25){
          c1++;;
        } else if( n >= 26 && n <= 50){
            c2++;
        } else if(n >= 51 && n <= 75){
            c3++;
        } else if (n >= 76 && n <= 100){
            c4++;
        }
      }
    System.out.println("--------------------------------------------------\n");
    System.out.println("O intervalo [0,25] possui " + c1 + " registos");
    System.out.println("O intervalo [25,50] possui " + c2 + " registos");
    System.out.println("O intervalo [51,75] possui " + c3 + " registos");
    System.out.println("O intervalo [76,100] possui " + c4 + " registos");

  }
}