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
