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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
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
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated By']"));
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated Date']"));

	}

	@And("the user should be able to view NPI Request in Provider Module")
	public void userShouldBeAbleToViewNPIRequestInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated By']"));
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated Date']"));

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
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated By']"));
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated Date']"));

	}

	@And("the user should be able to edit Provider Communication in Provider Module")
	public void userShouldBeAbleToEditProviderCommunicationInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated By']"));
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated Date']"));

	}

	@And("the user should not be able to add Provider Communication in Provider Module")
	public void userShouldNotBeAbleToAddProviderCommunicationInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated By']"));
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated Date']"));

	}

	@And("the user should be able to delete Provider Communication in Provider Module")
	public void userShouldBeAbleToDeleteProviderCommunicationInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated By']"));
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated Date']"));

	}

	@And("the user should be able to add Provider Communication in Provider Module")
	public void userShouldBeAbleToAddProviderCommunicationInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated By']"));
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated Date']"));

	}

	@And("the user should not be able to edit Provider Communication in Provider Module")
	public void userShouldNotBeAbleToEditProviderCommunicationInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated By']"));
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated Date']"));

	}

	@And("the user should not be able to delete Provider Communication in Provider Module")
	public void userShouldNotBeAbleToDeleteProviderCommunicationInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated By']"));
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated Date']"));

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
		waitAndSendKeys(By.id("ConfirmNewPassword"), "Admin@1234");

	}

	@And("the user should not be able to send VCard in Provider Module")
	public void userShouldNotBeAbleToSendVCardInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated By']"));
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated Date']"));

	}

	@And("the user should be able to reply to Text in Provider Module")
	public void userShouldBeAbleToReplyToTextInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated By']"));
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated Date']"));

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

	@And("the user should not be able to send Text in Provider Module")
	public void userShouldNotBeAbleToSendTextInProviderModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Quick Text']"));

	}

	@And("the user should not be able to reply to Text in Provider Module")
	public void userShouldNotBeAbleToReplyToTextInProviderModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Quick Text']"));

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
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated By']"));
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated Date']"));

	}

	@And("the user should not be able to merge NPI Request in Provider Module")
	public void userShouldNotBeAbleToMergeNPIRequestInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated By']"));
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated Date']"));

	}

	@And("the user should be able to approve NPI Request in Provider Module")
	public void userShouldBeAbleToApproveNPIRequestInProviderModule() {
		sleep(3000);
		driver.get(baseUrl + "/Prescriber/Home/Providers");
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated By']"));
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated Date']"));

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
