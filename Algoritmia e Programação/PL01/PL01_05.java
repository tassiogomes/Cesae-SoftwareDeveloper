import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    // declare variables
    int n1, n2, n3;
    double m_aritmetica, m_ponderada;

  
    // start scanner
    Scanner input = new Scanner(System.in);

    // enter variables
    System.out.println("Introduza o n1");
    n1 = input.nextInt();
    System.out.println("Introduza o n2");
    n2 = input.nextInt();
    System.out.println("Introduza o n3");
    n3 = input.nextInt();

    // results
    m_aritmetica = (n1 + n2 + n3) / 3;
    m_ponderada = ((n1*0.2) + (n2*0.3) + (n3*0.5));

    // display results

    System.out.println("A media aritmetica é: " +  m_aritmetica);
    System.out.println("");
    System.out.println("O media ponderada é: " +  m_ponderada);

    input.close();
      

    
  }
}