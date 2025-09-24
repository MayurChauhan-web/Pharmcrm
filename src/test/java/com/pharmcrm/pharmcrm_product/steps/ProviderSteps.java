package com.pharmcrm.pharmcrm_product.steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.time.Duration;
import java.util.List;
import org.junit.Assert;
import driver.DriverFactory;

public class ProviderSteps {

	String createdEmail;
	String baseUrl = "http://qa01.pharmcrm.com";
	String profileName;

	private WebDriver driver = DrugSteps.driver;
	private WebDriverWait wait = DrugSteps.wait;

	public ProviderSteps() {
		this.driver = DriverFactory.getDriver();
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	@Given("I log in as admin for Provider Module")
	public void loginAsAdminForProviderModule() {
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

	@When("I create a new user with email for Provider Module {string}")
	public void createNewUserWithEmailForProviderModule(String email) {
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

	@And("I create a profile with View access only to Provider Module General Audit View")
	public void createProfileWithViewAccessOnlyToProviderModuleGeneralAuditView() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with No access to Provider Module General Audit View")
	public void createProfileWithNoAccessToProviderModuleGeneralAuditView() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg37ProviderAuditView']"));
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Provider Module Callback Request")
	public void createProfileWithViewAccessOnlyToProviderModuleCallbackRequest() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with No access to Provider Module Callback Request")
	public void createProfileWithNoAccessToProviderModuleCallbackRequest() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg5CallbackPharmacyView']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Provider Module Demand Request")
	public void createProfileWithViewAccessOnlyToProviderModuleDemandRequest() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with No access to Provider Module Demand Request")
	public void createProfileWithNoAccessToProviderModuleDemandRequest() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg5DemandRequestView']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Merge access but no Approve access to Provider Module NPI Request")
	public void createProfileWithViewAndMergeAccessButNoApproveForProviderModuleNPIRequest() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Approve access but no Merge access to Provider Module NPI Request")
	public void createProfileWithViewAndApproveAccessButNoMergeForProviderModuleNPIRequest() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Send access but no Reply or Send VCard access to Provider Module Text")
	public void createProfileWithViewAndSendAccessButNoReplyOrSendVCardForProviderModuleText() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg5SMSReply']"));
		clickWhenClickable(By.xpath("//label[@for='chkg34SMSSendVCard']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Reply access but no Send or Send VCard access to Provider Module Text")
	public void createProfileWithViewAndReplyAccessButNoSendOrSendVCardForProviderModuleText() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Send VCard access but no Send or Reply access to Provider Module Text")
	public void createProfileWithViewAndSendVCardAccessButNoSendOrReplyForProviderModuleText() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg5SMSSend']"));
		clickWhenClickable(By.xpath("//label[@for='chkg5SMSReply']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit, Delete or Detail access to Provider in Provider Module")
	public void createProfileWithViewAndAddAccessButNoEditDeleteDetailForProviderInProviderModule() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg8ProviderAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg8ProviderView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg8ProviderAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add, Delete or Detail access to Provider in Provider Module")
	public void createProfileWithViewAndEditAccessButNoAddDeleteDetailForProviderInProviderModule() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg8ProviderAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg8ProviderView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg8ProviderEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add, Edit or Detail access to Provider in Provider Module")
	public void createProfileWithViewAndDeleteAccessButNoAddEditDetailForProviderInProviderModule() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg8ProviderAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg8ProviderView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg8ProviderDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Detail access but no Add, Edit or Delete access to Provider in Provider Module")
	public void createProfileWithViewAndDetailAccessButNoAddEditDeleteForProviderInProviderModule() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg8ProviderAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg8ProviderView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg8ProviderDetail']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Provider Address in Provider Module")
	public void createProfileWithViewAndAddAccessButNoEditOrDeleteForProviderAddressInProviderModule() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg8ProviderAddressEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg8ProviderAddressDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Provider Address in Provider Module")
	public void createProfileWithViewAndEditAccessButNoAddOrDeleteForProviderAddressInProviderModule() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg8ProviderAddressAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg8ProviderAddressDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Provider Address in Provider Module")
	public void createProfileWithViewAndDeleteAccessButNoAddOrEditForProviderAddressInProviderModule() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg8ProviderAddressAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg8ProviderAddressEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Provider Communication in Provider Module")
	public void createProfileWithViewAndAddAccessButNoEditOrDeleteForProviderCommunicationInProviderModule() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg18ProviderCommunicationEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg18ProviderCommunicationDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Provider Communication in Provider Module")
	public void createProfileWithViewAndEditAccessButNoAddOrDeleteForProviderCommunicationInProviderModule() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg18ProviderCommunicationAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg18ProviderCommunicationDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Provider Communication in Provider Module")
	public void createProfileWithViewAndDeleteAccessButNoAddOrEditForProviderCommunicationInProviderModule() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg18ProviderCommunicationAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg18ProviderCommunicationEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access but no Export Excel access to Referrals Provider")
	public void createProfileWithViewNoExportExcelAccessToReferralsProvider() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg23ReferralsDownload']"));
		clickWhenClickable(By.xpath("//label[@for='chkg23ProviderReferralsFileDownload']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with both View and Export Excel access to Referrals Provider")
	public void createProfileWithViewAndExportExcelAccessToReferralsProvider() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Executives")
	public void createProfileWithViewAndAddAccessNoEditNoDeleteForExecutives() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg20ExecutiveEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg20ExecutiveDelete']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Executives")
	public void createProfileWithViewAndEditAccessNoAddNoDeleteForExecutives() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg20ExecutiveAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg20ExecutiveDelete']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Executives")
	public void createProfileWithViewAndDeleteAccessNoAddNoEditForExecutives() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg20ExecutiveEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg20ExecutiveAdd']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Referral Enrollment")
	public void createProfileWithViewAndAddAccessNoEditNoDeleteForReferralEnrollment() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg20ProviderReferralEnrollmentEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg20ProviderReferralEnrollmentDelete']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Referral Enrollment")
	public void createProfileWithViewAndEditAccessNoAddNoDeleteForReferralEnrollment() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg20ProviderReferralEnrollmentAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg20ProviderReferralEnrollmentDelete']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Referral Enrollment")
	public void createProfileWithViewAndDeleteAccessNoAddNoEditForReferralEnrollment() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg20ProviderReferralEnrollmentAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg20ProviderReferralEnrollmentEdit']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with full Folder permissions but no File permissions for Bucket")
	public void createProfileWithFullFolderPermissionsNoFilePermissionsForBucket() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg22ProviderBucketFileAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg22ProviderBucketFileEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg22ProviderBucketFileDelete']"));
		clickWhenClickable(By.xpath("//label[@for='chkg23ProviderBucketFileFavourite']"));
		clickWhenClickable(By.xpath("//label[@for='chkg23ProviderBucketFileDownload']"));
		clickWhenClickable(By.xpath("//label[@for='chkg23ProviderBucketFileViwer']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with full File permissions but no Folder permissions for Bucket")
	public void createProfileWithFullFilePermissionsNoFolderPermissionsForBucket() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg22ProviderBucketFolderAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg22ProviderBucketFolderEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg22ProviderBucketFolderDelete']"));
		clickWhenClickable(By.xpath("//label[@for='chkg22ProviderBucketFolderFavourite']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without Download File permission for Referral Patient History")
	public void createProfileWithoutDownloadFilePermissionForReferralPatientHistory() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Referral Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg23ReferralPatientHistoryFileDownload']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Update access to Provider Module DeDupe")
	public void createProfileWithUpdateAccessToProviderModuleDeDupe() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access but without Reset Password access to Provider Executive")
	public void createProviderExecutiveProfileWithViewOnly() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg45ProviderExecutiveResetPassword']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with both View and Reset Password access to Provider Executive")
	public void createProviderExecutiveProfileWithViewAndResetPassword() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit, Delete to Provider Service in Provider Module")
	public void createProviderServiceProfileWithViewAndAddOnly() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg39ProviderServiceEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg37ProviderServiceDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add, Delete to Provider Service in Provider Module")
	public void createProviderServiceProfileWithViewAndEditOnly() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg36ProviderServiceAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg37ProviderServiceDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add, Edit to Provider Service in Provider Module")
	public void createProviderServiceProfileWithViewAndDeleteOnly() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg36ProviderServiceAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg39ProviderServiceEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access but no Edit or Delete access to Provider EHR in Provider Module")
	public void createProviderEHRProfileWithAddOnly() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg39ProviderEHREdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg39ProviderEHRDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access but no Add or Delete access to Provider EHR in Provider Module")
	public void createProviderEHRProfileWithEditOnly() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg39ProviderEHRAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg39ProviderEHRDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access but no Add or Edit access to Provider EHR in Provider Module")
	public void createProviderEHRProfileWithDeleteOnly() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg39ProviderEHRAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg39ProviderEHREdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit, Delete or Make Partner access to Business Group in Provider Module")
	public void createBusinessGroupProfileWithViewAndAddOnly() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg42BusinessGroupEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg42BusinessGroupDelete']"));
		clickWhenClickable(By.xpath("//label[normalize-space()='Make Partner']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add, Delete or Make Partner access to Business Group in Provider Module")
	public void createBusinessGroupProfileWithViewAndEditOnly() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg42BusinessGroupAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg42BusinessGroupDelete']"));
		clickWhenClickable(By.xpath("//label[normalize-space()='Make Partner']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add, Edit or Make Partner access to Business Group in Provider Module")
	public void createBusinessGroupProfileWithViewAndDeleteOnly() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg42BusinessGroupAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg42BusinessGroupEdit']"));
		clickWhenClickable(By.xpath("//label[normalize-space()='Make Partner']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Make Partner access but no Add, Edit or Delete access to Business Group in Provider Module")
	public void createBusinessGroupProfileWithViewAndMakePartnerOnly() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg42BusinessGroupAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg42BusinessGroupEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg42BusinessGroupDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Business Group Address in Provider Module")
	public void createBusinessGroupAddressProfileWithViewAndAddOnly() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg42BusinessGroupAddressEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg42BusinessGroupAddressDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Business Group Address in Provider Module")
	public void createBusinessGroupAddressProfileWithViewAndEditOnly() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg42BusinessGroupAddressAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg42BusinessGroupAddressDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Business Group Address in Provider Module")
	public void createBusinessGroupAddressProfileWithViewAndDeleteOnly() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg42BusinessGroupAddressAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg42BusinessGroupAddressEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without Export Excel permission for Provider PA Details")
	public void createProfileWithoutExportExcelPermissionForPADetails() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg24ProviderPADetailsExportExcel']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Provider Type in Provider Module")
	public void createProfileWithViewAndAddAccessForProviderType() {
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
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg20ProviderTypeView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg20ProviderTypeAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Service in Provider Module")
	public void createProfileWithViewAndAddAccessForService() {
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
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg36ServiceAdd']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Provider Template in Provider Module")
	public void createProfileWithViewAndDeleteAccessForProviderTemplate() {
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
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg39ProviderTemplateDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Provider Template in Provider Module")
	public void createProfileWithViewAndEditAccessForProviderTemplate() {
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
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg39ProviderTemplateEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Provider Template in Provider Module")
	public void createProfileWithViewAndAddAccessForProviderTemplate() {
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
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg39ProviderTemplateAdd']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Service in Provider Module")
	public void createProfileWithViewAndDeleteAccessForService() {
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
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg36ServiceDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Service in Provider Module")
	public void createProfileWithViewAndEditAccessForService() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg36ServiceEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Specialty in Provider Module")
	public void createProfileWithViewAndDeleteAccessForSpecialty() {
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
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg6SpecialtyDelete']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Specialty in Provider Module")
	public void createProfileWithViewAndEditAccessForSpecialty() {
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
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg6SpecialtyEdit']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Specialty in Provider Module")
	public void createProfileWithViewAndAddAccessForSpecialty() {
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
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg6SpecialtyAdd']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Category in Provider Module")
	public void createProfileWithViewAndDeleteAccessForCategory() {
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
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg01CategoryDelete']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Category in Provider Module")
	public void createProfileWithViewAndEditAccessForCategory() {
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
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg01CategoryEdit']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Category in Provider Module")
	public void createProfileWithViewAndAddAccessForCategory() {
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
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg01CategoryView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg01CategoryAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Provider Type in Provider Module")
	public void createProfileWithViewAndDeleteAccessForProviderType() {
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
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg20ProviderTypeView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg20ProviderTypeDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Provider Type in Provider Module")
	public void createProfileWithViewAndEditAccessForProviderType() {
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
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg20ProviderTypeView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg20ProviderTypeEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Download File permission for Provider Remote Monitoring Details")
	public void createProfileWithDownloadFilePermissionForRemoteMonitoringDetails() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without Download File permission for Provider Remote Monitoring Details")
	public void createProfileWithoutDownloadFilePermissionForRemoteMonitoringDetails() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg33ProviderRemoteMonitoringFileDownload']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Export Excel permission for Provider PA Details")
	public void createProfileWithExportExcelPermissionForPADetails() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without Download File permission for Provider Referral Outgoing Details")
	public void createProfileWithoutDownloadFilePermissionForReferralOutgoingDetails() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Referral Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg23ProviderReferralOutGoingFileDownload']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Download File permission for Provider Referral Outgoing Details")
	public void createProfileWithDownloadFilePermissionForReferralOutgoingDetails() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Referral Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without Download File permission for Provider Referral Incoming Details")
	public void createProfileWithoutDownloadFilePermissionForReferralIncomingDetails() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg23ProviderReferralInComingFileDownload']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Download File permission for Provider Referral Incoming Details")
	public void createProfileWithDownloadFilePermissionForReferralIncoming() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without Update access to Provider Module DeDupe")
	public void createProfileWithoutUpdateAccessToProviderModuleDeDupe() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg35ProviderDeDupe']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Download File permission for Referral Patient History")
	public void createProfileWithDownloadFilePermissionForReferralPatientHistory() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Referral Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I reset the user's password for Provider Module")
	public void resetUserPasswordForProviderModule() {
		sleep(3000);
		clickWhenReadyAndVisible(By.xpath("//span[normalize-space()='Filter']"));
		waitAndSendKeys(By.id("Filter_Email"), createdEmail);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
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
		sleep(500);
		WebElement initialsBtn = driver.findElement(By.cssSelector("button[id='userInitials'] span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", initialsBtn);
		clickWhenClickable(By.id("LogoutID"));
	}

	@And("the user should be able to view General Audit View settings in Provider Module")
	public void userShouldBeAbleToViewGeneralAuditViewSettingsInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Updated By']"));
		assertElementPresent(By.xpath("//a[normalize-space()='Updated Date']"));

	}

	@And("the user should not be able to view General Audit View settings in Provider Module")
	public void userShouldNotBeAbleToViewGeneralAuditViewSettingsInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated By']"));
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated Date']"));

	}

	@And("the user should be able to view Callback Request in Provider Module")
	public void userShouldBeAbleToViewCallbackRequestInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/CallbackPharmacy");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/CallbackPharmacy"));
		sleep(3000);

	}

	@And("the user should not be able to view Callback Request in Provider Module")
	public void userShouldNotBeAbleToViewCallbackRequestInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/CallbackPharmacy");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}

	}

	@And("the user should be able to view Demand Request in Provider Module")
	public void userShouldBeAbleToViewDemandRequestInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/DemandRequest");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/DemandRequest"));
		sleep(3000);

	}

	@And("the user should be able to merge NPI Request in Provider Module")
	public void userShouldBeAbleToMergeNPIRequestInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/NPIRequests");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/NPIRequests"));

	}

	@And("the user should be able to view NPI Request in Provider Module")
	public void userShouldBeAbleToViewNPIRequestInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/NPIRequests");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/NPIRequests"));

	}

	@And("the user should be able to view Text in Provider Module")
	public void userShouldBeAbleToViewTextInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);

	}

	@And("the user should be able to view Provider in Provider Module")
	public void userShouldBeAbleToViewProviderInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));

	}

	@And("the user should be able to view Provider details in Provider Module")
	public void userShouldBeAbleToViewProviderDetailsInProviderModule() {
		sleep(3000);
		assertElementPresent(By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]"));

	}

	@And("the user should be able to view Provider Address in Provider Module")
	public void userShouldBeAbleToViewProviderAddressInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]"));
		sleep(2000);

	}

	@And("the user should be able to edit Provider Address in Provider Module")
	public void userShouldBeAbleToEditProviderAddressInProviderModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Edit']"));
		sleep(1000);
		waitAndSendKeys(By.id("ProviderAddress_FrontDeskName"), "Emily Johnson");
		clickWhenClickable(By.xpath("//button[@id='btnSaveAddress']"));

	}

	@And("the user should not be able to add Provider Address in Provider Module")
	public void userShouldNotBeAbleToAddProviderAddressInProviderModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Address']"));

	}

	@And("the user should be able to delete Provider Address in Provider Module")
	public void userShouldBeAbleToDeleteProviderAddressInProviderModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnDeleteAddressConfirm']"));

	}

	@And("the user should be able to add Provider Address in Provider Module")
	public void userShouldBeAbleToAddProviderAddressInProviderModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Address']"));
		sleep(1000);
		waitAndSendKeys(By.id("ProviderAddress_Street"), "123 Main St");
		waitAndSendKeys(By.id("ProviderAddress_City"), "Newark");
		waitAndSendKeys(By.id("ProviderAddress_State"), "NJ");
		waitAndSendKeys(By.id("ProviderAddress_ZipCode"), "07102");
		waitAndSendKeys(By.id("ProviderAddress_ContactNumber1"), "9735551234");
		clickWhenClickable(By.xpath("//button[@id='btnSaveAddress']"));

	}

	@And("the user should not be able to delete Provider Address in Provider Module")
	public void userShouldNotBeAbleToDeleteProviderAddressInProviderModule() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));

	}

	@And("the user should not be able to edit Provider Address in Provider Module")
	public void userShouldNotBeAbleToEditProviderAddressInProviderModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Edit']"));

	}

	@And("the user should be able to view Provider Communication in Provider Module")
	public void userShouldBeAbleToViewProviderCommunicationInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Provider Communication']"));

	}

	@And("the user should be able to view Referrals in Provider Module")
	public void userShouldBeAbleToViewReferralsInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Referrals");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Referrals"));
		sleep(3000);

	}

	@And("the user should be able to view Executives")
	public void userShouldBeAbleToViewExecutives() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Executives']"));
		sleep(3000);

	}

	@And("the user should be able to add Referral Enrollment")
	public void userShouldBeAbleToAddReferralEnrollment() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Referral Enrollment']"));
		sleep(3000);
		clickWhenClickable(By.id("ProviderReferralEnrollment_StartDate"));
		clickWhenClickable(By.xpath("//td[@data-month='8' and @data-year='2025']/a[text()='19']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnSaveProviderReferralEnrollmentPopup']"));

	}

	@And("the user should not be able to edit Referral Enrollment")
	public void userShouldNotBeAbleToEditReferralEnrollment() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr/td[8]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to add Referral Enrollment")
	public void userShouldNotBeAbleToAddReferralEnrollment() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Referral Enrollment']"));
	}

	@And("the user should be able to delete Referral Enrollment")
	public void userShouldBeAbleToDeleteReferralEnrollment() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr/td[8]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@id='btnDeleteProviderReferralEnrollment']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='deleteProviderReferralEnrollment']"));

	}

	@And("the user should be able to edit Referral Enrollment")
	public void userShouldBeAbleToEditReferralEnrollment() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr/td[8]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("ProviderReferralEnrollment_Notes"), "Note");
		clickWhenClickable(By.xpath("//button[@id='btnSaveProviderReferralEnrollmentPopup']"));

	}

	@And("the user should not be able to delete Referral Enrollment")
	public void userShouldNotBeAbleToDeleteReferralEnrollment() {
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[8]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(
				By.xpath("//a[@id='btnDeleteProviderReferralEnrollment']//span[contains(text(),'Delete')]"));
	}

	@And("the user should be able to view Referral Enrollment")
	public void userShouldBeAbleToViewReferralEnrollment() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Referral Enrollment']"));
		sleep(3000);

	}

	@And("the user should be able to add Folder in Bucket")
	public void userShouldBeAbleToAddFolderInBucket() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@id='btnAddFolder']"));
		sleep(2000);
		waitAndSendKeys(By.id("BucketFolder_FolderName"), "BucketFolder");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to edit File in Bucket")
	public void userShouldNotBeAbleToEditFileInBucket() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//tbody/tr[2]/td[2]/a[1]/img[1]"));

	}

	@And("the user should not be able to delete File in Bucket")
	public void userShouldNotBeAbleToDeleteFileInBucket() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteFile']//img"));

	}

	@And("the user should not be able to download File in Bucket")
	public void userShouldNotBeAbleToDownloadFileInBucket() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//tbody//tr//a[3]//*[name()='svg']"));

	}

	@And("the user should be able to view File in Bucket")
	public void userShouldBeAbleToViewFileInBucket() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@id='0f8dcc97-695d-4f62-9ad1-6b43157cb7fe']"));
		sleep(2000);
		assertElementPresent(By.xpath("//a[@id='btnAddFile']"));

	}

	@And("the user should be able to download File in Referral Patient History")
	public void userShouldBeAbleToDownloadFileInReferralPatientHistory() {
		sleep(1000);
		clickWhenClickable(By.xpath("//img[@class='mr-2']"));

	}

	@And("the user should not be able to download File in Referral Patient History")
	public void userShouldNotBeAbleToDownloadFileInReferralPatientHistory() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//img[@class='mr-2']"));

	}

	@And("the user should not be able to reset passwords for Provider Executive")
	public void verifyUserCannotResetProviderExecutivePasswords() {
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[9]/div[1]/div[1]/button[1]/i[1]"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Reset Password']"));

	}

	@And("the user should be able to view Referral Patient History")
	public void userShouldBeAbleToViewReferralPatientHistory() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='History']"));

	}

	@And("the user should be able to view Provider Executive records")
	public void verifyUserCanViewProviderExecutiveRecords() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Executives']"));
		sleep(2000);
		assertElementPresent(By.xpath("//tbody/tr/td[9]/div[1]/div[1]/button[1]/i[1]"));

	}

	@And("the user should be able to view Provider Service in Provider Module")
	public void verifyUserCanViewProviderService() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Service']"));
		sleep(2000);
		assertElementPresent(By.xpath("//th[@scope='col']//i[@class='fa-solid fa-ellipsis-vertical']"));

	}

	@And("the user should be able to delete Provider Service in Provider Module")
	public void verifyUserCanDeleteProviderService() {
		sleep(3000);
		clickWhenClickable(By.xpath("//th[@scope='col']//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//a[@id='btnDeleteProviderService']//div[@class='gridRecordContextInner']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='deleteProviderService']"));

	}

	@And("the user should be able to edit Provider Service in Provider Module")
	public void verifyUserCanEditProviderService() {
		sleep(3000);
		clickWhenClickable(By.xpath("//th[@scope='col']//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//a[@class='tooltiped txt-decor-none user-access']//div[@class='gridRecordContextInner']"));
		sleep(1000);
		waitAndSendKeys(By.id("Service_Notes"), "note");
		clickWhenClickable(By.xpath("//button[@id='btnSaveProviderService']"));

	}

	@And("the user should not be able to add Provider Service in Provider Module")
	public void verifyUserCannotAddProviderService() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Service']"));

	}

	@And("the user should be able to add Provider EHR in Provider Module")
	public void verifyUserCanAddProviderEHR() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='EHR']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New EHR']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//select[@id='ddEHR']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("ddEHR"), 1);
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnSaveProviderEHR']"));

	}

	@And("the user should be able to edit Provider EHR in Provider Module")
	public void verifyUserCanEditProviderEHR() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='EHR']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(1000);
		waitAndSendKeys(By.id("ProviderEHR_Notes"), "Note");
		clickWhenClickable(By.xpath("//button[@id='btnSaveProviderEHR']"));

	}

	@And("the user should be able to delete Provider EHR in Provider Module")
	public void verifyUserCanDeleteProviderEHR() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='EHR']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		clickWhenClickable(By.xpath("//button[@id='deleteProviderEHR']"));

	}

	@And("the user should be able to add Business Group in Provider Module")
	public void verifyUserCanAddBusinessGroup() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Business Group']"));
		sleep(2000);
		waitAndSendKeys(By.id("BusinessGroup_Name"), "Sunrise Pharmacy Group");
		waitAndSendKeys(By.id("BusinessGroup_PhoneNumber"), "2125557845");
		waitAndSendKeys(By.id("BusinessGroup_PhoneNumberExt"), "203");
		waitAndSendKeys(By.id("BusinessGroup_Email"), "contact@mailinator.com");
		waitAndSendKeys(By.id("BusinessGroup_Zone"), "200");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to edit Business Group in Provider Module")
	public void verifyUserCannotEditBusinessGroup() {
		sleep(1000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to edit Business Group in Provider Module")
	public void verifyUserCanEditBusinessGroup() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Edit']"));
		sleep(2000);
		waitAndSendKeys(By.id("BusinessGroup_PrivateNotes"), "note");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to add Business Group in Provider Module")
	public void verifyUserCannotAddBusinessGroup() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Business Group']"));

	}

	@And("the user should be able to view Business Group Address in Provider Module")
	public void verifyUserCanViewBusinessGroupAddress() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/BusinessGroups");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/BusinessGroups"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/a[2]/img[1]"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Details']"));

	}

	@And("the user should not be able to download files from Provider Remote Monitoring Details")
	public void userShouldNotBeAbleToDownloadFilesFromRemoteMonitoringDetails() {
		sleep(1000);
		assertElementPresent(By.xpath("//td[normalize-space()='0000018']"));

	}

	@And("the user should not be able to export Provider PA Details to Excel")
	public void userShouldNotBeAbleToExportPADetailsToExcel() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export to Excel']"));

	}

	@And("the user should be able to export Provider PA Details to Excel")
	public void userShouldBeAbleToExportPADetailsToExcel() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Export to Excel']"));

	}

	@And("the user should be able to view Provider PA Details")
	public void userShouldBeAbleToViewProviderPADetails() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='History']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='tabs-7']//div[2]//div[1]//div[2]//a[1]//span[1]"));
		sleep(1000);
		assertElementPresent(By.xpath("//td[normalize-space()='0000008']"));

	}

	@And("the user should be able to view Provider Type in Provider Module")
	public void verifyUserCanViewProviderType() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/ProviderTypes");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ProviderTypes"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Name']"));

	}

	@And("the user should not be able to delete Provider Type in Provider Module")
	public void verifyUserCannotDeleteProviderType() {
		sleep(1000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));

	}

	@And("the user should not be able to delete Category in Provider Module")
	public void verifyUserCannotDeleteCategory() {
		sleep(1000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to delete Specialty in Provider Module")
	public void verifyUserCanDeleteSpecialty() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to view Provider Template in Provider Module")
	public void verifyUserCanViewProviderTemplate() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/Templates");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Templates"));
		sleep(3000);

	}

	@And("the user should not be able to add Provider Template in Provider Module")
	public void verifyUserCannotAddProviderTemplate() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Template']"));

	}

	@And("the user should be able to delete Provider Template in Provider Module")
	public void verifyUserCanDeleteProviderTemplate() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to edit Provider Template in Provider Module")
	public void verifyUserCanEditProviderTemplate() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		waitAndSendKeys(By.id("ProviderDocumentTemplate_Name"), "Provider Registration Template");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
	}

	@And("the user should not be able to delete Provider Template in Provider Module")
	public void verifyUserCannotDeleteProviderTemplate() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit Provider Template in Provider Module")
	public void verifyUserCannotEditProviderTemplate() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
	}

	@And("the user should be able to add Provider Template in Provider Module")
	public void verifyUserCanAddProviderTemplate() {
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Template']"));
		sleep(1000);
		waitAndSendKeys(By.id("ProviderDocumentTemplate_Name"), "Provider Registration Template");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to delete Service in Provider Module")
	public void verifyUserCanDeleteService() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should not be able to add Service in Provider Module")
	public void verifyUserCannotAddService() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Provider Service']"));

	}

	@And("the user should be able to edit Service in Provider Module")
	public void verifyUserCanEditService() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		waitAndSendKeys(By.id("Service_Name"), "Chronic Disease Management");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
	}

	@And("the user should not be able to delete Service in Provider Module")
	public void verifyUserCannotDeleteService() {
		sleep(1000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));

	}

	@And("the user should not be able to edit Service in Provider Module")
	public void verifyUserCannotEditService() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to add Service in Provider Module")
	public void verifyUserCanAddService() {
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Provider Service']"));
		sleep(1000);
		waitAndSendKeys(By.id("Service_Name"), "Chronic Disease Management");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to view Service in Provider Module")
	public void verifyUserCanViewService() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/Services");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Services"));
		sleep(3000);

	}

	@And("the user should not be able to add Specialty in Provider Module")
	public void verifyUserCannotAddSpecialty() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Provider Specialty']"));

	}

	@And("the user should be able to edit Specialty in Provider Module")
	public void verifyUserCanEditSpecialty() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		waitAndSendKeys(By.id("Specialty_Name"), "Oncology");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to delete Specialty in Provider Module")
	public void verifyUserCannotDeleteSpecialty() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
	}

	@And("the user should not be able to edit Specialty in Provider Module")
	public void verifyUserCannotEditSpecialty() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to add Specialty in Provider Module")
	public void verifyUserCanAddSpecialty() {
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Provider Specialty']"));
		sleep(1000);
		waitAndSendKeys(By.id("Specialty_Name"), "Oncology");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
	}

	@And("the user should be able to view Specialty in Provider Module")
	public void verifyUserCanViewSpecialty() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/Specialties");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Specialties"));
		sleep(1000);

	}

	@And("the user should be able to delete Category in Provider Module")
	public void verifyUserCanDeleteCategory() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should not be able to add Category in Provider Module")
	public void verifyUserCannotAddCategory() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Provider Category']"));

	}

	@And("the user should be able to edit Category in Provider Module")
	public void verifyUserCanEditCategory() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		waitAndSendKeys(By.id("Category_Name"), "Orthopedics");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to edit Category in Provider Module")
	public void verifyUserCannotEditCategory() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to add Category in Provider Module")
	public void verifyUserCanAddCategory() {
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Provider Category']"));
		sleep(1000);
		waitAndSendKeys(By.id("Category_Name"), "Orthopedics");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to view Category in Provider Module")
	public void verifyUserCanViewCategory() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/Categories");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Categories"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Name']"));

	}

	@And("the user should be able to delete Provider Type in Provider Module")
	public void verifyUserCanDeleteProviderType() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Delete']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should not be able to add Provider Type in Provider Module")
	public void verifyUserCannotAddProviderType() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Provider Type']"));

	}

	@And("the user should be able to edit Provider Type in Provider Module")
	public void verifyUserCanEditProviderType() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(1000);
		waitAndSendKeys(By.id("ProviderType_Label"), "PCP");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to edit Provider Type in Provider Module")
	public void verifyUserCannotEditProviderType() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to add Provider Type in Provider Module")
	public void verifyUserCanAddProviderType() {
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Provider Type']"));
		sleep(1000);
		waitAndSendKeys(By.id("ProviderType_Name"), "Primary Care");
		waitAndSendKeys(By.id("ProviderType_Label"), "PCP");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to download files from Provider Remote Monitoring Details")
	public void userShouldBeAbleToDownloadFilesFromRemoteMonitoringDetails() {
		sleep(1000);
		assertElementPresent(By.xpath("//td[normalize-space()='0000018']"));

	}

	@And("the user should be able to view Provider Remote Monitoring Details")
	public void userShouldBeAbleToViewProviderRemoteMonitoringDetails() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='History']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='tabs-7']//div[3]//div[1]//div[2]//a[1]//span[1]"));
		sleep(1000);
		assertElementPresent(By.xpath("//td[normalize-space()='0000018']"));

	}

	@And("the user should not be able to download files from Provider Referral Outgoing Details")
	public void userShouldNotBeAbleToDownloadFilesFromReferralOutgoingDetails() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//tbody/tr[1]/td[12]/div[1]/a[1]//*[name()='svg']"));

	}

	@And("the user should be able to download files from Provider Referral Outgoing Details")
	public void userShouldBeAbleToDownloadFilesFromReferralOutgoingDetails() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[12]/div[1]/a[1]//*[name()='svg']"));

	}

	@And("the user should be able to view Provider Referral Outgoing Details")
	public void userShouldBeAbleToViewProviderReferralOutgoingDetails() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='History']"));
		sleep(2000);
		clickWhenClickable(
				By.xpath("//div[@class='filterGridTwoSideTop']//span[contains(text(),'View All Referrals')]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Outgoing']"));
		sleep(1000);
		assertElementPresent(By.xpath("//tbody/tr[1]/td[10]"));
	}

	@And("the user should not be able to download files from Provider Referral Incoming Details")
	public void userShouldNotBeAbleToDownloadFilesFromReferralIncomingDetails() {
		sleep(1000);
		assertElementPresent(By.xpath("//span[normalize-space()='Export to Excel']"));
	}

	@And("the user should be able to download files from Provider Referral Incoming Details")
	public void userShouldBeAbleToDownloadFilesFromReferralIncomingDetails() {
		sleep(3000);
		assertElementPresent(By.xpath("//span[normalize-space()='Export to Excel']"));

	}

	@And("the user should be able to view Provider Referral Incoming Details")
	public void userShouldBeAbleToViewReferralIncomingDetails() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='History']"));
		sleep(2000);
		clickWhenClickable(
				By.xpath("//div[@class='filterGridTwoSideTop']//span[contains(text(),'View All Referrals')]"));
		sleep(1000);
		assertElementPresent(By.xpath("//span[normalize-space()='Export to Excel']"));
	}

	@And("the user should not be able to delete Business Group Address in Provider Module")
	public void verifyUserCannotDeleteBusinessGroupAddress() {
		sleep(3000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));

	}

	@And("the user should not be able to edit Business Group Address in Provider Module")
	public void verifyUserCannotEditBusinessGroupAddress() {
		sleep(1000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Edit']"));

	}

	@And("the user should not be able to add Business Group Address in Provider Module")
	public void verifyUserCannotAddBusinessGroupAddress() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Address']"));

	}

	@And("the user should be able to delete Business Group Address in Provider Module")
	public void deleteBusinessGroupAddressInProviderModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnDeleteAddressConfirm']"));

	}

	@And("the user should be able to add Business Group Address in Provider Module")
	public void verifyUserCanAddBusinessGroupAddress() {
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Address']"));
		sleep(1000);
		waitAndSendKeys(By.id("BusinessGroup_Street"), "123 Main Street, Suite 200");
		waitAndSendKeys(By.id("BusinessGroup_City"), "New York");
		waitAndSendKeys(By.id("BusinessGroup_State"), "NY");
		waitAndSendKeys(By.id("BusinessGroup_ZipCode"), "10001");
		clickWhenClickable(By.xpath("//button[@id='btnSaveAddress']"));

	}

	@And("the user should be able to edit Business Group Address in Provider Module")
	public void verifyUserCanEditBusinessGroupAddress() {
		sleep(3000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Edit']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Shipping Address']"));
		clickWhenClickable(By.xpath("//button[@id='btnSaveAddress']"));

	}

	@And("the user should be able to make Business Group a Partner in Provider Module")
	public void verifyUserCanMakeBusinessGroupPartner() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@id='btnMakePartner']//*[name()='svg']"));

	}

	@And("the user should be able to delete Business Group in Provider Module")
	public void verifyUserCanDeleteBusinessGroup() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should not be able to make Business Group a Partner in Provider Module")
	public void verifyUserCannotMakeBusinessGroupPartner() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(
				By.xpath("//tbody/tr[1]/td[4]/div[1]/a[1]//*[name()='svg']//*[name()='path' and @id='Union_28']"));

	}

	@And("the user should not be able to delete Business Group in Provider Module")
	public void verifyUserCannotDeleteBusinessGroup() {
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to view Business Group in Provider Module")
	public void verifyUserCanViewBusinessGroup() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/BusinessGroups");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/BusinessGroups"));
		sleep(3000);

	}

	@And("the user should not be able to add Provider EHR in Provider Module")
	public void verifyUserCannotAddProviderEHR() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New EHR']"));

	}

	@And("the user should not be able to delete Provider EHR in Provider Module")
	public void verifyUserCannotDeleteProviderEHR() {
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit Provider EHR in Provider Module")
	public void verifyUserCannotEditProviderEHR() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to edit Provider Service in Provider Module")
	public void verifyUserCannotEditProviderService() {
		sleep(3000);
		clickWhenClickable(By.xpath("//th[@scope='col']//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//a[@class='tooltiped txt-decor-none user-access']//div[@class='gridRecordContextInner']"));

	}

	@And("the user should not be able to delete Provider Service in Provider Module")
	public void verifyUserCannotDeleteProviderService() {
		sleep(3000);
		clickWhenClickable(By.xpath("//th[@scope='col']//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteProviderService']//div[@class='gridRecordContextInner']"));

	}

	@And("the user should be able to add Provider Service in Provider Module")
	public void verifyUserCanAddProviderService() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Service']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[@class='model-inp select-city-dd dropdowncheckbox']//input[@type='text']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[@class='model-inp select-city-dd dropdowncheckbox']//ul/li[2]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSaveProviderService']"));
	}

	@And("the user should be able to reset passwords for Provider Executive users")
	public void verifyUserCanResetProviderExecutivePasswords() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr/td[9]/div[1]/div[1]/button[1]/i[1]"));
		clickWhenClickable(By.xpath("//span[normalize-space()='Reset Password']"));
		sleep(3000);
		waitAndSendKeys(By.id("newPassword"), "Admin@1234");
		waitAndSendKeys(By.id("confirmPassword"), "Admin@1234");
		clickWhenClickable(By.xpath("//button[@id='btnResetPassword']"));

	}

	@And("the user should be able to update DeDupe records for Provider Module")
	public void userShouldBeAbleToUpdateDeDupeRecordsForProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/DeDupeProviders");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/DeDupeProviders"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Doctor Last Name']"));
		clickWhenClickable(By.xpath("//label[normalize-space()='Doctor First Name']"));
		clickWhenClickable(By.xpath("//span[normalize-space()='Find Duplicate']"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//label[starts-with(@for,'ckhg_')])[1]"));
		clickWhenClickable(By.xpath("(//label[starts-with(@for,'ckhg_')])[2]"));
		clickWhenClickable(By.xpath("//table[1]//thead[1]//tr[1]//th[9]//a[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//input[starts-with(@id,'chkg_')])[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Next']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Next']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Finish']"));

	}

	@Then("the user should not be able to update DeDupe records via UI or direct URL for Provider Module")
	public void userShouldNotBeAbleToUpdateDeDupeRecordsForProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/DeDupeProviders");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}

	}

	@And("the user should be able to edit File in Bucket")
	public void userShouldBeAbleToEditFileInBucket() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[2]/td[2]/a[1]/img[1]"));
		sleep(1000);
		waitAndSendKeys(By.id("fileNameTextBox"), "file");
		clickWhenClickable(By.xpath("//button[@id='btnSaveFile']"));

	}

	@And("the user should not be able to view Folder in Bucket")
	public void userShouldNotBeAbleToViewFolderInBucket() {
		sleep(1000);
		clickWhenClickable(By.xpath("//*[name()='path' and contains(@d,'M575.8 255')]"));

	}

	@And("the user should not be able to edit Folder in Bucket")
	public void userShouldNotBeAbleToEditFolderInBucket() {
		sleep(1000);
		assertElementNotPresent(
				By.xpath("//td[@class='text-right']//a[@class='tooltiped txt-decor-none user-access']//img"));

	}

	@And("the user should not be able to delete Folder in Bucket")
	public void userShouldNotBeAbleToDeleteFolderInBucket() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteFolder']//img"));

	}

	@And("the user should not be able to favourite Folder in Bucket")
	public void userShouldNotBeAbleToFavouriteFolderInBucket() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//img[@src='/Content/img/black-bookmark.png']"));

	}

	@And("the user should not be able to add Folder in Bucket")
	public void userShouldNotBeAbleToAddFolderInBucket() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//a[@id='btnAddFolder']"));

	}

	@And("the user should be able to download File in Bucket")
	public void userShouldBeAbleToDownloadFileInBucket() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody//tr//a[3]//*[name()='svg']"));
		sleep(1000);

	}

	@And("the user should be able to favourite File in Bucket")
	public void userShouldBeAbleToFavouriteFileInBucket() {
		sleep(3000);
		clickWhenClickable(By.xpath("//img[contains(@src,'bookmark')]"));
		sleep(3000);

	}

	@And("the user should be able to delete File in Bucket")
	public void userShouldBeAbleToDeleteFileInBucket() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@id='btnDeleteFile']//img"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnDeleteFileConfirm']"));

	}

	@And("the user should be able to add File in Bucket")
	public void userShouldBeAbleToAddFileInBucket() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@id='btnAddFile']"));
		sleep(1000);
		String filePath = "C:\\Users\\MayurChauhan\\Downloads\\dummy.pdf";
		WebElement fileInput = driver.findElement(By.xpath("// div[@class='model-inp']//input[@id='file-3']"));
		fileInput.sendKeys(filePath);
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnSaveFile']"));
	}

	@And("the user should not be able to view File in Bucket")
	public void userShouldNotBeAbleToViewFileInBucket() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//img[@class='edit']"));

	}

	@And("the user should not be able to favourite File in Bucket")
	public void userShouldNotBeAbleToFavouriteFileInBucket() {
		sleep(1000);
		assertElementNotPresent(By.xpath("//img[@src='/Content/img/black-bookmark.png']"));

	}

	@And("the user should not be able to add File in Bucket")
	public void userShouldNotBeAbleToAddFileInBucket() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@id='42862eaa-0885-47aa-b59b-dd695a8da2dc']"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//a[@id='btnAddFile']"));

	}

	@And("the user should be able to favourite Folder in Bucket")
	public void userShouldBeAbleToFavouriteFolderInBucket() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[5]/td[1]/a[1]/img[1]"));
		sleep(3000);

	}

	@And("the user should be able to delete Folder in Bucket")
	public void userShouldBeAbleToDeleteFolderInBucket() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[5]/td[2]/a[2]/img[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[@id='deleteFolderModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to edit Folder in Bucket")
	public void userShouldBeAbleToEditFolderInBucket() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[5]/td[2]/a[1]/img[1]"));
		sleep(2000);
		waitAndSendKeys(By.id("BucketFolder_FolderName"), "Bucket");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to view Folder in Bucket")
	public void userShouldBeAbleToViewFolderInBucket() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[@id='42862eaa-0885-47aa-b59b-dd695a8da2dc']"));

	}

	@And("the user should be able to delete Executives")
	public void userShouldBeAbleToDeleteExecutives() {
		sleep(3000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Delete']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='deleteProviderExecutive']"));

	}

	@And("the user should be able to edit Executives")
	public void userShouldBeAbleToEditExecutives() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Executives']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Edit']"));
		sleep(2000);
		waitAndSendKeys(By.id("ProviderExecutive_ProductService"), "PA");
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnSaveProviderExecutivePopup']"));

	}

	@And("the user should be able to add Executives")
	public void userShouldBeAbleToAddExecutives() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Executives']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Executive']"));
		sleep(1000);
		waitAndSendKeys(By.id("ProviderExecutive_LastName"), "Selby");
		waitAndSendKeys(By.id("ProviderExecutive_FirstName"), "Teresa");
		waitAndSendKeys(By.id("ProviderExecutive_EmailId"), "TeresaJSelby@mailinator.com");
		clickWhenClickable(By.xpath("//select[@id='ProviderExecutive_ProfileId']"));
		selectDropdownByIndexWhenReady(By.id("ProviderExecutive_ProfileId"), 2);
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSaveProviderExecutivePopup']"));

	}

	@And("the user should be able to export Referrals to Excel in Provider Module")
	public void userShouldBeAbleToExportReferralsToExcelInProviderModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Export to Excel']"));

	}

	@And("the user should be able to download files from Referrals in Provider Module")
	public void userShouldBeAbleToDownloadFilesFromReferralsInProviderModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//img[@class='mr-2']"));

	}

	@And("the user should be able to edit Provider Communication in Provider Module")
	public void userShouldBeAbleToEditProviderCommunicationInProviderModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[11]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(1000);
		waitAndSendKeys(By.id("ProviderCommunication_Description"), "Communication");
		clickWhenClickable(By.xpath("//button[@id='btnSaveCommunication']"));

	}

	@And("the user should not be able to add Provider Communication in Provider Module")
	public void userShouldNotBeAbleToAddProviderCommunicationInProviderModule() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Communication']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[11]/div[1]/div[1]/button[1]/i[1]"));

	}

	@And("the user should be able to delete Provider Communication in Provider Module")
	public void userShouldBeAbleToDeleteProviderCommunicationInProviderModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[11]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='deleteproviderCommunication']"));

	}

	@And("the user should be able to add Provider Communication in Provider Module")
	public void userShouldBeAbleToAddProviderCommunicationInProviderModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Communication']"));
		sleep(1000);
		waitAndSendKeys(By.id("ProviderCommunication_Description"), "Communication");
		clickWhenClickable(By.xpath("//button[@id='btnSaveCommunication']"));

	}

	@And("the user should not be able to edit Provider Communication in Provider Module")
	public void userShouldNotBeAbleToEditProviderCommunicationInProviderModule() {
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[11]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to export Referrals to Excel in Provider Module")
	public void userShouldNotBeAbleToExportReferralsToExcelInProviderModule() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export to Excel']"));

	}

	@And("the user should not be able to edit Executives")
	public void userShouldNotBeAbleToEditExecutives() {
		sleep(2000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Edit']"));

	}

	@And("the user should not be able to delete Executives")
	public void userShouldNotBeAbleToDeleteExecutives() {
		sleep(2000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));
	}

	@And("the user should not be able to add Executives")
	public void userShouldNotBeAbleToAddExecutives() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Executive']"));

	}

	@And("the user should not be able to delete Provider Communication in Provider Module")
	public void userShouldNotBeAbleToDeleteProviderCommunicationInProviderModule() {
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to add Provider in Provider Module")
	public void userShouldBeAbleToAddProviderInProviderModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Provider']"));
		sleep(3000);
		waitAndSendKeys(By.id("Provider_DoctorLastName"), "Varner");
		waitAndSendKeys(By.id("Provider_DoctorFirstName"), "Carol");
		waitAndSendKeys(By.id("Provider_Zone"), "200");
		waitAndSendKeys(By.id("Provider_NPINumber"), "1457382912");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to edit Provider in Provider Module")
	public void userShouldNotBeAbleToEditProviderInProviderModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to delete Provider in Provider Module")
	public void userShouldNotBeAbleToDeleteProviderInProviderModule() {
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to delete Provider in Provider Module")
	public void userShouldBeAbleToDeleteProviderInProviderModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[@class='filter-btn']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to edit Provider in Provider Module")
	public void userShouldBeAbleToEditProviderInProviderModule() {
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("Provider_CellPhone"), "5454545454");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to add Provider in Provider Module")
	public void userShouldNotBeAbleToAddProviderInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Provider']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/button[1]/i[1]"));

	}

	@And("the user should not be able to view Provider details in Provider Module")
	public void userShouldNotBeAbleToViewProviderDetailsInProviderModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]"));

	}

	@And("the user should be able to send Text in Provider Module")
	public void userShouldBeAbleToSendTextInProviderModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Quick Text']"));
		sleep(1000);
		waitAndSendKeys(By.id("Filter_Provider_Name"), "Apolo Pharmacy");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//input[@id='newProviderId']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("newProviderId"), 1);
		sleep(1000);
		clickWhenClickable(By.xpath("//input[@id='newProviderExecutiveId']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("newProviderExecutiveId"), 0);
		sleep(1000);
		waitAndSendKeys(By.id("newPhoneNumber"), "(457) 547-5677");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to send VCard in Provider Module")
	public void userShouldBeAbleToSendVCardInProviderModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Send VCard']"));
		sleep(3000);
		waitAndSendKeys(By.id("vCardPhoneNumber"), "5478686879");
		waitAndSendKeys(By.id("vcardBody"), "Vcard");
		clickWhenClickable(By.xpath("//button[@id='btnSendVCard']"));

	}

	@And("the user should not be able to view Demand Request in Provider Module")
	public void userShouldNotBeAbleToViewDemandRequestInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/DemandRequest");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}

	}

	@And("the user should not be able to approve NPI Request in Provider Module")
	public void userShouldNotBeAbleToApproveNPIRequestInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/NPIRequests");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/NPIRequests"));

	}

	@And("the user should not be able to merge NPI Request in Provider Module")
	public void userShouldNotBeAbleToMergeNPIRequestInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/NPIRequests");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/NPIRequests"));

	}

	@And("the user should not be able to send Text in Provider Module")
	public void verifyUserCannotSendTextInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/NPIRequests");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/NPIRequests"));

	}

	@And("the user should not be able to send VCard in Provider Module")
	public void verifyUserCannotSendVCardInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/NPIRequests");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/NPIRequests"));

	}

	@And("the user should be able to approve NPI Request in Provider Module")
	public void userShouldBeAbleToApproveNPIRequestInProviderModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[5]/div[1]/a[1]/button[1]/i[1]"));

	}

	@And("I log in using the new user for Provider Module")
	public void loginUsingNewUserForProviderModule() {
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

	@And("I assign the profile and workspace to the user for Provider Module")
	public void assignProfileAndWorkspaceToUserForProviderModule() {
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
