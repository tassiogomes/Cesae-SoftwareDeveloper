import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    //start scanner
    Scanner input = new Scanner(System.in);

    // declare variables
    int salario;
    double taxa_1 = 0.2, taxa_2 = 0.3, taxa_final;

    // enter values
    System.out.println("Digite o salario: ");
    salario = input.nextInt();
    System.out.println("");

    // conditionals
    if (salario <= 15000){
      taxa_final = salario * taxa_1;
      System.out.println("A taxa a pagar é : " + taxa_final);
    } else{
        taxa_final = salario * taxa_2;
        System.out.println("A taxa a pagar é : " + taxa_final);
      }

    input.close();

 }
}