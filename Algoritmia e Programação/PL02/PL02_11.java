import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    //start scanner
    Scanner input = new Scanner(System.in);

    // declare variables
    double n1, n2, resultado;
    String operacao;

    // enter values
    System.out.println("Digite o primeiro número: ");
    n1 = input.nextInt();
    System.out.println("");
    System.out.println("Digite o segundo número: ");
    n2 = input.nextInt();
    System.out.println("");
    System.out.println("Digite a operacao desejada (+ | - | * | /): ");
    operacao = input.next();
    System.out.println("");    

    // conditionals
    switch(operacao){
      case "+":
        resultado = n1 + n2;
        System.out.println("A operação selecionada foi (+) e o resultado: " + resultado);
        break;
      case "-":
        resultado = n1 - n2;
        System.out.println("A operação selecionada foi (-) e o resultado: " + resultado);
        break;
      case "*":
        resultado = n1 * n2;
        System.out.println("A operação selecionada foi (*) e o resultado: " + resultado);
        break;
      case "/":
        resultado = n1 / n2;
        System.out.println("A operação selecionada foi (/) e o resultado é: " + resultado);
        break;
      default:
        System.out.println("As operações introduzidas não são válidas, por favor tente as seguintes opeações (+ | - | * | /)");
    }

    input.close();

 }
}