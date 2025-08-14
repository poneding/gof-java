package prototype;

public class Main {
    public static void main(String[] args) {
        // 创建一个具体的原型对象
        Prototype prototype = new ConcretePrototype("Initial Field");

        // 克隆原型对象
        Prototype clonedPrototype = prototype.clone();

        // 输出克隆对象的信息
        System.out.println(clonedPrototype);

        // 使用 Cloneable 接口的实现
        ConcretePrototypeImplClonable concretePrototypeImplClonable = new ConcretePrototypeImplClonable("Initial Field");
        Cloneable clonedConcretePrototypeImplClonable = concretePrototypeImplClonable.clone();
        System.out.println(clonedConcretePrototypeImplClonable);
    }
}
