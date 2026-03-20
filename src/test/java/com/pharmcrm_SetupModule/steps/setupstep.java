package com.pharmcrm_SetupModule.steps;

import org.junit.Assert;
import com.pharmcrm_SetupModule.pages.setuppage;
import hooks.Hooks;
import io.cucumber.java.en.And;

public class setupstep {

	private setuppage setupPage;

	// Spam Email
	
	@And("the user should be able to delete a Spam Email entry test")
	public void userWithDeletePermissionCanRemoveSpamEmailEntry() throws InterruptedException {
		setupPage.userShouldBeAbleToDeleteSpamEmailEntry();

	}

	@And("I create a profile with View and Delete access to Setup Module Spam Email test")
	public void userWithViewAndDeletePermissionCanRemoveSpamEmailEntries() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowSpamEmailEntriesDeletionWithViewAndDeletePermission();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to delete Spam Email entries test")
	public void userWithoutPermissionCannotDeleteSpamEmailEntries() throws InterruptedException {
		setupPage.userShouldNotBeAbleToDeleteSpamEmailEntries();

	}

	@And("the user should be able to view Spam Email settings test")
	public void userWithViewPermissionCanAccessSpamEmailSettings() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String spamEmailPageUrl = Hooks.prop.getProperty("spamEmailPageUrl");

		Assert.assertNotNull("spamEmailPageUrl is missing in config", spamEmailPageUrl);

		String fullSpamEmailUrl = baseUrl + spamEmailPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openSpamEmailPage(fullSpamEmailUrl);

		Assert.assertTrue("Spam Email settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Web/Home/Spams"));
	}

	@And("I create a profile with View access only to Setup Module Spam Email test")
	public void userWithViewOnlyPermissionCanAccessSpamEmailSettings() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowSpamEmailSettingsViewWithPermissionOnly();
		setupPage.clickSubmitButton();

	}

	// Connector App
	@And("the user should have no Connector App access via UI or direct URL test")
	public void userWithoutConnectorAppAccessCannotOpenViaUIOrDirectURL() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String connectorAppsPageUrl = Hooks.prop.getProperty("connectorAppsPageUrl");

		Assert.assertNotNull("connectorAppsPageUrl is missing in config", connectorAppsPageUrl);

		String fullConnectorAppsUrl = baseUrl + connectorAppsPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openConnectorAppsPage(fullConnectorAppsUrl);

		setupPage.verifyNoConnectorAppAccessUIOrURL();

	}

	@And("I create a profile without Connector App access test")
	public void userWithoutConnectorAppAccessCannotUseConnectorFeatures() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.denyConnectorAppAccessWithoutPermission();
		setupPage.clickSubmitButton();

	}

	// Auto Call
	@And("the user should be able to delete an Auto Call entry test")
	public void userWithDeletePermissionCanRemoveAutoCallEntry() throws InterruptedException {
		setupPage.verifyUserCanDeleteAutoCallEntry();

	}

	@And("I create a profile with full access to Setup Module Auto Call test")
	public void userWithFullAccessCanViewAddEditAndDeleteAutoCallEntries() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowFullAccessToAutoCallEntriesWithPermission();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to delete Auto Call entries test")
	public void userWithoutPermissionCannotDeleteAutoCallEntries() throws InterruptedException {
		setupPage.verifyUserCannotDeleteAutoCallEntries();

	}

	@And("the user should be able to edit an existing Auto Call entry test")
	public void userWithEditPermissionCanModifyExistingAutoCallEntry() throws InterruptedException {
		setupPage.verifyUserCanEditAutoCallEntry();

	}

	@And("I create a profile with View, Add, and Edit access to Setup Module Auto Call test")
	public void userWithViewAddAndEditPermissionCanModifyAutoCallEntries() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowAutoCallEntriesViewAddAndEditWithPermission();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to edit or delete Auto Call entries test")
	public void userWithoutPermissionCannotEditOrDeleteAutoCallEntries() throws InterruptedException {
		setupPage.verifyUserCannotEditOrDeleteAutoCallEntries();

	}

	@And("the user should be able to add a new Auto Call entry test")
	public void userWithAddPermissionCanCreateNewAutoCallEntry() throws InterruptedException {
		setupPage.verifyUserCanAddNewAutoCallEntry();

	}

	@And("I create a profile with View and Add access to Setup Module Auto Call test")
	public void userWithViewAndAddPermissionCanCreateAutoCallEntry() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowAutoCallEntryAdditionWithViewAndAddPermission();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to add, edit, or delete Auto Call entries test")
	public void userWithoutPermissionCannotAddEditOrDeleteAutoCallEntries() throws InterruptedException {
		setupPage.verifyUserCannotAddEditOrDeleteAutoCallEntries();

	}

	@And("the user should be able to view Auto Call settings test")
	public void userWithViewPermissionCanAccessAutoCallSettings() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String autoCallPageUrl = Hooks.prop.getProperty("autoCallPageUrl");

		Assert.assertNotNull("autoCallPageUrl is missing in config", autoCallPageUrl);

		String fullAutoCallUrl = baseUrl + autoCallPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openAutoCallPage(fullAutoCallUrl);

		Assert.assertTrue("Auto Call settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("#autocall"));
	}

	@And("I create a profile with View access only to Setup Module Auto Call test")
	public void userWithViewOnlyPermissionCanAccessAutoCallSettings() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowAutoCallSettingsViewWithPermissionOnly();
		setupPage.clickSubmitButton();

	}

	// Auto Text
	@And("the user should be able to delete an Auto Text entry test")
	public void userWithDeletePermissionCanRemoveAutoTextEntry() throws InterruptedException {
		setupPage.verifyUserCanDeleteAutoTextEntry();

	}

	@And("I create a profile with full access to Setup Module Auto Text test")
	public void userWithFullAccessCanViewAddEditAndDeleteAutoTextEntries() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowFullAccessToAutoTextEntriesWithPermission();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to delete Auto Text entries test")
	public void userWithoutPermissionCannotDeleteAutoTextEntries() throws InterruptedException {
		setupPage.verifyUserCannotDeleteAutoTextEntries();

	}

	@And("the user should be able to edit an existing Auto Text entry test")
	public void userWithEditPermissionCanModifyExistingAutoTextEntry() throws InterruptedException {
		setupPage.verifyUserCanEditAutoTextEntry();

	}

	@And("I create a profile with View, Add, and Edit access to Setup Module Auto Text test")
	public void userWithViewAddAndEditPermissionCanModifyAutoTextEntries() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowAutoTextEntriesViewAddAndEditWithPermission();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to edit or delete Auto Text entries test")
	public void userWithoutPermissionCannotEditOrDeleteAutoTextEntries() throws InterruptedException {
		setupPage.verifyUserCannotEditOrDeleteAutoTextEntries();

	}

	@And("the user should be able to add a new Auto Text entry test")
	public void userWithAddPermissionCanCreateNewAutoTextEntry() throws InterruptedException {
		setupPage.verifyUserCanAddNewAutoTextEntry();

	}

	@And("I create a profile with View and Add access to Setup Module Auto Text test")
	public void userWithViewAndAddPermissionCanCreateAutoTextEntry() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowAutoTextEntryAdditionWithViewAndAddPermission();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to add, edit, or delete Auto Text entries test")
	public void userWithoutPermissionCannotAddEditOrDeleteAutoTextEntries() throws InterruptedException {
		setupPage.verifyUserCannotAddEditOrDeleteAutoTextEntries();

	}

	@And("the user should be able to view Auto Text settings test")
	public void userWithViewPermissionCanAccessAutoTextSettings() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String autoTextPageUrl = Hooks.prop.getProperty("autoTextPageUrl");

		Assert.assertNotNull("autoTextPageUrl is missing in config", autoTextPageUrl);

		String fullAutoTextUrl = baseUrl + autoTextPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openAutoTextPage(fullAutoTextUrl);

		Assert.assertTrue("Auto Text settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("#autotext"));
	}

	@And("I create a profile with View access only to Setup Module Auto Text test")
	public void userWithViewOnlyPermissionCanAccessAutoTextSettings() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowAutoTextSettingsViewWithPermissionOnly();
		setupPage.clickSubmitButton();

	}

	// Email Notification
	@And("the user should be able to delete an Email Notification entry test")
	public void userWithDeletePermissionCanRemoveEmailNotificationEntry() throws InterruptedException {
		setupPage.verifyEmailNotificationEntryCanBeDeletedByUser();

	}

	@And("I create a profile with full access to Setup Module Email Notification test")
	public void userWithFullAccessCanViewAddEditAndDeleteEmailNotificationSettings() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowFullAccessToEmailNotificationSettingsWithPermission();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to delete Email Notification settings test")
	public void userWithoutPermissionCannotDeleteEmailNotificationSettings() throws InterruptedException {
		setupPage.verifyUserCannotDeleteEmailNotificationSettings();

	}

	@And("the user should be able to edit an existing Email Notification entry test")
	public void userWithEditPermissionCanModifyExistingEmailNotificationEntry() throws InterruptedException {
		setupPage.verifyUserCanEditEmailNotificationEntry();

	}

	@And("I create a profile with View, Add, and Edit access to Setup Module Email Notification test")
	public void userWithViewAddAndEditPermissionCanModifyEmailNotificationSettings() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowEmailNotificationSettingsViewAddAndEditWithPermission();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to edit or delete Email Notification settings test")
	public void userWithoutPermissionCannotEditOrDeleteEmailNotificationSettings() throws InterruptedException {
		setupPage.verifyUserCannotEditOrDeleteEmailNotificationSettings();

	}

	@And("the user should be able to add a new Email Notification entry test")
	public void userWithAddPermissionCanCreateNewEmailNotificationEntry() throws InterruptedException {
		setupPage.verifyUserCanAddEmailNotificationEntry();

	}

	@And("I create a profile with View and Add access to Setup Module Email Notification test")
	public void userWithViewAndAddPermissionCanCreateEmailNotificationSettings() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowEmailNotificationSettingsViewAndAddWithPermission();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to add, edit, or delete Email Notification settings test")
	public void userWithoutPermissionCannotAddEditOrDeleteEmailNotificationSettings() throws InterruptedException {
		setupPage.verifyUserCannotAddEditOrDeleteEmailNotificationSettings();

	}

	@And("the user should be able to view Email Notification settings test")
	public void userWithViewPermissionCanAccessEmailNotificationSettings() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String emailNotificationPageUrl = Hooks.prop.getProperty("emailNotificationPageUrl");

		Assert.assertNotNull("emailNotificationPageUrl is missing in config", emailNotificationPageUrl);

		String fullEmailNotificationUrl = baseUrl + emailNotificationPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openEmailNotificationPage(fullEmailNotificationUrl);

		Assert.assertTrue("Email Notification settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("#emailnotification"));
	}

	@And("I create a profile with View access only to Setup Module Email Notification test")
	public void userWithViewOnlyPermissionCanAccessEmailNotificationSettings() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowEmailNotificationSettingsViewWithPermissionOnly();
		setupPage.clickSubmitButton();

	}

	// Show On Dashboard
	@And("the user should be able to delete a Show On Dashboard entry test")
	public void userWithDeletePermissionCanRemoveShowOnDashboardEntry() throws InterruptedException {
		setupPage.verifyUserCanDeleteShowOnDashboardEntry();

	}

	@And("I create a profile with full access to Setup Module Show On Dashboard test")
	public void userWithFullAccessCanViewAddEditAndDeleteShowOnDashboardSettings() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowFullAccessToShowOnDashboardSettingsWithPermission();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to delete Show On Dashboard settings test")
	public void userWithoutPermissionCannotDeleteShowOnDashboardSettings() throws InterruptedException {
		setupPage.verifyUserCannotDeleteShowOnDashboardSettings();

	}

	@And("the user should be able to edit an existing Show On Dashboard entry test")
	public void userWithEditPermissionCanModifyExistingShowOnDashboardEntry() throws InterruptedException {
		setupPage.verifyUserCanEditShowOnDashboardEntry();

	}

	@And("I create a profile with View, Add, and Edit access to Setup Module Show On Dashboard test")
	public void userWithViewAddAndEditPermissionCanModifyShowOnDashboardSettings() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowShowOnDashboardSettingsViewAddAndEditWithPermission();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to edit or delete Show On Dashboard settings test")
	public void userWithoutPermissionCannotEditOrDeleteShowOnDashboardSettings() throws InterruptedException {
		setupPage.verifyUserCannotEditOrDeleteShowOnDashboard();

	}

	@And("the user should be able to add a new Show On Dashboard entry test")
	public void userWithAddPermissionCanCreateNewShowOnDashboardEntry() throws InterruptedException {
		setupPage.verifyUserCanAddShowOnDashboardEntry();

	}

	@And("I create a profile with View and Add access to Setup Module Show On Dashboard test")
	public void userWithViewAndAddPermissionCanCreateShowOnDashboardSettings() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowShowOnDashboardSettingsViewAndAddWithPermission();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to add, edit, or delete Show On Dashboard settings test")
	public void userWithoutPermissionCannotAddEditOrDeleteShowOnDashboardSettings() throws InterruptedException {
		setupPage.verifyUserCannotAddEditDeleteShowOnDashboardSettings();

	}

	@And("the user should be able to view Show On Dashboard settings test")
	public void userWithViewPermissionCanAccessShowOnDashboardSettings() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reminderPageUrl = Hooks.prop.getProperty("reminderPageUrl");

		Assert.assertNotNull("reminderPageUrl is missing in config", reminderPageUrl);

		String fullReminderUrl = baseUrl + reminderPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openReminderPage(fullReminderUrl);

		Assert.assertTrue("Show On Dashboard settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Reminder"));
	}

	@And("I create a profile with View access only to Setup Module Show On Dashboard test")
	public void userWithViewOnlyPermissionCanAccessShowOnDashboard() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowShowOnDashboardViewWithPermissionOnly();
		setupPage.clickSubmitButton();

	}

	// MailSetting
	@And("the user should have no Mail Setting access via UI or direct URL test")
	public void userWithoutAccessCannotOpenMailSettingViaUiOrUrl() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String mailSettingPageUrl = Hooks.prop.getProperty("mailSettingPageUrl");

		Assert.assertNotNull("mailSettingPageUrl is missing in config", mailSettingPageUrl);

		String fullMailSettingUrl = baseUrl + mailSettingPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openMailSettingPage(fullMailSettingUrl);

		setupPage.verifyUserHasNoAccessToMailSetting();

	}

	@And("I create a profile without Mail Setting access test")
	public void userWithoutMailSettingAccessCannotViewOrModifySettings() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.userCannotAccessMailSettingWithoutPermission();
		setupPage.clickSubmitButton();

	}

	// CentralPASettings

	@And("the user should have no Central PA Setting access via UI or direct URL test")
	public void userWithoutAccessCannotOpenCentralPaSettingViaUiOrUrl() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String centralPASettingsPageUrl = Hooks.prop.getProperty("centralPASettingsPageUrl");

		Assert.assertNotNull("centralPASettingsPageUrl is missing in config", centralPASettingsPageUrl);

		String fullCentralPASettingsUrl = baseUrl + centralPASettingsPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openCentralPASettingsPage(fullCentralPASettingsUrl);

		setupPage.verifyUserHasNoAccessToCentralPASetting();

	}

	@And("I create a profile without Central PA Setting access test")
	public void userWithoutCentralPaSettingAccessCannotViewOrModifySettings() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.userCannotAccessCentralPaSettingWithoutPermission();
		setupPage.clickSubmitButton();

	}

	@And("the user should be able to add a new Central PA entry test")
	public void userWithAddPermissionCanCreateNewCentralPaEntry() throws InterruptedException {
		setupPage.verifyUserCanAddCentralPAEntry();

	}

	@And("I create a profile with View and Add access to Setup Module → Central PA Setting test")
	public void userWithViewAndAddPermissionCanCreateCentralPaSetting() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowCentralPaSettingViewAndAddWithPermission();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to add Central PA Setting test")
	public void userWithoutPermissionCannotAddCentralPaSetting() throws InterruptedException {
		setupPage.verifyUserCannotAddCentralPASetting();

	}

	@And("the user should be able to view Central PA Setting test")
	public void userWithViewPermissionCanAccessCentralPaSetting() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String centralPASettingsPageUrl = Hooks.prop.getProperty("centralPASettingsPageUrl");

		Assert.assertNotNull("centralPASettingsPageUrl is missing in config", centralPASettingsPageUrl);

		String fullCentralPASettingsUrl = baseUrl + centralPASettingsPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openCentralPASettingsPage(fullCentralPASettingsUrl);

		Assert.assertTrue("Central PA Settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Web/Home/CentralPASettings"));

	}

	@And("I create a profile with View access only to Setup Module → Central PA Setting test")
	public void userWithViewOnlyPermissionCanAccessCentralPaSetting() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowCentralPaSettingViewWithPermissionOnly();
		setupPage.clickSubmitButton();

	}

	// WorkspaceUsers
	@And("the user should be able to link and delink employee to a workspace user test")
	public void userWithLinkAndDelinkPermissionCanManageEmployeeAssignmentsToWorkspaceUser()
			throws InterruptedException {
		setupPage.verifyUserCanLinkEmployeeToWorkspaceUser();

	}

	@And("I create a profile with View Detail, Reset Password, Change Profile, Link Employee To User, and DeLink Employee To User access to Setup Module Workspace User test")
	public void userWithAllWorkspaceUserPermissionsCanViewResetChangeAndLinkEmployee() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowWorkspaceUserFullAccessWithAllPermissions();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to link or delink employee to user test")
	public void userWithoutPermissionCannotLinkOrDelinkEmployeeToWorkspaceUser() throws InterruptedException {
		setupPage.verifyUserCannotLinkOrDelinkEmployeeToUser();

	}

	@And("the user should be able to change profile for a workspace user test")
	public void userWithChangeProfilePermissionCanUpdateWorkspaceUserProfile() throws InterruptedException {
		setupPage.verifyUserCanChangeProfileForWorkspaceUser();

	}

	@And("I create a profile with View Detail, Reset Password, and Change Profile access to Setup Module → Workspace User test")
	public void userWithViewDetailResetPasswordAndChangeProfilePermissionCanAccessWorkspaceUser() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowWorkspaceUserViewResetPasswordAndProfileChange();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to change profile, link or delink employee to user test")
	public void userWithoutPermissionCannotChangeProfileOrLinkEmployee() throws InterruptedException {
		setupPage.verifyUserCannotChangeProfileOrLinkOrDelinkEmployee();

	}

	@And("the user should be able to reset password for a workspace user test")
	public void userWithResetPasswordPermissionCanResetWorkspaceUserPassword() throws InterruptedException {
		setupPage.verifyUserCanResetPasswordForWorkspaceUser();

	}

	@And("I create a profile with View Detail and Reset Password access to Setup Module → Workspace User test")
	public void userWithViewDetailAndResetPasswordPermissionCanAccessWorkspaceUser() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowWorkspaceUserViewAndPasswordResetOnly();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to reset password, change profile, link or delink employee to user test")
	public void userCannotResetPasswordChangeProfileOrLinkEmployee() throws InterruptedException {
		setupPage.verifyUserCannotResetPasswordChangeProfileOrLinkEmployee();

	}

	@And("the user should be able to view workspace user details test")
	public void userWithViewDetailPermissionCanAccessWorkspaceUserDetails() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String workspaceUsersPageUrl = Hooks.prop.getProperty("workspaceUsersPageUrl");

		Assert.assertNotNull("workspaceUsersPageUrl is missing in config", workspaceUsersPageUrl);

		String fullWorkspaceUsersUrl = baseUrl + workspaceUsersPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openWorkspaceUsersPage(fullWorkspaceUsersUrl);

		Assert.assertTrue("Workspace Users page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/WorkspaceUsers"));

		setupPage.verifyUserCanViewWorkspaceUserDetails();

	}

	@And("I create a profile with View Detail access only to Setup Module → Workspace User test")
	public void userWithViewDetailOnlyPermissionCanAccessWorkspaceUser() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.userWithOnlyViewDetailPermissionRestrictedToWorkspaceUser();
		setupPage.clickSubmitButton();

	}

	// Mails
	@And("the user should have no Mail View access via UI or direct URL test")
	public void denyMailPageAccessWithoutViewPermissionUiOrUrl() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String mailsPageUrl = Hooks.prop.getProperty("mailsPageUrl");

		Assert.assertNotNull("mailsPageUrl is missing in config", mailsPageUrl);

		String fullUrl = baseUrl + mailsPageUrl;

		setupPage = new setuppage(Hooks.driver);

		setupPage.openMailsPage(fullUrl);

		Assert.assertTrue("Mail Settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Mails"));
	}

	@And("I create a profile without Mail View permission to Mail Page test")
	public void userWithoutMailViewPermissionCannotAccessViaUiOrUrl() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.denyMailPageAccessWithoutViewPermissionUiOrUrl();
		setupPage.clickSubmitButton();

	}

	// Faxes
	@And("the user should have no Fax View access via UI or direct URL test")
	public void userWithoutFaxViewPermissionCannotAccessViaUiOrUrl() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String faxesPageUrl = Hooks.prop.getProperty("faxesPageUrl");

		Assert.assertNotNull("faxesPageUrl is missing in config", faxesPageUrl);

		String fullUrl = baseUrl + faxesPageUrl;

		setupPage = new setuppage(Hooks.driver);

		setupPage.openFaxesPage(fullUrl);

		setupPage.verifyUserHasNoAccessToFaxPageViaUIOrURL();

	}

	@And("I create a profile without Fax View permission to Fax Page test")
	public void userWithoutFaxViewPermissionCannotAccessFaxPage() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.denyFaxPageAccessWithoutViewPermission();
		setupPage.clickSubmitButton();

	}

	// BOTCalls
	@And("the user should have no BOT Call View access via UI or direct URL test")
	public void userWithoutBotCallViewPermissionCannotAccessViaUiOrUrl() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String botCallsPageUrl = Hooks.prop.getProperty("botCallsPageUrl");

		Assert.assertNotNull("botCallsPageUrl is missing in config", botCallsPageUrl);

		String fullUrl = baseUrl + botCallsPageUrl;

		setupPage = new setuppage(Hooks.driver);

		setupPage.openBotCallsPage(fullUrl);

		setupPage.verifyUserHasNoAccessToBotCallPageViaUIOrURL();

	}

	@And("I create a profile without BOT Call View permission to BOT Call Page test")
	public void testProfileWithoutBotCallViewPermission() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.userWithoutBotCallViewPermissionCannotAccessBotCallPage();
		setupPage.clickSubmitButton();

	}

	// CallActivities
	@And("the user should have no Call Activity access via UI or direct URL test")
	public void userShouldNotBeAbleToAccessCallActivityPageViaUiOrDirectUrl() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String callActivityPageUrl = Hooks.prop.getProperty("callActivityPageUrl");

		Assert.assertNotNull("callActivityPageUrl is missing in config", callActivityPageUrl);

		String fullUrl = baseUrl + callActivityPageUrl;

		setupPage = new setuppage(Hooks.driver);

		setupPage.openCallActivityPage(fullUrl);

		setupPage.verifyUserHasNoAccessToCallActivityPageViaUIOrURL();

	}

	@And("I create a profile without Call Activity View permission to Call Activity Page test")
	public void userCreatesProfileWithoutCallActivityViewPermissionToCallActivityPage() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.profileHasNoCallActivityViewAccess();
		setupPage.clickSubmitButton();

	}

	// Texts
	@And("the user should have no Text page access via UI or direct URL test")
	public void userShouldNotBeAbleToAccessTextPageViaUiOrDirectUrl() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String textPageUrl = Hooks.prop.getProperty("textPageUrl");

		Assert.assertNotNull("textPageUrl is missing in config", textPageUrl);

		String fullUrl = baseUrl + textPageUrl;

		setupPage = new setuppage(Hooks.driver);

		setupPage.openTextPage(fullUrl);

		Assert.assertTrue("Text page is not displayed", Hooks.driver.getCurrentUrl().contains("/Setup/Home/Texts"));
	}

	@And("I create a profile without View access to Text Page test")
	public void userCreatesProfileWithoutViewAccessToTextPage() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.verifyNoViewAccessOnTextPage();
		setupPage.clickSubmitButton();

	}

	// Driver And SalesRep User
	@And("the user should not be able to access the Driver and SalesRep User page via direct URL test")
	public void userShouldNotBeAbleToAccessDriverUsersPageViaDirectUrl() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String driverUsersPageUrl = Hooks.prop.getProperty("driverUsersPageUrl");

		Assert.assertNotNull("driverUsersPageUrl is missing in config", driverUsersPageUrl);

		String fullUrl = baseUrl + driverUsersPageUrl;

		setupPage = new setuppage(Hooks.driver);

		setupPage.openDriverUsersPage(fullUrl);

		setupPage.verifyUserCannotAccessDriverAndSalesRepUserPageViaDirectURL();

	}

	@And("I create a profile without any access to Driver and SalesRep User test")
	public void userCreatesProfileWithoutAnyAccessToDriverAndSalesRepUser() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.userRestrictedFromDriverAndSalesRepUser();
		setupPage.clickSubmitButton();

	}

	// Fax Setting
	@And("the user should be able to delete a Fax Setting test")
	public void userShouldBeAbleToDeleteAFaxSetting() throws InterruptedException {
		setupPage.verifyUserCanDeleteFaxSetting();

	}

	@And("I create a profile with View, Add, Edit, and Delete access to Fax Setting test")
	public void userCreatesProfileWithViewAddEditDeleteAccessToFaxSetting() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.createProfileWithFullAccessToFaxSetting();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to delete any Fax Setting test")
	public void userShouldNotBeAbleToDeleteAnyFaxSetting() throws InterruptedException {
		setupPage.verifyUserCannotDeleteFaxSetting();

	}

	@And("the user should be able to edit an existing Fax Setting test")
	public void userShouldBeAbleToEditAnExistingFaxSetting() throws InterruptedException {
		setupPage.verifyUserCanEditExistingFaxSetting();

	}

	@And("I create a profile with View, Add, and Edit access to Fax Setting test")
	public void userCreatesProfileWithViewAddEditAccessToFaxSetting() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.userCanViewAddEditFaxSettingEntries();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to edit or delete any Fax Setting test")
	public void userShouldNotBeAbleToEditOrDeleteFaxSetting() throws InterruptedException {
		setupPage.verifyUserCannotEditOrDeleteFaxSetting();

	}

	@And("the user should be able to add a new Fax Setting test")
	public void userShouldBeAbleToAddANewFaxSetting() throws InterruptedException {
		setupPage.verifyUserCanAddNewFaxSetting();

	}

	@And("I create a profile with View and Add access to Fax Setting test")
	public void userCreatesProfileWithViewAndAddAccessToFaxSetting() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.verifyViewAndAddAccessOnFaxSetting();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to add, edit, or delete any Fax Setting test")
	public void userShouldNotBeAbleToAddEditOrDeleteFaxSetting() throws InterruptedException {
		setupPage.userShouldNotBeAbleToAddEditOrDeleteFaxSetting();

	}

	@And("the user should be able to view the Fax Setting list test")
	public void userShouldBeAbleToViewTheFaxSettingList() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String faxSettingsPageUrl = Hooks.prop.getProperty("faxSettingsPageUrl");

		Assert.assertNotNull("faxSettingsPageUrl is missing in config", faxSettingsPageUrl);

		String fullUrl = baseUrl + faxSettingsPageUrl;

		setupPage = new setuppage(Hooks.driver);

		setupPage.openFaxSettingsPage(fullUrl);

		Assert.assertTrue("Fax Settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/FaxSettings"));
	}

	@And("I create a profile with View access only to Fax Setting test")
	public void userCreatesProfileWithViewAccessOnlyToFaxSetting() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.verifyViewOnlyAccessOnFaxSetting();
		setupPage.clickSubmitButton();

	}

	// Professional License Type
	@And("the user should be able to delete a Professional License Type test")
	public void userShouldBeAbleToDeleteAProfessionalLicenseType() throws InterruptedException {
		setupPage.userShouldBeAbleToDeleteProfessionalLicenseType();

	}

	@And("I create a profile with View, Add, Edit, and Delete access to Professional License Type test")
	public void userCreatesProfileWithViewAddEditDeleteAccessToProfessionalLicenseType() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.userCanManageProfessionalLicenseTypeEntries();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to delete any Professional License Type test")
	public void userShouldNotBeAbleToDeleteAnyProfessionalLicenseType() throws InterruptedException {
		setupPage.userShouldNotBeAbleToDeleteProfessionalLicenseType();

	}

	@And("the user should be able to edit an existing Professional License Type test")
	public void userShouldBeAbleToEditAnExistingProfessionalLicenseType() throws InterruptedException {
		setupPage.userShouldBeAbleToEditExistingProfessionalLicenseType();

	}

	@And("I create a profile with View, Add, and Edit access to Professional License Type test")
	public void userCreatesProfileWithViewAddEditAccessToProfessionalLicenseType() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.userCanViewAddEditProfessionalLicenseTypeEntries();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to edit or delete any Professional License Type test")
	public void userShouldNotBeAbleToEditOrDeleteProfessionalLicenseType() throws InterruptedException {
		setupPage.userShouldNotBeAbleToEditOrDeleteProfessionalLicenseType();

	}

	@And("the user should be able to add a new Professional License Type test")
	public void userShouldBeAbleToAddANewProfessionalLicenseType() throws InterruptedException {
		setupPage.userShouldBeAbleToAddNewProfessionalLicenseType();

	}

	@And("I create a profile with View and Add access to Professional License Type test")
	public void userCreatesProfileWithViewAndAddAccessToProfessionalLicenseType() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.userCanViewAndAddProfessionalLicenseTypeEntries();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to add, edit, or delete any Professional License Type test")
	public void userShouldNotBeAbleToAddEditOrDeleteProfessionalLicenseType() throws InterruptedException {
		setupPage.verifyUserCannotAddEditOrDeleteProfessionalLicenseType();

	}

	@And("the user should be able to view the Professional License Type list test")
	public void userShouldBeAbleToViewProfessionalLicenseTypePage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String professionalLicenseTypePageUrl = Hooks.prop.getProperty("professionalLicenseTypePageUrl");

		Assert.assertNotNull("professionalLicenseTypePageUrl is missing in config", professionalLicenseTypePageUrl);

		String fullUrl = baseUrl + professionalLicenseTypePageUrl;

		setupPage = new setuppage(Hooks.driver);

		setupPage.openProfessionalLicenseTypePage(fullUrl);

		Assert.assertTrue("Professional License Type page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ProfessionalLicenseTypes"));
	}

	@And("I create a profile with View access only to Professional License Type test")
	public void userCreatesProfileWithViewAccessOnlyToProfessionalLicenseType() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.userRestrictedToViewOnlyProfessionalLicenseType();
		setupPage.clickSubmitButton();

	}

	// Designation
	@And("the user should be able to delete a Designation test")
	public void userShouldBeAbleToDeleteADesignation() throws InterruptedException {
		setupPage.verifyUserCanDeleteDesignation();

	}

	@And("the user should be able to edit an existing Designation test")
	public void userShouldBeAbleToEditAnExistingDesignation() throws InterruptedException {
		setupPage.verifyUserCanEditExistingDesignation();

	}

	@And("I create a profile with View, Add, Edit, and Delete access to Designation test")
	public void userCreatesProfileWithViewAddEditDeleteAccessToDesignation() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.createProfileWithFullAccessToDesignation();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to edit or delete any Designation test")
	public void validateNoAddEditDeleteDesignationAccess() throws InterruptedException {
		setupPage.verifyUserCannotEditOrDeleteAnyDesignation();

	}

	@And("the user should be able to add a new Designation test")
	public void userShouldBeAbleToAddANewDesignation() throws InterruptedException {
		setupPage.verifyUserCanAddNewDesignation();

	}

	@And("I create a profile with View and Add access to Designation test")
	public void userCreatesProfileWithViewAndAddAccessToDesignation() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.userCanViewAndAddDesignationEntries();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to add, edit, or delete any Designation test")
	public void userShouldNotBeAbleToAddEditOrDeleteDesignation() throws InterruptedException {
		setupPage.verifyUserCannotAddEditOrDeleteDesignation();

	}

	@And("the user should be able to view the Designation list test")
	public void userShouldBeAbleToViewTheDesignationList() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String designationPageUrl = Hooks.prop.getProperty("designationPageUrl");

		Assert.assertNotNull("designationPageUrl is missing in config", designationPageUrl);

		String fullUrl = baseUrl + designationPageUrl;

		setupPage = new setuppage(Hooks.driver);

		setupPage.openDesignationPage(fullUrl);

		Assert.assertTrue("Designation page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Designations"));
	}

	@And("I create a profile with View access only to Designation test")
	public void userCreatesProfileWithViewAccessOnlyToDesignation() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.userRestrictedToViewOnlyDesignation();
		setupPage.clickSubmitButton();

	}

	// Whitelist IP
	@And("the user should be able to remove an excluded user test")
	public void userShouldBeAbleToRemoveAnExcludedUser() throws InterruptedException {
		setupPage.verifyUserCanRemoveExcludedUser();

	}

	@And("the user should be able to exclude a user from Whitelist IP test")
	public void userShouldBeAbleToExcludeAUserFromWhitelistIp() throws InterruptedException {
		setupPage.verifyUserCanExcludeUserFromWhitelistIP();

	}

	@And("I create a profile with View, Add, Delete, Exclude User, and Remove Excluded User access to Whitelist IP test")
	public void userCreatesProfileWithFullAccessToWhitelistIpAndExcludedUsers() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.userCanManageWhitelistIpAndExcludedUsers();
		setupPage.clickSubmitButton();

	}

	@And("the user should be able to delete a Whitelist IP test")
	public void userShouldBeAbleToDeleteAWhitelistIp() throws InterruptedException {
		setupPage.verifyUserCanDeleteWhitelistIP();

	}

	@And("I create a profile with View, Add, and Delete access to Whitelist IP test")
	public void userCreatesProfileWithViewAddAndDeleteAccessToWhitelistIp() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.userCanViewAddDeleteWhitelistIps();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to delete IPs or manage excluded users test")
	public void userShouldNotBeAbleuserShouldNotBeAbleToDeleteIpsOrManageExcludedUsersToExcludeOrRemoveExcludedUsers()
			throws InterruptedException {
		setupPage.verifyUserCannotDeleteIPsOrManageExcludedUsers();

	}

	@And("the user should be able to add a new Whitelist IP test")
	public void userShouldBeAbleToAddANewWhitelistIp() throws InterruptedException {
		setupPage.verifyUserCanAddNewWhitelistIP();

	}

	@And("I create a profile with View and Add access to Whitelist IP test")
	public void userCreatesProfileWithViewAndAddAccessToWhitelistIp() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.userCanViewAndAddWhitelistIps();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to exclude or remove excluded users test")
	public void userShouldNotBeAbleToExcludeOrRemoveExcludedUsers() throws InterruptedException {
		setupPage.verifyUserCannotExcludeOrRemoveExcludedUsers();

	}

	@And("the user should not be able to add or delete IPs test")
	public void userShouldNotBeAbleToAddOrDeleteIps() throws InterruptedException {
		setupPage.verifyUserCannotAddOrDeleteIPs();

	}

	@And("the user should be able to view the list of Whitelist IP entries test")
	public void userShouldBeAbleToViewWhitelistIPsPage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String whitelistIPsPageUrl = Hooks.prop.getProperty("whitelistIPsPageUrl");

		Assert.assertNotNull("whitelistIPsPageUrl is missing in config", whitelistIPsPageUrl);

		String fullUrl = baseUrl + whitelistIPsPageUrl;

		setupPage = new setuppage(Hooks.driver);

		setupPage.openWhitelistIPsPage(fullUrl);

		Assert.assertTrue("Whitelist IPs page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/WhitelistIPs"));
	}

	@And("I create a profile with View access only to Whitelist IP test")
	public void userCreatesProfileWithViewAccessOnlyToWhitelistIp() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.verifyViewOnlyAccessOnWhitelistIp();
		setupPage.clickSubmitButton();

	}

	// Progress Step
	@And("the user should be able to delete a Progress Step entry test")
	public void userShouldBeAbleToDeleteAProgressStepEntry() throws InterruptedException {
		setupPage.verifyUserCanDeleteProgressStepEntry();

	}

	@And("I create a profile with View, Add, Edit, and Delete access to Progress Step test")
	public void userCreatesProfileWithViewAddEditAndDeleteAccessToProgressStep() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.userCanViewAddEditDeleteProgressSteps();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to delete any Progress Step entries test")
	public void userShouldNotBeAbleToDeleteAnyProgressStepEntries() throws InterruptedException {
		setupPage.verifyUserCannotDeleteProgressStepEntries();

	}

	@And("the user should be able to edit an existing Progress Step entry test")
	public void userShouldBeAbleToEditAnExistingProgressStepEntry() throws InterruptedException {
		setupPage.verifyUserCanEditExistingProgressStepEntry();

	}

	@And("I create a profile with View, Add, and Edit access to Progress Step test")
	public void userCreatesProfileWithViewAddAndEditAccessToProgressStep() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.userCanViewAddAndEditProgressSteps();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to edit or delete any Progress Step entries test")
	public void userShouldNotBeAbleToEditOrDeleteAnyProgressStepEntries() throws InterruptedException {
		setupPage.verifyUserCannotEditOrDeleteProgressStepEntries();

	}

	@And("the user should be able to add a new Progress Step entry test")
	public void userShouldBeAbleToAddANewProgressStepEntry() throws InterruptedException {
		setupPage.verifyUserCanAddNewProgressStepEntry();

	}

	@And("I create a profile with View and Add access to Progress Step test")
	public void userCreatesProfileWithViewAndAddAccessToProgressStep() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.userCanViewAndAddProgressSteps();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to add, edit, or delete any Progress Step entries test")
	public void userShouldNotBeAbleToAddEditOrDeleteAnyProgressStepEntries() throws InterruptedException {
		setupPage.verifyUserCannotAddEditOrDeleteProgressStepEntries();

	}

	@And("the user should be able to view entries in the Progress Step test")
	public void userShouldBeAbleToViewEntriesInTheProgressStep() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String progressStepPageUrl = Hooks.prop.getProperty("progressStepPageUrl");

		Assert.assertNotNull("progressStepPageUrl is missing in config", progressStepPageUrl);

		String fullUrl = baseUrl + progressStepPageUrl;

		setupPage = new setuppage(Hooks.driver);

		setupPage.openProgressStepPage(fullUrl);

		Assert.assertTrue("Progress Step page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ProgressStatuses"));
	}

	@And("I create a profile with View access only to Progress Step test")
	public void userCreatesProfileWithViewAccessOnlyToProgressStep() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.verifyViewOnlyAccessOnProgressStep();
		setupPage.clickSubmitButton();

	}

	// EHR Types

	@And("the user should be able to delete an EHR Type test")
	public void userShouldBeAbleToDeleteAnEhrType() throws InterruptedException {
		setupPage.verifyUserCanDeleteEHRType();

	}

	@And("I create a profile with View, Add, Edit, and Delete access to EHR Types test")
	public void userCreatesProfileWithViewAddEditAndDeleteAccessToEhrTypes() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.verifyFullAccessOnEhrTypes();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to delete any EHR Types test")
	public void userShouldNotBeAbleToDeleteAnyEhrTypes() throws InterruptedException {
		setupPage.verifyUserCannotDeleteEHRTypes();

	}

	@And("the user should be able to edit an existing EHR Type test")
	public void userShouldBeAbleToEditAnExistingEhrType() throws InterruptedException {
		setupPage.verifyUserCanEditEHRType();

	}

	@And("I create a profile with View, Add, and Edit access to EHR Types test")
	public void userCreatesProfileWithViewAddAndEditAccessToEhrTypes() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.profileHasViewAddEditAccessForEhrTypes();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to edit or delete any EHR Types test")
	public void userShouldNotBeAbleToEditOrDeleteAnyEhrTypes() throws InterruptedException {
		setupPage.verifyUserCannotEditOrDeleteEHRTypes();

	}

	@And("the user should be able to add a new EHR Type test")
	public void userShouldBeAbleToAddANewEhrType() throws InterruptedException {
		setupPage.verifyUserCanAddNewEHRType();

	}

	@And("I create a profile with View and Add access to EHR Types test")
	public void userCreatesProfileWithViewAndAddAccessToEhrTypes() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.profileHasViewAndAddAccessForEhrTypes();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to add, edit, or delete any EHR Types test")
	public void userShouldNotBeAbleToAddEditOrDeleteAnyEhrTypes() throws InterruptedException {
		setupPage.verifyUserCannotAddEditDeleteEHRTypes();

	}

	@And("the user should be able to view EHR Types test")
	public void userShouldBeAbleToViewEhrTypes() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String ehrTypesPageUrl = Hooks.prop.getProperty("ehrTypesPageUrl");

		Assert.assertNotNull("ehrTypesPageUrl is missing in config", ehrTypesPageUrl);

		String fullUrl = baseUrl + ehrTypesPageUrl;

		setupPage = new setuppage(Hooks.driver);

		setupPage.openEhrTypesPage(fullUrl);

		Assert.assertTrue("EHR Types page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ExternalSources"));
	}

	@And("I create a profile with View access only to EHR Types test")
	public void userCreatesProfileWithViewAccessOnlyToEhrTypes() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.userRestrictedToViewOnlyInEhrTypes();
		setupPage.clickSubmitButton();

	}

	// Text Forward Setting
	@And("the user should have no Text Forward Setting update access via UI or direct URL test")
	public void userShouldHaveNoTextForwardSettingUpdateAccessViaUiOrDirectUrl() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String textForwardSettingPageUrl = Hooks.prop.getProperty("textForwardSettingPageUrl");

		Assert.assertNotNull("textForwardSettingPageUrl is missing in config", textForwardSettingPageUrl);

		String fullUrl = baseUrl + textForwardSettingPageUrl;

		setupPage = new setuppage(Hooks.driver);

		setupPage.openTextForwardSettingPage(fullUrl);

		Assert.assertTrue("Text Forward Setting page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/TextForwardSetting"));
	}

	@And("I create a profile without Update access to Text Forward Setting test")
	public void userCreatesProfileWithoutUpdateAccessToTextForwardSetting() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.userRestrictedFromUpdatingTextForwardSetting();
		setupPage.clickSubmitButton();

	}

	// Notification Setting
	@And("the user should have no Notification Setting update access via UI or direct URL test")
	public void userShouldHaveNoNotificationSettingUpdateAccessViaUiOrDirectUrl() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String notificationSettingPageUrl = Hooks.prop.getProperty("notificationSettingPageUrl");

		Assert.assertNotNull("notificationSettingPageUrl is missing in config", notificationSettingPageUrl);

		String fullUrl = baseUrl + notificationSettingPageUrl;

		setupPage = new setuppage(Hooks.driver);

		setupPage.openNotificationSettingPage(fullUrl);

		setupPage.verifyUserHasNoUpdateAccessToNotificationSetting();

	}

	@And("I create a profile without Update access to Notification Setting test")
	public void userCreatesProfileWithoutUpdateAccessToNotificationSetting() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.verifyNoUpdateAccessOnNotificationSetting();
		setupPage.clickSubmitButton();

	}

	// Technical Setting
	@And("the user should have no Technical Setting update access via UI or direct URL test")
	public void userShouldHaveNoTechnicalSettingUpdateAccessViaUiOrDirectUrl() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String technicalSettingPageUrl = Hooks.prop.getProperty("technicalSettingPageUrl");

		Assert.assertNotNull("technicalSettingPageUrl is missing in config", technicalSettingPageUrl);

		String fullUrl = baseUrl + technicalSettingPageUrl;

		setupPage = new setuppage(Hooks.driver);

		setupPage.openTechnicalSettingPage(fullUrl);

		setupPage.verifyUserHasNoUpdateAccessToTechnicalSetting();

	}

	@And("I create a profile without Update access to Technical Setting test")
	public void userCreatesProfileWithoutUpdateAccessToTechnicalSetting() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.createProfileWithoutUpdateAccessToTechnicalSetting();
		setupPage.clickSubmitButton();

	}

	// Organization Calendar
	@And("the user should be able to edit an Organization Calendar entry test")
	public void userShouldBeAbleToEditAnOrganizationCalendarEntry() throws InterruptedException {
		setupPage.verifyUserCanEditOrganizationCalendarEntry();

	}

	@And("I create a profile with View and Edit access to Organization Calendar test")
	public void userCreatesProfileWithViewAndEditAccessToOrganizationCalendar() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.createProfileWithViewAndEditAccessToOrganizationCalendar();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to edit any Organization Calendar entry test")
	public void userShouldNotBeAbleToEditAnyOrganizationCalendarEntry() throws InterruptedException {
		setupPage.verifyUserCannotEditOrganizationCalendarEntries();

	}

	@And("the user should be able to view Organization Calendar entries test")
	public void userShouldBeAbleToViewOrganizationCalendarEntries() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String organizationCalendarPageUrl = Hooks.prop.getProperty("organizationCalendarPageUrl");

		Assert.assertNotNull("organizationCalendarPageUrl is missing in config", organizationCalendarPageUrl);

		String fullUrl = baseUrl + organizationCalendarPageUrl;

		setupPage = new setuppage(Hooks.driver);

		setupPage.openOrganizationCalendarPage(fullUrl);

		Assert.assertTrue("Organization Calendar page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/OrganizationCalendarSetting"));
	}

	@And("I create a profile with only View access to Organization Calendar test")
	public void userCreatesProfileWithOnlyViewAccessToOrganizationCalendar() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.createProfileWithViewAccessToOrganizationCalendar();
		setupPage.clickSubmitButton();

	}

	// Brand Management

	@And("the user should not see the Send VCard option in Brand Management test")
	public void userShouldNotSeeSendVcardOptionInBrandManagement() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String brandManagementPageUrl = Hooks.prop.getProperty("brandManagementPageUrl");

		Assert.assertNotNull("brandManagementPageUrl is missing in config", brandManagementPageUrl);

		String fullUrl = baseUrl + brandManagementPageUrl;

		setupPage = new setuppage(Hooks.driver);

		setupPage.openBrandManagementPage(fullUrl);

		setupPage.verifySendVCardOptionIsNotVisibleInBrandManagement();

	}

	@And("I create a profile without Send VCard access to Setup Module → Brand Management test")
	public void userCreatesProfileWithoutSendVcardAccessToBrandManagement() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.createProfileWithoutSendVcardAccessToBrandManagement();
		setupPage.clickSubmitButton();

	}

	@And("the user should have no Brand Management update access via UI or direct URL test")
	public void userShouldHaveNoBrandManagementUpdateAccessViaUiOrDirectUrl() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String brandManagementPageUrl = Hooks.prop.getProperty("brandManagementPageUrl");

		Assert.assertNotNull("brandManagementPageUrl is missing in config", brandManagementPageUrl);

		String fullUrl = baseUrl + brandManagementPageUrl;

		setupPage = new setuppage(Hooks.driver);

		setupPage.openBrandManagementPage(fullUrl);

		setupPage.verifyNoUpdateAccessToBrandManagement();

	}

	@And("I create a profile without Update access to Setup Module → Brand Management test")
	public void userCreatesProfileWithoutUpdateAccessToBrandManagement() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.createProfileWithoutUpdateAccessToBrandManagement();
		setupPage.clickSubmitButton();

	}

	// Reminders
	@And("the user should have no Application Status update access via UI or direct URL test")
	public void userShouldHaveNoApplicationStatusUpdateAccessViaUiOrDirectUrl() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String applicationStatusPageUrl = Hooks.prop.getProperty("applicationStatusPageUrl");

		Assert.assertNotNull("applicationStatusPageUrl is missing in config", applicationStatusPageUrl);

		String fullUrl = baseUrl + applicationStatusPageUrl;

		setupPage = new setuppage(Hooks.driver);

		setupPage.openApplicationStatusPage(fullUrl);

		setupPage.verifyNoUpdateAccessToApplicationStatus();
	}

	@And("I create a profile without Update access to Setup Module → Application Status test")
	public void userCreatesProfileWithoutUpdateAccessToApplicationStatus() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.profileHasNoUpdateAccessForApplicationStatus();
		setupPage.clickSubmitButton();

	}

	@And("the user should see action buttons and perform allowed reminder actions test")
	public void userShouldSeeActionButtonsAndPerformAllowedReminderActions() throws InterruptedException {
		setupPage.UserCanSeeAndPerformReminderActionsWithActionViewAccess();

	}

	@And("I create a profile with View and Action View access to Setup Module → Reminders test")
	public void userCreatesProfileWithViewAndActionViewAccessToReminders() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.createProfileWithViewAndActionAccessToReminders();
		setupPage.clickSubmitButton();

	}

	@And("the user should not see any action buttons for reminders test")
	public void userShouldNotSeeAnyActionButtonsForReminders() throws InterruptedException {
		setupPage.UserCannotSeeReminderActionButtonsWithoutActionViewAccess();

	}

	@And("the user should be able to view reminders test")
	public void userShouldBeAbleToViewRemindersPage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String remindersPageUrl = Hooks.prop.getProperty("remindersPageUrl");

		Assert.assertNotNull("remindersPageUrl is missing in config", remindersPageUrl);

		String fullUrl = baseUrl + remindersPageUrl;

		setupPage = new setuppage(Hooks.driver);

		setupPage.openRemindersPage(fullUrl);

		Assert.assertTrue("Reminders page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Reminders"));
	}

	@And("I create a profile with only View access to Setup Module → Reminders test")
	public void userCreatesProfileWithViewAccessToReminders() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.profileRestrictedToViewAccessInReminders();
		setupPage.clickSubmitButton();

	}

	// Bucket Setting

	@And("the user should have no Bucket Setting access via UI or direct URL test")
	public void verifyUserHasNoBucketSettingAccessViaUiOrUrl() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String bucketSettingsPageUrl = Hooks.prop.getProperty("bucketSettingsPageUrl");

		Assert.assertNotNull("bucketSettingsPageUrl is missing in config", bucketSettingsPageUrl);

		String fullUrl = baseUrl + bucketSettingsPageUrl;

		setupPage = new setuppage(Hooks.driver);

		setupPage.openBucketSettingsPage(fullUrl);

		setupPage.userWithNoAccessCannotViewOrAccessBucketSetting();

	}

	@And("I create a profile without Update access to Setup Module → Bucket Setting test")
	public void createProfileWithoutUpdateAccessToBucketSetting() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.bucketSettingProfileWithoutUpdatePermission();
		setupPage.clickSubmitButton();

	}

	// Organization Bucket
	@And("the user should be able to download a file test")
	public void verifyUserCanDownloadFile() throws InterruptedException {
		setupPage.verifyUserCanDownloadFileInOrganizationBucket();

	}

	@And("I create a profile with full access to Organization Bucket test")
	public void createProfileWithFullAccessToOrganizationBucket() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.profileWithOrganizationBucketFullRights();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to download any file test")
	public void verifyUserCannotDownloadFiles() throws InterruptedException {
		setupPage.verifyUserCannotDownloadFilesInOrganizationBucket();

	}

	@And("the user should be able to delete a file test")
	public void verifyUserCanDeleteFile() throws InterruptedException {
		setupPage.verifyUserCanDeleteFileInOrganizationBucket();

	}

	@And("I create a profile with View, Add, Edit, and Delete File access to Organization Bucket test")
	public void createProfileWithOrganizationBucketFullFileAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.unrestrictedProfileOrganizationBucketFileAccess();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to delete or download any files test")
	public void verifyUserCannotDeleteOrDownloadFiles() throws InterruptedException {
		setupPage.verifyUserCannotDeleteOrDownloadFilesInOrganizationBucket();

	}

	@And("the user should be able to edit an existing file test")
	public void verifyUserCanEditExistingFile() throws InterruptedException {
		setupPage.verifyUserCanEditExistingFileInOrganizationBucket();

	}

	@And("I create a profile with View, Add File, and Edit File access to Organization Bucket test")
	public void createProfileWithOrganizationBucketViewAddEditFileAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.organizationBucketProfileWithViewAddEditFilePermissions();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to edit, delete, or download any files test")
	public void verifyUserCannotEditDeleteOrDownloadFiles() throws InterruptedException {
		setupPage.verifyUserCannotEditDeleteOrDownloadFilesInOrganizationBucket();

	}

	@And("the user should be able to add a new file test")
	public void verifyUserCanAddNewFile() throws InterruptedException {
		setupPage.verifyUserCanAddNewFileInOrganizationBucket();

	}

	@And("I create a profile with View and Add File access to Organization Bucket test")
	public void createProfileWithOrganizationBucketViewAndAddFileAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.organizationBucketProfileWithViewAndAddFilePermissions();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to add, edit, delete, or download any files test")
	public void verifyUserCannotAddEditDeleteOrDownloadFiles() throws InterruptedException {
		setupPage.verifyUserCannotAddEditDeleteOrDownloadFilesInOrganizationBucket();

	}

	@And("the user should be able to view files in the Organization Bucket test")
	public void verifyUserCanViewFilesInOrganizationBucket() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String organizationDocumentsPageUrl = Hooks.prop.getProperty("organizationDocumentsPageUrl");

		Assert.assertNotNull("organizationDocumentsPageUrl is missing in config", organizationDocumentsPageUrl);

		String fullOrganizationDocumentsUrl = baseUrl + organizationDocumentsPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openOrganizationDocumentsPage(fullOrganizationDocumentsUrl);

		Assert.assertTrue("Organization Documents page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/OrganizationDocuments"));
	}

	@And("I create a profile with View access only to Organization Bucket test")
	public void createProfileWithOrganizationBucketViewAccessOnly() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.organizationBucketProfileWithViewAccessPermissions();
		setupPage.clickSubmitButton();

	}

	// Default Fax Template
	@And("the user should have no Default Fax Template access via UI or direct URL test")
	public void verifyUserHasNoDefaultFaxTemplateAccess() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String defaultFaxTemplatePageUrl = Hooks.prop.getProperty("defaultFaxTemplatePageUrl");

		Assert.assertNotNull("defaultFaxTemplatePageUrl is missing in config", defaultFaxTemplatePageUrl);

		String fullDefaultFaxTemplateUrl = baseUrl + defaultFaxTemplatePageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openDefaultFaxTemplatePage(fullDefaultFaxTemplateUrl);

		setupPage.UserWithNoAccessCannotViewOrAccessDefaultFaxTemplate();
	}

	@And("I create a profile without Update access to Setup Module → Default Fax Template test")
	public void createProfileWithoutUpdateAccessToSetupDefaultFaxTemplate() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.setupDefaultFaxTemplateProfileWithoutUpdatePermissions();
		setupPage.clickSubmitButton();

	}

	// Default Mail Template
	@And("the user should have no Default Mail Template access via UI or direct URL test")
	public void verifyUserHasNoDefaultMailTemplateAccess() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String defaultMailTemplatePageUrl = Hooks.prop.getProperty("defaultMailTemplatePageUrl");

		Assert.assertNotNull("defaultMailTemplatePageUrl is missing in config", defaultMailTemplatePageUrl);

		String fullDefaultMailTemplateUrl = baseUrl + defaultMailTemplatePageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openDefaultMailTemplatePage(fullDefaultMailTemplateUrl);

		setupPage.UserWithNoAccessCannotViewOrAccessDefaultMailTemplate();

	}

	@And("I create a profile without Update access to Setup Module → Default Mail Template test")
	public void createProfileWithoutUpdateAccessToSetupDefaultMailTemplate() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.setupDefaultMailTemplateProfileWithoutUpdatePermissions();
		setupPage.clickSubmitButton();

	}

	// Feedback Form

	@And("the user should be able to delete a feedback form test")
	public void verifyUserCanDeleteFeedbackForm() throws InterruptedException {
		setupPage.serShouldBeAbleToDeleteFeedbackForm();

	}

	@And("I create a profile with full access to Setup Module → Feedback Form test")
	public void createProfileWithFullSetupFeedbackFormAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.setupFeedbackFormProfileWithFullAccessPermissions();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to delete any feedback form test")
	public void verifyUserCannotDeleteFeedbackForms() throws InterruptedException {
		setupPage.userShouldNotBeAbleToDeleteFeedbackForm();

	}

	@And("the user should be able to edit an existing feedback form test")
	public void verifyUserCanEditExistingFeedbackForm() throws InterruptedException {
		setupPage.userShouldBeAbleToEditFeedbackForm();

	}

	@And("I create a profile with View, Add, and Edit access to Setup Module → Feedback Form test")
	public void createProfileWithSetupFeedbackFormViewAddEditAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.setupFeedbackFormProfileWithViewAddEditPermissions();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to edit or delete any feedback form test")
	public void verifyUserCannotEditOrDeleteFeedbackForms() throws InterruptedException {
		setupPage.userShouldNotBeAbleToEditOrDeleteFeedbackForm();

	}

	@And("the user should be able to add a new feedback form test")
	public void verifyUserCanAddNewFeedbackForm() throws InterruptedException {
		setupPage.userShouldBeAbleToAddNewFeedbackForm();

	}

	@And("I create a profile with View and Add access to Setup Module → Feedback Form test")
	public void createProfileWithSetupFeedbackFormViewAndAddAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.setupFeedbackFormProfileWithViewAndAddPermissions();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to add, edit, or delete any feedback form test")
	public void verifyUserCannotModifyFeedbackForms() throws InterruptedException {
		setupPage.userShouldNotBeAbleToAddEditOrDeleteFeedbackForm();

	}

	@And("the user should be able to view feedback forms test")
	public void verifyUserCanViewFeedbackForms() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String feedbackFormsPageUrl = Hooks.prop.getProperty("feedbackFormsPageUrl");

		Assert.assertNotNull("feedbackFormsPageUrl is missing in config", feedbackFormsPageUrl);

		String fullFeedbackFormsUrl = baseUrl + feedbackFormsPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openFeedbackFormsPage(fullFeedbackFormsUrl);

		Assert.assertTrue("Feedback Forms page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/FeedbackForms"));
	}

	@And("I create a profile with View access only to Setup Module → Feedback Form test")
	public void createProfileWithSetupFeedbackFormViewAccessOnly() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.profileWithSetupFeedbackFormViewPermissions();
		setupPage.clickSubmitButton();

	}

	// Patient Signature Template
	@And("the user should be able to delete a patient signature template test")
	public void verifyUserCanDeletePatientSignatureTemplate() throws InterruptedException {
		setupPage.userShouldBeAbleToDeletePatientSignatureTemplate();

	}

	@And("I create a profile with full access to Setup Module → Patient Signature Template test")
	public void createProfileWithFullSetupPatientSignatureTemplateAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.setupPatientSignatureTemplateProfileWithFullAccessPermissions();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to delete any patient signature template test")
	public void verifyUserCannotDeletePatientSignatureTemplates() throws InterruptedException {
		setupPage.userShouldNotBeAbleToDeletePatientSignatureTemplate();

	}

	@And("the user should be able to edit an existing patient signature template test")
	public void verifyUserCanEditExistingPatientSignatureTemplate() throws InterruptedException {
		setupPage.userShouldBeAbleToEditPatientSignatureTemplate();

	}

	@And("I create a profile with View, Add, and Edit access to Setup Module → Patient Signature Template test")
	public void createProfileWithSetupPatientSignatureTemplateViewAddEditAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.profileWithSetupPatientSignatureTemplateViewAddEditPermissions();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to edit or delete any patient signature template test")
	public void verifyUserCannotEditOrDeletePatientSignatureTemplates() throws InterruptedException {
		setupPage.userShouldNotBeAbleToEditOrDeletePatientSignatureTemplate();

	}

	@And("the user should be able to add a new patient signature template test")
	public void verifyUserCanAddNewPatientSignatureTemplate() throws InterruptedException {
		setupPage.userShouldBeAbleToAddNewPatientSignatureTemplate();

	}

	@And("I create a profile with View and Add access to Setup Module → Patient Signature Template test")
	public void createProfileWithSetupPatientSignatureTemplateViewAndAddAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.profileWithSetupPatientSignatureTemplateViewAndAddPermissions();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to add, edit, or delete any patient signature template test")
	public void verifyUserCannotModifyPatientSignatureTemplates() throws InterruptedException {
		setupPage.userShouldNotBeAbleToAddEditOrDeletePatientSignatureTemplate();

	}

	@And("the user should be able to view patient signature templates test")
	public void verifyUserCanViewPatientSignatureTemplates() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientSignatureTemplatesPageUrl = Hooks.prop.getProperty("patientSignatureTemplatesPageUrl");

		Assert.assertNotNull("patientSignatureTemplatesPageUrl is missing in config", patientSignatureTemplatesPageUrl);

		String fullPatientSignatureTemplatesUrl = baseUrl + patientSignatureTemplatesPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openPatientSignatureTemplatesPage(fullPatientSignatureTemplatesUrl);

		Assert.assertTrue("Patient Signature Templates page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PatientSignatureTemplates"));
	}

	@And("I create a profile with View access only to Setup Module → Patient Signature Template test")
	public void createProfileWithSetupPatientSignatureTemplateViewAccessOnly() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.profileWithSetupPatientSignatureTemplateViewPermissions();
		setupPage.clickSubmitButton();

	}

	// Fax Template
	@And("the user should be able to delete a fax template test")
	public void verifyUserCanDeleteFaxTemplate() throws InterruptedException {
		setupPage.userShouldBeAbleToDeleteFaxTemplate();

	}

	@And("I create a profile with full access to Setup Module → Fax Template test")
	public void createProfileWithFullSetupFaxTemplateAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.unrestrictedProfileSetupFaxTemplateAccess();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to delete any fax template test")
	public void verifyUserCannotDeleteFaxTemplates() throws InterruptedException {
		setupPage.userShouldNotBeAbleToDeleteFaxTemplate();

	}

	@And("the user should be able to edit an existing fax template test")
	public void verifyUserCanEditExistingFaxTemplate() throws InterruptedException {
		setupPage.userShouldBeAbleToEditFaxTemplate();

	}

	@And("I create a profile with View, Add, and Edit access to Setup Module → Fax Template test")
	public void createProfileWithSetupFaxTemplateViewAddEditAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.setupFaxTemplateProfileWithViewAddEditPermissions();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to edit or delete any fax template test")
	public void verifyUserCannotEditOrDeleteFaxTemplates() throws InterruptedException {
		setupPage.userShouldNotBeAbleToEditOrDeleteFaxTemplate();

	}

	@And("the user should be able to add a new fax template test")
	public void verifyUserCanAddNewFaxTemplate() throws InterruptedException {
		setupPage.userShouldBeAbleToAddNewFaxTemplate();

	}

	@And("I create a profile with View and Add access to Setup Module → Fax Template test")
	public void createProfileWithSetupFaxTemplateViewAndAddAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.restrictedProfileSetupFaxTemplateViewAddAccess();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to add, edit, or delete any fax template test")
	public void verifyUserCannotModifyFaxTemplates() throws InterruptedException {
		setupPage.userShouldNotBeAbleToAddEditOrDeleteFaxTemplate();

	}

	@And("the user should be able to view fax templates test")
	public void verifyUserCanViewFaxTemplates() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String faxTemplatesPageUrl = Hooks.prop.getProperty("faxTemplatesPageUrl");

		Assert.assertNotNull("faxTemplatesPageUrl is missing in config", faxTemplatesPageUrl);

		String fullFaxTemplatesUrl = baseUrl + faxTemplatesPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openFaxTemplatesPage(fullFaxTemplatesUrl);

		Assert.assertTrue("Fax Templates page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/FaxTemplates"));
	}

	@And("I create a profile with View access only to Setup Module → Fax Template test")
	public void createProfileWithSetupFaxTemplateViewAccessOnly() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.setupFaxTemplateProfileWithViewAccessPermissions();
		setupPage.clickSubmitButton();

	}

	// Mail Template
	@And("the user should be able to delete a mail template test")
	public void verifyUserCanDeleteMailTemplate() throws InterruptedException {
		setupPage.userShouldBeAbleToDeleteMailTemplate();

	}

	@And("I create a profile with full access to Setup Module → Mail Template test")
	public void createProfileWithFullSetupMailTemplateAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.unrestrictedProfileSetupMailTemplateAccess();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to delete any mail template test")
	public void verifyUserCannotDeleteMailTemplates() throws InterruptedException {
		setupPage.userShouldNotBeAbleToDeleteMailTemplate();

	}

	@And("the user should be able to edit an existing mail template test")
	public void verifyUserCanEditExistingMailTemplate() throws InterruptedException {
		setupPage.userShouldBeAbleToEditMailTemplate();

	}

	@And("I create a profile with View, Add, and Edit access to Setup Module → Mail Template test")
	public void createProfileWithSetupMailTemplateViewAddEditAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.setupMailTemplateProfileWithViewAddEditPermissions();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to edit or delete any mail template test")
	public void verifyUserCannotEditOrDeleteMailTemplates() throws InterruptedException {
		setupPage.userShouldNotBeAbleToEditOrDeleteMailTemplate();

	}

	@And("the user should be able to add a new mail template test")
	public void verifyUserCanAddNewMailTemplate() throws InterruptedException {
		setupPage.userShouldBeAbleToAddNewMailTemplate();

	}

	@And("I create a profile with View and Add access to Setup Module → Mail Template test")
	public void createProfileWithSetupMailTemplateViewAndAddAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.setupMailTemplateProfileWithViewAndAddPermissions();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to add, edit, or delete any mail template test")
	public void verifyUserCannotModifyMailTemplates() throws InterruptedException {
		setupPage.userShouldNotBeAbleToModifyMailTemplate();

	}

	@And("the user should be able to view mail templates test")
	public void verifyUserCanViewMailTemplates() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String mailTemplatesPageUrl = Hooks.prop.getProperty("mailTemplatesPageUrl");

		Assert.assertNotNull("mailTemplatesPageUrl is missing in config", mailTemplatesPageUrl);

		String fullMailTemplatesUrl = baseUrl + mailTemplatesPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openMailTemplatesPage(fullMailTemplatesUrl);

		Assert.assertTrue("Mail Templates page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/MailTemplates"));
	}

	@And("I create a profile with View access only to Setup Module → Mail Template test")
	public void createProfileWithSetupMailTemplateViewAccessOnly() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.setupMailTemplateProfileWithViewAccessPermissions();
		setupPage.clickSubmitButton();

	}

	// BOT Call Template
	@And("the user should be able to delete a BOT call template test")
	public void verifyUserCanDeleteBotCallTemplate() throws InterruptedException {
		setupPage.verifyUserCanDeleteBotCallTemplate();

	}

	@And("I create a profile with full access to Setup Module → BOT Call Template test")
	public void createProfileWithFullSetupBotCallTemplateAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.profileWithSetupBotCallTemplateFullPermissions();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to delete any BOT call template test")
	public void verifyUserCannotDeleteBotCallTemplates() throws InterruptedException {
		setupPage.verifyUserCannotDeleteBotCallTemplate();

	}

	@And("the user should be able to edit an existing BOT call template test")
	public void verifyUserCanEditExistingBotCallTemplate() throws InterruptedException {
		setupPage.verifyUserCanEditBotCallTemplate();

	}

	@And("I create a profile with View, Add, and Edit access to Setup Module → BOT Call Template test")
	public void createProfileWithSetupBotCallTemplateViewAddEditAccess() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.setupBotCallTemplateProfileWithViewAddEditPermissions();
		setupPage.clickSubmitButton();

	}

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
