import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("\n***** Ficha 4 - Exercicio 2 ******\n");

    // Instância obrigatória da classe para fazer a leitura das introduções de dados
    // do utilizador
    Scanner input = new Scanner(System.in);

    // Declarar variáveis
    int escolha;
    String nome="";
    
    // Controle
    do{
      System.out.println("Escolha uma das opções: 1-Criar | 2-Atualizar | 3-Elimianr | 4-Sair/n");
      System.out.println("");
      escolha = input.nextInt();
      System.out.println("");
      switch(escolha){
        case 1:
          nome = "Criar";
          System.out.println("A opção escolhida foi: " + nome);
          System.out.println("");
          System.out.println("--------------------------------");
          break;
        case 2:
          nome = "Atualizar";
          System.out.println("A opção escolhida foi: " + nome);
          System.out.println("");
          System.out.println("--------------------------------");
          break;
        case 3:
          nome = "Eliminar";
          System.out.println("A opção escolhida foi: " + nome);
          System.out.println("");
          System.out.println("--------------------------------");
          break;
        default:
          nome = "Sair";
          System.out.println("Programa terminado!");
          System.out.println("");
          System.out.println("--------------------------------");
          break;
        }
    }while(escolha != 4);
}
}