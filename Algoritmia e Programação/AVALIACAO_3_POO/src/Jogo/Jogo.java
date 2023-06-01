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
    /**
     * Método para instanciar um objeto Cavaleiro
     * @return
     */
    private static Cavaleiro criarCavaleiro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do Cavaleiro:");
        String nome = scanner.nextLine();
        return new Cavaleiro(nome, 0, 0, 0, 0);
    }

    /**
     * Método para instanciar um objeto Feiticeiro
     * @return
     */
    private static Feiticeiro criarFeiticeiro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do Feiticeiro:");
        String nome = scanner.nextLine();
        return new Feiticeiro(nome, 0, 0, 0, 0);
    }

    /**
     * Método para instanciar um objeto Arqueiro
     * @return
     */
    private static Arqueiro criarArqueiro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do Arqueiro:");
        String nome = scanner.nextLine();
        return new Arqueiro(nome, 0, 0, 0, 0);
    }

    /******************* Main ********************/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean venceu;
        String resposta = "";
        do {
            /*********** Selecionar o tipo de herói *******************/
            int heroiEscolhido; // só usei uma int porque é mais eficiente em termos computacionais, apesar de me dar mais trabalho no tratamento de excepções do que uma string
            Heroi heroi = null;
            boolean opcaoValida = false;

            while (!opcaoValida) {

                System.out.println("\nEscolhe o teu personagem: ");
                System.out.println("1. Cavaleiro");
                System.out.println("2. Feiticeiro");
                System.out.println("3. Arqueiro");
                System.out.print("->");

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
                            System.out.println("Opção inválida. Por favor, escolhe uma opção válida.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Opção inválida. Por favor, insere um número de 1 a 3.");
                }
            }

            opcaoValida = false;
            int dificuldade = 0;

            while (!opcaoValida) {
                try {
                    System.out.println("\nEscolhe o nível de dificuldade: ");
                    System.out.println("1. Fácil");
                    System.out.println("2. Difícil");
                    System.out.print("->");

                    String input = scanner.nextLine();
                    dificuldade = Integer.parseInt(input);

                    if (dificuldade == 1 || dificuldade == 2) {
                        opcaoValida = true;
                    } else {
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Opção inválida. Por favor, insira um número de 1 a 2.");
                }
            }

            //Definir os pontos de criação de personagem
            int pontosCriacao;
            int pontosVida;
            int pontosForca = 0;

            do {
                if (dificuldade == 1) {
                    pontosCriacao = 300;
                    System.out.println("\nTens 300 pontos de criação da personagem.");
                } else if (dificuldade == 2) {
                    pontosCriacao = 220;
                    System.out.println("Tens tem 220 pontos de criação da personagem.");
                } else {
                    System.out.println("Opção inválida. Jogo terminado.");
                    return;
                }

                System.out.println("Distribui os pontos de criação entre vida e força.");
                System.out.println("Nota: cada ponto de vida vale um ponto de criação e cada ponto de força vale 5 pontos de criação.");

                System.out.println("\nPontos de vida disponíveis: " + pontosCriacao);
                System.out.println("Quantos pontos pretendes atribuir a vida? ");
                pontosVida = scanner.nextInt();

                if (pontosVida > pontosCriacao) {
                    System.out.println("Não podes usar mais pontos de vida do que os disponíveis.");
                    continue;
                }

                System.out.println("Pontos de força disponíveis: " + ((pontosCriacao - pontosVida) / 5));
                System.out.println("Quantos pontos pretendes atribuir a força? ");

                pontosForca = scanner.nextInt();

                if (pontosForca > (pontosCriacao - pontosVida) / 5) {
                    System.out.println("Não podes gastar mais pontos de força do que os disponíveis.");
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
            int ouro;
            if (dificuldade == 1) {
                ouro = 20;
            } else {
                ouro = 15;
            }
            heroi.setOuro(ouro);

            // Iniciar o labirinto
            System.out.println("\nO " + heroi.getClass().getSimpleName() + " " + heroi.getNome() +
                    " vai iniciar esta jornada épica na dificuldade " + (dificuldade == 1 ? "Fácil" : "Difícil") + ". \nDetalhes do herói: " +
                    "Força: " + heroi.getForca() + ", Vida: " + heroi.getVida() + ", Ouro: " + heroi.getOuro() + ".");

            venceu = labirinto(0, heroi);
            if (venceu) {
                System.out.println("yei");
                heroi.mostrarDetalhes();
            } else {
                System.out.println("game over");
                System.out.println("deseja tentar de novo? S/N");
                resposta = scanner.next();
                resposta = resposta.toUpperCase();
                //input de reposta. se resposta for sim corre tudo de novo
            }

        } while (resposta.equals("S"));
    }

    /**
     * Método para reinício de jogo ou terminar o jogo.
     * @param message
     */
    private static void reset(String message)
    {
        if(message != null) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("\n" + message + "\n");

            int op;
            do{
                System.out.println("\n1 - Continuar a jogar!");
                System.out.println("\n2 - Sair");
                op = scanner.nextInt();
            }while (op < 1 || op > 2);

            if(op == 1) {
                main(null);
            }
        }
    }


    /**
     * Início do labirinto
     * @param op
     * @param heroi
     * @return
     */
    public static boolean labirinto(int op, Heroi heroi) {
        Scanner scanner = new Scanner(System.in);
        boolean p = false;
        // instanciar inimigosm sem o mostrar detalhes, porque tem que ser segredo pro user
        NPC npc1 = new NPC("Cybertron", 100, 10);
        //npc1.mostrarDetalhes();

        NPC npc2 = new NPC("Xenotech", 80, 8);
        //npc2.mostrarDetalhes();

        NPC npc3 = new NPC("Nexus Prime", 120, 12);
        //npc3.mostrarDetalhes();

        NPC npc4 = new NPC("Reaper-9", 150, 15);
        //npc4.mostrarDetalhes();

        NPC npc5 = new NPC("Shadowbyte", 90, 9);
        //npc5.mostrarDetalhes();
        NPC npc6 = new NPC("Nova Cyborg", 110, 11);
        //npc6.mostrarDetalhes();

        NPC npc7 = new NPC("Venomatrix", 95, 9);
        //npc7.mostrarDetalhes();

        NPC npc8 = new NPC("Quantum Guardian", 130, 13);
        //npc8.mostrarDetalhes();

        NPC npc9 = new NPC("Spectron", 85, 8);
        //npc9.mostrarDetalhes();

        NPC npc10 = new NPC("Neurobot", 120, 12);
        //npc10.mostrarDetalhes();



        /**
         // instância do arraylist que tem que ser passado como parâmetro na instância da PocaoHP
         ArrayList<TiposHeroi> tiposHeroi = new ArrayList<>();
         tiposHeroi.add(TiposHeroi.CAVALEIRO);
         tiposHeroi.add(TiposHeroi.ARQUEIRO);
         tiposHeroi.add(TiposHeroi.FEITICEIRO);*/ // apagar
        // se nao apagar trocar as instancias da poção para cá, entre esse codigo comentado e os proximos arrayslist


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


        // instância das PocaoHP
        PocaoHP pocao1 = new PocaoHP("PocaoHP1", 1, todosTiposHeroi, 60);
        PocaoHP pocao2 = new PocaoHP("PocaoHP2", 2, todosTiposHeroi, 85);
        PocaoHP pocao3 = new PocaoHP("PocaoHP3", 3, todosTiposHeroi, 90);
        PocaoHP pocao4 = new PocaoHP("PocaoHP4", 4, todosTiposHeroi, 135);
        PocaoHP pocao5 = new PocaoHP("Poção de Energia", 3, todosTiposHeroi, 20);
        PocaoHP pocao6 = new PocaoHP("Poção de Cura Avançada", 7, todosTiposHeroi, 100);
        PocaoHP pocao7 = new PocaoHP("Poção de Vida Extra", 5, todosTiposHeroi, 200);

        Arma arma1 = new Arma("Arma1", 5, todosTiposHeroi, 20);
        Arma arma2 = new Arma("Arma2", 2, heroiCavaleiro, 30);
        Arma arma3 = new Arma("Arma3", 10, heroiArqueiro, 40);
        Arma arma4 = new Arma("Arma4", 2, heroiFeiticeiro, 50);
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

        //int opcao =
        switch (op) {
            case 0:
                System.out.println("\nNos limites da cidade-fortaleza de Avaloria, \nem um mundo futurista repleto de tecnologia avançada, nos deparamos com um vendedor ambulante em sua nave espacial, \noferecendo os mais modernos equipamentos para enfrentarmos os desafios que nos aguardam.\n");

                //Mostrar itens disponíveis para compra
                vendedor1.imprimirInventario();
                vendedor1.vender(heroi);

                do {
                    System.out.println("Chegou o momento de iniciarmos nossa jornada futurista e temos duas opções:");
                    System.out.println("1 - Explorar a Cidade Subterrânea de Neon");
                    System.out.println("2 - Conquistar a Estação Espacial Abandonada");

                    op = scanner.nextInt();

                } while (op != 1 && op != 2);

                labirinto(op, heroi);

                break;

            case 1:
                System.out.println("\nCorajoso! É preciso ousadia para explorar a Cidade Subterrânea de Neon.");
                System.out.println("\nAdentrando as entranhas da cidade, você se depara com um mundo de luzes brilhantes e tecnologia avançada.");
                System.out.println("\nA cada esquina, novas maravilhas e perigos aguardam. Esteja preparado!");
                System.out.println("\nPrepare-se para enfrentar o temível Cybertron!");

                p = (heroi.atacar(npc1) == heroi);
                if (p == true) {

                    heroi.usarPocao();
                    heroi.mostrarDetalhes();

                    System.out.println("\nEscolha uma opção: ");
                    System.out.println("2 - Estação Espacial Abandonada");
                    System.out.println("3 - Megacidade Flutuante");

                    do {
                        op = scanner.nextInt();
                    } while (op != 2 && op != 3);

                    labirinto(op, heroi);
                } else reset("Game Over!!!");

                break;

            case 2:
                System.out.println("\nDeterminado, você parte em direção à Estação Espacial Abandonada.");
                System.out.println("\nA escuridão e o silêncio prevalecem neste local misterioso, onde segredos do universo podem ser revelados.");
                System.out.println("\nPrepare-se para enfrentar o temível Xenotech!");

                p = (heroi.atacar(npc2) == heroi);
                if (p == true) {
                    heroi.usarPocao();
                    heroi.mostrarDetalhes();

                    labirinto(3, heroi);
                } else reset("Game Over!!!");

                break;

            case 3:
                System.out.println("\nSempre avançando!");
                System.out.println("Vamos entrar na Megacidade Flutuante!");

                System.out.println("\nVENDEDOR: 'Olá, caro viajante!'");
                System.out.println("Interessado em alguns dos meus itens?\n");
                System.out.println("Detalhes do vendedor:");

                vendedor1.imprimirInventario();

                System.out.println("Insira o número correspondente ou 0 para avançar sem comprar)");

                vendedor1.vender(heroi);

                labirinto(4, heroi);

                break;

            case 4:

                System.out.println("\nChegamos a um caminho cheio de possibilidades:");
                System.out.println("Você chegou a uma nova cidade!");
                System.out.println("Bem-vindo(a) à cidade de Lumina!");
                System.out.println("Esta é uma cidade repleta de magia e mistérios.");
                System.out.println("Explore-a e descubra suas maravilhas!");
                System.out.println("Ah, só um aviso: recentemente, temos enfrentado problemas com um monstro conhecido como Delta-7.");

                p = (heroi.atacar(npc3) == heroi);
                if (p == true) {
                    heroi.usarPocao();
                    heroi.mostrarDetalhes();
                    System.out.println("Por onde vamos seguir?");
                    System.out.println("5 - Rota da Floresta Lunar");
                    System.out.println("6 - Caminho do Deserto de Plasma");

                    do {
                        op = scanner.nextInt();
                    } while (op != 5 && op != 6);

                    labirinto(op, heroi);
                    break;
                }

            case 5:
                System.out.println("\nVocê decidiu seguir a Rota da Floresta Lunar.");
                System.out.println("\nAdentrando a floresta, você se depara com uma paisagem exuberante, iluminada por plantas bioluminescentes e criaturas misteriosas.");
                System.out.println("\nPrepare-se para enfrentar o temível Reaper-9!");


                p = (heroi.atacar(npc4) == heroi);
                if (p == true) {
                    heroi.usarPocao();
                    heroi.mostrarDetalhes();
                    System.out.println("Por onde vamos seguir?");
                    System.out.println("9 - Nexus Quântico");
                    System.out.println("11 - Metrópole Aeroportuária de NeoTokyo");

                    do {
                        op = scanner.nextInt();
                    } while (op != 9 && op != 11);

                    labirinto(op, heroi);

                } else reset("Game Over!!!");
                break;

            case 6:
                System.out.println("\nPrepare-se para adentrar no Caminho do Deserto de Plasma, uma região árida e perigosa.");
                System.out.println("Neste deserto futurista, correntes de plasma dançam pelo ar, criando um cenário deslumbrante e mortal.");
                System.out.println("Esteja pronto para enfrentar os desafios e mistérios que aguardam!");
                System.out.println("\nPrepare-se para enfrentar o poderoso Shadowbyte!");


                p = (heroi.atacar(npc5) == heroi);
                if (p == true) {
                    heroi.usarPocao();
                    heroi.mostrarDetalhes();
                    System.out.println("Por onde vamos seguir?");
                    System.out.println("7 - Ruínas Cibernéticas");
                    System.out.println("8 - Metrópole Holográfica");

                    do {
                        op = scanner.nextInt();
                    } while (op != 7 && op != 8);

                    labirinto(op, heroi);

                } else reset("Game Over!!!");
                break;

            case 7:
                System.out.println("\nBem-vindo às Ruínas Cibernéticas, um lugar repleto de fragmentos de antigas tecnologias.");
                System.out.println("Nas profundezas destas ruínas, segredos do passado tecnológico aguardam para serem descobertos.");
                System.out.println("Explore com cuidado e esteja preparado para desafios cibernéticos!");
                System.out.println("\nPrepare-se para enfrentar o temível Nexus Prime!");


                p = (heroi.atacar(npc6) == heroi);
                if (p == true) {
                    heroi.usarPocao();
                    heroi.mostrarDetalhes();
                    System.out.println("Parabéns, vai avançar para Cidade Futurista ");
                    labirinto(10, heroi);

                } else reset("Game Over!!!");
                break;


            case 8:
                System.out.println("\nBem-vindo à Metrópole Holográfica, uma cidade do futuro onde realidade e hologramas se misturam.");
                System.out.println("Nas ruas movimentadas desta metrópole, você encontrará arranha-céus brilhantes e tecnologias avançadas.");
                System.out.println("Descubra os segredos ocultos e desvende a complexidade desta metrópole holográfica!");
                System.out.println("\nPrepare-se para enfrentar o temível Alpha-X!");


                p = (heroi.atacar(npc6) == heroi);
                if (p == true) {
                    heroi.usarPocao();
                    heroi.mostrarDetalhes();
                    System.out.println("Parabéns, vai avançar para Cidade Futurista ");
                    labirinto(10, heroi);

                } else reset("Game Over!!!");
                break;


            case 9:
                System.out.println("\nVocê chegou ao Nexus Quântico, um ponto de convergência entre realidades paralelas.");
                System.out.println("Neste local, as leis da física se curvam e a tecnologia alcança novos limites.");
                System.out.println("Prepare-se para enfrentar a entidade cósmica conhecida como Chronos!");
                System.out.println("\nPrepare-se para enfrentar o temível Delta-7!");

                p = (heroi.atacar(npc8) == heroi);
                if (p == true) {
                    heroi.usarPocao();
                    heroi.mostrarDetalhes();
                    System.out.println("Parabéns, vai avançar para Cidade Futurista ");
                    labirinto(11, heroi);

                } else reset("Game Over!!!");
                break;

            case 10:
                System.out.println("\nBem-vindo à Cidade Futurista, um marco da tecnologia e inovação.");
                System.out.println("Esta cidade é um exemplo vivo de como a humanidade avançou no campo da ciência e da engenharia.");
                System.out.println("Prédios altos e reluzentes, veículos voadores e robôs inteligentes são comuns nesta metrópole do futuro.");
                System.out.println("\nPrepare-se para enfrentar o temível Omega Prime!");

                p = (heroi.atacar(npc10) == heroi);
                if (p == true) {
                    heroi.usarPocao();
                    heroi.mostrarDetalhes();
                    System.out.println("Parabéns, vai avançar para Cidade Futurista ");
                    labirinto(11, heroi);

                } else reset("Game Over!!!");
                break;

            case 11:
                System.out.println("\nBem-vindo à Metrópole Aeroportuária de NeoTokyo!");
                System.out.println("Esta cidade futurista é um centro de inovação e movimentação constante.");
                System.out.println("Parabéns! Você chegou ao final do jogo e é o vencedor!");
                System.out.println("Obrigado por jogar!");
                System.exit(0);
                break;
        }

        return true;
    }
}




//! APÓS A CONCLUSÃO FAZER JAVADOC!