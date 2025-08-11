package observer;

public interface Observer {
    /**
     * 更新方法，当被观察者状态发生变化时，通知观察者。
     * 具体实现可以在子类中完成。
     */
    void update(String state);
}

/**
 * 具体观察者类实现了 Observer 接口，并定义了如何响应被观察者的状态变化。
 * 这里以 ConcreteObserverA 和 ConcreteObserverB 为例。
 */
class ConcreteObserverA implements Observer {
    @Override
    public void update(String state) {
        System.out.println("ConcreteObserverA received update: " + state);
    }
}

/**
 * 另一个具体观察者类实现了 Observer 接口，并定义了如何响应被观察者的状态变化。
 * 这里以 ConcreteObserverB 为例。
 */
class ConcreteObserverB implements Observer {
    @Override
    public void update(String state) {
        System.out.println("ConcreteObserverB received update: "+state);
    }
}