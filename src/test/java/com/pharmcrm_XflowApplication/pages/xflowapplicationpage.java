package com.pharmcrm_XflowApplication.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.WiniumDriver;

import hooks.Hooks;

public class xflowapplicationpage {

	private WiniumDriver driver;

	public xflowapplicationpage(WiniumDriver driver) {
		this.driver = driver;
	}

	// LOCATORS
	public By templateErrorPopup = By.id("65535");
	public By uploadFileButton = By.id("btnUpload");
	public By templateCombo = By.xpath("//*[@AutomationId='gbQueueSetup']//*[@AutomationId='cmbTemplate']");
	public By templateArrowButton = By.xpath(".//*[contains(@LocalizedControlType,'button')]");
	public By templateList = By.xpath("//*[@AutomationId='cmbTemplate']//*[contains(@LocalizedControlType,'list')]");
	public By templateItems = By
			.xpath("//*[@AutomationId='cmbTemplate']//*[contains(@LocalizedControlType,'list item')]");
	public By downloadErrorRecordsButton = By.id("btnErrorData");
	public By deleteButton = By.id("btnDelete");
	public By addButton = By.id("btnAddQueueSetting");
	public By progressLabel = By.id("lblProgress");
	public By confirmAndProcessButton = By.id("btnConfirm");
	public By popupOkButton = By.id("2");
	public By uploadButton = By.id("btnUpload");
	public By openWindow = By.name("Open");
	public By fileNameBox = By.xpath(".//*[@ClassName='Edit']");
	public By openFileButton = By.xpath(".//*[@Name='Open' and @LocalizedControlType='button']");
	public By ehrSourceCombo = By.id("1001");
	public By comboArrowButton = By.xpath("following-sibling::*[contains(@LocalizedControlType,'button')]");
	public By listItems = By.xpath("//*[contains(@LocalizedControlType,'list item')]");
	public By listContainer = By.xpath("//*[contains(@LocalizedControlType,'list')]");
	public By rxReportDispensedButton = By.id("btnDispensed");
	public By titleBar = By.id("TitleBar");
	public By username = By.id("txtUserName");
	public By password = By.id("txtPassword");
	public By okButton = By.id("btnOK");
	public By errorMessage = By.name("The user name or password provided is incorrect.");
	public By okButton2 = By.id("2");
	public By testConnectionButton = By.id("btnConnection");
	public By successMessage = By.name("Database Connection Verified Successfully");
	public By cancelButton = By.id("btnCancel");
	public By exitConfirmationMessage = By.name("Are you sure you want to exit the application?");
	public By yesButton = By.id("6");
	public By noButton = By.id("7");
	public By emptyCredentialsErrorMessage = By.name("Please enter user name and password.");

	// ACTION
	public void verifyUserIsStillOnLoginScreen() throws InterruptedException, IOException {
		Thread.sleep(2000);

		WebElement titleBarElement = driver.findElement(titleBar);
		titleBarElement.click();

		Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");

		System.out.println("XFlow application closed successfully.");
	}

	public void errorMessageForInvalidCredentialsIsDisplayed() throws InterruptedException {
		Thread.sleep(3000);

		WebElement errorMsg = driver.findElement(errorMessage);
		Assert.assertTrue(errorMsg.isDisplayed());

		Thread.sleep(2000);

		WebElement okBtn = driver.findElement(okButton2);
		okBtn.click();
	}

	public void iClickYes() throws InterruptedException, IOException {

		WebElement yesBtn = driver.findElement(yesButton);
		yesBtn.click();

		Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");

		System.out.println("XFlow application closed successfully.");
	}

	public void exitConfirmationMessageIsDisplayed() throws InterruptedException {
		Thread.sleep(3000);

		WebElement msg = driver.findElement(exitConfirmationMessage);
		Assert.assertTrue(msg.isDisplayed());
	}

	public void clickCancelButton() throws InterruptedException {
		Thread.sleep(5000);

		WebElement titleBarElement = driver.findElement(titleBar);
		titleBarElement.click();

		Thread.sleep(2000);

		WebElement cancelBtn = driver.findElement(cancelButton);
		cancelBtn.click();
	}

	public void emptyCredentialsErrorMessageIsDisplayed() throws InterruptedException {
		Thread.sleep(3000);

		WebElement errorMsg = driver.findElement(emptyCredentialsErrorMessage);
		Assert.assertTrue(errorMsg.isDisplayed());

		Thread.sleep(2000);

		WebElement okBtn = driver.findElement(okButton);
		okBtn.click();
	}

	public void iClickOk() throws InterruptedException {
		Thread.sleep(7000);
		driver.findElement(okButton).click();
	}

	public void iEnterValidUsernameAndIncorrectPassword() throws InterruptedException {

		Thread.sleep(7000);

		driver.findElement(titleBar).click();
		Thread.sleep(1000);

		String usernameValue = Hooks.prop.getProperty("username");
		WebElement usernameField = driver.findElement(username);
		usernameField.sendKeys(usernameValue);

		String passwordValue = Hooks.prop.getProperty("password");
		WebElement passwordField = driver.findElement(password);
		passwordField.sendKeys(passwordValue);

		driver.findElement(okButton).click();
	}

	public void selectTemplateFromAvailableOptions() throws InterruptedException, IOException {
		WebElement combo = driver.findElement(templateCombo);

		WebElement arrowButton = combo.findElement(templateArrowButton);
		arrowButton.click();

		Thread.sleep(1000);

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(templateList));

		List<WebElement> items = driver.findElements(templateItems);

		System.out.println("Template Items found: " + items.size());

		Thread.sleep(1000);

		int indexToSelect = 1;

		WebElement item = items.get(indexToSelect);

		System.out.println("Selecting Template → " + item.getAttribute("Name"));

		item.click();
	}

	public void selectEHRSourceFromAvailableOptions() throws InterruptedException, IOException {
		Thread.sleep(5000);

		WebElement dispensedBtn = driver.findElement(rxReportDispensedButton);
		dispensedBtn.click();
	}

	public void uploadValidRXReportDispensedExcelFile() throws InterruptedException, IOException {
		WebElement uploadBtn = driver.findElement(uploadButton);
		uploadBtn.click();

		Thread.sleep(2000);

		WebElement openWin = driver.findElement(openWindow);

		WebElement fileBox = openWin.findElement(fileNameBox);

		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Despence Data.xlsx";

		fileBox.clear();
		fileBox.sendKeys(filePath);

		Thread.sleep(500);

		WebElement openBtn = openWin.findElement(openFileButton);
		openBtn.click();

		Thread.sleep(2000);
	}

	public void dataUploadSuccessMessageDisplayed() throws InterruptedException, IOException {

		WebDriverWait wait = new WebDriverWait(driver, 120);

		try {
			boolean isMessageDisplayed = wait
					.until(ExpectedConditions.attributeToBe(progressLabel, "Name", "Providers loaded in memory.."));

			if (isMessageDisplayed) {

				WebElement completedMessage = driver.findElement(progressLabel);
				String text = completedMessage.getAttribute("Name");

				System.out.println("Message displayed: " + text);

				Assert.assertEquals(text, "Providers loaded in memory..", "Success message is not displayed!");
			}

		} catch (TimeoutException e) {

			WebElement completedMessage = driver.findElement(progressLabel);
			String text = completedMessage.getAttribute("Name");

			System.err.println("Timeout waiting for success message. Last displayed: " + text);

			Assert.fail("Success message not displayed within timeout!");

		} finally {
			System.out.println("XFlow");
		}
	}

	public void iClickConfirmAndProcess() throws InterruptedException, IOException {
		Thread.sleep(3000);
		WebElement confirmBtn = driver.findElement(confirmAndProcessButton);
		confirmBtn.click();
	}

	public void clickDownloadErrorRecords() throws InterruptedException, IOException, AWTException {

		Thread.sleep(2000);

		WebElement downloadBtn = driver.findElement(downloadErrorRecordsButton);
		downloadBtn.click();

		Thread.sleep(2000);

		Robot robot = new Robot();
		robot.setAutoDelay(200);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("File saved successfully from Windows Save dialog.");

		Thread.sleep(2000);

		WebElement okBtn = driver.findElement(popupOkButton);
		okBtn.click();

		Thread.sleep(2000);

		Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");

		System.out.println("XFlow application closed successfully.");
	}

	public void verifyDeleteButtonIsVisibleForRXReportEntry() throws InterruptedException, IOException {

		Thread.sleep(5000);

		WebElement deleteBtn = driver.findElement(deleteButton);
		deleteBtn.click();

		Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");

		System.out.println("XFlow application closed successfully.");
	}

	public void deleteButtonShouldBeDisplayed() throws InterruptedException, IOException {

		Thread.sleep(5000);

		WebElement deleteBtn = driver.findElement(deleteButton);
		deleteBtn.click();

		Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");

		System.out.println("XFlow application closed successfully.");
	}

	public void iClickAddButton() throws InterruptedException, IOException {

		Thread.sleep(5000);

		WebElement addBtn = driver.findElement(addButton);
		addBtn.click();
	}

	public void templateNotSelectedPopupIsDisplayed() throws InterruptedException, IOException {
	    WebDriverWait wait = new WebDriverWait(driver, 15);

	    WebElement errorMessage = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(templateErrorPopup)
	    );

	    Assert.assertTrue(errorMessage.isDisplayed());

	    System.out.println("Error message is visible on screen.");

	    Thread.sleep(2000);

	    WebElement okBtn = driver.findElement(popupOkButton);
	    okBtn.click();

	    Thread.sleep(2000);

	    Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");

	    System.out.println("XFlow application closed successfully.");
	}
	
	public void iClickUploadFileButton() throws InterruptedException, IOException {
		Thread.sleep(3000);

		WebElement uploadBtn = driver.findElement(uploadFileButton);
		uploadBtn.click();
	}

	public void clickPleaseValidateExcelFormatPopup() throws InterruptedException, IOException {

		Thread.sleep(3000);

		WebElement okBtn = driver.findElement(popupOkButton);
		okBtn.click();
	}

	public void selectRXReportDispensed() throws InterruptedException, IOException {
		WebElement combo = driver.findElement(ehrSourceCombo);

		WebElement arrowButton = combo.findElement(comboArrowButton);
		arrowButton.click();

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(listContainer));

		List<WebElement> items = driver.findElements(listItems);

		System.out.println("Items found: " + items.size());

		int indexToSelect = 1;

		if (indexToSelect >= items.size()) {
			throw new RuntimeException("Index " + indexToSelect + " is out of range");
		}

		WebElement item = items.get(indexToSelect);

		System.out.println("Fast select -> " + item.getAttribute("Name"));

		item.click();
	}

	public void clickNoButton() throws InterruptedException, IOException {
		WebElement noBtn = driver.findElement(noButton);
		noBtn.click();
	}

	public void leaveUsernameAndPasswordFieldsEmpty() throws InterruptedException, IOException {
		Thread.sleep(5000);

		WebElement usernameFieldElement = driver.findElement(username);
		WebElement passwordFieldElement = driver.findElement(password);

		usernameFieldElement.clear();
		passwordFieldElement.clear();

	}

	public void connectionScreenShouldStillBeDisplayed() throws InterruptedException, IOException {
		Thread.sleep(2000);

		WebElement titleBarElement = driver.findElement(titleBar);
		titleBarElement.click();

		Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");

		System.out.println("XFlow application closed successfully.");
	}

	public void verifyDatabaseConnectionIsSuccessfulMessageDisplayed() throws InterruptedException {
		Thread.sleep(3000);

		WebElement successMsg = driver.findElement(successMessage);
		Assert.assertTrue(successMsg.isDisplayed());

		WebElement okBtn = driver.findElement(okButton);
		okBtn.click();
	}

	public void clickTestConnectionButton() throws InterruptedException {
		Thread.sleep(5000);
		WebElement titleBarElement = driver.findElement(titleBar);
		titleBarElement.click();
		Thread.sleep(2000);
		WebElement testConnectionBtn = driver.findElement(testConnectionButton);
		testConnectionBtn.click();
	}

	public void loginToApplication() throws InterruptedException {

		Thread.sleep(7000);

		driver.findElement(titleBar).click();
		Thread.sleep(1000);

		String usernameValue = Hooks.prop.getProperty("username");
		WebElement usernameField = driver.findElement(username);
		usernameField.sendKeys(usernameValue);

		String passwordValue = Hooks.prop.getProperty("password");
		WebElement passwordField = driver.findElement(password);
		passwordField.sendKeys(passwordValue);

		driver.findElement(okButton).click();
	}
}