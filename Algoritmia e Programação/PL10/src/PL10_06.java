import java.util.ArrayList;

public class PL10_06 {

    public static void main(String[] args) {
        //Criando atletas
        Atleta atleta1 = new Atleta("Usain Bolt", "100m rasos", "Jamaica", 1.95, 94.0);
        Atleta atleta2 = new Atleta("Simone Biles", "ginástica artística", "Estados Unidos", 1.45, 47.0);
        Atleta atleta3 = new Atleta("Michael Phelps", "natação", "Estados Unidos", 1.93, 88.0);
        Atleta atleta4 = new Atleta("Neymar Jr", "futebol", "Brasil", 1.75, 68.0);
        Atleta atleta5 = new Atleta("Serena Williams", "tênis", "Estados Unidos", 1.75, 70.0);

        //Criando competições
        Competicao competicao1 = new Competicao("Olimpíadas de Tóquio", "Japão");
        Competicao competicao2 = new Competicao("Copa do Mundo", "Catar");

        //Adicionando atletas às competições
        competicao1.adicionarAtleta(atleta1);
        competicao1.adicionarAtleta(atleta2);
        competicao1.adicionarAtleta(atleta3);
        competicao2.adicionarAtleta(atleta4);
        competicao2.adicionarAtleta(atleta5);

        //Adicionando competições à lista de competições
        ArrayList<Competicao> listaCompeticoes = new ArrayList<>();
        listaCompeticoes.add(competicao1);
        listaCompeticoes.add(competicao2);

        //Imprimindo informações das competições
        for (Competicao competicao : listaCompeticoes) {
            System.out.println("Competição: " + competicao.getNome() + " - País: " + competicao.getPais());
            System.out.println("Atletas participantes: ");
            for (Atleta atleta : competicao.getListaAtletas()) {
                System.out.println(atleta.getNome() + " - " + atleta.getModalidade() + " - " + atleta.getPaisOrigem() + " - Altura: " + atleta.getAltura() + " - Peso: " + atleta.getPeso());
            }
            System.out.println("----------------------");
        }
    }

}
    