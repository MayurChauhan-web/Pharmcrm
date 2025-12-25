package com.pharmcrm.PatientFunctionality.steps;

import com.pharmcrm.PatientFunctionality.pages.patientpage;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class patientfunctionality {

	private patientpage patientPage;

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
		System.out.println("Entered filter criteria in Last Name field");
		Hooks.scenario.log("Entered filter criteria in Last Name field");
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

	@And("the patient user should be able to view patients")
	public void patientUserCanViewPatients() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientPageUrl = Hooks.prop.getProperty("patientPageUrl");
		String fullUrl = baseUrl + patientPageUrl;
		patientPage = new patientpage(Hooks.driver);
		patientPage.openPatientsPage(fullUrl);
		Assert.assertTrue("Patients page is not displayed", patientPage.isOnPatientsPage());
		System.out.println("Patient user is on the Patients page");
		Hooks.scenario.log("Patient user is on the Patients page");
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
		System.out.println("All required fields left empty in Patient Quick Text form");
		Hooks.scenario.log("All required fields left empty in Patient Quick Text form");
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
		System.out.println("Validation messages for required fields are displayed for Patient Quick Text");
		Hooks.scenario.log("Validation messages for required fields are displayed for Patient Quick Text");
	}

	@Then("the patient module quick text should not be created or updated")
	public void verifyPatientQuickTextIsNotCreatedOrUpdated() {
		Assert.assertTrue("Save button is not displayed; quick text may have been created",
				patientPage.isSaveButtonDisplayed());
		System.out.println("Patient Quick Text was NOT created or updated");
		Hooks.scenario.log("Patient Quick Text was NOT created or updated");
	}
}
