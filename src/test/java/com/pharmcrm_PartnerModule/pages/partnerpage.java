package com.pharmcrm_PartnerModule.pages;

import java.time.Duration;
import java.util.List;
import org.junit.Assert;
import org.junit.Assume;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pharmcrm_ProviderModule.pages.providerpage;

import hooks.Hooks;
import io.cucumber.java.en.And;

public class partnerpage {

	private WebDriver driver;
	private WebDriverWait wait;

	// DeDupe
	public By savePartnerAddressButton = By.xpath("//button[@id='btnSavePartnerAddressPopup']");
	public By savePartnerSpecialHourButton = By.xpath("//button[@id='btnSavePartnerSpecialHourPopup']");
	public By partnerBusinessName = By.xpath("//input[@id='Partner_BusinessName']");
	public By partnerPhoneNumber = By.xpath("//input[@id='Partner_PhoneNumber']");
	public By partnerAlternatePhoneNumber = By.xpath("//input[@id='Partner_AlternatePhoneNumber']");
	public By partnerEmailId = By.xpath("//input[@id='Partner_EmailId']");
	public By toastMessage = By.xpath("//div[@class='toast-message']");
	public By phoneNumberLabel = By.xpath("//label[normalize-space()='Phone Number']");
	public By findDuplicateButton = By.xpath("//span[normalize-space()='Find Duplicate']");
	public By firstDuplicateCheckboxLabel = By.xpath("(//label[starts-with(@for,'ckhg_')])[1]");
	public By secondDuplicateCheckboxLabel = By.xpath("(//label[starts-with(@for,'ckhg_')])[2]");
	public By sortByColumnLink = By.xpath("//table[1]//thead[1]//tr[1]//th[8]//a[1]");
	public By firstRecordCheckbox = By.xpath("(//input[starts-with(@id,'chkg_')])[1]");
	public By nextButton = By.xpath("//a[normalize-space()='Next']");
	public By finishButton = By.xpath("//a[normalize-space()='Finish']");

	// Partner Agreement
	public By endDateInputField = By.id("PartnerAgreement_EndDate");
	public By savePartnerAgreementButton = By.xpath("//button[@id='btnSavePartnerAgreementPopup']");
	public By addPartnerAgreementButton = By.xpath("//img[@id='btnAddPartnerAgreement']");
	public By firstPartnerActionIcon = By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]");
	public By editDropdownOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By endDateInput = By.id("Partner_PartnerAgreement_EndDate");
	public By addAgreementButton = By.xpath("//img[@id='btnAddPartnerAgreement']");
	public By editPartnerAgreementButton = By
			.xpath("(//a[contains(@onclick, 'editPartnerAgreement') and contains(@class, 'user-access')])[1]");
	public By deletePartnerAgreementButton = By.xpath("(//a[@id='btnDeletePartnerAgreement'])[1]");

	// Partner Special Hour
	public By dateFieldInput = By.id("PartnerSpecialHour_SpecialDay");
	public By closedCheckbox = By.xpath("//label[normalize-space()='Closed?']");
	public By editSpecialHourButton = By.xpath("(//a[contains(@data-original-title,'Edit Special Hour')])[1]");
	public By deleteSpecialHourButton = By.xpath("(//a[@id='btnDeletePartnerSpecialHour'])[1]");
	public By newSpecialHourButton = By.xpath("//span[normalize-space()='New Special Hour']");
	public By specialHourDateField = By.id("PartnerSpecialHour_SpecialDay");
	public By saveSpecialHourButton = By.id("btnSavePartnerSpecialHourPopup");

	// Partner Special Service
	public By specialServiceStatusDropdown = By.id("PartnerSpecialService_Status");
	public By specialServiceTab = By.xpath("//a[normalize-space()='Special Service']");
	public By specialServiceDropdown = By.id("Partner_SpecialService");
	public By saveSpecialServiceButton = By.xpath("//img[@class='v-align-middle']");
	public By editSpecialServiceButton = By.xpath("(//a[@data-original-title='Edit Special Service'])[1]");
	public By deleteSpecialServiceButton = By.xpath("(//a[@data-original-title='Delete Partner Special Service'])[1]");

	// Partner Special Event
	public By editSpecialEventButton = By.xpath("(//a[@data-original-title='Edit Special Event'])[1]");
	public By deleteSpecialEventButton = By.xpath("(//a[@data-original-title='Delete Partner Special Event'])[1]");
	public By specialEventTab = By.xpath("//a[normalize-space()='Special Event']");
	public By newSpecialEventButton = By.xpath("//span[normalize-space()='New Special Event']");
	public By specialEventTitleInput = By.id("PartnerSpecialEvent_Title");
	public By saveSpecialEventButton = By.id("btnSavePartnerSpecialEventPopup");

	// Partner License
	public By partnerDetailsIcon = By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]");
	public By viewPartnerDetailsIcon = By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]");
	public By licenseNumberInput = By.id("PartnerLicense_LicenseNumber");
	public By newPartnerLicenseButton = By.xpath("//span[normalize-space()='New Partner License']");
	public By downloadPartnerLicenseButton = By.xpath("(//a[@id='btneditPartnerLicense'])[1]");
	public By viewPartnerLicenseDetailsButton = By.xpath("(//a[@id='btneditPartnerLicense'])[1]");
	public By partnerLicenseTab = By.xpath("//a[normalize-space()='Partner License']");
	public By editPartnerLicenseButton = By.xpath("(//a[@id='btneditPartnerLicense'])[1]");
	public By deletePartnerLicenseButton = By.xpath("(//a[@id='btnDeletePartnerLicense'])[1]");

	// Funding Company
	public By viewFundingCompanyDetailsIcon = By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]");
	public By fundingCompanyDetailsIcon = By.xpath(
			"//tbody/tr/td/div[@class='gridListIconsFlex justify-content-end']/a[@id='liPartners_d4211063-cc31-48bd-a4bc-e856ff2ab7d8']/img[1]");
	public By actionsMenuIcon = By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']");
	public By businessNameInput = By.id("Partner_BusinessName");
	public By phoneNumberInput = By.id("Partner_PhoneNumber");

	// Partner PA Details
	public By historyTab = By.xpath("//a[normalize-space()='History']");
	public By viewAllPAButton = By.xpath("//span[normalize-space()='View All PA']");

	// Partner Referral Outgoing Details
	public By outgoingTab = By.xpath("//a[normalize-space()='Outgoing']");

	// Partner Referral Incoming Details
	public By viewAllReferralsButton = By.xpath("//span[normalize-space()='View All Referrals']");
	public By exportToExcelButton = By.xpath("//span[normalize-space()='Export to Excel']");

	// Referral Enrollment
	public By firstPartnerEditIcon = By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]");
	public By startDateInput = By.id("PartnerReferralEnrollment_StartDate");
	public By emailInput = By.id("PartnerReferralEnrollment_EmailId");
	public By editReferralEnrollmentIcon = By.xpath(
			"(//div[@class='gridListIconsFlex justify-content-end']//a[contains(@onclick,'editPartnerReferralEnrollment')])[1]");
	public By deleteReferralEnrollmentIcon = By.xpath(
			"(//div[@class='gridListIconsFlex justify-content-end']//a[@id='btnDeletePartnerReferralEnrollment'])[1]");
	public By partnerViewIcon = By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]");
	public By referralTab = By.xpath("//a[@role='tab'][normalize-space()='Referral']");
	public By newReferralEnrollmentButton = By.xpath("//span[normalize-space()='New Referral Enrollment']");
	public By referralStartDateInput = By.id("PartnerReferralEnrollment_StartDate");
	public By referralEmailInput = By.id("PartnerReferralEnrollment_EmailId");
	public By saveReferralEnrollmentButton = By.id("btnSavePartnerReferralEnrollmentPopup");

	// Employers
	public By employersViewIcon = By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]");
	public By employersActionDropdown = By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]");
	public By editEmployersOption = By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Edit')]");
	public By deleteEmployersOption = By
			.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]");

	// Federal And State Government
	public By federalStateViewIcon = By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]");
	public By federalStateActionDropdown = By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]");
	public By editFederalStateOption = By
			.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Edit')]");
	public By deleteFederalStateOption = By
			.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]");

	// Rx HUB
	public By rxHubViewIcon = By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]");
	public By rxHubActionDropdown = By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]");
	public By editRxHubOption = By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Edit')]");
	public By deleteRxHubOption = By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]");

	// DME Provider
	public By dmeProviderViewIcon = By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]");
	public By dmeProviderActionDropdown = By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]");
	public By editDmeProviderOption = By
			.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Edit')]");
	public By deleteDmeProviderOption = By
			.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]");

	// Pharmacies
	public By pharmacyVettingViewIcon = By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]");
	public By actionDropdownButton = By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]");
	public By editPartnerOption = By.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Edit')]");
	public By deletePartnerOption = By
			.xpath("//div[contains(@class,'dropdown-menu')]//span[contains(text(),'Delete')]");
	public By firstPartnerPharmacyVettingIcon = By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]");
	public By confirmDeletePharmaciesButton = By
			.xpath("//div[@id='deletePartnerModel']//button[@id='btnDeleteConfirm']");
	public By savePharmaciesButton = By.xpath("//button[@id='btnSave']");
	public By viewPharmacyDetailsIcon = By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]");
	public By pharmacyVettingButton = By.xpath("//button[@id='btnPartnerSignature']");
	public By viewPharmaciesDetailsIcon = By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]");
	public By pharmaciesMenuIcon = By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]");
	public By editPharmaciesOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By deletePharmaciesOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");

	// Attorney
	public By path3092 = By.xpath("//*[name()='path' and @id='Path_3092']");
	public By savePartnerSpecialEventButton = By.xpath("//button[@id='btnSavePartnerSpecialEventPopup']");
	public By partnerLicenseNumber = By.xpath("//input[@id='PartnerLicense_LicenseNumber']");
	public By partnerLicenseUrl = By.xpath("//input[@id='PartnerLicense_Url']");
	public By partnerLicenseOriginalDate = By.xpath("//input[@id='PartnerLicense_OriginalDate']");
	public By partnerLicenseExpiryDate = By.xpath("//input[@id='PartnerLicense_ExpiryDate']");
	public By saveButtonInModal = By
			.xpath("//div[@class='modal-dialog modal-dialog-centered modalLaptopCenter']//button[@id='btnSave']");
	public By partnerReferralEnrollmentPhoneNumber = By.xpath("//input[@id='PartnerReferralEnrollment_PhoneNumber']");
	public By partnerReferralEnrollmentEmailId = By.xpath("//input[@id='PartnerReferralEnrollment_EmailId']");
	public By savePartnerReferralEnrollmentButton = By.xpath("//button[@id='btnSavePartnerReferralEnrollmentPopup']");
	public By referralLink = By.xpath("//a[normalize-space()='Referral']");
	public By partnerExecutiveLastName = By.xpath("//input[@id='PartnerExecutive_LastName']");
	public By partnerExecutiveFirstName = By.xpath("//input[@id='PartnerExecutive_FirstName']");
	public By partnerExecutivePhoneNumber = By.xpath("//input[@id='PartnerExecutive_PhoneNumber']");
	public By partnerExecutiveCellNumber = By.xpath("//input[@id='PartnerExecutive_CellNumber']");
	public By partnerExecutiveEmailId = By.xpath("//input[@id='PartnerExecutive_EmailId']");
	public By savePartnerExecutiveButton = By.xpath("//button[@id='btnSavePartnerExecutivePopup']");
	public By partnerAddressStreet = By.xpath("//input[@id='PartnerAddress_Street']");
	public By partnerAddressCity = By.xpath("//input[@id='PartnerAddress_City']");
	public By partnerAddressState = By.xpath("//input[@id='PartnerAddress_State']");
	public By partnerAddressZipCode = By.xpath("//input[@id='PartnerAddress_ZipCode']");
	public By viewAttorneyDetailsIcon = By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]");
	public By deleteAttorneyConfirmButton = By.xpath("//div[@id='deletePartnerModel']//button[@id='btnDeleteConfirm']");
	public By companyAttorneyCheckbox = By.xpath("//label[normalize-space()='Company Attorney?']");
	public By saveAttorneyButton = By.xpath("//button[@id='btnSave']");
	public By viewAttorneyIcon = By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]");
	public By attorneyMenuIcon = By.xpath("//tbody/tr[1]/td[9]/div[1]/div[1]/button[1]/i[1]");
	public By editAttorneyOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By deleteAttorneyOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	public By businessNameField = By.id("Partner_BusinessName");
	public By phoneNumberField = By.id("Partner_PhoneNumber");
	public By savePartnerButton = By.xpath("//button[@id='btnSave']");

	// Bucket
	public By folderBucketIcon = By.xpath("//*[name()='path' and contains(@d,'M575.8 255')]");
	public By confirmDeleteFileButton = By.xpath("//button[@id='btnDeleteFileConfirm']");
	public By fileNameTextBox = By.id("fileNameTextBox");
	public By closeEditFileButton = By
			.xpath("//button[@onclick='javascript: ClosePartnerAddDocumentFile();']//i[@class='fa fa-times']");
	public By uploadFileInput = By.xpath("// div[@class='model-inp']//input[@id='file-3']");
	public By saveFileButton = By.xpath("//button[@id='btnSaveFile']");
	public By partnerFolderIcon = By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]");
	public By closeViewerButton = By.xpath("//button[@onclick='CloseDocViewer();']//i[@class='fa fa-times']");
	public By downloadFileIcon = By.xpath("//img[@class='permitions']");
	public By favouriteFileIcon = By.xpath("//img[@src='/Content/img/black-bookmark.png']");
	public By deleteFileIcon = By.xpath("//a[@id='btnDeleteFile']//img");
	public By addFileButton = By.xpath("//a[@id='btnAddFile']");
	public By editFileIcon = By.xpath("//img[@class='edit']");
	public By fileInBucket = By.id("fileBucketId");
	public By favouriteFolderIcon = By.xpath("//img[@src='/Content/img/black-bookmark.png']");
	public By deleteFolderIcon = By.xpath("//a[@id='btnDeleteFolder']//img");
	public By confirmDeleteFolderButton = By.xpath("//div[@id='deleteFolderModel']//button[@id='btnDeleteConfirm']");
	public By editFolderIcon = By.xpath("//img[@class='aaa']");
	public By addFolderButton = By.id("btnAddFolder");
	public By folderNameField = By.id("BucketFolder_FolderName");
	public By folderTypeDropdown = By.id("BucketFolder_Type");
	public By saveFolderButton = By.id("btnSave");
	public By firstPartnerFolderIcon = By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]");
	public By bucketFolder = By.xpath("//a[@id='93d2dd6a-73cf-423d-815b-43a8ff5886c8']");

	// Executive
	public By enableLoginOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Enable Login')]");
	public By resetPasswordOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Reset Password')]");
	public By newPasswordField = By.id("newPassword");
	public By confirmPasswordField = By.id("confirmPassword");
	public By resetPasswordButton = By.id("btnResetPassword");
	public By confirmDeleteExecutiveButton = By.id("deletePartnerExecutive");
	public By contactPersonCheckbox = By.xpath("//label[normalize-space()='Contact Person']");
	public By executiveMenuIcon = By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']");
	public By editExecutiveOption = By.xpath("//span[normalize-space()='Edit']");
	public By deleteExecutiveOption = By.xpath("//span[normalize-space()='Delete']");
	public By executivesTab = By.xpath("//a[normalize-space()='Executives']");
	public By newExecutiveButton = By.xpath("//span[normalize-space()='New Executive']");
	public By lastNameField = By.id("PartnerExecutive_LastName");
	public By firstNameField = By.id("PartnerExecutive_FirstName");
	public By emailField = By.id("PartnerExecutive_EmailId");
	public By saveExecutiveButton = By.id("btnSavePartnerExecutivePopup");

	// Mailing Address
	public By editMailingAddressIcon = By.xpath(
			"(//div[@id='partner-address-list-mailing']//a[contains(@onclick,'editPartnerAddress') and contains(@data-original-title,'Edit Partner Care Giver Name')])[1]");
	public By deleteMailingAddressIcon = By.xpath(
			"(//div[@id='partner-address-list-mailing']//a[@id='btnDeletePartnerAddress' and contains(@data-original-title,'Delete Partner Address')])[1]");
	public By newMailingAddressButton = By.xpath("//span[normalize-space()='New Mailing Address']");

	// Business Address
	public By editBusinessAddressIcon = By.xpath("(//a[contains(@onclick,'editPartnerAddress')])[1]");
	public By deleteBusinessAddressIcon = By.xpath("(//a[@id='btnDeletePartnerAddress'])[1]");
	public By newBusinessAddressOption = By.xpath("//span[normalize-space()='New Business Addresses']");
	public By streetField = By.id("PartnerAddress_Street");
	public By cityField = By.id("PartnerAddress_City");
	public By stateField = By.id("PartnerAddress_State");
	public By zipCodeField = By.id("PartnerAddress_ZipCode");
	public By saveButtonAddress = By.id("btnSavePartnerAddressPopup");
	public By primaryAddressCheckbox = By.xpath("//label[normalize-space()='Primary Address']");
	public By newBusinessAddressButton = By.xpath("//span[normalize-space()='New Business Addresses']");

	// Custom Partners
	public By viewCustomPartnerIcon = By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]");
	public By wednesdayCheckbox = By.xpath("//label[normalize-space()='Wednesday']");
	public By newPartnerButton = By.xpath("//span[normalize-space()='New Partner']");
	public By partnerBusinessNameField = By.id("Partner_BusinessName");
	public By partnerPhoneNumberField = By.id("Partner_PhoneNumber");

	// Special Service
	public By editSpecialServiceIcon = By.xpath("//tbody/tr[1]/td[4]/div[1]/a[1]/img[1]");
	public By newSpecialServiceButton = By.xpath("//span[normalize-space()='New Special Service']");
	public By specialServiceTitleField = By.id("SpecialService_Title");

	// Partner Type
	public By confirmDeleteButton = By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']");
	public By bucketDropdownIcon = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By editOption = By.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[contains(text(),'Edit')]");
	public By deleteOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[contains(text(),'Delete')]");
	public By newPartnerTypeButton = By.xpath("//span[normalize-space()='New Partner Type']");
	public By partnerTypeNameField = By.id("PartnerType_Name");
	public By partnerTypeLabelField = By.id("PartnerType_Label");
	public By saveButton = By.xpath("//button[@id='btnSave']");

	// General
	public By createdByColumn = By.xpath("//a[normalize-space()='Created By']");
	public By createdDateColumn = By.xpath("//a[normalize-space()='Created Date']");
	public By errorHeader = By.xpath("//h2[normalize-space()='Error']");

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

	// Partner
	public String validateSpecialServiceBlankFields() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(partnerDetailsIcon)).click();

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(specialServiceTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(path3092)).click();

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

	public String validateAddSpecialEventBlankFields() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(partnerDetailsIcon)).click();

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(specialEventTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(newSpecialEventButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(savePartnerSpecialEventButton)).click();

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

	public String validateInvalidUrlOriginalAndExpiryDate() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(partnerDetailsIcon)).click();

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(partnerLicenseTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(newPartnerLicenseButton)).click();
		String partnerLicenseNumberValue = Hooks.prop.getProperty("partnerLicenseNumber");
		WebElement partnerLicenseNumberInput = driver.findElement(partnerLicenseNumber);
		partnerLicenseNumberInput.sendKeys(partnerLicenseNumberValue);
		String partnerLicenseUrlValue = Hooks.prop.getProperty("partnerLicenseUrl");
		WebElement partnerLicenseUrlInput = driver.findElement(partnerLicenseUrl);
		partnerLicenseUrlInput.sendKeys(partnerLicenseUrlValue);
		String partnerLicenseOriginalDateValue = Hooks.prop.getProperty("partnerLicenseOriginalDate");
		WebElement partnerLicenseOriginalDateInput = driver.findElement(partnerLicenseOriginalDate);
		partnerLicenseOriginalDateInput.sendKeys(partnerLicenseOriginalDateValue);
		String partnerLicenseExpiryDateValue = Hooks.prop.getProperty("partnerLicenseExpiryDate");
		WebElement partnerLicenseExpiryDateInput = driver.findElement(partnerLicenseExpiryDate);
		partnerLicenseExpiryDateInput.sendKeys(partnerLicenseExpiryDateValue);
		wait.until(ExpectedConditions.elementToBeClickable(saveButtonInModal)).click();

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

	public String validateAddPartnerLicenseBlankFields() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(partnerDetailsIcon)).click();

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(partnerLicenseTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(newPartnerLicenseButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(saveButtonInModal)).click();

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

	public String validateInvalidPhoneEmailFields() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(partnerDetailsIcon)).click();

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(referralLink)).click();
		wait.until(ExpectedConditions.elementToBeClickable(newReferralEnrollmentButton)).click();
		String partnerReferralEnrollmentPhoneNumberValue = Hooks.prop
				.getProperty("partnerReferralEnrollmentPhoneNumber");
		WebElement partnerReferralEnrollmentPhoneNumberInput = driver.findElement(partnerReferralEnrollmentPhoneNumber);
		partnerReferralEnrollmentPhoneNumberInput.sendKeys(partnerReferralEnrollmentPhoneNumberValue);
		String partnerReferralEnrollmentEmailIdValue = Hooks.prop.getProperty("partnerReferralEnrollmentEmailId");
		WebElement partnerReferralEnrollmentEmailIdInput = driver.findElement(partnerReferralEnrollmentEmailId);
		partnerReferralEnrollmentEmailIdInput.sendKeys(partnerReferralEnrollmentEmailIdValue);
		wait.until(ExpectedConditions.elementToBeClickable(savePartnerReferralEnrollmentButton)).click();

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

	public String validateAddReferralEnrollment() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(partnerDetailsIcon)).click();

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(referralLink)).click();
		wait.until(ExpectedConditions.elementToBeClickable(newReferralEnrollmentButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(savePartnerReferralEnrollmentButton)).click();

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

	public String verifyInvalidContactInfoValidation() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(partnerDetailsIcon)).click();

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(executivesTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(newExecutiveButton)).click();
		String partnerExecutiveLastNameValue = Hooks.prop.getProperty("partnerExecutiveLastName");
		WebElement partnerExecutiveLastNameInput = driver.findElement(partnerExecutiveLastName);
		partnerExecutiveLastNameInput.sendKeys(partnerExecutiveLastNameValue);
		String partnerExecutiveFirstNameValue = Hooks.prop.getProperty("partnerExecutiveFirstName");
		WebElement partnerExecutiveFirstNameInput = driver.findElement(partnerExecutiveFirstName);
		partnerExecutiveFirstNameInput.sendKeys(partnerExecutiveFirstNameValue);
		String partnerExecutivePhoneNumberValue = Hooks.prop.getProperty("partnerExecutivePhoneNumber");
		WebElement partnerExecutivePhoneNumberInput = driver.findElement(partnerExecutivePhoneNumber);
		partnerExecutivePhoneNumberInput.sendKeys(partnerExecutivePhoneNumberValue);
		String partnerExecutiveCellNumberValue = Hooks.prop.getProperty("partnerExecutiveCellNumber");
		WebElement partnerExecutiveCellNumberInput = driver.findElement(partnerExecutiveCellNumber);
		partnerExecutiveCellNumberInput.sendKeys(partnerExecutiveCellNumberValue);
		String partnerExecutiveEmailIdValue = Hooks.prop.getProperty("partnerExecutiveEmailId");
		WebElement partnerExecutiveEmailIdInput = driver.findElement(partnerExecutiveEmailId);
		partnerExecutiveEmailIdInput.sendKeys(partnerExecutiveEmailIdValue);
		wait.until(ExpectedConditions.elementToBeClickable(savePartnerExecutiveButton)).click();

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

	public String validateAddExecutiveBlankSubmission() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(partnerDetailsIcon)).click();

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(executivesTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(newExecutiveButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(savePartnerExecutiveButton)).click();

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

	public String validateMailingAddressInvalidZipcode() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(partnerDetailsIcon)).click();

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newMailingAddressButton)).click();
		String partnerAddressStreetValue = Hooks.prop.getProperty("partnerAddressStreet");
		WebElement partnerAddressStreetInput = driver.findElement(partnerAddressStreet);
		partnerAddressStreetInput.sendKeys(partnerAddressStreetValue);
		String partnerAddressCityValue = Hooks.prop.getProperty("partnerAddressCity");
		WebElement partnerAddressCityInput = driver.findElement(partnerAddressCity);
		partnerAddressCityInput.sendKeys(partnerAddressCityValue);
		String partnerAddressStateValue = Hooks.prop.getProperty("partnerAddressState");
		WebElement partnerAddressStateInput = driver.findElement(partnerAddressState);
		partnerAddressStateInput.sendKeys(partnerAddressStateValue);
		String partnerAddressZipCodeValue = Hooks.prop.getProperty("partnerAddressZipCode");
		WebElement partnerAddressZipCodeInput = driver.findElement(partnerAddressZipCode);
		partnerAddressZipCodeInput.sendKeys(partnerAddressZipCodeValue);
		wait.until(ExpectedConditions.elementToBeClickable(savePartnerAddressButton)).click();

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

	public String validateMailingAddressBlankSubmission() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(partnerDetailsIcon)).click();

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newMailingAddressButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(savePartnerAddressButton)).click();

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

	public String validateInvalidZipcodeEntry() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(partnerDetailsIcon)).click();

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newBusinessAddressOption)).click();
		String partnerAddressStreetValue = Hooks.prop.getProperty("partnerAddressStreet");
		WebElement partnerAddressStreetInput = driver.findElement(partnerAddressStreet);
		partnerAddressStreetInput.sendKeys(partnerAddressStreetValue);
		String partnerAddressCityValue = Hooks.prop.getProperty("partnerAddressCity");
		WebElement partnerAddressCityInput = driver.findElement(partnerAddressCity);
		partnerAddressCityInput.sendKeys(partnerAddressCityValue);
		String partnerAddressStateValue = Hooks.prop.getProperty("partnerAddressState");
		WebElement partnerAddressStateInput = driver.findElement(partnerAddressState);
		partnerAddressStateInput.sendKeys(partnerAddressStateValue);
		String partnerAddressZipCodeValue = Hooks.prop.getProperty("partnerAddressZipCode");
		WebElement partnerAddressZipCodeInput = driver.findElement(partnerAddressZipCode);
		partnerAddressZipCodeInput.sendKeys(partnerAddressZipCodeValue);
		wait.until(ExpectedConditions.elementToBeClickable(savePartnerAddressButton)).click();

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

	public String validateAddBusinessAddressSubmission() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(partnerDetailsIcon)).click();

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newBusinessAddressOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(savePartnerAddressButton)).click();

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

	public String validateNewSpecialHourBlankSubmission() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(partnerDetailsIcon)).click();

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newSpecialHourButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(savePartnerSpecialHourButton)).click();

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

	public String validateInvalidPhoneAlternatePhoneAndEmail() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newPartnerButton)).click();

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		String partnerBusinessNameValue = Hooks.prop.getProperty("partnerBusinessName");
		WebElement partnerBusinessNameInput = driver.findElement(partnerBusinessName);
		partnerBusinessNameInput.sendKeys(partnerBusinessNameValue);
		String partnerPhoneNumberValue = Hooks.prop.getProperty("partnerPhoneNumber");
		WebElement partnerPhoneNumberInput = driver.findElement(partnerPhoneNumber);
		partnerPhoneNumberInput.sendKeys(partnerPhoneNumberValue);
		String partnerAlternatePhoneNumberValue = Hooks.prop.getProperty("partnerAlternatePhoneNumber");
		WebElement partnerAlternatePhoneNumberInput = driver.findElement(partnerAlternatePhoneNumber);
		partnerAlternatePhoneNumberInput.sendKeys(partnerAlternatePhoneNumberValue);
		String partnerEmailIdValue = Hooks.prop.getProperty("partnerEmailId");
		WebElement partnerEmailIdInput = driver.findElement(partnerEmailId);
		partnerEmailIdInput.sendKeys(partnerEmailIdValue);
		wait.until(ExpectedConditions.elementToBeClickable(savePharmaciesButton)).click();

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

	public String validateNewPartnerBlankSubmission() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(newPartnerButton)).click();

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(savePharmaciesButton)).click();

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

	// DeDupe
	public void userShouldNotBeAbleToUpdateDeDupeRecordsInPartnersModule() throws InterruptedException {
		Thread.sleep(3000);

		List<WebElement> errorHeadersList = driver.findElements(errorHeader);
		if (!errorHeadersList.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	public void checkDeDupeUpdatePermissionDenied() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldBeAbleToUpdateDeDupeRecordsInPartnersModule() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(phoneNumberLabel).click();
		driver.findElement(findDuplicateButton).click();
		Thread.sleep(2000);
		driver.findElement(firstDuplicateCheckboxLabel).click();
		driver.findElement(secondDuplicateCheckboxLabel).click();
		driver.findElement(sortByColumnLink).click();
		Thread.sleep(2000);
		driver.findElement(firstRecordCheckbox).click();
		Thread.sleep(1000);
		driver.findElement(nextButton).click();
		Thread.sleep(1000);
		driver.findElement(nextButton).click();
		Thread.sleep(1000);
		driver.findElement(finishButton).click();
	}

	public void checkDeDupeUpdatePermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Partner Agreement
	public void verifyUserCannotAddOrEditPartnerAgreement() throws InterruptedException {
		Thread.sleep(3000);
		boolean isAddPresent = !driver.findElements(addPartnerAgreementButton).isEmpty();
		if (isAddPresent) {
			throw new AssertionError("Add Partner Agreement button is present!");
		}

		boolean isEditPresent = !driver.findElements(editPartnerAgreementButton).isEmpty();
		if (isEditPresent) {
			throw new AssertionError("Edit Partner Agreement button is present!");
		}
	}

	public void verifyUserCanDeletePartnerAgreement() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(firstPartnerActionIcon).click();
		Thread.sleep(3000);
		driver.findElement(editDropdownOption).click();
		Thread.sleep(3000);
		driver.findElement(deletePartnerAgreementButton).click();
		Thread.sleep(1000);
		driver.findElement(confirmDeleteButton).click();
	}

	public void checkPartnerAgreementDeletePermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddOrDeletePartnerAgreement() throws InterruptedException {
		Thread.sleep(3000);
		boolean isAddPresent = !driver.findElements(addPartnerAgreementButton).isEmpty();
		if (isAddPresent) {
			throw new AssertionError("Add Partner Agreement button is present!");
		}

		boolean isDeletePresent = !driver.findElements(deletePartnerAgreementButton).isEmpty();
		if (isDeletePresent) {
			throw new AssertionError("Delete Partner Agreement button is present!");
		}
	}

	public void verifyUserCanEditPartnerAgreement() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(firstPartnerActionIcon).click();
		Thread.sleep(3000);
		driver.findElement(editDropdownOption).click();
		Thread.sleep(3000);
		driver.findElement(editPartnerAgreementButton).click();
		Thread.sleep(2000);
		String endDateValue = Hooks.prop.getProperty("endDate");
		WebElement endDateInput = driver.findElement(endDateInputField);
		endDateInput.clear();
		endDateInput.sendKeys(endDateValue);
		endDateInput.sendKeys(Keys.ENTER);
		driver.findElement(savePartnerAgreementButton).click();
	}

	public void checkPartnerAgreementEditPermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrDeletePartnerAgreement() throws InterruptedException {
		Thread.sleep(3000);
		boolean isEditPresent = !driver.findElements(editPartnerAgreementButton).isEmpty();
		if (isEditPresent) {
			throw new AssertionError("Edit Partner Agreement button is present!");
		}

		boolean isDeletePresent = !driver.findElements(deletePartnerAgreementButton).isEmpty();
		if (isDeletePresent) {
			throw new AssertionError("Delete Partner Agreement button is present!");
		}
	}

	public void verifyUserCanAddPartnerAgreement() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(firstPartnerActionIcon).click();
		Thread.sleep(3000);
		driver.findElement(editDropdownOption).click();
		Thread.sleep(3000);
		String startDateValue = Hooks.prop.getProperty("startDate");
		String endDateValue = Hooks.prop.getProperty("endDate");
		WebElement startDate = driver.findElement(startDateInput);
		startDate.clear();
		startDate.sendKeys(startDateValue);
		startDate.sendKeys(Keys.ENTER);
		WebElement endDate = driver.findElement(endDateInput);
		endDate.clear();
		endDate.sendKeys(endDateValue);
		endDate.sendKeys(Keys.ENTER);
		driver.findElement(addAgreementButton).click();
	}

	public void verifyPartnerAgreementAddable() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Partner Special Hour
	public void verifyUserCannotAddOrEditPartnerSpecialHour() throws InterruptedException {
		Thread.sleep(3000);
		boolean isNewSpecialHourPresent = !driver.findElements(newSpecialHourButton).isEmpty();
		if (isNewSpecialHourPresent) {
			throw new AssertionError("New Special Hour button is present!");
		}

		boolean isEditSpecialHourPresent = !driver.findElements(editSpecialHourButton).isEmpty();
		if (isEditSpecialHourPresent) {
			throw new AssertionError("Edit Special Hour button is present!");
		}
	}

	public void verifyUserCanDeletePartnerSpecialHour() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(firstPartnerEditIcon).click();
		Thread.sleep(3000);
		driver.findElement(deleteSpecialHourButton).click();
		Thread.sleep(1000);
		driver.findElement(confirmDeleteButton).click();
	}

	public void checkPartnerSpecialHourDeletePermission() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddOrDeletePartnerSpecialHour() throws InterruptedException {
		Thread.sleep(3000);
		boolean isNewSpecialHourPresent = !driver.findElements(newSpecialHourButton).isEmpty();
		if (isNewSpecialHourPresent) {
			throw new AssertionError("New Special Hour button is present!");
		}

		boolean isDeleteSpecialHourPresent = !driver.findElements(deleteSpecialHourButton).isEmpty();
		if (isDeleteSpecialHourPresent) {
			throw new AssertionError("Delete Special Hour button is present!");
		}
	}

	public void verifyUserCanEditPartnerSpecialHour() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(firstPartnerEditIcon).click();
		Thread.sleep(3000);
		driver.findElement(editSpecialHourButton).click();
		Thread.sleep(3000);
		String dateValue = Hooks.prop.getProperty("dateField");
		WebElement dateField = driver.findElement(dateFieldInput);
		dateField.clear();
		dateField.sendKeys(dateValue);
		dateField.sendKeys(Keys.TAB);
		driver.findElement(closedCheckbox).click();
		driver.findElement(saveButton).click();
	}

	public void checkPartnerSpecialHourEditPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrDeletePartnerSpecialHour() throws InterruptedException {
		Thread.sleep(3000);
		boolean isEditPresent = !driver.findElements(editSpecialHourButton).isEmpty();
		boolean isDeletePresent = !driver.findElements(deleteSpecialHourButton).isEmpty();

		if (isEditPresent) {
			throw new AssertionError("Edit Special Hour button is present!");
		}
		if (isDeletePresent) {
			throw new AssertionError("Delete Special Hour button is present!");
		}
	}

	public void verifyUserCanAddPartnerSpecialHour() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(partnerDetailsIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(newSpecialHourButton)).click();
		Thread.sleep(3000);
		String specialHourDate = Hooks.prop.getProperty("specialHourDate");
		WebElement dateField = wait.until(ExpectedConditions.visibilityOfElementLocated(specialHourDateField));
		dateField.clear();
		dateField.sendKeys(specialHourDate);
		dateField.sendKeys(Keys.TAB);
		Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(saveSpecialHourButton)).click();
	}

	public void grantAddAccessToPartnerSpecialHour() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Partner Special Service
	public void verifyUserCannotAddOrEditPartnerSpecialService() throws InterruptedException {
		Thread.sleep(3000);
		if (driver.findElements(saveSpecialServiceButton).size() > 0) {
			throw new AssertionError("Save/Add Special Service button should not be visible!");
		}

		if (driver.findElements(editSpecialServiceButton).size() > 0) {
			throw new AssertionError("Edit Special Service button should not be visible!");
		}
	}

	public void verifyUserCanDeletePartnerSpecialService() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(partnerDetailsIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(specialServiceTab)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(deleteSpecialServiceButton)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void grantDeleteAccessToPartnerSpecialService() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddOrDeletePartnerSpecialService() throws InterruptedException {
		Thread.sleep(3000);
		if (driver.findElements(saveSpecialServiceButton).size() > 0) {
			throw new AssertionError("Save/Add Special Service button should not be visible!");
		}

		if (driver.findElements(deleteSpecialServiceButton).size() > 0) {
			throw new AssertionError("Delete Partner Special Service button should not be visible!");
		}
	}

	public void verifyUserCanEditPartnerSpecialService() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(partnerDetailsIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(specialServiceTab)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(editSpecialServiceButton)).click();
		Thread.sleep(1000);
		WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(specialServiceStatusDropdown));
		Select select = new Select(dropdown);
		select.selectByIndex(1);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(saveSpecialServiceButton)).click();
	}

	public void grantEditAccessToPartnerSpecialService() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrDeletePartnerSpecialService() throws InterruptedException {
		Thread.sleep(3000);
		if (driver.findElements(editSpecialServiceButton).size() > 0) {
			throw new AssertionError("Edit Special Service button should not be visible!");
		}

		if (driver.findElements(deleteSpecialServiceButton).size() > 0) {
			throw new AssertionError("Delete Partner Special Service button should not be visible!");
		}
	}

	public void verifyUserCanAddPartnerSpecialService() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(partnerDetailsIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(specialServiceTab)).click();
		Thread.sleep(3000);
		WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(specialServiceDropdown));
		Select select = new Select(dropdown);
		select.selectByIndex(1);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(saveSpecialServiceButton)).click();
	}

	public void grantAddAccessToPartnerSpecialService() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Partner Special Event
	public void verifyUserCannotAddOrEditPartnerSpecialEvent() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(specialEventTab)).click();
		Thread.sleep(3000);

		if (driver.findElements(newSpecialEventButton).size() > 0) {
			throw new AssertionError("New Special Event button should not be visible!");
		}

		if (driver.findElements(editSpecialEventButton).size() > 0) {
			throw new AssertionError("Edit Special Event button should not be visible!");
		}
	}

	public void verifyUserCanDeletePartnerSpecialEvent() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(partnerDetailsIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(specialEventTab)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(deleteSpecialEventButton)).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void grantDeleteAccessToPartnerSpecialEvent() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddOrDeletePartnerSpecialEvent() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(specialEventTab)).click();
		Thread.sleep(3000);
		if (driver.findElements(newSpecialEventButton).size() > 0) {
			throw new AssertionError("New Special Event button should not be visible!");
		}

		if (driver.findElements(deleteSpecialEventButton).size() > 0) {
			throw new AssertionError("Delete Partner Special Event button should not be visible!");
		}
	}

	public void verifyUserCanEditPartnerSpecialEvent() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(partnerDetailsIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(specialEventTab)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(editSpecialEventButton)).click();
		Thread.sleep(1000);
		String eventTitle = Hooks.prop.getProperty("specialEventTitle");
		WebElement titleInput = wait.until(ExpectedConditions.visibilityOfElementLocated(specialEventTitleInput));
		titleInput.clear();
		titleInput.sendKeys(eventTitle);
		wait.until(ExpectedConditions.elementToBeClickable(saveSpecialEventButton)).click();
	}

	public void grantEditAccessToPartnerSpecialEvent() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrDeletePartnerSpecialEvent() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(specialEventTab)).click();
		Thread.sleep(3000);
		if (driver.findElements(editSpecialEventButton).size() > 0) {
			throw new AssertionError("Edit Special Event button should not be visible!");
		}

		if (driver.findElements(deleteSpecialEventButton).size() > 0) {
			throw new AssertionError("Delete Partner Special Event button should not be visible!");
		}
	}

	public void verifyUserCanAddPartnerSpecialEvent() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(partnerDetailsIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(specialEventTab)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(newSpecialEventButton)).click();
		Thread.sleep(1000);
		String specialEventTitle = Hooks.prop.getProperty("specialEventTitle");
		WebElement titleInput = wait.until(ExpectedConditions.visibilityOfElementLocated(specialEventTitleInput));
		titleInput.clear();
		titleInput.sendKeys(specialEventTitle);
		wait.until(ExpectedConditions.elementToBeClickable(saveSpecialEventButton)).click();
	}

	public void grantAddAccessToPartnerSpecialEvent() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Partner License
	public void verifyUserCannotAddOrDeletePartnerLicense() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(partnerLicenseTab)).click();
		Thread.sleep(1000);
		if (driver.findElements(newPartnerLicenseButton).size() > 0) {
			throw new AssertionError("New Partner License button should not be visible!");
		}

		if (driver.findElements(deletePartnerLicenseButton).size() > 0) {
			throw new AssertionError("Delete Partner License button should not be visible!");
		}
	}

	public void verifyUserCanDownloadFilesInPartnerLicenseInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(partnerDetailsIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(partnerLicenseTab)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(editPartnerLicenseButton)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(downloadFileIcon)).click();
	}

	public void grantDownloadAccessToPartnerLicense() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddEditOrDeletePartnerLicenseInPartnerModule() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(partnerLicenseTab)).click();
		Thread.sleep(1000);
		if (driver.findElements(newPartnerLicenseButton).size() > 0) {
			throw new AssertionError("New Partner License button should not be visible!");
		}

		if (driver.findElements(editPartnerLicenseButton).size() > 0) {
			throw new AssertionError("Edit Partner License button should not be visible!");
		}

		if (driver.findElements(deletePartnerLicenseButton).size() > 0) {
			throw new AssertionError("Delete Partner License button should not be visible!");
		}
	}

	public void verifyUserCanViewPartnerLicenseDetailsInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(partnerDetailsIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(partnerLicenseTab)).click();
		Thread.sleep(2000);
	}

	public void grantDetailsAccessToPartnerLicense() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddOrEditPartnerLicenseInPartnerModule() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(partnerLicenseTab)).click();
		Thread.sleep(1000);
		if (driver.findElements(newPartnerLicenseButton).size() > 0) {
			throw new AssertionError("New Partner License button should not be visible!");
		}

		if (driver.findElements(editPartnerLicenseButton).size() > 0) {
			throw new AssertionError("Edit Partner License button should not be visible!");
		}
	}

	public void verifyUserCanDeletePartnerLicenseInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(partnerDetailsIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(partnerLicenseTab)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(deletePartnerLicenseButton)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void grantDeleteAccessToPartnerLicense() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddOrDeletePartnerLicenseInPartnerModule() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(partnerLicenseTab)).click();
		Thread.sleep(1000);
		if (driver.findElements(newPartnerLicenseButton).size() > 0) {
			throw new AssertionError("New Partner License button should not be visible!");
		}

		if (driver.findElements(deletePartnerLicenseButton).size() > 0) {
			throw new AssertionError("Delete Partner License button should not be visible!");
		}
	}

	public void verifyUserCanEditPartnerLicenseInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(viewPartnerDetailsIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(partnerLicenseTab)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(editPartnerLicenseButton)).click();
		Thread.sleep(3000);
		String licenseNumberValue = Hooks.prop.getProperty("licenseNumber");
		WebElement licenseNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(licenseNumberInput));
		licenseNumber.clear();
		licenseNumber.sendKeys(licenseNumberValue);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void grantEditAccessToPartnerLicense() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotDownloadFilesInPartnerLicenseInPartnerModule() throws InterruptedException {
		Thread.sleep(3000);
		if (driver.findElements(downloadPartnerLicenseButton).size() > 0) {
			throw new AssertionError("Download option in Partner License should not be visible!");
		}
	}

	public void verifyUserCannotViewPartnerLicenseDetailsInPartnerModule() throws InterruptedException {
		Thread.sleep(3000);
		if (driver.findElements(viewPartnerLicenseDetailsButton).size() > 0) {
			throw new AssertionError("Partner License details button should not be visible!");
		}
	}

	public void verifyUserCannotEditOrDeletePartnerLicenseInPartnerModule() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(partnerLicenseTab)).click();
		Thread.sleep(1000);
		if (driver.findElements(editPartnerLicenseButton).size() > 0) {
			throw new AssertionError("Edit Partner License button should not be visible!");
		}

		if (driver.findElements(deletePartnerLicenseButton).size() > 0) {
			throw new AssertionError("Delete Partner License button should not be visible!");
		}
	}

	public void verifyUserCanAddPartnerLicenseInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(newPartnerButton)).click();
		Thread.sleep(3000);
		String businessNameValue = Hooks.prop.getProperty("businessName");
		String phoneNumberValue = Hooks.prop.getProperty("phoneNumber");
		WebElement businessName = wait.until(ExpectedConditions.visibilityOfElementLocated(businessNameInput));
		businessName.clear();
		businessName.sendKeys(businessNameValue);
		WebElement phoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberInput));
		phoneNumber.clear();
		phoneNumber.sendKeys(phoneNumberValue);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void grantAddAccessToPartnerLicense() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Funding Company
	public void verifyUserCannotAddEditOrDeleteFundingCompany() throws InterruptedException {
		Thread.sleep(5000);
		if (driver.findElements(newPartnerButton).size() > 0) {
			throw new AssertionError("'New Partner' button should not be visible!");
		}
		wait.until(ExpectedConditions.elementToBeClickable(actionsMenuIcon)).click();
		Thread.sleep(1000);
		if (driver.findElements(editOption).size() > 0) {
			throw new AssertionError("'Edit' option should not be visible!");
		}

		if (driver.findElements(deleteOption).size() > 0) {
			throw new AssertionError("'Delete' option should not be visible!");
		}
	}

	public void verifyUserCanViewFundingCompanyDetails() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(viewFundingCompanyDetailsIcon)).click();
		Thread.sleep(3000);
	}

	public void grantDetailsAccessToFundingCompany() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddOrEditFundingCompany() throws InterruptedException {
		Thread.sleep(5000);
		if (driver.findElements(newPartnerButton).size() > 0) {
			throw new AssertionError("'New Partner' button should not be visible!");
		}

		wait.until(ExpectedConditions.elementToBeClickable(actionsMenuIcon)).click();
		Thread.sleep(1000);

		if (driver.findElements(editOption).size() > 0) {
			throw new AssertionError("'Edit' option should not be visible!");
		}
	}

	public void verifyUserCanDeleteFundingCompany() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(actionsMenuIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void grantDeleteAccessToFundingCompany() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddOrDeleteFundingCompany() throws InterruptedException {
		Thread.sleep(5000);
		if (driver.findElements(newPartnerButton).size() > 0) {
			throw new AssertionError("'New Partner' button should not be visible!");
		}

		wait.until(ExpectedConditions.elementToBeClickable(actionsMenuIcon)).click();
		Thread.sleep(1000);
		if (driver.findElements(deleteOption).size() > 0) {
			throw new AssertionError("'Delete' option should not be visible!");
		}
	}

	public void verifyUserCanEditFundingCompany() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(actionsMenuIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(editOption)).click();
		Thread.sleep(3000);
		String businessNameValue = Hooks.prop.getProperty("businessName");
		String phoneNumberValue = Hooks.prop.getProperty("phoneNumber");
		WebElement businessName = wait.until(ExpectedConditions.visibilityOfElementLocated(businessNameInput));
		businessName.clear();
		businessName.sendKeys(businessNameValue);
		WebElement phoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberInput));
		phoneNumber.clear();
		phoneNumber.sendKeys(phoneNumberValue);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void grantEditAccessToFundingCompany() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotViewFundingCompanyDetails() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		if (driver.findElements(fundingCompanyDetailsIcon).size() > 0) {
			throw new AssertionError("Funding Company details icon should not be visible!");
		}
	}

	public void verifyUserCannotEditOrDeleteFundingCompany() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(actionsMenuIcon)).click();
		Thread.sleep(1000);

		if (driver.findElements(editOption).size() > 0) {
			throw new AssertionError("'Edit' option should not be present!");
		}

		if (driver.findElements(deleteOption).size() > 0) {
			throw new AssertionError("'Delete' option should not be present!");
		}
	}

	public void verifyUserCanAddFundingCompany() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(newPartnerButton)).click();
		Thread.sleep(3000);
		String businessNameValue = Hooks.prop.getProperty("businessName");
		String phoneNumberValue = Hooks.prop.getProperty("phoneNumber");
		WebElement businessName = wait.until(ExpectedConditions.visibilityOfElementLocated(businessNameInput));
		businessName.clear();
		businessName.sendKeys(businessNameValue);
		WebElement phoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberInput));
		phoneNumber.clear();
		phoneNumber.sendKeys(phoneNumberValue);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void userShouldBeAbleToAddFundingCompany() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Partner PA Details
	public void verifyUserCannotExportExcelInPartnerPADetails() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPartnerEditIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(historyTab)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(viewAllPAButton)).click();
		Thread.sleep(3000);
		if (driver.findElements(exportToExcelButton).size() > 0) {
			throw new AssertionError("'Export to Excel' button should not be present!");
		}

		Thread.sleep(3000);
	}

	public void userShouldNotBeAbleToExportExcelInPartnerPADetails() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCanExportExcelInPartnerPADetails() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPartnerEditIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(historyTab)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(viewAllPAButton)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(exportToExcelButton)).click();
		Thread.sleep(3000);
	}

	public void userShouldBeAbleToExportExcelInPartnerPADetails() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Partner Referral Outgoing Details
	public void verifyUserCannotDownloadReferralOutgoingDetailsFile() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPartnerEditIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(referralTab)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(viewAllReferralsButton)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(outgoingTab)).click();
		Thread.sleep(3000);
		if (driver.findElements(downloadFileIcon).size() > 0) {
			throw new AssertionError("Download file icon should not be present!");
		}
	}

	public void userShouldNotBeAbleToDownloadFilesInReferralOutgoingDetails() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCanDownloadReferralOutgoingDetailsFile() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPartnerEditIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(referralTab)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(viewAllReferralsButton)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(outgoingTab)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(downloadFileIcon)).click();
	}

	public void userShouldBeAbleToDownloadFilesInReferralOutgoingDetails() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Referral Patient History
	public void verifyUserCannotDownloadReferralPatientHistoryFile() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPartnerEditIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(referralTab)).click();
		Thread.sleep(2000);
		if (driver.findElements(downloadFileIcon).size() > 0) {
			throw new AssertionError("Download file icon should not be present!");
		}
		Thread.sleep(2000);
	}

	public void userShouldNotBeAbleToDownloadFilesInReferralPatientHistory() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCanDownloadReferralPatientHistoryFile() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPartnerEditIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(referralTab)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(downloadFileIcon)).click();
		Thread.sleep(2000);
	}

	public void userShouldBeAbleToDownloadReferralPatientHistory() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Partner Referral Incoming Details
	public void verifyUserCannotDownloadReferralIncomingDetailsFile() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPartnerEditIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(referralTab)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(viewAllReferralsButton)).click();
		Thread.sleep(2000);
		if (driver.findElements(downloadFileIcon).size() > 0) {
			throw new AssertionError("Download file icon should not be present!");
		}
	}

	public void userShouldNotBeAbleToDownloadFilesInReferralIncomingDetails() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCanDownloadReferralIncomingDetailsFile() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPartnerEditIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(referralTab)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(viewAllReferralsButton)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(exportToExcelButton)).click();
	}

	public void userShouldBeAbleToDownloadFilesInReferralIncomingDetails() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Referral Enrollment
	public void verifyUserCannotAddOrEditReferralEnrollment() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(referralTab)).click();
		Thread.sleep(1000);

		if (driver.findElements(newReferralEnrollmentButton).size() > 0) {
			throw new AssertionError("'New Referral Enrollment' button should not be present!");
		}

		if (driver.findElements(editReferralEnrollmentIcon).size() > 0) {
			throw new AssertionError("Edit Referral Enrollment icon should not be present!");
		}
	}

	public void verifyUserCanDeleteReferralEnrollment() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPartnerEditIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(referralTab)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(deleteReferralEnrollmentIcon)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void grantDeleteAccessToReferralEnrollment() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddOrDeleteReferralEnrollment() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(referralTab)).click();
		Thread.sleep(1000);

		if (driver.findElements(newReferralEnrollmentButton).size() > 0) {
			throw new AssertionError("'New Referral Enrollment' button should not be present!");
		}

		if (driver.findElements(deleteReferralEnrollmentIcon).size() > 0) {
			throw new AssertionError("Delete Referral Enrollment icon should not be present!");
		}
	}

	public void verifyUserCanEditReferralEnrollment() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPartnerEditIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(referralTab)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(editReferralEnrollmentIcon)).click();
		Thread.sleep(2000);
		String startDateValue = Hooks.prop.getProperty("startDate");
		String emailValue = Hooks.prop.getProperty("email");
		WebElement startDate = driver.findElement(startDateInput);
		startDate.clear();
		startDate.sendKeys(startDateValue);
		startDate.sendKeys(Keys.TAB);
		WebElement email = driver.findElement(emailInput);
		email.clear();
		email.sendKeys(emailValue);
		wait.until(ExpectedConditions.elementToBeClickable(saveReferralEnrollmentButton)).click();
	}

	public void grantEditAccessToReferralEnrollment() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrDeleteReferralEnrollment() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(referralTab).click();
		Thread.sleep(1000);
		if (driver.findElements(editReferralEnrollmentIcon).size() > 0) {
			throw new AssertionError("Edit icon should not be present!");
		}
		if (driver.findElements(deleteReferralEnrollmentIcon).size() > 0) {
			throw new AssertionError("Delete icon should not be present!");
		}
	}

	public void verifyUserCanAddReferralEnrollment() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(partnerViewIcon)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(referralTab)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(newReferralEnrollmentButton)).click();
		Thread.sleep(2000);
		String referralStartDate = Hooks.prop.getProperty("referralStartDate");
		String referralEmail = Hooks.prop.getProperty("referralEmail");
		WebElement startDateInput = wait.until(ExpectedConditions.visibilityOfElementLocated(referralStartDateInput));
		startDateInput.clear();
		startDateInput.sendKeys(referralStartDate);
		startDateInput.sendKeys(Keys.TAB);
		wait.until(ExpectedConditions.visibilityOfElementLocated(referralEmailInput)).sendKeys(referralEmail);
		wait.until(ExpectedConditions.elementToBeClickable(saveReferralEnrollmentButton)).click();
	}

	public void createProfileWithAddAccessForReferralEnrollment() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Employers
	public void verifyUserCannotAddEditOrDeleteEmployersInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElements(newPartnerButton).isEmpty());
		wait.until(ExpectedConditions.elementToBeClickable(employersActionDropdown)).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElements(editEmployersOption).isEmpty());
		Assert.assertTrue(driver.findElements(deleteEmployersOption).isEmpty());
	}

	public void verifyUserCanViewEmployersDetailsInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(employersViewIcon)).click();
	}

	public void createProfileWithDetailsAccessForEmployers() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddOrEditEmployersInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElements(newPartnerButton).isEmpty());
		wait.until(ExpectedConditions.elementToBeClickable(employersActionDropdown)).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElements(editEmployersOption).isEmpty());
	}

	public void userShouldBeAbleToDeleteEmployersInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(employersActionDropdown)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(deleteEmployersOption)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void createProfileWithDeleteAccessForEmployers() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddOrDeleteEmployersInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElements(newPartnerButton).isEmpty());
		wait.until(ExpectedConditions.elementToBeClickable(employersActionDropdown)).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElements(deleteEmployersOption).isEmpty());
	}

	public void userShouldBeAbleToEditEmployersInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(employersActionDropdown)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(editEmployersOption)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(wednesdayCheckbox)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(savePartnerButton)).click();
	}

	public void createProfileWithEditAccessForEmployers() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToViewEmployersDetailsInPartnerModule() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElements(employersViewIcon).isEmpty());
	}

	public void userShouldNotBeAbleToEditOrDeleteEmployersInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(employersActionDropdown)).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElements(editEmployersOption).isEmpty());
		Assert.assertTrue(driver.findElements(deleteEmployersOption).isEmpty());
	}

	public void createProfileWithAddAccessForEmployers() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldBeAbleToAddEmployersInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(newPartnerButton)).click();
		Thread.sleep(3000);
		String partnerBusinessName = Hooks.prop.getProperty("partnerBusinessName");
		String partnerPhoneNumber = Hooks.prop.getProperty("partnerPhoneNumber");
		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerBusinessNameField))
				.sendKeys(partnerBusinessName);
		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerPhoneNumberField)).sendKeys(partnerPhoneNumber);
		wait.until(ExpectedConditions.elementToBeClickable(savePartnerButton)).click();
	}

	// Federal And State Government
	public void userShouldNotBeAbleToAddEditOrDeleteFederalAndStateGovernmentInPartnerModule()
			throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElements(newPartnerButton).isEmpty());
		wait.until(ExpectedConditions.elementToBeClickable(federalStateActionDropdown)).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElements(editFederalStateOption).isEmpty());
		Assert.assertTrue(driver.findElements(deleteFederalStateOption).isEmpty());
	}

	public void userShouldBeAbleToViewFederalAndStateGovernmentDetailsInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(federalStateViewIcon)).click();
	}

	public void createProfileWithDetailsAccessForFederalAndStateGovernment() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddOrEditFederalAndStateGovernmentInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElements(newPartnerButton).isEmpty());
		wait.until(ExpectedConditions.elementToBeClickable(federalStateActionDropdown)).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElements(editFederalStateOption).isEmpty());
	}

	public void userShouldBeAbleToDeleteFederalAndStateGovernmentInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(federalStateActionDropdown)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(deleteFederalStateOption)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void createProfileWithDeleteAccessForFederalAndStateGovernment() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToViewFederalAndStateGovernmentDetailsInPartnerModule() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElements(federalStateViewIcon).isEmpty());
	}

	public void userShouldNotBeAbleToAddOrDeleteFederalAndStateGovernmentInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElements(newPartnerButton).isEmpty());
		wait.until(ExpectedConditions.elementToBeClickable(federalStateActionDropdown)).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElements(deleteFederalStateOption).isEmpty());
	}

	public void userShouldBeAbleToEditFederalAndStateGovernmentInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(federalStateActionDropdown)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(editFederalStateOption)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(wednesdayCheckbox)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(savePartnerButton)).click();
	}

	public void createProfileWithEditAccessForFederalAndStateGovernment() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToEditOrDeleteFederalAndStateGovernmentInPartnerModule()
			throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(federalStateActionDropdown)).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElements(editFederalStateOption).isEmpty());
		Assert.assertTrue(driver.findElements(deleteFederalStateOption).isEmpty());
	}

	public void userShouldBeAbleToAddFederalAndStateGovernmentInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(newPartnerButton)).click();
		Thread.sleep(3000);
		String partnerBusinessName = Hooks.prop.getProperty("partnerBusinessName");
		String partnerPhoneNumber = Hooks.prop.getProperty("partnerPhoneNumber");
		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerBusinessNameField))
				.sendKeys(partnerBusinessName);
		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerPhoneNumberField)).sendKeys(partnerPhoneNumber);
		wait.until(ExpectedConditions.elementToBeClickable(savePartnerButton)).click();
	}

	public void createProfileWithAddAccessForFederalAndStateGovernment() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Rx HUB
	public void userShouldNotBeAbleToAddOrEditRxHUBInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElements(newPartnerButton).isEmpty());
		wait.until(ExpectedConditions.elementToBeClickable(rxHubActionDropdown)).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElements(editRxHubOption).isEmpty());
	}

	public void userShouldBeAbleToDeleteRxHUBInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(rxHubActionDropdown)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(deleteRxHubOption)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void createProfileWithDeleteAccessForRxHub() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddOrDeleteRxHUBInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElements(newPartnerButton).isEmpty());
		wait.until(ExpectedConditions.elementToBeClickable(rxHubActionDropdown)).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElements(deleteRxHubOption).isEmpty());
	}

	public void userShouldBeAbleToEditRxHUBInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(rxHubActionDropdown)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(editRxHubOption)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(wednesdayCheckbox)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(savePartnerButton)).click();
	}

	public void createProfileWithEditAccessForRxHub() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToViewRxHUBDetailsInPartnerModule() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElements(rxHubViewIcon).isEmpty());
	}

	public void userShouldNotBeAbleToEditOrDeleteRxHUBInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(rxHubActionDropdown)).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElements(editRxHubOption).isEmpty());
		Assert.assertTrue(driver.findElements(deleteRxHubOption).isEmpty());
	}

	public void userShouldBeAbleToAddRxHUBInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(newPartnerButton)).click();
		Thread.sleep(3000);
		String partnerBusinessName = Hooks.prop.getProperty("partnerBusinessName");
		String partnerPhoneNumber = Hooks.prop.getProperty("partnerPhoneNumber");
		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerBusinessNameField))
				.sendKeys(partnerBusinessName);
		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerPhoneNumberField)).sendKeys(partnerPhoneNumber);
		wait.until(ExpectedConditions.elementToBeClickable(savePartnerButton)).click();
	}

	public void createProfileWithAddAccessForRxHub() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// DME Provider
	public void userShouldNotBeAbleToAddEditOrDeleteDMEProviderInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElements(newPartnerButton).isEmpty());
		wait.until(ExpectedConditions.elementToBeClickable(dmeProviderActionDropdown)).click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElements(editDmeProviderOption).isEmpty());
		Assert.assertTrue(driver.findElements(deleteDmeProviderOption).isEmpty());
	}

	public void userShouldBeAbleToViewDMEProviderDetailsInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(dmeProviderViewIcon)).click();
	}

	public void createProfileWithDetailsAccessForDmeProvider() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddOrEditDMEProviderInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElements(newPartnerButton).isEmpty());
		wait.until(ExpectedConditions.elementToBeClickable(dmeProviderActionDropdown)).click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElements(editDmeProviderOption).isEmpty());
	}

	public void userShouldBeAbleToDeleteDMEProviderInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(dmeProviderActionDropdown)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(deleteDmeProviderOption)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void createProfileWithDeleteAccessForDmeProvider() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddOrDeleteDMEProviderInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElements(newPartnerButton).isEmpty());
		wait.until(ExpectedConditions.elementToBeClickable(dmeProviderActionDropdown)).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElements(deleteDmeProviderOption).isEmpty());
	}

	public void userShouldBeAbleToEditDMEProviderInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(dmeProviderActionDropdown)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(editDmeProviderOption)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(wednesdayCheckbox)).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(savePartnerButton)).click();
	}

	public void createProfileWithEditAccessForDmeProvider() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToViewDMEProviderDetailsInPartnerModule() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElements(dmeProviderViewIcon).isEmpty());
	}

	public void userShouldNotBeAbleToEditOrDeleteDMEProviderInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(dmeProviderActionDropdown)).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElements(editDmeProviderOption).isEmpty());
		Assert.assertTrue(driver.findElements(deleteDmeProviderOption).isEmpty());
	}

	public void userShouldBeAbleToAddDMEProviderInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(newPartnerButton)).click();
		Thread.sleep(3000);
		String partnerBusinessName = Hooks.prop.getProperty("partnerBusinessName");
		String partnerPhoneNumber = Hooks.prop.getProperty("partnerPhoneNumber");
		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerBusinessNameField))
				.sendKeys(partnerBusinessName);
		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerPhoneNumberField)).sendKeys(partnerPhoneNumber);
		wait.until(ExpectedConditions.elementToBeClickable(savePartnerButton)).click();
	}

	public void createProfileWithAddAccessForDmeProvider() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Pharmacies
	public void userShouldNotBeAbleToAddEditDeleteOrViewPharmaciesDetailsInPartnerModule() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElements(newPartnerButton).isEmpty());
		Assert.assertTrue(driver.findElements(pharmacyVettingViewIcon).isEmpty());
		wait.until(ExpectedConditions.elementToBeClickable(actionDropdownButton)).click();
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElements(editPartnerOption).isEmpty());
		Assert.assertTrue(driver.findElements(deletePartnerOption).isEmpty());
	}

	public void userShouldBeAbleToAccessPharmacyVettingInPartnerModule() {
		sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPartnerPharmacyVettingIcon)).click();
	}

	public void createProfileWithPharmacyVettingAccessForPharmacies() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddEditOrDeletePharmaciesInPartnerModule() {
		sleep(5000);
		List<WebElement> newPartnerButtons = driver.findElements(newPartnerButton);
		Assert.assertTrue(newPartnerButtons.isEmpty());
		wait.until(ExpectedConditions.elementToBeClickable(pharmaciesMenuIcon)).click();
		sleep(1000);
		List<WebElement> editOptions = driver.findElements(editPharmaciesOption);
		Assert.assertTrue(editOptions.isEmpty());
		List<WebElement> deleteOptions = driver.findElements(deletePharmaciesOption);
		Assert.assertTrue(deleteOptions.isEmpty());
	}

	public void userShouldBeAbleToViewPharmaciesDetailsInPartnerModule() {
		sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(viewPharmaciesDetailsIcon)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(pharmacyVettingButton)).click();
	}

	public void verifyPharmaciesDetailsOnlyAccessInPartnerModuleProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddOrEditPharmaciesInPartnerModule() {
		sleep(5000);
		List<WebElement> newPartnerButtons = driver.findElements(newPartnerButton);
		Assert.assertTrue(newPartnerButtons.isEmpty());
		wait.until(ExpectedConditions.elementToBeClickable(pharmaciesMenuIcon)).click();
		sleep(1000);
		List<WebElement> editOptions = driver.findElements(editPharmaciesOption);
		Assert.assertTrue(editOptions.isEmpty());
	}

	public void userShouldBeAbleToDeletePharmaciesInPartnerModule() {
		sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(pharmaciesMenuIcon)).click();
		sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(deletePharmaciesOption)).click();
		sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeletePharmaciesButton)).click();
	}

	public void testPartnerModulePharmaciesDeleteAccessRestriction() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddOrDeletePharmaciesInPartnerModule() {
		sleep(5000);
		List<WebElement> newPartnerButtons = driver.findElements(newPartnerButton);
		Assert.assertTrue(newPartnerButtons.isEmpty());
		wait.until(ExpectedConditions.elementToBeClickable(pharmaciesMenuIcon)).click();
		sleep(1000);
		List<WebElement> deleteOptions = driver.findElements(deletePharmaciesOption);
		Assert.assertTrue(deleteOptions.isEmpty());
	}

	public void userShouldBeAbleToEditPharmaciesInPartnerModule() {
		sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(pharmaciesMenuIcon)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(editPharmaciesOption)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(wednesdayCheckbox)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(savePharmaciesButton)).click();
	}

	public void testPartnerModulePharmaciesEditAccessRestriction() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAccessPharmacyVettingInPartnerModule() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(viewPharmacyDetailsIcon)).click();
		sleep(3000);
		List<WebElement> vettingButtons = driver.findElements(pharmacyVettingButton);
		Assert.assertTrue(vettingButtons.isEmpty());
	}

	public void userShouldNotBeAbleToViewPharmaciesDetailsInPartnerModule() {
		sleep(3000);
		driver.navigate().refresh();
		sleep(3000);
		List<WebElement> viewIcons = driver.findElements(viewPharmaciesDetailsIcon);
		Assert.assertTrue(viewIcons.isEmpty());
	}

	public void userShouldNotBeAbleToEditOrDeletePharmaciesInPartnerModule() {
		sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(pharmaciesMenuIcon)).click();
		sleep(2000);
		List<WebElement> editOptions = driver.findElements(editPharmaciesOption);
		Assert.assertTrue(editOptions.isEmpty());
		List<WebElement> deleteOptions = driver.findElements(deletePharmaciesOption);
		Assert.assertTrue(deleteOptions.isEmpty());
	}

	public void userShouldBeAbleToAddPharmaciesInPartnerModule() {
		sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(newPartnerButton)).click();
		sleep(3000);
		String partnerBusinessName = Hooks.prop.getProperty("partnerBusinessName");
		String partnerPhoneNumber = Hooks.prop.getProperty("partnerPhoneNumber");
		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerBusinessNameField))
				.sendKeys(partnerBusinessName);
		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerPhoneNumberField)).sendKeys(partnerPhoneNumber);
		wait.until(ExpectedConditions.elementToBeClickable(savePartnerButton)).click();
	}

	public void testPartnerModulePharmaciesAddAccessRestriction() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Attorney
	public void userShouldNotBeAbleToAddEditOrDeleteAttorneyInPartnerModule() {
		sleep(3000);
		List<WebElement> newPartnerButtons = driver.findElements(newPartnerButton);
		Assert.assertTrue(newPartnerButtons.isEmpty());
		wait.until(ExpectedConditions.elementToBeClickable(attorneyMenuIcon)).click();
		sleep(2000);
		List<WebElement> editOptions = driver.findElements(editAttorneyOption);
		Assert.assertTrue(editOptions.isEmpty());
		List<WebElement> deleteOptions = driver.findElements(deleteAttorneyOption);
		Assert.assertTrue(deleteOptions.isEmpty());
	}

	public void userShouldBeAbleToViewAttorneyDetailsInPartnerModule() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(viewAttorneyDetailsIcon)).click();
	}

	public void testPartnerModuleAttorneyDetailsAccessRestriction() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddOrEditAttorneyInPartnerModule() {
		sleep(3000);
		List<WebElement> newPartnerButtons = driver.findElements(newPartnerButton);
		Assert.assertTrue(newPartnerButtons.isEmpty());
		sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(attorneyMenuIcon)).click();
		sleep(1000);
		List<WebElement> editOptions = driver.findElements(editAttorneyOption);
		Assert.assertTrue(editOptions.isEmpty());
	}

	public void userShouldBeAbleToDeleteAttorneyInPartnerModule() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(attorneyMenuIcon)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(deleteAttorneyOption)).click();
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(deleteAttorneyConfirmButton)).click();
	}

	public void testPartnerModuleAttorneyDeleteAccessRestriction() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToAddOrDeleteAttorneyInPartnerModule() {
		List<WebElement> newPartner = driver.findElements(newPartnerButton);
		Assert.assertTrue(newPartner.isEmpty());
		wait.until(ExpectedConditions.elementToBeClickable(attorneyMenuIcon)).click();
		List<WebElement> deleteOptions = driver.findElements(deleteAttorneyOption);
		Assert.assertTrue(deleteOptions.isEmpty());
	}

	public void userShouldBeAbleToEditAttorneyInPartnerModule() {
		wait.until(ExpectedConditions.elementToBeClickable(attorneyMenuIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editAttorneyOption)).click();
		wait.until(ExpectedConditions.elementToBeClickable(companyAttorneyCheckbox)).click();
		wait.until(ExpectedConditions.elementToBeClickable(saveAttorneyButton)).click();
	}

	public void verifyAttorneyEditOnlyAccessInPartnerModuleProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToViewAttorneyDetailsInPartnerModule() {
		List<WebElement> viewOptions = driver.findElements(viewAttorneyIcon);
		Assert.assertTrue(viewOptions.isEmpty());
	}

	public void userShouldNotBeAbleToEditOrDeleteAttorneyInPartnerModule() {
		wait.until(ExpectedConditions.elementToBeClickable(attorneyMenuIcon)).click();
		List<WebElement> editOptions = driver.findElements(editAttorneyOption);
		Assert.assertTrue(editOptions.isEmpty());
		List<WebElement> deleteOptions = driver.findElements(deleteAttorneyOption);
		Assert.assertTrue(deleteOptions.isEmpty());
	}

	public void userShouldBeAbleToAddAttorneyInPartnerModule() {
		wait.until(ExpectedConditions.elementToBeClickable(newPartnerButton)).click();
		String businessNameValue = Hooks.prop.getProperty("businessName");
		String phoneNumberValue = Hooks.prop.getProperty("phoneNumber");
		WebElement businessName = wait.until(ExpectedConditions.visibilityOfElementLocated(businessNameField));
		businessName.sendKeys(businessNameValue);
		WebElement phoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberField));
		phoneNumber.sendKeys(phoneNumberValue);
		wait.until(ExpectedConditions.elementToBeClickable(savePartnerButton)).click();
	}

	public void testPartnerModuleAttorneyAddAccessRestriction() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyAttorneyAddOnlyAccessInPartnerModuleProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Bucket
	public void userShouldNotBeAbleToFavouriteFolderInBucketForPartnerModule() {
		List<WebElement> favouriteFolderIcons = driver.findElements(favouriteFolderIcon);
		Assert.assertTrue(favouriteFolderIcons.isEmpty());
	}

	public void userShouldNotBeAbleToDeleteFolderInBucketForPartnerModule() {
		List<WebElement> deleteFolderIcons = driver.findElements(deleteFolderIcon);
		Assert.assertTrue(deleteFolderIcons.isEmpty());
	}

	public void userShouldNotBeAbleToEditFolderInBucketForPartnerModule() {
		List<WebElement> editFolderIcons = driver.findElements(editFolderIcon);
		Assert.assertTrue(editFolderIcons.isEmpty());
	}

	public void userShouldNotBeAbleToAddFolderInBucketForPartnerModule() {
		List<WebElement> addFolderButtons = driver.findElements(addFolderButton);
		Assert.assertTrue(addFolderButtons.isEmpty());
	}

	public void userShouldNotBeAbleToViewFolderInBucketForPartnerModule() {
		wait.until(ExpectedConditions.elementToBeClickable(folderBucketIcon)).click();
		List<WebElement> editIcons = driver.findElements(editFolderIcon);
		Assert.assertTrue(editIcons.isEmpty());
	}

	public void userShouldBeAbleToDownloadFileInBucketForPartnerModule() {
		wait.until(ExpectedConditions.elementToBeClickable(downloadFileIcon)).click();

	}

	public void userShouldBeAbleToFavouriteFileInBucketForPartnerModule() {
		wait.until(ExpectedConditions.elementToBeClickable(favouriteFileIcon)).click();

	}

	public void userShouldBeAbleToDeleteFileInBucketForPartnerModule() {
		wait.until(ExpectedConditions.elementToBeClickable(deleteFileIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteFileButton)).click();
	}

	public void userShouldBeAbleToEditFileInBucketForPartnerModule() {
		wait.until(ExpectedConditions.elementToBeClickable(editFileIcon)).click();
		String fileNameValue = Hooks.prop.getProperty("fileName");
		WebElement fileName = wait.until(ExpectedConditions.visibilityOfElementLocated(fileNameTextBox));
		fileName.clear();
		fileName.sendKeys(fileNameValue);
		wait.until(ExpectedConditions.elementToBeClickable(saveFileButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(closeEditFileButton)).click();
	}

	public void userShouldBeAbleToAddFileInBucketForPartnerModule() {
		wait.until(ExpectedConditions.elementToBeClickable(addFileButton)).click();
		String filePath = System.getProperty("user.dir") + "/src/test/resources/Documents/dummy.pdf";
		WebElement fileInput = wait.until(ExpectedConditions.visibilityOfElementLocated(uploadFileInput));
		fileInput.sendKeys(filePath);
		wait.until(ExpectedConditions.elementToBeClickable(saveFileButton)).click();
	}

	public void userShouldBeAbleToViewFileInBucketForPartnerModule() {
		wait.until(ExpectedConditions.elementToBeClickable(partnerFolderIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(bucketFolder)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editFileIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(closeViewerButton)).click();
	}

	public void testPartnerModuleBucketProfileFileOnlyPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldNotBeAbleToDownloadFileInBucketForPartnerModule() {
		List<WebElement> downloadFileIcons = driver.findElements(downloadFileIcon);
		Assert.assertTrue(downloadFileIcons.isEmpty());
	}

	public void userShouldNotBeAbleToFavouriteFileInBucketForPartnerModule() {
		List<WebElement> favouriteFileIcons = driver.findElements(favouriteFileIcon);
		Assert.assertTrue(favouriteFileIcons.isEmpty());
	}

	public void userShouldNotBeAbleToDeleteFileInBucketForPartnerModule() {
		List<WebElement> deleteFileIcons = driver.findElements(deleteFileIcon);
		Assert.assertTrue(deleteFileIcons.isEmpty());
	}

	public void userShouldNotBeAbleToEditFileInBucketForPartnerModule() {
		List<WebElement> editFileIcons = driver.findElements(editFileIcon);
		Assert.assertTrue(editFileIcons.isEmpty());
	}

	public void userShouldNotBeAbleToAddFileInBucketForPartnerModule() {
		List<WebElement> addFileButtons = driver.findElements(addFileButton);
		Assert.assertTrue(addFileButtons.isEmpty());
	}

	public void userShouldNotBeAbleToViewFileInBucketForPartnerModule() {
		wait.until(ExpectedConditions.elementToBeClickable(bucketFolder)).click();
		List<WebElement> editIcons = driver.findElements(editFileIcon);
		Assert.assertTrue(editIcons.isEmpty());
	}

	public void userShouldBeAbleToFavouriteFolderInBucketForPartnerModule() {
		wait.until(ExpectedConditions.elementToBeClickable(favouriteFolderIcon)).click();

	}

	public void userShouldBeAbleToDeleteFolderInBucketForPartnerModule() {
		wait.until(ExpectedConditions.elementToBeClickable(deleteFolderIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteFolderButton)).click();
	}

	public void userShouldBeAbleToEditFolderInBucketForPartnerModule() {
		wait.until(ExpectedConditions.elementToBeClickable(editFolderIcon)).click();
		String folderNameValue = Hooks.prop.getProperty("folderName");
		WebElement folderName = wait.until(ExpectedConditions.visibilityOfElementLocated(folderNameField));
		folderName.clear();
		folderName.sendKeys(folderNameValue);
		wait.until(ExpectedConditions.elementToBeClickable(saveFolderButton)).click();
	}

	public void userShouldBeAbleToAddFolderInBucketForPartnerModule() {
		wait.until(ExpectedConditions.elementToBeClickable(addFolderButton)).click();
		String folderNameValue = Hooks.prop.getProperty("folderName");
		wait.until(ExpectedConditions.visibilityOfElementLocated(folderNameField)).sendKeys(folderNameValue);
		wait.until(ExpectedConditions.elementToBeClickable(folderTypeDropdown)).click();
		WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(folderTypeDropdown));
		Select select = new Select(dropdown);
		select.selectByIndex(1);
		wait.until(ExpectedConditions.elementToBeClickable(saveFolderButton)).click();
	}

	public void verifyBucketProfileWithFolderOnlyPermissionsInPartnerModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void userShouldBeAbleToViewFolderInBucketForPartnerModule() {
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));
		wait.until(ExpectedConditions.elementToBeClickable(firstPartnerFolderIcon)).click();
		WebElement folderElement = wait.until(ExpectedConditions.visibilityOfElementLocated(bucketFolder));
		Assert.assertTrue(folderElement.isDisplayed());
	}

	// Executive
	public void verifyUserCannotAddEditOrDeleteExecutiveInPartnerModule() {
		sleep(3000);
		Assert.assertTrue(driver.findElements(newExecutiveButton).size() == 0);
		driver.findElement(executiveMenuIcon).click();
		Assert.assertTrue(driver.findElements(editExecutiveOption).size() == 0);
		Assert.assertTrue(driver.findElements(deleteExecutiveOption).size() == 0);
	}

	public void verifyUserCanResetPasswordForExecutiveInPartnerModule() {
		sleep(3000);
		driver.findElement(viewCustomPartnerIcon).click();
		sleep(3000);
		driver.findElement(executivesTab).click();
		sleep(3000);
		driver.findElement(executiveMenuIcon).click();
		sleep(3000);
		driver.findElement(enableLoginOption).click();
		sleep(3000);
		driver.findElement(executiveMenuIcon).click();
		sleep(3000);
		driver.findElement(resetPasswordOption).click();
		sleep(3000);
		String newPassword = Hooks.prop.getProperty("newPassword");
		String confirmPassword = Hooks.prop.getProperty("confirmPassword");
		driver.findElement(newPasswordField).sendKeys(newPassword);
		driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
		driver.findElement(resetPasswordButton).click();
	}

	public void verifyUserCanViewExecutiveInPartnerModule() {
		sleep(3000);
		Assert.assertTrue(driver.findElements(createdByColumn).size() > 0);
		Assert.assertTrue(driver.findElements(createdDateColumn).size() > 0);
	}

	public void createProfileViewResetExecutiveAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddOrEditExecutiveInPartnerModule() {
		sleep(3000);
		Assert.assertTrue(driver.findElements(newExecutiveButton).size() == 0);
		driver.findElement(executiveMenuIcon).click();
		Assert.assertTrue(driver.findElements(editExecutiveOption).size() == 0);
	}

	public void verifyUserCanDeleteExecutiveInPartnerModule() {
		sleep(3000);
		driver.findElement(viewCustomPartnerIcon).click();
		sleep(3000);
		driver.findElement(executivesTab).click();
		sleep(3000);
		driver.findElement(executiveMenuIcon).click();
		sleep(3000);
		driver.findElement(deleteExecutiveOption).click();
		sleep(3000);
		driver.findElement(confirmDeleteExecutiveButton).click();
	}

	public void createProfileDeleteExecutive() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddOrDeleteExecutiveInPartnerModule() {
		sleep(3000);
		Assert.assertTrue(driver.findElements(newExecutiveButton).size() == 0);
		driver.findElement(executiveMenuIcon).click();
		Assert.assertTrue(driver.findElements(deleteExecutiveOption).size() == 0);
	}

	public void verifyUserCanEditExecutiveInPartnerModule() {
		sleep(3000);
		driver.findElement(viewCustomPartnerIcon).click();
		sleep(3000);
		driver.findElement(executivesTab).click();
		sleep(3000);
		driver.findElement(executiveMenuIcon).click();
		sleep(3000);
		driver.findElement(editExecutiveOption).click();
		sleep(3000);
		driver.findElement(contactPersonCheckbox).click();
		driver.findElement(saveExecutiveButton).click();
	}

	public void createProfileEditExecutive() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrDeleteExecutiveInPartnerModule() {
		sleep(3000);
		driver.findElement(executiveMenuIcon).click();
		Assert.assertTrue(driver.findElements(editExecutiveOption).size() == 0);
		Assert.assertTrue(driver.findElements(deleteExecutiveOption).size() == 0);
	}

	public void verifyUserCanAddExecutiveInPartnerModule() {
		sleep(3000);
		driver.findElement(viewCustomPartnerIcon).click();
		sleep(3000);
		driver.findElement(executivesTab).click();
		sleep(3000);
		driver.findElement(newExecutiveButton).click();
		sleep(3000);
		String lastNameValue = Hooks.prop.getProperty("lastName");
		String firstNameValue = Hooks.prop.getProperty("firstName");
		String emailValue = Hooks.prop.getProperty("email");
		driver.findElement(lastNameField).sendKeys(lastNameValue);
		driver.findElement(firstNameField).sendKeys(firstNameValue);
		driver.findElement(emailField).sendKeys(emailValue);
		driver.findElement(saveExecutiveButton).click();
	}

	public void createProfileAddExecutive() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Mailing Address
	public void verifyUserCannotAddOrEditMailingAddressInPartnerModule() {
		sleep(3000);
		Assert.assertTrue(driver.findElements(newMailingAddressButton).size() == 0);
		Assert.assertTrue(driver.findElements(editMailingAddressIcon).size() == 0);
	}

	public void verifyUserCanDeleteMailingAddressInPartnerModule() {
		sleep(3000);
		driver.findElement(viewCustomPartnerIcon).click();
		sleep(3000);
		driver.findElement(deleteMailingAddressIcon).click();
		sleep(3000);
		driver.findElement(confirmDeleteButton).click();
	}

	public void createProfileDeleteMailingAddress() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddOrDeleteMailingAddressInPartnerModule() {
		sleep(3000);
		Assert.assertTrue(driver.findElements(newMailingAddressButton).size() == 0);
		Assert.assertTrue(driver.findElements(deleteMailingAddressIcon).size() == 0);
	}

	public void verifyUserCanEditMailingAddressInPartnerModule() {
		sleep(3000);
		driver.findElement(viewCustomPartnerIcon).click();
		sleep(3000);
		driver.findElement(editMailingAddressIcon).click();
		sleep(3000);
		driver.findElement(zipCodeField).clear();
		String zipCodeValue = Hooks.prop.getProperty("zipCode");
		driver.findElement(zipCodeField).sendKeys(zipCodeValue);
		driver.findElement(saveButton).click();
	}

	public void createProfileEditMailingAddress() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrDeleteMailingAddressInPartnerModule() {
		sleep(3000);
		Assert.assertTrue(driver.findElements(editMailingAddressIcon).size() == 0);
		Assert.assertTrue(driver.findElements(deleteMailingAddressIcon).size() == 0);
	}

	public void verifyUserCanAddMailingAddressInPartnerModule() {
		sleep(3000);
		driver.findElement(viewCustomPartnerIcon).click();
		sleep(3000);
		driver.findElement(newMailingAddressButton).click();
		sleep(3000);
		String streetValue = Hooks.prop.getProperty("street");
		String cityValue = Hooks.prop.getProperty("city");
		String stateValue = Hooks.prop.getProperty("state");
		String zipCodeValue = Hooks.prop.getProperty("zipCode");
		driver.findElement(streetField).sendKeys(streetValue);
		driver.findElement(cityField).sendKeys(cityValue);
		driver.findElement(stateField).sendKeys(stateValue);
		driver.findElement(zipCodeField).sendKeys(zipCodeValue);
		driver.findElement(saveButton).click();
	}

	// Business Address
	public void verifyUserCannotAddOrEditBusinessAddressInPartnerModule() {
		sleep(3000);
		Assert.assertTrue(driver.findElements(newBusinessAddressButton).size() == 0);
		Assert.assertTrue(driver.findElements(editBusinessAddressIcon).size() == 0);
	}

	public void verifyUserCanDeleteBusinessAddressInPartnerModule() {
		sleep(3000);
		driver.findElement(viewCustomPartnerIcon).click();
		sleep(3000);
		driver.findElement(deleteBusinessAddressIcon).click();
		sleep(3000);
		driver.findElement(confirmDeleteButton).click();
	}

	public void verifyUserCannotAddOrDeleteBusinessAddressInPartnerModule() {
		sleep(3000);
		Assert.assertTrue(driver.findElements(newBusinessAddressButton).size() == 0);
		Assert.assertTrue(driver.findElements(deleteBusinessAddressIcon).size() == 0);
	}

	public void verifyUserCanEditBusinessAddressInPartnerModule() {
		sleep(3000);
		driver.findElement(viewCustomPartnerIcon).click();
		sleep(3000);
		driver.findElement(editBusinessAddressIcon).click();
		sleep(3000);
		driver.findElement(primaryAddressCheckbox).click();
		driver.findElement(saveButton).click();
	}

	public void verifyUserCannotEditOrDeleteBusinessAddressInPartnerModule() {
		sleep(3000);
		Assert.assertTrue(driver.findElements(editBusinessAddressIcon).size() == 0);
		Assert.assertTrue(driver.findElements(deleteBusinessAddressIcon).size() == 0);
	}

	public void verifyUserCanAddBusinessAddressInPartnerModule() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(viewCustomPartnerIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(newBusinessAddressOption)).click();
		String streetValue = Hooks.prop.getProperty("street");
		String cityValue = Hooks.prop.getProperty("city");
		String stateValue = Hooks.prop.getProperty("state");
		String zipCodeValue = Hooks.prop.getProperty("zipCode");
		wait.until(ExpectedConditions.visibilityOfElementLocated(streetField)).sendKeys(streetValue);
		wait.until(ExpectedConditions.visibilityOfElementLocated(cityField)).sendKeys(cityValue);
		wait.until(ExpectedConditions.visibilityOfElementLocated(stateField)).sendKeys(stateValue);
		wait.until(ExpectedConditions.visibilityOfElementLocated(zipCodeField)).sendKeys(zipCodeValue);
		wait.until(ExpectedConditions.elementToBeClickable(saveButtonAddress)).click();
	}

	public void createProfileAddBusinessAddress() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createProfileAddMailingAddress() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createProfileDeleteBusinessAddress() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createProfileEditBusinessAddress() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Custom Partners
	public void verifyUserCannotAddEditOrDeleteCustomPartnersInPartnerModule() {
		sleep(3000);
		List<WebElement> newButtons = driver.findElements(newPartnerButton);
		if (newButtons.isEmpty()) {
			System.out.println("New Partner button is not visible.");
		} else {
			System.out.println("New Partner button is visible.");
		}

		sleep(3000);
		driver.findElement(bucketDropdownIcon).click();
		sleep(2000);

		List<WebElement> editElements = driver.findElements(editOption);
		if (editElements.isEmpty()) {
			System.out.println("Edit option is not visible.");
		} else {
			System.out.println("Edit option is visible.");
		}

		List<WebElement> deleteElements = driver.findElements(deleteOption);
		if (deleteElements.isEmpty()) {
			System.out.println("Delete option is not visible.");
		} else {
			System.out.println("Delete option is visible.");
		}
	}

	public void verifyUserCanViewAndSeeDetailsOfCustomPartnersInPartnerModule() {
		sleep(3000);
		driver.findElement(viewCustomPartnerIcon).click();
		sleep(3000);
	}

	public void verifyViewOnlyAccessToCustomPartnersProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddOrEditCustomPartnersInPartnerModule() {
		sleep(3000);
		List<WebElement> newButtons = driver.findElements(newPartnerButton);
		if (newButtons.isEmpty()) {
			System.out.println("New Partner button is not visible.");
		} else {
			System.out.println("New Partner button is visible.");
		}

		sleep(3000);
		driver.findElement(bucketDropdownIcon).click();
		sleep(2000);

		List<WebElement> editElements = driver.findElements(editOption);
		if (editElements.isEmpty()) {
			System.out.println("Edit option is not visible.");
		} else {
			System.out.println("Edit option is visible.");
		}
	}

	public void verifyUserCanDeleteCustomPartnersInPartnerModule() {
		sleep(3000);
		driver.findElement(bucketDropdownIcon).click();
		sleep(2000);
		driver.findElement(deleteOption).click();
		sleep(3000);
		driver.findElement(confirmDeleteButton).click();
		sleep(2000);
	}

	public void verifyDeleteOnlyAccessToCustomPartnersProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddOrDeleteCustomPartnersInPartnerModule() {
		sleep(3000);
		List<WebElement> newButtons = driver.findElements(newPartnerButton);
		if (newButtons.isEmpty()) {
			System.out.println("New Partner button is not visible.");
		} else {
			System.out.println("New Partner button is visible.");
		}

		sleep(3000);
		driver.findElement(bucketDropdownIcon).click();
		sleep(2000);
		List<WebElement> deleteElements = driver.findElements(deleteOption);
		if (deleteElements.isEmpty()) {
			System.out.println("Delete option is not visible.");
		} else {
			System.out.println("Delete option is visible.");
		}
	}

	public void verifyUserCanEditCustomPartnersInPartnerModule() {
		sleep(3000);
		driver.findElement(bucketDropdownIcon).click();
		sleep(2000);
		driver.findElement(editOption).click();
		sleep(3000);
		driver.findElement(wednesdayCheckbox).click();
		sleep(2000);
		driver.findElement(saveButton).click();
	}

	public void verifyEditOnlyAccessToCustomPartnersProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrDeleteCustomPartnersInPartnerModule() {
		sleep(3000);
		driver.findElement(bucketDropdownIcon).click();
		sleep(2000);
		List<WebElement> editElements = driver.findElements(editOption);
		List<WebElement> deleteElements = driver.findElements(deleteOption);
		if (editElements.isEmpty() && deleteElements.isEmpty()) {
			System.out.println("Edit and Delete options are not visible.");
		} else {
			System.out.println("Edit or Delete option is visible.");
		}
	}

	public void openAttorneyPartnersUrl(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
	}

	public void openCustomPartnersUrl(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));
	}

	public void verifyUserCanAddCustomPartnersInPartnerModule() {
		sleep(3000);
		driver.findElement(newPartnerButton).click();
		sleep(3000);
		String partnerBusinessNameValue = Hooks.prop.getProperty("partnerBusinessName");
		String partnerPhoneNumberValue = Hooks.prop.getProperty("partnerPhoneNumber");
		driver.findElement(partnerBusinessNameField).sendKeys(partnerBusinessNameValue);
		driver.findElement(partnerPhoneNumberField).sendKeys(partnerPhoneNumberValue);
		driver.findElement(saveButton).click();
	}

	// Special Service
	public void verifyDeleteOnlyAccessToPartnerTypeProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotAddSpecialServiceInPartnerModule() {
		sleep(3000);
		List<WebElement> newButtons = driver.findElements(newSpecialServiceButton);

		if (newButtons.isEmpty()) {
			System.out.println("New Special Service button is not visible.");
		} else {
			System.out.println("New Special Service button is visible.");
		}
	}

	public void verifyUserCanEditSpecialServiceInPartnerModule() {
		sleep(3000);
		driver.findElement(editSpecialServiceIcon).click();
		sleep(2000);
		String specialServiceTitleValue = Hooks.prop.getProperty("specialServiceTitle");
		WebElement titleField = driver.findElement(specialServiceTitleField);
		titleField.clear();
		titleField.sendKeys(specialServiceTitleValue);
		driver.findElement(saveButton).click();
	}

	public void verifyAddOnlyAccessToSpecialServiceProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyAddOnlyAccessToCustomPartnersProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserWithEditOnlyAccessCanEditSpecialServiceInPartnerModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void openAddSpecialServiceUrl(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/SpecialServices"));
	}

	public void verifyUserCannotEditSpecialServiceInPartnerModule() {
		sleep(3000);
		List<WebElement> editIcons = driver.findElements(editSpecialServiceIcon);

		if (editIcons.isEmpty()) {
			System.out.println("Edit Special Service option is not visible.");
		} else {
			System.out.println("Edit Special Service option is visible.");
		}
	}

	public void verifyUserCanAddSpecialServiceInPartnerModule() {
		sleep(3000);
		driver.findElement(newSpecialServiceButton).click();
		sleep(2000);
		String specialServiceTitleValue = Hooks.prop.getProperty("specialServiceTitle");
		WebElement titleField = driver.findElement(specialServiceTitleField);
		titleField.sendKeys(specialServiceTitleValue);
		driver.findElement(saveButton).click();
	}

	// Partner Type
	public void verifyUserCannotAddOrEditPartnerTypeInPartnerModule() {
		sleep(3000);
		List<WebElement> newButton = driver.findElements(newPartnerTypeButton);

		if (newButton.isEmpty()) {
			System.out.println("New Partner Type button is not visible.");
		} else {
			System.out.println("New Partner Type button is visible.");
		}

		driver.findElement(bucketDropdownIcon).click();
		sleep(2000);

		List<WebElement> editElements = driver.findElements(editOption);

		if (editElements.isEmpty()) {
			System.out.println("Edit option is not visible.");
		} else {
			System.out.println("Edit option is visible.");
		}
	}

	public void verifyUserCanDeletePartnerTypeInPartnerModule() {
		sleep(3000);
		driver.findElement(bucketDropdownIcon).click();
		sleep(2000);
		driver.findElement(deleteOption).click();
		sleep(2000);
		driver.findElement(confirmDeleteButton).click();
	}

	public void verifyUserCannotAddOrDeletePartnerTypeInPartnerModule() {
		sleep(3000);
		List<WebElement> newButton = driver.findElements(newPartnerTypeButton);

		if (newButton.isEmpty()) {
			System.out.println("New Partner Type button is not visible.");
		} else {
			System.out.println("New Partner Type button is visible.");
		}

		driver.findElement(bucketDropdownIcon).click();
		sleep(2000);

		List<WebElement> deleteElements = driver.findElements(deleteOption);

		if (deleteElements.isEmpty()) {
			System.out.println("Delete option is not visible.");
		} else {
			System.out.println("Delete option is visible.");
		}
	}

	public void verifyUserCanEditPartnerTypeInPartnerModule() {
		sleep(3000);
		driver.findElement(bucketDropdownIcon).click();
		sleep(2000);
		driver.findElement(editOption).click();
		sleep(2000);
		String partnerTypeNameValue = Hooks.prop.getProperty("partnerTypeName");
		String partnerTypeLabelValue = Hooks.prop.getProperty("partnerTypeLabel");
		WebElement nameField = driver.findElement(partnerTypeNameField);
		nameField.clear();
		nameField.sendKeys(partnerTypeNameValue);
		WebElement labelField = driver.findElement(partnerTypeLabelField);
		labelField.clear();
		labelField.sendKeys(partnerTypeLabelValue);
		driver.findElement(saveButton).click();
	}

	public void verifyUserWithEditOnlyAccessCanEditPartnerTypeInPartnerModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCannotEditOrDeletePartnerTypeInPartnerModule() {
		sleep(3000);
		driver.findElement(bucketDropdownIcon).click();
		sleep(2000);
		List<WebElement> editElements = driver.findElements(editOption);
		List<WebElement> deleteElements = driver.findElements(deleteOption);
		if (editElements.isEmpty() && deleteElements.isEmpty()) {
			System.out.println("Edit and Delete options are not visible.");
		} else {
			System.out.println("Edit or Delete option is visible.");
		}
	}

	public void openAddPartnerTypeUrl(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PartnerTypes"));
	}

	public void verifyUserCanAddPartnerTypeInPartnerModule() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(newPartnerTypeButton)).click();
		String partnerTypeNameValue = Hooks.prop.getProperty("partnerTypeName");
		String partnerTypeLabelValue = Hooks.prop.getProperty("partnerTypeLabel");
		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerTypeNameField)).sendKeys(partnerTypeNameValue);
		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerTypeLabelField))
				.sendKeys(partnerTypeLabelValue);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void testAddAccessOnlyForPartnerType() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Audit View
	public void verifyUserCannotViewGeneralAuditViewInPartnerModule() {
		sleep(3000);
		List<WebElement> errorHeaders = driver.findElements(errorHeader);

		if (!errorHeaders.isEmpty()) {
			System.out.println("Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}
	}

	public partnerpage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void verifyNoAccessToGeneralAuditView() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void verifyUserCanViewGeneralAuditViewInPartnerModule() {
		sleep(3000);
		assertElementPresent(createdByColumn);
		assertElementPresent(createdDateColumn);
	}

	// Profile Page
	public void openfullGeneralAuditViewUrl(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions
				.urlContains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
	}

	public void openPartnerProfilesPage(String fullUrl) {
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

	public void ToPartnerModuleGeneral() {
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

	public void sleep(long millis) {
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
}
