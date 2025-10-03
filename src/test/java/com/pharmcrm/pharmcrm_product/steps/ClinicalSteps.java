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
