package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static Properties getPropertyObject() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
        Properties prop = new Properties();
        prop.load(fis);
        return prop;
    }
    public static String getUrl() throws IOException {
        return getPropertyObject().getProperty("url");
    }
    public static String getValidEmail() throws IOException {
        return getPropertyObject().getProperty("validEmail");
    }
    public static String getValidPassword() throws IOException {
        return getPropertyObject().getProperty("validPassword");
    }
    public static String getInvalidEmail() throws IOException {
        return getPropertyObject().getProperty("invalidEmail");
    }
    public static String getInvalidPassword() throws IOException {
        return getPropertyObject().getProperty("invalidPassword");
    }
}