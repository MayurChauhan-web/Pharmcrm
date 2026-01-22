package com.pharmcrm_ClinicalModule.steps;

import org.junit.Assert;

import com.pharmcrm_ClinicalModule.pages.clinicalpage;
import com.pharmcrm_DeliveryModule.pages.deliverypage;

import hooks.Hooks;
import io.cucumber.java.en.And;

public class clinicalstep {

	private clinicalpage clinicalPage;

	// Community Resource

	@And("I create a profile with Delete access only to Clinical Module Community Resource test")
	public void createClinicalCommunityResourceProfileWithDeleteAccess() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createDeleteOnlyCommunityResourceProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to add or edit Community Resource in Clinical Module test")
	public void verifyUserCannotAddOrEditCommunityResourceTest() {

		clinicalPage.cannotAddOrEditCommunityResourceTest();

	}

	@And("the user should be able to delete Community Resource in Clinical Module test")
	public void verifyUserCanDeleteCommunityResourceInClinicalModule() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String communityResourceUrl = Hooks.prop.getProperty("communityResourceUrl");
		Assert.assertNotNull("communityResourceUrl is missing in config", communityResourceUrl);

		String fullCommunityResourceUrl = baseUrl + communityResourceUrl;

		clinicalPage = new clinicalpage(Hooks.driver);

		Hooks.driver.get(fullCommunityResourceUrl);

		Assert.assertTrue("Community Resource page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/CommunityResources"));

		Hooks.scenario.log("User is on the Community Resource page");

		clinicalPage.verifyDeleteCommunityResourceAccess();

	}

	@And("the user should be able to add Community Resource in Clinical Module test")
	public void verifyUserCanAddCommunityResource() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String communityResourceUrl = Hooks.prop.getProperty("communityResourceUrl");
		Assert.assertNotNull("communityResourceUrl is missing in config", communityResourceUrl);

		String fullCommunityResourceUrl = baseUrl + communityResourceUrl;

		clinicalPage = new clinicalpage(Hooks.driver);

		Hooks.driver.get(fullCommunityResourceUrl);

		Assert.assertTrue("Community Resource page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/CommunityResources"));

		Hooks.scenario.log("User is on the Community Resource page");

		clinicalPage.canAddCommunityResource();

	}

	@And("the user should be able to edit Community Resource in Clinical Module test")
	public void editCommunityResourceTest() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String communityResourceUrl = Hooks.prop.getProperty("communityResourceUrl");
		Assert.assertNotNull("communityResourceUrl is missing in config", communityResourceUrl);

		String fullCommunityResourceUrl = baseUrl + communityResourceUrl;

		clinicalPage = new clinicalpage(Hooks.driver);

		Hooks.driver.get(fullCommunityResourceUrl);

		Assert.assertTrue("Community Resource page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/CommunityResources"));

		Hooks.scenario.log("User is on the Community Resource page");

		clinicalPage.editCommunityResourceTest();

	}

	@And("the user should not be able to add or delete Community Resource in Clinical Module test")
	public void cannotAddOrDeleteCommunityResourceTest() {

		clinicalPage.verifyUserCannotAddOrDeleteCommunityResource();

	}

	@And("the user should not be able to edit or delete Community Resource in Clinical Module test")
	public void verifyUserCannotEditOrDeleteCommunityResource() {

		clinicalPage.verifyUserCannotEditOrDeleteGoalsOfTreatment();

	}

	@And("I create a profile with Edit access only to Clinical Module Community Resource test")
	public void createProfileWithEditAccessOnlyToClinicalCommunityResourceTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createEditOnlyClinicalCommunityResourceProfileTest();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Add access only to Clinical Module Community Resource test")
	public void createProfileWithAddAccessForClinicalCommunityResource() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createCommunityResourceAddProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	// Barriers

	@And("I create a profile with Delete access only to Clinical Module Barriers test")
	public void createProfileWithDeleteAccessForClinicalBarriers() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalBarriersDeleteProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Edit access only to Clinical Module Barriers test")
	public void createProfileWithEditAccessForClinicalBarriers() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalBarriersEditProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Add access only to Clinical Module Barriers test")
	public void createProfileWithAddAccessForClinicalBarriers() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalBarriersAddProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to add Barriers in Clinical Module test")
	public void verifyUserCanAddBarriers() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String barriersUrl = Hooks.prop.getProperty("barriersUrl");
		Assert.assertNotNull("barriersUrl is missing in config", barriersUrl);

		String fullBarriersUrl = baseUrl + barriersUrl;

		clinicalPage = new clinicalpage(Hooks.driver);

		Hooks.driver.get(fullBarriersUrl);

		Assert.assertTrue("Barriers page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Barriers"));

		Hooks.scenario.log("User is on the Barriers page");

		clinicalPage.canAddBarriers();

	}

	@And("the user should be able to edit Barriers in Clinical Module test")
	public void verifyUserCanEditBarriers() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String barriersUrl = Hooks.prop.getProperty("barriersUrl");
		Assert.assertNotNull("barriersUrl is missing in config", barriersUrl);

		String fullBarriersUrl = baseUrl + barriersUrl;

		clinicalPage = new clinicalpage(Hooks.driver);

		Hooks.driver.get(fullBarriersUrl);

		Assert.assertTrue("Barriers page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Barriers"));

		Hooks.scenario.log("User is on the Barriers page");

		clinicalPage.editBarrier();

	}

	@And("the user should be able to delete Barriers in Clinical Module test")
	public void verifyUserCanDeleteBarriers() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String barriersUrl = Hooks.prop.getProperty("barriersUrl");
		Assert.assertNotNull("barriersUrl is missing in config", barriersUrl);

		String fullBarriersUrl = baseUrl + barriersUrl;

		clinicalPage = new clinicalpage(Hooks.driver);

		Hooks.driver.get(fullBarriersUrl);

		Assert.assertTrue("Barriers page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Barriers"));

		Hooks.scenario.log("User is on the Barriers page");

		clinicalPage.canDeleteBarriers();

	}

	@And("the user should not be able to add or edit Barriers in Clinical Module test")
	public void verifyUserCannotAddOrEditBarriers() {

		clinicalPage.cannotAddOrEditBarriers();

	}

	@And("the user should not be able to add or delete Barriers in Clinical Module test")
	public void verifyUserCannotAddOrDeleteBarriers() {

		clinicalPage.cannotAddOrDeleteBarriers();

	}

	@And("the user should not be able to edit or delete Barriers in Clinical Module test")
	public void verifyUserCannotEditOrDeleteBarriers() {

		clinicalPage.cannotEditOrDeleteBarriers();

	}

	// Goals Of Treatment
	@And("I create a profile with View and Delete access only to Clinical Module Goals Of Treatment test")
	public void createProfileWithViewAndDeleteAccessForClinicalGoalsOfTreatment() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalGoalsOfTreatmentViewDeleteProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Edit access only to Clinical Module Goals Of Treatment test")
	public void createProfileWithViewAndEditAccessForClinicalGoalsOfTreatment() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalGoalsOfTreatmentViewEditProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Add access only to Clinical Module Goals Of Treatment test")
	public void createProfileWithViewAndAddAccessForClinicalGoalsOfTreatment() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalGoalsOfTreatmentViewAddProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to view and add Goals Of Treatment in Clinical Module test")
	public void verifyUserCanViewAndAddGoalsOfTreatment() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String goalsOfTreatmentUrl = Hooks.prop.getProperty("goalsOfTreatmentUrl");
		Assert.assertNotNull("goalsOfTreatmentUrl is missing in config", goalsOfTreatmentUrl);

		String fullGoalsOfTreatmentUrl = baseUrl + goalsOfTreatmentUrl;

		clinicalPage = new clinicalpage(Hooks.driver);

		Hooks.driver.get(fullGoalsOfTreatmentUrl);

		Assert.assertTrue("Goals Of Treatment page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/GoalsOfTreatments"));

		Hooks.scenario.log("User is on the Goals Of Treatment page");

		clinicalPage.canViewAndAddGoalsOfTreatment();

	}

	@And("the user should be able to view and edit Goals Of Treatment in Clinical Module test")
	public void verifyUserCanViewAndEditGoalsOfTreatment() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String goalsOfTreatmentUrl = Hooks.prop.getProperty("goalsOfTreatmentUrl");
		Assert.assertNotNull("goalsOfTreatmentUrl is missing in config", goalsOfTreatmentUrl);

		String fullGoalsOfTreatmentUrl = baseUrl + goalsOfTreatmentUrl;

		clinicalPage = new clinicalpage(Hooks.driver);

		Hooks.driver.get(fullGoalsOfTreatmentUrl);

		Assert.assertTrue("Goals Of Treatment page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/GoalsOfTreatments"));

		Hooks.scenario.log("User is on the Goals Of Treatment page");

		clinicalPage.editGoalsOfTreatment();

	}

	@And("the user should be able to view and delete Goals Of Treatment in Clinical Module test")
	public void verifyUserCanViewAndDeleteGoalsOfTreatment() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String goalsOfTreatmentUrl = Hooks.prop.getProperty("goalsOfTreatmentUrl");
		Assert.assertNotNull("goalsOfTreatmentUrl is missing in config", goalsOfTreatmentUrl);

		String fullGoalsOfTreatmentUrl = baseUrl + goalsOfTreatmentUrl;

		clinicalPage = new clinicalpage(Hooks.driver);

		Hooks.driver.get(fullGoalsOfTreatmentUrl);

		Assert.assertTrue("Goals Of Treatment page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/GoalsOfTreatments"));

		Hooks.scenario.log("User is on the Goals Of Treatment page");

		clinicalPage.canViewAndDeleteGoalsOfTreatment();

	}

	@And("the user should not be able to add or edit Goals Of Treatment in Clinical Module test")
	public void verifyUserCannotAddOrEditGoalsOfTreatment() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String goalsOfTreatmentUrl = Hooks.prop.getProperty("goalsOfTreatmentUrl");
		Assert.assertNotNull("goalsOfTreatmentUrl is missing in config", goalsOfTreatmentUrl);

		String fullGoalsOfTreatmentUrl = baseUrl + goalsOfTreatmentUrl;

		clinicalPage = new clinicalpage(Hooks.driver);

		Hooks.driver.get(fullGoalsOfTreatmentUrl);

		Assert.assertTrue("Goals Of Treatment page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/GoalsOfTreatments"));

		Hooks.scenario.log("User is on the Goals Of Treatment page");

		clinicalPage.cannotAddOrEditGoalsOfTreatment();

	}

	@And("the user should not be able to add or delete Goals Of Treatment in Clinical Module test")
	public void verifyUserCannotAddOrDeleteGoalsOfTreatment() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String goalsOfTreatmentUrl = Hooks.prop.getProperty("goalsOfTreatmentUrl");
		Assert.assertNotNull("goalsOfTreatmentUrl is missing in config", goalsOfTreatmentUrl);

		String fullGoalsOfTreatmentUrl = baseUrl + goalsOfTreatmentUrl;

		clinicalPage = new clinicalpage(Hooks.driver);

		Hooks.driver.get(fullGoalsOfTreatmentUrl);

		Assert.assertTrue("Goals Of Treatment page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/GoalsOfTreatments"));

		Hooks.scenario.log("User is on the Goals Of Treatment page");

		clinicalPage.cannotAddOrDeleteGoalsOfTreatment();

	}

	@And("the user should not be able to edit or delete Goals Of Treatment in Clinical Module test")
	public void verifyUserCannotEditOrDeleteGoalsOfTreatment() {

		clinicalPage.cannotEditOrDeleteGoalsOfTreatment();

	}
	// Prior Authorization Types

	@And("I create a profile with View and Delete access only to Clinical Module Prior Authorization Types test")
	public void createProfileWithViewAndDeleteAccessForClinicalPriorAuthorizationTypes() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalPriorAuthTypesViewDeleteProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Edit access only to Clinical Module Prior Authorization Types test")
	public void createProfileWithViewAndEditAccessForClinicalPriorAuthorizationTypes() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalPriorAuthTypesViewEditProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Add access only to Clinical Module Prior Authorization Types test")
	public void createProfileViewAddAccessForPriorAuthorizationTypes() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createViewAddProfileForPriorAuthTypes();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to view and add Prior Authorization Types in Clinical Module test")
	public void verifyUserCanViewAndAddPriorAuthTypes() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String priorAuthTypesUrl = Hooks.prop.getProperty("priorAuthTypesUrl");

		Assert.assertNotNull("priorAuthTypesUrl is missing in config", priorAuthTypesUrl);

		String fullPriorAuthTypesUrl = baseUrl + priorAuthTypesUrl;

		clinicalPage = new clinicalpage(Hooks.driver);

		Hooks.driver.get(fullPriorAuthTypesUrl);

		Assert.assertTrue("Prior Authorization Types page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PriorAuthorizationTypes"));

		Hooks.scenario.log("User is on the Prior Authorization Types page");

		clinicalPage.addPriorAuthorizationType();
	}

	@And("the user should be able to view and edit Prior Authorization Types in Clinical Module test")
	public void verifyUserCanViewAndEditPriorAuthorizationTypes() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String priorAuthTypesUrl = Hooks.prop.getProperty("priorAuthTypesUrl");

		Assert.assertNotNull("priorAuthTypesUrl is missing in config", priorAuthTypesUrl);

		String fullPriorAuthTypesUrl = baseUrl + priorAuthTypesUrl;

		clinicalPage = new clinicalpage(Hooks.driver);

		Hooks.driver.get(fullPriorAuthTypesUrl);

		Assert.assertTrue("Prior Authorization Types page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PriorAuthorizationTypes"));

		Hooks.scenario.log("User is on the Prior Authorization Types page");

		clinicalPage.canViewAndEditPriorAuthorizationTypes();
	}

	@And("the user should be able to view and delete Prior Authorization Types in Clinical Module test")
	public void verifyUserCanViewAndDeletePriorAuthorizationTypes() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String priorAuthTypesUrl = Hooks.prop.getProperty("priorAuthTypesUrl");

		Assert.assertNotNull("priorAuthTypesUrl is missing in config", priorAuthTypesUrl);

		String fullPriorAuthTypesUrl = baseUrl + priorAuthTypesUrl;

		clinicalPage = new clinicalpage(Hooks.driver);

		Hooks.driver.get(fullPriorAuthTypesUrl);

		Assert.assertTrue("Prior Authorization Types page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PriorAuthorizationTypes"));

		Hooks.scenario.log("User is on the Prior Authorization Types page");

		clinicalPage.canViewAndDeletePriorAuthorizationTypes();
	}

	@And("the user should not be able to add or edit Prior Authorization Types in Clinical Module test")
	public void verifyUserCannotAddOrEditPriorAuthorizationTypes() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String priorAuthTypesUrl = Hooks.prop.getProperty("priorAuthTypesUrl");

		Assert.assertNotNull("priorAuthTypesUrl is missing in config", priorAuthTypesUrl);

		String fullPriorAuthTypesUrl = baseUrl + priorAuthTypesUrl;

		clinicalPage = new clinicalpage(Hooks.driver);

		Hooks.driver.get(fullPriorAuthTypesUrl);

		Assert.assertTrue("Prior Authorization Types page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PriorAuthorizationTypes"));

		Hooks.scenario.log("User is on the Prior Authorization Types page");

		clinicalPage.cannotAddOrEditPriorAuthorizationTypes();
	}

	@And("the user should not be able to add or delete Prior Authorization Types in Clinical Module test")
	public void verifyUserCannotAddOrDeletePriorAuthorizationTypes() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String priorAuthTypesUrl = Hooks.prop.getProperty("priorAuthTypesUrl");

		Assert.assertNotNull("priorAuthTypesUrl is missing in config", priorAuthTypesUrl);

		String fullPriorAuthTypesUrl = baseUrl + priorAuthTypesUrl;

		clinicalPage = new clinicalpage(Hooks.driver);

		Hooks.driver.get(fullPriorAuthTypesUrl);

		Assert.assertTrue("Prior Authorization Types page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PriorAuthorizationTypes"));

		Hooks.scenario.log("User is on the Prior Authorization Types page");

		clinicalPage.cannotAddOrDeletePriorAuthorizationTypes();
	}

	@And("the user should not be able to edit or delete Prior Authorization Type test")
	public void verifyUserCannotEditOrDeletePriorAuthorizationType() {

		clinicalPage.cannotEditOrDeletePriorAuthorizationType();
	}

	// Component Information

	@And("the user should not be able to update Component Information in Clinical Module test")
	public void verifyUserCannotUpdateClinicalComponent() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalComponentUrl = Hooks.prop.getProperty("clinicalComponentUrl");

		Assert.assertNotNull("clinicalComponentUrl is missing in config", clinicalComponentUrl);

		String fullClinicalComponentUrl = baseUrl + clinicalComponentUrl;

		clinicalPage = new clinicalpage(Hooks.driver);

		clinicalPage.openclinicalComponentPage(fullClinicalComponentUrl);

		Assert.assertTrue("Clinical Component Information page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ClinicalSOAPComponentSetting"));

		Hooks.scenario.log("User is on the Clinical Component Information page");

		clinicalPage.cannotUpdateClinicalComponent();
	}

	@And("the user should be able to update Component Information in Clinical Module test")
	public void verifyUserCanUpdateClinicalComponentInformation() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalComponentUrl = Hooks.prop.getProperty("clinicalComponentUrl");

		Assert.assertNotNull("clinicalComponentUrl is missing in config", clinicalComponentUrl);

		String fullClinicalComponentUrl = baseUrl + clinicalComponentUrl;

		clinicalPage = new clinicalpage(Hooks.driver);

		clinicalPage.openclinicalComponentPage(fullClinicalComponentUrl);

		Assert.assertTrue("Clinical Component Information page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ClinicalSOAPComponentSetting"));

		Hooks.scenario.log("User is on the Clinical Component Information page");

		clinicalPage.updateComponentInfoTest();
	}

	@And("I create a profile with Update access only to Clinical Module Component Information test")
	public void createProfileWithUpdateAccessOnlyForClinicalComponentInformation() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createUpdateOnlyProfileForClinicalComponent();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with No Update access to Clinical Module Component Information test")
	public void createProfileNoUpdateAccessForClinicalComponent() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createNoUpdateProfileForClinicalComponent();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	// Audit View
	@And("the user should be able to view General Audit View settings in Clinical Module test")
	public void verifyUserCanViewGeneralAuditViewSettingsInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");

		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);

		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;

		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);

		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));

		Hooks.scenario.log("User is on the Clinical Prior Authorizations page");

		clinicalPage.verifyGeneralAuditViewSettings();

	}

	@And("I create a profile with No access to Clinical Module General Audit View test")
	public void createProfileWithNoAccessToClinicalGeneralAuditView() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalProfileNoAuditView();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View access only to Clinical Module General Audit View test")
	public void createProfileWithViewAccessOnlyForClinicalModuleGeneralAuditViewTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createViewOnlyClinicalGeneralAuditProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to view General Audit View settings in Clinical Module test")
	public void verifyUserCannotViewGeneralAuditViewInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");

		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);

		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;

		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);

		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));

		Hooks.scenario.log("User is on the Clinical Prior Authorizations page");

		clinicalPage.cannotViewGeneralAuditViewInClinicalModule();

	}

	// Profile
	@And("the Clinical user should be able to view Profiles test")
	public void clinicalUserShouldBeAbleToViewProfiles() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalProfilesUrl = Hooks.prop.getProperty("profilesPageUrl");

		Assert.assertNotNull("profilesPageUrl is missing in config", clinicalProfilesUrl);

		String fullProfilesUrl = baseUrl + clinicalProfilesUrl;

		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalProfilesPage(fullProfilesUrl);

		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Profiles"));

		Hooks.scenario.log("Clinical user is on the Profiles page");
	}

}
