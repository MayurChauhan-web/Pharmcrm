package com.pharmcrm_RxworkflowModule.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import hooks.Hooks;

public class rxworkflowpage {
	private WebDriver driver;
	private WebDriverWait wait;

	// Success Result Action
	public By successResultActionAddLabel = By.xpath("//label[@for='chkg19SuccessResultActionAdd']");
	public By successResultActionEditLabel = By.xpath("//label[@for='chkg19SuccessResultActionEdit']");
	public By successResultActionDeleteLabel = By.xpath("//label[@for='chkg19SuccessResultActionDelete']");

	// Success Result Action
	public void openSuccessResultActionsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/SuccessResultActions"));
	}

	public void testSuccessResultActionViewEditOnlyNoAddDeleteInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

		WebElement addActionElement = wait.until(ExpectedConditions.elementToBeClickable(successResultActionAddLabel));
		addActionElement.click();

		WebElement deleteActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(successResultActionDeleteLabel));
		deleteActionElement.click();

		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void testSuccessResultActionViewDeleteOnlyNoAddEditInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

		WebElement addActionElement = wait.until(ExpectedConditions.elementToBeClickable(successResultActionAddLabel));
		addActionElement.click();

		WebElement editActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(successResultActionEditLabel));
		editActionElement.click();

		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void testSuccessResultActionViewAddOnlyNoEditDeleteInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

		WebElement editActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(successResultActionEditLabel));
		editActionElement.click();

		WebElement deleteActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(successResultActionDeleteLabel));
		deleteActionElement.click();

		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	// Reminder Result Action
	public By nameLink = By.xpath("//a[normalize-space()='Name']");
	public By reminderResultActionAddLabel = By.xpath("//label[@for='chkg19ReminderResultActionAdd']");
	public By reminderResultActionEditLabel = By.xpath("//label[@for='chkg19ReminderResultActionEdit']");
	public By reminderResultActionDeleteLabel = By.xpath("//label[@for='chkg19ReminderResultActionDelete']");
	public By newReminderResultActionButton = By.xpath("//span[normalize-space()='New Reminder Result Action']");
	public By reminderResultActionNameField = By.id("ReminderResultAction_Name");

	// Medication SyncReminder Color Code
	public By addColorCodeLabel = By.xpath("//label[@for='chkg44MedicationSyncReminderColorCodeAdd']");
	public By editColorCodeLabel = By.xpath("//label[@for='chkg44MedicationSyncReminderColorCodeEdit']");
	public By deleteColorCodeLabel = By.xpath("//label[@for='chkg44MedicationSyncReminderColorCodeDelete']");
	public By titleHeader = By.xpath("//th[normalize-space()='Title']");
	public By newMedicationSyncColorButton = By.xpath("//span[normalize-space()='New Medication Sync Color']");
	public By medicationSyncReminderColorCodeTitle = By.id("MedicationSyncReminderColorCode_Title");
	public By saveColorCodeButton = By.xpath("//button[@id='btnSave']");
	public By deleteConfirmButton = By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']");

	// Sync Workflow Settings
	public By confirmDeleteButton = By.xpath("//button[@id='deletepatientmedicalSetting']");
	public By deleteOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	public By editOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By bucketDropButton = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By newMedicationSyncReminder = By.xpath("//span[normalize-space()='New Medication Sync Reminder']");
	public By dayTypeDropdown = By.id("SyncWorkflowSetting_DayTypeId");
	public By dayDropdown = By.id("SyncWorkflowSetting_Day");

	public By titleField = By.id("SyncWorkflowSetting_Notes");
	public By saveButton = By.id("btnSaveMedicationSetting");
	public By dayTypeHeader = By.xpath("//th[normalize-space()='Day Type']");
	public By addCheckboxLabel = By.xpath("//label[@for='chkg19SyncWorkflowSettingsAdd']");
	public By editCheckboxLabel = By.xpath("//label[@for='chkg19SyncWorkflowSettingsEdit']");
	public By deleteCheckboxLabel = By.xpath("//label[@for='chkg19SyncWorkflowSettingsDelete']");

	// General
	public By updatedDateHeader = By.xpath("//th[@id='UpdatedDate']");
	public By workflowAuditViewCheckbox = By.xpath("//label[@for='chkg37WorkflowAuditView']");

	// LocatorProfilesPage
	public By btnSaveLocator = By.id("btnSave");
	public By preloader = By.cssSelector("div.preloader");
	public By profilefilterButton = By.xpath("//*[name()='path' and @id='Union_73']");
	public By profileNameInput = By.xpath("//input[@id='Filter_Name']");
	public By searchButton = By.xpath("//i[@class='fa-solid fa-magnifying-glass']");
	public By actionMenu = By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']");
	public By editButton = By.xpath("//span[normalize-space()='Edit']");
	public By submitButton = By.xpath("//button[@id='btnSave']");
	public By patientModuleGeneralAuditViewCheckbox = By.xpath("//label[@for='chkg37PatientAuditView']");
	public By selectAllModuleLabel = By.xpath("//label[normalize-space()='Select All Module']");
	public By patientModuleGeneralAuditViewLabel = By.xpath("//label[@for='chkg37SetupGeneralAll']");
	public By patientModuleAllLabel = By.xpath("//label[@for='chkg9PatientAll']");
	public By patientModuleViewLabel = By.xpath("//label[@for='chkg9PatientView']");
	public By patientModuleAddLabel = By.xpath("//label[@for='chkg9PatientAdd']");
	public By patientModuleEditLabel = By.xpath("//label[@for='chkg9PatientEdit']");
	public By patientModuleDeleteLabel = By.xpath("//label[@for='chkg9PatientDelete']");
	public By patientTagEditPermissionLabel = By.xpath("//label[@for='chkg10PatientTagEdit']");

	// Reminder Result Action
	public void testReminderResultActionCannotBeAddedInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert driver.findElements(newReminderResultActionButton).isEmpty();
	}

	public void reminderResultActionShouldNotBeDeletableInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(deleteOption).isEmpty();
	}

	public void testReminderResultActionCannotBeEditedInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(editOption).isEmpty();
	}

	public void testReminderResultActionIsEditableInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		driver.findElement(bucketDropButton).click();
		driver.findElement(editOption).click();

		String reminderResultActionNameFieldValue = Hooks.prop.getProperty("reminderResultActionNameField");
		WebElement reminderResultActionNameFieldInput = driver.findElement(reminderResultActionNameField);
		reminderResultActionNameFieldInput.sendKeys(reminderResultActionNameFieldValue);

		driver.findElement(submitButton).click();
	}

	public void testReminderResultActionIsAddableInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		driver.findElement(newReminderResultActionButton).click();

		String reminderResultActionNameFieldValue = Hooks.prop.getProperty("reminderResultActionNameField");
		WebElement reminderResultActionNameFieldInput = driver.findElement(reminderResultActionNameField);
		reminderResultActionNameFieldInput.sendKeys(reminderResultActionNameFieldValue);

		driver.findElement(submitButton).click();
	}

	public void testReminderResultActionIsDeletableInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		driver.findElement(bucketDropButton).click();
		driver.findElement(deleteOption).click();
		driver.findElement(deleteConfirmButton).click();
	}

	public void testReminderResultActionIsViewableInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert !driver.findElements(nameLink).isEmpty();

	}

	public void openReminderResultActionsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ReminderResultActions"));
	}

	public void testReminderResultActionViewDeleteOnlyNoAddEditInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

		WebElement reminderResultActionAddElement = wait
				.until(ExpectedConditions.elementToBeClickable(reminderResultActionAddLabel));
		reminderResultActionAddElement.click();

		WebElement reminderResultActionEditElement = wait
				.until(ExpectedConditions.elementToBeClickable(reminderResultActionEditLabel));
		reminderResultActionEditElement.click();

		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void testReminderResultActionViewEditOnlyNoAddDeleteInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

		WebElement reminderResultActionAddElement = wait
				.until(ExpectedConditions.elementToBeClickable(reminderResultActionAddLabel));
		reminderResultActionAddElement.click();

		WebElement reminderResultActionDeleteElement = wait
				.until(ExpectedConditions.elementToBeClickable(reminderResultActionDeleteLabel));
		reminderResultActionDeleteElement.click();

		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void testReminderResultActionViewAddOnlyNoEditDeleteInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

		WebElement reminderResultActionEditElement = wait
				.until(ExpectedConditions.elementToBeClickable(reminderResultActionEditLabel));
		reminderResultActionEditElement.click();

		WebElement reminderResultActionDeleteElement = wait
				.until(ExpectedConditions.elementToBeClickable(reminderResultActionDeleteLabel));
		reminderResultActionDeleteElement.click();

		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	// Medication SyncReminder Color Code
	public void testMedicationSyncReminderColorCodeIsDeletableInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		driver.findElement(bucketDropButton).click();
		driver.findElement(deleteOption).click();
		driver.findElement(deleteConfirmButton).click();
	}

	public void testMedicationSyncReminderColorCodeCannotBeAddedInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert driver.findElements(newMedicationSyncColorButton).isEmpty();
	}

	public void testMedicationSyncReminderColorCodeCannotBeDeletedInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(deleteOption).isEmpty();
	}

	public void testMedicationSyncReminderColorCodeIsNotEditableInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(editOption).isEmpty();
	}

	public void verifyUserCanAddMedicationSyncReminderColorCode() {
		wait.until(ExpectedConditions.elementToBeClickable(newMedicationSyncColorButton)).click();
		String medicationSyncReminderColorCodeTitleValue = Hooks.prop
				.getProperty("medicationSyncReminderColorCodeTitle");
		WebElement medicationSyncReminderColorCodeTitleInput = driver.findElement(medicationSyncReminderColorCodeTitle);
		medicationSyncReminderColorCodeTitleInput.sendKeys(medicationSyncReminderColorCodeTitleValue);
		wait.until(ExpectedConditions.elementToBeClickable(saveColorCodeButton)).click();
	}

	public void testMedicationSyncReminderColorCodeIsEditableInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		driver.findElement(bucketDropButton).click();
		driver.findElement(editOption).click();

		String medicationSyncReminderColorCodeTitleValue = Hooks.prop
				.getProperty("medicationSyncReminderColorCodeTitle");
		WebElement medicationSyncReminderColorCodeTitleInput = driver.findElement(medicationSyncReminderColorCodeTitle);
		medicationSyncReminderColorCodeTitleInput.sendKeys(medicationSyncReminderColorCodeTitleValue);

		driver.findElement(saveButton).click();

	}

	public void verifyUserCanViewMedicationSyncReminderColorCode() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert !driver.findElements(titleHeader).isEmpty();

	}

	public void openMedicationSyncReminderColorCodesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/MedicationSyncReminderColorCodes"));
	}

	public void medicationSyncReminderColorCodeAccessControlViewDeleteOnlyInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

		WebElement addColorCodeLabelElement = wait.until(ExpectedConditions.elementToBeClickable(addColorCodeLabel));
		addColorCodeLabelElement.click();

		WebElement editCheckboxElement = wait.until(ExpectedConditions.elementToBeClickable(editColorCodeLabel));
		editCheckboxElement.click();

		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void testMedicationSyncReminderColorCodeViewEditOnlyNoAddDeleteInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

		WebElement addColorCodeLabelElement = wait.until(ExpectedConditions.elementToBeClickable(addColorCodeLabel));
		addColorCodeLabelElement.click();

		WebElement deleteCheckboxElement = wait.until(ExpectedConditions.elementToBeClickable(deleteColorCodeLabel));
		deleteCheckboxElement.click();

		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void createProfileWithViewAddOnlyAccessForMedicationSyncReminderColorCode() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

		WebElement editCheckboxElement = wait.until(ExpectedConditions.elementToBeClickable(editColorCodeLabel));
		editCheckboxElement.click();

		WebElement deleteCheckboxElement = wait.until(ExpectedConditions.elementToBeClickable(deleteColorCodeLabel));
		deleteCheckboxElement.click();

		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	// Sync Workflow Settings
	public void verifyUserCanDeleteSyncWorkflowSettings() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();

		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();

		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void verifyUserCannotAddSyncWorkflowSettings() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert driver.findElements(newMedicationSyncReminder).isEmpty();

	}

	public void verifyUserCanEditSyncWorkflowSettings() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();

		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();

		String titleFieldValue = Hooks.prop.getProperty("titleField");
		WebElement titleFieldInput = driver.findElement(titleField);
		titleFieldInput.sendKeys(titleFieldValue);

		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();

	}

	public void verifyUserCannotDeleteSyncWorkflowSettings() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(deleteOption).isEmpty();

	}

	public void assertNoEditAccessToSyncWorkflowSettings() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(editOption).isEmpty();

	}

	public void verifyUserCanAddSyncWorkflowSettings() {

		wait.until(ExpectedConditions.elementToBeClickable(newMedicationSyncReminder)).click();

		wait.until(ExpectedConditions.elementToBeClickable(dayTypeDropdown)).click();
		new Select(driver.findElement(dayTypeDropdown)).selectByIndex(1);

		wait.until(ExpectedConditions.elementToBeClickable(dayDropdown)).click();
		new Select(driver.findElement(dayDropdown)).selectByIndex(2);

		String titleFieldValue = Hooks.prop.getProperty("titleField");
		WebElement titleFieldInput = driver.findElement(titleField);
		titleFieldInput.sendKeys(titleFieldValue);

		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void assertUserViewAccessToSyncWorkflowSettings() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert !driver.findElements(dayTypeHeader).isEmpty();

	}

	public void openMedicationSyncReminderSettingPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/MedicationSyncReminderSetting"));
	}

	public void setupProfileViewDeleteNoAddEditSyncWorkflow() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

		WebElement addCheckboxElement = wait.until(ExpectedConditions.elementToBeClickable(addCheckboxLabel));
		addCheckboxElement.click();

		WebElement deleteCheckboxElement = wait.until(ExpectedConditions.elementToBeClickable(editCheckboxLabel));
		deleteCheckboxElement.click();

		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void setupProfileViewEditNoAddDeleteSyncWorkflow() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

		WebElement addCheckboxElement = wait.until(ExpectedConditions.elementToBeClickable(addCheckboxLabel));
		addCheckboxElement.click();

		WebElement deleteCheckboxElement = wait.until(ExpectedConditions.elementToBeClickable(deleteCheckboxLabel));
		deleteCheckboxElement.click();

		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void createProfileWithViewAddOnlyAccessForSyncWorkflowSettings() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

		WebElement editCheckboxElement = wait.until(ExpectedConditions.elementToBeClickable(editCheckboxLabel));
		editCheckboxElement.click();

		WebElement deleteCheckboxElement = wait.until(ExpectedConditions.elementToBeClickable(deleteCheckboxLabel));
		deleteCheckboxElement.click();

		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	// General
	public void verifyUserCannotViewWorkflowAuditSettings() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert driver.findElements(updatedDateHeader).isEmpty();

	}

	public void assertUserViewAccessToRxworkflowAuditView() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.presenceOfElementLocated(updatedDateHeader));
	}

	public void openWorkflowDashboardPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Workflow/Home/Dashboard"));
	}

	public rxworkflowpage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void openrxworkflowPage(String fullUrl, String expectedUrlFragment) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains(expectedUrlFragment));
	}

	public void createNoAccessProfileForWorkflowAuditViewTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement workflowAuditViewCheckboxElement = wait
				.until(ExpectedConditions.elementToBeClickable(workflowAuditViewCheckbox));
		workflowAuditViewCheckboxElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void createViewOnlyProfileForRxworkflowAuditView() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();
	}

	// ProfilePage
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

	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
