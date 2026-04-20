package com.pharmcrm_HarbourModule.steps;
import org.junit.Assert;
import org.junit.Assume;
import com.pharmcrm_HarbourModule.pages.harbourpage;
import hooks.Hooks;
import io.cucumber.java.en.And;

public class harbourstep {

	private harbourpage harbourPage;

	// Manifest
	@And("an appropriate error message should be displayed for Add Store field")
	public void validateAddStoreErrorMessage() throws InterruptedException {
		String result = harbourPage.verifyErrorMessageForAddStore();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("user does not select any value in Add Store")
	public void verifyUserDoesNotSelectStore() throws InterruptedException {
		String harbourUrl = Hooks.prop.getProperty("harbourUrl");
		String manifestPageUrl = Hooks.prop.getProperty("manifestsPageUrl");
		Assert.assertNotNull("profilesPageUrl is missing in config", manifestPageUrl);
		String fullProfilesUrl = harbourUrl + manifestPageUrl;
		harbourPage = new harbourpage(Hooks.driver);
		harbourPage.openManifestPage(fullProfilesUrl);
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/HarbourLogistic/Home/Manifests"));

	}

	@And("Appropriate error messages should be displayed for each missing required field")
	public void validateErrorMessagesForRequiredFields() throws InterruptedException {
		String result = harbourPage.shouldDisplayValidationForEmptyFields();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Leave all required fields empty")
	public void verifyRequiredFieldsAreEmpty() throws InterruptedException {
		String harbourUrl = Hooks.prop.getProperty("harbourUrl");
		String manifestPageUrl = Hooks.prop.getProperty("manifestsPageUrl");
		Assert.assertNotNull("profilesPageUrl is missing in config", manifestPageUrl);
		String fullProfilesUrl = harbourUrl + manifestPageUrl;
		harbourPage = new harbourpage(Hooks.driver);
		harbourPage.openManifestPage(fullProfilesUrl);
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/HarbourLogistic/Home/Manifests"));

	}

	// Delivery Statistic Report
	@And("the user should be able Check mark Detailed Report View Access for Delivery Statistic Report Harbour Modul")
	public void verifyUserCanCheckDetailedReportViewAccessForDeliveryStatisticReportHarbourModule() {
		String harbourUrl = Hooks.prop.getProperty("harbourUrl");
		String deliveryStatisticReportsUrl = Hooks.prop.getProperty("harbourDeliveryStatisticReportsUrl");
		Assert.assertNotNull("harbourDeliveryStatisticReportsUrl is missing in config", deliveryStatisticReportsUrl);
		String fullUrl = harbourUrl + deliveryStatisticReportsUrl;
		harbourPage = new harbourpage(Hooks.driver);
		harbourPage.openHarbourDeliveryStatisticReportsPage(fullUrl);
		Assert.assertTrue("Delivery Statistic Reports page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/HarbourLogistic/Home/DeliveryStatisticReports"));
		harbourPage.validateUserCanCheckDetailedReportViewAccessForDeliveryStatisticReportHarbourModule();

	}

	@And("the user should not able to Export Harbour Modul")
	public void thenUserShouldNotBeAbleToExportHarbourModule() {
		harbourPage.verifyUserCannotExportHarbourModule();

	}

	@And("I create a profile with only Detailed Report View Access for Delivery Statistic Report Harbour Modul")
	public void givenICreateAProfileWithOnlyDetailedReportViewAccessForDeliveryStatisticReportHarbourModule() {
		harbourPage.clickFilterButton();
		harbourPage.enterProfileName();
		harbourPage.clickSearchButton();
		harbourPage.clickActionMenu();
		harbourPage.clickEditButton();
		harbourPage.createProfileWithOnlyDetailedReportViewAccessForDeliveryStatisticReportHarbourModule();
		harbourPage.clickSubmitButton();

	}

	@And("the user should be able Export Access for Delivery Statistic Report Harbour Modul")
	public void thenUserShouldHaveExportAccessForDeliveryStatisticReportHarbourModule() {
		String harbourUrl = Hooks.prop.getProperty("harbourUrl");
		String deliveryStatisticReportsUrl = Hooks.prop.getProperty("harbourDeliveryStatisticReportsUrl");
		Assert.assertNotNull("harbourDeliveryStatisticReportsUrl is missing in config", deliveryStatisticReportsUrl);
		String fullUrl = harbourUrl + deliveryStatisticReportsUrl;
		harbourPage = new harbourpage(Hooks.driver);
		harbourPage.openHarbourDeliveryStatisticReportsPage(fullUrl);
		harbourPage.validateUserCanExportDeliveryStatisticReportHarbourModule();

	}

	@And("the user should not able to Detailed Report View Harbour Modul")
	public void thenUserShouldNotBeAbleToViewDetailedReportForHarbourModule() {
		harbourPage.userShouldNotBeAbleToViewDetailedReportForHarbourModule();

	}

	@And("I create a profile with only Export Access for Delivery Statistic Report Harbour Modul")
	public void givenICreateAProfileWithOnlyExportAccessForDeliveryStatisticReportHarbourModule() {
		harbourPage.clickFilterButton();
		harbourPage.enterProfileName();
		harbourPage.clickSearchButton();
		harbourPage.clickActionMenu();
		harbourPage.clickEditButton();
		harbourPage.createProfileWithOnlyExportAccessForDeliveryStatisticReportHarbourModule();
		harbourPage.clickSubmitButton();

	}

	// Driver Detail Report
	@And("the user should be Not able Export for Driver Detail Report Harbour Modul")
	public void thenUserShouldNotBeAbleToExportDriverDetailReportForHarbourModule() {
		String harbourUrl = Hooks.prop.getProperty("harbourUrl");
		String deliveryReportsUrl = Hooks.prop.getProperty("harbourDeliveryReportsUrl");
		Assert.assertNotNull("harbourDeliveryReportsUrl is missing in config", deliveryReportsUrl);
		String fullDeliveryReportsUrl = harbourUrl + deliveryReportsUrl;
		harbourPage = new harbourpage(Hooks.driver);
		harbourPage.openHarbourDeliveryReportsPage(fullDeliveryReportsUrl);
		Assert.assertTrue("Delivery Reports page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/HarbourLogistic/Home/DeliveryReports"));
		harbourPage.cannotExportDriverDetailReportHarbour();

	}

	@And("I create a profile with No Export Access for Driver Detail Report Harbour Modul")
	public void givenICreateAProfileWithNoExportAccessForDriverDetailReportHarbourModule() {
		harbourPage.clickFilterButton();
		harbourPage.enterProfileName();
		harbourPage.clickSearchButton();
		harbourPage.clickActionMenu();
		harbourPage.clickEditButton();
		harbourPage.createProfileWithNoExportAccessForDriverDetailReportHarbourModule();
		harbourPage.clickSubmitButton();

	}

	@And("the user should be able Export for Driver Detail Report Harbour Modul")
	public void thenUserShouldBeAbleToExportDriverDetailReportForHarbourModule() {
		String harbourUrl = Hooks.prop.getProperty("harbourUrl");
		String deliveryReportsUrl = Hooks.prop.getProperty("harbourDeliveryReportsUrl");
		Assert.assertNotNull("harbourDeliveryReportsUrl is missing in config", deliveryReportsUrl);
		String fullDeliveryReportsUrl = harbourUrl + deliveryReportsUrl;
		harbourPage = new harbourpage(Hooks.driver);
		harbourPage.openHarbourDeliveryReportsPage(fullDeliveryReportsUrl);
		Assert.assertTrue("Delivery Reports page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/HarbourLogistic/Home/DeliveryReports"));
		harbourPage.exportDriverDetailReportHarbour();

	}

	@And("I create a profile with Export Access for Driver Detail Report Harbour Modul")
	public void givenICreateAProfileWithExportAccessForDriverDetailReportHarbourModule() {
		harbourPage.clickFilterButton();
		harbourPage.enterProfileName();
		harbourPage.clickSearchButton();
		harbourPage.clickActionMenu();
		harbourPage.clickEditButton();
		harbourPage.createProfileWithExportAccessForDriverDetailReportHarbourModule();
		harbourPage.clickSubmitButton();

	}

	// Delivery Report
	@And("the user should Not able Export for Delivery Report Harbour Modul")
	public void thenUserShouldNotBeAbleToExportDeliveryReportForHarbourModule() {
		String harbourUrl = Hooks.prop.getProperty("harbourUrl");
		String deliveryReportsUrl = Hooks.prop.getProperty("harbourDeliveryReportsUrl");
		Assert.assertNotNull("harbourDeliveryReportsUrl is missing in config", deliveryReportsUrl);
		String fullDeliveryReportsUrl = harbourUrl + deliveryReportsUrl;
		harbourPage = new harbourpage(Hooks.driver);
		harbourPage.openHarbourDeliveryReportsPage(fullDeliveryReportsUrl);
		Assert.assertTrue("Delivery Reports page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/HarbourLogistic/Home/DeliveryReports"));
		harbourPage.cannotExportDeliveryReportHarbour();

	}

	@And("I create a profile with No Export Access for Delivery Report Harbour Modul")
	public void givenICreateAProfileWithNoExportAccessForDeliveryReportHarbourModule() {
		harbourPage.clickFilterButton();
		harbourPage.enterProfileName();
		harbourPage.clickSearchButton();
		harbourPage.clickActionMenu();
		harbourPage.clickEditButton();
		harbourPage.createProfileWithNoExportAccessForDeliveryReportHarbourModule();
		harbourPage.clickSubmitButton();

	}

	@And("the user should be able Export for Delivery Report Harbour Modul")
	public void thenUserShouldBeAbleToExportDeliveryReportForHarbourModule() {
		String harbourUrl = Hooks.prop.getProperty("harbourUrl");
		String deliveryReportsUrl = Hooks.prop.getProperty("harbourDeliveryReportsUrl");
		Assert.assertNotNull("harbourDeliveryReportsUrl is missing in config", deliveryReportsUrl);
		String fullDeliveryReportsUrl = harbourUrl + deliveryReportsUrl;
		harbourPage = new harbourpage(Hooks.driver);
		harbourPage.openHarbourDeliveryReportsPage(fullDeliveryReportsUrl);
		Assert.assertTrue("Delivery Reports page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/HarbourLogistic/Home/DeliveryReports"));
		harbourPage.exportDeliveryReportHarbour();

	}

	@And("I create a profile with Export Access for Delivery Report Harbour Modul")
	public void givenICreateAProfileWithExportAccessForDeliveryReportHarbourModule() {
		harbourPage.clickFilterButton();
		harbourPage.enterProfileName();
		harbourPage.clickSearchButton();
		harbourPage.clickActionMenu();
		harbourPage.clickEditButton();
		harbourPage.createProfileWithExportAccessForDeliveryReportHarbourModule();
		harbourPage.clickSubmitButton();

	}

	// Customer Attestation
	@And("the user should not able to Print for Customer Attestation")
	public void thenUserShouldNotBeAbleToPrintCustomerAttestation() {
		harbourPage.cannotPrintCustomerAttestation();

	}

	@And("the user should be able Send for Signature Customer Attestation")
	public void thenUserShouldBeAbleToSendCustomerAttestationForSignature() {
		String harbourUrl = Hooks.prop.getProperty("harbourUrl");
		String packagesUrl = Hooks.prop.getProperty("harbourPackagesViewUrl");
		Assert.assertNotNull("harbourPackagesViewUrl is missing in config", packagesUrl);
		String fullPackagesUrl = harbourUrl + packagesUrl;
		harbourPage = new harbourpage(Hooks.driver);
		harbourPage.openHarbourPackagesPage(fullPackagesUrl);
		Assert.assertTrue("Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/HarbourLogistic/Home/Packages?category=4"));
		harbourPage.sendCustomerAttestationForSignature();

	}

	@And("I create a profile with Send for Signature Access for Customer Attestation Harbour Modul")
	public void givenICreateAProfileWithSendForSignatureAccessForCustomerAttestationHarbourModule() {
		harbourPage.clickFilterButton();
		harbourPage.enterProfileName();
		harbourPage.clickSearchButton();
		harbourPage.clickActionMenu();
		harbourPage.clickEditButton();
		harbourPage.createProfileWithSendForSignatureAccessForCustomerAttestationHarbourModule();
		harbourPage.clickSubmitButton();

	}

	@And("the user should not able Send for Signature Customer Attestation")
	public void thenUserShouldNotBeAbleToSendCustomerAttestationForSignature() {
		harbourPage.cannotSendCustomerAttestationForSignature();

	}

	@And("the user should be able to Print Customer Attestation")
	public void thenUserShouldBeAbleToPrintCustomerAttestation() {
		String harbourUrl = Hooks.prop.getProperty("harbourUrl");
		String packagesUrl = Hooks.prop.getProperty("harbourPackagesViewUrl");
		Assert.assertNotNull("harbourPackagesViewUrl is missing in config", packagesUrl);
		String fullPackagesUrl = harbourUrl + packagesUrl;
		harbourPage = new harbourpage(Hooks.driver);
		harbourPage.openHarbourPackagesPage(fullPackagesUrl);
		Assert.assertTrue("Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/HarbourLogistic/Home/Packages?category=4"));
		harbourPage.printCustomerAttestation();

	}

	@And("I create a profile with Print Access for Customer Attestation Harbour Module")
	public void givenICreateAProfileWithPrintAccessForCustomerAttestationHarbourModule() {
		harbourPage.clickFilterButton();
		harbourPage.enterProfileName();
		harbourPage.clickSearchButton();
		harbourPage.clickActionMenu();
		harbourPage.clickEditButton();
		harbourPage.createProfileWithAllAccessForManifestHarbourModule();
		harbourPage.clickSubmitButton();

	}

	// Manifest
	@And("the user should be able to Manifest Print")
	public void thenUserShouldBeAbleToPrintManifest() {
		harbourPage.verifyUserCanPrintManifest();

	}

	@And("the user should be able to Delete Manifest Package")
	public void thenUserShouldBeAbleToDeleteManifestPackage() {
		harbourPage.verifyUserCanDeleteManifestPackage();

	}

	@And("the user should be able to Skip Manifest Package")
	public void thenUserShouldBeAbleToSkipManifestPackage() {
		harbourPage.skipManifestPackage();

	}

	@And("the user should be able to View Detail")
	public void thenUserShouldBeAbleToViewDetail() {
		harbourPage.verifyUserCanViewDetail();

	}

	@And("the user should be able to Delete manifest")
	public void thenUserShouldBeAbleToDeleteManifest() {
		harbourPage.viewAndDeleteManifest();

	}

	@And("the user should be able to Edit manifest")
	public void thenUserShouldBeAbleToEditManifest() {
		harbourPage.viewAndEditManifest();

	}

	@And("the user should be able to Add manifest")
	public void thenUserShouldBeAbleToAddManifest() {
		harbourPage.viewAndAddManifest();

	}

	@And("the user should be able to View manifest")
	public void thenUserShouldBeAbleToViewManifest() {
		String harbourUrl = Hooks.prop.getProperty("harbourUrl");
		String manifestPageUrl = Hooks.prop.getProperty("manifestsPageUrl");
		Assert.assertNotNull("profilesPageUrl is missing in config", manifestPageUrl);
		String fullProfilesUrl = harbourUrl + manifestPageUrl;
		harbourPage = new harbourpage(Hooks.driver);
		harbourPage.openManifestPage(fullProfilesUrl);
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/HarbourLogistic/Home/Manifests"));

	}

	@And("I create a profile with All Access for Manifest Harbour Module")
	public void givenICreateAProfileWithAllAccessForManifestHarbourModule() {
		harbourPage.clickFilterButton();
		harbourPage.enterProfileName();
		harbourPage.clickSearchButton();
		harbourPage.clickActionMenu();
		harbourPage.clickEditButton();
		harbourPage.createProfileWithAllAccessForManifestHarbourModule();
		harbourPage.clickSubmitButton();

	}

	@And("the user should not have Add Edit and Additional Access")
	public void thenUserShouldNotHaveAddEditAndAdditionalAccess() {
		harbourPage.noAddEditAdditionalAccess();

	}

	@And("the user should be able to View and Delete manifest")
	public void thenUserShouldBeAbleToViewAndDeleteManifest() {
		String harbourUrl = Hooks.prop.getProperty("harbourUrl");
		String manifestPageUrl = Hooks.prop.getProperty("manifestsPageUrl");
		Assert.assertNotNull("profilesPageUrl is missing in config", manifestPageUrl);
		String fullProfilesUrl = harbourUrl + manifestPageUrl;
		harbourPage = new harbourpage(Hooks.driver);
		harbourPage.openManifestPage(fullProfilesUrl);
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/HarbourLogistic/Home/Manifests"));
		harbourPage.viewAndDeleteManifest();

	}

	@And("I create a profile with view and Delete access for Manifest Harbour Module")
	public void givenICreateAProfileWithViewAndDeleteAccessForManifestHarbourModule() {
		harbourPage.clickFilterButton();
		harbourPage.enterProfileName();
		harbourPage.clickSearchButton();
		harbourPage.clickActionMenu();
		harbourPage.clickEditButton();
		harbourPage.createProfileWithViewAndDeleteAccessForManifestHarbourModule();
		harbourPage.clickSubmitButton();

	}

	@And("the user should not have Add Delete and Additional Access")
	public void thenUserShouldNotHaveAddDeleteAndAdditionalAccess() {
		harbourPage.noAddDeleteAdditionalAccess();

	}

	@And("the user should be able to View and Edit manifest")
	public void thenUserShouldBeAbleToViewAndEditManifest() {
		String harbourUrl = Hooks.prop.getProperty("harbourUrl");
		String manifestPageUrl = Hooks.prop.getProperty("manifestsPageUrl");
		Assert.assertNotNull("profilesPageUrl is missing in config", manifestPageUrl);
		String fullProfilesUrl = harbourUrl + manifestPageUrl;
		harbourPage = new harbourpage(Hooks.driver);
		harbourPage.openManifestPage(fullProfilesUrl);
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/HarbourLogistic/Home/Manifests"));
		harbourPage.viewAndEditManifest();

	}

	@And("I create a profile with view and Edit access for Manifest Harbour Module")
	public void givenICreateAProfileWithViewAndEditAccessForManifestHarbourModule() {
		harbourPage.clickFilterButton();
		harbourPage.enterProfileName();
		harbourPage.clickSearchButton();
		harbourPage.clickActionMenu();
		harbourPage.clickEditButton();
		harbourPage.givenICreateAProfileWithViewAndEditAccessForManifestHarbourModule();
		harbourPage.clickSubmitButton();

	}

	@And("the user should not have Edit Delete and Additional Access")
	public void thenUserShouldNotHaveEditDeleteAndAdditionalAccess() {
		harbourPage.noEditDeleteAdditionalAccess();

	}

	@And("the user should be able to View and Add manifest")
	public void thenUserShouldBeAbleToViewAndAddManifest() {
		String harbourUrl = Hooks.prop.getProperty("harbourUrl");
		String manifestPageUrl = Hooks.prop.getProperty("manifestsPageUrl");
		Assert.assertNotNull("profilesPageUrl is missing in config", manifestPageUrl);
		String fullProfilesUrl = harbourUrl + manifestPageUrl;
		harbourPage = new harbourpage(Hooks.driver);
		harbourPage.openManifestPage(fullProfilesUrl);
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/HarbourLogistic/Home/Manifests"));
		harbourPage.viewAndAddManifest();

	}

	@And("I create a profile with view and Add access for Manifest Harbour Module")
	public void givenICreateAProfileWithViewAndAddAccessForManifestHarbourModule() {
		harbourPage.clickFilterButton();
		harbourPage.enterProfileName();
		harbourPage.clickSearchButton();
		harbourPage.clickActionMenu();
		harbourPage.clickEditButton();
		harbourPage.createProfileWithViewAndAddAccessForManifestHarbourModule();
		harbourPage.clickSubmitButton();

	}

	// Package
	@And("the user should be able to Update Delivery Status")
	public void thenUserShouldBeAbleToUpdateDeliveryStatus() {
		harbourPage.updateDeliveryStatus();

	}

	@And("the user should be able to Update Delivery Date")
	public void thenUserShouldBeAbleToUpdateDeliveryDate() {
		harbourPage.verifyUserCanUpdateDeliveryDate();

	}

	@And("the user should be able to Print Customer Signature")
	public void thenUserShouldBeAbleToPrintCustomerSignature() {
		harbourPage.printCustomerSignature();

	}

	@And("the user should be able to Download Driver Attestation")
	public void thenUserShouldBeAbleToDownloadDriverAttestation() {
		harbourPage.downloadDriverAttestation();

	}

	@And("the user should be able to Download Signature")
	public void thenUserShouldBeAbleToDownloadSignature() {
		harbourPage.downloadReferenceDocuments();

	}

	@And("the user should be able to Download Reference Documents")
	public void thenUserShouldBeAbleToDownloadReferenceDocuments() {
		harbourPage.verifyUserCanViewPackageDetails();
		harbourPage.downloadReferenceDocuments();

	}

	@And("the user should be able to Return Package Print")
	public void thenUserShouldBeAbleToReturnPackagePrint() {
		harbourPage.verifyUserCanPrintReturnPackage();

	}

	@And("the user should be able to View Package Details")
	public void thenUserShouldBeAbleToViewPackageDetails() {
		harbourPage.verifyUserCanViewPackageDetails();

	}

	@And("the user should be able to Delete Package")
	public void thenUserShouldBeAbleToDeletePackage() {
		harbourPage.verifyUserCanDeletePackage();

	}

	@And("the user should be able to View Package")
	public void thenUserShouldBeAbleToViewPackage() {
		String harbourUrl = Hooks.prop.getProperty("harbourUrl");
		String packagesUrl = Hooks.prop.getProperty("harbourPackagesViewUrl");
		Assert.assertNotNull("harbourPackagesViewUrl is missing in config", packagesUrl);
		String fullPackagesUrl = harbourUrl + packagesUrl;
		harbourPage = new harbourpage(Hooks.driver);
		harbourPage.openHarbourPackagesPage(fullPackagesUrl);
		Assert.assertTrue("Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/HarbourLogistic/Home/Packages?category=4"));

	}

	@And("I create a profile with All access for Package Harbour Module")
	public void givenICreateAProfileWithAllAccessForPackageHarbourModule() {
		harbourPage.clickFilterButton();
		harbourPage.enterProfileName();
		harbourPage.clickSearchButton();
		harbourPage.clickActionMenu();
		harbourPage.clickEditButton();
		harbourPage.createProfileWithAllAccessForPackageHarbourModule();
		harbourPage.clickSubmitButton();

	}

	@And("the user should not have other Basic and Additional Access for package")
	public void thenUserShouldNotHaveBasicAndAdditionalAccessForPackage() {
		harbourPage.noOtherBasicAndAdditionalPackageAccess();

	}

	@And("the user should be able to View only access for Package")
	public void thenUserShouldHaveViewOnlyAccessForPackage() {
		String harbourUrl = Hooks.prop.getProperty("harbourUrl");
		String packagesUrl = Hooks.prop.getProperty("harbourPackagesViewUrl");
		Assert.assertNotNull("harbourPackagesViewUrl is missing in config", packagesUrl);
		String fullPackagesUrl = harbourUrl + packagesUrl;
		harbourPage = new harbourpage(Hooks.driver);
		harbourPage.openHarbourPackagesPage(fullPackagesUrl);
		Assert.assertTrue("Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/HarbourLogistic/Home/Packages?category=4"));
	}

	@And("I create a profile with View only access for Package Harbour Module")
	public void givenICreateAProfileWithViewOnlyAccessForPackageHarbourModule() {
		harbourPage.clickFilterButton();
		harbourPage.enterProfileName();
		harbourPage.clickSearchButton();
		harbourPage.clickActionMenu();
		harbourPage.clickEditButton();
		harbourPage.createViewOnlyAccessProfileForPackageHarbourModule();
		harbourPage.clickSubmitButton();

	}

	// General Audit
	@And("the user should Not able to view Harbour Audit View settings in Setup Module test")
	public void thenUserShouldNotBeAbleToViewHarbourAuditViewSettingsInSetupModule() {
		String harbourUrl = Hooks.prop.getProperty("harbourUrl");
		String auditViewUrl = Hooks.prop.getProperty("harbourAuditViewSettingsUrl");
		Assert.assertNotNull("harbourAuditViewSettingsUrl is missing in config", auditViewUrl);
		String fullAuditViewUrl = harbourUrl + auditViewUrl;
		harbourPage = new harbourpage(Hooks.driver);
		harbourPage.openHarbourAuditView(fullAuditViewUrl);
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/HarbourLogistic/Home/Packages?category=4"));
	}

	@And("I create a profile with No access for Harbour Module General Audit View test")
	public void createProfileWithNoAccessForHarbourModuleGeneralAuditViewTest() {
		harbourPage.clickFilterButton();
		harbourPage.enterProfileName();
		harbourPage.clickSearchButton();
		harbourPage.clickActionMenu();
		harbourPage.clickEditButton();
		harbourPage.testNoAccessProfileForHarbourModuleAuditView();
		harbourPage.clickSubmitButton();

	}

	@And("I create a profile with View access only to Harbour Module General Audit View test")
	public void createProfileWithViewAccessToHarbourModuleGeneralAudit() {
		harbourPage.clickFilterButton();
		harbourPage.enterProfileName();
		harbourPage.clickSearchButton();
		harbourPage.clickActionMenu();
		harbourPage.clickEditButton();
		harbourPage.iCreateProfileWithViewAccessToHarbourGeneralAudit();
		harbourPage.clickSubmitButton();

	}

	// Profile
	@And("the Harbour user should be able to view Profiles test")
	public void harbourUserShouldBeAbleToViewProfiles() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String setupProfilesUrl = Hooks.prop.getProperty("profilesPageUrl");
		Assert.assertNotNull("profilesPageUrl is missing in config", setupProfilesUrl);
		String fullProfilesUrl = baseUrl + setupProfilesUrl;
		harbourPage = new harbourpage(Hooks.driver);
		harbourPage.openSetupProfilesPage(fullProfilesUrl);
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Profiles"));

	}

	@And("the user should be able to view Harbour Audit View settings in Setup Module test")
	public void userShouldBeAbleToViewHarbourAuditViewSettingsInSetupModule() {
		String harbourUrl = Hooks.prop.getProperty("harbourUrl");
		String auditViewUrl = Hooks.prop.getProperty("harbourAuditViewSettingsUrl");
		Assert.assertNotNull("harbourAuditViewSettingsUrl is missing in config", auditViewUrl);
		String fullAuditViewUrl = harbourUrl + auditViewUrl;
		harbourPage = new harbourpage(Hooks.driver);
		harbourPage.openHarbourAuditView(fullAuditViewUrl);
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/HarbourLogistic/Home/Packages?category=4"));

	}

}
