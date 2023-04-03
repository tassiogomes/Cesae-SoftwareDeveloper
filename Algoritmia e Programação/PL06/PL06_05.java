import java.util.Scanner;

public class PL06_05 {


    public static boolean par(int num){

        // Verifica o resto da divisão inteira por 2
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean pos_neg(int num){


        if(num>0){
            return true;
        }else{
            return false;
        }
    }

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
        int num, funcao;

        Scanner input = new Scanner(System.in);

        System.out.println("***** Ficha 06 - Exercicio 5 *****");

        // Introduzir a função desejada
        System.out.print("Introduza A função desejada: 1 - isPar | 2 - isPositive | 3 - isPrimo: \n");
        funcao=input.nextInt();
        System.out.print("Introduza um número: ");
        num=input.nextInt();


        switch(funcao){
            case 1:
                // Invocar a função
                if(par(num)){
                    System.out.println("É par");
                }else{
                    System.out.println("É ímpar");
                }
                break;
            case 2:
                if(pos_neg(num)){
                    System.out.println("É positivo");
                }else{
                    System.out.println("É negativo");
                }
                break;
            case 3:
                if(primo(num)){
                    System.out.println("É primo!");
                }else{
                    System.out.println("Não é primo!");
                }
                break;
        }

    }

}