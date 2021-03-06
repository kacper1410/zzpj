package pl.java.zzjp.app;

import pl.java.zzjp.lib.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class App {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName(getClientNameProperty());
        person.greet();
    }

    public static String getClientNameProperty() {
        Properties properties = new Properties();
        String propFileName = "config.properties";
        InputStream inputStream = App.class.getClassLoader().getResourceAsStream(propFileName);
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty("clientName");
    }

}
