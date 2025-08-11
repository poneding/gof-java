package abstractFactory;

/**
 * ProductB 接口定义了产品A的基本方法。
 * 具体产品B的实现类需要实现这个接口。
 * 这种设计允许在不同的产品B实现之间进行切换，
 * 遵循了开闭原则，便于扩展和维护。
 */
public interface ProductB {
    /**
     * 使用产品A的方法。
     * 具体实现可以在子类中完成。
     */
    void use();
}

class ConcreteProductB1 implements ProductB {
    @Override
    public void use() {
        System.out.println("Using ConcreteProductB1");
    }
}

class ConcreteProductB2 implements ProductB {
    @Override
    public void use() {
        System.out.println("Using ConcreteProductB2");
    }
}
