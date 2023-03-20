import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("\n***** Ficha 3 - Exercicio 7 ******\n");

    // Instância obrigatória da classe para fazer a leitura das introduções de dados
    // do utilizador
    Scanner input = new Scanner(System.in);

    // Declarar variáveis
    int n= 0, soma = 0, count = 0,  media = 0, entrada_certa = -1 ;
  
    // Entrada de dados
    System.out.println("--------------------------------------------------");

    // Controle
    while (n != entrada_certa) {
      System.out.println("Digite um número: ");
      n = input.nextInt();
      soma = soma + n;
      count++;
    }
    if(entrada_certa < 0){
      media = (soma + (entrada_certa*-1)) / (count -1);
    } else{
      media = (soma - entrada_certa) / (count -1);
    }
    System.out.println("A soma é: " + (soma-entrada_certa));
    System.out.println("Numero de vezes: " + (count-1));
    System.out.println("A média dos números introduzidos é: " + media);
    System.out.println("--------------------------------------------------\n");
  }
}