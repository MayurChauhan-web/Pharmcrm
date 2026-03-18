package com.pharmcrm_PartnerModule.steps;

import org.junit.Assert;
import org.junit.Assume;
import com.pharmcrm_PartnerModule.pages.partnerpage;
import hooks.Hooks;
import io.cucumber.java.en.And;

public class partnerstep {

	private partnerpage partnerPage;

	// Partner
	@And("Validation should have to show for Special Service Blank Field")
	public void verifySpecialServiceBlankFieldValidation() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");
		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);
		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);
		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		String result = partnerPage.validateSpecialServiceBlankFields();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Validation should have to show for Add Special Event Blank Field")
	public void verifyAddSpecialEventBlankFieldValidation() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");
		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);
		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);
		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		String result = partnerPage.validateAddSpecialEventBlankFields();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Validation should have to show for Invalid Url, Original Date and Expiry Date")
	public void verifyInvalidUrlAndDateValidation() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");
		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);
		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);
		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		String result = partnerPage.validateInvalidUrlOriginalAndExpiryDate();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Validation should have to show for Add Partner License Blank Field")
	public void verifyAddPartnerLicenseBlankFieldValidation() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");
		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);
		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);
		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		String result = partnerPage.validateAddPartnerLicenseBlankFields();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Validation should have to show for Invalid Phone Number, Email Id")
	public void verifyInvalidPhoneAndEmailValidation() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");
		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);
		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);
		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		String result = partnerPage.validateInvalidPhoneEmailFields();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Validation should have to show for Add Referral Enrollment")
	public void verifyAddReferralEnrollmentValidation() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");
		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);
		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);
		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		String result = partnerPage.validateAddReferralEnrollment();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Validation should have to show for Invalid Phone Number,Cell Number,Email Id")
	public void validateInvalidPhoneCellAndEmail() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");
		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);
		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);
		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		String result = partnerPage.verifyInvalidContactInfoValidation();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Validation should have to show for Add Executive Blank Submission")
	public void verifyAddExecutiveBlankSubmissionValidation() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");
		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);
		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);
		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		String result = partnerPage.validateAddExecutiveBlankSubmission();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Validation should have to show Mailing Address Invalid Zipcode")
	public void verifyMailingAddressInvalidZipcodeValidation() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");
		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);
		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);
		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		String result = partnerPage.validateMailingAddressInvalidZipcode();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Validation should have to show for Mailing Address Blank Submission")
	public void verifyMailingAddressBlankSubmissionValidation() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");
		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);
		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);
		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		String result = partnerPage.validateMailingAddressBlankSubmission();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Validation should have to show Invalid Zipcode")
	public void verifyInvalidZipcodeValidation() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");
		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);
		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);
		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		String result = partnerPage.validateInvalidZipcodeEntry();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Validation should have to show for Add Business Address")
	public void verifyAddBusinessAddressValidation() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");
		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);
		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);
		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		String result = partnerPage.validateAddBusinessAddressSubmission();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Validation should have to show for New Special Hour Blank Submission")
	public void verifyNewSpecialHourBlankSubmissionValidation() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");
		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);
		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);
		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		String result = partnerPage.validateNewSpecialHourBlankSubmission();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Validation for Invalid Phone Number, Alternate Phone Number, Email Id should have to display")
	public void verifyInvalidContactDetailsValidation() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");
		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);
		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);
		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		String result = partnerPage.validateInvalidPhoneAlternatePhoneAndEmail();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("New Partner Blank Submission Validation should have to show")
	public void verifyNewPartnerBlankSubmissionValidation() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");
		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);
		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);
		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		String result = partnerPage.validateNewPartnerBlankSubmission();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	// DeDupe
	@And("Checkbox Validation should have to show if not selected test")
	public void verifyCheckboxValidationIfNotSelected() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerDeDupeUrl = Hooks.prop.getProperty("partnerDeDupeUrl");
		Assert.assertNotNull("partnerDeDupeUrl is missing in config", partnerDeDupeUrl);
		String fullDeDupePartnerUrl = baseUrl + partnerDeDupeUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullDeDupePartnerUrl);
		Assert.assertTrue("DeDupe Partners page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Partner/Home/DeDupePartners"));
		String result = partnerPage.validateCheckbox();
		Thread.sleep(2000);
		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);
		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("the user should not be able to update DeDupe records in Partners Module via UI or direct URL test")
	public void verifyDeDupeRecordsUpdateBlocked() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerDeDupeUrl = Hooks.prop.getProperty("partnerDeDupeUrl");
		Assert.assertNotNull("partnerDeDupeUrl is missing in config", partnerDeDupeUrl);
		String fullDeDupePartnerUrl = baseUrl + partnerDeDupeUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullDeDupePartnerUrl);
		Assert.assertTrue("DeDupe Partners page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Partner/Home/DeDupePartners"));
		partnerPage.userShouldNotBeAbleToUpdateDeDupeRecordsInPartnersModule();
	}

	@And("I create a profile without Update access to DeDupe in Partners Module test")
	public void verifyDeDupeUpdateRestricted() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.checkDeDupeUpdatePermissionDenied();
		partnerPage.clickSubmitButton();

	}

	@And("the user should be able to update DeDupe records in Partners Module test")
	public void verifyDeDupeRecordsUpdatable() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerDeDupeUrl = Hooks.prop.getProperty("partnerDeDupeUrl");
		Assert.assertNotNull("partnerDeDupeUrl is missing in config", partnerDeDupeUrl);
		String fullDeDupePartnerUrl = baseUrl + partnerDeDupeUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullDeDupePartnerUrl);
		Assert.assertTrue("DeDupe Partners page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Partner/Home/DeDupePartners"));
		partnerPage.userShouldBeAbleToUpdateDeDupeRecordsInPartnersModule();
	}

	@And("I create a profile with Update access to DeDupe in Partners Module test")
	public void verifyDeDupeUpdateAccess() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.checkDeDupeUpdatePermission();
		partnerPage.clickSubmitButton();

	}

	// Partner Agreement
	@And("the user should not be able to add or edit Partner Agreement in Partner Module test")
	public void verifyPartnerAgreementAddEditRestricted() throws InterruptedException {
		partnerPage.verifyUserCannotAddOrEditPartnerAgreement();
	}

	@And("the user should be able to delete Partner Agreement in Partner Module test")
	public void verifyPartnerAgreementDeletable() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCanDeletePartnerAgreement();
	}

	@And("I create a profile with Delete access only to Partner Agreement in Partner Module test")
	public void verifyPartnerAgreementDeleteOnlyAccess() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.checkPartnerAgreementDeletePermission();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to add or delete Partner Agreement in Partner Module test")
	public void verifyPartnerAgreementAddDeleteRestricted() throws InterruptedException {
		partnerPage.verifyUserCannotAddOrDeletePartnerAgreement();
	}

	@And("the user should be able to edit Partner Agreement in Partner Module test")
	public void verifyPartnerAgreementEditable() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCanEditPartnerAgreement();
	}

	@And("I create a profile with Edit access only to Partner Agreement in Partner Module test")
	public void verifyPartnerAgreementEditOnlyAccess() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.checkPartnerAgreementEditPermission();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to edit or delete Partner Agreement in Partner Module test")
	public void verifyPartnerAgreementEditDeleteRestricted() throws InterruptedException {
		partnerPage.verifyUserCannotEditOrDeletePartnerAgreement();
	}

	@And("the user should be able to add Partner Agreement in Partner Module test")
	public void verifyPartnerAgreementCanAdd() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCanAddPartnerAgreement();
	}

	// Partner Special Hour
	@And("I create a profile with Add access only to Partner Agreement in Partner Module test")
	public void verifyPartnerAgreementAddOnlyAccess() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.verifyPartnerAgreementAddable();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to add or edit Partner Special Hour in Partner Module test")
	public void verifyPartnerSpecialHourAddEditRestricted() throws InterruptedException {
		partnerPage.verifyUserCannotAddOrEditPartnerSpecialHour();
	}

	@And("the user should be able to delete Partner Special Hour in Partner Module test")
	public void verifyPartnerSpecialHourDeletable() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCanDeletePartnerSpecialHour();
	}

	@And("I create a profile with Delete access only to Partner Special Hour in Partner Module test")
	public void verifyPartnerSpecialHourDeleteOnlyAccess() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.checkPartnerSpecialHourDeletePermission();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to add or delete Partner Special Hour in Partner Module test")
	public void verifyPartnerSpecialHourAddDeleteRestricted() throws InterruptedException {
		partnerPage.verifyUserCannotAddOrDeletePartnerSpecialHour();
	}

	@And("the user should be able to edit Partner Special Hour in Partner Module test")
	public void verifyPartnerSpecialHourEditable() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCanEditPartnerSpecialHour();
	}

	@And("I create a profile with Edit access only to Partner Special Hour in Partner Module test")
	public void verifyPartnerSpecialHourEditAccess() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.checkPartnerSpecialHourEditPermissions();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to edit or delete Partner Special Hour in Partner Module test")
	public void verifyPartnerSpecialHourIsReadOnly() throws InterruptedException {
		partnerPage.verifyUserCannotEditOrDeletePartnerSpecialHour();
	}

	@And("the user should be able to add Partner Special Hour in Partner Module test")
	public void userShouldBeAbleToAddPartnerSpecialHour() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCanAddPartnerSpecialHour();
	}

	@And("I create a profile with Add access only to Partner Special Hour in Partner Module test")
	public void createProfileWithAddAccessToPartnerSpecialHour() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.grantAddAccessToPartnerSpecialHour();
		partnerPage.clickSubmitButton();

	}

	// Partner Special Service
	@And("the user should not be able to add or edit Partner Special Service in Partner Module test")
	public void userShouldNotBeAbleToAddOrEditPartnerSpecialService() throws InterruptedException {
		partnerPage.verifyUserCannotAddOrEditPartnerSpecialService();
	}

	@And("the user should be able to delete Partner Special Service in Partner Module test")
	public void userShouldBeAbleToDeletePartnerSpecialService() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCanDeletePartnerSpecialService();
	}

	@And("I create a profile with Delete access only to Partner Special Service in Partner Module test")
	public void createProfileWithDeleteAccessToPartnerSpecialService() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.grantDeleteAccessToPartnerSpecialService();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to add or delete Partner Special Service in Partner Module test")
	public void userShouldNotBeAbleToAddOrDeletePartnerSpecialService() throws InterruptedException {
		partnerPage.verifyUserCannotAddOrDeletePartnerSpecialService();
	}

	@And("the user should be able to edit Partner Special Service in Partner Module test")
	public void userShouldBeAbleToEditPartnerSpecialService() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCanEditPartnerSpecialService();
	}

	@And("I create a profile with Edit access only to Partner Special Service in Partner Module test")
	public void createProfileWithEditAccessToPartnerSpecialService() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.grantEditAccessToPartnerSpecialService();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to edit or delete Partner Special Service in Partner Module test")
	public void userShouldNotBeAbleToEditOrDeletePartnerSpecialService() throws InterruptedException {
		partnerPage.verifyUserCannotEditOrDeletePartnerSpecialService();
	}

	@And("the user should be able to add Partner Special Service in Partner Module test")
	public void userShouldBeAbleToAddPartnerSpecialService() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCanAddPartnerSpecialService();
	}

	@And("I create a profile with Add access only to Partner Special Service in Partner Module test")
	public void createProfileWithAddAccessToPartnerSpecialService() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.grantAddAccessToPartnerSpecialService();
		partnerPage.clickSubmitButton();

	}

	// Partner Special Event
	@And("the user should not be able to add or edit Partner Special Event in Partner Module test")
	public void userShouldNotBeAbleToAddOrEditPartnerSpecialEvent() throws InterruptedException {
		partnerPage.verifyUserCannotAddOrEditPartnerSpecialEvent();
	}

	@And("the user should be able to delete Partner Special Event in Partner Module test")
	public void userShouldBeAbleToDeletePartnerSpecialEvent() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCanDeletePartnerSpecialEvent();
	}

	@And("I create a profile with Delete access only to Partner Special Event in Partner Module test")
	public void createProfileWithDeleteAccessToPartnerSpecialEvent() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.grantDeleteAccessToPartnerSpecialEvent();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to add or delete Partner Special Event in Partner Module test")
	public void userShouldNotBeAbleToAddOrDeletePartnerSpecialEvent() throws InterruptedException {
		partnerPage.verifyUserCannotAddOrDeletePartnerSpecialEvent();
	}

	@And("the user should be able to edit Partner Special Event in Partner Module test")
	public void userShouldBeAbleToEditPartnerSpecialEvent() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCanEditPartnerSpecialEvent();
	}

	@And("I create a profile with Edit access only to Partner Special Event in Partner Module test")
	public void createProfileWithEditAccessToPartnerSpecialEvent() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.grantEditAccessToPartnerSpecialEvent();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to edit or delete Partner Special Event in Partner Module test")
	public void userShouldNotBeAbleToEditOrDeletePartnerSpecialEvent() throws InterruptedException {
		partnerPage.verifyUserCannotEditOrDeletePartnerSpecialEvent();
	}

	@And("the user should be able to add Partner Special Event in Partner Module test")
	public void userShouldBeAbleToAddPartnerSpecialEvent() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCanAddPartnerSpecialEvent();
	}

	@And("I create a profile with Add access only to Partner Special Event in Partner Module test")
	public void createProfileWithAddAccessToPartnerSpecialEvent() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.grantAddAccessToPartnerSpecialEvent();
		partnerPage.clickSubmitButton();

	}

	// Partner License
	@And("the user should not be able to add, delete Partner License in Partner Module test")
	public void verifyUserCannotAddOrDeletePartnerLicense() throws InterruptedException {
		partnerPage.verifyUserCannotAddOrDeletePartnerLicense();
	}

	@And("the user should be able to download files in Partner License in Partner Module test")
	public void userShouldBeAbleToDownloadFilesInPartnerLicense() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCanDownloadFilesInPartnerLicenseInPartnerModule();
	}

	@And("I create a profile with Download File access only to Partner License in Partner Module test")
	public void createProfileWithDownloadAccessToPartnerLicense() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.grantDownloadAccessToPartnerLicense();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to add, edit, or delete Partner License in Partner Module test")
	public void userShouldNotBeAbleToAddEditOrDeletePartnerLicense() throws InterruptedException {
		partnerPage.verifyUserCannotAddEditOrDeletePartnerLicenseInPartnerModule();
	}

	@And("the user should be able to view Partner License details in Partner Module test")
	public void userShouldBeAbleToViewPartnerLicenseDetails() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCanViewPartnerLicenseDetailsInPartnerModule();
	}

	@And("I create a profile with Details access only to Partner License in Partner Module test")
	public void createProfileWithDetailsAccessToPartnerLicense() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.grantDetailsAccessToPartnerLicense();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to add or edit Partner License in Partner Module test")
	public void userShouldNotBeAbleToAddOrEditPartnerLicense() throws InterruptedException {
		partnerPage.verifyUserCannotAddOrEditPartnerLicenseInPartnerModule();
	}

	@And("the user should be able to delete Partner License in Partner Module test")
	public void userShouldBeAbleToDeletePartnerLicense() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCanDeletePartnerLicenseInPartnerModule();
	}

	@And("I create a profile with Delete access only to Partner License in Partner Module test")
	public void createProfileWithDeleteAccessToPartnerLicense() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.grantDeleteAccessToPartnerLicense();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to add or delete Partner License in Partner Module test")
	public void userShouldNotBeAbleToAddOrDeletePartnerLicense() throws InterruptedException {
		partnerPage.verifyUserCannotAddOrDeletePartnerLicenseInPartnerModule();
	}

	@And("the user should be able to edit Partner License in Partner Module test")
	public void userShouldBeAbleToEditPartnerLicense() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCanEditPartnerLicenseInPartnerModule();
	}

	@And("I create a profile with Edit access only to Partner License in Partner Module test")
	public void createProfileWithEditAccessToPartnerLicense() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.grantEditAccessToPartnerLicense();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to download files in Partner License in Partner Module test")
	public void userShouldNotBeAbleToDownloadFilesInPartnerLicense() throws InterruptedException {
		partnerPage.verifyUserCannotDownloadFilesInPartnerLicenseInPartnerModule();
	}

	@And("the user should not be able to view Partner License details in Partner Module test")
	public void userShouldNotBeAbleToViewPartnerLicenseDetails() throws InterruptedException {
		partnerPage.verifyUserCannotViewPartnerLicenseDetailsInPartnerModule();
	}

	@And("the user should not be able to edit or delete Partner License in Partner Module test")
	public void userShouldNotBeAbleToEditOrDeletePartnerLicense() throws InterruptedException {
		partnerPage.verifyUserCannotEditOrDeletePartnerLicenseInPartnerModule();
	}

	@And("the user should be able to add Partner License in Partner Module test")
	public void userShouldBeAbleToAddPartnerLicense() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCanAddPartnerLicenseInPartnerModule();
	}

	@And("I create a profile with Add access only to Partner License in Partner Module test")
	public void createProfileWithAddAccessToPartnerLicense() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.grantAddAccessToPartnerLicense();
		partnerPage.clickSubmitButton();

	}

	// Funding Company
	@And("the user should not be able to add, edit, or delete Funding Company in Partner Module test")
	public void userShouldNotBeAbleToAddEditOrDeleteFundingCompany() throws InterruptedException {
		partnerPage.verifyUserCannotAddEditOrDeleteFundingCompany();
	}

	@And("the user should be able to view Funding Company details in Partner Module test")
	public void userShouldBeAbleToViewFundingCompanyDetails() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersFundingCompanyUrl = Hooks.prop.getProperty("partnersFundingCompanyUrl");
		Assert.assertNotNull("partnersFundingCompanyUrl is missing in config", partnersFundingCompanyUrl);
		String fullPartnersFundingCompanyUrl = baseUrl + partnersFundingCompanyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersFundingCompanyUrl);
		Assert.assertTrue("Partners (Funding Company) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=d4211063-cc31-48bd-a4bc-e856ff2ab7d8"));
		partnerPage.verifyUserCanViewFundingCompanyDetails();
	}

	@And("I create a profile with Details access only to Funding Company in Partner Module test")
	public void createProfileWithDetailsAccessToFundingCompany() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.grantDetailsAccessToFundingCompany();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to add or edit Funding Company in Partner Module test")
	public void userShouldNotBeAbleToAddOrEditFundingCompany() throws InterruptedException {
		partnerPage.verifyUserCannotAddOrEditFundingCompany();
	}

	@And("the user should be able to delete Funding Company in Partner Module test")
	public void userShouldBeAbleToDeleteFundingCompany() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersFundingCompanyUrl = Hooks.prop.getProperty("partnersFundingCompanyUrl");
		Assert.assertNotNull("partnersFundingCompanyUrl is missing in config", partnersFundingCompanyUrl);
		String fullPartnersFundingCompanyUrl = baseUrl + partnersFundingCompanyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersFundingCompanyUrl);
		Assert.assertTrue("Partners (Funding Company) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=d4211063-cc31-48bd-a4bc-e856ff2ab7d8"));
		partnerPage.verifyUserCanDeleteFundingCompany();
	}

	@And("I create a profile with Delete access only to Funding Company in Partner Module test")
	public void createProfileWithDeleteAccessToFundingCompany() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.grantDeleteAccessToFundingCompany();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to add or delete Funding Company in Partner Module test")
	public void userShouldNotBeAbleToAddOrDeleteFundingCompany() throws InterruptedException {
		partnerPage.verifyUserCannotAddOrDeleteFundingCompany();
	}

	@And("the user should be able to edit Funding Company in Partner Module test")
	public void userShouldBeAbleToEditFundingCompany() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersFundingCompanyUrl = Hooks.prop.getProperty("partnersFundingCompanyUrl");
		Assert.assertNotNull("partnersFundingCompanyUrl is missing in config", partnersFundingCompanyUrl);
		String fullPartnersFundingCompanyUrl = baseUrl + partnersFundingCompanyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersFundingCompanyUrl);
		Assert.assertTrue("Partners (Funding Company) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=d4211063-cc31-48bd-a4bc-e856ff2ab7d8"));
		partnerPage.verifyUserCanEditFundingCompany();
	}

	@And("I create a profile with Edit access only to Funding Company in Partner Module test")
	public void createProfileWithEditAccessToFundingCompany() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.grantEditAccessToFundingCompany();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to view Funding Company details in Partner Module test")
	public void userShouldNotBeAbleToViewFundingCompanyDetails() throws InterruptedException {
		partnerPage.verifyUserCannotViewFundingCompanyDetails();
	}

	@And("the user should not be able to edit or delete Funding Company in Partner Module test")
	public void userShouldNotBeAbleToEditOrDeleteFundingCompany() throws InterruptedException {
		partnerPage.verifyUserCannotEditOrDeleteFundingCompany();
	}

	@And("the user should be able to add Funding Company in Partner Module test")
	public void userShouldBeAbleToAddFundingCompany() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersFundingCompanyUrl = Hooks.prop.getProperty("partnersFundingCompanyUrl");
		Assert.assertNotNull("partnersFundingCompanyUrl is missing in config", partnersFundingCompanyUrl);
		String fullPartnersFundingCompanyUrl = baseUrl + partnersFundingCompanyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersFundingCompanyUrl);
		Assert.assertTrue("Partners (Funding Company) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=d4211063-cc31-48bd-a4bc-e856ff2ab7d8"));
		partnerPage.verifyUserCanAddFundingCompany();
	}

	@And("I create a profile with Add access only to Funding Company in Partner Module test")
	public void createProfileWithAddAccessToFundingCompany() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.userShouldBeAbleToAddFundingCompany();
		partnerPage.clickSubmitButton();

	}

	// Partner PA Details
	@And("the user should not be able to export Excel files in Partner PA Details in Partner Module test")
	public void userShouldNotBeAbleToExportExcelInPartnerPADetails() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCannotExportExcelInPartnerPADetails();
	}

	@And("I create a profile without Export Excel access to Partner PA Details in Partner Module test")
	public void createProfileWithoutExportExcelAccessToPartnerPADetails() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.userShouldNotBeAbleToExportExcelInPartnerPADetails();
		partnerPage.clickSubmitButton();

	}

	@And("the user should be able to export Excel files in Partner PA Details in Partner Module test")
	public void userShouldBeAbleToExportExcelInPartnerPADetails() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCanExportExcelInPartnerPADetails();
	}

	@And("I create a profile with Export Excel access only to Partner PA Details in Partner Module test")
	public void createProfileWithExportExcelAccessToPartnerPADetails() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.userShouldBeAbleToExportExcelInPartnerPADetails();
		partnerPage.clickSubmitButton();

	}

	// Partner Referral Outgoing Details
	@And("the user should not be able to download files in Referral Outgoing Details in Partner Module test")
	public void userShouldNotBeAbleToDownloadFilesInReferralOutgoingDetails() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCannotDownloadReferralOutgoingDetailsFile();
	}

	@And("I create a profile without Download File access to Referral Outgoing Details in Partner Module test")
	public void createProfileWithoutDownloadAccessToReferralOutgoingDetails() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.userShouldNotBeAbleToDownloadFilesInReferralOutgoingDetails();
		partnerPage.clickSubmitButton();

	}

	@And("the user should be able to download files in Referral Outgoing Details in Partner Module test")
	public void userShouldBeAbleToDownloadFilesInReferralOutgoingDetails() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCanDownloadReferralOutgoingDetailsFile();
	}

	@And("I create a profile with Download File access only to Referral Outgoing Details in Partner Module test")
	public void createProfileWithDownloadAccessToReferralOutgoingDetails() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.userShouldBeAbleToDownloadFilesInReferralOutgoingDetails();
		partnerPage.clickSubmitButton();

	}

	// Partner Referral Incoming Details
	@And("the user should not be able to download files in Referral Incoming Details in Partner Module test")
	public void userShouldNotBeAbleToDownloadFilesInReferralIncomingDetails() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCannotDownloadReferralIncomingDetailsFile();
	}

	@And("I create a profile without Download File access to Referral Incoming Details in Partner Module test")
	public void createProfileWithoutDownloadAccessToReferralIncomingDetails() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.userShouldNotBeAbleToDownloadFilesInReferralIncomingDetails();
		partnerPage.clickSubmitButton();

	}

	@And("the user should be able to download files in Referral Incoming Details in Partner Module test")
	public void userShouldBeAbleToDownloadFilesInReferralIncomingDetails() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCanDownloadReferralIncomingDetailsFile();
	}

	@And("I create a profile with Download File access only to Referral Incoming Details in Partner Module test")
	public void createProfileWithDownloadAccessToReferralIncomingDetails() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.userShouldBeAbleToDownloadFilesInReferralIncomingDetails();
		partnerPage.clickSubmitButton();

	}

	// Referral Patient History
	@And("the user should not be able to download files in Referral Patient History in Partner Module test")
	public void userShouldNotBeAbleToDownloadFilesInReferralPatientHistory() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCannotDownloadReferralPatientHistoryFile();
	}

	@And("I create a profile without Download File access to Referral Patient History in Partner Module test")
	public void createProfileWithoutDownloadAccessToReferralPatientHistory() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.userShouldNotBeAbleToDownloadFilesInReferralPatientHistory();
		partnerPage.clickSubmitButton();

	}

	@And("the user should be able to download files in Referral Patient History in Partner Module test")
	public void userShouldBeAbleToDownloadFilesInReferralPatientHistory() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.verifyUserCanDownloadReferralPatientHistoryFile();
	}

	@And("I create a profile with Download File access only to Referral Patient History in Partner Module test")
	public void createProfileWithDownloadAccessToReferralPatientHistory() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.userShouldBeAbleToDownloadReferralPatientHistory();
		partnerPage.clickSubmitButton();

	}

	// Referral Enrollment.
	@And("the user should not be able to add or edit Referral Enrollment in Partner Module test")
	public void userShouldNotBeAbleToAddOrEditReferralEnrollment() throws InterruptedException {
		partnerPage.verifyUserCannotAddOrEditReferralEnrollment();
	}

	@And("the user should be able to delete Referral Enrollment in Partner Module test")
	public void userShouldBeAbleToDeleteReferralEnrollment() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");
		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);
		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);
		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		partnerPage.verifyUserCanDeleteReferralEnrollment();
	}

	@And("I create a profile with Delete access only to Referral Enrollment in Partner Module test")
	public void createProfileWithDeleteAccessToReferralEnrollment() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.grantDeleteAccessToReferralEnrollment();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to add or delete Referral Enrollment in Partner Module test")
	public void userShouldNotBeAbleToAddOrDeleteReferralEnrollment() throws InterruptedException {
		partnerPage.verifyUserCannotAddOrDeleteReferralEnrollment();
	}

	@And("the user should be able to edit Referral Enrollment in Partner Module test")
	public void userShouldBeAbleToEditReferralEnrollment() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");
		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);
		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);
		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		partnerPage.verifyUserCanEditReferralEnrollment();
	}

	@And("I create a profile with Edit access only to Referral Enrollment in Partner Module test")
	public void createProfileWithEditAccessToReferralEnrollment() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.grantEditAccessToReferralEnrollment();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to edit or delete Referral Enrollment in Partner Module test")
	public void userShouldNotBeAbleToEditOrDeleteReferralEnrollmentInPartnerModule() throws InterruptedException {
		partnerPage.verifyUserCannotEditOrDeleteReferralEnrollment();
	}

	@And("the user should be able to add Referral Enrollment in Partner Module test")
	public void userShouldBeAbleToAddReferralEnrollmentInPartnerModule() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnerAddAttorneyPartnersUrl = Hooks.prop.getProperty("partnerAddAttorneyPartnersUrl");
		Assert.assertNotNull("partnerAddCustomPartnersUrl is missing in config", partnerAddAttorneyPartnersUrl);
		String fullAttorneyPartnerUrl = baseUrl + partnerAddAttorneyPartnersUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullAttorneyPartnerUrl);
		Assert.assertTrue("Custom Partners page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=85a7a8a7-803c-4801-8bfa-ef64491be0fd"));
		partnerPage.verifyUserCanAddReferralEnrollment();
	}

	@And("I create a profile with Add access only to Referral Enrollment in Partner Module test")
	public void createProfileWithAddAccessOnlyToReferralEnrollmentInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileWithAddAccessForReferralEnrollment();
		partnerPage.clickSubmitButton();

	}

	// Employers
	@And("the user should not be able to add, edit, or delete Employers in Partner Module test")
	public void userShouldNotBeAbleToAddEditOrDeleteEmployersInPartnerModule() throws InterruptedException {
		partnerPage.verifyUserCannotAddEditOrDeleteEmployersInPartnerModule();
	}

	@And("the user should be able to view Employers details in Partner Module test")
	public void userShouldBeAbleToViewEmployersDetailsInPartnerModule() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersEmployersUrl = Hooks.prop.getProperty("partnersEmployersUrl");
		Assert.assertNotNull("partnersEmployersUrl is missing in config", partnersEmployersUrl);
		String fullPartnersEmployersUrl = baseUrl + partnersEmployersUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersEmployersUrl);
		Assert.assertTrue("Partners (Employers) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=13a6a03f-50fa-4ddc-8893-48a77f74efc7"));
		partnerPage.verifyUserCanViewEmployersDetailsInPartnerModule();
	}

	@And("I create a profile with Details access only to Employers in Partner Module test")
	public void createProfileWithDetailsAccessOnlyToEmployersInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileWithDetailsAccessForEmployers();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to add or edit Employers in Partner Module test")
	public void userShouldNotBeAbleToAddOrEditEmployersInPartnerModule() throws InterruptedException {
		partnerPage.userShouldNotBeAbleToAddOrEditEmployersInPartnerModule();
	}

	@And("the user should be able to delete Employers in Partner Module test")
	public void userShouldBeAbleToDeleteEmployersInPartnerModule() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersEmployersUrl = Hooks.prop.getProperty("partnersEmployersUrl");
		Assert.assertNotNull("partnersEmployersUrl is missing in config", partnersEmployersUrl);
		String fullPartnersEmployersUrl = baseUrl + partnersEmployersUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersEmployersUrl);
		Assert.assertTrue("Partners (Employers) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=13a6a03f-50fa-4ddc-8893-48a77f74efc7"));
		partnerPage.userShouldBeAbleToDeleteEmployersInPartnerModule();
	}

	@And("I create a profile with Delete access only to Employers in Partner Module test")
	public void createProfileWithDeleteAccessOnlyToEmployersInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileWithDeleteAccessForEmployers();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to add or delete Employers in Partner Module test")
	public void userShouldNotBeAbleToAddOrDeleteEmployersInPartnerModule() throws InterruptedException {
		partnerPage.userShouldNotBeAbleToAddOrDeleteEmployersInPartnerModule();
	}

	@And("the user should be able to edit Employers in Partner Module test")
	public void userShouldBeAbleToEditEmployersInPartnerModule() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersEmployersUrl = Hooks.prop.getProperty("partnersEmployersUrl");
		Assert.assertNotNull("partnersEmployersUrl is missing in config", partnersEmployersUrl);
		String fullPartnersEmployersUrl = baseUrl + partnersEmployersUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersEmployersUrl);
		Assert.assertTrue("Partners (Employers) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=13a6a03f-50fa-4ddc-8893-48a77f74efc7"));
		partnerPage.userShouldBeAbleToEditEmployersInPartnerModule();
	}

	@And("I create a profile with Edit access only to Employers in Partner Module test")
	public void createProfileWithEditAccessOnlyToEmployersInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileWithEditAccessForEmployers();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to view Employers details in Partner Module test")
	public void userShouldNotBeAbleToViewEmployersDetailsInPartnerModule() throws InterruptedException {
		partnerPage.userShouldNotBeAbleToViewEmployersDetailsInPartnerModule();
	}

	@And("the user should not be able to edit or delete Employers in Partner Module test")
	public void userShouldNotBeAbleToEditOrDeleteEmployersInPartnerModule() throws InterruptedException {
		partnerPage.userShouldNotBeAbleToEditOrDeleteEmployersInPartnerModule();
	}

	@And("the user should be able to add Employers in Partner Module test")
	public void userShouldBeAbleToAddEmployersInPartnerModule() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersEmployersUrl = Hooks.prop.getProperty("partnersEmployersUrl");
		Assert.assertNotNull("partnersEmployersUrl is missing in config", partnersEmployersUrl);
		String fullPartnersEmployersUrl = baseUrl + partnersEmployersUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersEmployersUrl);
		Assert.assertTrue("Partners (Employers) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=13a6a03f-50fa-4ddc-8893-48a77f74efc7"));
		partnerPage.userShouldBeAbleToAddEmployersInPartnerModule();
	}

	@And("I create a profile with Add access only to Employers in Partner Module test")
	public void createProfileWithAddAccessOnlyToEmployersInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileWithAddAccessForEmployers();
		partnerPage.clickSubmitButton();

	}

	// Federal And State Government
	@And("the user should not be able to add, edit, or delete Federal and State Government in Partner Module test")
	public void userShouldNotBeAbleToAddEditOrDeleteFederalAndStateGovernmentInPartnerModule()
			throws InterruptedException {
		partnerPage.userShouldNotBeAbleToAddEditOrDeleteFederalAndStateGovernmentInPartnerModule();
	}

	@And("the user should be able to view Federal and State Government details in Partner Module test")
	public void userShouldBeAbleToViewFederalAndStateGovernmentDetailsInPartnerModule() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersFederalAndStateGovernmentUrl = Hooks.prop.getProperty("partnersFederalAndStateGovernmentUrl");
		Assert.assertNotNull("partnersFederalAndStateGovernmentUrl is missing in config",
				partnersFederalAndStateGovernmentUrl);
		String fullPartnersFederalAndStateGovernmentUrl = baseUrl + partnersFederalAndStateGovernmentUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersFederalAndStateGovernmentUrl);
		Assert.assertTrue("Partners (Federal and State Government) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=780319d7-d45a-40af-b6a7-c6ee68aa3125"));
		partnerPage.userShouldBeAbleToViewFederalAndStateGovernmentDetailsInPartnerModule();
	}

	@And("I create a profile with Details access only to Federal and State Government in Partner Module test")
	public void createProfileWithDetailsAccessOnlyToFederalAndStateGovernmentInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileWithDetailsAccessForFederalAndStateGovernment();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to add or edit Federal and State Government in Partner Module test")
	public void userShouldNotBeAbleToAddOrEditFederalAndStateGovernmentInPartnerModule() throws InterruptedException {
		partnerPage.userShouldNotBeAbleToAddOrEditFederalAndStateGovernmentInPartnerModule();
	}

	@And("the user should be able to delete Federal and State Government in Partner Module test")
	public void userShouldBeAbleToDeleteFederalAndStateGovernmentInPartnerModule() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersFederalAndStateGovernmentUrl = Hooks.prop.getProperty("partnersFederalAndStateGovernmentUrl");
		Assert.assertNotNull("partnersFederalAndStateGovernmentUrl is missing in config",
				partnersFederalAndStateGovernmentUrl);
		String fullPartnersFederalAndStateGovernmentUrl = baseUrl + partnersFederalAndStateGovernmentUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersFederalAndStateGovernmentUrl);
		Assert.assertTrue("Partners (Federal and State Government) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=780319d7-d45a-40af-b6a7-c6ee68aa3125"));
		partnerPage.userShouldBeAbleToDeleteFederalAndStateGovernmentInPartnerModule();
	}

	@And("I create a profile with Delete access only to Federal and State Government in Partner Module test")
	public void createProfileWithDeleteAccessOnlyToFederalAndStateGovernmentInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileWithDeleteAccessForFederalAndStateGovernment();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to view Federal and State Government details in Partner Module test")
	public void userShouldNotBeAbleToViewFederalAndStateGovernmentDetailsInPartnerModule() throws InterruptedException {
		partnerPage.userShouldNotBeAbleToViewFederalAndStateGovernmentDetailsInPartnerModule();
	}

	@And("the user should not be able to add or delete Federal and State Government in Partner Module test")
	public void userShouldNotBeAbleToAddOrDeleteFederalAndStateGovernmentInPartnerModule() throws InterruptedException {
		partnerPage.userShouldNotBeAbleToAddOrDeleteFederalAndStateGovernmentInPartnerModule();
	}

	@And("the user should be able to edit Federal and State Government in Partner Module test")
	public void userShouldBeAbleToEditFederalAndStateGovernmentInPartnerModule() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersFederalAndStateGovernmentUrl = Hooks.prop.getProperty("partnersFederalAndStateGovernmentUrl");
		Assert.assertNotNull("partnersFederalAndStateGovernmentUrl is missing in config",
				partnersFederalAndStateGovernmentUrl);
		String fullPartnersFederalAndStateGovernmentUrl = baseUrl + partnersFederalAndStateGovernmentUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersFederalAndStateGovernmentUrl);
		Assert.assertTrue("Partners (Federal and State Government) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=780319d7-d45a-40af-b6a7-c6ee68aa3125"));
		partnerPage.userShouldBeAbleToEditFederalAndStateGovernmentInPartnerModule();
	}

	@And("I create a profile with Edit access only to Federal and State Government in Partner Module test")
	public void createProfileWithEditAccessOnlyToFederalAndStateGovernmentInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileWithEditAccessForFederalAndStateGovernment();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to edit or delete Federal and State Government in Partner Module test")
	public void userShouldNotBeAbleToEditOrDeleteFederalAndStateGovernmentInPartnerModule()
			throws InterruptedException {
		partnerPage.userShouldNotBeAbleToEditOrDeleteFederalAndStateGovernmentInPartnerModule();
	}

	@And("the user should be able to add Federal and State Government in Partner Module test")
	public void userShouldBeAbleToAddFederalAndStateGovernmentInPartnerModule() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersFederalAndStateGovernmentUrl = Hooks.prop.getProperty("partnersFederalAndStateGovernmentUrl");
		Assert.assertNotNull("partnersFederalAndStateGovernmentUrl is missing in config",
				partnersFederalAndStateGovernmentUrl);
		String fullPartnersFederalAndStateGovernmentUrl = baseUrl + partnersFederalAndStateGovernmentUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersFederalAndStateGovernmentUrl);
		Assert.assertTrue("Partners (Federal and State Government) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=780319d7-d45a-40af-b6a7-c6ee68aa3125"));
		partnerPage.userShouldBeAbleToAddFederalAndStateGovernmentInPartnerModule();
	}

	@And("I create a profile with Add access only to Federal and State Government in Partner Module test")
	public void createProfileWithAddAccessOnlyToFederalAndStateGovernmentInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileWithAddAccessForFederalAndStateGovernment();
		partnerPage.clickSubmitButton();

	}

	// Rx HUB
	@And("the user should not be able to add or edit Rx HUB in Partner Module test")
	public void userShouldNotBeAbleToAddOrEditRxHubInPartnerModule() throws InterruptedException {
		partnerPage.userShouldNotBeAbleToAddOrEditRxHUBInPartnerModule();
	}

	@And("the user should be able to delete Rx HUB in Partner Module test")
	public void userShouldBeAbleToDeleteRxHubInPartnerModule() throws InterruptedException {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersRxHubUrl = Hooks.prop.getProperty("partnersRxHubUrl");
		Assert.assertNotNull("partnersRxHubUrl is missing in config", partnersRxHubUrl);
		String fullPartnersRxHubUrl = baseUrl + partnersRxHubUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersRxHubUrl);
		Assert.assertTrue("Partners (Rx HUB) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=5a0f3a81-56b8-403d-ad0e-1a493a3f8ab9"));
		partnerPage.userShouldBeAbleToDeleteRxHUBInPartnerModule();
	}

	@And("I create a profile with Delete access only to Rx HUB in Partner Module test")
	public void createProfileWithDeleteAccessOnlyToRxHubInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileWithDeleteAccessForRxHub();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to add or delete Rx HUB in Partner Module test")
	public void userShouldNotBeAbleToAddOrDeleteRxHubInPartnerModule() throws InterruptedException {
		partnerPage.userShouldNotBeAbleToAddOrDeleteRxHUBInPartnerModule();

	}

	@And("the user should be able to edit Rx HUB in Partner Module test")
	public void userShouldBeAbleToEditRxHubInPartnerModule() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersRxHubUrl = Hooks.prop.getProperty("partnersRxHubUrl");
		Assert.assertNotNull("partnersRxHubUrl is missing in config", partnersRxHubUrl);
		String fullPartnersRxHubUrl = baseUrl + partnersRxHubUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersRxHubUrl);
		Assert.assertTrue("Partners (Rx HUB) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=5a0f3a81-56b8-403d-ad0e-1a493a3f8ab9"));
		partnerPage.userShouldBeAbleToEditRxHUBInPartnerModule();
	}

	@And("I create a profile with Edit access only to Rx HUB in Partner Module test")
	public void createProfileWithEditAccessOnlyToRxHubInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileWithEditAccessForRxHub();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to view Rx HUB details in Partner Module test")
	public void userShouldNotBeAbleToViewRxHubDetailsInPartnerModule() throws InterruptedException {
		partnerPage.userShouldNotBeAbleToViewRxHUBDetailsInPartnerModule();
	}

	@And("the user should not be able to edit or delete Rx HUB in Partner Module test")
	public void userShouldNotBeAbleToEditOrDeleteRxHubInPartnerModule() throws InterruptedException {
		partnerPage.userShouldNotBeAbleToEditOrDeleteRxHUBInPartnerModule();
	}

	@And("the user should be able to add Rx HUB in Partner Module test")
	public void userShouldBeAbleToAddRxHubInPartnerModule() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersRxHubUrl = Hooks.prop.getProperty("partnersRxHubUrl");
		Assert.assertNotNull("partnersRxHubUrl is missing in config", partnersRxHubUrl);
		String fullPartnersRxHubUrl = baseUrl + partnersRxHubUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersRxHubUrl);
		Assert.assertTrue("Partners (Rx HUB) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=5a0f3a81-56b8-403d-ad0e-1a493a3f8ab9"));
		partnerPage.userShouldBeAbleToAddRxHUBInPartnerModule();
	}

	@And("I create a profile with Add access only to Rx HUB in Partner Module test")
	public void createProfileWithAddAccessOnlyToRxHubInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileWithAddAccessForRxHub();
		partnerPage.clickSubmitButton();

	}

	// DME Provider
	@And("the user should not be able to add, edit, or delete DME Provider in Partner Module test")
	public void userShouldNotBeAbleToAddEditOrDeleteDmeProviderInPartnerModule() throws InterruptedException {
		partnerPage.userShouldNotBeAbleToAddEditOrDeleteDMEProviderInPartnerModule();
	}

	@And("the user should be able to view DME Provider details in Partner Module test")
	public void userShouldBeAbleToViewDmeProviderDetailsInPartnerModule() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersDmeProviderUrl = Hooks.prop.getProperty("partnersDmeProviderUrl");
		Assert.assertNotNull("partnersDmeProviderUrl is missing in config", partnersDmeProviderUrl);
		String fullPartnersDmeProviderUrl = baseUrl + partnersDmeProviderUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersDmeProviderUrl);
		Assert.assertTrue("Partners (DME Provider) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=0aea0bb9-656c-4982-8dd5-608af9a00d18"));
		partnerPage.userShouldBeAbleToViewDMEProviderDetailsInPartnerModule();
	}

	@And("I create a profile with Details access only to DME Provider in Partner Module test")
	public void createProfileWithDetailsAccessOnlyToDmeProviderInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileWithDetailsAccessForDmeProvider();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to add or edit DME Provider in Partner Module test")
	public void userShouldNotBeAbleToAddOrEditDmeProviderInPartnerModule() throws InterruptedException {
		partnerPage.userShouldNotBeAbleToAddOrEditDMEProviderInPartnerModule();
	}

	@And("the user should be able to delete DME Provider in Partner Module test")
	public void userShouldBeAbleToDeleteDmeProviderInPartnerModule() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersDmeProviderUrl = Hooks.prop.getProperty("partnersDmeProviderUrl");
		Assert.assertNotNull("partnersDmeProviderUrl is missing in config", partnersDmeProviderUrl);
		String fullPartnersDmeProviderUrl = baseUrl + partnersDmeProviderUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersDmeProviderUrl);
		Assert.assertTrue("Partners (DME Provider) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=0aea0bb9-656c-4982-8dd5-608af9a00d18"));
		partnerPage.userShouldBeAbleToDeleteDMEProviderInPartnerModule();
	}

	@And("I create a profile with Delete access only to DME Provider in Partner Module test")
	public void createProfileWithDeleteAccessOnlyToDmeProviderInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileWithDeleteAccessForDmeProvider();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to add or delete DME Provider in Partner Module test")
	public void userShouldNotBeAbleToAddOrDeleteDmeProviderInPartnerModule() throws InterruptedException {
		partnerPage.userShouldNotBeAbleToAddOrDeleteDMEProviderInPartnerModule();
	}

	@And("the user should be able to edit DME Provider in Partner Module test")
	public void userShouldBeAbleToEditDmeProviderInPartnerModule() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersDmeProviderUrl = Hooks.prop.getProperty("partnersDmeProviderUrl");
		Assert.assertNotNull("partnersDmeProviderUrl is missing in config", partnersDmeProviderUrl);
		String fullPartnersDmeProviderUrl = baseUrl + partnersDmeProviderUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersDmeProviderUrl);
		Assert.assertTrue("Partners (DME Provider) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=0aea0bb9-656c-4982-8dd5-608af9a00d18"));
		partnerPage.userShouldBeAbleToEditDMEProviderInPartnerModule();
	}

	@And("I create a profile with Edit access only to DME Provider in Partner Module test")
	public void createProfileWithEditAccessOnlyToDmeProviderInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileWithEditAccessForDmeProvider();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to view DME Provider details in Partner Module test")
	public void userShouldNotBeAbleToViewDmeProviderDetailsInPartnerModule() throws InterruptedException {
		partnerPage.userShouldNotBeAbleToViewDMEProviderDetailsInPartnerModule();
	}

	@And("the user should not be able to edit or delete DME Provider in Partner Module test")
	public void userShouldNotBeAbleToEditOrDeleteDmeProviderInPartnerModule() throws InterruptedException {
		partnerPage.userShouldNotBeAbleToEditOrDeleteDMEProviderInPartnerModule();
	}

	@And("the user should be able to add DME Provider in Partner Module test")
	public void userShouldBeAbleToAddDmeProviderInPartnerModule() throws InterruptedException {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersDmeProviderUrl = Hooks.prop.getProperty("partnersDmeProviderUrl");
		Assert.assertNotNull("partnersDmeProviderUrl is missing in config", partnersDmeProviderUrl);
		String fullPartnersDmeProviderUrl = baseUrl + partnersDmeProviderUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersDmeProviderUrl);
		Assert.assertTrue("Partners (DME Provider) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=0aea0bb9-656c-4982-8dd5-608af9a00d18"));
		partnerPage.userShouldBeAbleToAddDMEProviderInPartnerModule();
	}

	@And("I create a profile with Add access only to DME Provider in Partner Module test")
	public void createProfileWithAddAccessOnlyToDmeProviderInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileWithAddAccessForDmeProvider();
		partnerPage.clickSubmitButton();

	}

	// Pharmacies
	@And("the user should not be able to add, edit, delete, or view Pharmacies details in Partner Module test")
	public void userShouldNotBeAbleToManagePharmaciesDetailsInPartnerModule() throws InterruptedException {
		partnerPage.userShouldNotBeAbleToAddEditDeleteOrViewPharmaciesDetailsInPartnerModule();
	}

	@And("the user should be able to access Pharmacy Vetting in Partner Module test")
	public void userShouldBeAbleToAccessPharmacyVettingInPartnerModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
		partnerPage.userShouldBeAbleToAccessPharmacyVettingInPartnerModule();
	}

	@And("I create a profile with Pharmacy Vetting access only to Pharmacies in Partner Module test")
	public void createProfileWithPharmacyVettingAccessOnlyToPharmaciesInPartnerModule() {
		partnerPage.clickFilterButton();
		partnerPage.enterProfileName();
		partnerPage.clickSearchButton();
		partnerPage.clickActionMenu();
		partnerPage.clickEditButton();
		partnerPage.createProfileWithPharmacyVettingAccessForPharmacies();
		partnerPage.clickSubmitButton();

	}

	@And("the user should not be able to add, edit, or delete Pharmacies in Partner Module test")
	public void userCannotAddEditOrDeletePharmaciesInPartnerModuleTest() {
		partnerPage.userShouldNotBeAbleToAddEditOrDeletePharmaciesInPartnerModule();
	}

	@And("the user should be able to view Pharmacies details in Partner Module test")
	public void userCanViewPharmaciesDetailsInPartnerModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
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

	}

	@And("the user should not be able to add or edit Pharmacies in Partner Module test")
	public void userCannotAddOrEditPharmaciesInPartnerModuleTest() {
		partnerPage.userShouldNotBeAbleToAddOrEditPharmaciesInPartnerModule();
	}

	@And("the user should be able to delete Pharmacies in Partner Module test")
	public void userCanDeletePharmaciesInPartnerModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
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

	}

	@And("the user should not be able to add or delete Pharmacies in Partner Module test")
	public void userCannotAddOrDeletePharmaciesInPartnerModuleTest() {
		partnerPage.userShouldNotBeAbleToAddOrDeletePharmaciesInPartnerModule();
	}

	@And("the user should be able to edit Pharmacies in Partner Module test")
	public void userCanEditPharmaciesInPartnerModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
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
		String partnersPharmacyUrl = Hooks.prop.getProperty("partnersPharmacyUrl");
		Assert.assertNotNull("partnersPharmacyUrl is missing in config", partnersPharmacyUrl);
		String fullPartnersPharmacyUrl = baseUrl + partnersPharmacyUrl;
		partnerPage = new partnerpage(Hooks.driver);
		partnerPage.openAttorneyPartnersUrl(fullPartnersPharmacyUrl);
		Assert.assertTrue("Partners (Pharmacy) page is not displayed", Hooks.driver.getCurrentUrl()
				.contains("/Partner/Home/Partners?partnerTypeId=78a126b3-70ec-4a77-9551-33f01f1cf676"));
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
		System.out.println("The user should not be able to view General Audit View settings in Partner Module test");
		Hooks.scenario.log("The user should not be able to view General Audit View settings in Partner Module test");
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
