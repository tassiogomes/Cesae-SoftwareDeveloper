import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);;

    // programa 1
    System.out.println("Programa 1");
    System.out.println("----------------------------------------------");
    System.out.println("");

    // variáveis
    int num_quarto, num_dias;
    double preco = 200 , limpeza = 25, desconto = 0.23;
    double custo_limpeza, receita_bruta, desconto_estado, lucro, lucro_quarto;


    // entrada de dados pelo utilizador
    System.out.print("Digite o número do quarto: ");
    num_quarto = input.nextInt();
    System.out.println("");

    System.out.print("Digite o número de dias que o quarto foi reservado no ano: ");
    num_dias = input.nextInt();
    System.out.println("");
    System.out.println("");

    // controle nº de dias
    if(num_dias > 365 || num_dias < 1)
    {
        System.out.println("Número de dias inválido, o valor aceito é ente 1 e 365.");
        System.exit(0); // encerramento do sistema
    }

    
    custo_limpeza = (limpeza * num_dias);
    receita_bruta = (preco * num_dias) - (custo_limpeza);
    desconto_estado = receita_bruta * desconto;
    lucro = receita_bruta - desconto_estado;
    lucro_quarto = (preco - limpeza) - ((preco - limpeza) * desconto);

    System.out.println("Total do custo da limpeza:  " + custo_limpeza);
    System.out.println("Receita Bruta: " + receita_bruta);
    System.out.println("Valor de descontos fiscais a entregar ao estado: " + desconto_estado);
    System.out.println("O valor ilíquido a receber pelas reservas totais: " + lucro);
    System.out.println("Valor líquido a receber pelo quarto: " + lucro_quarto );

    System.out.println("");
    System.out.println("");

    


    // programa 2
      System.out.println("Programa 2");
      System.out.println("----------------------------------------------");
      System.out.println("");

    // reinicializando as variáveis para recomeçar o programa
    String tipo_quarto;
    preco = 0 ; limpeza = 0 ; desconto = 0; custo_limpeza = 0; receita_bruta = 0; desconto_estado = 0; lucro = 0 ; lucro_quarto = 0;
           

    // entrada de dados pelo utilizador
    System.out.print("Digite o número do quarto: ");
    num_quarto = input.nextInt();
    System.out.println("");

    System.out.print("Digite o número de dias que o quarto foi reservado no ano: ");
    num_dias = input.nextInt();
    System.out.println("");

        // controle nº de dias
        if(num_dias > 365 || num_dias < 1){
            System.out.println("Número de dias inválido, o valor aceito é ente 1 e 365.");
            System.exit(0); // o sistema para
        }   

    // ler tipo do quarto - novo elemento para o item 2
    System.out.print("Tipo do quarto (I - Individual, D - Duplo, T - Triplo, S - Suite): ");
    tipo_quarto = input.next();


    if(!tipo_quarto.equals("I") && !tipo_quarto.equals("D") && !tipo_quarto.equals("T") && !tipo_quarto.equals("S")) {
            System.out.println("Erro no tipo de quarto! Introduza um tipo válido: I - Individual, D - Duplo, T - Triplo, S - Suite");
            System.exit(0); // encerramento do programa
        }
    System.out.println("");

    // conficionais

    switch (tipo_quarto) {
      case "I":
        preco = 200;
        limpeza = 25;
        break;
      case "D":
        preco = 250;
        limpeza = 30;
        break;
      case "T":
        preco = 275;
        limpeza = 30;
        break;
      case "S":
        preco = 350;
        limpeza = 50;
        break;
    };

    // O custo de limpeza e a receita bruta precia ser iniciada antes do if
      custo_limpeza = (limpeza * num_dias);
      receita_bruta = (preco * num_dias) - (custo_limpeza); 

    
      if (receita_bruta <= 20000) {
            desconto = 0.23;
    } else if (receita_bruta <= 50000) {
            desconto = 0.25;
    } else {
            desconto = 0.28;
    }

    
    desconto_estado = receita_bruta * desconto;
    lucro = receita_bruta - desconto;
    lucro_quarto = (preco - limpeza) - ((preco - limpeza) * desconto);


    System.out.println("O quarto intruduzito foi o " + num_quarto + " tipo de quarto é " + tipo_quarto+ " e o número de dias ocupado por ano é: " + num_dias);
    System.out.println("Total do custo da limpeza:  " + custo_limpeza);
    System.out.println("Receita Bruta: " + receita_bruta);
    System.out.println("Valor de descontos fiscais a entregar ao estado: " + desconto_estado);
    System.out.println("O valor ilíquido a receber pelas reservas totais: " + lucro);
    System.out.println("Valor líquido a receber pelo quarto: " + lucro_quarto );
    System.out.println("A % do desconto pro estado é: " + desconto);

    System.out.println("");
    System.out.println("----------------------------------------------");

    System.out.println("Tipo " + tipo_quarto);
    System.out.println("Preço " +  preco);
    System.out.println("limpeza " +  limpeza);






    input.close(); // fecho do scanner
    
    
  }
}