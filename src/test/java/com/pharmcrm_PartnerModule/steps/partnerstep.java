package com.pharmcrm_PartnerModule.steps;

import org.junit.Assert;
import com.pharmcrm_PartnerModule.pages.partnerpage;
import hooks.Hooks;
import io.cucumber.java.en.And;

public class partnerstep {

	private partnerpage partnerPage;

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
