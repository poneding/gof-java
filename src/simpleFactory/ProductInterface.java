package simpleFactory;

/**
 * ProductInterface 定义了产品的接口。
 * 具体产品类需要实现这个接口。
 */
public interface ProductInterface {
    void use();
}


/**
 * ConcreteProductA 是具体产品类。
 */
class ConcreteProductA implements ProductInterface {
    @Override
    public void use() {
        System.out.println("Using ConcreteProductA");
    }
}

/**
 * ConcreteProductB 是具体产品类。
 */
class ConcreteProductB implements ProductInterface {
    @Override
    public void use() {
        System.out.println("Using ConcreteProductB");
    }
}

/**
 * ConcreteProductC 是具体产品类。
 */
class ConcreteProductC implements ProductInterface {
    @Override
    public void use() {
        System.out.println("Using ConcreteProductC");
    }
}