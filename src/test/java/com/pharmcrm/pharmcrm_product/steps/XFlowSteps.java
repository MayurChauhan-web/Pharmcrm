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
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

	@And("I select the Audience Type from the available options")
	public void selectAudienceType() throws InterruptedException {
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

	@And("I Select RX Report Dispensed")
	public void iSelectRXReportDispensed() throws InterruptedException {
		Thread.sleep(5000);
		WebElement dispensedButton = driver.findElementById("btnDispensed");
		dispensedButton.click();

	}

	@And("I Select Clinical Report Appointment")
	public void iSelectClinicalReportAppointment() throws InterruptedException {
		Thread.sleep(5000);
		WebElement dispensedButton = driver.findElementById("btnAppointment");
		dispensedButton.click();

	}

	@And("I Select Demographic")
	public void selectDemographic() throws InterruptedException {
		Thread.sleep(5000);
		WebElement dispensedButton = driver.findElementById("btnDemographic");
		dispensedButton.click();

	}

	@And("I Select Rx Report POS")
	public void iSelectRxReportPOS() throws InterruptedException {
		Thread.sleep(5000);
		WebElement dispensedButton = driver.findElementById("btnPOS");
		dispensedButton.click();

	}

	@And("I Select Data Lead")
	public void iSelectDataLead() throws InterruptedException {
		Thread.sleep(5000);
		WebElement dispensedButton = driver.findElementById("btnLead");
		dispensedButton.click();

	}

	@And("I Select Data Provider")
	public void SelectDataProvider() throws InterruptedException {
		Thread.sleep(5000);
		WebElement dispensedButton = driver.findElementById("btnProvider");
		dispensedButton.click();

	}

	@And("I click the Logout button")
	public void iClickTheLogoutButton() throws InterruptedException {
		Thread.sleep(5000);
		WebElement dispensedButton = driver.findElementById("btnLogOut");
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

	@And("I upload a valid Clinical Report Appointment Excel file")
	public void uploadValidClinicalReportAppointmentExcelFile() throws InterruptedException {
		WebElement uploadBtn = driver.findElement(By.id("btnUpload"));
		uploadBtn.click();
		Thread.sleep(2000);
		WebElement openWindow = driver.findElement(By.name("Open"));
		WebElement fileNameBox = openWindow.findElement(By.xpath(".//*[@ClassName='Edit']"));
		String filePath = "C:\\Users\\MayurChauhan\\Downloads\\Appointment.xlsx";
		fileNameBox.clear();
		fileNameBox.sendKeys(filePath);
		Thread.sleep(500);
		WebElement openButton = openWindow
				.findElement(By.xpath(".//*[@Name='Open' and @LocalizedControlType='button']"));
		openButton.click();
		Thread.sleep(2000);
	}

	@And("I upload a valid Demographic Excel file")
	public void uploadValidDemographicExcelFile() throws InterruptedException {
		WebElement uploadBtn = driver.findElement(By.id("btnUpload"));
		uploadBtn.click();
		Thread.sleep(2000);
		WebElement openWindow = driver.findElement(By.name("Open"));
		WebElement fileNameBox = openWindow.findElement(By.xpath(".//*[@ClassName='Edit']"));
		String filePath = "C:\\Users\\MayurChauhan\\Downloads\\Demographic.xlsx";
		fileNameBox.clear();
		fileNameBox.sendKeys(filePath);
		Thread.sleep(500);
		WebElement openButton = openWindow
				.findElement(By.xpath(".//*[@Name='Open' and @LocalizedControlType='button']"));
		openButton.click();
		Thread.sleep(2000);
	}

	@And("I upload a valid POS Excel file")
	public void iUploadValidPOSExcelFile() throws InterruptedException {
		WebElement uploadBtn = driver.findElement(By.id("btnUpload"));
		uploadBtn.click();
		Thread.sleep(2000);
		WebElement openWindow = driver.findElement(By.name("Open"));
		WebElement fileNameBox = openWindow.findElement(By.xpath(".//*[@ClassName='Edit']"));
		String filePath = "C:\\Users\\MayurChauhan\\Downloads\\POSReportTemplate.xlsx";
		fileNameBox.clear();
		fileNameBox.sendKeys(filePath);
		Thread.sleep(500);
		WebElement openButton = openWindow
				.findElement(By.xpath(".//*[@Name='Open' and @LocalizedControlType='button']"));
		openButton.click();
		Thread.sleep(2000);
	}

	@And("I upload a valid Lead Excel file")
	public void uploadValidLeadExcelFile() throws InterruptedException {
		WebElement uploadBtn = driver.findElement(By.id("btnUpload"));
		uploadBtn.click();
		Thread.sleep(2000);
		WebElement openWindow = driver.findElement(By.name("Open"));
		WebElement fileNameBox = openWindow.findElement(By.xpath(".//*[@ClassName='Edit']"));
		String filePath = "C:\\Users\\MayurChauhan\\Downloads\\POSReportTemplate.xlsx";
		fileNameBox.clear();
		fileNameBox.sendKeys(filePath);
		Thread.sleep(500);
		WebElement openButton = openWindow
				.findElement(By.xpath(".//*[@Name='Open' and @LocalizedControlType='button']"));
		openButton.click();
		Thread.sleep(2000);
	}

	@And("I upload a valid Provider Excel file")
	public void uploadValidProviderExcelFile() throws InterruptedException {
		WebElement uploadBtn = driver.findElement(By.id("btnUpload"));
		uploadBtn.click();
		Thread.sleep(2000);
		WebElement openWindow = driver.findElement(By.name("Open"));
		WebElement fileNameBox = openWindow.findElement(By.xpath(".//*[@ClassName='Edit']"));
		String filePath = "C:\\Users\\MayurChauhan\\Downloads\\POSReportTemplate.xlsx";
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

	@And("I click on the Confirm and Process button without selecting Audience Type")
	public void clickConfirmAndProcessWithoutSelectingAudienceType() throws InterruptedException {
		Thread.sleep(3000);
		WebElement confirmButton = driver.findElementById("btnConfirm");
		confirmButton.click();

	}

	@And("I click on the Confirm and Process button without selecting Upload File")
	public void clickConfirmAndProcessWithoutUpload() throws InterruptedException {
		Thread.sleep(3000);
		WebElement confirmButton = driver.findElementById("btnConfirm");
		confirmButton.click();

	}

	@And("I click on the Confirm and Process button without selecting POS Source")
	public void iClickConfirmAndProcessWithoutPOSSource() throws InterruptedException {
		Thread.sleep(3000);
		WebElement confirmButton = driver.findElementById("btnConfirm");
		confirmButton.click();

	}

	@And("I click on Download Error Records")
	public void clickDownloadErrorRecords() throws InterruptedException, AWTException, IOException {
		Thread.sleep(2000);
		WebElement downloadBtn = driver.findElementById("btnErrorData");
		downloadBtn.click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.setAutoDelay(200);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("File saved successfully from Windows Save dialog.");
		Thread.sleep(2000);
		WebElement okButton = driver.findElementById("2");
		okButton.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");
		System.out.println("XFlow application closed successfully.");
	}

	@And("the system should download the Lead Template file successfully")
	public void clickOnDownloadLeadTemplate() throws InterruptedException, AWTException, IOException {
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.setAutoDelay(200);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("File saved successfully from Windows Save dialog.");
		Thread.sleep(2000);
		WebElement continueButton = driver.findElement(By.name("Continue"));
		continueButton.click();
		System.out.println("Continue button clicked successfully.");
		Thread.sleep(2000);
		Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");
		System.out.println("XFlow application closed successfully.");
	}

	@And("the system should download the Provider Template file successfully")
	public void clickOnDownloadTemplateForProvider() throws InterruptedException, AWTException, IOException {
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.setAutoDelay(200);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("File saved successfully from Windows Save dialog.");
		Thread.sleep(2000);
		WebElement continueButton = driver.findElement(By.name("Continue"));
		continueButton.click();
		System.out.println("Continue button clicked successfully.");
		Thread.sleep(2000);
		Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");
		System.out.println("XFlow application closed successfully.");
	}

	@And("I click on Download Template")
	public void clickDownloadTemplate() throws InterruptedException, AWTException, IOException {
		Thread.sleep(2000);
		WebElement downloadBtn = driver.findElementById("btnDownload");
		downloadBtn.click();

	}

	@And("a success message should be displayed indicating that Data Upload Complated")
	public void successMessageShouldBeDisplayedForDataUpload() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		try {
			boolean isMessageDisplayed = wait.until(
					ExpectedConditions.attributeToBe(By.id("lblProgress"), "Name", "Providers loaded in memory.."));

			if (isMessageDisplayed) {
				WebElement completedMessage = driver.findElement(By.id("lblProgress"));
				String text = completedMessage.getAttribute("Name");
				System.out.println("Message displayed: " + text);
				Assert.assertEquals(text, "Providers loaded in memory..", "Success message is not displayed!");
			}

		} catch (TimeoutException e) {
			WebElement completedMessage = driver.findElement(By.id("lblProgress"));
			String text = completedMessage.getAttribute("Name");
			System.err.println("Timeout waiting for success message. Last displayed: " + text);
			Assert.fail("Success message not displayed within timeout!");
		} finally {
			System.out.println("XFlow");
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
	public void verifyPleaseSelectTemplateMessage() throws InterruptedException, IOException {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("65535")));
		Assert.assertTrue(errorMessage.isDisplayed(), "Error message is not visible.");
		System.out.println("Error message is visible on screen.");
		Thread.sleep(2000);
		WebElement okButton = driver.findElementById("2");
		okButton.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");
		System.out.println("XFlow application closed successfully.");

	}

	@And("the system should display a popup message indicating Please upload a file before processing")
	public void verifyPopupMessage() throws InterruptedException, IOException {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("65535")));
		Assert.assertTrue(errorMessage.isDisplayed(), "Error message is not visible.");
		System.out.println("Error message is visible on screen.");
		Thread.sleep(2000);
		WebElement okButton = driver.findElementById("2");
		okButton.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");
		System.out.println("XFlow application closed successfully.");

	}

	@And("the system should display a popup message indicating Error file not found.")
	public void verifyErrorFileNotFoundPopup() throws InterruptedException, IOException {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("65535")));
		Assert.assertTrue(errorMessage.isDisplayed(), "Error message is not visible.");
		System.out.println("Error message is visible on screen.");
		Thread.sleep(2000);
		WebElement okButton = driver.findElementById("2");
		okButton.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");
		System.out.println("XFlow application closed successfully.");

	}

	@And("the system should display a popup message indicating Please select EHR Source.")
	public void verifyPopupPleaseSelectEHRSource() throws InterruptedException, IOException {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("65535")));
		Assert.assertTrue(errorMessage.isDisplayed(), "Error message is not visible.");
		System.out.println("Error message is visible on screen.");
		Thread.sleep(2000);
		WebElement okButton = driver.findElementById("2");
		okButton.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");
		System.out.println("XFlow application closed successfully.");

	}

	@And("the system should display a popup message indicating Please upload a file.")
	public void verifyPopupPleaseUploadAFile() throws InterruptedException, IOException {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("65535")));
		Assert.assertTrue(errorMessage.isDisplayed(), "Error message is not visible.");
		System.out.println("Error message is visible on screen.");
		Thread.sleep(2000);
		WebElement okButton = driver.findElementById("2");
		okButton.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");
		System.out.println("XFlow application closed successfully.");

	}

	@And("the system should display a popup message indicating Please select an Audience Type.")
	public void verifyAudienceTypeValidationMessage() throws InterruptedException, IOException {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("65535")));
		Assert.assertTrue(errorMessage.isDisplayed(), "Error message is not visible.");
		System.out.println("Error message is visible on screen.");
		Thread.sleep(2000);
		WebElement okButton = driver.findElementById("2");
		okButton.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");
		System.out.println("XFlow application closed successfully.");

	}

	@Then("the system should log me out and display the login screen")
	public void systemShouldLogMeOutAndDisplayLoginScreen() throws InterruptedException, IOException {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUserName")));
		Assert.assertTrue(usernameField.isDisplayed(), "Login screen is not visible after logout.");
		System.out.println("User successfully logged out. Login screen is visible.");
		Thread.sleep(2000);
		Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");
		System.out.println("XFlow application closed successfully.");
	}

	@Then("a text message should appear indicating New version is available for download")
	public void verifyNewVersionAvailableMessage() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lblNote")));
		String actualText = message.getAttribute("Name");
		System.out.println("Displayed message: " + actualText);
		Assert.assertTrue(actualText.contains("New version") && actualText.contains("is available for download"),
				"Update message is incorrect or not visible.");
		System.out.println("Update notification message is correctly displayed.");
		Thread.sleep(1500);
	}

	@Then("the Download button should be visible")
	public void verifyDownloadButtonIsVisible() throws InterruptedException, IOException {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement downloadButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnDownload")));
		Assert.assertTrue(downloadButton.isDisplayed(), "Download button is not visible.");
		System.out.println("Download button is visible on the screen.");
		Thread.sleep(1500);
		Runtime.getRuntime().exec("taskkill /F /IM PharmCRM.UploadWizard.exe");
		System.out.println("XFlow application closed successfully.");
	}

	@And("I click on the Confirm and Process button")
	public void clickOnConfirmAndProcessButton() throws InterruptedException {
		Thread.sleep(3000);
		WebElement okButton = driver.findElementById("btnConfirm");
		okButton.click();

	}

	@And("I click on the Upload File button")
	public void clickOnUploadFileButton() throws InterruptedException {
		Thread.sleep(3000);
		WebElement okButton = driver.findElementById("btnUpload");
		okButton.click();

	}

	@And("I click on the Download Error Records button")
	public void clickOnDownloadErrorRecordsButton() throws InterruptedException {
		Thread.sleep(3000);
		WebElement downloadButton = driver.findElementById("btnErrorData");
		downloadButton.click();
	}

	@And("I click on the Upload File button without selecting EHR Source")
	public void selectClinicalReportAppointment() throws InterruptedException {
		Thread.sleep(3000);
		WebElement downloadButton = driver.findElementById("btnUpload");
		downloadButton.click();
	}

	@And("I click on the Confirm and Process button without selecting EHR Source")
	public void clickConfirmAndProcessWithoutSelectingEHRSource() throws InterruptedException {
		Thread.sleep(3000);
		WebElement downloadButton = driver.findElementById("btnConfirm");
		downloadButton.click();
	}

	@And("I click on the Download Error Records button without selecting EHR Source")
	public void clickDownloadErrorRecordsWithoutSelectingEHRSource() throws InterruptedException {
		Thread.sleep(3000);
		WebElement downloadButton = driver.findElementById("btnErrorData");
		downloadButton.click();
	}

	@And("I click on the Download Error Records button without selecting POS Source")
	public void iClickDownloadErrorRecordsWithoutPOSSource() throws InterruptedException {
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
