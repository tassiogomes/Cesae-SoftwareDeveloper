package Entidades;

import Itens.Arma;
import Itens.PocaoHP;

import java.util.ArrayList;

public class Arqueiro extends Heroi {
    public Arqueiro(String nome, int vida, int forca, int nivel, int ouro) {
        super(nome, vida, forca, nivel, ouro);
    }

    /**
     * Método subscrito da classe NPC
     * @param npc
     */
    @Override
    public void atacar(NPC npc) {
        while (true) {
            // O herói ataca primeiro
            int danoHeroi = this.getForca() + this.getArma().getAtaque();
            npc.setVida(npc.getVida() - danoHeroi);

            // Verifica se o inimigo ainda está vivo
            if (npc.getVida() <= 0) {
                System.out.println("O herói venceu!");
                this.subirNivel();
                this.incrementarVida(10);
                this.incrementarForca(1);
                this.incrementarOuro(10);
                break;
            }

            // O inimigo ataca
            int danoInimigo = npc.getForca();

            // O arqueiro recebe 10% de dano adicional
            int danoRecebido = (int) (danoInimigo * 1.1);
            this.subtrairVida(danoRecebido);

            // Verifica se o herói ainda está vivo
            if (this.getVida() <= 0) {
                System.out.println("O herói foi derrotado.");
                break;
            }

        }
    }

    /**
     * Método vindo da classe Entidade, obrigatório a todas.
     */
    @Override
    public void mostrarDetalhes() {
        System.out.println("Detalhes do Arqueiro:");
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Força: " + getForca());
        System.out.println("Nível: " + getNivel());
        System.out.println("Ouro: " + getOuro());
        System.out.println("Arma: " + getArma().getNome());
        System.out.println("Poções: " + getPocoes().size());
    }
}
