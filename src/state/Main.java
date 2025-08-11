package state;

public class Main {
    public static void main(String[] args) {
        // 创建上下文
        Context context = new Context();

        // 设置初始状态
        context.setState(new ConcreteStateA());

        // 请求处理
        context.request(); // 处理 ConcreteStateA

        // 再次请求处理
        context.request(); // 处理 ConcreteStateB

        // 可以继续请求，状态会在 ConcreteStateA 和 ConcreteStateB 之间切换
    }
}
