import java.util.ArrayList;
import java.util.*;

public class Animal {

    /****** ATTRIBUTES ******/
    private String nome, especie, pais_origem;
    private double peso;
        private ArrayList<String> alimentacao;



    /****** CONSTRUCTORS ******/
    public Animal(String nome, String especie, String pais_origem, double peso, ArrayList<String> alimentacao){
        this.nome = nome;
        this.especie = especie;
        this.pais_origem = pais_origem;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }

    /****** ENCAPSULING ******/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPais_origem() {
        return pais_origem;
    }

    public void setPais_origem(String pais_origem) {
        this.pais_origem = pais_origem;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList<String> getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(ArrayList<String> alimentacao) {
        this.alimentacao = alimentacao;
    }


    /****** METHODS ******/

    public boolean comer(String alimento, double pesoAlimento){

        for (String comida : alimentacao) {
            if (comida.equals(alimento)) {
                this.peso += pesoAlimento/1000;
                System.out.println("O animal comeu");
                return true;
            }
        }
        System.out.println("O animal recusou essa comida");
        return false;
    }



}