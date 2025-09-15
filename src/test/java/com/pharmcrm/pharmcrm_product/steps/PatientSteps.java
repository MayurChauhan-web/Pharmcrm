package com.pharmcrm.pharmcrm_product.steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import org.junit.Assert;
import driver.DriverFactory;

public class PatientSteps {

	String createdEmail;
	String baseUrl = "http://qa01.pharmcrm.com";
	String profileName;

	private WebDriver driver = DrugSteps.driver;
	private WebDriverWait wait = DrugSteps.wait;

	public PatientSteps() {
		this.driver = DriverFactory.getDriver();
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	@Given("I log in as admin for Patient module")
	public void loginAsAdminForPatientModule() {
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

	@When("I create a new user with email for Patient Module {string}")
	public void createNewUserWithEmailForPatientModule(String email) {
		this.createdEmail = email; // FIX: assign to local variable
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

	@And("I create a profile with View, Quick Text, Reply, Add To Patient, and Send VCard access to Text")
	public void createProfileWithViewQuickTextReplyAddToPatientAndSendVCardAccessToText() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with no Add access to Generate New Access Code")
	public void createProfileWithNoAddAccessToGenerateNewAccessCode() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg41GenerateNewAccessCodeAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to add patient external source")
	public void userShouldBeAbleToAddPatientExternalSource() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='External Source']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add External Source']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//select[@id='Patient_PatientExternalSource_ExternalSource_Id']"));
		selectDropdownByIndexWhenReady(By.id("Patient_PatientExternalSource_ExternalSource_Id"), 1);
		waitAndSendKeys(By.xpath("//input[@id='PatientExternalSource_ExternalPatientId']"), "22");
		clickWhenClickable(By.xpath("//button[@id='btnSaveEHR']"));

	}

	@Then("the user should be able to delete patient external source")
	public void userShouldBeAbleToDeletePatientExternalSource() {
		clickWhenClickable(By.xpath("//a[normalize-space()='External Source']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[7]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@id='btnDeleteEHR']//span[contains(text(),'Delete')]"));
		clickWhenClickable(By.xpath("//button[@id='deletepatientEHR']"));

	}

	@And("I create a profile with Add access only to Generate New Access Code")
	public void createProfileWithAddAccessOnlyToGenerateNewAccessCode() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add, Edit, and Delete access to Patient Module Patient External Source")
	public void createProfileWithAddEditAndDeleteAccessToPatientModulePatientExternalSource() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to edit patient external source")
	public void userShouldBeAbleToEditPatientExternalSource() {
		clickWhenClickable(By.xpath("//a[normalize-space()='External Source']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[7]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		waitAndSendKeys(By.xpath("//input[@id='PatientExternalSource_ExternalPatientId']"), "22");
		clickWhenClickable(By.xpath("//button[@id='btnSaveEHR']"));

	}

	@Then("the user should not be able to delete patient external source")
	public void userShouldNotBeAbleToDeletePatientExternalSource() {
		clickWhenClickable(By.xpath("//a[normalize-space()='External Source']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[7]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteEHR']//span[contains(text(),'Delete')]"));

	}

	@Then("the user should not be able to edit or delete patient external source")
	public void userShouldNotBeAbleToEditOrDeletePatientExternalSource() {
		clickWhenClickable(By.xpath("//a[normalize-space()='External Source']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[7]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteEHR']//span[contains(text(),'Delete')]"));

	}

	@And("I create a profile with Add access only to Patient Module Patient External Source")
	public void createProfileWithAddAccessOnlyToPatientModulePatientExternalSource() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg12PatientEHREdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg12PatientEHRDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add and Delete access to Patient Module Patient Family")
	public void createProfileWithAddAndDeleteAccessForPatientFamily() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Patient Module Patient Family")
	public void createProfileWithAddAccessOnlyForPatientFamily() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg18PatientFamilyDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("the user should not be able to edit or delete patient pharmacy")
	public void verifyUserCannotEditOrDeletePatientPharmacy() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[@id='btnDeletePharmacyConfirm']//img"));

	}

	@Then("the user should be able to add patient pharmacy")
	public void verifyUserCanAddPatientPharmacy() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Pharmacy']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Pharmacy']"));
		sleep(1000);
		waitAndSendKeys(By.xpath("//input[@id='Filter_BusinessName']"), "Attorney");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//input[@id='0f825af7-1a63-461a-a93d-7167461ea3ae']"));
		clickWhenClickable(By.xpath("//button[@id='btnPartner']"));

	}

	@And("I create a profile with Add, Edit, and Delete access to Patient Module Patient Pharmacy")
	public void createProfileWithAddEditAndDeleteAccessForPatientPharmacy() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add and Edit access to Patient Module Patient Pharmacy")
	public void createProfileWithAddAndEditAccessForPatientPharmacy() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg18PatientPharmacyDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Patient Module Patient Pharmacy")
	public void createProfileWithAddAccessOnlyForPatientPharmacy() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg18PatientPharmacyEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg18PatientPharmacyDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to send patient intake forms for signature")
	public void verifyUserCanSendPatientIntakeFormsForSignature() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Patient Intake Forms']"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Send Mail')]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Send Text')]"));

	}

	@And("the user should not be able to edit, print, or send for signature for Patient Claim Verification")
	public void userShouldNotBeAbleToEditPrintOrSendForSignatureForPatientClaimVerification() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Patient Claim Verification']"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Print')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Send Mail')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Send Text')]"));

	}

	@And("the user should not be able to send for signature for Patient Claim Verification")
	public void userShouldNotBeAbleToSendForSignatureForPatientClaimVerification() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Patient Claim Verification']"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Send Mail')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Send Text')]"));

	}

	@And("I create a profile with Add, Edit, Print, and Send For Signature access to Patient Module Patient Claim Verification")
	public void createProfileWithAddEditPrintAndSendForSignatureAccessForPatientClaimVerification() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to print patient claim verifications")
	public void userShouldBeAbleToPrintPatientClaimVerifications() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Patient Claim Verification']"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Print')]"));
		sleep(3000);
		((JavascriptExecutor) DriverFactory.getDriver()).executeScript("window.print();");
		System.out.println("Patient signature PDF auto-saved in Downloads folder");
		sleep(2000);
		clickWhenClickable(
				By.xpath("//button[@onclick='CloseClaimVerificationSignature();']//i[@class='fa fa-times']"));

	}

	@And("I create a profile with Add, Edit, and Delete access to Patient Module Patient Medication")
	public void createProfileWithAddEditAndDeleteAccessForPatientMedication() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg18PatientMedicationAll']"));
		clickWhenClickable(By.xpath("//label[@for='chkg18PatientMedicationAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg18PatientMedicationEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg18PatientMedicationDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to view patient medication gross margin")
	public void verifyUserCanViewPatientMedicationGrossMargin() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Medication']"));
		sleep(2000);
		assertElementPresent(By.xpath("//label[@id='totalGM']"));

	}

	@And("the user should not be able to edit, delete, Patient Meds On Chart")
	public void verifyUserCannotEditDeleteOrCopyToMedication() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Meds On Chart']"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("I create a profile with Add, Edit, and Delete access to Patient Module Patient Meds On Chart")
	public void createProfileWithAddEditAndDeleteAccessForPatientMedsOnChart() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg20PatientMedsOnChartAll']"));
		clickWhenClickable(By.xpath("//label[@for='chkg20PatientMedsOnChartAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg20PatientMedsOnChartEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg20PatientMedsOnChartDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to add patient meds on chart")
	public void verifyUserCanAddPatientMedsOnChart() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Meds On Chart']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Medications On Chart']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@class='model-inp requiredfield']//img"));
		sleep(2000);
		waitAndSendKeys(By.xpath("//input[@id='Filter_DrugName']"), "amoxilin");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//input[@id='0']"));
		clickWhenClickable(By.xpath("//div[@id='divSearchDrugInfo']//button[@id='btnDrug']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-circle-check']"));

	}

	@And("I create a profile with Add, Edit, Delete, and Copied To Medication access to Patient Module Patient Meds On Chart")
	public void createProfileWithAddEditDeleteAndCopiedToMedicationAccessForPatientMedsOnChart() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to copy patient meds to medication")
	public void verifyUserCanCopyPatientMedsToMedication() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Meds On Chart']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//img[@class='v-align-txttop']"));

	}

	@Then("the user should be able to delete patient meds on chart")
	public void verifyUserCanDeletePatientMedsOnChart() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Meds On Chart']"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[10]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='deletepatientmedsonchart']"));

	}

	@And("the user should not be able to delete meds on chart")
	public void verifyUserCannotDeleteMedication() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Meds On Chart']"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@Then("the user should be able to edit patient meds on chart")
	public void verifyUserCanEditPatientMedsOnChart() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Meds On Chart']"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[10]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.xpath("//input[@id='PatientMedicationsOnChart_Direction_0']"), "morning");
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-circle-check']"));

	}

	@And("I create a profile with Add access only to Patient Module Patient Meds On Chart")
	public void createProfileWithAddAccessOnlyForPatientMedsOnChart() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg20PatientMedsOnChartAll']"));
		clickWhenClickable(By.xpath("//label[@for='chkg20PatientMedsOnChartAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to update patient medication gross margin")
	public void verifyUserCanUpdatePatientMedicationGrossMargin() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Medication']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[36]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.xpath("//input[@id='PatientMedication_GrossMargin']"), "10");
		clickWhenClickable(By.xpath("//button[@onclick='javascript: saveMedication();']"));

	}

	@Then("the user should be able to update patient medication sync")
	public void verifyUserCanUpdatePatientMedicationSync() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Medication']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='PatientMed_SyncDay']"));
		selectDropdownByIndexWhenReady(By.id("PatientMed_SyncDay"), 1);
		clickWhenClickable(By.xpath("//button[@id='btnSaveMedicationSyncDays']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[4]//label[1]//div[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//tbody/tr/td[36]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//tbody/tr/td[5]/label[1]/div[1]"));

	}

	@Then("the user should be able to edit patient medications")
	public void verifyUserCanEditPatientMedications() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Medication']"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//i[contains(@class,'fa-ellipsis-vertical')])[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.xpath("//input[@id='PatientMedication_RxStatus']"), "Active");
		clickWhenClickable(By.xpath("//button[@onclick='javascript: saveMedication();']"));

	}

	@And("I create a profile with Add, Edit, Delete, View Gross Margin, Update Sync, and Update Gross Margin access to Patient Module Patient Medication")
	public void createProfileWithAddEditDeleteViewGrossMarginUpdateSyncAndUpdateGrossMarginAccessForPatientMedication() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to delete patient medications")
	public void verifyUserCanDeletePatientMedications() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Medication']"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//i[contains(@class,'fa-ellipsis-vertical')])[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='deletepatientmedical']"));

	}

	@And("I create a profile with Add and Edit access to Patient Module Patient Meds On Chart")
	public void createProfileWithAddAndEditAccessForPatientMedsOnChart() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg20PatientMedsOnChartAll']"));
		clickWhenClickable(By.xpath("//label[@for='chkg20PatientMedsOnChartAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg20PatientMedsOnChartEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to add patient medication")
	public void addPatientMedication() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Medication']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Medication']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[@id='AddMedicationModal']//div[4]//div[1]//a[1]//img[1]"));
		sleep(1000);
		waitAndSendKeys(By.xpath("//input[@id='Filter_DrugName']"), "amoxilin");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//input[@id='0']"));
		clickWhenClickable(By.xpath("//div[@id='divSearchDrugInfo']//button[@id='btnDrug']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@onclick='javascript: saveMedication();']"));

	}

	@And("the user should not be able to delete Patient Medication")
	public void verifyUserCannotDeleteOrViewGrossMarginOrUpdateSyncOrGrossMargin() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Medication']"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//i[contains(@class,'fa-ellipsis-vertical')])[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("I create a profile with Add and Edit access to Patient Module Patient Medication")
	public void createProfileWithAddAndEditAccessForPatientMedication() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg18PatientMedicationAll']"));
		clickWhenClickable(By.xpath("//label[@for='chkg18PatientMedicationAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg18PatientMedicationEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("the user should not be able to edit, delete Patient Medication")
	public void verifyUserCannotEditDeleteOrUpdateGrossMarginOrSync() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Medication']"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//i[contains(@class,'fa-ellipsis-vertical')])[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("I create a profile with Add access only to Patient Module Patient Medication")
	public void createProfileWithAddAccessOnlyForPatientMedication() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg18PatientMedicationAll']"));
		clickWhenClickable(By.xpath("//label[@for='chkg18PatientMedicationAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to send patient claim verifications for signature")
	public void userShouldBeAbleToSendPatientClaimVerificationsForSignature() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Patient Claim Verification']"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Send Mail')]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Send Text')]"));

	}

	@And("I create a profile with Add, Edit, and Print access to Patient Module Patient Claim Verification")
	public void createProfileWithAddEditAndPrintAccessForPatientClaimVerification() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientClaimVerificationSendForSignature']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("the user should not be able to print or send for signature for Patient Claim Verification")
	public void userShouldNotBeAbleToPrintOrSendForSignatureForPatientClaimVerification() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Patient Claim Verification']"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Print')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Send Mail')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Send Text')]"));

	}

	@Then("the user should be able to edit patient claim verifications")
	public void userShouldBeAbleToEditPatientClaimVerifications() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Patient Claim Verification']"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.xpath("//input[@id='Patient_PatientClaimVerification_CellNumber']"), "1234567890");
		sleep(2000);
		clickWhenClickable(By.xpath("//img[@id='btnDeleteAdjuster']"));
		sleep(2000);
		waitAndSendKeys(By.xpath("//input[@id='Patient_PatientClaimVerification_Adjuster']"), profileName);
		waitAndSendKeys(By.xpath("//input[@id='Patient_PatientClaimVerification_AdjusterEmail']"), createdEmail);
		waitAndSendKeys(By.xpath("//input[@id='Patient_PatientClaimVerification_AdjusterPhoneNumber']"), "1234567890");
		waitAndSendKeys(By.xpath("//input[@id='Patient_PatientClaimVerification_AdjusterFax']"), "1234567890");
		clickWhenClickable(By.xpath("//img[@id='btnAddAdjuster']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("I create a profile with Add and Edit access to Patient Module Patient Claim Verification")
	public void createProfileWithAddAndEditAccessForPatientClaimVerification() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientClaimVerificationPrint']"));
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientClaimVerificationSendForSignature']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to add a patient claim verification")
	public void userShouldBeAbleToAddPatientClaimVerification() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//*[name()='path' and @id='Union_79']"));
		sleep(3000);
		waitAndSendKeys(By.xpath("//input[@id='Patient_PatientClaimVerification_Adjuster']"), profileName);
		waitAndSendKeys(By.xpath("//input[@id='Patient_PatientClaimVerification_AdjusterEmail']"), createdEmail);
		waitAndSendKeys(By.xpath("//input[@id='Patient_PatientClaimVerification_AdjusterPhoneNumber']"), "1234567890");
		waitAndSendKeys(By.xpath("//input[@id='Patient_PatientClaimVerification_AdjusterFax']"), "1234567890");
		clickWhenClickable(By.xpath("//img[@id='btnAddAdjuster']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@id='addPayorNamePopup']//img"));
		sleep(2000);
		clickWhenClickable(By.xpath("//input[@id='rdoFullSearch']"));
		sleep(1000);
		waitAndSendKeys(By.xpath("//input[@id='Filter_BusinessName']"), "Charlotte Baird");
		clickWhenClickable(By.xpath("//button[@id='btnpayorserach']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//input[@id='84996e1c-2e81-4b80-81cf-7d1f1b095d1e']"));
		clickWhenClickable(By.xpath("//button[@id='btnPayor']"));
		sleep(1000);
		waitAndSendKeys(By.xpath("//input[@id='Patient_PatientClaimVerification_ClaimNumber']"), "1234567890");
		clickWhenClickable(By.xpath("//a[@id='addPayorAddressPopup']//img"));
		sleep(2000);
		clickWhenClickable(By.xpath("//input[@id='9b8ba6bd-e587-487e-8788-8bde0c276d5b']"));
		clickWhenClickable(By.xpath("//div[@class='modal-footer text-center d-block']//button[@id='btnPayorAddress']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("I create a profile with Add access only to Patient Module Patient Claim Verification")
	public void createProfileWithAddAccessOnlyForPatientClaimVerification() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientClaimVerificationEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientClaimVerificationPrint']"));
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientClaimVerificationSendForSignature']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to edit patient intake forms")
	public void verifyUserCanEditPatientIntakeForms() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Patient Intake Forms']"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.xpath("//input[@id='Patient_PatientIntakeForm_CellNumber']"), "1234567890");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to print or send for signature")
	public void verifyUserCannotPrintOrSendPatientIntakeForms() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Patient Intake Forms']"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Print')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Send Mail')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Send Text')]"));
	}

	@Then("the user should be able to print patient intake forms")
	public void verifyUserCanPrintPatientIntakeForms() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Patient Intake Forms']"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Print')]"));
		sleep(3000);
		((JavascriptExecutor) DriverFactory.getDriver()).executeScript("window.print();");
		System.out.println("Patient signature PDF auto-saved in Downloads folder");
	}

	@And("I create a profile without Update access to Partners Module DeDupe")
	public void createProfileWithoutUpdateAccessToPartnersModuleDeDupe() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg11PatientDeDupe']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Patient Module Tag")
	public void createProfileWithViewAccessOnlyToPatientModuleTag() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg10PatientTagAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg10PatientTagEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg10PatientTagDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Update access to Partners Module DeDupe")
	public void createProfileWithUpdateAccessToPartnersModuleDeDupe() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with all additional access permissions disabled in Patient Module")
	public void createProfileWithAllAdditionalAccessPermissionsDisabledInPatientModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[@for='chkg9PatientAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg9PatientView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg9PatientAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg9PatientEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg9PatientDelete']"));
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with all additional access permissions enabled in Patient Module")
	public void createProfileWithAllAdditionalAccessPermissionsEnabledInPatientModule() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with full access to Patient Module Patient")
	public void createProfileWithFullAccessToPatientModulePatient() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("the user should not be able to view Patient Module General Audit View")
	public void userShouldNotBeAbleToViewPatientModuleGeneralAuditViewSettings() {
		String[] auditViewUrls = { baseUrl + "/Patient/Home/Tags", baseUrl + "/Patient/Home/ReviewCategories",
				baseUrl + "/Patient/Home/ReferralSources", baseUrl + "/Patient/Home/Enrollments" };
		By updatedBy = By.xpath("//th[normalize-space()='Updated By']");
		By updatedDate = By.xpath("//th[normalize-space()='Updated Date']");
		for (String url : auditViewUrls) {
			driver.get(url);
			sleep(2000);
			boolean isUpdatedByPresent = !driver.findElements(updatedBy).isEmpty();
			boolean isUpdatedDatePresent = !driver.findElements(updatedDate).isEmpty();
			if (isUpdatedByPresent || isUpdatedDatePresent) {
				throw new AssertionError("User should NOT see Audit View columns on: " + url);
			}

		}
	}

	@And("I create a profile with View access only to Patient Module Patient")
	public void createProfileWithViewAccessOnlyToPatientModulePatient() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg9PatientAdd");
		uncheckPermissionIfChecked("chkg9PatientEdit");
		uncheckPermissionIfChecked("chkg9PatientDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Patient Module Patient")
	public void createProfileWithViewAndAddAccessToPatientModulePatient() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg9PatientEdit");
		uncheckPermissionIfChecked("chkg9PatientDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("the user should not be able to add, edit, or delete patients")
	public void userShouldNotBeAbleToAddEditOrDeletePatients() {
		sleep(5000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Patient']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
	}

	@And("I create a profile with View, Add, and Edit access to Patient Module Patient")
	public void createProfileWithViewAddAndEditAccessToPatientModulePatient() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg9PatientDelete");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with No access to Patient Module General Audit View")
	public void createProfileWithNoAccessToPatientModuleGeneralAuditView() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		uncheckPermissionIfChecked("chkg37PatientAuditView");
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Patient Module General Audit View")
	public void createProfileWithViewAccessOnlyToPatientModuleGeneralAuditView() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = DrugSteps.createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I assign the profile and workspace to the user for Patient Module")
	public void assignProfileAndWorkspaceToUserForPatientModule() {
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

	@And("I create a profile with View access only to Setup Module Bucket")
	public void createProfileWithViewAccessToSetupBucket() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientBucketAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientBucketView']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to add a patient health card")
	public void verifyUserCanAddPatientHealthCard() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Rx Health Card']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Rx Health Card']"));
		sleep(1000);
		waitAndSendKeys(By.xpath("//input[@id='Tag_Name']"), "1");
		clickWhenClickable(By.xpath("///button[@id='btnSaveHealthCard']"));

	}

	@And("the user should not be able to edit or delete patient health cards")
	public void verifyUserCannotEditOrDeletePatientHealthCards() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("I create a profile with Add access only to Patient Module Patient Intake Form")
	public void createProfileWithAddAccessToPatientIntakeForm() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg13PatientIntakeFormEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg13PatientIntakeFormPrint']"));
		clickWhenClickable(By.xpath("//label[@for='chkg13PatientIntakeFormSendForSignature']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to add a patient intake form")
	public void verifyUserCanAddPatientIntakeForm() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//a[@id='btnIntakeForm']//*[name()='svg']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("I create a profile with Add and Edit access to Patient Module Patient Intake Form")
	public void createProfileWithAddAndEditAccessToPatientIntakeForm() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg13PatientIntakeFormPrint']"));
		clickWhenClickable(By.xpath("//label[@for='chkg13PatientIntakeFormSendForSignature']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add, Edit, and Print access to Patient Module Patient Intake Form")
	public void createProfileWithAddEditAndPrintAccessToPatientIntakeForm() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg13PatientIntakeFormSendForSignature']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("the user should not be able to send for signature")
	public void verifyUserCannotSendPatientIntakeFormsForSignature() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Patient Intake Forms']"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Send Mail')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Send Text')]"));

	}

	@And("the user should not be able to edit, print, or send for signature")
	public void verifyUserCannotEditPrintOrSendPatientIntakeForms() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Patient Intake Forms']"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Print')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Send Mail')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Send Text')]"));

	}

	@Then("the user should be able to delete patient health cards")
	public void verifyUserCanDeletePatientHealthCards() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='deletepatientHealthCard']"));

	}

	@And("I create a profile with View and Add Folder access to Setup Module Bucket")
	public void createProfileWithViewAndAddFolderAccessToSetupBucket() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientBucketAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientBucketView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientBucketFolderAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("the user should not be able to edit, delete folder")
	public void theUserShouldNotBeAbleToEditOrDeleteFolder() {
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//div[@class='documentLibraryActionRight']//a[@class='tooltiped txt-decor-none user-access']//img"));
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteFolder']//img"));

	}

	@And("the user should not be able to delete enrollments")
	public void verifyUserCannotDeleteEnrollments() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
	}

	@And("I create a profile with View, Add, Edit, and Delete access to Setup Module Enrollment")
	public void createProfileWithViewAddEditAndDeleteAccessToSetupEnrollment() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("the user should be able to delete a review category")
	public void verifyUserCanDeleteReviewCategory() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[6]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));
	}

	@And("I create a profile with View, Add, and Edit access to Setup Module Referral Source")
	public void createProfileWithViewAddAndEditAccessToSetupReferralSource() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg10PatientReferralSourceDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("the user should not be able to add, edit, or delete enrollments")
	public void verifyUserCannotAddEditOrDeleteEnrollments() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Enrollment']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@Then("the user should be able to view enrollments")
	public void verifyUserCanViewEnrollments() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Enrollments");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Enrollments"));
		sleep(2000);

	}

	@And("I create a profile with View access only to Setup Module Enrollment")
	public void createProfileWithViewAccessToSetupEnrollment() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg10PatientEnrollmentAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg10PatientEnrollmentEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg11PatientEnrollmentDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to edit an existing enrollment")
	public void verifyUserCanEditExistingEnrollment() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.xpath("//input[@id='Enrollment_Name']"), profileName);
		waitAndSendKeys(By.xpath("//input[@id='Enrollment_Description']"), profileName);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@Then("the user should be able to add a new enrollment")
	public void verifyUserCanAddNewEnrollment() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Enrollment']"));
		sleep(1000);
		waitAndSendKeys(By.xpath("//input[@id='Enrollment_Name']"), profileName);
		waitAndSendKeys(By.xpath("//input[@id='Enrollment_Description']"), profileName);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@Then("the user should be able to delete an enrollment")
	public void verifyUserCanDeleteEnrollment() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@And("I create a profile with View, Add, Edit, and Delete access to Setup Module Referral Source")
	public void createProfileWithViewAddEditAndDeleteAccessToSetupReferralSource() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("the user should not be able to add, edit, or delete referral sources")
	public void verifyUserCannotAddEditOrDeleteReferralSources() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Referral Source']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to make an outgoing call")
	public void verifyUserCannotMakeOutgoingCall() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@id='page-wrapper']//div[4]//div[2]//button[1]//*[name()='svg']"));

	}

	@And("the user should not be able to map a tag")
	public void verifyUserCannotMapTag() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[@class='col-md-4']//input[@type='text']"));

	}

	@And("the user should not be able to send a patient for review")
	public void verifyUserCannotSendPatientForReview() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//*[name()='path' and contains(@d,'M9.0949 14')]"));

	}

	@And("the user should not be able to send a patient for signature")
	public void verifyUserCannotSendPatientForSignature() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[@id='btnpatientSignature']//*[name()='svg']"));

	}

	@And("the user should not be able to print a patient signature")
	public void verifyUserCannotPrintPatientSignature() throws Exception {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Patient Signatures']"));
		sleep(3000);
		assertElementNotPresent(By.xpath("(//tbody/tr/td[@scope='row']//a)[6]"));

	}

	@And("the user should not be able to add an RPM device")
	public void verifyUserCannotAddRPMDevice() {
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//div[@class='model-inp dropdownCaretAdd mb-0']//div[@class='usersearch plus-usersearch']//*[name()='svg']"));

	}

	@And("the user should not be able to delete a mapped tag")
	public void verifyUserCannotDeleteMappedTag() {
		sleep(3000);
		assertElementNotPresent(
				By.xpath("(//ul[@class='dropdownSelectedLabelMain']//li//a[@id='btnAddPatientTag'])[1]"));

	}

	@And("the user should not be able to view patient prescriptions")
	public void verifyUserCannotViewPatientPrescriptions() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//*[name()='path' and @id='Path_2472']"));

	}

	@And("the user should not be able to add a referral source")
	public void verifyUserCannotAddReferralSource() {
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@id='btnPatientReferralSource']//*[name()='svg']//*[name()='path' and contains(@d,'M256 80c0-')]"));

	}

	@And("the user should not be able to delete a referral source")
	public void verifyUserCannotDeleteReferralSource() {
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//a[@id='btnAddPatientReferralSource']//*[name()='svg']//*[name()='g' and @id='Group_466']//*[name()='circle' and @id='Ellipse_42']"));

	}

	@And("the user should not be able to add a patient enrollment")
	public void verifyUserCannotAddPatientEnrollment() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//div[@id='btnPatientEnrollmentApp']//*[name()='svg']//*[name()='path' and contains(@d,'M256 80c0-')]"));

	}

	@And("the user should not be able to delete a patient enrollment")
	public void verifyUserCannotDeletePatientEnrollment() {
		sleep(3000);
		assertElementNotPresent(
				By.xpath("(//ul[@class='dropdownSelectedLabelMain']/li//a[@id='btnAddPatientEnrollment'])[1]"));

	}

	@And("the user should not be able to set delivery preference")
	public void verifyUserCannotSetDeliveryPreference() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//button[@id='btnAddDeliveryPreference']"));

	}

	@And("the user should not be able to update patient status")
	public void verifyUserCannotUpdatePatientStatus() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[@class='patientStatusBtn']//*[name()='svg']"));
	}

	@And("the user should not be able to export patient data to excel")
	public void verifyUserCannotExportPatientDataToExcel() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export Excel']"));
	}

	@Then("the user should not be able to add, edit, delete, or download any folders or files")
	public void verifyUserCannotAddEditDeleteOrDownloadFoldersAndFiles() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[@title='New Folder']//*[name()='svg']"));
		assertElementNotPresent(By.xpath(
				"//div[@class='documentLibraryActionRight']//a[@class='tooltiped txt-decor-none user-access']//img"));
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteFolder']//img"));

	}

	@Then("the user should be able to add patient family")
	public void userShouldBeAbleToAddPatientFamily() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Family Details']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Family']"));
		sleep(3000);
		waitAndSendKeys(By.xpath("//input[@id='PatientFamily_LastName']"), "Hinton");
		waitAndSendKeys(By.xpath("//input[@id='PatientFamily_FirstName']"), "Howard");
		WebElement birthDateInput = driver.findElement(By.id("Patient_BirthDate"));
		birthDateInput.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement yearDropdown = driver.findElement(By.xpath("//select[contains(@class,'ui-datepicker-year')]"));
		Select yearSelect = new Select(yearDropdown);
		yearSelect.selectByVisibleText("2025");
		WebElement monthDropdown = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[contains(@class,'ui-datepicker-month')]")));
		Select monthSelect = new Select(monthDropdown);
		monthSelect.selectByVisibleText("Apr");
		WebElement dateToSelect = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[normalize-space()='1']")));
		dateToSelect.click();
		clickWhenClickable(By.xpath("//button[@id='btnFindPatient']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//input[@id='c87acbbb-8d62-4aee-bc00-cff67e2700a2']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@class='btn btn-primary'][normalize-space()='Submit']"));

	}

	@Then("the user should not be able to delete patient family")
	public void userShouldNotBeAbleToDeletePatientFamily() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Family Details']"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteFamilyConfirm']//img"));

	}

	@Then("the user should not be able to Send VCard")
	public void userShouldNotBeAbleToSendVCard() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Send VCard']"));

	}

	@Then("the user should be able to add caregiver name")
	public void userShouldBeAbleToAddCareGiverName() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@id='btnEditPatient']//*[name()='svg']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add New Caregiver']"));
		sleep(2000);
		waitAndSendKeys(By.xpath("//input[@id='PatientCareGiverName_LastName']"), "Batson");
		waitAndSendKeys(By.xpath("//input[@id='PatientCareGiverName_FirstName']"), "Kelli");
		waitAndSendKeys(By.xpath("//input[@id='PatientCareGiverName_PhoneNumber']"), "5014324826");
		waitAndSendKeys(By.xpath("//input[@id='PatientCareGiverName_RelationOFCaregivertoPatient']"), "Mother");
		clickWhenClickable(By.xpath("//button[@id='btnSaveCareGiverNamePopup']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@Then("the user should be able to edit caregiver name")
	public void userShouldBeAbleToEditCaregiverName() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@id='btnEditPatient']//*[name()='svg']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Edit']"));
		sleep(2000);
		waitAndSendKeys(By.xpath("//input[@id='PatientCareGiverName_LastName']"), "Batson");
		waitAndSendKeys(By.xpath("//input[@id='PatientCareGiverName_FirstName']"), "Kelli");
		clickWhenClickable(By.xpath("//button[@id='btnSaveCareGiverNamePopup']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@Then("the user should not be able to Add To Patient or Send VCard")
	public void userShouldNotBeAbleToAddToPatientOrSendVCard() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Send VCard']"));

	}

	@Then("the user should be able to delete caregiver name")
	public void userShouldBeAbleToDeleteCaregiverName() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@id='btnEditPatient']//*[name()='svg']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Delete']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='deletePatientCareGiverName']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("I create a profile with View, Quick Text, and Reply access to Text")
	public void createProfileWithViewQuickTextAndReplyAccessToText() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg20TextAddToPatient']"));
		clickWhenClickable(By.xpath("//label[@for='chkg34TextSendVCard']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Feedback Form")
	public void createProfileWithViewAccessOnlyToFeedbackForm() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg36PatientFeedbackFormAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg36PatientFeedbackFormDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to add feedback form")
	public void userShouldBeAbleToAddFeedbackForm() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Feedback Form']"));
		sleep(1000);
		selectDropdownByIndexWhenReady(By.id("FeedbackForm_Id"), 3);
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Text']"));
		clickWhenClickable(By.xpath("//label[normalize-space()='Email']"));
		clickWhenClickable(By.xpath("//button[@id='btnFeedbackFollowUpQueueStatus']"));

	}

	@Then("the system should prevent the user from deleting the feedback form")
	public void checkUserCannotDeleteFeedbackForm() {
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//a[@id='btnDeletePatientFeedbackForm']//span[contains(text(),'Delete')]"));

	}

	@And("I create a profile with View and Add access to Feedback Form")
	public void createProfileWithViewAndAddAccessToFeedbackForm() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg36PatientFeedbackFormDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should not be able to add or delete feedback form")
	public void userShouldNotBeAbleToAddOrDeleteFeedbackForm() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Feedback Form']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//tbody/tr/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//a[@id='btnDeletePatientFeedbackForm']//span[contains(text(),'Delete')]"));

	}

	@Then("the user should be able to view feedback form")
	public void userShouldBeAbleToViewFeedbackForm() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementPresent(By.xpath("//span[normalize-space()='View']"));
		clickWhenClickable(By.xpath("//span[normalize-space()='View']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@onclick='return CloseFeedbackFormPopup()']//i[@class='fa fa-times']"));

	}

	@And("I create a profile with Add, Edit, and Delete access to Medical Health Card")
	public void createProfileWithAddEditAndDeleteAccessToMedicalHealthCard() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Medical Health Card")
	public void createProfileWithAddAccessOnlyToMedicalHealthCard() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg24MedicalHealthCardEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg24MedicalHealthCardDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should not be able to edit or delete medical health card")
	public void userShouldNotBeAbleToEditOrDeleteMedicalHealthCard() {
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Medical Health Card']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[8]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(
				By.xpath("//a[@id='btnDeleteMedicalHealthCardConfirm']//span[contains(text(),'Delete')]"));

	}

	@Then("the user should not be able to delete medical health card")
	public void userShouldNotBeAbleToDeleteMedicalHealthCard() {
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Medical Health Card']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[8]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(
				By.xpath("//a[@id='btnDeleteMedicalHealthCardConfirm']//span[contains(text(),'Delete')]"));

	}

	@And("I create a profile with Add and Edit access to Medical Health Card")
	public void createProfileWithAddAndEditAccessToMedicalHealthCard() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg24MedicalHealthCardDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to delete medical health card")
	public void userShouldBeAbleToDeleteMedicalHealthCard() {
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Medical Health Card']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[8]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@id='btnDeleteMedicalHealthCardConfirm']//span[contains(text(),'Delete')]"));
		clickWhenClickable(By.xpath("//button[@id='deletepatientMedicalHealthCard']"));

	}

	@Then("the user should be able to edit medical health card")
	public void userShouldBeAbleToEditMedicalHealthCard() {
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Medical Health Card']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[8]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		clickWhenClickable(By.xpath("//div[@class='row']//div[@class='col-12 col-md-4 mt-4']//label[@id='chk2text']"));
		clickWhenClickable(By.xpath("//button[@id='btnSaveMedicalHealthCard']"));

	}

	@Then("the user should be able to add medical health card")
	public void userShouldBeAbleToAddMedicalHealthCard() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Medical Health Card']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Medical Health Card']"));
		sleep(2000);
		waitAndSendKeys(By.xpath("//input[@id='PatientMedicalHealthCard_HealthPlanName']"), "UnitedHealthcare");
		waitAndSendKeys(By.xpath("//input[@id='PatientMedicalHealthCard_PlanNumber']"), "UH987654321");
		waitAndSendKeys(By.xpath("//input[@id='PatientMedicalHealthCard_PlanCardHolder']"), "Jane Smith");
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSaveMedicalHealthCard']"));

	}

	@And("I create a profile with Add, Edit, and Delete access to CareGiver Name")
	public void createProfileWithAddEditAndDeleteAccessToCareGiverName() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should not be able to delete caregiver name")
	public void userShouldNotBeAbleToDeleteCaregiverName() {
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@id='btnEditPatient']//*[name()='svg']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));

	}

	@Then("the user should not be able to edit or delete caregiver name")
	public void userShouldNotBeAbleToEditOrDeleteCaregiverName() {
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@id='btnEditPatient']//*[name()='svg']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Edit']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));

	}

	@And("I create a profile with Add and Edit access to CareGiver Name")
	public void createProfileWithAddAndEditAccessToCareGiverName() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg21PatientCareGiverNameDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to edit patient vitals")
	public void userShouldBeAbleToEditPatientVitals() {
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Vitals']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@class='gridRecordIconside']//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@title='Edit']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.xpath("//input[@id='PatientVital_Temprature']"), "110");
		clickWhenClickable(By.xpath("//button[@id='btnSaveVital']"));

	}

	@Then("the user should not be able to delete patient vitals")
	public void userShouldNotBeAbleToDeletePatientVitals() {
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Vitals']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@class='gridRecordIconside']//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteVital']//span[contains(text(),'Delete')]"));

	}

	@And("I create a profile with Add and Edit access to Patient Vitals")
	public void createProfileWithAddAndEditAccessToPatientVitals() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg46PatientVitalsDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to delete feedback form")
	public void checkUserCanDeleteFeedbackForm() {
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@id='btnDeletePatientFeedbackForm']//span[contains(text(),'Delete')]"));
		clickWhenClickable(By.xpath("//button[@id='deletepatientFeedbackForm']"));

	}

	@Then("the user should not be able to edit or delete patient vitals")
	public void verifyUserCannotEditOrDeletePatientVitals() {
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Vitals']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@class='gridRecordIconside']//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//a[@title='Edit']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteVital']//span[contains(text(),'Delete')]"));

	}

	@Then("the user should be able to add patient vitals")
	public void userCanAddPatientVitals() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Vitals']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Vitals']"));
		sleep(2000);
		waitAndSendKeys(By.xpath("//input[@id='PatientVital_BP']"), "110");
		clickWhenClickable(By.xpath("//button[@id='btnSaveVital']"));

	}

	@And("I create a profile with Add access only to Patient Vitals")
	public void createProfileWithAddAccessOnlyToPatientVitals() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg46PatientVitalsEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg46PatientVitalsDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, and Delete access to Feedback Form")
	public void createProfileWithViewAddAndDeleteAccessToFeedbackForm() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to delete a color code")
	public void userShouldBeAbleToDeleteColorCodeInPatientMedicationColorCodeSetting() {
		sleep(2000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Delete']"));
		clickWhenClickable(By.xpath("//button[@id='deleteMedicationColorCode']"));

	}

	@Then("the user should be able to view and manage Consent Settings")
	public void verifyUserCanViewAndManageConsentSettings() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/PatientSetting");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PatientSetting"));

	}

	@Then("the user should be able to view and manage Intake Form Settings")
	public void verifyUserCanViewAndManageIntakeFormSettings() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/IntakeFormNoticeSetting");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/IntakeFormNoticeSetting"));

	}

	@And("I create a profile with View and Call Record access to Outgoing Call")
	public void createUserWithOutgoingCallViewAndRecordAccess() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to access call records")
	public void verifyUserCanAccessCallRecords() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/CallActivities");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/CallActivities"));
		assertElementPresent(By.xpath("//div[@title='Recording URL']"));

	}

	@And("I create a profile with Intake Form Settings access")
	public void createUserWithIntakeFormSettingsAccess() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile without Intake Form Settings access")
	public void createUserWithoutIntakeFormSettingsAccess() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg10PatientIntakeFormSetting']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I log in using the new user for Patient Module")
	public void loginUsingNewUserForPatientModule() {
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

	@Then("the user should be able to delete patient vitals")
	public void userShouldBeAbleToDeletePatientVitals() {
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Vitals']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@class='gridRecordIconside']//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@id='btnDeleteVital']//span[contains(text(),'Delete')]"));
		clickWhenClickable(By.xpath("//button[@id='btnDeleteVitalConfirm']"));

	}

	@Then("the user should be able to add patient appointment")
	public void userShouldBeAbleToAddPatientAppointment() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		sleep(2000);
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Upcoming Appointment']")));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Upcoming Appointment']"));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='New Appointment']")));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Appointment']"));
		sleep(2000);
		WebElement appointmentDateInput = driver.findElement(By.id("PatientAppointment_AppointmentDate"));
		appointmentDateInput.click();
		sleep(1000);
		LocalDate today = LocalDate.now();
		int day = today.getDayOfMonth();
		int year = today.getYear();
		sleep(1000);
		String month = today.getMonth().name().substring(0, 1).toUpperCase()
				+ today.getMonth().name().substring(1, 3).toLowerCase();

		WebDriverWait waitDate = new WebDriverWait(driver, Duration.ofSeconds(10));
		sleep(1000);
		WebElement yearDropdown = waitDate.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[contains(@class,'ui-datepicker-year')]")));
		Select yearSelect = new Select(yearDropdown);
		yearSelect.selectByVisibleText(String.valueOf(year));
		sleep(1000);
		WebElement monthDropdown = waitDate.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[contains(@class,'ui-datepicker-month')]")));
		Select monthSelect = new Select(monthDropdown);
		monthSelect.selectByVisibleText(month);
		sleep(1000);
		WebElement dateToSelect = waitDate.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()='" + day + "']")));
		dateToSelect.click();
		sleep(1000);
		WebElement startTimeInput = driver.findElement(By.xpath("//input[@id='startTime']"));
		startTimeInput.click();
		sleep(1000);
		WebElement startHour = waitDate.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//td[@class='ui-timepicker-hour-cell' and @data-timepicker-instance-id='#startTime' and @data-hour='10']")));
		startHour.click();
		sleep(1000);
		WebElement startMinute = waitDate.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//td[@class='ui-timepicker-minute-cell' and @data-timepicker-instance-id='#startTime' and @data-minute='30']")));
		startMinute.click();
		sleep(1000);
		WebElement endTimeInput = driver.findElement(By.xpath("//input[@id='endTime']"));
		endTimeInput.click();
		sleep(1000);
		WebElement endHour = waitDate.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//td[@class='ui-timepicker-hour-cell' and @data-timepicker-instance-id='#endTime' and @data-hour='23']")));
		endHour.click();
		sleep(1000);
		WebElement endMinute = waitDate.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//td[@class='ui-timepicker-minute-cell' and @data-timepicker-instance-id='#endTime' and @data-minute='30']")));
		endMinute.click();
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSaveAppointment']"));
	}

	@Then("the user should not be able to edit or delete patient appointment")
	public void verifyUserCannotEditOrDeletePatientAppointment() {
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Upcoming Appointment']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[8]/div[1]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteAppointment']//span[contains(text(),'Delete')]"));

	}

	@Then("the user should be able to delete patient appointment")
	public void userShouldBeAbleToDeletePatientAppointment() {
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Upcoming Appointment']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[8]/div[1]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@id='btnDeleteAppointment']//span[contains(text(),'Delete')]"));
		clickWhenClickable(By.xpath("//button[@id='btnDeleteAppointmentConfirm']"));

	}

	@Then("the user should not be able to edit or delete color codes")
	public void userShouldNotBeAbleToEditOrDeleteColorCodesInPatientMedicationColorCodeSetting() {
		sleep(2000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Edit']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));

	}

	@Then("the user should be able to edit a color code")
	public void userShouldBeAbleToEditColorCodeInPatientMedicationColorCodeSetting() {
		sleep(2000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Edit']"));
		selectDropdownByIndexWhenReady(By.id("PatientMedicationColorCodeSetting_MedicationColorCodeType"), 2);
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnSaveMedicationColorCode']"));

	}

	@Then("the user should not be able to delete color codes")
	public void userShouldNotBeAbleToDeleteColorCodesInPatientMedicationColorCodeSetting() {
		sleep(2000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));

	}

	@Then("the user should be able to add a color code")
	public void userShouldBeAbleToAddColorCodeInPatientMedicationColorCodeSetting() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/PatientMedicationColorCodeSettings");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PatientMedicationColorCodeSettings"));
		clickWhenClickable(By.xpath("//button[@id='btnSaveAppointment']"));
		sleep(2000);
		selectDropdownByIndexWhenReady(By.id("PatientMedicationColorCodeSetting_MedicationColorCodeType"), 1);
		sleep(2000);
		selectDropdownByIndexWhenReady(By.id("PatientMedicationColorCodeSetting_ColumnName"), 1);
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnSaveMedicationColorCode']"));
	}

	@Then("the user should be able to view color codes")
	public void userShouldBeAbleToViewColorCodesInPatientMedicationColorCodeSetting() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/PatientMedicationColorCodeSettings");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PatientMedicationColorCodeSettings"));

	}

	@And("I create a profile without Consent Settings access")
	public void createUserWithoutConsentSettingsAccess() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg10PatientConsentSetting']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should not have access to Intake Form Settings via UI or direct URL")
	public void verifyUserCannotAccessIntakeFormSettings() {
		driver.get(baseUrl + "/Setup/Home/IntakeFormNoticeSetting");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	@And("I create a profile with View access only to Outgoing Call")
	public void createUserWithOutgoingCallViewAccess() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg35OutgoingCallRecordingURL']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to view outgoing calls")
	public void verifyUserCanViewOutgoingCalls() {
		sleep(3000);
		driver.get(baseUrl + "/Setup/Home/OutgoingCalls");
		wait.until(ExpectedConditions.urlContains("/Setup/Home/OutgoingCalls"));

	}

	@Then("the user should not be able to access call records")
	public void verifyUserCannotAccessCallRecords() {
		sleep(2000);
		driver.get(baseUrl + "/Setup/Home/CallActivities");
		sleep(2000);
		assertElementNotPresent(By.xpath("//div[@title='Recording URL']"));
	}

	@Then("the user should not have access to Consent Settings via UI or direct URL")
	public void verifyUserCannotAccessConsentSettings() {
		driver.get(baseUrl + "/Setup/Home/PatientSetting");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	@Then("the user should not be able to add, edit, or delete color codes")
	public void userShouldNotBeAbleToAddEditOrDeleteColorCodesInPatientMedicationColorCodeSetting() {
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Patient Medication ColorCode Setting']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Edit']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));

	}

	@And("I create a profile with Consent Settings access")
	public void createUserWithConsentSettingsAccess() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, Edit, and Delete access to Patient Medication ColorCode Setting")
	public void verifyPatientMedicationColorCodeSettingViewAddEditDeleteAccess() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, and Edit access to Patient Medication ColorCode Setting")
	public void verifyPatientMedicationColorCodeSettingViewAddEditAccess() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg43PatientMedicationColorCodeSettingDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Patient Medication ColorCode Setting")
	public void verifyPatientMedicationColorCodeSettingViewAndAddAccess() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg43PatientMedicationColorCodeSettingEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg43PatientMedicationColorCodeSettingDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Patient Medication ColorCode Setting")
	public void verifyPatientMedicationColorCodeSettingViewOnlyAccess() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg43PatientMedicationColorCodeSettingAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg43PatientMedicationColorCodeSettingEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg43PatientMedicationColorCodeSettingDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should not be able to delete patient appointment")
	public void userShouldNotBeAbleToDeletePatientAppointment() {
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Upcoming Appointment']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[8]/div[1]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteAppointment']//span[contains(text(),'Delete')]"));

	}

	@Then("the user should be able to edit patient appointment")
	public void userShouldBeAbleToEditPatientAppointment() {
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Upcoming Appointment']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[8]/div[1]/div[1]/div[1]/button[1]/i[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.xpath("//textarea[@id='PatientAppointment_Notes']"), "Note");
		clickWhenClickable(By.xpath("//button[@id='btnSaveAppointment']"));

	}

	@And("I create a profile with Add, Edit, and Delete access to Patient Appointment")
	public void createProfileWithAddEditAndDeleteAccessToPatientAppointment() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add and Edit access to Patient Appointment")
	public void createProfileWithAddAndEditAccessToPatientAppointment() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg46PatientAppointmentDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Patient Appointment")
	public void createProfileWithAddAccessOnlyToPatientAppointment() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg46PatientAppointmentEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg46PatientAppointmentDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add, Edit, and Delete access to Patient Vitals")
	public void createProfileWithAddEditAndDeleteAccessToPatientVitals() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Quick Text, Reply, and Add To Patient access to Text")
	public void createProfileWithViewQuickTextReplyAndAddToPatientAccessToText() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg34TextSendVCard']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to Reply")
	public void userShouldBeAbleToReply() {
		sleep(3000);
		assertElementPresent(By.xpath("//span[normalize-space()='Quick Text']"));

	}

	@Then("the user should be able to Add To Patient")
	public void userShouldBeAbleToAddToPatient() {
		sleep(3000);
		assertElementPresent(By.xpath("//span[normalize-space()='Quick Text']"));

	}

	@Then("the user should be able to Send VCard")
	public void userShouldBeAbleToSendVCard() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Send VCard']"));
		sleep(1000);
		waitAndSendKeys(By.xpath("//input[@id='vCardPhoneNumber']"), "1234567890");
		waitAndSendKeys(By.xpath("//textarea[@id='vcardBody']"), "text message");
		clickWhenClickable(By.xpath("//button[@id='btnSendVCard']"));

	}

	@Then("the user should not be able to use Quick Text, Reply, or Send VCard")
	public void userShouldNotBeAbleToUseQuickTextReplyOrSendVCard() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@id='btnTextViewPatient']//*[name()='svg']"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Quick Text']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Send VCard']"));

	}

	@Then("the user should be able to view patient text")
	public void userShouldBeAbleToViewPatientText() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(2000);
		assertElementPresent(By.xpath("//a[@id='btnTextViewPatient']//*[name()='svg']"));

	}

	@Then("the user should not be able to Reply, Add To Patient, or Send VCard")
	public void userShouldNotBeAbleToReplyAddToPatientOrSendVCard() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Send VCard']"));

	}

	@And("I create a profile with View and Quick Text access to Text")
	public void createProfileWithViewAndQuickTextAccessToText() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg20TextReply']"));
		clickWhenClickable(By.xpath("//label[@for='chkg20TextAddToPatient']"));
		clickWhenClickable(By.xpath("//label[@for='chkg34TextSendVCard']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Quick Text, Reply, and Send VCard access to Patient Text")
	public void createProfileWithViewQuickTextReplyAndSendVCardAccessToPatientText() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Quick Text, and Reply access to Patient Text")
	public void createProfileWithViewQuickTextAndReplyAccessToPatientText() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg34PatientTextSendVCard']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should not be able to Reply or Send VCard")
	public void userShouldNotBeAbleToReplyOrSendVCard() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@id='btnTextViewPatient']//*[name()='svg']"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Send VCard']"));

	}

	@Then("the user should be able to use Quick Text")
	public void userShouldBeAbleToUseQuickText() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Quick Text']"));
		sleep(1000);
		waitAndSendKeys(By.xpath("//input[@id='newPhoneNumber']"), "1234567890");
		waitAndSendKeys(By.xpath("//textarea[@id='newBody']"), "text message");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("I create a profile with View and Quick Text access to Patient Text")
	public void createProfileWithViewAndQuickTextAccessToPatientText() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg20PatientTextReply']"));
		clickWhenClickable(By.xpath("//label[@for='chkg34PatientTextSendVCard']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Patient Text")
	public void createProfileWithViewAccessOnlyToPatientText() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg20PatientTextQuickText']"));
		clickWhenClickable(By.xpath("//label[@for='chkg20PatientTextReply']"));
		clickWhenClickable(By.xpath("//label[@for='chkg34PatientTextSendVCard']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should not be able to add generate new access code")
	public void userShouldNotBeAbleToAddGenerateNewAccessCode() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@class='active'][normalize-space()='Access Code']"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Generate Access Code']"));

	}

	@Then("the user should be able to add generate new access code")
	public void userShouldBeAbleToAddGenerateNewAccessCode() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@class='active'][normalize-space()='Access Code']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Generate Access Code']"));
		sleep(3000);

	}

	@Then("the user should be able to delete patient family")
	public void userShouldBeAbleToDeletePatientFamily() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Family Details']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@id='btnDeleteFamilyConfirm']//img"));

	}

	@And("I create a profile with Add and Edit access to Patient Module Patient External Source")
	public void createProfileWithAddAndEditAccessToPatientModulePatientExternalSource() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg12PatientEHRDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to edit patient communication")
	public void userShouldBeAbleToEditPatientCommunication() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Communication']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[11]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.xpath("//textarea[@id='PatientCommunication_Notes']"), "edit");
		clickWhenClickable(By.xpath("//button[@id='btnSaveCommunication']"));

	}

	@Then("the user should be able to delete patient communication")
	public void userShouldBeAbleToDeletePatientCommunication() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Communication']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[11]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//a[@id='btnDeleteCommunicationConfirm']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='deletepatientCommunication']"));

	}

	@And("I create a profile with Add, Edit, and Delete access to Patient Module Patient Communication")
	public void createProfileWithAddEditAndDeleteAccessForPatientCommunication() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("the user should not be able to delete patient communication")
	public void userShouldNotBeAbleToDeletePatientCommunication() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Communication']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[11]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("I create a profile with Add and Edit access to Patient Module Patient Communication")
	public void createProfileWithAddAndEditAccessForPatientCommunication() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg18PatientCommunicationDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("the user should not be able to edit or delete patient communication")
	public void verifyUserCannotEditOrDeletePatientCommunication() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Communication']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[11]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@Then("the user should be able to add patient communication")
	public void verifyUserCanAddPatientCommunication() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Communication']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Communication']"));
		sleep(1000);
		waitAndSendKeys(By.xpath("//textarea[@id='PatientCommunication_Notes']"), "comunication note");
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSaveCommunication']"));

	}

	@And("the user should be able to delete patient physician")
	public void verifyUserCanDeletePatientPhysician() {
		clickWhenClickable(By.xpath("//a[normalize-space()='Physician']"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='deletepatientphysian']"));
	}

	@And("I create a profile with Add, Edit, and Delete access to Patient Module Patient Physician")
	public void createProfileWithAddEditAndDeleteAccessForPatientPhysician() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to delete patient pharmacy")
	public void verifyUserCanDeletePatientPharmacy() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@id='btnDeletePharmacyConfirm']//img"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='deletepatientpharmacy']"));

	}

	@And("the user should not be able to delete patient pharmacy")
	public void verifyUserCannotDeletePatientPharmacy() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[@id='btnDeletePharmacyConfirm']//img"));

	}

	@Then("the user should be able to edit patient pharmacy")
	public void verifyUserCanEditPatientPharmacy() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Pharmacy']"));

	}

	@And("the user should not be able to edit or delete patient physician")
	public void verifyUserCannotEditOrDeletePatientPhysician() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Physician']"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to edit patient physician")
	public void verifyUserCanEditPatientPhysician() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Physician']"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@class='col-md-4 col-lg-3 pt-2']//label[@id='chk2text']"));
		clickWhenClickable(By.xpath("//button[@id='btnSavePhysian']"));

	}

	@And("the user should not be able to delete patient physician")
	public void verifyUserCannotDeletePatientPhysician() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Physician']"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("I create a profile with Add and Edit access to Patient Module Patient Physician")
	public void createProfileWithAddAndEditAccessForPatientPhysician() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg18PatientPhysianDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to add patient physician")
	public void verifyUserCanAddPatientPhysician() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Physician']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Physician']"));
		sleep(1000);
		waitAndSendKeys(By.xpath("//input[@id='Filter_DoctorLastName']"), "Chapman");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//input[@id='2b44bfab-9454-457a-822d-01eafa4e95de']"));
		clickWhenClickable(By.xpath("//button[@id='btnProvider']"));

	}

	@And("I create a profile with Add access only to Patient Module Patient Communication")
	public void createProfileWithAddAccessOnlyForPatientCommunication() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg18PatientCommunicationEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg18PatientCommunicationDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add access only to Patient Module Patient Physician")
	public void createProfileWithAddAccessOnlyForPatientPhysician() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg18PatientPhysianEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg18PatientPhysianDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add, Edit, Print, and Send For Signature access to Patient Module Patient Intake Form")
	public void createProfileWithAddEditPrintAndSendForSignatureAccessToPatientIntakeForm() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add, Edit, and Delete access to Patient Module Patient Health Card")
	public void createProfileWithAddEditAndDeleteAccessToPatientHealthCard() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with Add and Edit access to Patient Module Patient Health Card")
	public void createProfileWithAddAndEditAccessToPatientHealthCard() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientHealthCardDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to edit patient health cards")
	public void verifyUserCanEditPatientHealthCards() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(1000);
		waitAndSendKeys(By.xpath("//input[@id='Tag_Name']"), "11");
		clickWhenClickable(By.xpath("///button[@id='btnSaveHealthCard']"));

	}

	@And("the user should not be able to delete patient health cards")
	public void verifyUserCannotDeletePatientHealthCards() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("I create a profile with Add access only to Patient Module Patient Health Card")
	public void createProfileWithAddAccessToPatientHealthCard() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientHealthCardEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientHealthCardDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Setup Module Enrollment")
	public void createProfileWithViewAndAddAccessToSetupEnrollment() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg10PatientEnrollmentEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg11PatientEnrollmentDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("the user should not be able to delete referral sources")
	public void verifyUserCannotDeleteReferralSources() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@Then("the user should be able to view review categories")
	public void verifyUserCanViewReviewCategories() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/ReviewCategories");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/ReviewCategories"));
		sleep(2000);

	}

	@And("I create a profile with View, Add, Edit, and Delete access to Setup Module Review Category")
	public void createProfileWithViewAddEditAndDeleteAccessToSetupReviewCategory() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to Setup Module Referral Source")
	public void createProfileWithViewAccessToSetupReferralSource() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg9PatientReferralSourceAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg10PatientReferralSourceEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg10PatientReferralSourceDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("the user should not be able to edit or delete referral sources")
	public void verifyUserCannotEditOrDeleteReferralSources() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@Then("the user should be able to view referral sources")
	public void verifyUserCanViewReferralSources() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/ReferralSources");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/ReferralSources"));
		sleep(2000);

	}

	@And("the user should be able to add a new referral source")
	public void verifyUserCanAddNewReferralSource() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Referral Source']"));
		sleep(1000);
		waitAndSendKeys(By.xpath("//input[@id='ReferralSource_Name']"), profileName);
		waitAndSendKeys(By.xpath("//input[@id='ReferralSource_Description']"), profileName);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("I create a profile with View and Add access to Setup Module Referral Source")
	public void createProfileWithViewAndAddAccessToSetupReferralSource() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg10PatientReferralSourceEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg10PatientReferralSourceDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("the user should not be able to delete review categories")
	public void verifyUserCannotDeleteReviewCategories() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[6]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should be able to edit an existing review category")
	public void verifyUserCanEditExistingReviewCategory() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[6]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(1000);
		waitAndSendKeys(By.xpath("//input[@id='ReviewCategory_Name']"), profileName);
		waitAndSendKeys(By.xpath("//input[@id='ReviewCategory_Description']"), profileName);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@Then("the user should be able to add a new review category")
	public void verifyUserCanAddNewReviewCategory() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Review Categories']"));
		sleep(1000);
		waitAndSendKeys(By.xpath("//input[@id='ReviewCategory_Name']"), profileName);
		waitAndSendKeys(By.xpath("//input[@id='ReviewCategory_Description']"), profileName);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should not be able to edit or delete review categories")
	public void verifyUserCannotEditOrDeleteReviewCategories() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[6]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to add, edit, or delete review categories")
	public void verifyUserCannotAddEditOrDeleteReviewCategories() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[6]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Review Categories']"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@Then("the user should be able to view tags")
	public void userShouldBeAbleToViewTags() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Tags");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Tags"));
		sleep(2000);

	}

	@And("the user should not be able to add, edit, or delete tags")
	public void userShouldNotBeAbleToAddEditOrDeleteTags() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Tag']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to delete tags")
	public void userShouldNotBeAbleToDeleteTags() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("I create a profile with View, Add, Edit, and Delete access to Patient Module Tag")
	public void createProfileWithViewAddEditDeleteAccessToPatientModuleTag() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, and Edit access to Patient Module Tag")
	public void createProfileWithViewAddEditAccessToPatientModuleTag() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg10PatientTagDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to edit an existing tag")
	public void userShouldBeAbleToEditExistingTag() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(1000);
		waitAndSendKeys(By.xpath("//input[@id='Tag_Name']"), profileName);
		waitAndSendKeys(By.xpath("//input[@id='Tag_Description']"), profileName);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Tag']"));

	}

	@And("I create a profile with View access only to Setup Module Review Category")
	public void createProfileWithViewAccessToSetupReviewCategory() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg13PatientReviewCategoryAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg13PatientReviewCategoryEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg13PatientReviewCategoryDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Setup Module Review Category")
	public void createProfileWithViewAndAddAccessToSetupReviewCategory() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg13PatientReviewCategoryEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg13PatientReviewCategoryDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add, and Edit access to Setup Module Review Category")
	public void createProfileWithViewAddAndEditAccessToSetupReviewCategory() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg13PatientReviewCategoryDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("the user should not be able to edit or delete tags")
	public void userShouldNotBeAbleToEditOrDeleteTags() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@Then("the user should be able to add a new tag")
	public void userShouldBeAbleToAddNewTag() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Tag']"));
		sleep(1000);
		waitAndSendKeys(By.xpath("//input[@id='Tag_Name']"), profileName);
		waitAndSendKeys(By.xpath("//input[@id='Tag_Description']"), profileName);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Tag']"));

	}

	@And("I create a profile with View and Add access to Patient Module Tag")
	public void createProfileWithViewAndAddAccessToPatientModuleTag() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg10PatientTagEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg10PatientTagDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should not be able to update DeDupe records via UI or direct URL")
	public void userShouldBeAbleToUpdateDeDupeRecordsViaUIOrDirectURL() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/DeDupePatients");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}

	}

	@Then("the user should be able to update DeDupe records")
	public void userShouldBeAbleToUpdateDeDupeRecords() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/DeDupePatients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/DeDupePatients"));
		sleep(2000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Last Name']"));
		clickWhenClickable(By.xpath("//label[normalize-space()='First Name']"));
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

	@And("the user should not be able to delete an RPM device")
	public void verifyUserCannotDeleteRPMDevice() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//tbody/tr/td[4]/div[1]/div[1]/button[1]/i[1]"));
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteRPMDeviceConfirm']//span[contains(text(),'Delete')]"));

	}

	@And("the user should not be able to edit an RPM device")
	public void verifyUserCannotEditRPMDevice() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//tbody/tr/td[4]/div[1]/div[1]/button[1]/i[1]"));
		assertElementNotPresent(
				By.xpath("//a[@class='tooltiped txt-decor-none user-access']//span[contains(text(),'Edit')]"));

	}

	@And("the user should not be able to reset a patient password")
	public void verifyUserCannotResetPatientPassword() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/button[1]/i[1]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Reset Password')]"));

	}

	@And("the user should be able to send a patient for review")
	public void userShouldBeAbleToSendPatientForReview() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//*[name()='path' and contains(@d,'M9.0949 14')]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Enrollments']"));
		clickWhenClickable(By.xpath("//button[@id='savesendforreview']"));

	}

	@And("the user should be able to print a patient signature")
	public void userShouldBeAbleToPrintPatientSignature() throws Exception {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Patient Signatures']"));
		sleep(3000);
		clickWhenClickable(By.xpath("(//tbody/tr/td[@scope='row']//a)[6]"));
		sleep(3000);
		((JavascriptExecutor) DriverFactory.getDriver()).executeScript("window.print();");
		System.out.println("Patient signature PDF auto-saved in Downloads folder");

	}

	@And("the user should be able to delete a referrals")
	public void userShouldBeAbleToDeleteReferrals() {
		sleep(3000);
		driver.get(baseUrl + "/Referral/Home/GenerateReferrals");
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		clickWhenClickable(By.xpath("//span[normalize-space()='Delete']"));
		clickWhenClickable(By.xpath("//div[@id='deleteClinicalMedReconModel']//button[@id='btnDeleteConfirm']"));
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Filter']"));
		waitAndSendKeys(By.xpath("//input[@id='Filter_PatientId']"), "0004403");
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		sleep(1000);
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Referrals']"));
		assertElementNotPresent(By.xpath("//td[normalize-space()='New Assignment']"));

	}

	@And("the user should be able to add a patient enrollment")
	public void userAddsPatientEnrollment() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//div[@class='col-md-4 pr-0']//input[@type='text']"));
		sleep(2000);
		WebElement firstOption = driver.findElement(By.xpath(
				"(//h6[.='Enrollment']//following::ul[contains(@class,'multiple-select-dropdown')]//li[not(contains(@class,'disabled'))]//span)[1]"));
		firstOption.click();
		clickWhenClickable(By.xpath(
				"//div[@id='btnPatientEnrollmentApp']//*[name()='svg']//*[name()='path' and contains(@d,'M256 80c0-')]"));
		sleep(3000);

	}

	@And("the user should be able to update patient status")
	public void userUpdatesPatientStatus() {
		sleep(3000);
		clickWhenClickable(By.xpath("//select[@id='Patient_Status']"));
		selectDropdownByIndexWhenReady(By.id("Patient_Status"), 0);
		clickWhenClickable(By.xpath("//a[@class='patientStatusBtn']//*[name()='svg']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//select[@id='Patient_Status']"));
		selectDropdownByIndexWhenReady(By.id("Patient_Status"), 1);
		clickWhenClickable(By.xpath("//a[@class='patientStatusBtn']//*[name()='svg']"));

	}

	@And("the user should be able to reset a patient password")
	public void userResetsPatientPassword() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/button[1]/i[1]"));
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Reset Password')]"));
		waitAndSendKeys(By.xpath("//input[@id='newPassword']"), "Admin@123");
		waitAndSendKeys(By.xpath("//input[@id='confirmPassword']"), "Admin@123");
		clickWhenClickable(By.xpath("//button[@id='btnResetPassword']"));

	}

	@And("the user should be able to delete an RPM device")
	public void userDeletesRPMDevice() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr/td[4]/div[1]/div[1]/button[1]/i[1]"));
		clickWhenClickable(By.xpath("//a[@id='btnDeleteRPMDeviceConfirm']//span[contains(text(),'Delete')]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='deletepatientRPMDevice']"));

	}

	@And("the user should be able to edit an RPM device")
	public void userEditsRPMDevice() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(
				By.xpath("//a[@class='tooltiped txt-decor-none user-access']//span[contains(text(),'Edit')]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@id='chk2PatientRPMDevice_IsActive']"));
		clickWhenClickable(By.xpath("//button[@id='btnSavePatientRPMDevice']"));

	}

	@And("the user should be able to add an RPM device")
	public void userAddsRPMDevice() {
		sleep(3000);
		clickWhenClickable(By.xpath("//select[@id='registeredDeviceId']"));
		selectDropdownByIndexWhenReady(By.id("registeredDeviceId"), 1);
		clickWhenClickable(By.xpath(
				"//div[@class='model-inp dropdownCaretAdd mb-0']//div[@class='usersearch plus-usersearch']//*[name()='svg']"));

	}

	@And("the user should be able to export patient data to excel")
	public void userExportsPatientDataToExcel() {
		sleep(3000);
		clickWhenClickable(By.xpath("//div[@id='content']//div//div[5]//div[2]//button[1]//*[name()='svg']"));

	}

	@And("the user should be able to make an outgoing call")
	public void userMakesOutgoingCall() {
		sleep(3000);
		clickWhenClickable(By.xpath("//div[@id='page-wrapper']//div[4]//div[2]//button[1]//*[name()='svg']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//i[@onclick='closeDialerDialog();']"));

	}

	@And("the user should be able to set delivery preference")
	public void userSetsDeliveryPreference() {
		sleep(3000);
		clickWhenClickable(By.xpath("//select[@id='Patient_PrimaryDeliveryPreferenceType']"));
		selectDropdownByIndexWhenReady(By.id("Patient_PrimaryDeliveryPreferenceType"), 1);
		clickWhenClickable(By.xpath("//select[@id='Patient_SecondaryDeliveryPreferenceType']"));
		selectDropdownByIndexWhenReady(By.id("Patient_SecondaryDeliveryPreferenceType"), 1);
		clickWhenClickable(By.xpath("//button[@id='btnAddDeliveryPreference']"));

	}

	@And("the user should be able to delete a patient enrollment")
	public void userDeletesPatientEnrollment() {
		sleep(3000);
		clickWhenClickable(
				By.xpath("(//ul[@class='dropdownSelectedLabelMain']/li//a[@id='btnAddPatientEnrollment'])[1]"));
		clickWhenClickable(By.xpath(
				"//button[@onclick='javascript: CloseDeletePatientEnrollmentPopup();']//i[@class='fa fa-times']"));
	}

	@And("the user should be able to delete a referral source")
	public void verifyUserCanDeleteReferralSource() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));
	}

	@And("the user should be able to edit an existing referral source")
	public void verifyUserCanEditExistingReferralSource() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		waitAndSendKeys(By.xpath("//input[@id='ReferralSource_Name']"), profileName);
		waitAndSendKeys(By.xpath("//input[@id='ReferralSource_Description']"), profileName);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to add a referral source")
	public void verifyUserCanAddReferralSource() {
		sleep(3000);
		clickWhenClickable(By.xpath("//div[@class='col-md-4 px-0']//input[@type='text']"));
		sleep(2000);
		WebElement firstOption = driver.findElement(By.xpath(
				"(//h6[.='Referral Source']//following::ul[contains(@class,'multiple-select-dropdown')]//li[not(contains(@class,'disabled'))]//span)[1]"));
		firstOption.click();
		clickWhenClickable(By.xpath("//div[@id='btnPatientReferralSource']//*[name()='svg']"));
		sleep(3000);

	}

	@And("the user should be able to add a referrals")
	public void userClicksOnAddReferrals() {
		sleep(3000);
		driver.get(baseUrl + "/Referral/Home/GenerateReferral");
		clickWhenClickable(By.xpath("//a[@id='addPatientNamePopup']//img"));
		waitAndSendKeys(By.xpath("//input[@id='Filter_PatientId']"), "0004403");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		clickWhenClickable(By.xpath("//input[@id='d2666909-ed0d-49fd-9500-af849059511e']"));
		clickWhenClickable(By.xpath("//div[@class='modal-footer text-right d-block']//button[@id='btnPatient']"));
		clickWhenClickable(By.xpath("//select[@id='ReferralEntityType']"));
		selectDropdownByIndexWhenReady(By.id("ReferralEntityType"), 1);
		clickWhenClickable(By.xpath("//a[@id='addCurrentProviderPopup']//img"));
		clickWhenClickable(By.xpath("//input[@id='rdoFullSearch']"));
		waitAndSendKeys(By.xpath("//input[@id='Filter_DoctorLastName']"), "Pate");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//input[@id='9759a37e-c5fa-4310-abfd-ecc9ab729697']"));
		clickWhenClickable(By.xpath("//button[@id='btnProvider']"));
		clickWhenClickable(By.xpath("//select[@id='ReferralType']"));
		selectDropdownByIndexWhenReady(By.id("ReferralType"), 1);
		clickWhenClickable(By.xpath("//select[@id='ReferralCategoryId']"));
		selectDropdownByIndexWhenReady(By.id("ReferralCategoryId"), 1);
		clickWhenClickable(By.xpath("//select[@id='Priority']"));
		selectDropdownByIndexWhenReady(By.id("Priority"), 1);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Filter']"));
		waitAndSendKeys(By.xpath("//input[@id='Filter_PatientId']"), "0004403");
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		sleep(1000);
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Referrals']"));
		assertElementPresent(By.xpath("//td[normalize-space()='New Assignment']"));

	}

	@And("the user should be able to view patient prescriptions")
	public void userNavigatesToPatientPrescriptions() {
		sleep(3000);
		assertElementPresent(By.xpath("//*[name()='path' and @id='Path_2472']"));
		clickWhenClickable(By.xpath("//*[name()='path' and @id='Path_2472']"));
	}

	@And("the user should be able to delete a mapped tag")
	public void userShouldBeAbleToDeleteMappedTag() {
		sleep(3000);
		clickWhenClickable(By.xpath("(//ul[@class='dropdownSelectedLabelMain']//li//a[@id='btnAddPatientTag'])[1]"));
		clickWhenClickable(By.xpath("//div[33]//div[1]//div[1]//div[1]//button[1]//i[1]"));

	}

	@And("the user should be able to map a tag")
	public void userShouldBeAbleToMapTag() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		clickWhenClickable(By.xpath("//div[@class='col-md-4']//input[@type='text']"));
		WebElement option = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("(//ul[contains(@class,'multiple-select-dropdown')]//li[not(@class='disabled')]//label)[1]")));
		option.click();
		clickWhenClickable(By.xpath("//div[@id='btnPatientTag']//*[name()='svg']"));
	}

	@And("the user should be able to send a patient for signature")
	public void userShouldBeAbleToSendPatientForSignature() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@id='btnpatientSignature']//*[name()='svg']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Email']"));
		clickWhenClickable(By.xpath("//select[@id='MailTemplate_Id']"));
		selectDropdownByIndexWhenReady(By.id("MailTemplate_Id"), 1);
		waitAndSendKeys(By.xpath("//div[@aria-label='Editor editing area: main. Press Alt+0 for help.']//p"),
				profileName);
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Placeat esse ut cu']"));
		clickWhenClickable(By.xpath("//button[@id='btnPatientSignatureSave']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@id='btnpatientSignature']//*[name()='svg']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//a[normalize-space()='Text']"));
		clickWhenClickable(By.xpath("//select[@id='SMSTemplate_Id']"));
		selectDropdownByIndexWhenReady(By.id("SMSTemplate_Id"), 1);
		sleep(1000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Placeat esse ut cu']"));
		clickWhenClickable(By.xpath("//button[@id='btnPatientSignatureSave']"));

	}

	@And("the user should be able to view patients")
	public void verifyUserCanViewPatients() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));

	}

	@And("the user should be able to add a new patient")
	public void userShouldBeAbleToAddNewPatient() {
		sleep(1000);
		assertElementPresent(By.xpath("//span[normalize-space()='New Patient']"));
		clickWhenReadyAndVisible(By.xpath("//span[normalize-space()='New Patient']"));
		waitAndSendKeys(By.id("Patient_LastName"), "John");
		waitAndSendKeys(By.id("Patient_FirstName"), "Doe");
		WebElement birthDateInput = driver.findElement(By.id("Patient_BirthDate"));
		birthDateInput.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement yearDropdown = driver.findElement(By.xpath("//select[contains(@class,'ui-datepicker-year')]"));
		Select yearSelect = new Select(yearDropdown);
		yearSelect.selectByVisibleText("1993");
		WebElement monthDropdown = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//select[contains(@class,'ui-datepicker-month')]")));
		Select monthSelect = new Select(monthDropdown);
		monthSelect.selectByVisibleText("Oct");
		WebElement dateToSelect = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[normalize-space()='1']")));
		dateToSelect.click();
		clickWhenClickable(By.xpath("//button[normalize-space()='Add New Patient']"));
		sleep(1000);
		waitAndSendKeys(By.id("Patient_EmailId"), createdEmail);
		waitAndSendKeys(By.id("Patient_PhoneNumber"), "1234567890");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to edit an existing patient")
	public void userShouldBeAbleToEditExistingPatient() {
		sleep(1000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		sleep(1000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/button[1]/i[1]"));
		assertElementPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(1000);
		waitAndSendKeys(By.xpath("//input[@id='Patient_Height']"), "5.00");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to delete a patient")
	public void userShouldBeAbleToDeletePatient() {
		sleep(1000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		sleep(1000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/button[1]/i[1]"));
		assertElementPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[@id='deletePatientModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should not be able to delete patients")
	public void userShouldNotBeAbleToDeletePatients() {
		sleep(1000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		sleep(1000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
	}

	@And("the user should not be able to edit or delete patients")
	public void userShouldNotBeAbleToEditOrDeletePatients() {
		sleep(1000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		sleep(1000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/button[1]/i[1]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
	}

	@And("I create a profile with View, Add, and Edit access to Setup Module Enrollment")
	public void createProfileWithViewAddAndEditAccessToSetupEnrollment() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg11PatientEnrollmentDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to view buckets")
	public void verifyUserCanViewBuckets() {
		sleep(3000);
		driver.get(baseUrl + "/Patient/Home/Patients");
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Patients"));
		clickWhenClickable(By.xpath("(//a[@class='gridLinkButton'])[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//a[@id='btnDocumentLibrary']//*[name()='svg']"));
		sleep(1000);

	}

	@And("I create a profile with View, Add Folder, Edit Folder, and Delete Folder access to Setup Module Bucket")
	public void createProfileWithViewAddFolderEditFolderAndDeleteFolderAccessToSetupBucket() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientBucketAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientBucketView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientBucketFolderAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientBucketFolderEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientBucketFolderDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View, Add File, Edit File, Delete File, and Download File access to Setup Module Bucket")
	public void createProfileWithViewAddFileEditFileDeleteFileAndDownloadFileAccessToSetupBucket() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientBucketAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientBucketView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientBucketFolderAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientBucketFolderEdit']"));
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientBucketFolderDelete']"));
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientBucketFileDownload']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("the user should be able to download files")
	public void verifyUserCanDownloadFiles() {
		sleep(3000);
		clickWhenClickable(By.xpath(
				"//div[@class='documentLibraryContentMain']//div[1]//div[2]//a[4]//*[name()='svg']//*[name()='path' and @id='Path_2898']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@onclick='CloseDocViewer();']//i[@class='fa fa-times']"));

	}

	@And("the user should not be able to add, edit, or delete folders")
	public void verifyUserCannotAddEditOrDeleteFolders() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@title='Home']//*[name()='svg']"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//a[@title='New Folder']//*[name()='svg']"));
		assertElementNotPresent(By.xpath("//div[10]//div[2]//a[1]//img[1]"));
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteFolder']//img"));

	}

	@Then("the user should be able to delete files")
	public void verifyUserCanDeleteFiles() {
		sleep(3000);
		clickWhenClickable(By.xpath("//div[@class='documentLibraryContentMain']//div[1]//div[2]//a[2]//img[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnDeleteFileConfirm']"));

	}

	@Then("the user should be able to edit existing files")
	public void verifyUserCanEditExistingFiles() {
		sleep(3000);
		clickWhenClickable(By.xpath("//div[@class='documentLibraryContentMain']//div[1]//div[2]//a[1]//img[1]"));
		sleep(1000);
		waitAndSendKeys(By.xpath("//input[@id='fileNameTextBox']"), profileName);
		clickWhenClickable(By.xpath("//button[@id='btnSaveFile']"));

	}

	@Then("the user should be able to add new files to folders")
	public void verifyUserCanAddNewFilesToFolders() {
		sleep(3000);
		clickWhenClickable(By.xpath("//span[@id='0e1ca86a-1861-472a-82ce-81d5b0ccddba']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//*[name()='path' and @id='Path_707']"));
		WebElement uploadElement = driver.findElement(By.xpath("//div[@id='fileUpload']//input[@id='file-3']"));
		uploadElement.sendKeys("C:\\Users\\MayurChauhan\\Downloads\\blank.pdf");
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnSaveFile']"));

	}

	@Then("the user should be able to add new folders")
	public void verifyUserCanAddNewFolders() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@title='New Folder']//*[name()='svg']"));
		sleep(1000);
		waitAndSendKeys(By.xpath("//input[@id='BucketFolder_FolderName']"), profileName);
		selectDropdownByIndexWhenReady(By.id("BucketFolder_Type"), 1);
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to edit existing folders")
	public void verifyUserCanEditExistingFolders() {
		sleep(3000);
		clickWhenClickable(By.xpath("//div[10]//div[2]//a[1]//img[1]"));
		sleep(1000);
		waitAndSendKeys(By.xpath("//input[@id='BucketFolder_FolderName']"), profileName);
		selectDropdownByIndexWhenReady(By.id("BucketFolder_Type"), 2);
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("the user should be able to delete folders")
	public void verifyUserCanDeleteFolders() {
		sleep(3000);
		clickWhenClickable(By.xpath("//a[@id='btnDeleteFolder']//img"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[@id='deleteFolderModel']//button[@id='btnDeleteConfirm']"));

	}

	@And("the user should not be able to delete folder")
	public void verifyUserCannotDeleteFolder() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteFolder']//img"));

	}

	@And("the user should not be able to edit or delete enrollments")
	public void verifyUserCannotEditOrDeleteEnrollments() {
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("I reset the user's password for Patient Module")
	public void resetUserPasswordForPatientModule() {
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

	@And("I create a profile with View, Add Folder, and Edit Folder access to Setup Module Bucket")
	public void createProfileWithViewAddFolderAndEditFolderAccessToSetupBucket() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Patient Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientBucketAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientBucketView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientBucketFolderAdd']"));
		clickWhenClickable(By.xpath("//label[@for='chkg14PatientBucketFolderEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("the user should be able to view Patient Module General Audit View")
	public void userShouldBeAbleToViewPatientModuleGeneralAuditViewSettings() {
		sleep(3000);
		String[] auditViewUrls = { baseUrl + "/Patient/Home/Tags", baseUrl + "/Patient/Home/ReviewCategories",
				baseUrl + "/Patient/Home/ReferralSources", baseUrl + "/Patient/Home/Enrollments" };

		By updatedBy = By.xpath("//th[normalize-space()='Updated By']");
		By updatedDate = By.xpath("//th[normalize-space()='Updated Date']");

		for (String url : auditViewUrls) {
			driver.get(url);
			sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(updatedBy));
			wait.until(ExpectedConditions.visibilityOfElementLocated(updatedDate));
			assertElementPresent(updatedBy);
			assertElementPresent(updatedDate);

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
