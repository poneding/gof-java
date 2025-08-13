package builder;

public class Main {
    public static void main(String[] args) {
        // 创建一个具体的构建者
        Builder builder = new ConcreteBuilder();
        // 创建一个导演，使用构建者来构建产品
        Director director = new Director(builder);

        // 构建产品
        Product product = director.construct("Part1", "Part2", "Part3");

        // 输出产品信息
        System.out.println(product);
    }
}
