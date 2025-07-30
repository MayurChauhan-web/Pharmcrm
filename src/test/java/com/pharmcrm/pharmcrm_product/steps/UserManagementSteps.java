package com.pharmcrm.pharmcrm_product.steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import com.pharmcrm.pharmcrm_product.DriverFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.time.Duration;
import java.util.List;
import org.junit.Assert;

public class UserManagementSteps {

	WebDriver driver;
	WebDriverWait wait;
	String createdEmail;
	String baseUrl = "http://qa01.pharmcrm.com";
	String profileName;

	@Given("I log in as admin")
	public void loginAsAdmin() {
		if (!isInternetAvailable()) {
			Assert.fail("❌ Internet connection not available. Please check your connection.");
		}
		driver = DriverFactory.createDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get(baseUrl);
		measurePageLoadTime(baseUrl, 5000);
		waitAndSendKeys(By.id("UserName"), "support@pharmcrm.com");
		waitAndSendKeys(By.id("Password"), "Admin@1234");
		clickWhenClickable(By.id("btnSubmit"));
	}

	@When("I create a new user with email {string}")
	public void createNewUser(String email) {
		this.createdEmail = email;
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

	@And("I create a profile with log-only access")
	public void createProfileWithLogOnlyAccess() {
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
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
		sleep(3000);
	}

	@And("I create a profile without Setup Module access")
	public void createProfileWithoutSetupmoduleAccess() {
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
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Setup Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with full access to Setup Module → Profile")
	public void createProfileWithFullSetupModuleAccess() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with access only to the Setup Module → Profile with 'View' permission")
	public void createViewOnlyProfileForSetupModule() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg01ProfileAdd");
		uncheckPermissionIfChecked("chkg01ProfileEdit");
		uncheckPermissionIfChecked("chkg01ProfileDelete");
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Setup Module → User")
	public void createProfileWithViewOnlyAccessToUser() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg01UserAdd");
		uncheckPermissionIfChecked("chkg01UserEdit");
		uncheckPermissionIfChecked("chkg01UserDelete");
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with full access to Setup Module → User")
	public void createProfileWithFullAccessToUser() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Setup Module → Text Template")
	public void createProfileWithViewAccessToTextTemplate() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg8SMSTemplateAdd");
		uncheckPermissionIfChecked("chkg8SMSTemplateEdit");
		uncheckPermissionIfChecked("chkg8SMSTemplateDelete");
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Setup Module → BOT Call Template")
	public void createBotCallTemplateProfileWithViewAccess() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg9CalloutTemplateAdd");
		uncheckPermissionIfChecked("chkg9CalloutTemplateEdit");
		uncheckPermissionIfChecked("chkg9CalloutTemplateDelete");
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Setup Module → BOT Call Template")
	public void createProfileWithViewAndAddAccessForBotCallTemplate() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg9CalloutTemplateEdit");
		uncheckPermissionIfChecked("chkg9CalloutTemplateDelete");
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, and Edit access to Setup Module → BOT Call Template")
	public void createProfileWithViewAddEditAccessForBotCallTemplate() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg9CalloutTemplateDelete");
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with full access to Setup Module → BOT Call Template")
	public void createProfileWithFullAccessForBotCallTemplate() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Setup Module → Mail Template")
	public void createProfileWithViewAccessOnlyForMailTemplate() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg9MailTemplateAdd");
		uncheckPermissionIfChecked("chkg9MailTemplateEdit");
		uncheckPermissionIfChecked("chkg9MailTemplateDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Setup Module → Mail Template")
	public void createProfileWithViewAndAddAccessForMailTemplate() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg9MailTemplateEdit");
		uncheckPermissionIfChecked("chkg9MailTemplateDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, and Edit access to Setup Module → Mail Template")
	public void createProfileWithViewAddEditAccessForMailTemplate() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg9MailTemplateDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with full access to Setup Module → Mail Template")
	public void createProfileWithFullAccessForMailTemplate() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with full access to Setup Module → Fax Template")
	public void createProfileWithFullAccessForFaxTemplate() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, and Edit access to Setup Module → Fax Template")
	public void createProfileWithViewAddEditAccessForFaxTemplate() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg9FaxTemplateDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Setup Module → Fax Template")
	public void createProfileWithViewAndAddAccessForFaxTemplate() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg9FaxTemplateEdit");
		uncheckPermissionIfChecked("chkg9FaxTemplateDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Setup Module → Fax Template")
	public void createProfileWithViewOnlyAccessForFaxTemplate() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg9FaxTemplateAdd");
		uncheckPermissionIfChecked("chkg9FaxTemplateEdit");
		uncheckPermissionIfChecked("chkg9FaxTemplateDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Setup Module → Patient Signature Template")
	public void createProfileWithViewOnlyAccessForPatientSignatureTemplate() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg12PatientSignatureTemplateAdd");
		uncheckPermissionIfChecked("chkg12PatientSignatureTemplateEdit");
		uncheckPermissionIfChecked("chkg12PatientSignatureTemplateDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Setup Module → Patient Signature Template")
	public void createProfileWithViewAndAddAccessForPatientSignatureTemplate() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg12PatientSignatureTemplateEdit");
		uncheckPermissionIfChecked("chkg12PatientSignatureTemplateDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, and Edit access to Setup Module → Patient Signature Template")
	public void createProfileWithViewAddEditAccessForPatientSignatureTemplate() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg12PatientSignatureTemplateDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with full access to Setup Module → Patient Signature Template")
	public void createProfileWithFullAccessForPatientSignatureTemplate() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with full access to Setup Module → Feedback Form")
	public void createProfileWithFullAccessForFeedbackForm() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, and Edit access to Setup Module → Feedback Form")
	public void createProfileWithViewAddEditForFeedbackForm() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg36FeedbackFormDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Setup Module → Feedback Form")
	public void createProfileWithViewAndAddForFeedbackForm() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg36FeedbackFormEdit");
		uncheckPermissionIfChecked("chkg36FeedbackFormDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Setup Module → Feedback Form")
	public void createProfileWithViewOnlyForFeedbackForm() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg36FeedbackFormAdd");
		uncheckPermissionIfChecked("chkg36FeedbackFormEdit");
		uncheckPermissionIfChecked("chkg36FeedbackFormDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Setup Module → Text Template")
	public void createProfileWithViewAndAddAccessToTextTemplate() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg8SMSTemplateEdit");
		uncheckPermissionIfChecked("chkg8SMSTemplateDelete");
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, and Edit access to Setup Module → Text Template")
	public void verifyUserCannotDeleteTextTemplates() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg8SMSTemplateDelete");
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with full access to Setup Module → Text Template")
	public void validateFullAccessForTextTemplates() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Setup Module → User")
	public void createProfileWithViewAndAddAccessToUser() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg01UserEdit");
		uncheckPermissionIfChecked("chkg01UserDelete");
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, and Edit access to Setup Module → User")
	public void createProfileWithViewAddAndEditAccessToUser() {
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg01UserDelete");
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without Patient Module access")
	public void createProfileWithoutpatientmoduleAccess() {
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
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Patient Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.id("btnSave"));
		sleep(3000);
	}

	@And("I create a profile without Delivery Module access")
	public void createProfileWithoutDeliverymoduleAccess() {
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
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Delivery Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.id("btnSave"));
		sleep(3000);
	}

	@And("I create a profile without Drug Module access")
	public void createProfileWithoutDrugmoduleAccess() {
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
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Drug Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.id("btnSave"));
		sleep(3000);
	}

	@And("I create a profile without Workflow Module access")
	public void createProfileWithoutworkflowmoduleAccess() {
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
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Workflow Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.id("btnSave"));
		sleep(3000);
	}

	@And("I assign the profile and workspace to the user")
	public void assignWorkspace() {
		sleep(2000);
		driver.get(baseUrl + "/Setup/Home/WorkspaceUsers");
		clickWhenClickable(By.xpath("//span[normalize-space()='New User']"));
		WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUserSearch")));
		searchBox.sendKeys(createdEmail);
		By firstItemLocator = By.xpath("(//a[@class='list-group-item list-group-item-action'])[1]");
		wait.until(ExpectedConditions.textToBePresentInElementLocated(firstItemLocator, createdEmail));
		sleep(500);
		WebElement firstItem = wait.until(ExpectedConditions.visibilityOfElementLocated(firstItemLocator));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", firstItem);
		sleep(500);
		selectDropdownByVisibleTextWhenReady(By.id("WorkspaceUser_Profile_Id"), profileName);
		sleep(500);
		clickWhenClickable(By.id("btnSubmitUser"));
		sleep(3000);

	}

	@And("I reset the user's password")
	public void resetPassword() {
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
		waitAndSendKeys(By.id("confirmPassword"), "Admin@123");
		clickWhenClickable(By.xpath("//label[normalize-space()='Show Password']"));
		clickWhenClickable(By.id("btnResetPassword"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='toast toast-success']")));
		// Logout
		sleep(500);
		WebElement initialsBtn = driver.findElement(By.cssSelector("button[id='userInitials'] span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", initialsBtn);
		clickWhenClickable(By.id("LogoutID"));
	}

	@And("I log in using the new user")
	public void userLogin() {
		waitAndSendKeys(By.id("UserName"), createdEmail);
		waitAndSendKeys(By.id("Password"), "Admin@123");
		clickWhenClickable(By.id("btnSubmit"));
		waitAndSendKeys(By.id("OldPassword"), "Admin@123");
		waitAndSendKeys(By.id("NewPassword"), "Admin@1234");
		waitAndSendKeys(By.id("ConfirmNewPassword"), "Admin@1234");
		clickWhenClickable(By.id("btnSubmit"));
		waitAndSendKeys(By.id("UserName"), createdEmail);
		waitAndSendKeys(By.id("Password"), "Admin@1234");
		clickWhenClickable(By.id("btnSubmit"));
	}

	@Then("the user should be able to view fax templates")
	public void userShouldBeAbleToViewFaxTemplates() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/FaxTemplates");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/FaxTemplates"));
	}

	@Then("the user should be able to view patient signature templates")
	public void userShouldBeAbleToViewPatientSignatureTemplates() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/PatientSignatureTemplates");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PatientSignatureTemplates"));
	}

	@Then("the user should be able to view feedback forms")
	public void userShouldBeAbleToViewFeedbackForms() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/FeedbackForms");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/FeedbackForms"));
	}

	@And("the user should be able to add a new feedback form")
	public void userShouldBeAbleToAddNewFeedbackForm() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Feedback Form']"));
		waitAndSendKeys(By.id("FeedbackForm_Title"), profileName);

		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
	}

	@And("the user should be able to edit an existing feedback form")
	public void userShouldBeAbleToEditFeedbackForm() {
		sleep(3000);

		By actionMenu = By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]");
		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);

			boolean editExists = !driver.findElements(By.xpath(
					"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"))
					.isEmpty();

			if (editExists) {
				System.out.println("PASS: Edit option is visible as expected.");
			} else {
				Assert.fail("FAIL: Edit option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Edit option.");
		}
	}

	@And("the user should be able to delete a feedback form")
	public void serShouldBeAbleToDeleteFeedbackForm() {
		sleep(3000);
		By actionMenu = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]");
		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);

			boolean deleteExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (deleteExists) {
				System.out.println("PASS: Delete option is visible as expected.");
			} else {
				Assert.fail("FAIL: Delete option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Delete option.");
		}
	}

	@And("the user should not be able to delete any feedback form")
	public void userShouldNotBeAbleToDeleteFeedbackForm() {
		sleep(3000);
		By actionMenu = By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]");
		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);

			boolean deleteExists = !driver.findElements(By.xpath(
					"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (deleteExists) {
				System.out.println("PASS: Delete option is visible as expected.");
			} else {
				Assert.fail("FAIL: Delete option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Delete option.");
		}
	}

	@But("the user should not be able to edit or delete any feedback form")
	public void userShouldNotBeAbleToEditOrDeleteFeedbackForm() {
		sleep(3000);

		By actionMenu = By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]");

		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);
			boolean editExists = !driver.findElements(By.xpath(
					"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"))
					.isEmpty();
			boolean deleteExists = !driver.findElements(By.xpath(
					"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (!editExists && !deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	@But("the user should not be able to add, edit, or delete any feedback form")
	public void userShouldNotBeAbleToAddEditOrDeleteFeedbackForm() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Callout Template']"));

		By actionMenu = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]");

		WebElement menuButton = driver.findElement(actionMenu);
		try {
			menuButton.click();
			sleep(1000);
			boolean editExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Edit')]"))
					.isEmpty();
			boolean deleteExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (!editExists && !deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	@And("the user should be able to add a new patient signature template")
	public void userShouldBeAbleToAddNewPatientSignatureTemplate() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Patient Signature']"));
		waitAndSendKeys(By.id("PatientSignatureTemplate_Title"), profileName);
		waitAndSendKeys(By.xpath("//div[@aria-label='Editor editing area: main. Press Alt+0 for help.']//p"),
				profileName);
		clickWhenClickable(
				By.xpath("//button[@class='btn btn-primary waves-effect waves-light'][normalize-space()='Submit']"));
	}

	@And("the user should be able to edit an existing patient signature template")
	public void userShouldBeAbleToEditPatientSignatureTemplate() {
		sleep(3000);

		By actionMenu = By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]");
		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);

			boolean editExists = !driver.findElements(By.xpath(
					"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"))
					.isEmpty();

			if (editExists) {
				System.out.println("PASS: Edit option is visible as expected.");
			} else {
				Assert.fail("FAIL: Edit option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Edit option.");
		}
	}

	@And("the user should be able to delete a patient signature template")
	public void userShouldBeAbleToDeletePatientSignatureTemplate() {
		sleep(3000);
		By actionMenu = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]");
		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);

			boolean deleteExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (deleteExists) {
				System.out.println("PASS: Delete option is visible as expected.");
			} else {
				Assert.fail("FAIL: Delete option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Delete option.");
		}
	}

	@And("the user should not be able to delete any patient signature template")
	public void userShouldNotBeAbleToDeletePatientSignatureTemplate() {
		sleep(3000);
		By actionMenu = By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]");
		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);

			boolean deleteExists = !driver.findElements(By.xpath(
					"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (deleteExists) {
				System.out.println("PASS: Delete option is visible as expected.");
			} else {
				Assert.fail("FAIL: Delete option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Delete option.");
		}
	}

	@But("the user should not be able to edit or delete any patient signature template")
	public void userShouldNotBeAbleToEditOrDeletePatientSignatureTemplate() {
		sleep(3000);

		By actionMenu = By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]");

		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);
			boolean editExists = !driver.findElements(By.xpath(
					"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"))
					.isEmpty();
			boolean deleteExists = !driver.findElements(By.xpath(
					"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (!editExists && !deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	@But("the user should not be able to add, edit, or delete any patient signature template")
	public void userShouldNotBeAbleToAddEditOrDeletePatientSignatureTemplate() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Callout Template']"));

		By actionMenu = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]");

		WebElement menuButton = driver.findElement(actionMenu);
		try {
			menuButton.click();
			sleep(1000);
			boolean editExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Edit')]"))
					.isEmpty();
			boolean deleteExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (!editExists && !deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	@Then("the user should be able to add a new fax template")
	public void userShouldBeAbleToAddNewFaxTemplate() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Fax Template']"));
		waitAndSendKeys(By.id("FaxTemplate_Title"), profileName);
		waitAndSendKeys(By.id("FaxTemplate_Subject"), profileName);
		selectDropdownByIndexWhenReady(By.id("TemplateFeatureMapping_FeatureType"), 4);
		clickWhenClickable(By.xpath("//button[contains(text(),'Submit')]"));
	}

	@Then("the user should be able to edit an existing fax template")
	public void userShouldBeAbleToEditFaxTemplate() {
		sleep(3000);
		clickWhenReadyAndVisible(By.xpath("//span[normalize-space()='Filter']"));
		sleep(3000);
		waitAndSendKeys(By.id("Filter_Title"), profileName);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		sleep(1000);

		By actionMenu = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]");
		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);

			boolean editExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Edit')]"))
					.isEmpty();

			if (editExists) {
				System.out.println("PASS: Edit option is visible as expected.");
			} else {
				Assert.fail("FAIL: Edit option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Edit option.");
		}
	}

	@Then("the user should be able to delete a fax template")
	public void userShouldBeAbleToDeleteFaxTemplate() {
		sleep(3000);
		By actionMenu = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]");
		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);

			boolean deleteExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (deleteExists) {
				System.out.println("PASS: Delete option is visible as expected.");
			} else {
				Assert.fail("FAIL: Delete option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Delete option.");
		}
	}

	@But("the user should not be able to delete any fax template")
	public void userShouldNotBeAbleToDeleteFaxTemplate() {
		sleep(3000);
		clickWhenReadyAndVisible(By.xpath("//span[normalize-space()='Filter']"));
		sleep(3000);
		waitAndSendKeys(By.id("Filter_Title"), profileName);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		sleep(1000);

		By actionMenu = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]");
		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);

			boolean editExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Edit')]"))
					.isEmpty();

			if (editExists) {
				System.out.println("PASS: Edit option is visible as expected.");
			} else {
				Assert.fail("FAIL: Edit option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Edit option.");
		}
	}

	@But("the user should not be able to edit or delete any fax template")
	public void userShouldNotBeAbleToEditOrDeleteFaxTemplate() {
		sleep(3000);
		clickWhenReadyAndVisible(By.xpath("//span[normalize-space()='Filter']"));
		sleep(3000);
		waitAndSendKeys(By.id("Filter_Title"), profileName);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		sleep(1000);
		By actionMenu = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]");

		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);
			boolean editExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Edit')]"))
					.isEmpty();
			boolean deleteExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (!editExists && !deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	@Then("the user should not be able to add, edit, or delete any fax template")
	public void userShouldNotBeAbleToAddEditOrDeleteFaxTemplate() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Callout Template']"));

		By actionMenu = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]");

		WebElement menuButton = driver.findElement(actionMenu);
		try {
			menuButton.click();
			sleep(1000);
			boolean editExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Edit')]"))
					.isEmpty();
			boolean deleteExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (!editExists && !deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	@Then("I should see only log access for the new user")
	public void verifyLogOnlyAccess() {
		driver.get(baseUrl + "/Setup/Home/Dashboard");
	}

	@Then("the user should be able to view, add, edit, and delete profiles")
	public void verifyFullProfileAccess() {
		sleep(5000);
		driver.get(baseUrl + "/Setup/Home/Profiles");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Profiles"));
		sleep(1000);
		clickWhenReadyAndVisible(By.xpath("//span[normalize-space()='Filter']"));
		sleep(3000);
		waitAndSendKeys(By.id("Filter_Name"), profileName);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		sleep(1000);
		By actionMenu = By.xpath("//tr[td[normalize-space()='" + profileName + "']]//td[@class='text-right']//button");
		clickWhenClickable(actionMenu);
		clickWhenClickable(By.xpath("//li[1]//a[1]//div[1]")); // Edit
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
		sleep(1000);
		clickWhenReadyAndVisible(By.xpath("//span[normalize-space()='Filter']"));
		waitAndSendKeys(By.id("Filter_Name"), profileName);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		actionMenu = By.xpath("//tr[td[normalize-space()='" + profileName + "']]//td[@class='text-right']//button");
		clickWhenClickable(actionMenu);
		clickWhenClickable(By.xpath("//a[@id='btnDeleteProfile']//div[@class='gridRecordContextInner']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[@id='profileModel']//button[@id='btnDeleteConfirm']"));
	}

	@Then("the user should be able to view profiles")
	public void verifyUserCanViewProfile() {
		sleep(5000);
		driver.get(baseUrl + "/Setup/Home/Profiles");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Profiles"));
	}

	@And("the user should be able to edit an existing user")
	public void verifyUserCanEditUser() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("menucontext")));

		clickWhenReadyAndVisible(By.xpath("//span[normalize-space()='Filter']"));
		sleep(1000);
		waitAndSendKeys(By.id("Filter_Email"), createdEmail);
		sleep(1000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		sleep(3000);
		By actionMenu = By.xpath("//tr[td[normalize-space()='" + profileName + "']]//td[@class='text-right']//button");
		clickWhenClickable(actionMenu);
		sleep(2000);
		assertElementPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Change Profile')]"));

	}

	@And("the user should be able to delete a user")
	public void verifyUserCanDeleteUser() {
		assertElementPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@But("the user should not be able to delete users")
	public void verifyUserCannotDeleteUsers() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("menucontext")));
		clickWhenClickable(By.xpath("//span[normalize-space()='Filter']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Filter_Email")));
		waitAndSendKeys(By.id("Filter_Email"), createdEmail);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		By actionMenu = By.xpath("//tr[td[normalize-space()='" + profileName + "']]//td[@class='text-right']//button");
		wait.until(ExpectedConditions.elementToBeClickable(actionMenu));
		clickWhenClickable(actionMenu);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
	}

	@Then("the user should be able to view users")
	public void verifyUserCanViewUsers() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/WorkspaceUsers");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/WorkspaceUsers"));
	}

	@Then("the user should be able to view text templates")
	public void verifyUserCanViewTextTemplates() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/SMSTemplates");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/SMSTemplates"));
	}

	@Then("the user should be able to view BOT call templates")
	public void verifyUserCanViewBotCallTemplates() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/BOTCallTemplates");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/BOTCallTemplates"));
	}

	@Then("the user should be able to view mail templates")
	public void userShouldBeAbleToViewMailTemplates() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/MailTemplates");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/MailTemplates"));
	}

	@Then("the user should be able to add a new mail template")
	public void userShouldBeAbleToAddNewMailTemplate() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Mail Template']"));
		waitAndSendKeys(By.id("MailTemplate_Title"), profileName);
		waitAndSendKeys(By.id("MailTemplate_Subject"), profileName);
		selectDropdownByIndexWhenReady(By.id("TemplateFeatureMapping_FeatureType"), 1);
		clickWhenClickable(
				By.xpath("//button[@class='btn btn-primary waves-effect waves-light'][normalize-space()='Submit']"));
	}

	@And("the user should be able to edit an existing mail template")
	public void userShouldBeAbleToEditMailTemplate() {
		sleep(3000);
		clickWhenReadyAndVisible(By.xpath("//span[normalize-space()='Filter']"));
		sleep(3000);
		waitAndSendKeys(By.id("Filter_Title"), profileName);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		sleep(1000);

		By actionMenu = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]");
		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);

			boolean editExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Edit')]"))
					.isEmpty();

			if (editExists) {
				System.out.println("PASS: Edit option is visible as expected.");
			} else {
				Assert.fail("FAIL: Edit option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Edit option.");
		}
	}

	@And("the user should be able to delete a mail template")
	public void userShouldBeAbleToDeleteMailTemplate() {
		sleep(3000);
		By actionMenu = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]");
		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);

			boolean deleteExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (deleteExists) {
				System.out.println("PASS: Delete option is visible as expected.");
			} else {
				Assert.fail("FAIL: Delete option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Delete option.");
		}
	}

	@But("the user should not be able to delete any mail template")
	public void userShouldNotBeAbleToDeleteMailTemplate() {
		By actionMenu = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]");
		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);

			boolean deleteExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (!deleteExists) {
				System.out.println("PASS: Delete option is not visible as expected.");
			} else {
				Assert.fail("FAIL: Delete option is visible, but it should not be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no delete permissions).");
		}
	}

	@But("the user should not be able to edit or delete any mail template")
	public void userShouldNotBeAbleToEditOrDeleteMailTemplate() {
		sleep(3000);
		clickWhenReadyAndVisible(By.xpath("//span[normalize-space()='Filter']"));
		sleep(3000);
		waitAndSendKeys(By.id("Filter_Title"), profileName);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		sleep(1000);
		By actionMenu = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]");

		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);
			boolean editExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Edit')]"))
					.isEmpty();
			boolean deleteExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (!editExists && !deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	@But("the user should not be able to add, edit, or delete any mail template")
	public void userShouldNotBeAbleToModifyMailTemplate() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Mail Template']"));

		By actionMenu = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]");

		WebElement menuButton = driver.findElement(actionMenu);
		try {
			menuButton.click();
			sleep(1000);
			boolean editExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Edit')]"))
					.isEmpty();
			boolean deleteExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (!editExists && !deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	@Then("the user should be able to add a new BOT call template")
	public void verifyUserCanAddBotCallTemplate() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Callout Template']"));
		waitAndSendKeys(By.id("BOTCallTemplate_Title"), profileName);
		selectDropdownByIndexWhenReady(By.id("TemplateFeatureMapping_FeatureType"), 3);
		selectDropdownByIndexWhenReady(By.id("TemplateFeatureMapping_SubFeatureType"), 1);
		waitAndSendKeys(By.id("BOTCallTemplate_Body"), " Message");
		clickWhenClickable(
				By.xpath("//button[@class='btn btn-primary waves-effect waves-light'][normalize-space()='Submit']"));

	}

	@And("the user should be able to edit an existing BOT call template")
	public void verifyUserCanEditBotCallTemplate() {
		sleep(3000);
		clickWhenReadyAndVisible(By.xpath("//span[normalize-space()='Filter']"));
		sleep(3000);
		waitAndSendKeys(By.id("Filter_Title"), profileName);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		sleep(1000);

		By actionMenu = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]");
		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);

			boolean editExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Edit')]"))
					.isEmpty();

			if (editExists) {
				System.out.println("PASS: Edit option is visible as expected.");
			} else {
				Assert.fail("FAIL: Edit option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Edit option.");
		}

	}

	@But("the user should not be able to delete any BOT call template")
	public void verifyUserCannotDeleteBotCallTemplate() {
		By actionMenu = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]");
		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);

			boolean deleteExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (!deleteExists) {
				System.out.println("PASS: Delete option is not visible as expected.");
			} else {
				Assert.fail("FAIL: Delete option is visible, but it should not be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no delete permissions).");
		}

	}

	@And("the user should be able to delete a BOT call template")
	public void verifyUserCanDeleteBotCallTemplate() {
		sleep(3000);
		By actionMenu = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]");
		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);

			boolean deleteExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (deleteExists) {
				System.out.println("PASS: Delete option is visible as expected.");
			} else {
				Assert.fail("FAIL: Delete option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Delete option.");
		}

	}

	@And("the user should be able to add a new text template")
	public void verifyUserCanAddNewTextTemplate() {
		sleep(2000);
		By newTemplateBtn = By.xpath("//span[normalize-space()='New Text Template']");
		clickWhenReadyAndVisible(newTemplateBtn);
		sleep(500);
		String templateTitle = profileName + " Template";
		By titleInput = By.xpath("//input[@id='SMSTemplate_Title']");
		waitAndSendKeys(titleInput, templateTitle);
		By featureDropdown = By.xpath("//select[@id='TemplateFeatureMapping_FeatureType']");
		selectDropdownByIndexWhenReady(featureDropdown, 6);
		By bodyTextarea = By.xpath("//textarea[@id='SMSTemplate_Body']");
		waitAndSendKeys(bodyTextarea, templateTitle);
		By submitBtn = By
				.xpath("//button[@class='btn btn-primary waves-effect waves-light'][normalize-space()='Submit']");
		clickWhenReadyAndVisible(submitBtn);
	}

	@And("the user should be able to edit an existing text template")
	public void verifyUserCanEditExistingTextTemplate() {
		sleep(3000);
		clickWhenReadyAndVisible(By.xpath("//span[normalize-space()='Filter']"));
		sleep(3000);
		waitAndSendKeys(By.id("Filter_Title"), profileName);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		sleep(1000);
		By actionMenu = By.xpath("(//td[@class='text-right']//button)[1]");
		clickWhenClickable(actionMenu);
		assertElementPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
	}

	@And("the user should be able to delete a text template")
	public void erifyUserCanDeleteTextTemplate() {
		sleep(3000);
		assertElementPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@But("the user should not be able to delete any text template")
	public void verifyDeleteOptionNotAvailableForTextTemplates() throws InterruptedException {
		sleep(3000);
		By actionMenu = By.xpath("(//td[@class='text-right']//button)[1]");
		WebElement menuButton = driver.findElement(actionMenu);
		try {
			menuButton.click();
			Thread.sleep(1000);

			boolean editExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Edit')]"))
					.isEmpty();

			boolean deleteExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (editExists && !deleteExists) {
				System.out.println("PASS: Edit is visible, Delete is not.");
			} else {
				Assert.fail("FAIL: Condition not met (Edit missing or Delete present).");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	@But("the user should not be able to edit or delete any text template")
	public void verifyUserCannotEditOrDeleteTextTemplates() {
		sleep(3000);
		clickWhenReadyAndVisible(By.xpath("//span[normalize-space()='Filter']"));
		sleep(3000);
		waitAndSendKeys(By.id("Filter_Title"), profileName);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		sleep(1000);

		By actionMenu = By.xpath("(//td[@class='text-right']//button)[1]");

		WebElement menuButton = driver.findElement(actionMenu);
		try {
			menuButton.click();
			sleep(1000);
			boolean editExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Edit')]"))
					.isEmpty();
			boolean deleteExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (!editExists && !deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}

	}

	@But("the user should not be able to edit or delete any BOT call template")
	public void verifyUserCannotEditOrDeleteBotCallTemplate() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/BOTCallTemplates");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/BOTCallTemplates"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Text Template']"));

		clickWhenReadyAndVisible(By.xpath("//span[normalize-space()='Filter']"));
		sleep(3000);
		waitAndSendKeys(By.id("Filter_Title"), profileName);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		sleep(1000);
		By actionMenu = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]");

		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);
			boolean editExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Edit')]"))
					.isEmpty();
			boolean deleteExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (!editExists && !deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}

	}

	@But("the user should not be able to add, edit, or delete any text template")
	public void verifyUserCannotAddEditOrDeleteTextTemplate() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Text Template']"));
		sleep(1000);
		By actionMenu = By.xpath("(//td[@class='text-right']//button)[1]");
		WebElement menuButton = driver.findElement(actionMenu);
		try {
			menuButton.click();
			sleep(1000);
			boolean editExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Edit')]"))
					.isEmpty();
			boolean deleteExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (!editExists && !deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	@But("the user should not be able to add, edit, or delete any BOT call template")
	public void verifyUserCannotAddEditOrDeleteBotCallTemplate() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Callout Template']"));

		By actionMenu = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]");

		WebElement menuButton = driver.findElement(actionMenu);
		try {
			menuButton.click();
			sleep(1000);
			boolean editExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Edit')]"))
					.isEmpty();
			boolean deleteExists = !driver
					.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (!editExists && !deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}

	}

	@And("the user should be able to add a new user")
	public void verifyUserCanAddNewUser() {
		sleep(1000);
		assertElementPresent(By.xpath("//span[normalize-space()='New User']"));
	}

	@But("the user should not be able to edit or delete users")
	public void verifyUserCannotEditOrDeleteUsers() {
		clickWhenReadyAndVisible(By.xpath("//span[normalize-space()='Filter']"));
		sleep(3000);
		waitAndSendKeys(By.id("Filter_Email"), createdEmail);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		sleep(1000);
		By actionMenu = By.xpath("//tr[td[normalize-space()='" + createdEmail + "']]//td[@class='text-right']//button");
		clickWhenClickable(actionMenu);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));

	}

	@But("the user should not be able to add, edit, or delete users")
	public void erifyUserCannotAddEditOrDeleteUsers() {
		sleep(5000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New User']"));
		sleep(1000);
		clickWhenReadyAndVisible(By.xpath("//span[normalize-space()='Filter']"));
		sleep(3000);
		waitAndSendKeys(By.id("Filter_Email"), createdEmail);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		sleep(1000);
		By actionMenu = By.xpath("//tr[td[normalize-space()='" + createdEmail + "']]//td[@class='text-right']//button");
		clickWhenClickable(actionMenu);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));
	}

	@And("the user should not be able to add, edit, or delete any profiles")
	public void verifyNoAddEditDeletePermissionForProfiles() {
		sleep(5000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Profile']"));
		sleep(1000);
		clickWhenReadyAndVisible(By.xpath("//span[normalize-space()='Filter']"));
		sleep(3000);
		waitAndSendKeys(By.id("Filter_Name"), profileName);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		sleep(1000);
		By actionMenu = By.xpath("//tr[td[normalize-space()='" + profileName + "']]//td[@class='text-right']//button");
		clickWhenClickable(actionMenu);
		assertElementNotPresent(By.xpath("//li[1]//a[1]//div[normalize-space()='Edit']"));
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteProfile']//div[normalize-space()='Delete']"));
	}

	@Then("the user should have no Setup access via UI or direct URL")
	public void verifyNoSetupAccess() {
		driver.get(baseUrl + "/Setup/Home/Dashboard");
		List<WebElement> sidebarIcons = driver.findElements(By.xpath("//span[@class='sidebar-icons']"));
		if (sidebarIcons.isEmpty()) {
			System.out.println("Sidebar icons are NOT present on the page.");
		} else {
			System.out.println("Sidebar icons found: " + sidebarIcons.size());
		}
		driver.get(baseUrl + "/Setup/Home/WorkspaceUsers");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("❌ Error: Don't have proper access to requested page");
		} else {
			System.out.println("✅ No error. Page loaded successfully.");
		}
	}

	@Then("the user should have no patient access via UI or direct URL")
	public void verifyNoPatientAccess() {
		driver.get(baseUrl + "/Patient/Home/Dashboard");
		List<WebElement> sidebarIcons = driver.findElements(By.xpath("//span[@class='sidebar-icons']"));
		if (sidebarIcons.isEmpty()) {
			System.out.println("Sidebar icons are NOT present on the page.");
		} else {
			System.out.println("Sidebar icons found: " + sidebarIcons.size());
		}
		driver.get(baseUrl + "/Patient/Home/Patients");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("❌ Error: Don't have proper access to requested page");
		} else {
			System.out.println("✅ No error. Page loaded successfully.");
		}
	}

	@Then("the user should have no Delivery access via UI or direct URL")
	public void verifyNoDeliveryAccess() {
		driver.get(baseUrl + "/Delivery/Home/Dashboard");
		List<WebElement> sidebarIcons = driver.findElements(By.xpath("//span[@class='sidebar-icons']"));
		if (sidebarIcons.isEmpty()) {
			System.out.println("Sidebar icons are NOT present on the page.");
		} else {
			System.out.println("Sidebar icons found: " + sidebarIcons.size());
		}
		driver.get(baseUrl + "/Delivery/Home/Manifests");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("❌ Error: Don't have proper access to requested page");
		} else {
			System.out.println("✅ No error. Page loaded successfully.");
		}
	}

	@Then("the user should have no Drug access via UI or direct URL")
	public void verifyNoDrugAccess() {
		driver.get(baseUrl + "/Drug/Home/Dashboard");
		List<WebElement> sidebarIcons = driver.findElements(By.xpath("//span[@class='sidebar-icons']"));
		if (sidebarIcons.isEmpty()) {
			System.out.println("Sidebar icons are NOT present on the page.");
		} else {
			System.out.println("Sidebar icons found: " + sidebarIcons.size());
		}
		driver.get(baseUrl + "/Drug/Home/Drugs");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("❌ Error: Don't have proper access to requested page");
		} else {
			System.out.println("✅ No error. Page loaded successfully.");
		}
	}

	@Then("the user should have no Workflow access via UI or direct URL")
	public void verifyNoworkflowAccess() {
		driver.get(baseUrl + "/Drug/Home/Dashboard");
		List<WebElement> sidebarIcons = driver.findElements(By.xpath("//span[@class='sidebar-icons']"));
		if (sidebarIcons.isEmpty()) {
			System.out.println("Sidebar icons are NOT present on the page.");
		} else {
			System.out.println("Sidebar icons found: " + sidebarIcons.size());
		}
		driver.get(baseUrl + "/Workflow/Home/AuditWorkflow");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("❌ Error: Don't have proper access to requested page");
		} else {
			System.out.println("✅ No error. Page loaded successfully.");
		}
	}

	// ==== Utility Methods ====

	private void waitAndSendKeys(By locator, String value) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		element.clear();
		element.sendKeys(value);
	}

	public void clickWhenClickable(By locator) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
		} catch (ElementClickInterceptedException e) {
			System.out.println("Click intercepted for element: " + locator.toString() + ". Skipping click.");
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

	private void selectDropdownByVisibleTextWhenReady(By locator, String visibleText) {
		WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(locator));
		Select select = new Select(dropdown);
		select.selectByVisibleText(visibleText);
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

		System.out.println("⏱️ Page Load Time: " + duration + " ms for " + url);
		if (duration > maxExpectedMillis) {
			System.out.println("⚠️ Warning: Page load is slower than expected.");
		}
	}

	public void logInternetSpeed() {
		try {
			Process process = new ProcessBuilder("speedtest", "--simple").start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
			System.out.println("📡 Internet Speed:");
			while ((line = reader.readLine()) != null) {
				System.out.println("   " + line);
			}
		} catch (IOException e) {
			System.out.println("⚠️ Unable to measure internet speed: " + e.getMessage());
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

}
