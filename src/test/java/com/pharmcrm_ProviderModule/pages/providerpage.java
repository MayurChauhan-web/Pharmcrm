package com.pharmcrm_ProviderModule.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import hooks.Hooks;

public class providerpage {
	private WebDriver driver;
	private WebDriverWait wait;

	// Providers Management
	public By newEhrSpan = By.xpath("//span[normalize-space()='New EHR']");
	public By ehrLink = By.xpath("//a[normalize-space()='EHR']");
	public By serviceLink = By.xpath("//a[normalize-space()='Service']");
	public By newServiceSpan = By.xpath("//span[normalize-space()='New Service']");
	public By providerExecutiveLastNameField = By.xpath("//input[@id='ProviderExecutive_LastName']");
	public By providerExecutiveFirstNameField = By.xpath("//input[@id='ProviderExecutive_FirstName']");
	public By providerExecutiveEmailField = By.xpath("//input[@id='ProviderExecutive_EmailId']");
	public By providerExecutivePhoneNumberField = By.xpath("//input[@id='ProviderExecutive_PhoneNumber']");
	public By providerExecutiveCellNumberField = By.xpath("//input[@id='ProviderExecutive_CellNumber']");
	public By providerExecutivePhoneExtensionField = By.xpath("//input[@id='ProviderExecutive_PhoneNumberExtension']");
	public By providerExecutiveFaxNumberField = By.xpath("//input[@id='ProviderExecutive_FaxNumber']");
	public By providerExecutiveDesignationField = By.xpath("//input[@id='ProviderExecutive_Designation']");
	public By saveProviderExecutiveButton = By.xpath("//button[@id='btnSaveProviderExecutivePopup']");
	public By streetFieldProvider = By.xpath("//input[@id='ProviderAddress_Street']");
	public By cityFieldProvider = By.xpath("//input[@id='ProviderAddress_City']");
	public By stateFieldProvider = By.xpath("//input[@id='ProviderAddress_State']");
	public By zipCodeFieldProvider = By.xpath("//input[@id='ProviderAddress_ZipCode']");
	public By contactNumber1FieldProvider = By.xpath("//input[@id='ProviderAddress_ContactNumber1']");
	public By contactNumber2FieldProvider = By.xpath("//input[@id='ProviderAddress_ContactNumber2']");
	public By saveAddressButtonProvider = By.xpath("//button[@id='btnSaveAddress']");
	public By viewIcon = By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]");
	public By addNewBusinessGroupButton = By.xpath("//button[normalize-space()='Add New Business Group']");
	public By submitBusinessGroupButton = By.xpath("//button[@id='btnsubmit']");
	public By businessGroupImage = By.xpath("//a[@id='addBusinessGroupPopup']//img");
	public By filterEmail = By.xpath("//input[@id='Filter_EmailId']");
	public By filterExecutiveEmail = By.xpath("//input[@id='Filter_ProviderExecutiveEmailId']");
	public By filterZipCode = By.xpath("//input[@id='Filter_ZipCode']");
	public By filterPhoneNumber = By.xpath("//input[@id='Filter_PhoneNumber']");
	public By filterFaxNumber = By.xpath("//input[@id='Filter_FaxNumber']");
	public By searchCollapseIcon = By
			.xpath("//a[@id='searchcollapse']//*[name()='svg']//*[name()='path' and @id='Union_73']");
	public By searchIcon = By.xpath("//i[@class='fa-solid fa-magnifying-glass']");
	public By businessPhone1 = By.id("Provider_BusinessPhone1");
	public By businessPhone2 = By.id("Provider_BusinessPhone2");
	public By cellPhone = By.id("Provider_CellPhone");
	public By primaryEmail = By.id("Provider_PrimaryEmail");
	public By secondaryEmail = By.id("Provider_SecondaryEmail");
	public By doctorLastName = By.id("Provider_DoctorLastName");
	public By doctorFirstName = By.id("Provider_DoctorFirstName");
	public By providerZone = By.id("Provider_Zone");
	public By providerNPI = By.id("Provider_NPINumber");
	public By newProviderTab = By.xpath("//span[normalize-space()='New Provider']");
	public By vCardPhoneNumber = By.id("vCardPhoneNumber");
	public By sendVCardTab = By.xpath("//span[normalize-space()='Send VCard']");
	public By toastMessage = By.xpath("//div[@class='toast-message']");
	public By searchButtonQuickText = By.xpath("//button[normalize-space()='Search']");
	public By quickTextTab = By.xpath("//span[normalize-space()='Quick Text']");
	public By providerCommunicationLink = By.xpath("//a[normalize-space()='Provider Communication']");
	public By newCommunicationSpan = By.xpath("//span[normalize-space()='New Communication']");
	public By saveCommunicationButtonProvider = By.xpath("//button[@id='btnSaveCommunication']");
	public By newReferralEnrollmentText = By.xpath("//span[normalize-space()='New Referral Enrollment']");
	public By saveProviderReferralEnrollmentButton = By.xpath("//button[@id='btnSaveProviderReferralEnrollmentPopup']");
	public By phoneNumberField = By.xpath("//input[@id='ProviderReferralEnrollment_PhoneNumber']");
	public By emailIdField = By.xpath("//input[@id='ProviderReferralEnrollment_EmailId']");
	public By faxNumberField = By.xpath("//input[@id='ProviderReferralEnrollment_FaxNumber']");
	public By documentLibraryTab = By.xpath("//span[normalize-space()='Document Library']");
	public By addFolderButtonDocumet = By.xpath("//a[@id='btnAddFolder']//*[name()='svg']");

	// BusinessGroup
	public By frontDeskNameField = By.id("BusinessGroup_FrontDeskName");
	public By contactNumber1Field = By.id("BusinessGroup_ContactNumber1");
	public By contactNumber2Field = By.id("BusinessGroup_ContactNumber2");
	public By faxField = By.id("BusinessGroup_Fax");
	public By viewButton = By.xpath("//tbody/tr[1]/td[4]/div[1]/a[2]/img[1]");
	public By filterIcon = By.xpath("//a[@id='searchcollapse']//*[name()='svg']");
	public By businessGroupName = By.id("BusinessGroup_Name");
	public By phoneNumber = By.id("BusinessGroup_PhoneNumber");
	public By phoneExtension = By.id("BusinessGroup_PhoneNumberExt");
	public By zoneField = By.id("BusinessGroup_Zone");
	public By toastMessages = By.xpath("//div[contains(@class,'toast-message')]");
	public By fieldErrors = By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]");

	// Provider Template
	public By confirmDeleteProviderTemplateButton = By
			.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']");
	public By newProviderTemplateButton = By.xpath("//span[normalize-space()='New Template']");
	public By providerTemplateNameField = By.id("ProviderDocumentTemplate_Name");
	public By saveProviderTemplateButton = By.id("btnSave");
	public By providerTemplateOptionsButton = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By editProviderTemplateOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By deleteProviderTemplateOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");

	// Service
	public By newProviderServiceButton = By.xpath("//span[normalize-space()='New Provider Service']");
	public By serviceNameField = By.id("Service_Name");
	public By saveServiceButton = By.id("btnSave");
	public By serviceOptionsButton = By.xpath("(//button[@id='bucketDrop']/i)[1]");

	// Specialty
	public By newProviderSpecialtyButton = By.xpath("//span[normalize-space()='New Provider Specialty']");
	public By specialtyNameField = By.id("Specialty_Name");
	public By saveSpecialtyButton = By.id("btnSave");
	public By specialtyOptionsButton = By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]");
	public By editSpecialtyOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By deleteSpecialtyOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	public By confirmDeleteSpecialtyButton = By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']");

	// Category
	public By newProviderCategoryButton = By.xpath("//span[normalize-space()='New Provider Category']");
	public By categoryNameField = By.id("Category_Name");
	public By saveCategoryButton = By.id("btnSave");
	public By categoryOptionsButton = By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]");
	public By editCategoryOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By deleteCategoryOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	public By confirmDeleteCategoryButton = By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']");

	// Provider Type
	public By newProviderTypeButton = By.xpath("//span[normalize-space()='New Provider Type']");
	public By providerTypeNameField = By.id("ProviderType_Name");
	public By providerTypeLabelField = By.id("ProviderType_Label");
	public By saveProviderTypeButton = By.id("btnSave");
	public By providerTypeOptionsButton = By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]");
	public By editProviderTypeOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By deleteProviderTypeOption = By.xpath("//span[normalize-space()='Delete']");
	public By providerTypeNameColumn = By.xpath("//a[normalize-space()='Name']");

	// Provider PA Details
	public By paTab = By.xpath("//div[@id='tabs-7']//div[2]//div[1]//div[2]//a[1]//span[1]");
	public By paRecord = By.xpath("//td[normalize-space()='0000008']");

	// Provider Remote Monitoring Details
	public By remoteMonitoringTab = By.xpath("//div[@id='tabs-7']//div[3]//div[1]//div[2]//a[1]//span[1]");
	public By remoteMonitoringRecord = By.xpath("//td[normalize-space()='0000018']");

	// Provider Referral Outgoing Details
	public By outgoingTab = By.xpath("//a[normalize-space()='Outgoing']");
	public By outgoingReferralRow = By.xpath("//tbody/tr[1]/td[10]");
	public By downloadOutgoingReferralFileButton = By.xpath("//tbody/tr[1]/td[12]/div[1]/a[1]//*[name()='svg']");

	// Provider Referral Incoming Details
	public By providerReferralDetailsButton = By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]");
	public By historyTab = By.xpath("//a[normalize-space()='History']");
	public By viewAllReferralsButton = By
			.xpath("//div[@class='filterGridTwoSideTop']//span[contains(text(),'View All Referrals')]");

	// Business Group Address
	public By businessGroupAddressAll = By.xpath("//label[@for='chkg42BusinessGroupAddressAll']");
	public By businessGroupAddressAdd = By.xpath("//label[@for='chkg42BusinessGroupAddressAdd']");
	public By optionsMenuButton = By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']");
	public By editAddressOption = By.xpath("//span[normalize-space()='Edit']");
	public By deleteAddressOption = By.xpath("//span[normalize-space()='Delete']");
	public By shippingAddressCheckbox = By.xpath("//label[normalize-space()='Shipping Address']");
	public By confirmDeleteAddressButton = By.id("btnDeleteAddressConfirm");

	// Business Group Address
	public By streetField = By.id("BusinessGroup_Street");
	public By cityField = By.id("BusinessGroup_City");
	public By stateField = By.id("BusinessGroup_State");
	public By zipCodeField = By.id("BusinessGroup_ZipCode");
	public By businessGroupsPageLink = By.xpath("//tbody/tr[1]/td[4]/div[1]/a[2]/img[1]");
	public By detailsLink = By.xpath("//a[normalize-space()='Details']");

	// Business Group
	public By makePartnerButton = By.xpath("//a[@id='btnMakePartner']//*[name()='svg']");
	public By confirmDeleteBusinessGroupButton = By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']");
	public By businessGroupDeleteField = By.xpath("//label[@for='chkg42BusinessGroupDelete']");
	public By businessGroupNotesField = By.id("BusinessGroup_PrivateNotes");
	public By businessGroupEditField = By.xpath("//label[@for='chkg42BusinessGroupEdit']");
	public By businessGroupAllField = By.xpath("//label[@for='chkg42BusinessGroupAll']");
	public By businessGroupAddField = By.xpath("//label[@for='chkg42BusinessGroupAdd']");
	public By newBusinessGroupButton = By.xpath("//span[normalize-space()='New Business Group']");
	public By businessGroupNameField = By.id("BusinessGroup_Name");
	public By businessGroupPhoneField = By.id("BusinessGroup_PhoneNumber");
	public By businessGroupPhoneExtField = By.id("BusinessGroup_PhoneNumberExt");
	public By businessGroupEmailField = By.id("BusinessGroup_Email");
	public By businessGroupZoneField = By.id("BusinessGroup_Zone");
	public By saveBusinessGroupButton = By.id("btnSave");
	public By businessGroupRecordIcon = By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]");
	public By editBusinessGroupOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By deleteBusinessGroupOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	public By partnerBusinessGroupOption = By
			.xpath("//tbody/tr[1]/td[4]/div[1]/a[1]//*[name()='svg']//*[name()='path' and @id='Union_28']");

	// Provider EHR
	public By ehrTabLink = By.xpath("//a[normalize-space()='EHR']");
	public By newEhrButton = By.xpath("//span[normalize-space()='New EHR']");
	public By ehrDropdown = By.id("ddEHR");
	public By saveProviderEhrButton = By.id("btnSaveProviderEHR");
	public By ehrRecordIcon = By.xpath("//tbody/tr[1]/td[7]/div[1]/div[1]/button[1]/i[1]");
	public By editEhrOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By deleteEhrOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	public By ehrNotesField = By.id("ProviderEHR_Notes");
	public By confirmDeleteEhrButton = By.id("deleteProviderEHR");
	public By providerEHRAllField = By.xpath("//label[@for='chkg39ProviderEHRAll']");
	public By providerEHRAddField = By.xpath("//label[@for='chkg39ProviderEHRAdd']");

	// Provider Service
	public By serviceTabLink = By.xpath("//a[normalize-space()='Service']");
	public By serviceRecordIcon = By.xpath("//th[@scope='col']//i[@class='fa-solid fa-ellipsis-vertical']");
	public By newServiceButton = By.xpath("//span[normalize-space()='New Service']");
	public By serviceDropdownInput = By
			.xpath("//div[@class='model-inp select-city-dd dropdowncheckbox']//input[@type='text']");
	public By serviceDropdownOption = By.xpath("//div[@class='model-inp select-city-dd dropdowncheckbox']//ul/li[2]");
	public By saveProviderServiceButton = By.id("btnSaveProviderService");
	public By editServiceOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//a[@class='tooltiped txt-decor-none user-access']//div[@class='gridRecordContextInner']");
	public By deleteServiceOption = By
			.xpath("//a[@id='btnDeleteProviderService']//div[@class='gridRecordContextInner']");
	public By serviceNotesField = By.id("Service_Notes");
	public By confirmDeleteServiceButton = By.id("deleteProviderService");

	// Provider Executive
	public By executivesTabLink = By.xpath("//a[normalize-space()='Executives']");
	public By executiveRecordButton = By.xpath("//tbody/tr/td[9]/div[1]/div[1]/button[1]/i[1]");
	public By resetPasswordOption = By.xpath("//span[normalize-space()='Reset Password']");
	public By newPasswordField = By.id("newPassword");
	public By confirmPasswordField = By.id("confirmPassword");
	public By resetPasswordButton = By.id("btnResetPassword");

	// DeDupe
	public By providerDeDupeAllLabel = By.xpath("//label[@for='chkg35ProviderDeDupeAll']");
	public By errorHeader = By.xpath("//h2[normalize-space()='Error']");
	public By doctorLastNameCheckbox = By.xpath("//label[normalize-space()='Doctor Last Name']");
	public By doctorFirstNameCheckbox = By.xpath("//label[normalize-space()='Doctor First Name']");
	public By findDuplicateButton = By.xpath("//span[normalize-space()='Find Duplicate']");
	public By firstDuplicateCheckbox = By.xpath("(//label[starts-with(@for,'ckhg_')])[1]");
	public By secondDuplicateCheckbox = By.xpath("(//label[starts-with(@for,'ckhg_')])[2]");
	public By mergeButton = By.xpath("//table[1]//thead[1]//tr[1]//th[9]//a[1]");
	public By firstRecordCheckbox = By.xpath("(//input[starts-with(@id,'chkg_')])[1]");
	public By nextButton = By.xpath("//a[normalize-space()='Next']");
	public By finishButton = By.xpath("//a[normalize-space()='Finish']");

	// Referral Patient History
	public By historyTabLink = By.xpath("//a[normalize-space()='History']");
	public By referralHistoryDownloadIcon = By.xpath("//img[@class='mr-2']");

	// Bucket
	public By fileUploadInput = By.id("file-3");
	public By saveFileButton = By.id("btnSaveFile");
	public By fileNameTextBox = By.id("fileNameTextBox");
	public By confirmDeleteFileButton = By.id("btnDeleteFileConfirm");
	public By favouriteFileLocator = By.xpath("//img[contains(@src,'bookmark')]");
	public By viewFolderIcon = By.xpath("//*[name()='path' and contains(@d,'M575.8 255')]");
	public By editFolderLocator = By
			.xpath("//td[@class='text-right']//a[@class='tooltiped txt-decor-none user-access']//img");
	public By deleteFolderLocator = By.xpath("//a[@id='btnDeleteFolder']//img");
	public By favouriteFolderLocator = By.xpath("//img[@src='/Content/img/black-bookmark.png']");
	public By providersPageLink = By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]");
	public By bucketFolderLocator = By.id("0f8dcc97-695d-4f62-9ad1-6b43157cb7fe");
	public By addFolderButton = By.id("btnAddFolder");
	public By folderNameField = By.id("BucketFolder_FolderName");
	public By saveFolderButton = By.id("btnSave");
	public By editFolderIcon = By.xpath("//tbody/tr[5]/td[2]/a[1]/img[1]");
	public By deleteFolderIcon = By.xpath("//tbody/tr[5]/td[2]/a[2]/img[1]");
	public By confirmDeleteFolderButton = By.xpath("//div[@id='deleteFolderModel']//button[@id='btnDeleteConfirm']");
	public By favouriteFolderIcon = By.xpath("//tbody/tr[5]/td[1]/a[1]/img[1]");
	public By bucketFolderLink = By.id("42862eaa-0885-47aa-b59b-dd695a8da2dc");
	public By addFileButton = By.id("btnAddFile");
	public By editFileIcon = By.xpath("//tbody/tr[2]/td[2]/a[1]/img[1]");
	public By deleteFileIcon = By.xpath("//a[@id='btnDeleteFile']//img");
	public By favouriteFileIcon = By.xpath("//img[@src='/Content/img/black-bookmark.png']");
	public By downloadFileIcon = By.xpath("//tbody//tr//a[3]//*[name()='svg']");
	public By viewFileIcon = By.xpath("//img[@class='edit']");

	// Referral Enrollment
	public By referralEnrollmentLink = By.xpath("//a[normalize-space()='Referral Enrollment']");
	public By newReferralEnrollmentButton = By.xpath("//span[normalize-space()='New Referral Enrollment']");
	public By startDateField = By.id("ProviderReferralEnrollment_StartDate");
	public By specificDate = By.xpath("//td[@data-month='1' and @data-year='2026']/a[text()='11']");
	public By saveReferralEnrollmentButton = By.id("btnSaveProviderReferralEnrollmentPopup");
	public By referralEnrollmentOptionsMenu = By.xpath("//tbody/tr/td[8]/div[1]/div[1]/button[1]/i[1]");
	public By referralEnrollmentEditOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By referralEnrollmentDeleteOption = By
			.xpath("//a[@id='btnDeleteProviderReferralEnrollment']//span[contains(text(),'Delete')]");
	public By referralEnrollmentNotesField = By.id("ProviderReferralEnrollment_Notes");
	public By confirmDeleteReferralEnrollmentButton = By.id("deleteProviderReferralEnrollment");
	public By providerReferralEnrollmentAllField = By.xpath("//label[@for='chkg20ProviderReferralEnrollmentAll']");
	public By providerReferralEnrollmentAddField = By.xpath("//label[@for='chkg20ProviderReferralEnrollmentAdd']");

	// Executives
	public By confirmDeleteButton = By.id("deleteProviderExecutive");
	public By productServiceField = By.id("ProviderExecutive_ProductService");
	public By executivesAllLabel = By.xpath("//label[@for='chkg20ExecutivesAll']");
	public By executiveAddLabel = By.xpath("//label[@for='chkg20ExecutiveAdd']");
	public By optionsMenuIcon = By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']");
	public By editOption = By.xpath("//span[normalize-space()='Edit']");
	public By deleteOption = By.xpath("//span[normalize-space()='Delete']");
	public By newExecutiveButton = By.xpath("//span[normalize-space()='New Executive']");
	public By lastNameField = By.id("ProviderExecutive_LastName");
	public By firstNameField = By.id("ProviderExecutive_FirstName");
	public By emailField = By.id("ProviderExecutive_EmailId");
	public By profileDropdown = By.id("ProviderExecutive_ProfileId");
	public By saveExecutiveButton = By.id("btnSaveProviderExecutivePopup");
	public By firstRowViewIcon = By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]");
	public By executivesLink = By.xpath("//a[normalize-space()='Executives']");

	// Referrals
	public By exportToExcelButton = By.xpath("//span[normalize-space()='Export to Excel']");

	// Provider Communication
	public By deleteProviderCommunicationConfirmButton = By.id("deleteproviderCommunication");
	public By deleteProviderCommunicationOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	public By providerCommunicationDropdownButton = By.xpath("//tbody/tr[1]/td[11]/div[1]/div[1]/button[1]/i[1]");
	public By editProviderCommunicationOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By providerCommunicationTab = By.xpath("//a[normalize-space()='Provider Communication']");
	public By newCommunicationButton = By.xpath("//span[normalize-space()='New Communication']");
	public By providerCommunicationDescriptionField = By.id("ProviderCommunication_Description");
	public By saveCommunicationButton = By.id("btnSaveCommunication");

	// Provider Address
	public By deleteAddressConfirmButton = By.id("btnDeleteAddressConfirm");
	public By providerFrontDeskNameField = By.id("ProviderAddress_FrontDeskName");
	public By deleteProviderAddressOption = By.xpath("//span[normalize-space()='Delete']");
	public By providerAddressDropdownButton = By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']");
	public By editProviderAddressOption = By.xpath("//span[normalize-space()='Edit']");
	public By newAddressButton = By.xpath("//span[normalize-space()='New Address']");
	public By providerStreetField = By.id("ProviderAddress_Street");
	public By providerCityField = By.id("ProviderAddress_City");
	public By providerStateField = By.id("ProviderAddress_State");
	public By providerZipCodeField = By.id("ProviderAddress_ZipCode");
	public By providerContactNumberField = By.id("ProviderAddress_ContactNumber1");
	public By saveAddressButton = By.id("btnSaveAddress");

	// Provider
	public By deleteConfirmButton = By.xpath("//div[@class='filter-btn']//button[@id='btnDeleteConfirm']");
	public By providerDropdownButton = By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/button[1]/i[1]");
	public By providerCellPhoneField = By.id("Provider_CellPhone");
	public By providerEditDropdownButton = By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/button[1]/i[1]");
	public By providerEditOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By providerDetailsIcon = By.xpath("//tbody/tr[1]/td[13]/div[1]/a[1]/img[1]");
	public By deleteProviderOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	public By editProviderOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By newProviderButton = By.xpath("//span[normalize-space()='New Provider']");
	public By providerLastNameField = By.id("Provider_DoctorLastName");
	public By providerFirstNameField = By.id("Provider_DoctorFirstName");
	public By providerZoneField = By.id("Provider_Zone");
	public By providerNpiNumberField = By.id("Provider_NPINumber");
	public By providerSaveButton = By.id("btnSave");

	// Text
	public By sendVCardButton = By.xpath("//span[normalize-space()='Send VCard']");
	public By vCardPhoneNumberField = By.id("vCardPhoneNumber");
	public By vCardBodyField = By.id("vcardBody");
	public By sendVCardSubmitButton = By.id("btnSendVCard");
	public By quickTextButton = By.xpath("//span[normalize-space()='Quick Text']");
	public By providerNameFilter = By.id("Filter_Provider_Name");
	public By searchButtontext = By.xpath("//button[normalize-space()='Search']");
	public By newProviderDropdown = By.id("newProviderId");
	public By newProviderExecutiveDropdown = By.id("newProviderExecutiveId");
	public By newPhoneNumberField = By.id("newPhoneNumber");
	public By saveButton = By.id("btnSave");

	// NPI Request
	public By approveNpiRequestButton = By.xpath("//tbody/tr[1]/td[5]/div[1]/a[1]/button[1]/i[1]");

	// Demand Request
	public By demandRequestErrorHeader = By.xpath("//h2[normalize-space()='Error']");

	// Callback Request
	public By callbackRequestErrorHeader = By.xpath("//h2[normalize-space()='Error']");

	// Audit View
	public By updatedBy = By.xpath("//div[normalize-space()='Updated By']");
	public By updatedDate = By.xpath("//a[normalize-space()='Updated Date']");
	public By updatedByLink = By.xpath("//a[normalize-space()='Updated By']");
	public By updatedDateLink = By.xpath("//a[normalize-space()='Updated Date']");

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

	// Providers Management
	public String validateCheckbox() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(findDuplicateButton)).click();
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
			String actualMessage = toast.getText().trim();
			return "SUCCESS: Validation displayed -> " + actualMessage;
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String validateDocumentLibraryAddFolderSubmission() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(viewIcon)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(documentLibraryTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(addFolderButtonDocumet)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
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

	public String validateReferralEnrollmentPhoneEmailFax() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(viewIcon)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(referralEnrollmentLink)).click();
		wait.until(ExpectedConditions.elementToBeClickable(newReferralEnrollmentText)).click();
		Thread.sleep(2000);
		String phoneNumber = Hooks.prop.getProperty("phonenumber");
		String email = Hooks.prop.getProperty("email");
		String faxNumber = Hooks.prop.getProperty("faxnumber");
		wait.until(ExpectedConditions.elementToBeClickable(phoneNumberField)).sendKeys(phoneNumber);
		wait.until(ExpectedConditions.elementToBeClickable(emailIdField)).sendKeys(email);
		wait.until(ExpectedConditions.elementToBeClickable(faxNumberField)).sendKeys(faxNumber);
		System.out.println("Phone: " + phoneNumber);
		System.out.println("Email: " + email);
		System.out.println("Fax: " + faxNumber);
		Hooks.scenario.log("Phone: " + phoneNumber);
		Hooks.scenario.log("Email: " + email);
		Hooks.scenario.log("Fax: " + faxNumber);
		wait.until(ExpectedConditions.elementToBeClickable(saveProviderReferralEnrollmentButton)).click();
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

	public String validateReferralEnrollmentFormOnEmptySubmission() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(viewIcon)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(referralEnrollmentLink)).click();
		wait.until(ExpectedConditions.elementToBeClickable(newReferralEnrollmentText)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveProviderReferralEnrollmentButton)).click();
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
			String actualMessage = toast.getText().trim();
			return "SUCCESS: Validation displayed -> " + actualMessage;
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String validateProviderCommunicationFormOnEmptySubmission() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(viewIcon)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(providerCommunicationLink)).click();
		wait.until(ExpectedConditions.elementToBeClickable(newCommunicationSpan)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveCommunicationButtonProvider)).click();
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
			String actualMessage = toast.getText().trim();
			return "SUCCESS: Validation displayed -> " + actualMessage;
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String shouldShowValidationForBlankAddProviderEHRForm() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(viewIcon)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(ehrLink)).click();
		wait.until(ExpectedConditions.elementToBeClickable(newEhrSpan)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveProviderEhrButton)).click();
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
			String actualMessage = toast.getText().trim();
			return "SUCCESS: Validation displayed -> " + actualMessage;
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String checkBlankServiceFormFields() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(viewIcon)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(serviceLink)).click();
		wait.until(ExpectedConditions.elementToBeClickable(newServiceSpan)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveProviderServiceButton)).click();
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
			String actualMessage = toast.getText().trim();
			return "SUCCESS: Validation displayed -> " + actualMessage;
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String checkInvalidExecutiveInputs() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(viewIcon)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(executivesTabLink)).click();
		wait.until(ExpectedConditions.elementToBeClickable(newExecutiveButton)).click();
		Thread.sleep(2000);
		String lastName = Hooks.prop.getProperty("provider_lastname");
		String firstName = Hooks.prop.getProperty("provider_firstname");
		String email = Hooks.prop.getProperty("provider_email");
		String phone = Hooks.prop.getProperty("provider_phone");
		String cell = Hooks.prop.getProperty("provider_cell");
		String extension = Hooks.prop.getProperty("provider_extension");
		String fax = Hooks.prop.getProperty("provider_fax");
		String designation = Hooks.prop.getProperty("provider_designation");
		wait.until(ExpectedConditions.elementToBeClickable(providerExecutiveLastNameField)).sendKeys(lastName);
		wait.until(ExpectedConditions.elementToBeClickable(providerExecutiveFirstNameField)).sendKeys(firstName);
		wait.until(ExpectedConditions.elementToBeClickable(providerExecutiveEmailField)).sendKeys(email);
		wait.until(ExpectedConditions.elementToBeClickable(providerExecutivePhoneNumberField)).sendKeys(phone);
		wait.until(ExpectedConditions.elementToBeClickable(providerExecutiveCellNumberField)).sendKeys(cell);
		wait.until(ExpectedConditions.elementToBeClickable(providerExecutivePhoneExtensionField)).sendKeys(extension);
		wait.until(ExpectedConditions.elementToBeClickable(providerExecutiveFaxNumberField)).sendKeys(fax);
		wait.until(ExpectedConditions.elementToBeClickable(providerExecutiveDesignationField)).sendKeys(designation);
		Hooks.scenario.log("Provider Executive Details Entered Successfully");
		wait.until(ExpectedConditions.elementToBeClickable(saveAddressButtonProvider)).click();
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
			String actualMessage = toast.getText().trim();
			return "SUCCESS: Validation displayed -> " + actualMessage;
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String isExecutiveFormValid() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(viewIcon)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(executivesTabLink)).click();
		wait.until(ExpectedConditions.elementToBeClickable(newExecutiveButton)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveProviderExecutiveButton)).click();
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
			String actualMessage = toast.getText().trim();
			return "SUCCESS: Validation displayed -> " + actualMessage;
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String isProviderContactNumberValid() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(viewIcon)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(newAddressButton)).click();
		Thread.sleep(2000);
		String street = Hooks.prop.getProperty("provider_street");
		String city = Hooks.prop.getProperty("provider_city");
		String state = Hooks.prop.getProperty("provider_state");
		String zip = Hooks.prop.getProperty("provider_zip");
		String contact1 = Hooks.prop.getProperty("provider_contact1");
		String contact2 = Hooks.prop.getProperty("provider_contact2");
		wait.until(ExpectedConditions.elementToBeClickable(streetFieldProvider)).sendKeys(street);
		wait.until(ExpectedConditions.elementToBeClickable(cityFieldProvider)).sendKeys(city);
		wait.until(ExpectedConditions.elementToBeClickable(stateFieldProvider)).sendKeys(state);
		wait.until(ExpectedConditions.elementToBeClickable(zipCodeFieldProvider)).sendKeys(zip);
		wait.until(ExpectedConditions.elementToBeClickable(contactNumber1FieldProvider)).sendKeys(contact1);
		wait.until(ExpectedConditions.elementToBeClickable(contactNumber2FieldProvider)).sendKeys(contact2);
		Hooks.scenario.log("Provider Address Details Entered Successfully");
		wait.until(ExpectedConditions.elementToBeClickable(saveAddressButtonProvider)).click();
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
			String actualMessage = toast.getText().trim();
			return "SUCCESS: Validation displayed -> " + actualMessage;
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String checkBlankAddressField() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(viewIcon)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(newAddressButton)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveAddressButtonProvider)).click();
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
			String actualMessage = toast.getText().trim();
			return "SUCCESS: Validation displayed -> " + actualMessage;
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String checkBlankBusinessGroupZone() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newProviderTab)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(businessGroupImage)).click();
		Thread.sleep(2000);
		String profileName = Hooks.prop.getProperty("profile_name");
		wait.until(ExpectedConditions.elementToBeClickable(profileNameInput)).sendKeys(profileName);
		Hooks.scenario.log("Profile Name Entered: " + profileName);
		wait.until(ExpectedConditions.elementToBeClickable(addNewBusinessGroupButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBusinessGroupButton)).click();

		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
			String actualMessage = toast.getText().trim();
			return "SUCCESS: Validation displayed -> " + actualMessage;
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String checkBusinessGroupBlankSearch() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newProviderTab)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(businessGroupImage)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(searchButtontext)).click();
		wait.until(ExpectedConditions.elementToBeClickable(addNewBusinessGroupButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitBusinessGroupButton)).click();
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
			String actualMessage = toast.getText().trim();
			return "SUCCESS: Validation displayed -> " + actualMessage;
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String checkInvalidProviderFilterFields() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(searchCollapseIcon)).click();
		Thread.sleep(2000);
		String invalidEmail = Hooks.prop.getProperty("invalid_email");
		String invalidExecutiveEmail = Hooks.prop.getProperty("invalid_executive_email");
		String invalidZip = Hooks.prop.getProperty("invalid_zip");
		String invalidPhone = Hooks.prop.getProperty("invalid_phone");
		String invalidFax = Hooks.prop.getProperty("invalid_fax");
		wait.until(ExpectedConditions.elementToBeClickable(filterEmail)).sendKeys(invalidEmail);
		wait.until(ExpectedConditions.elementToBeClickable(filterExecutiveEmail)).sendKeys(invalidExecutiveEmail);
		wait.until(ExpectedConditions.elementToBeClickable(filterZipCode)).sendKeys(invalidZip);
		wait.until(ExpectedConditions.elementToBeClickable(filterPhoneNumber)).sendKeys(invalidPhone);
		wait.until(ExpectedConditions.elementToBeClickable(filterFaxNumber)).sendKeys(invalidFax);
		Hooks.scenario.log("Invalid filter values entered successfully");
		wait.until(ExpectedConditions.elementToBeClickable(searchIcon)).click();
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
			String actualMessage = toast.getText().trim();
			return "SUCCESS: Validation displayed -> " + actualMessage;
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String isProviderSearchFilterValid() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(searchCollapseIcon)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(searchIcon)).click();
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
			String actualMessage = toast.getText().trim();
			return "SUCCESS: Validation displayed -> " + actualMessage;
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String isProviderPhoneNumberValid() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newProviderTab)).click();
		Thread.sleep(2000);
		String doctorLast = Hooks.prop.getProperty("doctor_lastname");
		String doctorFirst = Hooks.prop.getProperty("doctor_firstname");
		String zone = Hooks.prop.getProperty("provider_zone");
		String npi = Hooks.prop.getProperty("provider_npi");
		String phone1 = Hooks.prop.getProperty("business_phone1");
		String phone2 = Hooks.prop.getProperty("business_phone2");
		String cell = Hooks.prop.getProperty("cell_phone");
		wait.until(ExpectedConditions.elementToBeClickable(doctorLastName)).sendKeys(doctorLast);
		wait.until(ExpectedConditions.elementToBeClickable(doctorFirstName)).sendKeys(doctorFirst);
		wait.until(ExpectedConditions.elementToBeClickable(providerZone)).sendKeys(zone);
		wait.until(ExpectedConditions.elementToBeClickable(providerNPI)).sendKeys(npi);
		wait.until(ExpectedConditions.elementToBeClickable(businessPhone1)).sendKeys(phone1);
		wait.until(ExpectedConditions.elementToBeClickable(businessPhone2)).sendKeys(phone2);
		wait.until(ExpectedConditions.elementToBeClickable(cellPhone)).sendKeys(cell);
		Hooks.scenario.log("Doctor & Provider details entered successfully");
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
			String actualMessage = toast.getText().trim();
			return "SUCCESS: Validation displayed -> " + actualMessage;
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String validateProviderEmail() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newProviderTab)).click();
		Thread.sleep(2000);
		String doctorLast = Hooks.prop.getProperty("doctor_lastname");
		String doctorFirst = Hooks.prop.getProperty("doctor_firstname");
		String zone = Hooks.prop.getProperty("provider_zone");
		String npi = Hooks.prop.getProperty("provider_npi");
		String primaryInvalidEmail = Hooks.prop.getProperty("invalid_primary_email");
		String secondaryInvalidEmail = Hooks.prop.getProperty("invalid_secondary_email");
		wait.until(ExpectedConditions.elementToBeClickable(doctorLastName)).sendKeys(doctorLast);
		wait.until(ExpectedConditions.elementToBeClickable(doctorFirstName)).sendKeys(doctorFirst);
		wait.until(ExpectedConditions.elementToBeClickable(providerZone)).sendKeys(zone);
		wait.until(ExpectedConditions.elementToBeClickable(providerNPI)).sendKeys(npi);
		wait.until(ExpectedConditions.elementToBeClickable(primaryEmail)).sendKeys(primaryInvalidEmail);
		wait.until(ExpectedConditions.elementToBeClickable(secondaryEmail)).sendKeys(secondaryInvalidEmail);
		Hooks.scenario.log("Doctor details with invalid emails entered successfully");
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
			String actualMessage = toast.getText().trim();
			return "SUCCESS: Validation displayed -> " + actualMessage;
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String isNpiNumberValid() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newProviderTab)).click();
		Thread.sleep(2000);
		String doctorLast = Hooks.prop.getProperty("doctor_lastname");
		String doctorFirst = Hooks.prop.getProperty("doctor_firstname");
		String zone = Hooks.prop.getProperty("provider_zone");
		String invalidNpi = Hooks.prop.getProperty("invalid_provider_npi");
		wait.until(ExpectedConditions.elementToBeClickable(doctorLastName)).sendKeys(doctorLast);
		wait.until(ExpectedConditions.elementToBeClickable(doctorFirstName)).sendKeys(doctorFirst);
		wait.until(ExpectedConditions.elementToBeClickable(providerZone)).sendKeys(zone);
		wait.until(ExpectedConditions.elementToBeClickable(providerNPI)).sendKeys(invalidNpi);
		Hooks.scenario.log("Doctor details entered with invalid NPI");
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
			String actualMessage = toast.getText().trim();
			return "SUCCESS: Validation displayed -> " + actualMessage;
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String validateNewProviderNotEmpty() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newProviderTab)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
			String actualMessage = toast.getText().trim();
			return "SUCCESS: Validation displayed -> " + actualMessage;
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String validateInvalidPhoneNumber() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(sendVCardTab)).click();
		Thread.sleep(2000);
		WebElement phoneField = wait.until(ExpectedConditions.elementToBeClickable(vCardPhoneNumber));
		String phone = Hooks.prop.getProperty("invalid_phone");
		phoneField.clear();
		phoneField.sendKeys(phone);
		Hooks.scenario.log("Phone number entered: " + phone);
		wait.until(ExpectedConditions.elementToBeClickable(sendVCardSubmitButton)).click();
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
			String actualMessage = toast.getText().trim();
			return "SUCCESS: Validation displayed -> " + actualMessage;
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String validateVCardNotEmptyOnSend() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(sendVCardTab)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(sendVCardSubmitButton)).click();
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
			String actualMessage = toast.getText().trim();
			return "SUCCESS: Validation displayed -> " + actualMessage;
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String isQuickTextSendValid() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(quickTextTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
			String actualMessage = toast.getText().trim();
			return "SUCCESS: Validation displayed -> " + actualMessage;
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	public String validateBlankQuickTextField() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(quickTextTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(searchButtonQuickText)).click();
		String expectedMessage = "please enter \"Business Name\", \"First Name\" or \"Last Name\" to search provider.";
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
			String actualMessage = toast.getText().trim();
			if (actualMessage.equalsIgnoreCase(expectedMessage)) {
				return "SUCCESS: Validation displayed -> " + actualMessage;
			} else {
				return "ERROR: Validation message mismatch -> " + actualMessage;
			}
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message not displayed";
		}
	}

	// BusinessGroup
	public String validateInvalidBusinessGroupAddressFields() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement viewBtn = wait.until(ExpectedConditions.elementToBeClickable(viewButton));
		try {
			viewBtn.click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", viewBtn);
		}
		WebElement newAddressBtn = wait.until(ExpectedConditions.elementToBeClickable(newAddressButton));
		try {
			newAddressBtn.click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", newAddressBtn);
		}
		driver.findElement(streetField).sendKeys(Hooks.prop.getProperty("address.street"));
		driver.findElement(cityField).sendKeys(Hooks.prop.getProperty("address.city"));
		driver.findElement(stateField).sendKeys(Hooks.prop.getProperty("address.state"));
		driver.findElement(frontDeskNameField).sendKeys(Hooks.prop.getProperty("frontdesk.name"));
		driver.findElement(zipCodeField).sendKeys(Hooks.prop.getProperty("address.zip.invalid"));
		driver.findElement(contactNumber1Field).sendKeys(Hooks.prop.getProperty("contact.number1"));
		driver.findElement(contactNumber2Field).sendKeys(Hooks.prop.getProperty("contact.number2"));
		driver.findElement(faxField).sendKeys(Hooks.prop.getProperty("fax.invalid"));
		WebElement saveBtn = wait.until(ExpectedConditions.elementToBeClickable(saveAddressButton));
		try {
			saveBtn.click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveBtn);
		}
		List<String> errorMessages = new ArrayList<>();
		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(toastMessages));

			for (WebElement toast : toasts) {
				String msg = toast.getText().trim();
				if (!msg.isEmpty()) {
					errorMessages.add(msg.toLowerCase());
				}
			}
		} catch (TimeoutException ignored) {
		}
		List<WebElement> fieldErrorElements = driver.findElements(fieldErrors);

		for (WebElement error : fieldErrorElements) {
			String msg = error.getText().trim();
			if (!msg.isEmpty()) {
				errorMessages.add(msg.toLowerCase());
			}
		}
		List<String> missingFields = new ArrayList<>();
		if (errorMessages.stream().noneMatch(msg -> msg.contains("fax")))
			missingFields.add("Fax");
		if (errorMessages.stream().noneMatch(msg -> msg.contains("contact number1") || msg.contains("contact 1")))
			missingFields.add("Contact Number1");
		if (errorMessages.stream().noneMatch(msg -> msg.contains("contact number2") || msg.contains("contact 2")))
			missingFields.add("Contact Number2");
		if (errorMessages.stream().noneMatch(msg -> msg.contains("zip") || msg.contains("postal")))
			missingFields.add("Zip Code");
		if (missingFields.isEmpty()) {
			return "SUCCESS: All invalid digit-length validations displayed correctly.";
		}
		return "MISSING INVALID VALIDATIONS FOR: " + String.join(", ", missingFields);
	}

	public String validateRequiredAddressFieldsFromViewPage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement viewBtn = wait.until(ExpectedConditions.elementToBeClickable(viewButton));
		try {
			viewBtn.click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", viewBtn);
		}
		WebElement newAddressBtn = wait.until(ExpectedConditions.elementToBeClickable(newAddressButton));
		try {
			newAddressBtn.click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", newAddressBtn);
		}
		WebElement saveAddressBtn = wait.until(ExpectedConditions.elementToBeClickable(saveAddressButton));
		try {
			saveAddressBtn.click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveAddressBtn);
		}
		List<String> errorMessages = new ArrayList<>();
		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(toastMessages));

			for (WebElement toast : toasts) {
				String msg = toast.getText().trim();
				if (!msg.isEmpty()) {
					errorMessages.add(msg.toLowerCase());
				}
			}
		} catch (TimeoutException ignored) {
		}
		List<WebElement> fieldErrorElements = driver.findElements(fieldErrors);

		for (WebElement error : fieldErrorElements) {
			String msg = error.getText().trim();
			if (!msg.isEmpty()) {
				errorMessages.add(msg.toLowerCase());
			}
		}
		List<String> missingFields = new ArrayList<>();
		if (errorMessages.stream().noneMatch(msg -> msg.contains("street")))
			missingFields.add("Street");
		if (errorMessages.stream().noneMatch(msg -> msg.contains("city")))
			missingFields.add("City");
		if (errorMessages.stream().noneMatch(msg -> msg.contains("state")))
			missingFields.add("State");
		if (errorMessages.stream().noneMatch(msg -> msg.contains("zip") || msg.contains("postal")))
			missingFields.add("Zip Code");
		if (errorMessages.stream().noneMatch(msg -> msg.contains("contact")))
			missingFields.add("Contact Number1");
		if (missingFields.isEmpty()) {
			return "SUCCESS: All required address field validations displayed.";
		}
		return "MISSING VALIDATIONS FOR: " + String.join(", ", missingFields);
	}

	public String filterWithBlankBusinessGroupNameAndValidate() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement filter = wait.until(ExpectedConditions.elementToBeClickable(filterIcon));
		try {
			filter.click();
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", filter);
		}
		WebElement searchBtn = driver.findElement(searchButton);

		try {
			searchBtn.click();
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", searchBtn);
		}
		List<String> errorMessages = new ArrayList<>();
		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(toastMessages));
			for (WebElement toast : toasts) {
				String msg = toast.getText().trim();
				if (!msg.isEmpty()) {
					errorMessages.add(msg);
				}
			}
		} catch (TimeoutException ignored) {
			System.out.println("No toast validation message appeared.");
		}
		if (!errorMessages.isEmpty()) {
			return "VALIDATION DISPLAYED: " + String.join(" | ", errorMessages);
		}
		return "NO VALIDATION MESSAGE DISPLAYED";
	}

	public String clickOnSaveButtonAndGetValidationMessages() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		WebElement saveBtn = wait.until(ExpectedConditions.presenceOfElementLocated(saveButton));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(saveBtn)).click();
			System.out.println("Save button clicked successfully");
		} catch (ElementClickInterceptedException e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", saveBtn);
			System.out.println("Save button clicked using JS");
		}
		List<String> errorMessages = new ArrayList<>();
		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(toastMessages));

			for (WebElement toast : toasts) {
				String msg = toast.getText().trim();
				if (!msg.isEmpty()) {
					errorMessages.add(msg);
				}
			}
		} catch (TimeoutException ignored) {
		}
		List<WebElement> fieldErrorElements = driver.findElements(fieldErrors);

		for (WebElement error : fieldErrorElements) {
			String msg = error.getText().trim();
			if (!msg.isEmpty()) {
				errorMessages.add(msg);
			}
		}
		boolean emailError = errorMessages.stream().anyMatch(msg -> msg.toLowerCase().contains("email"));
		boolean zoneError = errorMessages.stream().anyMatch(msg -> msg.toLowerCase().contains("zone"));
		boolean phoneError = errorMessages.stream().anyMatch(msg -> msg.toLowerCase().contains("phone"));
		boolean businessGroupError = errorMessages.stream()
				.anyMatch(msg -> msg.toLowerCase().contains("business group"));
		if (emailError && zoneError && phoneError && businessGroupError) {
			return "ERRORS: All required field validations displayed -> " + String.join(" | ", errorMessages);
		}
		return "ERROR: Required field validations missing -> " + String.join(" | ", errorMessages);
	}

	public String enterBusinessGroupDetailsWithInvalidEmailAndValidate() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(businessGroupName)).sendKeys("Test Business Group");
		driver.findElement(phoneNumber).sendKeys(Hooks.prop.getProperty("phone.valid"));
		driver.findElement(phoneExtension).sendKeys(Hooks.prop.getProperty("phone.extension"));
		driver.findElement(emailField).sendKeys(Hooks.prop.getProperty("email.invalid"));
		driver.findElement(zoneField).sendKeys(Hooks.prop.getProperty("provider.zone"));
		WebElement saveBtn = driver.findElement(saveButton);
		try {
			saveBtn.click();
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", saveBtn);
		}
		List<String> errorMessages = new ArrayList<>();
		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(toastMessages));

			for (WebElement toast : toasts) {
				String msg = toast.getText().trim();
				if (!msg.isEmpty()) {
					errorMessages.add(msg);
				}
			}

		} catch (TimeoutException ignored) {
			System.out.println("No toast validation message appeared.");
		}

		if (!errorMessages.isEmpty()) {
			return "Toast Validation Message: " + String.join(" | ", errorMessages);
		}
		return "No validation message displayed on UI";
	}

	public String enterBusinessGroupDetailsWithInvalidPhoneAndValidate() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(businessGroupName))
				.sendKeys(Hooks.prop.getProperty("business.group.name"));
		driver.findElement(phoneNumber).sendKeys(Hooks.prop.getProperty("contact.phone.invalid"));
		driver.findElement(phoneExtension).sendKeys(Hooks.prop.getProperty("contact.extension"));
		driver.findElement(emailField).sendKeys(Hooks.prop.getProperty("contact.email.valid"));
		driver.findElement(zoneField).sendKeys(Hooks.prop.getProperty("provider.zone"));
		WebElement saveBtn = driver.findElement(saveButton);
		try {
			saveBtn.click();
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", saveBtn);
		}
		List<String> errorMessages = new ArrayList<>();
		try {
			List<WebElement> toasts = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(toastMessages));

			for (WebElement toast : toasts) {
				String msg = toast.getText().trim();
				if (!msg.isEmpty()) {
					errorMessages.add(msg);
				}
			}

		} catch (TimeoutException ignored) {
			System.out.println("No toast validation message appeared.");
		}
		if (!errorMessages.isEmpty()) {
			return "Toast Validation Message: " + String.join(" | ", errorMessages);
		}
		return "No validation message displayed for invalid phone number";
	}

	// Provider Template
	public void verifyUserCannotAddProviderTemplate() {
		sleep(3000);
		assertElementNotPresent(newProviderTemplateButton);
	}

	public void verifyUserCanDeleteProviderTemplate() {
		sleep(3000);
		clickWhenClickable(providerTemplateOptionsButton);
		sleep(2000);
		clickWhenClickable(deleteProviderTemplateOption);
		sleep(2000);
		clickWhenClickable(confirmDeleteProviderTemplateButton);
	}

	public void createProfileViewDeleteOnlyProviderTemplate() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCanEditProviderTemplate() {
		sleep(3000);
		clickWhenClickable(providerTemplateOptionsButton);
		sleep(2000);
		clickWhenClickable(editProviderTemplateOption);
		sleep(3000);
		driver.findElement(providerTemplateNameField).sendKeys(Hooks.prop.getProperty("provider.template.name"));
		clickWhenClickable(saveProviderTemplateButton);
	}

	public void createProfileViewEditOnlyProviderTemplate() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotDeleteProviderTemplate() {
		sleep(3000);
		clickWhenClickable(providerTemplateOptionsButton);
		sleep(2000);
		assertElementNotPresent(deleteProviderTemplateOption);
	}

	public void verifyUserCannotEditProviderTemplate() {
		sleep(3000);
		clickWhenClickable(providerTemplateOptionsButton);
		sleep(2000);
		assertElementNotPresent(editProviderTemplateOption);
	}

	public void verifyUserCanAddProviderTemplate() {
		sleep(1000);
		clickWhenClickable(newProviderTemplateButton);
		sleep(1000);
		driver.findElement(providerTemplateNameField).sendKeys(Hooks.prop.getProperty("provider.template.name"));
		clickWhenClickable(saveProviderTemplateButton);
	}

	public void openTemplatesPage(String fullCategoriesUrl) {
		driver.get(fullCategoriesUrl);
	}

	public void createProfileViewAddOnlyProviderTemplate() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Service
	public void verifyUserCanDeleteService() {
		sleep(3000);
		clickWhenClickable(serviceOptionsButton);
		sleep(2000);
		clickWhenClickable(deleteServiceOption);
		sleep(2000);
		clickWhenClickable(confirmDeleteServiceButton);
	}

	public void createProfileViewDeleteOnlyService() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddService() {
		sleep(3000);
		assertElementNotPresent(newProviderServiceButton);
	}

	public void verifyUserCanEditService() {
		sleep(3000);
		clickWhenClickable(serviceOptionsButton);
		sleep(2000);
		clickWhenClickable(editServiceOption);
		sleep(3000);
		driver.findElement(serviceNameField).sendKeys(Hooks.prop.getProperty("service.name"));
		clickWhenClickable(saveServiceButton);
	}

	public void createProfileViewEditOnlyService() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotDeleteService() {
		sleep(1000);
		clickWhenClickable(serviceOptionsButton);
		sleep(1000);
		assertElementNotPresent(deleteServiceOption);
	}

	public void verifyUserCannotEditService() {
		sleep(3000);
		clickWhenClickable(serviceOptionsButton);
		sleep(2000);
		assertElementNotPresent(editServiceOption);
	}

	public void verifyUserCanAddService() {
		sleep(1000);
		clickWhenClickable(newProviderServiceButton);
		sleep(1000);
		driver.findElement(serviceNameField).sendKeys(Hooks.prop.getProperty("service.name"));
		clickWhenClickable(saveServiceButton);
	}

	public void createProfileViewAddOnlyService() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void openServicesPage(String fullCategoriesUrl) {
		driver.get(fullCategoriesUrl);
	}

	// Specialty
	public void verifyUserCanDeleteSpecialty() {
		sleep(3000);
		clickWhenClickable(specialtyOptionsButton);
		sleep(2000);
		clickWhenClickable(deleteSpecialtyOption);
		sleep(2000);
		clickWhenClickable(confirmDeleteSpecialtyButton);
	}

	public void createProfileViewDeleteOnlySpecialty() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddSpecialty() {
		sleep(3000);
		assertElementNotPresent(newProviderSpecialtyButton);
	}

	public void verifyUserCanEditSpecialty() {
		sleep(3000);
		clickWhenClickable(specialtyOptionsButton);
		sleep(2000);
		clickWhenClickable(editSpecialtyOption);
		sleep(3000);
		driver.findElement(specialtyNameField).sendKeys(Hooks.prop.getProperty("specialty.name"));
		clickWhenClickable(saveSpecialtyButton);
	}

	public void createProfileViewEditOnlySpecialty() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotDeleteSpecialty() {
		sleep(3000);
		clickWhenClickable(specialtyOptionsButton);
		sleep(2000);
		assertElementNotPresent(deleteSpecialtyOption);
	}

	public void verifyUserCannotEditSpecialty() {
		sleep(3000);
		clickWhenClickable(specialtyOptionsButton);
		sleep(2000);
		assertElementNotPresent(editSpecialtyOption);
	}

	public void verifyUserCanAddSpecialty() {
		sleep(1000);
		clickWhenClickable(newProviderSpecialtyButton);
		sleep(1000);
		driver.findElement(specialtyNameField).sendKeys(Hooks.prop.getProperty("specialty.name"));
		clickWhenClickable(saveSpecialtyButton);
	}

	public void createProfileViewAddOnlySpecialty() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void openSpecialtiesPage(String fullCategoriesUrl) {
		driver.get(fullCategoriesUrl);
	}

	// Category
	public void verifyUserCanDeleteCategory() {
		sleep(3000);
		clickWhenClickable(categoryOptionsButton);
		sleep(1000);
		clickWhenClickable(deleteCategoryOption);
		sleep(2000);
		clickWhenClickable(confirmDeleteCategoryButton);
	}

	public void createProfileViewDeleteOnlyCategory() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddCategory() {
		sleep(3000);
		assertElementNotPresent(newProviderCategoryButton);
	}

	public void verifyUserCanEditCategory() {
		sleep(3000);
		clickWhenClickable(categoryOptionsButton);
		sleep(2000);
		clickWhenClickable(editCategoryOption);
		sleep(3000);
		driver.findElement(categoryNameField).sendKeys(Hooks.prop.getProperty("category.name"));
		clickWhenClickable(saveCategoryButton);
	}

	public void createProfileViewEditOnlyCategory() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotDeleteCategory() {
		sleep(1000);
		clickWhenClickable(categoryOptionsButton);
		sleep(2000);
		assertElementNotPresent(deleteCategoryOption);
	}

	public void verifyUserCannotEditCategory() {
		sleep(3000);
		clickWhenClickable(categoryOptionsButton);
		sleep(2000);
		assertElementNotPresent(editCategoryOption);
	}

	public void verifyUserCanAddCategory() {
		sleep(1000);
		clickWhenClickable(newProviderCategoryButton);
		sleep(1000);
		driver.findElement(categoryNameField).sendKeys(Hooks.prop.getProperty("category.name"));
		clickWhenClickable(saveCategoryButton);
	}

	public void createProfileViewAddOnlyCategory() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void openCategoriesPage(String fullCategoriesUrl) {
		driver.get(fullCategoriesUrl);
	}

	// Provider Type
	public void openProviderTypePage(String fullProviderTypeUrl) {
		driver.get(fullProviderTypeUrl);
	}

	public void verifyUserCanDeleteProviderType() {
		sleep(3000);
		clickWhenClickable(providerTypeOptionsButton);
		sleep(1000);
		clickWhenClickable(deleteProviderTypeOption);
		sleep(1000);
		clickWhenClickable(confirmDeleteButton);
	}

	public void createProfileViewDeleteOnlyProviderType() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddProviderType() {
		sleep(1000);
		assertElementNotPresent(newProviderTypeButton);
	}

	public void verifyUserCanEditProviderType() {
		sleep(3000);
		clickWhenClickable(providerTypeOptionsButton);
		sleep(1000);
		clickWhenClickable(editProviderTypeOption);
		sleep(1000);
		driver.findElement(providerTypeLabelField).sendKeys(Hooks.prop.getProperty("provider.type.label"));
		clickWhenClickable(saveProviderTypeButton);
	}

	public void createProfileViewEditOnlyProviderType() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotDeleteProviderType() {
		sleep(1000);
		clickWhenClickable(providerTypeOptionsButton);
		sleep(1000);
		assertElementNotPresent(deleteProviderTypeOption);
	}

	public void verifyUserCannotEditProviderType() {
		sleep(3000);
		clickWhenClickable(providerTypeOptionsButton);
		sleep(1000);
		assertElementNotPresent(editProviderTypeOption);
	}

	public void verifyUserCanAddProviderType() {
		sleep(1000);
		clickWhenClickable(newProviderTypeButton);
		sleep(1000);
		driver.findElement(providerTypeNameField).sendKeys(Hooks.prop.getProperty("provider.type.name"));
		driver.findElement(providerTypeLabelField).sendKeys(Hooks.prop.getProperty("provider.type.label"));
		clickWhenClickable(saveProviderTypeButton);
	}

	public void createProfileViewAddOnlyProviderType() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCanViewProviderType() {
		sleep(3000);
		assertElementPresent(providerTypeNameColumn);
	}

	// Provider PA Details
	public void userShouldNotBeAbleToExportPADetailsToExcel() {
		sleep(3000);
		assertElementNotPresent(exportToExcelButton);
	}

	public void createProfileNoExportExcelPermissionPADetails() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldBeAbleToExportPADetailsToExcel() {
		sleep(3000);
		clickWhenClickable(exportToExcelButton);
	}

	public void createProfileWithExportExcelPermissionPADetails() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldBeAbleToViewProviderPADetails() {
		sleep(3000);
		clickWhenClickable(providerReferralDetailsButton);
		sleep(2000);
		clickWhenClickable(historyTab);
		sleep(2000);
		clickWhenClickable(paTab);
		sleep(1000);
		assertElementPresent(paRecord);
	}

	// Provider Remote Monitoring Details
	public void userShouldNotBeAbleToDownloadFilesFromRemoteMonitoringDetails() {
		sleep(1000);
		assertElementNotPresent(remoteMonitoringRecord);
	}

	public void createProfileNoDownloadPermissionRemoteMonitoringDetails() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldBeAbleToDownloadFilesFromRemoteMonitoringDetails() {
		sleep(1000);
		assertElementPresent(remoteMonitoringRecord);
	}

	public void userShouldBeAbleToViewProviderRemoteMonitoringDetails() {
		sleep(3000);
		clickWhenClickable(providerReferralDetailsButton);
		sleep(2000);
		clickWhenClickable(historyTab);
		sleep(2000);
		clickWhenClickable(remoteMonitoringTab);
		sleep(1000);
		assertElementPresent(remoteMonitoringRecord);
	}

	public void createProfileWithDownloadPermissionRemoteMonitoringDetails() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Provider Referral Outgoing Details
	public void userShouldNotBeAbleToDownloadFilesFromReferralOutgoingDetails() {
		sleep(3000);
		assertElementNotPresent(downloadOutgoingReferralFileButton);
	}

	public void userShouldBeAbleToDownloadFilesFromReferralOutgoingDetails() {
		sleep(3000);
		clickWhenClickable(downloadOutgoingReferralFileButton);
	}

	public void createProfileNoDownloadPermissionReferralOutgoingDetails() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldBeAbleToViewProviderReferralOutgoingDetails() {
		sleep(3000);
		clickWhenClickable(providerReferralDetailsButton);
		sleep(2000);
		clickWhenClickable(historyTab);
		sleep(2000);
		clickWhenClickable(viewAllReferralsButton);
		sleep(1000);
		clickWhenClickable(outgoingTab);
		sleep(1000);
		assertElementPresent(outgoingReferralRow);
	}

	public void createProfileWithDownloadPermissionReferralOutgoingDetails() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Business Group Address
	public void deleteBusinessGroupAddressInProviderModule() {
		sleep(3000);
		clickWhenClickable(optionsMenuButton);
		sleep(1000);
		clickWhenClickable(deleteAddressOption);
		sleep(2000);
		clickWhenClickable(confirmDeleteAddressButton);
	}

	public void verifyUserCannotAddBusinessGroupAddress() {
		sleep(3000);
		assertElementNotPresent(newAddressButton);
	}

	public void verifyUserCanEditBusinessGroupAddress() {
		sleep(3000);
		clickWhenClickable(optionsMenuButton);
		sleep(1000);
		clickWhenClickable(editAddressOption);
		sleep(2000);
		clickWhenClickable(shippingAddressCheckbox);
		clickWhenClickable(saveAddressButton);
	}

	public void createProfileWithViewDeleteNoAddEditBGAddress() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createProfileWithViewEditNoAddDeleteBGAddress() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotDeleteBusinessGroupAddress() {
		sleep(3000);
		clickWhenClickable(optionsMenuButton);
		sleep(1000);
		assertElementNotPresent(deleteAddressOption);
	}

	public void verifyUserCannotEditBusinessGroupAddress() {
		sleep(1000);
		clickWhenClickable(optionsMenuButton);
		sleep(1000);
		assertElementNotPresent(editAddressOption);
	}

	public void verifyUserCanAddBusinessGroupAddress() {
		sleep(1000);
		clickWhenClickable(newAddressButton);
		sleep(1000);
		driver.findElement(streetField).sendKeys(Hooks.prop.getProperty("address.street"));
		driver.findElement(cityField).sendKeys(Hooks.prop.getProperty("address.city"));
		driver.findElement(stateField).sendKeys(Hooks.prop.getProperty("address.state"));
		driver.findElement(zipCodeField).sendKeys(Hooks.prop.getProperty("address.zip"));
		clickWhenClickable(saveAddressButton);
	}

	public void createProfileWithViewAddNoEditDeleteBusinessGroupAddress() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement businessGroupAllElement = wait
				.until(ExpectedConditions.elementToBeClickable(businessGroupAddressAll));
		businessGroupAllElement.click();
		sleep(2000);
		WebElement businessGroupAddElement = wait
				.until(ExpectedConditions.elementToBeClickable(businessGroupAddressAdd));
		businessGroupAddElement.click();

	}

	public void verifyUserCanViewBusinessGroupAddress() {
		sleep(3000);
		clickWhenClickable(businessGroupsPageLink);
		sleep(3000);
		assertElementPresent(detailsLink);
	}

	// Provider Referral Incoming Details
	public void userShouldNotBeAbleToDownloadFilesFromReferralIncomingDetails() {
		sleep(1000);
		assertElementNotPresent(exportToExcelButton);
	}

	public void createProfileNoDownloadPermissionReferralIncomingDetails() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldBeAbleToDownloadFilesFromReferralIncomingDetails() {
		sleep(3000);
		assertElementPresent(exportToExcelButton);
	}

	public void userShouldBeAbleToViewReferralIncomingDetails() {
		sleep(3000);
		clickWhenClickable(providerReferralDetailsButton);
		sleep(2000);
		clickWhenClickable(historyTab);
		sleep(2000);
		clickWhenClickable(viewAllReferralsButton);
		sleep(1000);
		assertElementPresent(exportToExcelButton);
	}

	public void createProfileWithDownloadPermissionReferralIncomingDetails() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Business Group
	public void createProfileWithViewAndPartnerAccessNoCrud() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();

	}

	public void verifyUserCanMakeBusinessGroupPartner() {
		sleep(3000);
		clickWhenClickable(makePartnerButton);
	}

	public void verifyUserCanDeleteBusinessGroup() {
		sleep(3000);
		clickWhenClickable(businessGroupRecordIcon);
		sleep(1000);
		clickWhenClickable(deleteBusinessGroupOption);
		sleep(1000);
		clickWhenClickable(confirmDeleteBusinessGroupButton);
	}

	public void verifyUserCanEditBusinessGroup() {
		sleep(3000);
		clickWhenClickable(businessGroupRecordIcon);
		sleep(1000);
		clickWhenClickable(editBusinessGroupOption);
		sleep(2000);
		driver.findElement(businessGroupNotesField).sendKeys(Hooks.prop.getProperty("business.group.notes"));
		clickWhenClickable(saveBusinessGroupButton);
	}

	public void verifyUserCannotAddBusinessGroup() {
		sleep(2000);
		assertElementNotPresent(newBusinessGroupButton);
	}

	public void verifyUserCannotMakeBusinessGroupPartner() {
		sleep(3000);
		clickWhenClickable(businessGroupRecordIcon);
		sleep(1000);
		assertElementNotPresent(partnerBusinessGroupOption);
	}

	public void verifyUserCannotDeleteBusinessGroup() {
		sleep(1000);
		assertElementNotPresent(deleteBusinessGroupOption);
	}

	public void verifyUserCannotEditBusinessGroup() {
		sleep(1000);
		clickWhenClickable(businessGroupRecordIcon);
		sleep(1000);
		assertElementNotPresent(editBusinessGroupOption);
	}

	public void verifyUserCanAddBusinessGroup() {
		sleep(3000);
		clickWhenClickable(newBusinessGroupButton);
		sleep(2000);
		driver.findElement(businessGroupNameField).sendKeys(Hooks.prop.getProperty("business.group.name"));
		driver.findElement(businessGroupPhoneField).sendKeys(Hooks.prop.getProperty("business.group.phone"));
		driver.findElement(businessGroupPhoneExtField).sendKeys(Hooks.prop.getProperty("business.group.phone.ext"));
		driver.findElement(businessGroupEmailField).sendKeys(Hooks.prop.getProperty("business.group.email"));
		driver.findElement(businessGroupZoneField).sendKeys(Hooks.prop.getProperty("business.group.zone"));
		clickWhenClickable(saveBusinessGroupButton);
	}

	public void businessGroupProfileViewDeleteOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement businessGroupAllElement = wait.until(ExpectedConditions.elementToBeClickable(businessGroupAllField));
		businessGroupAllElement.click();
		sleep(2000);
		WebElement businessGroupDeleteElement = wait
				.until(ExpectedConditions.elementToBeClickable(businessGroupDeleteField));
		businessGroupDeleteElement.click();

	}

	public void businessGroupProfileViewEditOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement businessGroupAllElement = wait.until(ExpectedConditions.elementToBeClickable(businessGroupAllField));
		businessGroupAllElement.click();
		sleep(2000);
		WebElement businessGroupEditElement = wait
				.until(ExpectedConditions.elementToBeClickable(businessGroupEditField));
		businessGroupEditElement.click();

	}

	public void businessGroupProfileViewAddOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement businessGroupAllElement = wait.until(ExpectedConditions.elementToBeClickable(businessGroupAllField));
		businessGroupAllElement.click();

		WebElement businessGroupAddElement = wait.until(ExpectedConditions.elementToBeClickable(businessGroupAddField));
		businessGroupAddElement.click();

	}

	// Provider EHR
	public void verifyUserCanDeleteProviderEHR() {
		sleep(3000);
		clickWhenClickable(providersPageLink);
		sleep(3000);
		clickWhenClickable(ehrTabLink);
		sleep(1000);
		clickWhenClickable(ehrRecordIcon);
		sleep(1000);
		clickWhenClickable(deleteEhrOption);
		clickWhenClickable(confirmDeleteEhrButton);
	}

	public void providerEHRProfileDeleteOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddProviderEHR() {
		sleep(3000);
		assertElementNotPresent(newEhrButton);
	}

	public void verifyUserCanEditProviderEHR() {
		sleep(3000);
		clickWhenClickable(providersPageLink);
		sleep(3000);
		clickWhenClickable(ehrTabLink);
		sleep(1000);
		clickWhenClickable(ehrRecordIcon);
		sleep(1000);
		clickWhenClickable(editEhrOption);
		sleep(1000);
		driver.findElement(ehrNotesField).sendKeys(Hooks.prop.getProperty("ehr.notes"));
		clickWhenClickable(saveProviderEhrButton);
	}

	public void verifyUserCannotDeleteProviderEHR() {
		sleep(1000);
		assertElementNotPresent(deleteEhrOption);
	}

	public void verifyUserCannotEditProviderEHR() {
		sleep(3000);
		clickWhenClickable(ehrRecordIcon);
		sleep(1000);
		assertElementNotPresent(editEhrOption);
	}

	public void verifyUserCanAddProviderEHR() {
		sleep(3000);
		clickWhenClickable(providersPageLink);
		sleep(3000);
		clickWhenClickable(ehrTabLink);
		sleep(1000);
		clickWhenClickable(newEhrButton);
		sleep(1000);
		clickWhenClickable(ehrDropdown);
		sleep(1000);
		selectDropdownByIndexWhenReady(ehrDropdown, 1);
		sleep(3000);
		clickWhenClickable(saveProviderEhrButton);
	}

	public void providerEHRProfileRestrictedAddDelete() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void providerEHRProfileAddOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement providerEHRAllElement = wait.until(ExpectedConditions.elementToBeClickable(providerEHRAllField));
		providerEHRAllElement.click();
		sleep(2000);
		WebElement providerEHRAddElement = wait.until(ExpectedConditions.elementToBeClickable(providerEHRAddField));
		providerEHRAddElement.click();
		sleep(2000);

	}

	public void verifyUserCanDeleteProviderService() {
		sleep(3000);
		clickWhenClickable(serviceRecordIcon);
		sleep(1000);
		clickWhenClickable(deleteServiceOption);
		sleep(1000);
		clickWhenClickable(confirmDeleteServiceButton);
	}

	public void providerServiceProfileViewDeleteOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddProviderService() {
		sleep(3000);
		assertElementNotPresent(newServiceButton);
	}

	public void verifyUserCanEditProviderService() {
		sleep(3000);
		clickWhenClickable(serviceRecordIcon);
		sleep(1000);
		clickWhenClickable(editServiceOption);
		sleep(1000);
		driver.findElement(serviceNotesField).sendKeys(Hooks.prop.getProperty("service.notes"));
		clickWhenClickable(saveProviderServiceButton);
	}

	public void verifyUserCannotDeleteProviderService() {
		sleep(3000);
		clickWhenClickable(serviceRecordIcon);
		sleep(1000);
		assertElementNotPresent(deleteServiceOption);
	}

	public void verifyUserCannotEditProviderService() {
		sleep(3000);
		clickWhenClickable(serviceRecordIcon);
		sleep(1000);
		assertElementNotPresent(editServiceOption);
	}

	public void verifyUserCanAddProviderService() {
		sleep(3000);
		clickWhenClickable(newServiceButton);
		sleep(1000);
		clickWhenClickable(serviceDropdownInput);
		sleep(1000);
		clickWhenClickable(serviceDropdownOption);
		sleep(1000);
		clickWhenClickable(saveProviderServiceButton);
	}

	public void verifyUserCanViewProviderService() {
		sleep(3000);
		clickWhenClickable(providersPageLink);
		sleep(3000);
		clickWhenClickable(serviceTabLink);
		sleep(2000);
		assertElementPresent(serviceRecordIcon);
	}

	public void providerServiceProfileViewEditOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void providerServiceProfileWithViewAndAddAccessNoEditNoDelete() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Provider Executive
	public void verifyUserCanResetProviderExecutivePasswords() {
		sleep(3000);
		clickWhenClickable(executiveRecordButton);
		clickWhenClickable(resetPasswordOption);
		sleep(3000);
		driver.findElement(newPasswordField).sendKeys(Hooks.prop.getProperty("password.new"));
		driver.findElement(confirmPasswordField).sendKeys(Hooks.prop.getProperty("password.confirm"));
		clickWhenClickable(resetPasswordButton);
	}

	public void verifyUserCannotResetProviderExecutivePasswords() {
		sleep(2000);
		clickWhenClickable(executiveRecordButton);
		assertElementNotPresent(resetPasswordOption);
	}

	public void verifyUserCanViewProviderExecutiveRecords() {
		sleep(3000);
		clickWhenClickable(providersPageLink);
		sleep(3000);
		clickWhenClickable(executivesTabLink);
		sleep(2000);
		assertElementPresent(executiveRecordButton);
	}

	public void providerExecutiveProfileWithViewAndResetPasswordAccessPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void providerExecutiveProfileWithViewAccessWithoutResetPasswordPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// DeDupe
	public void userShouldNotBeAbleToUpdateDeDupeRecordsForProviderModule() {
		sleep(3000);
		List<WebElement> errorHeaders = driver.findElements(errorHeader);
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	public void providerModuleDeDupeProfileWithoutUpdatePermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement providerDeDupeAllElement = wait
				.until(ExpectedConditions.elementToBeClickable(providerDeDupeAllLabel));
		providerDeDupeAllElement.click();
		sleep(2000);

	}

	public void userShouldBeAbleToUpdateDeDupeRecordsForProviderModule() {
		sleep(3000);
		clickWhenClickable(doctorLastNameCheckbox);
		clickWhenClickable(doctorFirstNameCheckbox);
		clickWhenClickable(findDuplicateButton);
		sleep(2000);
		clickWhenClickable(firstDuplicateCheckbox);
		clickWhenClickable(secondDuplicateCheckbox);
		clickWhenClickable(mergeButton);
		sleep(2000);
		clickWhenClickable(firstRecordCheckbox);
		sleep(1000);
		clickWhenClickable(nextButton);
		sleep(1000);
		clickWhenClickable(nextButton);
		sleep(1000);
		clickWhenClickable(finishButton);
	}

	public void providerModuleDeDupeProfileWithUpdatePermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Referral Patient History
	public void userShouldNotBeAbleToDownloadFileInReferralPatientHistory() {
		sleep(1000);
		assertElementNotPresent(referralHistoryDownloadIcon);
	}

	public void referralPatientHistoryProfileWithoutFileDownloadPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldBeAbleToDownloadFileInReferralPatientHistory() {
		sleep(1000);
		clickWhenClickable(referralHistoryDownloadIcon);
	}

	public void userShouldBeAbleToViewReferralPatientHistory() {
		sleep(3000);
		clickWhenClickable(providersPageLink);
		sleep(3000);
		clickWhenClickable(historyTabLink);
	}

	public void referralPatientHistoryProfileFileDownloadPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Bucket
	public void userShouldNotBeAbleToFavouriteFolderInBucket() {
		sleep(1000);
		assertElementNotPresent(favouriteFolderLocator);
	}

	public void userShouldNotBeAbleToDeleteFolderInBucket() {
		sleep(1000);
		assertElementNotPresent(deleteFolderLocator);
	}

	public void userShouldNotBeAbleToEditFolderInBucket() {
		sleep(1000);
		assertElementNotPresent(editFolderLocator);
	}

	public void userShouldNotBeAbleToAddFolderInBucket() {
		sleep(1000);
		assertElementNotPresent(addFolderButton);
	}

	public void userShouldNotBeAbleToViewFolderInBucket() {
		sleep(1000);
		clickWhenClickable(viewFolderIcon);
	}

	public void userShouldBeAbleToDownloadFileInBucket() {
		sleep(3000);
		clickWhenClickable(downloadFileIcon);
		sleep(1000);
	}

	public void userShouldBeAbleToFavouriteFileInBucket() {
		sleep(3000);
		clickWhenClickable(favouriteFileLocator);
		sleep(3000);
	}

	public void userShouldBeAbleToDeleteFileInBucket() {
		sleep(3000);
		clickWhenClickable(deleteFileIcon);
		sleep(1000);
		clickWhenClickable(confirmDeleteFileButton);
	}

	public void userShouldBeAbleToEditFileInBucket() {
		sleep(3000);
		clickWhenClickable(editFileIcon);
		sleep(1000);
		driver.findElement(fileNameTextBox).sendKeys(Hooks.prop.getProperty("file.name"));
		clickWhenClickable(saveFileButton);
	}

	public void userShouldBeAbleToAddFileInBucket() {
		sleep(3000);
		clickWhenClickable(addFileButton);
		sleep(1000);
		String filePath = System.getProperty("user.dir") + "/src/test/resources/Documents/dummy.pdf";
		WebElement fileInput = driver.findElement(fileUploadInput);
		fileInput.sendKeys(filePath);
		sleep(3000);
		clickWhenClickable(saveFileButton);
	}

	public void userShouldBeAbleToViewFileInBucket() {
		sleep(3000);
		clickWhenClickable(providersPageLink);
		sleep(3000);
		clickWhenClickable(bucketFolderLocator);
		sleep(2000);
		assertElementPresent(addFileButton);
	}

	public void bucketTestProfileFileFullNoFolder() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToViewFileInBucket() {
		sleep(1000);
		assertElementNotPresent(viewFileIcon);
	}

	public void userShouldNotBeAbleToDownloadFileInBucket() {
		sleep(1000);
		assertElementNotPresent(downloadFileIcon);
	}

	public void userShouldNotBeAbleToFavouriteFileInBucket() {
		sleep(1000);
		assertElementNotPresent(favouriteFileIcon);
	}

	public void userShouldNotBeAbleToDeleteFileInBucket() {
		sleep(1000);
		assertElementNotPresent(deleteFileIcon);
	}

	public void userShouldNotBeAbleToEditFileInBucket() {
		sleep(1000);
		assertElementNotPresent(editFileIcon);
	}

	public void userShouldNotBeAbleToAddFileInBucket() {
		sleep(3000);
		clickWhenClickable(bucketFolderLink);
		sleep(2000);
		assertElementNotPresent(addFileButton);
	}

	public void userShouldBeAbleToFavouriteFolderInBucket() {
		sleep(3000);
		clickWhenClickable(favouriteFolderIcon);
		sleep(3000);
	}

	public void userShouldBeAbleToDeleteFolderInBucket() {
		sleep(3000);
		clickWhenClickable(deleteFolderIcon);
		sleep(1000);
		clickWhenClickable(confirmDeleteFolderButton);
	}

	public void userShouldBeAbleToEditFolderInBucket() {
		sleep(3000);
		clickWhenClickable(editFolderIcon);
		sleep(2000);
		driver.findElement(folderNameField).sendKeys(Hooks.prop.getProperty("folder.name"));
		clickWhenClickable(saveFolderButton);
	}

	public void userShouldBeAbleToAddFolderInBucket() {
		sleep(3000);
		clickWhenClickable(addFolderButton);
		sleep(2000);
		driver.findElement(folderNameField).sendKeys(Hooks.prop.getProperty("folder.name"));
		clickWhenClickable(saveFolderButton);
	}

	public void bucketTestProfileFolderOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Referral Enrollment
	public void userShouldBeAbleToDeleteReferralEnrollment() {
		sleep(3000);
		clickWhenClickable(referralEnrollmentOptionsMenu);
		sleep(2000);
		clickWhenClickable(referralEnrollmentDeleteOption);
		sleep(2000);
		clickWhenClickable(confirmDeleteReferralEnrollmentButton);
	}

	public void createReferralEnrollmentProfileViewDeleteAccessOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddReferralEnrollment() {
		sleep(3000);
		assertElementNotPresent(newReferralEnrollmentButton);
	}

	public void userShouldBeAbleToEditReferralEnrollment() {
		sleep(3000);
		clickWhenClickable(referralEnrollmentOptionsMenu);
		sleep(2000);
		clickWhenClickable(referralEnrollmentEditOption);
		sleep(2000);
		driver.findElement(referralEnrollmentNotesField).sendKeys(Hooks.prop.getProperty("referral.enrollment.notes"));
		clickWhenClickable(saveReferralEnrollmentButton);
	}

	public void setupProfileReferralEnrollmentTestViewEditAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToDeleteReferralEnrollment() {
		sleep(2000);
		clickWhenClickable(referralEnrollmentOptionsMenu);
		sleep(2000);
		assertElementNotPresent(referralEnrollmentDeleteOption);
	}

	public void userShouldNotBeAbleToEditReferralEnrollment() {
		sleep(3000);
		clickWhenClickable(referralEnrollmentOptionsMenu);
		sleep(2000);
		assertElementNotPresent(referralEnrollmentEditOption);
	}

	public void userShouldBeAbleToAddReferralEnrollment() {
		sleep(3000);
		clickWhenClickable(newReferralEnrollmentButton);
		sleep(3000);
		clickWhenClickable(startDateField);
		clickWhenClickable(specificDate);
		sleep(2000);
		clickWhenClickable(saveReferralEnrollmentButton);
	}

	public void userShouldBeAbleToViewReferralEnrollment() {
		sleep(3000);
		clickWhenClickable(firstRowViewIcon);
		sleep(3000);
		clickWhenClickable(referralEnrollmentLink);
		sleep(3000);
	}

	public void setupProfileReferralEnrollmentTestViewAddAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement providerReferralEnrollmentAll = wait
				.until(ExpectedConditions.elementToBeClickable(providerReferralEnrollmentAllField));
		providerReferralEnrollmentAll.click();
		sleep(2000);
		WebElement providerReferralEnrollmentAdd = wait
				.until(ExpectedConditions.elementToBeClickable(providerReferralEnrollmentAddField));
		providerReferralEnrollmentAdd.click();

	}

	// Executives
	public void userShouldBeAbleToDeleteExecutives() {
		sleep(3000);
		clickWhenClickable(optionsMenuIcon);
		sleep(1000);
		clickWhenClickable(deleteOption);
		sleep(1000);
		clickWhenClickable(confirmDeleteButton);
	}

	public void setupProfileExecutivesTestViewDeleteAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();

	}

	public void userShouldNotBeAbleToAddExecutives() {
		sleep(2000);
		assertElementNotPresent(newExecutiveButton);
	}

	public void userShouldBeAbleToEditExecutives() {
		sleep(3000);
		clickWhenClickable(firstRowViewIcon);
		sleep(3000);
		clickWhenClickable(executivesLink);
		sleep(2000);
		clickWhenClickable(optionsMenuIcon);
		sleep(1000);
		clickWhenClickable(editOption);
		sleep(2000);
		driver.findElement(productServiceField).sendKeys(Hooks.prop.getProperty("product.service"));
		sleep(2000);
		clickWhenClickable(saveExecutiveButton);
	}

	public void setupProfileExecutivesTestViewEditAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();

	}

	public void userShouldNotBeAbleToDeleteExecutives() {
		sleep(3000);
		clickWhenClickable(optionsMenuIcon);
		sleep(2000);
		assertElementNotPresent(deleteOption);
	}

	public void userShouldNotBeAbleToEditExecutives() {
		sleep(3000);
		clickWhenClickable(optionsMenuIcon);
		sleep(2000);
		assertElementNotPresent(editOption);
	}

	public void userShouldBeAbleToAddExecutives() {
		sleep(4000);
		clickWhenClickable(newExecutiveButton);
		sleep(3000);
		driver.findElement(lastNameField).sendKeys(Hooks.prop.getProperty("user.lastname"));
		driver.findElement(firstNameField).sendKeys(Hooks.prop.getProperty("user.firstname"));
		driver.findElement(emailField).sendKeys(Hooks.prop.getProperty("user.email"));
		clickWhenClickable(profileDropdown);
		selectDropdownByIndexWhenReady(profileDropdown, 2);
		sleep(3000);
		clickWhenClickable(saveExecutiveButton);
	}

	public void userShouldBeAbleToViewExecutives() {
		sleep(3000);
		clickWhenClickable(firstRowViewIcon);
		sleep(3000);
		clickWhenClickable(executivesLink);
		sleep(3000);
	}

	public void createExecutivesTestProfileViewAddOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement executivesAllElement = wait.until(ExpectedConditions.elementToBeClickable(executivesAllLabel));
		executivesAllElement.click();
		sleep(2000);
		WebElement executiveAddElement = wait.until(ExpectedConditions.elementToBeClickable(executiveAddLabel));
		executiveAddElement.click();
		sleep(2000);

	}

	// Referrals
	public void userShouldBeAbleToExportReferralsToExcelInProviderModule() {
		sleep(3000);
		clickWhenClickable(exportToExcelButton);
	}

	public void verifyViewAndExportExcelAccessToReferralsProviderInModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToExportReferralsToExcelInProviderModule() {
		sleep(2000);
		assertElementNotPresent(exportToExcelButton);
	}

	public void verifyViewWithoutExportExcelAccessToReferralsProviderInModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void openProviderReferralsPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Referrals"));
	}

	// Provider Communication
	public void userShouldBeAbleToDeleteProviderCommunicationInProviderModule() {
		sleep(3000);
		clickWhenClickable(providerCommunicationDropdownButton);
		sleep(1000);
		clickWhenClickable(deleteProviderCommunicationOption);
		sleep(1000);
		clickWhenClickable(deleteProviderCommunicationConfirmButton);
	}

	public void verifyViewAndDeleteWithoutAddOrEditAccessToProviderCommunicationInModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddProviderCommunicationInProviderModule() {
		sleep(2000);
		assertElementNotPresent(newCommunicationButton);
		clickWhenClickable(providerCommunicationDropdownButton);
	}

	public void userShouldBeAbleToEditProviderCommunicationInProviderModule() {
		sleep(3000);
		clickWhenClickable(providerCommunicationDropdownButton);
		sleep(1000);
		clickWhenClickable(editProviderCommunicationOption);
		sleep(1000);
		driver.findElement(providerCommunicationDescriptionField)
				.sendKeys(Hooks.prop.getProperty("provider.communication.description"));
		clickWhenClickable(saveCommunicationButton);
	}

	public void verifyViewAndEditWithoutAddOrDeleteAccessToProviderCommunicationInModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToDeleteProviderCommunicationInProviderModule() {
		sleep(1000);
		assertElementNotPresent(deleteProviderCommunicationOption);
	}

	public void userShouldNotBeAbleToEditProviderCommunicationInProviderModule() {
		sleep(2000);
		clickWhenClickable(providerCommunicationDropdownButton);
		sleep(1000);
		assertElementNotPresent(editProviderCommunicationOption);
	}

	public void userShouldBeAbleToAddProviderCommunicationInProviderModule() {
		sleep(3000);
		clickWhenClickable(newCommunicationButton);
		sleep(1000);
		driver.findElement(providerCommunicationDescriptionField)
				.sendKeys(Hooks.prop.getProperty("provider.communication.description"));
		clickWhenClickable(saveCommunicationButton);
	}

	public void userShouldBeAbleToViewProviderCommunicationInProviderModule() {
		sleep(3000);
		clickWhenClickable(providerDetailsIcon);
		sleep(3000);
		clickWhenClickable(providerCommunicationTab);
	}

	public void verifyViewAndAddWithoutEditOrDeleteAccessToProviderCommunicationInModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Provider Address
	public void userShouldBeAbleToDeleteProviderAddressInProviderModule() {
		sleep(3000);
		clickWhenClickable(providerAddressDropdownButton);
		sleep(1000);
		clickWhenClickable(deleteProviderOption);
		sleep(1000);
		clickWhenClickable(deleteAddressConfirmButton);
	}

	public void verifyViewAndDeleteWithoutAddOrEditAccessToProviderAddressInModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddProviderAddressInProviderModule() {
		sleep(3000);
		assertElementNotPresent(newAddressButton);
	}

	public void userShouldBeAbleToEditProviderAddressInProviderModule() {
		sleep(3000);
		clickWhenClickable(providerAddressDropdownButton);
		sleep(1000);
		clickWhenClickable(editProviderAddressOption);
		sleep(1000);
		driver.findElement(providerFrontDeskNameField).sendKeys(Hooks.prop.getProperty("provider.frontdesk.name"));
		clickWhenClickable(saveAddressButton);
	}

	public void verifyViewAndEditWithoutAddOrDeleteAccessToProviderAddressInModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToDeleteProviderAddressInProviderModule() {
		sleep(1000);
		assertElementNotPresent(deleteProviderAddressOption);
	}

	public void userShouldNotBeAbleToEditProviderAddressInProviderModule() {
		sleep(3000);
		clickWhenClickable(providerAddressDropdownButton);
		sleep(1000);
		assertElementNotPresent(editProviderAddressOption);
	}

	public void userShouldBeAbleToAddProviderAddressInProviderModule() {
		sleep(3000);
		clickWhenClickable(newAddressButton);
		sleep(1000);
		driver.findElement(providerStreetField).sendKeys(Hooks.prop.getProperty("provider.address.street"));
		driver.findElement(providerCityField).sendKeys(Hooks.prop.getProperty("provider.address.city"));
		driver.findElement(providerStateField).sendKeys(Hooks.prop.getProperty("provider.address.state"));
		driver.findElement(providerZipCodeField).sendKeys(Hooks.prop.getProperty("provider.address.zip"));
		driver.findElement(providerContactNumberField).sendKeys(Hooks.prop.getProperty("provider.contact.number"));
		clickWhenClickable(saveAddressButton);
	}

	public void userShouldBeAbleToViewProviderAddressInProviderModule() {
		sleep(3000);
		clickWhenClickable(providerDetailsIcon);
		sleep(2000);
	}

	public void verifyViewAndAddWithoutEditOrDeleteAccessToProviderAddressInModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Provider
	public void userShouldBeAbleToViewProviderDetailsInProviderModule() {
		sleep(3000);
		assertElementPresent(providerDetailsIcon);
		clickWhenClickable(providerDetailsIcon);
	}

	public void verifyViewAndDetailWithoutAddEditOrDeleteAccessToProviderInModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldBeAbleToDeleteProviderInProviderModule() {
		sleep(3000);
		clickWhenClickable(providerDropdownButton);
		sleep(1000);
		clickWhenClickable(deleteProviderOption);
		sleep(1000);
		clickWhenClickable(deleteConfirmButton);
	}

	public void verifyViewAndDeleteWithoutAddEditOrDetailAccessToProviderInModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddProviderInProviderModule() {
		sleep(3000);
		assertElementNotPresent(newProviderButton);
		clickWhenClickable(providerDropdownButton);
	}

	public void userShouldBeAbleToEditProviderInProviderModule() {
		clickWhenClickable(providerEditDropdownButton);
		sleep(2000);
		clickWhenClickable(providerEditOption);
		sleep(2000);
		driver.findElement(providerCellPhoneField).sendKeys(Hooks.prop.getProperty("provider.cell.phone"));
		clickWhenClickable(providerSaveButton);
	}

	public void verifyViewAndEditWithoutAddDeleteOrDetailAccessToProviderInModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToViewProviderDetailsInProviderModule() {
		sleep(3000);
		assertElementNotPresent(providerDetailsIcon);
	}

	public void userShouldNotBeAbleToDeleteProviderInProviderModule() {
		sleep(1000);
		assertElementNotPresent(deleteProviderOption);
	}

	public void userShouldNotBeAbleToEditProviderInProviderModule() {
		sleep(3000);
		assertElementNotPresent(editProviderOption);
	}

	public void userShouldBeAbleToAddProviderInProviderModule() {
		sleep(3000);
		clickWhenClickable(newProviderButton);
		sleep(3000);
		driver.findElement(providerLastNameField).sendKeys(Hooks.prop.getProperty("provider.lastname"));
		driver.findElement(providerFirstNameField).sendKeys(Hooks.prop.getProperty("provider.firstname"));
		driver.findElement(providerZoneField).sendKeys(Hooks.prop.getProperty("provider.zone"));
		driver.findElement(providerNpiNumberField).sendKeys(Hooks.prop.getProperty("provider.npi"));
		clickWhenClickable(providerSaveButton);
	}

	public void verifyViewAndAddWithoutEditDeleteOrDetailAccessToProviderInModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Text
	public void userShouldBeAbleToSendVCardInProviderModule() {
		sleep(3000);
		clickWhenClickable(sendVCardButton);
		sleep(3000);
		driver.findElement(vCardPhoneNumberField).sendKeys(Hooks.prop.getProperty("vcard.phone.number"));
		driver.findElement(vCardBodyField).sendKeys(Hooks.prop.getProperty("vcard.body"));
		clickWhenClickable(sendVCardSubmitButton);
	}

	public void verifyViewAndVcardAccessWithoutSendOrReplyInProviderModuleText() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldBeAbleToSendTextInProviderModule() {
		sleep(3000);
		clickWhenClickable(quickTextButton);
		sleep(1000);
		driver.findElement(providerNameFilter).sendKeys(Hooks.prop.getProperty("provider.name.filter"));
		clickWhenClickable(searchButtontext);
		sleep(3000);
		clickWhenClickable(newProviderDropdown);
		sleep(1000);
		selectDropdownByIndexWhenReady(newProviderDropdown, 1);
		sleep(1000);
		clickWhenClickable(newProviderExecutiveDropdown);
		sleep(1000);
		selectDropdownByIndexWhenReady(newProviderExecutiveDropdown, 0);
		sleep(1000);
		driver.findElement(newPhoneNumberField).sendKeys(Hooks.prop.getProperty("phone.new"));
		clickWhenClickable(saveButton);
	}

	public void verifyViewAndSendWithoutReplyOrVcardAccessToProviderModuleText() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// NPI Request
	public void userShouldBeAbleToApproveNPIRequestInProviderModule() {
		sleep(3000);
		clickWhenClickable(approveNpiRequestButton);
	}

	public void verifyViewAndApproveWithoutMergeAccessToNpiRequest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void openProviderNpiPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/NPIRequests"));
	}

	public void verifyViewAndMergeWithoutApproveAccessToNpiRequest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Demand Request
	public void userShouldNotBeAbleToViewDemandRequestInProviderModule() {
		sleep(3000);
		List<WebElement> errorHeaders = driver.findElements(demandRequestErrorHeader);
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	public void assertNoAccessToDemandRequestInProviderModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void openProviderDemandPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/DemandRequest"));
	}

	public void userShouldViewDemandRequestInProviderModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Callback Request
	public void userShouldNotBeAbleToViewCallbackRequestInProviderModule() {
		sleep(3000);
		List<WebElement> errorHeaders = driver.findElements(callbackRequestErrorHeader);
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	public void assertNoAccessToCallbackRequestInProviderModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyViewAccessToCallbackRequest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void openProviderCallbackPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/CallbackPharmacy"));
	}

	// Audit View
	public void userShouldNotBeAbleToViewGeneralAuditViewSettingsInProviderModule() {
		sleep(3000);
		assertElementNotPresent(updatedByLink);
		assertElementNotPresent(updatedDateLink);
	}

	public void verifyNoAccessToProviderAuditView() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldBeAbleToViewGeneralAuditViewSettingsInProviderModule() {
		sleep(3000);
		assertElementPresent(updatedByLink);
		assertElementPresent(updatedDateLink);
	}

	public void openProviderPage(String fullUrl) {
		driver.get(fullUrl);
	}

	public void userProfileWithViewAccessOnly() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// General
	public providerpage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// Profile Page
	public void openProviderProfilesPage(String fullUrl) {
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

	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	// ==== Utility Methods ====
	public void assertElementPresent(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (TimeoutException e) {
			Assert.fail("Element not present after wait: " + locator.toString());
		}
	}

	public void assertElementNotPresent(By locator) {
		List<WebElement> elements = driver.findElements(locator);
		Assert.assertTrue("Element should not be present: " + locator.toString(), elements.isEmpty());
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

}
