package com.pharmcrm_PatientModule.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import hooks.Hooks;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;

public class patientpage {
	private WebDriver driver;
	private WebDriverWait wait;

	// PatientMedicationColorCodeSetting
	public By medicationColorCodeTypeDropdown = By.id("PatientMedicationColorCodeSetting_MedicationColorCodeType");
	public By columnNameDropdown = By.id("PatientMedicationColorCodeSetting_ColumnName");
	public By saveColorCodeButton = By.id("btnSaveMedicationColorCode");
	public By actionMenuButton = By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']");
	public By newPatientMedicationColorCodeSettingLabel = By
			.xpath("//span[normalize-space()='New Patient Medication ColorCode Setting']");
	public By deleteMedicationColorCodeButton = By.id("deleteMedicationColorCode");

	// PatientAppointment
	public By upcomingAppointmentTab = By.xpath("//a[normalize-space()='Upcoming Appointment']");
	public By newAppointmentButton = By.xpath("//span[normalize-space()='New Appointment']");
	public By appointmentDateInput = By.id("PatientAppointment_AppointmentDate");
	public By startTimeInput = By.id("startTime");
	public By endTimeInput = By.id("endTime");
	public By saveAppointmentButton = By.id("btnSaveAppointment");
	public By firstAppointmentActionButton = By.xpath("//tbody/tr/td[8]/div[1]/div[1]/div[1]/button[1]/i[1]");
	public By notesField = By.xpath("//textarea[@id='PatientAppointment_Notes']");
	public By deleteAppointmentOption = By.xpath("//a[@id='btnDeleteAppointment']//span[normalize-space()='Delete']");
	public By appointmentStatusDropdown = By.id("PatientAppointment_AppointmentStatus");

	// PatientVitals
	public By deleteVitalsButton = By.xpath("//a[@id='btnDeleteVital']//span[contains(text(),'Delete')]");
	public By confirmDeleteVitalsButton = By.xpath("//button[@id='btnDeleteVitalConfirm']");
	public By vitalsOptionsButton = By
			.xpath("//div[@class='gridRecordIconside']//i[@class='fa-solid fa-ellipsis-vertical']");
	public By editVitalsButton = By.xpath("//a[@title='Edit']//span[contains(text(),'Edit')]");
	public By temperatureInput = By.xpath("//input[@id='PatientVital_Temprature']");
	public By vitalsTab = By.xpath("//a[normalize-space()='Vitals']");
	public By addVitalsButton = By.xpath("//span[normalize-space()='Add Vitals']");
	public By bpInputField = By.xpath("//input[@id='PatientVital_BP']");
	public By saveVitalsButton = By.xpath("//button[@id='btnSaveVital']");

	// FeedbackForm
	public By feedbackFormTab = By.xpath("//span[normalize-space()='Feedback Form']");
	public By feedbackFormDropdown = By.id("FeedbackForm_Id");
	public By textOptionLabel = By.xpath("//label[normalize-space()='Text']");
	public By emailOptionLabel = By.xpath("//label[normalize-space()='Email']");
	public By submitFeedbackFormButton = By.id("btnFeedbackFollowUpQueueStatus");
	public By feedbackFormActionMenuIcon = By.xpath("//tbody/tr/td[4]/div[1]/div[1]/button[1]/i[1]");
	public By feedbackFormDeleteOption = By
			.xpath("//a[@id='btnDeletePatientFeedbackForm']//span[contains(text(),'Delete')]");
	public By confirmDeleteFeedbackFormButton = By.xpath("//button[@id='deletepatientFeedbackForm']");
	public By deleteMedicalHealthCardOption = By
			.xpath("//a[@id='btnDeleteMedicalHealthCardConfirm']//span[contains(text(),'Delete')]");
	public By confirmDeleteMedicalHealthCardButton = By.id("deletepatientMedicalHealthCard");
	public By medicalHealthCardTab = By.xpath("//a[normalize-space()='Medical Health Card']");
	public By addMedicalHealthCardButton = By.xpath("//span[normalize-space()='Add Medical Health Card']");
	public By healthPlanNameInput = By.id("PatientMedicalHealthCard_HealthPlanName");
	public By planNumberInput = By.id("PatientMedicalHealthCard_PlanNumber");
	public By planCardHolderInput = By.id("PatientMedicalHealthCard_PlanCardHolder");
	public By saveMedicalHealthCardButton = By.id("btnSaveMedicalHealthCard");
	public By medicalHealthCardActionMenu = By.xpath("//tbody/tr/td[8]/div[1]/div[1]/button[1]/i[1]");
	public By editMedicalHealthCardOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By medicalHealthCardCheckbox = By.xpath("//label[@id='chk2text']");
	public By patientViewOption = By.xpath("//div[contains(@class,'dropdown-menu')]//span[normalize-space()='View']");
	public By closeFeedbackFormPopupIcon = By
			.xpath("//button[@onclick='return CloseFeedbackFormPopup()']//i[contains(@class,'fa-times')]");

	// CareGiverName
	public By addNewCareGiverButton = By.xpath("//span[normalize-space()='Add New Caregiver']");
	public By careGiverLastNameInput = By.id("PatientCareGiverName_LastName");
	public By careGiverFirstNameInput = By.id("PatientCareGiverName_FirstName");
	public By careGiverPhoneInput = By.id("PatientCareGiverName_PhoneNumber");
	public By careGiverRelationInput = By.id("PatientCareGiverName_RelationOFCaregivertoPatient");
	public By saveCareGiverPopupButton = By.id("btnSaveCareGiverNamePopup");
	public By savePatientButton = By.id("btnSave");
	public By optionsMenuButton = By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']");
	public By editCareGiverOption = By.xpath("//span[normalize-space()='Edit']");
	public By deleteCareGiverOption = By.xpath("//span[normalize-space()='Delete']");
	public By confirmDeleteCareGiverButton = By.id("deletePatientCareGiverName");

	// Text
	public By textAllCheckbox = By.xpath("//label[@for='chkg20TextAll']");
	public By textViewCheckbox = By.xpath("//label[@for='chkg20TextView']");
	public By quickTextPhoneInput = By.id("newPhoneNumber");
	public By quickTextBodyTextarea = By.id("newBody");
	public By quickTextSendButton = By.id("btnSave");
	public By textQuickTextCheckbox = By.xpath("//label[@for='chkg20TextQuickText']");
	public By addToPatientButton = By.xpath("//span[normalize-space()='Add To Patient']");

	// PatientText
	public By patientTextAllCheckbox = By.xpath("//label[@for='chkg20PatientTextAll']");
	public By patientTextViewCheckbox = By.xpath("//label[@for='chkg20PatientTextView']");
	public By viewTextButtonIcon = By.xpath("//a[@id='btnTextViewPatient']//*[name()='svg']");
	public By viewPatientTextIcon = By.xpath("//a[@id='btnTextViewPatient']//*[name()='svg']");
	public By quickTextOption = By.xpath("//span[normalize-space()='Quick Text']");
	public By sendVCardOption = By.xpath("//span[normalize-space()='Send VCard']");
	public By phoneNumberInput = By.id("newPhoneNumber");
	public By messageBodyTextarea = By.id("newBody");
	public By saveTextButton = By.id("btnSave");
	public By replyButton = By.xpath("//span[normalize-space()='Reply']");
	public By vCardPhoneInput = By.id("vCardPhoneNumber");
	public By vCardBodyTextarea = By.id("vcardBody");

	// GenerateNewAccessCode
	public By accessCodeTab = By.xpath("//a[@class='active'][normalize-space()='Access Code']");
	public By generateAccessCodeButton = By.xpath("//span[normalize-space()='Generate Access Code']");
	public By generateNewAccessCodeAllCheckbox = By.xpath("//label[@for='chkg12GenerateNewAccessCodeAll']");

	// PatientExternalSource
	public By patientEHRAllCheckbox = By.xpath("//label[@for='chkg12PatientEHRAll']");
	public By patientEHRAddCheckbox = By.xpath("//label[@for='chkg12PatientEHRAdd']");
	public By patientEHREditCheckbox = By.xpath("//label[@for='chkg12PatientEHREdit']");
	public By externalSourceTab = By.xpath("//a[normalize-space()='External Source']");
	public By addExternalSourceButton = By.xpath("//span[normalize-space()='Add External Source']");
	public By externalSourceDropdown = By.id("Patient_PatientExternalSource_ExternalSource_Id");
	public By externalPatientIdField = By.id("PatientExternalSource_ExternalPatientId");
	public By saveExternalSourceButton = By.id("btnSaveEHR");

	// PatientFamily
	public By patientFamilyAllCheckbox = By.xpath("//label[@for='chkg18PatientFamilyAll']");
	public By patientFamilyAddCheckbox = By.xpath("//label[@for='chkg18PatientFamilyAdd']");
	public By familyDetailsTab = By.xpath("//a[normalize-space()='Family Details']");
	public By addFamilyButton = By.xpath("//span[normalize-space()='Add Family']");
	public By birthDateInput = By.id("Patient_BirthDate");
	public By yearDropdown = By.xpath("//select[contains(@class,'ui-datepicker-year')]");
	public By monthDropdown = By.xpath("//select[contains(@class,'ui-datepicker-month')]");
	public By dateToSelect = By.xpath("//td[normalize-space()='1']");
	public By findPatientButton = By.id("btnFindPatient");
	public By selectPatientCheckbox = By.xpath("//input[@id='c87acbbb-8d62-4aee-bc00-cff67e2700a2']");
	public By deleteFamilyButton = By.xpath("//a[@id='btnDeleteFamilyConfirm']//img");

	// PatientCommunication
	public By patientCommunicationAll = By.xpath("//label[@for='chkg18PatientCommunicationAll']");
	public By patientCommunicationAdd = By.xpath("//label[@for='chkg18PatientCommunicationAdd']");
	public By communicationTab = By.xpath("//a[normalize-space()='Communication']");
	public By addCommunicationButton = By.xpath("//span[normalize-space()='Add Communication']");
	public By communicationNotesField = By.xpath("//textarea[@id='PatientCommunication_Notes']");
	public By saveCommunicationButton = By.xpath("//button[@id='btnSaveCommunication']");
	public By communicationSuccessMessage = By.xpath("//div[contains(text(),'Communication added successfully')]");
	public By actionDropdownButton = By.xpath("//tbody/tr/td[11]/div[1]/div[1]/button[1]/i[1]");
	public By patientCommunicationEditCheckbox = By.xpath("//label[@for='chkg18PatientCommunicationEdit']");
	public By communicationDeleteCheckbox = By.xpath("//label[@for='chkg18PatientCommunicationDelete']");
	public By deleteMenuOption = By.xpath("//a[@id='btnDeleteCommunicationConfirm']//span[normalize-space()='Delete']");
	public By communicationTabLink = By.xpath("//a[normalize-space()='Communication']");
	public By patientCommunicationActionMenuButton = By.xpath("//tbody/tr/td[11]/div[1]/div[1]/button[1]/i[1]");
	public By patientCommunicationEditOption = By
			.xpath("//div[contains(@class,'gridRecordContext')]//span[normalize-space()='Edit']");
	public By patientCommunicationDeleteOption = By
			.xpath("//div[contains(@class,'gridRecordContext')]//span[normalize-space()='Delete']");

	// PatientPhysian
	public By checkBox = By.xpath("//div[@class='col-md-4 col-lg-3 pt-2']//label[@id='chk2text']");
	public By patientPhysicianAll = By.xpath("//label[@for='chkg18PatientPhysianAll']");
	public By patientPhysicianAdd = By.xpath("//label[@for='chkg18PatientPhysianAdd']");
	public By physicianTab = By.xpath("//a[normalize-space()='Physician']");
	public By addPhysicianButton = By.xpath("//span[normalize-space()='Add Physician']");
	public By lastNameInput = By.id("Filter_DoctorLastName");
	public By firstPhysicianCheckbox = By.id("2b44bfab-9454-457a-822d-01eafa4e95de");
	public By addProviderButton = By.id("btnProvider");
	public By patientPhysicianEdit = By.xpath("//label[@for='chkg18PatientPhysianEdit']");

	// PatientPharmacy
	public By patientPharmacyAll = By.xpath("//label[@for='chkg18PatientPharmacyAll']");
	public By patientPharmacyAdd = By.xpath("//label[@for='chkg18PatientPharmacyAdd']");
	public By pharmacyTab = By.xpath("//a[normalize-space()='Pharmacy']");
	public By addPharmacyButton = By.xpath("//span[normalize-space()='Add Pharmacy']");
	public By businessNameInput = By.id("Filter_BusinessName");
	public By firstPharmacyCheckbox = By.id("0f825af7-1a63-461a-a93d-7167461ea3ae");
	public By addPartnerButton = By.id("btnPartner");
	public By deletePharmacyIcon = By.xpath("//a[@id='btnDeletePharmacyConfirm']//img");
	public By patientPharmacyDelete = By.xpath("//label[@for='chkg18PatientPharmacyDelete']");

	// PatientMedsOnChart
	public By medsOnChartTab = By.xpath("//a[normalize-space()='Meds On Chart']");
	public By addMedicationsButton = By.xpath("//span[normalize-space()='Add Medications On Chart']");
	public By selectMedicationIcon = By.xpath("//div[@class='model-inp requiredfield']//img");
	public By filterDrugNameInput = By.id("Filter_DrugName");
	public By firstDrugCheckbox = By.id("0");
	public By addDrugButton = By.xpath("//div[@id='divSearchDrugInfo']//button[@id='btnDrug']");
	public By confirmButton = By.xpath("//i[@class='fa-solid fa-circle-check']");
	public By patientMedsOnChartAll = By.xpath("//label[@for='chkg20PatientMedsOnChartAll']");
	public By patientMedsOnChartAdd = By.xpath("//label[@for='chkg20PatientMedsOnChartAdd']");
	public By recordDropdownButton = By.xpath(
			"//body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]");
	public By patientMedsOnChartEdit = By.xpath("//label[@for='chkg20PatientMedsOnChartEdit']");
	public By directionInput = By.id("PatientMedicationsOnChart_Direction_0");
	public By patientMedsOnChartDelete = By.xpath("//label[@for='chkg20PatientMedsOnChartDelete']");
	public By copyToMedicationIcon = By.xpath("//img[@class='v-align-txttop']");
	public By recordActionIcon = By
			.xpath("//div[@class='gridListIconsFlex justify-content-end']//i[@class='fa-solid fa-ellipsis-vertical']");
	public By medicationsOnChartEditOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By medicationsOnChartDeleteOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");

	// PatientMedicationpage
	public By patientMedicationAllLabel = By.xpath("//label[@for='chkg18PatientMedicationAll']");
	public By patientMedicationAddLabel = By.xpath("//label[@for='chkg18PatientMedicationAdd']");
	public By medicationTab = By.xpath("//a[normalize-space()='Medication']");
	public By addMedicationBtn = By.xpath("//span[normalize-space()='Add Medication']");
	public By addMedicationPopupIcon = By.xpath("//div[@id='AddMedicationModal']//div[4]//div[1]//a[1]//img[1]");
	public By drugNameFilter = By.id("Filter_DrugName");
	public By searchDrugBtn = By.xpath("//button[normalize-space()='Search']");
	public By selectDrugCheckbox = By.id("0");
	public By selectDrugBtn = By.id("btnDrug");
	public By saveMedicationBtn = By.xpath("//button[@onclick='javascript: saveMedication();']");
	public By patientMedicationEditLabel = By.xpath("//label[@for='chkg18PatientMedicationEdit']");
	public By rxStatusInput = By.id("PatientMedication_RxStatus");
	public By patientMedicationDeleteLabel = By.xpath("//label[@for='chkg18PatientMedicationDelete']");
	public By confirmDeleteBtn = By.id("deletepatientmedical");
	public By grossMarginLabel = By.id("totalGM");
	public By totalGMLbl = By.xpath("//label[@id='totalGM']");
	public By syncDayDropdown = By.id("PatientMed_SyncDay");
	public By saveSyncButton = By.id("btnSaveMedicationSyncDays");
	public By someCheckbox1 = By.xpath("//div[4]//label[1]//div[1]");
	public By someCheckbox2 = By.xpath("//tbody/tr/td[5]/label[1]/div[1]");
	public By grossMarginInput = By.id("PatientMedication_GrossMargin");

	// PatientClaimVerification
	public By patientClaimAll = By.xpath("//label[@for='chkg14PatientClaimVerificationAll']");
	public By patientClaimAdd = By.xpath("//label[@for='chkg14PatientClaimVerificationAdd']");
	public By patientClaimVerificationIcon = By.xpath("//*[name()='svg' and descendant::*[@id='Union_79']]");
	public By adjusterName = By.id("Patient_PatientClaimVerification_Adjuster");
	public By adjusterEmail = By.id("Patient_PatientClaimVerification_AdjusterEmail");
	public By adjusterPhone = By.id("Patient_PatientClaimVerification_AdjusterPhoneNumber");
	public By adjusterFax = By.id("Patient_PatientClaimVerification_AdjusterFax");
	public By addAdjusterBtn = By.id("btnAddAdjuster");
	public By addPayorPopup = By.xpath("//a[@id='addPayorNamePopup']//img");
	public By payorBusinessName = By.id("Filter_BusinessName");
	public By payorSearchBtn = By.id("btnpayorserach");
	public By payorSelectCheckbox = By.id("84996e1c-2e81-4b80-81cf-7d1f1b095d1e");
	public By payorSelectBtn = By.id("btnPayor");
	public By claimNumber = By.id("Patient_PatientClaimVerification_ClaimNumber");
	public By addPayorAddressPopup = By.xpath("//a[@id='addPayorAddressPopup']//img");
	public By payorAddressCheckbox = By.id("9b8ba6bd-e587-487e-8788-8bde0c276d5b");
	public By payorAddressSelectBtn = By
			.xpath("//div[@class='modal-footer text-center d-block']//button[@id='btnPayorAddress']");
	public By saveBtn = By.id("btnSave");
	public By patientClaimVerificationTab = By.xpath("//a[normalize-space()='Patient Claim Verification']");
	public By actionMenuIcon = By.xpath("//table/tbody/tr[1]/td[10]//button[1]/i[1]");
	public By patientClaimVerificationEditLabel = By.xpath("//label[@for='chkg14PatientClaimVerificationEdit']");
	public By cellNumber = By.id("Patient_PatientClaimVerification_CellNumber");
	public By deleteAdjusterBtn = By.id("btnDeleteAdjuster");
	public By patientClaimVerificationPrintLabel = By.xpath("//label[@for='chkg14PatientClaimVerificationPrint']");
	public By closePrintDialogBtn = By
			.xpath("//button[@onclick='CloseClaimVerificationSignature();']//i[@class='fa fa-times']");
	public By day25 = By.xpath("//td[not(contains(@class,'disabled'))]/a[text()='25']");
	public By nextMonth = By.xpath("//a[@title='Next']");
	public By claimDateInput = By.id("Patient_PatientClaimVerification_ClaimDate");
	public By patientActionButtonIcon = By.xpath(
			"//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]");
	public By claimVerificationEditOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By claimVerificationPrintOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Print')]");
	public By claimVerificationSendMailOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Send Mail')]");
	public By claimVerificationSendTextOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Send Text')]");
	public By actionIcon = By.xpath("//table//tbody/tr[1]/td[36]//button//i");
	public By medicationEditOption = By
			.xpath("//div[contains(@class,'gridRecordContext')]//span[normalize-space()='Edit']");
	public By medicationDeleteOption = By
			.xpath("//div[contains(@class,'gridRecordContext')]//span[normalize-space()='Delete']");

	// PatientIntakeForm
	public By patientIntakeFormAllCheckbox = By.xpath("//label[@for='chkg13PatientIntakeFormAll']");
	public By patientIntakeFormAddCheckbox = By.xpath("//label[@for='chkg13PatientIntakeFormAdd']");
	public By intakeFormButton = By.xpath("//a[@id='btnIntakeForm']//*[name()='svg']");
	public By saveIntakeFormButton = By.id("btnSave");
	public By patientIntakeFormsTab = By.xpath("//a[normalize-space()='Patient Intake Forms']");
	public By intakeFormActionMenu = By.xpath(
			"//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[2]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]/i[1]");
	public By editIntakeFormOption = By.xpath(
			"//div[contains(@class,'gridRecordContext') and contains(@class,'show')]//span[contains(text(),'Edit')]");
	public By printIntakeFormOption = By.xpath(
			"//div[contains(@class,'gridRecordContext') and contains(@class,'show')]//span[contains(text(),'Print')]");
	public By sendMailIntakeFormOption = By.xpath(
			"//div[contains(@class,'gridRecordContext') and contains(@class,'show')]//span[contains(text(),'Send Mail')]");
	public By sendTextIntakeFormOption = By.xpath(
			"//div[contains(@class,'gridRecordContext') and contains(@class,'show')]//span[contains(text(),'Send Text')]");
	public By patientIntakeFormEditCheckbox = By.xpath("//label[@for='chkg13PatientIntakeFormEdit']");
	public By cellNumberInput = By.id("Patient_PatientIntakeForm_CellNumber");
	public By patientIntakeFormPrintCheckbox = By.xpath("//label[@for='chkg13PatientIntakeFormPrint']");
	public By sendMailOption = By.xpath(
			"//div[contains(@class,'gridRecordContext') and contains(@class,'show')]//span[contains(text(),'Send Mail')]");
	public By sendTextOption = By.xpath(
			"//div[contains(@class,'gridRecordContext') and contains(@class,'show')]//span[contains(text(),'Send Text')]");
	public By printOption = By.xpath(
			"//div[contains(@class,'gridRecordContext') and contains(@class,'show')]//span[contains(text(),'Print')]");

	// PatientHealthCard
	public By rxHealthCardTab = By.xpath("//a[normalize-space()='Rx Health Card']");
	public By addRxHealthCardButton = By.xpath("//span[normalize-space()='Add Rx Health Card']");
	public By saveHealthCardButton = By.id("btnSaveHealthCard");
	public By healthCardActionMenu = By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]");
	public By healthCardEditOption = By.xpath(
			"//div[contains(@class,'gridRecordContext') and contains(@class,'show')]//span[contains(text(),'Edit')]");
	public By healthCardDeleteOption = By.xpath(
			"//div[contains(@class,'gridRecordContext') and contains(@class,'show')]//span[contains(text(),'Delete')]");
	public By editHealthCardOption = By.xpath(
			"//div[contains(@class,'gridRecordContext') and contains(@class,'show')]//span[contains(text(),'Edit')]");
	public By healthCardTagInput = By.id("Tag_Name");
	public By deleteHealthCardOption = By.xpath(
			"//div[contains(@class,'gridRecordContext') and contains(@class,'show')]//span[contains(text(),'Delete')]");
	public By patientHealthCardEditCheckbox = By.xpath("//label[@for='chkg14PatientHealthCardEdit']");
	public By confirmDeleteHealthCardButton = By.id("deletepatientHealthCard");

	// Bucketpage
	public By firstGridLinkButton = By.xpath("(//a[@class='gridLinkButton'])[1]");
	public By documentLibraryButton = By.xpath("//a[@id='btnDocumentLibrary']//*[name()='svg']");
	public By newFolderButton = By.xpath("//a[@title='New Folder']//*[name()='svg']");
	public By folderNameInput = By.id("BucketFolder_FolderName");
	public By folderTypeDropdown = By.id("BucketFolder_Type");
	public By editFolderButton = By.xpath("//div[10]//div[2]//a[1]//img[1]");
	public By deleteFolderButton = By.xpath("//a[@id='btnDeleteFolder']//img");
	public By bucketDeleteConfirmButton = By.xpath("//div[@id='deleteFolderModel']//button[@id='btnDeleteConfirm']");
	public By folderRow = By.id("0e1ca86a-1861-472a-82ce-81d5b0ccddba");
	public By addFileIcon = By.xpath("//*[name()='path' and @id='Path_707']");
	public By fileUploadInput = By.xpath("//div[@id='fileUpload']//input[@id='file-3']");
	public By saveFileButton = By.id("btnSaveFile");
	public By editFileButton = By.xpath("//div[@class='documentLibraryContentMain']//div[1]//div[2]//a[1]//img[1]");
	public By fileNameInput = By.id("fileNameTextBox");
	public By deleteFileButton = By.xpath("//div[@class='documentLibraryContentMain']//div[1]//div[2]//a[2]//img[1]");
	public By deleteFileConfirmButton = By.id("btnDeleteFileConfirm");
	public By downloadFileIcon = By.xpath(
			"//div[@class='documentLibraryContentMain']//div[1]//div[2]//a[4]//*[name()='svg']//*[name()='path' and @id='Path_2898']");
	public By closeFileViewerButton = By.xpath("//button[@onclick='CloseDocViewer();']//i[@class='fa fa-times']");
	public By homeButton = By.xpath("//a[@title='Home']//*[name()='svg']");
	public By addFolderButton = By.xpath("//a[@title='New Folder']//*[name()='svg']");
	public By patientBucketAllCheckbox = By.xpath("//label[@for='chkg14PatientBucketAll']");
	public By patientBucketFolderAddCheckbox = By.xpath("//label[@for='chkg14PatientBucketFolderAdd']");
	public By patientBucketFolderEditCheckbox = By.xpath("//label[@for='chkg14PatientBucketFolderEdit']");
	public By patientBucketFolderDeleteCheckbox = By.xpath("//label[@for='chkg14PatientBucketFolderDelete']");
	public By patientBucketFileDownloadCheckbox = By.xpath("//label[@for='chkg14PatientBucketFileDownload']");
	public By patientBucketViewCheckbox = By.xpath("//label[@for='chkg14PatientBucketView']");
	public By patientHealthCardAllCheckbox = By.xpath("//label[@for='chkg14PatientHealthCardAll']");
	public By patientHealthCardAddCheckbox = By.xpath("//label[@for='chkg14PatientHealthCardAdd']");

	// ReferralSourcepage
	public By patientReferralSourceAllCheckbox = By.xpath("//label[@for='chkg9PatientReferralSourceAll']");
	public By patientReferralSourceViewCheckbox = By.xpath("//label[@for='chkg9PatientReferralSourceView']");
	public By patientReferralSourceAddCheckbox = By.xpath("//label[@for='chkg9PatientReferralSourceAdd']");
	public By newReferralSourceButton = By.xpath("//span[normalize-space()='New Referral Source']");
	public By referralSourceDescriptionInput = By.xpath("//input[@id='ReferralSource_Description']");
	public By referralSourceSaveButton = By.xpath("//button[@id='btnSave']");
	public By referralSourceFirstRowActionMenu = By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]");
	public By confirmDeleteReferralSourceButton = By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']");
	public By patientReferralSourceEditCheckbox = By.xpath("//label[@for='chkg10PatientReferralSourceEdit']");

	// ReviewCategoryPage
	public By patientReviewCategoryAllCheckbox = By.xpath("//label[@for='chkg13PatientReviewCategoryAll']");
	public By patientReviewCategoryViewCheckbox = By.xpath("//label[@for='chkg13PatientReviewCategoryView']");
	public By patientReviewCategoryAddCheckbox = By.xpath("//label[@for='chkg13PatientReviewCategoryAdd']");
	public By newReviewCategoryButton = By.xpath("//span[normalize-space()='New Review Categories']");
	public By reviewCategoryDescriptionInput = By.xpath("//input[@id='ReviewCategory_Description']");
	public By addReviewCategorySaveButton = By.xpath("//button[@id='btnSave']");
	public By patientReviewCategoryEditCheckbox = By.xpath("//label[@for='chkg13PatientReviewCategoryEdit']");

	// LocatorTagPage
	public By newTagButton = By.xpath("//span[normalize-space()='New Tag']");
	public By firstTagActionMenu = By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]");
	public By editTagOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By patientTagAddLabel = By.xpath("//label[@for='chkg10PatientTagAdd']");
	public By btnNewTag = By.xpath("//span[normalize-space()='New Tag']");
	public By txtTagName = By.id("Tag_Name");
	public By txtTagDescription = By.id("Tag_Description");
	public By confirmDeleteButtontag = By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']");

	// LocatorDedupePage
	public By lastNameLabel = By.xpath("//label[normalize-space()='Last Name']");
	public By firstNameLabel = By.xpath("//label[normalize-space()='First Name']");
	public By findDuplicateButton = By.xpath("//span[normalize-space()='Find Duplicate']");
	public By firstRecordCheckbox = By.xpath("(//label[starts-with(@for,'ckhg_')])[1]");
	public By secondRecordCheckbox = By.xpath("(//label[starts-with(@for,'ckhg_')])[2]");
	public By tableSortColumn8 = By.xpath("//table[1]//thead[1]//tr[1]//th[8]//a[1]");
	public By firstCheckboxOnNextPage = By.xpath("(//input[starts-with(@id,'chkg_')])[1]");
	public By finishButton = By.xpath("//a[normalize-space()='Finish']");
	public By patientDeDupeAllCheckbox = By.xpath("//label[@for='chkg11PatientDeDupeAll']");
	public By errorHeader = By.xpath("//h2[normalize-space()='Error']");

	// LocatorPatinetPage
	public By resetPatientPasswordButton = By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/button[1]/i[1]");
	public By resetPatientPasswordText = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Reset Password')]");
	public By deleteRPMDeviceIcon = By.xpath("//tbody/tr/td[4]/div[1]/div[1]/button[1]/i[1]");
	public By deleteRPMDeviceText = By.xpath("//a[@id='btnDeleteRPMDeviceConfirm']//span[contains(text(),'Delete')]");
	public By editRPMDeviceIcon = By.xpath("//tbody/tr/td[4]/div[1]/div[1]/button[1]/i[1]");
	public By editRPMDeviceText = By
			.xpath("//a[@class='tooltiped txt-decor-none user-access']//span[contains(text(),'Edit')]");
	public By addRPMDeviceIcon = By.xpath(
			"//div[@class='model-inp dropdownCaretAdd mb-0']//div[@class='usersearch plus-usersearch']//*[name()='svg']");
	public By exportPatientDataToExcelButton = By.xpath("//span[normalize-space()='Export Excel']");
	public By outgoingCallButtonIcon = By
			.xpath("//div[@id='page-wrapper']//div[4]//div[2]//button[1]//*[name()='svg']");
	public By addDeliveryPreferenceButton = By.xpath("//button[@id='btnAddDeliveryPreference']");
	public By quickTextButton = By.xpath("//span[normalize-space()='Quick Text']");
	public By sendButton = By.id("btnSave");
	public By bodyRequiredValidation = By.xpath("//div[contains(text(),'Body should not be empty.')]");
	public By phoneRequiredValidation = By.xpath("//div[contains(text(),'Please enter phone number.')]");
	public By saveButton = By.id("btnSave");
	public By preloader = By.cssSelector("div.preloader");
	public By sendVCardButton = By.xpath("//span[normalize-space()='Send VCard']");
	public By sendVCardSubmitButton = By.id("btnSendVCard");
	public By vcardValidationToastMessage = By.xpath("//div[@class='toast-message']");
	public By patientActionMenuButton = By.xpath("//tbody/tr[1]/td[12]//button//i");
	public By deletePatientOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Delete']");
	public By cancelDeletePatientButton = By
			.xpath("//button[contains(@onclick,'CloseDeletePopup')]//i[contains(@class,'fa-times')]");
	public By deletePatientToastMessage = By.xpath("//div[@class='toast-message']");
	public By addToFollowupButton = By.xpath("//span[normalize-space()='Add To Followup']");
	public By nextButton = By.xpath("//a[normalize-space()='Next']");
	public By blankSubmissionErrorToast = By.xpath("//div[@class='toast toast-error']");
	public By newPatientButton = By.xpath("//span[normalize-space()='New Patient']");
	public By searchPatientButton = By.xpath("//button[@id='btnFindPatient']");
	public By selectExistingPatientButton = By.xpath("//button[normalize-space()='Select Existing Patient']");
	public By addNewPatientButton = By.xpath("//button[normalize-space()='Add New Patient']");
	public By filterButton = By.xpath("//span[normalize-space()='Filter']");
	public By filterLastNameInput = By.xpath("//input[@id='Filter_LastName']");
	public By filterCancelButton = By.xpath("//button[@type='button']//i[@class='fa-solid fa-xmark']");
	public By patientListTable = By.xpath("//table");
	public By editPatientOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By nextOfKinLastNameInput = By.xpath("//input[@id='Patient_NextofKinLastName']");
	public By editPatientCancelButton = By.xpath("//a[normalize-space()='Cancel']");
	public By addToTrialOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Add To Trail')]");
	public By patientActionMenuButtonBlankEmail = By.xpath("//tbody/tr[2]/td[12]/div[1]/div[1]/button[1]/i[1]");
	public By enableLoginOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Enable Login')]");
	public By validationToastMessage = By.xpath("//div[@class='toast-message']");
	public By addTagButton = By.xpath("//span[normalize-space()='New Tag']");
	public By saveTagButton = By.xpath("//button[@id='btnSave']");
	public By updatedByColumn = By.xpath("//th[normalize-space()='Updated By']");
	public By updatedDateColumn = By.xpath("//th[normalize-space()='Updated Date']");
	public By patientActionMenuIcon = By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/button[1]/i[1]");
	public By lastNameField = By.xpath("//input[@id='Patient_LastName']");
	public By firstNameField = By.xpath("//input[@id='Patient_FirstName']");
	public By birthDateField = By.xpath("//input[@id='Patient_BirthDate']");
	public By phoneNumberField = By.xpath("//input[@id='Patient_PhoneNumber']");
	public By editPatientButton = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By editPatientButtonIcon = By.xpath("//a[@id='btnEditPatient']//*[name()='svg']");
	public By deletePatientButton = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	public By rowActionButton = By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/button[1]/i[1]");
	public By privateNotesTextArea = By.xpath("//textarea[@id='Patient_PrivateNotes']");
	public By deleteConfirmButton = By.xpath("//div[@id='deletePatientModel']//button[@id='btnDeleteConfirm']");
	public By firstPatientLink = By.xpath("(//a[@class='gridLinkButton'])[1]");
	public By sendForReviewIcon = By.xpath("//*[name()='path' and contains(@d,'M9.0949 14')]");
	public By tagsLabel = By.xpath("//label[normalize-space()='Tags']");
	public By saveSendForReviewButton = By.xpath("//button[@id='savesendforreview']");
	public By patientSignatureButton = By.xpath("//a[@id='btnpatientSignature']//*[name()='svg']");
	public By emailOption = By.xpath("//a[normalize-space()='Email']");
	public By mailTemplateDropdown = By.id("MailTemplate_Id");
	public By editorTextArea = By.xpath("//div[@aria-label='Editor editing area: main. Press Alt+0 for help.']//p");
	public By signatureCheckbox = By.xpath("//label[normalize-space()='Placeat esse ut cu']");
	public By savePatientSignatureButton = By.id("btnPatientSignatureSave");
	public By textOption = By.xpath("//a[normalize-space()='Text']");
	public By smsTemplateDropdown = By.id("SMSTemplate_Id");
	public By patientSignaturesTab = By.xpath("//a[normalize-space()='Patient Signatures']");
	public By sixthPatientSignatureLink = By
			.xpath("//tbody/tr/td[@scope='row']//a[.//*[name()='path' and @id='Path_1']]");
	public By tagInputField = By.xpath("//div[@class='col-md-4']//input[@type='text']");
	public By firstTagOption = By
			.xpath("(//ul[contains(@class,'multiple-select-dropdown')]//li[not(@class='disabled')]//label)[1]");
	public By patientTagButton = By.xpath("//div[@id='btnPatientTag']//*[name()='svg']");
	public By firstMappedTagDropdown = By
			.xpath("(//ul[@class='dropdownSelectedLabelMain']//li//a[@id='btnAddPatientTag'])[1]");
	public By deleteMappedTagButton = By.xpath("//div[33]//div[1]//div[1]//div[1]//button[1]//i[1]");
	public By prescriptionIcon = By.xpath("//*[name()='path' and @id='Path_2472']");
	public By patientIdInput = By.id("Filter_PatientId");
	public By searchIcon = By.xpath("//i[@class='fa-solid fa-magnifying-glass']");
	public By referralsTab = By.xpath("//a[normalize-space()='Referrals']");
	public By newAssignmentText = By.xpath("//td[normalize-space()='New Assignment']");
	public By referralStatus = By.xpath("//td[normalize-space()='New Assignment']");
	public By referralInput = By.xpath("//div[@class='col-md-4 px-0']//input[@type='text']");
	public By firstReferralOption = By.xpath(
			"(//h6[.='Referral Source']//following::ul[contains(@class,'multiple-select-dropdown')]//li[not(contains(@class,'disabled'))]//span)[1]");
	public By addButton = By.xpath("//div[@id='btnPatientReferralSource']//*[name()='svg']");
	public By firstRowActionButton = By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]");
	public By enrollmentInput = By.xpath("//div[@class='col-md-4 pr-0']//input[@type='text']");
	public By firstEnrollmentOption = By.xpath(
			"(//h6[.='Enrollment']//following::ul[contains(@class,'multiple-select-dropdown')]//li[not(contains(@class,'disabled'))]//span)[1]");
	public By firstEnrollmentActionButton = By
			.xpath("(//ul[@class='dropdownSelectedLabelMain']/li//a[@id='btnAddPatientEnrollment'])[1]");
	public By deleteEnrollmentButton = By
			.xpath("//button[@onclick='javascript: CloseDeletePatientEnrollmentPopup();']//i[@class='fa fa-times']");
	public By statusDropdown = By.id("Patient_Status");
	public By updateButton = By.xpath("//a[@class='patientStatusBtn']//*[name()='svg']");
	public By primaryDropdown = By.id("Patient_PrimaryDeliveryPreferenceType");
	public By secondaryDropdown = By.id("Patient_SecondaryDeliveryPreferenceType");
	public By outgoingCallButton = By.xpath("//div[@id='page-wrapper']//div[4]//div[2]//button[1]//*[name()='svg']");
	public By closeDialerButton = By.xpath("//i[@onclick='closeDialerDialog();']");
	public By exportToExcelButton = By.xpath("//div[@id='content']//div//div[5]//div[2]//button[1]//*[name()='svg']");
	public By deviceDropdown = By.id("registeredDeviceId");
	public By addDeviceButton = By.xpath(
			"//div[@class='model-inp dropdownCaretAdd mb-0']//div[@class='usersearch plus-usersearch']//*[name()='svg']");
	public By actionButton = By.xpath("//tbody/tr/td[4]/div[1]/div[1]/button[1]/i[1]");
	public By editOption = By
			.xpath("//a[@class='tooltiped txt-decor-none user-access']//span[contains(text(),'Edit')]");
	public By activeCheckbox = By.xpath("//label[@id='chk2PatientRPMDevice_IsActive']");
	public By resetPasswordOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Reset Password')]");
	public By newPasswordField = By.id("newPassword");
	public By confirmPasswordField = By.id("confirmPassword");
	public By resetButton = By.id("btnResetPassword");
	public By firstPatientViewButton = By.xpath("(//a[@class='gridLinkButton'])[1]");
	public By addReferralSourceIcon = By.xpath(
			"//div[@id='btnPatientReferralSource']//*[name()='svg']//*[name()='path' and contains(@d,'M256 80c0-')]");
	public By deleteReferralSourceIcon = By.xpath(
			"//a[@id='btnAddPatientReferralSource']//*[name()='svg']//*[name()='g' and @id='Group_466']//*[name()='circle' and @id='Ellipse_42']");
	public By addPatientEnrollmentIcon = By.xpath(
			"//div[@id='btnPatientEnrollmentApp']//*[name()='svg']//*[name()='path' and contains(@d,'M256 80c0-')]");
	public By deletePatientEnrollmentIcon = By
			.xpath("(//ul[@class='dropdownSelectedLabelMain']/li//a[@id='btnAddPatientEnrollment'])[1]");
	public By updatePatientStatusIcon = By.xpath("//a[@class='patientStatusBtn']//*[name()='svg']");

	// LocatorReferralpage
	public By addPatientIcon = By.xpath("//a[@id='addPatientNamePopup']//img");
	public By selectPatientRadio = By.id("d2666909-ed0d-49fd-9500-af849059511e");
	public By selectPatientBtn = By.id("btnPatient");
	public By referralEntityType = By.id("ReferralEntityType");
	public By addProviderIcon = By.xpath("//a[@id='addCurrentProviderPopup']//img");
	public By fullSearchRadio = By.id("rdoFullSearch");
	public By providerLastNameInput = By.id("Filter_DoctorLastName");
	public By selectProviderRadio = By.id("9759a37e-c5fa-4310-abfd-ecc9ab729697");
	public By selectProviderBtn = By.id("btnProvider");
	public By referralType = By.id("ReferralType");
	public By referralCategory = By.id("ReferralCategoryId");
	public By priority = By.id("Priority");
	public By moreOptionsIcon = By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']");
	public By deleteOption = By.xpath("//span[normalize-space()='Delete']");
	public By confirmDeleteButton = By
			.xpath("//div[@id='deleteClinicalMedReconModel']//button[@id='btnDeleteConfirm']");
	public By confirmDeleteAppointmentButton = By.xpath("//button[@id='btnDeleteAppointmentConfirm']");

	// LocatorTagPage
	public By tagNameInput = By.xpath("//input[@id='PatientHealthCard_RxBin']");
	public By cancelEditTagTypeButton = By
			.xpath("//button[@onclick='javascript: CloseaddTagModal();']//i[@class='fa fa-times']");
	public By tagTypeNameInList = By.xpath("//table//tbody/tr[1]/td[1]");
	public By tagActionMenuButton = By.xpath(
			"//tbody/tr[1]/td[last()]//button//i[contains(@class,'ellipsis') or contains(@class,'fa-ellipsis')]");
	public By editTagTypeOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[contains(text(),'Edit')]");
	public By deleteTagOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	public By cancelDeleteTagButton = By
			.xpath("//button[@onclick='javascript: CloseDeletePopup();']//i[@class='fa fa-times']");
	public By patientTagAllPermissionCheckbox = By.xpath("//label[@for='chkg10PatientTagAll']");
	public By patientTagViewPermissionCheckbox = By.xpath("//label[@for='chkg10PatientTagView']");

	// LocatorReviewCategoriesPage
	public By addReviewCategoryButton = By.xpath("//span[normalize-space()='New Review Categories']");
	public By saveReviewCategoryButton = By.xpath("//button[@id='btnSave']");
	public By addReviewCategoryModal = By.xpath("//div[@id='addReviewCategoryModal']//div[@class='modal-header']");
	public By reviewCategoryActionMenuButton = By.xpath("//tbody/tr[1]/td[6]/div[1]/div[1]/button[1]/i[1]");
	public By editReviewCategoryOption = By.xpath("//span[normalize-space()='Edit']");
	public By reviewCategoryNameInput = By.xpath("//input[@id='ReviewCategory_Name']");
	public By cancelEditReviewCategoryButton = By
			.xpath("//button[@onclick='javascript: CloseaddReviewCategoryModal();']//i[@class='fa fa-times']");
	public By reviewCategoryName = By.xpath("//tbody/tr[1]/td[2]");
	public By deleteReviewCategoryButton = By.xpath("//span[normalize-space()='Delete']");
	public By cancelDeleteReviewCategoryButton = By
			.xpath("//button[@onclick='javascript: CloseDeletePopup();']//i[@class='fa fa-times']");

	// LocatorReferralSourcesPage
	public By addReferralSourceButton = By.xpath("//span[normalize-space()='New Referral Source']");
	public By addReferralSourceSaveButton = By.xpath("//button[@id='btnSave']");
	public By editReferralSourceOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By referralSourceNameInput = By.xpath("//input[@id='ReferralSource_Name']");
	public By cancelEditReferralSourceButton = By
			.xpath("//button[@onclick='javascript: CloseaddReferralSourceModal();']//i[@class='fa fa-times']");
	public By actionMenuForReferralSource = By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]");
	public By deleteReferralSourceOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	public By cancelDeleteReferralSourceButton = By
			.xpath("//button[@onclick='javascript: CloseDeletePopup();']//i[@class='fa fa-times']");

	// LocatorEnrollmentsPage
	public By addEnrollmentButton = By.xpath("//span[normalize-space()='New Enrollment']");
	public By addEnrollmentForm = By.xpath("//div[@id='addEnrollmentModal']//div[@class='modal-header']");
	public By editEnrollmentOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By enrollmentNameField = By.id("Enrollment_Name");
	public By cancelEditEnrollmentButton = By
			.xpath("//button[@onclick='javascript: CloseaddEnrollmentModal();']//i[@class='fa fa-times']");
	public By enrollmentNameFromList = By.xpath("//tbody/tr[1]/td[2]");
	public By enrollmentActionMenuButton = By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/button[1]/i[1]");
	public By deleteEnrollmentOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	public By cancelDeleteEnrollmentButton = By
			.xpath("//button[@onclick='javascript: CloseDeletePopup();']//i[@class='fa fa-times']");
	public By patientEnrollmentAllCheckbox = By.xpath("//label[@for='chkg10PatientEnrollmentAll']");
	public By patientEnrollmentViewCheckbox = By.xpath("//label[@for='chkg10PatientEnrollmentView']");
	public By patientEnrollmentAddCheckbox = By.xpath("//label[@for='chkg10PatientEnrollmentAdd']");
	public By newEnrollmentButton = By.xpath("//span[normalize-space()='New Enrollment']");
	public By enrollmentNameInput = By.xpath("//input[@id='Enrollment_Name']");
	public By enrollmentSaveButton = By.xpath("//button[@id='btnSave']");
	public By confirmDeleteEnrollmentButton = By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']");
	public By patientEnrollmentEditCheckbox = By.xpath("//label[@for='chkg10PatientEnrollmentEdit']");

	// LocatorDeDupePage
	public By findDuplicateOption = By.xpath("//span[normalize-space()='Find Duplicate']");
	public By dobLabel = By.xpath("//label[normalize-space()='Date of Birth']");
	public By toastMessage = By.xpath("//div[@class='toast-message']");

	// LocatorProfilesPage
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

	// GenerateNewAccessCode
	public void canAddGenerateAccessCode() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	}

	public void userShouldBeAbleToAddGenerateNewAccessCode() {
		sleep(3000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(firstPatientLink)).click();
		sleep(3000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(accessCodeTab)).click();
		sleep(3000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(generateAccessCodeButton)).click();
	}

	public void addGenerateAccessCode() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();

	}

	public void userShouldNotBeAbleToUseQuickTextReplyOrSendVCard() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(viewPatientTextIcon)).click();
		sleep(3000);
		if (!driver.findElements(quickTextOption).isEmpty()) {
			throw new AssertionError("Quick Text option should not be visible");
		}
		if (!driver.findElements(sendVCardOption).isEmpty()) {
			throw new AssertionError("Send VCard option should not be visible");
		}
	}

	public void userShouldNotBeAbleToAddGenerateNewAccessCode() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPatientLink)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(accessCodeTab)).click();
		sleep(3000);
		List<WebElement> generateElements = driver.findElements(generateAccessCodeButton);
		if (!generateElements.isEmpty()) {
			throw new AssertionError("Generate Access Code button should not be visible");
		}
	}

	public void noAddGenerateAccessCode() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement generateAccessCodeAllElement = wait
				.until(ExpectedConditions.elementToBeClickable(generateNewAccessCodeAllCheckbox));
		generateAccessCodeAllElement.click();

	}

	// PatientExternalSource
	public void userShouldBeAbleToDeletePatientExternalSource() {
		wait.until(ExpectedConditions.elementToBeClickable(externalSourceTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(actionDropdownButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void userShouldBeAbleToEditPatientExternalSource() {
		wait.until(ExpectedConditions.elementToBeClickable(externalSourceTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(actionDropdownButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		WebElement patientIdField = wait.until(ExpectedConditions.visibilityOfElementLocated(externalPatientIdField));
		patientIdField.clear();
		patientIdField.sendKeys(Hooks.prop.getProperty("patient.id.value"));
		wait.until(ExpectedConditions.elementToBeClickable(saveExternalSourceButton)).click();
	}

	public void userShouldNotBeAbleToDeletePatientExternalSource() {
		wait.until(ExpectedConditions.elementToBeClickable(externalSourceTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(actionDropdownButton)).click();
		List<WebElement> deleteElements = driver.findElements(deleteOption);
		if (!deleteElements.isEmpty()) {
			throw new AssertionError("Delete option should not be visible for Patient External Source");
		}
	}

	public void userShouldNotBeAbleToEditOrDeletePatientExternalSource() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(externalSourceTab)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(actionDropdownButton)).click();
		sleep(2000);
		List<WebElement> editElements = driver.findElements(editOption);
		if (!editElements.isEmpty()) {
			throw new AssertionError("Edit option should not be visible for Patient External Source");
		}
		List<WebElement> deleteElements = driver.findElements(deleteOption);
		if (!deleteElements.isEmpty()) {
			throw new AssertionError("Delete option should not be visible for Patient External Source");
		}
	}

	public void userShouldBeAbleToAddPatientExternalSource() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPatientLink)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(externalSourceTab)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(addExternalSourceButton)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(externalSourceDropdown));
		sleep(3000);
		selectDropdownByIndexWhenReady(externalSourceDropdown, 1);
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(externalPatientIdField))
				.sendKeys(Hooks.prop.getProperty("patient.id.value"));
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(saveExternalSourceButton)).click();
	}

	public void addPatientExternalSource() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement patientEHRAllElement = wait.until(ExpectedConditions.elementToBeClickable(patientEHRAllCheckbox));
		patientEHRAllElement.click();
		sleep(2000);
		WebElement patientEHRAddElement = wait.until(ExpectedConditions.elementToBeClickable(patientEHRAddCheckbox));
		patientEHRAddElement.click();

	}

	public void addEditDeletePatientExternalSource() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();

	}

	public void addEditPatientExternalSource() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement patientEHRAllElement = wait.until(ExpectedConditions.elementToBeClickable(patientEHRAllCheckbox));
		patientEHRAllElement.click();
		sleep(2000);
		WebElement patientEHRAddElement = wait.until(ExpectedConditions.elementToBeClickable(patientEHRAddCheckbox));
		patientEHRAddElement.click();
		sleep(2000);
		WebElement patientEHREditElement = wait.until(ExpectedConditions.elementToBeClickable(patientEHREditCheckbox));
		patientEHREditElement.click();

	}

	// PatientCommunication
	public void userShouldNotBeAbleToDeletePatientCommunication() {
		wait.until(ExpectedConditions.elementToBeClickable(communicationTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(actionDropdownButton)).click();
		List<WebElement> deleteElements = driver.findElements(deleteOption);
		if (!deleteElements.isEmpty()) {
			throw new AssertionError("Delete option should not be visible for Patient Communication");
		}
	}

	public void userShouldBeAbleToEditPatientCommunication() {
		wait.until(ExpectedConditions.elementToBeClickable(communicationTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(actionDropdownButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		WebElement notesField = wait.until(ExpectedConditions.visibilityOfElementLocated(communicationNotesField));
		notesField.clear();
		notesField.sendKeys(Hooks.prop.getProperty("communication.notes.value"));
		wait.until(ExpectedConditions.elementToBeClickable(saveCommunicationButton)).click();
	}

	public void verifyUserCannotEditOrDeletePatientCommunication() {
		sleep(3000);
		clickWhenClickable(communicationTabLink);
		sleep(2000);
		clickWhenClickable(patientCommunicationActionMenuButton);
		sleep(1000);
		assertElementNotPresent(patientCommunicationEditOption);
		assertElementNotPresent(patientCommunicationDeleteOption);
	}

	public void verifyUserCanAddPatientCommunication() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPatientLink)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(communicationTab)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(addCommunicationButton)).click();
		sleep(2000);
		WebElement notesField = wait.until(ExpectedConditions.visibilityOfElementLocated(communicationNotesField));
		notesField.clear();
		notesField.sendKeys(Hooks.prop.getProperty("communication.notes.value"));
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveCommunicationButton)).click();
		sleep(2000);
	}

	public void enableAddAccessPatientCommunication() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement patientCommunicationAllElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientCommunicationAll));
		patientCommunicationAllElement.click();
		sleep(2000);
		WebElement patientCommunicationAddElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientCommunicationAdd));
		patientCommunicationAddElement.click();
		sleep(2000);

	}

	public void deleteCommunication() {
		wait.until(ExpectedConditions.elementToBeClickable(communicationTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(actionDropdownButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteMenuOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void createPatientCommunicationProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement patientCommunicationAllElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientCommunicationAll));
		patientCommunicationAllElement.click();
		sleep(2000);
		WebElement patientCommunicationAddElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientCommunicationAdd));
		patientCommunicationAddElement.click();
		sleep(2000);
		WebElement patientCommunicationEditElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientCommunicationEditCheckbox));
		patientCommunicationEditElement.click();
		sleep(2000);

	}

	public void createAddEditPatientCommunicationProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement patientCommunicationAllElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientCommunicationAll));
		patientCommunicationAllElement.click();
		sleep(2000);
		WebElement patientCommunicationAddElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientCommunicationAdd));
		patientCommunicationAddElement.click();
		sleep(2000);
		WebElement patientCommunicationEditElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientCommunicationEditCheckbox));
		patientCommunicationEditElement.click();
		sleep(2000);
		WebElement patientCommunicationDeleteElement = wait
				.until(ExpectedConditions.elementToBeClickable(communicationDeleteCheckbox));
		patientCommunicationDeleteElement.click();
		sleep(2000);

	}

	// PatientPhysian
	public void deletePatientPhysician() {
		wait.until(ExpectedConditions.elementToBeClickable(physicianTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(recordDropdownButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void verifyCannotDeletePatientPhysician() {
		wait.until(ExpectedConditions.elementToBeClickable(physicianTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(recordDropdownButton)).click();
		if (driver.findElements(deleteOption).size() > 0) {
			throw new AssertionError("Delete option is visible but should not be available.");
		}
	}

	public void editPatientPhysician() {
		wait.until(ExpectedConditions.elementToBeClickable(physicianTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(recordDropdownButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(checkBox)).click();
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void verifyCannotEditOrDeletePatientPhysician() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(physicianTab)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(recordDropdownButton)).click();
		sleep(2000);
		if (driver.findElements(editOption).size() > 0) {
			throw new AssertionError("Edit option is visible but should not be available.");
		}
		if (driver.findElements(deleteOption).size() > 0) {
			throw new AssertionError("Delete option is visible but should not be available.");
		}
	}

	public void addPatientPhysician(String lastName) {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPatientLink)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(physicianTab)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(addPhysicianButton)).click();
		sleep(2000);
		WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameInput));
		input.clear();
		input.sendKeys(lastName);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPhysicianCheckbox)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(addProviderButton)).click();
	}

	public void enableAddAccessPatientPhysician() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement patientPhysicianAllElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientPhysicianAll));
		patientPhysicianAllElement.click();
		sleep(2000);
		WebElement patientPhysicianAddElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientPhysicianAdd));
		patientPhysicianAddElement.click();
		sleep(2000);

	}

	public void enableAddEditPatientPhysicianAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement patientPhysicianAllElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientPhysicianAll));
		patientPhysicianAllElement.click();
		sleep(2000);
		WebElement patientPhysicianAddElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientPhysicianAdd));
		patientPhysicianAddElement.click();
		sleep(2000);
		WebElement patientPhysicianEditElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientPhysicianEdit));
		patientPhysicianEditElement.click();
		sleep(2000);

	}

	public void enableFullAccessPatientPhysicianProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// PatientPharmacy
	public void setupPatientPharmacyAddEditAccessProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement patientPharmacyAllElement = wait.until(ExpectedConditions.elementToBeClickable(patientPharmacyAll));
		patientPharmacyAllElement.click();
		sleep(2000);
		WebElement patientPharmacyAddElement = wait.until(ExpectedConditions.elementToBeClickable(patientPharmacyAdd));
		patientPharmacyAddElement.click();
		sleep(2000);
		WebElement patientPharmacyDeleteElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientPharmacyDelete));
		patientPharmacyDeleteElement.click();

	}

	public void enableFullAccessPatientPharmacyProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();

	}

	public void setupPatientPharmacyAddAccessProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement patientPharmacyAllElement = wait.until(ExpectedConditions.elementToBeClickable(patientPharmacyAll));
		patientPharmacyAllElement.click();
		sleep(2000);
		WebElement patientPharmacyAddElement = wait.until(ExpectedConditions.elementToBeClickable(patientPharmacyAdd));
		patientPharmacyAddElement.click();

	}

	public void addPatientPharmacy(String businessName) {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPatientLink)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(pharmacyTab)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(addPharmacyButton)).click();
		sleep(2000);
		WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(businessNameInput));
		input.clear();
		input.sendKeys(businessName);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPharmacyCheckbox)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(addPartnerButton)).click();
	}

	public void verifyCannotEditOrDeletePatientPharmacy() {
		sleep(2000);
		if (driver.findElements(deletePharmacyIcon).size() > 0) {
			throw new AssertionError("Delete Pharmacy option is visible, but user should not have Edit/Delete access.");
		}
	}

	public void editPatientPharmacy() {
		wait.until(ExpectedConditions.elementToBeClickable(pharmacyTab)).click();
	}

	public void verifyCannotDeletePatientPharmacy() {
		if (driver.findElements(deletePharmacyIcon).size() > 0) {
			throw new AssertionError("Delete Pharmacy option is visible, but user should not have Delete access.");
		}
	}

	public void deletePatientPharmacy() {
		wait.until(ExpectedConditions.elementToBeClickable(deletePharmacyIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	// PatientMedsOnChart
	public void copyPatientMedsToMedication() {
		wait.until(ExpectedConditions.elementToBeClickable(medsOnChartTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(copyToMedicationIcon)).click();
	}

	public void verifyCannotDeleteMedsOnChart() {
		wait.until(ExpectedConditions.elementToBeClickable(medsOnChartTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(recordDropdownButton)).click();
		if (driver.findElements(deleteOption).size() > 0) {
			throw new AssertionError("Delete option is present, but user should not be able to delete.");
		}
	}

	public void deletePatientMedsOnChart() {
		wait.until(ExpectedConditions.elementToBeClickable(medsOnChartTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(recordDropdownButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void editPatientMedsOnChart(String direction) {
		wait.until(ExpectedConditions.elementToBeClickable(medsOnChartTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(recordDropdownButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(directionInput));
		input.clear();
		input.sendKeys(direction);
		wait.until(ExpectedConditions.elementToBeClickable(confirmButton)).click();
	}

	public void verifyCannotEditOrDelete() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(medsOnChartTab)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(recordActionIcon)).click();
		if (driver.findElements(medicationsOnChartEditOption).size() > 0) {
			throw new AssertionError("Edit option is present, but should not be.");
		}
		if (driver.findElements(medicationsOnChartDeleteOption).size() > 0) {
			throw new AssertionError("Delete option is present, but should not be.");
		}
	}

	public void addPatientMedsOnChart(String drugName) {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPatientLink)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(medsOnChartTab)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(addMedicationsButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(selectMedicationIcon)).click();
		sleep(2000);
		WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(filterDrugNameInput));
		input.clear();
		input.sendKeys(drugName);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(searchDrugBtn)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(firstDrugCheckbox)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(addDrugButton)).click();
	}

	public void addPatientMedsProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement patientMedsOnChartAllElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientMedsOnChartAll));
		patientMedsOnChartAllElement.click();
		sleep(2000);
		WebElement patientMedsOnChartAddElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientMedsOnChartAdd));
		patientMedsOnChartAddElement.click();

	}

	public void setupPatientMedsAddEditProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement patientMedsOnChartAllElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientMedsOnChartAll));
		patientMedsOnChartAllElement.click();
		sleep(2000);
		WebElement patientMedsOnChartAddElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientMedsOnChartAdd));
		patientMedsOnChartAddElement.click();
		sleep(2000);
		WebElement patientMedsOnChartEditElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientMedsOnChartEdit));
		patientMedsOnChartEditElement.click();

	}

	public void setupPatientMedsFullAccessProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement patientMedsOnChartAllElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientMedsOnChartAll));
		patientMedsOnChartAllElement.click();
		sleep(2000);
		WebElement patientMedsOnChartAddElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientMedsOnChartAdd));
		patientMedsOnChartAddElement.click();
		sleep(2000);
		WebElement patientMedsOnChartEditElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientMedsOnChartEdit));
		patientMedsOnChartEditElement.click();
		sleep(2000);
		WebElement patientMedsOnChartDeleteElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientMedsOnChartDelete));
		patientMedsOnChartDeleteElement.click();

	}

	public void assignFullAccessPatientMedsOnChart() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();

	}

	public void removePatientMedsOnChart() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();

	}

	// PatientMedicationpage
	public void addPatientMedication() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPatientLink)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(medicationTab)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(addMedicationBtn)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(addMedicationPopupIcon)).click();
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(drugNameFilter))
				.sendKeys(Hooks.prop.getProperty("drug.name.value"));
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(searchDrugBtn)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(selectDrugCheckbox)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(selectDrugBtn)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(saveMedicationBtn)).click();
	}

	public void updatePatientMedicationGrossMargin(String marginValue) {
		wait.until(ExpectedConditions.elementToBeClickable(medicationTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(grossMarginInput));
		input.clear();
		input.sendKeys(marginValue);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void updatePatientMedicationSync() {
		wait.until(ExpectedConditions.elementToBeClickable(medicationTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(syncDayDropdown));
		Select select = new Select(driver.findElement(syncDayDropdown));
		select.selectByIndex(1);
		wait.until(ExpectedConditions.elementToBeClickable(saveSyncButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(someCheckbox1)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(someCheckbox2)).click();
	}

	public boolean clickMedicationAndVerifyGM() {
		wait.until(ExpectedConditions.elementToBeClickable(medicationTab)).click();
		return wait.until(ExpectedConditions.visibilityOfElementLocated(totalGMLbl)).isDisplayed();
	}

	public boolean verifyMedicationSync() {
		wait.until(ExpectedConditions.elementToBeClickable(medicationTab)).click();
		return wait.until(ExpectedConditions.visibilityOfElementLocated(totalGMLbl)).isDisplayed();
	}

	public boolean isGrossMarginVisible() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(grossMarginLabel)).isDisplayed();
	}

	public void openMedicationTab() {
		wait.until(ExpectedConditions.elementToBeClickable(medicationTab)).click();
	}

	public void openActionMenu() {
		wait.until(ExpectedConditions.elementToBeClickable(actionMenu)).click();
	}

	public void deletePatientMedication() {
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteBtn)).click();
	}

	public void editPatientMedication() {
		wait.until(ExpectedConditions.elementToBeClickable(medicationTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(rxStatusInput)).clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(rxStatusInput))
				.sendKeys(Hooks.prop.getProperty("rx.status.value"));
		wait.until(ExpectedConditions.elementToBeClickable(saveMedicationBtn)).click();
	}

	public void verifyEditAndDeleteNotAvailable() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(medicationTab)).click();
		WebElement actionIconElement = wait.until(ExpectedConditions.presenceOfElementLocated(actionIcon));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center', inline:'end'});",
				actionIconElement);
		wait.until(ExpectedConditions.elementToBeClickable(actionIconElement)).click();
		Assert.assertTrue(driver.findElements(medicationEditOption).isEmpty(), "Edit option should NOT be visible");
		Assert.assertTrue(driver.findElements(medicationDeleteOption).isEmpty(), "Delete option should NOT be visible");
	}

	public void addAccessPatientMedicationTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement patientMedicationAll = wait
				.until(ExpectedConditions.elementToBeClickable(patientMedicationAllLabel));
		patientMedicationAll.click();
		sleep(2000);
		WebElement patientMedicationAdd = wait
				.until(ExpectedConditions.elementToBeClickable(patientMedicationAddLabel));
		patientMedicationAdd.click();

	}

	public void addEditAccessPatientMedicationTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement patientMedicationAll = wait
				.until(ExpectedConditions.elementToBeClickable(patientMedicationAllLabel));
		patientMedicationAll.click();
		sleep(2000);
		WebElement patientMedicationAdd = wait
				.until(ExpectedConditions.elementToBeClickable(patientMedicationAddLabel));
		patientMedicationAdd.click();
		sleep(2000);
		WebElement patientMedicationEdit = wait
				.until(ExpectedConditions.elementToBeClickable(patientMedicationEditLabel));
		patientMedicationEdit.click();

	}

	public void testAddEditDeleteAccessPatientMedication() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement patientMedicationAll = wait
				.until(ExpectedConditions.elementToBeClickable(patientMedicationAllLabel));
		patientMedicationAll.click();
		sleep(2000);
		WebElement patientMedicationAdd = wait
				.until(ExpectedConditions.elementToBeClickable(patientMedicationAddLabel));
		patientMedicationAdd.click();
		sleep(2000);
		WebElement patientMedicationEdit = wait
				.until(ExpectedConditions.elementToBeClickable(patientMedicationEditLabel));
		patientMedicationEdit.click();
		sleep(2000);
		WebElement patientMedicationDelete = wait
				.until(ExpectedConditions.elementToBeClickable(patientMedicationDeleteLabel));
		patientMedicationDelete.click();

	}

	public void createPatientMedicationAllAccessTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();

	}

	// PatientClaimVerification
	public void addAccessPatientClaimTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement patientClaimVerificationAll = wait.until(ExpectedConditions.elementToBeClickable(patientClaimAll));
		patientClaimVerificationAll.click();
		sleep(2000);
		WebElement patientClaimVerificationAdd = wait.until(ExpectedConditions.elementToBeClickable(patientClaimAdd));
		patientClaimVerificationAdd.click();

	}

	public void sendPatientClaimVerificationForSignature() {
		wait.until(ExpectedConditions.elementToBeClickable(patientClaimVerificationTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(sendMailOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(sendTextOption)).click();
	}

	public void verifySendForSignatureNotAvailable() {
		wait.until(ExpectedConditions.elementToBeClickable(patientClaimVerificationTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuIcon)).click();
		Assert.assertTrue(driver.findElements(sendMailOption).isEmpty(), "Send Mail option should NOT be visible");
		Assert.assertTrue(driver.findElements(sendTextOption).isEmpty(), "Send Text option should NOT be visible");
	}

	public void printPatientClaimVerification() {
		wait.until(ExpectedConditions.elementToBeClickable(patientClaimVerificationTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(printOption)).click();
		((JavascriptExecutor) driver).executeScript("window.print();");
		System.out.println("Patient signature PDF auto-saved in Downloads folder");
		wait.until(ExpectedConditions.elementToBeClickable(closePrintDialogBtn)).click();
	}

	public void verifyPrintAndSendOptionsAreNotAvailable() {
		wait.until(ExpectedConditions.elementToBeClickable(patientClaimVerificationTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuIcon)).click();
		Assert.assertTrue(driver.findElements(printOption).isEmpty(), "Print option should NOT be visible");
		Assert.assertTrue(driver.findElements(sendMailOption).isEmpty(), "Send Mail option should NOT be visible");
		Assert.assertTrue(driver.findElements(sendTextOption).isEmpty(), "Send Text option should NOT be visible");
	}

	public void editPatientClaimVerificationTest() {
		wait.until(ExpectedConditions.elementToBeClickable(patientClaimVerificationTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(cellNumber)).clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(cellNumber))
				.sendKeys(Hooks.prop.getProperty("user.cell.value"));
		wait.until(ExpectedConditions.elementToBeClickable(deleteAdjusterBtn)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(adjusterName))
				.sendKeys(Hooks.prop.getProperty("adjuster.name.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(adjusterEmail))
				.sendKeys(Hooks.prop.getProperty("adjuster.email.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(adjusterPhone))
				.sendKeys(Hooks.prop.getProperty("adjuster.phone.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(adjusterFax))
				.sendKeys(Hooks.prop.getProperty("adjuster.fax.value"));
		driver.findElement(addAdjusterBtn).click();
		wait.until(ExpectedConditions.elementToBeClickable(saveBtn)).click();
	}

	public void verifyEditPrintSendOptionsAreNotAvailable() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(patientClaimVerificationTab)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(patientActionButtonIcon)).click();
		sleep(2000);
		Assert.assertTrue(driver.findElements(claimVerificationEditOption).isEmpty(),
				"Edit option should NOT be visible");
		Assert.assertTrue(driver.findElements(claimVerificationPrintOption).isEmpty(),
				"Print option should NOT be visible");
		Assert.assertTrue(driver.findElements(claimVerificationSendMailOption).isEmpty(),
				"Send Mail option should NOT be visible");
		Assert.assertTrue(driver.findElements(claimVerificationSendTextOption).isEmpty(),
				"Send Text option should NOT be visible");
	}

	public void openPatientClaimVerification() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPatientLink)).click();
		sleep(3000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(patientClaimVerificationIcon)).click();
	}

	public void addAdjuster(String name, String email) {
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(adjusterName)).sendKeys(name);
		sleep(3000);
		driver.findElement(adjusterEmail).sendKeys(email);
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(adjusterPhone))
				.sendKeys(Hooks.prop.getProperty("adjuster.phone.value"));
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(adjusterFax))
				.sendKeys(Hooks.prop.getProperty("adjuster.fax.value"));

	}

	public void selectPayor(String businessName) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(addPayorPopup)).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement fullSearch = wait.until(ExpectedConditions.elementToBeClickable(fullSearchRadio));
		fullSearch.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(payorBusinessName)).sendKeys(businessName);
		wait.until(ExpectedConditions.elementToBeClickable(payorSearchBtn)).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(payorSelectCheckbox)).click();
		wait.until(ExpectedConditions.elementToBeClickable(payorSelectBtn)).click();
	}

	public void addPatientClaimVerificationTest() {
		String profileName = "Test Profile Name";
		String createdEmail = "testprofile@email.com";
		openPatientClaimVerification();
		selectDate(claimDateInput, "09/25/2026");
		addAdjuster(profileName, createdEmail);
		selectPayor("Charlotte Baird");
		enterClaimNumber("1234567890");
		selectPayorAddress();
		savePatientClaimVerification();
	}

	public void selectDate(By dateInput, String date) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(dateInput));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", element);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		element.clear();
		element.sendKeys(date);
		element.sendKeys(Keys.TAB);
	}

	public void enterClaimNumber(String claimNo) {
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(claimNumber)).sendKeys(claimNo);
	}

	public void selectPayorAddress() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(addPayorAddressPopup)).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement addressRadio = wait.until(ExpectedConditions.elementToBeClickable(payorAddressCheckbox));
		addressRadio.click();
		wait.until(ExpectedConditions.elementToBeClickable(payorAddressSelectBtn)).click();
	}

	public void savePatientClaimVerification() {
		sleep(3000);
		driver.findElement(addAdjusterBtn).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(saveBtn)).click();
	}

	public void addEditAccessPatientClaimVerificationTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement patientClaimVerificationAll = wait.until(ExpectedConditions.elementToBeClickable(patientClaimAll));
		patientClaimVerificationAll.click();
		sleep(2000);
		WebElement patientClaimVerificationAdd = wait.until(ExpectedConditions.elementToBeClickable(patientClaimAdd));
		patientClaimVerificationAdd.click();
		sleep(2000);
		WebElement patientClaimVerificationEdit = wait
				.until(ExpectedConditions.elementToBeClickable(patientClaimVerificationEditLabel));
		patientClaimVerificationEdit.click();

	}

	public void addEditPrintAccessPatientClaimVerificationTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement patientClaimVerificationAll = wait.until(ExpectedConditions.elementToBeClickable(patientClaimAll));
		patientClaimVerificationAll.click();
		sleep(2000);
		WebElement patientClaimVerificationAdd = wait.until(ExpectedConditions.elementToBeClickable(patientClaimAdd));
		patientClaimVerificationAdd.click();
		sleep(2000);
		WebElement patientClaimVerificationEdit = wait
				.until(ExpectedConditions.elementToBeClickable(patientClaimVerificationEditLabel));
		patientClaimVerificationEdit.click();
		sleep(2000);
		WebElement patientClaimVerificationPrint = wait
				.until(ExpectedConditions.elementToBeClickable(patientClaimVerificationPrintLabel));
		patientClaimVerificationPrint.click();

	}

	public void addEditPrintSendAccessPatientClaimVerificationTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// PatientIntakeForm
	public void printPatientIntakeForm() {
		sleep(2000);
		clickWhenClickable(patientIntakeFormsTab);
		sleep(2000);
		clickWhenClickable(intakeFormActionMenu);
		sleep(2000);
		clickWhenClickable(printOption);
		sleep(5000);
		((JavascriptExecutor) driver).executeScript("window.print();");
		System.out.println("Patient intake form PDF auto-saved in Downloads folder");
		sleep(5000);
	}

	public void sendPatientIntakeFormForSignature() {
		sleep(7000);
		driver.navigate().refresh();
		clickWhenClickable(patientIntakeFormsTab);
		sleep(2000);
		clickWhenClickable(intakeFormActionMenu);
		sleep(2000);
		clickWhenClickable(sendMailOption);
		sleep(2000);
		clickWhenClickable(intakeFormActionMenu);
		sleep(2000);
		clickWhenClickable(sendTextOption);
	}

	public void verifyRestrictedSendForSignatureActions() {
		sleep(2000);
		clickWhenClickable(patientIntakeFormsTab);
		sleep(2000);
		clickWhenClickable(intakeFormActionMenu);
		sleep(2000);
		assertElementNotPresent(sendMailIntakeFormOption);
		sleep(2000);
		assertElementNotPresent(sendTextIntakeFormOption);
	}

	public void verifyRestrictedPrintAndSignatureActions() {
		sleep(2000);
		clickWhenClickable(patientIntakeFormsTab);
		sleep(2000);
		clickWhenClickable(intakeFormActionMenu);
		sleep(2000);
		assertElementNotPresent(printIntakeFormOption);
		assertElementNotPresent(sendMailIntakeFormOption);
		assertElementNotPresent(sendTextIntakeFormOption);
	}

	public void editPatientIntakeForm() {
		sleep(3000);
		clickWhenClickable(patientIntakeFormsTab);
		sleep(2000);
		clickWhenClickable(intakeFormActionMenu);
		sleep(2000);
		clickWhenClickable(editIntakeFormOption);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(cellNumberInput))
				.sendKeys(Hooks.prop.getProperty("cell.number.value"));
		clickWhenClickable(saveIntakeFormButton);
	}

	public void verifyRestrictedPatientIntakeFormActions() {
		sleep(3000);
		clickWhenClickable(patientIntakeFormsTab);
		sleep(2000);
		clickWhenClickable(intakeFormActionMenu);
		sleep(2000);
		assertElementNotPresent(editIntakeFormOption);
		assertElementNotPresent(printIntakeFormOption);
		assertElementNotPresent(sendMailIntakeFormOption);
		assertElementNotPresent(sendTextIntakeFormOption);
	}

	public void addPatientIntakeForm() {
		sleep(2000);
		clickWhenClickable(firstPatientLink);
		sleep(2000);
		clickWhenClickable(intakeFormButton);
		clickWhenClickable(saveIntakeFormButton);
	}

	public void selectPatientIntakeFormAddAccess() {
		clickWhenClickable(patientIntakeFormAllCheckbox);
		clickWhenClickable(patientIntakeFormAddCheckbox);
	}

	public void verifyIntakeFormAddEditPrint() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement intakeFormAll = wait.until(ExpectedConditions.elementToBeClickable(patientIntakeFormAllCheckbox));
		intakeFormAll.click();
		sleep(2000);
		WebElement intakeFormAdd = wait.until(ExpectedConditions.elementToBeClickable(patientIntakeFormAddCheckbox));
		intakeFormAdd.click();
		sleep(2000);
		WebElement intakeFormEdit = wait.until(ExpectedConditions.elementToBeClickable(patientIntakeFormEditCheckbox));
		intakeFormEdit.click();

	}

	public void createProfileWithPatientIntakeFormAddEditAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement intakeFormAll = wait.until(ExpectedConditions.elementToBeClickable(patientIntakeFormAllCheckbox));
		intakeFormAll.click();
		sleep(2000);
		WebElement intakeFormAdd = wait.until(ExpectedConditions.elementToBeClickable(patientIntakeFormAddCheckbox));
		intakeFormAdd.click();
		sleep(2000);
		WebElement intakeFormEdit = wait.until(ExpectedConditions.elementToBeClickable(patientIntakeFormEditCheckbox));
		intakeFormEdit.click();
		sleep(2000);
		WebElement intakeFormPrint = wait
				.until(ExpectedConditions.elementToBeClickable(patientIntakeFormPrintCheckbox));
		intakeFormPrint.click();

	}

	public void testIntakeFormAddEditPrintSend() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// PatientHealthCard
	public void deletePatientHealthCard() {
		sleep(2000);
		clickWhenClickable(healthCardActionMenu);
		sleep(2000);
		clickWhenClickable(deleteHealthCardOption);
		sleep(1000);
		clickWhenClickable(confirmDeleteHealthCardButton);
	}

	public void createProfileWithHealthCardAddEditDeleteAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement intakeFormAll = wait.until(ExpectedConditions.elementToBeClickable(patientIntakeFormAllCheckbox));
		intakeFormAll.click();
		sleep(2000);
		WebElement intakeFormAdd = wait.until(ExpectedConditions.elementToBeClickable(patientIntakeFormAddCheckbox));
		intakeFormAdd.click();

	}

	public void verifyPatientHealthCardDeleteRestricted() {
		sleep(3000);
		clickWhenClickable(healthCardActionMenu);
		sleep(2000);
		assertElementNotPresent(deleteHealthCardOption);
	}

	public void editPatientHealthCard() {
		sleep(5000);
		clickWhenClickable(healthCardActionMenu);
		sleep(2000);
		clickWhenClickable(editHealthCardOption);
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(tagNameInput))
				.sendKeys(Hooks.prop.getProperty("tag.name.value"));
		sleep(2000);
		clickWhenClickable(saveHealthCardButton);
	}

	public void verifyPatientHealthCardEditDeleteRestricted() {
		sleep(5000);
		clickWhenClickable(healthCardActionMenu);
		sleep(2000);
		assertElementNotPresent(healthCardDeleteOption);
	}

	public void addPatientHealthCard() {
		sleep(4000);
		clickWhenClickable(firstPatientLink);
		sleep(3000);
		clickWhenClickable(rxHealthCardTab);
		sleep(2000);
		clickWhenClickable(addRxHealthCardButton);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(tagNameInput))
				.sendKeys(Hooks.prop.getProperty("tag.name.value"));
		sleep(2000);
		clickWhenClickable(saveHealthCardButton);
	}

	public void createProfileWithPatientHealthCardAddOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement healthCardAll = wait.until(ExpectedConditions.elementToBeClickable(patientHealthCardAllCheckbox));
		healthCardAll.click();
		sleep(2000);
		WebElement healthCardAdd = wait.until(ExpectedConditions.elementToBeClickable(patientHealthCardAddCheckbox));
		healthCardAdd.click();
	}

	public void createProfileWithHealthCardAddEditAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement healthCardAll = wait.until(ExpectedConditions.elementToBeClickable(patientHealthCardAllCheckbox));
		healthCardAll.click();
		sleep(2000);
		WebElement healthCardAdd = wait.until(ExpectedConditions.elementToBeClickable(patientHealthCardAddCheckbox));
		healthCardAdd.click();
		WebElement healthCardEdit = wait.until(ExpectedConditions.elementToBeClickable(patientHealthCardEditCheckbox));
		healthCardEdit.click();

	}

	// Bucketpage
	public void createSetupBucketFullFolderAccessProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModulesLabel = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModulesLabel.click();
		sleep(2000);

	}

	public void verifyFolderModificationRestricted() {
		sleep(2000);
		clickWhenClickable(homeButton);
		sleep(2000);
		assertElementNotPresent(addFolderButton);
		sleep(2000);
		assertElementNotPresent(editFolderButton);
		sleep(2000);
		assertElementNotPresent(deleteFolderButton);
	}

	private void assertElementNotPresent(By locator) {
		if (driver.findElements(locator).size() > 0) {
			throw new AssertionError("Element should NOT be present: " + locator.toString());
		}
	}

	public void downloadFile() {
		sleep(2000);
		clickWhenClickable(downloadFileIcon);
		sleep(2000);
		clickWhenClickable(closeFileViewerButton);
	}

	public void deleteFile() {
		sleep(2000);
		clickWhenClickable(deleteFileButton);
		sleep(2000);
		clickWhenClickable(deleteFileConfirmButton);
	}

	public void editExistingFile() {
		sleep(2000);
		clickWhenClickable(editFileButton);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(fileNameInput))
				.sendKeys(Hooks.prop.getProperty("file.name.value"));
		sleep(2000);
		clickWhenClickable(saveFileButton);
	}

	private WebElement waitForElement(By locator) {
		return new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void addNewFileToFolder() {
		sleep(2000);
		clickWhenClickable(folderRow);
		sleep(2000);
		clickWhenClickable(addFileIcon);
		sleep(2000);
		WebElement uploadElement = waitForElement(fileUploadInput);
		uploadElement.sendKeys(System.getProperty("user.dir") + "/src/test/resources/Documents/blank.pdf");
		sleep(2000);
		clickWhenClickable(saveFileButton);
	}

	public void verifyProfileCreationWithBucketFileAccess() {
		sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModules.click();
		WebElement bucketAll = wait.until(ExpectedConditions.elementToBeClickable(patientBucketAllCheckbox));
		bucketAll.click();
		WebElement bucketView = wait.until(ExpectedConditions.elementToBeClickable(patientBucketViewCheckbox));
		bucketView.click();
		WebElement bucketAdd = wait.until(ExpectedConditions.elementToBeClickable(patientBucketFolderAddCheckbox));
		bucketAdd.click();
		WebElement bucketEdit = wait.until(ExpectedConditions.elementToBeClickable(patientBucketFolderEditCheckbox));
		bucketEdit.click();
		WebElement bucketDelete = wait
				.until(ExpectedConditions.elementToBeClickable(patientBucketFolderDeleteCheckbox));
		bucketDelete.click();
		WebElement bucketDownload = wait
				.until(ExpectedConditions.elementToBeClickable(patientBucketFileDownloadCheckbox));
		bucketDownload.click();
	}

	public void deleteFolder() {
		sleep(2000);
		clickWhenClickable(deleteFolderButton);
		sleep(2000);
		clickWhenClickable(bucketDeleteConfirmButton);
	}

	public void editExistingFolder() {
		sleep(2000);
		clickWhenClickable(editFolderButton);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(folderNameInput))
				.sendKeys(Hooks.prop.getProperty("folder.name.value"));
		sleep(2000);
		selectDropdownByIndexWhenReady(folderTypeDropdown, 2);
		sleep(2000);
		clickWhenClickable(saveButton);
	}

	public void addNewFolder() {
		sleep(2000);
		clickWhenClickable(newFolderButton);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(folderNameInput))
				.sendKeys(Hooks.prop.getProperty("folder.name.value"));
		sleep(2000);
		selectDropdownByIndexWhenReady(folderTypeDropdown, 1);
		sleep(2000);
		clickWhenClickable(saveButton);
	}

	public void viewBuckets() {
		sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(firstGridLinkButton)).click();
		sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(documentLibraryButton)).click();
		sleep(1000);
	}

	// Enrollmentspage
	public void createEnrollmentProfileWithViewAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModulesLabel = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModulesLabel.click();
		sleep(2000);
		WebElement patientEnrollmentAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientEnrollmentAllCheckbox));
		patientEnrollmentAllLabel.click();
		sleep(2000);
		WebElement patientEnrollmentViewLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientEnrollmentViewCheckbox));
		patientEnrollmentViewLabel.click();
		sleep(2000);

	}

	public void editExistingEnrollment(String enrollmentName) {
		sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(enrollmentActionMenuButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(editEnrollmentOption)).click();
		sleep(3000);
		enterEnrollmentName(enrollmentName);
		clickSaveEnrollmentButton();
	}

	public void clickNewEnrollmentButton() {
		sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(newEnrollmentButton)).click();
	}

	public void enterEnrollmentName(String name) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(enrollmentNameInput)).clear();
		driver.findElement(enrollmentNameInput).sendKeys(name);
	}

	public void clickSaveEnrollmentButton() {
		wait.until(ExpectedConditions.elementToBeClickable(enrollmentSaveButton)).click();
	}

	public void addNewEnrollment(String enrollmentName) {
		clickNewEnrollmentButton();
		enterEnrollmentName(enrollmentName);
		clickSaveEnrollmentButton();
	}

	public void deleteEnrollment() {
		sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(enrollmentActionMenuButton)).click();
		sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(deleteEnrollmentOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteEnrollmentButton)).click();
	}

	public void createSetupEnrollmentViewAddProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModulesLabel = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModulesLabel.click();
		sleep(2000);
		WebElement patientEnrollmentAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientEnrollmentAllCheckbox));
		patientEnrollmentAllLabel.click();
		sleep(2000);
		WebElement patientEnrollmentViewLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientEnrollmentViewCheckbox));
		patientEnrollmentViewLabel.click();
		sleep(2000);
		WebElement patientEnrollmentAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientEnrollmentAddCheckbox));
		patientEnrollmentAddLabel.click();
		sleep(2000);

	}

	public void createSetupEnrollmentViewAddEditProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModulesLabel = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModulesLabel.click();
		sleep(2000);
		WebElement patientEnrollmentAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientEnrollmentAllCheckbox));
		patientEnrollmentAllLabel.click();
		sleep(2000);
		WebElement patientEnrollmentViewLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientEnrollmentViewCheckbox));
		patientEnrollmentViewLabel.click();
		sleep(2000);
		WebElement patientEnrollmentAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientEnrollmentAddCheckbox));
		patientEnrollmentAddLabel.click();
		sleep(2000);
		WebElement patientEnrollmentEditLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientEnrollmentEditCheckbox));
		patientEnrollmentEditLabel.click();
		sleep(2000);

	}

	public void createSetupEnrollmentFullAccessProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModulesLabel = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModulesLabel.click();

	}

	public void verifyUserCannotManageEnrollments() {
		sleep(4000);
		if (!driver.findElements(addReferralSourceButton).isEmpty()) {
			throw new AssertionError("New Tag button should NOT be present");
		}
		clickWhenClickable(enrollmentActionMenuButton);
		if (!driver.findElements(editTagOption).isEmpty()) {
			throw new AssertionError("Edit option should NOT be present");
		}
		if (!driver.findElements(deleteTagOption).isEmpty()) {
			throw new AssertionError("Delete option should NOT be present");
		}
	}

	public void restrictEnrollmentEditDelete() {
		sleep(4000);
		clickWhenClickable(enrollmentActionMenuButton);
		if (!driver.findElements(editTagOption).isEmpty()) {
			throw new AssertionError("Edit option should NOT be present");
		}
		if (!driver.findElements(deleteTagOption).isEmpty()) {
			throw new AssertionError("Delete option should NOT be present");
		}
	}

	public void restrictEnrollmentDelete() {
		sleep(4000);
		clickWhenClickable(enrollmentActionMenuButton);

		if (!driver.findElements(deleteTagOption).isEmpty()) {
			throw new AssertionError("Delete option should NOT be present");
		}
	}

	// ReferralSourcepage
	public void restrictReferralSourceDelete() {
		clickWhenClickable(referralSourceFirstRowActionMenu);
		if (!driver.findElements(deleteReferralSourceOption).isEmpty()) {
			throw new AssertionError("Delete option should NOT be present");
		}
	}

	public void verifyEditDeleteReferralSourceRestricted() {
		clickWhenClickable(referralSourceFirstRowActionMenu);
		if (!driver.findElements(editReferralSourceOption).isEmpty()) {
			throw new AssertionError("Edit option should NOT be present");
		}
		if (!driver.findElements(deleteReferralSourceOption).isEmpty()) {
			throw new AssertionError("Delete option should NOT be present");
		}
	}

	public void clickNewReferralSourceButton() {
		sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(newReferralSourceButton)).click();
	}

	public void enterReferralSourceName(String name) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(referralSourceNameInput)).clear();
		driver.findElement(referralSourceNameInput).sendKeys(name);
	}

	public void enterReferralSourceDescription(String description) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(referralSourceDescriptionInput)).clear();
		driver.findElement(referralSourceDescriptionInput).sendKeys(description);
	}

	public void clickSaveReferralSourceButton() {
		wait.until(ExpectedConditions.elementToBeClickable(referralSourceSaveButton)).click();
	}

	public void addNewReferralSource() {
		clickNewReferralSourceButton();
		enterReferralSourceName("Test Referral Source");
		enterReferralSourceDescription("Referral source created for automation testing");
		clickSaveReferralSourceButton();
	}

	public void openFirstReferralSourceActionMenu() {
		wait.until(ExpectedConditions.elementToBeClickable(referralSourceFirstRowActionMenu)).click();
	}

	public void editReferralSource() {
		openFirstReferralSourceActionMenu();
		wait.until(ExpectedConditions.elementToBeClickable(editReferralSourceOption)).click();
		sleep(5000);
		enterReferralSourceName("Test Referral Source");
		enterReferralSourceDescription("Referral source created for automation testing");
		clickSaveReferralSourceButton();
	}

	public void deleteReferralSource() {
		openFirstReferralSourceActionMenu();
		wait.until(ExpectedConditions.elementToBeClickable(deleteReferralSourceOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteReferralSourceButton)).click();
	}

	public void shouldRestrictUserFromAddEditDeleteReferralSources() {
		if (!driver.findElements(addReferralSourceButton).isEmpty()) {
			throw new AssertionError("New Tag button should NOT be present");
		}
		clickWhenClickable(actionMenuForReferralSource);

		if (!driver.findElements(editTagOption).isEmpty()) {
			throw new AssertionError("Edit option should NOT be present");
		}
		if (!driver.findElements(deleteTagOption).isEmpty()) {
			throw new AssertionError("Delete option should NOT be present");
		}
	}

	// ReviewCategoriespage
	public void clickDeleteReviewCategoryButton() {
		sleep(5000);
		clickWhenClickable(reviewCategoryActionMenuButton);
		wait.until(ExpectedConditions.elementToBeClickable(deleteReviewCategoryButton)).click();
	}

	public void clickConfirmDeleteButton() {
		sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButtontag)).click();
	}

	public void deleteReviewCategory() {
		clickDeleteReviewCategoryButton();
		clickConfirmDeleteButton();
	}

	public void shouldRestrictUserFromEditingOrDeletingReviewCategories() {
		sleep(5000);
		clickWhenClickable(reviewCategoryActionMenuButton);
		sleep(1000);
		if (!driver.findElements(editTagOption).isEmpty()) {
			throw new AssertionError("Edit option should NOT be present");
		}
		if (!driver.findElements(deleteTagOption).isEmpty()) {
			throw new AssertionError("Delete option should NOT be present");
		}

	}

	public void restrictReviewCategoryDelete() {
		sleep(5000);
		clickWhenClickable(reviewCategoryActionMenuButton);
		sleep(1000);
		if (!driver.findElements(deleteTagOption).isEmpty()) {
			throw new AssertionError("Delete option should NOT be present");
		}

	}

	public void addNewReviewCategory(String categoryName, String categoryDescription) {
		clickNewReviewCategoryButton();
		enterReviewCategoryName(categoryName);
		enterReviewCategoryDescription(categoryDescription);
		clickSaveReviewCategoryButton();
	}

	public void editReviewCategory(String categoryName, String categoryDescription) {
		sleep(3000);
		clickWhenClickable(reviewCategoryActionMenuButton);
		sleep(1000);
		clickWhenClickable(editTagOption);
		sleep(3000);
		enterReviewCategoryName(categoryName);
		enterReviewCategoryDescription(categoryDescription);
		clickSaveReviewCategoryButton();
	}

	public void clickNewReviewCategoryButton() {
		sleep(1000);
		waitForLoaderIfPresent();
		wait.until(ExpectedConditions.elementToBeClickable(newReviewCategoryButton)).click();
	}

	public void enterReviewCategoryName(String name) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(reviewCategoryNameInput)).clear();
		driver.findElement(reviewCategoryNameInput).sendKeys(name);
	}

	public void enterReviewCategoryDescription(String description) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(reviewCategoryDescriptionInput)).clear();
		driver.findElement(reviewCategoryDescriptionInput).sendKeys(description);
	}

	public void clickSaveReviewCategoryButton() {
		wait.until(ExpectedConditions.elementToBeClickable(addReviewCategorySaveButton)).click();
	}

	// TagPage
	public void deleteTag() {
		sleep(3000);
		clickWhenClickable(firstTagActionMenu);
		sleep(1000);
		WebElement deleteTagButton = wait.until(ExpectedConditions.elementToBeClickable(deleteTagOption));
		deleteTagButton.click();
		sleep(1000);
		WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButtontag));
		confirmDeleteButton.click();

	}

	public void clickNewTagButton() {
		waitForLoaderIfPresent();
		wait.until(ExpectedConditions.elementToBeClickable(btnNewTag)).click();
	}

	public void enterTagName(String tagName) {
		waitForLoaderIfPresent();
		wait.until(ExpectedConditions.visibilityOfElementLocated(txtTagName)).sendKeys(tagName);
	}

	public void enterTagDescription(String description) {
		waitForLoaderIfPresent();
		wait.until(ExpectedConditions.visibilityOfElementLocated(txtTagDescription)).sendKeys(description);
	}

	public void createNewTag(String tagName) {
		clickNewTagButton();
		enterTagName(tagName);
		enterTagDescription(tagName);
		clickOnSaveTagButton();
		sleep(5000);
		clickWhenClickable(firstTagActionMenu);

	}

	public void editTag(String updatedTagName) {
		WebElement editTagButton = wait.until(ExpectedConditions.elementToBeClickable(editTagOption));
		editTagButton.click();
		sleep(3000);
		enterTagName(updatedTagName);
		clickOnSaveTagButton();
	}

	public void verifyAddEditDeleteRestricted() {
		if (!driver.findElements(addReviewCategoryButton).isEmpty()) {
			throw new AssertionError("New Tag button should NOT be present");
		}
		clickWhenClickable(reviewCategoryActionMenuButton);
		if (!driver.findElements(editTagOption).isEmpty()) {
			throw new AssertionError("Edit option should NOT be present");
		}
		if (!driver.findElements(deleteTagOption).isEmpty()) {
			throw new AssertionError("Delete option should NOT be present");
		}
	}

	public void thenUserCannotEditOrDeleteTags() {
		clickWhenClickable(firstTagActionMenu);
		if (!driver.findElements(editTagOption).isEmpty()) {
			throw new AssertionError("Edit option should NOT be present");
		}
		if (!driver.findElements(deleteTagOption).isEmpty()) {
			throw new AssertionError("Delete option should NOT be present");
		}
	}

	public void thenUserCannotDeleteTags() {
		sleep(3000);
		clickWhenClickable(firstTagActionMenu);
		if (!driver.findElements(deleteTagOption).isEmpty()) {
			throw new AssertionError("Delete option should NOT be present");
		}
	}

	// DeDupePage
	public void verifyUserCannotUpdateDeDupeRecords() {
		List<WebElement> errorHeaders = driver.findElements(errorHeader);
		Assert.assertFalse(errorHeaders.isEmpty(), "User is able to access DeDupe page without update permission");
		System.out.println("Access denied: User does not have permission to update DeDupe records");
	}

	public void verifyDeDupeAccessRestrictedViaUIOrDirectURL() {
		verifyUserCannotUpdateDeDupeRecords();
	}

	public void updateDeDupeRecords() {
		clickLastName();
		clickFirstName();
		clickFindDuplicate();
		selectFirstRecord();
		selectSecondRecord();
		sortByColumn8();
		selectFirstCheckboxOnNextPage();
		clickNext();
		clickNext();
		clickFinish();
	}

	public void clickLastName() {
		waitForLoaderIfPresent();
		wait.until(ExpectedConditions.elementToBeClickable(lastNameLabel)).click();
	}

	public void clickFirstName() {
		waitForLoaderIfPresent();
		wait.until(ExpectedConditions.elementToBeClickable(firstNameLabel)).click();
	}

	public void clickFindDuplicate() {
		waitForLoaderIfPresent();
		wait.until(ExpectedConditions.elementToBeClickable(findDuplicateButton)).click();
	}

	public void selectFirstRecord() {
		waitForLoaderIfPresent();
		wait.until(ExpectedConditions.elementToBeClickable(firstRecordCheckbox)).click();
	}

	public void selectSecondRecord() {
		waitForLoaderIfPresent();
		wait.until(ExpectedConditions.elementToBeClickable(secondRecordCheckbox)).click();
	}

	public void sortByColumn8() {
		waitForLoaderIfPresent();
		wait.until(ExpectedConditions.elementToBeClickable(tableSortColumn8)).click();
	}

	public void selectFirstCheckboxOnNextPage() {
		waitForLoaderIfPresent();
		wait.until(ExpectedConditions.elementToBeClickable(firstCheckboxOnNextPage)).click();
	}

	public void clickNext() {
		waitForLoaderIfPresent();
		wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();
	}

	public void clickFinish() {
		waitForLoaderIfPresent();
		wait.until(ExpectedConditions.elementToBeClickable(finishButton)).click();
	}

	// PatientPage
	public void openFirstPatientRecord() {
		wait.until(ExpectedConditions.elementToBeClickable(firstPatientViewButton)).click();
	}

	public boolean isSendForReviewIconPresent() {
		return driver.findElements(sendForReviewIcon).size() > 0;
	}

	public void resetPatientPassword(String password) {
		sleep(3000);
		clickWhenClickable(actionButton);
		clickWhenClickable(resetPasswordOption);
		waitAndSendKeys(newPasswordField, password);
		waitAndSendKeys(confirmPasswordField, password);
		clickWhenClickable(resetButton);
	}

	public void deleteRPMDevice() {
		sleep(3000);
		clickWhenClickable(actionButton);
		clickWhenClickable(deleteOption);
		sleep(1000);
		clickWhenClickable(confirmDeleteButton);
	}

	public void editRPMDevice() {
		sleep(3000);
		clickWhenClickable(actionButton);
		sleep(1000);
		clickWhenClickable(editOption);
		sleep(1000);
		clickWhenClickable(activeCheckbox);
		clickWhenClickable(saveButton);
	}

	public void addRPMDevice() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPatientLink)).click();
		sleep(3000);
		clickWhenClickable(deviceDropdown);
		selectDropdownByIndexWhenReady(deviceDropdown, 1);
		clickWhenClickable(addDeviceButton);
	}

	public void exportPatientDataToExcel() {
		sleep(3000);
		clickWhenClickable(exportToExcelButton);
	}

	public void makeOutgoingCall() {
		sleep(3000);
		clickWhenClickable(outgoingCallButton);
		sleep(2000);
		clickWhenClickable(closeDialerButton);
	}

	public void setDeliveryPreferences(int primaryIndex, int secondaryIndex) {
		sleep(3000);
		clickWhenClickable(primaryDropdown);
		selectDropdownByIndexWhenReady(primaryDropdown, primaryIndex);

		clickWhenClickable(secondaryDropdown);
		selectDropdownByIndexWhenReady(secondaryDropdown, secondaryIndex);

		clickWhenClickable(addButton);
	}

	public void updateStatusByIndex(int index) {
		sleep(2000);
		clickWhenClickable(statusDropdown);
		selectDropdownByIndexWhenReady(statusDropdown, index);
		clickWhenClickable(updateButton);
	}

	public void togglePatientStatus() {
		sleep(3000);
		updateStatusByIndex(0);
		sleep(2000);
		updateStatusByIndex(1);
	}

	public void deleteFirstEnrollment() {
		sleep(3000);
		clickWhenClickable(firstEnrollmentActionButton);
		clickWhenClickable(deleteEnrollmentButton);
	}

	public void selectFirstPatient() {
		clickWhenClickable(firstPatientLink);
	}

	public void addFirstEnrollment() {
		clickWhenClickable(enrollmentInput);
		WebElement option = driver.findElement(firstEnrollmentOption);
		option.click();
		clickWhenClickable(addEnrollmentButton);
	}

	public void addPatientEnrollment() {
		sleep(3000);
		selectFirstPatient();
		sleep(3000);
		addFirstEnrollment();
		sleep(3000);
	}

	public void deleteFirstReferralSource() {
		sleep(2000);
		clickWhenClickable(firstRowActionButton);
		clickWhenClickable(deleteOption);
		clickWhenClickable(confirmDeleteReferralSourceButton);
	}

	public void clickReferralInput() {
		clickWhenClickable(referralInput);
	}

	public void selectFirstReferralOption() {
		WebElement option = driver.findElement(firstReferralOption);
		option.click();
	}

	public void clickAddButton() {
		clickWhenClickable(addButton);
	}

	public void addReferralSource() {
		sleep(2000);
		clickReferralInput();
		sleep(2000);
		selectFirstReferralOption();
		clickAddButton();
		sleep(3000);
	}

	public void verifyDeletedReferralEntry(String patientId) {
		sleep(2000);
		clickWhenClickable(filterButton);
		waitAndSendKeys(patientIdInput, patientId);
		clickWhenClickable(searchIcon);
		clickWhenClickable(firstPatientLink);
		clickWhenClickable(referralsTab);
		Assert.assertFalse(isElementPresent(referralStatus), "Deleted referral entry is still displayed");
	}

	public void deleteReffral() {
		sleep(2000);
		clickWhenClickable(moreOptionsIcon);
		clickWhenClickable(deleteOption);
		clickWhenClickable(confirmDeleteButton);
	}

	public void generateReferral(String patientId, String providerLastName) {
		sleep(2000);
		clickWhenClickable(addPatientIcon);
		waitAndSendKeys(patientIdInput, patientId);
		clickWhenClickable(searchButton);
		clickWhenClickable(selectPatientRadio);
		clickWhenClickable(selectPatientBtn);
		selectDropdownByIndexWhenReady(referralEntityType, 1);
		clickWhenClickable(addProviderIcon);
		clickWhenClickable(fullSearchRadio);
		waitAndSendKeys(providerLastNameInput, providerLastName);
		clickWhenClickable(searchButton);
		clickWhenClickable(selectProviderRadio);
		clickWhenClickable(selectProviderBtn);
		selectDropdownByIndexWhenReady(referralType, 1);
		selectDropdownByIndexWhenReady(referralCategory, 1);
		selectDropdownByIndexWhenReady(priority, 1);
		clickWhenClickable(saveButton);
	}

	public void filterPatientById(String patientId) {
		clickWhenClickable(filterButton);
		waitAndSendKeys(patientIdInput, patientId);
		clickWhenClickable(searchIcon);
	}

	public void openReferralsTab() {
		clickWhenClickable(referralsTab);
	}

	public boolean isReferralDisplayed() {
		return isElementPresent(newAssignmentText);
	}

	public void verifyReferralInPatient(String patientId) {
		sleep(2000);
		filterPatientById(patientId);
		openFirstPatientRecord();
		openReferralsTab();
		Assert.assertTrue(isReferralDisplayed(), "Referral not found in patient record");
	}

	public boolean isElementPresent(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public void clickWhenClickable(By locator) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

		try {
			element.click();
		} catch (ElementNotInteractableException e) {
			System.out.println("Normal click failed for: " + locator + " → trying JS click");
			jsClick(element);
		}
	}

	private void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public void viewPatientPrescriptions() {
		sleep(2000);
		wait.until(ExpectedConditions.presenceOfElementLocated(prescriptionIcon));
		wait.until(ExpectedConditions.elementToBeClickable(prescriptionIcon)).click();
		System.out.println("Patient prescriptions page opened");
	}

	public void deleteMappedTag() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(firstMappedTagDropdown)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteMappedTagButton)).click();
		System.out.println("Mapped tag deleted successfully");
	}

	public void mapTagToPatient() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPatientLink)).click();
		wait.until(ExpectedConditions.elementToBeClickable(tagInputField)).click();
		WebElement option = wait.until(ExpectedConditions.elementToBeClickable(firstTagOption));
		option.click();
		wait.until(ExpectedConditions.elementToBeClickable(patientTagButton)).click();
		System.out.println("Patient tag mapped successfully");
	}

	public void printPatientSignature() {
		waitForLoaderIfPresent();
		wait.until(ExpectedConditions.elementToBeClickable(patientSignaturesTab)).click();
		waitForLoaderIfPresent();
		wait.until(ExpectedConditions.elementToBeClickable(sixthPatientSignatureLink)).click();
		((JavascriptExecutor) driver).executeScript("window.print();");
	}

	public void sendPatientForSignature() {
		sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(patientSignatureButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(emailOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(mailTemplateDropdown));
		selectDropdownByIndexWhenReady(mailTemplateDropdown, 1);
		sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(editorTextArea))
				.sendKeys(Hooks.prop.getProperty("editor.text.value"));
		wait.until(ExpectedConditions.elementToBeClickable(signatureCheckbox)).click();
		wait.until(ExpectedConditions.elementToBeClickable(savePatientSignatureButton)).click();
		sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(patientSignatureButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(textOption)).click();
		sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(smsTemplateDropdown));
		selectDropdownByIndexWhenReady(smsTemplateDropdown, 1);
		sleep(5000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(signatureCheckbox)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(savePatientSignatureButton)).click();
		sleep(2000);
	}

	private void waitAndSendKeys(By locator, String value) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		element.clear();
		element.sendKeys(value);
	}

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

	public void sendPatientForReview() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPatientLink)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(sendForReviewIcon)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(tagsLabel)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(saveSendForReviewButton)).click();
		System.out.println("Patient user has sent the patient for review");
	}

	public void verifyPatientReviewRestricted() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPatientLink)).click();
		sleep(2000);
		boolean isSendForReviewPresent = driver.findElements(sendForReviewIcon).size() > 0;
		Assert.assertFalse(isSendForReviewPresent, "Send for Review option should NOT be visible for restricted user");
	}

	public void verifyPatientSignatureRestricted() {
		sleep(2000);
		boolean isPatientSignatureRestricted = driver.findElements(patientSignatureButton).size() > 0;
		Assert.assertFalse(isPatientSignatureRestricted,
				"Patient Signature option should NOT be visible for restricted user");
	}

	public void verifyMappedTagDeletionRestricted() {
		sleep(2000);
		boolean isMappedTagDeletionRestricted = driver.findElements(firstMappedTagDropdown).size() > 0;
		Assert.assertFalse(isMappedTagDeletionRestricted,
				"Mapped Tag deletion option should NOT be visible for restricted user");
	}

	public void verifyPatientPrescriptionViewRestricted() {
		sleep(2000);
		boolean isPatientPrescriptionViewRestricted = driver.findElements(prescriptionIcon).size() > 0;
		Assert.assertFalse(isPatientPrescriptionViewRestricted,
				"Patient Prescription view option should NOT be visible for restricted user");
	}

	public void verifyReferralSourceAddRestricted() {
		sleep(2000);
		boolean isReferralSourceAddRestricted = driver.findElements(addReferralSourceIcon).size() > 0;
		Assert.assertFalse(isReferralSourceAddRestricted,
				"Referral Source add option should NOT be visible for restricted user");
	}

	public void verifyReferralSourceDeletionRestricted() {
		sleep(2000);
		boolean isReferralSourceDeletionRestricted = driver.findElements(deleteReferralSourceIcon).size() > 0;
		Assert.assertFalse(isReferralSourceDeletionRestricted,
				"Referral Source deletion option should NOT be visible for restricted user");
	}

	public void verifyPatientEnrollmentAddRestricted() {
		sleep(2000);
		boolean isPatientEnrollmentAddRestricted = driver.findElements(addPatientEnrollmentIcon).size() > 0;
		Assert.assertFalse(isPatientEnrollmentAddRestricted,
				"Patient Enrollment add option should NOT be visible for restricted user");
	}

	public void verifyPatientEnrollmentDeletionRestricted() {
		sleep(2000);
		boolean isPatientEnrollmentDeletionRestricted = driver.findElements(deletePatientEnrollmentIcon).size() > 0;
		Assert.assertFalse(isPatientEnrollmentDeletionRestricted,
				"Patient Enrollment deletion option should NOT be visible for restricted user");
	}

	public void verifyPatientStatusUpdateRestricted() {
		sleep(2000);
		boolean isPatientStatusUpdateRestricted = driver.findElements(updatePatientStatusIcon).size() > 0;
		Assert.assertFalse(isPatientStatusUpdateRestricted,
				"Patient Status update option should NOT be visible for restricted user");
	}

	public void verifyDeliveryPreferenceSetRestricted() {
		sleep(2000);
		boolean isDeliveryPreferenceSetRestricted = driver.findElements(addDeliveryPreferenceButton).size() > 0;
		Assert.assertFalse(isDeliveryPreferenceSetRestricted,
				"Delivery Preference set option should NOT be visible for restricted user");
	}

	public void verifyOutgoingCallRestricted() {
		sleep(2000);
		boolean isOutgoingCallRestricted = driver.findElements(outgoingCallButtonIcon).size() > 0;
		Assert.assertFalse(isOutgoingCallRestricted, "Outgoing Call option should NOT be visible for restricted user");
	}

	public void verifyPatientDataExportRestricted() {
		sleep(2000);
		boolean isPatientDataExportRestricted = driver.findElements(exportPatientDataToExcelButton).size() > 0;
		Assert.assertFalse(isPatientDataExportRestricted,
				"Patient Data export option should NOT be visible for restricted user");
	}

	public void verifyRPMDeviceAddRestricted() {
		sleep(2000);
		boolean isRPMDeviceAddRestricted = driver.findElements(addRPMDeviceIcon).size() > 0;
		Assert.assertFalse(isRPMDeviceAddRestricted, "RPM Device add option should NOT be visible for restricted user");
	}

	public void verifyRPMDeviceDeletionRestricted() {
		sleep(2000);
		boolean isRPMDeviceDeletionRestricted = driver.findElements(deleteRPMDeviceIcon).size() > 0
				|| driver.findElements(deleteRPMDeviceText).size() > 0;

		Assert.assertFalse(isRPMDeviceDeletionRestricted,
				"RPM Device deletion option should NOT be visible for restricted user");
	}

	public void verifyPatientPasswordResetRestricted() {
		sleep(2000);
		boolean isPatientPasswordResetRestricted = driver.findElements(resetPatientPasswordButton).size() > 0
				|| driver.findElements(resetPatientPasswordText).size() > 0;
		Assert.assertFalse(isPatientPasswordResetRestricted,
				"Patient Password reset option should NOT be visible for restricted user");
	}

	public void verifyRPMDeviceEditRestricted() {
		sleep(2000);
		boolean isRPMDeviceEditRestricted = (driver.findElements(editRPMDeviceIcon).stream()
				.anyMatch(WebElement::isDisplayed))
				|| (driver.findElements(editRPMDeviceText).stream().anyMatch(WebElement::isDisplayed));
		Assert.assertFalse(isRPMDeviceEditRestricted,
				"RPM Device edit option should NOT be visible for restricted user");
	}

	public void verifyTagMappingRestricted() {
		sleep(2000);
		boolean isTagMappingRestricted = driver.findElements(tagInputField).size() > 0;
		Assert.assertFalse(isTagMappingRestricted, "Tag Mapping option should NOT be visible for restricted user");
	}

	public void verifyPatientSignaturePrintRestricted() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(patientSignaturesTab)).click();
		sleep(2000);
		boolean isPatientSignaturePrintRestricted = driver.findElements(sixthPatientSignatureLink).size() > 0;
		Assert.assertFalse(isPatientSignaturePrintRestricted,
				"Patient Signature Print option should NOT be visible for restricted user");
	}

	public void deletePatient() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(deletePatientButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteConfirmButton)).click();
	}

	public void enterPatientPrivateNotes(String notes) {
		sleep(2000);
		WebElement notesField = wait.until(ExpectedConditions.visibilityOfElementLocated(privateNotesTextArea));
		notesField.clear();
		notesField.sendKeys(Hooks.prop.getProperty("private.notes.value"));
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

	}

	public void clickPatientRowActionButton() {
		sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(rowActionButton)).click();
		sleep(2000);

	}

	public void clickPatientEditButton() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(editPatientOption)).click();
	}

	public boolean isEditOptionVisible() {
		return !driver.findElements(editPatientButton).isEmpty();
	}

	public boolean isDeleteOptionVisible() {
		return !driver.findElements(deletePatientButton).isEmpty();
	}

	public void addNewPatient(String lastName, String firstName, String birthDate, String phoneNumber) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameField)).sendKeys(lastName);
		driver.findElement(firstNameField).sendKeys(firstName);
		driver.findElement(birthDateField).sendKeys(birthDate);
		wait.until(ExpectedConditions.elementToBeClickable(addNewPatientButton)).click();
		sleep(4000);
		driver.findElement(phoneNumberField).sendKeys(phoneNumber);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
		sleep(2000);
	}

	public void clickNewPatientButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(newPatientButton)).click();
	}

	public void verifyViewOnlyUserCannotAddEditDeletePatients() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		Assert.assertTrue(driver.findElements(newPatientButton).isEmpty(), "New Patient button should NOT be visible");
		List<WebElement> actionMenus = driver.findElements(patientActionMenuIcon);
		if (!actionMenus.isEmpty() && actionMenus.get(0).isDisplayed()) {
			actionMenus.get(0).click();
		}
		Assert.assertTrue(driver.findElements(editPatientOption).isEmpty(), "Edit option should NOT be visible");
		Assert.assertTrue(driver.findElements(deletePatientOption).isEmpty(), "Delete option should NOT be visible");
	}

	public boolean isOnAddTagForm() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(saveTagButton));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public boolean isTagNameRequiredValidationDisplayed() {
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(validationToastMessage));

			return toast.getText().toLowerCase().contains("tag");
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnSaveTagButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement saveBtn = wait.until(ExpectedConditions.elementToBeClickable(saveTagButton));
		saveBtn.click();
	}

	public void clickOnAddTagButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement tagBtn = wait.until(ExpectedConditions.elementToBeClickable(addTagButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tagBtn);
		tagBtn.click();
	}

	public boolean isEmailRequiredValidationDisplayed() {
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(validationToastMessage));
			return toast.getText().toLowerCase().contains("email");
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnPatientActionMenuForBlankEmail() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement menuBtn = wait.until(ExpectedConditions.elementToBeClickable(patientActionMenuButtonBlankEmail));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menuBtn);
		menuBtn.click();
	}

	public void clickOnEnableLoginOption() {
		WebElement enableLoginBtn = wait.until(ExpectedConditions.elementToBeClickable(enableLoginOption));
		enableLoginBtn.click();
	}

	public boolean isOnAddToTrialForm() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(nextButton));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnAddToTrialOption() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement addToTrialBtn = wait.until(ExpectedConditions.elementToBeClickable(addToTrialOption));
		addToTrialBtn.click();
	}

	public boolean isPatientDetailsNotUpdatedAndListUnchanged(String originalValue) {
		try {
			boolean isPatientListVisible = wait.until(ExpectedConditions.visibilityOfElementLocated(patientListTable))
					.isDisplayed();
			clickOnPatientActionMenu();
			clickOnEditPatientOption();
			WebElement kinLastName = wait.until(ExpectedConditions.visibilityOfElementLocated(nextOfKinLastNameInput));
			boolean isValueUnchanged = kinLastName.getAttribute("value").equals(originalValue);
			return isPatientListVisible && isValueUnchanged;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnEditPatientCancelButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement cancelBtn = wait.until(ExpectedConditions.elementToBeClickable(editPatientCancelButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cancelBtn);
		cancelBtn.click();
	}

	public void updateNextOfKinLastName(String lastName) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement kinLastName = wait.until(ExpectedConditions.visibilityOfElementLocated(nextOfKinLastNameInput));
		kinLastName.clear();
		kinLastName.sendKeys(lastName);
	}

	public void clickOnEditPatientOption() {
		WebElement editBtn = wait.until(ExpectedConditions.elementToBeClickable(editPatientOption));
		editBtn.click();
	}

	public boolean isFilterClearedAndPatientListVisible() {
		try {
			WebElement filterInput = wait.until(ExpectedConditions.visibilityOfElementLocated(filterLastNameInput));
			boolean isFilterCleared = filterInput.getAttribute("value").isEmpty();
			boolean isPatientListVisible = wait.until(ExpectedConditions.visibilityOfElementLocated(patientListTable))
					.isDisplayed();
			return isFilterCleared && isPatientListVisible;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnFilterCancelButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement cancelBtn = wait.until(ExpectedConditions.elementToBeClickable(filterCancelButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cancelBtn);
		cancelBtn.click();
	}

	public void enterFilterLastName(String lastName) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement lastNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(filterLastNameInput));
		lastNameInput.clear();
		lastNameInput.sendKeys(lastName);
	}

	public void clickOnFilterButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement filterBtn = wait.until(ExpectedConditions.elementToBeClickable(filterButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", filterBtn);
		filterBtn.click();
	}

	public boolean isOnAddNewPatientForm() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(addNewPatientButton));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnAddNewPatientButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement addNewBtn = wait.until(ExpectedConditions.elementToBeClickable(addNewPatientButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addNewBtn);
		addNewBtn.click();
	}

	public boolean isOnSelectExistingPatientForm() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectExistingPatientButton));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnSelectExistingPatientButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectBtn = wait.until(ExpectedConditions.elementToBeClickable(selectExistingPatientButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectBtn);
		selectBtn.click();
	}

	public boolean isOnSearchPatientForm() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(searchPatientButton));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnSearchPatientButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(searchPatientButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", searchBtn);
		searchBtn.click();
	}

	public void clickOnNewPatientButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement newPatientBtn = wait.until(ExpectedConditions.elementToBeClickable(newPatientButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", newPatientBtn);
		newPatientBtn.click();
	}

	public boolean isStillOnAddToFollowupForm() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(nextButton));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public boolean isBlankSubmissionErrorDisplayed() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(blankSubmissionErrorToast));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnNextWithoutData() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement nextBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(nextButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextBtn);
	}

	public void clickOnAddToFollowup() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(addToFollowupButton)).click();
	}

	public void clickCancelDeletePatientConfirmation() {
		wait.until(ExpectedConditions.elementToBeClickable(cancelDeletePatientButton)).click();
	}

	public boolean isDeletePatientToastMessageAbsent() {
		try {
			wait.withTimeout(Duration.ofSeconds(5))
					.until(ExpectedConditions.visibilityOfElementLocated(deletePatientToastMessage));
			return false;
		} catch (TimeoutException e) {
			return true;
		}
	}

	public void clickOnPatientActionMenu() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(patientActionMenuButton)).click();
	}

	public void clickOnDeletePatient() {
		wait.until(ExpectedConditions.elementToBeClickable(deletePatientOption)).click();
	}

	public boolean isSendVCardButtonDisplayed() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(sendVCardButton)).isDisplayed();
	}

	public boolean isSendVCardValidationMessageDisplayed() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(vcardValidationToastMessage)).isDisplayed();
	}

	public void clickSendForPatientVCard() {
		wait.until(ExpectedConditions.elementToBeClickable(sendVCardSubmitButton)).click();
	}

	public patientpage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void clickOnSendVCard() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(sendVCardButton)).click();
	}

	public void openPatientsPage(String fullUrl, String expectedUrlFragment) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains(expectedUrlFragment));
	}

	public boolean isOnPatientsPage() {
		return driver.getCurrentUrl().contains("/Patient/Home/Patients");
	}

	public boolean isOnTagsPage() {
		return driver.getCurrentUrl().contains("/Patient/Home/Tags");
	}

	public void clickOnAddQuickText() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(quickTextButton)).click();
	}

	public void leaveAllRequiredFieldsEmptyInPatientQuickText() {

	}

	public void clickSendForPatientQuickText() {
		wait.until(ExpectedConditions.elementToBeClickable(sendButton)).click();
	}

	public boolean isBodyRequiredValidationDisplayed() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(bodyRequiredValidation)).isDisplayed();
	}

	public boolean isPhoneRequiredValidationDisplayed() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(phoneRequiredValidation)).isDisplayed();
	}

	public boolean isSaveButtonDisplayed() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(saveButton)).isDisplayed();
	}

	// TagPage
	public void clickOnEditTagType() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement actionMenu = wait.until(ExpectedConditions.elementToBeClickable(tagActionMenuButton));
		actionMenu.click();
		WebElement editBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(editTagTypeOption));
		editBtn.click();
	}

	public void updateTagTypeDetails(String newTagName) {
		WebElement tagInput = wait.until(ExpectedConditions.visibilityOfElementLocated(tagNameInput));
		tagInput.clear();
		tagInput.sendKeys(newTagName);
	}

	public void clickOnCancelEditTagType() {
		WebElement cancelBtn = wait.until(ExpectedConditions.elementToBeClickable(cancelEditTagTypeButton));
		cancelBtn.click();
	}

	public String getTagTypeNameFromList() {
		WebElement tagName = wait.until(ExpectedConditions.visibilityOfElementLocated(tagTypeNameInList));
		return tagName.getText().trim();
	}

	public void clickOnTagActionMenu() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement actionMenu = wait.until(ExpectedConditions.elementToBeClickable(tagActionMenuButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", actionMenu);
		actionMenu.click();
	}

	public void clickOnDeleteTag() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement deleteBtn = wait.until(ExpectedConditions.elementToBeClickable(deleteTagOption));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", deleteBtn);
		deleteBtn.click();
	}

	public void clickOnCancelDeleteTag() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement cancelBtn = wait.until(ExpectedConditions.elementToBeClickable(cancelDeleteTagButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cancelBtn);
		cancelBtn.click();
	}

	public void waitForLoaderIfPresent() {
		try {
			WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(3));
			shortWait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (TimeoutException e) {
		}
	}

	public String getTagNameFromTagList() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[1]"))).getText()
				.trim();
	}

	// ReviewCategoriesPage
	public boolean isOnReviewCategoriesPage() {
		return driver.getCurrentUrl().contains("/Patient/Home/ReviewCategories");
	}

	public void clickOnAddReviewCategory() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement addBtn = wait.until(ExpectedConditions.elementToBeClickable(addReviewCategoryButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addBtn);
		addBtn.click();
	}

	public void clickOnSaveReviewCategory() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement saveBtn = wait.until(ExpectedConditions.elementToBeClickable(saveReviewCategoryButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", saveBtn);
		saveBtn.click();
	}

	public boolean isAddReviewCategoryFormDisplayed() {
		try {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(addReviewCategoryModal)).isDisplayed();
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnEditReviewCategory() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement actionMenu = wait.until(ExpectedConditions.elementToBeClickable(reviewCategoryActionMenuButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", actionMenu);
		actionMenu.click();
		WebElement editBtn = wait.until(ExpectedConditions.elementToBeClickable(editReviewCategoryOption));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", editBtn);
		editBtn.click();
	}

	public void updateReviewCategoryDetails(String updatedName) {
		WebElement nameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(reviewCategoryNameInput));
		nameInput.clear();
		nameInput.sendKeys(updatedName);
	}

	public void clickOnCancelEditReviewCategory() {
		WebElement cancelBtn = wait.until(ExpectedConditions.elementToBeClickable(cancelEditReviewCategoryButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cancelBtn);
		cancelBtn.click();
	}

	public String getReviewCategoryNameFromList() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(reviewCategoryName));
		return driver.findElement(reviewCategoryName).getText().trim();
	}

	public void clickOnReviewCategoryActionMenu() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement actionMenu = wait.until(ExpectedConditions.elementToBeClickable(reviewCategoryActionMenuButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", actionMenu);
		actionMenu.click();
	}

	public void clickOnDeleteReviewCategory() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement deleteBtn = wait.until(ExpectedConditions.elementToBeClickable(deleteReviewCategoryButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", deleteBtn);
		deleteBtn.click();
	}

	public void clickOnCancelDeleteReviewCategory() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement cancelBtn = wait.until(ExpectedConditions.elementToBeClickable(cancelDeleteReviewCategoryButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cancelBtn);
		cancelBtn.click();
	}

// ReferralSourcesPage
	public boolean isOnReferralSourcesPage() {
		return driver.getCurrentUrl().contains("/Patient/Home/ReferralSources");
	}

	public void clickOnAddReferralSource() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement addBtn = wait.until(ExpectedConditions.elementToBeClickable(addReferralSourceButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addBtn);
		addBtn.click();
	}

	public boolean isAddReferralSourceFormDisplayed() {
		try {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(addReferralSourceSaveButton)).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnEditReferralSource() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement actionMenuBtn = wait.until(ExpectedConditions.elementToBeClickable(actionMenuForReferralSource));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", actionMenuBtn);
		actionMenuBtn.click();
		WebElement editBtn = wait.until(ExpectedConditions.elementToBeClickable(editReferralSourceOption));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", editBtn);
		editBtn.click();
	}

	public void updateReferralSourceName(String name) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(referralSourceNameInput));
		input.clear();
		input.sendKeys(name);
	}

	public void clickOnCancelEditReferralSource() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement cancelBtn = wait.until(ExpectedConditions.elementToBeClickable(cancelEditReferralSourceButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cancelBtn);
		cancelBtn.click();
	}

	public String getReferralSourceNameFromList() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement nameElement = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[1]")));
		return nameElement.getText().trim();
	}

	public void clickOnActionMenuForReferralSource() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement actionMenuBtn = wait.until(ExpectedConditions.elementToBeClickable(actionMenuForReferralSource));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", actionMenuBtn);
		actionMenuBtn.click();
	}

	public void clickOnDeleteReferralSource() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement deleteBtn = wait.until(ExpectedConditions.elementToBeClickable(deleteReferralSourceOption));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", deleteBtn);
		deleteBtn.click();
	}

	public void clickOnCancelDeleteReferralSource() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement cancelBtn = wait.until(ExpectedConditions.elementToBeClickable(cancelDeleteReferralSourceButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cancelBtn);
		cancelBtn.click();
	}

	// EnrollmentsPage
	public void openPatientEnrollmentsPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Patient/Home/Enrollments"));
	}

	public void verifyGeneralAuditViewColumns() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.visibilityOfElementLocated(updatedByColumn));
		wait.until(ExpectedConditions.visibilityOfElementLocated(updatedDateColumn));
		Assert.assertTrue(driver.findElement(updatedByColumn).isDisplayed(), "Updated By column is not visible");
		Assert.assertTrue(driver.findElement(updatedDateColumn).isDisplayed(), "Updated Date column is not visible");
	}

	public void verifyGeneralAuditViewColumnsNotVisible() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		boolean updatedByVisible = driver.findElements(updatedByColumn).stream().anyMatch(WebElement::isDisplayed);
		boolean updatedDateVisible = driver.findElements(updatedDateColumn).stream().anyMatch(WebElement::isDisplayed);
		Assert.assertFalse(updatedByVisible, "Updated By column is visible but should NOT be");
		Assert.assertFalse(updatedDateVisible, "Updated Date column is visible but should NOT be");
	}

	public void clickOnAddEnrollmentButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(addEnrollmentButton)).click();
	}

	public boolean isOnAddEnrollmentForm() {
		try {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(addEnrollmentForm)).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnEditEnrollment() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement editBtn = wait.until(ExpectedConditions.elementToBeClickable(editEnrollmentOption));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", editBtn);
		editBtn.click();
	}

	public void updateEnrollmentDetails(String newName) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(enrollmentNameField));
		WebElement nameField = driver.findElement(enrollmentNameField);
		nameField.clear();
		nameField.sendKeys(newName);
	}

	public void clickOnCancelEditEnrollment() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement cancelBtn = wait.until(ExpectedConditions.elementToBeClickable(cancelEditEnrollmentButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cancelBtn);
		cancelBtn.click();
	}

	public String getEnrollmentNameFromList() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(enrollmentNameFromList));
		return driver.findElement(enrollmentNameFromList).getText().trim();
	}

	public void clickOnActionMenuForEnrollment() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement menuBtn = wait.until(ExpectedConditions.elementToBeClickable(enrollmentActionMenuButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menuBtn);
		menuBtn.click();
	}

	public void clickOnEnrollmentActionMenu() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(enrollmentActionMenuButton)).click();
	}

	public void clickOnDeleteEnrollment() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement deleteBtn = wait.until(ExpectedConditions.elementToBeClickable(deleteEnrollmentOption));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", deleteBtn);
		deleteBtn.click();
	}

	public void clickOnCancelDeleteEnrollment() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement cancelBtn = wait.until(ExpectedConditions.elementToBeClickable(cancelDeleteEnrollmentButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cancelBtn);
		cancelBtn.click();
	}

	// DeDupePage
	public boolean isOnDeDupePatientsPage() {
		return driver.getCurrentUrl().contains("/Patient/Home/DeDupePatients");
	}

	public void clickOnDeDupeFindDuplicate() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.visibilityOfElementLocated(dobLabel));
		WebElement findDuplicateBtn = wait.until(ExpectedConditions.elementToBeClickable(findDuplicateOption));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", findDuplicateBtn);
		findDuplicateBtn.click();
	}

	public String getToastMessage() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
		return driver.findElement(toastMessage).getText().trim();
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

	public void enablePatientModuleGeneralAuditViewOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement checkbox = wait
				.until(ExpectedConditions.elementToBeClickable(patientModuleGeneralAuditViewCheckbox));
		if (!checkbox.isSelected()) {
			checkbox.click();
		}
	}

	public void disablePatientModuleGeneralAuditView() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModule = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModule.click();
		sleep(2000);
		WebElement generalAuditView = wait
				.until(ExpectedConditions.elementToBeClickable(patientModuleGeneralAuditViewLabel));
		generalAuditView.click();
	}

	public void verifyPatientViewOnlyUser() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModule = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModule.click();
		sleep(2000);
		WebElement patientAll = wait.until(ExpectedConditions.elementToBeClickable(patientModuleAllLabel));
		patientAll.click();
		sleep(2000);
		WebElement patientView = wait.until(ExpectedConditions.elementToBeClickable(patientModuleViewLabel));
		patientView.click();
	}

	public void verifyPatientViewAndAddUser() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModule = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModule.click();
		sleep(2000);
		WebElement patientAll = wait.until(ExpectedConditions.elementToBeClickable(patientModuleAllLabel));
		patientAll.click();
		sleep(2000);
		WebElement patientView = wait.until(ExpectedConditions.elementToBeClickable(patientModuleViewLabel));
		patientView.click();
		WebElement patientAdd = wait.until(ExpectedConditions.elementToBeClickable(patientModuleAddLabel));
		patientAdd.click();
	}

	public void createUserWithPatientViewAddEditAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModule = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModule.click();
		sleep(2000);
		WebElement patientAll = wait.until(ExpectedConditions.elementToBeClickable(patientModuleAllLabel));
		patientAll.click();
		sleep(2000);
		WebElement patientView = wait.until(ExpectedConditions.elementToBeClickable(patientModuleViewLabel));
		patientView.click();
		sleep(2000);
		WebElement patientAdd = wait.until(ExpectedConditions.elementToBeClickable(patientModuleAddLabel));
		patientAdd.click();
		sleep(2000);
		WebElement patientEdit = wait.until(ExpectedConditions.elementToBeClickable(patientModuleEditLabel));
		patientEdit.click();
		sleep(2000);
	}

	public void createPatientModuleProfileWithFullAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModule = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModule.click();
		sleep(2000);
	}

	public void createProfileUpdateDeDupe() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModule = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModule.click();
		sleep(2000);
	}

	public void createProfileNoUpdateAccessDeDupe() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModule = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModule.click();
		sleep(2000);
		WebElement deDupeAllCheckbox = wait.until(ExpectedConditions.elementToBeClickable(patientDeDupeAllCheckbox));
		deDupeAllCheckbox.click();

	}

	public void createProfileWithViewOnlyAccessForPatientTag() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModulesLabel = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModulesLabel.click();
		sleep(2000);
		WebElement patientTagAllPermissionCheckboxElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientTagAllPermissionCheckbox));
		patientTagAllPermissionCheckboxElement.click();
		WebElement patientTagViewPermissionCheckboxElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientTagViewPermissionCheckbox));
		patientTagViewPermissionCheckboxElement.click();
	}

	public void createProfileWithViewAndAddAccessForPatientTag() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModulesLabel = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModulesLabel.click();
		sleep(2000);
		WebElement patientTagAllPermissionCheckboxElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientTagAllPermissionCheckbox));
		patientTagAllPermissionCheckboxElement.click();
		WebElement patientTagViewPermissionCheckboxElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientTagViewPermissionCheckbox));
		patientTagViewPermissionCheckboxElement.click();
		WebElement patientTagAddPermissionLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientTagAddLabel));
		patientTagAddPermissionLabelElement.click();

	}

	public void createPatientModuleTagViewAddEditProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModulesLabel = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModulesLabel.click();
		sleep(2000);
		WebElement patientTagAllPermissionCheckboxElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientTagAllPermissionCheckbox));
		patientTagAllPermissionCheckboxElement.click();
		sleep(1000);
		WebElement patientTagViewPermissionCheckboxElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientTagViewPermissionCheckbox));
		patientTagViewPermissionCheckboxElement.click();
		sleep(1000);
		WebElement patientTagAddPermissionLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientTagAddLabel));
		patientTagAddPermissionLabelElement.click();
		sleep(1000);
		WebElement patientTagEditPermissionLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientTagEditPermissionLabel));
		patientTagEditPermissionLabelElement.click();
		sleep(1000);

	}

	public void createPatientTagProfileWithFullAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModulesLabel = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModulesLabel.click();
		sleep(2000);

	}

	public void createSetupReviewCategoryViewOnlyProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModulesLabel = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModulesLabel.click();
		sleep(2000);
		WebElement patientReviewCategoryAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientReviewCategoryAllCheckbox));
		patientReviewCategoryAllLabel.click();
		sleep(2000);
		WebElement patientReviewCategoryViewLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientReviewCategoryViewCheckbox));
		patientReviewCategoryViewLabel.click();
		sleep(2000);

	}

	public void createSetupReviewCategoryViewAddProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModulesLabel = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModulesLabel.click();
		sleep(2000);
		WebElement patientReviewCategoryAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientReviewCategoryAllCheckbox));
		patientReviewCategoryAllLabel.click();
		sleep(2000);
		WebElement patientReviewCategoryViewLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientReviewCategoryViewCheckbox));
		patientReviewCategoryViewLabel.click();
		sleep(2000);
		WebElement patientReviewCategoryAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientReviewCategoryAddCheckbox));
		patientReviewCategoryAddLabel.click();
		sleep(2000);

	}

	public void createSetupReviewCategoryViewAddEditProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModulesLabel = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModulesLabel.click();
		sleep(2000);
		WebElement patientReviewCategoryAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientReviewCategoryAllCheckbox));
		patientReviewCategoryAllLabel.click();
		sleep(2000);
		WebElement patientReviewCategoryViewLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientReviewCategoryViewCheckbox));
		patientReviewCategoryViewLabel.click();
		sleep(2000);
		WebElement patientReviewCategoryAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientReviewCategoryAddCheckbox));
		patientReviewCategoryAddLabel.click();
		sleep(2000);
		WebElement patientReviewCategoryEditLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientReviewCategoryEditCheckbox));
		patientReviewCategoryEditLabel.click();
		sleep(2000);

	}

	public void shouldCreateFullAccessProfileForReviewCategory() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModulesLabel = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModulesLabel.click();
		sleep(2000);

	}

	public void createReferralSourceProfileWithViewAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModulesLabel = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModulesLabel.click();
		sleep(2000);
		WebElement patientReferralSourceAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientReferralSourceAllCheckbox));
		patientReferralSourceAllLabel.click();
		sleep(2000);
		WebElement patientReferralSourceViewLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientReferralSourceViewCheckbox));
		patientReferralSourceViewLabel.click();
		sleep(2000);

	}

	public void createSetupReferralSourceViewAddProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModulesLabel = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModulesLabel.click();
		sleep(2000);
		WebElement patientReferralSourceAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientReferralSourceAllCheckbox));
		patientReferralSourceAllLabel.click();
		sleep(2000);
		WebElement patientReferralSourceViewLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientReferralSourceViewCheckbox));
		patientReferralSourceViewLabel.click();
		sleep(2000);
		WebElement patientReferralSourceAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientReferralSourceAddCheckbox));
		patientReferralSourceAddLabel.click();
		sleep(2000);

	}

	public void createSetupReferralSourceViewAddEditProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModulesLabel = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModulesLabel.click();
		sleep(2000);
		WebElement patientReferralSourceAllLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientReferralSourceAllCheckbox));
		patientReferralSourceAllLabel.click();
		sleep(2000);
		WebElement patientReferralSourceViewLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientReferralSourceViewCheckbox));
		patientReferralSourceViewLabel.click();
		sleep(2000);
		WebElement patientReferralSourceAddLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientReferralSourceAddCheckbox));
		patientReferralSourceAddLabel.click();
		sleep(2000);
		WebElement patientReferralSourceEditLabel = wait
				.until(ExpectedConditions.elementToBeClickable(patientReferralSourceEditCheckbox));
		patientReferralSourceEditLabel.click();
		sleep(2000);

	}

	public void createSetupReferralSourceFullAccessProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectAllModulesLabel = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModulesLabel.click();
		sleep(2000);

	}

	public void userWithAllAdditionalAccessDisabledTest() {
		waitForLoaderIfPresent();

		WebElement selectAllModuleCheckbox = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModuleCheckbox.click();
		sleep(2000);
		WebElement patientModuleAllCheckbox = wait
				.until(ExpectedConditions.elementToBeClickable(patientModuleAllLabel));
		patientModuleAllCheckbox.click();
		sleep(2000);
		WebElement patientModuleAddCheckbox = wait
				.until(ExpectedConditions.elementToBeClickable(patientModuleAddLabel));
		patientModuleAddCheckbox.click();
		sleep(2000);
		WebElement patientModuleEditCheckbox = wait
				.until(ExpectedConditions.elementToBeClickable(patientModuleEditLabel));
		patientModuleEditCheckbox.click();
		sleep(2000);
		WebElement patientModuleDeleteCheckbox = wait
				.until(ExpectedConditions.elementToBeClickable(patientModuleDeleteLabel));
		patientModuleDeleteCheckbox.click();
		sleep(2000);
	}

	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	// PatientFamily
	public void userShouldNotBeAbleToDeletePatientFamily() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(familyDetailsTab)).click();
		List<WebElement> deleteElements = driver.findElements(deleteFamilyButton);
		if (!deleteElements.isEmpty()) {
			throw new AssertionError("Delete button should not be visible for Patient Family");
		}
	}

	public void removePatientFamily() {
		wait.until(ExpectedConditions.elementToBeClickable(familyDetailsTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deleteFamilyButton)).click();
	}

	public void userShouldBeAbleToAddPatientFamily() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPatientLink)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(familyDetailsTab)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(addFamilyButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameField))
				.sendKeys(Hooks.prop.getProperty("user.lastname.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField))
				.sendKeys(Hooks.prop.getProperty("user.firstname.value"));
		sleep(2000);
		WebElement birthDate = wait.until(ExpectedConditions.elementToBeClickable(birthDateInput));
		birthDate.click();
		sleep(2000);
		Select yearSelect = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(yearDropdown)));
		yearSelect.selectByVisibleText("2025");
		sleep(2000);
		Select monthSelect = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(monthDropdown)));
		monthSelect.selectByVisibleText("Apr");
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(dateToSelect)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(findPatientButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(selectPatientCheckbox)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	}

	public void addPatientFamily() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement patientFamilyAllElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientFamilyAllCheckbox));
		patientFamilyAllElement.click();
		sleep(2000);
		WebElement patientFamilyAddElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientFamilyAddCheckbox));
		patientFamilyAddElement.click();
		sleep(2000);

	}

	public void addDeletePatientFamily() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();

	}

	// PatientText
	public void userShouldBeAbleToUseQuickText() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(quickTextButton)).click();
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberInput))
				.sendKeys(Hooks.prop.getProperty("user.phone.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(messageBodyTextarea))
				.sendKeys(Hooks.prop.getProperty("user.message.value"));
		wait.until(ExpectedConditions.elementToBeClickable(saveTextButton)).click();
	}

	public void userShouldBeAbleToSendVCard() {
		sleep(3000);
		clickWhenClickable(sendVCardButton);
		sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(vCardPhoneInput))
				.sendKeys(Hooks.prop.getProperty("vcard.phone.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(vCardBodyTextarea))
				.sendKeys(Hooks.prop.getProperty("vcard.body.value"));
		clickWhenClickable(sendVCardSubmitButton);
	}

	public void assertElementPresent(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (TimeoutException e) {
			Assert.fail("Element not present after wait: " + locator.toString());
		}
	}

	public void userShouldBeAbleToReply() {
		sleep(3000);
		assertElementPresent(replyButton);
	}

	public void viewPatientText() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement patientTextAllElement = wait.until(ExpectedConditions.elementToBeClickable(patientTextAllCheckbox));
		patientTextAllElement.click();
		sleep(2000);
		WebElement patientTextViewElement = wait
				.until(ExpectedConditions.elementToBeClickable(patientTextViewCheckbox));
		patientTextViewElement.click();

	}

	public void fullAccessPatientText() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();

	}

	public void userShouldBeAbleToViewPatientText() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPatientLink)).click();
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(viewTextButtonIcon));
	}

	// Text
	public void userShouldBeAbleToAddToPatient() {
		sleep(3000);
		assertElementPresent(addToPatientButton);
	}

	public void userShouldNotBeAbleToReplyAddToPatientOrSendVCard() {
		sleep(3000);
		assertElementNotPresent(replyButton);
		sleep(2000);
		assertElementNotPresent(addToPatientButton);
		sleep(2000);
		assertElementNotPresent(sendVCardButton);
	}

	public void canUseQuickText() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(quickTextButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(quickTextPhoneInput))
				.sendKeys(Hooks.prop.getProperty("quick.text.phone.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(quickTextBodyTextarea))
				.sendKeys(Hooks.prop.getProperty("quick.text.body.value"));
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(quickTextSendButton)).click();
	}

	public void setTextViewAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement textAllElement = wait.until(ExpectedConditions.elementToBeClickable(textAllCheckbox));
		textAllElement.click();
		sleep(2000);
		WebElement textViewElement = wait.until(ExpectedConditions.elementToBeClickable(textViewCheckbox));
		textViewElement.click();
		sleep(2000);
		WebElement textQuickTextElement = wait.until(ExpectedConditions.elementToBeClickable(textQuickTextCheckbox));
		textQuickTextElement.click();

	}

	// CareGiverName
	public void careGiverAddEditDeleteAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldBeAbleToDeleteCaregiverName() {
		sleep(3000);
		clickWhenClickable(editPatientButtonIcon);
		sleep(3000);
		clickWhenClickable(optionsMenuButton);
		sleep(3000);
		clickWhenClickable(deleteCareGiverOption);
		sleep(3000);
		clickWhenClickable(confirmDeleteCareGiverButton);
		sleep(3000);
		clickWhenClickable(savePatientButton);
	}

	public void userShouldBeAbleToEditCaregiverName() {
		sleep(3000);
		clickWhenClickable(editPatientButtonIcon);
		sleep(3000);
		clickWhenClickable(optionsMenuButton);
		sleep(3000);
		clickWhenClickable(editCareGiverOption);
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(careGiverLastNameInput))
				.sendKeys(Hooks.prop.getProperty("caregiver.lastname.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(careGiverFirstNameInput))
				.sendKeys(Hooks.prop.getProperty("caregiver.firstname.value"));
		sleep(3000);
		clickWhenClickable(saveCareGiverPopupButton);
		sleep(3000);
		clickWhenClickable(savePatientButton);
	}

	public void userShouldBeAbleToAddCareGiverName() {
		sleep(3000);
		clickWhenClickable(firstPatientLink);
		sleep(5000);
		clickWhenClickable(editPatientButtonIcon);
		sleep(3000);
		clickWhenClickable(addNewCareGiverButton);
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(careGiverLastNameInput))
				.sendKeys(Hooks.prop.getProperty("caregiver.lastname.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(careGiverFirstNameInput))
				.sendKeys(Hooks.prop.getProperty("caregiver.firstname.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(careGiverPhoneInput))
				.sendKeys(Hooks.prop.getProperty("caregiver.phone.value"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(careGiverRelationInput))
				.sendKeys(Hooks.prop.getProperty("caregiver.relation.value"));
		sleep(3000);
		clickWhenClickable(saveCareGiverPopupButton);
		sleep(3000);
		clickWhenClickable(savePatientButton);
	}

	// MedicalHealthCard
	public void medicalHealthCardAddEditDeleteAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldBeAbleToDeleteMedicalHealthCard() {
		sleep(2000);
		clickWhenClickable(medicalHealthCardTab);
		sleep(2000);
		clickWhenClickable(medicalHealthCardActionMenu);
		sleep(2000);
		clickWhenClickable(deleteMedicalHealthCardOption);
		sleep(2000);
		clickWhenClickable(confirmDeleteMedicalHealthCardButton);
	}

	public void userShouldBeAbleToEditMedicalHealthCard() {
		sleep(2000);
		clickWhenClickable(medicalHealthCardTab);
		sleep(2000);
		clickWhenClickable(medicalHealthCardActionMenu);
		sleep(2000);
		clickWhenClickable(editMedicalHealthCardOption);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(healthPlanNameInput))
				.sendKeys(Hooks.prop.getProperty("health.plan.name.value"));
		sleep(2000);
		clickWhenClickable(saveMedicalHealthCardButton);
	}

	public void userShouldBeAbleToAddMedicalHealthCard() {
		sleep(3000);
		clickWhenClickable(firstPatientLink);
		sleep(3000);
		clickWhenClickable(medicalHealthCardTab);
		sleep(3000);
		clickWhenClickable(addMedicalHealthCardButton);
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(healthPlanNameInput))
				.sendKeys(Hooks.prop.getProperty("health.plan.name.value"));
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(planNumberInput))
				.sendKeys(Hooks.prop.getProperty("plan.number.value"));
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(planCardHolderInput))
				.sendKeys(Hooks.prop.getProperty("plan.cardholder.value"));
		sleep(3000);
		clickWhenClickable(saveMedicalHealthCardButton);
	}

	// FeedbackForm
	public void userShouldBeAbleToDeleteFeedbackForm() {
		sleep(2000);
		clickWhenClickable(feedbackFormActionMenuIcon);
		sleep(2000);
		clickWhenClickable(feedbackFormDeleteOption);
		sleep(1000);
		clickWhenClickable(confirmDeleteFeedbackFormButton);
	}

	public void enableFeedbackFormViewAddDelete() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldBeAbleToViewFeedbackForm() {
		sleep(2000);
		clickWhenClickable(firstPatientLink);
		sleep(2000);
		clickWhenClickable(feedbackFormActionMenuIcon);
		sleep(2000);
		clickWhenClickable(patientViewOption);
		sleep(2000);
		clickWhenClickable(closeFeedbackFormPopupIcon);

	}

	public void userShouldBeAbleToAddFeedbackForm() {
		sleep(2000);
		clickWhenClickable(feedbackFormTab);
		sleep(2000);
		selectDropdownByIndexWhenReady(feedbackFormDropdown, 3);
		sleep(2000);
		clickWhenClickable(textOptionLabel);
		sleep(2000);
		clickWhenClickable(emailOptionLabel);
		sleep(2000);
		clickWhenClickable(submitFeedbackFormButton);
	}

	public void createPatientVitalsProfileWithFullAccessTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void editPatientVitalsTest() {
		sleep(2000);
		clickWhenClickable(vitalsTab);
		sleep(2000);
		clickWhenClickable(vitalsOptionsButton);
		sleep(2000);
		clickWhenClickable(editVitalsButton);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(temperatureInput))
				.sendKeys(Hooks.prop.getProperty("temperature.value"));
		sleep(2000);
		clickWhenClickable(saveVitalsButton);
	}

	public void addPatientVitalsTest() {
		sleep(2000);
		clickWhenClickable(firstPatientLink);
		sleep(2000);
		clickWhenClickable(vitalsTab);
		sleep(2000);
		clickWhenClickable(addVitalsButton);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(bpInputField))
				.sendKeys(Hooks.prop.getProperty("bp.value"));
		sleep(2000);
		clickWhenClickable(saveVitalsButton);
	}

	public void userShouldBeAbleToAddPatientVitals() {
		clickWhenClickable(firstPatientLink);
		clickWhenClickable(vitalsTab);
		clickWhenClickable(addVitalsButton);
		wait.until(ExpectedConditions.visibilityOfElementLocated(bpInputField))
				.sendKeys(Hooks.prop.getProperty("bp.value"));
		clickWhenClickable(saveVitalsButton);
	}

	public void deletePatientVitalsTest() {
		sleep(2000);
		clickWhenClickable(vitalsTab);
		sleep(2000);
		clickWhenClickable(vitalsOptionsButton);
		sleep(2000);
		clickWhenClickable(deleteVitalsButton);
		sleep(2000);
		clickWhenClickable(confirmDeleteVitalsButton);
	}

	public void deletePatientAppointment() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(upcomingAppointmentTab)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(firstAppointmentActionButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(deleteAppointmentOption)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteAppointmentButton)).click();
	}

	public void editPatientAppointment(String noteText) {
		sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(upcomingAppointmentTab)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(firstAppointmentActionButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(editVitalsButton)).click();
		sleep(2000);
		WebElement notes = wait.until(ExpectedConditions.visibilityOfElementLocated(notesField));
		notes.clear();
		notes.sendKeys(noteText);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveAppointmentButton)).click();

	}

	public void managePatientAppointmentTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void addPatientAppointment(LocalDate date, int startHour, int startMinute, int endHour, int endMinute) {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPatientLink)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(upcomingAppointmentTab)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(newAppointmentButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(appointmentDateInput)).click();
		sleep(2000);
		String month = date.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
		int day = date.getDayOfMonth();
		int year = date.getYear();
		new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(yearDropdown)))
				.selectByVisibleText(String.valueOf(year));
		new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(monthDropdown))).selectByVisibleText(month);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(dayLocator(day))).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(startTimeInput)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(startHourLocator(startHour))).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(startMinuteLocator(startMinute))).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(endTimeInput)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(endHourLocator(endHour))).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(endMinuteLocator(endMinute))).click();
		sleep(2000);
		Select appointmentStatusSelect = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(appointmentStatusDropdown)));
		appointmentStatusSelect.selectByIndex(2);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveAppointmentButton)).click();
	}

	private By dayLocator(int day) {
		return By.xpath("//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()='" + day + "']");
	}

	private By startHourLocator(int hour) {
		return By.xpath("//td[@class='ui-timepicker-hour-cell' " + "and @data-timepicker-instance-id='#startTime' "
				+ "and @data-hour='" + hour + "']");
	}

	private By startMinuteLocator(int minute) {
		return By.xpath("//td[@class='ui-timepicker-minute-cell' " + "and @data-timepicker-instance-id='#startTime' "
				+ "and @data-minute='" + minute + "']");
	}

	private By endHourLocator(int hour) {
		return By.xpath("//td[@class='ui-timepicker-hour-cell' " + "and @data-timepicker-instance-id='#endTime' "
				+ "and @data-hour='" + hour + "']");
	}

	private By endMinuteLocator(int minute) {
		return By.xpath("//td[@class='ui-timepicker-minute-cell' " + "and @data-timepicker-instance-id='#endTime' "
				+ "and @data-minute='" + minute + "']");
	}

	// PatientMedicationColorCodeSetting
	public void deleteColorCode() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(deleteMedicationColorCodeButton)).click();
	}

	public void verifyDeleteNotAvailable() {
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton)).click();
		assertElementNotPresent(deleteOption);
	}

	public void editColorCode(int dropdownIndex) {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(editPatientButton)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(medicationColorCodeTypeDropdown));
		sleep(2000);
		Select dropdown = new Select(driver.findElement(medicationColorCodeTypeDropdown));
		sleep(2000);
		dropdown.selectByIndex(dropdownIndex);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveColorCodeButton)).click();
	}

	public void createProfileWithColorCodeAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void addColorCode() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(newPatientMedicationColorCodeSettingLabel)).click();
		sleep(2000);
		selectDropdownByIndexWhenReady(medicationColorCodeTypeDropdown, 1);
		sleep(2000);
		selectDropdownByIndexWhenReady(columnNameDropdown, 1);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveColorCodeButton)).click();
	}

}
