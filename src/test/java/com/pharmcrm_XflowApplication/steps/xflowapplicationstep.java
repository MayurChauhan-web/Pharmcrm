package com.pharmcrm_XflowApplication.steps;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import com.pharmcrm_XflowApplication.pages.xflowapplicationpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class xflowapplicationstep {

	private xflowapplicationpage xflowapplicationpage;

	private WiniumDriver driver;
	private String appPath = "C:\\Program Files (x86)\\Default Company Name\\XFlow.QA\\PharmCRM.UploadWizard.exe";

	@Given("the XFlow application is installed test")
	public void the_xflow_application_is_installed() {
		File appFile = new File(appPath);
		if (!appFile.exists()) {
			throw new RuntimeException("App not found at: " + appPath);
		}
	}

	@When("I launch the XFlow application test")
	public void i_launch_the_xflow_application() throws Exception {
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath(appPath);
		System.out.println("Connecting to Winium server...");
		driver = new WiniumDriver(new URL("http://localhost:9999"), options);
		xflowapplicationpage = new xflowapplicationpage(driver);
	}

	@Then("I click No test")
	public void userClicksNoButton() throws InterruptedException, IOException {
		xflowapplicationpage.clickNoButton();
	}

	@Then("I leave the username and password fields empty test")
	public void iLeaveUsernameAndPasswordEmpty() throws InterruptedException, IOException {
		xflowapplicationpage.leaveUsernameAndPasswordFieldsEmpty();
	}

	@Then("I should remain on the connection screen test")
	public void iShouldRemainOnConnectionScreen() throws InterruptedException, IOException {
		xflowapplicationpage.connectionScreenShouldStillBeDisplayed();
	}

	@Then("the system should display a message indicating Database Connection Verified Successfully test")
	public void databaseConnectionSuccessMessageIsDisplayed() throws InterruptedException {
		xflowapplicationpage.verifyDatabaseConnectionIsSuccessfulMessageDisplayed();
	}

	@Then("I click the Test Connection button test")
	public void iClickTestConnectionButton() throws InterruptedException {
		xflowapplicationpage.clickTestConnectionButton();
	}

	@Then("the application should open successfully test")
	public void the_application_should_open_successfully() {
		System.out.println("XFlow launched successfully!");
	}

	@And("a success message should be displayed indicating that Data Upload Complated test")
	public void dataUploadCompletedSuccessMessageIsDisplayed() throws InterruptedException, IOException {
		xflowapplicationpage.dataUploadSuccessMessageDisplayed();
	}

	@And("I click on Confirm and Process test")
	public void clickConfirmAndProcessButton() throws InterruptedException, IOException {
		xflowapplicationpage.iClickConfirmAndProcess();
	}

	@And("I click on the Please Validate Excel format popup test")
	public void iClickPleaseValidateExcelFormatPopup() throws InterruptedException, IOException {
		xflowapplicationpage.clickPleaseValidateExcelFormatPopup();
	}

	@And("I select the Template from the available options test")
	public void iSelectTemplateFromAvailableOptions() throws InterruptedException, IOException {
		xflowapplicationpage.selectTemplateFromAvailableOptions();
	}

	@And("I upload a valid RX Report Dispensed Excel file test")
	public void iUploadValidRXReportDispensedExcelFile() throws InterruptedException, IOException {
		xflowapplicationpage.uploadValidRXReportDispensedExcelFile();
	}

	@And("I select the EHR Source from the available options test")
	public void iSelectEHRSourceFromAvailableOptions() throws InterruptedException, IOException {
		xflowapplicationpage.selectEHRSourceFromAvailableOptions();
	}

	@And("I click on Download Error Records test")
	public void iClickDownloadErrorRecords() throws InterruptedException, IOException, AWTException {
		xflowapplicationpage.clickDownloadErrorRecords();
	}

	@And("the Delete button should be visible for removing the newly added RX Report entry test")
	public void deleteButtonShouldBeVisibleForRXReportEntry() throws InterruptedException, IOException {
		xflowapplicationpage.verifyDeleteButtonIsVisibleForRXReportEntry();
	}

	@And("a Delete button should be displayed to allow deleting the newly added entry test")
	public void verifyDeleteButtonIsDisplayedForNewEntry() throws InterruptedException, IOException {
		xflowapplicationpage.deleteButtonShouldBeDisplayed();
	}

	@And("I click on the Add+ button test")
	public void userClicksAddButton() throws InterruptedException, IOException {
		xflowapplicationpage.iClickAddButton();
	}

	@And("the system should display a popup message indicating Please Select Template test")
	public void pleaseSelectTemplatePopupMessageIsDisplayed() throws InterruptedException, IOException {
		xflowapplicationpage.templateNotSelectedPopupIsDisplayed();
	}

	@And("I click on the Upload File button test")
	public void userClicksUploadFileButton() throws InterruptedException, IOException {
		xflowapplicationpage.iClickUploadFileButton();
	}

	@And("I Select RX Report Dispensed test")
	public void iSelectRXReportDispensed() throws InterruptedException, IOException {
		xflowapplicationpage.selectRXReportDispensed();
	}

	@And("I enter username and password and click OK test")
	public void i_enter_username_and_password_and_click_ok() throws InterruptedException {
		xflowapplicationpage.loginToApplication();
	}

	@And("I enter a valid username and an incorrect password test")
	public void iEnterAValidUsernameAndAnIncorrectPassword() throws InterruptedException {
		xflowapplicationpage.iEnterValidUsernameAndIncorrectPassword();
	}

	@And("I should remain on the login screen test")
	public void iShouldRemainOnLoginScreen() throws InterruptedException, IOException {
		xflowapplicationpage.verifyUserIsStillOnLoginScreen();
	}

	@And("the system should display an error message indicating Invalid username or password test")
	public void systemShouldDisplayInvalidUsernameOrPasswordErrorMessage() throws InterruptedException {
		xflowapplicationpage.errorMessageForInvalidCredentialsIsDisplayed();
	}

	@And("I click Yes test")
	public void clickYesButton() throws InterruptedException, IOException {
		xflowapplicationpage.iClickYes();
	}

	@And("the system should display a confirmation message saying Are you sure you want to exit the application? test")
	public void verifyExitApplicationConfirmationMessageIsDisplayed() throws InterruptedException {
		xflowapplicationpage.exitConfirmationMessageIsDisplayed();
	}

	@And("I click the Cancel button test")
	public void iClickCancelButton() throws InterruptedException {
		xflowapplicationpage.clickCancelButton();
	}

	@And("the system should display an error message indicating that Please enter username and password test")
	public void verifyEmptyUsernameAndPasswordErrorMessageIsDisplayed() throws InterruptedException {
		xflowapplicationpage.emptyCredentialsErrorMessageIsDisplayed();
	}

	@And("I click OK test")
	public void clickOkButton() throws InterruptedException {
		xflowapplicationpage.iClickOk();
	}

	@And("the application is open test")
	public void theApplicationIsOpen() throws Exception {
		Thread.sleep(5000);
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath(appPath);
		System.out.println("Connecting to Winium server...");
		driver = new WiniumDriver(new URL("http://localhost:9999"), options);
		System.out.println("XFlow launched successfully!");

	}

}
