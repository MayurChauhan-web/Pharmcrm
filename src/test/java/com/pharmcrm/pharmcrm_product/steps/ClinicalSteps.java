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

public class ClinicalSteps {

	String createdEmail;
	String baseUrl = "http://qa01.pharmcrm.com";
	String profileName;

	private WebDriver driver = DrugSteps.driver;
	private WebDriverWait wait = DrugSteps.wait;

	public ClinicalSteps() {
		this.driver = DriverFactory.getDriver();
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	@Given("I log in as admin for Clinical Module")
	public void loginAsAdminForClinicalModule() {
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

	@When("I create a new user with email for Clinical Module {string}")
	public void createNewUserForClinicalModule(String email) {
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

	@And("I create a profile with View access only to Clinical Module General Audit View")
	public void createProfileWithViewAccessForClinicalModuleGeneralAuditView() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with No access to Clinical Module General Audit View")
	public void createProfileWithNoAccessForClinicalModuleGeneralAuditView() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg37ClinicalAuditView']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Update access only to Clinical Module Component Information")
	public void createProfileWithUpdateAccessForClinicalModuleComponentInformation() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg6ComponentInformationUpdate']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with No Update access to Clinical Module Component Information")
	public void createProfileWithNoUpdateAccessForClinicalModuleComponentInformation() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access only to Clinical Module Prior Authorization Types")
	public void createProfileWithViewAndAddAccessForPriorAuthorizationTypes() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg24PATypesAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access only to Clinical Module Prior Authorization Types")
	public void createProfileWithViewAndEditAccessForPriorAuthorizationTypes() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg24PATypesEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access only to Clinical Module Prior Authorization Types")
	public void createProfileWithViewAndDeleteAccessForPriorAuthorizationTypes() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg24PATypesDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access only to Clinical Module Goals Of Treatment")
	public void createProfileWithViewAndDeleteAccessForGoalsOfTreatment() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg26GoalsOfTreatmentDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Clinical Module Barriers")
	public void createProfileWithDeleteAccessForBarriers() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg26BarrierDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Clinical Module Community Resource")
	public void createProfileWithDeleteAccessForCommunityResource() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg26CommunityResourceDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Clinical Module Clinical Intervention")
	public void verifyUserCannotAddOrEditClinicalIntervention() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg26ClinicalInterventionDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Clinical Module ROS")
	public void createProfileWithDeleteAccessForROS() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg26ROSDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Clinical Module Outcome Action")
	public void createProfileWithAddAccessForOutcomeAction() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg27ClinicalOutcomeOfActionAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Clinical Module Outcome Action")
	public void createProfileWithDeleteAccessForOutcomeAction() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg27ClinicalOutcomeOfActionDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Clinical Module RMP")
	public void createProfileWithAddAccessForRMP() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg27RemoteMonitoringParameterAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Clinical Module RMP")
	public void createProfileWithDeleteAccessForRMP() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg27RemoteMonitoringParameterDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Clinical Module ROS Group Type")
	public void createProfileWithDeleteAccessForROSGroupType() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg27ROSGroupTypeDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Clinical Module Encounter Status")
	public void createProfileWithDeleteAccessForEncounterStatus() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg27EncounterStatusDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Clinical Module Registered Device")
	public void createProfileWithAddAccessForRegisteredDevice() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg36RegisteredDeviceAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Clinical Module Registered Device")
	public void createProfileWithEditAccessForRegisteredDevice() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg36RegisteredDeviceEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Clinical Module Registered Device")
	public void createProfileWithDeleteAccessForRegisteredDevice() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg36RegisteredDeviceDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with full access to Clinical Module Registered Device")
	public void createProfileWithFullAccessForRegisteredDevice() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg36RegisteredDeviceAll']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Clinical Module RPM Status")
	public void createProfileWithDeleteAccessForRPMStatus() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg39RPMStatusDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Clinical Module CPT Code")
	public void createProfileWithDeleteAccessForCPTCode() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40CPTCodeDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Patients Module")
	public void createProfileWithDeleteAccessForPatientsModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg13ClinicalPatientAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg14ClinicalPatientDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with All Access to Clinical Module")
	public void createProfileWithAllAccessToClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to SOAP Components")
	public void createProfileWithAddAccessForSOAPComponents() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg14ClinicalObjectiveAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg14ClinicalObjectiveAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to SOAP Components")
	public void createProfileWithEditAccessToSOAPComponents() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg14ClinicalObjectiveAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg14ClinicalObjectiveEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to SOAP Components")
	public void createProfileWithDeleteAccessOnlyToSOAPComponents() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg14ClinicalObjectiveAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg14ClinicalObjectiveDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Patients Clinical Encounter")
	public void createProfileWithAddAccessOnlyToPatientsClinicalEncounter() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg14ClinicalEncounterAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg15ClinicalEncounterAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Patients Clinical Encounter")
	public void createProfileWithEditAccessOnlyToPatientsClinicalEncounter() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg14ClinicalEncounterAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg15ClinicalEncounterEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Patients Clinical Encounter")
	public void createProfileWithDeleteAccessOnlyToPatientsClinicalEncounter() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg14ClinicalEncounterAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg15ClinicalEncounterDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and View Star1 Drug access to Patients Clinical Encounter Review")
	public void createProfileWithViewAndViewStar1DrugAccessToPatientsClinicalEncounterReview() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with No Access to Patients Clinical Encounter Review")
	public void createProfileWithNoAccessToPatientsClinicalEncounterReview() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg14ClinicalEncounterAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg15ClinicalReviewAll']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Download File access to Reports Status Log")
	public void createProfileWithViewAndDownloadFileAccessToReportsStatusLog() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View but no Download File access to Reports Status Log")
	public void createProfileWithViewButNoDownloadFileAccessToReportsStatusLog() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg19ClinicalStatusLogsDownload']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View but no Download File access to Reports Medication Recommendation And Suggestions")
	public void createProfileWithViewButNoDownloadFileAccessToReportsMedicationRecommendationAndSuggestions() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg19ClinicalMedicationRecommandationDownload']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View but no Download File access to Reports CCM Encounter Log")
	public void createProfileWithViewButNoDownloadFileAccessToReportsCCMEncounterLog() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg19ClinicalCCMLogDownload']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View but no Download File access to Reports Call Log")
	public void createProfileWithViewButNoDownloadFileAccessToReportsCallLog() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg19ClinicalCallLogDownload']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Referred To New Provider access to Patient Provider Referral")
	public void createProfileWithViewAndReferredToNewProviderAccessToPatientProviderReferral() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Referral Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg20ReferralCategoryAll']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View but no Referred To New Provider access to Patient Provider Referral")
	public void createProfileWithViewButNoReferredToNewProviderAccessToPatientProviderReferral() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Referred To New Provider']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to CareGiver Name in Clinical Module")
	public void createProfileWithDeleteAccessForCareGiverNameInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Referred To New Provider']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg21ClinicalCareGiverNameAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg21ClinicalCareGiverNameEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Prior Authorization in Clinical Module")
	public void createProfileWithAddAccessForPriorAuthorizationInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg23PriorAuthorizationProcessAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg23PriorAuthorizationGenerateAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Prior Authorization in Clinical Module")
	public void createProfileWithEditAccessForPriorAuthorizationInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg23PriorAuthorizationProcessAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg23PriorAuthorizationProcessEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Prior Authorization in Clinical Module")
	public void createProfileWithDeleteAccessForPriorAuthorizationInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg23PriorAuthorizationProcessAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg23PriorAuthorizationGenerateDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Remote Patient Monitoring RPM in Clinical Module")
	public void createProfileWithAddAccessOnlyForRPM() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg31RemoteMonitoringAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg31RemoteMonitoringAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Reports MTM Encounter Log in Clinical Module")
	public void createProfileWithViewAccessOnlyForReportsMTMEncounterLog() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg27MTMEncounterLogAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg27MTMEncounterLogView']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to RPM Remote Monitoring Parameter in Clinical Module")
	public void createProfileWithEditAccessOnlyForRPMRemoteMonitoringParameter() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg31RMParameterAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg31RMParameterEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with no Edit access to RPM RMP Details in Clinical Module")
	public void createProfileWithNoEditAccessForRPMRMPDetails() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg31RMEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to RPM External Details for Alert in Clinical Module")
	public void createProfileWithEditAccessToRPMExternalDetailsForAlert() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg33ExternalDetailsAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg33ExternalDetailsEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to RPM External Details for Alert in Clinical Module")
	public void createProfileWithAddAccessToRPMExternalDetailsForAlert() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg33ExternalDetailsAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg33ExternalDetailsAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to RPM External Details for Alert in Clinical Module")
	public void createProfileWithDeleteAccessToRPMExternalDetailsForAlert() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg33ExternalDetailsAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg33ExternalDetailsDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to RPM Trigger Alert for Time in Clinical Module")
	public void createProfileWithDeleteAccessToRPMTriggerAlertForTime() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg33TriggerAlertAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg33TriggerAlertDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with all access for Reports Remote Monitoring Report")
	public void createProfileWithAllAccessForRemoteMonitoringReport() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Reports Remote Monitoring Report in Clinical Module")
	public void createProfileWithViewAccessToReportsRemoteMonitoringReportInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg33ClinicalRemoteMonitorReportAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg33ClinicalRemoteMonitorReportView']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with all access for PA All PA")
	public void userCreatesProfileWithAllAccessForPAAllPA() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to CPT Code in Clinical Module")
	public void iCreateProfileWithAddAccessOnlyToCPTCodeInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40RPMEventCPTCodeAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40RPMEventCPTCodeAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Device Usage Statistic Report in Clinical Module")
	public void iCreateProfileWithViewAccessOnlyToDeviceUsageStatisticReportInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg47DeviceUsageStatisticReportExport']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Export access to Device Usage Statistic Report in Clinical Module")
	public void iCreateProfileWithViewAndExportAccessToDeviceUsageStatisticReportInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to CPT Code in Clinical Module")
	public void iCreateProfileWithDeleteAccessOnlyToCPTCodeInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40RPMEventCPTCodeAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40RPMEventCPTCodeDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to CPT Code in Clinical Module")
	public void iCreateProfileWithEditAccessOnlyToCPTCodeInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40RPMEventCPTCodeAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40RPMEventCPTCodeEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Download access only to Digital Signature in Clinical Module")
	public void iCreateProfileWithDownloadAccessOnlyToDigitalSignatureInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40DigitalSignatureAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Download Digital Signature']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Digital Signature in Clinical Module")
	public void iCreateProfileWithEditAccessOnlyToDigitalSignatureInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40DigitalSignatureAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40DigitalSignatureEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Digital Signature in Clinical Module")
	public void iCreateProfileWithDeleteAccessOnlyToDigitalSignatureInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40DigitalSignatureAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40DigitalSignatureDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to PA Progress Step in Clinical Module")
	public void iCreateProfileWithDeleteAccessOnlyToPAProgressStepInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40PAProgressStepAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40PAProgressStepDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to PA Progress Step in Clinical Module")
	public void iCreateProfileWithEditAccessOnlyToPAProgressStepInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40PAProgressStepAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40PAProgressStepEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to PA All PA in Clinical Module")
	public void userCreatesProfileWithViewAccessOnlyToPAAllPAInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to PA Progress Step in Clinical Module")
	public void iCreateProfileWithAddAccessOnlyToPAProgressStepInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40PAProgressStepAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40PAProgressStepAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to RPM Progress Step in Clinical Module")
	public void iCreateProfileWithDeleteAccessOnlyToRPMProgressStepInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40RPMProgressStepAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40RPMProgressStepDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to RPM Status in Clinical Module")
	public void iCreateProfileWithAddAccessOnlyToRPMStatusInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg39PatientRPMStatusAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg39PatientRPMStatusAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to RPM Progress Step in Clinical Module")
	public void iCreateProfileWithEditAccessOnlyToRPMProgressStepInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40RPMProgressStepAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40RPMProgressStepEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to RPM Progress Step in Clinical Module")
	public void iCreateProfileWithAddAccessOnlyToRPMProgressStepInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40RPMProgressStepAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40RPMProgressStepAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to RPM Status in Clinical Module")
	public void iCreateProfileWithDeleteAccessOnlyToRPMStatusInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg39PatientRPMStatusAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg39PatientRPMStatusDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to RPM Status in Clinical Module")
	public void iCreateProfileWithEditAccessOnlyToRPMStatusInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg39PatientRPMStatusAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg39PatientRPMStatusEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to RPM Trigger Alert for Time in Clinical Module")
	public void createProfileWithEditAccessToRPMTriggerAlertForTime() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg33TriggerAlertAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg33TriggerAlertEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to RPM Trigger Alert for Time in Clinical Module")
	public void createProfileWithAddAccessToRPMTriggerAlertForTime() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg33TriggerAlertAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg33TriggerAlertAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to RPM RMP Details in Clinical Module")
	public void createProfileWithEditAccessOnlyForRPMRMPDetails() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to RPM Remote Monitoring Parameter in Clinical Module")
	public void createProfileWithDeleteAccessOnlyForRPMRemoteMonitoringParameter() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg31RMParameterAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg31RMParameterDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Export Excel and Outgoing Call access in Clinical Module")
	public void createProfileWithExportExcelAndOutgoingCallAccess() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Remote Patient Monitoring RPM in Clinical Module")
	public void createProfileWithDeleteAccessOnlyForRemotePatientMonitoring() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg31RemoteMonitoringAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg31RemoteMonitoringDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to RPM Remote Monitoring Parameter in Clinical Module")
	public void createProfileWithAddAccessOnlyForRPMRemoteMonitoringParameter() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg31RMParameterAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg31RMParameterAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Remote Patient Monitoring RPM in Clinical Module")
	public void createProfileWithEditAccessOnlyForRemotePatientMonitoring() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg31RemoteMonitoringAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg31RemoteMonitoringEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Export Excel, and Details access to Reports MTM Encounter Log in Clinical Module")
	public void createProfileWithViewExportDetailsAccessForReportsMTMEncounterLog() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Med Recons Current Medication in Clinical Module")
	public void createProfileWithDeleteAccessOnlyForMedReconsCurrentMedication() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg24MedReconsCurrentMedicationAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg24MedReconsCurrentMedicationDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Med Recons Current Medication in Clinical Module")
	public void createProfileWithEditAccessOnlyForMedReconsCurrentMedication() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg24MedReconsCurrentMedicationAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg24MedReconsCurrentMedicationEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Med Recons Current Medication in Clinical Module")
	public void createProfileWithAddAccessOnlyForMedReconsCurrentMedication() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg24MedReconsCurrentMedicationAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg24MedReconsCurrentMedicationAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Med Recons Meds On Chart in Clinical Module")
	public void createProfileWithDeleteAccessOnlyForMedReconsMedsOnChart() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg24MedReconsMedsOnChartAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg24MedReconsMedsOnChartDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Med Recons Meds On Chart in Clinical Module")
	public void createProfileWithEditAccessOnlyForMedReconsMedsOnChart() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg24MedReconsMedsOnChartAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg24MedReconsMedsOnChartEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Med Recons Meds On Chart in Clinical Module")
	public void createProfileWithAddAccessOnlyForMedReconsMedsOnChart() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg24MedReconsMedsOnChartAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg24MedReconsMedsOnChartAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with access only to Download File in Clinical Module")
	public void createProfileWithAccessOnlyForDownloadFile() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Delete access only to Med Recons in Clinical Module")
	public void createProfileWithDeleteAccessOnlyForMedRecons() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg24MedReconsAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg24MedReconsDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Med Recons in Clinical Module")
	public void createProfileWithAddAccessOnlyForMedRecons() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg24MedReconsAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg24MedReconsAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with full Acess to Prior Authorization in Clinical Module")
	public void createFullAccessProfileForPriorAuthorization() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to CareGiver Name in Clinical Module")
	public void createProfileWithEditAccessForCareGiverNameInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Referred To New Provider']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg21ClinicalCareGiverNameAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg21ClinicalCareGiverNameDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to CareGiver Name in Clinical Module")
	public void createProfileWithAddAccessForCareGiverNameInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Referred To New Provider']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg21ClinicalCareGiverNameEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg21ClinicalCareGiverNameDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Download File access to Reports Call Log")
	public void createProfileWithViewAndDownloadFileAccessToReportsCallLog() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Download File access to Reports CCM Encounter Log")
	public void createProfileWithViewAndDownloadFileAccessToReportsCCMEncounterLog() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Download File access to Reports Medication Recommendation And Suggestions")
	public void createProfileWithViewAndDownloadFileAccessToReportsMedicationRecommendationAndSuggestions() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Patients Module")
	public void createProfileWithAddAccessForPatientsModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg13ClinicalPatientAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg13ClinicalPatientAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Patients Module")
	public void createProfileWithEditAccessForPatientsModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg13ClinicalPatientAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg13ClinicalPatientEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Clinical Module CPT Code")
	public void createProfileWithEditAccessForCPTCode() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40CPTCodeEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Clinical Module CPT Code")
	public void createProfileWithAddAccessForCPTCode() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg40CPTCodeAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Clinical Module RPM Status")
	public void createProfileWithEditAccessForRPMStatus() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg39RPMStatusEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Clinical Module RPM Status")
	public void createProfileWithAddAccessForRPMStatus() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg39RPMStatusAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Clinical Module Device Master")
	public void createProfileWithEditAccessForDeviceMaster() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg36DeviceMasterEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Clinical Module Device Master")
	public void createProfileWithViewAccessForDeviceMaster() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg35DeviceMasterView']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Clinical Module Encounter Status")
	public void createProfileWithEditAccessForEncounterStatus() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg27EncounterStatusEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Clinical Module Encounter Status")
	public void createProfileWithAddAccessForEncounterStatus() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg27EncounterStatusAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Clinical Module ROS Group Type")
	public void createProfileWithEditAccessForROSGroupType() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg27ROSGroupTypeEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Clinical Module ROS Group Type")
	public void createProfileWithAddAccessForROSGroupType() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg27ROSGroupTypeAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Clinical Module RMP")
	public void createProfileWithEditAccessForRMP() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg27RemoteMonitoringParameterEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Clinical Module Outcome Action")
	public void createProfileWithEditAccessForOutcomeAction() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg27ClinicalOutcomeOfActionEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Clinical Module ROS")
	public void createProfileWithEditAccessForROS() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg26ROSEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Clinical Module ROS")
	public void createProfileWithAddAccessForROS() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg26ROSAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Clinical Module Clinical Intervention")
	public void verifyUserCanDeleteClinicalIntervention() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg26ClinicalInterventionEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Clinical Module Clinical Intervention")
	public void createProfileWithDeleteAccessForClinicalIntervention() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg26ClinicalInterventionAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Clinical Module Community Resource")
	public void createProfileWithEditAccessForCommunityResource() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg26CommunityResourceEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Clinical Module Community Resource")
	public void createProfileWithAddAccessForCommunityResource() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg26CommunityResourceAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Edit access only to Clinical Module Barriers")
	public void createProfileWithEditAccessForBarriers() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg26BarrierEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Clinical Module Barriers")
	public void createProfileWithAddAccessForBarriers() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg26BarrierAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access only to Clinical Module Goals Of Treatment")
	public void createProfileWithViewAndEditAccessForGoalsOfTreatment() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg26GoalsOfTreatmentEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access only to Clinical Module Goals Of Treatment")
	public void createProfileWithViewAndAddAccessForGoalsOfTreatment() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
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
		clickWhenClickable(By.xpath("//label[normalize-space()='Clinical Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Setup Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg26GoalsOfTreatmentAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I assign the profile and workspace to the user for Clinical Module")
	public void assignProfileAndWorkspaceToUserForClinicalModule() {
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

	@And("I reset the user's password for Clinical Module")
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

	@And("I log in using the new user for Clinical Module")
	public void loginUsingNewUserForClinicalModule() {
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

	@And("the user should be able to view General Audit View settings in Clinical Module")
	public void verifyUserCanViewGeneralAuditViewSettingsInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalPriorAuthorizations");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalPriorAuthorizations"));
		sleep(3000);
		assertElementPresent(By.xpath("//a[normalize-space()='Created Date']"));
		assertElementPresent(By.xpath("//a[normalize-space()='Updated By']"));

	}

	@And("the user should be able to update Component Information in Clinical Module")
	public void verifyUserCanUpdateComponentInformationInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/ClinicalSOAPComponentSetting");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ClinicalSOAPComponentSetting"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));

	}

	@And("the user should not be able to edit or delete Prior Authorization Types in Clinical Module")
	public void verifyUserCannotEditOrDeletePriorAuthorizationTypes() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit or delete Goals Of Treatment in Clinical Module")
	public void verifyUserCannotEditOrDeleteGoalsOfTreatment() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit or delete Barriers in Clinical Module")
	public void verifyUserCannotEditOrDeleteBarriers() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit or delete Community Resource in Clinical Module")
	public void verifyUserCannotEditOrDeleteCommunityResource() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit or delete Clinical Intervention in Clinical Module")
	public void verifyUserCannotEditOrDeleteClinicalIntervention() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit or delete ROS in Clinical Module")
	public void verifyUserCannotEditOrDeleteROS() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit or delete Outcome Action in Clinical Module")
	public void verifyUserCannotEditOrDeleteOutcomeAction() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit or delete RMP in Clinical Module")
	public void verifyUserCannotEditOrDeleteRMP() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit or delete ROS Group Type in Clinical Module")
	public void verifyUserCannotEditOrDeleteROSGroupType() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit or delete Registered Device in Clinical Module")
	public void verifyUserCannotEditOrDeleteRegisteredDevice() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit or delete RPM Status in Clinical Module")
	public void verifyUserCannotEditOrDeleteRPMStatus() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit or delete CPT Code in Clinical Module")
	public void verifyUserCannotEditOrDeleteCPTCode() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit or delete Patients in Patients Module")
	public void userShouldNotBeAbleToEditOrDeletePatientsInPatientsModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/Patients"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit or delete SOAP Components in Clinical Module")
	public void userShouldNotBeAbleToEditOrDeleteSOAPComponents() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit or delete Patients Clinical Encounter in Clinical Module")
	public void userShouldNotBeAbleToEditOrDeletePatientsClinicalEncounterInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/Patients"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[normalize-space()='Clinical Encounters']"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit or delete Encounter Status in Clinical Module")
	public void verifyUserCannotEditOrDeleteEncounterStatus() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit Device Master in Clinical Module")
	public void verifyUserCannotEditDeviceMaster() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to view and add Prior Authorization Types in Clinical Module")
	public void verifyUserCanViewAndAddPriorAuthorizationTypes() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/PriorAuthorizationTypes");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PriorAuthorizationTypes"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Prior Authorization Type']"));
		sleep(3000);
		waitAndSendKeys(By.id("PriorAuthorizationType_Name"), "PA Type A");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to view and add Goals Of Treatment in Clinical Module")
	public void verifyUserCanViewAndAddGoalsOfTreatment() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/GoalsOfTreatments");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/GoalsOfTreatments"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Goals Of Treatment']"));
		sleep(3000);
		waitAndSendKeys(By.id("GoalsOfTreatment_DiseaseName"), "Diabetes Mellitus");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add Barriers in Clinical Module")
	public void verifyUserCanAddBarriers() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/Barriers");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Barriers"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Barriers']"));
		sleep(3000);
		waitAndSendKeys(By.id("Barrier_Name"), "Transportation");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add Community Resource in Clinical Module")
	public void verifyUserCanAddCommunityResource() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/CommunityResources");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/CommunityResources"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Community Resource']"));
		sleep(3000);
		waitAndSendKeys(By.id("CommunityResource_Name"), "Transportation Services");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add Clinical Intervention in Clinical Module")
	public void verifyUserCanAddClinicalIntervention() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/ClinicalInterventions");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ClinicalInterventions"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Clinical Intervention']"));
		sleep(3000);
		waitAndSendKeys(By.id("ClinicalIntervention_Name"), "Medication Adjustment");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add ROS in Clinical Module")
	public void verifyUserCanAddROS() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/ROSs");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ROSs"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New ROS Information']"));
		sleep(3000);
		waitAndSendKeys(By.id("ROS_Name"), "Skin Rash on arms, itchy scalp");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add Outcome Action in Clinical Module")
	public void verifyUserCanAddOutcomeAction() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/OutcomeActions");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/OutcomeActions"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Outcome Action']"));
		sleep(3000);
		waitAndSendKeys(By.id("OutcomeAction_Name"), "Blood Pressure Monitoring");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add RMP in Clinical Module")
	public void verifyUserCanAddRMP() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/RemoteMonitoringParameters");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RemoteMonitoringParameters"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Remote Monitoring Parameter']"));
		sleep(3000);
		waitAndSendKeys(By.id("RemoteMonitoringParameter_Name"), "Blood Pressure Monitoring");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add ROS Group Type in Clinical Module")
	public void verifyUserCanAddROSGroupType() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/ROSGroupTypes");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ROSGroupTypes"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New ROS Group Type']"));
		sleep(3000);
		waitAndSendKeys(By.id("ROSGroupType_Name"), "Blood Pressure Monitoring");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add Registered Device in Clinical Module")
	public void verifyUserCanAddRegisteredDevice() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/RegisteredDevices");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RegisteredDevices"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Registered Device']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//select[@id='RegisteredDevice_DeviceId']"));
		sleep(3000);
		selectDropdownByIndexWhenReady(By.id("RegisteredDevice_DeviceId"), 1);
		sleep(3000);
		waitAndSendKeys(By.id("RegisteredDevice_IMEI"), "356789012345678");
		waitAndSendKeys(By.id("RegisteredDevice_SerialNumber"), "RD-1001");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add RPM Status in Clinical Module")
	public void verifyUserCanAddRPMStatus() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/PatientRemoteMonitoringStatuses");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PatientRemoteMonitoringStatuses"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New RPM Status']"));
		sleep(3000);
		waitAndSendKeys(By.id("RPMStatus_Name"), "Active Monitoring");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add CPT Code in Clinical Module")
	public void verifyUserCanAddCPTCode() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/CPTCodes");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/CPTCodes"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New CPT Code']"));
		sleep(3000);
		waitAndSendKeys(By.id("RPMStatus_Name"), "99213");
		waitAndSendKeys(By.id("RPMStatus_Name"), "Office Visit, Established Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add Patients in Patients Module")
	public void userShouldBeAbleToAddPatientsInPatientsModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/Patients"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Patient']"));
		sleep(3000);
		waitAndSendKeys(By.id("Patient_LastName"), "Riley");
		waitAndSendKeys(By.id("Patient_FirstName"), "Blanche");
		WebElement birthDateInput = driver.findElement(By.id("Patient_BirthDate"));
		birthDateInput.click();
		sleep(2000);
		WebElement todayDate = driver.findElement(By.cssSelector(".ui-datepicker-calendar .ui-state-highlight"));
		todayDate.click();
		sleep(2000);
		clickWhenClickable(By.xpath("//button[normalize-space()='Add New Patient']"));
		sleep(2000);
		waitAndSendKeys(By.id("Patient_PhoneNumber"), "1234567890");
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/Patients"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Patient']"));
		sleep(3000);
		waitAndSendKeys(By.id("Patient_LastName"), "Riley");
		waitAndSendKeys(By.id("Patient_FirstName"), "Blanche");
		WebElement birthDateInput1 = driver.findElement(By.id("Patient_BirthDate"));
		birthDateInput1.click();
		sleep(2000);
		WebElement todayDate1 = driver.findElement(By.cssSelector(".ui-datepicker-calendar .ui-state-highlight"));
		todayDate1.click();
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnFindPatient']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//input[@type='radio']"));
		clickWhenClickable(By.xpath("//button[normalize-space()='Select Existing Patient']"));

	}

	@And("the user should be able to add SOAP Components in Clinical Module")
	public void userShouldBeAbleToAddSOAPComponents() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalSOAPComponents");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalSOAPComponents"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Clinical SOAP Components']"));
		sleep(3000);
		waitAndSendKeys(By.id("ClinicalObjectiveComponent_Name"), "Allergies");
		selectDropdownByIndexWhenReady(By.id("ClinicalObjectiveComponent_Type"), 1);
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add Patients Clinical Encounter in Clinical Module")
	public void userShouldBeAbleToAddPatientsClinicalEncounterInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/Patients"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[normalize-space()='Clinical Encounters']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[normalize-space()='Add New Clinical Encounter']"));
		sleep(2000);
		selectDropdownByIndexWhenReady(By.id("ClinicalEncounter_ClinicalObjectiveComponentId"), 1);
		sleep(2000);
		selectDropdownByIndexWhenReady(By.id("ClinicalEncounter_EncounterStatus"), 2);
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnEncounter']"));

	}

	@And("the user should be able to add, edit, and delete Patients in Clinical Module")
	public void userShouldBeAbleToAddEditAndDeletePatientsInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/CPTCodes");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/CPTCodes"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New CPT Code']"));
		sleep(3000);
		waitAndSendKeys(By.id("RPMStatus_Name"), "99213");
		waitAndSendKeys(By.id("RPMStatus_Name"), "Office Visit, Established Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to View Link and Sync Link in Clinical Module")
	public void userShouldBeAbleToViewLinkAndSyncLinkInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/Patients"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='A']"));
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add Encounter Status in Clinical Module")
	public void verifyUserCanAddEncounterStatus() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/ClinicalEncounterStatuses");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ClinicalEncounterStatuses"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Encounter Status']"));
		sleep(3000);
		waitAndSendKeys(By.id("ClinicalEncounterStatus_Name"), "Blood Pressure Monitoring");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to view Device Master in Clinical Module")
	public void verifyUserCanViewDeviceMaster() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeviceMasters");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeviceMasters"));
		sleep(3000);

	}

	@And("the user should be able to view and delete Prior Authorization Types in Clinical Module")
	public void verifyUserCanViewAndDeletePriorAuthorizationTypes() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/PriorAuthorizationTypes");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PriorAuthorizationTypes"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to view and delete Goals Of Treatment in Clinical Module")
	public void verifyUserCanViewAndDeleteGoalsOfTreatment() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/GoalsOfTreatments");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/GoalsOfTreatments"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='deleteEmployeeModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to delete Barriers in Clinical Module")
	public void verifyUserCanDeleteBarriers() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/Barriers");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Barriers"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to delete Community Resource in Clinical Module")
	public void verifyUserCanDeleteCommunityResource() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/CommunityResources");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/CommunityResources"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to delete Clinical Intervention in Clinical Module")
	public void verifyUserHasDeleteAccessForClinicalIntervention() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/ClinicalInterventions");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ClinicalInterventions"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='deleteEmployeeModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to delete ROS in Clinical Module")
	public void verifyUserCanDeleteROS() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/ROSs");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ROSs"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='deleteEmployeeModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to delete Outcome Action in Clinical Module")
	public void verifyUserCanDeleteOutcomeAction() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/OutcomeActions");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/OutcomeActions"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to delete RMP in Clinical Module")
	public void verifyUserCanDeleteRMP() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/RemoteMonitoringParameters");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RemoteMonitoringParameters"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='deleteEmployeeModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to delete ROS Group Type in Clinical Module")
	public void verifyUserCanDeleteROSGroupType() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/ROSGroupTypes");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ROSGroupTypes"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to delete Registered Device in Clinical Module")
	public void verifyUserCanDeleteRegisteredDevice() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/RegisteredDevices");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RegisteredDevices"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='deleteRegisteredDeviceModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to delete RPM Status in Clinical Module")
	public void verifyUserCanDeleteRPMStatus() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/PatientRemoteMonitoringStatuses");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PatientRemoteMonitoringStatuses"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to delete CPT Code in Clinical Module")
	public void verifyUserCanDeleteCPTCode() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/CPTCodes");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/CPTCodes"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to delete Patients in Patients Module")
	public void userShouldBeAbleToDeletePatientsInPatientsModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/Patients"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='deletePatientModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to delete SOAP Components in Clinical Module")
	public void userShouldBeAbleToDeleteSOAPComponentsInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalSOAPComponents");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalSOAPComponents"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(
				By.xpath("//div[@id='deleteClinicalObjectiveComponentModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to download Registered Device template in Clinical Module")
	public void verifyUserCanDownloadRegisteredDeviceTemplate() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/RegisteredDevices");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RegisteredDevices"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Download Template']"));
		sleep(3000);

	}

	@And("the user should be able to view Register Device Activity in Clinical Module")
	public void verifyUserCanViewRegisterDeviceActivity() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/RegisteredDevices");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RegisteredDevices"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'View Activity')]"));
		sleep(2000);

	}

	@And("the user should be able to deallocate BusinessGroup RPM Device in Clinical Module")
	public void verifyUserCanDeallocateBusinessGroupRPMDevice() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/RegisteredDevices");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RegisteredDevices"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'History')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Partner DeAllocation']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='IsReturnedPartnerDevice']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnDeletePartnerDeviceConfirm']"));
	}

	@And("the user should be able to allocate BusinessGroup RPM Device in Clinical Module")
	public void verifyUserCanAllocateBusinessGroupRPMDevice() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/RegisteredDevices");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RegisteredDevices"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'History')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Partner Allocation']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//ul[@id='ulUsers']//input[@type='radio' and @data-name='Apolo Pharmacy']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@class='btn btn-primary']"));

	}

	@And("the user should be able to deallocate Provider RPM Device in Clinical Module")
	public void verifyUserCanDeallocateProviderRPMDevice() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/RegisteredDevices");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RegisteredDevices"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'History')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Provider DeAllocation']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='IsReturnedProviderDevice']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnDeleteProviderDeviceConfirm']"));

	}

	@And("the user should be able to allocate Provider RPM Device in Clinical Module")
	public void verifyUserCanAllocateProviderRPMDevice() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/RegisteredDevices");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RegisteredDevices"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'History')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Provider Allocation']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//ul[@id='ulUsers']//input[@type='radio'][1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@class='btn btn-primary']"));

	}

	@And("the user should be able to view Registered Device History in Clinical Module")
	public void verifyUserCanViewRegisteredDeviceHistory() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/RegisteredDevices");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RegisteredDevices"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'History')]"));
		sleep(2000);

	}

	@And("the user should be able to upload Excel for Registered Device in Clinical Module")
	public void verifyUserCanUploadExcelForRegisteredDevice() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/RegisteredDevices");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RegisteredDevices"));
		sleep(3000);
		String filePath = "C:\\Users\\MayurChauhan\\Downloads\\RegisteredDeviceTemplate.xlsx";
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
		fileInput.sendKeys(filePath);
		sleep(3000);
		clickWhenClickable(By.xpath("//*[name()='path' and @id='Union_5']"));
		sleep(3000);

	}

	@And("the user should be able to delete Encounter Status in Clinical Module")
	public void verifyUserCanDeleteEncounterStatus() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/ClinicalEncounterStatuses");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ClinicalEncounterStatuses"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should not be able to add or edit Prior Authorization Types in Clinical Module")
	public void verifyUserCannotAddOrEditPriorAuthorizationTypes() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Prior Authorization Type']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to add or edit Goals Of Treatment in Clinical Module")
	public void verifyUserCannotAddOrEditGoalsOfTreatment() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Goals Of Treatment']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to add or edit Barriers in Clinical Module")
	public void verifyUserCannotAddOrEditBarriers() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Barriers']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to add or edit Community Resource in Clinical Module")
	public void verifyUserCannotAddOrEditCommunityResource() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Community Resource']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to add or edit Clinical Intervention in Clinical Module")
	public void verifyUserLacksAddEditAccessForClinicalIntervention() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Clinical Intervention']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to add or edit ROS in Clinical Module")
	public void verifyUserCannotAddOrEditROS() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New ROS Information']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to add or edit Outcome Action in Clinical Module")
	public void verifyUserCannotAddOrEditOutcomeAction() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Outcome Action']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to add or edit RMP in Clinical Module")
	public void verifyUserCannotAddOrEditRMP() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Remote Monitoring Parameter']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to add or edit ROS Group Type in Clinical Module")
	public void verifyUserCannotAddOrEditROSGroupType() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New ROS Group Type']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to add or edit Encounter Status in Clinical Module")
	public void verifyUserCannotAddOrEditEncounterStatus() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Encounter Status']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to add or edit Registered Device in Clinical Module")
	public void verifyUserCannotAddOrEditRegisteredDevice() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Registered Device']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to add or edit RPM Status in Clinical Module")
	public void verifyUserCannotAddOrEditRPMStatus() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New RPM Status']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to add or edit CPT Code in Clinical Module")
	public void verifyUserCannotAddOrEditCPTCode() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New CPT Code']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to add or edit Patients in Patients Module")
	public void userShouldNotBeAbleToAddOrEditPatientsInPatientsModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Patient']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to add or edit SOAP Components in Clinical Module")
	public void userShouldNotBeAbleToAddOrEditSOAPComponentsInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Clinical SOAP Components']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to view and edit Prior Authorization Types in Clinical Module")
	public void verifyUserCanViewAndEditPriorAuthorizationTypes() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/PriorAuthorizationTypes");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PriorAuthorizationTypes"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@id='PriorAuthorizationType_IsRxHealthCard']"));
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to view and edit Goals Of Treatment in Clinical Module")
	public void verifyUserCanViewAndEditGoalsOfTreatment() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/GoalsOfTreatments");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/GoalsOfTreatments"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("GoalsOfTreatment_Goal1"), "Diabetes Mellitus");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to edit Barriers in Clinical Module")
	public void verifyUserCanEditBarriers() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/Barriers");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Barriers"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		waitAndSendKeys(By.id("Barrier_Name"), "Transportation");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to edit Community Resource in Clinical Module")
	public void verifyUserCanEditCommunityResource() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/CommunityResources");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/CommunityResources"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		waitAndSendKeys(By.id("CommunityResource_Name"), "Transportation Services");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to edit Clinical Intervention in Clinical Module")
	public void verifyUserCanEditClinicalIntervention() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/ClinicalInterventions");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ClinicalInterventions"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		waitAndSendKeys(By.id("ClinicalIntervention_Name"), "Medication Adjustment");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to edit ROS in Clinical Module")
	public void verifyUserCanEditROS() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/ROSs");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ROSs"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		waitAndSendKeys(By.id("ROS_Name"), "Skin Rash on arms, itchy scalp");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to edit Outcome Action in Clinical Module")
	public void verifyUserCanEditOutcomeAction() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/OutcomeActions");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/OutcomeActions"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		waitAndSendKeys(By.id("OutcomeAction_Name"), "Blood Pressure Monitoring");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to edit RMP in Clinical Module")
	public void verifyUserCanEditRMP() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/RemoteMonitoringParameters");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RemoteMonitoringParameters"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		waitAndSendKeys(By.id("RemoteMonitoringParameter_Name"), "Blood Pressure Monitoring");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to edit ROS Group Type in Clinical Module")
	public void verifyUserCanEditROSGroupType() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/ROSGroupTypes");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ROSGroupTypes"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		waitAndSendKeys(By.id("ROSGroupType_Name"), "Blood Pressure Monitoring");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to edit Registered Device in Clinical Module")
	public void verifyUserCanEditRegisteredDevice() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/RegisteredDevices");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RegisteredDevices"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		selectDropdownByIndexWhenReady(By.id("RegisteredDevice_DeviceId"), 2);
		sleep(3000);
		waitAndSendKeys(By.id("RegisteredDevice_IMEI"), "356789012345678");
		waitAndSendKeys(By.id("RegisteredDevice_SerialNumber"), "RD-1001");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to edit RPM Status in Clinical Module")
	public void verifyUserCanEditRPMStatus() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/PatientRemoteMonitoringStatuses");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PatientRemoteMonitoringStatuses"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		waitAndSendKeys(By.id("RPMStatus_Name"), "Active Monitoring");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to edit CPT Code in Clinical Module")
	public void verifyUserCanEditCPTCode() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/CPTCodes");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/CPTCodes"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		waitAndSendKeys(By.id("RPMStatus_Name"), "99213");
		waitAndSendKeys(By.id("RPMStatus_Name"), "Office Visit, Established Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to edit Patients in Patients Module")
	public void userShouldBeAbleToEditPatientsInPatientsModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/Patients"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='A']"));
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to edit SOAP Components in Clinical Module")
	public void userShouldBeAbleToEditSOAPComponentsInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalSOAPComponents");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalSOAPComponents"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		waitAndSendKeys(By.id("ClinicalObjectiveComponent_Name"), "Allergies");
		selectDropdownByIndexWhenReady(By.id("ClinicalObjectiveComponent_Type"), 2);
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to edit Patients Clinical Encounter in Clinical Module")
	public void userShouldBeAbleToEditPatientsClinicalEncounterInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/Patients"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[normalize-space()='Clinical Encounters']"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		selectDropdownByIndexWhenReady(By.id("ClinicalEncounter_EncounterType"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
	}

	@And("the user should be able to delete Patients Clinical Encounter in Clinical Module")
	public void userShouldBeAbleToDeletePatientsClinicalEncounterInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/Patients"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[normalize-space()='Clinical Encounters']"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='deleteClinicalEncounterModel']//button[@id='btnDeleteConfirm']"));
	}

	@And("the user should be able to view Patients Clinical Encounter Review in Clinical Module")
	public void userShouldBeAbleToViewPatientsClinicalEncounterReviewInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/Patients"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[normalize-space()='Clinical Encounters']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[7]/div[1]/a[1]/img[1]"));
		sleep(2000);
	}

	@And("the user should be able to download files from Reports Status Log in Reports Module")
	public void verifyUserCanDownloadFilesFromReportsStatusLogInReportsModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Export to Excel']"));
		sleep(2000);
	}

	@And("the user should be able to download files from Reports Medication Recommendation And Suggestions in Reports Module")
	public void verifyUserCanDownloadFilesFromReportsMedicationRecommendationAndSuggestionsInReportsModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Export to Excel']"));
		sleep(2000);
	}

	@And("the user should be able to download files from Reports CCM Encounter Log in Reports Module")
	public void verifyUserCanDownloadFilesFromReportsCCMEncounterLogInReportsModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Export to Excel']"));
		sleep(2000);
	}

	@And("the user should be able to download files from Reports Call Log in Reports Module")
	public void verifyUserCanDownloadFilesFromReportsCallLogInReportsModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Export to Excel']"));
		sleep(2000);
	}

	@And("the user should be able to view Reports Status Log in Reports Module")
	public void verifyUserCanViewReportsStatusLogInReportsModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/StatusLogs");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/StatusLogs"));

	}

	@And("the user should be able to view Reports Medication Recommendation And Suggestions in Reports Module")
	public void verifyUserCanViewReportsMedicationRecommendationAndSuggestionsInReportsModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/MedicationRecommendation");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/MedicationRecommendation"));

	}

	@And("the user should be able to view Reports CCM Encounter Log in Reports Module")
	public void verifyUserCanViewReportsCCMEncounterLogInReportsModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/CCMEncounterLog");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/CCMEncounterLog"));

	}

	@And("the user should be able to view Reports Call Log in Reports Module")
	public void verifyUserCanViewReportsCallLogInReportsModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/CallLogs");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/CallLogs"));

	}

	@And("the user should be able to view Patient Provider Referral in Clinical Module")
	public void verifyUserCanViewPatientProviderReferralInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/Patients"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[normalize-space()='Clinical Encounters']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[normalize-space()='Add New Clinical Encounter']"));
		sleep(2000);
		assertElementPresent(By.xpath("//h1[normalize-space()='Referral']"));

	}

	@And("the user should be able to add CareGiver Name in Clinical Module")
	public void verifyUserCanAddCareGiverNameInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/Patients"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Patient Caregiver Name']"));
		sleep(2000);
		waitAndSendKeys(By.id("PatientCareGiverName_LastName"), "Martin");
		waitAndSendKeys(By.id("PatientCareGiverName_FirstName"), "Brian");
		clickWhenClickable(By.xpath("//button[@id='btnSaveCareGiverNamePopup']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add Prior Authorization in Clinical Module")
	public void verifyUserCanAddPriorAuthorizationInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalPriorAuthorizations");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalPriorAuthorizations"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Clinical Prior Authorization']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@id='addPatientNamePopup']//img"));
		sleep(2000);
		waitAndSendKeys(By.id("Filter_PatientId"), "0004406");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//input[@type='radio'])[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[@class='modal-footer text-right d-block']//button[@id='btnPatient']"));
		sleep(5000);
		clickWhenClickable(By.xpath("//a[@id='addDrugNamePopup']//img"));
		sleep(3000);
		waitAndSendKeys(By.id("Filter_DrugName"), "amoxilin");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//input[@name='groupOfDrugRadios' and @data-name='amoxilin']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[@id='divSearchDrugInfo']//button[@id='btnDrug']"));
		sleep(5000);
		clickWhenClickable(By.xpath("//a[@id='addProviderNamePopup']//img"));
		sleep(4000);
		clickWhenClickable(By.xpath("//input[@type='radio' and @name='groupOfProviderRadios']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnProvider']"));
		sleep(4000);
		clickWhenClickable(By.xpath("//a[@id='addPartnerNamePopup']//img"));
		sleep(3000);
		clickWhenClickable(By.xpath("//input[@id='rdoFullSearch']"));
		sleep(3000);
		waitAndSendKeys(By.id("Filter_BusinessName"), "Attorney");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//input[@type='radio' and @name='groupOfPartnerRadios']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnPartner']"));
		sleep(3000);
		WebElement dateInput = driver.findElement(By.name("ClinicalPriorAuthorization.ReceivedDate"));
		dateInput.clear();
		dateInput.sendKeys("10/09/2025");
		dateInput.sendKeys(Keys.TAB);
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Details']"));
		clickWhenClickable(By.xpath("//label[normalize-space()='Pharmacy Detail']"));
		clickWhenClickable(By.xpath("//label[normalize-space()='Provider Detail']"));
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Detail']"));
		clickWhenClickable(By.xpath("//button[@id='btnVerify']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnPendingSave']"));
		sleep(2000);
		WebElement dateInput1 = driver.findElement(By.name("ClinicalPriorAuthorization.SubmissionDate"));
		dateInput1.clear();
		dateInput1.sendKeys("10/09/2025");
		dateInput1.sendKeys(Keys.TAB);
		sleep(2000);
		waitAndSendKeys(By.id("ClinicalPriorAuthorization_SubmissionNote"), "Submission");
		clickWhenClickable(By.xpath("//button[@id='btnSaveSubmission']"));

	}

	@And("the user should be able to edit CareGiver Name in Clinical Module")
	public void verifyUserCanEditCareGiverNameInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/Patients"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.id("PatientCareGiverName_LastName"), "Martin");
		waitAndSendKeys(By.id("PatientCareGiverName_FirstName"), "Brian");
		clickWhenClickable(By.xpath("//button[@id='btnSaveCareGiverNamePopup']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to edit Prior Authorization in Clinical Module")
	public void verifyUserCanEditPriorAuthorizationInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalPriorAuthorizations");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalPriorAuthorizations"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='ProgressStatus']"));
		selectDropdownByIndexWhenReady(By.id("ProgressStatus"), 1);
		sleep(2000);
		waitAndSendKeys(By.id("ClinicalPriorAuthorization_Notes"), "Note");
		clickWhenClickable(By.xpath("//button[@id='btnSaveClinicalPriorAuthorizationOutcomeNote']"));

	}

	@And("the user should be able to delete CareGiver Name in Clinical Module")
	public void verifyUserCanDeleteCareGiverNameInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/Patients"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='deletePatientCareGiverName']"));
		sleep(1000);

	}

	@And("the user should be able to delete Prior Authorization in Clinical Module")
	public void verifyUserCanDeletePriorAuthorizationInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalPriorAuthorizations");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalPriorAuthorizations"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='deletePriorAuthorizationModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should not be able to edit or delete Med Recons Meds On Chart in Clinical Module")
	public void userShouldNotBeAbleToEditOrDeleteMedReconsMedsOnChartInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//tbody//a[1]//img[1]"));
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteMedicationConfirm']//img"));

	}

	@And("the user should not be able to add or delete Med Recons Meds On Chart in Clinical Module")
	public void userShouldNotBeAbleToAddOrDeleteMedReconsMedsOnChartInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Add Meds On Chart']"));
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteMedicationConfirm']//img"));

	}

	@And("the user should not be able to add or edit Med Recons Meds On Chart in Clinical Module")
	public void userShouldNotBeAbleToAddOrEditMedReconsMedsOnChartInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Add Meds On Chart']"));
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteMedicationConfirm']//img"));

	}

	@And("the user should not be able to add or edit Med Recons Current Medication in Clinical Module")
	public void userShouldNotBeAbleToAddOrEditMedReconsCurrentMedicationInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Add Current Medication']"));
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteMedicationConfirm']//img"));

	}

	@And("the user should not be able to add or edit Remote Patient Monitoring RPM in Clinical Module")
	public void userShouldNotBeAbleToAddOrEditRemotePatientMonitoringRPMInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Patient Remote Monitoring']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to edit or delete RPM Remote Monitoring Parameter in Clinical Module")
	public void userShouldNotBeAbleToEditOrDeleteRPMRemoteMonitoringParameterInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Devices']"));
		sleep(2000);
		assertElementNotPresent(
				By.xpath("//div[@class='row']//div[1]//div[1]//div[1]//div[2]//button[2]//*[name()='svg']"));
		assertElementNotPresent(By.xpath(
				"//div[@class='row']//div[1]//div[1]//div[1]//div[2]//button[3]//*[name()='svg']//*[name()='path' and @id='Path_21']"));

	}

	@And("the user should be able to edit RPM Remote Monitoring Parameter in Clinical Module")
	public void userShouldBeAbleToEditRPMRemoteMonitoringParameterInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Devices']"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='row']//div[1]//div[1]//div[1]//div[2]//button[2]//*[name()='svg']//*[name()='path' and @id='Path_20']"));
		sleep(2000);
		waitAndSendKeys(By.id("RemoteMonitorParameter_MaxTriggerValue"), "4");
		clickWhenClickable(By.xpath("//button[@id='btnSaveRemoteParameter']"));
		sleep(3000);

	}

	@And("the user should be able to add RPM External Details for Alert in Clinical Module")
	public void verifyUserCanAddRPMExternalDetailsForAlert() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='External Alerts']"));
		sleep(2000);
		waitAndSendKeys(By.id("AddPatientRemoteMonitoringExternalEmail_Name"), "John Doe");
		waitAndSendKeys(By.id("AddPatientRemoteMonitoringExternalEmail_EmailId"), "johndoe_test@mailinator.com");
		waitAndSendKeys(By.id("AddPatientRemoteMonitoringExternalEmail_PhoneNumber"), "555-101-2020");
		clickWhenClickable(By.xpath(
				"//button[@onclick='javascript: BtnSavePatientRemoteMonitoring();']//*[name()='svg']//*[name()='path' and @id='Path_23']"));
		sleep(3000);

	}

	@And("the user should be able to add RPM Trigger Alert for Time in Clinical Module")
	public void verifyUserCanAddRPMTriggerAlertForTime() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//i[@class='fa fa-plus']"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='model-inp']//select[@id='PatientRemoteMonitoringTriggerPoint_PatientRemoteMonitoringParameterId']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("PatientRemoteMonitoringTriggerPoint_PatientRemoteMonitoringParameterId"),
				1);
		sleep(2000);
		waitAndSendKeys(By.id("PatientRemoteMonitoringTriggerPoint_Minutes"), "10");
		clickWhenClickable(By.xpath(
				"//div[@class='modal-footer']//button[@id='btnSavePatientRemoteMonitoringTriggerPointDetailPopup']"));
		sleep(3000);

	}

	@And("the user should be able to edit RPM Trigger Alert for Time in Clinical Module")
	public void userShouldBeAbleToEditRPMTriggerAlertForTimeInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='rmMain-data readingTable-main']//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='tiggerAlert-dropdown show']//a[1]//*[name()='svg']//*[name()='path' and @id='Path_20']"));
		sleep(2000);
		waitAndSendKeys(By.id("PatientRemoteMonitoringTriggerPoint_Minutes"), "11");
		clickWhenClickable(By.xpath(
				"//div[@class='modal-footer']//button[@id='btnSavePatientRemoteMonitoringTriggerPointDetailPopup']"));
		sleep(1000);

	}

	@And("the user should be able to delete RPM Trigger Alert for Time in Clinical Module")
	public void userShouldBeAbleToDeleteRPMTriggerAlertForTimeInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='rmMain-data readingTable-main']//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu show']//a[@id='btnDeleteRemoteMonitoringTriggerPointDetail']//*[name()='svg']//*[name()='path' and @id='Path_21']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='deletePatientRemoteMonitoringTriggerPointDetail']"));
		sleep(1000);

	}

	@And("the user should be able to view Reports Remote Monitoring Report in Clinical Module")
	public void createProfileWithViewAccessForRemoteMonitoringReport() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should be able to view PA All PA in Clinical Module")
	public void userShouldBeAbleToViewAllPAInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should be able to send Clinical PA Insurance in Clinical Module")
	public void userShouldBeAbleToSendClinicalPAInsuranceInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should be able to delete PA ChartNote attachment in Clinical Module")
	public void userShouldBeAbleToDeletePAChartNoteAttachmentInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should be able to delete generated incoming attachment in Clinical Module")
	public void userShouldBeAbleToDeleteGeneratedIncomingAttachmentInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should be able to delete PA outcome status in Clinical Module")
	public void userShouldBeAbleToDeletePAOutcomeStatusInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should be able to delete PA status in Clinical Module")
	public void userShouldBeAbleToDeletePAStatusInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should be able to show generated PA by all in Clinical Module")
	public void userShouldBeAbleToShowGeneratedPABYAllInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should be able to export PA All PA to Excel in Clinical Module")
	public void userShouldBeAbleToExportAllPAToExcelInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should be able to view PA All PA outcome in Clinical Module")
	public void userShouldBeAbleToViewAllPAOutcomeInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should be able to submit PA All PA in Clinical Module")
	public void userShouldBeAbleToSubmitAllPAInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should be able to verify PA All PA in Clinical Module")
	public void userShouldBeAbleToVerifyAllPAInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should be able to generate PA All PA in Clinical Module")
	public void userShouldBeAbleToGenerateAllPAInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should not be able to send Clinical PA Insurance in Clinical Module")
	public void userShouldNotBeAbleToSendClinicalPAInsuranceInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should be able to edit PA Progress Step in Clinical Module")
	public void theUserShouldBeAbleToEditPAProgressStepInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalPriorAuthorizations");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalPriorAuthorizations"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='ddProgressStatus']"));
		sleep(2000);
		selectDropdownByIndexWhenReady(By.id("ddProgressStatus"), 1);
		sleep(2000);
		waitAndSendKeys(By.id("ClinicalPriorAuthorization_Notes1"), "Note");
		clickWhenClickable(By.xpath("//button[@id='btnSaveClinicalPriorAuthorizationNote']"));
	}

	@And("the user should not be able to export Device Usage Statistic Report in Clinical Module")
	public void theUserShouldNotBeAbleToExportDeviceUsageStatisticReportInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export to Excel']"));

	}

	@And("the user should be able to export Device Usage Statistic Report in Clinical Module")
	public void theUserShouldBeAbleToExportDeviceUsageStatisticReportInClinicalModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Export to Excel']"));

	}

	@And("the user should be able to view Device Usage Statistic Report in Clinical Module")
	public void theUserShouldBeAbleToViewDeviceUsageStatisticReportInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/DeviceUsageStatisticReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/DeviceUsageStatisticReport"));
		sleep(3000);

	}

	@And("the user should not be able to add or edit RPM CPT Code in Clinical Module")
	public void theUserShouldNotBeAbleToAddOrEditRPMCPTCodeInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[@id='addCPTCodePopup']//img"));
		assertElementNotPresent(By.xpath("//a[@onclick[contains(.,'editRPMEventCPTCode')]]"));

	}

	@And("the user should be able to delete RPM CPT Code in Clinical Module")
	public void theUserShouldBeAbleToDeleteRPMCPTCodeInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='CPT Code']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='CPT_Month']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("CPT_Month"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='CPT_Year']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("CPT_Year"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@id='addCPTCodePopup']//img"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='[99091]']"));
		clickWhenClickable(By.xpath("//button[@id='btnCPTCode']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='CPTFilter_Month']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("CPTFilter_Month"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='CPTFilter_Year']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("CPTFilter_Year"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//button[@onclick='javascript:CTPApply();']//*[name()='svg']//*[name()='path' and @id='Path_15']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@id='btnDeleteRPMEventCPTCode']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='deleteRPMEventCPTCode']"));
		sleep(2000);

	}

	@And("the user should not be able to add or delete RPM CPT Code in Clinical Module")
	public void theUserShouldNotBeAbleToAddOrDeleteRPMCPTCodeInClinicalModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='CPT Code']"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//a[@id='addCPTCodePopup']//img"));
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteRPMEventCPTCode']"));

	}

	@And("the user should be able to edit RPM CPT Code in Clinical Module")
	public void theUserShouldBeAbleToEditRPMCPTCodeInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='CPT Code']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='CPT_Month']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("CPT_Month"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='CPT_Year']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("CPT_Year"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@id='addCPTCodePopup']//img"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='[99091]']"));
		clickWhenClickable(By.xpath("//button[@id='btnCPTCode']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='CPTFilter_Month']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("CPTFilter_Month"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='CPTFilter_Year']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("CPTFilter_Year"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//button[@onclick='javascript:CTPApply();']//*[name()='svg']//*[name()='path' and @id='Path_15']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@onclick[contains(.,'editRPMEventCPTCode')]]"));
		sleep(2000);
		waitAndSendKeys(By.id("RPMEventCPTCode_Repeat"), "5");
		clickWhenClickable(By.xpath("//button[@id='btnSaveRPMEventCPTCode']"));

	}

	@And("the user should not be able to edit or delete RPM CPT Code in Clinical Module")
	public void theUserShouldNotBeAbleToEditOrDeleteRPMCPTCodeInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[@onclick[contains(.,'editRPMEventCPTCode')]]"));
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteRPMEventCPTCode']"));

	}

	@And("the user should be able to add RPM CPT Code in Clinical Module")
	public void theUserShouldBeAbleToAddRPMCPTCodeInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='CPT Code']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='CPT_Month']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("CPT_Month"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='CPT_Year']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("CPT_Year"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@id='addCPTCodePopup']//img"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='[99091]']"));
		clickWhenClickable(By.xpath("//button[@id='btnCPTCode']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='CPTFilter_Month']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("CPTFilter_Month"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='CPTFilter_Year']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("CPTFilter_Year"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//button[@onclick='javascript:CTPApply();']//*[name()='svg']//*[name()='path' and @id='Path_15']"));
		sleep(2000);

	}

	@And("the user should not be able to edit or delete Digital Signature in Clinical Module")
	public void theUserShouldNotBeAbleToEditOrDeleteDigitalSignatureInClinicalModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Digital Signature']"));
		sleep(3000);
		assertElementNotPresent(By.xpath("(//a[@data-original-title='Edit Digital Signature'])[1]"));
		assertElementNotPresent(By.xpath("(//a[@id='btnDeleteDigitalSignatureWizardConfirm'])[1]"));

	}

	@And("the user should be able to download Digital Signature in Clinical Module")
	public void theUserShouldBeAbleToDownloadDigitalSignatureInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Digital Signature']"));
		sleep(2000);

	}

	@And("the user should not be able to delete or download Digital Signature in Clinical Module")
	public void theUserShouldNotBeAbleToDeleteOrDownloadDigitalSignatureInClinicalModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Digital Signature']"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteDigitalSignatureWizardConfirm']"));

	}

	@And("the user should be able to edit Digital Signature in Clinical Module")
	public void theUserShouldBeAbleToEditDigitalSignatureInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Digital Signature']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[5]/div[1]/a[1]/img[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='ddSigner']"));
		sleep(2000);
		selectDropdownByIndexWhenReady(By.id("ddSigner"), 1);
		sleep(2000);
		waitAndSendKeys(By.id("DigitalSignatureSigner_FullName"), "Lisa Brooker");
		waitAndSendKeys(By.id("DigitalSignatureSigner_EmailID"), "LisaJBrooker@mailinator.com");
		clickWhenClickable(By.xpath("//a[@onclick='AddManualSigner()']//img[@class='v-align-middle']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Next']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Next']"));
		waitAndSendKeys(By.id("DigitalSignature_Subject"), "Signature requested");
		waitAndSendKeys(By.xpath("//div[@aria-label='Editor editing area: main. Press Alt+0 for help.']"),
				"Signature requested");
		clickWhenClickable(By.xpath("//a[normalize-space()='Finish']"));

	}

	@And("the user should be able to delete Digital Signature in Clinical Module")
	public void theUserShouldBeAbleToDeleteDigitalSignatureInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Digital Signature']"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//a[@id='btnDeleteDigitalSignatureWizardConfirm'])[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='deleteDigitalSignatureWizard']"));

	}

	@And("the user should not be able to edit or download Digital Signature in Clinical Module")
	public void theUserShouldNotBeAbleToEditOrDownloadDigitalSignatureInClinicalModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Digital Signature']"));
		sleep(3000);
		assertElementNotPresent(By.xpath("(//a[@data-original-title='Edit Digital Signature'])[1]"));

	}

	@And("the user should not be able to add or edit PA Progress Step in Clinical Module")
	public void theUserShouldNotBeAbleToAddOrEditPAProgressStepInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//button[@id='btnSaveClinicalPriorAuthorizationOutcomeNote']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to delete PA Progress Step in Clinical Module")
	public void theUserShouldBeAbleToDeletePAProgressStepInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalPriorAuthorizations");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalPriorAuthorizations"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		clickWhenClickable(By.xpath("//button[@id='deletepatientClinicalPriorAuthorizationNote']"));

	}

	@And("the user should not be able to add or delete PA Progress Step in Clinical Module")
	public void theUserShouldNotBeAbleToAddOrDeletePAProgressStepInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//button[@id='btnSaveClinicalPriorAuthorizationOutcomeNote']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit or delete PA Progress Step in Clinical Module")
	public void theUserShouldNotBeAbleToEditOrDeletePAProgressStepInClinicalModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to add PA Progress Step in Clinical Module")
	public void theUserShouldBeAbleToAddPAProgressStepInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalPriorAuthorizations");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalPriorAuthorizations"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='ProgressStatus']"));
		selectDropdownByIndexWhenReady(By.id("ProgressStatus"), 1);
		sleep(2000);
		waitAndSendKeys(By.id("ClinicalPriorAuthorization_Notes"), "Note");
		clickWhenClickable(By.xpath("//button[@id='btnSaveClinicalPriorAuthorizationOutcomeNote']"));

	}

	@And("the user should not be able to add or edit RPM Progress Step in Clinical Module")
	public void theUserShouldNotBeAbleToAddOrEditRPMProgressStepInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//button[@id='btnSaveRemoteMonitoringNote']//*[name()='svg']"));
		assertElementNotPresent(By.xpath("(//a[@data-original-title='Edit Provider EHR'])[1]"));

	}

	@And("the user should be able to delete RPM Progress Step in Clinical Module")
	public void theUserShouldBeAbleToDeleteRPMProgressStepInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Progress Steps']"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//a[@id='btnDeleteRemoteMonitoringNoteConfirm'])[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='deletepatientRemoteMonitoringNote']"));

	}

	@And("the user should not be able to add or delete RPM Progress Step in Clinical Module")
	public void theUserShouldNotBeAbleToAddOrDeleteRPMProgressStepInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//button[@id='btnSaveRemoteMonitoringNote']//*[name()='svg']//*[name()='path' and @id='Path_23']"));
		assertElementNotPresent(By.xpath("(//a[@id='btnDeleteRemoteMonitoringNoteConfirm'])[1]"));

	}

	@And("the user should be able to edit RPM Progress Step in Clinical Module")
	public void theUserShouldBeAbleToEditRPMProgressStepInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Progress Steps']"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//a[@data-original-title='Edit Provider EHR'])[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='AddProgressStatus']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("AddProgressStatus"), 1);
		sleep(2000);
		waitAndSendKeys(By.id("AddRemoteMonitoring_Note"), "Note");
		clickWhenClickable(By.xpath("//button[@id='btnSaveEditedRemoteMonitoringNote']"));
		sleep(2000);

	}

	@And("the user should not be able to edit or delete RPM Progress Step in Clinical Module")
	public void theUserShouldNotBeAbleToEditOrDeleteRPMProgressStepInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("(//a[@data-original-title='Edit Provider EHR'])[1]"));
		assertElementNotPresent(By.xpath("(//a[@id='btnDeleteRemoteMonitoringNoteConfirm'])[1]"));

	}

	@And("the user should be able to add RPM Progress Step in Clinical Module")
	public void theUserShouldBeAbleToAddRPMProgressStepInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Progress Steps']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='ProgressStatus']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("ProgressStatus"), 1);
		sleep(2000);
		waitAndSendKeys(By.id("RemoteMonitoring_Note"), "Note");
		clickWhenClickable(By.xpath(
				"//button[@id='btnSaveRemoteMonitoringNote']//*[name()='svg']//*[name()='path' and @id='Path_23']"));
		sleep(2000);

	}

	@And("the user should not be able to add or edit RPM RPM Status in Clinical Module")
	public void theUserShouldNotBeAbleToAddOrEditRPMStatusInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//button[@id='btnSaveRemoteMonitoringStatus']//*[name()='svg']//*[name()='path' and @id='Path_23']"));
		assertElementNotPresent(By.xpath("(//a[@data-original-title='Edit RPm Status'])[1]"));

	}

	@And("the user should be able to delete RPM RPM Status in Clinical Module")
	public void theUserShouldBeAbleToDeleteRPMStatusInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='RPM Status']"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//a[@id='btnDeletePatientRPMStatusConfirm'])[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='deletePatientRemoteMonitoringStatus']"));

	}

	@And("the user should not be able to add or delete RPM RPM Status in Clinical Module")
	public void theUserShouldNotBeAbleToAddOrDeleteRPMStatusInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//button[@id='btnSaveRemoteMonitoringStatus']//*[name()='svg']//*[name()='path' and @id='Path_23']"));
		assertElementNotPresent(By.xpath("(//a[@id='btnDeletePatientRPMStatusConfirm'])[1]"));

	}

	@And("the user should be able to edit RPM RPM Status in Clinical Module")
	public void theUserShouldBeAbleToEditRPMStatusInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='RPM Status']"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//a[@data-original-title='Edit RPm Status'])[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//select[@id='AddRPMStatus']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("AddRPMStatus"), 1);
		sleep(2000);
		waitAndSendKeys(By.id("AddRPM_Note"), "Note");
		clickWhenClickable(By.xpath("//button[@id='btnSaveEditedRemoteMonitoringStatus']"));
		sleep(2000);
	}

	@And("the user should not be able to edit or delete RPM RPM Status in Clinical Module")
	public void theUserShouldNotBeAbleToEditOrDeleteRPMStatusInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("(//a[@data-original-title='Edit RPm Status'])[1]"));
		assertElementNotPresent(By.xpath("(//a[@id='btnDeletePatientRPMStatusConfirm'])[1]"));

	}

	@And("the user should be able to add RPM RPM Status in Clinical Module")
	public void theUserShouldBeAbleToAddRPMStatusInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='RPM Status']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='RPMStatus']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("RPMStatus"), 1);
		sleep(2000);
		waitAndSendKeys(By.id("RPM_Note"), "Note");
		clickWhenClickable(By.xpath(
				"//button[@id='btnSaveRemoteMonitoringStatus']//*[name()='svg']//*[name()='path' and @id='Path_23']"));
		sleep(2000);

	}

	@And("the user should not be able to delete PA ChartNote attachment in Clinical Module")
	public void userShouldNotBeAbleToDeletePAChartNoteAttachmentInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should not be able to delete generated incoming attachment in Clinical Module")
	public void userShouldNotBeAbleToDeleteGeneratedIncomingAttachmentInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should not be able to delete PA outcome status in Clinical Module")
	public void userShouldNotBeAbleToDeletePAOutcomeStatusInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should not be able to delete PA status in Clinical Module")
	public void userShouldNotBeAbleToDeletePAStatusInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should not be able to show generated PA by all in Clinical Module")
	public void userShouldNotBeAbleToShowGeneratedPABYAllInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should not be able to export PA All PA to Excel in Clinical Module")
	public void userShouldNotBeAbleToExportPAAllPAToExcelInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should not be able to view PA All PA outcome in Clinical Module")
	public void userShouldNotBeAbleToViewPAAllPAOutcomeInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should not be able to submit PA All PA in Clinical Module")
	public void userShouldNotBeAbleToSubmitPAAllPAInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should not be able to verify PA All PA in Clinical Module")
	public void userShouldNotBeAbleToVerifyPAAllPAInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should not be able to generate PA All PA in Clinical Module")
	public void userShouldNotBeAbleToGeneratePAAllPAInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);

	}

	@And("the user should not be able to download drilldown report for Reports Remote Monitoring Report in Clinical Module")
	public void userShouldNotBeAbleToDownloadDrilldownReportForReportsRemoteMonitoringReportInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//tbody/tr[1]/td[10]/div[1]/a[2]//*[name()='svg']"));

	}

	@And("the user should not be able to export Reports Remote Monitoring Report to Excel in Clinical Module")
	public void userShouldNotBeAbleToExportReportsRemoteMonitoringReportToExcelInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export to Excel']"));

	}

	@And("the user should not be able to send Reports Remote Monitoring Report for signature in Clinical Module")
	public void userShouldNotBeAbleToSendReportsRemoteMonitoringReportForSignatureInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//tbody/tr[1]/td[10]/div[1]/a[1]/img[1]"));

	}

	@And("the user should not be able to download Reports Remote Monitoring Report file in Clinical Module")
	public void userShouldNotBeAbleToDownloadReportsRemoteMonitoringReportFileInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//tbody/tr[1]/td[10]/div[1]/a[1]/img[1]"));

	}

	@And("the user should not be able to drill down Reports Remote Monitoring Report in Clinical Module")
	public void userShouldNotBeAbleToDrillDownReportsRemoteMonitoringReportInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//tbody/tr[1]/td[10]/div[1]/a[2]//*[name()='svg']"));

	}

	@And("the user should be able to drill down Reports Remote Monitoring Report in Clinical Module")
	public void createProfileWithDrillDownAccessForRemoteMonitoringReport() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[10]/div[1]/a[2]//*[name()='svg']"));
		sleep(1000);

	}

	@And("the user should be able to download Reports Remote Monitoring Report file in Clinical Module")
	public void createProfileWithDownloadAccessForRemoteMonitoringReport() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[10]/div[1]/a[1]/img[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='ddMonth']"));
		sleep(2000);
		selectDropdownByIndexWhenReady(By.id("ddMonth"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='ddYear']"));
		sleep(2000);
		selectDropdownByIndexWhenReady(By.id("ddYear"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//button[normalize-space()='Download']"));
	}

	@And("the user should be able to send Reports Remote Monitoring Report for signature in Clinical Module")
	public void createProfileWithSendForSignatureAccessForRemoteMonitoringReport() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[10]/div[1]/a[1]/img[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='ddMonth']"));
		sleep(2000);
		selectDropdownByIndexWhenReady(By.id("ddMonth"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='ddYear']"));
		sleep(2000);
		selectDropdownByIndexWhenReady(By.id("ddYear"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//button[normalize-space()='Send for Signature']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='ddSigner']"));
		sleep(2000);
		selectDropdownByIndexWhenReady(By.id("ddSigner"), 1);
		sleep(2000);
		waitAndSendKeys(By.id("DigitalSignatureSigner_FullName"), "Lisa Brooker");
		waitAndSendKeys(By.id("DigitalSignatureSigner_EmailID"), "LisaJBrooker@mailinator.com");
		clickWhenClickable(By.xpath("//a[@onclick='AddManualSigner()']//img[@class='v-align-middle']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Next']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Next']"));
		waitAndSendKeys(By.id("DigitalSignature_Subject"), "Signature requested");
		waitAndSendKeys(By.xpath("//div[@aria-label='Editor editing area: main. Press Alt+0 for help.']"),
				"Signature requested");
		clickWhenClickable(By.xpath("//a[normalize-space()='Finish']"));

	}

	@And("the user should be able to export Reports Remote Monitoring Report to Excel in Clinical Module")
	public void createProfileWithExportToExcelAccessForRemoteMonitoringReport() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Export to Excel']"));

	}

	@And("the user should be able to download drilldown report for Reports Remote Monitoring Report in Clinical Module")
	public void createProfileWithDrillDownDownloadAccessForRemoteMonitoringReport() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/RemoteMonitoringReport");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/RemoteMonitoringReport"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[10]/div[1]/a[2]//*[name()='svg']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[normalize-space()='Download Report']"));
		sleep(1000);

	}

	@And("the user should not be able to add or delete RPM External Details for Alert in Clinical Module")
	public void verifyUserCannotAddOrDeleteRPMExternalDetailsForAlert() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//button[@onclick='javascript: BtnSavePatientRemoteMonitoring();']"));
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteRemoteMonitoringExternalEmailDetail']/img"));

	}

	@And("the user should not be able to add or edit RPM External Details for Alert in Clinical Module")
	public void verifyUserCannotAddOrEditRPMExternalDetailsForAlert() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//button[@onclick='javascript: BtnSavePatientRemoteMonitoring();']"));
		assertElementNotPresent(By.xpath("//a[contains(@onclick,'editRemoteMonitoringExternalEmailDetails')]/img"));

	}

	@And("the user should be able to delete RPM External Details for Alert in Clinical Module")
	public void verifyUserCanDeleteRPMExternalDetailsForAlert() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='External Alerts']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@id='btnDeleteRemoteMonitoringExternalEmailDetail']/img"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='deletePatientRemoteMonitoringExternalEmailDetail']"));

	}

	@And("the user should be able to edit RPM External Details for Alert in Clinical Module")
	public void verifyUserCanEditRPMExternalDetailsForAlert() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='External Alerts']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[10]/div[1]/a[1]/img[1]"));
		sleep(2000);
		waitAndSendKeys(By.id("PatientRemoteMonitoringExternalEmail_Relation"), "Patient");
		clickWhenClickable(By.xpath("//button[@id='btnSavePatientRemoteMonitoringExternalEmailDetailPopup']"));
		sleep(3000);

	}

	@And("the user should not be able to edit or delete RPM External Details for Alert in Clinical Module")
	public void verifyUserCannotEditOrDeleteRPMExternalDetailsForAlert() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[@class='tooltiped txt-decor-none user-access']//img"));
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteRemoteMonitoringExternalEmailDetail']//img"));
	}

	@And("the user should not be able to edit or delete RPM Trigger Alert for Time in Clinical Module")
	public void verifyUserCannotEditOrDeleteRPMTriggerAlertForTime() {
		sleep(3000);
		clickWhenClickable(By.xpath(
				"(//div[contains(@class,'readingTable-main')]//button//*[name()='svg']//*[name()='path' and contains(@id,'Path_')])[2]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[contains(@class,'tiggerAlert')]//a[contains(@onclick,'editRemoteMonitoringTriggerPointDetails')]"));
		assertElementNotPresent(By
				.xpath("//div[contains(@class,'tiggerAlert')]//a[@id='btnDeleteRemoteMonitoringTriggerPointDetail']"));
	}

	@And("the user should not be able to add or delete RPM Trigger Alert for Time in Clinical Module")
	public void userShouldNotBeAbleToAddOrDeleteRPMTriggerAlertForTimeInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//i[@class='fa fa-plus']"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='rmMain-data readingTable-main']//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu show']//a[@id='btnDeleteRemoteMonitoringTriggerPointDetail']//*[name()='svg']"));
	}

	@And("the user should not be able to add or edit RPM Trigger Alert for Time in Clinical Module")
	public void userShouldNotBeAbleToAddOrEditRPMTriggerAlertForTimeInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//i[@class='fa fa-plus']"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='rmMain-data readingTable-main']//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']//*[name()='path' and @id='Path_19']"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='tiggerAlert-dropdown show']//a[1]//*[name()='svg']//*[name()='path' and @id='Path_20']"));
	}

	@And("the user should not have access to Add or Delete RPM RMP Details in Clinical Module")
	public void userShouldNotHaveAccessToAddOrDeleteRPMRMPDetailsInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalPriorAuthorizations");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalPriorAuthorizations"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='deletePriorAuthorizationModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should not be able to edit RPM RMP Details in Clinical Module")
	public void userShouldNotBeAbleToEditRPMRMPDetailsInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalPriorAuthorizations");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalPriorAuthorizations"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='deletePriorAuthorizationModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should be able to edit RPM RMP Details in Clinical Module")
	public void userShouldBeAbleToEditRPMRMPDetailsInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalPriorAuthorizations");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalPriorAuthorizations"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='deletePriorAuthorizationModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should not be able to add or edit RPM Remote Monitoring Parameter in Clinical Module")
	public void userShouldNotBeAbleToAddOrEditRPMRemoteMonitoringParameterInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Devices']"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//button[@id='addRemoteMonitoringParameter']//*[name()='svg']//*[name()='path' and @id='Path_23']"));
		assertElementNotPresent(
				By.xpath("//div[@class='row']//div[1]//div[1]//div[1]//div[2]//button[2]//*[name()='svg']"));
	}

	@And("the user should be able to delete RPM Remote Monitoring Parameter in Clinical Module")
	public void userShouldBeAbleToDeleteRPMRemoteMonitoringParameterInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Devices']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@class='row']//div[1]//div[1]//div[1]//div[2]//button[3]//*[name()='svg']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='deleteRemoteMonitoringParameter']"));
		sleep(3000);

	}

	@And("the user should not be able to add or delete RPM Remote Monitoring Parameter in Clinical Module")
	public void userShouldNotBeAbleToAddOrDeleteRPMRemoteMonitoringParameterInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Devices']"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//button[@id='addRemoteMonitoringParameter']//*[name()='svg']//*[name()='path' and @id='Path_23']"));
		assertElementNotPresent(
				By.xpath("//div[@class='row']//div[1]//div[1]//div[1]//div[2]//button[3]//*[name()='svg']"));

	}

	@And("the user should be able to add RPM Remote Monitoring Parameter in Clinical Module")
	public void userShouldBeAbleToAddRPMRemoteMonitoringParameterInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Devices']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='RemoteMonitoringParameter']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("RemoteMonitoringParameter"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='Provider_FullName']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("Provider_FullName"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='RemoteMonitorParameter_PatientRemoteMonitoringDeviceId']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("RemoteMonitorParameter_PatientRemoteMonitoringDeviceId"), 1);
		sleep(2000);
		WebElement startDate = driver.findElement(By.id("RemoteMonitorParameter_StartDate"));
		startDate.clear();
		startDate.sendKeys("10/09/2025");
		startDate.sendKeys(Keys.TAB);
		sleep(3000);
		WebElement stopDate = driver.findElement(By.id("RemoteMonitorParameter_EndDate"));
		stopDate.clear();
		stopDate.sendKeys("10/09/2025");
		stopDate.sendKeys(Keys.TAB);
		sleep(2000);
		waitAndSendKeys(By.id("RemoteMonitorParameter_NormalMin"), "4");
		waitAndSendKeys(By.id("RemoteMonitorParameter_NormalMax"), "4");
		waitAndSendKeys(By.id("RemoteMonitorParameter_Level1MinNormal"), "4");
		waitAndSendKeys(By.id("RemoteMonitorParameter_Level1MaxNormal"), "4");
		waitAndSendKeys(By.id("RemoteMonitorParameter_Level2MinNormal"), "4");
		waitAndSendKeys(By.id("RemoteMonitorParameter_Level2MaxNormal"), "4");
		waitAndSendKeys(By.id("RemoteMonitorParameter_Level3MinNormal"), "4");
		waitAndSendKeys(By.id("RemoteMonitorParameter_Level3MaxNormal"), "4");
		waitAndSendKeys(By.id("RemoteMonitorParameter_MinTriggerValue"), "4");
		waitAndSendKeys(By.id("RemoteMonitorParameter_MaxTriggerValue"), "4");
		clickWhenClickable(By.xpath("//button[@id='addRemoteMonitoringParameter']//*[name()='svg']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Submit']"));

	}

	@And("the user should be able to make Outgoing Calls in Clinical Module")
	public void userShouldBeAbleToMakeOutgoingCallsInClinicalModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@id='page-wrapper']//div[@class='rmBesic-data']//div[1][1]//a[1]//*[name()='svg']//*[name()='path' and @id='Path_6']"));

	}

	@And("the user should be able to export data to Excel in Clinical Module")
	public void userShouldBeAbleToExportDataToExcelInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Export to Excel']"));

	}

	@And("the user should be able to delete Remote Patient Monitoring RPM in Clinical Module")
	public void userShouldBeAbleToDeleteRemotePatientMonitoringRPMInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='deleteEmployeeModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should not be able to add or delete Remote Patient Monitoring RPM in Clinical Module")
	public void userShouldNotBeAbleToAddOrDeleteRemotePatientMonitoringRPMInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Patient Remote Monitoring']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to edit Remote Patient Monitoring RPM in Clinical Module")
	public void userShouldBeAbleToEditRemotePatientMonitoringRPMInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Progress Steps']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='ProgressStatus']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("ProgressStatus"), 1);
		sleep(2000);
		waitAndSendKeys(By.id("RemoteMonitoring_Note"), "Note");
		clickWhenClickable(By.xpath(
				"//button[@id='btnSaveRemoteMonitoringNote']//*[name()='svg']//*[name()='path' and @id='Path_23']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Submit']"));

	}

	@And("the user should not be able to edit or delete Remote Patient Monitoring RPM in Clinical Module")
	public void userShouldNotBeAbleToEditOrDeleteRemotePatientMonitoringRPMInClinicalModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to add Remote Patient Monitoring RPM in Clinical Module")
	public void userShouldBeAbleToAddRemotePatientMonitoringRPMInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/PatientRemoteMonitorings");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/PatientRemoteMonitorings"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Patient Remote Monitoring']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@id='addPatientNamePopup']//img"));
		sleep(2000);
		waitAndSendKeys(By.id("Filter_PatientId"), "0004406");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//input[@id='0c950395-71e6-4134-b8e1-a405b7ad98f6']"));
		clickWhenClickable(By.xpath("//div[@class='modal-footer text-right d-block']//button[@id='btnPatient']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnNext']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Submit']"));
	}

	@And("the user should not have access to Export Excel or Details for Reports MTM Encounter Log in Clinical Module")
	public void userShouldNotHaveAccessToExportExcelOrDetailsForReportsMTMEncounterLogInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export to Excel']"));
		assertElementNotPresent(By.xpath("//a[@class='txt-decor-none']//img"));

	}

	@And("the user should be able to view Details for Reports MTM Encounter Log in Clinical Module")
	public void userShouldBeAbleToViewDetailsForReportsMTMEncounterLogInClinicalModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@class='txt-decor-none']//img"));

	}

	@And("the user should be able to export Reports MTM Encounter Log to Excel in Clinical Module")
	public void userShouldBeAbleToExportReportsMTMEncounterLogToExcelInClinicalModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Export to Excel']"));

	}

	@And("the user should be able to view Reports MTM Encounter Log in Clinical Module")
	public void userShouldBeAbleToViewReportsMTMEncounterLogInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/MTMEncounterLog");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/MTMEncounterLog"));
		sleep(3000);

	}

	@And("the user should be able to delete Med Recons Current Medication in Clinical Module")
	public void userShouldBeAbleToDeleteMedReconsCurrentMedicationInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalMedRecons");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalMedRecons"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Clinical Med Recons']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//select[@id='ClinicalEncounter_EncounterStatus']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("ClinicalEncounter_EncounterStatus"), 2);
		sleep(1000);
		clickWhenClickable(By.xpath("//a[@id='addPatientNamePopup']//img"));
		sleep(2000);
		waitAndSendKeys(By.id("Filter_PatientId"), "0004406");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//input[@id='0c950395-71e6-4134-b8e1-a405b7ad98f6']"));
		clickWhenClickable(By.xpath("//div[@class='modal-footer text-right d-block']//button[@id='btnPatient']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Current Medication']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[@class='model-inp requiredfield']//img"));
		sleep(1000);
		waitAndSendKeys(By.id("Filter_DrugName"), "amoxilin");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//input[@id='0']"));
		clickWhenClickable(By.xpath("//div[@id='divSearchDrugInfo']//button[@id='btnDrug']"));
		clickWhenClickable(By.xpath("//td[@class='text-right']//a[1]//*[name()='svg']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//tr[@id='trMed_1']//a[@id='btnDeleteMedicationConfirm']//img"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='deletepatientmedsonchart']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to add or delete Med Recons Current Medication in Clinical Module")
	public void userShouldNotBeAbleToAddOrDeleteMedReconsCurrentMedicationInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Add Current Medication']"));
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteMedicationConfirm']//img"));

	}

	@And("the user should be able to edit Med Recons Current Medication in Clinical Module")
	public void userShouldBeAbleToEditMedReconsCurrentMedicationInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalMedRecons");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalMedRecons"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Clinical Med Recons']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//select[@id='ClinicalEncounter_EncounterStatus']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("ClinicalEncounter_EncounterStatus"), 2);
		sleep(1000);
		clickWhenClickable(By.xpath("//a[@id='addPatientNamePopup']//img"));
		sleep(2000);
		waitAndSendKeys(By.id("Filter_PatientId"), "0004406");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//input[@id='0c950395-71e6-4134-b8e1-a405b7ad98f6']"));
		clickWhenClickable(By.xpath("//div[@class='modal-footer text-right d-block']//button[@id='btnPatient']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Current Medication']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[@class='model-inp requiredfield']//img"));
		sleep(1000);
		waitAndSendKeys(By.id("Filter_DrugName"), "amoxilin");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//input[@id='0']"));
		clickWhenClickable(By.xpath("//div[@id='divSearchDrugInfo']//button[@id='btnDrug']"));
		clickWhenClickable(By.xpath("//td[@class='text-right']//a[1]//*[name()='svg']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//tr[@id='trMed_1']//a[1]//img[1]"));
		sleep(1000);
		waitAndSendKeys(By.id("ExtendedMedsOnChart_Direction_1"), "Morning");
		clickWhenClickable(By.xpath("//tr[@id='trMed_1']//a[1]//img[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to edit or delete Med Recons Current Medication in Clinical Module")
	public void userShouldNotBeAbleToEditOrDeleteMedReconsCurrentMedicationInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//tbody//a[1]//img[1]"));
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteMedicationConfirm']//img"));

	}

	@And("the user should be able to add Med Recons Current Medication in Clinical Module")
	public void userShouldBeAbleToAddMedReconsCurrentMedicationInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalMedRecons");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalMedRecons"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Clinical Med Recons']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//select[@id='ClinicalEncounter_EncounterStatus']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("ClinicalEncounter_EncounterStatus"), 2);
		sleep(1000);
		clickWhenClickable(By.xpath("//a[@id='addPatientNamePopup']//img"));
		sleep(2000);
		waitAndSendKeys(By.id("Filter_PatientId"), "0004406");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//input[@id='0c950395-71e6-4134-b8e1-a405b7ad98f6']"));
		clickWhenClickable(By.xpath("//div[@class='modal-footer text-right d-block']//button[@id='btnPatient']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Current Medication']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[@class='model-inp requiredfield']//img"));
		sleep(1000);
		waitAndSendKeys(By.id("Filter_DrugName"), "amoxilin");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//input[@id='0']"));
		clickWhenClickable(By.xpath("//div[@id='divSearchDrugInfo']//button[@id='btnDrug']"));
		clickWhenClickable(By.xpath("//td[@class='text-right']//a[1]//*[name()='svg']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to delete Med Recons Meds On Chart in Clinical Module")
	public void userShouldBeAbleToDeleteMedReconsMedsOnChartInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalMedRecons");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalMedRecons"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Clinical Med Recons']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//select[@id='ClinicalEncounter_EncounterStatus']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("ClinicalEncounter_EncounterStatus"), 2);
		sleep(1000);
		clickWhenClickable(By.xpath("//a[@id='addPatientNamePopup']//img"));
		sleep(2000);
		waitAndSendKeys(By.id("Filter_PatientId"), "0004406");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//input[@id='0c950395-71e6-4134-b8e1-a405b7ad98f6']"));
		clickWhenClickable(By.xpath("//div[@class='modal-footer text-right d-block']//button[@id='btnPatient']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Meds On Chart']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[@class='model-inp requiredfield']//img"));
		sleep(1000);
		waitAndSendKeys(By.id("Filter_DrugName"), "amoxilin");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//input[@id='0']"));
		clickWhenClickable(By.xpath("//div[@id='divSearchDrugInfo']//button[@id='btnDrug']"));
		clickWhenClickable(By.xpath("//td[@class='text-right']//a[1]//*[name()='svg']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//tr[@id='trMed_1']//a[@id='btnDeleteMedicationConfirm']//img"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='deletepatientmedsonchart']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to edit Med Recons Meds On Chart in Clinical Module")
	public void userShouldBeAbleToEditMedReconsMedsOnChartInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalMedRecons");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalMedRecons"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Clinical Med Recons']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//select[@id='ClinicalEncounter_EncounterStatus']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("ClinicalEncounter_EncounterStatus"), 2);
		sleep(1000);
		clickWhenClickable(By.xpath("//a[@id='addPatientNamePopup']//img"));
		sleep(2000);
		waitAndSendKeys(By.id("Filter_PatientId"), "0004406");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//input[@id='0c950395-71e6-4134-b8e1-a405b7ad98f6']"));
		clickWhenClickable(By.xpath("//div[@class='modal-footer text-right d-block']//button[@id='btnPatient']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Meds On Chart']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[@class='model-inp requiredfield']//img"));
		sleep(1000);
		waitAndSendKeys(By.id("Filter_DrugName"), "amoxilin");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//input[@id='0']"));
		clickWhenClickable(By.xpath("//div[@id='divSearchDrugInfo']//button[@id='btnDrug']"));
		clickWhenClickable(By.xpath("//td[@class='text-right']//a[1]//*[name()='svg']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//tr[@id='trMed_1']//a[1]//img[1]"));
		sleep(1000);
		waitAndSendKeys(By.id("ExtendedMedsOnChart_Direction_1"), "Morning");
		clickWhenClickable(By.xpath("//tr[@id='trMed_1']//a[1]//img[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add Med Recons Meds On Chart in Clinical Module")
	public void userShouldBeAbleToAddMedReconsMedsOnChartInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalMedRecons");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalMedRecons"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Clinical Med Recons']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//select[@id='ClinicalEncounter_EncounterStatus']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("ClinicalEncounter_EncounterStatus"), 2);
		sleep(1000);
		clickWhenClickable(By.xpath("//a[@id='addPatientNamePopup']//img"));
		sleep(2000);
		waitAndSendKeys(By.id("Filter_PatientId"), "0004406");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//input[@id='0c950395-71e6-4134-b8e1-a405b7ad98f6']"));
		clickWhenClickable(By.xpath("//div[@class='modal-footer text-right d-block']//button[@id='btnPatient']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Meds On Chart']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[@class='model-inp requiredfield']//img"));
		sleep(1000);
		waitAndSendKeys(By.id("Filter_DrugName"), "amoxilin");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//input[@id='0']"));
		clickWhenClickable(By.xpath("//div[@id='divSearchDrugInfo']//button[@id='btnDrug']"));
		clickWhenClickable(By.xpath("//td[@class='text-right']//a[1]//*[name()='svg']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to view Grid View in Clinical Module")
	public void userShouldBeAbleToViewGridViewInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalPriorAuthorizations");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalPriorAuthorizations"));
		sleep(3000);

	}

	@And("the user should be able to access Download File in Clinical Module")
	public void userShouldBeAbleToAccessDownloadFileInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalMedRecons");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalMedRecons"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[8]/div[1]/a[1]/img[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Current Medication?']"));
		clickWhenClickable(By.xpath("//button[@id='btnClinicalMedReconReportConfirm']"));

	}

	@And("the user should not be able to add or edit Med Recons in Clinical Module")
	public void userShouldNotBeAbleToAddOrEditMedReconsInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Clinical Med Recons']"));
		assertElementNotPresent(By.xpath("//tbody/tr[1]/td[8]/div[1]/a[2]/img[1]"));

	}

	@And("the user should be able to delete Med Recons in Clinical Module")
	public void userShouldBeAbleToDeleteMedReconsInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalMedRecons");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalMedRecons"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//a[@id='btnDeleteClinicalMedRecon'])[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[@id='deleteClinicalMedReconModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should not be able to edit or delete Med Recons in Clinical Module")
	public void userShouldNotBeAbleToEditOrDeleteMedReconsInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalMedRecons");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalMedRecons"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//tbody/tr[1]/td[8]/div[1]/a[1]/img[1]"));
		assertElementNotPresent(By.xpath("//tbody/tr[1]/td[8]/div[1]/a[2]/img[1]"));
		assertElementNotPresent(By.xpath("//tbody/tr[1]/td[8]/div[1]/a[3]/img[1]"));
	}

	@And("the user should be able to add Med Recons in Clinical Module")
	public void userShouldBeAbleToAddMedReconsInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalMedRecons");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalMedRecons"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Clinical Med Recons']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//select[@id='ClinicalEncounter_EncounterStatus']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("ClinicalEncounter_EncounterStatus"), 2);
		sleep(1000);
		clickWhenClickable(By.xpath("//a[@id='addPatientNamePopup']//img"));
		sleep(2000);
		waitAndSendKeys(By.id("Filter_PatientId"), "0004406");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//input[@id='0c950395-71e6-4134-b8e1-a405b7ad98f6']"));
		clickWhenClickable(By.xpath("//div[@class='modal-footer text-right d-block']//button[@id='btnPatient']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to Unarchive in Clinical Module")
	public void userShouldBeAbleToUnarchiveInClinicalModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Filter']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Show All Records?']"));
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//a[@id='btnUnArchive']//*[name()='svg']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnUnArchiveConfirm']"));

	}

	@And("the user should be able to Archive in Clinical Module")
	public void userShouldBeAbleToArchiveInClinicalModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("//*[name()='path' and @id='Union_4']"));

	}

	@And("the user should be able to access Details in Clinical Module")
	public void userShouldBeAbleToAccessDetailsInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalPriorAuthorizations");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalPriorAuthorizations"));
		sleep(3000);
	}

	@And("the user should be able to Export Excel in Clinical Module")
	public void userShouldBeAbleToExportExcelInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalPriorAuthorizations");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalPriorAuthorizations"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Export to Excel']"));
		sleep(2000);

	}

	@And("the user should not be able to edit or delete CareGiver Name in Clinical Module")
	public void verifyUserCannotEditOrDeleteCareGiverNameInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/Patients"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit or delete Prior Authorization in Clinical Module")
	public void verifyUserCannotEditOrDeletePriorAuthorizationInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalPriorAuthorizations");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalPriorAuthorizations"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or delete CareGiver Name in Clinical Module")
	public void verifyUserCannotAddOrDeleteCareGiverNameInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/Patients"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Patient Caregiver Name']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or delete Prior Authorization in Clinical Module")
	public void verifyUserCannotAddOrDeletePriorAuthorizationInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalPriorAuthorizations");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalPriorAuthorizations"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Clinical Prior Authorization']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or edit CareGiver Name in Clinical Module")
	public void verifyUserCannotAddOrEditCareGiverNameInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/Patients"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Patient Caregiver Name']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to add or edit Prior Authorization in Clinical Module")
	public void verifyUserCannotAddOrEditPriorAuthorizationInClinicalModule() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Clinical Prior Authorization']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should be able to refer to a new provider in Patient Provider Referral in Clinical Module")
	public void verifyUserCanReferToNewProviderInPatientProviderReferralInClinicalModule() {
		sleep(3000);
		selectDropdownByIndexWhenReady(By.id("ClinicalEncounter_ClinicalObjectiveComponentId"), 1);
		sleep(2000);
		selectDropdownByIndexWhenReady(By.id("ClinicalEncounter_EncounterStatus"), 2);
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnEncounter']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@id='addReferralProviderNamePopup']//img"));
		sleep(2000);
		clickWhenClickable(By.xpath("//li[@class='searchResult-li']//input[@type='radio'][1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnProvider']"));
		sleep(2000);
		waitAndSendKeys(By.id("ClinicalEncounter_ClinicalReferral_Issue"), "Blood Pressure");
		clickWhenClickable(By.xpath("//select[@id='ClinicalEncounter_ClinicalReferral_ReferralCategoryId']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("ClinicalEncounter_ClinicalReferral_ReferralCategoryId"), 2);
		sleep(2000);
		clickWhenClickable(By.xpath("//img[@src='/Content/img/svg/refer_float.svg']"));
		sleep(2000);

	}

	@And("the user should not be able to refer to a new provider in Patient Provider Referral in Clinical Module")
	public void verifyUserCannotReferToNewProviderInPatientProviderReferralInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//img[@src='/Content/img/svg/refer_float.svg']"));

	}

	@And("the user should be able to view Star1 Drug in Patients Clinical Encounter Review in Clinical Module")
	public void userShouldBeAbleToViewStar1DrugInPatientsClinicalEncounterReviewInClinicalModule() {
		sleep(3000);
		assertElementPresent(By.xpath("//h1[normalize-space()='Medications Suggestion']"));

	}

	@And("the user should not be able to access Patients Clinical Encounter Review in Clinical Module")
	public void userShouldNotBeAbleToAccessPatientsClinicalEncounterReviewInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/Patients"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//button[normalize-space()='Clinical Encounters']"));

	}

	@And("the user should not be able to download files from Reports Status Log in Reports Module")
	public void verifyUserCannotDownloadFilesFromReportsStatusLogInReportsModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export to Excel']"));

	}

	@And("the user should not be able to download files from Reports Medication Recommendation And Suggestions in Reports Module")
	public void verifyUserCannotDownloadFilesFromReportsMedicationRecommendationAndSuggestionsInReportsModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export to Excel']"));

	}

	@And("the user should not be able to download files from Reports CCM Encounter Log in Reports Module")
	public void verifyUserCannotDownloadFilesFromReportsCCMEncounterLogInReportsModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export to Excel']"));

	}

	@And("the user should not be able to download files from Reports Call Log in Reports Module")
	public void verifyUserCannotDownloadFilesFromReportsCallLogInReportsModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export to Excel']"));

	}

	@And("the user should be able to edit Encounter Status in Clinical Module")
	public void verifyUserCanEditEncounterStatus() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/ClinicalEncounterStatuses");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ClinicalEncounterStatuses"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		waitAndSendKeys(By.id("ClinicalEncounterStatus_Name"), "Blood Pressure Monitoring");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
	}

	@And("the user should be able to edit Device Master in Clinical Module")
	public void verifyUserCanEditDeviceMaster() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/DeviceMasters");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeviceMasters"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		waitAndSendKeys(By.id("DeviceMaster_Description"), "Blood Pressure Monitoring");
		clickWhenClickable(By.xpath("//button[@id='btnSaveDeviceMaster']"));
	}

	@And("the user should not be able to add or delete Prior Authorization Types in Clinical Module")
	public void verifyUserCannotAddOrDeletePriorAuthorizationTypes() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Prior Authorization Type']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or delete Goals Of Treatment in Clinical Module")
	public void verifyUserCannotAddOrDeleteGoalsOfTreatment() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Goals Of Treatment']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or delete Barriers in Clinical Module")
	public void verifyUserCannotAddOrDeleteBarriers() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Barriers']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or delete Community Resource in Clinical Module")
	public void verifyUserCannotAddOrDeleteCommunityResource() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Community Resource']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or delete Clinical Intervention in Clinical Module")
	public void verifyUserCannotAddOrDeleteClinicalIntervention() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Clinical Intervention']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or delete ROS in Clinical Module")
	public void verifyUserCannotAddOrDeleteROS() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New ROS Information']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or delete Outcome Action in Clinical Module")
	public void verifyUserCannotAddOrDeleteOutcomeAction() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Outcome Action']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or delete RMP in Clinical Module")
	public void verifyUserCannotAddOrDeleteRMP() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Remote Monitoring Parameter']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or delete ROS Group Type in Clinical Module")
	public void verifyUserCannotAddOrDeleteROSGroupType() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New ROS Group Type']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or delete Encounter Status in Clinical Module")
	public void verifyUserCannotAddOrDeleteEncounterStatus() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Encounter Status']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or delete Registered Device in Clinical Module")
	public void verifyUserCannotAddOrDeleteRegisteredDevice() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Registered Device']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or delete RPM Status in Clinical Module")
	public void verifyUserCannotAddOrDeleteRPMStatus() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New RPM Status']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or delete CPT Code in Clinical Module")
	public void verifyUserCannotAddOrDeleteCPTCode() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New CPT Code']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or delete Patients in Patients Module")
	public void userShouldNotBeAbleToAddOrDeletePatientsInPatientsModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Patient']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or delete SOAP Components in Clinical Module")
	public void userShouldNotBeAbleToAddOrDeleteSOAPComponentsInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Clinical SOAP Components']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or delete Patients Clinical Encounter in Clinical Module")
	public void userShouldNotBeAbleToAddOrDeletePatientsClinicalEncounterInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/Patients"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[normalize-space()='Clinical Encounters']"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//button[normalize-space()='Add New Clinical Encounter']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add or edit Patients Clinical Encounter in Clinical Module")
	public void userShouldNotBeAbleToAddOrEditPatientsClinicalEncounterInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/Patients"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[normalize-space()='Clinical Encounters']"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//button[normalize-space()='Add New Clinical Encounter']"));
		clickWhenClickable(By.xpath("(//button[@id='bucketDrop']/i)[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to update Component Information in Clinical Module")
	public void verifyUserCannotUpdateComponentInformationInClinicalModule() {
		driver.get(baseUrl + "/Setup/Home/ClinicalSOAPComponentSetting");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}

	}

	@And("the user should not be able to view General Audit View settings in Clinical Module")
	public void verifyUserCannotViewGeneralAuditViewSettingsInClinicalModule() {
		sleep(3000);
		driver.get(baseUrl + "/Clinical/Home/ClinicalPriorAuthorizations");
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalPriorAuthorizations"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[normalize-space()='Created Date']"));
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated By']"));

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
