package abstractFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class ReflectImpl {
}

/**
 * SimpleFactory 类是一个简单工厂模式的实现，
 */
class SimpleFactory {
    /**
     * assemblyName 是当前类所在的包名。
     */
    private static String assemblyName = "abstractFactory";

    private static Properties properties = new Properties();

    private static Properties getProperties() {
        try {
            String path = System.getProperty("user.dir") + "/src/abstractFactory/app.properties";
            BufferedReader reader = new BufferedReader(new FileReader(path));

            properties.load(reader);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static String getProductAClassName() {
        String result = "";
        Properties properties = getProperties();
        String productA = properties.getProperty("productA");

        return assemblyName + "." + productA;
    }

    public static String getProductBClassName(String productName) {
        String result = "";
        Properties properties = getProperties();
        String productB = properties.getProperty("productB");

        return assemblyName + "." + productB;
    }

    public ProductA createProductA() {
        ProductA result = null;
        try{
            result = (ProductA)Class.forName(getProductAClassName()).getDeclaredConstructor().newInstance();
        }
        catch (InvocationTargetException | ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return result;
    }

    public ProductB createProductB() {
        ProductB result = null;
        try{
            result = (ProductB)Class.forName(getProductBClassName("ConcreteProductB1")).getDeclaredConstructor().newInstance();
        }
        catch (InvocationTargetException | ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return result;
    }
}

