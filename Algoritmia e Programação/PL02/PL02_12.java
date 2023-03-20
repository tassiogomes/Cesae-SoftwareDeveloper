import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    //start scanner
    Scanner input = new Scanner(System.in);

    // declare variables
    double saldo_inicial, montante_debitado, saldo_final;
    String operacao;

    // entering values
    System.out.println("Digite o saldo incial: ");
    saldo_inicial = input.nextDouble();
    System.out.println("");
    System.out.println("Digite o montante a debitar: ");
    montante_debitado = input.nextDouble();
    System.out.println("");
    System.out.println("");

    // check positive or negative
    saldo_final = saldo_inicial - montante_debitado;

    // conditionals
      if(saldo_final >= 0){
          System.out.println("A sua operação foi bem sucedida: " + saldo_final);       
      } else {
          System.out.println("Operação não realizada devido ao saldo ficar negativo, tente um montante inferior!");
        }

    input.close();

    
    }



}