package com.pharmcrm_DrugModule.steps;

import org.junit.Assert;
import com.pharmcrm_DrugModule.pages.drugpage;
import hooks.Hooks;
import io.cucumber.java.en.And;

public class drugstep {

	private drugpage drugPage;

	@And("Validation Should have to show for New Drug Blank Submission Validation")
	public void validateBlankNewDrugSubmission() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugHomeUrl = Hooks.prop.getProperty("drugHomeUrl");
		Assert.assertNotNull("drugHomeUrl is missing in config", drugHomeUrl);
		String fullDrugHomeUrl = baseUrl + drugHomeUrl;
		drugPage = new drugpage(Hooks.driver);
		drugPage.opendrugsPage(fullDrugHomeUrl);
		Assert.assertTrue("Drug Home page is not displayed", Hooks.driver.getCurrentUrl().contains("/Drug/Home/Drugs"));
		drugPage.newDrugBlankSubmissionValidation();

	}

	// Program
	@And("the user should not be able to add Program test")
	public void userCannotAddProgramTest() {
		drugPage.verifyUserCannotAddProgramTest();
		System.out.println("User should not be able to add Program test");
		Hooks.scenario.log("User should not be able to add Program test");

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
		drugPage.verifyUserCanViewAndDeleteProgramTest();
		System.out.println("User should be able to view and delete Program test");
		Hooks.scenario.log("User should be able to view and delete Program test");

	}

	@And("I create a profile with View and Delete access to Program test")
	public void createProfileWithViewAndDeleteAccessToProgramTest() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.setupProfileWithProgramViewAndDeletePermissions();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Delete access to Program test");
		Hooks.scenario.log("Profile created with View and Delete access to Program test");

	}

	@And("the user should not be able to delete Program test")
	public void userCannotDeleteProgramTest() {
		drugPage.verifyUserCannotDeleteProgramTest();
		System.out.println("User should not be able to delete Program test");
		Hooks.scenario.log("User should not be able to delete Program test");

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
		drugPage.validateViewAndAddAccessForProgramTest();
		System.out.println("User should be able to view and add Program test");
		Hooks.scenario.log("User should be able to view and add Program test");

	}

	@And("I create a profile with View and Add access to Program test")
	public void createProfileWithViewAndAddAccessToProgramTest() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.setupProfileWithProgramViewAndAddPermissions();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Add access to Program test");
		Hooks.scenario.log("Profile created with View and Add access to Program test");

	}

	// Disease State
	@And("the user should not be able to add Disease State test")
	public void userCannotAddDiseaseStateTest() {
		drugPage.verifyUserCannotAddDiseaseStateTest();
		System.out.println("User should not be able to add Disease State test");
		Hooks.scenario.log("User should not be able to add Disease State test");

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
		drugPage.verifyUserCanViewAndDeleteDiseaseStateTest();
		System.out.println("User should be able to view and delete Disease State test");
		Hooks.scenario.log("User should be able to view and delete Disease State test");

	}

	@And("I create a profile with View and Delete access to Disease State test")
	public void createProfileWithViewAndDeleteAccessToDiseaseStateTest() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createProfileWithDiseaseStateViewAndDeleteAccess();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Delete access to Disease State test");
		Hooks.scenario.log("Profile created with View and Delete access to Disease State test");

	}

	@And("the user should not be able to delete Disease State test")
	public void restrictDiseaseStateTestDeletePermission() {
		drugPage.setDiseaseStateTestNoDeletePermission();
		System.out.println("User should not be able to delete Disease State test");
		Hooks.scenario.log("User should not be able to delete Disease State test");

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
		drugPage.allowUserToViewAndAddDiseaseStateTest();
		System.out.println("User should be able to view and add Disease State test");
		Hooks.scenario.log("User should be able to view and add Disease State test");

	}

	@And("I create a profile with View and Add access to Disease State test")
	public void createDiseaseStateTestViewAndAddProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDiseaseStateTestViewAddProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Add access to Disease State test");
		Hooks.scenario.log("Profile created with View and Add access to Disease State test");

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
		drugPage.allowOnlyViewAndDeleteForDrugApprovedIndicationTest();
		System.out.println("User should not be able to add or edit Drug Approved Indication test");
		Hooks.scenario.log("User should not be able to add or edit Drug Approved Indication test");

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
		drugPage.userShouldBeAbleToViewAndDeleteDrugApprovedIndication();
		System.out.println("User should be able to view and delete Drug Approved Indication test");
		Hooks.scenario.log("User should be able to view and delete Drug Approved Indication test");

	}

	@And("I create a profile with View and Delete access to Drug Approved Indication test")
	public void createDrugApprovedIndicationTestViewAndDeleteProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugApprovedIndicationTestViewDeleteProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Delete access to Drug Approved Indication test");
		Hooks.scenario.log("Profile created with View and Delete access to Drug Approved Indication test");

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
		drugPage.allowOnlyViewAndEditForDrugApprovedIndicationTest();
		System.out.println("User should not be able to add or delete Drug Approved Indication test");
		Hooks.scenario.log("User should not be able to add or delete Drug Approved Indication test");

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
		drugPage.allowUserToViewAndEditDrugApprovedIndicationTest();
		System.out.println("User should be able to view and edit Drug Approved Indication test");
		Hooks.scenario.log("User should be able to view and edit Drug Approved Indication test");

	}

	@And("I create a profile with View and Edit access to Drug Approved Indication test")
	public void createDrugApprovedIndicationTestViewAndEditProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugApprovedIndicationViewEditProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Edit access to Drug Approved Indication test");
		Hooks.scenario.log("Profile created with View and Edit access to Drug Approved Indication test");

	}

	@And("the user should not be able to edit or delete Drug Approved Indication test")
	public void restrictDrugApprovedIndicationTestToViewAndAddOnly() {
		drugPage.isDrugApprovedIndicationTestViewAddOnlyUser();
		System.out.println("User should not be able to edit or delete Drug Approved Indication test");
		Hooks.scenario.log("User should not be able to edit or delete Drug Approved Indication test");

	}

	@And("I create a profile with View and Add access to Drug Approved Indication test")
	public void createDrugApprovedIndicationTestViewAndAddProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugApprovedIndicationTestViewAddProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Add access to Drug Approved Indication test");
		Hooks.scenario.log("Profile created with View and Add access to Drug Approved Indication test");

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
		drugPage.canUserViewAndAddDrugApprovedIndicationTest();
		System.out.println("User should be able to view and add Drug Approved Indication test");
		Hooks.scenario.log("User should be able to view and add Drug Approved Indication test");

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
		drugPage.denyDrugFamilyTestAddEdit();
		System.out.println("User should not be able to add or edit Drug Family test");
		Hooks.scenario.log("User should not be able to add or edit Drug Family test");

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
		drugPage.allowDrugFamilyTestViewDelete();
		System.out.println("User should be able to view and delete Drug Family test");
		Hooks.scenario.log("User should be able to view and delete Drug Family test");

	}

	@And("I create a profile with View and Delete access to Drug Family test")
	public void createDrugFamilyTestViewAndDeleteProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugFamilyTestViewDeleteProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Delete access to Drug Family test");
		Hooks.scenario.log("Profile created with View and Delete access to Drug Family test");

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
		drugPage.denyDrugFamilyTestAddDelete();
		System.out.println("User should not be able to add or delete Drug Family test");
		Hooks.scenario.log("User should not be able to add or delete Drug Family test");

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
		drugPage.userShouldBeAbleToViewAndEditDrugFamily();
		System.out.println("User should be able to view and edit Drug Family test");
		Hooks.scenario.log("User should be able to view and edit Drug Family test");

	}

	@And("I create a profile with View and Edit access to Drug Family test")
	public void createDrugFamilyTestViewAndEditProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugFamilyTestViewEditProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Edit access to Drug Family test");
		Hooks.scenario.log("Profile created with View and Edit access to Drug Family test");

	}

	@And("I create a profile with View and Add access to Drug Family test")
	public void createDrugFamilyTestViewAndAddProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugFamilyViewAddProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Add access to Drug Family test");
		Hooks.scenario.log("Profile created with View and Add access to Drug Family test");

	}

	@And("the user should not be able to edit or delete Drug Family test")
	public void restrictDrugFamilyTestToViewAndAddOnly() {
		drugPage.userShouldNotBeAbleToEditOrDeleteDrugFamily();
		System.out.println("User should not be able to edit or delete Drug Family test");
		Hooks.scenario.log("User should not be able to edit or delete Drug Family test");

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
		drugPage.allowUserToViewAndAddDrugFamilyTest();
		System.out.println("User should be able to view and add Drug Family test");
		Hooks.scenario.log("User should be able to view and add Drug Family test");

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
		drugPage.denyDrugTherapeuticTestAddEdit();
		System.out.println("User should not be able to add or edit Drug Therapeutic test");
		Hooks.scenario.log("User should not be able to add or edit Drug Therapeutic test");

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
		drugPage.allowDrugTherapeuticTestViewDelete();
		System.out.println("User should be able to view and delete Drug Therapeutic test");
		Hooks.scenario.log("User should be able to view and delete Drug Therapeutic test");

	}

	@And("I create a profile with View and Delete access to Drug Therapeutic test")
	public void createDrugTherapeuticTestViewAndDeleteProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugTherapeuticTestViewDeleteProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Delete access to Drug Therapeutic test");
		Hooks.scenario.log("Profile created with View and Delete access to Drug Therapeutic test");

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
		drugPage.userShouldNotBeAbleToAddOrDeleteDrugTherapeutic();
		System.out.println("User should not be able to add or delete Drug Therapeutic test");
		Hooks.scenario.log("User should not be able to add or delete Drug Therapeutic test");

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
		drugPage.allowUserToViewAndEditDrugTherapeuticTest();
		System.out.println("User should be able to view and edit Drug Therapeutic test");
		Hooks.scenario.log("User should be able to view and edit Drug Therapeutic test");

	}

	@And("I create a profile with View and Edit access to Drug Therapeutic test")
	public void createDrugTherapeuticTestViewAndEditProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugTherapeuticTestViewEditProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Edit access to Drug Therapeutic test");
		Hooks.scenario.log("Profile created with View and Edit access to Drug Therapeutic test");

	}

	@And("I create a profile with View and Add access to Drug Therapeutic test")
	public void createDrugTherapeuticTestViewAndAddProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugTherapeuticViewAddProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Add access to Drug Therapeutic test");
		Hooks.scenario.log("Profile created with View and Add access to Drug Therapeutic test");

	}

	@And("the user should not be able to edit or delete Drug Therapeutic test")
	public void restrictDrugTherapeuticTestToViewAndAddOnly() {
		drugPage.denyDrugTherapeuticTestEditDelete();
		System.out.println("User should not be able to edit or delete Drug Therapeutic test");
		Hooks.scenario.log("User should not be able to edit or delete Drug Therapeutic test");

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
		drugPage.allowDrugTherapeuticTestViewAdd();
		System.out.println("User should be able to view and add Drug Therapeutic test");
		Hooks.scenario.log("User should be able to view and add Drug Therapeutic test");

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
		drugPage.userShouldNotBeAbleToAddOrEditICD10();
		System.out.println("User should not be able to add or edit ICD10 test");
		Hooks.scenario.log("User should not be able to add or edit ICD10 test");

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
		drugPage.allowUserToViewAndDeleteICD10Test();
		System.out.println("User should be able to view and delete ICD10 test");
		Hooks.scenario.log("User should be able to view and delete ICD10 test");

	}

	@And("I create a profile with View and Delete access to ICD10 test")
	public void assignICD10TestViewAndDeletePermissions() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createICD10TestViewDeleteProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Delete access to ICD10 test");
		Hooks.scenario.log("Profile created with View and Delete access to ICD10 test");

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
		drugPage.restrictICD10TestToViewAndEditOnly();
		System.out.println("User should not be able to add or delete ICD10 test");
		Hooks.scenario.log("User should not be able to add or delete ICD10 test");

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
		drugPage.userShouldBeAbleToViewAndAddICD10();
		System.out.println("User should be able to view and edit ICD10 test");
		Hooks.scenario.log("User should be able to view and edit ICD10 test");

	}

	@And("I create a profile with View and Edit access to ICD10 test")
	public void createICD10TestViewAndEditProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createICD10TestViewEditProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Edit access to ICD10 test");
		Hooks.scenario.log("Profile created with View and Edit access to ICD10 test");

	}

	@And("I create a profile with View and Add access to ICD10 test")
	public void createICD10TestViewAndAddProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createICD10TestAddAccessProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Add access to ICD10 test");
		Hooks.scenario.log("Profile created with View and Add access to ICD10 test");

	}

	@And("the user should not be able to add, edit, or delete ICD10 test")
	public void restrictICD10TestToViewOnly() {
		drugPage.userShouldNotBeAbleToModifyICD10();
		System.out.println("User should not be able to add, edit, or delete ICD10 test");
		Hooks.scenario.log("User should not be able to add, edit, or delete ICD10 test");

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
		drugPage.allowOnlyViewAndAddForICD10Test();
		System.out.println("User should not be able to edit or delete ICD10 test");
		Hooks.scenario.log("User should not be able to edit or delete ICD10 test");

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
		drugPage.userShouldBeAbleToViewAndAddICD10();
		System.out.println("User should be able to view and add ICD10 test");
		Hooks.scenario.log("User should be able to view and add ICD10 test");

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
		System.out.println("User should be able to view ICD10 test");
		Hooks.scenario.log("User should be able to view ICD10 test");

	}

	@And("I create a profile with View access only to ICD10 test")
	public void createICD10TestReadOnlyAccessProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createICD10TestViewOnlyProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View access only to ICD10 test");
		Hooks.scenario.log("Profile created with View access only to ICD10 test");

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
		drugPage.allowOnlyViewAndExportExcelForAllergyTest();
		System.out.println(
				"User should not be able to add, edit, delete, download template, or upload excel for Allergy test");
		Hooks.scenario.log(
				"User should not be able to add, edit, delete, download template, or upload excel for Allergy test");

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
		drugPage.allowUserToViewAndExportAllergyTestExcel();
		System.out.println("User should be able to view and export excel in Allergy test");
		Hooks.scenario.log("User should be able to view and export excel in Allergy test");

	}

	@And("I create a profile with View and Export Excel access to Allergy test")
	public void createAllergyTestViewAndExportExcelProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createAllergyTestViewExportExcelProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Export Excel access to Allergy test");
		Hooks.scenario.log("Profile created with View and Export Excel access to Allergy test");

	}

	@And("I create a profile with View and Upload Excel access to Allergy test")
	public void createAllergyTestViewAndUploadExcelProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createAllergyTestViewUploadExcelProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Upload Excel access to Allergy test");
		Hooks.scenario.log("Profile created with View and Upload Excel access to Allergy test");

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
		drugPage.applyAllergyTestLimitedAccessPolicy();
		System.out.println(
				"User should not be able to add, edit, delete, upload excel, or export excel for Allergy test");
		Hooks.scenario
				.log("User should not be able to add, edit, delete, upload excel, or export excel for Allergy test");

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
		drugPage.allowOnlyViewAndUploadExcelForAllergyTest();
		System.out.println(
				"User should not be able to add, edit, delete, download template, or export excel for Allergy test");
		Hooks.scenario.log(
				"User should not be able to add, edit, delete, download template, or export excel for Allergy test");

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
		drugPage.allowUserToViewAndUploadAllergyTestExcel();
		System.out.println("User should be able to view and upload excel in Allergy test");
		Hooks.scenario.log("User should be able to view and upload excel in Allergy test");

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
		drugPage.setAllergyTestViewTemplatePermissions();
		System.out.println("User should be able to view and download template in Allergy test");
		Hooks.scenario.log("User should be able to view and download template in Allergy test");

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
		drugPage.disableAllergyTestAddEditExportImport();
		System.out.println(
				"User should not be able to add, edit, download template, upload excel, or export excel for Allergy test");
		Hooks.scenario.log(
				"User should not be able to add, edit, download template, upload excel, or export excel for Allergy test");

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
		drugPage.allowUserToViewAndDeleteAllergyTest();
		System.out.println("User should be able to view and delete Allergy test");
		Hooks.scenario.log("User should be able to view and delete Allergy test");

	}

	@And("I create a profile with View and Download Template access to Allergy test")
	public void createAllergyTestViewAndDownloadTemplateProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createAllergyTestViewTemplateAccessProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Download Template access to Allergy test");
		Hooks.scenario.log("Profile created with View and Download Template access to Allergy test");

	}

	@And("I create a profile with View and Delete access to Allergy test")
	public void createAllergyTestViewerWithDeletePermission() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createAllergyTestViewDeleteProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Delete access to Allergy test");
		Hooks.scenario.log("Profile created with View and Delete access to Allergy test");

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
		drugPage.verifyUserCannotDeleteDownloadUploadExportAllergy();
		System.out.println(
				"User should not be able to delete, download template, upload excel, or export excel for Allergy test");
		Hooks.scenario.log(
				"User should not be able to delete, download template, upload excel, or export excel for Allergy test");

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
		drugPage.verifyUserCanViewAndAddAllergy();
		System.out.println("User should be able to view and add Allergy test");
		Hooks.scenario.log("User should be able to view and add Allergy test");

	}

	@And("I create a profile with View and Add access to Allergy test")
	public void createAllergyViewAndAddProfile() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createProfileWithViewAndAddAccess();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Add access to Allergy test");
		Hooks.scenario.log("Profile created with View and Add access to Allergy test");

	}

	@And("I create a profile with View access only to Allergy test")
	public void createProfileWithViewAccessOnlyForAllergy() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createAllergyViewOnlyProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Allergy test");
		Hooks.scenario.log("Profile created with View access only to Allergy test");

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
		drugPage.verifyUserCannotAddEditDeleteDownloadUploadExportAllergy();
		System.out.println(
				"User should not be able to add, edit, delete, download template, upload excel, or export excel for Allergy test");
		Hooks.scenario.log(
				"User should not be able to add, edit, delete, download template, upload excel, or export excel for Allergy test");

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
		System.out.println("User should be able to view Allergy test");
		Hooks.scenario.log("User should be able to view Allergy test");

	}

	// Star 2 Drug
	@And("I create a profile with View and Edit access to Star 2 Drug test")
	public void createProfileWithViewAndEditAccessForStar2Drug() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createStar2DrugViewAndEditProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Edit access to Star 2 Drug test");
		Hooks.scenario.log("Profile created with View and Edit access to Star 2 Drug test");

	}

	@And("I create a profile with View access only to Star 2 Drug test")
	public void createStar2DrugProfileWithViewAccessOnly() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createStar2DrugViewOnlyProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Star 2 Drug test");
		Hooks.scenario.log("Profile created with View access only to Star 2 Drug test");

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
		drugPage.verifyUserCanViewAndEditStar2Drug();
		System.out.println("User should be able to view and edit Star 2 Drug test");
		Hooks.scenario.log("User should be able to view and edit Star 2 Drug test");

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
		System.out.println("User should be able to view Star 2 Drug test");
		Hooks.scenario.log("User should be able to view Star 2 Drug test");

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
		drugPage.verifyUserCannotEditStar2Drug();
		System.out.println("User should not be able to edit Star 2 Drug test");
		Hooks.scenario.log("User should not be able to edit Star 2 Drug test");

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
		drugPage.viewAndEditStar1DrugTest();
		System.out.println("User should be able to view and edit Star 1 Drug test");
		Hooks.scenario.log("User should be able to view and edit Star 1 Drug test");

	}

	@And("I create a profile with View and Edit access to Star 1 Drug test")
	public void createProfileWithViewAndEditAccessForStar1Drug() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createStar1DrugViewAndEditProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Edit access to Star 1 Drug test");
		Hooks.scenario.log("Profile created with View and Edit access to Star 1 Drug test");

	}

	@And("I create a profile with View access only to Star 1 Drug test")
	public void createProfileWithViewAccessOnlyForStar1Drug() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createStar1DrugViewOnlyProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Star 1 Drug test");
		Hooks.scenario.log("Profile created with View access only to Star 1 Drug test");

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
		System.out.println("User should be able to view Star 1 Drug test");
		Hooks.scenario.log("User should be able to view Star 1 Drug test");

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
		drugPage.verifyUserCannotEditStar1Drug();
		System.out.println("User should not be able to edit Star 1 Drug test");
		Hooks.scenario.log("User should not be able to edit Star 1 Drug test");

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
		drugPage.verifyUserCannotAddEditDeleteDownloadOrUploadDrug();
		System.out.println("User should not be able to add, edit, delete, download template, or upload excel test");
		Hooks.scenario.log("User should not be able to add, edit, delete, download template, or upload excel test");

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
		drugPage.verifyUserCanViewAndExportExcelInDrug();
		System.out.println("User should be able to view and export excel in Drug test");
		Hooks.scenario.log("User should be able to view and export excel in Drug test");

	}

	@And("I create a profile with View and Export Excel access to Drug test")
	public void createProfileWithViewAndExportExcelAccessToDrugTest() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.verifyProfileWithViewAndExportExcelAccessToDrug();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Export Excel access to Drug test");
		Hooks.scenario.log("Profile created with View and Export Excel access to Drug test");

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
		drugPage.verifyUserCannotAddEditDownloadUploadOrExportDrug();
		System.out
				.println("User should not be able to add, edit, download template, upload excel, or export excel test");
		Hooks.scenario
				.log("User should not be able to add, edit, download template, upload excel, or export excel test");

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
		drugPage.verifyUserCannotAddEditDeleteUploadOrExportDrug();
		System.out.println("User should not be able to add, edit, delete, upload excel, or export excel test");
		Hooks.scenario.log("User should not be able to add, edit, delete, upload excel, or export excel test");

	}

	@And("the user should not be able to add, edit, delete, download template, or export excel test")
	public void userShouldNotBeAbleToAddEditDeleteDownloadOrExportDrug() {
		drugPage.verifyUserCannotAddEditDeleteDownloadOrExportDrug();
		System.out.println("User should not be able to add, edit, delete, download template, or export excel test");
		Hooks.scenario.log("User should not be able to add, edit, delete, download template, or export excel test");

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
		drugPage.verifyUserCanViewAndUploadExcelInDrug();
		System.out.println("User should be able to view and upload excel in Drug test");
		Hooks.scenario.log("User should be able to view and upload excel in Drug test");

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
		drugPage.verifyUserCanViewAndDownloadTemplateInDrug();
		System.out.println("User should be able to view and download template in Drug test");
		Hooks.scenario.log("User should be able to view and download template in Drug test");

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
		drugPage.verifyUserCanViewAndDeleteInDrug();
		System.out.println("User should be able to view and delete in Drug test");
		Hooks.scenario.log("User should be able to view and delete in Drug test");

	}

	@And("I create a profile with View and Upload Excel access to Drug test")
	public void createProfileWithViewAndUploadExcelAccessToDrugTest() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.verifyProfileWithViewAndUploadExcelAccessToDrug();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Upload Excel access to Drug test");
		Hooks.scenario.log("Profile created with View and Upload Excel access to Drug test");

	}

	@And("I create a profile with View and Download Template access to Drug test")
	public void createProfileWithViewAndDownloadTemplateAccessToDrugTest() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.verifyProfileWithViewAndDownloadTemplateAccessToDrug();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Download Template access to Drug test");
		Hooks.scenario.log("Profile created with View and Download Template access to Drug test");

	}

	@And("I create a profile with View and Delete access to Drug test")
	public void createProfileWithViewAndDeleteAccessToDrugTest() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugViewAndDeleteProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Delete access to Drug test");
		Hooks.scenario.log("Profile created with View and Delete access to Drug test");

	}

	@And("the user should not be able to delete, download template, upload excel, or export excel test")
	public void userShouldNotBeAbleToDeleteDownloadUploadOrExportDrug() {
		drugPage.verifyUserCannotDeleteDownloadUploadOrExportDrug();
		System.out.println("User should not be able to delete, download template, upload excel, or export excel test");
		Hooks.scenario.log("User should not be able to delete, download template, upload excel, or export excel test");

	}

	@And("I create a profile with View and Add access to Drug test")
	public void createProfileWithViewAndAddAccessToDrugTest() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugViewAndAddProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View and Add access to Drug test");
		Hooks.scenario.log("Profile created with View and Add access to Drug test");

	}

	@And("I create a profile with View access only to Drug test")
	public void createProfileWithViewAccessOnlyToDrugTest() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugViewOnlyProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Drug test");
		Hooks.scenario.log("Profile created with View access only to Drug test");

	}

	@And("the user should not be able to add, edit, delete, download template, upload excel, or export excel test")
	public void userShouldNotBeAbleToAddEditDeleteOrExportDrug() {
		drugPage.verifyUserCannotAddEditDeleteOrExportDrug();
		System.out.println(
				"User should not be able to add, edit, delete, download template, upload excel, or export excel test");
		Hooks.scenario.log(
				"User should not be able to add, edit, delete, download template, upload excel, or export excel test");

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
		drugPage.verifyUserCanViewAndAddDrug();
		System.out.println("User should be able to view and add in Drug test");
		Hooks.scenario.log("User should be able to view and add in Drug test");

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
		System.out.println("User should be able to view Drug test");
		Hooks.scenario.log("User should be able to view Drug test");

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
		System.out.println("Drug user should be able to view Profiles test");
		Hooks.scenario.log("Drug user should be able to view Profiles test");

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
		drugPage.userCannotViewDrugGeneralAuditViewSettings();
		System.out.println("User should not be able to view Drug General Audit View settings test");
		Hooks.scenario.log("User should not be able to view Drug General Audit View settings test");

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
		drugPage.verifyGeneralAuditViewSettings();
		System.out.println("User should be able to view Drug General Audit View settings test");
		Hooks.scenario.log("User should be able to view Drug General Audit View settings test");

	}

	@And("I create a profile with No access to Drug Module General Audit View test")
	public void createProfileWithNoAccessToDrugGeneralAuditViewTest() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createDrugGeneralAuditNoAccessProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with No access to Drug Module General Audit View test");
		Hooks.scenario.log("Profile created with No access to Drug Module General Audit View test");

	}

	@And("I create a profile with View access only to Drug Module General Audit View test")
	public void createProfileWithViewAccessForDrugModuleGeneralAudit() {
		drugPage.clickFilterButton();
		drugPage.enterProfileName();
		drugPage.clickSearchButton();
		drugPage.clickActionMenu();
		drugPage.clickEditButton();
		drugPage.createViewOnlyDrugGeneralAuditProfile();
		drugPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Drug Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Drug Module General Audit View test");

	}

	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

}
