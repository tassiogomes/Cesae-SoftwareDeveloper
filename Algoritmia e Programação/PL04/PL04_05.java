import java.util.Scanner;

class Main {
  public static void main(String[] args) {


    // declare variables
    int cod_func, bonus;
    double total_geral,irs, ss_func, ss_ent_patronal, venc_base_liquido,       
           total_retencao_irs, total_ss_ambos, sub_alimentacao,
           dias_trab, venc_dia, total_venc, total_sub_alimentacao, total_venc_base;
    String cargo;


    // start scanner
    Scanner input = new Scanner(System.in);

    // enter variables
    System.out.println("Introduza o código do funcionário: ");
    cod_func = input.nextInt();
    System.out.println("Introduza o cargo do funcionário: ");
    cargo = input.next();
    do {
        System.out.print("Introduza o nº de dias trabalhados no mês: ");
        while (!input.hasNextInt()) {
            System.out.print("Entrada inválida. Insira um número inteiro entre 0 e 31: ");
            input.next();
        }
        dias_trab = input.nextInt();
    } while (dias_trab < 0 || dias_trab >= 31);


    // calculating variables
    
    if (cargo.equals("e") || cargo.equals("E")){
      venc_dia = 40;
      sub_alimentacao = 5;
      ss_func = 0.11;
      ss_ent_patronal = 0.2375;
      total_venc_base = venc_dia * dias_trab;
      if(total_venc_base < 1000){
          irs = 0.10;
      }else {
          irs = 0.20;
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
      
    }else if (cargo.equals("c") || cargo.equals("C")){
      venc_dia = 60;
      sub_alimentacao = 7.5;
      ss_func = 0.09;
      ss_ent_patronal = 0.21;
      total_venc_base = venc_dia * dias_trab;
      if(total_venc_base < 1000){
          irs = 0.10;
      }else {
          irs = 0.20;
      }
          System.out.println("O código do funcionário é: " + cod_func + " o cargo é: Chefe. ");
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

    }else if(cargo.equals("a") || cargo.equals("A")){
      venc_dia = 80;
      sub_alimentacao = 7.5;
      ss_func = 0.09;
      ss_ent_patronal = 0.21;
      total_venc_base = venc_dia * dias_trab;
      if(total_venc_base < 1000){
          irs = 0.10;
      }else {
          irs = 0.20;
      }
          System.out.println("O código do funcionário é: " + cod_func + " o cargo é: Administrador.");
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
      
    }

    input.close();
    
  }
}