package com.pharmcrm_DeliveryModule.steps;

import org.junit.Assert;
import com.pharmcrm_DeliveryModule.pages.deliverypage;
import hooks.Hooks;
import io.cucumber.java.en.And;

public class deliverystep {

	private deliverypage deliveryPage;

	// Package
	@And("Validation Should have to show for Add Manifest Blank form Submission")
	public void validateBlankManifestSubmission() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliveryManifestUrl = Hooks.prop.getProperty("deliveryManifestUrl");
		Assert.assertNotNull("deliveryManifestUrl is missing in config", deliveryManifestUrl);
		String fullDeliveryManifestUrl = baseUrl + deliveryManifestUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openDeliveryManifestPage(fullDeliveryManifestUrl);
		Assert.assertTrue("Delivery Manifest page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Manifests"));
		deliveryPage.addManifestBlankFormValidation();
		System.out.println("Error validation triggered: Add Manifest form cannot be submitted blank");
		Hooks.scenario.log("Error validation triggered: Add Manifest form cannot be submitted blank");

	}

	@And("Validation Should have to show for Save Package status Blank form Submission")
	public void validateBlankDeliveredPackageStatusSubmission() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliveredPackagesPath = Hooks.prop.getProperty("deliveredPackagesPath");
		Assert.assertNotNull("Delivered Packages page path is missing in config", deliveredPackagesPath);
		String fullDeliveredPackagesUrl = baseUrl + deliveredPackagesPath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.deliveredPackages(fullDeliveredPackagesUrl);
		Assert.assertTrue("Delivered Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Packages?category=3"));
		deliveryPage.savePackageStatusBlankFormValidation();
		System.out.println("Error validation triggered: Save Package status form cannot be submitted blank");
		Hooks.scenario.log("Error validation triggered: Save Package status form cannot be submitted blank");

	}

	@And("Validation Should have to show for invalid Telephone")
	public void validateInvalidTelephoneNumber() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String packagesPagePath = Hooks.prop.getProperty("packagesPagePath");
		Assert.assertNotNull("Packages page path is missing in config", packagesPagePath);
		String fullPackagesPageUrl = baseUrl + packagesPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.packagesPagePath(fullPackagesPageUrl);
		Assert.assertTrue("Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Packages?category=1"));
		deliveryPage.telephoneInvalidValidation();
		System.out.println("Error validation triggered: Telephone number format is invalid");
		Hooks.scenario.log("Error validation triggered: Telephone number format is invalid");

	}

	@And("Validation Should have to show for Add Customer Attestation Blank Submission")
	public void validateBlankCustomerAttestationSubmission() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String packagesPagePath = Hooks.prop.getProperty("packagesPagePath");
		Assert.assertNotNull("Packages page path is missing in config", packagesPagePath);
		String fullPackagesPageUrl = baseUrl + packagesPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.packagesPagePath(fullPackagesPageUrl);
		Assert.assertTrue("Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Packages?category=1"));
		deliveryPage.addCustomerAttestationBlankValidation();
		System.out.println("Error validation triggered: Customer Attestation form cannot be submitted blank");
		Hooks.scenario.log("Error validation triggered: Customer Attestation form cannot be submitted blank");

	}

	@And("Validation Should have to show for Invalid Email , Zipcode ,Contact Number")
	public void validateInvalidEmailZipContactNumber() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String packagesPagePath = Hooks.prop.getProperty("packagesPagePath");
		Assert.assertNotNull("Packages page path is missing in config", packagesPagePath);
		String fullPackagesPageUrl = baseUrl + packagesPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.packagesPagePath(fullPackagesPageUrl);
		Assert.assertTrue("Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Packages?category=1"));
		deliveryPage.invalidEmailZipContactValidation();
		System.out.println("Error validation triggered: Email format, Zipcode, or Contact Number is invalid");
		Hooks.scenario.log("Error validation triggered: Email format, Zipcode, or Contact Number is invalid");

	}

	@And("Validation Should have to show for Add Package on Blank form Submission")
	public void validateBlankPackageSubmission() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String packagesPagePath = Hooks.prop.getProperty("packagesPagePath");
		Assert.assertNotNull("Packages page path is missing in config", packagesPagePath);
		String fullPackagesPageUrl = baseUrl + packagesPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.packagesPagePath(fullPackagesPageUrl);
		Assert.assertTrue("Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Packages?category=1"));
		deliveryPage.addPackageBlankFormValidation();
		System.out.println("Error validation triggered: Add Package form cannot be submitted blank");
		Hooks.scenario.log("Error validation triggered: Add Package form cannot be submitted blank");

	}

	// Delivery Statistic Report
	@And("I create a profile with View-only access to Delivery Module Delivery Statistic Report test")
	public void createProfileWithViewOnlyDeliveryStatisticReportTest() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.deliveryStatisticReportViewOnlyTest();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile created with View-only access to Delivery Module Delivery Statistic Report test");
		Hooks.scenario.log("Profile created with View-only access to Delivery Module Delivery Statistic Report test");

	}

	@And("I create a profile with View and Export access to Delivery Module Delivery Statistic Report test")
	public void createProfileWithViewAndExportDeliveryStatisticReportTest() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.deliveryStatisticReportViewExportTest();
		deliveryPage.clickSubmitButton();
		System.out.println(
				"Profile created with View and Export access to Delivery Module Delivery Statistic Report test");
		Hooks.scenario
				.log("Profile created with View and Export access to Delivery Module Delivery Statistic Report test");

	}

	@And("the user should be able to export Delivery Statistic Report in Delivery Module test")
	public void verifyUserCanExportDeliveryStatisticReport() {
		deliveryPage.verifyUserCanExportDeliveryStatisticReport();
		System.out.println("User should be able to export Delivery Statistic Report in Delivery Module test");
		Hooks.scenario.log("User should be able to export Delivery Statistic Report in Delivery Module test");

	}

	@And("the user should be able to view Delivery Statistic Report in Delivery Module test")
	public void verifyUserCanViewDeliveryStatisticReport() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliveryStatisticReportPagePath = Hooks.prop.getProperty("deliveryStatisticReportPagePath");
		Assert.assertNotNull("Delivery Statistic Report page path is missing in config",
				deliveryStatisticReportPagePath);
		String fullDeliveryStatisticReportPageUrl = baseUrl + deliveryStatisticReportPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openDeliveryStatisticReportPage(fullDeliveryStatisticReportPageUrl);
		Assert.assertTrue("Delivery Statistic Report page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/DeliveryStatisticReports"));
		System.out.println("User should be able to view Delivery Statistic Report in Delivery Module test");
		Hooks.scenario.log("User should be able to view Delivery Statistic Report in Delivery Module test");

	}

	@And("the user should not be able to export Delivery Statistic Report in Delivery Module test")
	public void verifyUserCannotExportDeliveryStatisticReport() {
		deliveryPage.verifyUserCannotExportDeliveryStatisticReport();
		System.out.println("User should not be able to export Delivery Statistic Report in Delivery Module test");
		Hooks.scenario.log("User should not be able to export Delivery Statistic Report in Delivery Module test");

	}

	// Manifest Summary Report
	@And("I create a profile with View-only access to Delivery Module Manifest Summary Report test")
	public void createProfileWithViewOnlyManifestSummaryReportTest() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.manifestSummaryReportViewOnlyTest();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile created with View-only access to Delivery Module Manifest Summary Report test");
		Hooks.scenario.log("Profile created with View-only access to Delivery Module Manifest Summary Report test");

	}

	@And("I create a profile with View and Export access to Delivery Module Manifest Summary Report test")
	public void createProfileWithViewAndExportManifestSummaryReportTest() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.manifestSummaryReportViewExportTest();
		deliveryPage.clickSubmitButton();
		System.out
				.println("Profile created with View and Export access to Delivery Module Manifest Summary Report test");
		Hooks.scenario
				.log("Profile created with View and Export access to Delivery Module Manifest Summary Report test");

	}

	@And("the user should be able to view Manifest Summary Report in Delivery Module test")
	public void verifyUserCanViewManifestSummaryReport() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String manifestSummaryReportPagePath = Hooks.prop.getProperty("manifestSummaryReportPagePath");
		Assert.assertNotNull("Manifest Summary Report page path is missing in config", manifestSummaryReportPagePath);
		String fullManifestSummaryReportPageUrl = baseUrl + manifestSummaryReportPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openManifestSummaryReportPage(fullManifestSummaryReportPageUrl);
		Assert.assertTrue("Manifest Summary Report page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/ManifestSummaryReports"));
		System.out.println("User should be able to view Manifest Summary Report in Delivery Module test");
		Hooks.scenario.log("User should be able to view Manifest Summary Report in Delivery Module test");

	}

	@And("the user should not be able to export Manifest Summary Report in Delivery Module test")
	public void verifyUserCannotExportManifestSummaryReport() {
		deliveryPage.verifyUserCannotExportManifestSummaryReport();
		System.out.println("User should not be able to export Manifest Summary Report in Delivery Module test");
		Hooks.scenario.log("User should not be able to export Manifest Summary Report in Delivery Module test");

	}

	@And("the user should be able to export Manifest Summary Report in Delivery Module test")
	public void verifyUserCanExportManifestSummaryReport() {
		deliveryPage.exportManifestSummaryReportTest();
		System.out.println("User should be able to export Manifest Summary Report in Delivery Module test");
		Hooks.scenario.log("User should be able to export Manifest Summary Report in Delivery Module test");

	}

	// Delivery Report
	@And("I create a profile with View-only access to Delivery Module Delivery Report test")
	public void createProfileWithViewOnlyDeliveryReportTest() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.viewOnlyDeliveryReportProfileTest();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile created with View-only access to Delivery Module Delivery Report test");
		Hooks.scenario.log("Profile created with View-only access to Delivery Module Delivery Report test");

	}

	@And("I create a profile with View and Export access to Delivery Module Delivery Report test")
	public void createProfileWithViewAndExportDeliveryReportTest() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.deliveryReportViewExportTest();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile created with View and Export access to Delivery Module Delivery Report test");
		Hooks.scenario.log("Profile created with View and Export access to Delivery Module Delivery Report test");

	}

	@And("the user should be able to view Delivery Report in Delivery Module test")
	public void verifyUserCanViewDeliveryReport() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliveryReportPagePath = Hooks.prop.getProperty("deliveryReportPagePath");
		Assert.assertNotNull("Delivery Report page path is missing in config", deliveryReportPagePath);
		String fullDeliveryReportPageUrl = baseUrl + deliveryReportPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openDeliveryReportPage(fullDeliveryReportPageUrl);
		Assert.assertTrue("Delivery Report page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/DeliveryReports"));
		System.out.println("User should be able to view Delivery Report in Delivery Module test");
		Hooks.scenario.log("User should be able to view Delivery Report in Delivery Module test");

	}

	@And("the user should not be able to export Delivery Report in Delivery Module test")
	public void verifyUserCannotExportDeliveryReport() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliveryReportPagePath = Hooks.prop.getProperty("deliveryReportPagePath");
		Assert.assertNotNull("Delivery Report page path is missing in config", deliveryReportPagePath);
		String fullDeliveryReportPageUrl = baseUrl + deliveryReportPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openDeliveryReportPage(fullDeliveryReportPageUrl);
		Assert.assertTrue("Delivery Report page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/DeliveryReports"));
		deliveryPage.verifyUserCannotExportDeliveryReport();
		System.out.println("User should not be able to export Delivery Report in Delivery Module test");
		Hooks.scenario.log("User should not be able to export Delivery Report in Delivery Module test");

	}

	@And("the user should be able to export Delivery Report in Delivery Module test")
	public void verifyUserCanExportDeliveryReport() {
		deliveryPage.verifyUserCanExportDeliveryReport();
		System.out.println("User should be able to export Delivery Report in Delivery Module test");
		Hooks.scenario.log("User should be able to export Delivery Report in Delivery Module test");

	}

	// Delivery Job Setting
	@And("the user should not be able to run triggers in Delivery Module test")
	public void testUserCannotRunTriggersInDeliveryModule() {
		deliveryPage.testDeliveryModuleRunTriggersNotAllowed();
		System.out.println("User should not be able to run triggers in Delivery Module test");
		Hooks.scenario.log("User should not be able to run triggers in Delivery Module test");

	}

	@And("the user should be able to edit Delivery Job Setting in Delivery Module test")
	public void testUserCanEditDeliveryJobSettingInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String jobSettingsPagePath = Hooks.prop.getProperty("jobSettingsPagePath");
		Assert.assertNotNull("Job Settings page path is missing in config", jobSettingsPagePath);
		String fullJobSettingsPageUrl = baseUrl + jobSettingsPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openJobSettingsPage(fullJobSettingsPageUrl);
		Assert.assertTrue("Job Settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/JobSettings"));
		deliveryPage.verifyUserCanEditDeliveryJobSetting();
		System.out.println("User should be able to edit Delivery Job Setting in Delivery Module test");
		Hooks.scenario.log("User should be able to edit Delivery Job Setting in Delivery Module test");

	}

	@And("the user should be able to run triggers in Delivery Module test")
	public void verifyUserCanRunTriggersInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String jobSettingsPagePath = Hooks.prop.getProperty("jobSettingsPagePath");
		Assert.assertNotNull("Job Settings page path is missing in config", jobSettingsPagePath);
		String fullJobSettingsPageUrl = baseUrl + jobSettingsPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openJobSettingsPage(fullJobSettingsPageUrl);
		Assert.assertTrue("Job Settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/JobSettings"));
		deliveryPage.runTriggersDeliveryModuleTest();
		System.out.println("User should be able to run triggers in Delivery Module test");
		Hooks.scenario.log("User should be able to run triggers in Delivery Module test");

	}

	@And("the user should not be able to edit Delivery Job Setting in Delivery Module test")
	public void verifyUserCannotEditDeliveryJobSetting() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String jobSettingsPagePath = Hooks.prop.getProperty("jobSettingsPagePath");
		Assert.assertNotNull("Job Settings page path is missing in config", jobSettingsPagePath);
		String fullJobSettingsPageUrl = baseUrl + jobSettingsPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openJobSettingsPage(fullJobSettingsPageUrl);
		Assert.assertTrue("Job Settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/JobSettings"));
		deliveryPage.noEditDeliveryJobSettingTest();
		System.out.println("User should not be able to edit Delivery Job Setting in Delivery Module test");
		Hooks.scenario.log("User should not be able to edit Delivery Job Setting in Delivery Module test");

	}

	@And("I create a profile with Edit access only to Delivery Module Delivery Job Setting test")
	public void testCreateProfileWithEditAccessToDeliveryJobSetting() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.testDeliveryJobSettingEditAccessProfile();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile created with Edit access only to Delivery Module Delivery Job Setting test");
		Hooks.scenario.log("Profile created with Edit access only to Delivery Module Delivery Job Setting test");

	}

	@And("I create a profile with Run Trigger access only to Delivery Module Delivery Job Setting test")
	public void createProfileWithRunTriggerAccessOnlyForDeliveryJobSetting() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.runTriggerAccessProfileTest();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile created with Run Trigger access only to Delivery Module Delivery Job Setting test");
		Hooks.scenario.log("Profile created with Run Trigger access only to Delivery Module Delivery Job Setting test");

	}

	// Customer Attestation
	@And("I create a profile with Print and Send for Signature access to Delivery Module Customer Attestation test")
	public void testCreateProfileWithPrintAndSendForSignatureAccessToCustomerAttestation() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.testPrintAndSendForSignatureAccessToCustomerAttestation();
		deliveryPage.clickSubmitButton();
		System.out.println(
				"Profile created with Print and Send for Signature access to Delivery Module Customer Attestation test");
		Hooks.scenario.log(
				"Profile created with Print and Send for Signature access to Delivery Module Customer Attestation test");

	}

	@And("the user should be able to add Customer Attestation in Delivery Module test")
	public void testUserCanAddCustomerAttestationInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String packagesPagePath = Hooks.prop.getProperty("packagesPagePath");
		Assert.assertNotNull("Packages page path is missing in config", packagesPagePath);
		String fullPackagesPageUrl = baseUrl + packagesPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.packagesPagePath(fullPackagesPageUrl);
		Assert.assertTrue("Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Packages?category=1"));
		deliveryPage.testAddCustomerAttestationFunctionality();
		System.out.println("User should be able to add Customer Attestation in Delivery Module test");
		Hooks.scenario.log("User should be able to add Customer Attestation in Delivery Module test");

	}

	@And("the user should be able to edit Customer Attestation in Delivery Module test")
	public void testUserCanEditCustomerAttestationInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String packagesPagePath = Hooks.prop.getProperty("packagesPagePath");
		Assert.assertNotNull("Packages page path is missing in config", packagesPagePath);
		String fullPackagesPageUrl = baseUrl + packagesPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.packagesPagePath(fullPackagesPageUrl);
		Assert.assertTrue("Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Packages?category=1"));
		deliveryPage.testCustomerAttestationEditAccess();
		System.out.println("User should be able to edit Customer Attestation in Delivery Module test");
		Hooks.scenario.log("User should be able to edit Customer Attestation in Delivery Module test");

	}

	@And("the user should be able to delete Customer Attestation in Delivery Module test")
	public void testUserCanDeleteCustomerAttestationInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String packagesPagePath = Hooks.prop.getProperty("packagesPagePath");
		Assert.assertNotNull("Packages page path is missing in config", packagesPagePath);
		String fullPackagesPageUrl = baseUrl + packagesPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.packagesPagePath(fullPackagesPageUrl);
		Assert.assertTrue("Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Packages?category=1"));
		deliveryPage.testCustomerAttestationDeleteAccess();
		System.out.println("User should be able to delete Customer Attestation in Delivery Module test");
		Hooks.scenario.log("User should be able to delete Customer Attestation in Delivery Module test");

	}

	@And("the user should be able to print Customer Attestation in Delivery Module test")
	public void testUserCanPrintCustomerAttestationInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String packagesPagePath = Hooks.prop.getProperty("packagesPagePath");
		Assert.assertNotNull("Packages page path is missing in config", packagesPagePath);
		String fullPackagesPageUrl = baseUrl + packagesPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.packagesPagePath(fullPackagesPageUrl);
		Assert.assertTrue("Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Packages?category=1"));
		deliveryPage.verifyUserCanPrintCustomerAttestation();
		System.out.println("User should be able to print Customer Attestation in Delivery Module test");
		Hooks.scenario.log("User should be able to print Customer Attestation in Delivery Module test");

	}

	@And("the user should be able to send Customer Attestation for signature in Delivery Module test")
	public void testUserCanSendCustomerAttestationForSignatureInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String packagesPagePath = Hooks.prop.getProperty("packagesPagePath");
		Assert.assertNotNull("Packages page path is missing in config", packagesPagePath);
		String fullPackagesPageUrl = baseUrl + packagesPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.packagesPagePath(fullPackagesPageUrl);
		Assert.assertTrue("Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Packages?category=1"));
		deliveryPage.verifyUserCanSendCustomerAttestationForSignature();
		System.out.println("User should be able to send Customer Attestation for signature in Delivery Module test");
		Hooks.scenario.log("User should be able to send Customer Attestation for signature in Delivery Module test");

	}

	@And("the user should not be able to add or edit Customer Attestation in Delivery Module test")
	public void testUserCannotAddOrEditCustomerAttestationInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String packagesPagePath = Hooks.prop.getProperty("packagesPagePath");
		Assert.assertNotNull("Packages page path is missing in config", packagesPagePath);
		String fullPackagesPageUrl = baseUrl + packagesPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.packagesPagePath(fullPackagesPageUrl);
		Assert.assertTrue("Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Packages?category=1"));
		deliveryPage.testCustomerAttestationAddEditRestricted();
		System.out.println("User should not be able to add or edit Customer Attestation in Delivery Module test");
		Hooks.scenario.log("User should not be able to add or edit Customer Attestation in Delivery Module test");

	}

	@And("the user should not be able to add or delete Customer Attestation in Delivery Module test")
	public void testUserCannotAddOrDeleteCustomerAttestationInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String packagesPagePath = Hooks.prop.getProperty("packagesPagePath");
		Assert.assertNotNull("Packages page path is missing in config", packagesPagePath);
		String fullPackagesPageUrl = baseUrl + packagesPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.packagesPagePath(fullPackagesPageUrl);
		Assert.assertTrue("Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Packages?category=1"));
		deliveryPage.testNoAddOrDeleteAccessForCustomerAttestation();
		System.out.println("User should not be able to add or delete Customer Attestation in Delivery Module test");
		Hooks.scenario.log("User should not be able to add or delete Customer Attestation in Delivery Module test");

	}

	@And("the user should not be able to edit or delete Customer Attestation in Delivery Module test")
	public void testUserCannotEditOrDeleteCustomerAttestationInDeliveryModule() {
		deliveryPage.testEditAndDeleteAccessRestrictedForCustomerAttestation();
		System.out.println("User should not be able to edit or delete Customer Attestation in Delivery Module test");
		Hooks.scenario.log("User should not be able to edit or delete Customer Attestation in Delivery Module test");

	}

	@And("I create a profile with Edit access only to Delivery Module Customer Attestation test")
	public void testCreateProfileWithDeleteAccessToCustomerAttestation() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.testCustomerAttestationDeleteAccessProfile();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile created with Edit access only to Delivery Module Customer Attestation test");
		Hooks.scenario.log("Profile created with Edit access only to Delivery Module Customer Attestation test");

	}

	@And("I create a profile with Delete access only to Delivery Module Customer Attestation test")
	public void testCreateProfileWithEditAccessToCustomerAttestation() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.testCustomerAttestationEditAccessProfile();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile created with Delete access only to Delivery Module Customer Attestation test");
		Hooks.scenario.log("Profile created with Delete access only to Delivery Module Customer Attestation test");

	}

	@And("I create a profile with Add access only to Delivery Module Customer Attestation test")
	public void testCreateProfileWithAddAccessToCustomerAttestation() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.testProfileWithAddPermissionForCustomerAttestation();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile created with Add access only to Delivery Module Customer Attestation test");
		Hooks.scenario.log("Profile created with Add access only to Delivery Module Customer Attestation test");

	}

	// Manifest
	@And("I create a profile with Full Access for Manifest to Delivery Module Manifest test")
	public void testCreateProfileWithFullAccessToDeliveryManifest() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.testProfileWithFullPermissionsForManifest();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile created with Full Access for Manifest to Delivery Module Manifest test");
		Hooks.scenario.log("Profile created with Full Access for Manifest to Delivery Module Manifest test");

	}

	@And("I create a profile with View and Delete access only to Delivery Module Manifest test")
	public void testCreateProfileWithViewAndDeleteAccessToDeliveryManifest() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.verifyUserCanViewAndDeleteManifest();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile created with View and Delete access only to Delivery Module Manifest test");
		Hooks.scenario.log("Profile created with View and Delete access only to Delivery Module Manifest test");

	}

	@And("I create a profile with View and Edit access only to Delivery Module Manifest test")
	public void testCreateProfileWithViewAndEditAccessToDeliveryManifest() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.testProfileWithViewAndEditPermissionsForManifest();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile created with View and Edit access only to Delivery Module Manifest test");
		Hooks.scenario.log("Profile created with View and Edit access only to Delivery Module Manifest test");

	}

	@And("I create a profile with View and Add access only to Delivery Module Manifest test")
	public void testCreateProfileWithViewAndAddAccessToDeliveryManifest() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.testProfileWithViewAndAddPermissionsForManifest();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile created with View and Add access only to Delivery Module Manifest test");
		Hooks.scenario.log("Profile created with View and Add access only to Delivery Module Manifest test");

	}

	@And("the user should be able to view and edit Manifest in Delivery Module test")
	public void testUserCanViewAndEditManifestInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliveryManifestUrl = Hooks.prop.getProperty("deliveryManifestUrl");
		Assert.assertNotNull("deliveryManifestUrl is missing in config", deliveryManifestUrl);
		String fullDeliveryManifestUrl = baseUrl + deliveryManifestUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openDeliveryManifestPage(fullDeliveryManifestUrl);
		Assert.assertTrue("Delivery Manifest page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Manifests"));
		deliveryPage.testViewAndEditManifestAccessInDeliveryModule();
		System.out.println("User should be able to view and edit Manifest in Delivery Module test");
		Hooks.scenario.log("User should be able to view and edit Manifest in Delivery Module test");

	}

	@And("the user should be able to view and delete Manifest in Delivery Module test")
	public void testUserCanViewAndDeleteManifestInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliveryManifestUrl = Hooks.prop.getProperty("deliveryManifestUrl");
		Assert.assertNotNull("deliveryManifestUrl is missing in config", deliveryManifestUrl);
		String fullDeliveryManifestUrl = baseUrl + deliveryManifestUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openDeliveryManifestPage(fullDeliveryManifestUrl);
		Assert.assertTrue("Delivery Manifest page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Manifests"));
		deliveryPage.testViewAndDeleteManifestAccessInDeliveryModule();
		System.out.println("User should be able to view and delete Manifest in Delivery Module test");
		Hooks.scenario.log("User should be able to view and delete Manifest in Delivery Module test");

	}

	@And("the user should be able to access Manifest Detail in Delivery Module test")
	public void testUserCanAccessManifestDetailInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliveryManifestUrl = Hooks.prop.getProperty("deliveryManifestUrl");
		Assert.assertNotNull("deliveryManifestUrl is missing in config", deliveryManifestUrl);
		String fullDeliveryManifestUrl = baseUrl + deliveryManifestUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openDeliveryManifestPage(fullDeliveryManifestUrl);
		Assert.assertTrue("Delivery Manifest page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Manifests"));
		deliveryPage.testManifestDetailIsAccessibleByUser();
		System.out.println("User should be able to access Manifest Detail in Delivery Module test");
		Hooks.scenario.log("User should be able to access Manifest Detail in Delivery Module test");

	}

	@And("the user should be able to add Manifest Package in Delivery Module test")
	public void testUserCanAddManifestPackageInDeliveryModule() {
		deliveryPage.verifyUserCanAddManifestPackage();
		System.out.println("User should be able to add Manifest Package in Delivery Module test");
		Hooks.scenario.log("User should be able to add Manifest Package in Delivery Module test");

	}

	@And("the user should be able to delete Manifest Package in Delivery Module test")
	public void testUserCanDeleteManifestPackageInDeliveryModule() {
		deliveryPage.testDeleteManifestPackageAccessInDeliveryModule();
		System.out.println("User should be able to delete Manifest Package in Delivery Module test");
		Hooks.scenario.log("User should be able to delete Manifest Package in Delivery Module test");

	}

	@And("the user should be able to skip Manifest Package in Delivery Module test")
	public void testUserCanSkipManifestPackageInDeliveryModule() {
		deliveryPage.verifyUserCanSkipManifestPackage();
		System.out.println("User should be able to skip Manifest Package in Delivery Module test");
		Hooks.scenario.log("User should be able to skip Manifest Package in Delivery Module test");

	}

	@And("the user should be able to add Manifest Bundle in Delivery Module test")
	public void testUserCanAddManifestBundleInDeliveryModule() {
		deliveryPage.testAddManifestBundleFunctionality();
		System.out.println("User should be able to add Manifest Bundle in Delivery Module test");
		Hooks.scenario.log("User should be able to add Manifest Bundle in Delivery Module test");

	}

	@And("the user should be able to delete Manifest Bundle in Delivery Module test")
	public void testUserCanDeleteManifestBundleInDeliveryModule() {
		deliveryPage.testDeleteManifestBundleFunctionality();
		System.out.println("User should be able to delete Manifest Bundle in Delivery Module test");
		Hooks.scenario.log("User should be able to delete Manifest Bundle in Delivery Module test");

	}

	@And("the user should be able to print Manifest in Delivery Module test")
	public void testUserCanPrintManifestInDeliveryModule() {
		deliveryPage.testPrintManifestFunctionality();
		System.out.println("User should be able to print Manifest in Delivery Module test");
		Hooks.scenario.log("User should be able to print Manifest in Delivery Module test");

	}

	@And("the user should not be able to add or edit Manifest in Delivery Module test")
	public void testUserCannotAddOrEditManifestInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliveryManifestUrl = Hooks.prop.getProperty("deliveryManifestUrl");
		Assert.assertNotNull("deliveryManifestUrl is missing in config", deliveryManifestUrl);
		String fullDeliveryManifestUrl = baseUrl + deliveryManifestUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openDeliveryManifestPage(fullDeliveryManifestUrl);
		Assert.assertTrue("Delivery Manifest page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Manifests"));
		deliveryPage.verifyUserCannotAddOrEditManifest();
		System.out.println("User should not be able to add or edit Manifest in Delivery Module test");
		Hooks.scenario.log("User should not be able to add or edit Manifest in Delivery Module test");

	}

	@And("the user should not be able to add or delete Manifest in Delivery Module test")
	public void testUserCannotAddOrDeleteManifestInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliveryManifestUrl = Hooks.prop.getProperty("deliveryManifestUrl");
		Assert.assertNotNull("deliveryManifestUrl is missing in config", deliveryManifestUrl);
		String fullDeliveryManifestUrl = baseUrl + deliveryManifestUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openDeliveryManifestPage(fullDeliveryManifestUrl);
		Assert.assertTrue("Delivery Manifest page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Manifests"));
		deliveryPage.verifyUserCannotAddOrDeleteManifest();
		System.out.println("User should not be able to add or delete Manifest in Delivery Module test");
		Hooks.scenario.log("User should not be able to add or delete Manifest in Delivery Module test");

	}

	@And("the user should be able to view and add Manifest in Delivery Module test")
	public void testUserCanViewAndAddManifestInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliveryManifestUrl = Hooks.prop.getProperty("deliveryManifestUrl");
		Assert.assertNotNull("deliveryManifestUrl is missing in config", deliveryManifestUrl);
		String fullDeliveryManifestUrl = baseUrl + deliveryManifestUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openDeliveryManifestPage(fullDeliveryManifestUrl);
		Assert.assertTrue("Delivery Manifest page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Manifests"));
		deliveryPage.verifyUserCanViewAndAddManifest();
		System.out.println("User should be able to view and add Manifest in Delivery Module test");
		Hooks.scenario.log("User should be able to view and add Manifest in Delivery Module test");

	}

	@And("the user should not be able to edit or delete Manifest in Delivery Module test")
	public void testUserCannotEditOrDeleteManifestInDeliveryModule() {
		deliveryPage.verifyUserCannotEditOrDeleteManifest();
		System.out.println("User should not be able to edit or delete Manifest in Delivery Module test");
		Hooks.scenario.log("User should not be able to edit or delete Manifest in Delivery Module test");

	}

	// Delivery Identifier
	@And("the user should have no Delivery Identifier access via UI or direct URL test")
	public void testUserHasNoDeliveryIdentifierAccessViaUIOrDirectURL() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliveryDistancesUrl = Hooks.prop.getProperty("deliveryDistancesUrl");
		Assert.assertNotNull("deliveryDistancesUrl is missing in config", deliveryDistancesUrl);
		String fullDeliveryDistancesUrl = baseUrl + deliveryDistancesUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openDeliveryDistancesPage(fullDeliveryDistancesUrl);
		Assert.assertTrue("Package Restriction page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/DeliveryDistances"));
		System.out.println("User should have no Delivery Identifier access via UI or direct URL test");
		Hooks.scenario.log("User should have no Delivery Identifier access via UI or direct URL test");

	}

	@And("I create a profile without access to Delivery Module Delivery Identifier test")
	public void testCreateProfileWithoutDeliveryModuleAccess() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.testUserWithoutDeliveryAccessCannotViewDeliveryIdentifier();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile created without access to Delivery Module Delivery Identifier test");
		Hooks.scenario.log("Profile created without access to Delivery Module Delivery Identifier test");

	}

	@And("I create a profile with View-only access to Delivery Module Delivery Identifier test")
	public void testCreateProfileWithViewOnlyAccessToDeliveryModule() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.testDeliveryModuleViewOnlyProfile();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile created with View-only access to Delivery Module Delivery Identifier test");
		Hooks.scenario.log("Profile created with View-only access to Delivery Module Delivery Identifier test");

	}

	@And("the user should be able to view Delivery Identifier in Delivery Module test")
	public void testUserCanViewDeliveryIdentifierInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliveryDistancesUrl = Hooks.prop.getProperty("deliveryDistancesUrl");
		Assert.assertNotNull("deliveryDistancesUrl is missing in config", deliveryDistancesUrl);
		String fullDeliveryDistancesUrl = baseUrl + deliveryDistancesUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openDeliveryDistancesPage(fullDeliveryDistancesUrl);
		Assert.assertTrue("Package Restriction page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/DeliveryDistances"));
		System.out.println("User should be able to view Delivery Identifier in Delivery Module test");
		Hooks.scenario.log("User should be able to view Delivery Identifier in Delivery Module test");

	}

	// Package Plan Restriction
	@And("the user should be able to update Package Plan Restriction in Delivery Module test")
	public void verifyUserCanUpdatePackagePlanRestriction() {
		deliveryPage.verifyUserCanUpdatePackagePlanRestriction();
		System.out.println("User should be able to update Package Plan Restriction in Delivery Module test");
		Hooks.scenario.log("User should be able to update Package Plan Restriction in Delivery Module test");

	}

	@And("the user should have no Package Plan Restriction access via UI or direct URL test")
	public void verifyUserHasNoPackagePlanRestrictionAccess() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String packagesPagePath = Hooks.prop.getProperty("packagesPagePath");
		Assert.assertNotNull("Packages page path is missing in config", packagesPagePath);
		String fullPackagesPageUrl = baseUrl + packagesPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.packagesPagePath(fullPackagesPageUrl);
		Assert.assertTrue("Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Packages?category=1"));
		deliveryPage.verifyUserCannotAccessPackagePlanRestriction();
		System.out.println("User should have no Package Plan Restriction access via UI or direct URL test");
		Hooks.scenario.log("User should have no Package Plan Restriction access via UI or direct URL test");

	}

	@And("I create a profile without access to Delivery Module Package Plan Restriction test")
	public void createProfileWithoutPackagePlanRestrictionAccess() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createNoPackagePlanRestrictionAccessProfile();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile created without access to Delivery Module Package Plan Restriction test");
		Hooks.scenario.log("Profile created without access to Delivery Module Package Plan Restriction test");

	}

	@And("the user should be able to view Package Plan Restriction in Delivery Module test")
	public void verifyUserCanViewPackagePlanRestriction() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String packagesPagePath = Hooks.prop.getProperty("packagesPagePath");
		Assert.assertNotNull("Packages page path is missing in config", packagesPagePath);
		String fullPackagesPageUrl = baseUrl + packagesPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.packagesPagePath(fullPackagesPageUrl);
		Assert.assertTrue("Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Packages?category=1"));
		deliveryPage.verifyUserCanViewPackagePlanRestriction();
		System.out.println("User should be able to view Package Plan Restriction in Delivery Module test");
		Hooks.scenario.log("User should be able to view Package Plan Restriction in Delivery Module test");

	}

	@And("I create a profile with View and Update access to Delivery Module Package Plan Restriction test")
	public void createProfileWithViewAndUpdateAccessToPackagePlanRestriction() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createPackagePlanRestrictionViewUpdateProfile();
		deliveryPage.clickSubmitButton();
		System.out.println(
				"Profile created with View and Update access to Delivery Module Package Plan Restriction test");
		Hooks.scenario
				.log("Profile created with View and Update access to Delivery Module Package Plan Restriction test");

	}

	// Delivery Setting
	@And("I create a profile without access to Delivery Module Delivery Setting test")
	public void createProfileWithoutDeliverySettingsAccess() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createNoDeliverySettingsAccessProfile();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile created without access to Delivery Module Delivery Setting test");
		Hooks.scenario.log("Profile created without access to Delivery Module Delivery Setting test");

	}

	@And("I create a profile with View and Update access to Delivery Module Delivery Setting test")
	public void createProfileWithViewAndUpdateAccessToDeliverySettings() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createDeliverySettingsViewUpdateProfile();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile created with View and Update access to Delivery Module Delivery Setting test");
		Hooks.scenario.log("Profile created with View and Update access to Delivery Module Delivery Setting test");

	}

	@And("the user should be able to update Delivery Setting in Delivery Module test")
	public void verifyUserCanUpdateDeliverySetting() {
		deliveryPage.verifyUserCanUpdateDeliverySetting();
		System.out.println("User should be able to update Delivery Setting in Delivery Module test");
		Hooks.scenario.log("User should be able to update Delivery Setting in Delivery Module test");

	}

	@And("the user should have no Delivery Setting access via UI or direct URL test")
	public void verifyUserHasNoDeliverySettingAccess() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliverySettingsPath = Hooks.prop.getProperty("deliverySettingsPath");
		Assert.assertNotNull("Delivery Settings path is missing in config", deliverySettingsPath);
		String fullDeliverySettingsUrl = baseUrl + deliverySettingsPath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openDeliverySettingsPage(fullDeliverySettingsUrl);
		Assert.assertTrue("Delivery Settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Settings"));
		deliveryPage.verifyUserCannotAccessDeliverySetting();
		System.out.println("User should have no Delivery Setting access via UI or direct URL test");
		Hooks.scenario.log("User should have no Delivery Setting access via UI or direct URL test");

	}

	@And("the user should be able to view Delivery Setting in Delivery Module test")
	public void verifyUserCanViewDeliverySetting() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliverySettingsPath = Hooks.prop.getProperty("deliverySettingsPath");
		Assert.assertNotNull("Delivery Settings path is missing in config", deliverySettingsPath);
		String fullDeliverySettingsUrl = baseUrl + deliverySettingsPath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openDeliverySettingsPage(fullDeliverySettingsUrl);
		Assert.assertTrue("Delivery Settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Settings"));
		System.out.println("User should be able to view Delivery Setting in Delivery Module test");
		Hooks.scenario.log("User should be able to view Delivery Setting in Delivery Module test");

	}

	// Package
	@And("the user should be able to sync Logistic Tracking History in Delivery Module test")
	public void verifyUserCanSyncLogisticTrackingHistory() {
		deliveryPage.verifyUserCanSyncLogisticTrackingHistory();
		System.out.println("User should be able to sync Logistic Tracking History in Delivery Module test");
		Hooks.scenario.log("User should be able to sync Logistic Tracking History in Delivery Module test");

	}

	@And("the user should be able to print Pickup Package in Delivery Module test")
	public void verifyUserCanPrintPickupPackage() {
		deliveryPage.verifyUserCanPrintPickupPackage();
		System.out.println("User should be able to print Pickup Package in Delivery Module test");
		Hooks.scenario.log("User should be able to print Pickup Package in Delivery Module test");

	}

	@And("the user should be able to share Package in Delivery Module test")
	public void verifyUserCanSharePackage() {
		deliveryPage.verifySharePackage();
		System.out.println("User should be able to share Package in Delivery Module test");
		Hooks.scenario.log("User should be able to share Package in Delivery Module test");

	}

	@And("the user should be able to print Package in Delivery Module test")
	public void verifyUserCanPrintPackage() {
		deliveryPage.verifyUserCanPrintPackage();
		System.out.println("User should be able to print Package in Delivery Module test");
		Hooks.scenario.log("User should be able to print Package in Delivery Module test");

	}

	@And("the user should be able to generate Package Invoice in Delivery Module test")
	public void verifyUserCanGeneratePackageInvoice() {
		deliveryPage.verifyGeneratePackageInvoice();
		System.out.println("User should be able to generate Package Invoice in Delivery Module test");
		Hooks.scenario.log("User should be able to generate Package Invoice in Delivery Module test");

	}

	@And("the user should be able to download Attestation Documents in Delivery Module test")
	public void verifyUserCanDownloadAttestationDocuments() {
		deliveryPage.verifyDownloadAttestationDocuments();
		System.out.println("User should be able to download Attestation Documents in Delivery Module test");
		Hooks.scenario.log("User should be able to download Attestation Documents in Delivery Module test");

	}

	@And("the user should be able to send Package for Signature in Delivery Module test")
	public void verifyUserCanSendPackageForSignature() {
		deliveryPage.verifySendPackageForSignature();
		System.out.println("User should be able to send Package for Signature in Delivery Module test");
		Hooks.scenario.log("User should be able to send Package for Signature in Delivery Module test");

	}

	@And("the user should be able to print Signature in Delivery Module test")
	public void verifyUserCanPrintSignature() {
		deliveryPage.verifyPrintSignature();
		System.out.println("User should be able to print Signature in Delivery Module test");
		Hooks.scenario.log("User should be able to print Signature in Delivery Module test");

	}

	@And("the user should be able to download Signature in Delivery Module test")
	public void verifyUserCanDownloadSignature() {
		deliveryPage.verifyDownloadSignature();
		System.out.println("User should be able to download Signature in Delivery Module test");
		Hooks.scenario.log("User should be able to download Signature in Delivery Module test");

	}

	@And("the user should be able to upload Signature in Delivery Module test")
	public void verifyUserCanUploadSignature() {
		deliveryPage.verifyUploadSignature();
		System.out.println("User should be able to upload Signature in Delivery Module test");
		Hooks.scenario.log("User should be able to upload Signature in Delivery Module test");

	}

	@And("the user should be able to download Reference Documents in Delivery Module test")
	public void verifyUserCanDownloadReferenceDocuments() {
		deliveryPage.verifyUserCanDownloadReferenceDocuments();
		System.out.println("User should be able to download Reference Documents in Delivery Module test");
		Hooks.scenario.log("User should be able to download Reference Documents in Delivery Module test");

	}

	@And("the user should be able to update Delivery Status in Delivery Module test")
	public void verifyUserCanUpdateDeliveryStatus() {
		deliveryPage.verifyUserCanUpdateDeliveryStatus();
		System.out.println("User should be able to update Delivery Status in Delivery Module test");
		Hooks.scenario.log("User should be able to update Delivery Status in Delivery Module test");

	}

	@And("the user should be able to generate Package Label in Delivery Module test")
	public void verifyUserCanGeneratePackageLabel() {
		deliveryPage.verifyUserCanGeneratePackageLabel();
		System.out.println("User should be able to generate Package Label in Delivery Module test");
		Hooks.scenario.log("User should be able to generate Package Label in Delivery Module test");

	}

	@And("the user should be able to access Package Detail in Delivery Module test")
	public void verifyUserCanAccessPackageDetail() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String packagesPagePath = Hooks.prop.getProperty("packagesPagePath");
		Assert.assertNotNull("Packages page path is missing in config", packagesPagePath);
		String fullPackagesPageUrl = baseUrl + packagesPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.packagesPagePath(fullPackagesPageUrl);
		Assert.assertTrue("Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Packages?category=1"));
		deliveryPage.verifyUserCanAccessPackageDetail();
		System.out.println("User should be able to access Package Detail in Delivery Module test");
		Hooks.scenario.log("User should be able to access Package Detail in Delivery Module test");

	}

	@And("I create a profile with Full Access for Package to Delivery Module Package test")
	public void createProfileWithFullPackageAccess() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createFullAccessProfileForDeliveryPackage();
		deliveryPage.clickSubmitButton();
		System.out.println("I create a profile with Full Access for Package to Delivery Module Package test");
		Hooks.scenario.log("I create a profile with Full Access for Package to Delivery Module Package test");

	}

	@And("the user should not be able to edit or delete Package in Delivery Module test")
	public void userCannotEditDeletePackage() {
		deliveryPage.checkCannotEditDeletePackage();
		System.out.println("User should not be able to edit or delete Package in Delivery Module test");
		Hooks.scenario.log("User should not be able to edit or delete Package in Delivery Module test");

	}

	@And("the user should not be able to add or delete Package in Delivery Module test")
	public void verifyUserCannotAddOrDeletePackage() {
		deliveryPage.verifyUserCannotAddOrDeletePackage();
		System.out.println("User should not be able to add or delete Package in Delivery Module test");
		Hooks.scenario.log("User should not be able to add or delete Package in Delivery Module test");

	}

	@And("the user should not be able to add or edit Package in Delivery Module test")
	public void verifyUserCannotAddOrEditPackage() {
		deliveryPage.verifyUserCannotAddOrEditPackage();
		System.out.println("User should not be able to add or edit Package in Delivery Module test");
		Hooks.scenario.log("User should not be able to add or edit Package in Delivery Module test");

	}

	@And("the user should be able to view and delete Package in Delivery Module test")
	public void verifyUserCanViewAndDeletePackage() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String packagesPagePath = Hooks.prop.getProperty("packagesPagePath");
		Assert.assertNotNull("Packages page path is missing in config", packagesPagePath);
		String fullPackagesPageUrl = baseUrl + packagesPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.packagesPagePath(fullPackagesPageUrl);
		Assert.assertTrue("Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Packages?category=1"));
		deliveryPage.verifyUserCanViewAndDeletePackage();
		System.out.println("User should be able to view and delete Package in Delivery Module test");
		Hooks.scenario.log("User should be able to view and delete Package in Delivery Module test");

	}

	@And("the user should be able to view and edit Package in Delivery Module test")
	public void verifyViewEditPackage() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String packagesPagePath = Hooks.prop.getProperty("packagesPagePath");
		Assert.assertNotNull("Packages page path is missing in config", packagesPagePath);
		String fullPackagesPageUrl = baseUrl + packagesPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.packagesPagePath(fullPackagesPageUrl);
		Assert.assertTrue("Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Packages?category=1"));
		deliveryPage.verifyUserCanViewAndEditPackage();
		System.out.println("User should be able to view and edit Package in Delivery Module test");
		Hooks.scenario.log("User should be able to view and edit Package in Delivery Module test");

	}

	@And("the user should be able to view and add Package in Delivery Module test")
	public void verifyViewAddPackage() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String packagesPagePath = Hooks.prop.getProperty("packagesPagePath");
		Assert.assertNotNull("Packages page path is missing in config", packagesPagePath);
		String fullPackagesPageUrl = baseUrl + packagesPagePath;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.packagesPagePath(fullPackagesPageUrl);
		Assert.assertTrue("Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Packages?category=1"));
		deliveryPage.checkViewAddPackage();
		System.out.println("User should be able to view and add Package in Delivery Module test");
		Hooks.scenario.log("User should be able to view and add Package in Delivery Module test");

	}

	@And("I create a profile with View and Delete access only to Delivery Module Package test")
	public void profileViewDelete() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createDeliveryVD();
		deliveryPage.clickSubmitButton();
		System.out.println("I create a profile with View and Delete access only to Delivery Module Package test");
		Hooks.scenario.log("I create a profile with View and Delete access only to Delivery Module Package test");

	}

	@And("I create a profile with View and Edit access only to Delivery Module Package test")
	public void createDeliveryProfileViewEdit() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createProfileVE();
		deliveryPage.clickSubmitButton();
		System.out.println("I create a profile with View and Edit access only to Delivery Module Package test");
		Hooks.scenario.log("I create a profile with View and Edit access only to Delivery Module Package test");

	}

	@And("I create a profile with View and Add access only to Delivery Module Package test")
	public void createProfileWithViewAndAddAccessForDeliveryModule() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createDeliveryProfile();
		deliveryPage.clickSubmitButton();
		System.out.println("I create a profile with View and Add access only to Delivery Module Package test");
		Hooks.scenario.log("I create a profile with View and Add access only to Delivery Module Package test");

	}

	// Delivery Marker
	@And("the user should be able to view and delete Delivery Marker in Delivery Module test")
	public void userCanViewAndDeleteDeliveryMarker() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliveryMarkerUrl = Hooks.prop.getProperty("deliveryMarkerUrl");
		Assert.assertNotNull("deliveryMarkerUrl is missing in config", deliveryMarkerUrl);
		String fullDeliveryMarkerUrl = baseUrl + deliveryMarkerUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openDeliveryMarkerPage(fullDeliveryMarkerUrl);
		Assert.assertTrue("Delivery Marker page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/DeliveryMarkers"));
		deliveryPage.validateViewDeleteDeliveryMarker();
		System.out.println("User should be able to view and delete Delivery Marker in Delivery Module test");
		Hooks.scenario.log("User should be able to view and delete Delivery Marker in Delivery Module test");

	}

	@And("the user should not be able to add or delete Delivery Marker in Delivery Module test")
	public void verifyAddDeleteDeliveryMarkerDisabled() {
		deliveryPage.userCannotAddOrDeleteDeliveryMarker();
		System.out.println("User should not be able to add or delete Delivery Marker in Delivery Module test");
		Hooks.scenario.log("User should not be able to add or delete Delivery Marker in Delivery Module test");

	}

	@And("the user should not be able to add or edit Delivery Marker in Delivery Module test")
	public void verifyAddEditDeliveryMarkerDisabled() {
		deliveryPage.validateNoAddEditDeliveryMarkerAccess();
		System.out.println("User should not be able to add or edit Delivery Marker in Delivery Module test");
		Hooks.scenario.log("User should not be able to add or edit Delivery Marker in Delivery Module test");

	}

	@And("the user should be able to view and edit Delivery Marker in Delivery Module test")
	public void userCanViewAndEditDeliveryMarker() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliveryMarkerUrl = Hooks.prop.getProperty("deliveryMarkerUrl");
		Assert.assertNotNull("deliveryMarkerUrl is missing in config", deliveryMarkerUrl);
		String fullDeliveryMarkerUrl = baseUrl + deliveryMarkerUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openDeliveryMarkerPage(fullDeliveryMarkerUrl);
		Assert.assertTrue("Delivery Marker page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/DeliveryMarkers"));
		deliveryPage.validateViewEditDeliveryMarker();
		System.out.println("User should be able to view and edit Delivery Marker in Delivery Module test");
		Hooks.scenario.log("User should be able to view and edit Delivery Marker in Delivery Module test");

	}

	@And("the user should be able to view and add Delivery Marker in Delivery Module test")
	public void verifyViewAndAddDeliveryMarker() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliveryMarkerUrl = Hooks.prop.getProperty("deliveryMarkerUrl");
		Assert.assertNotNull("deliveryMarkerUrl is missing in config", deliveryMarkerUrl);
		String fullDeliveryMarkerUrl = baseUrl + deliveryMarkerUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openDeliveryMarkerPage(fullDeliveryMarkerUrl);
		Assert.assertTrue("Delivery Marker page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/DeliveryMarkers"));
		deliveryPage.userCanViewAndAddDeliveryMarker();
		System.out.println("User should be able to view and add Delivery Marker in Delivery Module test");
		Hooks.scenario.log("User should be able to view and add Delivery Marker in Delivery Module test");

	}

	@And("the user should not be able to edit or delete Delivery Marker in Delivery Module test")
	public void verifyEditAndDeleteDeliveryMarkerDisabled() {
		deliveryPage.userCannotEditOrDeleteDeliveryMarker();
		System.out.println("User should not be able to edit or delete Delivery Marker in Delivery Module test");
		Hooks.scenario.log("User should not be able to edit or delete Delivery Marker in Delivery Module test");

	}

	@And("I create a profile with View and Add access only to Delivery Module Delivery Marker test")
	public void createProfileWithViewAndAddAccess() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createDMViewAddProfile();
		deliveryPage.clickSubmitButton();
		System.out.println("I create a profile with View and Add access only to Delivery Module Delivery Marker test");
		Hooks.scenario.log("I create a profile with View and Add access only to Delivery Module Delivery Marker test");

	}

	@And("I create a profile with View and Edit access only to Delivery Module Delivery Marker test")
	public void createProfileWithViewAndEditDeliveryMarker() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createDeliveryMarkerViewAndEditAccess();
		deliveryPage.clickSubmitButton();
		System.out.println("I create a profile with View and Edit access only to Delivery Module Delivery Marker test");
		Hooks.scenario.log("I create a profile with View and Edit access only to Delivery Module Delivery Marker test");

	}

	@And("I create a profile with View and Delete access only to Delivery Module Delivery Marker test")
	public void createProfileWithViewAndDeleteDeliveryMarker() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createDeliveryMarkerViewAndDeleteAccess();
		deliveryPage.clickSubmitButton();
		System.out
				.println("I create a profile with View and Delete access only to Delivery Module Delivery Marker test");
		Hooks.scenario
				.log("I create a profile with View and Delete access only to Delivery Module Delivery Marker test");

	}

	// Logistic Company
	@And("I create a profile with View and Edit access only to Delivery Module Logistic Company test")
	public void createProfileWithViewAndEditAccessToLogisticCompany() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createProfileWithViewEditAccessLogisticCompany();
		deliveryPage.clickSubmitButton();
		System.out
				.println("I create a profile with View and Edit access only to Delivery Module Logistic Company test");
		Hooks.scenario
				.log("I create a profile with View and Edit access only to Delivery Module Logistic Company test");

	}

	@And("I create a profile with View and Delete access only to Delivery Module Logistic Company test")
	public void createProfileWithViewAndDeleteAccessToLogisticCompany() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createProfileWithViewDeleteAccessLogisticCompany();
		deliveryPage.clickSubmitButton();
		System.out.println(
				"I create a profile with View and Delete access only to Delivery Module Logistic Company test");
		Hooks.scenario
				.log("I create a profile with View and Delete access only to Delivery Module Logistic Company test");

	}

	@And("I create a profile with View and Add access only to Delivery Module Logistic Company test")
	public void createProfileWithViewAndAddAccessToLogisticCompany() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createProfileWithViewAddAccessLogisticCompany();
		deliveryPage.clickSubmitButton();
		System.out.println("I create a profile with View and Add access only to Delivery Module Logistic Company test");
		Hooks.scenario.log("I create a profile with View and Add access only to Delivery Module Logistic Company test");

	}

	@And("the user should not be able to edit or delete Logistic Company in Delivery Module test")
	public void userCannotEditOrDeleteLogisticCompany() {
		deliveryPage.verifyUserCannotEditOrDeleteLogisticCompany();
		System.out.println("User should not be able to edit or delete Logistic Company in Delivery Module test");
		Hooks.scenario.log("User should not be able to edit or delete Logistic Company in Delivery Module test");

	}

	@And("the user should not be able to add or delete Logistic Company in Delivery Module test")
	public void userShouldNotBeAbleToAddOrDeleteLogisticCompanyInDeliveryModule() {
		deliveryPage.verifyUserCannotAddOrDeleteLogisticCompany();
		System.out.println("User should not be able to add or delete Logistic Company in Delivery Module test");
		Hooks.scenario.log("User should not be able to add or delete Logistic Company in Delivery Module test");

	}

	@And("the user should be able to view and add Logistic Company in Delivery Module test")
	public void userShouldBeAbleToViewAndAddLogisticCompanyInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String logisticCompanyUrl = Hooks.prop.getProperty("logisticCompanyUrl");
		Assert.assertNotNull("logisticCompanyUrl is missing in config", logisticCompanyUrl);
		String fullLogisticCompanyUrl = baseUrl + logisticCompanyUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openLogisticCompanyPage(fullLogisticCompanyUrl);
		Assert.assertTrue("Logistic Company page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/LogisticCompanies"));
		deliveryPage.userCanViewAndAddLogisticCompany();
		System.out.println("User should be able to view and add Logistic Company in Delivery Module test");
		Hooks.scenario.log("User should be able to view and add Logistic Company in Delivery Module test");

	}

	@And("the user should be able to view and edit Logistic Company in Delivery Module test")
	public void userShouldBeAbleToViewAndEditLogisticCompanyInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String logisticCompanyUrl = Hooks.prop.getProperty("logisticCompanyUrl");
		Assert.assertNotNull("logisticCompanyUrl is missing in config", logisticCompanyUrl);
		String fullLogisticCompanyUrl = baseUrl + logisticCompanyUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openLogisticCompanyPage(fullLogisticCompanyUrl);
		Assert.assertTrue("Logistic Company page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/LogisticCompanies"));
		deliveryPage.userCanViewAndEditLogisticCompany();
		System.out.println("User should be able to view and edit Logistic Company in Delivery Module test");
		Hooks.scenario.log("User should be able to view and edit Logistic Company in Delivery Module test");

	}

	@And("the user should be able to view and delete Logistic Company in Delivery Module test")
	public void userShouldBeAbleToViewAndDeleteLogisticCompanyInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String logisticCompanyUrl = Hooks.prop.getProperty("logisticCompanyUrl");
		Assert.assertNotNull("logisticCompanyUrl is missing in config", logisticCompanyUrl);
		String fullLogisticCompanyUrl = baseUrl + logisticCompanyUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openLogisticCompanyPage(fullLogisticCompanyUrl);
		Assert.assertTrue("Logistic Company page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/LogisticCompanies"));
		deliveryPage.userCanViewAndDeleteLogisticCompany();
		System.out.println("User should be able to view and delete Logistic Company in Delivery Module test");
		Hooks.scenario.log("User should be able to view and delete Logistic Company in Delivery Module test");

	}

	@And("the user should not be able to add or edit Logistic Company in Delivery Module test")
	public void userShouldNotBeAbleToAddOrEditLogisticCompanyInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String logisticCompanyUrl = Hooks.prop.getProperty("logisticCompanyUrl");
		Assert.assertNotNull("logisticCompanyUrl is missing in config", logisticCompanyUrl);
		String fullLogisticCompanyUrl = baseUrl + logisticCompanyUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openLogisticCompanyPage(fullLogisticCompanyUrl);
		Assert.assertTrue("Logistic Company page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/LogisticCompanies"));
		deliveryPage.verifyUserCannotAddOrEditLogisticCompany();
		System.out.println("User should not be able to add or edit Logistic Company in Delivery Module test");
		Hooks.scenario.log("User should not be able to add or edit Logistic Company in Delivery Module test");

	}

	// Delivery Distances
	@And("I create a profile with View and Delete access only to Delivery Module Delivery Distances test")
	public void createProfileWithViewAndDeleteAccessToDeliveryDistances() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createProfileWithViewDeleteAccessDeliveryDistances();
		deliveryPage.clickSubmitButton();
		System.out.println(
				"I create a profile with View and Delete access only to Delivery Module Delivery Distances test");
		Hooks.scenario
				.log("I create a profile with View and Delete access only to Delivery Module Delivery Distances test");

	}

	@And("I create a profile with View and Edit access only to Delivery Module Delivery Distances test")
	public void createProfileWithViewAndEditAccessToDeliveryDistances() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createDeliveryDistancesViewEditProfile();
		deliveryPage.clickSubmitButton();
		System.out.println(
				"I create a profile with View and Edit access only to Delivery Module Delivery Distances test");
		Hooks.scenario
				.log("I create a profile with View and Edit access only to Delivery Module Delivery Distances test");

	}

	@And("I create a profile with View and Add access only to Delivery Module Delivery Distances test")
	public void createProfileWithViewAndAddAccessToDeliveryDistances() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createProfileWithViewAddAccessDeliveryLogisticCompany();
		deliveryPage.clickSubmitButton();
		System.out
				.println("I create a profile with View and Add access only to Delivery Module Delivery Distances test");
		Hooks.scenario
				.log("I create a profile with View and Add access only to Delivery Module Delivery Distances test");

	}

	@And("the user should be able to view and add Delivery Distances in Delivery Module test")
	public void userShouldBeAbleToViewAndAddDeliveryDistancesInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliveryDistancesUrl = Hooks.prop.getProperty("deliveryDistancesUrl");
		Assert.assertNotNull("deliveryDistancesUrl is missing in config", deliveryDistancesUrl);
		String fullDeliveryDistancesUrl = baseUrl + deliveryDistancesUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openDeliveryDistancesPage(fullDeliveryDistancesUrl);
		Assert.assertTrue("Package Restriction page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/DeliveryDistances"));
		deliveryPage.addDeliveryDistance();
		System.out.println("User should be able to view and add Delivery Distances in Delivery Module test");
		Hooks.scenario.log("User should be able to view and add Delivery Distances in Delivery Module test");

	}

	@And("the user should be able to view and edit Delivery Distances in Delivery Module test")
	public void userShouldBeAbleToViewAndEditDeliveryDistancesInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliveryDistancesUrl = Hooks.prop.getProperty("deliveryDistancesUrl");
		Assert.assertNotNull("deliveryDistancesUrl is missing in config", deliveryDistancesUrl);
		String fullDeliveryDistancesUrl = baseUrl + deliveryDistancesUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openDeliveryDistancesPage(fullDeliveryDistancesUrl);
		Assert.assertTrue("Package Restriction page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/DeliveryDistances"));
		deliveryPage.viewAndEditDeliveryDistances();
		System.out.println("User should be able to view and edit Delivery Distances in Delivery Module test");
		Hooks.scenario.log("User should be able to view and edit Delivery Distances in Delivery Module test");

	}

	@And("the user should be able to view and delete Delivery Distances in Delivery Module test")
	public void userShouldBeAbleToViewAndDeleteDeliveryDistancesInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliveryDistancesUrl = Hooks.prop.getProperty("deliveryDistancesUrl");
		Assert.assertNotNull("deliveryDistancesUrl is missing in config", deliveryDistancesUrl);
		String fullDeliveryDistancesUrl = baseUrl + deliveryDistancesUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openDeliveryDistancesPage(fullDeliveryDistancesUrl);
		Assert.assertTrue("Package Restriction page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/DeliveryDistances"));
		deliveryPage.viewAndDeleteDeliveryDistance();
		System.out.println("User should be able to view and delete Delivery Distances in Delivery Module test");
		Hooks.scenario.log("User should be able to view and delete Delivery Distances in Delivery Module test");

	}

	@And("the user should not be able to edit or delete Delivery Distances in Delivery Module test")
	public void userShouldNotBeAbleToEditOrDeleteLogisticCompanyInDeliveryModule() {
		deliveryPage.verifyUserCannotEditOrDeleteDeliveryDistances();
		System.out.println("User should not be able to edit or delete Delivery Distances in Delivery Module test");
		Hooks.scenario.log("User should not be able to edit or delete Delivery Distances in Delivery Module test");

	}

	@And("the user should not be able to add or delete Delivery Distances in Delivery Module test")
	public void userShouldNotBeAbleToAddOrDeleteDeliveryDistancesInDeliveryModule() {
		deliveryPage.verifyUserCannotAddOrDeleteDeliveryDistances();
		System.out.println("User should not be able to add or delete Delivery Distances in Delivery Module test");
		Hooks.scenario.log("User should not be able to add or delete Delivery Distances in Delivery Module test");

	}

	@And("the user should not be able to add or edit Delivery Distances in Delivery Module test")
	public void userShouldNotBeAbleToAddOrEditDeliveryDistancesInDeliveryModule() {
		deliveryPage.verifyUserCannotAddOrEditDeliveryDistances();
		System.out.println("User should not be able to add or edit Delivery Distances in Delivery Module test");
		Hooks.scenario.log("User should not be able to add or edit Delivery Distances in Delivery Module test");

	}

	// Package Restriction
	@And("I create a profile with View and Add access to Delivery Module Package Restriction test")
	public void createProfileWithViewAndAddAccessToDeliveryModulePackageRestriction() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createProfileWithViewAndAddPackageRestrictionAccess();
		deliveryPage.clickSubmitButton();
		System.out.println("I create a profile with View and Add access to Delivery Module Package Restriction test");
		Hooks.scenario.log("I create a profile with View and Add access to Delivery Module Package Restriction test");

	}

	@And("the user should be able to view and delete Package Restriction Plan in Delivery Module test")
	public void userShouldBeAbleToViewAndDeletePackageRestrictionPlanInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String packageRestrictionUrl = Hooks.prop.getProperty("packageRestrictionUrl");
		Assert.assertNotNull("packageRestrictionUrl is missing in config", packageRestrictionUrl);
		String fullPackageRestrictionUrl = baseUrl + packageRestrictionUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openPackageRestrictionPage(fullPackageRestrictionUrl);
		Assert.assertTrue("Package Restriction page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PackageRestriction"));
		deliveryPage.deleteFirstPackageRestrictionPlan();
		System.out.println("User should be able to view and delete Package Restriction Plan in Delivery Module test");
		Hooks.scenario.log("User should be able to view and delete Package Restriction Plan in Delivery Module test");

	}

	@And("the user should be able to view and delete Package Restriction State in Delivery Module test")
	public void userShouldBeAbleToViewAndDeletePackageRestrictionStateInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String packageRestrictionUrl = Hooks.prop.getProperty("packageRestrictionUrl");
		Assert.assertNotNull("packageRestrictionUrl is missing in config", packageRestrictionUrl);
		String fullPackageRestrictionUrl = baseUrl + packageRestrictionUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openPackageRestrictionPage(fullPackageRestrictionUrl);
		Assert.assertTrue("Package Restriction page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PackageRestriction"));
		deliveryPage.deleteFirstPackageRestrictionState();
		System.out.println("User should be able to view and delete Package Restriction State in Delivery Module test");
		Hooks.scenario.log("User should be able to view and delete Package Restriction State in Delivery Module test");

	}

	@And("the user should be able to view and add Package Restriction in Delivery Module test")
	public void userShouldBeAbleToViewAndAddPackageRestrictionInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String packageRestrictionUrl = Hooks.prop.getProperty("packageRestrictionUrl");
		Assert.assertNotNull("packageRestrictionUrl is missing in config", packageRestrictionUrl);
		String fullPackageRestrictionUrl = baseUrl + packageRestrictionUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openPackageRestrictionPage(fullPackageRestrictionUrl);
		Assert.assertTrue("Package Restriction page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PackageRestriction"));
		deliveryPage.verifyUserCanViewAndAddPackageRestriction();
		System.out.println("User should be able to view and add Package Restriction in Delivery Module test");
		Hooks.scenario.log("User should be able to view and add Package Restriction in Delivery Module test");

	}

	@And("I create a profile with View and Delete Package Restriction State access to Delivery Module Package Restriction test")
	public void createProfileWithViewAndDeletePackageRestrictionStateAccessToDeliveryModule() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createProfileWithViewDeleteAccessToDeliveryPackageRestrictionState();
		deliveryPage.clickSubmitButton();
		System.out.println(
				"I create a profile with View and Delete Package Restriction State access to Delivery Module Package Restriction test");
		Hooks.scenario.log(
				"I create a profile with View and Delete Package Restriction State access to Delivery Module Package Restriction test");

	}

	@And("I create a profile with View and Delete Package Restriction Plan access to Delivery Module Package Restriction test")
	public void createProfileWithViewAndDeletePackageRestrictionPlanAccessToDeliveryModule() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createProfileWithViewDeleteAccessToDeliveryPackageRestrictionPlan();
		deliveryPage.clickSubmitButton();
		System.out.println(
				"I create a profile with View and Delete Package Restriction Plan access to Delivery Module Package Restriction test");
		Hooks.scenario.log(
				"I create a profile with View and Delete Package Restriction Plan access to Delivery Module Package Restriction test");

	}

	// Package Setting
	@And("I create a profile with Update access only to Delivery Module Package Settings test")
	public void createProfileWithUpdateOnlyAccessToDeliveryModulePackageSettings() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.configureUpdateOnlyAccessForDeliveryPackageSettings();
		deliveryPage.clickSubmitButton();
		System.out.println("I create a profile with Update access only to Delivery Module Package Settings test");
		Hooks.scenario.log("I create a profile with Update access only to Delivery Module Package Settings test");

	}

	@And("I create a profile with No access to Delivery Module Package Settings test")
	public void createProfileWithNoAccessToDeliveryModulePackageSettings() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createProfileWithoutPackageSettingsAccess();
		deliveryPage.clickSubmitButton();
		System.out.println("I create a profile with No access to Delivery Module Package Settings test");
		Hooks.scenario.log("I create a profile with No access to Delivery Module Package Settings test");

	}

	@And("the user should be able to update Package Settings in Delivery Module test")
	public void userShouldBeAbleToUpdatePackageSettingsInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String packageSettingsUrl = Hooks.prop.getProperty("packageSettingsUrl");
		Assert.assertNotNull("packageSettingsUrl is missing in config", packageSettingsUrl);
		String fullPackageSettingsUrl = baseUrl + packageSettingsUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openPackageSettingsPage(fullPackageSettingsUrl);
		Assert.assertTrue("Package Settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PackageSetting"));
		deliveryPage.theUserShouldBeAbleToUpdatePackageSettingsInDeliveryModule();
		System.out.println("User should be able to update Package Settings in Delivery Module test");
		Hooks.scenario.log("User should be able to update Package Settings in Delivery Module test");

	}

	@And("the user should not be able to view or update Package Settings in Delivery Module test")
	public void userShouldNotBeAbleToViewOrUpdateDeliveryPackageSettings() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String packageSettingsUrl = Hooks.prop.getProperty("packageSettingsUrl");
		Assert.assertNotNull("packageSettingsUrl is missing in config", packageSettingsUrl);
		String fullPackageSettingsUrl = baseUrl + packageSettingsUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openPackageSettingsPage(fullPackageSettingsUrl);
		Assert.assertTrue("Package Settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PackageSetting"));
		deliveryPage.userCannotViewOrUpdateDeliveryPackageSettings();
		System.out.println("User should not be able to view or update Package Settings in Delivery Module test");
		Hooks.scenario.log("User should not be able to view or update Package Settings in Delivery Module test");

	}

	// General
	@And("the user should be able to view General Audit View settings in Delivery Module test")
	public void userShouldBeAbleToViewGeneralAuditViewSettingsInDeliveryModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliveryPageUrl = Hooks.prop.getProperty("deliveryPageUrl");
		Assert.assertNotNull("deliveryPageUrl is missing in config", deliveryPageUrl);
		String fullDeliveryPageUrl = baseUrl + deliveryPageUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openDeliveryPackagesPage(fullDeliveryPageUrl);
		Assert.assertTrue("Delivery Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Packages"));
		deliveryPage.verifyGeneralAuditViewColumns();
		System.out.println("User should be able to view General Audit View settings in Delivery Module test");
		Hooks.scenario.log("User should be able to view General Audit View settings in Delivery Module test");

	}

	@And("the user should not be able to view General Audit View settings in Delivery Module test")
	public void userShouldNotBeAbleToViewGeneralAuditViewSettingsInDeliveryModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliveryPageUrl = Hooks.prop.getProperty("deliveryPageUrl");
		Assert.assertNotNull("deliveryPageUrl is missing in config", deliveryPageUrl);
		String fullDeliveryPageUrl = baseUrl + deliveryPageUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openDeliveryPackagesPage(fullDeliveryPageUrl);
		Assert.assertTrue("Delivery Packages page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Delivery/Home/Packages"));
		deliveryPage.verifyGeneralAuditViewColumnsAreNotVisible();
		System.out.println("User should not be able to view General Audit View settings in Delivery Module test");
		Hooks.scenario.log("User should not be able to view General Audit View settings in Delivery Module test");

	}

	@And("I create a profile with View access only to Delivery Module General Audit View test")
	public void profileHasViewOnlyAccessToDeliveryModuleGeneralAuditView() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createViewOnlyDeliveryAuditProfile();
		deliveryPage.clickSubmitButton();
		System.out.println("I create a profile with View access only to Delivery Module General Audit View test");
		Hooks.scenario.log("I create a profile with View access only to Delivery Module General Audit View test");

	}

	@And("I create a profile with No access to Delivery Module General Audit View test")
	public void createProfileWithNoAccessToDeliveryModuleGeneralAuditView() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName();
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createNoAccessProfileForDeliveryGeneralAuditView();
		deliveryPage.clickSubmitButton();
		System.out.println("I create a profile with No access to Delivery Module General Audit View test");
		Hooks.scenario.log("I create a profile with No access to Delivery Module General Audit View test");

	}

	// Profile
	@And("the Delivery user should be able to view Profiles")
	public void deliveryUserShouldBeAbleToViewProfiles() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliveryProfilesUrl = Hooks.prop.getProperty("profilesPageUrl");
		Assert.assertNotNull("profilesPageUrl is missing in config", deliveryProfilesUrl);
		String fullProfilesUrl = baseUrl + deliveryProfilesUrl;
		deliveryPage = new deliverypage(Hooks.driver);
		deliveryPage.openDeliveryProfilesPage(fullProfilesUrl);
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Profiles"));
		System.out.println("The Delivery user should be able to view Profiles");
		Hooks.scenario.log("The Delivery user should be able to view Profiles");

	}

	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
