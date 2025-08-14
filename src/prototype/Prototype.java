package prototype;

public interface Prototype {
    Prototype clone();
}

class ConcretePrototype implements Prototype {
    private String field;

    public ConcretePrototype(String field) {
        this.field = field;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.field);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "field='" + field + '\'' +
                '}';
    }
}

/**
 * ConcretePrototypeImplClonable 类实现了 Cloneable (Java 自实现) 接口
 * 注意：这里的克隆是浅克隆，只克隆值类型的字段，不会克隆引用类型的字段。
 */
class ConcretePrototypeImplClonable implements  Cloneable{
    private String field;

    public ConcretePrototypeImplClonable(String field) {
        this.field = field;
    }

    @Override
    public Cloneable clone() {
        try {
            return (ConcretePrototypeImplClonable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }

    @Override
    public String toString() {
        return "ConcretePrototypeImplClonable{" +
                "field='" + field + '\'' +
                '}';
    }
}
