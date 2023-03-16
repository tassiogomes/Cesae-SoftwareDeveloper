import java.util.Scanner;
class Main {
  public static void main(String[] args) {


    // declare variables
    int cod_func, dias_trab, venc_dia = 40, sub_alimentacao = 5, total_venc, total_sub_alimentacao, total_venc_base;
    double total_geral,irs = 0.1, ss_func = 0.11, ss_ent_patronal = 0.2375, venc_base_liquido,       
           total_retencao_irs, total_ss_ambos;


    // start scanner
    Scanner input = new Scanner(System.in);

    // enter variables
    System.out.println("Introduza o código do funcionário: ");
    cod_func = input.nextInt();
    System.out.println("Introduza os dias trabalhados no mês: ");
    dias_trab = input.nextInt();

    // calculating variables

    total_sub_alimentacao = (sub_alimentacao * dias_trab);
    total_venc_base = (venc_dia * dias_trab);
    venc_base_liquido = (total_venc_base) - (total_venc_base * (irs + ss_func));
    total_retencao_irs = (total_venc_base) * irs;
    total_ss_ambos = (total_venc_base * ss_func) + (total_venc_base * ss_ent_patronal);
    total_geral = (venc_base_liquido + total_sub_alimentacao);
    

    // display results

    System.out.println("a) O código do funcionário é: " + cod_func);
    System.out.println("");
    System.out.println("a) O valor líquido a receber pelo vencimento é: " + venc_base_liquido);
    System.out.println("");
  	System.out.println("b) O total de subsídio alimentação é: " + total_sub_alimentacao);
    System.out.println("");
   	System.out.println("c) O valor da retenção de IRS é:  " + total_retencao_irs);
    System.out.println("");   
   	System.out.println("d) O valor total a entregar a SS por ambos é: :  " + total_ss_ambos);
    System.out.println("");       
    System.out.println("e) O valor total liquido é :  " + total_geral);
    System.out.println(""); 

    input.close();
    
  }
}