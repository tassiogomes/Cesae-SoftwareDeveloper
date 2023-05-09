public class PL10_04 {

    public static void main(String[] args) {

        Imovel imovel1 = new Imovel("\nRua da alegria", "Porto",
                            24, 1, 1, 100, 0,
                            TipoImovel.CASA, TipoAcabamento.USADA);

        Imovel imovel2= new Imovel("\nRua da alegria", "Porto",
                24, 6, 10, 500, 0,
                TipoImovel.CASA, TipoAcabamento.USADA);

        Imovel imovel3 = new Imovel("\nRua da alegria", "Porto",
                24, 1, 1, 100, 0,
                TipoImovel.CASA, TipoAcabamento.USADA);


        System.out.println(imovel1.getArea());

        System.out.println("O valor é: " + imovel1.calcular());

        imovel1.mostrarDetalhes();
        System.out.println("-------------------------");
        System.out.println("O valor imovel1 é: " + imovel1.calcular());
        System.out.println("O valor imovel2 é: " + imovel2.calcular());

        imovel3.compararImoveis(imovel1.calcular());


    }
}
