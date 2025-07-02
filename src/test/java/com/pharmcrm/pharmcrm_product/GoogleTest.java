package com.pharmcrm.pharmcrm_product;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {

	@Test
	public void testGoogleSearch() {
		WebDriver driver = DriverFactory.createDriver();
		driver.get("https://www.google.com");
		Assert.assertTrue(driver.getTitle().contains("Google"));
		driver.quit();
	}

}
