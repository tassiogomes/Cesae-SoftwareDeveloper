public class Camiao extends  Veiculo {
    public double capacidadeCarga;

    /**
     * <b>CONSTRUTOR CAMIAO</b>
     *
     * @param marca
     * @param modelo
     * @param anoFabrico
     * @param potencia
     * @param cilindrada
     * @param combustivel
     * @param consumoL100
     * @param capacidadeCarga
     */
    public Camiao(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel combustivel, double consumoL100, double capacidadeCarga) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, combustivel, consumoL100);
        this.capacidadeCarga = capacidadeCarga;
    }

    /**
     * Método para calcular o consumo
     * @param distancia
     * @param cargaFornecida
     * @return
     */
    public double viagem(double distancia, double cargaFornecida) {
        if (cargaFornecida > this.capacidadeCarga) {
            System.out.println("A capacidade de carga fornecida é maior que a suportada pelo camião");
            return -1;
        } else {
            return calcularConsumo(distancia) + ((cargaFornecida / 100.0) * 0.2) + getConsumoL100();
        }
    }
}