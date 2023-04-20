import java.util.Scanner;

public class PL06_10 {


    public static void positive(int number) {  
        for (int i = 0; i < number; i++)  {
                System.out.print("* ");;
            }
    }


    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    int number;

    // insert a positive number
    do{
        System.out.print("Insert a positive number: ");
    while(!input.hasNextInt()){
        System.out.print("Invalid value. Insert a positive number: ");
        input.next();
    }
        number = input.nextInt();
    }while(number<=0);


    // call the function and store the result in a variable
    positive(number);


    input.close();
    
}
}
