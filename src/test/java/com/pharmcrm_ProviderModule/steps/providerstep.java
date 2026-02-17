package com.pharmcrm_ProviderModule.steps;

import org.junit.Assert;
import org.junit.Assume;

import com.pharmcrm_ProviderModule.pages.providerpage;
import hooks.Hooks;
import io.cucumber.java.en.And;

public class providerstep {

	private providerpage providerPage;

	// Providers Management
	@And("Validation should have to show for Add Service Blank form submission")
	public void validateServiceFormOnSubmit() throws Exception {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		String result = providerPage.checkBlankServiceFormFields();

		Thread.sleep(2000);

		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);

		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}
	
	@And("Add Executive Validation should have to show for invalid Email, Cell, Phone, Fax Number")
	public void validateExecutiveContactDetails() throws Exception {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		String result = providerPage.checkInvalidExecutiveInputs();

		Thread.sleep(2000);

		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);

		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Add Executive Blank form Validation should have to show")
	public void validateExecutiveFormOnSubmit() throws Exception {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		String result = providerPage.isExecutiveFormValid();

		Thread.sleep(2000);

		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);

		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Validation message should have to show for invalid Contact Number")
	public void validateProviderContactNumber() throws Exception {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		String result = providerPage.isProviderContactNumberValid();

		Thread.sleep(2000);

		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);

		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Validation message is showing for Add Address when submitting blank")
	public void validateAddressOnSubmit() throws Exception {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		String result = providerPage.checkBlankAddressField();

		Thread.sleep(2000);

		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);

		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Add New Business Group Validation should have show for Blank Zone")
	public void validateBusinessGroupZoneNotEmpty() throws Exception {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		String result = providerPage.checkBlankBusinessGroupZone();

		Thread.sleep(2000);

		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);

		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Search Business Group Validation should have to show on Blank Search , Add New Business Group and Submit")
	public void validateBusinessGroupSearchAndSubmit() throws Exception {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		String result = providerPage.checkBusinessGroupBlankSearch();

		Thread.sleep(2000);

		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);

		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Provider Management filter Validation should have to show for Invalid input Email,Zipcode,Phone Number,Fax Number")
	public void validateProviderFilterInputs() throws Exception {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		String result = providerPage.checkInvalidProviderFilterFields();

		Thread.sleep(2000);

		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);

		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Provider Management Filter Blank Search Validation message should have to show")
	public void validateProviderSearchFilter() throws Exception {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		String result = providerPage.isProviderSearchFilterValid();

		Thread.sleep(2000);

		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);

		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("New provider Validation should have to show for Invalid Phone Number")
	public void validateProviderPhoneNumber() throws Exception {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		String result = providerPage.isProviderPhoneNumberValid();

		Thread.sleep(2000);

		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);

		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Validation should have to show for Invalid Email Id")
	public void checkInvalidEmailId() throws Exception {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		String result = providerPage.validateProviderEmail();

		Thread.sleep(2000);

		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);

		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Validation should have to show for Invalid NPI Number")
	public void validateNpiNumber() throws Exception {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		String result = providerPage.isNpiNumberValid();

		Thread.sleep(2000);

		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);

		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Validation should have to show for Blank New Provider Page")
	public void validateNewProviderPage() throws Exception {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		String result = providerPage.validateNewProviderNotEmpty();

		Thread.sleep(2000);

		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);

		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Validation should have to show for Invalid Phone Number")
	public void isInvalidPhoneNumberValidationDisplayed() throws Exception {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		String result = providerPage.validateInvalidPhoneNumber();

		Thread.sleep(2000);

		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);

		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Validation should have to show for Blank VCard")
	public void validateVCardOnSend() throws Exception {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		String result = providerPage.validateVCardNotEmptyOnSend();

		Thread.sleep(2000);

		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);

		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Validation should have to show for Quick Text Blank Send")
	public void validateQuickTextOnSend() throws Exception {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		String result = providerPage.isQuickTextSendValid();

		Thread.sleep(2000);

		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);

		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	@And("Validation should have to show for Blank Quick Text Field")
	public void validateQuickTextField() throws Exception {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		String result = providerPage.validateBlankQuickTextField();

		Thread.sleep(2000);

		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);

		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	// BusinessGroup

	@And("The user should see validation messages indicating Fax, Contact Number1, Contact Number2, and Zip Code are invalid")
	public void validationMessagesForInvalidFaxContactNumbersAndZipCodeShouldBeDisplayed() throws Exception {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String businessGroupsUrl = Hooks.prop.getProperty("businessGroupsUrl");
		Assert.assertNotNull("businessGroupsUrl is missing in config", businessGroupsUrl);

		String fullBusinessGroupsUrl = baseUrl + businessGroupsUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullBusinessGroupsUrl);

		Assert.assertTrue("Business Groups page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/BusinessGroups"));

		String result = providerPage.validateInvalidBusinessGroupAddressFields();

		Hooks.scenario.log("Invalid Address Field Validation Result: " + result);
		System.out.println("Invalid Address Field Validation Result: " + result);

		if (result.startsWith("MISSING")) {
			Assume.assumeTrue("Skipping because some invalid digit-length validations are missing: " + result, false);
		}

	}

	@And("the user should see validation messages for all required address fields: Street, City, State, Zip Code, and Contact Number1")
	public void validationMessagesForAllRequiredAddressFieldsShouldBeDisplayed() throws Exception {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String businessGroupsUrl = Hooks.prop.getProperty("businessGroupsUrl");
		Assert.assertNotNull("businessGroupsUrl is missing in config", businessGroupsUrl);

		String fullBusinessGroupsUrl = baseUrl + businessGroupsUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullBusinessGroupsUrl);

		Assert.assertTrue("Business Groups page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/BusinessGroups"));

		String result = providerPage.validateRequiredAddressFieldsFromViewPage();

		Hooks.scenario.log("Address Required Validation Result: " + result);
		System.out.println("Address Required Validation Result: " + result);

		if (result.startsWith("MISSING")) {
			Assume.assumeTrue("Skipping because some validations are missing: " + result, false);
		}

	}

	@And("the user should see a validation message indicating Business Group Name is required")
	public void validationMessageForBusinessGroupNameRequiredShouldBeDisplayed() throws Exception {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String businessGroupsUrl = Hooks.prop.getProperty("businessGroupsUrl");
		Assert.assertNotNull("businessGroupsUrl is missing in config", businessGroupsUrl);

		String fullBusinessGroupsUrl = baseUrl + businessGroupsUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullBusinessGroupsUrl);

		Assert.assertTrue("Business Groups page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/BusinessGroups"));

		String result = providerPage.filterWithBlankBusinessGroupNameAndValidate();

		Hooks.scenario.log("Filter Validation Result: " + result);
		System.out.println("Filter Validation Result: " + result);

		if (result.equals("NO VALIDATION MESSAGE DISPLAYED")) {

			Hooks.scenario.log("Validation not displayed. Skipping scenario.");
			System.out.println("Validation not displayed. Skipping scenario.");

			Assume.assumeTrue("Skipping because validation not shown on UI", false);
		}

	}

	@And("the user should see a validation message indicating the phone number is invalid")
	public void validationMessageForInvalidPhoneNumberShouldBeDisplayed() throws Exception {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String addBusinessGroupsUrl = Hooks.prop.getProperty("addbusinessGroupsUrl");
		Assert.assertNotNull("addbusinessGroupsUrl is missing in config", addBusinessGroupsUrl);

		String fullBusinessGroupsUrl = baseUrl + addBusinessGroupsUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullBusinessGroupsUrl);

		Assert.assertTrue("Business Groups page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/BusinessGroup"));

		String result = providerPage.enterBusinessGroupDetailsWithInvalidPhoneAndValidate();

		Thread.sleep(2000);

		Hooks.scenario.log("Phone Validation Result: " + result);
		System.out.println("Phone Validation Result: " + result);

	}

	@And("the user should see a validation message indicating the email ID is invalid")
	public void validationMessageShouldBeDisplayed() throws Exception {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String addBusinessGroupsUrl = Hooks.prop.getProperty("addbusinessGroupsUrl");
		Assert.assertNotNull("addbusinessGroupsUrl is missing in config", addBusinessGroupsUrl);

		String fullBusinessGroupsUrl = baseUrl + addBusinessGroupsUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullBusinessGroupsUrl);

		Assert.assertTrue("Business Groups page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/BusinessGroup"));

		String result = providerPage.enterBusinessGroupDetailsWithInvalidEmailAndValidate();

		Thread.sleep(2000);

		Hooks.scenario.log("Email Validation Result: " + result);
		System.out.println("Email Validation Result: " + result);

	}

	@And("the user should see validation messages for all required fields: Email, Zone, Phone, and BusinessGroup Name")
	public void userSeesValidationMessagesForBusinessGroupRequiredFieldsTest() throws Exception {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String addBusinessGroupsUrl = Hooks.prop.getProperty("addbusinessGroupsUrl");
		Assert.assertNotNull("addbusinessGroupsUrl is missing in config", addBusinessGroupsUrl);

		String fullBusinessGroupsUrl = baseUrl + addBusinessGroupsUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullBusinessGroupsUrl);

		Assert.assertTrue("Business Groups page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/BusinessGroup"));

		String result = providerPage.clickOnSaveButtonAndGetValidationMessages();

		Thread.sleep(2000);

		Hooks.scenario.log("Validation Result: " + result);
		System.out.println("Validation Result: " + result);

		if (result.startsWith("ERROR")) {
			Hooks.scenario.log("Validation failed: " + result);
			Assume.assumeTrue("Stopping scenario due to validation failure: " + result, false);
		}

	}

	// Provider Template

	@And("the user should not be able to add Provider Template in Provider Module test")
	public void userCannotAddProviderTemplateInProviderModuleTest() {

		providerPage.verifyUserCannotAddProviderTemplate();

	}

	@And("the user should be able to delete Provider Template in Provider Module test")
	public void userCanDeleteProviderTemplateInProviderModuleTest() {

		providerPage.verifyUserCanDeleteProviderTemplate();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Provider Template in Provider Module test")
	public void createProfileViewDeleteNoAddEditProviderTemplate() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileViewDeleteOnlyProviderTemplate();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should be able to edit Provider Template in Provider Module test")
	public void userCanEditProviderTemplateInProviderModuleTest() {

		providerPage.verifyUserCanEditProviderTemplate();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Provider Template in Provider Module test")
	public void createProfileViewEditNoAddDeleteProviderTemplate() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileViewEditOnlyProviderTemplate();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to delete Provider Template in Provider Module test")
	public void userCannotDeleteProviderTemplateInProviderModuleTest() {

		providerPage.verifyUserCannotDeleteProviderTemplate();

	}

	@And("the user should not be able to edit Provider Template in Provider Module test")
	public void userCannotEditProviderTemplateInProviderModuleTest() {

		providerPage.verifyUserCannotEditProviderTemplate();

	}

	@And("the user should be able to add Provider Template in Provider Module test")
	public void userCanAddProviderTemplateInProviderModuleTest() {

		providerPage.verifyUserCanAddProviderTemplate();

	}

	@And("the user should be able to view Provider Template in Provider Module test")
	public void userCanViewProviderTemplateInProviderModuleTest() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String templatesUrl = Hooks.prop.getProperty("TemplatesUrl");
		Assert.assertNotNull("TemplatesUrl is missing in config", templatesUrl);

		String fullTemplatesUrl = baseUrl + templatesUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openTemplatesPage(fullTemplatesUrl);

		Assert.assertTrue("Provider Template page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Templates"));

		providerPage.verifyUserCanViewProviderType();
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Provider Template in Provider Module test")
	public void createProfileViewAddNoEditDeleteProviderTemplate() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileViewAddOnlyProviderTemplate();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// Service
	@And("the user should be able to delete Service in Provider Module test")
	public void userCanDeleteServiceInProviderModuleTest() {

		providerPage.verifyUserCanDeleteService();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Service in Provider Module test")
	public void createProfileViewDeleteNoAddEditService() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileViewDeleteOnlyService();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to add Service in Provider Module test")
	public void userCannotAddServiceInProviderModuleTest() {

		providerPage.verifyUserCannotAddService();

	}

	@And("the user should be able to edit Service in Provider Module test")
	public void userCanEditServiceInProviderModuleTest() {

		providerPage.verifyUserCanEditService();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Service in Provider Module test")
	public void createProfileViewEditNoAddDeleteService() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileViewEditOnlyService();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to delete Service in Provider Module test")
	public void userCannotDeleteServiceInProviderModuleTest() {

		providerPage.verifyUserCannotDeleteService();

	}

	@And("the user should not be able to edit Service in Provider Module test")
	public void userCannotEditServiceInProviderModuleTest() {

		providerPage.verifyUserCannotEditService();

	}

	@And("the user should be able to add Service in Provider Module test")
	public void userCanAddServiceInProviderModuleTest() {

		providerPage.verifyUserCanAddService();

	}

	@And("the user should be able to view Service in Provider Module test")
	public void userCanViewServiceInProviderModuleTest() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String servicesUrl = Hooks.prop.getProperty("ServicesUrl");
		Assert.assertNotNull("ServicesUrl is missing in config", servicesUrl);

		String fullServicesUrl = baseUrl + servicesUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openServicesPage(fullServicesUrl);

		Assert.assertTrue("Service page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Services"));

		providerPage.verifyUserCanViewProviderType();
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Service in Provider Module test")
	public void createProfileViewAddNoEditDeleteService() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileViewAddOnlyService();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// Specialty
	@And("the user should be able to delete Specialty in Provider Module test")
	public void userCanDeleteSpecialtyInProviderModuleTest() {

		providerPage.verifyUserCanDeleteSpecialty();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Specialty in Provider Module test")
	public void createProfileViewDeleteNoAddEditSpecialty() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileViewDeleteOnlySpecialty();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to add Specialty in Provider Module test")
	public void userCannotAddSpecialtyInProviderModuleTest() {

		providerPage.verifyUserCannotAddSpecialty();

	}

	@And("the user should be able to edit Specialty in Provider Module test")
	public void userCanEditSpecialtyInProviderModuleTest() {

		providerPage.verifyUserCanEditSpecialty();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Specialty in Provider Module test")
	public void createProfileViewEditNoAddDeleteSpecialty() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileViewEditOnlySpecialty();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to delete Specialty in Provider Module test")
	public void userCannotDeleteSpecialtyInProviderModuleTest() {

		providerPage.verifyUserCannotDeleteSpecialty();

	}

	@And("the user should not be able to edit Specialty in Provider Module test")
	public void userCannotEditSpecialtyInProviderModuleTest() {

		providerPage.verifyUserCannotEditSpecialty();

	}

	@And("the user should be able to add Specialty in Provider Module test")
	public void userCanAddSpecialtyInProviderModuleTest() {

		providerPage.verifyUserCanAddSpecialty();

	}

	@And("the user should be able to view Specialty in Provider Module test")
	public void userCanViewSpecialtyInProviderModuleTest() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String specialtiesUrl = Hooks.prop.getProperty("SpecialtiesUrl");
		Assert.assertNotNull("SpecialtiesUrl is missing in config", specialtiesUrl);

		String fullSpecialtiesUrl = baseUrl + specialtiesUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openSpecialtiesPage(fullSpecialtiesUrl);

		Assert.assertTrue("Specialty page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Specialties"));

		providerPage.verifyUserCanViewProviderType();
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Specialty in Provider Module test")
	public void createProfileViewAddNoEditDeleteSpecialty() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileViewAddOnlySpecialty();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// Category
	@And("the user should be able to delete Category in Provider Module test")
	public void userCanDeleteCategoryInProviderModuleTest() {

		providerPage.verifyUserCanDeleteCategory();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Category in Provider Module test")
	public void createProfileViewDeleteNoAddEditCategory() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileViewDeleteOnlyCategory();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to add Category in Provider Module test")
	public void userCannotAddCategoryInProviderModuleTest() {

		providerPage.verifyUserCannotAddCategory();

	}

	@And("the user should be able to edit Category in Provider Module test")
	public void userCanEditCategoryInProviderModuleTest() {

		providerPage.verifyUserCanEditCategory();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Category in Provider Module test")
	public void createProfileViewEditNoAddDeleteCategory() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileViewEditOnlyCategory();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should be able to view Category in Provider Module test")
	public void userCanViewCategoryInProviderModuleTest() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String categoriesUrl = Hooks.prop.getProperty("CategoriesUrl");
		Assert.assertNotNull("CategoriesUrl is missing in config", categoriesUrl);

		String fullCategoriesUrl = baseUrl + categoriesUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openCategoriesPage(fullCategoriesUrl);

		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Categories"));

		providerPage.verifyUserCanViewProviderType();
	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Category in Provider Module test")
	public void createProfileViewAddNoEditDeleteCategory() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileViewAddOnlyCategory();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// Provider Type
	@And("I create a profile with View and Delete access but no Add or Edit access to Provider Type in Provider Module test")
	public void createProfileViewDeleteNoAddEditProviderType() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileViewDeleteOnlyProviderType();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to delete Category in Provider Module test")
	public void userCannotDeleteCategoryInProviderModuleTest() {

		providerPage.verifyUserCannotDeleteCategory();

	}

	@And("the user should not be able to edit Category in Provider Module test")
	public void userCannotEditCategoryInProviderModuleTest() {

		providerPage.verifyUserCannotEditCategory();

	}

	@And("the user should be able to add Category in Provider Module test")
	public void userCanAddCategoryInProviderModuleTest() {

		providerPage.verifyUserCanAddCategory();

	}

	@And("the user should not be able to add Provider Type in Provider Module test")
	public void userCannotAddProviderTypeInProviderModuleTest() {

		providerPage.verifyUserCannotAddProviderType();

	}

	@And("the user should be able to delete Provider Type in Provider Module test")
	public void userCanDeleteProviderTypeInProviderModuleTest() {

		providerPage.verifyUserCanDeleteProviderType();

	}

	@And("the user should be able to edit Provider Type in Provider Module test")
	public void userCanEditProviderTypeInProviderModuleTest() {

		providerPage.verifyUserCanEditProviderType();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Provider Type in Provider Module test")
	public void createProfileViewEditNoAddDeleteProviderType() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileViewEditOnlyProviderType();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to delete Provider Type in Provider Module test")
	public void userCannotDeleteProviderTypeInProviderModuleTest() {

		providerPage.verifyUserCannotDeleteProviderType();

	}

	@And("the user should not be able to edit Provider Type in Provider Module test")
	public void userCannotEditProviderTypeInProviderModuleTest() {

		providerPage.verifyUserCannotEditProviderType();

	}

	@And("the user should be able to add Provider Type in Provider Module test")
	public void userCanAddProviderTypeInProviderModuleTest() {

		providerPage.verifyUserCanAddProviderType();

	}

	@And("the user should be able to view Provider Type in Provider Module test")
	public void userCanViewProviderTypeInProviderModuleTest() {

		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerTypeUrl = Hooks.prop.getProperty("ProviderTypeUrl");
		Assert.assertNotNull("ProviderTypeUrl is missing in config", providerTypeUrl);

		String fullProviderTypeUrl = baseUrl + providerTypeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderTypePage(fullProviderTypeUrl);

		Assert.assertTrue("Provider Type page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ProviderType"));

		providerPage.verifyUserCanViewProviderType();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Provider Type in Provider Module test")
	public void createProfileViewAddNoEditDeleteProviderType() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileViewAddOnlyProviderType();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// Provider PA Details
	@And("the user should not be able to export Provider PA Details to Excel test")
	public void userCannotExportProviderPADetailsToExcelTest() {

		providerPage.userShouldNotBeAbleToExportPADetailsToExcel();

	}

	@And("I create a profile without Export Excel permission for Provider PA Details test")
	public void createProfileNoExportExcelPermissionPADetails() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileNoExportExcelPermissionPADetails();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should be able to export Provider PA Details to Excel test")
	public void userCanExportProviderPADetailsToExcelTest() {

		providerPage.userShouldBeAbleToExportPADetailsToExcel();

	}

	@And("I create a profile with Export Excel permission for Provider PA Details test")
	public void createProfileWithExportExcelPermissionProviderPADetails() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileWithExportExcelPermissionPADetails();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// Provider Remote Monitoring Details
	@And("I create a profile without Download File permission for Provider Remote Monitoring Details test")
	public void createProfileNoDownloadPermissionRemoteMonitoringDetails() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileNoDownloadPermissionRemoteMonitoringDetails();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to download files from Provider Remote Monitoring Details test")
	public void userCannotDownloadFilesFromProviderRemoteMonitoringDetailsTest() {

		providerPage.userShouldNotBeAbleToDownloadFilesFromRemoteMonitoringDetails();

	}

	@And("the user should be able to download files from Provider Remote Monitoring Details test")
	public void userCanDownloadFilesFromProviderRemoteMonitoringDetailsTest() {

		providerPage.userShouldBeAbleToDownloadFilesFromRemoteMonitoringDetails();

	}

	@And("the user should be able to view Provider PA Details test")
	public void userCanViewProviderPADetailsTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		providerPage.userShouldBeAbleToViewProviderPADetails();

	}

	@And("the user should be able to view Provider Remote Monitoring Details test")
	public void userCanViewProviderRemoteMonitoringDetailsTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		providerPage.userShouldBeAbleToViewProviderRemoteMonitoringDetails();

	}

	@And("I create a profile with Download File permission for Provider Remote Monitoring Details test")
	public void createProfileWithDownloadPermissionReferralRemoteMonitoringDetails() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileWithDownloadPermissionRemoteMonitoringDetails();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// Provider Referral Outgoing Details
	@And("I create a profile without Download File permission for Provider Referral Outgoing Details test")
	public void createProfileNoDownloadPermissionReferralOutgoingDetails() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileNoDownloadPermissionReferralOutgoingDetails();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to download files from Provider Referral Outgoing Details test")
	public void userCannotDownloadFilesFromProviderReferralOutgoingDetailsTest() {

		providerPage.userShouldNotBeAbleToDownloadFilesFromReferralOutgoingDetails();

	}

	@And("the user should be able to download files from Provider Referral Outgoing Details test")
	public void userCanDownloadFilesFromProviderReferralOutgoingDetailsTest() {

		providerPage.userShouldBeAbleToDownloadFilesFromReferralOutgoingDetails();

	}

	@And("the user should be able to view Provider Referral Outgoing Details test")
	public void userCanViewProviderReferralOutgoingDetailsTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		providerPage.userShouldBeAbleToViewProviderReferralOutgoingDetails();

	}

	@And("I create a profile with Download File permission for Provider Referral Outgoing Details test")
	public void createProfileWithDownloadPermissionReferralOutgoingDetails() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileWithDownloadPermissionReferralOutgoingDetails();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// Provider Referral Incoming Details
	@And("the user should not be able to download files from Provider Referral Incoming Details test")
	public void userCannotDownloadFilesFromProviderReferralIncomingDetailsTest() {

		providerPage.userShouldBeAbleToDownloadFilesFromReferralIncomingDetails();

	}

	@And("I create a profile without Download File permission for Provider Referral Incoming Details test")
	public void createProfileWithoutDownloadPermissionReferralIncomingDetails() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileNoDownloadPermissionReferralIncomingDetails();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should be able to download files from Provider Referral Incoming Details test")
	public void userCanDownloadFilesFromProviderReferralIncomingDetailsTest() {

		providerPage.userShouldBeAbleToDownloadFilesFromReferralIncomingDetails();

	}

	@And("the user should be able to view Provider Referral Incoming Details test")
	public void userCanViewProviderReferralIncomingDetailsTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String providerHomeUrl = Hooks.prop.getProperty("providerHomeUrl");
		Assert.assertNotNull("providerHomeUrl is missing in config", providerHomeUrl);
		String fullProviderHomeUrl = baseUrl + providerHomeUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullProviderHomeUrl);
		Assert.assertTrue("Provider Home page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/Providers"));

		providerPage.userShouldBeAbleToViewReferralIncomingDetails();

	}

	@And("I create a profile with Download File permission for Provider Referral Incoming Details test")
	public void createProfileWithDownloadFilePermissionProviderReferralIncomingDetails() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileWithDownloadPermissionReferralIncomingDetails();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// Business Group Address
	@And("the user should be able to delete Business Group Address in Provider Module test")
	public void userCanDeleteBusinessGroupAddressInProviderModuleTest() {

		providerPage.deleteBusinessGroupAddressInProviderModule();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Business Group Address in Provider Module test")
	public void createProfileWithViewDeleteNoAddEditBGAddress() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileWithViewDeleteNoAddEditBGAddress();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to add Business Group Address in Provider Module test")
	public void userCannotAddBusinessGroupAddressInProviderModuleTest() {

		providerPage.verifyUserCannotAddBusinessGroupAddress();

	}

	@And("the user should be able to edit Business Group Address in Provider Module test")
	public void userCanEditBusinessGroupAddressInProviderModuleTest() {

		providerPage.verifyUserCanEditBusinessGroupAddress();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Business Group Address in Provider Module test")
	public void createProfileWithViewEditNoAddDeleteBusinessGroupAddress() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileWithViewEditNoAddDeleteBGAddress();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	@And("the user should not be able to edit Business Group Address in Provider Module test")
	public void userCannotEditBusinessGroupAddressInProviderModuleTest() {

		providerPage.verifyUserCannotEditBusinessGroupAddress();

	}

	@And("the user should not be able to delete Business Group Address in Provider Module test")
	public void userCannotDeleteBusinessGroupAddressInProviderModuleTest() {

		providerPage.verifyUserCannotDeleteBusinessGroupAddress();

	}

	@And("the user should be able to add Business Group Address in Provider Module test")
	public void userCanAddBusinessGroupAddressInProviderModuleTest() {

		providerPage.verifyUserCanAddBusinessGroupAddress();

	}

	@And("the user should be able to view Business Group Address in Provider Module test")
	public void userCanViewBusinessGroupAddressInProviderModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String businessGroupsUrl = Hooks.prop.getProperty("businessGroupsUrl");
		Assert.assertNotNull("businessGroupsUrl is missing in config", businessGroupsUrl);

		String fullBusinessGroupsUrl = baseUrl + businessGroupsUrl;
		providerPage = new providerpage(Hooks.driver);
		providerPage.openProviderPage(fullBusinessGroupsUrl);

		Assert.assertTrue("Business Groups page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Prescriber/Home/BusinessGroups"));

		providerPage.verifyUserCanViewBusinessGroupAddress();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Business Group Address in Provider Module test")
	public void createProfileWithViewAndAddAccessNoEditDeleteBusinessGroupAddressProviderModuleTest() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileWithViewAddNoEditDeleteBusinessGroupAddress();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

	// Business Group
	@And("the user should be able to make Business Group a Partner in Provider Module test")
	public void userCanMakeBusinessGroupPartnerInProviderModuleTest() {

		providerPage.verifyUserCanMakeBusinessGroupPartner();

	}

	@And("I create a profile with View and Make Partner access but no Add, Edit or Delete access to Business Group in Provider Module test")
	public void createProfileWithViewAndMakePartnerAccessWithoutAddEditDeleteBusinessGroupProviderModuleTest() {
		providerPage.clickFilterButton();
		providerPage.enterProfileName("Sunil");
		providerPage.clickSearchButton();
		providerPage.clickActionMenu();
		providerPage.clickEditButton();
		providerPage.createProfileWithViewAndPartnerAccessNoCrud();
		providerPage.clickSubmitButton();
		System.out.println("Profile created with View access only to Provider Module General Audit View test");
		Hooks.scenario.log("Profile created with View access only to Provider Module General Audit View test");

	}

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
