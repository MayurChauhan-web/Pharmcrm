package com.pharmcrm.pharmcrm_product;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class FacebookTest {

	@Test
	public void testFacebookHomePage() {
		WebDriver driver = DriverFactory.createDriver();
		driver.get("https://www.facebook.com");
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
		driver.quit();
	}

}
