public class Bicycle {

    /****** ATTRIBUTOS ******/

    int id, numberOfGears;
    String mainColor;
    double weelSize, bikeLenght, price;
    boolean adjustableSeatPost;

    /****** CONSTRUTOR ******/

    public Bicycle(int id, int numberOfGears, String mainColor, double weelSize, double bikeLenght, double price, boolean adjustableSeatPost) {
        this.id = id;
        this.numberOfGears = numberOfGears;
        this.mainColor = mainColor;
        this.weelSize = weelSize;
        this.bikeLenght = bikeLenght;
        this.price = price;
        this.adjustableSeatPost = adjustableSeatPost;

    }

    /****** GETTERS AND SETTERS ******/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public String getMainColor() {
        return mainColor;
    }

    public void setMainColor(String mainColor) {
        this.mainColor = mainColor;
    }

    public double getWeelSize() {
        return weelSize;
    }

    public void setWeelSize(double weelSize) {
        this.weelSize = weelSize;
    }

    public double getBikeLenght() {
        return bikeLenght;
    }

    public void setBikeLenght(double bikeLenght) {
        this.bikeLenght = bikeLenght;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAdjustableSeatPost() {
        return adjustableSeatPost;
    }

    public void setAdjustableSeatPost(boolean adjustableSeatPost) {
        this.adjustableSeatPost = adjustableSeatPost;
    }



}
