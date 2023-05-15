import java.util.ArrayList;
//import java.util.List;


class Farm {
    /**
     * Atributos da classe Farm
     */
    private ArrayList<Animal> animais;


    /**
     * Construtor Farm que instancia um ArrayList
     */
    public Farm() {
        animais = new ArrayList<>();
    }

    public Farm(ArrayList<Animal> animais) {
        this.animais = animais;
    }

    /**
     * Adicionar animal
     * @param animal
     */
    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    /**
     * Método makeNoise que chama o método fazerBarulho para cada item do ArrayList
     */
    public void makeNoise() {
        for (Animal animal : animais) {
            animal.fazerBarulho();
        }
    }
}