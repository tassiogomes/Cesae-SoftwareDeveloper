import java.util.Scanner;

public class PL06_03 {

    /**
     * Função que verificar a paridade de um número
     * @param num
     * @return true se par || false se impar
     */
    public static boolean primo(int num){
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count == 2;
    }


    public static void main(String[] args) {

        // Declarar variáveis
        int num;

        Scanner input = new Scanner(System.in);

        System.out.println("***** Ficha 06 - Exercicio 3 *****");

        //Ler número inteiro do utilizador
        System.out.print("Introduza um número: ");
        num=input.nextInt();

        // Invocar a função
        if(primo(num)){
            System.out.println("É primo!");
        }else{
            System.out.println("Não é primo!");
        }

    }

}