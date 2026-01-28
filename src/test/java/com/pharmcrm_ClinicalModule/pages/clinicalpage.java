package com.pharmcrm_ClinicalModule.pages;

import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;

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

import org.junit.Assert;

public class clinicalpage {

	private WebDriver driver;
	private WebDriverWait wait;

	// Remote Patient Monitoring (RPM)
	private By rpmActionMenuBtn = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	private By rpmEditOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[contains(text(),'Edit')]");
	private By outgoingCallIcon = By.xpath(
			"//div[@id='page-wrapper']//div[@class='rmBesic-data']//div[1][1]//a[1]//*[name()='svg']//*[name()='path' and @id='Path_6']");

	private static final By RPM_ACTION_MENU = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	private static final By RPM_EDIT_OPTION = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[contains(text(),'Edit')]");

	By rpmFirstRecordActionMenu = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	By rpmDeleteOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Delete']");
	By rpmDeleteConfirmButton = By.id("btnDeleteConfirm");

	private static final By PROGRESS_STEPS_TAB = By.xpath("//a[normalize-space()='Progress Steps']");
	private static final By PROGRESS_STATUS_DROPDOWN = By.id("ProgressStatus");
	private static final By NOTE_TEXTAREA = By.id("RemoteMonitoring_Note");
	private static final By SAVE_NOTE_BUTTON = By
			.xpath("//button[@id='btnSaveRemoteMonitoringNote']//*[name()='svg']//*[name()='path' and @id='Path_23']");

	private static final By BUCKET_DROPDOWN_BUTTON = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	private static final By EDIT_OPTION = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	private static final By DELETE_OPTION = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");

	private static final By NEW_RPM_BUTTON = By.xpath("//span[normalize-space()='New Patient Remote Monitoring']");
	private static final By SEARCH_BUTTON = By.xpath("//button[normalize-space()='Search']");
	private static final By SELECT_FIRST_PATIENT_RADIO = By.id("0c950395-71e6-4134-b8e1-a405b7ad98f6");
	private static final By CONFIRM_PATIENT_BUTTON = By
			.xpath("//div[@class='modal-footer text-right d-block']//button[@id='btnPatient']");
	private static final By NEXT_BUTTON = By.xpath("//button[@id='btnNext']");
	private static final By SUBMIT_LINK = By.xpath("//a[normalize-space()='Submit']");

	// Reports / MTM Encounter Log
	private static final By EXPORT_TO_EXCEL_BUTTON = By.xpath("//span[normalize-space()='Export to Excel']");
	private static final By VIEW_DETAILS_ICON = By.xpath("//a[@class='txt-decor-none']//img");

	// Med Recons / Current Medication
	private static final By NEW_CLINICAL_MED_RECONS = By.xpath("//span[normalize-space()='New Clinical Med Recons']");
	private static final By ADD_PATIENT_ICON = By.xpath("//a[@id='addPatientNamePopup']//img");
	private static final By PATIENT_SEARCH_INPUT = By.id("Filter_PatientId");
	private static final By PATIENT_SEARCH_BUTTON = By.xpath("//button[normalize-space()='Search']");
	private static final By PATIENT_CONFIRM_BUTTON = By.id("btnPatient");
	private static final By ADD_CURRENT_MEDICATION = By.xpath("//span[normalize-space()='Add Current Medication']");
	private static final By DRUG_SEARCH_BUTTON = By.xpath("//button[normalize-space()='Search']");
	private static final By DRUG_CONFIRM_BUTTON = By.id("btnDrug");
	private static final By ADD_DRUG_ACTION = By.xpath("//td[@class='text-right']//a[1]//*[name()='svg']");
	private static final By DELETE_MEDICATION_ICON = By
			.xpath("//tr[@id='trMed_1']//a[@id='btnDeleteMedicationConfirm']//img");
	private static final By DELETE_CONFIRM_BUTTON = By.id("deletepatientmedsonchart");
	private static final By SAVE_BUTTON = By.id("btnSave");

	private static final By ADD_CURRENT_MEDICATION_BUTTON = By
			.xpath("//span[normalize-space()='Add Current Medication']");
	private static final By DELETE_CURRENT_MEDICATION_ICON = By.xpath("//a[@id='btnDeleteMedicationConfirm']//img");
	private static final By NEW_MED_RECONS_BTN = By.xpath("//span[normalize-space()='New Clinical Med Recons']");
	private static final By ENCOUNTER_STATUS_DROPDOWN = By.id("ClinicalEncounter_EncounterStatus");
	private static final By PATIENT_POPUP_ICON = By.xpath("//a[@id='addPatientNamePopup']//img");
	private static final By PATIENT_ID_INPUT = By.id("Filter_PatientId");
	private static final By PATIENT_SEARCH_BTN = By.xpath("//button[normalize-space()='Search']");
	private static final By PATIENT_SELECT_CHECKBOX = By.xpath("//input[@id='0c950395-71e6-4134-b8e1-a405b7ad98f6']");
	private static final By PATIENT_CONFIRM_BTN = By.id("btnPatient");
	private static final By ADD_CURRENT_MEDICATION_BTN = By.xpath("//span[normalize-space()='Add Current Medication']");
	private static final By DRUG_LOOKUP_ICON = By.xpath("//div[@class='model-inp requiredfield']//img");
	private static final By DRUG_NAME_INPUT = By.id("Filter_DrugName");
	private static final By DRUG_SEARCH_BTN = By.xpath("//button[normalize-space()='Search']");
	private static final By DRUG_SELECT_CHECKBOX = By.xpath("//input[@id='0']");
	private static final By DRUG_CONFIRM_BTN = By.id("btnDrug");
	private static final By EDIT_MED_ICON = By.xpath("//tr[@id='trMed_1']//a[1]//img[1]");
	private static final By DIRECTION_INPUT = By.id("ExtendedMedsOnChart_Direction_1");
	private static final By SAVE_BTN = By.id("btnSave");
	private By editCurrentMedicationIcon = By.xpath("//tbody//a[1]//img[1]");
	private By deleteCurrentMedicationIcon = By.xpath("//a[@id='btnDeleteMedicationConfirm']//img");
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
	private By chkClinicalCareGiverNameAll = By.xpath("//label[@for='chkg21ClinicalCareGiverNameAll']");
	private By chkClinicalCareGiverNameAdd = By.xpath("//label[@for='chkg21ClinicalCareGiverNameAdd']");

	// Reports / CCM Encounter Log
	public By clinicalCCMLogAllLabel = By.xpath("//label[@for='chkg19ClinicalCCMLogAll']");
	public By clinicalCCMLogViewLabel = By.xpath("//label[@for='chkg19ClinicalCCMLogView']");

	// Reports / Call Log
	public By clinicalCallLogAllLabel = By.xpath("//label[@for='chkg19ClinicalCallLogAll']");
	public By clinicalCallLogViewLabel = By.xpath("//label[@for='chkg19ClinicalCallLogView']");

	// Patient / Provider Referral
	public By providerReferralAllLabel = By.xpath("//label[@for='chkg20ProviderReferralAll']");
	public By providerReferralViewLabel = By.xpath("//label[@for='chkg20ProviderReferralView']");

	private static final By REFER_TO_NEW_PROVIDER_BTN = By.xpath("//img[@src='/Content/img/svg/refer_float.svg']");

	private static final By CLINICAL_OBJECTIVE_COMPONENT_DD = By.id("ClinicalEncounter_ClinicalObjectiveComponentId");

	private static final By ENCOUNTER_STATUS_DD = By.id("ClinicalEncounter_EncounterStatus");

	private static final By SAVE_ENCOUNTER_BTN = By.id("btnEncounter");

	private static final By ADD_REFERRAL_PROVIDER_ICON = By.xpath("//a[@id='addReferralProviderNamePopup']//img");

	private static final By PROVIDER_RADIO_BTN = By.xpath("//li[@class='searchResult-li']//input[@type='radio'][1]");

	private static final By SELECT_PROVIDER_BTN = By.id("btnProvider");

	private static final By REFERRAL_ISSUE_TXT = By.id("ClinicalEncounter_ClinicalReferral_Issue");

	private static final By REFERRAL_CATEGORY_DD = By.id("ClinicalEncounter_ClinicalReferral_ReferralCategoryId");

	private static final By REFER_BTN = By.xpath("//img[@src='/Content/img/svg/refer_float.svg']");

	private static final By PATIENT_BUCKET_MENU = By.xpath("(//button[@id='bucketDrop']/i)[1]");

	private static final By EDIT_PATIENT_OPTION = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");

	private static final By CLINICAL_ENCOUNTERS_BTN = By.xpath("//button[normalize-space()='Clinical Encounters']");

	private static final By ADD_NEW_CLINICAL_ENCOUNTER_BTN = By
			.xpath("//button[normalize-space()='Add New Clinical Encounter']");

	private static final By REFERRAL_HEADER = By.xpath("//h1[normalize-space()='Referral']");

	// Reports / Medication Recommendation and Suggestions
	private By exportToExcelBtn = By.xpath("//span[normalize-space()='Export to Excel']");
	private static final By EXPORT_TO_EXCEL_BTN = By.xpath("//span[normalize-space()='Export to Excel']");
	public By clinicalMedicationRecommendationAllLabel = By
			.xpath("//label[@for='chkg19ClinicalMedicationRecommandationAll']");
	public By clinicalMedicationRecommendationViewLabel = By
			.xpath("//label[@for='chkg19ClinicalMedicationRecommandationView']");

	// Reports / Status Log

	private By exportToExcelButton = By.xpath("//span[normalize-space()='Export to Excel']");

	// Patients / Clinical Encounter Review
	private By star1DrugHeading = By.xpath("//h1[normalize-space()='Medications Suggestion']");

	// Patients / Clinical Encounter
	public By clinicalEncounterAllLabel = By.xpath("//label[@for='chkg14ClinicalEncounterAll']");
	public By clinicalEncounterAddLabel = By.xpath("//label[@for='chkg15ClinicalEncounterAdd']");

	private By firstEncounterReviewIcon = By.xpath("//tbody/tr[1]/td[7]/div[1]/a[1]/img[1]");

	private By encounterDeleteOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[contains(text(),'Delete')]");

	private By encounterDropdownContainer = By
			.xpath("//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]");
	private By clinicalEncountersButton = By.xpath("//button[normalize-space()='Clinical Encounters']");
	private By addNewEncounterButton = By.xpath("//button[normalize-space()='Add New Clinical Encounter']");
	private By componentDropdown = By.id("ClinicalEncounter_ClinicalObjectiveComponentId");
	private By statusDropdown = By.id("ClinicalEncounter_EncounterStatus");
	private By saveEncounterButton = By.id("btnEncounter");
	private By patientActionMenuButton = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	private By patientEditOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[contains(text(),'Edit')]");
	private By encounterActionMenuButton = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	private By encounterEditOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[contains(text(),'Edit')]");
	private By encounterTypeDropdown = By.id("ClinicalEncounter_EncounterType");

	// SOAP Components
	private By newSoapComponentButton = By.xpath("//span[normalize-space()='New Clinical SOAP Components']");
	private By nameField = By.id("ClinicalObjectiveComponent_Name");
	private By typeDropdown = By.id("ClinicalObjectiveComponent_Type");
	public By clinicalObjectiveAllLabel = By.xpath("//label[@for='chkg14ClinicalObjectiveAll']");
	public By clinicalObjectiveAddLabel = By.xpath("//label[@for='chkg14ClinicalObjectiveAdd']");

	// Patients
	private By labelA = By.xpath("//label[normalize-space()='A']");
	private By newPatientButton = By.xpath("//span[normalize-space()='New Patient']");
	private By lastNameField = By.id("Patient_LastName");
	private By firstNameField = By.id("Patient_FirstName");
	private By birthDateField = By.id("Patient_BirthDate");
	private By todayDateInCalendar = By.cssSelector(".ui-datepicker-calendar .ui-state-highlight");
	private By addNewPatientButton = By.xpath("//button[normalize-space()='Add New Patient']");
	private By phoneNumberField = By.id("Patient_PhoneNumber");
	private By findPatientButton = By.id("btnFindPatient");
	private By existingPatientRadio = By.xpath("//input[@type='radio']");
	private By selectExistingPatientButton = By.xpath("//button[normalize-space()='Select Existing Patient']");
	public By clinicalPatientAllLabel = By.xpath("//label[@for='chkg13ClinicalPatientAll']");
	public By clinicalPatientAddLabel = By.xpath("//label[@for='chkg13ClinicalPatientAdd']");

	// CPT Code
	private By actionMenuButton = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	private By newCptCodeButton = By.xpath("//span[normalize-space()='New CPT Code']");
	private By cptCodeField = By.id("RPMStatus_Name");
	private By descriptionField = By.id("RPMStatus_Description");
	private By dropdownContainer = By
			.xpath("//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]");
	private static final By CPT_ALL_PERMISSION = By.xpath("//label[@for='chkg40CPTCodeAll']");
	private static final By CPT_ADD_PERMISSION = By.xpath("//label[@for='chkg40CPTCodeAdd']");

	private static final By CPT_CODE_NAME_INPUT = By.xpath("//input[@id='CPTCode_Name']");

	private static final By NEW_CPT_CODE_BTN = By.xpath("//span[normalize-space()='New CPT Code']");

	private static final By CPT_CODE_INPUT = By.id("CPTCode_Code");

	private static final By CPT_DESCRIPTION_INPUT = By.id("CPTCode_Description");

	private static final By SAVE_CPT_BTN = By.id("btnSave");

	// RPM Status
	public By rpmStatusAllLabel = By.xpath("//label[@for='chkg39RPMStatusAll']");
	public By rpmStatusAddLabel = By.xpath("//label[@for='chkg39RPMStatusAdd']");

	private By firstBucketMenu = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	private By newRPMStatusBtn = By.xpath("//span[normalize-space()='New RPM Status']");
	private By firstActionMenuBtn = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	private static final By NEW_RPM_STATUS_BUTTON = By.xpath("//span[normalize-space()='New RPM Status']");
	private static final By FIRST_RECORD_ACTION_DROPDOWN = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	private static final By DELETE_RPM_STATUS_OPTION = By
			.xpath("//div[contains(@class,'gridRecordContext')]//span[contains(text(),'Delete')]");

	private By editRPMStatusOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");

	private By deleteRPMStatusOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");

	private By bucketDropIcon = By.xpath("(//button[@id='bucketDrop']/i)[1]");

	private By newRPMStatusButton = By.xpath("//span[normalize-space()='New RPM Status']");

	private By rpmStatusNameInput = By.id("RPMStatus_Name");

	// Registered Device
	public By registeredDeviceAllLabel = By.xpath("//label[@for='chkg36RegisteredDeviceAll']");
	public By registeredDeviceAddLabel = By.xpath("//label[@for='chkg36RegisteredDeviceAdd']");

	private By viewActivityOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[normalize-space()='View Activity']");
	private By partnerDeallocationTab = By.xpath("//span[normalize-space()='Partner DeAllocation']");
	private By partnerAllocationTab = By.xpath("//span[normalize-space()='Partner Allocation']");

	private By apoloPharmacyRadioButton = By
			.xpath("//ul[@id='ulUsers']//input[@type='radio' and @data-name='Apolo Pharmacy']");

	private By providerDeallocationTab = By.xpath("//span[normalize-space()='Provider DeAllocation']");

	private By returnedDeviceCheckbox = By.xpath("//label[@for='IsReturnedProviderDevice']");

	private By confirmDeallocateButton = By.xpath("//button[@id='btnDeleteProviderDeviceConfirm']");

	private By providerAllocationTab = By.xpath("//span[normalize-space()='Provider Allocation']");

	private By firstProviderRadioButton = By.xpath("//ul[@id='ulUsers']//input[@type='radio'][1]");

	private By allocateButton = By.xpath("//button[@class='btn btn-primary']");

	private By historyOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[normalize-space()='History']");

	private By fileUploadInput = By.xpath("//input[@type='file']");

	private By uploadButton = By.xpath("//*[name()='path' and @id='Union_5']");

	private By downloadTemplateButton = By.xpath("//span[normalize-space()='Download Template']");

	private By newRegisteredDeviceButton = By.xpath("//span[normalize-space()='New Registered Device']");

	private By deviceDropdown = By.id("RegisteredDevice_DeviceId");

	private By imeiField = By.id("RegisteredDevice_IMEI");

	private By serialNumberField = By.id("RegisteredDevice_SerialNumber");

	// Device Master
	public By deviceMasterAllLabel = By.xpath("//label[@for='chkg35DeviceMasterAll']");
	public By deviceMasterViewLabel = By.xpath("//label[@for='chkg35DeviceMasterView']");

	private By deviceMasterDescriptionField = By.id("DeviceMaster_Description");

	private By saveDeviceMasterButton = By.id("btnSaveDeviceMaster");

	// Encounter Status
	public By encounterStatusAllLabel = By.xpath("//label[@for='chkg27EncounterStatusAll']");
	public By encounterStatusAddLabel = By.xpath("//label[@for='chkg27EncounterStatusAdd']");

	private By newEncounterStatusButton = By.xpath("//span[normalize-space()='New Encounter Status']");

	private By encounterStatusNameField = By.id("ClinicalEncounterStatus_Name");

	// ROS Group Type
	public By rosGroupTypeAllLabel = By.xpath("//label[@for='chkg27ROSGroupTypeAll']");
	public By rosGroupTypeAddLabel = By.xpath("//label[@for='chkg27ROSGroupTypeAdd']");

	private By newROSGroupTypeButton = By.xpath("//span[normalize-space()='New ROS Group Type']");

	private By rosGroupTypeNameField = By.id("ROSGroupType_Name");

	// Remote Monitoring Parameters (RMP)
	private By newRMPButton = By.xpath("//span[normalize-space()='New Remote Monitoring Parameter']");
	private By rmpNameField = By.id("RemoteMonitoringParameter_Name");
	public By remoteMonitoringAllLabel = By.xpath("//label[@for='chkg27RemoteMonitoringParameterAll']");
	public By remoteMonitoringAddLabel = By.xpath("//label[@for='chkg27RemoteMonitoringParameterAdd']");

	// Outcome Action
	public By clinicalOutcomeAllLabel = By.xpath("//label[@for='chkg27ClinicalOutcomeOfActionAll']");
	public By clinicalOutcomeAddLabel = By.xpath("//label[@for='chkg27ClinicalOutcomeOfActionAdd']");

	private By newOutcomeActionButton = By.xpath("//span[normalize-space()='New Outcome Action']");

	private By outcomeActionNameField = By.id("OutcomeAction_Name");

	// ROS
	public By rosAllLabel = By.xpath("//label[@for='chkg26ROSAll']");
	public By rosAddLabel = By.xpath("//label[@for='chkg26ROSAdd']");

	private By newROSButton = By.xpath("//span[normalize-space()='New ROS Information']");

	private By rosNameField = By.id("ROS_Name");

	private By ROSbucketMenuIcon = By.xpath("(//button[@id='bucketDrop']/i)[1]");

	private By ROSeditOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[normalize-space()='Edit']");

	private By ROSdeleteOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[normalize-space()='Delete']");

	// Clinical Intervention
	public By clinicalInterventionAllLabel = By.xpath("//label[@for='chkg26ClinicalInterventionAll']");
	public By clinicalInterventionAddLabel = By.xpath("//label[@for='chkg26ClinicalInterventionAdd']");

	private By deleteConfirmButton = By.xpath("//div[@id='deleteEmployeeModel']//button[@id='btnDeleteConfirm']");

	private By newClinicalInterventionBtn = By.xpath("//span[normalize-space()='New Clinical Intervention']");

	private By clinicalInterventionNameField = By.id("ClinicalIntervention_Name");

	private By clinicalInterventionCreatedText = By.xpath("//*[contains(text(),'Medication Adjustment')]");

	private By bucketMenuIcon = By.xpath("(//button[@id='bucketDrop']/i)[1]");

	private By clinicalInterventioneditOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[normalize-space()='Edit']");

	private By clinicalInterventiondeleteOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[normalize-space()='Delete']");

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
	public By priorAuthorizationProcessAllLabel = By.xpath("//label[@for='chkg23PriorAuthorizationProcessAll']");
	public By priorAuthorizationGenerateAddLabel = By.xpath("//label[@for='chkg23PriorAuthorizationGenerateAdd']");

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

	private void waitAndSendKeys(By locator, String value) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		element.clear();
		element.sendKeys(value);
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
		nameField.sendKeys("Medication Adjustment - Updated");

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
				.sendKeys("Medication Adjustment");
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
		nameField.sendKeys("Skin Rash on arms, itchy scalp - Updated");

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
				.sendKeys("Skin Rash on arms, itchy scalp");
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
		nameField.sendKeys("Blood Pressure Monitoring - Updated");

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
				.sendKeys("Blood Pressure Monitoring");
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	// Remote Monitoring Parameters (RMP)

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
		nameField.sendKeys("Blood Pressure Monitoring - Updated");

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
		wait.until(ExpectedConditions.visibilityOfElementLocated(rmpNameField)).sendKeys("Blood Pressure Monitoring");
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
		nameField.sendKeys("Blood Pressure Monitoring - Updated");

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
		nameField.sendKeys("Blood Pressure Monitoring - Updated");

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
				.sendKeys("Blood Pressure Monitoring");
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
				.sendKeys("Blood Pressure Monitoring");
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
		descriptionField.sendKeys("Blood Pressure Monitoring - Updated");

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
		imeiInput.sendKeys("356789012345678");

		WebElement serialInput = wait.until(ExpectedConditions.visibilityOfElementLocated(serialNumberField));
		serialInput.clear();
		serialInput.sendKeys("RD-1001");

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

		wait.until(ExpectedConditions.visibilityOfElementLocated(imeiField)).sendKeys("356789012345678");

		wait.until(ExpectedConditions.visibilityOfElementLocated(serialNumberField)).sendKeys("RD-1001");
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
		assertElementNotPresent(NEW_RPM_STATUS_BUTTON);
		clickWhenClickable(FIRST_RECORD_ACTION_DROPDOWN);
		sleep(2000);
		assertElementNotPresent(DELETE_RPM_STATUS_OPTION);
	}

	public void verifyUserCanEditRPMStatus() {
		sleep(3000);

		clickWhenClickable(bucketDropIcon);
		sleep(2000);

		clickWhenClickable(editOption);
		sleep(3000);

		waitAndSendKeys(rpmStatusNameInput, "Active Monitoring Updated");

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

		wait.until(ExpectedConditions.visibilityOfElementLocated(rpmStatusNameInput)).sendKeys("Active Monitoring");
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
		WebElement cptAllPermission = wait.until(ExpectedConditions.elementToBeClickable(CPT_ALL_PERMISSION));
		cptAllPermission.click();
		sleep(2000);
		WebElement cptAddPermission = wait.until(ExpectedConditions.elementToBeClickable(CPT_ADD_PERMISSION));
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(cptCodeField)).sendKeys("99213");

		wait.until(ExpectedConditions.visibilityOfElementLocated(descriptionField)).clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(descriptionField))
				.sendKeys("Office Visit, Established Patient");

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
		clickWhenClickable(NEW_CPT_CODE_BTN);
		sleep(4000);
		waitAndSendKeys(CPT_CODE_NAME_INPUT, "99213");
		waitAndSendKeys(CPT_CODE_INPUT, "99213");
		waitAndSendKeys(CPT_DESCRIPTION_INPUT, "Office Visit, Established Patient");
		sleep(2000);
		clickWhenClickable(SAVE_CPT_BTN);
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

		wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameField)).sendKeys("Riley");
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField)).sendKeys("Blanche");
		sleep(2000);

		WebElement birthDate = wait.until(ExpectedConditions.elementToBeClickable(birthDateField));
		birthDate.click();
		sleep(2000);

		wait.until(ExpectedConditions.elementToBeClickable(todayDateInCalendar)).click();
		sleep(2000);

		wait.until(ExpectedConditions.elementToBeClickable(addNewPatientButton)).click();
		sleep(2000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberField)).sendKeys("1234567890");
		sleep(2000);

		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void selectExistingPatient() {
		sleep(2000);

		wait.until(ExpectedConditions.elementToBeClickable(newPatientButton)).click();
		sleep(2000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameField)).sendKeys("Riley");
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField)).sendKeys("Blanche");
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
		String newName = "Allergies";
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
		String componentName = "Allergies";
		int typeIndex = 1;
		sleep(2000);

		wait.until(ExpectedConditions.elementToBeClickable(newSoapComponentButton)).click();
		sleep(2000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(nameField)).sendKeys(componentName);
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
		clickWhenClickable(EXPORT_TO_EXCEL_BTN);
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
		assertElementNotPresent(EXPORT_TO_EXCEL_BTN);
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
		clickWhenClickable(EXPORT_TO_EXCEL_BTN);
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
		clickWhenClickable(EXPORT_TO_EXCEL_BTN);
		sleep(2000);
	}
	// Patient / Provider Referral

	public void verifyUserCannotReferToNewProviderInPatientProviderReferralInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(REFER_TO_NEW_PROVIDER_BTN);
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
		selectDropdownByIndexWhenReady(CLINICAL_OBJECTIVE_COMPONENT_DD, 1);

		sleep(2000);
		selectDropdownByIndexWhenReady(ENCOUNTER_STATUS_DD, 2);

		sleep(2000);
		clickWhenClickable(SAVE_ENCOUNTER_BTN);

		sleep(2000);
		clickWhenClickable(ADD_REFERRAL_PROVIDER_ICON);

		sleep(2000);
		clickWhenClickable(PROVIDER_RADIO_BTN);

		sleep(2000);
		clickWhenClickable(SELECT_PROVIDER_BTN);

		sleep(2000);
		waitAndSendKeys(REFERRAL_ISSUE_TXT, "Blood Pressure");

		sleep(1000);
		selectDropdownByIndexWhenReady(REFERRAL_CATEGORY_DD, 2);

		sleep(2000);
		clickWhenClickable(REFER_BTN);
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
		clickWhenClickable(PATIENT_BUCKET_MENU);

		sleep(2000);
		clickWhenClickable(EDIT_PATIENT_OPTION);

		sleep(3000);
		clickWhenClickable(CLINICAL_ENCOUNTERS_BTN);

		sleep(3000);
		clickWhenClickable(ADD_NEW_CLINICAL_ENCOUNTER_BTN);

		sleep(2000);
		assertElementPresent(REFERRAL_HEADER);
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

		waitAndSendKeys(careGiverLastNameField, "Martin");
		waitAndSendKeys(careGiverFirstNameField, "Brian");

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

		waitAndSendKeys(careGiverLastNameField, "Martin");
		waitAndSendKeys(careGiverFirstNameField, "Brian");

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

		waitAndSendKeys(notesInput, "Note");

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
		waitAndSendKeys(patientFilterInput, "0004406");
		clickWhenClickable(searchPatientButton);
		sleep(2000);
		clickWhenClickable(selectFirstPatientRadio);
		sleep(1000);
		clickWhenClickable(confirmPatientButton);
		sleep(5000);

		clickWhenClickable(addDrugButton);
		sleep(3000);
		waitAndSendKeys(drugFilterInput, "amoxilin");
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
		waitAndSendKeys(partnerFilterInput, "Attorney");
		clickWhenClickable(searchPartnerButton);
		sleep(3000);
		clickWhenClickable(selectPartnerRadio);
		sleep(3000);
		clickWhenClickable(confirmPartnerButton);
		sleep(3000);

		WebElement receivedDate = driver.findElement(receivedDateInput);
		receivedDate.clear();
		receivedDate.sendKeys("10/09/2025");
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
		submissionDate.sendKeys("10/09/2025");
		submissionDate.sendKeys(Keys.TAB);
		sleep(2000);

		waitAndSendKeys(submissionNoteInput, "Submission");
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
		waitAndSendKeys(patientIdFilterInput, "0004406");
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
		waitAndSendKeys(patientIdFilterInput, "0004406");
		clickWhenClickable(patientSearchButton);
		sleep(2000);
		clickWhenClickable(selectPatientRadioButton);
		clickWhenClickable(confirmPatientButton);
		sleep(1000);

		clickWhenClickable(addMedsOnChartButton);
		sleep(1000);
		clickWhenClickable(addDrugPopupIcon);
		sleep(1000);
		waitAndSendKeys(drugNameFilterInput, "amoxilin");
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
		waitAndSendKeys(patientIdFilterInput, "0004406");
		clickWhenClickable(patientSearchButton);
		sleep(2000);
		clickWhenClickable(selectPatientRadioButton);
		clickWhenClickable(confirmPatientButton);
		sleep(1000);

		clickWhenClickable(addMedsOnChartButton);
		sleep(1000);
		clickWhenClickable(addDrugPopupIcon);
		sleep(1000);
		waitAndSendKeys(drugNameFilterInput, "amoxilin");
		clickWhenClickable(drugSearchButton);
		sleep(1000);
		clickWhenClickable(selectDrugRadioButton);
		clickWhenClickable(confirmDrugButton);
		clickWhenClickable(addDrugToChartButton);
		sleep(1000);

		clickWhenClickable(editMedsOnChartButton);
		sleep(1000);
		waitAndSendKeys(directionInputFirstMed, "Morning");
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
		waitAndSendKeys(patientIdFilterInput, "0004406");
		clickWhenClickable(patientSearchButton);
		sleep(2000);
		clickWhenClickable(selectPatientRadioButton);
		clickWhenClickable(confirmPatientButton);
		sleep(1000);

		clickWhenClickable(addMedsOnChartButton);
		sleep(1000);
		clickWhenClickable(addDrugPopupIcon);
		sleep(1000);
		waitAndSendKeys(drugNameFilterInput, "amoxilin");
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
		assertElementNotPresent(ADD_CURRENT_MEDICATION);
		assertElementNotPresent(DELETE_MEDICATION_ICON);
	}

	public void userShouldBeAbleToDeleteMedReconsCurrentMedicationInClinicalModule() {

		sleep(3000);
		clickWhenClickable(NEW_CLINICAL_MED_RECONS);

		sleep(3000);
		clickWhenClickable(ENCOUNTER_STATUS_DROPDOWN);
		selectDropdownByIndexWhenReady(ENCOUNTER_STATUS_DROPDOWN, 2);

		sleep(1000);
		clickWhenClickable(ADD_PATIENT_ICON);

		sleep(2000);
		waitAndSendKeys(PATIENT_SEARCH_INPUT, "0004406");
		clickWhenClickable(PATIENT_SEARCH_BUTTON);

		sleep(2000);
		clickWhenClickable(PATIENT_SELECT_CHECKBOX);
		clickWhenClickable(PATIENT_CONFIRM_BUTTON);

		sleep(1000);
		clickWhenClickable(ADD_CURRENT_MEDICATION);

		sleep(1000);
		clickWhenClickable(DRUG_LOOKUP_ICON);

		sleep(1000);
		waitAndSendKeys(DRUG_NAME_INPUT, "amoxilin");
		clickWhenClickable(DRUG_SEARCH_BUTTON);

		sleep(1000);
		clickWhenClickable(DRUG_SELECT_CHECKBOX);
		clickWhenClickable(DRUG_CONFIRM_BUTTON);
		clickWhenClickable(ADD_DRUG_ACTION);

		sleep(1000);
		clickWhenClickable(DELETE_MEDICATION_ICON);

		sleep(1000);
		clickWhenClickable(DELETE_CONFIRM_BUTTON);

		sleep(1000);
		clickWhenClickable(SAVE_BUTTON);
	}

	public void createProfileWithDeleteOnlyAccessForMedReconsCurrentMedicationTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddOrDeleteMedReconsCurrentMedicationInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(ADD_CURRENT_MEDICATION_BUTTON);
		assertElementNotPresent(DELETE_CURRENT_MEDICATION_ICON);
	}

	public void userShouldBeAbleToEditMedReconsCurrentMedicationInClinicalModule() {

		clickWhenClickable(NEW_MED_RECONS_BTN);
		sleep(3000);

		clickWhenClickable(ENCOUNTER_STATUS_DROPDOWN);
		selectDropdownByIndexWhenReady(ENCOUNTER_STATUS_DROPDOWN, 2);
		sleep(1000);

		clickWhenClickable(PATIENT_POPUP_ICON);
		sleep(2000);

		waitAndSendKeys(PATIENT_ID_INPUT, "0004406");
		clickWhenClickable(PATIENT_SEARCH_BTN);
		sleep(2000);

		clickWhenClickable(PATIENT_SELECT_CHECKBOX);
		clickWhenClickable(PATIENT_CONFIRM_BTN);
		sleep(1000);

		clickWhenClickable(ADD_CURRENT_MEDICATION_BTN);
		sleep(1000);

		clickWhenClickable(DRUG_LOOKUP_ICON);
		sleep(1000);

		waitAndSendKeys(DRUG_NAME_INPUT, "amoxilin");
		clickWhenClickable(DRUG_SEARCH_BTN);
		sleep(1000);

		clickWhenClickable(DRUG_SELECT_CHECKBOX);
		clickWhenClickable(DRUG_CONFIRM_BTN);
		sleep(1000);

		clickWhenClickable(EDIT_MED_ICON);
		sleep(1000);

		waitAndSendKeys(DIRECTION_INPUT, "Morning");
		clickWhenClickable(EDIT_MED_ICON);
		sleep(1000);

		clickWhenClickable(SAVE_BTN);
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

	}

	public void userCreatesProfileWithAddAccessOnlyToMedReconsCurrentMedication() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldBeAbleToAddMedReconsCurrentMedicationInClinicalModule() {

		clickWhenClickable(newClinicalMedReconsBtn);
		sleep(3000);

		clickWhenClickable(encounterStatusDropdown);
		sleep(1000);
		selectDropdownByIndexWhenReady(encounterStatusDropdown, 2);
		sleep(1000);

		clickWhenClickable(addPatientPopupIcon);
		sleep(2000);
		waitAndSendKeys(patientIdFilterInput, "0004406");
		clickWhenClickable(searchPatientBtn);
		sleep(2000);
		clickWhenClickable(patientRadioBtn);
		clickWhenClickable(confirmPatientBtn);
		sleep(1000);

		clickWhenClickable(addCurrentMedicationBtn);
		sleep(1000);
		clickWhenClickable(addDrugPopupIcon);
		sleep(1000);
		waitAndSendKeys(drugNameFilterInput, "amoxilin");
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
		assertElementNotPresent(EXPORT_TO_EXCEL_BUTTON);
		assertElementNotPresent(VIEW_DETAILS_ICON);
	}

	public void verifyUserHasViewAccessToReportsMTMEncounterLogInClinicalModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
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
		clickWhenClickable(VIEW_DETAILS_ICON);
	}

	public void userShouldBeAbleToExportReportsMTMEncounterLogToExcelInClinicalModule() {
		sleep(3000);
		clickWhenClickable(EXPORT_TO_EXCEL_BUTTON);
	}

	// Remote Patient Monitoring (RPM)

	public void userShouldBeAbleToExportDataToExcelInClinicalModule() {
		sleep(3000);
		clickWhenClickable(EXPORT_TO_EXCEL_BUTTON);
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

	}

	public void userShouldNotBeAbleToAddOrEditRemotePatientMonitoringRPMInClinicalModule() {
		sleep(3000);

		assertElementNotPresent(NEW_RPM_BUTTON);

		clickWhenClickable(RPM_ACTION_MENU);
		sleep(2000);

		assertElementNotPresent(RPM_EDIT_OPTION);
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

	}

	public void userShouldNotBeAbleToAddOrDeleteRemotePatientMonitoringRPMInClinicalModule() {
		sleep(3000);
		assertElementNotPresent(NEW_RPM_BUTTON);

		clickWhenClickable(BUCKET_DROPDOWN_BUTTON);
		sleep(2000);
		assertElementNotPresent(DELETE_OPTION);
	}

	public void userShouldBeAbleToEditRemotePatientMonitoringRPMInClinicalModule() {
		sleep(3000);

		clickWhenClickable(BUCKET_DROPDOWN_BUTTON);
		sleep(2000);
		clickWhenClickable(EDIT_OPTION);
		sleep(2000);

		clickWhenClickable(PROGRESS_STEPS_TAB);
		sleep(2000);
		clickWhenClickable(PROGRESS_STATUS_DROPDOWN);
		sleep(1000);
		selectDropdownByIndexWhenReady(PROGRESS_STATUS_DROPDOWN, 1);
		sleep(2000);

		waitAndSendKeys(NOTE_TEXTAREA, "Note");
		clickWhenClickable(SAVE_NOTE_BUTTON);
		sleep(2000);

		clickWhenClickable(SUBMIT_LINK);
	}

	public void verifyUserHasEditAccessToRemotePatientMonitoringInClinicalModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToEditOrDeleteRemotePatientMonitoringRPMInClinicalModule() {
		sleep(3000);
		clickWhenClickable(BUCKET_DROPDOWN_BUTTON);
		sleep(2000);
		assertElementNotPresent(EDIT_OPTION);
		assertElementNotPresent(DELETE_OPTION);
	}

	public void userShouldHaveAddAccessToRemotePatientMonitoringInClinicalModule() {
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
		sleep(2000);

	}

	public void userShouldBeAbleToAddRemotePatientMonitoringRPMInClinicalModule() {
		sleep(3000);

		clickWhenClickable(NEW_RPM_BUTTON);
		sleep(2000);
		clickWhenClickable(ADD_PATIENT_ICON);
		sleep(2000);
		waitAndSendKeys(By.id("Filter_PatientId"), "0004406");
		clickWhenClickable(SEARCH_BUTTON);
		sleep(2000);
		clickWhenClickable(SELECT_FIRST_PATIENT_RADIO);
		clickWhenClickable(CONFIRM_PATIENT_BUTTON);
		sleep(2000);
		clickWhenClickable(NEXT_BUTTON);
		sleep(3000);
		clickWhenClickable(SUBMIT_LINK);
	}

}
