package com.pharmcrm.pharmcrm_product.steps;

import java.time.Duration;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import driver.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class WorkflowSteps {

	String createdEmail;
	String baseUrl = "http://qa01.pharmcrm.com";
	String profileName;

	private WebDriver driver = DrugSteps.driver;
	private WebDriverWait wait = DrugSteps.wait;

	public WorkflowSteps() {
		this.driver = DriverFactory.getDriver();
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	@Given("I log in as admin for Workflow Module")
	public void userLogsInAsAdminForWorkflowModule() {
		if (!isInternetAvailable()) {
			Assert.fail("Internet connection not available. Please check your connection.");
		}
		driver = DriverFactory.createDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get(baseUrl);
		measurePageLoadTime(baseUrl, 5000);
		waitAndSendKeys(By.id("UserName"), "support@pharmcrm.com");
		waitAndSendKeys(By.id("Password"), "Admin@1234");
		clickWhenClickable(By.id("btnSubmit"));
	}

	@When("I create a new user with email for Workflow Module {string}")
	public void userCreatesNewUserWithEmailInWorkflowModule(String email) {
		this.createdEmail = email;
		DrugSteps.createdEmail = email;
		clickWhenClickable(By.xpath("//a[@href='#']//span[@class='userTopIcon']//*[name()='svg']"));
		clickWhenClickable(By.xpath("//a[@id='liUsers']//span[@class='userTopIcon']//*[name()='svg']"));
		clickWhenClickable(By.xpath("//span[normalize-space()='New User']"));
		selectDropdownByIndexWhenReady(By.id("TenantRoleId"), 1);
		waitAndSendKeys(By.id("User_EmailId"), createdEmail);
		waitAndSendKeys(By.id("User_FirstName"), "John");
		waitAndSendKeys(By.id("User_LastName"), "Doe");
		waitAndSendKeys(By.id("User_Zone"), "500");
		waitAndSendKeys(By.id("User_PhoneNumber"), "1234567890");
		waitAndSendKeys(By.id("User_MailingAddress_Street"), "123 Main St");
		waitAndSendKeys(By.id("User_MailingAddress_City"), "Los Angeles");
		waitAndSendKeys(By.id("User_MailingAddress_State"), "California");
		waitAndSendKeys(By.id("User_MailingAddress_ZipCode"), "90001");
		waitAndSendKeys(By.id("User_MailingAddress_Country"), "USA");
		clickWhenClickable(By.xpath("//label[@for='User_MobileAccess_IsMobileUser']"));
		clickWhenClickable(By.xpath("//label[@for='User_MobileAccess_SalesAccess']"));
		clickWhenClickable(By.xpath("//label[@for='User_MobileAccess_DeliveryAccess']"));
		clickWhenClickable(By.id("btnSave"));
		sleep(3000);
	}

	@And("I create a profile with View access only to Workflow Module General Audit View")
	public void userCreatesProfileWithViewAccessOnlyForWorkflowGeneralAuditView() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with No access to Workflow Module General Audit View")
	public void userCreatesProfileWithNoAccessForWorkflowGeneralAuditView() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg37WorkflowAuditView']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Sync Workflow Settings in Workflow Module")
	public void userCreatesProfileWithViewAndDeleteNoAddEditForSyncWorkflowSettings() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg19SyncWorkflowSettingsDelete']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Medication Sync Reminder Color Code in Workflow Module")
	public void iCreateAProfileWithViewAndDeleteAccessButNoAddOrEditAccessToMedicationSyncReminderColorCodeInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg44MedicationSyncReminderColorCodeDelete']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Reminder Result Action in Workflow Module")
	public void iCreateAProfileWithViewAndAddAccessButNoEditOrDeleteAccessToReminderResultActionInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg19ReminderResultActionAdd']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Reminder Result Action in Workflow Module")
	public void iCreateAProfileWithViewAndEditAccessButNoAddOrDeleteAccessToReminderResultActionInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg19ReminderResultActionEdit']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Reminder Result Action in Workflow Module")
	public void iCreateAProfileWithViewAndDeleteAccessButNoAddOrEditAccessToReminderResultActionInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg19ReminderResultActionDelete']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Followup Trail Script in Workflow Module")
	public void createProfileWithViewAndAddButNoEditOrDeleteForFollowupTrailScript() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg35FollowupTrailScriptAdd']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Queue in Workflow Module")
	public void createProfileWithViewAndDeleteButNoAddOrEditForQueue() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg01QueueDelete']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Incoming Call Types in Workflow Module")
	public void userHasViewAndAddAccessButNoEditOrDeleteAccessToIncomingCallTypesInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg03IncomingCallAdd']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Prescription Status in Workflow Module")
	public void userHasViewAndDeleteAccessButNoAddOrEditAccessToPrescriptionStatusInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg44PrescriptionStatusDelete']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Comment, Alert, and Export Excel access to Sync Workflow Module")
	public void createProfileWithViewCommentAlertExportExcelAccessForSyncWorkflow() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with only View access and no Comment, Alert, or Export Excel access to Sync Workflow Module")
	public void createProfileWithViewOnlyAccessForSyncWorkflow() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Comment']"));
		clickWhenClickable(By.xpath("//label[normalize-space()='Alert']"));
		clickWhenClickable(By.xpath("//label[@for='chkg6SyncWorkflowDownload']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with the all Additional Access permissions for Display Workflow Module:")
	public void createProfileWithAllAdditionalAccessForDisplayWorkflow() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with only View permission for Display Workflow Module")
	public void createProfileWithOnlyViewForDisplayWorkflow() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg7RxWorkFlowAll']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg7DisplayWorkFlowView']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with the following permissions for Action Workflow Module:")
	public void createProfileWithPermissionsForActionWorkflow() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with only View permission for Action Workflow Module")
	public void createProfileWithOnlyViewForActionWorkflow() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg7ActionWorkFlowAll']"));
		clickWhenClickable(By.xpath("//label[@for='chkg7ActionWorkFlowView']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with the all permissions for Followup Workflow Module:")
	public void createProfileWithAllPermissionsForFollowupWorkflow() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with only View permission for Followup Workflow Module")
	public void createProfileWithOnlyViewForFollowupWorkflow() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg7FollowUpAll']"));
		clickWhenClickable(By.xpath("//label[@for='chkg7FollowUpView']"));
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with the following permissions for Audit Workflow Module:")
	public void createProfileWithPermissionsForAuditWorkflow() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with only View permission for Audit Workflow Module")
	public void createProfileWithOnlyViewForAuditWorkflow() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg43AuditWorkflowAll']"));
		clickWhenClickable(By.xpath("//label[@for='chkg43AuditWorkflowView']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Prescription Status in Workflow Module")
	public void userHasViewAndEditAccessButNoAddOrDeleteAccessToPrescriptionStatusInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg44PrescriptionStatusEdit']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Prescription Status in Workflow Module")
	public void userHasViewAndAddAccessButNoEditOrDeleteAccessToPrescriptionStatusInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg44PrescriptionStatusAdd']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Program 340B in Workflow Module")
	public void userHasViewAndDeleteAccessButNoAddOrEditAccessToProgram340BInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg44Program340BDelete']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Program 340B in Workflow Module")
	public void userHasViewAndEditAccessButNoAddOrDeleteAccessToProgram340BInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg44Program340BEdit']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Program 340B in Workflow Module")
	public void userHasViewAndAddAccessButNoEditOrDeleteAccessToProgram340BInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg44Program340BAdd']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Outgoing Call Types in Workflow Module")
	public void userHasViewAndDeleteAccessButNoAddOrEditAccessToOutgoingCallTypesInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg03OutgoingCallDelete']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Outgoing Call Types in Workflow Module")
	public void userHasViewAndEditAccessButNoAddOrDeleteAccessToOutgoingCallTypesInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg03OutgoingCallEdit']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Outgoing Call Types in Workflow Module")
	public void userHasViewAndAddAccessButNoEditOrDeleteAccessToOutgoingCallTypesInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg03OutgoingCallAdd']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Incoming Call Types in Workflow Module")
	public void userHasViewAndDeleteAccessButNoAddOrEditAccessToIncomingCallTypesInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg03IncomingCallDelete']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Incoming Call Types in Workflow Module")
	public void userHasViewAndEditAccessButNoAddOrDeleteAccessToIncomingCallTypesInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg03IncomingCallEdit']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Runningline Level2 Status in Workflow Module")
	public void userHasViewAndDeleteAccessButNoAddOrEditAccessToRunninglineLevel2StatusInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg02RunninglineLevel2StatusDelete']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Runningline Level2 Status in Workflow Module")
	public void userHasViewAndEditAccessButNoAddOrDeleteAccessToRunninglineLevel2StatusInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg02RunninglineLevel2StatusEdit']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Runningline Level2 Status in Workflow Module")
	public void userHasViewAndAddAccessButNoEditOrDeleteAccessToRunninglineLevel2StatusInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg02RunninglineLevel2StatusAdd']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Runningline Level1 Status in Workflow Module")
	public void userHasViewAndDeleteAccessButNoAddOrEditAccessToRunninglineLevel1StatusInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg02RunninglineLevel1StatusDelete']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Runningline Level1 Status in Workflow Module")
	public void userHasViewAndEditAccessButNoAddOrDeleteAccessToRunninglineLevel1StatusInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg02RunninglineLevel1StatusEdit']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Runningline Level1 Status in Workflow Module")
	public void userHasViewAndAddAccessButNoEditOrDeleteAccessToRunninglineLevel1StatusInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg02RunninglineLevel1StatusAdd']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Runningline Status in Workflow Module")
	public void userHasViewAndDeleteAccessButNoAddOrEditAccessToRunninglineStatusInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg01RunningLineStatusDelete']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Runningline Status in Workflow Module")
	public void createProfileWithViewAndEditNoAddDeleteAccessRunninglineStatus() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg01RunningLineStatusEdit']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Runningline Status in Workflow Module")
	public void createProfileWithViewAndAddNoEditDeleteAccessRunninglineStatus() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg01RunningLineStatusAdd']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Queue in Workflow Module")
	public void createProfileWithViewAndEditButNoAddOrDeleteForQueue() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg01QueueEdit']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Queue in Workflow Module")
	public void createProfileWithViewAndAddButNoEditOrDeleteForQueue() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg01QueueAdd']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Followup Trail Script in Workflow Module")
	public void createProfileWithViewAndDeleteButNoAddOrEditForFollowupTrailScript() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg35FollowupTrailScriptDelete']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Followup Trail Script in Workflow Module")
	public void createProfileWithViewAndEditButNoAddOrDeleteForFollowupTrailScript() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg35FollowupTrailScriptEdit']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Transfer Result Action in Workflow Module")
	public void createProfileWithViewAndDeleteButNoAddOrEditForTransferResultAction() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg20TransferResultActionDelete']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Transfer Result Action in Workflow Module")
	public void createProfileWithViewAndEditButNoAddOrDeleteForTransferResultAction() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg20TransferResultActionEdit']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Transfer Result Action in Workflow Module")
	public void createProfileWithViewAndAddButNoEditOrDeleteForTransferResultAction() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg20TransferResultActionAdd']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Failure Result Action in Workflow Module")
	public void createProfileWithViewAndDeleteButNoAddOrEditForFailureResultAction() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg19FailureResultActionDelete']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Failure Result Action in Workflow Module")
	public void createProfileWithViewAndEditButNoAddOrDeleteForFailureResultAction() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg19FailureResultActionEdit']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Failure Result Action in Workflow Module")
	public void createProfileWithViewAndAddButNoEditOrDeleteForFailureResultAction() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg19FailureResultActionAdd']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Success Result Action in Workflow Module")
	public void createProfileWithViewAndDeleteButNoAddOrEditForSuccessResultAction() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg19SuccessResultActionDelete']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Success Result Action in Workflow Module")
	public void createProfileWithViewAndEditButNoAddOrDeleteForSuccessResultAction() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg19SuccessResultActionEdit']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Success Result Action in Workflow Module")
	public void createProfileWithViewAndAddButNoEditOrDeleteForSuccessResultAction() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg19SuccessResultActionAdd']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Medication Sync Reminder Color Code in Workflow Module")
	public void iCreateAProfileWithViewAndEditAccessButNoAddOrDeleteAccessToMedicationSyncReminderColorCodeInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg44MedicationSyncReminderColorCodeEdit']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Medication Sync Reminder Color Code in Workflow Module")
	public void iCreateAProfileWithViewAndAddAccessButNoEditOrDeleteAccessToMedicationSyncReminderColorCodeInWorkflowModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg44MedicationSyncReminderColorCodeAdd']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Sync Workflow Settings in Workflow Module")
	public void userCreatesProfileWithViewAndEditNoAddDeleteForSyncWorkflowSettings() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg19SyncWorkflowSettingsEdit']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Sync Workflow Settings in Workflow Module")
	public void userCreatesProfileWithViewAndAddNoEditDeleteForSyncWorkflowSettings() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Workflow Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg19SyncWorkflowSettingsAdd']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I assign the profile and workspace to the user for Workflow Module")
	public void userAssignsProfileAndWorkspaceToUserForWorkflowModule() {
		sleep(2000);
		driver.get(baseUrl + "/Setup/Home/WorkspaceUsers");
		clickWhenClickable(By.xpath("//span[normalize-space()='New User']"));
		WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUserSearch")));
		searchBox.sendKeys(createdEmail);
		sleep(3000);
		By firstItemLocator = By.xpath("(//a[@class='list-group-item list-group-item-action'])[1]");
		sleep(3000);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(firstItemLocator, createdEmail));
		sleep(3000);
		WebElement firstItem = wait.until(ExpectedConditions.visibilityOfElementLocated(firstItemLocator));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", firstItem);
		sleep(500);
		selectDropdownByVisibleTextWhenReady(By.id("WorkspaceUser_Profile_Id"), profileName);
		sleep(500);
		clickWhenClickable(By.id("btnSubmitUser"));
		sleep(3000);

	}

	@And("I reset the user's password for Workflow Module")
	public void userResetsPasswordForWorkflowModuleUser() {
		sleep(3000);
		clickWhenReadyAndVisible(By.xpath("//span[normalize-space()='Filter']"));
		waitAndSendKeys(By.id("Filter_Email"), createdEmail);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		sleep(3000);
		String email = createdEmail;
		By actionMenu = By.xpath("//tr[td[normalize-space()='" + email + "']]//td[@class='text-right']//button");
		clickWhenClickable(actionMenu);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Reset Password')]"));
		waitAndSendKeys(By.id("newPassword"), "Admin@123");
		sleep(500);
		waitAndSendKeys(By.id("confirmPassword"), "Admin@123");
		clickWhenClickable(By.xpath("//label[normalize-space()='Show Password']"));
		sleep(500);
		clickWhenClickable(By.id("btnResetPassword"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='toast toast-success']")));
		// Logout
		sleep(1000);
		WebElement initialsBtn = driver.findElement(By.cssSelector("button[id='userInitials'] span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", initialsBtn);
		clickWhenClickable(By.id("LogoutID"));
	}

	@And("I log in using the new user for Workflow Module")
	public void userLogsInWithNewUserForWorkflowModule() {
		sleep(2000);
		waitAndSendKeys(By.id("UserName"), createdEmail);
		waitAndSendKeys(By.id("Password"), "Admin@123");
		clickWhenClickable(By.id("btnSubmit"));
		waitAndSendKeys(By.id("OldPassword"), "Admin@123");
		waitAndSendKeys(By.id("NewPassword"), "Admin@1234");
		waitAndSendKeys(By.id("ConfirmNewPassword"), "Admin@1234");
		clickWhenClickable(By.id("btnSubmit"));
		waitAndSendKeys(By.id("UserName"), createdEmail);
		sleep(500);
		waitAndSendKeys(By.id("Password"), "Admin@1234");
		sleep(500);
		clickWhenClickable(By.id("btnSubmit"));
	}

	@And("the user should be able to view General Audit View settings in Workflow Module")
	public void userShouldBeAbleToViewGeneralAuditSettingsInWorkflowModule() {
		sleep(3000);
		driver.get(baseUrl + "/Workflow/Home/Dashboard");
		wait.until(ExpectedConditions.urlContains("/Workflow/Home/Dashboard"));
		sleep(3000);
		assertElementPresent(By.xpath("//th[@id='UpdatedDate']"));

	}

	@And("the user should not be able to edit Sync Workflow Settings in Workflow Module")
	public void userShouldNotBeAbleToEditSyncWorkflowSettingsInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to edit Medication Sync Reminder Color Code in Workflow Module")
	public void userShouldNotBeAbleToEditMedicationSyncReminderColorCodeInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to edit Reminder Result Action in Workflow Module")
	public void userShouldNotBeAbleToEditReminderResultActionInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to add Sync Workflow Settings in Workflow Module")
	public void userShouldNotBeAbleToAddSyncWorkflowSettingsInWorkflowModule() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Medication Sync Reminder']"));

	}

	@And("the user should not be able to add Medication Sync Reminder Color Code in Workflow Module")
	public void userShouldNotBeAbleToAddMedicationSyncReminderColorCodeInWorkflowModule() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Medication Sync Color']"));

	}

	@And("the user should be able to delete Sync Workflow Settings in Workflow Module")
	public void userShouldBeAbleToDeleteSyncWorkflowSettingsInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='deletepatientmedicalSetting']"));

	}

	@And("the user should be able to delete Medication Sync Reminder Color Code in Workflow Module")
	public void userShouldBeAbleToDeleteMedicationSyncReminderColorCodeInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to delete Reminder Result Action in Workflow Module")
	public void userShouldBeAbleToDeleteReminderResultActionInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should not be able to add Reminder Result Action in Workflow Module")
	public void userShouldNotBeAbleToAddReminderResultActionInWorkflowModule() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Reminder Result Action']"));

	}

	@And("the user should be able to edit Sync Workflow Settings in Workflow Module")
	public void userShouldBeAbleToEditSyncWorkflowSettingsInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("SyncWorkflowSetting_Notes"), "Monthly Blood Pressure Check Reminder");
		clickWhenClickable(By.xpath("//button[@id='btnSaveMedicationSetting']"));

	}

	@And("the user should be able to edit Medication Sync Reminder Color Code in Workflow Module")
	public void userShouldBeAbleToEditMedicationSyncReminderColorCodeInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("MedicationSyncReminderColorCode_Title"), "Gray");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to edit Reminder Result Action in Workflow Module")
	public void userShouldBeAbleToEditReminderResultActionInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("ReminderResultAction_Name"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to delete Sync Workflow Settings in Workflow Module")
	public void userShouldNotBeAbleToDeleteSyncWorkflowSettingsInWorkflowModule() {
		sleep(1000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to delete Medication Sync Reminder Color Code in Workflow Module")
	public void userShouldNotBeAbleToDeleteMedicationSyncReminderColorCodeInWorkflowModule() {
		sleep(1000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to delete Reminder Result Action in Workflow Module")
	public void userShouldNotBeAbleToDeleteReminderResultActionInWorkflowModule() {
		sleep(1000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to add Sync Workflow Settings in Workflow Module")
	public void userShouldBeAbleToAddSyncWorkflowSettingsInWorkflowModule() {
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Medication Sync Reminder']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='SyncWorkflowSetting_DayTypeId']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("SyncWorkflowSetting_DayTypeId"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='SyncWorkflowSetting_Day']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("SyncWorkflowSetting_Day"), 2);
		sleep(2000);
		waitAndSendKeys(By.id("SyncWorkflowSetting_Notes"), "Monthly Blood Pressure Check Reminder");
		clickWhenClickable(By.xpath("//button[@id='btnSaveMedicationSetting']"));

	}

	@And("the user should be able to add Medication Sync Reminder Color Code in Workflow Module")
	public void userShouldBeAbleToAddMedicationSyncReminderColorCodeInWorkflowModule() {
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Medication Sync Color']"));
		sleep(2000);
		waitAndSendKeys(By.id("MedicationSyncReminderColorCode_Title"), "Gray");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add Reminder Result Action in Workflow Module")
	public void userShouldBeAbleToAddReminderResultActionInWorkflowModule() {
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Reminder Result Action']"));
		sleep(2000);
		waitAndSendKeys(By.id("ReminderResultAction_Name"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to view Sync Workflow Settings in Workflow Module")
	public void userShouldBeAbleToViewSyncWorkflowSettingsInWorkflowModule() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/MedicationSyncReminderSetting");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/MedicationSyncReminderSetting"));
		sleep(3000);
		assertElementPresent(By.xpath("//th[normalize-space()='Day Type']"));

	}

	@And("the user should be able to view Medication Sync Reminder Color Code in Workflow Module")
	public void userShouldBeAbleToViewMedicationSyncReminderColorCodeInWorkflowModule() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/MedicationSyncReminderColorCodes");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/MedicationSyncReminderColorCodes"));
		sleep(3000);
		assertElementPresent(By.xpath("//th[normalize-space()='Title']"));

	}

	@And("the user should be able to view Reminder Result Action in Workflow Module")
	public void userShouldBeAbleToViewReminderResultActionInWorkflowModule() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/ReminderResultActions");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ReminderResultActions"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Name']"));

	}

	@And("the user should not be able to add Success Result Action in Workflow Module")
	public void userShouldNotBeAbleToAddSuccessResultAction() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Success Result Action']"));

	}

	@And("the user should not be able to add Transfer Result Action in Workflow Module")
	public void userShouldNotBeAbleToAddTransferResultAction() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Transfer Result Action']"));

	}

	@And("the user should not be able to add Followup Trail Script in Workflow Module")
	public void userShouldNotBeAbleToAddFollowupTrailScript() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Call Script']"));

	}

	@And("the user should be able to delete Queue in Workflow Module")
	public void userShouldBeAbleToDeleteQueue() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@class='gridRecordContextInner']//span[normalize-space()='Delete']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should not be able to add Queue in Workflow Module")
	public void userShouldNotBeAbleToAddQueue() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Queue']"));

	}

	@And("the user should be able to edit Queue in Workflow Module")
	public void userShouldBeAbleToEditQueue() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("Queue_Name"), "Call Patient");
		waitAndSendKeys(By.id("Queue_Label"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to delete Queue in Workflow Module")
	public void userShouldNotBeAbleToDeleteQueue() {
		sleep(1000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//*[@id=\"btnDeleteQueue\"]"));

	}

	@And("the user should not be able to edit Queue in Workflow Module")
	public void userShouldNotBeAbleToEditQueue() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to add Queue in Workflow Module")
	public void userShouldBeAbleToAddQueue() {
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Queue']"));
		sleep(2000);
		waitAndSendKeys(By.id("Queue_Name"), "Call Patient");
		waitAndSendKeys(By.id("Queue_Label"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to view Queue in Workflow Module")
	public void userShouldBeAbleToViewQueue() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/Queues");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Queues"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Name']"));

	}

	@And("the user should not be able to delete Runningline Status in Workflow Module")
	public void userShouldNotBeAbleToDeleteRunninglineStatusInWorkflowModule() {
		sleep(1000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to delete Runningline Status in Workflow Module")
	public void userShouldBeAbleToDeleteRunninglineStatusInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@class='gridRecordContextInner']//span[normalize-space()='Delete']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnDeleteConfirm']"));
	}

	@And("the user should not be able to add Runningline Status in Workflow Module")
	public void userShouldNotBeAbleToAddRunninglineStatusInWorkflowModule() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Runningline Status']"));

	}

	@And("the user should be able to edit Runningline Status in Workflow Module")
	public void userShouldBeAbleToEditRunninglineStatusInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("RunninglineStatus_Name"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to edit Runningline Status in Workflow Module")
	public void userShouldNotBeAbleToEditRunninglineStatusInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
	}

	@And("the user should be able to add Runningline Status in Workflow Module")
	public void userShouldBeAbleToAddRunninglineStatusInWorkflowModule() {
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Runningline Status']"));
		sleep(2000);
		waitAndSendKeys(By.id("RunninglineStatus_Name"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to view Runningline Status in Workflow Module")
	public void userShouldBeAbleToViewRunninglineStatusInWorkflowModule() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/RunninglineStatuses");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RunninglineStatuses"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Name']"));

	}

	@And("the user should not be able to add Runningline Level1 Status in Workflow Module")
	public void userShouldNotBeAbleToAddRunninglineLevel1StatusInWorkflowModule() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Runningline Level-1 Status']"));
	}

	@And("the user should be able to delete Runningline Level1 Status in Workflow Module")
	public void userShouldBeAbleToDeleteRunninglineLevel1StatusInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to edit Runningline Level1 Status in Workflow Module")
	public void userShouldBeAbleToEditRunninglineLevel1StatusInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("RunninglineLevel1Status_Level1"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to delete Runningline Level1 Status in Workflow Module")
	public void userShouldNotBeAbleToDeleteRunninglineLevel1StatusInWorkflowModule() {
		sleep(1000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit Runningline Level1 Status in Workflow Module")
	public void userShouldNotBeAbleToEditRunninglineLevel1StatusInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to add Runningline Level1 Status in Workflow Module")
	public void userShouldBeAbleToAddRunninglineLevel1StatusInWorkflowModule() {
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Runningline Level-1 Status']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='RunninglineLevel1Status_RunninglineStatus_Id']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("RunninglineLevel1Status_RunninglineStatus_Id"), 1);
		sleep(2000);
		waitAndSendKeys(By.id("RunninglineLevel1Status_Level1"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to view Runningline Level1 Status in Workflow Module")
	public void userShouldBeAbleToViewRunninglineLevel1StatusInWorkflowModule() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/RunninglineLevel1Statuses");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RunninglineLevel1Statuses"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Level 1']"));

	}

	@And("the user should not be able to delete Runningline Level2 Status in Workflow Module")
	public void userShouldNotBeAbleToDeleteRunninglineLevel2StatusInWorkflowModule() {
		sleep(1000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to view Incoming Call Types in Workflow Module")
	public void userShouldBeAbleToViewIncomingCallTypesInWorkflowModule() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/IncomingCalls");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/IncomingCalls"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Incoming Call Type']"));

	}

	@And("the user should be able to delete Runningline Level2 Status in Workflow Module")
	public void userShouldBeAbleToDeleteRunninglineLevel2StatusInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should not be able to add Runningline Level2 Status in Workflow Module")
	public void userShouldNotBeAbleToAddRunninglineLevel2StatusInWorkflowModule() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Runningline Level-2 Status']"));
	}

	@And("the user should be able to edit Runningline Level2 Status in Workflow Module")
	public void userShouldBeAbleToEditRunninglineLevel2StatusInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='RunninglineLevel2Status_RunninglineStatus_Id']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("RunninglineLevel2Status_RunninglineStatus_Id"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='RunninglineLevel2Status_Level1_Id']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("RunninglineLevel2Status_Level1_Id"), 1);
		sleep(2000);
		waitAndSendKeys(By.id("RunninglineLevel2Status_Level2"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to edit Runningline Level2 Status in Workflow Module")
	public void userShouldNotBeAbleToEditRunninglineLevel2StatusInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to add Runningline Level2 Status in Workflow Module")
	public void userShouldBeAbleToAddRunninglineLevel2StatusInWorkflowModule() {
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Runningline Level-2 Status']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='RunninglineLevel2Status_RunninglineStatus_Id']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("RunninglineLevel2Status_RunninglineStatus_Id"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='RunninglineLevel2Status_Level1_Id']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("RunninglineLevel2Status_Level1_Id"), 1);
		sleep(2000);
		waitAndSendKeys(By.id("RunninglineLevel2Status_Level2"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to view Runningline Level2 Status in Workflow Module")
	public void userShouldBeAbleToViewRunninglineLevel2StatusInWorkflowModule() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/RunninglineLevel2Statuses");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RunninglineLevel2Statuses"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Level 2']"));

	}

	@And("the user should be able to add Incoming Call Types in Workflow Module")
	public void addIncomingCallTypesInWorkflowModule() {
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New InComing Call Types']"));
		sleep(2000);
		waitAndSendKeys(By.id("IncomingCall_CallTypeText"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to delete Incoming Call Types in Workflow Module")
	public void cannotDeleteIncomingCallTypesInWorkflowModule() {
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to deletes Incoming Call Types in Workflow Module")
	public void cannotDeletesIncomingCallTypesInWorkflowModule() {
		sleep(1000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to delete Incoming Call Types in Workflow Module")
	public void deleteIncomingCallTypesInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should not be able to delete Outgoing Call Types in Workflow Module")
	public void cannotDeleteOutgoingCallTypesInWorkflowModule() {
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to deletes Outgoing Call Types in Workflow Module")
	public void cannotDeletesOutgoingCallTypesInWorkflowModule() {
		sleep(1000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
	}

	@And("the user should not be able to add Outgoing Call Types in Workflow Module")
	public void cannotAddOutgoingCallTypesInWorkflowModule() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Outgoing Call Type']"));

	}

	@And("the user should not be able to delete Program 340B in Workflow Module")
	public void cannotDeleteProgram340BInWorkflowModule() {
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to deletes Program 340B in Workflow Module")
	public void cannotDeletesProgram340BInWorkflowModule() {
		sleep(1000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to delete Prescription Status in Workflow Module")
	public void deletePrescriptionStatusInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should not be able to add Prescription Status in Workflow Module")
	public void cannotAddPrescriptionStatusInWorkflowModule() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Prescription Status']"));

	}

	@And("the user should be able to edit Prescription Status in Workflow Module")
	public void editPrescriptionStatusInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("PrescriptionStatus_Title"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
	}

	@And("the user should not be able to delete Prescription Status in Workflow Module")
	public void cannotDeletePrescriptionStatusInWorkflowModule() {
		sleep(1000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit Prescription Status in Workflow Module")
	public void cannotEditPrescriptionStatusInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to add Prescription Status in Workflow Module")
	public void addPrescriptionStatusInWorkflowModule() {
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Prescription Status']"));
		sleep(2000);
		waitAndSendKeys(By.id("PrescriptionStatus_Title"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to view Prescription Status in Workflow Module")
	public void viewPrescriptionStatusInWorkflowModule() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/PrescriptionStatuses");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PrescriptionStatuses"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Title']"));

	}

	@And("the user should be able to export Sync Workflow data to Excel")
	public void userShouldBeAbleToExportSyncWorkflowDataToExcel() {
		sleep(3000);
		clickWhenClickable(By.xpath(
				"//div[@id='syncWorkflowFilterGrid']//div[@class='syncLegendTopSticky']//div[@class='row']//div[@class='col-12']//div[@class='buttonLegendTop']//div//button[@type='button']//*[name()='svg']//*[name()='path' and @id='Path_22']"));

	}

	@And("the user should not be able to comment in Sync Workflow")
	public void userShouldNotBeAbleToCommentInSyncWorkflow() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@id='syncWorkflowFilterGrid']//a[3]//img[1]"));

	}

	@And("I leave all required fields blank")
	public void leaveAllRequiredFieldsBlank() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("the Template should not be created")
	public void checkTemplateNotCreated() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I navigate to the Workflow Dashboard")
	public void navigateToWorkflowDashboard() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I click on Add Template")
	public void clickAddTemplateButton() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I click Submit")
	public void clickSubmitButton() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I create a profile with no permissions for Text Module")
	public void createProfileWithNoTextPermissions() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I clear all required fields")
	public void clearAllRequiredFields() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("the Communication should not be created")
	public void verifyCommunicationNotCreated() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I navigate to the Action Workflow page")
	public void navigateToActionWorkflowPage() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I should see validation messages for all required fields")
	public void ensureValidationMessagesDisplayedForRequiredFields() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I click on Add Communication")
	public void clickAddCommunication() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I click on Add Quick")
	public void clickAddQuick() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I click Save")
	public void iClickSave() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("the action should not be updated")
	public void verifyActionNotUpdated() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I click on Mail to Selected")
	public void clickMailToSelected() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I should see a validation message indicating no record selected please selecct one")
	public void verifyNoRecordSelectedMessage() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("the Mail action should not be performed")
	public void verifyMailActionNotPerformed() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I create a profile with no permissions for Fax Module")
	public void createProfileWithNoFaxPermissions() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I click on Fax to Selected")
	public void clickFaxToSelected() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("the Fax action should not be performed")
	public void verifyFaxActionNotPerformed() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I click on Text to Selected")
	public void clickTextToSelected() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("the Text action should not be performed")
	public void verifyTextActionNotPerformed() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I navigate to Workflow Dashboard")
	public void verifyTemplateIsNotCreated() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("the note should not be created")
	public void ensureNoteCreationDidNotHappen() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("the communication should not be created")
	public void assertCommunicationCreationDidNotOccur() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I should see a validation message indicating the required fields must be filled")
	public void verifyRequiredFieldsValidationMessage() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I go to Quick Text section")
	public void navigateToQuickTextSection() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I click on Send VCard")
	public void clickOnSendVCardButton() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I leave the message content field blank")
	public void clearMessageContentField() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("the template should not be created")
	public void verifyTemplateWasNotCreated() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I click on Send")
	public void clickOnSendButton() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I should see a validation message indicating the content is required")
	public void verifyContentRequiredValidationMessage() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("the message should not be sent")
	public void verifyMessageNotSent() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I click Send")
	public void clickSend() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("the VCard should not be sent")
	public void ensureVCardWasNotSent() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I go to Quick Notes section")
	public void navigateToQuickNotesSection() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I click on Add Note")
	public void clickOnAddNoteButton() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I create a profile with no permissions for Callout Module")
	public void createProfileWithNoCalloutPermissions() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I select one or more records using the check box")
	public void selectRecordsUsingCheckbox() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I click on Callout to Selected")
	public void clickCalloutToSelected() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("I should see a validation message indicating no record selected please select one")
	public void verifyNoRecordSelectedValidationMessage() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("the Callout action should not be performed")
	public void verifyCalloutActionNotPerformed() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='row']//div[2]//div[6]//div[1]//div[8]//div[1]//a[2]//img[1]"));

	}

	@And("the user should be able to view Display Workflow data")
	public void verifyUserCanViewDisplayWorkflowData() {
		sleep(3000);
		driver.get(baseUrl + "/Workflow/Home/Dashboard");
		assertElementPresent(By.xpath("//label[@class='Starq1Label']"));

	}

	@And("the user should be able to perform advanced searches in Display Workflow")
	public void verifyUserCanPerformAdvancedSearchesInDisplayWorkflow() {
		sleep(3000);
		assertElementPresent(By.xpath("//span[normalize-space()='Filter']"));
		clickWhenClickable(By.xpath("//span[normalize-space()='Filter']"));
		waitAndSendKeys(By.id("Filter_RxNumber"), "149672-02");
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));

	}

	@And("the user should be able to delete Grid Templates in Display Workflow")
	public void verifyUserCanDeleteGridTemplatesInDisplayWorkflow() {
		sleep(3000);
		driver.get(baseUrl + "/Workflow/Home/Dashboard");
		sleep(3000);
		clickWhenClickable(By.xpath("//*[name()='path' and @id='Union_3']"));
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to toggle Show All Runninglines checkbox")
	public void verifyUserCanToggleShowAllRunninglinesCheckbox() {
		sleep(3000);
		clickWhenClickable(
				By.xpath("//div[@class='runningLineCheckboxinner']//label[@for='Filter_IsShowAllRunningline']"));

	}

	@And("the user should be able to export Display Workflow data to Excel")
	public void verifyUserCanExportDisplayWorkflowDataToExcel() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Export Excel']"));

	}

	@And("the user should not be able to export Display Workflow data to Excel")
	public void verifyUserCannotExportDisplayWorkflowDataToExcel() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export Excel']"));

	}

	@And("the user should not have full program access in Display Workflow")
	public void verifyUserDoesNotHaveFullProgramAccessInDisplayWorkflow() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//tbody/tr[1]/td[17]/div[1]/a[1]//*[name()='svg']"));

	}

	@And("the user should not be able to see details in Display Workflow")
	public void verifyUserCannotSeeDetailsInDisplayWorkflow() {
		sleep(3000);
		assertElementNotPresent(
				By.xpath("//div[@class='runningLineCheckboxinner']//label[@for='Filter_IsShowAllRunningline']"));
	}

	@And("the user should not be able to toggle Show Past Runninglines checkbox")
	public void verifyUserCannotToggleShowPastRunninglinesCheckbox() {
		sleep(3000);
		assertElementNotPresent(
				By.xpath("//div[@class='runningLineCheckboxinner']//label[@for='Filter_IsShowPastRunningline']"));

	}

	@And("the user should not be able to set Grid Template - Company Default checkbox")
	public void verifyUserCannotSetGridTemplateCompanyDefaultCheckbox() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//*[name()='path' and contains(@d,'M256 80c0-')]"));

	}

	@And("the user should not be able to perform Pharmacy NABP searches")
	public void verifyUserCannotPerformPharmacyNabpSearches() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@id='searchcollapse']//*[name()='svg']"));
		assertElementNotPresent(
				By.xpath("//a[@id='advancecollapse']//*[name()='svg']//*[name()='path' and @id='Union_73']"));

	}

	@And("the user should be able to delete Grid Templates in Action Workflow")
	public void assertUserCanDeleteGridTemplatesInActionWorkflow() {
		sleep(3000);
		driver.get(baseUrl + "/Workflow/Home/Dashboard");
		sleep(3000);
		clickWhenClickable(By.xpath("//*[name()='path' and @id='Union_3']"));
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should have full program access in Action Workflow")
	public void assertUserCanAccessAllFeaturesInActionWorkflow() {
		sleep(3000);
		assertElementPresent(By.xpath("//th[@id='Code']"));

	}

	@And("the user should be able to send VCards in Action Workflow")
	public void assertUserCanSendVCardsInActionWorkflow() {
		sleep(3000);
		clickWhenClickable(By.xpath("//*[name()='path' and @id='Union_48']"));
		waitAndSendKeys(By.id("vCardPhoneNumber"), "1234567890");
		clickWhenClickable(By.xpath("//button[@id='btnSendVCard']"));

	}

	@And("the user should be able to export Action Workflow data to Excel")
	public void checkUserCanExportActionWorkflowToExcel() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Export Excel']"));

	}

	@And("the user should not be able to perform advanced searches in Action Workflow")
	public void assertUserCannotPerformAdvancedSearchActionWorkflow() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@id='searchcollapse']//*[name()='svg']"));
		assertElementNotPresent(
				By.xpath("//a[@id='advancecollapse']//*[name()='svg']//*[name()='path' and @id='Union_73']"));

	}

	@And("the user should not be able to add Grid Templates in Action Workflow")
	public void assertUserCannotAddGridTemplatesInActionWorkflow() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//*[name()='path' and contains(@d,'M256 80c0-')]"));

	}

	@And("the user should be able to edit Grid Templates in Followup Workflow")
	public void verifyUserCanEditGridTemplatesInFollowupWorkflow() {
		sleep(3000);
		clickWhenClickable(By.xpath("//*[name()='path' and @id='Union_2']"));
		sleep(3000);
		WebElement field = driver.findElement(By.xpath("//li[@id='boxItem_Alert']"));
		WebElement dropArea = driver.findElement(By.xpath("//nav[@id='fieldsidebar1']"));
		Actions act = new Actions(driver);
		act.clickAndHold(field).moveToElement(dropArea).release().build().perform();

	}

	@And("the user should not be able to edit Grid Templates in Followup Workflow")
	public void verifyUserCannotEditGridTemplatesInFollowupWorkflow() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[@id='editTemplate']//button[@type='button']//*[name()='svg']"));

	}

	@And("the user should not be able to export Followup Workflow data to Excel")
	public void verifyUserCannotExportFollowupWorkflowDataToExcel() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export Excel']"));

	}

	@And("the user should not be able to add or edit HardCopy in Audit Workflow")
	public void verifyUserCannotAddOrEditHardCopyInAuditWorkflow() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//*[contains(@class,'fa-ellipsis-vertical')])[1]"));
		assertElementNotPresent(By.xpath("//div[@class='gridRecordContextMain show']//li[1]//a[1]//div[1]//img[1]"));

	}

	@And("the user should not be able to export Audit Workflow data")
	public void verifyUserCannotExportAuditWorkflowData() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export Excel']"));

	}

	@And("the user should not be able to delete HardCopy in Audit Workflow")
	public void verifyUserCannotDeleteHardCopyInAuditWorkflow() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//*[contains(@class,'fa-ellipsis-vertical')])[1]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//a[@id='btnDeleteAuditData']//img"));

	}

	@And("the user should be able to export Audit Workflow data")
	public void verifyUserCanExportAuditWorkflowData() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Export Excel']"));

	}

	@And("the user should be able to delete HardCopy in Audit Workflow")
	public void verifyUserCanDeleteHardCopyInAuditWorkflow() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//*[contains(@class,'fa-ellipsis-vertical')])[1]"));
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//a[@id='btnDeleteAuditData']//img"));
		clickWhenClickable(By.xpath("//div[@id='deleteAuditModel']//button[@id='btnDeleteConfirm']"));
	}

	@And("the user should be able to add and edit HardCopy in Audit Workflow")
	public void verifyUserCanAddAndEditHardCopyInAuditWorkflow() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//*[contains(@class,'fa-ellipsis-vertical')])[1]"));
		clickWhenClickable(By.xpath("//div[@class='gridRecordContextMain show']//li[1]//a[1]//div[1]//img[1]"));
		clickWhenClickable(By.xpath("//label[normalize-space()='Is Verified?']"));
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to view Audit Workflow data")
	public void checkUserCanAccessAuditWorkflowData() {
		sleep(3000);
		driver.get(baseUrl + "/Workflow/Home/AuditWorkflow");

	}

	@And("the user should not have full program access in Followup Workflow")
	public void verifyUserDoesNotHaveFullProgramAccessInFollowupWorkflow() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//*[name()='path' and contains(@d,'M256 80c0-')]"));

	}

	@And("the user should not be able to delete Grid Templates in Followup Workflow")
	public void checkUserCannotDeleteGridTemplatesFollowupWorkflow() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[@id='deleteTemplate']//button[@type='button']//*[name()='svg']"));

	}

	@And("the user should not be able to add Grid Templates in Followup Workflow")
	public void verifyUserCannotAddGridTemplatesInFollowupWorkflow() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//*[name()='path' and contains(@d,'M256 80c0-')]"));

	}

	@And("the user should not be able to perform advanced searches in Followup Workflow")
	public void verifyUserCannotPerformAdvancedSearchesInFollowupWorkflow() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@id='searchcollapse']//*[name()='svg']//*[name()='path' and @id='Union_73']"));
		assertElementNotPresent(By.xpath("//a[@id='advancecollapse']//*[name()='svg']"));

	}

	@And("the user should not be able to perform Team Actions in Followup Workflow")
	public void verifyUserCannotPerformTeamActionsInFollowupWorkflow() {
		sleep(3000);
		assertElementNotPresent(
				By.xpath("//tbody/tr[1]/td[16]/a[1]/button[1]//*[name()='svg']//*[name()='path' and @id='Union_50']"));

	}

	@And("the user should not be able to see details in Followup Workflow")
	public void verifyUserCannotSeeDetailsInFollowupWorkflow() {
		sleep(3000);
		assertElementNotPresent(
				By.xpath("//div[@class='runningLineCheckboxinner']//label[@for='Filter_IsShowAllRunningline']"));

	}

	@And("the user should be able to export Followup Workflow data to Excel")
	public void checkUserCanExportFollowupWorkflowToExcel() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Export Excel']"));

	}

	@And("the user should have full program access in Followup Workflow")
	public void verifyUserHasFullProgramAccessInFollowupWorkflow() {
		sleep(3000);
		clickWhenClickable(
				By.xpath("//div[@class='runningLineCheckboxinner']//label[@for='Filter_IsShowAllRunningline']"));

	}

	@And("the user should be able to delete Grid Templates in Followup Workflow")
	public void assertUserCanDeleteGridTemplatesInFollowupWorkflow() {
		sleep(3000);
		driver.get(baseUrl + "/Workflow/Home/FollowUpWorkflow#");
		sleep(3000);
		clickWhenClickable(By.xpath("//*[name()='path' and @id='Union_3']"));
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to add Grid Templates in Followup Workflow")
	public void assertUserCanAddGridTemplatesInFollowupWorkflow() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@class='md-trigger']//button[@type='button']//*[name()='svg']"));
		waitAndSendKeys(By.id("GridTemplate_Name"), "Template");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
	}

	@And("the user should be able to perform advanced searches in Followup Workflow")
	public void checkUserCanUseAdvancedSearchFollowupWorkflow() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@id='searchcollapse']//*[name()='svg']//*[name()='path' and @id='Union_73']"));
		clickWhenClickable(By.xpath("//a[@id='advancecollapse']//*[name()='svg']"));
		waitAndSendKeys(By.id("Filter_RxNumber"), "149672-02");
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
	}

	@And("the user should be able to perform Team Actions in Followup Workflow")
	public void checkUserCanExecuteTeamActionsFollowupWorkflow() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[16]/a[1]/button[1]//*[name()='svg']"));
	}

	@And("the user should be able to see details in Followup Workflow")
	public void checkUserCanViewFollowupWorkflowDetails() {
		sleep(3000);
		clickWhenClickable(
				By.xpath("//div[@class='runningLineCheckboxinner']//label[@for='Filter_IsShowAllRunningline']"));

	}

	@And("the user should be able to view Followup Workflow data")
	public void checkUserCanAccessFollowupWorkflowData() {
		sleep(3000);
		driver.get(baseUrl + "/Workflow/Home/FollowUpWorkflow");

	}

	@And("the user should not be able to export Action Workflow data to Excel")
	public void checkUserCannotExportActionWorkflowToExcel() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export Excel']"));

	}

	@And("the user should not be able to send VCards in Action Workflow")
	public void checkUserCannotSendVCardsActionWorkflow() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//button[@id='send-vcard']//*[name()='svg']"));

	}

	@And("the user should not have full program access in Action Workflow")
	public void assertUserCannotAccessAllFeaturesInActionWorkflow() {
		sleep(3000);
		assertElementNotPresent(
				By.xpath("//div[@class='runningLineCheckboxinner']//label[@for='Filter_IsShowAllRunningline']"));

	}

	@And("the user should not be able to delete Grid Templates in Action Workflow")
	public void assertUserCannotDeleteGridTemplatesInActionWorkflow() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[@id='deleteTemplate']//button[@type='button']//*[name()='svg']"));

	}

	@And("the user should not be able to edit Grid Templates in Action Workflow")
	public void assertUserCannotEditGridTemplatesInActionWorkflow() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[@id='editTemplate']//button[@type='button']//*[name()='svg']"));

	}

	@And("the user should not be able to send Quick Text in Action Workflow")
	public void assertUserCannotSendQuickTextInActionWorkflow() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//*[name()='path' and @id='Path_284']"));

	}

	@And("the user should not be able to perform BOT Calls in Action Workflow")
	public void assertUserCannotMakeBOTCallsInActionWorkflow() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//button[@id='btnCalloutToAll']//*[name()='svg']"));

	}

	@And("the user should not be able to send Text messages in Action Workflow")
	public void checkUserCannotSendTextMessagesActionWorkflow() {
		sleep(3000);
		assertElementNotPresent(
				By.xpath("//button[@id='btnSMSToAll']//*[name()='svg']//*[name()='path' and @id='Union_47']"));

	}

	@And("the user should not be able to see details in Action Workflow")
	public void assertUserNoAccessToActionWorkflowDetails() {
		sleep(3000);
		assertElementNotPresent(
				By.xpath("//div[@class='runningLineCheckboxinner']//label[@for='Filter_IsShowAllRunningline']"));

	}

	@And("the user should be able to perform advanced searches in Action Workflow")
	public void verifyUserCanPerformAdvancedSearchesInActionWorkflow() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@id='searchcollapse']//*[name()='svg']//*[name()='path' and @id='Union_73']"));
		clickWhenClickable(By.xpath("//a[@id='advancecollapse']//*[name()='svg']"));
		waitAndSendKeys(By.id("Filter_RxNumber"), "149672-02");
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));

	}

	@And("the user should be able to edit Grid Templates in Action Workflow")
	public void assertUserCanEditGridTemplatesInActionWorkflow() {
		sleep(3000);
		clickWhenClickable(By.xpath("//*[name()='path' and @id='Union_2']"));
		sleep(3000);
		WebElement field = driver.findElement(By.xpath("//li[@id='boxItem_ActionSelectCheckbox']"));
		WebElement dropArea = driver.findElement(By.xpath("//nav[@id='fieldsidebar1']"));
		Actions act = new Actions(driver);
		act.clickAndHold(field).moveToElement(dropArea).release().build().perform();
	}

	@And("the user should be able to add Grid Templates in Action Workflow")
	public void assertUserCanAddGridTemplatesInActionWorkflow() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@class='md-trigger']//button[@type='button']//*[name()='svg']"));
		waitAndSendKeys(By.id("GridTemplate_Name"), "Template");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to send Quick Text in Action Workflow")
	public void assertUserCanSendQuickTextInActionWorkflow() {
		sleep(3000);
		clickWhenClickable(By.xpath("//*[name()='path' and @id='Path_284']"));
		waitAndSendKeys(By.id("quickTextPhoneNumber"), "1234567890");
		waitAndSendKeys(By.id("quickTextBody"), "Quick Text");
		clickWhenClickable(By.xpath("//button[@id='btnQuickSMSSend']"));

	}

	@And("the user should be able to perform BOT Calls in Action Workflow")
	public void assertUserCanMakeBOTCallsInActionWorkflow() {
		sleep(3000);
		clickWhenClickable(
				By.xpath("//button[@id='btnCalloutToAll']//*[name()='svg']//*[name()='path' and @id='Union_46']"));
		clickWhenClickable(By.xpath("//div[@id='calloutToAllmodal']//button[@id='btnDeleteConfirm']"));
	}

	@And("the user should be able to send Text messages in Action Workflow")
	public void assertUserCanSendTextInActionWorkflow() {
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnSMSToAll']//*[name()='svg']"));
		clickWhenClickable(By.xpath("//div[@id='smsToAllmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to see details in Action Workflow")
	public void assertUserCanAccessActionWorkflowDetails() {
		sleep(3000);
		assertElementPresent(By.xpath("//label[normalize-space()='Total Count']"));

	}

	@And("the user should be able to view Action Workflow data")
	public void assertUserCanSeeActionWorkflowData() {
		sleep(3000);
		driver.get(baseUrl + "/Workflow/Home/ActionWorkflow");
	}

	@And("the user should not be able to toggle Show All Runninglines checkbox")
	public void ensureUserCannotChangeShowAllRunninglinesCheckbox() {
		sleep(3000);
		assertElementNotPresent(
				By.xpath("//div[@class='runningLineCheckboxinner']//label[@for='Filter_IsShowAllRunningline']"));

	}

	@And("the user should not be able to delete Grid Templates in Display Workflow")
	public void verifyUserCannotDeleteGridTemplatesInDisplayWorkflow() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[@id='deleteTemplate']//button[@type='button']//*[name()='svg']"));

	}

	@And("the user should not be able to edit Grid Templates in Display Workflow")
	public void verifyUserCannotEditGridTemplatesInDisplayWorkflow() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//*[name()='path' and @id='Union_2']"));

	}

	@And("the user should not be able to add Grid Templates in Display Workflow")
	public void verifyUserCannotAddGridTemplatesInDisplayWorkflow() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[@class='md-trigger']//button[@type='button']//*[name()='svg']"));

	}

	@And("the user should not be able to perform advanced searches in Display Workflow")
	public void verifyUserCannotPerformAdvancedSearchesInDisplayWorkflow() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Filter']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Advance Search']"));

	}

	@And("the user should be able to perform Pharmacy NABP searches")
	public void verifyUserCanPerformPharmacyNabpSearches() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@id='searchcollapse']"));
		clickWhenClickable(By.xpath("//span[normalize-space()='Advance Search']"));
		waitAndSendKeys(By.id("Filter_PharmacyNABP"), "7654321");
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));

	}

	@And("the user should have full program access in Display Workflow")
	public void verifyUserHasFullProgramAccessInDisplayWorkflow() {
		sleep(3000);
		assertElementPresent(By.xpath("//span[normalize-space()='PA Queue']"));

	}

	@And("the user should be able to set Grid Template - Company Default checkbox")
	public void verifyUserCanSetGridTemplateCompanyDefaultCheckbox() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@class='md-trigger']//button[@type='button']//*[name()='svg']"));
		waitAndSendKeys(By.id("GridTemplate_Name"), "Template");
		clickWhenClickable(By.xpath("//label[normalize-space()='Company Default']"));
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
	}

	@And("the user should be able to toggle Show Past Runninglines checkbox")
	public void verifyUserCanToggleShowPastRunninglinesCheckbox() {
		sleep(3000);
		clickWhenClickable(
				By.xpath("//div[@class='runningLineCheckboxinner']//label[@for='Filter_IsShowPastRunningline']"));

	}

	@And("the user should be able to edit Grid Templates in Display Workflow")
	public void verifyUserCanEditGridTemplatesInDisplayWorkflow() {
		sleep(3000);
		clickWhenClickable(By.xpath("//*[name()='path' and @id='Union_2']"));
		sleep(3000);
		WebElement field = driver.findElement(By.xpath("//span[normalize-space()='# of Callout']"));
		WebElement dropArea = driver.findElement(By.xpath("//nav[@id='fieldsidebar1']"));
		Actions act = new Actions(driver);
		act.clickAndHold(field).moveToElement(dropArea).release().build().perform();

	}

	@And("the user should be able to add Grid Templates in Display Workflow")
	public void verifyUserCanAddGridTemplatesInDisplayWorkflow() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@class='md-trigger']//button[@type='button']//*[name()='svg']"));
		waitAndSendKeys(By.id("GridTemplate_Name"), "Template");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to see details in Display Workflow")
	public void verifyUserCanSeeDetailsInDisplayWorkflow() {
		sleep(3000);
		clickWhenClickable(
				By.xpath("//div[@class='runningLineCheckboxinner']//label[@for='Filter_IsShowAllRunningline']"));
		sleep(3000);
		assertElementPresent(By.xpath("//tbody/tr[1]/td[17]/div[1]/a[2]//*[name()='svg']"));

	}

	@And("the user should not be able to receive alerts in Sync Workflow")
	public void userShouldNotBeAbleToReceiveAlertsInSyncWorkflow() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@id='syncWorkflowFilterGrid']//a[3]//img[1]"));

	}

	@And("the user should not be able to export Sync Workflow data to Excel")
	public void userShouldNotBeAbleToExportSyncWorkflowDataToExcel() {
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//div[@id='syncWorkflowFilterGrid']//div[@class='syncLegendTopSticky']//div[@class='row']//div[@class='col-12']//div[@class='buttonLegendTop']//div//button[@type='button']//*[name()='svg']"));

	}

	@And("the user should be able to receive alerts in Sync Workflow")
	public void userShouldBeAbleToReceiveAlertsInSyncWorkflow() {
		sleep(3000);
		clickWhenClickable(By.xpath("//div[@id='syncWorkflowFilterGrid']//a[3]//img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Alert?']"));
		clickWhenClickable(By.xpath("//button[@id='btnSaveMedicationSyncDetails']"));

	}

	@And("the user should be able to comment in Sync Workflow")
	public void userShouldBeAbleToCommentInSyncWorkflow() {
		sleep(3000);
		clickWhenClickable(By.xpath("//div[@id='syncWorkflowFilterGrid']//a[3]//img[1]"));
		sleep(3000);
		waitAndSendKeys(By.id("txt_Comment"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSaveMedicationSyncDetails']"));

	}

	@And("the user should be able to view Sync Workflow data")
	public void userShouldBeAbleToViewSyncWorkflowData() {
		sleep(3000);
		driver.get(baseUrl + "/Workflow/Home/MedicationSyncReminder");
		wait.until(ExpectedConditions.urlContains("/Workflow/Home/MedicationSyncReminder"));

	}

	@And("the user should be able to delete Program 340B in Workflow Module")
	public void deleteProgram340BInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should not be able to add Program 340B in Workflow Module")
	public void cannotAddProgram340BInWorkflowModule() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New 340B']"));

	}

	@And("the user should be able to edit Program 340B in Workflow Module")
	public void editProgram340BInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("Program340B_Name"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
	}

	@And("the user should not be able to edit Program 340B in Workflow Module")
	public void cannotEditProgram340BInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to add Program 340B in Workflow Module")
	public void addProgram340BInWorkflowModule() {
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New 340B']"));
		sleep(2000);
		waitAndSendKeys(By.id("Program340B_Name"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to view Program 340B in Workflow Module")
	public void viewProgram340BInWorkflowModule() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/Program340Bs");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Program340Bs"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Name']"));

	}

	@And("the user should be able to delete Outgoing Call Types in Workflow Module")
	public void deleteOutgoingCallTypesInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to edit Outgoing Call Types in Workflow Module")
	public void editOutgoingCallTypesInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("OutgoingCall_CallTypeText"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
	}

	@And("the user should not be able to edit Outgoing Call Types in Workflow Module")
	public void cannotEditOutgoingCallTypesInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to add Outgoing Call Types in Workflow Module")
	public void addOutgoingCallTypesInWorkflowModule() {
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Outgoing Call Type']"));
		sleep(2000);
		waitAndSendKeys(By.id("OutgoingCall_CallTypeText"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to view Outgoing Call Types in Workflow Module")
	public void viewOutgoingCallTypesInWorkflowModule() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/OutgoingCalls");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/OutgoingCalls"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Outgoing Call Type']"));

	}

	@And("the user should not be able to add Incoming Call Types in Workflow Module")
	public void cannotAddIncomingCallTypesInWorkflowModule() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New InComing Call Types']"));

	}

	@And("the user should be able to edit Incoming Call Types in Workflow Module")
	public void editIncomingCallTypesInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("IncomingCall_CallTypeText"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to edit Incoming Call Types in Workflow Module")
	public void cannotEditIncomingCallTypesInWorkflowModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to delete Followup Trail Script in Workflow Module")
	public void userShouldBeAbleToDeleteFollowupTrailScript() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to edit Followup Trail Script in Workflow Module")
	public void userShouldBeAbleToEditFollowupTrailScript() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("CallScript_Title"), "Call Patient");
		waitAndSendKeys(By.id("CallScript_Description"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to delete Followup Trail Script in Workflow Module")
	public void userShouldNotBeAbleToDeleteFollowupTrailScript() {
		sleep(1000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit Followup Trail Script in Workflow Module")
	public void userShouldNotBeAbleToEditFollowupTrailScript() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to add Followup Trail Script in Workflow Module")
	public void userShouldBeAbleToAddFollowupTrailScript() {
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Call Script']"));
		sleep(2000);
		waitAndSendKeys(By.id("CallScript_Title"), "Call Patient");
		waitAndSendKeys(By.id("CallScript_Description"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to view Followup Trail Script in Workflow Module")
	public void userShouldBeAbleToViewFollowupTrailScript() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/CallScripts");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/CallScripts"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Title']"));

	}

	@And("the user should be able to delete Transfer Result Action in Workflow Module")
	public void userShouldBeAbleToDeleteTransferResultAction() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to edit Transfer Result Action in Workflow Module")
	public void userShouldBeAbleToEditTransferResultAction() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("TransferResultAction_Name"), "Call Patient");
		waitAndSendKeys(By.id("TransferResultAction_Notes"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
	}

	@And("the user should not be able to delete Transfer Result Action in Workflow Module")
	public void userShouldNotBeAbleToDeleteTransferResultAction() {
		sleep(1000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit Transfer Result Action in Workflow Module")
	public void userShouldNotBeAbleToEditTransferResultAction() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to add Transfer Result Action in Workflow Module")
	public void userShouldBeAbleToAddTransferResultAction() {
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Transfer Result Action']"));
		sleep(2000);
		waitAndSendKeys(By.id("TransferResultAction_Name"), "Call Patient");
		waitAndSendKeys(By.id("TransferResultAction_Notes"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to view Transfer Result Action in Workflow Module")
	public void userShouldBeAbleToViewTransferResultAction() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/TransferResultActions");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/TransferResultActions"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Name']"));

	}

	@And("the user should be able to delete Failure Result Action in Workflow Module")
	public void userShouldBeAbleToDeleteFailureResultAction() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should not be able to add Failure Result Action in Workflow Module")
	public void userShouldNotBeAbleToAddFailureResultAction() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Failure Result Action']"));

	}

	@And("the user should be able to edit Failure Result Action in Workflow Module")
	public void userShouldBeAbleToEditFailureResultAction() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("FailureResultAction_Notes"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to delete Failure Result Action in Workflow Module")
	public void userShouldNotBeAbleToDeleteFailureResultAction() {
		sleep(1000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit Failure Result Action in Workflow Module")
	public void userShouldNotBeAbleToEditFailureResultAction() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to add Failure Result Action in Workflow Module")
	public void userShouldBeAbleToAddFailureResultAction() {
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Failure Result Action']"));
		sleep(2000);
		waitAndSendKeys(By.id("FailureResultAction_Name"), "Call Patient");
		waitAndSendKeys(By.id("FailureResultAction_Notes"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to view Failure Result Action in Workflow Module")
	public void userShouldBeAbleToViewFailureResultAction() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/FailureResultActions");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/FailureResultActions"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Name']"));

	}

	@And("the user should be able to delete Success Result Action in Workflow Module")
	public void userShouldBeAbleToDeleteSuccessResultAction() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to edit Success Result Action in Workflow Module")
	public void userShouldBeAbleToEditSuccessResultAction() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("SuccessResultAction_Notes"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to delete Success Result Action in Workflow Module")
	public void userShouldNotBeAbleToDeleteSuccessResultAction() {
		sleep(1000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit Success Result Action in Workflow Module")
	public void userShouldNotBeAbleToEditSuccessResultAction() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to add Success Result Action in Workflow Module")
	public void userShouldBeAbleToAddSuccessResultAction() {
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Success Result Action']"));
		sleep(2000);
		waitAndSendKeys(By.id("SuccessResultAction_Name"), "Call Patient");
		waitAndSendKeys(By.id("SuccessResultAction_Notes"), "Call Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
	}

	@And("the user should be able to view Success Result Action in Workflow Module")
	public void userShouldBeAbleToViewSuccessResultAction() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/SuccessResultActions");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/SuccessResultActions"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Name']"));

	}

	@And("the user should not be able to view General Audit View settings in Workflow Module")
	public void userShouldNotBeAbleToViewGeneralAuditSettingsInWorkflowModule() {
		sleep(3000);
		driver.get(baseUrl + "/Workflow/Home/Dashboard");
		wait.until(ExpectedConditions.urlContains("/Workflow/Home/Dashboard"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//th[@id='UpdatedDate']"));

	}

	// ==== Utility Methods ====
	private void waitAndSendKeys(By locator, String value) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		element.clear();
		element.sendKeys(value);
	}

	private void selectDropdownByVisibleTextWhenReady(By locator, String visibleText) {
		WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(locator));
		Select select = new Select(dropdown);
		select.selectByVisibleText(visibleText);
	}

	public void clickWhenClickable(By locator) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
		} catch (ElementClickInterceptedException e) {
			System.out.println("Click intercepted for element: " + locator.toString() + ". Retrying with JS click.");
			try {
				WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				((JavascriptExecutor) driver).executeScript(
						"var evt = new MouseEvent('click', {bubbles: true, cancelable: true, view: window}); arguments[0].dispatchEvent(evt);",
						element);
			} catch (Exception ex) {
				System.out.println("JS click also failed for element: " + locator.toString());
				throw ex;
			}
		}
	}

	private void selectDropdownByIndexWhenReady(By locator, int index) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		Select dropdown = new Select(dropdownElement);
		waitUntilDropdownHasOptions(dropdown);
		dropdown.selectByIndex(index);
	}

	private void waitUntilDropdownHasOptions(Select dropdown) {
		for (int i = 0; i < 10; i++) {
			List<WebElement> options = dropdown.getOptions();
			if (options.size() > 1)
				return;
			sleep(1000);
		}
		throw new TimeoutException("Dropdown options not loaded in time.");
	}

	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	public void clickWhenReadyAndVisible(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(locator));

		try {
			WebElement element = driver.findElement(locator);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			element.click();
		} catch (StaleElementReferenceException e) {
			WebElement element = driver.findElement(locator);
			element.click();
		} catch (ElementClickInterceptedException e) {
			System.out.println("Click intercepted, trying JS click as fallback...");
			WebElement element = driver.findElement(locator);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		}
	}

	public void uncheckIfSelected(By checkboxLocator) {
		WebElement checkbox = driver.findElement(checkboxLocator);
		if (checkbox.isSelected()) {
			checkbox.click();
		}
	}

	public void assertElementNotPresent(By locator) {
		List<WebElement> elements = driver.findElements(locator);
		Assert.assertTrue("Element should not be present: " + locator.toString(), elements.isEmpty());
	}

	public void scrollIntoViewAndClick(By locator) {
		WebElement element = driver.findElement(locator);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}

	public boolean isInternetAvailable() {
		try {
			return InetAddress.getByName("8.8.8.8").isReachable(2000);
		} catch (Exception e) {
			return false;
		}
	}

	public void measurePageLoadTime(String url, long maxExpectedMillis) {
		long start = System.currentTimeMillis();
		driver.get(url);
		long end = System.currentTimeMillis();
		long duration = end - start;

		System.out.println("Page Load Time: " + duration + " ms for " + url);
		if (duration > maxExpectedMillis) {
			System.out.println("Warning: Page load is slower than expected.");
		}
	}

	public void logInternetSpeed() {
		try {
			Process process = new ProcessBuilder("speedtest", "--simple").start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
			System.out.println("Internet Speed:");
			while ((line = reader.readLine()) != null) {
				System.out.println("   " + line);
			}
		} catch (IOException e) {
			System.out.println("Unable to measure internet speed: " + e.getMessage());
		}
	}

	public void uncheckPermissionIfChecked(String checkboxId) {
		By checkboxBy = By.id(checkboxId);
		By labelBy = By.cssSelector("label[for='" + checkboxId + "']");

		if (driver.findElement(checkboxBy).isSelected()) {
			scrollIntoViewAndClick(labelBy);
			sleep(500);
		}

	}

	public void assertElementPresent(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (TimeoutException e) {
			Assert.fail("Element not present after wait: " + locator.toString());
		}
	}

	public boolean isElementPresent(By locator) {
		try {
			return !driver.findElements(locator).isEmpty();
		} catch (Exception e) {
			return false;
		}
	}
}
