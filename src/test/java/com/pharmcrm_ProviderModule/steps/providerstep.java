package com.pharmcrm_ProviderModule.steps;

import org.junit.Assert;
import com.pharmcrm_ProviderModule.pages.providerpage;
import hooks.Hooks;
import io.cucumber.java.en.And;

public class providerstep {

	private providerpage providerPage;

	// Business Group
	@And("the user should be able to delete Business Group in Provider Module test")
	public void userShouldBeAbleToDeleteBusinessGroupInProviderModuleTest() {

		providerPage.verifyUserCanDeleteBusinessGroup();

	}

	@And("I create a profile with View and Delete access but no Add, Edit or Make Partner access to Business Group in Provider Module test")
	public void businessGroupProfileWithViewAndDeleteAccessNoAddNoEditNoMakePartner() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.businessGroupProfileViewDeleteOnly();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("I create a profile with View and Edit access but no Add, Delete or Make Partner access to Business Group in Provider Module test")
	public void businessGroupProfileWithViewAndEditAccessNoAddNoDeleteNoMakePartner() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.businessGroupProfileViewEditOnly();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to make Business Group a Partner in Provider Module test")
	public void userShouldNotBeAbleToMakeBusinessGroupPartnerInProviderModuleTest() {

		providerPage.verifyUserCannotMakeBusinessGroupPartner();

	}

	@And("the user should not be able to delete Business Group in Provider Module test")
	public void userShouldNotBeAbleToDeleteBusinessGroupInProviderModuleTest() {

		providerPage.verifyUserCannotDeleteBusinessGroup();

	}

	@And("the user should not be able to edit Business Group in Provider Module test")
	public void userShouldNotBeAbleToEditBusinessGroupInProviderModuleTest() {

		providerPage.verifyUserCannotEditBusinessGroup();

	}

	@And("the user should not be able to add Business Group in Provider Module test")
	public void userShouldNotBeAbleToAddBusinessGroupInProviderModuleTest() {

		providerPage.verifyUserCannotAddBusinessGroup();

	}

	@And("the user should be able to edit Business Group in Provider Module test")
	public void userShouldBeAbleToEditBusinessGroupInProviderModuleTest() {

		providerPage.verifyUserCanEditBusinessGroup();

	}

	@And("the user should be able to add Business Group in Provider Module test")
	public void userShouldBeAbleToAddBusinessGroupInProviderModuleTest() {

		providerPage.verifyUserCanAddBusinessGroup();

	}

	@And("the user should be able to view Business Group in Provider Module test")
	public void userShouldBeAbleToViewBusinessGroupInProviderModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String businessGroupsUrl = Hooks.prop.getProperty("businessGroupsUrl");
		Assert.assertNotNull("businessGroupsUrl is missing in config", businessGroupsUrl);

		String fullBusinessGroupsUrl = baseUrl + businessGroupsUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullBusinessGroupsUrl);

		Assert.assertTrue("Business Groups page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/BusinessGroups"));

	}

	@And("I create a profile with View and Add access but no Edit, Delete or Make Partner access to Business Group in Provider Module test")
	public void businessGroupProfileWithViewAndAddAccessNoEditNoDeleteNoMakePartner() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.businessGroupProfileViewAddOnly();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// Provider EHR

	@And("I create a profile with Delete access but no Add or Edit access to Provider EHR in Provider Module test")
	public void providerEHRProfileWithDeleteAccessNoAddNoEdit() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.providerEHRProfileDeleteOnly();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to add Provider EHR in Provider Module test")
	public void userShouldNotBeAbleToAddProviderEHRInProviderModuleTest() {

		providerPage.verifyUserCannotAddProviderEHR();

	}

	@And("the user should not be able to delete Provider EHR in Provider Module test")
	public void userShouldNotBeAbleToDeleteProviderEHRInProviderModuleTest() {

		providerPage.verifyUserCannotDeleteProviderEHR();

	}

	@And("the user should not be able to edit Provider EHR in Provider Module test")
	public void userShouldNotBeAbleToEditProviderEHRInProviderModuleTest() {

		providerPage.verifyUserCannotEditProviderEHR();

	}

	@And("the user should be able to delete Provider EHR in Provider Module test")
	public void userShouldBeAbleToDeleteProviderEHRInProviderModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		providerPage.verifyUserCanDeleteProviderEHR();
	}

	@And("the user should be able to edit Provider EHR in Provider Module test")
	public void userShouldBeAbleToEditProviderEHRInProviderModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		providerPage.verifyUserCanEditProviderEHR();
	}

	@And("the user should be able to add Provider EHR in Provider Module test")
	public void userShouldBeAbleToAddProviderEHRInProviderModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		providerPage.verifyUserCanAddProviderEHR();
	}

	@And("I create a profile with Edit access but no Add or Delete access to Provider EHR in Provider Module test")
	public void providerEHRProfileWithEditAccessNoAddNoDelete() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.providerEHRProfileRestrictedAddDelete();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("I create a profile with Add access but no Edit or Delete access to Provider EHR in Provider Module test")
	public void providerEHRProfileWithAddAccessNoEditNoDelete() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.providerEHRProfileAddOnly();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// Provider Service
	@And("I create a profile with View and Delete access but no Add, Edit to Provider Service in Provider Module test")
	public void providerServiceProfileWithViewAndDeleteAccessNoAddNoEdit() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.providerServiceProfileViewDeleteOnly();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should be able to delete Provider Service in Provider Module test")
	public void userShouldBeAbleToDeleteProviderServiceInProviderModuleTest() {

		providerPage.verifyUserCanDeleteProviderService();

	}

	@And("the user should not be able to add Provider Service in Provider Module test")
	public void userShouldNotBeAbleToAddProviderServiceInProviderModuleTest() {

		providerPage.verifyUserCannotAddProviderService();

	}

	@And("the user should be able to edit Provider Service in Provider Module test")
	public void userShouldBeAbleToEditProviderServiceInProviderModuleTest() {

		providerPage.verifyUserCanEditProviderService();

	}

	@And("I create a profile with View and Edit access but no Add, Delete to Provider Service in Provider Module test")
	public void providerServiceProfileWithViewAndEditAccessNoAddNoDelete() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.providerServiceProfileViewEditOnly();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to delete Provider Service in Provider Module test")
	public void userShouldNotBeAbleToDeleteProviderServiceInProviderModuleTest() {

		providerPage.verifyUserCannotDeleteProviderService();

	}

	@And("the user should not be able to edit Provider Service in Provider Module test")
	public void userShouldNotBeAbleToEditProviderServiceInProviderModuleTest() {

		providerPage.verifyUserCannotEditProviderService();

	}

	@And("the user should be able to add Provider Service in Provider Module test")
	public void userShouldBeAbleToAddProviderServiceInProviderModuleTest() {

		providerPage.verifyUserCanAddProviderService();

	}

	@And("the user should be able to view Provider Service in Provider Module test")
	public void userShouldBeAbleToViewProviderServiceInProviderModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		providerPage.verifyUserCanViewProviderService();
	}

	@And("I create a profile with View and Add access but no Edit, Delete to Provider Service in Provider Module test")
	public void providerServiceProfileWithViewAndAddAccessWithoutEditOrDelete() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.providerServiceProfileWithViewAndAddAccessNoEditNoDelete();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// Provider Executive
	@And("the user should be able to reset passwords for Provider Executive users test")
	public void userShouldBeAbleToResetPasswordsForProviderExecutiveUsersTest() {

		providerPage.verifyUserCanResetProviderExecutivePasswords();

	}

	@And("I create a profile with both View and Reset Password access to Provider Executive test")
	public void providerExecutiveProfileWithViewAndResetPasswordAccess() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.providerExecutiveProfileWithViewAndResetPasswordAccessPermission();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to reset passwords for Provider Executive test")
	public void userShouldNotBeAbleToResetPasswordsForProviderExecutiveTest() {

		providerPage.verifyUserCannotResetProviderExecutivePasswords();

	}

	@And("the user should be able to view Provider Executive records test")
	public void userShouldBeAbleToViewProviderExecutiveRecordsTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		providerPage.verifyUserCanViewProviderExecutiveRecords();
	}

	@And("I create a profile with View access but without Reset Password access to Provider Executive test")
	public void providerExecutiveProfileViewAccessWithoutResetPassword() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.providerExecutiveProfileWithViewAccessWithoutResetPasswordPermission();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// DeDupe
	@And("the user should not be able to update DeDupe records via UI or direct URL for Provider Module test")
	public void userShouldNotBeAbleToUpdateDeDupeRecordsViaUIOrDirectURLForProviderModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deDupeProvidersUrl = Hooks.prop.getProperty("deDupeProvidersUrl");
		Assert.assertNotNull("deDupeProvidersUrl is missing in config", deDupeProvidersUrl);
		String fullDeDupeProvidersUrl = baseUrl + deDupeProvidersUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullDeDupeProvidersUrl);
		providerPage.userShouldNotBeAbleToUpdateDeDupeRecordsForProviderModule();

	}

	@And("I create a profile without Update access to Provider Module DeDupe test")
	public void providerModuleDeDupeProfileNoUpdateAccess() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.providerModuleDeDupeProfileWithoutUpdatePermission();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should be able to update DeDupe records for Provider Module test")
	public void userShouldBeAbleToUpdateDeDupeRecordsForProviderModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String deDupeProvidersUrl = Hooks.prop.getProperty("deDupeProvidersUrl");
		Assert.assertNotNull("deDupeProvidersUrl is missing in config", deDupeProvidersUrl);

		String fullDeDupeProvidersUrl = baseUrl + deDupeProvidersUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullDeDupeProvidersUrl);

		Assert.assertTrue("DeDupe Providers page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/DeDupeProviders"));

		providerPage.userShouldBeAbleToUpdateDeDupeRecordsForProviderModule();
	}

	@And("I create a profile with Update access to Provider Module DeDupe test")
	public void providerModuleDeDupeProfileUpdateAccess() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.providerModuleDeDupeProfileWithUpdatePermission();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// Referral Patient History

	@And("the user should not be able to download File in Referral Patient History test")
	public void userShouldNotBeAbleToDownloadFileInReferralPatientHistoryTest() {

		providerPage.userShouldNotBeAbleToDownloadFileInReferralPatientHistory();

	}

	@And("I create a profile without Download File permission for Referral Patient History test")
	public void referralPatientHistoryProfileNoFileDownload() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.referralPatientHistoryProfileWithoutFileDownloadPermission();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should be able to download File in Referral Patient History test")
	public void userShouldBeAbleToDownloadFileInReferralPatientHistoryTest() {

		providerPage.userShouldBeAbleToDownloadFileInReferralPatientHistory();

	}

	@And("I create a profile with Download File permission for Referral Patient History test")
	public void referralPatientHistoryProfileDownloadFileOnly() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.referralPatientHistoryProfileFileDownloadPermission();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should be able to view Referral Patient History test")
	public void userShouldBeAbleToViewReferralPatientHistoryTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		providerPage.userShouldBeAbleToViewReferralPatientHistory();

	}

	// Bucket
	@And("the user should not be able to favourite Folder in Bucket test")
	public void userShouldNotBeAbleToFavouriteFolderInBucketTest() {

		providerPage.userShouldNotBeAbleToFavouriteFolderInBucket();

	}

	@And("the user should not be able to delete Folder in Bucket test")
	public void userShouldNotBeAbleToDeleteFolderInBucketTest() {

		providerPage.userShouldNotBeAbleToDeleteFolderInBucket();

	}

	@And("the user should not be able to edit Folder in Bucket test")
	public void userShouldNotBeAbleToEditFolderInBucketTest() {

		providerPage.userShouldNotBeAbleToEditFolderInBucket();

	}

	@And("the user should not be able to add Folder in Bucket test")
	public void userShouldNotBeAbleToAddFolderInBucketTest() {

		providerPage.userShouldNotBeAbleToAddFolderInBucket();

	}

	@And("the user should not be able to view Folder in Bucket test")
	public void userShouldNotBeAbleToViewFolderInBucketTest() {

		providerPage.userShouldNotBeAbleToViewFolderInBucket();

	}

	@And("the user should be able to download File in Bucket test")
	public void userShouldBeAbleToDownloadFileInBucketTest() {

		providerPage.userShouldBeAbleToDownloadFileInBucket();

	}

	@And("the user should be able to favourite File in Bucket test")
	public void userShouldBeAbleToFavouriteFileInBucketTest() {

		providerPage.userShouldBeAbleToFavouriteFileInBucket();

	}

	@And("the user should be able to delete File in Bucket test")
	public void userShouldBeAbleToDeleteFileInBucketTest() {

		providerPage.userShouldBeAbleToDeleteFileInBucket();

	}

	@And("the user should be able to edit File in Bucket test")
	public void userShouldBeAbleToEditFileInBucketTest() {

		providerPage.userShouldBeAbleToEditFileInBucket();

	}

	@And("the user should be able to add File in Bucket test")
	public void userShouldBeAbleToAddFileInBucketTest() {

		providerPage.userShouldBeAbleToAddFileInBucket();

	}

	@And("I create a profile with full File permissions but no Folder permissions for Bucket test")
	public void bucketTestProfileFileOnlyNoFolder() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.bucketTestProfileFileFullNoFolder();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to view File in Bucket test")
	public void userShouldNotBeAbleToViewFileInBucketTest() {

		providerPage.userShouldNotBeAbleToViewFileInBucket();

	}

	@And("the user should not be able to download File in Bucket test")
	public void userShouldNotBeAbleToDownloadFileInBucketTest() {

		providerPage.userShouldNotBeAbleToDownloadFileInBucket();

	}

	@And("the user should not be able to favourite File in Bucket test")
	public void userShouldNotBeAbleToFavouriteFileInBucketTest() {

		providerPage.userShouldNotBeAbleToFavouriteFileInBucket();

	}

	@And("the user should not be able to delete File in Bucket test")
	public void userShouldNotBeAbleToDeleteFileInBucketTest() {

		providerPage.userShouldNotBeAbleToDeleteFileInBucket();

	}

	@And("the user should not be able to edit File in Bucket test")
	public void userShouldNotBeAbleToEditFileInBucketTest() {

		providerPage.userShouldNotBeAbleToEditFileInBucket();

	}

	@And("the user should not be able to add File in Bucket test")
	public void userShouldNotBeAbleToAddFileInBucketTest() {

		providerPage.userShouldNotBeAbleToAddFileInBucket();

	}

	@And("the user should be able to favourite Folder in Bucket test")
	public void userShouldBeAbleToFavouriteFolderInBucketTest() {

		providerPage.userShouldBeAbleToFavouriteFolderInBucket();

	}

	@And("the user should be able to delete Folder in Bucket test")
	public void userShouldBeAbleToDeleteFolderInBucketTest() {

		providerPage.userShouldBeAbleToDeleteFolderInBucket();

	}

	@And("the user should be able to edit Folder in Bucket test")
	public void userShouldBeAbleToEditFolderInBucketTest() {

		providerPage.userShouldBeAbleToEditFolderInBucket();

	}

	@And("the user should be able to add Folder in Bucket test")
	public void userShouldBeAbleToAddFolderInBucketTest() {

		providerPage.userShouldBeAbleToAddFolderInBucket();

	}

	@And("the user should be able to view File in Bucket test")
	public void userShouldBeAbleToViewFileInBucketTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		providerPage.userShouldBeAbleToViewFileInBucket();

	}

	@And("the user should be able to view Folder in Bucket test")
	public void userShouldBeAbleToViewFolderInBucketTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		providerPage.userShouldBeAbleToViewReferralEnrollment();

	}

	@And("I create a profile with full Folder permissions but no File permissions for Bucket test")
	public void createProfileWithFullFolderPermissionsNoFilePermissionsBucketTest() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.bucketTestProfileFolderOnly();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// Referral Enrollment
	@And("the user should be able to delete Referral Enrollment test")
	public void userShouldBeAbleToDeleteReferralEnrollmentTest() {

		providerPage.userShouldBeAbleToDeleteReferralEnrollment();

	}

	@And("the user should not be able to add Referral Enrollment test")
	public void userShouldNotBeAbleToAddReferralEnrollmentTest() {

		providerPage.userShouldNotBeAbleToAddReferralEnrollment();

	}

	@And("the user should be able to edit Referral Enrollment test")
	public void userShouldBeAbleToEditReferralEnrollmentTest() {

		providerPage.userShouldBeAbleToEditReferralEnrollment();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Referral Enrollment test")
	public void createProfileWithViewAndDeleteAccessOnlyForReferralEnrollmentTest() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createReferralEnrollmentProfileViewDeleteAccessOnly();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Referral Enrollment test")
	public void profileWithViewAndEditAccessReferralEnrollmentTest() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.setupProfileReferralEnrollmentTestViewEditAccess();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to delete Referral Enrollment test")
	public void userShouldNotBeAbleToDeleteReferralEnrollmentTest() {

		providerPage.userShouldNotBeAbleToDeleteReferralEnrollment();

	}

	@And("the user should not be able to edit Referral Enrollment test")
	public void verifyUserCannotEditReferralEnrollmentTest() {

		providerPage.userShouldNotBeAbleToEditReferralEnrollment();

	}

	@And("the user should be able to add Referral Enrollment test")
	public void verifyUserCanAddReferralEnrollmentTest() {

		providerPage.userShouldBeAbleToAddReferralEnrollment();

	}

	@And("the user should be able to view Referral Enrollment test")
	public void verifyUserCanViewReferralEnrollmentTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		providerPage.userShouldBeAbleToViewReferralEnrollment();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Referral Enrollment test")
	public void profileWithViewAndAddAccessReferralEnrollmentTest() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.setupProfileReferralEnrollmentTestViewAddAccess();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}
	// Executives

	@And("the user should be able to delete Executives test")
	public void verifyUserCanDeleteExecutivesTest() {

		providerPage.userShouldBeAbleToDeleteExecutives();

	}

	@And("the user should not be able to add Executives test")
	public void verifyUserCannotAddExecutivesTest() {

		providerPage.userShouldNotBeAbleToAddExecutives();

	}

	@And("the user should be able to edit Executives test")
	public void verifyUserCanEditExecutivesTest() {

		providerPage.userShouldBeAbleToEditExecutives();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Executives test")
	public void profileWithViewAndDeleteAccessExecutivesTest() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.setupProfileExecutivesTestViewDeleteAccess();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Executives test")
	public void profileWithViewAndEditAccessExecutivesTest() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.setupProfileExecutivesTestViewEditAccess();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to delete Executives test")
	public void verifyUserCannotDeleteExecutivesTest() {

		providerPage.userShouldNotBeAbleToDeleteExecutives();

	}

	@And("the user should not be able to edit Executives test")
	public void verifyUserCannotEditExecutivesTest() {

		providerPage.userShouldNotBeAbleToEditExecutives();

	}

	@And("the user should be able to add Executives test")
	public void verifyUserCanAddExecutivesTest() {

		providerPage.userShouldBeAbleToAddExecutives();

	}

	@And("the user should be able to view Executives test")
	public void verifyUserCanViewExecutivesTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		providerPage.userShouldBeAbleToViewExecutives();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Executives test")
	public void createProfileWithViewAndAddAccessOnlyForExecutivesTest() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createExecutivesTestProfileViewAddOnly();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// Referrals
	@And("the user should be able to export Referrals to Excel in Provider Module test")
	public void userShouldExportReferralsToExcelInProviderModule() {

		providerPage.userShouldBeAbleToExportReferralsToExcelInProviderModule();

	}

	@And("the user should not be able to export Referrals to Excel in Provider Module test")
	public void userShouldNotExportReferralsToExcelInProviderModule() {

		providerPage.userShouldNotBeAbleToExportReferralsToExcelInProviderModule();

	}

	@And("I create a profile with both View and Export Excel access to Referrals Provider test")
	public void userShouldViewAndExportExcelReferralsProviderInProviderModule() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.verifyViewAndExportExcelAccessToReferralsProviderInModule();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should be able to view Referrals in Provider Module test")
	public void userShouldViewReferralsInProviderModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerReferralsUrl = Hooks.prop.getProperty("providerReferralsUrl");
		Assert.assertNotNull("providerReferralsUrl is missing in config", providerReferralsUrl);
		String fullProviderReferralsUrl = baseUrl + providerReferralsUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderReferralsPage(fullProviderReferralsUrl);
		Assert.assertTrue("Provider Referrals page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Referrals"));
		System.out.println("User should be able to view Referrals in Provider Module test");
		Hooks.scenario.log("User should be able to view Referrals in Provider Module test");
	}

	@And("I create a profile with View access but no Export Excel access to Referrals Provider test")
	public void userShouldViewButNotExportExcelReferralsProviderInProviderModule() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.verifyViewWithoutExportExcelAccessToReferralsProviderInModule();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// Provider Communication
	@And("the user should be able to delete Provider Communication in Provider Module test")
	public void verifyDeleteAccessToProviderCommunicationInProviderModule() {

		providerPage.userShouldBeAbleToDeleteProviderCommunicationInProviderModule();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Provider Communication in Provider Module test")
	public void userShouldViewAndDeleteButNotAddOrEditProviderCommunicationInProviderModule() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.verifyViewAndDeleteWithoutAddOrEditAccessToProviderCommunicationInModule();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should be able to edit Provider Communication in Provider Module test")
	public void verifyEditAccessToProviderCommunicationInProviderModule() {

		providerPage.userShouldBeAbleToEditProviderCommunicationInProviderModule();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Provider Communication in Provider Module test")
	public void userShouldViewAndEditButNotAddOrDeleteProviderCommunicationInProviderModule() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.verifyViewAndEditWithoutAddOrDeleteAccessToProviderCommunicationInModule();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to add Provider Communication in Provider Module test")
	public void userShouldNotAddProviderCommunicationInProviderModule() {

		providerPage.userShouldNotBeAbleToAddProviderCommunicationInProviderModule();

	}

	@And("the user should not be able to delete Provider Communication in Provider Module test")
	public void userShouldNotDeleteProviderCommunicationInProviderModule() {

		providerPage.userShouldNotBeAbleToDeleteProviderCommunicationInProviderModule();

	}

	@And("the user should not be able to edit Provider Communication in Provider Module test")
	public void userShouldNotEditProviderCommunicationInProviderModule() {

		providerPage.userShouldNotBeAbleToEditProviderCommunicationInProviderModule();

	}

	@And("the user should be able to add Provider Communication in Provider Module test")
	public void userShouldAddProviderCommunicationInProviderModule() {

		providerPage.userShouldBeAbleToAddProviderCommunicationInProviderModule();

	}

	@And("the user should be able to view Provider Communication in Provider Module test")
	public void userShouldViewProviderCommunicationInProviderModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));
		providerPage.userShouldBeAbleToViewProviderCommunicationInProviderModule();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Provider Communication in Provider Module test")
	public void userShouldViewAndAddButNotEditOrDeleteProviderCommunicationInProviderModule() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.verifyViewAndAddWithoutEditOrDeleteAccessToProviderCommunicationInModule();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// Provider Address
	@And("the user should be able to delete Provider Address in Provider Module test")
	public void userShouldDeleteProviderAddressInProviderModule() {

		providerPage.userShouldBeAbleToDeleteProviderAddressInProviderModule();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Provider Address in Provider Module test")
	public void userShouldViewAndDeleteButNotAddOrEditProviderAddressInProviderModule() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.verifyViewAndDeleteWithoutAddOrEditAccessToProviderAddressInModule();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to add Provider Address in Provider Module test")
	public void userShouldNotAddProviderAddressInProviderModule() {

		providerPage.userShouldNotBeAbleToAddProviderAddressInProviderModule();

	}

	@And("the user should be able to edit Provider Address in Provider Module test")
	public void userShouldEditProviderAddressInProviderModule() {

		providerPage.userShouldBeAbleToEditProviderAddressInProviderModule();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Provider Address in Provider Module test")
	public void userShouldViewAndEditButNotAddOrDeleteProviderAddressInProviderModule() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.verifyViewAndEditWithoutAddOrDeleteAccessToProviderAddressInModule();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to delete Provider Address in Provider Module test")
	public void userShouldNotDeleteProviderAddressInProviderModule() {

		providerPage.userShouldNotBeAbleToDeleteProviderAddressInProviderModule();

	}

	@And("the user should not be able to edit Provider Address in Provider Module test")
	public void userShouldNotEditProviderAddressInProviderModule() {

		providerPage.userShouldNotBeAbleToEditProviderAddressInProviderModule();

	}

	@And("the user should be able to add Provider Address in Provider Module test")
	public void userShouldAddProviderAddressInProviderModule() {

		providerPage.userShouldBeAbleToAddProviderAddressInProviderModule();

	}

	@And("the user should be able to view Provider Address in Provider Module test")
	public void userShouldViewProviderAddressInProviderModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));
		providerPage.userShouldBeAbleToViewProviderAddressInProviderModule();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Provider Address in Provider Module test")
	public void userShouldViewAndAddButNotEditOrDeleteProviderAddressInProviderModule() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.verifyViewAndAddWithoutEditOrDeleteAccessToProviderAddressInModule();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// Provider
	@And("the user should be able to delete Provider in Provider Module test")
	public void userShouldDeleteProviderInProviderModule() {

		providerPage.userShouldBeAbleToDeleteProviderInProviderModule();

	}

	@And("I create a profile with View and Detail access but no Add, Edit or Delete access to Provider in Provider Module test")
	public void userShouldViewAndDetailButNotAddEditOrDeleteProviderInProviderModule() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.verifyViewAndDetailWithoutAddEditOrDeleteAccessToProviderInModule();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("I create a profile with View and Delete access but no Add, Edit or Detail access to Provider in Provider Module test")
	public void userShouldViewAndDeleteButNotAddEditOrDetailProviderInProviderModule() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.verifyViewAndDeleteWithoutAddEditOrDetailAccessToProviderInModule();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("I create a profile with View and Edit access but no Add, Delete or Detail access to Provider in Provider Module test")
	public void userShouldViewAndEditButNotAddDeleteOrDetailProviderInProviderModule() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.verifyViewAndEditWithoutAddDeleteOrDetailAccessToProviderInModule();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to add Provider in Provider Module test")
	public void userShouldNotAddProviderInProviderModule() {

		providerPage.userShouldNotBeAbleToAddProviderInProviderModule();

	}

	@And("the user should not be able to view Provider details in Provider Module test")
	public void userShouldNotViewProviderDetailsInProviderModule() {

		providerPage.userShouldNotBeAbleToViewProviderDetailsInProviderModule();

	}

	@And("the user should not be able to delete Provider in Provider Module test")
	public void userShouldNotDeleteProviderInProviderModule() {

		providerPage.userShouldNotBeAbleToDeleteProviderInProviderModule();

	}

	@And("the user should not be able to edit Provider in Provider Module test")
	public void userShouldNotEditProviderInProviderModule() {

		providerPage.userShouldNotBeAbleToEditProviderInProviderModule();

	}

	@And("the user should be able to view Provider details in Provider Module test")
	public void userShouldViewProviderDetailsInProviderModule() {

		providerPage.userShouldBeAbleToViewProviderDetailsInProviderModule();

	}

	@And("the user should be able to add Provider in Provider Module test")
	public void userShouldAddProviderInProviderModule() {

		providerPage.userShouldBeAbleToAddProviderInProviderModule();

	}

	@And("the user should be able to edit Provider in Provider Module test")
	public void userShouldEditProviderInProviderModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));
		providerPage.userShouldBeAbleToEditProviderInProviderModule();

	}

	@And("the user should be able to view Provider in Provider Module test")
	public void verifyViewAccessToProviderInProviderModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

	}

	@And("I create a profile with View and Add access but no Edit, Delete or Detail access to Provider in Provider Module test")
	public void userShouldViewAndAddButNotEditDeleteOrDetailProviderInProviderModule() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.verifyViewAndAddWithoutEditDeleteOrDetailAccessToProviderInModule();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// Text

	@And("the user should not be able to send VCard in Provider Module test")
	public void userShouldNotSendVcardInProviderModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerNpiUrl = Hooks.prop.getProperty("providerNpiUrl");
		Assert.assertNotNull("providerNpiUrl is missing in config", providerNpiUrl);
		String fullProviderNpiUrl = baseUrl + providerNpiUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderNpiPage(fullProviderNpiUrl);
		Assert.assertTrue("Provider NPI Request page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/NPIRequests"));
		System.out.println("User should be able to view NPI Request in Provider Module test");
		Hooks.scenario.log("User should be able to view NPI Request in Provider Module test");

	}

	@And("the user should not be able to send Text in Provider Module test")
	public void userShouldNotSendTextInProviderModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerNpiUrl = Hooks.prop.getProperty("providerNpiUrl");
		Assert.assertNotNull("providerNpiUrl is missing in config", providerNpiUrl);
		String fullProviderNpiUrl = baseUrl + providerNpiUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderNpiPage(fullProviderNpiUrl);
		Assert.assertTrue("Provider NPI Request page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/NPIRequests"));
		System.out.println("User should be able to view NPI Request in Provider Module test");
		Hooks.scenario.log("User should be able to view NPI Request in Provider Module test");

	}

	@And("the user should be able to send VCard in Provider Module test")
	public void userShouldSendVcardInProviderModule() {

		providerPage.userShouldBeAbleToSendVCardInProviderModule();

	}

	@And("the user should be able to send Text in Provider Module test")
	public void userShouldSendTextInProviderModule() {

		providerPage.userShouldBeAbleToSendTextInProviderModule();

	}

	@And("the user should be able to view Text in Provider Module test")
	public void userShouldViewTextInProviderModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

	}

	@And("I create a profile with View and Send VCard access but no Send or Reply access to Provider Module Text test")
	public void userShouldViewAndSendVcardButNotSendOrReplyTextInProviderModule() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.verifyViewAndVcardAccessWithoutSendOrReplyInProviderModuleText();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("I create a profile with View and Send access but no Reply or Send VCard access to Provider Module Text test")
	public void userShouldViewAndSendButNotReplyOrSendVcardInProviderModuleText() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.verifyViewAndSendWithoutReplyOrVcardAccessToProviderModuleText();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// NPI Request
	@And("the user should not be able to merge NPI Request in Provider Module test")
	public void assertNoMergeAccessToNpiRequestInProviderModule() {

	}

	@And("the user should be able to approve NPI Request in Provider Module test")
	public void userShouldApproveNpiRequestInProviderModule() {

		providerPage.userShouldBeAbleToApproveNPIRequestInProviderModule();

	}

	@And("I create a profile with View and Approve access but no Merge access to Provider Module NPI Request test")
	public void userShouldViewAndApproveButNotMergeNpiRequestInProviderModule() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.verifyViewAndApproveWithoutMergeAccessToNpiRequest();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to approve NPI Request in Provider Module test")
	public void userShouldNotApproveNpiRequestInProviderModule() {

	}

	@And("the user should be able to merge NPI Request in Provider Module test")
	public void userShouldMergeNpiRequestInProviderModule() {

	}

	@And("the user should be able to view NPI Request in Provider Module test")
	public void verifyViewAccessToNpiRequestInProviderModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerNpiUrl = Hooks.prop.getProperty("providerNpiUrl");
		Assert.assertNotNull("providerNpiUrl is missing in config", providerNpiUrl);
		String fullProviderNpiUrl = baseUrl + providerNpiUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderNpiPage(fullProviderNpiUrl);
		Assert.assertTrue("Provider NPI Request page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/NPIRequests"));
		System.out.println("User should be able to view NPI Request in Provider Module test");
		Hooks.scenario.log("User should be able to view NPI Request in Provider Module test");
	}

	@And("I create a profile with View and Merge access but no Approve access to Provider Module NPI Request test")
	public void userShouldViewAndMergeButNotApproveNpiRequestInProviderModule() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.verifyViewAndMergeWithoutApproveAccessToNpiRequest();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// Demand Request
	@And("I create a profile with No access to Provider Module Demand Request test")
	public void userShouldNotAccessDemandRequestInProviderModule() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.assertNoAccessToDemandRequestInProviderModule();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to view Demand Request in Provider Module test")
	public void userShouldNotViewDemandRequestInProviderModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerDemandUrl = Hooks.prop.getProperty("providerDemandUrl");
		Assert.assertNotNull("providerDemandUrl is missing in config", providerDemandUrl);
		String fullProviderDemandUrl = baseUrl + providerDemandUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderDemandPage(fullProviderDemandUrl);
		Assert.assertTrue("Provider Demand Request page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/DemandRequest"));
		providerPage.userShouldNotBeAbleToViewDemandRequestInProviderModule();

	}

	@And("the user should be able to view Demand Request in Provider Module test")
	public void userShouldViewDemandRequestInProviderModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerDemandUrl = Hooks.prop.getProperty("providerDemandUrl");
		Assert.assertNotNull("providerDemandUrl is missing in config", providerDemandUrl);
		String fullProviderDemandUrl = baseUrl + providerDemandUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderDemandPage(fullProviderDemandUrl);
		Assert.assertTrue("Provider Demand Request page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/DemandRequest"));
		System.out.println("User should be able to view Demand Request in Provider Module test");
		Hooks.scenario.log("User should be able to view Demand Request in Provider Module test");
	}

	@And("I create a profile with View access only to Provider Module Demand Request test")
	public void verifyViewAccessToDemandRequestInProviderModule() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.userShouldViewDemandRequestInProviderModule();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// Callback Request
	@And("I create a profile with No access to Provider Module Callback Request test")
	public void userShouldNotAccessCallbackRequestInProviderModule() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.assertNoAccessToCallbackRequestInProviderModule();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to view Callback Request in Provider Module test")
	public void userShouldNotViewCallbackRequestInProviderModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerCallbackUrl = Hooks.prop.getProperty("providerCallbackUrl");
		Assert.assertNotNull("providerCallbackUrl is missing in config", providerCallbackUrl);
		String fullProviderCallbackUrl = baseUrl + providerCallbackUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderCallbackPage(fullProviderCallbackUrl);
		Assert.assertTrue("Provider Callback page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/CallbackPharmacy"));
		providerPage.userShouldNotBeAbleToViewCallbackRequestInProviderModule();

	}

	@And("the user should be able to view Callback Request in Provider Module test")
	public void userShouldViewCallbackRequestInProviderModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerCallbackUrl = Hooks.prop.getProperty("providerCallbackUrl");
		Assert.assertNotNull("providerCallbackUrl is missing in config", providerCallbackUrl);
		String fullProviderCallbackUrl = baseUrl + providerCallbackUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderCallbackPage(fullProviderCallbackUrl);
		Assert.assertTrue("Provider Callback page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/CallbackPharmacy"));
	}

	@And("I create a profile with View access only to Provider Module Callback Request test")
	public void userShouldViewCallbackRequestButNotEdit() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.verifyViewAccessToCallbackRequest();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// Profile
	@And("the Provider user should be able to view Profiles test")
	public void theProviderUserShouldBeAbleToViewProfiles() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerProfilesUrl = Hooks.prop.getProperty("profilesPageUrl");
		Assert.assertNotNull("profilesPageUrl is missing in config", providerProfilesUrl);
		String fullProfilesUrl = baseUrl + providerProfilesUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderProfilesPage(fullProfilesUrl);
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Profiles"));
		System.out.println("Provider user should be able to view Profiles test");
		Hooks.scenario.log("Provider user should be able to view Profiles test");
	}

	// Audit View
	@And("I create a profile with No access to Provider Module General Audit View test")
	public void userShouldBeDeniedAccessToAuditView() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.verifyNoAccessToProviderAuditView();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("I create a profile with View access only to Provider Module General Audit View test")
	public void iCreateProfileWithViewAccessOnlyToProviderModuleGeneralAuditViewTest() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.userProfileWithViewAccessOnly();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should be able to view Provider General Audit View settings test")
	public void userShouldBeAbleToViewProviderGeneralAuditViewSettings() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));
		providerPage.userShouldBeAbleToViewGeneralAuditViewSettingsInProviderModule();
		System.out.println("User should be able to view Provider General Audit View settings test");
		Hooks.scenario.log("User should be able to view Provider General Audit View settings test");
	}

	@And("the user should not be able to view General Audit View settings in Provider Module test")
	public void userShouldNotViewGeneralAuditViewSettings() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));
		providerPage.userShouldNotBeAbleToViewGeneralAuditViewSettingsInProviderModule();

	}

}
