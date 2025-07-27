package simpleFactory;

/**
 * ProductFactory 是简单工厂模式的实现。
 * 它根据传入的类型创建不同的产品实例。
 * 这种模式适用于产品类型较少且变化不频繁的场景。
 * 但如果产品类型较多或变化频繁，可能会导致工厂类过于庞大，
 * 不符合开闭原则，因此需要谨慎使用。
 *  注意：简单工厂模式并不是 GoF 设计模式中的一种，而是一个常见的设计模式。
 *  扩展：可以使用反射来动态创建产品实例，
 * * 但这会增加代码的复杂性和运行时错误的可能性。
 */
public class ProductFactory {
    public static ProductInterface createProduct(String type) {
        ProductInterface product = null;
        switch (type) {
            case "A":
                product = new ConcreteProductA();
                break;
            case "B":
                product = new ConcreteProductB();
                break;
            case "C":
                product = new ConcreteProductC();
                break;
            default:
                throw new IllegalArgumentException("Unknown product type: " + type);
        }
        return product;
    }
}

