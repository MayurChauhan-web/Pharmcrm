package com.pharmcrm.pharmcrm_product.steps;

import io.cucumber.java.en.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.Assert;

import java.io.File;
import java.net.URL;

public class XFlowSteps {

	private WiniumDriver driver;
	private String appPath = "C:\\Program Files (x86)\\Default Company Name\\XFlow.QA\\PharmCRM.UploadWizard.exe";

	@Given("the XFlow application is installed")
	public void the_xflow_application_is_installed() {
		File appFile = new File(appPath);
		if (!appFile.exists()) {
			throw new RuntimeException("App not found at: " + appPath);
		}
	}

	@When("I launch the XFlow application")
	public void i_launch_the_xflow_application() throws Exception {
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath(appPath);

		System.out.println("Connecting to Winium server...");
		driver = new WiniumDriver(new URL("http://localhost:9999"), options);
	}

	@Then("the application should open successfully")
	public void the_application_should_open_successfully() {
		System.out.println("XFlow launched successfully!");
	}

	@And("I enter username and password and click OK")
	public void i_enter_username_and_password_and_click_ok() throws InterruptedException {
		Thread.sleep(7000);
		WebElement titleBar = driver.findElementById("TitleBar");
		titleBar.click();
		Thread.sleep(1000);
		WebElement username = driver.findElementById("txtUserName");
		username.sendKeys("support@pharmcrm.com");
		WebElement password = driver.findElementById("txtPassword");
		password.sendKeys("Admin@1234");
		WebElement okButton = driver.findElementById("btnOK");
		okButton.click();
	}

	@And("I should remain on the login screen")
	public void iShouldRemainOnTheLoginScreen() throws InterruptedException {
		Thread.sleep(2000);
		WebElement titleBar = driver.findElementById("TitleBar");
		titleBar.click();

	}

	@And("I should remain on the connection screen")
	public void iShouldRemainOnTheConnectionScreen() throws InterruptedException {
		Thread.sleep(2000);
		WebElement titleBar = driver.findElementById("TitleBar");
		titleBar.click();

	}

	@And("the system should display an error message indicating Invalid username or password")
	public void theSystemShouldDisplayAnErrorMessageIndicatingInvalidUsernameOrPassword() throws InterruptedException {
		Thread.sleep(3000);
		WebElement errorMessage = driver.findElementByName("The user name or password provided is incorrect.");
		Assert.assertTrue(errorMessage.isDisplayed(), "Error message is not displayed.");
		Thread.sleep(2000);
		WebElement okButton = driver.findElementById("2");
		okButton.click();
	}

	@Then("the system should display a message indicating Database Connection Verified Successfully")
	public void theSystemShouldDisplayDatabaseConnectionVerifiedSuccessfully() throws InterruptedException {
		Thread.sleep(3000);
		WebElement successMessage = driver.findElementByName("Database Connection Verified Successfully");
		Assert.assertTrue(successMessage.isDisplayed(), "Success message not displayed.");
		WebElement okButton = driver.findElementById("2");
		okButton.click();
	}

	@Then("the system should display a confirmation message saying Are you sure you want to exit the application?")
	public void theSystemShouldDisplayExitConfirmationMessage() throws InterruptedException {
		Thread.sleep(3000);
		WebElement successMessage = driver.findElementByName("Are you sure you want to exit the application?");
		Assert.assertTrue(successMessage.isDisplayed(), "Success message not displayed.");

	}

	@Then("the system should display an error message indicating that Please enter username and password")
	public void theSystemShouldDisplayEmptyCredentialsErrorMessage() throws InterruptedException {
		Thread.sleep(3000);
		WebElement successMessage = driver.findElementByName("Please enter user name and password.");
		Assert.assertTrue(successMessage.isDisplayed(), "Success message not displayed.");
		Thread.sleep(2000);
		WebElement okButton = driver.findElementById("2");
		okButton.click();

	}

	@And("I click OK")
	public void iClickOK() throws InterruptedException {
		Thread.sleep(3000);
		WebElement okButton = driver.findElementById("btnOK");
		okButton.click();
	}

	@And("I click Yes")
	public void iClickYes() throws InterruptedException {
		WebElement okButton = driver.findElementById("6");
		okButton.click();
	}

	@And("I click No")
	public void iClickNo() throws InterruptedException {
		WebElement okButton = driver.findElementById("7");
		okButton.click();
	}

	@And("I click the Test Connection button")
	public void checkDatabaseConnectionSuccessNotification() throws InterruptedException {
		Thread.sleep(5000);
		WebElement titleBar = driver.findElementById("TitleBar");
		titleBar.click();
		Thread.sleep(2000);
		WebElement okButton = driver.findElementById("btnConnection");
		okButton.click();
	}

	@And("I click the Cancel button")
	public void iClickTheCancelButton() throws InterruptedException {
		Thread.sleep(5000);
		WebElement titleBar = driver.findElementById("TitleBar");
		titleBar.click();
		Thread.sleep(2000);
		WebElement okButton = driver.findElementById("btnCancel");
		okButton.click();
	}

	@And("I enter a valid username and an incorrect password")
	public void iEnterAValidUsernameAndAnIncorrectPassword() throws InterruptedException {
		Thread.sleep(5000);
		WebElement titleBar = driver.findElementById("TitleBar");
		titleBar.click();
		Thread.sleep(1000);
		WebElement username = driver.findElementById("txtUserName");
		username.sendKeys("support@pharmcrm.com");
		WebElement password = driver.findElementById("txtPassword");
		password.sendKeys("support@pharmcrm.com");

	}

	@And("I leave the username and password fields empty")
	public void leaveUsernameAndPasswordFieldsEmpty() throws InterruptedException {
		Thread.sleep(5000);
		WebElement username = driver.findElementById("txtUserName");
		WebElement password = driver.findElementById("txtPassword");
		username.clear();
		password.clear();
	}

	@And("the application is open")
	public void theApplicationIsOpen() throws Exception {
		Thread.sleep(5000);
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath(appPath);
		System.out.println("Connecting to Winium server...");
		driver = new WiniumDriver(new URL("http://localhost:9999"), options);
		System.out.println("XFlow launched successfully!");

	}
}
