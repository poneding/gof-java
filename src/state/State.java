package state;

/**
 * 状态模式下的状态接口。
 */
public interface State {
    public void handle(Context context);
}

class ConcreteStateA implements State {
    @Override
    public void handle(Context context) {
        System.out.println("Handling in ConcreteStateA");
        // 可以在这里改变上下文的状态
        context.setState(new ConcreteStateB());
    }
}

class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        System.out.println("Handling in ConcreteStateB");
        // 可以在这里改变上下文的状态
        context.setState(new ConcreteStateA());
    }
}
