import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class AV2_V2{


    public static void main(String[] args){

        
        System.out.println(" ");
        System.out.println("Avaliação 2 de Algoritmia e Programação - Programação Estruturada");
        System.out.println(" ");

        String[][] data = readData(); // receive the matrix provided from readData method
        


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
            System.out.println("6 - Imprimir o jogo mais caro e os clientes que o cobmpraram");
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
                            totalSalesAndTotalValue(data);
                            break;
                        case 3:
                            totalProfit(data);
                            break;
                        case 4:
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
        Scanner input = new Scanner(new File("GameStart_V2.txt"));
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
        // Calculate the maximum width for each column
        int[] maxColWidths = new int[data[0].length];       // array to store the maximum width for each column
        for (int col = 0; col < data[0].length; col++) {    // loop through each column
            int max = 0;                                    // variable to store the maximum width of the current column
            for (int row = 0; row < data.length; row++) {   // loop through each row in the current column
                int len = data[row][col].length();          // get the length of the current field
                if (len > max) {                            // if the length is greater than the current maximum
                    max = len;                              // set the maximum to the current length
                }
            }
            maxColWidths[col] = max;                        // store the maximum width for the current column
        }
        
        // Print the data with aligned columns
        for (int row = 0; row < data.length; row++) {       // loop through each row
            for (int col = 0; col < data[row].length; col++) { // loop through each column in the current row
                System.out.printf("%-" + maxColWidths[col] + "s ", data[row][col]); // Use printf to specify a fixed width for each field
            }
            System.out.println();                           // move to the next row
        }
    }
    



public static void totalSalesAndTotalValue(String[][] data) {
    int numOfSales = data.length; // count the number of sales, the number of rows in the data)

    double totalValue = 0; // initialize the total value of sales to zero

    // loop over each row in the data and add the value of the sale (stored in column 8) to the total value
    for (int i = 0; i < data.length; i++) {
        totalValue += Double.parseDouble(data[i][8]);
    }

    // print the number of sales and the total value of sales (formatted as a currency with two decimal places)
    System.out.println(data.length);
    System.out.printf("O nº total de vendas registrado na base de data é: %d \n", numOfSales);
    System.out.printf("Valor total de vendas: %.2f EUR\n", totalValue); // formating and round the value to 2 decimal
}


    public static void totalProfit(String[][] data) {
        double totalProfit = 0;
    
        for (int i = 1; i < data.length; i++) {
            double saleValue = Double.parseDouble(data[i][8]);
            double profit = saleValue * 0.1;
            totalProfit += profit;
        }
    
        System.out.printf("Total de lucro: %.2f EUR\n", totalProfit);
    }









    } // chavetas  public class
