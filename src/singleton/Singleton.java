package singleton;

/**
 * 单例模式
 */
public class Singleton {
    // 私有静态变量，保存唯一实例
    private static Singleton instance;

    // 私有构造函数，防止外部实例化
    private Singleton() {
        // 初始化代码
    }

    // 公共静态方法，提供全局访问点
    // 懒汉式单例实现，线程不安全
    // public static Singleton getInstance() {
    //     if (instance == null) {
    //         System.out.println("Creating new instance of Singleton");
    //         instance = new Singleton();
    //     }
    //     return instance;
    // }

    // 线程安全的单例实现 1
    // 使用 synchronized 关键字确保线程安全
    // synchronized 是一种同步锁，当一个线程访问该方法并且没有退出之前，锁住不被其他线程访问。
    // 注意：这种方式在高并发情况下性能较低
    // public static synchronized Singleton getInstance() {
    //     if (instance == null) {
    //         System.out.println("Creating new instance of Singleton");
    //         instance = new Singleton();
    //     }
    //     return instance;
    // }

    // 线程安全的单例实现 2
    // 使用双重检查锁定（Double-Checked Locking）来提高性能
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) { // 防止多线程同时进入
                if (instance == null) {
                    System.out.println("Creating new instance of Singleton");
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

/**
 * 饿汉式单例
 * 这种方式在类加载时就创建了实例，线程安全，但如果实例创建后不使用，会浪费资源。
 */
class HungrySingleton {
    // 私有静态变量，保存唯一实例
    private static final HungrySingleton instance = new HungrySingleton();

    // 私有构造函数，防止外部实例化
    private HungrySingleton() {
        // 初始化代码
    }

    // 公共静态方法，提供全局访问点
    public static HungrySingleton getInstance() {
        return instance;
    }
}
