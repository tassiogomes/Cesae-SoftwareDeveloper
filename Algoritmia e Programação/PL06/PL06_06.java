import java.util.Scanner;

public class PL06_06 {

    public static int maiorValor(int[] numeros) {       //função int que recebe um array como parâmetro
        int maior = numeros[0];                         //que será introduzido pelo user no programa
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }   
        return maior;                                   //retorna uma int, o retorno é sempre o mesmo tipo da função
    }


    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);

    // asking array size
    System.out.println("Insert the array size: ");
    int array_size = input.nextInt();

    // create array
    int[] array =  new int [array_size];                //cria o array e passa o tamanho introduzido pelo user.

    // filling array
    for(int i = 0; i < array_size; i++){
        System.out.println("Insira um número: ");
          array[i] = input.nextInt();
          System.out.println("----------------------------------");
          }

    // call the function and store the result in a variable
        int maior = maiorValor(array);                  // para mostrar o valor, cria uma variável e chama a função com o parâmetro array
                                                        // retornando o int, que é o retorno da função. PRECISA SER GUARDADO EM UMA VARIÁVEL
    // print the result
        System.out.println("O maior valor é: " + maior);


    input.close();
    
}
}
