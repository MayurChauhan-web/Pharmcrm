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
	public By EXPORT_DELIVERY_STATISTIC_REPORT = By.xpath("//span[normalize-space()='Export Excel']");
	public By DELIVERY_STATISTIC_REPORT_ALL = By.xpath("//label[@for='chkg47DeliveryStatisticReportAll']");
	public By DELIVERY_STATISTIC_REPORT_VIEW = By.xpath("//label[@for='chkg47DeliveryStatisticReportView']");

	// Manifest Summary Report
	public By EXPORT_EXCEL_BUTTON_MANIFEST_SUMMARY = By.xpath("//span[normalize-space()='Export Excel']");
	public By MANIFEST_SUMMARY_REPORT_EXPORT_BUTTON = By.xpath("//tbody/tr[1]/td[7]/a[1]//*[name()='svg']");

	// Delivery Report
	public By EXPORT_EXCEL_BUTTON = By.xpath("//span[normalize-space()='Export Excel']");
	public By DELIVERY_REPORT_ALL = By.xpath("//label[@for='chkg46DeliveryReportAll']");
	public By DELIVERY_REPORT_VIEW = By.xpath("//label[@for='chkg46DeliveryReportView']");

	// Delivery Job Setting
	public By DELIVERY_ACTION_MENU = By
			.xpath("//tr[@module-data='data_Delivery']//i[@class='fa-solid fa-ellipsis-vertical']");
	public By DELIVERY_EDIT_OPTION = By
			.xpath("//div[contains(@class,'bucket-dropdown-content')]//span[normalize-space()='Edit']");
	public By RUN_TRIGGER_BUTTON = By.xpath(
			"//tr[@module-data='data_Delivery']//a[contains(@class,'triggerButton') and normalize-space()='Run Trigger']");
	public By DELIVERY_JOB_SETTINGS_URL = By.xpath("//label[@for='chk_Delivery']//img");
	public By DELIVERY_RUN_TRIGGER_BUTTON = By.xpath(
			"//tr[@module-data='data_Delivery']//a[contains(@class,'triggerButton') and normalize-space()='Run Trigger']");
	public By DELIVERY_MODULE_CHECKBOX = By.xpath("//label[@for='chk_Delivery']//img");
	public By DELIVERY_MODULE_ACTION_MENU = By
			.xpath("//tr[@module-data='data_Delivery']//i[contains(@class,'fa-ellipsis-vertical')]");
	public By EDIT_JOB_SETTING_OPTION = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Edit']");
	public By FROM_EMAIL_INPUT = By.id("ReportSetting_FromEmail");
	public By TO_EMAIL_INPUT = By.id("ReportSetting_ToEmail");
	public By SAVE_JOB_SETTING_BUTTON = By.id("btnSave");

	// Customer Attestation
	public By CUSTOMER_ATTESTATION_ALL_ACCESS_CHECKBOX = By.xpath("//label[@for='chkg5CustomerAttestationAll']");
	public By CUSTOMER_ATTESTATION_ADD_ACCESS_CHECKBOX = By.xpath("//label[@for='chkg5CustomerAttestationAdd']");
	public By SEND_FOR_SIGNATURE_BUTTON = By.xpath("//span[normalize-space()='Send For Signature']");
	public By SEND_SIGNATURE_DROPDOWN = By.id("sendsignaturelinkforpackageAttestation");
	public By PRINT_CUSTOMER_ATTESTATION_OPTION = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Print']");
	public By CONFIRM_DELETE_CUSTOMER_ATTESTATION_BUTTON = By.id("deletePackageCustomerAttestation");

	public By datepickerDay(int day) {
		return By.xpath("//td[normalize-space()='" + day + "']");
	}

	public By FIRST_CUSTOMER_ATTESTATION_ACTION_MENU = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By CUSTOMER_ATTESTATION_ACTION_DROPDOWN = By.xpath("//div[contains(@class,'bucket-dropdown-content')]");
	public By EDIT_CUSTOMER_ATTESTATION_OPTION = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Edit']");
	public By DELETE_CUSTOMER_ATTESTATION_OPTION = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Delete']");
	public By FIRST_PACKAGE_DETAIL_BUTTON = By.xpath("//tbody/tr[1]/td[12]/div[1]/a[1]/img[1]");
	public By ADD_CUSTOMER_ATTESTATION_BUTTON = By.xpath("//span[normalize-space()='Add Customer Attestation']");
	public By RX_NUMBER_INPUT = By.id("PackageCustomerAttestation_RxNumber");
	public By PATIENT_NAME_INPUT = By.id("PackageCustomerAttestation_PatientName");
	public By MEDICATION_INPUT = By.id("PackageCustomerAttestation_Medication");
	public By RECEIVED_FROM_INPUT = By.id("PackageCustomerAttestation_ReceivedFrom");
	public By FILLED_DATE_INPUT = By.id("PackageCustomerAttestation_FilledDate");
	public By RECEIVED_DATE_INPUT = By.id("PackageCustomerAttestation_ReceivedDate");
	public By ADDRESS_RECEIVER_INPUT = By.id("PackageCustomerAttestation_AddressReceiver");
	public By RECEIVER_NAME_INPUT = By.id("PackageCustomerAttestation_ReceiverName");
	public By PATIENT_RELATION_INPUT = By.id("PackageCustomerAttestation_PatientRelation");
	public By PHONE_NUMBER_INPUT = By.id("PackageCustomerAttestation_PhoneNumber");
	public By SAVE_CUSTOMER_ATTESTATION_BUTTON = By.id("btnSavePackageCustomerAttestation");

	// Manifest
	public By MANIFEST_SUMMARY_REPORT_ALL = By.xpath("//label[@for='chkg47ManifestSummaryReportAll']");
	public By MANIFEST_SUMMARY_REPORT_VIEW = By.xpath("//label[@for='chkg47ManifestSummaryReportView']");
	public By MANIFEST_ALL_ACCESS_CHECKBOX = By.xpath("//label[@for='chkg04ManifestAll']");
	public By MANIFEST_ADD_ACCESS_CHECKBOX = By.xpath("//label[@for='chkg04ManifestAdd']");
	public By PRINT_MANIFEST_BUTTON = By.id("manifestDetailPrintBtn");
	public By CLOSE_PRINT_MODAL_BUTTON = By
			.xpath("//button[@onclick='javascript: CloseManifestDetailPrintModal();']//i[@class='fa fa-times']");
	public By DELETE_MANIFEST_BUNDLE_BUTTON = By.id("btnDeleteManifestBundle");
	public By CONFIRM_DELETE_BUNDLE_BUTTON = By.id("btnDeleteBundleConfirm");
	public By SAVE_MANIFEST_BUTTON = By.id("btnSave");
	public By SKIP_MANIFEST_PACKAGE_BUTTON = By.id("btnSkipManifestPackage");
	public By CONFIRM_SKIP_BUTTON = By.id("btnSkipConfirm");
	public By DELETE_MANIFEST_PACKAGE_BUTTON = By.id("btnDeleteManifestPackage");
	public By CONFIRM_DELETE_PACKAGE_BUTTON = By
			.xpath("//div[@id='deleteManifestPackageModel']//button[@id='btnDeleteConfirm']");
	public By SEARCH_PACKAGE_BUTTON = By.id("searchPackagePopup");
	public By FILTER_LOGISTIC_DROPDOWN = By.id("Filter_LogisticId");
	public By FILTER_FROM_DATE = By.id("Filter_FromDate");
	public By DATEPICKER_DAY_1 = By.xpath("//td[normalize-space()='1']");
	public By SEARCH_BUTTON = By.xpath("//button[normalize-space()='Search']");
	public By PACKAGE_CHECKBOX = By.xpath("//label[@for='b38063de-b375-4421-a2ee-0fb842cdb451']");
	public By SUBMIT_BUTTON = By.xpath("//button[@class='btn btn-primary'][normalize-space()='Submit']");
	public By FIRST_MANIFEST_DETAIL_BUTTON = By.xpath("//tbody/tr[1]/td[7]/div[1]/a[1]/img[1]");
	public By CONFIRM_DELETE_BUTTON = By.id("btndeletemanifestconform");
	public By FIRST_MANIFEST_ACTION_MENU = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By MANIFEST_STATUS_DROPDOWN = By.id("Manifest_Status");
	public By MANIFEST_ACTION_DROPDOWN = By.xpath("//div[contains(@class,'bucket-dropdown-content')]");
	public By MANIFEST_ACTION_MENU = By.xpath("(//button[@id='bucketDrop']/i)[1]");
	public By EDIT_MANIFEST_OPTION = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Edit']");
	public By DELETE_MANIFEST_OPTION = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Delete']");
	public By NEW_MANIFEST_BUTTON = By.xpath("//span[normalize-space()='New Manifest']");
	public By DELIVERY_DATE_INPUT = By.id("Manifest_DeliveryDate");
	public By DATEPICKER_YEAR_DROPDOWN = By.xpath("//select[contains(@class,'ui-datepicker-year')]");
	public By DATEPICKER_MONTH_DROPDOWN = By.xpath("//select[contains(@class,'ui-datepicker-month')]");
	public By DRIVER_DROPDOWN = By.id("Manifest_Driver_Id");
	public By STARTING_POINT_DROPDOWN = By.id("Manifest_StartingPoint");
	public By END_POINT_DROPDOWN = By.id("Manifest_EndPoint");
	public By STATUS_DROPDOWN = By.id("Manifest_Status");
	public By SAVE_BUTTON = By.id("btnSave");

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

	// Package Setting
	public By saveButton = By.id("btnSave");

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
		wait.until(ExpectedConditions.elementToBeClickable(FIRST_MANIFEST_ACTION_MENU));
		clickWhenClickable(FIRST_MANIFEST_ACTION_MENU);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(EDIT_MANIFEST_OPTION));
		clickWhenClickable(EDIT_MANIFEST_OPTION);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(MANIFEST_STATUS_DROPDOWN));
		selectDropdownByIndexWhenReady(MANIFEST_STATUS_DROPDOWN, 10);
		sleep(2000);
		clickWhenClickable(SAVE_MANIFEST_BUTTON);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(PRINT_MANIFEST_BUTTON));
		clickWhenClickable(PRINT_MANIFEST_BUTTON);
		sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.print();");
		System.out.println("Manifest PDF auto-saved in Downloads folder");
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(CLOSE_PRINT_MODAL_BUTTON));
		clickWhenClickable(CLOSE_PRINT_MODAL_BUTTON);
	}

	public void testDeleteManifestBundleFunctionality() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(FIRST_MANIFEST_DETAIL_BUTTON));
		clickWhenClickable(FIRST_MANIFEST_DETAIL_BUTTON);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(DELETE_MANIFEST_BUNDLE_BUTTON));
		clickWhenClickable(DELETE_MANIFEST_BUNDLE_BUTTON);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(CONFIRM_DELETE_BUNDLE_BUTTON));
		clickWhenClickable(CONFIRM_DELETE_BUNDLE_BUTTON);

	}

	public void testAddManifestBundleFunctionality() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(FIRST_MANIFEST_DETAIL_BUTTON));
		sleep(2000);
		clickWhenClickable(FIRST_MANIFEST_DETAIL_BUTTON);

	}

	public void verifyUserCanSkipManifestPackage() {
		sleep(2000);
		clickWhenClickable(FIRST_MANIFEST_ACTION_MENU);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(EDIT_MANIFEST_OPTION));
		sleep(2000);
		clickWhenClickable(EDIT_MANIFEST_OPTION);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(MANIFEST_STATUS_DROPDOWN));
		sleep(2000);
		selectDropdownByIndexWhenReady(MANIFEST_STATUS_DROPDOWN, 2);
		sleep(2000);
		clickWhenClickable(SAVE_MANIFEST_BUTTON);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(SKIP_MANIFEST_PACKAGE_BUTTON));
		sleep(2000);
		clickWhenClickable(SKIP_MANIFEST_PACKAGE_BUTTON);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(CONFIRM_SKIP_BUTTON));
		sleep(2000);
		clickWhenClickable(CONFIRM_SKIP_BUTTON);

	}

	public void testDeleteManifestPackageAccessInDeliveryModule() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(DELETE_MANIFEST_PACKAGE_BUTTON));
		sleep(2000);
		clickWhenClickable(DELETE_MANIFEST_PACKAGE_BUTTON);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(CONFIRM_DELETE_PACKAGE_BUTTON));
		sleep(2000);
		clickWhenClickable(CONFIRM_DELETE_PACKAGE_BUTTON);
		sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(CONFIRM_DELETE_PACKAGE_BUTTON));
	}

	public void verifyUserCanAddManifestPackage() {
		sleep(2000);
		clickWhenClickable(SEARCH_PACKAGE_BUTTON);
		sleep(2000);
		clickWhenClickable(FILTER_LOGISTIC_DROPDOWN);
		sleep(2000);
		selectDropdownByIndexWhenReady(FILTER_LOGISTIC_DROPDOWN, 1);
		sleep(2000);
		clickWhenClickable(FILTER_FROM_DATE);
		sleep(2000);
		int year = LocalDate.now().getYear();
		String month = LocalDate.now().getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
		sleep(2000);
		WebElement yearDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(DATEPICKER_YEAR_DROPDOWN));
		new Select(yearDropdown).selectByVisibleText(String.valueOf(year));
		sleep(2000);
		WebElement monthDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(DATEPICKER_MONTH_DROPDOWN));
		sleep(2000);
		new Select(monthDropdown).selectByVisibleText(month);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(DATEPICKER_DAY_1)).click();
		sleep(2000);
		clickWhenClickable(SEARCH_BUTTON);
		sleep(2000);
		clickWhenClickable(PACKAGE_CHECKBOX);
		sleep(2000);
		clickWhenClickable(SUBMIT_BUTTON);

	}

	public void testManifestDetailIsAccessibleByUser() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(FIRST_MANIFEST_DETAIL_BUTTON));
		sleep(2000);
		clickWhenClickable(FIRST_MANIFEST_DETAIL_BUTTON);

	}

	public void verifyUserCannotAddOrEditManifest() {
		assertElementNotPresent(NEW_MANIFEST_BUTTON);
		clickWhenClickable(FIRST_MANIFEST_ACTION_MENU);
		wait.until(ExpectedConditions.visibilityOfElementLocated(MANIFEST_ACTION_DROPDOWN));
		assertElementNotPresent(EDIT_MANIFEST_OPTION);
	}

	public void testViewAndDeleteManifestAccessInDeliveryModule() {
		clickWhenClickable(FIRST_MANIFEST_ACTION_MENU);
		wait.until(ExpectedConditions.visibilityOfElementLocated(MANIFEST_ACTION_DROPDOWN));
		clickWhenClickable(DELETE_MANIFEST_OPTION);
		wait.until(ExpectedConditions.elementToBeClickable(CONFIRM_DELETE_BUTTON));
		clickWhenClickable(CONFIRM_DELETE_BUTTON);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(DELETE_MANIFEST_OPTION));
	}

	public void verifyUserCannotAddOrDeleteManifest() {
		assertElementNotPresent(NEW_MANIFEST_BUTTON);
		clickWhenClickable(MANIFEST_ACTION_MENU);
		wait.until(ExpectedConditions.visibilityOfElementLocated(MANIFEST_ACTION_DROPDOWN));
		assertElementNotPresent(DELETE_MANIFEST_OPTION);
	}

	public void testViewAndEditManifestAccessInDeliveryModule() {
		clickWhenClickable(MANIFEST_ACTION_MENU);
		wait.until(ExpectedConditions.visibilityOfElementLocated(MANIFEST_ACTION_DROPDOWN));
		clickWhenClickable(EDIT_MANIFEST_OPTION);
		wait.until(ExpectedConditions.elementToBeClickable(MANIFEST_STATUS_DROPDOWN));
		selectDropdownByIndexWhenReady(MANIFEST_STATUS_DROPDOWN, 2);
		clickWhenClickable(SAVE_BUTTON);

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
		clickWhenClickable(MANIFEST_ACTION_MENU);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(MANIFEST_ACTION_DROPDOWN));
		sleep(2000);
		assertElementNotPresent(EDIT_MANIFEST_OPTION);
		sleep(2000);
		assertElementNotPresent(DELETE_MANIFEST_OPTION);
	}

	public void verifyUserCanViewAndAddManifest() {
		sleep(2000);
		clickWhenClickable(NEW_MANIFEST_BUTTON);
		sleep(2000);
		clickWhenClickable(DELIVERY_DATE_INPUT);
		sleep(2000);
		LocalDate futureDate = LocalDate.now().plusDays(5);
		int day = futureDate.getDayOfMonth();
		int year = futureDate.getYear();
		String month = futureDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
		sleep(2000);
		WebElement yearDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(DATEPICKER_YEAR_DROPDOWN));
		new Select(yearDropdown).selectByVisibleText(String.valueOf(year));
		sleep(2000);
		WebElement monthDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(DATEPICKER_MONTH_DROPDOWN));
		new Select(monthDropdown).selectByVisibleText(month);
		sleep(2000);
		By DATE_TO_SELECT = By.xpath("//td[normalize-space()='" + day + "']");
		wait.until(ExpectedConditions.elementToBeClickable(DATE_TO_SELECT)).click();
		sleep(2000);
		clickWhenClickable(DRIVER_DROPDOWN);
		sleep(2000);
		selectDropdownByIndexWhenReady(DRIVER_DROPDOWN, 1);
		sleep(2000);
		clickWhenClickable(STARTING_POINT_DROPDOWN);
		sleep(2000);
		selectDropdownByIndexWhenReady(STARTING_POINT_DROPDOWN, 1);
		sleep(2000);
		clickWhenClickable(END_POINT_DROPDOWN);
		sleep(2000);
		selectDropdownByIndexWhenReady(END_POINT_DROPDOWN, 1);
		sleep(2000);
		clickWhenClickable(STATUS_DROPDOWN);
		sleep(2000);
		selectDropdownByIndexWhenReady(STATUS_DROPDOWN, 1);
		sleep(2000);
		clickWhenClickable(SAVE_BUTTON);
	}

	public void testProfileWithViewAndAddPermissionsForManifest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement selectAllModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		selectAllModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement manifestAllAccess = wait
				.until(ExpectedConditions.elementToBeClickable(MANIFEST_ALL_ACCESS_CHECKBOX));
		manifestAllAccess.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement manifestAddAccess = wait
				.until(ExpectedConditions.elementToBeClickable(MANIFEST_ADD_ACCESS_CHECKBOX));
		manifestAddAccess.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

	}

	public void openDeliveryManifestPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Delivery/Home/Manifests"));
	}

	// Customer Attestation
	public void verifyUserCanSendCustomerAttestationForSignature() {
		wait.until(ExpectedConditions.elementToBeClickable(SEND_FOR_SIGNATURE_BUTTON));
		clickWhenClickable(SEND_FOR_SIGNATURE_BUTTON);
		wait.until(ExpectedConditions.elementToBeClickable(SEND_SIGNATURE_DROPDOWN));
		selectDropdownByIndexWhenReady(SEND_SIGNATURE_DROPDOWN, 1);
	}

	public void verifyUserCanPrintCustomerAttestation() {
		wait.until(ExpectedConditions.elementToBeClickable(FIRST_PACKAGE_DETAIL_BUTTON));
		clickWhenClickable(FIRST_PACKAGE_DETAIL_BUTTON);
		wait.until(ExpectedConditions.elementToBeClickable(FIRST_CUSTOMER_ATTESTATION_ACTION_MENU));
		clickWhenClickable(FIRST_CUSTOMER_ATTESTATION_ACTION_MENU);
		wait.until(ExpectedConditions.elementToBeClickable(PRINT_CUSTOMER_ATTESTATION_OPTION));
		clickWhenClickable(PRINT_CUSTOMER_ATTESTATION_OPTION);
		((JavascriptExecutor) driver).executeScript("window.print();");
		System.out.println("Customer Attestation PDF auto-saved in Downloads folder");
		wait.until(ExpectedConditions.elementToBeClickable(CLOSE_PRINT_MODAL_BUTTON));
		clickWhenClickable(CLOSE_PRINT_MODAL_BUTTON);
	}

	public void testPrintAndSendForSignatureAccessToCustomerAttestation() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));

	}

	public void testCustomerAttestationAddEditRestricted() {
		assertElementNotPresent(ADD_CUSTOMER_ATTESTATION_BUTTON);
		wait.until(ExpectedConditions.elementToBeClickable(FIRST_CUSTOMER_ATTESTATION_ACTION_MENU));
		clickWhenClickable(FIRST_CUSTOMER_ATTESTATION_ACTION_MENU);
		wait.until(ExpectedConditions.visibilityOfElementLocated(CUSTOMER_ATTESTATION_ACTION_DROPDOWN));
		assertElementNotPresent(EDIT_CUSTOMER_ATTESTATION_OPTION);
	}

	public void testCustomerAttestationDeleteAccess() {
		wait.until(ExpectedConditions.elementToBeClickable(FIRST_PACKAGE_DETAIL_BUTTON));
		clickWhenClickable(FIRST_PACKAGE_DETAIL_BUTTON);
		wait.until(ExpectedConditions.elementToBeClickable(FIRST_CUSTOMER_ATTESTATION_ACTION_MENU));
		clickWhenClickable(FIRST_CUSTOMER_ATTESTATION_ACTION_MENU);
		wait.until(ExpectedConditions.elementToBeClickable(DELETE_CUSTOMER_ATTESTATION_OPTION));
		clickWhenClickable(DELETE_CUSTOMER_ATTESTATION_OPTION);
		wait.until(ExpectedConditions.elementToBeClickable(CONFIRM_DELETE_CUSTOMER_ATTESTATION_BUTTON));
		clickWhenClickable(CONFIRM_DELETE_CUSTOMER_ATTESTATION_BUTTON);
	}

	public void testNoAddOrDeleteAccessForCustomerAttestation() {
		assertElementNotPresent(ADD_CUSTOMER_ATTESTATION_BUTTON);
		wait.until(ExpectedConditions.elementToBeClickable(FIRST_CUSTOMER_ATTESTATION_ACTION_MENU));
		clickWhenClickable(FIRST_CUSTOMER_ATTESTATION_ACTION_MENU);
		wait.until(ExpectedConditions.visibilityOfElementLocated(CUSTOMER_ATTESTATION_ACTION_DROPDOWN));
		assertElementNotPresent(DELETE_CUSTOMER_ATTESTATION_OPTION);
	}

	public void testCustomerAttestationEditAccess() {
		wait.until(ExpectedConditions.elementToBeClickable(FIRST_PACKAGE_DETAIL_BUTTON));
		clickWhenClickable(FIRST_PACKAGE_DETAIL_BUTTON);
		wait.until(ExpectedConditions.elementToBeClickable(FIRST_CUSTOMER_ATTESTATION_ACTION_MENU));
		clickWhenClickable(FIRST_CUSTOMER_ATTESTATION_ACTION_MENU);
		wait.until(ExpectedConditions.elementToBeClickable(EDIT_CUSTOMER_ATTESTATION_OPTION));
		clickWhenClickable(EDIT_CUSTOMER_ATTESTATION_OPTION);
		waitAndSendKeys(ADDRESS_RECEIVER_INPUT, "Ahmedabad");
		wait.until(ExpectedConditions.elementToBeClickable(SAVE_CUSTOMER_ATTESTATION_BUTTON));
		clickWhenClickable(SAVE_CUSTOMER_ATTESTATION_BUTTON);
	}

	public void testEditAndDeleteAccessRestrictedForCustomerAttestation() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(FIRST_CUSTOMER_ATTESTATION_ACTION_MENU));
		clickWhenClickable(FIRST_CUSTOMER_ATTESTATION_ACTION_MENU);
		sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(CUSTOMER_ATTESTATION_ACTION_DROPDOWN));
		sleep(2000);
		assertElementNotPresent(EDIT_CUSTOMER_ATTESTATION_OPTION);
		sleep(2000);
		assertElementNotPresent(DELETE_CUSTOMER_ATTESTATION_OPTION);
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
				.until(ExpectedConditions.elementToBeClickable(CUSTOMER_ATTESTATION_ALL_ACCESS_CHECKBOX));
		customerAttestationAllAccess.click();
		sleep(2000);
		WebElement customerAttestationAddAccess = wait
				.until(ExpectedConditions.elementToBeClickable(CUSTOMER_ATTESTATION_ADD_ACCESS_CHECKBOX));
		customerAttestationAddAccess.click();

	}

	public void testAddCustomerAttestationFunctionality() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(FIRST_PACKAGE_DETAIL_BUTTON));
		sleep(2000);
		clickWhenClickable(FIRST_PACKAGE_DETAIL_BUTTON);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(ADD_CUSTOMER_ATTESTATION_BUTTON));
		sleep(2000);
		clickWhenClickable(ADD_CUSTOMER_ATTESTATION_BUTTON);
		sleep(2000);
		waitAndSendKeys(RX_NUMBER_INPUT, "RX7845123");
		waitAndSendKeys(PATIENT_NAME_INPUT, "John A. Smith");
		waitAndSendKeys(MEDICATION_INPUT, "Atorvastatin 20mg Tablet");
		waitAndSendKeys(RECEIVED_FROM_INPUT, "CVS Pharmacy");
		sleep(2000);
		selectDate(FILLED_DATE_INPUT, 5);
		sleep(2000);
		selectDate(RECEIVED_DATE_INPUT, 5);
		sleep(2000);
		waitAndSendKeys(ADDRESS_RECEIVER_INPUT, "742 Evergreen Terrace, Springfield, IL 62704");
		waitAndSendKeys(RECEIVER_NAME_INPUT, "Mary Smith");
		waitAndSendKeys(PATIENT_RELATION_INPUT, "Spouse");
		waitAndSendKeys(PHONE_NUMBER_INPUT, "2175558945");
		sleep(2000);
		clickWhenClickable(SAVE_CUSTOMER_ATTESTATION_BUTTON);
	}

	private void selectDate(By dateInputLocator, int daysFromToday) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		clickWhenClickable(dateInputLocator);
		LocalDate futureDate = LocalDate.now().plusDays(daysFromToday);
		int day = futureDate.getDayOfMonth();
		int year = futureDate.getYear();
		String month = futureDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
		WebElement yearDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(DATEPICKER_YEAR_DROPDOWN));
		new Select(yearDropdown).selectByVisibleText(String.valueOf(year));
		WebElement monthDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(DATEPICKER_MONTH_DROPDOWN));
		new Select(monthDropdown).selectByVisibleText(month);
		WebElement dayToSelect = wait.until(ExpectedConditions.elementToBeClickable(datepickerDay(day)));
		dayToSelect.click();

	}

	// Delivery Job Setting
	public void noEditDeliveryJobSettingTest() {
		clickWhenClickable(DELIVERY_MODULE_CHECKBOX);
		sleep(2000);
		clickWhenClickable(DELIVERY_ACTION_MENU);
		sleep(2000);
		assertElementNotPresent(DELIVERY_EDIT_OPTION);
	}

	public void runTriggersDeliveryModuleTest() {
		clickWhenClickable(DELIVERY_MODULE_CHECKBOX);
		sleep(2000);
		clickWhenClickable(RUN_TRIGGER_BUTTON);
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
		clickWhenClickable(DELIVERY_JOB_SETTINGS_URL);
		sleep(2000);
		assertElementNotPresent(DELIVERY_RUN_TRIGGER_BUTTON);
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
		wait.until(ExpectedConditions.elementToBeClickable(DELIVERY_MODULE_CHECKBOX));
		clickWhenClickable(DELIVERY_MODULE_CHECKBOX);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(DELIVERY_MODULE_ACTION_MENU));
		clickWhenClickable(DELIVERY_MODULE_ACTION_MENU);
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EDIT_JOB_SETTING_OPTION));
		clickWhenClickable(EDIT_JOB_SETTING_OPTION);
		sleep(2000);
		waitAndSendKeys(FROM_EMAIL_INPUT, "delivery_admin@mailinator.com");
		waitAndSendKeys(TO_EMAIL_INPUT, "notifications@mailinator.com");
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(SAVE_JOB_SETTING_BUTTON));
		clickWhenClickable(SAVE_JOB_SETTING_BUTTON);
	}

	// Delivery Report
	public void verifyUserCannotExportDeliveryReport() {
		assertElementNotPresent(EXPORT_EXCEL_BUTTON);
	}

	public void verifyUserCanExportDeliveryReport() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EXPORT_EXCEL_BUTTON));
		sleep(2000);
		clickWhenClickable(EXPORT_EXCEL_BUTTON);
		sleep(2000);
	}

	public void viewOnlyDeliveryReportProfileTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement deliveryReportAllElement = wait.until(ExpectedConditions.elementToBeClickable(DELIVERY_REPORT_ALL));
		deliveryReportAllElement.click();
		sleep(2000);
		WebElement deliveryReportViewElement = wait
				.until(ExpectedConditions.elementToBeClickable(DELIVERY_REPORT_VIEW));
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
		wait.until(ExpectedConditions.elementToBeClickable(MANIFEST_SUMMARY_REPORT_EXPORT_BUTTON));
		sleep(2000);
		clickWhenClickable(MANIFEST_SUMMARY_REPORT_EXPORT_BUTTON);
		sleep(2000);
	}

	public void verifyUserCannotExportManifestSummaryReport() {
		assertElementNotPresent(EXPORT_EXCEL_BUTTON_MANIFEST_SUMMARY);
	}

	public void manifestSummaryReportViewOnlyTest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement manifestSummaryReportAllElement = wait
				.until(ExpectedConditions.elementToBeClickable(MANIFEST_SUMMARY_REPORT_ALL));
		manifestSummaryReportAllElement.click();
		sleep(2000);
		WebElement manifestSummaryReportViewElement = wait
				.until(ExpectedConditions.elementToBeClickable(MANIFEST_SUMMARY_REPORT_VIEW));
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
		assertElementNotPresent(EXPORT_DELIVERY_STATISTIC_REPORT);
	}

	public void verifyUserCanExportDeliveryStatisticReport() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(EXPORT_DELIVERY_STATISTIC_REPORT));
		sleep(2000);
		clickWhenClickable(EXPORT_DELIVERY_STATISTIC_REPORT);
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
				.until(ExpectedConditions.elementToBeClickable(DELIVERY_STATISTIC_REPORT_ALL));
		deliveryStatisticReportAllElement.click();
		sleep(2000);
		WebElement deliveryStatisticReportViewElement = wait
				.until(ExpectedConditions.elementToBeClickable(DELIVERY_STATISTIC_REPORT_VIEW));
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
