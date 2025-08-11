package simpleFactory;

public class Client {
    public static void main(String[] args) {
        ProductInterface productA = ProductFactory.createProduct("A");
        productA.use();

        ProductInterface productB = ProductFactory.createProduct("B");
        productB.use();

        ProductInterface productC = ProductFactory.createProduct("C");
        productC.use();
    }
}
