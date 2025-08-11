package observer;

import java.util.ArrayList;

/**
 * 观察者模式，Subject 类是被观察者的抽象类或接口。
 */
public class Subject {

    private final ArrayList<Observer> observers = new ArrayList<>();

    /**
     * 注册观察者的方法，允许观察者订阅被观察者的状态变化。
     * 具体实现可以在子类中完成。
     *
     * @param observer 需要注册的观察者
     */
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    /**
     * 移除观察者的方法，允许观察者取消订阅被观察者的状态变化。
     * 具体实现可以在子类中完成。
     * @param observer 需要移除的观察者
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有注册的观察者，更新它们的状态。
     * 具体实现可以在子类中完成。
     * @param state 被观察者的状态
     * 观察者会根据这个状态进行相应的更新。
     */
    public void notifyObservers(String state){
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}

/**
 * 具体被观察者类实现了 Subject 类，并定义了如何管理观察者和状态变化。
 */
class ConcreteSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

