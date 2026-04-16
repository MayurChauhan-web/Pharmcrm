package com.pharmcrm_HarbourModule.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import hooks.Hooks;

public class harbourpage {
	private WebDriver driver;
	private WebDriverWait wait;

	// Delivery Statistic Report
	public void openHarbourDeliveryStatisticReportsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/HarbourLogistic/Home/DeliveryStatisticReports"));
	}

	public void createProfileWithOnlyDetailedReportViewAccessForDeliveryStatisticReportHarbourModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement harbourDeliveryStatisticReportAllLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(harbourDeliveryStatisticReportAllLabel));
		harbourDeliveryStatisticReportAllLabelElement.click();

		sleep(2000);

		WebElement harbourDeliveryStatisticReportExportLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(harbourDetailedReportViewLabel));
		harbourDeliveryStatisticReportExportLabelElement.click();

		sleep(2000);

	}

	public void createProfileWithOnlyExportAccessForDeliveryStatisticReportHarbourModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

		WebElement harbourDeliveryStatisticReportAllLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(harbourDeliveryStatisticReportAllLabel));
		harbourDeliveryStatisticReportAllLabelElement.click();

		sleep(2000);

		WebElement harbourDeliveryStatisticReportExportLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(harbourDeliveryStatisticReportExportLabel));
		harbourDeliveryStatisticReportExportLabelElement.click();

		sleep(2000);

	}

	// Driver Detail Report

	public void createProfileWithNoExportAccessForDriverDetailReportHarbourModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement harbourManifestSummaryReportExportLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(harbourManifestSummaryReportExportLabel));
		harbourManifestSummaryReportExportLabelElement.click();
		sleep(2000);

	}

	public void createProfileWithExportAccessForDriverDetailReportHarbourModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Delivery Report
	public void openHarbourDeliveryReportsPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/HarbourLogistic/Home/DeliveryReports"));
	}

	public void createProfileWithNoExportAccessForDeliveryReportHarbourModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement harbourDeliveryReportExportLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(harbourDeliveryReportExportLabel));
		harbourDeliveryReportExportLabelElement.click();
		sleep(2000);

	}

	public void createProfileWithExportAccessForDeliveryReportHarbourModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	// Customer Attestation
	public void createProfileWithSendForSignatureAccessForCustomerAttestationHarbourModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

		WebElement harbourCustomerAttestationAllLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(harbourCustomerAttestationAllLabel));
		harbourCustomerAttestationAllLabelElement.click();

		sleep(2000);

		WebElement harbourCustomerAttestationPrintSendForSignatureLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(harbourCustomerAttestationPrintSendForSignatureLabel));
		harbourCustomerAttestationPrintSendForSignatureLabelElement.click();

	}

	public void createProfileWithAllAccessForManifestHarbourModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

		WebElement harbourCustomerAttestationAllLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(harbourCustomerAttestationAllLabel));
		harbourCustomerAttestationAllLabelElement.click();
		sleep(2000);
		WebElement harbourCustomerAttestationPrintLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(harbourCustomerAttestationPrintLabel));
		harbourCustomerAttestationPrintLabelElement.click();
	}

	// Manifest

	public void openManifestPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/HarbourLogistic/Home/Manifests"));
	}

	public void createProfileWithViewAndDeleteAccessForManifestHarbourModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

		WebElement harbourManifestAllLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(harbourManifestAllLabel));
		harbourManifestAllLabelElement.click();

		sleep(2000);

		WebElement harbourManifestEditLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(harbourManifestDeleteLabel));
		harbourManifestEditLabelElement.click();

		sleep(2000);

	}

	public void givenICreateAProfileWithViewAndEditAccessForManifestHarbourModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

		WebElement harbourManifestAllLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(harbourManifestAllLabel));
		harbourManifestAllLabelElement.click();

		sleep(2000);

		WebElement harbourManifestEditLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(harbourManifestEditLabel));
		harbourManifestEditLabelElement.click();

		sleep(2000);

	}

	public void createProfileWithViewAndAddAccessForManifestHarbourModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement harbourManifestAllLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(harbourManifestAllLabel));
		harbourManifestAllLabelElement.click();

		sleep(2000);

		WebElement harbourManifestAddLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(harbourManifestAddLabel));
		harbourManifestAddLabelElement.click();

		sleep(2000);

	}

	// Package
	public void openHarbourPackagesPage(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/HarbourLogistic/Home/Packages?category=4"));
	}

	public void createProfileWithAllAccessForPackageHarbourModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createViewOnlyAccessProfileForPackageHarbourModule() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement harbourPackageAllLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(harbourPackageAllLabel));
		harbourPackageAllLabelElement.click();
		sleep(2000);
		WebElement harbourPackageViewLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(harbourPackageViewLabel));
		harbourPackageViewLabelElement.click();

	}

	// Delivery Statistic Report
	public By harbourDetailedReportViewLabel = By.xpath("//label[@for='chkg50HarbourDetailedReportView']");
	public By harbourDeliveryStatisticReportAllLabel = By
			.xpath("//label[@for='chkg47HarbourDeliveryStatisticReportAll']");

	public By harbourDeliveryStatisticReportExportLabel = By
			.xpath("//label[@for='chkg47HarbourDeliveryStatisticReportExport']");

	// Driver Detail Report
	public By harbourManifestSummaryReportExportLabel = By
			.xpath("//label[@for='chkg47HarbourManifestSummaryReportExport']");

	// Delivery Report
	public By harbourDeliveryReportExportLabel = By.xpath("//label[@for='chkg47HarbourDeliveryReportExport']");

	// Customer Attestation
	public By harbourCustomerAttestationPrintLabel = By.xpath("//label[@for='chkg46HarbourCustomerAttestationPrint']");
	public By harbourCustomerAttestationPrintSendForSignatureLabel = By
			.xpath("//label[@for='chkg46HarbourCustomerAttestationPrintSendforSignature']");
	public By harbourCustomerAttestationAllLabel = By.xpath("//label[@for='chkg46HarbourCustomerAttestationAll']");

	// Manifest
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

	public harbourpage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// General Audit
	public By harbourGeneralAllLabel = By.xpath("//label[@for='chkg46HarbourGeneralAll']");

	// General Audit

	public void openHarbourAuditView(String fullUrl) {
		sleep(2000);
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/HarbourLogistic/Home/Packages?category=4"));
	}

	public void testNoAccessProfileForHarbourModuleAuditView() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement harbourGeneralAllLabelElement = wait
				.until(ExpectedConditions.elementToBeClickable(harbourGeneralAllLabel));
		harbourGeneralAllLabelElement.click();

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

}
