package Entidades;
package Itens;



import java.util.ArrayList;

/**
 * Classe abstrata Heroi, que deriva da classe mãe chamada Entidade
 */
public abstract class Heroi extends Entidade {
    private int nivel;
    private int ouro;
    private Arma arma;
    private ArrayList<Pocao> pocoes;




    /** --------------------------- Construtores ----------------------------------*/

    /**
     * Método construtor da classe Heroi
     * @param nome
     * @param vida
     * @param forca
     * @param nivel
     * @param ouro
     * @param arma
     * @param poções
     */
    public Heroi(String nome, int vida, int forca, int nivel, int ouro, Arma arma, ArrayList<Poção> poções) {
        super(nome, vida, forca);
        this.nivel = nivel;
        this.ouro = ouro;
        this.arma = arma;
        this.pocoes = pocoes;
    }

    public abstract void atacar(NPC npc);


    /** --------------------------- GETTERS AND SETTERS  ----------------------------------*/
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getOuro() {
        return ouro;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public ArrayList<Pocao> getPoções() {
        return pocoes;
    }

    public void setPoções(ArrayList<Pocao> poções) {
        this.pocoes = poções;
    }


}
