import java.util.Scanner;

public class PL06_07 {

    public static int menorValor(int[] numeros) {
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }


    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);

    // asking array size
    System.out.println("Insert the array size: ");
    int array_size = input.nextInt();

    // create array
    int[] array =  new int [array_size];

    // filling array
    for(int i = 0; i < array_size; i++){
        System.out.println("Insira um número: ");
          array[i] = input.nextInt();
          System.out.println("----------------------------------");
          }

    // call the function and store the result in a variable
        int menor = menorValor(array);

    // print the result
        System.out.println("O menor valor é: " + menor);


    input.close();
    
}
}
