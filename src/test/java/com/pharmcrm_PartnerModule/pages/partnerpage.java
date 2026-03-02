package com.pharmcrm_PartnerModule.pages;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import hooks.Hooks;

public class partnerpage {

	private WebDriver driver;
	private WebDriverWait wait;

	// Custom Partners
	public void verifyUserCannotAddEditOrDeleteCustomPartnersInPartnerModule() {

		sleep(3000);

		List<WebElement> newButtons = driver.findElements(newPartnerButton);
		if (newButtons.isEmpty()) {
			System.out.println("New Partner button is not visible.");
		} else {
			System.out.println("New Partner button is visible.");
		}

		sleep(3000);

		driver.findElement(bucketDropdownIcon).click();
		sleep(2000);

		List<WebElement> editElements = driver.findElements(editOption);
		if (editElements.isEmpty()) {
			System.out.println("Edit option is not visible.");
		} else {
			System.out.println("Edit option is visible.");
		}

		List<WebElement> deleteElements = driver.findElements(deleteOption);
		if (deleteElements.isEmpty()) {
			System.out.println("Delete option is not visible.");
		} else {
			System.out.println("Delete option is visible.");
		}
	}

	public void verifyUserCanViewAndSeeDetailsOfCustomPartnersInPartnerModule() {

		sleep(3000);

		driver.findElement(viewCustomPartnerIcon).click();
		sleep(3000);
	}

	public void verifyViewOnlyAccessToCustomPartnersProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddOrEditCustomPartnersInPartnerModule() {
		sleep(3000);
		List<WebElement> newButtons = driver.findElements(newPartnerButton);
		if (newButtons.isEmpty()) {
			System.out.println("New Partner button is not visible.");
		} else {
			System.out.println("New Partner button is visible.");
		}

		sleep(3000);
		driver.findElement(bucketDropdownIcon).click();
		sleep(2000);

		List<WebElement> editElements = driver.findElements(editOption);
		if (editElements.isEmpty()) {
			System.out.println("Edit option is not visible.");
		} else {
			System.out.println("Edit option is visible.");
		}
	}

	public void verifyUserCanDeleteCustomPartnersInPartnerModule() {
		sleep(3000);
		driver.findElement(bucketDropdownIcon).click();
		sleep(2000);
		driver.findElement(deleteOption).click();
		sleep(3000);
		driver.findElement(confirmDeleteButton).click();
		sleep(2000);
	}

	public void verifyDeleteOnlyAccessToCustomPartnersProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddOrDeleteCustomPartnersInPartnerModule() {
		sleep(3000);
		List<WebElement> newButtons = driver.findElements(newPartnerButton);
		if (newButtons.isEmpty()) {
			System.out.println("New Partner button is not visible.");
		} else {
			System.out.println("New Partner button is visible.");
		}

		sleep(3000);
		driver.findElement(bucketDropdownIcon).click();
		sleep(2000);
		List<WebElement> deleteElements = driver.findElements(deleteOption);
		if (deleteElements.isEmpty()) {
			System.out.println("Delete option is not visible.");
		} else {
			System.out.println("Delete option is visible.");
		}
	}

	public void verifyUserCanEditCustomPartnersInPartnerModule() {
		sleep(3000);
		driver.findElement(bucketDropdownIcon).click();
		sleep(2000);
		driver.findElement(editOption).click();
		sleep(3000);
		driver.findElement(wednesdayCheckbox).click();
		sleep(2000);
		driver.findElement(saveButton).click();
	}

	public void verifyEditOnlyAccessToCustomPartnersProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrDeleteCustomPartnersInPartnerModule() {
		sleep(3000);
		driver.findElement(bucketDropdownIcon).click();
		sleep(2000);
		List<WebElement> editElements = driver.findElements(editOption);
		List<WebElement> deleteElements = driver.findElements(deleteOption);
		if (editElements.isEmpty() && deleteElements.isEmpty()) {
			System.out.println("Edit and Delete options are not visible.");
		} else {
			System.out.println("Edit or Delete option is visible.");
		}
	}

	public void openCustomPartnersUrl(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));
	}

	public void verifyUserCanAddCustomPartnersInPartnerModule() {
		sleep(3000);
		driver.findElement(newPartnerButton).click();
		sleep(3000);
		driver.findElement(partnerBusinessNameField).sendKeys("Allied Health Solutions");
		driver.findElement(partnerPhoneNumberField).sendKeys("(312) 555-0198");
		driver.findElement(saveButton).click();
	}

	// Custom Partners
	public By viewCustomPartnerIcon = By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]");
	public By wednesdayCheckbox = By.xpath("//label[normalize-space()='Wednesday']");
	public By newPartnerButton = By.xpath("//span[normalize-space()='New Partner']");
	public By partnerBusinessNameField = By.id("Partner_BusinessName");
	public By partnerPhoneNumberField = By.id("Partner_PhoneNumber");

	// Special Service
	public By editSpecialServiceIcon = By.xpath("//tbody/tr[1]/td[4]/div[1]/a[1]/img[1]");
	public By newSpecialServiceButton = By.xpath("//span[normalize-space()='New Special Service']");
	public By specialServiceTitleField = By.id("SpecialService_Title");

	// Partner Type
	public By confirmDeleteButton = By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']");
	public By bucketDropdownIcon = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By editOption = By.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[contains(text(),'Edit')]");
	public By deleteOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[contains(text(),'Delete')]");
	public By newPartnerTypeButton = By.xpath("//span[normalize-space()='New Partner Type']");
	public By partnerTypeNameField = By.id("PartnerType_Name");
	public By partnerTypeLabelField = By.id("PartnerType_Label");
	public By saveButton = By.xpath("//button[@id='btnSave']");

	// General
	public By createdByColumn = By.xpath("//a[normalize-space()='Created By']");
	public By createdDateColumn = By.xpath("//a[normalize-space()='Created Date']");
	public By errorHeader = By.xpath("//h2[normalize-space()='Error']");

	// Profile
	public By preloader = By.cssSelector("div.preloader");
	public By profileNameInput = By.xpath("//input[@id='Filter_Name']");
	public By searchButton = By.xpath("//i[@class='fa-solid fa-magnifying-glass']");
	public By actionMenu = By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']");
	public By editButton = By.xpath("//span[normalize-space()='Edit']");
	public By selectAllModuleLabel = By.xpath("//label[normalize-space()='Select All Module']");
	public By submitButton = By.xpath("//button[@id='btnSave']");
	public By profilefilterButton = By.xpath("//*[name()='path' and @id='Union_73']");
	public By firstPatientLink = By.xpath("(//a[@class='gridLinkButton'])[1]");
	public By vitalsTab = By.xpath("//a[normalize-space()='Vitals']");
	public By addVitalsButton = By.xpath("//span[normalize-space()='Add Vitals']");
	public By bpInputField = By.xpath("//input[@id='PatientVital_BP']");
	public By saveVitalsButton = By.xpath("//button[@id='btnSaveVital']");
	public By updatedDateColumn = By.xpath("//th[normalize-space()='Updated Date']");
	public By priorAuthorizationProcessAllLabel = By.xpath("//label[@for='chkg23PriorAuthorizationProcessAll']");
	public By priorAuthorizationGenerateAddLabel = By.xpath("//label[@for='chkg23PriorAuthorizationGenerateAdd']");

	// Special Service

	public void verifyDeleteOnlyAccessToPartnerTypeProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddSpecialServiceInPartnerModule() {

		sleep(3000);

		List<WebElement> newButtons = driver.findElements(newSpecialServiceButton);

		if (newButtons.isEmpty()) {
			System.out.println("New Special Service button is not visible.");
		} else {
			System.out.println("New Special Service button is visible.");
		}
	}

	public void verifyUserCanEditSpecialServiceInPartnerModule() {
		sleep(3000);
		driver.findElement(editSpecialServiceIcon).click();
		sleep(2000);

		WebElement titleField = driver.findElement(specialServiceTitleField);
		titleField.clear();
		titleField.sendKeys("Consultant");

		driver.findElement(saveButton).click();
	}

	public void verifyAddOnlyAccessToSpecialServiceProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyAddOnlyAccessToCustomPartnersProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserWithEditOnlyAccessCanEditSpecialServiceInPartnerModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void openAddSpecialServiceUrl(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/SpecialServices"));
	}

	public void verifyUserCannotEditSpecialServiceInPartnerModule() {

		sleep(3000);

		List<WebElement> editIcons = driver.findElements(editSpecialServiceIcon);

		if (editIcons.isEmpty()) {
			System.out.println("Edit Special Service option is not visible.");
		} else {
			System.out.println("Edit Special Service option is visible.");
		}
	}

	public void verifyUserCanAddSpecialServiceInPartnerModule() {

		sleep(3000);

		driver.findElement(newSpecialServiceButton).click();
		sleep(2000);

		WebElement titleField = driver.findElement(specialServiceTitleField);
		titleField.sendKeys("Consultant");

		driver.findElement(saveButton).click();
	}

	// Partner Type
	public void verifyUserCannotAddOrEditPartnerTypeInPartnerModule() {

		sleep(3000);

		List<WebElement> newButton = driver.findElements(newPartnerTypeButton);

		if (newButton.isEmpty()) {
			System.out.println("New Partner Type button is not visible.");
		} else {
			System.out.println("New Partner Type button is visible.");
		}

		driver.findElement(bucketDropdownIcon).click();
		sleep(2000);

		List<WebElement> editElements = driver.findElements(editOption);

		if (editElements.isEmpty()) {
			System.out.println("Edit option is not visible.");
		} else {
			System.out.println("Edit option is visible.");
		}
	}

	public void verifyUserCanDeletePartnerTypeInPartnerModule() {
		sleep(3000);
		driver.findElement(bucketDropdownIcon).click();
		sleep(2000);

		driver.findElement(deleteOption).click();
		sleep(2000);

		driver.findElement(confirmDeleteButton).click();
	}

	public void verifyUserCannotAddOrDeletePartnerTypeInPartnerModule() {
		sleep(3000);
		List<WebElement> newButton = driver.findElements(newPartnerTypeButton);

		if (newButton.isEmpty()) {
			System.out.println("New Partner Type button is not visible.");
		} else {
			System.out.println("New Partner Type button is visible.");
		}

		driver.findElement(bucketDropdownIcon).click();
		sleep(2000);

		List<WebElement> deleteElements = driver.findElements(deleteOption);

		if (deleteElements.isEmpty()) {
			System.out.println("Delete option is not visible.");
		} else {
			System.out.println("Delete option is visible.");
		}
	}

	public void verifyUserCanEditPartnerTypeInPartnerModule() {

		sleep(3000);

		driver.findElement(bucketDropdownIcon).click();
		sleep(2000);

		driver.findElement(editOption).click();
		sleep(2000);

		WebElement nameField = driver.findElement(partnerTypeNameField);
		nameField.clear();
		nameField.sendKeys("ClinicalProvider");

		WebElement labelField = driver.findElement(partnerTypeLabelField);
		labelField.clear();
		labelField.sendKeys("Clinical Provider");

		driver.findElement(saveButton).click();
	}

	public void verifyUserWithEditOnlyAccessCanEditPartnerTypeInPartnerModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrDeletePartnerTypeInPartnerModule() {
		sleep(3000);
		driver.findElement(bucketDropdownIcon).click();
		sleep(2000);
		List<WebElement> editElements = driver.findElements(editOption);
		List<WebElement> deleteElements = driver.findElements(deleteOption);
		if (editElements.isEmpty() && deleteElements.isEmpty()) {
			System.out.println("Edit and Delete options are not visible.");
		} else {
			System.out.println("Edit or Delete option is visible.");
		}
	}

	public void openAddPartnerTypeUrl(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PartnerTypes"));
	}

	public void verifyUserCanAddPartnerTypeInPartnerModule() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.elementToBeClickable(newPartnerTypeButton)).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerTypeNameField)).sendKeys("ClinicalProvider");

		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerTypeLabelField)).sendKeys("Clinical Provider");

		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void testAddAccessOnlyForPartnerType() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Audit View
	public void verifyUserCannotViewGeneralAuditViewInPartnerModule() {
		sleep(3000);
		List<WebElement> errorHeaders = driver.findElements(errorHeader);

		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	public partnerpage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void verifyNoAccessToGeneralAuditView() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCanViewGeneralAuditViewInPartnerModule() {
		sleep(3000);
		assertElementPresent(createdByColumn);
		assertElementPresent(createdDateColumn);
	}

	// Profile Page
	public void openfullGeneralAuditViewUrl(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
	}

	public void openPartnerProfilesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Profiles"));
	}

	public void clickFilterButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(profilefilterButton)).click();
	}

	public void enterProfileName() {
		enterProfileName(Hooks.prop.getProperty("profile.name.value"));
	}

	public void enterProfileName(String profileName) {
		WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(profileNameInput));
		input.clear();
		input.sendKeys(profileName);
	}

	public void clickSearchButton() {
		wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
	}

	public void clickActionMenu() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(actionMenu)).click();
	}

	public void clickEditButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(editButton)).click();
	}

	public void ToPartnerModuleGeneral() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void clickSubmitButton() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	}

	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	// ==== Utility Methods ====
	public void assertElementPresent(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (TimeoutException e) {
			Assert.fail("Element not present after wait: " + locator.toString());
		}
	}
}
