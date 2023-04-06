import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigoFuncionario;
        String cargo;
        int diasTrabalhados;
        String decisao;

        do {
            do {
                System.out.print("Insira o código do funcionário: ");
                while (!input.hasNextInt()) {
                    System.out.print("Código do funcionário inválido. Insira um número inteiro: ");
                    input.next();
                }
                codigoFuncionario = input.nextInt();
            } while (codigoFuncionario <= 0);

            System.out.print("Gostaria de continuar? (s/n) ");
            decisao = input.next();

            if (decisao.equalsIgnoreCase("n")) {
                System.out.println("Obrigado por utilizar o programa.");
                input.close();
                System.exit(0);
            }

            do {
                System.out.print("Insira o cargo do funcionário (A, E ou O): ");
                cargo = input.next();
            } while (!cargo.equalsIgnoreCase("A") && !cargo.equalsIgnoreCase("E") && !cargo.equalsIgnoreCase("O"));

            System.out.print("Gostaria de continuar? (s/n) ");
            decisao = input.next();

            if (decisao.equalsIgnoreCase("n")) { 
                System.out.println("Obrigado por utilizar o programa.");
                input.close();
                System.exit(0);
            }

            do {
                System.out.print("Insira o número de dias trabalhados (entre 0 e 31): ");
                while (!input.hasNextInt()) {
                    System.out.print("Número de dias inválido. Insira um número inteiro: ");
                    input.next();
                }
                diasTrabalhados = input.nextInt();
            } while (diasTrabalhados < 0 || diasTrabalhados > 31);

            System.out.print("Gostaria de continuar? (s/n) ");
            decisao = input.next();

            if (decisao.equalsIgnoreCase("n")) {
                System.out.println("Obrigado por utilizar o programa.");
                input.close();
                System.exit(0);
            }

            System.out.println("Código do funcionário: " + codigoFuncionario);
            System.out.println("Cargo: " + cargo);
            System.out.println("Dias trabalhados: " + diasTrabalhados);
            System.out.println();


            System.out.print("Gostaria de continuar? (s/n) ");
            decisao = input.next();

            if (decisao.equalsIgnoreCase("n")) {
                System.out.println("Obrigado por utilizar o programa.");
                input.close();
                System.exit(0);
            }


        } while (true);

    }
}
