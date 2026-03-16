package com.pharmcrm_SetupModule.steps;

import org.junit.Assert;
import com.pharmcrm_SetupModule.pages.setuppage;
import hooks.Hooks;
import io.cucumber.java.en.And;

public class setupstep {

	private setuppage setupPage;

	// BOT Call Template

	@And("the user should not be able to edit or delete any BOT call template test")
	public void verifyUserCannotEditOrDeleteBotCallTemplates() throws InterruptedException {
		setupPage.verifyUserCannotEditOrDeleteBotCallTemplate();

	}

	@And("the user should be able to add a new BOT call template test")
	public void verifyUserCanAddNewBotCallTemplate() throws InterruptedException {
		setupPage.verifyUserCanAddBotCallTemplate();

	}

	@And("I create a profile with View and Add access to Setup Module → BOT Call Template test")
	public void createProfileWithSetupBotCallTemplateViewAndAddAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.profileWithSetupBotCallTemplateViewAndAddPermissions();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to add, edit, or delete any BOT call template test")
	public void verifyUserCannotModifyBotCallTemplates() throws InterruptedException {
		setupPage.verifyUserCannotAddEditOrDeleteBotCallTemplate();

	}

	@And("the user should be able to view BOT call templates test")
	public void verifyUserCanViewBotCallTemplates() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String botCallTemplatesPageUrl = Hooks.prop.getProperty("botCallTemplatesPageUrl");

		Assert.assertNotNull("botCallTemplatesPageUrl is missing in config", botCallTemplatesPageUrl);

		String fullBotCallTemplatesUrl = baseUrl + botCallTemplatesPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openBotCallTemplatesPage(fullBotCallTemplatesUrl);

		Assert.assertTrue("BOT Call Templates page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/BOTCallTemplates"));
	}

	@And("I create a profile with View access only to Setup Module → BOT Call Template test")
	public void createProfileWithSetupBotCallTemplateViewAccessOnly() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.profileWithSetupBotCallTemplateViewPermissions();
		setupPage.clickSubmitButton();

	}

	// Text Template
	@And("I create a profile with full access to Setup Module → Text Template test")
	public void createProfileWithFullSetupTextTemplateAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.profileWithSetupTextTemplateFullPermissions();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to delete any text template test")
	public void verifyUserCannotDeleteTextTemplates() throws InterruptedException {
		setupPage.verifyDeleteOptionNotAvailableForTextTemplates();

	}

	@And("the user should be able to delete a text template test")
	public void verifyUserCanDeleteTextTemplate() throws InterruptedException {
		setupPage.verifyUserCanDeleteTextTemplate();

	}

	@And("the user should be able to edit an existing text template test")
	public void verifyUserCanEditExistingTextTemplate() throws InterruptedException {
		setupPage.verifyUserCanEditExistingTextTemplate();

	}

	@And("I create a profile with View, Add, and Edit access to Setup Module → Text Template test")
	public void createProfileWithSetupTextTemplateViewAddEditAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.setupTextTemplateProfileWithViewAddEditPermissions();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to edit or delete any text template test")
	public void verifyUserCannotEditOrDeleteTextTemplates() throws InterruptedException {
		setupPage.verifyUserCannotEditOrDeleteTextTemplates();

	}

	@And("the user should be able to add a new text template test")
	public void verifyUserCanAddNewTextTemplate() throws InterruptedException {
		setupPage.verifyUserCanAddNewTextTemplate();

	}

	@And("I create a profile with View and Add access to Setup Module → Text Template test")
	public void createProfileWithSetupTextTemplateViewAndAddAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.restrictedProfileSetupTextTemplateViewAddAccess();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to add, edit, or delete any text template test")
	public void verifyUserCannotModifyTextTemplates() throws InterruptedException {
		setupPage.verifyUserCannotAddEditOrDeleteTextTemplate();

	}

	@And("the user should be able to view text templates test")
	public void verifyUserCanViewTextTemplates() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String smsTemplatesPageUrl = Hooks.prop.getProperty("smsTemplatesPageUrl");

		Assert.assertNotNull("smsTemplatesPageUrl is missing in config", smsTemplatesPageUrl);

		String fullSmsTemplatesUrl = baseUrl + smsTemplatesPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openSmsTemplatesPage(fullSmsTemplatesUrl);

		Assert.assertTrue("SMS Templates page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/SMSTemplates"));
	}

	@And("I create a profile with View access only to Setup Module → Text Template test")
	public void createProfileWithSetupTextTemplateViewAccessOnly() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.profileWithSetupTextTemplateViewPermissions();
		setupPage.clickSubmitButton();

	}

	// User
	@And("the user should be able to delete a user test")
	public void verifyUserCanDeleteUser() throws InterruptedException {
		setupPage.verifyUserCanDeleteUser();

	}

	@And("I create a profile with full access to Setup Module → User test")
	public void createProfileWithFullSetupUserAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.profileWithSetupUserFullPermissions();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to delete users test")
	public void verifyUserCannotDeleteUsers() throws InterruptedException {
		setupPage.verifyUserCannotDeleteUsers();

	}

	@And("the user should be able to edit an existing user test")
	public void verifyUserCanEditExistingUser() throws InterruptedException {
		setupPage.verifyUserCanEditUser();

	}

	@And("I create a profile with View, Add, and Edit access to Setup Module → User test")
	public void createProfileWithSetupUserViewAddEditAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.profileWithSetupUserViewAddEditPermissions();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to edit or delete users test")
	public void verifyUserCannotEditOrDeleteUsers() throws InterruptedException {
		setupPage.verifyUserCannotEditOrDeleteUsers();

	}

	@And("the user should be able to add a new user test")
	public void assertUserHasAddUserAccess() throws InterruptedException {
		setupPage.verifyUserCanAddNewUser();

	}

	@And("I create a profile with View and Add access to Setup Module → User test")
	public void createProfileWithSetupUserViewAndAddAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.setupUserProfileWithViewAndAddPermissions();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to add, edit, or delete users test")
	public void verifyUserCannotModifyUsers() throws InterruptedException {
		setupPage.verifyUserCannotAddEditOrDeleteUsers();

	}

	@And("the user should be able to view users test")
	public void verifyUserCanViewUsers() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String workspaceUsersPageUrl = Hooks.prop.getProperty("workspaceUsersPageUrl");

		Assert.assertNotNull("workspaceUsersPageUrl is missing in config", workspaceUsersPageUrl);

		String fullWorkspaceUsersUrl = baseUrl + workspaceUsersPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openWorkspaceUsersPage(fullWorkspaceUsersUrl);

		Assert.assertTrue("Workspace Users page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/WorkspaceUsers"));
	}

	@And("I create a profile with View access only to Setup Module → User test")
	public void setupProfileWithViewAccessPermissions() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.restrictedProfileSetupModuleViewAccess();
		setupPage.clickSubmitButton();

	}

	// Profile
	@And("the user should be able to view, add, edit, and delete profiles test")
	public void verifyUserCanManageProfiles() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String setupProfilesUrl = Hooks.prop.getProperty("profilesPageUrl");
		Assert.assertNotNull("profilesPageUrl is missing in config", setupProfilesUrl);
		String fullProfilesUrl = baseUrl + setupProfilesUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openSetupProfilesPage(fullProfilesUrl);
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Profiles"));

		setupPage.verifyFullProfileAccess();

	}

	@And("I create a profile with full access to Setup Module → Profile test")
	public void createProfileWithFullSetupModuleAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.setupProfileWithFullAccessPermissions();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to add, edit, or delete any profiles test")
	public void verifyUserCannotModifyProfiles() throws InterruptedException {
		setupPage.verifyNoAddEditDeletePermissionForProfiles();

	}

	@And("the user should be able to view profiles test")
	public void verifyUserCanViewProfiles() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String setupProfilesUrl = Hooks.prop.getProperty("profilesPageUrl");
		Assert.assertNotNull("profilesPageUrl is missing in config", setupProfilesUrl);
		String fullProfilesUrl = baseUrl + setupProfilesUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openSetupProfilesPage(fullProfilesUrl);
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Profiles"));

	}

	@And("I create a profile with access only to the Setup Module → Profile with 'View' permission test")
	public void createProfileWithSetupModuleViewAccessOnly() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.setupProfileWithViewPermissionOnly();
		setupPage.clickSubmitButton();

	}

	// Dashboard
	@And("the user should have no Workflow access via UI or direct URL test")
	public void verifyNoWorkflowAccessViaUIOrURL() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String workflowDashboardUrl = Hooks.prop.getProperty("workflowDashboardUrl");

		Assert.assertNotNull("workflowDashboardUrl is missing in config", workflowDashboardUrl);

		String fullWorkflowDashboardUrl = baseUrl + workflowDashboardUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openWorkflowDashboardPage(fullWorkflowDashboardUrl);

		setupPage.verifyNoWorkflowAccess();
	}

	@And("I create a profile without Workflow Module access test")
	public void createProfileWithoutWorkflowModuleAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.setupProfileNoWorkflowModuleAccess();
		setupPage.clickSubmitButton();

	}

	@And("the user should have no Drug access via UI or direct URL test")
	public void verifyNoDrugAccessViaUIOrURL() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String drugDashboardUrl = Hooks.prop.getProperty("drugDashboardUrl");

		Assert.assertNotNull("drugDashboardUrl is missing in config", drugDashboardUrl);

		String fullDrugDashboardUrl = baseUrl + drugDashboardUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openDrugDashboardPage(fullDrugDashboardUrl);
		setupPage.verifyNoDrugAccess();

	}

	@And("I create a profile without Drug Module access test")
	public void createProfileWithoutDrugModuleAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.setupProfileNoDrugModuleAccess();
		setupPage.clickSubmitButton();

	}

	@And("the user should have no Delivery access via UI or direct URL test")
	public void verifyNoDeliveryAccessViaUIOrURL() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deliveryDashboardUrl = Hooks.prop.getProperty("deliveryDashboardUrl");

		Assert.assertNotNull("deliveryDashboardUrl is missing in config", deliveryDashboardUrl);

		String fullDeliveryDashboardUrl = baseUrl + deliveryDashboardUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openDeliveryDashboardPage(fullDeliveryDashboardUrl);

		setupPage.verifyNoDeliveryAccess();

	}

	@And("I create a profile without Delivery Module access test")
	public void createProfileWithoutDeliveryModuleAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.setupProfileNoDeliveryModuleAccess();
		setupPage.clickSubmitButton();

	}

	@And("the user should have no patient access via UI or direct URL test")
	public void verifyNoPatientAccessViaUIOrURL() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientDashboardUrl = Hooks.prop.getProperty("patientDashboardUrl");

		Assert.assertNotNull("patientDashboardUrl is missing in config", patientDashboardUrl);

		String fullPatientDashboardUrl = baseUrl + patientDashboardUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openPatientDashboardPage(fullPatientDashboardUrl);
		setupPage.verifyNoPatientAccess();

	}

	@And("I create a profile without Patient Module access test")
	public void createProfileWithoutPatientModuleAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.setupProfileNoPatientModuleAccess();
		setupPage.clickSubmitButton();

	}

	@And("the user should have no Setup access via UI or direct URL test")
	public void verifyNoSetupAccessViaUIOrURL() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String setupDashboardUrl = Hooks.prop.getProperty("dashboardPageUrl");

		Assert.assertNotNull("dashboardPageUrl is missing in config", setupDashboardUrl);

		String fullDashboardUrl = baseUrl + setupDashboardUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openSetupDashboardPage(fullDashboardUrl);

		setupPage.verifyNoSetupAccess();
	}

	@And("I create a profile without Setup Module access test")
	public void createProfileWithoutSetupModuleAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.setupProfileNoSetupModuleAccess();
		setupPage.clickSubmitButton();

	}

	@And("I should see only log access for the new user test")
	public void verifyNewUserHasLogOnlyAccess() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String setupDashboardUrl = Hooks.prop.getProperty("dashboardPageUrl");

		Assert.assertNotNull("dashboardPageUrl is missing in config", setupDashboardUrl);

		String fullDashboardUrl = baseUrl + setupDashboardUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openSetupDashboardPage(fullDashboardUrl);

		Assert.assertTrue("Dashboard page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Dashboard"));
	}

	@And("I create a profile with log-only access test")
	public void createProfileWithLogOnlyAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.setupLogOnlyAccessProfile();
		setupPage.clickSubmitButton();

	}

	// Audit View

	@And("the user should not be able to view General Audit View settings test")
	public void userCannotViewGeneralAuditSettings() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String setupProfilesUrl = Hooks.prop.getProperty("profilesPageUrl");
		Assert.assertNotNull("profilesPageUrl is missing in config", setupProfilesUrl);
		String fullProfilesUrl = baseUrl + setupProfilesUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openSetupProfilesPage(fullProfilesUrl);
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Profiles"));

		setupPage.userShouldNotBeAbleToViewGeneralAuditViewSettings();

	}

	@And("the user should be able to view General Audit View settings in Setup Module test")
	public void userShouldBeAbleToViewGeneralAuditViewSettingsInSetupModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String setupProfilesUrl = Hooks.prop.getProperty("profilesPageUrl");
		Assert.assertNotNull("profilesPageUrl is missing in config", setupProfilesUrl);
		String fullProfilesUrl = baseUrl + setupProfilesUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openSetupProfilesPage(fullProfilesUrl);
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Profiles"));

	}

	@And("I create a profile with View access only to Setup Module General Audit View test")
	public void createProfileWithViewAccessOnlyToSetupModuleGeneralAuditView() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.ToSetupModuleGeneral();
		setupPage.clickSubmitButton();

	}

	@And("I create a profile with No access to Setup Module General Audit View test")
	public void createProfileWithoutSetupModuleGeneralAuditView() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.restrictedProfileSetupModuleAuditView();
		setupPage.clickSubmitButton();

	}

	// Profile
	@And("the Setup user should be able to view Profiles test")
	public void partnerUserShouldBeAbleToViewProfiles() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String setupProfilesUrl = Hooks.prop.getProperty("profilesPageUrl");
		Assert.assertNotNull("profilesPageUrl is missing in config", setupProfilesUrl);
		String fullProfilesUrl = baseUrl + setupProfilesUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openSetupProfilesPage(fullProfilesUrl);
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Profiles"));

	}

}
