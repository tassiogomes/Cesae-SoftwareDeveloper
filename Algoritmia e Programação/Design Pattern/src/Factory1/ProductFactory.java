package Factory1;

public class ProductFactory {
    public static Product createProduct(String type) {
        switch (type) {
            case "book":
                return new Book();
            case "electronics":
                return new Electronics();
            case "clothing":
                return new Clothing();
            default:
                throw new IllegalArgumentException("Tipo de produto inválido: " + type);
        }
    }
}