import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class PL08_02 {

    public static void usingPrintWritter() throws FileNotFoundException{ //o PrintWritter tem obrigatoriamente essa Exception

        String fileContent = "I'm Tassio!"; // declare string

        File file = new File("Files/ex2.txt");                  // quando se quer gravar na mesma pasta do projeto, não precisa do path todo

        PrintWriter printWriter = new PrintWriter(file);

        printWriter.print(fileContent);

        printWriter.close();                                            // obrigatoriamente é necessário fechar o printWritter, senão dá erro. 


    }

    public static void main(String[] args) {

        try{
            usingPrintWritter();

        } catch(FileNotFoundException exc){                             // obrigatoriamente tem que tratas a Exception declarada no método
            System.out.println("Deu erro!");
        }
        



    
}
}