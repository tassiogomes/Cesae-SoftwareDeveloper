import java.util.Scanner;


class Main {
  public static void main(String[] args) {

      System.out.println("\n***** Ficha 5 - Exercicio 5 ******\n");
        Scanner input = new Scanner(System.in);

        // declaração de variáveis
        int controle = 3;    
        int[] vetor =  new int [controle];
        int soma= 0, media;


        for(int i = 0; i < controle; i++){
          System.out.println("Insira um número: ");
            vetor[i] = input.nextInt();
            System.out.println("----------------------------------");
            soma =  soma + vetor[i];
            }

    System.out.println("");
    media = soma / controle;
    System.out.println("A soma dos elementos do vetor é: " + soma);
    System.out.println("A media dos elementos do vetor é: " + media);
    
    input.close();
    }
}