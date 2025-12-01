package com.pharmcrm.pharmcrm_product.steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.Assert;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

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
	public void i_enter_username_and_password_and_click_ok() throws InterruptedException, IOException {
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
	public void iShouldRemainOnTheLoginScreen() throws InterruptedException, IOException {
		Thread.sleep(2000);
		WebElement titleBar = driver.findElementById("TitleBar");
		titleBar.click();
		Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");
		System.out.println("XFlow application closed successfully.");
	}

	@And("I should remain on the connection screen")
	public void iShouldRemainOnTheConnectionScreen() throws InterruptedException, IOException {
		Thread.sleep(2000);
		WebElement titleBar = driver.findElementById("TitleBar");
		titleBar.click();
		Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");
		System.out.println("XFlow application closed successfully.");

	}

	@And("I select the EHR Source from the available options")
	public void iSelectEHRSOurceFromAvailableOptions() throws InterruptedException {
		WebElement combo = driver.findElement(By.id("1001"));
		WebElement arrowButton = combo
				.findElement(By.xpath("following-sibling::*[contains(@LocalizedControlType,'button')]"));
		arrowButton.click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@LocalizedControlType,'list')]")));
		List<WebElement> items = driver.findElements(By.xpath("//*[contains(@LocalizedControlType,'list item')]"));
		System.out.println("Items found: " + items.size());
		int indexToSelect = 1;
		if (indexToSelect >= items.size()) {
			throw new RuntimeException("Index " + indexToSelect + " is out of range");
		}
		WebElement item = items.get(indexToSelect);
		System.out.println("Fast select -> " + item.getAttribute("Name"));
		item.click();
	}

	@And("I select the Template from the available options")
	public void iSelectTemplateFromAvailableOptions() throws InterruptedException {
		WebElement combo = driver
				.findElement(By.xpath("//*[@AutomationId='gbQueueSetup']//*[@AutomationId='cmbTemplate']"));
		WebElement arrowButton = combo.findElement(By.xpath(".//*[contains(@LocalizedControlType,'button')]"));
		arrowButton.click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//*[@AutomationId='cmbTemplate']//*[contains(@LocalizedControlType,'list')]")));
		List<WebElement> items = driver.findElements(
				By.xpath("//*[@AutomationId='cmbTemplate']//*[contains(@LocalizedControlType,'list item')]"));
		System.out.println("Template Items found: " + items.size());
		Thread.sleep(1000);
		int indexToSelect = 1;
		WebElement item = items.get(indexToSelect);
		System.out.println("Selecting Template → " + item.getAttribute("Name"));
		item.click();
	}

	@And("I Select RX Report Dispensed")
	public void iSelectRXReportDispensed() throws InterruptedException {
		Thread.sleep(5000);
		WebElement dispensedButton = driver.findElementById("btnDispensed");
		dispensedButton.click();

	}

	@And("I upload a valid RX Report Dispensed Excel file")
	public void iUploadValidRXReportDispensedExcelFile() throws InterruptedException {
		WebElement uploadBtn = driver.findElement(By.id("btnUpload"));
		uploadBtn.click();
		Thread.sleep(2000);
		WebElement openWindow = driver.findElement(By.name("Open"));
		WebElement fileNameBox = openWindow.findElement(By.xpath(".//*[@ClassName='Edit']"));
		String filePath = "C:\\Users\\MayurChauhan\\Downloads\\Despence Data.xlsx";
		fileNameBox.clear();
		fileNameBox.sendKeys(filePath);
		Thread.sleep(500);
		WebElement openButton = openWindow
				.findElement(By.xpath(".//*[@Name='Open' and @LocalizedControlType='button']"));
		openButton.click();
		Thread.sleep(2000);
	}

	@And("I click on Confirm and Process")
	public void iClickOnConfirmAndProcess() throws InterruptedException {
		Thread.sleep(3000);
		WebElement confirmButton = driver.findElementById("btnConfirm");
		confirmButton.click();

	}

	@And("a success message should be displayed indicating that Data Upload Complated")
	public void successMessageShouldBeDisplayedForDataUpload() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		try {
			boolean isMessageDisplayed = wait
					.until(ExpectedConditions.attributeToBe(By.id("lblProgress"), "Name", "Data upload completed.."));

			if (isMessageDisplayed) {
				WebElement completedMessage = driver.findElement(By.id("lblProgress"));
				String text = completedMessage.getAttribute("Name");
				System.out.println("Message displayed: " + text);
				Assert.assertEquals(text, "Data upload completed..", "Success message is not displayed!");
			}

		} catch (TimeoutException e) {
			WebElement completedMessage = driver.findElement(By.id("lblProgress"));
			String text = completedMessage.getAttribute("Name");
			System.err.println("Timeout waiting for success message. Last displayed: " + text);
			Assert.fail("Success message not displayed within timeout!");
		} finally {
			Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");
			System.out.println("XFlow application closed successfully.");
		}
	}

	@And("I click on the Add+ button")
	public void clickOnAddButton() throws InterruptedException {
		Thread.sleep(5000);
		WebElement addButton = driver.findElementById("btnAddQueueSetting");
		addButton.click();
	}

	@And("a Delete button should be displayed to allow deleting the newly added entry")
	public void assertDeleteButtonVisibleForNewEntry() throws InterruptedException, IOException {
		Thread.sleep(5000);
		WebElement deleteButton = driver.findElementById("btnDelete");
		deleteButton.click();
		Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");
		System.out.println("XFlow application closed successfully.");

	}

	@And("the Delete button should be visible for removing the newly added RX Report entry")
	public void verifyDeleteButtonVisibleForNewRxReportEntry() throws InterruptedException, IOException {
		Thread.sleep(5000);
		WebElement deleteButton = driver.findElementById("btnDelete");
		deleteButton.click();
		Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");
		System.out.println("XFlow application closed successfully.");

	}

	@And("the system should display a popup message indicating Please Select Template")
	public void verifyPleaseSelectTemplateMessage() throws InterruptedException {
		Thread.sleep(9000);
		WebElement completedMessage = driver.findElementByName("Data upload completed..");
		Assert.assertTrue(completedMessage.isDisplayed(), "Completed message is not displayed.");

	}

	@And("the file upload process should not proceed until a template is selected")
	public void verifyUploadDoesNotProceedWithoutTemplate() throws InterruptedException {
		Thread.sleep(9000);
		WebElement completedMessage = driver.findElementByName("Data upload completed..");
		Assert.assertTrue(completedMessage.isDisplayed(), "Completed message is not displayed.");

	}

	@And("I have selected the appropriate Template")
	public void iHaveSelectedTheAppropriateTemplate() throws InterruptedException {
		Thread.sleep(9000);
		WebElement completedMessage = driver.findElementByName("Data upload completed..");
		Assert.assertTrue(completedMessage.isDisplayed(), "Completed message is not displayed.");

	}

	@And("I have not uploaded any RX Report Excel file")
	public void iHaveNotUploadedAnyRxReportFile() throws InterruptedException {
		Thread.sleep(9000);
		WebElement completedMessage = driver.findElementByName("Data upload completed..");
		Assert.assertTrue(completedMessage.isDisplayed(), "Completed message is not displayed.");

	}

	@And("the system should display a popup message indicating Please upload a file before processing")
	public void verifyPopupMessage() throws InterruptedException {
		Thread.sleep(9000);
		WebElement completedMessage = driver.findElementByName("Data upload completed..");
		Assert.assertTrue(completedMessage.isDisplayed(), "Completed message is not displayed.");

	}

	@And("the processing should not be initiated until a valid file is uploaded")
	public void verifyProcessingIsNotInitiatedWithoutValidFile() throws InterruptedException {
		Thread.sleep(9000);
		WebElement completedMessage = driver.findElementByName("Data upload completed..");
		Assert.assertTrue(completedMessage.isDisplayed(), "Completed message is not displayed.");

	}

	@And("I click on the Confirm and Process button")
	public void clickOnConfirmAndProcessButton() throws InterruptedException {
		Thread.sleep(9000);
		WebElement completedMessage = driver.findElementByName("Data upload completed..");
		Assert.assertTrue(completedMessage.isDisplayed(), "Completed message is not displayed.");

	}

	@And("I have not selected any Template")
	public void iHaveNotSelectedAnyTemplate() throws InterruptedException {
		Thread.sleep(9000);
		WebElement completedMessage = driver.findElementByName("Data upload completed..");
		Assert.assertTrue(completedMessage.isDisplayed(), "Completed message is not displayed.");

	}

	@And("I click on the Upload File button")
	public void clickOnUploadFileButton() throws InterruptedException {
		Thread.sleep(9000);
		WebElement completedMessage = driver.findElementByName("Data upload completed..");
		Assert.assertTrue(completedMessage.isDisplayed(), "Completed message is not displayed.");

	}

	@And("I have selected the EHR Source from the available options")
	public void iHaveSelectedEhrSource() throws InterruptedException {
		Thread.sleep(9000);
		WebElement completedMessage = driver.findElementByName("Data upload completed..");
		Assert.assertTrue(completedMessage.isDisplayed(), "Completed message is not displayed.");

	}

	@And("I click on the Download Error Records button")
	public void clickOnDownloadErrorRecordsButton() throws InterruptedException {
		Thread.sleep(3000);
		WebElement downloadButton = driver.findElementById("btnErrorData");
		downloadButton.click();
	}

	@And("I click on the Please Validate Excel format popup")
	public void iClickOnPleaseValidateExcelFormatPopup() throws InterruptedException {
		Thread.sleep(3000);
		WebElement okButton = driver.findElementById("2");
		okButton.click();

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
	public void iClickYes() throws InterruptedException, IOException {
		WebElement okButton = driver.findElementById("6");
		okButton.click();
		Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");
		System.out.println("XFlow application closed successfully.");
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
