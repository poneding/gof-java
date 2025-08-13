package builder;

/**
 * 构建者模式的 Builder 接口
 */
public interface Builder {
    Builder setPart1(String part1);
    Builder setPart2(String part2);
    Builder setPart3(String part3);
    Product build();
}

/**
 * 具体的构建者实现
 */
class ConcreteBuilder implements Builder {
    private String part1;
    private String part2;
    private String part3;

    public Builder setPart1(String part1) {
        this.part1 = part1;
        return this;
    }

    public Builder setPart2(String part2) {
        this.part2 = part2;
        return this;
    }

    public Builder setPart3(String part3) {
        this.part3 = part3;
        return this;
    }

    public Product build() {
        return new Product(part1, part2, part3);
    }
}

/**
 * 产品类
 * 代表被构建的对象
 */
class Product {
    private String part1;
    private String part2;
    private String part3;

    public Product(String part1, String part2, String part3) {
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
    }

    @Override
    public String toString() {
        return "Product{" +
                "part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                ", part3='" + part3 + '\'' +
                '}';
    }
}
