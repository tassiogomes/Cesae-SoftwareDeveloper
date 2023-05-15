public class poo_fp11_02 {
    public static void main(String[] args) {

        Farm fazenda = new Farm();
        fazenda.adicionarAnimal(new Cao());
        fazenda.adicionarAnimal(new Gato());
        fazenda.adicionarAnimal(new Vaca());
        fazenda.adicionarAnimal(new Porco());
        fazenda.adicionarAnimal(new Galinha());
        fazenda.adicionarAnimal(new Pato());

        fazenda.makeNoise();

    }
}
