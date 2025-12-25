package com.pharmcrm.PatientFunctionality.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	private By sendVCardButton = By.xpath("//span[normalize-space()='Send VCard']");
	private By sendVCardSubmitButton = By.id("btnSendVCard");
	private By vcardValidationToastMessage = By.xpath("//div[@class='toast-message']");
	private By patientActionMenuButton = By.xpath("//tbody/tr[1]/td[12]//button//i");
	private By deletePatientOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Delete']");
	private By cancelDeletePatientButton = By
			.xpath("//button[contains(@onclick,'CloseDeletePopup')]//i[contains(@class,'fa-times')]");
	private By deletePatientToastMessage = By.xpath("//div[@class='toast-message']");
	private By addToFollowupButton = By.xpath("//span[normalize-space()='Add To Followup']");
	private By nextButton = By.xpath("//a[normalize-space()='Next']");
	private By blankSubmissionErrorToast = By.xpath("//div[@class='toast toast-error']");
	private By newPatientButton = By.xpath("//span[normalize-space()='New Patient']");
	private By searchPatientButton = By.xpath("//button[@id='btnFindPatient']");
	private By selectExistingPatientButton = By.xpath("//button[normalize-space()='Select Existing Patient']");
	private By addNewPatientButton = By.xpath("//button[normalize-space()='Add New Patient']");
	private By filterButton = By.xpath("//span[normalize-space()='Filter']");
	private By filterLastNameInput = By.xpath("//input[@id='Filter_LastName']");
	private By filterCancelButton = By.xpath("//button[@type='button']//i[@class='fa-solid fa-xmark']");
	private By patientListTable = By.xpath("//table");

	public boolean isFilterClearedAndPatientListVisible() {
		try {
			WebElement filterInput = wait.until(ExpectedConditions.visibilityOfElementLocated(filterLastNameInput));
			boolean isFilterCleared = filterInput.getAttribute("value").isEmpty();
			boolean isPatientListVisible = wait.until(ExpectedConditions.visibilityOfElementLocated(patientListTable))
					.isDisplayed();
			return isFilterCleared && isPatientListVisible;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnFilterCancelButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement cancelBtn = wait.until(ExpectedConditions.elementToBeClickable(filterCancelButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cancelBtn);
		cancelBtn.click();
	}

	public void enterFilterLastName(String lastName) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement lastNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(filterLastNameInput));
		lastNameInput.clear();
		lastNameInput.sendKeys(lastName);
	}

	public void clickOnFilterButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement filterBtn = wait.until(ExpectedConditions.elementToBeClickable(filterButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", filterBtn);
		filterBtn.click();
	}

	public boolean isOnAddNewPatientForm() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(addNewPatientButton));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnAddNewPatientButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement addNewBtn = wait.until(ExpectedConditions.elementToBeClickable(addNewPatientButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addNewBtn);
		addNewBtn.click();
	}

	public boolean isOnSelectExistingPatientForm() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectExistingPatientButton));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnSelectExistingPatientButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectBtn = wait.until(ExpectedConditions.elementToBeClickable(selectExistingPatientButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectBtn);
		selectBtn.click();
	}

	public boolean isOnSearchPatientForm() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(searchPatientButton));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnSearchPatientButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(searchPatientButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", searchBtn);
		searchBtn.click();
	}

	public void clickOnNewPatientButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement newPatientBtn = wait.until(ExpectedConditions.elementToBeClickable(newPatientButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", newPatientBtn);
		newPatientBtn.click();
	}

	public boolean isStillOnAddToFollowupForm() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(nextButton));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public boolean isBlankSubmissionErrorDisplayed() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(blankSubmissionErrorToast));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnNextWithoutData() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement nextBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(nextButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextBtn);
	}

	public void clickOnAddToFollowup() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(addToFollowupButton)).click();
	}

	public void clickCancelDeletePatientConfirmation() {
		wait.until(ExpectedConditions.elementToBeClickable(cancelDeletePatientButton)).click();
	}

	public boolean isDeletePatientToastMessageAbsent() {
		try {
			wait.withTimeout(Duration.ofSeconds(5))
					.until(ExpectedConditions.visibilityOfElementLocated(deletePatientToastMessage));
			return false;
		} catch (TimeoutException e) {
			return true;
		}
	}

	public void clickOnPatientActionMenu() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(patientActionMenuButton)).click();
	}

	public void clickOnDeletePatient() {
		wait.until(ExpectedConditions.elementToBeClickable(deletePatientOption)).click();
	}

	public boolean isSendVCardButtonDisplayed() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(sendVCardButton)).isDisplayed();
	}

	public boolean isSendVCardValidationMessageDisplayed() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(vcardValidationToastMessage)).isDisplayed();
	}

	public void clickSendForPatientVCard() {
		wait.until(ExpectedConditions.elementToBeClickable(sendVCardSubmitButton)).click();
	}

	public patientpage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void clickOnSendVCard() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(sendVCardButton)).click();
	}

	public void openPatientsPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
	}

	public boolean isOnPatientsPage() {
		return driver.getCurrentUrl().contains("/Patient/Home/Patients");
	}

	public void clickOnAddQuickText() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(quickTextButton)).click();
	}

	public void leaveAllRequiredFieldsEmptyInPatientQuickText() {

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
