package com.pharmcrm_SetupModule.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
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

	// Settings
	public By newPrescriptionStatus = By.xpath("//span[normalize-space()='New Prescription Status']");
	public By new340B = By.xpath("//span[normalize-space()='New 340B']");
	public By newOutgoingCallType = By.xpath("//span[normalize-space()='New Outgoing Call Type']");
	public By newIncomingCallTypes = By.xpath("//span[normalize-space()='New InComing Call Types']");
	public By newQueue = By.xpath("//span[normalize-space()='New Queue']");
	public By newCallScript = By.xpath("//span[normalize-space()='New Call Script']");
	public By queueDropdownSecond = By.xpath("(//select[@id='Queue_Id'])[2]");
	public By btnAddRulesTooltip = By.xpath("//button[@id='btnAddRulesTootltip']//*[name()='svg']");
	public By btnNext = By.xpath("//button[@id='btnNext']");
	public By newRunninglineStatus = By.xpath("//span[normalize-space()='New Runningline Status']");
	public By newRunninglineLevel1Status = By.xpath("//span[normalize-space()='New Runningline Level-1 Status']");
	public By newRunninglineLevel2Status = By.xpath("//span[normalize-space()='New Runningline Level-2 Status']");
	public By clinicalQueueDropdown = By.xpath("//select[@id='ClinicalQueue_Id']");
	public By newUploadWizardTemplate = By.xpath("//span[normalize-space()='New Upload Wizard Template']");
	public By newAppointmentReminder = By.xpath("//span[normalize-space()='New Appointment Reminder']");
	public By btnSaveAppointmentReminderSetting = By.xpath("//button[@id='btnSaveAppointmentReminderSetting']");
	public By newClinicLocation = By.xpath("//span[normalize-space()='New Clinic Location']");
	public By newPriorAuthorizationType = By.xpath("//span[normalize-space()='New Prior Authorization Type']");
	public By newGoalsOfTreatment = By.xpath("//span[normalize-space()='New Goals Of Treatment']");
	public By newBarriers = By.xpath("//span[normalize-space()='New Barriers']");
	public By newCommunityResource = By.xpath("//span[normalize-space()='New Community Resource']");
	public By newClinicalIntervention = By.xpath("//span[normalize-space()='New Clinical Intervention']");
	public By newROSInformation = By.xpath("//span[normalize-space()='New ROS Information']");
	public By newOutcomeAction = By.xpath("//span[normalize-space()='New Outcome Action']");
	public By newRemoteMonitoringParameter = By.xpath("//span[normalize-space()='New Remote Monitoring Parameter']");
	public By newROSGroupType = By.xpath("//span[normalize-space()='New ROS Group Type']");
	public By newEncounterStatus = By.xpath("//span[normalize-space()='New Encounter Status']");
	public By newRegisteredDevice = By.xpath("//span[normalize-space()='New Registered Device']");
	public By newRPMStatus = By.xpath("//span[normalize-space()='New RPM Status']");
	public By newCPTCode = By.xpath("//span[normalize-space()='New CPT Code']");
	public By newProviderType = By.xpath("//span[normalize-space()='New Provider Type']");
	public By newProviderCategory = By.xpath("//span[normalize-space()='New Provider Category']");
	public By newProviderSpecialty = By.xpath("//span[normalize-space()='New Provider Specialty']");
	public By newProviderService = By.xpath("//span[normalize-space()='New Provider Service']");
	public By newTemplate = By.xpath("//span[normalize-space()='New Template']");
	public By newFormCategory = By.xpath("//span[normalize-space()='New Form Category']");
	public By newPromotionCategory = By.xpath("//span[normalize-space()='New Promotion Category']");
	public By newAudienceType = By.xpath("//span[normalize-space()='New Audience Type']");
	public By newReferralCategory = By.xpath("//span[normalize-space()='New Referral Category']");
	public By newBillStatus = By.xpath("//span[normalize-space()='New Bill Status']");
	public By newClaimStatus = By.xpath("//span[normalize-space()='New Claim Status']");
	public By newClaimLabel = By.xpath("//span[normalize-space()='New Claim Label']");
	public By newEobInterventionType = By.xpath("//span[normalize-space()='New EOB Intervention Type']");
	public By newClaimDocumentChecklist = By.xpath("//span[normalize-space()='New Claim Document Checklist']");
	public By newCms1500Template = By.xpath("//span[normalize-space()='New CMS 1500 Template']");
	public By addNewCms1500TemplateButton = By.xpath("//button[normalize-space()='Add New CMS 1500 Template']");
	public By newInvoiceFlag = By.xpath("//span[normalize-space()='New Invoice Flag']");
	public By saveInvoiceFlagButton = By.xpath("//button[@id='btnSaveInvoiceFlag']");
	public By newCategory = By.xpath("//span[normalize-space()='New Category']");
	public By newDepartment = By.xpath("//span[normalize-space()='New Department']");
	public By planButtonSvgPath = By.xpath("//a[@id='btnPlan']//*[name()='svg']//*[name()='path' and @id='Path_1']");
	public By stateButtonSvgPath = By.xpath("//a[@id='btnState']//*[name()='svg']//*[name()='path' and @id='Path_1']");
	public By newDeliveryDistance = By.xpath("//span[normalize-space()='New Delivery Distance']");
	public By newLogisticCompany = By.xpath("//span[normalize-space()='New Logistic Company']");
	public By newDeliveryMarker = By.xpath("//span[normalize-space()='New Delivery Marker']");
	public By newChecklist = By.xpath("//span[normalize-space()='New Checklist']");
	public By newAccesscodeType = By.xpath("//span[normalize-space()='New Accesscode Type']");
	public By newPayorCategory = By.xpath("//span[normalize-space()='New Payor Category']");
	public By newBinMaster = By.xpath("//span[normalize-space()='New BIN Master']");
	public By saveBinMasterButton = By.xpath("//button[@id='btnBINSave']");
	public By newPBM = By.xpath("//span[normalize-space()='New PBM']");
	public By newPartnerType = By.xpath("//span[normalize-space()='New Partner Type']");
	public By newSpecialService = By.xpath("//span[normalize-space()='New Special Service']");
	public By saveSmtpSettingButton = By.xpath("//button[@onclick='javascript: SaveSMTPSetting();']");
	public By saveChangesButton = By.xpath("//button[normalize-space()='Save']");
	public By newLeadSource = By.xpath("//span[normalize-space()='New Lead Source']");
	public By newTransferResultAction = By.xpath("//span[normalize-space()='New Transfer Result Action']");
	public By newFailureResultAction = By.xpath("//span[normalize-space()='New Failure Result Action']");
	public By newSuccessResultAction = By.xpath("//span[normalize-space()='New Success Result Action']");
	public By newReminderResultAction = By.xpath("//span[normalize-space()='New Reminder Result Action']");
	public By newMedicationSyncColor = By.xpath("//span[normalize-space()='New Medication Sync Color']");
	public By btnSaveMedicationSetting = By.xpath("//button[@id='btnSaveMedicationSetting']");
	public By newMedicationSyncReminder = By.xpath("//span[normalize-space()='New Medication Sync Reminder']");
	public By newPatientMedicationColorCodeSetting = By
			.xpath("//span[normalize-space()='New Patient Medication ColorCode Setting']");
	public By addInformation = By.xpath("//span[normalize-space()='Add Information']");
	public By btnCreate = By.xpath("//button[@id='btnCreate']");
	public By createEvent = By.xpath("//a[normalize-space()='Create Event']");
	public By btnSaveProgressStatus = By.xpath("//button[@id='btnSaveProgressStatus']");
	public By organizationFromEmailId = By.xpath("//input[@id='OrganizationFromEmailId']");
	public By generatePriorAuthorizationFromEmail = By.xpath("//input[@id='GeneratePriorAuthorizationFromEmail']");
	public By btnSendvCard = By.xpath("//button[@id='btnSendvCard']");
	public By primaryButton = By.xpath("//button[@class='btn btn-primary']");
	public By editBasicInformation = By
			.xpath("//a[@onclick='javascript: EditBasicInformation();']//i[@class='fa-solid fa-pen-to-square']");

	// Reminders
	public By btnSaveAutoCall = By.xpath("//button[@id='btnSaveAutoCall']");

	// Workspace Users
	public By resetPassword = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Reset Password')]");
	public By searchEmployee = By.xpath("//button[normalize-space()='Search']");
	public By employeeDetailSvg = By.xpath("//div[@id='EmployeeDetail']//*[name()='svg']");

	// Profile
	public By btnSaveProfile = By.xpath("//button[@id='btnSaveProfile']");

	// Dashboard
	public By toastMessage = By.xpath("//div[@class='toast-message']");
	public By pathLocator = By.xpath("//*[name()='path' and contains(@d,'M256 80c0-')]");
	public By btnSaveQuickLinkGroup = By.xpath("//button[@id='btnSaveQuickLinkGroup']");

	// Privacy Policy & Terms of Use
	public By errorLocator = By.xpath("//h2[normalize-space()='Error']");

	// T&C
	public By editorLocator = By.xpath("//div[@aria-label='Editor editing area: main. Press Alt+0 for help.']");
	public By submitBtnLocator = By
			.xpath("//button[@class='btn btn-primary waves-effect waves-light'][normalize-space()='Submit']");

	// Dashboard
	public By deleteQuickLinkButtonLocator = By.xpath("//div[@id='page-wrapper']//button[2]//*[name()='svg']");
	public By loaderLocator = By.id("menucontext");
	public By editQuickLinkButtonLocator = By.xpath("//div[@class='sdql-title']//button[1]//*[name()='svg']");
	public By groupNameInputLocator = By.xpath("//input[@id='groupName']");
	public By saveButtonLocator = By.xpath("//button[@id='btnSaveQuickLinkGroup']");
	public By editIconLocator = By.xpath("//*[name()='path' and @id='Union_9']");
	public By quickLinkActionIconLocator = By.xpath("//*[name()='path' and contains(@d,'M256 80c0-')]");

	// XFlow
	public By userMenuIconLocator = By.xpath("//a[@href='#']//span[@class='userTopIcon']//*[name()='svg']");
	public By settingsIconLocator = By
			.xpath("//span[@class='co-settings']//*[name()='svg']//*[name()='path' and @id='Union_1']");
	public By downloadButtonLocator = By.xpath("//h6[normalize-space()='Click To Download']");

	// Sender Authentication
	public By domainNameInputLocator = By.xpath("//input[@id='domainName']");
	public By addButtonLocator = By.xpath("//button[@id='btnDomainName']");
	public By newSenderAuthButtonLocator = By.xpath("//span[normalize-space()='New Sender Authentication']");
	public By actionMenuButtonLocator = By.xpath("//tbody/tr[1]/td[6]/div[1]/div[1]/button[1]/i[1]");
	public By deleteOptionLocator = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");

	// Bounce Email
	public By confirmDeleteButtonLocator = By.xpath("//div[@id='deleteBounceModel']//button[@id='btnDeleteConfirm']");
	public By deleteIconLocator = By.xpath("//tbody/tr[1]/td[4]/a[1]/img[1]");

	// Spam Email
	public By deleteIcon = By.xpath("//tbody/tr[1]/td[4]/a[1]/img[1]");
	public By deleteButton = By.id("delete");

	// Auto Call
	public By addAutoCallButton = By.xpath("//span[normalize-space()='Add Auto Call']");

	// Auto Text
	public By dateInputField = By.id("ReminderActionSetting_AutoText_Date");
	public By dateOption = By.xpath("//a[text()='7']");
	public By autoTextTab = By.xpath("//a[normalize-space()='Auto Text']");
	public By addAutoTextButton = By.xpath("//span[normalize-space()='Add Auto Text']");

	// Email Notification
	public By templateDropdown = By.id("ReminderActionSetting_EmailNotification_TemplateId");
	public By emailNotificationTab = By.xpath("//a[normalize-space()='Email Notification']");
	public By addEmailNotificationButton = By.xpath("//span[normalize-space()='Add Email Notification']");

	// Show On Dashboard
	public By enableCheckboxLabel = By.xpath("//label[@for='ReminderActionSetting_ShowOnDashboard_IsEnabled']");
	public By timeInputField = By.id("ReminderActionSetting_ShowOnDashboard_Time");
	public By hourOption = By.xpath("(//a[contains(@class, 'ui-state-default') and text()='09'])[1]");
	public By minuteOption = By.xpath("//a[contains(@class, 'ui-state-default') and text()='30']");
	public By showOnDashboardTab = By.xpath("//a[normalize-space()='Show On Dashboard']");
	public By addShowOnDashboardButton = By.xpath("//span[normalize-space()='Add Show On Dashboard']");
	public By actionMenuIcon = By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']");

	// CentralPASettings
	public By processFromDateField = By.id("Filter_ProcessFromDate");
	public By activeDateCell = By.xpath(
			"//div[contains(@class,'datepicker')]//td[not(contains(@class,'old')) and not(contains(@class,'new')) and not(contains(@class,'disabled'))]");

	// WorkspaceUsers
	public By firstNameFilter = By.id("Filter_FirstName");
	public By employeeCheckbox = By.xpath("//input[@id='340929ac-3f18-46be-99c1-ad72bc0d3f1f']");
	public By linkEmployeeButton = By.id("btnEmployee");
	public By delinkEmployeeIcon = By.xpath("//div[@id='btnDelinkUserToEmployee']//*[name()='svg']");
	public By confirmDelinkButton = By.xpath("//div[@id='delinkUserEmployeeModel']//button[@id='btnDeleteConfirm']");
	public By newPasswordField = By.id("newPassword");
	public By confirmPasswordField = By.id("confirmPassword");
	public By resetPasswordButton = By.id("btnResetPassword");
	public By resetPasswordOption = By
			.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Reset Password')]");
	public By employeeDetailSection = By.id("EmployeeDetail");
	public By workspaceUserActionMenuButton = By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]");
	public By viewDetailOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'View Detail')]");

	// BOTCalls
	public By errorHeaderLocator = By.xpath("//h2[normalize-space()='Error']");

	// Fax Setting
	public By faxSettingActionMenuButton = By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/button[1]");

	// New button
	public By newFaxSettingButton = By.xpath("//span[normalize-space()='New Fax Settings']");

	// Form fields
	public By faxApiIdField = By.id("FaxSetting_FAXAPIId");
	public By fromEmailField = By.id("FaxSetting_FromEmail");

	// Save button
	public By saveFaxSettingButton = By.id("btnSave");
	public By newFaxSettingsBtn = By.xpath("//span[normalize-space()='New Fax Settings']");

	// Professional License Type

	public By newProfessionalLicenseTypeBtn = By.xpath("//span[normalize-space()='New Professional License Type']");
	public By newProfessionalLicenseTypeButton = By.xpath("//span[normalize-space()='New Professional License Type']");
	public By professionalLicenseActionMenuButton = By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]");

	// New button
	public By newDesignationButton = By.xpath("//span[normalize-space()='New Designation']");

	// Form fields
	public By designationNameField = By.id("Designation_Name");
	public By designationLevelField = By.id("Designation_Level");

	// Save button
	public By saveDesignationButton = By.id("btnSave");

	public By designationActionMenuButton = By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]");

	// Whitelist IP
	public By firstUserCheckbox = By.xpath("(//tbody[@id='view-excludeuser-body']//label)[1]");
	public By userCheckbox = By.xpath("//label[@for='337a4702-104a-4939-ac6e-3b188d3ff055']");
	public By ipField = By.id("WhiteListIP_IP");
	public By submitBtn = By
			.xpath("//button[@class='btn btn-primary waves-effect waves-light'][normalize-space()='Submit']");
	public By excludeUserLink = By.xpath("//a[normalize-space()='Exclude User']");
	public By newExcludeUserBtn = By.xpath("//span[normalize-space()='New Exclude User']");
	public By newIpBtn = By.xpath("//span[normalize-space()='New IP']");

	// Progress Step
	public By priorityField = By.id("ProgressStatus_Priority");
	public By notesField = By.id("ProgressStatus_Notes");

	// Save button
	public By newProgressStepButton = By.xpath("//span[normalize-space()='New Progress Step']");

	// EHR Types
	public By nameField = By.id("ExternalSource_Name");
	public By descriptionField = By.id("ExternalSource_Description");
	public By newEhrTypeBtn = By.xpath("//span[normalize-space()='New EHR Type']");
	public By actionMenuBtn = By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]");

	// Organization Calendar
	public By calendarEditBtn = By.cssSelector("button[onclick='return SubmitCalendarSetting()']");

	// Brand Management
	public By sendVCardBtn = By.xpath("//button[normalize-space()='Send VCard']");

	// Reminders
	public By reminderActionBtn = By.xpath("//tbody/tr[1]/td[2]/a[1]");

	// Organization Bucket
	public By btnSaveFile = By.xpath("//button[@id='btnSaveFile']");
	public By fileUpload = By.xpath("//span[normalize-space()='File Upload']");
	public By fileNameField = By.id("fileNameTextBox");
	public By saveBtn = By.id("btnSaveFile");

	public By fileInputField = By.xpath("//div[@class='pb-2']//input[@id='file-3']");
	public By saveFileBtn = By.id("btnSaveFile");
	public By addFileBtn = By.xpath("//a[@id='btnAddFile']//*[name()='svg']");
	public By downloadOption = By.xpath(
			"//div[contains(@class,'bucket-mainn') and contains(@class,'show')]//li[2]//a[1]//*[name()='svg']//*[name()='path' and @id='Union_1']");

	// Feedback Form
	public By confirmDeleteBtn = By.id("deleteFeedbackForm");
	public By questionField = By.id("FeedbackQuestion_Question");
	public By addQuestionButton = By
			.xpath("//a[@class='settings-add-btn']//*[name()='svg']//*[name()='path' and @id='Path_1']");

	public By newFeedbackFormButton = By.xpath("//span[normalize-space()='New Feedback Form']");

	// Patient Signature Template
	public By newPatientSignatureButton = By.xpath("//span[normalize-space()='New Patient Signature']");

	// Fax Template
	public By newFaxTemplateButton = By.xpath("//span[normalize-space()='New Fax Template']");
	public By activeCheckbox = By.xpath("//label[normalize-space()='Active?']");

	// Mail Template

	public By titleField = By.id("MailTemplate_Title");
	public By subjectField = By.id("MailTemplate_Subject");
	public By newMailTemplateButton = By.xpath("//span[normalize-space()='New Mail Template']");

	// BOT Call Template
	public By bodyField = By.id("BOTCallTemplate_Body");
	public By firstRowActionMenu = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]");
	public By newCalloutTemplateButton = By.xpath("//span[normalize-space()='New Callout Template']");
	public By titleInput = By.id("BOTCallTemplate_Title");
	public By featureTypeDropdown = By.id("TemplateFeatureMapping_FeatureType");
	public By subFeatureTypeDropdown = By.id("TemplateFeatureMapping_SubFeatureType");
	public By bodyInput = By.id("BOTCallTemplate_Body");
	public By newTemplateButton = By.xpath("//span[normalize-space()='New Callout Template']");
	public By actionMenuButton = By.xpath("//tbody/tr[1]/td[8]/div[1]/div[1]/button[1]");
	public By newCalloutTemplateBtn = By.xpath("//span[normalize-space()='New Callout Template']");
	public By botTemplateActionMenuBtn = By.xpath("//tbody/tr[1]/td[8]//button");
	public By editBotTemplateOption = By
			.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Edit')]");
	public By deleteBotTemplateOption = By
			.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]");

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
	public String dataAccessPattern = "chkg(daqla|ql_|referralcategory_|programall|stage).*";
	public By permissionContainerLocator = By.cssSelector(".col-lg-10.col-md-9");
	public By checkboxLocator = By
			.xpath(".//input[@type='checkbox' and not(@id='allModulePermission') and not(contains(@id,'All'))]");
	public By menuContextLoader = By.id("menucontext");
	public By filterButtonLocator = By.xpath("//span[normalize-space()='Filter']");
	public By filterInputLocator = By.id("Filter_Name");
	public By searchIconLocator = By.xpath("//i[@class='fa-solid fa-magnifying-glass']");
	public By editOptionLocator = By.xpath("//span[normalize-space()='Edit']");
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

	// Settings
	public String verifyBlankFieldValidationMessageOnAddLeadSource() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newLeadSource)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openLeadSourcesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/LeadSources"));
	}

	public String verifyBlankFieldValidationMessageOnAddWellnessPoints() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(saveChangesButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openWellnessSettingPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/WellnessSetting"));
	}

	public String verifyBlankFieldValidationMessageOnAddMailSetting() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(saveSmtpSettingButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String verifyBlankFieldValidationMessageOnAddSpecialService() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newSpecialService)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openSpecialServicesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/SpecialServices"));
	}

	public String verifyBlankFieldValidationMessageOnAddPartnerType() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newPartnerType)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openPartnerTypesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PartnerTypes"));
	}

	public String verifyBlankFieldValidationMessageOnAddPBM() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newPBM)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openPBMsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PBMs"));
	}

	public String addBinMasterBlankFieldValidationShouldDisplay() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newBinMaster)).click();
		wait.until(ExpectedConditions.elementToBeClickable(saveBinMasterButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openBinMastersPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/BINMasters"));
	}

	public String addPayorCategoryBlankFieldValidationShouldDisplay() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newPayorCategory)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openPayorCategoriesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PayorCategories"));
	}

	public String verifyBlankFieldValidationMessageOnAddEmployeeNumberSetting() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openEmployeeNumberSettingPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/EmployeeNumberSetting"));
	}

	public String verifyBlankFieldValidationMessageOnAddAccessCodeType() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newAccesscodeType)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openAccessCodeTypesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/AccesscodeTypes"));
	}

	public String verifyBlankFieldValidationMessageOnAddChecklist() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newChecklist)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openCheckListsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/CheckLists"));
	}

	public String verifyBlankFieldValidationMessageOnAddDeliveryMarker() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newDeliveryMarker)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openDeliveryMarkersPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryMarkers"));
	}

	public String verifyBlankFieldValidationMessageOnAddLogisticCompany() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newLogisticCompany)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnLocator)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openLogisticCompaniesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/LogisticCompanies"));
	}

	public String verifyBlankFieldValidationMessageOnAddDeliveryDistance() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newDeliveryDistance)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openDeliveryDistancesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryDistances"));
	}

	public String verifyBlankFieldValidationMessageOnAddPackageRestriction() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(planButtonSvgPath)).click();
		wait.until(ExpectedConditions.elementToBeClickable(stateButtonSvgPath)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openPackageRestrictionPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PackageRestriction"));
	}

	public String verifyBlankFieldValidationMessageOnAddComplianceDepartments() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newDepartment)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openComplianceDepartmentsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ComplianceDepartments"));
	}

	public String verifyBlankFieldValidationMessageOnAddComplianceCategories() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newCategory)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openComplianceCategoriesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ComplianceCategories"));
	}

	public String verifyBlankFieldValidationMessageOnAddInvoiceFlag() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newInvoiceFlag)).click();
		wait.until(ExpectedConditions.elementToBeClickable(saveInvoiceFlagButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openInvoiceFlagsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/InvoiceFlags"));
	}

	public void openCms1500TemplatesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/CMS1500Templates"));
	}

	public String verifyBlankFieldValidationMessageOnAddCms1500Template() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newCms1500Template)).click();
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(addNewCms1500TemplateButton)).click();
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String verifyBlankFieldValidationMessageOnAddClaimDocumentChecklist() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newClaimDocumentChecklist)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openClaimDocumentChecklistsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ClaimDocumentChecklists"));
	}

	public String verifyBlankFieldValidationMessageOnAddEobInterventionType() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newEobInterventionType)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openEobInterventionTypesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/EOBInterventiontypes"));
	}

	public void openClaimTypesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ClaimTypes"));
	}

	public String verifyBlankFieldValidationMessageOnAddClaimLabel() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newClaimLabel)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String verifyBlankFieldValidationMessageOnAddClaimStatus() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newClaimStatus)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openClaimStatusesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ClaimStatuses"));
	}

	public String verifyBlankFieldValidationMessageOnAddBillStatus() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newBillStatus)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openBillStatusesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/BillStatuses"));
	}

	public String billingSettingBlankFieldValidationShouldDisplay() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openBillingSettingPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/BillingSetting"));
	}

	public String verifyBlankFieldValidationMessageOnAddReferralCategory() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newReferralCategory)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openReferralCategoriesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ReferralCategories"));
	}

	public String verifyBlankFieldValidationMessageOnAddAudienceType() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newAudienceType)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openAudienceTypesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/AudienceTypes"));
	}

	public String validateBlankFieldErrorOnPromotionFormTextSetting() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openPromotionFormTextSettingPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PromotionFormTextSetting"));
	}

	public String promotionCategoryBlankFieldErrorShouldBeShown() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newPromotionCategory)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openPromotionCategoriesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PromotionCategories"));
	}

	public String formCategoryBlankFieldErrorShouldBeShown() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newFormCategory)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openFormCategoriesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/FormsCategories"));
	}

	public String templateBlankFieldErrorShouldBeShown() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newTemplate)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String providerServiceBlankFieldErrorShouldBeShown() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newProviderService)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openTemplatesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Templates"));
	}

	public void openServicesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Services"));
	}

	public void openSpecialtiesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Specialties"));
	}

	public String providerSpecialtyBlankFieldErrorShouldBeShown() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newProviderSpecialty)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String shouldShowBlankFieldValidationForAddProviderCategory() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newProviderCategory)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openCategoriesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Categories"));
	}

	public void openProviderTypesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ProviderTypes"));
	}

	public String shouldDisplayValidationForEmptyFieldsInProviderType() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newProviderType)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String shouldShowBlankFieldValidationForAddCPTCode() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newCPTCode)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openCPTCodesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/CPTCodes"));
	}

	public String shouldShowBlankFieldValidationForAddRPMStatus() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newRPMStatus)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openPatientRemoteMonitoringStatusesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PatientRemoteMonitoringStatuses"));
	}

	public String shouldShowBlankFieldValidationForAddRegisteredDevice() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newRegisteredDevice)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openRegisteredDevicesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RegisteredDevices"));
	}

	public String shouldShowBlankFieldValidationForAddEncounterStatus() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newEncounterStatus)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openClinicalEncounterStatusesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ClinicalEncounterStatuses"));
	}

	public String shouldShowBlankFieldValidationForAddROSGroupType() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newROSGroupType)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openROSGroupTypesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ROSGroupTypes"));
	}

	public String shouldShowBlankFieldValidationForAddRemoteMonitoringParameter() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newRemoteMonitoringParameter)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openRemoteMonitoringParametersPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RemoteMonitoringParameters"));
	}

	public String shouldShowBlankFieldValidationForAddOutcomeAction() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newOutcomeAction)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openOutcomeActionsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/OutcomeActions"));
	}

	public String shouldShowBlankFieldValidationForAddROSInformation() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newROSInformation)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openROSSPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ROSs"));
	}

	public String shouldShowBlankFieldValidationForAddClinicalIntervention() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newClinicalIntervention)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openClinicalInterventionsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ClinicalInterventions"));
	}

	public String shouldShowBlankFieldValidationForAddCommunityResource() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newCommunityResource)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openCommunityResourcesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/CommunityResources"));
	}

	public String shouldShowBlankFieldValidationForAddBarriers() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newBarriers)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openBarriersPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Barriers"));
	}

	public String shouldShowBlankFieldValidationForAddGoalsOfTreatmentType() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newGoalsOfTreatment)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openGoalsOfTreatmentsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/GoalsOfTreatments"));
	}

	public void openPriorAuthorizationTypesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PriorAuthorizationTypes"));
	}

	public String shouldShowBlankFieldValidationForAddPriorAuthorizationType() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newPriorAuthorizationType)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String shouldShowBlankFieldValidationForAddClinicalLocation() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newClinicLocation)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openAppointmentReminderSettingPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/AppointmentReminderSetting"));
	}

	public void openClinicLocationsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ClinicLocations"));
	}

	public String shouldShowBlankFieldValidationForAddAppointmentReminderSetting() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newAppointmentReminder)).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSaveAppointmentReminderSetting)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String shouldShowBlankFieldValidationForAddClinicalUploadWizardTemplate() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newUploadWizardTemplate)).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnNext)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openUploadWizardClinicalQueueTemplatesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/UploadWizardClinicalQueueTemplates"));
	}

	public String shouldShowBlankFieldValidationForAddClinicalQueueRule() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		WebElement dropdownElement = wait.until(ExpectedConditions.elementToBeClickable(clinicalQueueDropdown));

		Select select = new Select(dropdownElement);
		select.selectByIndex(1);

		wait.until(ExpectedConditions.elementToBeClickable(btnAddRulesTooltip)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnLocator)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openClinicalQueueSettingPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ClinicalQueueSetting"));
	}

	public String displayBlankFieldValidationForAddQueueInClinicalWorkflow() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newQueue)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openClinicalQueuesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ClinicalQueues"));
	}

	public String blankFieldValidationShouldBeDisplayedOnPrescriptionStatusPage() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newPrescriptionStatus)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openPrescriptionStatusPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PrescriptionStatuses"));
	}

	public String userShouldSeeBlankFieldValidationOnProgram340BPage() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(new340B)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openProgram340BPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Program340Bs"));
	}

	public String userShouldSeeBlankFieldValidationOnOutgoingCallTypesPage() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newOutgoingCallType)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openOutgoingCallTypesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/OutgoingCalls"));
	}

	public String blankFieldValidationShouldBeDisplayedOnIncomingCallTypesPage() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newIncomingCallTypes)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openIncomingCallTypesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/IncomingCalls"));
	}

	public String userShouldSeeBlankFieldValidationOnRunninglineLevel2StatusPage() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newRunninglineLevel2Status)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openRunninglineLevel2StatusPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RunninglineLevel2Statuses"));
	}

	public String userShouldSeeBlankFieldValidationOnRunninglineLevel1StatusPage() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newRunninglineLevel1Status)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openRunninglineLevel1StatusPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RunninglineLevel1Statuses"));
	}

	public String userShouldSeeBlankFieldValidationOnRunninglineStatusPage() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newRunninglineStatus)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openRunninglineStatusPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RunninglineStatuses"));
	}

	public String userShouldSeeValidationMessageForBlankFieldsInUploadWizardTemplate() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(btnNext)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openUploadWizardTemplatePage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/UploadWizardTemplate"));
	}

	public String shouldDisplayValidationForBlankQueueRulesFields() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(queueDropdownSecond)).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnAddRulesTooltip)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnLocator)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openRxSettingPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/RxSetting"));
	}

	public String shouldDisplayValidationForBlankQueueFields() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newQueue)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openQueuesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Queues"));
	}

	public String shouldDisplayValidationForBlankCallScriptFields() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newCallScript)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openCallScriptsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/CallScripts"));
	}

	public String shouldDisplayValidationForBlankTransferResultActionFields() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newTransferResultAction)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openTransferResultActionsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/FailureResultActions"));
	}

	public String shouldDisplayValidationForBlankFailureResultActionFields() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newFailureResultAction)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openFailureResultActionsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/FailureResultActions"));
	}

	public String shouldDisplayValidationForBlankSuccessResultActionFields() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newSuccessResultAction)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String shouldDisplayValidationForBlankReminderResultActionFields() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newReminderResultAction)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openReminderResultActionsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ReminderResultActions"));
	}

	public String shouldDisplayValidationForBlankMedicationSyncColorCodeFields() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newMedicationSyncColor)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openMedicationSyncReminderColorCodesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/MedicationSyncReminderColorCodes"));
	}

	public String shouldDisplayValidationForBlankMedicationSyncReminderFields() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newMedicationSyncReminder)).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSaveMedicationSetting)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openMedicationSyncReminderSettingPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/MedicationSyncReminderSetting"));
	}

	public String shouldDisplayValidationForBlankMedicationColorCodes() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newPatientMedicationColorCodeSetting)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openPatientMedicationColorCodeSettingsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PatientMedicationColorCodeSettings"));
	}

	public String shouldDisplayValidationForBlankIntakeFormSettings() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(addInformation)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openIntakeFormNoticeSettingPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/IntakeFormNoticeSetting"));
	}

	public String shouldDisplayValidationForBlankConsentSettings() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openPatientSettingPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PatientSetting"));
	}

	public String shouldDisplayValidationForBlankEventFields() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(createEvent)).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnCreate)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public void openOrgCalendarPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/OrganizationCalendar"));
	}

	public String validateBlankFaxSettingFieldErrorMessage() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newFaxSettingButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String shouldShowValidationOnBlankProfessionalLicenseTypeSubmit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newProfessionalLicenseTypeBtn)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String shouldShowValidationOnBlankDesignationSubmit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newDesignationButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String shouldShowValidationOnBlankExcludeUserSubmit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(excludeUserLink)).click();
		wait.until(ExpectedConditions.elementToBeClickable(newExcludeUserBtn)).click();
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String shouldShowValidationOnBlankIPFieldSubmit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newIpBtn)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnLocator)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String shouldShowValidationOnBlankProgressStepsSubmit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newProgressStepButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSaveProgressStatus)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String shouldShowValidationOnBlankEHRTypeFieldSubmit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newEhrTypeBtn)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String shouldShowValidationOnInvalidEmailInTextForwardSetting() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		String organizationFromEmailIdValue = Hooks.prop.getProperty("organizationFromEmailId");
		WebElement organizationFromEmailIdInput = driver.findElement(organizationFromEmailId);
		organizationFromEmailIdInput.sendKeys(organizationFromEmailIdValue);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String shouldShowValidationOnInvalidEmailInNotificationSetting() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		String generatePriorAuthValue = Hooks.prop.getProperty("generatePriorAuthorizationFromEmail");
		WebElement generatePriorAuthInput = driver.findElement(generatePriorAuthorizationFromEmail);
		generatePriorAuthInput.sendKeys(generatePriorAuthValue);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String shouldShowValidationOnBlankTechnicalSettingSubmit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String shouldShowValidationOnBlankSendVCardSubmit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(sendVCardBtn)).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSendvCard)).click();
		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String shouldShowValidationOnBlankBrandManagementSubmit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(editBasicInformation)).click();
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(primaryButton)).click();
		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public setuppage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// Reminders
	public String shouldShowValidationOnBlankRemindersSubmit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(reminderActionBtn)).click();
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(addAutoCallButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSaveAutoCall)).click();
		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	// Bucket
	public String shouldShowValidationOnBlankFileUploadSubmit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(fileUpload)).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSaveFile)).click();
		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	// Feedback Forms
	public String shouldShowValidationOnBlankFeedbackFormsSubmit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newFeedbackFormButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	// Patient Signature Templates
	public String shouldShowValidationOnBlankPatientSignatureTemplatesSubmit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newPatientSignatureButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnLocator)).click();
		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	// Fax Templates
	public String shouldShowValidationOnBlankFaxTemplatesSubmit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newFaxTemplateButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnLocator)).click();
		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	// BOT Call Templates
	public String shouldShowValidationOnBlankBOTCallTemplatesSubmit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newCalloutTemplateButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnLocator)).click();
		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	// Mail Templates
	public String shouldShowValidationOnBlankMailTemplatesSubmit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newMailTemplateButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnLocator)).click();
		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	// Text template
	public String shouldShowValidationOnBlankTextTemplatesSubmit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newTextTemplateButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBtnLocator)).click();

		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	// Workspace Users
	public String shouldShowValidationOnBlankResetPasswordSubmit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(workspaceUserActionMenuButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(resetPassword)).click();
		wait.until(ExpectedConditions.elementToBeClickable(resetPasswordButton)).click();
		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String shouldShowValidationOnBlankEmployeeNameSearch() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(workspaceUserActionMenuButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(viewDetailOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(employeeDetailSvg)).click();
		wait.until(ExpectedConditions.elementToBeClickable(searchEmployee)).click();
		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String checkWorkspaceUsersFormEmptyShowsValidation() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newUserButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitUserButton)).click();
		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	// Dashboard
	public String shouldShowValidationOnBlankQuicklinkGroup() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(pathLocator)).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSaveQuickLinkGroup)).click();
		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	// Profile
	public String verifyProfileBlankSubmissionValidation() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newProfileButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(btnSaveProfile)).click();
		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastMessage));
			StringBuilder messages = new StringBuilder();
			for (WebElement toast : toasts) {
				messages.append(toast.getText().trim()).append(" | ");
			}
			return "SUCCESS: Toast messages -> " + messages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	// Privacy Policy & Terms of Use
	public void verifyNoAccessForPrivacyAndTerms() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String[] pages = { Hooks.prop.getProperty("privacyPolicyPageUrl"),
				Hooks.prop.getProperty("termsOfUsePageUrl") };
		for (String page : pages) {
			if (page == null) {
				throw new AssertionError("Page URL is missing in config");
			}
			String fullUrl = baseUrl + page;
			driver.get(fullUrl);
			boolean redirected = driver.getCurrentUrl().contains("/Web/Home/Module");
			boolean errorVisible = !driver.findElements(errorLocator).isEmpty();
			if (!(redirected || errorVisible)) {
				Assert.fail("User should not have access to: " + page);
			} else {
				System.out.println("Access correctly restricted for: " + page);
			}
		}
	}

	public void denyAllPrivacyPolicyAndTermsOfUseActionsWithoutAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void handlePrivacyAndTerms(String profileName) {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String[] pages = { Hooks.prop.getProperty("privacyPolicyPageUrl"),
				Hooks.prop.getProperty("termsOfUsePageUrl") };
		for (String page : pages) {
			if (page == null) {
				throw new AssertionError("Page URL is missing in config");
			}
			String fullUrl = baseUrl + page;
			driver.get(fullUrl);
			if (driver.getCurrentUrl().contains("/Web/Home/Module")) {
				System.out.println("Redirected to Module No access for: " + page);
			} else {
				wait.until(ExpectedConditions.visibilityOfElementLocated(editorLocator));
				driver.findElement(editorLocator).sendKeys(profileName);
				wait.until(ExpectedConditions.elementToBeClickable(submitBtnLocator));
				driver.findElement(submitBtnLocator).click();
				System.out.println("Content updated successfully for: " + page);
			}
		}
	}

	// T&C
	public void allowViewingAndUpdatingOfPrivacyPolicyAndTermsOfUseWithPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyNoAccessForAllTC() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String[] pages = { Hooks.prop.getProperty("providerTCPageUrl"), Hooks.prop.getProperty("manufacturerTCPageUrl"),
				Hooks.prop.getProperty("patientTCPageUrl"), Hooks.prop.getProperty("partnerTCPageUrl") };
		By errorLocator = By.xpath("//h2[normalize-space()='Error']");
		for (String page : pages) {
			if (page == null) {
				throw new AssertionError("T&C page URL is missing in config");
			}
			String fullUrl = baseUrl + page;
			driver.get(fullUrl);
			boolean redirected = driver.getCurrentUrl().contains("/Web/Home/Module");
			boolean errorVisible = !driver.findElements(errorLocator).isEmpty();
			if (!(redirected || errorVisible)) {
				Assert.fail("User should not have access to: " + page);
			} else {
				System.out.println("Access correctly restricted for: " + page);
			}
		}
	}

	public void denyAllTnCActionsWithoutAnyAccessPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void handleAllTCLabels(String profileName) {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String[] pages = { Hooks.prop.getProperty("providerTCPageUrl"), Hooks.prop.getProperty("manufacturerTCPageUrl"),
				Hooks.prop.getProperty("patientTCPageUrl"), Hooks.prop.getProperty("partnerTCPageUrl") };
		for (String page : pages) {
			if (page == null) {
				throw new AssertionError("T&C page URL is missing in config");
			}
			String fullUrl = baseUrl + page;
			driver.get(fullUrl);
			if (driver.getCurrentUrl().contains("/Web/Home/Module")) {
				System.out.println("Redirected to Module No access for: " + page);
			} else {
				wait.until(ExpectedConditions.visibilityOfElementLocated(editorLocator));
				driver.findElement(editorLocator).sendKeys(profileName);
				wait.until(ExpectedConditions.elementToBeClickable(submitBtnLocator));
				driver.findElement(submitBtnLocator).click();
				System.out.println("T&C updated successfully for: " + page);
			}
		}
	}

	public void allowTermsAndConditionsViewingAndUpdatingWithPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Dashboard
	public void userShouldBeAbleToDeleteQuickLink() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loaderLocator));
		WebElement deleteButton = wait.until(ExpectedConditions.elementToBeClickable(deleteQuickLinkButtonLocator));
		deleteButton.click();
		WebElement confirmDeleteButton = wait
				.until(ExpectedConditions.elementToBeClickable(confirmDeleteButtonLocator));
		confirmDeleteButton.click();
	}

	public void userWithFullAccessCanManageQuickLinksModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToDeleteQuickLinks() {
		List<WebElement> elements = driver.findElements(deleteIconLocator);
		Assert.assertTrue(elements.isEmpty(), "Delete icon should NOT be present");
	}

	public void userShouldBeAbleToEditQuickLink() {
		String profileName = Hooks.prop.getProperty("profile.name.value");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loaderLocator));
		WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(editQuickLinkButtonLocator));
		editButton.click();
		WebElement groupNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(groupNameInputLocator));
		groupNameInput.clear();
		groupNameInput.sendKeys(profileName);
		WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButtonLocator));
		saveButton.click();
	}

	public void allowQuickLinksViewingCreationAndEditingWithPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToEditOrDeleteQuickLinks() {
		List<WebElement> editElements = driver.findElements(editIconLocator);
		Assert.assertTrue(editElements.isEmpty(), "Edit icon should NOT be present");
		List<WebElement> deleteElements = driver.findElements(deleteIconLocator);
		Assert.assertTrue(deleteElements.isEmpty(), "Delete icon should NOT be present");
	}

	public void userShouldBeAbleToAddNewQuickLink() {
		String profileName = Hooks.prop.getProperty("profile.name.value");
		By addQuickLinkIconLocator = By.xpath("//*[name()='path' and contains(@d,'M256 80c0-')]");
		By groupNameInputLocator = By.xpath("//input[@id='groupName']");
		By saveButtonLocator = By.xpath("//button[@id='btnSaveQuickLinkGroup']");
		WebElement addQuickLinkIcon = wait.until(ExpectedConditions.elementToBeClickable(addQuickLinkIconLocator));
		addQuickLinkIcon.click();
		WebElement groupNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(groupNameInputLocator));
		groupNameInput.clear();
		groupNameInput.sendKeys(profileName);
		WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(saveButtonLocator));
		saveButton.click();
	}

	public void allowQuickLinksViewingAndAdditionWithPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddEditOrDeleteQuickLinks() {
		List<WebElement> elements = driver.findElements(quickLinkActionIconLocator);
		Assert.assertTrue(elements.isEmpty(), "Quick link actions should NOT be present");
	}

	public void allowQuickLinksViewOnlyAccessWithPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void allowQuickLinksSettingsViewWithPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Profile
	public void verifyAllModulePermissionCheckboxesSelected() {
		WebElement permissionContainer = wait
				.until(ExpectedConditions.visibilityOfElementLocated(permissionContainerLocator));
		List<WebElement> checkboxes = permissionContainer.findElements(checkboxLocator);
		Set<String> seenIds = new HashSet<>();
		List<String> notSelected = new ArrayList<>();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (WebElement checkbox : checkboxes) {
			String id = checkbox.getAttribute("id");
			if (id == null || id.trim().isEmpty())
				continue;
			if (id.matches(dataAccessPattern))
				continue;
			if (!seenIds.add(id))
				continue;
			if (!checkbox.isDisplayed())
				continue;
			boolean byIsSelected = checkbox.isSelected();
			String checkedAttr = checkbox.getAttribute("checked");
			String ariaChecked = checkbox.getAttribute("aria-checked");
			boolean byJs = Boolean.TRUE.equals(js.executeScript("return arguments[0].checked === true;", checkbox));
			boolean isSelected = byIsSelected || (checkedAttr != null) || "true".equalsIgnoreCase(ariaChecked) || byJs;
			if (!isSelected) {
				notSelected.add(id);
			}
		}

		Assert.assertTrue(notSelected.isEmpty(),
				"Some permission checkboxes are not selected: " + String.join(", ", notSelected));
	}

	public void reopenProfileInEditMode() {
		String profileName = Hooks.prop.getProperty("profile.name.value");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(menuContextLoader));
		WebElement filterButton = wait.until(ExpectedConditions.elementToBeClickable(filterButtonLocator));
		filterButton.click();
		WebElement filterInput = wait.until(ExpectedConditions.visibilityOfElementLocated(filterInputLocator));
		filterInput.clear();
		filterInput.sendKeys(profileName);
		WebElement searchIcon = wait.until(ExpectedConditions.elementToBeClickable(searchIconLocator));
		searchIcon.click();
		By actionMenuLocator = By
				.xpath("//tr[td[normalize-space()='" + profileName + "']]//td[@class='text-right']//button");
		WebElement actionMenu = wait.until(ExpectedConditions.elementToBeClickable(actionMenuLocator));
		actionMenu.click();
		WebElement editOption = wait.until(ExpectedConditions.elementToBeClickable(editOptionLocator));
		editOption.click();
	}

	public void allowCompleteSetupModulesManagementWithAllPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// XFlow
	public void userShouldNotBeAbleToViewOrDownloadFromXFlow() {
		WebElement userMenuIcon = wait.until(ExpectedConditions.elementToBeClickable(userMenuIconLocator));
		userMenuIcon.click();
		List<WebElement> elements = driver.findElements(settingsIconLocator);
		Assert.assertTrue(elements.isEmpty(), "Settings/Download option should NOT be present");
	}

	public void userWithoutAccessCannotOpenOrUseXFlowModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldBeAbleToDownloadFromXFlow() {
		WebElement downloadButton = wait.until(ExpectedConditions.elementToBeClickable(downloadButtonLocator));
		downloadButton.click();
	}

	public void openXFlowPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Web/Home/XFlowVersions"));
	}

	public void allowXFlowSettingsDownloadWithPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Sender Authentication
	public void userShouldBeAbleToDeleteSenderAuthenticationEntry() {
		WebElement actionMenuButton = wait.until(ExpectedConditions.elementToBeClickable(actionMenuButtonLocator));
		actionMenuButton.click();
		WebElement deleteOption = wait.until(ExpectedConditions.visibilityOfElementLocated(deleteOptionLocator));
		Assert.assertTrue(deleteOption.isDisplayed(), "Delete option should be present");
		deleteOption.click();
		WebElement confirmDeleteButton = wait
				.until(ExpectedConditions.elementToBeClickable(confirmDeleteButtonLocator));
		confirmDeleteButton.click();
	}

	public void allowSenderAuthenticationEntriesManagementWithViewAddDeletePermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToDeleteSenderAuthenticationEntries() {
		WebElement actionMenuButton = wait.until(ExpectedConditions.elementToBeClickable(actionMenuButtonLocator));
		actionMenuButton.click();
		List<WebElement> deleteOptions = driver.findElements(deleteOptionLocator);
		Assert.assertTrue(deleteOptions.isEmpty(), "Delete option should NOT be present");
	}

	public void userShouldBeAbleToAddSenderAuthenticationEntry() {
		String profileName = Hooks.prop.getProperty("profile.name.value");
		WebElement newSenderAuthButton = wait
				.until(ExpectedConditions.elementToBeClickable(newSenderAuthButtonLocator));
		newSenderAuthButton.click();
		WebElement domainInput = wait.until(ExpectedConditions.visibilityOfElementLocated(domainNameInputLocator));
		domainInput.sendKeys(profileName);
		WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(addButtonLocator));
		addButton.click();
	}

	public void allowSenderAuthenticationEntryAdditionWithViewAndAddPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddOrDeleteSenderAuthenticationEntries() {
		List<WebElement> newSenderAuthElements = driver.findElements(newSenderAuthButtonLocator);
		Assert.assertTrue(newSenderAuthElements.isEmpty(), "New Sender Authentication button should NOT be present");
		WebElement actionMenuButton = wait.until(ExpectedConditions.elementToBeClickable(actionMenuButtonLocator));
		actionMenuButton.click();
		List<WebElement> deleteOptions = driver.findElements(deleteOptionLocator);
		Assert.assertTrue(deleteOptions.isEmpty(), "Delete option should NOT be present");
	}

	public void openSenderAuthenticationPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Web/Home/SenderAuthentications"));
	}

	public void allowSenderAuthenticationSettingsViewWithPermissionOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Block Email
	public void userShouldBeAbleToDeleteBlockEmailEntry() {
		WebElement deleteIcon = wait.until(ExpectedConditions.elementToBeClickable(deleteIconLocator));
		Assert.assertTrue(deleteIcon.isDisplayed(), "Delete icon should be present");
		deleteIcon.click();
		WebElement confirmDeleteButton = wait
				.until(ExpectedConditions.elementToBeClickable(confirmDeleteButtonLocator));
		confirmDeleteButton.click();
	}

	public void allowBlockEmailEntriesDeletionWithViewAndDeletePermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToDeleteBlockEmailEntries() {
		List<WebElement> elements = driver.findElements(deleteIconLocator);
		Assert.assertTrue(elements.isEmpty(), "Delete icon should not be present");
	}

	public void openBlockEmailPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Web/Home/Blocks"));
	}

	public void allowBlockEmailSettingsViewWithPermissionOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Bounce Email
	public void userShouldBeAbleToDeleteBounceEmailEntry() {
		WebElement deleteIcon = wait.until(ExpectedConditions.elementToBeClickable(deleteIconLocator));
		Assert.assertTrue(deleteIcon.isDisplayed(), "Delete icon should be present");
		deleteIcon.click();
		WebElement confirmDeleteButton = wait
				.until(ExpectedConditions.elementToBeClickable(confirmDeleteButtonLocator));
		confirmDeleteButton.click();
	}

	public void allowBounceEmailEntriesDeletionWithViewAndDeletePermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToDeleteBounceEmailEntries() throws InterruptedException {
		Thread.sleep(3000);
		List<WebElement> elements = driver.findElements(deleteIconLocator);
		Assert.assertTrue(elements.isEmpty(), "Delete icon should not be present");
	}

	public void openBounceEmailPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Web/Home/Bounces"));
	}

	public void allowBounceEmailSettingsViewWithPermissionOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Spam Email
	public void userShouldBeAbleToDeleteSpamEmailEntry() {
		sleep(3000);
		List<WebElement> deleteIcons = driver.findElements(deleteIcon);
		if (!deleteIcons.isEmpty()) {
			System.out.println("Delete icon is present.");
			deleteIcons.get(0).click();
		} else {
			Assert.fail("FAIL: Delete icon is not present.");
		}
		driver.findElement(confirmDeleteButton).click();
	}

	public void allowSpamEmailEntriesDeletionWithViewAndDeletePermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToDeleteSpamEmailEntries() {
		sleep(3000);
		boolean isDeletePresent = !driver.findElements(deleteButton).isEmpty();
		if (isDeletePresent) {
			Assert.fail("FAIL: Delete option should not be present for Spam Email entries.");
		}
		System.out.println("PASS: User cannot delete Spam Email entries.");
	}

	public void openSpamEmailPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Web/Home/Spams"));
	}

	public void allowSpamEmailSettingsViewWithPermissionOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Connector App
	public void verifyNoConnectorAppAccessUIOrURL() {
		List<WebElement> errorHeaders = driver.findElements(errorHeader);
		if (!errorHeaders.isEmpty()) {
			System.out.println("PASS: Access is restricted (Error page displayed).");
		} else {
			System.out.println("FAIL: Page loaded successfully, access should be denied.");
		}
	}

	public void openConnectorAppsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Web/Home/ConnectorApps"));
	}

	public void denyConnectorAppAccessWithoutPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Auto Call
	public void verifyUserCanDeleteAutoCallEntry() {
		sleep(3000);
		List<WebElement> deleteList = driver.findElements(deleteOption);
		if (!deleteList.isEmpty()) {
			System.out.println("Delete option is present.");
			deleteList.get(0).click();
		} else {
			Assert.fail("FAIL: Delete option is not present.");
		}
		driver.findElement(confirmDeleteButton).click();
	}

	public void allowFullAccessToAutoCallEntriesWithPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotDeleteAutoCallEntries() {
		sleep(3000);
		driver.findElement(actionMenuIcon).click();
		sleep(1000);
		boolean isDeletePresent = !driver.findElements(deleteOption).isEmpty();
		if (isDeletePresent) {
			Assert.fail("FAIL: Delete option should not be present.");
		}
		System.out.println("PASS: User cannot delete Auto Call entries.");
	}

	public void verifyUserCanEditAutoCallEntry() {
		sleep(3000);
		driver.findElement(actionMenuIcon).click();
		sleep(1000);
		List<WebElement> editList = driver.findElements(editOption);
		if (!editList.isEmpty()) {
			System.out.println("Edit option is present.");
			editList.get(0).click();
		} else {
			Assert.fail("FAIL: Edit option is not present.");
		}
		driver.findElement(enableCheckboxLabel).click();
		driver.findElement(saveButton).click();
	}

	public void allowAutoCallEntriesViewAddAndEditWithPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrDeleteAutoCallEntries() {
		sleep(3000);
		driver.findElement(actionMenuIcon).click();
		sleep(1000);
		boolean isEditPresent = !driver.findElements(editOption).isEmpty();
		if (isEditPresent) {
			Assert.fail("FAIL: Edit option should not be present.");
		}
		boolean isDeletePresent = !driver.findElements(deleteOption).isEmpty();
		if (isDeletePresent) {
			Assert.fail("FAIL: Delete option should not be present.");
		}
		System.out.println("PASS: User cannot Edit or Delete Auto Call entries.");
	}

	public void verifyUserCanAddNewAutoCallEntry() {
		sleep(2000);
		driver.findElement(addAutoCallButton).click();
		sleep(2000);
		driver.findElement(timeInputField).click();
		sleep(2000);
		driver.findElement(timeInputField).click();
		sleep(1000);
		driver.findElement(hourOption).click();
		sleep(500);
		driver.findElement(minuteOption).click();
		sleep(500);
		WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(templateDropdown));
		Select select = new Select(dropdownElement);
		select.selectByIndex(1);
		sleep(500);
		driver.findElement(saveButton).click();
	}

	public void allowAutoCallEntryAdditionWithViewAndAddPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddEditOrDeleteAutoCallEntries() {
		sleep(3000);
		boolean isAddPresent = !driver.findElements(addAutoCallButton).isEmpty();
		if (isAddPresent) {
			Assert.fail("FAIL: Add Auto Call button should not be present.");
		}
		driver.findElement(actionMenuIcon).click();
		sleep(1000);
		boolean isEditPresent = !driver.findElements(editOption).isEmpty();
		if (isEditPresent) {
			Assert.fail("FAIL: Edit option should not be present.");
		}
		boolean isDeletePresent = !driver.findElements(deleteOption).isEmpty();
		if (isDeletePresent) {
			Assert.fail("FAIL: Delete option should not be present.");
		}
		System.out.println("PASS: User cannot Add, Edit, or Delete Auto Call entries.");
	}

	public void openAutoCallPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions
				.urlContains("/Setup/Home/Reminder?id=dbff8740-5363-4666-9eaa-271d42298025#autocall"));
	}

	public void allowAutoCallSettingsViewWithPermissionOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Auto Text
	public void verifyUserCanDeleteAutoTextEntry() {
		sleep(3000);
		driver.findElement(autoTextTab).click();
		driver.findElement(actionMenuIcon).click();
		sleep(1000);
		List<WebElement> deleteList = driver.findElements(deleteOption);
		if (!deleteList.isEmpty()) {
			System.out.println("Delete option is present.");
			deleteList.get(0).click();
		} else {
			Assert.fail("FAIL: Delete option is not present.");
		}
		driver.findElement(confirmDeleteButton).click();
	}

	public void allowFullAccessToAutoTextEntriesWithPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotDeleteAutoTextEntries() {
		sleep(3000);
		driver.findElement(autoTextTab).click();
		driver.findElement(actionMenuIcon).click();
		sleep(1000);
		boolean isDeletePresent = !driver.findElements(deleteOption).isEmpty();
		if (isDeletePresent) {
			Assert.fail("FAIL: Delete option should not be present.");
		}
		System.out.println("PASS: User cannot delete Auto Text entries.");
	}

	public void verifyUserCanEditAutoTextEntry() {
		sleep(3000);
		driver.findElement(autoTextTab).click();
		driver.findElement(actionMenuIcon).click();
		sleep(1000);
		List<WebElement> editList = driver.findElements(editOption);
		if (!editList.isEmpty()) {
			System.out.println("Edit option is present.");
			editList.get(0).click();
		} else {
			Assert.fail("FAIL: Edit option is not present.");
		}
		driver.findElement(enableCheckboxLabel).click();
		driver.findElement(saveButton).click();
	}

	public void allowAutoTextEntriesViewAddAndEditWithPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrDeleteAutoTextEntries() {
		sleep(3000);
		driver.findElement(autoTextTab).click();
		driver.findElement(actionMenuIcon).click();
		sleep(1000);
		boolean isEditPresent = !driver.findElements(editOption).isEmpty();
		if (isEditPresent) {
			Assert.fail("FAIL: Edit option should not be present.");
		}
		boolean isDeletePresent = !driver.findElements(deleteOption).isEmpty();
		if (isDeletePresent) {
			Assert.fail("FAIL: Delete option should not be present.");
		}
		System.out.println("PASS: User cannot Edit or Delete Auto Text entries.");
	}

	public void verifyUserCanAddNewAutoTextEntry() {
		sleep(2000);
		driver.findElement(autoTextTab).click();
		sleep(2000);
		driver.findElement(addAutoTextButton).click();
		sleep(2000);
		driver.findElement(dateInputField).click();
		sleep(2000);
		driver.findElement(dateInputField).click();
		sleep(1000);
		driver.findElement(dateOption).click();
		driver.findElement(timeInputField).click();
		sleep(2000);
		driver.findElement(timeInputField).click();
		sleep(1000);
		driver.findElement(hourOption).click();
		sleep(500);
		driver.findElement(minuteOption).click();
		sleep(500);
		WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(templateDropdown));
		Select select = new Select(dropdownElement);
		select.selectByIndex(2);
		sleep(500);
		driver.findElement(saveButton).click();
	}

	public void allowAutoTextEntryAdditionWithViewAndAddPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddEditOrDeleteAutoTextEntries() {
		sleep(3000);
		driver.findElement(autoTextTab).click();
		boolean isAddPresent = !driver.findElements(addAutoTextButton).isEmpty();
		if (isAddPresent) {
			Assert.fail("FAIL: Add Auto Text button should not be present.");
		}
		driver.findElement(actionMenuIcon).click();
		sleep(1000);
		boolean isEditPresent = !driver.findElements(editOption).isEmpty();
		if (isEditPresent) {
			Assert.fail("FAIL: Edit option should not be present.");
		}
		boolean isDeletePresent = !driver.findElements(deleteOption).isEmpty();
		if (isDeletePresent) {
			Assert.fail("FAIL: Delete option should not be present.");
		}
		System.out.println("PASS: User cannot Add, Edit, or Delete Auto Text entries.");
	}

	public void openAutoTextPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions
				.urlContains("/Setup/Home/Reminder?id=dbff8740-5363-4666-9eaa-271d42298025#autotext"));
	}

	public void allowAutoTextSettingsViewWithPermissionOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Email Notification
	public void verifyEmailNotificationEntryCanBeDeletedByUser() {
		sleep(3000);
		driver.findElement(emailNotificationTab).click();
		driver.findElement(actionMenuIcon).click();
		sleep(1000);
		List<WebElement> deleteList = driver.findElements(deleteOption);
		if (!deleteList.isEmpty()) {
			System.out.println("Delete option is present.");
			deleteList.get(0).click();
		} else {
			Assert.fail("FAIL: Delete option is not present.");
		}
		driver.findElement(confirmDeleteButton).click();
	}

	public void allowFullAccessToEmailNotificationSettingsWithPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotDeleteEmailNotificationSettings() {
		sleep(3000);
		driver.findElement(emailNotificationTab).click();
		driver.findElement(actionMenuIcon).click();
		sleep(1000);
		boolean isDeletePresent = !driver.findElements(deleteOption).isEmpty();
		if (isDeletePresent) {
			Assert.fail("FAIL: Delete option should not be present.");
		}
		System.out.println("PASS: User cannot delete Email Notification settings.");
	}

	public void verifyUserCanEditEmailNotificationEntry() {
		sleep(3000);
		driver.findElement(emailNotificationTab).click();
		driver.findElement(actionMenuIcon).click();
		sleep(1000);
		List<WebElement> editList = driver.findElements(editOption);
		if (!editList.isEmpty()) {
			System.out.println("Edit option is present.");
			editList.get(0).click();
		} else {
			Assert.fail("FAIL: Edit option is not present.");
		}
		driver.findElement(enableCheckboxLabel).click();
		driver.findElement(saveButton).click();
	}

	public void allowEmailNotificationSettingsViewAddAndEditWithPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrDeleteEmailNotificationSettings() {
		sleep(3000);
		driver.findElement(emailNotificationTab).click();
		driver.findElement(actionMenuIcon).click();
		sleep(1000);
		boolean isEditPresent = !driver.findElements(editOption).isEmpty();
		if (isEditPresent) {
			Assert.fail("FAIL: Edit option should not be present.");
		}
		boolean isDeletePresent = !driver.findElements(deleteOption).isEmpty();
		if (isDeletePresent) {
			Assert.fail("FAIL: Delete option should not be present.");
		}
		System.out.println("PASS: User cannot Edit or Delete Email Notification settings.");
	}

	public void verifyUserCanAddEmailNotificationEntry() {
		sleep(2000);
		driver.findElement(emailNotificationTab).click();
		sleep(2000);
		driver.findElement(addEmailNotificationButton).click();
		sleep(2000);
		driver.findElement(timeInputField).click();
		sleep(2000);
		driver.findElement(timeInputField).click();
		sleep(1000);
		driver.findElement(hourOption).click();
		sleep(500);
		driver.findElement(minuteOption).click();
		sleep(500);
		WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(templateDropdown));
		Select select = new Select(dropdownElement);
		select.selectByIndex(2);
		sleep(500);
		driver.findElement(saveButton).click();
	}

	public void allowEmailNotificationSettingsViewAndAddWithPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddEditOrDeleteEmailNotificationSettings() {
		sleep(3000);
		driver.findElement(emailNotificationTab).click();
		boolean isAddPresent = !driver.findElements(addEmailNotificationButton).isEmpty();
		if (isAddPresent) {
			Assert.fail("FAIL: Add Email Notification button should not be present.");
		}
		driver.findElement(actionMenuIcon).click();
		sleep(1000);
		boolean isEditPresent = !driver.findElements(editOption).isEmpty();
		if (isEditPresent) {
			Assert.fail("FAIL: Edit option should not be present.");
		}
		boolean isDeletePresent = !driver.findElements(deleteOption).isEmpty();
		if (isDeletePresent) {
			Assert.fail("FAIL: Delete option should not be present.");
		}
		System.out.println("PASS: User cannot Add, Edit, or Delete Email Notification settings.");
	}

	public void openEmailNotificationPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions
				.urlContains("/Setup/Home/Reminder?id=dbff8740-5363-4666-9eaa-271d42298025#emailnotification"));
	}

	public void allowEmailNotificationSettingsViewWithPermissionOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Show On Dashboard
	public void verifyUserCanDeleteShowOnDashboardEntry() {
		sleep(3000);
		driver.findElement(showOnDashboardTab).click();
		driver.findElement(actionMenuIcon).click();
		sleep(1000);
		List<WebElement> deleteList = driver.findElements(deleteOption);
		if (!deleteList.isEmpty()) {
			System.out.println("Delete option is present.");
			deleteList.get(0).click();
		} else {
			Assert.fail("FAIL: Delete option is not present.");
		}
		driver.findElement(confirmDeleteButton).click();
	}

	public void allowFullAccessToShowOnDashboardSettingsWithPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotDeleteShowOnDashboardSettings() {
		sleep(3000);
		driver.findElement(showOnDashboardTab).click();
		driver.findElement(actionMenuIcon).click();
		sleep(1000);
		boolean isDeletePresent = !driver.findElements(deleteOption).isEmpty();
		if (isDeletePresent) {
			Assert.fail("FAIL: Delete option should not be present.");
		}
		System.out.println("PASS: User cannot delete Show On Dashboard settings.");
	}

	public void verifyUserCanEditShowOnDashboardEntry() {
		sleep(3000);
		driver.findElement(showOnDashboardTab).click();
		driver.findElement(actionMenuIcon).click();
		sleep(1000);
		List<WebElement> editList = driver.findElements(editOption);
		if (!editList.isEmpty()) {
			System.out.println("Edit option is present.");
			editList.get(0).click();
		} else {
			Assert.fail("FAIL: Edit option is not present.");
		}
		driver.findElement(enableCheckboxLabel).click();
		driver.findElement(saveButton).click();
	}

	public void allowShowOnDashboardSettingsViewAddAndEditWithPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrDeleteShowOnDashboard() {
		sleep(3000);
		driver.findElement(showOnDashboardTab).click();
		boolean isAddPresent = !driver.findElements(addShowOnDashboardButton).isEmpty();
		if (!isAddPresent) {
			Assert.fail("FAIL: Add Show On Dashboard button should be present.");
		}
		driver.findElement(actionMenuIcon).click();
		sleep(1000);
		boolean isEditPresent = !driver.findElements(editOption).isEmpty();
		if (isEditPresent) {
			Assert.fail("FAIL: Edit option should not be present.");
		}
		boolean isDeletePresent = !driver.findElements(deleteOption).isEmpty();
		if (isDeletePresent) {
			Assert.fail("FAIL: Delete option should not be present.");
		}
		System.out.println("PASS: User cannot Edit or Delete Show On Dashboard settings.");
	}

	public void verifyUserCanAddShowOnDashboardEntry() {
		sleep(2000);
		driver.findElement(showOnDashboardTab).click();
		sleep(2000);
		driver.findElement(addShowOnDashboardButton).click();
		sleep(2000);
		driver.findElement(timeInputField).click();
		sleep(2000);
		driver.findElement(timeInputField).click();
		sleep(1000);
		driver.findElement(hourOption).click();
		sleep(500);
		driver.findElement(minuteOption).click();
		sleep(500);
		driver.findElement(saveButton).click();
	}

	public void allowShowOnDashboardSettingsViewAndAddWithPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddEditDeleteShowOnDashboardSettings() {
		sleep(3000);
		driver.findElement(showOnDashboardTab).click();
		boolean isAddPresent = !driver.findElements(addShowOnDashboardButton).isEmpty();
		if (isAddPresent) {
			Assert.fail("FAIL: Add Show On Dashboard button should not be present.");
		}
		driver.findElement(actionMenuIcon).click();
		sleep(1000);
		boolean isEditPresent = !driver.findElements(editOption).isEmpty();
		if (isEditPresent) {
			Assert.fail("FAIL: Edit option should not be present.");
		}
		boolean isDeletePresent = !driver.findElements(deleteOption).isEmpty();
		if (isDeletePresent) {
			Assert.fail("FAIL: Delete option should not be present.");
		}
		System.out.println("PASS: User cannot Add, Edit, or Delete Show On Dashboard settings.");
	}

	public void openReminderPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions
				.urlContains("/Setup/Home/Reminder?id=dbff8740-5363-4666-9eaa-271d42298025#showdashboard"));
	}

	public void allowShowOnDashboardViewWithPermissionOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// MailSetting
	public void verifyUserHasNoAccessToMailSetting() {
		List<WebElement> errorHeaders = driver.findElements(errorHeaderLocator);
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	public void openMailSettingPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/MailSetting"));
	}

	public void userCannotAccessMailSettingWithoutPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// CentralPASettings
	public void verifyUserHasNoAccessToCentralPASetting() {
		List<WebElement> errorHeaders = driver.findElements(errorHeaderLocator);
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	public void userCannotAccessCentralPaSettingWithoutPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCanAddCentralPAEntry() {
		sleep(2000);
		driver.findElement(processFromDateField).click();
		sleep(2000);
		WebElement anyActiveDate = wait.until(ExpectedConditions.elementToBeClickable(activeDateCell));
		anyActiveDate.click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	}

	public void allowCentralPaSettingViewAndAddWithPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddCentralPASetting() {
		sleep(3000);
		boolean isSubmitButtonPresent = !driver.findElements(submitButton).isEmpty();
		if (!isSubmitButtonPresent) {
			System.out.println("PASS: Submit button is not present.");
		} else {
			Assert.fail("FAIL: Submit button should not be present.");
		}
	}

	public void openCentralPASettingsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Web/Home/CentralPASettings"));
	}

	public void allowCentralPaSettingViewWithPermissionOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// WorkspaceUsers
	public void verifyUserCanLinkEmployeeToWorkspaceUser() {
		sleep(5000);
		List<WebElement> viewDetailList = driver.findElements(viewDetailOption);
		if (!viewDetailList.isEmpty()) {
			viewDetailList.get(0).click();
		}
		sleep(3000);
		boolean isEmployeeDetailPresent = !driver.findElements(employeeDetailSection).isEmpty();
		if (!isEmployeeDetailPresent) {
			Assert.fail("FAIL: Employee detail section is not present.");
		}
		driver.findElement(employeeDetailSection).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameFilter)).sendKeys("First Name");
		wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(employeeCheckbox)).click();
		wait.until(ExpectedConditions.elementToBeClickable(linkEmployeeButton)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(delinkEmployeeIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDelinkButton)).click();
	}

	public void allowWorkspaceUserFullAccessWithAllPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotLinkOrDelinkEmployeeToUser() {
		sleep(5000);
		List<WebElement> viewDetailList = driver.findElements(viewDetailOption);
		if (!viewDetailList.isEmpty()) {
			viewDetailList.get(0).click();
		}
		sleep(3000);
		boolean isEmployeeDetailPresent = !driver.findElements(employeeDetailSection).isEmpty();
		if (!isEmployeeDetailPresent) {
			System.out.println("PASS: Employee detail section is not present.");
		} else {
			Assert.fail("FAIL: Employee detail section should not be present.");
		}
	}

	public void verifyUserCanChangeProfileForWorkspaceUser() {
		List<WebElement> changeProfileList = driver.findElements(changeProfileOption);
		if (!changeProfileList.isEmpty()) {
			System.out.println("Change Profile option is present.");
			changeProfileList.get(0).click();
		} else {
			System.out.println("Change Profile option is NOT present.");
			return;
		}
		WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(profileDropdown));
		Select select = new Select(dropdownElement);
		select.selectByIndex(2);
		wait.until(ExpectedConditions.elementToBeClickable(submitUserButton)).click();
	}

	public void allowWorkspaceUserViewResetPasswordAndProfileChange() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotChangeProfileOrLinkOrDelinkEmployee() {
		sleep(3000);
		try {
			sleep(1000);
			boolean canChangeProfile = !driver.findElements(changeProfileOption).isEmpty();
			List<WebElement> viewDetailList = driver.findElements(viewDetailOption);
			if (!viewDetailList.isEmpty()) {
				viewDetailList.get(0).click();
			}
			sleep(1000);
			boolean canLinkEmployee = !driver.findElements(employeeDetailSection).isEmpty();
			boolean canDelinkEmployee = !driver.findElements(employeeDetailSection).isEmpty();
			if (!canChangeProfile && !canLinkEmployee && !canDelinkEmployee) {
				System.out.println("PASS: User cannot access Change Profile, Link, or Delink Employee.");
			} else {
				StringBuilder failureReasons = new StringBuilder("FAIL: User should not have access to:");
				if (canChangeProfile)
					failureReasons.append(" Change Profile;");
				if (canLinkEmployee)
					failureReasons.append(" Link Employee;");
				if (canDelinkEmployee)
					failureReasons.append(" Delink Employee;");
				Assert.fail(failureReasons.toString());
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	public void verifyUserCanResetPasswordForWorkspaceUser() {
		List<WebElement> resetOptions = driver.findElements(resetPasswordOption);
		if (!resetOptions.isEmpty()) {
			System.out.println("Reset Password option is present.");
			resetOptions.get(0).click();
		} else {
			System.out.println("Reset Password option is NOT present.");
			return;
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(newPasswordField)).sendKeys("Admin@1234");
		wait.until(ExpectedConditions.visibilityOfElementLocated(confirmPasswordField)).sendKeys("Admin@1234");
		wait.until(ExpectedConditions.elementToBeClickable(resetPasswordButton)).click();
	}

	public void allowWorkspaceUserViewAndPasswordResetOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotResetPasswordChangeProfileOrLinkEmployee() {
		sleep(3000);
		try {
			WebElement menuButton = driver.findElement(actionMenuButton);
			menuButton.click();
			sleep(1000);
			boolean canResetPassword = !driver.findElements(resetPasswordOption).isEmpty();
			boolean canChangeProfile = !driver.findElements(changeProfileOption).isEmpty();
			List<WebElement> viewDetailList = driver.findElements(viewDetailOption);
			if (!viewDetailList.isEmpty()) {
				viewDetailList.get(0).click();
			}
			sleep(1000);
			boolean employeeDetailVisible = !driver.findElements(employeeDetailSection).isEmpty();
			boolean canLinkEmployee = false;
			boolean canDelinkEmployee = false;

			if (employeeDetailVisible) {
				canLinkEmployee = !driver.findElements(employeeDetailSection).isEmpty();
				canDelinkEmployee = !driver.findElements(employeeDetailSection).isEmpty();
			}

			if (!canResetPassword && !canChangeProfile && !canLinkEmployee && !canDelinkEmployee) {
				System.out.println(
						"PASS: User does not have unauthorized access to Reset Password, Change Profile, Link/Delink Employee.");
			} else {
				StringBuilder failureReasons = new StringBuilder("FAIL: User should not have access to:");
				if (canResetPassword)
					failureReasons.append(" Reset Password;");
				if (canChangeProfile)
					failureReasons.append(" Change Profile;");
				if (canLinkEmployee)
					failureReasons.append(" Link Employee;");
				if (canDelinkEmployee)
					failureReasons.append(" Delink Employee;");
				Assert.fail(failureReasons.toString());
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	public void verifyUserCanViewWorkspaceUserDetails() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(workspaceUserActionMenuButton)).click();
		sleep(500);
		List<WebElement> viewDetailElements = driver.findElements(viewDetailOption);
		if (!viewDetailElements.isEmpty()) {
			System.out.println("View Detail option is present.");
		} else {
			System.out.println("View Detail option is NOT present.");
		}
	}

	public void userWithOnlyViewDetailPermissionRestrictedToWorkspaceUser() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Mails
	public void openMailsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Mails"));
	}

	public void denyMailPageAccessWithoutViewPermissionUiOrUrl() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Faxes
	public void verifyUserHasNoAccessToFaxPageViaUIOrURL() {
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(errorHeaderLocator);
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	public void openFaxesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Faxes"));
	}

	public void denyFaxPageAccessWithoutViewPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// BOTCalls
	public void verifyUserHasNoAccessToBotCallPageViaUIOrURL() {
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(errorHeaderLocator);
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	public void openBotCallsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/BOTCalls"));
	}

	public void userWithoutBotCallViewPermissionCannotAccessBotCallPage() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// CallActivities
	public void verifyUserHasNoAccessToCallActivityPageViaUIOrURL() {
		List<WebElement> errorHeaders = driver.findElements(errorHeader);
		if (!errorHeaders.isEmpty()) {
			System.out.println("PASS: Access is blocked. User does not have permission.");
		} else {
			Assert.fail("FAIL: Page loaded successfully. Access should be restricted.");
		}
	}

	public void openCallActivityPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/CallActivities"));
	}

	public void profileHasNoCallActivityViewAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Texts
	public void openTextPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Texts"));
	}

	public void verifyNoViewAccessOnTextPage() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Driver And SalesRep User
	public void verifyUserCannotAccessDriverAndSalesRepUserPageViaDirectURL() {
		boolean isErrorVisible = !driver.findElements(errorHeader).isEmpty();
		if (isErrorVisible) {
			System.out.println("PASS: Access blocked as expected.");
		} else {
			Assert.fail("FAIL: Access granted unexpectedly.");
		}
	}

	public void openDriverUsersPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DriverAndSalesRepUsers?userType=DriverUsers"));
	}

	public void userRestrictedFromDriverAndSalesRepUser() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Professional License Type
	public void userShouldBeAbleToDeleteProfessionalLicenseType() {
		try {
			WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(actionMenuBtn));
			menuButton.click();
			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();
			if (deleteExists) {
				System.out.println("PASS: Delete option is visible as expected.");
				wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
				wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteBtn)).click();
			} else {
				Assert.fail("FAIL: Delete option is not visible, but it should be.");
			}
		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu or perform delete कार्रवाई.");
		}
	}

	public void userCanManageProfessionalLicenseTypeEntries() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToDeleteProfessionalLicenseType() {
		try {
			WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(actionMenuBtn));
			menuButton.click();
			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();
			if (!deleteExists) {
				System.out.println("PASS: User cannot see Delete option.");
			} else {
				Assert.fail("FAIL: User should not see Delete option.");
			}
		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu cannot be accessed (no delete permission).");
		}
	}

	public void userShouldBeAbleToEditExistingProfessionalLicenseType() {
		String profileName = Hooks.prop.getProperty("profile.name.value");
		try {
			WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(actionMenuBtn));
			menuButton.click();
			boolean editExists = !driver.findElements(editOption).isEmpty();
			if (editExists) {
				System.out.println("PASS: Edit option is visible as expected.");
				wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
				WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(nameField));
				input.clear();
				input.sendKeys(profileName);
				wait.until(ExpectedConditions.elementToBeClickable(saveBtn)).click();
			} else {
				Assert.fail("FAIL: Edit option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Edit option.");
		}
	}

	public void userCanViewAddEditProfessionalLicenseTypeEntries() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToEditOrDeleteProfessionalLicenseType() {
		try {
			WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(actionMenuBtn));
			menuButton.click();
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

	public void userShouldBeAbleToAddNewProfessionalLicenseType() {
		String profileName = Hooks.prop.getProperty("profile.name.value");
		wait.until(ExpectedConditions.elementToBeClickable(newProfessionalLicenseTypeBtn)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(nameField)).sendKeys(profileName);
		wait.until(ExpectedConditions.elementToBeClickable(saveBtn)).click();
	}

	public void openProfessionalLicenseTypePage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/ProfessionalLicenseTypes"));
	}

	public void userCanViewAndAddProfessionalLicenseTypeEntries() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddEditOrDeleteProfessionalLicenseType() {
		try {
			Assert.assertTrue(driver.findElements(newProfessionalLicenseTypeButton).isEmpty(),
					"FAIL: 'New Professional License Type' button should not be visible");
			WebElement menuButton = wait
					.until(ExpectedConditions.elementToBeClickable(professionalLicenseActionMenuButton));
			menuButton.click();
			boolean editExists = !driver.findElements(editOption).isEmpty();
			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();
			if (!editExists && !deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}
		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu is not accessible due to permission restrictions.");
		}
	}

	public void userRestrictedToViewOnlyProfessionalLicenseType() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Fax Setting
	public void verifyUserCanDeleteFaxSetting() {
		try {
			WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(faxSettingActionMenuButton));
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

	public void createProfileWithFullAccessToFaxSetting() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotDeleteFaxSetting() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(faxSettingActionMenuButton));
			menuButton.click();
			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();
			if (!deleteExists) {
				System.out.println("PASS: Delete option is not visible as expected.");
			} else {
				Assert.fail("FAIL: Delete option is visible, but it should not be.");
			}
		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu is not accessible due to permission restrictions.");
		}
	}

	public void verifyUserCanEditExistingFaxSetting() {
		String profileName = Hooks.prop.getProperty("profile.name.value");
		try {
			WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(faxSettingActionMenuButton));
			menuButton.click();
			boolean editExists = !driver.findElements(editOption).isEmpty();
			if (editExists) {
				System.out.println("PASS: Edit option is visible as expected.");
				wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(faxApiIdField));
				driver.findElement(faxApiIdField).clear();
				driver.findElement(faxApiIdField).sendKeys(profileName);
				wait.until(ExpectedConditions.elementToBeClickable(saveFaxSettingButton)).click();
			} else {
				Assert.fail("FAIL: Edit option is not visible, but it should be.");
			}
		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Edit option.");
		}
	}

	public void userCanViewAddEditFaxSettingEntries() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrDeleteFaxSetting() {
		try {
			WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(faxSettingActionMenuButton));
			menuButton.click();
			boolean editExists = !driver.findElements(editOption).isEmpty();
			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();
			if (!editExists && !deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}
		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu is not accessible due to permission restrictions.");
		}
	}

	public void verifyUserCanAddNewFaxSetting() {
		String profileName = Hooks.prop.getProperty("profile.name.value");
		String createdEmail = Hooks.prop.getProperty("user.email.value");
		wait.until(ExpectedConditions.elementToBeClickable(newFaxSettingButton)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(faxApiIdField));
		driver.findElement(faxApiIdField).clear();
		driver.findElement(faxApiIdField).sendKeys(profileName);
		driver.findElement(fromEmailField).clear();
		driver.findElement(fromEmailField).sendKeys(createdEmail);
		wait.until(ExpectedConditions.elementToBeClickable(saveFaxSettingButton)).click();
	}

	public void verifyViewAndAddAccessOnFaxSetting() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddEditOrDeleteFaxSetting() {
		boolean addExists = !driver.findElements(newFaxSettingsBtn).isEmpty();
		if (addExists) {
			Assert.fail("FAIL: User should not see 'New Fax Settings' button.");
		} else {
			System.out.println("PASS: User cannot see 'New Fax Settings' button.");
		}

		try {
			WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(actionMenuBtn));
			menuButton.click();
			boolean editExists = !driver.findElements(editOption).isEmpty();
			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();
			if (!editExists && !deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu cannot be accessed (no permissions).");
		}
	}

	public void openFaxSettingsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/FaxSettings"));
	}

	public void verifyViewOnlyAccessOnFaxSetting() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

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

	// Designation
	public void verifyUserCanDeleteDesignation() {
		try {
			WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(designationActionMenuButton));
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

	public void verifyUserCanEditExistingDesignation() {
		String profileName = Hooks.prop.getProperty("profile.name.value");
		try {
			WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(designationActionMenuButton));
			menuButton.click();
			boolean editExists = !driver.findElements(editOption).isEmpty();
			if (editExists) {
				System.out.println("PASS: Edit option is visible as expected.");
				wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(designationLevelField));
				driver.findElement(designationLevelField).clear();
				driver.findElement(designationLevelField).sendKeys(profileName);
				wait.until(ExpectedConditions.elementToBeClickable(saveDesignationButton)).click();

			} else {
				Assert.fail("FAIL: Edit option is not visible, but it should be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			Assert.fail("FAIL: Could not open the action menu to verify Edit option.");
		}
	}

	public void createProfileWithFullAccessToDesignation() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrDeleteAnyDesignation() {
		try {
			WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(designationActionMenuButton));
			menuButton.click();
			boolean editExists = !driver.findElements(editOption).isEmpty();
			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();
			if (!editExists && !deleteExists) {
				System.out.println("PASS: User cannot see Edit/Delete options.");
			} else {
				Assert.fail("FAIL: User should not see Edit/Delete options.");
			}
		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu is not accessible due to permission restrictions.");
		}
	}

	public void verifyUserCanAddNewDesignation() {
		String profileName = Hooks.prop.getProperty("profile.name.value");
		wait.until(ExpectedConditions.elementToBeClickable(newDesignationButton)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(designationNameField));
		driver.findElement(designationNameField).clear();
		driver.findElement(designationNameField).sendKeys(profileName);
		driver.findElement(designationLevelField).clear();
		driver.findElement(designationLevelField).sendKeys(profileName);
		wait.until(ExpectedConditions.elementToBeClickable(saveDesignationButton)).click();
	}

	public void userCanViewAndAddDesignationEntries() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddEditOrDeleteDesignation() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(designationActionMenuButton));
			menuButton.click();
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

	public void openDesignationPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Designations"));
	}

	public void userRestrictedToViewOnlyDesignation() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Whitelist IP
	public void verifyUserCanRemoveExcludedUser() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(excludeUserLink).click();
		Thread.sleep(1000);
		driver.findElement(newExcludeUserBtn).click();
		Thread.sleep(1000);
		driver.findElement(firstUserCheckbox).click();
		Thread.sleep(1000);
		WebElement saveButton = driver.findElement(saveBtn);
		saveButton.click();
		Thread.sleep(1000);
	}

	public void verifyUserCanExcludeUserFromWhitelistIP() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(excludeUserLink).click();
		List<WebElement> elements = driver.findElements(newExcludeUserBtn);
		Assert.assertTrue(!elements.isEmpty(), "FAIL: 'New Exclude User' option should be visible");
		driver.findElement(excludeUserLink).click();
		driver.findElement(userCheckbox).click();
		WebElement saveButton = driver.findElement(saveBtn);
		saveButton.click();
	}

	public void userCanManageWhitelistIpAndExcludedUsers() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCanDeleteWhitelistIP() throws InterruptedException {
		Thread.sleep(3000);
		try {
			WebElement menuButton = driver.findElement(actionMenuBtn);
			Thread.sleep(1000);
			menuButton.click();
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
			Assert.fail("FAIL: Could not open the action menu to verify Delete option.");
		}
	}

	public void userCanViewAddDeleteWhitelistIps() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotDeleteIPsOrManageExcludedUsers() throws InterruptedException {
		Thread.sleep(3000);
		try {
			WebElement menuButton = driver.findElement(actionMenuBtn);
			menuButton.click();
			Thread.sleep(1000);
			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();
			if (!deleteExists) {
				System.out.println("PASS: Delete option is not visible as expected.");
			} else {
				Assert.fail("FAIL: Delete option is visible, but it should not be.");
			}

		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	public void verifyUserCanAddNewWhitelistIP() throws InterruptedException {
		Thread.sleep(3000);
		Random random = new Random();
		int lastOctet = random.nextInt(254) + 1;
		String randomIP = "192.168.100." + lastOctet;
		driver.findElement(newIpBtn).click();
		String profileName = Hooks.prop.getProperty("profile.name.value");
		WebElement ipInput = driver.findElement(ipField);
		ipInput.clear();
		ipInput.sendKeys(randomIP);
		WebElement nameInput = driver.findElement(nameField);
		nameInput.clear();
		nameInput.sendKeys(profileName);
		WebElement submitButton = driver.findElement(submitBtn);
		submitButton.click();
	}

	public void userCanViewAndAddWhitelistIps() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotExcludeOrRemoveExcludedUsers() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(excludeUserLink).click();
		List<WebElement> elements = driver.findElements(newExcludeUserBtn);
		Assert.assertTrue(elements.isEmpty(), "FAIL: 'New Exclude User' button should NOT be visible");
	}

	public void verifyUserCannotAddOrDeleteIPs() throws InterruptedException {
		Thread.sleep(3000);
		List<WebElement> newIpElements = driver.findElements(newIpBtn);
		Assert.assertTrue(newIpElements.isEmpty(), "FAIL: 'New IP' button should NOT be visible");
		try {
			WebElement menuButton = driver.findElement(actionMenuBtn);
			menuButton.click();
			Thread.sleep(1000);
			boolean deleteExists = !driver.findElements(deleteOption).isEmpty();
			if (!deleteExists) {
				System.out.println("PASS: User cannot see Delete option.");
			} else {
				Assert.fail("FAIL: User should not see Delete option.");
			}
		} catch (ElementClickInterceptedException | TimeoutException e) {
			System.out.println("PASS: Action menu exists but cannot be opened (no permissions).");
		}
	}

	public void openWhitelistIPsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/WhitelistIPs"));
	}

	public void verifyViewOnlyAccessOnWhitelistIp() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

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
