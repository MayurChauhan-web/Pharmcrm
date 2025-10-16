package com.pharmcrm.pharmcrm_product.steps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PartnerSteps {

	String createdEmail;
	String baseUrl = "http://qa01.pharmcrm.com";
	String profileName;

	private WebDriver driver = DrugSteps.driver;
	private WebDriverWait wait = DrugSteps.wait;

	public PartnerSteps() {
		this.driver = DriverFactory.getDriver();
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	@Given("I log in as admin for Partner Module")
	public void loginAsAdminForPartnerModule() {
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

	@When("I create a new user with email for Partner Module {string}")
	public void createNewUserWithEmailForPartnerModule(String email) {
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

	@And("I create a profile with View access only to Partner Module General Audit View")
	public void createProfileWithViewAccessOnlyForPartnerModuleGeneralAuditView() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with No access to Partner Module General Audit View")
	public void createProfileWithNoAccessForPartnerModuleGeneralAuditView() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg37PartnerAuditView']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View + Reset Password access only to Executive in Partner Module")
	public void createProfileWithViewAndResetPasswordAccessForPartnerModuleExecutive() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg37PartnerAuditView']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Executive in Partner Module")
	public void createProfileWithDeleteAccessOnlyForPartnerModuleExecutive() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg37PartnerAuditView']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Executive in Partner Module")
	public void createProfileWithEditAccessOnlyForPartnerModuleExecutive() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg37PartnerAuditView']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Executive in Partner Module")
	public void createProfileWithAddAccessOnlyForPartnerModuleExecutive() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg37PartnerAuditView']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Mailing Address in Partner Module")
	public void createProfileWithDeleteAccessOnlyForPartnerModuleMailingAddress() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg21BusinessAddressAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg21BusinessAddressAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Mailing Address in Partner Module")
	public void createProfileWithEditAccessOnlyForPartnerModuleMailingAddress() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg21BusinessAddressAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg21BusinessAddressAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Mailing Address in Partner Module")
	public void createProfileWithAddAccessOnlyForPartnerModuleMailingAddress() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg21BusinessAddressAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg21BusinessAddressAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Business Address in Partner Module")
	public void createProfileWithDeleteAccessOnlyForPartnerModuleBusinessAddress() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg21BusinessAddressAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg21BusinessAddressDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Business Address in Partner Module")
	public void createProfileWithAddAccessOnlyForPartnerModuleBusinessAddress() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg21BusinessAddressAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg21BusinessAddressAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Business Address in Partner Module")
	public void createProfileWithEditAccessOnlyForPartnerModuleBusinessAddress() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg21BusinessAddressAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg21BusinessAddressEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View Details access only to Custom Partners in Partner Module")
	public void createProfileWithViewAndDetailsAccessForPartnerModuleCustomPartners() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg19PartnerAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg19PartnerDetails']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Custom Partners in Partner Module")
	public void createProfileWithDeleteAccessOnlyForPartnerModuleCustomPartners() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg19PartnerAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg19PartnerDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Custom Partners in Partner Module")
	public void createProfileWithEditAccessOnlyForPartnerModuleCustomPartners() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg19PartnerAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg19PartnerEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Partner Type in Partner Module")
	public void createProfileWithAddAccessOnlyForPartnerModulePartnerType() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg19PartnerTypeAdd']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Custom Partners in Partner Module")
	public void createProfileWithAddAccessOnlyForPartnerModuleCustomPartners() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg19PartnerAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg19PartnerAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Special Service in Partner Module")
	public void createProfileWithEditAccessOnlyForPartnerModuleSpecialService() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg34SpecialServiceEdit']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Special Service in Partner Module")
	public void createProfileWithAddAccessOnlyForPartnerModuleSpecialService() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg34SpecialServiceAdd']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Partner Type in Partner Module")
	public void createProfileWithDeleteAccessOnlyForPartnerModulePartnerType() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg19PartnerTypeDelete']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Partner Type in Partner Module")
	public void createProfileWithEditAccessOnlyForPartnerModulePartnerType() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg19PartnerTypeEdit']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("the user should be able to view General Audit View settings in Partner Module")
	public void verifyUserCanViewGeneralAuditViewInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Created By']"));
		assertElementPresent(By.xpath("//a[normalize-space()='Created Date']"));

	}

	@And("the user should be able to delete Partner Type in Partner Module")
	public void verifyUserCanDeletePartnerTypeInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/PartnerTypes");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PartnerTypes"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should not be able to add or edit Partner Type in Partner Module")
	public void verifyUserCannotAddOrEditPartnerTypeInPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner Type']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to add Special Service in Partner Module")
	public void verifyUserCanAddSpecialServiceInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/SpecialServices");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/SpecialServices"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Special Service']"));
		sleep(2000);
		waitAndSendKeys(By.id("SpecialService_Title"), "Consultant");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to edit Special Service in Partner Module")
	public void verifyUserCannotEditSpecialServiceInPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//tbody/tr[1]/td[4]/div[1]/a[1]/img[1]"));

	}

	@And("the user should be able to edit Special Service in Partner Module")
	public void verifyUserCanEditSpecialServiceInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/SpecialServices");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/SpecialServices"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/a[1]/img[1]"));
		sleep(2000);
		waitAndSendKeys(By.id("SpecialService_Title"), "Consultant");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to add Special Service in Partner Module")
	public void verifyUserCannotAddSpecialServiceInPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Special Service']"));

	}

	@And("the user should be able to delete Custom Partners in Partner Module")
	public void verifyUserCanDeleteCustomPartnersInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//div[@id='deletePartnerModel']//button[@id='btnDeleteConfirm']"));
		sleep(2000);

	}

	@And("the user should not be able to edit or delete Business Address in Partner Module")
	public void verifyUserCannotEditOrDeleteBusinessAddressInPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("(//a[contains(@onclick, \"editPartnerAddress\")])[1]"));
		assertElementNotPresent(By.xpath("(//a[@id=\"btnDeletePartnerAddress\"])[1]"));

	}

	@And("the user should be able to add Business Address in Partner Module")
	public void verifyUserCanAddBusinessAddressInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Business Addresses']"));
		sleep(3000);
		waitAndSendKeys(By.id("PartnerAddress_Street"), "789 Broadway Ave");
		waitAndSendKeys(By.id("PartnerAddress_City"), "New York");
		waitAndSendKeys(By.id("PartnerAddress_State"), "NY");
		waitAndSendKeys(By.id("PartnerAddress_ZipCode"), "10003");
		clickWhenClickable(By.xpath("//button[@id='btnSavePartnerAddressPopup']"));

	}

	@And("the user should be able to edit Business Address in Partner Module")
	public void verifyUserCanEditBusinessAddressInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//a[@data-original-title=\"Edit Partner Care Giver Name\"])[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Primary Address']"));
		clickWhenClickable(By.xpath("//button[@id='btnSavePartnerAddressPopup']"));

	}

	@And("the user should not be able to add or edit Business Address in Partner Module")
	public void verifyUserCannotAddOrEditBusinessAddressInPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Business Addresses']"));
		assertElementNotPresent(By.xpath("(//a[contains(@onclick, 'editPartnerAddress')])[1]"));

	}

	@And("the user should be able to delete Mailing Address in Partner Module")
	public void verifyUserCanDeleteMailingAddressInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Created By']"));
		assertElementPresent(By.xpath("//a[normalize-space()='Created Date']"));

	}

	@And("the user should not be able to add or delete Mailing Address in Partner Module")
	public void verifyUserCannotAddOrDeleteMailingAddressInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Created By']"));
		assertElementPresent(By.xpath("//a[normalize-space()='Created Date']"));

	}

	@And("the user should be able to reset password for Executive in Partner Module")
	public void verifyUserCanResetPasswordForExecutiveInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Created By']"));
		assertElementPresent(By.xpath("//a[normalize-space()='Created Date']"));

	}

	@And("the user should not be able to add, edit, or delete Executive in Partner Module")
	public void verifyUserCannotAddEditOrDeleteExecutiveInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Created By']"));
		assertElementPresent(By.xpath("//a[normalize-space()='Created Date']"));

	}

	@And("the user should be able to view Executive in Partner Module")
	public void verifyUserCanViewExecutiveInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Created By']"));
		assertElementPresent(By.xpath("//a[normalize-space()='Created Date']"));

	}

	@And("the user should not be able to add or edit Executive in Partner Module")
	public void verifyUserCannotAddOrEditExecutiveInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Created By']"));
		assertElementPresent(By.xpath("//a[normalize-space()='Created Date']"));

	}

	@And("the user should be able to delete Executive in Partner Module")
	public void verifyUserCanDeleteExecutiveInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Created By']"));
		assertElementPresent(By.xpath("//a[normalize-space()='Created Date']"));

	}

	@And("the user should not be able to add or delete Executive in Partner Module")
	public void verifyUserCannotAddOrDeleteExecutiveInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Created By']"));
		assertElementPresent(By.xpath("//a[normalize-space()='Created Date']"));

	}

	@And("the user should be able to edit Executive in Partner Module")
	public void verifyUserCanEditExecutiveInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Created By']"));
		assertElementPresent(By.xpath("//a[normalize-space()='Created Date']"));

	}

	@And("the user should not be able to edit or delete Executive in Partner Module")
	public void verifyUserCannotEditOrDeleteExecutiveInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Created By']"));
		assertElementPresent(By.xpath("//a[normalize-space()='Created Date']"));

	}

	@And("the user should be able to add Executive in Partner Module")
	public void verifyUserCanAddExecutiveInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Created By']"));
		assertElementPresent(By.xpath("//a[normalize-space()='Created Date']"));

	}

	@And("the user should not be able to add or edit Mailing Address in Partner Module")
	public void verifyUserCannotAddOrEditMailingAddressInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Created By']"));
		assertElementPresent(By.xpath("//a[normalize-space()='Created Date']"));

	}

	@And("the user should be able to edit Mailing Address in Partner Module")
	public void verifyUserCanEditMailingAddressInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Created By']"));
		assertElementPresent(By.xpath("//a[normalize-space()='Created Date']"));

	}

	@And("the user should not be able to edit or delete Mailing Address in Partner Module")
	public void verifyUserCannotEditOrDeleteMailingAddressInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Created By']"));
		assertElementPresent(By.xpath("//a[normalize-space()='Created Date']"));

	}

	@And("the user should be able to add Mailing Address in Partner Module")
	public void verifyUserCanAddMailingAddressInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Business Addresses']"));
		sleep(3000);
		waitAndSendKeys(By.id("PartnerAddress_Street"), "789 Broadway Ave");
		waitAndSendKeys(By.id("PartnerAddress_City"), "New York");
		waitAndSendKeys(By.id("PartnerAddress_State"), "NY");
		waitAndSendKeys(By.id("PartnerAddress_ZipCode"), "10003");
		clickWhenClickable(By.xpath("//button[@id='btnSavePartnerAddressPopup']"));

	}

	@And("the user should be able to delete Business Address in Partner Module")
	public void verifyUserCanDeleteBusinessAddressInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//a[@data-original-title='Delete Partner Address'])[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='deletePartnerAddress']"));

	}

	@And("the user should not be able to add or delete Business Address in Partner Module")
	public void verifyUserCannotAddOrDeleteBusinessAddressInPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Business Addresses']"));
		assertElementNotPresent(By.xpath("(//a[@id=\"btnDeletePartnerAddress\"])[1]"));
	}

	@And("the user should not be able to add, edit, or delete Custom Partners in Partner Module")
	public void verifyUserCannotAddEditOrDeleteCustomPartnersInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to view and see details of Custom Partners in Partner Module")
	public void verifyUserCanViewAndSeeDetailsOfCustomPartnersInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
	}

	@And("the user should not be able to add or edit Custom Partners in Partner Module")
	public void verifyUserCannotAddOrEditCustomPartnersInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to add or delete Custom Partners in Partner Module")
	public void verifyUserCannotAddOrDeleteCustomPartnersInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
	}

	@And("the user should be able to edit Custom Partners in Partner Module")
	public void verifyUserCanEditCustomPartnersInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Wednesday']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
	}

	@And("the user should not be able to edit or delete Custom Partners in Partner Module")
	public void verifyUserCannotEditOrDeleteCustomPartnersInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to add Custom Partners in Partner Module")
	public void verifyUserCanAddCustomPartnersInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Partner']"));
		sleep(3000);
		waitAndSendKeys(By.id("Partner_BusinessName"), "Allied Health Solutions");
		waitAndSendKeys(By.id("Partner_PhoneNumber"), "(312) 555-0198");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
	}

	@And("the user should not be able to add or delete Partner Type in Partner Module")
	public void verifyUserCannotAddOrDeletePartnerTypeInPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner Type']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to edit Partner Type in Partner Module")
	public void verifyUserCanEditPartnerTypeInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/PartnerTypes");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PartnerTypes"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("PartnerType_Name"), "ClinicalProvider");
		waitAndSendKeys(By.id("PartnerType_Label"), "Clinical Provider");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to edit or delete Partner Type in Partner Module")
	public void verifyUserCannotEditOrDeletePartnerTypeInPartnerModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to add Partner Type in Partner Module")
	public void verifyUserCanAddPartnerTypeInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/PartnerTypes");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PartnerTypes"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Partner Type']"));
		sleep(2000);
		waitAndSendKeys(By.id("PartnerType_Name"), "ClinicalProvider");
		waitAndSendKeys(By.id("PartnerType_Label"), "Clinical Provider");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("I log in using the new user for Partner Module")
	public void loginAsNewUserForPartnerModule() {
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

	@And("I reset the user's password for Partner Module")
	public void resetUserPasswordForClinicalModule() {
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

	@And("I assign the profile and workspace to the user for Partner Module")
	public void assignProfileAndWorkspaceToUserForPartnerModule() {
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

	@Then("the user should not be able to view General Audit View settings in Partner Module")
	public void verifyUserCannotViewGeneralAuditViewInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
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
