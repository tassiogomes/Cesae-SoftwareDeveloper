import java.util.Scanner;

public class PL06_11 {


    public static int[] fillArray(int[] array, int quantity) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < quantity; i++) {
            System.out.print("Insert a number: ");
            array[i] = input.nextInt();
        }
        return array;
    }


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números? ");
        int quantity = input.nextInt();
    
        int[] array = new int[quantity];
        fillArray(array, quantity);
        //System.out.println(fillArray(array, quantity));


        System.out.print("Array: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
        }


            input.close();

        }
}