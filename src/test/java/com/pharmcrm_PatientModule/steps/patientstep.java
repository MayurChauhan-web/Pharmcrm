package com.pharmcrm_PatientModule.steps;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.LocalDate;
import org.junit.Assert;
import com.pharmcrm_PatientModule.pages.patientpage;

public class patientstep {

	private patientpage patientPage;
	private String tagTypeNameBeforeEdit;
	private String tagNameBeforeDelete;
	private String reviewCategoryNameBeforeEdit;
	private String reviewCategoryNameBeforeDelete;
	private String reviewSourceNameBeforeEdit;
	private String referralSourceNameBeforeDelete;
	private String enrollmentNameBeforeEdit;
	private String enrollmentNameBeforeDelete;

	// PatientMedicationColorCodeSetting
	@And("I create a profile with View, Add, Edit, and Delete access to Patient Medication ColorCode Setting test")
	public void createProfileWithFullAccessToPatientMedicationColorCodeSetting() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createProfileWithColorCodeAccess();
		patientPage.clickSubmitButton();
		System.out.println(
				"Profile updated with View, Add, Edit, and Delete access to Patient Medication ColorCode Setting");
		Hooks.scenario
				.log("Profile updated with View, Add, Edit, and Delete access to Patient Medication ColorCode Setting");
	}

	@And("the user should be able to view color codes test")
	public void userShouldBeAbleToViewColorCodes() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String colorCodeUrl = Hooks.prop.getProperty("patientMedicationColorCodeSettingUrl");
		String fullUrl = baseUrl + colorCodeUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Setup/Home/PatientMedicationColorCodeSettings");
		Assert.assertTrue("Patient Medication Color Code Settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PatientMedicationColorCodeSettings"));
		System.out.println("User is able to view Patient Medication Color Code Settings page");
		Hooks.scenario.log("User is able to view Patient Medication Color Code Settings page");

	}

	@And("the user should be able to add a color code test")
	public void userShouldBeAbleToAddColorCode() {
		sleep(2000);
		patientPage.addColorCode();
		System.out.println("User should be able to add a color code test");
		Hooks.scenario.log("User should be able to add a color code test");

	}

	@And("the user should be able to edit a color code test")
	public void userShouldBeAbleToEditColorCode() {
		sleep(2000);
		patientPage.editColorCode(2);
		System.out.println("User should be able to edit a color code test");
		Hooks.scenario.log("User should be able to edit a color code test");

	}

	@And("the user should be able to delete a color code test")
	public void userShouldBeAbleToDeleteColorCode() {
		sleep(2000);
		patientPage.deleteColorCode();
		System.out.println("User should be able to delete a color code test");
		Hooks.scenario.log("User should be able to delete a color code test");

	}

	// PatientAppointment
	@And("I create a profile with Add, Edit, and Delete access to Patient Appointment test")
	public void addEditDeletePatientAppointment() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.managePatientAppointmentTest();
		patientPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Appointment");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Appointment");
	}

	@And("the user should be able to delete patient appointment test")
	public void userShouldBeAbleToDeletePatientAppointment() {
		patientPage.deletePatientAppointment();
		System.out.println("User should be able to delete patient appointment test");
		Hooks.scenario.log("User should be able to delete patient appointment test");

	}

	@And("the user should be able to edit patient appointment test")
	public void userShouldBeAbleToEditPatientAppointment() {
		patientPage.editPatientAppointment("Note");
		System.out.println("User should be able to edit patient appointment test");
		Hooks.scenario.log("User should be able to edit patient appointment test");

	}

	@And("the user should be able to add patient appointment test")
	public void userCanAddPatientAppointment() {
		sleep(4000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		System.out.println("User is able to view the Review Categories page");
		Hooks.scenario.log("User is able to view the Review Categories page");
		LocalDate today = LocalDate.now();
		patientPage.addPatientAppointment(today, 10, 30, 23, 30);
		System.out.println("User should be able to add patient appointment test");
		Hooks.scenario.log("User should be able to add patient appointment test");

	}

	// PatientVitals
	@And("I create a profile with Add, Edit, and Delete access to Patient Vitals test")
	public void createProfileWithAddEditDeleteAccessToPatientVitalsTest() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createPatientVitalsProfileWithFullAccessTest();
		patientPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to delete patient vitals test")
	public void deletePatientVitalsTest() {
		sleep(4000);
		patientPage.deletePatientVitalsTest();
		System.out.println("User should be able to delete patient vitals test");
		Hooks.scenario.log("User should be able to delete patient vitals test");

	}

	@And("the user should be able to edit patient vitals test")
	public void editPatientVitalsTest() {
		sleep(4000);
		patientPage.editPatientVitalsTest();
		System.out.println("User should be able to edit patient vitals test");
		Hooks.scenario.log("User should be able to edit patient vitals test");

	}

	@And("the user should be able to add patient vitals test")
	public void userShouldBeAbleToAddPatientVitalsTest() {
		sleep(4000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.addPatientVitalsTest();
		System.out.println("User should be able to add patient vitals test");
		Hooks.scenario.log("User should be able to add patient vitals test");

	}

	// FeedbackForm
	@And("I create a profile with View, Add, and Delete access to Feedback Form test")
	public void createProfileWithFeedbackFormViewAddDeleteAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.enableFeedbackFormViewAddDelete();
		patientPage.clickSubmitButton();
		System.out.println("Profile updated with View, Add, and Delete access to Feedback Form");
		Hooks.scenario.log("Profile updated with View, Add, and Delete access to Feedback Form");
	}

	@And("the user should be able to add feedback form test")
	public void verifyAddFeedbackFormAccess() {
		patientPage.userShouldBeAbleToAddFeedbackForm();
		System.out.println("User should be able to add feedback form test");
		Hooks.scenario.log("User should be able to add feedback form test");

	}

	@And("the user should be able to delete feedback form test")
	public void userShouldBeAbleToDeleteFeedbackFormTest() {
		patientPage.userShouldBeAbleToDeleteFeedbackForm();
		System.out.println("User should be able to delete feedback form test");
		Hooks.scenario.log("User should be able to delete feedback form test");

	}

	@And("the user should be able to view feedback form test")
	public void userShouldBeAbleToViewFeedbackForm() {
		sleep(4000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.userShouldBeAbleToViewFeedbackForm();
		System.out.println("User should be able to view feedback form test");
		Hooks.scenario.log("User should be able to view feedback form test");

	}

	// MedicalHealthCard
	@And("I create a profile with Add, Edit, and Delete access to Medical Health Card test")
	public void createProfileWithMedicalHealthCardFullAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.medicalHealthCardAddEditDeleteAccess();
		patientPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Medical Health Card");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Medical Health Card");
	}

	@And("the user should be able to add medical health card test")
	public void canAddMedicalHealthCard() {
		sleep(4000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.userShouldBeAbleToAddMedicalHealthCard();
		System.out.println("User should be able to add medical health card test");
		Hooks.scenario.log("User should be able to add medical health card test");

	}

	@And("the user should be able to edit medical health card test")
	public void canEditMedicalHealthCard() {
		patientPage.userShouldBeAbleToEditMedicalHealthCard();
		System.out.println("User should be able to edit medical health card test");
		Hooks.scenario.log("User should be able to edit medical health card test");

	}

	@And("the user should be able to delete medical health card test")
	public void canDeleteMedicalHealthCard() {
		patientPage.userShouldBeAbleToDeleteMedicalHealthCard();
		System.out.println("User should be able to delete medical health card test");
		Hooks.scenario.log("User should be able to delete medical health card test");

	}

	// CareGiverName
	@And("the user should be able to add caregiver name test")
	public void canAddCareGiverName() {
		sleep(4000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.userShouldBeAbleToAddCareGiverName();
		System.out.println("User should be able to add caregiver name test");
		Hooks.scenario.log("User should be able to add caregiver name test");

	}

	@And("the user should be able to delete caregiver name test")
	public void canDeleteCareGiverName() {
		patientPage.userShouldBeAbleToDeleteCaregiverName();
		System.out.println("User should be able to delete caregiver name test");
		Hooks.scenario.log("User should be able to delete caregiver name test");

	}

	@And("the user should be able to edit caregiver name test")
	public void canEditCareGiverName() {
		patientPage.userShouldBeAbleToEditCaregiverName();
		System.out.println("User should be able to edit caregiver name test");
		Hooks.scenario.log("User should be able to edit caregiver name test");

	}

	@And("I create a profile with Add, Edit, and Delete access to CareGiver Name test")
	public void createProfileWithCareGiverFullAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.careGiverAddEditDeleteAccess();
		patientPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to CareGiver Name");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to CareGiver Name");
	}

	// Text
	@And("I create a profile with view access to Text test")
	public void createProfileWithTextViewAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.setTextViewAccess();
		patientPage.clickSubmitButton();
		System.out.println("Profile updated with View access to Text");
		Hooks.scenario.log("Profile updated with View access to Text");
	}

	@And("the user should not be able to Reply, Add To Patient, or Send VCard test")
	public void cannotUseReplyAddToPatientSendVCard() {
		patientPage.userShouldNotBeAbleToReplyAddToPatientOrSendVCard();
		System.out.println("User should not be able to Reply, Add To Patient, or Send VCard test");
		Hooks.scenario.log("User should not be able to Reply, Add To Patient, or Send VCard test");

	}

	@And("the user should be able to view Quick Text test")
	public void canViewQuickText() {
		sleep(4000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.canUseQuickText();
		System.out.println("User should be able to view Quick Text test");
		Hooks.scenario.log("User should be able to view Quick Text test");

	}

	@And("the user should be able to Add To Patient test")
	public void canAddToPatient() {
		sleep(4000);
		patientPage.userShouldBeAbleToAddToPatient();
		System.out.println("User should be able to Add To Patient test");
		Hooks.scenario.log("User should be able to Add To Patient test");

	}

	// PatientText
	@And("the user should be able to Send VCard test")
	public void canSendVCard() {
		patientPage.userShouldBeAbleToSendVCard();
		System.out.println("User should be able to Send VCard test");
		Hooks.scenario.log("User should be able to Send VCard test");

	}

	@And("the user should be able to Reply test")
	public void canReplyPatientText() {
		patientPage.userShouldBeAbleToReply();
		System.out.println("User should be able to Reply test");
		Hooks.scenario.log("User should be able to Reply test");

	}

	@And("the user should be able to use Quick Text test")
	public void canUseQuickText() {
		patientPage.userShouldBeAbleToUseQuickText();
		System.out.println("User should be able to use Quick Text test");
		Hooks.scenario.log("User should be able to use Quick Text test");

	}

	@And("the user should be able to view patient text test")
	public void viewPatientText() {
		sleep(4000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.userShouldBeAbleToViewPatientText();
		System.out.println("User should be able to view patient text test");
		Hooks.scenario.log("User should be able to view patient text test");

	}

	@And("I create a profile with full access to Patient Text test")
	public void createFullAccessPatientTextProfile() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.fullAccessPatientText();
		patientPage.clickSubmitButton();
		System.out.println("Profile updated with full access to Patient Text");
		Hooks.scenario.log("Profile updated with full access to Patient Text");
	}

	@And("I create a profile with View access only to Patient Text test")
	public void createViewPatientTextProfile() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.viewPatientText();
		patientPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Patient Text");
		Hooks.scenario.log("Profile updated with View access only to Patient Text");
	}

	// GenerateNewAccessCode
	@And("the user should be able to add generate new access code test")
	public void addGenerateAccessCode() {
		sleep(4000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.userShouldBeAbleToAddGenerateNewAccessCode();
		System.out.println("User should be able to add generate new access code test");
		Hooks.scenario.log("User should be able to add generate new access code test");

	}

	@And("the user should not be able to add generate new access code test")
	public void cannotUsePatientTextActions() {
		patientPage.userShouldNotBeAbleToAddGenerateNewAccessCode();
		System.out.println("User should not be able to add generate new access code test");
		Hooks.scenario.log("User should not be able to add generate new access code test");

	}

	@And("the user should not be able to use Quick Text, Reply, or Send VCard test")
	public void cannotAddGenerateAccessCode() {
		patientPage.userShouldNotBeAbleToUseQuickTextReplyOrSendVCard();
		System.out.println("User should not be able to use Quick Text, Reply, or Send VCard test");
		Hooks.scenario.log("User should not be able to use Quick Text, Reply, or Send VCard test");

	}

	@And("I create a profile with Add access only to Generate New Access Code test")
	public void createAddGenerateAccessCodeProfile() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.addGenerateAccessCode();
		patientPage.clickSubmitButton();
		System.out.println("Profile updated with Add access only to Generate New Access Code");
		Hooks.scenario.log("Profile updated with Add access only to Generate New Access Code");
	}

	@And("I create a profile with no Add access to Generate New Access Code test")
	public void createNoAddGenerateAccessCodeProfile() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.noAddGenerateAccessCode();
		patientPage.clickSubmitButton();
		System.out.println("Profile updated with no Add access to Generate New Access Code");
		Hooks.scenario.log("Profile updated with no Add access to Generate New Access Code");
	}

	// PatientExternalSource
	@And("I create a profile with Add access only to Patient Module Patient External Source test")
	public void createAddPatientExternalSourceProfile() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.addPatientExternalSource();
		patientPage.clickSubmitButton();
		System.out.println("I create a profile with Add access only to Patient Module Patient External Source test");
		Hooks.scenario.log("I create a profile with Add access only to Patient Module Patient External Source test");

	}

	@And("I create a profile with Add, Edit, and Delete access to Patient Module Patient External Source test")
	public void createAddEditDeletePatientExternalSourceProfile() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.addEditDeletePatientExternalSource();
		patientPage.clickSubmitButton();
		System.out.println(
				"I create a profile with Add, Edit, and Delete access to Patient Module Patient External Source test");
		Hooks.scenario.log(
				"I create a profile with Add, Edit, and Delete access to Patient Module Patient External Source test");

	}

	@And("I create a profile with Add and Edit access to Patient Module Patient External Source test")
	public void createAddEditPatientExternalSourceProfile() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.addEditPatientExternalSource();
		patientPage.clickSubmitButton();
		System.out
				.println("I create a profile with Add and Edit access to Patient Module Patient External Source test");
		Hooks.scenario
				.log("I create a profile with Add and Edit access to Patient Module Patient External Source test");

	}

	@And("the user should not be able to edit or delete patient external source test")
	public void cannotEditOrDeletePatientExternalSource() {
		patientPage.userShouldNotBeAbleToEditOrDeletePatientExternalSource();
		System.out.println("User should not be able to edit or delete patient external source test");
		Hooks.scenario.log("User should not be able to edit or delete patient external source test");

	}

	@And("the user should be able to add patient external source test")
	public void addPatientExternalSource() {
		patientPage.userShouldBeAbleToAddPatientExternalSource();
		System.out.println("User should be able to add patient external source test");
		Hooks.scenario.log("User should be able to add patient external source test");

	}

	@And("the user should be able to edit patient external source test")
	public void updatePatientExternalSource() {
		sleep(4000);
		patientPage.userShouldBeAbleToEditPatientExternalSource();
		System.out.println("User should be able to edit patient external source test");
		Hooks.scenario.log("User should be able to edit patient external source test");

	}

	@And("the user should be able to delete patient external source test")
	public void deletePatientExternalSource() {
		sleep(4000);
		patientPage.userShouldBeAbleToDeletePatientExternalSource();
		System.out.println("User should be able to delete patient external source test");
		Hooks.scenario.log("User should be able to delete patient external source test");

	}

	// PatientFamily
	@And("the user should be able to add patient family test")
	public void canAddPatientFamily() {
		patientPage.userShouldBeAbleToAddPatientFamily();
		System.out.println("User should be able to add patient family test");
		Hooks.scenario.log("User should be able to add patient family test");

	}

	@And("the user should be able to delete patient family test")
	public void deletePatientFamily() {
		sleep(4000);
		patientPage.removePatientFamily();
		System.out.println("User should be able to delete patient family test");
		Hooks.scenario.log("User should be able to delete patient family test");

	}

	@And("I create a profile with Add and Delete access to Patient Module Patient Family test")
	public void createAddDeletePatientFamilyProfile() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.addDeletePatientFamily();
		patientPage.clickSubmitButton();
		System.out.println("I create a profile with Add and Delete access to Patient Module Patient Family test");
		Hooks.scenario.log("I create a profile with Add and Delete access to Patient Module Patient Family test");

	}

	@And("the user should not be able to delete patient family test")
	public void cannotDeletePatientFamily() {
		patientPage.userShouldNotBeAbleToDeletePatientFamily();
		System.out.println("User should not be able to delete patient family test");
		Hooks.scenario.log("User should not be able to delete patient family test");

	}

	@And("I create a profile with Add access only to Patient Module Patient Family test")
	public void createPatientFamilyAddProfile() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.addPatientFamily();
		patientPage.clickSubmitButton();
		System.out.println("I create a profile with Add access only to Patient Module Patient Family test");
		Hooks.scenario.log("I create a profile with Add access only to Patient Module Patient Family test");

	}

	// PatientCommunication
	@And("I create a profile with Add access only to Patient Module Patient Communication test")
	public void createProfileWithAddAccessToPatientCommunication() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.enableAddAccessPatientCommunication();
		patientPage.clickSubmitButton();
		System.out.println("I create a profile with Add access only to Patient Module Patient Communication test");
		Hooks.scenario.log("I create a profile with Add access only to Patient Module Patient Communication test");

	}

	@And("I create a profile with Add and Edit access to Patient Module Patient Communication test")
	public void createProfileWithAddEditPatientCommunication() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createAddEditPatientCommunicationProfile();
		patientPage.clickSubmitButton();
		System.out.println("I create a profile with Add and Edit access to Patient Module Patient Communication test");
		Hooks.scenario.log("I create a profile with Add and Edit access to Patient Module Patient Communication test");

	}

	@And("I create a profile with Add, Edit, and Delete access to Patient Module Patient Communication test")
	public void createAddEditDeletePatientCommunicationProfile() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createPatientCommunicationProfile();
		patientPage.clickSubmitButton();
		System.out.println(
				"I create a profile with Add, Edit, and Delete access to Patient Module Patient Communication test");
		Hooks.scenario.log(
				"I create a profile with Add, Edit, and Delete access to Patient Module Patient Communication test");

	}

	@And("the user should be able to add patient communication test")
	public void addPatientCommunicationTest() {
		sleep(4000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.verifyUserCanAddPatientCommunication();
		System.out.println("User should be able to add patient communication test");
		Hooks.scenario.log("User should be able to add patient communication test");

	}

	@And("the user should be able to edit patient communication test")
	public void editPatientCommunication() {
		sleep(4000);
		patientPage.userShouldBeAbleToEditPatientCommunication();
		System.out.println("User should be able to edit patient communication test");
		Hooks.scenario.log("User should be able to edit patient communication test");

	}

	@And("the user should be able to delete patient communication test")
	public void deletePatientCommunication() {
		sleep(4000);
		patientPage.deleteCommunication();
		System.out.println("User should be able to delete patient communication test");
		Hooks.scenario.log("User should be able to delete patient communication test");

	}

	@And("the user should not be able to delete patient communication test")
	public void cannotDeletePatientCommunication() {
		sleep(4000);
		patientPage.userShouldNotBeAbleToDeletePatientCommunication();
		System.out.println("User should not be able to delete patient communication test");
		Hooks.scenario.log("User should not be able to delete patient communication test");

	}

	@And("the user should not be able to edit or delete patient communication test")
	public void verifyUserCannotEditOrDeletePatientCommunication() {
		patientPage.verifyUserCannotEditOrDeletePatientCommunication();
		System.out.println("User should not be able to edit or delete patient communication test");
		Hooks.scenario.log("User should not be able to edit or delete patient communication test");

	}

	// PatientPhysian
	@And("the user should be able to add patient physician test")
	public void addPatientPhysician() {
		sleep(4000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.addPatientPhysician("Chapman");
		System.out.println("User should be able to add patient physician test");
		Hooks.scenario.log("User should be able to add patient physician test");

	}

	@And("the user should be able to edit patient physician test")
	public void editPatientPhysician() {
		sleep(4000);
		patientPage.addPatientPhysician("Chapman");
		System.out.println("User should be able to edit patient physician test");
		Hooks.scenario.log("User should be able to edit patient physician test");

	}

	@And("the user should be able to delete patient physician test")
	public void deletePatientPhysician() {
		sleep(4000);
		patientPage.deletePatientPhysician();
		System.out.println("User should be able to delete patient physician test");
		Hooks.scenario.log("User should be able to delete patient physician test");

	}

	@And("the user should not be able to delete patient physician test")
	public void verifyCannotDeletePatientPhysician() {
		sleep(4000);
		patientPage.verifyCannotDeletePatientPhysician();
		System.out.println("User should not be able to delete patient physician test");
		Hooks.scenario.log("User should not be able to delete patient physician test");

	}

	@And("the user should not be able to edit or delete patient physician test")
	public void verifyCannotEditOrDeletePatientPhysician() {
		patientPage.verifyCannotEditOrDeletePatientPhysician();
		System.out.println("User should not be able to edit or delete patient physician test");
		Hooks.scenario.log("User should not be able to edit or delete patient physician test");

	}

	@And("I create a profile with Add and Edit access to Patient Module Patient Physician test")
	public void createProfileWithAddAndEditAccessToPatientPhysician() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.enableAddEditPatientPhysicianAccess();
		patientPage.clickSubmitButton();
		System.out.println("I create a profile with Add and Edit access to Patient Module Patient Physician test");
		Hooks.scenario.log("I create a profile with Add and Edit access to Patient Module Patient Physician test");

	}

	@And("I create a profile with Add, Edit, and Delete access to Patient Module Patient Physician test")
	public void createProfileWithAddEditDeletePatientPhysician() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.enableFullAccessPatientPhysicianProfile();
		patientPage.clickSubmitButton();
		System.out.println(
				"I create a profile with Add, Edit, and Delete access to Patient Module Patient Physician test");
		Hooks.scenario
				.log("I create a profile with Add, Edit, and Delete access to Patient Module Patient Physician test");

	}

	@And("I create a profile with Add access only to Patient Module Patient Physician test")
	public void createProfileWithAddAccessToPatientPhysician() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.enableAddAccessPatientPhysician();
		patientPage.clickSubmitButton();
		System.out.println("I create a profile with Add access only to Patient Module Patient Physician test");
		Hooks.scenario.log("I create a profile with Add access only to Patient Module Patient Physician test");

	}

	// PatientPharmacy
	@And("I create a profile with Add and Edit access to Patient Module Patient Pharmacy test")
	public void createProfileWithAddAndEditAccessToPatientPharmacy() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.setupPatientPharmacyAddEditAccessProfile();
		patientPage.clickSubmitButton();
		System.out.println("I create a profile with Add and Edit access to Patient Module Patient Pharmacy test");
		Hooks.scenario.log("I create a profile with Add and Edit access to Patient Module Patient Pharmacy test");

	}

	@And("I create a profile with Add, Edit, and Delete access to Patient Module Patient Pharmacy test")
	public void createProfileWithAddEditDeletePatientPharmacy() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.enableFullAccessPatientPharmacyProfile();
		patientPage.clickSubmitButton();
		System.out.println(
				"I create a profile with Add, Edit, and Delete access to Patient Module Patient Pharmacy test");
		Hooks.scenario
				.log("I create a profile with Add, Edit, and Delete access to Patient Module Patient Pharmacy test");

	}

	@And("the user should be able to add patient pharmacy test")
	public void addPatientPharmacy() {
		sleep(4000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.addPatientPharmacy("Attorney");
		System.out.println("User should be able to add patient pharmacy test");
		Hooks.scenario.log("User should be able to add patient pharmacy test");

	}

	@And("the user should be able to edit patient pharmacy test")
	public void editPatientPharmacy() {
		sleep(4000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.editPatientPharmacy();
		System.out.println("User should be able to edit patient pharmacy test");
		Hooks.scenario.log("User should be able to edit patient pharmacy test");

	}

	@And("the user should not be able to delete patient pharmacy test")
	public void verifyCannotDeletePatientPharmacy() {
		sleep(4000);
		patientPage.verifyCannotDeletePatientPharmacy();
		System.out.println("User should not be able to delete patient pharmacy test");
		Hooks.scenario.log("User should not be able to delete patient pharmacy test");

	}

	@And("the user should be able to delete patient pharmacy test")
	public void deletePatientPharmacy() {
		sleep(4000);
		patientPage.deletePatientPharmacy();
		System.out.println("User should be able to delete patient pharmacy test");
		Hooks.scenario.log("User should be able to delete patient pharmacy test");

	}

	@And("the user should not be able to edit or delete patient pharmacy test")
	public void verifyCannotEditOrDeletePatientPharmacy() {
		sleep(4000);
		patientPage.verifyCannotEditOrDeletePatientPharmacy();
		System.out.println("User should not be able to edit or delete patient pharmacy test");
		Hooks.scenario.log("User should not be able to edit or delete patient pharmacy test");

	}

	// PatientPharmacy
	@And("I create a profile with Add access only to Patient Module Patient Pharmacy test")
	public void createProfileWithAddAccessToPatientPharmacy() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.setupPatientPharmacyAddAccessProfile();
		patientPage.clickSubmitButton();
		System.out.println("I create a profile with Add access only to Patient Module Patient Pharmacy test");
		Hooks.scenario.log("I create a profile with Add access only to Patient Module Patient Pharmacy test");

	}

	// PatientMedsOnChart
	@And("I create a profile with Add access only to Patient Module Patient Meds On Chart test")
	public void createProfileWithAddAccessToPatientMeds() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.addPatientMedsProfile();
		patientPage.clickSubmitButton();
		System.out.println("I create a profile with Add access only to Patient Module Patient Meds On Chart test");
		Hooks.scenario.log("I create a profile with Add access only to Patient Module Patient Meds On Chart test");

	}

	@And("I create a profile with Add and Edit access to Patient Module Patient Meds On Chart test")
	public void createProfileWithAddAndEditPatientMeds() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.setupPatientMedsAddEditProfile();
		patientPage.clickSubmitButton();
		System.out.println("I create a profile with Add and Edit access to Patient Module Patient Meds On Chart test");
		Hooks.scenario.log("I create a profile with Add and Edit access to Patient Module Patient Meds On Chart test");

	}

	@And("I create a profile with Add, Edit, and Delete access to Patient Module Patient Meds On Chart test")
	public void createProfileWithAddEditDeletePatientMeds() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.setupPatientMedsFullAccessProfile();
		patientPage.clickSubmitButton();
		System.out.println(
				"I create a profile with Add, Edit, and Delete access to Patient Module Patient Meds On Chart test");
		Hooks.scenario.log(
				"I create a profile with Add, Edit, and Delete access to Patient Module Patient Meds On Chart test");

	}

	@And("I create a profile with Add, Edit, Delete, and Copied To Medication access to Patient Module Patient Meds On Chart test")
	public void createProfileWithAddEditDeleteCopyPatientMeds() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.assignFullAccessPatientMedsOnChart();
		patientPage.clickSubmitButton();
		System.out.println(
				"I create a profile with Add, Edit, Delete, and Copied To Medication access to Patient Module Patient Meds On Chart test");
		Hooks.scenario.log(
				"I create a profile with Add, Edit, Delete, and Copied To Medication access to Patient Module Patient Meds On Chart test");

	}

	@And("the user should be able to add patient meds on chart test")
	public void addPatientMedsOnChart() {
		sleep(4000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.addPatientMedsOnChart("amoxilin");
		System.out.println("User should be able to add patient meds on chart test");
		Hooks.scenario.log("User should be able to add patient meds on chart test");

	}

	@And("the user should be able to edit patient meds on chart test")
	public void editPatientMedsOnChart() {
		sleep(4000);
		patientPage.editPatientMedsOnChart("amoxilin");
		System.out.println("User should be able to edit patient meds on chart test");
		Hooks.scenario.log("User should be able to edit patient meds on chart test");

	}

	@And("the user should not be able to edit, delete, Patient Meds On Chart test")
	public void verifyNoEditOrDeletePatientMedsOnChart() {
		sleep(4000);
		patientPage.verifyCannotEditOrDelete();
		System.out.println("User should not be able to edit or delete patient meds on chart test");
		Hooks.scenario.log("User should not be able to edit or delete patient meds on chart test");

	}

	@And("the user should be able to delete patient meds on chart test")
	public void deletePatientMedsOnChart() {
		sleep(4000);
		patientPage.deletePatientMedsOnChart();
		System.out.println("User should be able to delete patient meds on chart test");
		Hooks.scenario.log("User should be able to delete patient meds on chart test");

	}

	@And("the user should be able to copy patient meds to medication test")
	public void copyPatientMedsToMedication() {
		sleep(4000);
		patientPage.copyPatientMedsToMedication();
		System.out.println("User should be able to copy patient meds to medication test");
		Hooks.scenario.log("User should be able to copy patient meds to medication test");

	}

	@And("the user should not be able to delete meds on chart test")
	public void verifyCannotDeleteMedsOnChart() {
		sleep(4000);
		patientPage.verifyCannotDeleteMedsOnChart();
		System.out.println("User should not be able to delete patient meds on chart test");
		Hooks.scenario.log("User should not be able to delete patient meds on chart test");

	}

	// PatientMedicationpage
	@And("the user should be able to add patient medication test")
	public void shouldAddPatientMedication() {
		sleep(4000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.addPatientMedication();
		System.out.println("User should be able to add patient medication test");
		Hooks.scenario.log("User should be able to add patient medication test");

	}

	@And("the user should be able to edit patient medications test")
	public void shouldEditPatientMedication() {
		sleep(4000);
		patientPage.editPatientMedication();
		System.out.println("User should be able to edit patient medications test");
		Hooks.scenario.log("User should be able to edit patient medications test");

	}

	@And("the user should be able to delete patient medications test")
	public void shouldDeletePatientMedication() {
		sleep(4000);
		patientPage.deletePatientMedication();
		System.out.println("User should be able to delete patient medications test");
		Hooks.scenario.log("User should be able to delete patient medications test");

	}

	@And("the user should be able to view patient medication gross margin test")
	public void verifyUserCanViewPatientMedicationGrossMarginTest() {
		sleep(4000);
		patientPage.clickMedicationAndVerifyGM();
		System.out.println("User should be able to view patient medication gross margin test");
		Hooks.scenario.log("User should be able to view patient medication gross margin test");

	}

	@And("the user should be able to update patient medication sync test")
	public void updatePatientMedicationGrossMargin() {
		sleep(4000);
		patientPage.updatePatientMedicationGrossMargin("10");
		System.out.println("User should be able to update patient medication sync test");
		Hooks.scenario.log("User should be able to update patient medication sync test");

	}

	@And("the user should be able to update patient medication gross margin test")
	public void verifyUserCanUpdatePatientMedicationSyncTest() {
		sleep(4000);
		patientPage.updatePatientMedicationSync();
		System.out.println("User should be able to update patient medication gross margin test");
		Hooks.scenario.log("User should be able to update patient medication gross margin test");

	}

	@And("the user should not be able to edit, delete Patient Medication test")
	public void shouldNotEditOrDeletePatientMedication() {
		patientPage.verifyEditAndDeleteNotAvailable();
		System.out.println("User should not be able to edit or delete patient medication test");
		Hooks.scenario.log("User should not be able to edit or delete patient medication test");

	}

	@And("the user should not be able to delete Patient Medication test")
	public void shouldNotDeletePatientMedication() {
		patientPage.verifyDeleteNotAvailable();
		System.out.println("User should not be able to delete patient medication test");
		Hooks.scenario.log("User should not be able to delete patient medication test");

	}

// PatientClaimVerification
	@And("the user should be able to send patient claim verifications for signature test")
	public void shouldSendPatientClaimVerificationForSignature() {
		patientPage.sendPatientClaimVerificationForSignature();
		System.out.println("User should be able to send patient claim verifications for signature test");
		Hooks.scenario.log("User should be able to send patient claim verifications for signature test");

	}

	@And("the user should be able to add a patient claim verification test")
	public void shouldAddPatientClaimVerification() {
		sleep(4000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.addPatientClaimVerificationTest();
		System.out.println("User should be able to add a patient claim verification test");
		Hooks.scenario.log("User should be able to add a patient claim verification test");

	}

	@And("the user should be able to print patient claim verifications test")
	public void shouldPrintPatientClaimVerification() {
		sleep(4000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		System.out.println("User should be able to print patient claim verifications test");
		Hooks.scenario.log("User should be able to print patient claim verifications test");
		patientPage.printPatientClaimVerification();

	}

	@And("the user should be able to edit patient claim verifications test")
	public void shouldEditPatientClaimVerification() {
		sleep(4000);
		patientPage.editPatientClaimVerificationTest();
		System.out.println("User should be able to edit patient claim verifications test");
		Hooks.scenario.log("User should be able to edit patient claim verifications test");

	}

	@And("the user should not be able to edit, print, or send for signature for Patient Claim Verification test")
	public void shouldNotAllowEditPrintOrSendForSignature_PatientClaimVerification() {
		sleep(4000);
		patientPage.verifyEditPrintSendOptionsAreNotAvailable();
		System.out.println(
				"User should not be able to edit, print, or send for signature for Patient Claim Verification test");
		Hooks.scenario.log(
				"User should not be able to edit, print, or send for signature for Patient Claim Verification test");

	}

	@And("the user should not be able to print or send for signature for Patient Claim Verification test")
	public void shouldNotAllowPrintOrSendPatientClaimVerification() {
		sleep(4000);
		patientPage.verifyPrintAndSendOptionsAreNotAvailable();
		System.out
				.println("User should not be able to print or send for signature for Patient Claim Verification test");
		Hooks.scenario
				.log("User should not be able to print or send for signature for Patient Claim Verification test");

	}

	@And("the user should not be able to send for signature for Patient Claim Verification test")
	public void shouldNotAllowSendForSignaturePatientClaimVerification() {
		sleep(4000);
		patientPage.verifySendForSignatureNotAvailable();
		System.out.println("User should not be able to send for signature for Patient Claim Verification test");
		Hooks.scenario.log("User should not be able to send for signature for Patient Claim Verification test");

	}

	@And("I create a profile with Add access only to Patient Module Patient Claim Verification test")
	public void createProfileWithAddAccessToPatientClaimVerification() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.addAccessPatientClaimTest();
		patientPage.clickSubmitButton();
		System.out.println(
				"User creates a profile with Add access only to Patient Module Patient Claim Verification test");
		Hooks.scenario
				.log("User creates a profile with Add access only to Patient Module Patient Claim Verification test");

	}

	@And("I create a profile with Add and Edit access to Patient Module Patient Claim Verification test")
	public void testAddAndEditPatientClaimVerificationAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.addEditAccessPatientClaimVerificationTest();
		patientPage.clickSubmitButton();
		System.out.println(
				"User creates a profile with Add and Edit access to Patient Module Patient Claim Verification test");
		Hooks.scenario.log(
				"User creates a profile with Add and Edit access to Patient Module Patient Claim Verification test");

	}

	@And("I create a profile with Add, Edit, and Print access to Patient Module Patient Claim Verification test")
	public void testAddEditPrintAccessPatientClaimVerification() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.addEditPrintAccessPatientClaimVerificationTest();
		patientPage.clickSubmitButton();
		System.out.println(
				"User creates a profile with Add, Edit, and Print access to Patient Module Patient Claim Verification test");
		Hooks.scenario.log(
				"User creates a profile with Add, Edit, and Print access to Patient Module Patient Claim Verification test");

	}

	@And("I create a profile with Add access only to Patient Module Patient Medication test")
	public void testAddAccessPatientMedication() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.addAccessPatientMedicationTest();
		patientPage.clickSubmitButton();
		System.out.println("User creates a profile with Add access only to Patient Module Patient Medication test");
		Hooks.scenario.log("User creates a profile with Add access only to Patient Module Patient Medication test");

	}

	@And("I create a profile with Add and Edit access to Patient Module Patient Medication test")
	public void testAddAndEditAccessPatientMedication() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.addEditAccessPatientMedicationTest();
		patientPage.clickSubmitButton();
		System.out.println("User creates a profile with Add and Edit access to Patient Module Patient Medication test");
		Hooks.scenario.log("User creates a profile with Add and Edit access to Patient Module Patient Medication test");

	}

	@And("I create a profile with Add, Edit, and Delete access to Patient Module Patient Medication test")
	public void testAddEditDeleteAccessPatientMedication() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.testAddEditDeleteAccessPatientMedication();
		patientPage.clickSubmitButton();
		System.out.println(
				"User creates a profile with Add, Edit, and Delete access to Patient Module Patient Medication test");
		Hooks.scenario.log(
				"User creates a profile with Add, Edit, and Delete access to Patient Module Patient Medication test");

	}

	@And("I create a profile with Add, Edit, Delete, View Gross Margin, Update Sync, and Update Gross Margin access to Patient Module Patient Medication test")
	public void createProfileWithFullPatientMedicationAccessTest() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createPatientMedicationAllAccessTest();
		patientPage.clickSubmitButton();
		System.out.println(
				"User creates a profile with Add, Edit, Delete, View Gross Margin, Update Sync, and Update Gross Margin access to Patient Module Patient Medication test");
		Hooks.scenario.log(
				"User creates a profile with Add, Edit, Delete, View Gross Margin, Update Sync, and Update Gross Margin access to Patient Module Patient Medication test");

	}

	@And("I create a profile with Add, Edit, Print, and Send For Signature access to Patient Module Patient Claim Verification test")
	public void testAddEditPrintSendAccessPatientClaimVerification() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.addEditPrintSendAccessPatientClaimVerificationTest();
		patientPage.clickSubmitButton();
		System.out.println(
				"User creates a profile with Add, Edit, Print, and Send For Signature access to Patient Module Patient Claim Verification test");
		Hooks.scenario.log(
				"User creates a profile with Add, Edit, Print, and Send For Signature access to Patient Module Patient Claim Verification test");

	}

	// PatientHealthCard
	@And("I create a profile with Add access only to Patient Module Patient Health Card test")
	public void verifyProfileCreationWithPatientHealthCardAddAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createProfileWithPatientHealthCardAddOnly();
		patientPage.clickSubmitButton();
		System.out.println("User creates a profile with Add access only to Patient Module Patient Health Card test");
		Hooks.scenario.log("User creates a profile with Add access only to Patient Module Patient Health Card test");

	}

	@And("I create a profile with Add and Edit access to Patient Module Patient Health Card test")
	public void verifyProfileCreationWithPatientHealthCardAddEditAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createProfileWithHealthCardAddEditAccess();
		patientPage.clickSubmitButton();
		System.out
				.println("User creates a profile with Add and Edit access to Patient Module Patient Health Card test");
		Hooks.scenario
				.log("User creates a profile with Add and Edit access to Patient Module Patient Health Card test");

	}

	@And("I create a profile with Add, Edit, and Delete access to Patient Module Patient Health Card test")
	public void verifyProfileCreationWithPatientHealthCardAddEditDeleteAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createProfileWithHealthCardAddEditDeleteAccess();
		patientPage.clickSubmitButton();
		System.out.println(
				"User creates a profile with Add, Edit, and Delete access to Patient Module Patient Health Card test");
		Hooks.scenario.log(
				"User creates a profile with Add, Edit, and Delete access to Patient Module Patient Health Card test");

	}

	@And("I create a profile with Add access only to Patient Module Patient Intake Form test")
	public void verifyProfileCreationWithPatientIntakeFormAddOnlyAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createProfileWithHealthCardAddEditDeleteAccess();
		patientPage.clickSubmitButton();
		System.out.println("User creates a profile with Add access only to Patient Module Patient Intake Form test");
		Hooks.scenario.log("User creates a profile with Add access only to Patient Module Patient Intake Form test");

	}

	@And("I create a profile with Add and Edit access to Patient Module Patient Intake Form test")
	public void verifyProfileCreationWithPatientIntakeFormAddEditAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createProfileWithPatientIntakeFormAddEditAccess();
		patientPage.clickSubmitButton();
		System.out
				.println("User creates a profile with Add and Edit access to Patient Module Patient Intake Form test");
		Hooks.scenario
				.log("User creates a profile with Add and Edit access to Patient Module Patient Intake Form test");

	}

	@And("I create a profile with Add, Edit, and Print access to Patient Module Patient Intake Form test")
	public void verifyProfileCreationWithPatientIntakeFormAddEditPrintSendAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createProfileWithPatientIntakeFormAddEditAccess();
		patientPage.clickSubmitButton();
		System.out.println(
				"User creates a profile with Add, Edit, and Print access to Patient Module Patient Intake Form test");
		Hooks.scenario.log(
				"User creates a profile with Add, Edit, and Print access to Patient Module Patient Intake Form test");

	}

	@And("I create a profile with Add, Edit, Print, and Send For Signature access to Patient Module Patient Intake Form test")
	public void verifyProfileCreationWithPatientIntakeFormAddEditPrintAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.testIntakeFormAddEditPrintSend();
		patientPage.clickSubmitButton();
		System.out.println(
				"User creates a profile with Add, Edit, Print, and Send For Signature access to Patient Module Patient Intake Form test");
		Hooks.scenario.log(
				"User creates a profile with Add, Edit, Print, and Send For Signature access to Patient Module Patient Intake Form test");

	}

	@And("the user should be able to add a patient health card test")
	public void verifyUserCanAddPatientHealthCard() {
		sleep(4000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.addPatientHealthCard();
		System.out.println("User should be able to add a Patient Health Card test");
		Hooks.scenario.log("User should be able to add a Patient Health Card test");

	}

	@And("the user should be able to add a patient intake form test")
	public void verifyUserCanAddPatientIntakeForm() {
		sleep(4000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.addPatientIntakeForm();
		System.out.println("User should be able to add a Patient Intake Form test");
		Hooks.scenario.log("User should be able to add a Patient Intake Form test");

	}

	@And("the user should be able to edit patient intake forms test")
	public void verifyUserCanEditPatientIntakeForms() {
		sleep(4000);
		patientPage.editPatientIntakeForm();
		System.out.println("User should be able to edit a Patient Intake Form test");
		Hooks.scenario.log("User should be able to edit a Patient Intake Form test");

	}

	@And("the user should be able to print patient intake forms test")
	public void verifyUserCanPrintPatientIntakeForms() {
		sleep(4000);
		patientPage.printPatientIntakeForm();
		System.out.println("User should be able to print a Patient Intake Form test");
		Hooks.scenario.log("User should be able to print a Patient Intake Form test");

	}

	@And("the user should be able to send patient intake forms for signature test")
	public void verifyUserCanSendPatientIntakeFormsForSignature() {
		sleep(4000);
		patientPage.sendPatientIntakeFormForSignature();
		System.out.println("User should be able to send Patient Intake Forms for signature test");
		Hooks.scenario.log("User should be able to send Patient Intake Forms for signature test");

	}

	@And("the user should not be able to print or send for signature test")
	public void verifyUserCannotPrintOrSendForSignature() {
		sleep(4000);
		patientPage.verifyRestrictedPrintAndSignatureActions();
		System.out.println("User should not be able to print or send for signature test");
		Hooks.scenario.log("User should not be able to print or send for signature test");

	}

	@And("the user should not be able to edit, print, or send for signature test")
	public void verifyUserCannotEditPrintOrSendForSignature() {
		sleep(4000);
		patientPage.verifyRestrictedPatientIntakeFormActions();
		System.out.println("User should not be able to edit, print, or send for signature test");
		Hooks.scenario.log("User should not be able to edit, print, or send for signature test");

	}

	@And("the user should be able to edit patient health cards test")
	public void verifyUserCanEditPatientHealthCards() {
		sleep(4000);
		patientPage.editPatientHealthCard();
		System.out.println("User should be able to edit a Patient Health Card test");
		Hooks.scenario.log("User should be able to edit a Patient Health Card test");

	}

	@And("the user should be able to delete patient health cards test")
	public void verifyUserCanDeletePatientHealthCards() {
		sleep(4000);
		patientPage.deletePatientHealthCard();
		System.out.println("User should be able to delete a Patient Health Card test");
		Hooks.scenario.log("User should be able to delete a Patient Health Card test");

	}

	@Then("the user should not be able to edit or delete patient health cards test")
	public void verifyUserCannotEditOrDeletePatientHealthCards() {
		patientPage.verifyPatientHealthCardEditDeleteRestricted();
		System.out.println("User should not be able to edit or delete a Patient Health Card test");
		Hooks.scenario.log("User should not be able to edit or delete a Patient Health Card test");

	}

	@Then("the user should not be able to delete patient health cards test")
	public void verifyUserCannotDeletePatientHealthCards() {
		patientPage.verifyPatientHealthCardEditDeleteRestricted();
		System.out.println("User should not be able to delete a Patient Health Card test");
		Hooks.scenario.log("User should not be able to delete a Patient Health Card test");

	}

	// Bucketpage
	@And("I create a profile with View, Add Folder, Edit Folder, and Delete Folder access to Setup Module Bucket test")
	public void createSetupModuleBucketProfileWithFullFolderAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createSetupBucketFullFolderAccessProfile();
		patientPage.clickSubmitButton();
		System.out.println(
				"User creates a profile with View, Add Folder, Edit Folder, and Delete Folder access to Setup Module Bucket test");
		Hooks.scenario.log(
				"User creates a profile with View, Add Folder, Edit Folder, and Delete Folder access to Setup Module Bucket test");

	}

	@And("I create a profile with View, Add File, Edit File, Delete File, and Download File access to Setup Module Bucket test")
	public void createProfileWithBucketPermissions() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.verifyProfileCreationWithBucketFileAccess();
		patientPage.clickSubmitButton();
		System.out.println(
				"User creates a profile with View, Add File, Edit File, Delete File, and Download File access to Setup Module Bucket test");
		Hooks.scenario.log(
				"User creates a profile with View, Add File, Edit File, Delete File, and Download File access to Setup Module Bucket test");

	}

	@And("the user should be able to view buckets test")
	public void shouldAllowUserToViewBuckets() {
		sleep(4000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.viewBuckets();
		System.out.println("User should be able to view Buckets test");
		Hooks.scenario.log("User should be able to view Buckets test");

	}

	@Then("the user should not be able to add, edit, or delete folders test")
	public void verifyUserCannotAddEditOrDeleteFolders() {
		patientPage.verifyFolderModificationRestricted();
		System.out.println("User should not be able to add, edit, or delete folders test");
		Hooks.scenario.log("User should not be able to add, edit, or delete folders test");

	}

	@Then("the user should be able to download files test")
	public void verifyUserCanDownloadFiles() {
		patientPage.downloadFile();
		System.out.println("User should be able to download Files test");
		Hooks.scenario.log("User should be able to download Files test");

	}

	@Then("the user should be able to add new files to folders test")
	public void verifyUserCanAddNewFilesToFolders() {
		patientPage.addNewFileToFolder();
		System.out.println("User should be able to add new files to folders test");
		Hooks.scenario.log("User should be able to add new files to folders test");

	}

	@Then("the user should be able to edit existing files test")
	public void verifyUserCanEditExistingFiles() {
		patientPage.editExistingFile();
		System.out.println("User should be able to edit existing Files test");
		Hooks.scenario.log("User should be able to edit existing Files test");

	}

	@Then("the user should be able to delete files test")
	public void verifyUserCanDeleteFiles() {
		patientPage.deleteFile();
		System.out.println("User should be able to delete Files test");
		Hooks.scenario.log("User should be able to delete Files test");

	}

	@Then("the user should be able to add new folders test")
	public void verifyUserCanAddNewFolders() {
		patientPage.addNewFolder();
		System.out.println("User should be able to add new Folders test");
		Hooks.scenario.log("User should be able to add new Folders test");

	}

	@Then("the user should be able to edit existing folders test")
	public void verifyUserCanEditExistingFolders() {
		patientPage.editExistingFolder();
		System.out.println("User should be able to edit existing Folders test");
		Hooks.scenario.log("User should be able to edit existing Folders test");

	}

	@Then("the user should be able to delete folders test")
	public void verifyUserCanDeleteFolders() {
		patientPage.deleteFolder();
		System.out.println("User should be able to delete Folders test");
		Hooks.scenario.log("User should be able to delete Folders test");

	}

	// Enrollmentspage
	@And("I create a profile with View access only to Setup Module Enrollment test")
	public void createSetupModuleEnrollmentProfileWithViewAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createEnrollmentProfileWithViewAccess();
		patientPage.clickSubmitButton();
		System.out.println("User creates a profile with View access only to Setup Module Enrollment test");
		Hooks.scenario.log("User creates a profile with View access only to Setup Module Enrollment test");

	}

	@And("I create a profile with View and Add access to Setup Module Enrollment test")
	public void createSetupModuleEnrollmentProfileWithViewAndAddAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createSetupEnrollmentViewAddProfile();
		patientPage.clickSubmitButton();
		System.out.println("User creates a profile with View and Add access to Setup Module Enrollment test");
		Hooks.scenario.log("User creates a profile with View and Add access to Setup Module Enrollment test");

	}

	@And("I create a profile with View, Add, and Edit access to Setup Module Enrollment test")
	public void createSetupModuleEnrollmentProfileWithViewAddEditAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createSetupEnrollmentViewAddEditProfile();
		patientPage.clickSubmitButton();
		System.out.println("User creates a profile with View, Add, and Edit access to Setup Module Enrollment test");
		Hooks.scenario.log("User creates a profile with View, Add, and Edit access to Setup Module Enrollment test");

	}

	@And("I create a profile with View, Add, Edit, and Delete access to Setup Module Enrollment test")
	public void createSetupModuleEnrollmentProfileWithFullAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createSetupEnrollmentFullAccessProfile();
		patientPage.clickSubmitButton();
		System.out.println(
				"User creates a profile with View, Add, Edit, and Delete access to Setup Module Enrollment test");
		Hooks.scenario
				.log("User creates a profile with View, Add, Edit, and Delete access to Setup Module Enrollment test");

	}

	@And("the user should not be able to add, edit, or delete enrollments test")
	public void shouldRestrictUserFromManagingEnrollments() {
		sleep(2000);
		patientPage.verifyUserCannotManageEnrollments();
		System.out.println("User should not be able to add, edit, or delete Enrollments test");
		Hooks.scenario.log("User should not be able to add, edit, or delete Enrollments test");

	}

	@And("the user should not be able to edit or delete enrollments test")
	public void shouldRestrictUserFromEditingOrDeletingEnrollments() {
		sleep(2000);
		patientPage.restrictEnrollmentEditDelete();
		System.out.println("User should not be able to edit or delete Enrollments test");
		Hooks.scenario.log("User should not be able to edit or delete Enrollments test");

	}

	@And("the user should not be able to delete enrollments test")
	public void shouldRestrictUserFromDeletingEnrollments() {
		sleep(2000);
		patientPage.restrictEnrollmentDelete();
		System.out.println("User should not be able to delete Enrollments test");
		Hooks.scenario.log("User should not be able to delete Enrollments test");

	}

	@And("the user should be able to view enrollments test")
	public void shouldAllowUserToViewEnrollments() {
		sleep(4000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("enrollmentsPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Enrollments");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Enrollments"));
		System.out.println("User should be able to view Enrollments test");
		Hooks.scenario.log("User should be able to view Enrollments test");

	}

	@And("the user should be able to add a new enrollment test")
	public void shouldAllowUserToAddNewEnrollment() {
		sleep(4000);
		patientPage.addNewEnrollment("Test Enrollment");
		System.out.println("User should be able to add a new Enrollment test");
		Hooks.scenario.log("User should be able to add a new Enrollment test");

	}

	@And("the user should be able to edit an existing enrollment test")
	public void shouldAllowUserToEditExistingEnrollment() {
		sleep(4000);
		patientPage.editExistingEnrollment("Updated Enrollment Name");
		System.out.println("User should be able to edit an existing Enrollment test");
		Hooks.scenario.log("User should be able to edit an existing Enrollment test");

	}

	@And("the user should be able to delete an enrollment test")
	public void shouldAllowUserToDeleteEnrollment() {
		sleep(4000);
		patientPage.deleteEnrollment();
		System.out.println("User should be able to delete an Enrollment test");
		Hooks.scenario.log("User should be able to delete an Enrollment test");

	}

	// ReferralSourcepage
	@And("the user should be able to view referral sources test")
	public void shouldAllowUserToViewReferralSources() {
		sleep(4000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("referralSourcesPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/ReferralSources");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/ReferralSources"));
		System.out.println("User should be able to view Referral Sources test");
		Hooks.scenario.log("User should be able to view Referral Sources test");

	}

	@And("the user should be able to add a new referral source test")
	public void shouldAllowUserToAddNewReferralSource() {
		sleep(4000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("referralSourcesPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/ReferralSources");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/ReferralSources"));
		patientPage.addNewReferralSource();
		System.out.println("User should be able to add a new Referral Source test");
		Hooks.scenario.log("User should be able to add a new Referral Source test");

	}

	@And("the user should be able to edit an existing referral source test")
	public void shouldAllowUserToEditExistingReferralSource() {
		sleep(4000);
		patientPage.editReferralSource();
		System.out.println("User should be able to edit an existing Referral Source test");
		Hooks.scenario.log("User should be able to edit an existing Referral Source test");

	}

	@And("the user should not be able to edit or delete referral sources test")
	public void shouldRestrictUserFromEditingOrDeletingReferralSources() {
		sleep(4000);
		patientPage.verifyEditDeleteReferralSourceRestricted();
		System.out.println("User should not be able to edit or delete Referral Sources test");
		Hooks.scenario.log("User should not be able to edit or delete Referral Sources test");

	}

	@And("the user should not be able to delete referral sources test")
	public void shouldRestrictUserFromDeletingReferralSources() {
		sleep(4000);
		patientPage.restrictReferralSourceDelete();
		System.out.println("User should not be able to delete Referral Sources test");
		Hooks.scenario.log("User should not be able to delete Referral Sources test");

	}

	@And("the user should not be able to add, edit, or delete referral sources test")
	public void shouldRestrictUserFromManagingReferralSources() {
		sleep(2000);
		patientPage.shouldRestrictUserFromAddEditDeleteReferralSources();
		System.out.println("User should not be able to add, edit, or delete Referral Sources test");
		Hooks.scenario.log("User should not be able to add, edit, or delete Referral Sources test");

	}

	// ReviewCategorypage
	@And("the user should be able to view review categories test")
	public void shouldAllowUserToViewReviewCategories() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("reviewCategoriesPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/ReviewCategories");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/ReviewCategories"));
		System.out.println("User should be able to view Review Categories test");
		Hooks.scenario.log("User should be able to view Review Categories test");

	}

	@And("the user should not be able to edit or delete review categories test")
	public void shouldRestrictUserFromEditingOrDeletingReviewCategories() {
		sleep(2000);
		patientPage.shouldRestrictUserFromEditingOrDeletingReviewCategories();
		System.out.println("User should not be able to edit or delete Review Categories test");
		Hooks.scenario.log("User should not be able to edit or delete Review Categories test");

	}

	@And("the user should not be able to delete review categories test")
	public void shouldRestrictUserFromDeletingReviewCategories() {
		sleep(2000);
		patientPage.restrictReviewCategoryDelete();
		System.out.println("User should not be able to delete Review Categories test");
		Hooks.scenario.log("User should not be able to delete Review Categories test");

	}

	@And("the user should be able to add a new review category test")
	public void shouldAllowUserToAddNewReviewCategory() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("reviewCategoriesPageUrl");
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/ReviewCategories");
		Assert.assertTrue("Review Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/ReviewCategories"));
		patientPage.addNewReviewCategory("Cardiology Review", "Review for cardiology patients");
		patientPage.editReviewCategory("Cardiology Review", "Review for cardiology patients");
		System.out.println("User should be able to add a new Review Category test");
		Hooks.scenario.log("User should be able to add a new Review Category test");

	}

	@And("the user should be able to edit an existing review category test")
	public void shouldAllowUserToEditExistingReviewCategory() {
		sleep(2000);
		patientPage.editReviewCategory("Cardiology Review", "Review for cardiology patients");
		System.out.println("User should be able to edit an existing Review Category test");
		Hooks.scenario.log("User should be able to edit an existing Review Category test");

	}

	@And("the user should be able to delete a review category test")
	public void shouldAllowUserToDeleteReviewCategory() {
		sleep(2000);
		patientPage.deleteReviewCategory();
		System.out.println("User should be able to delete a Review Category test");
		Hooks.scenario.log("User should be able to delete a Review Category test");

	}

	@And("the user should not be able to add, edit, or delete review categories test")
	public void shouldRestrictUserFromManagingReviewCategories() {
		sleep(2000);
		patientPage.verifyAddEditDeleteRestricted();
		System.out.println("User should not be able to add, edit, or delete Review Categories test");
		Hooks.scenario.log("User should not be able to add, edit, or delete Review Categories test");

	}

	// PatientPage
	@And("the user should be able to reset a patient password test")
	public void testUserCanResetPatientPassword() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientsPageUrl = Hooks.prop.getProperty("patientsPageUrl");
		String fullUrl = baseUrl + patientsPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.resetPatientPassword("Admin@123");
		System.out.println("User should be able to reset a Patient Password test");
		Hooks.scenario.log("User should be able to reset a Patient Password test");

	}

	@And("the user should be able to delete an RPM device test")
	public void testUserCanDeleteRPMDevice() {
		sleep(2000);
		patientPage.deleteRPMDevice();
		System.out.println("User should be able to delete an RPM Device test");
		Hooks.scenario.log("User should be able to delete an RPM Device test");

	}

	@And("the user should be able to edit an RPM device test")
	public void testUserCanEditRPMDevice() {
		sleep(2000);
		patientPage.editRPMDevice();
		System.out.println("User should be able to edit an existing RPM Device test");
		Hooks.scenario.log("User should be able to edit an existing RPM Device test");

	}

	@And("the user should be able to add an RPM device test")
	public void testUserCanAddRPMDevice() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientsPageUrl = Hooks.prop.getProperty("patientsPageUrl");
		String fullUrl = baseUrl + patientsPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.addRPMDevice();
		System.out.println("User should be able to add an RPM Device test");
		Hooks.scenario.log("User should be able to add an RPM Device test");

	}

	@And("the user should be able to export patient data to excel test")
	public void testUserCanExportPatientDataToExcel() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientsPageUrl = Hooks.prop.getProperty("patientsPageUrl");
		String fullUrl = baseUrl + patientsPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.exportPatientDataToExcel();
		System.out.println("User should be able to export Patient Data to Excel test");
		Hooks.scenario.log("User should be able to export Patient Data to Excel test");

	}

	@And("the user should be able to make an outgoing call test")
	public void testUserCanMakeOutgoingCall() {
		sleep(2000);
		patientPage.makeOutgoingCall();
		System.out.println("User should be able to make an outgoing call test");
		Hooks.scenario.log("User should be able to make an outgoing call test");

	}

	@And("the user should be able to set delivery preference test")
	public void testUserCanSetDeliveryPreference() {
		sleep(2000);
		patientPage.setDeliveryPreferences(1, 2);
		System.out.println("User should be able to set Delivery Preference test");
		Hooks.scenario.log("User should be able to set Delivery Preference test");

	}

	@And("the user should be able to update patient status test")
	public void testUserCanUpdatePatientStatus() {
		sleep(2000);
		patientPage.updateStatusByIndex(1);
		System.out.println("User should be able to update Patient Status test");
		Hooks.scenario.log("User should be able to update Patient Status test");

	}

	@And("the user should be able to delete a patient enrollment test")
	public void testUserCanDeletePatientEnrollment() {
		sleep(2000);
		patientPage.deleteFirstEnrollment();
		System.out.println("User should be able to delete a Patient Enrollment test");
		Hooks.scenario.log("User should be able to delete a Patient Enrollment test");

	}

	@And("the user should be able to add a patient enrollment test")
	public void testUserCanAddPatientEnrollment() {
		sleep(2000);
		patientPage.addPatientEnrollment();
		System.out.println("User should be able to add a Patient Enrollment test");
		Hooks.scenario.log("User should be able to add a Patient Enrollment test");

	}

	@And("the user should be able to delete a referral source test")
	public void testUserCanDeleteReferralSource() {
		sleep(2000);
		patientPage.deleteFirstReferralSource();
		System.out.println("User should be able to delete a Referral Source test");
		Hooks.scenario.log("User should be able to delete a Referral Source test");

	}

	@And("the user should be able to view patient prescriptions test")
	public void userNavigatesToPatientPrescriptions() {
		sleep(2000);
		patientPage.viewPatientPrescriptions();
		System.out.println("User should be able to view Patient Prescriptions test");
		Hooks.scenario.log("User should be able to view Patient Prescriptions test");

	}

	@And("the user should be able to add a referrals test")
	public void addPatientReferral() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String generateReferralUrl = Hooks.prop.getProperty("GenerateReferralsPageUrl");
		String referralFullUrl = baseUrl + generateReferralUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(referralFullUrl, "/Referral/Home/GenerateReferral");
		patientPage.generateReferral("0004403", "Pate");
		Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("/Referral/Home/GenerateReferral"));

		sleep(2000);
		String patientsPageUrl = Hooks.prop.getProperty("patientsPageUrl");
		String patientsFullUrl = baseUrl + patientsPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(patientsFullUrl, "/Patient/Home/Patients");
		Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.verifyReferralInPatient("0004403");
		System.out.println("User should be able to add a Referrals test");
		Hooks.scenario.log("User should be able to add a Referrals test");

	}

	@And("the user should be able to delete a referrals test")
	public void deletePatientReferral() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String generateReferralUrl = Hooks.prop.getProperty("GenerateReferralsPageUrl");
		String referralFullUrl = baseUrl + generateReferralUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(referralFullUrl, "/Referral/Home/GenerateReferral");
		patientPage.deleteReffral();
		Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("/Referral/Home/GenerateReferral"));
		sleep(2000);
		String patientsPageUrl = Hooks.prop.getProperty("patientsPageUrl");
		String patientsFullUrl = baseUrl + patientsPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(patientsFullUrl, "/Patient/Home/Patients");
		Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.verifyDeletedReferralEntry("0004403");
		System.out.println("User should be able to delete a Referrals test");
		Hooks.scenario.log("User should be able to delete a Referrals test");

	}

	@And("the user should be able to delete a mapped tag test")
	public void userShouldBeAbleToDeleteMappedTag() {
		sleep(2000);
		patientPage.deleteMappedTag();
		System.out.println("User should be able to delete a Mapped Tag test");
		Hooks.scenario.log("User should be able to delete a Mapped Tag test");

	}

	@And("the user should be able to add a referral source test")
	public void addReferralSource() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientsPageUrl = Hooks.prop.getProperty("patientsPageUrl");
		String fullUrl = baseUrl + patientsPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.addReferralSource();
		System.out.println("User should be able to add a Referral Source test");
		Hooks.scenario.log("User should be able to add a Referral Source test");

	}

	@And("the user should be able to map a tag test")
	public void userShouldBeAbleToMapTag() {
		sleep(2000);
		patientPage.mapTagToPatient();
		System.out.println("User should be able to map a Tag test");
		Hooks.scenario.log("User should be able to map a Tag test");

	}

	@And("the user should be able to print a patient signature test")
	public void userShouldBeAbleToPrintPatientSignature() {
		sleep(2000);
		patientPage.printPatientSignature();
		System.out.println("User should be able to print a Patient Signature test");
		Hooks.scenario.log("User should be able to print a Patient Signature test");

	}

	@And("the user should be able to send a patient for signature test")
	public void userShouldBeAbleToSendPatientForSignature() {
		sleep(2000);
		patientPage.sendPatientForSignature();
		System.out.println("Patient user has sent the patient for signature");
		Hooks.scenario.log("Patient user has sent the patient for signature");
	}

	@And("the user should be able to send a patient for review test")
	public void userShouldBeAbleToSendPatientForReview() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + patientPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.sendPatientForReview();
		System.out.println("User should be able to send a Patient for Review test");
		Hooks.scenario.log("User should be able to send a Patient for Review test");

	}

	@And("the user should not be able to send a patient for review test")
	public void userShouldNotBeAbleToSendPatientForReviewTest() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + patientPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.verifyPatientReviewRestricted();
		System.out.println("User should not be able to send a Patient for Review test");
		Hooks.scenario.log("User should not be able to send a Patient for Review test");

	}

	@And("the user should be able to update DeDupe records test")
	public void verifyUserCanUpdateDeDupeRecords() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deDupePageUrl = Hooks.prop.getProperty("dedupePatientsPageUrl");
		String fullUrl = baseUrl + deDupePageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/DeDupePatients");
		Assert.assertTrue("DeDupe page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/DeDupePatients"));
		patientPage.updateDeDupeRecords();
		System.out.println("User should be able to update DeDupe Records test");
		Hooks.scenario.log("User should be able to update DeDupe Records test");

	}

	@And("the user can view tags but cannot add, edit, or delete them")
	public void userCanViewButCannotModifyTags() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String tagsPageUrl = Hooks.prop.getProperty("tagsPageUrl");
		String fullUrl = baseUrl + tagsPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Tags");
		Assert.assertTrue("Tags page is not displayed", Hooks.driver.getCurrentUrl().contains("/Patient/Home/Tags"));
		patientPage.verifyAddEditDeleteRestricted();
		System.out.println("User can view Tags but cannot add, edit, or delete them test");
		Hooks.scenario.log("User can view Tags but cannot add, edit, or delete them test");

	}

	@And("the user should be able to view tags and add a new tag test")
	public void verifyUserCanViewAndAddTags() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String tagsPageUrl = Hooks.prop.getProperty("tagsPageUrl");
		String fullUrl = baseUrl + tagsPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Tags");
		Assert.assertTrue("Tags page is not displayed", Hooks.driver.getCurrentUrl().contains("/Patient/Home/Tags"));
		patientPage.createNewTag("tagA");
		System.out.println("User should be able to view Tags and add a new Tag test");
		Hooks.scenario.log("User should be able to view Tags and add a new Tag test");

	}

	@And("user should be able to view, add, and edit tags")
	public void viewAddEditTags() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String tagsPageUrl = Hooks.prop.getProperty("tagsPageUrl");
		String fullUrl = baseUrl + tagsPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Tags");
		Assert.assertTrue("Tags page is not displayed", Hooks.driver.getCurrentUrl().contains("/Patient/Home/Tags"));
		patientPage.createNewTag("Test Tag");
		patientPage.editTag("Updated Test Tag");
		System.out.println("User should be able to view, add, and edit Tags test");
		Hooks.scenario.log("User should be able to view, add, and edit Tags test");

	}

	@And("user should be able to view, add, edit, and delete tags")
	public void viewAddEditDeleteTags() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String tagsPageUrl = Hooks.prop.getProperty("tagsPageUrl");
		String fullUrl = baseUrl + tagsPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Tags");
		Assert.assertTrue("Tags page is not displayed", Hooks.driver.getCurrentUrl().contains("/Patient/Home/Tags"));
		patientPage.createNewTag("Test Tag");
		patientPage.editTag("Updated Test Tag");
		patientPage.deleteTag();
		System.out.println("User should be able to view, add, edit, and delete Tags test");
		Hooks.scenario.log("User should be able to view, add, edit, and delete Tags test");

	}

	@And("the user should not be able to edit or delete tags test")
	public void verifyUserCannotEditOrDeleteTags() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String tagsPageUrl = Hooks.prop.getProperty("tagsPageUrl");
		String fullUrl = baseUrl + tagsPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Tags");
		Assert.assertTrue("Tags page is not displayed", Hooks.driver.getCurrentUrl().contains("/Patient/Home/Tags"));
		patientPage.thenUserCannotEditOrDeleteTags();
		System.out.println("User should not be able to edit or delete Tags test");
		Hooks.scenario.log("User should not be able to edit or delete Tags test");

	}

	@And("the user should not be able to delete tags test")
	public void verifyUserCannotDeleteTags() {
		sleep(2000);
		patientPage.thenUserCannotDeleteTags();
		System.out.println("User should not be able to delete Tags test");
		Hooks.scenario.log("User should not be able to delete Tags test");

	}

	@And("the user should not be able to update DeDupe records via UI or direct URL test")
	public void verifyUserCannotUpdateDeDupeRecordsViaUIOrDirectURL() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deDupePageUrl = Hooks.prop.getProperty("dedupePatientsPageUrl");
		String fullUrl = baseUrl + deDupePageUrl;
		patientPage = new patientpage(Hooks.driver);
		Hooks.driver.get(fullUrl);
		patientPage.verifyDeDupeAccessRestrictedViaUIOrDirectURL();
		System.out.println("User should not be able to update DeDupe Records via UI or direct URL test");
		Hooks.scenario.log("User should not be able to update DeDupe Records via UI or direct URL test");

	}

	@And("the user should not be able to send a patient for signature test")
	public void userShouldNotBeAbleToSendPatientForSignatureTest() {
		sleep(2000);
		patientPage.verifyPatientSignatureRestricted();
		System.out.println("User should not be able to send a Patient for Signature test");
		Hooks.scenario.log("User should not be able to send a Patient for Signature test");

	}

	@And("the user should not be able to print a patient signature test")
	public void userShouldNotBeAbleToPrintPatientSignatureTest() {
		sleep(2000);
		patientPage.verifyPatientSignaturePrintRestricted();
		System.out.println("User should not be able to print a Patient Signature test");
		Hooks.scenario.log("User should not be able to print a Patient Signature test");

	}

	@And("the user should not be able to map a tag test")
	public void userShouldNotBeAbleToMapTagTest() {
		sleep(2000);
		patientPage.verifyTagMappingRestricted();
		System.out.println("User should not be able to map a Tag test");
		Hooks.scenario.log("User should not be able to map a Tag test");

	}

	@And("the user should not be able to delete a mapped tag test")
	public void userShouldNotBeAbleToDeleteMappedTagTest() {
		sleep(2000);
		patientPage.verifyMappedTagDeletionRestricted();
		System.out.println("User should not be able to delete a Mapped Tag test");
		Hooks.scenario.log("User should not be able to delete a Mapped Tag test");

	}

	@And("the user should not be able to view patient prescriptions test")
	public void userShouldNotBeAbleToViewPatientPrescriptionsTest() {
		sleep(2000);
		patientPage.verifyPatientPrescriptionViewRestricted();
		System.out.println("User should not be able to view Patient Prescriptions test");
		Hooks.scenario.log("User should not be able to view Patient Prescriptions test");

	}

	@And("the user should not be able to add a referral source test")
	public void userShouldNotBeAbleToAddReferralSourceTest() {
		sleep(2000);
		patientPage.verifyReferralSourceAddRestricted();
		System.out.println("User should not be able to add a Referral Source test");
		Hooks.scenario.log("User should not be able to add a Referral Source test");

	}

	@And("the user should not be able to delete a referral source test")
	public void userShouldNotBeAbleToDeleteReferralSourceTest() {
		sleep(2000);
		patientPage.verifyReferralSourceDeletionRestricted();
		System.out.println("User should not be able to delete a Referral Source test");
		Hooks.scenario.log("User should not be able to delete a Referral Source test");

	}

	@And("the user should not be able to add a patient enrollment test")
	public void userShouldNotBeAbleToAddPatientEnrollmentTest() {
		sleep(2000);
		patientPage.verifyPatientEnrollmentAddRestricted();
		System.out.println("User should not be able to add a Patient Enrollment test");
		Hooks.scenario.log("User should not be able to add a Patient Enrollment test");

	}

	@And("the user should not be able to delete a patient enrollment test")
	public void userShouldNotBeAbleToDeletePatientEnrollmentTest() {
		sleep(2000);
		patientPage.verifyPatientEnrollmentDeletionRestricted();
		System.out.println("User should not be able to delete a Patient Enrollment test");
		Hooks.scenario.log("User should not be able to delete a Patient Enrollment test");

	}

	@And("the user should not be able to update patient status test")
	public void userShouldNotBeAbleToUpdatePatientStatusTest() {
		sleep(2000);
		patientPage.verifyPatientStatusUpdateRestricted();
		System.out.println("User should not be able to update Patient Status test");
		Hooks.scenario.log("User should not be able to update Patient Status test");

	}

	@And("the user should not be able to set delivery preference test")
	public void userShouldNotBeAbleToSetDeliveryPreferenceTest() {
		sleep(2000);
		patientPage.verifyDeliveryPreferenceSetRestricted();
		System.out.println("User should not be able to set Delivery Preference test");
		Hooks.scenario.log("User should not be able to set Delivery Preference test");

	}

	@And("the user should not be able to make an outgoing call test")
	public void userShouldNotBeAbleToMakeOutgoingCallTest() {
		sleep(2000);
		patientPage.verifyOutgoingCallRestricted();
		System.out.println("User should not be able to make an Outgoing Call test");
		Hooks.scenario.log("User should not be able to make an Outgoing Call test");

	}

	@And("the user should not be able to export patient data to excel test")
	public void userShouldNotBeAbleToExportPatientDataToExcelTest() {
		sleep(2000);
		patientPage.verifyPatientDataExportRestricted();
		System.out.println("User should not be able to export Patient Data to Excel test");
		Hooks.scenario.log("User should not be able to export Patient Data to Excel test");

	}

	@And("the user should not be able to add an RPM device test")
	public void userShouldNotBeAbleToAddRPMDeviceTest() {
		sleep(2000);
		patientPage.verifyRPMDeviceAddRestricted();
		System.out.println("User should not be able to add an RPM Device test");
		Hooks.scenario.log("User should not be able to add an RPM Device test");

	}

	@And("the user should not be able to edit an RPM device test")
	public void userShouldNotBeAbleToEditRPMDeviceTest() {
		sleep(2000);
		patientPage.verifyRPMDeviceEditRestricted();
		System.out.println("User should not be able to edit an RPM Device test");
		Hooks.scenario.log("User should not be able to edit an RPM Device test");

	}

	@And("the user should not be able to delete an RPM device test")
	public void userShouldNotBeAbleToDeleteRPMDeviceTest() {
		sleep(2000);
		patientPage.verifyRPMDeviceDeletionRestricted();
		System.out.println("User should not be able to delete an RPM Device test");
		Hooks.scenario.log("User should not be able to delete an RPM Device test");

	}

	@And("the user should not be able to reset a patient password test")
	public void userShouldNotBeAbleToResetPatientPasswordTest() {
		sleep(2000);
		patientPage.verifyPatientPasswordResetRestricted();
		System.out.println("User should not be able to reset a Patient Password test");
		Hooks.scenario.log("User should not be able to reset a Patient Password test");

	}

	@Then("the patient user should not be able to edit or delete patients test")
	public void patientUserShouldNotBeAbleToEditOrDeletePatientsTest() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + patientPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.clickPatientRowActionButton();
		Assert.assertFalse("Edit option is visible for patient user", patientPage.isEditOptionVisible());
		Assert.assertFalse("Delete option is visible for patient user", patientPage.isDeleteOptionVisible());
		System.out.println("Patient user should not be able to edit or delete Patients test");
		Hooks.scenario.log("Patient user should not be able to edit or delete Patients test");

	}

	@Then("the user should not be able to delete patients test")
	public void verifyUserCannotDeletePatient() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + patientPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.clickPatientRowActionButton();
		Assert.assertFalse("Delete option is visible for patient user", patientPage.isDeleteOptionVisible());
		System.out.println("User should not be able to delete Patients test");
		Hooks.scenario.log("User should not be able to delete Patients test");

	}

	@Then("the user should be able to delete a patient test")
	public void deletePatient() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + patientPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.clickPatientRowActionButton();
		patientPage.deletePatient();
		System.out.println("User should be able to delete a Patient test");
		Hooks.scenario.log("User should be able to delete a Patient test");

	}

	@Then("the user should be able to add a new patient test")
	public void patientUserCanAddNewPatientTest() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + patientPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.clickNewPatientButton();
		patientPage.addNewPatient("Smith", "John", "01/01/1990", "9876543210");
		System.out.println("User should be able to add a new Patient test");
		Hooks.scenario.log("User should be able to add a new Patient test");

	}

	@Then("the user should be able to edit an existing patient test")
	public void editExistingPatient() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + patientPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		patientPage.clickPatientRowActionButton();
		patientPage.clickPatientEditButton();
		patientPage.enterPatientPrivateNotes("Patient has allergy to penicillin.");
		System.out.println("User should be able to edit an existing Patient test");
		Hooks.scenario.log("User should be able to edit an existing Patient test");

	}

	@Then("the user should not be able to add, edit, or delete patients test")
	public void userShouldNotBeAbleToAddEditOrDeletePatients() {
		patientPage.verifyViewOnlyUserCannotAddEditDeletePatients();
		System.out.println("User should not be able to add, edit, or delete Patients test");
		Hooks.scenario.log("User should not be able to add, edit, or delete Patients test");

	}

	@Then("the user should remain on the Add Tag form without saving the tag")
	public void verifyUserRemainsOnAddTagForm() {
		boolean isOnForm = patientPage.isOnAddTagForm();
		if (isOnForm) {
			System.out.println("User remains on the Add Tag form without saving the tag");
			Hooks.scenario.log("User remains on the Add Tag form without saving the tag");
		} else {
			System.out.println("User left the Add Tag form unexpectedly");
			Hooks.scenario.log("User left the Add Tag form unexpectedly");
			throw new AssertionError("User did not remain on the Add Tag form");
		}
	}

	@Then("the system should display a validation message indicating that Tag name is required")
	public void verifyTagNameRequiredValidationMessage() {
		boolean isValidationDisplayed = patientPage.isTagNameRequiredValidationDisplayed();
		if (isValidationDisplayed) {
			System.out.println("Tag name required validation message is displayed");
			Hooks.scenario.log("Tag name required validation message is displayed");
		} else {
			System.out.println("Tag name required validation message is NOT displayed");
			Hooks.scenario.log("Tag name required validation message is NOT displayed");
			throw new AssertionError("Tag name required validation message not displayed");
		}
	}

	@And("user clicks on Save button without entering any tag")
	public void userClicksOnSaveButtonWithoutEnteringTag() {
		patientPage.clickOnSaveTagButton();
		System.out.println("Clicked on Save button without entering any tag");
		Hooks.scenario.log("Clicked on Save button without entering any tag");
	}

	@When("user clicks on Add Tag button for a patient")
	public void userClicksOnAddTagButtonForPatient() {
		patientPage.clickOnAddTagButton();
		System.out.println("Clicked on Add Tag button for a patient");
		Hooks.scenario.log("Clicked on Add Tag button for a patient");
	}

	@Then("the system should display a validation message indicating that Email is required")
	public void verifyEmailRequiredValidationMessage() {
		boolean isValidationDisplayed = patientPage.isEmailRequiredValidationDisplayed();
		if (isValidationDisplayed) {
			System.out.println("Email required validation message is displayed");
			Hooks.scenario.log("Email required validation message is displayed");
		} else {
			System.out.println("Email required validation message is NOT displayed");
			Hooks.scenario.log("Email required validation message is NOT displayed");
			throw new AssertionError("Email required validation message not displayed");
		}
	}

	@And("user enables patient login option")
	public void userEnablesPatientLoginOption() {
		patientPage.clickOnPatientActionMenuForBlankEmail();
		patientPage.clickOnEnableLoginOption();
		System.out.println("User enables Patient Login option test");
		Hooks.scenario.log("User enables Patient Login option test");

	}

	@Then("the user should remain on the Add to Trial form without progressing to the next step")
	public void verifyUserRemainsOnAddToTrialForm() {
		boolean isOnForm = patientPage.isOnAddToTrialForm();
		if (isOnForm) {
			System.out.println("User remains on the Add to Trial form");
			Hooks.scenario.log("User remains on the Add to Trial form");
		} else {
			System.out.println("User progressed to the next step unexpectedly");
			Hooks.scenario.log("User progressed to the next step unexpectedly");
			throw new AssertionError("User did not remain on the Add to Trial form");
		}
	}

	@When("user clicks on Add to Trial button for a patient")
	public void userClicksOnAddToTrialButtonForPatient() {
		patientPage.clickOnPatientActionMenu();
		patientPage.clickOnAddToTrialOption();
		System.out.println("Clicked on Add to Trial button for a patient");
		Hooks.scenario.log("Clicked on Add to Trial button for a patient");
	}

	@Then("the patient details should not be updated and patient list should remain unchanged")
	public void verifyPatientDetailsNotUpdatedAndListUnchanged() {
		String originalValue = "";
		boolean result = patientPage.isPatientDetailsNotUpdatedAndListUnchanged(originalValue);
		if (result) {
			System.out.println("Patient details not updated and patient list unchanged");
			Hooks.scenario.log("Patient details not updated and patient list unchanged");
		} else {
			System.out.println("Patient details were updated or list changed");
			Hooks.scenario.log("Patient details were updated or list changed");
			throw new AssertionError("Edit Cancel failed: Patient details updated or list changed");
		}
	}

	@Then("user clicks on Cancel button in Edit Patient")
	public void userClicksOnCancelButtonInEditPatient() {
		patientPage.clickOnEditPatientCancelButton();
		System.out.println("Clicked on Cancel button in Edit Patient");
		Hooks.scenario.log("Clicked on Cancel button in Edit Patient");
	}

	@And("user updates patient details")
	public void userUpdatesPatientDetails() {
		patientPage.updateNextOfKinLastName("TestKin");
		System.out.println("User updates Patient Details test");
		Hooks.scenario.log("User updates Patient Details test");

	}

	@When("user clicks on Edit Patient button in Patient module")
	public void userClicksOnEditPatientButtonInPatientModule() {
		patientPage.clickOnPatientActionMenu();
		patientPage.clickOnEditPatientOption();
		System.out.println("Clicked on Edit Patient button in Patient module");
		Hooks.scenario.log("Clicked on Edit Patient button in Patient module");
	}

	@Then("the filter should be cleared and patient list should remain unchanged")
	public void verifyFilterClearedAndPatientListUnchanged() {
		boolean result = patientPage.isFilterClearedAndPatientListVisible();
		if (result) {
			System.out.println("Filter cleared and patient list remains unchanged");
			Hooks.scenario.log("Filter cleared and patient list remains unchanged");
		} else {
			System.out.println("Filter not cleared or patient list changed");
			Hooks.scenario.log("Filter not cleared or patient list changed");
			throw new AssertionError("Filter cancel did not reset filter or patient list");
		}
	}

	@Then("user clicks on Cancel button in Filter")
	public void userClicksOnCancelButtonInFilter() {
		patientPage.clickOnFilterCancelButton();
		System.out.println("Clicked on Cancel button in Filter");
		Hooks.scenario.log("Clicked on Cancel button in Filter");
	}

	@And("user enters filter criteria")
	public void userEntersFilterCriteria() {
		patientPage.enterFilterLastName("Test");
		System.out.println("User enters Filter Criteria test");
		Hooks.scenario.log("User enters Filter Criteria test");

	}

	@When("user clicks on Filter button in Patient module")
	public void userClicksOnFilterButtonInPatientModule() {
		patientPage.clickOnFilterButton();
		System.out.println("Clicked on Filter button in Patient module");
		Hooks.scenario.log("Clicked on Filter button in Patient module");
	}

	@Then("the user should remain on the Add New Patient form without progressing to the next step")
	public void verifyUserRemainsOnAddNewPatientForm() {
		boolean isOnForm = patientPage.isOnAddNewPatientForm();
		if (isOnForm) {
			System.out.println("User remains on the Add New Patient form");
			Hooks.scenario.log("User remains on the Add New Patient form");
		} else {
			System.out.println("User progressed to the next step unexpectedly");
			Hooks.scenario.log("User progressed to the next step unexpectedly");
			throw new AssertionError("User did not remain on the Add New Patient form");
		}
	}

	@Then("user clicks on Add New Patient button in Add Patient")
	public void userClicksOnAddNewPatientButtonInAddPatient() {
		patientPage.clickOnAddNewPatientButton();
		System.out.println("Clicked on Add New Patient button in Add Patient");
		Hooks.scenario.log("Clicked on Add New Patient button in Add Patient");
	}

	@Then("the user should remain on the Select Existing Patient form without progressing to the next step")
	public void verifyUserRemainsOnSelectExistingPatientForm() {
		boolean isOnForm = patientPage.isOnSelectExistingPatientForm();
		if (isOnForm) {
			System.out.println("User remains on the Select Existing Patient form");
			Hooks.scenario.log("User remains on the Select Existing Patient form");
		} else {
			System.out.println("User progressed to the next step unexpectedly");
			Hooks.scenario.log("User progressed to the next step unexpectedly");
			throw new AssertionError("User did not remain on the Select Existing Patient form");
		}
	}

	@Then("user clicks on Select Existing Patient button in Add Patient")
	public void userClicksOnSelectExistingPatientButtonInAddPatient() {
		patientPage.clickOnSelectExistingPatientButton();
		System.out.println("Clicked on Select Existing Patient button in Add Patient");
		Hooks.scenario.log("Clicked on Select Existing Patient button in Add Patient");
	}

	@Then("the user should remain on the Search Patient form without progressing to the next step")
	public void verifyUserRemainsOnSearchPatientForm() {
		boolean isOnSearchForm = patientPage.isOnSearchPatientForm();
		if (isOnSearchForm) {
			System.out.println("User remains on the Search Patient form");
			Hooks.scenario.log("User remains on the Search Patient form");
		} else {
			System.out.println("User progressed to the next step unexpectedly");
			Hooks.scenario.log("User progressed to the next step unexpectedly");
			throw new AssertionError("User did not remain on the Search Patient form");
		}
	}

	@Then("user clicks on Search Patient button in Add Patient")
	public void userClicksOnSearchPatientButtonInAddPatient() {
		patientPage.clickOnSearchPatientButton();
		System.out.println("Clicked on Search Patient button in Add Patient");
		Hooks.scenario.log("Clicked on Search Patient button in Add Patient");
	}

	@When("user clicks on New Patient button")
	public void userClicksOnNewPatientButton() {
		patientPage.clickOnNewPatientButton();
		System.out.println("Clicked on New Patient button");
		Hooks.scenario.log("Clicked on New Patient button");
	}

	@Then("the user should remain on the Add to Follow-up form without progressing to the next step")
	public void verifyUserRemainsOnAddToFollowupForm() {
		boolean isOnForm = patientPage.isStillOnAddToFollowupForm();
		if (isOnForm) {
			System.out.println("User remains on the Add to Follow-up form");
			Hooks.scenario.log("User remains on the Add to Follow-up form");
		} else {
			System.out.println("User has progressed to the next step unexpectedly!");
			Hooks.scenario.log("User has progressed to the next step unexpectedly!");
			throw new AssertionError("User did not remain on the Add to Follow-up form");
		}
	}

	@Then("the system should display a validation message indicating that required fields are blank")
	public void verifyBlankSubmissionError() {
		boolean isErrorDisplayed = patientPage.isBlankSubmissionErrorDisplayed();
		if (isErrorDisplayed) {
			System.out.println("Validation error toast is displayed for blank submission");
			Hooks.scenario.log("Validation error toast is displayed for blank submission");
		} else {
			System.out.println("Validation error toast NOT displayed!");
			Hooks.scenario.log("Validation error toast NOT displayed!");
			throw new AssertionError("Validation error toast NOT displayed for blank submission");
		}
	}

	@Then("user clicks on Next button without entering any data")
	public void clickOnNextWithoutData() {
		patientPage.clickOnNextWithoutData();
		System.out.println("Clicked on Next button without entering any data");
		Hooks.scenario.log("Clicked on Next button without entering any data");
	}

	@Then("user clicks on Add to Follow-up button for a patient module")
	public void clickOnAddToFollowup() {
		patientPage.clickOnAddToFollowup();
		System.out.println("Clicked on Add To Follow-up button");
		Hooks.scenario.log("Clicked on Add To Follow-up button");
	}

	@Then("the patient should not be deleted from list")
	public void verifyPatientIsNotDeleted() {
		Assert.assertTrue("Patient delete success message appeared; patient may have been deleted",
				patientPage.isDeletePatientToastMessageAbsent());
		System.out.println("Patient was NOT deleted");
		Hooks.scenario.log("Patient was NOT deleted");
	}

	@Then("I click Cancel button on Delete Patient confirmation message")
	public void clickCancelOnDeletePatientConfirmation() {
		patientPage.clickCancelDeletePatientConfirmation();
		System.out.println("Clicked Cancel on Delete Patient confirmation");
		Hooks.scenario.log("Clicked Cancel on Delete Patient confirmation");
	}

	@Then("I click on Delete Patient button")
	public void clickOnDeletePatient() {
		patientPage.clickOnPatientActionMenu();
		patientPage.clickOnDeletePatient();
		System.out.println("Clicked on Delete Patient option");
		Hooks.scenario.log("Clicked on Delete Patient option");
	}

	@Then("the patient VCard should not be created or sent for patient module")
	public void verifyPatientVCardIsNotCreatedOrSent() {
		Assert.assertTrue("Send VCard button is not displayed; VCard might have been sent",
				patientPage.isSendVCardButtonDisplayed());
		System.out.println("Patient VCard was not created or sent");
		Hooks.scenario.log("Patient VCard was not created or sent");
	}

	@Then("I should see validation messages for all required fields Send VCard button Patient Module")
	public void verifyValidationMessagesForSendVCardRequiredFieldsInPatientModule() {
		Assert.assertTrue("Send VCard validation message is not displayed",
				patientPage.isSendVCardValidationMessageDisplayed());
		System.out.println("Validation message displayed for Send VCard required fields");
		Hooks.scenario.log("Validation message displayed for Send VCard required fields");
	}

	@Then("I click Send button for Patient VCard")
	public void clickSendForPatientVCard() {
		patientPage.clickSendForPatientVCard();
		System.out.println("Clicked Send button for Patient VCard");
		Hooks.scenario.log("Clicked Send button for Patient VCard");
	}

	@Then("I click on Send VCard Button Patient Module")
	public void clickOnSendVCardInPatientModule() {
		patientPage.clickOnSendVCard();
		System.out.println("Clicked on Send VCard in Patient Module");
		Hooks.scenario.log("Clicked on Send VCard in Patient Module");
	}

	@And("the patient user should be able to view tags")
	public void patientUserCanViewTags() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String tagsPageUrl = Hooks.prop.getProperty("tagsPageUrl");
		String fullUrl = baseUrl + tagsPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, tagsPageUrl);
		Assert.assertTrue("Tags page is not displayed", patientPage.isOnTagsPage());
		System.out.println("Patient user should be able to view Tags test");
		Hooks.scenario.log("Patient user should be able to view Tags test");

	}

	@And("the patient user should be able to view patients")
	public void patientUserCanViewPatients() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + patientPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, patientPageUrl);
		Assert.assertTrue("Patients page is not displayed", patientPage.isOnPatientsPage());
		System.out.println("Patient user should be able to view Patients test");
		Hooks.scenario.log("Patient user should be able to view Patients test");

	}

	@Then("I click on Add Quick Text button")
	public void clickOnAddQuickText() {
		patientPage.clickOnAddQuickText();
		System.out.println("Clicked on Add Quick Text button");
		Hooks.scenario.log("Clicked on Add Quick Text button");
	}

	@Then("I do not fill any required fields in the Patient Quick Text form")
	public void leaveAllRequiredFieldsEmptyInPatientQuickText() {
		patientPage.leaveAllRequiredFieldsEmptyInPatientQuickText();
		System.out.println("User does not fill any required fields in the Patient Quick Text form test");
		Hooks.scenario.log("User does not fill any required fields in the Patient Quick Text form test");

	}

	@Then("I click Send button for Patient Quick Text")
	public void clickSendForPatientQuickText() {
		patientPage.clickSendForPatientQuickText();
		System.out.println("Clicked Send button for Patient Quick Text");
		Hooks.scenario.log("Clicked Send button for Patient Quick Text");
	}

	@Then("I should see validation messages for all quick text required fields Patient Module")
	public void verifyValidationMessagesForAllRequiredFieldsInPatientModule() {
		Assert.assertTrue("Body validation message not displayed", patientPage.isBodyRequiredValidationDisplayed());
		Assert.assertTrue("Phone validation message not displayed", patientPage.isPhoneRequiredValidationDisplayed());
		System.out.println(
				"User should see validation messages for all Quick Text required fields in the Patient Module test");
		Hooks.scenario.log(
				"User should see validation messages for all Quick Text required fields in the Patient Module test");

	}

	@Then("the patient module quick text should not be created or updated")
	public void verifyPatientQuickTextIsNotCreatedOrUpdated() {
		Assert.assertTrue("Save button is not displayed; quick text may have been created",
				patientPage.isSaveButtonDisplayed());
		System.out.println("Patient Quick Text was NOT created or updated");
		Hooks.scenario.log("Patient Quick Text was NOT created or updated");
	}

	// TagPage
	@When("user clicks on Edit button for a Tag Type")
	public void userClicksOnEditButtonForTagType() {
		tagTypeNameBeforeEdit = patientPage.getTagTypeNameFromList();
		patientPage.clickOnEditTagType();
		System.out.println("Clicked on Edit button for Tag Type");
		Hooks.scenario.log("Clicked on Edit button for Tag Type");
	}

	@And("user updates the Tag Type details")
	public void userUpdatesTheTagTypeDetails() {
		String updatedTagName = "Updated Tag Name";
		patientPage.updateTagTypeDetails(updatedTagName);
		System.out.println("Updated Tag Type details with: " + updatedTagName);
		Hooks.scenario.log("Updated Tag Type details with: " + updatedTagName);
	}

	@Then("user clicks on Cancel button in Edit Tag Type")
	public void userClicksOnCancelButtonInEditTagType() {
		patientPage.clickOnCancelEditTagType();
		System.out.println("Clicked on Cancel button in Edit Tag Type");
		Hooks.scenario.log("Clicked on Cancel button in Edit Tag Type");
	}

	@And("user captures Tag Type details before edit")
	public void captureTagTypeBeforeEdit() {
		tagTypeNameBeforeEdit = patientPage.getTagTypeNameFromList();
		System.out.println("Captured Tag Type before edit: " + tagTypeNameBeforeEdit);
		Hooks.scenario.log("Captured Tag Type before edit: " + tagTypeNameBeforeEdit);
	}

	@Then("the Tag Type details should not be updated and the tag list should remain unchanged")
	public void verifyTagTypeNotUpdatedAfterCancel() {
		String tagTypeNameAfterCancel = patientPage.getTagTypeNameFromList();
		Assert.assertNotNull("Tag Type name before edit is null", tagTypeNameBeforeEdit);
		Assert.assertEquals("Tag Type was updated unexpectedly", tagTypeNameBeforeEdit, tagTypeNameAfterCancel);
		System.out.println("Tag Type not updated after Cancel. Tag list remains unchanged.");
		Hooks.scenario.log("Tag Type not updated after Cancel. Tag list remains unchanged.");
	}

	@When("user clicks on Action menu for a Tag")
	public void userClicksOnActionMenuForTag() {
		patientPage.clickOnTagActionMenu();
		System.out.println("Clicked on Action menu for Tag");
		Hooks.scenario.log("Clicked on Action menu for Tag");
	}

	@And("user clicks on Delete Tag button")
	public void userClicksOnDeleteTagButton() {
		tagNameBeforeDelete = patientPage.getTagNameFromTagList();
		patientPage.clickOnDeleteTag();
		System.out.println("Clicked on Delete Tag button");
		Hooks.scenario.log("Clicked on Delete Tag button");
	}

	@Then("the Tag should not be deleted and the tag list should remain unchanged")
	public void verifyTagNotDeletedAfterCancel() {
		String tagNameAfterCancel = patientPage.getTagNameFromTagList();
		Assert.assertNotNull("Tag name before delete is null", tagNameBeforeDelete);
		Assert.assertEquals("Tag was deleted unexpectedly after Cancel", tagNameBeforeDelete, tagNameAfterCancel);
		System.out.println("Tag not deleted after Cancel. Tag list remains unchanged.");
		Hooks.scenario.log("Tag not deleted after Cancel. Tag list remains unchanged.");
	}

	@Then("user clicks on Cancel button on Delete Tag confirmation message")
	public void userClicksOnCancelButtonOnDeleteTagConfirmation() {
		patientPage.clickOnCancelDeleteTag();
		System.out.println("Clicked Cancel on Delete Tag confirmation");
		Hooks.scenario.log("Clicked Cancel on Delete Tag confirmation");
	}

// ReviewCategoriesPage
	@Then("the patient user should be able to view review categories")
	public void patientUserCanViewReviewCategories() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reviewCategoriesPageUrl = Hooks.prop.getProperty("reviewCategoriesPageUrl");
		if (reviewCategoriesPageUrl == null || reviewCategoriesPageUrl.isEmpty()) {
			throw new RuntimeException("reviewCategoriesPageUrl property is missing in config.properties");
		}
		String fullUrl = baseUrl + reviewCategoriesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/ReviewCategories");
		Assert.assertTrue("Review Categories page is not displayed", patientPage.isOnReviewCategoriesPage());
		System.out.println("Patient user is on the Review Categories page");
		Hooks.scenario.log("Patient user is on the Review Categories page");
	}

	@When("user clicks on Add Review Category button")
	public void userClicksOnAddReviewCategoryButton() {
		patientPage.clickOnAddReviewCategory();
		System.out.println("Clicked on Add Review Category button");
		Hooks.scenario.log("Clicked on Add Review Category button");
	}

	@And("user clicks on Save button without entering any data")
	public void userClicksOnSaveButtonWithoutData() {
		patientPage.clickOnSaveReviewCategory();
		System.out.println("Clicked on Save button without entering any data");
		Hooks.scenario.log("Clicked on Save button without entering any data");
	}

	@Then("the user should remain on the Add Review Category form without saving the category")
	public void verifyAddReviewCategoryFormRemains() {
		boolean isFormVisible = patientPage.isAddReviewCategoryFormDisplayed();
		Assert.assertTrue("Add Review Category form is not displayed", isFormVisible);
		System.out.println("User remains on the Add Review Category form without saving");
		Hooks.scenario.log("User remains on the Add Review Category form without saving");
	}

	@When("user clicks on Edit button for a Review Category")
	public void userClicksOnEditButtonForReviewCategory() {
		patientPage.clickOnEditReviewCategory();
		System.out.println("Clicked on Edit button for Review Category");
		Hooks.scenario.log("Clicked on Edit button for Review Category");
	}

	@And("user updates the Review Category details")
	public void userUpdatesTheReviewCategoryDetails() {
		String updatedReviewCategoryName = "Updated Review Category";
		patientPage.updateReviewCategoryDetails(updatedReviewCategoryName);
		System.out.println("Updated Review Category details");
		Hooks.scenario.log("Updated Review Category details");
	}

	@Then("user clicks on Cancel button in Edit Review Category")
	public void userClicksOnCancelButtonInEditReviewCategory() {
		patientPage.clickOnCancelEditReviewCategory();
		System.out.println("Clicked Cancel button in Edit Review Category");
		Hooks.scenario.log("Clicked Cancel button in Edit Review Category");
	}

	@And("user stores the Review Category details before edit")
	public void storeReviewCategoryDetailsBeforeEdit() {
		reviewCategoryNameBeforeEdit = patientPage.getReviewCategoryNameFromList();
		Assert.assertNotNull("Review Category name could not be captured before edit", reviewCategoryNameBeforeEdit);
		System.out.println("Stored Review Category before edit: " + reviewCategoryNameBeforeEdit);
		Hooks.scenario.log("Stored Review Category before edit: " + reviewCategoryNameBeforeEdit);
	}

	@Then("the Review Category details should not be updated and the review category list should remain unchanged")
	public void verifyReviewCategoryNotUpdatedAfterCancel() {
		String reviewCategoryNameAfterCancel = patientPage.getReviewCategoryNameFromList();
		Assert.assertNotNull("Review Category name before edit is null", reviewCategoryNameBeforeEdit);
		Assert.assertEquals("Review Category was updated unexpectedly after Cancel", reviewCategoryNameBeforeEdit,
				reviewCategoryNameAfterCancel);
		System.out.println("Review Category not updated after Cancel. List remains unchanged.");
		Hooks.scenario.log("Review Category not updated after Cancel. List remains unchanged.");
	}

	@And("user stores the Review Category details before delete")
	public void userStoresReviewCategoryDetailsBeforeDelete() {
		reviewCategoryNameBeforeDelete = patientPage.getReviewCategoryNameFromList();
		Assert.assertNotNull("Review Category name before delete is null", reviewCategoryNameBeforeDelete);
		System.out.println("Stored Review Category before delete: " + reviewCategoryNameBeforeDelete);
		Hooks.scenario.log("Stored Review Category before delete: " + reviewCategoryNameBeforeDelete);
	}

	@When("user clicks on Action menu for a Review Category")
	public void userClicksOnActionMenuForReviewCategory() {
		patientPage.clickOnReviewCategoryActionMenu();
		System.out.println("Clicked on Action menu for Review Category");
		Hooks.scenario.log("Clicked on Action menu for Review Category");
	}

	@And("user clicks on Delete Review Category button")
	public void userClicksOnDeleteReviewCategoryButton() {
		patientPage.clickOnDeleteReviewCategory();
		System.out.println("Clicked on Delete Review Category button");
		Hooks.scenario.log("Clicked on Delete Review Category button");
	}

	@Then("user clicks on Cancel button on Delete Review Category confirmation message")
	public void userClicksOnCancelButtonOnDeleteReviewCategoryConfirmation() {
		patientPage.clickOnCancelDeleteReviewCategory();
		System.out.println("Clicked Cancel on Delete Review Category confirmation");
		Hooks.scenario.log("Clicked Cancel on Delete Review Category confirmation");
	}

	@Then("the Review Category should not be deleted and the review category list should remain unchanged")
	public void verifyReviewCategoryNotDeletedAfterCancel() {
		String reviewCategoryNameAfterCancel = patientPage.getReviewCategoryNameFromList();
		Assert.assertNotNull("Review Category name before delete is null", reviewCategoryNameBeforeDelete);
		Assert.assertEquals("Review Category was deleted unexpectedly after Cancel", reviewCategoryNameBeforeDelete,
				reviewCategoryNameAfterCancel);
		System.out.println("Review Category not deleted after Cancel. List remains unchanged.");
		Hooks.scenario.log("Review Category not deleted after Cancel. List remains unchanged.");
	}

	// ReferralSourcesPage
	@Then("the patient user should be able to view referral sources")
	public void patientUserCanViewReferralSources() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String referralSourcesPageUrl = Hooks.prop.getProperty("referralSourcesPageUrl");
		if (referralSourcesPageUrl == null || referralSourcesPageUrl.isEmpty()) {
			throw new RuntimeException("referralSourcesPageUrl property is missing in config.properties");
		}
		String fullUrl = baseUrl + referralSourcesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, referralSourcesPageUrl);
		Assert.assertTrue("Referral Sources page is not displayed", patientPage.isOnReferralSourcesPage());
		System.out.println("Patient user is on the Referral Sources page");
		Hooks.scenario.log("Patient user is on the Referral Sources page");
	}

	@When("user clicks on Add Referral Source button")
	public void userClicksOnAddReferralSourceButton() {
		patientPage.clickOnAddReferralSource();
		System.out.println("Clicked on Add Referral Source button");
		Hooks.scenario.log("Clicked on Add Referral Source button");
	}

	@Then("the user should remain on the Add Referral Source form without saving the referral source")
	public void verifyUserRemainsOnAddReferralSourceForm() {
		Assert.assertTrue("Add Referral Source form is not displayed after blank submit",
				patientPage.isAddReferralSourceFormDisplayed());
		System.out
				.println("User should remain on the Add Referral Source form without saving the referral source test");
		Hooks.scenario
				.log("User should remain on the Add Referral Source form without saving the referral source test");

	}

	@When("user clicks on Edit button for a Referral Source")
	public void userClicksOnEditButtonForReferralSource() {
		patientPage.clickOnEditReferralSource();
		System.out.println("Clicked on Edit button for Referral Source");
		Hooks.scenario.log("Clicked on Edit button for Referral Source");
	}

	@And("user updates the Referral Source details")
	public void userUpdatesReferralSourceDetails() {
		String updatedName = "Updated_" + System.currentTimeMillis();
		patientPage.updateReferralSourceName(updatedName);
		System.out.println("Updated Referral Source details with name: " + updatedName);
		Hooks.scenario.log("Updated Referral Source details with name: " + updatedName);
	}

	@Then("user clicks on Cancel button in Edit Referral Source")
	public void userClicksOnCancelButtonInEditReferralSource() {
		patientPage.clickOnCancelEditReferralSource();
		System.out.println("Clicked on Cancel button in Edit Referral Source");
		Hooks.scenario.log("Clicked on Cancel button in Edit Referral Source");
	}

	@And("user stores the Referral Source details before edit")
	public void userStoresReferralSourceDetailsBeforeEdit() {
		reviewSourceNameBeforeEdit = patientPage.getReferralSourceNameFromList();
		System.out.println("Stored Referral Source name before edit: " + reviewSourceNameBeforeEdit);
		Hooks.scenario.log("Stored Referral Source name before edit: " + reviewSourceNameBeforeEdit);
	}

	@Then("the Referral Source details should not be updated and the referral source list should remain unchanged")
	public void verifyReferralSourceNotUpdatedAfterCancel() {
		String reviewSourceNameAfterCancel = patientPage.getReferralSourceNameFromList();
		Assert.assertNotNull("Referral Source name before edit is null", reviewSourceNameBeforeEdit);
		Assert.assertEquals("Referral Source was updated unexpectedly after Cancel", reviewSourceNameBeforeEdit,
				reviewSourceNameAfterCancel);
		System.out.println("Referral Source not updated after Cancel. List remains unchanged.");
		Hooks.scenario.log("Referral Source not updated after Cancel. List remains unchanged.");
	}

	@When("user clicks on Action menu for a Referral Source")
	public void userClicksOnActionMenuForReferralSource() {
		patientPage.clickOnActionMenuForReferralSource();
		System.out.println("Clicked on Action menu for Referral Source");
		Hooks.scenario.log("Clicked on Action menu for Referral Source");
	}

	@And("user clicks on Delete Referral Source button")
	public void userClicksOnDeleteReferralSourceButton() {
		patientPage.clickOnDeleteReferralSource();
		System.out.println("Clicked on Delete Referral Source button");
		Hooks.scenario.log("Clicked on Delete Referral Source button");
	}

	@Then("user clicks on Cancel button on Delete Referral Source confirmation message")
	public void userClicksOnCancelButtonOnDeleteReferralSourceConfirmation() {
		patientPage.clickOnCancelDeleteReferralSource();
		System.out.println("Clicked on Cancel button on Delete Referral Source confirmation");
		Hooks.scenario.log("Clicked on Cancel button on Delete Referral Source confirmation");
	}

	@And("user stores the Referral Source details before delete")
	public void userStoresReferralSourceDetailsBeforeDelete() {
		referralSourceNameBeforeDelete = patientPage.getReferralSourceNameFromList();
		System.out.println("Stored Referral Source name before delete: " + referralSourceNameBeforeDelete);
		Hooks.scenario.log("Stored Referral Source name before delete: " + referralSourceNameBeforeDelete);
	}

	@Then("the Referral Source should not be deleted and the referral source list should remain unchanged")
	public void verifyReferralSourceNotDeletedAfterCancel() {
		String referralSourceNameAfterCancel = patientPage.getReferralSourceNameFromList();
		Assert.assertNotNull("Referral Source name before delete is null", referralSourceNameBeforeDelete);
		Assert.assertEquals("Referral Source was deleted unexpectedly after Cancel", referralSourceNameBeforeDelete,
				referralSourceNameAfterCancel);
		System.out.println("Referral Source not deleted after Cancel. List remains unchanged.");
		Hooks.scenario.log("Referral Source not deleted after Cancel. List remains unchanged.");
	}

	// EnrollmentsPage
	@Then("the user should be able to view Patient Module General Audit View test")
	public void userShouldBeAbleToViewPatientModuleGeneralAuditViewTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String enrollmentsUrl = Hooks.prop.getProperty("enrollmentsPageUrl");
		patientPage.openPatientEnrollmentsPage(baseUrl + enrollmentsUrl);
		patientPage.verifyGeneralAuditViewColumns();
		System.out.println("Patient Enrollments General Audit View verified successfully");
		Hooks.scenario.log("Patient Enrollments General Audit View verified successfully");
	}

	@Then("the user should not be able to view Patient Module General Audit View test")
	public void userShouldNotBeAbleToViewPatientModuleGeneralAuditViewTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String enrollmentsUrl = Hooks.prop.getProperty("enrollmentsPageUrl");
		patientPage.openPatientEnrollmentsPage(baseUrl + enrollmentsUrl);
		patientPage.verifyGeneralAuditViewColumnsNotVisible();
		System.out.println("Patient Enrollments General Audit View is not visible as expected");
		Hooks.scenario.log("Patient Enrollments General Audit View is not visible as expected");

	}

	@Then("the patient user should be able to view enrollments")
	public void patientUserCanViewEnrollments() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String enrollmentsPageUrl = Hooks.prop.getProperty("enrollmentsPageUrl");
		String fullUrl = baseUrl + enrollmentsPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Enrollments");
		Assert.assertTrue("Enrollments page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Enrollments"));
		System.out.println("Patient user is on the Enrollments page");
		Hooks.scenario.log("Patient user is on the Enrollments page");
	}

	@When("user clicks on Add Enrollment button")
	public void userClicksOnAddEnrollmentButton() {
		patientPage.clickOnAddEnrollmentButton();
		System.out.println("Clicked on Add Enrollment button");
		Hooks.scenario.log("Clicked on Add Enrollment button");
	}

	@Then("the user should remain on the Add Enrollment form without saving the enrollment")
	public void userRemainsOnAddEnrollmentForm() {
		Assert.assertTrue("User navigated away from Add Enrollment form unexpectedly",
				patientPage.isOnAddEnrollmentForm());
		System.out.println("User remains on Add Enrollment form without saving enrollment");
		Hooks.scenario.log("User remains on Add Enrollment form without saving enrollment");
	}

	@When("user clicks on Edit button for an Enrollment")
	public void userClicksOnEditButtonForEnrollment() {
		patientPage.clickOnActionMenuForEnrollment();
		patientPage.clickOnEditEnrollment();
		System.out.println("Clicked on Edit button for Enrollment");
		Hooks.scenario.log("Clicked on Edit button for Enrollment");
	}

	@And("user updates the Enrollment details")
	public void userUpdatesTheEnrollmentDetails() {
		String updatedEnrollmentName = "Updated Enrollment Test";
		patientPage.updateEnrollmentDetails(updatedEnrollmentName);
		System.out.println("Updated Enrollment details");
		Hooks.scenario.log("Updated Enrollment details");
	}

	@Then("user clicks on Cancel button in Edit Enrollment")
	public void userClicksOnCancelButtonInEditEnrollment() {
		patientPage.clickOnCancelEditEnrollment();
		System.out.println("Clicked on Cancel button in Edit Enrollment");
		Hooks.scenario.log("Clicked on Cancel button in Edit Enrollment");
	}

	@Then("the Enrollment details should not be updated and the enrollment list should remain unchanged")
	public void verifyEnrollmentNotUpdatedAfterCancel() {
		String enrollmentNameAfterCancel = patientPage.getEnrollmentNameFromList();
		Assert.assertNotNull("Enrollment name before edit is null", enrollmentNameBeforeEdit);
		Assert.assertEquals("Enrollment was updated unexpectedly after Cancel", enrollmentNameBeforeEdit,
				enrollmentNameAfterCancel);
		System.out.println("Enrollment not updated after Cancel. List remains unchanged.");
		Hooks.scenario.log("Enrollment not updated after Cancel. List remains unchanged.");
	}

	@And("user stores the Enrollment details before edit")
	public void storeEnrollmentDetailsBeforeEdit() {
		enrollmentNameBeforeEdit = patientPage.getEnrollmentNameFromList();
		Assert.assertNotNull("Enrollment name is null before edit", enrollmentNameBeforeEdit);
		System.out.println("User stores the Enrollment details before edit test");
		Hooks.scenario.log("User stores the Enrollment details before edit test");

	}

	@And("user stores the Enrollment details before delete")
	public void storeEnrollmentDetailsBeforeDelete() {
		enrollmentNameBeforeDelete = patientPage.getEnrollmentNameFromList();
		Assert.assertNotNull("Enrollment name before delete is null", enrollmentNameBeforeDelete);
		System.out.println("Stored Enrollment details before delete: " + enrollmentNameBeforeDelete);
		Hooks.scenario.log("Stored Enrollment details before delete: " + enrollmentNameBeforeDelete);
	}

	@When("user clicks on Action menu for an Enrollment")
	public void userClicksOnActionMenuForEnrollment() {
		patientPage.clickOnEnrollmentActionMenu();
		System.out.println("Clicked on Action menu for Enrollment");
		Hooks.scenario.log("Clicked on Action menu for Enrollment");
	}

	@And("user clicks on Delete Enrollment button")
	public void userClicksOnDeleteEnrollmentButton() {
		patientPage.clickOnDeleteEnrollment();
		System.out.println("Clicked on Delete Enrollment button");
		Hooks.scenario.log("Clicked on Delete Enrollment button");
	}

	@Then("user clicks on Cancel button on Delete Enrollment confirmation message")
	public void userClicksOnCancelButtonOnDeleteEnrollmentConfirmation() {
		patientPage.clickOnCancelDeleteEnrollment();
		System.out.println("Clicked on Cancel button on Delete Enrollment confirmation message");
		Hooks.scenario.log("Clicked on Cancel button on Delete Enrollment confirmation message");
	}

	@Then("the Enrollment should not be deleted and the enrollment list should remain unchanged")
	public void verifyEnrollmentNotDeletedAfterCancel() {
		String enrollmentNameAfterCancel = patientPage.getEnrollmentNameFromList();
		if (enrollmentNameBeforeDelete.equals(enrollmentNameAfterCancel)) {
			System.out.println("Enrollment not deleted after Cancel. Enrollment list remains unchanged.");
			Hooks.scenario.log("Enrollment not deleted after Cancel. Enrollment list remains unchanged.");
		} else {
			throw new AssertionError("Enrollment was deleted unexpectedly. Before: " + enrollmentNameBeforeDelete
					+ " | After: " + enrollmentNameAfterCancel);
		}
	}

	// DeDupePage
	@And("the patient user should be able to view DeDupe patients page")
	public void patientUserCanViewDeDupePatientsPage() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String dedupePageUrl = Hooks.prop.getProperty("dedupePatientsPageUrl");
		if (dedupePageUrl == null || dedupePageUrl.isEmpty()) {
			throw new RuntimeException("dedupePatientsPageUrl property is missing in config.properties");
		}
		String fullUrl = baseUrl + dedupePageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/DeDupePatients");
		Assert.assertTrue("DeDupe patients page is not displayed", patientPage.isOnDeDupePatientsPage());
		System.out.println("Patient user is on the DeDupe patients page");
		Hooks.scenario.log("Patient user is on the DeDupe patients page");
	}

	@When("user clicks on De Dupe Find Duplicate option for a patient")
	public void userClicksOnDeDupeFindDuplicateForPatient() {
		patientPage.clickOnDeDupeFindDuplicate();
		System.out.println("Clicked on De Dupe Find Duplicate option for the patient");
		Hooks.scenario.log("Clicked on De Dupe Find Duplicate option for the patient");
	}

	@Then("the system should display a validation message for selecting checkbox")
	public void validateMergeRequiresSelection() {
		String message = patientPage.getToastMessage();
		Assert.assertEquals("Please select checkbox", message);
		System.out.println("Validation message displayed: " + message);
		Hooks.scenario.log("Validation message displayed: " + message);
	}

	// ProfilePage
	@And("user clicks on Filter button in Profiles page")
	public void userClicksOnFilterButton() {
		patientPage.clickFilterButton();
		System.out.println("User clicks on the Filter button in the Profiles page test");
		Hooks.scenario.log("User clicks on the Filter button in the Profiles page test");

	}

	@And("user enters Profile Name as {string}")
	public void userEntersProfileName(String profileName) {
		patientPage.enterProfileName(profileName);
		Hooks.scenario.log("Entered profile name: " + profileName);
	}

	@And("user clicks on Search button in Profiles page")
	public void userClicksOnSearchButton() {
		patientPage.clickSearchButton();
		Hooks.scenario.log("Clicked on Search button");
	}

	@And("user clicks on Action menu for Profile")
	public void userClicksOnActionMenu() {
		patientPage.clickActionMenu();
		Hooks.scenario.log("Clicked on Action menu");
	}

	@And("user clicks on Edit button for Profile")
	public void userClicksOnEditButton() {
		patientPage.clickEditButton();
		Hooks.scenario.log("Clicked on Edit button");
	}

	@And("user clicks on Submit button in Profile")
	public void userClicksOnSubmitButton() {
		patientPage.clickSubmitButton();
		Hooks.scenario.log("Clicked on Submit button");
	}

	@And("I create a profile with View access only to Patient Module General Audit View test")
	public void createProfileWithViewAccessOnlyToPatientModuleGeneralAuditView() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.enablePatientModuleGeneralAuditViewOnly();
		patientPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Patient Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Patient Module General Audit View");
	}

	@And("I create a profile with No access to Patient Module General Audit View test")
	public void createProfileWithNoAccessToPatientModuleGeneralAuditViewTest() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.disablePatientModuleGeneralAuditView();
		patientPage.clickSubmitButton();
		System.out.println("Profile updated with NO access to Patient Module General Audit View");
		Hooks.scenario.log("Profile updated with NO access to Patient Module General Audit View");

	}

	@And("I create a profile with View access only to Patient Module Patient test")
	public void createProfileWithViewAccessOnlyToPatientModulePatient() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.verifyPatientViewOnlyUser();
		patientPage.clickSubmitButton();
		System.out.println("User creates a profile with View access only to Patient Module Patient test");
		Hooks.scenario.log("User creates a profile with View access only to Patient Module Patient test");

	}

	@And("I create a profile with View and Add access to Patient Module Patient test")
	public void createPatientModuleViewAndAddProfile() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.verifyPatientViewAndAddUser();
		patientPage.clickSubmitButton();
		System.out.println("User creates a profile with View and Add access to Patient Module Patient test");
		Hooks.scenario.log("User creates a profile with View and Add access to Patient Module Patient test");

	}

	@And("I create a profile with View, Add, and Edit access to Patient Module Patient test")
	public void createPatientProfileWithViewAddEditAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createUserWithPatientViewAddEditAccess();
		patientPage.clickSubmitButton();
		System.out.println("User creates a profile with View, Add, and Edit access to Patient Module Patient test");
		Hooks.scenario.log("User creates a profile with View, Add, and Edit access to Patient Module Patient test");

	}

	@And("I create a profile with full access to Patient Module Patient test")
	public void createPatientProfileWithFullAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createPatientModuleProfileWithFullAccess();
		patientPage.clickSubmitButton();
		System.out.println("User creates a profile with full access to Patient Module Patient test");
		Hooks.scenario.log("User creates a profile with full access to Patient Module Patient test");

	}

	@And("I create a profile with Update access to Partners Module DeDupe test")
	public void createProfileWithUpdateAccessForPartnersModuleDeDupe() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createProfileUpdateDeDupe();
		patientPage.clickSubmitButton();
		System.out.println("User creates a profile with Update access to Partners Module DeDupe test");
		Hooks.scenario.log("User creates a profile with Update access to Partners Module DeDupe test");

	}

	@And("I create a profile without Update access to Partners Module DeDupe test")
	public void createProfileWithoutUpdateAccessForPartnersModuleDeDupe() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createProfileNoUpdateAccessDeDupe();
		patientPage.clickSubmitButton();
		System.out.println("User creates a profile without Update access to Partners Module DeDupe test");
		Hooks.scenario.log("User creates a profile without Update access to Partners Module DeDupe test");

	}

	@And("I create a profile with View access only to Patient Module Tag test")
	public void createProfileWithViewOnlyAccessForPatientTag() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createProfileWithViewOnlyAccessForPatientTag();
		patientPage.clickSubmitButton();
		System.out.println("Profile updated with View-only access to Patient Module Tag");
		Hooks.scenario.log("Profile updated with View-only access to Patient Module Tag");

	}

	@And("I create a profile with View and Add access to Patient Module Tag test")
	public void createPatientTagProfileWithViewAndAddAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createProfileWithViewAndAddAccessForPatientTag();
		patientPage.clickSubmitButton();
		System.out.println("Profile updated with View and Add access to Patient Module Tag");
		Hooks.scenario.log("Profile updated with View and Add access to Patient Module Tag");
	}

	@And("I create a profile with View, Add, and Edit access to Patient Module Tag test")
	public void createPatientModuleTagProfile() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createPatientModuleTagViewAddEditProfile();
		patientPage.clickSubmitButton();
		System.out.println("Profile updated with View, Add, and Edit access to Patient Module Tag");
		Hooks.scenario.log("Profile updated with View, Add, and Edit access to Patient Module Tag");

	}

	@And("I create a profile with View, Add, Edit, and Delete access to Patient Module Tag test")
	public void createPatientModuleTagProfileWithCRUDAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createPatientTagProfileWithFullAccess();
		patientPage.clickSubmitButton();
		System.out.println("Profile updated with View, Add, Edit, and Delete access to Patient Module Tag");
		Hooks.scenario.log("Profile updated with View, Add, Edit, and Delete access to Patient Module Tag");
	}

	@And("I create a profile with View access only to Setup Module Review Category test")
	public void createSetupModuleReviewCategoryProfileWithViewAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createSetupReviewCategoryViewOnlyProfile();
		patientPage.clickSubmitButton();
		System.out.println("User creates a profile with View access only to Setup Module Review Category test");
		Hooks.scenario.log("User creates a profile with View access only to Setup Module Review Category test");

	}

	@And("I create a profile with View and Add access to Setup Module Review Category test")
	public void createSetupModuleReviewCategoryProfileWithViewAndAddAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createSetupReviewCategoryViewAddProfile();
		patientPage.clickSubmitButton();
		System.out.println("User creates a profile with View and Add access to Setup Module Review Category test");
		Hooks.scenario.log("User creates a profile with View and Add access to Setup Module Review Category test");

	}

	@And("I create a profile with View, Add, and Edit access to Setup Module Review Category test")
	public void createSetupModuleReviewCategoryProfileWithViewAddEditAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createSetupReviewCategoryViewAddEditProfile();
		patientPage.clickSubmitButton();
		System.out
				.println("User creates a profile with View, Add, and Edit access to Setup Module Review Category test");
		Hooks.scenario
				.log("User creates a profile with View, Add, and Edit access to Setup Module Review Category test");

	}

	@And("I create a profile with View, Add, Edit, and Delete access to Setup Module Review Category test")
	public void createSetupModuleReviewCategoryProfileWithFullAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.shouldCreateFullAccessProfileForReviewCategory();
		patientPage.clickSubmitButton();
		System.out.println(
				"User creates a profile with View, Add, Edit, and Delete access to Setup Module Review Category test");
		Hooks.scenario.log(
				"User creates a profile with View, Add, Edit, and Delete access to Setup Module Review Category test");

	}

	@And("I create a profile with View access only to Setup Module Referral Source test")
	public void createSetupModuleReferralSourceProfileWithViewAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createReferralSourceProfileWithViewAccess();
		patientPage.clickSubmitButton();
		System.out.println("User creates a profile with View access only to Setup Module Referral Source test");
		Hooks.scenario.log("User creates a profile with View access only to Setup Module Referral Source test");

	}

	@And("I create a profile with View and Add access to Setup Module Referral Source test")
	public void createSetupModuleReferralSourceProfileWithViewAndAddAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createSetupReferralSourceViewAddProfile();
		patientPage.clickSubmitButton();
		System.out.println("User creates a profile with View and Add access to Setup Module Referral Source test");
		Hooks.scenario.log("User creates a profile with View and Add access to Setup Module Referral Source test");

	}

	@And("I create a profile with View, Add, and Edit access to Setup Module Referral Source test")
	public void createSetupModuleReferralSourceProfileWithViewAddEditAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createSetupReferralSourceViewAddEditProfile();
		patientPage.clickSubmitButton();
		System.out
				.println("User creates a profile with View, Add, and Edit access to Setup Module Referral Source test");
		Hooks.scenario
				.log("User creates a profile with View, Add, and Edit access to Setup Module Referral Source test");

	}

	@And("I create a profile with View, Add, Edit, and Delete access to Setup Module Referral Source test")
	public void createSetupModuleReferralSourceProfileWithFullAccess() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.createSetupReferralSourceFullAccessProfile();
		patientPage.clickSubmitButton();
		System.out.println(
				"User creates a profile with View, Add, Edit, and Delete access to Setup Module Referral Source test");
		Hooks.scenario.log(
				"User creates a profile with View, Add, Edit, and Delete access to Setup Module Referral Source test");

	}

	@And("I create a profile with all additional access permissions disabled in Patient Module test")
	public void createProfileWithAdditionalAccessDisabledInPatientModuleTest() {
		patientPage.clickFilterButton();
		patientPage.enterProfileName("Sunil");
		patientPage.clickSearchButton();
		patientPage.clickActionMenu();
		patientPage.clickEditButton();
		patientPage.userWithAllAdditionalAccessDisabledTest();
		patientPage.clickSubmitButton();
		System.out.println(
				"User creates a profile with all additional access permissions disabled in Patient Module test");
		Hooks.scenario
				.log("User creates a profile with all additional access permissions disabled in Patient Module test");

	}

	@Then("the patient user should be able to view Profiles")
	public void patientUserCanViewProfiles() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String profilesPageUrl = Hooks.prop.getProperty("profilesPageUrl");
		String fullUrl = baseUrl + profilesPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Setup/Home/Profiles");
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Profiles"));
		System.out.println("Patient user should be able to view Profiles test");
		Hooks.scenario.log("Patient user should be able to view Profiles test");

	}

	@Then("the user should be able to view patients test")
	public void userShouldBeAbleToViewPatients() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + patientPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl, "/Patient/Home/Patients");
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Patient/Home/Patients"));
		System.out.println("User should be able to view Patients test");
		Hooks.scenario.log("User should be able to view Patients test");

	}

	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

}
