import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    //start scanner
    Scanner input = new Scanner(System.in);

    // declare variables
    int posicao, pontos;

    // enter values
    System.out.println("Digite a posição de chegada: ");
    posicao = input.nextInt();
    System.out.println("");

    // conditionals
    if (posicao == 1){
      pontos = 10;
      System.out.println("O piloto chegou na posição " + posicao + " e ganhou " + pontos + " pontos!");
    } else if (posicao == 2) {
      pontos = 8;
      System.out.println("O piloto chegou na posição " + posicao + " e ganhou " + pontos + " pontos!");
    } else if (posicao == 3) {
      pontos = 6;
      System.out.println("O piloto chegou na posição " + posicao + " e ganhou " + pontos + " pontos!");        } else if (posicao == 4) {
      pontos = 5;
      System.out.println("O piloto chegou na posição " + posicao + " e ganhou " + pontos + " pontos!");
    } else if (posicao == 5) {
      pontos = 4;
      System.out.println("O piloto chegou na posição " + posicao + " e ganhou " + pontos + " pontos!");        } else if (posicao == 6) {
      pontos = 3;
      System.out.println("O piloto chegou na posição " + posicao + " e ganhou " + pontos + " pontos!"); 
    } else if (posicao == 7) {
      pontos = 2;
      System.out.println("O piloto chegou na posição " + posicao + " e ganhou " + pontos + " pontos!");         } else{
      posicao = 8;
      pontos = 1;
      System.out.println("O piloto chegou na posição " + posicao + " e ganhou " + pontos + " pontos!"); 
      }

    input.close();

 }
}