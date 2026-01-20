package com.pharmcrm_DeliveryModule.pages;

import java.io.File;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class deliverypage {

	// Package Plan Restriction
	private By packagePlanRestrictionIcon = By.xpath("//*[name()='path' and contains(@d,'m211 91v21')]");
	private By packagePlanIcon = By.xpath("//*[name()='path' and contains(@d,'m211 91v21')]");

	private By packagePlanInput = By.id("Package_Plan");

	private By packageActionDropdownRow1 = By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/button[1]/i[1]");

	private By editPackageOption = By
			.xpath("//div[contains(@class,'gridRecordContext')]//span[contains(text(),'Edit')]");

	// Delivery Setting
	private By packageRestrictionHeader = By.xpath("//h6[normalize-space()='Package Restriction']");

	// Package
	private By filterBtn = By.xpath("//span[normalize-space()='Filter']");
	private By logisticDropdown = By.id("Filter_LogisticId");
	private By searchBtn = By.xpath("//i[@class='fa-solid fa-magnifying-glass']");
	private By syncLogisticHistoryBtn = By.xpath("//button[normalize-space()='Sync Logistic History']");
	private By printPickupPackagesBtn = By.xpath("//span[normalize-space()='Print Pickup Packages']");
	private By closePickupPrintModalBtn = By
			.xpath("//button[@onclick='return CloseGenerateCollectionLabel()']//i[@class='fa fa-times']");
	private By packageActionDropdownRow2 = By.xpath("//tbody/tr[2]/td[12]/div[1]/div[1]/button[1]/i[1]");
	private By shareToHarbourOption = By
			.xpath("//div[contains(@class,'gridRecordContext')]//span[normalize-space()='Share To Harbour']");
	private By shareConfirmBtn = By.id("btnShareConfirm");
	private By packageDetailIconRow5 = By.xpath("//tbody/tr[5]/td[12]/div[1]/a[1]/img[1]");
	private By printPackageBtn = By.xpath("//div[@class='mb-5']//button[normalize-space()='Print']");
	private By packageInformationCheckbox = By.xpath("//label[normalize-space()='Package Information']");
	private By closePrintModalBtn = By
			.xpath("//button[@onclick='javascript: ClosePrintModal();']//i[@class='fa fa-times']");
	private By packageDetailIcon = By.xpath("//tbody/tr[3]/td[12]/div[1]/a[1]/img[1]");
	private By generateInvoiceBtn = By.xpath("//button[normalize-space()='Generate Invoice']");
	private By invoiceFirstName = By.id("Invoice_FirstName");
	private By invoiceBillingEmail = By.id("Invoice_BillingEmail");
	private By prescriptionNumber = By.id("InvoiceDetail_PrescriptionNumber");
	private By rxDropdownInput = By
			.xpath("//div[@class='model-inp select-city-dd dropdowncheckbox']//input[@type='text']");
	private By rxOption = By.xpath("//label[span[normalize-space()='Rx']]");
	private By invoiceDescription = By.id("InvoiceDetail_Description");
	private By invoiceQuantity = By.id("InvoiceDetail_Quantity");
	private By invoiceCopay = By.id("InvoiceDetail_CoPay");
	private By addInvoiceDetailBtn = By.id("btnInvoiceDetail");
	private By patientEmail = By.id("Invoice_PatientEmail");
	private By patientEmailCheckbox = By.xpath("//label[@for='ChkInvoice_PatientEmail']");
	private By billToFirstName = By.id("Invoice_InvoiceBillTo_BillToFirstName");
	private By saveAndSendBtn = By.id("btnSaveAndSend");
	private By addCustomerAttestationBtn = By.xpath("//span[normalize-space()='Add Customer Attestation']");
	private By saveAttestationBtn = By.id("btnSavePackageCustomerAttestation");
	private By rxNumberInput = By.id("PackageCustomerAttestation_RxNumber");
	private By patientNameInput = By.id("PackageCustomerAttestation_PatientName");
	private By medicationInput = By.id("PackageCustomerAttestation_Medication");
	private By receivedFromInput = By.id("PackageCustomerAttestation_ReceivedFrom");
	private By filledDateInput = By.id("PackageCustomerAttestation_FilledDate");
	private By receivedDateInput = By.id("PackageCustomerAttestation_ReceivedDate");
	private By addressReceiverInput = By.id("PackageCustomerAttestation_AddressReceiver");
	private By receiverNameInput = By.id("PackageCustomerAttestation_ReceiverName");
	private By patientRelationInput = By.id("PackageCustomerAttestation_PatientRelation");
	private By phoneNumberInput = By.id("PackageCustomerAttestation_PhoneNumber");
	private By closePrintLabelBtn = By.xpath("//button[@onclick='ClosePrintLabel();']//i[@class='fa fa-times']");
	private By sendForSignatureBtn = By.xpath("//a[@title='Send For Signature To Customer']//*[name()='svg']");
	private By emailOption = By.xpath("//a[normalize-space()='Email']");
	private By signatureOptionsMenu = By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']");
	private By printOption = By.xpath("//div[contains(@class,'gridRecordContextInner')]//span[text()='Print']");
	private By signatureDownloadLink = By.xpath("//a[contains(text(),'.png')]");
	private By signatureFileInput = By.id("flSignature");
	private By uploadSignatureButton = By.id("btnUploadSignature");
	private By referenceDocumentLink = By.xpath("//a[contains(text(),'.pdf')]");
	private By deliveryInitiatedCheckbox = By.id("DeliveryInitiated");
	private By saveStatusNotesButton = By.id("btnSaveStatusNotes");
	private By generateLabelOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[text()='Generate Label']");
	private By firstPackageDetailIcon = By.xpath("//tbody/tr[1]/td[12]//a//img");
	private By confirmDeleteButton = By.id("btnDeleteConfirm");
	private By addOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[text()='Add']");
	private By packageDropdownBtn = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	private By packageeditOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[text()='Edit']");
	private By cityInputField = By.id("Package_ShippingAddress_City");
	By packageDropdownButton = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	By newPackageButton = By.xpath("//span[normalize-space()='New Package']");
	By nextButton = By.id("btnNext");
	By copyAddressButton = By.xpath("//a[@class='copyAddressMain']//*[name()='svg']");
	By logisticCompanyDropdown = By.id("Package_LogisticCompany_Id");
	By stateDropdown = By.id("ddState");
	By trackingNumberField = By.id("Package_TrackingNumber");
	By customerNameField = By.id("Package_CustomerName");
	By customerContactField = By.id("Package_CustomerContactNumber1");
	By streetField = By.id("Package_ShippingAddress_Street");
	By cityField = By.id("Package_ShippingAddress_City");
	By zipCodeField = By.id("Package_ShippingAddress_ZipCode");
	By addressInputField = By.id("travelto");
	By shippingDateInput = By.id("Package_ShippingDate");
	By datePickerYearDropdown = By.xpath("//select[contains(@class,'ui-datepicker-year')]");
	By datePickerMonthDropdown = By.xpath("//select[contains(@class,'ui-datepicker-month')]");
	Function<Integer, By> datePickerDay = day -> By.xpath("//td[normalize-space()='" + day + "']");
	By addressSuggestion = By.cssSelector(".pac-item");
	By packageAllCheckbox = By.xpath("//label[@for='chkg04PackageAll']");
	By packageAddCheckbox = By.xpath("//label[@for='chkg04PackageAdd']");
	By packageEditCheckbox = By.xpath("//label[@for='chkg04PackageEdit']");
	By packageDeleteCheckbox = By.xpath("//label[@for='chkg04PackageDelete']");

	// Delivery Marker

	By DeliveryMarkerconfirmDeleteButton = By.id("submitDeleteDeliveryMarker");
	By DeliveryMarkerdeleteOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Delete']");
	By DeliveryMarkeractionMenu = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	By DeliveryMarkereditOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Edit']");
	By markerNameInput = By.id("DeliveryMarker_Name");
	By travelToInput = By.id("travelto");
	By DeliveryMarkersaveButton = By.id("btnSave");
	By deliveryMarkerAll = By.xpath("//label[@for='chkg44DeliveryMarkerAll']");
	By deliveryMarkerAdd = By.xpath("//label[@for='chkg44DeliveryMarkerAdd']");
	By newDeliveryMarkerBtn = By.xpath("//span[normalize-space()='New Delivery Marker']");
	By deliveryMarkerName = By.id("DeliveryMarker_Name");
	By travelTo = By.id("travelto");
	By startingPoint = By.xpath("//label[normalize-space()='Starting Point']");
	By deliverysaveButton = By.id("btnSave");
	By DeliveryactionMenu = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	By DeliveryeditOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Edit']");
	By DeliverydeleteOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Delete']");
	By deliveryMarkerEdit = By.xpath("//label[@for='chkg44DeliveryMarkerEdit']");
	By deliveryMarkerDelete = By.xpath("//label[@for='chkg44DeliveryMarkerDelete']");

	// Logistic Company
	By logisticAllLabel = By.xpath("//label[@for='chkg04LogisticAll']");
	By logisticAddLabel = By.xpath("//label[@for='chkg04LogisticAdd']");
	private By newLogisticCompanyButton = By.xpath("//span[normalize-space()='New Logistic Company']");
	private By logisticNameInput = By.id("LogisticCompany_Name");
	private By deliveryRadioButton = By.id("rbtnDelivery");
	private By logisticsubmitButton = By
			.xpath("//button[@class='btn btn-primary waves-effect waves-light' and normalize-space()='Submit']");
	By logisticEditLabel = By.xpath("//label[@for='chkg04LogisticEdit']");
	By logisticDeleteLabel = By.xpath("//label[@for='chkg04LogisticDelete']");

	// Delivery Distances
	By deliveryDistancesAllLabel = By.xpath("//label[@for='chkg04DeliveryDistancesAll']");
	By deliveryDistancesAddLabel = By.xpath("//label[@for='chkg04DeliveryDistancesAdd']");
	private By newDeliveryDistanceButton = By.xpath("//span[normalize-space()='New Delivery Distance']");
	private By zipCodeInput = By.id("DeliveryDistance_ZipCode");
	private By cityInput = By.id("DeliveryDistance_City");
	private By countyInput = By.id("DeliveryDistance_County");
	private By radiusInput = By.id("DeliveryDistance_Radius");
	private By DeliveryDistancesaveButton = By.id("btnSave");
	private By firstRowActionMenu = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	private By editOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[contains(text(),'Edit')]");
	private By deleteOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[contains(text(),'Delete')]");
	By deliveryDistancesEditLabel = By.xpath("//label[@for='chkg04DeliveryDistancesEdit']");
	By deliveryDistancesDeleteLabel = By.xpath("//label[@for='chkg04DeliveryDistancesDelete']");

	// Package Restriction
	By packageRestrictionAllLabel = By.xpath("//label[@for='chkg45PackageRestrictionAll']");
	By deletePackageRestrictionPlanLabel = By.xpath("//label[normalize-space()='Delete Package Restriction Plan']");
	By deletePackageRestrictionStateLabel = By.xpath("//label[normalize-space()='Delete Package Restriction State']");
	By packageRestrictionAddLabel = By.xpath("//label[@for='chkg45PackageRestrictionAdd']");
	By packageSettingAllLabel = By.xpath("//label[@for='chkg18PackageSettingAll']");
	private By errorHeader = By.xpath("//h2[normalize-space()='Error']");
	private By planInput = By.id("Plan");
	private By restrictionOption = By.xpath("//input[@value='2']");
	private By planDropdownToggle = By.xpath("//a[@id='btnPlan']//*[name()='svg']");
	private By packageRestrictionsaveButton = By.xpath("//button[@id='btnSave']");
	private By firstPlanDeleteIcon = By.xpath("//tbody/tr[1]/td[3]/div[1]/a[1]/img[1]");
	private By deleteConfirmButton = By.id("btnDeleteConfirmRestictedPlan");
	private By firstStateDeleteIcon = By.xpath("//tbody/tr[1]/td[2]/div[1]/a[1]/img[1]");
	private By deleteConfirmStateButton = By.id("btnDeleteConfirmRestictedState");

	// Package Setting
	By saveButton = By.id("btnSave");

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

	// General
	public By deliveryAuditViewCheckboxLabel = By.xpath("//label[@for='chkg37DeliveryAuditView']");

	private WebDriver driver;
	private WebDriverWait wait;

	// Package Plan Restriction

	public void verifyUserCannotAccessPackagePlanRestriction() {

		wait.until(ExpectedConditions.elementToBeClickable(packageActionDropdownRow1)).click();

		wait.until(ExpectedConditions.elementToBeClickable(editPackageOption)).click();

		wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();

		boolean isPresent = driver.findElements(packagePlanRestrictionIcon).size() > 0;
		Assert.assertFalse("User should NOT have access to Package Plan Restriction", isPresent);
	}

	public void createNoPackagePlanRestrictionAccessProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

	}

	public void verifyUserCanUpdatePackagePlanRestriction() {
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(packagePlanIcon));
		sleep(3000);
		WebElement planInput = wait.until(ExpectedConditions.elementToBeClickable(packagePlanInput));
		planInput.clear();
		planInput.sendKeys("100");
	}

	public void verifyUserCanViewPackagePlanRestriction() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(packageActionDropdownRow1)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(editPackageOption)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();
	}

	public void createPackagePlanRestrictionViewUpdateProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

	}
	// Delivery Setting

	public void verifyUserCannotAccessDeliverySetting() {

		boolean isPresent = driver.findElements(packageRestrictionHeader).size() > 0;
		Assert.assertFalse("User should not have access to Delivery Setting", isPresent);
	}

	public void createNoDeliverySettingsAccessProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

	}

	public void createDeliverySettingsViewUpdateProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

	}

	public void verifyUserCanUpdateDeliverySetting() {
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(packageRestrictionHeader));
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(packageRestrictionHeader)).click();
	}

	public void openDeliverySettingsPage(String url) {
		driver.get(url);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Settings"));
	}

	// Package

	public void openLogisticCompanyPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/LogisticCompanies"));
	}

	public void verifyUserCanSyncLogisticTrackingHistory() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(filterBtn)).click();
		sleep(3000);
		WebElement logisticSelect = wait.until(ExpectedConditions.elementToBeClickable(logisticDropdown));
		sleep(3000);
		new Select(logisticSelect).selectByIndex(1);
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(searchBtn)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPackageDetailIcon)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(syncLogisticHistoryBtn)).click();
	}

	public void verifyUserCanPrintPickupPackage() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(printPickupPackagesBtn)).click();
		sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.print();");
		sleep(3000);
		System.out.println("Pickup Package PDF auto-saved in Downloads folder");
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(closePickupPrintModalBtn)).click();
	}

	public void verifySharePackage() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(packageActionDropdownRow2)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(shareToHarbourOption)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(shareConfirmBtn)).click();
	}

	public void verifyUserCanPrintPackage() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(packageDetailIconRow5)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(printPackageBtn)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(packageInformationCheckbox)).click();
		sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.print();");
		sleep(3000);
		System.out.println("Package PDF auto-saved in Downloads folder");
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(closePrintModalBtn)).click();
	}

	public void verifyGeneratePackageInvoice() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(packageDetailIcon)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(generateInvoiceBtn)).click();
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(invoiceFirstName)).sendKeys("Miguel");
		sleep(3000);
		driver.findElement(invoiceBillingEmail).sendKeys("miguel.smith@mailinator.com");
		driver.findElement(prescriptionNumber).sendKeys("RX1234567");
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(rxDropdownInput)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(rxOption)).click();
		sleep(3000);
		driver.findElement(invoiceDescription).sendKeys("Atorvastatin 20mg Tablet");
		driver.findElement(invoiceQuantity).sendKeys("30");
		driver.findElement(invoiceCopay).sendKeys("15.00");
		wait.until(ExpectedConditions.elementToBeClickable(addInvoiceDetailBtn)).click();
		sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(patientEmail)).sendKeys("miguel.smith@mailinator.com");
		sleep(3000);
		driver.findElement(patientEmailCheckbox).click();
		sleep(3000);
		driver.findElement(billToFirstName).sendKeys("Miguel");
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(saveAndSendBtn)).click();
	}

	public void verifyDownloadAttestationDocuments() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(addCustomerAttestationBtn)).click();
		sleep(3000);
		waitAndSendKeys(rxNumberInput, "RX7845123");
		waitAndSendKeys(patientNameInput, "John A. Smith");
		waitAndSendKeys(medicationInput, "Atorvastatin 20mg Tablet");
		waitAndSendKeys(receivedFromInput, "CVS Pharmacy");
		selectFutureDate(filledDateInput, 5, wait);
		selectFutureDate(receivedDateInput, 5, wait);
		waitAndSendKeys(addressReceiverInput, "742 Evergreen Terrace, Springfield, IL 62704");
		waitAndSendKeys(receiverNameInput, "Mary Smith");
		waitAndSendKeys(patientRelationInput, "Spouse");
		waitAndSendKeys(phoneNumberInput, "2175558945");
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(saveAttestationBtn)).click();
	}

	private void selectFutureDate(By dateInput, int daysInFuture, WebDriverWait wait) {

		LocalDate futureDate = LocalDate.now().plusDays(daysInFuture);
		int day = futureDate.getDayOfMonth();
		int year = futureDate.getYear();
		String month = futureDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);

		wait.until(ExpectedConditions.elementToBeClickable(dateInput)).click();

		WebElement yearDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(datePickerYearDropdown));
		new Select(yearDropdown).selectByVisibleText(String.valueOf(year));

		WebElement monthDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(datePickerMonthDropdown));
		new Select(monthDropdown).selectByVisibleText(month);

		WebElement dayToSelect = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[normalize-space()='" + day + "']")));
		dayToSelect.click();
	}

	public void verifySendPackageForSignature() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(closePrintLabelBtn)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(sendForSignatureBtn)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(emailOption)).click();
	}

	public void verifyPrintSignature() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(signatureOptionsMenu)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(printOption)).click();
		sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.print();");
		sleep(3000);
		System.out.println("Patient signature PDF auto-saved in Downloads folder");
	}

	public void verifyDownloadSignature() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(signatureDownloadLink)).click();
	}

	public void verifyUploadSignature() {
		sleep(3000);
		String relativePath = "src/test/resources/Documents/blank.pdf";
		sleep(3000);
		String filePath = new File(relativePath).getAbsolutePath();
		sleep(3000);
		WebElement fileInput = wait.until(ExpectedConditions.visibilityOfElementLocated(signatureFileInput));
		fileInput.sendKeys(filePath);
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(uploadSignatureButton)).click();

	}

	public void verifyUserCanDownloadReferenceDocuments() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(referenceDocumentLink)).click();
	}

	public void verifyUserCanUpdateDeliveryStatus() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPackageDetailIcon)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(deliveryInitiatedCheckbox)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(saveStatusNotesButton)).click();
	}

	public void verifyUserCanGeneratePackageLabel() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(packageDropdownBtn)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(generateLabelOption)).click();
	}

	public void createFullAccessProfileForDeliveryPackage() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

	}

	public void verifyUserCanAccessPackageDetail() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPackageDetailIcon)).click();
		sleep(3000);
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Package"));
	}

	public void verifyUserCannotAddOrEditPackage() {
		sleep(3000);
		Assert.assertTrue("New Package button is visible", driver.findElements(newPackageButton).isEmpty());
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(packageDropdownBtn)).click();
		sleep(3000);
		Assert.assertTrue("Edit option is visible", driver.findElements(editOption).isEmpty());
	}

	public void verifyUserCanViewAndDeletePackage() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(packageDropdownBtn)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(deleteOption)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();
	}

	public void verifyUserCannotAddOrDeletePackage() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(packageDropdownBtn)).click();
		sleep(3000);
		Assert.assertTrue("Add option is visible", driver.findElements(addOption).isEmpty());
		Assert.assertTrue("Delete option is visible", driver.findElements(deleteOption).isEmpty());
	}

	public void verifyUserCanViewAndEditPackage() {
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(packageDropdownBtn)).click();
		sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(packageeditOption)).click();
		sleep(3000);
		WebElement cityField = wait.until(ExpectedConditions.visibilityOfElementLocated(cityInputField));
		cityField.clear();
		cityField.sendKeys("4646545767");
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void checkCannotEditDeletePackage() {
		sleep(3000);
		clickWhenClickable(packageDropdownButton);
		sleep(2000);
		assertElementNotPresent(editOption);
		assertElementNotPresent(deleteOption);
	}

	public void packagesPagePath(String url) {
		driver.get(url);
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Packages?category=1"));
	}

	public void assertElementNotPresent(By locator) {
		List<WebElement> elements = driver.findElements(locator);
		Assert.assertTrue("Element should not be present: " + locator.toString(), elements.isEmpty());
	}

	public void checkViewAddPackage() {
		sleep(3000);
		clickWhenClickable(newPackageButton);
		sleep(5000);
		clickWhenClickable(nextButton);
		sleep(2000);
		clickWhenClickable(logisticCompanyDropdown);
		selectDropdownByIndexWhenReady(logisticCompanyDropdown, 6);
		sleep(2000);
		waitAndSendKeys(trackingNumberField, "3477568");
		clickWhenClickable(shippingDateInput);
		LocalDate futureDate = LocalDate.now().plusDays(5);
		int day = futureDate.getDayOfMonth();
		int year = futureDate.getYear();
		String month = futureDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
		new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(datePickerYearDropdown)))
				.selectByVisibleText(String.valueOf(year));
		new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(datePickerMonthDropdown)))
				.selectByVisibleText(month);
		clickWhenClickable(datePickerDay.apply(day));
		sleep(2000);
		waitAndSendKeys(customerNameField, "Miguel Frost");
		waitAndSendKeys(customerContactField, "4646545767");
		waitAndSendKeys(streetField, "4646545767");
		waitAndSendKeys(cityField, "4646545767");
		waitAndSendKeys(zipCodeField, "4646545767");
		sleep(2000);
		clickWhenClickable(stateDropdown);
		selectDropdownByIndexWhenReady(stateDropdown, 1);
		sleep(2000);
		WebElement addressInput = driver.findElement(addressInputField);
		addressInput.clear();
		addressInput.sendKeys("Prahlad Nagar, Ahmedabad, Gujarat, India");
		wait.until(ExpectedConditions.visibilityOfElementLocated(addressSuggestion));
		addressInput.sendKeys(Keys.ARROW_DOWN);
		addressInput.sendKeys(Keys.ENTER);
		sleep(2000);
		clickWhenClickable(copyAddressButton);
		sleep(2000);
		clickWhenClickable(saveButton);
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

	public void createDeliveryProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement packageRestrictionAll = wait.until(ExpectedConditions.elementToBeClickable(packageAllCheckbox));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement deletePackageRestrictionState = wait
				.until(ExpectedConditions.elementToBeClickable(packageAddCheckbox));
		deletePackageRestrictionState.click();

	}

	public void createDeliveryVD() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement packageRestrictionAll = wait.until(ExpectedConditions.elementToBeClickable(packageAllCheckbox));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement deletePackageRestrictionState = wait
				.until(ExpectedConditions.elementToBeClickable(packageDeleteCheckbox));
		deletePackageRestrictionState.click();

	}

	public void createProfileVE() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement packageRestrictionAll = wait.until(ExpectedConditions.elementToBeClickable(packageAllCheckbox));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement deletePackageRestrictionState = wait
				.until(ExpectedConditions.elementToBeClickable(packageEditCheckbox));
		deletePackageRestrictionState.click();

	}

	// Delivery Marker

	public void validateNoAddEditDeliveryMarkerAccess() {
		sleep(2000);
		Assert.assertTrue("New Delivery Marker button should not be visible",
				driver.findElements(newDeliveryMarkerBtn).isEmpty());
		sleep(2000);
		clickWhenClickable(actionMenu);
		sleep(2000);
		Assert.assertTrue("Edit option should not be visible", driver.findElements(editOption).isEmpty());
	}

	public void validateViewDeleteDeliveryMarker() {
		sleep(2000);
		clickWhenClickable(DeliveryMarkeractionMenu);
		sleep(2000);
		clickWhenClickable(DeliveryMarkerdeleteOption);
		sleep(2000);
		clickWhenClickable(DeliveryMarkerconfirmDeleteButton);
	}

	public void userCannotAddOrDeleteDeliveryMarker() {
		sleep(2000);
		Assert.assertTrue("New Delivery Marker button should not be visible",
				driver.findElements(newDeliveryMarkerBtn).isEmpty());
		sleep(2000);
		clickWhenClickable(DeliveryMarkeractionMenu);
		sleep(2000);
		Assert.assertTrue("Delete option should not be visible",
				driver.findElements(DeliveryMarkerdeleteOption).isEmpty());
	}

	public void validateViewEditDeliveryMarker() {
		sleep(2000);
		clickWhenClickable(DeliveryMarkeractionMenu);
		sleep(2000);
		clickWhenClickable(DeliveryMarkereditOption);
		sleep(2000);
		waitAndSendKeys(markerNameInput, "Pharmacy Main Store");
		waitAndSendKeys(travelToInput, "New York");
		sleep(2000);
		clickWhenClickable(startingPoint);
		sleep(2000);
		clickWhenClickable(DeliveryMarkersaveButton);
	}

	public void userCanViewAndAddDeliveryMarker() {
		sleep(2000);
		clickWhenClickable(newDeliveryMarkerBtn);
		sleep(2000);
		waitAndSendKeys(deliveryMarkerName, "Pharmacy Main Store");
		waitAndSendKeys(travelTo, "New York");
		clickWhenClickable(startingPoint);
		clickWhenClickable(deliverysaveButton);
	}

	public void userCannotEditOrDeleteDeliveryMarker() {
		sleep(2000);
		clickWhenClickable(DeliveryactionMenu);
		sleep(2000);
		Assert.assertTrue("Edit option should not be visible", driver.findElements(DeliveryeditOption).isEmpty());
		sleep(2000);
		Assert.assertTrue("Delete option should not be visible", driver.findElements(DeliverydeleteOption).isEmpty());
	}

	public void createDMViewAddProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement packageRestrictionAll = wait.until(ExpectedConditions.elementToBeClickable(deliveryMarkerAll));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement deletePackageRestrictionState = wait
				.until(ExpectedConditions.elementToBeClickable(deliveryMarkerAdd));
		deletePackageRestrictionState.click();

	}

	public void createDeliveryMarkerViewAndEditAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement packageRestrictionAll = wait.until(ExpectedConditions.elementToBeClickable(deliveryMarkerAll));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement deletePackageRestrictionState = wait
				.until(ExpectedConditions.elementToBeClickable(deliveryMarkerEdit));
		deletePackageRestrictionState.click();

	}

	public void createDeliveryMarkerViewAndDeleteAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement packageRestrictionAll = wait.until(ExpectedConditions.elementToBeClickable(deliveryMarkerAll));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement deletePackageRestrictionState = wait
				.until(ExpectedConditions.elementToBeClickable(deliveryMarkerDelete));
		deletePackageRestrictionState.click();

	}

	public void openDeliveryMarkerPage(String url) {
		driver.get(url);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryMarkers"));
	}
	// Logistic Company

	public void createProfileWithViewEditAccessLogisticCompany() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement packageRestrictionAll = wait.until(ExpectedConditions.elementToBeClickable(logisticAllLabel));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement deletePackageRestrictionState = wait
				.until(ExpectedConditions.elementToBeClickable(logisticEditLabel));
		deletePackageRestrictionState.click();

	}

	public void createProfileWithViewDeleteAccessLogisticCompany() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement packageRestrictionAll = wait.until(ExpectedConditions.elementToBeClickable(logisticAllLabel));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement deletePackageRestrictionState = wait
				.until(ExpectedConditions.elementToBeClickable(logisticDeleteLabel));
		deletePackageRestrictionState.click();

	}

	public void verifyUserCannotAddOrDeleteLogisticCompany() {
		sleep(2000);
		Assert.assertTrue("New Logistic Company button should not be visible",
				driver.findElements(newLogisticCompanyButton).isEmpty());
		sleep(2000);
		clickWhenClickable(firstRowActionMenu);
		sleep(2000);
		Assert.assertTrue("Delete option should not be visible", driver.findElements(deleteOption).isEmpty());
	}

	public void verifyUserCannotEditOrDeleteLogisticCompany() {
		sleep(2000);
		clickWhenClickable(firstRowActionMenu);
		sleep(2000);
		Assert.assertTrue("Edit option should not be visible", driver.findElements(editOption).isEmpty());
		Assert.assertTrue("Delete option should not be visible", driver.findElements(deleteOption).isEmpty());
	}

	public void verifyUserCannotAddOrEditLogisticCompany() {
		sleep(2000);
		Assert.assertTrue("New Logistic Company button should not be visible",
				driver.findElements(newLogisticCompanyButton).isEmpty());
		sleep(2000);
		clickWhenClickable(firstRowActionMenu);
		sleep(2000);
		Assert.assertTrue("Edit option should not be visible", driver.findElements(editOption).isEmpty());
	}

	public void userCanViewAndDeleteLogisticCompany() {
		sleep(2000);
		clickWhenClickable(firstRowActionMenu);
		sleep(2000);
		clickWhenClickable(deleteOption);
		sleep(2000);
		clickWhenClickable(deleteConfirmButton);
		sleep(2000);
	}

	public void userCanViewAndEditLogisticCompany() {
		sleep(2000);
		clickWhenClickable(firstRowActionMenu);
		sleep(2000);
		clickWhenClickable(editOption);
		sleep(2000);
		waitAndSendKeys(logisticNameInput, "Ryder Logistics");
		sleep(2000);
		clickWhenClickable(deliveryRadioButton);
		sleep(2000);
		clickWhenClickable(logisticsubmitButton);
		sleep(2000);
	}

	public void userCanViewAndAddLogisticCompany() {
		sleep(2000);
		clickWhenClickable(newLogisticCompanyButton);
		sleep(2000);
		waitAndSendKeys(logisticNameInput, "Ryder Logistics");
		sleep(2000);
		clickWhenClickable(deliveryRadioButton);
		sleep(2000);
		clickWhenClickable(logisticsubmitButton);
		sleep(2000);
	}

	public void createProfileWithViewAddAccessLogisticCompany() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement packageRestrictionAll = wait.until(ExpectedConditions.elementToBeClickable(logisticAllLabel));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement deletePackageRestrictionState = wait
				.until(ExpectedConditions.elementToBeClickable(logisticAddLabel));
		deletePackageRestrictionState.click();

	}
	// Delivery Distances

	public void viewAndDeleteDeliveryDistance() {
		sleep(2000);
		clickWhenClickable(firstRowActionMenu);
		sleep(2000);
		clickWhenClickable(deleteOption);
		sleep(2000);
		clickWhenClickable(deleteConfirmButton);

	}

	public void verifyUserCannotAddOrEditDeliveryDistances() {
		sleep(2000);
		Assert.assertTrue("New Delivery Distance button should not be visible",
				driver.findElements(newDeliveryDistanceButton).isEmpty());
		sleep(2000);
		clickWhenClickable(firstRowActionMenu);
		sleep(2000);
		Assert.assertTrue("Edit option should not be visible", driver.findElements(editOption).isEmpty());
	}

	public void verifyUserCannotAddOrDeleteDeliveryDistances() {
		sleep(2000);
		Assert.assertTrue("New Delivery Distance button should not be visible",
				driver.findElements(newDeliveryDistanceButton).isEmpty());
		sleep(2000);
		clickWhenClickable(firstRowActionMenu);
		sleep(2000);
		Assert.assertTrue("Delete option should not be visible", driver.findElements(deleteOption).isEmpty());
	}

	public void viewAndEditDeliveryDistances() {
		sleep(2000);
		clickWhenClickable(firstRowActionMenu);
		sleep(2000);
		clickWhenClickable(editOption);
		sleep(2000);
		waitAndSendKeys(zipCodeInput, "10001");
		waitAndSendKeys(cityInput, "New York");
		waitAndSendKeys(countyInput, "USA");
		waitAndSendKeys(radiusInput, "10");
		clickWhenClickable(saveButton);

	}

	public void createProfileWithViewDeleteAccessDeliveryDistances() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement packageRestrictionAll = wait
				.until(ExpectedConditions.elementToBeClickable(deliveryDistancesAllLabel));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement deletePackageRestrictionState = wait
				.until(ExpectedConditions.elementToBeClickable(deliveryDistancesDeleteLabel));
		deletePackageRestrictionState.click();

	}

	public void createDeliveryDistancesViewEditProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement packageRestrictionAll = wait
				.until(ExpectedConditions.elementToBeClickable(deliveryDistancesAllLabel));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement deletePackageRestrictionState = wait
				.until(ExpectedConditions.elementToBeClickable(deliveryDistancesEditLabel));
		deletePackageRestrictionState.click();

	}

	public void createProfileWithViewAddAccessDeliveryLogisticCompany() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement packageRestrictionAll = wait
				.until(ExpectedConditions.elementToBeClickable(deliveryDistancesAllLabel));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement deletePackageRestrictionState = wait
				.until(ExpectedConditions.elementToBeClickable(deliveryDistancesAddLabel));
		deletePackageRestrictionState.click();

	}

	public void verifyUserCannotEditOrDeleteDeliveryDistances() {
		sleep(2000);
		clickWhenClickable(firstRowActionMenu);
		sleep(2000);
		Assert.assertTrue("Edit option should not be visible", driver.findElements(editOption).isEmpty());
		Assert.assertTrue("Delete option should not be visible", driver.findElements(deleteOption).isEmpty());
	}

	public void addDeliveryDistance() {
		sleep(3000);
		clickWhenClickable(newDeliveryDistanceButton);
		sleep(3000);
		waitAndSendKeys(zipCodeInput, "10001");
		waitAndSendKeys(cityInput, "New York");
		waitAndSendKeys(countyInput, "USA");
		waitAndSendKeys(radiusInput, "10");
		sleep(2000);
		clickWhenClickable(DeliveryDistancesaveButton);
	}

	public void openDeliveryDistancesPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/DeliveryDistances"));
	}
	// Package Restriction

	public void openPackageRestrictionPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PackageRestriction"));
	}

	public void deleteFirstPackageRestrictionState() {
		sleep(2000);
		clickWhenClickable(firstStateDeleteIcon);
		sleep(2000);
		clickWhenClickable(deleteConfirmStateButton);
		sleep(2000);
	}

	public void deleteFirstPackageRestrictionPlan() {
		sleep(2000);
		clickWhenClickable(firstPlanDeleteIcon);
		sleep(2000);
		clickWhenClickable(deleteConfirmButton);
		sleep(2000);
	}

	public void verifyUserCanViewAndAddPackageRestriction() {
		sleep(2000);
		waitAndSendKeys(planInput, "Call Patient");
		sleep(2000);
		clickWhenClickable(restrictionOption);
		sleep(2000);
		clickWhenClickable(planDropdownToggle);
		sleep(2000);
		clickWhenClickable(packageRestrictionsaveButton);
		sleep(2000);

	}

	public void createProfileWithViewDeleteAccessToDeliveryPackageRestrictionState() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement packageRestrictionAll = wait
				.until(ExpectedConditions.elementToBeClickable(packageRestrictionAllLabel));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement deletePackageRestrictionState = wait
				.until(ExpectedConditions.elementToBeClickable(deletePackageRestrictionStateLabel));
		deletePackageRestrictionState.click();

	}

	public void createProfileWithViewDeleteAccessToDeliveryPackageRestrictionPlan() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement packageRestrictionAll = wait
				.until(ExpectedConditions.elementToBeClickable(packageRestrictionAllLabel));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement deletePackageRestrictionPlan = wait
				.until(ExpectedConditions.elementToBeClickable(deletePackageRestrictionPlanLabel));
		deletePackageRestrictionPlan.click();
	}

	public void createProfileWithViewAndAddPackageRestrictionAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement packageRestrictionAll = wait
				.until(ExpectedConditions.elementToBeClickable(packageRestrictionAllLabel));
		packageRestrictionAll.click();
		sleep(2000);
		WebElement packageRestrictionAdd = wait
				.until(ExpectedConditions.elementToBeClickable(packageRestrictionAddLabel));
		packageRestrictionAdd.click();

	}

	// Package Setting
	public void configureUpdateOnlyAccessForDeliveryPackageSettings() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();

	}

	public void createProfileWithoutPackageSettingsAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement packageSettingAll = wait.until(ExpectedConditions.elementToBeClickable(packageSettingAllLabel));
		packageSettingAll.click();
	}

	public void theUserShouldBeAbleToUpdatePackageSettingsInDeliveryModule() {
		sleep(2000);
		WebElement saveBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(saveButton));
		sleep(2000);
		Assert.assertTrue("Save button is not displayed", saveBtn.isDisplayed());
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();

	}

	public void userCannotViewOrUpdateDeliveryPackageSettings() {
		sleep(2000);
		wait.until(driver -> !driver.findElements(errorHeader).isEmpty() || driver.getPageSource().length() > 0);
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(errorHeader);
		sleep(2000);
		Assert.assertTrue("User should NOT be able to view or update Package Settings", !errorHeaders.isEmpty());
	}

	// General
	public void verifyGeneralAuditViewColumnsAreNotVisible() {

		wait.until(ExpectedConditions.invisibilityOfElementLocated(updatedByColumn));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(updatedDateColumn));
	}

	public void verifyGeneralAuditViewColumns() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(updatedByColumn));
		wait.until(ExpectedConditions.visibilityOfElementLocated(updatedDateColumn));
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

	public void createViewOnlyDeliveryAuditProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();

	}

	public void createNoAccessProfileForDeliveryGeneralAuditView() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement deliveryAuditViewCheckbox = wait
				.until(ExpectedConditions.elementToBeClickable(deliveryAuditViewCheckboxLabel));
		deliveryAuditViewCheckbox.click();

	}

	public deliverypage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void clickSubmitButton() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	}

	public void openDeliveryProfilesPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Profiles"));
	}

	public void openPackageSettingsPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/PackageSetting"));
	}

	public void openDeliveryPackagesPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Packages"));
	}

	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
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

	private void waitAndSendKeys(By locator, String value) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		element.clear();
		element.sendKeys(value);
	}
}
