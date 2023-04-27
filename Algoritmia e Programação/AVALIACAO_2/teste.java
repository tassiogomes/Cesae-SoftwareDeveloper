// Java library imports.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// This scope executes the entire Main code, inside it, we can execute functions by using a switch case.
public class teste {


    // Function that initializes the main code.
    public static void main(String[] args) throws FileNotFoundException {

        // Scanner to read the user's option
        Scanner scannerOption = new Scanner(System.in);

        // Aesthetic blank spaces & detailing of what this code actually does.
        System.out.println(" ");
        System.out.println("Trabalho Prático - Programação Estruturada");
        System.out.println(" ");
        System.out.println("Objectivo: Elabore um menu, que permita ao utilizador escolher o que pretende fazer, sendo que as opções terão de corresponder ao número do exercício seguido da sua descrição.");
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------");
        System.out.println(" ");

        // Do-While loop - Function: Repeats a prompt on the console for the user to input. If the input is indeed equal to "0" the code exits the loop.
        int option;
        do {

            // Graphical layout of the actual menu functions based on user input and followed by corresponding descriptive text.
            System.out.println("***** GameStart - Menu *****");
            System.out.println("1. Imprimir conteúdo.");
            System.out.println("2. Imprimir quantidade de vendas e o valor total.");
            System.out.println("3. Calcular o lucro total da GameStart.");
            System.out.println("4. Imprimir informações de um cliente.");
            System.out.println("5. Imprimir jogos de uma editora.");
            System.out.println("6. Imprimir jogo mais caro e os clientes que o compraram");
            System.out.println("0. Sair");
            System.out.print(": Insira uma das opções: ");

            // Declaration on the "option" variable that stores the input from the user using the scanner.nextInt() function.
            option = scannerOption.nextInt();
            // Switch case that takes the variable "option" into account and performs different functions accordingly.
            switch (option) {
                // If the option is == to 1. The code will execute the "consolePrinter" function, thus printing out the full data present on the read file on to the console.
                case 1 : {

                    System.out.println(" ");

                    // This try catch exception takes in account the possibility that the code might not be able to do the following: (1- Be able to find the file due to an error with the pathway provided)(2- The functions on the code are unable to convert the datatype present on the file correctly to the output desired.)
                    try {
                        consolePrinter();
                    } catch (FileNotFoundException exception) {
                        System.out.println("Erro. Ficheiro não existe.");
                    } catch (NumberFormatException exception) {
                        System.out.println("Erro. A String que tentou converter para Double não é válida.");
                    }

                    System.out.println("-----------------------------------------------------------------------------------------------");
                    System.out.println(" ");

                }
                case 2 : {

                    System.out.println(" ");

                    // This try catch exception takes in account the possibility that the code might not be able to do the following: (1- Be able to find the file due to an error with the pathway provided)(2- The functions on the code are unable to convert the datatype present on the file correctly to the output desired.)
                    try {
                        salesTotalValue();
                    } catch (FileNotFoundException exception) {
                        System.out.println("Erro. Ficheiro não existe.");
                    } catch (NumberFormatException exception) {
                        System.out.println("Erro. A String que tentou converter para Double não é válida.");
                    }

                    System.out.println("-----------------------------------------------------------------------------------------------");
                    System.out.println(" ");

                }
                case 3 : {

                    System.out.println(" ");

                    // This try catch exception takes in account the possibility that the code might not be able to do the following: (1- Be able to find the file due to an error with the pathway provided)(2- The functions on the code are unable to convert the datatype present on the file correctly to the output desired.)
                    try {
                        totalProfit();
                    } catch (FileNotFoundException exception) {
                        System.out.println("Erro. Ficheiro não existe.");
                    } catch (NumberFormatException exception) {
                        System.out.println("Erro. A String que tentou converter para Double não é válida.");
                    }

                    System.out.println("-----------------------------------------------------------------------------------------------");
                    System.out.println(" ");

                }
                case 4 : {

                    System.out.println(" ");


                    // This try catch exception takes in account the possibility that the code might not be able to do the following: (1- Be able to find the file due to an error with the pathway provided)(2- The functions on the code are unable to convert the datatype present on the file correctly to the output desired.)
                    try {
                        userInfoPrinter();
                    } catch (FileNotFoundException exception) {
                        System.out.println("Erro. Ficheiro não existe.");
                    } catch (NumberFormatException exception) {
                        System.out.println("Erro. A String que tentou converter para Double não é válida.");
                    }
                    System.out.println("-----------------------------------------------------------------------------------------------");
                    System.out.println(" ");

                }
                case 5 : {

                    System.out.println(" ");

                    // This try catch exception takes in account the possibility that the code might not be able to do the following: (1- Be able to find the file due to an error with the pathway provided)(2- The functions on the code are unable to convert the datatype present on the file correctly to the output desired.)
                    try {
                        genrePrinter();
                    } catch (FileNotFoundException exception) {
                        System.out.println("Erro. Ficheiro não existe.");
                    } catch (NumberFormatException exception) {
                        System.out.println("Erro. A String que tentou converter para Double não é válida.");
                    }

                    System.out.println("-----------------------------------------------------------------------------------------------");
                    System.out.println(" ");

                }
                case 6 : {

                    System.out.println(" ");

                    // This try catch exception takes in account the possibility that the code might not be able to do the following: (1- Be able to find the file due to an error with the pathway provided)(2- The functions on the code are unable to convert the datatype present on the file correctly to the output desired.)
                    try {
                        expensiveGameAndClientPrinter();
                    } catch (FileNotFoundException exception) {
                        System.out.println("Erro. Ficheiro não existe.");
                    } catch (NumberFormatException exception) {
                        System.out.println("Erro. A String que tentou converter para Double não é válida.");
                    }

                    System.out.println("-----------------------------------------------------------------------------------------------");
                    System.out.println(" ");

                }
                case 0 : {

                    System.out.println(" ");
                    System.out.println("Resultado:");
                    System.out.println("Saindo do programa...");
                    System.out.println(" ");

                }
                // If the output is invalid the defalt optio
                default : {

                    System.out.println(" ");
                    System.out.println("Resultado:");
                    System.out.println("Erro! O seu input é inválido! Tente novamente!");
                    System.out.println(" ");
                }
            }

        } while (option != 0);
        scannerOption.close();
    }

    //!-------------------------------------------------------------------Visual delimiter between the elaboration of the functions and the broader main method--------------------------------------------------------------------


    public static void consolePrinter() throws FileNotFoundException {
        System.out.println("Opção escolhida (1): Impressão do conteúdo do ficheiro na consola.");
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------------------------------------");

        //TODO: Function 1 must print the data on to the console!

        // Create a File object that points to the file to be read
        File file = new File("GameStart.csv");
        // Create a Scanner object that reads from the file
        Scanner scanner = new Scanner(file);

        // Loop through each line of the file and print it to the console
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        // Close the Scanner object to release system resources
        scanner.close();
    }

    public static void salesTotalValue() throws FileNotFoundException {
        System.out.println("Opção escolhida (2): Impressão da quantidade de vendas executadas e do seu valor total.");
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------------------------------------");

        //TODO: Function 2 must print the amount of executed sales and their value into the console! (Because each sale has a unique ID. I just need to add all the sales together.)

        // Indicates the File that is to be read
        File file = new File("Files/GameStart.csv");
        // Creates a scanner that reads the file
        Scanner scanner = new Scanner(file);

        String line;
        Integer vendas = 0;
        double valor, total = 0;

        // Reads the Header line
        line = scanner.nextLine();

        // Reads through the file & processes it
        while (scanner.hasNextLine()) {

            // ???
            line = scanner.nextLine();
            // Creates an array[8]
            String[] itemsLine = line.split(",");
            // Assigns the values to the valor variable transforming it from a string into a Double data type. Then the total value is calculated.
            valor = Double.parseDouble(itemsLine[8]);
            vendas++;
            total += valor;

        }

        // Prints out the already multiplied total of the sales and closes the scanner object.
        System.out.println("O número de jogos individuais vendidos foi: " + vendas + ". Já o valor total de todas essas vendas foi de: " + total);
        scanner.close();
    }

    public static void totalProfit() throws FileNotFoundException {
        System.out.println("Opção escolhida (3): Impressão do total de lucro de todas as vendas.");
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------------------------------------");

        //TODO: Function 3 must calculate GameStart's total amount of profit (I took the liberty of printing the value to the console)! (Assuming the margin is 10% we can simply take the value from the previous function and multiply it by 0.1 to achieve our goal.)

        // Indicates the File that is to be read
        File file = new File("Files/GameStart.csv");
        // Creates a scanner that reads the file
        Scanner scanner = new Scanner(file);

        String line;
        double valor, total = 0;

        // Reads the Header line
        line = scanner.nextLine();

        // Reads through the file & processes it
        while (scanner.hasNextLine()) {

            // ???
            line = scanner.nextLine();
            // Creates an array[8]
            String[] itemsLine = line.split(",");
            // Assigns the values to the valor variable transforming it from a string into a Double data type. Then the total value is calculated.
            valor = Double.parseDouble(itemsLine[8]);
            total += valor;

        }

        // Prints out the already multiplied total of the sales and closes the scanner object.
        System.out.println("O valor total do lucro de todas as vendas foi de: " + (total * 0.1));
        scanner.close();
    }


    public static void userInfoPrinter() throws FileNotFoundException {
        System.out.println("Opção escolhida (4): Dado um idCliente. Impressão de todas as informações associadas ao mesmo (nome, contacto, email).");
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(new File("Files/GameStart.csv"));

        String line;
        Integer idCliente;

        System.out.print(": Insira o ID do cliente: ");
        idCliente = scanner.nextInt();
        scanner.nextLine(); // consume the remaining newline character

        // Loop through each line of the file
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            String[] parts = line.split(",");

            // Check if the current line belongs to the requested idCliente
            if (Integer.parseInt(parts[1]) == idCliente) {
                // Print the personal information of the client
                System.out.println("Nome: " + parts[2]);
                System.out.println("Contacto: " + parts[3]);
                System.out.println("Email: " + parts[4]);
            }
        }
        scanner.close();
    }
    
    public static void genrePrinter() throws FileNotFoundException {
    }

    public static void expensiveGameAndClientPrinter() throws FileNotFoundException {
        System.out.println("Opção escolhida (6): Impressão do jogo mais caro.");
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------------------------------------");

        //TODO: Function 6 must print out to the console the name of the most expensive game, it's value and lastly some sort of identification of identifier the clients who bought it (I went with the variable nomeCliente)! (.)

        Scanner scanner = new Scanner(new File("Files/GameStart.csv"));

        String line;
        String mostExpensive = "";
        Double comparative = 0.0;

        // This line of code needs to skip the headers of the csv file. Because the first line cannot be converted to a Double data type
        line = scanner.nextLine();

        // Loop through each line of the file
        while (scanner.hasNextLine()) {

            // Read the current line and split it into two parts: name and age
            line = scanner.nextLine(); //
            String[] parts = line.split(","); // Gives me an array [8]

            // Check if the current game is more expensive than the previous ones
            if (Double.parseDouble(parts[8]) > comparative) {

                // Update the name of the most expensive game and its price
                comparative = Double.parseDouble(parts[8]);
                mostExpensive = parts[7];
            }
        }

        // Print the name and price of the most expensive game
        System.out.println("O jogo mais caro é o: " + mostExpensive + ". O seu preço é de: " + comparative + " .E os clientes que o comparam foram os seguintes: ");
    }

}

/* Final Consideration / Things to point out..
 * 0 - Note that the functions share similar names between the variables
 * Matrix -
 * 1 - COMPLETE
 * 2 - COMPLETE
 * 3 - COMPLETE
 * 4 -
 * 5 -
 * 6 -
 *
 *
 *
 * 7 -
 * 8 -
 * 9 -
 * 10 -
 * 11 -
 * 12 -
 * 13 -
 * 14 -
 * 15 -
 * 16 -
 * 17 -
 * 18 -
 * 19 -
 * 20 -
 * 21 -
 * 22 -
 * 23 -
 * 24 -
 * 25 -
 */