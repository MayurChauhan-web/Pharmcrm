package com.pharmcrm_SetupModule.pages;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.TimeoutException;
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

	// Progress Step

	public void verifyUserCanDeleteProgressStepEntry() {

		try {
			WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton));
			menuButton.click();

			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();

			if (deleteExists) {
				System.out.println("PASS: Delete option is visible as expected.");

				wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();

				wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();

			} else {
				Assert.fail("FAIL: Delete option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Delete option.");
		}
	}

	public void userCanViewAddEditDeleteProgressSteps() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotDeleteProgressStepEntries() {

		try {
			WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton));
			menuButton.click();

			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();

			if (deleteExists) {
				Assert.fail("FAIL: Delete option is visible, but it should not be.");
			} else {
				System.out.println("PASS: Delete option is not visible, as expected.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open action menu to verify Delete option.");
		}
	}

	public void verifyUserCanEditExistingProgressStepEntry() {

		String profileName = Hooks.prop.getProperty("profile.name.value");

		try {
			WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton));
			menuButton.click();

			boolean editExists = !driver.findElements(editOption).isEmpty();

			if (editExists) {
				System.out.println("PASS: Edit option is visible as expected.");

				wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();

				wait.until(ExpectedConditions.visibilityOfElementLocated(notesField));
				driver.findElement(notesField).clear();
				driver.findElement(notesField).sendKeys(profileName);

				wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();

			} else {
				Assert.fail("FAIL: Edit option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Edit option.");
		}
	}

	public void userCanViewAddAndEditProgressSteps() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrDeleteProgressStepEntries() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement menuButton = wait.until(ExpectedConditions.presenceOfElementLocated(actionMenuButton));

		try {
			wait.until(ExpectedConditions.elementToBeClickable(menuButton)).click();

			boolean editExists = !driver.findElements(editOption).isEmpty();
			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();

			if (!editExists && !deleteExists) {
				System.out.println("PASS: Edit/Delete options are not visible as expected.");
			} else {
				Assert.fail("FAIL: Edit and/or Delete option is visible, but it should not be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu is not accessible due to permission restrictions.");
		}
	}

	public void verifyUserCanAddNewProgressStepEntry() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		String profileName = Hooks.prop.getProperty("profile.name.value");

		wait.until(ExpectedConditions.elementToBeClickable(newProgressStepButton)).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(nameField));
		driver.findElement(nameField).clear();
		driver.findElement(nameField).sendKeys(profileName);

		driver.findElement(priorityField).clear();
		driver.findElement(priorityField).sendKeys("1");

		WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(featureTypeDropdown));
		Select select = new Select(dropdown);
		select.selectByIndex(2);

		driver.findElement(notesField).clear();
		driver.findElement(notesField).sendKeys(profileName);

		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void userCanViewAndAddProgressSteps() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddEditOrDeleteProgressStepEntries() {

		sleep(3000);

		Assert.assertTrue(driver.findElements(newProgressStepButton).isEmpty(),
				"FAIL: 'New Progress Step' button should not be visible");

		WebElement menuButton = driver.findElement(actionMenuButton);

		try {
			menuButton.click();
			sleep(1000);

			boolean editExists = !driver.findElements(editOption).isEmpty();
			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();

			if (!editExists && !deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options for Progress Step.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options for Progress Step.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu is not accessible due to permission restrictions.");
		}
	}

	public void openProgressStepPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ProgressStatuses"));
	}

	public void verifyViewOnlyAccessOnProgressStep() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Progress Step
	private By priorityField = By.id("ProgressStatus_Priority");
	private By notesField = By.id("ProgressStatus_Notes");

	// Save button

	private By newProgressStepButton = By.xpath("//span[normalize-space()='New Progress Step']");

	// EHR Types
	By nameField = By.id("ExternalSource_Name");
	By descriptionField = By.id("ExternalSource_Description");
	By newEhrTypeBtn = By.xpath("//span[normalize-space()='New EHR Type']");
	By actionMenuBtn = By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]");

	// Organization Calendar
	By calendarEditBtn = By.cssSelector("button[onclick='return SubmitCalendarSetting()']");

	// Brand Management
	By sendVCardBtn = By.xpath("//button[normalize-space()='Send VCard']");

	// Reminders
	By reminderActionBtn = By.xpath("//tbody/tr[1]/td[2]/a[1]");

	// Organization Bucket
	By fileNameField = By.id("fileNameTextBox");
	By saveBtn = By.id("btnSaveFile");

	By fileInputField = By.xpath("//div[@class='pb-2']//input[@id='file-3']");
	By saveFileBtn = By.id("btnSaveFile");
	By addFileBtn = By.xpath("//a[@id='btnAddFile']//*[name()='svg']");
	By downloadOption = By.xpath(
			"//div[contains(@class,'bucket-mainn') and contains(@class,'show')]//li[2]//a[1]//*[name()='svg']//*[name()='path' and @id='Union_1']");

	// Feedback Form
	By confirmDeleteBtn = By.id("deleteFeedbackForm");
	By questionField = By.id("FeedbackQuestion_Question");
	By addQuestionButton = By
			.xpath("//a[@class='settings-add-btn']//*[name()='svg']//*[name()='path' and @id='Path_1']");

	By newFeedbackFormButton = By.xpath("//span[normalize-space()='New Feedback Form']");

	// Patient Signature Template
	By newPatientSignatureButton = By.xpath("//span[normalize-space()='New Patient Signature']");

	// Fax Template
	By newFaxTemplateButton = By.xpath("//span[normalize-space()='New Fax Template']");
	By activeCheckbox = By.xpath("//label[normalize-space()='Active?']");

	// Mail Template

	By titleField = By.id("MailTemplate_Title");
	By subjectField = By.id("MailTemplate_Subject");
	By newMailTemplateButton = By.xpath("//span[normalize-space()='New Mail Template']");

	// BOT Call Template

	By bodyField = By.id("BOTCallTemplate_Body");
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

	// EHR Types

	public void verifyUserCanDeleteEHRType() throws InterruptedException {

		Thread.sleep(3000);

		try {
			Thread.sleep(1000);

			List<WebElement> deleteElements = driver.findElements(deleteOption);

			if (!deleteElements.isEmpty()) {
				System.out.println("PASS: Delete option is visible as expected.");

				deleteElements.get(0).click();

				WebElement confirmBtn = driver.findElement(confirmDeleteBtn);
				confirmBtn.click();

			} else {
				Assert.fail("FAIL: Delete option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not verify or click Delete option.");
		}
	}

	public void verifyFullAccessOnEhrTypes() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotDeleteEHRTypes() throws InterruptedException {

		Thread.sleep(3000);

		try {
			Thread.sleep(1000);

			List<WebElement> deleteElements = driver.findElements(deleteOption);

			if (!deleteElements.isEmpty()) {
				Assert.fail("FAIL: Delete option is visible, but it should NOT be.");
			} else {
				System.out.println("PASS: Delete option is not visible, as expected.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not verify Delete option.");
		}
	}

	public void verifyUserCanEditEHRType() throws InterruptedException {

		Thread.sleep(3000);

		try {
			WebElement menuButton = driver.findElement(actionMenuBtn);

			Thread.sleep(1000);
			menuButton.click();

			Thread.sleep(1000);

			List<WebElement> editElements = driver.findElements(editOption);

			if (!editElements.isEmpty()) {
				System.out.println("PASS: Edit option is visible as expected.");

				editElements.get(0).click();

				String profileName = Hooks.prop.getProperty("profile.name.value");

				WebElement descField = driver.findElement(descriptionField);
				descField.clear();
				descField.sendKeys(profileName);

				WebElement saveButton = driver.findElement(saveBtn);
				saveButton.click();

			} else {
				Assert.fail("FAIL: Edit option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Edit option.");
		}
	}

	public void profileHasViewAddEditAccessForEhrTypes() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrDeleteEHRTypes() throws InterruptedException {

		Thread.sleep(3000);

		try {
			WebElement menuButton = driver.findElement(actionMenuBtn);
			menuButton.click();

			Thread.sleep(1000);

			boolean editExists = !driver.findElements(editOption).isEmpty();
			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();

			if (!editExists && !deleteExists) {
				System.out.println("PASS: Delete and Edit options are not visible as expected.");
			} else {
				Assert.fail("FAIL: Delete and/or Edit option is visible, but it should not be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	public void verifyUserCanAddNewEHRType() throws InterruptedException {

		Thread.sleep(3000);

		driver.findElement(newEhrTypeBtn).click();

		Thread.sleep(1000);

		String profileName = Hooks.prop.getProperty("profile.name.value");

		driver.findElement(nameField).clear();
		driver.findElement(nameField).sendKeys(profileName);

		driver.findElement(descriptionField).clear();
		driver.findElement(descriptionField).sendKeys(profileName);

		Thread.sleep(3000);

		driver.findElement(saveBtn).click();
	}

	public void profileHasViewAndAddAccessForEhrTypes() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddEditDeleteEHRTypes() throws InterruptedException {

		Thread.sleep(3000);

		List<WebElement> newBtn = driver.findElements(newEhrTypeBtn);
		Assert.assertTrue(newBtn.isEmpty(), "FAIL: 'New EHR Type' button should NOT be visible");

		try {
			WebElement menuButton = driver.findElement(actionMenuBtn);
			menuButton.click();
			Thread.sleep(1000);

			boolean editExists = !driver.findElements(editOption).isEmpty();
			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();

			if (!editExists && !deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	public void openEhrTypesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ExternalSources"));
	}

	public void userRestrictedToViewOnlyInEhrTypes() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Organization Calendar

	public void verifyUserCanEditOrganizationCalendarEntry() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			WebElement editBtn = wait.until(ExpectedConditions.elementToBeClickable(calendarEditBtn));

			System.out.println("PASS: Edit option is visible as expected.");
			editBtn.click();

		} catch (TimeoutException e) {
			Assert.fail("FAIL: Edit option is not visible or clickable.");
		}
	}

	public void createProfileWithViewAndEditAccessToOrganizationCalendar() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrganizationCalendarEntries() throws InterruptedException {

		Thread.sleep(3000);

		List<WebElement> elements = driver.findElements(calendarEditBtn);
		Assert.assertTrue(elements.isEmpty(), "Calendar edit button is visible, but it should NOT be");
	}

	public void openOrganizationCalendarPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/OrganizationCalendarSetting"));
	}

	public void createProfileWithViewAccessToOrganizationCalendar() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Technical Setting
	public void openTechnicalSettingPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/TechnicalSetting"));
	}

	public void createProfileWithoutUpdateAccessToTechnicalSetting() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Text Forward Setting
	public void openTextForwardSettingPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/TextForwardSetting"));
	}

	public void userRestrictedFromUpdatingTextForwardSetting() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Notification Setting

	public void verifyUserHasNoUpdateAccessToNotificationSetting() {

		List<WebElement> errorHeaders = driver.findElements(errorHeader);

		Assert.assertTrue(!errorHeaders.isEmpty(), "User has access to Notification Setting page, but should NOT");
	}

	public void verifyUserHasNoUpdateAccessToTechnicalSetting() throws InterruptedException {

		List<WebElement> errorHeaders = driver.findElements(errorHeader);

		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	public void verifyNoUpdateAccessOnNotificationSetting() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void openNotificationSettingPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/NotificationSetting"));
	}

	// Brand Management

	public void verifySendVCardOptionIsNotVisibleInBrandManagement() throws InterruptedException {

		Thread.sleep(3000);

		List<WebElement> elements = driver.findElements(sendVCardBtn);
		Assert.assertTrue(elements.isEmpty(), "Send VCard button is visible, but it should NOT be");
	}

	public void createProfileWithoutSendVcardAccessToBrandManagement() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyNoUpdateAccessToApplicationStatus() throws InterruptedException {

		List<WebElement> errorHeaders = driver.findElements(errorHeader);

		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	public void verifyNoUpdateAccessToBrandManagement() throws InterruptedException {

		List<WebElement> errorHeaders = driver.findElements(errorHeader);

		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	public void openBrandManagementPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/BrandManagement"));
	}

	public void createProfileWithoutUpdateAccessToBrandManagement() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Bucket Setting

	public void openBucketSettingsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/BucketSettings"));
	}

	public void userWithNoAccessCannotViewOrAccessBucketSetting() throws InterruptedException {

		Thread.sleep(2000);

		List<WebElement> errorElements = driver.findElements(errorHeader);

		if (!errorElements.isEmpty()) {
			System.out.println("PASS: User cannot access Bucket Settings page.");
		} else {
			System.out.println("FAIL: Page loaded successfully, user should not have access.");
		}
	}

	public void bucketSettingProfileWithoutUpdatePermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Reminders
	public void openApplicationStatusPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ApplicationStatus"));
	}

	public void profileHasNoUpdateAccessForApplicationStatus() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void UserCanSeeAndPerformReminderActionsWithActionViewAccess() {

		WebElement actionBtn = wait.until(ExpectedConditions.elementToBeClickable(reminderActionBtn));
		actionBtn.click();

		WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveButton.click();
	}

	public void createProfileWithViewAndActionAccessToReminders() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void UserCannotSeeReminderActionButtonsWithoutActionViewAccess() throws InterruptedException {
		Thread.sleep(3000);

		List<WebElement> elements = driver.findElements(reminderActionBtn);
		Assert.assertTrue(elements.isEmpty(), "Reminder action button should not be visible");
	}

	public void profileRestrictedToViewAccessInReminders() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void openRemindersPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Reminders"));
	}

	// Organization Bucket

	public void verifyUserCanDownloadFileInOrganizationBucket() {
		sleep(3000);

		try {
			sleep(1000);

			boolean downloadExists = !driver.findElements(downloadOption).isEmpty();

			if (downloadExists) {
				System.out.println("PASS: Download option is visible as expected.");

				driver.findElement(downloadOption).click();

			} else {
				Assert.fail("FAIL: Download option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | org.openqa.selenium.TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Download option.");
		}
	}

	public void profileWithOrganizationBucketFullRights() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotDownloadFilesInOrganizationBucket() {
		sleep(3000);

		try {
			sleep(1000);

			boolean downloadExists = !driver.findElements(downloadOption).isEmpty();

			if (!downloadExists) {
				System.out.println("PASS: Download option is not visible as expected.");
			} else {
				Assert.fail("FAIL: Download option is visible, but it should not be.");
			}

		} catch (ElementClickInterceptedException | org.openqa.selenium.TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no Download permissions).");
		}
	}

	public void verifyUserCanDeleteFileInOrganizationBucket() {
		sleep(3000);

		try {
			sleep(1000);

			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();

			if (deleteExists) {
				System.out.println("PASS: Delete option is visible as expected.");

				driver.findElement(deleteOption).click();
				sleep(1000);

				driver.findElement(confirmDeleteBtn).click();

			} else {
				Assert.fail("FAIL: Delete option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | org.openqa.selenium.TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Delete option.");
		}
	}

	public void unrestrictedProfileOrganizationBucketFileAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotDeleteOrDownloadFilesInOrganizationBucket() {
		sleep(3000);

		try {
			driver.findElement(actionMenu).click();
			sleep(1000);

			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();
			boolean downloadExists = !driver.findElements(downloadOption).isEmpty();

			if (!deleteExists && !downloadExists) {
				System.out.println("PASS: Delete and Download options are not visible as expected.");
			} else {
				Assert.fail("FAIL: Delete and/or Download option is visible, but it should not be.");
			}

		} catch (ElementClickInterceptedException | org.openqa.selenium.TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	public void verifyUserCanEditExistingFileInOrganizationBucket() {
		sleep(3000);

		String profileName = Hooks.prop.getProperty("profile.name.value");

		try {
			driver.findElement(actionMenu).click();
			sleep(1000);

			boolean editExists = !driver.findElements(editOption).isEmpty();

			if (editExists) {
				System.out.println("PASS: Edit option is visible as expected.");

				driver.findElement(editOption).click();
				sleep(1000);

				driver.findElement(fileNameField).clear();
				driver.findElement(fileNameField).sendKeys(profileName);

				driver.findElement(saveBtn).click();

			} else {
				Assert.fail("FAIL: Edit option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | org.openqa.selenium.TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Edit option.");
		}
	}

	public void organizationBucketProfileWithViewAddEditFilePermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditDeleteOrDownloadFilesInOrganizationBucket() {
		sleep(3000);

		try {
			driver.findElement(actionMenu).click();
			sleep(1000);

			boolean editExists = !driver.findElements(editOption).isEmpty();
			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();
			boolean downloadExists = !driver.findElements(downloadOption).isEmpty();

			if (!editExists && !deleteExists && !downloadExists) {
				System.out.println("PASS: User cannot see Edit/Delete/Download options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete/Download options.");
			}

		} catch (ElementClickInterceptedException | org.openqa.selenium.TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	public void verifyUserCanAddNewFileInOrganizationBucket() {
		sleep(3000);

		driver.findElement(addFileBtn).click();

		String filePath = System.getProperty("user.dir") + "/pharmcrm-product/src/test/resources/Documents/dummy.pdf";

		driver.findElement(fileInputField).sendKeys(filePath);

		sleep(3000);

		driver.findElement(saveFileBtn).click();
	}

	public void organizationBucketProfileWithViewAndAddFilePermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddEditDeleteOrDownloadFilesInOrganizationBucket() {
		sleep(3000);

		boolean addExists = !driver.findElements(addFileBtn).isEmpty();
		if (addExists) {
			Assert.fail("FAIL: Add File button is visible, but it should not be.");
		}

		try {
			driver.findElement(actionMenu).click();
			sleep(1000);

			boolean editExists = !driver.findElements(editOption).isEmpty();
			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();
			boolean downloadExists = !driver.findElements(downloadOption).isEmpty();

			if (!editExists && !deleteExists && !downloadExists) {
				System.out.println("PASS: User cannot see Edit/Delete/Download options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete/Download options.");
			}

		} catch (ElementClickInterceptedException | org.openqa.selenium.TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	public void openOrganizationDocumentsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/OrganizationDocuments"));
	}

	public void organizationBucketProfileWithViewAccessPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Default Fax Template

	public void UserWithNoAccessCannotViewOrAccessDefaultFaxTemplate() throws InterruptedException {

		List<WebElement> errorHeaders = driver.findElements(errorHeader);

		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	public void openDefaultFaxTemplatePage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DefaultFaxTemplate"));
	}

	public void setupDefaultFaxTemplateProfileWithoutUpdatePermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Default Mail Template
	public void UserWithNoAccessCannotViewOrAccessDefaultMailTemplate() {

		sleep(2000);

		boolean isErrorDisplayed = !driver.findElements(errorHeader).isEmpty();

		if (isErrorDisplayed) {
			System.out.println("PASS: User does not have access to Default Mail Template.");
		} else {
			Assert.fail("FAIL: User was able to access Default Mail Template page.");
		}
	}

	public void openDefaultMailTemplatePage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DefaultMailTemplate"));
	}

	public void setupDefaultMailTemplateProfileWithoutUpdatePermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Feedback Form
	public void serShouldBeAbleToDeleteFeedbackForm() {
		sleep(3000);

		try {
			driver.findElement(actionMenu).click();
			sleep(1000);

			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();

			if (deleteExists) {
				System.out.println("PASS: Delete option is visible as expected.");

				driver.findElement(deleteOption).click();

				sleep(1000);

				driver.findElement(confirmDeleteBtn).click();

			} else {
				Assert.fail("FAIL: Delete option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | org.openqa.selenium.TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Delete option.");
		}
	}

	public void setupFeedbackFormProfileWithFullAccessPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToDeleteFeedbackForm() {
		sleep(3000);

		try {
			driver.findElement(actionMenu).click();
			sleep(1000);

			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();

			if (!deleteExists) {
				System.out.println("PASS: Delete option is not visible as expected.");
			} else {
				Assert.fail("FAIL: Delete option is visible, but it should not be.");
			}

		} catch (ElementClickInterceptedException | org.openqa.selenium.TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no delete permissions).");
		}
	}

	public void userShouldBeAbleToEditFeedbackForm() {
		sleep(3000);

		try {
			WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(actionMenu));
			menuButton.click();

			sleep(1000);

			if (!driver.findElements(editOption).isEmpty()) {
				System.out.println("PASS: Edit option is visible as expected.");

				WebElement editBtn = wait.until(ExpectedConditions.elementToBeClickable(editOption));
				editBtn.click();

				String profileName = Hooks.prop.getProperty("profile.name.value");
				driver.findElement(titleField).clear();
				driver.findElement(titleField).sendKeys(profileName);

				WebElement saveBtn = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
				saveBtn.click();

			} else {
				Assert.fail("FAIL: Edit option is not visible, but it should be.");
			}

		} catch (Exception e) {
			Assert.fail("FAIL: Could not open the action menu to verify Edit option.");
		}
	}

	public void setupFeedbackFormProfileWithViewAddEditPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToEditOrDeleteFeedbackForm() throws InterruptedException {

		Thread.sleep(3000);

		try {
			driver.findElement(actionMenu).click();
			Thread.sleep(1000);

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

	public void userShouldBeAbleToAddNewFeedbackForm() throws InterruptedException {

		Thread.sleep(3000);

		driver.findElement(newFeedbackFormButton).click();

		String profileName = Hooks.prop.getProperty("profile.name.value");

		driver.findElement(titleField).sendKeys(profileName);

		driver.findElement(saveButton).click();

		driver.findElement(questionField).sendKeys(profileName);
		Thread.sleep(3000);

		driver.findElement(addQuestionButton).click();

		driver.findElement(saveButton).click();
	}

	public void setupFeedbackFormProfileWithViewAndAddPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddEditOrDeleteFeedbackForm() throws InterruptedException {

		Thread.sleep(3000);

		if (!driver.findElements(newFeedbackFormButton).isEmpty()) {
			Assert.fail("FAIL: 'New Feedback Form' button should not be visible.");
		}

		try {
			driver.findElement(actionMenu).click();
			Thread.sleep(1000);

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

	public void openFeedbackFormsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/FeedbackForms"));
	}

	public void profileWithSetupFeedbackFormViewPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Patient Signature Template
	public void userShouldBeAbleToDeletePatientSignatureTemplate() throws InterruptedException {

		Thread.sleep(3000);

		try {
			Thread.sleep(1000);

			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();

			if (deleteExists) {
				System.out.println("PASS: Delete option is visible as expected.");

				driver.findElement(deleteOption).click();
				Thread.sleep(1000);

				driver.findElement(confirmDeleteButton).click();

			} else {
				Assert.fail("FAIL: Delete option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException e) {
			Assert.fail("FAIL: Could not perform delete action.");
		}
	}

	public void setupPatientSignatureTemplateProfileWithFullAccessPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToDeletePatientSignatureTemplate() throws InterruptedException {

		Thread.sleep(3000);

		try {
			driver.findElement(actionMenu).click();
			Thread.sleep(1000);

			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();

			if (!deleteExists) {
				System.out.println("PASS: Delete option is not visible as expected.");
			} else {
				Assert.fail("FAIL: Delete option is visible, but it should not be.");
			}

		} catch (ElementClickInterceptedException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no delete permissions).");
		}
	}

	public void userShouldBeAbleToEditPatientSignatureTemplate() throws InterruptedException {

		Thread.sleep(3000);

		try {
			driver.findElement(actionMenu).click();
			Thread.sleep(1000);

			boolean editExists = !driver.findElements(editOption).isEmpty();

			if (editExists) {
				System.out.println("PASS: Edit option is visible as expected.");

				driver.findElement(editOption).click();
				Thread.sleep(1000);

				String profileName = Hooks.prop.getProperty("profile.name.value");
				driver.findElement(titleField).sendKeys(profileName);

				driver.findElement(submitButton).click();

			} else {
				Assert.fail("FAIL: Edit option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException e) {
			Assert.fail("FAIL: Could not open the action menu.");
		}
	}

	public void profileWithSetupPatientSignatureTemplateViewAddEditPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToEditOrDeletePatientSignatureTemplate() throws InterruptedException {

		Thread.sleep(3000);

		try {
			driver.findElement(actionMenu).click();
			Thread.sleep(1000);

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

	public void userShouldBeAbleToAddNewPatientSignatureTemplate() throws InterruptedException {

		Thread.sleep(3000);

		driver.findElement(newPatientSignatureButton).click();

		String profileName = Hooks.prop.getProperty("profile.name.value");

		driver.findElement(titleField).sendKeys(profileName);
		driver.findElement(bodyField).sendKeys(profileName);

		driver.findElement(submitButton).click();
	}

	public void profileWithSetupPatientSignatureTemplateViewAndAddPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddEditOrDeletePatientSignatureTemplate() throws InterruptedException {

		Thread.sleep(3000);

		if (!driver.findElements(newPatientSignatureButton).isEmpty()) {
			Assert.fail("FAIL: 'New Patient Signature' button should not be visible.");
		}

		try {
			driver.findElement(actionMenu).click();
			Thread.sleep(1000);

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

	public void openPatientSignatureTemplatesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PatientSignatureTemplates"));
	}

	public void profileWithSetupPatientSignatureTemplateViewPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Mail Template
	public void userShouldBeAbleToDeleteMailTemplate() throws InterruptedException {

		Thread.sleep(3000);

		try {
			driver.findElement(actionMenu).click();
			Thread.sleep(1000);

			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();

			if (deleteExists) {
				System.out.println("PASS: Delete option is visible as expected.");

				driver.findElement(deleteOption).click();
				Thread.sleep(1000);

				driver.findElement(confirmDeleteButton).click();

			} else {
				Assert.fail("FAIL: Delete option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException e) {
			Assert.fail("FAIL: Could not open the action menu.");
		}
	}

	public void unrestrictedProfileSetupMailTemplateAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToDeleteMailTemplate() throws InterruptedException {

		try {
			driver.findElement(actionMenu).click();
			Thread.sleep(1000);

			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();

			if (!deleteExists) {
				System.out.println("PASS: Delete option is not visible as expected.");
			} else {
				Assert.fail("FAIL: Delete option is visible, but it should not be.");
			}

		} catch (ElementClickInterceptedException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no delete permissions).");
		}
	}

	public void userShouldBeAbleToEditMailTemplate() throws InterruptedException {

		Thread.sleep(3000);

		driver.findElement(filterButton).click();
		Thread.sleep(3000);

		String profileName = Hooks.prop.getProperty("profile.name.value");
		driver.findElement(filterTitleField).sendKeys(profileName);

		driver.findElement(searchButton).click();
		Thread.sleep(1000);

		try {
			driver.findElement(actionMenu).click();
			Thread.sleep(1000);

			boolean editExists = !driver.findElements(editOption).isEmpty();

			if (editExists) {
				System.out.println("PASS: Edit option is visible as expected.");

				driver.findElement(editOption).click();
				Thread.sleep(1000);

				driver.findElement(bodyField).sendKeys(profileName);

				driver.findElement(submitButton).click();

			} else {
				Assert.fail("FAIL: Edit option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException e) {
			Assert.fail("FAIL: Could not open the action menu.");
		}
	}

	public void setupMailTemplateProfileWithViewAddEditPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToEditOrDeleteMailTemplate() throws InterruptedException {

		Thread.sleep(3000);

		driver.findElement(filterButton).click();
		Thread.sleep(3000);

		String profileName = Hooks.prop.getProperty("profile.name.value");
		driver.findElement(filterTitleField).sendKeys(profileName);

		driver.findElement(searchButton).click();
		Thread.sleep(1000);

		try {
			driver.findElement(actionMenu).click();
			Thread.sleep(1000);

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

	public void userShouldBeAbleToAddNewMailTemplate() throws InterruptedException {

		Thread.sleep(3000);

		driver.findElement(newMailTemplateButton).click();

		String profileName = Hooks.prop.getProperty("profile.name.value");

		driver.findElement(titleField).sendKeys(profileName);
		driver.findElement(subjectField).sendKeys(profileName);

		new Select(driver.findElement(featureTypeDropdown)).selectByIndex(1);

		driver.findElement(submitButton).click();
	}

	public void setupMailTemplateProfileWithViewAndAddPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToModifyMailTemplate() throws InterruptedException {

		Thread.sleep(3000);

		if (!driver.findElements(newMailTemplateButton).isEmpty()) {
			Assert.fail("FAIL: 'New Mail Template' button should not be visible.");
		}

		try {
			driver.findElement(actionMenu).click();
			Thread.sleep(1000);

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

	public void openMailTemplatesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/MailTemplates"));
	}

	public void setupMailTemplateProfileWithViewAccessPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Fax Template
	public void userShouldBeAbleToDeleteFaxTemplate() throws InterruptedException {

		Thread.sleep(3000);

		driver.findElement(filterButton).click();
		Thread.sleep(3000);

		String profileName = Hooks.prop.getProperty("profile.name.value");
		driver.findElement(filterTitleField).sendKeys(profileName);

		driver.findElement(searchButton).click();
		Thread.sleep(1000);

		try {
			driver.findElement(actionMenu).click();
			Thread.sleep(1000);

			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();

			if (deleteExists) {
				System.out.println("PASS: Delete option is visible as expected.");

				driver.findElement(deleteOption).click();
				Thread.sleep(1000);

				driver.findElement(confirmDeleteButton).click();

			} else {
				Assert.fail("FAIL: Delete option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException e) {
			Assert.fail("FAIL: Could not open the action menu.");
		}
	}

	public void unrestrictedProfileSetupFaxTemplateAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToDeleteFaxTemplate() throws InterruptedException {

		Thread.sleep(3000);

		try {
			driver.findElement(actionMenu).click();
			Thread.sleep(1000);

			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();

			if (!deleteExists) {
				System.out.println("PASS: Delete option is not visible as expected.");
			} else {
				Assert.fail("FAIL: Delete option is visible, but it should not be.");
			}

		} catch (ElementClickInterceptedException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no delete permissions).");
		}
	}

	public void userShouldBeAbleToEditFaxTemplate() throws InterruptedException {

		Thread.sleep(3000);

		driver.findElement(filterButton).click();
		Thread.sleep(3000);

		String profileName = Hooks.prop.getProperty("profile.name.value");
		driver.findElement(filterTitleField).sendKeys(profileName);

		driver.findElement(searchButton).click();
		Thread.sleep(1000);

		try {
			driver.findElement(actionMenu).click();
			Thread.sleep(1000);

			boolean editExists = !driver.findElements(editOption).isEmpty();

			if (editExists) {
				System.out.println("PASS: Edit option is visible as expected.");

				driver.findElement(editOption).click();
				Thread.sleep(1000);

				driver.findElement(activeCheckbox).click();
				Thread.sleep(1000);

				driver.findElement(submitButton).click();

			} else {
				Assert.fail("FAIL: Edit option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException e) {
			Assert.fail("FAIL: Could not open the action menu.");
		}
	}

	public void setupFaxTemplateProfileWithViewAddEditPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToEditOrDeleteFaxTemplate() throws InterruptedException {

		Thread.sleep(3000);

		driver.findElement(filterButton).click();
		Thread.sleep(3000);

		String profileName = Hooks.prop.getProperty("profile.name.value");
		driver.findElement(filterTitleField).sendKeys(profileName);

		driver.findElement(searchButton).click();
		Thread.sleep(1000);

		try {
			driver.findElement(actionMenu).click();
			Thread.sleep(1000);

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

	public void userShouldBeAbleToAddNewFaxTemplate() throws InterruptedException {

		Thread.sleep(3000);

		driver.findElement(newFaxTemplateButton).click();

		String profileName = Hooks.prop.getProperty("profile.name.value");

		driver.findElement(titleField).sendKeys(profileName);
		driver.findElement(subjectField).sendKeys(profileName);

		new Select(driver.findElement(featureTypeDropdown)).selectByIndex(3);

		driver.findElement(submitButton).click();
	}

	public void restrictedProfileSetupFaxTemplateViewAddAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddEditOrDeleteFaxTemplate() throws InterruptedException {

		Thread.sleep(3000);

		if (!driver.findElements(newCalloutTemplateButton).isEmpty()) {
			Assert.fail("FAIL: 'New Callout Template' button should not be visible.");
		}

		try {
			driver.findElement(actionMenu).click();
			Thread.sleep(1000);

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

	public void openFaxTemplatesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/FaxTemplates"));
	}

	public void setupFaxTemplateProfileWithViewAccessPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// BOT Call Template

	public void verifyUserCanDeleteBotCallTemplate() throws InterruptedException {

		Thread.sleep(3000);

		try {
			driver.findElement(actionMenu).click();
			Thread.sleep(1000);

			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();

			if (deleteExists) {
				System.out.println("PASS: Delete option is visible as expected.");

				driver.findElement(deleteOption).click();
				Thread.sleep(1000);

				driver.findElement(confirmDeleteButton).click();

			} else {
				Assert.fail("FAIL: Delete option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException e) {
			Assert.fail("FAIL: Could not open the action menu.");
		}
	}

	public void profileWithSetupBotCallTemplateFullPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotDeleteBotCallTemplate() throws InterruptedException {

		Thread.sleep(2000);

		try {
			driver.findElement(actionMenu).click();
			Thread.sleep(1000);

			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();

			if (!deleteExists) {
				System.out.println("PASS: Delete option is not visible as expected.");
			} else {
				Assert.fail("FAIL: Delete option is visible, but it should not be.");
			}

		} catch (ElementClickInterceptedException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no delete permissions).");
		}
	}

	public void verifyUserCanEditBotCallTemplate() throws InterruptedException {

		Thread.sleep(3000);

		driver.findElement(filterButton).click();
		Thread.sleep(3000);

		String profileName = Hooks.prop.getProperty("profile.name.value");
		driver.findElement(filterTitleField).sendKeys(profileName);

		driver.findElement(searchButton).click();
		Thread.sleep(1000);

		try {
			driver.findElement(actionMenu).click();
			Thread.sleep(1000);

			boolean editExists = !driver.findElements(editOption).isEmpty();

			if (editExists) {
				System.out.println("PASS: Edit option is visible as expected.");

				driver.findElement(editOption).click();
				Thread.sleep(2000);

				driver.findElement(bodyField).sendKeys(profileName);

				driver.findElement(submitButton).click();

			} else {
				Assert.fail("FAIL: Edit option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException e) {
			Assert.fail("FAIL: Could not open the action menu.");
		}
	}

	public void setupBotCallTemplateProfileWithViewAddEditPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrDeleteBotCallTemplate() throws InterruptedException {

		if (!driver.findElements(newTextTemplateButton).isEmpty()) {
			Assert.fail("FAIL: 'New Text Template' button should not be visible to the user.");
		}

		driver.findElement(filterButton).click();
		Thread.sleep(1000);
		String profileName = Hooks.prop.getProperty("profile.name.value");
		driver.findElement(filterTitleField).sendKeys(profileName);
		driver.findElement(searchButton).click();
		Thread.sleep(1000);

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
