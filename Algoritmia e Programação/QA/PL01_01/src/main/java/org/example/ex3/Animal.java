package org.example.ex3;

public class Animal {
    private String nome;
    private boolean comFome;
    private Alimento tipoAlimentacao;
    public Animal(String nome, Alimento tipoAlimentacao) {
        this.nome = nome;
        this.comFome = true;
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public boolean estaComFome() {
        return this.comFome;
    }

    public void comer(Alimento comida) {
        if (this.tipoAlimentacao == comida) {
            this.comFome = false;
            System.out.println(nome + " comeu " + comida + ".");
        } else {
            System.out.println(nome + " não come " + comida + ".");
        }
    }
}