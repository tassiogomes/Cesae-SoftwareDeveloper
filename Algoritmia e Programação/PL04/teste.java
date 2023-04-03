import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("\n***** Ficha 4 - Exercicio 1 ******\n");

    // Instância obrigatória da classe para fazer a leitura das introduções de dados
    // do utilizador
    Scanner input = new Scanner(System.in);

    // Declarar variáveis
    int n1, n2, resultado;
    String operacao, decisao = "y";
    
    // Entrada de dados

    
    // Controle
    do  {
      do{
            System.out.println("Introduza o 1º número: \n");
            n1 = input.nextInt();
            System.out.println("Introduza o 2º número: \n");
            n2 = input.nextInt();   
            System.out.println("Gostaria de tentar de novo? (y/n)\n");
            decisao = input.next();  
            System.out.println("--------------------------------------------------");
            System.out.println("Introduza uma operação | + | - | * | / |");
            operacao = input.next();      
            System.out.println("--------------------------------------------------");

      }while(!operacao.equals("+") && !operacao.equals("-") && !operacao.equals("*") && !operacao.equals("/")  && !decisao.equals("n"));
    switch(operacao){
      case "+":
        resultado = (n1+n2);
        System.out.println("A soma (+) dos dois números é: " + resultado + "\n");
        System.out.println("Gostaria de tentar de novo? (y/n)\n");
        decisao = input.next();
        break;
      case "-":
        resultado = (n1-n2);
        System.out.println("A subtração (-) dos dois números é: " + resultado + "\n");
        System.out.println("Gostaria de tentar de novo? (y/n)\n");
        decisao = input.next();
        break;
      case "*":
        resultado = (n1*n2);
        System.out.println("A multiplicação (*) dos dois números é: " + resultado + "\n");
        System.out.println("Gostaria de tentar de novo? (y/n)\n");
        decisao = input.next();
        break;
      case "/":
        resultado = (n1/n2);
        System.out.println("A subtração (/) dos dois números é: " + resultado + "\n");
        System.out.println("Gostaria de tentar de novo? (y/n)\n");
        decisao = input.next();
        break;
    }
    }while (!decisao.equals("n"));
    System.out.println("Obrigado, até a próxima!");
  }
  }