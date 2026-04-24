package com.pharmcrm_ClinicalworkflowModule.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import hooks.Hooks;

public class clinicalworkflowpage {

	private WebDriver driver;
	private WebDriverWait wait;

	// RPM Followups
	public By rpmFollowupNotesIcon = By
			.xpath("//div[@class='mt-2']//div[2]//div[3]//div[1]//div[11]//div[1]//a[2]//*[name()='svg']");
	public By saveRpmFollowupNotesButton = By.xpath("//button[@id='btnSaveRPMFollowupNotes']");

	// Clinical Queues
	public By toastMessage = By.xpath("//div[@class='toast-message']");
	public By deleteOptionFromDropdown = By.xpath(
			"//div[contains(@class,'dropdown-menu') and contains(@class,'show')]//span[contains(text(),'Delete')]");
	public By queuedeleteConfirmButton = By.xpath("//div[@id='queuemodal']//button[@id='btnDeleteConfirm']");
	public By thirdRowActionIcon = By.xpath("//tbody/tr[3]/td[9]/div[1]/div[1]/button[1]/i[1]");
	public By editOptionFromDropdown = By.xpath(
			"//div[contains(@class,'dropdown-menu') and contains(@class,'show')]//span[contains(text(),'Edit')]");
	public By newQueueSpan = By.xpath("//span[normalize-space()='New Queue']");
	public By clinicalQueueNameInput = By.xpath("//input[@id='ClinicalQueue_Name']");
	public By clinicalQueueLabelInput = By.xpath("//input[@id='ClinicalQueue_Label']");
	public By saveButton = By.xpath("//button[@id='btnSave']");
	public By clinicalQueueAddLabel = By.xpath("//label[@for='chkg48ClinicalQueueAdd']");
	public By clinicalQueueEditLabel = By.xpath("//label[@for='chkg48ClinicalQueueEdit']");
	public By clinicalQueueDeleteLabel = By.xpath("//label[@for='chkg48ClinicalQueueDelete']");

	// Appointment Outreach
	public By quickTextBodyTextarea = By.xpath("//textarea[@id='quickTextBody']");
	public By appointmentSvgIcon = By.xpath(
			"//div[@class='appointmentGridFullCol appointmentGridCustomDateRange']//div[1]//div[12]//div[1]//a[2]//*[name()='svg']");
	public By appointmentOutreachAllLabel = By.xpath("//label[@for='chkg48AppointmentOutreachAll']");
	public By appointmentOutreachViewLabel = By.xpath("//label[@for='chkg48AppointmentOutreachView']");
	public By allCommunicationViewIcon = By.xpath(
			"//div[contains(@class,'appointmentGridCustomDateRange')]//a[3]//*[name()='path' and @id='rect909']");
	public By appointmentNotesTextArea = By.xpath("//textarea[@id='appointmentNotes']");
	public By saveAppointmentNotesButton = By.xpath("//button[@id='btnSaveAppointmentNotes']");

	public By appointmentOutreachNotesViewIcon = By.xpath(
			"//div[contains(@class,'appointmentGridCustomDateRange')]//a[2]//*[name()='path' and @id='Union_53']");
	public By saveStatusButton = By.xpath("//button[@id='btnSaveStatus']");
	public By appointmentOutreachStatusDropdown = By.xpath("//select[@id='AppointmentOutreach_Status']");
	public By appointmentStatusUpdateIcon = By.xpath("//img[@alt='Appointment Status Update']");
	public By exportAppointmentOutreachIcon = By
			.xpath("//button[@onclick='javascript:ExportAppointmentOutreach();']//*[name()='svg']");

	// Action Work Flow
	public By addTemplateButtonIcon = By.xpath("//a[@class='md-trigger']//button[@type='button']//*[name()='svg']");
	public By companyDefaultLabel = By.xpath("//label[normalize-space()='Company Default']");
	public By clinicalActionWorkFlowAllLabel = By.xpath("//label[@for='chkg48ClinicalActionWorkFlowAll']");
	public By clinicalActionWorkFlowViewLabel = By.xpath("//label[@for='chkg48ClinicalActionWorkFlowView']");
	public By faxToAllButtonIcon = By
			.xpath("//button[@id='btnFaxToAll']//*[name()='svg']//*[name()='path' and @id='fax_to_all']");
	public By faxToAllTemplateDropdown = By.xpath("//select[@id='faxToAllTemplate']");
	public By templateSubmitButton = By.xpath("//button[@id='btnTemplateSubmit']");
	public By smsToAllButtonIcon = By
			.xpath("//button[@id='btnSMSToAll']//*[name()='svg']//*[name()='path' and @id='Union_47']");
	public By smsToAllSubmitButton = By.xpath("//button[@onclick='javascript: SMSToAll();']");
	public By quickSmsIcon = By.xpath("//*[name()='path' and @id='Path_284']");
	public By quickTextTemplateDropdown = By.xpath("//select[@id='quickTextTemplate']");
	public By quickTextPhoneNumberInput = By.xpath("//input[@id='quickTextPhoneNumber']");
	public By quickSmsSendButton = By.xpath("//button[@id='btnQuickSMSSend']");
	public By mailToAllDeleteConfirmButton = By.xpath("//div[@id='mailToAllmodal']//button[@id='btnDeleteConfirm']");
	public By faxToAllDeleteConfirmButton = By.xpath("//div[@id='faxToAllmodal']//button[@id='btnDeleteConfirm']");
	public By smsToAllDeleteConfirmButton = By.xpath("//div[@id='smsToAllmodal']//button[@id='btnDeleteConfirm']");
	public By calloutToAllDeleteConfirmButton = By
			.xpath("//div[@id='calloutToAllmodal']//button[@id='btnDeleteConfirm']");
	public By showPastRunningLineCheckboxLabel = By
			.xpath("//div[@class='runningLineCheckboxinner']//label[@for='Filter_IsShowPastRunningline']");
	public By rescheduledHeader = By.xpath("//h6[normalize-space()='Rescheduled']");
	public By gridTemplateAdd = By.xpath("//*[normalize-space()='Grid Template Add']");
	public By selectQueueDropdown = By.xpath("//button[normalize-space()='--Select Queue--']");
	public By gridTemplateNameInput = By.xpath("//input[@id='GridTemplate_Name']");
	public By gridTemplateSaveButton = By.xpath("//button[@id='btnSave']");
	public By gridTemplateEdit = By.xpath("//*[name()='path' and @id='Union_2']");
	public By unionIconPath = By.xpath("//*[name()='path' and @id='Union_2']");
	public By deleteTemplateIcon = By.xpath("//a[@id='btnDeleteTemplate']//button[@type='button']//*[name()='svg']");
	public By deleteConfirmButton = By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']");
	public By sendVCardButton = By.xpath("//*[name()='path' and @id='Union_48']");
	public By vCardPhoneNumberInput = By.xpath("//input[@id='vCardPhoneNumber']");
	public By vCardBodyTextarea = By.xpath("//textarea[@id='vcardBody']");
	public By submitSendVCardBtn = By.xpath("//button[@id='btnSendVCard']");
	public By exportExcelBtn = By.xpath("//span[normalize-space()='Export Excel']");

	// Dashboard
	public By clinicalWorkflowDashboardAllLabel = By.xpath("//label[@for='chkg50ClinicalWorkflowDashboardAll']");
	public By clinicalWorkflowDashboardViewLabel = By.xpath("//label[@for='chkg50ClinicalWorkflowDashboardView']");
	public By mailToAllIconPath = By
			.xpath("//button[@id='btnMailToAll']//*[name()='svg']//*[name()='path' and @id='Union_43']");
	public By mailToAllTemplateDropdown = By.xpath("//select[@id='mailToAllTemplate']");
	public By mailToAllButton = By.xpath("//button[@onclick='javascript: MailToAll();']");
	public By smsToAllIconPath = By
			.xpath("//button[@id='btnSMSToAll']//*[name()='svg']//*[name()='path' and @id='Union_47']");
	public By smsToAllTemplateDropdown = By.xpath("//select[@id='smsToAllTemplate']");
	public By smsToAllButton = By.xpath("//button[@onclick='javascript: SMSToAll();']");
	public By calloutToAllIconPath = By
			.xpath("//button[@id='btnCalloutToAll']//*[name()='svg']//*[name()='path' and @id='Union_46']");
	public By calloutToAllTemplateDropdown = By.xpath("//select[@id='calloutToAllTemplate']");
	public By calloutToAllButton = By.xpath("//button[@onclick='javascript: CalloutToAll();']");
	public By exportIcon = By.xpath("//button[@onclick='javascript: Export();']//*[name()='svg']");
	public By ddYearDropdown = By.xpath("//select[@id='ddYear']");
	public By AllCommunicationView = By.xpath(
			"//div[@class='gridMain page-content clinicalWorkflowDashboard-Grid']//div//div[2]//div[14]//div[1]//a[2]//*[name()='svg']");
	public By mailOption = By.xpath("//a[normalize-space()='Mail']");
	public By botCallOption = By.xpath("//a[normalize-space()='Bot Call']");
	public By faxOption = By.xpath("//a[normalize-space()='Fax']");
	public By updateAppointmentAction = By.xpath(
			"//div[@class='gridMain page-content clinicalWorkflowDashboard-Grid']//div//div[2]//div[14]//div[1]//a[1]//img[1]");
	public By appointmentActionStatusDropdown = By.xpath("//select[@id='AppointmentAction_Status']");
	public By alertLabel = By.xpath("//label[normalize-space()='Alert']");
	public By appointmentActionNotesTextarea = By.xpath("//textarea[@id='AppointmentAction_Notes']");
	public By saveActionButton = By.xpath("//button[@id='btnSaveAction']");

	// General
	public By updatedByColumn = By.xpath("//th[normalize-space()='Updated By']");
	public By updatedDateColumn = By.xpath("//th[normalize-space()='Updated Date']");
	public By runningLineCheckboxLabel = By
			.xpath("//div[@class='runningLineCheckboxinner']//label[@for='Filter_IsShowAllRunningline']");
	public By dateTimeSpan = By.xpath("//span[contains(text(),'/') and contains(text(),':')]");

	// LocatorProfilesPage
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

	// Upload Wizard Setting
	public By clinicalQueueDropdown = By.xpath("//select[@id='ClinicalQueue_Id']");
	public By clinicalColumnSortOrderUpdate = By.xpath("//span[contains(text(),'Appointment Id')]");
	public By clinicalQueueColumnAddDropdown = By.xpath("//select[@id='ClinicalQueueColumnAdd_Id']");
	public By clinicalQueueColumnDeleteIcon = By
			.xpath("//li[@id='04177b1e-8ba7-4576-b039-5b63bb0851bc']//img[@class='pull-right']");
	public By copyClinicalQueueColumn = By.xpath("//img[@class='v-align-txttop']");
	public By clinicalQueueRuleView = By.xpath("//li[1]//div[1]//a[2]//img[1]");
	public By clinicalQueueRuleAdd = By.xpath("//button[@id='btnAddRulesTootltip']//*[name()='svg']");
	public By clinicalQueueRuleTitle = By.xpath("//input[@id='ClinicalQueueRule_Title']");
	public By clinicalQueueRuleClinicalQueueId = By.xpath("//select[@id='ClinicalQueueRule_ClinicalQueueId']");
	public By clinicalQueueRuleSubmitButton = By
			.xpath("//button[@class='btn btn-primary waves-effect waves-light'][normalize-space()='Submit']");
	public By clinicalQueueRuleStringOperator = By.xpath("//select[@id='ddStringOperator']");
	public By clinicalQueueRuleValue1 = By.xpath("//input[@id='ClinicalQueueRule_Value1']");
	public By clinicalQueueRuleDelete = By.xpath("//div[@class='col-12 col-md-8 p-0']//li[1]//div[1]//a[1]//img[1]");

	// Appointment Reminder Setting
	public By appointmentReminderSettingAddLabel = By.xpath("//label[@for='chkg48AppointmentReminderSettingAdd']");
	public By appointmentReminderSettingEditLabel = By.xpath("//label[@for='chkg48AppointmentReminderSettingEdit']");
	public By appointmentReminderSettingDeleteLabel = By
			.xpath("//label[@for='chkg48AppointmentReminderSettingDelete']");
	public By newAppointmentReminderSpan = By.xpath("//span[normalize-space()='New Appointment Reminder']");
	public By appointmentReminderDayTypeDropdown = By.xpath("//select[@id='AppointmentReminderSetting_DayTypeId']");
	public By appointmentReminderDayDropdown = By.xpath("//select[@id='AppointmentReminderSetting_Day']");
	public By appointmentReminderNotesInput = By.xpath("//input[@id='AppointmentReminderSetting_Notes']");
	public By saveAppointmentReminderButton = By.xpath("//button[@id='btnSaveAppointmentReminderSetting']");
	public By ellipsisIconFirst = By.xpath("(//i[contains(@class,'fa-ellipsis-vertical')])[1]");
	public By editSpanFirst = By.xpath("(//span[normalize-space()='Edit'])[1]");
	public By deleteSpanFirst = By.xpath("(//span[normalize-space()='Delete'])[1]");
	public By confirmDeleteAppointmentReminderButton = By.xpath("//button[@id='deleteAppointmentReminderSetting']");

	// Upload Wizard Template Setting
	public By firstRowActionIcon = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]/i[1]");
	public By newUploadWizardTemplateSpan = By.xpath("//span[normalize-space()='New Upload Wizard Template']");
	public By clinicalQueueTemplateNameInput = By.xpath("//input[@id='ClinicalQueueTemplate_Name']");
	public By externalSourceDropdown = By.xpath("//select[@id='ClinicalQueueTemplate_ExternalSource_Id']");
	public By uploadWizardCategoryDropdown = By.xpath("//select[@id='ClinicalQueueTemplate_UploadWizardCategory']");
	public By selectCityDropdownInput = By.xpath("//div[contains(@class,'dropdowncheckbox')]//input[@type='text']");
	public By fileUploadInput = By.xpath("//input[@id='file-1']");
	public By nextButton = By.xpath("//button[@id='btnNext']");
	public By primaryButton = By.xpath("//button[@class='btn btn-primary']");
	public By uploadWizardClinicalQueueTemplateAddLabel = By
			.xpath("//label[@for='chkg48UploadWizardClinicalQueueTemplateAdd']");
	public By uploadWizardClinicalQueueTemplateEditLabel = By
			.xpath("//label[@for='chkg48UploadWizardClinicalQueueTemplateEdit']");
	public By uploadWizardClinicalQueueTemplateDeleteLabel = By
			.xpath("//label[@for='chkg48UploadWizardClinicalQueueTemplateDelete']");
	public By genericDeleteConfirmButton = By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']");

	// Upload Wizard Template Setting
	public void assignViewAccessToUploadWizardTemplateSettingProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModuleLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModuleLabelElement.click();
		WebElement clinicalQueueAddLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(uploadWizardClinicalQueueTemplateAddLabel));
		clinicalQueueAddLabelElement.click();
		WebElement clinicalQueueEditLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(uploadWizardClinicalQueueTemplateEditLabel));
		clinicalQueueEditLabelElement.click();
		WebElement clinicalQueueDeleteLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(uploadWizardClinicalQueueTemplateDeleteLabel));
		clinicalQueueDeleteLabelElement.click();
	}

	public void createProfileForUploadWizardTemplateSettingViewDelete() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModuleLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModuleLabelElement.click();
		WebElement clinicalQueueAddLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(uploadWizardClinicalQueueTemplateAddLabel));
		clinicalQueueAddLabelElement.click();

		WebElement clinicalQueueEditLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(uploadWizardClinicalQueueTemplateEditLabel));
		clinicalQueueEditLabelElement.click();
	}

	public void addUploadWizardTemplateSettingProfileWithEditPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModuleLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModuleLabelElement.click();
		WebElement clinicalQueueAddLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(uploadWizardClinicalQueueTemplateAddLabel));
		clinicalQueueAddLabelElement.click();
		WebElement clinicalQueueDeleteLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(uploadWizardClinicalQueueTemplateDeleteLabel));
		clinicalQueueDeleteLabelElement.click();
	}

	public void addUploadWizardTemplateSettingProfileWithPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModuleLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModuleLabelElement.click();
		WebElement clinicalQueueEditLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(uploadWizardClinicalQueueTemplateEditLabel));
		clinicalQueueEditLabelElement.click();

		WebElement clinicalQueueDeleteLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(uploadWizardClinicalQueueTemplateDeleteLabel));
		clinicalQueueDeleteLabelElement.click();

	}

	// Upload Wizard Template Setting
	public void userCannotAddEditOrDeleteUploadWizardTemplateSetting() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(newUploadWizardTemplateSpan));
		WebElement thirdRowActionIconElement = wait.until(ExpectedConditions.elementToBeClickable(firstRowActionIcon));
		thirdRowActionIconElement.click();
		sleep(2000);
		wait.until(ExpectedConditions.numberOfElementsToBe(editOptionFromDropdown, 0));
		wait.until(ExpectedConditions.numberOfElementsToBe(deleteOptionFromDropdown, 0));

	}

	public void userCannotAddOrEditUploadWizardTemplateSetting() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(newUploadWizardTemplateSpan));
		WebElement thirdRowActionIconElement = wait.until(ExpectedConditions.elementToBeClickable(firstRowActionIcon));
		thirdRowActionIconElement.click();
		sleep(2000);
		wait.until(ExpectedConditions.numberOfElementsToBe(editOptionFromDropdown, 0));

	}

	public void userCannotAddOrDeleteUploadWizardTemplateSetting() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(newUploadWizardTemplateSpan));
		WebElement thirdRowActionIconElement = wait.until(ExpectedConditions.elementToBeClickable(firstRowActionIcon));
		thirdRowActionIconElement.click();
		sleep(2000);
		wait.until(ExpectedConditions.numberOfElementsToBe(deleteOptionFromDropdown, 0));

	}

	public void userCannotEditOrDeleteUploadWizardTemplateSetting() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement thirdRowActionIconElement = wait.until(ExpectedConditions.elementToBeClickable(firstRowActionIcon));
		thirdRowActionIconElement.click();
		sleep(2000);
		wait.until(ExpectedConditions.numberOfElementsToBe(editOptionFromDropdown, 0));
		wait.until(ExpectedConditions.numberOfElementsToBe(deleteOptionFromDropdown, 0));

	}

	public void assignViewAndDeleteAccessToUploadWizardTemplateSettingProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement firstRowActionIconElement = wait.until(ExpectedConditions.elementToBeClickable(firstRowActionIcon));
		firstRowActionIconElement.click();
		sleep(2000);
		WebElement editOptionFromDropdownElement = wait
				.until(ExpectedConditions.elementToBeClickable(deleteOptionFromDropdown));
		editOptionFromDropdownElement.click();
		sleep(2000);
		WebElement nextButtonElement = wait.until(ExpectedConditions.elementToBeClickable(genericDeleteConfirmButton));
		nextButtonElement.click();
		sleep(2000);

	}

	public void assignViewAndEditAccessToUploadWizardTemplateSettingProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement firstRowActionIconElement = wait.until(ExpectedConditions.elementToBeClickable(firstRowActionIcon));
		firstRowActionIconElement.click();
		sleep(2000);
		WebElement editOptionFromDropdownElement = wait
				.until(ExpectedConditions.elementToBeClickable(editOptionFromDropdown));
		editOptionFromDropdownElement.click();
		sleep(2000);
		String clinicalQueueTemplateNameInputValue = Hooks.prop.getProperty("clinicalQueueTemplateNameInput");
		WebElement clinicalQueueTemplateNameInputElement = driver.findElement(clinicalQueueTemplateNameInput);
		clinicalQueueTemplateNameInputElement.sendKeys(clinicalQueueTemplateNameInputValue);
		WebElement externalSourceDropdownElement = wait
				.until(ExpectedConditions.elementToBeClickable(externalSourceDropdown));
		Select externalSourceSelect = new Select(externalSourceDropdownElement);
		externalSourceSelect.selectByIndex(2);
		WebElement uploadWizardCategoryDropdownElement = wait
				.until(ExpectedConditions.elementToBeClickable(uploadWizardCategoryDropdown));
		Select uploadWizardCategorySelect = new Select(uploadWizardCategoryDropdownElement);
		uploadWizardCategorySelect.selectByIndex(2);
		WebElement selectCityDropdownInputElement = wait
				.until(ExpectedConditions.elementToBeClickable(selectCityDropdownInput));
		Select selectCityDropdownSelect = new Select(selectCityDropdownInputElement);
		selectCityDropdownSelect.selectByIndex(2);
		driver.findElement(fileUploadInput)
				.sendKeys(System.getProperty("user.dir") + "/src/test/resources/Documents/Appointment 11-21 .xlsx");
		WebElement nextButtonElement = wait.until(ExpectedConditions.elementToBeClickable(nextButton));
		nextButtonElement.click();
		sleep(2000);
		WebElement primaryButtonElement = wait.until(ExpectedConditions.elementToBeClickable(primaryButton));
		primaryButtonElement.click();
	}

	public void createProfileForUploadWizardTemplateSettingViewAdd() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement newUploadWizardTemplateSpanElement = wait
				.until(ExpectedConditions.elementToBeClickable(newUploadWizardTemplateSpan));
		newUploadWizardTemplateSpanElement.click();
		sleep(2000);
		String clinicalQueueTemplateNameInputValue = Hooks.prop.getProperty("clinicalQueueTemplateNameInput");
		WebElement clinicalQueueTemplateNameInputElement = driver.findElement(clinicalQueueTemplateNameInput);
		clinicalQueueTemplateNameInputElement.sendKeys(clinicalQueueTemplateNameInputValue);
		WebElement externalSourceDropdownElement = wait
				.until(ExpectedConditions.elementToBeClickable(externalSourceDropdown));
		Select externalSourceSelect = new Select(externalSourceDropdownElement);
		externalSourceSelect.selectByIndex(2);
		WebElement uploadWizardCategoryDropdownElement = wait
				.until(ExpectedConditions.elementToBeClickable(uploadWizardCategoryDropdown));
		Select uploadWizardCategorySelect = new Select(uploadWizardCategoryDropdownElement);
		uploadWizardCategorySelect.selectByIndex(2);
		WebElement selectCityDropdownInputElement = wait
				.until(ExpectedConditions.elementToBeClickable(selectCityDropdownInput));
		Select selectCityDropdownSelect = new Select(selectCityDropdownInputElement);
		selectCityDropdownSelect.selectByIndex(2);
		driver.findElement(fileUploadInput)
				.sendKeys(System.getProperty("user.dir") + "/src/test/resources/Documents/Appointment 11-21 .xlsx");
		WebElement nextButtonElement = wait.until(ExpectedConditions.elementToBeClickable(nextButton));
		nextButtonElement.click();
		sleep(2000);
		WebElement primaryButtonElement = wait.until(ExpectedConditions.elementToBeClickable(primaryButton));
		primaryButtonElement.click();
	}

	public void openUploadWizardClinicalQueueTemplatesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/UploadWizardClinicalQueueTemplates"));
	}

	// Clinical Queues
	public void userCannotAddEditOrDeleteClinicalQueues() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(newQueueSpan, 0));
		WebElement thirdRowActionIconElement = wait.until(ExpectedConditions.elementToBeClickable(thirdRowActionIcon));
		thirdRowActionIconElement.click();
		sleep(2000);
		wait.until(ExpectedConditions.numberOfElementsToBe(editOptionFromDropdown, 0));
		wait.until(ExpectedConditions.numberOfElementsToBe(deleteOptionFromDropdown, 0));

	}

	public void userCannotAddOrEditClinicalQueues() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(newQueueSpan, 0));
		WebElement thirdRowActionIconElement = wait.until(ExpectedConditions.elementToBeClickable(thirdRowActionIcon));
		thirdRowActionIconElement.click();
		sleep(2000);
		wait.until(ExpectedConditions.numberOfElementsToBe(editOptionFromDropdown, 0));

	}

	public void userCannotAddOrDeleteClinicalQueues() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(newQueueSpan, 0));
		WebElement thirdRowActionIconElement = wait.until(ExpectedConditions.elementToBeClickable(thirdRowActionIcon));
		thirdRowActionIconElement.click();
		sleep(2000);
		wait.until(ExpectedConditions.numberOfElementsToBe(deleteOptionFromDropdown, 0));

	}

	public void userCannotEditOrDeleteClinicalQueues() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement thirdRowActionIconElement = wait.until(ExpectedConditions.elementToBeClickable(thirdRowActionIcon));
		thirdRowActionIconElement.click();
		sleep(2000);
		wait.until(ExpectedConditions.numberOfElementsToBe(editOptionFromDropdown, 0));
		wait.until(ExpectedConditions.numberOfElementsToBe(deleteOptionFromDropdown, 0));

	}

	public void createClinicalQueueProfileWithViewAndDeleteAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement thirdRowActionIconElement = wait.until(ExpectedConditions.elementToBeClickable(thirdRowActionIcon));
		thirdRowActionIconElement.click();
		sleep(2000);
		WebElement editOptionFromDropdownElement = wait
				.until(ExpectedConditions.elementToBeClickable(deleteOptionFromDropdown));
		editOptionFromDropdownElement.click();
		sleep(2000);
		WebElement saveButtonElement = wait.until(ExpectedConditions.elementToBeClickable(queuedeleteConfirmButton));
		saveButtonElement.click();
	}

	public void addClinicalQueueProfileWithEditPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement thirdRowActionIconElement = wait.until(ExpectedConditions.elementToBeClickable(thirdRowActionIcon));
		thirdRowActionIconElement.click();
		sleep(2000);
		WebElement editOptionFromDropdownElement = wait
				.until(ExpectedConditions.elementToBeClickable(editOptionFromDropdown));
		editOptionFromDropdownElement.click();
		sleep(2000);
		String clinicalQueueNameInputValue = Hooks.prop.getProperty("clinicalQueueNameInput");
		WebElement clinicalQueueNameInputElement = driver.findElement(clinicalQueueNameInput);
		clinicalQueueNameInputElement.sendKeys(clinicalQueueNameInputValue);
		String clinicalQueueLabelInputValue = Hooks.prop.getProperty("clinicalQueueLabelInput");
		WebElement clinicalQueueLabelInputElement = driver.findElement(clinicalQueueLabelInput);
		clinicalQueueLabelInputElement.sendKeys(clinicalQueueLabelInputValue);
		WebElement saveButtonElement = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
		saveButtonElement.click();
	}

	public void createProfileForClinicalQueuesViewAdd() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement newQueueSpanElement = wait.until(ExpectedConditions.elementToBeClickable(newQueueSpan));
		newQueueSpanElement.click();
		sleep(2000);
		String clinicalQueueNameInputValue = Hooks.prop.getProperty("clinicalQueueNameInput");
		WebElement clinicalQueueNameInputElement = driver.findElement(clinicalQueueNameInput);
		clinicalQueueNameInputElement.sendKeys(clinicalQueueNameInputValue);
		String clinicalQueueLabelInputValue = Hooks.prop.getProperty("clinicalQueueLabelInput");
		WebElement clinicalQueueLabelInputElement = driver.findElement(clinicalQueueLabelInput);
		clinicalQueueLabelInputElement.sendKeys(clinicalQueueLabelInputValue);
		WebElement saveButtonElement = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
		saveButtonElement.click();
	}

	public void openClinicalQueuesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ClinicalQueues"));
	}

	public void addClinicalQueueProfileWithViewPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModuleLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModuleLabelElement.click();
		WebElement clinicalQueueAddLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalQueueAddLabel));
		clinicalQueueAddLabelElement.click();
		WebElement clinicalQueueEditLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalQueueEditLabel));
		clinicalQueueEditLabelElement.click();
		WebElement clinicalQueueDeleteLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalQueueDeleteLabel));
		clinicalQueueDeleteLabelElement.click();
	}

	public void createProfileForClinicalQueuesViewDelete() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModuleLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModuleLabelElement.click();
		WebElement clinicalQueueAddLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalQueueAddLabel));
		clinicalQueueAddLabelElement.click();
		WebElement clinicalQueueDeleteLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalQueueEditLabel));
		clinicalQueueDeleteLabelElement.click();

	}

	public void createProfileForClinicalQueuesViewEdit() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModuleLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModuleLabelElement.click();
		WebElement clinicalQueueAddLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalQueueAddLabel));
		clinicalQueueAddLabelElement.click();
		WebElement clinicalQueueDeleteLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalQueueDeleteLabel));
		clinicalQueueDeleteLabelElement.click();

	}

	public void addClinicalQueueProfileWithPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModuleLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModuleLabelElement.click();
		WebElement clinicalQueueEditLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalQueueEditLabel));
		clinicalQueueEditLabelElement.click();
		WebElement clinicalQueueDeleteLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalQueueDeleteLabel));
		clinicalQueueDeleteLabelElement.click();

	}

	// RPM Followups
	public String addRpmFollowupNotesValidationMessagesAreShownForRequiredFields() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement smsToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(rpmFollowupNotesIcon));
		smsToAllIcon.click();
		WebElement smsToAllSubmitBtn = wait.until(ExpectedConditions.elementToBeClickable(saveRpmFollowupNotesButton));
		smsToAllSubmitBtn.click();
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public String sendVcardRpmFollowupsValidationMessagesAreShownForRequiredFields() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement smsToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(sendVCardButton));
		smsToAllIcon.click();
		WebElement smsToAllSubmitBtn = wait.until(ExpectedConditions.elementToBeClickable(submitSendVCardBtn));
		smsToAllSubmitBtn.click();
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public String quickTextRpmFollowupsValidationMessagesAreShownForRequiredFields() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement smsToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(faxToAllButtonIcon));
		smsToAllIcon.click();
		WebElement smsToAllSubmitBtn = wait.until(ExpectedConditions.elementToBeClickable(templateSubmitButton));
		smsToAllSubmitBtn.click();
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public String faxToAllRpmFollowupsValidationMessagesAreShownForRequiredFields() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement smsToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(faxToAllButtonIcon));
		smsToAllIcon.click();
		WebElement smsToAllSubmitBtn = wait.until(ExpectedConditions.elementToBeClickable(templateSubmitButton));
		smsToAllSubmitBtn.click();
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public String botCallToAllRpmFollowupsValidationMessagesAreShownForRequiredFields() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement smsToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(calloutToAllIconPath));
		smsToAllIcon.click();
		WebElement smsToAllSubmitBtn = wait.until(ExpectedConditions.elementToBeClickable(calloutToAllButton));
		smsToAllSubmitBtn.click();
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public String textToAllRpmFollowupsValidationMessagesAreShownForRequiredFields() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement smsToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(smsToAllButtonIcon));
		smsToAllIcon.click();
		WebElement smsToAllSubmitBtn = wait.until(ExpectedConditions.elementToBeClickable(smsToAllSubmitButton));
		smsToAllSubmitBtn.click();
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public String mailToAllRpmFollowupsValidationMessagesAreShownForRequiredFields() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement mailToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(mailToAllIconPath));
		mailToAllIcon.click();
		WebElement mailToAllBtn = wait.until(ExpectedConditions.elementToBeClickable(mailToAllButton));
		mailToAllBtn.click();
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public void preventRpmFollowupAllCommunicationView() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(allCommunicationViewIcon, 0));
	}

	public void restrictRpmFollowupNotesAdd() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(appointmentOutreachNotesViewIcon, 0));
	}

	public void disableRpmFollowupNotesView() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(appointmentOutreachNotesViewIcon, 0));
	}

	public void disableRpmFollowupStatusUpdate() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(appointmentStatusUpdateIcon, 0));
	}

	public void blockRpmFollowupExportToExcel() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(exportAppointmentOutreachIcon, 0));
	}

	public void preventRpmFollowupSendVCard() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(sendVCardButton, 0));
	}

	public void disableRpmFollowupQuickText() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(quickSmsIcon, 0));
	}

	public void restrictRpmFollowupBotCall() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(calloutToAllIconPath, 0));
	}

	public void preventRpmFollowupText() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(smsToAllIconPath, 0));
	}

	public void preventRpmFollowupFax() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(faxToAllButtonIcon, 0));
	}

	public void restrictRpmFollowupMail() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(mailToAllIconPath, 0));
	}

	public void allowRpmFollowupFaxView() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModuleLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModuleLabelElement.click();

	}

	public void grantRpmFollowupAllCommunicationView() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement appointmentStatusUpdateIconElement = wait
				.until(ExpectedConditions.elementToBeClickable(allCommunicationViewIcon));
		appointmentStatusUpdateIconElement.click();
	}

	public void grantRpmFollowupNotesAdd() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement appointmentStatusUpdateIconElement = wait
				.until(ExpectedConditions.elementToBeClickable(appointmentOutreachNotesViewIcon));
		appointmentStatusUpdateIconElement.click();
		String appointmentNotesTextAreaValue = Hooks.prop.getProperty("appointmentNotesTextArea");
		WebElement appointmentNotesTextAreaElement = driver.findElement(appointmentNotesTextArea);
		appointmentNotesTextAreaElement.sendKeys(appointmentNotesTextAreaValue);
		WebElement saveAppointmentNotesButtonElement = wait
				.until(ExpectedConditions.elementToBeClickable(saveAppointmentNotesButton));
		saveAppointmentNotesButtonElement.click();
	}

	public void grantRpmFollowupNotesView() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement appointmentStatusUpdateIconElement = wait
				.until(ExpectedConditions.elementToBeClickable(appointmentOutreachNotesViewIcon));
		appointmentStatusUpdateIconElement.click();
	}

	public void permitRpmFollowupStatusUpdate() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement appointmentStatusUpdateIconElement = wait
				.until(ExpectedConditions.elementToBeClickable(appointmentStatusUpdateIcon));
		appointmentStatusUpdateIconElement.click();
		WebElement appointmentOutreachStatusDropdownElement = wait
				.until(ExpectedConditions.elementToBeClickable(appointmentOutreachStatusDropdown));
		Select statusDropdownSelect = new Select(appointmentOutreachStatusDropdownElement);
		statusDropdownSelect.selectByIndex(2);
		WebElement saveStatusButtonElement = wait.until(ExpectedConditions.elementToBeClickable(saveStatusButton));
		saveStatusButtonElement.click();
	}

	public void enableRpmFollowupExportToExcel() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement exportAppointmentOutreachIconElement = wait
				.until(ExpectedConditions.elementToBeClickable(exportAppointmentOutreachIcon));
		exportAppointmentOutreachIconElement.click();
	}

	public void grantRpmFollowupSendVCard() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement rescheduledHeaderElement = wait.until(ExpectedConditions.elementToBeClickable(sendVCardButton));
		rescheduledHeaderElement.click();
		String vCardPhoneNumberValue = Hooks.prop.getProperty("vCardPhoneNumberInput");
		WebElement vCardPhoneNumberInputElement = driver.findElement(vCardPhoneNumberInput);
		vCardPhoneNumberInputElement.sendKeys(vCardPhoneNumberValue);
		String vCardBodyValue = Hooks.prop.getProperty("vCardBodyInput");
		WebElement vCardBodyTextareaElement = driver.findElement(vCardBodyTextarea);
		vCardBodyTextareaElement.sendKeys(vCardBodyValue);
		WebElement gridTemplateSaveButtonElement = wait
				.until(ExpectedConditions.elementToBeClickable(submitSendVCardBtn));
		gridTemplateSaveButtonElement.click();
	}

	public void grantRpmFollowupQuickText() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement quickSmsIconElement = wait.until(ExpectedConditions.elementToBeClickable(quickSmsIcon));
		quickSmsIconElement.click();
		WebElement quickTextTemplateDropdownElement = wait
				.until(ExpectedConditions.elementToBeClickable(quickTextTemplateDropdown));
		Select templateSelect = new Select(quickTextTemplateDropdownElement);
		templateSelect.selectByIndex(1);
		String quickTextPhoneNumberValue = Hooks.prop.getProperty("quickTextPhoneNumberValue");
		WebElement quickTextPhoneNumberInputElement = driver.findElement(quickTextPhoneNumberInput);
		quickTextPhoneNumberInputElement.sendKeys(quickTextPhoneNumberValue);
		WebElement quickSmsSendButtonElement = wait.until(ExpectedConditions.elementToBeClickable(quickSmsSendButton));
		quickSmsSendButtonElement.click();
	}

	public void enableRpmFollowupBotCall() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement calloutToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(calloutToAllIconPath));
		calloutToAllIcon.click();
		WebElement calloutTemplateDropdown = wait
				.until(ExpectedConditions.elementToBeClickable(calloutToAllTemplateDropdown));
		Select calloutTemplateSelect = new Select(calloutTemplateDropdown);
		calloutTemplateSelect.selectByIndex(1);
		WebElement calloutToAllButtonElement = wait.until(ExpectedConditions.elementToBeClickable(calloutToAllButton));
		calloutToAllButtonElement.click();
	}

	public void grantRpmFollowupText() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement smsToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(smsToAllIconPath));
		smsToAllIcon.click();
		WebElement smsTemplateDropdown = wait.until(ExpectedConditions.elementToBeClickable(smsToAllTemplateDropdown));
		Select smsTemplateSelect = new Select(smsTemplateDropdown);
		smsTemplateSelect.selectByIndex(1);
		WebElement smsToAllButtonElement = wait.until(ExpectedConditions.elementToBeClickable(smsToAllButton));
		smsToAllButtonElement.click();
	}

	public void enableRpmFollowupFax() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement faxToAllButtonIconElement = wait.until(ExpectedConditions.elementToBeClickable(faxToAllButtonIcon));
		faxToAllButtonIconElement.click();
		WebElement templateSubmitButtonElement = wait
				.until(ExpectedConditions.elementToBeClickable(faxToAllDeleteConfirmButton));
		templateSubmitButtonElement.click();

	}

	public void enableRpmFollowupMail() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement mailToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(mailToAllIconPath));
		mailToAllIcon.click();
		WebElement templateDropdown = wait.until(ExpectedConditions.elementToBeClickable(mailToAllTemplateDropdown));
		Select selectTemplate = new Select(templateDropdown);
		selectTemplate.selectByIndex(1);
		WebElement mailToAllBtn = wait.until(ExpectedConditions.elementToBeClickable(mailToAllButton));
		mailToAllBtn.click();

	}

	public void openclinicalWorkflowRpmFollowupsUrl(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/ClinicalWorkflow/Home/RPMFollowups"));
	}

	public void denyAppointmentOutreachAllCommunicationView() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModuleLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModuleLabelElement.click();

	}

	// Appointment Outreach
	public String addAppointmentNotesActionOutreachValidationMessagesAreShownForRequiredFields() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement calloutToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(appointmentSvgIcon));
		calloutToAllIcon.click();
		WebElement calloutToAllSubmitBtn = wait
				.until(ExpectedConditions.elementToBeClickable(saveAppointmentNotesButton));
		calloutToAllSubmitBtn.click();
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public String checkInvalidPhoneNumberSendVcardValidationMessage() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);

		WebElement calloutToAllSubmitBtn = wait.until(ExpectedConditions.elementToBeClickable(submitSendVCardBtn));
		calloutToAllSubmitBtn.click();
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public void provideInvalidPhoneNumberSendVcard() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement calloutToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(sendVCardButton));
		calloutToAllIcon.click();

		String vCardPhoneNumberValue = Hooks.prop.getProperty("vCardPhoneNumberInput");
		WebElement vCardPhoneNumberInputElement = driver.findElement(vCardPhoneNumberInput);
		vCardPhoneNumberInputElement.sendKeys(vCardPhoneNumberValue);

		String vCardBodyValue = Hooks.prop.getProperty("vCardBodyInput");
		WebElement vCardBodyTextareaElement = driver.findElement(vCardBodyTextarea);
		vCardBodyTextareaElement.sendKeys(vCardBodyValue);

	}

	public String sendVCardAppointmentOutreachValidationMessagesAreShownForRequiredFields() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement calloutToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(sendVCardButton));
		calloutToAllIcon.click();
		WebElement calloutToAllSubmitBtn = wait.until(ExpectedConditions.elementToBeClickable(submitSendVCardBtn));
		calloutToAllSubmitBtn.click();
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public String quickTextAppointmentOutreachValidationMessagesAreShownForRequiredFields() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement calloutToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(quickSmsIcon));
		calloutToAllIcon.click();
		WebElement calloutToAllSubmitBtn = wait.until(ExpectedConditions.elementToBeClickable(quickSmsSendButton));
		calloutToAllSubmitBtn.click();
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public String invalidPhoneNumberValidationMessageIsShown() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);

		WebElement calloutToAllSubmitBtn = wait.until(ExpectedConditions.elementToBeClickable(quickSmsSendButton));
		calloutToAllSubmitBtn.click();
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public void enterInvalidPhoneNumber() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement calloutToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(quickSmsIcon));
		calloutToAllIcon.click();

		String quickTextPhoneNumberValue = Hooks.prop.getProperty("quickTextPhoneNumberValue");
		WebElement quickTextPhoneNumberInputElement = driver.findElement(quickTextPhoneNumberInput);
		quickTextPhoneNumberInputElement.sendKeys(quickTextPhoneNumberValue);

		String quickTextBodyValue = Hooks.prop.getProperty("quickTextBodyValue");
		WebElement quickTextBodyTextareaElement = driver.findElement(quickTextBodyTextarea);
		quickTextBodyTextareaElement.sendKeys(quickTextBodyValue);

	}

	public String faxToAllAppointmentOutreachValidationMessagesAreShownForRequiredFields() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement calloutToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(faxToAllButtonIcon));
		calloutToAllIcon.click();
		WebElement calloutToAllSubmitBtn = wait.until(ExpectedConditions.elementToBeClickable(templateSubmitButton));
		calloutToAllSubmitBtn.click();
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public String botCallToAllAppointmentOutreachValidationMessagesAreShownForRequiredFields() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement calloutToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(calloutToAllIconPath));
		calloutToAllIcon.click();
		WebElement calloutToAllSubmitBtn = wait.until(ExpectedConditions.elementToBeClickable(calloutToAllButton));
		calloutToAllSubmitBtn.click();
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public String textToAllAppointmentOutreachValidationMessagesAreShownForRequiredFields() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement smsToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(smsToAllButtonIcon));
		smsToAllIcon.click();
		WebElement smsToAllSubmitBtn = wait.until(ExpectedConditions.elementToBeClickable(smsToAllSubmitButton));
		smsToAllSubmitBtn.click();
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public String mailToAllAppointmentOutreachValidationMessagesAreShownForRequiredFields() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement mailToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(mailToAllIconPath));
		mailToAllIcon.click();
		WebElement mailToAllBtn = wait.until(ExpectedConditions.elementToBeClickable(mailToAllButton));
		mailToAllBtn.click();
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public void preventAppointmentOutreachAllCommunicationView() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(allCommunicationViewIcon, 0));

	}

	public void preventAppointmentOutreachNotesAdd() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(appointmentOutreachNotesViewIcon, 0));

	}

	public void preventAppointmentOutreachNotesView() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(appointmentOutreachNotesViewIcon, 0));

	}

	public void preventAppointmentStatusUpdate() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(appointmentStatusUpdateIcon, 0));

	}

	public void preventAppointmentOutreachExportToExcel() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(exportAppointmentOutreachIcon, 0));

	}

	public void preventAppointmentOutreachSendVCard() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(sendVCardButton, 0));

	}

	public void preventAppointmentOutreachQuickText() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(quickSmsIcon, 0));

	}

	public void preventAppointmentOutreachBotCall() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(calloutToAllIconPath, 0));

	}

	public void preventAppointmentOutreachText() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(smsToAllIconPath, 0));

	}

	public void preventAppointmentOutreachFax() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(faxToAllButtonIcon, 0));

	}

	public void restrictAppointmentOutreachMail() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(mailToAllIconPath, 0));

	}

	public void createProfileWithAppointmentOutreachViewAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModuleLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModuleLabelElement.click();
		sleep(2000);
		WebElement appointmentOutreachAllLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(appointmentOutreachAllLabel));
		appointmentOutreachAllLabelElement.click();
		sleep(2000);
		WebElement appointmentOutreachViewLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(appointmentOutreachViewLabel));
		appointmentOutreachViewLabelElement.click();
	}

	public void hasPermissionToViewAllAppointmentCommunications() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement appointmentStatusUpdateIconElement = wait
				.until(ExpectedConditions.elementToBeClickable(allCommunicationViewIcon));
		appointmentStatusUpdateIconElement.click();

	}

	public void hasPermissionToAddAppointmentOutreachNotes() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement appointmentStatusUpdateIconElement = wait
				.until(ExpectedConditions.elementToBeClickable(appointmentOutreachNotesViewIcon));
		appointmentStatusUpdateIconElement.click();
		String appointmentNotesTextAreaValue = Hooks.prop.getProperty("appointmentNotesTextArea");
		WebElement appointmentNotesTextAreaElement = driver.findElement(appointmentNotesTextArea);
		appointmentNotesTextAreaElement.sendKeys(appointmentNotesTextAreaValue);
		WebElement saveAppointmentNotesButtonElement = wait
				.until(ExpectedConditions.elementToBeClickable(saveAppointmentNotesButton));
		saveAppointmentNotesButtonElement.click();

	}

	public void hasPermissionToViewAppointmentOutreachNotes() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement appointmentStatusUpdateIconElement = wait
				.until(ExpectedConditions.elementToBeClickable(appointmentOutreachNotesViewIcon));
		appointmentStatusUpdateIconElement.click();

	}

	public void canUpdateAppointmentStatus() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement appointmentStatusUpdateIconElement = wait
				.until(ExpectedConditions.elementToBeClickable(appointmentStatusUpdateIcon));
		appointmentStatusUpdateIconElement.click();
		WebElement appointmentOutreachStatusDropdownElement = wait
				.until(ExpectedConditions.elementToBeClickable(appointmentOutreachStatusDropdown));
		Select statusDropdownSelect = new Select(appointmentOutreachStatusDropdownElement);
		statusDropdownSelect.selectByIndex(2);
		WebElement saveStatusButtonElement = wait.until(ExpectedConditions.elementToBeClickable(saveStatusButton));
		saveStatusButtonElement.click();
	}

	public void hasPermissionToExportAppointmentOutreachToExcel() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement exportAppointmentOutreachIconElement = wait
				.until(ExpectedConditions.elementToBeClickable(exportAppointmentOutreachIcon));
		exportAppointmentOutreachIconElement.click();
	}

	public void hasPermissionToSendAppointmentOutreachVCard() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement rescheduledHeaderElement = wait.until(ExpectedConditions.elementToBeClickable(sendVCardButton));
		rescheduledHeaderElement.click();
		String vCardPhoneNumberValue = Hooks.prop.getProperty("vCardPhoneNumberInput");
		WebElement vCardPhoneNumberInputElement = driver.findElement(vCardPhoneNumberInput);
		vCardPhoneNumberInputElement.sendKeys(vCardPhoneNumberValue);
		String vCardBodyValue = Hooks.prop.getProperty("vCardBodyInput");
		WebElement vCardBodyTextareaElement = driver.findElement(vCardBodyTextarea);
		vCardBodyTextareaElement.sendKeys(vCardBodyValue);
		WebElement gridTemplateSaveButtonElement = wait
				.until(ExpectedConditions.elementToBeClickable(submitSendVCardBtn));
		gridTemplateSaveButtonElement.click();
	}

	public void hasPermissionToSendAppointmentOutreachQuickText() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement quickSmsIconElement = wait.until(ExpectedConditions.elementToBeClickable(quickSmsIcon));
		quickSmsIconElement.click();
		WebElement quickTextTemplateDropdownElement = wait
				.until(ExpectedConditions.elementToBeClickable(quickTextTemplateDropdown));
		Select templateSelect = new Select(quickTextTemplateDropdownElement);
		templateSelect.selectByIndex(1);
		String quickTextPhoneNumberValue = Hooks.prop.getProperty("quickTextPhoneNumberValue");
		WebElement quickTextPhoneNumberInputElement = driver.findElement(quickTextPhoneNumberInput);
		quickTextPhoneNumberInputElement.sendKeys(quickTextPhoneNumberValue);
		WebElement quickSmsSendButtonElement = wait.until(ExpectedConditions.elementToBeClickable(quickSmsSendButton));
		quickSmsSendButtonElement.click();
	}

	public void hasPermissionToSendAppointmentOutreachBotCall() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement calloutToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(calloutToAllIconPath));
		calloutToAllIcon.click();
		WebElement calloutTemplateDropdown = wait
				.until(ExpectedConditions.elementToBeClickable(calloutToAllTemplateDropdown));
		Select calloutTemplateSelect = new Select(calloutTemplateDropdown);
		calloutTemplateSelect.selectByIndex(1);
		WebElement calloutToAllButtonElement = wait.until(ExpectedConditions.elementToBeClickable(calloutToAllButton));
		calloutToAllButtonElement.click();
	}

	public void canSendAppointmentOutreachText() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement smsToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(smsToAllIconPath));
		smsToAllIcon.click();
		WebElement smsTemplateDropdown = wait.until(ExpectedConditions.elementToBeClickable(smsToAllTemplateDropdown));
		Select smsTemplateSelect = new Select(smsTemplateDropdown);
		smsTemplateSelect.selectByIndex(1);
		WebElement smsToAllButtonElement = wait.until(ExpectedConditions.elementToBeClickable(smsToAllButton));
		smsToAllButtonElement.click();
	}

	public void hasPermissionToSendAppointmentOutreachFax() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement faxToAllButtonIconElement = wait.until(ExpectedConditions.elementToBeClickable(faxToAllButtonIcon));
		faxToAllButtonIconElement.click();
		WebElement templateSubmitButtonElement = wait
				.until(ExpectedConditions.elementToBeClickable(faxToAllDeleteConfirmButton));
		templateSubmitButtonElement.click();
	}

	public void hasPermissionToSendAppointmentOutreachMail() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement mailToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(mailToAllIconPath));
		mailToAllIcon.click();
		WebElement templateDropdown = wait.until(ExpectedConditions.elementToBeClickable(mailToAllTemplateDropdown));
		Select selectTemplate = new Select(templateDropdown);
		selectTemplate.selectByIndex(1);
		WebElement mailToAllBtn = wait.until(ExpectedConditions.elementToBeClickable(mailToAllButton));
		mailToAllBtn.click();
	}

	public void createFullAppointmentOutreachAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
	}

	// Action Workflow
	public String addTemplateActionWorkflowValidationMessagesAreShownForRequiredFields() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement smsToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(addTemplateButtonIcon));
		smsToAllIcon.click();
		WebElement smsToAllSubmitBtn = wait.until(ExpectedConditions.elementToBeClickable(saveButton));
		smsToAllSubmitBtn.click();
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public String sendVcardActionWorkflowValidationMessagesAreShownForRequiredFields() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement smsToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(sendVCardButton));
		smsToAllIcon.click();
		WebElement smsToAllSubmitBtn = wait.until(ExpectedConditions.elementToBeClickable(submitSendVCardBtn));
		smsToAllSubmitBtn.click();
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public String quickTextActionWorkflowValidationMessagesAreShownForRequiredFields() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement smsToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(quickSmsIcon));
		smsToAllIcon.click();
		WebElement smsToAllSubmitBtn = wait.until(ExpectedConditions.elementToBeClickable(quickSmsSendButton));
		smsToAllSubmitBtn.click();
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public void exportActionWorkflowToExcel() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement exportExcelElement = wait.until(ExpectedConditions.elementToBeClickable(exportExcelBtn));
		exportExcelElement.click();

	}

	public void clickSendVCardButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement rescheduledHeaderElement = wait.until(ExpectedConditions.elementToBeClickable(sendVCardButton));
		rescheduledHeaderElement.click();
		String vCardPhoneNumberValue = Hooks.prop.getProperty("vCardPhoneNumberInput");
		WebElement vCardPhoneNumberInputElement = driver.findElement(vCardPhoneNumberInput);
		vCardPhoneNumberInputElement.sendKeys(vCardPhoneNumberValue);
		String vCardBodyValue = Hooks.prop.getProperty("vCardBodyInput");
		WebElement vCardBodyTextareaElement = driver.findElement(vCardBodyTextarea);
		vCardBodyTextareaElement.sendKeys(vCardBodyValue);
		WebElement gridTemplateSaveButtonElement = wait
				.until(ExpectedConditions.elementToBeClickable(submitSendVCardBtn));
		gridTemplateSaveButtonElement.click();
	}

	public void userSelectsCompanyDefaultCheckboxInGridTemplate() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement rescheduledHeaderElement = wait.until(ExpectedConditions.elementToBeClickable(rescheduledHeader));
		rescheduledHeaderElement.click();
		WebElement gridTemplateAddButtonElement = wait.until(ExpectedConditions.elementToBeClickable(gridTemplateAdd));
		gridTemplateAddButtonElement.click();
		WebElement queueDropdownElement = wait.until(ExpectedConditions.elementToBeClickable(selectQueueDropdown));
		Select templateSelect = new Select(queueDropdownElement);
		templateSelect.selectByIndex(5);
		String gridTemplateNameValue = Hooks.prop.getProperty("gridTemplateNameInput");
		WebElement gridTemplateNameInputElement = driver.findElement(gridTemplateNameInput);
		gridTemplateNameInputElement.sendKeys(gridTemplateNameValue);
		WebElement companyDefaultLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(companyDefaultLabel));
		companyDefaultLabelElement.click();
		WebElement gridTemplateSaveButtonElement = wait
				.until(ExpectedConditions.elementToBeClickable(gridTemplateSaveButton));
		gridTemplateSaveButtonElement.click();
	}

	public void verifyUserCanDeleteGridTemplate() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement rescheduledHeaderElement = wait.until(ExpectedConditions.elementToBeClickable(rescheduledHeader));
		rescheduledHeaderElement.click();
		WebElement deleteTemplateIconElement = wait.until(ExpectedConditions.elementToBeClickable(deleteTemplateIcon));
		deleteTemplateIconElement.click();
		WebElement deleteConfirmButtonElement = wait
				.until(ExpectedConditions.elementToBeClickable(deleteConfirmButton));
		deleteConfirmButtonElement.click();
	}

	public void verifyUserCanEditGridTemplate() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement rescheduledHeaderElement = wait.until(ExpectedConditions.elementToBeClickable(rescheduledHeader));
		rescheduledHeaderElement.click();
		WebElement gridTemplateEditIconElement = wait.until(ExpectedConditions.elementToBeClickable(gridTemplateEdit));
		gridTemplateEditIconElement.click();
		WebElement gridTemplateEditActionIconElement = wait
				.until(ExpectedConditions.elementToBeClickable(unionIconPath));
		gridTemplateEditActionIconElement.click();
		String gridTemplateNameValue = Hooks.prop.getProperty("gridTemplateNameInput");
		WebElement gridTemplateNameInputElement = driver.findElement(gridTemplateNameInput);
		gridTemplateNameInputElement.sendKeys(gridTemplateNameValue);
		WebElement gridTemplateSaveButtonElement = wait
				.until(ExpectedConditions.elementToBeClickable(gridTemplateSaveButton));
		gridTemplateSaveButtonElement.click();
	}

	public void canAddGridTemplate() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement rescheduledHeaderElement = wait.until(ExpectedConditions.elementToBeClickable(rescheduledHeader));
		rescheduledHeaderElement.click();
		WebElement gridTemplateAddButtonElement = wait.until(ExpectedConditions.elementToBeClickable(gridTemplateAdd));
		gridTemplateAddButtonElement.click();
		WebElement queueDropdownElement = wait.until(ExpectedConditions.elementToBeClickable(selectQueueDropdown));
		Select templateSelect = new Select(queueDropdownElement);
		templateSelect.selectByIndex(5);
		String gridTemplateNameValue = Hooks.prop.getProperty("gridTemplateNameInput");
		WebElement gridTemplateNameInputElement = driver.findElement(gridTemplateNameInput);
		gridTemplateNameInputElement.sendKeys(gridTemplateNameValue);
		WebElement gridTemplateSaveButtonElement = wait
				.until(ExpectedConditions.elementToBeClickable(gridTemplateSaveButton));
		gridTemplateSaveButtonElement.click();
	}

	public void canShowPastRunningLinesCheckbox() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement showPastRunningLineCheckboxElement = wait
				.until(ExpectedConditions.elementToBeClickable(showPastRunningLineCheckboxLabel));
		showPastRunningLineCheckboxElement.click();
	}

	public void openclinicalWorkflowActionWorkflowUrl(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/ClinicalWorkflow/Home/ActionWorkflow"));
	}

	public void canShowAllRunningLinesCheckbox() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement runningLineCheckboxLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(runningLineCheckboxLabel));
		runningLineCheckboxLabelElement.click();
	}

	public void canViewQuickText() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement quickSmsIconElement = wait.until(ExpectedConditions.elementToBeClickable(quickSmsIcon));
		quickSmsIconElement.click();
		WebElement quickTextTemplateDropdownElement = wait
				.until(ExpectedConditions.elementToBeClickable(quickTextTemplateDropdown));
		Select templateSelect = new Select(quickTextTemplateDropdownElement);
		templateSelect.selectByIndex(1);
		String quickTextPhoneNumberValue = Hooks.prop.getProperty("quickTextPhoneNumberValue");
		WebElement quickTextPhoneNumberInputElement = driver.findElement(quickTextPhoneNumberInput);
		quickTextPhoneNumberInputElement.sendKeys(quickTextPhoneNumberValue);
		WebElement quickSmsSendButtonElement = wait.until(ExpectedConditions.elementToBeClickable(quickSmsSendButton));
		quickSmsSendButtonElement.click();
	}

	public void canViewActionWorkflowBotCall() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement calloutToAllIconElement = wait.until(ExpectedConditions.elementToBeClickable(calloutToAllIconPath));
		calloutToAllIconElement.click();
		WebElement calloutSubmitButtonElement = wait
				.until(ExpectedConditions.elementToBeClickable(calloutToAllDeleteConfirmButton));
		calloutSubmitButtonElement.click();
	}

	public void canViewActionWorkflowText() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement smsToAllButtonIconElement = wait.until(ExpectedConditions.elementToBeClickable(smsToAllIconPath));
		smsToAllButtonIconElement.click();
		WebElement smsSubmitButtonElement = wait
				.until(ExpectedConditions.elementToBeClickable(smsToAllDeleteConfirmButton));
		smsSubmitButtonElement.click();
	}

	public void canSendFax() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement faxToAllButtonIconElement = wait.until(ExpectedConditions.elementToBeClickable(faxToAllButtonIcon));
		faxToAllButtonIconElement.click();
		WebElement templateSubmitButtonElement = wait
				.until(ExpectedConditions.elementToBeClickable(faxToAllDeleteConfirmButton));
		templateSubmitButtonElement.click();
	}

	public void canViewActionWorkflowMail() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement mailToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(mailToAllIconPath));
		mailToAllIcon.click();
		WebElement mailToAllBtn = wait.until(ExpectedConditions.elementToBeClickable(mailToAllDeleteConfirmButton));
		mailToAllBtn.click();
	}

	public void openclinicalWorkflowAppointmentOutreachUrl(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/ClinicalWorkflow/Home/AppointmentOutreach"));
	}

	public void verifyWorkflowExportToExcelIsDisabled() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(exportExcelBtn, 0));

	}

	public void verifyUserIsRestrictedFromSendingVCard() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(sendVCardButton, 0));

	}

	public void verifyUserCannotUseCompanyDefaultCheckboxForGridTemplate() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(gridTemplateAdd, 0));

	}

	public void userShouldNotBeAbleToDeleteGridTemplate() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(deleteTemplateIcon, 0));

	}

	public void userShouldNotBeAbleToEditGridTemplate() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(gridTemplateEdit, 0));

	}

	public void verifyUserCannotAccessGridTemplateAdd() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(gridTemplateAdd, 0));

	}

	public void verifyUserCannotViewPastRunninglinesCheckbox() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(showPastRunningLineCheckboxLabel, 0));

	}

	public void verifyUserCannotSelectShowAllRunninglinesCheckbox() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(runningLineCheckboxLabel, 0));

	}

	public void userShouldNotBeAbleToQuickText() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(quickSmsIcon, 0));

	}

	public void verifyUserCannotSendCommunications() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(mailToAllIconPath, 0));
		wait.until(ExpectedConditions.numberOfElementsToBe(faxToAllButtonIcon, 0));
		wait.until(ExpectedConditions.numberOfElementsToBe(smsToAllIconPath, 0));
		wait.until(ExpectedConditions.numberOfElementsToBe(calloutToAllIconPath, 0));

	}

	public void iCreateAProfileWithViewOnlyAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement clinicalActionWorkflowAllLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalActionWorkFlowAllLabel));
		clinicalActionWorkflowAllLabelElement.click();
		WebElement clinicalActionWorkflowViewLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalActionWorkFlowViewLabel));
		clinicalActionWorkflowViewLabelElement.click();
	}

	// Upload Wizard Setting

	public void deleteClinicalQueueRule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement clinicalQueueRuleDeleteElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalQueueRuleDelete));
		clinicalQueueRuleDeleteElement.click();
	}

	public void clinicalQueueRuleEdit() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement clinicalQueueRuleAddElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalQueueRuleView));
		clinicalQueueRuleAddElement.click();
		String clinicalQueueRuleTitleInputValue = Hooks.prop.getProperty("clinicalQueueRuleTitleInput");
		WebElement clinicalQueueRuleTitleInputElement = driver.findElement(clinicalQueueRuleTitle);
		clinicalQueueRuleTitleInputElement.sendKeys(clinicalQueueRuleTitleInputValue);
		WebElement clinicalQueueDropdownElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalQueueRuleClinicalQueueId));
		Select clinicalQueueSelect = new Select(clinicalQueueDropdownElement);
		clinicalQueueSelect.selectByIndex(2);
		WebElement stringOperatorDropdownElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalQueueRuleStringOperator));
		Select stringOperatorSelect = new Select(stringOperatorDropdownElement);
		stringOperatorSelect.selectByIndex(2);
		String clinicalQueueRuleValue1InputValue = Hooks.prop.getProperty("clinicalQueueRuleValue1Input");
		WebElement clinicalQueueRuleValue1InputElement = driver.findElement(clinicalQueueRuleValue1);
		clinicalQueueRuleValue1InputElement.sendKeys(clinicalQueueRuleValue1InputValue);
		WebElement clinicalQueueRuleSubmitButtonElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalQueueRuleSubmitButton));
		clinicalQueueRuleSubmitButtonElement.click();
	}

	public void addClinicalQueueRule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement clinicalQueueRuleAddElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalQueueRuleAdd));
		clinicalQueueRuleAddElement.click();
		String clinicalQueueRuleTitleInputValue = Hooks.prop.getProperty("clinicalQueueRuleTitleInput");
		WebElement clinicalQueueRuleTitleInputElement = driver.findElement(clinicalQueueRuleTitle);
		clinicalQueueRuleTitleInputElement.sendKeys(clinicalQueueRuleTitleInputValue);
		WebElement clinicalQueueDropdownElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalQueueRuleClinicalQueueId));
		Select clinicalQueueSelect = new Select(clinicalQueueDropdownElement);
		clinicalQueueSelect.selectByIndex(2);
		WebElement stringOperatorDropdownElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalQueueRuleStringOperator));
		Select stringOperatorSelect = new Select(stringOperatorDropdownElement);
		stringOperatorSelect.selectByIndex(2);
		String clinicalQueueRuleValue1InputValue = Hooks.prop.getProperty("clinicalQueueRuleValue1Input");
		WebElement clinicalQueueRuleValue1InputElement = driver.findElement(clinicalQueueRuleValue1);
		clinicalQueueRuleValue1InputElement.sendKeys(clinicalQueueRuleValue1InputValue);
		WebElement clinicalQueueRuleSubmitButtonElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalQueueRuleSubmitButton));
		clinicalQueueRuleSubmitButtonElement.click();
	}

	public void clinicalQueueRuleView() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModuleLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalQueueRuleView));
		selectAllModuleLabelElement.click();

	}

	public void copyClinicalQueueColumn() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModuleLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(copyClinicalQueueColumn));
		selectAllModuleLabelElement.click();

	}

	public void clinicalColumnSortOrderUpdate() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModuleLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalColumnSortOrderUpdate));
		selectAllModuleLabelElement.click();

	}

	public void allowClinicalQueueColumnDelete() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModuleLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalQueueColumnDeleteIcon));
		selectAllModuleLabelElement.click();

	}

	public void allowClinicalQueueColumnAdd() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement clinicalQueueDropdownElement = driver.findElement(clinicalQueueDropdown);
		Select clinicalQueueSelect = new Select(clinicalQueueDropdownElement);
		clinicalQueueSelect.selectByIndex(3);
		WebElement selectAllModuleLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalQueueColumnAddDropdown));
		selectAllModuleLabelElement.click();

	}

	public void openClinicalQueueSettingPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ClinicalQueueSetting"));
	}

	public void createClinicalQueueAccessProfileFullAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModuleLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModuleLabelElement.click();

	}

	// Dashboard
	public void userCreatesProfileWithFullAccessAndAllPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModuleElement = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModuleElement.click();
		WebElement clinicalWorkflowDashboardAllElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalActionWorkFlowAllLabel));
		clinicalWorkflowDashboardAllElement.click();
		WebElement clinicalWorkflowDashboardViewElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalActionWorkFlowViewLabel));
		clinicalWorkflowDashboardViewElement.click();
	}

	public void cannotUpdateAppointmentAction() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement yearDropdownElement = driver.findElement(ddYearDropdown);
		Select select = new Select(yearDropdownElement);
		select.selectByIndex(3);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(updateAppointmentAction, 0));
	}

	public void cannotViewAllCommunication() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement yearDropdownElement = driver.findElement(ddYearDropdown);
		Select select = new Select(yearDropdownElement);
		select.selectByIndex(3);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(AllCommunicationView, 0));
	}

	public void cannotExportToExcel() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(exportIcon, 0));
	}

	public void cannotInitiateBotCall() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(calloutToAllIconPath, 0));
	}

	public void cannotSendText() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(smsToAllIconPath, 0));
	}

	public void cannotSendMail() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.numberOfElementsToBe(mailToAllIconPath, 0));
	}

	public void userCreatesProfileWithViewOnlyAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModuleElement = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModuleElement.click();
		WebElement clinicalWorkflowDashboardAllElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalWorkflowDashboardAllLabel));
		clinicalWorkflowDashboardAllElement.click();
		WebElement clinicalWorkflowDashboardViewElement = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalWorkflowDashboardViewLabel));
		clinicalWorkflowDashboardViewElement.click();
	}

	public String checkAppointmentActionAlertNoteValidationMessagesForRequiredFields() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement updateAppointmentBtn = wait.until(ExpectedConditions.elementToBeClickable(updateAppointmentAction));
		updateAppointmentBtn.click();

		WebElement alertLabelElement = wait.until(ExpectedConditions.elementToBeClickable(alertLabel));
		alertLabelElement.click();

		WebElement saveActionBtn = wait.until(ExpectedConditions.elementToBeClickable(saveActionButton));
		saveActionBtn.click();

		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public String submitWithoutEnteringRequiredFields() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement calloutToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(calloutToAllIconPath));
		calloutToAllIcon.click();
		WebElement calloutToAllSubmitBtn = wait.until(ExpectedConditions.elementToBeClickable(calloutToAllButton));
		calloutToAllSubmitBtn.click();
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public String botCallToAllValidationMessagesAreShownForRequiredFields() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement calloutToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(calloutToAllIconPath));
		calloutToAllIcon.click();
		WebElement calloutToAllSubmitBtn = wait.until(ExpectedConditions.elementToBeClickable(calloutToAllButton));
		calloutToAllSubmitBtn.click();
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public String checkTextToAllValidationMessagesForRequiredFields() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement smsToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(smsToAllButtonIcon));
		smsToAllIcon.click();
		WebElement smsToAllSubmitBtn = wait.until(ExpectedConditions.elementToBeClickable(smsToAllSubmitButton));
		smsToAllSubmitBtn.click();
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public String displayValidationMessagesForRequiredFields() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement mailToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(mailToAllIconPath));
		mailToAllIcon.click();
		WebElement mailToAllBtn = wait.until(ExpectedConditions.elementToBeClickable(mailToAllButton));
		mailToAllBtn.click();
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public void userUpdatesAppointment() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement yearDropdownElement = driver.findElement(ddYearDropdown);
		Select yearSelect = new Select(yearDropdownElement);
		yearSelect.selectByIndex(3);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement updateAppointmentActionElement = wait
				.until(ExpectedConditions.elementToBeClickable(updateAppointmentAction));
		updateAppointmentActionElement.click();
		WebElement appointmentStatusDropdownElement = driver.findElement(appointmentActionStatusDropdown);
		Select appointmentStatusSelect = new Select(appointmentStatusDropdownElement);
		appointmentStatusSelect.selectByIndex(3);
		WebElement alertLabelElement = wait.until(ExpectedConditions.elementToBeClickable(alertLabel));
		alertLabelElement.click();
		String appointmentActionNotesValue = Hooks.prop.getProperty("appointmentActionNotesValue");
		WebElement appointmentActionNotesElement = driver.findElement(appointmentActionNotesTextarea);
		appointmentActionNotesElement.sendKeys(appointmentActionNotesValue);
		WebElement saveActionButtonElement = wait.until(ExpectedConditions.elementToBeClickable(saveActionButton));
		saveActionButtonElement.click();
	}

	public void verifyUserCanViewAllCommunications() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement yearDropdownElement = driver.findElement(ddYearDropdown);
		Select select = new Select(yearDropdownElement);
		select.selectByIndex(3);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement allCommunicationViewElement = wait
				.until(ExpectedConditions.elementToBeClickable(AllCommunicationView));
		allCommunicationViewElement.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement mailOptionElement = wait.until(ExpectedConditions.elementToBeClickable(mailOption));
		mailOptionElement.click();
		WebElement botCallOptionElement = wait.until(ExpectedConditions.elementToBeClickable(botCallOption));
		botCallOptionElement.click();
		WebElement faxOptionElement = wait.until(ExpectedConditions.elementToBeClickable(faxOption));
		faxOptionElement.click();
	}

	public void userCanDownloadExcel() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement exportIconElement = wait.until(ExpectedConditions.elementToBeClickable(exportIcon));
		exportIconElement.click();
	}

	public void userCanMakeBotCall() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement calloutToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(calloutToAllIconPath));
		calloutToAllIcon.click();
		WebElement calloutTemplateDropdown = wait
				.until(ExpectedConditions.elementToBeClickable(calloutToAllTemplateDropdown));
		Select calloutTemplateSelect = new Select(calloutTemplateDropdown);
		calloutTemplateSelect.selectByIndex(1);
		WebElement calloutToAllButtonElement = wait.until(ExpectedConditions.elementToBeClickable(calloutToAllButton));
		calloutToAllButtonElement.click();
	}

	public void userCanSendText() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement smsToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(smsToAllIconPath));
		smsToAllIcon.click();
		WebElement smsTemplateDropdown = wait.until(ExpectedConditions.elementToBeClickable(smsToAllTemplateDropdown));
		Select smsTemplateSelect = new Select(smsTemplateDropdown);
		smsTemplateSelect.selectByIndex(1);
		WebElement smsToAllButtonElement = wait.until(ExpectedConditions.elementToBeClickable(smsToAllButton));
		smsToAllButtonElement.click();
	}

	public void verifyUserCanSendMail() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement mailToAllIcon = wait.until(ExpectedConditions.elementToBeClickable(mailToAllIconPath));
		mailToAllIcon.click();
		WebElement templateDropdown = wait.until(ExpectedConditions.elementToBeClickable(mailToAllTemplateDropdown));
		Select selectTemplate = new Select(templateDropdown);
		selectTemplate.selectByIndex(1);
		WebElement mailToAllBtn = wait.until(ExpectedConditions.elementToBeClickable(mailToAllButton));
		mailToAllBtn.click();
	}

	public void openClinicalWorkflowDashboard(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/ClinicalWorkflow/Home/Dashboard"));
	}

	public void createFullAccessDashboardProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
	}

	// Appointment Reminder Setting
	public void createProfileForAppointmentReminderSettingViewDelete() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement ellipsisIconFirstElement = wait.until(ExpectedConditions.elementToBeClickable(ellipsisIconFirst));
		ellipsisIconFirstElement.click();
		sleep(2000);
		WebElement editSpanFirstElement = wait.until(ExpectedConditions.elementToBeClickable(deleteSpanFirst));
		editSpanFirstElement.click();
		sleep(2000);
		WebElement saveAppointmentReminderButtonElement = wait
				.until(ExpectedConditions.elementToBeClickable(confirmDeleteAppointmentReminderButton));
		saveAppointmentReminderButtonElement.click();
	}

	public void createProfileForAppointmentReminderSettingViewEdit() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement ellipsisIconFirstElement = wait.until(ExpectedConditions.elementToBeClickable(ellipsisIconFirst));
		ellipsisIconFirstElement.click();
		sleep(2000);
		WebElement editSpanFirstElement = wait.until(ExpectedConditions.elementToBeClickable(editSpanFirst));
		editSpanFirstElement.click();
		sleep(2000);
		WebElement appointmentReminderDayTypeDropdownElement = wait
				.until(ExpectedConditions.elementToBeClickable(appointmentReminderDayTypeDropdown));
		Select appointmentReminderDayTypeSelect = new Select(appointmentReminderDayTypeDropdownElement);
		appointmentReminderDayTypeSelect.selectByIndex(2);
		WebElement appointmentReminderDayDropdownElement = wait
				.until(ExpectedConditions.elementToBeClickable(appointmentReminderDayDropdown));
		Select appointmentReminderDaySelect = new Select(appointmentReminderDayDropdownElement);
		appointmentReminderDaySelect.selectByIndex(2);
		String appointmentReminderNotesInputValue = Hooks.prop.getProperty("appointmentReminderNotesInput");
		WebElement appointmentReminderNotesInputElement = driver.findElement(appointmentReminderNotesInput);
		appointmentReminderNotesInputElement.sendKeys(appointmentReminderNotesInputValue);
		WebElement saveAppointmentReminderButtonElement = wait
				.until(ExpectedConditions.elementToBeClickable(saveAppointmentReminderButton));
		saveAppointmentReminderButtonElement.click();
	}

	public void createProfileForAppointmentReminderSettingViewAdd() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement newAppointmentReminderSpanElement = wait
				.until(ExpectedConditions.elementToBeClickable(newAppointmentReminderSpan));
		newAppointmentReminderSpanElement.click();
		sleep(2000);
		WebElement appointmentReminderDayTypeDropdownElement = wait
				.until(ExpectedConditions.elementToBeClickable(appointmentReminderDayTypeDropdown));
		Select appointmentReminderDayTypeSelect = new Select(appointmentReminderDayTypeDropdownElement);
		appointmentReminderDayTypeSelect.selectByIndex(2);
		WebElement appointmentReminderDayDropdownElement = wait
				.until(ExpectedConditions.elementToBeClickable(appointmentReminderDayDropdown));
		Select appointmentReminderDaySelect = new Select(appointmentReminderDayDropdownElement);
		appointmentReminderDaySelect.selectByIndex(2);
		String appointmentReminderNotesInputValue = Hooks.prop.getProperty("appointmentReminderNotesInput");
		WebElement appointmentReminderNotesInputElement = driver.findElement(appointmentReminderNotesInput);
		appointmentReminderNotesInputElement.sendKeys(appointmentReminderNotesInputValue);
		WebElement saveAppointmentReminderButtonElement = wait
				.until(ExpectedConditions.elementToBeClickable(saveAppointmentReminderButton));
		saveAppointmentReminderButtonElement.click();
	}

	public void addAppointmentReminderSettingProfileWithViewPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModuleLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModuleLabelElement.click();
		WebElement appointmentReminderSettingAddLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(appointmentReminderSettingAddLabel));
		appointmentReminderSettingAddLabelElement.click();
		WebElement appointmentReminderSettingEditLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(appointmentReminderSettingEditLabel));
		appointmentReminderSettingEditLabelElement.click();
		WebElement appointmentReminderSettingDeleteLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(appointmentReminderSettingDeleteLabel));
		appointmentReminderSettingDeleteLabelElement.click();
	}

	public void addAppointmentReminderSettingProfileWithDeletePermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModuleLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModuleLabelElement.click();
		WebElement appointmentReminderSettingAddLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(appointmentReminderSettingAddLabel));
		appointmentReminderSettingAddLabelElement.click();

		WebElement appointmentReminderSettingEditLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(appointmentReminderSettingEditLabel));
		appointmentReminderSettingEditLabelElement.click();

	}

	public void addAppointmentReminderSettingProfileWithEditPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModuleLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModuleLabelElement.click();
		WebElement appointmentReminderSettingAddLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(appointmentReminderSettingAddLabel));
		appointmentReminderSettingAddLabelElement.click();
		WebElement appointmentReminderSettingDeleteLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(appointmentReminderSettingDeleteLabel));
		appointmentReminderSettingDeleteLabelElement.click();
	}

	public void addAppointmentReminderSettingProfileWithPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModuleLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModuleLabelElement.click();
		WebElement appointmentReminderSettingEditLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(appointmentReminderSettingEditLabel));
		appointmentReminderSettingEditLabelElement.click();

		WebElement appointmentReminderSettingDeleteLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(appointmentReminderSettingDeleteLabel));
		appointmentReminderSettingDeleteLabelElement.click();
	}

	// Appointment Reminder Setting
	public void restrictAppointmentReminderSettingModification() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(newAppointmentReminderSpan));
		WebElement thirdRowActionIconElement = wait.until(ExpectedConditions.elementToBeClickable(ellipsisIconFirst));
		thirdRowActionIconElement.click();
		sleep(2000);
		wait.until(ExpectedConditions.numberOfElementsToBe(editSpanFirst, 0));
		wait.until(ExpectedConditions.numberOfElementsToBe(deleteSpanFirst, 0));

	}

	public void UnsupportedOperationException() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(newAppointmentReminderSpan));
		WebElement thirdRowActionIconElement = wait.until(ExpectedConditions.elementToBeClickable(ellipsisIconFirst));
		thirdRowActionIconElement.click();
		sleep(2000);
		wait.until(ExpectedConditions.numberOfElementsToBe(deleteSpanFirst, 0));

	}

	public void preventAppointmentReminderSettingAddOrEdit() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(newAppointmentReminderSpan));
		WebElement thirdRowActionIconElement = wait.until(ExpectedConditions.elementToBeClickable(ellipsisIconFirst));
		thirdRowActionIconElement.click();
		sleep(2000);
		wait.until(ExpectedConditions.numberOfElementsToBe(editSpanFirst, 0));

	}

	public void preventAppointmentReminderSettingEditOrDelete() {
		WebElement thirdRowActionIconElement = wait.until(ExpectedConditions.elementToBeClickable(ellipsisIconFirst));
		thirdRowActionIconElement.click();
		sleep(2000);
		wait.until(ExpectedConditions.numberOfElementsToBe(editSpanFirst, 0));
		wait.until(ExpectedConditions.numberOfElementsToBe(deleteSpanFirst, 0));

	}

	public void openAppointmentReminderSettingPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/AppointmentReminderSetting"));
	}

	// General
	public void createProfileNoClinicalWorkflowAuditAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
	}

	public void createProfileWithViewOnlyAccessToClinicalWorkflowAudit() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
	}

	public void openclinicalworkflowPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/ClinicalWorkflow/Home/ActionWorkflow"));
	}

	public void userCannotAccessClinicalWorkflowAuditView() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(runningLineCheckboxLabel));

	}

	public void verifyGeneralAuditViewColumns() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(runningLineCheckboxLabel)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(dateTimeSpan));
	}

	public clinicalworkflowpage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void openclinicalworkflowPage(String fullUrl, String expectedUrlFragment) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains(expectedUrlFragment));
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
