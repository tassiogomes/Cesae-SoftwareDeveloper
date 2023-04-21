import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PL08_01{

public static void usingScanner() throws FileNotFoundException {

    File file = new File("Files/ex2.txt");
    Scanner input = new Scanner(file);

    while (input.hasNextLine()) {
        String linha = input.nextLine();
        System.out.println(linha);
    }

    input.close();

}
    public static void main(String[] args) {

        try{
            usingScanner();

        } catch(FileNotFoundException exc){                             // obrigatoriamente tem que tratas a Exception declarada no método
            System.out.println("Deu erro!");
        }
    }


}
