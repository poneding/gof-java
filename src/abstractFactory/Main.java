package abstractFactory;

public class Main {
    public static void main(String[] args) {
        // AbstractFactory factory = new ConcreteFactory2();
        // ProductA productA = factory.createProductA();
        // ProductB productB = factory.createProductB();
        //
        // productA.use();
        // productB.use();

        // 使用简单工厂模式
        SimpleFactory simpleFactory = new SimpleFactory();
        ProductA simpleProductA = simpleFactory.createProductA();
        ProductB simpleProductB = simpleFactory.createProductB();

        simpleProductA.use();
        simpleProductB.use();
    }
}

