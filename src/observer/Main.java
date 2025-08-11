package observer;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observerA = new ConcreteObserverA();
        subject.registerObserver(observerA);
        Observer observerB = new ConcreteObserverB();
        subject.registerObserver(observerB);

        subject.setState("初始状态");
        subject.notifyObservers(subject.getState());

        subject.removeObserver(observerA);

        subject.setState("移除观察者A后的状态");
        subject.notifyObservers(subject.getState());
    }
}
