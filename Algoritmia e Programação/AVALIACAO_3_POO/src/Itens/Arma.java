package Itens;

import java.util.ArrayList;

public class Arma extends ItemHeroi{
    private int ataque;

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

    @Override
    public void mostrarDetalhes() {

    }
}
