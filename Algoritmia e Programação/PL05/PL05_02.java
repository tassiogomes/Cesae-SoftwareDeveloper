import java.util.Scanner;

class Main {
  public static void main(String[] args) {

      System.out.println("\n***** Ficha 5 - Exercicio 2 ******\n");
        Scanner input = new Scanner(System.in);

        // declaração de variáveis
        int controle = 3;    
        int[] vetor =  new int [controle];
        int soma= 0;


        for(int i = 0; i < controle; i++){
          System.out.println("Insira um número: ");
            vetor[i] = input.nextInt();
            System.out.println("----------------------------------");
            }
        for(int i = 0; i < controle; i++){
          soma =  soma + vetor[i];
          System.out.println("");
          System.out.println(soma);
          System.out.println("");
            }
        input.close();
    }
}