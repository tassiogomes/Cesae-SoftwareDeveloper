import java.util.Scanner;

import org.junit.runner.manipulation.Sorter;

class Main {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declaração de variáveis
        int controle = 5;    
        int[] vetor =  new int [controle];


        for(int i = 0; i < controle; i++){
          System.out.println("Insira um número: ");
            vetor[i] = input.nextInt();
            System.out.println("----------------------------------");
            }
        for(int i = 0; i < controle; i++){
          System.out.println(vetor[i]);
          System.out.println("");
            }
        input.close();
    }
}