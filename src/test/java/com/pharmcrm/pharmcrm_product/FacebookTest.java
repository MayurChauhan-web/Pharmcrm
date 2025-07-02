package com.pharmcrm.pharmcrm_product;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookTest {

	@Test
	public void testFacebookHomePage() {
		WebDriver driver = DriverFactory.createDriver();
		driver.get("https://www.facebook.com");
		Assert.assertTrue(driver.getTitle().contains("Facebook"), "Title does not contain 'Facebook'");
		driver.quit();
	}

}
