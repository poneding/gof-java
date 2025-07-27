package factoryMethod;

/**
 * ProductFactoryInterface 定义了工厂方法接口。
 * 具体工厂类需要实现这个接口来创建不同类型的产品。
 * 相较于简单工厂模式，工厂方法模式允许每个产品类型有自己的工厂类，
 * 遵循了开闭原则，便于扩展和维护。
 * 但同时，它也增加了系统的复杂性，因为每个产品类型都需要一个对应的工厂类。
 * 这种模式适用于产品类型较多且变化频繁的场景。
 */
public interface ProductFactoryInterface {
    ProductInterface createProduct(String type);
}

class ConcreteProductAFactory implements ProductFactoryInterface {
    @Override
    public ProductInterface createProduct(String type) {
       return new ConcreteProductA();
    }
}

class  ConcreteProductBFactory implements ProductFactoryInterface {
    @Override
    public ProductInterface createProduct(String type) {
        return new ConcreteProductB();
    }
}

class ConcreteProductCFactory implements ProductFactoryInterface {
    @Override
    public ProductInterface createProduct(String type) {
        return new ConcreteProductC();
    }
}
