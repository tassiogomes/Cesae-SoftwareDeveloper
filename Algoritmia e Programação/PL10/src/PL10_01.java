import java.util.Scanner;

public class PL10_01 {

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            // instantiating the object Car
            Car fullCar = new Car("Mercedes", "4x4", 1970, 1500, 200, 12, TipoCombustivel.DIESEL);
            Car fullCar2 = new Car("BMW", "salsicha", 2023, 2500, 300, 7, TipoCombustivel.GASOLINA);


            // print details
            fullCar.exibirDetalhes();
            fullCar2.exibirDetalhes();
            System.out.println("");
            System.out.println("-----------------------------------------------------------");;

            // print turnOn
            fullCar.turnOn();
            fullCar2.turnOn();
            System.out.println("");
            System.out.println("-----------------------------------------------------------");;

            // liters
            fullCar.litrosGastos(200);
            fullCar2.litrosGastos(6);
            System.out.println("");
            System.out.println("-----------------------------------------------------------");

            // tournament
            Car vencedor = fullCar2.corrida(fullCar);
            System.out.println("O vencedor da corrida é: " + vencedor.getBrand() + " " + vencedor.getModel());
            Car vencedor2 = fullCar.corrida(fullCar2);
            System.out.println("O vencedor da corrida é: " + vencedor.getBrand() + " " + vencedor.getModel());
            System.out.println("");
            System.out.println("-----------------------------------------------------------");

            // distance 97km
            double distancia = 97.0;
            fullCar.litrosGastos(distancia);
            fullCar2.litrosGastos(distancia);


        }
    }




