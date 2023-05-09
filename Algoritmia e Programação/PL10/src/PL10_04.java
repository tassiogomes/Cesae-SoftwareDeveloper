public class PL10_04 {

    public static void main(String[] args) {

        Imovel imovel1 = new Imovel("\nRua da alegria", "Porto", 24, 1, 1, 100, 0, TipoImovel.CASA, TipoAcabamento.USADA);
        System.out.println(imovel1.getArea());

        System.out.println("O valor é: " + imovel1.calcular());

        imovel1.mostrarDetalhes();
    }
}
