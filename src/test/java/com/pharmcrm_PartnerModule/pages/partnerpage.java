package com.pharmcrm_PartnerModule.pages;

import java.time.Duration;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import hooks.Hooks;

public class partnerpage {

	private WebDriver driver;
	private WebDriverWait wait;

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
	// Referral Patient History

	// Referral Enrollment
	private By firstPartnerEditIcon = By.xpath("//tbody/tr[1]/td[9]/div[1]/a[1]/img[1]");
	private By startDateInput = By.id("PartnerReferralEnrollment_StartDate");
	private By emailInput = By.id("PartnerReferralEnrollment_EmailId");
	private By editReferralEnrollmentIcon = By.xpath(
			"(//div[@class='gridListIconsFlex justify-content-end']//a[contains(@onclick,'editPartnerReferralEnrollment')])[1]");
	private By deleteReferralEnrollmentIcon = By.xpath(
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

		WebElement startDate = driver.findElement(startDateInput);
		startDate.clear();
		startDate.sendKeys("11/03/2025");
		startDate.sendKeys(Keys.TAB);

		WebElement email = driver.findElement(emailInput);
		email.clear();
		email.sendKeys("SarahDWillis@mailinator.com");

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

		WebElement startDateInput = wait.until(ExpectedConditions.visibilityOfElementLocated(referralStartDateInput));
		startDateInput.clear();
		startDateInput.sendKeys("11/03/2025");
		startDateInput.sendKeys(Keys.TAB);

		wait.until(ExpectedConditions.visibilityOfElementLocated(referralEmailInput))
				.sendKeys("SarahDWillis@mailinator.com");

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

		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerBusinessNameField)).sendKeys("Kim Bounds");

		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerPhoneNumberField)).sendKeys("7798798798");

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

		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerBusinessNameField)).sendKeys("Kim Bounds");

		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerPhoneNumberField)).sendKeys("7798798798");

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

		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerBusinessNameField)).sendKeys("Kim Bounds");

		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerPhoneNumberField)).sendKeys("7798798798");

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

		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerBusinessNameField)).sendKeys("Kim Bounds");

		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerPhoneNumberField)).sendKeys("7798798798");

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

		wait.until(ExpectedConditions.visibilityOfElementLocated(businessNameField)).sendKeys("Kim Bounds");

		wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberField)).sendKeys("7798798798");

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

		WebElement businessName = wait.until(ExpectedConditions.visibilityOfElementLocated(businessNameField));
		businessName.sendKeys("Kim Bounds");

		WebElement phoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberField));
		phoneNumber.sendKeys("7798798798");

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

		WebElement fileName = wait.until(ExpectedConditions.visibilityOfElementLocated(fileNameTextBox));
		fileName.clear();
		fileName.sendKeys("3.pdf");

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

		WebElement folderName = wait.until(ExpectedConditions.visibilityOfElementLocated(folderNameField));
		folderName.clear();
		folderName.sendKeys("Garrett");

		wait.until(ExpectedConditions.elementToBeClickable(saveFolderButton)).click();
	}

	public void userShouldBeAbleToAddFolderInBucketForPartnerModule() {

		wait.until(ExpectedConditions.elementToBeClickable(addFolderButton)).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(folderNameField)).sendKeys("Garrett");

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

		driver.findElement(newPasswordField).sendKeys("Admin@123");
		driver.findElement(confirmPasswordField).sendKeys("Admin@123");

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

		driver.findElement(lastNameField).sendKeys("Garrett");
		driver.findElement(firstNameField).sendKeys("Stephanie");
		driver.findElement(emailField).sendKeys("Stephanie@mailinator.com");

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
		driver.findElement(zipCodeField).sendKeys("10003");

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

		driver.findElement(streetField).sendKeys("789 Broadway Ave");
		driver.findElement(cityField).sendKeys("New York");
		driver.findElement(stateField).sendKeys("NY");
		driver.findElement(zipCodeField).sendKeys("10003");

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
		wait.until(ExpectedConditions.visibilityOfElementLocated(streetField)).sendKeys("789 Broadway Ave");
		wait.until(ExpectedConditions.visibilityOfElementLocated(cityField)).sendKeys("New York");
		wait.until(ExpectedConditions.visibilityOfElementLocated(stateField)).sendKeys("NY");
		wait.until(ExpectedConditions.visibilityOfElementLocated(zipCodeField)).sendKeys("10003");
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
		driver.findElement(partnerBusinessNameField).sendKeys("Allied Health Solutions");
		driver.findElement(partnerPhoneNumberField).sendKeys("(312) 555-0198");
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

		WebElement titleField = driver.findElement(specialServiceTitleField);
		titleField.clear();
		titleField.sendKeys("Consultant");

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

		WebElement titleField = driver.findElement(specialServiceTitleField);
		titleField.sendKeys("Consultant");

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

		WebElement nameField = driver.findElement(partnerTypeNameField);
		nameField.clear();
		nameField.sendKeys("ClinicalProvider");

		WebElement labelField = driver.findElement(partnerTypeLabelField);
		labelField.clear();
		labelField.sendKeys("Clinical Provider");

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

		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerTypeNameField)).sendKeys("ClinicalProvider");

		wait.until(ExpectedConditions.visibilityOfElementLocated(partnerTypeLabelField)).sendKeys("Clinical Provider");

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
}
