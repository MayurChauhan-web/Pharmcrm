package com.pharmcrm_ClinicalworkflowModule.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import hooks.Hooks;

public class clinicalworkflowpage {

	private WebDriver driver;
	private WebDriverWait wait;

	// Action Work Flow
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
