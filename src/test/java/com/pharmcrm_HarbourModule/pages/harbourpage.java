package com.pharmcrm_HarbourModule.pages;
import java.time.Duration;
import java.util.List;
import org.testng.Assert;
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

public class harbourpage {
	private WebDriver driver;
	private WebDriverWait wait;

	// Delivery Statistic Report
	public By packageSettingAllLabel = By.xpath("(//label[@for='chkg18PackageSettingAll'])[1]");
	public By packageRestrictionAllLabel = By.xpath("(//label[@for='chkg45PackageRestrictionAll'])[1]");
	public By deliveryDistancesAllLabel = By.xpath("(//label[@for='chkg04DeliveryDistancesAll'])[1]");
	public By logisticAllLabel = By.xpath("(//label[@for='chkg04LogisticAll'])[1]");
	public By deliveryMarkerAllLabel = By.xpath("(//label[@for='chkg44DeliveryMarkerAll'])[1]");
	public By detailedReportLabel = By.xpath("//label[normalize-space()='Detailed Report?']");
	public By exportExcelButton = By.xpath("//span[normalize-space()='Export Excel']");
	public By harbourDetailedReportViewLabel = By.xpath("//label[@for='chkg50HarbourDetailedReportView']");
	public By harbourDeliveryStatisticReportAllLabel = By
			.xpath("//label[@for='chkg47HarbourDeliveryStatisticReportAll']");
	public By harbourDeliveryStatisticReportExportLabel = By
			.xpath("//label[@for='chkg47HarbourDeliveryStatisticReportExport']");

	// Driver Detail Report
	public By harbourManifestSummaryReportExportLabel = By
			.xpath("//label[@for='chkg47HarbourManifestSummaryReportExport']");
	public By firstRowActionIcon = By.xpath("//tbody/tr[1]/td[7]/a[1]//*[name()='svg']");

	// Delivery Report
	public By harbourDeliveryReportExportLabel = By.xpath("//label[@for='chkg47HarbourDeliveryReportExport']");

	// Customer Attestation
	public By harbourCustomerAttestationPrintLabel = By.xpath("//label[@for='chkg46HarbourCustomerAttestationPrint']");
	public By harbourCustomerAttestationPrintSendForSignatureLabel = By
			.xpath("//label[@for='chkg46HarbourCustomerAttestationPrintSendforSignature']");
	public By harbourCustomerAttestationAllLabel = By.xpath("//label[@for='chkg46HarbourCustomerAttestationAll']");
	public By packageViewDetailsIcon = By.xpath(
			"//div[@id='package_d5090f5c-d3f8-49e6-b488-e6abbadff263']//a[@title='View Details']//*[name()='svg']//*[name()='path' and @id='Exclusion_1']");
	public By sendCustomerAttestationForSignatureButton = By
			.xpath("//button[normalize-space()='Send Customer Attestation for Signature']");
	public By customerAttestationPrintButton = By.xpath("//button[normalize-space()='Customer Attestation Print']");

	// Manifest
	public By toastMessage = By.xpath("//div[@class='toast-message']");
	public By packageReleaseButton = By
			.xpath("//div[@id='package_d5090f5c-d3f8-49e6-b488-e6abbadff263']//span[contains(text(),'Release')]");
	public By packageDetailsViewIcon = By.xpath(
			"//div[@id='package_d5090f5c-d3f8-49e6-b488-e6abbadff263']//a[@title='View Details']//*[name()='svg']");
	public By deleteConfirmBtn = By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']");
	public By printIcon = By.xpath("//i[@class='fa-solid fa-print']");
	public By printBtn = By.xpath("//button[@onclick=\"printReturnPackages('printReturnPackage')\"]");
	public By downloadReferenceDocumentsLabel = By.xpath("//label[normalize-space()='Reference Documents :']");
	public By downloadSignatureLink = By.xpath("//a[contains(text(),'signature.png')]");
	public By deliveredCheckbox = By.xpath("//input[@id='Delivered']");
	public By downloadDriverAttestationOption = By.xpath("//label[contains(text(),'Driver Attestation')]");
	public By actionMenuButton = By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']");
	public By printCustomerSignatureOption = By
			.xpath("//div[contains(@class,'gridRecordContextInner')]//span[contains(normalize-space(),'Print')]");
	public By printCustomerSignatureButton = By
			.xpath("//button[@onclick=\"javascript: printpres('printpackagepage');\"]//*[name()='svg']");
	public By setDeliveryDateButton = By.xpath("//span[normalize-space()='Set Delivery Date']");
	public By packageDeliveryDateInput = By.xpath("//input[@id='Package_Doc_DeliveryDate']");
	public By savePackageDeliveryDateButton = By.xpath("//button[@id='btnSavePackageDeliveryDate']");
	public By skippedCheckbox = By.xpath("//input[@id='Skipped']");
	public By newManifestLabel = By.xpath("//span[normalize-space()='New Manifest']");
	public By manifestDeliveryDateInput = By.xpath("//input[@id='Manifest_DeliveryDate']");
	public By manifestDriverDropdown = By.xpath("//select[@id='Manifest_Driver_Id']");
	public By manifestStartingPointDropdown = By.xpath("//select[@id='Manifest_StartingPoint']");
	public By manifestEndPointDropdown = By.xpath("//select[@id='Manifest_EndPoint']");
	public By switchMainLabel = By.xpath("//label[@class='switchMain']");
	public By btnNext = By.xpath("//button[@id='btnNext']");
	public By addStore = By.xpath("//span[normalize-space()='Add Store']");
	public By checkboxLabel = By.xpath("//label[@for='cefa2960-b5b6-4b2e-acc4-a8d7a66311e0']");
	public By btnShareConfirm = By.xpath("//button[@id='btnShareConfirm']");
	public By btnSave = By.xpath("//button[@id='btnSave']");
	public By manifestActionBtn = By.xpath("//tbody/tr[1]/td[7]//button[1]");
	public By manifestEditOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By manifestDeleteOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	public By btnDeleteConfirm = By.xpath("//button[@id='btndeletemanifestconform']");
	public By viewManifestsIcon = By.xpath("//tbody/tr[1]/td[7]/div[1]/a[1]/img[1]");
	public By btnSkipManifestPackage = By.xpath("//button[@id='btnSkipManifestPackage']");
	public By packageNotes = By.xpath("//textarea[@id='txtPackageStatusNotes']");
	public By btnSkipConfirm = By.xpath("//button[@id='btnSkipConfirm']");
	public By deleteButton = By.xpath("(//button[@id='btnDeleteManifestPackage'])[1]");
	public By manifestDetailPrintBtn = By.xpath("//button[@id='manifestDetailPrintBtn']");
	public By manifestPrintConfirmBtn = By.xpath("//button[@onclick=\"printManifest('manifestPrintPage')\"]");
	public By harbourManifestDeleteLabel = By.xpath("//label[@for='chkg42HarbourManifestDelete']");
	public By harbourManifestEditLabel = By.xpath("//label[@for='chkg42HarbourManifestEdit']");
	public By harbourManifestAllLabel = By.xpath("//label[@for='chkg42HarbourManifestAll']");
	public By harbourManifestAddLabel = By.xpath("//label[@for='chkg42HarbourManifestAdd']");

	// Package
	public By harbourPackageViewLabel = By.xpath("//label[@for='chkg42HarbourPackageView']");
	public By harbourPackageAllLabel = By.xpath("//label[@for='chkg42HarbourPackageAll']");

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

	// General Audit
	public By harbourGeneralAllLabel = By.xpath("//label[@for='chkg46HarbourGeneralAll']");

	public harbourpage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// Delivery Statistic Report
	public void verifyUserCannotExportHarbourModule() {
		sleep(2000);
		List<WebElement> elements = driver.findElements(exportExcelButton);
		Assert.assertTrue(elements.isEmpty(), "Export Excel button should NOT be present");

	}

	public void validateUserCanCheckDetailedReportViewAccessForDeliveryStatisticReportHarbourModule() {
		sleep(2000);
		WebElement detailedReportLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(detailedReportLabel));
		detailedReportLabelElement.click();
	}

	public void userShouldNotBeAbleToViewDetailedReportForHarbourModule() {
		sleep(5000);
		List<WebElement> elements = driver.findElements(detailedReportLabel);
		Assert.assertTrue(elements.isEmpty(), "Detailed Report? label should NOT be present");
	}

	public void validateUserCanExportDeliveryStatisticReportHarbourModule() {
		sleep(5000);
		WebElement exportExcelButtonElement = wait.until(ExpectedConditions.elementToBeClickable(exportExcelButton));
		exportExcelButtonElement.click();
	}

	public void openHarbourDeliveryStatisticReportsPage(String fullUrl) {
		sleep(5000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/HarbourLogistic/Home/DeliveryStatisticReports"));
	}

	public void createProfileWithOnlyDetailedReportViewAccessForDeliveryStatisticReportHarbourModule() {
		sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		safeCheckboxClick(packageSettingAllLabel);
		safeCheckboxClick(packageSettingAllLabel);
		sleep(1000);
		safeCheckboxClick(packageRestrictionAllLabel);
		safeCheckboxClick(packageRestrictionAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryDistancesAllLabel);
		safeCheckboxClick(deliveryDistancesAllLabel);
		sleep(1000);
		safeCheckboxClick(logisticAllLabel);
		safeCheckboxClick(logisticAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryMarkerAllLabel);
		safeCheckboxClick(deliveryMarkerAllLabel);
		sleep(1000);
		safeCheckboxClick(harbourDeliveryStatisticReportExportLabel);
		WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", submitBtn);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-150)");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
		}

	}

	public void createProfileWithOnlyExportAccessForDeliveryStatisticReportHarbourModule() {
		sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		safeCheckboxClick(packageSettingAllLabel);
		safeCheckboxClick(packageSettingAllLabel);
		sleep(1000);
		safeCheckboxClick(packageRestrictionAllLabel);
		safeCheckboxClick(packageRestrictionAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryDistancesAllLabel);
		safeCheckboxClick(deliveryDistancesAllLabel);
		sleep(1000);
		safeCheckboxClick(logisticAllLabel);
		safeCheckboxClick(logisticAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryMarkerAllLabel);
		safeCheckboxClick(deliveryMarkerAllLabel);
		sleep(1000);
		safeCheckboxClick(harbourDetailedReportViewLabel);
		WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", submitBtn);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-150)");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
		}
	}

	// Driver Detail Report
	public void exportDriverDetailReportHarbour() {
		sleep(5000);
		WebElement exportExcelButtonElement = wait.until(ExpectedConditions.elementToBeClickable(firstRowActionIcon));
		exportExcelButtonElement.click();
	}

	public void cannotExportDriverDetailReportHarbour() {
		sleep(2000);
		List<WebElement> elements = driver.findElements(firstRowActionIcon);
		Assert.assertTrue(elements.isEmpty(), "Export Excel button should NOT be present");
	}

	public void createProfileWithNoExportAccessForDriverDetailReportHarbourModule() {
		sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		safeCheckboxClick(packageSettingAllLabel);
		safeCheckboxClick(packageSettingAllLabel);
		sleep(1000);
		safeCheckboxClick(packageRestrictionAllLabel);
		safeCheckboxClick(packageRestrictionAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryDistancesAllLabel);
		safeCheckboxClick(deliveryDistancesAllLabel);
		sleep(1000);
		safeCheckboxClick(logisticAllLabel);
		safeCheckboxClick(logisticAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryMarkerAllLabel);
		safeCheckboxClick(deliveryMarkerAllLabel);
		sleep(1000);
		safeCheckboxClick(harbourManifestSummaryReportExportLabel);
		WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", submitBtn);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-150)");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
		}

	}

	public void createProfileWithExportAccessForDriverDetailReportHarbourModule() {
		sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		safeCheckboxClick(packageSettingAllLabel);
		safeCheckboxClick(packageSettingAllLabel);
		sleep(1000);
		safeCheckboxClick(packageRestrictionAllLabel);
		safeCheckboxClick(packageRestrictionAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryDistancesAllLabel);
		safeCheckboxClick(deliveryDistancesAllLabel);
		sleep(1000);
		safeCheckboxClick(logisticAllLabel);
		safeCheckboxClick(logisticAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryMarkerAllLabel);
		safeCheckboxClick(deliveryMarkerAllLabel);
		sleep(1000);
		WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", submitBtn);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-150)");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
		}
	}

	// Delivery Report
	public void cannotExportDeliveryReportHarbour() {
		sleep(2000);
		List<WebElement> elements = driver.findElements(exportExcelButton);
		Assert.assertTrue(elements.isEmpty(), "Export Excel button should NOT be present");
	}

	public void exportDeliveryReportHarbour() {
		sleep(2000);
		WebElement detailedReportLabelElement = wait.until(ExpectedConditions.elementToBeClickable(exportExcelButton));
		detailedReportLabelElement.click();
	}

	public void openHarbourDeliveryReportsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/HarbourLogistic/Home/DeliveryReports"));
	}

	public void createProfileWithNoExportAccessForDeliveryReportHarbourModule() {
		sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		safeCheckboxClick(packageSettingAllLabel);
		safeCheckboxClick(packageSettingAllLabel);
		sleep(1000);
		safeCheckboxClick(packageRestrictionAllLabel);
		safeCheckboxClick(packageRestrictionAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryDistancesAllLabel);
		safeCheckboxClick(deliveryDistancesAllLabel);
		sleep(1000);
		safeCheckboxClick(logisticAllLabel);
		safeCheckboxClick(logisticAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryMarkerAllLabel);
		safeCheckboxClick(deliveryMarkerAllLabel);
		sleep(1000);
		safeCheckboxClick(harbourDeliveryReportExportLabel);
		WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", submitBtn);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-150)");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
		}

	}

	public void createProfileWithExportAccessForDeliveryReportHarbourModule() {
		sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		safeCheckboxClick(packageSettingAllLabel);
		safeCheckboxClick(packageSettingAllLabel);
		sleep(1000);
		safeCheckboxClick(packageRestrictionAllLabel);
		safeCheckboxClick(packageRestrictionAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryDistancesAllLabel);
		safeCheckboxClick(deliveryDistancesAllLabel);
		sleep(1000);
		safeCheckboxClick(logisticAllLabel);
		safeCheckboxClick(logisticAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryMarkerAllLabel);
		safeCheckboxClick(deliveryMarkerAllLabel);
		sleep(1000);
		WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", submitBtn);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-150)");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
		}

	}

	// Customer Attestation
	public void cannotPrintCustomerAttestation() {
		sleep(2000);
		List<WebElement> elements = driver.findElements(customerAttestationPrintButton);
		Assert.assertTrue(elements.isEmpty(), "Send Customer Attestation for Signature button should NOT be present");
	}

	public void sendCustomerAttestationForSignature() {
		sleep(2000);
		WebElement detailedReportLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(sendCustomerAttestationForSignatureButton));
		detailedReportLabelElement.click();

	}

	public void cannotSendCustomerAttestationForSignature() {
		sleep(2000);
		List<WebElement> elements = driver.findElements(sendCustomerAttestationForSignatureButton);
		Assert.assertTrue(elements.isEmpty(), "Send Customer Attestation for Signature button should NOT be present");
	}

	public void printCustomerAttestation() {
		sleep(2000);
		WebElement detailedReportLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(packageViewDetailsIcon));
		detailedReportLabelElement.click();
		sleep(2000);
		WebElement customerAttestationPrintElement = wait
				.until(ExpectedConditions.elementToBeClickable(customerAttestationPrintButton));
		customerAttestationPrintElement.click();
	}

	public void createProfileWithSendForSignatureAccessForCustomerAttestationHarbourModule() {
		sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		safeCheckboxClick(packageSettingAllLabel);
		safeCheckboxClick(packageSettingAllLabel);
		sleep(1000);
		safeCheckboxClick(packageRestrictionAllLabel);
		safeCheckboxClick(packageRestrictionAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryDistancesAllLabel);
		safeCheckboxClick(deliveryDistancesAllLabel);
		sleep(1000);
		safeCheckboxClick(logisticAllLabel);
		safeCheckboxClick(logisticAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryMarkerAllLabel);
		safeCheckboxClick(deliveryMarkerAllLabel);
		sleep(1000);
		safeCheckboxClick(harbourCustomerAttestationPrintLabel);
		sleep(1000);
		WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", submitBtn);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-150)");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
		}

	}

	public void createProfileWithAllAccessForManifestHarbourModule() {
		sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		safeCheckboxClick(packageSettingAllLabel);
		safeCheckboxClick(packageSettingAllLabel);
		sleep(1000);
		safeCheckboxClick(packageRestrictionAllLabel);
		safeCheckboxClick(packageRestrictionAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryDistancesAllLabel);
		safeCheckboxClick(deliveryDistancesAllLabel);
		sleep(1000);
		safeCheckboxClick(logisticAllLabel);
		safeCheckboxClick(logisticAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryMarkerAllLabel);
		safeCheckboxClick(deliveryMarkerAllLabel);
		sleep(1000);
		WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", submitBtn);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-150)");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
		}
	}

	// Manifest
	public String verifyErrorMessageForAddStore() {
		WebElement newManifestLabelElement = wait.until(ExpectedConditions.elementToBeClickable(newManifestLabel));
		newManifestLabelElement.click();
		String manifestDeliveryDateValue = Hooks.prop.getProperty("manifestDeliveryDateValue");
		WebElement manifestDeliveryDateInputElement = driver.findElement(manifestDeliveryDateInput);
		manifestDeliveryDateInputElement.sendKeys(manifestDeliveryDateValue);
		WebElement dropdown = driver.findElement(manifestDriverDropdown);
		Select select = new Select(dropdown);
		select.selectByIndex(1);
		WebElement startDropdown = driver.findElement(manifestStartingPointDropdown);
		Select startSelect = new Select(startDropdown);
		startSelect.selectByIndex(1);
		WebElement endDropdown = driver.findElement(manifestEndPointDropdown);
		Select endSelect = new Select(endDropdown);
		endSelect.selectByIndex(1);
		WebElement switchLabel = driver.findElement(switchMainLabel);
		switchLabel.click();
		WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(btnNext));
		nextButton.click();
		sleep(2000);
		startSelect.selectByIndex(1);
		sleep(2000);
		endSelect.selectByIndex(1);
		sleep(2000);
		WebElement addStoreBtn = wait.until(ExpectedConditions.elementToBeClickable(addStore));
		addStoreBtn.click();
		sleep(2000);
		WebElement confirmBtn = wait.until(ExpectedConditions.elementToBeClickable(btnShareConfirm));
		confirmBtn.click();
		sleep(2000);
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

	public String shouldDisplayValidationForEmptyFields() {
		WebElement newManifestLabelElement = wait.until(ExpectedConditions.elementToBeClickable(newManifestLabel));
		newManifestLabelElement.click();
		WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(btnNext));
		nextButton.click();
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

	public void verifyUserCanPrintManifest() {
		sleep(2000);
		WebElement printBtn = wait.until(ExpectedConditions.elementToBeClickable(manifestDetailPrintBtn));
		printBtn.click();
		sleep(2000);
		WebElement confirmPrintBtn = wait.until(ExpectedConditions.elementToBeClickable(manifestPrintConfirmBtn));
		confirmPrintBtn.click();
	}

	public void verifyUserCanDeleteManifestPackage() {
		sleep(2000);
		WebElement btnDelete = wait.until(ExpectedConditions.elementToBeClickable(deleteButton));
		btnDelete.click();
		sleep(2000);
		By confirmDeleteBtn = By.xpath("//button[@id='btnDeleteConfirm' and normalize-space()='Confirm']");
		WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteBtn));
		btn.click();

	}

	public void skipManifestPackage() {
		sleep(2000);
		WebElement skipBtn = wait.until(ExpectedConditions.elementToBeClickable(btnSkipManifestPackage));
		skipBtn.click();
		String packageStatusNoteValue = Hooks.prop.getProperty("packageStatusNoteValue");
		WebElement packageNotesElement = wait.until(ExpectedConditions.visibilityOfElementLocated(packageNotes));
		packageNotesElement.clear();
		packageNotesElement.sendKeys(packageStatusNoteValue);
		WebElement skipConfirmBtn = wait.until(ExpectedConditions.elementToBeClickable(btnSkipConfirm));
		skipConfirmBtn.click();
	}

	public void verifyUserCanViewDetail() {
		sleep(2000);
		WebElement viewManifestIcon = wait.until(ExpectedConditions.elementToBeClickable(viewManifestsIcon));
		viewManifestIcon.click();
	}

	public void noAddEditAdditionalAccess() {
		sleep(2000);
		List<WebElement> addOptions = driver.findElements(newManifestLabel);
		Assert.assertTrue(addOptions.isEmpty(), "Edit option should NOT be present");
		sleep(2000);
		WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(manifestActionBtn));
		btn.click();
		sleep(2000);
		List<WebElement> editOptions = driver.findElements(manifestEditOption);
		Assert.assertTrue(editOptions.isEmpty(), "Edit option should NOT be present");
		sleep(2000);
	}

	public void viewAndDeleteManifest() {
		sleep(2000);
		WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(manifestActionBtn));
		btn.click();
		sleep(2000);
		WebElement deleteOption = wait.until(ExpectedConditions.elementToBeClickable(manifestDeleteOption));
		deleteOption.click();
		WebElement confirmBtn = wait.until(ExpectedConditions.elementToBeClickable(btnDeleteConfirm));
		confirmBtn.click();
	}

	public void noAddDeleteAdditionalAccess() {
		sleep(2000);
		List<WebElement> editOptions = driver.findElements(newManifestLabel);
		Assert.assertTrue(editOptions.isEmpty(), "Edit option should NOT be present");
		sleep(2000);
		WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(manifestActionBtn));
		btn.click();
		sleep(2000);
		List<WebElement> deleteOptions = driver.findElements(manifestDeleteOption);
		Assert.assertTrue(deleteOptions.isEmpty(), "Delete option should NOT be present");
	}

	public void viewAndEditManifest() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement edit = wait.until(ExpectedConditions.elementToBeClickable(manifestEditOption));
		edit.click();
		sleep(2000);
		WebElement startDropdown = driver.findElement(manifestStartingPointDropdown);
		Select startSelect = new Select(startDropdown);
		startSelect.selectByIndex(1);
		WebElement endDropdown = driver.findElement(manifestEndPointDropdown);
		Select endSelect = new Select(endDropdown);
		endSelect.selectByIndex(1);
		sleep(2000);
		WebElement addStoreBtn = wait.until(ExpectedConditions.elementToBeClickable(addStore));
		addStoreBtn.click();
		sleep(2000);
		WebElement label = wait.until(ExpectedConditions.elementToBeClickable(checkboxLabel));
		label.click();
		sleep(2000);
		WebElement confirmBtn = wait.until(ExpectedConditions.elementToBeClickable(btnShareConfirm));
		confirmBtn.click();
		sleep(2000);
		WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(btnSave));
		saveButton.click();
	}

	public void noEditDeleteAdditionalAccess() {
		sleep(2000);
		WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(manifestActionBtn));
		btn.click();
		sleep(2000);
		List<WebElement> editOptions = driver.findElements(manifestEditOption);
		Assert.assertTrue(editOptions.isEmpty(), "Edit option should NOT be present");
		sleep(2000);
		List<WebElement> deleteOptions = driver.findElements(manifestDeleteOption);
		Assert.assertTrue(deleteOptions.isEmpty(), "Delete option should NOT be present");
	}

	public void viewAndAddManifest() {
		WebElement newManifestLabelElement = wait.until(ExpectedConditions.elementToBeClickable(newManifestLabel));
		newManifestLabelElement.click();
		String manifestDeliveryDateValue = Hooks.prop.getProperty("manifestDeliveryDateValue");
		WebElement manifestDeliveryDateInputElement = driver.findElement(manifestDeliveryDateInput);
		manifestDeliveryDateInputElement.sendKeys(manifestDeliveryDateValue);
		WebElement dropdown = driver.findElement(manifestDriverDropdown);
		Select select = new Select(dropdown);
		select.selectByIndex(1);
		WebElement startDropdown = driver.findElement(manifestStartingPointDropdown);
		Select startSelect = new Select(startDropdown);
		startSelect.selectByIndex(1);
		WebElement endDropdown = driver.findElement(manifestEndPointDropdown);
		Select endSelect = new Select(endDropdown);
		endSelect.selectByIndex(1);
		WebElement switchLabel = driver.findElement(switchMainLabel);
		switchLabel.click();
		WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(btnNext));
		nextButton.click();
		sleep(2000);
		startSelect.selectByIndex(1);
		sleep(2000);
		endSelect.selectByIndex(1);
		sleep(2000);
		WebElement addStoreBtn = wait.until(ExpectedConditions.elementToBeClickable(addStore));
		addStoreBtn.click();
		sleep(2000);
		WebElement label = wait.until(ExpectedConditions.elementToBeClickable(checkboxLabel));
		label.click();
		sleep(2000);
		WebElement confirmBtn = wait.until(ExpectedConditions.elementToBeClickable(btnShareConfirm));
		confirmBtn.click();
		sleep(2000);
		WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(btnSave));
		saveButton.click();

	}

	public void openManifestPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/HarbourLogistic/Home/Manifests"));
	}

	public void createProfileWithViewAndDeleteAccessForManifestHarbourModule() {
		sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		safeCheckboxClick(packageSettingAllLabel);
		safeCheckboxClick(packageSettingAllLabel);
		sleep(1000);
		safeCheckboxClick(packageRestrictionAllLabel);
		safeCheckboxClick(packageRestrictionAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryDistancesAllLabel);
		safeCheckboxClick(deliveryDistancesAllLabel);
		sleep(1000);
		safeCheckboxClick(logisticAllLabel);
		safeCheckboxClick(logisticAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryMarkerAllLabel);
		safeCheckboxClick(deliveryMarkerAllLabel);
		sleep(1000);
		safeCheckboxClick(harbourManifestAllLabel);
		sleep(1000);
		safeCheckboxClick(harbourManifestDeleteLabel);
		sleep(1000);
		WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", submitBtn);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-150)");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
		}

	}

	public void givenICreateAProfileWithViewAndEditAccessForManifestHarbourModule() {
		sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		safeCheckboxClick(packageSettingAllLabel);
		safeCheckboxClick(packageSettingAllLabel);
		sleep(1000);
		safeCheckboxClick(packageRestrictionAllLabel);
		safeCheckboxClick(packageRestrictionAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryDistancesAllLabel);
		safeCheckboxClick(deliveryDistancesAllLabel);
		sleep(1000);
		safeCheckboxClick(logisticAllLabel);
		safeCheckboxClick(logisticAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryMarkerAllLabel);
		safeCheckboxClick(deliveryMarkerAllLabel);
		sleep(1000);
		safeCheckboxClick(harbourManifestAllLabel);
		sleep(1000);
		safeCheckboxClick(harbourManifestEditLabel);
		sleep(1000);
		WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", submitBtn);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-150)");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
		}

	}

	public void createProfileWithViewAndAddAccessForManifestHarbourModule() {
		sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		safeCheckboxClick(packageSettingAllLabel);
		safeCheckboxClick(packageSettingAllLabel);
		sleep(1000);
		safeCheckboxClick(packageRestrictionAllLabel);
		safeCheckboxClick(packageRestrictionAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryDistancesAllLabel);
		safeCheckboxClick(deliveryDistancesAllLabel);
		sleep(1000);
		safeCheckboxClick(logisticAllLabel);
		safeCheckboxClick(logisticAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryMarkerAllLabel);
		safeCheckboxClick(deliveryMarkerAllLabel);
		sleep(1000);
		safeCheckboxClick(harbourManifestAllLabel);
		sleep(1000);
		safeCheckboxClick(harbourManifestAddLabel);
		sleep(1000);
		WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", submitBtn);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-150)");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
		}

	}

	// Package
	public void updateDeliveryStatus() {
		sleep(5000);
		WebElement skippedCheckboxElement = wait.until(ExpectedConditions.elementToBeClickable(skippedCheckbox));
		skippedCheckboxElement.click();

	}

	public void verifyUserCanUpdateDeliveryDate() {
		sleep(5000);
		WebElement actionMenuBtn = wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton));
		actionMenuBtn.click();
		WebElement printCustomerSignatureOptionBtn = wait
				.until(ExpectedConditions.elementToBeClickable(setDeliveryDateButton));
		printCustomerSignatureOptionBtn.click();
		String deliveryDateValue = Hooks.prop.getProperty("packageDeliveryDate");
		WebElement packageDeliveryDateElement = driver.findElement(packageDeliveryDateInput);
		packageDeliveryDateElement.sendKeys(deliveryDateValue);
		WebElement printCustomerSignatureBtn = wait
				.until(ExpectedConditions.elementToBeClickable(savePackageDeliveryDateButton));
		printCustomerSignatureBtn.click();
	}

	public void printCustomerSignature() {
		sleep(5000);
		WebElement actionMenuBtn = wait.until(ExpectedConditions.elementToBeClickable(actionMenuButton));
		actionMenuBtn.click();
		WebElement printCustomerSignatureOptionBtn = wait
				.until(ExpectedConditions.elementToBeClickable(printCustomerSignatureOption));
		printCustomerSignatureOptionBtn.click();
		WebElement printCustomerSignatureBtn = wait
				.until(ExpectedConditions.elementToBeClickable(printCustomerSignatureButton));
		printCustomerSignatureBtn.click();
	}

	public void downloadDriverAttestation() {
		sleep(5000);
		WebElement deliveredCheckboxElement = wait.until(ExpectedConditions.elementToBeClickable(deliveredCheckbox));
		deliveredCheckboxElement.click();
		WebElement downloadDriverAttestationBtn = wait
				.until(ExpectedConditions.elementToBeClickable(downloadDriverAttestationOption));
		downloadDriverAttestationBtn.click();
	}

	public void verifyUserCanDownloadSignature() {
		sleep(5000);
		WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(downloadSignatureLink));
		btn.click();
	}

	public void downloadReferenceDocuments() {
		sleep(5000);
		WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(downloadReferenceDocumentsLabel));
		btn.click();
	}

	public void verifyUserCanPrintReturnPackage() {
		sleep(5000);
		WebElement icon = wait.until(ExpectedConditions.elementToBeClickable(printIcon));
		icon.click();
		WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(printBtn));
		btn.click();
	}

	public void verifyUserCanViewPackageDetails() {
		sleep(5000);
		WebElement detailedReportLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(packageViewDetailsIcon));
		detailedReportLabelElement.click();
	}

	public void verifyUserCanDeletePackage() {
		sleep(5000);
		WebElement packageReleaseBtn = wait.until(ExpectedConditions.elementToBeClickable(packageReleaseButton));
		packageReleaseBtn.click();
		WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(deleteConfirmBtn));
		btn.click();
	}

	public void noOtherBasicAndAdditionalPackageAccess() {
		sleep(2000);
		List<WebElement> editOptions = driver.findElements(packageDetailsViewIcon);
		Assert.assertTrue(editOptions.isEmpty(), "Edit option should NOT be present");

	}

	public void openHarbourPackagesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/HarbourLogistic/Home/Packages?category=4"));
	}

	public void createProfileWithAllAccessForPackageHarbourModule() {
		sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		safeCheckboxClick(packageSettingAllLabel);
		safeCheckboxClick(packageSettingAllLabel);
		sleep(1000);
		safeCheckboxClick(packageRestrictionAllLabel);
		safeCheckboxClick(packageRestrictionAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryDistancesAllLabel);
		safeCheckboxClick(deliveryDistancesAllLabel);
		sleep(1000);
		safeCheckboxClick(logisticAllLabel);
		safeCheckboxClick(logisticAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryMarkerAllLabel);
		safeCheckboxClick(deliveryMarkerAllLabel);
		sleep(1000);
		safeCheckboxClick(harbourManifestAllLabel);
		sleep(1000);
		safeCheckboxClick(harbourManifestAddLabel);
		sleep(1000);
		WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", submitBtn);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-150)");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
		}

	}

	public void createViewOnlyAccessProfileForPackageHarbourModule() {
		sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		safeCheckboxClick(packageSettingAllLabel);
		safeCheckboxClick(packageSettingAllLabel);
		sleep(1000);
		safeCheckboxClick(packageRestrictionAllLabel);
		safeCheckboxClick(packageRestrictionAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryDistancesAllLabel);
		safeCheckboxClick(deliveryDistancesAllLabel);
		sleep(1000);
		safeCheckboxClick(logisticAllLabel);
		safeCheckboxClick(logisticAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryMarkerAllLabel);
		safeCheckboxClick(deliveryMarkerAllLabel);
		sleep(1000);
		safeCheckboxClick(harbourManifestAllLabel);
		sleep(1000);
		safeCheckboxClick(harbourManifestAddLabel);
		sleep(1000);
		safeCheckboxClick(harbourPackageAllLabel);
		sleep(1000);
		safeCheckboxClick(harbourPackageViewLabel);
		sleep(1000);
		WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", submitBtn);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-150)");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
		}

	}

	// General Audit
	public void openHarbourAuditView(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/HarbourLogistic/Home/Packages?category=4"));
	}

	public void testNoAccessProfileForHarbourModuleAuditView() {
		sleep(2000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		safeCheckboxClick(packageSettingAllLabel);
		safeCheckboxClick(packageSettingAllLabel);
		sleep(1000);
		safeCheckboxClick(packageRestrictionAllLabel);
		safeCheckboxClick(packageRestrictionAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryDistancesAllLabel);
		safeCheckboxClick(deliveryDistancesAllLabel);
		sleep(1000);
		safeCheckboxClick(logisticAllLabel);
		safeCheckboxClick(logisticAllLabel);
		sleep(1000);
		safeCheckboxClick(deliveryMarkerAllLabel);
		safeCheckboxClick(deliveryMarkerAllLabel);
		sleep(1000);
		safeCheckboxClick(harbourGeneralAllLabel);
		sleep(1000);
		WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", submitBtn);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-150)");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
		} catch (Exception e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
		}

	}

	public void iCreateProfileWithViewAccessToHarbourGeneralAudit() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Profile Page
	public void openSetupProfilesPage(String fullUrl) {
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

	public void safeCheckboxClick(By locator) {
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -150)");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		} catch (ElementClickInterceptedException e) {
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -100)");
			try {
				element.click();
			} catch (Exception ex) {
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			}
		}
	}

}
