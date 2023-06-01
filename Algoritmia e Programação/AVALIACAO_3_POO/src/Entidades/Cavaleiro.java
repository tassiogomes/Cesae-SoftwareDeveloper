package Entidades;

import Itens.Arma;
import Itens.PocaoHP;

import java.util.ArrayList;

public class Cavaleiro extends Heroi {

    public Cavaleiro(String nome, int vida, int forca, int nivel, int ouro) {
        super(nome, vida, forca, nivel, ouro);
    }

    /**
     * Método subscrito da classe NPC
     *
     * @param npc
     */
    @Override
    public Entidade atacar(NPC npc) {
        while (this.getVida() > 0 && npc.getVida() > 0) {
            int danoInimigo = (int) (npc.getForca() * 0.8);
            this.subtrairVida(danoInimigo);
            System.out.println("A vida do Herói após o ataque sofrido é " + this.getVida());

            if (this.getVida() <= 0) {
                System.out.println("O herói foi derrotado.");
            } else {
                int danoHeroi = this.getForca() + this.getArma().getAtaque();
                npc.setVida(npc.getVida() - danoHeroi);
                System.out.println("A vida do inimigo após o ataque do herói é " + npc.getVida());

                if (npc.getVida() <= 0) {
                    System.out.println("O herói venceu!");
                }
            }
        }

        if (npc.getVida() <= 0) {
            System.out.println("Estou aqui");
            this.subirNivel();
            this.incrementarVida(10);
            this.incrementarForca(1);
            this.incrementarOuro(10);
            System.out.println("O herói subiu para o nível " + this.getNivel() + "!");
            System.out.println("A vida do herói aumentou em 10 pontos.");
            System.out.println("A força do herói aumentou em 1 ponto.");
            System.out.println("O herói recebeu 10 moedas de ouro.");
            return this;
        } else {
            return npc;
        }
    }


    /**
     * Método vindo da classe Entidade, obrigatório a todas.
     */
    @Override
    public void mostrarDetalhes() {
        System.out.println("Detalhes do Cavaleiro:");
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Força: " + getForca());
        System.out.println("Nível: " + getNivel());
        System.out.println("Ouro: " + getOuro());

        System.out.println("Arma:");
        if (getArma() != null) {
            System.out.println("- " + getArma().getNome());
        } else {
            System.out.println("Nenhuma arma equipada.");
        }

        System.out.println("Poções:");
        for (PocaoHP pocao : getPocoes()) {
            System.out.println("- " + pocao.getNome());
        }
    }

}