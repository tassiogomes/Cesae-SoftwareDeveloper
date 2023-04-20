import java.util.Scanner;

public class PL06_11 {


    public static int[] fillArray(int[] array, int quantity) {      //função do tipo array int[] que recebe um array e uma quantidade como parâmetro
        Scanner input = new Scanner(System.in);                     //que serão introduzidos pelo user quando essa função for chamada

        for (int i = 0; i < quantity; i++) {
            System.out.print("Insert a number: ");
            array[i] = input.nextInt();
        }
        return array;                                               //retorna um array, o retorno é sempre o mesmo tipo da função
    }


    public static void main(String[] args) {                        // aqui no programa a função será chamada e preencheremos os parâmetros dela
        
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números? ");      
        int quantity = input.nextInt();                             // preenchendo o parâmetro quantidade de elementos no array    
    
        int[] array = new int[quantity];                            // declarando o array com a quantidade escolhida
        fillArray(array, quantity);                                 // chamandp a função e retornando o array, não precisa de variável para mostras, é só chamar a função
        //System.out.println(fillArray(array, quantity));


        System.out.print("Array: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
        }


            input.close();

        }
}