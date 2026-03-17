package com.pharmcrm_SetupModule.steps;

import org.junit.Assert;
import com.pharmcrm_SetupModule.pages.setuppage;
import hooks.Hooks;
import io.cucumber.java.en.And;

public class setupstep {

	private setuppage setupPage;

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

		Assert.assertTrue("Default Fax Template page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/DefaultFaxTemplate"));
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
