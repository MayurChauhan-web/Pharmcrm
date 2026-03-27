package com.pharmcrm_SetupModule.steps;

import org.junit.Assert;
import org.junit.Assume;
import com.pharmcrm_SetupModule.pages.setuppage;
import hooks.Hooks;
import io.cucumber.java.en.And;

public class setupstep {

	private setuppage setupPage;

	// Settings
	@And("Add Form Category Blank field Validation should have to display")
	public void addFormCategoryBlankFieldValidationShouldBeDisplayed() throws InterruptedException {
		String result = setupPage.formCategoryBlankFieldErrorShouldBeShown();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Form Categories page")
	public void userShouldBeAbleToViewFormCategoriesPage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String formCategoriesUrl = Hooks.prop.getProperty("formCategoriesUrl");

		Assert.assertNotNull("formCategoriesUrl is missing in config", formCategoriesUrl);

		String fullUrl = baseUrl + formCategoriesUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openFormCategoriesPage(fullUrl);

		Assert.assertTrue("Form Categories page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/FormsCategories"));
	}

	@And("Add Template Blank field Validation should have to display")
	public void addTemplateBlankFieldValidationShouldBeDisplayed() throws InterruptedException {
		String result = setupPage.templateBlankFieldErrorShouldBeShown();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Templates page")
	public void userShouldBeAbleToViewTemplatesPage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String templatesUrl = Hooks.prop.getProperty("templatesUrl");

		Assert.assertNotNull("templatesUrl is missing in config", templatesUrl);

		String fullUrl = baseUrl + templatesUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openTemplatesPage(fullUrl);

		Assert.assertTrue("Templates page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Templates"));
	}

	@And("Add Provider Service Blank field Validation should have to display")
	public void addProviderServiceBlankFieldValidationShouldBeDisplayed() throws InterruptedException {
		String result = setupPage.providerServiceBlankFieldErrorShouldBeShown();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Service page")
	public void userShouldBeAbleToViewServicePage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String servicesUrl = Hooks.prop.getProperty("servicesUrl");

		Assert.assertNotNull("servicesUrl is missing in config", servicesUrl);

		String fullUrl = baseUrl + servicesUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openServicesPage(fullUrl);

		Assert.assertTrue("Service page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Services"));
	}

	@And("Add Provider Specialty Blank field Validation should have to display")
	public void addProviderSpecialtyBlankFieldValidationShouldBeDisplayed() throws InterruptedException {
		String result = setupPage.providerSpecialtyBlankFieldErrorShouldBeShown();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Specialty page")
	public void userShouldBeAbleToViewSpecialtyPage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String specialtiesUrl = Hooks.prop.getProperty("specialtiesUrl");

		Assert.assertNotNull("specialtiesUrl is missing in config", specialtiesUrl);

		String fullUrl = baseUrl + specialtiesUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openSpecialtiesPage(fullUrl);

		Assert.assertTrue("Specialty page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Specialties"));
	}

	@And("Add Provider Category Blank field Validation should have to display")
	public void shouldDisplayBlankFieldValidationForAddProviderCategory() throws InterruptedException {
		String result = setupPage.shouldShowBlankFieldValidationForAddProviderCategory();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Category page")
	public void shouldUserBeAbleToViewCategoryPage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String categoriesUrl = Hooks.prop.getProperty("categoriesUrl");

		Assert.assertNotNull("categoriesUrl is missing in config", categoriesUrl);

		String fullUrl = baseUrl + categoriesUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openCategoriesPage(fullUrl);

		Assert.assertTrue("Category page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Categories"));
	}

	@And("Add Provider Type Blank field Validation should have to display")
	public void shouldEnforceBlankFieldValidationForAddProviderType() throws InterruptedException {
		String result = setupPage.shouldDisplayValidationForEmptyFieldsInProviderType();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Provider Type page")
	public void shouldUserBeAbleToViewProviderTypePage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerTypesUrl = Hooks.prop.getProperty("providerTypesUrl");

		Assert.assertNotNull("providerTypesUrl is missing in config", providerTypesUrl);

		String fullUrl = baseUrl + providerTypesUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openProviderTypesPage(fullUrl);

		Assert.assertTrue("Provider Type page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ProviderTypes"));
	}

	@And("Add CPT Code Blank field Validation should have to display")
	public void shouldDisplayBlankFieldValidationForAddCPTCode() throws InterruptedException {
		String result = setupPage.shouldShowBlankFieldValidationForAddCPTCode();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view CPT Code page")
	public void shouldUserBeAbleToViewCPTCodePage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String cptCodesUrl = Hooks.prop.getProperty("cptCodesUrl");

		Assert.assertNotNull("cptCodesUrl is missing in config", cptCodesUrl);

		String fullUrl = baseUrl + cptCodesUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openCPTCodesPage(fullUrl);

		Assert.assertTrue("CPT Code page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/CPTCodes"));
	}

	@And("Add RPM Status Blank field Validation should have to display")
	public void shouldDisplayBlankFieldValidationForAddRPMStatus() throws InterruptedException {
		String result = setupPage.shouldShowBlankFieldValidationForAddRPMStatus();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Patient RemoteMonitoring Status page")
	public void shouldUserBeAbleToViewPatientRemoteMonitoringStatusPage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientRemoteMonitoringStatusesUrl = Hooks.prop.getProperty("patientRemoteMonitoringStatusesUrl");

		Assert.assertNotNull("patientRemoteMonitoringStatusesUrl is missing in config",
				patientRemoteMonitoringStatusesUrl);

		String fullUrl = baseUrl + patientRemoteMonitoringStatusesUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openPatientRemoteMonitoringStatusesPage(fullUrl);

		Assert.assertTrue("Patient Remote Monitoring Status page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PatientRemoteMonitoringStatuses"));
	}

	@And("Add Registered Device Blank field Validation should have to display")
	public void shouldDisplayBlankFieldValidationForAddRegisteredDevice() throws InterruptedException {
		String result = setupPage.shouldShowBlankFieldValidationForAddRegisteredDevice();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Registered Devices page")
	public void shouldUserBeAbleToViewRegisteredDevicesPage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String registeredDevicesUrl = Hooks.prop.getProperty("registeredDevicesUrl");

		Assert.assertNotNull("registeredDevicesUrl is missing in config", registeredDevicesUrl);

		String fullUrl = baseUrl + registeredDevicesUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openRegisteredDevicesPage(fullUrl);

		Assert.assertTrue("Registered Devices page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/RegisteredDevices"));
	}

	@And("Add Encounter Status Blank field Validation should have to display")
	public void shouldDisplayBlankFieldValidationForAddEncounterStatus() throws InterruptedException {
		String result = setupPage.shouldShowBlankFieldValidationForAddEncounterStatus();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Encounter Status page")
	public void shouldUserBeAbleToViewEncounterStatusPage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalEncounterStatusesUrl = Hooks.prop.getProperty("clinicalEncounterStatusesUrl");

		Assert.assertNotNull("clinicalEncounterStatusesUrl is missing in config", clinicalEncounterStatusesUrl);

		String fullUrl = baseUrl + clinicalEncounterStatusesUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openClinicalEncounterStatusesPage(fullUrl);

		Assert.assertTrue("Encounter Status page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ClinicalEncounterStatuses"));
	}

	@And("Add ROS Group Type Blank field Validation should have to display")
	public void shouldDisplayBlankFieldValidationForAddROSGroupType() throws InterruptedException {
		String result = setupPage.shouldShowBlankFieldValidationForAddROSGroupType();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view ROS Group Type page")
	public void shouldUserBeAbleToViewROSGroupTypePage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rosGroupTypesUrl = Hooks.prop.getProperty("rosGroupTypesUrl");

		Assert.assertNotNull("rosGroupTypesUrl is missing in config", rosGroupTypesUrl);

		String fullUrl = baseUrl + rosGroupTypesUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openROSGroupTypesPage(fullUrl);

		Assert.assertTrue("ROS Group Type page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ROSGroupTypes"));
	}

	@And("Add Remote Monitoring Parameter Blank field Validation should have to display")
	public void shouldDisplayBlankFieldValidationForAddRemoteMonitoringParameter() throws InterruptedException {
		String result = setupPage.shouldShowBlankFieldValidationForAddRemoteMonitoringParameter();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Remote Monitoring Parameter page")
	public void shouldUserBeAbleToViewRemoteMonitoringParameterPage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String remoteMonitoringParametersUrl = Hooks.prop.getProperty("remoteMonitoringParametersUrl");

		Assert.assertNotNull("remoteMonitoringParametersUrl is missing in config", remoteMonitoringParametersUrl);

		String fullUrl = baseUrl + remoteMonitoringParametersUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openRemoteMonitoringParametersPage(fullUrl);

		Assert.assertTrue("Remote Monitoring Parameter page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/RemoteMonitoringParameters"));
	}

	@And("Add Outcome Action Blank field Validation should have to display")
	public void shouldDisplayBlankFieldValidationForAddOutcomeAction() throws InterruptedException {
		String result = setupPage.shouldShowBlankFieldValidationForAddOutcomeAction();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Outcome Of Action page")
	public void shouldUserBeAbleToViewOutcomeOfActionPage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String outcomeActionsUrl = Hooks.prop.getProperty("outcomeActionsUrl");

		Assert.assertNotNull("outcomeActionsUrl is missing in config", outcomeActionsUrl);

		String fullUrl = baseUrl + outcomeActionsUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openOutcomeActionsPage(fullUrl);

		Assert.assertTrue("Outcome Of Action page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/OutcomeActions"));
	}

	@And("Add ROS Information Blank field Validation should have to display")
	public void shouldDisplayBlankFieldValidationForAddROSInformation() throws InterruptedException {
		String result = setupPage.shouldShowBlankFieldValidationForAddROSInformation();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view ROSs page")
	public void shouldUserBeAbleToViewROSPage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rossUrl = Hooks.prop.getProperty("rossUrl");

		Assert.assertNotNull("rossUrl is missing in config", rossUrl);

		String fullUrl = baseUrl + rossUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openROSSPage(fullUrl);

		Assert.assertTrue("ROSs page is not displayed", Hooks.driver.getCurrentUrl().contains("/Setup/Home/ROSs"));
	}

	@And("Add Clinical Intervention Blank field Validation should have to display")
	public void shouldDisplayBlankFieldValidationForAddClinicalIntervention() throws InterruptedException {
		String result = setupPage.shouldShowBlankFieldValidationForAddClinicalIntervention();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Clinical Interventions page")
	public void shouldUserBeAbleToViewClinicalInterventionsPage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalInterventionsUrl = Hooks.prop.getProperty("clinicalInterventionsUrl");

		Assert.assertNotNull("clinicalInterventionsUrl is missing in config", clinicalInterventionsUrl);

		String fullUrl = baseUrl + clinicalInterventionsUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openClinicalInterventionsPage(fullUrl);

		Assert.assertTrue("Clinical Interventions page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ClinicalInterventions"));
	}

	@And("Add Community Resource Blank field Validation should have to display")
	public void shouldDisplayBlankFieldValidationForAddCommunityResource() throws InterruptedException {
		String result = setupPage.shouldShowBlankFieldValidationForAddCommunityResource();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Community Resource page")
	public void shouldUserBeAbleToViewCommunityResourcePage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String communityResourcesUrl = Hooks.prop.getProperty("communityResourcesUrl");

		Assert.assertNotNull("communityResourcesUrl is missing in config", communityResourcesUrl);

		String fullUrl = baseUrl + communityResourcesUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openCommunityResourcesPage(fullUrl);

		Assert.assertTrue("Community Resource page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/CommunityResources"));
	}

	@And("Add Barriers Blank field Validation should have to display")
	public void shouldDisplayBlankFieldValidationForAddBarriers() throws InterruptedException {
		String result = setupPage.shouldShowBlankFieldValidationForAddBarriers();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Barrier page")
	public void shouldUserBeAbleToViewBarrierPage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String barriersUrl = Hooks.prop.getProperty("barriersUrl");

		Assert.assertNotNull("barriersUrl is missing in config", barriersUrl);

		String fullUrl = baseUrl + barriersUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openBarriersPage(fullUrl);

		Assert.assertTrue("Barrier page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Barriers"));
	}

	@And("Add Goals Of Treatment Type Blank field Validation should have to display")
	public void shouldDisplayBlankFieldValidationForAddGoalsOfTreatmentType() throws InterruptedException {
		String result = setupPage.shouldShowBlankFieldValidationForAddGoalsOfTreatmentType();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Goals Of Treatments page")
	public void shouldUserBeAbleToViewGoalsOfTreatmentsPage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String goalsOfTreatmentsUrl = Hooks.prop.getProperty("goalsOfTreatmentsUrl");

		Assert.assertNotNull("goalsOfTreatmentsUrl is missing in config", goalsOfTreatmentsUrl);

		String fullUrl = baseUrl + goalsOfTreatmentsUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openGoalsOfTreatmentsPage(fullUrl);

		Assert.assertTrue("Goals Of Treatments page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/GoalsOfTreatments"));
	}

	@And("Add Prior Authorization Type Blank field Validation should have to display")
	public void shouldDisplayBlankFieldValidationForAddPriorAuthorizationType() throws InterruptedException {
		String result = setupPage.shouldShowBlankFieldValidationForAddPriorAuthorizationType();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Prior Authorization Type page")
	public void shouldUserBeAbleToViewPriorAuthorizationTypePage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String priorAuthorizationTypesUrl = Hooks.prop.getProperty("priorAuthorizationTypesUrl");

		Assert.assertNotNull("priorAuthorizationTypesUrl is missing in config", priorAuthorizationTypesUrl);

		String fullUrl = baseUrl + priorAuthorizationTypesUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openPriorAuthorizationTypesPage(fullUrl);

		Assert.assertTrue("Prior Authorization Type page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PriorAuthorizationTypes"));
	}

	@And("Add Clinical Location Blank field Validation should have to display")
	public void shouldDisplayBlankFieldValidationForAddClinicalLocation() throws InterruptedException {
		String result = setupPage.shouldShowBlankFieldValidationForAddClinicalLocation();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Clininc Locations page")
	public void shouldUserBeAbleToViewClinicLocationsPage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicLocationsUrl = Hooks.prop.getProperty("clinicLocationsUrl");

		Assert.assertNotNull("clinicLocationsUrl is missing in config", clinicLocationsUrl);

		String fullUrl = baseUrl + clinicLocationsUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openClinicLocationsPage(fullUrl);

		Assert.assertTrue("Clinic Locations page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ClinicLocations"));
	}

	@And("Add Appointment Reminder Setting Blank field Validation should have to display")
	public void shouldDisplayBlankFieldValidationForAddAppointmentReminderSetting() throws InterruptedException {
		String result = setupPage.shouldShowBlankFieldValidationForAddAppointmentReminderSetting();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Appointment Reminder Setting page")
	public void shouldUserBeAbleToViewAppointmentReminderSettingsPage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String appointmentReminderSettingUrl = Hooks.prop.getProperty("appointmentReminderSettingUrl");

		Assert.assertNotNull("appointmentReminderSettingUrl is missing in config", appointmentReminderSettingUrl);

		String fullUrl = baseUrl + appointmentReminderSettingUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openAppointmentReminderSettingPage(fullUrl);

		Assert.assertTrue("Appointment Reminder Setting page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/AppointmentReminderSetting"));
	}

	@And("Add Clinical Upload Wizard Template Blank field Validation should have to display")
	public void shouldDisplayBlankFieldValidationForAddClinicalUploadWizardTemplate() throws InterruptedException {
		String result = setupPage.shouldShowBlankFieldValidationForAddClinicalUploadWizardTemplate();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Clinical Upload Wizard Templates page")
	public void shouldUserBeAbleToViewClinicalUploadWizardTemplatesPage() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String uploadWizardTemplatesUrl = Hooks.prop.getProperty("uploadWizardTemplatesUrl");

		Assert.assertNotNull("uploadWizardTemplatesUrl is missing in config", uploadWizardTemplatesUrl);

		String fullUrl = baseUrl + uploadWizardTemplatesUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openUploadWizardClinicalQueueTemplatesPage(fullUrl);

		Assert.assertTrue("Upload Wizard Clinical Queue Templates page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/UploadWizardClinicalQueueTemplates"));
	}

	@And("Add Clinical Queue Rule Blank field Validation should have to display")
	public void shouldDisplayBlankFieldValidationForAddClinicalQueueRule() throws InterruptedException {
		String result = setupPage.shouldShowBlankFieldValidationForAddClinicalQueueRule();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Upload Wizard Settings page")
	public void shouldUserBeAbleToViewUploadWizardSettingsPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalQueueSettingUrl = Hooks.prop.getProperty("clinicalQueueSettingUrl");

		Assert.assertNotNull("clinicalQueueSettingUrl is missing in config", clinicalQueueSettingUrl);

		String fullUrl = baseUrl + clinicalQueueSettingUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openClinicalQueueSettingPage(fullUrl);

		Assert.assertTrue("Upload Wizard Settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ClinicalQueueSetting"));
	}

	@And("Clinical WorkFlow Add Queue Blank field Validation should have to display")
	public void shouldDisplayBlankFieldValidationForClinicalWorkflowAddQueue() throws InterruptedException {
		String result = setupPage.displayBlankFieldValidationForAddQueueInClinicalWorkflow();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Clinical Queues page")
	public void shouldUserBeAbleToViewClinicalQueuesPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalQueuesUrl = Hooks.prop.getProperty("clinicalQueuesUrl");

		Assert.assertNotNull("clinicalQueuesUrl is missing in config", clinicalQueuesUrl);

		String fullUrl = baseUrl + clinicalQueuesUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openClinicalQueuesPage(fullUrl);

		Assert.assertTrue("Clinical Queues page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ClinicalQueues"));
	}

	@And("Add prescription Status Blank field Validation should have to display")
	public void userShouldSeeBlankFieldValidationOnPrescriptionStatusPage() throws InterruptedException {
		String result = setupPage.blankFieldValidationShouldBeDisplayedOnPrescriptionStatusPage();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Prescription Status page")
	public void userShouldBeAbleToViewPrescriptionStatusPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String prescriptionStatusUrl = Hooks.prop.getProperty("prescriptionStatusUrl");

		Assert.assertNotNull("prescriptionStatusUrl is missing in config", prescriptionStatusUrl);

		String fullUrl = baseUrl + prescriptionStatusUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openPrescriptionStatusPage(fullUrl);

		Assert.assertTrue("Prescription Status page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PrescriptionStatuses"));
	}

	@And("Add 340B Program Blank field Validation should have to display")
	public void program340BBlankFieldValidationShouldBeDisplayed() throws InterruptedException {
		String result = setupPage.userShouldSeeBlankFieldValidationOnProgram340BPage();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Program 340B page")
	public void userShouldBeAbleToViewProgram340BPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String program340BUrl = Hooks.prop.getProperty("program340BUrl");

		Assert.assertNotNull("program340BUrl is missing in config", program340BUrl);

		String fullUrl = baseUrl + program340BUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openProgram340BPage(fullUrl);

		Assert.assertTrue("Program 340B page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Program340Bs"));
	}

	@And("Add Outgoing Call Type Blank field Validation should have to display")
	public void outgoingCallTypesBlankFieldValidationShouldBeDisplayed() throws InterruptedException {
		String result = setupPage.userShouldSeeBlankFieldValidationOnOutgoingCallTypesPage();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Outgoing Call Types page")
	public void userShouldBeAbleToViewOutgoingCallTypesPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String outgoingCallTypesUrl = Hooks.prop.getProperty("outgoingCallTypesUrl");

		Assert.assertNotNull("outgoingCallTypesUrl is missing in config", outgoingCallTypesUrl);

		String fullUrl = baseUrl + outgoingCallTypesUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openOutgoingCallTypesPage(fullUrl);

		Assert.assertTrue("Outgoing Call Types page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/OutgoingCalls"));
	}

	@And("Add InComing Call Types Blank field Validation should have to display")
	public void userShouldSeeBlankFieldValidationOnIncomingCallTypesPage() throws InterruptedException {
		String result = setupPage.blankFieldValidationShouldBeDisplayedOnIncomingCallTypesPage();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Incoming Call Types page")
	public void userShouldBeAbleToViewIncomingCallTypesPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String incomingCallTypesUrl = Hooks.prop.getProperty("incomingCallTypesUrl");

		Assert.assertNotNull("incomingCallTypesUrl is missing in config", incomingCallTypesUrl);

		String fullUrl = baseUrl + incomingCallTypesUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openIncomingCallTypesPage(fullUrl);

		Assert.assertTrue("Incoming Call Types page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/IncomingCalls"));
	}

	@And("Add Runningline Level-2 Status Blank field Validation should have to display")
	public void runninglineLevel2StatusBlankFieldValidationShouldBeDisplayed() throws InterruptedException {
		String result = setupPage.userShouldSeeBlankFieldValidationOnRunninglineLevel2StatusPage();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Runningline Level2 Status page")
	public void userShouldBeAbleToViewRunninglineLevel2StatusPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String runninglineLevel2StatusUrl = Hooks.prop.getProperty("runninglineLevel2StatusUrl");

		Assert.assertNotNull("runninglineLevel2StatusUrl is missing in config", runninglineLevel2StatusUrl);

		String fullUrl = baseUrl + runninglineLevel2StatusUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openRunninglineLevel2StatusPage(fullUrl);

		Assert.assertTrue("Runningline Level2 Status page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/RunninglineLevel2Statuses"));
	}

	@And("Add Runningline Level 1 Status Blank field Validation should have to display")
	public void runninglineLevel1StatusBlankFieldValidationShouldBeDisplayed() throws InterruptedException {
		String result = setupPage.userShouldSeeBlankFieldValidationOnRunninglineLevel1StatusPage();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Runningline Level1 Status page")
	public void userShouldBeAbleToViewRunninglineLevel1StatusPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String runninglineLevel1StatusUrl = Hooks.prop.getProperty("runninglineLevel1StatusUrl");

		Assert.assertNotNull("runninglineLevel1StatusUrl is missing in config", runninglineLevel1StatusUrl);

		String fullUrl = baseUrl + runninglineLevel1StatusUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openRunninglineLevel1StatusPage(fullUrl);

		Assert.assertTrue("Runningline Level1 Status page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/RunninglineLevel1Statuses"));
	}

	@And("Add Runningline Status Blank field Validation should have to display")
	public void runninglineStatusBlankFieldValidationShouldBeDisplayed() throws InterruptedException {
		String result = setupPage.userShouldSeeBlankFieldValidationOnRunninglineStatusPage();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Runningline Status page")
	public void userShouldBeAbleToViewRunninglineStatusPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String runninglineStatusUrl = Hooks.prop.getProperty("runninglineStatusUrl");

		Assert.assertNotNull("runninglineStatusUrl is missing in config", runninglineStatusUrl);

		String fullUrl = baseUrl + runninglineStatusUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openRunninglineStatusPage(fullUrl);

		Assert.assertTrue("Runningline Status page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/RunninglineStatuses"));
	}

	@And("Upload Wizard Template Blank field Validation should have to display")
	public void uploadWizardTemplateBlankFieldValidationShouldBeDisplayed() throws InterruptedException {
		String result = setupPage.userShouldSeeValidationMessageForBlankFieldsInUploadWizardTemplate();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Upload Wizard Templates page")
	public void verifyUserCanViewUploadWizardTemplatesPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String uploadWizardTemplateUrl = Hooks.prop.getProperty("uploadWizardTemplateUrl");

		Assert.assertNotNull("uploadWizardTemplateUrl is missing in config", uploadWizardTemplateUrl);

		String fullUrl = baseUrl + uploadWizardTemplateUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openUploadWizardTemplatePage(fullUrl);

		Assert.assertTrue("Organization Upload Wizard Settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/UploadWizardTemplate"));
	}

	@And("Queue Rules Blank field Validation should have to display")
	public void queueRulesBlankFieldValidationShouldBeDisplayed() throws InterruptedException {
		String result = setupPage.shouldDisplayValidationForBlankQueueRulesFields();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Organization Upload Wizard Settings page")
	public void userShouldBeAbleToViewOrganizationUploadWizardSettingsPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String rxSettingPageUrl = Hooks.prop.getProperty("rxPageUrl");

		Assert.assertNotNull("rxSettingPageUrl is missing in config", rxSettingPageUrl);

		String fullUrl = baseUrl + rxSettingPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openRxSettingPage(fullUrl);

		Assert.assertTrue("Organization Upload Wizard Settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/RxSetting"));
	}

	@And("Add Queue Blank field Validation should have to display")
	public void addQueueBlankFieldValidationShouldBeDisplayed() throws InterruptedException {
		String result = setupPage.shouldDisplayValidationForBlankQueueFields();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Queues page")
	public void userShouldBeAbleToViewQueuesPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String queuesPageUrl = Hooks.prop.getProperty("queuesPageUrl");

		Assert.assertNotNull("queuesPageUrl is missing in config", queuesPageUrl);

		String fullUrl = baseUrl + queuesPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openQueuesPage(fullUrl);

		Assert.assertTrue("Queues page is not displayed", Hooks.driver.getCurrentUrl().contains("/Setup/Home/Queues"));
	}

	@And("Add Call Script Blank field Validation should have to display")
	public void addCallScriptBlankFieldValidationShouldBeDisplayed() throws InterruptedException {
		String result = setupPage.shouldDisplayValidationForBlankCallScriptFields();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Call Scripts page")
	public void userShouldBeAbleToViewCallScriptsPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String callScriptsPageUrl = Hooks.prop.getProperty("callScriptsPageUrl");

		Assert.assertNotNull("callScriptsPageUrl is missing in config", callScriptsPageUrl);

		String fullUrl = baseUrl + callScriptsPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openCallScriptsPage(fullUrl);

		Assert.assertTrue("Call Scripts page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/CallScripts"));
	}

	@And("Add Transfer Result Action Blank field Validation should have to display")
	public void addTransferResultActionBlankFieldValidationShouldBeDisplayed() throws InterruptedException {
		String result = setupPage.shouldDisplayValidationForBlankTransferResultActionFields();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Transfer Result Actions page")
	public void userShouldBeAbleToViewTransferResultActionsPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String transferResultActionsPageUrl = Hooks.prop.getProperty("transferResultActionsPageUrl");

		Assert.assertNotNull("transferResultActionsPageUrl is missing in config", transferResultActionsPageUrl);

		String fullUrl = baseUrl + transferResultActionsPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openTransferResultActionsPage(fullUrl);

		Assert.assertTrue("Transfer Result Actions page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/TransferResultActions"));
	}

	@And("Add Failure Result Action Blank field Validation should have to display")
	public void addFailureResultActionBlankFieldValidationShouldBeDisplayed() throws InterruptedException {
		String result = setupPage.shouldDisplayValidationForBlankFailureResultActionFields();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Failure Result Actions page")
	public void userShouldBeAbleToViewFailureResultActionsPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String failureResultActionsPageUrl = Hooks.prop.getProperty("failureResultActionsPageUrl");

		Assert.assertNotNull("failureResultActionsPageUrl is missing in config", failureResultActionsPageUrl);

		String fullUrl = baseUrl + failureResultActionsPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openFailureResultActionsPage(fullUrl);

		Assert.assertTrue("Failure Result Actions page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/FailureResultActions"));
	}

	@And("Add Success Result Action Blank field Validation should have to display")
	public void addSuccessResultActionBlankFieldValidationShouldBeDisplayed() throws InterruptedException {
		String result = setupPage.shouldDisplayValidationForBlankSuccessResultActionFields();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Success Result Actions page")
	public void userShouldBeAbleToViewSuccessResultActionsPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String successResultActionsPageUrl = Hooks.prop.getProperty("successResultActionsPageUrl");

		Assert.assertNotNull("successResultActionsPageUrl is missing in config", successResultActionsPageUrl);

		String fullUrl = baseUrl + successResultActionsPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openReminderResultActionsPage(fullUrl);

		Assert.assertTrue("Success Result Actions page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/SuccessResultActions"));
	}

	@And("Add Reminder Result Action Blank field Validation should have to display")
	public void addReminderResultActionBlankFieldValidationShouldBeDisplayed() throws InterruptedException {
		String result = setupPage.shouldDisplayValidationForBlankReminderResultActionFields();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Reminder Result Actions page")
	public void userShouldBeAbleToViewReminderResultActionsPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reminderResultActionsPageUrl = Hooks.prop.getProperty("reminderResultActionsPageUrl");

		Assert.assertNotNull("reminderResultActionsPageUrl is missing in config", reminderResultActionsPageUrl);

		String fullUrl = baseUrl + reminderResultActionsPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openReminderResultActionsPage(fullUrl);

		Assert.assertTrue("Reminder Result Actions page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ReminderResultActions"));
	}

	@And("Add Medication Sync Color Code Blank field Validation should have to display")
	public void addMedicationSyncColorCodeBlankFieldValidationShouldBeDisplayed() throws InterruptedException {
		String result = setupPage.shouldDisplayValidationForBlankMedicationSyncColorCodeFields();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Medication sync Reminder Color Codes page")
	public void userShouldBeAbleToViewMedicationSyncReminderColorCodesPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String medicationSyncReminderColorCodesPageUrl = Hooks.prop
				.getProperty("medicationSyncReminderColorCodesPageUrl");

		Assert.assertNotNull("medicationSyncReminderColorCodesPageUrl is missing in config",
				medicationSyncReminderColorCodesPageUrl);

		String fullUrl = baseUrl + medicationSyncReminderColorCodesPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openMedicationSyncReminderColorCodesPage(fullUrl);

		Assert.assertTrue("Medication Sync Reminder Color Codes page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/MedicationSyncReminderColorCodes"));
	}

	@And("Add Medication Sync Reminder Blank field Validation should have to display")
	public void addMedicationSyncReminderBlankFieldValidationShouldBeDisplayed() throws InterruptedException {
		String result = setupPage.shouldDisplayValidationForBlankMedicationSyncReminderFields();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Sync Workflow Setting page")
	public void userShouldBeAbleToViewSyncWorkflowSettingPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String medicationSyncReminderSettingPageUrl = Hooks.prop.getProperty("medicationSyncReminderSettingPageUrl");

		Assert.assertNotNull("medicationSyncReminderSettingPageUrl is missing in config",
				medicationSyncReminderSettingPageUrl);

		String fullUrl = baseUrl + medicationSyncReminderSettingPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openMedicationSyncReminderSettingPage(fullUrl);

		Assert.assertTrue("Sync Workflow Setting page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/MedicationSyncReminderSetting"));
	}

	@And("Patient Medication ColorCodes Blank field Validation should have to display")
	public void patientMedicationColorCodesBlankFieldValidationShouldBeDisplayed() throws InterruptedException {
		String result = setupPage.shouldDisplayValidationForBlankMedicationColorCodes();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Patient Medication ColorCodes page")
	public void userShouldBeAbleToViewPatientMedicationColorCodesPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientMedicationColorCodeSettingsPageUrl = Hooks.prop
				.getProperty("patientMedicationColorCodeSettingsPageUrl");

		Assert.assertNotNull("patientMedicationColorCodeSettingsPageUrl is missing in config",
				patientMedicationColorCodeSettingsPageUrl);

		String fullUrl = baseUrl + patientMedicationColorCodeSettingsPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openPatientMedicationColorCodeSettingsPage(fullUrl);

		Assert.assertTrue("Patient Medication ColorCodes page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PatientMedicationColorCodeSettings"));
	}

	@And("Intake Form Setting Blank field Validation should have to display")
	public void intakeFormSettingBlankFieldValidationShouldBeDisplayed() throws InterruptedException {
		String result = setupPage.shouldDisplayValidationForBlankIntakeFormSettings();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Intake Form Setting page")
	public void userShouldBeAbleToViewIntakeFormSettingPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String intakeFormNoticeSettingPageUrl = Hooks.prop.getProperty("intakeFormNoticeSettingPageUrl");

		Assert.assertNotNull("intakeFormNoticeSettingPageUrl is missing in config", intakeFormNoticeSettingPageUrl);

		String fullUrl = baseUrl + intakeFormNoticeSettingPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openIntakeFormNoticeSettingPage(fullUrl);

		Assert.assertTrue("Intake Form Setting page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/IntakeFormNoticeSetting"));
	}

	@And("Consent Setting Blank field Validation should have to display")
	public void consentSettingBlankFieldValidationShouldBeDisplayed() throws InterruptedException {
		String result = setupPage.shouldDisplayValidationForBlankConsentSettings();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Consent Setting page")
	public void userShouldBeAbleToViewConsentSettingPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientSettingPageUrl = Hooks.prop.getProperty("patientSettingPageUrl");

		Assert.assertNotNull("patientSettingPageUrl is missing in config", patientSettingPageUrl);

		String fullUrl = baseUrl + patientSettingPageUrl;

		setupPage = new setuppage(Hooks.driver);
		setupPage.openPatientSettingPage(fullUrl);

		Assert.assertTrue("Consent Setting page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PatientSetting"));
	}

	@And("Create Event Blank field Validation  should have to display")
	public void createEventBlankFieldValidationShouldBeDisplayed() throws InterruptedException {
		String result = setupPage.shouldDisplayValidationForBlankEventFields();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Organization Calendar page")
	public void userShouldBeAbleToViewOrganizationCalendarPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String orgCalendarPageUrl = Hooks.prop.getProperty("orgCalendarPageUrl");
		Assert.assertNotNull("orgCalendarPageUrl is missing in config", orgCalendarPageUrl);
		String fullUrl = baseUrl + orgCalendarPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openOrgCalendarPage(fullUrl);
		Assert.assertTrue("Fax Settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/OrganizationCalendar"));
	}

	@And("Add FAX Setting Blank field Validation should have to display")
	public void addFaxSettingBlankFieldValidationShouldDisplay() throws InterruptedException {
		String result = setupPage.validateBlankFaxSettingFieldErrorMessage();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view FAX Setting page")
	public void userNavigatesToFaxSettingsPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String faxSettingsPageUrl = Hooks.prop.getProperty("faxSettingsPageUrl");
		Assert.assertNotNull("faxSettingsPageUrl is missing in config", faxSettingsPageUrl);
		String fullUrl = baseUrl + faxSettingsPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openFaxSettingsPage(fullUrl);
		Assert.assertTrue("Fax Settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/FaxSettings"));
	}

	@And("Add Professional License Type Blank field Validation  should have to display")
	public void verifyAddProfessionalLicenseTypeBlankFieldValidation() throws InterruptedException {
		String result = setupPage.shouldShowValidationOnBlankProfessionalLicenseTypeSubmit();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Professional License Types page")
	public void verifyProfessionalLicenseTypesPageIsDisplayed() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String professionalLicenseTypePageUrl = Hooks.prop.getProperty("professionalLicenseTypePageUrl");
		Assert.assertNotNull("professionalLicenseTypePageUrl is missing in config", professionalLicenseTypePageUrl);
		String fullUrl = baseUrl + professionalLicenseTypePageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openProfessionalLicenseTypePage(fullUrl);
		Assert.assertTrue("Professional License Type page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ProfessionalLicenseTypes"));
	}

	@And("Add Designation Blank field Validation should have to display")
	public void verifyAddDesignationBlankFieldValidation() throws InterruptedException {
		String result = setupPage.shouldShowValidationOnBlankDesignationSubmit();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Designations page")
	public void verifyDesignationsPageIsDisplayed() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String designationPageUrl = Hooks.prop.getProperty("designationPageUrl");
		Assert.assertNotNull("designationPageUrl is missing in config", designationPageUrl);
		String fullUrl = baseUrl + designationPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openDesignationPage(fullUrl);
		Assert.assertTrue("Designation page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Designations"));
	}

	@And("Exclude User Blank field Validation should have to display")
	public void verifyExcludeUserBlankFieldValidation() throws InterruptedException {
		String result = setupPage.shouldShowValidationOnBlankExcludeUserSubmit();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Add New IP Blank field Validation should have to display")
	public void verifyAddNewIPBlankFieldValidation() throws InterruptedException {
		String result = setupPage.shouldShowValidationOnBlankIPFieldSubmit();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Whitelist IP page")
	public void verifyWhitelistIPsPageIsDisplayed() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String whitelistIPsPageUrl = Hooks.prop.getProperty("whitelistIPsPageUrl");
		Assert.assertNotNull("whitelistIPsPageUrl is missing in config", whitelistIPsPageUrl);
		String fullUrl = baseUrl + whitelistIPsPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openWhitelistIPsPage(fullUrl);
		Assert.assertTrue("Whitelist IPs page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/WhitelistIPs"));
	}

	@And("Progress Steps Blank field Validation should have to display")
	public void verifyProgressStepsBlankFieldValidation() throws InterruptedException {
		String result = setupPage.shouldShowValidationOnBlankProgressStepsSubmit();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Progress Steps page")
	public void verifyProgressStepsPageIsDisplayed() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String progressStepPageUrl = Hooks.prop.getProperty("progressStepPageUrl");
		Assert.assertNotNull("progressStepPageUrl is missing in config", progressStepPageUrl);
		String fullUrl = baseUrl + progressStepPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openProgressStepPage(fullUrl);
		Assert.assertTrue("Progress Step page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ProgressStatuses"));
	}

	@And("Add EHR Type Blank field Validation should have to display")
	public void verifyAddEHRTypeBlankFieldValidation() throws InterruptedException {
		String result = setupPage.shouldShowValidationOnBlankEHRTypeFieldSubmit();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view EHR Types page")
	public void verifyEHRTypesPageIsDisplayed() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String ehrTypesPageUrl = Hooks.prop.getProperty("ehrTypesPageUrl");
		Assert.assertNotNull("ehrTypesPageUrl is missing in config", ehrTypesPageUrl);
		String fullUrl = baseUrl + ehrTypesPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openEhrTypesPage(fullUrl);
		Assert.assertTrue("EHR Types page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ExternalSources"));
	}

	@And("Text Forward Setting invalid email id validation should have to display")
	public void verifyTextForwardSettingInvalidEmailValidation() throws InterruptedException {
		String result = setupPage.shouldShowValidationOnInvalidEmailInTextForwardSetting();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Text Forward Setting page")
	public void verifyTextForwardSettingPageIsDisplayed() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String textForwardSettingPageUrl = Hooks.prop.getProperty("textForwardSettingPageUrl");
		Assert.assertNotNull("textForwardSettingPageUrl is missing in config", textForwardSettingPageUrl);
		String fullUrl = baseUrl + textForwardSettingPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openTextForwardSettingPage(fullUrl);
		Assert.assertTrue("Text Forward Setting page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/TextForwardSetting"));
	}

	@And("Notification Setting invalid email id validation should have to display")
	public void verifyNotificationSettingInvalidEmailValidation() throws InterruptedException {
		String result = setupPage.shouldShowValidationOnInvalidEmailInNotificationSetting();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Notification Setting page")
	public void verifyNotificationSettingPageIsDisplayed() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String notificationSettingPageUrl = Hooks.prop.getProperty("notificationSettingPageUrl");
		Assert.assertNotNull("notificationSettingPageUrl is missing in config", notificationSettingPageUrl);
		String fullUrl = baseUrl + notificationSettingPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openNotificationSettingPage(fullUrl);
		Assert.assertTrue("Technical Setting page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/NotificationSetting"));
	}

	@And("Technical Setting Blank Submit Validation should have to display")
	public void verifyTechnicalSettingBlankSubmitValidation() throws InterruptedException {
		String result = setupPage.shouldShowValidationOnBlankTechnicalSettingSubmit();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Technical Setting page")
	public void verifyTechnicalSettingPageIsDisplayed() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String technicalSettingPageUrl = Hooks.prop.getProperty("technicalSettingPageUrl");
		Assert.assertNotNull("technicalSettingPageUrl is missing in config", technicalSettingPageUrl);
		String fullUrl = baseUrl + technicalSettingPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openTechnicalSettingPage(fullUrl);
		Assert.assertTrue("Technical Setting page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/TechnicalSetting"));
	}

	@And("Send VCard Blank Submit Validation should have to display")
	public void verifySendVCardBlankSubmitValidation() throws InterruptedException {
		String result = setupPage.shouldShowValidationOnBlankSendVCardSubmit();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Brand Management Blank Submit Validation should have to display")
	public void verifyBrandManagementBlankSubmitValidation() throws InterruptedException {
		String result = setupPage.shouldShowValidationOnBlankBrandManagementSubmit();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Brand Management page")
	public void verifyBrandManagementPageIsDisplayed() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String brandManagementPageUrl = Hooks.prop.getProperty("brandManagementPageUrl");
		Assert.assertNotNull("brandManagementPageUrl is missing in config", brandManagementPageUrl);
		String fullUrl = baseUrl + brandManagementPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openBrandManagementPage(fullUrl);
		Assert.assertTrue("Brand Management page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/BrandManagement"));
	}

	// Reminders
	@And("Reminders Blank Submit Validation should have to display")
	public void verifyRemindersBlankSubmitValidation() throws InterruptedException {
		String result = setupPage.shouldShowValidationOnBlankRemindersSubmit();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Reminders page")
	public void verifyRemindersPageIsDisplayed() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String remindersPageUrl = Hooks.prop.getProperty("remindersPageUrl");
		Assert.assertNotNull("remindersPageUrl is missing in config", remindersPageUrl);
		String fullUrl = baseUrl + remindersPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openRemindersPage(fullUrl);
		Assert.assertTrue("Reminders page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Reminders"));
	}

	// Bucket
	@And("File Upload Blank Submit Validation should have to display")
	public void verifyFileUploadBlankSubmitValidation() throws InterruptedException {
		String result = setupPage.shouldShowValidationOnBlankFileUploadSubmit();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view File Upload page")
	public void verifyFileUploadPageIsDisplayed() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String organizationDocumentsPageUrl = Hooks.prop.getProperty("organizationDocumentsPageUrl");
		Assert.assertNotNull("organizationDocumentsPageUrl is missing in config", organizationDocumentsPageUrl);
		String fullOrganizationDocumentsUrl = baseUrl + organizationDocumentsPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openOrganizationDocumentsPage(fullOrganizationDocumentsUrl);
		Assert.assertTrue("Organization Documents page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/OrganizationDocuments"));
	}

	// Feedback Forms
	@And("Feedback Forms Blank Submit Validation should have to display")
	public void verifyFeedbackFormsBlankSubmitValidation() throws InterruptedException {
		String result = setupPage.shouldShowValidationOnBlankFeedbackFormsSubmit();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Feedback Forms page")
	public void verifyFeedbackFormsPageIsDisplayed() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String feedbackFormsPageUrl = Hooks.prop.getProperty("feedbackFormsPageUrl");
		Assert.assertNotNull("feedbackFormsPageUrl is missing in config", feedbackFormsPageUrl);
		String fullFeedbackFormsUrl = baseUrl + feedbackFormsPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openFeedbackFormsPage(fullFeedbackFormsUrl);
		Assert.assertTrue("Feedback Forms page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/FeedbackForms"));
	}

	// Patient Signature Templates
	@And("Patient Signature Templates Blank Submit Validation should have to display")
	public void verifyPatientSignatureTemplatesBlankSubmitValidation() throws InterruptedException {
		String result = setupPage.shouldShowValidationOnBlankPatientSignatureTemplatesSubmit();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Patient Signature Templates page")
	public void verifyPatientSignatureTemplatesPageIsDisplayed() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String patientSignatureTemplatesPageUrl = Hooks.prop.getProperty("patientSignatureTemplatesPageUrl");
		Assert.assertNotNull("patientSignatureTemplatesPageUrl is missing in config", patientSignatureTemplatesPageUrl);
		String fullPatientSignatureTemplatesUrl = baseUrl + patientSignatureTemplatesPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openPatientSignatureTemplatesPage(fullPatientSignatureTemplatesUrl);
		Assert.assertTrue("Patient Signature Templates page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PatientSignatureTemplates"));
	}

	// Fax Templates
	@And("Fax Templates Blank Submit Validation should have to display")
	public void verifyFaxTemplatesBlankSubmitValidation() throws InterruptedException {
		String result = setupPage.shouldShowValidationOnBlankFaxTemplatesSubmit();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Fax Templates page")
	public void verifyFaxTemplatesPageIsDisplayed() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String faxTemplatesPageUrl = Hooks.prop.getProperty("faxTemplatesPageUrl");
		Assert.assertNotNull("faxTemplatesPageUrl is missing in config", faxTemplatesPageUrl);
		String fullFaxTemplatesUrl = baseUrl + faxTemplatesPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openFaxTemplatesPage(fullFaxTemplatesUrl);
		Assert.assertTrue("Fax Templates page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/FaxTemplates"));
	}

	// BOT Call Templates
	@And("BOT Call Templates Blank Submit Validation should have to display")
	public void verifyBOTCallTemplatesBlankSubmitValidation() throws InterruptedException {
		String result = setupPage.shouldShowValidationOnBlankBOTCallTemplatesSubmit();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view BOT Call Templates page")
	public void verifyBOTCallTemplatesPageIsDisplayed() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String botCallTemplatesPageUrl = Hooks.prop.getProperty("botCallTemplatesPageUrl");
		Assert.assertNotNull("botCallTemplatesPageUrl is missing in config", botCallTemplatesPageUrl);
		String fullBotCallTemplatesUrl = baseUrl + botCallTemplatesPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openBotCallTemplatesPage(fullBotCallTemplatesUrl);
		Assert.assertTrue("BOT Call Templates page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/BOTCallTemplates"));
	}

	// Mail Templates
	@And("Mail Templates Blank Submit Validation should have to display")
	public void verifyMailTemplatesBlankSubmitValidation() throws InterruptedException {
		String result = setupPage.shouldShowValidationOnBlankMailTemplatesSubmit();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Mail Templates page")
	public void verifyMailTemplatesPageIsDisplayed() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String mailTemplatesPageUrl = Hooks.prop.getProperty("mailTemplatesPageUrl");
		Assert.assertNotNull("mailTemplatesPageUrl is missing in config", mailTemplatesPageUrl);
		String fullMailTemplatesUrl = baseUrl + mailTemplatesPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openMailTemplatesPage(fullMailTemplatesUrl);
		Assert.assertTrue("Mail Templates page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/MailTemplates"));
	}

	// Text template
	@And("Text Templates Blank Submit Validation should have to display")
	public void verifyTextTemplatesBlankSubmitValidation() throws InterruptedException {
		String result = setupPage.shouldShowValidationOnBlankTextTemplatesSubmit();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Text Templates page")
	public void verifyTextTemplatesPageIsDisplayed() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String smsTemplatesPageUrl = Hooks.prop.getProperty("smsTemplatesPageUrl");
		Assert.assertNotNull("smsTemplatesPageUrl is missing in config", smsTemplatesPageUrl);
		String fullSmsTemplatesUrl = baseUrl + smsTemplatesPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openSmsTemplatesPage(fullSmsTemplatesUrl);
		Assert.assertTrue("SMS Templates page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/SMSTemplates"));
	}

	// Workspace Users
	@And("Reset Password Blank Submit should have to show Validation")
	public void verifyResetPasswordBlankSubmitValidation() throws InterruptedException {
		String result = setupPage.shouldShowValidationOnBlankResetPasswordSubmit();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Associated Employee Name Blank Search Validation should have to display")
	public void verifyAssociatedEmployeeNameBlankSearchValidation() throws InterruptedException {
		String result = setupPage.shouldShowValidationOnBlankEmployeeNameSearch();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Workspace Users Blank Submission should have to show validation")
	public void workspaceUsersBlankSubmissionShouldShowValidation() throws InterruptedException {
		String result = setupPage.checkWorkspaceUsersFormEmptyShowsValidation();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Workspace Users page")
	public void userShouldBeAbleToViewWorkspaceUsersPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String workspaceUsersPageUrl = Hooks.prop.getProperty("workspaceUsersPageUrl");
		Assert.assertNotNull("workspaceUsersPageUrl is missing in config", workspaceUsersPageUrl);
		String fullWorkspaceUsersUrl = baseUrl + workspaceUsersPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openWorkspaceUsersPage(fullWorkspaceUsersUrl);
		Assert.assertTrue("Workspace Users page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/WorkspaceUsers"));
	}

	// Profile
	@And("Add Profile Blank Submission should have to show validation")
	public void addProfileBlankSubmissionShouldShowValidation() throws InterruptedException {
		String result = setupPage.verifyProfileBlankSubmissionValidation();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Profile page")
	public void userShouldBeAbleToViewProfilePage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String setupProfilesUrl = Hooks.prop.getProperty("profilesPageUrl");
		Assert.assertNotNull("profilesPageUrl is missing in config", setupProfilesUrl);
		String fullProfilesUrl = baseUrl + setupProfilesUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openSetupProfilesPage(fullProfilesUrl);
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Profiles"));
	}

	// Dashboard
	@And("Add Quicklink Group Blank Submission should have to show validation")
	public void addQuicklinkGroupBlankSubmissionShouldShowValidation() throws InterruptedException {
		String result = setupPage.shouldShowValidationOnBlankQuicklinkGroup();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should be able to view Dashboard page")
	public void userShouldBeAbleToViewDashboardPage() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String setupDashboardUrl = Hooks.prop.getProperty("dashboardPageUrl");
		Assert.assertNotNull("dashboardPageUrl is missing in config", setupDashboardUrl);
		String fullDashboardUrl = baseUrl + setupDashboardUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openSetupDashboardPage(fullDashboardUrl);
		Assert.assertTrue("XFlow settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Dashboard"));
	}

	// Privacy Policy & Terms of Use
	@And("the user should not see the Privacy Policy & Terms of Use section test")
	public void userShouldNotSeePrivacyPolicyAndTermsOfUseSection() {
		setupPage = new setuppage(Hooks.driver);
		setupPage.verifyNoAccessForPrivacyAndTerms();
	}

	@And("I create a profile with no access to Setup Module Privacy Policy & Terms of Use test")
	public void userWithoutAccessCannotOpenOrUsePrivacyPolicyAndTermsOfUseModule() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.denyAllPrivacyPolicyAndTermsOfUseActionsWithoutAccess();
		setupPage.clickSubmitButton();

	}

	@And("the user should be able to view and update Privacy Policy and Terms of Use content test")
	public void userShouldBeAbleToViewAndUpdatePrivacyPolicyAndTermsOfUseContent() {
		String profileName = Hooks.prop.getProperty("profile.name.value");
		setupPage = new setuppage(Hooks.driver);
		setupPage.handlePrivacyAndTerms(profileName);
	}

	// T&C
	@And("I create a profile with View and Update access to Setup Module Privacy Policy & Terms of Use test")
	public void userWithViewAndUpdatePermissionCanModifyPrivacyPolicyAndTermsOfUse() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowViewingAndUpdatingOfPrivacyPolicyAndTermsOfUseWithPermission();
		setupPage.clickSubmitButton();

	}

	@And("the user should not see the T&C section for Provider, Manufacturer, Patient, or Partner test")
	public void userWithoutAccessCannotViewProviderManufacturerPatientOrPartnerTnC() throws InterruptedException {
		setupPage = new setuppage(Hooks.driver);
		setupPage.verifyNoAccessForAllTC();

	}

	@And("I create a profile with no access to Setup Module → T&C test")
	public void userWithoutAccessCannotOpenOrUseTermsAndConditionsModule() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.denyAllTnCActionsWithoutAnyAccessPermission();
		setupPage.clickSubmitButton();

	}

	@And("the user should be able to view Provider, Manufacturer, Patient, and Partner T&C labels test")
	public void allowViewingOfProviderManufacturerPatientAndPartnerTnCLabels() throws InterruptedException {
		String profileName = Hooks.prop.getProperty("profile.name.value");
		setupPage = new setuppage(Hooks.driver);
		setupPage.handleAllTCLabels(profileName);

	}

	@And("I create a profile with View and Update access to Setup Module → T&C test")
	public void userWithViewAndUpdatePermissionCanModifyTermsAndConditions() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowTermsAndConditionsViewingAndUpdatingWithPermission();
		setupPage.clickSubmitButton();

	}

	// Dashboard
	@And("the user should be able to delete a quick link test")
	public void userWithDeletePermissionCanRemoveQuickLink() throws InterruptedException {
		setupPage.userShouldBeAbleToDeleteQuickLink();

	}

	@And("I create a profile with full access to Setup Module → Quick Links test")
	public void allowCompleteQuickLinksManagementWithAllPermissions() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.userWithFullAccessCanManageQuickLinksModule();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to delete any quick link test")
	public void userCannotRemoveQuickLinksWithoutDeletePermission() throws InterruptedException {
		setupPage.userShouldNotBeAbleToDeleteQuickLinks();

	}

	@And("the user should be able to edit an existing quick link test")
	public void userWithEditPermissionCanModifyExistingQuickLink() throws InterruptedException {
		setupPage.userShouldBeAbleToEditQuickLink();

	}

	@And("I create a profile with View, Add, and Edit access to Setup Module → Quick Links  test")
	public void userWithViewAddAndEditPermissionCanManageQuickLinks() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowQuickLinksViewingCreationAndEditingWithPermission();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to edit or delete any quick link test")
	public void userWithoutPermissionCannotEditOrDeleteQuickLinks() throws InterruptedException {
		setupPage.userShouldNotBeAbleToEditOrDeleteQuickLinks();

	}

	@And("the user should be able to add a new quick link test")
	public void userWithAddPermissionCanCreateNewQuickLink() throws InterruptedException {
		setupPage.userShouldBeAbleToAddNewQuickLink();

	}

	@And("I create a profile with View and Add access to Setup Module → Quick Links test")
	public void userWithViewAndAddPermissionCanCreateQuickLinks() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowQuickLinksViewingAndAdditionWithPermission();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to add, edit, or delete any quick link test")
	public void userWithoutPermissionCannotModifyQuickLinks() throws InterruptedException {
		setupPage.userShouldNotBeAbleToAddEditOrDeleteQuickLinks();

	}

	@And("the user should be able to view quick links test")
	public void userWithViewPermissionCanSeeQuickLinks() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String setupDashboardUrl = Hooks.prop.getProperty("dashboardPageUrl");
		Assert.assertNotNull("dashboardPageUrl is missing in config", setupDashboardUrl);
		String fullDashboardUrl = baseUrl + setupDashboardUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openSetupDashboardPage(fullDashboardUrl);
		Assert.assertTrue("XFlow settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Dashboard"));

	}

	@And("I create a profile with View access only to Setup Module → Quick Links test")
	public void userWithViewPermissionCanAccessQuickLinksSettings() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowQuickLinksSettingsViewWithPermission();
		setupPage.clickSubmitButton();

	}

	// Profile
	@And("all module permission checkboxes should be selected test")
	public void allModulePermissionCheckboxesShouldBeSelectedForFullAccess() throws InterruptedException {
		setupPage.verifyAllModulePermissionCheckboxesSelected();

	}

	@And("I reopen the profile in edit mode test")
	public void userCanReopenProfileInEditMode() throws InterruptedException {
		setupPage.reopenProfileInEditMode();

	}

	// XFlow
	@And("I create a profile with all modules and all permissions selected test")
	public void userWithFullAccessCanManageAllSetupModules() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowCompleteSetupModulesManagementWithAllPermissions();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to view or download from XFlow test")
	public void userWithoutPermissionCannotViewOrDownloadFromXFlow() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String xFlowPageUrl = Hooks.prop.getProperty("xFlowPageUrl");
		Assert.assertNotNull("xFlowPageUrl is missing in config", xFlowPageUrl);
		String fullXFlowUrl = baseUrl + xFlowPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openXFlowPage(fullXFlowUrl);
		setupPage.userShouldNotBeAbleToViewOrDownloadFromXFlow();

	}

	@And("I create a profile with No access to Setup Module XFlow test")
	public void userWithoutAccessCannotOpenOrUseXFlowModule() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.userWithoutAccessCannotOpenOrUseXFlowModule();
		setupPage.clickSubmitButton();

	}

	@And("the user should be able to download from XFlow test")
	public void userWithDownloadPermissionCanExportFromXFlow() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String xFlowPageUrl = Hooks.prop.getProperty("xFlowPageUrl");
		Assert.assertNotNull("xFlowPageUrl is missing in config", xFlowPageUrl);
		String fullXFlowUrl = baseUrl + xFlowPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openXFlowPage(fullXFlowUrl);
		Assert.assertTrue("XFlow settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Web/Home/XFlowVersions"));
		setupPage.userShouldBeAbleToDownloadFromXFlow();

	}

	@And("I create a profile with Download access to Setup Module XFlow test")
	public void userWithDownloadPermissionCanExportXFlowSettings() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowXFlowSettingsDownloadWithPermission();
		setupPage.clickSubmitButton();

	}

	// Sender Authentication
	@And("the user should be able to delete a Sender Authentication entry test")
	public void userWithDeletePermissionCanRemoveSenderAuthenticationEntry() throws InterruptedException {
		setupPage.userShouldBeAbleToDeleteSenderAuthenticationEntry();

	}

	@And("I create a profile with View, Add, and Delete access to Setup Module Sender Authentication test")
	public void userWithViewAddAndDeletePermissionCanManageSenderAuthenticationEntries() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowSenderAuthenticationEntriesManagementWithViewAddDeletePermission();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to delete Sender Authentication entries test")
	public void userWithoutPermissionCannotDeleteSenderAuthenticationEntries() throws InterruptedException {
		setupPage.userShouldNotBeAbleToDeleteSenderAuthenticationEntries();

	}

	@And("the user should be able to add a Sender Authentication entry test")
	public void userWithAddPermissionCanCreateSenderAuthenticationEntry() throws InterruptedException {
		setupPage.userShouldBeAbleToAddSenderAuthenticationEntry();

	}

	@And("I create a profile with View and Add access to Setup Module Sender Authentication test")
	public void userWithViewAndAddPermissionCanCreateSenderAuthenticationEntry() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowSenderAuthenticationEntryAdditionWithViewAndAddPermission();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to add or delete Sender Authentication entries test")
	public void userWithoutPermissionCannotAddOrDeleteSenderAuthenticationEntries() throws InterruptedException {
		setupPage.userShouldNotBeAbleToAddOrDeleteSenderAuthenticationEntries();

	}

	@And("the user should be able to view Sender Authentication settings test")
	public void userWithViewPermissionCanAccessSenderAuthenticationSettings() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String senderAuthenticationPageUrl = Hooks.prop.getProperty("senderAuthenticationPageUrl");
		Assert.assertNotNull("senderAuthenticationPageUrl is missing in config", senderAuthenticationPageUrl);
		String fullSenderAuthenticationUrl = baseUrl + senderAuthenticationPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openSenderAuthenticationPage(fullSenderAuthenticationUrl);
		Assert.assertTrue("Sender Authentication settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Web/Home/SenderAuthentications"));
	}

	@And("I create a profile with View access only to Setup Module Sender Authentication test")
	public void userWithViewOnlyPermissionCanAccessSenderAuthenticationSettings() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowSenderAuthenticationSettingsViewWithPermissionOnly();
		setupPage.clickSubmitButton();

	}

	// Block Email
	@And("the user should be able to delete a Block Email entry test")
	public void userWithDeletePermissionCanRemoveBlockEmailEntry() throws InterruptedException {
		setupPage.userShouldBeAbleToDeleteBlockEmailEntry();

	}

	@And("I create a profile with View and Delete access to Setup Module Block Email test")
	public void userWithViewAndDeletePermissionCanRemoveBlockEmailEntries() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowBlockEmailEntriesDeletionWithViewAndDeletePermission();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to delete Block Email entries test")
	public void userWithoutPermissionCannotDeleteBlockEmailEntries() throws InterruptedException {
		setupPage.userShouldNotBeAbleToDeleteBlockEmailEntries();

	}

	@And("the user should be able to view Block Email settings test")
	public void userWithViewPermissionCanAccessBlockEmailSettings() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String blockEmailPageUrl = Hooks.prop.getProperty("blockEmailPageUrl");
		Assert.assertNotNull("blockEmailPageUrl is missing in config", blockEmailPageUrl);
		String fullBlockEmailUrl = baseUrl + blockEmailPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openBlockEmailPage(fullBlockEmailUrl);
		Assert.assertTrue("Block Email settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Web/Home/Blocks"));
	}

	@And("I create a profile with View access only to Setup Module Block Email test")
	public void userWithViewOnlyPermissionCanAccessBlockEmailSettings() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowBlockEmailSettingsViewWithPermissionOnly();
		setupPage.clickSubmitButton();

	}

	// Bounce Email
	@And("the user should be able to delete a Bounce Email entry test")
	public void userWithDeletePermissionCanRemoveBounceEmailEntry() throws InterruptedException {
		setupPage.userShouldBeAbleToDeleteBounceEmailEntry();

	}

	@And("I create a profile with View and Delete access to Setup Module Bounce Email test")
	public void userWithViewAndDeletePermissionCanRemoveBounceEmailEntries() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowBounceEmailEntriesDeletionWithViewAndDeletePermission();
		setupPage.clickSubmitButton();

	}

	@And("the user should not be able to delete Bounce Email entries test")
	public void userWithoutPermissionCannotDeleteBounceEmailEntries() throws InterruptedException {
		setupPage.userShouldNotBeAbleToDeleteBounceEmailEntries();

	}

	@And("the user should be able to view Bounce Email settings test")
	public void userWithViewPermissionCanAccessBounceEmailSettings() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String bounceEmailPageUrl = Hooks.prop.getProperty("bounceEmailPageUrl");
		Assert.assertNotNull("bounceEmailPageUrl is missing in config", bounceEmailPageUrl);
		String fullBounceEmailUrl = baseUrl + bounceEmailPageUrl;
		setupPage = new setuppage(Hooks.driver);
		setupPage.openBounceEmailPage(fullBounceEmailUrl);
		Assert.assertTrue("Bounce Email settings page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Web/Home/Bounces"));
	}

	@And("I create a profile with View access only to Setup Module Bounce Email test")
	public void userWithViewOnlyPermissionCanAccessBounceEmailSettings() {
		setupPage.clickFilterButton();
		setupPage.enterProfileName();
		setupPage.clickSearchButton();
		setupPage.clickActionMenu();
		setupPage.clickEditButton();
		setupPage.allowBounceEmailSettingsViewWithPermissionOnly();
		setupPage.clickSubmitButton();

	}

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
