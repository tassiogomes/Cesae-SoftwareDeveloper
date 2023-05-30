package Itens;

import java.util.ArrayList;

public class Arma extends ItemHeroi{
    private int ataque;

    /**
     * Construtor da classe Arma
     * @param nome
     * @param preco
     * @param tiposHeroi
     * @param ataque
     */
    public Arma(String nome, int preco, ArrayList<TiposHeroi> tiposHeroi, int ataque) {
        super(nome, preco, tiposHeroi);
        this.ataque = ataque;

    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * Método que mostra os detalhes da Arma, usando o override
     */
    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome:" + getNome());
        System.out.println("Preço:" + getPreco());
        System.out.println("Heroi:" + getTiposHeroi());
        System.out.println("Ataque" + getAtaque());

    }
}
