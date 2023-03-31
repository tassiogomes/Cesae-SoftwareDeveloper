import java.util.Scanner;


class Main {
  public static void main(String[] args) {
        // declarando a matriz
        int l = 3, c = 3, repetida, counter=0;
        int[][] matriz = new int[l][c];  // [linhas]/[colunas]
        
        Scanner input = new Scanner(System.in);

        //preenchendo a matriz
        for(int linha=0; linha<l ; linha++){
            for(int coluna=0; coluna < c; coluna++) {
                System.out.print("Introduza o numero na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }
        System.out.println("Introduza o número para ser verificado a sua frequência na matrix: ");
        repetida = input.nextInt();

        for(int linha=0; linha < l ; linha++){
            for(int coluna=0; coluna < c; coluna++)
                if(repetida == matriz[linha][coluna]){
                    counter++;
                }
            }
            
            System.out.println(counter);


    input.close();

}
}