package com.pharmcrm_ClinicalModule.steps;

import org.junit.Assert;

import com.pharmcrm_ClinicalModule.pages.clinicalpage;

import hooks.Hooks;
import io.cucumber.java.en.And;

public class clinicalstep {

	private clinicalpage clinicalPage;

	// Device Usage Statistic Report
	@And("I create a profile with View access only to Device Usage Statistic Report in Clinical Module test")
	public void shouldCreateProfileWithViewAccessOnlyToDeviceUsageStatisticReportInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithViewOnlyAccessToDeviceUsageReport();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Device Usage Statistic Report in Clinical Module");
		Hooks.scenario.log("Profile updated with View access only to Device Usage Statistic Report in Clinical Module");

	}

	@And("I create a profile with View and Export access to Device Usage Statistic Report in Clinical Module test")
	public void shouldCreateProfileWithViewAndExportAccessToDeviceUsageStatisticReportInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithViewAndExportAccessToDeviceUsageReport();
		clinicalPage.clickSubmitButton();
		System.out.println(
				"Profile updated with View and Export access to Device Usage Statistic Report in Clinical Module");
		Hooks.scenario
				.log("Profile updated with View and Export access to Device Usage Statistic Report in Clinical Module");

	}

	// RPM / CPT Code
	@And("the user should not be able to add or edit RPM CPT Code in Clinical Module test")
	public void shouldNotAllowUserToAddOrEditRPMCPTCodeInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));

		clinicalPage.cannotAddOrEditRPMCPTCodeInClinicalModule();
		System.out.println("Verified user cannot add or edit RPM CPT Code in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or edit RPM CPT Code in Clinical Module");

	}

	@And("the user should be able to delete RPM CPT Code in Clinical Module test")
	public void shouldAllowUserToDeleteRPMCPTCodeInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.canDeleteRPMCPTCodeInClinicalModule();
		System.out.println("Verified user can delete RPM CPT Code in Clinical Module");
		Hooks.scenario.log("Verified user can delete RPM CPT Code in Clinical Module");

	}

	@And("the user should be able to view Device Usage Statistic Report in Clinical Module test")
	public void shouldAllowUserToViewDeviceUsageStatisticReportInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reportPath = Hooks.prop.getProperty("deviceUsageReportUrl");
		Assert.assertNotNull("deviceUsageReportUrl is missing in config", reportPath);
		String fullReportUrl = baseUrl + reportPath;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullReportUrl);
		Assert.assertTrue("Device Usage Statistic Report page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/DeviceUsageStatisticReport"));
		System.out.println("Verified user can view Device Usage Statistic Report in Clinical Module");
		Hooks.scenario.log("Verified user can view Device Usage Statistic Report in Clinical Module");

	}

	@And("the user should not be able to export Device Usage Statistic Report in Clinical Module test")
	public void shouldNotAllowUserToExportDeviceUsageStatisticReportInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reportPath = Hooks.prop.getProperty("deviceUsageReportUrl");
		Assert.assertNotNull("deviceUsageReportUrl is missing in config", reportPath);
		String fullReportUrl = baseUrl + reportPath;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullReportUrl);
		Assert.assertTrue("Device Usage Statistic Report page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/DeviceUsageStatisticReport"));
		clinicalPage.theUserShouldNotBeAbleToExportDeviceUsageStatisticReportInClinicalModule();
		System.out.println("Verified user cannot export Device Usage Statistic Report in Clinical Module");
		Hooks.scenario.log("Verified user cannot export Device Usage Statistic Report in Clinical Module");

	}

	@And("the user should be able to export Device Usage Statistic Report in Clinical Module test")
	public void shouldAllowUserToExportDeviceUsageStatisticReportInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reportPath = Hooks.prop.getProperty("deviceUsageReportUrl");
		Assert.assertNotNull("deviceUsageReportUrl is missing in config", reportPath);
		String fullReportUrl = baseUrl + reportPath;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullReportUrl);
		Assert.assertTrue("Device Usage Statistic Report page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/DeviceUsageStatisticReport"));
		clinicalPage.theUserShouldBeAbleToExportDeviceUsageStatisticReportInClinicalModule();
		System.out.println("Verified user can export Device Usage Statistic Report in Clinical Module");
		Hooks.scenario.log("Verified user can export Device Usage Statistic Report in Clinical Module");

	}

	@And("I create a profile with Delete access only to CPT Code in Clinical Module test")
	public void shouldCreateProfileWithDeleteAccessOnlyToCPTCodeInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithDeleteOnlyCPTCodeAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Delete access only to CPT Code in Clinical Module");
		Hooks.scenario.log("Profile updated with Delete access only to CPT Code in Clinical Module");

	}

	@And("the user should not be able to add or delete RPM CPT Code in Clinical Module test")
	public void shouldNotAllowUserToAddOrDeleteRPMCPTCodeInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.cannotAddOrDeleteRPMCPTCodeInClinicalModule();
		System.out.println("Verified user cannot add or delete RPM CPT Code in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or delete RPM CPT Code in Clinical Module");

	}

	@And("the user should be able to edit RPM CPT Code in Clinical Module test")
	public void shouldAllowUserToEditRPMCPTCodeInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.canEditRPMCPTCodeInClinicalModule();
		System.out.println("Verified user can edit RPM CPT Code in Clinical Module");
		Hooks.scenario.log("Verified user can edit RPM CPT Code in Clinical Module");

	}

	@And("I create a profile with Edit access only to CPT Code in Clinical Module test")
	public void shouldCreateProfileWithEditAccessOnlyToCPTCodeInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithEditOnlyCPTCodeAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Edit access only to CPT Code in Clinical Module");
		Hooks.scenario.log("Profile updated with Edit access only to CPT Code in Clinical Module");

	}

	@And("I create a profile with Add access only to CPT Code in Clinical Module test")
	public void shouldCreateProfileWithAddAccessOnlyToCPTCodeInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithAddOnlyCPTCodeAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add access only to CPT Code in Clinical Module");
		Hooks.scenario.log("Profile updated with Add access only to CPT Code in Clinical Module");

	}

	@And("the user should not be able to edit or delete RPM CPT Code in Clinical Module test")
	public void shouldNotAllowUserToEditOrDeleteRPMCPTCodeInClinicalModule() {
		clinicalPage.cannotEditOrDeleteRPMCPTCodeInClinicalModule();
		System.out.println("Verified user cannot edit or delete RPM CPT Code in Clinical Module");
		Hooks.scenario.log("Verified user cannot edit or delete RPM CPT Code in Clinical Module");

	}

	@And("the user should be able to add RPM CPT Code in Clinical Module test")
	public void shouldAllowUserToAddRPMCPTCodeInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.canAddRPMCPTCodeInClinicalModule();
		System.out.println("Verified user can add RPM CPT Code in Clinical Module");
		Hooks.scenario.log("Verified user can add RPM CPT Code in Clinical Module");

	}

	// RPM / Digital Signature
	@And("I create a profile with Download access only to Digital Signature in Clinical Module test")
	public void shouldCreateProfileWithDownloadAccessOnlyToDigitalSignatureInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithDownloadOnlyDigitalSignatureAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Download access only to Digital Signature in Clinical Module");
		Hooks.scenario.log("Profile updated with Download access only to Digital Signature in Clinical Module");

	}

	@And("the user should not be able to delete or download Digital Signature in Clinical Module test")
	public void shouldNotAllowUserToDeleteOrDownloadDigitalSignatureInClinicalModule() {
		clinicalPage.cannotDeleteOrDownloadDigitalSignatureInClinicalModule();
		System.out.println("Verified user cannot delete or download Digital Signature in Clinical Module");
		Hooks.scenario.log("Verified user cannot delete or download Digital Signature in Clinical Module");

	}

	@And("the user should not be able to edit or delete Digital Signature in Clinical Module test")
	public void shouldNotAllowUserToEditOrDeleteDigitalSignatureInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.cannotEditOrDeleteDigitalSignatureInClinicalModule();
		System.out.println("Verified user cannot edit or delete Digital Signature in Clinical Module");
		Hooks.scenario.log("Verified user cannot edit or delete Digital Signature in Clinical Module");

	}

	@And("the user should be able to download Digital Signature in Clinical Module test")
	public void shouldAllowUserToDownloadDigitalSignatureInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.canDownloadDigitalSignatureInClinicalModule();
		System.out.println("Verified user can download Digital Signature in Clinical Module");
		Hooks.scenario.log("Verified user can download Digital Signature in Clinical Module");

	}

	@And("the user should be able to delete Digital Signature in Clinical Module test")
	public void shouldAllowUserToDeleteDigitalSignatureInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.canDeleteDigitalSignatureInClinicalModule();
		System.out.println("Verified user can delete Digital Signature in Clinical Module");
		Hooks.scenario.log("Verified user can delete Digital Signature in Clinical Module");

	}

	@And("the user should not be able to edit or download Digital Signature in Clinical Module test")
	public void shouldNotAllowUserToEditOrDownloadDigitalSignatureInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.cannotEditOrDownloadDigitalSignatureInClinicalModule();
		System.out.println("Verified user cannot edit or download Digital Signature in Clinical Module");
		Hooks.scenario.log("Verified user cannot edit or download Digital Signature in Clinical Module");

	}

	@And("I create a profile with Delete access only to Digital Signature in Clinical Module test")
	public void shouldCreateProfileWithDeleteAccessOnlyToDigitalSignatureInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithDeleteOnlyDigitalSignatureAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Delete access only to Digital Signature in Clinical Module");
		Hooks.scenario.log("Profile updated with Delete access only to Digital Signature in Clinical Module");

	}

	@And("I create a profile with Edit access only to Digital Signature in Clinical Module test")
	public void shouldCreateProfileWithEditAccessOnlyToDigitalSignatureInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithEditOnlyDigitalSignatureAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Edit access only to Digital Signature in Clinical Module");
		Hooks.scenario.log("Profile updated with Edit access only to Digital Signature in Clinical Module");

	}

	@And("the user should be able to edit Digital Signature in Clinical Module test")
	public void userShouldBeAbleToEditDigitalSignatureInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.canEditDigitalSignatureInClinicalModule();
		System.out.println("Verified user can edit Digital Signature in Clinical Module");
		Hooks.scenario.log("Verified user can edit Digital Signature in Clinical Module");

	}

	// Prior Authorization PA Progress Step
	@And("the user should not be able to add or edit PA Progress Step in Clinical Module test")
	public void userShouldNotBeAbleToAddOrEditPAProgressStepInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		clinicalPage.cannotAddOrEditPAProgressStepInClinicalModule();
		System.out.println("Verified user cannot add or edit PA Progress Step in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or edit PA Progress Step in Clinical Module");

	}

	@And("the user should be able to delete PA Progress Step in Clinical Module test")
	public void shouldAllowUserToDeletePAProgressStepInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		clinicalPage.canDeletePAProgressStepInClinicalModule();
		System.out.println("Verified user can delete PA Progress Step in Clinical Module");
		Hooks.scenario.log("Verified user can delete PA Progress Step in Clinical Module");

	}

	@And("I create a profile with Delete access only to PA Progress Step in Clinical Module test")
	public void shouldCreateProfileWithDeleteAccessOnlyToPAProgressStepInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithDeleteOnlyPAProgressStepAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Delete access only to PA Progress Step in Clinical Module");
		Hooks.scenario.log("Profile updated with Delete access only to PA Progress Step in Clinical Module");

	}

	@And("the user should not be able to edit or delete PA Progress Step in Clinical Module test")
	public void shouldNotAllowUserToEditOrDeletePAProgressStepInClinicalModule() {
		clinicalPage.cannotEditOrDeletePAProgressStepInClinicalModule();
		System.out.println("Verified user cannot edit or delete PA Progress Step in Clinical Module");
		Hooks.scenario.log("Verified user cannot edit or delete PA Progress Step in Clinical Module");

	}

	@And("the user should not be able to add or delete PA Progress Step in Clinical Module test")
	public void shouldNotAllowUserToAddOrDeletePAProgressStepInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		clinicalPage.cannotAddOrDeletePAProgressStepInClinicalModule();
		System.out.println("Verified user cannot add or delete PA Progress Step in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or delete PA Progress Step in Clinical Module");

	}

	@And("the user should be able to edit PA Progress Step in Clinical Module test")
	public void whenUserEditsPAProgressStepInClinicalModule_thenChangesAreSaved() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		clinicalPage.canEditPAProgressStepInClinicalModule();
		System.out.println("Verified user can edit PA Progress Step in Clinical Module");
		Hooks.scenario.log("Verified user can edit PA Progress Step in Clinical Module");

	}

	@And("the user should be able to add PA Progress Step in Clinical Module test")
	public void shouldAllowUserToAddPAProgressStepInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		clinicalPage.canAddPAProgressStepInClinicalModule();
		System.out.println("Verified user can add PA Progress Step in Clinical Module");
		Hooks.scenario.log("Verified user can add PA Progress Step in Clinical Module");

	}

	@And("I create a profile with Edit access only to PA Progress Step in Clinical Module test")
	public void shouldCreateProfileWithEditAccessOnlyToPAProgressStepInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithEditOnlyPAProgressStepAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Edit access only to PA Progress Step in Clinical Module");
		Hooks.scenario.log("Profile updated with Edit access only to PA Progress Step in Clinical Module");

	}

	@And("I create a profile with Add access only to PA Progress Step in Clinical Module test")
	public void createProfileWithLimitedClinicalAccessToPAProgressStep() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileForPAProgressStep();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add access only to PA Progress Step in Clinical Module");
		Hooks.scenario.log("Profile updated with Add access only to PA Progress Step in Clinical Module");

	}

	// RPM / RPM Progress Step
	@And("I create a profile with Delete access only to RPM Progress Step in Clinical Module test")
	public void createRpmProgressStepDeleteProfile() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createDeleteOnlyRpmProgressStepProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Delete access only to RPM Progress Step in Clinical Module");
		Hooks.scenario.log("Profile updated with Delete access only to RPM Progress Step in Clinical Module");

	}

	@And("I create a profile with Edit access only to RPM Progress Step in Clinical Module test")
	public void createRpmProgressStepEditProfile() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createEditOnlyRpmProgressStepProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Edit access only to RPM Progress Step in Clinical Module");
		Hooks.scenario.log("Profile updated with Edit access only to RPM Progress Step in Clinical Module");

	}

	@And("I create a profile with Add access only to RPM Progress Step in Clinical Module test")
	public void createRpmProgressStepAddProfile() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createAddOnlyRpmProgressStepProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add access only to RPM Progress Step in Clinical Module");
		Hooks.scenario.log("Profile updated with Add access only to RPM Progress Step in Clinical Module");

	}

	@And("the user should not be able to add or edit RPM Progress Step in Clinical Module test")
	public void userCannotAddOrEditRpmProgressStep() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.addOrEditRpmProgressStepNotAllowed();
		System.out.println("Verified user cannot add or edit RPM Progress Step in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or edit RPM Progress Step in Clinical Module");

	}

	@And("the user should not be able to add or delete RPM Progress Step in Clinical Module test")
	public void userCannotAddOrDeleteRpmProgressStep() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.addOrDeleteRpmProgressStepNotAllowed();
		System.out.println("Verified user cannot add or delete RPM Progress Step in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or delete RPM Progress Step in Clinical Module");

	}

	@And("the user should be able to edit RPM Progress Step in Clinical Module test")
	public void userCanEditRpmProgressStep() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.editRpmProgressStepAllowed();
		System.out.println("Verified user can edit RPM Progress Step in Clinical Module");
		Hooks.scenario.log("Verified user can edit RPM Progress Step in Clinical Module");

	}

	@And("the user should be able to delete RPM Progress Step in Clinical Module test")
	public void userCanDeleteRpmProgressStep() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.deleteRpmProgressStepAllowed();
		System.out.println("Verified user can delete RPM Progress Step in Clinical Module");
		Hooks.scenario.log("Verified user can delete RPM Progress Step in Clinical Module");

	}

	@And("the user should be able to add RPM Progress Step in Clinical Module test")
	public void userCanAddRpmProgressStep() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.addRpmProgressStepAllowed();
		System.out.println("Verified user can add RPM Progress Step in Clinical Module");
		Hooks.scenario.log("Verified user can add RPM Progress Step in Clinical Module");

	}

	@And("the user should not be able to edit or delete RPM Progress Step in Clinical Module test")
	public void userCannotEditOrDeleteRpmProgressStep() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.editOrDeleteRpmProgressStepNotAllowed();
		System.out.println("Verified user cannot edit or delete RPM Progress Step in Clinical Module");
		Hooks.scenario.log("Verified user cannot edit or delete RPM Progress Step in Clinical Module");

	}

	// RPM / RPM Status
	@And("I create a profile with Delete access only to RPM Status in Clinical Module test")
	public void createRpmDeleteProfile() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createDeleteOnlyRpmProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Delete access only to RPM Status in Clinical Module");
		Hooks.scenario.log("Profile updated with Delete access only to RPM Status in Clinical Module");

	}

	@And("I create a profile with Edit access only to RPM Status in Clinical Module test")
	public void createRpmEditProfile() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createEditOnlyRpmProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Edit access only to RPM Status in Clinical Module");
		Hooks.scenario.log("Profile updated with Edit access only to RPM Status in Clinical Module");

	}

	@And("the user should be able to add RPM Status page in Clinical Module test")
	public void userCanAddRpmStatus() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.userCanAddRpmStatus();
		System.out.println("Verified user can add RPM Status in Clinical Module");
		Hooks.scenario.log("Verified user can add RPM Status in Clinical Module");

	}

	@And("the user should not be able to add or delete RPM Status page in Clinical Module test")
	public void userCannotAddOrDeleteRpmStatus() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.addOrDeleteRpmStatusNotAllowed();
		System.out.println("Verified user cannot add or delete RPM Status in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or delete RPM Status in Clinical Module");

	}

	@And("the user should be able to delete RPM Status page in Clinical Module test")
	public void userCanDeleteRpmStatus() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.deleteRpmStatusAllowed();
		System.out.println("Verified user can delete RPM Status in Clinical Module");
		Hooks.scenario.log("Verified user can delete RPM Status in Clinical Module");

	}

	@And("the user should not be able to add or edit RPM Status Page in Clinical Module test")
	public void userCannotAddOrEditRpmStatus() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.addOrEditRpmStatusNotAllowed();
		System.out.println("Verified user cannot add or edit RPM Status in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or edit RPM Status in Clinical Module");

	}

	@And("the user should be able to edit RPM Status page in Clinical Module test")
	public void userCanEditRpmStatus() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.userHasEditAccessToRpmStatus();
		System.out.println("Verified user can edit RPM Status in Clinical Module");
		Hooks.scenario.log("Verified user can edit RPM Status in Clinical Module");

	}

	@And("the user should not be able to edit or delete RPM Status page in Clinical Module test")
	public void userCannotEditOrDeleteRpmStatus() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.userCannotEditOrDeleteRpmStatus();
		System.out.println("Verified user cannot edit or delete RPM Status in Clinical Module");
		Hooks.scenario.log("Verified user cannot edit or delete RPM Status in Clinical Module");

	}

	@And("I create a profile with Add access only to RPM Status in Clinical Module test")
	public void createProfileWithAddAccessOnlyToRPMStatus() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createRpmAddProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add access only to RPM Status in Clinical Module");
		Hooks.scenario.log("Profile updated with Add access only to RPM Status in Clinical Module");

	}

	// Reports / Remote Monitoring Report
	@And("the user should be able to send Clinical PA Insurance in Clinical Module test")
	public void userShouldBeAbleToSendClinicalPAInsuranceInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.userShouldBeAbleToSendPAInsuranceInClinicalModule();
		System.out.println("Verified user can send Clinical PA Insurance in Clinical Module");
		Hooks.scenario.log("Verified user can send Clinical PA Insurance in Clinical Module");

	}

	@And("the user should be able to delete PA ChartNote attachment in Clinical Module test")
	public void userShouldBeAbleToDeletePAChartNoteAttachmentInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.deletePAChartNoteAttachmentInClinicalModule();
		System.out.println("Verified user can delete PA ChartNote attachment in Clinical Module");
		Hooks.scenario.log("Verified user can delete PA ChartNote attachment in Clinical Module");

	}

	@And("I create a profile with all access for PA All PA test")
	public void theUserShouldBeAbleToCreateProfileWithAllAccessForAllPA() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithAllAccessForAllPA();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with all access for PA All in Clinical Module");
		Hooks.scenario.log("Profile updated with all access for PA All in Clinical Module");

	}

	@And("I create a profile with View access only to Reports Remote Monitoring Report in Clinical Module test")
	public void theUserShouldBeAbleToCreateProfileWithViewAccessForRemoteMonitoringReportInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithViewAccessForRemoteMonitoringReportInClinicalModule();
		clinicalPage.clickSubmitButton();
		System.out.println(
				"Profile updated with View access only to Reports Remote Monitoring Report in Clinical Module");
		Hooks.scenario
				.log("Profile updated with View access only to Reports Remote Monitoring Report in Clinical Module");

	}

	// RPM / Trigger Alert for Time
	@And("the user should be able to download drilldown report for Reports Remote Monitoring Report in Clinical Module test")
	public void theUserShouldBeAbleToDownloadDrilldownReportForRemoteMonitoringReportInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.downloadDrilldownReportForRemoteMonitoringReportInClinicalModule();
		System.out.println(
				"Verified user can download drilldown report for Reports Remote Monitoring Report in Clinical Module");
		Hooks.scenario.log(
				"Verified user can download drilldown report for Reports Remote Monitoring Report in Clinical Module");

	}

	@And("the user should be able to export Reports Remote Monitoring Report to Excel in Clinical Module test")
	public void createProfileWithSendForSignatureAccessForRemoteMonitoringReport() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.exportRemoteMonitoringReportToExcelInClinicalModule();
		System.out.println("Verified user can export Reports Remote Monitoring Report to Excel in Clinical Module");
		Hooks.scenario.log("Verified user can export Reports Remote Monitoring Report to Excel in Clinical Module");

	}

	@And("the user should be able to send Reports Remote Monitoring Report for signature in Clinical Module test")
	public void userShouldBeAbleToSendReportsRemoteMonitoringReportForSignatureInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.shouldSendReportsRemoteMonitoringReportForSignatureInClinicalModule();
		System.out.println("Verified user can send Reports Remote Monitoring Report for signature in Clinical Module");
		Hooks.scenario.log("Verified user can send Reports Remote Monitoring Report for signature in Clinical Module");

	}

	@And("I create a profile with all access for Reports Remote Monitoring Report test")
	public void createProfileWithAllAccessForReportsRemoteMonitoringReportTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithAllAccessForReportsRemoteMonitoringReport();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with all access for Reports Remote Monitoring Report in Clinical Module");
		Hooks.scenario.log("Profile updated with all access for Reports Remote Monitoring Report in Clinical Module");

	}

	@And("the user should be able to download Reports Remote Monitoring Report file in Clinical Module test")
	public void userShouldBeAbleToDownloadReportsRemoteMonitoringReportFileInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.userShouldBeAbleToDownloadReportsRemoteMonitoringReportFileInClinicalModule();
		System.out.println("Verified user can download Reports Remote Monitoring Report file in Clinical Module");
		Hooks.scenario.log("Verified user can download Reports Remote Monitoring Report file in Clinical Module");

	}

	@And("the user should be able to drill down Reports Remote Monitoring Report in Clinical Module test")
	public void userShouldBeAbleToDrillDownReportsRemoteMonitoringReportInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.userShouldBeAbleToDrillDownReportsRemoteMonitoringReportInClinicalModule();
		System.out.println("Verified user can drill down Reports Remote Monitoring Report in Clinical Module");
		Hooks.scenario.log("Verified user can drill down Reports Remote Monitoring Report in Clinical Module");

	}

	@And("the user should be able to view Reports Remote Monitoring Report in Clinical Module test")
	public void userShouldBeAbleToViewReportsRemoteMonitoringReportInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		System.out.println("Verified user can view Reports Remote Monitoring Report in Clinical Module");
		Hooks.scenario.log("Verified user can view Reports Remote Monitoring Report in Clinical Module");

	}

	@And("the user should be able to delete RPM Trigger Alert for Time in Clinical Module test")
	public void userShouldBeAbleToDeleteRpmTriggerAlertForTimeInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.canDeleteRpmTriggerAlertForTimeInClinicalModule();
		System.out.println("Verified user can delete RPM Trigger Alert for Time in Clinical Module");
		Hooks.scenario.log("Verified user can delete RPM Trigger Alert for Time in Clinical Module");

	}

	@And("the user should be able to generate PA All PA in Clinical Module test")
	public void theUserShouldBeAbleToGenerateAllPAInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		clinicalPage.userShouldBeAbleToGenerateAllPAInClinicalModule();
		System.out.println("Verified user can generate PA All PA in Clinical Module");
		Hooks.scenario.log("Verified user can generate PA All PA in Clinical Module");

	}

	@And("the user should be able to view PA All PA outcome in Clinical Module test")
	public void theUserShouldBeAbleToViewAllPAOutcomeInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		clinicalPage.userShouldBeAbleToViewAllPAOutcomeInClinicalModule();
		System.out.println("Verified user can view PA All PA outcome in Clinical Module");
		Hooks.scenario.log("Verified user can view PA All PA outcome in Clinical Module");

	}

	@And("the user should be able to export PA All PA to Excel in Clinical Module test")
	public void theUserShouldBeAbleToExportAllPAToExcelInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		clinicalPage.userShouldBeAbleToExportAllPAToExcelInClinicalModule();
		System.out.println("Verified user can export PA All PA to Excel in Clinical Module");
		Hooks.scenario.log("Verified user can export PA All PA to Excel in Clinical Module");

	}

	@And("the user should be able to delete generated incoming attachment in Clinical Module test")
	public void userShouldBeAbleToDeleteGeneratedIncomingAttachmentInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		clinicalPage.userShouldBeAbleToDeleteGeneratedIncomingAttachmentInClinicalModule();
		System.out.println("Verified user can delete generated incoming attachment in Clinical Module");
		Hooks.scenario.log("Verified user can delete generated incoming attachment in Clinical Module");

	}

	@And("the user should be able to delete PA outcome status in Clinical Module test")
	public void userShouldBeAbleToDeletePAOutcomeStatusInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		clinicalPage.userShouldBeAbleToDeletePAOutcomeStatusInClinicalModule();
		System.out.println("Verified user can delete PA outcome status in Clinical Module");
		Hooks.scenario.log("Verified user can delete PA outcome status in Clinical Module");

	}

	@And("the user should be able to delete PA status in Clinical Module test")
	public void theUserShouldBeAbleToDeletePAStatusInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		clinicalPage.userShouldBeAbleToDeletePAStatusInClinicalModule();
		System.out.println("Verified user can delete PA status in Clinical Module");
		Hooks.scenario.log("Verified user can delete PA status in Clinical Module");

	}

	@And("the user should be able to show generated PA by all in Clinical Module test")
	public void theUserShouldBeAbleToShowGeneratedPAByAllInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		clinicalPage.userShouldBeAbleToShowGeneratedPABYAllInClinicalModule();
		System.out.println("Verified user can show generated PA by All in Clinical Module");
		Hooks.scenario.log("Verified user can show generated PA by All in Clinical Module");

	}

	@And("the user should be able to submit PA All PA in Clinical Module test")
	public void theUserShouldBeAbleToSubmitAllPAInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		clinicalPage.submitAllPAInClinicalModule();
		System.out.println("Verified user can submit all PAs in Clinical Module");
		Hooks.scenario.log("Verified user can submit all PAs in Clinical Module");

	}

	@And("the user should be able to verify PA All PA in Clinical Module test")
	public void theUserShouldBeAbleToVerifyAllPAInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		clinicalPage.verifyAllPAInClinicalModule();
		System.out.println("Verified user can verify all PAs in Clinical Module");
		Hooks.scenario.log("Verified user can verify all PAs in Clinical Module");

	}

	@And("the user should be able to view PA All PA in Clinical Module test")
	public void theUserShouldBeAbleToViewAllPAInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		System.out.println("Verified user can view all PAs in Clinical Module");
		Hooks.scenario.log("Verified user can view all PAs in Clinical Module");

	}

	@And("the user should not be able to add or edit RPM Trigger Alert for Time in Clinical Module test")
	public void userShouldNotBeAbleToAddOrEditRPMTriggerAlertForTimeInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.userCannotAddOrEditRPMTriggerAlertForTimeInClinicalModule();
		System.out.println("Verified user cannot add or edit RPM Trigger Alert for Time in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or edit RPM Trigger Alert for Time in Clinical Module");

	}

	@And("I create a profile with Delete access only to RPM Trigger Alert for Time in Clinical Module test")
	public void iCreateAProfileWithDeleteAccessOnlyToRpmTriggerAlertForTimeInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createDeleteOnlyProfileForRpmTriggerAlertForTime();
		clinicalPage.clickSubmitButton();
		System.out.println("Verified profile has Delete-only access to RPM Trigger Alert for Time in Clinical Module");
		Hooks.scenario.log("Verified profile has Delete-only access to RPM Trigger Alert for Time in Clinical Module");

	}

	@And("the user should be able to edit RPM Trigger Alert for Time in Clinical Module test")
	public void userShouldBeAbleToEditRpmTriggerAlertForTimeInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.canEditRpmTriggerAlertForTimeInClinicalModule();
		System.out.println("Verified user can edit RPM Trigger Alert for Time in Clinical Module");
		Hooks.scenario.log("Verified user can edit RPM Trigger Alert for Time in Clinical Module");

	}

	@And("the user should not be able to add or delete RPM Trigger Alert for Time in Clinical Module test")
	public void verifyUserCannotAddOrDeleteRPMTriggerAlertForTimeInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.userShouldNotBeAbleToAddOrDeleteRPMTriggerAlertForTimeInClinicalModule();
		System.out.println("Verified user cannot add or delete RPM Trigger Alert for Time in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or delete RPM Trigger Alert for Time in Clinical Module");

	}

	@And("I create a profile with Edit access only to RPM Trigger Alert for Time in Clinical Module test")
	public void createProfileWithEditAccessOnlyForRpmTriggerAlertForTimeInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.givenProfileHasEditAccessOnlyForRpmTriggerAlertForTime();
		clinicalPage.clickSubmitButton();
		System.out.println("Verified profile has Edit-only access to RPM Trigger Alert for Time in Clinical Module");
		Hooks.scenario.log("Verified profile has Edit-only access to RPM Trigger Alert for Time in Clinical Module");

	}

	@And("the user should not be able to edit or delete RPM Trigger Alert for Time in Clinical Module test")
	public void userShouldNotBeAbleToEditOrDeleteRpmTriggerAlertForTimeInClinicalModule() {
		clinicalPage.cannotEditOrDeleteRpmTriggerAlertForTimeInClinicalModule();
		System.out.println("Verified user cannot edit or delete RPM Trigger Alert for Time in Clinical Module");
		Hooks.scenario.log("Verified user cannot edit or delete RPM Trigger Alert for Time in Clinical Module");

	}

	@And("the user should be able to add RPM Trigger Alert for Time in Clinical Module test")
	public void userShouldBeAbleToAddRpmTriggerAlertForTimeInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.canAddRpmTriggerAlertForTimeInClinicalModule();
		System.out.println("Verified user can add RPM Trigger Alert for Time in Clinical Module");
		Hooks.scenario.log("Verified user can add RPM Trigger Alert for Time in Clinical Module");

	}

	@And("I create a profile with Add access only to RPM Trigger Alert for Time in Clinical Module test")
	public void createProfileWithAddAccessOnlyForRpmTriggerAlertForTimeInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.givenProfileHasAddAccessOnlyForRpmTriggerAlertForTime();
		clinicalPage.clickSubmitButton();
		System.out.println("Verified profile has Add-only access to RPM Trigger Alert for Time in Clinical Module");
		Hooks.scenario.log("Verified profile has Add-only access to RPM Trigger Alert for Time in Clinical Module");

	}

	// RPM / External Details for Alert
	@And("I create a profile with Delete access only to RPM External Details for Alert in Clinical Module test")
	public void createProfileWithDeleteAccessOnlyForRpmExternalDetailsForAlertInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.givenProfileHasDeleteAccessOnlyForRpmExternalDetailsForAlert();
		clinicalPage.clickSubmitButton();
		System.out.println(
				"Verified profile has Delete-only access to RPM External Details for Alert in Clinical Module");
		Hooks.scenario
				.log("Verified profile has Delete-only access to RPM External Details for Alert in Clinical Module");

	}

	@And("the user should be able to delete RPM External Details for Alert in Clinical Module test")
	public void userShouldBeAbleToDeleteRpmExternalDetailsForAlertInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.canDeleteRpmExternalDetailsForAlertInClinicalModule();
		System.out.println("Verified user can delete RPM External Details for Alert in Clinical Module");
		Hooks.scenario.log("Verified user can delete RPM External Details for Alert in Clinical Module");

	}

	@And("the user should not be able to add or delete RPM External Details for Alert in Clinical Module test")
	public void userShouldNotBeAbleToAddOrDeleteRpmExternalDetailsForAlertInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.verifyUserCannotAddOrDeleteRPMExternalDetailsForAlert();
		System.out.println("Verified user cannot add or delete RPM External Details for Alert in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or delete RPM External Details for Alert in Clinical Module");

	}

	@And("the user should not be able to add or edit RPM External Details for Alert in Clinical Module test")
	public void userShouldNotBeAbleToAddOrEditRpmExternalDetailsForAlertInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.cannotAddOrEditRpmExternalDetailsForAlertInClinicalModule();
		System.out.println("Verified user cannot add or edit RPM External Details for Alert in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or edit RPM External Details for Alert in Clinical Module");

	}

	@And("the user should be able to edit RPM External Details for Alert in Clinical Module test")
	public void userShouldBeAbleToEditRpmExternalDetailsForAlertInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.verifyUserCanEditRPMExternalDetailsForAlert();
		System.out.println("Verified user can edit RPM External Details for Alert in Clinical Module");
		Hooks.scenario.log("Verified user can edit RPM External Details for Alert in Clinical Module");

	}

	@And("I create a profile with Edit access only to RPM External Details for Alert in Clinical Module test")
	public void createProfileWithEditAccessOnlyForRpmExternalDetailsForAlertInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.givenProfileHasEditAccessOnlyForRpmExternalDetailsForAlert();
		clinicalPage.clickSubmitButton();
		System.out
				.println("Verified profile has Edit-only access to RPM External Details for Alert in Clinical Module");
		Hooks.scenario
				.log("Verified profile has Edit-only access to RPM External Details for Alert in Clinical Module");

	}

	@And("I create a profile with Add access only to RPM External Details for Alert in Clinical Module test")
	public void createProfileWithAddAccessOnlyForRpmExternalDetailsForAlertInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.givenProfileHasNoEditAccessForRpmRmpDetails();
		clinicalPage.clickSubmitButton();
		System.out.println("Verified profile has Add-only access to RPM External Details for Alert in Clinical Module");
		Hooks.scenario.log("Verified profile has Add-only access to RPM External Details for Alert in Clinical Module");

	}

	@And("the user should not be able to edit or delete RPM External Details for Alert in Clinical Module test")
	public void userShouldNotBeAbleToEditOrDeleteRpmExternalDetailsForAlertInClinicalModule() {
		clinicalPage.cannotEditOrDeleteRpmExternalDetailsForAlertInClinicalModule();
		System.out.println("Verified user cannot edit or delete RPM External Details for Alert in Clinical Module");
		Hooks.scenario.log("Verified user cannot edit or delete RPM External Details for Alert in Clinical Module");

	}

	@And("the user should be able to add RPM External Details for Alert in Clinical Module test")
	public void userShouldBeAbleToAddRpmExternalDetailsForAlertInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.verifyUserCanAddRPMExternalDetailsForAlert();
		System.out.println("Verified user can add RPM External Details for Alert in Clinical Module");
		Hooks.scenario.log("Verified user can add RPM External Details for Alert in Clinical Module");

	}

	// RPM / RMP Details
	@And("I create a profile with no Edit access to RPM RMP Details in Clinical Module test")
	public void createProfileWithNoEditAccessForRpmRmpDetailsInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.givenProfileHasNoEditAccessForRpmRmpDetails();
		clinicalPage.clickSubmitButton();
		System.out.println("Verified profile has no Edit access to RPM RMP Details in Clinical Module");
		Hooks.scenario.log("Verified profile has no Edit access to RPM RMP Details in Clinical Module");

	}

	@And("I create a profile with Edit access only to RPM RMP Details in Clinical Module test")
	public void createProfileWithEditAccessOnlyForRpmRmpDetailsInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.givenProfileHasEditAccessOnlyForRpmRmpDetails();
		clinicalPage.clickSubmitButton();
		System.out.println("Verified profile has Edit-only access to RPM RMP Details in Clinical Module");
		Hooks.scenario.log("Verified profile has Edit-only access to RPM RMP Details in Clinical Module");

	}

	// RPM / Remote Monitoring Parameter
	@And("I create a profile with Delete access only to RPM Remote Monitoring Parameter in Clinical Module test")
	public void createProfileWithDeleteAccessOnlyForRpmRemoteMonitoringParameterInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.givenProfileHasDeleteAccessOnlyForRpmRemoteMonitoringParameter();
		clinicalPage.clickSubmitButton();
		System.out.println(
				"Verified profile has Delete-only access to RPM Remote Monitoring Parameter in Clinical Module");
		Hooks.scenario
				.log("Verified profile has Delete-only access to RPM Remote Monitoring Parameter in Clinical Module");

	}

	@And("I create a profile with Edit access only to RPM Remote Monitoring Parameter in Clinical Module test")
	public void createProfileWithEditAccessOnlyForRpmRemoteMonitoringParameterInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.givenProfileHasEditAccessOnlyForRpmRemoteMonitoringParameter();
		clinicalPage.clickSubmitButton();
		System.out
				.println("Verified profile has Edit-only access to RPM Remote Monitoring Parameter in Clinical Module");
		Hooks.scenario
				.log("Verified profile has Edit-only access to RPM Remote Monitoring Parameter in Clinical Module");

	}

	@And("the user should be able to add RPM Remote Monitoring Parameter in Clinical Module test")
	public void userShouldBeAbleToAddRpmRemoteMonitoringParameterInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.canAddRpmRemoteMonitoringParameterInClinicalModule();
		System.out.println("Verified user can add RPM Remote Monitoring Parameter in Clinical Module");
		Hooks.scenario.log("Verified user can add RPM Remote Monitoring Parameter in Clinical Module");

	}

	@And("the user should not be able to edit RPM RMP Details in Clinical Module test")
	public void userShouldNotBeAbleToEditRpmRmpDetailsInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		clinicalPage.userShouldNotBeAbleToEditRPMRMPDetailsInClinicalModule();
		System.out.println("Verified user cannot edit RPM RMP Details in Clinical Module");
		Hooks.scenario.log("Verified user cannot edit RPM RMP Details in Clinical Module");

	}

	@And("the user should be able to edit RPM RMP Details in Clinical Module test")
	public void userShouldBeAbleToEditRpmRmpDetailsInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		clinicalPage.canEditRpmRmpDetailsInClinicalModule();
		System.out.println("Verified user can edit RPM RMP Details in Clinical Module");
		Hooks.scenario.log("Verified user can edit RPM RMP Details in Clinical Module");

	}

	@And("the user should not have access to Add or Delete RPM RMP Details in Clinical Module test")
	public void userShouldNotHaveAccessToAddOrDeleteRpmRmpDetailsInClinicalModule() {
		clinicalPage.userShouldNotHaveAccessToAddOrDeleteRPMRMPDetailsInClinicalModule();
		System.out.println("Verified user cannot add or delete RPM RMP Details in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or delete RPM RMP Details in Clinical Module");

	}

	@And("the user should be able to delete RPM Remote Monitoring Parameter in Clinical Module test")
	public void userShouldBeAbleToDeleteRpmRemoteMonitoringParameterInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.canDeleteRpmRemoteMonitoringParameterInClinicalModule();
		System.out.println("Verified user can delete RPM Remote Monitoring Parameter in Clinical Module");
		Hooks.scenario.log("Verified user can delete RPM Remote Monitoring Parameter in Clinical Module");

	}

	@And("the user should not be able to add or edit RPM Remote Monitoring Parameter in Clinical Module test")
	public void userShouldNotBeAbleToAddOrEditRpmRemoteMonitoringParameterInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.cannotAddOrEditRpmRemoteMonitoringParameterInClinicalModule();
		System.out.println("Verified user cannot add or edit RPM Remote Monitoring Parameter in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or edit RPM Remote Monitoring Parameter in Clinical Module");

	}

	@And("the user should be able to edit RPM Remote Monitoring Parameter in Clinical Module test")
	public void userShouldBeAbleToEditRpmRemoteMonitoringParameterInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.canEditRpmRemoteMonitoringParameterInClinicalModule();
		System.out.println("Verified user can edit RPM Remote Monitoring Parameter in Clinical Module");
		Hooks.scenario.log("Verified user can edit RPM Remote Monitoring Parameter in Clinical Module");

	}

	@And("the user should not be able to add or delete RPM Remote Monitoring Parameter in Clinical Module test")
	public void userShouldNotBeAbleToAddOrDeleteRpmRemoteMonitoringParameterInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.cannotAddOrDeleteRpmRemoteMonitoringParameterInClinicalModule();
		System.out.println("Verified user cannot add or delete RPM Remote Monitoring Parameter in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or delete RPM Remote Monitoring Parameter in Clinical Module");

	}

	@And("the user should not be able to edit or delete RPM Remote Monitoring Parameter in Clinical Module test")
	public void userShouldNotBeAbleToEditOrDeleteRpmRemoteMonitoringParameterInClinicalModule() {
		clinicalPage.cannotEditOrDeleteRpmRemoteMonitoringParameterInClinicalModule();
		System.out.println("Verified user cannot edit or delete RPM Remote Monitoring Parameter in Clinical Module");
		Hooks.scenario.log("Verified user cannot edit or delete RPM Remote Monitoring Parameter in Clinical Module");

	}

	@And("I create a profile with Add access only to RPM Remote Monitoring Parameter in Clinical Module test")
	public void createProfileWithAddOnlyAccessToRpmRemoteMonitoringParameterInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.givenProfileHasAddAccessOnlyForRpmRemoteMonitoringParameter();
		clinicalPage.clickSubmitButton();
		System.out
				.println("Verified profile has Add-only access to RPM Remote Monitoring Parameter in Clinical Module");
		Hooks.scenario
				.log("Verified profile has Add-only access to RPM Remote Monitoring Parameter in Clinical Module");

	}

	// Remote Patient Monitoring (RPM)
	@And("I create a profile with Export Excel and Outgoing Call access in Clinical Module test")
	public void iCreateAProfileWithExportExcelAndOutgoingCallAccessInClinicalModuleTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.iCreateAProfileWithExportExcelAndOutgoingCallPermissionsInClinicalModuleTest();
		clinicalPage.clickSubmitButton();
		System.out.println("Verified profile has Export Excel and Outgoing Call access in Clinical Module");
		Hooks.scenario.log("Verified profile has Export Excel and Outgoing Call access in Clinical Module");

	}

	@And("I create a profile with Delete access only to Remote Patient Monitoring RPM in Clinical Module test")
	public void verifyUserHasDeleteAccessToRemotePatientMonitoringInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.userShouldHaveDeleteAccessToRemotePatientMonitoringInClinicalModule();
		clinicalPage.clickSubmitButton();
		System.out.println(
				"Verified profile has Delete-only access to Remote Patient Monitoring (RPM) in Clinical Module");
		Hooks.scenario
				.log("Verified profile has Delete-only access to Remote Patient Monitoring (RPM) in Clinical Module");

	}

	@And("I create a profile with Edit access only to Remote Patient Monitoring RPM in Clinical Module test")
	public void userShouldHaveEditAccessToRemotePatientMonitoringInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.verifyUserHasEditAccessToRemotePatientMonitoringInClinicalModule();
		clinicalPage.clickSubmitButton();
		System.out
				.println("Verified profile has Edit-only access to Remote Patient Monitoring (RPM) in Clinical Module");
		Hooks.scenario
				.log("Verified profile has Edit-only access to Remote Patient Monitoring (RPM) in Clinical Module");

	}

	@And("the user should not be able to edit or delete Remote Patient Monitoring RPM in Clinical Module test")
	public void userShouldNotBeAbleToEditOrDeleteRemotePatientMonitoringInClinicalModule() {
		clinicalPage.userShouldNotBeAbleToEditOrDeleteRemotePatientMonitoringRPMInClinicalModule();
		System.out.println("Verified user cannot edit or delete Remote Patient Monitoring (RPM) in Clinical Module");
		Hooks.scenario.log("Verified user cannot edit or delete Remote Patient Monitoring (RPM) in Clinical Module");

	}

	@And("the user should not be able to add or delete Remote Patient Monitoring RPM in Clinical Module test")
	public void userShouldNotBeAbleToAddOrDeleteRemotePatientMonitoringInClinicalModule() {
		clinicalPage.userShouldNotBeAbleToAddOrDeleteRemotePatientMonitoringRPMInClinicalModule();
		System.out.println("Verified user cannot add or delete Remote Patient Monitoring (RPM) in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or delete Remote Patient Monitoring (RPM) in Clinical Module");

	}

	@And("the user should not be able to add or edit Remote Patient Monitoring RPM in Clinical Module test")
	public void userShouldNotBeAbleToAddOrEditRemotePatientMonitoringRPMInClinicalModule() {
		clinicalPage.userShouldNotBeAbleToAddOrEditRemotePatientMonitoringRPMInClinicalModule();
		System.out.println("Verified user cannot add or edit Remote Patient Monitoring (RPM) in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or edit Remote Patient Monitoring (RPM) in Clinical Module");

	}

	@And("the user should be able to make Outgoing Calls in Clinical Module test")
	public void userShouldBeAbleToMakeOutgoingCallsInClinicalModuleTest() {
		clinicalPage.userShouldBeAbleToMakeOutgoingCallsInClinicalModule();
		System.out.println("Verified user can make Outgoing Calls in Clinical Module");
		Hooks.scenario.log("Verified user can make Outgoing Calls in Clinical Module");

	}

	@And("the user should be able to export data to Excel in Clinical Module test")
	public void userShouldBeAbleToExportDataToExcelInClinicalModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.userShouldBeAbleToExportDataToExcelInClinicalModule();
		System.out.println("Verified user can export data to Excel in Clinical Module");
		Hooks.scenario.log("Verified user can export data to Excel in Clinical Module");

	}

	@And("the user should be able to delete Remote Patient Monitoring RPM in Clinical Module test")
	public void verifyUserCanDeleteRemotePatientMonitoringInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.userShouldBeAbleToDeleteRemotePatientMonitoringRPMInClinicalModule();
		System.out.println("Verified user can delete Remote Patient Monitoring (RPM) in Clinical Module");
		Hooks.scenario.log("Verified user can delete Remote Patient Monitoring (RPM) in Clinical Module");

	}

	@And("the user should be able to edit Remote Patient Monitoring RPM in Clinical Module test")
	public void userShouldBeAbleToEditRemotePatientMonitoringInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.userShouldBeAbleToEditRemotePatientMonitoringRPMInClinicalModule();
		System.out.println("Verified user can edit Remote Patient Monitoring (RPM) in Clinical Module");
		Hooks.scenario.log("Verified user can edit Remote Patient Monitoring (RPM) in Clinical Module");

	}

	@And("the user should be able to add Remote Patient Monitoring RPM in Clinical Module test")
	public void userShouldBeAbleToAddRemotePatientMonitoringInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmUrl = Hooks.prop.getProperty("rpmUrl");
		Assert.assertNotNull("rpmUrl is missing in config", rpmUrl);
		String fullRpmUrl = baseUrl + rpmUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRpmUrl);
		Assert.assertTrue("Remote Patient Monitoring page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/PatientRemoteMonitorings"));
		clinicalPage.userShouldBeAbleToAddRemotePatientMonitoringRPMInClinicalModule();
		System.out.println("Verified user can add Remote Patient Monitoring (RPM) in Clinical Module");
		Hooks.scenario.log("Verified user can add Remote Patient Monitoring (RPM) in Clinical Module");

	}

	@And("I create a profile with Add access only to Remote Patient Monitoring RPM in Clinical Module test")
	public void verifyUserHasAddAccessToRemotePatientMonitoringInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.userShouldHaveAddAccessToRemotePatientMonitoringInClinicalModule();
		clinicalPage.clickSubmitButton();
		System.out
				.println("Verified profile has Add-only access to Remote Patient Monitoring (RPM) in Clinical Module");
		Hooks.scenario
				.log("Verified profile has Add-only access to Remote Patient Monitoring (RPM) in Clinical Module");

	}

	// Reports / MTM Encounter Log
	@And("the user should be able to view Details for Reports MTM Encounter Log in Clinical Module test")
	public void userShouldBeAbleToViewDetailsForReportsMTMEncounterLogInClinicalModule() {
		clinicalPage.userShouldBeAbleToViewDetailsForReportsMTMEncounterLogInClinicalModule();
		System.out.println("Verified user can view Details for Reports MTM Encounter Log in Clinical Module");
		Hooks.scenario.log("Verified user can view Details for Reports MTM Encounter Log in Clinical Module");

	}

	@And("the user should be able to export Reports MTM Encounter Log to Excel in Clinical Module test")
	public void userShouldBeAbleToExportReportsMTMEncounterLogToExcelInClinicalModule() {
		clinicalPage.userShouldBeAbleToExportReportsMTMEncounterLogToExcelInClinicalModule();
		System.out.println("Verified user can export Reports MTM Encounter Log to Excel in Clinical Module");
		Hooks.scenario.log("Verified user can export Reports MTM Encounter Log to Excel in Clinical Module");

	}

	@And("the user should not have access to Export Excel or Details for Reports MTM Encounter Log in Clinical Module test")
	public void verifyUserCannotAccessExportOrDetailsForReportsMTMEncounterLogInClinicalModule() {
		clinicalPage.userShouldNotHaveAccessToExportExcelOrDetailsForReportsMTMEncounterLogInClinicalModule();
		System.out.println(
				"Verified user cannot access Export Excel or Details for Reports MTM Encounter Log in Clinical Module");
		Hooks.scenario.log(
				"Verified user cannot access Export Excel or Details for Reports MTM Encounter Log in Clinical Module");

	}

	@And("the user should be able to view Reports MTM Encounter Log in Clinical Module test")
	public void verifyUserCanViewReportsMTMEncounterLogInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String mtmEncounterLogUrl = Hooks.prop.getProperty("mtmEncounterLogUrl");
		Assert.assertNotNull("mtmEncounterLogUrl is missing in config", mtmEncounterLogUrl);
		String fullMtmEncounterLogUrl = baseUrl + mtmEncounterLogUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullMtmEncounterLogUrl);
		Assert.assertTrue("Reports MTM Encounter Log page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/MTMEncounterLog"));
		System.out.println("Verified user can view Reports MTM Encounter Log in Clinical Module");
		Hooks.scenario.log("Verified user can view Reports MTM Encounter Log in Clinical Module");

	}

	@And("I create a profile with View access only to Reports MTM Encounter Log in Clinical Module test")
	public void verifyUserHasViewAccessToReportsMTMEncounterLogInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.verifyUserHasViewAccessToReportsMTMEncounterLogInClinicalModule();
		clinicalPage.clickSubmitButton();
		System.out.println("Verified profile has View-only access to Reports MTM Encounter Log in Clinical Module");
		Hooks.scenario.log("Verified profile has View-only access to Reports MTM Encounter Log in Clinical Module");

	}

	@And("I create a profile with View, Export Excel, and Details access to Reports MTM Encounter Log in Clinical Module test")
	public void verifyUserCanViewExportExcelAndAccessDetailsForReportsMTMEncounterLogInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.verifyUserHasViewExportAndDetailsAccessForReportsMTMEncounterLog();
		clinicalPage.clickSubmitButton();
		System.out.println(
				"Verified profile has View, Export Excel, and Details access to Reports MTM Encounter Log in Clinical Module");
		Hooks.scenario.log(
				"Verified profile has View, Export Excel, and Details access to Reports MTM Encounter Log in Clinical Module");

	}

	// Med Recons / Current Medication
	@And("the user should not be able to add or edit Med Recons Current Medication in Clinical Module test")
	public void verifyUserCannotAddOrEditMedReconsCurrentMedicationInClinicalModule() {
		clinicalPage.userShouldNotBeAbleToAddOrEditMedReconsCurrentMedicationInClinicalModule();
		System.out.println("Verified user cannot add or edit Med Recons Current Medication in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or edit Med Recons Current Medication in Clinical Module");

	}

	@And("the user should be able to delete Med Recons Current Medication in Clinical Module test")
	public void verifyUserCanDeleteMedReconsCurrentMedicationInClinicalModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalMedReconsUrl = Hooks.prop.getProperty("clinicalMedReconsUrl");
		Assert.assertNotNull("clinicalMedReconsUrl is missing in config", clinicalMedReconsUrl);
		String fullClinicalMedReconsUrl = baseUrl + clinicalMedReconsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullClinicalMedReconsUrl);
		Assert.assertTrue("Clinical Med Recons page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalMedRecons"));
		clinicalPage.userShouldBeAbleToDeleteMedReconsCurrentMedicationInClinicalModule();
		System.out.println("Verified user can delete Med Recons Current Medication in Clinical Module");
		Hooks.scenario.log("Verified user can delete Med Recons Current Medication in Clinical Module");

	}

	@And("I create a profile with Delete access only to Med Recons Current Medication in Clinical Module test")
	public void createProfileWithDeleteAccessOnlyToMedReconsCurrentMedicationInClinicalModuleTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithDeleteOnlyAccessForMedReconsCurrentMedicationTest();
		clinicalPage.clickSubmitButton();
		System.out
				.println("Verified profile has Delete-only access to Med Recons Current Medication in Clinical Module");
		Hooks.scenario
				.log("Verified profile has Delete-only access to Med Recons Current Medication in Clinical Module");

	}

	@And("the user should not be able to add or delete Med Recons Current Medication in Clinical Module test")
	public void verifyUserCannotAddOrDeleteMedReconsCurrentMedicationInClinicalModule() {
		clinicalPage.userShouldNotBeAbleToAddOrDeleteMedReconsCurrentMedicationInClinicalModule();
		System.out.println("Verified user cannot add or delete Med Recons Current Medication in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or delete Med Recons Current Medication in Clinical Module");

	}

	@And("the user should be able to edit Med Recons Current Medication in Clinical Module test")
	public void userShouldBeAbleToEditMedReconsCurrentMedicationInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalMedReconsUrl = Hooks.prop.getProperty("clinicalMedReconsUrl");
		Assert.assertNotNull("clinicalMedReconsUrl is missing in config", clinicalMedReconsUrl);
		String fullClinicalMedReconsUrl = baseUrl + clinicalMedReconsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullClinicalMedReconsUrl);
		Assert.assertTrue("Clinical Med Recons page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalMedRecons"));
		clinicalPage.userShouldBeAbleToEditMedReconsCurrentMedicationInClinicalModule();
		System.out.println("Verified user can edit Med Recons Current Medication in Clinical Module");
		Hooks.scenario.log("Verified user can edit Med Recons Current Medication in Clinical Module");

	}

	@And("I create a profile with Edit access only to Med Recons Current Medication in Clinical Module test")
	public void iCreateAProfileWithEditAccessOnlyToMedReconsCurrentMedicationInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithEditAccessForMedReconsCurrentMedication();
		clinicalPage.clickSubmitButton();
		System.out.println("Verified profile has Edit-only access to Med Recons Current Medication in Clinical Module");
		Hooks.scenario.log("Verified profile has Edit-only access to Med Recons Current Medication in Clinical Module");

	}

	@And("I create a profile with Add access only to Med Recons Current Medication in Clinical Module test")
	public void createProfileWithOnlyAddAccessToMedReconsCurrentMedicationInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.userCreatesProfileWithAddAccessOnlyToMedReconsCurrentMedication();
		clinicalPage.clickSubmitButton();
		System.out.println("Verified profile has Add-only access to Med Recons Current Medication in Clinical Module");
		Hooks.scenario.log("Verified profile has Add-only access to Med Recons Current Medication in Clinical Module");

	}

	@And("the user should not be able to edit or delete Med Recons Current Medication in Clinical Module test")
	public void userShouldNotBeAbleToEditOrDeleteMedReconsCurrentMedicationInClinicalModule() {
		clinicalPage.userShouldNotBeAbleToEditOrDeleteMedReconsCurrentMedicationInClinicalModule();
		System.out.println("Verified user cannot edit or delete Med Recons Current Medication in Clinical Module");
		Hooks.scenario.log("Verified user cannot edit or delete Med Recons Current Medication in Clinical Module");

	}

	@And("the user should be able to add Med Recons Current Medication in Clinical Module test")
	public void userShouldBeAbleToAddMedReconsCurrentMedicationInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalMedReconsUrl = Hooks.prop.getProperty("clinicalMedReconsUrl");
		Assert.assertNotNull("clinicalMedReconsUrl is missing in config", clinicalMedReconsUrl);
		String fullClinicalMedReconsUrl = baseUrl + clinicalMedReconsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullClinicalMedReconsUrl);
		Assert.assertTrue("Clinical Med Recons page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalMedRecons"));
		clinicalPage.userShouldBeAbleToAddMedReconsCurrentMedicationInClinicalModule();
		System.out.println("Verified user can add Med Recons Current Medication in Clinical Module");
		Hooks.scenario.log("Verified user can add Med Recons Current Medication in Clinical Module");

	}

	// Med Recons / Meds On Chart
	@And("the user should not be able to add or delete Med Recons Meds On Chart in Clinical Module test")
	public void userShouldNotBeAbleToAddOrDeleteMedReconsMedsOnChartInClinicalModule() {
		clinicalPage.verifyUserCannotAddOrDeleteMedReconsMedsOnChartInClinicalModule();
		System.out.println("Verified user cannot add or delete Med Recons Meds On Chart in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or delete Med Recons Meds On Chart in Clinical Module");

	}

	@And("the user should not be able to add or edit Med Recons Meds On Chart in Clinical Module test")
	public void userShouldNotBeAbleToAddOrEditMedReconsMedsOnChartInClinicalModule() {
		clinicalPage.userShouldNotBeAbleToAddOrEditMedReconsMedsOnChartInClinicalModule();
		System.out.println("Verified user cannot add or edit Med Recons Meds On Chart in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or edit Med Recons Meds On Chart in Clinical Module");

	}

	@And("the user should be able to delete Med Recons Meds On Chart in Clinical Module test")
	public void userShouldBeAbleToDeleteMedReconsMedsOnChartInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalMedReconsUrl = Hooks.prop.getProperty("clinicalMedReconsUrl");
		Assert.assertNotNull("clinicalMedReconsUrl is missing in config", clinicalMedReconsUrl);
		String fullClinicalMedReconsUrl = baseUrl + clinicalMedReconsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullClinicalMedReconsUrl);
		Assert.assertTrue("Clinical Med Recons page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalMedRecons"));
		clinicalPage.userShouldBeAbleToDeleteMedReconsMedsOnChartInClinicalModule();
		System.out.println("Verified user can delete Med Recons Meds On Chart in Clinical Module");
		Hooks.scenario.log("Verified user can delete Med Recons Meds On Chart in Clinical Module");

	}

	@And("the user should be able to edit Med Recons Meds On Chart in Clinical Module test")
	public void userShouldBeAbleToEditMedReconsMedsOnChartInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalMedReconsUrl = Hooks.prop.getProperty("clinicalMedReconsUrl");
		Assert.assertNotNull("clinicalMedReconsUrl is missing in config", clinicalMedReconsUrl);
		String fullClinicalMedReconsUrl = baseUrl + clinicalMedReconsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullClinicalMedReconsUrl);
		Assert.assertTrue("Clinical Med Recons page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalMedRecons"));
		clinicalPage.userShouldBeAbleToEditMedReconsMedsOnChartInClinicalModule();
		System.out.println("Verified user can edit Med Recons Meds On Chart in Clinical Module");
		Hooks.scenario.log("Verified user can edit Med Recons Meds On Chart in Clinical Module");

	}

	@And("I create a profile with Delete access only to Med Recons Meds On Chart in Clinical Module test")
	public void createProfileWithOnlyDeleteAccessToMedReconsMedsOnChartInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalProfileWithMedReconsMedsOnChartDeleteAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Verified profile has Delete-only access to Med Recons Meds On Chart in Clinical Module");
		Hooks.scenario.log("Verified profile has Delete-only access to Med Recons Meds On Chart in Clinical Module");

	}

	@And("I create a profile with Edit access only to Med Recons Meds On Chart in Clinical Module test")
	public void createProfileWithOnlyEditAccessToMedReconsMedsOnChartInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalProfileWithMedReconsMedsOnChartEditAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Verified profile has Edit-only access to Med Recons Meds On Chart in Clinical Module");
		Hooks.scenario.log("Verified profile has Edit-only access to Med Recons Meds On Chart in Clinical Module");

	}

	@And("the user should not be able to edit or delete Med Recons Meds On Chart in Clinical Module test")
	public void userShouldNotBeAbleToEditOrDeleteMedReconsMedsOnChartInClinicalModule() {
		clinicalPage.userShouldNotBeAbleToEditOrDeleteMedReconsMedsOnChartInClinicalModule();
		System.out.println("Verified user cannot edit or delete Med Recons Meds On Chart in Clinical Module");
		Hooks.scenario.log("Verified user cannot edit or delete Med Recons Meds On Chart in Clinical Module");

	}

	@And("the user should be able to add Med Recons Meds On Chart in Clinical Module test")
	public void userShouldBeAbleToAddMedReconsMedsOnChartInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalMedReconsUrl = Hooks.prop.getProperty("clinicalMedReconsUrl");
		Assert.assertNotNull("clinicalMedReconsUrl is missing in config", clinicalMedReconsUrl);
		String fullClinicalMedReconsUrl = baseUrl + clinicalMedReconsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullClinicalMedReconsUrl);
		Assert.assertTrue("Clinical Med Recons page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalMedRecons"));
		clinicalPage.userShouldBeAbleToAddMedReconsMedsOnChartInClinicalModule();
		System.out.println("Verified user can add Med Recons Meds On Chart in Clinical Module");
		Hooks.scenario.log("Verified user can add Med Recons Meds On Chart in Clinical Module");

	}

	@And("I create a profile with Add access only to Med Recons Meds On Chart in Clinical Module test")
	public void createProfileWithOnlyAddAccessToMedReconsMedsOnChartInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalProfileWithMedReconsMedsOnChartAddAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Verified profile has Add-only access to Med Recons Meds On Chart in Clinical Module");
		Hooks.scenario.log("Verified profile has Add-only access to Med Recons Meds On Chart in Clinical Module");

	}

	// Med Recons
	@And("the user should be able to access Download File in Clinical Module test")
	public void userShouldBeAbleToAccessDownloadFileInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalMedReconsUrl = Hooks.prop.getProperty("clinicalMedReconsUrl");
		Assert.assertNotNull("clinicalMedReconsUrl is missing in config", clinicalMedReconsUrl);
		String fullClinicalMedReconsUrl = baseUrl + clinicalMedReconsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullClinicalMedReconsUrl);
		Assert.assertTrue("Clinical Med Recons page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalMedRecons"));
		clinicalPage.userShouldBeAbleToAccessDownloadFileInClinicalModule();
		System.out.println("Verified user can access Download File in Clinical Module");
		Hooks.scenario.log("Verified user can access Download File in Clinical Module");

	}

	@And("I create a profile with access only to Download File in Clinical Module test")
	public void createProfileWithDownloadFileAccessOnlyInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalProfileWithDownloadFileAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Verified user can access Download File in Clinical Module");
		Hooks.scenario.log("Verified user can access Download File in Clinical Module");

	}

	@And("the user should not be able to add or edit Med Recons in Clinical Module test")
	public void userShouldNotBeAbleToAddOrEditMedReconsInClinicalModule() {
		clinicalPage.userShouldNotBeAbleToAddOrEditMedReconsInClinicalModule();
		System.out.println("Verified user cannot add or edit Med Recons in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or edit Med Recons in Clinical Module");

	}

	@And("the user should be able to delete Med Recons in Clinical Module test")
	public void userShouldBeAbleToDeleteMedReconsInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalMedReconsUrl = Hooks.prop.getProperty("clinicalMedReconsUrl");
		Assert.assertNotNull("clinicalMedReconsUrl is missing in config", clinicalMedReconsUrl);
		String fullClinicalMedReconsUrl = baseUrl + clinicalMedReconsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullClinicalMedReconsUrl);
		Assert.assertTrue("Clinical Med Recons page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalMedRecons"));
		clinicalPage.userShouldBeAbleToDeleteMedReconsInClinicalModule();
		System.out.println("Verified user can delete Med Recons in Clinical Module");
		Hooks.scenario.log("Verified user can delete Med Recons in Clinical Module");

	}

	@And("I create a profile with Delete access only to Med Recons in Clinical Module test")
	public void createProfileWithOnlyDeleteAccessToMedReconsInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalProfileWithMedReconsDeleteAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Verified profile has Delete-only access to Med Recons in Clinical Module");
		Hooks.scenario.log("Verified profile has Delete-only access to Med Recons in Clinical Module");

	}

	@And("I create a profile with Add access only to Med Recons in Clinical Module test")
	public void createProfileWithOnlyAddAccessToMedReconsInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalProfileWithMedReconsAddAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Verified profile has Add-only access to Med Recons in Clinical Module");
		Hooks.scenario.log("Verified profile has Add-only access to Med Recons in Clinical Module");

	}

	@And("the user should be able to add Med Recons in Clinical Module test")
	public void userShouldBeAbleToAddMedReconsInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalMedReconsUrl = Hooks.prop.getProperty("clinicalMedReconsUrl");
		Assert.assertNotNull("clinicalMedReconsUrl is missing in config", clinicalMedReconsUrl);
		String fullClinicalMedReconsUrl = baseUrl + clinicalMedReconsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullClinicalMedReconsUrl);
		Assert.assertTrue("Clinical Med Recons page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalMedRecons"));
		clinicalPage.userShouldBeAbleToAddMedReconsInClinicalModule();
		System.out.println("Verified user can add Med Recons in Clinical Module");
		Hooks.scenario.log("Verified user can add Med Recons in Clinical Module");

	}

	@And("the user should not be able to edit or delete Med Recons in Clinical Module test")
	public void userShouldNotBeAbleToEditOrDeleteMedReconsInClinicalModule() {
		clinicalPage.userShouldNotBeAbleToEditOrDeleteMedReconsInClinicalModule();
		System.out.println("Verified user cannot edit or delete Med Recons in Clinical Module");
		Hooks.scenario.log("Verified user cannot edit or delete Med Recons in Clinical Module");

	}

	// Prior Authorization
	@And("the user should be able to Export Excel in Clinical Module test")
	public void userShouldBeAbleToExportExcelInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		clinicalPage.userShouldBeAbleToExportExcelInClinicalModule();
		System.out.println("Verified user can Export Excel in Clinical Module");
		Hooks.scenario.log("Verified user can Export Excel in Clinical Module");

	}

	@And("the user should be able to access Details in Clinical Module test")
	public void userShouldBeAbleToAccessDetailsInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		clinicalPage.userShouldBeAbleToAddMedReconsInClinicalModule();
		System.out.println("Verified user can access Details in Clinical Module");
		Hooks.scenario.log("Verified user can access Details in Clinical Module");

	}

	@And("the user should be able to Archive in Clinical Module test")
	public void userShouldBeAbleToArchiveInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		clinicalPage.userShouldBeAbleToArchiveInClinicalModule();
		System.out.println("Verified user can Archive in Clinical Module");
		Hooks.scenario.log("Verified user can Archive in Clinical Module");

	}

	@And("the user should be able to Unarchive in Clinical Module test")
	public void userShouldBeAbleToUnarchiveInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		clinicalPage.userShouldBeAbleToUnarchiveInClinicalModule();
		System.out.println("Verified user can Unarchive in Clinical Module");
		Hooks.scenario.log("Verified user can Unarchive in Clinical Module");

	}

	@And("the user should be able to view Grid View in Clinical Module test")
	public void userShouldBeAbleToViewGridViewInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		System.out.println("Verified user can view Grid View in Clinical Module");
		Hooks.scenario.log("Verified user can view Grid View in Clinical Module");

	}

	@And("the user should not be able to add or edit Prior Authorization in Clinical Module test")
	public void userShouldNotBeAbleToAddOrEditPriorAuthorizationInClinicalModule() {
		clinicalPage.verifyUserCannotAddOrEditPriorAuthorizationInClinicalModule();
		System.out.println("Verified user cannot add or edit Prior Authorization in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or edit Prior Authorization in Clinical Module");

	}

	@And("the user should be able to delete Prior Authorization in Clinical Module test")
	public void userShouldBeAbleToDeletePriorAuthorizationInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		clinicalPage.deletePriorAuthorizationInClinicalModule();
		System.out.println("Verified user can delete Prior Authorization in Clinical Module");
		Hooks.scenario.log("Verified user can delete Prior Authorization in Clinical Module");

	}

	@And("I create a profile with full Acess to Prior Authorization in Clinical Module test")
	public void createProfileWithFullAccessToPriorAuthorizationInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalProfileWithFullPriorAuthorizationAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Verified user has full access to Prior Authorization in Clinical Module");
		Hooks.scenario.log("Verified user has full access to Prior Authorization in Clinical Module");

	}

	@And("I create a profile with Delete access only to Prior Authorization in Clinical Module test")
	public void createProfileWithOnlyDeleteAccessToPriorAuthorizationInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalProfileWithPriorAuthorizationDeleteAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Verified user has Delete access only to Prior Authorization in Clinical Module");
		Hooks.scenario.log("Verified user has Delete access only to Prior Authorization in Clinical Module");

	}

	@And("I create a profile with Edit access only to Prior Authorization in Clinical Module test")
	public void createProfileWithOnlyEditAccessToPriorAuthorizationInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.userCreatesProfileWithPriorAuthorizationEditAccessOnly();
		clinicalPage.clickSubmitButton();
		System.out.println("Verified user has Edit access only to Prior Authorization in Clinical Module");
		Hooks.scenario.log("Verified user has Edit access only to Prior Authorization in Clinical Module");

	}

	@And("the user should be able to edit Prior Authorization in Clinical Module test")
	public void userShouldBeAbleToEditPriorAuthorizationInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		clinicalPage.verifyUserCanEditPriorAuthorizationInClinicalModule();
		System.out.println("Verified user can edit Prior Authorization in Clinical Module");
		Hooks.scenario.log("Verified user can edit Prior Authorization in Clinical Module");


	}

	@And("the user should not be able to add or delete Prior Authorization in Clinical Module test")
	public void userShouldNotBeAbleToAddOrDeletePriorAuthorizationInClinicalModule() {
		clinicalPage.verifyUserCannotAddOrDeletePriorAuthorizationInClinicalModule();
		System.out.println("Verified user cannot add or delete Prior Authorization in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or delete Prior Authorization in Clinical Module");


	}

	@And("I create a profile with Add access only to Prior Authorization in Clinical Module test")
	public void createProfileWithOnlyAddAccessToPriorAuthorizationInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalProfileWithPriorAuthorizationAddAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Verified user has Add access only to Prior Authorization in Clinical Module");
		Hooks.scenario.log("Verified user has Add access only to Prior Authorization in Clinical Module");

	}

	@And("the user should be able to add Prior Authorization in Clinical Module test")
	public void userShouldBeAbleToAddPriorAuthorizationInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		clinicalPage.verifyUserCanAddPriorAuthorizationInClinicalModule();
		System.out.println("Verified user can add Prior Authorization in Clinical Module");
		Hooks.scenario.log("Verified user can add Prior Authorization in Clinical Module");

	}

	@And("the user should not be able to edit or delete Prior Authorization in Clinical Module test")
	public void userShouldNotBeAbleToEditOrDeletePriorAuthorizationInClinicalModule() {
		clinicalPage.verifyUserCannotEditOrDeletePriorAuthorizationInClinicalModule();
		System.out.println("Verified user cannot edit or delete Prior Authorization in Clinical Module");
		Hooks.scenario.log("Verified user cannot edit or delete Prior Authorization in Clinical Module");


	}

	// CareGiver Name
	@And("I create a profile with Delete access only to CareGiver Name in Clinical Module test")
	public void createProfileWithOnlyDeleteAccessToCareGiverNameInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalProfileWithCareGiverDeleteAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Verified user has Delete access only to CareGiver Name in Clinical Module");
		Hooks.scenario.log("Verified user has Delete access only to CareGiver Name in Clinical Module");

	}

	@And("I create a profile with Edit access only to CareGiver Name in Clinical Module test")
	public void createProfileWithEditAccessToCareGiverNameInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalProfileWithCareGiverEditAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Verified user has Edit access only to CareGiver Name in Clinical Module");
		Hooks.scenario.log("Verified user has Edit access only to CareGiver Name in Clinical Module");

	}

	@And("the user should be able to delete CareGiver Name in Clinical Module test")
	public void userShouldBeAbleToDeleteCareGiverNameInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientsUrl = Hooks.prop.getProperty("patientsUrl");
		Assert.assertNotNull("patientsUrl is missing in config", patientsUrl);
		String fullPatientsUrl = baseUrl + patientsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullPatientsUrl);
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/Patients"));
		clinicalPage.deleteCareGiverNameInClinicalModule();
		System.out.println("Verified user can delete CareGiver Name in Clinical Module");
		Hooks.scenario.log("Verified user can delete CareGiver Name in Clinical Module");

	}

	@And("the user should not be able to add or edit CareGiver Name in Clinical Module test")
	public void userShouldNotBeAbleToAddOrEditCareGiverNameInClinicalModule() {
		clinicalPage.userShouldNotBeAbleToAddOrEditCareGiverNameInClinicalModule();
		System.out.println("Verified user cannot add or edit CareGiver Name in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or edit CareGiver Name in Clinical Module");


	}

	@And("the user should be able to edit CareGiver Name in Clinical Module test")
	public void userShouldBeAbleToEditCareGiverNameInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientsUrl = Hooks.prop.getProperty("patientsUrl");
		Assert.assertNotNull("patientsUrl is missing in config", patientsUrl);
		String fullPatientsUrl = baseUrl + patientsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullPatientsUrl);
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/Patients"));
		clinicalPage.verifyUserCanEditCareGiverNameInClinicalModule();
		System.out.println("Verified user can edit CareGiver Name in Clinical Module");
		Hooks.scenario.log("Verified user can edit CareGiver Name in Clinical Module");

	}

	@And("the user should not be able to add or delete CareGiver Name in Clinical Module test")
	public void userShouldNotBeAbleToAddOrDeleteCareGiverNameInClinicalModule() {
		clinicalPage.verifyUserCannotAddOrDeleteCareGiverNameInClinicalModule();
		System.out.println("Verified user cannot add or delete CareGiver Name in Clinical Module");
		Hooks.scenario.log("Verified user cannot add or delete CareGiver Name in Clinical Module");

	}

	@And("I create a profile with Add access only to CareGiver Name in Clinical Module test")
	public void createProfileWithAddAccessToCareGiverInClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalProfileWithCareGiverAddAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to add CareGiver Name in Clinical Module test")
	public void userShouldBeAbleToAddCareGiverNameInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientsUrl = Hooks.prop.getProperty("patientsUrl");
		Assert.assertNotNull("patientsUrl is missing in config", patientsUrl);
		String fullPatientsUrl = baseUrl + patientsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullPatientsUrl);
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/Patients"));
		Hooks.scenario.log("User is on the Patients page");
		clinicalPage.verifyUserCanAddCareGiverNameInClinicalModule();

	}

	@And("the user should not be able to edit or delete CareGiver Name in Clinical Module test")
	public void userShouldNotBeAbleToEditOrDeleteCareGiverNameInClinicalModule() {
		clinicalPage.userShouldNotBeAbleToEditOrDeleteCareGiverNameInClinicalModule();

	}

	// Patient / Provider Referral
	@And("the user should be able to view Patient Provider Referral in Clinical Module test")
	public void userShouldBeAbleToViewPatientProviderReferralInClinicalModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientsUrl = Hooks.prop.getProperty("patientsUrl");
		Assert.assertNotNull("patientsUrl is missing in config", patientsUrl);
		String fullPatientsUrl = baseUrl + patientsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullPatientsUrl);
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/Patients"));
		Hooks.scenario.log("User is on the Patients page");
		clinicalPage.verifyUserCanViewPatientProviderReferralInClinicalModule();

	}

	@And("the user should not be able to refer to a new provider in Patient Provider Referral in Clinical Module test")
	public void userShouldNotBeAbleToReferToNewProviderInPatientProviderReferralInClinicalModuleTest() {
		clinicalPage.verifyUserCannotReferToNewProviderInPatientProviderReferralInClinicalModule();

	}

	@And("the user should be able to refer to a new provider in Patient Provider Referral in Clinical Module test")
	public void userShouldBeAbleToReferToNewProviderInPatientProviderReferralInClinicalModuleTest() {
		clinicalPage.verifyUserCanReferToNewProviderInPatientProviderReferralInClinicalModule();

	}

	@And("I create a profile with View but no Referred To New Provider access to Patient Provider Referral test")
	public void iCreateAProfileWithViewButNoReferredToNewProviderAccessToPatientProviderReferralTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithViewOnlyAccessToPatientProviderReferralTest();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Referred To New Provider access to Patient Provider Referral test")
	public void iCreateAProfileWithViewAndReferredToNewProviderAccessToPatientProviderReferralTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithViewAndReferredToNewProviderAccessForPatientProviderReferralTest();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	// Reports / Call Log
	@And("I create a profile with View but no Download File access to Reports Call Log test")
	public void iCreateAProfileWithViewButNoDownloadFileAccessToReportsCallLogTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithViewOnlyAccessToReportsCallLogTest();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Download File access to Reports Call Log test")
	public void createProfileWithViewAndDownloadFileAccessToReportsCallLogTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithViewAndDownloadAccessToReportsCallLogTest();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to view Reports Call Log in Reports Module test")
	public void userShouldBeAbleToViewReportsCallLogInReportsModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String callLogUrl = Hooks.prop.getProperty("callLogUrl");
		Assert.assertNotNull("callLogUrl is missing in config", callLogUrl);
		String fullCallLogUrl = baseUrl + callLogUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullCallLogUrl);
		Assert.assertTrue("Reports Call Log page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/CallLogs"));
		Hooks.scenario.log("User is on the RPM Status page");

	}

	@And("the user should not be able to download files from Reports Call Log in Reports Module test")
	public void verifyUserCannotDownloadFilesFromReportsCallLogInReportsModuleTest() {
		clinicalPage.verifyUserCannotDownloadFilesFromReportsCallLogInReportsModule();

	}

	@And("the user should be able to download files from Reports Call Log in Reports Module test")
	public void verifyUserCanDownloadFilesFromReportsCallLogInReportsModule() {
		clinicalPage.verifyUserCanDownloadFilesFromReportsCallLogInReportsModule();

	}

	// Reports / CCM Encounter Log
	@And("the user should not be able to download files from Reports CCM Encounter Log in Reports Module test")
	public void userShouldNotBeAbleToDownloadFilesFromReportsCCMEncounterLogInReportsModuleTest() {
		clinicalPage.verifyUserCannotDownloadFilesFromReportsCCMEncounterLogInReportsModule();

	}

	@And("I create a profile with View but no Download File access to Reports CCM Encounter Log test")
	public void createProfileWithViewButNoDownloadFileAccessToReportsCCMEncounterLogTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithViewOnlyAccessToReportsCCMEncounterLogTest();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Download File access to Reports CCM Encounter Log test")
	public void createProfileWithViewAndDownloadFileAccessToReportsCCMEncounterLogTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithViewAndDownloadAccessToReportsCCMEncounterLogTest();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to download files from Reports CCM Encounter Log in Reports Module test")
	public void verifyUserCanDownloadFilesFromReportsCCMEncounterLogInReportsModule() {
		clinicalPage.verifyUserCannotDownloadFilesFromReportsMedicationRecommendationAndSuggestionsInReportsModule();

	}

	@And("the user should be able to view Reports CCM Encounter Log in Reports Module test")
	public void userShouldBeAbleToViewReportsCCMEncounterLogInReportsModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String ccmEncounterLogUrl = Hooks.prop.getProperty("ccmEncounterLogUrl");
		Assert.assertNotNull("ccmEncounterLogUrl is missing in config", ccmEncounterLogUrl);
		String fullCcmEncounterLogUrl = baseUrl + ccmEncounterLogUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullCcmEncounterLogUrl);
		Assert.assertTrue("Reports CCM Encounter Log page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/CCMEncounterLog"));
		Hooks.scenario.log("User is on the RPM Status page");

	}

	// Reports / Medication Recommendation and Suggestions
	@And("the user should not be able to download files from Reports Medication Recommendation And Suggestions in Reports Module test")
	public void verifyUserCannotDownloadFilesFromReportsMedicationRecommendationAndSuggestionsInReportsModule() {
		clinicalPage.verifyUserCannotDownloadFilesFromReportsMedicationRecommendationAndSuggestionsInReportsModule();

	}

	@And("I create a profile with View but no Download File access to Reports Medication Recommendation And Suggestions test")
	public void iCreateAProfileWithViewAccessOnlyToReportsMedicationRecommendationAndSuggestionsTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage
				.iCreateAProfileWithViewButNoDownloadFileAccessToReportsMedicationRecommendationAndSuggestionsTest();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Download File access to Reports Medication Recommendation And Suggestions test")
	public void createProfileWithViewAndDownloadFileAccessToReportsMedicationRecommendationAndSuggestionsTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithViewAndDownloadAccessToReportsMedicationRecommendationAndSuggestionsTest();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to view Reports Medication Recommendation And Suggestions in Reports Module test")
	public void userShouldBeAbleToViewReportsMedicationRecommendationAndSuggestionsInReportsModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String medicationRecommendationUrl = Hooks.prop.getProperty("medicationRecommendationUrl");
		Assert.assertNotNull("medicationRecommendationUrl is missing in config", medicationRecommendationUrl);
		String fullMedicationRecommendationUrl = baseUrl + medicationRecommendationUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullMedicationRecommendationUrl);
		Assert.assertTrue("Reports Medication Recommendation page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/MedicationRecommendation"));
		Hooks.scenario.log("User is on the RPM Status page");

	}

	@And("the user should be able to download files from Reports Medication Recommendation And Suggestions in Reports Module test")
	public void verifyUserCanDownloadReportsMedicationRecommendationAndSuggestionsInReportsModule() {
		clinicalPage.verifyUserCanDownloadFilesFromReportsMedicationRecommendationAndSuggestionsInReportsModule();

	}

	// Reports / Status Log
	@And("I create a profile with View but no Download File access to Reports Status Log test")
	public void createProfileWithViewAccessWithoutDownloadToReportsStatusLog() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithViewOnlyAccessToReportsStatusLog();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Download File access to Reports Status Log test")
	public void createProfileWithViewAndDownloadFileAccessToReportsStatusLog() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithViewAndDownloadAccessForReportsStatusLog();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to view Reports Status Log in Reports Module test")
	public void userShouldBeAbleToViewReportsStatusLogInReportsModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reportsStatusLogUrl = Hooks.prop.getProperty("reportsStatusLogUrl");
		Assert.assertNotNull("reportsStatusLogUrl is missing in config", reportsStatusLogUrl);
		String fullReportsStatusLogUrl = baseUrl + reportsStatusLogUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullReportsStatusLogUrl);
		Assert.assertTrue("Reports Status Log page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/StatusLogs"));
		Hooks.scenario.log("User is on the RPM Status page");

	}

	@And("the user should not be able to download files from Reports Status Log in Reports Module test")
	public void userShouldNotBeAbleToDownloadFilesFromReportsStatusLogInReportsModule() {
		clinicalPage.verifyDownloadNotAvailable();

	}

	@And("the user should be able to download files from Reports Status Log in Reports Module test")
	public void userShouldBeAbleToDownloadFilesFromReportsStatusLogInReportsModule() {
		clinicalPage.downloadReportFromStatusLog();

	}

	// Patients / Clinical Encounter Review
	@And("I create a profile with No Access to Patients Clinical Encounter Review test")
	public void createProfileWithNoAccessToPatientsClinicalEncounterReview() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithNoAccessForPatientsClinicalEncounterReview();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and View Star1 Drug access to Patients Clinical Encounter Review test")
	public void createProfileWithViewAndViewStar1DrugAccessToPatientsClinicalEncounterReview() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithViewAndStar1DrugAccessForPatientsClinicalEncounterReview();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to view Patients Clinical Encounter Review in Clinical Module test")
	public void verifyUserCanViewPatientsClinicalEncounterReviewInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientsUrl = Hooks.prop.getProperty("patientsUrl");
		Assert.assertNotNull("patientsUrl is missing in config", patientsUrl);
		String fullPatientsUrl = baseUrl + patientsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullPatientsUrl);
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/Patients"));
		Hooks.scenario.log("User is on the Patients page");
		clinicalPage.viewFirstClinicalEncounterReview();

	}

	@And("the user should be able to view Star1 Drug in Patients Clinical Encounter Review in Clinical Module test")
	public void userShouldBeAbleToViewStar1DrugInPatientsClinicalEncounterReviewInClinicalModule() {
		clinicalPage.verifyStar1DrugIsVisible();

	}

	@And("the user should not be able to access Patients Clinical Encounter Review in Clinical Module test")
	public void userShouldNotBeAbleToAccessPatientsClinicalEncounterReviewInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientsUrl = Hooks.prop.getProperty("patientsUrl");
		Assert.assertNotNull("patientsUrl is missing in config", patientsUrl);
		String fullPatientsUrl = baseUrl + patientsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullPatientsUrl);
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/Patients"));
		Hooks.scenario.log("User is on the Patients page");
		clinicalPage.verifyUserCannotAccessPatientsClinicalEncounterReviewInClinicalModule();

	}

	// Patients / Clinical Encounter
	@And("I create a profile with Delete access only to Patients Clinical Encounter test")
	public void createProfileWithDeleteAccessOnlyToPatientsClinicalEncounter() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithDeleteAccessRestrictedToPatientsClinicalEncounter();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Edit access only to Patients Clinical Encounter test")
	public void createProfileWithEditAccessOnlyToPatientsClinicalEncounter() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithEditOnlyAccessForPatientsClinicalEncounter();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to add or delete Patients Clinical Encounter in Clinical Module test")
	public void userShouldNotBeAbleToAddOrDeletePatientsClinicalEncounterInClinicalModule() {
		clinicalPage.userShouldNotBeAbleToAddOrDeletePatientsClinicalEncounterInClinicalModuleTest();

	}

	@And("the user should be able to edit Patients Clinical Encounter in Clinical Module test")
	public void userShouldBeAbleToEditPatientsClinicalEncounterInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientsUrl = Hooks.prop.getProperty("patientsUrl");
		Assert.assertNotNull("patientsUrl is missing in config", patientsUrl);
		String fullPatientsUrl = baseUrl + patientsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullPatientsUrl);
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/Patients"));
		Hooks.scenario.log("User is on the Patients page");
		clinicalPage.editClinicalEncounter();

	}

	@And("the user should be able to delete Patients Clinical Encounter in Clinical Module test")
	public void userShouldBeAbleToDeletePatientsClinicalEncounterInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientsUrl = Hooks.prop.getProperty("patientsUrl");
		Assert.assertNotNull("patientsUrl is missing in config", patientsUrl);
		String fullPatientsUrl = baseUrl + patientsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullPatientsUrl);
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/Patients"));
		Hooks.scenario.log("User is on the Patients page");
		clinicalPage.deleteClinicalEncounter();

	}

	@And("the user should not be able to add or edit Patients Clinical Encounter in Clinical Module test")
	public void userShouldNotBeAbleToAddOrEditPatientsClinicalEncounterInClinicalModule() {
		clinicalPage.verifyUserCannotAddOrEditPatientsClinicalEncounterInClinicalModule();

	}

	@And("I create a profile with Add access only to Patients Clinical Encounter test")
	public void createProfileWithAddAccessOnlyToPatientsClinicalEncounter() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithAddOnlyAccessForPatientsClinicalEncounter();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to add Patients Clinical Encounter in Clinical Module test")
	public void userShouldBeAbleToAddPatientsClinicalEncounterInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientsUrl = Hooks.prop.getProperty("patientsUrl");
		Assert.assertNotNull("patientsUrl is missing in config", patientsUrl);
		String fullPatientsUrl = baseUrl + patientsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullPatientsUrl);
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/Patients"));
		Hooks.scenario.log("User is on the Patients page");
		clinicalPage.addClinicalEncounter();

	}

	@And("the user should not be able to edit or delete Patients Clinical Encounter in Clinical Module test")
	public void userShouldNotBeAbleToEditOrDeletePatientsClinicalEncounterInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientsUrl = Hooks.prop.getProperty("patientsUrl");
		Assert.assertNotNull("patientsUrl is missing in config", patientsUrl);
		String fullPatientsUrl = baseUrl + patientsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullPatientsUrl);
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/Patients"));
		Hooks.scenario.log("User is on the Patients page");
		clinicalPage.shouldNotAllowEditingOrDeletingPatientsClinicalEncounterInClinicalModule();

	}

	// SOAP Components
	@And("I create a profile with Delete access only to SOAP Components test")
	public void createProfileWithDeleteAccessOnlyToSoapComponents() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithDeleteOnlyAccessForSoapComponents();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Edit access only to SOAP Components test")
	public void createProfileWithEditAccessOnlyToSoapComponents() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithEditOnlyAccessForSoapComponents();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to edit SOAP Components in Clinical Module test")
	public void userShouldBeAbleToEditSoapComponentsInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String soapComponentsUrl = Hooks.prop.getProperty("soapComponentsUrl");
		Assert.assertNotNull("soapComponentsUrl is missing in config", soapComponentsUrl);
		String fullSoapComponentsUrl = baseUrl + soapComponentsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullSoapComponentsUrl);
		Assert.assertTrue("SOAP Components page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalSOAPComponents"));
		Hooks.scenario.log("User is on the SOAP Components page");
		clinicalPage.verifyUserCanEditSoapComponentsInClinicalModule();

	}

	@And("the user should be able to delete SOAP Components in Clinical Module test")
	public void userShouldBeAbleToDeleteSoapComponentsInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String soapComponentsUrl = Hooks.prop.getProperty("soapComponentsUrl");
		Assert.assertNotNull("soapComponentsUrl is missing in config", soapComponentsUrl);
		String fullSoapComponentsUrl = baseUrl + soapComponentsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullSoapComponentsUrl);
		Assert.assertTrue("SOAP Components page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalSOAPComponents"));
		Hooks.scenario.log("User is on the SOAP Components page");
		clinicalPage.verifyUserCanDeleteSoapComponentsInClinicalModule();

	}

	@And("the user should not be able to add or edit SOAP Components in Clinical Module test")
	public void userShouldNotBeAbleToAddOrEditSoapComponentsInClinicalModule() {
		clinicalPage.shouldNotAllowAddingOrEditingSoapComponentsInClinicalModule();

	}

	@And("the user should not be able to add or delete SOAP Components in Clinical Module test")
	public void userShouldNotBeAbleToAddOrDeleteSoapComponentsInClinicalModule() {
		clinicalPage.verifyUserCannotAddOrDeleteSoapComponentsInClinicalModule();

	}

	@And("I create a profile with Add access only to SOAP Components test")
	public void createProfileWithAddAccessOnlyToSoapComponents() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithAddOnlyAccessForSoapComponents();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to add SOAP Components in Clinical Module test")
	public void userShouldBeAbleToAddSoapComponentsInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String soapComponentsUrl = Hooks.prop.getProperty("soapComponentsUrl");
		Assert.assertNotNull("soapComponentsUrl is missing in config", soapComponentsUrl);
		String fullSoapComponentsUrl = baseUrl + soapComponentsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullSoapComponentsUrl);
		Assert.assertTrue("SOAP Components page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalSOAPComponents"));
		Hooks.scenario.log("User is on the SOAP Components page");
		clinicalPage.addSoapComponent();

	}

	@And("the user should not be able to edit or delete SOAP Components in Clinical Module test")
	public void userShouldNotBeAbleToEditOrDeleteSoapComponentsInClinicalModule() {
		clinicalPage.verifyUserCannotEditOrDeleteSoapComponentsInClinicalModule();

	}

	// Patients
	@And("the user should be able to View Link and Sync Link in Clinical Module test")
	public void userShouldBeAbleToViewAndSyncLinksInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientsUrl = Hooks.prop.getProperty("patientsUrl");
		Assert.assertNotNull("patientsUrl is missing in config", patientsUrl);
		String fullPatientsUrl = baseUrl + patientsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullPatientsUrl);
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/Patients"));
		Hooks.scenario.log("User is on the Patients page");
		clinicalPage.deletePatient();

	}

	@And("I create a profile with All Access to Clinical Module test")
	public void createProfileWithAllAccessToClinicalModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithFullAccessForClinicalModule();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to add or edit Patients in Patients Module test")
	public void userShouldNotBeAbleToAddOrEditPatientsInPatientsModule() {
		clinicalPage.verifyAddAndEditNotAvailable();

	}

	@And("the user should be able to delete Patients in Patients Module test")
	public void userShouldBeAbleToDeletePatientsInPatientsModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientsUrl = Hooks.prop.getProperty("patientsUrl");
		Assert.assertNotNull("patientsUrl is missing in config", patientsUrl);
		String fullPatientsUrl = baseUrl + patientsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullPatientsUrl);
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/Patients"));
		Hooks.scenario.log("User is on the Patients page");
		clinicalPage.deletePatient();

	}

	@And("I create a profile with Delete access only to Patients Module test")
	public void createProfileWithDeleteAccessOnlyToPatientsModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithDeleteOnlyAccessForPatientsModule();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Edit access only to Patients Module test")
	public void createProfileWithEditAccessOnlyToPatientsModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithEditOnlyAccessForPatientsModule();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Add access only to Patients Module test")
	public void createProfileWithAddAccessOnlyToPatientsModule() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithAddAccessOnlyToPatientsModuleTest();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to add Patients in Patients Module test")
	public void userShouldBeAbleToAddPatientsInPatientsModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientsUrl = Hooks.prop.getProperty("patientsUrl");
		Assert.assertNotNull("patientsUrl is missing in config", patientsUrl);
		String fullPatientsUrl = baseUrl + patientsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullPatientsUrl);
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/Patients"));
		Hooks.scenario.log("User is on the Patients page");
		clinicalPage.addNewPatient();
		Hooks.driver.get(fullPatientsUrl);
		clinicalPage.selectExistingPatient();

	}

	@And("the user should be able to edit Patients in Patients Module test")
	public void userShouldBeAbleToEditPatientsInPatientsModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientsUrl = Hooks.prop.getProperty("patientsUrl");
		Assert.assertNotNull("patientsUrl is missing in config", patientsUrl);
		String fullPatientsUrl = baseUrl + patientsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullPatientsUrl);
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/Patients"));
		Hooks.scenario.log("User is on the Patients page");
		clinicalPage.editPatient();

	}

	@And("the user should not be able to add or delete Patients in Patients Module test")
	public void userShouldNotBeAbleToAddOrDeletePatientsInPatientsModule() {
		clinicalPage.verifyAddAndDeleteNotAvailable();

	}

	@And("the user should not be able to edit or delete Patients in Patients Module test")
	public void userShouldNotBeAbleToEditOrDeletePatientsInPatientsModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientsUrl = Hooks.prop.getProperty("patientsUrl");
		Assert.assertNotNull("patientsUrl is missing in config", patientsUrl);
		String fullPatientsUrl = baseUrl + patientsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullPatientsUrl);
		Assert.assertTrue("Patients page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/Patients"));
		Hooks.scenario.log("User is on the Patients page");
		clinicalPage.verifyEditAndDeleteNotAvailable();

	}

	// CPT Code
	@And("I create a profile with Delete access only to Clinical Module CPT Code test")
	public void createProfileWithDeleteAccessOnlyToClinicalModuleCptCode() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithDeleteOnlyAccessForClinicalModuleCptCode();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Edit access only to Clinical Module CPT Code test")
	public void createProfileWithEditAccessOnlyToClinicalModuleCptCode() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithEditAccessOnlyToClinicalModuleCptCodeTest();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Add access only to Clinical Module CPT Code test")
	public void createProfileWithAddAccessOnlyToClinicalModuleCptCode() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithAddAccessOnlyToClinicalModuleCptCodeTest();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to add CPT Code in Clinical Module test")
	public void userShouldBeAbleToAddCptCodeInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String cptCodesUrl = Hooks.prop.getProperty("cptCodesUrl");
		Assert.assertNotNull("cptCodesUrl is missing in config", cptCodesUrl);
		String fullCptCodesUrl = baseUrl + cptCodesUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullCptCodesUrl);
		Assert.assertTrue("CPT Codes page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/CPTCodes"));
		Hooks.scenario.log("User is on the CPT Codes page");
		clinicalPage.addCptCode();

	}

	@And("the user should be able to edit CPT Code in Clinical Module test")
	public void userShouldBeAbleToEditCptCodeInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String cptCodesUrl = Hooks.prop.getProperty("cptCodesUrl");
		Assert.assertNotNull("cptCodesUrl is missing in config", cptCodesUrl);
		String fullCptCodesUrl = baseUrl + cptCodesUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullCptCodesUrl);
		Assert.assertTrue("CPT Codes page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/CPTCodes"));
		Hooks.scenario.log("User is on the CPT Codes page");
		clinicalPage.editCptCode();

	}

	@And("the user should be able to delete CPT Code in Clinical Module test")
	public void userShouldBeAbleToDeleteCptCodeInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String cptCodesUrl = Hooks.prop.getProperty("cptCodesUrl");
		Assert.assertNotNull("cptCodesUrl is missing in config", cptCodesUrl);
		String fullCptCodesUrl = baseUrl + cptCodesUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullCptCodesUrl);
		Assert.assertTrue("CPT Codes page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/CPTCodes"));
		Hooks.scenario.log("User is on the CPT Codes page");
		clinicalPage.deleteCptCode();

	}

	@And("the user should not be able to add or edit CPT Code in Clinical Module test")
	public void userShouldNotBeAbleToAddOrEditCptCodeInClinicalModule() {
		clinicalPage.verifyAddAndEditAreNotAvailable();

	}

	@And("the user should not be able to add or delete CPT Code in Clinical Module test")
	public void userShouldNotBeAbleToAddOrDeleteCptCodeInClinicalModule() {
		clinicalPage.verifyAddAndDeleteAreNotAvailable();

	}

	@And("the user should not be able to edit or delete CPT Code in Clinical Module test")
	public void userShouldNotBeAbleToEditOrDeleteCptCodeInClinicalModule() {
		clinicalPage.verifyEditAndDeleteAreNotAvailable();

	}

	// RPM Status
	@And("the user should not be able to add or delete RPM Status in Clinical Module test")
	public void verifyUserIsRestrictedFromAddingOrDeletingRPMStatus() {
		clinicalPage.verifyAddAndDeleteAreDisabledForRPMStatus();

	}

	@And("the user should be able to delete RPM Status in Clinical Module test")
	public void verifyUserCanDeleteRPMStatusInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmStatusUrl = Hooks.prop.getProperty("rpmStatusUrl");
		Assert.assertNotNull("rpmStatusUrl is missing in config", rpmStatusUrl);
		String fullRPMStatusUrl = baseUrl + rpmStatusUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRPMStatusUrl);
		Assert.assertTrue("RPM Status page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PatientRemoteMonitoringStatuses"));
		Hooks.scenario.log("User is on the RPM Status page");
		clinicalPage.verifyUserCanDeleteRPMStatus();

	}

	@And("the user should not be able to add or edit RPM Status in Clinical Module test")
	public void verifyUserCannotAddOrEditRPMStatusInClinicalModule() {
		clinicalPage.verifyUserCannotAddEditRPMStatus();

	}

	@And("the user should be able to edit RPM Status in Clinical Module test")
	public void verifyUserCanEditRPMStatusInClinicalModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmStatusUrl = Hooks.prop.getProperty("rpmStatusUrl");
		Assert.assertNotNull("rpmStatusUrl is missing in config", rpmStatusUrl);
		String fullRPMStatusUrl = baseUrl + rpmStatusUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRPMStatusUrl);
		Assert.assertTrue("RPM Status page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PatientRemoteMonitoringStatuses"));
		Hooks.scenario.log("User is on the RPM Status page");
		clinicalPage.verifyUserCanEditRPMStatus();

	}

	@And("the user should be able to add RPM Status in Clinical Module test")
	public void verifyAddRPMStatusInClinicalModule() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rpmStatusUrl = Hooks.prop.getProperty("rpmStatusUrl");
		Assert.assertNotNull("rpmStatusUrl is missing in config", rpmStatusUrl);
		String fullRPMStatusUrl = baseUrl + rpmStatusUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRPMStatusUrl);
		Assert.assertTrue("RPM Status page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PatientRemoteMonitoringStatuses"));
		Hooks.scenario.log("User is on the RPM Status page");
		clinicalPage.verifyUserCanAddRPMStatus();

	}

	@And("the user should not be able to edit or delete RPM Status in Clinical Module test")
	public void verifyUserIsRestrictedFromEditingOrDeletingRPMStatus() {
		clinicalPage.verifyUserCannotEditOrDeleteRPMStatus();

	}

	@And("I create a profile with Delete access only to Clinical Module RPM Status test")
	public void createProfileWithDeleteAccessToClinicalModuleRPMStatus() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createRPMStatusDeleteAccessProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Edit access only to Clinical Module RPM Status test")
	public void createProfileWithEditAccessToClinicalModuleRPMStatus() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createRPMStatusEditAccessProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Add access only to Clinical Module RPM Status test")
	public void createProfileWithAddAccessToClinicalModuleRPMStatus() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createRPMStatusAddAccessProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	// Registered Device
	@And("I create a profile with full access to Clinical Module Registered Device test")
	public void createProfileWithFullAccessToClinicalModuleRegisteredDevice() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createRegisteredDeviceFullAccessProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Delete access only to Clinical Module Registered Device test")
	public void createProfileWithDeleteAccessOnlyToClinicalModuleRegisteredDevice() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createRegisteredDeviceDeleteOnlyProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Edit access only to Clinical Module Registered Device test")
	public void createProfileWithEditAccessOnlyToClinicalModuleRegisteredDevice() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createRegisteredDeviceEditOnlyProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Add access only to Clinical Module Registered Device test")
	public void createProfileWithAddAccessOnlyToClinicalModuleRegisteredDevice() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createRegisteredDeviceAddOnlyProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to add Registered Device in Clinical Module test")
	public void verifyAddRegisteredDeviceInClinicalModule() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String registeredDeviceUrl = Hooks.prop.getProperty("registeredDeviceUrl");
		Assert.assertNotNull("registeredDeviceUrl is missing in config", registeredDeviceUrl);
		String fullRegisteredDeviceUrl = baseUrl + registeredDeviceUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRegisteredDeviceUrl);
		Assert.assertTrue("Registered Device page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/RegisteredDevices"));
		Hooks.scenario.log("User is on the Registered Device page");
		clinicalPage.verifyUserCanAddRegisteredDevice();

	}

	@And("the user should be able to edit Registered Device in Clinical Module test")
	public void verifyEditRegisteredDeviceInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String registeredDeviceUrl = Hooks.prop.getProperty("registeredDeviceUrl");
		Assert.assertNotNull("registeredDeviceUrl is missing in config", registeredDeviceUrl);
		String fullRegisteredDeviceUrl = baseUrl + registeredDeviceUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRegisteredDeviceUrl);
		Assert.assertTrue("Registered Device page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/RegisteredDevices"));
		Hooks.scenario.log("User is on the Registered Device page");
		clinicalPage.verifyUserCanEditRegisteredDevice();

	}

	@And("the user should be able to delete Registered Device in Clinical Module test")
	public void verifyDeleteRegisteredDeviceInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String registeredDeviceUrl = Hooks.prop.getProperty("registeredDeviceUrl");
		Assert.assertNotNull("registeredDeviceUrl is missing in config", registeredDeviceUrl);
		String fullRegisteredDeviceUrl = baseUrl + registeredDeviceUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRegisteredDeviceUrl);
		Assert.assertTrue("Registered Device page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/RegisteredDevices"));
		Hooks.scenario.log("User is on the Registered Device page");
		clinicalPage.validateDeleteRegisteredDeviceAccess();

	}

	@And("the user should be able to download Registered Device template in Clinical Module test")
	public void verifyUserCanDownloadRegisteredDeviceTemplate() {
		clinicalPage.verifyDownloadTemplateForRegisteredDevice();

	}

	@And("the user should be able to upload Excel for Registered Device in Clinical Module test")
	public void verifyUserCanUploadRegisteredDeviceExcel() {
		clinicalPage.verifyUploadExcelForRegisteredDevice();

	}

	@And("the user should be able to view Registered Device History in Clinical Module test")
	public void verifyRegisteredDeviceHistoryInClinicalModule() {
		clinicalPage.verifyUserCanViewRegisteredDeviceHistory();

	}

	@And("the user should be able to allocate Provider RPM Device in Clinical Module test")
	public void verifyUserCanAllocateProviderRPMDevice() {
		clinicalPage.verifyAllocateRPMDeviceInClinicalModule();

	}

	@And("the user should be able to deallocate Provider RPM Device in Clinical Module test")
	public void verifyUserCanDeallocateProviderRPMDevice() {
		clinicalPage.verifyDeallocateRPMDeviceInClinicalModule();

	}

	@And("the user should be able to allocate BusinessGroup RPM Device in Clinical Module test")
	public void verifyAllocateBusinessGroupRPMDeviceInClinicalModule() {
		clinicalPage.verifyUserCanAllocateBusinessGroupRPMDevice();

	}

	@And("the user should be able to deallocate BusinessGroup RPM Device in Clinical Module test")
	public void verifyDeallocateBusinessGroupRPMDeviceInClinicalModule() {
		clinicalPage.verifyUserCanDeallocateBusinessGroupRPMDevice();

	}

	@And("the user should be able to view Register Device Activity in Clinical Module test")
	public void verifyUserCanViewRegisteredDeviceActivity() {
		clinicalPage.validateViewRegisteredDeviceActivityAccess();

	}

	@And("the user should not be able to add or edit Registered Device in Clinical Module test")
	public void verifyUserCannotAddOrEditRegisteredDevice() {
		clinicalPage.verifyAddEditDisabledForRegisteredDevice();

	}

	@And("the user should not be able to add or delete Registered Device in Clinical Module test")
	public void userShouldNotBeAbleToAddOrDeleteRegisteredDevice() {
		clinicalPage.verifyAddDeleteDisabledForRegisteredDevice();

	}

	@And("the user should not be able to edit or delete Registered Device in Clinical Module test")
	public void verifyUserCannotEditOrDeleteRegisteredDevice() {
		clinicalPage.verifyUserCannotEditOrDeleteRegisteredDevice();

	}

	// Device Master
	@And("I create a profile with Edit access only to Clinical Module Device Master test")
	public void createProfileWithEditAccessOnlyToClinicalModuleDeviceMaster() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createDeviceMasterEditOnlyProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to edit Device Master in Clinical Module test")
	public void verifyEditDeviceMasterInClinicalModule() {
		clinicalPage.verifyUserCanEditDeviceMaster();

	}

	@And("I create a profile with View access only to Clinical Module Device Master test")
	public void createProfileWithViewOnlyAccessForDeviceMasterTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.setupViewAccessForDeviceMasterProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to view Device Master in Clinical Module test")
	public void verifyViewDeviceMasterInClinicalModule() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deviceMasterUrl = Hooks.prop.getProperty("deviceMasterUrl");
		Assert.assertNotNull("deviceMasterUrl is missing in config", deviceMasterUrl);
		String fullDeviceMasterUrl = baseUrl + deviceMasterUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullDeviceMasterUrl);
		Assert.assertTrue("Device Master page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/DeviceMasters"));
		Hooks.scenario.log("User is on the Community Resource page");

	}

	@And("the user should not be able to edit Device Master in Clinical Module test")
	public void userShouldNotBeAbleToEditDeviceMaster() {
		clinicalPage.verifyUserCannotEditDeviceMaster();

	}

	// Encounter Status
	@And("I create a profile with Delete access only to Clinical Module Encounter Status test")
	public void createProfileWithDeleteOnlyAccessForEncounterStatusTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createEncounterStatusProfileWithDeleteAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to delete Encounter Status in Clinical Module test")
	public void verifyUserCanDeleteEncounterStatus() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String encounterStatusUrl = Hooks.prop.getProperty("encounterStatusUrl");
		Assert.assertNotNull("encounterStatusUrl is missing in config", encounterStatusUrl);
		String fullEncounterStatusUrl = baseUrl + encounterStatusUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullEncounterStatusUrl);
		Assert.assertTrue("Encounter Status page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ClinicalEncounterStatuses"));
		Hooks.scenario.log("User is on the Encounter Status page");
		clinicalPage.verifyUserCanDeleteEncounterStatus();

	}

	@And("the user should not be able to add or edit Encounter Status in Clinical Module test")
	public void userShouldNotBeAbleToAddOrEditEncounterStatus() {
		clinicalPage.verifyUserCannotAddOrEditEncounterStatus();

	}

	@And("I create a profile with Edit access only to Clinical Module Encounter Status test")
	public void createProfileWithEditOnlyAccessForEncounterStatusTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createEncounterStatusProfileWithEditAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Add access only to Clinical Module Encounter Status test")
	public void createProfileWithAddOnlyAccessForEncounterStatusTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createEncounterStatusProfileWithAddAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	// ROS Group Type
	@And("I create a profile with Delete access only to Clinical Module ROS Group Type test")
	public void createProfileWithDeleteOnlyAccessForROSGroupTypeTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.setupDeleteAccessForROSGroupTypeProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Edit access only to Clinical Module ROS Group Type test")
	public void createProfileWithEditOnlyAccessForROSGroupTypeTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.setupEditAccessForROSGroupTypeProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Add access only to Clinical Module ROS Group Type test")
	public void createProfileWithAddOnlyAccessForROSGroupTypeTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.setupAddAccessForROSGroupTypeProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to add ROS Group Type in Clinical Module test")
	public void verifyAddROSGroupTypeInClinicalModule() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rosGroupTypeUrl = Hooks.prop.getProperty("rosGroupTypeUrl");
		Assert.assertNotNull("rosGroupTypeUrl is missing in config", rosGroupTypeUrl);
		String fullROSGroupTypeUrl = baseUrl + rosGroupTypeUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullROSGroupTypeUrl);
		Assert.assertTrue("ROS Group Type page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ROSGroupTypes"));
		Hooks.scenario.log("User is on the ROS Group Type page");
		clinicalPage.validateAddROSGroupTypeAccess();

	}

	@And("the user should be able to edit ROS Group Type in Clinical Module test")
	public void verifyEditROSGroupTypeInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rosGroupTypeUrl = Hooks.prop.getProperty("rosGroupTypeUrl");
		Assert.assertNotNull("rosGroupTypeUrl is missing in config", rosGroupTypeUrl);
		String fullROSGroupTypeUrl = baseUrl + rosGroupTypeUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullROSGroupTypeUrl);
		Assert.assertTrue("ROS Group Type page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ROSGroupTypes"));
		Hooks.scenario.log("User is on the ROS Group Type page");
		clinicalPage.verifyUserCanEditROSGroupType();

	}

	@And("the user should not be able to edit or delete Encounter Status in Clinical Module test")
	public void userShouldNotBeAbleToEditOrDeleteEncounterStatus() {
		clinicalPage.verifyEditDeleteDisabledForEncounterStatus();

	}

	@And("the user should be able to delete ROS Group Type in Clinical Module test")
	public void verifyDeleteROSGroupTypeInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rosGroupTypeUrl = Hooks.prop.getProperty("rosGroupTypeUrl");
		Assert.assertNotNull("rosGroupTypeUrl is missing in config", rosGroupTypeUrl);
		String fullROSGroupTypeUrl = baseUrl + rosGroupTypeUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullROSGroupTypeUrl);
		Assert.assertTrue("ROS Group Type page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ROSGroupTypes"));
		Hooks.scenario.log("User is on the ROS Group Type page");
		clinicalPage.verifyUserCanDeleteROSGroupType();

	}

	@And("the user should be able to add Encounter Status in Clinical Module test")
	public void verifyAddEncounterStatusInClinicalModule() {
		sleep(2000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String encounterStatusUrl = Hooks.prop.getProperty("encounterStatusUrl");
		Assert.assertNotNull("encounterStatusUrl is missing in config", encounterStatusUrl);
		String fullEncounterStatusUrl = baseUrl + encounterStatusUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullEncounterStatusUrl);
		Assert.assertTrue("Encounter Status page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ClinicalEncounterStatuses"));
		Hooks.scenario.log("User is on the Encounter Status page");
		clinicalPage.verifyUserCanAddEncounterStatus();

	}

	@And("the user should be able to edit Encounter Status in Clinical Module test")
	public void verifyEditEncounterStatusInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String encounterStatusUrl = Hooks.prop.getProperty("encounterStatusUrl");
		Assert.assertNotNull("encounterStatusUrl is missing in config", encounterStatusUrl);
		String fullEncounterStatusUrl = baseUrl + encounterStatusUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullEncounterStatusUrl);
		Assert.assertTrue("Encounter Status page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ClinicalEncounterStatuses"));
		Hooks.scenario.log("User is on the Encounter Status page");
		clinicalPage.verifyUserCanEditEncounterStatus();

	}

	@And("the user should not be able to add or delete Encounter Status in Clinical Module test")
	public void userShouldNotBeAbleToAddOrDeleteEncounterStatus() {
		clinicalPage.verifyAddDeleteDisabledForEncounterStatus();

	}

	@And("the user should not be able to add or edit ROS Group Type in Clinical Module test")
	public void userShouldNotBeAbleToAddOrEditROSGroupType() {
		clinicalPage.verifyAddEditDisabledForROSGroupType();

	}

	@And("the user should not be able to add or delete ROS Group Type in Clinical Module test")
	public void userShouldNotBeAbleToAddOrDeleteROSGroupType() {
		clinicalPage.verifyUserCannotAddOrDeleteROSGroupType();

	}

	@And("the user should not be able to edit or delete ROS Group Type in Clinical Module test")
	public void userShouldNotBeAbleToEditOrDeleteROSGroupType() {
		clinicalPage.verifyUserCannotEditOrDeleteROSGroupType();

	}

	// Remote Monitoring Parameters (RMP)
	@And("I create a profile with Delete access only to Clinical Module RMP test")
	public void createProfileWithDeleteOnlyAccessForRMPTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.setupDeleteAccessForRMPProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Edit access only to Clinical Module RMP test")
	public void createProfileWithEditOnlyAccessForRMPTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createRMPProfileWithEditAccess();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Add access only to Clinical Module RMP test")
	public void createProfileWithAddOnlyAccessForRMPTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.setupAddAccessForRMPProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to add RMP in Clinical Module test")
	public void verifyAddRMPInClinicalModule() {
		sleep(3000);
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rmpUrl = Hooks.prop.getProperty("rmpUrl");
		Assert.assertNotNull("rmpUrl is missing in config", rmpUrl);
		String fullRMPUrl = baseUrl + rmpUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRMPUrl);
		Assert.assertTrue("Remote Monitoring Parameters page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/RemoteMonitoringParameters"));
		Hooks.scenario.log("User is on the Remote Monitoring Parameters page");
		clinicalPage.verifyUserCanAddRMP();

	}

	@And("the user should be able to edit RMP in Clinical Module test")
	public void verifyEditRMPInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rmpUrl = Hooks.prop.getProperty("rmpUrl");
		Assert.assertNotNull("rmpUrl is missing in config", rmpUrl);
		String fullRMPUrl = baseUrl + rmpUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRMPUrl);
		Assert.assertTrue("Remote Monitoring Parameters page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/RemoteMonitoringParameters"));
		Hooks.scenario.log("User is on the Remote Monitoring Parameters page");
		clinicalPage.verifyUserCanEditRMP();

	}

	@And("the user should be able to delete RMP in Clinical Module test")
	public void verifyDeleteRMPInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rmpUrl = Hooks.prop.getProperty("rmpUrl");
		Assert.assertNotNull("rmpUrl is missing in config", rmpUrl);
		String fullRMPUrl = baseUrl + rmpUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullRMPUrl);
		Assert.assertTrue("Remote Monitoring Parameters page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/RemoteMonitoringParameters"));
		Hooks.scenario.log("User is on the Remote Monitoring Parameters page");
		clinicalPage.verifyUserCanDeleteRMP();

	}

	@And("the user should not be able to add or edit RMP in Clinical Module test")
	public void userShouldNotBeAbleToAddOrEditRMP() {
		clinicalPage.verifyUserCannotAddOrEditRMP();

	}

	@And("the user should not be able to add or delete RMP in Clinical Module test")
	public void userShouldNotBeAbleToAddOrDeleteRMP() {
		clinicalPage.verifyAddDeleteDisabledForRMP();

	}

	@And("the user should not be able to edit or delete RMP in Clinical Module test")
	public void userShouldNotBeAbleToEditOrDeleteRMP() {
		clinicalPage.verifyEditDeleteDisabledForRMP();

	}

	// Outcome Action
	@And("the user should be able to edit Outcome Action in Clinical Module test")
	public void verifyEditOutcomeActionInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String outcomeActionUrl = Hooks.prop.getProperty("outcomeActionUrl");
		Assert.assertNotNull("outcomeActionUrl is missing in config", outcomeActionUrl);
		String fullOutcomeActionUrl = baseUrl + outcomeActionUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullOutcomeActionUrl);
		Assert.assertTrue("Outcome Action page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/OutcomeActions"));
		Hooks.scenario.log("User is on the Outcome Action page");
		clinicalPage.verifyUserCanEditOutcomeAction();

	}

	@And("the user should be able to delete Outcome Action in Clinical Module test")
	public void verifyDeleteOutcomeActionInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String outcomeActionUrl = Hooks.prop.getProperty("outcomeActionUrl");
		Assert.assertNotNull("outcomeActionUrl is missing in config", outcomeActionUrl);
		String fullOutcomeActionUrl = baseUrl + outcomeActionUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullOutcomeActionUrl);
		Assert.assertTrue("Outcome Action page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/OutcomeActions"));
		Hooks.scenario.log("User is on the Outcome Action page");
		clinicalPage.validateDeleteOutcomeActionAccess();

	}

	@And("the user should not be able to add or edit Outcome Action in Clinical Module test")
	public void userShouldNotBeAbleToAddOrEditOutcomeAction() {
		clinicalPage.verifyAddEditDisabledForOutcomeAction();

	}

	@And("the user should not be able to add or delete Outcome Action in Clinical Module test")
	public void verifyAddDeleteDisabledForOutcomeAction() {
		clinicalPage.verifyUserCannotAddOrDeleteOutcomeAction();

	}

	@And("I create a profile with Delete access only to Clinical Module Outcome Action test")
	public void createProfileWithDeleteAccessForOutcomeActionTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.setupDeleteAccessForOutcomeActionProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Edit access only to Clinical Module Outcome Action test")
	public void createProfileWithEditAccessForOutcomeActionTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.setupEditAccessForOutcomeActionProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Add access only to Clinical Module Outcome Action test")
	public void createProfileWithAddAccessForOutcomeActionTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.setupAddAccessForOutcomeActionProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to add Outcome Action in Clinical Module test")
	public void verifyAddOutcomeActionInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String outcomeActionUrl = Hooks.prop.getProperty("outcomeActionUrl");
		Assert.assertNotNull("outcomeActionUrl is missing in config", outcomeActionUrl);
		String fullOutcomeActionUrl = baseUrl + outcomeActionUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullOutcomeActionUrl);
		Assert.assertTrue("Outcome Action page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/OutcomeActions"));
		Hooks.scenario.log("User is on the Outcome Action page");
		clinicalPage.verifyUserCanAddOutcomeAction();

	}

	@And("the user should not be able to edit or delete Outcome Action in Clinical Module test")
	public void userShouldNotBeAbleToEditOrDeleteOutcomeAction() {
		clinicalPage.verifyUserCannotEditOrDeleteOutcomeAction();

	}

	// ROS
	@And("I create a profile with Delete access only to Clinical Module ROS test")
	public void createProfileWithDeleteAccessForROSTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.setupDeleteAccessForROSProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Edit access only to Clinical Module ROS test")
	public void createProfileWithEditOnlyAccessForROSTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.setupEditAccessForROSProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to edit ROS in Clinical Module test")
	public void verifyEditROSInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rosUrl = Hooks.prop.getProperty("rosUrl");
		Assert.assertNotNull("rosUrl is missing in config", rosUrl);
		String fullROSUrl = baseUrl + rosUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullROSUrl);
		Assert.assertTrue("ROS page is not displayed", Hooks.driver.getCurrentUrl().contains("/Setup/Home/ROSs"));
		Hooks.scenario.log("User is on the ROS page");
		clinicalPage.verifyUserCanEditROS();

	}

	@And("the user should be able to delete ROS in Clinical Module test")
	public void verifyDeleteROSInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rosUrl = Hooks.prop.getProperty("rosUrl");
		Assert.assertNotNull("rosUrl is missing in config", rosUrl);
		String fullROSUrl = baseUrl + rosUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullROSUrl);
		Assert.assertTrue("ROS page is not displayed", Hooks.driver.getCurrentUrl().contains("/Setup/Home/ROSs"));
		Hooks.scenario.log("User is on the ROS page");
		clinicalPage.verifyUserCanDeleteROS();

	}

	@And("the user should not be able to add or edit ROS in Clinical Module test")
	public void userShouldNotBeAbleToAddOrEditROS() {
		clinicalPage.verifyAddEditDisabledForROS();

	}

	@And("the user should not be able to add or delete ROS in Clinical Module test")
	public void userShouldNotBeAbleToAddOrDeleteROS() {
		clinicalPage.verifyAddDeleteDisabledForROS();

	}

	@And("I create a profile with Add access only to Clinical Module ROS test")
	public void createProfileWithAddAccessForROSTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.setupAddAccessForROSProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to add ROS in Clinical Module test")
	public void verifyAddROSInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rosUrl = Hooks.prop.getProperty("rosUrl");
		Assert.assertNotNull("rosUrl is missing in config", rosUrl);
		String fullROSUrl = baseUrl + rosUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullROSUrl);
		Assert.assertTrue("ROS page is not displayed", Hooks.driver.getCurrentUrl().contains("/Setup/Home/ROSs"));
		Hooks.scenario.log("User is on the ROS page");
		clinicalPage.verifyUserCanAddROS();

	}

	@And("the user should not be able to edit or delete ROS in Clinical Module test")
	public void verifyUserCannotEditOrDeleteROS() {
		clinicalPage.verifyEditDeleteDisabledForROS();

	}

	// Clinical Intervention
	@And("the user should not be able to edit or delete Clinical Intervention in Clinical Module test")
	public void verifyUserCannotEditOrDeleteClinicalIntervention() {
		clinicalPage.verifyEditDeleteDisabledForClinicalIntervention();

	}

	@And("the user should be able to add Clinical Intervention in Clinical Module test")
	public void verifyUserCanAddClinicalIntervention() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalInterventionUrl = Hooks.prop.getProperty("clinicalInterventionUrl");
		Assert.assertNotNull("clinicalInterventionUrl is missing in config", clinicalInterventionUrl);
		String fullClinicalInterventionUrl = baseUrl + clinicalInterventionUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullClinicalInterventionUrl);
		Assert.assertTrue("Clinical Intervention page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ClinicalInterventions"));
		Hooks.scenario.log("User is on the Clinical Intervention page");
		clinicalPage.validateAddClinicalInterventionAccess();

	}

	@And("the user should be able to edit Clinical Intervention in Clinical Module test")
	public void verifyUserCanEditClinicalIntervention() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalInterventionUrl = Hooks.prop.getProperty("clinicalInterventionUrl");
		Assert.assertNotNull("clinicalInterventionUrl is missing in config", clinicalInterventionUrl);
		String fullClinicalInterventionUrl = baseUrl + clinicalInterventionUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullClinicalInterventionUrl);
		Assert.assertTrue("Clinical Intervention page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ClinicalInterventions"));
		Hooks.scenario.log("User is on the Clinical Intervention page");
		clinicalPage.validateEditClinicalInterventionAccess();

	}

	@And("the user should not be able to add or edit Clinical Intervention in Clinical Module test")
	public void verifyUserCannotAddOrEditClinicalIntervention() {
		clinicalPage.verifyAddEditDisabledForClinicalIntervention();

	}

	@And("the user should be able to delete Clinical Intervention in Clinical Module test")
	public void verifyUserCanDeleteClinicalIntervention() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalInterventionUrl = Hooks.prop.getProperty("clinicalInterventionUrl");
		Assert.assertNotNull("clinicalInterventionUrl is missing in config", clinicalInterventionUrl);
		String fullClinicalInterventionUrl = baseUrl + clinicalInterventionUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullClinicalInterventionUrl);
		Assert.assertTrue("Clinical Intervention page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ClinicalInterventions"));
		Hooks.scenario.log("User is on the Clinical Intervention page");
		clinicalPage.validateDeleteClinicalInterventionAccess();

	}

	@And("the user should not be able to add or delete Clinical Intervention in Clinical Module test")
	public void verifyUserCannotAddOrDeleteClinicalIntervention() {
		clinicalPage.validateNoAddOrDeleteAccessForClinicalIntervention();

	}

	@And("I create a profile with Delete access only to Clinical Module Clinical Intervention test")
	public void createProfileWithDeleteAccessForClinicalIntervention() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.setupDeleteAccessForClinicalInterventionProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Edit access only to Clinical Module Clinical Intervention test")
	public void createProfileWithEditAccessForClinicalIntervention() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.setupEditAccessForClinicalInterventionProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Add access only to Clinical Module Clinical Intervention test")
	public void createProfileWithAddAccessForClinicalIntervention() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createProfileWithAddAccessOnlyToClinicalIntervention();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	// Community Resource
	@And("I create a profile with Delete access only to Clinical Module Community Resource test")
	public void createClinicalCommunityResourceProfileWithDeleteAccess() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createDeleteOnlyCommunityResourceProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to add or edit Community Resource in Clinical Module test")
	public void verifyUserCannotAddOrEditCommunityResourceTest() {
		clinicalPage.cannotAddOrEditCommunityResourceTest();

	}

	@And("the user should be able to delete Community Resource in Clinical Module test")
	public void verifyUserCanDeleteCommunityResourceInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String communityResourceUrl = Hooks.prop.getProperty("communityResourceUrl");
		Assert.assertNotNull("communityResourceUrl is missing in config", communityResourceUrl);
		String fullCommunityResourceUrl = baseUrl + communityResourceUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullCommunityResourceUrl);
		Assert.assertTrue("Community Resource page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/CommunityResources"));
		Hooks.scenario.log("User is on the Community Resource page");
		clinicalPage.verifyDeleteCommunityResourceAccess();

	}

	@And("the user should be able to add Community Resource in Clinical Module test")
	public void verifyUserCanAddCommunityResource() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String communityResourceUrl = Hooks.prop.getProperty("communityResourceUrl");
		Assert.assertNotNull("communityResourceUrl is missing in config", communityResourceUrl);
		String fullCommunityResourceUrl = baseUrl + communityResourceUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullCommunityResourceUrl);
		Assert.assertTrue("Community Resource page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/CommunityResources"));
		Hooks.scenario.log("User is on the Community Resource page");
		clinicalPage.canAddCommunityResource();

	}

	@And("the user should be able to edit Community Resource in Clinical Module test")
	public void editCommunityResourceTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String communityResourceUrl = Hooks.prop.getProperty("communityResourceUrl");
		Assert.assertNotNull("communityResourceUrl is missing in config", communityResourceUrl);
		String fullCommunityResourceUrl = baseUrl + communityResourceUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullCommunityResourceUrl);
		Assert.assertTrue("Community Resource page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/CommunityResources"));
		Hooks.scenario.log("User is on the Community Resource page");
		clinicalPage.editCommunityResourceTest();

	}

	@And("the user should not be able to add or delete Community Resource in Clinical Module test")
	public void cannotAddOrDeleteCommunityResourceTest() {
		clinicalPage.verifyUserCannotAddOrDeleteCommunityResource();

	}

	@And("the user should not be able to edit or delete Community Resource in Clinical Module test")
	public void verifyUserCannotEditOrDeleteCommunityResource() {
		clinicalPage.verifyUserCannotEditOrDeleteGoalsOfTreatment();

	}

	@And("I create a profile with Edit access only to Clinical Module Community Resource test")
	public void createProfileWithEditAccessOnlyToClinicalCommunityResourceTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createEditOnlyClinicalCommunityResourceProfileTest();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Add access only to Clinical Module Community Resource test")
	public void createProfileWithAddAccessForClinicalCommunityResource() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createCommunityResourceAddProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	// Barriers
	@And("I create a profile with Delete access only to Clinical Module Barriers test")
	public void createProfileWithDeleteAccessForClinicalBarriers() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalBarriersDeleteProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Edit access only to Clinical Module Barriers test")
	public void createProfileWithEditAccessForClinicalBarriers() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalBarriersEditProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with Add access only to Clinical Module Barriers test")
	public void createProfileWithAddAccessForClinicalBarriers() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalBarriersAddProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to add Barriers in Clinical Module test")
	public void verifyUserCanAddBarriers() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String barriersUrl = Hooks.prop.getProperty("barriersUrl");
		Assert.assertNotNull("barriersUrl is missing in config", barriersUrl);
		String fullBarriersUrl = baseUrl + barriersUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullBarriersUrl);
		Assert.assertTrue("Barriers page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Barriers"));
		Hooks.scenario.log("User is on the Barriers page");
		clinicalPage.canAddBarriers();

	}

	@And("the user should be able to edit Barriers in Clinical Module test")
	public void verifyUserCanEditBarriers() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String barriersUrl = Hooks.prop.getProperty("barriersUrl");
		Assert.assertNotNull("barriersUrl is missing in config", barriersUrl);
		String fullBarriersUrl = baseUrl + barriersUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullBarriersUrl);
		Assert.assertTrue("Barriers page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Barriers"));
		Hooks.scenario.log("User is on the Barriers page");
		clinicalPage.editBarrier();

	}

	@And("the user should be able to delete Barriers in Clinical Module test")
	public void verifyUserCanDeleteBarriers() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String barriersUrl = Hooks.prop.getProperty("barriersUrl");
		Assert.assertNotNull("barriersUrl is missing in config", barriersUrl);
		String fullBarriersUrl = baseUrl + barriersUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullBarriersUrl);
		Assert.assertTrue("Barriers page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Barriers"));
		Hooks.scenario.log("User is on the Barriers page");
		clinicalPage.canDeleteBarriers();

	}

	@And("the user should not be able to add or edit Barriers in Clinical Module test")
	public void verifyUserCannotAddOrEditBarriers() {
		clinicalPage.cannotAddOrEditBarriers();

	}

	@And("the user should not be able to add or delete Barriers in Clinical Module test")
	public void verifyUserCannotAddOrDeleteBarriers() {
		clinicalPage.cannotAddOrDeleteBarriers();

	}

	@And("the user should not be able to edit or delete Barriers in Clinical Module test")
	public void verifyUserCannotEditOrDeleteBarriers() {
		clinicalPage.cannotEditOrDeleteBarriers();

	}

	// Goals Of Treatment
	@And("I create a profile with View and Delete access only to Clinical Module Goals Of Treatment test")
	public void createProfileWithViewAndDeleteAccessForClinicalGoalsOfTreatment() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalGoalsOfTreatmentViewDeleteProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Edit access only to Clinical Module Goals Of Treatment test")
	public void createProfileWithViewAndEditAccessForClinicalGoalsOfTreatment() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalGoalsOfTreatmentViewEditProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Add access only to Clinical Module Goals Of Treatment test")
	public void createProfileWithViewAndAddAccessForClinicalGoalsOfTreatment() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalGoalsOfTreatmentViewAddProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to view and add Goals Of Treatment in Clinical Module test")
	public void verifyUserCanViewAndAddGoalsOfTreatment() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String goalsOfTreatmentUrl = Hooks.prop.getProperty("goalsOfTreatmentUrl");
		Assert.assertNotNull("goalsOfTreatmentUrl is missing in config", goalsOfTreatmentUrl);
		String fullGoalsOfTreatmentUrl = baseUrl + goalsOfTreatmentUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullGoalsOfTreatmentUrl);
		Assert.assertTrue("Goals Of Treatment page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/GoalsOfTreatments"));
		Hooks.scenario.log("User is on the Goals Of Treatment page");
		clinicalPage.canViewAndAddGoalsOfTreatment();

	}

	@And("the user should be able to view and edit Goals Of Treatment in Clinical Module test")
	public void verifyUserCanViewAndEditGoalsOfTreatment() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String goalsOfTreatmentUrl = Hooks.prop.getProperty("goalsOfTreatmentUrl");
		Assert.assertNotNull("goalsOfTreatmentUrl is missing in config", goalsOfTreatmentUrl);
		String fullGoalsOfTreatmentUrl = baseUrl + goalsOfTreatmentUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullGoalsOfTreatmentUrl);
		Assert.assertTrue("Goals Of Treatment page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/GoalsOfTreatments"));
		Hooks.scenario.log("User is on the Goals Of Treatment page");
		clinicalPage.editGoalsOfTreatment();

	}

	@And("the user should be able to view and delete Goals Of Treatment in Clinical Module test")
	public void verifyUserCanViewAndDeleteGoalsOfTreatment() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String goalsOfTreatmentUrl = Hooks.prop.getProperty("goalsOfTreatmentUrl");
		Assert.assertNotNull("goalsOfTreatmentUrl is missing in config", goalsOfTreatmentUrl);
		String fullGoalsOfTreatmentUrl = baseUrl + goalsOfTreatmentUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullGoalsOfTreatmentUrl);
		Assert.assertTrue("Goals Of Treatment page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/GoalsOfTreatments"));
		Hooks.scenario.log("User is on the Goals Of Treatment page");
		clinicalPage.canViewAndDeleteGoalsOfTreatment();

	}

	@And("the user should not be able to add or edit Goals Of Treatment in Clinical Module test")
	public void verifyUserCannotAddOrEditGoalsOfTreatment() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String goalsOfTreatmentUrl = Hooks.prop.getProperty("goalsOfTreatmentUrl");
		Assert.assertNotNull("goalsOfTreatmentUrl is missing in config", goalsOfTreatmentUrl);
		String fullGoalsOfTreatmentUrl = baseUrl + goalsOfTreatmentUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullGoalsOfTreatmentUrl);
		Assert.assertTrue("Goals Of Treatment page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/GoalsOfTreatments"));
		Hooks.scenario.log("User is on the Goals Of Treatment page");
		clinicalPage.cannotAddOrEditGoalsOfTreatment();

	}

	@And("the user should not be able to add or delete Goals Of Treatment in Clinical Module test")
	public void verifyUserCannotAddOrDeleteGoalsOfTreatment() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String goalsOfTreatmentUrl = Hooks.prop.getProperty("goalsOfTreatmentUrl");
		Assert.assertNotNull("goalsOfTreatmentUrl is missing in config", goalsOfTreatmentUrl);
		String fullGoalsOfTreatmentUrl = baseUrl + goalsOfTreatmentUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullGoalsOfTreatmentUrl);
		Assert.assertTrue("Goals Of Treatment page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/GoalsOfTreatments"));
		Hooks.scenario.log("User is on the Goals Of Treatment page");
		clinicalPage.cannotAddOrDeleteGoalsOfTreatment();

	}

	@And("the user should not be able to edit or delete Goals Of Treatment in Clinical Module test")
	public void verifyUserCannotEditOrDeleteGoalsOfTreatment() {
		clinicalPage.cannotEditOrDeleteGoalsOfTreatment();

	}

	// Prior Authorization Types
	@And("I create a profile with View and Delete access only to Clinical Module Prior Authorization Types test")
	public void createProfileWithViewAndDeleteAccessForClinicalPriorAuthorizationTypes() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalPriorAuthTypesViewDeleteProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Edit access only to Clinical Module Prior Authorization Types test")
	public void createProfileWithViewAndEditAccessForClinicalPriorAuthorizationTypes() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalPriorAuthTypesViewEditProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View and Add access only to Clinical Module Prior Authorization Types test")
	public void createProfileViewAddAccessForPriorAuthorizationTypes() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createViewAddProfileForPriorAuthTypes();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should be able to view and add Prior Authorization Types in Clinical Module test")
	public void verifyUserCanViewAndAddPriorAuthTypes() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String priorAuthTypesUrl = Hooks.prop.getProperty("priorAuthTypesUrl");
		Assert.assertNotNull("priorAuthTypesUrl is missing in config", priorAuthTypesUrl);
		String fullPriorAuthTypesUrl = baseUrl + priorAuthTypesUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullPriorAuthTypesUrl);
		Assert.assertTrue("Prior Authorization Types page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PriorAuthorizationTypes"));
		Hooks.scenario.log("User is on the Prior Authorization Types page");
		clinicalPage.addPriorAuthorizationType();
	}

	@And("the user should be able to view and edit Prior Authorization Types in Clinical Module test")
	public void verifyUserCanViewAndEditPriorAuthorizationTypes() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String priorAuthTypesUrl = Hooks.prop.getProperty("priorAuthTypesUrl");
		Assert.assertNotNull("priorAuthTypesUrl is missing in config", priorAuthTypesUrl);
		String fullPriorAuthTypesUrl = baseUrl + priorAuthTypesUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullPriorAuthTypesUrl);
		Assert.assertTrue("Prior Authorization Types page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PriorAuthorizationTypes"));
		Hooks.scenario.log("User is on the Prior Authorization Types page");
		clinicalPage.canViewAndEditPriorAuthorizationTypes();
	}

	@And("the user should be able to view and delete Prior Authorization Types in Clinical Module test")
	public void verifyUserCanViewAndDeletePriorAuthorizationTypes() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String priorAuthTypesUrl = Hooks.prop.getProperty("priorAuthTypesUrl");
		Assert.assertNotNull("priorAuthTypesUrl is missing in config", priorAuthTypesUrl);
		String fullPriorAuthTypesUrl = baseUrl + priorAuthTypesUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullPriorAuthTypesUrl);
		Assert.assertTrue("Prior Authorization Types page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PriorAuthorizationTypes"));
		Hooks.scenario.log("User is on the Prior Authorization Types page");
		clinicalPage.canViewAndDeletePriorAuthorizationTypes();
	}

	@And("the user should not be able to add or edit Prior Authorization Types in Clinical Module test")
	public void verifyUserCannotAddOrEditPriorAuthorizationTypes() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String priorAuthTypesUrl = Hooks.prop.getProperty("priorAuthTypesUrl");
		Assert.assertNotNull("priorAuthTypesUrl is missing in config", priorAuthTypesUrl);
		String fullPriorAuthTypesUrl = baseUrl + priorAuthTypesUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullPriorAuthTypesUrl);
		Assert.assertTrue("Prior Authorization Types page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PriorAuthorizationTypes"));
		Hooks.scenario.log("User is on the Prior Authorization Types page");
		clinicalPage.cannotAddOrEditPriorAuthorizationTypes();
	}

	@And("the user should not be able to add or delete Prior Authorization Types in Clinical Module test")
	public void verifyUserCannotAddOrDeletePriorAuthorizationTypes() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String priorAuthTypesUrl = Hooks.prop.getProperty("priorAuthTypesUrl");
		Assert.assertNotNull("priorAuthTypesUrl is missing in config", priorAuthTypesUrl);
		String fullPriorAuthTypesUrl = baseUrl + priorAuthTypesUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		Hooks.driver.get(fullPriorAuthTypesUrl);
		Assert.assertTrue("Prior Authorization Types page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PriorAuthorizationTypes"));
		Hooks.scenario.log("User is on the Prior Authorization Types page");
		clinicalPage.cannotAddOrDeletePriorAuthorizationTypes();
	}

	@And("the user should not be able to edit or delete Prior Authorization Type test")
	public void verifyUserCannotEditOrDeletePriorAuthorizationType() {
		clinicalPage.cannotEditOrDeletePriorAuthorizationType();
	}

	// Component Information
	@And("the user should not be able to update Component Information in Clinical Module test")
	public void verifyUserCannotUpdateClinicalComponent() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalComponentUrl = Hooks.prop.getProperty("clinicalComponentUrl");
		Assert.assertNotNull("clinicalComponentUrl is missing in config", clinicalComponentUrl);
		String fullClinicalComponentUrl = baseUrl + clinicalComponentUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openclinicalComponentPage(fullClinicalComponentUrl);
		Assert.assertTrue("Clinical Component Information page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ClinicalSOAPComponentSetting"));
		Hooks.scenario.log("User is on the Clinical Component Information page");
		clinicalPage.cannotUpdateClinicalComponent();
	}

	@And("the user should be able to update Component Information in Clinical Module test")
	public void verifyUserCanUpdateClinicalComponentInformation() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalComponentUrl = Hooks.prop.getProperty("clinicalComponentUrl");
		Assert.assertNotNull("clinicalComponentUrl is missing in config", clinicalComponentUrl);
		String fullClinicalComponentUrl = baseUrl + clinicalComponentUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openclinicalComponentPage(fullClinicalComponentUrl);
		Assert.assertTrue("Clinical Component Information page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ClinicalSOAPComponentSetting"));
		Hooks.scenario.log("User is on the Clinical Component Information page");
		clinicalPage.updateComponentInfoTest();
	}

	@And("I create a profile with Update access only to Clinical Module Component Information test")
	public void createProfileWithUpdateAccessOnlyForClinicalComponentInformation() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createUpdateOnlyProfileForClinicalComponent();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with No Update access to Clinical Module Component Information test")
	public void createProfileNoUpdateAccessForClinicalComponent() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createNoUpdateProfileForClinicalComponent();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	// Audit View
	@And("the user should be able to view General Audit View settings in Clinical Module test")
	public void verifyUserCanViewGeneralAuditViewSettingsInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		Hooks.scenario.log("User is on the Clinical Prior Authorizations page");
		clinicalPage.verifyGeneralAuditViewSettings();

	}

	@And("I create a profile with No access to Clinical Module General Audit View test")
	public void createProfileWithNoAccessToClinicalGeneralAuditView() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createClinicalProfileNoAuditView();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("I create a profile with View access only to Clinical Module General Audit View test")
	public void createProfileWithViewAccessOnlyForClinicalModuleGeneralAuditViewTest() {
		clinicalPage.clickFilterButton();
		clinicalPage.enterProfileName("Sunil");
		clinicalPage.clickSearchButton();
		clinicalPage.clickActionMenu();
		clinicalPage.clickEditButton();
		clinicalPage.createViewOnlyClinicalGeneralAuditProfile();
		clinicalPage.clickSubmitButton();
		System.out.println("Profile updated with Add, Edit, and Delete access to Patient Vitals");
		Hooks.scenario.log("Profile updated with Add, Edit, and Delete access to Patient Vitals");
	}

	@And("the user should not be able to view General Audit View settings in Clinical Module test")
	public void verifyUserCannotViewGeneralAuditViewInClinicalModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalPriorAuthorizationsUrl = Hooks.prop.getProperty("clinicalPriorAuthorizationsUrl");
		Assert.assertNotNull("clinicalPriorAuthorizationsUrl is missing in config", clinicalPriorAuthorizationsUrl);
		String fullClinicalPriorAuthorizationsUrl = baseUrl + clinicalPriorAuthorizationsUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalPriorAuthorizationsPage(fullClinicalPriorAuthorizationsUrl);
		Assert.assertTrue("Clinical Prior Authorizations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Clinical/Home/ClinicalPriorAuthorizations"));
		Hooks.scenario.log("User is on the Clinical Prior Authorizations page");
		clinicalPage.cannotViewGeneralAuditViewInClinicalModule();

	}

	// Profile
	@And("the Clinical user should be able to view Profiles test")
	public void clinicalUserShouldBeAbleToViewProfiles() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalProfilesUrl = Hooks.prop.getProperty("profilesPageUrl");
		Assert.assertNotNull("profilesPageUrl is missing in config", clinicalProfilesUrl);
		String fullProfilesUrl = baseUrl + clinicalProfilesUrl;
		clinicalPage = new clinicalpage(Hooks.driver);
		clinicalPage.openClinicalProfilesPage(fullProfilesUrl);
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Profiles"));
		Hooks.scenario.log("Clinical user is on the Profiles page");
	}

	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

}
