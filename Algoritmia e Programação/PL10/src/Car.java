import java.time.LocalDate;

public class Car {


    // ATTRIBUTES
    private String brand, model;
    private int year;
    private double power, displacements, liters_100km;
    private  TipoCombustivel tipoCombustivel;



    // CONSTRUCTORS

    public Car(String brand, String model, int year, double power, double displacements, double liters_100km, TipoCombustivel tipoCombustivel) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.power = power;
        this.displacements = displacements;
        this.liters_100km = liters_100km;
        this.tipoCombustivel = tipoCombustivel;
    }


    // ENCAPSULATING GETTERS AND SETTERS

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getDisplacements() {
        return displacements;
    }

    public void setDisplacements(double displacements) {
        this.displacements = displacements;
    }

    public double getLiters_100km() {
        return liters_100km;
    }

    public void setLiters_100km(double liters_100km) {
        this.liters_100km = liters_100km;
    }



    // METHODS
    public int getIdade() {
        LocalDate now = LocalDate.now(); // obtém a data atual
        int currentYear = now.getYear(); // obtém o ano atual
        return currentYear - this.year; // calcula a diferença entre o ano atual e o ano do carro
    }

    public void turnOn(){
        if(getIdade() > 30 && tipoCombustivel != TipoCombustivel.DIESEL) {
            System.out.println("Custa a pegar O carro está ligado Vrum vrum vrum");
        }else if (getIdade() > 30 && tipoCombustivel == TipoCombustivel.DIESEL){
             System.out.println("Deita um pouco de fumo… Custa a pegar… O carro está ligado! Vrum-vrum-vrum");
        }else if (getIdade() <= 30 && power <= 250 ) {
            System.out.println("O carro está ligado! Vruummmmmmm");
        }else  {
            System.out.println("O carro está ligado! VRUUUUUM!");
    }
    }

    public Car corrida(Car adversario){


    }

public void exibirDetalhes(){
    System.out.printf("Brand = %s\n Model = %s\n Year = %d\n power = %.2f\n displacements %.2f\n liters_100km = %.2f\n fuelType = %s  ",
            this.brand, this.model, this.year, this.power, this.displacements, this.liters_100km, this.tipoCombustivel);
}

}
