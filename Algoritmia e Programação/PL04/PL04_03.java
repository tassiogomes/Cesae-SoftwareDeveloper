import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("\n***** Ficha 4 - Exercicio 3 ******\n");

    // Instância obrigatória da classe para fazer a leitura das introduções de dados
    // do utilizador
    Scanner input = new Scanner(System.in);

    // Declarar variáveis
    int valor_secreto, valor_jogado, tentativas = 0;

    // Jogador 1 entrada do número secreto
        do {
            System.out.print("Jogador 1, insira um valor entre 0 e 100: ");
            while (!input.hasNextInt()) {
                System.out.print("Entrada inválida. Insira um número inteiro entre 0 e 100: ");
                input.next();
            }
            valor_secreto = input.nextInt();
        } while (valor_secreto < 0 || valor_secreto > 100);

    // Jogador 2, tentativa de acetar
    do{
        System.out.print("Jogador 2, tente adivinhar o valor: ");
        while (!input.hasNextInt()) {
                System.out.print("Entrada inválida. Insira um número inteiro entre 0 e 100: ");
                input.next();
        }
        valor_jogado = input.nextInt();
        tentativas++;
          if(valor_jogado < valor_secreto){
            System.out.println("O valor é menor que o número secreto, tente de novo!");
          }else if(valor_jogado > valor_secreto){
            System.out.println("O valor é maior que o número secreto, tente de novo!");
          }
    }while(valor_jogado != valor_secreto);
    System.out.println("Parabéns, você acertou o valor secreto: " + valor_secreto);
  }
}