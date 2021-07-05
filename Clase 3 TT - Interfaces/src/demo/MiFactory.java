package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class MiFactory {

    public static Object getInstance(String objName) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("MiFactory.properties"));
            return Class.forName(properties.getProperty(objName)).getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IOException | IllegalAccessException | InvocationTargetException |
                NoSuchMethodException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
