package com.pharmcrm_RxworkflowModule.steps;

import org.junit.Assert;
import com.pharmcrm_RxworkflowModule.pages.rxworkflowpage;
import com.pharmcrm_SetupModule.pages.setuppage;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class rxworkflowstep {

	private rxworkflowpage rxworkflowPage;

	// Success Result Action
	@Then("the user should be able to view Success Result Action in Workflow Module test")
	public void shouldAllowViewingSuccessResultActionInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String successResultActionsPageUrl = Hooks.prop.getProperty("successResultActionsPageUrl");
		Assert.assertNotNull("successResultActionsPageUrl is missing in config", successResultActionsPageUrl);
		String fullUrl = baseUrl + successResultActionsPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openSuccessResultActionsPage(fullUrl);
		Assert.assertTrue("Success Result Actions page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/SuccessResultActions"));

		rxworkflowPage.testReminderResultActionIsViewableInWorkflowModule();

	}
	
	@And("I create a profile with View and Edit access but no Add or Delete access to Success Result Action in Workflow Module test")
	public void shouldAllowViewAndEditButNotAddOrDeleteSuccessResultActionInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testSuccessResultActionViewEditOnlyNoAddDeleteInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}
	
	@And("I create a profile with View and Delete access but no Add or Edit access to Success Result Action in Workflow Module test")
	public void shouldAllowViewAndDeleteButNotAddOrEditSuccessResultActionInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testSuccessResultActionViewDeleteOnlyNoAddEditInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}
	
	@And("I create a profile with View and Add access but no Edit or Delete access to Success Result Action in Workflow Module test")
	public void shouldAllowViewAndAddButNotEditOrDeleteSuccessResultActionInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testSuccessResultActionViewAddOnlyNoEditDeleteInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	// Reminder Result Action
	@Then("the user should not be able to add Reminder Result Action in Workflow Module test")
	public void shouldNotAllowAddingReminderResultActionInWorkflowModule() {

		rxworkflowPage.testReminderResultActionCannotBeAddedInWorkflowModule();

	}

	@Then("the user should not be able to delete Reminder Result Action in Workflow Module test")
	public void shouldNotAllowDeletingReminderResultActionInWorkflowModule() {

		rxworkflowPage.reminderResultActionShouldNotBeDeletableInWorkflowModule();

	}

	@Then("the user should not be able to edit Reminder Result Action in Workflow Module test")
	public void shouldNotAllowEditingReminderResultActionInWorkflowModule() {

		rxworkflowPage.testReminderResultActionCannotBeEditedInWorkflowModule();

	}

	@Then("the user should be able to edit Reminder Result Action in Workflow Module test")
	public void shouldAllowEditingReminderResultActionInWorkflowModule() {

		rxworkflowPage.testReminderResultActionIsEditableInWorkflowModule();

	}

	@Then("the user should be able to add Reminder Result Action in Workflow Module test")
	public void shouldAllowAddingReminderResultActionInWorkflowModule() {

		rxworkflowPage.testReminderResultActionIsAddableInWorkflowModule();

	}

	@Then("the user should be able to delete Reminder Result Action in Workflow Module test")
	public void shouldAllowDeletingReminderResultActionInWorkflowModule() {

		rxworkflowPage.testReminderResultActionIsDeletableInWorkflowModule();

	}

	@Then("the user should be able to view Reminder Result Action in Workflow Module test")
	public void shouldAllowViewingReminderResultActionInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reminderResultActionsPageUrl = Hooks.prop.getProperty("reminderResultActionsPageUrl");
		Assert.assertNotNull("reminderResultActionsPageUrl is missing in config", reminderResultActionsPageUrl);
		String fullUrl = baseUrl + reminderResultActionsPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openReminderResultActionsPage(fullUrl);
		Assert.assertTrue("Reminder Result Actions page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ReminderResultActions"));

		rxworkflowPage.testReminderResultActionIsViewableInWorkflowModule();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Reminder Result Action in Workflow Module test")
	public void shouldAllowViewAndDeleteButNotAddOrEditReminderResultActionInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testReminderResultActionViewDeleteOnlyNoAddEditInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Reminder Result Action in Workflow Module test")
	public void shouldAllowViewAndEditButNotAddOrDeleteReminderResultActionInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testReminderResultActionViewEditOnlyNoAddDeleteInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Reminder Result Action in Workflow Module test")
	public void shouldAllowViewAndAddButNotEditOrDeleteReminderResultActionInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testReminderResultActionViewAddOnlyNoEditDeleteInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	// Medication SyncReminder Color Code
	@Then("the user should be able to delete Medication Sync Reminder Color Code in Workflow Module test")
	public void shouldAllowDeletingMedicationSyncReminderColorCodeInWorkflowModule() {

		rxworkflowPage.testMedicationSyncReminderColorCodeIsDeletableInWorkflowModule();

	}

	@Then("the user should not be able to add Medication Sync Reminder Color Code in Workflow Module test")
	public void shouldNotAllowAddingMedicationSyncReminderColorCodeInWorkflowModule() {

		rxworkflowPage.testMedicationSyncReminderColorCodeCannotBeAddedInWorkflowModule();

	}

	@Then("the user should not be able to delete Medication Sync Reminder Color Code in Workflow Module test")
	public void shouldNotAllowDeletingMedicationSyncReminderColorCodeInWorkflowModule() {

		rxworkflowPage.testMedicationSyncReminderColorCodeCannotBeDeletedInWorkflowModule();

	}

	@Then("the user should not be able to edit Medication Sync Reminder Color Code in Workflow Module test")
	public void shouldNotAllowEditingMedicationSyncReminderColorCodeInWorkflowModule() {

		rxworkflowPage.testMedicationSyncReminderColorCodeIsNotEditableInWorkflowModule();

	}

	@Then("the user should be able to add Medication Sync Reminder Color Code in Workflow Module test")
	public void userShouldBeAbleToAddMedicationSyncReminderColorCodeInWorkflowModuleTest() {

		rxworkflowPage.verifyUserCanAddMedicationSyncReminderColorCode();

	}

	@Then("the user should be able to edit Medication Sync Reminder Color Code in Workflow Module test")
	public void shouldAllowEditingMedicationSyncReminderColorCodeInWorkflowModule() {

		rxworkflowPage.testMedicationSyncReminderColorCodeIsEditableInWorkflowModule();

	}

	@Then("the user should be able to view Medication Sync Reminder Color Code in Workflow Module test")
	public void userShouldBeAbleToViewMedicationSyncReminderColorCodeInWorkflowModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String medicationSyncReminderColorCodesPageUrl = Hooks.prop
				.getProperty("medicationSyncReminderColorCodesPageUrl");
		Assert.assertNotNull("medicationSyncReminderColorCodesPageUrl is missing in config",
				medicationSyncReminderColorCodesPageUrl);
		String fullUrl = baseUrl + medicationSyncReminderColorCodesPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openMedicationSyncReminderColorCodesPage(fullUrl);
		Assert.assertTrue("Medication Sync Reminder Color Codes page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/MedicationSyncReminderColorCodes"));

		rxworkflowPage.verifyUserCanViewMedicationSyncReminderColorCode();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Medication Sync Reminder Color Code in Workflow Module test")
	public void testMedicationSyncReminderColorCodeViewDeleteOnlyNoAddEditInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.medicationSyncReminderColorCodeAccessControlViewDeleteOnlyInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Medication Sync Reminder Color Code in Workflow Module test")
	public void shouldAllowViewAndEditButNotAddOrDeleteMedicationSyncReminderColorCodeInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testMedicationSyncReminderColorCodeViewEditOnlyNoAddDeleteInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Medication Sync Reminder Color Code in Workflow Module test")
	public void createProfileWithViewAndAddAccessNoEditOrDeleteForMedicationSyncReminderColorCodeTest() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.createProfileWithViewAddOnlyAccessForMedicationSyncReminderColorCode();
		rxworkflowPage.clickSubmitButton();

	}

	// Sync Workflow Settings
	@Then("the user should be able to delete Sync Workflow Settings in Workflow Module test")
	public void userShouldBeAbleToDeleteSyncWorkflowSettingsInWorkflowModuleTest() {

		rxworkflowPage.verifyUserCanDeleteSyncWorkflowSettings();

	}

	@Then("the user should not be able to add Sync Workflow Settings in Workflow Module test")
	public void userShouldNotBeAbleToAddSyncWorkflowSettingsInWorkflowModuleTest() {

		rxworkflowPage.verifyUserCannotAddSyncWorkflowSettings();

	}

	@Then("the user should be able to edit Sync Workflow Settings in Workflow Module test")
	public void userShouldBeAbleToEditSyncWorkflowSettingsInWorkflowModuleTest() {

		rxworkflowPage.verifyUserCanEditSyncWorkflowSettings();

	}

	@Then("the user should not be able to delete Sync Workflow Settings in Workflow Module test")
	public void userShouldNotBeAbleToDeleteSyncWorkflowSettingsInWorkflowModuleTest() {

		rxworkflowPage.verifyUserCannotDeleteSyncWorkflowSettings();

	}

	@Then("the user should not be able to edit Sync Workflow Settings in Workflow Module test")
	public void userShouldNotBeAbleToEditSyncWorkflowSettingsInWorkflowModuleTest() {

		rxworkflowPage.assertNoEditAccessToSyncWorkflowSettings();

	}

	@Then("the user should be able to add Sync Workflow Settings in Workflow Module test")
	public void userShouldBeAbleToAddSyncWorkflowSettingsInWorkflowModuleTest() {

		rxworkflowPage.verifyUserCanAddSyncWorkflowSettings();

	}

	@Then("the user should be able to view Sync Workflow Settings in Workflow Module test")
	public void userShouldBeAbleToViewSyncWorkflowSettingsInWorkflowModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String medicationSyncReminderSettingPageUrl = Hooks.prop.getProperty("medicationSyncReminderSettingPageUrl");
		Assert.assertNotNull("medicationSyncReminderSettingPageUrl is missing in config",
				medicationSyncReminderSettingPageUrl);
		String fullUrl = baseUrl + medicationSyncReminderSettingPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openMedicationSyncReminderSettingPage(fullUrl);
		Assert.assertTrue("Sync Workflow Setting page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/MedicationSyncReminderSetting"));
		rxworkflowPage.assertUserViewAccessToSyncWorkflowSettings();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Sync Workflow Settings in Workflow Module test")
	public void createProfileWithViewAndDeleteAccessNoAddOrEditForSyncWorkflowSettingsTest() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.setupProfileViewDeleteNoAddEditSyncWorkflow();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Sync Workflow Settings in Workflow Module test")
	public void createProfileWithViewAndEditAccessNoAddOrDeleteForSyncWorkflowSettingsTest() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.setupProfileViewEditNoAddDeleteSyncWorkflow();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Sync Workflow Settings in Workflow Module test")
	public void createProfileWithViewAndAddAccessNoEditOrDeleteForSyncWorkflowSettingsTest() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.createProfileWithViewAddOnlyAccessForSyncWorkflowSettings();
		rxworkflowPage.clickSubmitButton();

	}

	// General

	@Then("the Rxworkflow user should be able to view Profiles")
	public void rxworkflowUserShouldBeAbleToViewProfiles() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String profilesPageUrl = Hooks.prop.getProperty("profilesPageUrl");
		String fullUrl = baseUrl + profilesPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openrxworkflowPage(fullUrl, "/Setup/Home/Profiles");
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Profiles"));
		System.out.println("Rxworkflow user should be able to view Profiles test");
		Hooks.scenario.log("Rxworkflow user should be able to view Profiles test");

	}

	@And("I create a profile with No access to Workflow Module General Audit View test")
	public void createProfileWithNoAccessToWorkflowGeneralAuditViewTest() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.createNoAccessProfileForWorkflowAuditViewTest();
		rxworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Rxworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Rxworkflow Module General Audit View");
	}

	@And("I create a profile with View access only to Rxworkflow Module General Audit View test")
	public void createProfileWithViewAccessOnlyToRxworkflowGeneralAuditView() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.createViewOnlyProfileForRxworkflowAuditView();
		rxworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Rxworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Rxworkflow Module General Audit View");
	}

	@Then("the user should not be able to view General Audit View settings in Workflow Module test")
	public void userShouldNotBeAbleToViewWorkflowGeneralAuditViewSettingsTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String workflowDashboardUrl = Hooks.prop.getProperty("workflowDashboardUrl");
		Assert.assertNotNull("workflowDashboardUrl is missing in config", workflowDashboardUrl);
		String fullUrl = baseUrl + workflowDashboardUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openWorkflowDashboardPage(fullUrl);
		Assert.assertTrue("Page is not displayed", Hooks.driver.getCurrentUrl().contains("/Workflow/Home/Dashboard"));
		rxworkflowPage.verifyUserCannotViewWorkflowAuditSettings();

	}

	@Then("the user should be able to view Rxworkflow Module General Audit View test")
	public void userShouldBeAbleToViewRxworkflowGeneralAuditViewTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String workflowDashboardUrl = Hooks.prop.getProperty("workflowDashboardUrl");
		Assert.assertNotNull("workflowDashboardUrl is missing in config", workflowDashboardUrl);
		String fullUrl = baseUrl + workflowDashboardUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openWorkflowDashboardPage(fullUrl);
		Assert.assertTrue("Page is not displayed", Hooks.driver.getCurrentUrl().contains("/Workflow/Home/Dashboard"));
		rxworkflowPage.assertUserViewAccessToRxworkflowAuditView();

	}
}
