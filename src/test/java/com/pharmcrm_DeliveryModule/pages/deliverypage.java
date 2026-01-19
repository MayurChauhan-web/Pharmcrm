package com.pharmcrm_DeliveryModule.pages;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class deliverypage {


	// Logistic Company
	By logisticAllLabel = By.xpath("//label[@for='chkg04LogisticAll']");
	By logisticAddLabel = By.xpath("//label[@for='chkg04LogisticAdd']");
	private By newLogisticCompanyButton = By.xpath("//span[normalize-space()='New Logistic Company']");
	private By logisticNameInput = By.id("LogisticCompany_Name");
	private By deliveryRadioButton = By.id("rbtnDelivery");
	private By logisticsubmitButton = By
			.xpath("//button[@class='btn btn-primary waves-effect waves-light' and normalize-space()='Submit']");
	By logisticEditLabel = By.xpath("//label[@for='chkg04LogisticEdit']");
	By logisticDeleteLabel = By.xpath("//label[@for='chkg04LogisticDelete']");

	// Delivery Distances
	By deliveryDistancesAllLabel = By.xpath("//label[@for='chkg04DeliveryDistancesAll']");
	By deliveryDistancesAddLabel = By.xpath("//label[@for='chkg04DeliveryDistancesAdd']");
	private By newDeliveryDistanceButton = By.xpath("//span[normalize-space()='New Delivery Distance']");
	private By zipCodeInput = By.id("DeliveryDistance_ZipCode");
	private By cityInput = By.id("DeliveryDistance_City");
	private By countyInput = By.id("DeliveryDistance_County");
	private By radiusInput = By.id("DeliveryDistance_Radius");
	private By DeliveryDistancesaveButton = By.id("btnSave");
	private By firstRowActionMenu = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	private By editOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[contains(text(),'Edit')]");
	private By deleteOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[contains(text(),'Delete')]");
	By deliveryDistancesEditLabel = By.xpath("//label[@for='chkg04DeliveryDistancesEdit']");
	By deliveryDistancesDeleteLabel = By.xpath("//label[@for='chkg04DeliveryDistancesDelete']");

	// Package Restriction
	By packageRestrictionAllLabel = By.xpath("//label[@for='chkg45PackageRestrictionAll']");
	By deletePackageRestrictionPlanLabel = By.xpath("//label[normalize-space()='Delete Package Restriction Plan']");
	By deletePackageRestrictionStateLabel = By.xpath("//label[normalize-space()='Delete Package Restriction State']");
	By packageRestrictionAddLabel = By.xpath("//label[@for='chkg45PackageRestrictionAdd']");
	By packageSettingAllLabel = By.xpath("//label[@for='chkg18PackageSettingAll']");
	private By errorHeader = By.xpath("//h2[normalize-space()='Error']");
	private By planInput = By.id("Plan");
	private By restrictionOption = By.xpath("//input[@value='2']");
	private By planDropdownToggle = By.xpath("//a[@id='btnPlan']//*[name()='svg']");
	private By packageRestrictionsaveButton = By.xpath("//button[@id='btnSave']");
	private By firstPlanDeleteIcon = By.xpath("//tbody/tr[1]/td[3]/div[1]/a[1]/img[1]");
	private By deleteConfirmButton = By.id("btnDeleteConfirmRestictedPlan");
	private By firstStateDeleteIcon = By.xpath("//tbody/tr[1]/td[2]/div[1]/a[1]/img[1]");
	private By deleteConfirmStateButton = By.id("btnDeleteConfirmRestictedState");

	// Package Setting
	By saveButton = By.id("btnSave");

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
	public By updatedByColumn = By.xpath("//th[normalize-space()='Updated By']");
	public By updatedDateColumn = By.xpath("//th[normalize-space()='Updated Date']");

	// General
	public By deliveryAuditViewCheckboxLabel = By.xpath("//label[@for='chkg37DeliveryAuditView']");

	private WebDriver driver;
	private WebDriverWait wait;

	public void openLogisticCompanyPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/LogisticCompanies"));
	}

	// Logistic Company

	public void createProfileWithViewEditAccessLogisticCompany() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement packageRestrictionAll = wait.until(ExpectedConditions.elementToBeClickable(logisticAllLabel));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement deletePackageRestrictionState = wait
				.until(ExpectedConditions.elementToBeClickable(logisticEditLabel));
		deletePackageRestrictionState.click();

	}

	public void createProfileWithViewDeleteAccessLogisticCompany() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement packageRestrictionAll = wait.until(ExpectedConditions.elementToBeClickable(logisticAllLabel));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement deletePackageRestrictionState = wait
				.until(ExpectedConditions.elementToBeClickable(logisticDeleteLabel));
		deletePackageRestrictionState.click();

	}

	public void verifyUserCannotAddOrDeleteLogisticCompany() {
		sleep(2000);
		Assert.assertTrue("New Logistic Company button should not be visible",
				driver.findElements(newLogisticCompanyButton).isEmpty());
		sleep(2000);
		clickWhenClickable(firstRowActionMenu);
		sleep(2000);
		Assert.assertTrue("Delete option should not be visible", driver.findElements(deleteOption).isEmpty());
	}

	public void verifyUserCannotEditOrDeleteLogisticCompany() {
		sleep(2000);
		clickWhenClickable(firstRowActionMenu);
		sleep(2000);
		Assert.assertTrue("Edit option should not be visible", driver.findElements(editOption).isEmpty());
		Assert.assertTrue("Delete option should not be visible", driver.findElements(deleteOption).isEmpty());
	}

	public void verifyUserCannotAddOrEditLogisticCompany() {
		sleep(2000);
		Assert.assertTrue("New Logistic Company button should not be visible",
				driver.findElements(newLogisticCompanyButton).isEmpty());
		sleep(2000);
		clickWhenClickable(firstRowActionMenu);
		sleep(2000);
		Assert.assertTrue("Edit option should not be visible", driver.findElements(editOption).isEmpty());
	}

	public void userCanViewAndDeleteLogisticCompany() {
		sleep(2000);
		clickWhenClickable(firstRowActionMenu);
		sleep(2000);
		clickWhenClickable(deleteOption);
		sleep(2000);
		clickWhenClickable(deleteConfirmButton);
		sleep(2000);
	}

	public void userCanViewAndEditLogisticCompany() {
		sleep(2000);
		clickWhenClickable(firstRowActionMenu);
		sleep(2000);
		clickWhenClickable(editOption);
		sleep(2000);
		waitAndSendKeys(logisticNameInput, "Ryder Logistics");
		sleep(2000);
		clickWhenClickable(deliveryRadioButton);
		sleep(2000);
		clickWhenClickable(logisticsubmitButton);
		sleep(2000);
	}

	public void userCanViewAndAddLogisticCompany() {
		sleep(2000);
		clickWhenClickable(newLogisticCompanyButton);
		sleep(2000);
		waitAndSendKeys(logisticNameInput, "Ryder Logistics");
		sleep(2000);
		clickWhenClickable(deliveryRadioButton);
		sleep(2000);
		clickWhenClickable(logisticsubmitButton);
		sleep(2000);
	}

	public void createProfileWithViewAddAccessLogisticCompany() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement packageRestrictionAll = wait.until(ExpectedConditions.elementToBeClickable(logisticAllLabel));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement deletePackageRestrictionState = wait
				.until(ExpectedConditions.elementToBeClickable(logisticAddLabel));
		deletePackageRestrictionState.click();

	}
	// Delivery Distances

	public void viewAndDeleteDeliveryDistance() {
		sleep(2000);
		clickWhenClickable(firstRowActionMenu);
		sleep(2000);
		clickWhenClickable(deleteOption);
		sleep(2000);
		clickWhenClickable(deleteConfirmButton);

	}

	public void verifyUserCannotAddOrEditDeliveryDistances() {
		sleep(2000);
		Assert.assertTrue("New Delivery Distance button should not be visible",
				driver.findElements(newDeliveryDistanceButton).isEmpty());
		sleep(2000);
		clickWhenClickable(firstRowActionMenu);
		sleep(2000);
		Assert.assertTrue("Edit option should not be visible", driver.findElements(editOption).isEmpty());
	}

	public void verifyUserCannotAddOrDeleteDeliveryDistances() {
		sleep(2000);
		Assert.assertTrue("New Delivery Distance button should not be visible",
				driver.findElements(newDeliveryDistanceButton).isEmpty());
		sleep(2000);
		clickWhenClickable(firstRowActionMenu);
		sleep(2000);
		Assert.assertTrue("Delete option should not be visible", driver.findElements(deleteOption).isEmpty());
	}

	public void viewAndEditDeliveryDistances() {
		sleep(2000);
		clickWhenClickable(firstRowActionMenu);
		sleep(2000);
		clickWhenClickable(editOption);
		sleep(2000);
		waitAndSendKeys(zipCodeInput, "10001");
		waitAndSendKeys(cityInput, "New York");
		waitAndSendKeys(countyInput, "USA");
		waitAndSendKeys(radiusInput, "10");
		clickWhenClickable(saveButton);

	}

	public void createProfileWithViewDeleteAccessDeliveryDistances() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement packageRestrictionAll = wait
				.until(ExpectedConditions.elementToBeClickable(deliveryDistancesAllLabel));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement deletePackageRestrictionState = wait
				.until(ExpectedConditions.elementToBeClickable(deliveryDistancesDeleteLabel));
		deletePackageRestrictionState.click();

	}

	public void createDeliveryDistancesViewEditProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement packageRestrictionAll = wait
				.until(ExpectedConditions.elementToBeClickable(deliveryDistancesAllLabel));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement deletePackageRestrictionState = wait
				.until(ExpectedConditions.elementToBeClickable(deliveryDistancesEditLabel));
		deletePackageRestrictionState.click();

	}

	public void createProfileWithViewAddAccessDeliveryLogisticCompany() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement packageRestrictionAll = wait
				.until(ExpectedConditions.elementToBeClickable(deliveryDistancesAllLabel));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement deletePackageRestrictionState = wait
				.until(ExpectedConditions.elementToBeClickable(deliveryDistancesAddLabel));
		deletePackageRestrictionState.click();

	}

	public void verifyUserCannotEditOrDeleteDeliveryDistances() {
		sleep(2000);
		clickWhenClickable(firstRowActionMenu);
		sleep(2000);
		Assert.assertTrue("Edit option should not be visible", driver.findElements(editOption).isEmpty());
		Assert.assertTrue("Delete option should not be visible", driver.findElements(deleteOption).isEmpty());
	}

	public void addDeliveryDistance() {
		sleep(3000);
		clickWhenClickable(newDeliveryDistanceButton);
		sleep(3000);
		waitAndSendKeys(zipCodeInput, "10001");
		waitAndSendKeys(cityInput, "New York");
		waitAndSendKeys(countyInput, "USA");
		waitAndSendKeys(radiusInput, "10");
		sleep(2000);
		clickWhenClickable(DeliveryDistancesaveButton);
	}

	public void openDeliveryDistancesPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryDistances"));
	}
	// Package Restriction

	public void openPackageRestrictionPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PackageRestriction"));
	}

	public void deleteFirstPackageRestrictionState() {
		sleep(2000);
		clickWhenClickable(firstStateDeleteIcon);
		sleep(2000);
		clickWhenClickable(deleteConfirmStateButton);
		sleep(2000);
	}

	public void deleteFirstPackageRestrictionPlan() {
		sleep(2000);
		clickWhenClickable(firstPlanDeleteIcon);
		sleep(2000);
		clickWhenClickable(deleteConfirmButton);
		sleep(2000);
	}

	public void verifyUserCanViewAndAddPackageRestriction() {
		sleep(2000);
		waitAndSendKeys(planInput, "Call Patient");
		sleep(2000);
		clickWhenClickable(restrictionOption);
		sleep(2000);
		clickWhenClickable(planDropdownToggle);
		sleep(2000);
		clickWhenClickable(packageRestrictionsaveButton);
		sleep(2000);

	}

	public void createProfileWithViewDeleteAccessToDeliveryPackageRestrictionState() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement packageRestrictionAll = wait
				.until(ExpectedConditions.elementToBeClickable(packageRestrictionAllLabel));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement deletePackageRestrictionState = wait
				.until(ExpectedConditions.elementToBeClickable(deletePackageRestrictionStateLabel));
		deletePackageRestrictionState.click();

	}

	public void createProfileWithViewDeleteAccessToDeliveryPackageRestrictionPlan() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement packageRestrictionAll = wait
				.until(ExpectedConditions.elementToBeClickable(packageRestrictionAllLabel));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement deletePackageRestrictionPlan = wait
				.until(ExpectedConditions.elementToBeClickable(deletePackageRestrictionPlanLabel));
		deletePackageRestrictionPlan.click();
	}

	public void createProfileWithViewAndAddPackageRestrictionAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement packageRestrictionAll = wait
				.until(ExpectedConditions.elementToBeClickable(packageRestrictionAllLabel));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement packageRestrictionAdd = wait
				.until(ExpectedConditions.elementToBeClickable(packageRestrictionAddLabel));
		packageRestrictionAdd.click();

	}

	// Package Setting
	public void configureUpdateOnlyAccessForDeliveryPackageSettings() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();

	}

	public void createProfileWithoutPackageSettingsAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement packageSettingAll = wait.until(ExpectedConditions.elementToBeClickable(packageSettingAllLabel));
		packageSettingAll.click();
	}

	public void theUserShouldBeAbleToUpdatePackageSettingsInDeliveryModule() {
		sleep(2000);
		WebElement saveBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(saveButton));
		sleep(2000);
		Assert.assertTrue("Save button is not displayed", saveBtn.isDisplayed());
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();

	}

	public void userCannotViewOrUpdateDeliveryPackageSettings() {
		sleep(2000);
		wait.until(driver -> !driver.findElements(errorHeader).isEmpty() || driver.getPageSource().length() > 0);
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(errorHeader);
		sleep(2000);
		Assert.assertTrue("User should NOT be able to view or update Package Settings", !errorHeaders.isEmpty());
	}

	// General
	public void verifyGeneralAuditViewColumnsAreNotVisible() {

		wait.until(ExpectedConditions.invisibilityOfElementLocated(updatedByColumn));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(updatedDateColumn));
	}

	public void verifyGeneralAuditViewColumns() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(updatedByColumn));
		wait.until(ExpectedConditions.visibilityOfElementLocated(updatedDateColumn));
	}

	// ProfilePage
	public void clickFilterButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(profilefilterButton)).click();
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

	public void createViewOnlyDeliveryAuditProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();

	}

	public void createNoAccessProfileForDeliveryGeneralAuditView() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement deliveryAuditViewCheckbox = wait
				.until(ExpectedConditions.elementToBeClickable(deliveryAuditViewCheckboxLabel));
		deliveryAuditViewCheckbox.click();

	}

	public deliverypage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void clickSubmitButton() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	}

	public void openDeliveryProfilesPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Profiles"));
	}

	public void openPackageSettingsPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PackageSetting"));
	}

	public void openDeliveryPackagesPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Packages"));
	}

	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	public void clickWhenClickable(By locator) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

		try {
			element.click();
		} catch (ElementNotInteractableException e) {
			System.out.println("Normal click failed for: " + locator + " → trying JS click");
			jsClick(element);
		}
	}

	private void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	private void waitAndSendKeys(By locator, String value) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		element.clear();
		element.sendKeys(value);
	}
}
