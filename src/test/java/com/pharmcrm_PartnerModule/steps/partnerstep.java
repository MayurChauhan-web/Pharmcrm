package com.pharmcrm_PartnerModule.steps;

import org.junit.Assert;
import com.pharmcrm_PartnerModule.pages.partnerpage;
import hooks.Hooks;
import io.cucumber.java.en.And;

public class partnerstep {

	private partnerpage partnerPage;

	// Pharmacies
	@And("the user should not be able to add, edit, or delete Pharmacies in Partner Module test")
	public void userCannotAddEditOrDeletePharmaciesInPartnerModuleTest() {

		partnerPage.userShouldNotBeAbleToAddEditOrDeletePharmaciesInPartnerModule();
	}
	
	@And("the user should be able to view Pharmacies details in Partner Module test")
	public void userCanViewPharmaciesDetailsInPartnerModuleTest() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);

		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));

		partnerPage.userShouldBeAbleToViewPharmaciesDetailsInPartnerModule();
	}
	
	@And("I create a profile with Details access only to Pharmacies in Partner Module test")
	public void createProfileWithDetailsAccessOnlyToPharmaciesInPartnerModuleTest() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.verifyPharmaciesDetailsOnlyAccessInPartnerModuleProfile();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("the user should not be able to add or edit Pharmacies in Partner Module test")
	public void userCannotAddOrEditPharmaciesInPartnerModuleTest() {

		partnerPage.userShouldNotBeAbleToAddOrEditPharmaciesInPartnerModule();
	}

	@And("the user should be able to delete Pharmacies in Partner Module test")
	public void userCanDeletePharmaciesInPartnerModuleTest() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);

		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));

		partnerPage.userShouldBeAbleToDeletePharmaciesInPartnerModule();
	}

	@And("I create a profile with Delete access only to Pharmacies in Partner Module test")
	public void createProfileWithDeleteAccessOnlyToPharmaciesInPartnerModuleTest() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.testPartnerModulePharmaciesDeleteAccessRestriction();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("the user should not be able to add or delete Pharmacies in Partner Module test")
	public void userCannotAddOrDeletePharmaciesInPartnerModuleTest() {

		partnerPage.userShouldNotBeAbleToAddOrDeletePharmaciesInPartnerModule();
	}

	@And("the user should be able to edit Pharmacies in Partner Module test")
	public void userCanEditPharmaciesInPartnerModuleTest() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);

		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));

		partnerPage.userShouldBeAbleToEditPharmaciesInPartnerModule();
	}

	@And("I create a profile with Edit access only to Pharmacies in Partner Module test")
	public void createProfileWithEditAccessOnlyToPharmaciesInPartnerModuleTest() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.testPartnerModulePharmaciesEditAccessRestriction();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("the user should not be able to access Pharmacy Vetting in Partner Module test")
	public void verifyPharmacyVettingNotAccessibleInPartnerModule() {

		partnerPage.userShouldNotBeAbleToAccessPharmacyVettingInPartnerModule();
	}

	@And("the user should not be able to view Pharmacies details in Partner Module test")
	public void userCannotViewPharmaciesDetailsInPartnerModuleTest() {

		partnerPage.userShouldNotBeAbleToViewPharmaciesDetailsInPartnerModule();
	}

	@And("the user should not be able to edit or delete Pharmacies in Partner Module test")
	public void userCannotEditOrDeletePharmaciesInPartnerModuleTest() {

		partnerPage.userShouldNotBeAbleToEditOrDeletePharmaciesInPartnerModule();
	}

	@And("the user should be able to add Pharmacies in Partner Module test")
	public void userCanAddPharmaciesInPartnerModuleTest() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);

		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));

		partnerPage.userShouldBeAbleToAddPharmaciesInPartnerModule();
	}

	@And("I create a profile with Add access only to Pharmacies in Partner Module test")
	public void createProfileWithAddAccessOnlyToPharmaciesInPartnerModuleTest() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.testPartnerModulePharmaciesAddAccessRestriction();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	// Attorney
	@And("the user should not be able to add, edit, or delete Attorney in Partner Module test")
	public void userCannotAddEditOrDeleteAttorneyInPartnerModuleTest() {

		partnerPage.userShouldNotBeAbleToAddEditOrDeleteAttorneyInPartnerModule();
	}

	@And("the user should be able to view Attorney details in Partner Module test")
	public void userCanViewAttorneyDetailsInPartnerModuleTest() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);

		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));

		partnerPage.userShouldBeAbleToViewAttorneyDetailsInPartnerModule();
	}

	@And("I create a profile with Details access only to Attorney in Partner Module test")
	public void createProfileWithDetailsAccessOnlyToAttorneyInPartnerModuleTest() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.testPartnerModuleAttorneyDetailsAccessRestriction();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("the user should not be able to add or edit Attorney in Partner Module test")
	public void userCannotAddOrEditAttorneyInPartnerModuleTest() {

		partnerPage.userShouldNotBeAbleToAddOrEditAttorneyInPartnerModule();
	}

	@And("the user should be able to delete Attorney in Partner Module test")
	public void userCanDeleteAttorneyInPartnerModuleTest() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);

		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));

		partnerPage.userShouldBeAbleToDeleteAttorneyInPartnerModule();
	}

	@And("I create a profile with Delete access only to Attorney in Partner Module test")
	public void createProfileWithDeleteAccessOnlyToAttorneyInPartnerModuleTest() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.testPartnerModuleAttorneyDeleteAccessRestriction();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("the user should not be able to add or delete Attorney in Partner Module test")
	public void userCannotAddOrDeleteAttorneyInPartnerModuleTest() {

		partnerPage.userShouldNotBeAbleToAddOrDeleteAttorneyInPartnerModule();
	}

	@And("the user should be able to edit Attorney in Partner Module test")
	public void userCanEditAttorneyInPartnerModuleTest() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);

		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));

		partnerPage.userShouldBeAbleToEditAttorneyInPartnerModule();
	}

	@And("I create a profile with Edit access only to Attorney in Partner Module test")
	public void testPartnerModuleAttorneyEditAccessRestriction() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.verifyAttorneyEditOnlyAccessInPartnerModuleProfile();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("the user should not be able to view Attorney details in Partner Module test")
	public void userCannotViewAttorneyDetailsInPartnerModuleTest() {

		partnerPage.userShouldNotBeAbleToViewAttorneyDetailsInPartnerModule();
	}

	@And("the user should not be able to edit or delete Attorney in Partner Module test")
	public void userCannotEditOrDeleteAttorneyInPartnerModuleTest() {

		partnerPage.userShouldNotBeAbleToEditOrDeleteAttorneyInPartnerModule();
	}

	@And("the user should be able to add Attorney in Partner Module test")
	public void userCanAddAttorneyInPartnerModuleTest() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);

		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));

		partnerPage.userShouldBeAbleToAddAttorneyInPartnerModule();
	}

	@And("I create a profile with Add access only to Attorney in Partner Module test")
	public void createProfileWithAddAccessOnlyToAttorneyInPartnerModuleTest() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.verifyAttorneyAddOnlyAccessInPartnerModuleProfile();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	// Bucket
	@And("the user should not be able to favourite Folder in Bucket for Partner Module test")
	public void userCannotFavouriteFolderInBucketForPartnerModuleTest() {

		partnerPage.userShouldNotBeAbleToFavouriteFolderInBucketForPartnerModule();
	}

	@And("the user should not be able to delete Folder in Bucket for Partner Module test")
	public void userCannotDeleteFolderInBucketForPartnerModuleTest() {

		partnerPage.userShouldNotBeAbleToDeleteFolderInBucketForPartnerModule();
	}

	@And("the user should not be able to edit Folder in Bucket for Partner Module test")
	public void userCannotEditFolderInBucketForPartnerModuleTest() {

		partnerPage.userShouldNotBeAbleToEditFolderInBucketForPartnerModule();
	}

	@And("the user should not be able to add Folder in Bucket for Partner Module test")
	public void shouldRestrictAddingFolderInBucketPartnerModule() {

		partnerPage.userShouldNotBeAbleToAddFolderInBucketForPartnerModule();
	}

	@And("the user should not be able to view Folder in Bucket for Partner Module test")
	public void userCannotViewFolderInBucketForPartnerModuleTest() {

		partnerPage.userShouldNotBeAbleToViewFolderInBucketForPartnerModule();
	}

	@And("the user should be able to download File in Bucket for Partner Module test")
	public void userCanDownloadFileInBucketForPartnerModuleTest() {

		partnerPage.userShouldBeAbleToDownloadFileInBucketForPartnerModule();
	}

	@And("the user should be able to favourite File in Bucket for Partner Module test")
	public void userCanFavouriteFileInBucketForPartnerModuleTest() {

		partnerPage.userShouldBeAbleToFavouriteFileInBucketForPartnerModule();
	}

	@And("the user should be able to delete File in Bucket for Partner Module test")
	public void userCanDeleteFileInBucketForPartnerModuleTest() {

		partnerPage.userShouldBeAbleToDeleteFileInBucketForPartnerModule();
	}

	@And("the user should be able to edit File in Bucket for Partner Module test")
	public void userCanEditFileInBucketForPartnerModuleTest() {

		partnerPage.userShouldBeAbleToEditFileInBucketForPartnerModule();
	}

	@And("the user should be able to add File in Bucket for Partner Module test")
	public void userCanAddFileInBucketForPartnerModuleTest() {

		partnerPage.userShouldBeAbleToAddFileInBucketForPartnerModule();
	}

	@And("the user should be able to view File in Bucket for Partner Module test")
	public void userCanViewFileInBucketForPartnerModuleTest() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddCustomPartnersUrl = Hooks.prop.getProperty("partnerAddCustomPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddCustomPartnersUrl);

		String fullCustomPartnerUrl = baseUrl + partnerAddCustomPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openCustomPartnersUrl(fullCustomPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));

		partnerPage.userShouldBeAbleToViewFileInBucketForPartnerModule();
	}

	@And("I create a profile with full File permissions but no Folder permissions for Bucket in Partner Module test")
	public void shouldCreateProfileWithFileOnlyPermissionsInBucketPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.testPartnerModuleBucketProfileFileOnlyPermissions();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("the user should not be able to download File in Bucket for Partner Module test")
	public void userCannotDownloadFileInBucketForPartnerModuleTest() {

		partnerPage.userShouldNotBeAbleToDownloadFileInBucketForPartnerModule();
	}

	@And("the user should not be able to favourite File in Bucket for Partner Module test")
	public void userCannotFavouriteFileInBucketForPartnerModuleTest() {

		partnerPage.userShouldNotBeAbleToFavouriteFileInBucketForPartnerModule();
	}

	@And("the user should not be able to delete File in Bucket for Partner Module test")
	public void userCannotDeleteFileInBucketForPartnerModuleTest() {

		partnerPage.userShouldNotBeAbleToDeleteFileInBucketForPartnerModule();
	}

	@And("the user should not be able to edit File in Bucket for Partner Module test")
	public void userCannotEditFileInBucketForPartnerModuleTest() {

		partnerPage.userShouldNotBeAbleToEditFileInBucketForPartnerModule();
	}

	@And("the user should not be able to add File in Bucket for Partner Module test")
	public void userCannotAddFileInBucketForPartnerModuleTest() {

		partnerPage.userShouldNotBeAbleToAddFileInBucketForPartnerModule();
	}

	@And("the user should not be able to view File in Bucket for Partner Module test")
	public void userCannotViewFileInBucketForPartnerModuleTest() {

		partnerPage.userShouldNotBeAbleToViewFileInBucketForPartnerModule();
	}

	@And("the user should be able to favourite Folder in Bucket for Partner Module test")
	public void userCanFavouriteFolderInBucketForPartnerModuleTest() {

		partnerPage.userShouldBeAbleToFavouriteFolderInBucketForPartnerModule();
	}

	@And("the user should be able to delete Folder in Bucket for Partner Module test")
	public void userCanDeleteFolderInBucketForPartnerModuleTest() {

		partnerPage.userShouldBeAbleToDeleteFolderInBucketForPartnerModule();
	}

	@And("the user should be able to edit Folder in Bucket for Partner Module test")
	public void userCanEditFolderInBucketForPartnerModuleTest() {

		partnerPage.userShouldBeAbleToEditFolderInBucketForPartnerModule();
	}

	@And("the user should be able to add Folder in Bucket for Partner Module test")
	public void userCanAddFolderInBucketForPartnerModuleTest() {

		partnerPage.userShouldBeAbleToAddFolderInBucketForPartnerModule();
	}

	@And("I create a profile with full Folder permissions but no File permissions for Bucket in Partner Module test")
	public void shouldCreateProfileWithFullFolderPermissionsAndNoFilePermissionsForBucket() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.verifyBucketProfileWithFolderOnlyPermissionsInPartnerModule();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("the user should be able to view Folder in Bucket for Partner Module test")
	public void userCanViewFolderInBucketForPartnerModuleTest() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddCustomPartnersUrl = Hooks.prop.getProperty("partnerAddCustomPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddCustomPartnersUrl);

		String fullCustomPartnerUrl = baseUrl + partnerAddCustomPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openCustomPartnersUrl(fullCustomPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));

		partnerPage.userShouldBeAbleToViewFolderInBucketForPartnerModule();
	}

	// Executive

	@And("the user should not be able to add, edit, or delete Executive in Partner Module test")
	public void cannotAddEditOrDeleteExecutive() {

		partnerPage.verifyUserCannotAddEditOrDeleteExecutiveInPartnerModule();
	}

	@And("the user should be able to reset password for Executive in Partner Module test")
	public void resetPasswordForExecutive() {

		partnerPage.verifyUserCanResetPasswordForExecutiveInPartnerModule();
	}

	@And("the user should be able to view Executive in Partner Module test")
	public void viewExecutiveInPartnerModule() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);

		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));

		partnerPage.verifyUserCanViewExecutiveInPartnerModule();
	}

	@And("I create a profile with View + Reset Password access only to Executive in Partner Module test")
	public void createProfileWithViewAndResetPasswordExecutiveAccess() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileViewResetExecutiveAccess();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("the user should not be able to add or edit Executive in Partner Module test")
	public void cannotAddOrEditExecutive() {

		partnerPage.verifyUserCannotAddOrEditExecutiveInPartnerModule();
	}

	@And("the user should be able to delete Executive in Partner Module test")
	public void deleteExecutiveInPartnerModule() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddCustomPartnersUrl = Hooks.prop.getProperty("partnerAddCustomPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddCustomPartnersUrl);

		String fullCustomPartnerUrl = baseUrl + partnerAddCustomPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openCustomPartnersUrl(fullCustomPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));

		partnerPage.verifyUserCanDeleteExecutiveInPartnerModule();
	}

	@And("I create a profile with Delete access only to Executive in Partner Module test")
	public void createProfileWithDeleteExecutiveAccess() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileDeleteExecutive();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("the user should not be able to add or delete Executive in Partner Module test")
	public void cannotAddOrDeleteExecutive() {

		partnerPage.verifyUserCannotAddOrDeleteExecutiveInPartnerModule();
	}

	@And("the user should be able to edit Executive in Partner Module test")
	public void editExecutiveInPartnerModule() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddCustomPartnersUrl = Hooks.prop.getProperty("partnerAddCustomPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddCustomPartnersUrl);

		String fullCustomPartnerUrl = baseUrl + partnerAddCustomPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openCustomPartnersUrl(fullCustomPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));

		partnerPage.verifyUserCanEditExecutiveInPartnerModule();
	}

	@And("I create a profile with Edit access only to Executive in Partner Module test")
	public void createProfileWithEditExecutiveAccess() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileEditExecutive();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("the user should not be able to edit or delete Executive in Partner Module test")
	public void cannotEditOrDeleteExecutive() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddCustomPartnersUrl = Hooks.prop.getProperty("partnerAddCustomPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddCustomPartnersUrl);

		String fullCustomPartnerUrl = baseUrl + partnerAddCustomPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openCustomPartnersUrl(fullCustomPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));

		partnerPage.verifyUserCannotEditOrDeleteExecutiveInPartnerModule();
	}

	@And("the user should be able to add Executive in Partner Module test")
	public void addExecutiveInPartnerModule() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddCustomPartnersUrl = Hooks.prop.getProperty("partnerAddCustomPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddCustomPartnersUrl);

		String fullCustomPartnerUrl = baseUrl + partnerAddCustomPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openCustomPartnersUrl(fullCustomPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));

		partnerPage.verifyUserCanAddExecutiveInPartnerModule();
	}

	@And("I create a profile with Add access only to Executive in Partner Module test")
	public void createProfileWithAddExecutiveAccess() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileAddExecutive();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	// Mailing Address
	@And("the user should not be able to add or edit Mailing Address in Partner Module test")
	public void cannotAddOrEditMailingAddress() {

		partnerPage.verifyUserCannotAddOrEditMailingAddressInPartnerModule();
	}

	@And("the user should be able to delete Mailing Address in Partner Module test")
	public void deleteMailingAddressInPartnerModule() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddCustomPartnersUrl = Hooks.prop.getProperty("partnerAddCustomPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddCustomPartnersUrl);

		String fullCustomPartnerUrl = baseUrl + partnerAddCustomPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openCustomPartnersUrl(fullCustomPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));

		partnerPage.verifyUserCanDeleteMailingAddressInPartnerModule();
	}

	@And("I create a profile with Delete access only to Mailing Address in Partner Module test")
	public void createProfileWithDeleteMailingAddressAccess() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileDeleteMailingAddress();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("the user should not be able to add or delete Mailing Address in Partner Module test")
	public void cannotAddOrDeleteMailingAddress() {

		partnerPage.verifyUserCannotAddOrDeleteMailingAddressInPartnerModule();
	}

	@And("the user should be able to edit Mailing Address in Partner Module test")
	public void editMailingAddressInPartnerModule() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddCustomPartnersUrl = Hooks.prop.getProperty("partnerAddCustomPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddCustomPartnersUrl);

		String fullCustomPartnerUrl = baseUrl + partnerAddCustomPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openCustomPartnersUrl(fullCustomPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));

		partnerPage.verifyUserCanEditMailingAddressInPartnerModule();
	}

	@And("I create a profile with Edit access only to Mailing Address in Partner Module test")
	public void createProfileWithEditMailingAddressAccess() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileEditMailingAddress();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("the user should not be able to edit or delete Mailing Address in Partner Module test")
	public void cannotEditOrDeleteMailingAddress() {

		partnerPage.verifyUserCannotEditOrDeleteMailingAddressInPartnerModule();
	}

	@And("I create a profile with Add access only to Mailing Address in Partner Module test")
	public void createProfileWithAddMailingAddressAccess() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileAddMailingAddress();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("the user should be able to add Mailing Address in Partner Module test")
	public void addMailingAddressInPartnerModule() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddCustomPartnersUrl = Hooks.prop.getProperty("partnerAddCustomPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddCustomPartnersUrl);

		String fullCustomPartnerUrl = baseUrl + partnerAddCustomPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openCustomPartnersUrl(fullCustomPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));

		partnerPage.verifyUserCanAddMailingAddressInPartnerModule();
	}

	// Business Address
	@And("the user should not be able to add or edit Business Address in Partner test")
	public void cannotAddOrEditBusinessAddress() {

		partnerPage.verifyUserCannotAddOrEditBusinessAddressInPartnerModule();
	}

	@And("the user should be able to delete Business Address in Partner Module test")
	public void deleteBusinessAddressInPartnerModule() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddCustomPartnersUrl = Hooks.prop.getProperty("partnerAddCustomPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddCustomPartnersUrl);

		String fullCustomPartnerUrl = baseUrl + partnerAddCustomPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openCustomPartnersUrl(fullCustomPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));

		partnerPage.verifyUserCanDeleteBusinessAddressInPartnerModule();
	}

	@And("I create a profile with Delete access only to Business Address in Partner Module test")
	public void createProfileWithDeleteBusinessAddressAccess() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileDeleteBusinessAddress();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("the user should not be able to add or delete Business Address in Partner Module test")
	public void cannotAddOrDeleteBusinessAddress() {

		partnerPage.verifyUserCannotAddOrDeleteBusinessAddressInPartnerModule();
	}

	@And("the user should be able to edit Business Address in Partner Module test")
	public void editBusinessAddressInPartnerModule() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddCustomPartnersUrl = Hooks.prop.getProperty("partnerAddCustomPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddCustomPartnersUrl);

		String fullCustomPartnerUrl = baseUrl + partnerAddCustomPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openCustomPartnersUrl(fullCustomPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));

		partnerPage.verifyUserCanEditBusinessAddressInPartnerModule();
	}

	@And("I create a profile with Edit access only to Business Address in Partner Module test")
	public void createProfileWithEditBusinessAddressAccess() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileEditBusinessAddress();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("the user should not be able to edit or delete Business Address in Partner Module test")
	public void cannotEditOrDeleteBusinessAddress() {

		partnerPage.verifyUserCannotEditOrDeleteBusinessAddressInPartnerModule();
	}

	@And("the user should be able to add Business Address in Partner Module test")
	public void addBusinessAddressInPartnerModule() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddCustomPartnersUrl = Hooks.prop.getProperty("partnerAddCustomPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddCustomPartnersUrl);

		String fullCustomPartnerUrl = baseUrl + partnerAddCustomPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openCustomPartnersUrl(fullCustomPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));

		partnerPage.verifyUserCanAddBusinessAddressInPartnerModule();
	}

	@And("I create a profile with Add access only to Business Address in Partner Module test")
	public void createProfileWithAddAccessToBusinessAddress() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileAddBusinessAddress();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}
	// Custom Partners

	@And("the user should not be able to add, edit, or delete Custom Partners in Partner Module test")
	public void verifyUserCannotAddEditOrDeleteCustomPartnersInPartnerModule() {

		partnerPage.verifyUserCannotAddEditOrDeleteCustomPartnersInPartnerModule();
	}

	@And("the user should be able to view and see details of Custom Partners in Partner Module test")
	public void verifyUserCanViewCustomPartnersDetailsInPartnerModule() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddCustomPartnersUrl = Hooks.prop.getProperty("partnerAddCustomPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddCustomPartnersUrl);

		String fullCustomPartnerUrl = baseUrl + partnerAddCustomPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openCustomPartnersUrl(fullCustomPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));

		partnerPage.verifyUserCanViewAndSeeDetailsOfCustomPartnersInPartnerModule();
	}

	@And("I create a profile with View Details access only to Custom Partners in Partner Module test")
	public void verifyProfileWithViewDetailsAccessOnlyToCustomPartnersInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.verifyViewOnlyAccessToCustomPartnersProfile();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("the user should not be able to add or edit Custom Partners in Partner Module test")
	public void verifyUserCannotAddOrEditCustomPartnersInPartnerModule() {

		partnerPage.verifyUserCannotAddOrEditCustomPartnersInPartnerModule();
	}

	@And("the user should be able to delete Custom Partners in Partner Module test")
	public void verifyUserCanDeleteCustomPartnersInPartnerModule() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddCustomPartnersUrl = Hooks.prop.getProperty("partnerAddCustomPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddCustomPartnersUrl);

		String fullCustomPartnerUrl = baseUrl + partnerAddCustomPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openCustomPartnersUrl(fullCustomPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));

		partnerPage.verifyUserCanDeleteCustomPartnersInPartnerModule();
	}

	@And("I create a profile with Delete access only to Custom Partners in Partner Module test")
	public void verifyProfileWithDeleteAccessOnlyToCustomPartnersInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.verifyDeleteOnlyAccessToCustomPartnersProfile();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("the user should not be able to add or delete Custom Partners in Partner Module test")
	public void verifyUserCannotAddOrDeleteCustomPartnersInPartnerModule() {

		partnerPage.verifyUserCannotAddOrDeleteCustomPartnersInPartnerModule();
	}

	@And("I create a profile with Edit access only to Custom Partners in Partner Module test")
	public void verifyProfileWithEditAccessOnlyToCustomPartnersInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.verifyEditOnlyAccessToCustomPartnersProfile();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("the user should not be able to edit or delete Custom Partners in Partner Module test")
	public void verifyUserCannotEditOrDeleteCustomPartnersInPartnerModule() {

		partnerPage.verifyUserCannotEditOrDeleteCustomPartnersInPartnerModule();
	}

	@And("the user should be able to edit Custom Partners in Partner Module test")
	public void verifyUserCanEditCustomPartnersInPartnerModule() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddCustomPartnersUrl = Hooks.prop.getProperty("partnerAddCustomPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddCustomPartnersUrl);

		String fullCustomPartnerUrl = baseUrl + partnerAddCustomPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openCustomPartnersUrl(fullCustomPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));

		partnerPage.verifyUserCanEditCustomPartnersInPartnerModule();
	}

	@And("the user should be able to add Custom Partners in Partner Module test")
	public void verifyUserCanAddCustomPartnersInPartnerModule() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddCustomPartnersUrl = Hooks.prop.getProperty("partnerAddCustomPartnersUrl");

		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddCustomPartnersUrl);

		String fullCustomPartnerUrl = baseUrl + partnerAddCustomPartnersUrl;

		partnerPage = new partnerpage(Hooks.driver);

		partnerPage.openCustomPartnersUrl(fullCustomPartnerUrl);

		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=6b73f9ca-5250-4d9c-8772-c2d33f5c5850"));

		partnerPage.verifyUserCanAddCustomPartnersInPartnerModule();
	}

	@And("I create a profile with Add access only to Custom Partners in Partner Module test")
	public void verifyProfileWithAddAccessOnlyToCustomPartnersInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.verifyAddOnlyAccessToCustomPartnersProfile();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	// Special Service
	@And("I create a profile with Edit access only to Special Service in Partner Module test")
	public void verifyProfileWithEditAccessOnlyToSpecialServiceInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.verifyUserWithEditOnlyAccessCanEditSpecialServiceInPartnerModule();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("the user should not be able to add Special Service in Partner Module test")
	public void verifyUserCannotAddSpecialServiceInPartnerModule() {

		partnerPage.verifyUserCannotAddSpecialServiceInPartnerModule();
	}

	@And("the user should not be able to edit Special Service in Partner Module test")
	public void verifyUserCannotEditSpecialServiceInPartnerModule() {
		partnerPage.verifyUserCannotEditSpecialServiceInPartnerModule();
	}

	@And("the user should be able to edit Special Service in Partner Module test")
	public void verifyUserCanEditSpecialServiceInPartnerModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddSpecialServiceUrl = Hooks.prop.getProperty("partnerAddSpecialServiceUrl");
		Assert.assertNotNull("partnerAddSpecialServiceUrl is missing in config", partnerAddSpecialServiceUrl);
		String fullAddSpecialServiceUrl = baseUrl + partnerAddSpecialServiceUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAddSpecialServiceUrl(fullAddSpecialServiceUrl);
		Assert.assertTrue("Add Special Service page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/SpecialServices"));
		partnerPage.verifyUserCanEditSpecialServiceInPartnerModule();
	}

	@And("the user should be able to add Special Service in Partner Module test")
	public void verifyUserCanAddSpecialServiceInPartnerModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddSpecialServiceUrl = Hooks.prop.getProperty("partnerAddSpecialServiceUrl");
		Assert.assertNotNull("partnerAddSpecialServiceUrl is missing in config", partnerAddSpecialServiceUrl);
		String fullAddSpecialServiceUrl = baseUrl + partnerAddSpecialServiceUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAddSpecialServiceUrl(fullAddSpecialServiceUrl);
		Assert.assertTrue("Add Special Service page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/SpecialServices"));
		partnerPage.verifyUserCanAddSpecialServiceInPartnerModule();
	}

	@And("I create a profile with Add access only to Special Service in Partner Module test")
	public void verifyProfileWithAddAccessOnlyToSpecialServiceInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.verifyAddOnlyAccessToSpecialServiceProfile();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	// Partner Type

	@And("the user should not be able to add or edit Partner Type in Partner Module test")
	public void verifyUserCannotAddOrEditPartnerTypeInPartnerModule() {
		partnerPage.verifyUserCannotAddOrEditPartnerTypeInPartnerModule();
	}

	@And("the user should be able to delete Partner Type in Partner Module test")
	public void verifyUserCanDeletePartnerTypeInPartnerModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddPartnerTypeUrl = Hooks.prop.getProperty("partnerAddPartnerTypeUrl");
		Assert.assertNotNull("partnerAddPartnerTypeUrl is missing in config", partnerAddPartnerTypeUrl);
		String fullAddPartnerTypeUrl = baseUrl + partnerAddPartnerTypeUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAddPartnerTypeUrl(fullAddPartnerTypeUrl);
		Assert.assertTrue("Add Partner Type page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PartnerTypes"));
		partnerPage.verifyUserCanDeletePartnerTypeInPartnerModule();
	}

	@And("I create a profile with Delete access only to Partner Type in Partner Module test")
	public void verifyProfileWithDeleteAccessOnlyToPartnerTypeInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.verifyDeleteOnlyAccessToPartnerTypeProfile();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("the user should not be able to add or delete Partner Type in Partner Module test")
	public void verifyUserCannotAddOrDeletePartnerTypeInPartnerModule() {
		partnerPage.verifyUserCannotAddOrDeletePartnerTypeInPartnerModule();
	}

	@And("the user should be able to edit Partner Type in Partner Module test")
	public void verifyUserCanEditPartnerTypeInPartnerModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddPartnerTypeUrl = Hooks.prop.getProperty("partnerAddPartnerTypeUrl");
		Assert.assertNotNull("partnerAddPartnerTypeUrl is missing in config", partnerAddPartnerTypeUrl);
		String fullAddPartnerTypeUrl = baseUrl + partnerAddPartnerTypeUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAddPartnerTypeUrl(fullAddPartnerTypeUrl);
		Assert.assertTrue("Add Partner Type page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PartnerTypes"));
		partnerPage.verifyUserCanEditPartnerTypeInPartnerModule();
	}

	@And("I create a profile with Edit access only to Partner Type in Partner Module test")
	public void verifyProfileWithEditAccessOnlyToPartnerTypeInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.verifyUserWithEditOnlyAccessCanEditPartnerTypeInPartnerModule();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("the user should not be able to edit or delete Partner Type in Partner Module test")
	public void verifyUserCannotEditOrDeletePartnerTypeInPartnerModule() {
		partnerPage.verifyUserCannotEditOrDeletePartnerTypeInPartnerModule();
	}

	@And("the user should be able to add Partner Type in Partner Module test")
	public void verifyUserCanAddPartnerTypeInPartnerModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddPartnerTypeUrl = Hooks.prop.getProperty("partnerAddPartnerTypeUrl");
		Assert.assertNotNull("partnerAddPartnerTypeUrl is missing in config", partnerAddPartnerTypeUrl);
		String fullAddPartnerTypeUrl = baseUrl + partnerAddPartnerTypeUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAddPartnerTypeUrl(fullAddPartnerTypeUrl);
		Assert.assertTrue("Add Partner Type page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PartnerTypes"));
		partnerPage.verifyUserCanAddPartnerTypeInPartnerModule();
	}

	// General
	@And("I create a profile with Add access only to Partner Type in Partner Module test")
	public void createProfileWithAddAccessOnlyToPartnerType() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.testAddAccessOnlyForPartnerType();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("I create a profile with No access to Partner Module General Audit View test")
	public void createProfileWithNoAccessToPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.verifyNoAccessToGeneralAuditView();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("I create a profile with View access only to Partner Module General Audit View test")
	public void createProfileWithViewAccessToPartnerModuleGeneralAuditView() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.ToPartnerModuleGeneral();
		partnerPage.clickSubmitButton();
		System.out.println("Profile created with View access only for Clinical Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only for Clinical Module General Audit View test");

	}

	@And("the user should be able to view General Audit View settings in Partner Module test")
	public void userShouldBeAbleToViewGeneralAuditViewSettingsInPartnerModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerGeneralAuditViewUrl = Hooks.prop.getProperty("partnerGeneralAuditViewUrl");
		Assert.assertNotNull("generalAuditViewUrl is missing in config", partnerGeneralAuditViewUrl);
		String fullGeneralAuditViewUrl = baseUrl + partnerGeneralAuditViewUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openfullGeneralAuditViewUrl(fullGeneralAuditViewUrl);
		Assert.assertTrue("General Audit View page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		partnerPage.verifyUserCanViewGeneralAuditViewInPartnerModule();

	}

	@And("the user should not be able to view General Audit View settings in Partner Module test")
	public void verifyUserCannotViewGeneralAuditViewSettingsInPartnerModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerGeneralAuditViewUrl = Hooks.prop.getProperty("partnerGeneralAuditViewUrl");
		Assert.assertNotNull("generalAuditViewUrl is missing in config", partnerGeneralAuditViewUrl);
		String fullGeneralAuditViewUrl = baseUrl + partnerGeneralAuditViewUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openfullGeneralAuditViewUrl(fullGeneralAuditViewUrl);
		Assert.assertTrue("General Audit View page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		partnerPage.verifyUserCannotViewGeneralAuditViewInPartnerModule();

	}

	// Profile
	@And("the Partner user should be able to view Profiles test")
	public void partnerUserShouldBeAbleToViewProfiles() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerProfilesUrl = Hooks.prop.getProperty("profilesPageUrl");
		Assert.assertNotNull("profilesPageUrl is missing in config", partnerProfilesUrl);
		String fullProfilesUrl = baseUrl + partnerProfilesUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openPartnerProfilesPage(fullProfilesUrl);
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Profiles"));
		System.out.println("Clinical user should be able to view Profiles test");
		Hooks.scenario.log("Clinical user should be able to view Profiles test");

	}

}
