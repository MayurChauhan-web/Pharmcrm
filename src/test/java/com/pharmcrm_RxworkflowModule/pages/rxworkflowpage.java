package com.pharmcrm_RxworkflowModule.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import hooks.Hooks;

public class rxworkflowpage {
	private WebDriver driver;
	private WebDriverWait wait;

	// Action Work Flow
	// Action Work Flow

	
	// Display Work Flow
	public By showAllRunninglineCheckbox = By
			.xpath("//div[@class='runningLineCheckboxinner']//label[@for='Filter_IsShowAllRunningline']");
	public By detailsIcon = By.xpath("//tbody/tr[1]/td[17]/div[1]/a[2]//*[name()='svg']");
	public By starq1Label = By.xpath("//label[@class='Starq1Label']");
	public By filterButton = By.xpath("//span[normalize-space()='Filter']");
	public By rxNumberInput = By.xpath("//input[@id='Filter_RxNumber']");
	public By searchIcon = By.xpath("//i[@class='fa-solid fa-magnifying-glass']");
	public By addGridTemplateButton = By.xpath("//a[@class='md-trigger']//button[@type='button']//*[name()='svg']");
	public By gridTemplateNameInput = By.xpath("//input[@id='GridTemplate_Name']");
	public By editGridTemplateIcon = By.xpath("//*[name()='path' and @id='Union_2']");
	public By calloutField = By.xpath("//span[normalize-space()='# of Callout']");
	public By dropArea = By.xpath("//nav[@id='fieldsidebar1']");
	public By deleteGridTemplateIcon = By.xpath("//*[name()='path' and @id='Union_3']");
	public By showPastRunninglineCheckbox = By
			.xpath("//div[@class='runningLineCheckboxinner']//label[@for='Filter_IsShowPastRunningline']");
	public By companyDefaultCheckbox = By.xpath("//label[normalize-space()='Company Default']");
	public By paQueueLabel = By.xpath("//span[normalize-space()='PA Queue']");
	public By searchCollapseBtn = By.xpath("//a[@id='searchcollapse']");
	public By advancedSearchBtn = By.xpath("//span[normalize-space()='Advance Search']");
	public By pharmacyNabpInput = By.xpath("//input[@id='Filter_PharmacyNABP']");
	public By rxWorkflowAllLabel = By.xpath("//label[@for='chkg7RxWorkFlowAll']");
	public By displayWorkflowViewLabel = By.xpath("//label[@for='chkg7DisplayWorkFlowView']");
	public By advancedSearchButton = By.xpath("//span[normalize-space()='Advance Search']");
	public By deleteGridTemplateButton = By.xpath("//a[@id='deleteTemplate']//button[@type='button']//*[name()='svg']");
	public By companyDefaultIcon = By.xpath("//*[name()='path' and contains(@d,'M256 80c0-')]");
	public By programAccessIcon = By.xpath("//tbody/tr[1]/td[17]/div[1]/a[1]//*[name()='svg']");
	public By searchCollapseIcon = By.xpath("//a[@id='searchcollapse']//*[name()='svg']");
	public By advanceSearchIcon = By
			.xpath("//a[@id='advancecollapse']//*[name()='svg']//*[name()='path' and @id='Union_73']");

	// Sync Workflow
	public By syncWorkflowCommentIcon = By.xpath("//div[@id='syncWorkflowFilterGrid']//a[3]//img[1]");
	public By commentInput = By.xpath("//textarea[@id='txt_Comment']");
	public By saveCommentButton = By.xpath("//button[@id='btnSaveMedicationSyncDetails']");
	public By syncWorkflowAlertIcon = By.xpath("//div[@id='syncWorkflowFilterGrid']//a[3]//img[1]");
	public By alertCheckboxLabel = By.xpath("//label[normalize-space()='Alert?']");
	public By saveAlertButton = By.xpath("//button[@id='btnSaveMedicationSyncDetails']");
	public By exportExcelButton = By
			.xpath("//div[@id='syncWorkflowFilterGrid']//button[@type='button']//*[name()='path' and @id='Path_22']");
	public By commentLabel = By.xpath("//label[normalize-space()='Comment']");
	public By alertLabel = By.xpath("//label[normalize-space()='Alert']");
	public By syncWorkflowDownloadLabel = By.xpath("//label[@for='chkg6SyncWorkflowDownload']");
	public By syncWorkflowIcon = By.xpath("//div[@id='syncWorkflowFilterGrid']//a[3]//img[1]");
	public By syncWorkflowExportIcon = By
			.xpath("//div[@id='syncWorkflowFilterGrid']//button[@type='button']//*[name()='svg']");

	// Prescription Status
	public By prescriptionStatusAddLabel = By.xpath("//label[@for='chkg44PrescriptionStatusAdd']");
	public By prescriptionStatusEditLabel = By.xpath("//label[@for='chkg44PrescriptionStatusEdit']");
	public By prescriptionStatusDeleteLabel = By.xpath("//label[@for='chkg44PrescriptionStatusDelete']");
	public By newPrescriptionStatusBtn = By.xpath("//span[normalize-space()='New Prescription Status']");
	public By prescriptionStatusTitleInput = By.xpath("//input[@id='PrescriptionStatus_Title']");

	// Program 340B
	public By program340BAddLabel = By.xpath("//label[@for='chkg44Program340BAdd']");
	public By program340BEditLabel = By.xpath("//label[@for='chkg44Program340BEdit']");
	public By program340BDeleteLabel = By.xpath("//label[@for='chkg44Program340BDelete']");
	public By newProgram340BBtn = By.xpath("//span[normalize-space()='New 340B']");
	public By program340BNameInput = By.xpath("//input[@id='Program340B_Name']");

	// Outgoing Call Types
	public By outgoingCallAddLabel = By.xpath("//label[@for='chkg03OutgoingCallAdd']");
	public By outgoingCallEditLabel = By.xpath("//label[@for='chkg03OutgoingCallEdit']");
	public By outgoingCallDeleteLabel = By.xpath("//label[@for='chkg03OutgoingCallDelete']");
	public By outgoingCallTypeLink = By.xpath("//a[normalize-space()='Outgoing Call Type']");
	public By newOutgoingCallTypeBtn = By.xpath("//span[normalize-space()='New Outgoing Call Type']");
	public By outgoingCallTypeInput = By.xpath("//input[@id='OutgoingCall_CallTypeText']");

	// Incoming Call Types
	public By incomingCallAddLabel = By.xpath("//label[@for='chkg03IncomingCallAdd']");
	public By incomingCallEditLabel = By.xpath("//label[@for='chkg03IncomingCallEdit']");
	public By incomingCallDeleteLabel = By.xpath("//label[@for='chkg03IncomingCallDelete']");
	public By incomingCallTypeLink = By.xpath("//a[normalize-space()='Incoming Call Type']");
	public By newIncomingCallTypesBtn = By.xpath("//span[normalize-space()='New InComing Call Types']");
	public By incomingCallTypeInput = By.xpath("//input[@id='IncomingCall_CallTypeText']");

	// Runningline Level2 Status
	public By runninglineLevel2StatusAddLabel = By.xpath("//label[@for='chkg02RunninglineLevel2StatusAdd']");
	public By runninglineLevel2StatusEditLabel = By.xpath("//label[@for='chkg02RunninglineLevel2StatusEdit']");
	public By runninglineLevel2StatusDeleteLabel = By.xpath("//label[@for='chkg02RunninglineLevel2StatusDelete']");
	public By level2Link = By.xpath("//a[normalize-space()='Level 2']");
	public By newRunninglineLevel2StatusBtn = By.xpath("//span[normalize-space()='New Runningline Level-2 Status']");
	public By runninglineStatus2Dropdown = By.xpath("//select[@id='RunninglineLevel2Status_RunninglineStatus_Id']");
	public By level1Dropdown = By.xpath("//select[@id='RunninglineLevel2Status_Level1_Id']");
	public By runninglineLevel2Input = By.xpath("//input[@id='RunninglineLevel2Status_Level2']");

	// Runningline Level1 Status
	public By runninglineLevel1StatusAddLabel = By.xpath("//label[@for='chkg02RunninglineLevel1StatusAdd']");
	public By runninglineLevel1StatusEditLabel = By.xpath("//label[@for='chkg02RunninglineLevel1StatusEdit']");
	public By runninglineLevel1StatusDeleteLabel = By.xpath("//label[@for='chkg02RunninglineLevel1StatusDelete']");
	public By newRunninglineLevel1StatusBtn = By.xpath("//span[normalize-space()='New Runningline Level-1 Status']");
	public By runninglineStatusDropdown = By.xpath("//select[@id='RunninglineLevel1Status_RunninglineStatus_Id']");
	public By runninglineLevel1Input = By.xpath("//input[@id='RunninglineLevel1Status_Level1']");

	// Runningline Status
	public By runningLineStatusAddLabel = By.xpath("//label[@for='chkg01RunningLineStatusAdd']");
	public By runningLineStatusEditLabel = By.xpath("//label[@for='chkg01RunningLineStatusEdit']");
	public By runningLineStatusDeleteLabel = By.xpath("//label[@for='chkg01RunningLineStatusDelete']");
	public By newRunninglineStatusBtn = By.xpath("//span[normalize-space()='New Runningline Status']");
	public By runninglineStatusNameInput = By.xpath("//input[@id='RunninglineStatus_Name']");

	// Queue
	public By queueAddLabel = By.xpath("//label[@for='chkg01QueueAdd']");
	public By queueEditLabel = By.xpath("//label[@for='chkg01QueueEdit']");
	public By queueDeleteLabel = By.xpath("//label[@for='chkg01QueueDelete']");
	public By newQueueBtn = By.xpath("//span[normalize-space()='New Queue']");
	public By queueNameInput = By.xpath("//input[@id='Queue_Name']");
	public By queueLabelInput = By.xpath("//input[@id='Queue_Label']");

	// Followup Trail Script
	public By followupTrailScriptAddLabel = By.xpath("//label[@for='chkg35FollowupTrailScriptAdd']");
	public By followupTrailScriptEditLabel = By.xpath("//label[@for='chkg35FollowupTrailScriptEdit']");
	public By followupTrailScriptDeleteLabel = By.xpath("//label[@for='chkg35FollowupTrailScriptDelete']");
	public By titleLink = By.xpath("//a[normalize-space()='Title']");
	public By newCallScriptBtn = By.xpath("//span[normalize-space()='New Call Script']");
	public By callScriptTitleInput = By.xpath("//input[@id='CallScript_Title']");
	public By callScriptDescriptionInput = By.xpath("//textarea[@id='CallScript_Description']");

	// Transfer Result Action
	public By transferResultActionAddLabel = By.xpath("//label[@for='chkg20TransferResultActionAdd']");
	public By transferResultActionEditLabel = By.xpath("//label[@for='chkg20TransferResultActionEdit']");
	public By transferResultActionDeleteLabel = By.xpath("//label[@for='chkg20TransferResultActionDelete']");
	public By newTransferResultActionBtn = By.xpath("//span[normalize-space()='New Transfer Result Action']");
	public By transferResultActionNameInput = By.xpath("//input[@id='TransferResultAction_Name']");
	public By transferResultActionNotesInput = By.xpath("//textarea[@id='TransferResultAction_Notes']");

	// Failure Result Action
	public By newFailureResultActionBtn = By.xpath("//span[normalize-space()='New Failure Result Action']");
	public By failureResultActionNameInput = By.xpath("//input[@id='FailureResultAction_Name']");
	public By failureResultActionNotesInput = By.xpath("//textarea[@id='FailureResultAction_Notes']");
	public By failureResultActionAddLabel = By.xpath("//label[@for='chkg19FailureResultActionAdd']");
	public By failureResultActionEditLabel = By.xpath("//label[@for='chkg19FailureResultActionEdit']");
	public By failureResultActionDeleteLabel = By.xpath("//label[@for='chkg19FailureResultActionDelete']");

	// Success Result Action
	public By successResultActionAddLabel = By.xpath("//label[@for='chkg19SuccessResultActionAdd']");
	public By successResultActionEditLabel = By.xpath("//label[@for='chkg19SuccessResultActionEdit']");
	public By successResultActionDeleteLabel = By.xpath("//label[@for='chkg19SuccessResultActionDelete']");
	public By newSuccessResultActionButton = By.xpath("//span[normalize-space()='New Success Result Action']");
	public By successResultActionNameField = By.id("SuccessResultAction_Name");
	public By successResultActionNotesField = By.id("SuccessResultAction_Notes");

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

	// Display Work Flow
	public void shouldCreateProfileWithOnlyViewPermissionInDisplayWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();

		WebElement allLabelElement = wait.until(ExpectedConditions.elementToBeClickable(rxWorkflowAllLabel));
		allLabelElement.click();

		WebElement viewLabelElement = wait.until(ExpectedConditions.elementToBeClickable(displayWorkflowViewLabel));
		viewLabelElement.click();

		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void shouldAllowExportingDisplayWorkflowDataToExcel() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		wait.until(ExpectedConditions.elementToBeClickable(exportExcelButton)).click();
	}

	public void shouldRestrictExportingDisplayWorkflowDataToExcel() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		wait.until(ExpectedConditions.elementToBeClickable(searchCollapseIcon)).click();

		List<WebElement> elements = driver.findElements(advanceSearchIcon);

		Assert.assertTrue(elements.isEmpty());

	}

	public void shouldRestrictPharmacyNabpSearchesInDisplayWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		List<WebElement> elements = driver.findElements(exportExcelButton);

		Assert.assertTrue(elements.isEmpty());

	}

	public void shouldAllowPharmacyNabpSearchesInDisplayWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		wait.until(ExpectedConditions.elementToBeClickable(searchCollapseBtn)).click();

		wait.until(ExpectedConditions.elementToBeClickable(advancedSearchBtn)).click();

		String pharmacyNabpValue = Hooks.prop.getProperty("pharmacyNabp");
		WebElement pharmacyNabpInputField = driver.findElement(pharmacyNabpInput);
		pharmacyNabpInputField.sendKeys(pharmacyNabpValue);

		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	}

	public void shouldAllowFullProgramAccessInDisplayWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(paQueueLabel));

		Assert.assertTrue(element.isDisplayed());
	}

	public void shouldAllowSettingGridTemplateCompanyDefaultCheckboxInDisplayWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		wait.until(ExpectedConditions.elementToBeClickable(addGridTemplateButton)).click();

		String gridTemplateNameValue = Hooks.prop.getProperty("gridTemplateName");
		WebElement gridTemplateNameInputField = driver.findElement(gridTemplateNameInput);
		gridTemplateNameInputField.sendKeys(gridTemplateNameValue);

		wait.until(ExpectedConditions.elementToBeClickable(companyDefaultCheckbox)).click();

		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	}

	public void shouldAllowTogglingShowPastRunninglinesCheckboxInDisplayWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(showPastRunninglineCheckbox)).click();

	}

	public void shouldAllowTogglingShowAllRunninglinesCheckboxInDisplayWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(showAllRunninglineCheckbox)).click();

	}

	public void shouldAllowDeletingGridTemplatesInDisplayWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		wait.until(ExpectedConditions.elementToBeClickable(deleteGridTemplateIcon)).click();

		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();

	}

	public void shouldAllowEditingGridTemplatesInDisplayWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(editGridTemplateIcon)).click();
		WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(calloutField));
		WebElement target = wait.until(ExpectedConditions.visibilityOfElementLocated(dropArea));
		Actions act = new Actions(driver);
		act.clickAndHold(field).moveToElement(target).release().build().perform();

	}

	public void shouldAllowAddingGridTemplatesInDisplayWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		wait.until(ExpectedConditions.elementToBeClickable(addGridTemplateButton)).click();

		String gridTemplateNameValue = Hooks.prop.getProperty("gridTemplateName");
		WebElement gridTemplateNameInputField = driver.findElement(gridTemplateNameInput);
		gridTemplateNameInputField.sendKeys(gridTemplateNameValue);

		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

	}

	public void shouldAllowAdvancedSearchInDisplayWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		WebElement filter = wait.until(ExpectedConditions.visibilityOfElementLocated(filterButton));
		Assert.assertTrue(filter.isDisplayed());

		wait.until(ExpectedConditions.elementToBeClickable(filterButton)).click();

		String rxNumberValue = Hooks.prop.getProperty("rxNumber");
		WebElement rxNumberInputField = driver.findElement(rxNumberInput);
		rxNumberInputField.sendKeys(rxNumberValue);

		wait.until(ExpectedConditions.elementToBeClickable(searchIcon)).click();

	}

	public void shouldRestrictAddingGridTemplatesInDisplayWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		List<WebElement> elements = driver.findElements(addGridTemplateButton);

		Assert.assertTrue(elements.isEmpty());

	}

	public void shouldRestrictDeletingGridTemplatesInDisplayWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		List<WebElement> elements = driver.findElements(deleteGridTemplateButton);

		Assert.assertTrue(elements.isEmpty());

	}

	public void shouldRestrictTogglingShowAllRunninglinesCheckboxInDisplayWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		List<WebElement> elements = driver.findElements(showAllRunninglineCheckbox);

		Assert.assertTrue(elements.isEmpty());

	}

	public void shouldRestrictSettingGridTemplateCompanyDefaultCheckboxInDisplayWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		List<WebElement> elements = driver.findElements(companyDefaultIcon);

		Assert.assertTrue(elements.isEmpty());

	}

	public void shouldRestrictFullProgramAccessInDisplayWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		List<WebElement> elements = driver.findElements(programAccessIcon);

		Assert.assertTrue(elements.isEmpty());

	}

	public void shouldRestrictTogglingShowPastRunninglinesCheckboxInDisplayWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		List<WebElement> elements = driver.findElements(showPastRunninglineCheckbox);

		Assert.assertTrue(elements.isEmpty());

	}

	public void shouldRestrictEditingGridTemplatesInDisplayWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		List<WebElement> elements = driver.findElements(editGridTemplateIcon);

		Assert.assertTrue(elements.isEmpty());

	}

	public void shouldRestrictAdvancedSearchesInDisplayWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		wait.until(ExpectedConditions.elementToBeClickable(filterButton)).click();

		List<WebElement> elements = driver.findElements(advancedSearchButton);

		Assert.assertTrue(elements.isEmpty());

	}

	public void shouldRestrictViewingDetailsInDisplayWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		List<WebElement> elements = driver.findElements(showAllRunninglineCheckbox);
		Assert.assertTrue(elements.isEmpty());

	}

	public void shouldAllowViewingDetailsInDisplayWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		wait.until(ExpectedConditions.elementToBeClickable(showAllRunninglineCheckbox)).click();

		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(detailsIcon));

		Assert.assertTrue(element.isDisplayed());
	}

	public void shouldAllowViewingDisplayWorkflowData() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert !driver.findElements(starq1Label).isEmpty();

	}

	public void openDashboardPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Workflow/Home/Dashboard"));
	}

	public void shouldAllowAllAdditionalAccessInDisplayWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();

		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	// Sync Workflow
	public void shouldNotAllowExportingSyncWorkflowDataToExcel() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert driver.findElements(syncWorkflowExportIcon).isEmpty();
	}

	public void shouldNotAllowReceivingAlertsInSyncWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert driver.findElements(syncWorkflowIcon).isEmpty();
	}

	public void shouldNotAllowCommentingInSyncWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert driver.findElements(syncWorkflowIcon).isEmpty();
	}

	public void testSyncWorkflowModulePermissionsViewOnlyNoCommentAlertExport() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement commentElement = wait.until(ExpectedConditions.elementToBeClickable(commentLabel));
		commentElement.click();

		WebElement alertElement = wait.until(ExpectedConditions.elementToBeClickable(alertLabel));
		alertElement.click();

		WebElement downloadElement = wait.until(ExpectedConditions.elementToBeClickable(syncWorkflowDownloadLabel));
		downloadElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void shouldAllowExportingSyncWorkflowDataToExcel() {

		wait.until(ExpectedConditions.elementToBeClickable(exportExcelButton)).click();

	}

	public void shouldAllowReceivingAlertsInSyncWorkflowModule() {

		wait.until(ExpectedConditions.elementToBeClickable(syncWorkflowAlertIcon)).click();

		wait.until(ExpectedConditions.elementToBeClickable(alertCheckboxLabel)).click();

		wait.until(ExpectedConditions.elementToBeClickable(saveAlertButton)).click();

	}

	public void shouldAllowCommentingInSyncWorkflowModule() {

		wait.until(ExpectedConditions.elementToBeClickable(syncWorkflowCommentIcon)).click();

		String commentValue = Hooks.prop.getProperty("comment");
		WebElement commentInputField = driver.findElement(commentInput);
		commentInputField.sendKeys(commentValue);

		wait.until(ExpectedConditions.elementToBeClickable(saveCommentButton)).click();
	}

	public void openMedicationSyncPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Workflow/Home/MedicationSyncReminder"));
	}

	public void shouldAllowViewCommentAlertExportOnlyInSyncWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	// Prescription Status
	public void shouldAllowDeletingPrescriptionStatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();

		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();

		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();

	}

	public void shouldRestrictAddAndEditForPrescriptionStatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

		WebElement addActionElement = wait.until(ExpectedConditions.elementToBeClickable(prescriptionStatusAddLabel));
		addActionElement.click();

		WebElement editActionElement = wait.until(ExpectedConditions.elementToBeClickable(prescriptionStatusEditLabel));
		editActionElement.click();

		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void shouldNotAllowAddingPrescriptionStatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert driver.findElements(newPrescriptionStatusBtn).isEmpty();

	}

	public void shouldAllowEditingPrescriptionStatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();

		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();

		String prescriptionStatusTitleValue = Hooks.prop.getProperty("prescriptionStatusTitle");
		WebElement prescriptionStatusTitleInputField = driver.findElement(prescriptionStatusTitleInput);
		prescriptionStatusTitleInputField.sendKeys(prescriptionStatusTitleValue);

		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

	}

	public void shouldRestrictAddAndDeleteForPrescriptionStatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

		WebElement addActionElement = wait.until(ExpectedConditions.elementToBeClickable(prescriptionStatusAddLabel));
		addActionElement.click();

		WebElement deleteActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(prescriptionStatusDeleteLabel));
		deleteActionElement.click();

		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void shouldNotAllowDeletingPrescriptionStatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(deleteOption).isEmpty();

	}

	public void shouldNotAllowEditingPrescriptionStatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(editOption).isEmpty();

	}

	public void shouldAllowAddingPrescriptionStatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

		wait.until(ExpectedConditions.elementToBeClickable(newPrescriptionStatusBtn)).click();

		String prescriptionStatusTitleValue = Hooks.prop.getProperty("prescriptionStatusTitle");
		WebElement prescriptionStatusTitleInputField = driver.findElement(prescriptionStatusTitleInput);
		prescriptionStatusTitleInputField.sendKeys(prescriptionStatusTitleValue);

		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

	}

	public void shouldAllowViewingPrescriptionStatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert !driver.findElements(titleLink).isEmpty();

	}

	public void openPrescriptionStatusPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PrescriptionStatuses"));
	}

	public void shouldRestrictEditAndDeleteForPrescriptionStatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

		WebElement editActionElement = wait.until(ExpectedConditions.elementToBeClickable(prescriptionStatusEditLabel));
		editActionElement.click();

		WebElement deleteActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(prescriptionStatusDeleteLabel));
		deleteActionElement.click();

		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	// Program 340B
	public void shouldAllowDeletingProgram340BInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();

	}

	public void shouldRestrictAddAndEditForProgram340BInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement addActionElement = wait.until(ExpectedConditions.elementToBeClickable(program340BAddLabel));
		addActionElement.click();

		WebElement editActionElement = wait.until(ExpectedConditions.elementToBeClickable(program340BEditLabel));
		editActionElement.click();

		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void shouldNotAllowAddingProgram340BInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert driver.findElements(newProgram340BBtn).isEmpty();

	}

	public void shouldAllowEditingProgram340BInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		String program340BNameValue = Hooks.prop.getProperty("program340BName");
		WebElement program340BNameInputField = driver.findElement(program340BNameInput);
		program340BNameInputField.sendKeys(program340BNameValue);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

	}

	public void shouldRestrictAddAndDeleteForProgram340BInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement addActionElement = wait.until(ExpectedConditions.elementToBeClickable(program340BAddLabel));
		addActionElement.click();
		WebElement deleteActionElement = wait.until(ExpectedConditions.elementToBeClickable(program340BDeleteLabel));
		deleteActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void shouldNotAllowDeletingProgram340BInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(deleteOption).isEmpty();

	}

	public void shouldNotAllowEditingProgram340BInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(editOption).isEmpty();

	}

	public void shouldAllowAddingProgram340BInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(newProgram340BBtn)).click();
		String program340BNameValue = Hooks.prop.getProperty("program340BName");
		WebElement program340BNameInputField = driver.findElement(program340BNameInput);
		program340BNameInputField.sendKeys(program340BNameValue);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

	}

	public void openProgram340BPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Program340Bs"));
	}

	public void shouldRestrictEditAndDeleteForProgram340BInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement editActionElement = wait.until(ExpectedConditions.elementToBeClickable(program340BEditLabel));
		editActionElement.click();
		WebElement deleteActionElement = wait.until(ExpectedConditions.elementToBeClickable(program340BDeleteLabel));
		deleteActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	// Outgoing Call Types
	public void shouldAllowDeletingOutgoingCallTypesInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();

	}

	public void shouldRestrictAddAndEditForOutgoingCallTypesInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement addActionElement = wait.until(ExpectedConditions.elementToBeClickable(outgoingCallAddLabel));
		addActionElement.click();
		WebElement editActionElement = wait.until(ExpectedConditions.elementToBeClickable(outgoingCallEditLabel));
		editActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void shouldNotAllowAddingOutgoingCallTypesInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert driver.findElements(newOutgoingCallTypeBtn).isEmpty();

	}

	public void shouldAllowEditingOutgoingCallTypesInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		String outgoingCallTypeValue = Hooks.prop.getProperty("outgoingCallType");
		WebElement outgoingCallTypeInputField = driver.findElement(outgoingCallTypeInput);
		outgoingCallTypeInputField.sendKeys(outgoingCallTypeValue);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	}

	public void shouldNotAllowDeletingOutgoingCallTypesInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(deleteOption).isEmpty();

	}

	public void shouldNotAllowEditingOutgoingCallTypesInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(editOption).isEmpty();

	}

	public void shouldAllowAddingOutgoingCallTypesInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(newOutgoingCallTypeBtn)).click();
		String outgoingCallTypeValue = Hooks.prop.getProperty("outgoingCallType");
		WebElement outgoingCallTypeInputField = driver.findElement(outgoingCallTypeInput);
		outgoingCallTypeInputField.sendKeys(outgoingCallTypeValue);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	}

	public void shouldAllowViewingOutgoingCallTypesInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert !driver.findElements(outgoingCallTypeLink).isEmpty();

	}

	public void openOutgoingCallTypesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/OutgoingCalls"));
	}

	public void shouldRestrictAddAndDeleteForOutgoingCallTypesInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement addActionElement = wait.until(ExpectedConditions.elementToBeClickable(outgoingCallAddLabel));
		addActionElement.click();
		WebElement deleteActionElement = wait.until(ExpectedConditions.elementToBeClickable(outgoingCallDeleteLabel));
		deleteActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void shouldRestrictEditAndDeleteForOutgoingCallTypesInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement editActionElement = wait.until(ExpectedConditions.elementToBeClickable(outgoingCallEditLabel));
		editActionElement.click();
		WebElement deleteActionElement = wait.until(ExpectedConditions.elementToBeClickable(outgoingCallDeleteLabel));
		deleteActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	// Incoming Call Types
	public void shouldAllowDeletingIncomingCallTypesInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void shouldRestrictAddAndEditForIncomingCallTypesInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement addActionElement = wait.until(ExpectedConditions.elementToBeClickable(incomingCallAddLabel));
		addActionElement.click();
		WebElement editActionElement = wait.until(ExpectedConditions.elementToBeClickable(incomingCallEditLabel));
		editActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void shouldNotAllowAddingIncomingCallTypesInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert driver.findElements(newIncomingCallTypesBtn).isEmpty();

	}

	public void shouldAllowEditingIncomingCallTypesInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		String incomingCallTypeValue = Hooks.prop.getProperty("incomingCallType");
		WebElement incomingCallTypeInputField = driver.findElement(incomingCallTypeInput);
		incomingCallTypeInputField.sendKeys(incomingCallTypeValue);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();

	}

	public void shouldNotAllowDeletingIncomingCallTypesInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(deleteOption).isEmpty();

	}

	public void shouldNotAllowEditingIncomingCallTypesInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(editOption).isEmpty();

	}

	public void shouldAllowAddingIncomingCallTypesInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(newIncomingCallTypesBtn)).click();
		String incomingCallTypeValue = Hooks.prop.getProperty("incomingCallType");
		WebElement incomingCallTypeInputField = driver.findElement(incomingCallTypeInput);
		incomingCallTypeInputField.sendKeys(incomingCallTypeValue);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	}

	public void shouldAllowViewingIncomingCallTypesInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert !driver.findElements(incomingCallTypeLink).isEmpty();

	}

	public void openIncomingCallTypesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/IncomingCalls"));
	}

	public void shouldRestrictAddAndDeleteForIncomingCallTypesInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement addActionElement = wait.until(ExpectedConditions.elementToBeClickable(incomingCallAddLabel));
		addActionElement.click();
		WebElement deleteActionElement = wait.until(ExpectedConditions.elementToBeClickable(incomingCallDeleteLabel));
		deleteActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void shouldRestrictEditAndDeleteForIncomingCallTypesInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement editActionElement = wait.until(ExpectedConditions.elementToBeClickable(incomingCallEditLabel));
		editActionElement.click();
		WebElement deleteActionElement = wait.until(ExpectedConditions.elementToBeClickable(incomingCallDeleteLabel));
		deleteActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	// Runningline Level2 Status
	public void shouldAllowDeletingRunninglineLevel2StatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void shouldNotAllowAddingRunninglineLevel2StatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert driver.findElements(newRunninglineLevel2StatusBtn).isEmpty();

	}

	public void shouldAllowEditingRunninglineLevel2StatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		WebElement statusDropdown = wait.until(ExpectedConditions.elementToBeClickable(runninglineStatus2Dropdown));
		new Select(statusDropdown).selectByIndex(1);
		WebElement level1DropdownElement = wait.until(ExpectedConditions.elementToBeClickable(level1Dropdown));
		new Select(level1DropdownElement).selectByIndex(1);
		String runninglineLevel2Value = Hooks.prop.getProperty("runninglineLevel2");
		WebElement runninglineLevel2InputField = driver.findElement(runninglineLevel2Input);
		runninglineLevel2InputField.sendKeys(runninglineLevel2Value);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	}

	public void shouldRestrictAddAndEditForRunninglineLevel2StatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement addActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(runninglineLevel2StatusAddLabel));
		addActionElement.click();
		WebElement editActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(runninglineLevel2StatusEditLabel));
		editActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void shouldRestrictAddAndDeleteForRunninglineLevel2StatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement addActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(runninglineLevel2StatusAddLabel));
		addActionElement.click();
		WebElement deleteActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(runninglineLevel2StatusDeleteLabel));
		deleteActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void shouldNotAllowDeletingRunninglineLevel2StatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(deleteOption).isEmpty();

	}

	public void shouldNotAllowEditingRunninglineLevel2StatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(editOption).isEmpty();

	}

	public void shouldAllowAddingRunninglineLevel2StatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(newRunninglineLevel2StatusBtn)).click();
		WebElement statusDropdown = wait.until(ExpectedConditions.elementToBeClickable(runninglineStatus2Dropdown));
		new Select(statusDropdown).selectByIndex(1);
		WebElement level1DropdownElement = wait.until(ExpectedConditions.elementToBeClickable(level1Dropdown));
		new Select(level1DropdownElement).selectByIndex(1);
		String runninglineLevel2Value = Hooks.prop.getProperty("runninglineLevel2");
		WebElement runninglineLevel2InputField = driver.findElement(runninglineLevel2Input);
		runninglineLevel2InputField.sendKeys(runninglineLevel2Value);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	}

	public void shouldAllowViewingRunninglineLevel2StatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert !driver.findElements(level2Link).isEmpty();

	}

	public void openRunninglineLevel2StatusPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RunninglineLevel2Statuses"));
	}

	public void shouldRestrictEditAndDeleteForRunninglineLevel2StatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement editActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(runninglineLevel2StatusEditLabel));
		editActionElement.click();
		WebElement deleteActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(runninglineLevel2StatusDeleteLabel));
		deleteActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	// Runningline Level1 Status
	public void shouldAllowDeletingRunninglineLevel1StatusInWorkflowModule() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void shouldRestrictAddAndEditForRunninglineLevel1StatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement addActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(runninglineLevel1StatusAddLabel));
		addActionElement.click();
		WebElement editActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(runninglineLevel1StatusEditLabel));
		editActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void shouldNotAllowAddingRunninglineLevel1StatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert driver.findElements(newRunninglineLevel1StatusBtn).isEmpty();

	}

	public void shouldAllowEditingRunninglineLevel1StatusInWorkflowModule() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		String runninglineLevel1Value = Hooks.prop.getProperty("runninglineLevel1");
		WebElement runninglineLevel1InputField = driver.findElement(runninglineLevel1Input);
		runninglineLevel1InputField.sendKeys(runninglineLevel1Value);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	}

	public void shouldRestrictAddAndDeleteForRunninglineLevel1StatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement addActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(runninglineLevel1StatusAddLabel));
		addActionElement.click();
		WebElement deleteActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(runninglineLevel1StatusDeleteLabel));
		deleteActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void shouldNotAllowDeletingRunninglineLevel1StatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(deleteOption).isEmpty();

	}

	public void shouldNotAllowEditingRunninglineLevel1StatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(editOption).isEmpty();

	}

	public void shouldAllowAddingRunninglineLevel1StatusInWorkflowModule() {
		wait.until(ExpectedConditions.elementToBeClickable(newRunninglineLevel1StatusBtn)).click();
		WebElement dropdownElement = wait.until(ExpectedConditions.elementToBeClickable(runninglineStatusDropdown));
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByIndex(1);
		String runninglineLevel1Value = Hooks.prop.getProperty("runninglineLevel1");
		WebElement runninglineLevel1InputField = driver.findElement(runninglineLevel1Input);
		runninglineLevel1InputField.sendKeys(runninglineLevel1Value);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	}

	public void openRunninglineLevel1StatusPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RunninglineLevel1Statuses"));
	}

	public void shouldRestrictEditAndDeleteForRunninglineLevel1StatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement editActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(runninglineLevel1StatusEditLabel));
		editActionElement.click();
		WebElement deleteActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(runninglineLevel1StatusDeleteLabel));
		deleteActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	// Runningline Status
	public void shouldAllowDeletingRunninglineStatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void shouldNotAllowAddingRunninglineStatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert driver.findElements(newRunninglineStatusBtn).isEmpty();

	}

	public void shouldAllowEditingRunninglineStatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		String runninglineStatusNameValue = Hooks.prop.getProperty("runninglineStatusName");
		WebElement runninglineStatusNameInputField = driver.findElement(runninglineStatusNameInput);
		runninglineStatusNameInputField.sendKeys(runninglineStatusNameValue);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();

	}

	public void shouldRestrictAddAndEditForRunninglineStatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement addActionElement = wait.until(ExpectedConditions.elementToBeClickable(runningLineStatusAddLabel));
		addActionElement.click();
		WebElement editActionElement = wait.until(ExpectedConditions.elementToBeClickable(runningLineStatusEditLabel));
		editActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void shouldRestrictAddAndDeleteForRunninglineStatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement addActionElement = wait.until(ExpectedConditions.elementToBeClickable(runningLineStatusAddLabel));
		addActionElement.click();
		WebElement deleteActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(runningLineStatusDeleteLabel));
		deleteActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void shouldNotAllowDeletingRunninglineStatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(deleteOption).isEmpty();

	}

	public void shouldNotAllowEditingRunninglineStatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(editOption).isEmpty();

	}

	public void shouldAllowAddingRunninglineStatusInWorkflowModule() {
		wait.until(ExpectedConditions.elementToBeClickable(newRunninglineStatusBtn)).click();
		String runninglineStatusNameValue = Hooks.prop.getProperty("runninglineStatusName");
		WebElement runninglineStatusNameInputField = driver.findElement(runninglineStatusNameInput);
		runninglineStatusNameInputField.sendKeys(runninglineStatusNameValue);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

	}

	public void openRunninglineStatusPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RunninglineStatuses"));
	}

	public void verifyRunninglineStatusCanBeViewedInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert !driver.findElements(nameLink).isEmpty();

	}

	public void shouldRestrictEditAndDeleteForRunninglineStatusInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement editActionElement = wait.until(ExpectedConditions.elementToBeClickable(runningLineStatusEditLabel));
		editActionElement.click();
		WebElement deleteActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(runningLineStatusDeleteLabel));
		deleteActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	// Queue
	public void shouldAllowDeletingQueueInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void shouldRestrictAddAndEditForQueueInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement addActionElement = wait.until(ExpectedConditions.elementToBeClickable(queueAddLabel));
		addActionElement.click();
		WebElement editActionElement = wait.until(ExpectedConditions.elementToBeClickable(queueEditLabel));
		editActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void shouldNotAllowAddingQueueInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert driver.findElements(newQueueBtn).isEmpty();

	}

	public void shouldAllowEditingQueueInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		String queueNameValue = Hooks.prop.getProperty("queueName");
		WebElement queueNameInputField = driver.findElement(queueNameInput);
		queueNameInputField.sendKeys(queueNameValue);
		String queueLabelValue = Hooks.prop.getProperty("queueLabel");
		WebElement queueLabelInputField = driver.findElement(queueLabelInput);
		queueLabelInputField.sendKeys(queueLabelValue);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	}

	public void shouldNotAllowDeletingQueueInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(deleteOption).isEmpty();

	}

	public void shouldNotAllowEditingQueueInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(editOption).isEmpty();

	}

	public void shouldAllowAddingQueueInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(newQueueBtn)).click();
		String queueNameValue = Hooks.prop.getProperty("queueName");
		WebElement queueNameInputField = driver.findElement(queueNameInput);
		queueNameInputField.sendKeys(queueNameValue);
		String queueLabelValue = Hooks.prop.getProperty("queueLabel");
		WebElement queueLabelInputField = driver.findElement(queueLabelInput);
		queueLabelInputField.sendKeys(queueLabelValue);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	}

	public void shouldAllowViewingQueueInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert !driver.findElements(nameLink).isEmpty();

	}

	public void openQueuesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Queues"));
	}

	public void shouldRestrictAddAndDeleteForQueueInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement addActionElement = wait.until(ExpectedConditions.elementToBeClickable(queueAddLabel));
		addActionElement.click();
		WebElement deleteActionElement = wait.until(ExpectedConditions.elementToBeClickable(queueDeleteLabel));
		deleteActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void shouldRestrictEditAndDeleteForQueueInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement editActionElement = wait.until(ExpectedConditions.elementToBeClickable(queueEditLabel));
		editActionElement.click();
		WebElement deleteActionElement = wait.until(ExpectedConditions.elementToBeClickable(queueDeleteLabel));
		deleteActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	// Followup Trail Script
	public void shouldAllowDeletingFollowupTrailScriptInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void shouldRestrictAddAndEditForFollowupTrailScriptInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement addActionElement = wait.until(ExpectedConditions.elementToBeClickable(followupTrailScriptAddLabel));
		addActionElement.click();
		WebElement editActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(followupTrailScriptEditLabel));
		editActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void shouldNotAllowAddingFollowupTrailScriptInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert driver.findElements(newCallScriptBtn).isEmpty();
	}

	public void shouldAllowEditingFollowupTrailScriptInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		String callScriptTitleValue = Hooks.prop.getProperty("callScriptTitle");
		WebElement callScriptTitleInputField = driver.findElement(callScriptTitleInput);
		callScriptTitleInputField.sendKeys(callScriptTitleValue);
		String callScriptDescriptionValue = Hooks.prop.getProperty("callScriptDescription");
		WebElement callScriptDescriptionInputField = driver.findElement(callScriptDescriptionInput);
		callScriptDescriptionInputField.sendKeys(callScriptDescriptionValue);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

	}

	public void shouldNotAllowDeletingFollowupTrailScriptInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(deleteOption).isEmpty();
	}

	public void shouldNotAllowEditingFollowupTrailScriptInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(editOption).isEmpty();

	}

	public void shouldAddFollowupTrailScriptInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(newCallScriptBtn)).click();
		String callScriptTitleValue = Hooks.prop.getProperty("callScriptTitle");
		WebElement callScriptTitleInputField = driver.findElement(callScriptTitleInput);
		callScriptTitleInputField.sendKeys(callScriptTitleValue);
		String callScriptDescriptionValue = Hooks.prop.getProperty("callScriptDescription");
		WebElement callScriptDescriptionInputField = driver.findElement(callScriptDescriptionInput);
		callScriptDescriptionInputField.sendKeys(callScriptDescriptionValue);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	}

	public void verifyFollowupTrailScriptVisibleInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert !driver.findElements(titleLink).isEmpty();

	}

	public void openCallScriptsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/CallScripts"));
	}

	public void verifyProfileWithViewEditCannotAddOrDeleteFollowupTrailScript() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement addActionElement = wait.until(ExpectedConditions.elementToBeClickable(followupTrailScriptAddLabel));
		addActionElement.click();
		WebElement deleteActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(followupTrailScriptDeleteLabel));
		deleteActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void testProfileAccessFollowupTrailScriptViewAddOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement editActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(followupTrailScriptEditLabel));
		editActionElement.click();
		WebElement deleteActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(followupTrailScriptDeleteLabel));
		deleteActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	// Transfer Result Action
	public void testProfileAccessTransferResultActionDeleteOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void testProfileAccessTransferResultActionNoAdd() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert driver.findElements(newTransferResultActionBtn).isEmpty();
	}

	public void testProfileAccessTransferResultActionEditOnly() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		String transferResultActionNameValue = Hooks.prop.getProperty("transferResultActionName");
		WebElement transferResultActionNameInputField = driver.findElement(transferResultActionNameInput);
		transferResultActionNameInputField.sendKeys(transferResultActionNameValue);
		String transferResultActionNotesValue = Hooks.prop.getProperty("transferResultActionNotes");
		WebElement transferResultActionNotesInputField = driver.findElement(transferResultActionNotesInput);
		transferResultActionNotesInputField.sendKeys(transferResultActionNotesValue);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void testProfileAccessTransferResultActionNoEdit() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(editOption).isEmpty();

	}

	public void testProfileAccessTransferResultActionNoDelete() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(deleteOption).isEmpty();
	}

	public void testProfileAccessTransferResultActionAddOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(newTransferResultActionBtn)).click();
		String transferResultActionNameValue = Hooks.prop.getProperty("transferResultActionName");
		WebElement transferResultActionNameInputField = driver.findElement(transferResultActionNameInput);
		transferResultActionNameInputField.sendKeys(transferResultActionNameValue);
		String transferResultActionNotesValue = Hooks.prop.getProperty("transferResultActionNotes");
		WebElement transferResultActionNotesInputField = driver.findElement(transferResultActionNotesInput);
		transferResultActionNotesInputField.sendKeys(transferResultActionNotesValue);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	}

	public void testProfileAccessTransferResultActionViewOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert !driver.findElements(nameLink).isEmpty();

	}

	public void openTransferResultActionsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/TransferResultActions"));
	}

	public void testProfileAccessTransferResultActionViewDeleteOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement addActionElement = wait.until(ExpectedConditions.elementToBeClickable(transferResultActionAddLabel));
		addActionElement.click();
		WebElement editActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(transferResultActionEditLabel));
		editActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void testProfileAccessTransferResultActionViewEditOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement addActionElement = wait.until(ExpectedConditions.elementToBeClickable(transferResultActionAddLabel));
		addActionElement.click();
		WebElement deleteActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(transferResultActionDeleteLabel));
		deleteActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void testProfileAccessTransferResultActionViewAddOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement editActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(transferResultActionEditLabel));
		editActionElement.click();
		WebElement deleteActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(transferResultActionDeleteLabel));
		deleteActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	// Failure Result Action
	public void testProfileAccessFailureResultActionNoDelete() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(deleteOption).isEmpty();
	}

	public void testProfileAccessFailureResultActionNoEdit() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(editOption).isEmpty();
	}

	public void openFailureResultActionsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/FailureResultActions"));
	}

	public void testProfileAccessFailureResultActionViewDeleteOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement addActionElement = wait.until(ExpectedConditions.elementToBeClickable(failureResultActionAddLabel));
		addActionElement.click();
		WebElement editActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(failureResultActionEditLabel));
		editActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void testProfileAccessFailureResultActionViewEditOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement addActionElement = wait.until(ExpectedConditions.elementToBeClickable(failureResultActionAddLabel));
		addActionElement.click();
		WebElement deleteActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(failureResultActionDeleteLabel));
		deleteActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	public void testProfileAccessFailureResultActionViewAddOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement editActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(failureResultActionEditLabel));
		editActionElement.click();
		WebElement deleteActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(failureResultActionDeleteLabel));
		deleteActionElement.click();
		WebElement btnSave = wait.until(ExpectedConditions.elementToBeClickable(btnSaveLocator));
		btnSave.click();

	}

	// Success Result Action
	public void testSuccessResultActionCannotBeAddedInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert driver.findElements(newSuccessResultActionButton).isEmpty();
	}

	public void testSuccessResultActionCannotBeDeletedInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(deleteOption).isEmpty();
	}

	public void testProfileAccessFailureResultActionNoAdd() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert driver.findElements(newFailureResultActionBtn).isEmpty();
	}

	public void testSuccessResultActionCannotBeEditedInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		assert driver.findElements(editOption).isEmpty();
	}

	public void testProfileAccessFailureResultActionEditOnly() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		String failureResultActionNotesValue = Hooks.prop.getProperty("failureResultActionNotes");
		WebElement failureResultActionNotesInputField = driver.findElement(failureResultActionNotesInput);
		failureResultActionNotesInputField.sendKeys(failureResultActionNotesValue);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	}

	public void testProfileAccessFailureResultActionAddOnly() {
		wait.until(ExpectedConditions.elementToBeClickable(newFailureResultActionBtn)).click();
		String failureResultActionNameValue = Hooks.prop.getProperty("failureResultActionName");
		WebElement failureResultActionNameInputField = driver.findElement(failureResultActionNameInput);
		failureResultActionNameInputField.sendKeys(failureResultActionNameValue);
		String failureResultActionNotesValue = Hooks.prop.getProperty("failureResultActionNotes");
		WebElement failureResultActionNotesInputField = driver.findElement(failureResultActionNotesInput);
		failureResultActionNotesInputField.sendKeys(failureResultActionNotesValue);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	}

	public void testProfileAccessFailureResultActionDeleteOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(bucketDropButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void testSuccessResultActionIsViewableInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		assert !driver.findElements(nameLink).isEmpty();

	}

	public void testSuccessResultActionIsDeletableInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		driver.findElement(bucketDropButton).click();
		driver.findElement(deleteOption).click();
		driver.findElement(deleteConfirmButton).click();

	}

	public void testSuccessResultActionIsEditableInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		driver.findElement(bucketDropButton).click();
		driver.findElement(editOption).click();
		String successResultActionNotesFieldValue = Hooks.prop.getProperty("successResultActionNotesField");
		WebElement successResultActionNotesFieldInput = driver.findElement(successResultActionNotesField);
		successResultActionNotesFieldInput.sendKeys(successResultActionNotesFieldValue);
		driver.findElement(submitButton).click();

	}

	public void testSuccessResultActionIsAddableInWorkflowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		driver.findElement(newSuccessResultActionButton).click();
		String successResultActionNameFieldValue = Hooks.prop.getProperty("successResultActionNameField");
		WebElement successResultActionNameFieldInput = driver.findElement(successResultActionNameField);
		successResultActionNameFieldInput.sendKeys(successResultActionNameFieldValue);
		String successResultActionNotesFieldValue = Hooks.prop.getProperty("successResultActionNotesField");
		WebElement successResultActionNotesFieldInput = driver.findElement(successResultActionNotesField);
		successResultActionNotesFieldInput.sendKeys(successResultActionNotesFieldValue);
		driver.findElement(submitButton).click();

	}

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
