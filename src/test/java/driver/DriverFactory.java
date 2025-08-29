package driver;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public static void initDriver() {
		if (driver.get() == null) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.addArguments("--remote-allow-origins=*");
			Map<String, Object> prefs = new HashMap<>();
			String appState = "{"
					+ "\"recentDestinations\":[{\"id\":\"Save as PDF\",\"origin\":\"local\",\"account\":\"\"}],"
					+ "\"selectedDestinationId\":\"Save as PDF\"," + "\"version\":2" + "}";
			prefs.put("printing.print_preview_sticky_settings.appState", appState);
			prefs.put("savefile.default_directory", "C:\\Users\\MayurChauhan\\Downloads");
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--kiosk-printing");
			WebDriver chromeDriver = new ChromeDriver(options);
			chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.set(chromeDriver);
		}
	}

	public static WebDriver getDriver() {
		return driver.get();
	}

	public static WebDriver createDriver() {
		initDriver();
		return getDriver();
	}

	public static void quitDriver() {
		if (driver.get() != null) {
			driver.get().quit();
			driver.remove();
		}
	}
}
