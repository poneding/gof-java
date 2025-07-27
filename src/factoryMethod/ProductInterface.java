package factoryMethod;

/**
 * ProductInterface 定义了产品的接口。
 * 具体产品类需要实现这个接口。
 */
public interface ProductInterface {
    void use();
}

class ConcreteProductA implements ProductInterface {
    @Override
    public void use() {
        System.out.println("Using ConcreteProductA");
    }
}

class ConcreteProductB implements ProductInterface {
    @Override
    public void use() {
        System.out.println("Using ConcreteProductB");
    }
}

class ConcreteProductC implements ProductInterface {
    @Override
    public void use() {
        System.out.println("Using ConcreteProductC");
    }
}