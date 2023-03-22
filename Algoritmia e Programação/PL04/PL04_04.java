import java.util.Scanner;

class Main {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um número inteiro positivo: ");
        int num = input.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
              System.out.println("count" + count);
        }
        if (count == 2) {
            System.out.println(num + " é primo!");
        } else {
            System.out.println(num + " não é primo!");
        }
        input.close();
    }
}