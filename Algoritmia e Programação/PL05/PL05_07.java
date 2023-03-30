import java.util.Scanner;


class Main {
  public static void main(String[] args) {
        // cria o array
        int controle = 3;
        int[] arr = new int[controle];
        int maior;

        // inicia o scanner e lê o primeiro número fora para testar o maior
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o 1º nº: ");
        arr[0] = input.nextInt();
        maior=arr[0];

        // lê os elementos do array
        for (int i = 1; i < controle; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            arr[i] = input.nextInt();
                if(arr[i]>maior && arr[i]% 2==0){ //testar o maior
                    maior=arr[i];
                }
            if(maior % 2 == 0){
                System.out.println("O maior par é :" + maior);
            }else{
            System.out.println("Só ímpares");
        }

    }

    input.close();

}
}