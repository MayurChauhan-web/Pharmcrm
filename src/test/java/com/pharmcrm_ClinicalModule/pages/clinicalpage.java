package com.pharmcrm_ClinicalModule.pages;

import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import hooks.Hooks;

import org.junit.Assert;

public class clinicalpage {

	private WebDriver driver;
	private WebDriverWait wait;

	// Patient
	public By firstRowActionIcon = By.xpath("//tbody/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]");
	public By filterFirstNameInput = By.xpath("//input[@id='Filter_FirstName']");
	public By filterLastNameInput = By.xpath("//input[@id='Filter_LastName']");
	public By filterBirthDateInput = By.xpath("//input[@id='Filter_BirthDate']");
	public By filterPhoneNumberInput = By.xpath("//input[@id='Filter_PhoneNumber']");
	public By filterCellNumberInput = By.xpath("//input[@id='Filter_CellNumber']");
	public By filterZipCodeInput = By.xpath("//input[@id='Filter_ZipCode']");
	public By filterEmailIdInput = By.xpath("//input[@id='Filter_EmailId']");
	public By toastMessage = By.xpath("//div[@class='toast-message']");
	public By patientEmailIdInput = By.xpath("//input[@id='Patient_EmailId']");
	public By patientZipCodeInput = By.xpath("//input[@id='Patient_ZipCode']");
	public By patientPhoneNumberInput = By.xpath("//input[@id='Patient_PhoneNumber']");
	public By patientSecondaryPhoneNumberInput = By.xpath("//input[@id='Patient_SecondaryPhoneNumber']");
	public By patientLegalGuardianPhoneInput = By.xpath("//input[@id='Patient_LegalGuardianPhonenumber']");
	public By patientHeadOfHouseholdPhoneInput = By.xpath("//input[@id='Patient_HeadOfHouseholdPhonenumber']");
	public By patientCellNumberInput = By.xpath("//input[@id='Patient_CellNumber']");
	public By saveCareGiverNamePopupButton = By.xpath("//button[@id='btnSaveCareGiverNamePopup']");
	public By patientCareGiverNamePhoneInput = By.xpath("//input[@id='PatientCareGiverName_PhoneNumber']");
	public By encounterButton = By.xpath("//button[@id='btnEncounter']");

	// RPM / RPM Status
	public By patientRPMStatusEditLabel = By.xpath("//label[@for='chkg39PatientRPMStatusEdit']");
	public By patientRPMStatusDeleteLabel = By.xpath("//label[@for='chkg39PatientRPMStatusDelete']");

	// RPM / Digital Signature
	public By digitalSignatureDeleteLabel = By.xpath("//label[@for='chkg40DigitalSignatureDelete']");
	public By downloadDigitalSignatureLabel = By.xpath("//label[normalize-space()='Download Digital Signature']");

	// Device Usage Statistic Report
	public By deviceUsageStatisticReportAllLabel = By.xpath("//label[@for='chkg47DeviceUsageStatisticReportAll']");
	public By deviceUsageStatisticReportViewLabel = By.xpath("//label[@for='chkg47DeviceUsageStatisticReportView']");

	// RPM / CPT Code Page
	public By rpmEventCPTCodeEditLabel = By.xpath("//label[@for='chkg40RPMEventCPTCodeEdit']");
	public By rpmEventCPTCodeDeleteLabel = By.xpath("//label[@for='chkg40RPMEventCPTCodeDelete']");
	public By confirmDeleteRPMCPTCodeButton = By.id("deleteRPMEventCPTCode");
	public By rpmCptCodeRepeatInput = By.id("RPMEventCPTCode_Repeat");
	public By saveRpmCptCodeButton = By.id("btnSaveRPMEventCPTCode");
	public By rpmCptCodeAllLabel = By.xpath("//label[@for='chkg40RPMEventCPTCodeAll']");
	public By rpmCptCodeAddLabel = By.xpath("//label[@for='chkg40RPMEventCPTCodeAdd']");
	public By editRpmCptCodeButton = By.xpath("//a[@onclick[contains(.,'editRPMEventCPTCode')]]");
	public By deleteRpmCptCodeButton = By.id("btnDeleteRPMEventCPTCode");
	public By cptCodeLink = By.xpath("//a[normalize-space()='CPT Code']");
	public By cptMonthDropdown = By.id("CPT_Month");
	public By cptYearDropdown = By.id("CPT_Year");
	public By addCptCodeButton = By.xpath("//a[@id='addCPTCodePopup']//img");
	public By cpt99091Label = By.xpath("//label[normalize-space()='[99091]']");
	public By saveCptCodeButton = By.id("btnCPTCode");
	public By cptFilterMonthDropdown = By.id("CPTFilter_Month");
	public By cptFilterYearDropdown = By.id("CPTFilter_Year");
	public By cptApplyButton = By
			.xpath("//button[@onclick='javascript:CTPApply();']//*[name()='svg']//*[name()='path' and @id='Path_15']");
	public By editDigitalSignatureButton = By.xpath("(//a[@data-original-title='Edit Digital Signature'])[1]");
	public By deleteWizardButton = By.xpath("(//a[@id='btnDeleteDigitalSignatureWizardConfirm'])[1]");
	public By digitalSignatureAllLabel = By.xpath("//label[@for='chkg40DigitalSignatureAll']");
	public By digitalSignatureEditLabel = By.xpath("//label[@for='chkg40DigitalSignatureEdit']");
	public By deleteDigitalSignatureButton = By.id("btnDeleteDigitalSignatureWizardConfirm");
	public By firstBucketDropdownRpm = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By editOptionRpm = By.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[text()='Edit']");
	public By digitalSignatureLink = By.xpath("//a[normalize-space()='Digital Signature']");
	public By firstSignatureEditIcon = By.xpath("//tbody/tr[1]/td[5]/div[1]/a[1]/img[1]");
	public By signerFullNameInput = By.id("DigitalSignatureSigner_FullName");
	public By signerEmailInput = By.id("DigitalSignatureSigner_EmailID");
	public By nextButtonRpm = By.xpath("//a[normalize-space()='Next']");
	public By subjectInput = By.id("DigitalSignature_Subject");
	public By emailEditor = By.xpath("//div[@aria-label='Editor editing area: main. Press Alt+0 for help.']");

	// Prior Authorization PA Progress Step
	public By paProgressStepEditLabel = By.xpath("//label[@for='chkg40PAProgressStepEdit']");
	public By paProgressStepDeleteLabel = By.xpath("//label[@for='chkg40PAProgressStepDelete']");
	public By confirmDeleteButtonpa = By.id("deletepatientClinicalPriorAuthorizationNote");
	public By saveOutcomeNoteButtonpa = By.id("btnSaveClinicalPriorAuthorizationOutcomeNote");
	public By progressStatusDropdownEdit = By.id("ddProgressStatus");
	public By editNotesTextarea = By.id("ClinicalPriorAuthorization_Notes1");
	public By saveEditNoteButton = By.id("btnSaveClinicalPriorAuthorizationNote");
	public By paProgressStepAllLabel = By.xpath("//label[@for='chkg40PAProgressStepAll']");
	public By paProgressStepAddLabel = By.xpath("//label[@for='chkg40PAProgressStepAdd']");
	public By firstBucketDropdown = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By editOptionStep = By.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[text()='Edit']");
	public By progressStatusDropdownStep = By.id("ProgressStatus");
	public By notesTextarea = By.id("ClinicalPriorAuthorization_Notes");
	public By saveButtonStep = By.id("btnSaveClinicalPriorAuthorizationOutcomeNote");

	// RPM / RPM Progress Step
	public By rpmProgressStepEditLabel = By.xpath("//label[@for='chkg40RPMProgressStepEdit']");
	public By rpmProgressStepDeleteLabel = By.xpath("//label[@for='chkg40RPMProgressStepDelete']");
	public By deleteProgressButton = By.xpath("(//a[@id='btnDeleteRemoteMonitoringNoteConfirm'])[1]");
	public By addProgressStatusDropdown = By.id("AddProgressStatus");
	public By addRemoteMonitoringNoteField = By.id("AddRemoteMonitoring_Note");
	public By editProgressStepButton = By.xpath("(//a[@data-original-title='Edit Provider EHR'])[1]");
	public By deleteProgressStepButton = By.xpath("(//a[@id='btnDeleteRemoteMonitoringNoteConfirm'])[1]");
	public By progressStepsLink = By.xpath("//a[normalize-space()='Progress Steps']");
	public By remoteMonitoringNoteField = By.id("RemoteMonitoring_Note");
	public By saveProgressButton = By
			.xpath("//button[@id='btnSaveRemoteMonitoringNote']//*[name()='svg']//*[name()='path' and @id='Path_23']");
	public By editRpmButton = By.xpath("(//a[@data-original-title='Edit RPm Status'])[1]");
	public By deleteRpmStatusButton = By.xpath("(//a[@id='btnDeletePatientRPMStatusConfirm'])[1]");
	public By saveRpmButton = By.xpath(
			"//button[@id='btnSaveRemoteMonitoringStatus']//*[name()='svg']//*[name()='path' and @id='Path_23']");
	public By deleteRpmButton = By.xpath("(//a[@id='btnDeletePatientRPMStatusConfirm'])[1]");
	public By editRpmStatusButton = By.xpath("(//a[@data-original-title='Edit RPm Status'])[1]");
	public By addRpmStatusDropdown = By.id("AddRPMStatus");
	public By addRpmNoteField = By.id("AddRPM_Note");
	public By saveEditedButton = By.id("btnSaveEditedRemoteMonitoringStatus");
	public By rpmStatusAllLabelcheck = By.xpath("//label[@for='chkg39PatientRPMStatusAll']");
	public By rpmStatusAddLabel = By.xpath("//label[@for='chkg39PatientRPMStatusAdd']");
	public By editRpmStatus = By.xpath("(//a[@data-original-title='Edit RPm Status'])[1]");
	public By deleteRpmStatus = By.xpath("(//a[@id='btnDeletePatientRPMStatusConfirm'])[1]");
	public By bucketDropdownIcon = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By editOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By rpmStatusLink = By.xpath("//a[normalize-space()='RPM Status']");
	public By rpmStatusDropdown = By.id("RPMStatus");
	public By rpmNoteField = By.id("RPM_Note");
	public By saveButton = By.xpath(
			"//button[@id='btnSaveRemoteMonitoringStatus']//*[name()='svg']//*[name()='path' and @id='Path_23']");

	// Reports / Remote Monitoring Report
	public By patientIdFilterLocator = By.id("Filter_PatientId");
	public By clinicalRemoteMonitorReportAllLabel = By.xpath("//label[@for='chkg33ClinicalRemoteMonitorReportAll']");
	public By clinicalRemoteMonitorReportViewLabel = By.xpath("//label[@for='chkg33ClinicalRemoteMonitorReportView']");
	public By newClinicalPABtn = By.xpath("//span[normalize-space()='New Clinical Prior Authorization']");
	public By addPatientIcon = By.xpath("//a[@id='addPatientNamePopup']//img");
	public By searchBtnrm = By.xpath("//button[normalize-space()='Search']");
	public By selectPatientBtnrm = By.id("btnPatient");
	public By addDrugIconrm = By.xpath("//a[@id='addDrugNamePopup']//img");
	public By drugRadio = By.xpath("//input[@name='groupOfDrugRadios' and @data-name='amoxilin']");
	public By selectDrugBtnrm = By.id("btnDrug");
	public By addProviderIcon = By.xpath("//a[@id='addProviderNamePopup']//img");
	public By providerRadio = By.xpath("//input[@type='radio' and @name='groupOfProviderRadios']");
	public By selectProviderBtn = By.id("btnProvider");
	public By addPartnerIcon = By.xpath("//a[@id='addPartnerNamePopup']//img");
	public By partnerNameInput = By.id("Filter_BusinessName");
	public By partnerRadio = By.xpath("//input[@type='radio' and @name='groupOfPartnerRadios']");
	public By selectPartnerBtn = By.id("btnPartner");
	public By saveBtn = By.id("btnSave");
	public By verifyBtn = By.id("btnVerify");
	public By pendingSaveBtn = By.id("btnPendingSave");
	public By saveSubmissionBtn = By.id("btnSaveSubmission");
	public By sendInsuranceBtn = By.id("sendClinicalPAInsurancePending");
	public By toEmailInput = By.id("toEmail");
	public By emailBodyInput = By.xpath("//div[@aria-label='Editor editing area: main. Press Alt+0 for help.']");
	public By sendEmailBtn = By.xpath("//button[@class='btn btn-primary']");
	public By deleteChartNoteAttachmentIcon = By
			.xpath("//a[@id='btnDeletePriorAuthorizationChartNoteAttachment']//img");
	public By confirmChartNoteAttachmentDeleteBtn = By.id("btnDeletePriorAuthorizationChartNoteAttachment");
	public By deleteGeneratedAttachmentIcon = By.xpath("//a[@id='btnDeletePriorAuthorizationGenerateAttachment']//img");
	public By confirmAttachmentDeleteBtn = By.id("btnGenerateAttachmentDeleteConfirm");
	public By newClinicalPaBtn = By.xpath("//span[normalize-space()='New Clinical Prior Authorization']");
	public By searchBtn = By.xpath("//button[normalize-space()='Search']");
	public By firstPatientRadiorm = By.xpath("(//input[@type='radio'])[1]");
	public By selectPatientBtn = By.id("btnPatient");
	public By addDrugIcon = By.xpath("//a[@id='addDrugNamePopup']//img");
	public By drugRadiorm = By.xpath("//input[@name='groupOfDrugRadios' and @data-name='amoxilin']");
	public By selectDrugBtn = By.id("btnDrug");
	public By outcomeActionMenu = By.xpath("//td[@scope='row']//i[contains(@class,'fa-ellipsis-vertical')]");
	public By deleteOutcomeOption = By
			.xpath("//a[@id='btnDeletePriorAuthorizationOutcomeStatus']//span[normalize-space()='Delete']");
	public By confirmOutcomeDeleteBtn = By.id("btnOutcomeDeleteConfirm");
	public By paActionMenuButton = By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/button[1]/i[1]");

	// Locators for generating PA All PA
	public By newClinicalPAButton = By.xpath("//span[normalize-space()='New Clinical Prior Authorization']");
	public By patientIdInput = By.id("Filter_PatientId");
	public By firstPatientRadio = By.xpath("(//input[@type='radio'])[1]");
	public By selectPatientButton = By
			.xpath("//div[@class='modal-footer text-right d-block']//button[@id='btnPatient']");
	public By drugNameInput = By.id("Filter_DrugName");
	public By selectDrugButton = By.xpath("//div[@id='divSearchDrugInfo']//button[@id='btnDrug']");
	public By selectProviderButton = By.xpath("//button[@id='btnProvider']");
	public By businessNameInput = By.id("Filter_BusinessName");
	public By partnerSearchButton = By.xpath("//button[normalize-space()='Search']");
	public By selectPartnerButton = By.xpath("//button[@id='btnPartner']");
	public By pharmacyDetailsTab = By.xpath("//label[normalize-space()='Pharmacy Detail']");
	public By providerDetailsTab = By.xpath("//label[normalize-space()='Provider Detail']");
	public By drugDetailsTab = By.xpath("//label[normalize-space()='Drug Detail']");

	// RPM / Trigger Alert for Time
	public By triggerAlertEditLabel = By.xpath("//label[@for='chkg33TriggerAlertEdit']");
	public By triggerAlertDeleteLabel = By.xpath("//label[@for='chkg33TriggerAlertDelete']");
	public By firstReportDrilldownIcon = By.xpath("//tbody/tr[1]/td[10]/div[1]/a[2]//*[name()='svg']");
	public By downloadReportButton = By.xpath("//button[normalize-space()='Download Report']");
	public By firstReportIcon = By.xpath("//tbody/tr[1]/td[10]/div[1]/a[1]/img[1]");
	public By monthDropdown = By.id("ddMonth");
	public By yearDropdown = By.id("ddYear");
	public By sendForSignatureButton = By.xpath("//button[normalize-space()='Send for Signature']");
	public By signerDropdown = By.id("ddSigner");
	public By signerFullName = By.id("DigitalSignatureSigner_FullName");
	public By signerEmail = By.id("DigitalSignatureSigner_EmailID");
	public By addManualSignerButton = By.xpath("//a[@onclick='AddManualSigner()']//img[@class='v-align-middle']");
	public By nextButton = By.xpath("//a[normalize-space()='Next']");
	public By editorInput = By.xpath("//div[@aria-label='Editor editing area: main. Press Alt+0 for help.']");
	public By finishButton = By.xpath("//a[normalize-space()='Finish']");
	public By downloadRemoteMonitoringReportIconParameter = By.xpath("//tbody/tr[1]/td[10]/div[1]/a[1]/img[1]");
	public By reportMonthDropdownParameter = By.id("ddMonth");
	public By reportYearDropdownParameter = By.id("ddYear");
	public By downloadReportButtonParameter = By.xpath("//button[normalize-space()='Download']");
	public By drillDownRemoteMonitoringReportIconParameter = By
			.xpath("//tbody/tr[1]/td[10]/div[1]/a[2]//*[name()='svg']");
	public By rpmPatientRemoteMonitoringUrl = By.xpath("//body");

	// Bucket menu
	public By bucketDropdownIconTriggerAlert = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By editOptionTriggerAlert = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[contains(text(),'Edit')]");

	// Trigger alert row action menu
	public By triggerAlertActionMenuIcon = By.xpath(
			"//div[contains(@class,'rmMain-data') and contains(@class,'readingTable-main')]//button[1]//*[name()='svg']");

	// Delete option inside dropdown
	public By deleteTriggerAlertOption = By.id("btnDeleteRemoteMonitoringTriggerPointDetail");

	// Confirm delete button
	public By confirmDeleteTriggerAlertButton = By.id("deletePatientRemoteMonitoringTriggerPointDetail");
	public By triggerAlertActionMenuIconParameter = By
			.xpath("//div[contains(@class,'rmMain-data readingTable-main')]//button//*[name()='svg']");

	// Delete Trigger Alert option
	public By deleteTriggerAlertOptionParameter = By
			.xpath("//a[@id='btnDeleteRemoteMonitoringTriggerPointDetail']//*[name()='svg']");
	public By triggerAlertRowActionButtonParameter = By.xpath(
			"//div[@class='rmMain-data readingTable-main']//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']");
	public By editTriggerAlertOptionParameter = By.xpath(
			"//div[@class='tiggerAlert-dropdown show']//a[1]//*[name()='svg']//*[name()='path' and @id='Path_20']");
	public By triggerAlertMinutesInputParameter = By.id("PatientRemoteMonitoringTriggerPoint_Minutes");
	public By triggerAlertModalParameter = By.cssSelector("div.modal-dialog");
	public By triggerAlertAllLabelParameter = By.xpath("//label[@for='chkg33TriggerAlertAll']");
	public By triggerAlertAddLabelParameter = By.xpath("//label[@for='chkg33TriggerAlertAdd']");
	public By triggerAlertRowEditIconParameter = By.xpath(
			"(//div[contains(@class,'readingTable-main')]//button//*[name()='svg']//*[name()='path' and contains(@id,'Path_')])[2]");
	public By editTriggerAlertButtonNotPresentParameter = By.xpath(
			"//div[contains(@class,'tiggerAlert')]//a[contains(@onclick,'editRemoteMonitoringTriggerPointDetails')]");
	public By deleteTriggerAlertButtonNotPresentParameter = By
			.xpath("//div[contains(@class,'tiggerAlert')]//a[@id='btnDeleteRemoteMonitoringTriggerPointDetail']");
	public By bucketDropdownIconParameterTrigger = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By editOptionParameterTrigger = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By addTriggerAlertIconParameter = By.xpath("//i[@class='fa fa-plus']");
	public By triggerParameterDropdownParameter = By.xpath(
			"//div[@class='model-inp']//select[@id='PatientRemoteMonitoringTriggerPoint_PatientRemoteMonitoringParameterId']");
	public By saveTriggerAlertButtonParameter = By
			.xpath("//div[@class='modal-footer']//button[@id='btnSavePatientRemoteMonitoringTriggerPointDetailPopup']");
	public By triggerMinutesInputParameter = By.id("PatientRemoteMonitoringTriggerPoint_Minutes");
	public By triggerParameterSelectIdParameter = By
			.id("PatientRemoteMonitoringTriggerPoint_PatientRemoteMonitoringParameterId");

	// RPM / External Details for Alert
	public By externalDetailsEditLabel = By.xpath("//label[@for='chkg33ExternalDetailsEdit']");
	public By externalDetailsDeleteLabel = By.xpath("//label[@for='chkg33ExternalDetailsDelete']");
	public By editExternalAlertButtonNotPresentParameter = By
			.xpath("//a[contains(@onclick,'editRemoteMonitoringExternalEmailDetails')]/img");
	public By deleteExternalAlertIconParameter = By
			.xpath("//a[@id='btnDeleteRemoteMonitoringExternalEmailDetail']/img");
	public By confirmDeleteExternalAlertButtonParameter = By
			.xpath("//button[@id='deletePatientRemoteMonitoringExternalEmailDetail']");
	public By addExternalAlertButtonNotPresentParameter = By
			.xpath("//button[@onclick='javascript: BtnSavePatientRemoteMonitoring();']");
	public By deleteExternalAlertButtonNotPresentParameter = By
			.xpath("//a[@id='btnDeleteRemoteMonitoringExternalEmailDetail']/img");
	public By externalAlertRelationParameter = By.id("PatientRemoteMonitoringExternalEmail_Relation");
	public By editExternalAlertIconParameter = By.xpath("//tbody/tr[1]/td[10]/div[1]/a[1]/img[1]");
	public By saveExternalAlertPopupButtonParameter = By
			.xpath("//button[@id='btnSavePatientRemoteMonitoringExternalEmailDetailPopup']");
	public By externalDetailsAllLabelParameter = By.xpath("//label[@for='chkg33ExternalDetailsAll']");
	public By externalDetailsAddLabelParameter = By.xpath("//label[@for='chkg33ExternalDetailsAdd']");
	public By editExternalAlertNotPresentParameter = By
			.xpath("//a[@class='tooltiped txt-decor-none user-access']//img");
	public By deleteExternalAlertNotPresentParameter = By
			.xpath("//a[@id='btnDeleteRemoteMonitoringExternalEmailDetail']//img");
	public By externalAlertNameParameter = By.id("AddPatientRemoteMonitoringExternalEmail_Name");
	public By externalAlertEmailParameter = By.id("AddPatientRemoteMonitoringExternalEmail_EmailId");
	public By externalAlertPhoneParameter = By.id("AddPatientRemoteMonitoringExternalEmail_PhoneNumber");

	// Navigation
	public By AlertbucketDropdownIconParameter = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By AlerteditOptionParameter = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By externalAlertsTabParameter = By.xpath("//a[normalize-space()='External Alerts']");

	// Save button
	public By saveExternalAlertButtonParameter = By.xpath(
			"//button[@onclick='javascript: BtnSavePatientRemoteMonitoring();']//*[name()='svg']//*[name()='path' and @id='Path_23']");

	// RPM / RMP Details
	public By rmAllLabel = By.xpath("//label[@for='chkg31RMAll']");
	public By bucketDropdownIconoptionParameter = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By deleteOptionParameter = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	public By confirmDeleteButtonParameter = By
			.xpath("//div[@id='deletePriorAuthorizationModel']//button[@id='btnDeleteConfirm']");

	// RPM / Remote Monitoring Parameter
	public By editRpmParameterNotPresentParameter = By
			.xpath("//div[@class='row']//div[1]//div[1]//div[1]//div[2]//button[2]//*[name()='svg']");
	public By deleteRpmParameterButtonParameter = By
			.xpath("//div[@class='row']//div[1]//div[1]//div[1]//div[2]//button[3]//*[name()='svg']");
	public By confirmDeleteRpmParameterButtonParameter = By.xpath("//button[@id='deleteRemoteMonitoringParameter']");
	public By rmParameterDeleteLabelParameter = By.xpath("//label[@for='chkg31RMParameterDelete']");
	public By addRpmParameterNotPresentParameter = By
			.xpath("//button[@id='addRemoteMonitoringParameter']//*[name()='svg']//*[name()='path' and @id='Path_23']");
	public By deleteRpmParameterNotPresentParameter = By
			.xpath("//div[@class='row']//div[1]//div[1]//div[1]//div[2]//button[3]//*[name()='svg']");
	public By maxTriggerValueParameter = By.id("RemoteMonitorParameter_MaxTriggerValue");
	public By editRpmParameterButtonParameter = By.xpath(
			"//div[@class='row']//div[1]//div[1]//div[1]//div[2]//button[2]//*[name()='svg']//*[name()='path' and @id='Path_20']");
	public By saveRpmParameterButtonParameter = By.xpath("//button[@id='btnSaveRemoteParameter']");
	public By rmParameterEditLabelParameter = By.xpath("//label[@for='chkg31RMParameterEdit']");
	public By rmParameterAllLabelParameter = By.xpath("//label[@for='chkg31RMParameterAll']");
	public By rmParameterAddLabelParameter = By.xpath("//label[@for='chkg31RMParameterAdd']");
	public By editButtonNotPresentParameter = By
			.xpath("//div[@class='row']//div[1]//div[1]//div[1]//div[2]//button[2]//*[name()='svg']");
	public By deleteButtonNotPresentParameter = By.xpath(
			"//div[@class='row']//div[1]//div[1]//div[1]//div[2]//button[3]//*[name()='svg']//*[name()='path' and @id='Path_21']");
	public By bucketDropdownIconParameter = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By editOptionParameter = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[normalize-space()='Edit']");
	public By devicesTabParameter = By.xpath("//a[normalize-space()='Devices']");
	public By addRpmParameterButtonParameter = By
			.xpath("//button[@id='addRemoteMonitoringParameter']//*[name()='svg']");
	public By submitButtonParameter = By.xpath("//a[normalize-space()='Submit']");
	public By rpmParameterDropdown = By.id("RemoteMonitoringParameter");
	public By providerDropdown = By.id("Provider_FullName");
	public By deviceDropdownParameter = By.id("RemoteMonitorParameter_PatientRemoteMonitoringDeviceId");
	public By startDateField = By.id("RemoteMonitorParameter_StartDate");
	public By endDateField = By.id("RemoteMonitorParameter_EndDate");
	public By normalMin = By.id("RemoteMonitorParameter_NormalMin");
	public By normalMax = By.id("RemoteMonitorParameter_NormalMax");
	public By level1Min = By.id("RemoteMonitorParameter_Level1MinNormal");
	public By level1Max = By.id("RemoteMonitorParameter_Level1MaxNormal");
	public By level2Min = By.id("RemoteMonitorParameter_Level2MinNormal");
	public By level2Max = By.id("RemoteMonitorParameter_Level2MaxNormal");
	public By level3Min = By.id("RemoteMonitorParameter_Level3MinNormal");
	public By level3Max = By.id("RemoteMonitorParameter_Level3MaxNormal");
	public By minTriggerValue = By.id("RemoteMonitorParameter_MinTriggerValue");
	public By maxTriggerValue = By.id("RemoteMonitorParameter_MaxTriggerValue");

	// Remote Patient Monitoring (RPM)
	public By remoteMonitoringEditLabel = By.xpath("//label[@for='chkg31RemoteMonitoringEdit']");
	public By remoteMonitoringDeleteLabel = By.xpath("//label[@for='chkg31RemoteMonitoringDelete']");
	public By remoteMonitoringExportExcelLabel = By.xpath("//label[@for='chkg33RemoteMonitoringExportExcel']");
	public By rpmOutgoingCallLabel = By.xpath("//label[@for='chkg39RPMOutgoingCall']");
	public By remoteMonitoringAllCheckboxLabel = By.xpath("//label[@for='chkg31RemoteMonitoringAll']");
	public By remoteMonitoringAddCheckboxLabel = By.xpath("//label[@for='chkg31RemoteMonitoringAdd']");
	public By rpmActionMenuBtn = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By rpmEditOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[contains(text(),'Edit')]");
	public By outgoingCallIcon = By.xpath(
			"//div[@id='page-wrapper']//div[@class='rmBesic-data']//div[1][1]//a[1]//*[name()='svg']//*[name()='path' and @id='Path_6']");
	public By rpmActionMenu = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By rpmFirstRecordActionMenu = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By rpmDeleteOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Delete']");
	public By rpmDeleteConfirmButton = By.id("btnDeleteConfirm");
	public By progressStepsTab = By.xpath("//a[normalize-space()='Progress Steps']");
	public By noteTextarea = By.id("RemoteMonitoring_Note");
	public By saveNoteButton = By
			.xpath("//button[@id='btnSaveRemoteMonitoringNote']//*[name()='svg']//*[name()='path' and @id='Path_23']");
	public By bucketDropdownButton = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By deleteOptionrm = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	public By newRpmButton = By.xpath("//span[normalize-space()='New Patient Remote Monitoring']");
	public By searchButtonrm = By.xpath("//button[normalize-space()='Search']");
	public By selectFirstPatientRadiorm = By.id("0c950395-71e6-4134-b8e1-a405b7ad98f6");
	public By confirmPatientButtonrm = By
			.xpath("//div[@class='modal-footer text-right d-block']//button[@id='btnPatient']");
	public By nextButtonrm = By.xpath("//button[@id='btnNext']");
	public By submitLink = By.xpath("//a[normalize-space()='Submit']");

	// Reports / MTM Encounter Log
	public By mtmEncounterLogAllLabel = By.xpath("//label[@for='chkg27MTMEncounterLogAll']");
	public By mtmEncounterLogViewLabel = By.xpath("//label[@for='chkg27MTMEncounterLogView']");
	public By exportToExcelButton = By.xpath("//span[normalize-space()='Export to Excel']");
	public By viewDetailsIcon = By.xpath("//a[@class='txt-decor-none']//img");

	// Med Recons / Current Medication
	public By medReconsCurrentMedicationEditLabel = By.xpath("//label[@for='chkg24MedReconsCurrentMedicationEdit']");
	public By medReconsCurrentMedicationDeleteLabel = By
			.xpath("//label[@for='chkg24MedReconsCurrentMedicationDelete']");
	public By medReconsCurrentMedicationAllLabel = By.xpath("//label[@for='chkg24MedReconsCurrentMedicationAll']");
	public By medReconsCurrentMedicationAddLabel = By.xpath("//label[@for='chkg24MedReconsCurrentMedicationAdd']");
	public By newClinicalMedRecons = By.xpath("//span[normalize-space()='New Clinical Med Recons']");
	public By patientSearchInput = By.id("Filter_PatientId");
	public By patientConfirmButton = By.id("btnPatient");
	public By addCurrentMedication = By.xpath("//span[normalize-space()='Add Current Medication']");
	public By drugConfirmButton = By.id("btnDrug");
	public By addDrugAction = By.xpath("//td[@class='text-right']//a[1]//*[name()='svg']");
	public By deleteMedicationIcon = By.xpath("//tr[@id='trMed_1']//a[@id='btnDeleteMedicationConfirm']//img");
	public By deleteConfirmButtonmr = By.id("deletepatientmedsonchart");
	public By saveButtonmr = By.id("btnSave");
	public By addCurrentMedicationButton = By.xpath("//span[normalize-space()='Add Current Medication']");
	public By newMedReconsBtn = By.xpath("//span[normalize-space()='New Clinical Med Recons']");
	public By patientPopupIcon = By.xpath("//a[@id='addPatientNamePopup']//img");
	public By patientSearchBtn = By.xpath("//button[normalize-space()='Search']");
	public By patientSelectCheckbox = By.xpath("//input[@id='0c950395-71e6-4134-b8e1-a405b7ad98f6']");
	public By patientConfirmBtn = By.id("btnPatient");
	public By drugLookupIcon = By.xpath("//div[@class='model-inp requiredfield']//img");
	public By drugSearchBtn = By.xpath("//button[normalize-space()='Search']");
	public By drugSelectCheckbox = By.xpath("//input[@id='0']");
	public By drugConfirmBtn = By.id("btnDrug");
	public By editMedIcon = By.xpath("//tr[@id='trMed_1']//a[1]//img[1]");
	public By directionInput = By.id("ExtendedMedsOnChart_Direction_1");
	public By editCurrentMedicationIcon = By.xpath("//tbody//a[1]//img[1]");
	public By deleteCurrentMedicationIcon = By.xpath("//a[@id='btnDeleteMedicationConfirm']//img");
	public String clinicalMedReconsUrl = "/Clinical/Home/ClinicalMedRecons";
	public By newClinicalMedReconsBtn = By.xpath("//span[normalize-space()='New Clinical Med Recons']");
	public By searchPatientBtn = By.xpath("//button[normalize-space()='Search']");
	public By patientRadioBtn = By.id("0c950395-71e6-4134-b8e1-a405b7ad98f6");
	public By confirmPatientBtn = By.id("btnPatient");
	public By addCurrentMedicationBtn = By.xpath("//span[normalize-space()='Add Current Medication']");
	public By searchDrugBtn = By.xpath("//button[normalize-space()='Search']");
	public By drugRadioBtn = By.id("0");
	public By confirmDrugBtn = By.id("btnDrug");
	public By addDrugToGridBtn = By.xpath("//td[@class='text-right']//a[1]//*[name()='svg']");
	public By saveMedReconsBtn = By.id("btnSave");
	public By pullMedsOnChartSpan = By.xpath("//span[normalize-space()='Pull Meds On Chart']");
	public By pullCurrentMedicationSpan = By.xpath("//span[normalize-space()='Pull Current Medication']");
	public By patientCareGiverNamePhoneNumberInput = By.xpath("//*[name()='path' and contains(@d,'M48 96V416')]");
	public By firstRowActionSvgPath = By.xpath(
			"//tr[@id='trCur_0']//td[@class='text-right']//a[1]//*[name()='svg']//*[name()='path' and contains(@d,'M48 96V416')]");

	// Med Recons / Meds On Chart
	public By confirmDeleteMedsOnChartButton = By.id("deletepatientmedsonchart");
	public By directionInputFirstMed = By.id("ExtendedMedsOnChart_Direction_1");
	public By editMedsOnChartButton = By.xpath("//tbody//a[1]//img[1]");
	public By deleteMedsOnChartButton = By.xpath("//a[@id='btnDeleteMedicationConfirm']//img");
	public By addMedsOnChartButton = By.xpath("//span[normalize-space()='Add Meds On Chart']");
	public By addDrugPopupIcon = By.xpath("//div[@class='model-inp requiredfield']//img");
	public By drugNameFilterInput = By.id("Filter_DrugName");
	public By drugSearchButton = By.xpath("//button[normalize-space()='Search']");
	public By selectDrugRadioButton = By.id("0");
	public By addDrugToChartButton = By.xpath("//td[@class='text-right']//a[1]//*[name()='svg']");
	public By saveMedsOnChartButton = By.id("btnSave");

	// Med Recons
	public By downloadFileButton = By.xpath("//tbody/tr[1]/td[8]/div[1]/a[1]/img[1]");
	public By currentMedicationCheckbox = By.xpath("//label[normalize-space()='Current Medication?']");
	public By confirmDownloadButton = By.id("btnClinicalMedReconReportConfirm");
	public By confirmMedReconsDeleteButton = By
			.xpath("//div[@id='deleteClinicalMedReconModel']//button[@id='btnDeleteConfirm']");
	public By medReconsEditButton = By.xpath("//tbody/tr[1]/td[8]/div[1]/a[1]/img[1]");
	public By medReconsDeleteButton = By.xpath("//tbody/tr[1]/td[8]/div[1]/a[2]/img[1]");
	public By medReconsArchiveButton = By.xpath("//tbody/tr[1]/td[8]/div[1]/a[3]/img[1]");
	public By newMedReconsButton = By.xpath("//span[normalize-space()='New Clinical Med Recons']");
	public By encounterStatusDropdown = By.id("ClinicalEncounter_EncounterStatus");
	public By addPatientPopupIcon = By.xpath("//a[@id='addPatientNamePopup']//img");
	public By patientIdFilterInput = By.id("Filter_PatientId");
	public By patientSearchButton = By.xpath("//button[normalize-space()='Search']");
	public By selectPatientRadioButton = By.id("0c950395-71e6-4134-b8e1-a405b7ad98f6");
	public By saveMedReconsButton = By.id("btnSave");

	// Prior Authorization
	public By filterButton = By.xpath("//span[normalize-space()='Filter']");
	public By showAllRecordsCheckbox = By.xpath("//label[normalize-space()='Show All Records?']");
	public By searchFilterButton = By.xpath("//i[@class='fa-solid fa-magnifying-glass']");
	public By unarchiveButton = By.xpath("//a[@id='btnUnArchive']//*[name()='svg']");
	public By confirmUnarchiveButton = By.id("btnUnArchiveConfirm");
	public By archiveButton = By.xpath("//*[name()='path' and @id='Union_4']");
	public By newPriorAuthorizationOption = By.xpath("//span[normalize-space()='New Clinical Prior Authorization']");
	public By progressStatusDropdown = By.id("ProgressStatus");
	public By notesInput = By.id("ClinicalPriorAuthorization_Notes");
	public By saveOutcomeNoteButton = By.id("btnSaveClinicalPriorAuthorizationOutcomeNote");

	// Buttons & Links
	public By newPriorAuthorizationButton = By.xpath("//span[normalize-space()='New Clinical Prior Authorization']");
	public By addPatientButton = By.xpath("//a[@id='addPatientNamePopup']//img");
	public By searchPatientButton = By.xpath("//button[normalize-space()='Search']");
	public By selectFirstPatientRadio = By.xpath("(//input[@type='radio'])[1]");
	public By confirmPatientButton = By
			.xpath("//div[@class='modal-footer text-right d-block']//button[@id='btnPatient']");
	public By addDrugButton = By.xpath("//a[@id='addDrugNamePopup']//img");
	public By searchDrugButton = By.xpath("//button[normalize-space()='Search']");
	public By selectDrugRadio = By.xpath("//input[@name='groupOfDrugRadios' and @data-name='amoxilin']");
	public By confirmDrugButton = By.xpath("//div[@id='divSearchDrugInfo']//button[@id='btnDrug']");
	public By addProviderButton = By.xpath("//a[@id='addProviderNamePopup']//img");
	public By selectProviderRadio = By.xpath("//input[@type='radio' and @name='groupOfProviderRadios']");
	public By confirmProviderButton = By.xpath("//button[@id='btnProvider']");
	public By addPartnerButton = By.xpath("//a[@id='addPartnerNamePopup']//img");
	public By fullSearchRadio = By.id("rdoFullSearch");
	public By searchPartnerButton = By.xpath("//button[normalize-space()='Search']");
	public By selectPartnerRadio = By.xpath("//input[@type='radio' and @name='groupOfPartnerRadios']");
	public By confirmPartnerButton = By.xpath("//button[@id='btnPartner']");
	public By verifyButton = By.id("btnVerify");
	public By pendingSaveButton = By.id("btnPendingSave");
	public By saveSubmissionButton = By.id("btnSaveSubmission");

	// Tabs
	public By patientDetailsTab = By.xpath("//label[normalize-space()='Patient Details']");
	public By pharmacyDetailTab = By.xpath("//label[normalize-space()='Pharmacy Detail']");
	public By providerDetailTab = By.xpath("//label[normalize-space()='Provider Detail']");
	public By drugDetailTab = By.xpath("//label[normalize-space()='Drug Detail']");

	// Inputs
	public By patientFilterInput = By.id("Filter_PatientId");
	public By drugFilterInput = By.id("Filter_DrugName");
	public By partnerFilterInput = By.id("Filter_BusinessName");
	public By receivedDateInput = By.name("ClinicalPriorAuthorization.ReceivedDate");
	public By submissionDateInput = By.name("ClinicalPriorAuthorization.SubmissionDate");
	public By submissionNoteInput = By.id("ClinicalPriorAuthorization_SubmissionNote");

	// CareGiver Name
	public By patientActionDropdown = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By caregiverEditOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[normalize-space()='Edit']");
	public By caregiverDeleteOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[normalize-space()='Delete']");
	public By newPatientCareGiverNameOption = By.xpath("//span[normalize-space()='New Patient Caregiver Name']");
	public By careGiverLastNameField = By.id("PatientCareGiverName_LastName");
	public By careGiverFirstNameField = By.id("PatientCareGiverName_FirstName");
	public By saveCareGiverPopupButton = By.id("btnSaveCareGiverNamePopup");
	public By finalSaveButton = By.id("btnSave");
	public By chkClinicalCareGiverNameAll = By.xpath("//label[@for='chkg21ClinicalCareGiverNameAll']");
	public By chkClinicalCareGiverNameAdd = By.xpath("//label[@for='chkg21ClinicalCareGiverNameAdd']");

	// Reports / CCM Encounter Log
	public By clinicalCCMLogAllLabel = By.xpath("//label[@for='chkg19ClinicalCCMLogAll']");
	public By clinicalCCMLogViewLabel = By.xpath("//label[@for='chkg19ClinicalCCMLogView']");

	// Reports / Call Log
	public By clinicalCallLogAllLabel = By.xpath("//label[@for='chkg19ClinicalCallLogAll']");
	public By clinicalCallLogViewLabel = By.xpath("//label[@for='chkg19ClinicalCallLogView']");

	// Patient / Provider Referral
	public By providerReferralAllLabel = By.xpath("//label[@for='chkg20ProviderReferralAll']");
	public By providerReferralViewLabel = By.xpath("//label[@for='chkg20ProviderReferralView']");
	public By referToNewProviderBtn = By.xpath("//img[@src='/Content/img/svg/refer_float.svg']");
	public By clinicalObjectiveComponentDd = By.id("ClinicalEncounter_ClinicalObjectiveComponentId");
	public By encounterStatusDd = By.id("ClinicalEncounter_EncounterStatus");
	public By saveEncounterBtn = By.id("btnEncounter");
	public By addReferralProviderIcon = By.xpath("//a[@id='addReferralProviderNamePopup']//img");
	public By providerRadioBtn = By.xpath("//li[@class='searchResult-li']//input[@type='radio'][1]");
	public By referralIssueTxt = By.id("ClinicalEncounter_ClinicalReferral_Issue");
	public By referralCategoryDd = By.id("ClinicalEncounter_ClinicalReferral_ReferralCategoryId");
	public By referBtn = By.xpath("//img[@src='/Content/img/svg/refer_float.svg']");
	public By patientBucketMenu = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By editPatientOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By clinicalEncountersBtn = By.xpath("//button[normalize-space()='Clinical Encounters']");
	public By addNewClinicalEncounterBtn = By.xpath("//button[normalize-space()='Add New Clinical Encounter']");
	public By referralHeader = By.xpath("//h1[normalize-space()='Referral']");

	// Reports / Medication Recommendation and Suggestions
	public By exportToExcelBtn = By.xpath("//span[normalize-space()='Export to Excel']");
	public By clinicalMedicationRecommendationAllLabel = By
			.xpath("//label[@for='chkg19ClinicalMedicationRecommandationAll']");
	public By clinicalMedicationRecommendationViewLabel = By
			.xpath("//label[@for='chkg19ClinicalMedicationRecommandationView']");

	// Patients / Clinical Encounter Review
	public By star1DrugHeading = By.xpath("//h1[normalize-space()='Medications Suggestion']");

	// Patients / Clinical Encounter
	public By clinicalEncounterAllLabel = By.xpath("//label[@for='chkg14ClinicalEncounterAll']");
	public By clinicalEncounterAddLabel = By.xpath("//label[@for='chkg15ClinicalEncounterAdd']");
	public By firstEncounterReviewIcon = By.xpath("//tbody/tr[1]/td[7]/div[1]/a[1]/img[1]");
	public By encounterDeleteOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[contains(text(),'Delete')]");
	public By encounterDropdownContainer = By
			.xpath("//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]");
	public By clinicalEncountersButton = By.xpath("//button[normalize-space()='Clinical Encounters']");
	public By addNewEncounterButton = By.xpath("//button[normalize-space()='Add New Clinical Encounter']");
	public By componentDropdown = By.id("ClinicalEncounter_ClinicalObjectiveComponentId");
	public By statusDropdown = By.id("ClinicalEncounter_EncounterStatus");
	public By saveEncounterButton = By.id("btnEncounter");
	public By patientActionMenuButton = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By patientEditOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[contains(text(),'Edit')]");
	public By encounterActionMenuButton = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By encounterEditOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[contains(text(),'Edit')]");
	public By encounterTypeDropdown = By.id("ClinicalEncounter_EncounterType");

	// SOAP Components
	public By newSoapComponentButton = By.xpath("//span[normalize-space()='New Clinical SOAP Components']");
	public By nameField = By.id("ClinicalObjectiveComponent_Name");
	public By typeDropdown = By.id("ClinicalObjectiveComponent_Type");
	public By clinicalObjectiveAllLabel = By.xpath("//label[@for='chkg14ClinicalObjectiveAll']");
	public By clinicalObjectiveAddLabel = By.xpath("//label[@for='chkg14ClinicalObjectiveAdd']");

	// Patients
	public By labelA = By.xpath("//label[normalize-space()='A']");
	public By newPatientButton = By.xpath("//span[normalize-space()='New Patient']");
	public By lastNameField = By.id("Patient_LastName");
	public By firstNameField = By.id("Patient_FirstName");
	public By birthDateField = By.id("Patient_BirthDate");
	public By todayDateInCalendar = By.cssSelector(".ui-datepicker-calendar .ui-state-highlight");
	public By addNewPatientButton = By.xpath("//button[normalize-space()='Add New Patient']");
	public By phoneNumberField = By.id("Patient_PhoneNumber");
	public By findPatientButton = By.id("btnFindPatient");
	public By existingPatientRadio = By.xpath("//input[@type='radio']");
	public By selectExistingPatientButton = By.xpath("//button[normalize-space()='Select Existing Patient']");
	public By clinicalPatientAllLabel = By.xpath("//label[@for='chkg13ClinicalPatientAll']");
	public By clinicalPatientAddLabel = By.xpath("//label[@for='chkg13ClinicalPatientAdd']");

	// CPT Code
	public By actionMenuButton = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By newCptCodeButton = By.xpath("//span[normalize-space()='New CPT Code']");
	public By cptCodeField = By.id("RPMStatus_Name");
	public By descriptionField = By.id("RPMStatus_Description");
	public By dropdownContainer = By
			.xpath("//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]");
	public By cptAllPermissioncheck = By.xpath("//label[@for='chkg40CPTCodeAll']");
	public By cptAddPermissioncheck = By.xpath("//label[@for='chkg40CPTCodeAdd']");
	public By cptCodeNameInput = By.xpath("//input[@id='CPTCode_Name']");
	public By newCptCodeBtn = By.xpath("//span[normalize-space()='New CPT Code']");
	public By cptCodeInput = By.id("CPTCode_Code");
	public By cptDescriptionInput = By.id("CPTCode_Description");
	public By saveCptBtn = By.id("btnSave");

	// RPM Status
	public By rpmStatusAllLabel = By.xpath("//label[@for='chkg39RPMStatusAll']");
	public By rpmStatusAddLabelcheck = By.xpath("//label[@for='chkg39RPMStatusAdd']");
	public By firstBucketMenu = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By newRPMStatusBtn = By.xpath("//span[normalize-space()='New RPM Status']");
	public By firstActionMenuBtn = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By newRpmStatusButton = By.xpath("//span[normalize-space()='New RPM Status']");
	public By firstRecordActionDropdown = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By deleteRpmStatusOption = By
			.xpath("//div[contains(@class,'gridRecordContext')]//span[contains(text(),'Delete')]");
	public By editRPMStatusOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By deleteRPMStatusOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	public By bucketDropIcon = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By newRPMStatusButton = By.xpath("//span[normalize-space()='New RPM Status']");
	public By rpmStatusNameInput = By.id("RPMStatus_Name");

	// Registered Device
	public By registeredDeviceAllLabel = By.xpath("//label[@for='chkg36RegisteredDeviceAll']");
	public By registeredDeviceAddLabel = By.xpath("//label[@for='chkg36RegisteredDeviceAdd']");
	public By viewActivityOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[normalize-space()='View Activity']");
	public By partnerDeallocationTab = By.xpath("//span[normalize-space()='Partner DeAllocation']");
	public By partnerAllocationTab = By.xpath("//span[normalize-space()='Partner Allocation']");
	public By apoloPharmacyRadioButton = By
			.xpath("//ul[@id='ulUsers']//input[@type='radio' and @data-name='Apolo Pharmacy']");
	public By providerDeallocationTab = By.xpath("//span[normalize-space()='Provider DeAllocation']");
	public By returnedDeviceCheckbox = By.xpath("//label[@for='IsReturnedProviderDevice']");
	public By confirmDeallocateButton = By.xpath("//button[@id='btnDeleteProviderDeviceConfirm']");
	public By providerAllocationTab = By.xpath("//span[normalize-space()='Provider Allocation']");
	public By firstProviderRadioButton = By.xpath("//ul[@id='ulUsers']//input[@type='radio'][1]");
	public By allocateButton = By.xpath("//button[@class='btn btn-primary']");
	public By historyOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[normalize-space()='History']");
	public By fileUploadInput = By.xpath("//input[@type='file']");
	public By uploadButton = By.xpath("//*[name()='path' and @id='Union_5']");
	public By downloadTemplateButton = By.xpath("//span[normalize-space()='Download Template']");
	public By newRegisteredDeviceButton = By.xpath("//span[normalize-space()='New Registered Device']");
	public By deviceDropdown = By.id("RegisteredDevice_DeviceId");
	public By imeiField = By.id("RegisteredDevice_IMEI");
	public By serialNumberField = By.id("RegisteredDevice_SerialNumber");

	// Device Master
	public By deviceMasterAllLabel = By.xpath("//label[@for='chkg35DeviceMasterAll']");
	public By deviceMasterViewLabel = By.xpath("//label[@for='chkg35DeviceMasterView']");
	public By deviceMasterDescriptionField = By.id("DeviceMaster_Description");
	public By saveDeviceMasterButton = By.id("btnSaveDeviceMaster");

	// Encounter Status
	public By encounterStatusAllLabel = By.xpath("//label[@for='chkg27EncounterStatusAll']");
	public By encounterStatusAddLabel = By.xpath("//label[@for='chkg27EncounterStatusAdd']");
	public By newEncounterStatusButton = By.xpath("//span[normalize-space()='New Encounter Status']");
	public By encounterStatusNameField = By.id("ClinicalEncounterStatus_Name");

	// ROS Group Type
	public By rosGroupTypeAllLabel = By.xpath("//label[@for='chkg27ROSGroupTypeAll']");
	public By rosGroupTypeAddLabel = By.xpath("//label[@for='chkg27ROSGroupTypeAdd']");
	public By newROSGroupTypeButton = By.xpath("//span[normalize-space()='New ROS Group Type']");
	public By rosGroupTypeNameField = By.id("ROSGroupType_Name");

	// Remote Monitoring Parameters (RMP)
	public By newRMPButton = By.xpath("//span[normalize-space()='New Remote Monitoring Parameter']");
	public By rmpNameField = By.id("RemoteMonitoringParameter_Name");
	public By remoteMonitoringAllLabel = By.xpath("//label[@for='chkg27RemoteMonitoringParameterAll']");
	public By remoteMonitoringAddLabel = By.xpath("//label[@for='chkg27RemoteMonitoringParameterAdd']");

	// Outcome Action
	public By clinicalOutcomeAllLabel = By.xpath("//label[@for='chkg27ClinicalOutcomeOfActionAll']");
	public By clinicalOutcomeAddLabel = By.xpath("//label[@for='chkg27ClinicalOutcomeOfActionAdd']");
	public By newOutcomeActionButton = By.xpath("//span[normalize-space()='New Outcome Action']");
	public By outcomeActionNameField = By.id("OutcomeAction_Name");

	// ROS
	public By rosAllLabel = By.xpath("//label[@for='chkg26ROSAll']");
	public By rosAddLabel = By.xpath("//label[@for='chkg26ROSAdd']");
	public By newROSButton = By.xpath("//span[normalize-space()='New ROS Information']");
	public By rosNameField = By.id("ROS_Name");
	public By ROSbucketMenuIcon = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By ROSeditOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[normalize-space()='Edit']");
	public By ROSdeleteOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[normalize-space()='Delete']");

	// Clinical Intervention
	public By clinicalInterventionAllLabel = By.xpath("//label[@for='chkg26ClinicalInterventionAll']");
	public By clinicalInterventionAddLabel = By.xpath("//label[@for='chkg26ClinicalInterventionAdd']");
	public By deleteConfirmButton = By.xpath("//div[@id='deleteEmployeeModel']//button[@id='btnDeleteConfirm']");
	public By newClinicalInterventionBtn = By.xpath("//span[normalize-space()='New Clinical Intervention']");
	public By clinicalInterventionNameField = By.id("ClinicalIntervention_Name");
	public By clinicalInterventionCreatedText = By.xpath("//*[contains(text(),'Medication Adjustment')]");
	public By bucketMenuIcon = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By clinicalInterventioneditOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[normalize-space()='Edit']");
	public By clinicalInterventiondeleteOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[normalize-space()='Delete']");

	// Community Resource
	public By selectAllCommunityResourceCheckbox = By.xpath("//label[@for='chkg26CommunityResourceAll']");
	public By addCommunityResourceCheckbox = By.xpath("//label[@for='chkg26CommunityResourceAdd']");
	public By kebabMenuBtn = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By CommunityResourceeditOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By CommunityResourcedeleteOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	public By newCommunityResourceButton = By.xpath("//span[normalize-space()='New Community Resource']");
	public By communityResourceNameInput = By.id("CommunityResource_Name");

	// Barriers
	public By newBarrierButton = By.xpath("//span[normalize-space()='New Barriers']");
	public By barrierNameInput = By.id("Barrier_Name");
	public By selectAllBarriersCheckbox = By.xpath("//label[@for='chkg26BarrierAll']");
	public By addBarriersCheckbox = By.xpath("//label[@for='chkg26BarrierAdd']");

	// Goals Of Treatment
	public By selectAllGoalsOfTreatmentCheckbox = By.xpath("//label[@for='chkg26GoalsOfTreatmentAll']");
	public By addGoalsOfTreatmentCheckbox = By.xpath("//label[@for='chkg26GoalsOfTreatmentAdd']");
	public By goalInput = By.id("GoalsOfTreatment_Goal1");
	public By newGoalsButton = By.xpath("//span[normalize-space()='New Goals Of Treatment']");
	public By diseaseNameInput = By.id("GoalsOfTreatment_DiseaseName");

	// Prior Authorization Types
	public By selectAllPATypesCheckbox = By.xpath("//label[@for='chkg24PATypesAll']");
	public By addPATypesCheckbox = By.xpath("//label[@for='chkg24PATypesAdd']");
	public By confirmDeleteButton = By.id("btnDeleteConfirm");
	public By newPriorAuthBtn = By.xpath("//span[normalize-space()='New Prior Authorization Type']");
	public By rxHealthCardCheckbox = By.id("PriorAuthorizationType_IsRxHealthCard");
	public By newPriorAuthButton = By.xpath("//span[normalize-space()='New Prior Authorization Type']");
	public By priorAuthNameInput = By.id("PriorAuthorizationType_Name");
	public By RPMStatussaveButton = By.id("btnSave");
	public By actionMenuIcon = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By RPMStatuseditOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[contains(text(),'Edit')]");
	public By deleteOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[contains(text(),'Delete')]");

	// Component Information
	public By btnSave = By.id("btnSave");
	public By errorHeader = By.xpath("//h2[normalize-space()='Error']");

	// Audit View
	public By createdDateColumn = By.xpath("//a[normalize-space()='Created Date']");
	public By updatedByColumn = By.xpath("//a[normalize-space()='Updated By']");

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

	// General
	public clinicalpage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// Patient
	public String clinicalEncounterBlankSubmissionValidation() {

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(firstRowActionIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(clinicalEncountersBtn)).click();
		wait.until(ExpectedConditions.elementToBeClickable(addNewClinicalEncounterBtn)).click();
		wait.until(ExpectedConditions.elementToBeClickable(encounterButton)).click();

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

	public String addPatientCaregiverInvalidPhoneValidation() {

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(firstRowActionIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newPatientCareGiverNameOption)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientCareGiverNamePhoneInput))
				.sendKeys(Hooks.prop.getProperty("patient.phonenumber.invalidvalue"));
		wait.until(ExpectedConditions.elementToBeClickable(saveCareGiverNamePopupButton)).click();

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

	public String caregiverNameBlankSubmissionValidation() {

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(firstRowActionIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newPatientCareGiverNameOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(saveCareGiverNamePopupButton)).click();

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

	public String invalidEmailPhoneCellZipValidation() {

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(firstRowActionIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.visibilityOfElementLocated(patientEmailIdInput))
				.sendKeys(Hooks.prop.getProperty("patient.emailid.invalidvalue"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientZipCodeInput))
				.sendKeys(Hooks.prop.getProperty("patient.zipcode.invalidvalue"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientPhoneNumberInput))
				.sendKeys(Hooks.prop.getProperty("patient.phonenumber.invalidvalue"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientSecondaryPhoneNumberInput))
				.sendKeys(Hooks.prop.getProperty("patient.secondaryphonenumber.invalidvalue"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientLegalGuardianPhoneInput))
				.sendKeys(Hooks.prop.getProperty("patient.legalguardianphone.invalidvalue"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientHeadOfHouseholdPhoneInput))
				.sendKeys(Hooks.prop.getProperty("patient.headofhouseholdphone.invalidvalue"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientCellNumberInput))
				.sendKeys(Hooks.prop.getProperty("patient.cellnumber.invalidvalue"));
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

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

	public String blankPatientSearchValidationSearchSelectAdd() {

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newPatientButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(findPatientButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectExistingPatientButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(addNewPatientButton)).click();

		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
			String actualMessage = toast.getText().trim();
			return "SUCCESS: Validation displayed -> " + actualMessage;
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}

	}

	public String filterValidationInvalidContactData() {

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(profilefilterButton)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(filterFirstNameInput))
				.sendKeys(Hooks.prop.getProperty("filter.firstname.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(filterLastNameInput))
				.sendKeys(Hooks.prop.getProperty("filter.lastname.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(filterBirthDateInput))
				.sendKeys(Hooks.prop.getProperty("filter.birthdate.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(filterPhoneNumberInput))
				.sendKeys(Hooks.prop.getProperty("filter.phonenumber.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(filterCellNumberInput))
				.sendKeys(Hooks.prop.getProperty("filter.cellnumber.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(filterZipCodeInput))
				.sendKeys(Hooks.prop.getProperty("filter.zipcode.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(filterEmailIdInput))
				.sendKeys(Hooks.prop.getProperty("filter.emailid.value"));
		wait.until(ExpectedConditions.elementToBeClickable(searchFilterButton)).click();

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

	public String validationMessageShouldBeDisplayed() {

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(profilefilterButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(searchFilterButton)).click();

		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
			String actualMessage = toast.getText().trim();
			return "SUCCESS: Validation displayed -> " + actualMessage;
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}

	}

	// Audit View
	public void openClinicalPriorAuthorizationsPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Clinical/Home/ClinicalPriorAuthorizations"));
	}

	public void verifyGeneralAuditViewSettings() {
		sleep(2000);
		Assert.assertTrue("Created Date column is not visible",
				wait.until(ExpectedConditions.visibilityOfElementLocated(createdDateColumn)).isDisplayed());
		sleep(2000);
		Assert.assertTrue("Updated By column is not visible",
				wait.until(ExpectedConditions.visibilityOfElementLocated(updatedByColumn)).isDisplayed());
	}

	public void cannotViewGeneralAuditViewInClinicalModule() {
		try {
			boolean createdDateVisible = driver.findElements(createdDateColumn).size() > 0;
			Assert.assertFalse("Created Date column should not be visible", createdDateVisible);
			boolean updatedByVisible = driver.findElements(updatedByColumn).size() > 0;
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
	public String verifyBlankPriorAuthorizationError() {

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newClinicalPABtn)).click();

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

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

	public String clinicalSOAPRequiredFieldValidation() {

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newSoapComponentButton)).click();

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

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
		driver.findElement(priorAuthNameInput).sendKeys(Hooks.prop.getProperty("priorauth.name"));
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
		driver.findElement(goalInput).sendKeys(Hooks.prop.getProperty("goal.value"));
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(diseaseNameInput))
				.sendKeys(Hooks.prop.getProperty("disease.value"));
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(barrierNameInput))
				.sendKeys(Hooks.prop.getProperty("barrier.value"));
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(barrierNameInput))
				.sendKeys(Hooks.prop.getProperty("barrier.value"));
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
		driver.findElement(communityResourceNameInput).sendKeys(Hooks.prop.getProperty("community.resource.value"));
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
				.sendKeys(Hooks.prop.getProperty("community.resource.value"));
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	// ==== Utility Methods ====
	private void selectDropdownByIndexWhenReady(By locator, int index) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		Select dropdown = new Select(dropdownElement);
		waitUntilDropdownHasOptions(dropdown);
		dropdown.selectByIndex(index);
	}

	private void waitUntilDropdownHasOptions(Select dropdown) {
		for (int i = 0; i < 10; i++) {
			List<WebElement> options = dropdown.getOptions();
			if (options.size() > 1)
				return;
			sleep(1000);
		}
		throw new TimeoutException("Dropdown options not loaded in time.");
	}

	public void assertElementPresent(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (TimeoutException e) {
			Assert.fail("Element not present after wait: " + locator.toString());
		}
	}

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

	// Clinical Intervention
	public void verifyAddEditDisabledForClinicalIntervention() {
		assertElementNotPresent(newClinicalInterventionBtn);
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		assertElementNotPresent(editOption);
	}

	public void validateDeleteClinicalInterventionAccess() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(clinicalInterventiondeleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteConfirmButton)).click();
	}

	public void validateNoAddOrDeleteAccessForClinicalIntervention() {
		assertElementNotPresent(newClinicalInterventionBtn);
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		assertElementNotPresent(deleteOption);
	}

	public void validateEditClinicalInterventionAccess() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(clinicalInterventionNameField));
		nameField.clear();
		nameField.sendKeys(Hooks.prop.getProperty("name.field.value"));
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void setupDeleteAccessForClinicalInterventionProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void setupEditAccessForClinicalInterventionProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createProfileWithAddAccessOnlyToClinicalIntervention() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement clinicalInterventionAll = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalInterventionAllLabel));
		clinicalInterventionAll.click();
		sleep(2000);
		WebElement clinicalInterventionAdd = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalInterventionAddLabel));
		clinicalInterventionAdd.click();
		sleep(2000);

	}

	public void verifyEditDeleteDisabledForClinicalIntervention() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		sleep(2000);
		assertElementNotPresent(clinicalInterventioneditOption);
		sleep(2000);
		assertElementNotPresent(clinicalInterventiondeleteOption);
	}

	public void validateAddClinicalInterventionAccess() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(newClinicalInterventionBtn)).click();
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(clinicalInterventionNameField))
				.sendKeys(Hooks.prop.getProperty("clinical.intervention.value"));
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(clinicalInterventionCreatedText));
	}

	// ROS
	public void verifyAddEditDisabledForROS() {
		assertElementNotPresent(newROSButton);
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		assertElementNotPresent(editOption);
	}

	public void verifyUserCanDeleteROS() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteConfirmButton)).click();
	}

	public void setupDeleteAccessForROSProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void setupEditAccessForROSProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyAddDeleteDisabledForROS() {
		assertElementNotPresent(newROSButton);
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		assertElementNotPresent(deleteOption);
	}

	public void verifyUserCanEditROS() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(rosNameField));
		nameField.clear();
		nameField.sendKeys(Hooks.prop.getProperty("name.field.value"));
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void setupAddAccessForROSProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement rosAll = wait.until(ExpectedConditions.elementToBeClickable(rosAllLabel));
		rosAll.click();
		WebElement rosAdd = wait.until(ExpectedConditions.elementToBeClickable(rosAddLabel));
		rosAdd.click();

	}

	public void verifyEditDeleteDisabledForROS() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(ROSbucketMenuIcon)).click();
		sleep(2000);
		assertElementNotPresent(ROSeditOption);
		sleep(2000);
		assertElementNotPresent(ROSdeleteOption);
	}

	public void verifyUserCanAddROS() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(newROSButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(rosNameField))
				.sendKeys(Hooks.prop.getProperty("ros.name.value"));
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
		sleep(2000);

	}

	// Outcome Action
	public void verifyAddEditDisabledForOutcomeAction() {
		assertElementNotPresent(newOutcomeActionButton);
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		assertElementNotPresent(editOption);
	}

	public void validateDeleteOutcomeActionAccess() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteConfirmButton)).click();
	}

	public void verifyUserCannotAddOrDeleteOutcomeAction() {
		assertElementNotPresent(newOutcomeActionButton);
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		assertElementNotPresent(deleteOption);
	}

	public void verifyUserCanEditOutcomeAction() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(outcomeActionNameField));
		nameField.clear();
		nameField.sendKeys(Hooks.prop.getProperty("name.field.value"));
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void setupEditAccessForOutcomeActionProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void setupDeleteAccessForOutcomeActionProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void setupAddAccessForOutcomeActionProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement clinicalOutcomeAll = wait.until(ExpectedConditions.elementToBeClickable(clinicalOutcomeAllLabel));
		clinicalOutcomeAll.click();
		sleep(2000);
		WebElement clinicalOutcomeAdd = wait.until(ExpectedConditions.elementToBeClickable(clinicalOutcomeAddLabel));
		clinicalOutcomeAdd.click();

	}

	public void verifyUserCannotEditOrDeleteOutcomeAction() {
		sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		sleep(4000);
		assertElementNotPresent(editOption);
		assertElementNotPresent(deleteOption);
	}

	public void verifyUserCanAddOutcomeAction() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(newOutcomeActionButton)).click();
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(outcomeActionNameField))
				.sendKeys(Hooks.prop.getProperty("outcome.action.value"));
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	// Remote Monitoring Parameters (RMP)

	public String addPatientRemoteMonitoringBlankValidation() {

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newRpmButton)).click();

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(nextButtonrm)).click();

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

	public void verifyUserCannotAddOrEditRMP() {
		assertElementNotPresent(newRMPButton);
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		assertElementNotPresent(editOption);
	}

	public void verifyUserCanDeleteRMP() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteConfirmButton)).click();
	}

	public void setupDeleteAccessForRMPProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createRMPProfileWithEditAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyAddDeleteDisabledForRMP() {
		assertElementNotPresent(newRMPButton);
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		assertElementNotPresent(deleteOption);
	}

	public void verifyUserCanEditRMP() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(rmpNameField));
		nameField.clear();
		nameField.sendKeys(Hooks.prop.getProperty("name.field.value"));
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void setupAddAccessForRMPProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement remoteMonitoringAll = wait.until(ExpectedConditions.elementToBeClickable(remoteMonitoringAllLabel));
		remoteMonitoringAll.click();
		sleep(2000);
		WebElement remoteMonitoringAdd = wait.until(ExpectedConditions.elementToBeClickable(remoteMonitoringAddLabel));
		remoteMonitoringAdd.click();

	}

	public void verifyEditDeleteDisabledForRMP() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		sleep(3000);
		assertElementNotPresent(editOption);
		assertElementNotPresent(deleteOption);
	}

	public void verifyUserCanAddRMP() {
		sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(newRMPButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(rmpNameField))
				.sendKeys(Hooks.prop.getProperty("rmp.name.value"));
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	// ROS Group Type
	public void createEncounterStatusProfileWithDeleteAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createEncounterStatusProfileWithEditAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyAddDeleteDisabledForEncounterStatus() {
		assertElementNotPresent(newEncounterStatusButton);
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		assertElementNotPresent(deleteOption);
	}

	public void verifyUserCanEditEncounterStatus() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(encounterStatusNameField));
		nameField.clear();
		nameField.sendKeys(Hooks.prop.getProperty("name.field.value"));
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void createEncounterStatusProfileWithAddAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement encounterStatusAll = wait.until(ExpectedConditions.elementToBeClickable(encounterStatusAllLabel));
		encounterStatusAll.click();
		sleep(2000);
		WebElement encounterStatusAdd = wait.until(ExpectedConditions.elementToBeClickable(encounterStatusAddLabel));
		encounterStatusAdd.click();

	}

	public void setupDeleteAccessForROSGroupTypeProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyAddEditDisabledForROSGroupType() {
		assertElementNotPresent(newROSGroupTypeButton);
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		assertElementNotPresent(editOption);
	}

	public void verifyUserCanDeleteROSGroupType() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteConfirmButton)).click();
	}

	public void verifyUserCannotAddOrDeleteROSGroupType() {
		assertElementNotPresent(newROSGroupTypeButton);
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		assertElementNotPresent(deleteOption);
	}

	public void verifyUserCanEditROSGroupType() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(rosGroupTypeNameField));
		nameField.clear();
		nameField.sendKeys(Hooks.prop.getProperty("name.field.value"));
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void verifyUserCannotEditOrDeleteROSGroupType() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		sleep(2000);
		assertElementNotPresent(editOption);
		assertElementNotPresent(deleteOption);
	}

	public void validateAddROSGroupTypeAccess() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(newROSGroupTypeButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(rosGroupTypeNameField))
				.sendKeys(Hooks.prop.getProperty("ros.group.type.value"));
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void setupEditAccessForROSGroupTypeProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void setupAddAccessForROSGroupTypeProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement rosGroupTypeAll = wait.until(ExpectedConditions.elementToBeClickable(rosGroupTypeAllLabel));
		rosGroupTypeAll.click();
		sleep(2000);
		WebElement rosGroupTypeAdd = wait.until(ExpectedConditions.elementToBeClickable(rosGroupTypeAddLabel));
		rosGroupTypeAdd.click();

	}

	// Encounter Status
	public void verifyUserCannotAddOrEditEncounterStatus() {
		assertElementNotPresent(newEncounterStatusButton);
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		assertElementNotPresent(editOption);
	}

	public void verifyUserCanDeleteEncounterStatus() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteConfirmButton)).click();
	}

	public void verifyUserCanAddEncounterStatus() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(newEncounterStatusButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(encounterStatusNameField))
				.sendKeys(Hooks.prop.getProperty("encounter.status.value"));
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void verifyEditDeleteDisabledForEncounterStatus() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		sleep(2000);
		assertElementNotPresent(editOption);
		assertElementNotPresent(deleteOption);
	}

	// Device Master
	public void verifyUserCanEditDeviceMaster() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		WebElement descriptionField = wait
				.until(ExpectedConditions.visibilityOfElementLocated(deviceMasterDescriptionField));
		descriptionField.clear();
		descriptionField.sendKeys(Hooks.prop.getProperty("description.field.value"));
		wait.until(ExpectedConditions.elementToBeClickable(saveDeviceMasterButton)).click();
	}

	public void createDeviceMasterEditOnlyProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void setupViewAccessForDeviceMasterProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement deviceMasterAll = wait.until(ExpectedConditions.elementToBeClickable(deviceMasterAllLabel));
		deviceMasterAll.click();
		sleep(2000);
		WebElement deviceMasterView = wait.until(ExpectedConditions.elementToBeClickable(deviceMasterViewLabel));
		deviceMasterView.click();

	}

	public void verifyUserCannotEditDeviceMaster() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		sleep(2000);
		assertElementNotPresent(editOption);
	}

	// Registered Device
	public void verifyUserCanDeallocateBusinessGroupRPMDevice() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(historyOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(partnerDeallocationTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(returnedDeviceCheckbox)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeallocateButton)).click();
	}

	public void validateViewRegisteredDeviceActivityAccess() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(viewActivityOption)).click();
	}

	public void verifyUserCanAllocateBusinessGroupRPMDevice() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(historyOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(partnerAllocationTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(apoloPharmacyRadioButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(allocateButton)).click();
	}

	public void verifyDeallocateRPMDeviceInClinicalModule() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(historyOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(providerDeallocationTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(returnedDeviceCheckbox)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeallocateButton)).click();
	}

	public void verifyAllocateRPMDeviceInClinicalModule() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(historyOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(providerAllocationTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(firstProviderRadioButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(allocateButton)).click();
	}

	public void verifyUserCanViewRegisteredDeviceHistory() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(historyOption)).click();
	}

	public void verifyUploadExcelForRegisteredDevice() {
		String filePath = Paths.get("src/test/resources/Documents/RegisteredDeviceTemplate.xlsx").toAbsolutePath()
				.toString();
		WebElement fileInput = wait.until(ExpectedConditions.visibilityOfElementLocated(fileUploadInput));
		fileInput.sendKeys(filePath);
		wait.until(ExpectedConditions.elementToBeClickable(uploadButton)).click();
	}

	public void verifyDownloadTemplateForRegisteredDevice() {
		wait.until(ExpectedConditions.elementToBeClickable(downloadTemplateButton)).click();
	}

	public void verifyAddEditDisabledForRegisteredDevice() {
		assertElementNotPresent(newRegisteredDeviceButton);
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		assertElementNotPresent(editOption);
	}

	public void createRegisteredDeviceFullAccessProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createRegisteredDeviceDeleteOnlyProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void validateDeleteRegisteredDeviceAccess() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteConfirmButton)).click();
	}

	public void verifyUserCannotEditOrDeleteRegisteredDevice() {
		sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		sleep(2000);
		assertElementNotPresent(editOption);
		assertElementNotPresent(deleteOption);
	}

	public void verifyAddDeleteDisabledForRegisteredDevice() {
		assertElementNotPresent(newRegisteredDeviceButton);
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		assertElementNotPresent(deleteOption);
	}

	public void verifyUserCanEditRegisteredDevice() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		WebElement deviceSelect = wait.until(ExpectedConditions.elementToBeClickable(deviceDropdown));
		new Select(deviceSelect).selectByIndex(2);
		WebElement imeiInput = wait.until(ExpectedConditions.visibilityOfElementLocated(imeiField));
		imeiInput.clear();
		imeiInput.sendKeys(Hooks.prop.getProperty("imei.value"));
		WebElement serialInput = wait.until(ExpectedConditions.visibilityOfElementLocated(serialNumberField));
		serialInput.clear();
		serialInput.sendKeys(Hooks.prop.getProperty("serial.value"));
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void createRegisteredDeviceEditOnlyProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createRegisteredDeviceAddOnlyProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement registeredDeviceAll = wait.until(ExpectedConditions.elementToBeClickable(registeredDeviceAllLabel));
		registeredDeviceAll.click();
		sleep(2000);
		WebElement registeredDeviceAdd = wait.until(ExpectedConditions.elementToBeClickable(registeredDeviceAddLabel));
		registeredDeviceAdd.click();

	}

	public void verifyUserCanAddRegisteredDevice() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(newRegisteredDeviceButton)).click();
		sleep(2000);
		WebElement deviceSelect = wait.until(ExpectedConditions.elementToBeClickable(deviceDropdown));
		new Select(deviceSelect).selectByIndex(1);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(imeiField))
				.sendKeys(Hooks.prop.getProperty("imei.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(serialNumberField))
				.sendKeys(Hooks.prop.getProperty("serial.value"));
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	// RPM Status
	public void verifyUserCannotAddEditRPMStatus() {
		sleep(3000);
		assertElementNotPresent(newRPMStatusBtn);
		clickWhenClickable(firstActionMenuBtn);
		sleep(2000);
		assertElementNotPresent(editRPMStatusOption);
	}

	public void verifyUserCanDeleteRPMStatus() {
		sleep(3000);
		clickWhenClickable(firstBucketMenu);
		sleep(2000);
		clickWhenClickable(deleteOption);
		sleep(2000);
		clickWhenClickable(deleteConfirmButton);
	}

	public void verifyAddAndDeleteAreDisabledForRPMStatus() {
		sleep(3000);
		assertElementNotPresent(newRpmStatusButton);
		clickWhenClickable(firstRecordActionDropdown);
		sleep(2000);
		assertElementNotPresent(deleteRpmStatusOption);
	}

	public void verifyUserCanEditRPMStatus() {
		sleep(3000);
		clickWhenClickable(bucketDropIcon);
		sleep(2000);
		clickWhenClickable(editOption);
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(rpmStatusNameInput))
				.sendKeys(Hooks.prop.getProperty("rpm.status.name.value"));
		clickWhenClickable(saveButton);
		sleep(2000);
	}

	public void verifyUserCannotEditOrDeleteRPMStatus() {
		sleep(3000);
		clickWhenClickable(bucketDropIcon);
		sleep(2000);
		assertElementNotPresent(editRPMStatusOption);
		assertElementNotPresent(deleteRPMStatusOption);
	}

	public void verifyUserCanAddRPMStatus() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(newRPMStatusButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(rpmStatusNameInput))
				.sendKeys(Hooks.prop.getProperty("rpm.status.value"));
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void createRPMStatusDeleteAccessProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createRPMStatusEditAccessProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createRPMStatusAddAccessProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement rpmStatusAll = wait.until(ExpectedConditions.elementToBeClickable(rpmStatusAllLabel));
		rpmStatusAll.click();
		sleep(2000);
		WebElement rpmStatusAdd = wait.until(ExpectedConditions.elementToBeClickable(rpmStatusAddLabel));
		rpmStatusAdd.click();

	}

	// CPT Code
	public void verifyAddAndEditAreNotAvailable() {
		if (driver.findElements(newCptCodeButton).size() > 0) {
			throw new AssertionError("New CPT Code button is visible but should NOT be available");
		}
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownContainer));
		if (driver.findElements(editOption).size() > 0) {
			throw new AssertionError("Edit option is visible but should NOT be available");
		}
	}

	public void deleteCptCode() {
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownContainer));
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteConfirmButton)).click();
	}

	public void createProfileWithDeleteOnlyAccessForClinicalModuleCptCode() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createProfileWithAddAccessOnlyToClinicalModuleCptCodeTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModules.click();
		sleep(2000);
		WebElement cptAllPermission = wait.until(ExpectedConditions.elementToBeClickable(cptAllPermissioncheck));
		cptAllPermission.click();
		sleep(2000);
		WebElement cptAddPermission = wait.until(ExpectedConditions.elementToBeClickable(cptAddPermissioncheck));
		cptAddPermission.click();
		sleep(2000);

	}

	public void verifyAddAndDeleteAreNotAvailable() {
		if (driver.findElements(newCptCodeButton).size() > 0) {
			throw new AssertionError("New CPT Code button is visible but should NOT be available");
		}
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownContainer));
		if (driver.findElements(deleteOption).size() > 0) {
			throw new AssertionError("Delete option is visible but should NOT be available");
		}
	}

	public void editCptCode() {
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(cptCodeField)).clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(cptCodeField))
				.sendKeys(Hooks.prop.getProperty("cpt.code.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(descriptionField)).clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(descriptionField))
				.sendKeys(Hooks.prop.getProperty("description.field.value"));
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void createProfileWithEditAccessOnlyToClinicalModuleCptCodeTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyEditAndDeleteAreNotAvailable() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]")));
		sleep(2000);
		if (driver.findElements(editOption).size() > 0) {
			throw new AssertionError("Edit option is visible but should NOT be available");
		}
		if (driver.findElements(deleteOption).size() > 0) {
			throw new AssertionError("Delete option is visible but should NOT be available");
		}
	}

	public void addCptCode() {
		sleep(4000);
		clickWhenClickable(newCptCodeBtn);
		sleep(4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(cptCodeNameInput))
				.sendKeys(Hooks.prop.getProperty("cpt.code.name.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(cptCodeInput))
				.sendKeys(Hooks.prop.getProperty("cpt.code.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(cptDescriptionInput))
				.sendKeys(Hooks.prop.getProperty("cpt.description.value"));
		sleep(2000);
		clickWhenClickable(saveCptBtn);
	}

	// Patients
	public void createProfileWithFullAccessForClinicalModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyAddAndEditNotAvailable() {
		if (driver.findElements(newPatientButton).size() > 0) {
			throw new AssertionError("New Patient button is visible but should NOT be available");
		}
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownContainer));
		if (driver.findElements(editOption).size() > 0) {
			throw new AssertionError("Edit option is visible but should NOT be available");
		}
	}

	public void deletePatient() {
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownContainer));
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteConfirmButton)).click();
	}

	public void createProfileWithDeleteOnlyAccessForPatientsModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createProfileWithEditOnlyAccessForPatientsModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyAddAndDeleteNotAvailable() {
		if (driver.findElements(newPatientButton).size() > 0) {
			throw new AssertionError("New Patient button is visible but should NOT be available");
		}
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownContainer));
		if (driver.findElements(deleteOption).size() > 0) {
			throw new AssertionError("Delete option is visible but should NOT be available");
		}
	}

	public void editPatient() {
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownContainer));
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(labelA)).click();
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void createProfileWithAddAccessOnlyToPatientsModuleTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement clinicalPatientAll = wait.until(ExpectedConditions.elementToBeClickable(clinicalPatientAllLabel));
		clinicalPatientAll.click();
		sleep(2000);
		WebElement clinicalPatientAdd = wait.until(ExpectedConditions.elementToBeClickable(clinicalPatientAddLabel));
		clinicalPatientAdd.click();
		sleep(2000);

	}

	public void verifyEditAndDeleteNotAvailable() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownContainer));
		sleep(2000);
		if (driver.findElements(editOption).size() > 0) {
			throw new AssertionError("Edit option is visible but should NOT be available");
		}
		if (driver.findElements(deleteOption).size() > 0) {
			throw new AssertionError("Delete option is visible but should NOT be available");
		}
	}

	public void addNewPatient() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(newPatientButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameField))
				.sendKeys(Hooks.prop.getProperty("last.name.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField))
				.sendKeys(Hooks.prop.getProperty("first.name.value"));
		sleep(2000);
		WebElement birthDate = wait.until(ExpectedConditions.elementToBeClickable(birthDateField));
		birthDate.click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(todayDateInCalendar)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(addNewPatientButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberField))
				.sendKeys(Hooks.prop.getProperty("phone.number.value"));
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void selectExistingPatient() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(newPatientButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameField))
				.sendKeys(Hooks.prop.getProperty("last.name.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField))
				.sendKeys(Hooks.prop.getProperty("first.name.value"));
		sleep(2000);
		WebElement birthDate = wait.until(ExpectedConditions.elementToBeClickable(birthDateField));
		birthDate.click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(todayDateInCalendar)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(findPatientButton)).click();
		sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(existingPatientRadio)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(selectExistingPatientButton)).click();
	}

	// SOAP Components
	public void shouldNotAllowAddingOrEditingSoapComponentsInClinicalModule() {
		if (driver.findElements(newSoapComponentButton).size() > 0) {
			throw new AssertionError("New SOAP Component button is visible but should NOT be available");
		}
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownContainer));
		if (driver.findElements(editOption).size() > 0) {
			throw new AssertionError("Edit option is visible but should NOT be available for SOAP Components");
		}
	}

	public void verifyUserCanDeleteSoapComponentsInClinicalModule() {
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownContainer));
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteConfirmButton)).click();
	}

	public void verifyUserCannotAddOrDeleteSoapComponentsInClinicalModule() {
		if (driver.findElements(newSoapComponentButton).size() > 0) {
			throw new AssertionError("New SOAP Component button is visible but should NOT be available");
		}
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownContainer));
		if (driver.findElements(deleteOption).size() > 0) {
			throw new AssertionError("Delete option is visible but should NOT be available for SOAP Components");
		}
	}

	public void verifyUserCanEditSoapComponentsInClinicalModule() {
		String newName = Hooks.prop.getProperty("name.field.value");
		int newTypeIndex = 2;
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownContainer));
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(nameField)).clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(nameField)).sendKeys(newName);
		WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(typeDropdown));
		Select select = new Select(dropdown);
		select.selectByIndex(newTypeIndex);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void createProfileWithDeleteOnlyAccessForSoapComponents() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createProfileWithEditOnlyAccessForSoapComponents() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrDeleteSoapComponentsInClinicalModule() {
		sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownContainer));
		sleep(2000);
		if (driver.findElements(editOption).size() > 0) {
			throw new AssertionError("Edit option is visible but should NOT be available for SOAP Components");
		}
		if (driver.findElements(deleteOption).size() > 0) {
			throw new AssertionError("Delete option is visible but should NOT be available for SOAP Components");
		}
	}

	public void addSoapComponent() {
		int typeIndex = 1;
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(newSoapComponentButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(nameField))
				.sendKeys(Hooks.prop.getProperty("component.name.value"));
		sleep(2000);
		WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(typeDropdown));
		sleep(2000);
		Select select = new Select(dropdown);
		select.selectByIndex(typeIndex);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void createProfileWithAddOnlyAccessForSoapComponents() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement clinicalObjectiveAll = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalObjectiveAllLabel));
		clinicalObjectiveAll.click();
		sleep(2000);
		WebElement clinicalObjectiveAdd = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalObjectiveAddLabel));
		clinicalObjectiveAdd.click();
		sleep(2000);

	}

	// Patients / Clinical Encounter
	public void verifyUserCannotAddOrEditPatientsClinicalEncounterInClinicalModule() {
		wait.until(ExpectedConditions.elementToBeClickable(patientActionMenuButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(patientEditOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(clinicalEncountersButton)).click();
		if (!driver.findElements(addNewEncounterButton).isEmpty()) {
			throw new AssertionError("Add New Clinical Encounter button is visible but should NOT be available");
		}
		wait.until(ExpectedConditions.elementToBeClickable(encounterActionMenuButton)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(encounterDropdownContainer));
		if (!driver.findElements(encounterEditOption).isEmpty()) {
			throw new AssertionError("Edit option is visible but should NOT be available for Clinical Encounters");
		}
	}

	public void deleteClinicalEncounter() {
		wait.until(ExpectedConditions.elementToBeClickable(patientActionMenuButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(patientEditOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(clinicalEncountersButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(encounterActionMenuButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(encounterDeleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteConfirmButton)).click();
	}

	public void createProfileWithDeleteAccessRestrictedToPatientsClinicalEncounter() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createProfileWithEditOnlyAccessForPatientsClinicalEncounter() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddOrDeletePatientsClinicalEncounterInClinicalModuleTest() {
		wait.until(ExpectedConditions.elementToBeClickable(patientActionMenuButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(patientEditOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(clinicalEncountersButton)).click();
		if (!driver.findElements(addNewEncounterButton).isEmpty()) {
			throw new AssertionError("Add New Clinical Encounter button is visible but should NOT be available");
		}
		wait.until(ExpectedConditions.elementToBeClickable(encounterActionMenuButton)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(encounterDropdownContainer));
		if (!driver.findElements(deleteOption).isEmpty()) {
			throw new AssertionError("Delete option is visible but should NOT be available for Clinical Encounters");
		}
	}

	public void editClinicalEncounter() {
		wait.until(ExpectedConditions.elementToBeClickable(patientActionMenuButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(patientEditOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(clinicalEncountersButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(encounterActionMenuButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(encounterEditOption)).click();
		WebElement typeDropdown = wait.until(ExpectedConditions.elementToBeClickable(encounterTypeDropdown));
		Select select = new Select(typeDropdown);
		select.selectByIndex(1);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void shouldNotAllowEditingOrDeletingPatientsClinicalEncounterInClinicalModule() {
		sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(clinicalEncountersButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownContainer));
		sleep(2000);
		if (driver.findElements(editOption).size() > 0) {
			throw new AssertionError("Edit option is visible but should NOT be available for Clinical Encounters");
		}
		if (driver.findElements(deleteOption).size() > 0) {
			throw new AssertionError("Delete option is visible but should NOT be available for Clinical Encounters");
		}
	}

	public void createProfileWithAddOnlyAccessForPatientsClinicalEncounter() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement clinicalEncounterAll = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalEncounterAllLabel));
		clinicalEncounterAll.click();
		sleep(2000);
		WebElement clinicalEncounterAdd = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalEncounterAddLabel));
		clinicalEncounterAdd.click();
		sleep(2000);

	}

	public void addClinicalEncounter() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(clinicalEncountersButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(addNewEncounterButton)).click();
		sleep(2000);
		WebElement componentDrop = wait.until(ExpectedConditions.elementToBeClickable(componentDropdown));
		Select componentSelect = new Select(componentDrop);
		componentSelect.selectByIndex(1);
		sleep(2000);
		WebElement statusDrop = wait.until(ExpectedConditions.elementToBeClickable(statusDropdown));
		Select statusSelect = new Select(statusDrop);
		statusSelect.selectByIndex(2);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveEncounterButton)).click();
	}

	// Patients / Clinical Encounter Review
	public void verifyUserCannotAccessPatientsClinicalEncounterReviewInClinicalModule() {
		wait.until(ExpectedConditions.elementToBeClickable(patientActionMenuButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(patientEditOption)).click();
		if (!driver.findElements(clinicalEncountersButton).isEmpty()) {
			throw new AssertionError("Clinical Encounters button is visible but should NOT be accessible");
		}
	}

	public void createProfileWithNoAccessForPatientsClinicalEncounterReview() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createProfileWithViewAndStar1DrugAccessForPatientsClinicalEncounterReview() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyStar1DrugIsVisible() {
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(star1DrugHeading));
		if (!driver.findElements(star1DrugHeading).isEmpty()) {
			System.out.println("Star1 Drug section is visible");
		} else {
			throw new AssertionError("Star1 Drug section is NOT visible");
		}
	}

	public void viewFirstClinicalEncounterReview() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(patientActionMenuButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(patientEditOption)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(clinicalEncountersButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(firstEncounterReviewIcon)).click();
	}

	// Reports / Status Log
	public void createProfileWithViewOnlyAccessToReportsStatusLog() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyDownloadNotAvailable() {
		assertElementNotPresent(exportToExcelButton);

	}

	public void createProfileWithViewAndDownloadAccessForReportsStatusLog() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void downloadReportFromStatusLog() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(exportToExcelButton)).click();
	}

	// Reports / Medication Recommendation and Suggestions
	public void iCreateAProfileWithViewButNoDownloadFileAccessToReportsMedicationRecommendationAndSuggestionsTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement clinicalMedicationRecommendationAll = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalMedicationRecommendationAllLabel));
		clinicalMedicationRecommendationAll.click();
		sleep(2000);
		WebElement clinicalMedicationRecommendationView = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalMedicationRecommendationViewLabel));
		clinicalMedicationRecommendationView.click();
		sleep(2000);

	}

	public void verifyUserCannotDownloadFilesFromReportsMedicationRecommendationAndSuggestionsInReportsModule() {
		sleep(3000);
		clickWhenClickable(exportToExcelBtn);
	}

	public void createProfileWithViewAndDownloadAccessToReportsMedicationRecommendationAndSuggestionsTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCanDownloadFilesFromReportsMedicationRecommendationAndSuggestionsInReportsModule() {
		sleep(3000);
		clickWhenClickable(exportToExcelBtn);
		sleep(2000);
	}

	// Reports / CCM Encounter Log
	public void createProfileWithViewAndDownloadAccessToReportsCCMEncounterLogTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotDownloadFilesFromReportsCCMEncounterLogInReportsModule() {
		sleep(3000);
		assertElementNotPresent(exportToExcelBtn);
	}

	public void createProfileWithViewOnlyAccessToReportsCCMEncounterLogTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement clinicalCCMLogAll = wait.until(ExpectedConditions.elementToBeClickable(clinicalCCMLogAllLabel));
		clinicalCCMLogAll.click();
		sleep(2000);
		WebElement clinicalCCMLogView = wait.until(ExpectedConditions.elementToBeClickable(clinicalCCMLogViewLabel));
		clinicalCCMLogView.click();
		sleep(2000);

	}

	public void verifyUserCanDownloadFilesFromReportsCCMEncounterLogInReportsModule() {
		sleep(3000);
		clickWhenClickable(exportToExcelBtn);
		sleep(2000);
	}

	// Reports / Call Log
	public void verifyUserCannotDownloadFilesFromReportsCallLogInReportsModule() {
		sleep(3000);
		assertElementNotPresent(exportToExcelBtn);
	}

	public void createProfileWithViewOnlyAccessToReportsCallLogTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement clinicalCallLogAll = wait.until(ExpectedConditions.elementToBeClickable(clinicalCallLogAllLabel));
		clinicalCallLogAll.click();
		sleep(2000);
		WebElement clinicalCallLogView = wait.until(ExpectedConditions.elementToBeClickable(clinicalCallLogViewLabel));
		clinicalCallLogView.click();
		sleep(2000);

	}

	public void createProfileWithViewAndDownloadAccessToReportsCallLogTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCanDownloadFilesFromReportsCallLogInReportsModule() {
		sleep(3000);
		clickWhenClickable(exportToExcelBtn);
		sleep(2000);
	}

	// Patient / Provider Referral
	public void verifyUserCannotReferToNewProviderInPatientProviderReferralInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(referToNewProviderBtn);
	}

	public void createProfileWithViewOnlyAccessToPatientProviderReferralTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement providerReferralAll = wait.until(ExpectedConditions.elementToBeClickable(providerReferralAllLabel));
		providerReferralAll.click();
		sleep(2000);
		WebElement providerReferralView = wait
				.until(ExpectedConditions.elementToBeClickable(providerReferralViewLabel));
		providerReferralView.click();
		sleep(2000);

	}

	public void verifyUserCanReferToNewProviderInPatientProviderReferralInClinicalModule() {
		sleep(3000);
		selectDropdownByIndexWhenReady(clinicalObjectiveComponentDd, 1);
		sleep(2000);
		selectDropdownByIndexWhenReady(encounterStatusDd, 2);
		sleep(2000);
		clickWhenClickable(saveEncounterBtn);
		sleep(2000);
		clickWhenClickable(addReferralProviderIcon);
		sleep(2000);
		clickWhenClickable(providerRadioBtn);
		sleep(2000);
		clickWhenClickable(selectProviderBtn);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(referralIssueTxt))
				.sendKeys(Hooks.prop.getProperty("referral.issue.value"));
		sleep(1000);
		selectDropdownByIndexWhenReady(referralCategoryDd, 2);
		sleep(2000);
		clickWhenClickable(referBtn);
	}

	public void createProfileWithViewAndReferredToNewProviderAccessForPatientProviderReferralTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCanViewPatientProviderReferralInClinicalModule() {
		sleep(3000);
		clickWhenClickable(patientBucketMenu);
		sleep(2000);
		clickWhenClickable(editPatientOption);
		sleep(3000);
		clickWhenClickable(clinicalEncountersBtn);
		sleep(3000);
		clickWhenClickable(addNewClinicalEncounterBtn);
		sleep(2000);
		assertElementPresent(referralHeader);
	}

	// CareGiver Name
	public void userShouldNotBeAbleToAddOrEditCareGiverNameInClinicalModule() {
		clickWhenClickable(patientActionDropdown);
		sleep(2000);
		clickWhenClickable(editOption);
		sleep(3000);
		Assert.assertTrue(driver.findElements(newPatientCareGiverNameOption).isEmpty());
		clickWhenClickable(patientActionDropdown);
		sleep(2000);
		Assert.assertTrue(driver.findElements(editOption).isEmpty());
	}

	public void deleteCareGiverNameInClinicalModule() {
		clickWhenClickable(patientActionDropdown);
		sleep(2000);
		clickWhenClickable(editOption);
		sleep(3000);
		clickWhenClickable(patientActionDropdown);
		sleep(2000);
		clickWhenClickable(deleteOption);
		sleep(2000);
		clickWhenClickable(confirmDeleteButton);
		sleep(1000);
	}

	public void createClinicalProfileWithCareGiverDeleteAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement providerReferralAll = wait.until(ExpectedConditions.elementToBeClickable(providerReferralAllLabel));
		providerReferralAll.click();
		sleep(2000);
		WebElement providerReferralView = wait
				.until(ExpectedConditions.elementToBeClickable(providerReferralViewLabel));
		providerReferralView.click();
		sleep(2000);

	}

	public void verifyUserCannotAddOrDeleteCareGiverNameInClinicalModule() {
		clickWhenClickable(patientActionDropdown);
		sleep(2000);
		clickWhenClickable(editOption);
		sleep(3000);
		Assert.assertTrue(driver.findElements(newPatientCareGiverNameOption).isEmpty());
		clickWhenClickable(patientActionDropdown);
		sleep(2000);
		Assert.assertTrue(driver.findElements(deleteOption).isEmpty());
	}

	public void verifyUserCanEditCareGiverNameInClinicalModule() {
		clickWhenClickable(patientActionDropdown);
		sleep(2000);
		clickWhenClickable(editOption);
		sleep(3000);
		clickWhenClickable(patientActionDropdown);
		sleep(2000);
		clickWhenClickable(editOption);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(careGiverLastNameField))
				.sendKeys(Hooks.prop.getProperty("caregiver.lastname.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(careGiverFirstNameField))
				.sendKeys(Hooks.prop.getProperty("caregiver.firstname.value"));
		clickWhenClickable(saveCareGiverPopupButton);
		sleep(1000);
		clickWhenClickable(finalSaveButton);
	}

	public void createClinicalProfileWithCareGiverEditAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement providerReferralAll = wait.until(ExpectedConditions.elementToBeClickable(providerReferralAllLabel));
		providerReferralAll.click();
		sleep(2000);
		WebElement providerReferralView = wait
				.until(ExpectedConditions.elementToBeClickable(providerReferralViewLabel));
		providerReferralView.click();
		sleep(2000);

	}

	public void createClinicalProfileWithCareGiverAddAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement providerReferralAll = wait
				.until(ExpectedConditions.elementToBeClickable(chkClinicalCareGiverNameAll));
		providerReferralAll.click();
		sleep(2000);
		WebElement providerReferralView = wait
				.until(ExpectedConditions.elementToBeClickable(chkClinicalCareGiverNameAdd));
		providerReferralView.click();
		sleep(2000);

	}

	public void verifyUserCanAddCareGiverNameInClinicalModule() {
		sleep(2000);
		clickWhenClickable(patientActionDropdown);
		sleep(2000);
		clickWhenClickable(editOption);
		sleep(3000);
		clickWhenClickable(newPatientCareGiverNameOption);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(careGiverLastNameField))
				.sendKeys(Hooks.prop.getProperty("caregiver.lastname.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(careGiverFirstNameField))
				.sendKeys(Hooks.prop.getProperty("caregiver.firstname.value"));
		clickWhenClickable(saveCareGiverPopupButton);
		sleep(2000);
		clickWhenClickable(finalSaveButton);
	}

	public void userShouldNotBeAbleToEditOrDeleteCareGiverNameInClinicalModule() {
		sleep(4000);
		clickWhenClickable(patientActionDropdown);
		sleep(2000);
		Assert.assertTrue(driver.findElements(caregiverEditOption).isEmpty());
		Assert.assertTrue(driver.findElements(caregiverDeleteOption).isEmpty());
	}

	// Prior Authorization
	public void verifyUserCannotAddOrDeletePriorAuthorizationInClinicalModule() {
		clickWhenClickable(patientActionDropdown);
		sleep(2000);
		Assert.assertTrue(driver.findElements(newPriorAuthorizationOption).isEmpty());
		clickWhenClickable(patientActionDropdown);
		sleep(2000);
		Assert.assertTrue(driver.findElements(deleteOption).isEmpty());
	}

	public void verifyUserCanEditPriorAuthorizationInClinicalModule() {
		clickWhenClickable(patientActionDropdown);
		sleep(2000);
		clickWhenClickable(editOption);
		sleep(2000);
		clickWhenClickable(progressStatusDropdown);
		selectDropdownByIndexWhenReady(progressStatusDropdown, 1);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(notesInput))
				.sendKeys(Hooks.prop.getProperty("notes.value"));
		clickWhenClickable(saveOutcomeNoteButton);
	}

	public void verifyUserCannotEditOrDeletePriorAuthorizationInClinicalModule() {
		sleep(2000);
		clickWhenClickable(patientActionDropdown);
		sleep(2000);
		Assert.assertTrue(driver.findElements(editOption).isEmpty());
		Assert.assertTrue(driver.findElements(deleteOption).isEmpty());
	}

	public void userCreatesProfileWithPriorAuthorizationEditAccessOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement providerReferralAll = wait.until(ExpectedConditions.elementToBeClickable(providerReferralAllLabel));
		providerReferralAll.click();
		sleep(2000);
		WebElement providerReferralView = wait
				.until(ExpectedConditions.elementToBeClickable(providerReferralViewLabel));
		providerReferralView.click();
		sleep(2000);

	}

	public void verifyUserCanAddPriorAuthorizationInClinicalModule() {
		sleep(4000);
		clickWhenClickable(newPriorAuthorizationButton);
		sleep(2000);
		clickWhenClickable(addPatientButton);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientFilterInput))
				.sendKeys(Hooks.prop.getProperty("patient.filter.value"));
		clickWhenClickable(searchPatientButton);
		sleep(2000);
		clickWhenClickable(selectFirstPatientRadio);
		sleep(1000);
		clickWhenClickable(confirmPatientButton);
		sleep(5000);
		clickWhenClickable(addDrugButton);
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(drugFilterInput))
				.sendKeys(Hooks.prop.getProperty("drug.filter.value"));
		clickWhenClickable(searchDrugButton);
		sleep(2000);
		clickWhenClickable(selectDrugRadio);
		sleep(1000);
		clickWhenClickable(confirmDrugButton);
		sleep(5000);
		clickWhenClickable(addProviderButton);
		sleep(4000);
		clickWhenClickable(selectProviderRadio);
		sleep(3000);
		clickWhenClickable(confirmProviderButton);
		sleep(4000);
		clickWhenClickable(addPartnerButton);
		sleep(3000);
		clickWhenClickable(fullSearchRadio);
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerFilterInput))
				.sendKeys(Hooks.prop.getProperty("partner.filter.value"));
		clickWhenClickable(searchPartnerButton);
		sleep(3000);
		clickWhenClickable(selectPartnerRadio);
		sleep(3000);
		clickWhenClickable(confirmPartnerButton);
		sleep(3000);
		WebElement receivedDate = driver.findElement(receivedDateInput);
		receivedDate.clear();
		receivedDate.sendKeys(Hooks.prop.getProperty("received.date.value"));
		receivedDate.sendKeys(Keys.TAB);
		sleep(2000);
		clickWhenClickable(saveButton);
		sleep(2000);
		clickWhenClickable(patientDetailsTab);
		clickWhenClickable(pharmacyDetailTab);
		clickWhenClickable(providerDetailTab);
		clickWhenClickable(drugDetailTab);
		clickWhenClickable(verifyButton);
		sleep(2000);
		clickWhenClickable(pendingSaveButton);
		sleep(2000);
		WebElement submissionDate = driver.findElement(submissionDateInput);
		submissionDate.clear();
		submissionDate.sendKeys(Hooks.prop.getProperty("submission.date.value"));
		submissionDate.sendKeys(Keys.TAB);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(submissionNoteInput))
				.sendKeys(Hooks.prop.getProperty("submission.note.value"));
		clickWhenClickable(saveSubmissionButton);
	}

	public void createClinicalProfileWithPriorAuthorizationAddAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement providerReferralAll = wait
				.until(ExpectedConditions.elementToBeClickable(priorAuthorizationProcessAllLabel));
		providerReferralAll.click();
		sleep(2000);
		WebElement providerReferralView = wait
				.until(ExpectedConditions.elementToBeClickable(priorAuthorizationGenerateAddLabel));
		providerReferralView.click();
		sleep(2000);

	}

	public void createClinicalProfileWithFullPriorAuthorizationAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement providerReferralAll = wait.until(ExpectedConditions.elementToBeClickable(providerReferralAllLabel));
		providerReferralAll.click();
		sleep(2000);
		WebElement providerReferralView = wait
				.until(ExpectedConditions.elementToBeClickable(providerReferralViewLabel));
		providerReferralView.click();
		sleep(2000);

	}

	public void createClinicalProfileWithPriorAuthorizationDeleteAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement providerReferralAll = wait.until(ExpectedConditions.elementToBeClickable(providerReferralAllLabel));
		providerReferralAll.click();
		sleep(2000);
		WebElement providerReferralView = wait
				.until(ExpectedConditions.elementToBeClickable(providerReferralViewLabel));
		providerReferralView.click();
		sleep(2000);

	}

	public void deletePriorAuthorizationInClinicalModule() {
		clickWhenClickable(patientActionDropdown);
		sleep(2000);
		clickWhenClickable(deleteOption);
		sleep(2000);
		clickWhenClickable(confirmDeleteButton);
	}

	public void verifyUserCannotAddOrEditPriorAuthorizationInClinicalModule() {
		sleep(3000);
		clickWhenClickable(patientActionDropdown);
		sleep(2000);
		Assert.assertTrue(driver.findElements(newPriorAuthorizationOption).isEmpty());
		clickWhenClickable(patientActionDropdown);
		sleep(2000);
		Assert.assertTrue(driver.findElements(editOption).isEmpty());
	}

	public void userShouldBeAbleToExportExcelInClinicalModule() {
		clickWhenClickable(exportToExcelButton);
		sleep(2000);
	}

	public void userShouldBeAbleToArchiveInClinicalModule() {
		sleep(3000);
		clickWhenClickable(archiveButton);
	}

	public void userShouldBeAbleToUnarchiveInClinicalModule() {
		sleep(3000);
		clickWhenClickable(filterButton);
		sleep(1000);
		clickWhenClickable(showAllRecordsCheckbox);
		clickWhenClickable(searchFilterButton);
		sleep(1000);
		clickWhenClickable(unarchiveButton);
		sleep(1000);
		clickWhenClickable(confirmUnarchiveButton);
	}

	// Med Recons
	public String clinicalMedReconBlankSubmissionValidation() {
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newClinicalMedRecons)).click();
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
		String messages = collectToastMessages();
		if (messages != null) {
			return "SUCCESS: Validations displayed -> " + messages;
		}
		wait.until(ExpectedConditions.elementToBeClickable(addMedsOnChartButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(patientCareGiverNamePhoneNumberInput)).click();
		messages = collectToastMessages();
		if (messages != null) {
			return "SUCCESS: Validations displayed -> " + messages;
		}
		wait.until(ExpectedConditions.elementToBeClickable(addCurrentMedication)).click();
		wait.until(ExpectedConditions.elementToBeClickable(firstRowActionSvgPath)).click();
		messages = collectToastMessages();
		if (messages != null) {
			return "SUCCESS: Validations displayed -> " + messages;
		}
		wait.until(ExpectedConditions.elementToBeClickable(pullMedsOnChartSpan)).click();
		messages = collectToastMessages();
		if (messages != null) {
			return "SUCCESS: Validations displayed -> " + messages;
		}
		wait.until(ExpectedConditions.elementToBeClickable(pullCurrentMedicationSpan)).click();
		messages = collectToastMessages();
		if (messages != null) {
			return "SUCCESS: Validations displayed -> " + messages;
		}
		return "ERROR: Validation toast message(s) not displayed";
	}

	private String collectToastMessages() {
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			return toasts.stream().filter(WebElement::isDisplayed).map(t -> t.getText().trim())
					.collect(Collectors.joining(" | "));
		} catch (TimeoutException e) {
			return null;
		}
	}

	public void userShouldBeAbleToAccessDownloadFileInClinicalModule() {
		clickWhenClickable(downloadFileButton);
		sleep(3000);
		clickWhenClickable(currentMedicationCheckbox);
		clickWhenClickable(confirmDownloadButton);
	}

	public void createClinicalProfileWithDownloadFileAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createClinicalProfileWithMedReconsDeleteAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddOrEditMedReconsInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(newMedReconsButton);
		assertElementNotPresent(medReconsEditButton);
	}

	public void userShouldBeAbleToDeleteMedReconsInClinicalModule() {
		clickWhenClickable(medReconsDeleteButton);
		sleep(1000);
		clickWhenClickable(confirmMedReconsDeleteButton);
	}

	public void createClinicalProfileWithMedReconsAddAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement providerReferralAll = wait.until(ExpectedConditions.elementToBeClickable(providerReferralAllLabel));
		providerReferralAll.click();
		sleep(2000);
		WebElement providerReferralView = wait
				.until(ExpectedConditions.elementToBeClickable(providerReferralViewLabel));
		providerReferralView.click();
		sleep(2000);

	}

	public void userShouldBeAbleToAddMedReconsInClinicalModule() {
		clickWhenClickable(newMedReconsButton);
		sleep(3000);
		clickWhenClickable(encounterStatusDropdown);
		sleep(1000);
		selectDropdownByIndexWhenReady(encounterStatusDropdown, 2);
		sleep(1000);
		clickWhenClickable(addPatientPopupIcon);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientIdFilterInput))
				.sendKeys(Hooks.prop.getProperty("patient.id.filter.value"));
		clickWhenClickable(patientSearchButton);
		sleep(2000);
		clickWhenClickable(selectPatientRadioButton);
		clickWhenClickable(confirmPatientButton);
		sleep(1000);
		clickWhenClickable(saveMedReconsButton);
	}

	public void userShouldNotBeAbleToEditOrDeleteMedReconsInClinicalModule() {
		assertElementNotPresent(medReconsEditButton);
		assertElementNotPresent(medReconsDeleteButton);
		assertElementNotPresent(medReconsArchiveButton);
	}

	// Med Recons / Meds On Chart
	public void userShouldNotBeAbleToAddOrEditMedReconsMedsOnChartInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(addMedsOnChartButton);
		assertElementNotPresent(deleteMedsOnChartButton);
	}

	public void userShouldBeAbleToDeleteMedReconsMedsOnChartInClinicalModule() {
		clickWhenClickable(newMedReconsButton);
		sleep(3000);
		clickWhenClickable(encounterStatusDropdown);
		sleep(1000);
		selectDropdownByIndexWhenReady(encounterStatusDropdown, 2);
		sleep(1000);
		clickWhenClickable(addPatientPopupIcon);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientIdFilterInput))
				.sendKeys(Hooks.prop.getProperty("patient.id.filter.value"));
		clickWhenClickable(patientSearchButton);
		sleep(2000);
		clickWhenClickable(selectPatientRadioButton);
		clickWhenClickable(confirmPatientButton);
		sleep(1000);
		clickWhenClickable(addMedsOnChartButton);
		sleep(1000);
		clickWhenClickable(addDrugPopupIcon);
		sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(drugNameFilterInput))
				.sendKeys(Hooks.prop.getProperty("drug.name.filter.value"));
		clickWhenClickable(drugSearchButton);
		sleep(1000);
		clickWhenClickable(selectDrugRadioButton);
		clickWhenClickable(confirmDrugButton);
		clickWhenClickable(addDrugToChartButton);
		sleep(1000);
		clickWhenClickable(deleteMedsOnChartButton);
		sleep(1000);
		clickWhenClickable(confirmDeleteMedsOnChartButton);
		sleep(1000);
		clickWhenClickable(saveMedsOnChartButton);
	}

	public void createClinicalProfileWithMedReconsMedsOnChartDeleteAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddOrDeleteMedReconsMedsOnChartInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(addMedsOnChartButton);
		assertElementNotPresent(deleteMedsOnChartButton);
	}

	public void userShouldBeAbleToEditMedReconsMedsOnChartInClinicalModule() {
		clickWhenClickable(newMedReconsButton);
		sleep(3000);
		clickWhenClickable(encounterStatusDropdown);
		sleep(1000);
		selectDropdownByIndexWhenReady(encounterStatusDropdown, 2);
		sleep(1000);
		clickWhenClickable(addPatientPopupIcon);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientIdFilterInput))
				.sendKeys(Hooks.prop.getProperty("patient.id.filter.value"));
		clickWhenClickable(patientSearchButton);
		sleep(2000);
		clickWhenClickable(selectPatientRadioButton);
		clickWhenClickable(confirmPatientButton);
		sleep(1000);
		clickWhenClickable(addMedsOnChartButton);
		sleep(1000);
		clickWhenClickable(addDrugPopupIcon);
		sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(drugNameFilterInput))
				.sendKeys(Hooks.prop.getProperty("drug.name.filter.value"));
		clickWhenClickable(drugSearchButton);
		sleep(1000);
		clickWhenClickable(selectDrugRadioButton);
		clickWhenClickable(confirmDrugButton);
		clickWhenClickable(addDrugToChartButton);
		sleep(1000);
		clickWhenClickable(editMedsOnChartButton);
		sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(directionInputFirstMed))
				.sendKeys(Hooks.prop.getProperty("direction.first.med.value"));
		clickWhenClickable(editMedsOnChartButton);
		sleep(1000);
		clickWhenClickable(saveMedsOnChartButton);
	}

	public void createClinicalProfileWithMedReconsMedsOnChartEditAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createClinicalProfileWithMedReconsMedsOnChartAddAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToEditOrDeleteMedReconsMedsOnChartInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(editMedsOnChartButton);
		assertElementNotPresent(deleteMedsOnChartButton);
	}

	public void userShouldBeAbleToAddMedReconsMedsOnChartInClinicalModule() {
		clickWhenClickable(newMedReconsButton);
		sleep(3000);
		clickWhenClickable(encounterStatusDropdown);
		sleep(1000);
		selectDropdownByIndexWhenReady(encounterStatusDropdown, 2);
		sleep(1000);
		clickWhenClickable(addPatientPopupIcon);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientIdFilterInput))
				.sendKeys(Hooks.prop.getProperty("patient.id.filter.value"));
		clickWhenClickable(patientSearchButton);
		sleep(2000);
		clickWhenClickable(selectPatientRadioButton);
		clickWhenClickable(confirmPatientButton);
		sleep(1000);
		clickWhenClickable(addMedsOnChartButton);
		sleep(1000);
		clickWhenClickable(addDrugPopupIcon);
		sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(drugNameFilterInput))
				.sendKeys(Hooks.prop.getProperty("drug.name.filter.value"));
		clickWhenClickable(drugSearchButton);
		sleep(1000);
		clickWhenClickable(selectDrugRadioButton);
		clickWhenClickable(confirmDrugButton);
		clickWhenClickable(addDrugToChartButton);
		sleep(1000);
		clickWhenClickable(saveMedsOnChartButton);
	}

	// Med Recons / Current Medication
	public void userShouldNotBeAbleToAddOrEditMedReconsCurrentMedicationInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(addCurrentMedication);
		assertElementNotPresent(deleteMedicationIcon);
	}

	public void userShouldBeAbleToDeleteMedReconsCurrentMedicationInClinicalModule() {
		sleep(3000);
		clickWhenClickable(newClinicalMedRecons);
		sleep(3000);
		clickWhenClickable(encounterStatusDropdown);
		selectDropdownByIndexWhenReady(encounterStatusDropdown, 2);
		sleep(1000);
		clickWhenClickable(addPatientIcon);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientSearchInput))
				.sendKeys(Hooks.prop.getProperty("patient.search.value"));
		clickWhenClickable(patientSearchButton);
		sleep(2000);
		clickWhenClickable(patientSelectCheckbox);
		clickWhenClickable(patientConfirmButton);
		sleep(1000);
		clickWhenClickable(addCurrentMedication);
		sleep(1000);
		clickWhenClickable(drugLookupIcon);
		sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(drugNameInput))
				.sendKeys(Hooks.prop.getProperty("drug.name.value"));
		clickWhenClickable(drugSearchButton);
		sleep(1000);
		clickWhenClickable(drugSelectCheckbox);
		clickWhenClickable(drugConfirmButton);
		clickWhenClickable(addDrugAction);
		sleep(1000);
		clickWhenClickable(deleteMedicationIcon);
		sleep(1000);
		clickWhenClickable(deleteConfirmButton);
		sleep(1000);
		clickWhenClickable(saveButton);
	}

	public void createProfileWithDeleteOnlyAccessForMedReconsCurrentMedicationTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement medReconsCurrentMedicationAll = wait
				.until(ExpectedConditions.elementToBeClickable(medReconsCurrentMedicationAllLabel));
		medReconsCurrentMedicationAll.click();
		sleep(2000);
		WebElement medReconsCurrentMedicationAdd = wait
				.until(ExpectedConditions.elementToBeClickable(medReconsCurrentMedicationDeleteLabel));
		medReconsCurrentMedicationAdd.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddOrDeleteMedReconsCurrentMedicationInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(addCurrentMedicationButton);
		assertElementNotPresent(deleteCurrentMedicationIcon);
	}

	public void userShouldBeAbleToEditMedReconsCurrentMedicationInClinicalModule() {
		clickWhenClickable(newMedReconsBtn);
		sleep(3000);
		clickWhenClickable(encounterStatusDropdown);
		selectDropdownByIndexWhenReady(encounterStatusDropdown, 2);
		sleep(1000);
		clickWhenClickable(patientPopupIcon);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientIdInput))
				.sendKeys(Hooks.prop.getProperty("patient.id.value"));
		clickWhenClickable(patientSearchBtn);
		sleep(2000);
		clickWhenClickable(patientSelectCheckbox);
		clickWhenClickable(patientConfirmBtn);
		sleep(1000);
		clickWhenClickable(addCurrentMedicationBtn);
		sleep(1000);
		clickWhenClickable(drugLookupIcon);
		sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(drugNameInput))
				.sendKeys(Hooks.prop.getProperty("drug.name.value"));
		clickWhenClickable(drugSearchBtn);
		sleep(1000);
		clickWhenClickable(drugSelectCheckbox);
		clickWhenClickable(drugConfirmBtn);
		sleep(1000);
		clickWhenClickable(editMedIcon);
		sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(directionInput))
				.sendKeys(Hooks.prop.getProperty("direction.value"));
		clickWhenClickable(editMedIcon);
		sleep(1000);
		clickWhenClickable(saveBtn);
	}

	public void userShouldNotBeAbleToEditOrDeleteMedReconsCurrentMedicationInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(editCurrentMedicationIcon);
		assertElementNotPresent(deleteCurrentMedicationIcon);
	}

	public void createProfileWithEditAccessForMedReconsCurrentMedication() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement medReconsCurrentMedicationAll = wait
				.until(ExpectedConditions.elementToBeClickable(medReconsCurrentMedicationAllLabel));
		medReconsCurrentMedicationAll.click();
		sleep(2000);
		WebElement medReconsCurrentMedicationAdd = wait
				.until(ExpectedConditions.elementToBeClickable(medReconsCurrentMedicationEditLabel));
		medReconsCurrentMedicationAdd.click();
		sleep(2000);

	}

	public void userCreatesProfileWithAddAccessOnlyToMedReconsCurrentMedication() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement medReconsCurrentMedicationAll = wait
				.until(ExpectedConditions.elementToBeClickable(medReconsCurrentMedicationAllLabel));
		medReconsCurrentMedicationAll.click();
		sleep(2000);
		WebElement medReconsCurrentMedicationAdd = wait
				.until(ExpectedConditions.elementToBeClickable(medReconsCurrentMedicationAddLabel));
		medReconsCurrentMedicationAdd.click();
		sleep(2000);

	}

	public void userShouldBeAbleToAddMedReconsCurrentMedicationInClinicalModule() {
		sleep(3000);
		clickWhenClickable(newClinicalMedReconsBtn);
		sleep(3000);
		clickWhenClickable(encounterStatusDropdown);
		sleep(1000);
		selectDropdownByIndexWhenReady(encounterStatusDropdown, 2);
		sleep(1000);
		clickWhenClickable(addPatientPopupIcon);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientIdFilterInput))
				.sendKeys(Hooks.prop.getProperty("patient.id.filter.value"));
		clickWhenClickable(searchPatientBtn);
		sleep(2000);
		clickWhenClickable(patientRadioBtn);
		clickWhenClickable(confirmPatientBtn);
		sleep(1000);
		clickWhenClickable(addCurrentMedicationBtn);
		sleep(1000);
		clickWhenClickable(addDrugPopupIcon);
		sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(drugNameFilterInput))
				.sendKeys(Hooks.prop.getProperty("drug.name.filter.value"));
		clickWhenClickable(searchDrugBtn);
		sleep(1000);
		clickWhenClickable(drugRadioBtn);
		clickWhenClickable(confirmDrugBtn);
		clickWhenClickable(addDrugToGridBtn);
		sleep(1000);
		clickWhenClickable(saveMedReconsBtn);
	}

	// Reports / MTM Encounter Log
	public void userShouldNotHaveAccessToExportExcelOrDetailsForReportsMTMEncounterLogInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(exportToExcelButton);
		assertElementNotPresent(viewDetailsIcon);
	}

	public void verifyUserHasViewAccessToReportsMTMEncounterLogInClinicalModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement mtmEncounterLogAllCheckbox = wait
				.until(ExpectedConditions.elementToBeClickable(mtmEncounterLogAllLabel));
		mtmEncounterLogAllCheckbox.click();
		sleep(2000);
		WebElement mtmEncounterLogViewCheckbox = wait
				.until(ExpectedConditions.elementToBeClickable(mtmEncounterLogViewLabel));
		mtmEncounterLogViewCheckbox.click();
		sleep(2000);

	}

	public void verifyUserHasViewExportAndDetailsAccessForReportsMTMEncounterLog() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldBeAbleToViewDetailsForReportsMTMEncounterLogInClinicalModule() {
		sleep(3000);
		clickWhenClickable(viewDetailsIcon);
	}

	public void userShouldBeAbleToExportReportsMTMEncounterLogToExcelInClinicalModule() {
		sleep(3000);
		clickWhenClickable(exportToExcelButton);
	}

	// Remote Patient Monitoring (RPM)
	public void userShouldBeAbleToExportDataToExcelInClinicalModule() {
		sleep(3000);
		clickWhenClickable(exportToExcelButton);
	}

	public void userShouldBeAbleToMakeOutgoingCallsInClinicalModule() {
		sleep(4000);
		clickWhenClickable(rpmActionMenuBtn);
		sleep(2000);
		clickWhenClickable(rpmEditOption);
		sleep(2000);
		clickWhenClickable(outgoingCallIcon);
	}

	public void iCreateAProfileWithExportExcelAndOutgoingCallPermissionsInClinicalModuleTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement remoteMonitoringAll = wait
				.until(ExpectedConditions.elementToBeClickable(remoteMonitoringAllCheckboxLabel));
		remoteMonitoringAll.click();
		sleep(2000);
		WebElement remoteMonitoringAdd = wait
				.until(ExpectedConditions.elementToBeClickable(remoteMonitoringExportExcelLabel));
		remoteMonitoringAdd.click();
		sleep(2000);
		WebElement rpmOutgoingCallCheckbox = wait.until(ExpectedConditions.elementToBeClickable(rpmOutgoingCallLabel));
		rpmOutgoingCallCheckbox.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddOrEditRemotePatientMonitoringRPMInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(newRpmButton);
		clickWhenClickable(rpmActionMenu);
		sleep(2000);
		assertElementNotPresent(progressStepsTab);
	}

	public void userShouldBeAbleToDeleteRemotePatientMonitoringRPMInClinicalModule() {
		sleep(3000);
		clickWhenClickable(rpmFirstRecordActionMenu);
		sleep(2000);
		clickWhenClickable(rpmDeleteOption);
		sleep(2000);
		clickWhenClickable(rpmDeleteConfirmButton);
	}

	public void userShouldHaveDeleteAccessToRemotePatientMonitoringInClinicalModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement remoteMonitoringAll = wait
				.until(ExpectedConditions.elementToBeClickable(remoteMonitoringAllCheckboxLabel));
		remoteMonitoringAll.click();
		sleep(2000);
		WebElement remoteMonitoringAdd = wait
				.until(ExpectedConditions.elementToBeClickable(remoteMonitoringDeleteLabel));
		remoteMonitoringAdd.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddOrDeleteRemotePatientMonitoringRPMInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(newRpmButton);
		clickWhenClickable(bucketDropdownButton);
		sleep(2000);
		assertElementNotPresent(deleteOption);
	}

	public void userShouldBeAbleToEditRemotePatientMonitoringRPMInClinicalModule() {
		sleep(3000);
		clickWhenClickable(bucketDropdownButton);
		sleep(2000);
		clickWhenClickable(editOption);
		sleep(2000);
		clickWhenClickable(progressStepsTab);
		sleep(2000);
		clickWhenClickable(progressStatusDropdown);
		sleep(1000);
		selectDropdownByIndexWhenReady(progressStatusDropdown, 1);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(noteTextarea))
				.sendKeys(Hooks.prop.getProperty("note.textarea.value"));
		clickWhenClickable(saveNoteButton);
		sleep(2000);
		clickWhenClickable(submitLink);
	}

	public void verifyUserHasEditAccessToRemotePatientMonitoringInClinicalModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement remoteMonitoringAll = wait
				.until(ExpectedConditions.elementToBeClickable(remoteMonitoringAllCheckboxLabel));
		remoteMonitoringAll.click();
		sleep(2000);
		WebElement remoteMonitoringAdd = wait.until(ExpectedConditions.elementToBeClickable(remoteMonitoringEditLabel));
		remoteMonitoringAdd.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToEditOrDeleteRemotePatientMonitoringRPMInClinicalModule() {
		sleep(3000);
		clickWhenClickable(bucketDropdownButton);
		sleep(2000);
		assertElementNotPresent(editOption);
		assertElementNotPresent(deleteOption);
	}

	public void userShouldHaveAddAccessToRemotePatientMonitoringInClinicalModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement remoteMonitoringAll = wait
				.until(ExpectedConditions.elementToBeClickable(remoteMonitoringAllCheckboxLabel));
		remoteMonitoringAll.click();
		sleep(2000);
		WebElement remoteMonitoringAdd = wait
				.until(ExpectedConditions.elementToBeClickable(remoteMonitoringAddCheckboxLabel));
		remoteMonitoringAdd.click();
		sleep(2000);

	}

	public void userShouldBeAbleToAddRemotePatientMonitoringRPMInClinicalModule() {
		sleep(3000);
		clickWhenClickable(newRpmButton);
		sleep(2000);
		clickWhenClickable(addPatientIcon);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientIdFilterLocator))
				.sendKeys(Hooks.prop.getProperty("filter.patient.id.value"));
		clickWhenClickable(searchButton);
		sleep(2000);
		clickWhenClickable(selectFirstPatientRadio);
		clickWhenClickable(confirmPatientButton);
		sleep(2000);
		clickWhenClickable(nextButton);
		sleep(3000);
		clickWhenClickable(submitLink);
	}

	// RPM / Remote Monitoring Parameter
	public void cannotAddOrDeleteRpmRemoteMonitoringParameterInClinicalModule() {
		clickWhenClickable(bucketDropdownIconParameter);
		clickWhenClickable(editOptionParameter);
		clickWhenClickable(devicesTabParameter);
		assertElementNotPresent(addRpmParameterNotPresentParameter);
		assertElementNotPresent(deleteRpmParameterNotPresentParameter);
	}

	public void canEditRpmRemoteMonitoringParameterInClinicalModule() {
		clickWhenClickable(bucketDropdownIconParameter);
		clickWhenClickable(editOptionParameter);
		clickWhenClickable(devicesTabParameter);
		clickWhenClickable(editRpmParameterButtonParameter);
		wait.until(ExpectedConditions.visibilityOfElementLocated(maxTriggerValueParameter))
				.sendKeys(Hooks.prop.getProperty("max.trigger.value.parameter"));
		clickWhenClickable(saveRpmParameterButtonParameter);
	}

	public void givenProfileHasDeleteAccessOnlyForRpmRemoteMonitoringParameter() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement rmParameterAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(rmParameterAllLabelParameter));
		rmParameterAllLabel.click();
		sleep(2000);
		WebElement rmParameterAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(rmParameterDeleteLabelParameter));
		rmParameterAddLabel.click();
		sleep(2000);

	}

	public void givenProfileHasEditAccessOnlyForRpmRmpDetails() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void givenProfileHasEditAccessOnlyForRpmRemoteMonitoringParameter() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement rmParameterAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(rmParameterAllLabelParameter));
		rmParameterAllLabel.click();
		sleep(2000);
		WebElement rmParameterAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(rmParameterEditLabelParameter));
		rmParameterAddLabel.click();
		sleep(2000);

	}

	public void givenProfileHasAddAccessOnlyForRpmRemoteMonitoringParameter() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement rmParameterAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(rmParameterAllLabelParameter));
		rmParameterAllLabel.click();
		sleep(2000);
		WebElement rmParameterAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(rmParameterAddLabelParameter));
		rmParameterAddLabel.click();
		sleep(2000);

	}

	public void cannotEditOrDeleteRpmRemoteMonitoringParameterInClinicalModule() {
		sleep(2000);
		clickWhenClickable(bucketDropdownIconParameter);
		sleep(2000);
		clickWhenClickable(editOptionParameter);
		sleep(2000);
		clickWhenClickable(devicesTabParameter);
		sleep(2000);
		assertElementNotPresent(editButtonNotPresentParameter);
		assertElementNotPresent(deleteButtonNotPresentParameter);
	}

	public void canAddRpmRemoteMonitoringParameterInClinicalModule() {
		sleep(2000);
		clickWhenClickable(bucketDropdownIconParameter);
		sleep(2000);
		clickWhenClickable(editOptionParameter);
		sleep(2000);
		clickWhenClickable(devicesTabParameter);
		sleep(2000);
		selectDropdownByIndexWhenReady(rpmParameterDropdown, 1);
		sleep(2000);
		selectDropdownByIndexWhenReady(providerDropdown, 1);
		sleep(2000);
		selectDropdownByIndexWhenReady(deviceDropdownParameter, 1);
		sleep(2000);
		WebElement startDate = driver.findElement(startDateField);
		startDate.clear();
		wait.until(ExpectedConditions.visibilityOf(startDate)).sendKeys(Hooks.prop.getProperty("start.date.value"),
				Keys.TAB);
		WebElement endDate = driver.findElement(endDateField);
		endDate.clear();
		endDate.sendKeys(Hooks.prop.getProperty("end.date.value"), Keys.TAB);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(normalMin))
				.sendKeys(Hooks.prop.getProperty("normal.min.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(normalMax))
				.sendKeys(Hooks.prop.getProperty("normal.max.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(level1Min))
				.sendKeys(Hooks.prop.getProperty("level1.min.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(level1Max))
				.sendKeys(Hooks.prop.getProperty("level1.max.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(level2Min))
				.sendKeys(Hooks.prop.getProperty("level2.min.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(level2Max))
				.sendKeys(Hooks.prop.getProperty("level2.max.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(level3Min))
				.sendKeys(Hooks.prop.getProperty("level3.min.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(level3Max))
				.sendKeys(Hooks.prop.getProperty("level3.max.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(minTriggerValue))
				.sendKeys(Hooks.prop.getProperty("min.trigger.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(maxTriggerValue))
				.sendKeys(Hooks.prop.getProperty("max.trigger.value"));
		clickWhenClickable(addRpmParameterButtonParameter);
		clickWhenClickable(submitButtonParameter);
	}

	public void canDeleteRpmRemoteMonitoringParameterInClinicalModule() {
		clickWhenClickable(bucketDropdownIconParameter);
		clickWhenClickable(editOptionParameter);
		clickWhenClickable(devicesTabParameter);
		clickWhenClickable(deleteRpmParameterButtonParameter);
		clickWhenClickable(confirmDeleteRpmParameterButtonParameter);
	}

	public void cannotAddOrEditRpmRemoteMonitoringParameterInClinicalModule() {
		clickWhenClickable(bucketDropdownIconParameter);
		clickWhenClickable(editOptionParameter);
		clickWhenClickable(devicesTabParameter);
		assertElementNotPresent(addRpmParameterNotPresentParameter);
		assertElementNotPresent(editRpmParameterNotPresentParameter);
	}

	// RPM / RMP Details
	public void userShouldNotBeAbleToEditRPMRMPDetailsInClinicalModule() {
		clickWhenClickable(bucketDropdownIconParameter);
		clickWhenClickable(deleteOptionParameter);
		clickWhenClickable(confirmDeleteButtonParameter);
	}

	public void givenProfileHasNoEditAccessForRpmRmpDetails() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement externalDetailsAllLabel = wait.until(ExpectedConditions.elementToBeClickable(rmAllLabel));
		externalDetailsAllLabel.click();

	}

	public void canEditRpmRmpDetailsInClinicalModule() {
		sleep(4000);
		clickWhenClickable(bucketDropdownIconoptionParameter);
		sleep(2000);
		clickWhenClickable(deleteOptionParameter);
		sleep(2000);
		clickWhenClickable(confirmDeleteButtonParameter);
	}

	public void userShouldNotHaveAccessToAddOrDeleteRPMRMPDetailsInClinicalModule() {
		sleep(4000);
		clickWhenClickable(bucketDropdownIconParameter);
		sleep(2000);
		clickWhenClickable(deleteOptionParameter);
		sleep(2000);
		clickWhenClickable(confirmDeleteButtonParameter);
	}

	// RPM / External Details for Alert
	public void cannotAddOrEditRpmExternalDetailsForAlertInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(addExternalAlertButtonNotPresentParameter);
		assertElementNotPresent(editExternalAlertButtonNotPresentParameter);
	}

	public void canDeleteRpmExternalDetailsForAlertInClinicalModule() {
		clickWhenClickable(bucketDropdownIconParameter);
		clickWhenClickable(editOptionParameter);
		clickWhenClickable(externalAlertsTabParameter);
		clickWhenClickable(deleteExternalAlertIconParameter);
		clickWhenClickable(confirmDeleteExternalAlertButtonParameter);
	}

	public void givenProfileHasDeleteAccessOnlyForRpmExternalDetailsForAlert() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement externalDetailsAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(externalDetailsAllLabelParameter));
		externalDetailsAllLabel.click();
		sleep(2000);
		WebElement externalDetailsAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(externalDetailsDeleteLabel));
		externalDetailsAddLabel.click();
		sleep(2000);

	}

	public void verifyUserCannotAddOrDeleteRPMExternalDetailsForAlert() {
		sleep(3000);
		assertElementNotPresent(addExternalAlertButtonNotPresentParameter);
		assertElementNotPresent(deleteExternalAlertButtonNotPresentParameter);
	}

	public void verifyUserCanEditRPMExternalDetailsForAlert() {
		clickWhenClickable(bucketDropdownIconParameter);
		clickWhenClickable(editOptionParameter);
		clickWhenClickable(externalAlertsTabParameter);
		clickWhenClickable(editExternalAlertIconParameter);
		wait.until(ExpectedConditions.visibilityOfElementLocated(externalAlertRelationParameter))
				.sendKeys(Hooks.prop.getProperty("external.alert.relation.parameter"));
		clickWhenClickable(saveExternalAlertPopupButtonParameter);
	}

	public void cannotEditOrDeleteRpmExternalDetailsForAlertInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(editExternalAlertNotPresentParameter);
		assertElementNotPresent(deleteExternalAlertNotPresentParameter);
	}

	public void givenProfileHasEditAccessOnlyForRpmExternalDetailsForAlert() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement externalDetailsAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(externalDetailsAllLabelParameter));
		externalDetailsAllLabel.click();
		sleep(2000);
		WebElement externalDetailsAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(externalDetailsEditLabel));
		externalDetailsAddLabel.click();
		sleep(2000);

	}

	public void verifyUserCanAddRPMExternalDetailsForAlert() {
		sleep(2000);
		clickWhenClickable(AlertbucketDropdownIconParameter);
		clickWhenClickable(AlerteditOptionParameter);
		sleep(2000);
		clickWhenClickable(externalAlertsTabParameter);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(externalAlertNameParameter))
				.sendKeys(Hooks.prop.getProperty("external.alert.name.parameter"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(externalAlertEmailParameter))
				.sendKeys(Hooks.prop.getProperty("external.alert.email.parameter"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(externalAlertPhoneParameter))
				.sendKeys(Hooks.prop.getProperty("external.alert.phone.parameter"));
		sleep(2000);
		clickWhenClickable(saveExternalAlertButtonParameter);
	}

	// RPM / Trigger Alert for Time
	public void downloadDrilldownReportForRemoteMonitoringReportInClinicalModule() {
		sleep(3000);
		clickWhenClickable(firstReportDrilldownIcon);
		sleep(3000);
		clickWhenClickable(downloadReportButton);
		sleep(1000);
	}

	public void exportRemoteMonitoringReportToExcelInClinicalModule() {
		sleep(3000);
		clickWhenClickable(exportToExcelButton);
	}

	public void shouldSendReportsRemoteMonitoringReportForSignatureInClinicalModule() {
		sleep(3000);
		clickWhenClickable(firstReportIcon);
		sleep(2000);
		clickWhenClickable(monthDropdown);
		sleep(2000);
		selectDropdownByIndexWhenReady(monthDropdown, 1);
		sleep(2000);
		clickWhenClickable(yearDropdown);
		sleep(2000);
		selectDropdownByIndexWhenReady(yearDropdown, 1);
		sleep(2000);
		clickWhenClickable(sendForSignatureButton);
		sleep(2000);
		clickWhenClickable(signerDropdown);
		sleep(2000);
		selectDropdownByIndexWhenReady(signerDropdown, 1);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(signerFullName))
				.sendKeys(Hooks.prop.getProperty("signer.full.name"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(signerEmail))
				.sendKeys(Hooks.prop.getProperty("signer.email"));
		clickWhenClickable(addManualSignerButton);
		sleep(2000);
		clickWhenClickable(nextButton);
		sleep(2000);
		clickWhenClickable(nextButton);
		wait.until(ExpectedConditions.visibilityOfElementLocated(subjectInput))
				.sendKeys(Hooks.prop.getProperty("subject.input.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(editorInput))
				.sendKeys(Hooks.prop.getProperty("editor.input.value"));
		clickWhenClickable(finishButton);
	}

	public void userShouldBeAbleToDownloadReportsRemoteMonitoringReportFileInClinicalModule() {
		clickWhenClickable(downloadRemoteMonitoringReportIconParameter);
		sleep(2000);
		clickWhenClickable(reportMonthDropdownParameter);
		sleep(1000);
		selectDropdownByIndexWhenReady(reportMonthDropdownParameter, 1);
		sleep(2000);
		clickWhenClickable(reportYearDropdownParameter);
		sleep(1000);
		selectDropdownByIndexWhenReady(reportYearDropdownParameter, 1);
		sleep(2000);
		clickWhenClickable(downloadReportButtonParameter);
		sleep(2000);
	}

	public void userShouldBeAbleToDrillDownReportsRemoteMonitoringReportInClinicalModule() {
		sleep(3000);
		clickWhenClickable(drillDownRemoteMonitoringReportIconParameter);
		sleep(1000);
	}

	public void userCannotAddOrEditRPMTriggerAlertForTimeInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(addTriggerAlertIconParameter);
		sleep(2000);
		clickWhenClickable(triggerAlertActionMenuIconParameter);
		sleep(2000);
		assertElementNotPresent(editTriggerAlertOptionParameter);
	}

	public void canDeleteRpmTriggerAlertForTimeInClinicalModule() {
		sleep(3000);
		clickWhenClickable(bucketDropdownIconTriggerAlert);
		sleep(2000);
		clickWhenClickable(editOptionTriggerAlert);
		sleep(2000);
		clickWhenClickable(triggerAlertActionMenuIcon);
		sleep(2000);
		clickWhenClickable(deleteTriggerAlertOption);
		sleep(3000);
		clickWhenClickable(confirmDeleteTriggerAlertButton);
		sleep(1000);
	}

	public void userShouldNotBeAbleToAddOrDeleteRPMTriggerAlertForTimeInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(addTriggerAlertIconParameter);
		sleep(2000);
		clickWhenClickable(triggerAlertActionMenuIconParameter);
		sleep(2000);
		assertElementNotPresent(deleteTriggerAlertOptionParameter);
	}

	public void createDeleteOnlyProfileForRpmTriggerAlertForTime() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement externalDetailsAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(triggerAlertAllLabelParameter));
		externalDetailsAllLabel.click();
		sleep(2000);
		WebElement externalDetailsAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(triggerAlertDeleteLabel));
		externalDetailsAddLabel.click();
		sleep(2000);

	}

	public void createProfileWithAllAccessForReportsRemoteMonitoringReport() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void canEditRpmTriggerAlertForTimeInClinicalModule() {
		clickWhenClickable(bucketDropdownIconParameterTrigger);
		clickWhenClickable(editOptionParameterTrigger);
		clickWhenClickable(triggerAlertRowActionButtonParameter);
		clickWhenClickable(editTriggerAlertOptionParameter);
		wait.until(ExpectedConditions.visibilityOfElementLocated(triggerAlertMinutesInputParameter))
				.sendKeys(Hooks.prop.getProperty("trigger.alert.minutes.value"));
		clickWhenClickable(saveTriggerAlertButtonParameter);
	}

	public void givenProfileHasEditAccessOnlyForRpmTriggerAlertForTime() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement externalDetailsAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(triggerAlertAllLabelParameter));
		externalDetailsAllLabel.click();
		sleep(2000);
		WebElement externalDetailsAddLabel = wait.until(ExpectedConditions.elementToBeClickable(triggerAlertEditLabel));
		externalDetailsAddLabel.click();
		sleep(2000);

	}

	public void cannotEditOrDeleteRpmTriggerAlertForTimeInClinicalModule() {
		sleep(3000);
		clickWhenClickable(triggerAlertRowEditIconParameter);
		sleep(2000);
		assertElementNotPresent(editTriggerAlertButtonNotPresentParameter);
		assertElementNotPresent(deleteTriggerAlertButtonNotPresentParameter);
	}

	public void canAddRpmTriggerAlertForTimeInClinicalModule() {
		sleep(2000);
		clickWhenClickable(bucketDropdownIconParameterTrigger);
		clickWhenClickable(editOptionParameterTrigger);
		sleep(2000);
		clickWhenClickable(addTriggerAlertIconParameter);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(triggerAlertModalParameter));
		sleep(2000);
		WebElement triggerDropdown = wait
				.until(ExpectedConditions.elementToBeClickable(triggerParameterDropdownParameter));
		triggerDropdown.click();
		selectDropdownByIndexWhenReady(triggerParameterSelectIdParameter, 1);
		sleep(2000);
		WebElement minutesInput = wait.until(ExpectedConditions.elementToBeClickable(triggerMinutesInputParameter));
		minutesInput.clear();
		minutesInput.sendKeys(Hooks.prop.getProperty("minutes.input.value"));
		sleep(2000);
		clickWhenClickable(saveTriggerAlertButtonParameter);
		sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(triggerAlertModalParameter));
	}

	public void givenProfileHasAddAccessOnlyForRpmTriggerAlertForTime() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement externalDetailsAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(triggerAlertAllLabelParameter));
		externalDetailsAllLabel.click();
		sleep(2000);
		WebElement externalDetailsAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(triggerAlertAddLabelParameter));
		externalDetailsAddLabel.click();
		sleep(2000);

	}

	// Reports / Remote Monitoring Report
	public void userShouldBeAbleToSendPAInsuranceInClinicalModule() {
		clickWhenClickable(newClinicalPABtn);
		clickWhenClickable(addPatientIcon);
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientIdInput))
				.sendKeys(Hooks.prop.getProperty("patient.id.value"));
		clickWhenClickable(searchBtn);
		clickWhenClickable(firstPatientRadio);
		clickWhenClickable(selectPatientBtn);
		clickWhenClickable(addDrugIcon);
		wait.until(ExpectedConditions.visibilityOfElementLocated(drugNameInput))
				.sendKeys(Hooks.prop.getProperty("drug.name.input.value"));
		clickWhenClickable(searchBtn);
		clickWhenClickable(drugRadio);
		clickWhenClickable(selectDrugBtn);
		clickWhenClickable(addProviderIcon);
		clickWhenClickable(providerRadio);
		clickWhenClickable(selectProviderBtn);
		clickWhenClickable(addPartnerIcon);
		clickWhenClickable(fullSearchRadio);
		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerNameInput))
				.sendKeys(Hooks.prop.getProperty("partner.name.input.value"));
		clickWhenClickable(searchBtn);
		clickWhenClickable(partnerRadio);
		clickWhenClickable(selectPartnerBtn);
		WebElement receivedDate = driver.findElement(receivedDateInput);
		receivedDate.clear();
		receivedDate.sendKeys(Hooks.prop.getProperty("received.date.value"));
		receivedDate.sendKeys(Keys.TAB);
		clickWhenClickable(saveBtn);
		clickWhenClickable(patientDetailsTab);
		clickWhenClickable(pharmacyDetailsTab);
		clickWhenClickable(providerDetailsTab);
		clickWhenClickable(drugDetailsTab);
		clickWhenClickable(verifyBtn);
		clickWhenClickable(pendingSaveBtn);
		WebElement submissionDate = driver.findElement(submissionDateInput);
		submissionDate.clear();
		submissionDate.sendKeys(Hooks.prop.getProperty("submission.date.value"));
		submissionDate.sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(submissionNoteInput))
				.sendKeys(Hooks.prop.getProperty("submission.note.value"));
		clickWhenClickable(saveSubmissionBtn);
		clickWhenClickable(sendInsuranceBtn);
		wait.until(ExpectedConditions.visibilityOfElementLocated(toEmailInput))
				.sendKeys(Hooks.prop.getProperty("to.email.input.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(subjectInput))
				.sendKeys(Hooks.prop.getProperty("subject.input.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(emailBodyInput))
				.sendKeys(Hooks.prop.getProperty("email.body.input.value"));
		clickWhenClickable(sendEmailBtn);
	}

	public void deletePAChartNoteAttachmentInClinicalModule() {
		clickWhenClickable(newClinicalPaBtn);
		clickWhenClickable(addPatientIcon);
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientIdInput))
				.sendKeys(Hooks.prop.getProperty("patient.id.value"));
		clickWhenClickable(searchBtn);
		clickWhenClickable(firstPatientRadio);
		clickWhenClickable(selectPatientBtn);
		clickWhenClickable(addDrugIcon);
		wait.until(ExpectedConditions.visibilityOfElementLocated(drugNameInput))
				.sendKeys(Hooks.prop.getProperty("drug.name.input.value"));
		clickWhenClickable(searchBtn);
		clickWhenClickable(drugRadio);
		clickWhenClickable(selectDrugBtn);
		clickWhenClickable(addProviderIcon);
		clickWhenClickable(providerRadio);
		clickWhenClickable(selectProviderBtn);
		clickWhenClickable(addPartnerIcon);
		clickWhenClickable(fullSearchRadio);
		wait.until(ExpectedConditions.visibilityOfElementLocated(businessNameInput))
				.sendKeys(Hooks.prop.getProperty("business.name.input.value"));
		clickWhenClickable(searchBtn);
		clickWhenClickable(partnerRadio);
		clickWhenClickable(selectPartnerBtn);
		WebElement receivedDate = driver.findElement(receivedDateInput);
		receivedDate.clear();
		receivedDate.sendKeys(Hooks.prop.getProperty("received.date.value"));
		receivedDate.sendKeys(Keys.TAB);
		clickWhenClickable(saveBtn);
		clickWhenClickable(patientDetailsTab);
		clickWhenClickable(pharmacyDetailsTab);
		clickWhenClickable(providerDetailsTab);
		clickWhenClickable(drugDetailsTab);
		clickWhenClickable(verifyBtn);
		clickWhenClickable(pendingSaveBtn);
		WebElement submissionDate = driver.findElement(submissionDateInput);
		submissionDate.clear();
		submissionDate.sendKeys(Hooks.prop.getProperty("submission.date.value"));
		submissionDate.sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(submissionNoteInput))
				.sendKeys(Hooks.prop.getProperty("submission.note.value"));
		clickWhenClickable(saveSubmissionBtn);
		clickWhenClickable(deleteChartNoteAttachmentIcon);
		clickWhenClickable(confirmChartNoteAttachmentDeleteBtn);
	}

	public void userShouldBeAbleToDeletePAChartNoteAttachmentInClinicalModule() {
		clickWhenClickable(newClinicalPaBtn);
		clickWhenClickable(addPatientIcon);
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientIdInput))
				.sendKeys(Hooks.prop.getProperty("patient.id.value"));
		clickWhenClickable(searchBtn);
		clickWhenClickable(firstPatientRadio);
		clickWhenClickable(selectPatientBtn);
		clickWhenClickable(addDrugIcon);
		wait.until(ExpectedConditions.visibilityOfElementLocated(drugNameInput))
				.sendKeys(Hooks.prop.getProperty("drug.name.input.value"));
		clickWhenClickable(searchBtn);
		clickWhenClickable(drugRadio);
		clickWhenClickable(selectDrugBtn);
		clickWhenClickable(addProviderIcon);
		clickWhenClickable(providerRadio);
		clickWhenClickable(selectProviderBtn);
		clickWhenClickable(addPartnerIcon);
		clickWhenClickable(fullSearchRadio);
		wait.until(ExpectedConditions.visibilityOfElementLocated(businessNameInput))
				.sendKeys(Hooks.prop.getProperty("business.name.input.value"));
		clickWhenClickable(searchBtn);
		clickWhenClickable(partnerRadio);
		clickWhenClickable(selectPartnerBtn);
		WebElement receivedDate = driver.findElement(receivedDateInput);
		receivedDate.clear();
		receivedDate.sendKeys(Hooks.prop.getProperty("received.date.value"));
		receivedDate.sendKeys(Keys.TAB);
		clickWhenClickable(saveBtn);
		clickWhenClickable(patientDetailsTab);
		clickWhenClickable(pharmacyDetailsTab);
		clickWhenClickable(providerDetailsTab);
		clickWhenClickable(drugDetailsTab);
		clickWhenClickable(verifyBtn);
		clickWhenClickable(pendingSaveBtn);
		WebElement submissionDate = driver.findElement(submissionDateInput);
		submissionDate.clear();
		submissionDate.sendKeys(Hooks.prop.getProperty("submission.date.value"));
		submissionDate.sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(submissionNoteInput))
				.sendKeys(Hooks.prop.getProperty("submission.note.value"));
		clickWhenClickable(saveSubmissionBtn);
		clickWhenClickable(deleteChartNoteAttachmentIcon);
		clickWhenClickable(confirmChartNoteAttachmentDeleteBtn);
	}

	public void userShouldBeAbleToDeleteGeneratedIncomingAttachmentInClinicalModule() {
		clickWhenClickable(newClinicalPaBtn);
		clickWhenClickable(addPatientIcon);
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientIdInput))
				.sendKeys(Hooks.prop.getProperty("patient.id.value"));
		clickWhenClickable(searchBtn);
		clickWhenClickable(firstPatientRadio);
		clickWhenClickable(selectPatientBtn);
		clickWhenClickable(addDrugIcon);
		wait.until(ExpectedConditions.visibilityOfElementLocated(drugNameInput))
				.sendKeys(Hooks.prop.getProperty("drug.name.input.value"));
		clickWhenClickable(searchBtn);
		clickWhenClickable(drugRadio);
		clickWhenClickable(selectDrugBtn);
		clickWhenClickable(addProviderIcon);
		clickWhenClickable(providerRadio);
		clickWhenClickable(selectProviderBtn);
		clickWhenClickable(addPartnerIcon);
		clickWhenClickable(fullSearchRadio);
		wait.until(ExpectedConditions.visibilityOfElementLocated(businessNameInput))
				.sendKeys(Hooks.prop.getProperty("business.name.input.value"));
		clickWhenClickable(searchBtn);
		clickWhenClickable(partnerRadio);
		clickWhenClickable(selectPartnerBtn);
		WebElement receivedDate = driver.findElement(receivedDateInput);
		receivedDate.clear();
		receivedDate.sendKeys(Hooks.prop.getProperty("received.date.value"));
		receivedDate.sendKeys(Keys.TAB);
		clickWhenClickable(saveBtn);
		clickWhenClickable(patientDetailsTab);
		clickWhenClickable(pharmacyDetailsTab);
		clickWhenClickable(providerDetailsTab);
		clickWhenClickable(drugDetailsTab);
		clickWhenClickable(verifyBtn);
		clickWhenClickable(pendingSaveBtn);
		WebElement submissionDate = driver.findElement(submissionDateInput);
		submissionDate.clear();
		submissionDate.sendKeys(Hooks.prop.getProperty("submission.date.value"));
		submissionDate.sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(drugNameInput))
				.sendKeys(Hooks.prop.getProperty("drug.name.input.value"));
		clickWhenClickable(saveSubmissionBtn);
		clickWhenClickable(deleteGeneratedAttachmentIcon);
		clickWhenClickable(confirmAttachmentDeleteBtn);
	}

	public void userShouldBeAbleToDeletePAOutcomeStatusInClinicalModule() {
		clickWhenClickable(newClinicalPaBtn);
		clickWhenClickable(addPatientIcon);
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientIdInput))
				.sendKeys(Hooks.prop.getProperty("patient.id.value"));
		clickWhenClickable(searchBtn);
		clickWhenClickable(firstPatientRadio);
		clickWhenClickable(selectPatientBtn);
		clickWhenClickable(addDrugIcon);
		wait.until(ExpectedConditions.visibilityOfElementLocated(drugNameInput))
				.sendKeys(Hooks.prop.getProperty("drug.name.input.value"));
		clickWhenClickable(searchBtn);
		clickWhenClickable(drugRadio);
		clickWhenClickable(selectDrugBtn);
		clickWhenClickable(addProviderIcon);
		clickWhenClickable(providerRadio);
		clickWhenClickable(selectProviderBtn);
		clickWhenClickable(addPartnerIcon);
		clickWhenClickable(fullSearchRadio);
		wait.until(ExpectedConditions.visibilityOfElementLocated(businessNameInput))
				.sendKeys(Hooks.prop.getProperty("business.name.input.value"));
		clickWhenClickable(searchBtn);
		clickWhenClickable(partnerRadio);
		clickWhenClickable(selectPartnerBtn);
		WebElement receivedDate = driver.findElement(receivedDateInput);
		receivedDate.clear();
		receivedDate.sendKeys(Hooks.prop.getProperty("received.date.value"));
		receivedDate.sendKeys(Keys.TAB);
		clickWhenClickable(saveBtn);
		clickWhenClickable(patientDetailsTab);
		clickWhenClickable(pharmacyDetailsTab);
		clickWhenClickable(providerDetailsTab);
		clickWhenClickable(drugDetailsTab);
		clickWhenClickable(verifyBtn);
		clickWhenClickable(pendingSaveBtn);
		WebElement submissionDate = driver.findElement(submissionDateInput);
		submissionDate.clear();
		submissionDate.sendKeys(Hooks.prop.getProperty("submission.date.value"));
		submissionDate.sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(submissionNoteInput))
				.sendKeys(Hooks.prop.getProperty("submission.note.value"));
		clickWhenClickable(saveSubmissionBtn);
		clickWhenClickable(outcomeActionMenu);
		clickWhenClickable(deleteOutcomeOption);
		clickWhenClickable(confirmOutcomeDeleteBtn);
	}

	public void userShouldBeAbleToDeletePAStatusInClinicalModule() {
		sleep(3000);
		clickWhenClickable(paActionMenuButton);
		sleep(2000);
		clickWhenClickable(deleteOption);
		sleep(2000);
		clickWhenClickable(confirmDeleteButton);
	}

	public void userShouldBeAbleToShowGeneratedPABYAllInClinicalModule() {
		sleep(3000);
		clickWhenClickable(newClinicalPAButton);
		sleep(2000);
		clickWhenClickable(addPatientButton);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(submissionNoteInput))
				.sendKeys(Hooks.prop.getProperty("submission.note.value"));
		clickWhenClickable(patientSearchButton);
		sleep(2000);
		clickWhenClickable(firstPatientRadio);
		sleep(1000);
		clickWhenClickable(selectPatientButton);
		sleep(5000);
		clickWhenClickable(addDrugButton);
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(drugNameInput))
				.sendKeys(Hooks.prop.getProperty("drug.name.input.value"));
		clickWhenClickable(drugSearchButton);
		sleep(2000);
		clickWhenClickable(selectDrugRadio);
		sleep(1000);
		clickWhenClickable(selectDrugButton);
		sleep(5000);
		clickWhenClickable(addProviderButton);
		sleep(4000);
		clickWhenClickable(selectProviderRadio);
		sleep(3000);
		clickWhenClickable(selectProviderButton);
		sleep(4000);
		clickWhenClickable(addPartnerButton);
		sleep(3000);
		clickWhenClickable(fullSearchRadio);
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(businessNameInput))
				.sendKeys(Hooks.prop.getProperty("business.name.input.value"));
		clickWhenClickable(partnerSearchButton);
		sleep(3000);
		clickWhenClickable(selectPartnerRadio);
		sleep(3000);
		clickWhenClickable(selectPartnerButton);
		sleep(3000);
		WebElement receivedDate = driver.findElement(receivedDateInput);
		receivedDate.clear();
		receivedDate.sendKeys(Hooks.prop.getProperty("received.date.value"));
		receivedDate.sendKeys(Keys.TAB);
		sleep(2000);
		clickWhenClickable(saveButton);
		sleep(2000);
		clickWhenClickable(patientDetailsTab);
		clickWhenClickable(pharmacyDetailsTab);
		clickWhenClickable(providerDetailsTab);
		clickWhenClickable(drugDetailsTab);
		clickWhenClickable(verifyButton);
		sleep(2000);
		clickWhenClickable(pendingSaveButton);
		sleep(2000);
		WebElement submissionDate = driver.findElement(submissionDateInput);
		submissionDate.clear();
		submissionDate.sendKeys(Hooks.prop.getProperty("submission.date.value"));
		submissionDate.sendKeys(Keys.TAB);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(submissionNoteInput))
				.sendKeys(Hooks.prop.getProperty("submission.note.value"));
		clickWhenClickable(saveSubmissionButton);
	}

	public void userShouldBeAbleToExportAllPAToExcelInClinicalModule() {
		sleep(3000);
		clickWhenClickable(exportToExcelButton);
	}

	public void userShouldBeAbleToViewAllPAOutcomeInClinicalModule() {
		sleep(3000);
		clickWhenClickable(newClinicalPAButton);
		sleep(2000);
		clickWhenClickable(addPatientButton);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientIdInput))
				.sendKeys(Hooks.prop.getProperty("patient.id.value"));
		clickWhenClickable(patientSearchButton);
		sleep(2000);
		clickWhenClickable(firstPatientRadio);
		sleep(1000);
		clickWhenClickable(selectPatientButton);
		sleep(5000);
		clickWhenClickable(addDrugButton);
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(drugNameInput))
				.sendKeys(Hooks.prop.getProperty("drug.name.input.value"));
		clickWhenClickable(drugSearchButton);
		sleep(2000);
		clickWhenClickable(selectDrugRadio);
		sleep(1000);
		clickWhenClickable(selectDrugButton);
		sleep(5000);
		clickWhenClickable(addProviderButton);
		sleep(4000);
		clickWhenClickable(selectProviderRadio);
		sleep(3000);
		clickWhenClickable(selectProviderButton);
		sleep(4000);
		clickWhenClickable(addPartnerButton);
		sleep(3000);
		clickWhenClickable(fullSearchRadio);
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(businessNameInput))
				.sendKeys(Hooks.prop.getProperty("business.name.input.value"));
		clickWhenClickable(partnerSearchButton);
		sleep(3000);
		clickWhenClickable(selectPartnerRadio);
		sleep(3000);
		clickWhenClickable(selectPartnerButton);
		sleep(3000);
		WebElement receivedDate = driver.findElement(receivedDateInput);
		receivedDate.clear();
		receivedDate.sendKeys(Hooks.prop.getProperty("received.date.value"));
		receivedDate.sendKeys(Keys.TAB);
		sleep(2000);
		clickWhenClickable(saveButton);
		sleep(2000);
		clickWhenClickable(patientDetailsTab);
		clickWhenClickable(pharmacyDetailsTab);
		clickWhenClickable(providerDetailsTab);
		clickWhenClickable(drugDetailsTab);
		clickWhenClickable(verifyButton);
		sleep(2000);
		clickWhenClickable(pendingSaveButton);
		sleep(2000);
		WebElement submissionDate = driver.findElement(submissionDateInput);
		submissionDate.clear();
		submissionDate.sendKeys(Hooks.prop.getProperty("submission.date.value"));
		submissionDate.sendKeys(Keys.TAB);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(submissionNoteInput))
				.sendKeys(Hooks.prop.getProperty("submission.note.value"));
		clickWhenClickable(saveSubmissionButton);
	}

	public void userShouldBeAbleToSubmitAllPAInClinicalModule() {
		sleep(3000);
		clickWhenClickable(newClinicalPAButton);
		sleep(2000);
		clickWhenClickable(addPatientButton);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientIdInput))
				.sendKeys(Hooks.prop.getProperty("patient.id.value"));
		clickWhenClickable(patientSearchButton);
		sleep(2000);
		clickWhenClickable(firstPatientRadio);
		sleep(1000);
		clickWhenClickable(selectPatientButton);
		sleep(5000);
		clickWhenClickable(addDrugButton);
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(drugNameInput))
				.sendKeys(Hooks.prop.getProperty("drug.name.input.value"));
		clickWhenClickable(drugSearchButton);
		sleep(2000);
		clickWhenClickable(selectDrugRadio);
		sleep(1000);
		clickWhenClickable(selectDrugButton);
		sleep(5000);
		clickWhenClickable(addProviderButton);
		sleep(4000);
		clickWhenClickable(selectProviderRadio);
		sleep(3000);
		clickWhenClickable(selectProviderButton);
		sleep(4000);
		clickWhenClickable(addPartnerButton);
		sleep(3000);
		clickWhenClickable(fullSearchRadio);
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(businessNameInput))
				.sendKeys(Hooks.prop.getProperty("business.name.input.value"));
		clickWhenClickable(partnerSearchButton);
		sleep(3000);
		clickWhenClickable(selectPartnerRadio);
		sleep(3000);
		clickWhenClickable(selectPartnerButton);
		sleep(3000);
		WebElement receivedDate = driver.findElement(receivedDateInput);
		receivedDate.clear();
		receivedDate.sendKeys(Hooks.prop.getProperty("received.date.value"));
		receivedDate.sendKeys(Keys.TAB);
		sleep(2000);
		clickWhenClickable(saveButton);
		sleep(2000);
		clickWhenClickable(patientDetailsTab);
		clickWhenClickable(pharmacyDetailsTab);
		clickWhenClickable(providerDetailsTab);
		clickWhenClickable(drugDetailsTab);
		clickWhenClickable(verifyButton);
		sleep(2000);
		clickWhenClickable(pendingSaveButton);
		sleep(2000);
		WebElement submissionDate = driver.findElement(submissionDateInput);
		submissionDate.clear();
		submissionDate.sendKeys(Hooks.prop.getProperty("submission.date.value"));
		submissionDate.sendKeys(Keys.TAB);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(submissionNoteInput))
				.sendKeys(Hooks.prop.getProperty("submission.note.value"));
		clickWhenClickable(saveSubmissionButton);
	}

	public void submitAllPAInClinicalModule() {
		sleep(3000);
		clickWhenClickable(newClinicalPAButton);
		sleep(2000);
		clickWhenClickable(addPatientButton);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientIdInput))
				.sendKeys(Hooks.prop.getProperty("patient.id.value"));
		clickWhenClickable(patientSearchButton);
		sleep(2000);
		clickWhenClickable(firstPatientRadio);
		sleep(1000);
		clickWhenClickable(selectPatientButton);
		sleep(5000);
		clickWhenClickable(addDrugButton);
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(drugNameInput))
				.sendKeys(Hooks.prop.getProperty("drug.name.input.value"));
		clickWhenClickable(drugSearchButton);
		sleep(2000);
		clickWhenClickable(selectDrugRadio);
		sleep(1000);
		clickWhenClickable(selectDrugButton);
		sleep(5000);
		clickWhenClickable(addProviderButton);
		sleep(4000);
		clickWhenClickable(selectProviderRadio);
		sleep(3000);
		clickWhenClickable(selectProviderButton);
		sleep(4000);
		clickWhenClickable(addPartnerButton);
		sleep(3000);
		clickWhenClickable(fullSearchRadio);
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(businessNameInput))
				.sendKeys(Hooks.prop.getProperty("business.name.input.value"));
		clickWhenClickable(partnerSearchButton);
		sleep(3000);
		clickWhenClickable(selectPartnerRadio);
		sleep(3000);
		clickWhenClickable(selectPartnerButton);
		sleep(3000);
		WebElement receivedDate = driver.findElement(receivedDateInput);
		receivedDate.clear();
		receivedDate.sendKeys(Hooks.prop.getProperty("received.date.value"));
		receivedDate.sendKeys(Keys.TAB);
		sleep(2000);
		clickWhenClickable(saveButton);
		sleep(2000);
		clickWhenClickable(patientDetailsTab);
		clickWhenClickable(pharmacyDetailsTab);
		clickWhenClickable(providerDetailsTab);
		clickWhenClickable(drugDetailsTab);
		clickWhenClickable(verifyButton);
		sleep(2000);
		clickWhenClickable(pendingSaveButton);
		sleep(2000);
		WebElement submissionDate = driver.findElement(submissionDateInput);
		submissionDate.clear();
		submissionDate.sendKeys(Hooks.prop.getProperty("submission.date.value"));
		submissionDate.sendKeys(Keys.TAB);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(submissionNoteInput))
				.sendKeys(Hooks.prop.getProperty("submission.note.value"));
		clickWhenClickable(saveSubmissionButton);
	}

	public void verifyAllPAInClinicalModule() {
		sleep(3000);
		clickWhenClickable(newClinicalPAButton);
		sleep(2000);
		clickWhenClickable(addPatientButton);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientIdInput))
				.sendKeys(Hooks.prop.getProperty("patient.id.value"));
		clickWhenClickable(patientSearchButton);
		sleep(2000);
		clickWhenClickable(firstPatientRadio);
		sleep(1000);
		clickWhenClickable(selectPatientButton);
		sleep(5000);
		clickWhenClickable(addDrugButton);
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(drugNameInput))
				.sendKeys(Hooks.prop.getProperty("drug.name.input.value"));
		clickWhenClickable(drugSearchButton);
		sleep(2000);
		clickWhenClickable(selectDrugRadio);
		sleep(1000);
		clickWhenClickable(selectDrugButton);
		sleep(5000);
		clickWhenClickable(addProviderButton);
		sleep(4000);
		clickWhenClickable(selectProviderRadio);
		sleep(3000);
		clickWhenClickable(selectProviderButton);
		sleep(4000);
		clickWhenClickable(addPartnerButton);
		sleep(3000);
		clickWhenClickable(fullSearchRadio);
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(businessNameInput))
				.sendKeys(Hooks.prop.getProperty("business.name.input.value"));
		clickWhenClickable(partnerSearchButton);
		sleep(3000);
		clickWhenClickable(selectPartnerRadio);
		sleep(3000);
		clickWhenClickable(selectPartnerButton);
		sleep(3000);
		WebElement receivedDate = driver.findElement(receivedDateInput);
		receivedDate.clear();
		receivedDate.sendKeys(Hooks.prop.getProperty("received.date.value"));
		receivedDate.sendKeys(Keys.TAB);
		sleep(2000);
		clickWhenClickable(saveButton);
		sleep(2000);
		clickWhenClickable(patientDetailsTab);
		clickWhenClickable(pharmacyDetailsTab);
		clickWhenClickable(providerDetailsTab);
		clickWhenClickable(drugDetailsTab);
		clickWhenClickable(verifyButton);
		sleep(2000);
		clickWhenClickable(pendingSaveButton);
		sleep(2000);
		WebElement submissionDate = driver.findElement(submissionDateInput);
		submissionDate.clear();
		submissionDate.sendKeys(Hooks.prop.getProperty("submission.date.value"));
		submissionDate.sendKeys(Keys.TAB);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(submissionNoteInput))
				.sendKeys(Hooks.prop.getProperty("submission.note.value"));
		clickWhenClickable(saveSubmissionButton);
	}

	public void userShouldBeAbleToGenerateAllPAInClinicalModule() {
		sleep(3000);
		clickWhenClickable(newClinicalPAButton);
		sleep(2000);
		clickWhenClickable(addPatientButton);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientIdInput))
				.sendKeys(Hooks.prop.getProperty("patient.id.value"));
		clickWhenClickable(patientSearchButton);
		sleep(2000);
		clickWhenClickable(firstPatientRadio);
		sleep(1000);
		clickWhenClickable(selectPatientButton);
		sleep(5000);
		clickWhenClickable(addDrugButton);
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(drugNameInput))
				.sendKeys(Hooks.prop.getProperty("drug.name.input.value"));
		clickWhenClickable(drugSearchButton);
		sleep(2000);
		clickWhenClickable(selectDrugRadio);
		sleep(1000);
		clickWhenClickable(selectDrugButton);
		sleep(5000);
		clickWhenClickable(addProviderButton);
		sleep(4000);
		clickWhenClickable(selectProviderRadio);
		sleep(3000);
		clickWhenClickable(selectProviderButton);
		sleep(4000);
		clickWhenClickable(addPartnerButton);
		sleep(3000);
		clickWhenClickable(fullSearchRadio);
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(businessNameInput))
				.sendKeys(Hooks.prop.getProperty("business.name.input.value"));
		clickWhenClickable(partnerSearchButton);
		sleep(3000);
		clickWhenClickable(selectPartnerRadio);
		sleep(3000);
		clickWhenClickable(selectPartnerButton);
		sleep(3000);
		WebElement dateInput = driver.findElement(receivedDateInput);
		dateInput.clear();
		dateInput.sendKeys(Hooks.prop.getProperty("date.input.value"));
		dateInput.sendKeys(Keys.TAB);
		sleep(2000);
		clickWhenClickable(saveButton);
		sleep(2000);
		clickWhenClickable(patientDetailsTab);
		clickWhenClickable(pharmacyDetailsTab);
		clickWhenClickable(providerDetailsTab);
		clickWhenClickable(drugDetailsTab);
		clickWhenClickable(verifyButton);
		sleep(2000);
		clickWhenClickable(pendingSaveButton);
		sleep(2000);
		WebElement submissionDate = driver.findElement(submissionDateInput);
		submissionDate.clear();
		submissionDate.sendKeys(Hooks.prop.getProperty("submission.date.value"));
		submissionDate.sendKeys(Keys.TAB);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(submissionNoteInput))
				.sendKeys(Hooks.prop.getProperty("submission.note.value"));
		clickWhenClickable(saveSubmissionButton);
	}

	public void createProfileWithAllAccessForAllPA() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createProfileWithViewAccessForRemoteMonitoringReportInClinicalModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement externalDetailsAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalRemoteMonitorReportAllLabel));
		externalDetailsAllLabel.click();
		sleep(2000);
		WebElement externalDetailsAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(clinicalRemoteMonitorReportViewLabel));
		externalDetailsAddLabel.click();
		sleep(2000);

	}

	// RPM / RPM Status
	public void addOrEditRpmStatusNotAllowed() {
		sleep(3000);
		assertElementNotPresent(saveRpmButton);
		assertElementNotPresent(editRpmButton);
	}

	public void deleteRpmStatusAllowed() {
		sleep(3000);
		clickWhenClickable(bucketDropdownIcon);
		sleep(2000);
		clickWhenClickable(editOption);
		sleep(2000);
		clickWhenClickable(rpmStatusLink);
		sleep(2000);
		clickWhenClickable(deleteRpmStatusButton);
		sleep(3000);
		clickWhenClickable(confirmDeleteButton);
	}

	public void createDeleteOnlyRpmProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement externalDetailsAllLabel = wait.until(ExpectedConditions.elementToBeClickable(rpmStatusAllLabel));
		externalDetailsAllLabel.click();
		sleep(2000);
		WebElement externalDetailsAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientRPMStatusDeleteLabel));
		externalDetailsAddLabel.click();
		sleep(2000);

	}

	public void addOrDeleteRpmStatusNotAllowed() {
		sleep(3000);
		assertElementNotPresent(saveRpmButton);
		assertElementNotPresent(deleteRpmButton);
	}

	public void userHasEditAccessToRpmStatus() {
		sleep(3000);
		clickWhenClickable(bucketDropdownIcon);
		sleep(2000);
		clickWhenClickable(editOption);
		sleep(2000);
		clickWhenClickable(rpmStatusLink);
		sleep(2000);
		clickWhenClickable(editRpmStatusButton);
		sleep(3000);
		clickWhenClickable(addRpmStatusDropdown);
		sleep(1000);
		selectDropdownByIndexWhenReady(addRpmStatusDropdown, 1);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(addRpmNoteField))
				.sendKeys(Hooks.prop.getProperty("rpm.note.value"));
		clickWhenClickable(saveEditedButton);
		sleep(2000);
	}

	public void userCannotEditOrDeleteRpmStatus() {
		sleep(3000);
		assertElementNotPresent(editRpmStatus);
		assertElementNotPresent(deleteRpmStatus);
	}

	public void userCanAddRpmStatus() {
		sleep(3000);
		clickWhenClickable(bucketDropdownIcon);
		sleep(2000);
		clickWhenClickable(RPMStatuseditOption);
		sleep(2000);
		clickWhenClickable(rpmStatusLink);
		sleep(2000);
		clickWhenClickable(rpmStatusDropdown);
		sleep(1000);
		selectDropdownByIndexWhenReady(rpmStatusDropdown, 1);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(rpmNoteField))
				.sendKeys(Hooks.prop.getProperty("rpm.note.value"));
		clickWhenClickable(RPMStatussaveButton);
		sleep(2000);
	}

	public void createEditOnlyRpmProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement externalDetailsAllLabel = wait.until(ExpectedConditions.elementToBeClickable(rpmStatusAllLabel));
		externalDetailsAllLabel.click();
		sleep(2000);
		WebElement externalDetailsAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientRPMStatusEditLabel));
		externalDetailsAddLabel.click();
		sleep(2000);

	}

	public void createRpmAddProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement externalDetailsAllLabel = wait.until(ExpectedConditions.elementToBeClickable(rpmStatusAllLabel));
		externalDetailsAllLabel.click();
		sleep(2000);
		WebElement externalDetailsAddLabel = wait.until(ExpectedConditions.elementToBeClickable(rpmStatusAddLabel));
		externalDetailsAddLabel.click();
		sleep(2000);

	}

	// Prior Authorization PA Progress Step
	public void cannotAddOrEditPAProgressStepInClinicalModule() {
		assertElementNotPresent(saveOutcomeNoteButtonpa);
		clickWhenClickable(firstBucketDropdown);
		assertElementNotPresent(editOption);
	}

	public void canDeletePAProgressStepInClinicalModule() {
		clickWhenClickable(firstBucketDropdown);
		clickWhenClickable(editOption);
		clickWhenClickable(firstBucketDropdown);
		clickWhenClickable(deleteOption);
		clickWhenClickable(confirmDeleteButtonpa);
	}

	public void createProfileWithDeleteOnlyPAProgressStepAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement externalDetailsAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(paProgressStepAllLabel));
		externalDetailsAllLabel.click();
		sleep(2000);
		WebElement externalDetailsAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(paProgressStepDeleteLabel));
		externalDetailsAddLabel.click();
		sleep(2000);

	}

	public void cannotAddOrDeletePAProgressStepInClinicalModule() {
		assertElementNotPresent(saveOutcomeNoteButtonpa);
		clickWhenClickable(firstBucketDropdown);
		assertElementNotPresent(deleteOption);
	}

	public void canEditPAProgressStepInClinicalModule() {
		clickWhenClickable(firstBucketDropdown);
		clickWhenClickable(editOption);
		clickWhenClickable(firstBucketDropdown);
		clickWhenClickable(editOption);
		clickWhenClickable(progressStatusDropdownEdit);
		selectDropdownByIndexWhenReady(progressStatusDropdownEdit, 1);
		wait.until(ExpectedConditions.visibilityOfElementLocated(editNotesTextarea))
				.sendKeys(Hooks.prop.getProperty("edit.notes.value"));
		clickWhenClickable(saveEditNoteButton);
	}

	public void createProfileForPAProgressStep() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement externalDetailsAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(paProgressStepAllLabel));
		externalDetailsAllLabel.click();
		sleep(2000);
		WebElement externalDetailsAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(paProgressStepAddLabel));
		externalDetailsAddLabel.click();
		sleep(2000);

	}

	public void createProfileWithEditOnlyPAProgressStepAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement externalDetailsAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(paProgressStepAllLabel));
		externalDetailsAllLabel.click();
		sleep(2000);
		WebElement externalDetailsAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(paProgressStepEditLabel));
		externalDetailsAddLabel.click();
		sleep(2000);

	}

	public void cannotEditOrDeletePAProgressStepInClinicalModule() {
		sleep(2000);
		clickWhenClickable(firstBucketDropdown);
		sleep(2000);
		assertElementNotPresent(editOption);
		assertElementNotPresent(deleteOption);
	}

	public void canAddPAProgressStepInClinicalModule() {
		sleep(2000);
		clickWhenClickable(firstBucketDropdown);
		clickWhenClickable(editOptionStep);
		sleep(2000);
		clickWhenClickable(progressStatusDropdownStep);
		selectDropdownByIndexWhenReady(progressStatusDropdownStep, 1);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(notesTextarea))
				.sendKeys(Hooks.prop.getProperty("notes.textarea.value"));
		clickWhenClickable(saveButtonStep);
	}

	// RPM / Digital Signature
	public void cannotEditOrDownloadDigitalSignatureInClinicalModule() {
		clickWhenClickable(digitalSignatureLink);
		assertElementNotPresent(editDigitalSignatureButton);

	}

	public void cannotEditOrDeleteDigitalSignatureInClinicalModule() {
		clickWhenClickable(digitalSignatureLink);
		assertElementNotPresent(editDigitalSignatureButton);
		assertElementNotPresent(deleteDigitalSignatureButton);
	}

	public void canDownloadDigitalSignatureInClinicalModule() {
		clickWhenClickable(firstBucketDropdown);
		clickWhenClickable(editOption);
		clickWhenClickable(digitalSignatureLink);

	}

	public void createProfileWithDownloadOnlyDigitalSignatureAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement externalDetailsAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(digitalSignatureAllLabel));
		externalDetailsAllLabel.click();
		sleep(2000);
		WebElement externalDetailsAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(downloadDigitalSignatureLabel));
		externalDetailsAddLabel.click();
		sleep(2000);

	}

	public void canDeleteDigitalSignatureInClinicalModule() {
		clickWhenClickable(firstBucketDropdown);
		clickWhenClickable(editOption);
		clickWhenClickable(digitalSignatureLink);
		clickWhenClickable(deleteWizardButton);
		clickWhenClickable(confirmDeleteButtonpa);
	}

	public void cannotDeleteOrDownloadDigitalSignatureInClinicalModule() {
		sleep(2000);
		clickWhenClickable(digitalSignatureLink);
		sleep(2000);
		assertElementNotPresent(deleteDigitalSignatureButton);

	}

	public void createProfileWithDeleteOnlyDigitalSignatureAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement externalDetailsAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(digitalSignatureAllLabel));
		externalDetailsAllLabel.click();
		sleep(2000);
		WebElement externalDetailsAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(digitalSignatureDeleteLabel));
		externalDetailsAddLabel.click();
		sleep(2000);

	}

	public void createProfileWithEditOnlyDigitalSignatureAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement externalDetailsAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(digitalSignatureAllLabel));
		externalDetailsAllLabel.click();
		sleep(2000);
		WebElement externalDetailsAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(digitalSignatureEditLabel));
		externalDetailsAddLabel.click();
		sleep(2000);

	}

	public void canEditDigitalSignatureInClinicalModule() {
		sleep(2000);
		clickWhenClickable(firstBucketDropdownRpm);
		clickWhenClickable(editOptionRpm);
		sleep(2000);
		clickWhenClickable(digitalSignatureLink);
		clickWhenClickable(firstSignatureEditIcon);
		sleep(2000);
		clickWhenClickable(signerDropdown);
		selectDropdownByIndexWhenReady(signerDropdown, 1);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(signerFullNameInput))
				.sendKeys(Hooks.prop.getProperty("signer.fullname.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(signerEmailInput))
				.sendKeys(Hooks.prop.getProperty("signer.email.value"));
		clickWhenClickable(addManualSignerButton);
		sleep(2000);
		clickWhenClickable(nextButtonRpm);
		clickWhenClickable(nextButtonRpm);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(subjectInput))
				.sendKeys(Hooks.prop.getProperty("email.subject.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(emailEditor))
				.sendKeys(Hooks.prop.getProperty("email.editor.value"));
		sleep(2000);
		clickWhenClickable(finishButton);
	}

	// RPM / CPT Code
	public void cannotAddOrEditRPMCPTCodeInClinicalModule() {
		assertElementNotPresent(addCptCodeButton);
		assertElementNotPresent(editRpmCptCodeButton);
	}

	public void canDeleteRPMCPTCodeInClinicalModule() {
		clickWhenClickable(firstBucketDropdown);
		clickWhenClickable(editOption);
		clickWhenClickable(cptCodeLink);
		clickWhenClickable(cptMonthDropdown);
		selectDropdownByIndexWhenReady(cptMonthDropdown, 1);
		clickWhenClickable(cptYearDropdown);
		selectDropdownByIndexWhenReady(cptYearDropdown, 1);
		clickWhenClickable(addCptCodeButton);
		clickWhenClickable(cpt99091Label);
		clickWhenClickable(saveCptCodeButton);
		clickWhenClickable(cptFilterMonthDropdown);
		selectDropdownByIndexWhenReady(cptFilterMonthDropdown, 1);
		clickWhenClickable(cptFilterYearDropdown);
		selectDropdownByIndexWhenReady(cptFilterYearDropdown, 1);
		clickWhenClickable(cptApplyButton);
		clickWhenClickable(deleteRpmCptCodeButton);
		clickWhenClickable(confirmDeleteRPMCPTCodeButton);
	}

	public void createProfileWithDeleteOnlyCPTCodeAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement externalDetailsAllLabel = wait.until(ExpectedConditions.elementToBeClickable(rpmCptCodeAllLabel));
		externalDetailsAllLabel.click();
		sleep(2000);
		WebElement externalDetailsAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(rpmEventCPTCodeDeleteLabel));
		externalDetailsAddLabel.click();
		sleep(2000);

	}

	public void cannotAddOrDeleteRPMCPTCodeInClinicalModule() {
		sleep(2000);
		clickWhenClickable(cptCodeLink);
		sleep(2000);
		assertElementNotPresent(addCptCodeButton);
		assertElementNotPresent(deleteRpmCptCodeButton);
	}

	public void canEditRPMCPTCodeInClinicalModule() {
		sleep(2000);
		clickWhenClickable(firstBucketDropdown);
		clickWhenClickable(editOption);
		sleep(2000);
		clickWhenClickable(cptCodeLink);
		sleep(2000);
		clickWhenClickable(cptMonthDropdown);
		selectDropdownByIndexWhenReady(cptMonthDropdown, 1);
		sleep(2000);
		clickWhenClickable(cptYearDropdown);
		selectDropdownByIndexWhenReady(cptYearDropdown, 1);
		sleep(2000);
		clickWhenClickable(addCptCodeButton);
		clickWhenClickable(cpt99091Label);
		clickWhenClickable(saveCptCodeButton);
		sleep(2000);
		clickWhenClickable(cptFilterMonthDropdown);
		selectDropdownByIndexWhenReady(cptFilterMonthDropdown, 1);
		sleep(2000);
		clickWhenClickable(cptFilterYearDropdown);
		selectDropdownByIndexWhenReady(cptFilterYearDropdown, 1);
		sleep(2000);
		clickWhenClickable(cptApplyButton);
		sleep(2000);
		clickWhenClickable(editRpmCptCodeButton);
		wait.until(ExpectedConditions.visibilityOfElementLocated(rpmCptCodeRepeatInput))
				.sendKeys(Hooks.prop.getProperty("rpm.cpt.code.repeat.value"));
		clickWhenClickable(saveRpmCptCodeButton);
	}

	public void createProfileWithEditOnlyCPTCodeAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement externalDetailsAllLabel = wait.until(ExpectedConditions.elementToBeClickable(rpmCptCodeAllLabel));
		externalDetailsAllLabel.click();
		sleep(2000);
		WebElement externalDetailsAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(rpmEventCPTCodeEditLabel));
		externalDetailsAddLabel.click();
		sleep(2000);

	}

	public void cannotEditOrDeleteRPMCPTCodeInClinicalModule() {
		sleep(4000);
		assertElementNotPresent(editRpmCptCodeButton);
		assertElementNotPresent(deleteRpmCptCodeButton);
	}

	public void canAddRPMCPTCodeInClinicalModule() {
		sleep(2000);
		clickWhenClickable(firstBucketDropdown);
		clickWhenClickable(editOption);
		sleep(2000);
		clickWhenClickable(cptCodeLink);
		sleep(2000);
		clickWhenClickable(cptMonthDropdown);
		selectDropdownByIndexWhenReady(cptMonthDropdown, 1);
		sleep(2000);
		clickWhenClickable(cptYearDropdown);
		selectDropdownByIndexWhenReady(cptYearDropdown, 1);
		sleep(2000);
		clickWhenClickable(addCptCodeButton);
		clickWhenClickable(cpt99091Label);
		clickWhenClickable(saveCptCodeButton);
		sleep(2000);
		clickWhenClickable(cptFilterMonthDropdown);
		selectDropdownByIndexWhenReady(cptFilterMonthDropdown, 1);
		sleep(2000);
		clickWhenClickable(cptFilterYearDropdown);
		selectDropdownByIndexWhenReady(cptFilterYearDropdown, 1);
		sleep(2000);
		clickWhenClickable(cptApplyButton);
		sleep(2000);

	}

	public void createProfileWithAddOnlyCPTCodeAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement externalDetailsAllLabel = wait.until(ExpectedConditions.elementToBeClickable(rpmCptCodeAllLabel));
		externalDetailsAllLabel.click();
		sleep(2000);
		WebElement externalDetailsAddLabel = wait.until(ExpectedConditions.elementToBeClickable(rpmCptCodeAddLabel));
		externalDetailsAddLabel.click();
		sleep(2000);

	}

	// Device Usage Statistic Report
	public void theUserShouldBeAbleToExportDeviceUsageStatisticReportInClinicalModule() {
		clickWhenClickable(exportToExcelButton);
	}

	public void theUserShouldNotBeAbleToExportDeviceUsageStatisticReportInClinicalModule() {
		assertElementNotPresent(exportToExcelButton);
	}

	public void createProfileWithViewOnlyAccessToDeviceUsageReport() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement deviceUsageReportAllCheckbox = wait
				.until(ExpectedConditions.elementToBeClickable(deviceUsageStatisticReportAllLabel));
		deviceUsageReportAllCheckbox.click();
		sleep(2000);
		WebElement deviceUsageReportViewCheckbox = wait
				.until(ExpectedConditions.elementToBeClickable(deviceUsageStatisticReportViewLabel));
		deviceUsageReportViewCheckbox.click();

	}

	public void createProfileWithViewAndExportAccessToDeviceUsageReport() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();

	}

	// RPM / RPM Progress Step
	public void addOrEditRpmProgressStepNotAllowed() {
		sleep(3000);
		assertElementNotPresent(saveProgressButton);
		assertElementNotPresent(editProgressStepButton);
	}

	public void addOrDeleteRpmProgressStepNotAllowed() {
		sleep(3000);
		assertElementNotPresent(saveProgressButton);
		assertElementNotPresent(deleteProgressButton);
	}

	public void deleteRpmProgressStepAllowed() {
		sleep(3000);
		clickWhenClickable(bucketDropdownIcon);
		sleep(2000);
		clickWhenClickable(editOption);
		sleep(2000);
		clickWhenClickable(progressStepsLink);
		sleep(2000);
		clickWhenClickable(deleteProgressStepButton);
		sleep(2000);
		clickWhenClickable(confirmDeleteButton);
	}

	public void editRpmProgressStepAllowed() {
		sleep(3000);
		clickWhenClickable(bucketDropdownIcon);
		sleep(2000);
		clickWhenClickable(editOption);
		sleep(2000);
		clickWhenClickable(progressStepsLink);
		sleep(2000);
		clickWhenClickable(editProgressStepButton);
		sleep(2000);
		clickWhenClickable(addProgressStatusDropdown);
		sleep(1000);
		selectDropdownByIndexWhenReady(addProgressStatusDropdown, 1);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(addRemoteMonitoringNoteField))
				.sendKeys(Hooks.prop.getProperty("remote.monitoring.note.value"));
		clickWhenClickable(saveEditedButton);
		sleep(2000);
	}

	public void editOrDeleteRpmProgressStepNotAllowed() {
		sleep(3000);
		assertElementNotPresent(editProgressStepButton);
		assertElementNotPresent(deleteProgressStepButton);
	}

	public void addRpmProgressStepAllowed() {
		sleep(3000);
		clickWhenClickable(bucketDropdownIcon);
		sleep(2000);
		clickWhenClickable(editOption);
		sleep(2000);
		clickWhenClickable(progressStepsLink);
		sleep(2000);
		clickWhenClickable(progressStatusDropdown);
		sleep(1000);
		selectDropdownByIndexWhenReady(progressStatusDropdown, 1);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(remoteMonitoringNoteField))
				.sendKeys(Hooks.prop.getProperty("remote.monitoring.note.value"));
		clickWhenClickable(saveProgressButton);
		sleep(2000);
	}

	public void createEditOnlyRpmProgressStepProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement externalDetailsAllLabel = wait.until(ExpectedConditions.elementToBeClickable(rpmStatusAllLabel));
		externalDetailsAllLabel.click();
		sleep(2000);
		WebElement externalDetailsAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(rpmProgressStepEditLabel));
		externalDetailsAddLabel.click();
		sleep(2000);

	}

	public void createDeleteOnlyRpmProgressStepProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement externalDetailsAllLabel = wait.until(ExpectedConditions.elementToBeClickable(rpmStatusAllLabel));
		externalDetailsAllLabel.click();
		sleep(2000);
		WebElement externalDetailsAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(rpmProgressStepDeleteLabel));
		externalDetailsAddLabel.click();
		sleep(2000);

	}

	public void createAddOnlyRpmProgressStepProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement externalDetailsAllLabel = wait.until(ExpectedConditions.elementToBeClickable(rpmStatusAllLabel));
		externalDetailsAllLabel.click();
		sleep(2000);
		WebElement externalDetailsAddLabel = wait.until(ExpectedConditions.elementToBeClickable(rpmStatusAddLabel));
		externalDetailsAddLabel.click();
		sleep(2000);

	}

}
