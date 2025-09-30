package com.pharmcrm.pharmcrm_product.steps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;

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
import io.cucumber.java.en.When;

public class DeliverySteps {

	String createdEmail;
	String baseUrl = "http://qa01.pharmcrm.com";
	String profileName;

	private WebDriver driver = DrugSteps.driver;
	private WebDriverWait wait = DrugSteps.wait;

	public DeliverySteps() {
		this.driver = DriverFactory.getDriver();
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	@Given("I log in as admin for Delivery Module")
	public void iLogInAsAdminForDeliveryModule() {
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

	@When("I create a new user with email for Delivery Module {string}")
	public void iCreateANewUserWithEmailForDeliveryModule(String email) {
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

	@And("I create a profile with View access only to Delivery Module General Audit View")
	public void iCreateAProfileWithViewAccessOnlyToDeliveryModuleGeneralAuditView() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with No access to Delivery Module General Audit View")
	public void iCreateAProfileWithNoAccessToDeliveryModuleGeneralAuditView() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg37DeliveryAuditView']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access only to Delivery Module Delivery Distances")
	public void iCreateProfileWithViewAndAddAccessOnlyToDeliveryDistances() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg04DeliveryDistancesAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access only to Delivery Module Delivery Marker")
	public void iCreateProfileWithViewAndDeleteAccessToDeliveryMarker() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg44DeliveryMarkerDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access only to Delivery Module Package")
	public void createProfileWithViewAndAddAccessForPackage() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg04PackageAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg04PackageAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access only to Delivery Module Package")
	public void createProfileWithViewAndEditAccessForPackage() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg04PackageAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg04PackageEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access only to Delivery Module Manifest")
	public void createProfileWithViewAndEditAccessForManifest() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg04ManifestAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg04ManifestEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access only to Delivery Module Manifest")
	public void createProfileWithViewAndDeleteAccessForManifest() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg04ManifestAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg04ManifestDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Print and Send for Signature access to Delivery Module Customer Attestation")
	public void createProfileWithPrintAndSendForSignatureAccessForCustomerAttestation() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg44DeliveryMarkerDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Delivery Module Delivery Job Setting")
	public void createProfileWithEditAccessForDeliveryJobSetting() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg44DeliveryMarkerDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View-only access to Delivery Module Delivery Statistic Report")
	public void createProfileWithViewOnlyAccessForDeliveryStatisticReport() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg44DeliveryMarkerDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Export access to Delivery Module Delivery Statistic Report")
	public void createProfileWithViewAndExportAccessForDeliveryStatisticReport() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg44DeliveryMarkerDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View-only access to Delivery Module Manifest Summary Report")
	public void createProfileWithViewOnlyAccessForManifestSummaryReport() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg44DeliveryMarkerDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Export access to Delivery Module Manifest Summary Report")
	public void createProfileWithViewAndExportAccessForManifestSummaryReport() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg44DeliveryMarkerDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View-only access to Delivery Module Delivery Report")
	public void createProfileWithViewOnlyAccessForDeliveryReport() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg44DeliveryMarkerDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Export access to Delivery Module Delivery Report")
	public void createProfileWithViewAndExportAccessForDeliveryReport() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg44DeliveryMarkerDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Run Trigger access only to Delivery Module Delivery Job Setting")
	public void createProfileWithRunTriggerAccessForDeliveryJobSetting() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg44DeliveryMarkerDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Delivery Module Customer Attestation")
	public void createProfileWithDeleteAccessForCustomerAttestation() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg5CustomerAttestationAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg5CustomerAttestationDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Delivery Module Customer Attestation")
	public void createProfileWithEditAccessForCustomerAttestation() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg5CustomerAttestationAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg5CustomerAttestationEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Delivery Module Customer Attestation")
	public void createProfileWithAddAccessForCustomerAttestation() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg5CustomerAttestationAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg5CustomerAttestationAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Full Access for Manifest to Delivery Module Manifest")
	public void createProfileWithFullAccessForManifest() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access only to Delivery Module Manifest")
	public void createProfileWithViewAndAddAccessForManifest() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg04ManifestAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg04ManifestAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without access to Delivery Module Delivery Identifier")
	public void createProfileWithoutAccessForDeliveryIdentifier() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg04DeliveryIdentifierView']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View-only access to Delivery Module Delivery Identifier")
	public void createProfileWithViewOnlyAccessForDeliveryIdentifier() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without access to Delivery Module Package Plan Restriction")
	public void createProfileWithoutAccessForPackagePlanRestriction() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg01PackagePlanRestriction']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Update access to Delivery Module Package Plan Restriction")
	public void createProfileWithViewAndUpdateAccessForPackagePlanRestriction() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without access to Delivery Module Delivery Setting")
	public void createProfileWithoutAccessForDeliverySetting() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg04DeliverySettingView']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg45PackageRestrictionView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg04DeliveryDistancesView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg04LogisticView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg44DeliveryMarkerView']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Update access to Delivery Module Delivery Setting")
	public void createProfileWithViewAndUpdateAccessForDeliverySetting() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg45PackageRestrictionView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg04DeliveryDistancesView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg04LogisticView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg44DeliveryMarkerView']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Full Access for Package to Delivery Module Package")
	public void createProfileWithFullAccessForPackage() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Billing Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg04PackageAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg04PackageEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg04PackageDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access only to Delivery Module Package")
	public void createProfileWithViewAndDeleteAccessForPackage() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg04PackageAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg04PackageDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access only to Delivery Module Delivery Marker")
	public void iCreateProfileWithViewAndEditAccessToDeliveryMarker() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg44DeliveryMarkerEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access only to Delivery Module Delivery Marker")
	public void iCreateProfileWithViewAndAddAccessToDeliveryMarker() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg44DeliveryMarkerAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access only to Delivery Module Logistic Company")
	public void iCreateProfileWithViewAndDeleteAccessToLogisticCompany() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg04LogisticDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access only to Delivery Module Logistic Company")
	public void iCreateProfileWithViewAndEditAccessToLogisticCompany() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg04LogisticEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access only to Delivery Module Logistic Company")
	public void iCreateProfileWithViewAndAddAccessToLogisticCompany() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg04LogisticAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access only to Delivery Module Delivery Distances")
	public void iCreateProfileWithViewAndDeleteAccessOnlyToDeliveryDistances() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg04DeliveryDistancesDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access only to Delivery Module Delivery Distances")
	public void iCreateProfileWithViewAndEditAccessOnlyToDeliveryDistances() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg04DeliveryDistancesEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete Package Restriction State access to Delivery Module Package Restriction")
	public void iCreateProfileWithViewAndDeleteStateAccessToPackageRestriction() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Delete Package Restriction State']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete Package Restriction Plan access to Delivery Module Package Restriction")
	public void iCreateProfileWithViewAndDeletePlanAccessToPackageRestriction() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Delete Package Restriction Plan']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Delivery Module Package Restriction")
	public void iCreateProfileWithViewAndAddAccessToPackageRestriction() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg45PackageRestrictionAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with No access to Delivery Module Package Settings")
	public void iCreateAProfileWithNoAccessToDeliveryModulePackageSettings() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Update access only to Delivery Module Package Settings")
	public void iCreateAProfileWithUpdateAccessOnlyToDeliveryModulePackageSettings() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Delivery Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg18PackageSetting']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I assign the profile and workspace to the user for Delivery Module")
	public void iAssignTheProfileAndWorkspaceToTheUserForDeliveryModule() {
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

	@And("I reset the user's password for Delivery Module")
	public void iResetTheUsersPasswordForDeliveryModule() {
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

	@And("I log in using the new user for Delivery Module")
	public void iLogInUsingTheNewUserForDeliveryModule() {
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

	@And("the user should be able to view General Audit View settings in Delivery Module")
	public void theUserShouldBeAbleToViewGeneralAuditViewSettingsInDeliveryModule() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Packages?category=1");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Packages?category=1"));
		sleep(3000);
		assertElementPresent(By.xpath("//th[normalize-space()='Updated By']"));
		assertElementPresent(By.xpath("//th[normalize-space()='Updated Date']"));

	}

	@And("the user should not be able to add or edit Delivery Marker in Delivery Module")
	public void userShouldNotBeAbleToAddOrEditDeliveryMarker() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Logistic Company']"));
		sleep(1000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to view and delete Delivery Marker in Delivery Module")
	public void userShouldBeAbleToViewAndDeleteDeliveryMarker() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeliveryMarkers");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryMarkers"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='submitDeleteDeliveryMarker']"));

	}

	@And("the user should be able to download Attestation Documents in Delivery Module")
	public void verifyUserCanDownloadAttestationDocuments() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Customer Attestation']"));
		sleep(2000);

		waitAndSendKeys(By.id("PackageCustomerAttestation_RxNumber"), "RX7845123");
		waitAndSendKeys(By.id("PackageCustomerAttestation_PatientName"), "John A. Smith");
		waitAndSendKeys(By.id("PackageCustomerAttestation_Medication"), "Atorvastatin 20mg Tablet");
		waitAndSendKeys(By.id("PackageCustomerAttestation_ReceivedFrom"), "CVS Pharmacy");

		clickWhenClickable(By.xpath(
				"//div[@id='addPackageCustomerAttestationModal']//input[@id='PackageCustomerAttestation_FilledDate']"));

		LocalDate filledFutureDate = LocalDate.now().plusDays(5);
		int filledDay = filledFutureDate.getDayOfMonth();
		int filledYear = filledFutureDate.getYear();
		String filledMonth = filledFutureDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement filledYearDropdown = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[contains(@class,'ui-datepicker-year')]")));
		new Select(filledYearDropdown).selectByVisibleText(String.valueOf(filledYear));

		WebElement filledMonthDropdown = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[contains(@class,'ui-datepicker-month')]")));
		new Select(filledMonthDropdown).selectByVisibleText(filledMonth);

		WebElement filledDateToSelect = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//td[normalize-space()='" + filledDay + "']")));
		filledDateToSelect.click();
		sleep(2000);

		clickWhenClickable(By.xpath(
				"//div[@id='addPackageCustomerAttestationModal']//input[@id='PackageCustomerAttestation_ReceivedDate']"));

		LocalDate receivedFutureDate = LocalDate.now().plusDays(5);
		int receivedDay = receivedFutureDate.getDayOfMonth();
		int receivedYear = receivedFutureDate.getYear();
		String receivedMonth = receivedFutureDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);

		WebElement receivedYearDropdown = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[contains(@class,'ui-datepicker-year')]")));
		new Select(receivedYearDropdown).selectByVisibleText(String.valueOf(receivedYear));

		WebElement receivedMonthDropdown = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[contains(@class,'ui-datepicker-month')]")));
		new Select(receivedMonthDropdown).selectByVisibleText(receivedMonth);

		WebElement receivedDateToSelect = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//td[normalize-space()='" + receivedDay + "']")));
		receivedDateToSelect.click();
		sleep(2000);

		waitAndSendKeys(By.id("PackageCustomerAttestation_AddressReceiver"),
				"742 Evergreen Terrace, Springfield, IL 62704");
		waitAndSendKeys(By.id("PackageCustomerAttestation_ReceiverName"), "Mary Smith");
		waitAndSendKeys(By.id("PackageCustomerAttestation_PatientRelation"), "Spouse");
		waitAndSendKeys(By.id("PackageCustomerAttestation_PhoneNumber"), "2175558945");

		clickWhenClickable(By.xpath(
				"//div[@id='addPackageCustomerAttestationModal']//button[@id='btnSavePackageCustomerAttestation']"));
	}

	@And("the user should be able to sync Logistic Tracking History in Delivery Module")
	public void verifyUserCanSyncLogisticTrackingHistory() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Packages?category=1");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Packages?category=1"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Filter']"));
		sleep(3000);
		selectDropdownByIndexWhenReady(By.id("Filter_LogisticId"), 1);
		sleep(3000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[12]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[normalize-space()='Sync Logistic History']"));

	}

	@And("the user should be able to print Pickup Package in Delivery Module")
	public void verifyUserCanPrintPickupPackage() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Packages?category=2");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Packages?category=2"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Print Pickup Packages']"));
		sleep(3000);
		((JavascriptExecutor) DriverFactory.getDriver()).executeScript("window.print();");
		System.out.println("Patient signature PDF auto-saved in Downloads folder");
		sleep(3000);
		clickWhenClickable(
				By.xpath("//button[@onclick='return CloseGenerateCollectionLabel()']//i[@class='fa fa-times']"));

	}

	@And("the user should be able to share Package in Delivery Module")
	public void verifyUserCanSharePackage() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Packages?category=1");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Packages?category=1"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[2]/td[12]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Share To Harbour')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnShareConfirm']"));

	}

	@And("the user should be able to print Package in Delivery Module")
	public void verifyUserCanPrintPackage() {
		sleep(5000);
		driver.get(baseUrl + "/Delivery/Home/Packages?category=1");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Packages?category=1"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[5]/td[12]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//div[@class='mb-5']//button[@type='button'][normalize-space()='Print']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Package Information']"));
		sleep(3000);
		((JavascriptExecutor) DriverFactory.getDriver()).executeScript("window.print();");
		System.out.println("Patient signature PDF auto-saved in Downloads folder");
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@onclick='javascript: ClosePrintModal();']//i[@class='fa fa-times']"));

	}

	@And("the user should be able to generate Package Invoice in Delivery Module")
	public void verifyUserCanGeneratePackageInvoice() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Packages?category=1");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Packages?category=1"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[3]/td[12]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[normalize-space()='Generate Invoice']"));
		sleep(3000);
		waitAndSendKeys(By.id("Invoice_FirstName"), "Miguel");
		waitAndSendKeys(By.id("Invoice_BillingEmail"), "miguel.smith@mailinator.com");
		waitAndSendKeys(By.id("InvoiceDetail_PrescriptionNumber"), "RX1234567");
		clickWhenClickable(By.xpath("//div[@class='model-inp select-city-dd dropdowncheckbox']//input[@type='text']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[span[normalize-space()='Rx']]"));
		sleep(2000);
		waitAndSendKeys(By.id("InvoiceDetail_Description"), "Atorvastatin 20mg Tablet");
		waitAndSendKeys(By.id("InvoiceDetail_Quantity"), "30");
		waitAndSendKeys(By.id("InvoiceDetail_CoPay"), "15.00");
		clickWhenClickable(By.xpath("//img[@id='btnInvoiceDetail']"));
		sleep(2000);
		waitAndSendKeys(By.id("Invoice_PatientEmail"), "miguel.smith@mailinator.com");
		clickWhenClickable(By.xpath("//label[@for='ChkInvoice_PatientEmail']"));
		waitAndSendKeys(By.id("Invoice_InvoiceBillTo_BillToFirstName"), "Miguel");
		clickWhenClickable(By.xpath("//button[@id='btnSaveAndSend']"));

	}

	@And("the user should be able to send Package for Signature in Delivery Module")
	public void verifyUserCanSendPackageForSignature() {
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@onclick='ClosePrintLabel();']//i[@class='fa fa-times']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@title='Send For Signature To Customer']//*[name()='svg']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Email']"));

	}

	@And("the user should be able to print Signature in Delivery Module")
	public void verifyUserCanPrintSignature() {
		sleep(3000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@class='gridRecordContextInner']//span[contains(text(),'Print')]"));
		sleep(3000);
		((JavascriptExecutor) DriverFactory.getDriver()).executeScript("window.print();");
		System.out.println("Patient signature PDF auto-saved in Downloads folder");
	}

	@And("the user should be able to download Signature in Delivery Module")
	public void verifyUserCanDownloadSignature() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[contains(text(),'.png')]"));

	}

	@And("the user should be able to upload Signature in Delivery Module")
	public void verifyUserCanUploadSignature() {
		String filePath = "C:\\Users\\MayurChauhan\\Downloads\\dummy.pdf";
		sleep(2000);
		WebElement fileInput = driver.findElement(By.id("flSignature"));
		sleep(2000);
		fileInput.sendKeys(filePath);
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnUploadSignature']"));
		sleep(2000);
	}

	@And("the user should be able to download Reference Documents in Delivery Module")
	public void verifyUserCanDownloadReferenceDocuments() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[contains(text(),'.pdf')]"));

	}

	@And("the user should be able to update Delivery Status in Delivery Module")
	public void verifyUserCanUpdateDeliveryStatus() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Packages?category=1");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Packages?category=1"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[12]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//input[@id='DeliveryInitiated']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnSaveStatusNotes']"));
		sleep(2000);
	}

	@And("the user should be able to generate Package Label in Delivery Module")
	public void verifyUserCanGeneratePackageLabel() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Packages?category=1");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Packages?category=1"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Generate Label')]"));
		sleep(3000);

	}

	@And("the user should be able to view and delete Manifest in Delivery Module")
	public void verifyUserCanViewAndDeleteManifest() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Manifests");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Manifests"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btndeletemanifestconform']"));

	}

	@And("the user should not be able to add or edit Manifest in Delivery Module")
	public void verifyUserCannotAddOrEditManifest() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Manifest']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to access Manifest Detail in Delivery Module")
	public void verifyUserCanAccessManifestDetail() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Manifests");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Manifests"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[7]/div[1]/a[1]/img[1]"));

	}

	@And("the user should be able to edit Delivery Job Setting in Delivery Module")
	public void verifyUserCanEditDeliveryJobSetting() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeliveryMarkers");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryMarkers"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='submitDeleteDeliveryMarker']"));

	}

	@And("the user should be able to send Customer Attestation for signature in Delivery Module")
	public void verifyUserCanSendCustomerAttestationForSignature() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeliveryMarkers");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryMarkers"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='submitDeleteDeliveryMarker']"));

	}

	@And("the user should be able to export Delivery Report in Delivery Module")
	public void verifyUserCanExportDeliveryReport() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeliveryMarkers");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryMarkers"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='submitDeleteDeliveryMarker']"));

	}

	@And("the user should not be able to export Delivery Statistic Report in Delivery Module")
	public void verifyUserCannotExportDeliveryStatisticReport() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeliveryMarkers");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryMarkers"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='submitDeleteDeliveryMarker']"));

	}

	@And("the user should be able to export Delivery Statistic Report in Delivery Module")
	public void verifyUserCanExportDeliveryStatisticReport() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeliveryMarkers");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryMarkers"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='submitDeleteDeliveryMarker']"));

	}

	@And("the user should be able to view Delivery Statistic Report in Delivery Module")
	public void verifyUserCanViewDeliveryStatisticReport() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeliveryMarkers");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryMarkers"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='submitDeleteDeliveryMarker']"));

	}

	@And("the user should not be able to export Manifest Summary Report in Delivery Module")
	public void verifyUserCannotExportManifestSummaryReport() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeliveryMarkers");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryMarkers"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='submitDeleteDeliveryMarker']"));

	}

	@And("the user should be able to export Manifest Summary Report in Delivery Module")
	public void verifyUserCanExportManifestSummaryReport() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeliveryMarkers");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryMarkers"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='submitDeleteDeliveryMarker']"));

	}

	@And("the user should be able to view Manifest Summary Report in Delivery Module")
	public void verifyUserCanViewManifestSummaryReport() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeliveryMarkers");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryMarkers"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='submitDeleteDeliveryMarker']"));

	}

	@And("the user should not be able to export Delivery Report in Delivery Module")
	public void verifyUserCannotExportDeliveryReport() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeliveryMarkers");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryMarkers"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='submitDeleteDeliveryMarker']"));

	}

	@And("the user should be able to view Delivery Report in Delivery Module")
	public void verifyUserCanViewDeliveryReport() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeliveryMarkers");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryMarkers"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='submitDeleteDeliveryMarker']"));

	}

	@And("the user should not be able to edit Delivery Job Setting in Delivery Module")
	public void verifyUserCannotEditDeliveryJobSetting() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeliveryMarkers");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryMarkers"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='submitDeleteDeliveryMarker']"));

	}

	@And("the user should be able to run triggers in Delivery Module")
	public void verifyUserCanRunTriggers() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeliveryMarkers");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryMarkers"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='submitDeleteDeliveryMarker']"));

	}

	@And("the user should not be able to run triggers in Delivery Module")
	public void verifyUserCannotRunTriggers() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeliveryMarkers");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryMarkers"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='submitDeleteDeliveryMarker']"));

	}

	@And("the user should be able to print Customer Attestation in Delivery Module")
	public void verifyUserCanPrintCustomerAttestation() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeliveryMarkers");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryMarkers"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='submitDeleteDeliveryMarker']"));

	}

	@And("the user should not be able to add or edit Customer Attestation in Delivery Module")
	public void verifyUserCannotAddOrEditCustomerAttestation() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Add Customer Attestation']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to delete Customer Attestation in Delivery Module")
	public void verifyUserCanDeleteCustomerAttestation() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Packages?category=1");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Packages?category=1"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[12]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='deletePackageCustomerAttestation']"));

	}

	@And("the user should not be able to add or delete Customer Attestation in Delivery Module")
	public void verifyUserCannotAddOrDeleteCustomerAttestation() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Add Customer Attestation']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to edit Customer Attestation in Delivery Module")
	public void verifyUserCanEditCustomerAttestation() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Packages?category=1");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Packages?category=1"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[12]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("PackageCustomerAttestation_AddressReceiver"), "Ahmedabad");
		clickWhenClickable(By.xpath(
				"//div[@id='addPackageCustomerAttestationModal']//button[@id='btnSavePackageCustomerAttestation']"));

	}

	@And("the user should not be able to edit or delete Customer Attestation in Delivery Module")
	public void verifyUserCannotEditOrDeleteCustomerAttestation() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to add Customer Attestation in Delivery Module")
	public void verifyUserCanAddCustomerAttestation() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Packages?category=1");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Packages?category=1"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[12]/div[1]/a[1]/img[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Customer Attestation']"));
		sleep(2000);

		waitAndSendKeys(By.id("PackageCustomerAttestation_RxNumber"), "RX7845123");
		waitAndSendKeys(By.id("PackageCustomerAttestation_PatientName"), "John A. Smith");
		waitAndSendKeys(By.id("PackageCustomerAttestation_Medication"), "Atorvastatin 20mg Tablet");
		waitAndSendKeys(By.id("PackageCustomerAttestation_ReceivedFrom"), "CVS Pharmacy");

		clickWhenClickable(By.xpath(
				"//div[@id='addPackageCustomerAttestationModal']//input[@id='PackageCustomerAttestation_FilledDate']"));

		LocalDate filledFutureDate = LocalDate.now().plusDays(5);
		int filledDay = filledFutureDate.getDayOfMonth();
		int filledYear = filledFutureDate.getYear();
		String filledMonth = filledFutureDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement filledYearDropdown = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[contains(@class,'ui-datepicker-year')]")));
		new Select(filledYearDropdown).selectByVisibleText(String.valueOf(filledYear));

		WebElement filledMonthDropdown = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[contains(@class,'ui-datepicker-month')]")));
		new Select(filledMonthDropdown).selectByVisibleText(filledMonth);

		WebElement filledDateToSelect = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//td[normalize-space()='" + filledDay + "']")));
		filledDateToSelect.click();
		sleep(2000);

		clickWhenClickable(By.xpath(
				"//div[@id='addPackageCustomerAttestationModal']//input[@id='PackageCustomerAttestation_ReceivedDate']"));

		LocalDate receivedFutureDate = LocalDate.now().plusDays(5);
		int receivedDay = receivedFutureDate.getDayOfMonth();
		int receivedYear = receivedFutureDate.getYear();
		String receivedMonth = receivedFutureDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);

		WebElement receivedYearDropdown = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[contains(@class,'ui-datepicker-year')]")));
		new Select(receivedYearDropdown).selectByVisibleText(String.valueOf(receivedYear));

		WebElement receivedMonthDropdown = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[contains(@class,'ui-datepicker-month')]")));
		new Select(receivedMonthDropdown).selectByVisibleText(receivedMonth);

		WebElement receivedDateToSelect = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//td[normalize-space()='" + receivedDay + "']")));
		receivedDateToSelect.click();
		sleep(2000);

		waitAndSendKeys(By.id("PackageCustomerAttestation_AddressReceiver"),
				"742 Evergreen Terrace, Springfield, IL 62704");
		waitAndSendKeys(By.id("PackageCustomerAttestation_ReceiverName"), "Mary Smith");
		waitAndSendKeys(By.id("PackageCustomerAttestation_PatientRelation"), "Spouse");
		waitAndSendKeys(By.id("PackageCustomerAttestation_PhoneNumber"), "2175558945");

		clickWhenClickable(By.xpath(
				"//div[@id='addPackageCustomerAttestationModal']//button[@id='btnSavePackageCustomerAttestation']"));

	}

	@And("the user should be able to print Manifest in Delivery Module")
	public void verifyUserCanPrintManifest() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Manifests");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Manifests"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[7]/div[1]/a[1]/img[1]"));
	}

	@And("the user should be able to delete Manifest Bundle in Delivery Module")
	public void verifyUserCanDeleteManifestBundle() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Manifests");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Manifests"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[7]/div[1]/a[1]/img[1]"));

	}

	@And("the user should be able to add Manifest Bundle in Delivery Module")
	public void verifyUserCanAddManifestBundle() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Manifests");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Manifests"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[7]/div[1]/a[1]/img[1]"));

	}

	@And("the user should be able to skip Manifest Package in Delivery Module")
	public void verifyUserCanSkipManifestPackage() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Manifests");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Manifests"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		selectDropdownByIndexWhenReady(By.id("Manifest_Status"), 2);
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnSkipManifestPackage']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnSkipConfirm']"));

	}

	@And("the user should be able to delete Manifest Package in Delivery Module")
	public void verifyUserCanDeleteManifestPackage() {
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnDeleteManifestPackage']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='deleteManifestPackageModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to add Manifest Package in Delivery Module")
	public void verifyUserCanAddManifestPackage() {
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='searchPackagePopup']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//select[@id='Filter_LogisticId']"));
		sleep(3000);
		selectDropdownByIndexWhenReady(By.id("Filter_LogisticId"), 1);
		sleep(3000);
		clickWhenClickable(By.xpath("//input[@id='Filter_FromDate']"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Pick year (current year)
		int year = LocalDate.now().getYear();
		WebElement yearDropdown = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[contains(@class,'ui-datepicker-year')]")));
		new Select(yearDropdown).selectByVisibleText(String.valueOf(year));

		// Pick month (current month)
		String month = LocalDate.now().getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
		WebElement monthDropdown = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[contains(@class,'ui-datepicker-month')]")));
		new Select(monthDropdown).selectByVisibleText(month);

		// Pick **day 1**
		WebElement dateToSelect = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[normalize-space()='1']")));
		dateToSelect.click();
		sleep(2000);
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='b38063de-b375-4421-a2ee-0fb842cdb451']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@class='btn btn-primary'][normalize-space()='Submit']"));

	}

	@And("the user should be able to access Package Detail in Delivery Module")
	public void verifyUserCanAccessPackageDetail() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Packages?category=1");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Packages?category=1"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[12]/div[1]/a[1]/img[1]"));
		sleep(3000);

	}

	@And("the user should not be able to add or delete Manifest in Delivery Module")
	public void verifyUserCannotAddOrDeleteManifest() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Manifest']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
	}

	@And("the user should be able to view and edit Manifest in Delivery Module")
	public void verifyUserCanViewAndEditManifest() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Manifests");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Manifests"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='Manifest_Status']"));
		selectDropdownByIndexWhenReady(By.id("Manifest_Status"), 2);
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to edit or delete Manifest in Delivery Module")
	public void verifyUserCannotEditOrDeleteManifest() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to view and add Manifest in Delivery Module")
	public void verifyUserCanViewAndAddManifest() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Manifests");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Manifests"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Manifest']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//input[@id='Manifest_DeliveryDate']"));
		LocalDate filledFutureDate = LocalDate.now().plusDays(5);
		int filledDay = filledFutureDate.getDayOfMonth();
		int filledYear = filledFutureDate.getYear();
		String filledMonth = filledFutureDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement filledYearDropdown = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[contains(@class,'ui-datepicker-year')]")));
		new Select(filledYearDropdown).selectByVisibleText(String.valueOf(filledYear));
		WebElement filledMonthDropdown = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[contains(@class,'ui-datepicker-month')]")));
		new Select(filledMonthDropdown).selectByVisibleText(filledMonth);
		WebElement filledDateToSelect = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//td[normalize-space()='" + filledDay + "']")));
		filledDateToSelect.click();
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='Manifest_Driver_Id']"));
		selectDropdownByIndexWhenReady(By.id("Manifest_Driver_Id"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='Manifest_StartingPoint']"));
		selectDropdownByIndexWhenReady(By.id("Manifest_StartingPoint"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='Manifest_EndPoint']"));
		selectDropdownByIndexWhenReady(By.id("Manifest_EndPoint"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='Manifest_Status']"));
		selectDropdownByIndexWhenReady(By.id("Manifest_Status"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should have no Delivery Identifier access via UI or direct URL")
	public void verifyUserCannotAccessDeliveryIdentifier() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeliveryDistances");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryDistances"));
		sleep(3000);

	}

	@And("the user should be able to view Delivery Identifier in Delivery Module")
	public void verifyUserCanViewDeliveryIdentifier() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeliveryDistances");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryDistances"));
		sleep(3000);

	}

	@And("the user should have no Package Plan Restriction access via UI or direct URL")
	public void verifyUserCannotAccessPackagePlanRestriction() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Packages?category=1");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Packages?category=1"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnNext']"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//*[name()='path' and contains(@d,'m211 91v21')]"));

	}

	@And("the user should be able to update Package Plan Restriction in Delivery Module")
	public void verifyUserCanUpdatePackagePlanRestriction() {
		sleep(3000);
		assertElementPresent(By.xpath("//*[name()='path' and contains(@d,'m211 91v21')]"));
		waitAndSendKeys(By.id("Package_Plan"), "100");

	}

	@And("the user should be able to view Package Plan Restriction in Delivery Module")
	public void verifyUserCanViewPackagePlanRestriction() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Packages?category=1");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Packages?category=1"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnNext']"));

	}

	@And("the user should have no Delivery Setting access via UI or direct URL")
	public void verifyUserCannotAccessDeliverySetting() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//h6[normalize-space()='Package Restriction']"));

	}

	@And("the user should be able to update Delivery Setting in Delivery Module")
	public void verifyUserCanUpdateDeliverySetting() {
		sleep(3000);
		assertElementPresent(By.xpath("//h6[normalize-space()='Package Restriction']"));
		clickWhenClickable(By.xpath("//h6[normalize-space()='Package Restriction']"));

	}

	@And("the user should be able to view Delivery Setting in Delivery Module")
	public void verifyUserCanViewDeliverySetting() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/Settings");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Settings"));

	}

	@And("the user should not be able to add or edit Package in Delivery Module")
	public void verifyUserCannotAddOrEditPackage() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Package']"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to view and delete Package in Delivery Module")
	public void verifyUserCanViewAndDeletePackage() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Packages?category=1");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Packages?category=1"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(
				By.xpath("//div[@class='modal-dialog modal-dialog-centered']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should not be able to add or delete Package in Delivery Module")
	public void verifyUserCannotAddOrDeletePackage() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Package']"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to view and edit Package in Delivery Module")
	public void verifyUserCanViewAndEditPackage() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Packages?category=1");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Packages?category=1"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("Package_ShippingAddress_City"), "4646545767");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to edit or delete Package in Delivery Module")
	public void verifyUserCannotEditOrDeletePackage() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to view and add Package in Delivery Module")
	public void verifyUserCanViewAndAddPackage() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Packages?category=1");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Packages?category=1"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Package']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnNext']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='Package_LogisticCompany_Id']"));
		selectDropdownByIndexWhenReady(By.id("Package_LogisticCompany_Id"), 6);
		sleep(2000);
		waitAndSendKeys(By.id("Package_TrackingNumber"), "3477568");
		clickWhenClickable(By.xpath("//input[@id='Package_ShippingDate']"));
		LocalDate futureDate = LocalDate.now().plusDays(5);
		int day = futureDate.getDayOfMonth();
		int year = futureDate.getYear();
		String month = futureDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement yearDropdown = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[contains(@class,'ui-datepicker-year')]")));
		new Select(yearDropdown).selectByVisibleText(String.valueOf(year));
		WebElement monthDropdown = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[contains(@class,'ui-datepicker-month')]")));
		new Select(monthDropdown).selectByVisibleText(month);
		WebElement dateToSelect = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[normalize-space()='" + day + "']")));
		dateToSelect.click();
		sleep(2000);
		waitAndSendKeys(By.id("Package_CustomerName"), "Miguel Frost");
		waitAndSendKeys(By.id("Package_CustomerContactNumber1"), "4646545767");
		waitAndSendKeys(By.id("Package_ShippingAddress_Street"), "4646545767");
		waitAndSendKeys(By.id("Package_ShippingAddress_City"), "4646545767");
		waitAndSendKeys(By.id("Package_ShippingAddress_ZipCode"), "4646545767");
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='ddState']"));
		selectDropdownByIndexWhenReady(By.id("ddState"), 1);
		sleep(2000);
		WebElement addressInput = driver.findElement(By.id("travelto"));
		addressInput.clear();
		addressInput.sendKeys("Prahlad Nagar, Ahmedabad, Gujarat, India");
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".pac-item")));
		addressInput.sendKeys(Keys.ARROW_DOWN);
		addressInput.sendKeys(Keys.ENTER);
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@class='copyAddressMain']//*[name()='svg']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to add or delete Delivery Marker in Delivery Module")
	public void userShouldNotBeAbleToAddOrDeleteDeliveryMarker() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Delivery Marker']"));
		sleep(1000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to view and edit Delivery Marker in Delivery Module")
	public void userShouldBeAbleToViewAndEditDeliveryMarker() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeliveryMarkers");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryMarkers"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("DeliveryMarker_Name"), "Pharmacy Main Store");
		waitAndSendKeys(By.id("travelto"), "New York");
		clickWhenClickable(By.xpath("//label[normalize-space()='Starting Point']"));
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
	}

	@And("the user should not be able to edit or delete Delivery Marker in Delivery Module")
	public void userShouldNotBeAbleToEditOrDeleteDeliveryMarker() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to view and add Delivery Marker in Delivery Module")
	public void userShouldBeAbleToViewAndAddDeliveryMarker() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeliveryMarkers");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryMarkers"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Delivery Marker']"));
		sleep(2000);
		waitAndSendKeys(By.id("DeliveryMarker_Name"), "Pharmacy Main Store");
		waitAndSendKeys(By.id("travelto"), "New York");
		clickWhenClickable(By.xpath("//label[normalize-space()='Starting Point']"));
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to add or edit Logistic Company in Delivery Module")
	public void userShouldNotBeAbleToAddOrEditLogisticCompany() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Logistic Company']"));
		sleep(1000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to view and delete Logistic Company in Delivery Module")
	public void userShouldBeAbleToViewAndDeleteLogisticCompany() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/LogisticCompanies");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/LogisticCompanies"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should not be able to add or delete Logistic Company in Delivery Module")
	public void userShouldNotBeAbleToAddOrDeleteLogisticCompany() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Logistic Company']"));
		sleep(1000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to view and edit Logistic Company in Delivery Module")
	public void userShouldBeAbleToViewAndEditLogisticCompany() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/LogisticCompanies");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/LogisticCompanies"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("LogisticCompany_Name"), "Ryder Logistics");
		clickWhenClickable(By.xpath("//input[@id='rbtnDelivery']"));
		clickWhenClickable(
				By.xpath("//button[@class='btn btn-primary waves-effect waves-light'][normalize-space()='Submit']"));

	}

	@And("the user should not be able to edit or delete Logistic Company in Delivery Module")
	public void userShouldNotBeAbleToEditOrDeleteLogisticCompany() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to view and add Logistic Company in Delivery Module")
	public void userShouldBeAbleToViewAndAddLogisticCompany() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/LogisticCompanies");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/LogisticCompanies"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Logistic Company']"));
		sleep(2000);
		waitAndSendKeys(By.id("LogisticCompany_Name"), "Ryder Logistics");
		clickWhenClickable(By.xpath("//input[@id='rbtnDelivery']"));
		clickWhenClickable(
				By.xpath("//button[@class='btn btn-primary waves-effect waves-light'][normalize-space()='Submit']"));

	}

	@And("the user should not be able to add or edit Delivery Distances in Delivery Module")
	public void userShouldNotBeAbleToAddOrEditDeliveryDistances() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Delivery Distance']"));
		sleep(1000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to view and delete Delivery Distances in Delivery Module")
	public void userShouldBeAbleToViewAndDeleteDeliveryDistances() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeliveryDistances");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryDistances"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='deleteDeliveryDistanceModel']//button[@id='btnDeleteConfirm']"));
	}

	@And("the user should not be able to add or delete Delivery Distances in Delivery Module")
	public void userShouldNotBeAbleToAddOrDeleteDeliveryDistances() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Delivery Distance']"));
		sleep(1000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to view and edit Delivery Distances in Delivery Module")
	public void userShouldBeAbleToViewAndEditDeliveryDistances() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeliveryDistances");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryDistances"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("DeliveryDistance_ZipCode"), "10001");
		waitAndSendKeys(By.id("DeliveryDistance_City"), "New York");
		waitAndSendKeys(By.id("DeliveryDistance_County"), "USA");
		waitAndSendKeys(By.id("DeliveryDistance_Radius"), "10");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to edit or delete Delivery Distances in Delivery Module")
	public void userShouldNotBeAbleToEditOrDeleteDeliveryDistances() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to view and add Delivery Distances in Delivery Module")
	public void userShouldBeAbleToViewAndAddDeliveryDistances() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeliveryDistances");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryDistances"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Delivery Distance']"));
		sleep(1000);
		waitAndSendKeys(By.id("DeliveryDistance_ZipCode"), "10001");
		waitAndSendKeys(By.id("DeliveryDistance_City"), "New York");
		waitAndSendKeys(By.id("DeliveryDistance_County"), "USA");
		waitAndSendKeys(By.id("DeliveryDistance_Radius"), "10");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to view and delete Package Restriction State in Delivery Module")
	public void userShouldBeAbleToViewAndDeletePackageRestrictionState() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/PackageRestriction");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PackageRestriction"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[2]/div[1]/a[1]/img[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnDeleteConfirmRestictedState']"));

	}

	@And("the user should be able to view and delete Package Restriction Plan in Delivery Module")
	public void userShouldBeAbleToViewAndDeletePackageRestrictionPlan() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/PackageRestriction");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PackageRestriction"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[3]/div[1]/a[1]/img[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnDeleteConfirmRestictedPlan']"));

	}

	@And("the user should be able to view and add Package Restriction in Delivery Module")
	public void userShouldBeAbleToViewAndAddPackageRestriction() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/PackageRestriction");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PackageRestriction"));
		sleep(3000);
		waitAndSendKeys(By.id("Plan"), "Call Patient");
		clickWhenClickable(By.xpath("//input[@value='2']"));
		clickWhenClickable(By.xpath("//a[@id='btnPlan']//*[name()='svg']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to view or update Package Settings in Delivery Module")
	public void theUserShouldNotBeAbleToViewOrUpdatePackageSettingsInDeliveryModule() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/PackageSetting");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}

	}

	@And("the user should be able to update Package Settings in Delivery Module")
	public void theUserShouldBeAbleToUpdatePackageSettingsInDeliveryModule() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/PackageSetting");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PackageSetting"));
		sleep(3000);
		assertElementPresent(By.xpath("//button[@id='btnSave']"));
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to view General Audit View settings in Delivery Module")
	public void theUserShouldNotBeAbleToViewGeneralAuditViewSettingsInDeliveryModule() {
		sleep(3000);
		driver.get(baseUrl + "/Delivery/Home/Packages?category=1");
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Packages?category=1"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//th[normalize-space()='Updated By']"));
		assertElementNotPresent(By.xpath("//th[normalize-space()='Updated Date']"));

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
