package com.pharmcrm_DrugModule.steps;

import org.junit.Assert;

import com.pharmcrm_ClinicalModule.pages.clinicalpage;
import com.pharmcrm_DrugModule.pages.drugpage;

import hooks.Hooks;
import io.cucumber.java.en.And;

public class drugstep {

	private drugpage drugPage;

	// Program
	@And("the user should not be able to add Program test")
	public void userCannotAddProgramTest() {
		drugPage.verifyUserCannotAddProgramTest();

	}

	@And("the user should be able to view and delete Program test")
	public void userCanViewAndDeleteProgramTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.verifyUserCanViewAndDeleteProgramTest();

	}

	@And("I create a profile with View and Delete access to Program test")
	public void createProfileWithViewAndDeleteAccessToProgramTest() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.setupProfileWithProgramViewAndDeletePermissions();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to delete Program test")
	public void userCannotDeleteProgramTest() {
		drugPage.verifyUserCannotDeleteProgramTest();

	}

	@And("the user should be able to view and add Program test")
	public void verifyUserCanViewAndAddProgramTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.validateViewAndAddAccessForProgramTest();

	}

	@And("I create a profile with View and Add access to Program test")
	public void createProfileWithViewAndAddAccessToProgramTest() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.setupProfileWithProgramViewAndAddPermissions();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	// Disease State
	@And("the user should not be able to add Disease State test")
	public void userCannotAddDiseaseStateTest() {
		drugPage.verifyUserCannotAddDiseaseStateTest();

	}

	@And("the user should be able to view and delete Disease State test")
	public void userCanViewAndDeleteDiseaseStateTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.verifyUserCanViewAndDeleteDiseaseStateTest();

	}

	@And("I create a profile with View and Delete access to Disease State test")
	public void createProfileWithViewAndDeleteAccessToDiseaseStateTest() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createProfileWithDiseaseStateViewAndDeleteAccess();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to delete Disease State test")
	public void restrictDiseaseStateTestDeletePermission() {
		drugPage.setDiseaseStateTestNoDeletePermission();

	}

	@And("the user should be able to view and add Disease State test")
	public void grantDiseaseStateTestViewAndAddAccess() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.allowUserToViewAndAddDiseaseStateTest();

	}

	@And("I create a profile with View and Add access to Disease State test")
	public void createDiseaseStateTestViewAndAddProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDiseaseStateTestViewAddProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	// Drug Approved Indication
	@And("the user should not be able to add or edit Drug Approved Indication test")
	public void restrictDrugApprovedIndicationTestToViewAndDeleteOnly() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.allowOnlyViewAndDeleteForDrugApprovedIndicationTest();

	}

	@And("the user should be able to view and delete Drug Approved Indication test")
	public void grantDrugApprovedIndicationTestViewAndDeleteAccess() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.userShouldBeAbleToViewAndDeleteDrugApprovedIndication();

	}

	@And("I create a profile with View and Delete access to Drug Approved Indication test")
	public void createDrugApprovedIndicationTestViewAndDeleteProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugApprovedIndicationTestViewDeleteProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to add or delete Drug Approved Indication test")
	public void restrictDrugApprovedIndicationTestToViewAndEditOnly() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.allowOnlyViewAndEditForDrugApprovedIndicationTest();

	}

	@And("the user should be able to view and edit Drug Approved Indication test")
	public void grantDrugApprovedIndicationTestViewAndEditAccess() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.allowUserToViewAndEditDrugApprovedIndicationTest();

	}

	@And("I create a profile with View and Edit access to Drug Approved Indication test")
	public void createDrugApprovedIndicationTestViewAndEditProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugApprovedIndicationViewEditProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to edit or delete Drug Approved Indication test")
	public void restrictDrugApprovedIndicationTestToViewAndAddOnly() {
		drugPage.isDrugApprovedIndicationTestViewAddOnlyUser();

	}

	@And("I create a profile with View and Add access to Drug Approved Indication test")
	public void createDrugApprovedIndicationTestViewAndAddProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugApprovedIndicationTestViewAddProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to view and add Drug Approved Indication test")
	public void grantDrugApprovedIndicationTestViewAndAddAccess() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.canUserViewAndAddDrugApprovedIndicationTest();

	}

	// Drug Family
	@And("the user should not be able to add or edit Drug Family test")
	public void restrictDrugFamilyTestToViewAndDeleteOnly() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.denyDrugFamilyTestAddEdit();

	}

	@And("the user should be able to view and delete Drug Family test")
	public void assignDrugFamilyTestViewAndDeleteAccess() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.allowDrugFamilyTestViewDelete();

	}

	@And("I create a profile with View and Delete access to Drug Family test")
	public void createDrugFamilyTestViewAndDeleteProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugFamilyTestViewDeleteProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to add or delete Drug Family test")
	public void setDrugFamilyTestViewEditOnlyPermissions() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.denyDrugFamilyTestAddDelete();

	}

	@And("the user should be able to view and edit Drug Family test")
	public void grantDrugFamilyTestViewAndEditAccess() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.userShouldBeAbleToViewAndEditDrugFamily();

	}

	@And("I create a profile with View and Edit access to Drug Family test")
	public void createDrugFamilyTestViewAndEditProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugFamilyTestViewEditProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Add access to Drug Family test")
	public void createDrugFamilyTestViewAndAddProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugFamilyViewAddProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to edit or delete Drug Family test")
	public void restrictDrugFamilyTestToViewAndAddOnly() {
		drugPage.userShouldNotBeAbleToEditOrDeleteDrugFamily();

	}

	@And("the user should be able to view and add Drug Family test")
	public void grantDrugFamilyTestViewAndAddAccess() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.allowUserToViewAndAddDrugFamilyTest();

	}

	// Drug Therapeutic
	@And("the user should not be able to add or edit Drug Therapeutic test")
	public void restrictDrugTherapeuticTestToViewAndDeleteOnly() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.denyDrugTherapeuticTestAddEdit();

	}

	@And("the user should be able to view and delete Drug Therapeutic test")
	public void grantDrugTherapeuticTestViewAndDeleteAccess() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.allowDrugTherapeuticTestViewDelete();

	}

	@And("I create a profile with View and Delete access to Drug Therapeutic test")
	public void createDrugTherapeuticTestViewAndDeleteProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugTherapeuticTestViewDeleteProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to add or delete Drug Therapeutic test")
	public void restrictDrugTherapeuticTestToViewAndEditOnly() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.userShouldNotBeAbleToAddOrDeleteDrugTherapeutic();

	}

	@And("the user should be able to view and edit Drug Therapeutic test")
	public void grantDrugTherapeuticTestViewAndEditAccess() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.allowUserToViewAndEditDrugTherapeuticTest();

	}

	@And("I create a profile with View and Edit access to Drug Therapeutic test")
	public void createDrugTherapeuticTestViewAndEditProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugTherapeuticTestViewEditProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Add access to Drug Therapeutic test")
	public void createDrugTherapeuticTestViewAndAddProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugTherapeuticViewAddProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to edit or delete Drug Therapeutic test")
	public void restrictDrugTherapeuticTestToViewAndAddOnly() {
		drugPage.denyDrugTherapeuticTestEditDelete();

	}

	@And("the user should be able to view and add Drug Therapeutic test")
	public void grantDrugTherapeuticTestViewAndAddAccess() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.allowDrugTherapeuticTestViewAdd();

	}

	// ICD10
	@And("the user should not be able to add or edit ICD10 test")
	public void restrictICD10TestToViewAndDeleteOnly() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String icd10HomeUrl = Hooks.prop.getProperty("icd10HomeUrl");
		Assert.assertNotNull("icd10HomeUrl is missing in config", icd10HomeUrl);
		String fullIcd10HomeUrl = baseUrl + icd10HomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openICD10Page(fullIcd10HomeUrl);
		Assert.assertTrue("ICD10 Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/ICD10s"));
		Hooks.scenario.log("User is on the ICD10 Home page");
		drugPage.userShouldNotBeAbleToAddOrEditICD10();

	}

	@And("the user should be able to view and delete ICD10 test")
	public void grantICD10TestViewAndDeleteAccess() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String icd10HomeUrl = Hooks.prop.getProperty("icd10HomeUrl");
		Assert.assertNotNull("icd10HomeUrl is missing in config", icd10HomeUrl);
		String fullIcd10HomeUrl = baseUrl + icd10HomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openICD10Page(fullIcd10HomeUrl);
		Assert.assertTrue("ICD10 Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/ICD10s"));
		Hooks.scenario.log("User is on the ICD10 Home page");
		drugPage.allowUserToViewAndDeleteICD10Test();

	}

	@And("I create a profile with View and Delete access to ICD10 test")
	public void assignICD10TestViewAndDeletePermissions() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createICD10TestViewDeleteProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to add or delete ICD10 test")
	public void setICD10TestViewEditOnlyPermissions() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String icd10HomeUrl = Hooks.prop.getProperty("icd10HomeUrl");
		Assert.assertNotNull("icd10HomeUrl is missing in config", icd10HomeUrl);
		String fullIcd10HomeUrl = baseUrl + icd10HomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openICD10Page(fullIcd10HomeUrl);
		Assert.assertTrue("ICD10 Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/ICD10s"));
		Hooks.scenario.log("User is on the ICD10 Home page");
		drugPage.restrictICD10TestToViewAndEditOnly();

	}

	@And("the user should be able to view and edit ICD10 test")
	public void grantICD10TestViewAndEditAccess() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String icd10HomeUrl = Hooks.prop.getProperty("icd10HomeUrl");
		Assert.assertNotNull("icd10HomeUrl is missing in config", icd10HomeUrl);
		String fullIcd10HomeUrl = baseUrl + icd10HomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openICD10Page(fullIcd10HomeUrl);
		Assert.assertTrue("ICD10 Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/ICD10s"));
		Hooks.scenario.log("User is on the ICD10 Home page");
		drugPage.userShouldBeAbleToViewAndAddICD10();

	}

	@And("I create a profile with View and Edit access to ICD10 test")
	public void createICD10TestViewAndEditProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createICD10TestViewEditProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Add access to ICD10 test")
	public void createICD10TestViewAndAddProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createICD10TestAddAccessProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to add, edit, or delete ICD10 test")
	public void restrictICD10TestToViewOnly() {
		drugPage.userShouldNotBeAbleToModifyICD10();

	}

	@And("the user should not be able to edit or delete ICD10 test")
	public void restrictICD10TestToViewAndAddOnly() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String icd10HomeUrl = Hooks.prop.getProperty("icd10HomeUrl");
		Assert.assertNotNull("icd10HomeUrl is missing in config", icd10HomeUrl);
		String fullIcd10HomeUrl = baseUrl + icd10HomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openICD10Page(fullIcd10HomeUrl);
		Assert.assertTrue("ICD10 Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/ICD10s"));
		Hooks.scenario.log("User is on the ICD10 Home page");
		drugPage.allowOnlyViewAndAddForICD10Test();

	}

	@And("the user should be able to view and add ICD10 test")
	public void grantICD10TestViewAndAddAccess() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String icd10HomeUrl = Hooks.prop.getProperty("icd10HomeUrl");
		Assert.assertNotNull("icd10HomeUrl is missing in config", icd10HomeUrl);
		String fullIcd10HomeUrl = baseUrl + icd10HomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openICD10Page(fullIcd10HomeUrl);
		Assert.assertTrue("ICD10 Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/ICD10s"));
		Hooks.scenario.log("User is on the ICD10 Home page");
		drugPage.userShouldBeAbleToViewAndAddICD10();

	}

	@And("the user should be able to view ICD10 test")
	public void setICD10TestViewPermissions() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String icd10HomeUrl = Hooks.prop.getProperty("icd10HomeUrl");
		Assert.assertNotNull("icd10HomeUrl is missing in config", icd10HomeUrl);
		String fullIcd10HomeUrl = baseUrl + icd10HomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openICD10Page(fullIcd10HomeUrl);
		Assert.assertTrue("ICD10 Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/ICD10s"));
		Hooks.scenario.log("User is on the ICD10 Home page");

	}

	@And("I create a profile with View access only to ICD10 test")
	public void createICD10TestReadOnlyAccessProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createICD10TestViewOnlyProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	// Allergy
	@And("the user should not be able to add, edit, delete, download template, or upload excel for Allergy test")
	public void restrictAllergyTestToViewAndExportExcelOnly() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String allergyHomeUrl = Hooks.prop.getProperty("allergyHomeUrl");
		Assert.assertNotNull("allergyHomeUrl is missing in config", allergyHomeUrl);
		String fullAllergyHomeUrl = baseUrl + allergyHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openAllergiesPage(fullAllergyHomeUrl);
		Assert.assertTrue("Allergy Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/Allergies"));
		Hooks.scenario.log("User is on the Allergy Home page");
		drugPage.allowOnlyViewAndExportExcelForAllergyTest();

	}

	@And("the user should be able to view and export excel in Allergy test")
	public void grantAllergyTestViewAndExportExcelAccess() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String allergyHomeUrl = Hooks.prop.getProperty("allergyHomeUrl");
		Assert.assertNotNull("allergyHomeUrl is missing in config", allergyHomeUrl);
		String fullAllergyHomeUrl = baseUrl + allergyHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openAllergiesPage(fullAllergyHomeUrl);
		Assert.assertTrue("Allergy Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/Allergies"));
		Hooks.scenario.log("User is on the Allergy Home page");
		drugPage.allowUserToViewAndExportAllergyTestExcel();

	}

	@And("I create a profile with View and Export Excel access to Allergy test")
	public void createAllergyTestViewAndExportExcelProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createAllergyTestViewExportExcelProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Upload Excel access to Allergy test")
	public void createAllergyTestViewAndUploadExcelProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createAllergyTestViewUploadExcelProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to add, edit, delete, upload excel, or export excel for Allergy test")
	public void restrictAllergyTestToViewAndDownloadTemplateOnly() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String allergyHomeUrl = Hooks.prop.getProperty("allergyHomeUrl");
		Assert.assertNotNull("allergyHomeUrl is missing in config", allergyHomeUrl);
		String fullAllergyHomeUrl = baseUrl + allergyHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openAllergiesPage(fullAllergyHomeUrl);
		Assert.assertTrue("Allergy Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/Allergies"));
		Hooks.scenario.log("User is on the Allergy Home page");
		drugPage.applyAllergyTestLimitedAccessPolicy();

	}

	@And("the user should not be able to add, edit, delete, download template, or export excel for Allergy test")
	public void restrictAllergyTestToViewAndUploadExcelOnly() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String allergyHomeUrl = Hooks.prop.getProperty("allergyHomeUrl");
		Assert.assertNotNull("allergyHomeUrl is missing in config", allergyHomeUrl);
		String fullAllergyHomeUrl = baseUrl + allergyHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openAllergiesPage(fullAllergyHomeUrl);
		Assert.assertTrue("Allergy Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/Allergies"));
		Hooks.scenario.log("User is on the Allergy Home page");
		drugPage.allowOnlyViewAndUploadExcelForAllergyTest();

	}

	@And("the user should be able to view and upload excel in Allergy test")
	public void grantAllergyTestViewAndUploadExcelAccess() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String allergyHomeUrl = Hooks.prop.getProperty("allergyHomeUrl");
		Assert.assertNotNull("allergyHomeUrl is missing in config", allergyHomeUrl);
		String fullAllergyHomeUrl = baseUrl + allergyHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openAllergiesPage(fullAllergyHomeUrl);
		Assert.assertTrue("Allergy Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/Allergies"));
		Hooks.scenario.log("User is on the Allergy Home page");
		drugPage.allowUserToViewAndUploadAllergyTestExcel();

	}

	@And("the user should be able to view and download template in Allergy test")
	public void grantAllergyTestViewAndDownloadTemplateAccess() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String allergyHomeUrl = Hooks.prop.getProperty("allergyHomeUrl");
		Assert.assertNotNull("allergyHomeUrl is missing in config", allergyHomeUrl);
		String fullAllergyHomeUrl = baseUrl + allergyHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openAllergiesPage(fullAllergyHomeUrl);
		Assert.assertTrue("Allergy Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/Allergies"));
		Hooks.scenario.log("User is on the Allergy Home page");
		drugPage.setAllergyTestViewTemplatePermissions();

	}

	@And("the user should not be able to add, edit, download template, upload excel, or export excel for Allergy test")
	public void restrictAllergyTestToViewAndDeleteOnly() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String allergyHomeUrl = Hooks.prop.getProperty("allergyHomeUrl");
		Assert.assertNotNull("allergyHomeUrl is missing in config", allergyHomeUrl);
		String fullAllergyHomeUrl = baseUrl + allergyHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openAllergiesPage(fullAllergyHomeUrl);
		Assert.assertTrue("Allergy Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/Allergies"));
		Hooks.scenario.log("User is on the Allergy Home page");
		drugPage.disableAllergyTestAddEditExportImport();

	}

	@And("the user should be able to view and delete Allergy test")
	public void grantUserViewDeleteAccessToAllergyTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String allergyHomeUrl = Hooks.prop.getProperty("allergyHomeUrl");
		Assert.assertNotNull("allergyHomeUrl is missing in config", allergyHomeUrl);
		String fullAllergyHomeUrl = baseUrl + allergyHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openAllergiesPage(fullAllergyHomeUrl);
		Assert.assertTrue("Allergy Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/Allergies"));
		Hooks.scenario.log("User is on the Allergy Home page");
		drugPage.allowUserToViewAndDeleteAllergyTest();

	}

	@And("I create a profile with View and Download Template access to Allergy test")
	public void createAllergyTestViewAndDownloadTemplateProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createAllergyTestViewTemplateAccessProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Delete access to Allergy test")
	public void createAllergyTestViewerWithDeletePermission() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createAllergyTestViewDeleteProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to delete, download template, upload excel, or export excel for Allergy test")
	public void userCannotDeleteOrExportAllergyTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String allergyHomeUrl = Hooks.prop.getProperty("allergyHomeUrl");
		Assert.assertNotNull("allergyHomeUrl is missing in config", allergyHomeUrl);
		String fullAllergyHomeUrl = baseUrl + allergyHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openAllergiesPage(fullAllergyHomeUrl);
		Assert.assertTrue("Allergy Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/Allergies"));
		Hooks.scenario.log("User is on the Allergy Home page");
		drugPage.verifyUserCannotDeleteDownloadUploadExportAllergy();

	}

	@And("the user should be able to view and add Allergy test")
	public void userCanViewAndAddAllergyTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String allergyHomeUrl = Hooks.prop.getProperty("allergyHomeUrl");
		Assert.assertNotNull("allergyHomeUrl is missing in config", allergyHomeUrl);
		String fullAllergyHomeUrl = baseUrl + allergyHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openAllergiesPage(fullAllergyHomeUrl);
		Assert.assertTrue("Allergy Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/Allergies"));
		Hooks.scenario.log("User is on the Allergy Home page");
		drugPage.verifyUserCanViewAndAddAllergy();

	}

	@And("I create a profile with View and Add access to Allergy test")
	public void createAllergyViewAndAddProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createProfileWithViewAndAddAccess();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View access only to Allergy test")
	public void createProfileWithViewAccessOnlyForAllergy() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createAllergyViewOnlyProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to add, edit, delete, download template, upload excel, or export excel for Allergy test")
	public void userShouldNotBeAbleToAddEditDeleteDownloadUploadOrExportAllergy() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String allergyHomeUrl = Hooks.prop.getProperty("allergyHomeUrl");
		Assert.assertNotNull("allergyHomeUrl is missing in config", allergyHomeUrl);
		String fullAllergyHomeUrl = baseUrl + allergyHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openAllergiesPage(fullAllergyHomeUrl);
		Assert.assertTrue("Allergy Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/Allergies"));
		Hooks.scenario.log("User is on the Allergy Home page");
		drugPage.verifyUserCannotAddEditDeleteDownloadUploadExportAllergy();

	}

	@And("the user should be able to view Allergy test")
	public void userShouldBeAbleToViewAllergy() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String allergyHomeUrl = Hooks.prop.getProperty("allergyHomeUrl");
		Assert.assertNotNull("allergyHomeUrl is missing in config", allergyHomeUrl);
		String fullAllergyHomeUrl = baseUrl + allergyHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openAllergiesPage(fullAllergyHomeUrl);
		Assert.assertTrue("Allergy Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/Allergies"));
		Hooks.scenario.log("User is on the Allergy Home page");

	}

	// Star 2 Drug
	@And("I create a profile with View and Edit access to Star 2 Drug test")
	public void createProfileWithViewAndEditAccessForStar2Drug() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createStar2DrugViewAndEditProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View access only to Star 2 Drug test")
	public void createStar2DrugProfileWithViewAccessOnly() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createStar2DrugViewOnlyProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to view and edit Star 2 Drug test")
	public void userShouldBeAbleToViewAndEditStar2Drug() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String star2DrugHomeUrl = Hooks.prop.getProperty("star2DrugHomeUrl");
		Assert.assertNotNull("star2DrugHomeUrl is missing in config", star2DrugHomeUrl);
		String fullStar2DrugHomeUrl = baseUrl + star2DrugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openStar2DrugsPage(fullStar2DrugHomeUrl);
		Assert.assertTrue("Star 2 Drug Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/Star2Drugs"));
		Hooks.scenario.log("User is on the Star 2 Drug Home page");
		drugPage.verifyUserCanViewAndEditStar2Drug();

	}

	@And("the user should be able to view Star 2 Drug test")
	public void userShouldBeAbleToViewStar2Drug() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String star2DrugHomeUrl = Hooks.prop.getProperty("star2DrugHomeUrl");
		Assert.assertNotNull("star2DrugHomeUrl is missing in config", star2DrugHomeUrl);
		String fullStar2DrugHomeUrl = baseUrl + star2DrugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openStar2DrugsPage(fullStar2DrugHomeUrl);
		Assert.assertTrue("Star 2 Drug Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/Star2Drugs"));
		Hooks.scenario.log("User is on the Star 2 Drug Home page");

	}

	@And("the user should not be able to edit Star 2 Drug test")
	public void userShouldNotBeAbleToEditStar2Drug() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String star2DrugHomeUrl = Hooks.prop.getProperty("star2DrugHomeUrl");
		Assert.assertNotNull("star2DrugHomeUrl is missing in config", star2DrugHomeUrl);
		String fullStar2DrugHomeUrl = baseUrl + star2DrugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openStar2DrugsPage(fullStar2DrugHomeUrl);
		Assert.assertTrue("Star 2 Drug Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/Star2Drugs"));
		Hooks.scenario.log("User is on the Star 2 Drug Home page");
		drugPage.verifyUserCannotEditStar2Drug();

	}

	// Star 1 Drug
	@And("the user should be able to view and edit Star 1 Drug test")
	public void userShouldBeAbleToViewAndEditStar1Drug() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String star1DrugHomeUrl = Hooks.prop.getProperty("star1DrugHomeUrl");
		Assert.assertNotNull("star1DrugHomeUrl is missing in config", star1DrugHomeUrl);
		String fullStar1DrugHomeUrl = baseUrl + star1DrugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openStar1DrugsPage(fullStar1DrugHomeUrl);
		Assert.assertTrue("Star 1 Drug Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/Star1Drugs"));
		Hooks.scenario.log("User is on the Star 1 Drug Home page");
		drugPage.viewAndEditStar1DrugTest();

	}

	@And("I create a profile with View and Edit access to Star 1 Drug test")
	public void createProfileWithViewAndEditAccessForStar1Drug() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createStar1DrugViewAndEditProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View access only to Star 1 Drug test")
	public void createProfileWithViewAccessOnlyForStar1Drug() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createStar1DrugViewOnlyProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to view Star 1 Drug test")
	public void userShouldBeAbleToViewStar1Drug() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String star1DrugHomeUrl = Hooks.prop.getProperty("star1DrugHomeUrl");
		Assert.assertNotNull("star1DrugHomeUrl is missing in config", star1DrugHomeUrl);
		String fullStar1DrugHomeUrl = baseUrl + star1DrugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openStar1DrugsPage(fullStar1DrugHomeUrl);
		Assert.assertTrue("Star 1 Drug Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/Star1Drugs"));
		Hooks.scenario.log("User is on the Star 1 Drug Home page");

	}

	@And("the user should not be able to edit Star 1 Drug test")
	public void userShouldNotBeAbleToEditStar1Drug() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String star1DrugHomeUrl = Hooks.prop.getProperty("star1DrugHomeUrl");
		Assert.assertNotNull("star1DrugHomeUrl is missing in config", star1DrugHomeUrl);
		String fullStar1DrugHomeUrl = baseUrl + star1DrugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.openStar1DrugsPage(fullStar1DrugHomeUrl);
		Assert.assertTrue("Star 1 Drug Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Drug/Home/Star1Drugs"));
		Hooks.scenario.log("User is on the Star 1 Drug Home page");
		drugPage.verifyUserCannotEditStar1Drug();

	}

	// Drug
	@And("the user should not be able to add, edit, delete, download template, or upload excel test")
	public void userShouldNotBeAbleToAddEditDeleteDownloadOrUploadDrug() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.verifyUserCannotAddEditDeleteDownloadOrUploadDrug();

	}

	@And("the user should be able to view and export excel in Drug test")
	public void userShouldBeAbleToViewAndExportExcelInDrug() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.verifyUserCanViewAndExportExcelInDrug();

	}

	@And("I create a profile with View and Export Excel access to Drug test")
	public void createProfileWithViewAndExportExcelAccessToDrugTest() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.verifyProfileWithViewAndExportExcelAccessToDrug();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to add, edit, download template, upload excel, or export excel test")
	public void userShouldNotBeAbleToAddEditDownloadUploadOrExportDrug() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.verifyUserCannotAddEditDownloadUploadOrExportDrug();

	}

	@And("the user should not be able to add, edit, delete, upload excel, or export excel test")
	public void userShouldNotBeAbleToAddEditDeleteUploadOrExportDrug() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.verifyUserCannotAddEditDeleteUploadOrExportDrug();

	}

	@And("the user should not be able to add, edit, delete, download template, or export excel test")
	public void userShouldNotBeAbleToAddEditDeleteDownloadOrExportDrug() {
		drugPage.verifyUserCannotAddEditDeleteDownloadOrExportDrug();

	}

	@And("the user should be able to view and upload excel in Drug test")
	public void userShouldBeAbleToViewAndUploadExcelInDrug() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.verifyUserCanViewAndUploadExcelInDrug();

	}

	@And("the user should be able to view and download template in Drug test")
	public void userShouldBeAbleToViewAndDownloadTemplateInDrug() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.verifyUserCanViewAndDownloadTemplateInDrug();

	}

	@And("the user should be able to view and delete in Drug test")
	public void userShouldBeAbleToViewAndDeleteInDrug() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.verifyUserCanViewAndDeleteInDrug();

	}

	@And("I create a profile with View and Upload Excel access to Drug test")
	public void createProfileWithViewAndUploadExcelAccessToDrugTest() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.verifyProfileWithViewAndUploadExcelAccessToDrug();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Download Template access to Drug test")
	public void createProfileWithViewAndDownloadTemplateAccessToDrugTest() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.verifyProfileWithViewAndDownloadTemplateAccessToDrug();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Delete access to Drug test")
	public void createProfileWithViewAndDeleteAccessToDrugTest() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugViewAndDeleteProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to delete, download template, upload excel, or export excel test")
	public void userShouldNotBeAbleToDeleteDownloadUploadOrExportDrug() {
		drugPage.verifyUserCannotDeleteDownloadUploadOrExportDrug();

	}

	@And("I create a profile with View and Add access to Drug test")
	public void createProfileWithViewAndAddAccessToDrugTest() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugViewAndAddProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View access only to Drug test")
	public void createProfileWithViewAccessOnlyToDrugTest() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugViewOnlyProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to add, edit, delete, download template, upload excel, or export excel test")
	public void userShouldNotBeAbleToAddEditDeleteOrExportDrug() {
		drugPage.verifyUserCannotAddEditDeleteOrExportDrug();

	}

	@And("the user should be able to view and add in Drug test")
	public void userShouldBeAbleToViewAndAddInDrug() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.verifyUserCanViewAndAddDrug();

	}

	@And("the user should be able to view Drug test")
	public void userShouldBeAbleToViewDrug() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");

	}

	// Profile
	@And("the Drug user should be able to view Profiles test")
	public void drugUserShouldBeAbleToViewProfilesTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalProfilesUrl = Hooks.prop.getProperty("profilesPageUrl");
		Assert.assertNotNull("profilesPageUrl is missing in config", clinicalProfilesUrl);
		String fullProfilesUrl = baseUrl + clinicalProfilesUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugProfilesPage(fullProfilesUrl);
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Profiles"));
		Hooks.scenario.log("Clinical user is on the Profiles page");
	}

	// Audit View
	@And("the user should not be able to view Drug General Audit View settings test")
	public void userShouldNotBeAbleToViewDrugGeneralAuditViewSettings() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.userCannotViewDrugGeneralAuditViewSettings();

	}

	@And("the user should be able to view Drug General Audit View settings test")
	public void userShouldBeAbleToViewDrugGeneralAuditViewSettings() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		Hooks.scenario.log("User is on the Drug Home page");
		drugPage.verifyGeneralAuditViewSettings();

	}

	@And("I create a profile with No access to Drug Module General Audit View test")
	public void createProfileWithNoAccessToDrugGeneralAuditViewTest() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugGeneralAuditNoAccessProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View access only to Drug Module General Audit View test")
	public void createProfileWithViewAccessForDrugModuleGeneralAudit() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName("Sunil");
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createViewOnlyDrugGeneralAuditProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

}
