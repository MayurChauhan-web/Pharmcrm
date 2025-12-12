package com.pharmcrm.pharmcrm_product.steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.List;
import org.junit.Assert;
import driver.DriverFactory;

public class DrugSteps {

	String baseUrl = "http://qa01.pharmcrm.com";
	String profileName;

	public static String createdEmail;
	public static WebDriver driver;
	public static WebDriverWait wait;

	@Given("I log in as admin")
	public void loginAsAdmin() {
		if (!isInternetAvailable()) {
			Assert.fail("Internet connection not available. Please check your connection.");
		}
		driver = DriverFactory.createDriver();
		wait = new WebDriverWait(driver, 15);
		driver.get(baseUrl);
		measurePageLoadTime(baseUrl, 5000);
		waitAndSendKeys(By.id("UserName"), "support@pharmcrm.com");
		waitAndSendKeys(By.id("Password"), "Admin@1234");
		clickWhenClickable(By.id("btnSubmit"));
	}

	@When("I create a new user with email {string}")
	public void createNewUser(String email) {
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

	@And("I create a profile with View access only to Drug Module General Audit View")
	public void createProfileWithViewAccessForDrugGeneralAuditView() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
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

	@Then("the user should be able to view and add in Drug")
	public void verifyUserCanViewAndAddDrug() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Drug']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Filter']"));
		waitAndSendKeys(By.xpath("//input[@id='Filter_DrugName']"), "Amoxilin500");
		waitAndSendKeys(By.xpath("//input[@id='Filter_NDC']"), "31133-2113-25");
		clickWhenClickable(By.xpath("//button[normalize-space()='Add New Drug']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("I create a profile with View and Edit access to Drug")
	public void createProfileWithViewAndEditAccessToDrug() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg02DrugAll']"));
		clickWhenClickable(By.xpath("//label[@for='chkg02DrugView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg02DrugEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to view and edit in Drug")
	public void verifyUserCanViewAndEditDrug() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(2000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		waitAndSendKeys(By.xpath("//input[@id='Drug_ManufacturerName']"), "Medicine");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@Then("the user should be able to view and delete in Drug")
	public void verifyUserCanViewAndDeleteDrug() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(3000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(3000);
		clickWhenClickable(By.xpath("//div[@id='deleteDrugsModal']//button[@id='btnDeleteConfirm']"));

	}

	@And("I create a profile with View and Download Template access to Drug")
	public void createProfileWithViewAndDownloadTemplateAccessToDrug() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg02DrugAll']"));
		clickWhenClickable(By.xpath("//label[@for='chkg02DrugView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg28DrugsDownloadTemplate']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should not be able to add, edit, delete, upload excel, or export excel")
	public void verifyUserCannotAddEditDeleteUploadExportDrug() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Drug']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Upload Excel file']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export Excel']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@Then("the user should be able to view and download template in Drug")
	public void verifyUserCanViewAndDownloadTemplateDrug() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Download Template']"));

	}

	@Then("the user should not be able to add, edit, download template, upload excel, or export excel")
	public void verifyUserCannotAddEditDownloadUploadExportDrug() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Drug']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Upload Excel file']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export Excel']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Download Template']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@Then("the user should be able to view and upload excel in Drug")
	public void verifyUserCanViewAndUploadExcelDrug() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Upload Excel file']"));
		WebElement uploadInput = driver.findElement(By.xpath("//input[@type='file']"));
		String filePath = "C:\\Users\\MayurChauhan\\Downloads\\DrugTemplate.xlsx";
		uploadInput.sendKeys(filePath);
		sleep(3000);
	}

	@Then("the user should be able to view and export excel in Drug")
	public void verifyUserCanViewAndExportExcelDrug() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Export Excel']"));

	}

	@Then("the user should not be able to add, edit, delete, download template, or upload excel")
	public void verifyUserCannotAddEditDeleteDownloadUpload() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Drug']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Download Template']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Upload Excel file']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@Then("the user should be able to view Star 1 Drug")
	public void verifyUserCanViewStar1Drug() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Star1Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Star1Drugs"));

	}

	@Then("the user should not be able to edit Star 1 Drug")
	public void verifyUserCannotEditStar1Drug() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//button[@id='btnSave']"));

	}

	@And("I create a profile with View and Edit access to Star 1 Drug")
	public void createProfileWithViewAndEditAccessToStar1Drug() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to view and edit Star 1 Drug")
	public void verifyUserCanViewAndEditStar1Drug() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Star1Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Star1Drugs"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkSelectAllLeft']"));
		clickWhenClickable(By.xpath("//button[@id='select-one']//*[name()='svg']"));
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("I create a profile with View access only to Star 2 Drug")
	public void createProfileWithViewAccessOnlyToStar2Drug() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg02Star2DrugEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to view and edit Star 2 Drug")
	public void verifyUserCanViewAndEditStar2Drug() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Star2Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Star2Drugs"));
		sleep(3000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@And("I create a profile with View access only to Allergy")
	public void createProfileWithViewAccessOnlyToAllergy() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg02AllergyAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg02AllergyView']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to view Allergy")
	public void verifyUserCanViewAllergy() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Allergies");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Allergies"));

	}

	@Then("the user should be able to view ICD10")
	public void userShouldBeAbleToViewICD10() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/ICD10s");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/ICD10s"));

	}

	@Then("the user should be able to view and add ICD10")
	public void userShouldBeAbleToViewAndAddICD10() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/ICD10s");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/ICD10s"));
		sleep(2000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New ICD10']"));
		sleep(2000);
		waitAndSendKeys(By.id("ICD10_Code"), "M54.5");
		waitAndSendKeys(By.id("ICD10_Diagnosis"), "Low back pain");
		clickWhenClickable(By.xpath("//a[@id='addGoalPopup']//img"));
		sleep(2000);
		waitAndSendKeys(By.id("Filter_DiseaseName"), "Heart disease");
		clickWhenClickable(By.xpath("//button[normalize-space()='Search']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//input[@id='50b9ef96-8eff-432a-99b8-78d9a0100a62']"));
		clickWhenClickable(By.xpath("//button[@id='btnGoal']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@Then("the user should be able to view and edit ICD10")
	public void userShouldBeAbleToViewAndEditICD10() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/ICD10s");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/ICD10s"));
		sleep(2000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Edit']"));
		sleep(2000);
		waitAndSendKeys(By.id("ICD10_Code"), "M54.5");
		waitAndSendKeys(By.id("ICD10_Diagnosis"), "Low back pain");
		sleep(2000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@Then("the user should be able to view and delete ICD10")
	public void userShouldBeAbleToViewAndDeleteICD10() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/ICD10s");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/ICD10s"));
		sleep(2000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Delete']"));
		sleep(2000);
		clickWhenClickable(By.xpath("//div[@id='icd10modal']//button[@id='btnDeleteConfirm']"));

	}

	@Then("the user should be able to view and add Drug Therapeutic")
	public void userShouldBeAbleToViewAndAddDrugTherapeutic() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Therapeutic']"));
		sleep(1000);
		waitAndSendKeys(By.id("DrugTherapeutic_TherapeuticClass"), "Analgesics");
		waitAndSendKeys(By.id("DrugTherapeutic_TherapeuticClassCode"), "AN001");
		clickWhenClickable(By.xpath("//button[@id='btnSaveTherapeutic']"));
		sleep(1000);

	}

	@Then("the user should be able to view and edit Drug Therapeutic")
	public void userShouldBeAbleToViewAndEditDrugTherapeutic() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Edit']"));
		sleep(1000);
		waitAndSendKeys(By.id("DrugTherapeutic_TherapeuticClass"), "Analgesics");
		waitAndSendKeys(By.id("DrugTherapeutic_TherapeuticClassCode"), "AN001");
		clickWhenClickable(By.xpath("//button[@id='btnSaveTherapeutic']"));
		sleep(1000);

	}

	@Then("the user should be able to view and delete Drug Therapeutic")
	public void userShouldBeAbleToViewAndDeleteDrugTherapeutic() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='deleteTherapeutic']"));
		sleep(1000);

	}

	@Then("the user should be able to view and add Drug Family")
	public void userShouldBeAbleToViewAndAddDrugFamily() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Family']"));
		sleep(1000);
		waitAndSendKeys(By.id("DrugFamily_Family"), "Antipsychotics");
		waitAndSendKeys(By.id("DrugFamily_FamilyCode"), "AP010");
		clickWhenClickable(By.xpath("//button[@id='btnSaveFamily']"));
		sleep(1000);

	}

	@Then("the user should be able to view and edit Drug Family")
	public void userShouldBeAbleToViewAndEditDrugFamily() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[8]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(1000);
		waitAndSendKeys(By.id("DrugFamily_Family"), "Antipsychotics");
		waitAndSendKeys(By.id("DrugFamily_FamilyCode"), "AP010");
		clickWhenClickable(By.xpath("//button[@id='btnSaveFamily']"));
		sleep(1000);

	}

	@Then("the user should be able to view and delete Drug Family")
	public void userShouldBeAbleToViewAndDeleteDrugFamily() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[8]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//a[@id='btnDeleteFamilyConfirm']//span[contains(text(),'Delete')]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='deleteFamily']"));
		sleep(1000);

	}

	@Then("the user should be able to view and add Drug Approved Indication")
	public void userShouldBeAbleToViewAndAddDrugApprovedIndication() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Approved Indication']"));
		sleep(1000);
		waitAndSendKeys(By.id("DrugApprovedIndication_ApprovedIndication"), "Pain management");
		clickWhenClickable(By.xpath("//button[@id='btnSaveApprovedIndication']"));
		sleep(1000);

	}

	@Then("the user should be able to view and edit Drug Approved Indication")
	public void userShouldBeAbleToViewAndEditDrugApprovedIndication() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(1000);
		waitAndSendKeys(By.id("DrugApprovedIndication_ApprovedIndication"), "High cholesterol");
		clickWhenClickable(By.xpath("//button[@id='btnSaveApprovedIndication']"));
		sleep(1000);

	}

	@Then("the user should be able to view and delete Drug Approved Indication")
	public void userShouldBeAbleToViewAndDeleteDrugApprovedIndication() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='deleteApprovedIndication']"));
		sleep(1000);

	}

	@Then("the user should be able to view and add Disease State")
	public void userShouldBeAbleToViewAndAddDiseaseState() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//input[@id='adddiseasestate']"));
		sleep(1000);
		waitAndSendKeys(By.id("DiseaseState_Name"), "Coronary Artery Disease");
		clickWhenClickable(By.xpath("//div[@id='btnAddDiseaseState']//img[@class='v-align-middle']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@Then("the user should be able to view and delete Disease State")
	public void userShouldBeAbleToViewAndDeleteDiseaseState() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//a[@class='gridListRoundIcon']//*[name()='svg']"));
		sleep(1000);

	}

	@Then("the user should be able to view and add Program")
	public void userShouldBeAbleToViewAndAddProgram() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//input[@id='addprogram']"));
		sleep(1000);
		waitAndSendKeys(By.id("Program_Name"), "Diabetes Management Program");
		clickWhenClickable(By.xpath("//div[@id='btnAddProgram']//img[@class='v-align-middle']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@Then("the user should be able to view and delete Program")
	public void userShouldBeAbleToViewAndDeleteProgram() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		clickWhenClickable(By.xpath("//*[name()='path' and @id='Union_3']"));
		sleep(1000);
	}

	@Then("the user should not be able to edit or delete Drug Therapeutic")
	public void userShouldNotBeAbleToEditOrDeleteDrugTherapeutic() {
		sleep(2000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Edit']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));

	}

	@Then("the user should not be able to add or delete Drug Therapeutic")
	public void userShouldNotBeAbleToAddOrDeleteDrugTherapeutic() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Add Therapeutic']"));
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));

	}

	@Then("the user should not be able to add or edit Drug Therapeutic")
	public void userShouldNotBeAbleToAddOrEditDrugTherapeutic() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Add Therapeutic']"));
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@Then("the user should not be able to edit or delete Drug Family")
	public void userShouldNotBeAbleToEditOrDeleteDrugFamily() {
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr/td[8]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteFamilyConfirm']//span[contains(text(),'Delete')]"));

	}

	@Then("the user should not be able to add or delete Drug Family")
	public void userShouldNotBeAbleToAddOrDeleteDrugFamily() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Add Family']"));
		clickWhenClickable(By.xpath("//tbody/tr/td[8]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//a[@id='btnDeleteFamilyConfirm']//span[contains(text(),'Delete')]"));

	}

	@Then("the user should not be able to add or edit Drug Family")
	public void userShouldNotBeAbleToAddOrEditDrugFamily() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Add Family']"));
		clickWhenClickable(By.xpath("//tbody/tr/td[8]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@Then("the user should not be able to edit or delete Drug Approved Indication")
	public void userShouldNotBeAbleToEditOrDeleteDrugApprovedIndication() {
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@Then("the user should not be able to add or delete Drug Approved Indication")
	public void userShouldNotBeAbleToAddOrDeleteDrugApprovedIndication() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Add Approved Indication']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@Then("the user should not be able to add or edit Drug Approved Indication")
	public void userShouldNotBeAbleToAddOrEditDrugApprovedIndication() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Add Approved Indication']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@Then("the user should not be able to delete Disease State")
	public void userShouldNotBeAbleToDeleteDiseaseState() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//a[@class='gridListRoundIcon']//*[name()='svg']"));

	}

	@Then("the user should not be able to add Disease State")
	public void userShouldNotBeAbleToAddDiseaseState() {
		sleep(2000);
		clickWhenClickable(By.xpath("//input[@id='adddiseasestate']"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//div[@id='btnAddDiseaseState']//img[@class='v-align-middle']"));

	}

	@Then("the user should not be able to delete Program")
	public void userShouldNotBeAbleToDeleteProgram() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
		sleep(2000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(2000);
		assertElementNotPresent(By.xpath("//*[name()='path' and @id='Union_3']"));

	}

	@Then("the user should not be able to add Program")
	public void userShouldNotBeAbleToAddProgram() {
		sleep(2000);
		clickWhenClickable(By.xpath("//input[@id='addprogram']"));
		sleep(1000);
		assertElementNotPresent(By.xpath("//div[@id='btnAddProgram']//img[@class='v-align-middle']"));
	}

	@Then("the user should not be able to add, edit, delete, download template, upload excel, or export excel for Allergy")
	public void verifyUserCannotAddEditDeleteDownloadUploadExportAllergy() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Add Allergy']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Upload Excel file']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export Excel']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Download Template']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@Then("the user should not be able to add, edit, or delete ICD10")
	public void userShouldNotBeAbleToModifyICD10() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New ICD10']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Edit']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));

	}

	@Then("the user should not be able to edit or delete ICD10")
	public void userShouldNotBeAbleToEditOrDeleteICD10() {
		sleep(2000);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Edit']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));

	}

	@Then("the user should not be able to add or delete ICD10")
	public void userShouldNotBeAbleToAddOrDeleteICD10() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New ICD10']"));
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Delete']"));

	}

	@Then("the user should not be able to add or edit ICD10")
	public void userShouldNotBeAbleToAddOrEditICD10() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New ICD10']"));
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Edit']"));

	}

	@And("I create a profile with View and Add access to Allergy")
	public void createProfileWithViewAndAddAccessToAllergy() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg02AllergyAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg02AllergyView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg02AllergyAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to view and add Allergy")
	public void verifyUserCanViewAndAddAllergy() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Allergies");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Allergies"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Add Allergy']"));
		sleep(1000);
		waitAndSendKeys(By.xpath("//input[@id='Allergy_Name']"), "Allergy");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));

	}

	@Then("the user should be able to view and edit Allergy")
	public void verifyUserCanViewAndEditAllergy() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Allergies");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Allergies"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		sleep(1000);
		waitAndSendKeys(By.xpath("//input[@id='Allergy_Name']"), "Allergy");
		clickWhenClickable(By.xpath("//button[@id='btnSave']"));
	}

	@And("I create a profile with View and Edit access to Allergy")
	public void createProfileWithViewAndEditAccessToAllergy() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg02AllergyAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg02AllergyView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg02AllergyEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should not be able to delete, download template, upload excel, or export excel for Allergy")
	public void verifyUserCannotDeleteDownloadUploadExportAllergy() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Upload Excel file']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export Excel']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Download Template']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
	}

	@Then("the user should be able to view and delete Allergy")
	public void verifyUserCanViewAndDeleteAllergy() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Allergies");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Allergies"));
		sleep(3000);
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(1000);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));
		sleep(1000);
		clickWhenClickable(By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']"));

	}

	@Then("the user should not be able to add, edit, download template, upload excel, or export excel for Allergy")
	public void verifyUserCannotAddEditDownloadUploadExportAllergy() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Add Allergy']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Upload Excel file']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export Excel']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Download Template']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));

	}

	@Then("the user should be able to view and download template in Allergy")
	public void verifyUserCanViewAndDownloadTemplateAllergy() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Allergies");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Allergies"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Download Template']"));

	}

	@Then("the user should be able to view and upload excel in Allergy")
	public void verifyUserCanViewAndUploadExcelAllergy() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Allergies");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Allergies"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Upload Excel file']"));
		WebElement uploadInput = driver.findElement(By.xpath("//input[@type='file']"));
		String filePath = "C:\\Users\\MayurChauhan\\Downloads\\DrugTemplate.xlsx";
		uploadInput.sendKeys(filePath);
		sleep(3000);
	}

	@Then("the user should not be able to add, edit, delete, download template, or upload excel for Allergy")
	public void verifyUserCannotAddEditDeleteDownloadUploadAllergy() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Add Allergy']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Upload Excel file']"));
		assertElementNotPresent(By.xpath("//label[@for='chkg29AllergiesDownloadTemplate']"));
		clickWhenClickable(
				By.xpath("//div[@class='gridRecordContextMain show']//i[@class='fa-solid fa-ellipsis-vertical']"));
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@Then("the user should be able to view and export excel in Allergy")
	public void verifyUserCanViewAndExportExcelAllergy() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Allergies");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Allergies"));
		sleep(3000);
		clickWhenClickable(By.xpath("//span[normalize-space()='Export Excel']"));

	}

	@And("I create a profile with View and Export Excel access to Allergy")
	public void createProfileWithViewAndExportExcelAccessToAllergy() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg02AllergyAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg02AllergyView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg29AllergiesDownloadExcel']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View access only to ICD10")
	public void createProfileWithViewAccessOnlyToICD10() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg27ICD10Add']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg27ICD10Edit']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg27ICD10Delete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to ICD10")
	public void createProfileWithViewAndAddAccessToICD10() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg27ICD10Edit']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg27ICD10Delete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access to ICD10")
	public void createProfileWithViewAndEditAccessToICD10() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg27ICD10Add']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg27ICD10Delete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Drug Therapeutic")
	public void createProfileWithViewAndAddAccessToDrugTherapeutic() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg28DrugTherapeuticEdit']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg28DrugTherapeuticDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access to Drug Therapeutic")
	public void createProfileWithViewAndDeleteAccessToDrugTherapeutic() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg27DrugTherapeuticAdd']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg28DrugTherapeuticEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Drug Family")
	public void createProfileWithViewAndAddAccessToDrugFamily() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg28DrugFamilyEditt']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg28DrugFamilyDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access to Drug Family")
	public void createProfileWithViewAndEditAccessToDrugFamily() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg28DrugFamilyAdd']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg28DrugFamilyDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access to Drug Family")
	public void createProfileWithViewAndDeleteAccessToDrugFamily() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg28DrugFamilyAdd']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg28DrugFamilyEditt']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Drug Approved Indication")
	public void createProfileWithViewAndAddAccessToDrugApprovedIndication() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg28DrugApprovedIndicationEdit']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg28DrugApprovedIndicationDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access to Drug Approved Indication")
	public void createProfileWithViewAndEditAccessToDrugApprovedIndication() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg28DrugApprovedIndicationAdd']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg28DrugApprovedIndicationDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access to Drug Approved Indication")
	public void createProfileWithViewAndDeleteAccessToDrugApprovedIndication() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg28DrugApprovedIndicationAdd']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg28DrugApprovedIndicationEdit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Disease State")
	public void createProfileWithViewAndAddAccessToDiseaseState() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg29DrugDiseaseStateDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access to Disease State")
	public void createProfileWithViewAndDeleteAccessToDiseaseState() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg29DrugDiseaseStateAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Add access to Program")
	public void createProfileWithViewAndAddAccessToProgram() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg29DrugProgramDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access to Program")
	public void createProfileWithViewAndDeleteAccessToProgram() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg29DrugProgramAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access to Drug Therapeutic")
	public void createProfileWithViewAndEditAccessToDrugTherapeutic() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg27DrugTherapeuticAdd']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg28DrugTherapeuticDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access to ICD10")
	public void createProfileWithViewAndDeleteAccessToICD10() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg27ICD10Add']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg27ICD10Edit']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should not be able to add, edit, delete, download template, or export excel for Allergy")
	public void verifyUserCannotAddEditDeleteDownloadExportAllergy() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Add Allergy']"));
		assertElementNotPresent(By.xpath("//label[@for='chkg29AllergiesDownloadTemplate']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export Excel']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("I create a profile with View and Upload Excel access to Allergy")
	public void createProfileWithViewAndUploadExcelAccessToAllergy() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg02AllergyAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg02AllergyView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg29AllergiesUploadExcel']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should not be able to add, edit, delete, upload excel, or export excel for Allergy")
	public void verifyUserCannotAddEditDeleteUploadExportAllergy() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Add Allergy']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Upload Excel file']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export Excel']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]"));
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("I create a profile with View and Download Template access to Allergy")
	public void createProfileWithViewAndDownloadTemplateAccessToAllergy() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg02AllergyAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg02AllergyView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg29AllergiesDownloadTemplate']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access to Allergy")
	public void createProfileWithViewAndDeleteAccessToAllergy() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg02AllergyAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg02AllergyView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg02AllergyDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Edit access to Star 2 Drug")
	public void createProfileWithViewAndEditAccessToStar2Drug() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should be able to view Star 2 Drug")
	public void verifyUserCanViewStar2Drug() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Star2Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Star2Drugs"));

	}

	@Then("the user should not be able to edit Star 2 Drug")
	public void verifyUserCannotEditStar2Drug() {
		sleep(3000);
		assertElementNotPresent(By.xpath("//button[@id='btnSave']"));

	}

	@And("I create a profile with View access only to Star 1 Drug")
	public void createProfileWithViewAccessOnlyToStar1Drug() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg02Star1DrugEdit']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Export Excel access to Drug")
	public void createProfileWithViewAndExportExcelAccessToDrug() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg02DrugAll']"));
		clickWhenClickable(By.xpath("//label[@for='chkg02DrugView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg28DrugsDownloadExcel']"));
		sleep(3000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should not be able to add, edit, delete, download template, or export excel")
	public void verifyUserCannotAddEditDeleteDownloadExportDrug() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Drug']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export Excel']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Download Template']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@And("I create a profile with View and Upload Excel access to Drug")
	public void createProfileWithViewAndUploadExcelAccessToDrug() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg02DrugAll']"));
		clickWhenClickable(By.xpath("//label[@for='chkg02DrugView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg28DrugsUploadExcel']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with View and Delete access to Drug")
	public void createProfileWithViewAndDeleteAccessToDrug() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg02DrugAll']"));
		clickWhenClickable(By.xpath("//label[@for='chkg02DrugView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg02DrugDelete']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should not be able to delete, download template, upload excel, or export excel for Drug")
	public void verifyUserCannotPerformDeleteDownloadUploadExportForModule() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Upload Excel file']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export Excel']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Download Template']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@Then("the user should not be able to delete, download template, upload excel, or export excel")
	public void verifyUserRestrictedFromDeleteDownloadUploadExport() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='Upload Excel file']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export Excel']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Download Template']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

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

	@And("I log in using the new user")
	public void userLogin() {
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

	@Then("the user should not be able to add, edit, delete, download template, upload excel, or export excel")
	public void verifyUserCannotPerformAnyActionsOnDrug() {
		sleep(2000);
		assertElementNotPresent(By.xpath("//span[normalize-space()='New Drug']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Upload Excel file']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Export Excel']"));
		assertElementNotPresent(By.xpath("//span[normalize-space()='Download Template']"));
		clickWhenClickable(By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]"));
		sleep(3000);
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]"));
		assertElementNotPresent(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]"));

	}

	@Then("the user should be able to view Drug")
	public void verifyUserCanViewDrug() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));

	}

	@Then("the user should be able to view Drug General Audit View settings")
	public void verifyUserCanViewDrugGeneralAuditViewSettings() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
		assertElementPresent(By.xpath("//div[normalize-space()='Updated By']"));
		assertElementPresent(By.xpath("//a[normalize-space()='Updated Date']"));

	}

	@And("I create a profile with View and Add access to Drug")
	public void createProfileWithViewAndAddAccessToDrug() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg02DrugAll']"));
		clickWhenClickable(By.xpath("//label[@for='chkg02DrugView']"));
		clickWhenClickable(By.xpath("//label[@for='chkg02DrugAdd']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@And("I create a profile with No access to Drug Module General Audit View")
	public void createProfileWithNoAccessForDrugGeneralAuditView() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		sleep(3000);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg37DrugAuditView']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
	}

	@Then("the user should not be able to view Drug General Audit View settings")
	public void verifyUserCannotViewDrugGeneralAuditViewSettings() {
		sleep(3000);
		driver.get(baseUrl + "/Drug/Home/Drugs");
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
		sleep(3000);
		assertElementNotPresent(By.xpath("//div[normalize-space()='Updated By']"));
		assertElementNotPresent(By.xpath("//a[normalize-space()='Updated Date']"));

	}

	@And("I create a profile with View access only to Drug")
	public void createProfileWithViewAccessOnlyToDrug() {
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		this.profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Select All Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.xpath("//label[normalize-space()='Drug Module']"));
		sleep(3000);
		clickWhenClickable(By.xpath("//label[@for='chkg02DrugAll']"));
		sleep(1000);
		clickWhenClickable(By.xpath("//label[@for='chkg02DrugView']"));
		sleep(1000);
		clickWhenClickable(By.id("btnSave"));
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

	private void selectDropdownByVisibleTextWhenReady(By locator, String visibleText) {
		WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(locator));
		Select select = new Select(dropdown);
		select.selectByVisibleText(visibleText);
	}

	public void clickWhenReadyAndVisible(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
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
		WebDriverWait wait = new WebDriverWait(driver, 10);
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
