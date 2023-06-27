package org.example;

public class Episodio {
    private String nome;
    private int duracao;

    public Episodio(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }
}

//___________________________________________________________________________________________________________________________

import java.util.ArrayList;

public class Serie {
    private String nome;
    private String genero;
    private ArrayList<Episodio> temporada1;
    private ArrayList<Episodio> temporada2;
    private ArrayList<Episodio> temporada3;

    public Serie(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
        this.temporada1 = new ArrayList<>();
        this.temporada2 = new ArrayList<>();
        this.temporada3 = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public ArrayList<Episodio> getTemporada1() {
        return temporada1;
    }

    public ArrayList<Episodio> getTemporada2() {
        return temporada2;
    }

    public ArrayList<Episodio> getTemporada3() {
        return temporada3;
    }

    public boolean containsEpisode(Episodio episode) {
        return temporada1.contains(episode) || temporada2.contains(episode) || temporada3.contains(episode);
    }

    public double calcularMediaDuracaoEpisodios() {
        int totalDuracao = 0;
        int totalEpisodios = getNumeroEpisodios();

        for (Episodio episodio : temporada1) {
            totalDuracao += episodio.getDuracao();
        }

        for (Episodio episodio : temporada2) {
            totalDuracao += episodio.getDuracao();
        }

        for (Episodio episodio : temporada3) {
            totalDuracao += episodio.getDuracao();
        }

        return (double) totalDuracao / totalEpisodios;
    }

    public int getNumeroEpisodios() {
        return temporada1.size() + temporada2.size() + temporada3.size();
    }
}

//___________________________________________________________________________________________________________________________

public class Fatorial {
    public static int calcular(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O número não pode ser negativo.");
        }

        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }
}

//___________________________________________________________________________________________________________________________

public class ArrayUtils {
    public static int findMinimum(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }
}
