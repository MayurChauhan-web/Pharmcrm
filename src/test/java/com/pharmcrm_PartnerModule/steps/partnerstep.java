package com.pharmcrm_PartnerModule.steps;

import org.junit.Assert;
import com.pharmcrm_PartnerModule.pages.partnerpage;
import hooks.Hooks;
import io.cucumber.java.en.And;

public class partnerstep {

	private partnerpage partnerPage;

	// Profile
	@And("the Clinical user should be able to view Profiles test")
	public void clinicalUserShouldBeAbleToViewProfiles() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String clinicalProfilesUrl = Hooks.prop.getProperty("profilesPageUrl");
		Assert.assertNotNull("profilesPageUrl is missing in config", clinicalProfilesUrl);
		String fullProfilesUrl = baseUrl + clinicalProfilesUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openPartnerProfilesPage(fullProfilesUrl);
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Profiles"));
		System.out.println("Clinical user should be able to view Profiles test");
		Hooks.scenario.log("Clinical user should be able to view Profiles test");

	}

}
