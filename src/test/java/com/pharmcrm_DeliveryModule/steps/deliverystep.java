package com.pharmcrm_DeliveryModule.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.pharmcrm_DeliveryModule.pages.deliverypage;
import com.pharmcrm_PatientModule.pages.patientpage;

import hooks.Hooks;
import io.cucumber.java.en.And;

public class deliverystep {

	private deliverypage deliveryPage;

	// Package Plan Restriction

	@And("the user should be able to update Package Plan Restriction in Delivery Module test")
	public void verifyUserCanUpdatePackagePlanRestriction() {

		deliveryPage.verifyUserCanUpdatePackagePlanRestriction();

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

		Hooks.scenario.log("Delivery user is on the Packages page");

		deliveryPage.verifyUserCannotAccessPackagePlanRestriction();

	}

	@And("I create a profile without access to Delivery Module Package Plan Restriction test")
	public void createProfileWithoutPackagePlanRestrictionAccess() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createNoPackagePlanRestrictionAccessProfile();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
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

		Hooks.scenario.log("Delivery user is on the Packages page");

		deliveryPage.verifyUserCanViewPackagePlanRestriction();

	}

	@And("I create a profile with View and Update access to Delivery Module Package Plan Restriction test")
	public void createProfileWithViewAndUpdateAccessToPackagePlanRestriction() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createPackagePlanRestrictionViewUpdateProfile();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	// Delivery Setting
	@And("I create a profile without access to Delivery Module Delivery Setting test")
	public void createProfileWithoutDeliverySettingsAccess() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createNoDeliverySettingsAccessProfile();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Update access to Delivery Module Delivery Setting test")
	public void createProfileWithViewAndUpdateAccessToDeliverySettings() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createDeliverySettingsViewUpdateProfile();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to update Delivery Setting in Delivery Module test")
	public void verifyUserCanUpdateDeliverySetting() {
		deliveryPage.verifyUserCanUpdateDeliverySetting();

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

		Hooks.scenario.log("Delivery user is on the Delivery Settings page");

		deliveryPage.verifyUserCannotAccessDeliverySetting();

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

		Hooks.scenario.log("Delivery user is on the Delivery Settings page");

	}
	// Package

	@And("the user should be able to sync Logistic Tracking History in Delivery Module test")
	public void verifyUserCanSyncLogisticTrackingHistory() {

		deliveryPage.verifyUserCanSyncLogisticTrackingHistory();
	}

	@And("the user should be able to print Pickup Package in Delivery Module test")
	public void verifyUserCanPrintPickupPackage() {

		deliveryPage.verifyUserCanPrintPickupPackage();
	}

	@And("the user should be able to share Package in Delivery Module test")
	public void verifyUserCanSharePackage() {

		deliveryPage.verifySharePackage();
	}

	@And("the user should be able to print Package in Delivery Module test")
	public void verifyUserCanPrintPackage() {

		deliveryPage.verifyUserCanPrintPackage();
	}

	@And("the user should be able to generate Package Invoice in Delivery Module test")
	public void verifyUserCanGeneratePackageInvoice() {

		deliveryPage.verifyGeneratePackageInvoice();
	}

	@And("the user should be able to download Attestation Documents in Delivery Module test")
	public void verifyUserCanDownloadAttestationDocuments() {

		deliveryPage.verifyDownloadAttestationDocuments();
	}

	@And("the user should be able to send Package for Signature in Delivery Module test")
	public void verifyUserCanSendPackageForSignature() {

		deliveryPage.verifySendPackageForSignature();
	}

	@And("the user should be able to print Signature in Delivery Module test")
	public void verifyUserCanPrintSignature() {

		deliveryPage.verifyPrintSignature();
	}

	@And("the user should be able to download Signature in Delivery Module test")
	public void verifyUserCanDownloadSignature() {

		deliveryPage.verifyDownloadSignature();
	}

	@And("the user should be able to upload Signature in Delivery Module test")
	public void verifyUserCanUploadSignature() {

		deliveryPage.verifyUploadSignature();
	}

	@And("the user should be able to download Reference Documents in Delivery Module test")
	public void verifyUserCanDownloadReferenceDocuments() {

		deliveryPage.verifyUserCanDownloadReferenceDocuments();
	}

	@And("the user should be able to update Delivery Status in Delivery Module test")
	public void verifyUserCanUpdateDeliveryStatus() {

		deliveryPage.verifyUserCanUpdateDeliveryStatus();
	}

	@And("the user should be able to generate Package Label in Delivery Module test")
	public void verifyUserCanGeneratePackageLabel() {

		deliveryPage.verifyUserCanGeneratePackageLabel();
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

		Hooks.scenario.log("Delivery user is on the Packages page");

		deliveryPage.verifyUserCanAccessPackageDetail();
	}

	@And("I create a profile with Full Access for Package to Delivery Module Package test")
	public void createProfileWithFullPackageAccess() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createFullAccessProfileForDeliveryPackage();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to edit or delete Package in Delivery Module test")
	public void userCannotEditDeletePackage() {

		deliveryPage.checkCannotEditDeletePackage();
	}

	@And("the user should not be able to add or delete Package in Delivery Module test")
	public void verifyUserCannotAddOrDeletePackage() {

		deliveryPage.verifyUserCannotAddOrDeletePackage();
	}

	@And("the user should not be able to add or edit Package in Delivery Module test")
	public void verifyUserCannotAddOrEditPackage() {

		deliveryPage.verifyUserCannotAddOrEditPackage();
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

		Hooks.scenario.log("Delivery user is on the Packages page");

		deliveryPage.verifyUserCanViewAndDeletePackage();
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

		Hooks.scenario.log("Delivery user is on the Packages page");

		deliveryPage.verifyUserCanViewAndEditPackage();
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

		Hooks.scenario.log("Delivery user is on the Packages page");

		deliveryPage.checkViewAddPackage();
	}

	@And("I create a profile with View and Delete access only to Delivery Module Package test")
	public void profileViewDelete() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createDeliveryVD();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Edit access only to Delivery Module Package test")
	public void createDeliveryProfileViewEdit() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createProfileVE();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Add access only to Delivery Module Package test")
	public void createProfileWithViewAndAddAccessForDeliveryModule() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createDeliveryProfile();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
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

		Hooks.scenario.log("Delivery user is on the Delivery Marker page");

		deliveryPage.validateViewDeleteDeliveryMarker();
	}

	@And("the user should not be able to add or delete Delivery Marker in Delivery Module test")
	public void verifyAddDeleteDeliveryMarkerDisabled() {

		deliveryPage.userCannotAddOrDeleteDeliveryMarker();
	}

	@And("the user should not be able to add or edit Delivery Marker in Delivery Module test")
	public void verifyAddEditDeliveryMarkerDisabled() {

		deliveryPage.validateNoAddEditDeliveryMarkerAccess();
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

		Hooks.scenario.log("Delivery user is on the Delivery Marker page");

		deliveryPage.validateViewEditDeliveryMarker();
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

		Hooks.scenario.log("Delivery user is on the Delivery Marker page");

		deliveryPage.userCanViewAndAddDeliveryMarker();
	}

	@And("the user should not be able to edit or delete Delivery Marker in Delivery Module test")
	public void verifyEditAndDeleteDeliveryMarkerDisabled() {

		deliveryPage.userCannotEditOrDeleteDeliveryMarker();
	}

	@And("I create a profile with View and Add access only to Delivery Module Delivery Marker test")
	public void createProfileWithViewAndAddAccess() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createDMViewAddProfile();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Edit access only to Delivery Module Delivery Marker test")
	public void createProfileWithViewAndEditDeliveryMarker() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createDeliveryMarkerViewAndEditAccess();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Delete access only to Delivery Module Delivery Marker test")
	public void createProfileWithViewAndDeleteDeliveryMarker() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createDeliveryMarkerViewAndDeleteAccess();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	// Logistic Company
	@And("I create a profile with View and Edit access only to Delivery Module Logistic Company test")
	public void createProfileWithViewAndEditAccessToLogisticCompany() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createProfileWithViewEditAccessLogisticCompany();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Delete access only to Delivery Module Logistic Company test")
	public void createProfileWithViewAndDeleteAccessToLogisticCompany() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createProfileWithViewDeleteAccessLogisticCompany();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Add access only to Delivery Module Logistic Company test")
	public void createProfileWithViewAndAddAccessToLogisticCompany() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createProfileWithViewAddAccessLogisticCompany();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to edit or delete Logistic Company in Delivery Module test")
	public void userCannotEditOrDeleteLogisticCompany() {

		deliveryPage.verifyUserCannotEditOrDeleteLogisticCompany();
	}

	@And("the user should not be able to add or delete Logistic Company in Delivery Module test")
	public void userShouldNotBeAbleToAddOrDeleteLogisticCompanyInDeliveryModule() {

		deliveryPage.verifyUserCannotAddOrDeleteLogisticCompany();
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

		Hooks.scenario.log("Delivery user is on the Logistic Company page");

		deliveryPage.userCanViewAndAddLogisticCompany();
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

		Hooks.scenario.log("Delivery user is on the Logistic Company page");

		deliveryPage.userCanViewAndEditLogisticCompany();
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

		Hooks.scenario.log("Delivery user is on the Logistic Company page");

		deliveryPage.userCanViewAndDeleteLogisticCompany();
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

		Hooks.scenario.log("Delivery user is on the Logistic Company page");

		deliveryPage.verifyUserCannotAddOrEditLogisticCompany();
	}
	// Delivery Distances

	@And("I create a profile with View and Delete access only to Delivery Module Delivery Distances test")
	public void createProfileWithViewAndDeleteAccessToDeliveryDistances() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createProfileWithViewDeleteAccessDeliveryDistances();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Edit access only to Delivery Module Delivery Distances test")
	public void createProfileWithViewAndEditAccessToDeliveryDistances() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createDeliveryDistancesViewEditProfile();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Add access only to Delivery Module Delivery Distances test")
	public void createProfileWithViewAndAddAccessToDeliveryDistances() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createProfileWithViewAddAccessDeliveryLogisticCompany();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
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

		Hooks.scenario.log("Delivery user is on the Package Restriction page");

		deliveryPage.addDeliveryDistance();
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

		Hooks.scenario.log("Delivery user is on the Package Restriction page");

		deliveryPage.viewAndEditDeliveryDistances();
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

		Hooks.scenario.log("Delivery user is on the Package Restriction page");

		deliveryPage.viewAndDeleteDeliveryDistance();
	}

	@And("the user should not be able to edit or delete Delivery Distances in Delivery Module test")
	public void userShouldNotBeAbleToEditOrDeleteLogisticCompanyInDeliveryModule() {

		deliveryPage.verifyUserCannotEditOrDeleteDeliveryDistances();
	}

	@And("the user should not be able to add or delete Delivery Distances in Delivery Module test")
	public void userShouldNotBeAbleToAddOrDeleteDeliveryDistancesInDeliveryModule() {

		deliveryPage.verifyUserCannotAddOrDeleteDeliveryDistances();
	}

	@And("the user should not be able to add or edit Delivery Distances in Delivery Module test")
	public void userShouldNotBeAbleToAddOrEditDeliveryDistancesInDeliveryModule() {

		deliveryPage.verifyUserCannotAddOrEditDeliveryDistances();
	}

	// Package Restriction
	@And("I create a profile with View and Add access to Delivery Module Package Restriction test")
	public void createProfileWithViewAndAddAccessToDeliveryModulePackageRestriction() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createProfileWithViewAndAddPackageRestrictionAccess();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
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

		Hooks.scenario.log("Delivery user is on the Package Restriction page");

		deliveryPage.deleteFirstPackageRestrictionPlan();
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

		Hooks.scenario.log("Delivery user is on the Package Restriction page");

		deliveryPage.deleteFirstPackageRestrictionState();
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

		Hooks.scenario.log("Delivery user is on the Package Restriction page");

		deliveryPage.verifyUserCanViewAndAddPackageRestriction();
	}

	@And("I create a profile with View and Delete Package Restriction State access to Delivery Module Package Restriction test")
	public void createProfileWithViewAndDeletePackageRestrictionStateAccessToDeliveryModule() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createProfileWithViewDeleteAccessToDeliveryPackageRestrictionState();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Delete Package Restriction Plan access to Delivery Module Package Restriction test")
	public void createProfileWithViewAndDeletePackageRestrictionPlanAccessToDeliveryModule() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createProfileWithViewDeleteAccessToDeliveryPackageRestrictionPlan();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	// Package Setting
	@And("I create a profile with Update access only to Delivery Module Package Settings test")
	public void createProfileWithUpdateOnlyAccessToDeliveryModulePackageSettings() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.configureUpdateOnlyAccessForDeliveryPackageSettings();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with No access to Delivery Module Package Settings test")
	public void createProfileWithNoAccessToDeliveryModulePackageSettings() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createProfileWithoutPackageSettingsAccess();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
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

		Hooks.scenario.log("Delivery user is on the Package Settings page");

		deliveryPage.theUserShouldBeAbleToUpdatePackageSettingsInDeliveryModule();
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

		Hooks.scenario.log("Delivery user is on the Package Settings page");

		deliveryPage.userCannotViewOrUpdateDeliveryPackageSettings();
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

		Hooks.scenario.log("Delivery user is on the Delivery Packages page");

		deliveryPage.verifyGeneralAuditViewColumns();
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

		Hooks.scenario.log("Delivery user is on the Delivery Packages page");

		deliveryPage.verifyGeneralAuditViewColumnsAreNotVisible();
	}

	@And("I create a profile with View access only to Delivery Module General Audit View test")
	public void profileHasViewOnlyAccessToDeliveryModuleGeneralAuditView() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createViewOnlyDeliveryAuditProfile();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with No access to Delivery Module General Audit View test")
	public void createProfileWithNoAccessToDeliveryModuleGeneralAuditView() {
		deliveryPage.clickFilterButton();
		deliveryPage.enterProfileName("Sunil");
		deliveryPage.clickSearchButton();
		deliveryPage.clickActionMenu();
		deliveryPage.clickEditButton();
		deliveryPage.createNoAccessProfileForDeliveryGeneralAuditView();
		deliveryPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
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

		Hooks.scenario.log("Delivery user is on the Profiles page");
	}

	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
