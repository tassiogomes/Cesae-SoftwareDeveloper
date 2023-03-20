import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // start scanner
    Scanner input = new Scanner(System.in);

    // declare variables
    int n_sequencia, counter = 0 ,numero = 0, n2=0, temp = 0, controlo = 0;

    // entering values
    System.out.println("Digite a quantidade de números na sequência que deseja: ");
    n_sequencia = input.nextInt();
    System.out.println("--------------------------------------------------");

    
    // Controle
    while(counter< n_sequencia){
      System.out.println("Digite um numero: ");
      numero = input.nextInt();
      temp = numero;
      numero = n2;
      n2 = temp;
      counter++;
      if(n2 < numero){
        controlo++;
      }
    }
    if (controlo == 0){
      System.out.println("A ordem é crescente");
    } else{
      System.out.println("A ordem não é crescente");
    }

    
    System.out.println("--------------------------------------------------\n");
    System.out.println("numero: " + numero);
    System.out.println("n2: " + n2);
    System.out.println("Counter: " + counter);
    System.out.println("Controlo: " + controlo);
  }
}