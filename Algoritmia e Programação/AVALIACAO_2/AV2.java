import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AV2{


    public static void main(String[] args) throws FileNotFoundException {

        
        System.out.println(" ");
        System.out.println("Avaliação 2 de Algoritmia e Programação - Programação Estruturada");
        System.out.println(" ");
        System.out.println("Elabore um menu, que permita ao utilizador escolher o que pretende fazer, sendo que as opções terão de corresponder ao número do exercício seguido da sua descrição.");
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------");
        System.out.println(" ");


        // ****** MENU ******
        Scanner input = new Scanner(System.in); // Initializing the scanner

        int menuOption = -1;
        do {
            // Graphical layout of the actual menu functions based on user input and followed by corresponding descriptive text.
            System.out.println("****** Menu GameStart");
            System.out.println("1 - Imprimir o conteúdo da base de dados");
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

                            try{
                                databasePrinter();          // call function databasePrinter
                                
                            } catch(FileNotFoundException exc){
                                System.out.println("Erro: o ficheiro não existe. Verifique o diretório correto.");
                            } catch(NumberFormatException exc){
                                System.out.println("Erro: Não é possível converter String em formatos numéricos.");
                            }
                            break;
                        }
                        case 2:
                        try {
                            totalSales();
                        } catch (FileNotFoundException exception) {
                            System.out.println("Erro: o ficheiro não existe. Verifique o diretório correto.");
                        } catch (NumberFormatException exception) {
                            System.out.println("Erro: Não é possível converter String em formatos numéricos.");
                        }
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

        public static void databasePrinter() throws FileNotFoundException{
            System.out.println("1 - Imprimir o conteúdo da base de dados");
            System.out.println("--------------------------------------------");

            File file = new File("GameStart.csv");              
            Scanner scanner = new Scanner(file);                    // read file database
    
            while (scanner.hasNextLine()) {                         // read while it has lines
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        }
        

        public static void totalSales() throws FileNotFoundException {
            System.out.println("2 - Calcular o total de vendas e o valor total");
            System.out.println("-----------------------------------------------");
        
            // Inicializa as variáveis que vão guardar o total de vendas e o valor total
            int totalSales = 0;
            double totalValue = 0.0;
        
            // Abre o arquivo CSV e cria um objeto Scanner para ler o conteúdo
            File file = new File("GameStart.csv");
            Scanner scanner = new Scanner(file);
        
            scanner.nextLine(); // Pula a primeira linha, que contém o cabeçalho
        
            // Percorre as linhas do arquivo CSV, calculando o total de vendas e o valor total
            while (scanner.hasNextLine()) {
                String[] fields = scanner.nextLine().split(";"); // Lê a linha e separa os campos por ponto e vírgula
                double price = Double.parseDouble(fields[8]); // Converte o campo de valor para double
                totalSales += 1; // Adiciona uma venda à variável totalSales
                totalValue += price; // Adiciona o valor total da venda à variável totalValue
            }
        
            scanner.close(); // Fecha o objeto Scanner
        
            // Imprime o total de vendas e o valor total na tela
            System.out.println("Total de vendas: " + totalSales);
            System.out.println("Valor total das vendas: R$ " + totalValue);
        }
        
        
        

    } // chavetas  public class
