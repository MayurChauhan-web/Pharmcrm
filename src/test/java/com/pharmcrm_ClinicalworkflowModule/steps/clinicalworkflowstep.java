package com.pharmcrm_ClinicalworkflowModule.steps;

import org.junit.Assert;
import com.pharmcrm_ClinicalworkflowModule.pages.clinicalworkflowpage;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class clinicalworkflowstep {

	private clinicalworkflowpage clinicalworkflowPage;

	// RPM Followup
	@Then("the user should not be able to RPM Followup All Communication View")
	public void restrictRpmFollowupAllCommunicationView() {
		clinicalworkflowPage.preventRpmFollowupAllCommunicationView();

	}

	@Then("the user should not be able to RPM Followup Notes Add")
	public void denyRpmFollowupNotesAdd() {
		clinicalworkflowPage.restrictRpmFollowupNotesAdd();

	}

	@Then("the user should not be able to RPM Followup Notes View")
	public void restrictRpmFollowupNotesView() {
		clinicalworkflowPage.disableRpmFollowupNotesView();

	}

	@Then("the user should not be able to RPM Followup Status Update")
	public void restrictRpmFollowupStatusUpdate() {
		clinicalworkflowPage.disableRpmFollowupStatusUpdate();

	}

	@Then("the user should not be able to RPM Followup Export To Excel")
	public void preventRpmFollowupExportToExcel() {
		clinicalworkflowPage.blockRpmFollowupExportToExcel();

	}

	@Then("the user should not be able to RPM Followup Send VCard")
	public void restrictRpmFollowupSendVCard() {
		clinicalworkflowPage.preventRpmFollowupSendVCard();

	}

	@Then("the user should not be able to RPM Followup Quick Text")
	public void preventRpmFollowupQuickText() {
		clinicalworkflowPage.disableRpmFollowupQuickText();

	}

	@Then("the user should not be able to RPM Followup BOT Call")
	public void disableRpmFollowupBotCall() {
		clinicalworkflowPage.restrictRpmFollowupBotCall();

	}

	@Then("the user should not be able to RPM Followup Text")
	public void disableRpmFollowupText() {
		clinicalworkflowPage.preventRpmFollowupText();

	}

	@Then("the user should not be able to RPM Followup Fax")
	public void blockRpmFollowupFax() {
		clinicalworkflowPage.preventRpmFollowupFax();

	}

	@Then("the user should not be able to RPM Followup Mail")
	public void blockRpmFollowupMail() {
		clinicalworkflowPage.restrictRpmFollowupMail();

	}

	@And("I create a profile RPM Followup Access with view only Permissions")
	public void allowRpmFollowupMailView() {
		clinicalworkflowPage.clickFilterButton();
		clinicalworkflowPage.enterProfileName();
		clinicalworkflowPage.clickSearchButton();
		clinicalworkflowPage.clickActionMenu();
		clinicalworkflowPage.clickEditButton();
		clinicalworkflowPage.allowRpmFollowupFaxView();
		clinicalworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Clinicalworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Clinicalworkflow Module General Audit View");
	}

	@Then("the user should be able to RPM Followup All Communication View")
	public void allowRpmFollowupAllCommunicationView() {
		clinicalworkflowPage.grantRpmFollowupAllCommunicationView();

	}

	@Then("the user should be able to RPM Followup Notes Add")
	public void allowRpmFollowupNotesAdd() {
		clinicalworkflowPage.grantRpmFollowupNotesAdd();

	}

	@Then("the user should be able to RPM Followup Notes View")
	public void allowRpmFollowupNotesView() {
		clinicalworkflowPage.grantRpmFollowupNotesView();

	}

	@Then("the user should be able to RPM Followup Status Update")
	public void authorizeRpmFollowupStatusUpdate() {
		clinicalworkflowPage.permitRpmFollowupStatusUpdate();

	}

	@Then("the user should be able to RPM Followup Export To Excel")
	public void allowRpmFollowupExportToExcel() {
		clinicalworkflowPage.enableRpmFollowupExportToExcel();

	}

	@Then("the user should be able to RPM Followup Send VCard")
	public void allowRpmFollowupSendVCard() {
		clinicalworkflowPage.grantRpmFollowupSendVCard();

	}

	@Then("the user should be able to RPM Followup Quick Text")
	public void authorizeRpmFollowupQuickText() {
		clinicalworkflowPage.grantRpmFollowupQuickText();

	}

	@Then("the user should be able to RPM Followup BOT Call")
	public void allowRpmFollowupBotCall() {
		clinicalworkflowPage.enableRpmFollowupBotCall();

	}

	@Then("the user should be able to RPM Followup Text")
	public void allowRpmFollowupText() {
		clinicalworkflowPage.grantRpmFollowupText();

	}

	@Then("the user should be able to RPM Followup Fax")
	public void allowRpmFollowupFax() {
		clinicalworkflowPage.enableRpmFollowupFax();

	}

	@Then("the user should be able to RPM Followup Mail")
	public void allowRpmFollowupMail() {
		clinicalworkflowPage.enableRpmFollowupMail();

	}

	@Then("the user should be able to view RPM Followup")
	public void allowRpmFollowupView() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalWorkflowRpmFollowupsUrl = Hooks.prop.getProperty("clinicalWorkflowRpmFollowupsUrl");

		Assert.assertNotNull("clinicalWorkflowRpmFollowupsUrl is missing in config", clinicalWorkflowRpmFollowupsUrl);

		String fullUrl = baseUrl + clinicalWorkflowRpmFollowupsUrl;

		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openclinicalWorkflowRpmFollowupsUrl(fullUrl);

		Assert.assertTrue("RPM Followups page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/ClinicalWorkflow/Home/RPMFollowups"));
	}

	@And("I create a profile Full RPM Followup Access with All Permissions")
	public void preventAppointmentOutreachAllCommunicationView() {
		clinicalworkflowPage.clickFilterButton();
		clinicalworkflowPage.enterProfileName();
		clinicalworkflowPage.clickSearchButton();
		clinicalworkflowPage.clickActionMenu();
		clinicalworkflowPage.clickEditButton();
		clinicalworkflowPage.denyAppointmentOutreachAllCommunicationView();
		clinicalworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Clinicalworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Clinicalworkflow Module General Audit View");
	}

	// Appointment Outreach
	@Then("the user should not be able to Appointment All Communication View")
	public void disableAppointmentOutreachAllCommunicationView() {
		clinicalworkflowPage.preventAppointmentOutreachAllCommunicationView();

	}

	@Then("the user should not be able to Appointment OutReach Notes Add")
	public void disableAppointmentOutreachNotesAdd() {
		clinicalworkflowPage.preventAppointmentOutreachNotesAdd();

	}

	@Then("the user should not be able to Appointment OutReach Notes View")
	public void disableAppointmentOutreachNotesView() {
		clinicalworkflowPage.preventAppointmentOutreachNotesView();

	}

	@Then("the user should not be able to Appointment Status Update")
	public void disableAppointmentStatusUpdate() {
		clinicalworkflowPage.preventAppointmentStatusUpdate();

	}

	@Then("the user should not be able to Appointment Outreach Export To Excel")
	public void disableAppointmentOutreachExportToExcel() {
		clinicalworkflowPage.preventAppointmentOutreachExportToExcel();

	}

	@Then("the user should not be able to Appointment Outreach Send VCard")
	public void disableAppointmentOutreachSendVCard() {
		clinicalworkflowPage.preventAppointmentOutreachSendVCard();

	}

	@Then("the user should not be able to Appointment Outreach Quick Text")
	public void disableAppointmentOutreachQuickText() {
		clinicalworkflowPage.preventAppointmentOutreachQuickText();

	}

	@Then("the user should not be able to Appointment Outreach BOT Call")
	public void disableAppointmentOutreachBotCall() {
		clinicalworkflowPage.preventAppointmentOutreachBotCall();

	}

	@Then("the user should not be able to Appointment Outreach Text")
	public void disableAppointmentOutreachText() {
		clinicalworkflowPage.preventAppointmentOutreachText();

	}

	@Then("the user should not be able to Appointment Outreach Fax")
	public void disableAppointmentOutreachFax() {
		clinicalworkflowPage.preventAppointmentOutreachFax();

	}

	@Then("the user should not be able to Appointment Outreach Mail")
	public void disableAppointmentOutreachMailForUser() {
		clinicalworkflowPage.restrictAppointmentOutreachMail();

	}

	@Then("the user should be able to view Appointment Outreach")
	public void grantViewAppointmentOutreachAccess() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalWorkflowAppointmentOutreachUrl = Hooks.prop
				.getProperty("clinicalWorkflowAppointmentOutreachUrl");

		Assert.assertNotNull("clinicalWorkflowAppointmentOutreachUrl is missing in config",
				clinicalWorkflowAppointmentOutreachUrl);

		String fullUrl = baseUrl + clinicalWorkflowAppointmentOutreachUrl;

		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openclinicalWorkflowAppointmentOutreachUrl(fullUrl);

		Assert.assertTrue("Appointment Outreach page is not displayed",
				Hooks.driver.getCurrentUrl().contains(clinicalWorkflowAppointmentOutreachUrl));
	}

	@Then("the user should not be able to Action Work Flow Export To Excel")
	public void verifyUserCannotExportActionWorkflowToExcel() {
		clinicalworkflowPage.verifyWorkflowExportToExcelIsDisabled();

	}

	@And("I create a profile with view only Access Appointment Outreach")
	public void createAppointmentOutreachViewOnlyProfile() {
		clinicalworkflowPage.clickFilterButton();
		clinicalworkflowPage.enterProfileName();
		clinicalworkflowPage.clickSearchButton();
		clinicalworkflowPage.clickActionMenu();
		clinicalworkflowPage.clickEditButton();
		clinicalworkflowPage.createProfileWithAppointmentOutreachViewAccess();
		clinicalworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Clinicalworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Clinicalworkflow Module General Audit View");
	}

	@Then("the user should be able to Appointment All Communication View")
	public void canViewAllAppointmentCommunications() {
		clinicalworkflowPage.hasPermissionToViewAllAppointmentCommunications();

	}

	@Then("the user should be able to Appointment OutReach Notes Add")
	public void canAddAppointmentOutreachNotes() {
		clinicalworkflowPage.hasPermissionToAddAppointmentOutreachNotes();

	}

	@Then("the user should be able to Appointment OutReach Notes View")
	public void canViewAppointmentOutreachNotes() {
		clinicalworkflowPage.hasPermissionToViewAppointmentOutreachNotes();

	}

	@Then("the user should be able to Appointment Status Update")
	public void hasPermissionToUpdateAppointmentStatus() {
		clinicalworkflowPage.canUpdateAppointmentStatus();

	}

	@Then("the user should be able to Appointment Outreach Export To Excel")
	public void canExportAppointmentOutreachToExcel() {
		clinicalworkflowPage.hasPermissionToExportAppointmentOutreachToExcel();

	}

	@Then("the user should be able to Appointment Outreach Send VCard")
	public void canSendAppointmentOutreachVCard() {
		clinicalworkflowPage.hasPermissionToSendAppointmentOutreachVCard();

	}

	@Then("the user should be able to Appointment Outreach Quick Text")
	public void canSendAppointmentOutreachQuickText() {
		clinicalworkflowPage.hasPermissionToSendAppointmentOutreachQuickText();

	}

	@Then("the user should be able to Appointment Outreach BOT Call")
	public void canSendAppointmentOutreachBotCall() {
		clinicalworkflowPage.hasPermissionToSendAppointmentOutreachBotCall();

	}

	@Then("the user should be able to Appointment Outreach Text")
	public void hasPermissionToSendAppointmentOutreachText() {
		clinicalworkflowPage.canSendAppointmentOutreachText();

	}

	@Then("the user should be able to Appointment Outreach Fax")
	public void canSendAppointmentOutreachFax() {
		clinicalworkflowPage.hasPermissionToSendAppointmentOutreachFax();

	}

	@Then("the user should be able to Appointment Outreach Mail")
	public void canSendAppointmentOutreachMail() {
		clinicalworkflowPage.hasPermissionToSendAppointmentOutreachMail();

	}

	@And("I create a profile Full Appointment Outreach Access with All Permissions")
	public void createFullAppointmentOutreachAccessWithAllPermissions() {
		clinicalworkflowPage.clickFilterButton();
		clinicalworkflowPage.enterProfileName();
		clinicalworkflowPage.clickSearchButton();
		clinicalworkflowPage.clickActionMenu();
		clinicalworkflowPage.clickEditButton();
		clinicalworkflowPage.createFullAppointmentOutreachAccess();
		clinicalworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Clinicalworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Clinicalworkflow Module General Audit View");
	}

	// Action Work Flow

	@Then("the user should not be able to Send VCard")
	public void verifyUserCannotSendVCard() {
		clinicalworkflowPage.verifyUserIsRestrictedFromSendingVCard();

	}

	@Then("the user should not be able to Grid Template Company Default Checkbox")
	public void verifyUserCannotSelectGridTemplateCompanyDefaultCheckbox() {
		clinicalworkflowPage.verifyUserCannotUseCompanyDefaultCheckboxForGridTemplate();

	}

	@Then("the user should not be able to Grid Template Delete")
	public void verifyUserCannotDeleteGridTemplate() {
		clinicalworkflowPage.userShouldNotBeAbleToDeleteGridTemplate();

	}

	@Then("the user should not be able to Grid Template Edit")
	public void verifyUserCannotEditGridTemplate() {
		clinicalworkflowPage.userShouldNotBeAbleToEditGridTemplate();

	}

	@Then("the user should not be able to Grid Template Add")
	public void verifyUserCannotAddGridTemplate() {
		clinicalworkflowPage.verifyUserCannotAccessGridTemplateAdd();

	}

	@Then("the user should not be able to Show Past Runninglines Checkbox")
	public void verifyUserCannotAccessShowPastRunninglinesCheckbox() {
		clinicalworkflowPage.verifyUserCannotViewPastRunninglinesCheckbox();

	}

	@Then("the user should not be able to Show All Runninglines Checkbox")
	public void verifyUserCannotAccessShowAllRunninglinesCheckbox() {
		clinicalworkflowPage.verifyUserCannotSelectShowAllRunninglinesCheckbox();

	}

	@Then("the user should not be able to Quick Text")
	public void verifyUserCannotQuickText() {
		clinicalworkflowPage.userShouldNotBeAbleToQuickText();

	}

	@Then("the user should not be able to Send Mail/Fax/Text/BOT Call")
	public void verifyUserCannotSendCommunication() {

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

	@And("I create a profile with view only Access")
	public void createProfileWithPermissions() {
		clinicalworkflowPage.clickFilterButton();
		clinicalworkflowPage.enterProfileName();
		clinicalworkflowPage.clickSearchButton();
		clinicalworkflowPage.clickActionMenu();
		clinicalworkflowPage.clickEditButton();
		clinicalworkflowPage.iCreateAProfileWithViewOnlyAccess();
		clinicalworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Clinicalworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Clinicalworkflow Module General Audit View");
	}

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

	@Then("the user should not be able to Send Mail, Fax, Text, BOT Call")
	public void verifyUserCannotSendMailFaxTextOrBotCall() {
		clinicalworkflowPage.verifyUserCannotSendCommunications();

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
