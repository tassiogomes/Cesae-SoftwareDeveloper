package Factory1;

public class Main {
    public static void main(String[] args) {
        Product book = ProductFactory.createProduct("book"); // createProduct cria um objeto novo
        Product electronics = ProductFactory.createProduct("electronics");
        Product clothing = ProductFactory.createProduct("clothing");
        Product item = ProductFactory.createProduct("Item");
        book.display();
        electronics.display();
        clothing.display();
        item.display();
    }
}