import java.util.ArrayList;

public class Agenda {

    /****** ATRIBUTOS ******/
    private ArrayList<Pessoa> pessoas;                  // declara o ArrayList do tipo Pessoa (classe) e de nome pessoas


    /****** CONSTRUTOR ******/
    public Agenda() {                             // se quiser uma agenda com limite, passar um int pessoas como parametro e na linha seguinte ArrayList<pessoa>
        this.pessoas = new ArrayList<>();         // pessoas recebe e instacia um ArrayList do tipo classe Pessoa
    }


    /****** MÉTODOS ******/
    public void adicionarPessoa(Pessoa pessoa) {        // método recebe como parâmetro pessoa do tipo classe Pessoa
        this.pessoas.add(pessoa);                       // pessoa é adicionada ao ArrayList pessoas
        System.out.println("Pessoa adicionada com sucesso!");
    }

    public void listarPessoas() {
        if (this.pessoas.isEmpty()) {
            System.out.println("Não há pessoas na agenda.");
        } else {
            System.out.println("Lista de pessoas:");
            for (Pessoa pessoa : this.pessoas) {
                System.out.println(pessoa.getNome() + " - " + pessoa.getEmail() + " - " + pessoa.getTelemovel() + " - " + pessoa.getIdade());
            }
        }
    }

}
