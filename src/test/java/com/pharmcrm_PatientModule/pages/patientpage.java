package com.pharmcrm_PatientModule.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class patientpage {
	private WebDriver driver;
	private WebDriverWait wait;

	// ReferralSourcepage
	private By patientReferralSourceAllCheckbox = By.xpath("//label[@for='chkg9PatientReferralSourceAll']");
	private By patientReferralSourceViewCheckbox = By.xpath("//label[@for='chkg9PatientReferralSourceView']");
	private By patientReferralSourceAddCheckbox = By.xpath("//label[@for='chkg9PatientReferralSourceAdd']");
	private By newReferralSourceButton = By.xpath("//span[normalize-space()='New Referral Source']");
	private By referralSourceDescriptionInput = By.xpath("//input[@id='ReferralSource_Description']");
	private By referralSourceSaveButton = By.xpath("//button[@id='btnSave']");
	private By referralSourceFirstRowActionMenu = By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]");
	private By confirmDeleteReferralSourceButton = By
			.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']");
	private By patientReferralSourceEditCheckbox = By.xpath("//label[@for='chkg10PatientReferralSourceEdit']");

	// ReviewCategoryPage
	private By patientReviewCategoryAllCheckbox = By.xpath("//label[@for='chkg13PatientReviewCategoryAll']");
	private By patientReviewCategoryViewCheckbox = By.xpath("//label[@for='chkg13PatientReviewCategoryView']");
	private By patientReviewCategoryAddCheckbox = By.xpath("//label[@for='chkg13PatientReviewCategoryAdd']");
	private By newReviewCategoryButton = By.xpath("//span[normalize-space()='New Review Categories']");
	private By reviewCategoryDescriptionInput = By.xpath("//input[@id='ReviewCategory_Description']");
	private By addReviewCategorySaveButton = By.xpath("//button[@id='btnSave']");
	private By patientReviewCategoryEditCheckbox = By.xpath("//label[@for='chkg13PatientReviewCategoryEdit']");

	// LocatorTagPage
	private By newTagButton = By.xpath("//span[normalize-space()='New Tag']");
	private By firstTagActionMenu = By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]");
	private By editTagOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	private By patientTagAddLabel = By.xpath("//label[@for='chkg10PatientTagAdd']");
	private By btnNewTag = By.xpath("//span[normalize-space()='New Tag']");
	private By txtTagName = By.id("Tag_Name");
	private By txtTagDescription = By.id("Tag_Description");
	private By confirmDeleteButtontag = By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']");

	// LocatorDedupePage
	private By lastNameLabel = By.xpath("//label[normalize-space()='Last Name']");
	private By firstNameLabel = By.xpath("//label[normalize-space()='First Name']");
	private By findDuplicateButton = By.xpath("//span[normalize-space()='Find Duplicate']");
	private By firstRecordCheckbox = By.xpath("(//label[starts-with(@for,'ckhg_')])[1]");
	private By secondRecordCheckbox = By.xpath("(//label[starts-with(@for,'ckhg_')])[2]");
	private By tableSortColumn8 = By.xpath("//table[1]//thead[1]//tr[1]//th[8]//a[1]");
	private By firstCheckboxOnNextPage = By.xpath("(//input[starts-with(@id,'chkg_')])[1]");
	private By finishButton = By.xpath("//a[normalize-space()='Finish']");
	private By patientDeDupeAllCheckbox = By.xpath("//label[@for='chkg11PatientDeDupeAll']");
	private By errorHeader = By.xpath("//h2[normalize-space()='Error']");

	// LocatorPatinetPage
	private By resetPatientPasswordButton = By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/button[1]/i[1]");
	private By resetPatientPasswordText = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Reset Password')]");
	private By deleteRPMDeviceIcon = By.xpath("//tbody/tr/td[4]/div[1]/div[1]/button[1]/i[1]");
	private By deleteRPMDeviceText = By.xpath("//a[@id='btnDeleteRPMDeviceConfirm']//span[contains(text(),'Delete')]");
	private By editRPMDeviceIcon = By.xpath("//tbody/tr/td[4]/div[1]/div[1]/button[1]/i[1]");
	private By editRPMDeviceText = By
			.xpath("//a[@class='tooltiped txt-decor-none user-access']//span[contains(text(),'Edit')]");
	private By addRPMDeviceIcon = By.xpath(
			"//div[@class='model-inp dropdownCaretAdd mb-0']//div[@class='usersearch plus-usersearch']//*[name()='svg']");
	private By exportPatientDataToExcelButton = By.xpath("//span[normalize-space()='Export Excel']");
	private By outgoingCallButtonIcon = By
			.xpath("//div[@id='page-wrapper']//div[4]//div[2]//button[1]//*[name()='svg']");
	private By addDeliveryPreferenceButton = By.xpath("//button[@id='btnAddDeliveryPreference']");
	private By quickTextButton = By.xpath("//span[normalize-space()='Quick Text']");
	private By sendButton = By.id("btnSave");
	private By bodyRequiredValidation = By.xpath("//div[contains(text(),'Body should not be empty.')]");
	private By phoneRequiredValidation = By.xpath("//div[contains(text(),'Please enter phone number.')]");
	private By saveButton = By.id("btnSave");
	private By preloader = By.cssSelector("div.preloader");
	private By sendVCardButton = By.xpath("//span[normalize-space()='Send VCard']");
	private By sendVCardSubmitButton = By.id("btnSendVCard");
	private By vcardValidationToastMessage = By.xpath("//div[@class='toast-message']");
	private By patientActionMenuButton = By.xpath("//tbody/tr[1]/td[12]//button//i");
	private By deletePatientOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Delete']");
	private By cancelDeletePatientButton = By
			.xpath("//button[contains(@onclick,'CloseDeletePopup')]//i[contains(@class,'fa-times')]");
	private By deletePatientToastMessage = By.xpath("//div[@class='toast-message']");
	private By addToFollowupButton = By.xpath("//span[normalize-space()='Add To Followup']");
	private By nextButton = By.xpath("//a[normalize-space()='Next']");
	private By blankSubmissionErrorToast = By.xpath("//div[@class='toast toast-error']");
	private By newPatientButton = By.xpath("//span[normalize-space()='New Patient']");
	private By searchPatientButton = By.xpath("//button[@id='btnFindPatient']");
	private By selectExistingPatientButton = By.xpath("//button[normalize-space()='Select Existing Patient']");
	private By addNewPatientButton = By.xpath("//button[normalize-space()='Add New Patient']");
	private By filterButton = By.xpath("//span[normalize-space()='Filter']");
	private By filterLastNameInput = By.xpath("//input[@id='Filter_LastName']");
	private By filterCancelButton = By.xpath("//button[@type='button']//i[@class='fa-solid fa-xmark']");
	private By patientListTable = By.xpath("//table");
	private By editPatientOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	private By nextOfKinLastNameInput = By.xpath("//input[@id='Patient_NextofKinLastName']");
	private By editPatientCancelButton = By.xpath("//a[normalize-space()='Cancel']");
	private By addToTrialOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Add To Trail')]");
	private By patientActionMenuButtonBlankEmail = By.xpath("//tbody/tr[2]/td[12]/div[1]/div[1]/button[1]/i[1]");
	private By enableLoginOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Enable Login')]");
	private By validationToastMessage = By.xpath("//div[@class='toast-message']");
	private By addTagButton = By.xpath("//span[normalize-space()='New Tag']");
	private By saveTagButton = By.xpath("//button[@id='btnSave']");
	private By updatedByColumn = By.xpath("//th[normalize-space()='Updated By']");
	private By updatedDateColumn = By.xpath("//th[normalize-space()='Updated Date']");
	private By patientActionMenuIcon = By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/button[1]/i[1]");
	private By lastNameField = By.xpath("//input[@id='Patient_LastName']");
	private By firstNameField = By.xpath("//input[@id='Patient_FirstName']");
	private By birthDateField = By.xpath("//input[@id='Patient_BirthDate']");
	private By phoneNumberField = By.xpath("//input[@id='Patient_PhoneNumber']");
	private By editPatientButton = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	private By deletePatientButton = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	private By rowActionButton = By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/button[1]/i[1]");
	private By privateNotesTextArea = By.xpath("//textarea[@id='Patient_PrivateNotes']");
	private By deleteConfirmButton = By.xpath("//div[@id='deletePatientModel']//button[@id='btnDeleteConfirm']");
	private By firstPatientLink = By.xpath("(//a[@class='gridLinkButton'])[1]");
	private By sendForReviewIcon = By.xpath("//*[name()='path' and contains(@d,'M9.0949 14')]");
	private By tagsLabel = By.xpath("//label[normalize-space()='Tags']");
	private By saveSendForReviewButton = By.xpath("//button[@id='savesendforreview']");
	private By patientSignatureButton = By.xpath("//a[@id='btnpatientSignature']//*[name()='svg']");
	private By emailOption = By.xpath("//a[normalize-space()='Email']");
	private By mailTemplateDropdown = By.id("MailTemplate_Id");
	private By editorTextArea = By.xpath("//div[@aria-label='Editor editing area: main. Press Alt+0 for help.']//p");
	private By signatureCheckbox = By.xpath("//label[normalize-space()='Placeat esse ut cu']");
	private By savePatientSignatureButton = By.id("btnPatientSignatureSave");
	private By textOption = By.xpath("//a[normalize-space()='Text']");
	private By smsTemplateDropdown = By.id("SMSTemplate_Id");
	private By patientSignaturesTab = By.xpath("//a[normalize-space()='Patient Signatures']");
	private By sixthPatientSignatureLink = By
			.xpath("//tbody/tr/td[@scope='row']//a[.//*[name()='path' and @id='Path_1']]");
	private By tagInputField = By.xpath("//div[@class='col-md-4']//input[@type='text']");
	private By firstTagOption = By
			.xpath("(//ul[contains(@class,'multiple-select-dropdown')]//li[not(@class='disabled')]//label)[1]");
	private By patientTagButton = By.xpath("//div[@id='btnPatientTag']//*[name()='svg']");
	private By firstMappedTagDropdown = By
			.xpath("(//ul[@class='dropdownSelectedLabelMain']//li//a[@id='btnAddPatientTag'])[1]");
	private By deleteMappedTagButton = By.xpath("//div[33]//div[1]//div[1]//div[1]//button[1]//i[1]");
	private By prescriptionIcon = By.xpath("//*[name()='path' and @id='Path_2472']");
	private By patientIdInput = By.id("Filter_PatientId");
	private By searchIcon = By.xpath("//i[@class='fa-solid fa-magnifying-glass']");
	private By referralsTab = By.xpath("//a[normalize-space()='Referrals']");
	private By newAssignmentText = By.xpath("//td[normalize-space()='New Assignment']");
	private By referralStatus = By.xpath("//td[normalize-space()='New Assignment']");
	private By referralInput = By.xpath("//div[@class='col-md-4 px-0']//input[@type='text']");
	private By firstReferralOption = By.xpath(
			"(//h6[.='Referral Source']//following::ul[contains(@class,'multiple-select-dropdown')]//li[not(contains(@class,'disabled'))]//span)[1]");
	private By addButton = By.xpath("//div[@id='btnPatientReferralSource']//*[name()='svg']");
	private By firstRowActionButton = By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]");
	private By enrollmentInput = By.xpath("//div[@class='col-md-4 pr-0']//input[@type='text']");
	private By firstEnrollmentOption = By.xpath(
			"(//h6[.='Enrollment']//following::ul[contains(@class,'multiple-select-dropdown')]//li[not(contains(@class,'disabled'))]//span)[1]");
	private By firstEnrollmentActionButton = By
			.xpath("(//ul[@class='dropdownSelectedLabelMain']/li//a[@id='btnAddPatientEnrollment'])[1]");
	private By deleteEnrollmentButton = By
			.xpath("//button[@onclick='javascript: CloseDeletePatientEnrollmentPopup();']//i[@class='fa fa-times']");
	private By statusDropdown = By.id("Patient_Status");
	private By updateButton = By.xpath("//a[@class='patientStatusBtn']//*[name()='svg']");
	private By primaryDropdown = By.id("Patient_PrimaryDeliveryPreferenceType");
	private By secondaryDropdown = By.id("Patient_SecondaryDeliveryPreferenceType");
	private By outgoingCallButton = By.xpath("//div[@id='page-wrapper']//div[4]//div[2]//button[1]//*[name()='svg']");
	private By closeDialerButton = By.xpath("//i[@onclick='closeDialerDialog();']");
	private By exportToExcelButton = By.xpath("//div[@id='content']//div//div[5]//div[2]//button[1]//*[name()='svg']");
	private By deviceDropdown = By.id("registeredDeviceId");
	private By addDeviceButton = By.xpath(
			"//div[@class='model-inp dropdownCaretAdd mb-0']//div[@class='usersearch plus-usersearch']//*[name()='svg']");
	private By actionButton = By.xpath("//tbody/tr/td[4]/div[1]/div[1]/button[1]/i[1]");
	private By editOption = By
			.xpath("//a[@class='tooltiped txt-decor-none user-access']//span[contains(text(),'Edit')]");
	private By activeCheckbox = By.xpath("//label[@id='chk2PatientRPMDevice_IsActive']");
	private By resetPasswordOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Reset Password')]");
	private By newPasswordField = By.id("newPassword");
	private By confirmPasswordField = By.id("confirmPassword");
	private By resetButton = By.id("btnResetPassword");
	private By firstPatientViewButton = By.xpath("(//a[@class='gridLinkButton'])[1]");
	private By addReferralSourceIcon = By.xpath(
			"//div[@id='btnPatientReferralSource']//*[name()='svg']//*[name()='path' and contains(@d,'M256 80c0-')]");
	private By deleteReferralSourceIcon = By.xpath(
			"//a[@id='btnAddPatientReferralSource']//*[name()='svg']//*[name()='g' and @id='Group_466']//*[name()='circle' and @id='Ellipse_42']");
	private By addPatientEnrollmentIcon = By.xpath(
			"//div[@id='btnPatientEnrollmentApp']//*[name()='svg']//*[name()='path' and contains(@d,'M256 80c0-')]");
	private By deletePatientEnrollmentIcon = By
			.xpath("(//ul[@class='dropdownSelectedLabelMain']/li//a[@id='btnAddPatientEnrollment'])[1]");
	private By updatePatientStatusIcon = By.xpath("//a[@class='patientStatusBtn']//*[name()='svg']");

	// LocatorReferralpage
	private By addPatientIcon = By.xpath("//a[@id='addPatientNamePopup']//img");
	private By selectPatientRadio = By.id("d2666909-ed0d-49fd-9500-af849059511e");
	private By selectPatientBtn = By.id("btnPatient");
	private By referralEntityType = By.id("ReferralEntityType");
	private By addProviderIcon = By.xpath("//a[@id='addCurrentProviderPopup']//img");
	private By fullSearchRadio = By.id("rdoFullSearch");
	private By providerLastNameInput = By.id("Filter_DoctorLastName");
	private By selectProviderRadio = By.id("9759a37e-c5fa-4310-abfd-ecc9ab729697");
	private By selectProviderBtn = By.id("btnProvider");
	private By referralType = By.id("ReferralType");
	private By referralCategory = By.id("ReferralCategoryId");
	private By priority = By.id("Priority");
	private By moreOptionsIcon = By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']");
	private By deleteOption = By.xpath("//span[normalize-space()='Delete']");
	private By confirmDeleteButton = By
			.xpath("//div[@id='deleteClinicalMedReconModel']//button[@id='btnDeleteConfirm']");

	// LocatorTagPage
	private By tagNameInput = By.xpath("//input[@id='Tag_Name']");
	private By cancelEditTagTypeButton = By
			.xpath("//button[@onclick='javascript: CloseaddTagModal();']//i[@class='fa fa-times']");
	private By tagTypeNameInList = By.xpath("//table//tbody/tr[1]/td[1]");
	private By tagActionMenuButton = By.xpath(
			"//tbody/tr[1]/td[last()]//button//i[contains(@class,'ellipsis') or contains(@class,'fa-ellipsis')]");
	private By editTagTypeOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[contains(text(),'Edit')]");
	private By deleteTagOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	private By cancelDeleteTagButton = By
			.xpath("//button[@onclick='javascript: CloseDeletePopup();']//i[@class='fa fa-times']");
	private By patientTagAllPermissionCheckbox = By.xpath("//label[@for='chkg10PatientTagAll']");
	private By patientTagViewPermissionCheckbox = By.xpath("//label[@for='chkg10PatientTagView']");

	// LocatorReviewCategoriesPage
	private By addReviewCategoryButton = By.xpath("//span[normalize-space()='New Review Categories']");
	private By saveReviewCategoryButton = By.xpath("//button[@id='btnSave']");
	private By addReviewCategoryModal = By.xpath("//div[@id='addReviewCategoryModal']//div[@class='modal-header']");
	private By reviewCategoryActionMenuButton = By.xpath("//tbody/tr[1]/td[6]/div[1]/div[1]/button[1]/i[1]");
	private By editReviewCategoryOption = By.xpath("//span[normalize-space()='Edit']");
	private By reviewCategoryNameInput = By.xpath("//input[@id='ReviewCategory_Name']");
	private By cancelEditReviewCategoryButton = By
			.xpath("//button[@onclick='javascript: CloseaddReviewCategoryModal();']//i[@class='fa fa-times']");
	private By reviewCategoryName = By.xpath("//tbody/tr[1]/td[2]");
	private By deleteReviewCategoryButton = By.xpath("//span[normalize-space()='Delete']");
	private By cancelDeleteReviewCategoryButton = By
			.xpath("//button[@onclick='javascript: CloseDeletePopup();']//i[@class='fa fa-times']");

	// LocatorReferralSourcesPage
	private By addReferralSourceButton = By.xpath("//span[normalize-space()='New Referral Source']");
	private By addReferralSourceSaveButton = By.xpath("//button[@id='btnSave']");
	private By editReferralSourceOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	private By referralSourceNameInput = By.xpath("//input[@id='ReferralSource_Name']");
	private By cancelEditReferralSourceButton = By
			.xpath("//button[@onclick='javascript: CloseaddReferralSourceModal();']//i[@class='fa fa-times']");
	private By actionMenuForReferralSource = By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]");
	private By deleteReferralSourceOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	private By cancelDeleteReferralSourceButton = By
			.xpath("//button[@onclick='javascript: CloseDeletePopup();']//i[@class='fa fa-times']");

	// LocatorEnrollmentsPage
	private By addEnrollmentButton = By.xpath("//span[normalize-space()='New Enrollment']");
	private By addEnrollmentForm = By.xpath("//div[@id='addEnrollmentModal']//div[@class='modal-header']");
	private By editEnrollmentOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	private By enrollmentNameField = By.id("Enrollment_Name");
	private By cancelEditEnrollmentButton = By
			.xpath("//button[@onclick='javascript: CloseaddEnrollmentModal();']//i[@class='fa fa-times']");
	private By enrollmentNameFromList = By.xpath("//tbody/tr[1]/td[2]");
	private By enrollmentActionMenuButton = By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/button[1]/i[1]");
	private By deleteEnrollmentOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	private By cancelDeleteEnrollmentButton = By
			.xpath("//button[@onclick='javascript: CloseDeletePopup();']//i[@class='fa fa-times']");
	private By patientEnrollmentAllCheckbox = By.xpath("//label[@for='chkg10PatientEnrollmentAll']");
	private By patientEnrollmentViewCheckbox = By.xpath("//label[@for='chkg10PatientEnrollmentView']");
	private By patientEnrollmentAddCheckbox = By.xpath("//label[@for='chkg10PatientEnrollmentAdd']");
	private By newEnrollmentButton = By.xpath("//span[normalize-space()='New Enrollment']");
	private By enrollmentNameInput = By.xpath("//input[@id='Enrollment_Name']");
	private By enrollmentSaveButton = By.xpath("//button[@id='btnSave']");
	private By confirmDeleteEnrollmentButton = By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']");
	private By patientEnrollmentEditCheckbox = By.xpath("//label[@for='chkg10PatientEnrollmentEdit']");

	// LocatorDeDupePage
	private By findDuplicateOption = By.xpath("//span[normalize-space()='Find Duplicate']");
	private By dobLabel = By.xpath("//label[normalize-space()='Date of Birth']");
	private By toastMessage = By.xpath("//div[@class='toast-message']");

	// LocatorProfilesPage
	private By profilefilterButton = By.xpath("//*[name()='path' and @id='Union_73']");
	private By profileNameInput = By.xpath("//input[@id='Filter_Name']");
	private By searchButton = By.xpath("//i[@class='fa-solid fa-magnifying-glass']");
	private By actionMenu = By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']");
	private By editButton = By.xpath("//span[normalize-space()='Edit']");
	private By submitButton = By.xpath("//button[@id='btnSave']");
	private By patientModuleGeneralAuditViewCheckbox = By.xpath("//label[@for='chkg37PatientAuditView']");
	private By selectAllModuleLabel = By.xpath("//label[normalize-space()='Select All Module']");
	private By patientModuleGeneralAuditViewLabel = By.xpath("//label[@for='chkg37SetupGeneralAll']");
	private By patientModuleAllLabel = By.xpath("//label[@for='chkg9PatientAll']");
	private By patientModuleViewLabel = By.xpath("//label[@for='chkg9PatientView']");
	private By patientModuleAddLabel = By.xpath("//label[@for='chkg9PatientAdd']");
	private By patientModuleEditLabel = By.xpath("//label[@for='chkg9PatientEdit']");
	private By patientModuleDeleteLabel = By.xpath("//label[@for='chkg9PatientDelete']");
	private By patientTagEditPermissionLabel = By.xpath("//label[@for='chkg10PatientTagEdit']");

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

	// ===== Actions =====
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
		waitAndSendKeys(editorTextArea, "This is a test email for patient signature.");
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
		notesField.sendKeys(notes);
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

}
