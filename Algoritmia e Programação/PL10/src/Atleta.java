public class Atleta {

    /****** ATRIBUTOS ******/
    private String nome, modalidade, paisOrigem;
    private double altura, peso;

    /****** CONSTRUTORES *******/

    public Atleta (String nome, String modalidade, String paisOrigem, double altura, double peso){
        this.nome = nome;
        this.modalidade = modalidade;
        this.paisOrigem = paisOrigem;
        this.altura = altura;
        this.peso = peso;
    }

    /******* GETTERS E SETTERS ******/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    /****** MÉTODOS ******/





}
