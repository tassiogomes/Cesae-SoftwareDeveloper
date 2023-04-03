import java.util.Scanner;


class Main {
  public static void main(String[] args) {
        // cria o array
        int controle = 3;
        int[] arr = new int[controle];
        
        
        // lê os elementos do array
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < controle; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            arr[i] = sc.nextInt();
        }
        
        // verifica se o array está em ordem crescente
        boolean crescente = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                crescente = false;
                break;
            }
        }
      // exibe o resultado
        if (crescente) {
            System.out.println("Os números estão em ordem crescente.");
        }else{
          System.out.println("Os números não estão em ordem decrescente.");
        }
    sc.close();
}
}
