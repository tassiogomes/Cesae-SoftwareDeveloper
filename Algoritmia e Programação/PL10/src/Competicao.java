import java.util.ArrayList;

public class Competicao {

        /****** ATRIBUTOS ******/
        private String nome, pais;
        private ArrayList<Atleta> listaAtletas;

        /****** CONSTRUTORES ******/
        public Competicao(String nome, String pais) {
            this.nome = nome;
            this.pais = pais;
            this.listaAtletas = new ArrayList<>();
        }

        /******* GETTERS E SETTERS ******/
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getPais() {
            return pais;
        }

        public void setPais(String pais) {
            this.pais = pais;
        }

        public ArrayList<Atleta> getListaAtletas() {
            return listaAtletas;
        }

        public void setListaAtletas(ArrayList<Atleta> listaAtletas) {
            this.listaAtletas = listaAtletas;
        }

        /****** MÉTODOS ******/

        public void adicionarAtleta(Atleta atleta) {
            this.listaAtletas.add(atleta);
            System.out.println("Atleta " + atleta.getNome() + " adicionado à competição " + this.nome);
        }

        public void adicionarCompeticao(ArrayList<Atleta> listaAtletas) {
            this.listaAtletas.addAll(listaAtletas);
            System.out.println("Competição " + this.nome + " adicionada com sucesso.");
        }

        public void imprimirCompeticao() {
            System.out.println("Competição: " + this.nome);
            System.out.println("País: " + this.pais);
            System.out.println("Lista de atletas:");
            for (Atleta atleta : this.listaAtletas) {
                System.out.println("Nome: " + atleta.getNome() + " - Modalidade: " + atleta.getModalidade()
                        + " - País de origem: " + atleta.getPaisOrigem() + " - Altura: " + atleta.getAltura()
                        + " - Peso: " + atleta.getPeso());
            }
        }
    }
