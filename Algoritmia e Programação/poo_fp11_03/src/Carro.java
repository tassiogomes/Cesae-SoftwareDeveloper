public class Carro extends Veiculo {

    /******************************************************
     * <b>ATRIBUTOS</b> (vem da enumeração TipoCombustivel)
     */
    private TipoCombustivel tipoCombustivel;

    /**
     * <b>CONSTRUTOR</b> da classe Carro que recebe o tipo de combustível e herda todos os atributos da classe mãe
     * @param marca
     * @param modelo
     * @param anoFabrico
     * @param potencia
     * @param cilindrada
     * @param combustivel
     * @param consumoL100
     * @param tipoCombustivel
     */
    public Carro(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel combustivel, double consumoL100, TipoCombustivel tipoCombustivel) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, combustivel, consumoL100);
        this.tipoCombustivel= tipoCombustivel;
    }

    /****************************************************
     * <b>GETTERS e SETTERS</b>
     * @return
     */
    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }



    /****************************************************
     * Método para calcular o preço da viagem
     * @param distancia
     * @param tipoCombustivel
     * @return
     */
    public double calcularCusto(double distancia, TipoCombustivel tipoCombustivel, double consumoL100) {//
        double precoCombustivel = 0;
        if (tipoCombustivel.equals(TipoCombustivel.GASOLINA)) {
            precoCombustivel = 1.95;
        } else if (tipoCombustivel.equals(TipoCombustivel.DIESEL)) {
            precoCombustivel = 1.75;
        } else if (tipoCombustivel.equals(TipoCombustivel.GPL)) {
            precoCombustivel = 0.95;
        }
        return ((consumoL100 / 100) * distancia) *  precoCombustivel;
    }

}


