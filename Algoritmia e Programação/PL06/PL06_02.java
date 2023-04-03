import java.util.Scanner;

public class PL06_02 {

    /**
     * Função que verificar a paridade de um número
     * @param num
     * @return true positivo | false se impar
     */
    public static boolean pos_neg(int num){

        // Verifica o resto da divisão inteira por 2
        if(num>0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        // Declarar variáveis
        int num;

        Scanner input = new Scanner(System.in);

        System.out.println("***** Ficha 06 - Exercicio 2 *****");

        //Ler número inteiro do utilizador
        System.out.print("Introduza um número: ");
        num=input.nextInt();

        // Invocar a função
        if(pos_neg(num)){
            System.out.println("É positivo");
        }else{
            System.out.println("É negativor");
        }

    }

}