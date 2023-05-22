package Itens;

import java.util.ArrayList;

public abstract class ItemHeroi{
    private String nome;
    private int preco;
    private ArrayList<String> tiposHeroi;


    /** --------------------------- CONSTRUTORES ----------------------------------*/

    /**
     * Construtor da classe Heroi
     * @param nome
     * @param preco
     * @param tiposHeroi
     */
    public ItemHeroi(String nome, int preco, ArrayList<String> tiposHeroi) {
        this.nome = nome;
        this.preco = preco;
        this.tiposHeroi = tiposHeroi;
    }


    /**
     * Método obrigatório da classe heroi
     */
    public abstract void mostrarDetalhes();


    /** --------------------------- GETTERS E SETTERS ----------------------------------*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public ArrayList<String> getTiposHeroi() {
        return tiposHeroi;
    }

    public void setTiposHeroi(ArrayList<String> tiposHeroi) {
        this.tiposHeroi = tiposHeroi;
    }



}
