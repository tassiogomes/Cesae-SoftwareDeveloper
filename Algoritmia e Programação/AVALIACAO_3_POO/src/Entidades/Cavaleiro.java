package Entidades;

import Itens.Arma;
import Itens.PocaoHP;

import java.util.ArrayList;

public class Cavaleiro extends Heroi {
    public Cavaleiro(String nome, int vida, int forca, int nivel, int ouro, Arma arma, ArrayList<PocaoHP> pocoes) {
        super(nome, vida, forca, nivel, ouro, arma, pocoes);
    }

    /**
     * Método subscrito da classe NPC
     * @param npc
     */
    @Override
    public void atacar(NPC npc) {
        while (true) {
            // O inimigo ataca primeiro (80% da força original)
            int danoInimigo = (int) (npc.getForca() * 0.8);
            this.subtrairVida(danoInimigo); // que é a quantidade passada no parametro da funcao na classe Heroi

            // Verifica se o herói ainda está vivo
            if (this.getVida() <= 0) {
                System.out.println("O herói foi derrotado.");
                break;
            }

            // O herói ataca
            int danoHeroi = this.getForca() + this.getArma().getAtaque();
            npc.setVida(npc.getVida() - danoHeroi);
            //npc.subtrairVida(danoHeroi);

            // Verifica se o inimigo ainda está vivo
            if (npc.getVida() <= 0) {
                System.out.println("O herói venceu!");
                this.subirNivel();
                this.incrementarVida(10);
                this.incrementarForca(1);
                this.incrementarOuro(10);
                break;
            }
        }
    }


    /**
     * Método vindo da classe Entidade, obrigatório a todas.
     */
    @Override
    public void mostrarDetalhes() {

    }
}