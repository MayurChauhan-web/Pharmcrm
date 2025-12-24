package com.pharmcrm.PatientFunctionality.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class patientpage {

	private WebDriver driver;
	private WebDriverWait wait;

	// Locator
	private By quickTextButton = By.xpath("//span[normalize-space()='Quick Text']");
	private By sendButton = By.id("btnSave");
	private By bodyRequiredValidation = By.xpath("//div[contains(text(),'Body should not be empty.')]");
	private By phoneRequiredValidation = By.xpath("//div[contains(text(),'Please enter phone number.')]");
	private By saveButton = By.id("btnSave");
	private By preloader = By.cssSelector("div.preloader");

	public patientpage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// Open page using full URL
	public void openPatientsPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
	}

	public boolean isOnPatientsPage() {
		return driver.getCurrentUrl().contains("/Patient/Home/Patients");
	}

	// Click on Add Quick Text
	public void clickOnAddQuickText() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(quickTextButton)).click();
	}

	public void leaveAllRequiredFieldsEmptyInPatientQuickText() {
		// Intentionally left blank
		// No action needed because we are validating blank submission
	}

	public void clickSendForPatientQuickText() {
		wait.until(ExpectedConditions.elementToBeClickable(sendButton)).click();
	}

	public boolean isBodyRequiredValidationDisplayed() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(bodyRequiredValidation)).isDisplayed();
	}

	public boolean isPhoneRequiredValidationDisplayed() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(phoneRequiredValidation)).isDisplayed();
	}

	public boolean isSaveButtonDisplayed() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(saveButton)).isDisplayed();
	}

}
