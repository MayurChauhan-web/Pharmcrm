package com.pharmcrm_ProviderModule.pages;

import java.time.Duration;
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

public class providerpage {
	private WebDriver driver;
	private WebDriverWait wait;

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
		waitAndSendKeys(providerCommunicationDescriptionField, "Communication");
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
		waitAndSendKeys(providerCommunicationDescriptionField, "Communication");
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
		waitAndSendKeys(providerFrontDeskNameField, "Emily Johnson");
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
		waitAndSendKeys(providerStreetField, "123 Main St");
		waitAndSendKeys(providerCityField, "Newark");
		waitAndSendKeys(providerStateField, "NJ");
		waitAndSendKeys(providerZipCodeField, "07102");
		waitAndSendKeys(providerContactNumberField, "9735551234");
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
		waitAndSendKeys(providerCellPhoneField, "5454545454");
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
		waitAndSendKeys(providerLastNameField, "Varner");
		waitAndSendKeys(providerFirstNameField, "Carol");
		waitAndSendKeys(providerZoneField, "200");
		waitAndSendKeys(providerNpiNumberField, "1457382912");
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
		waitAndSendKeys(vCardPhoneNumberField, "5478686879");
		waitAndSendKeys(vCardBodyField, "Vcard");
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
		waitAndSendKeys(providerNameFilter, "Apolo Pharmacy");
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
		waitAndSendKeys(newPhoneNumberField, "(457) 547-5677");
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
		wait.until(ExpectedConditions.urlContains("/Prescriber/Home/Providers"));
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

}
