package com.pharmcrm.LoginFunctionality.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFunctionalityPage {
	WebDriver driver;

	// By Locators
	private By loginpage = By.xpath("//h5[normalize-space()='Login']");
	private By usertypedropdown = By.xpath(" //select[@id='ProfileType']");
	private By emailidtextbox = By.xpath("//input[@id='UserName']");
	private By passwordtextbox = By.xpath("//input[@id='Password']");
	private By gobutton = By.xpath("//button[@id='btnSubmit']");

	public LoginFunctionalityPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean loginpageisdisplayed() {
		return driver.findElement(loginpage).isDisplayed();
	}

	public void clickintotheusertypedropdown() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// Wait for preloader to disappear
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		WebElement usertypedropdownButton = wait.until(ExpectedConditions.elementToBeClickable(usertypedropdown));

		try {
			usertypedropdownButton.click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", usertypedropdownButton);
		}

		System.out.println("User Type Dropdown clicked successfully");
	}

	public void selecttheusertypeOrganization() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Wait for dropdown <select> to be visible
		WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ProfileType")));

		// Use Select class
		Select select = new Select(dropdown);
		select.selectByVisibleText("Organization");

		System.out.println("Organization User Type selected successfully.");
	}

	public void selecttheusertypePatient() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Wait for dropdown <select> to be visible
		WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ProfileType")));

		// Use Select class
		Select select = new Select(dropdown);
		select.selectByVisibleText("Patient");

		System.out.println("Patient User Type selected successfully.");
	}

	public void entertheemailidtextbox(String EmailId) {
		WebElement EmailIdtextboxfield = driver.findElement(emailidtextbox);
		EmailIdtextboxfield.clear();
		EmailIdtextboxfield.sendKeys(EmailId);
	}

	public void enterthepasswordtextbox(String Password) {
		WebElement Passwordtextboxfield = driver.findElement(passwordtextbox);
		Passwordtextboxfield.clear();
		Passwordtextboxfield.sendKeys(Password);
	}

	public void clickintotheGobutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// Wait for preloader to disappear
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		WebElement gobuttonTab = wait.until(ExpectedConditions.elementToBeClickable(gobutton));

		try {
			gobuttonTab.click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", gobuttonTab);
		}

		System.out.println("Go button clicked successfully");
	}
}
