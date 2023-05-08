public class PL10_04 {

    public static void main(String[] args) {

        Imovel imovel1 = new Imovel("Rua da alegria", "Porto", 24, 1, 2, 100, 10, TipoImovel.CASA, TipoAcabamento.USADA);

        System.out.println("O valor é: " + imovel1.calcular());
    }
}
