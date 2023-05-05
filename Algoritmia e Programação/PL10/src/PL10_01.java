import java.util.Scanner;
import java.util.Scanner;
public class PL10_01 {

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            // instantiating the object Car
            Car fullCar = new Car("Mercedes", "4x4", 1970, 1500, 200, 12, TipoCombustivel.DIESEL);
            Car fullCar2 = new Car("Mercedes", "4x4", 2023, 1500, 300, 12, TipoCombustivel.GPL);


            // print
            System.out.println(fullCar);

            fullCar.exibirDetalhes();
            fullCar2.exibirDetalhes();
            fullCar.turnOn();
            fullCar2.turnOn();

            fullCar.corrida(fullCar);


        }
    }




