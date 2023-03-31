import java.util.Scanner;


class Main {
  public static void main(String[] args) {
        // declarando a matriz
        int[][] matriz = new int[3][3];  // [linhas]/[colunas]

        // inicia o scanner e lê o primeiro número fora para testar o maior
        Scanner input = new Scanner(System.in);

        //preenchendo a matriz
        // Ciclo que vai iterar 3 vezes - 1x para cada linha
        for(int linha=0;linha<3;linha++){
            // Ciclo que vai iterar 3 vezes - 1x para cada coluna
            for(int coluna=0; coluna<3;coluna++) {
                System.out.print("Introduza o numero na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }


        //Imprime um enter *para ficar bonito*
        System.out.println(" ");

        // Ciclo que vai iterar 3 vezes - 1x para cada linha
        for(int linha=0;linha<3;linha++){
            // Ciclo que vai iterar 3 vezes - 1x para cada coluna
            for(int coluna=0; coluna<3;coluna++) {
                System.out.print(matriz[linha][coluna]+" ");
            }
            System.out.println("");
        }



        


    input.close();

}
}