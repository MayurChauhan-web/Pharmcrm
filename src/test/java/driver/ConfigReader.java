package driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private static Properties properties;

    public static Properties initProperties() {
        if (properties == null) {
            try {
                FileInputStream fis = new FileInputStream("src/test/resources/com/config/config.properties");
                properties = new Properties();
                properties.load(fis);
            } catch (IOException e) {
                throw new RuntimeException("Failed to load config.properties file.", e);
            }
        }
        return properties;
    }

    // NEW: Safe way to fetch individual properties
    public static String getProperty(String key) {
        if (properties == null) {
            initProperties();
        }
        String value = properties.getProperty(key);
        if (value == null || value.trim().isEmpty()) {
            throw new RuntimeException("Missing or empty property: " + key);
        }
        return value;
    }

}
