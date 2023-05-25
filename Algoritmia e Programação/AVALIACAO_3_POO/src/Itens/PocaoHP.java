package Itens;

import java.util.ArrayList;

public class PocaoHP extends ItemHeroi {

    private int curar;

    /** --------------------------- CONSTRUTORES ----------------------------------*/


    /**
     * Método construtor da classe PocaoHP
     * @param nome
     * @param preco
     * @param tiposHeroi
     */
    public PocaoHP(String nome, int preco, ArrayList<TiposHeroi> tiposHeroi, int curar) {
        super(nome, preco, tiposHeroi);
        this.curar = curar;
    }

    @Override
    public void mostrarDetalhes() {

    }
    /** --------------------------- GETTERS E SETTERS ----------------------------------*/

    public int getCurar() {
        return curar;
    }

    public void setCurar(int curar) {
        this.curar = curar;
    }
}
