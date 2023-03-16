import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    // start scanner
    Scanner input = new Scanner(System.in);

    // declare variables
    int menu;

    // entering the variable
    System.out.println("Digite a sua opção | 1.Criar | 2.Atualizar | 3.Eliminar | 4.Sair | : ");
    menu = input.nextInt();
    System.out.println("--------------------------------------------------------------");
    
    // check menu
    switch(menu){
      case 1:
        System.out.println("Criar");
        break;
      case 2:
        System.out.println("Atualizar");
        break;
      case 3:
        System.out.println("Eliminar");
        break;
      case 4: 
        System.out.println("Sair");
        break;
    default:
        System.out.println("Seleção inválida, tente de novo!");  
    }
    
    input.close();
  
  }
}