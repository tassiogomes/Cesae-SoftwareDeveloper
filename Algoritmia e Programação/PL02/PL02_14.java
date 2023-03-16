import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    // start scanner
    Scanner input = new Scanner(System.in);

    // declare variables
    double hora_em_24, hora_em_12;

    // entering the variable
    System.out.println("Digite uma hora no formato 24h : ");
    hora_em_24 = input.nextDouble();
    System.out.println("--------------------------------------------------------------");
    System.out.println("");
    
    // convert hour
    if (hora_em_24 ==  0 && hora_em_24 < 0.59){
      hora_em_12 = hora_em_24 + 12;
      System.out.println("A hora convertida em formato 12h é: " + hora_em_12 +"AM"); 
    } else if(hora_em_24 >=1 && hora_em_24 <= 11.59){
      System.out.println("A hora convertida em formato 12h é: " + hora_em_24 +"AM");
    } else if(hora_em_24 == 12){
      System.out.println("A hora convertida em formato 12h é: " + hora_em_24 +"PM");
    } else{
      hora_em_12 = hora_em_24 - 12;
      System.out.println("A hora convertida em formato 12h é: " + hora_em_12 +"PM"); 
    }
    
    input.close();
  
  }
}