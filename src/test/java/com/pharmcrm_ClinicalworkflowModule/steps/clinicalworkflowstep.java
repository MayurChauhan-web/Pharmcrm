package com.pharmcrm_ClinicalworkflowModule.steps;

import org.junit.Assert;
import com.pharmcrm_ClinicalworkflowModule.pages.clinicalworkflowpage;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class clinicalworkflowstep {

	private clinicalworkflowpage clinicalworkflowPage;

	@Then("the Clinicalworkflow user should be able to view Profiles")
	public void clinicalworkflowUserShouldBeAbleToViewProfiles() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String profilesPageUrl = Hooks.prop.getProperty("profilesPageUrl");
		String fullUrl = baseUrl + profilesPageUrl;
		clinicalworkflowPage = new clinicalworkflowpage(Hooks.driver);
		clinicalworkflowPage.openclinicalworkflowPage(fullUrl, "/Setup/Home/Profiles");
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Profiles"));
		System.out.println("Patient user should be able to view Profiles test");
		Hooks.scenario.log("Patient user should be able to view Profiles test");

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
		System.out.println("Profile updated with View access only to Patient Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Patient Module General Audit View");
	}

	@Then("the user should be able to view Clinicalworkflow Module General Audit View test")
	public void userShouldBeAbleToViewClinicalWorkflowModuleGeneralAudit() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String enrollmentsUrl = Hooks.prop.getProperty("enrollmentsPageUrl");
		clinicalworkflowPage.openPatientEnrollmentsPage(baseUrl + enrollmentsUrl);
		clinicalworkflowPage.verifyGeneralAuditViewColumns();
		System.out.println("Patient Enrollments General Audit View verified successfully");
		Hooks.scenario.log("Patient Enrollments General Audit View verified successfully");
	}
}
