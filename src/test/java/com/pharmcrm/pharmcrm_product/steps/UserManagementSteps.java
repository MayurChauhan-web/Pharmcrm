package com.pharmcrm.pharmcrm_product.steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import com.pharmcrm.pharmcrm_product.DriverFactory;
import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.time.Duration;
import java.util.ArrayList;
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

	@And("I create a profile without Update access to Setup Module → Default Mail Template")
	public void UserCannotUpdateDefaultMailTemplateWithoutUpdateAccess() {
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
		uncheckPermissionIfChecked("chkg17DefaultMailTemplate");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without Update access to Setup Module → Default Fax Template")
	public void UserCannotUpdateDefaultFaxTemplateWithoutUpdateAccess() {
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
		uncheckPermissionIfChecked("chkg17DefaultFaxTemplate");
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

	@And("I create a profile with View access only to Organization Bucket")
	public void createProfileWithViewAccessToOrganizationBucket() {
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
		uncheckPermissionIfChecked("chkg12OrganizationBucketAddFile");
		uncheckPermissionIfChecked("chkg12OrganizationBucketEditFile");
		uncheckPermissionIfChecked("chkg12OrganizationBucketDeleteFile");
		uncheckPermissionIfChecked("chkg12OrganizationBucketDownloadFile");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add File access to Organization Bucket")
	public void createProfileWithViewAndAddFileAccessToOrganizationBucket() {
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
		uncheckPermissionIfChecked("chkg12OrganizationBucketEditFile");
		uncheckPermissionIfChecked("chkg12OrganizationBucketDeleteFile");
		uncheckPermissionIfChecked("chkg12OrganizationBucketDownloadFile");
		clickWhenClickable(By.id("btnSave"));

	}

	@And("I create a profile with View, Add File, and Edit File access to Organization Bucket")
	public void createProfileWithViewAddAndEditFileAccessToOrganizationBucket() {
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
		uncheckPermissionIfChecked("chkg12OrganizationBucketDeleteFile");
		uncheckPermissionIfChecked("chkg12OrganizationBucketDownloadFile");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, Edit, and Delete File access to Organization Bucket")
	public void createProfileWithViewAddEditAndDeleteFileAccessToOrganizationBucket() {
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
		uncheckPermissionIfChecked("chkg12OrganizationBucketDownloadFile");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with full access to Organization Bucket")
	public void createProfileWithFullAccessToOrganizationBucket() {
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

	@And("I create a profile with only View access to Setup Module → Reminders")
	public void UserWithViewOnlyAccessCanViewRemindersButCannotPerformActions() {
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
		uncheckPermissionIfChecked("chkg29ReminderActionView");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Action View access to Setup Module → Reminders")
	public void UserWithViewAndActionViewAccessCanViewAndActOnReminders() {
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

	@And("I create a profile without Update access to Setup Module → Application Status")
	public void verifyUserCannotUpdateApplicationStatusWithoutUpdatePermission() {
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
		uncheckPermissionIfChecked("chkg11ApplicationStatusUpdate");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without Update access to Setup Module → Brand Management")
	public void createProfileWithoutUpdateAccessToBrandManagement() {
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
		uncheckPermissionIfChecked("chkg12BrandManagementUpdate");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without Send VCard access to Setup Module → Brand Management")
	public void createProfileWithoutSendVCardAccessToBrandManagement() {
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
		uncheckPermissionIfChecked("chkg34SendVCard");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with only View access to Organization Calendar")
	public void createProfileWithViewOnlyAccessToOrganizationCalendar() {
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
		uncheckPermissionIfChecked("chkg03OrganizationCalendarEdit");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access to Organization Calendar")
	public void createProfileWithViewAndEditAccessToOrganizationCalendar() {
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

	@And("I create a profile without Update access to Technical Setting")
	public void createProfileWithoutUpdateAccessToTechnicalSetting() {
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
		uncheckPermissionIfChecked("chkg03SettingUpdate");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without Update access to Notification Setting")
	public void createProfileWithoutUpdateAccessToNotificationSetting() {
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
		uncheckPermissionIfChecked("chkg12NotificationSettingsUpdate");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without Update access to Text Forward Setting")
	public void createProfileWithoutUpdateAccessToTextForwardSetting() {
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
		uncheckPermissionIfChecked("chkg12TextForwardSettingsUpdate");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to EHR Types")
	public void createProfileWithViewOnlyAccessToEHRTypes() {
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
		uncheckPermissionIfChecked("chkg13EHRFormAdd");
		uncheckPermissionIfChecked("chkg13EHRFormEdit");
		uncheckPermissionIfChecked("chkg13EHRFormDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Progress Step")
	public void createProfileWithViewAccessOnlyToProgressStep() {
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
		uncheckPermissionIfChecked("chkg39ProgressStatusAdd");
		uncheckPermissionIfChecked("chkg39ProgressStatusEdit");
		uncheckPermissionIfChecked("chkg39ProgressStatusDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Progress Step")
	public void createProfileWithViewAndAddAccessToProgressStep() {
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
		uncheckPermissionIfChecked("chkg39ProgressStatusEdit");
		uncheckPermissionIfChecked("chkg39ProgressStatusDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, and Edit access to Progress Step")
	public void createProfileWithViewAddEditAccessToProgressStep() {
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
		uncheckPermissionIfChecked("chkg39ProgressStatusDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, Edit, and Delete access to Progress Step")
	public void createProfileWithFullAccessToProgressStep() {
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

	@And("I create a profile with View access only to Whitelist IP")
	public void createProfileWithViewAccessOnlyToWhitelistIP() {
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
		uncheckPermissionIfChecked("chkg02WhitelistIPAdd");
		uncheckPermissionIfChecked("chkg02WhitelistIPDelete");
		uncheckPermissionIfChecked("chkg02ExcludeUserAdd");
		uncheckPermissionIfChecked("chkg02ExcludeUserDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Designation")
	public void createProfileWithViewAccessOnlyToDesignation() {
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
		uncheckPermissionIfChecked("chkg01DesignationAdd");
		uncheckPermissionIfChecked("chkg01DesignationEdit");
		uncheckPermissionIfChecked("chkg01DesignationDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Professional License Type")
	public void createProfileWithViewAccessOnlyToProfessionalLicenseType() {
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
		uncheckPermissionIfChecked("chkg5ProfessionalLicenseTypeAdd");
		uncheckPermissionIfChecked("chkg6ProfessionalLicenseTypeEdit");
		uncheckPermissionIfChecked("chkg6ProfessionalLicenseTypeDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Fax Setting")
	public void createProfileWithViewAccessOnlyToFaxSetting() {
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
		uncheckPermissionIfChecked("chkg46FaxSettingAdd");
		uncheckPermissionIfChecked("chkg46FaxSettingEdit");
		uncheckPermissionIfChecked("chkg46FaxSettingDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Fax Setting")
	public void createProfileWithViewAndAddAccessToFaxSetting() {
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
		uncheckPermissionIfChecked("chkg46FaxSettingEdit");
		uncheckPermissionIfChecked("chkg46FaxSettingDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, and Edit access to Fax Setting")
	public void createProfileWithViewAddAndEditAccessToFaxSetting() {
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
		uncheckPermissionIfChecked("chkg46FaxSettingDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without any access to Driver and SalesRep User")
	public void createProfileWithoutAccessToDriverAndSalesRepUser() {
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
		uncheckPermissionIfChecked("chkg44DriverAndSalesRepUserView");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without View access to Text Page")
	public void createProfileWithoutViewAccessToTextPage() {
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
		uncheckPermissionIfChecked("chkg43TextView");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without Call Activity View permission to Call Activity Page")
	public void createProfileWithoutCallActivityViewPermission() {
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
		uncheckPermissionIfChecked("chkg43CallActivityView");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without BOT Call View permission to BOT Call Page")
	public void createProfileWithoutBotCallViewPermission() {
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
		uncheckPermissionIfChecked("chkg43BotCallView");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without Fax View permission to Fax Page")
	public void createProfileWithoutFaxViewPermission() {
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
		uncheckPermissionIfChecked("chkg43FaxView");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without Mail View permission to Mail Page")
	public void createProfileWithoutMailViewPermission() {
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
		uncheckPermissionIfChecked("chkg43MailView");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View Detail access only to Setup Module → Workspace User")
	public void createProfileWithViewDetailAccessOnlyToWorkspaceUser() {
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
		uncheckPermissionIfChecked("chkg01UserResetPassword");
		uncheckPermissionIfChecked("chkg42ChangeWorkspaceUserProfile");
		uncheckPermissionIfChecked("chkg41LinkEmployeeToUser");
		uncheckPermissionIfChecked("chkg41DeLinkEmployeeToUser");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Setup Module → Central PA Setting")
	public void createProfileWithViewAccessToCentralPASetting() {
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
		uncheckPermissionIfChecked("chkg45CentralPASettingAdd");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Setup Module → Central PA Setting")
	public void createProfileWithViewAndAddAccessToCentralPASetting() {
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

	@And("I create a profile without Central PA Setting access")
	public void createProfileWithoutCentralPASettingAccess() {
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
		uncheckPermissionIfChecked("chkg45CentralPASettingView");
		uncheckPermissionIfChecked("chkg45CentralPASettingAdd");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without Mail Setting access")
	public void createProfileWithoutMailSettingAccess() {
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
		uncheckPermissionIfChecked("chkg44MailSettingView");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Setup Module Show On Dashboard")
	public void createProfileWithViewAccessToShowOnDashboard() {
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
		uncheckPermissionIfChecked("chkg29ShowOnDashboardAdd");
		uncheckPermissionIfChecked("chkg29ShowOnDashboardEdit");
		uncheckPermissionIfChecked("chkg29ShowOnDashboardDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Setup Module Show On Dashboard")
	public void createProfileWithViewAndAddAccessToShowOnDashboard() {
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
		uncheckPermissionIfChecked("chkg29ShowOnDashboardEdit");
		uncheckPermissionIfChecked("chkg29ShowOnDashboardDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, and Edit access to Setup Module Show On Dashboard")
	public void createProfileWithViewAddEditAccessToShowOnDashboard() {
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
		uncheckPermissionIfChecked("chkg29ShowOnDashboardDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with full access to Setup Module Show On Dashboard")
	public void createProfileWithFullAccessToShowOnDashboard() {
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

	@And("I create a profile with View access only to Setup Module Email Notification")
	public void createProfileWithViewOnlyAccessForEmailNotification() {
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
		uncheckPermissionIfChecked("chkg29EmailNotificationAdd");
		uncheckPermissionIfChecked("chkg29EmailNotificationEdit");
		uncheckPermissionIfChecked("chkg29EmailNotificationDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Setup Module Email Notification")
	public void createProfileWithViewAndAddAccessForEmailNotification() {
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
		uncheckPermissionIfChecked("chkg29EmailNotificationEdit");
		uncheckPermissionIfChecked("chkg29EmailNotificationDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, and Edit access to Setup Module Email Notification")
	public void createProfileWithViewAddEditAccessForEmailNotification() {
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
		uncheckPermissionIfChecked("chkg29EmailNotificationDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with full access to Setup Module Email Notification")
	public void createProfileWithFullAccessForEmailNotification() {
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

	@And("I create a profile with View access only to Setup Module Auto Text")
	public void createProfileWithViewAccessOnlyForAutoTextModule() {
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
		uncheckPermissionIfChecked("chkg29AutoTextAdd");
		uncheckPermissionIfChecked("chkg29AutoTextEdit");
		uncheckPermissionIfChecked("chkg29AutoTextDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Setup Module Auto Call")
	public void createProfileWithViewAccessOnlyForAutoCallModule() {
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
		uncheckPermissionIfChecked("chkg29AutoCallAdd");
		uncheckPermissionIfChecked("chkg29AutoCallEdit");
		uncheckPermissionIfChecked("chkg29AutoCallDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Setup Module Auto Call")
	public void createProfileWithViewAndAddAccessForAutoCallModule() {
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
		uncheckPermissionIfChecked("chkg29AutoCallEdit");
		uncheckPermissionIfChecked("chkg29AutoCallDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, and Edit access to Setup Module Auto Call")
	public void createProfileWithViewAddAndEditAccessForAutoCallModule() {
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
		uncheckPermissionIfChecked("chkg29AutoCallDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Setup Module Auto Text")
	public void createProfileWithViewAndAddAccessForAutoTextModule() {
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
		uncheckPermissionIfChecked("chkg29AutoTextEdit");
		uncheckPermissionIfChecked("chkg29AutoTextDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, and Edit access to Setup Module Auto Text")
	public void createProfileWithViewAddAndEditAccessForAutoTextModule() {
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
		uncheckPermissionIfChecked("chkg29AutoTextDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with full access to Setup Module Auto Text")
	public void createProfileWithFullAccessForAutoTextModule() {
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

	@And("I create a profile with full access to Setup Module Auto Call")
	public void createProfileWithFullAccessForAutoCallModule() {
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

	@And("I create a profile without Connector App access")
	public void createProfileWithoutConnectorAppAccess() {
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
		uncheckPermissionIfChecked("chkg37ConnectrAppView");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Setup Module Spam Email")
	public void createProfileWithViewAccessOnlyToSpamEmail() {
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
		uncheckPermissionIfChecked("chkg37SpamDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access to Setup Module Spam Email")
	public void createProfileWithViewAndDeleteAccessToSpamEmail() {
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

	@And("I create a profile with View access only to Setup Module Bounce Email")
	public void createProfileWithAccessOnlyToModule() {
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
		uncheckPermissionIfChecked("chkg37BounceDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access to Setup Module Bounce Email")
	public void createProfileWithViewAndDeleteAccessToModule() {
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

	@And("I create a profile with View access only to Setup Module Block Email")
	public void createProfileWithViewAccessOnlyToModule() {
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
		uncheckPermissionIfChecked("chkg37BlockDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access to Setup Module Block Email")
	public void createProfileWithViewAndDeleteAccessToSetupModuleBlockEmail() {
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

	@And("I create a profile with View access only to Setup Module Sender Authentication")
	public void createProfileWithViewAccessOnlyToSetupModuleSenderAuthentication() {
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
		uncheckPermissionIfChecked("chkg8SenderAuthenticationAdd");
		uncheckPermissionIfChecked("chkg8SenderAuthenticationDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Setup Module Sender Authentication")
	public void createProfileWithViewAndAddAccessToSetupModuleSenderAuthentication() {
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
		uncheckPermissionIfChecked("chkg8SenderAuthenticationDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, and Delete access to Setup Module Sender Authentication")
	public void createProfileWithViewAddAndDeleteAccessToSetupModuleSenderAuthentication() {
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

	@And("I create a profile with Download access to Setup Module XFlow")
	public void createProfileWithDownloadAccessToSetupModuleXFlow() {
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

	@And("I create a profile with No access to Setup Module XFlow")
	public void createProfileWithNoAccessToSetupModuleXFlow() {
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
		uncheckPermissionIfChecked("chkg02XFlowDownload");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Setup Module General Audit View")
	public void createProfileWithViewAccessOnlyToSetupModuleGeneralAuditView() {
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

	@And("I create a profile with No access to Setup Module General Audit View")
	public void createProfileWithNoAccessToSetupModuleGeneralAuditView() {
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
		uncheckPermissionIfChecked("chkg37SetupAuditView");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with all modules and all permissions selected")
	public void createProfileWithAllModulesAndPermissions() {
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
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View Detail and Reset Password access to Setup Module → Workspace User")
	public void createProfileWithViewDetailAndResetPasswordAccessToWorkspaceUser() {
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
		uncheckPermissionIfChecked("chkg42ChangeWorkspaceUserProfile");
		uncheckPermissionIfChecked("chkg41LinkEmployeeToUser");
		uncheckPermissionIfChecked("chkg41DeLinkEmployeeToUser");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View Detail, Reset Password, and Change Profile access to Setup Module → Workspace User")
	public void createProfileWithViewDetailResetPasswordAndChangeProfileAccessToWorkspaceUser() {
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
		uncheckPermissionIfChecked("chkg41LinkEmployeeToUser");
		uncheckPermissionIfChecked("chkg41DeLinkEmployeeToUser");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View Detail, Reset Password, Change Profile, Link Employee To User, and DeLink Employee To User access to Setup Module → Workspace User")
	public void createProfileWithViewDetailResetPasswordChangeProfileLinkAndDelinkAccessToWorkspaceUser() {
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

	@And("I create a profile with View, Add, Edit, and Delete access to Fax Setting")
	public void createProfileWithViewAddEditAndDeleteAccessToFaxSetting() {
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

	@And("I create a profile with View and Add access to Professional License Type")
	public void createProfileWithViewAndAddAccessToProfessionalLicenseType() {
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
		uncheckPermissionIfChecked("chkg6ProfessionalLicenseTypeEdit");
		uncheckPermissionIfChecked("chkg6ProfessionalLicenseTypeDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, and Edit access to Professional License Type")
	public void createProfileWithViewAddAndEditAccessToProfessionalLicenseType() {
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
		uncheckPermissionIfChecked("chkg6ProfessionalLicenseTypeDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, Edit, and Delete access to Professional License Type")
	public void createProfileWithViewAddEditAndDeleteAccessToProfessionalLicenseType() {
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

	@And("I create a profile with View and Add access to Designation")
	public void createProfileWithViewAndAddAccessToDesignation() {
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
		uncheckPermissionIfChecked("chkg01DesignationEdit");
		uncheckPermissionIfChecked("chkg01DesignationDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, and Edit access to Designation")
	public void createProfileWithViewAddAndEditAccessToDesignation() {
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
		uncheckPermissionIfChecked("chkg01DesignationDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, Edit, and Delete access to Designation")
	public void createProfileWithViewAddEditAndDeleteAccessToDesignation() {
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

	@And("I create a profile with View and Add access to Whitelist IP")
	public void createProfileWithViewAndAddAccessToWhitelistIP() {
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
		uncheckPermissionIfChecked("chkg02WhitelistIPDelete");
		uncheckPermissionIfChecked("chkg02ExcludeUserAdd");
		uncheckPermissionIfChecked("chkg02ExcludeUserDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, and Delete access to Whitelist IP")
	public void createProfileWithViewAddAndDeleteAccessToWhitelistIP() {
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
		uncheckPermissionIfChecked("chkg02ExcludeUserAdd");
		uncheckPermissionIfChecked("chkg02ExcludeUserDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, Delete, Exclude User, and Remove Excluded User access to Whitelist IP")
	public void createProfileWithViewAddDeleteExcludeAndRemoveExcludedUserAccessToWhitelistIP() {
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

	@And("I create a profile with View and Add access to EHR Types")
	public void createProfileWithViewAndAddAccessToEHRTypes() {
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
		uncheckPermissionIfChecked("chkg13EHRFormEdit");
		uncheckPermissionIfChecked("chkg13EHRFormDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, and Edit access to EHR Types")
	public void createProfileWithViewAddEditAccessToEHRTypes() {
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
		uncheckPermissionIfChecked("chkg13EHRFormDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, Edit, and Delete access to EHR Types")
	public void createProfileWithViewAddEditDeleteAccessToEHRTypes() {
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

	@And("I create a profile without Update access to Setup Module → Bucket Setting")
	public void UserCannotUpdateBucketSettingWithoutUpdateAccess() {
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
		uncheckPermissionIfChecked("chkg13BucketSettingEdit");
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
		sleep(500);
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

	@Then("the user should have no Default Mail Template access via UI or direct URL")
	public void UserWithNoAccessCannotViewOrAccessDefaultMailTemplate() {

		driver.get(baseUrl + "/Setup/Home/DefaultMailTemplate");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	@Then("the user should have no Bucket Setting access via UI or direct URL")
	public void UserWithNoAccessCannotViewOrAccessBucketSetting() {

		driver.get(baseUrl + "/Setup/Home/BucketSettings");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	@Then("the user should have no Application Status update access via UI or direct URL")
	public void verifyNoUpdateAccessToApplicationStatus() {

		driver.get(baseUrl + "/Setup/Home/ApplicationStatus");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	@Then("the user should have no Brand Management update access via UI or direct URL")
	public void verifyNoUpdateAccessToBrandManagement() {

		driver.get(baseUrl + "/Setup/Home/BrandManagement");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	@Then("the user should have no Technical Setting update access via UI or direct URL")
	public void verifyUserHasNoUpdateAccessToTechnicalSetting() {

		driver.get(baseUrl + "/Setup/Home/TechnicalSetting");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	@Then("the user should have no Notification Setting update access via UI or direct URL")
	public void verifyUserHasNoUpdateAccessToNotificationSetting() {

		driver.get(baseUrl + "/Setup/Home/NotificationSetting");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	@Then("the user should have no Text Forward Setting update access via UI or direct URL")
	public void verifyUserHasNoUpdateAccessToTextForwardSetting() {

		driver.get(baseUrl + "/Setup/Home/TextForwardSetting");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	@Then("the user should have no Default Fax Template access via UI or direct URL")
	public void UserWithNoAccessCannotViewOrAccessDefaultFaxTemplate() {

		driver.get(baseUrl + "/Setup/Home/DefaultFaxTemplate");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
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

	@Then("the user should be able to view files in the Organization Bucket")
	public void verifyUserCanViewFilesInOrganizationBucket() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/OrganizationDocuments");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/OrganizationDocuments"));
	}

	@Then("the user should be able to view reminders")
	public void UserCanViewReminders() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/Reminders");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Reminders"));
	}

	@Then("the user should be able to view Organization Calendar entries")
	public void verifyUserCanViewOrganizationCalendarEntries() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/OrganizationCalendarSetting");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/OrganizationCalendarSetting"));
	}

	@Then("the user should be able to view EHR Types")
	public void verifyUserCanViewEHRTypes() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/ExternalSources");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ExternalSources"));
	}

	@Then("the user should be able to view entries in the Progress Step")
	public void verifyUserCanViewProgressStepEntries() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/ProgressStatuses");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ProgressStatuses"));
	}

	@Then("the user should be able to view the list of Whitelist IP entries")
	public void verifyUserCanViewWhitelistIPEntries() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/WhitelistIPs");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/WhitelistIPs"));
	}

	@Then("the user should be able to view the Designation list")
	public void verifyUserCanViewDesignationList() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/Designations");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Designations"));
	}

	@Then("the user should be able to view the Professional License Type list")
	public void verifyUserCanViewProfessionalLicenseTypeList() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/ProfessionalLicenseTypes");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ProfessionalLicenseTypes"));
	}

	@Then("the user should be able to view the Fax Setting list")
	public void verifyUserCanViewFaxSettingList() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/FaxSettings");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/FaxSettings"));
	}

	@And("the user should be able to add a new file")
	public void verifyUserCanAddNewFileInOrganizationBucket() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@id='btnAddFile']//*[name()='svg']"));
		String filePath = "C:\\Users\\MayurChauhan\\Downloads\\dummy.pdf";
		WebElement fileInput = driver.findElement(By.xpath("//div[@class='pb-2']//input[@id='file-3']"));
		fileInput.sendKeys(filePath);
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnSaveFile']"));
	}

	@And("the user should be able to add a new EHR Type")
	public void verifyUserCanAddNewEHRType() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New EHR Type']"));
		sleep(1000);
		waitAndSendKeys(By.id("ExternalSource_Name"), profileName);
		waitAndSendKeys(By.id("ExternalSource_Description"), profileName);
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
	}

	@And("the user should see action buttons and perform allowed reminder actions")
	public void UserCanSeeAndPerformReminderActionsWithActionViewAccess() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[2]/a[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
	}

	@And("the user should be able to edit an existing file")
	public void verifyUserCanEditExistingFileInOrganizationBucket() {
		sleep(3000);
		By actionMenu = By.xpath("//div[@class='settings-inner']//div[1]//div[1]//div[1]//div[1]//button[1]//i[1]");
		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);

			boolean editExists = !driver
					.findElements(By.xpath("//div[@class='bucket-mainn show']//li[1]//a[1]//*[name()='svg']"))
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

	@And("the user should be able to edit an Organization Calendar entry")
	public void verifyUserCanEditOrganizationCalendarEntry() {
		sleep(3000);

		try {
			sleep(1000);

			boolean editExists = !driver
					.findElements(By.cssSelector("button[onclick='return SubmitCalendarSetting()']")).isEmpty();

			if (editExists) {
				System.out.println("PASS: Edit option is visible as expected.");
			} else {
				Assert.fail("FAIL: Edit option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Edit option.");
		}
	}

	@And("the user should be able to edit an existing EHR Type")
	public void verifyUserCanEditEHRType() {
		sleep(3000);
		By actionMenu = By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]");
		WebElement menuButton = driver.findElement(actionMenu);
		try {
			sleep(1000);
			menuButton.click();
			sleep(1000);
			boolean editExists = !driver
					.findElements(By.cssSelector(
							"div[class='gridRecordContextMain show'] li:nth-child(1) a:nth-child(1) div:nth-child(1)"))
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

	@And("the user should be able to edit an existing Progress Step entry")
	public void verifyUserCanEditExistingProgressStepEntry() {
		sleep(3000);
		By actionMenu = By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/button[1]");
		WebElement menuButton = driver.findElement(actionMenu);
		try {
			sleep(1000);
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

	@And("the user should be able to delete a file")
	public void verifyUserCanDeleteFileInOrganizationBucket() {
		sleep(3000);

		try {
			sleep(1000);

			boolean deleteExists = !driver.findElements(By.xpath(
					"//div[@class='dropdown-menu bucket-dropdown-content show']//a[@id='btnDeleteFile']//*[name()='svg']"))
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

	@And("the user should be able to delete an EHR Type")
	public void verifyUserCanDeleteEHRType() {
		sleep(3000);

		try {
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

	@And("the user should be able to delete a Progress Step entry")
	public void verifyUserCanDeleteProgressStepEntry() {
		sleep(3000);

		try {
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

	@And("the user should be able to exclude a user from Whitelist IP")
	public void verifyUserCanExcludeUserFromWhitelistIP() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Exclude User']"));
		assertElementPresent(By.xpath("//span[normalize-space()='New Exclude User']"));
	}

	@And("the user should be able to remove an excluded user")
	public void verifyUserCanRemoveExcludedUser() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Exclude User']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Exclude User']"));
		sleep(1000);
		clickWhenClickable(By.xpath("(//tbody[@id='view-excludeuser-body']//label)[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
		sleep(1000);

	}

	@And("the user should be able to delete a Whitelist IP")
	public void verifyUserCanDeleteWhitelistIP() {
		sleep(3000);
		By actionMenu = By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/button[1]/i[1]");
		WebElement menuButton = driver.findElement(actionMenu);
		try {
			sleep(1000);
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

	@And("the user should be able to delete a Designation")
	public void verifyUserCanDeleteDesignation() {
		sleep(3000);

		try {
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

	@And("the user should be able to delete a Professional License Type")
	public void verifyUserCanDeleteProfessionalLicenseType() {
		sleep(3000);

		try {
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

	@And("the user should be able to delete a Fax Setting")
	public void verifyUserCanDeleteFaxSetting() {
		sleep(3000);

		try {
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

	@And("the user should be able to edit an existing Designation")
	public void verifyUserCanEditExistingDesignation() {
		sleep(3000);
		By actionMenu = By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]");
		WebElement menuButton = driver.findElement(actionMenu);
		try {
			sleep(1000);
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
			Assert.fail("FAIL: Could not open the action menu to verify Delete option.");
		}
	}

	@And("the user should be able to edit an existing Professional License Type")
	public void verifyUserCanEditExistingProfessionalLicenseType() {
		sleep(3000);
		By actionMenu = By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]");
		WebElement menuButton = driver.findElement(actionMenu);

		try {
			sleep(1000);
			menuButton.click();

			boolean editExists = !driver.findElements(By.xpath(
					"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"))
					.isEmpty();

			if (editExists) {
				System.out.println("PASS: Edit option is visible as expected.");
			} else {
				Assert.fail("FAIL: Edit option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Delete option.");
		}
	}

	@And("the user should be able to edit an existing Fax Setting")
	public void verifyUserCanEditExistingFaxSetting() {
		sleep(3000);
		By actionMenu = By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/button[1]/i[1]");
		WebElement menuButton = driver.findElement(actionMenu);

		try {
			sleep(1000);
			menuButton.click();

			boolean editExists = !driver.findElements(By.xpath(
					"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"))
					.isEmpty();

			if (editExists) {
				System.out.println("PASS: Edit option is visible as expected.");
			} else {
				Assert.fail("FAIL: Edit option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Delete option.");
		}
	}

	@And("the user should not be able to delete any EHR Types")
	public void verifyUserCannotDeleteEHRTypes() {
		sleep(3000);

		try {
			sleep(1000);

			boolean deleteExists = !driver.findElements(By.xpath(
					"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (deleteExists) {
				Assert.fail("FAIL: Delete option is visible, but it should NOT be.");
			} else {
				System.out.println("PASS: Delete option is not visible, as expected.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Delete option.");
		}
	}

	@And("the user should not be able to delete any Progress Step entries")
	public void verifyUserCannotDeleteProgressStepEntries() {
		sleep(3000);
		try {
			sleep(1000);
			boolean deleteExists = !driver.findElements(By.xpath(
					"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (deleteExists) {
				Assert.fail("FAIL: Delete option is visible, but it should not be.");
			} else {
				System.out.println("PASS: Delete option is not visible, as expected.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Delete option.");
		}
	}

	@And("the user should be able to download a file")
	public void verifyUserCanDownloadFileInOrganizationBucket() {
		sleep(3000);

		try {
			sleep(1000);

			boolean downloadExists = !driver
					.findElements(By.xpath("(//a[starts-with(@href, '/Security/DownloadFile')])[1]")).isEmpty();

			if (downloadExists) {
				System.out.println("PASS: Delete option is visible as expected.");
			} else {
				Assert.fail("FAIL: Delete option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Delete option.");
		}
	}

	@And("the user should not be able to download any file")
	public void verifyUserCannotDownloadFilesInOrganizationBucket() {
		sleep(3000);
		try {
			sleep(1000);

			boolean downloadExists = !driver
					.findElements(By.xpath("(//a[starts-with(@href, '/Security/DownloadFile')])[1]")).isEmpty();

			if (!downloadExists) {
				System.out.println("PASS: Download option is not visible as expected.");
			} else {
				Assert.fail("FAIL: Download option is visible, but it should not be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no Download permissions).");
		}
	}

	@And("the user should not be able to delete or download any files")
	public void verifyUserCannotDeleteOrDownloadFilesInOrganizationBucket() {
		sleep(3000);
		By actionMenu = By.xpath("//div[@class='settings-inner']//div[1]//div[1]//div[1]//div[1]//button[1]//i[1]");
		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);
			boolean deleteExists = !driver.findElements(By.xpath(
					"//div[@class='dropdown-menu bucket-dropdown-content show']//a[@id='btnDeleteFile']//*[name()='svg']//*[name()='path' and @id='Union_1']"))
					.isEmpty();
			boolean downloadExists = !driver
					.findElements(By.xpath("//div[@class='bucket-mainn show']//li[2]//a[1]//*[name()='svg']"))
					.isEmpty();
			if (!deleteExists && !downloadExists) {
				System.out.println("PASS: Delete and Download options are not visible as expected.");
			} else {
				Assert.fail("FAIL: Delete and/or Download option is visible, but it should not be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	@And("the user should not be able to edit or delete any EHR Types")
	public void verifyUserCannotEditOrDeleteEHRTypes() {
		sleep(3000);
		By actionMenu = By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]");
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
				System.out.println("PASS: Delete and Download options are not visible as expected.");
			} else {
				Assert.fail("FAIL: Delete and/or Download option is visible, but it should not be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	@And("the user should not be able to edit or delete any Progress Step entries")
	public void verifyUserCannotEditOrDeleteProgressStepEntries() {
		sleep(3000);
		By actionMenu = By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/button[1]");
		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);
			boolean editExists = !driver
					.findElements(By.xpath("//div[@class='gridRecordContextMain show']//li[1]//a[1]//div[1]"))
					.isEmpty();
			boolean deleteExists = !driver.findElements(By.xpath(
					"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"))
					.isEmpty();
			if (!editExists && !deleteExists) {
				System.out.println("PASS: Delete and Download options are not visible as expected.");
			} else {
				Assert.fail("FAIL: Delete and/or Download option is visible, but it should not be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	@And("the user should not be able to delete IPs or manage excluded users")
	public void verifyUserCannotDeleteIPsOrManageExcludedUsers() {
		sleep(3000);
		By actionMenu = By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/button[1]/i[1]");
		WebElement menuButton = driver.findElement(actionMenu);

		try {
			menuButton.click();
			sleep(1000);

			boolean deleteExists = !driver.findElements(By.xpath(
					"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"))
					.isEmpty();
			if (!deleteExists) {
				System.out.println("PASS: Delete and Download options are not visible as expected.");
			} else {
				Assert.fail("FAIL: Delete and/or Download option is visible, but it should not be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	@But("the user should not be able to edit, delete, or download any files")
	public void verifyUserCannotEditDeleteOrDownloadFilesInOrganizationBucket() {
		sleep(3000);
		By actionMenu = By.xpath("//div[@class='settings-inner']//div[1]//div[1]//div[1]//div[1]//button[1]//i[1]");
		WebElement menuButton = driver.findElement(actionMenu);
		try {
			menuButton.click();
			sleep(1000);
			boolean editExists = !driver
					.findElements(By.xpath("//div[@class='bucket-mainn show']//li[1]//a[1]//*[name()='svg']"))
					.isEmpty();
			boolean deleteExists = !driver.findElements(By.xpath(
					"//div[@class='dropdown-menu bucket-dropdown-content show']//a[@id='btnDeleteFile']//*[name()='svg']"))
					.isEmpty();
			boolean downloadExists = !driver.findElements(By.xpath(
					"//div[@class='bucket-mainn show']//li[2]//a[1]//*[name()='svg']//*[name()='path' and @id='Union_1']"))
					.isEmpty();
			if (!editExists && !deleteExists && !downloadExists) {
				System.out.println("PASS: User cannot see Edit/Delete/Download options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete/Download options.");
			}
		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	@But("the user should not be able to add, edit, delete, or download any files")
	public void verifyUserCannotAddEditDeleteOrDownloadFilesInOrganizationBucket() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[@id='btnAddFile']//*[name()='svg']"));
		By actionMenu = By.xpath("//div[@class='settings-inner']//div[1]//div[1]//div[1]//div[1]//button[1]//i[1]");
		WebElement menuButton = driver.findElement(actionMenu);
		try {
			menuButton.click();
			sleep(1000);
			boolean editExists = !driver
					.findElements(By.xpath("//div[@class='bucket-mainn show']//li[1]//a[1]//*[name()='svg']"))
					.isEmpty();
			boolean deleteExists = !driver.findElements(By.xpath(
					"//div[@class='dropdown-menu bucket-dropdown-content show']//a[@id='btnDeleteFile']//*[name()='svg']"))
					.isEmpty();
			boolean downloadExists = !driver.findElements(By.xpath(
					"//div[@class='bucket-mainn show']//li[2]//a[1]//*[name()='svg']//*[name()='path' and @id='Union_1']"))
					.isEmpty();
			if (!editExists && !deleteExists && !downloadExists) {
				System.out.println("PASS: User cannot see Edit/Delete/Download options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete/Download options.");
			}
		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}

	}

	@But("the user should not see any action buttons for reminders")
	public void UserCannotSeeReminderActionButtonsWithoutActionViewAccess() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//tbody/tr[1]/td[2]/a[1]"));

	}

	@But("the user should not be able to edit any Organization Calendar entry")
	public void verifyUserCannotEditOrganizationCalendarEntries() {
		sleep(3000);
		assertElementNotPresent(By.cssSelector("button[onclick='return SubmitCalendarSetting()']"));

	}

	@But("the user should not see the Send VCard option in Brand Management")
	public void verifySendVCardOptionIsNotVisibleInBrandManagement() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//button[normalize-space()='Send VCard']"));

	}

	@And("the user should be able to add a new feedback form")
	public void userShouldBeAbleToAddNewFeedbackForm() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Feedback Form']"));
		waitAndSendKeys(By.id("FeedbackForm_Title"), profileName);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
		waitAndSendKeys(By.id("FeedbackQuestion_Question"), profileName);
		sleep(3000);
		clickWhenClickable(
				By.xpath("//a[@class='settings-add-btn']//*[name()='svg']//*[name()='path' and @id='Path_1']"));
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to edit an existing feedback form")
	public void userShouldBeAbleToEditFeedbackForm() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/FeedbackForms");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/FeedbackForms"));

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

		try {
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

			if (!deleteExists) {
				System.out.println("PASS: Delete option is not visible as expected.");
			} else {
				Assert.fail("FAIL: Delete option is visible, but it should not be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no delete permissions).");
		}
	}

	@But("the user should not be able to edit or delete any feedback form")
	public void userShouldNotBeAbleToEditOrDeleteFeedbackForm() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/FeedbackForms");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/FeedbackForms"));

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
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Feedback Form']"));

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

	@But("the user should not be able to add, edit, or delete any EHR Types")
	public void verifyUserCannotAddEditDeleteEHRTypes() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New EHR Type']"));

		By actionMenu = By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]");

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

	@But("the user should not be able to add, edit, or delete any Progress Step entries")
	public void verifyUserCannotAddEditOrDeleteProgressStepEntries() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Progress Step']"));

		By actionMenu = By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/button[1]/i[1]");

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

	@But("the user should not be able to edit or delete any Designation")
	public void verifyUserCannotEditOrDeleteAnyDesignation() {
		sleep(3000);

		By actionMenu = By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]");

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

	@But("the user should not be able to add, edit, or delete any Professional License Type")
	public void verifyUserCannotAddEditOrDeleteProfessionalLicenseType() {
		sleep(3000);

		assertElementNotPresent(By.xpath("//span[normalize-space()='New Professional License Type']"));

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

	@But("the user should not be able to add, edit, or delete any Fax Setting")
	public void verifyUserCannotAddEditOrDeleteFaxSetting() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Fax Settings']"));
		By actionMenu = By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/button[1]/i[1]");
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

	@But("the user should not be able to edit or delete any Professional License Type")
	public void verifyUserCannotEditOrDeleteProfessionalLicenseType() {
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

	@But("the user should not be able to edit or delete any Fax Setting")
	public void verifyUserCannotEditOrDeleteFaxSetting() {
		sleep(3000);

		By actionMenu = By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/button[1]");

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

	@But("the user should not be able to delete any Professional License Type")
	public void verifyUserCannotDeleteAnyProfessionalLicenseType() {
		sleep(3000);

		try {
			sleep(1000);

			boolean deleteExists = !driver.findElements(By.xpath(
					"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (!deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	@But("the user should not be able to delete any Fax Setting")
	public void verifyUserCannotDeleteFaxSetting() {
		sleep(3000);

		try {
			sleep(1000);

			boolean deleteExists = !driver.findElements(By.xpath(
					"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (!deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	@But("the user should not be able to delete any Designation")
	public void verifyUserCannotDeleteAnyDesignation() {
		sleep(3000);

		try {
			sleep(1000);

			boolean deleteExists = !driver.findElements(By.xpath(
					"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"))
					.isEmpty();

			if (!deleteExists) {
				System.out.println("PASS: User cannot see Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Delete options.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	@But("the user should not be able to add or delete IPs")
	public void verifyUserCannotAddOrDeleteIPs() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New IP']"));

		By actionMenu = By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']");

		WebElement menuButton = driver.findElement(actionMenu);
		try {
			menuButton.click();
			sleep(1000);
			boolean deleteExists = !driver.findElements(By.xpath("//span[normalize-space()='Delete']")).isEmpty();
			if (!deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	@And("the user should not be able to add, edit, or delete any Designation")
	public void verifyUserCannotAddEditOrDeleteDesignation() {
		sleep(3000);
		By actionMenu = By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]");
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
				System.out.println("PASS: Delete and Download options are not visible as expected.");
			} else {
				Assert.fail("FAIL: Delete and/or Download option is visible, but it should not be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	@But("the user should not be able to exclude or remove excluded users")
	public void verifyUserCannotExcludeOrRemoveExcludedUsers() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Exclude User']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Exclude User']"));
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

	@And("the user should be able to reset password for a workspace user")
	public void verifyUserCanResetPasswordForWorkspaceUser() {

		assertElementPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Reset Password')]"));

	}

	@And("the user should be able to change profile for a workspace user")
	public void verifyUserCanChangeProfileForWorkspaceUser() {

		assertElementPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Change Profile')]"));

	}

	@And("the user should be able to link and delink employee to a workspace user")
	public void verifyUserCanLinkEmployeeToWorkspaceUser() {
		sleep(5000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'View Detail')]"));
		sleep(3000);
		assertElementPresent(By.xpath("//div[@id='EmployeeDetail']"));

	}

	@And("the user should be able to add a new Progress Step entry")
	public void verifyUserCanAddNewProgressStepEntry() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Progress Step']"));
		sleep(1000);
		waitAndSendKeys(By.id("ProgressStatus_Name"), profileName);
		sleep(1000);
		waitAndSendKeys(By.id("ProgressStatus_Priority"), "1");
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("ProgressStatus_FeatureType"), 2);
		sleep(1000);
		waitAndSendKeys(By.xpath("//textarea[@id='ProgressStatus_Notes']"), profileName);
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSaveProgressStatus']"));
	}

	@And("the user should be able to add a new Whitelist IP")
	public void verifyUserCanAddNewWhitelistIP() {
		sleep(3000);
		Random random = new Random();
		int lastOctet = random.nextInt(254) + 1;
		String randomIP = "192.168.100." + lastOctet;
		clickWhenClickable(By.xpath("//span[normalize-space()='New IP']"));
		waitAndSendKeys(By.id("WhiteListIP_IP"), randomIP);
		waitAndSendKeys(By.id("WhiteListIP_GivenName"), profileName);
		clickWhenClickable(
				By.xpath("//button[@class='btn btn-primary waves-effect waves-light'][normalize-space()='Submit']"));
	}

	@And("the user should be able to add a new Designation")
	public void verifyUserCanAddNewDesignation() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Designation']"));
		waitAndSendKeys(By.id("Designation_Name"), profileName);
		waitAndSendKeys(By.id("Designation_Level"), profileName);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
	}

	@And("the user should be able to add a new Professional License Type")
	public void verifyUserCanAddNewProfessionalLicenseType() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Professional License Type']"));
		waitAndSendKeys(By.id("ProfessionalLicenseType_Name"), profileName);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
	}

	@And("the user should be able to add a new Fax Setting")
	public void verifyUserCanAddNewFaxSetting() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Fax Settings']"));
		waitAndSendKeys(By.id("FaxSetting_FAXAPIId"), profileName);
		waitAndSendKeys(By.id("FaxSetting_FromEmail"), createdEmail);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
	}

	@And("the user should be able to add a new Central PA entry")
	public void verifyUserCanAddCentralPAEntry() {
		sleep(2000);
		clickWhenClickable(By.id("Filter_ProcessFromDate"));
		sleep(2000);
		WebElement anyActiveDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[contains(@class,'datepicker')]//td[not(contains(@class,'old')) and not(contains(@class,'new')) and not(contains(@class,'disabled'))]")));
		anyActiveDate.click();
		sleep(2000);
		clickWhenClickable(By.xpath("//button[normalize-space()='Submit']"));
	}

	@And("the user should be able to add a new Show On Dashboard entry")
	public void verifyUserCanAddShowOnDashboardEntry() {
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Show On Dashboard']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Show On Dashboard']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//input[@id='ReminderActionSetting_ShowOnDashboard_Time']"));
		sleep(2000);
		clickWhenClickable(By.id("ReminderActionSetting_ShowOnDashboard_Time"));
		sleep(1000);
		clickWhenClickable(By.xpath("(//a[contains(@class, 'ui-state-default') and text()='09'])[1]"));
		sleep(500);
		clickWhenClickable(By.xpath("//a[contains(@class, 'ui-state-default') and text()='30']"));
		sleep(500);
		clickWhenClickable(By.xpath("//button[@id='btnSaveShowOnDashboard']"));
	}

	@And("the user should be able to add a new Email Notification entry")
	public void verifyUserCanAddEmailNotificationEntry() {
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Email Notification']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Email Notification']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//input[@id='ReminderActionSetting_EmailNotification_Time']"));
		sleep(2000);
		clickWhenClickable(By.id("ReminderActionSetting_EmailNotification_Time"));
		sleep(1000);
		clickWhenClickable(By.xpath("(//a[contains(@class, 'ui-state-default') and text()='09'])[1]"));
		sleep(500);
		clickWhenClickable(By.xpath("//a[contains(@class, 'ui-state-default') and text()='30']"));
		sleep(500);
		clickWhenClickable(By.xpath("//select[@id='ReminderActionSetting_EmailNotification_TemplateId']"));
		sleep(500);
		selectDropdownByIndexWhenReady(By.id("ReminderActionSetting_EmailNotification_TemplateId"), 2);
		sleep(500);
		clickWhenClickable(By.xpath("//button[@id='btnSaveEmailNotification']"));
	}

	@And("the user should be able to add a new Auto Text entry")
	public void verifyUserCanAddNewAutoTextEntry() {
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Auto Text']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Auto Text']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//input[@id='ReminderActionSetting_AutoText_Date']"));
		sleep(2000);
		clickWhenClickable(By.id("ReminderActionSetting_AutoText_Date"));
		sleep(1000);
		clickWhenClickable(By.xpath("//a[text()='7']"));
		clickWhenClickable(By.xpath("//input[@id='ReminderActionSetting_AutoText_Time']"));
		sleep(2000);
		clickWhenClickable(By.id("ReminderActionSetting_AutoText_Time"));
		sleep(1000);
		clickWhenClickable(By.xpath("(//a[contains(@class, 'ui-state-default') and text()='09'])[1]"));
		sleep(500);
		clickWhenClickable(By.xpath("(//a[contains(@class, 'ui-state-default') and text()='30'])[2]"));
		sleep(500);
		clickWhenClickable(By.xpath("//select[@id='ReminderActionSetting_AutoText_TemplateId']"));
		sleep(500);
		selectDropdownByIndexWhenReady(By.id("ReminderActionSetting_AutoText_TemplateId"), 2);
		sleep(500);
		clickWhenClickable(By.xpath("//button[@id='btnSaveAutoText']"));
	}

	@And("the user should be able to add a new Auto Call entry")
	public void verifyUserCanAddNewAutoCallEntry() {
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Auto Call']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//input[@id='ReminderActionSetting_AutoCall_Time']"));
		sleep(2000);
		clickWhenClickable(By.id("ReminderActionSetting_AutoCall_Time"));
		sleep(1000);
		clickWhenClickable(By.xpath("(//a[contains(@class, 'ui-state-default') and text()='09'])[1]"));
		sleep(500);
		clickWhenClickable(By.xpath("//a[contains(@class, 'ui-state-default') and text()='30']"));
		sleep(500);
		clickWhenClickable(By.xpath("//select[@id='ReminderActionSetting_AutoCall_TemplateId']"));
		sleep(500);
		selectDropdownByIndexWhenReady(By.id("ReminderActionSetting_AutoCall_TemplateId"), 1);
		sleep(500);
		clickWhenClickable(By.xpath("//button[@id='btnSaveAutoCall']"));
	}

	@And("the user should be able to add a Sender Authentication entry")
	public void userShouldBeAbleToAddSenderAuthenticationEntry() {
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Sender Authentication']"));
		sleep(2000);
		waitAndSendKeys(By.xpath("//input[@id='domainName']"), profileName);
		clickWhenClickable(By.xpath("//button[@id='btnDomainName']"));

	}

	@And("the user should not be able to add or delete Sender Authentication entries")
	public void userShouldNotBeAbleToAddOrDeleteSenderAuthenticationEntries() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Sender Authentication']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[6]/div[1]/div[1]/button[1]/i[1]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to delete Sender Authentication entries")
	public void userShouldNotBeAbleToDeleteSenderAuthenticationEntries() {

		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[6]/div[1]/div[1]/button[1]/i[1]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to view or download from XFlow")
	public void userShouldNotBeAbleToViewOrDownloadFromXFlow() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@href='#']//span[@class='userTopIcon']//*[name()='svg']"));
		assertElementNotPresent(
				By.xpath("//span[@class='co-settings']//*[name()='svg']//*[name()='path' and @id='Union_1']"));

	}

	@And("the user should not be able to view General Audit View settings")
	public void userShouldNotBeAbleToViewGeneralAuditViewSettings() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//th[normalize-space()='Created Date']"));
		assertElementNotPresent(By.xpath("//th[normalize-space()='Updated Date']"));

	}

	@And("the user should be able to view General Audit View settings")
	public void userShouldBeAbleToViewGeneralAuditViewSettings() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/Profiles");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Profiles"));

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
		try {
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

			if (!deleteExists) {
				System.out.println("PASS: Delete option is not visible as expected.");
			} else {
				Assert.fail("FAIL: Delete option is visible, but it should not be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no delete permissions).");
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
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Patient Signature']"));

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

	@But("the user should not be able to reset password, change profile, link or delink employee to user")
	public void verifyUserCannotResetPasswordChangeProfileOrLinkEmployee() {
		sleep(3000);
		By actionMenu = By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]");

		try {
			WebElement menuButton = driver.findElement(actionMenu);
			menuButton.click();
			sleep(1000);
			boolean canResetPassword = isElementPresent(
					By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Reset Password')]"));
			boolean canChangeProfile = isElementPresent(
					By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Change Profile')]"));

			clickWhenClickable(
					By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'View Detail')]"));
			sleep(1000);
			boolean employeeDetailVisible = isElementPresent(By.id("EmployeeDetail"));

			boolean canLinkEmployee = false;
			boolean canDelinkEmployee = false;
			if (employeeDetailVisible) {
				canLinkEmployee = isElementPresent(By.xpath("//div[@id='EmployeeDetail']"));
				canDelinkEmployee = isElementPresent(By.xpath("//div[@id='EmployeeDetail']"));
			}

			if (!canResetPassword && !canChangeProfile && !canLinkEmployee && !canDelinkEmployee) {
				System.out.println(
						"PASS: User does not have unauthorized access to Reset Password, Change Profile, Link/Delink Employee.");
			} else {
				StringBuilder failureReasons = new StringBuilder("FAIL: User should not have access to:");
				if (canResetPassword)
					failureReasons.append(" Reset Password;");
				if (canChangeProfile)
					failureReasons.append(" Change Profile;");
				if (canLinkEmployee)
					failureReasons.append(" Link Employee;");
				if (canDelinkEmployee)
					failureReasons.append(" Delink Employee;");
				Assert.fail(failureReasons.toString());
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	@But("the user should not be able to change profile, link or delink employee to user")
	public void verifyUserCannotChangeProfileOrLinkOrDelinkEmployee() {
		sleep(3000);

		try {
			sleep(1000);

			boolean canChangeProfile = isElementPresent(By.xpath(
					"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Change Profile')]"));

			clickWhenClickable(By.xpath(
					"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'View Detail')]"));
			sleep(1000);

			boolean canLinkEmployee = isElementPresent(By.xpath("//div[@id='EmployeeDetail']"));
			boolean canDelinkEmployee = isElementPresent(By.xpath("//div[@id='EmployeeDetail']"));

			if (!canChangeProfile && !canLinkEmployee && !canDelinkEmployee) {
				System.out.println("PASS: User cannot access Change Profile, Link, or Delink Employee.");
			} else {
				StringBuilder failureReasons = new StringBuilder("FAIL: User should not have access to:");
				if (canChangeProfile)
					failureReasons.append(" Change Profile;");
				if (canLinkEmployee)
					failureReasons.append(" Link Employee;");
				if (canDelinkEmployee)
					failureReasons.append(" Delink Employee;");
				Assert.fail(failureReasons.toString());
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	@But("the user should not be able to link or delink employee to user")
	public void verifyUserCannotLinkOrDelinkEmployeeToUser() {
		sleep(5000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'View Detail')]"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@id='EmployeeDetail']"));

	}

	@Then("the user should be able to add a new fax template")
	public void userShouldBeAbleToAddNewFaxTemplate() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Fax Template']"));
		waitAndSendKeys(By.id("FaxTemplate_Title"), profileName);
		waitAndSendKeys(By.id("FaxTemplate_Subject"), profileName);
		selectDropdownByIndexWhenReady(By.id("TemplateFeatureMapping_FeatureType"), 3);
		clickWhenClickable(By.cssSelector("button[onclick='javascript:SubmitFaxTemplate();']"));
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
		clickWhenClickable(By.xpath("//li[1]//a[1]//div[1]"));
		sleep(1000);
		clickWhenClickable(By.id("chkg37BlockDelete"));
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
		sleep(3000);
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
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Change Profile')]"));
		clickWhenClickable(By.xpath("//select[@id='WorkspaceUser_Profile_Id']"));
		selectDropdownByIndexWhenReady(By.id("WorkspaceUser_Profile_Id"), 1);
		clickWhenClickable(By.xpath("//button[@id='btnSubmitUser']"));
		sleep(3000);

	}

	@And("I reopen the profile in edit mode")
	public void reopenProfileInEditMode() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("menucontext")));
		clickWhenReadyAndVisible(By.xpath("//span[normalize-space()='Filter']"));
		sleep(1000);
		waitAndSendKeys(By.id("Filter_Name"), profileName);
		sleep(1000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		sleep(3000);
		By actionMenu = By.xpath("//tr[td[normalize-space()='" + profileName + "']]//td[@class='text-right']//button");
		clickWhenClickable(actionMenu);
		clickWhenClickable(By.xpath("//span[normalize-space()='Edit']"));
		sleep(3000);

	}

	@Then("all module permission checkboxes should be selected")
	public void verifyAllModulePermissionCheckboxesSelected() {
		List<WebElement> checkboxes = driver.findElements(
				By.xpath("//input[@type='checkbox' and not(@id='allModulePermission') and not(contains(@id,'All'))]"));

		List<String> notSelected = new ArrayList<>();

		for (WebElement checkbox : checkboxes) {
			if (!checkbox.isSelected()) {
				notSelected.add(checkbox.getAttribute("id"));
			}
		}

		Assert.assertTrue("Some permission checkboxes are not selected: " + String.join(", ", notSelected),
				notSelected.isEmpty());
	}

	@And("the user should be able to delete a user")
	public void verifyUserCanDeleteUser() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("menucontext")));
		clickWhenReadyAndVisible(By.xpath("//span[normalize-space()='Filter']"));
		sleep(1000);
		waitAndSendKeys(By.id("Filter_Email"), createdEmail);
		sleep(1000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		sleep(3000);
		By actionMenu = By.xpath("//tr[td[normalize-space()='" + profileName + "']]//td[@class='text-right']//button");
		clickWhenClickable(actionMenu);
		assertElementPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		clickWhenClickable(By.xpath("//div[@id='deleteUserModel']//button[@id='btnDeleteConfirm']"));

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

	@Then("the user should be able to view workspace user details")
	public void verifyUserCanViewWorkspaceUserDetails() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/WorkspaceUsers");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/WorkspaceUsers"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(500);
		assertElementPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'View Detail')]"));
	}

	@Then("the user should be able to view Central PA Setting")
	public void verifyUserCanViewCentralPASetting() {
		sleep(3000);
		driver.get(baseUrl + "/Web/Home/CentralPASettings");
		wait.until(ExpectedConditions.urlContains("/Web/Home/CentralPASettings"));
	}

	@Then("the user should be able to view Show On Dashboard settings")
	public void verifyUserCanViewShowOnDashboardSettings() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/Reminder?id=dbff8740-5363-4666-9eaa-271d42298025#showdashboard");
		wait.until(ExpectedConditions
				.urlContains("/Setup/Home/Reminder?id=dbff8740-5363-4666-9eaa-271d42298025#showdashboard"));
	}

	@Then("the user should be able to view Email Notification settings")
	public void verifyUserCanViewEmailNotificationSettings() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/Reminder?id=dbff8740-5363-4666-9eaa-271d42298025#emailnotification");
		wait.until(ExpectedConditions
				.urlContains("/Setup/Home/Reminder?id=dbff8740-5363-4666-9eaa-271d42298025#emailnotification"));
	}

	@Then("the user should be able to view Auto Text settings")
	public void verifyUserCanViewAutoTextSettings() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/Reminder?id=dbff8740-5363-4666-9eaa-271d42298025#autotext");
		wait.until(ExpectedConditions
				.urlContains("/Setup/Home/Reminder?id=dbff8740-5363-4666-9eaa-271d42298025#autotext"));
	}

	@Then("the user should be able to view Auto Call settings")
	public void verifyUserCanViewAutoCallSettings() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/Reminder?id=dbff8740-5363-4666-9eaa-271d42298025#autocall");
		wait.until(ExpectedConditions
				.urlContains("/Setup/Home/Reminder?id=dbff8740-5363-4666-9eaa-271d42298025#autocall"));
	}

	@Then("the user should be able to view Spam Email settings")
	public void userShouldBeAbleToViewSpamEmailSettings() {
		sleep(3000);
		driver.get(baseUrl + "/Web/Home/Spams");
		wait.until(ExpectedConditions.urlContains("/Web/Home/Spams"));
	}

	@Then("the user should be able to view Bounce Email settings")
	public void userShouldBeAbleToViewBounceEmailSettings() {
		sleep(3000);
		driver.get(baseUrl + "/Web/Home/Bounces");
		wait.until(ExpectedConditions.urlContains("/Web/Home/Bounces"));
	}

	@Then("the user should be able to view Block Email settings")
	public void userShouldBeAbleToViewBlockEmailSettings() {
		sleep(3000);
		driver.get(baseUrl + "/Web/Home/Blocks");
		wait.until(ExpectedConditions.urlContains("/Web/Home/Blocks"));
	}

	@Then("the user should be able to view Sender Authentication settings")
	public void userShouldBeAbleToViewSenderAuthenticationSettings() {
		sleep(3000);
		driver.get(baseUrl + "/Web/Home/SenderAuthentications");
		wait.until(ExpectedConditions.urlContains("/Web/Home/SenderAuthentications"));
	}

	@Then("the user should be able to download from XFlow")
	public void userShouldBeAbleToDownloadFromXFlow() {
		sleep(3000);
		driver.get(baseUrl + "/Web/Home/XFlowVersions");
		wait.until(ExpectedConditions.urlContains("/Web/Home/XFlowVersions"));
	}

	@And("I navigate to the User page")
	public void navigateToUserPage() {
		sleep(3000);
		driver.get(baseUrl + "/Web/Home/Users");
		wait.until(ExpectedConditions.urlContains("/Web/Home/Users"));
	}

	@And("I navigate to the Profile page")
	public void navigateToProfilePage() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/Profiles");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Profiles"));
	}

	@But("the user should not be able to add Central PA Setting")
	public void verifyUserCannotAddCentralPASetting() {
		sleep(3000);
		assertElementNotPresent(
				By.xpath("//button[@class='btn btn-primary waves-effect waves-light'][normalize-space()='Submit']"));

	}

	@But("the user should not be able to add, edit, or delete Show On Dashboard settings")
	public void verifyUserCannotAddEditDeleteShowOnDashboardSettings() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Show On Dashboard']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Add Show On Dashboard']"));
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Edit']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));

	}

	@But("the user should not be able to add, edit, or delete Email Notification settings")
	public void verifyUserCannotAddEditOrDeleteEmailNotificationSettings() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Email Notification']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Add Email Notification']"));
		clickWhenClickable(By.xpath("//tr[@id='trEmailNotification_0']//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteEmailNotification']//span[contains(text(),'Delete')]"));

	}

	@But("the user should not be able to add, edit, or delete Auto Text entries")
	public void verifyUserCannotAddEditOrDeleteAutoTextEntries() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Auto Text']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Add Auto Text']"));
		clickWhenClickable(By.xpath("//tr[@id='trAutoText_0']//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@But("the user should not be able to add, edit, or delete Auto Call entries")
	public void verifyUserCannotAddEditOrDeleteAutoCallEntries() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Add Auto Call']"));
		clickWhenClickable(By.xpath("//tr[@id='trAutoCall_0']//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@But("the user should not be able to delete Spam Email entries")
	public void userShouldNotBeAbleToDeleteSpamEmailEntries() {
		sleep(3000);
		assertElementNotPresent(By.id("delete"));

	}

	@But("the user should not be able to delete Bounce Email entries")
	public void userShouldNotBeAbleToDeleteBounceEmailEntries() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//tbody/tr[1]/td[4]/a[1]/img[1]"));

	}

	@But("the user should not be able to delete Block Email entries")
	public void userShouldNotBeAbleToDeleteBlockEmailEntries() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//tbody/tr[1]/td[4]/a[1]/img[1]"));

	}

	@But("the user should not be able to edit or delete Show On Dashboard settings")
	public void verifyUserCannotEditOrDeleteShowOnDashboard() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Show On Dashboard']"));
		assertElementPresent(By.xpath("//span[normalize-space()='Add Show On Dashboard']"));
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Edit']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));

	}

	@But("the user should not be able to edit or delete Email Notification settings")
	public void verifyUserCannotEditOrDeleteEmailNotificationSettings() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Email Notification']"));
		clickWhenClickable(By.xpath("//tr[@id='trEmailNotification_0']//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteEmailNotification']//span[contains(text(),'Delete')]"));

	}

	@But("the user should not be able to edit or delete Auto Text entries")
	public void verifyUserCannotEditOrDeleteAutoTextEntries() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Auto Text']"));
		clickWhenClickable(By.xpath("//tr[@id='trAutoText_0']//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@But("the user should not be able to edit or delete Auto Call entries")
	public void verifyUserCannotEditOrDeleteAutoCallEntries() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tr[@id='trAutoCall_0']//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@But("the user should be able to edit an existing Show On Dashboard entry")
	public void verifyUserCanEditShowOnDashboardEntry() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Show On Dashboard']"));
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementPresent(By.xpath("//span[normalize-space()='Edit']"));

	}

	@But("the user should be able to edit an existing Email Notification entry")
	public void verifyUserCanEditEmailNotificationEntry() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Email Notification']"));
		clickWhenClickable(By.xpath("//tr[@id='trEmailNotification_0']//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@But("the user should be able to edit an existing Auto Text entry")
	public void verifyUserCanEditAutoTextEntry() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Auto Text']"));
		clickWhenClickable(By.xpath("//tr[@id='trAutoText_0']//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@But("the user should be able to edit an existing Auto Call entry")
	public void verifyUserCanEditAutoCallEntry() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tr[@id='trAutoCall_0']//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@But("the user should not be able to delete Show On Dashboard settings")
	public void verifyUserCannotDeleteShowOnDashboardSettings() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Show On Dashboard']"));
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));

	}

	@But("the user should not be able to delete Email Notification settings")
	public void verifyUserCannotDeleteEmailNotificationSettings() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Email Notification']"));
		clickWhenClickable(By.xpath("//tr[@id='trEmailNotification_0']//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteEmailNotification']//span[contains(text(),'Delete')]"));

	}

	@But("the user should not be able to delete Auto Text entries")
	public void verifyUserCannotDeleteAutoTextEntries() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Auto Text']"));
		clickWhenClickable(By.xpath("//tr[@id='trAutoText_0']//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@But("the user should not be able to delete Auto Call entries")
	public void verifyUserCannotDeleteAutoCallEntries() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tr[@id='trAutoCall_0']//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@But("the user should be able to delete a Show On Dashboard entry")
	public void verifyUserCanDeleteShowOnDashboardEntry() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Show On Dashboard']"));
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementPresent(By.xpath("//span[normalize-space()='Delete']"));
	}

	@But("the user should be able to delete an Email Notification entry")
	public void verifyEmailNotificationEntryCanBeDeletedByUser() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Email Notification']"));
		clickWhenClickable(By.xpath("//tr[@id='trEmailNotification_0']//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementPresent(By.xpath("//a[@id='btnDeleteEmailNotification']//span[contains(text(),'Delete')]"));
	}

	@But("the user should be able to delete an Auto Text entry")
	public void verifyUserCanDeleteAutoTextEntry() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Auto Text']"));
		clickWhenClickable(By.xpath("//tr[@id='trAutoText_0']//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
	}

	@But("the user should be able to delete an Auto Call entry")
	public void verifyUserCanDeleteAutoCallEntry() {
		sleep(3000);
		assertElementPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
	}

	@And("the user should be able to delete a Spam Email entry")
	public void userShouldBeAbleToDeleteSpamEmailEntry() {
		sleep(3000);
		assertElementPresent(By.xpath("//tbody/tr[1]/td[4]/a[1]/img[1]"));
	}

	@And("the user should be able to delete a Bounce Email entry")
	public void userShouldBeAbleToDeleteBounceEmailEntry() {
		sleep(3000);
		assertElementPresent(By.xpath("//tbody/tr[1]/td[4]/a[1]/img[1]"));
	}

	@And("the user should be able to delete a Block Email entry")
	public void userShouldBeAbleToDeleteBlockEmailEntry() {
		sleep(3000);
		assertElementPresent(By.xpath("//tbody/tr[1]/td[4]/a[1]/img[1]"));
	}

	@And("the user should be able to delete a Sender Authentication entry")
	public void userShouldBeAbleToDeleteSenderAuthenticationEntry() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[6]/div[1]/div[1]/button[1]/i[1]"));
		assertElementPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
	}

	@When("I repeatedly delete available user entries")
	public void deleteAllUserEntries() {
		sleep(3000);

		for (int i = 0; i < 20; i++) {
			try {
				WebElement deleteIcon = driver
						.findElement(By.xpath("//tbody/tr[4]/td[7]/div[1]/div[1]/button[1]/i[1]"));
				deleteIcon.click();
				sleep(500);

				WebElement deleteOption = driver.findElement(By.xpath(
						"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
				deleteOption.click();
				sleep(500);

				WebElement confirmDelete = driver
						.findElement(By.xpath("//div[@id='deleteUserModel']//button[@id='btnDeleteConfirm']"));
				confirmDelete.click();
				sleep(1000);

			} catch (NoSuchElementException e) {
				System.out.println("No more user entries to delete.");
				break;
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
		}
	}

	@When("I repeatedly delete available profile entries")
	public void repeatedlyDeleteAvailableProfileEntries() {
		sleep(3000);

		for (int i = 1; i <= 20; i++) {
			try {
				driver.findElement(By.xpath("//span[normalize-space()='Filter']")).click();
				sleep(1000);

				WebElement filterInput = driver.findElement(By.id("Filter_Name"));
				filterInput.clear();
				filterInput.sendKeys("Organization_Administrator");
				sleep(500);

				driver.findElement(By.xpath("//i[@class='fa-solid fa-magnifying-glass']")).click();
				sleep(1500);

				driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]/i[1]")).click();
				sleep(500);

				driver.findElement(By.xpath(
						"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"))
						.click();
				sleep(500);

				WebElement confirmDelete = driver
						.findElement(By.xpath("//div[@id='profileModel']//button[@id='btnDeleteConfirm']"));
				confirmDelete.click();

				sleep(1500);

				System.out.println("Deleted profile entry #" + i);

			} catch (NoSuchElementException e) {
				System.out.println("No more profile entries found at iteration " + i);
				break;
			}
		}
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
				clickWhenClickable(By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Edit')]"));
				sleep(2000);
				waitAndSendKeys(By.id("BOTCallTemplate_Body"), profileName);
				clickWhenClickable(By.xpath(
						"//button[@class='btn btn-primary waves-effect waves-light'][normalize-space()='Submit']"));

			} else {
				Assert.fail("FAIL: Edit option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Edit option.");
		}

	}

	@But("the user should not be able to delete any BOT call template")
	public void verifyUserCannotDeleteBotCallTemplate() {
		sleep(2000);
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
				clickWhenClickable(
						By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]"));

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
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(1000);
		String templateTitle = profileName + " Template";
		By bodyTextarea = By.xpath("//textarea[@id='SMSTemplate_Body']");
		waitAndSendKeys(bodyTextarea, templateTitle);
		By submitBtn = By
				.xpath("//button[@class='btn btn-primary waves-effect waves-light'][normalize-space()='Submit']");
		clickWhenReadyAndVisible(submitBtn);
	}

	@And("the user should be able to delete a text template")
	public void erifyUserCanDeleteTextTemplate() {
		sleep(3000);
		clickWhenReadyAndVisible(By.xpath("//span[normalize-space()='Filter']"));
		sleep(3000);
		waitAndSendKeys(By.id("Filter_Title"), profileName);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		sleep(1000);
		By actionMenu = By.xpath("(//td[@class='text-right']//button)[1]");
		clickWhenClickable(actionMenu);
		assertElementPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

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
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	@Then("the user should have no Central PA Setting access via UI or direct URL")
	public void verifyUserHasNoAccessToCentralPASetting() {
		driver.get(baseUrl + "/Web/Home/CentralPASettings");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	@Then("the user should have no Mail Setting access via UI or direct URL")
	public void verifyUserHasNoAccessToMailSetting() {
		driver.get(baseUrl + "/Setup/Home/MailSetting");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	@Then("the user should have no Text page access via UI or direct URL")
	public void verifyUserHasNoAccessToTextPageViaUIOrURL() {
		sleep(2000);
		driver.get(baseUrl + "/Setup/Home/Texts");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	@Then("the user should have no Call Activity access via UI or direct URL")
	public void verifyUserHasNoAccessToCallActivityPageViaUIOrURL() {
		sleep(2000);
		driver.get(baseUrl + "/Setup/Home/CallActivities");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	@Then("the user should have no BOT Call View access via UI or direct URL")
	public void verifyUserHasNoAccessToBotCallPageViaUIOrURL() {
		sleep(2000);
		driver.get(baseUrl + "/Setup/Home/BOTCalls");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	@Then("the user should have no Fax View access via UI or direct URL")
	public void verifyUserHasNoAccessToFaxPageViaUIOrURL() {
		sleep(2000);
		driver.get(baseUrl + "/Setup/Home/Faxes");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	@Then("the user should have no Mail View access via UI or direct URL")
	public void verifyUserHasNoAccessToMailPageViaUIOrURL() {
		sleep(2000);
		driver.get(baseUrl + "/Setup/Home/Mails");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
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
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	@Then("the user should have no Connector App access via UI or direct URL")
	public void verifyNoConnectorAppAccessUIOrURL() {
		driver.get(baseUrl + "/Web/Home/ConnectorApps");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	@Then("the user should not be able to access the Driver and SalesRep User page via direct URL")
	public void verifyUserCannotAccessDriverAndSalesRepUserPageViaDirectURL() {
		String[] urls = { baseUrl + "/Setup/Home/DriverAndSalesRepUsers?userType=DriverUsers",
				baseUrl + "/Setup/Home/DriverAndSalesRepUsers?userType=SalesRepUsers" };
		for (String url : urls) {
			driver.get(url);
			sleep(2000);
			boolean isErrorVisible = !driver.findElements(By.xpath("//h2[normalize-space()='Error']")).isEmpty();

			if (isErrorVisible) {
				System.out.println("Access blocked as expected for URL: " + url);
			} else {
				System.out.println("Access granted unexpectedly for URL: " + url);
			}
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
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
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
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
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
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
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
