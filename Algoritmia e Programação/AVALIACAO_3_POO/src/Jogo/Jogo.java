package Jogo;
import Entidades.*;
import Itens.Arma;
import Itens.ItemHeroi;
import Itens.PocaoHP;
import Itens.TiposHeroi;

import java.util.ArrayList;
import java.util.Scanner;


public class Jogo {

    /******************* Instanciar os personagens *************************/
    private static  Cavaleiro criarCavaleiro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do Cavaleiro:");
        String nome = scanner.nextLine();
        return new Cavaleiro(nome, 0, 0, 0, 0);
    }

    private static Feiticeiro criarFeiticeiro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do Feiticeiro:");
        String nome = scanner.nextLine();
        return new Feiticeiro(nome, 0, 0, 0, 0);
    }

    private static Arqueiro criarArqueiro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do Arqueiro:");
        String nome = scanner.nextLine();
        return new Arqueiro(nome, 0, 0, 0, 0);
    }
    public static void main(String[] args) {
        labirinto();
    }

    public static void labirinto() {
        Scanner scanner = new Scanner(System.in);

        /*********** Selecionar o tipo de herói *******************/
        int heroiEscolhido; // só usei uma int porque é mais eficiente em termos computacionais, apesar de me dar mais trabalho no tratamento de excepções do que uma string
        Heroi heroi = null;
        boolean opcaoValida = false;

        while (!opcaoValida) {
            System.out.println("Selecione o tipo de herói: ");
            System.out.println("1. Cavaleiro");
            System.out.println("2. Feiticeiro");
            System.out.println("3. Arqueiro");

            try {
                String input = scanner.nextLine();
                heroiEscolhido = Integer.parseInt(input);

                switch (heroiEscolhido) {
                    case 1:
                        heroi = criarCavaleiro();
                        opcaoValida = true;
                        break;
                    case 2:
                        heroi = criarFeiticeiro();
                        opcaoValida = true;
                        break;
                    case 3:
                        heroi = criarArqueiro();
                        opcaoValida = true;
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número de 1 a 3.");
            }
        }

        opcaoValida = false;
        int dificuldade = 0;

        while (!opcaoValida) {
            try {
                System.out.println("Selecione a dificuldade: ");
                System.out.println("1. Fácil");
                System.out.println("2. Difícil");

                String input = scanner.nextLine();
                dificuldade = Integer.parseInt(input);

                if (dificuldade == 1 || dificuldade == 2) {
                    opcaoValida = true;
                } else {
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número de 1 a 2.");
            }
        }

        //Definir os pontos de criação de personagem
        int pontosCriacao;
        int pontosVida;
        int pontosForca = 0;

        do {
            if (dificuldade == 1) {
                pontosCriacao = 300;
                System.out.println("Você tem 300 pontos de criação de personagem.");
            } else if (dificuldade == 2) {
                pontosCriacao = 220;
                System.out.println("Você tem 220 pontos de criação de personagem.");
            } else {
                System.out.println("Opção inválida. Encerrando o jogo.");
                return;
            }

            System.out.println("Distribua os pontos de criação entre vida e força.");
            System.out.println("Lembre-se: cada ponto de vida vale um ponto de criação e cada ponto de força vale 5 pontos de criação.");

            System.out.println("Pontos de vida disponíveis: " + pontosCriacao);
            System.out.println("Digite a quantidade de pontos de vida: ");
            pontosVida = scanner.nextInt();

            if (pontosVida > pontosCriacao) {
                System.out.println("Você não pode gastar mais pontos de vida do que os disponíveis.");
                continue;
            }

            System.out.println("Pontos de força disponíveis: " + ((pontosCriacao - pontosVida) / 5));
            System.out.println("Digite a quantidade de pontos de força: ");

            pontosForca = scanner.nextInt();

            if (pontosForca > (pontosCriacao - pontosVida) / 5) {
                System.out.println("Você não pode gastar mais pontos de força do que os disponíveis.");
                continue;
            }

            if (pontosVida + pontosForca * 5 != pontosCriacao) {
                System.out.println("Distribuição inválida. A soma dos pontos de vida e pontos de força deve ser igual aos pontos de criação.");
            }
        } while (pontosVida + pontosForca * 5 != pontosCriacao);

        //Atribuir vida e força ao herói
        heroi.setVida(pontosVida);
        heroi.setForca(pontosForca);

        // Atribuir ouro ao herói
        int ouro = 20;
        if (dificuldade == 2) {
            ouro = 15;
        }
        heroi.setOuro(ouro);

        // Iniciar o labirinto
        System.out.println("Iniciando o labirinto com o herói " + heroi.getClass().getSimpleName() + " " + heroi.getNome() +
                " na dificuldade " + (dificuldade == 1 ? "Fácil" : "Difícil") + ". Detalhes do herói: " +
                "Força: " + heroi.getForca() + ", Vida: " + heroi.getVida() + ", Ouro: " + heroi.getOuro() + ".");


        // instanciar inimigosm sem o mostrar detalhes, porque tem que ser segredo pro user
        NPC npc1 = new NPC("NPC 1", 100, 10);
        //npc1.mostrarDetalhes();

        NPC npc2 = new NPC("NPC 2", 80, 8);
        //npc2.mostrarDetalhes();

        NPC npc3 = new NPC("NPC 3", 120, 12);
        //npc3.mostrarDetalhes();

        NPC npc4 = new NPC("NPC 4", 150, 15);
        //npc4.mostrarDetalhes();

        NPC npc5 = new NPC("NPC 5", 90, 9);
       //npc5.mostrarDetalhes();

        // instância do arraylist que tem que ser passado como parâmetro na instância da PocaoHP
        ArrayList<TiposHeroi> tiposHeroi = new ArrayList<>();
        tiposHeroi.add(TiposHeroi.CAVALEIRO);
        tiposHeroi.add(TiposHeroi.ARQUEIRO);
        tiposHeroi.add(TiposHeroi.FEITICEIRO);

        // instância das PocaoHP
        PocaoHP pocao1 = new PocaoHP("PocaoHP1",10, tiposHeroi, 60);
        PocaoHP pocao2 = new PocaoHP("PocaoHP2",20, tiposHeroi, 85);
        PocaoHP pocao3 = new PocaoHP("PocaoHP3",30, tiposHeroi, 90);
        PocaoHP pocao4 = new PocaoHP("PocaoHP4",40, tiposHeroi, 135);
        PocaoHP pocao5 = new PocaoHP("Poção de Energia", 30, tiposHeroi, 0);
        PocaoHP pocao6 = new PocaoHP("Poção de Cura Avançada", 75, tiposHeroi, 0);
        PocaoHP pocao7 = new PocaoHP("Poção de Vida Extra", 50, tiposHeroi, 0);


        // instância de varios arraylist que tem que ser passado como parâmetro na instância de Arma

            // Todos os tipo de heroi
            ArrayList<TiposHeroi> todosTiposHeroi = new ArrayList<>();
            todosTiposHeroi.add(TiposHeroi.CAVALEIRO);
            todosTiposHeroi.add(TiposHeroi.ARQUEIRO);
            todosTiposHeroi.add(TiposHeroi.FEITICEIRO);


            // Combinação 5
            ArrayList<TiposHeroi> heroiCavaleiro = new ArrayList<>();
            heroiCavaleiro.add(TiposHeroi.CAVALEIRO);
            // Faça o que precisa com a combinacao5

            // Combinação 6
            ArrayList<TiposHeroi> heroiArqueiro = new ArrayList<>();
            heroiArqueiro.add(TiposHeroi.ARQUEIRO);
            // Faça o que precisa com a combinacao6

            // Combinação 7
            ArrayList<TiposHeroi> heroiFeiticeiro = new ArrayList<>();
            heroiFeiticeiro.add(TiposHeroi.FEITICEIRO);
            // Faça o que precisa com a combinacao7

            Arma arma1 = new Arma("Arma1", 5, todosTiposHeroi,20);
            Arma arma2 = new Arma("Arma2", 2, heroiCavaleiro,30);
            Arma arma3 = new Arma("Arma3", 10, heroiArqueiro,40);
            Arma arma4 = new Arma("Arma4", 2, heroiFeiticeiro,50);;
            Arma arma5 = new Arma("Flecha Envenenada", 5, todosTiposHeroi, 35);
            Arma arma6 = new Arma("Varinha Arcana", 6, heroiFeiticeiro, 25);
            Arma arma7 = new Arma("Espada Lendária", 1, heroiArqueiro, 55);
            Arma arma8 = new Arma("Arco Mágico", 2, heroiArqueiro, 45);
            Arma arma9 = new Arma("Cajado das Sombras", 5, heroiFeiticeiro, 35);


            // instancia do vendedor que recebe arraylist de itens já instanciados (inventario)
            Vendedor vendedor1 = new Vendedor();
            // Continuação do código anterior...
            vendedor1.adicionarItem(arma1);
            vendedor1.adicionarItem(arma2);
            vendedor1.adicionarItem(arma3);
            vendedor1.adicionarItem(arma4);
            vendedor1.adicionarItem(arma5);
            vendedor1.adicionarItem(arma6);
            vendedor1.adicionarItem(arma7);
            vendedor1.adicionarItem(arma8);
            vendedor1.adicionarItem(arma9);
            vendedor1.adicionarItem(pocao1);
            vendedor1.adicionarItem(pocao2);
            vendedor1.adicionarItem(pocao3);
            vendedor1.adicionarItem(pocao4);
            vendedor1.adicionarItem(pocao5);
            vendedor1.adicionarItem(pocao6);
            vendedor1.adicionarItem(pocao7);


        /**************************** ponto 11 ********************************/

        System.out.println("Bem-vindo ao Labirinto dos Perigos!");
        System.out.println("Você está na porta do labirinto, onde um vendedor está oferecendo itens à venda.");

        // Exibindo os itens disponíveis para compra
        System.out.println("Itens disponíveis para compra:");
        vendedor1.imprimirInventario();

        System.out.println("Deseja comprar algum item? (Digite o número correspondente ou 0 para avançar sem comprar)");

        int opcao = scanner.nextInt()-1;
        vendedor1.vender(heroi, opcao);

    }



        // Resto da lógica do labirinto...






}

//! APÓS A CONCLUSÃO FAZER JAVADOC!