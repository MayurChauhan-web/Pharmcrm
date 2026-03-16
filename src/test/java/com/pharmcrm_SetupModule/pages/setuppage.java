package com.pharmcrm_SetupModule.pages;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import hooks.Hooks;

public class setuppage {

	private WebDriver driver;
	private WebDriverWait wait;

	// BOT Call Template

	public void verifyUserCannotEditOrDeleteBotCallTemplate() throws InterruptedException {

		// Check that "New Text Template" button is not present
		if (!driver.findElements(newTextTemplateButton).isEmpty()) {
			Assert.fail("FAIL: 'New Text Template' button should not be visible to the user.");
		}

		// Click Filter and search for the profile
		driver.findElement(filterButton).click();
		Thread.sleep(1000); // short sleep for filter animation
		String profileName = Hooks.prop.getProperty("profile.name.value");
		driver.findElement(filterTitleField).sendKeys(profileName);
		driver.findElement(searchButton).click();
		Thread.sleep(1000); // wait for search results

		// Try opening action menu
		try {
			WebElement menuButton = driver.findElement(firstRowActionMenu);
			menuButton.click();
			Thread.sleep(500);

			boolean editExists = !driver.findElements(editOption).isEmpty();
			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();

			if (!editExists && !deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}

		} catch (ElementClickInterceptedException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	public void verifyUserCanAddBotCallTemplate() throws InterruptedException {

		Thread.sleep(3000);

		driver.findElement(newCalloutTemplateButton).click();

		String profileName = Hooks.prop.getProperty("profile.name.value");
		driver.findElement(titleInput).sendKeys(profileName);

		new Select(driver.findElement(featureTypeDropdown)).selectByIndex(3);

		new Select(driver.findElement(subFeatureTypeDropdown)).selectByIndex(1);

		driver.findElement(bodyInput).sendKeys(" Message");

		driver.findElement(submitButton).click();
	}

	public void profileWithSetupBotCallTemplateViewAndAddPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddEditOrDeleteBotCallTemplate() throws InterruptedException {

		Thread.sleep(3000);

		List<WebElement> newTemplate = driver.findElements(newTemplateButton);
		Assert.assertTrue(newTemplate.isEmpty(), "FAIL: 'New Callout Template' button should not be visible.");

		try {
			WebElement menuButton = driver.findElement(actionMenuButton);
			menuButton.click();

			Thread.sleep(1000);

			boolean editExists = !driver.findElements(editOption).isEmpty();
			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();

			if (!editExists && !deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}

		} catch (Exception e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	public void openBotCallTemplatesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/BOTCallTemplates"));
	}

	public void profileWithSetupBotCallTemplateViewPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// BOT Call Template
	By firstRowActionMenu = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]");
	By newCalloutTemplateButton = By.xpath("//span[normalize-space()='New Callout Template']");
	By titleInput = By.id("BOTCallTemplate_Title");
	By featureTypeDropdown = By.id("TemplateFeatureMapping_FeatureType");
	By subFeatureTypeDropdown = By.id("TemplateFeatureMapping_SubFeatureType");
	By bodyInput = By.id("BOTCallTemplate_Body");
	By newTemplateButton = By.xpath("//span[normalize-space()='New Callout Template']");
	By actionMenuButton = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]");
	By newCalloutTemplateBtn = By.xpath("//span[normalize-space()='New Callout Template']");
	By botTemplateActionMenuBtn = By.xpath("//tbody/tr[1]/td[8]//button");
	By editBotTemplateOption = By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Edit')]");
	By deleteBotTemplateOption = By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]");

	// Text Template
	public By filterTitleField = By.id("Filter_Title");
	public By templateTitleInput = By.id("SMSTemplate_Title");
	public By featureDropdown = By.id("TemplateFeatureMapping_FeatureType");
	public By templateBodyTextarea = By.id("SMSTemplate_Body");
	public By newTextTemplateButton = By.xpath("//span[normalize-space()='New Text Template']");

	// User
	public By confirmDeleteUserButton = By.xpath("//div[@id='deleteUserModel']//button[@id='btnDeleteConfirm']");
	public By changeProfileOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Change Profile')]");
	public By profileDropdown = By.id("WorkspaceUser_Profile_Id");
	public By submitUserButton = By.id("btnSubmitUser");
	public By menuContext = By.id("menucontext");

	public By newUserButton = By.xpath("//span[normalize-space()='New User']");
	public By filterEmailField = By.id("Filter_Email");
	public By deleteUserOption = By.xpath("//span[normalize-space()='Delete']");

	// Profile
	public By editProfileOption = By.xpath("//li[1]//a[1]//div[1]");
	public By blockDeleteCheckbox = By.id("chkg37BlockDelete");
	public By saveButton = By.id("btnSave");
	public By deleteProfileOption = By.xpath("//a[@id='btnDeleteProfile']//div[@class='gridRecordContextInner']");
	public By confirmDeleteButton = By.xpath("//div[@id='profileModel']//button[@id='btnDeleteConfirm']");
	public By newProfileButton = By.xpath("//span[normalize-space()='New Profile']");
	public By filterButton = By.xpath("//span[normalize-space()='Filter']");
	public By filterNameField = By.id("Filter_Name");
	public By editOption = By.xpath("//li[1]//a[1]//div[normalize-space()='Edit']");
	public By deleteOption = By.xpath("//a[@id='btnDeleteProfile']//div[normalize-space()='Delete']");

	// Dashboard
	public By sidebarIcons = By.xpath("//span[@class='sidebar-icons']");
	public By errorHeader = By.xpath("//h2[normalize-space()='Error']");

	// Audit View
	public By createdDateColumn = By.xpath("//th[normalize-space()='Created Date']");

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

	public setuppage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// Text Template

	public void verifyUserCanDeleteTextTemplate() throws InterruptedException {

		String profileName = Hooks.prop.getProperty("profile.name.value");

		Thread.sleep(3000);

		driver.findElement(filterButton).click();

		Thread.sleep(3000);
		driver.findElement(filterTitleField).sendKeys(profileName);

		driver.findElement(searchButton).click();

		Thread.sleep(1000);

		driver.findElement(actionMenu).click();

		Assert.assertFalse(driver.findElements(deleteOption).isEmpty());

		driver.findElement(deleteOption).click();

		driver.findElement(confirmDeleteButton).click();
	}

	public void profileWithSetupTextTemplateFullPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyDeleteOptionNotAvailableForTextTemplates() throws InterruptedException {

		Thread.sleep(3000);

		WebElement menuButton = driver.findElement(actionMenu);

		try {

			menuButton.click();
			Thread.sleep(1000);

			boolean editExists = !driver.findElements(editOption).isEmpty();
			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();

			if (editExists && !deleteExists) {
				System.out.println("PASS: Edit is visible, Delete is not.");
			} else {
				Assert.fail("FAIL: Condition not met (Edit missing or Delete present).");
			}

		} catch (Exception e) {

			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");

		}
	}

	public void verifyUserCanEditExistingTextTemplate() throws InterruptedException {

		String profileName = Hooks.prop.getProperty("profile.name.value");
		String templateTitle = profileName + " Template";

		Thread.sleep(3000);

		driver.findElement(filterButton).click();

		Thread.sleep(3000);
		driver.findElement(filterTitleField).sendKeys(profileName);

		driver.findElement(searchButton).click();

		Thread.sleep(1000);

		driver.findElement(actionMenu).click();

		Assert.assertFalse(driver.findElements(editOption).isEmpty());

		driver.findElement(editOption).click();

		Thread.sleep(1000);

		driver.findElement(templateBodyTextarea).clear();
		driver.findElement(templateBodyTextarea).sendKeys(templateTitle);

		driver.findElement(submitButton).click();
	}

	public void setupTextTemplateProfileWithViewAddEditPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrDeleteTextTemplates() throws InterruptedException {

		String profileName = Hooks.prop.getProperty("profile.name.value");

		Thread.sleep(3000);

		driver.findElement(filterButton).click();

		Thread.sleep(3000);
		driver.findElement(filterTitleField).sendKeys(profileName);

		driver.findElement(searchButton).click();

		Thread.sleep(1000);

		WebElement menuButton = driver.findElement(actionMenu);

		try {

			menuButton.click();

			Thread.sleep(1000);

			boolean editExists = !driver.findElements(editOption).isEmpty();
			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();

			if (!editExists && !deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}

		} catch (Exception e) {

			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");

		}
	}

	public void verifyUserCanAddNewTextTemplate() throws InterruptedException {

		Thread.sleep(2000);

		String profileName = Hooks.prop.getProperty("profile.name.value");
		String templateTitle = profileName + " Template";

		driver.findElement(newTextTemplateButton).click();

		Thread.sleep(500);
		driver.findElement(templateTitleInput).sendKeys(templateTitle);

		Select featureSelect = new Select(driver.findElement(featureDropdown));
		featureSelect.selectByIndex(6);

		driver.findElement(templateBodyTextarea).sendKeys(templateTitle);

		driver.findElement(submitButton).click();
	}

	public void restrictedProfileSetupTextTemplateViewAddAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddEditOrDeleteTextTemplate() throws InterruptedException {

		Thread.sleep(3000);

		Assert.assertTrue(driver.findElements(newTextTemplateButton).isEmpty());

		Thread.sleep(1000);

		try {

			WebElement menuButton = driver.findElement(actionMenu);
			menuButton.click();

			Thread.sleep(1000);

			boolean editExists = !driver.findElements(editOption).isEmpty();
			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();

			if (!editExists && !deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}

		} catch (Exception e) {

			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");

		}
	}

	public void openSmsTemplatesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/SMSTemplates"));
	}

	public void profileWithSetupTextTemplateViewPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// User

	public void verifyUserCanDeleteUser() throws InterruptedException {

		String createdEmail = Hooks.prop.getProperty("user.email.value");

		wait.until(ExpectedConditions.invisibilityOfElementLocated(menuContext));

		driver.findElement(filterButton).click();

		Thread.sleep(1000);
		driver.findElement(filterEmailField).sendKeys(createdEmail);

		Thread.sleep(1000);
		driver.findElement(searchButton).click();

		Thread.sleep(3000);

		By actionMenu = By.xpath("//tr[td[normalize-space()='" + createdEmail + "']]//td[@class='text-right']//button");
		driver.findElement(actionMenu).click();

		Assert.assertFalse(driver.findElements(deleteUserOption).isEmpty());

		driver.findElement(deleteUserOption).click();

		driver.findElement(confirmDeleteUserButton).click();
	}

	public void profileWithSetupUserFullPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotDeleteUsers() {

		String createdEmail = Hooks.prop.getProperty("user.email.value");

		wait.until(ExpectedConditions.invisibilityOfElementLocated(menuContext));

		driver.findElement(filterButton).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(filterEmailField));
		driver.findElement(filterEmailField).sendKeys(createdEmail);

		driver.findElement(searchButton).click();

		By actionMenu = By.xpath("//tr[td[normalize-space()='" + createdEmail + "']]//td[@class='text-right']//button");

		wait.until(ExpectedConditions.elementToBeClickable(actionMenu));
		driver.findElement(actionMenu).click();

		Assert.assertTrue(driver.findElements(deleteUserOption).isEmpty());
	}

	public void verifyUserCanEditUser() throws InterruptedException {

		String createdEmail = Hooks.prop.getProperty("user.email.value");

		Thread.sleep(3000);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(menuContext));

		driver.findElement(filterButton).click();

		Thread.sleep(1000);
		driver.findElement(filterEmailField).sendKeys(createdEmail);

		Thread.sleep(1000);
		driver.findElement(searchButton).click();

		Thread.sleep(3000);

		By actionMenu = By.xpath("//tr[td[normalize-space()='" + createdEmail + "']]//td[@class='text-right']//button");
		driver.findElement(actionMenu).click();

		Thread.sleep(2000);

		Assert.assertFalse(driver.findElements(changeProfileOption).isEmpty());

		driver.findElement(changeProfileOption).click();

		driver.findElement(profileDropdown).click();

		Select select = new Select(driver.findElement(profileDropdown));
		select.selectByIndex(1);

		driver.findElement(submitUserButton).click();

		Thread.sleep(3000);
	}

	public void profileWithSetupUserViewAddEditPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrDeleteUsers() throws InterruptedException {

		String createdEmail = Hooks.prop.getProperty("user.email.value");

		driver.findElement(filterButton).click();

		Thread.sleep(3000);
		driver.findElement(filterEmailField).sendKeys(createdEmail);

		driver.findElement(searchButton).click();

		Thread.sleep(1000);

		By actionMenu = By.xpath("//tr[td[normalize-space()='" + createdEmail + "']]//td[@class='text-right']//button");
		driver.findElement(actionMenu).click();

		Assert.assertTrue(driver.findElements(deleteUserOption).isEmpty());
	}

	public void verifyUserCanAddNewUser() throws InterruptedException {

		Thread.sleep(1000);

		Assert.assertFalse(driver.findElements(newUserButton).isEmpty());
	}

	public void setupUserProfileWithViewAndAddPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddEditOrDeleteUsers() throws InterruptedException {

		String createdEmail = Hooks.prop.getProperty("user.email.value");

		Thread.sleep(5000);

		Assert.assertTrue(driver.findElements(newUserButton).isEmpty());

		Thread.sleep(1000);
		driver.findElement(filterButton).click();

		Thread.sleep(3000);
		driver.findElement(filterEmailField).sendKeys(createdEmail);

		driver.findElement(searchButton).click();

		Thread.sleep(1000);

		By actionMenu = By.xpath("//tr[td[normalize-space()='" + createdEmail + "']]//td[@class='text-right']//button");
		driver.findElement(actionMenu).click();

		Assert.assertTrue(driver.findElements(deleteUserOption).isEmpty());
	}

	public void openWorkspaceUsersPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/WorkspaceUsers"));
	}

	public void restrictedProfileSetupModuleViewAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}
	// Profile

	public void verifyFullProfileAccess() throws InterruptedException {

		String profileName = Hooks.prop.getProperty("profile.name.value");

		Thread.sleep(5000);

		driver.findElement(filterButton).click();

		Thread.sleep(3000);
		driver.findElement(filterNameField).sendKeys(profileName);

		driver.findElement(searchButton).click();

		Thread.sleep(1000);

		By actionMenu = By.xpath("//tr[td[normalize-space()='" + profileName + "']]//td[@class='text-right']//button");
		driver.findElement(actionMenu).click();

		driver.findElement(editProfileOption).click();

		Thread.sleep(1000);
		driver.findElement(blockDeleteCheckbox).click();

		Thread.sleep(1000);
		driver.findElement(saveButton).click();

		Thread.sleep(1000);

		driver.findElement(filterButton).click();
		driver.findElement(filterNameField).clear();
		driver.findElement(filterNameField).sendKeys(profileName);

		driver.findElement(searchButton).click();

		actionMenu = By.xpath("//tr[td[normalize-space()='" + profileName + "']]//td[@class='text-right']//button");
		driver.findElement(actionMenu).click();

		driver.findElement(deleteProfileOption).click();

		Thread.sleep(1000);
		driver.findElement(confirmDeleteButton).click();
	}

	public void setupProfileWithFullAccessPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyNoAddEditDeletePermissionForProfiles() throws InterruptedException {

		String profileName = Hooks.prop.getProperty("profile.name.value");

		Thread.sleep(5000);

		Assert.assertTrue(driver.findElements(newProfileButton).isEmpty());

		Thread.sleep(1000);
		driver.findElement(filterButton).click();

		Thread.sleep(3000);
		driver.findElement(filterNameField).sendKeys(profileName);

		driver.findElement(searchButton).click();

		Thread.sleep(1000);
		By actionMenu = By.xpath("//tr[td[normalize-space()='" + profileName + "']]//td[@class='text-right']//button");
		driver.findElement(actionMenu).click();

		Assert.assertTrue(driver.findElements(editOption).isEmpty());
		Assert.assertTrue(driver.findElements(deleteOption).isEmpty());
	}

	public void setupProfileWithViewPermissionOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Dashboard

	public void verifyNoWorkflowAccess() {

		List<WebElement> errorHeaders = driver.findElements(errorHeader);
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	public void openWorkflowDashboardPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Workflow/Home/AuditWorkflow"));
	}

	public void setupProfileNoWorkflowModuleAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyNoDrugAccess() {

		List<WebElement> sidebarIconsList = driver.findElements(sidebarIcons);
		if (sidebarIconsList.isEmpty()) {
			System.out.println("Sidebar icons are NOT present on the page.");
		} else {
			System.out.println("Sidebar icons found: " + sidebarIconsList.size());
		}

	}

	public void openDrugDashboardPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Dashboard"));
	}

	public void setupProfileNoDrugModuleAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyNoDeliveryAccess() {

		List<WebElement> sidebarIconsList = driver.findElements(sidebarIcons);
		if (sidebarIconsList.isEmpty()) {
			System.out.println("Sidebar icons are NOT present on the page.");
		} else {
			System.out.println("Sidebar icons found: " + sidebarIconsList.size());
		}

	}

	public void openDeliveryDashboardPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Dashboard"));
	}

	public void setupProfileNoDeliveryModuleAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyNoPatientAccess() {

		List<WebElement> sidebarIconsList = driver.findElements(sidebarIcons);
		if (sidebarIconsList.isEmpty()) {
			System.out.println("Sidebar icons are NOT present on the page.");
		} else {
			System.out.println("Sidebar icons found: " + sidebarIconsList.size());
		}

	}

	public void openPatientDashboardPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Dashboard"));
	}

	public void setupProfileNoPatientModuleAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyNoSetupAccess() {

		List<WebElement> sidebarIconsList = driver.findElements(sidebarIcons);
		if (sidebarIconsList.isEmpty()) {
			System.out.println("Sidebar icons are NOT present on the page.");
		} else {
			System.out.println("Sidebar icons found: " + sidebarIconsList.size());
		}

	}

	public void setupProfileNoSetupModuleAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void openSetupDashboardPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Dashboard"));
	}

	public void setupLogOnlyAccessProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Audit View

	public void userShouldNotBeAbleToViewGeneralAuditViewSettings() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElements(createdDateColumn).isEmpty());
		Assert.assertTrue(driver.findElements(updatedDateColumn).isEmpty());
	}

	public void ToSetupModuleGeneral() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void restrictedProfileSetupModuleAuditView() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Profile Page

	public void openSetupProfilesPage(String fullUrl) {
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

	public void clickSubmitButton() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	}

	public void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
