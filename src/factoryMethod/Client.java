package factoryMethod;

public class Client {
    public static void main(String[] args) {
        ProductFactoryInterface factoryA = new ConcreteProductAFactory();
        ProductInterface productA = factoryA.createProduct("A");
        productA.use();

        ProductFactoryInterface factoryB = new ConcreteProductBFactory();
        ProductInterface productB = factoryB.createProduct("B");
        productB.use();

        ProductFactoryInterface factoryC = new ConcreteProductCFactory();
        ProductInterface productC = factoryC.createProduct("C");
        productC.use();
    }
}
