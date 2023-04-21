import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PL08_03 {
    public static void copyFile() throws FileNotFoundException {
        // ler o arquivo ex2.txt
        File inputFile = new File("Files/ex2.txt");
        Scanner inputScanner = new Scanner(inputFile);
        String fileContent = inputScanner.nextLine(); // assumindo que o arquivo só tem uma linha, colocando o ex2 na variavel fileContent

        // gravar o conteúdo em um novo arquivo ex3.txt
        File outputFile = new File("Files/ex3.txt");   // cria um arquivo ex3
        PrintWriter outputWriter = new PrintWriter(outputFile); // escreve o arquivo ex3
        outputWriter.print(fileContent);                        // mostra o conteúdo

        // fechar os recursos abertos
        inputScanner.close();
        outputWriter.close();
    }

    public static void main(String[] args) {
        try {
            copyFile();
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao ler/gravar arquivo!");
            e.printStackTrace();
        }
    }
}