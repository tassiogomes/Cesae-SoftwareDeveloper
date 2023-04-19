import java.util.Scanner;

public class PL06_09 {


    public static int maiorValor(int[] numeros) {
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }

    public static int menorValor(int[] numeros) {
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }

    public static boolean crescente(int[] numeros) {     // crescente?
        for (int i = 0; i < numeros.length-1; i++)  {
            if (numeros[i] > numeros[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void menu(int[] array){

        Scanner input = new Scanner(System.in);

        // Introduzir a função desejada
        System.out.print("Introduza A função desejada: 1 - maiorValor | 2 - menorValor | 3 - crescente: \n");
        int function = input.nextInt();

        switch(function){
            case 1:
                // Invocar a função
                int maior = maiorValor(array);
                System.out.println("O maior valor é: " + maior);
                break;
            case 2:
                int menor = menorValor(array);
                System.out.println("O menor valor é: " + menor);
                break;
            case 3:
                if(crescente(array)){
                System.out.println("Array is asc"); 
                }else{
                    System.out.println("Array is not asc");
                }
                break;
            
        } 
            input.close();
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

        menu(array);
        


        input.close();

    }

}