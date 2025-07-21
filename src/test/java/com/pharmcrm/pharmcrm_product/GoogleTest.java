package com.pharmcrm.pharmcrm_product;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class GoogleTest {

	@Test
	public void testGoogleSearch() {
		WebDriver driver = DriverFactory.createDriver();
		driver.get("https://www.google.com");
		Assert.assertTrue(driver.getTitle().contains("Google"));
		driver.quit();
	}

}
