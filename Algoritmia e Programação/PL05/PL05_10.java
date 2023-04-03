import java.util.Scanner;


class Main {
  public static void main(String[] args) {
        // declarando a matriz
        int l = 3, c = 3, soma = 0;
        int[][] matriz = new int[l][c];  // [linhas]/[colunas]
        
        Scanner input = new Scanner(System.in);

        //preenchendo a matriz
        for(int linha=0; linha<l ; linha++){
            for(int coluna=0; coluna < c; coluna++) {
                System.out.print("Introduza o numero na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
                soma = soma + matriz[linha][coluna];
                System.out.println("A soma é: " + soma); // para cada loop ele soma cada elemento
            }
        }



    input.close();

}
}