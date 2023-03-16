import java.util.Scanner;
class Main {
  public static void main(String[] args) {


    // declare variables
    double saldo_medio, total_credito, cred0 = 0, cred20 = 0.20, cred30 = 0.30, cred40 = 0.40;

    // start scanner
    Scanner input = new Scanner(System.in);

    // enter variables
    System.out.println("Introduza saldo médio do cliente: ");
    saldo_medio = input.nextDouble();
    System.out.println("------------------------------------------------");
    System.out.println("");
    
    // calculating variables
    if (saldo_medio >= 0 && saldo_medio <= 2000){
      System.out.println("O saldo médio introduzido não permite crédito!");
    } else if (saldo_medio > 2000 && saldo_medio <= 4000){
      total_credito = saldo_medio * cred20;
      System.out.println("O saldo médio é " +  saldo_medio + " e o crédito permitido é: " + total_credito);
    } else if (saldo_medio > 4000 && saldo_medio <= 6000){
      total_credito = saldo_medio * cred30;
      System.out.println("O saldo médio é " +  saldo_medio + " e o crédito permitido é: " + total_credito);
    } else {
      total_credito = saldo_medio * cred40;
      System.out.println("O saldo médio é " +  saldo_medio + " e o crédito permitido é: " + total_credito);
    }
    
    input.close();
    
  }
}