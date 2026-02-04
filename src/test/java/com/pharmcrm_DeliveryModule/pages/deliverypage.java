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

	// Delivery Statistic Report
	public By exportDeliveryStatisticReport = By.xpath("//span[normalize-space()='Export Excel']");
	public By deliveryStatisticReportAll = By.xpath("//label[@for='chkg47DeliveryStatisticReportAll']");
	public By deliveryStatisticReportView = By.xpath("//label[@for='chkg47DeliveryStatisticReportView']");

	// Manifest Summary Report
	public By exportExcelButtonManifestSummary = By.xpath("//span[normalize-space()='Export Excel']");
	public By manifestSummaryReportExportButton = By.xpath("//tbody/tr[1]/td[7]/a[1]//*[name()='svg']");

	// Delivery Report
	public By exportExcelButton = By.xpath("//span[normalize-space()='Export Excel']");
	public By deliveryReportAll = By.xpath("//label[@for='chkg46DeliveryReportAll']");
	public By deliveryReportView = By.xpath("//label[@for='chkg46DeliveryReportView']");

	// Delivery Job Setting
	public By deliveryActionMenu = By
			.xpath("//tr[@module-data='data_Delivery']//i[@class='fa-solid fa-ellipsis-vertical']");
	public By deliveryEditOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[normalize-space()='Edit']");
	public By runTriggerButton = By.xpath(
			"//tr[@module-data='data_Delivery']//a[contains(@class,'triggerButton') and normalize-space()='Run Trigger']");
	public By deliveryJobSettingsUrl = By.xpath("//label[@for='chk_Delivery']//img");
	public By deliveryRunTriggerButton = By.xpath(
			"//tr[@module-data='data_Delivery']//a[contains(@class,'triggerButton') and normalize-space()='Run Trigger']");
	public By deliveryModuleCheckbox = By.xpath("//label[@for='chk_Delivery']//img");
	public By deliveryModuleActionMenu = By
			.xpath("//tr[@module-data='data_Delivery']//i[contains(@class,'fa-ellipsis-vertical')]");
	public By editJobSettingOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Edit']");
	public By fromEmailInput = By.id("ReportSetting_FromEmail");
	public By toEmailInput = By.id("ReportSetting_ToEmail");
	public By saveJobSettingButton = By.id("btnSave");

	// Customer Attestation
	public By customerAttestationAllAccessCheckbox = By.xpath("//label[@for='chkg5CustomerAttestationAll']");
	public By customerAttestationAddAccessCheckbox = By.xpath("//label[@for='chkg5CustomerAttestationAdd']");
	public By sendForSignatureButton = By.xpath("//span[normalize-space()='Send For Signature']");
	public By sendSignatureDropdown = By.id("sendsignaturelinkforpackageAttestation");
	public By printCustomerAttestationOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Print']");
	public By confirmDeleteCustomerAttestationButton = By.id("deletePackageCustomerAttestation");

	public By datepickerDay(int day) {
		return By.xpath("//td[normalize-space()='" + day + "']");
	}

	public By firstCustomerAttestationActionMenu = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By customerAttestationActionDropdown = By.xpath("//div[contains(@class,'bucket-dropdown-content')]");
	public By editCustomerAttestationOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Edit']");
	public By deleteCustomerAttestationOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Delete']");
	public By firstPackageDetailButton = By.xpath("//tbody/tr[1]/td[12]/div[1]/a[1]/img[1]");
	public By addCustomerAttestationButton = By.xpath("//span[normalize-space()='Add Customer Attestation']");
	public By saveCustomerAttestationButton = By.id("btnSavePackageCustomerAttestation");

	// Manifest
	public By manifestSummaryReportAll = By.xpath("//label[@for='chkg47ManifestSummaryReportAll']");
	public By manifestSummaryReportView = By.xpath("//label[@for='chkg47ManifestSummaryReportView']");
	public By manifestAllAccessCheckbox = By.xpath("//label[@for='chkg04ManifestAll']");
	public By manifestAddAccessCheckbox = By.xpath("//label[@for='chkg04ManifestAdd']");
	public By printManifestButton = By.id("manifestDetailPrintBtn");
	public By closePrintModalButton = By
			.xpath("//button[@onclick='javascript: CloseManifestDetailPrintModal();']//i[@class='fa fa-times']");
	public By deleteManifestBundleButton = By.id("btnDeleteManifestBundle");
	public By confirmDeleteBundleButton = By.id("btnDeleteBundleConfirm");
	public By saveManifestButton = By.id("btnSave");
	public By skipManifestPackageButton = By.id("btnSkipManifestPackage");
	public By confirmSkipButton = By.id("btnSkipConfirm");
	public By deleteManifestPackageButton = By.id("btnDeleteManifestPackage");
	public By confirmDeletePackageButton = By
			.xpath("//div[@id='deleteManifestPackageModel']//button[@id='btnDeleteConfirm']");
	public By searchPackageButton = By.id("searchPackagePopup");
	public By filterLogisticDropdown = By.id("Filter_LogisticId");
	public By filterFromDate = By.id("Filter_FromDate");
	public By datepickerDay1 = By.xpath("//td[normalize-space()='1']");
	public By searchButtonmn = By.xpath("//button[normalize-space()='Search']");
	public By packageCheckbox = By.xpath("//label[@for='b38063de-b375-4421-a2ee-0fb842cdb451']");
	public By submitButtonmn = By.xpath("//button[@class='btn btn-primary'][normalize-space()='Submit']");
	public By firstManifestDetailButton = By.xpath("//tbody/tr[1]/td[7]/div[1]/a[1]/img[1]");
	public By confirmDeleteButtonmn = By.id("btndeletemanifestconform");
	public By firstManifestActionMenu = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By manifestStatusDropdown = By.id("Manifest_Status");
	public By manifestActionDropdown = By.xpath("//div[contains(@class,'bucket-dropdown-content')]");
	public By manifestActionMenu = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By editManifestOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Edit']");
	public By deleteManifestOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Delete']");
	public By newManifestButton = By.xpath("//span[normalize-space()='New Manifest']");
	public By deliveryDateInput = By.id("Manifest_DeliveryDate");
	public By datepickerYearDropdown = By.xpath("//select[contains(@class,'ui-datepicker-year')]");
	public By datepickerMonthDropdown = By.xpath("//select[contains(@class,'ui-datepicker-month')]");
	public By driverDropdown = By.id("Manifest_Driver_Id");
	public By startingPointDropdown = By.id("Manifest_StartingPoint");
	public By endPointDropdown = By.id("Manifest_EndPoint");
	public By statusDropdown = By.id("Manifest_Status");
	public By saveButton = By.id("btnSave");

	// Package Plan Restriction
	public By packagePlanRestrictionIcon = By.xpath("//*[name()='path' and contains(@d,'m211 91v21')]");
	public By packagePlanIcon = By.xpath("//*[name()='path' and contains(@d,'m211 91v21')]");
	public By packagePlanInput = By.id("Package_Plan");
	public By packageActionDropdownRow1 = By.xpath("//tbody/tr[1]/td[12]/div[1]/div[1]/button[1]/i[1]");
	public By editPackageOption = By
			.xpath("//div[contains(@class,'gridRecordContext')]//span[contains(text(),'Edit')]");

	// Delivery Setting
	public By packageRestrictionHeader = By.xpath("//h6[normalize-space()='Package Restriction']");

	// Package
	public By filterBtn = By.xpath("//span[normalize-space()='Filter']");
	public By logisticDropdown = By.id("Filter_LogisticId");
	public By searchBtn = By.xpath("//i[@class='fa-solid fa-magnifying-glass']");
	public By syncLogisticHistoryBtn = By.xpath("//button[normalize-space()='Sync Logistic History']");
	public By printPickupPackagesBtn = By.xpath("//span[normalize-space()='Print Pickup Packages']");
	public By closePickupPrintModalBtn = By
			.xpath("//button[@onclick='return CloseGenerateCollectionLabel()']//i[@class='fa fa-times']");
	public By packageActionDropdownRow2 = By.xpath("//tbody/tr[2]/td[12]/div[1]/div[1]/button[1]/i[1]");
	public By shareToHarbourOption = By
			.xpath("//div[contains(@class,'gridRecordContext')]//span[normalize-space()='Share To Harbour']");
	public By shareConfirmBtn = By.id("btnShareConfirm");
	public By packageDetailIconRow5 = By.xpath("//tbody/tr[5]/td[12]/div[1]/a[1]/img[1]");
	public By printPackageBtn = By.xpath("//div[@class='mb-5']//button[normalize-space()='Print']");
	public By packageInformationCheckbox = By.xpath("//label[normalize-space()='Package Information']");
	public By closePrintModalBtn = By
			.xpath("//button[@onclick='javascript: ClosePrintModal();']//i[@class='fa fa-times']");
	public By packageDetailIcon = By.xpath("//tbody/tr[3]/td[12]/div[1]/a[1]/img[1]");
	public By generateInvoiceBtn = By.xpath("//button[normalize-space()='Generate Invoice']");
	public By invoiceFirstName = By.id("Invoice_FirstName");
	public By invoiceBillingEmail = By.id("Invoice_BillingEmail");
	public By prescriptionNumber = By.id("InvoiceDetail_PrescriptionNumber");
	public By rxDropdownInput = By
			.xpath("//div[@class='model-inp select-city-dd dropdowncheckbox']//input[@type='text']");
	public By rxOption = By.xpath("//label[span[normalize-space()='Rx']]");
	public By invoiceDescription = By.id("InvoiceDetail_Description");
	public By invoiceQuantity = By.id("InvoiceDetail_Quantity");
	public By invoiceCopay = By.id("InvoiceDetail_CoPay");
	public By addInvoiceDetailBtn = By.id("btnInvoiceDetail");
	public By patientEmail = By.id("Invoice_PatientEmail");
	public By patientEmailCheckbox = By.xpath("//label[@for='ChkInvoice_PatientEmail']");
	public By billToFirstName = By.id("Invoice_InvoiceBillTo_BillToFirstName");
	public By saveAndSendBtn = By.id("btnSaveAndSend");
	public By addCustomerAttestationBtn = By.xpath("//span[normalize-space()='Add Customer Attestation']");
	public By saveAttestationBtn = By.id("btnSavePackageCustomerAttestation");
	public By rxNumberInput = By.id("PackageCustomerAttestation_RxNumber");
	public By patientNameInput = By.id("PackageCustomerAttestation_PatientName");
	public By medicationInput = By.id("PackageCustomerAttestation_Medication");
	public By receivedFromInput = By.id("PackageCustomerAttestation_ReceivedFrom");
	public By filledDateInput = By.id("PackageCustomerAttestation_FilledDate");
	public By receivedDateInput = By.id("PackageCustomerAttestation_ReceivedDate");
	public By addressReceiverInput = By.id("PackageCustomerAttestation_AddressReceiver");
	public By receiverNameInput = By.id("PackageCustomerAttestation_ReceiverName");
	public By patientRelationInput = By.id("PackageCustomerAttestation_PatientRelation");
	public By phoneNumberInput = By.id("PackageCustomerAttestation_PhoneNumber");
	public By closePrintLabelBtn = By.xpath("//button[@onclick='ClosePrintLabel();']//i[@class='fa fa-times']");
	public By sendForSignatureBtn = By.xpath("//a[@title='Send For Signature To Customer']//*[name()='svg']");
	public By emailOption = By.xpath("//a[normalize-space()='Email']");
	public By signatureOptionsMenu = By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']");
	public By printOption = By.xpath("//div[contains(@class,'gridRecordContextInner')]//span[text()='Print']");
	public By signatureDownloadLink = By.xpath("//a[contains(text(),'.png')]");
	public By signatureFileInput = By.id("flSignature");
	public By uploadSignatureButton = By.id("btnUploadSignature");
	public By referenceDocumentLink = By.xpath("//a[contains(text(),'.pdf')]");
	public By deliveryInitiatedCheckbox = By.id("DeliveryInitiated");
	public By saveStatusNotesButton = By.id("btnSaveStatusNotes");
	public By generateLabelOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[text()='Generate Label']");
	public By firstPackageDetailIcon = By.xpath("//tbody/tr[1]/td[12]//a//img");
	public By confirmDeleteButton = By.id("btnDeleteConfirm");
	public By addOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[text()='Add']");
	public By packageDropdownBtn = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By packageeditOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[text()='Edit']");
	public By cityInputField = By.id("Package_ShippingAddress_City");
	public By packageDropdownButton = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By newPackageButton = By.xpath("//span[normalize-space()='New Package']");
	public By nextButton = By.id("btnNext");
	public By copyAddressButton = By.xpath("//a[@class='copyAddressMain']//*[name()='svg']");
	public By logisticCompanyDropdown = By.id("Package_LogisticCompany_Id");
	public By stateDropdown = By.id("ddState");
	public By trackingNumberField = By.id("Package_TrackingNumber");
	public By customerNameField = By.id("Package_CustomerName");
	public By customerContactField = By.id("Package_CustomerContactNumber1");
	public By streetField = By.id("Package_ShippingAddress_Street");
	public By cityField = By.id("Package_ShippingAddress_City");
	public By zipCodeField = By.id("Package_ShippingAddress_ZipCode");
	public By addressInputField = By.id("travelto");
	public By shippingDateInput = By.id("Package_ShippingDate");
	public By datePickerYearDropdown = By.xpath("//select[contains(@class,'ui-datepicker-year')]");
	public By datePickerMonthDropdown = By.xpath("//select[contains(@class,'ui-datepicker-month')]");
	public Function<Integer, By> datePickerDay = day -> By.xpath("//td[normalize-space()='" + day + "']");
	public By addressSuggestion = By.cssSelector(".pac-item");
	public By packageAllCheckbox = By.xpath("//label[@for='chkg04PackageAll']");
	public By packageAddCheckbox = By.xpath("//label[@for='chkg04PackageAdd']");
	public By packageEditCheckbox = By.xpath("//label[@for='chkg04PackageEdit']");
	public By packageDeleteCheckbox = By.xpath("//label[@for='chkg04PackageDelete']");

	// Delivery Marker
	public By DeliveryMarkerconfirmDeleteButton = By.id("submitDeleteDeliveryMarker");
	public By DeliveryMarkerdeleteOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Delete']");
	public By DeliveryMarkeractionMenu = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By DeliveryMarkereditOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Edit']");
	public By markerNameInput = By.id("DeliveryMarker_Name");
	public By travelToInput = By.id("travelto");
	public By DeliveryMarkersaveButton = By.id("btnSave");
	public By deliveryMarkerAll = By.xpath("//label[@for='chkg44DeliveryMarkerAll']");
	public By deliveryMarkerAdd = By.xpath("//label[@for='chkg44DeliveryMarkerAdd']");
	public By newDeliveryMarkerBtn = By.xpath("//span[normalize-space()='New Delivery Marker']");
	public By deliveryMarkerName = By.id("DeliveryMarker_Name");
	public By travelTo = By.id("travelto");
	public By startingPoint = By.xpath("//label[normalize-space()='Starting Point']");
	public By deliverysaveButton = By.id("btnSave");
	public By DeliveryactionMenu = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By DeliveryeditOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Edit']");
	public By DeliverydeleteOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Delete']");
	public By deliveryMarkerEdit = By.xpath("//label[@for='chkg44DeliveryMarkerEdit']");
	public By deliveryMarkerDelete = By.xpath("//label[@for='chkg44DeliveryMarkerDelete']");

	// Logistic Company
	public By logisticAllLabel = By.xpath("//label[@for='chkg04LogisticAll']");
	public By logisticAddLabel = By.xpath("//label[@for='chkg04LogisticAdd']");
	public By newLogisticCompanyButton = By.xpath("//span[normalize-space()='New Logistic Company']");
	public By logisticNameInput = By.id("LogisticCompany_Name");
	public By deliveryRadioButton = By.id("rbtnDelivery");
	public By logisticsubmitButton = By
			.xpath("//button[@class='btn btn-primary waves-effect waves-light' and normalize-space()='Submit']");
	public By logisticEditLabel = By.xpath("//label[@for='chkg04LogisticEdit']");
	public By logisticDeleteLabel = By.xpath("//label[@for='chkg04LogisticDelete']");

	// Delivery Distances
	public By deliveryDistancesAllLabel = By.xpath("//label[@for='chkg04DeliveryDistancesAll']");
	public By deliveryDistancesAddLabel = By.xpath("//label[@for='chkg04DeliveryDistancesAdd']");
	public By newDeliveryDistanceButton = By.xpath("//span[normalize-space()='New Delivery Distance']");
	public By zipCodeInput = By.id("DeliveryDistance_ZipCode");
	public By cityInput = By.id("DeliveryDistance_City");
	public By countyInput = By.id("DeliveryDistance_County");
	public By radiusInput = By.id("DeliveryDistance_Radius");
	public By DeliveryDistancesaveButton = By.id("btnSave");
	public By firstRowActionMenu = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By editOption = By.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[contains(text(),'Edit')]");
	public By deleteOption = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[contains(text(),'Delete')]");
	public By deliveryDistancesEditLabel = By.xpath("//label[@for='chkg04DeliveryDistancesEdit']");
	public By deliveryDistancesDeleteLabel = By.xpath("//label[@for='chkg04DeliveryDistancesDelete']");

	// Package Restriction
	public By packageRestrictionAllLabel = By.xpath("//label[@for='chkg45PackageRestrictionAll']");
	public By deletePackageRestrictionPlanLabel = By
			.xpath("//label[normalize-space()='Delete Package Restriction Plan']");
	public By deletePackageRestrictionStateLabel = By
			.xpath("//label[normalize-space()='Delete Package Restriction State']");
	public By packageRestrictionAddLabel = By.xpath("//label[@for='chkg45PackageRestrictionAdd']");
	public By packageSettingAllLabel = By.xpath("//label[@for='chkg18PackageSettingAll']");
	public By errorHeader = By.xpath("//h2[normalize-space()='Error']");
	public By planInput = By.id("Plan");
	public By restrictionOption = By.xpath("//input[@value='2']");
	public By planDropdownToggle = By.xpath("//a[@id='btnPlan']//*[name()='svg']");
	public By packageRestrictionsaveButton = By.xpath("//button[@id='btnSave']");
	public By firstPlanDeleteIcon = By.xpath("//tbody/tr[1]/td[3]/div[1]/a[1]/img[1]");
	public By deleteConfirmButton = By.id("btnDeleteConfirmRestictedPlan");
	public By firstStateDeleteIcon = By.xpath("//tbody/tr[1]/td[2]/div[1]/a[1]/img[1]");
	public By deleteConfirmStateButton = By.id("btnDeleteConfirmRestictedState");

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

	// Delivery Identifier
	public void testUserWithoutDeliveryAccessCannotViewDeliveryIdentifier() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

	}

	public void testDeliveryModuleViewOnlyProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

	}

	// Manifest
	public void testPrintManifestFunctionality() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(firstManifestActionMenu));
		clickWhenClickable(firstManifestActionMenu);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(editManifestOption));
		clickWhenClickable(editManifestOption);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(manifestStatusDropdown));
		selectDropdownByIndexWhenReady(manifestStatusDropdown, 10);
		sleep(2000);
		clickWhenClickable(saveManifestButton);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(printManifestButton));
		clickWhenClickable(printManifestButton);
		sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.print();");
		System.out.println("Manifest PDF auto-saved in Downloads folder");
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(closePrintModalButton));
		clickWhenClickable(closePrintModalButton);
	}

	public void testDeleteManifestBundleFunctionality() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(firstManifestDetailButton));
		clickWhenClickable(firstManifestDetailButton);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(deleteManifestBundleButton));
		clickWhenClickable(deleteManifestBundleButton);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteBundleButton));
		clickWhenClickable(confirmDeleteBundleButton);

	}

	public void testAddManifestBundleFunctionality() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(firstManifestDetailButton));
		sleep(2000);
		clickWhenClickable(firstManifestDetailButton);

	}

	public void verifyUserCanSkipManifestPackage() {
		sleep(2000);
		clickWhenClickable(firstManifestActionMenu);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(editManifestOption));
		sleep(2000);
		clickWhenClickable(editManifestOption);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(manifestStatusDropdown));
		sleep(2000);
		selectDropdownByIndexWhenReady(manifestStatusDropdown, 2);
		sleep(2000);
		clickWhenClickable(saveManifestButton);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(skipManifestPackageButton));
		sleep(2000);
		clickWhenClickable(skipManifestPackageButton);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(confirmSkipButton));
		sleep(2000);
		clickWhenClickable(confirmSkipButton);

	}

	public void testDeleteManifestPackageAccessInDeliveryModule() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(deleteManifestPackageButton));
		sleep(2000);
		clickWhenClickable(deleteManifestPackageButton);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeletePackageButton));
		sleep(2000);
		clickWhenClickable(confirmDeletePackageButton);
		sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(confirmDeletePackageButton));
	}

	public void verifyUserCanAddManifestPackage() {
		sleep(2000);
		clickWhenClickable(searchPackageButton);
		sleep(2000);
		clickWhenClickable(filterLogisticDropdown);
		sleep(2000);
		selectDropdownByIndexWhenReady(filterLogisticDropdown, 1);
		sleep(2000);
		clickWhenClickable(filterFromDate);
		sleep(2000);
		int year = LocalDate.now().getYear();
		String month = LocalDate.now().getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
		sleep(2000);
		WebElement yearDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(datepickerYearDropdown));
		new Select(yearDropdown).selectByVisibleText(String.valueOf(year));
		sleep(2000);
		WebElement monthDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(datepickerMonthDropdown));
		sleep(2000);
		new Select(monthDropdown).selectByVisibleText(month);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(datepickerDay1)).click();
		sleep(2000);
		clickWhenClickable(searchButton);
		sleep(2000);
		clickWhenClickable(packageCheckbox);
		sleep(2000);
		clickWhenClickable(submitButton);

	}

	public void testManifestDetailIsAccessibleByUser() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(firstManifestDetailButton));
		sleep(2000);
		clickWhenClickable(firstManifestDetailButton);

	}

	public void verifyUserCannotAddOrEditManifest() {
		assertElementNotPresent(newManifestButton);
		clickWhenClickable(firstManifestActionMenu);
		wait.until(ExpectedConditions.visibilityOfElementLocated(manifestActionDropdown));
		assertElementNotPresent(editManifestOption);
	}

	public void testViewAndDeleteManifestAccessInDeliveryModule() {
		clickWhenClickable(firstManifestActionMenu);
		wait.until(ExpectedConditions.visibilityOfElementLocated(manifestActionDropdown));
		clickWhenClickable(deleteManifestOption);
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton));
		clickWhenClickable(confirmDeleteButton);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(deleteManifestOption));
	}

	public void verifyUserCannotAddOrDeleteManifest() {
		assertElementNotPresent(newManifestButton);
		clickWhenClickable(manifestActionMenu);
		wait.until(ExpectedConditions.visibilityOfElementLocated(manifestActionDropdown));
		assertElementNotPresent(deleteManifestOption);
	}

	public void testViewAndEditManifestAccessInDeliveryModule() {
		clickWhenClickable(manifestActionMenu);
		wait.until(ExpectedConditions.visibilityOfElementLocated(manifestActionDropdown));
		clickWhenClickable(editManifestOption);
		wait.until(ExpectedConditions.elementToBeClickable(manifestStatusDropdown));
		selectDropdownByIndexWhenReady(manifestStatusDropdown, 2);
		clickWhenClickable(saveButton);

	}

	public void testProfileWithViewAndEditPermissionsForManifest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

	}

	public void verifyUserCanViewAndDeleteManifest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

	}

	public void testProfileWithFullPermissionsForManifest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

	}

	public void verifyUserCannotEditOrDeleteManifest() {
		sleep(2000);
		clickWhenClickable(manifestActionMenu);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(manifestActionDropdown));
		sleep(2000);
		assertElementNotPresent(editManifestOption);
		sleep(2000);
		assertElementNotPresent(deleteManifestOption);
	}

	public void verifyUserCanViewAndAddManifest() {
		sleep(2000);
		clickWhenClickable(newManifestButton);
		sleep(2000);
		clickWhenClickable(deliveryDateInput);
		sleep(2000);
		LocalDate futureDate = LocalDate.now().plusDays(5);
		int day = futureDate.getDayOfMonth();
		int year = futureDate.getYear();
		String month = futureDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
		sleep(2000);
		WebElement yearDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(datepickerYearDropdown));
		new Select(yearDropdown).selectByVisibleText(String.valueOf(year));
		sleep(2000);
		WebElement monthDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(datepickerMonthDropdown));
		new Select(monthDropdown).selectByVisibleText(month);
		sleep(2000);
		By DATE_TO_SELECT = By.xpath("//td[normalize-space()='" + day + "']");
		wait.until(ExpectedConditions.elementToBeClickable(DATE_TO_SELECT)).click();
		sleep(2000);
		clickWhenClickable(driverDropdown);
		sleep(2000);
		selectDropdownByIndexWhenReady(driverDropdown, 1);
		sleep(2000);
		clickWhenClickable(startingPointDropdown);
		sleep(2000);
		selectDropdownByIndexWhenReady(startingPointDropdown, 1);
		sleep(2000);
		clickWhenClickable(endPointDropdown);
		sleep(2000);
		selectDropdownByIndexWhenReady(endPointDropdown, 1);
		sleep(2000);
		clickWhenClickable(statusDropdown);
		sleep(2000);
		selectDropdownByIndexWhenReady(statusDropdown, 1);
		sleep(2000);
		clickWhenClickable(saveButton);
	}

	public void testProfileWithViewAndAddPermissionsForManifest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement manifestAllAccess = wait.until(ExpectedConditions.elementToBeClickable(manifestAllAccessCheckbox));
		manifestAllAccess.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement manifestAddAccess = wait.until(ExpectedConditions.elementToBeClickable(manifestAddAccessCheckbox));
		manifestAddAccess.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

	}

	public void openDeliveryManifestPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Manifests"));
	}

	// Customer Attestation
	public void verifyUserCanSendCustomerAttestationForSignature() {
		wait.until(ExpectedConditions.elementToBeClickable(sendForSignatureButton));
		clickWhenClickable(sendForSignatureButton);
		wait.until(ExpectedConditions.elementToBeClickable(sendSignatureDropdown));
		selectDropdownByIndexWhenReady(sendSignatureDropdown, 1);
	}

	public void verifyUserCanPrintCustomerAttestation() {
		wait.until(ExpectedConditions.elementToBeClickable(firstPackageDetailButton));
		clickWhenClickable(firstPackageDetailButton);
		wait.until(ExpectedConditions.elementToBeClickable(firstCustomerAttestationActionMenu));
		clickWhenClickable(firstCustomerAttestationActionMenu);
		wait.until(ExpectedConditions.elementToBeClickable(printCustomerAttestationOption));
		clickWhenClickable(printCustomerAttestationOption);
		((JavascriptExecutor) driver).executeScript("window.print();");
		System.out.println("Customer Attestation PDF auto-saved in Downloads folder");
		wait.until(ExpectedConditions.elementToBeClickable(closePrintModalButton));
		clickWhenClickable(closePrintModalButton);
	}

	public void testPrintAndSendForSignatureAccessToCustomerAttestation() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

	}

	public void testCustomerAttestationAddEditRestricted() {
		assertElementNotPresent(addCustomerAttestationButton);
		wait.until(ExpectedConditions.elementToBeClickable(firstCustomerAttestationActionMenu));
		clickWhenClickable(firstCustomerAttestationActionMenu);
		wait.until(ExpectedConditions.visibilityOfElementLocated(customerAttestationActionDropdown));
		assertElementNotPresent(editCustomerAttestationOption);
	}

	public void testCustomerAttestationDeleteAccess() {
		wait.until(ExpectedConditions.elementToBeClickable(firstPackageDetailButton));
		clickWhenClickable(firstPackageDetailButton);
		wait.until(ExpectedConditions.elementToBeClickable(firstCustomerAttestationActionMenu));
		clickWhenClickable(firstCustomerAttestationActionMenu);
		wait.until(ExpectedConditions.elementToBeClickable(deleteCustomerAttestationOption));
		clickWhenClickable(deleteCustomerAttestationOption);
		wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteCustomerAttestationButton));
		clickWhenClickable(confirmDeleteCustomerAttestationButton);
	}

	public void testNoAddOrDeleteAccessForCustomerAttestation() {
		assertElementNotPresent(addCustomerAttestationButton);
		wait.until(ExpectedConditions.elementToBeClickable(firstCustomerAttestationActionMenu));
		clickWhenClickable(firstCustomerAttestationActionMenu);
		wait.until(ExpectedConditions.visibilityOfElementLocated(customerAttestationActionDropdown));
		assertElementNotPresent(deleteCustomerAttestationOption);
	}

	public void testCustomerAttestationEditAccess() {
		wait.until(ExpectedConditions.elementToBeClickable(firstPackageDetailButton));
		clickWhenClickable(firstPackageDetailButton);
		wait.until(ExpectedConditions.elementToBeClickable(firstCustomerAttestationActionMenu));
		clickWhenClickable(firstCustomerAttestationActionMenu);
		wait.until(ExpectedConditions.elementToBeClickable(editCustomerAttestationOption));
		clickWhenClickable(editCustomerAttestationOption);
		waitAndSendKeys(addressReceiverInput, "Ahmedabad");
		wait.until(ExpectedConditions.elementToBeClickable(saveCustomerAttestationButton));
		clickWhenClickable(saveCustomerAttestationButton);
	}

	public void testEditAndDeleteAccessRestrictedForCustomerAttestation() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(firstCustomerAttestationActionMenu));
		clickWhenClickable(firstCustomerAttestationActionMenu);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(customerAttestationActionDropdown));
		sleep(2000);
		assertElementNotPresent(editCustomerAttestationOption);
		sleep(2000);
		assertElementNotPresent(deleteCustomerAttestationOption);
	}

	public void testCustomerAttestationDeleteAccessProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

	}

	public void testCustomerAttestationEditAccessProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

	}

	public void testProfileWithAddPermissionForCustomerAttestation() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModules.click();
		sleep(2000);
		WebElement customerAttestationAllAccess = wait
				.until(ExpectedConditions.elementToBeClickable(customerAttestationAllAccessCheckbox));
		customerAttestationAllAccess.click();
		sleep(2000);
		WebElement customerAttestationAddAccess = wait
				.until(ExpectedConditions.elementToBeClickable(customerAttestationAddAccessCheckbox));
		customerAttestationAddAccess.click();

	}

	public void testAddCustomerAttestationFunctionality() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(firstPackageDetailButton));
		sleep(2000);
		clickWhenClickable(firstPackageDetailButton);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(addCustomerAttestationButton));
		sleep(2000);
		clickWhenClickable(addCustomerAttestationButton);
		sleep(2000);
		waitAndSendKeys(rxNumberInput, "RX7845123");
		waitAndSendKeys(patientNameInput, "John A. Smith");
		waitAndSendKeys(medicationInput, "Atorvastatin 20mg Tablet");
		waitAndSendKeys(receivedFromInput, "CVS Pharmacy");
		sleep(2000);
		selectDate(filledDateInput, 5);
		sleep(2000);
		selectDate(receivedDateInput, 5);
		sleep(2000);
		waitAndSendKeys(addressReceiverInput, "742 Evergreen Terrace, Springfield, IL 62704");
		waitAndSendKeys(receiverNameInput, "Mary Smith");
		waitAndSendKeys(patientRelationInput, "Spouse");
		waitAndSendKeys(phoneNumberInput, "2175558945");
		sleep(2000);
		clickWhenClickable(saveCustomerAttestationButton);
	}

	private void selectDate(By dateInputLocator, int daysFromToday) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		clickWhenClickable(dateInputLocator);
		LocalDate futureDate = LocalDate.now().plusDays(daysFromToday);
		int day = futureDate.getDayOfMonth();
		int year = futureDate.getYear();
		String month = futureDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
		WebElement yearDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(datepickerYearDropdown));
		new Select(yearDropdown).selectByVisibleText(String.valueOf(year));
		WebElement monthDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(datepickerMonthDropdown));
		new Select(monthDropdown).selectByVisibleText(month);
		WebElement dayToSelect = wait.until(ExpectedConditions.elementToBeClickable(datepickerDay(day)));
		dayToSelect.click();

	}

	// Delivery Job Setting
	public void noEditDeliveryJobSettingTest() {
		clickWhenClickable(deliveryModuleCheckbox);
		sleep(2000);
		clickWhenClickable(deliveryActionMenu);
		sleep(2000);
		assertElementNotPresent(deliveryEditOption);
	}

	public void runTriggersDeliveryModuleTest() {
		clickWhenClickable(deliveryModuleCheckbox);
		sleep(2000);
		clickWhenClickable(runTriggerButton);
		sleep(2000);
	}

	public void runTriggerAccessProfileTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

	}

	public void testDeliveryModuleRunTriggersNotAllowed() {
		sleep(3000);
		clickWhenClickable(deliveryJobSettingsUrl);
		sleep(2000);
		assertElementNotPresent(deliveryJobSettingsUrl);
	}

	public void testDeliveryJobSettingEditAccessProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

	}

	public void openJobSettingsPage(String url) {
		driver.get(url);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/JobSettings"));
	}

	public void verifyUserCanEditDeliveryJobSetting() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(deliveryModuleCheckbox));
		clickWhenClickable(deliveryModuleCheckbox);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(deliveryModuleActionMenu));
		clickWhenClickable(deliveryModuleActionMenu);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(editJobSettingOption));
		clickWhenClickable(editJobSettingOption);
		sleep(2000);
		waitAndSendKeys(fromEmailInput, "delivery_admin@mailinator.com");
		waitAndSendKeys(toEmailInput, "notifications@mailinator.com");
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(saveJobSettingButton));
		clickWhenClickable(saveJobSettingButton);
	}

	// Delivery Report
	public void verifyUserCannotExportDeliveryReport() {
		assertElementNotPresent(exportExcelButton);
	}

	public void verifyUserCanExportDeliveryReport() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(exportExcelButton));
		sleep(2000);
		clickWhenClickable(exportExcelButton);
		sleep(2000);
	}

	public void viewOnlyDeliveryReportProfileTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement deliveryReportAllElement = wait.until(ExpectedConditions.elementToBeClickable(deliveryReportAll));
		deliveryReportAllElement.click();
		sleep(2000);
		WebElement deliveryReportViewElement = wait.until(ExpectedConditions.elementToBeClickable(deliveryReportView));
		deliveryReportViewElement.click();

	}

	public void deliveryReportViewExportTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

	}

	public void openDeliveryReportPage(String url) {
		driver.get(url);
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/DeliveryReports"));
	}

	// Manifest Summary Report
	public void exportManifestSummaryReportTest() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(manifestSummaryReportExportButton));
		sleep(2000);
		clickWhenClickable(manifestSummaryReportExportButton);
		sleep(2000);
	}

	public void verifyUserCannotExportManifestSummaryReport() {
		assertElementNotPresent(exportExcelButtonManifestSummary);
	}

	public void manifestSummaryReportViewOnlyTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement manifestSummaryReportAllElement = wait
				.until(ExpectedConditions.elementToBeClickable(manifestSummaryReportAll));
		manifestSummaryReportAllElement.click();
		sleep(2000);
		WebElement manifestSummaryReportViewElement = wait
				.until(ExpectedConditions.elementToBeClickable(manifestSummaryReportView));
		manifestSummaryReportViewElement.click();

	}

	public void manifestSummaryReportViewExportTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

	}

	public void openManifestSummaryReportPage(String url) {
		driver.get(url);
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/ManifestSummaryReports"));
	}

	// Delivery Statistic Report
	public void verifyUserCannotExportDeliveryStatisticReport() {
		sleep(2000);
		assertElementNotPresent(exportDeliveryStatisticReport);
	}

	public void verifyUserCanExportDeliveryStatisticReport() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(exportDeliveryStatisticReport));
		sleep(2000);
		clickWhenClickable(exportDeliveryStatisticReport);
		sleep(2000);
	}

	public void deliveryStatisticReportViewOnlyTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModulesLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModulesLabelElement.click();
		sleep(2000);
		WebElement deliveryStatisticReportAllElement = wait
				.until(ExpectedConditions.elementToBeClickable(deliveryStatisticReportAll));
		deliveryStatisticReportAllElement.click();
		sleep(2000);
		WebElement deliveryStatisticReportViewElement = wait
				.until(ExpectedConditions.elementToBeClickable(deliveryStatisticReportView));
		deliveryStatisticReportViewElement.click();

	}

	public void deliveryStatisticReportViewExportTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

	}

	public void openDeliveryStatisticReportPage(String url) {
		driver.get(url);
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/DeliveryStatisticReports"));
	}

}
