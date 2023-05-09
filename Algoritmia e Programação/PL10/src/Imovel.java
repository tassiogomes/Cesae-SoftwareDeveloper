public class Imovel {


    /****** ATRIBUTOS ******/
    private String rua, cidade;
    private int numeroPorta, casasBanho, numeroQuartos;
    private  double area, areaPiscina;
    private TipoImovel tipoImovel;
    private TipoAcabamento tipoAcabamento;



    /****** CONSTRUCTOR ******/
    public  Imovel (String rua, String cidade, int numeroPorta, int casasBanho, int numeroQuartos, double area, double area_piscina, TipoImovel tipoImovel, TipoAcabamento tipoAcabamento){
        this.rua = rua;
        this.cidade = cidade;
        this.numeroPorta = numeroPorta;
        this.casasBanho = casasBanho;
        this.numeroQuartos = numeroQuartos;
        this.area = area;
        this.areaPiscina = area_piscina;
        this.tipoImovel = tipoImovel;
        this.tipoAcabamento = tipoAcabamento;
    }




    /****** GETTERS AND SETTERS ******/
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumeroPorta() {
        return numeroPorta;
    }

    public void setNumeroPorta(int numeroPorta) {
        this.numeroPorta = numeroPorta;
    }

    public int getCasasBanho() {
        return casasBanho;
    }

    public void setCasasBanho(int casasBanho) {
        this.casasBanho = casasBanho;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getAreaPiscina() {
        return areaPiscina;
    }

    public void setAreaPiscina(double areaPiscina) {
        this.areaPiscina = areaPiscina;
    }

    public TipoImovel getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(TipoImovel tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public TipoAcabamento getTipoAcabamento() {
        return tipoAcabamento;
    }

    public void setTipoAcabamento(TipoAcabamento tipoAcabamento) {
        this.tipoAcabamento = tipoAcabamento;
    }

    /****** METHODS ******/
    public double calcular(){
        double valorBase = 0;
       // Calcular valor base do imóvel com base no tipo de imóvel e na sua área
        if (this.tipoImovel == TipoImovel.APARTAMENTO) {
            valorBase = area * 1000;
        } else if (this.tipoImovel == TipoImovel.CASA) {
            valorBase = area * 3000;
        } else if (this.tipoImovel == TipoImovel.MANSAO) {
            valorBase = area * 5000;
        }
        if(this.tipoAcabamento == TipoAcabamento.RESTAURO){
            valorBase = valorBase - (valorBase * 0.5);          // desconto de 50%
        }else if(this.tipoAcabamento == TipoAcabamento.USADA){
            valorBase = valorBase - (valorBase * 0.1);          // desconto de 10%
        }else if(this.tipoAcabamento == TipoAcabamento.NOVA){
            valorBase = valorBase;
        }else if (this.tipoAcabamento == TipoAcabamento.NOVAALTOACABAMENTO){
            valorBase = valorBase + (valorBase * 0.25);          // valorização de 25%
        }

        valorBase += this.numeroQuartos * 7500 + this.casasBanho * 10500; // Adicionar o valor dos quartos e das casas de banho
        valorBase += this.areaPiscina * 1000;                               // Adicionar o valor da área da piscina, caso exista

        return valorBase;
    }

    public void mostrarDetalhes(){
        System.out.printf("Rua: %s\n Cidade: %s \n Nº da porta: %d\n " +
                            "Nº casas de banho: %d\n Nº de quartos: %d\n " +
                            "Area: %.2f\n Area da piscina: %.2f\n",
                            rua, cidade, numeroPorta, casasBanho, numeroQuartos, area, areaPiscina);
    }

    public boolean compararImoveis(double valorComparar) {
        double valorImovel = this.calcular();


        if (valorImovel > valorComparar) {
            System.out.println("Este imóvel é mais caro.");
            return true;
        } else if (valorComparar > valorImovel ) {
            System.out.println("O outro imóvel é mais caro.");
            return false;
        } else {
            System.out.println("Os imóveis tem o mesmo valor!");
            return false;
        }
    }


}