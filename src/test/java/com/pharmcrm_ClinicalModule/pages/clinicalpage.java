package com.pharmcrm_ClinicalModule.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

public class clinicalpage {

	private WebDriver driver;
	private WebDriverWait wait;

	// Community Resource
	private By selectAllCommunityResourceCheckbox = By.xpath("//label[@for='chkg26CommunityResourceAll']");
	private By addCommunityResourceCheckbox = By.xpath("//label[@for='chkg26CommunityResourceAdd']");

	private By kebabMenuBtn = By.xpath("(//button[@id='bucketDrop']/i)[1]");

	private By CommunityResourceeditOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");

	private By CommunityResourcedeleteOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");

	private By newCommunityResourceButton = By.xpath("//span[normalize-space()='New Community Resource']");
	private By communityResourceNameInput = By.id("CommunityResource_Name");

	// Barriers
	private By newBarrierButton = By.xpath("//span[normalize-space()='New Barriers']");
	private By barrierNameInput = By.id("Barrier_Name");
	private By selectAllBarriersCheckbox = By.xpath("//label[@for='chkg26BarrierAll']");
	private By addBarriersCheckbox = By.xpath("//label[@for='chkg26BarrierAdd']");

	// Goals Of Treatment
	private By selectAllGoalsOfTreatmentCheckbox = By.xpath("//label[@for='chkg26GoalsOfTreatmentAll']");

	private By addGoalsOfTreatmentCheckbox = By.xpath("//label[@for='chkg26GoalsOfTreatmentAdd']");

	private By goalInput = By.id("GoalsOfTreatment_Goal1");
	private By newGoalsButton = By.xpath("//span[normalize-space()='New Goals Of Treatment']");
	private By diseaseNameInput = By.id("GoalsOfTreatment_DiseaseName");

	// Prior Authorization Types
	private By selectAllPATypesCheckbox = By.xpath("//label[@for='chkg24PATypesAll']");
	private By addPATypesCheckbox = By.xpath("//label[@for='chkg24PATypesAdd']");

	private By confirmDeleteButton = By.id("btnDeleteConfirm");

	private By newPriorAuthBtn = By.xpath("//span[normalize-space()='New Prior Authorization Type']");

	private By rxHealthCardCheckbox = By.id("PriorAuthorizationType_IsRxHealthCard");

	public By newPriorAuthButton = By.xpath("//span[normalize-space()='New Prior Authorization Type']");
	public By priorAuthNameInput = By.id("PriorAuthorizationType_Name");
	public By saveButton = By.id("btnSave");
	private By actionMenuIcon = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	private By editOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[contains(text(),'Edit')]");
	private By deleteOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[contains(text(),'Delete')]");

	// Component Information
	public By btnSave = By.id("btnSave");
	public By errorHeader = By.xpath("//h2[normalize-space()='Error']");

	// Audit View
	public static final By CREATED_DATE_COLUMN = By.xpath("//a[normalize-space()='Created Date']");
	public static final By UPDATED_BY_COLUMN = By.xpath("//a[normalize-space()='Updated By']");

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
	public clinicalpage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// Audit View
	public void openClinicalPriorAuthorizationsPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalPriorAuthorizations"));
	}

	public void verifyGeneralAuditViewSettings() {
		sleep(2000);
		Assert.assertTrue("Created Date column is not visible",
				wait.until(ExpectedConditions.visibilityOfElementLocated(CREATED_DATE_COLUMN)).isDisplayed());
		sleep(2000);
		Assert.assertTrue("Updated By column is not visible",
				wait.until(ExpectedConditions.visibilityOfElementLocated(UPDATED_BY_COLUMN)).isDisplayed());
	}

	public void cannotViewGeneralAuditViewInClinicalModule() {
		try {
			boolean createdDateVisible = driver.findElements(CREATED_DATE_COLUMN).size() > 0;
			Assert.assertFalse("Created Date column should not be visible", createdDateVisible);

			boolean updatedByVisible = driver.findElements(UPDATED_BY_COLUMN).size() > 0;
			Assert.assertFalse("Updated By column should not be visible", updatedByVisible);

		} catch (Exception e) {
			System.out.println("Verified General Audit View settings are not visible.");
		}
	}

	public void createClinicalProfileNoAuditView() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Profile Page
	public void openClinicalProfilesPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Profiles"));
	}

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

	public void createViewOnlyClinicalGeneralAuditProfile() {
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

	// Component Information
	public void createUpdateOnlyProfileForClinicalComponent() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createNoUpdateProfileForClinicalComponent() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void updateComponentInfoTest() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(btnSave)).click();
	}

	public void openclinicalComponentPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ClinicalSOAPComponentSetting"));
	}

	public boolean cannotUpdateClinicalComponent() {
		List<WebElement> errors = driver.findElements(errorHeader);
		if (!errors.isEmpty()) {
			System.out.println("Access denied: User cannot update this page.");
			return true;
		} else {
			System.out.println("Page loaded successfully, user can access it.");
			return false;
		}
	}

	// Prior Authorization Types

	public void cannotAddOrEditPriorAuthorizationTypes() {

		Assert.assertTrue("New Prior Authorization Type button should not be visible",
				driver.findElements(newPriorAuthBtn).isEmpty());

		wait.until(ExpectedConditions.elementToBeClickable(actionMenuIcon)).click();

		Assert.assertTrue("Edit option should not be visible", driver.findElements(editOption).isEmpty());
	}

	public void canViewAndDeletePriorAuthorizationTypes() {

		wait.until(ExpectedConditions.elementToBeClickable(actionMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void createClinicalPriorAuthTypesViewDeleteProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void cannotAddOrDeletePriorAuthorizationTypes() {

		Assert.assertTrue("New Prior Authorization Type button should not be visible",
				driver.findElements(newPriorAuthBtn).isEmpty());

		wait.until(ExpectedConditions.elementToBeClickable(actionMenuIcon)).click();

		Assert.assertTrue("Delete option should not be visible", driver.findElements(deleteOption).isEmpty());
	}

	public void canViewAndEditPriorAuthorizationTypes() {

		wait.until(ExpectedConditions.elementToBeClickable(actionMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();

		wait.until(ExpectedConditions.elementToBeClickable(rxHealthCardCheckbox)).click();
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void createViewAddProfileForPriorAuthTypes() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement selectAll = wait.until(ExpectedConditions.elementToBeClickable(selectAllPATypesCheckbox));
		selectAll.click();
		sleep(2000);
		WebElement addPA = wait.until(ExpectedConditions.elementToBeClickable(addPATypesCheckbox));
		addPA.click();

	}

	public void createClinicalPriorAuthTypesViewEditProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void addPriorAuthorizationType() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(newPriorAuthButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(priorAuthNameInput)).sendKeys("PA Type A");
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void cannotEditOrDeletePriorAuthorizationType() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuIcon)).click();
		sleep(2000);
		Assert.assertTrue("Edit option should not be visible", driver.findElements(editOption).isEmpty());
		Assert.assertTrue("Delete option should not be visible", driver.findElements(deleteOption).isEmpty());
	}

	// Goals Of Treatment

	public void cannotAddOrDeleteGoalsOfTreatment() {

		Assert.assertTrue("New Goals Of Treatment button should not be visible",
				driver.findElements(newGoalsButton).isEmpty());

		wait.until(ExpectedConditions.elementToBeClickable(actionMenuIcon)).click();

		Assert.assertTrue("Delete option should not be visible", driver.findElements(deleteOption).isEmpty());
	}

	public void editGoalsOfTreatment() {

		wait.until(ExpectedConditions.elementToBeClickable(actionMenuIcon)).click();

		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(goalInput)).clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(goalInput)).sendKeys("Diabetes Mellitus");

		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void cannotEditOrDeleteGoalsOfTreatment() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuIcon)).click();
		sleep(2000);
		Assert.assertTrue("Edit option should not be visible", driver.findElements(editOption).isEmpty());
		Assert.assertTrue("Delete option should not be visible", driver.findElements(deleteOption).isEmpty());
	}

	public void cannotAddOrEditGoalsOfTreatment() {

		Assert.assertTrue("New Goals Of Treatment button should not be visible",
				driver.findElements(newGoalsButton).isEmpty());

		wait.until(ExpectedConditions.elementToBeClickable(actionMenuIcon)).click();

		Assert.assertTrue("Edit option should not be visible", driver.findElements(editOption).isEmpty());
	}

	public void canViewAndDeleteGoalsOfTreatment() {

		wait.until(ExpectedConditions.elementToBeClickable(actionMenuIcon)).click();

		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();

		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void createClinicalGoalsOfTreatmentViewDeleteProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createClinicalGoalsOfTreatmentViewEditProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createClinicalGoalsOfTreatmentViewAddProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement selectAllGoals = wait
				.until(ExpectedConditions.elementToBeClickable(selectAllGoalsOfTreatmentCheckbox));
		selectAllGoals.click();
		sleep(2000);
		WebElement addGoals = wait.until(ExpectedConditions.elementToBeClickable(addGoalsOfTreatmentCheckbox));
		addGoals.click();
		sleep(2000);

	}

	public void canViewAndAddGoalsOfTreatment() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(newGoalsButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(diseaseNameInput)).sendKeys("Diabetes Mellitus");
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	// Barriers

	public void cannotAddOrEditBarriers() {

		Assert.assertTrue("New Barriers button should not be visible", driver.findElements(newBarrierButton).isEmpty());

		wait.until(ExpectedConditions.elementToBeClickable(actionMenuIcon)).click();

		Assert.assertTrue("Edit option should not be visible", driver.findElements(editOption).isEmpty());
	}

	public void canDeleteBarriers() {

		wait.until(ExpectedConditions.elementToBeClickable(actionMenuIcon)).click();

		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();

		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void cannotAddOrDeleteBarriers() {

		Assert.assertTrue("New Barriers button should not be visible", driver.findElements(newBarrierButton).isEmpty());

		wait.until(ExpectedConditions.elementToBeClickable(actionMenuIcon)).click();

		Assert.assertTrue("Delete option should not be visible", driver.findElements(deleteOption).isEmpty());
	}

	public void editBarrier() {

		wait.until(ExpectedConditions.elementToBeClickable(actionMenuIcon)).click();

		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(barrierNameInput)).clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(barrierNameInput)).sendKeys("Transportation");

		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void cannotEditOrDeleteBarriers() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuIcon)).click();
		sleep(2000);
		Assert.assertTrue("Edit option should not be visible", driver.findElements(editOption).isEmpty());
		Assert.assertTrue("Delete option should not be visible", driver.findElements(deleteOption).isEmpty());
	}

	public void canAddBarriers() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(newBarrierButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(barrierNameInput)).sendKeys("Transportation");
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void createCommunityResourceAddProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement selectAllCommunity = wait
				.until(ExpectedConditions.elementToBeClickable(selectAllCommunityResourceCheckbox));
		selectAllCommunity.click();
		sleep(2000);
		WebElement addCommunity = wait.until(ExpectedConditions.elementToBeClickable(addCommunityResourceCheckbox));
		addCommunity.click();
		sleep(2000);

	}

	public void createClinicalBarriersDeleteProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createClinicalBarriersEditProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createClinicalBarriersAddProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement selectAllBarriers = wait.until(ExpectedConditions.elementToBeClickable(selectAllBarriersCheckbox));
		selectAllBarriers.click();
		sleep(2000);
		WebElement addBarriers = wait.until(ExpectedConditions.elementToBeClickable(addBarriersCheckbox));
		addBarriers.click();
		sleep(2000);

	}

	// Community Resource

	public void cannotAddOrEditCommunityResourceTest() {

		Assert.assertTrue(driver.findElements(newCommunityResourceButton).isEmpty());

		driver.findElement(actionMenu).click();

		Assert.assertTrue(driver.findElements(editOption).isEmpty());
	}

	public void verifyDeleteCommunityResourceAccess() {
		driver.findElement(actionMenu).click();
		driver.findElement(deleteOption).click();
		driver.findElement(confirmDeleteButton).click();
	}

	public void createDeleteOnlyCommunityResourceProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createEditOnlyClinicalCommunityResourceProfileTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddOrDeleteCommunityResource() {

		Assert.assertTrue(driver.findElements(newCommunityResourceButton).isEmpty());

		driver.findElement(actionMenu).click();

		Assert.assertTrue(driver.findElements(deleteOption).isEmpty());
	}

	public void editCommunityResourceTest() {
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(communityResourceNameInput)).clear();
		driver.findElement(communityResourceNameInput).sendKeys("Transportation Services");
		driver.findElement(saveButton).click();
	}

	public void verifyUserCannotEditOrDeleteGoalsOfTreatment() {
		sleep(3000);
		clickWhenClickable(kebabMenuBtn);
		sleep(2000);
		assertElementNotPresent(CommunityResourceeditOption);
		assertElementNotPresent(CommunityResourcedeleteOption);
	}

	public void canAddCommunityResource() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(newCommunityResourceButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(communityResourceNameInput))
				.sendKeys("Transportation Services");
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	// ==== Utility Methods ====
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

	public void assertElementNotPresent(By locator) {
		List<WebElement> elements = driver.findElements(locator);
		Assert.assertTrue("Element should not be present: " + locator.toString(), elements.isEmpty());
	}

}
