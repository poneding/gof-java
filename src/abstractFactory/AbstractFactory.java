package abstractFactory;

/**
 * AbstractFactory 接口定义了抽象工厂的基本方法。
 */
public interface AbstractFactory {
    /**
     * 创建产品A的实例。
     * @return 返回产品A的实例。
     */
    ProductA createProductA();

    /**
     * 创建产品B的实例。
     * @return 返回产品B的实例。
     */
    ProductB createProductB();
}

class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1(); // 或者根据需要返回其他具体产品A的实例
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1(); // 或者根据需要返回其他具体产品B的实例
    }
}

class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2(); // 或者根据需要返回其他具体产品A的实例
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2(); // 或者根据需要返回其他具体产品B的实例
    }
}


