import java.util.ArrayList;

public class poo_fp11_02 {
    public static void main(String[] args) {

        /** Construtor 1 que instancia uma lista dentro do próprio construtor e recebe como parâmetro uma instância **/
        Farm fazenda = new Farm();
        fazenda.adicionarAnimal(new Cao());
        fazenda.adicionarAnimal(new Gato());
        fazenda.adicionarAnimal(new Vaca());
        fazenda.adicionarAnimal(new Porco());
        fazenda.adicionarAnimal(new Galinha());
        fazenda.adicionarAnimal(new Pato());
        System.out.println("makeNoise adicionando individualmente");
        fazenda.makeNoise();
        System.out.println("\n");

        /** Construtor 2 que PRECISA de uma list como parâmetro e essa lista é instanciada aqui na Main **/
        ArrayList<Animal> listaAnimais = new ArrayList<>();
        listaAnimais.add(new Cao());
        listaAnimais.add(new Porco());

        System.out.println("makeNoise adicionando lista");
        Farm fazenda2 = new Farm(listaAnimais);
        fazenda2.makeNoise();

    }
}
