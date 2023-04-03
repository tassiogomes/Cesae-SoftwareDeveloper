import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // declarando a matriz
        int l = 2, c = 2;
        int[][] matriz = new int[l][c]; // [linhas]/[colunas]

        Scanner input = new Scanner(System.in);

        // preenchendo a matriz
        for (int linha = 0; linha < l; linha++) {
            for (int coluna = 0; coluna < c; coluna++) {
                System.out.print("Introduza o numero na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // inicializando variáveis depois dela estar preenchida, usei o primeiro
        // elemento pras duas
        int maior = matriz[0][0];
        int menor = matriz[0][0];

        for (int linha = 0; linha < l; linha++) {
            for (int coluna = 0; coluna < c; coluna++){ // depois de muitos erros, não colocar; depois do parêntese porque fecha o ciclo.
                if (matriz[linha][coluna] > maior) {   // dúvida, o if dentro do primeiro for e do segundo for funcionam
                    maior = matriz[linha][coluna];
                } else if (matriz[linha][coluna] < menor) {
                     menor = matriz[linha][coluna];
                }
            }
        }

        
        System.out.println("O maior nº é: " + maior);
        System.out.println("O menor nº é: " + menor);

        input.close();

    }
}