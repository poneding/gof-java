package builder;

/**
 * 构建者模式的 Director 类
 * 负责使用 Builder 来构建 Product 对象
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct(String part1, String part2, String part3) {
        return builder.setPart1(part1)
                      .setPart2(part2)
                      .setPart3(part3)
                      .build();
    }
}
