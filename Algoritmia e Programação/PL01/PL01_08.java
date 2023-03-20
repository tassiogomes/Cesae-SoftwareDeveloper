import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    // start scanner
    Scanner input = new Scanner(System.in);
      
    // declare variables
    int m1_min, m1_sec, m2_min, m2_sec, m3_min, m3_sec, m4_min, m4_sec, m5_min, m5_sec;
    int soma_sec, soma_min;
    int hora, resto_minutos, resto_segundos;

    // input musica
    System.out.println("Introduza a duração em minutos da 1ª música: ");
    m1_min = input.nextInt();
    System.out.println("Introduza a duração em segundos da 1ª música: ");
    m1_sec = input.nextInt();
    System.out.println("Introduza a duração em minutos da 2ª música: ");
    m2_min = input.nextInt();
    System.out.println("Introduza a duração em segundos da 2ª música: ");
    m2_sec = input.nextInt();
    System.out.println("Introduza a duração em minutos da 3ª música: ");
    m3_min = input.nextInt();
    System.out.println("Introduza a duração em segundos da 3ª música: ");
    m3_sec = input.nextInt();
    System.out.println("Introduza a duração em minutos da 4ª música: ");
    m4_min = input.nextInt();
    System.out.println("Introduza a duração em segundos da 4ª música: ");
    m4_sec = input.nextInt();
    System.out.println("Introduza a duração em minutos da 5ª música: ");
    m5_min = input.nextInt();
    System.out.println("Introduza a duração em segundos da 5ª música: ");
    m5_sec = input.nextInt();

    // conversion

    soma_sec = (m1_sec + m2_sec + m3_sec + m4_sec + m5_sec);
    soma_min = (m1_min + m2_min + m3_min + m4_min + m5_min);

    resto_segundos = soma_sec % 60;
    resto_minutos = (soma_min % 60) + (soma_sec / 60);
    hora = (soma_min / 60);

    System.out.println("tempo: " + hora + ":" +  resto_minutos + ":" + resto_segundos);



    input.close();

    
  }
}