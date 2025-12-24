package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driver.ConfigReader;
import driver.DriverFactory;
import driver.DriverFactory_01;

public class Hooks {
	private DriverFactory_01 driverFactory;
	public static WebDriver driver;
	private ConfigReader configReader;
	public static Properties prop;
	public static Scenario scenario;

	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.initProperties();
	}

	@Before
	public void setup(Scenario sc) {
		Hooks.scenario = sc;
	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory_01();
		driver = driverFactory.initDriver(browserName);
	}

	public static WebDriver getDriver() {
		return DriverFactory.getDriver();
	}

	// UPDATED - Clean quit without unwanted waits
	@After(order = 0)
	public void quitBrowser() {
		try {
			Thread.sleep(2000); // optional wait for downloads to settle
		} catch (InterruptedException e) {
		}

		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("Browser already closed, ignoring...");
		}
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
		}
	}
}


