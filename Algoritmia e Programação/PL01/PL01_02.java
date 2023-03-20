import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    // declare variables
    float n1, n2, soma, subtracao, multiplicacao, divisao;
    
    // start scanner
    Scanner input = new Scanner(System.in);

    // enter variables
    System.out.println("Introduza o primeiro número");
    n1 = input.nextFloat();
    System.out.println("Introduza o segundo número");
    n2 = input.nextFloat();

    // results
    soma = n1 + n2;
    subtracao = n1 - n2;
    multiplicacao = n1 * n2;
    divisao = n1 / n2;

    // display results

    System.out.println("A soma é: " + soma);
    System.out.println("A subtracao é: " + subtracao);
    System.out.println("A multiplicacao é: " + multiplicacao);
    System.out.println("A divisao é: " + divisao);

    input.close();
      
  }
}

