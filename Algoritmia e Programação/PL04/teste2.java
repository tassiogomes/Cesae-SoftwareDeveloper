import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // variables
        int cod_func, dias_trab;
        String cargo,decisao;
        Double bonus;
        double total_geral,irs, ss_func, ss_ent_patronal, venc_base_liquido,     
           total_retencao_irs, total_ss_ambos, sub_alimentacao, venc_dia, total_venc, total_venc_base_bonus, total_sub_alimentacao, total_venc_base;


        Scanner input = new Scanner(System.in);


        do {
            do {
                System.out.print("Insira o código do funcionário: ");
                while (!input.hasNextInt()) {
                    System.out.print("Código do funcionário inválido. Insira um número inteiro: ");
                    input.next();
                }
                cod_func = input.nextInt();
            } while (cod_func <= 0);

            System.out.print("Gostaria de continuar? (s/n) ");
            decisao = input.next();

            if (decisao.equalsIgnoreCase("n")) {
                System.out.println("Obrigado por utilizar o programa.");
                input.close();
                System.exit(0);
            }

            do {
                System.out.print("Insira o cargo do funcionário (E, C ou A): ");
                cargo = input.next();
            } while (!cargo.equalsIgnoreCase("E") && !cargo.equalsIgnoreCase("C") && !cargo.equalsIgnoreCase("A"));

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
                dias_trab = input.nextInt();
            } while (dias_trab < 0 || dias_trab > 31);

            System.out.print("Gostaria de continuar? (s/n) ");
            decisao = input.next();

            if (decisao.equalsIgnoreCase("n")) {
                System.out.println("Obrigado por utilizar o programa.");
                input.close();
                System.exit(0);
            }

            System.out.println("Código do funcionário: " + cod_func);
            System.out.println("Cargo: " + cargo);
            System.out.println("Dias trabalhados: " + dias_trab);
            System.out.println();



//--------------------- encerramento menu -----------------------------------------------


            // bonus
            if(dias_trab > 20){
                bonus = 0.05;
            }else if (dias_trab >= 17 && dias_trab <= 20){
                bonus = 0.02;
            } else {
                bonus = 0.0;
            }


            if(cargo.equalsIgnoreCase("e")){
                venc_dia = 40;
                sub_alimentacao = 5;
                ss_func = 0.11;
                ss_ent_patronal = 0.2375;
                total_venc_base = (venc_dia * dias_trab);
                total_venc_base_bonus = total_venc_base + (total_venc_base + bonus);
                if(total_venc_base_bonus < 1000){
                    irs = 0.10;
                }else if (total_venc_base_bonus >= 1000 && total_venc_base_bonus <= 2500) {
                    irs = 0.20;
                } else {
                    irs = 0.30;
                }
            

            System.out.println("O código do funcionário é: " + cod_func + " o cargo é: Empregado ");
            venc_base_liquido = (total_venc_base) - (total_venc_base * (irs + ss_func));
            System.out.println("a) O valor líquido a receber pelo vencimento é: " + venc_base_liquido);
            total_sub_alimentacao = (sub_alimentacao * dias_trab);
            System.out.println("b) O total de subsídio alimentação é: " + total_sub_alimentacao);
            total_retencao_irs = (total_venc_base) * irs;
            System.out.println("c) O valor da retenção de IRS é:  " + total_retencao_irs);
            total_ss_ambos = (total_venc_base * ss_func) + (total_venc_base * ss_ent_patronal);
            System.out.println("d) O valor total a entregar a SS por ambos é: :  " + total_ss_ambos);
            total_geral = (venc_base_liquido + total_sub_alimentacao);
            System.out.println("e) O valor total liquido é :  " + total_geral);


        } else if (cargo.equalsIgnoreCase("C")){
            venc_dia = 60;
            sub_alimentacao = 7.5;
            ss_func = 0.11;
            ss_ent_patronal = 0.2375;
            total_venc_base = (venc_dia * dias_trab);
            total_venc_base_bonus = total_venc_base + (total_venc_base + bonus);
            if(total_venc_base_bonus < 1000){
                irs = 0.10;
            }else if (total_venc_base_bonus >= 1000 && total_venc_base_bonus <= 2500) {
                irs = 0.20;
            } else {
                irs = 0.30;
            }

            System.out.println("O código do funcionário é: " + cod_func + " o cargo é: Chefe ");
            venc_base_liquido = (total_venc_base) - (total_venc_base * (irs + ss_func));
            System.out.println("a) O valor líquido a receber pelo vencimento é: " + venc_base_liquido);
            total_sub_alimentacao = (sub_alimentacao * dias_trab);
            System.out.println("b) O total de subsídio alimentação é: " + total_sub_alimentacao);
            total_retencao_irs = (total_venc_base) * irs;
            System.out.println("c) O valor da retenção de IRS é:  " + total_retencao_irs);
            total_ss_ambos = (total_venc_base * ss_func) + (total_venc_base * ss_ent_patronal);
            System.out.println("d) O valor total a entregar a SS por ambos é: :  " + total_ss_ambos);
            total_geral = (venc_base_liquido + total_sub_alimentacao);
            System.out.println("e) O valor total liquido é :  " + total_geral);




        } else if (cargo.equalsIgnoreCase("A")){
            venc_dia = 80;
            sub_alimentacao = 7.5;
            ss_func = 0.09;
            ss_ent_patronal = 0.21;
            total_venc_base = (venc_dia * dias_trab);
            total_venc_base_bonus = total_venc_base + (total_venc_base + bonus);
            if(total_venc_base_bonus < 1000){
                irs = 0.10;
            }else if (total_venc_base_bonus >= 1000 && total_venc_base_bonus <= 2500) {
                irs = 0.20;
            } else {
                irs = 0.30;
            }

            System.out.println("O código do funcionário é: " + cod_func + " o cargo é: Administrador ");
            venc_base_liquido = (total_venc_base) - (total_venc_base * (irs + ss_func));
            System.out.println("a) O valor líquido a receber pelo vencimento é: " + venc_base_liquido);
            total_sub_alimentacao = (sub_alimentacao * dias_trab);
            System.out.println("b) O total de subsídio alimentação é: " + total_sub_alimentacao);
            total_retencao_irs = (total_venc_base) * irs;
            System.out.println("c) O valor da retenção de IRS é:  " + total_retencao_irs);
            total_ss_ambos = (total_venc_base * ss_func) + (total_venc_base * ss_ent_patronal);
            System.out.println("d) O valor total a entregar a SS por ambos é: :  " + total_ss_ambos);
            total_geral = (venc_base_liquido + total_sub_alimentacao);
            System.out.println("e) O valor total liquido é :  " + total_geral);
        } // fecho do if inicial


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
