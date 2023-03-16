import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    // declare retangle variables
    int l1, l2, area, perimetro;

  
    // start scanner
    Scanner input = new Scanner(System.in);

    // enter retangle variables
    System.out.println("Introduza o l1");
    l1 = input.nextInt();
    System.out.println("Introduza o l2");
    l2 = input.nextInt();

    // results retangle
    area = l1 * l2;
    perimetro = 2*(l1+l2);

    // display retangle results results

    System.out.println("A área do retângulo é: " +  area);
    System.out.println("");
    System.out.println("O perímetro do retângulo é: " +  perimetro);
    System.out.println("------------------------------------------");
    
    // declare circle variables
    double raio, pi = 3.14, area_circulo;
    

    // enter circle variables
    System.out.println("Introduza o raio da circunferência: ");
    raio = input.nextDouble();

    // results circle
    area_circulo = pi* (raio * raio);

    // display retangle results results
    System.out.println("A área do retângulo é: " +  area_circulo);
    System.out.println("");
    System.out.println("------------------------------------------");
    
    // declare triangle variables
    double t1, t2, t3, area_triangle;

    // enter triangle variables
    System.out.println("Introduza o t1");
    t1 = input.nextDouble();
    System.out.println("Introduza o t2");
    t2 = input.nextDouble();
    System.out.println("Introduza o t3");
    t3 = input.nextDouble();


    input.close();
      

    
  }
}
