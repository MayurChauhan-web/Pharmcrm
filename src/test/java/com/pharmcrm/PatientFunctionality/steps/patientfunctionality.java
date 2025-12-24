package com.pharmcrm.PatientFunctionality.steps;

import com.pharmcrm.PatientFunctionality.pages.patientpage;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import org.junit.Assert;

public class patientfunctionality {

	private patientpage patientPage;

	@And("the patient user should be able to view patients")
	public void patientUserCanViewPatients() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientPageUrl = Hooks.prop.getProperty("patientPageUrl");

		// Build full URL from properties
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

		// Logs for console and Cucumber report
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
