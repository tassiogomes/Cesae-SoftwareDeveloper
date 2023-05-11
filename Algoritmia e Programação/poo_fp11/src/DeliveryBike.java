import java.util.ArrayList;



public class DeliveryBike extends Bicycle{

    /****** ATTRIBUTOS ******/
    int numberOfSponsors;
    double basketCapacity;
    boolean isFrontBasket;
    final int SPONSOR_SIZE = 10;
    private ArrayList<String> sponsors;


    /****** CONSTRUCTOR ******/

    public DeliveryBike(int id, int numberOfGears, String mainColor, double weelSize, double bikeLenght,
                        double price, boolean adjustableSeatPost, int numberOfSponsors, double basketCapacity,
                        boolean isFrontBasket, ArrayList sponsors) {

        super(id, numberOfGears, mainColor, weelSize, bikeLenght, price, adjustableSeatPost);
        this.numberOfSponsors = numberOfSponsors;
        this.basketCapacity = basketCapacity;
        this.isFrontBasket = isFrontBasket;
        this.sponsors = sponsors;
    }
}




