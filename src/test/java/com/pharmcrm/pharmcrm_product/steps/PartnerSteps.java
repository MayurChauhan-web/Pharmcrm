package com.pharmcrm.pharmcrm_product.steps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.List;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg21PartnerExecutiveAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg33ResetPartnerExecutivePassword']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with full Folder permissions but no File permissions for Bucket in Partner Module")
	public void createProfileWithFullFolderPermissionsButNoFilePermissionsForBucketInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[@for='chkg21PartnerBucketFileAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg23PartnerBucketFolderAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg23PartnerBucketFolderEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg23PartnerBucketFolderDelete']"));
		clickWhenClickable(By.xpath("//label[@for='chkg23PartnerBucketFolderFavourite']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with full File permissions but no Folder permissions for Bucket in Partner Module")
	public void createProfileWithFullFilePermissionsButNoFolderPermissionsForBucketInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[@for='chkg23PartnerBucketFolderAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg23PartnerBucketFolderEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg23PartnerBucketFolderDelete']"));
		clickWhenClickable(By.xpath("//label[@for='chkg23PartnerBucketFolderFavourite']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Attorney in Partner Module")
	public void createProfileWithAddAccessOnlyToAttorneyInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg21AttorneyAll']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg21AttorneyAdd']"));
		sleep(2000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Attorney in Partner Module")
	public void createProfileWithEditAccessOnlyToAttorneyInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg21AttorneyAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg21AttorneyEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Attorney in Partner Module")
	public void createProfileWithDeleteAccessOnlyToAttorneyInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg21AttorneyAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg22AttorneyDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Details access only to Attorney in Partner Module")
	public void createProfileWithDetailsAccessOnlyToAttorneyInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg21AttorneyAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg22AttorneyDetails']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Pharmacies in Partner Module")
	public void createProfileWithAddAccessForPharmaciesInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg22PharmaciesAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg22PharmaciesAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Pharmacies in Partner Module")
	public void userCreatesProfileWithEditAccessForPharmaciesInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg22PharmaciesAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg22PharmaciesEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Pharmacies in Partner Module")
	public void userCreatesProfileWithDeleteAccessForPharmaciesInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg22PharmaciesAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg22PharmaciesDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Details access only to Pharmacies in Partner Module")
	public void userCreatesProfileWithDetailsAccessForPharmaciesInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg22PharmaciesAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg22PharmaciesDetails']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Pharmacy Vetting access only to Pharmacies in Partner Module")
	public void userCreatesProfileWithPharmacyVettingAccessForPharmaciesInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg22PharmaciesAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg22PharmaciesDetails']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to DME Provider in Partner Module")
	public void userCreatesProfileWithAddAccessForDMEProviderInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg22DMEProviderAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg22DMEProviderAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to DME Provider in Partner Module")
	public void userCreatesProfileWithEditAccessForDMEProviderInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg22DMEProviderAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg22DMEProviderEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to DME Provider in Partner Module")
	public void userCreatesProfileWithDeleteAccessForDMEProviderInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg22DMEProviderAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg22DMEProviderDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Details access only to DME Provider in Partner Module")
	public void userCreatesProfileWithDetailsAccessForDMEProviderInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg22DMEProviderAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg22DMEProviderDetails']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Rx HUB in Partner Module")
	public void createProfileWithAddAccessOnlyToRxHUBInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg22RxHUBAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg22RxHUBAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Rx HUB in Partner Module")
	public void createProfileWithEditAccessOnlyToRxHUBInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg22RxHUBAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg22RxHUBEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Rx HUB in Partner Module")
	public void createProfileWithDeleteAccessOnlyToRxHUBInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg22RxHUBAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg22RxHUBDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Details access only to Rx HUB in Partner Module")
	public void createProfileWithDetailsAccessOnlyToRxHUBInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg22RxHUBAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg22RxHUBDetails']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Federal and State Government in Partner Module")
	public void createProfileWithAddAccessOnlyToFederalAndStateGovernmentInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg22FederalAndStateGovernmentAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg22FederalAndStateGovernmentAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Federal and State Government in Partner Module")
	public void createProfileWithEditAccessOnlyToFederalAndStateGovernmentInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg22FederalAndStateGovernmentAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg22FederalAndStateGovernmentEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Federal and State Government in Partner Module")
	public void createProfileWithDeleteAccessOnlyToFederalAndStateGovernmentInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg22FederalAndStateGovernmentAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg22FederalAndStateGovernmentDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Details access only to Federal and State Government in Partner Module")
	public void createProfileWithDetailsAccessOnlyToFederalAndStateGovernmentInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg22FederalAndStateGovernmentAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg22FederalAndStateGovernmentDetails']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Employers in Partner Module")
	public void createProfileWithAddAccessOnlyToEmployersInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg22EmployersAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg22EmployersAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Employers in Partner Module")
	public void createProfileWithEditAccessOnlyToEmployersInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg22EmployersAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg22EmployersEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Employers in Partner Module")
	public void createProfileWithDeleteAccessOnlyToEmployersInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg22EmployersAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg22EmployersDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Details access only to Employers in Partner Module")
	public void verifyUserWithDetailsAccessCanViewEmployersOnly() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg22EmployersAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg22EmployersDetails']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Referral Enrollment in Partner Module")
	public void createProfileWithAddAccessForReferralEnrollment() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg23PartnerReferralEnrollmentAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg23PartnerReferralEnrollmentAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Referral Enrollment in Partner Module")
	public void createProfileWithEditAccessForReferralEnrollment() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg23PartnerReferralEnrollmentAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg23PartnerReferralEnrollmentEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Referral Enrollment in Partner Module")
	public void createProfileWithDeleteAccessForReferralEnrollment() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg23PartnerReferralEnrollmentAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg23PartnerReferralEnrollmentDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Download File access only to Referral Patient History in Partner Module")
	public void createProfileWithDownloadAccessForReferralPatientHistory() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without Download File access to Referral Patient History in Partner Module")
	public void createProfileWithoutDownloadAccessForReferralPatientHistory() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg23PartnerReferralPatientHistoryAll']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Download File access only to Referral Incoming Details in Partner Module")
	public void createProfileWithDownloadAccessForReferralIncomingDetails() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without Download File access to Referral Incoming Details in Partner Module")
	public void createProfileWithoutDownloadAccessForReferralIncomingDetails() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg23PartnerReferralInComingFileAll']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Download File access only to Referral Outgoing Details in Partner Module")
	public void createProfileWithDownloadAccessForReferralOutgoingDetails() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without Download File access to Referral Outgoing Details in Partner Module")
	public void createProfileWithoutDownloadAccessForReferralOutgoingDetails() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg23PartnerReferralOutGoingFileAll']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Export Excel access only to Partner PA Details in Partner Module")
	public void createProfileWithExportExcelAccessForPartnerPADetails() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without Export Excel access to Partner PA Details in Partner Module")
	public void createProfileWithoutExportExcelAccessForPartnerPADetails() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg24PartnerPADetailsAll']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Funding Company in Partner Module")
	public void createProfileWithAddAccessForFundingCompany() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg32FundingCompanyAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg32FundingCompanyAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Funding Company in Partner Module")
	public void createProfileWithEditAccessForFundingCompany() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg32FundingCompanyAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg32FundingCompanyEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Funding Company in Partner Module")
	public void createProfileWithDeleteAccessForFundingCompany() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg32FundingCompanyAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg32FundingCompanyDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Details access only to Funding Company in Partner Module")
	public void createProfileWithDetailsAccessForFundingCompany() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg32FundingCompanyAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg32FundingCompanyDetails']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Partner License in Partner Module")
	public void createProfileWithAddAccessOnlyToPartnerLicenseInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg32PartnerLicenseAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg32PartnerLicenseAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Download File access only to Partner License in Partner Module")
	public void createProfileWithDownloadFileAccessOnlyToPartnerLicenseInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg32PartnerLicenseAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg33PartnerLicenseDocumentDownload']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Partner Special Event in Partner Module")
	public void createProfileWithAddAccessForPartnerSpecialEvent() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg34PartnerSpecialEventAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg34PartnerSpecialEventAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Partner Special Event in Partner Module")
	public void createProfileWithEditAccessForPartnerSpecialEvent() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg34PartnerSpecialEventAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg34PartnerSpecialEventEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Partner Special Event in Partner Module")
	public void createProfileWithDeleteAccessForPartnerSpecialEvent() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg34PartnerSpecialEventAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg34PartnerSpecialEventDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Partner Special Service in Partner Module")
	public void createProfileWithDeleteAccessForPartnerSpecialService() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg34PartnerSpecialServiceAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg34PartnerSpecialServiceDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Partner Special Hour in Partner Module")
	public void createProfileWithDeleteAccessForPartnerSpecialHour() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg34PartnerSpecialHourAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg34PartnerSpecialHourDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Partner Agreement in Partner Module")
	public void createProfileWithAddAccessForPartnerAgreement() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg45PartnerAgreementAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg45PartnerAgreementAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Partner Agreement in Partner Module")
	public void createProfileWithDeleteAccessForPartnerAgreement() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg45PartnerAgreementAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg45PartnerAgreementDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Update access to DeDupe in Partners Module")
	public void createProfileWithUpdateAccessToDeDupeInPartnersModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without Update access to DeDupe in Partners Module")
	public void createProfileWithoutUpdateAccessToDeDupeInPartnersModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg35PartnerDeDupeAll']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Partner Agreement in Partner Module")
	public void createProfileWithEditAccessForPartnerAgreement() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg45PartnerAgreementAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg45PartnerAgreementEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Partner Special Hour in Partner Module")
	public void createProfileWithEditAccessForPartnerSpecialHour() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg34PartnerSpecialHourAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg34PartnerSpecialHourEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Partner Special Hour in Partner Module")
	public void createProfileWithAddAccessForPartnerSpecialHour() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg34PartnerSpecialHourAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg34PartnerSpecialHourAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Partner Special Service in Partner Module")
	public void createProfileWithEditAccessForPartnerSpecialService() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg34PartnerSpecialServiceAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg34PartnerSpecialServiceEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Partner Special Service in Partner Module")
	public void createProfileWithAddAccessForPartnerSpecialService() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg34PartnerSpecialServiceAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg34PartnerSpecialServiceAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Details access only to Partner License in Partner Module")
	public void createProfileWithDetailsAccessOnlyToPartnerLicenseInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg32PartnerLicenseAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg33PartnerLicenseDetails']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Partner License in Partner Module")
	public void createProfileWithDeleteAccessOnlyToPartnerLicenseInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg32PartnerLicenseAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg32PartnerLicenseDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Partner License in Partner Module")
	public void createProfileWithEditAccessOnlyToPartnerLicenseInPartnerModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg32PartnerLicenseAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg32PartnerLicenseEdit']"));
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
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg21PartnerExecutiveAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg21PartnerExecutiveDelete']"));
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
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg21PartnerExecutiveAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg21PartnerExecutiveEdit']"));
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
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg21PartnerExecutiveAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg21PartnerExecutiveAdd']"));
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
		clickWhenClickable(By.xpath("//label[@for='chkg21MailingAddressAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg21MailingAddressDelete']"));
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
		clickWhenClickable(By.xpath("//label[@for='chkg21MailingAddressAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg21MailingAddressEdit']"));
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
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Partner Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg21MailingAddressAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg21MailingAddressAdd']"));
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
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath(
				"(//div[@id='partner-address-list-mailing']//a[@id='btnDeletePartnerAddress' and contains(@data-original-title,'Delete Partner Address')])[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='deletePartnerAddress']"));

	}

	@And("the user should not be able to add or delete Mailing Address in Partner Module")
	public void verifyUserCannotAddOrDeleteMailingAddressInPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Mailing Address']"));
		assertElementNotPresent(By.xpath(
				"(//div[@id='partner-address-list-mailing']//a[@id='btnDeletePartnerAddress' and contains(@data-original-title,'Delete Partner Address')])[1]"));
	}

	@And("the user should be able to reset password for Executive in Partner Module")
	public void verifyUserCanResetPasswordForExecutiveInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Executives']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(3000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Enable Login')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(3000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Reset Password')]"));
		sleep(3000);
		waitAndSendKeys(By.id("newPassword"), "Admin@123");
		waitAndSendKeys(By.id("confirmPassword"), "Admin@123");
		clickWhenClickable(By.xpath("//button[@id='btnResetPassword']"));

	}

	@And("the user should be able to edit Attorney in Partner Module")
	public void userShouldBeAbleToEditAttorneyInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Company Attorney?']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to edit Pharmacies in Partner Module")
	public void userShouldBeAbleToEditPharmaciesInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Wednesday']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to delete Pharmacies in Partner Module")
	public void userShouldBeAbleToDeletePharmaciesInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[@id='deletePartnerModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to view Pharmacies details in Partner Module")
	public void userShouldBeAbleToViewPharmaciesDetailsInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnPartnerSignature']"));

	}

	@And("the user should be able to access Pharmacy Vetting in Partner Module")
	public void userShouldBeAbleToAccessPharmacyVettingInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));

	}

	@And("the user should not be able to add or delete Attorney in Partner Module")
	public void userShouldNotBeAbleToAddOrDeleteAttorneyInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit or delete Attorney in Partner Module")
	public void userShouldNotBeAbleToEditOrDeleteAttorneyInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to view Attorney details in Partner Module")
	public void userShouldNotBeAbleToViewAttorneyDetailsInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(5000);
		assertElementNotPresent(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));

	}

	@And("the user should not be able to add, edit, or delete Attorney in Partner Module")
	public void userShouldNotBeAbleToAddEditOrDeleteAttorneyInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to view Attorney details in Partner Module")
	public void userShouldBeAbleToViewAttorneyDetailsInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));

	}

	@And("the user should not be able to add or edit Attorney in Partner Module")
	public void userShouldNotBeAbleToAddOrEditAttorneyInPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to delete Attorney in Partner Module")
	public void userShouldBeAbleToDeleteAttorneyInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='deletePartnerModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to add Attorney in Partner Module")
	public void userShouldBeAbleToAddAttorneyInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(5000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Partner']"));
		sleep(3000);
		waitAndSendKeys(By.id("Partner_BusinessName"), "Kim Bounds");
		waitAndSendKeys(By.id("Partner_PhoneNumber"), "7798798798");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to access Pharmacy Vetting in Partner Module")
	public void userShouldNotBeAbleToAccessPharmacyVettingInPartnerModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//button[@id='btnPartnerSignature']"));

	}

	@And("the user should not be able to view Pharmacies details in Partner Module")
	public void userShouldNotBeAbleToViewPharmaciesDetailsInPartnerModule() {
		sleep(3000);
		driver.navigate().refresh();
		sleep(3000);
		assertElementNotPresent(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));

	}

	@And("the user should not be able to edit or delete Pharmacies in Partner Module")
	public void userShouldNotBeAbleToEditOrDeletePharmaciesInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit or delete DME Provider in Partner Module")
	public void userShouldNotBeAbleToEditOrDeleteDMEProviderInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=0aea0bb9-656c-4982-8dd5-608af9a00d18");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=0aea0bb9-656c-4982-8dd5-608af9a00d18"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit or delete Rx HUB in Partner Module")
	public void userShouldNotBeAbleToEditOrDeleteRxHUBInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=5a0f3a81-56b8-403d-ad0e-1a493a3f8ab9");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=5a0f3a81-56b8-403d-ad0e-1a493a3f8ab9"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit or delete Federal and State Government in Partner Module")
	public void userShouldNotBeAbleToEditOrDeleteFederalAndStateGovernmentInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=780319d7-d45a-40af-b6a7-c6ee68aa3125");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=780319d7-d45a-40af-b6a7-c6ee68aa3125"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit or delete Employers in Partner Module")
	public void userShouldNotBeAbleToEditOrDeleteEmployersInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=13a6a03f-50fa-4ddc-8893-48a77f74efc7");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=13a6a03f-50fa-4ddc-8893-48a77f74efc7"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or delete Rx HUB in Partner Module")
	public void userShouldNotBeAbleToAddOrDeleteRxHUBInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=5a0f3a81-56b8-403d-ad0e-1a493a3f8ab9");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=5a0f3a81-56b8-403d-ad0e-1a493a3f8ab9"));
		sleep(5000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or delete Federal and State Government in Partner Module")
	public void userShouldNotBeAbleToAddOrDeleteFederalAndStateGovernmentInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=780319d7-d45a-40af-b6a7-c6ee68aa3125");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=780319d7-d45a-40af-b6a7-c6ee68aa3125"));
		sleep(5000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or delete Employers in Partner Module")
	public void userShouldNotBeAbleToAddOrDeleteEmployersInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=13a6a03f-50fa-4ddc-8893-48a77f74efc7");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=13a6a03f-50fa-4ddc-8893-48a77f74efc7"));
		sleep(5000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or edit Rx HUB in Partner Module")
	public void userShouldNotBeAbleToAddOrEditRxHUBInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=5a0f3a81-56b8-403d-ad0e-1a493a3f8ab9");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=5a0f3a81-56b8-403d-ad0e-1a493a3f8ab9"));
		sleep(5000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to add or edit Federal and State Government in Partner Module")
	public void userShouldNotBeAbleToAddOrEditFederalAndStateGovernmentInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=780319d7-d45a-40af-b6a7-c6ee68aa3125");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=780319d7-d45a-40af-b6a7-c6ee68aa3125"));
		sleep(5000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to add or edit Employers in Partner Module")
	public void userShouldNotBeAbleToAddOrEditEmployersInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=13a6a03f-50fa-4ddc-8893-48a77f74efc7");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=13a6a03f-50fa-4ddc-8893-48a77f74efc7"));
		sleep(5000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to add, edit, or delete Rx HUB in Partner Module")
	public void userShouldNotBeAbleToAddEditOrDeleteRxHUBInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=5a0f3a81-56b8-403d-ad0e-1a493a3f8ab9");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=5a0f3a81-56b8-403d-ad0e-1a493a3f8ab9"));
		sleep(5000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add, edit, or delete Federal and State Government in Partner Module")
	public void userShouldNotBeAbleToAddEditOrDeleteFederalAndStateGovernmentInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=780319d7-d45a-40af-b6a7-c6ee68aa3125");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=780319d7-d45a-40af-b6a7-c6ee68aa3125"));
		sleep(5000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add, edit, or delete Employers in Partner Module")
	public void verifyUserCannotAddEditOrDeleteEmployersInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=13a6a03f-50fa-4ddc-8893-48a77f74efc7");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=13a6a03f-50fa-4ddc-8893-48a77f74efc7"));
		sleep(5000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or delete DME Provider in Partner Module")
	public void userShouldNotBeAbleToAddOrDeleteDMEProviderInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=0aea0bb9-656c-4982-8dd5-608af9a00d18");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=0aea0bb9-656c-4982-8dd5-608af9a00d18"));
		sleep(5000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to view DME Provider details in Partner Module")
	public void userShouldNotBeAbleToViewDMEProviderDetailsInPartnerModule() {
		sleep(3000);
		driver.navigate().refresh();
		sleep(3000);
		assertElementNotPresent(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));

	}

	@And("the user should not be able to view Rx HUB details in Partner Module")
	public void userShouldNotBeAbleToViewRxHUBDetailsInPartnerModule() {
		sleep(3000);
		driver.navigate().refresh();
		sleep(3000);
		assertElementNotPresent(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));

	}

	@And("the user should not be able to view Federal and State Government details in Partner Module")
	public void userShouldNotBeAbleToViewFederalAndStateGovernmentDetailsInPartnerModule() {
		sleep(3000);
		driver.navigate().refresh();
		sleep(3000);
		assertElementNotPresent(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));

	}

	@And("the user should not be able to view Employers details in Partner Module")
	public void userShouldNotBeAbleToViewEmployersDetailsInPartnerModule() {
		sleep(3000);
		driver.navigate().refresh();
		sleep(3000);
		assertElementNotPresent(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));

	}

	@And("the user should be able to add Pharmacies in Partner Module")
	public void userShouldBeAbleToAddPharmaciesInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Partner']"));
		sleep(3000);
		waitAndSendKeys(By.id("Partner_BusinessName"), "Kim Bounds");
		waitAndSendKeys(By.id("Partner_PhoneNumber"), "7798798798");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add DME Provider in Partner Module")
	public void userShouldBeAbleToAddDMEProviderInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=0aea0bb9-656c-4982-8dd5-608af9a00d18");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=0aea0bb9-656c-4982-8dd5-608af9a00d18"));
		sleep(5000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Partner']"));
		sleep(3000);
		waitAndSendKeys(By.id("Partner_BusinessName"), "Kim Bounds");
		waitAndSendKeys(By.id("Partner_PhoneNumber"), "7798798798");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add Rx HUB in Partner Module")
	public void userShouldBeAbleToAddRxHUBInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=5a0f3a81-56b8-403d-ad0e-1a493a3f8ab9");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=5a0f3a81-56b8-403d-ad0e-1a493a3f8ab9"));
		sleep(5000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Partner']"));
		sleep(3000);
		waitAndSendKeys(By.id("Partner_BusinessName"), "Kim Bounds");
		waitAndSendKeys(By.id("Partner_PhoneNumber"), "7798798798");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add Federal and State Government in Partner Module")
	public void userShouldBeAbleToAddFederalAndStateGovernmentInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=780319d7-d45a-40af-b6a7-c6ee68aa3125");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=780319d7-d45a-40af-b6a7-c6ee68aa3125"));
		sleep(5000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Partner']"));
		sleep(3000);
		waitAndSendKeys(By.id("Partner_BusinessName"), "Kim Bounds");
		waitAndSendKeys(By.id("Partner_PhoneNumber"), "7798798798");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add Employers in Partner Module")
	public void userShouldBeAbleToAddEmployersInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=13a6a03f-50fa-4ddc-8893-48a77f74efc7");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=13a6a03f-50fa-4ddc-8893-48a77f74efc7"));
		sleep(5000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Partner']"));
		sleep(3000);
		waitAndSendKeys(By.id("Partner_BusinessName"), "Kim Bounds");
		waitAndSendKeys(By.id("Partner_PhoneNumber"), "7798798798");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add Funding Company in Partner Module")
	public void verifyUserCanAddFundingCompany() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=d4211063-cc31-48bd-a4bc-e856ff2ab7d8");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=d4211063-cc31-48bd-a4bc-e856ff2ab7d8"));
		sleep(5000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Partner']"));
		sleep(3000);
		waitAndSendKeys(By.id("Partner_BusinessName"), "Kim Bounds");
		waitAndSendKeys(By.id("Partner_PhoneNumber"), "7798798798");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add Partner License in Partner Module")
	public void verifyUserCanAddPartnerLicenseInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Partner']"));
		sleep(3000);
		waitAndSendKeys(By.id("Partner_BusinessName"), "Kim Bounds");
		waitAndSendKeys(By.id("Partner_PhoneNumber"), "7798798798");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to add or delete Partner Special Event in Partner Module")
	public void verifyUserCannotAddOrDeletePartnerSpecialEvent() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Special Event']"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Special Event']"));
		assertElementNotPresent(By.xpath("(//a[@data-original-title='Delete Partner Special Event'])[1]"));
	}

	@And("the user should not be able to add or edit Partner Special Event in Partner Module")
	public void verifyUserCannotAddOrEditPartnerSpecialEvent() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Special Event']"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Special Event']"));
		assertElementNotPresent(By.xpath("(//a[@data-original-title='Edit Special Event'])[1]"));

	}

	@And("the user should be able to delete Partner Special Event in Partner Module")
	public void verifyUserCanDeletePartnerSpecialEvent() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Special Event']"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//a[@data-original-title='Delete Partner Special Event'])[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='deletePartnerSpecialEvent']"));

	}

	@And("the user should be able to edit Partner Special Event in Partner Module")
	public void verifyUserCanEditPartnerSpecialEvent() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Special Event']"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//a[@data-original-title='Edit Special Event'])[1]"));
		sleep(1000);
		waitAndSendKeys(By.id("PartnerSpecialEvent_Title"), "Event");
		clickWhenClickable(By.xpath("//button[@id='btnSavePartnerSpecialEventPopup']"));

	}

	@And("the user should not be able to edit or delete Partner Special Event in Partner Module")
	public void verifyUserCannotEditOrDeletePartnerSpecialEvent() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Special Event']"));
		sleep(3000);
		assertElementNotPresent(By.xpath("(//a[@data-original-title='Edit Special Event'])[1]"));
		assertElementNotPresent(By.xpath("(//a[@data-original-title='Delete Partner Special Event'])[1]"));

	}

	@And("the user should be able to add Partner Special Event in Partner Module")
	public void verifyUserCanAddPartnerSpecialEvent() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Special Event']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Special Event']"));
		sleep(1000);
		waitAndSendKeys(By.id("PartnerSpecialEvent_Title"), "Event");
		clickWhenClickable(By.xpath("//button[@id='btnSavePartnerSpecialEventPopup']"));

	}

	@And("the user should be able to add Partner Special Service in Partner Module")
	public void verifyUserCanAddPartnerSpecialService() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Special Service']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//select[@id='Partner_SpecialService']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("Partner_SpecialService"), 1);
		sleep(1000);
		clickWhenClickable(By.xpath("//img[@class='v-align-middle']"));

	}

	@And("the user should not be able to edit or delete Partner Special Service in Partner Module")
	public void verifyUserCannotEditOrDeletePartnerSpecialService() {
		sleep(3000);
		assertElementNotPresent(By.xpath("(//a[@data-original-title='Edit Special Service'])[1]"));
		assertElementNotPresent(By.xpath("(//a[@data-original-title='Delete Partner Special Service'])[1]"));

	}

	@And("the user should not be able to add or delete Partner Special Service in Partner Module")
	public void verifyUserCannotAddOrDeletePartnerSpecialService() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//img[@class='v-align-middle']"));
		assertElementNotPresent(By.xpath("(//a[@data-original-title='Delete Partner Special Service'])[1]"));

	}

	@And("the user should not be able to add or edit Partner Special Service in Partner Module")
	public void verifyUserCannotAddOrEditPartnerSpecialService() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//img[@class='v-align-middle']"));
		assertElementNotPresent(By.xpath("(//a[@data-original-title='Edit Special Service'])[1]"));

	}

	@And("the user should not be able to add or edit Partner Special Hour in Partner Module")
	public void verifyUserCannotAddOrEditPartnerSpecialHour() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Special Hour']"));
		assertElementNotPresent(By.xpath("(//a[contains(@data-original-title,'Edit Special Hour')])[1]"));

	}

	@And("the user should not be able to add or edit Partner Agreement in Partner Module")
	public void verifyUserCannotAddOrEditPartnerAgreement() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//img[@id='btnAddPartnerAgreement']"));
		assertElementNotPresent(
				By.xpath("(//a[contains(@onclick, 'editPartnerAgreement') and contains(@class, 'user-access')])[1]"));

	}

	@Then("the user should be able to update DeDupe records in Partners Module")
	public void userShouldBeAbleToUpdateDeDupeRecordsInPartnersModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/DeDupePartners");
		wait.until(ExpectedConditions.urlContains("/Partner/Home/DeDupePartners"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Phone Number']"));
		clickWhenClickable(By.xpath("//span[normalize-space()='Find Duplicate']"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//label[starts-with(@for,'ckhg_')])[1]"));
		clickWhenClickable(By.xpath("(//label[starts-with(@for,'ckhg_')])[2]"));
		clickWhenClickable(By.xpath("//table[1]//thead[1]//tr[1]//th[8]//a[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//input[starts-with(@id,'chkg_')])[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Next']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Next']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Finish']"));

	}

	@Then("the user should not be able to update DeDupe records in Partners Module via UI or direct URL")
	public void userShouldNotBeAbleToUpdateDeDupeRecordsInPartnersModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/DeDupePartners");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}

	}

	@And("the user should not be able to add or delete Partner Agreement in Partner Module")
	public void verifyUserCannotAddOrDeletePartnerAgreement() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//img[@id='btnAddPartnerAgreement']"));
		assertElementNotPresent(By.xpath("(//a[@id='btnDeletePartnerAgreement'])[1]"));

	}

	@And("the user should not be able to edit or delete Partner Agreement in Partner Module")
	public void verifyUserCannotEditOrDeletePartnerAgreement() {
		sleep(3000);
		assertElementNotPresent(
				By.xpath("(//a[contains(@onclick, 'editPartnerAgreement') and contains(@class, 'user-access')])[1]"));
		assertElementNotPresent(By.xpath("(//a[@id='btnDeletePartnerAgreement'])[1]"));

	}

	@And("the user should not be able to add or delete Partner Special Hour in Partner Module")
	public void verifyUserCannotAddOrDeletePartnerSpecialHour() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Special Hour']"));
		assertElementNotPresent(By.xpath("(//a[@id='btnDeletePartnerSpecialHour'])[1]"));

	}

	@And("the user should not be able to edit or delete Partner Special Hour in Partner Module")
	public void verifyUserCannotEditOrDeletePartnerSpecialHour() {
		sleep(3000);
		assertElementNotPresent(By.xpath("(//a[contains(@data-original-title,'Edit Special Hour')])[1]"));
		assertElementNotPresent(By.xpath("(//a[@id='btnDeletePartnerSpecialHour'])[1]"));

	}

	@And("the user should be able to delete Partner Special Service in Partner Module")
	public void verifyUserCanDeletePartnerSpecialService() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Special Service']"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//a[@data-original-title='Delete Partner Special Service'])[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='deletePartnerSpecialService']"));

	}

	@And("the user should be able to delete Partner Special Hour in Partner Module")
	public void verifyUserCanDeletePartnerSpecialHour() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//a[@id='btnDeletePartnerSpecialHour'])[1]"));
		clickWhenClickable(By.xpath("//button[@id='deletePartnerSpecialHour']"));

	}

	@And("the user should be able to delete Partner Agreement in Partner Module")
	public void verifyUserCanDeletePartnerAgreement() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//a[@id='btnDeletePartnerAgreement'])[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='deletePartnerAgreement']"));

	}

	@And("the user should be able to edit Partner Agreement in Partner Module")
	public void verifyUserCanEditPartnerAgreement() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(
				By.xpath("(//a[contains(@onclick, 'editPartnerAgreement') and contains(@class, 'user-access')])[1]"));
		WebElement endDateInput = driver.findElement(By.id("PartnerAgreement_EndDate"));
		endDateInput.clear();
		endDateInput.sendKeys("11/05/2025");
		endDateInput.sendKeys(Keys.ENTER);
		clickWhenClickable(By.xpath("//button[@id='btnSavePartnerAgreementPopup']"));

	}

	@And("the user should be able to add Partner Agreement in Partner Module")
	public void verifyUserCanAddPartnerAgreement() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		WebElement startDateInput = driver.findElement(By.id("Partner_PartnerAgreement_StartDate"));
		startDateInput.clear();
		startDateInput.sendKeys("11/05/2025");
		startDateInput.sendKeys(Keys.ENTER);
		WebElement endDateInput = driver.findElement(By.id("Partner_PartnerAgreement_EndDate"));
		endDateInput.clear();
		endDateInput.sendKeys("11/30/2025");
		endDateInput.sendKeys(Keys.ENTER);
		clickWhenClickable(By.xpath("//img[@id='btnAddPartnerAgreement']"));

	}

	@And("the user should be able to edit Partner Special Hour in Partner Module")
	public void verifyUserCanEditPartnerSpecialHour() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//a[contains(@data-original-title,'Edit Special Hour')])[1]"));
		sleep(3000);
		WebElement dateField = driver.findElement(By.id("PartnerSpecialHour_SpecialDay"));
		dateField.clear();
		dateField.sendKeys("11/05/2025");
		dateField.sendKeys(Keys.TAB);
		clickWhenClickable(By.xpath("//label[normalize-space()='Closed?']"));
		clickWhenClickable(By.xpath("//button[@id='btnSavePartnerSpecialHourPopup']"));
	}

	@And("the user should be able to add Partner Special Hour in Partner Module")
	public void verifyUserCanAddPartnerSpecialHour() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Special Hour']"));
		sleep(3000);
		WebElement dateField = driver.findElement(By.id("PartnerSpecialHour_SpecialDay"));
		dateField.clear();
		dateField.sendKeys("11/05/2025");
		dateField.sendKeys(Keys.TAB);
		clickWhenClickable(By.xpath("//button[@id='btnSavePartnerSpecialHourPopup']"));

	}

	@And("the user should be able to edit Partner Special Service in Partner Module")
	public void verifyUserCanEditPartnerSpecialService() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Special Service']"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//a[@data-original-title='Edit Special Service'])[1]"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("PartnerSpecialService_Status"), 1);
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSavePartnerSpecialServicePopup']"));

	}

	@And("the user should not be able to download files in Partner License in Partner Module")
	public void verifyUserCannotDownloadFilesInPartnerLicenseInPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("(//a[@id='btneditPartnerLicense'])[1]"));

	}

	@And("the user should not be able to add or delete Partner License in Partner Module")
	public void verifyUserCannotAddOrDeletePartnerLicenseInPartnerModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Partner License']"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner License']"));
		assertElementNotPresent(By.xpath("(//a[@id='btnDeletePartnerLicense'])[1]"));

	}

	@And("the user should not be able to add or edit Partner License in Partner Module")
	public void verifyUserCannotAddOrEditPartnerLicenseInPartnerModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Partner License']"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner License']"));
		assertElementNotPresent(By.xpath("(//a[@id='btneditPartnerLicense'])[1]"));
	}

	@And("the user should not be able to add, edit, or delete Partner License in Partner Module")
	public void verifyUserCannotAddEditOrDeletePartnerLicenseInPartnerModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Partner License']"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner License']"));
		assertElementNotPresent(By.xpath("(//a[@id='btneditPartnerLicense'])[1]"));
		assertElementNotPresent(By.xpath("(//a[@id='btnDeletePartnerLicense'])[1]"));

	}

	@And("the user should not be able to add, delete Partner License in Partner Module")
	public void verifyUserCannotAddOrDeletePartnerLicense() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Partner License']"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner License']"));
		assertElementNotPresent(By.xpath("(//a[@id='btnDeletePartnerLicense'])[1]"));

	}

	@And("the user should be able to download files in Partner License in Partner Module")
	public void verifyUserCanDownloadFilesInPartnerLicenseInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Partner License']"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//a[@id='btneditPartnerLicense'])[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//img[@class='ml-3 mr-2']"));

	}

	@And("the user should be able to view Partner License details in Partner Module")
	public void verifyUserCanViewPartnerLicenseDetailsInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Partner License']"));
		sleep(2000);

	}

	@And("the user should be able to delete Partner License in Partner Module")
	public void verifyUserCanDeletePartnerLicenseInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Partner License']"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//a[@id='btnDeletePartnerLicense'])[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to edit Partner License in Partner Module")
	public void verifyUserCanEditPartnerLicenseInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Partner License']"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//a[@id='btneditPartnerLicense'])[1]"));
		sleep(3000);
		waitAndSendKeys(By.id("PartnerLicense_LicenseNumber"), "55");
		clickWhenClickable(By
				.xpath("//div[@class='modal-dialog modal-dialog-centered modalLaptopCenter']//button[@id='btnSave']"));

	}

	@And("the user should not be able to view Partner License details in Partner Module")
	public void verifyUserCannotViewPartnerLicenseDetailsInPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("(//a[@id='btneditPartnerLicense'])[1]"));

	}

	@And("the user should not be able to edit or delete Partner License in Partner Module")
	public void verifyUserCannotEditOrDeletePartnerLicenseInPartnerModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Partner License']"));
		sleep(1000);
		assertElementNotPresent(By.xpath("(//a[@id='btneditPartnerLicense'])[1]"));
		assertElementNotPresent(By.xpath("(//a[@id='btnDeletePartnerLicense'])[1]"));
	}

	@And("the user should not be able to edit or delete Funding Company in Partner Module")
	public void verifyUserCannotEditOrDeleteFundingCompany() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=d4211063-cc31-48bd-a4bc-e856ff2ab7d8");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=d4211063-cc31-48bd-a4bc-e856ff2ab7d8"));
		sleep(5000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Edit']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));

	}

	@And("the user should not be able to add or delete Funding Company in Partner Module")
	public void verifyUserCannotAddOrDeleteFundingCompany() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=d4211063-cc31-48bd-a4bc-e856ff2ab7d8");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=d4211063-cc31-48bd-a4bc-e856ff2ab7d8"));
		sleep(5000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));

	}

	@And("the user should not be able to add or edit Funding Company in Partner Module")
	public void verifyUserCannotAddOrEditFundingCompany() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=d4211063-cc31-48bd-a4bc-e856ff2ab7d8");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=d4211063-cc31-48bd-a4bc-e856ff2ab7d8"));
		sleep(5000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to view Funding Company details in Partner Module")
	public void verifyUserCanViewFundingCompanyDetails() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=d4211063-cc31-48bd-a4bc-e856ff2ab7d8");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=d4211063-cc31-48bd-a4bc-e856ff2ab7d8"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);

	}

	@And("the user should not be able to add, edit, or delete Funding Company in Partner Module")
	public void verifyUserCannotAddEditOrDeleteFundingCompany() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=d4211063-cc31-48bd-a4bc-e856ff2ab7d8");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=d4211063-cc31-48bd-a4bc-e856ff2ab7d8"));
		sleep(5000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to delete Funding Company in Partner Module")
	public void verifyUserCanDeleteFundingCompany() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=d4211063-cc31-48bd-a4bc-e856ff2ab7d8");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=d4211063-cc31-48bd-a4bc-e856ff2ab7d8"));
		sleep(5000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(3000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//div[@id='deletePartnerModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to edit Funding Company in Partner Module")
	public void verifyUserCanEditFundingCompany() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=d4211063-cc31-48bd-a4bc-e856ff2ab7d8");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=d4211063-cc31-48bd-a4bc-e856ff2ab7d8"));
		sleep(5000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Edit']"));
		sleep(3000);
		waitAndSendKeys(By.id("Partner_BusinessName"), "Kim Bounds");
		waitAndSendKeys(By.id("Partner_PhoneNumber"), "7798798798");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
	}

	@And("the user should not be able to view Funding Company details in Partner Module")
	public void verifyUserCannotViewFundingCompanyDetails() {
		sleep(3000);
		driver.navigate().refresh();
		assertElementNotPresent(By.xpath(
				"//tbody/tr/td/div[@class='gridListIconsFlex justify-content-end']/a[@id='liPartners_d4211063-cc31-48bd-a4bc-e856ff2ab7d8']/img[1]"));

	}

	@And("the user should be able to add Referral Enrollment in Partner Module")
	public void verifyUserCanAddReferralEnrollment() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@role='tab'][normalize-space()='Referral']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Referral Enrollment']"));
		sleep(2000);
		WebElement startDateInput = driver.findElement(By.id("PartnerReferralEnrollment_StartDate"));
		startDateInput.clear();
		startDateInput.sendKeys("11/03/2025");
		startDateInput.sendKeys(Keys.TAB);
		waitAndSendKeys(By.id("PartnerReferralEnrollment_EmailId"), "SarahDWillis@mailinator.com");
		clickWhenClickable(By.xpath("//button[@id='btnSavePartnerReferralEnrollmentPopup']"));

	}

	@And("the user should not be able to edit or delete Referral Enrollment in Partner Module")
	public void verifyUserCannotEditOrDeleteReferralEnrollment() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@role='tab'][normalize-space()='Referral']"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"(//div[@class='gridListIconsFlex justify-content-end']//a[contains(@onclick,'editPartnerReferralEnrollment')])[1]"));
		assertElementNotPresent(By.xpath(
				"(//div[@class='gridListIconsFlex justify-content-end']//a[@id='btnDeletePartnerReferralEnrollment'])[1]"));

	}

	@And("the user should be able to edit Referral Enrollment in Partner Module")
	public void verifyUserCanEditReferralEnrollment() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@role='tab'][normalize-space()='Referral']"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"(//div[@class='gridListIconsFlex justify-content-end']//a[contains(@onclick,'editPartnerReferralEnrollment')])[1]"));
		sleep(2000);
		WebElement startDateInput = driver.findElement(By.id("PartnerReferralEnrollment_StartDate"));
		startDateInput.clear();
		startDateInput.sendKeys("11/03/2025");
		startDateInput.sendKeys(Keys.TAB);
		waitAndSendKeys(By.id("PartnerReferralEnrollment_EmailId"), "SarahDWillis@mailinator.com");
		clickWhenClickable(By.xpath("//button[@id='btnSavePartnerReferralEnrollmentPopup']"));

	}

	@And("the user should be able to delete Referral Enrollment in Partner Module")
	public void verifyUserCanDeleteReferralEnrollment() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@role='tab'][normalize-space()='Referral']"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"(//div[@class='gridListIconsFlex justify-content-end']//a[@id='btnDeletePartnerReferralEnrollment'])[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='deletePartnerReferralEnrollment']"));

	}

	@And("the user should be able to download files in Referral Patient History in Partner Module")
	public void verifyUserCanDownloadReferralPatientHistoryFile() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@role='tab'][normalize-space()='Referral']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//img[@class='mr-2']"));
		sleep(2000);

	}

	@And("the user should be able to download files in Referral Incoming Details in Partner Module")
	public void verifyUserCanDownloadReferralIncomingDetailsFile() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@role='tab'][normalize-space()='Referral']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='View All Referrals']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Export to Excel']"));

	}

	@And("the user should be able to download files in Referral Outgoing Details in Partner Module")
	public void verifyUserCanDownloadReferralOutgoingDetailsFile() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@role='tab'][normalize-space()='Referral']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='View All Referrals']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Outgoing']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//img[@class='mr-2']"));

	}

	@And("the user should not be able to download files in Referral Outgoing Details in Partner Module")
	public void verifyUserCannotDownloadReferralOutgoingDetailsFile() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@role='tab'][normalize-space()='Referral']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='View All Referrals']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Outgoing']"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//img[@class='mr-2']"));

	}

	@And("the user should be able to export Excel files in Partner PA Details in Partner Module")
	public void verifyUserCanExportExcelInPartnerPADetails() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='History']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='View All PA']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[normalize-space()='Export to Excel']"));
		sleep(3000);

	}

	@And("the user should not be able to export Excel files in Partner PA Details in Partner Module")
	public void verifyUserCannotExportExcelInPartnerPADetails() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='History']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='View All PA']"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//button[normalize-space()='Export to Excel']"));
		sleep(3000);

	}

	@And("the user should not be able to download files in Referral Incoming Details in Partner Module")
	public void verifyUserCannotDownloadReferralIncomingDetailsFile() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@role='tab'][normalize-space()='Referral']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='View All Referrals']"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//img[@class='mr-2']"));

	}

	@And("the user should not be able to download files in Referral Patient History in Partner Module")
	public void verifyUserCannotDownloadReferralPatientHistoryFile() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@role='tab'][normalize-space()='Referral']"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//img[@class='mr-2']"));
		sleep(2000);

	}

	@And("the user should not be able to add or edit Referral Enrollment in Partner Module")
	public void verifyUserCannotAddOrEditReferralEnrollment() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@role='tab'][normalize-space()='Referral']"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Referral Enrollment']"));
		assertElementNotPresent(By.xpath(
				"(//div[@class='gridListIconsFlex justify-content-end']//a[contains(@onclick,'editPartnerReferralEnrollment')])[1]"));

	}

	@And("the user should not be able to add or delete Referral Enrollment in Partner Module")
	public void verifyUserCannotAddOrDeleteReferralEnrollment() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@role='tab'][normalize-space()='Referral']"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Referral Enrollment']"));
		assertElementNotPresent(By.xpath(
				"(//div[@class='gridListIconsFlex justify-content-end']//a[@id='btnDeletePartnerReferralEnrollment'])[1]"));

	}

	@And("the user should be able to edit Rx HUB in Partner Module")
	public void userShouldBeAbleToEditRxHUBInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=5a0f3a81-56b8-403d-ad0e-1a493a3f8ab9");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=5a0f3a81-56b8-403d-ad0e-1a493a3f8ab9"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Wednesday']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to edit Federal and State Government in Partner Module")
	public void userShouldBeAbleToEditFederalAndStateGovernmentInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=780319d7-d45a-40af-b6a7-c6ee68aa3125");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=780319d7-d45a-40af-b6a7-c6ee68aa3125"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Wednesday']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to edit Employers in Partner Module")
	public void userShouldBeAbleToEditEmployersInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=13a6a03f-50fa-4ddc-8893-48a77f74efc7");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=13a6a03f-50fa-4ddc-8893-48a77f74efc7"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Wednesday']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to edit DME Provider in Partner Module")
	public void userShouldBeAbleToEditDMEProviderInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=0aea0bb9-656c-4982-8dd5-608af9a00d18");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=0aea0bb9-656c-4982-8dd5-608af9a00d18"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Wednesday']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to view DME Provider details in Partner Module")
	public void userShouldBeAbleToViewDMEProviderDetailsInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=0aea0bb9-656c-4982-8dd5-608af9a00d18");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=0aea0bb9-656c-4982-8dd5-608af9a00d18"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));

	}

	@And("the user should be able to delete DME Provider in Partner Module")
	public void userShouldBeAbleToDeleteDMEProviderInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=0aea0bb9-656c-4982-8dd5-608af9a00d18");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=0aea0bb9-656c-4982-8dd5-608af9a00d18"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Delete']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//div[@id='deletePartnerModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to delete Rx HUB in Partner Module")
	public void userShouldBeAbleToDeleteRxHUBInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=5a0f3a81-56b8-403d-ad0e-1a493a3f8ab9");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=5a0f3a81-56b8-403d-ad0e-1a493a3f8ab9"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Delete']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//div[@id='deletePartnerModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to delete Federal and State Government in Partner Module")
	public void userShouldBeAbleToDeleteFederalAndStateGovernmentInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=780319d7-d45a-40af-b6a7-c6ee68aa3125");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=780319d7-d45a-40af-b6a7-c6ee68aa3125"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Delete']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//div[@id='deletePartnerModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to delete Employers in Partner Module")
	public void userShouldBeAbleToDeleteEmployersInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=13a6a03f-50fa-4ddc-8893-48a77f74efc7");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=13a6a03f-50fa-4ddc-8893-48a77f74efc7"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Delete']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//div[@id='deletePartnerModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to view Rx HUB details in Partner Module")
	public void userShouldBeAbleToViewRxHUBDetailsInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=5a0f3a81-56b8-403d-ad0e-1a493a3f8ab9");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=5a0f3a81-56b8-403d-ad0e-1a493a3f8ab9"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));

	}

	@And("the user should be able to view Federal and State Government details in Partner Module")
	public void userShouldBeAbleToViewFederalAndStateGovernmentDetailsInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=780319d7-d45a-40af-b6a7-c6ee68aa3125");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=780319d7-d45a-40af-b6a7-c6ee68aa3125"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));

	}

	@And("the user should be able to view Employers details in Partner Module")
	public void verifyUserCanViewEmployersDetailsInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=13a6a03f-50fa-4ddc-8893-48a77f74efc7");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=13a6a03f-50fa-4ddc-8893-48a77f74efc7"));
		sleep(5000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));

	}

	@And("the user should not be able to add or edit DME Provider in Partner Module")
	public void userShouldNotBeAbleToAddOrEditDMEProviderInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=0aea0bb9-656c-4982-8dd5-608af9a00d18");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=0aea0bb9-656c-4982-8dd5-608af9a00d18"));
		sleep(5000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to add, edit, or delete DME Provider in Partner Module")
	public void userShouldNotBeAbleToAddEditOrDeleteDMEProviderInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=0aea0bb9-656c-4982-8dd5-608af9a00d18");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=0aea0bb9-656c-4982-8dd5-608af9a00d18"));
		sleep(5000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add, edit, or delete Executive in Partner Module")
	public void verifyUserCannotAddEditOrDeleteExecutiveInPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Executive']"));
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Edit']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));

	}

	@And("the user should not be able to add or delete Pharmacies in Partner Module")
	public void userShouldNotBeAbleToAddOrDeletePharmaciesInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or edit Pharmacies in Partner Module")
	public void userShouldNotBeAbleToAddOrEditPharmaciesInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to add, edit, or delete Pharmacies in Partner Module")
	public void userShouldNotBeAbleToAddEditOrDeletePharmaciesInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add, edit, delete, or view Pharmacies details in Partner Module")
	public void userShouldNotBeAbleToAddEditDeleteOrViewPharmaciesDetailsInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		sleep(5000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Partner']"));
		assertElementNotPresent(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to favourite Folder in Bucket for Partner Module")
	public void userShouldBeAbleToFavouriteFolderInBucketForPartnerModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//img[@src='/Content/img/black-bookmark.png']"));

	}

	@And("the user should not be able to favourite Folder in Bucket for Partner Module")
	public void userShouldNotBeAbleToFavouriteFolderInBucketForPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//a//img[@class='pl-1']"));

	}

	@And("the user should not be able to delete Folder in Bucket for Partner Module")
	public void userShouldNotBeAbleToDeleteFolderInBucketForPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteFolder']//img"));

	}

	@And("the user should not be able to edit Folder in Bucket for Partner Module")
	public void userShouldNotBeAbleToEditFolderInBucketForPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//img[@class='aaa']"));

	}

	@And("the user should not be able to add Folder in Bucket for Partner Module")
	public void userShouldNotBeAbleToAddFolderInBucketForPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[@id='btnAddFolder']"));

	}

	@And("the user should not be able to view Folder in Bucket for Partner Module")
	public void userShouldNotBeAbleToViewFolderInBucketForPartnerModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//*[name()='path' and contains(@d,'M575.8 255')]"));
		assertElementNotPresent(By.xpath("//img[@class='aaa']"));

	}

	@And("the user should be able to download File in Bucket for Partner Module")
	public void userShouldBeAbleToDownloadFileInBucketForPartnerModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//img[@class='permitions']"));

	}

	@And("the user should be able to favourite File in Bucket for Partner Module")
	public void userShouldBeAbleToFavouriteFileInBucketForPartnerModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//img[@src='/Content/img/black-bookmark.png']"));

	}

	@And("the user should be able to delete File in Bucket for Partner Module")
	public void userShouldBeAbleToDeleteFileInBucketForPartnerModule() {
		sleep(5000);
		clickWhenClickable(By.xpath("(//a[@id='btnDeleteFile']//img)[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnDeleteFileConfirm']"));

	}

	@And("the user should be able to edit File in Bucket for Partner Module")
	public void userShouldBeAbleToEditFileInBucketForPartnerModule() {
		sleep(3000);
		clickElement(By.xpath("(//img[@class='aaa'])[1]"));
		sleep(3000);
		waitAndSendKeys(By.id("fileNameTextBox"), "3.pdf");
		clickElement(By.xpath("//button[@id='btnSaveFile']"));
		sleep(3000);
		clickElement(
				By.xpath("//button[@onclick='javascript: ClosePartnerAddDocumentFile();']//i[@class='fa fa-times']"));

	}

	@And("the user should be able to add File in Bucket for Partner Module")
	public void userShouldBeAbleToAddFileInBucketForPartnerModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@id='btnAddFile']"));
		sleep(1000);
		String filePath = "C:\\Users\\MayurChauhan\\Downloads\\dummy.pdf";
		WebElement fileInput = driver.findElement(By.xpath("// div[@class='model-inp']//input[@id='file-3']"));
		fileInput.sendKeys(filePath);
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnSaveFile']"));
		sleep(3000);

	}

	@And("the user should be able to view File in Bucket for Partner Module")
	public void userShouldBeAbleToViewFileInBucketForPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@id='93d2dd6a-73cf-423d-815b-43a8ff5886c8']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//img[@class='edit']"));
		sleep(4000);
		clickWhenClickable(By.xpath("//button[@onclick='CloseDocViewer();']//i[@class='fa fa-times']"));

	}

	@And("the user should not be able to download File in Bucket for Partner Module")
	public void userShouldNotBeAbleToDownloadFileInBucketForPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//img[@class='permitions']"));

	}

	@And("the user should not be able to favourite File in Bucket for Partner Module")
	public void userShouldNotBeAbleToFavouriteFileInBucketForPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//img[@src='/Content/img/black-bookmark.png']"));

	}

	@And("the user should not be able to delete File in Bucket for Partner Module")
	public void userShouldNotBeAbleToDeleteFileInBucketForPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteFile']//img"));

	}

	@And("the user should not be able to edit File in Bucket for Partner Module")
	public void userShouldNotBeAbleToEditFileInBucketForPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//img[@class='aaa']"));

	}

	@And("the user should not be able to add File in Bucket for Partner Module")
	public void userShouldNotBeAbleToAddFileInBucketForPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[@id='btnAddFile']"));

	}

	@And("the user should not be able to view File in Bucket for Partner Module")
	public void userShouldNotBeAbleToViewFileInBucketForPartnerModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@id='93d2dd6a-73cf-423d-815b-43a8ff5886c8']"));
		assertElementNotPresent(By.xpath("//img[@class='edit']"));

	}

	@And("the user should be able to delete Folder in Bucket for Partner Module")
	public void userShouldBeAbleToDeleteFolderInBucketForPartnerModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@id='btnDeleteFolder']//img"));
		clickWhenClickable(By.xpath("//div[@id='deleteFolderModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to edit Folder in Bucket for Partner Module")
	public void userShouldBeAbleToEditFolderInBucketForPartnerModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//img[@class='aaa']"));
		waitAndSendKeys(By.id("BucketFolder_FolderName"), "Garrett");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add Folder in Bucket for Partner Module")
	public void userShouldBeAbleToAddFolderInBucketForPartnerModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@id='btnAddFolder']"));
		sleep(1000);
		waitAndSendKeys(By.id("BucketFolder_FolderName"), "Garrett");
		clickWhenClickable(By.xpath("//select[@id='BucketFolder_Type']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("BucketFolder_Type"), 1);
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to view Folder in Bucket for Partner Module")
	public void userShouldBeAbleToViewFolderInBucketForPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		assertElementPresent(By.xpath("//a[@id='93d2dd6a-73cf-423d-815b-43a8ff5886c8']"));

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
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Executive']"));
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Edit']"));
	}

	@And("the user should be able to delete Executive in Partner Module")
	public void verifyUserCanDeleteExecutiveInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Executives']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Delete']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='deletePartnerExecutive']"));

	}

	@And("the user should not be able to add or delete Executive in Partner Module")
	public void verifyUserCannotAddOrDeleteExecutiveInPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Executive']"));
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));
	}

	@And("the user should be able to edit Executive in Partner Module")
	public void verifyUserCanEditExecutiveInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Executives']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Edit']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Contact Person']"));
		clickWhenClickable(By.xpath("//button[@id='btnSavePartnerExecutivePopup']"));

	}

	@And("the user should not be able to edit or delete Executive in Partner Module")
	public void verifyUserCannotEditOrDeleteExecutiveInPartnerModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Edit']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));

	}

	@And("the user should be able to add Executive in Partner Module")
	public void verifyUserCanAddExecutiveInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Executives']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Executive']"));
		sleep(3000);
		waitAndSendKeys(By.id("PartnerExecutive_LastName"), "Garrett");
		waitAndSendKeys(By.id("PartnerExecutive_FirstName"), "Stephanie");
		waitAndSendKeys(By.id("PartnerExecutive_EmailId"), "Stephanie@mailinator.com");
		clickWhenClickable(By.xpath("//button[@id='btnSavePartnerExecutivePopup']"));

	}

	@And("the user should not be able to add or edit Mailing Address in Partner Module")
	public void verifyUserCannotAddOrEditMailingAddressInPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Mailing Address']"));
		assertElementNotPresent(By.xpath(
				"(//div[@id='partner-address-list-mailing']//a[contains(@onclick,'editPartnerAddress') and contains(@data-original-title,'Edit Partner Care Giver Name')])[1]"));

	}

	@And("the user should be able to edit Mailing Address in Partner Module")
	public void verifyUserCanEditMailingAddressInPartnerModule() {
		sleep(3000);
		driver.get(baseUrl + "/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850");
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath(
				"(//div[@id='partner-address-list-mailing']//a[contains(@onclick,'editPartnerAddress') and contains(@data-original-title,'Edit Partner Care Giver Name')])[1]"));
		sleep(3000);
		waitAndSendKeys(By.id("PartnerAddress_ZipCode"), "10003");
		clickWhenClickable(By.xpath("//button[@id='btnSavePartnerAddressPopup']"));

	}

	@And("the user should not be able to edit or delete Mailing Address in Partner Module")
	public void verifyUserCannotEditOrDeleteMailingAddressInPartnerModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"(//div[@id='partner-address-list-mailing']//a[contains(@onclick,'editPartnerAddress') and contains(@data-original-title,'Edit Partner Care Giver Name')])[1]"));
		assertElementNotPresent(By.xpath(
				"(//div[@id='partner-address-list-mailing']//a[@id='btnDeletePartnerAddress' and contains(@data-original-title,'Delete Partner Address')])[1]"));
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
		clickWhenClickable(By.xpath("//span[normalize-space()='New Mailing Address']"));
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
		sleep(2000);
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

	public void clickElement(By locator) {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
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





