package com.pharmcrm_ClinicalModule.steps;

import org.junit.Assert;

import com.pharmcrm_ClinicalModule.pages.clinicalpage;
import com.pharmcrm_DeliveryModule.pages.deliverypage;

import hooks.Hooks;
import io.cucumber.java.en.And;

public class clinicalstep {

	private clinicalpage clinicalPage;

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
