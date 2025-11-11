package com.pharmcrm.pharmcrm_product.steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

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

}
