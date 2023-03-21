import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("\n***** Ficha 4 - Exercicio 1 ******\n");

    // Instância obrigatória da classe para fazer a leitura das introduções de dados
    // do utilizador
    Scanner input = new Scanner(System.in);

    // Declarar variáveis
    int n1, n2, resultado;
    String operacao;
    
    // Entrada de dados
    System.out.println("Introduza o 1º número: \n");
    n1 = input.nextInt();
    System.out.println("Introduza o 2º número: \n");
    n2 = input.nextInt();
    System.out.println("Introduza uma operação + | * | / ");
    operacao = input.next();      
    System.out.println("--------------------------------------------------");
    

    // Controle
    do{
      do{
          System.out.println("Introduza uma operação + | - | * | / ");
          n2 = input.next();      
          System.out.println("--------------------------------------------------");
      }while(operacao != operacao.equals("+") || operacao != operacao.equals("-") || operacao != operacao.equals("*") || operacao != operacao.equals("/"));
    switch(operacao){
      case "+":
        resultado = (n1+n2);
        System.out.println("A soma (+) dos dois números é: " + resultado);
        break;
      case "-":
        resultado = (n1-n2);
        System.out.println("A subtração (-) dos dois números é: " + resultado);
        break;
      case "*":
        resultado = (n1*n2);
        System.out.println("A subtração (*) dos dois números é: " + resultado);
        break;
      case "/":
        resultado = (n1/n2);
        System.out.println("A subtração (/) dos dois números é: " + resultado);
        break;
    }
    }
  }
}