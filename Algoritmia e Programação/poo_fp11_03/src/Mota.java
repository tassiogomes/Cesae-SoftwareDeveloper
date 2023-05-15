import java.io.*;
import java.util.Scanner;

public class Mota extends Veiculo {

    /***********************************************
     * <b>CONSTRUTOR</b>
     * @param marca
     * @param modelo
     * @param anoFabrico
     * @param potencia
     * @param cilindrada
     * @param combustivel
     * @param consumoL100
     */
    public Mota(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel combustivel, double consumoL100) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, combustivel, consumoL100);
    }

    /**
     * Método que lê o arquivo mota.txt e imprime
     */
    public void imagem() throws FileNotFoundException {
        File file = new File("mota.txt");
        Scanner input = new Scanner(file);

        while (input.hasNextLine()) {
            String linha = input.nextLine();
            System.out.println(linha);
        }

        input.close();
    }

}
