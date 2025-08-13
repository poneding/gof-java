package singleton;

public class Main {
    public static void main(String[] args) {
        // 获取单例实例
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // 验证两个实例是否相同
        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }

        // 测试饿汉式单例
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();

        // 验证饿汉式单例的两个实例是否相同
        if (hungrySingleton1 == hungrySingleton2) {
            System.out.println("Both HungrySingleton instances are the same.");
        } else {
            System.out.println("HungrySingleton instances are different.");
        }
    }
}
