import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PL08_04 {


    public static void csvReader() throws FileNotFoundException {

        String fileName = "exercicio_04.csv";
        File file = new File(fileName);
        Scanner input = new Scanner(file);
        
        String linha = input.nextLine(); // pula o cabeçalho

        while(input.hasNextLine()){
            linha = input.nextLine();
            System.out.println(linha);
        }
        
        input.close();
    }


    public static void main(String[] args) {
        try {
            csvReader();
            
        } catch (FileNotFoundException exc) {
            System.out.println("Erro ao abrir o arquivo: ");
        }
    }


}

