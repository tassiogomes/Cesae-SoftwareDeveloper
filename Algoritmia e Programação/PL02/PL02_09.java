import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    // start scanner
    Scanner input = new Scanner(System.in);

    // declare variables
    double n1, n2, n3, nota_final;

    // entering the variable
    System.out.println("Digitea primeira nota: ");
    n1 = input.nextInt();
    System.out.println("Digite a segunda nota: ");
    n2 = input.nextInt();
    System.out.println("Digite a terceira nota: ");
    n3 = input.nextInt();

    // calculating nota_final
    nota_final = (n1 * 0.25) + (n2 * 0.35) + (n3 * 0.40);

    
    // check final grade
    if(nota_final > 9.5){
      System.out.println("O nota final é " + nota_final + " e o aluno foi aprovado!");
    } else{
      System.out.println("O nota final é " + nota_final + " e o aluno foi reprovado!");
    }
    
    input.close();
  
  }
}