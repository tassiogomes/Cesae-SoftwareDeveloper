import java.util.Scanner;


class Main {
  public static void main(String[] args) {

      System.out.println("\n***** Ficha 5 - Exercicio 4 ******\n");
        Scanner input = new Scanner(System.in);

        // declaração de variáveis
        int controle = 5;    
        int[] vetor =  new int [controle];
        int menor;
        int posicao=0;
    
        System.out.println("Insira um número: ");
            vetor[0] = input.nextInt();
            menor=vetor[0];
  

        for(int i = 1; i < controle; i++){
          System.out.println("Insira um número: ");
          vetor[i] = input.nextInt();
          System.out.println("----------------------------------");
              if(vetor[i] < menor){
              menor=vetor[i];
              posicao = i;
        }

     }         
          System.out.println("O menor valor do vetor é " + menor + " e a posição do vetor[menor] é vetor[" + posicao + "]!");
          System.out.println("");

          input.close();
    }
}

// Nota importante!
// Se colocar a variável maior iniciando a 0, tudo que for negativo não entrará no maior.
// Inicializei o vetor fora do ciclo e dei a primeira posição é fornecida pelo utilizador.
// No ciclo, o int é inicializado a 1, pois a primeira posição do vetor for dada fora dele.
// Se o utilizador fornecer todas as posições dentro do ciclo, o i se inicializa a zero.