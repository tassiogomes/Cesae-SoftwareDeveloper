package com.company;
import java.util.Scanner;

public class PL09_01 {

    public static void main(String[] args) {

        // start scanner
        Scanner input = new Scanner(System.in);

        // teste variables
        String nome = "Flechuda P3";
        int idade = 5;
        double altura = 0.45;


        // instantiating the object Pessoa manually
        Pessoa p1 = new Pessoa();                                       // creates Pessoa using pre set values.
        Pessoa p2 = new Pessoa("Flecha", 6, 0.45);    // parameters entered directly without variables
        Pessoa p3 = new Pessoa(nome, idade, altura);

        // user entering data to objetct
        System.out.print("Insira o nome da pessoa: ");
        String nomePessoa=input.next();

        System.out.print("Insira a idade da pessoa: ");
        int idadePessoa=input.nextInt();

        System.out.print("Insira a altura da pessoa: ");
        double alturaPessoa = input.nextDouble();

        // Instanciar um objeto da classe Pessoa
        Pessoa pessoaInputUtilizador = new Pessoa(nomePessoa,idadePessoa,alturaPessoa);

        // printing using ToString function, calling directly the object
        System.out.println(p2);
        System.out.println(p1);
        System.out.println(p3);
        System.out.println(pessoaInputUtilizador);

        // printing calling each variable
        System.out.println("Nome da segunda pessoa: " +p2.getNome());
        System.out.println("Idade da segunda pessoa: " +p2.getIdade());
        System.out.println("Altura da segunda pessoa: " + p2.getAltura());
        System.out.println("");


        System.out.println("Nome da terceira pessoa: " +p3.getNome());
        System.out.println("Idade da terceira pessoa: " +p3.getIdade());
        System.out.println("Altura da terceira pessoa: " +p3.getAltura());
        System.out.println("");


        System.out.println("O nome da pessoa é "+pessoaInputUtilizador.getNome());
        System.out.println("Tem "+pessoaInputUtilizador.getIdade()+" anos");
        System.out.println("E "+ pessoaInputUtilizador.getAltura()+" metros de altura");



    }
}
