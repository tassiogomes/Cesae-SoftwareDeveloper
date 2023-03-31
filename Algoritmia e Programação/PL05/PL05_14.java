import java.util.Scanner;


class Main {
  public static void main(String[] args) {
        // declarando a matriz
        int l = 4, c = 4 , soma = 0;
        int[][] matriz = new int[l][c];  // [linhas]/[colunas]
        
        Scanner input = new Scanner(System.in);

        //preenchendo a matriz
        for(int linha=0; linha<l ; linha++){
            for(int coluna=0; coluna < c; coluna++) {
                System.out.print("Introduza o numero na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
                    if(linha == coluna)
                        soma = soma + matriz[linha][coluna];
                        System.out.println("A soma é: " + soma); // para cada loop ele soma cada elemento
            }
        }

        // Ciclo que vai iterar 3 vezes
        for(int linha=0;linha<4;linha++){
            for(int coluna=0; coluna<4;coluna++) {
                System.out.print(matriz[linha][coluna]+" ");
            }
            System.out.println("");
        }


    input.close();

}
}