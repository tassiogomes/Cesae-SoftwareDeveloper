import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class AV2_V2{


    public static void main(String[] args){

        
        System.out.println(" ");
        System.out.println("Avaliação 2 de Algoritmia e Programação - Programação Estruturada");
        System.out.println(" ");

        String[][] data = readData();
        


        // ****** MENU ******
        Scanner input = new Scanner(System.in); // Initializing the scanner

        int menuOption = -1;
        do {
            System.out.println("****** Menu GameStart ******");
            System.out.println("1 - Imprimir o conteúdo da base de data");
            System.out.println("2 - Imprimir  o nº total de vendas e o valor total");
            System.out.println("3 - Calcular o lucro total de todas as vendas");
            System.out.println("4 - Imprimir as informações de um cliente");
            System.out.println("5 - Imprimir os gêneros e os jogos de uma determinada editora");
            System.out.println("6 - Imprimir o jogo mais caro e os clientes que o compraram");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma das opções acima: ");

            // declare variables 
            if (input.hasNextInt()) {                       // integer control
                menuOption = input.nextInt();

                if (menuOption >= 0 && menuOption <= 6) {   // check if the number is within the desired range
                    switch(menuOption){

                        case 1: {
                            printData(data);
                            break;
                        }
                        case 2:
                            break;
                        case 3:
                            // TODO: implementar funcionalidade
                            break;
                        case 4:
                            // TODO: implementar funcionalidade
                            break;
                        case 5:
                            // TODO: implementar funcionalidade
                            break;
                        case 6:
                            // TODO: implementar funcionalidade
                            break;
                        case 0:
                            break;
                
                    }

                } else {
                    System.out.println("Opção inválida. Escolha um número entre 0 e 6.");
                }
            } else {
                System.out.println("Opção inválida. Escolha um número entre 0 e 6.");
                input.next(); // Descartar a entrada não válida do usuário
            }



        } while (menuOption != 0);

    } // chavetas main


// ------------------------- Functions/Methods ------------------------------------------------*/


public static String [][] readData(){

    // ***this part counts how many lines the file has***
    String [][] data = null;            // creating an empty data to receive the data
    try {
        Scanner input = new Scanner(new File("GameStart.csv"));
        int lineNum = 0;
    input.nextLine();                   // not read the header
        while (input.hasNextLine()) {
            input.nextLine();
            lineNum++;                  // count the number of lines
        }
        input.close();

        // this part reads the data and stores it in the data
        data = new String[lineNum][9];  // size of data with the correct number of lines
        input = new Scanner(new File("GameStart.csv"));
        input.nextLine();               // not read the header
        int row = 0;                    // variable to zero because all the lines will have to be traversed
        while (input.hasNextLine()) {   // read while exists new lines
            String dataLine = input.nextLine();              // read the next line from the file and store it in "dataLine"
            String[] fields = dataLine.split(";");     // split the line into fields based on the ";" character and store in "fields"
            for (int col = 0; col < fields.length; col++) {  // traverse each field of the line
                data[row][col] = fields[col];                // store each field in the "data" array in the correct position
            }
            row++;
        }
        input.close();
    } catch (IOException exc) {
        System.out.println("Erro ao ler o arquivo: " + exc.getMessage());
    }
    return data;
}


// This method takes a two-dimensional array of Strings as input and prints its contents to the console.
public static void printData(String[][] data) { 
    for (int row = 0; row < data.length; row++) {           // for each row of the array...
        for (int col = 0; col < data[row].length; col++) {  // for each column of the current row...
            System.out.print(data[row][col] + "\t");        // print the value at the current row and column, followed by a tab character.
        }
        System.out.println();                               // Move to the next line after printing all the columns of the current row.
    }
}







    } // chavetas  public class
