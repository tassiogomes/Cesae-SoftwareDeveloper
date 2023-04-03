import java.util.Scanner;


class Main {
  public static void main(String[] args) {
        // cria o array
        int controle = 3;
        int[] arr1 = new int[controle];
        int[] arr2 = new int[controle];
        int[][] matriz = new int[2][controle]; // [linhas]/[colunas] cria uma matriz para receber os dois arrays

        Scanner input = new Scanner(System.in);

        
        // lê os elementos do array 1
        for (int i = 0; i < controle; i++) {
            System.out.print("Digite o " + (i+1) + "º número do arr1: ");
            arr1[i] = input.nextInt();
        }
        for (int j = 0; j < controle; j++) {
            System.out.print("Digite o " + (j+1) + "º número do arr2: ");
            arr2[j] = input.nextInt();
        }

        //preenchendo a matriz
        for(int linha=0; linha < 2 ; linha++){ // numero de arrays 2, ou seja, duas linhas
            for(int coluna = 0; coluna < controle ; coluna++) {
                if(linha == 0){        // preenchendo as colunas da matriz
                    matriz[linha][coluna] = arr1[coluna];   // o arr1 leva a coluna como índice, que muda a cada ciclo, por exemplo, coluna 0, coluna 1 etc.
                }else if (linha == 1){
                    matriz[linha][coluna] = arr2[coluna];
                }
            }

        }
        //preenchendo a matriz de outra forma mais otimizada
            for(int coluna = 0; coluna < controle ; coluna++) {
                matriz[0][coluna] = arr1[coluna];   // o arr1 leva a coluna como índice, que muda a cada ciclo, por exemplo, coluna 0, coluna 1 etc.
                matriz[1][coluna] = arr2[coluna];        
        }

        // Ciclo que vai iterar 3 vezes
        for(int linha=0;linha<2;linha++){
            for(int coluna=0; coluna<controle;coluna++) {
                System.out.print(matriz[linha][coluna]+" ");
            }
            System.out.println("");
        }
        
    input.close();

}
}