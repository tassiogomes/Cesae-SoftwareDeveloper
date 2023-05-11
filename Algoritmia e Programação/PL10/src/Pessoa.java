

public class Pessoa{

    /******* ATRIBUTOS ******/

    private String nome, email, telemovel;
    private int idade;

    /******* CONSTRUTOR ******/

    public Pessoa(String nome, String email, String telemovel, int idade) {
        this.nome = nome;
        this.email = email;
        this.telemovel = telemovel;
        this.idade = idade;
    }

    /****** GETTERS AND SETTERS ******/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public void setTelemovel(String telemovel) {
        this.telemovel = telemovel;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    /****** MÉTODOS ******/



}