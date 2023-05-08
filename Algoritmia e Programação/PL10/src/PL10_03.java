import java.util.ArrayList;

public class PL10_03 {

    public static void main(String[] args) {

        /****** INICIALIZANDO ArrayList ******/
        ArrayList<String> alimentacao = new ArrayList<String>();    // instancia um ArrayLista pq é uma classe, dá o nome de alimentacao e depois diz que é um new do tipo string e vazio, é de tamanho dinâmico
        alimentacao.add("Couves");                                  // adicionando itens ao ArrayLista
        alimentacao.add("Ração");
        alimentacao.add("Bife");

        /****** INSTANCIAR CLASSE ******/
        Animal animal1 = new Animal("Flecha", "Cão", "Rio de Janeiro", 30,alimentacao );
        Animal animal2 = new Animal("Thor", "Cão", "Portugal", 50, alimentacao);

        /****** TESTE COMER ******/
        animal1.comer("Bife",300);
        animal2.comer("Arroz",250);

        /****** TESTE PESO ******/
        System.out.println("Peso animal 1: " +animal1.getPeso());
        System.out.println("Peso animal 2: " +animal2.getPeso());







    }
}
