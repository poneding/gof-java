package abstractFactory;

/**
 * ProductA 接口定义了产品A的基本方法。
 * 具体产品A的实现类需要实现这个接口。
 * 这种设计允许在不同的产品A实现之间进行切换，
 * 遵循了开闭原则，便于扩展和维护。
 */
public interface ProductA {
    /**
     * 使用产品A的方法。
     * 具体实现可以在子类中完成。
     */
    void use();
}

class ConcreteProductA1 implements ProductA {
    @Override
    public void use() {
        System.out.println("Using ConcreteProductA1");
    }
}

class ConcreteProductA2 implements ProductA {
    @Override
    public void use() {
        System.out.println("Using ConcreteProductA2");
    }
}
