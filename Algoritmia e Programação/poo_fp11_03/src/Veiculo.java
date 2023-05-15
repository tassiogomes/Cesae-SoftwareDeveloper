import java.time.LocalDate;
// import java.util.Scanner;
public class Veiculo {


    protected TipoCombustivel combustivel;
    // Atributos de instância
    private String marca;
    private String modelo;
    private int anoFabrico, potencia, cilindrada;
    private double consumoL100;
    private int idade;

    // Método construtor
    public Veiculo(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel combustivel, double consumoL100) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.consumoL100 = consumoL100;
        this.combustivel = combustivel;
    }

    /**
     * GETTERS e SETTERS
     * @return
     */
    public double getConsumoL100() {
        return consumoL100;
    }

    public void setConsumoL100(double consumoL100) {
        this.consumoL100 = consumoL100;
    }

    /**
     * Método para calcular a idade em 2023
     * @return
     */
    public int getIdade() {
        LocalDate now = LocalDate.now(); // obtém a data atual
        int currentYear = now.getYear(); // obtém o ano atual
        return currentYear - this.anoFabrico; // calcula a diferença entre o ano atual e o ano do carro
    }


    /**
     * Método que calcula o consumo em Litros de um carro ao longo de uma distância
     * @param distancia - Em km da viagem
     * @return litros consumidos na viagem
     */
    public double calcularConsumo(double distancia) {

        return distancia * (this.consumoL100 / 100);
    }


    /**
     * Método para calcular o preço da viagem
     * @param distancia
     * @param tipoCombustivel
     * @return
     */
    public double calcularCusto(double distancia, TipoCombustivel tipoCombustivel) {//
        double precoCombustivel = 0;
        if (tipoCombustivel.equals(TipoCombustivel.GASOLINA)) {
            precoCombustivel = 1.75;
        } else if (tipoCombustivel.equals(TipoCombustivel.DIESEL)) {
            precoCombustivel = 1.75;
        } else if (tipoCombustivel.equals(TipoCombustivel.GPL)) {
            precoCombustivel = 0.95;
        }
        return (distancia * precoCombustivel);
    }
}
