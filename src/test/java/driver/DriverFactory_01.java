package driver;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory_01 {
	
	private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
    static Properties prop;
   

    public static WebDriver initDriver(String browserName) {
        prop = ConfigReader.initProperties();
        
        String browser = prop.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            tlDriver.set(new ChromeDriver());
        }
        
       
        getDriver().manage().window().maximize();
        getDriver().get(prop.getProperty("baseUrl"));
        return getDriver();
    }

    public static WebDriver getDriver() {
        return tlDriver.get();
    }

}
