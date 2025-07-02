package com.pharmcrm.pharmcrm_product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class Crm {

	@Test
	public void Login() {
		WebDriver driver = DriverFactory.createDriver(); // ✅ Use centralized factory
		driver.get("https://qa01.pharmcrm.com/");

		WebElement emailInput = driver.findElement(By.id("UserName"));
		emailInput.sendKeys("support@pharmcrm.com");

		WebElement passwordInput = driver.findElement(By.id("Password"));
		passwordInput.sendKeys("Falcon@2024");

		WebElement goButton = driver.findElement(By.xpath("//button[contains(text(),'GO')]"));
		goButton.click();

		System.out.println("Login attempted in headless mode.");
		driver.quit(); // or DriverFactory.quitDriver() if you're using ThreadLocal
	}

}