package com.pharmcrm_ClinicalworkflowModule.steps;

import org.junit.Assert;
import com.pharmcrm_ClinicalworkflowModule.pages.clinicalworkflowpage;
import com.pharmcrm_SetupModule.pages.setuppage;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class clinicalworkflowstep {

	private clinicalworkflowpage clinicalworkflowPage;

	// Upload Wizard Setting
	@And("the user should be able to Clinical Queue Rule Delete")
	public void userShouldBeAbleToClinicalQueueRuleDelete() {
		clinicalworkflowPage.deleteClinicalQueueRule();

	}

	@And("the user should be able to Clinical Queue Rule Edit")
	public void userShouldBeAbleToClinicalQueueRuleEdit() {
		clinicalworkflowPage.clinicalQueueRuleEdit();

	}

	@And("the user should be able to Clinical Queue Rule Add")
	public void userShouldBeAbleToClinicalQueueRuleAdd() {
		clinicalworkflowPage.addClinicalQueueRule();

	}

	@And("the user should be able to Clinical Queue Rule View")
	public void userShouldBeAbleToClinicalQueueRuleView() {
		clinicalworkflowPage.clinicalQueueRuleView();

	}

	@And("the user should be able to Copy Clinical Queue Column")
	public void userShouldBeAbleToCopyClinicalQueueColumn() {
		clinicalworkflowPage.copyClinicalQueueColumn();

	}

	@And("the user should be able to Clinical Column SortOrder Update")
	public void userShouldBeAbleToClinicalColumnSortOrderUpdate() {
		clinicalworkflowPage.clinicalColumnSortOrderUpdate();

	}

	@And("the user should be able to Clinical Queue Column Delete")
	public void userShouldBeAbleToClinicalQueueColumnDelete() {
		clinicalworkflowPage.allowClinicalQueueColumnDelete();

	}

	@And("the user should be able to Clinical Queue Column Add")
	public void userShouldBeAbleToClinicalQueueColumnAdd() {
		clinicalworkflowPage.allowClinicalQueueColumnAdd();

	}

	@And("the user should be able to Clinical Queue Column View")
	public void shouldUserBeAbleToViewUploadWizardSettingsPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalQueueSettingUrl = Hooks.prop.getProperty("clinicalQueueSettingUrl");
		Assert.assertNotNull("clinicalQueueSettingUrl is missing in config", clinicalQueueSettingUrl);
		String fullUrl = baseUrl + clinicalQueueSettingUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openClinicalQueueSettingPage(fullUrl);
		Assert.assertTrue("Upload Wizard Settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ClinicalQueueSetting"));
	}

	@And("I create a profile Clinical Queue Access with All Permissions")
	public void createClinicalQueueAccessProfileWithAllPermissions() {
		clinicalworkflowPage.clickFilterButton();
		clinicalworkflowPage.enterProfileName();
		clinicalworkflowPage.clickSearchButton();
		clinicalworkflowPage.clickActionMenu();
		clinicalworkflowPage.clickEditButton();
		clinicalworkflowPage.createClinicalQueueAccessProfileFullAccess();
		clinicalworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Clinicalworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Clinicalworkflow Module General Audit View");
	}

	// Appointment Reminder Setting
	@Then("the user should not be able to add or edit or delete Appointment Reminder Setting")
	public void userShouldNotBeAbleToAddOrEditOrDeleteAppointmentReminderSetting() {
		clinicalworkflowPage.restrictAppointmentReminderSettingModification();

	}

	@Then("the user should not be able to add or edit Appointment Reminder Setting")
	public void userShouldNotBeAbleToAddOrEditAppointmentReminderSetting() {
		clinicalworkflowPage.preventAppointmentReminderSettingAddOrEdit();

	}

	@Then("the user should not be able to add or delete Appointment Reminder Setting")
	public void userShouldNotBeAbleToAddOrDeleteAppointmentReminderSetting() {
		clinicalworkflowPage.UnsupportedOperationException();

	}

	@Then("the user should not be able to edit or delete Appointment Reminder Setting")
	public void userShouldNotBeAbleToEditOrDeleteAppointmentReminderSetting() {
		clinicalworkflowPage.preventAppointmentReminderSettingEditOrDelete();

	}

	@And("the user should be able to view Appointment Reminder Setting")
	public void createProfileForAppointmentReminderSettingViewOnly() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String appointmentReminderSettingUrl = Hooks.prop.getProperty("appointmentReminderSettingUrl");
		Assert.assertNotNull("appointmentReminderSettingUrl is missing in config", appointmentReminderSettingUrl);
		String fullUrl = baseUrl + appointmentReminderSettingUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openAppointmentReminderSettingPage(fullUrl);
		Assert.assertTrue("Appointment Reminder Setting page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/AppointmentReminderSetting"));
	}

	@And("the user should be able to view and delete Appointment Reminder Setting")
	public void createProfileForAppointmentReminderSettingViewDelete() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String appointmentReminderSettingUrl = Hooks.prop.getProperty("appointmentReminderSettingUrl");
		Assert.assertNotNull("appointmentReminderSettingUrl is missing in config", appointmentReminderSettingUrl);
		String fullUrl = baseUrl + appointmentReminderSettingUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openAppointmentReminderSettingPage(fullUrl);
		Assert.assertTrue("Appointment Reminder Setting page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/AppointmentReminderSetting"));
		clinicalworkflowPage.createProfileForAppointmentReminderSettingViewDelete();

	}

	@And("the user should be able to view and edit Appointment Reminder Setting")
	public void createProfileForAppointmentReminderSettingViewEdit() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String appointmentReminderSettingUrl = Hooks.prop.getProperty("appointmentReminderSettingUrl");
		Assert.assertNotNull("appointmentReminderSettingUrl is missing in config", appointmentReminderSettingUrl);
		String fullUrl = baseUrl + appointmentReminderSettingUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openAppointmentReminderSettingPage(fullUrl);
		Assert.assertTrue("Appointment Reminder Setting page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/AppointmentReminderSetting"));
		clinicalworkflowPage.createProfileForAppointmentReminderSettingViewEdit();

	}

	@And("the user should be able to view and add Appointment Reminder Setting")
	public void assignViewAndAddAccessToAppointmentReminderSettingProfile() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String appointmentReminderSettingUrl = Hooks.prop.getProperty("appointmentReminderSettingUrl");
		Assert.assertNotNull("appointmentReminderSettingUrl is missing in config", appointmentReminderSettingUrl);
		String fullUrl = baseUrl + appointmentReminderSettingUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openAppointmentReminderSettingPage(fullUrl);
		Assert.assertTrue("Appointment Reminder Setting page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/AppointmentReminderSetting"));
		clinicalworkflowPage.createProfileForAppointmentReminderSettingViewAdd();

	}

	@And("I create a profile with View access to Appointment Reminder Setting")
	public void createAppointmentReminderSettingProfileWithViewAccess() {
		clinicalworkflowPage.clickFilterButton();
		clinicalworkflowPage.enterProfileName();
		clinicalworkflowPage.clickSearchButton();
		clinicalworkflowPage.clickActionMenu();
		clinicalworkflowPage.clickEditButton();
		clinicalworkflowPage.addAppointmentReminderSettingProfileWithViewPermission();
		clinicalworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Clinicalworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Clinicalworkflow Module General Audit View");
	}

	@And("I create a profile with View and Delete access to Appointment Reminder Setting")
	public void createAppointmentReminderSettingProfileWithViewAndDeleteAccess() {
		clinicalworkflowPage.clickFilterButton();
		clinicalworkflowPage.enterProfileName();
		clinicalworkflowPage.clickSearchButton();
		clinicalworkflowPage.clickActionMenu();
		clinicalworkflowPage.clickEditButton();
		clinicalworkflowPage.addAppointmentReminderSettingProfileWithDeletePermissions();
		clinicalworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Clinicalworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Clinicalworkflow Module General Audit View");
	}

	@And("I create a profile with View and Edit access to Appointment Reminder Setting")
	public void createAppointmentReminderSettingProfileWithViewAndEditAccess() {
		clinicalworkflowPage.clickFilterButton();
		clinicalworkflowPage.enterProfileName();
		clinicalworkflowPage.clickSearchButton();
		clinicalworkflowPage.clickActionMenu();
		clinicalworkflowPage.clickEditButton();
		clinicalworkflowPage.addAppointmentReminderSettingProfileWithEditPermissions();
		clinicalworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Clinicalworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Clinicalworkflow Module General Audit View");
	}

	@And("I create a profile with View and Add access to Appointment Reminder Setting")
	public void createAppointmentReminderSettingProfileWithViewAndAddAccess() {
		clinicalworkflowPage.clickFilterButton();
		clinicalworkflowPage.enterProfileName();
		clinicalworkflowPage.clickSearchButton();
		clinicalworkflowPage.clickActionMenu();
		clinicalworkflowPage.clickEditButton();
		clinicalworkflowPage.addAppointmentReminderSettingProfileWithPermissions();
		clinicalworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Clinicalworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Clinicalworkflow Module General Audit View");
	}

	// Upload Wizard Template Setting
	@Then("the user should not be able to add or edit or delete Upload Wizard Template Setting")
	public void userShouldNotBeAbleToAddOrEditOrDeleteUploadWizardTemplateSetting() {
		clinicalworkflowPage.userCannotAddEditOrDeleteUploadWizardTemplateSetting();

	}

	@Then("the user should not be able to add or edit Upload Wizard Template Setting")
	public void userShouldNotBeAbleToAddOrEditUploadWizardTemplateSetting() {
		clinicalworkflowPage.userCannotAddOrEditUploadWizardTemplateSetting();

	}

	@Then("the user should not be able to add or delete Upload Wizard Template Setting")
	public void userShouldNotBeAbleToAddOrDeleteUploadWizardTemplateSetting() {
		clinicalworkflowPage.userCannotAddOrDeleteUploadWizardTemplateSetting();

	}

	@Then("the user should not be able to edit or delete Upload Wizard Template Setting")
	public void userShouldNotBeAbleToEditOrDeleteUploadWizardTemplateSetting() {
		clinicalworkflowPage.userCannotEditOrDeleteUploadWizardTemplateSetting();

	}

	@Then("the user should be able to view Upload Wizard Template Setting")
	public void assignViewAccessToUploadWizardTemplateSettingProfile() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String uploadWizardTemplatesUrl = Hooks.prop.getProperty("uploadWizardTemplatesUrl");
		Assert.assertNotNull("uploadWizardTemplatesUrl is missing in config", uploadWizardTemplatesUrl);
		String fullUrl = baseUrl + uploadWizardTemplatesUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openUploadWizardClinicalQueueTemplatesPage(fullUrl);
		Assert.assertTrue("Upload Wizard Clinical Queue Templates page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/UploadWizardClinicalQueueTemplates"));
	}

	@Then("the user should be able to view and delete Upload Wizard Template Setting")
	public void assignViewAndDeleteAccessToUploadWizardTemplateSettingProfile() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String uploadWizardTemplatesUrl = Hooks.prop.getProperty("uploadWizardTemplatesUrl");
		Assert.assertNotNull("uploadWizardTemplatesUrl is missing in config", uploadWizardTemplatesUrl);
		String fullUrl = baseUrl + uploadWizardTemplatesUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openUploadWizardClinicalQueueTemplatesPage(fullUrl);
		Assert.assertTrue("Upload Wizard Clinical Queue Templates page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/UploadWizardClinicalQueueTemplates"));
		clinicalworkflowPage.assignViewAndDeleteAccessToUploadWizardTemplateSettingProfile();

	}

	@Then("the user should be able to view and edit Upload Wizard Template Setting")
	public void createProfileForUploadWizardTemplateSettingViewEdit() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String uploadWizardTemplatesUrl = Hooks.prop.getProperty("uploadWizardTemplatesUrl");
		Assert.assertNotNull("uploadWizardTemplatesUrl is missing in config", uploadWizardTemplatesUrl);
		String fullUrl = baseUrl + uploadWizardTemplatesUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openUploadWizardClinicalQueueTemplatesPage(fullUrl);
		Assert.assertTrue("Upload Wizard Clinical Queue Templates page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/UploadWizardClinicalQueueTemplates"));
		clinicalworkflowPage.assignViewAndEditAccessToUploadWizardTemplateSettingProfile();

	}

	@Then("the user should be able to view and add Upload Wizard Template Setting")
	public void createProfileForUploadWizardTemplateSettingViewAdd() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String uploadWizardTemplatesUrl = Hooks.prop.getProperty("uploadWizardTemplatesUrl");
		Assert.assertNotNull("uploadWizardTemplatesUrl is missing in config", uploadWizardTemplatesUrl);
		String fullUrl = baseUrl + uploadWizardTemplatesUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openUploadWizardClinicalQueueTemplatesPage(fullUrl);
		Assert.assertTrue("Upload Wizard Clinical Queue Templates page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/UploadWizardClinicalQueueTemplates"));
		clinicalworkflowPage.createProfileForUploadWizardTemplateSettingViewAdd();

	}

	@And("I create a profile with View access to Upload Wizard Template Setting")
	public void createUploadWizardTemplateSettingProfileWithViewAccess() {
		clinicalworkflowPage.clickFilterButton();
		clinicalworkflowPage.enterProfileName();
		clinicalworkflowPage.clickSearchButton();
		clinicalworkflowPage.clickActionMenu();
		clinicalworkflowPage.clickEditButton();
		clinicalworkflowPage.assignViewAccessToUploadWizardTemplateSettingProfile();
		clinicalworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Clinicalworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Clinicalworkflow Module General Audit View");
	}

	@And("I create a profile with View and Delete access to Upload Wizard Template Setting")
	public void createUploadWizardTemplateSettingProfileWithViewAndDeleteAccess() {
		clinicalworkflowPage.clickFilterButton();
		clinicalworkflowPage.enterProfileName();
		clinicalworkflowPage.clickSearchButton();
		clinicalworkflowPage.clickActionMenu();
		clinicalworkflowPage.clickEditButton();
		clinicalworkflowPage.createProfileForUploadWizardTemplateSettingViewDelete();
		clinicalworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Clinicalworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Clinicalworkflow Module General Audit View");
	}

	@And("I create a profile with View and Edit access to Upload Wizard Template Setting")
	public void createUploadWizardTemplateSettingProfileWithViewAndEditAccess() {
		clinicalworkflowPage.clickFilterButton();
		clinicalworkflowPage.enterProfileName();
		clinicalworkflowPage.clickSearchButton();
		clinicalworkflowPage.clickActionMenu();
		clinicalworkflowPage.clickEditButton();
		clinicalworkflowPage.addUploadWizardTemplateSettingProfileWithEditPermissions();
		clinicalworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Clinicalworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Clinicalworkflow Module General Audit View");
	}

	@And("I create a profile with View and Add access to Upload Wizard Template Setting")
	public void createUploadWizardTemplateSettingProfileWithViewAndAddAccess() {
		clinicalworkflowPage.clickFilterButton();
		clinicalworkflowPage.enterProfileName();
		clinicalworkflowPage.clickSearchButton();
		clinicalworkflowPage.clickActionMenu();
		clinicalworkflowPage.clickEditButton();
		clinicalworkflowPage.addUploadWizardTemplateSettingProfileWithPermissions();
		clinicalworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Clinicalworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Clinicalworkflow Module General Audit View");
	}

	// Clinical Queues
	@Then("the user should not be able to add or edit or delete Clinical Queues")
	public void userShouldNotBeAbleToAddOrEditOrDeleteClinicalQueues() {
		clinicalworkflowPage.userCannotAddEditOrDeleteClinicalQueues();

	}

	@Then("the user should not be able to add or edit Clinical Queues")
	public void userShouldNotBeAbleToAddOrEditClinicalQueues() {
		clinicalworkflowPage.userCannotAddOrEditClinicalQueues();

	}

	@Then("the user should not be able to add or delete Clinical Queues")
	public void userShouldNotBeAbleToAddOrDeleteClinicalQueues() {
		clinicalworkflowPage.userCannotAddOrDeleteClinicalQueues();

	}

	@Then("the user should not be able to edit or delete Clinical Queues")
	public void theUserShouldNotBeAbleToEditOrDeleteClinicalQueues() {
		clinicalworkflowPage.userCannotEditOrDeleteClinicalQueues();

	}

	@Then("the user should be able to view Clinical Queues")
	public void assignViewAccessToClinicalQueueProfile() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalQueuesUrl = Hooks.prop.getProperty("clinicalQueuesUrl");
		Assert.assertNotNull("clinicalQueuesUrl is missing in config", clinicalQueuesUrl);
		String fullUrl = baseUrl + clinicalQueuesUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openClinicalQueuesPage(fullUrl);
		Assert.assertTrue("Clinical Queues page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ClinicalQueues"));
	}

	@Then("the user should be able to view and delete Clinical Queues")
	public void createProfileForClinicalQueuesViewDelete() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalQueuesUrl = Hooks.prop.getProperty("clinicalQueuesUrl");
		Assert.assertNotNull("clinicalQueuesUrl is missing in config", clinicalQueuesUrl);
		String fullUrl = baseUrl + clinicalQueuesUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openClinicalQueuesPage(fullUrl);
		Assert.assertTrue("Clinical Queues page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ClinicalQueues"));
		clinicalworkflowPage.createClinicalQueueProfileWithViewAndDeleteAccess();

	}

	@Then("the user should be able to view and edit Clinical Queues")
	public void assignViewAndEditAccessToClinicalQueueProfile() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalQueuesUrl = Hooks.prop.getProperty("clinicalQueuesUrl");
		Assert.assertNotNull("clinicalQueuesUrl is missing in config", clinicalQueuesUrl);
		String fullUrl = baseUrl + clinicalQueuesUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openClinicalQueuesPage(fullUrl);
		Assert.assertTrue("Clinical Queues page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ClinicalQueues"));
		clinicalworkflowPage.addClinicalQueueProfileWithEditPermissions();

	}

	@Then("the user should be able to view and add Clinical Queues")
	public void assignViewAndAddAccessToClinicalQueueProfile() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalQueuesUrl = Hooks.prop.getProperty("clinicalQueuesUrl");
		Assert.assertNotNull("clinicalQueuesUrl is missing in config", clinicalQueuesUrl);
		String fullUrl = baseUrl + clinicalQueuesUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openClinicalQueuesPage(fullUrl);
		Assert.assertTrue("Clinical Queues page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ClinicalQueues"));
		clinicalworkflowPage.createProfileForClinicalQueuesViewAdd();

	}

	@And("I create a profile with View access to Clinical Queues")
	public void createClinicalQueueProfileWithViewAccess() {
		clinicalworkflowPage.clickFilterButton();
		clinicalworkflowPage.enterProfileName();
		clinicalworkflowPage.clickSearchButton();
		clinicalworkflowPage.clickActionMenu();
		clinicalworkflowPage.clickEditButton();
		clinicalworkflowPage.addClinicalQueueProfileWithViewPermission();
		clinicalworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Clinicalworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Clinicalworkflow Module General Audit View");
	}

	@And("I create a profile with View and Delete access to Clinical Queues")
	public void createClinicalQueueProfileWithViewAndDeleteAccess() {
		clinicalworkflowPage.clickFilterButton();
		clinicalworkflowPage.enterProfileName();
		clinicalworkflowPage.clickSearchButton();
		clinicalworkflowPage.clickActionMenu();
		clinicalworkflowPage.clickEditButton();
		clinicalworkflowPage.createProfileForClinicalQueuesViewDelete();
		clinicalworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Clinicalworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Clinicalworkflow Module General Audit View");
	}

	@And("I create a profile with View and Edit access to Clinical Queues")
	public void createClinicalQueueProfileWithViewAndEditAccess() {
		clinicalworkflowPage.clickFilterButton();
		clinicalworkflowPage.enterProfileName();
		clinicalworkflowPage.clickSearchButton();
		clinicalworkflowPage.clickActionMenu();
		clinicalworkflowPage.clickEditButton();
		clinicalworkflowPage.createProfileForClinicalQueuesViewEdit();
		clinicalworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Clinicalworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Clinicalworkflow Module General Audit View");
	}

	@And("I create a profile with View and Add access to Clinical Queues")
	public void createClinicalQueueProfileWithViewAndAddAccess() {
		clinicalworkflowPage.clickFilterButton();
		clinicalworkflowPage.enterProfileName();
		clinicalworkflowPage.clickSearchButton();
		clinicalworkflowPage.clickActionMenu();
		clinicalworkflowPage.clickEditButton();
		clinicalworkflowPage.addClinicalQueueProfileWithPermissions();
		clinicalworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Clinicalworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Clinicalworkflow Module General Audit View");
	}

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

	@Then("validation messages should be displayed for required fields Add RPM Followup Notes")
	public void verifyAddRpmFollowupNotesValidationMessagesForRequiredFields() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalWorkflowRpmFollowupsUrl = Hooks.prop.getProperty("clinicalWorkflowRpmFollowupsUrl");
		Assert.assertNotNull("clinicalWorkflowRpmFollowupsUrl is missing in config", clinicalWorkflowRpmFollowupsUrl);
		String fullUrl = baseUrl + clinicalWorkflowRpmFollowupsUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openclinicalWorkflowRpmFollowupsUrl(fullUrl);
		Assert.assertTrue("RPM Followups page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/ClinicalWorkflow/Home/RPMFollowups"));
		clinicalworkflowPage.addRpmFollowupNotesValidationMessagesAreShownForRequiredFields();
		System.out.println("Error validation triggered: Validation messages are displayed for required fields");
		Hooks.scenario.log("Error validation triggered: Validation messages are displayed for required fields");
	}

	@Then("validation messages should be displayed for required fields Send VCard RPM Followups")
	public void verifySendVcardRpmFollowupsValidationMessagesForRequiredFields() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalWorkflowRpmFollowupsUrl = Hooks.prop.getProperty("clinicalWorkflowRpmFollowupsUrl");
		Assert.assertNotNull("clinicalWorkflowRpmFollowupsUrl is missing in config", clinicalWorkflowRpmFollowupsUrl);
		String fullUrl = baseUrl + clinicalWorkflowRpmFollowupsUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openclinicalWorkflowRpmFollowupsUrl(fullUrl);
		Assert.assertTrue("RPM Followups page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/ClinicalWorkflow/Home/RPMFollowups"));
		clinicalworkflowPage.sendVcardRpmFollowupsValidationMessagesAreShownForRequiredFields();
		System.out.println("Error validation triggered: Validation messages are displayed for required fields");
		Hooks.scenario.log("Error validation triggered: Validation messages are displayed for required fields");
	}

	@Then("validation messages should be displayed for required fields Quick Text RPM Followups")
	public void verifyQuickTextRpmFollowupsValidationMessagesForRequiredFields() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalWorkflowRpmFollowupsUrl = Hooks.prop.getProperty("clinicalWorkflowRpmFollowupsUrl");
		Assert.assertNotNull("clinicalWorkflowRpmFollowupsUrl is missing in config", clinicalWorkflowRpmFollowupsUrl);
		String fullUrl = baseUrl + clinicalWorkflowRpmFollowupsUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openclinicalWorkflowRpmFollowupsUrl(fullUrl);
		Assert.assertTrue("RPM Followups page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/ClinicalWorkflow/Home/RPMFollowups"));
		clinicalworkflowPage.quickTextRpmFollowupsValidationMessagesAreShownForRequiredFields();
		System.out.println("Error validation triggered: Validation messages are displayed for required fields");
		Hooks.scenario.log("Error validation triggered: Validation messages are displayed for required fields");
	}

	@Then("validation messages should be displayed for required fields Fax To All RPM Followups")
	public void verifyFaxToAllRpmFollowupsValidationMessagesForRequiredFields() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalWorkflowRpmFollowupsUrl = Hooks.prop.getProperty("clinicalWorkflowRpmFollowupsUrl");
		Assert.assertNotNull("clinicalWorkflowRpmFollowupsUrl is missing in config", clinicalWorkflowRpmFollowupsUrl);
		String fullUrl = baseUrl + clinicalWorkflowRpmFollowupsUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openclinicalWorkflowRpmFollowupsUrl(fullUrl);
		Assert.assertTrue("RPM Followups page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/ClinicalWorkflow/Home/RPMFollowups"));
		clinicalworkflowPage.faxToAllRpmFollowupsValidationMessagesAreShownForRequiredFields();
		System.out.println("Error validation triggered: Validation messages are displayed for required fields");
		Hooks.scenario.log("Error validation triggered: Validation messages are displayed for required fields");
	}

	@Then("BOT Call To All validation messages should be displayed for required fields RPM Followups")
	public void verifyBotCallToAllRpmFollowupsValidationMessagesForRequiredFields() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalWorkflowRpmFollowupsUrl = Hooks.prop.getProperty("clinicalWorkflowRpmFollowupsUrl");
		Assert.assertNotNull("clinicalWorkflowRpmFollowupsUrl is missing in config", clinicalWorkflowRpmFollowupsUrl);
		String fullUrl = baseUrl + clinicalWorkflowRpmFollowupsUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openclinicalWorkflowRpmFollowupsUrl(fullUrl);
		Assert.assertTrue("RPM Followups page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/ClinicalWorkflow/Home/RPMFollowups"));
		clinicalworkflowPage.botCallToAllRpmFollowupsValidationMessagesAreShownForRequiredFields();
		System.out.println("Error validation triggered: Validation messages are displayed for required fields");
		Hooks.scenario.log("Error validation triggered: Validation messages are displayed for required fields");
	}

	@Then("Text To All validation messages should be displayed for required fields RPM Followups")
	public void verifyTextToAllRpmFollowupsValidationMessagesForRequiredFields() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalWorkflowRpmFollowupsUrl = Hooks.prop.getProperty("clinicalWorkflowRpmFollowupsUrl");
		Assert.assertNotNull("clinicalWorkflowRpmFollowupsUrl is missing in config", clinicalWorkflowRpmFollowupsUrl);
		String fullUrl = baseUrl + clinicalWorkflowRpmFollowupsUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openclinicalWorkflowRpmFollowupsUrl(fullUrl);
		Assert.assertTrue("RPM Followups page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/ClinicalWorkflow/Home/RPMFollowups"));
		clinicalworkflowPage.textToAllRpmFollowupsValidationMessagesAreShownForRequiredFields();
		System.out.println("Error validation triggered: Validation messages are displayed for required fields");
		Hooks.scenario.log("Error validation triggered: Validation messages are displayed for required fields");
	}

	@Then("validation messages should be displayed for required fields Mail To All RPM Followups")
	public void verifyMailToAllRpmFollowupsValidationMessagesForRequiredFields() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalWorkflowRpmFollowupsUrl = Hooks.prop.getProperty("clinicalWorkflowRpmFollowupsUrl");
		Assert.assertNotNull("clinicalWorkflowRpmFollowupsUrl is missing in config", clinicalWorkflowRpmFollowupsUrl);
		String fullUrl = baseUrl + clinicalWorkflowRpmFollowupsUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openclinicalWorkflowRpmFollowupsUrl(fullUrl);
		Assert.assertTrue("RPM Followups page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/ClinicalWorkflow/Home/RPMFollowups"));
		clinicalworkflowPage.mailToAllRpmFollowupsValidationMessagesAreShownForRequiredFields();
		System.out.println("Error validation triggered: Validation messages are displayed for required fields");
		Hooks.scenario.log("Error validation triggered: Validation messages are displayed for required fields");
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

	@Then("validation messages should be displayed for required fields Add Appointment Notes action Appointment Outreach")
	public void verifyAddAppointmentNotesActionOutreachValidationMessagesForRequiredFields() {
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
		clinicalworkflowPage.addAppointmentNotesActionOutreachValidationMessagesAreShownForRequiredFields();
		System.out.println("Error validation triggered: Validation messages are displayed for required fields");
		Hooks.scenario.log("Error validation triggered: Validation messages are displayed for required fields");

	}

	@Then("validation message should be displayed for invalid phone number Send VCard")
	public void verifyInvalidPhoneNumberSendVcardValidationMessage() {
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
		clinicalworkflowPage.checkInvalidPhoneNumberSendVcardValidationMessage();

	}

	@Then("user enter an invalid phone number Send VCard")
	public void enterInvalidPhoneNumberSendVcard() {
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
		clinicalworkflowPage.provideInvalidPhoneNumberSendVcard();

	}

	@Then("validation messages should be displayed for required fields Send VCard Appointment Outreach")
	public void verifySendVCardAppointmentOutreachValidationMessagesForRequiredFields() {
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
		clinicalworkflowPage.sendVCardAppointmentOutreachValidationMessagesAreShownForRequiredFields();
		System.out.println("Error validation triggered: Validation messages are displayed for required fields");
		Hooks.scenario.log("Error validation triggered: Validation messages are displayed for required fields");

	}

	@Then("validation messages should be displayed for required fields Quick Text Appointment Outreach")
	public void verifyQuickTextAppointmentOutreachValidationMessagesForRequiredFields() {
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
		clinicalworkflowPage.quickTextAppointmentOutreachValidationMessagesAreShownForRequiredFields();
		System.out.println("Error validation triggered: Validation messages are displayed for required fields");
		Hooks.scenario.log("Error validation triggered: Validation messages are displayed for required fields");
	}

	@Then("user enter an invalid phone number")
	public void userEnterInvalidPhoneNumber() {
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
		clinicalworkflowPage.enterInvalidPhoneNumber();

	}

	@Then("validation message should be displayed for invalid phone number")
	public void verifyInvalidPhoneNumberValidationMessage() {
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
		clinicalworkflowPage.invalidPhoneNumberValidationMessageIsShown();
		System.out.println("Error validation triggered: Validation messages are displayed for required fields");
		Hooks.scenario.log("Error validation triggered: Validation messages are displayed for required fields");
	}

	@Then("validation messages should be displayed for required fields Fax To All Appointment Outreach")
	public void verifyFaxToAllAppointmentOutreachValidationMessagesForRequiredFields() {
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
		clinicalworkflowPage.faxToAllAppointmentOutreachValidationMessagesAreShownForRequiredFields();

		System.out.println("Error validation triggered: Validation messages are displayed for required fields");
		Hooks.scenario.log("Error validation triggered: Validation messages are displayed for required fields");

	}

	@Then("BOT Call To All validation messages should be displayed for required fields Appointment Outreach")
	public void verifyBotCallToAllAppointmentOutreachValidationMessagesForRequiredFields() {
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
		clinicalworkflowPage.botCallToAllAppointmentOutreachValidationMessagesAreShownForRequiredFields();
		System.out.println("Error validation triggered: Validation messages are displayed for required fields");
		Hooks.scenario.log("Error validation triggered: Validation messages are displayed for required fields");
	}

	@Then("Text To All validation messages should be displayed for required fields Appointment Outreach")
	public void verifyTextToAllAppointmentOutreachValidationMessagesForRequiredFields() {
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
		clinicalworkflowPage.textToAllAppointmentOutreachValidationMessagesAreShownForRequiredFields();
		System.out.println("Error validation triggered: Validation messages are displayed for required fields");
		Hooks.scenario.log("Error validation triggered: Validation messages are displayed for required fields");
	}

	@Then("validation messages should be displayed for required fields Mail To All Appointment Outreach")
	public void verifyMailToAllAppointmentOutreachValidationMessagesForRequiredFields() {
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
		clinicalworkflowPage.mailToAllAppointmentOutreachValidationMessagesAreShownForRequiredFields();
		System.out.println("Error validation triggered: Validation messages are displayed for required fields");
		Hooks.scenario.log("Error validation triggered: Validation messages are displayed for required fields");

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

	@Then("validation messages should be displayed for required fields Add Template Action Workflow")
	public void verifyAddTemplateActionWorkflowValidationMessagesForRequiredFields() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalWorkflowActionWorkflowUrl = Hooks.prop.getProperty("clinicalWorkflowActionWorkflowUrl");
		Assert.assertNotNull("clinicalWorkflowActionWorkflowUrl is missing in config",
				clinicalWorkflowActionWorkflowUrl);
		String fullUrl = baseUrl + clinicalWorkflowActionWorkflowUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openclinicalWorkflowActionWorkflowUrl(fullUrl);
		Assert.assertTrue("Action Workflow page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/ClinicalWorkflow/Home/ActionWorkflow"));
		clinicalworkflowPage.addTemplateActionWorkflowValidationMessagesAreShownForRequiredFields();
		System.out.println("Error validation triggered: Validation messages are displayed for required fields");
		Hooks.scenario.log("Error validation triggered: Validation messages are displayed for required fields");
	}

	@Then("validation messages should be displayed for required fields Send VCard Action Workflow")
	public void verifySendVcardActionWorkflowValidationMessagesForRequiredFields() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalWorkflowActionWorkflowUrl = Hooks.prop.getProperty("clinicalWorkflowActionWorkflowUrl");
		Assert.assertNotNull("clinicalWorkflowActionWorkflowUrl is missing in config",
				clinicalWorkflowActionWorkflowUrl);
		String fullUrl = baseUrl + clinicalWorkflowActionWorkflowUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openclinicalWorkflowActionWorkflowUrl(fullUrl);
		Assert.assertTrue("Action Workflow page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/ClinicalWorkflow/Home/ActionWorkflow"));
		clinicalworkflowPage.sendVcardActionWorkflowValidationMessagesAreShownForRequiredFields();
		System.out.println("Error validation triggered: Validation messages are displayed for required fields");
		Hooks.scenario.log("Error validation triggered: Validation messages are displayed for required fields");
	}

	@Then("validation messages should be displayed for required fields Quick Text Action Workflow")
	public void verifyQuickTextActionWorkflowValidationMessagesForRequiredFields() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalWorkflowActionWorkflowUrl = Hooks.prop.getProperty("clinicalWorkflowActionWorkflowUrl");
		Assert.assertNotNull("clinicalWorkflowActionWorkflowUrl is missing in config",
				clinicalWorkflowActionWorkflowUrl);
		String fullUrl = baseUrl + clinicalWorkflowActionWorkflowUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openclinicalWorkflowActionWorkflowUrl(fullUrl);
		Assert.assertTrue("Action Workflow page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/ClinicalWorkflow/Home/ActionWorkflow"));
		clinicalworkflowPage.quickTextActionWorkflowValidationMessagesAreShownForRequiredFields();
		System.out.println("Error validation triggered: Validation messages are displayed for required fields");
		Hooks.scenario.log("Error validation triggered: Validation messages are displayed for required fields");
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

	@Then("Appointment Action Alert note validation messages should be displayed for required fields")
	public void verifyAppointmentActionAlertNoteValidationMessagesForRequiredFields() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalWorkflowDashboard = Hooks.prop.getProperty("clinicalWorkflowDashboard");
		Assert.assertNotNull("clinicalWorkflowDashboard is missing in config", clinicalWorkflowDashboard);
		String fullUrl = baseUrl + clinicalWorkflowDashboard;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openClinicalWorkflowDashboard(fullUrl);
		Assert.assertTrue("Dashboard page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/ClinicalWorkflow/Home/Dashboard"));

		clinicalworkflowPage.checkAppointmentActionAlertNoteValidationMessagesForRequiredFields();
		System.out.println("Error validation triggered: Validation messages are displayed for required fields");
		Hooks.scenario.log("Error validation triggered: Validation messages are displayed for required fields");
	}

	@Then("BOT Call To All validation messages should be displayed for required fields")
	public void verifyBotCallToAllValidationMessagesForRequiredFields() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalWorkflowDashboard = Hooks.prop.getProperty("clinicalWorkflowDashboard");
		Assert.assertNotNull("clinicalWorkflowDashboard is missing in config", clinicalWorkflowDashboard);
		String fullUrl = baseUrl + clinicalWorkflowDashboard;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openClinicalWorkflowDashboard(fullUrl);
		Assert.assertTrue("Dashboard page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/ClinicalWorkflow/Home/Dashboard"));

		clinicalworkflowPage.botCallToAllValidationMessagesAreShownForRequiredFields();
		System.out.println("Error validation triggered: Validation messages are displayed for required fields");
		Hooks.scenario.log("Error validation triggered: Validation messages are displayed for required fields");
	}

	@Then("Text To All validation messages should be displayed for required fields")
	public void textToAllValidationMessagesShouldBeDisplayedForRequiredFields() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalWorkflowDashboard = Hooks.prop.getProperty("clinicalWorkflowDashboard");
		Assert.assertNotNull("clinicalWorkflowDashboard is missing in config", clinicalWorkflowDashboard);
		String fullUrl = baseUrl + clinicalWorkflowDashboard;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openClinicalWorkflowDashboard(fullUrl);
		Assert.assertTrue("Dashboard page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/ClinicalWorkflow/Home/Dashboard"));

		clinicalworkflowPage.checkTextToAllValidationMessagesForRequiredFields();
		System.out.println("Error validation triggered: Validation messages are displayed for required fields");
		Hooks.scenario.log("Error validation triggered: Validation messages are displayed for required fields");
	}

	@Then("validation messages should be displayed for required fields")
	public void validationMessagesShouldBeDisplayedForRequiredFields() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalWorkflowDashboard = Hooks.prop.getProperty("clinicalWorkflowDashboard");
		Assert.assertNotNull("clinicalWorkflowDashboard is missing in config", clinicalWorkflowDashboard);
		String fullUrl = baseUrl + clinicalWorkflowDashboard;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openClinicalWorkflowDashboard(fullUrl);
		Assert.assertTrue("Dashboard page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/ClinicalWorkflow/Home/Dashboard"));

		clinicalworkflowPage.displayValidationMessagesForRequiredFields();
		System.out.println("Error validation triggered: Validation messages are displayed for required fields");
		Hooks.scenario.log("Error validation triggered: Validation messages are displayed for required fields");
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
