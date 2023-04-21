import java.util.Scanner;

public class PL06_08 {


    public static boolean crescente(int[] numeros) {     // crescente?
        for (int i = 0; i < numeros.length-1; i++)  {
            if (numeros[i] > numeros[i+1]) {
                return false;
            }
        }
        return true;
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
       boolean crescente = crescente(array);
        

    // print the result
       System.out.println("Is the array asc? " + crescente);


    input.close();
    
}
}
