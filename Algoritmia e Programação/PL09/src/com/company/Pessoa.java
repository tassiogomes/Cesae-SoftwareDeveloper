package com.company;

public class Pessoa {

    // ATTRIBUTES
    private String nome;
    private int idade;
    private double altura;

    // CONSTRUCTORS

    public Pessoa() {                                           // empty constructor if I don't want all the parameters

    }

    public Pessoa(String nome, int idade, double altura) {      // full constructor, using all parameters
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // ENCAPSULATION getterss and setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // TO STRING (print)
    @Override
    public String toString() {
        return ("Nome: " + getNome() + "\nIdade: " + getIdade() + "\nAltura: " + getAltura());
    }
}
