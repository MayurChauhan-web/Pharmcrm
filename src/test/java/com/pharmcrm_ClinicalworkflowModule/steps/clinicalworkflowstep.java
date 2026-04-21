package com.pharmcrm_ClinicalworkflowModule.steps;

import org.junit.Assert;
import com.pharmcrm_ClinicalworkflowModule.pages.clinicalworkflowpage;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class clinicalworkflowstep {

	private clinicalworkflowpage clinicalworkflowPage;

	// Action Work Flow
	@Then("the user should be able to Action Work Flow Export To Excel")
	public void userShouldBeAbleToExportWorkflowToExcel() {

		clinicalworkflowPage.exportActionWorkflowToExcel();

	}

	@Then("the user should be able to Send VCard")
	public void userShouldBeAbleToSendVCard() {

		clinicalworkflowPage.clickSendVCardButton();

	}

	@Then("the user should be able to Grid Template - Company Default Checkbox")
	public void selectGridTemplateCompanyDefaultCheckbox() {

		clinicalworkflowPage.userSelectsCompanyDefaultCheckboxInGridTemplate();

	}

	@Then("the user should be able to Grid Template Delete")
	public void userShouldBeAbleToDeleteGridTemplate() {

		clinicalworkflowPage.verifyUserCanDeleteGridTemplate();

	}

	@Then("the user should be able to Grid Template Edit")
	public void userShouldBeAbleToEditGridTemplate() {

		clinicalworkflowPage.verifyUserCanEditGridTemplate();

	}

	@Then("the user should be able to Grid Template Add")
	public void userShouldBeAbleToAddGridTemplate() {

		clinicalworkflowPage.canAddGridTemplate();

	}

	@Then("the user should be able to Show Past Runninglines Checkbox")
	public void userShouldBeAbleToShowPastRunningLinesCheckbox() {

		clinicalworkflowPage.canShowPastRunningLinesCheckbox();

	}

	@Then("the user should be able to Show All Runninglines Checkbox")
	public void userShouldBeAbleToShowAllRunningLinesCheckbox() {

		clinicalworkflowPage.canShowAllRunningLinesCheckbox();

	}

	@Then("the user should be able to Quick Text")
	public void userShouldBeAbleToViewQuickText() {

		clinicalworkflowPage.canViewQuickText();

	}

	@Then("the user should be able to Action Work Flow BOT Call")
	public void userShouldBeAbleToViewActionWorkflowBotCall() {

		clinicalworkflowPage.canViewActionWorkflowBotCall();

	}

	@Then("the user should be able to Action Work Flow Text")
	public void userShouldBeAbleToViewActionWorkflowText() {

		clinicalworkflowPage.canViewActionWorkflowText();

	}

	@Then("the user should be able to Fax")
	public void userShouldBeAbleToFax() {

		clinicalworkflowPage.canSendFax();

	}

	@Then("the user should be able to Action Work Flow Mail")
	public void userShouldBeAbleToViewActionWorkflowMail() {

		clinicalworkflowPage.canViewActionWorkflowMail();

	}

	@Then("the user should be able to view Action Work Flow")
	public void userShouldBeAbleToViewActionWorkflow() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalWorkflowActionWorkflowUrl = Hooks.prop.getProperty("clinicalWorkflowActionWorkflowUrl");

		Assert.assertNotNull("clinicalWorkflowActionWorkflowUrl is missing in config",
				clinicalWorkflowActionWorkflowUrl);

		String fullUrl = baseUrl + clinicalWorkflowActionWorkflowUrl;

		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openclinicalWorkflowActionWorkflowUrl(fullUrl);

		Assert.assertTrue("Action Workflow page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/ClinicalWorkflow/Home/ActionWorkflow"));
	}

	@And("I create a profile Full Action Work Flow Access with All Permissions")
	public void createProfileWithFullActionWorkflowAccessAndAllPermissions() {
		clinicalworkflowPage.clickFilterButton();
		clinicalworkflowPage.enterProfileName();
		clinicalworkflowPage.clickSearchButton();
		clinicalworkflowPage.clickActionMenu();
		clinicalworkflowPage.clickEditButton();
		clinicalworkflowPage.userCreatesProfileWithFullAccessAndAllPermissions();
		clinicalworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Clinicalworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Clinicalworkflow Module General Audit View");
	}

	// Dashboard
	@And("I create a profile View Only Access")
	public void createProfileWithViewOnlyAccess() {
		clinicalworkflowPage.clickFilterButton();
		clinicalworkflowPage.enterProfileName();
		clinicalworkflowPage.clickSearchButton();
		clinicalworkflowPage.clickActionMenu();
		clinicalworkflowPage.clickEditButton();
		clinicalworkflowPage.userCreatesProfileWithViewOnlyAccess();
		clinicalworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Clinicalworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Clinicalworkflow Module General Audit View");
	}

	@Then("the user should not be able to Update Appointment Action")
	public void userShouldNotBeAbleToUpdateAppointmentAction() {

		clinicalworkflowPage.cannotUpdateAppointmentAction();

	}

	@Then("the user should not be able to All Communication View")
	public void userShouldNotBeAbleToViewAllCommunication() {

		clinicalworkflowPage.cannotViewAllCommunication();

	}

	@Then("the user should not be able to Export To Excel")
	public void userShouldNotBeAbleToExportToExcel() {

		clinicalworkflowPage.cannotExportToExcel();

	}

	@Then("the user should not be able to initiate BOT Call")
	public void userShouldNotBeAbleToInitiateBotCall() {

		clinicalworkflowPage.cannotInitiateBotCall();

	}

	@Then("the user should not be able to send Text")
	public void userShouldNotBeAbleToSendText() {

		clinicalworkflowPage.cannotSendText();

	}

	@Then("the user should not be able to send Mail")
	public void userShouldNotBeAbleToSendMail() {

		clinicalworkflowPage.cannotSendMail();

	}

	@Then("the user should be able to view Dashboard")
	public void userCanViewDashboard() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalWorkflowDashboard = Hooks.prop.getProperty("clinicalWorkflowDashboard");

		Assert.assertNotNull("clinicalWorkflowDashboard is missing in config", clinicalWorkflowDashboard);

		String fullUrl = baseUrl + clinicalWorkflowDashboard;

		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openClinicalWorkflowDashboard(fullUrl);

		Assert.assertTrue("Dashboard page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/ClinicalWorkflow/Home/Dashboard"));
	}

	@Then("the user should be able to Update Appointment Action")
	public void updateAppointmentAction() {
		clinicalworkflowPage.userUpdatesAppointment();

	}

	@Then("the user should be able to All Communication View")
	public void userCanViewAllCommunications() {
		clinicalworkflowPage.verifyUserCanViewAllCommunications();

	}

	@Then("the user should be able to Export To Excel")
	public void userShouldBeAbleToExportToExcel() {
		clinicalworkflowPage.userCanDownloadExcel();

	}

	@Then("the user should be able to BOT Call")
	public void userCanInitiateBotCall() {
		clinicalworkflowPage.userCanMakeBotCall();

	}

	@Then("the user should be able to Text")
	public void verifyUserCanSendText() {
		clinicalworkflowPage.userCanSendText();

	}

	@Then("the user should be able to Mail")
	public void userShouldBeAbleToSendMail() {
		clinicalworkflowPage.verifyUserCanSendMail();

	}

	@And("I create a profile Full Dashboard Access with All Permissions")
	public void createProfileWithFullDashboardAccessAndAllPermissions() {
		clinicalworkflowPage.clickFilterButton();
		clinicalworkflowPage.enterProfileName();
		clinicalworkflowPage.clickSearchButton();
		clinicalworkflowPage.clickActionMenu();
		clinicalworkflowPage.clickEditButton();
		clinicalworkflowPage.createFullAccessDashboardProfile();
		clinicalworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Clinicalworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Clinicalworkflow Module General Audit View");
	}

	// General

	@And("I create a profile with no access to Clinicalworkflow Module General Audit View test")
	public void createProfileWithNoAccessToClinicalWorkflowModuleGeneralAuditView() {
		clinicalworkflowPage.clickFilterButton();
		clinicalworkflowPage.enterProfileName();
		clinicalworkflowPage.clickSearchButton();
		clinicalworkflowPage.clickActionMenu();
		clinicalworkflowPage.clickEditButton();
		clinicalworkflowPage.createProfileNoClinicalWorkflowAuditAccess();
		clinicalworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Clinicalworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Clinicalworkflow Module General Audit View");
	}

	@Then("the Clinicalworkflow user should be able to view Profiles")
	public void clinicalworkflowUserShouldBeAbleToViewProfiles() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String profilesPageUrl = Hooks.prop.getProperty("profilesPageUrl");
		String fullUrl = baseUrl + profilesPageUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openclinicalworkflowPage(fullUrl, "/Setup/Home/Profiles");
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Profiles"));
		System.out.println("Clinicalworkflow user should be able to view Profiles test");
		Hooks.scenario.log("Clinicalworkflow user should be able to view Profiles test");

	}

	@And("I create a profile with View access only to Clinicalworkflow Module General Audit View test")
	public void createProfileWithViewAccessOnlyToClinicalWorkflowGeneralAuditView() {
		clinicalworkflowPage.clickFilterButton();
		clinicalworkflowPage.enterProfileName();
		clinicalworkflowPage.clickSearchButton();
		clinicalworkflowPage.clickActionMenu();
		clinicalworkflowPage.clickEditButton();
		clinicalworkflowPage.createProfileWithViewOnlyAccessToClinicalWorkflowAudit();
		clinicalworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Clinicalworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Clinicalworkflow Module General Audit View");
	}

	@Then("the user should not able to view Clinicalworkflow Module General Audit View test")
	public void userCannotViewClinicalWorkflowAudit() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalWorkflowUrl = Hooks.prop.getProperty("clinicalWorkflowUrl");

		Assert.assertNotNull("deliveryMarkerUrl is missing in config", clinicalWorkflowUrl);

		String fullUrl = baseUrl + clinicalWorkflowUrl;

		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openclinicalworkflowPage(fullUrl);

		clinicalworkflowPage.userCannotAccessClinicalWorkflowAuditView();
	}

	@Then("the user should be able to view Clinicalworkflow Module General Audit View test")
	public void userShouldBeAbleToViewClinicalWorkflowModuleGeneralAudit() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalWorkflowUrl = Hooks.prop.getProperty("clinicalWorkflowUrl");

		Assert.assertNotNull("deliveryMarkerUrl is missing in config", clinicalWorkflowUrl);

		String fullUrl = baseUrl + clinicalWorkflowUrl;

		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openclinicalworkflowPage(fullUrl);

		Assert.assertTrue("Page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/ClinicalWorkflow/Home/ActionWorkflow"));

		clinicalworkflowPage.verifyGeneralAuditViewColumns();
	}
}
