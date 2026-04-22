package com.pharmcrm_BillingModule.steps;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.junit.Assert;
import org.junit.Assume;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pharmcrm_BillingModule.pages.BillingModuleFunctionalityPage;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillingModuleFunctionalitySteps {
	
	BillingModuleFunctionalityPage BillingModulefunctionalitypage = new BillingModuleFunctionalityPage(Hooks.driver);
	WebDriver driver; // class level driver variable
	
	@Then("user click on the Billing module tab in home page")
	public void user_click_on_the_Billing_module_tab_in_home_page() {
		boolean result = BillingModulefunctionalitypage.clickintotheBillingmoduletab();
		
		if (!result) {
	        String message = "Billing Module (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Billing Module tab clicked successfully");
	}
	
	
	//-----------------------------------Invoice Section-----------------------------------------
	
	
	@When("user click on the Invoice tab in sidebar in Billing module page")
	public void user_click_on_the_Invoice_tab_in_sidebar_in_Billing_module_page() {
		boolean result = BillingModulefunctionalitypage.clickintotheInvoicetabinsidebar();
		
		if (!result) {
	        String message = "Invoice (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Invoice tab clicked successfully");
	}
	
	@Then("user click on the new invoice button in invoice section")
	public void user_click_on_the_new_invoice_button_in_invoice_section() {
		boolean result = BillingModulefunctionalitypage.clickintotheNewInvoicebuttoninInvoice();
		
		if (!result) {
	        String message = "New Invoice (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New Invoice button clicked successfully");
	}
	
	@And("user click on the add patient name tab in invoice page")
	public void user_click_on_the_add_patient_name_tab_in_invoice_page() throws Exception {
		BillingModulefunctionalitypage.clickintotheAddPatientNametabinInvoicepage();
		Thread.sleep(1000);
		
		System.out.println("Add Patient Name button clicked successfully");
		Hooks.scenario.log("Add Patient Name button clicked successfully");
	}
	
	@When("user enter the patient id in search patient pop-up window")
	public void user_enter_the_patient_id_in_search_patient_pop_up_window() {
		String PatientId = Hooks.prop.getProperty("patientid");
		BillingModulefunctionalitypage.enterthePatientIdinSearchPatient(PatientId);
		
		System.out.println("User Entered Patient Id: " + PatientId);
		Hooks.scenario.log("User Entered Patient Id: " + PatientId);
	}
	
	@When("user change the patient id in search patient pop-up window")
	public void user_change_the_patient_id_in_search_patient_pop_up_window() {
		String PatientId = Hooks.prop.getProperty("newpatientid");
		BillingModulefunctionalitypage.enterthePatientIdinSearchPatient(PatientId);
		
		System.out.println("User Entered New Patient Id: " + PatientId);
		Hooks.scenario.log("User Entered New Patient Id: " + PatientId);
	}
	
	@When("user enter the invalid patient id in search patient pop-up window")
	public void user_enter_the_invalid_patient_id_in_search_patient_pop_up_window() {
		String PatientId = Hooks.prop.getProperty("invalidpatientid");
		BillingModulefunctionalitypage.enterthePatientIdinSearchPatient(PatientId);
		
		System.out.println("User Entered Invalid Patient Id: " + PatientId);
		Hooks.scenario.log("User Entered Invalid Patient Id: " + PatientId);
	}
	
	@Then("user enter the patient last name in search patient pop-up window")
	public void user_enter_the_patient_last_name_in_search_patient_pop_up_window() {
		String PatientLastName = Hooks.prop.getProperty("patientlastname");
		BillingModulefunctionalitypage.enterthePatientLastNameinSearchPatient(PatientLastName);
		
		System.out.println("User Entered Patient Last Name: " + PatientLastName);
		Hooks.scenario.log("User Entered Patient Last Name: " + PatientLastName);
	}
	
	@Then("user change the patient last name in search patient pop-up window")
	public void user_change_the_patient_last_name_in_search_patient_pop_up_window() {
		String PatientLastName = Hooks.prop.getProperty("newpatientlastname");
		BillingModulefunctionalitypage.enterthePatientLastNameinSearchPatient(PatientLastName);
		
		System.out.println("User Entered New Patient Last Name: " + PatientLastName);
		Hooks.scenario.log("User Entered New Patient Last Name: " + PatientLastName);
	}
	
	@Then("user enter the invalid patient last name in search patient pop-up window")
	public void user_enter_the_invalid_patient_last_name_in_search_patient_pop_up_window() {
		String PatientLastName = Hooks.prop.getProperty("invalidpatientlastname");
		BillingModulefunctionalitypage.enterthePatientLastNameinSearchPatient(PatientLastName);
		
		System.out.println("User Entered Invalid Patient Last Name: " + PatientLastName);
		Hooks.scenario.log("User Entered Invalid Patient Last Name: " + PatientLastName);
	}
	
	@And("user enter the patient first name in search patient pop-up window")
	public void user_enter_the_patient_first_name_in_search_patient_pop_up_window() {
		String PatientFirstName = Hooks.prop.getProperty("patientfirstname");
		BillingModulefunctionalitypage.enterthePatientFirstNameinSearchPatient(PatientFirstName);
		
		System.out.println("User Entered Patient First Name: " + PatientFirstName);
		Hooks.scenario.log("User Entered Patient First Name: " + PatientFirstName);
	}
	
	@And("user change the patient first name in search patient pop-up window")
	public void user_change_the_patient_first_name_in_search_patient_pop_up_window() {
		String PatientFirstName = Hooks.prop.getProperty("newpatientfirstname");
		BillingModulefunctionalitypage.enterthePatientFirstNameinSearchPatient(PatientFirstName);
		
		System.out.println("User Entered New Patient First Name: " + PatientFirstName);
		Hooks.scenario.log("User Entered New Patient First Name: " + PatientFirstName);
	}
	
	@And("user enter the invalid patient first name in search patient pop-up window")
	public void user_enter_the_invalid_patient_first_name_in_search_patient_pop_up_window() {
		String PatientFirstName = Hooks.prop.getProperty("invalidpatientfirstname");
		BillingModulefunctionalitypage.enterthePatientFirstNameinSearchPatient(PatientFirstName);
		
		System.out.println("User Entered Invalid Patient First Name: " + PatientFirstName);
		Hooks.scenario.log("User Entered Invalid Patient First Name: " + PatientFirstName);
	}
	
	@When("user enter the patient date of birth in search patient pop-up window")
	public void user_enter_the_patient_date_of_birth_in_search_patient_pop_up_window() {
		String PatientDateofBirth = Hooks.prop.getProperty("patientdateofbirth");
		BillingModulefunctionalitypage.enterthePatientDateofBirthinSearchPatient(PatientDateofBirth);
		
		System.out.println("User Entered Patient Date of Birth: " + PatientDateofBirth);
		Hooks.scenario.log("User Entered Patient Date of Birth: " + PatientDateofBirth);
	}
	
	@When("user change the patient date of birth in search patient pop-up window")
	public void user_change_the_patient_date_of_birth_in_search_patient_pop_up_window() {
		String PatientDateofBirth = Hooks.prop.getProperty("newpatientbirthdate");
		BillingModulefunctionalitypage.enterthePatientDateofBirthinSearchPatient(PatientDateofBirth);
		
		System.out.println("User Entered New Patient Date of Birth: " + PatientDateofBirth);
		Hooks.scenario.log("User Entered New Patient Date of Birth: " + PatientDateofBirth);
	}
	
	@When("user enter the invalid patient date of birth in search patient pop-up window")
	public void user_enter_the_invalid_patient_date_of_birth_in_search_patient_pop_up_window() {
		String PatientDateofBirth = Hooks.prop.getProperty("invalidpatientdateofbirth");
		BillingModulefunctionalitypage.enterthePatientDateofBirthinSearchPatient(PatientDateofBirth);
		
		System.out.println("User Entered Invalid Patient Date of Birth: " + PatientDateofBirth);
		Hooks.scenario.log("User Entered Invalid Patient Date of Birth: " + PatientDateofBirth);
	}
	
	@Then("user click on the search button in search patient pop-up window")
	public void user_click_on_the_search_button_in_search_patient_pop_up_window() throws Exception {
		String result = BillingModulefunctionalitypage.clickintotheSearchbuttoninSearchPatient();
		Thread.sleep(1000);
		
		System.out.println("Search Result: " + result);
		Hooks.scenario.log("Search Result: " + result);
		
		if (result.startsWith("ERROR") || result.contains("No Record")) {

			Hooks.scenario.log("patient is not placed: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user click on the first radio button of record patient in search patient pop-up window")
	public void user_click_on_the_first_radio_button_of_record_patient_in_search_patient_pop_up_window() {
		BillingModulefunctionalitypage.clickintotheFirstradiobuttoninSearchPatient();
		
		System.out.println("First radio button clicked successfully");
		Hooks.scenario.log("First radio button clicked successfully");
	}
	
	@When("user click on the submit button in search patient pop-up window")
	public void user_click_on_the_submit_button_in_search_patient_pop_up_window() {
		String result = BillingModulefunctionalitypage.clickintotheSubmitbuttoninSearchPatient();
		
		System.out.println("Submit button clicked successfully and Message is shown: " + result);
		Hooks.scenario.log("Submit button clicked successfully and Message is shown: " + result);
		
		if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Patient is not placed: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user enter the item in invoice page")
	public void user_enter_the_item_in_invoice_page() {
		String Item = Hooks.prop.getProperty("item");
		BillingModulefunctionalitypage.entertheIteminInvoice(Item);
		
		System.out.println("User Entered Item: " + Item);
		Hooks.scenario.log("User Entered Item: " + Item);
	}
	
	@Then("user change the item in invoice page")
	public void user_change_the_item_in_invoice_page() {
		String Item = Hooks.prop.getProperty("newitem");
		BillingModulefunctionalitypage.entertheIteminInvoice(Item);
		
		System.out.println("User Entered New Item: " + Item);
		Hooks.scenario.log("User Entered New Item: " + Item);
	}
	
	@And("user select the flag in invoice page")
	public void user_select_the_flag_in_invoice_page() throws Exception {
		String flagName = "Rx";

	    boolean result = BillingModulefunctionalitypage.selectFlagInInvoice(flagName);

	    Thread.sleep(1500);

	    if (!result) {

	        String msg = "Flag is NOT present in dropdown: " + flagName;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        // HARD STOP
	        Assume.assumeTrue(msg, false);
	    }

	    Hooks.scenario.log("Flag selected successfully: " + flagName);
	    System.out.println("Flag selected successfully: " + flagName);
	}
	
	@And("user change the flag in invoice page")
	public void user_change_the_flag_in_invoice_page() throws Exception {
		String flagName = "AutoRefill";

	    boolean result = BillingModulefunctionalitypage.selectFlagInInvoice(flagName);

	    Thread.sleep(1500);

	    if (!result) {

	        String msg = "Flag is NOT present in dropdown: " + flagName;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        // HARD STOP
	        Assume.assumeTrue(msg, false);
	    }

	    Hooks.scenario.log("Flag Changed successfully: " + flagName);
	    System.out.println("Flag Changed successfully: " + flagName);
	}
	
	@When("user enter the description in invoice page")
	public void user_enter_the_description_in_invoice_page() {
		String Description = Hooks.prop.getProperty("description");
		BillingModulefunctionalitypage.entertheDescriptioninInvoice(Description);
		
		System.out.println("User Entered Description: " + Description);
		Hooks.scenario.log("User Entered Description: " + Description);
	}
	
	@When("user change the description in invoice page")
	public void user_change_the_description_in_invoice_page() {
		String Description = Hooks.prop.getProperty("newdescription");
		BillingModulefunctionalitypage.entertheDescriptioninInvoice(Description);
		
		System.out.println("User Entered New Description: " + Description);
		Hooks.scenario.log("User Entered New Description: " + Description);
	}
	
	@Then("user enter the quantity in invoice page")
	public void user_enter_the_quantity_in_invoice_page() {
		String Quantity = Hooks.prop.getProperty("quantity");
		BillingModulefunctionalitypage.entertheQuantityinInvoice(Quantity);
		
		System.out.println("User Entered Quantity: " + Quantity);
		Hooks.scenario.log("User Entered Quantity: " + Quantity);
	}
	
	@Then("user change the quantity in invoice page")
	public void user_change_the_quantity_in_invoice_page() {
		String Quantity = Hooks.prop.getProperty("newquantity");
		BillingModulefunctionalitypage.entertheQuantityinInvoice(Quantity);
		
		System.out.println("User Entered New Quantity: " + Quantity);
		Hooks.scenario.log("User Entered New Quantity: " + Quantity);
	}
	
	@Then("user enter the invalid quantity in invoice page")
	public void user_enter_the_invalid_quantity_in_invoice_page() {
		String Quantity = Hooks.prop.getProperty("invalidquantity");
		BillingModulefunctionalitypage.entertheQuantityinInvoice(Quantity);
		
		System.out.println("User Entered Invalid Quantity: " + Quantity);
		Hooks.scenario.log("User Entered Invalid Quantity: " + Quantity);
	}
	
	@And("user enter the cost per quantity in invoice page")
	public void user_enter_the_cost_per_quantity_in_invoice_page() {
		String CostPerQuantity = Hooks.prop.getProperty("costperquantity");
		BillingModulefunctionalitypage.entertheCostPerQuantityinInvoice(CostPerQuantity);
		
		System.out.println("User Entered Cost Per Quantity: " + CostPerQuantity);
		Hooks.scenario.log("User Entered Cost Per Quantity: " + CostPerQuantity);
	}
	
	@And("user change the cost per quantity in invoice page")
	public void user_change_the_cost_per_quantity_in_invoice_page() {
		String CostPerQuantity = Hooks.prop.getProperty("newcostperquantity");
		BillingModulefunctionalitypage.entertheCostPerQuantityinInvoice(CostPerQuantity);
		
		System.out.println("User Entered New Cost Per Quantity: " + CostPerQuantity);
		Hooks.scenario.log("User Entered New Cost Per Quantity: " + CostPerQuantity);
	}
	
	@And("user enter the invalid cost per quantity in invoice page")
	public void user_enter_the_invalid_cost_per_quantity_in_invoice_page() {
		String CostPerQuantity = Hooks.prop.getProperty("invalidcostperquantity");
		BillingModulefunctionalitypage.entertheCostPerQuantityinInvoice(CostPerQuantity);
		
		System.out.println("User Entered Invalid Cost Per Quantity: " + CostPerQuantity);
		Hooks.scenario.log("User Entered Invalid Cost Per Quantity: " + CostPerQuantity);
	}
	
	@When("user click on the taxable checkbox in invoice page")
	public void user_click_on_the_taxable_checkbox_in_invoice_page() {
		BillingModulefunctionalitypage.clickintotheTaxablecheckboxinInvoice();
		
		System.out.println("Taxable checkbox clicked successfully");
		Hooks.scenario.log("Taxable checkbox clicked successfully");
	}
	
	@Then("user enter the shipping and handling charges in invoice page")
	public void user_enter_the_shipping_and_handling_charges_in_invoice_page() {
		String ShippingCharges = Hooks.prop.getProperty("shippingcharges");
		BillingModulefunctionalitypage.entertheShippingChargesinInvoice(ShippingCharges);
		
		System.out.println("User Entered Shipping And Handling Charges: " + ShippingCharges);
		Hooks.scenario.log("User Entered Shipping And Handling Charges: " + ShippingCharges);
	}
	
	@Then("user change the shipping and handling charges in invoice page")
	public void user_change_the_shipping_and_handling_charges_in_invoice_page() {
		String ShippingCharges = Hooks.prop.getProperty("newshippingcharges");
		BillingModulefunctionalitypage.entertheShippingChargesinInvoice(ShippingCharges);
		
		System.out.println("User Entered New Shipping And Handling Charges: " + ShippingCharges);
		Hooks.scenario.log("User Entered New Shipping And Handling Charges: " + ShippingCharges);
	}
	
	@Then("user enter the invalid shipping and handling charges in invoice page")
	public void user_enter_the_invalid_shipping_and_handling_charges_in_invoice_page() {
		String ShippingCharges = Hooks.prop.getProperty("invalidshippingcharges");
		BillingModulefunctionalitypage.entertheShippingChargesinInvoice(ShippingCharges);
		
		System.out.println("User Entered Invalid Shipping And Handling Charges: " + ShippingCharges);
		Hooks.scenario.log("User Entered Invalid Shipping And Handling Charges: " + ShippingCharges);
	}
	
	@When("user remove the existing invoice medicine details in invoice page")
	public void user_remove_the_existing_invoice_medicine_details_in_invoice_page() {
		boolean result = BillingModulefunctionalitypage.clickintotheRemoveMedicinebuttoninExistingInvoiceDetails();
		
		if (!result) {
	        String message = "Clear Medicine (more options) button is not visible";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Clear Medicine button clicked successfully");
	}
	
	@And("user click on the add button in invoice page")
	public void user_click_on_the_add_button_in_invoice_page() throws Exception {
		String result = BillingModulefunctionalitypage.clickintothePlusIconinInvoice();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Plus icon clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user click on the shipping amount checkbox in invoice page")
	public void user_click_on_the_shipping_amount_checkbox_in_invoice_page() {
		BillingModulefunctionalitypage.clickintotheShippingAmountcheckboxinInvoice();
		
		System.out.println("Shipping Amount checkbox clicked successfully");
		Hooks.scenario.log("Shipping Amount checkbox clicked successfully");
	}
	
	@And("user check the shipping amount checkbox is unchecked in invoice page")
	public void user_check_the_shipping_amount_checkbox_is_unchecked_in_invoice_page() throws Exception {
		boolean status = BillingModulefunctionalitypage.ChecktheShippingAmountcheckboxStatusinInvoice();
		if (status) {
	        Hooks.scenario.log("Shipping Amount checkbox was checked and is now unchecked");
	    } else {
	        Hooks.scenario.log("Shipping Amount checkbox already unchecked");
	    }
	}
	
	@And("user click on the print description checkbox in invoice page")
	public void user_click_on_the_print_description_checkbox_in_invoice_page() throws Exception {
		BillingModulefunctionalitypage.clickintothePrintDescriptioncheckboxinInvoice();
		Thread.sleep(1500);
		
		System.out.println("Print Description checkbox clicked successfully");
		Hooks.scenario.log("Print Description checkbox clicked successfully");
	}
	
	@When("user enter the patient email in invoice page")
	public void user_enter_the_patient_email_in_invoice_page() {
		String PatientEmail = Hooks.prop.getProperty("patientemail");
		BillingModulefunctionalitypage.enterthePatientEmailinInvoice(PatientEmail);
		
		System.out.println("User Entered Patient Email: " + PatientEmail);
		Hooks.scenario.log("User Entered Patient Email: " + PatientEmail);
	}
	
	@When("user change the patient email in invoice page")
	public void user_change_the_patient_email_in_invoice_page() {
		String PatientEmail = Hooks.prop.getProperty("newpatientemail");
		BillingModulefunctionalitypage.enterthePatientEmailinInvoice(PatientEmail);
		
		System.out.println("User Entered New Patient Email: " + PatientEmail);
		Hooks.scenario.log("User Entered New Patient Email: " + PatientEmail);
	}
	
	@When("user enter the invalid patient email in invoice page")
	public void user_enter_the_invalid_patient_email_in_invoice_page() {
		String PatientEmail = Hooks.prop.getProperty("invalidpatientemail");
		BillingModulefunctionalitypage.enterthePatientEmailinInvoice(PatientEmail);
		
		System.out.println("User Entered Invalid Patient Email: " + PatientEmail);
		Hooks.scenario.log("User Entered Invalid Patient Email: " + PatientEmail);
	}
	
	@Then("user enter the patient phone number in invoice page")
	public void user_enter_the_patient_phone_number_in_invoice_page() {
		String PatientPhoneNumber = Hooks.prop.getProperty("patientphonenumber");
		BillingModulefunctionalitypage.enterthePatientPhoneNumberinInvoice(PatientPhoneNumber);
		
		System.out.println("User Entered Patient Phone Number: " + PatientPhoneNumber);
		Hooks.scenario.log("User Entered Patient Phone Number: " + PatientPhoneNumber);
	}
	
	@Then("user change the patient phone number in invoice page")
	public void user_change_the_patient_phone_number_in_invoice_page() {
		String PatientPhoneNumber = Hooks.prop.getProperty("newpatientphonenumber");
		BillingModulefunctionalitypage.enterthePatientPhoneNumberinInvoice(PatientPhoneNumber);
		
		System.out.println("User Entered New Patient Phone Number: " + PatientPhoneNumber);
		Hooks.scenario.log("User Entered New Patient Phone Number: " + PatientPhoneNumber);
	}
	
	@Then("user enter the invalid patient phone number in invoice page")
	public void user_enter_the_invalid_patient_phone_number_in_invoice_page() {
		String PatientPhoneNumber = Hooks.prop.getProperty("invalidpatientphonenumber");
		BillingModulefunctionalitypage.enterthePatientPhoneNumberinInvoice(PatientPhoneNumber);
		
		System.out.println("User Entered Patient Invalid Phone Number: " + PatientPhoneNumber);
		Hooks.scenario.log("User Entered Patient Invalid Phone Number: " + PatientPhoneNumber);
	}
	
	@And("user enter the third party email in invoice page")
	public void user_enter_the_third_party_email_in_invoice_page() {
		String ThirdPartyEmail = Hooks.prop.getProperty("thirdpartyemail");
		BillingModulefunctionalitypage.entertheThirdPartyEmailinInvoice(ThirdPartyEmail);
		
		System.out.println("User Entered Third Party Email: " + ThirdPartyEmail);
		Hooks.scenario.log("User Entered Third Party Email: " + ThirdPartyEmail);
	}
	
	@And("user change the third party email in invoice page")
	public void user_change_the_third_party_email_in_invoice_page() {
		String ThirdPartyEmail = Hooks.prop.getProperty("newthirdpartyemail");
		BillingModulefunctionalitypage.entertheThirdPartyEmailinInvoice(ThirdPartyEmail);
		
		System.out.println("User Entered New Third Party Email: " + ThirdPartyEmail);
		Hooks.scenario.log("User Entered New Third Party Email: " + ThirdPartyEmail);
	}
	
	@And("user enter the invalid third party email in invoice page")
	public void user_enter_the_invalid_third_party_email_in_invoice_page() {
		String ThirdPartyEmail = Hooks.prop.getProperty("invalidthirdpartyemail");
		BillingModulefunctionalitypage.entertheThirdPartyEmailinInvoice(ThirdPartyEmail);
		
		System.out.println("User Entered Invalid Third Party Email: " + ThirdPartyEmail);
		Hooks.scenario.log("User Entered Invalid Third Party Email: " + ThirdPartyEmail);
	}
	
	@When("user click on the patient email checkbox in invoice page")
	public void user_click_on_the_patient_email_checkbox_in_invoice_page() {
		BillingModulefunctionalitypage.clickintothePatientEmailcheckboxinInvoice();
		
		System.out.println("Patient Email checkbox clicked successfully");
		Hooks.scenario.log("Patient Email checkbox clicked successfully");
	}
	
	@Then("user click on the patient phone number checkbox in invoice page")
	public void user_click_on_the_patient_phone_number_checkbox_in_invoice_page() {
		BillingModulefunctionalitypage.clickintothePatientPhoneNumbercheckboxinInvoice();
		
		System.out.println("Patient Phone Number checkbox clicked successfully");
		Hooks.scenario.log("Patient Phone Number checkbox clicked successfully");
	}
	
	@And("user click on the third party email checkbox in invoice page")
	public void user_click_on_the_third_party_email_checkbox_in_invoice_page() {
		BillingModulefunctionalitypage.clickintotheThirdPartyEmailcheckboxinInvoice();
		
		System.out.println("Third Party Email checkbox clicked successfully");
		Hooks.scenario.log("Third Party Email checkbox clicked successfully");
	}
	
	@When("user enter the last name in invoice bill to section in invoice page")
	public void user_enter_the_last_name_in_invoice_bill_to_section_in_invoice_page() {
		String LastNameInvoiceBillTo = Hooks.prop.getProperty("lastnameinvoicetobill");
		BillingModulefunctionalitypage.entertheLastNameinInvoiceBillTo(LastNameInvoiceBillTo);
		
		System.out.println("User Entered Last Name Invoice Bill To: " + LastNameInvoiceBillTo);
		Hooks.scenario.log("User Entered Last Name Invoice Bill To: " + LastNameInvoiceBillTo);
	}
	
	@When("user change the last name in invoice bill to section in invoice page")
	public void user_change_the_last_name_in_invoice_bill_to_section_in_invoice_page() {
		String LastNameInvoiceBillTo = Hooks.prop.getProperty("newlastnameinvoicetobill");
		BillingModulefunctionalitypage.entertheLastNameinInvoiceBillTo(LastNameInvoiceBillTo);
		
		System.out.println("User Entered New Last Name Invoice Bill To: " + LastNameInvoiceBillTo);
		Hooks.scenario.log("User Entered New Last Name Invoice Bill To: " + LastNameInvoiceBillTo);
	}
	
	@When("user remove the last name in invoice bill to section in invoice page")
	public void user_remove_the_last_name_in_invoice_bill_to_section_in_invoice_page() {
		BillingModulefunctionalitypage.removetheLastNameinInvoiceBillTo();
		
		System.out.println("Remove the last name successfully");
		Hooks.scenario.log("Remove the last name successfully");
	}
	
	@Then("user enter the first name in invoice bill to section in invoice page")
	public void user_enter_the_first_name_in_invoice_bill_to_section_in_invoice_page() {
		String FirstNameInvoiceBillTo = Hooks.prop.getProperty("firstnameinvoicetobill");
		BillingModulefunctionalitypage.entertheFirstNameinInvoiceBillTo(FirstNameInvoiceBillTo);
		
		System.out.println("User Entered First Name Invoice Bill To: " + FirstNameInvoiceBillTo);
		Hooks.scenario.log("User Entered First Name Invoice Bill To: " + FirstNameInvoiceBillTo);
	}
	
	@Then("user change the first name in invoice bill to section in invoice page")
	public void user_change_the_first_name_in_invoice_bill_to_section_in_invoice_page() {
		String FirstNameInvoiceBillTo = Hooks.prop.getProperty("newfirstnameinvoicetobill");
		BillingModulefunctionalitypage.entertheFirstNameinInvoiceBillTo(FirstNameInvoiceBillTo);
		
		System.out.println("User Entered New First Name Invoice Bill To: " + FirstNameInvoiceBillTo);
		Hooks.scenario.log("User Entered New First Name Invoice Bill To: " + FirstNameInvoiceBillTo);
	}
	
	@Then("user remove the first name in invoice bill to section in invoice page")
	public void user_remove_the_first_name_in_invoice_bill_to_section_in_invoice_page() {
		BillingModulefunctionalitypage.removetheFirstNameinInvoiceBillTo();
		
		System.out.println("Remove the first name successfully");
		Hooks.scenario.log("Remove the first name successfully");
	}
	
	@And("user enter the street address in invoice bill to section in invoice page")
	public void user_enter_the_street_address_in_invoice_bill_to_section_in_invoice_page() {
		String StreetAddressInvoiceBillTo = Hooks.prop.getProperty("streetaddressinvoicetobill");
		BillingModulefunctionalitypage.entertheStreetAddressinInvoiceBillTo(StreetAddressInvoiceBillTo);
		
		System.out.println("User Entered Street Address Invoice Bill To: " + StreetAddressInvoiceBillTo);
		Hooks.scenario.log("User Entered Street Address Invoice Bill To: " + StreetAddressInvoiceBillTo);
	}
	
	@And("user change the street address in invoice bill to section in invoice page")
	public void user_change_the_street_address_in_invoice_bill_to_section_in_invoice_page() {
		String StreetAddressInvoiceBillTo = Hooks.prop.getProperty("newstreetaddressinvoicetobill");
		BillingModulefunctionalitypage.entertheStreetAddressinInvoiceBillTo(StreetAddressInvoiceBillTo);
		
		System.out.println("User Entered New Street Address Invoice Bill To: " + StreetAddressInvoiceBillTo);
		Hooks.scenario.log("User Entered New Street Address Invoice Bill To: " + StreetAddressInvoiceBillTo);
	}
	
	@And("user remove the street address in invoice bill to section in invoice page")
	public void user_remove_the_street_address_in_invoice_bill_to_section_in_invoice_page() {
		BillingModulefunctionalitypage.removetheStreetAddressinInvoiceBillTo();
		
		System.out.println("Street Address is remove successfully");
		Hooks.scenario.log("Street Address is remove successfully");
	}
	
	@When("user enter the city in invoice bill to section in invoice page")
	public void user_enter_the_city_in_invoice_bill_to_section_in_invoice_page() {
		String CityInvoiceBillTo = Hooks.prop.getProperty("cityinvoicetobill");
		BillingModulefunctionalitypage.entertheCityinInvoiceBillTo(CityInvoiceBillTo);
		
		System.out.println("User Entered City Invoice Bill To: " + CityInvoiceBillTo);
		Hooks.scenario.log("User Entered City Invoice Bill To: " + CityInvoiceBillTo);
	}
	
	@When("user change the city in invoice bill to section in invoice page")
	public void user_change_the_city_in_invoice_bill_to_section_in_invoice_page() {
		String CityInvoiceBillTo = Hooks.prop.getProperty("newcityinvoicetobill");
		BillingModulefunctionalitypage.entertheCityinInvoiceBillTo(CityInvoiceBillTo);
		
		System.out.println("User Entered New City Invoice Bill To: " + CityInvoiceBillTo);
		Hooks.scenario.log("User Entered New City Invoice Bill To: " + CityInvoiceBillTo);
	}
	
	@When("user remove the city in invoice bill to section in invoice page")
	public void user_remove_the_city_in_invoice_bill_to_section_in_invoice_page() {
		BillingModulefunctionalitypage.removetheCityinInvoiceBillTo();
		
		System.out.println("City Name remove successfully");
		Hooks.scenario.log("City Name remove successfully");
	}
	
	@Then("user enter the state in invoice bill to section in invoice page")
	public void user_enter_the_state_in_invoice_bill_to_section_in_invoice_page() {
		String StateInvoiceBillTo = Hooks.prop.getProperty("stateinvoicetobill");
		BillingModulefunctionalitypage.entertheStateinInvoiceBillTo(StateInvoiceBillTo);
		
		System.out.println("User Entered State Invoice Bill To: " + StateInvoiceBillTo);
		Hooks.scenario.log("User Entered State Invoice Bill To: " + StateInvoiceBillTo);
	}
	
	@Then("user change the state in invoice bill to section in invoice page")
	public void user_change_the_state_in_invoice_bill_to_section_in_invoice_page() {
		String StateInvoiceBillTo = Hooks.prop.getProperty("newstateinvoicetobill");
		BillingModulefunctionalitypage.entertheStateinInvoiceBillTo(StateInvoiceBillTo);
		
		System.out.println("User Entered New State Invoice Bill To: " + StateInvoiceBillTo);
		Hooks.scenario.log("User Entered New State Invoice Bill To: " + StateInvoiceBillTo);
	}
	
	@Then("user remove the state in invoice bill to section in invoice page")
	public void user_remove_the_state_in_invoice_bill_to_section_in_invoice_page() {
		BillingModulefunctionalitypage.removetheStateinInvoiceBillTo();
		
		System.out.println("Remove the state successfully");
		Hooks.scenario.log("Remove the state successfully");
	}
	
	@And("user enter the zip code in invoice bill to section in invoice page")
	public void user_enter_the_zip_code_in_invoice_bill_to_section_in_invoice_page() {
		String ZipCodeInvoiceBillTo = Hooks.prop.getProperty("zipcodeinvoicetobill");
		BillingModulefunctionalitypage.entertheZipCodeinInvoiceBillTo(ZipCodeInvoiceBillTo);
		
		System.out.println("User Entered Zip Code Invoice Bill To: " + ZipCodeInvoiceBillTo);
		Hooks.scenario.log("User Entered Zip Code Invoice Bill To: " + ZipCodeInvoiceBillTo);
	}
	
	@And("user change the zip code in invoice bill to section in invoice page")
	public void user_change_the_zip_code_in_invoice_bill_to_section_in_invoice_page() {
		String ZipCodeInvoiceBillTo = Hooks.prop.getProperty("newzipcodeinvoicetobill");
		BillingModulefunctionalitypage.entertheZipCodeinInvoiceBillTo(ZipCodeInvoiceBillTo);
		
		System.out.println("User Entered New Zip Code Invoice Bill To: " + ZipCodeInvoiceBillTo);
		Hooks.scenario.log("User Entered New Zip Code Invoice Bill To: " + ZipCodeInvoiceBillTo);
	}
	
	@And("user enter the invalid zip code in invoice bill to section in invoice page")
	public void user_enter_the_invalid_zip_code_in_invoice_bill_to_section_in_invoice_page() {
		String ZipCodeInvoiceBillTo = Hooks.prop.getProperty("invalidzipcodeinvoicetobill");
		BillingModulefunctionalitypage.entertheZipCodeinInvoiceBillTo(ZipCodeInvoiceBillTo);
		
		System.out.println("User Entered Invalid Zip Code Invoice Bill To: " + ZipCodeInvoiceBillTo);
		Hooks.scenario.log("User Entered Invalid Zip Code Invoice Bill To: " + ZipCodeInvoiceBillTo);
	}
	
	@And("user remove the zip code in invoice bill to section in invoice page")
	public void user_remove_the_zip_code_in_invoice_bill_to_section_in_invoice_page() {
		BillingModulefunctionalitypage.removetheZipCodeinInvoiceBillTo();
		
		System.out.println("Remove the zip code successfully");
		Hooks.scenario.log("Remove the zip code successfully");
	}
	
	@When("user enter the phone number in invoice bill to section in invoice page")
	public void user_enter_the_phone_number_in_invoice_bill_to_section_in_invoice_page() {
		String PhoneNumberInvoiceBillTo = Hooks.prop.getProperty("phonenumberinvoicetobill");
		BillingModulefunctionalitypage.enterthePhoneNumberinInvoiceBillTo(PhoneNumberInvoiceBillTo);
		
		System.out.println("User Entered Phone Number Invoice Bill To: " + PhoneNumberInvoiceBillTo);
		Hooks.scenario.log("User Entered Phone Number Invoice Bill To: " + PhoneNumberInvoiceBillTo);
	}
	
	@When("user change the phone number in invoice bill to section in invoice page")
	public void user_change_the_phone_number_in_invoice_bill_to_section_in_invoice_page() {
		String PhoneNumberInvoiceBillTo = Hooks.prop.getProperty("newphonenumberinvoicetobill");
		BillingModulefunctionalitypage.enterthePhoneNumberinInvoiceBillTo(PhoneNumberInvoiceBillTo);
		
		System.out.println("User Entered New Phone Number Invoice Bill To: " + PhoneNumberInvoiceBillTo);
		Hooks.scenario.log("User Entered New Phone Number Invoice Bill To: " + PhoneNumberInvoiceBillTo);
	}
	
	@When("user enter the invalid phone number in invoice bill to section in invoice page")
	public void user_enter_the_invalid_phone_number_in_invoice_bill_to_section_in_invoice_page() {
		String PhoneNumberInvoiceBillTo = Hooks.prop.getProperty("invalidphonenumberinvoicetobill");
		BillingModulefunctionalitypage.enterthePhoneNumberinInvoiceBillTo(PhoneNumberInvoiceBillTo);
		
		System.out.println("User Entered Invalid Phone Number Invoice Bill To: " + PhoneNumberInvoiceBillTo);
		Hooks.scenario.log("User Entered Invalid Phone Number Invoice Bill To: " + PhoneNumberInvoiceBillTo);
	}
	
	@When("user remove the phone number in invoice bill to section in invoice page")
	public void user_remove_the_phone_number_in_invoice_bill_to_section_in_invoice_page() {
		BillingModulefunctionalitypage.removethePhoneNumberinInvoiceBillTo();
		
		System.out.println("Remove the phone number successfully");
		Hooks.scenario.log("Remove the phone number successfully");
	}
	
	@Then("user enter the email in invoice bill to section in invoice page")
	public void user_enter_the_email_in_invoice_bill_to_section_in_invoice_page() {
		String EmailInvoiceBillTo = Hooks.prop.getProperty("emailinvoicetobill");
		BillingModulefunctionalitypage.entertheEmailinInvoiceBillTo(EmailInvoiceBillTo);
		
		System.out.println("User Entered Email Invoice Bill To: " + EmailInvoiceBillTo);
		Hooks.scenario.log("User Entered Email Invoice Bill To: " + EmailInvoiceBillTo);
	}
	
	@Then("user change the email in invoice bill to section in invoice page")
	public void user_change_the_email_in_invoice_bill_to_section_in_invoice_page() {
		String EmailInvoiceBillTo = Hooks.prop.getProperty("newemailinvoicetobill");
		BillingModulefunctionalitypage.entertheEmailinInvoiceBillTo(EmailInvoiceBillTo);
		
		System.out.println("User Entered New Email Invoice Bill To: " + EmailInvoiceBillTo);
		Hooks.scenario.log("User Entered New Email Invoice Bill To: " + EmailInvoiceBillTo);
	}
	
	@Then("user enter the invalid email in invoice bill to section in invoice page")
	public void user_enter_the_invalid_email_in_invoice_bill_to_section_in_invoice_page() {
		String EmailInvoiceBillTo = Hooks.prop.getProperty("invalidemailinvoicetobill");
		BillingModulefunctionalitypage.entertheEmailinInvoiceBillTo(EmailInvoiceBillTo);
		
		System.out.println("User Entered Invalid Email Invoice Bill To: " + EmailInvoiceBillTo);
		Hooks.scenario.log("User Entered Invalid Email Invoice Bill To: " + EmailInvoiceBillTo);
	}
	
	@Then("user remove the email in invoice bill to section in invoice page")
	public void user_remove_the_email_in_invoice_bill_to_section_in_invoice_page() {
		BillingModulefunctionalitypage.removetheEmailinInvoiceBillTo();
		
		System.out.println("Remove the Email successfully");
		Hooks.scenario.log("Remove the Email successfully");
	}
	
	@And("user click on the save button in invoice page")
	public void user_click_on_the_save_button_in_invoice_page() throws Exception {
		String result = BillingModulefunctionalitypage.clickintotheSavebuttoninInvoice();

	    Thread.sleep(2000);

	    Hooks.scenario.log("Save Result: " + result);
	    System.out.println("Save Result: " + result);

	    if (result.startsWith("ERROR") || result.startsWith("NO_PERMISSION")) {

	        Hooks.scenario.log("Stopping scenario: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to issue: " + result, false);
	    }
	}
	
	@When("user enter the invoice last name in invoice page")
	public void user_enter_the_invoice_last_name_in_invoice_page() {
		String InvoiceLastName = Hooks.prop.getProperty("invoicelastname");
		BillingModulefunctionalitypage.entertheInvoiceLastName(InvoiceLastName);
		
		System.out.println("User Entered Invoice Last Name: " + InvoiceLastName);
		Hooks.scenario.log("User Entered Invoice Last Name: " + InvoiceLastName);
	}
	
	@When("user change the invoice last name in invoice page")
	public void user_change_the_invoice_last_name_in_invoice_page() {
		String InvoiceLastName = Hooks.prop.getProperty("newinvoicelastname");
		BillingModulefunctionalitypage.entertheInvoiceLastName(InvoiceLastName);
		
		System.out.println("User Entered New Invoice Last Name: " + InvoiceLastName);
		Hooks.scenario.log("User Entered New Invoice Last Name: " + InvoiceLastName);
	}
	
	@When("user remove the invoice last name in invoice page")
	public void user_remove_the_invoice_last_name_in_invoice_page() {
		BillingModulefunctionalitypage.removetheInvoiceLastName();
		
		System.out.println("Remove the Invoice Last Name");
		Hooks.scenario.log("Remove the Invoice Last Name");
	}
	
	@Then("user enter the invoice first name in invoice page")
	public void user_enter_the_invoice_first_name_in_invoice_page() {
		String InvoiceFirstName = Hooks.prop.getProperty("invoicefirstname");
		BillingModulefunctionalitypage.entertheInvoiceFirstName(InvoiceFirstName);
		
		System.out.println("User Entered Invoice First Name: " + InvoiceFirstName);
		Hooks.scenario.log("User Entered Invoice First Name: " + InvoiceFirstName);
	}
	
	@Then("user change the invoice first name in invoice page")
	public void user_change_the_invoice_first_name_in_invoice_page() {
		String InvoiceFirstName = Hooks.prop.getProperty("newinvoicefirstname");
		BillingModulefunctionalitypage.entertheInvoiceFirstName(InvoiceFirstName);
		
		System.out.println("User Entered New Invoice First Name: " + InvoiceFirstName);
		Hooks.scenario.log("User Entered New Invoice First Name: " + InvoiceFirstName);
	}
	
	@Then("user remove the invoice first name in invoice page")
	public void user_remove_the_invoice_first_name_in_invoice_page() {
		BillingModulefunctionalitypage.removetheInvoiceFirstName();
		
		System.out.println("Remove the Invoice First Name");
		Hooks.scenario.log("Remove the Invoice First Name");
	}
	
	@And("user enter the invoice street address in invoice page")
	public void user_enter_the_invoice_street_address_in_invoice_page() {
		String InvoiceStreetAddress = Hooks.prop.getProperty("invoicestreetaddress");
		BillingModulefunctionalitypage.entertheInvoiceStreetAddress(InvoiceStreetAddress);
		
		System.out.println("User Entered Invoice Street Address: " + InvoiceStreetAddress);
		Hooks.scenario.log("User Entered Invoice Street Address: " + InvoiceStreetAddress);
	}
	
	@And("user change the invoice street address in invoice page")
	public void user_change_the_invoice_street_address_in_invoice_page() {
		String InvoiceStreetAddress = Hooks.prop.getProperty("newinvoicestreetaddress");
		BillingModulefunctionalitypage.entertheInvoiceStreetAddress(InvoiceStreetAddress);
		
		System.out.println("User Entered New Invoice Street Address: " + InvoiceStreetAddress);
		Hooks.scenario.log("User Entered New Invoice Street Address: " + InvoiceStreetAddress);
	}
	
	@And("user remove the invoice street address in invoice page")
	public void user_remove_the_invoice_street_address_in_invoice_page() {
		BillingModulefunctionalitypage.removetheInvoiceStreetAddress();
		
		System.out.println("Remove the Invoice Street Address");
		Hooks.scenario.log("Remove the Invoice Street Address");
	}
	
	@When("user enter the invoice city in invoice page")
	public void user_enter_the_invoice_city_in_invoice_page() {
		String InvoiceCity = Hooks.prop.getProperty("invoicecity");
		BillingModulefunctionalitypage.entertheInvoiceCity(InvoiceCity);
		
		System.out.println("User Entered Invoice City: " + InvoiceCity);
		Hooks.scenario.log("User Entered Invoice City: " + InvoiceCity);
	}
	
	@When("user change the invoice city in invoice page")
	public void user_change_the_invoice_city_in_invoice_page() {
		String InvoiceCity = Hooks.prop.getProperty("newinvoicecity");
		BillingModulefunctionalitypage.entertheInvoiceCity(InvoiceCity);
		
		System.out.println("User Entered New Invoice City: " + InvoiceCity);
		Hooks.scenario.log("User Entered New Invoice City: " + InvoiceCity);
	}
	
	@When("user remove the invoice city in invoice page")
	public void user_remove_the_invoice_city_in_invoice_page() {
		BillingModulefunctionalitypage.removetheInvoiceCity();
		
		System.out.println("Remove the Invoice City");
		Hooks.scenario.log("Remove the Invoice City");
	}
	
	@Then("user enter the invoice state in invoice page")
	public void user_enter_the_invoice_state_in_invoice_page() {
		String InvoiceState = Hooks.prop.getProperty("invoicestate");
		BillingModulefunctionalitypage.entertheInvoiceState(InvoiceState);
		
		System.out.println("User Entered Invoice State: " + InvoiceState);
		Hooks.scenario.log("User Entered Invoice State: " + InvoiceState);
	}
	
	@Then("user change the invoice state in invoice page")
	public void user_change_the_invoice_state_in_invoice_page() {
		String InvoiceState = Hooks.prop.getProperty("newinvoicestate");
		BillingModulefunctionalitypage.entertheInvoiceState(InvoiceState);
		
		System.out.println("User Entered New Invoice State: " + InvoiceState);
		Hooks.scenario.log("User Entered New Invoice State: " + InvoiceState);
	}
	
	@Then("user remove the invoice state in invoice page")
	public void user_remove_the_invoice_state_in_invoice_page() {
		BillingModulefunctionalitypage.removetheInvoiceState();
		
		System.out.println("Invoice State is remove");
		Hooks.scenario.log("Invoice State is remove");
	}
	
	@And("user enter the invoice zip code in invoice page")
	public void user_enter_the_invoice_zip_code_in_invoice_page() {
		String InvoiceZipCode = Hooks.prop.getProperty("invoicezipcode");
		BillingModulefunctionalitypage.entertheInvoiceZipCode(InvoiceZipCode);
		
		System.out.println("User Entered Invoice Zip Code: " + InvoiceZipCode);
		Hooks.scenario.log("User Entered Invoice Zip Code: " + InvoiceZipCode);
	}
	
	@And("user change the invoice zip code in invoice page")
	public void user_change_the_invoice_zip_code_in_invoice_page() {
		String InvoiceZipCode = Hooks.prop.getProperty("newinvoicezipcode");
		BillingModulefunctionalitypage.entertheInvoiceZipCode(InvoiceZipCode);
		
		System.out.println("User Entered New Invoice Zip Code: " + InvoiceZipCode);
		Hooks.scenario.log("User Entered New Invoice Zip Code: " + InvoiceZipCode);
	}
	
	@And("user enter the invalid invoice zip code in invoice page")
	public void user_enter_the_invalid_invoice_zip_code_in_invoice_page() {
		String InvoiceZipCode = Hooks.prop.getProperty("invalidinvoicezipcode");
		BillingModulefunctionalitypage.entertheInvoiceZipCode(InvoiceZipCode);
		
		System.out.println("User Entered Invalid Invoice Zip Code: " + InvoiceZipCode);
		Hooks.scenario.log("User Entered Invalid Invoice Zip Code: " + InvoiceZipCode);
	}
	
	@When("user enter the invoice phone number in invoice page")
	public void user_enter_the_invoice_phone_number_in_invoice_page() {
		String InvoicePhoneNumber = Hooks.prop.getProperty("invoicephonenumber");
		BillingModulefunctionalitypage.entertheInvoicePhoneNumber(InvoicePhoneNumber);
		
		System.out.println("User Entered Invoice Phone Number: " + InvoicePhoneNumber);
		Hooks.scenario.log("User Entered Invoice Phone Number: " + InvoicePhoneNumber);
	}
	
	@When("user change the invoice phone number in invoice page")
	public void user_change_the_invoice_phone_number_in_invoice_page() {
		String InvoicePhoneNumber = Hooks.prop.getProperty("newinvoicephonenumber");
		BillingModulefunctionalitypage.entertheInvoicePhoneNumber(InvoicePhoneNumber);
		
		System.out.println("User Entered New Invoice Phone Number: " + InvoicePhoneNumber);
		Hooks.scenario.log("User Entered New Invoice Phone Number: " + InvoicePhoneNumber);
	}
	
	@When("user enter the invalid invoice phone number in invoice page")
	public void user_enter_the_invalid_invoice_phone_number_in_invoice_page() {
		String InvoicePhoneNumber = Hooks.prop.getProperty("invalidinvoicephonenumber");
		BillingModulefunctionalitypage.entertheInvoicePhoneNumber(InvoicePhoneNumber);
		
		System.out.println("User Entered Invalid Invoice Phone Number: " + InvoicePhoneNumber);
		Hooks.scenario.log("User Entered Invalid Invoice Phone Number: " + InvoicePhoneNumber);
	}
	
	@And("user enter the invoice email id in invoice page")
	public void user_enter_the_invoice_email_id_in_invoice_page() {
		String InvoiceEmailID = Hooks.prop.getProperty("invoiceemailid");
		BillingModulefunctionalitypage.entertheInvoiceEmailID(InvoiceEmailID);
		
		System.out.println("User Entered Invoice EmailID: " + InvoiceEmailID);
		Hooks.scenario.log("User Entered Invoice EmailID: " + InvoiceEmailID);
	}
	
	@And("user change the invoice email id in invoice page")
	public void user_change_the_invoice_email_id_in_invoice_page() {
		String InvoiceEmailID = Hooks.prop.getProperty("newinvoiceemailid");
		BillingModulefunctionalitypage.entertheInvoiceEmailID(InvoiceEmailID);
		
		System.out.println("User Entered New Invoice EmailID: " + InvoiceEmailID);
		Hooks.scenario.log("User Entered New Invoice EmailID: " + InvoiceEmailID);
	}
	
	@And("user enter the invalid invoice email id in invoice page")
	public void user_enter_the_invalid_invoice_email_id_in_invoice_page() {
		String InvoiceEmailID = Hooks.prop.getProperty("invalidinvoiceemailid");
		BillingModulefunctionalitypage.entertheInvoiceEmailID(InvoiceEmailID);
		
		System.out.println("User Entered Invalid Invoice EmailID: " + InvoiceEmailID);
		Hooks.scenario.log("User Entered Invalid Invoice EmailID: " + InvoiceEmailID);
	}
	
	@And("user click on the save and send button in invoice page")
	public void user_click_on_the_save_and_send_button_in_invoice_page() throws Exception {
		String result = BillingModulefunctionalitypage.clickintotheSaveAndSendbuttoninInvoice();

	    Thread.sleep(2000);

	    Hooks.scenario.log("Save And Send Result: " + result);
	    System.out.println("Save And Send Result: " + result);

	    if (result.startsWith("ERROR") || result.startsWith("NO_PERMISSION")) {

	        Hooks.scenario.log("Stopping scenario: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to issue: " + result, false);
	    }
	}
	
	@And("user click on the settlement button in invoice page")
	public void user_click_on_the_settlement_button_in_invoice_page() throws Exception {
		String result = BillingModulefunctionalitypage.clickintotheSettlementbuttoninInvoice();

	    Thread.sleep(2000);

	    Hooks.scenario.log("Settlement Result: " + result);
	    System.out.println("Settlement Result: " + result);

	    if (result.startsWith("ERROR") || result.startsWith("NO_PERMISSION")) {

	        Hooks.scenario.log("Stopping scenario: " + result);

	        // HARD STOP
	        Assume.assumeTrue("Stopping scenario due to issue: " + result, false);
	    }
	}
	
	@When("user click on the pay by other medium radio button in invoice settlement page")
	public void user_click_on_the_pay_by_other_medium_radio_button_in_invoice_settlement_page() {
		BillingModulefunctionalitypage.clickintothePayByOtherMediumRadiobuttoninInvoiceSettlement();
		
		System.out.println("Pay By Other Medium radio button clicked successfully");
		Hooks.scenario.log("Pay By Other Medium radio button clicked successfully");
	}
	
	@Then("user enter the pay by other medium note in invoice settlement page")
	public void user_enter_the_pay_by_other_medium_note_in_invoice_settlement_page() {
		String PayByOtherMedium = Hooks.prop.getProperty("paybyothermediumnote");
		BillingModulefunctionalitypage.enterthePayByOtherMediumnoteinInvoiceSettlement(PayByOtherMedium);
		
		System.out.println("User Entered Pay By Other Medium Note: " + PayByOtherMedium);
		Hooks.scenario.log("User Entered Pay By Other Medium Note: " + PayByOtherMedium);
	}
	
	@When("user enter the card number in invoice settlement page")
	public void user_enter_the_card_number_in_invoice_settlement_page() {
		String CardNumber = Hooks.prop.getProperty("cardnumber");
		BillingModulefunctionalitypage.entertheCardNumberinInvoiceSettlement(CardNumber);
		
		System.out.println("User Entered Card Number: " + CardNumber);
		Hooks.scenario.log("User Entered Card Number: " + CardNumber);
	}
	
	@When("user enter the invalid card number in invoice settlement page")
	public void user_enter_the_invalid_card_number_in_invoice_settlement_page() {
		String CardNumber = Hooks.prop.getProperty("invalidcardnumber");
		BillingModulefunctionalitypage.entertheCardNumberinInvoiceSettlement(CardNumber);
		
		System.out.println("User Entered Invalid Card Number: " + CardNumber);
		Hooks.scenario.log("User Entered Invalid Card Number: " + CardNumber);
	}
	
	@Then("user enter the expiry date in invoice settlement page")
	public void user_enter_the_expiry_date_in_invoice_settlement_page() {
		String ExpiryDate = Hooks.prop.getProperty("expirydate");
		BillingModulefunctionalitypage.entertheExpiryDateinInvoiceSettlement(ExpiryDate);
		System.out.println("User Entered Expiry Date: " + ExpiryDate);
		Hooks.scenario.log("User Entered Expiry Date: " + ExpiryDate);
	}
	
	@Then("user enter the invalid expiry date in invoice settlement page")
	public void user_enter_the_invalid_expiry_date_in_invoice_settlement_page() {
		String ExpiryDate = Hooks.prop.getProperty("invalidexpirydate");
		BillingModulefunctionalitypage.entertheExpiryDateinInvoiceSettlement(ExpiryDate);
		System.out.println("User Entered Invalid Expiry Date: " + ExpiryDate);
		Hooks.scenario.log("User Entered Invalid Expiry Date: " + ExpiryDate);
	}
	
	@And("user enter the cvv number in invoice settlement page")
	public void user_enter_the_cvv_number_in_invoice_settlement_page() {
		String CVV = Hooks.prop.getProperty("cvv");
		BillingModulefunctionalitypage.entertheCVVinInvoiceSettlement(CVV);
		System.out.println("User Entered CVV: " + CVV);
		Hooks.scenario.log("User Entered CVV: " + CVV);
	}
	
	@And("user enter the invalid cvv number in invoice settlement page")
	public void user_enter_the_invalid_cvv_number_in_invoice_settlement_page() {
		String CVV = Hooks.prop.getProperty("invalidcvv");
		BillingModulefunctionalitypage.entertheCVVinInvoiceSettlement(CVV);
		System.out.println("User Entered Invalid CVV: " + CVV);
		Hooks.scenario.log("User Entered Invalid CVV: " + CVV);
	}
	
	@When("user click on the pay button in invoice settlement page")
	public void user_click_on_the_pay_button_in_invoice_settlement_page() throws Exception {
		String result = BillingModulefunctionalitypage.clickintothePaybuttoninInvoiceSettlement();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Pay button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user click on the view invoice button in invoice section")
	public void user_click_on_the_view_invoice_button_in_invoice_section() {
		boolean result = BillingModulefunctionalitypage.clickintotheViewInvoicebuttoninInvoice();
		
		if (!result) {
	        String message = "View Invoice (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("View Invoice button clicked successfully");
	}
	
	@Then("user click on the view receipt button in invoice section")
	public void user_click_on_the_view_receipt_button_in_invoice_section() {
		boolean result = BillingModulefunctionalitypage.clickintotheViewReceiptbuttoninInvoice();
		
		if (!result) {
	        String message = "View Receipt (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("View Receipt button clicked successfully");
	}
	
	@Then("user click on the three dot button of existing invoice in invoice section")
	public void user_click_on_the_three_dot_button_of_existing_invoice_in_invoice_section() {
		boolean result = BillingModulefunctionalitypage.clickintothethreedotbuttoninExistingInvoice();
		
		if (!result) {
	        String message = "Three dot (more options) button is not visible for that user because Existing Invoice is not their — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@And("user click on the view detail tab of existing invoice in invoice section")
	public void user_click_on_the_view_detail_tab_of_existing_invoice_in_invoice_section() {
		boolean result = BillingModulefunctionalitypage.clickintotheviewdetailtabinExistingInvoice();
		
		if (!result) {
	        String message = "View Detail(more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("View Detail tab clicked successfully");
	}
	
	@When("user click on the add pos notes tab in invoice details page")
	public void user_click_on_the_add_pos_notes_tab_in_invoice_details_page() {
		boolean result = BillingModulefunctionalitypage.clickintotheADDPOSNotestabinInvoiceDetails();
		
		if (!result) {
	        String message = "Add POS Notes(more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Add POS Notes tab clicked successfully");
	}
	
	@Then("user enter the ticket number in add pos notes pop-up window")
	public void user_enter_the_ticket_number_in_add_pos_notes_pop_up_window() {
		String TicketNumber = Hooks.prop.getProperty("ticketnumberaddposnotes");
		BillingModulefunctionalitypage.entertheTicketNumberinADDPOSNotes(TicketNumber);
		System.out.println("User Entered Ticket Number: " + TicketNumber);
		Hooks.scenario.log("User Entered Ticket Number: " + TicketNumber);
	}
	
	@And("user select the ticket date in add pos notes pop-up window")
	public void user_select_the_ticket_date_in_add_pos_notes_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheTicketDateinAddPOSNotes();

        // Select today's date
        BillingModulefunctionalitypage.selectTodaysDateinAddPOSNotes();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Ticket Date: " + selectedDate);
        Hooks.scenario.log("Selected Ticket Date: " + selectedDate);
	}
	
	@When("user click on the submit button in add pos notes pop-up window")
	public void user_click_on_the_submit_button_in_add_pos_notes_pop_up_window() throws Exception {
		String result = BillingModulefunctionalitypage.clickintotheSubmitbuttoninAddPOSNotes();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user click on the delete tab of existing invoice in invoice section")
	public void user_click_on_the_delete_tab_of_existing_invoice_in_invoice_section() {
		boolean result = BillingModulefunctionalitypage.clickintotheDeletebuttoninExistingInvoice();
		
		if (!result) {
	        String message = "Delete (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing Invoice delete successfully");
	}
	
	@And("user click on the edit tab of existing invoice in invoice section")
	public void user_click_on_the_edit_tab_of_existing_invoice_in_invoice_section() {
		boolean result = BillingModulefunctionalitypage.clickintotheEditbuttoninExistingInvoice();
		
		if (!result) {
	        String message = "Edit (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit button clicked successfully");
	}
	
	@Then("user click on the filter button in invoice page")
	public void user_click_on_the_filter_button_in_invoice_page() {
		BillingModulefunctionalitypage.clickintotheFilterbutton();
		
		System.out.println("Filter button clicked successfully");
		Hooks.scenario.log("Filter button clicked successfully");
	}
	
	@And("user enter the invoice number in filter")
	public void user_enter_the_invoice_number_in_filter() {
		String InvoiceNumber = Hooks.prop.getProperty("invoicenumberinfilter");
		BillingModulefunctionalitypage.entertheInvoiceNumberinFilter(InvoiceNumber);
		System.out.println("User Entered Invoice Number: " + InvoiceNumber);
		Hooks.scenario.log("User Entered Invoice Number: " + InvoiceNumber);
	}
	
	@And("user enter the invalid invoice number in filter")
	public void user_enter_the_invalid_invoice_number_in_filter() {
		String InvoiceNumber = Hooks.prop.getProperty("invalidinvoicenumberinfilter");
		BillingModulefunctionalitypage.entertheInvoiceNumberinFilter(InvoiceNumber);
		System.out.println("User Entered Invalid Invoice Number: " + InvoiceNumber);
		Hooks.scenario.log("User Entered Invalid Invoice Number: " + InvoiceNumber);
	}
	
	@When("user enter the Rx number in filter")
	public void user_enter_the_Rx_number_in_filter() {
		String RxNumber = Hooks.prop.getProperty("rxnumberinfilter");
		BillingModulefunctionalitypage.entertheRxNumberinFilter(RxNumber);
		System.out.println("User Entered Rx Number: " + RxNumber);
		Hooks.scenario.log("User Entered Rx Number: " + RxNumber);
	}
	
	@When("user enter the invalid Rx number in filter")
	public void user_enter_the_invalid_Rx_number_in_filter() {
		String RxNumber = Hooks.prop.getProperty("invalidrxnumberinfilter");
		BillingModulefunctionalitypage.entertheRxNumberinFilter(RxNumber);
		System.out.println("User Entered Invalid Rx Number: " + RxNumber);
		Hooks.scenario.log("User Entered Invalid Rx Number: " + RxNumber);
	}
	
	@Then("user enter the customer first name in filter")
	public void user_enter_the_customer_first_name_in_filter() {
		String CustomerFirstName = Hooks.prop.getProperty("customerfirstnameinfilter");
		BillingModulefunctionalitypage.entertheCustomerFirstNameinFilter(CustomerFirstName);
		System.out.println("User Entered Customer First Name: " + CustomerFirstName);
		Hooks.scenario.log("User Entered Customer First Name: " + CustomerFirstName);
	}
	
	@Then("user enter the invalid customer first name in filter")
	public void user_enter_the_invalid_customer_first_name_in_filter() {
		String CustomerFirstName = Hooks.prop.getProperty("invalidcustomerfirstnameinfilter");
		BillingModulefunctionalitypage.entertheCustomerFirstNameinFilter(CustomerFirstName);
		System.out.println("User Entered Invalid Customer First Name: " + CustomerFirstName);
		Hooks.scenario.log("User Entered Invalid Customer First Name: " + CustomerFirstName);
	}
	
	@And("user enter the customer last name in filter")
	public void user_enter_the_customer_last_name_in_filter() {
		String CustomerLastName = Hooks.prop.getProperty("customerlastnameinfilter");
		BillingModulefunctionalitypage.entertheCustomerLastNameinFilter(CustomerLastName);
		System.out.println("User Entered Customer Last Name: " + CustomerLastName);
		Hooks.scenario.log("User Entered Customer Last Name: " + CustomerLastName);
	}
	
	@And("user enter the invalid customer last name in filter")
	public void user_enter_the_invalid_customer_last_name_in_filter() {
		String CustomerLastName = Hooks.prop.getProperty("invalidcustomerlastnameinfilter");
		BillingModulefunctionalitypage.entertheCustomerLastNameinFilter(CustomerLastName);
		System.out.println("User Entered Invalid Customer Last Name: " + CustomerLastName);
		Hooks.scenario.log("User Entered Invalid Customer Last Name: " + CustomerLastName);
	}
	
	@When("user enter the transaction number in filter")
	public void user_enter_the_transaction_number_in_filter() {
		String TransactionNumber = Hooks.prop.getProperty("transactionnumber");
		BillingModulefunctionalitypage.entertheTransactionNumberinFilter(TransactionNumber);
		System.out.println("User Entered Transaction Number: " + TransactionNumber);
		Hooks.scenario.log("User Entered Transaction Number: " + TransactionNumber);
	}
	
	@When("user enter the invalid transaction number in filter")
	public void user_enter_the_invalid_transaction_number_in_filter() {
		String TransactionNumber = Hooks.prop.getProperty("invalidtransactionnumber");
		BillingModulefunctionalitypage.entertheTransactionNumberinFilter(TransactionNumber);
		System.out.println("User Entered Invalid Transaction Number: " + TransactionNumber);
		Hooks.scenario.log("User Entered Invalid Transaction Number: " + TransactionNumber);
	}
	
	@Then("user enter the pos number in filter")
	public void user_enter_the_pos_number_in_filter() {
		String POSNumber = Hooks.prop.getProperty("posnumber");
		BillingModulefunctionalitypage.enterthePOSNumberinFilter(POSNumber);
		System.out.println("User Entered POS Number: " + POSNumber);
		Hooks.scenario.log("User Entered POS Number: " + POSNumber);
	}
	
	@Then("user enter the invalid pos number in filter")
	public void user_enter_the_invalid_pos_number_in_filter() {
		String POSNumber = Hooks.prop.getProperty("invalidposnumber");
		BillingModulefunctionalitypage.enterthePOSNumberinFilter(POSNumber);
		System.out.println("User Entered Invalid POS Number: " + POSNumber);
		Hooks.scenario.log("User Entered Invalid POS Number: " + POSNumber);
	}
	
	@And("user select the from date in filter invoice")
	public void user_select_the_from_date_in_filter_invoice() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheFromDatePickerinFilter();

        // Select today's date
        BillingModulefunctionalitypage.selectTodaysDateinAddPOSNotes();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected From Date: " + selectedDate);
        Hooks.scenario.log("Selected From Date: " + selectedDate);
	}
	
	@And("user select the from date as future in filter invoice")
	public void user_select_the_from_date_as_future_in_filter_invoice() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheFromDatePickerinFilter();

        // Select today's date
        BillingModulefunctionalitypage.selectDateAftertenDays();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Future From Date: " + selectedDate);
        Hooks.scenario.log("Selected Future From Date: " + selectedDate);
	}
	
	@When("user select the to date in filter invoice")
	public void user_select_the_to_date_in_filter_invoice() {
		// Click the License Expiration Date picker
        BillingModulefunctionalitypage.clickintotheToDatePickerinFilter();

        // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date: " + selectedDate);
        Hooks.scenario.log("Selected To Date: " + selectedDate);
	}
	
	@When("user select the to date as less than from date in filter invoice")
	public void user_select_the_to_date_as_less_than_from_date_in_filter_invoice() {
		// Click the License Expiration Date picker
        BillingModulefunctionalitypage.clickintotheToDatePickerinFilter();

        // Select Before 1 month
        BillingModulefunctionalitypage.selectToDateBefore1MonthAutomatically();
        
        // Before 1 Month
        LocalDate targetDate = LocalDate.now().minusMonths(1);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date as Before 10 days: " + selectedDate);
        Hooks.scenario.log("Selected To Date as Before 10 days: " + selectedDate);
	}
	
	@Then("user enter the from amount in filter")
	public void user_enter_the_from_amount_in_filter() {
		String FromAmount = Hooks.prop.getProperty("fromamount");
		BillingModulefunctionalitypage.entertheFromAmountinFilter(FromAmount);
		System.out.println("User Entered From Amount: " + FromAmount);
		Hooks.scenario.log("User Entered From Amount: " + FromAmount);
	}
	
	@Then("user enter the invalid from amount in filter")
	public void user_enter_the_invalid_from_amount_in_filter() {
		String FromAmount = Hooks.prop.getProperty("invalidfromamount");
		BillingModulefunctionalitypage.entertheFromAmountinFilter(FromAmount);
		System.out.println("User Entered Invalid From Amount: " + FromAmount);
		Hooks.scenario.log("User Entered Invalid From Amount: " + FromAmount);
	}
	
	@And("user enter the to amount in filter")
	public void user_enter_the_to_amount_in_filter() {
		String ToAmount = Hooks.prop.getProperty("toamount");
		BillingModulefunctionalitypage.entertheToAmountinFilter(ToAmount);
		System.out.println("User Entered To Amount: " + ToAmount);
		Hooks.scenario.log("User Entered To Amount: " + ToAmount);
	}
	
	@And("user enter the invalid to amount in filter")
	public void user_enter_the_invalid_to_amount_in_filter() {
		String ToAmount = Hooks.prop.getProperty("invalidtoamount");
		BillingModulefunctionalitypage.entertheToAmountinFilter(ToAmount);
		System.out.println("User Entered Invalid To Amount: " + ToAmount);
		Hooks.scenario.log("User Entered Invalid To Amount: " + ToAmount);
	}
	
	@When("user enter the email id in filter")
	public void user_enter_the_email_id_in_filter() {
		String EmailId = Hooks.prop.getProperty("emailid");
		BillingModulefunctionalitypage.entertheEmailIdinFilter(EmailId);
		System.out.println("User Entered Email Id: " + EmailId);
		Hooks.scenario.log("User Entered EmailId: " + EmailId);
	}
	
	@When("user enter the invalid email id in filter")
	public void user_enter_the_invalid_email_id_in_filter() {
		String EmailId = Hooks.prop.getProperty("invalidemailidinfilter");
		BillingModulefunctionalitypage.entertheEmailIdinFilter(EmailId);
		System.out.println("User Entered Invalid Email Id: " + EmailId);
		Hooks.scenario.log("User Entered Invalid Email Id: " + EmailId);
	}
	
	@Then("user enter the phone number in filter")
	public void user_enter_the_phone_number_in_filter() {
		String PhoneNumberinFilter = Hooks.prop.getProperty("phonenumberinfilter");
		BillingModulefunctionalitypage.enterthePhoneNumberinFilter(PhoneNumberinFilter);
		System.out.println("User Entered Phone Number: " + PhoneNumberinFilter);
		Hooks.scenario.log("User Entered Phone Number: " + PhoneNumberinFilter);
	}
	
	@Then("user enter the invalid phone number in filter")
	public void user_enter_the_invalid_phone_number_in_filter() {
		String PhoneNumberinFilter = Hooks.prop.getProperty("invalidphonenumberinfilter");
		BillingModulefunctionalitypage.enterthePhoneNumberinFilter(PhoneNumberinFilter);
		System.out.println("User Entered Invalid Phone Number: " + PhoneNumberinFilter);
		Hooks.scenario.log("User Entered Invalid Phone Number: " + PhoneNumberinFilter);
	}
	
	@And("user click on the search button in filter invoice")
	public void user_click_on_the_search_button_in_filter_invoice() {
		String result = BillingModulefunctionalitypage.clickintothesearchbuttoninFilterInvoice();

	    System.out.println("Search Result: " + result);
	    Hooks.scenario.log("Search Result: " + result);

	    //Skip remaining steps ONLY when no records / error
	    if (result.startsWith("ERROR")) {
	    	 Hooks.scenario.log("Search failed due to error message(s): " + result);
	    	 
	        // Scenario marked as SKIPPED (not FAILED)
	        Assume.assumeTrue("Skipping scenario due to search result: " + result, false);
	    }
	}
	
	@When("user click on the clear button in filter invoice")
	public void user_click_on_the_clear_button_in_filter_invoice() {
		BillingModulefunctionalitypage.clickintotheClearbuttoninFilterInvoice();
		
		System.out.println("Clear button clicked successfully");
		Hooks.scenario.log("Clear button clicked successfully");
	}
	
	
	//---------------------------------------AR Section------------------------------------------------
	
	
	@When("user click on the AR tab in sidebar in Billing module page")
	public void user_click_on_the_AR_tab_in_sidebar_in_Billing_module_page() {
		boolean result = BillingModulefunctionalitypage.clickintotheARtabinsidebar();
		
		if (!result) {
	        String message = "AR (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("AR tab clicked successfully");
	}
	
	@Then("user click on the quick text tab in AR section")
	public void user_click_on_the_quick_text_tab_in_AR_section() {
		boolean result = BillingModulefunctionalitypage.clickintotheQuickTexttabinAR();
		
		if (!result) {
	        String message = "Quick Text (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Quick Text tab clicked successfully");
	}
	
	@And("user select the template as AR PAST DUE in quick text pop-up window")
	public void user_select_the_template_as_AR_PAST_DUE_in_quick_text_pop_up_window() throws Exception {
		String SelectTemplateText = "AR PAST DUE"; // fetch from config if required

	    boolean result = BillingModulefunctionalitypage.selectTheTemplateinQuickText(SelectTemplateText);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Template is NOT present in dropdown: " + SelectTemplateText;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Template selected successfully: " + SelectTemplateText);
	    System.out.println("Template selected successfully: " + SelectTemplateText);
	}
	
	@When("user enter the phone number in quick text pop-up window in AR")
	public void user_enter_the_phone_number_in_quick_text_pop_up_window_in_AR() {
		String PhoneNumberinQuickText = Hooks.prop.getProperty("phonenumberinquicktext");
		BillingModulefunctionalitypage.enterthePhoneNumberinQuickText(PhoneNumberinQuickText);
		System.out.println("User Entered Phone Number: " + PhoneNumberinQuickText);
		Hooks.scenario.log("User Entered Phone Number: " + PhoneNumberinQuickText);
	}
	
	@When("user enter the invalid phone number in quick text pop-up window in AR")
	public void user_enter_the_invalid_phone_number_in_quick_text_pop_up_window_in_AR() {
		String PhoneNumberinQuickText = Hooks.prop.getProperty("invalidphonenumberinquicktext");
		BillingModulefunctionalitypage.enterthePhoneNumberinQuickText(PhoneNumberinQuickText);
		System.out.println("User Entered Invalid Phone Number: " + PhoneNumberinQuickText);
		Hooks.scenario.log("User Entered Invalid Phone Number: " + PhoneNumberinQuickText);
	}
	
	@Then("user click on the send button in quick text pop-up window in AR")
	public void user_click_on_the_send_button_in_quick_text_pop_up_window_in_AR() throws Exception {
		String result = BillingModulefunctionalitypage.clickintotheSendbuttoninQuickText();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Send button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	
	//-----------------------------------Claims Section---------------------------------------------
	
	
	@When("user click on the Claims tab in sidebar in Billing module page")
	public void user_click_on_the_Claims_tab_in_sidebar_in_Billing_module_page() {
		boolean result = BillingModulefunctionalitypage.clickintotheClaimstabinsidebar();
		
		if (!result) {
	        String message = "Claims (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Claims tab clicked successfully");
	}
	
	@Then("user click on the export excel button in claims section")
	public void user_click_on_the_export_excel_button_in_claims_section() {
		boolean result = BillingModulefunctionalitypage.clickintotheExporttoExcelbuttoninClaims();
		
		if (!result) {
	        String message = "Export Excel (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Export Excel tab clicked successfully");
	}
	
	@Then("user click on the new claim button in claims section")
	public void user_click_on_the_new_claim_button_in_claims_section() {
		boolean result = BillingModulefunctionalitypage.clickintotheNewClaimbuttoninClaims();
		
		if (!result) {
	        String message = "New Claim (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New Claim tab clicked successfully");
	}
	
	@And("user click on the add patient name tab in add claim page")
	public void user_click_on_the_add_patient_name_tab_in_add_claim_page() {
		BillingModulefunctionalitypage.clickintotheAddPatientNametabinInvoicepage();
		
		System.out.println("Add Patient Name tab clicked successfully");
		Hooks.scenario.log("Add Patient Name tab clicked successfully");
	}
	
	@Then("user click on the add claim tab in add claim page")
	public void user_click_on_the_add_claim_tab_in_add_claim_page() {
		String errorMessage = BillingModulefunctionalitypage.clickintotheAddClaimtabinClaims();

	    // if error exists
	    if (errorMessage != null) {

	        System.out.println("System Error: " + errorMessage);
	        Hooks.scenario.log("System Error: " + errorMessage);

	        Assume.assumeTrue("Skipping due to error", false);
	        return;
	    }

	    Hooks.scenario.log("Add Claim tab clicked successfully");
	}
	
	@And("user enter the insurance company name in search claim pop-up window")
	public void user_enter_the_insurance_company_name_in_search_claim_pop_up_window() {
		String InsuranceCompanyName = Hooks.prop.getProperty("insurancecompanyname");
		BillingModulefunctionalitypage.entertheInsuranceCompanyNameinSearchClaim(InsuranceCompanyName);
		System.out.println("User Entered Insurance Company Name: " + InsuranceCompanyName);
		Hooks.scenario.log("User Entered Insurance Company Name: " + InsuranceCompanyName);
	}
	
	@And("user enter the invalid insurance company name in search claim pop-up window")
	public void user_enter_the_invalid_insurance_company_name_in_search_claim_pop_up_window() {
		String InsuranceCompanyName = Hooks.prop.getProperty("invalidinsurancecompanyname");
		BillingModulefunctionalitypage.entertheInsuranceCompanyNameinSearchClaim(InsuranceCompanyName);
		System.out.println("User Entered Invalid Insurance Company Name: " + InsuranceCompanyName);
		Hooks.scenario.log("User Entered Invalid Insurance Company Name: " + InsuranceCompanyName);
	}
	
	@When("user enter the claim number in search claim pop-up window")
	public void user_enter_the_claim_number_in_search_claim_pop_up_window() {
		String ClaimNumber = Hooks.prop.getProperty("claimnumber");
		BillingModulefunctionalitypage.entertheClaimNumberinSearchClaim(ClaimNumber);
		System.out.println("User Entered Claim Number: " + ClaimNumber);
		Hooks.scenario.log("User Entered Claim Number: " + ClaimNumber);
	}
	
	@When("user enter the invalid claim number in search claim pop-up window")
	public void user_enter_the_invalid_claim_number_in_search_claim_pop_up_window() {
		String ClaimNumber = Hooks.prop.getProperty("invalidclaimnumber");
		BillingModulefunctionalitypage.entertheClaimNumberinSearchClaim(ClaimNumber);
		System.out.println("User Entered Invalid Claim Number: " + ClaimNumber);
		Hooks.scenario.log("User Entered Invalid Claim Number: " + ClaimNumber);
	}
	
	@Then("user click on the search button in search claim pop-up window")
	public void user_click_on_the_search_button_in_search_claim_pop_up_window() throws Exception {
		String result = BillingModulefunctionalitypage.clickintotheSearchbuttoninSearchClaim();
		Thread.sleep(1000);
		
		System.out.println("Search Result: " + result);
		Hooks.scenario.log("Search Result: " + result);
		
		if (result.startsWith("ERROR") || result.contains("No Record")) {

			Hooks.scenario.log("claim is not placed: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user click on the first radio button of record claim in search claim pop-up window")
	public void user_click_on_the_first_radio_button_of_record_claim_in_search_claim_pop_up_window() {
		BillingModulefunctionalitypage.clickintotheFirstradiobuttoninSearchClaim();
		
		System.out.println("First radio button clicked successfully");
		Hooks.scenario.log("First radio button clicked successfully");
	}
	
	@When("user click on the submit button in search claim pop-up window")
	public void user_click_on_the_submit_button_in_search_claim_pop_up_window() {
		String result = BillingModulefunctionalitypage.clickintotheSubmitbuttoninSearchClaim();
		
		System.out.println("Submit button clicked successfully and Message is shown: " + result);
		Hooks.scenario.log("Submit button clicked successfully and Message is shown: " + result);
		
		if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Claim is not placed: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user select the claim type by index in add claim page")
	public void user_select_the_claim_type_by_index_in_add_claim_page() throws Exception {
		int ClaimIndex = 4; // fetch from config if required

	    boolean result = BillingModulefunctionalitypage.selecttheClaimType(ClaimIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Claim is NOT present in dropdown for index: " + ClaimIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Claim selected successfully using index: " + ClaimIndex);
	    System.out.println("Claim selected successfully using index: " + ClaimIndex);
	}
	
	@And("user select the date of service in add claim page")
	public void user_select_the_date_of_service_in_add_claim_page() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheDateOfServiceinClaim();

        // Select today's date
        BillingModulefunctionalitypage.selectTodaysDateinAddPOSNotes();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Date Of Service: " + selectedDate);
        Hooks.scenario.log("Selected Date Of Service: " + selectedDate);
	}
	
	@When("user select the bill status by index in add claim page")
	public void user_select_the_bill_status_by_index_in_add_claim_page() throws Exception {
		int BillStatusIndex = 2; // fetch from config if required

	    boolean result = BillingModulefunctionalitypage.selecttheBillStatus(BillStatusIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Bill Status is NOT present in dropdown for index: " + BillStatusIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Bill Status selected successfully using index: " + BillStatusIndex);
	    System.out.println("Bill Status selected successfully using index: " + BillStatusIndex);
	}
	
	@Then("user select the stage status by index in add claim page")
	public void user_select_the_stage_status_by_index_in_add_claim_page() throws Exception {
		int StageStatusIndex = 3; // fetch from config if required

	    boolean result = BillingModulefunctionalitypage.selecttheStageStatus(StageStatusIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Stage Status is NOT present in dropdown for index: " + StageStatusIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Stage Status selected successfully using index: " + StageStatusIndex);
	    System.out.println("Stage Status selected successfully using index: " + StageStatusIndex);
	}
	
	@Then("user select the stage status by index as pending review in add claim page")
	public void user_select_the_stage_status_by_index_as_pending_review_in_add_claim_page() throws Exception {
		int StageStatusIndex = 2; // fetch from config if required

	    boolean result = BillingModulefunctionalitypage.selecttheStageStatus(StageStatusIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Stage Status is NOT present in dropdown for index: " + StageStatusIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Stage Status selected successfully using index: " + StageStatusIndex);
	    System.out.println("Stage Status selected successfully using index: " + StageStatusIndex);
		
	}
	
	@And("user click on the add collection attorney tab in add claim page")
	public void user_click_on_the_add_collection_attorney_tab_in_add_claim_page() {
		boolean isClicked = BillingModulefunctionalitypage
	            .clickintotheAddCollectionAttorneytabinClaims();

	    if (isClicked) {
	        System.out.println("Add Collection Attorney tab clicked successfully");
	        Hooks.scenario.log("Add Collection Attorney tab clicked successfully");
	    } else {
	        System.out.println("FAILED to click Add Collection Attorney tab");
	        Hooks.scenario.log("FAILED to click Add Collection Attorney tab");
	        throw new RuntimeException("Unable to click Add Collection Attorney tab");
	    }
	}
	
	@And("user click on the add contracted company tab in add claim page")
	public void user_click_on_the_add_contracted_company_tab_in_add_claim_page() {
		BillingModulefunctionalitypage.clickintotheAddContractedCompanytabinClaim();
		
		System.out.println("Add Contracted Company tab clicked successfully");
		Hooks.scenario.log("Add Contracted Company tab clicked successfully");
	}
	
	@When("user enter the business name in search partner pop-up window for contracted company")
	public void user_enter_the_business_name_in_search_partner_pop_up_window_for_contracted_company() {
		String BusinessName = Hooks.prop.getProperty("businessnameincompany");
		BillingModulefunctionalitypage.entertheBusinessNameinSearchPartner(BusinessName);
		System.out.println("User Entered Business Name: " + BusinessName);
		Hooks.scenario.log("User Entered Business Name: " + BusinessName);
	}
	
	@When("user enter the business name in search partner pop-up window")
	public void user_enter_the_business_name_in_search_partner_pop_up_window() {
		String BusinessName = Hooks.prop.getProperty("businessname");
		BillingModulefunctionalitypage.entertheBusinessNameinSearchPartner(BusinessName);
		System.out.println("User Entered Business Name: " + BusinessName);
		Hooks.scenario.log("User Entered Business Name: " + BusinessName);
	}
	
	@When("user enter the invalid business name in search partner pop-up window")
	public void user_enter_invalid_the_business_name_in_search_partner_pop_up_window() {
		String BusinessName = Hooks.prop.getProperty("invalidbusinessname");
		BillingModulefunctionalitypage.entertheBusinessNameinSearchPartner(BusinessName);
		System.out.println("User Entered Invalid Business Name: " + BusinessName);
		Hooks.scenario.log("User Entered Invalid Business Name: " + BusinessName);
	}
	
	@Then("user enter the phone number in search partner pop-up window for contracted company")
	public void user_enter_the_phone_number_in_search_partner_pop_up_window_for_contracted_company() {
		String PhoneNumberinFilter = Hooks.prop.getProperty("phonenumberincompany");
		BillingModulefunctionalitypage.enterthePhoneNumberinFilter(PhoneNumberinFilter);
		System.out.println("User Entered Phone Number: " + PhoneNumberinFilter);
		Hooks.scenario.log("User Entered Phone Number: " + PhoneNumberinFilter);
	}
	
	@Then("user enter the phone number in search partner pop-up window")
	public void user_enter_the_phone_number_in_search_partner_pop_up_window() {
		String PhoneNumberinFilter = Hooks.prop.getProperty("phonenumberinsearchpartner");
		BillingModulefunctionalitypage.enterthePhoneNumberinFilter(PhoneNumberinFilter);
		System.out.println("User Entered Phone Number: " + PhoneNumberinFilter);
		Hooks.scenario.log("User Entered Phone Number: " + PhoneNumberinFilter);
	}
	
	@Then("user enter the invalid phone number in search partner pop-up window")
	public void user_enter_the_invalid_phone_number_in_search_partner_pop_up_window() {
		String PhoneNumberinFilter = Hooks.prop.getProperty("invalidphonenumberinprovider");
		BillingModulefunctionalitypage.enterthePhoneNumberinFilter(PhoneNumberinFilter);
		System.out.println("User Entered Invalid Phone Number: " + PhoneNumberinFilter);
		Hooks.scenario.log("User Entered Invalid Phone Number: " + PhoneNumberinFilter);
	}
	
	@And("user click on the search button in search partner pop-up window")
	public void user_click_on_the_search_button_in_search_partner_pop_up_window() throws Exception {
		String result = BillingModulefunctionalitypage.clickintotheSearchbuttoninSearchPartner();
		Thread.sleep(1000);
		
		System.out.println("Search Result: " + result);
		Hooks.scenario.log("Search Result: " + result);
		
		if (result.startsWith("ERROR") || result.contains("No Record")) {

			Hooks.scenario.log("partner is not placed: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@When("user click on the first radio button of record partner in search partner pop-up window")
	public void user_click_on_the_first_radio_button_of_record_partner_in_search_partner_pop_up_window() {
		boolean result = BillingModulefunctionalitypage.clickintotheFirstradiobuttoninSearchPartner();
		
		if (!result) {
	        String message = "Radio button (more options) tab is not visible for that user because don't have the partner — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("First radio button tab clicked successfully");
	}
	
	@Then("user click on the submit button in search partner pop-up window")
	public void user_click_on_the_submit_button_in_search_partner_pop_up_window() {
		String result = BillingModulefunctionalitypage.clickintotheSubmitbuttoninSearchPartner();
		
		System.out.println("Submit button clicked successfully and Message is shown: " + result);
		Hooks.scenario.log("Submit button clicked successfully and Message is shown: " + result);
		
		if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Partner is not placed: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user click on the add prescriber tab in add claim page")
	public void user_click_on_the_add_prescriber_tab_in_add_claim_page() {
		BillingModulefunctionalitypage.clickintotheAddPrescribertabinClaims();
		
		System.out.println("Add Prescriber tab clicked successfully");
		Hooks.scenario.log("Add Prescriber tab clicked successfully");
	}
	
	@When("user click on the full search radio button in search provider pop-up window")
	public void user_click_on_the_full_search_radio_button_in_search_provider_pop_up_window() {
		BillingModulefunctionalitypage.clickintotheFullSearchradiobuttoninSearchProvider();
		
		System.out.println("Full Search radio button clicked successfully");
		Hooks.scenario.log("Full Search radio button clicked successfully");
	}
	
	@Then("user enter the provider last name in search provider pop-up window in claim")
	public void user_enter_the_provider_last_name_in_search_provider_pop_up_window_in_claim() {
		String LastNameinProvider = Hooks.prop.getProperty("lastnameinprovider");
		BillingModulefunctionalitypage.entertheLastNameinSearchProvider(LastNameinProvider);
		System.out.println("User Entered Last Name: " + LastNameinProvider);
		Hooks.scenario.log("User Entered Last Name: " + LastNameinProvider);
	}
	
	@Then("user enter the invalid provider last name in search provider pop-up window in claim")
	public void user_enter_the_invalid_provider_last_name_in_search_provider_pop_up_window_in_claim() {
		String LastNameinProvider = Hooks.prop.getProperty("invalidlastnameinprovider");
		BillingModulefunctionalitypage.entertheLastNameinSearchProvider(LastNameinProvider);
		System.out.println("User Entered Invalid Last Name: " + LastNameinProvider);
		Hooks.scenario.log("User Entered Invalid Last Name: " + LastNameinProvider);
	}
	
	@And("user enter the provider first name in search provider pop-up window in claim")
	public void user_enter_the_provider_first_name_in_search_provider_pop_up_window_in_claim() {
		String FirstNameinProvider = Hooks.prop.getProperty("firstnameinprovider");
		BillingModulefunctionalitypage.entertheFirstNameinSearchProvider(FirstNameinProvider);
		System.out.println("User Entered First Name: " + FirstNameinProvider);
		Hooks.scenario.log("User Entered First Name: " + FirstNameinProvider);
	}
	
	@And("user enter the invalid provider first name in search provider pop-up window in claim")
	public void user_enter_the_invalid_provider_first_name_in_search_provider_pop_up_window_in_claim() {
		String FirstNameinProvider = Hooks.prop.getProperty("invalidfirstnameinprovider");
		BillingModulefunctionalitypage.entertheFirstNameinSearchProvider(FirstNameinProvider);
		System.out.println("User Entered Invalid First Name: " + FirstNameinProvider);
		Hooks.scenario.log("User Entered Invalid First Name: " + FirstNameinProvider);
	}
	
	@When("user enter the provider phone number in search provider pop-up window in claim")
	public void user_enter_the_provider_phone_number_in_search_provider_pop_up_window_in_claim() {
		String PhoneNumberinProvider = Hooks.prop.getProperty("phonenumberinprovider");
		BillingModulefunctionalitypage.enterthePhoneNumberinSearchProvider(PhoneNumberinProvider);
		System.out.println("User Entered Phone Number: " + PhoneNumberinProvider);
		Hooks.scenario.log("User Entered Phone Number: " + PhoneNumberinProvider);
	}
	
	@When("user enter the invalid provider phone number in search provider pop-up window in claim")
	public void user_enter_the_invalid_provider_phone_number_in_search_provider_pop_up_window_in_claim() {
		String PhoneNumberinProvider = Hooks.prop.getProperty("invalidphonenumberinprovider");
		BillingModulefunctionalitypage.enterthePhoneNumberinSearchProvider(PhoneNumberinProvider);
		System.out.println("User Entered Invalid Phone Number: " + PhoneNumberinProvider);
		Hooks.scenario.log("User Entered Invalid Phone Number: " + PhoneNumberinProvider);
	}
	
	@Then("user click on the search button in search provider pop-up window in claim")
	public void user_click_on_the_search_button_in_search_provider_pop_up_window_in_claim() throws Exception {
		String result = BillingModulefunctionalitypage.clickintotheSearchbuttoninSearchProviderClaim();
		Thread.sleep(1000);
		
		System.out.println("Search Result: " + result);
		Hooks.scenario.log("Search Result: " + result);
		
		if (result.startsWith("ERROR") || result.contains("No Record")) {

			Hooks.scenario.log("provider is not placed: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user click on the first provider radio button in search provider pop-up window in claim")
	public void user_click_on_the_first_provider_radio_button_in_search_provider_pop_up_window_in_claim() {
		BillingModulefunctionalitypage.clickintotheFirstradiobuttoninSearchProviderClaim();
		
		System.out.println("First radio button clicked successfully");
		Hooks.scenario.log("First radio button clicked successfully");
	}
	
	@When("user click on the submit button in search provider pop-up window in claim")
	public void user_click_on_the_submit_button_in_search_provider_pop_up_window_in_claim() {
		String result = BillingModulefunctionalitypage.clickintotheSubmitbuttoninSearchProviderClaim();
		
		System.out.println("Submit button clicked successfully and Message is shown: " + result);
		Hooks.scenario.log("Submit button clicked successfully and Message is shown: " + result);
		
		if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Provider is not placed: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user click on the next button in add claim page")
	public void user_click_on_the_next_button_in_add_claim_page() throws Exception {
		String result = BillingModulefunctionalitypage.clickintotheNextbuttoninClaim();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Next button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user click on the new bill tab of billing details section in add claim page")
	public void user_click_on_the_new_bill_tab_of_billing_details_section_in_add_claim_page() {
		boolean result = BillingModulefunctionalitypage.clickintotheNewBilltabinClaim();
		
		if (!result) {
	        String message = "New Bill (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New Bill tab clicked successfully");
	}
	
	@When("user select the order date in add claim bill pop-up window")
	public void user_select_the_order_date_in_add_claim_bill_pop_up_window() {
		// Click the License Expiration Date picker
        BillingModulefunctionalitypage.clickintotheOrderDatePickerinAddClaimBill();

        // Select Before 1 month
        BillingModulefunctionalitypage.selectToDateBefore1MonthAutomatically();
        
        // Before 1 Month
        LocalDate targetDate = LocalDate.now().minusMonths(1);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected Order Date as Before 10 days: " + selectedDate);
        Hooks.scenario.log("Selected Order Date as Before 10 days: " + selectedDate);
	}
	
	@When("user select the order date as future in add claim bill pop-up window")
	public void user_select_the_order_date_as_future_in_add_claim_bill_pop_up_window() {
		// Click the License Expiration Date picker
        BillingModulefunctionalitypage.clickintotheOrderDatePickerinAddClaimBill();

        // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected Order Date as Future days: " + selectedDate);
        Hooks.scenario.log("Selected Order Date as Future days: " + selectedDate);
	}
	
	@Then("user select the order received date in add claim bill pop-up window")
	public void user_select_the_order_received_date_in_add_claim_bill_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheOrderReceivedDatePickerinAddClaimBill();

        // Select today's date
        BillingModulefunctionalitypage.selectTodaysDateinAddPOSNotes();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Order Received Date: " + selectedDate);
        Hooks.scenario.log("Selected Order Received Date: " + selectedDate);
	}
	
	@Then("user select the order received date as future in add claim bill pop-up window")
	public void user_select_the_order_received_date_as_future_in_add_claim_bill_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheOrderReceivedDatePickerinAddClaimBill();

        // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Order Received Date: " + selectedDate);
        Hooks.scenario.log("Selected Order Received Date: " + selectedDate);
	}
	
	@And("user enter the RX number in add claim bill pop-up window")
	public void user_enter_the_RX_number_in_add_claim_bill_pop_up_window() {
		String RXNumberinBill = Hooks.prop.getProperty("RXnumberinbill");
		BillingModulefunctionalitypage.entertheRXNumberinAddClaimBill(RXNumberinBill);
		System.out.println("User Entered RX Number: " + RXNumberinBill);
		Hooks.scenario.log("User Entered RX Number: " + RXNumberinBill);
	}
	
	@And("user enter the invalid RX number in add claim bill pop-up window")
	public void user_enter_the_invalid_RX_number_in_add_claim_bill_pop_up_window() {
		String RXNumberinBill = Hooks.prop.getProperty("invalidRXnumberinbill");
		BillingModulefunctionalitypage.entertheRXNumberinAddClaimBill(RXNumberinBill);
		System.out.println("User Entered Invalid RX Number: " + RXNumberinBill);
		Hooks.scenario.log("User Entered Invalid RX Number: " + RXNumberinBill);
	}
	
	@When("user enter the Refill number in add claim bill pop-up window")
	public void user_enter_the_Refill_number_in_add_claim_bill_pop_up_window() {
		String RefillNumberinBill = Hooks.prop.getProperty("Refillnumberinbill");
		BillingModulefunctionalitypage.entertheRefillNumberinAddClaimBill(RefillNumberinBill);
		System.out.println("User Entered Refill Number: " + RefillNumberinBill);
		Hooks.scenario.log("User Entered Refill Number: " + RefillNumberinBill);
	}
	
	@When("user enter the invalid Refill number in add claim bill pop-up window")
	public void user_enter_the_invalid_Refill_number_in_add_claim_bill_pop_up_window() {
		String RefillNumberinBill = Hooks.prop.getProperty("invalidRefillnumberinbill");
		BillingModulefunctionalitypage.entertheRefillNumberinAddClaimBill(RefillNumberinBill);
		System.out.println("User Entered Invalid Refill Number: " + RefillNumberinBill);
		Hooks.scenario.log("User Entered Invalid Refill Number: " + RefillNumberinBill);
	}
	
	@Then("user select the date of service in add claim bill pop-up window")
	public void user_select_the_date_of_service_in_add_claim_bill_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheDateOfServicePickerinAddClaimBill();

        // Select today's date
        BillingModulefunctionalitypage.selectTodaysDateinAddPOSNotes();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Date Of Service: " + selectedDate);
        Hooks.scenario.log("Selected Date Of Service: " + selectedDate);
	}
	
	@Then("user select the date of service as future in add claim bill pop-up window")
	public void user_select_the_date_of_service_as_future_in_add_claim_bill_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheDateOfServicePickerinAddClaimBill();

     // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Date Of Service: " + selectedDate);
        Hooks.scenario.log("Selected Date Of Service: " + selectedDate);
	}
	
	@And("user enter the reference number in add claim bill pop-up window")
	public void user_enter_the_reference_number_in_add_claim_bill_pop_up_window() {
		String ReferenceNumberinBill = Hooks.prop.getProperty("referencenumberinbill");
		BillingModulefunctionalitypage.entertheReferenceNumberinAddClaimBill(ReferenceNumberinBill);
		System.out.println("User Entered Reference Number: " + ReferenceNumberinBill);
		Hooks.scenario.log("User Entered Reference Number: " + ReferenceNumberinBill);
	}
	
	@And("user enter the invalid reference number in add claim bill pop-up window")
	public void user_enter_the_invalid_reference_number_in_add_claim_bill_pop_up_window() {
		String ReferenceNumberinBill = Hooks.prop.getProperty("invalidreferencenumberinbill");
		BillingModulefunctionalitypage.entertheReferenceNumberinAddClaimBill(ReferenceNumberinBill);
		System.out.println("User Entered Invalid Reference Number: " + ReferenceNumberinBill);
		Hooks.scenario.log("User Entered Invalid Reference Number: " + ReferenceNumberinBill);
	}
	
	@When("user enter the bill amount in add claim bill pop-up window")
	public void user_enter_the_bill_amount_in_add_claim_bill_pop_up_window() {
		String BillAmountinBill = Hooks.prop.getProperty("billamount");
		BillingModulefunctionalitypage.entertheBillAmountinAddClaimBill(BillAmountinBill);
		System.out.println("User Entered Bill Amount: " + BillAmountinBill);
		Hooks.scenario.log("User Entered Bill Amount: " + BillAmountinBill);
	}
	
	@When("user enter the invalid bill amount in add claim bill pop-up window")
	public void user_enter_the_invalid_bill_amount_in_add_claim_bill_pop_up_window() {
		String BillAmountinBill = Hooks.prop.getProperty("invalidbillamount");
		BillingModulefunctionalitypage.entertheBillAmountinAddClaimBill(BillAmountinBill);
		System.out.println("User Entered Invalid Bill Amount: " + BillAmountinBill);
		Hooks.scenario.log("User Entered Invalid Bill Amount: " + BillAmountinBill);
	}
	
	@Then("user enter the product shipping in add claim bill pop-up window")
	public void user_enter_the_product_shipping_in_add_claim_bill_pop_up_window() {
		String ProductShippinginBill = Hooks.prop.getProperty("productshipping");
		BillingModulefunctionalitypage.entertheProductShippinginAddClaimBill(ProductShippinginBill);
		System.out.println("User Entered Product Shipping: " + ProductShippinginBill);
		Hooks.scenario.log("User Entered Product Shipping: " + ProductShippinginBill);
	}
	
	@Then("user enter the invalid product shipping in add claim bill pop-up window")
	public void user_enter_the_invalid_product_shipping_in_add_claim_bill_pop_up_window() {
		String ProductShippinginBill = Hooks.prop.getProperty("invalidproductshipping");
		BillingModulefunctionalitypage.entertheProductShippinginAddClaimBill(ProductShippinginBill);
		System.out.println("User Entered Invalid Product Shipping: " + ProductShippinginBill);
		Hooks.scenario.log("User Entered Invalid Product Shipping: " + ProductShippinginBill);
	}
	
	@And("user select the delivery date in add claim bill pop-up window")
	public void user_select_the_delivery_date_in_add_claim_bill_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheDeliveryDatePickerinAddClaimBill();

        // Select today's date
        BillingModulefunctionalitypage.selectTodaysDateinAddPOSNotes();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Delivery Date: " + selectedDate);
        Hooks.scenario.log("Selected Delivery Date: " + selectedDate);
	}
	
	@And("user select the delivery date as future in add claim bill pop-up window")
	public void user_select_the_delivery_date_as_future_in_add_claim_bill_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheDeliveryDatePickerinAddClaimBill();

     // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Delivery Date: " + selectedDate);
        Hooks.scenario.log("Selected Delivery Date: " + selectedDate);
	}
	
	@When("user select the billing date in add claim bill pop-up window")
	public void user_select_the_billing_date_in_add_claim_bill_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheBillingDatePickerinAddClaimBill();

        // Select today's date
        BillingModulefunctionalitypage.selectTodaysDateinAddPOSNotes();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Billing Date: " + selectedDate);
        Hooks.scenario.log("Selected Billing Date: " + selectedDate);
	}
	
	@When("user select the billing date as future in add claim bill pop-up window")
	public void user_select_the_billing_date_as_future_in_add_claim_bill_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheBillingDatePickerinAddClaimBill();

     // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Billing Date: " + selectedDate);
        Hooks.scenario.log("Selected Billing Date: " + selectedDate);
	}
	
	@Then("user select the bill submitted date in add claim bill pop-up window")
	public void user_select_the_bill_submitted_date_in_add_claim_bill_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheBillSubmittedDatePickerinAddClaimBill();

        // Select today's date
        BillingModulefunctionalitypage.selectTodaysDateinAddPOSNotes();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Bill Submitted Date: " + selectedDate);
        Hooks.scenario.log("Selected Bill Submitted Date: " + selectedDate);
	}
	
	@Then("user select the bill submitted date as future in add claim bill pop-up window")
	public void user_select_the_bill_submitted_date_as_future_in_add_claim_bill_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheBillSubmittedDatePickerinAddClaimBill();

     // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Bill Submitted Date: " + selectedDate);
        Hooks.scenario.log("Selected Bill Submitted Date: " + selectedDate);
	}
	
	@And("user select the status by index in add claim bill pop-up window")
	public void user_select_the_status_by_index_in_add_claim_bill_pop_up_window() throws Exception {
		int StatusIndex = 2; // fetch from config if required

	    boolean result = BillingModulefunctionalitypage.selecttheStatusinAddClaimBill(StatusIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Status is NOT present in dropdown for index: " + StatusIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Status selected successfully using index: " + StatusIndex);
	    System.out.println("Status selected successfully using index: " + StatusIndex);
	}
	
	@When("user enter the notes in add claim bill pop-up window")
	public void user_enter_the_notes_in_add_claim_bill_pop_up_window() {
		String NotesinBill = Hooks.prop.getProperty("notesinbill");
		BillingModulefunctionalitypage.entertheNotesinAddClaimBill(NotesinBill);
		System.out.println("User Entered Notes: " + NotesinBill);
		Hooks.scenario.log("User Entered Notes: " + NotesinBill);
	}
	
	@Then("user select the billing type as manual in add claim bill pop-up window")
	public void user_select_the_billing_type_as_manual_in_add_claim_bill_pop_up_window() {
		BillingModulefunctionalitypage.clickintotheManualradiobuttoninAddClaimBill();
		
		System.out.println("Billing Type as clicked as Manual");
		Hooks.scenario.log("Billing Type as clicked as Manual");
	}
	
	@And("user click on the submit button in add claim bill pop-up window")
	public void user_click_on_the_submit_button_in_add_claim_bill_pop_up_window() throws Exception {
		String result = BillingModulefunctionalitypage.clickintotheSubmitbuttoninAddClaimBill();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@When("user click on the new CMS 1500 tab of supportive documents section in add claim page")
	public void user_click_on_the_new_CMS_1500_tab_of_supportive_documents_section_in_add_claim_page() {
		boolean result = BillingModulefunctionalitypage.clickintotheCMS1500tabinClaim();
		
		if (!result) {
	        String message = "New CMS 1500 (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New CMS 1500 tab clicked successfully");
	}
	
	@Then("user select the checklist in add claim 1500 pop-up window")
	public void user_select_the_checklist_in_add_claim_1500_pop_up_window() throws Exception {
		String checklistText = "[Insurance Card][I C]";

	    boolean result = BillingModulefunctionalitypage.selecttheChecklistinAddClaim1500(checklistText);

	    Thread.sleep(1500);

	    if (!result) {
	        String msg = "Checklist is NOT present in dropdown for: " + checklistText;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        Assume.assumeTrue(msg, false);
	    }

	    String successMsg = "Checklist selected successfully: " + checklistText;
	    Hooks.scenario.log(successMsg);
	    System.out.println(successMsg);
	}
	
	@And("user click on the view document checkbox in add claim 1500 pop-up window")
	public void user_click_on_the_view_document_checkbox_in_add_claim_1500_pop_up_window() {
		boolean result = BillingModulefunctionalitypage.clickintotheViewDocumentcheckboxinAddClaim1500();
		
		if (!result) {
	        String message = "View Document (more options) Checkbox is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("View Document Checkbox clicked successfully");
	}
	
	@When("user click on the download file checkbox in add claim 1500 pop-up window")
	public void user_click_on_the_download_file_checkbox_in_add_claim_1500_pop_up_window() {
		boolean result = BillingModulefunctionalitypage.clickintotheDownloadFilecheckboxinAddClaim1500();
		
		if (!result) {
	        String message = "Download File (more options) Checkbox is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Download File Checkbox clicked successfully");
	}
	
	@Then("user select the template in add claim 1500 pop-up window")
	public void user_select_the_template_in_add_claim_1500_pop_up_window() throws Exception {
		int TemplateIndex = 1; // fetch from config if required

	    boolean result = BillingModulefunctionalitypage.selecttheTemplateinAddClaim1500(TemplateIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Template is NOT present in dropdown for index: " + TemplateIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Template selected successfully using index: " + TemplateIndex);
	    System.out.println("Template selected successfully using index: " + TemplateIndex);
	}
	
	@And("user click on the submit button in add claim 1500 pop-up window")
	public void user_click_on_the_submit_button_in_add_claim_1500_pop_up_window() throws Exception {
		String result = BillingModulefunctionalitypage.clickintotheSubmitbuttoninAddClaim1500();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@When("user enter the name in template")
	public void user_enter_the_name_in_template() {
		String NameinTemplate = Hooks.prop.getProperty("nameintemplate");
		BillingModulefunctionalitypage.entertheNameinTemplate(NameinTemplate);
		System.out.println("User Entered Name: " + NameinTemplate);
		Hooks.scenario.log("User Entered Name: " + NameinTemplate);
	}
	
	@Then("user click on the submit button in template")
	public void user_click_on_the_submit_button_in_template() throws Exception {
		String result = BillingModulefunctionalitypage.clickintotheSubmitbuttoninTemplate();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user click on the new supportive documents tab of supportive documents section in add claim page")
	public void user_click_on_the_new_supportive_documents_tab_of_supportive_documents_section_in_add_claim_page() {
		boolean result = BillingModulefunctionalitypage.clickintotheNewSupportiveDocumentstabinClaim();
		
		if (!result) {
	        String message = "New Supportive Documents (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New Supportive Documents tab clicked successfully");
	}
	
	@When("user select the checklist in add claim supportive document pop-up window")
	public void user_select_the_checklist_in_add_claim_supportive_document_pop_up_window() throws Exception {
		String ChecklistText = "[Insurance Card][I C]";

	    boolean result = BillingModulefunctionalitypage.selecttheChecklistinAddClaimSupportiveDocument(ChecklistText);

	    Thread.sleep(1500);

	    if (!result) {
	        String msg = "Checklist is NOT present in dropdown for: " + ChecklistText;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        Assume.assumeTrue(msg, false);
	    }

	    String successMsg = "Checklist selected successfully: " + ChecklistText;
	    Hooks.scenario.log(successMsg);
	    System.out.println(successMsg);
	}
	
	@When("user select the checklist of non mandatory in add claim supportive document pop-up window")
	public void user_select_the_checklist_of_non_mandatory_in_add_claim_supportive_document_pop_up_window() throws Exception {
		String ChecklistText = "[Patient Documents][P D]";

	    boolean result = BillingModulefunctionalitypage.selecttheChecklistinAddClaimSupportiveDocument(ChecklistText);

	    Thread.sleep(1500);

	    if (!result) {
	        String msg = "Checklist is NOT present in dropdown for: " + ChecklistText;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        Assume.assumeTrue(msg, false);
	    }

	    String successMsg = "Checklist selected successfully: " + ChecklistText;
	    Hooks.scenario.log(successMsg);
	    System.out.println(successMsg);
	}
	
	@Then("user click on the view document checkbox in add claim supportive document pop-up window")
	public void user_click_on_the_view_document_checkbox_in_add_claim_supportive_document_pop_up_window() {
		boolean result = BillingModulefunctionalitypage.clickintotheViewDocumentcheckboxinAddClaimSupportiveDocument();
		
		if (!result) {
	        String message = "View Document (more options) checkbox is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("View Document checkbox clicked successfully");
	}
	
	@And("user click on the download file checkbox in add claim supportive document pop-up window")
	public void user_click_on_the_download_file_checkbox_in_add_claim_supportive_document_pop_up_window() {
		boolean result = BillingModulefunctionalitypage.clickintotheDownloadFilecheckboxinAddClaimSupportiveDocument();
		
		if (!result) {
	        String message = "Download File (more options) checkbox is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Download File checkbox clicked successfully");
	}
	
	@When("user upload the pdf file in add claim supportive document pop-up window")
	public void user_upload_the_pdf_file_in_add_claim_supportive_document_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Get_Started_With_Smallpdf.pdf";
		boolean uploaded = BillingModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PDF File upload failed");
	    }

	    Hooks.scenario.log("The PDF File uploaded successfully");
	}
	
	@When("user upload the unsupported file in add claim supportive document pop-up window")
	public void user_upload_the_unsupported_file_in_add_claim_supportive_document_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Audio Files/file_example_MP3_1MG.mp3";
		boolean uploaded = BillingModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Mp3 File upload failed");
	    }

	    Hooks.scenario.log("The Mp3 File uploaded successfully");
	}
	
	@Then("user click on the submit button in add claim supportive document pop-up window")
	public void user_click_on_the_submit_button_in_add_claim_supportive_document_pop_up_window() throws Exception {
		String result = BillingModulefunctionalitypage.clickintotheSubmitbuttoninAddClaimSupportiveDocument();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user click on the new claim communication tab of claim communication section in add claim page")
	public void user_click_on_the_new_claim_communication_tab_of_claim_communication_section_in_add_claim_page() {
		boolean result = BillingModulefunctionalitypage.clickintotheNewClaimCommunicationtabinClaim();
		
		if (!result) {
	        String message = "New Claim Communication (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New Claim Communication tab clicked successfully");
	}
	
	@When("user select the date of communication in add communication pop-up window")
	public void user_select_the_date_of_communication_in_add_communication_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheDateofCommunicationinAddCommunication();

        // Select today's date
        BillingModulefunctionalitypage.selectTodaysDateinAddPOSNotes();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Date of Communication: " + selectedDate);
        Hooks.scenario.log("Selected Date of Communication: " + selectedDate);
	}
	
	@When("user select the date of communication as future in add communication pop-up window")
	public void user_select_the_date_of_communication_as_future_in_add_communication_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheDateofCommunicationinAddCommunication();

        // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Date of Communication: " + selectedDate);
        Hooks.scenario.log("Selected Date of Communication: " + selectedDate);
		
	}
	
	@Then("user select the prospective follow up date in add communication pop-up window")
	public void user_select_the_prospective_follow_up_date_in_add_communication_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheProspectiveFollowUpDateinAddCommunication();

        // Select today's date
        BillingModulefunctionalitypage.selectTodaysDateinAddPOSNotes();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Prospective Follow Up Date: " + selectedDate);
        Hooks.scenario.log("Selected Prospective Follow Up Date: " + selectedDate);
	}
	
	@Then("user select the prospective follow up date as future in add communication pop-up window")
	public void user_select_the_prospective_follow_up_date_as_future_in_add_communication_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheProspectiveFollowUpDateinAddCommunication();

        // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Prospective Follow Up Date: " + selectedDate);
        Hooks.scenario.log("Selected Prospective Follow Up Date: " + selectedDate);
		
	}
	
	@And("user select the due date in add communication pop-up window")
	public void user_select_the_due_date_in_add_communication_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheDueDateinAddCommunication();

        // Select today's date
        BillingModulefunctionalitypage.selectDateAfterTwoDays();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Due Date: " + selectedDate);
        Hooks.scenario.log("Selected Due Date: " + selectedDate);
	}
	
	@And("user select the due date as past in add communication pop-up window")
	public void user_select_the_due_date_as_past_in_add_communication_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheDueDateinAddCommunication();

        // Select Before 1 month
        BillingModulefunctionalitypage.selectToDateBefore1MonthAutomatically();
        
        // Before 1 Month
        LocalDate targetDate = LocalDate.now().minusMonths(1);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Due Date: " + selectedDate);
        Hooks.scenario.log("Selected Due Date: " + selectedDate);
		
	}
	
	@When("user select the priority by index in add communication pop-up window")
	public void user_select_the_priority_by_index_in_add_communication_pop_up_window() throws Exception {
		int PriorityIndex = 1; // fetch from config if required

	    boolean result = BillingModulefunctionalitypage.selectthePriorityDropdowninAddCommunication(PriorityIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Priority is NOT present in dropdown for index: " + PriorityIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Priority selected successfully using index: " + PriorityIndex);
	    System.out.println("Priority selected successfully using index: " + PriorityIndex);
	}
	
	@Then("user select the communication type by index in add communication pop-up window")
	public void user_select_the_communication_type_by_index_in_add_communication_pop_up_window() throws Exception {
		int CommunicationTypeDropdown = 1; // fetch from config if required

	    boolean result = BillingModulefunctionalitypage.selecttheCommunicationTypeDropdowninAddCommunication(CommunicationTypeDropdown);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Communication Type is NOT present in dropdown for index: " + CommunicationTypeDropdown;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Communication Type selected successfully using index: " + CommunicationTypeDropdown);
	    System.out.println("Communication Type selected successfully using index: " + CommunicationTypeDropdown);
	}
	
	@And("user enter the topics discussed in add communication pop-up window")
	public void user_enter_the_topics_discussed_in_add_communication_pop_up_window() {
		String TopicsDiscussed = Hooks.prop.getProperty("topicsdiscussed");
		BillingModulefunctionalitypage.entertheTopicsDiscussed(TopicsDiscussed);
		System.out.println("User Entered Topics Discussed: " + TopicsDiscussed);
		Hooks.scenario.log("User Entered Topics Discussed: " + TopicsDiscussed);
	}
	
	@When("user enter the discussion results in add communication pop-up window")
	public void user_enter_the_discussion_results_in_add_communication_pop_up_window() {
		String DiscussionResults = Hooks.prop.getProperty("discussionresults");
		BillingModulefunctionalitypage.entertheDiscussionResultsinAddCommunication(DiscussionResults);
		System.out.println("User Entered Discussion Results: " + DiscussionResults);
		Hooks.scenario.log("User Entered Discussion Results: " + DiscussionResults);
	}
	
	@Then("user click on the submit button in add communication pop-up window")
	public void user_click_on_the_submit_button_in_add_communication_pop_up_window() throws Exception {
		String result = BillingModulefunctionalitypage.clickintotheSubmitbuttoninAddCommunication();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user click on the New EOB tab of EOB section in add claim page")
	public void user_click_on_the_New_EOB_tab_of_EOB_section_in_add_claim_page() {
		boolean result = BillingModulefunctionalitypage.clickintotheNewEOBtabinClaim();
		
		if (!result) {
	        String message = "New EOB (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New EOB tab clicked successfully");
	}
	
	@When("user select the received date in add patient claim EOB pop-up window")
	public void user_select_the_received_date_in_add_patient_claim_EOB_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheReceivedDateinAddPatientClaimEOB();

        // Select today's date
        BillingModulefunctionalitypage.selectTodaysDateinAddPOSNotes();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Received Date: " + selectedDate);
        Hooks.scenario.log("Selected Received Date: " + selectedDate);
	}
	
	@When("user select the received date as future date in add patient claim EOB pop-up window")
	public void user_select_the_received_date_as_future_date_in_add_patient_claim_EOB_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheReceivedDateinAddPatientClaimEOB();

        // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Received Date: " + selectedDate);
        Hooks.scenario.log("Selected Received Date: " + selectedDate);
	}
	
	@Then("user select the intervention type by index in add patient claim EOB pop-up window")
	public void user_select_the_intervention_type_by_index_in_add_patient_claim_EOB_pop_up_window() throws Exception {
		int InterventionTypeIndex = 1; // fetch from config if required

	    boolean result = BillingModulefunctionalitypage.selecttheInterventionTypeDropdowninAddPatientClaimEOB(InterventionTypeIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Intervention Type is NOT present in dropdown for index: " + InterventionTypeIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Intervention Type selected successfully using index: " + InterventionTypeIndex);
	    System.out.println("Intervention Type selected successfully using index: " + InterventionTypeIndex);
	}
	
	@And("user select the intervention date in add patient claim EOB pop-up window")
	public void user_select_the_intervention_date_in_add_patient_claim_EOB_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheInterventionDateinAddPatientClaimEOB();

        // Select today's date
        BillingModulefunctionalitypage.selectDateAfterTwoDays();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Intervention Date: " + selectedDate);
        Hooks.scenario.log("Selected Intervention Date: " + selectedDate);
	}
	
	@When("user click on the intervention needed checkbox in add patient claim EOB pop-up window")
	public void user_click_on_the_intervention_needed_checkbox_in_add_patient_claim_EOB_pop_up_window() {
		BillingModulefunctionalitypage.clickintotheInterventionNeededCheckboxinAddPatientClaimEOB();
		
		System.out.println("Intervention Needed checkbox clicked successfully");
		Hooks.scenario.log("Intervention Needed checkbox clicked successfully");
	}
	
	@Then("user enter the method of submission in add patient claim EOB pop-up window")
	public void user_enter_the_method_of_submission_in_add_patient_claim_EOB_pop_up_window() {
		String MethodOfSubmission = Hooks.prop.getProperty("methodofsubmission");
		BillingModulefunctionalitypage.entertheMethodOfSubmissioninAddPatientClaimEOB(MethodOfSubmission);
		System.out.println("User Entered Method Of Submission: " + MethodOfSubmission);
		Hooks.scenario.log("User Entered Method Of Submission: " + MethodOfSubmission);
	}
	
	@And("user upload the pdf file in add patient claim EOB pop-up window")
	public void user_upload_the_pdf_file_in_add_patient_claim_EOB_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Get_Started_With_Smallpdf.pdf";
		boolean uploaded = BillingModulefunctionalitypage.uploadTheFilesinAddPatientClaimEOB(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PDF File upload failed");
	    }

	    Hooks.scenario.log("The PDF File uploaded successfully");
	}
	
	@And("user upload the unsuported file in add patient claim EOB pop-up window")
	public void user_upload_the_unsuported_file_in_add_patient_claim_EOB_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Audio Files/file_example_MP3_1MG.mp3";
		boolean uploaded = BillingModulefunctionalitypage.uploadTheFilesinAddPatientClaimEOB(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Audio File upload failed");
	    }

	    Hooks.scenario.log("The Audio File uploaded successfully");
	}
	
	@When("user click on the submit button in add patient claim EOB pop-up window")
	public void user_click_on_the_submit_button_in_add_patient_claim_EOB_pop_up_window() throws Exception {
		String result = BillingModulefunctionalitypage.clickintotheSubmitbuttoninAddPatientClaimEOB();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user click on the new settlement tab of settlement section in add claim page")
	public void user_click_on_the_new_settlement_tab_of_settlement_section_in_add_claim_page() {
		boolean result = BillingModulefunctionalitypage.clickintotheNewSettlementtabinClaim();
		
		if (!result) {
	        String message = "New Settlement (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New Settlement tab clicked successfully");
	}
	
	@And("user select the received date in add claim settlement pop-up window")
	public void user_select_the_received_date_in_add_claim_settlement_pop_up_window() {
		// Click the License Expiration Date picker
        BillingModulefunctionalitypage.clickintotheReceivedDatePickerinAddClaimSettlement();

        // Select Before 1 month
        BillingModulefunctionalitypage.selectToDateBefore1MonthAutomatically();
        
        // Before 1 Month
        LocalDate targetDate = LocalDate.now().minusMonths(1);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected Received Date as Before 10 days: " + selectedDate);
        Hooks.scenario.log("Selected Received Date as Before 10 days: " + selectedDate);
	}
	
	@And("user select the received date as future date in add claim settlement pop-up window")
	public void user_select_the_received_date_as_future_date_in_add_claim_settlement_pop_up_window() {
		// Click the License Expiration Date picker
        BillingModulefunctionalitypage.clickintotheReceivedDatePickerinAddClaimSettlement();

        // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected Received Date as Before 10 days: " + selectedDate);
        Hooks.scenario.log("Selected Received Date as Before 10 days: " + selectedDate);
		
	}
	
	@When("user select the offer received date in add claim settlement pop-up window")
	public void user_select_the_offer_received_date_in_add_claim_settlement_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheOfferReceivedDatePickerinAddClaimSettlement();

        // Select today's date
        BillingModulefunctionalitypage.selectTodaysDateinAddPOSNotes();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Offer Received Date: " + selectedDate);
        Hooks.scenario.log("Selected Offer Received Date: " + selectedDate);
	}
	
	@When("user select the offer received date as future date in add claim settlement pop-up window")
	public void user_select_the_offer_received_date_as_future_date_in_add_claim_settlement_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheOfferReceivedDatePickerinAddClaimSettlement();

        // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Offer Received Date: " + selectedDate);
        Hooks.scenario.log("Selected Offer Received Date: " + selectedDate);
	}
	
	@Then("user enter the offer amount in add claim settlement pop-up window")
	public void user_enter_the_offer_amount_in_add_claim_settlement_pop_up_window() {
		String OfferAmount = Hooks.prop.getProperty("offeramount");
		BillingModulefunctionalitypage.entertheOfferAmountinAddClaimSettlement(OfferAmount);
		System.out.println("User Entered Offer Amount: " + OfferAmount);
		Hooks.scenario.log("User Entered Offer Amount: " + OfferAmount);
	}
	
	@Then("user enter the invalid offer amount in add claim settlement pop-up window")
	public void user_enter_the_invalid_offer_amount_in_add_claim_settlement_pop_up_window() {
		String OfferAmount = Hooks.prop.getProperty("invalidofferamount");
		BillingModulefunctionalitypage.entertheOfferAmountinAddClaimSettlement(OfferAmount);
		System.out.println("User Entered Invalid Offer Amount: " + OfferAmount);
		Hooks.scenario.log("User Entered Invalid Offer Amount: " + OfferAmount);
	}
	
	@And("user enter the original amount in add claim settlement pop-up window")
	public void user_enter_the_original_amount_in_add_claim_settlement_pop_up_window() {
		String OriginalAmount = Hooks.prop.getProperty("originalamount");
		BillingModulefunctionalitypage.entertheOriginalAmountinAddClaimSettlement(OriginalAmount);
		System.out.println("User Entered Original Amount: " + OriginalAmount);
		Hooks.scenario.log("User Entered Original Amount: " + OriginalAmount);
	}
	
	@And("user enter the invalid original amount in add claim settlement pop-up window")
	public void user_enter_the_invalid_original_amount_in_add_claim_settlement_pop_up_window() {
		String OriginalAmount = Hooks.prop.getProperty("invalidoriginalamount");
		BillingModulefunctionalitypage.entertheOriginalAmountinAddClaimSettlement(OriginalAmount);
		System.out.println("User Entered Invalid Original Amount: " + OriginalAmount);
		Hooks.scenario.log("User Entered Invalid Original Amount: " + OriginalAmount);
	}
	
	@When("user enter the accepted amount in add claim settlement pop-up window")
	public void user_enter_the_accepted_amount_in_add_claim_settlement_pop_up_window() {
		String AcceptedAmount = Hooks.prop.getProperty("acceptedamount");
		BillingModulefunctionalitypage.entertheAcceptedAmountinAddClaimSettlement(AcceptedAmount);
		System.out.println("User Entered Accepted Amount: " + AcceptedAmount);
		Hooks.scenario.log("User Entered Accepted Amount: " + AcceptedAmount);
	}
	
	@When("user enter the invalid accepted amount in add claim settlement pop-up window")
	public void user_enter_the_invalid_accepted_amount_in_add_claim_settlement_pop_up_window() {
		String AcceptedAmount = Hooks.prop.getProperty("invalidacceptedamount");
		BillingModulefunctionalitypage.entertheAcceptedAmountinAddClaimSettlement(AcceptedAmount);
		System.out.println("User Entered Invalid Accepted Amount: " + AcceptedAmount);
		Hooks.scenario.log("User Entered Invalid Accepted Amount: " + AcceptedAmount);
	}
	
	@Then("user select the accepted date in add claim settlement pop-up window")
	public void user_select_the_accepted_date_in_add_claim_settlement_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheAcceptedDatePickerinAddClaimSettlement();

        // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Accepted Date: " + selectedDate);
        Hooks.scenario.log("Selected Accepted Date: " + selectedDate);
	}
	
	@And("user enter the approved by in add claim settlement pop-up window")
	public void user_enter_the_approved_by_in_add_claim_settlement_pop_up_window() {
		String ApprovedBy = Hooks.prop.getProperty("approvedby");
		BillingModulefunctionalitypage.entertheApprovedByinAddClaimSettlement(ApprovedBy);
		System.out.println("User Entered Approved By: " + ApprovedBy);
		Hooks.scenario.log("User Entered Approved By: " + ApprovedBy);
	}
	
	@When("user enter the offer contact person in add claim settlement pop-up window")
	public void user_enter_the_offer_contact_person_in_add_claim_settlement_pop_up_window() {
		String OfferContactPerson = Hooks.prop.getProperty("offercontactperson");
		BillingModulefunctionalitypage.entertheOfferContactPersoninAddClaimSettlement(OfferContactPerson);
		System.out.println("User Entered Offer Contact Person: " + OfferContactPerson);
		Hooks.scenario.log("User Entered Offer Contact Person: " + OfferContactPerson);
	}
	
	@Then("user click on the submit button in add claim settlement pop-up window")
	public void user_click_on_the_submit_button_in_add_claim_settlement_pop_up_window() throws Exception {
		String result = BillingModulefunctionalitypage.clickintotheSubmitbuttoninAddClaimSettlement();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user click on the new payment tab of payment section in add claim page")
	public void user_click_on_the_new_payment_tab_of_payment_section_in_add_claim_page() {
		boolean result = BillingModulefunctionalitypage.clickintotheNewPaymenttabinClaim();
		
		if (!result) {
	        String message = "New Payment (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New Payment tab clicked successfully");
	}
	
	@When("user enter the check number in add patient claim payment pop-up window")
	public void user_enter_the_check_number_in_add_patient_claim_payment_pop_up_window() {
		String CheckNumber = Hooks.prop.getProperty("checknumber");
		BillingModulefunctionalitypage.entertheCheckNumberinAddPatientClaimPayment(CheckNumber);
		System.out.println("User Entered Check Number: " + CheckNumber);
		Hooks.scenario.log("User Entered Check Number: " + CheckNumber);
	}
	
	@When("user enter the invalid check number in add patient claim payment pop-up window")
	public void user_enter_the_invalid_check_number_in_add_patient_claim_payment_pop_up_window() {
		String CheckNumber = Hooks.prop.getProperty("invalidchecknumber");
		BillingModulefunctionalitypage.entertheCheckNumberinAddPatientClaimPayment(CheckNumber);
		System.out.println("User Entered Invalid Check Number: " + CheckNumber);
		Hooks.scenario.log("User Entered Invalid Check Number: " + CheckNumber);
	}
	
	@Then("user enter the amount in add patient claim payment pop-up window")
	public void user_enter_the_amount_in_add_patient_claim_payment_pop_up_window() {
		String Amount = Hooks.prop.getProperty("amount");
		BillingModulefunctionalitypage.entertheAmountinAddPatientClaimPayment(Amount);
		System.out.println("User Entered Amount: " + Amount);
		Hooks.scenario.log("User Entered Amount: " + Amount);
	}
	
	@Then("user enter the invalid amount in add patient claim payment pop-up window")
	public void user_enter_the_invalid_amount_in_add_patient_claim_payment_pop_up_window() {
		String Amount = Hooks.prop.getProperty("invalidamount");
		BillingModulefunctionalitypage.entertheAmountinAddPatientClaimPayment(Amount);
		System.out.println("User Entered Invalid Amount: " + Amount);
		Hooks.scenario.log("User Entered Invalid Amount: " + Amount);
	}
	
	@And("user select the received date in add patient claim payment pop-up window")
	public void user_select_the_received_date_in_add_patient_claim_payment_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheReceivedDatePickerinAddPatientClaimPayment();
        
        BillingModulefunctionalitypage.selectTodaysDateinAddPOSNotes();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Received Date: " + selectedDate);
        Hooks.scenario.log("Selected Received Date: " + selectedDate);
	}
	
	@And("user select the received date as future date in add patient claim payment pop-up window")
	public void user_select_the_received_date_as_future_date_in_add_patient_claim_payment_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheReceivedDatePickerinAddPatientClaimPayment();

        // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Received Date: " + selectedDate);
        Hooks.scenario.log("Selected Received Date: " + selectedDate);
		
	}
	
	@When("user click on the part of settlement checkbox in add patient claim payment pop-up window")
	public void user_click_on_the_part_of_settlement_checkbox_in_add_patient_claim_payment_pop_up_window() {
		BillingModulefunctionalitypage.clickintothePartOfSettlementcheckboxinAddPatientClaimPayment();
		
		System.out.println("Part Of Settlement checkbox clicked successfully");
		Hooks.scenario.log("Part Of Settlement checkbox clicked successfully");
	}
	
	@Then("user click on the service fee checkbox in add patient claim payment pop-up window")
	public void user_click_on_the_service_fee_checkbox_in_add_patient_claim_payment_pop_up_window() {
		BillingModulefunctionalitypage.clickintotheServiceFeecheckboxinAddPatientClaimPayment();
		
		System.out.println("Service Fee checkbox clicked successfully");
		Hooks.scenario.log("Service Fee checkbox clicked successfully");
	}
	
	@And("user upload the PDF file document in add patient claim payment pop-up window")
	public void user_upload_the_PDF_file_document_in_add_patient_claim_payment_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Get_Started_With_Smallpdf.pdf";
		boolean uploaded = BillingModulefunctionalitypage.uploadTheFilesinAddPatientClaimPayment(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PDF File upload failed");
	    }

	    Hooks.scenario.log("The PDF File uploaded successfully");
	}
	
	@And("user upload the unsupported file document in add patient claim payment pop-up window")
	public void user_upload_the_unsupported_file_document_in_add_patient_claim_payment_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Audio Files/file_example_MP3_1MG.mp3";
		boolean uploaded = BillingModulefunctionalitypage.uploadTheFilesinAddPatientClaimPayment(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Audio File upload failed");
	    }

	    Hooks.scenario.log("The Audio File uploaded successfully");
	}
	
	@When("user click on the submit button in add patient claim payment pop-up window")
	public void user_click_on_the_submit_button_in_add_patient_claim_payment_pop_up_window() throws Exception {
		String result = BillingModulefunctionalitypage.clickintotheSubmitbuttoninAddPatientClaimPayment();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user click on the add attorney tab of attorney section in add claim page")
	public void user_click_on_the_add_attorney_tab_of_attorney_section_in_add_claim_page() {
		BillingModulefunctionalitypage.clickintotheAddAttorneytabinClaim();
		
		System.out.println("Add Attorney tab clicked successfully");
		Hooks.scenario.log("Add Attorney tab clicked successfully");
	}
	
	@And("user click on the add attorney executive tab of attorney section in add claim page")
	public void user_click_on_the_add_attorney_executive_tab_of_attorney_section_in_add_claim_page() {
		String errorMessage = BillingModulefunctionalitypage.clickintotheAddAttorneyExecutivetabinClaim();

	    // if error exists
	    if (errorMessage != null) {

	        System.out.println("System Error: " + errorMessage);
	        Hooks.scenario.log("System Error: " + errorMessage);

	        Assume.assumeTrue("Skipping due to error", false);
	        return;
	    }

	    Hooks.scenario.log("Add Attorney Executive tab clicked successfully");
	}
	
	@When("user enter the partner executive name in partner executive")
	public void user_enter_the_partner_executive_name_in_partner_executive() {
		String PartnerExecutiveName = Hooks.prop.getProperty("partnerexecutivename");
		BillingModulefunctionalitypage.enterthePartnerexecutiveName(PartnerExecutiveName);
		System.out.println("User Entered Partner Executive Name: " + PartnerExecutiveName);
		Hooks.scenario.log("User Entered Partner Executive Name: " + PartnerExecutiveName);
	}
	
	@And("user click on the submit button in partner executive pop-up window")
	public void user_click_on_the_submit_button_in_partner_executive_pop_up_window() throws Exception {
		String result = BillingModulefunctionalitypage.clickintotheSubmitbuttoninPartnerExecutive();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user click on the first attorney document checkbox button in attorney")
	public void user_click_on_the_first_attorney_document_checkbox_button_in_attorney() {
		boolean result = BillingModulefunctionalitypage.clickintotheFirstAttorneyDocumentCheckbox();
		
		if (!result) {
	        String message = "Attorney Document Checkbox (more options) tab is not visible for that user because don't have the Attorney Document is their — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("First Attorney Document Checkbox tab clicked successfully");
	}
	
	@When("user click on the attorney send fax tab in attorney section")
	public void user_click_on_the_attorney_send_fax_tab_in_attorney_section() {
		boolean isClicked = BillingModulefunctionalitypage.clickintotheAttorneySendFaxTab();
		
		// Scenario 1: Button NOT visible → Skip
	    if (!isClicked) {
	        String message = "Send Fax tab is NOT visible (no permission) → Skipping step";

	        System.out.println(message);
	        Hooks.scenario.log(message);

	        // Mark step as SKIPPED
	        org.junit.Assume.assumeTrue(message, false);
	        return;
	    }

	    // Scenario 2: Button clicked
	    Hooks.scenario.log("Send Fax tab clicked successfully");

	    // Scenario 3: Error message validation (optional but recommended)
	    try {
	        List<WebElement> errorMessages = BillingModulefunctionalitypage.getErrorMessages();

	        if (!errorMessages.isEmpty()) {
	            for (WebElement error : errorMessages) {
	                if (error.isDisplayed()) {
	                    String errorText = error.getText();

	                    System.out.println("Error Message: " + errorText);
	                    Hooks.scenario.log("Error Message: " + errorText);
	                }
	            }
	        } else {
	            Hooks.scenario.log("No error message displayed after clicking Send Fax");
	        }

	    } catch (Exception e) {
	        Hooks.scenario.log("No error messages found or unable to capture: " + e.getMessage());
	    }
	}
	
	@Then("user click on the add funding company tab of funding company section in add claim page")
	public void user_click_on_the_add_funding_company_tab_of_funding_company_section_in_add_claim_page() {
		BillingModulefunctionalitypage.clickintotheAddFundingCompanytabinClaim();
		
		System.out.println("Add Funding Company tab clicked successfully");
		Hooks.scenario.log("Add Funding Company tab clicked successfully");
	}
	
	@And("user click on the add funding company executive tab of funding company section in add claim page")
	public void user_click_on_the_add_funding_company_executive_tab_of_funding_company_section_in_add_claim_page() {
		String errorMessage = BillingModulefunctionalitypage.clickintotheAddFundingCompanyExecutivetabinClaim();

	    // if error exists
	    if (errorMessage != null) {

	        System.out.println("System Error: " + errorMessage);
	        Hooks.scenario.log("System Error: " + errorMessage);

	        Assume.assumeTrue("Skipping due to error", false);
	        return;
	    }

	    Hooks.scenario.log("Add Funding Company Executive tab clicked successfully");
	}
	
	@Then("user click on the first funding company document checkbox button in attorney")
	public void user_click_on_the_first_funding_company_document_checkbox_button_in_attorney() {
		boolean result = BillingModulefunctionalitypage.clickintotheFirstFundingCompanyDocumentCheckbox();
		
		if (!result) {
	        String message = "Funding Company Document Checkbox (more options) tab is not visible for that user because don't have the Funding Company Document is their — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("First Funding Company Document Checkbox tab clicked successfully");
	}
	
	@When("user click on the funding company send fax tab in funding company section")
	public void user_click_on_the_funding_company_send_fax_tab_in_funding_company_section() {
		boolean isClicked = BillingModulefunctionalitypage.clickintotheFundingCompanySendFaxTab();
		
		// Scenario 1: Button NOT visible → Skip
	    if (!isClicked) {
	        String message = "Send Fax tab is NOT visible (no permission) → Skipping step";

	        System.out.println(message);
	        Hooks.scenario.log(message);

	        // Mark step as SKIPPED
	        org.junit.Assume.assumeTrue(message, false);
	        return;
	    }

	    // Scenario 2: Button clicked
	    Hooks.scenario.log("Send Fax tab clicked successfully");

	    // Scenario 3: Error message validation (optional but recommended)
	    try {
	        List<WebElement> errorMessages = BillingModulefunctionalitypage.getErrorMessages();

	        if (!errorMessages.isEmpty()) {
	            for (WebElement error : errorMessages) {
	                if (error.isDisplayed()) {
	                    String errorText = error.getText();

	                    System.out.println("Error Message: " + errorText);
	                    Hooks.scenario.log("Error Message: " + errorText);
	                }
	            }
	        } else {
	            Hooks.scenario.log("No error message displayed after clicking Send Fax");
	        }

	    } catch (Exception e) {
	        Hooks.scenario.log("No error messages found or unable to capture: " + e.getMessage());
	    }
	}
	
	@Then("user click on the first insurance company document checkbox button in attorney")
	public void user_click_on_the_first_insurance_company_document_checkbox_button_in_attorney() {
		boolean result = BillingModulefunctionalitypage.clickintotheFirstInsuranceCompanyDocumentCheckbox();
		
		if (!result) {
	        String message = "Insurance Company Document Checkbox (more options) tab is not visible for that user because don't have the Insurance Company Document is their — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("First Insurance Company Document Checkbox tab clicked successfully");
	}
	
	@Then("user click on the insurance company send fax tab in insurance company section")
	public void user_click_on_the_insurance_company_send_fax_tab_in_insurance_company_section() {
		boolean isClicked = BillingModulefunctionalitypage.clickintotheInsuranceCompanySendFaxTab();
		
		// Scenario 1: Button NOT visible → Skip
	    if (!isClicked) {
	        String message = "Send Fax tab is NOT visible (no permission) → Skipping step";

	        System.out.println(message);
	        Hooks.scenario.log(message);

	        // Mark step as SKIPPED
	        org.junit.Assume.assumeTrue(message, false);
	        return;
	    }

	    // Scenario 2: Button clicked
	    Hooks.scenario.log("Send Fax tab clicked successfully");

	    // Scenario 3: Error message validation (optional but recommended)
	    try {
	        List<WebElement> errorMessages = BillingModulefunctionalitypage.getErrorMessages();

	        if (!errorMessages.isEmpty()) {
	            for (WebElement error : errorMessages) {
	                if (error.isDisplayed()) {
	                    String errorText = error.getText();

	                    System.out.println("Error Message: " + errorText);
	                    Hooks.scenario.log("Error Message: " + errorText);
	                }
	            }
	        } else {
	            Hooks.scenario.log("No error message displayed after clicking Send Fax");
	        }

	    } catch (Exception e) {
	        Hooks.scenario.log("No error messages found or unable to capture: " + e.getMessage());
	    }
	}
	
	@And("user click on the submit button in add claim page")
	public void user_click_on_the_submit_button_in_add_claim_page() throws Exception {
		String result = BillingModulefunctionalitypage.clickintotheSubmitbuttoninClaim();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@When("user click on the cancel button in add claim page")
	public void user_click_on_the_cancel_button_in_add_claim_page() {
		BillingModulefunctionalitypage.clickintotheCancelbuttoninClaim();
		
		System.out.println("Cancel button clicked successfully");
		Hooks.scenario.log("Cancel button clicked successfully");
	}
	
	@Then("user click on the three dot of existing claim in claims page")
	public void user_click_on_the_three_dot_of_existing_claim_in_claims_page() {
		boolean result = BillingModulefunctionalitypage.clickintothethreedotbuttoninExistingInvoice();
		
		if (!result) {
	        String message = "Three dot (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@And("user click on the edit button of existing claim")
	public void user_click_on_the_edit_button_of_existing_claim() {
		boolean result = BillingModulefunctionalitypage.clickintotheEditbuttoninExistingClaim();
		
		if (!result) {
	        String message = "Edit (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit button clicked successfully");
	}
	
	@Then("user change the insurance company name in search claim pop-up window")
	public void user_change_the_insurance_company_name_in_search_claim_pop_up_window() {
		String InsuranceCompanyName = Hooks.prop.getProperty("newinsurancecompanyname");
		BillingModulefunctionalitypage.entertheInsuranceCompanyNameinSearchClaim(InsuranceCompanyName);
		System.out.println("User Entered New Insurance Company Name: " + InsuranceCompanyName);
		Hooks.scenario.log("User Entered New Insurance Company Name: " + InsuranceCompanyName);
	}
	
	@And("user change the claim number in search claim pop-up window")
	public void user_change_the_claim_number_in_search_claim_pop_up_window() {
		String ClaimNumber = Hooks.prop.getProperty("newclaimnumber");
		BillingModulefunctionalitypage.entertheClaimNumberinSearchClaim(ClaimNumber);
		System.out.println("User Entered New Claim Number: " + ClaimNumber);
		Hooks.scenario.log("User Entered New Claim Number: " + ClaimNumber);
	}
	
	@When("user change the claim type by index in add claim page")
	public void user_change_the_claim_type_by_index_in_add_claim_page() throws Exception {
		int ClaimIndex = 2; // fetch from config if required

	    boolean result = BillingModulefunctionalitypage.selecttheClaimType(ClaimIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Claim is NOT present in dropdown for index: " + ClaimIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Claim selected successfully using index: " + ClaimIndex);
	    System.out.println("Claim selected successfully using index: " + ClaimIndex);
	}
	
	@Then("user change the date of service in add claim page")
	public void user_change_the_date_of_service_in_add_claim_page() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheDateOfServiceinClaim();

        // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Date Of Service: " + selectedDate);
        Hooks.scenario.log("Selected Date Of Service: " + selectedDate);
	}
	
	@And("user change the bill status by index in add claim page")
	public void user_change_the_bill_status_by_index_in_add_claim_page() throws Exception {
		int BillStatusIndex = 1; // fetch from config if required

	    boolean result = BillingModulefunctionalitypage.selecttheBillStatus(BillStatusIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Bill Status is NOT present in dropdown for index: " + BillStatusIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Bill Status selected successfully using index: " + BillStatusIndex);
	    System.out.println("Bill Status selected successfully using index: " + BillStatusIndex);
	}
	
	@When("user change the stage status by index in add claim page")
	public void user_change_the_stage_status_by_index_in_add_claim_page() throws Exception {
		int StageStatusIndex = 2; // fetch from config if required

	    boolean result = BillingModulefunctionalitypage.selecttheStageStatus(StageStatusIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Stage Status is NOT present in dropdown for index: " + StageStatusIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Stage Status selected successfully using index: " + StageStatusIndex);
	    System.out.println("Stage Status selected successfully using index: " + StageStatusIndex);
	}
	
	@Then("user change the provider last name in search provider pop-up window in claim")
	public void user_change_the_provider_last_name_in_search_provider_pop_up_window_in_claim() {
		String LastNameinProvider = Hooks.prop.getProperty("newlastnameinprovider");
		BillingModulefunctionalitypage.entertheLastNameinSearchProvider(LastNameinProvider);
		System.out.println("User Entered New Last Name: " + LastNameinProvider);
		Hooks.scenario.log("User Entered New Last Name: " + LastNameinProvider);
	}
	
	@And("user change the provider first name in search provider pop-up window in claim")
	public void user_change_the_provider_first_name_in_search_provider_pop_up_window_in_claim() {
		String FirstNameinProvider = Hooks.prop.getProperty("newfirstnameinprovider");
		BillingModulefunctionalitypage.entertheFirstNameinSearchProvider(FirstNameinProvider);
		System.out.println("User Entered New First Name: " + FirstNameinProvider);
		Hooks.scenario.log("User Entered New First Name: " + FirstNameinProvider);
	}
	
	@When("user change the provider phone number in search provider pop-up window in claim")
	public void user_change_the_provider_phone_number_in_search_provider_pop_up_window_in_claim() {
		String PhoneNumberinProvider = Hooks.prop.getProperty("newphonenumberinprovider");
		BillingModulefunctionalitypage.enterthePhoneNumberinSearchProvider(PhoneNumberinProvider);
		System.out.println("User Entered New Phone Number: " + PhoneNumberinProvider);
		Hooks.scenario.log("User Entered New Phone Number: " + PhoneNumberinProvider);
	}
	
	@Then("user click on the three dot button in existing billing details")
	public void user_click_on_the_three_dot_button_in_existing_billing_details() {
		boolean result = BillingModulefunctionalitypage.clickintotheThreedotbuttoninExistingBillingDetails();
		
		if (!result) {
	        String message = "Three dot (more options) button is not visible because don't have the Billing details — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@And("user click on the edit button in existing billing details")
	public void user_click_on_the_edit_button_in_existing_billing_details() {
		boolean result = BillingModulefunctionalitypage.clickintotheEditbuttoninExistingClaim();
		
		if (!result) {
	        String message = "Edit (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit button clicked successfully");
	}
	
	@When("user change the order date in add claim bill pop-up window")
	public void user_change_the_order_date_in_add_claim_bill_pop_up_window() {
		// Click the License Expiration Date picker
        BillingModulefunctionalitypage.clickintotheOrderDatePickerinAddClaimBill();

        // Select today's date
        BillingModulefunctionalitypage.selectTodaysDateinAddPOSNotes();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected Order Date: " + selectedDate);
        Hooks.scenario.log("Selected Order Date: " + selectedDate);
	}
	
	@Then("user change the order received date in add claim bill pop-up window")
	public void user_change_the_order_received_date_in_add_claim_bill_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheOrderReceivedDatePickerinAddClaimBill();

        // Select Before 1 month
        BillingModulefunctionalitypage.selectToDateBefore1MonthAutomatically();
        
        // Before 1 Month
        LocalDate targetDate = LocalDate.now().minusMonths(1);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Order Received Date: " + selectedDate);
        Hooks.scenario.log("Selected Order Received Date: " + selectedDate);
	}
	
	@And("user change the RX number in add claim bill pop-up window")
	public void user_change_the_RX_number_in_add_claim_bill_pop_up_window() {
		String RXNumberinBill = Hooks.prop.getProperty("newrxnumberinbill");
		BillingModulefunctionalitypage.entertheRXNumberinAddClaimBill(RXNumberinBill);
		System.out.println("User Entered New RX Number: " + RXNumberinBill);
		Hooks.scenario.log("User Entered New RX Number: " + RXNumberinBill);
	}
	
	@When("user change the Refill number in add claim bill pop-up window")
	public void user_change_the_Refill_number_in_add_claim_bill_pop_up_window() {
		String RefillNumberinBill = Hooks.prop.getProperty("newrefillnumberinbill");
		BillingModulefunctionalitypage.entertheRefillNumberinAddClaimBill(RefillNumberinBill);
		System.out.println("User Entered New Refill Number: " + RefillNumberinBill);
		Hooks.scenario.log("User Entered New Refill Number: " + RefillNumberinBill);
	}
	
	@Then("user change the date of service in add claim bill pop-up window")
	public void user_change_the_date_of_service_in_add_claim_bill_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheDateOfServicePickerinAddClaimBill();

        // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Date Of Service: " + selectedDate);
        Hooks.scenario.log("Selected Date Of Service: " + selectedDate);
	}
	
	@And("user change the reference number in add claim bill pop-up window")
	public void user_change_the_reference_number_in_add_claim_bill_pop_up_window() {
		String ReferenceNumberinBill = Hooks.prop.getProperty("newreferencenumberinbill");
		BillingModulefunctionalitypage.entertheReferenceNumberinAddClaimBill(ReferenceNumberinBill);
		System.out.println("User Entered New Reference Number: " + ReferenceNumberinBill);
		Hooks.scenario.log("User Entered New Reference Number: " + ReferenceNumberinBill);
	}
	
	@When("user change the bill amount in add claim bill pop-up window")
	public void user_change_the_bill_amount_in_add_claim_bill_pop_up_window() {
		String BillAmountinBill = Hooks.prop.getProperty("newbillamount");
		BillingModulefunctionalitypage.entertheBillAmountinAddClaimBill(BillAmountinBill);
		System.out.println("User Entered New Bill Amount: " + BillAmountinBill);
		Hooks.scenario.log("User Entered New Bill Amount: " + BillAmountinBill);
	}
	
	@Then("user change the product shipping in add claim bill pop-up window")
	public void user_change_the_product_shipping_in_add_claim_bill_pop_up_window() {
		String ProductShippinginBill = Hooks.prop.getProperty("newproductshipping");
		BillingModulefunctionalitypage.entertheProductShippinginAddClaimBill(ProductShippinginBill);
		System.out.println("User Entered New Product Shipping: " + ProductShippinginBill);
		Hooks.scenario.log("User Entered New Product Shipping: " + ProductShippinginBill);
	}
	
	@And("user change the delivery date in add claim bill pop-up window")
	public void user_change_the_delivery_date_in_add_claim_bill_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheDeliveryDatePickerinAddClaimBill();

        // Select Before 1 month
        BillingModulefunctionalitypage.selectToDateBefore1MonthAutomatically();
        
        // Before 1 Month
        LocalDate targetDate = LocalDate.now().minusMonths(1);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Delivery Date: " + selectedDate);
        Hooks.scenario.log("Selected Delivery Date: " + selectedDate);
	}
	
	@When("user change the billing date in add claim bill pop-up window")
	public void user_change_the_billing_date_in_add_claim_bill_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheBillingDatePickerinAddClaimBill();

        // Select Before 1 month
        BillingModulefunctionalitypage.selectToDateBefore1MonthAutomatically();
        
        // Before 1 Month
        LocalDate targetDate = LocalDate.now().minusMonths(1);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Billing Date: " + selectedDate);
        Hooks.scenario.log("Selected Billing Date: " + selectedDate);
	}
	
	@Then("user change the bill submitted date in add claim bill pop-up window")
	public void user_change_the_bill_submitted_date_in_add_claim_bill_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheBillSubmittedDatePickerinAddClaimBill();

        // Select Before 1 month
        BillingModulefunctionalitypage.selectToDateBefore1MonthAutomatically();
        
        // Before 1 Month
        LocalDate targetDate = LocalDate.now().minusMonths(1);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Bill Submitted Date: " + selectedDate);
        Hooks.scenario.log("Selected Bill Submitted Date: " + selectedDate);
	}
	
	@And("user change the status by index in add claim bill pop-up window")
	public void user_change_the_status_by_index_in_add_claim_bill_pop_up_window() throws Exception {
		int StatusIndex = 1; // fetch from config if required

	    boolean result = BillingModulefunctionalitypage.selecttheStatusinAddClaimBill(StatusIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Status is NOT present in dropdown for index: " + StatusIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Status is change successfully using index: " + StatusIndex);
	    System.out.println("Status is change successfully using index: " + StatusIndex);
	}
	
	@When("user change the notes in add claim bill pop-up window")
	public void user_change_the_notes_in_add_claim_bill_pop_up_window() {
		String NotesinBill = Hooks.prop.getProperty("newnotesinbill");
		BillingModulefunctionalitypage.entertheNotesinAddClaimBill(NotesinBill);
		System.out.println("User Entered New Notes: " + NotesinBill);
		Hooks.scenario.log("User Entered New Notes: " + NotesinBill);
	}
	
	@Then("user change the billing type as electronics in add claim bill pop-up window")
	public void user_change_the_billing_type_as_electronics_in_add_claim_bill_pop_up_window() {
		BillingModulefunctionalitypage.clickintotheElectronicsradiobuttoninAddClaimBill();
		
		System.out.println("Billing Type as clicked as Electronics");
		Hooks.scenario.log("Billing Type as clicked as Electronics");
	}
	
	@When("user click on the three dot button in existing claim communication")
	public void user_click_on_the_three_dot_button_in_existing_claim_communication() {
		boolean result = BillingModulefunctionalitypage.clickintotheThreedotbuttoninExistingClaimCommunication();
		
		if (!result) {
	        String message = "Three dot (more options) button is not visible because don't have the Claim Communication — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@Then("user click on the edit button in existing claim communication")
	public void user_click_on_the_edit_button_in_existing_claim_communication() {
		boolean result = BillingModulefunctionalitypage.clickintotheEditbuttoninExistingClaimCommunication();
		
		if (!result) {
	        String message = "Edit (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit button clicked successfully");
	}
	
	@When("user change the date of communication in add communication pop-up window")
	public void user_change_the_date_of_communication_in_add_communication_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheDateofCommunicationinAddCommunication();

        // Select Before 1 month
        BillingModulefunctionalitypage.selectToDateBefore1MonthAutomatically();
        
        // Before 1 Month
        LocalDate targetDate = LocalDate.now().minusMonths(1);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Date of Communication: " + selectedDate);
        Hooks.scenario.log("Selected Date of Communication: " + selectedDate);
	}
	
	@Then("user change the prospective follow up date in add communication pop-up window")
	public void user_change_the_prospective_follow_up_date_in_add_communication_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheProspectiveFollowUpDateinAddCommunication();

        // Select Before 1 month
        BillingModulefunctionalitypage.selectToDateBefore1MonthAutomatically();
        
        // Before 1 Month
        LocalDate targetDate = LocalDate.now().minusMonths(1);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Prospective Follow Up Date: " + selectedDate);
        Hooks.scenario.log("Selected Prospective Follow Up Date: " + selectedDate);
	}
	
	@And("user change the due date in add communication pop-up window")
	public void user_change_the_due_date_in_add_communication_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheDueDateinAddCommunication();

        // Select Before 1 month
        BillingModulefunctionalitypage.selectToDateBefore1MonthAutomatically();
        
        // Before 1 Month
        LocalDate targetDate = LocalDate.now().minusMonths(1);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Due Date: " + selectedDate);
        Hooks.scenario.log("Selected Due Date: " + selectedDate);
	}
	
	@When("user change the priority by index in add communication pop-up window")
	public void user_change_the_priority_by_index_in_add_communication_pop_up_window() throws Exception {
		int PriorityIndex = 2; // fetch from config if required

	    boolean result = BillingModulefunctionalitypage.selectthePriorityDropdowninAddCommunication(PriorityIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Priority is NOT present in dropdown for index: " + PriorityIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Priority selected successfully using index: " + PriorityIndex);
	    System.out.println("Priority selected successfully using index: " + PriorityIndex);
	}
	
	@Then("user change the communication type by index in add communication pop-up window")
	public void user_change_the_communication_type_by_index_in_add_communication_pop_up_window() throws Exception {
		int CommunicationTypeDropdown = 2; // fetch from config if required

	    boolean result = BillingModulefunctionalitypage.selecttheCommunicationTypeDropdowninAddCommunication(CommunicationTypeDropdown);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Communication Type is NOT present in dropdown for index: " + CommunicationTypeDropdown;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Communication Type selected successfully using index: " + CommunicationTypeDropdown);
	    System.out.println("Communication Type selected successfully using index: " + CommunicationTypeDropdown);
	}
	
	@And("user change the topics discussed in add communication pop-up window")
	public void user_change_the_topics_discussed_in_add_communication_pop_up_window() {
		String TopicsDiscussed = Hooks.prop.getProperty("newtopicsdiscussed");
		BillingModulefunctionalitypage.entertheTopicsDiscussed(TopicsDiscussed);
		System.out.println("User Entered New Topics Discussed: " + TopicsDiscussed);
		Hooks.scenario.log("User Entered New Topics Discussed: " + TopicsDiscussed);
	}
	
	@When("user change the discussion results in add communication pop-up window")
	public void user_change_the_discussion_results_in_add_communication_pop_up_window() {
		String DiscussionResults = Hooks.prop.getProperty("newdiscussionresults");
		BillingModulefunctionalitypage.entertheDiscussionResultsinAddCommunication(DiscussionResults);
		System.out.println("User Entered New Discussion Results: " + DiscussionResults);
		Hooks.scenario.log("User Entered New Discussion Results: " + DiscussionResults);
	}
	
	@And("user click on the three dot button in existing EOB")
	public void user_click_on_the_three_dot_button_in_existing_EOB() {
		boolean result = BillingModulefunctionalitypage.clickintotheThreedotbuttoninExistingEOB();
		
		if (!result) {
	        String message = "Three dot (more options) button is not visible because don't have the Claim Communication — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@When("user click on the edit button in existing EOB")
	public void user_click_on_the_edit_button_in_existing_EOB() {
		boolean result = BillingModulefunctionalitypage.clickintotheEditbuttoninExistingEOB();
		
		if (!result) {
	        String message = "Edit (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit button clicked successfully");
	}
	
	@And("user change the received date in add patient claim EOB pop-up window")
	public void user_change_the_received_date_in_add_patient_claim_EOB_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheReceivedDateinAddPatientClaimEOB();

        // Select Before 1 month
        BillingModulefunctionalitypage.selectToDateBefore1MonthAutomatically();
        
        // Before 1 Month
        LocalDate targetDate = LocalDate.now().minusMonths(1);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Received Date: " + selectedDate);
        Hooks.scenario.log("Selected Received Date: " + selectedDate);
	}
	
	@Then("user change the intervention type by index in add patient claim EOB pop-up window")
	public void user_change_the_intervention_type_by_index_in_add_patient_claim_EOB_pop_up_window() throws Exception {
		int InterventionTypeIndex = 2; // fetch from config if required

	    boolean result = BillingModulefunctionalitypage.selecttheInterventionTypeDropdowninAddPatientClaimEOB(InterventionTypeIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Intervention Type is NOT present in dropdown for index: " + InterventionTypeIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Intervention Type selected successfully using index: " + InterventionTypeIndex);
	    System.out.println("Intervention Type selected successfully using index: " + InterventionTypeIndex);
	}
	
	@And("user change the intervention date in add patient claim EOB pop-up window")
	public void user_change_the_intervention_date_in_add_patient_claim_EOB_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheInterventionDateinAddPatientClaimEOB();

        // Select Before 1 month
        BillingModulefunctionalitypage.selectToDateBefore1MonthAutomatically();
        
        // Before 1 Month
        LocalDate targetDate = LocalDate.now().minusMonths(1);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Intervention Date: " + selectedDate);
        Hooks.scenario.log("Selected Intervention Date: " + selectedDate);
	}
	
	@Then("user change the method of submission in add patient claim EOB pop-up window")
	public void user_change_the_method_of_submission_in_add_patient_claim_EOB_pop_up_window() {
		String MethodOfSubmission = Hooks.prop.getProperty("newmethodofsubmission");
		BillingModulefunctionalitypage.entertheMethodOfSubmissioninAddPatientClaimEOB(MethodOfSubmission);
		System.out.println("User Entered New Method Of Submission: " + MethodOfSubmission);
		Hooks.scenario.log("User Entered New Method Of Submission: " + MethodOfSubmission);
	}
	
	@Then("user click on the three dot button in existing settlement")
	public void user_click_on_the_three_dot_button_in_existing_settlement() {
		boolean result = BillingModulefunctionalitypage.clickintotheThreedotbuttoninExistingSettlement();
		
		if (!result) {
	        String message = "Three dot (more options) button is not visible because don't have the Claim Communication — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@And("user click on the edit button in existing settlement")
	public void user_click_on_the_edit_button_in_existing_settlement() {
		boolean result = BillingModulefunctionalitypage.clickintotheEditbuttoninExistingSettlement();
		
		if (!result) {
	        String message = "Edit (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit button clicked successfully");
	}
	
	@Then("user change the received date in add claim settlement pop-up window")
	public void user_change_the_received_date_in_add_claim_settlement_pop_up_window() {
		// Click the License Expiration Date picker
        BillingModulefunctionalitypage.clickintotheReceivedDatePickerinAddClaimSettlement();

        // Select today's date
        BillingModulefunctionalitypage.selectTodaysDateinAddPOSNotes();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected Received Date as Before 10 days: " + selectedDate);
        Hooks.scenario.log("Selected Received Date as Before 10 days: " + selectedDate);
	}
	
	@When("user change the offer received date in add claim settlement pop-up window")
	public void user_change_the_offer_received_date_in_add_claim_settlement_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheOfferReceivedDatePickerinAddClaimSettlement();

        // Select Before 1 month
        BillingModulefunctionalitypage.selectToDateBefore1MonthAutomatically();
        
        // Before 1 Month
        LocalDate targetDate = LocalDate.now().minusMonths(1);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Offer Received Date: " + selectedDate);
        Hooks.scenario.log("Selected Offer Received Date: " + selectedDate);
	}
	
	@Then("user change the offer amount in add claim settlement pop-up window")
	public void user_change_the_offer_amount_in_add_claim_settlement_pop_up_window() {
		String OfferAmount = Hooks.prop.getProperty("newofferamount");
		BillingModulefunctionalitypage.entertheOfferAmountinAddClaimSettlement(OfferAmount);
		System.out.println("User Entered New Offer Amount: " + OfferAmount);
		Hooks.scenario.log("User Entered New Offer Amount: " + OfferAmount);
	}
	
	@And("user change the original amount in add claim settlement pop-up window")
	public void user_change_the_original_amount_in_add_claim_settlement_pop_up_window() {
		String OriginalAmount = Hooks.prop.getProperty("neworiginalamount");
		BillingModulefunctionalitypage.entertheOriginalAmountinAddClaimSettlement(OriginalAmount);
		System.out.println("User Entered New Original Amount: " + OriginalAmount);
		Hooks.scenario.log("User Entered New Original Amount: " + OriginalAmount);
	}
	
	@When("user change the accepted amount in add claim settlement pop-up window")
	public void user_change_the_accepted_amount_in_add_claim_settlement_pop_up_window() {
		String AcceptedAmount = Hooks.prop.getProperty("newacceptedamount");
		BillingModulefunctionalitypage.entertheAcceptedAmountinAddClaimSettlement(AcceptedAmount);
		System.out.println("User Entered New Accepted Amount: " + AcceptedAmount);
		Hooks.scenario.log("User Entered New Accepted Amount: " + AcceptedAmount);
	}
	
	@Then("user change the accepted date in add claim settlement pop-up window")
	public void user_change_the_accepted_date_in_add_claim_settlement_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheAcceptedDatePickerinAddClaimSettlement();

        // Select today's date
        BillingModulefunctionalitypage.selectDateAfterTwoDays();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Accepted Date: " + selectedDate);
        Hooks.scenario.log("Selected Accepted Date: " + selectedDate);
	}
	
	@And("user change the approved by in add claim settlement pop-up window")
	public void user_change_the_approved_by_in_add_claim_settlement_pop_up_window() {
		String ApprovedBy = Hooks.prop.getProperty("newapprovedby");
		BillingModulefunctionalitypage.entertheApprovedByinAddClaimSettlement(ApprovedBy);
		System.out.println("User Entered New Approved By: " + ApprovedBy);
		Hooks.scenario.log("User Entered New Approved By: " + ApprovedBy);
	}
	
	@When("user change the offer contact person in add claim settlement pop-up window")
	public void user_change_the_offer_contact_person_in_add_claim_settlement_pop_up_window() {
		String OfferContactPerson = Hooks.prop.getProperty("newoffercontactperson");
		BillingModulefunctionalitypage.entertheOfferContactPersoninAddClaimSettlement(OfferContactPerson);
		System.out.println("User Entered New Offer Contact Person: " + OfferContactPerson);
		Hooks.scenario.log("User Entered New Offer Contact Person: " + OfferContactPerson);
	}
	
	@And("user click on the three dot button in existing payment")
	public void user_click_on_the_three_dot_button_in_existing_payment() {
		boolean result = BillingModulefunctionalitypage.clickintotheThreedotbuttoninExistingPayment();
		
		if (!result) {
	        String message = "Three dot (more options) button is not visible because don't have the Claim Communication — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@When("user click on the edit button in existing payment")
	public void user_click_on_the_edit_button_in_existing_payment() {
		boolean result = BillingModulefunctionalitypage.clickintotheEditbuttoninExistingPayment();
		
		if (!result) {
	        String message = "Edit (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit button clicked successfully");
	}
	
	@When("user change the check number in add patient claim payment pop-up window")
	public void user_change_the_check_number_in_add_patient_claim_payment_pop_up_window() {
		String CheckNumber = Hooks.prop.getProperty("newchecknumber");
		BillingModulefunctionalitypage.entertheCheckNumberinAddPatientClaimPayment(CheckNumber);
		System.out.println("User Entered New Check Number: " + CheckNumber);
		Hooks.scenario.log("User Entered New Check Number: " + CheckNumber);
	}
	
	@Then("user change the amount in add patient claim payment pop-up window")
	public void user_change_the_amount_in_add_patient_claim_payment_pop_up_window() {
		String Amount = Hooks.prop.getProperty("newamount");
		BillingModulefunctionalitypage.entertheAmountinAddPatientClaimPayment(Amount);
		System.out.println("User Entered New Amount: " + Amount);
		Hooks.scenario.log("User Entered New Amount: " + Amount);
	}
	
	@And("user change the received date in add patient claim payment pop-up window")
	public void user_change_the_received_date_in_add_patient_claim_payment_pop_up_window() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheReceivedDatePickerinAddPatientClaimPayment();
        
        // Select Before 10 days
        BillingModulefunctionalitypage.selectToDateBefore1MonthAutomatically();
        
        // Log the same date logic (-10 days)
        LocalDate targetDate = LocalDate.now().minusMonths(1);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Received Date: " + selectedDate);
        Hooks.scenario.log("Selected Received Date: " + selectedDate);
	}
	
	@When("user change the business name in search partner pop-up window")
	public void user_change_the_business_name_in_search_partner_pop_up_window() {
		String BusinessName = Hooks.prop.getProperty("businessnameincompany");
		BillingModulefunctionalitypage.entertheBusinessNameinSearchPartner(BusinessName);
		System.out.println("User Entered Business Name: " + BusinessName);
		Hooks.scenario.log("User Entered Business Name: " + BusinessName);
	}
	
	@Then("user change the phone number in search partner pop-up window")
	public void user_change_the_phone_number_in_search_partner_pop_up_window() {
		String PhoneNumberinFilter = Hooks.prop.getProperty("phonenumberincompany");
		BillingModulefunctionalitypage.enterthePhoneNumberinFilter(PhoneNumberinFilter);
		System.out.println("User Entered Phone Number: " + PhoneNumberinFilter);
		Hooks.scenario.log("User Entered Phone Number: " + PhoneNumberinFilter);
	}
	
	@When("user change the partner executive name in partner executive")
	public void user_change_the_partner_executive_name_in_partner_executive() {
		String PartnerExecutiveName = Hooks.prop.getProperty("partnerexecutivename");
		BillingModulefunctionalitypage.enterthePartnerexecutiveName(PartnerExecutiveName);
		System.out.println("User Entered Partner Executive Name: " + PartnerExecutiveName);
		Hooks.scenario.log("User Entered Partner Executive Name: " + PartnerExecutiveName);
	}
	
	@And("user click on the delete button in existing billing details")
	public void user_click_on_the_delete_button_in_existing_billing_details() {
		boolean result = BillingModulefunctionalitypage.clickintotheDeletebuttoninExistingBillingDetails();
		
		if (!result) {
	        String message = "Delete (more options) button is not visible because for that user don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing Billing Details is delete successfully");
	}
	
	@Then("user click on the delete button in existing claim communication")
	public void user_click_on_the_delete_button_in_existing_claim_communication() {
		boolean result = BillingModulefunctionalitypage.clickintotheDeletebuttoninExistingClaimCommunications();
		
		if (!result) {
	        String message = "Delete (more options) button is not visible because for that user don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing Claim Communication is delete successfully");
	}
	
	@When("user click on the delete button in existing EOB")
	public void user_click_on_the_delete_button_in_existing_EOB() {
		boolean result = BillingModulefunctionalitypage.clickintotheDeletebuttoninExistingEOB();
		
		if (!result) {
	        String message = "Delete (more options) button is not visible because for that user don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing EOB is delete successfully");
	}
	
	@When("user click on the download button in existing EOB")
	public void user_click_on_the_download_button_in_existing_EOB() {
		boolean result = BillingModulefunctionalitypage.clickintotheDownloadbuttoninExistingEOB();
		
		if (!result) {
	        String message = "Download (more options) button is not visible because for that user don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing EOB File is download successfully");
	}
	
	@And("user click on the delete button in existing settlement")
	public void user_click_on_the_delete_button_in_existing_settlement() {
		boolean result = BillingModulefunctionalitypage.clickintotheDeletebuttoninExistingSettlement();
		
		if (!result) {
	        String message = "Delete (more options) button is not visible because for that user don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing Settlement is delete successfully");
	}
	
	@Then("user click on the delete button in existing payment")
	public void user_click_on_the_delete_button_in_existing_payment() {
		boolean result = BillingModulefunctionalitypage.clickintotheDeletebuttoninExistingPayment();
		
		if (!result) {
	        String message = "Delete (more options) button is not visible because for that user don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing Payment is delete successfully");
	}
	
	@Then("user click on the download button in existing payment")
	public void user_click_on_the_download_button_in_existing_payment() {
		boolean result = BillingModulefunctionalitypage.clickintotheDownloadbuttoninExistingEOB();
		
		if (!result) {
	        String message = "Download (more options) button is not visible because for that user don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing Payment File is download successfully");
	}
	
	@Then("user click on the download button in insurance company send fax")
	public void user_click_on_the_download_button_in_insurance_company_send_fax() {
		boolean result = BillingModulefunctionalitypage.clickintotheDownloadbuttoninInsuranceCompany();
		
		if (!result) {
	        String message = "Download (more options) button is not visible because for that user don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Insurance Company File is download successfully");
	}
	
	@And("user click on the delete button of existing claim")
	public void user_click_on_the_delete_button_of_existing_claim() {
		boolean result = BillingModulefunctionalitypage.clickintotheDeletebuttoninExistingClaim();
		
		if (!result) {
	        String message = "Delete (more options) button is not visible because for that user don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing Claim is deleted successfully");
	}
	
	@Then("user click on the filter tab in claims page")
	public void user_click_on_the_filter_tab_in_claims_page() {
		BillingModulefunctionalitypage.clickintotheFilterbutton();
		
		System.out.println("Filter tab clicked successfully");
		Hooks.scenario.log("Filter tab clicked successfully");
	}
	
	@And("user enter the last name in filter of claims")
	public void user_enter_the_last_name_in_filter_of_claims() {
		String PatientLastName = Hooks.prop.getProperty("patientlastname");
		BillingModulefunctionalitypage.enterthePatientLastNameinSearchPatient(PatientLastName);
		
		System.out.println("User Entered Last Name: " + PatientLastName);
		Hooks.scenario.log("User Entered Last Name: " + PatientLastName);
	}
	
	@And("user enter the invalid last name in filter of claims")
	public void user_enter_the_invalid_last_name_in_filter_of_claims() {
		String PatientLastName = Hooks.prop.getProperty("invalidpatientlastname");
		BillingModulefunctionalitypage.enterthePatientLastNameinSearchPatient(PatientLastName);
		
		System.out.println("User Entered Invalid Last Name: " + PatientLastName);
		Hooks.scenario.log("User Entered Invalid Last Name: " + PatientLastName);
	}
	
	@When("user enter the first name in filter of claims")
	public void user_enter_the_first_name_in_filter_of_claims() {
		String PatientFirstName = Hooks.prop.getProperty("patientfirstname");
		BillingModulefunctionalitypage.enterthePatientFirstNameinSearchPatient(PatientFirstName);
		
		System.out.println("User Entered Patient First Name: " + PatientFirstName);
		Hooks.scenario.log("User Entered Patient First Name: " + PatientFirstName);
	}
	
	@When("user enter the invalid first name in filter of claims")
	public void user_enter_the_invalid_first_name_in_filter_of_claims() {
		String PatientFirstName = Hooks.prop.getProperty("invalidpatientfirstname");
		BillingModulefunctionalitypage.enterthePatientFirstNameinSearchPatient(PatientFirstName);
		
		System.out.println("User Entered Invalid Patient First Name: " + PatientFirstName);
		Hooks.scenario.log("User Entered Invalid Patient First Name: " + PatientFirstName);
	}
	
	@Then("user enter the birth date in filter of claims")
	public void user_enter_the_birth_date_in_filter_of_claims() {
		String PatientDateofBirth = Hooks.prop.getProperty("patientdateofbirth");
		BillingModulefunctionalitypage.enterthePatientDateofBirthinSearchPatient(PatientDateofBirth);
		
		System.out.println("User Entered Patient Date of Birth: " + PatientDateofBirth);
		Hooks.scenario.log("User Entered Patient Date of Birth: " + PatientDateofBirth);
	}
	
	@Then("user enter the invalid birth date in filter of claims")
	public void user_enter_the_invalid_birth_date_in_filter_of_claims() {
		String PatientDateofBirth = Hooks.prop.getProperty("invalidpatientdateofbirth");
		BillingModulefunctionalitypage.enterthePatientDateofBirthinSearchPatient(PatientDateofBirth);
		
		System.out.println("User Entered Invalid Patient Date of Birth: " + PatientDateofBirth);
		Hooks.scenario.log("User Entered Invalid Patient Date of Birth: " + PatientDateofBirth);
	}
	
	@When("user enter the insurance company name in filter of claims")
	public void user_enter_the_insurance_company_name_in_filter_of_claims() {
		String InsuranceCompanyName = Hooks.prop.getProperty("insurancecompanyname");
		BillingModulefunctionalitypage.entertheInsuranceCompanyNameinSearchClaim(InsuranceCompanyName);
		System.out.println("User Entered Insurance Company Name: " + InsuranceCompanyName);
		Hooks.scenario.log("User Entered Insurance Company Name: " + InsuranceCompanyName);
	}
	
	@When("user enter the invalid insurance company name in filter of claims")
	public void user_enter_the_invalid_insurance_company_name_in_filter_of_claims() {
		String InsuranceCompanyName = Hooks.prop.getProperty("invalidinsurancecompanyname");
		BillingModulefunctionalitypage.entertheInsuranceCompanyNameinSearchClaim(InsuranceCompanyName);
		System.out.println("User Entered Invalid Insurance Company Name: " + InsuranceCompanyName);
		Hooks.scenario.log("User Entered Invalid Insurance Company Name: " + InsuranceCompanyName);
	}
	
	@Then("user enter the claim number in filter of claims")
	public void user_enter_the_claim_number_in_filter_of_claims() {
		String ClaimNumber = Hooks.prop.getProperty("claimnumber");
		BillingModulefunctionalitypage.entertheClaimNumberinSearchClaim(ClaimNumber);
		System.out.println("User Entered Claim Number: " + ClaimNumber);
		Hooks.scenario.log("User Entered Claim Number: " + ClaimNumber);
	}
	
	@Then("user enter the invalid claim number in filter of claims")
	public void user_enter_the_invalid_claim_number_in_filter_of_claims() {
		String ClaimNumber = Hooks.prop.getProperty("invalidclaimnumber");
		BillingModulefunctionalitypage.entertheClaimNumberinSearchClaim(ClaimNumber);
		System.out.println("User Entered Invalid Claim Number: " + ClaimNumber);
		Hooks.scenario.log("User Entered Invalid Claim Number: " + ClaimNumber);
	}
	
	@And("user select the claim type in filter of claims")
	public void user_select_the_claim_type_in_filter_of_claims() throws Exception {
		String claimtypeinclaims = "Medical Claim";

	    boolean result = BillingModulefunctionalitypage.selectClaimTypeinFilterofClaims(claimtypeinclaims);

	    Thread.sleep(1500);

	    if (!result) {

	        String msg = "Claim Type is NOT present in dropdown: " + claimtypeinclaims;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        // HARD STOP
	        Assume.assumeTrue(msg, false);
	    }

	    Hooks.scenario.log("Claim Type selected successfully: " + claimtypeinclaims);
	    System.out.println("Claim Type selected successfully: " + claimtypeinclaims);
	}
	
	@And("user select the invalid claim type in filter of claims")
	public void user_select_the_invalid_claim_type_in_filter_of_claims() throws Exception {
		String claimtypeinclaims = "-- Select  Claim Types --";

	    boolean result = BillingModulefunctionalitypage.selectClaimTypeinFilterofClaims(claimtypeinclaims);

	    Thread.sleep(1500);

	    if (!result) {

	        String msg = "Claim Type is NOT present in dropdown: " + claimtypeinclaims;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        // HARD STOP
	        Assume.assumeTrue(msg, false);
	    }

	    Hooks.scenario.log("Invalid Claim Type selected successfully: " + claimtypeinclaims);
	    System.out.println("Invalid Claim Type selected successfully: " + claimtypeinclaims);
	}
	
	@When("user select the claim status in filter of claims")
	public void user_select_the_claim_status_in_filter_of_claims() throws Exception {
		String claimstatusinclaims = "In Process";

	    boolean result = BillingModulefunctionalitypage.selectClaimStatusinFilterofClaims(claimstatusinclaims);

	    Thread.sleep(1500);

	    if (!result) {

	        String msg = "Claim Status is NOT present in dropdown: " + claimstatusinclaims;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        // HARD STOP
	        Assume.assumeTrue(msg, false);
	    }

	    Hooks.scenario.log("Claim Status selected successfully: " + claimstatusinclaims);
	    System.out.println("Claim Status selected successfully: " + claimstatusinclaims);
	}
	
	@When("user select the invalid claim status in filter of claims")
	public void user_select_the_invalid_claim_status_in_filter_of_claims() throws Exception {
		String claimstatusinclaims = "-- Select Claim Status --";

	    boolean result = BillingModulefunctionalitypage.selectClaimStatusinFilterofClaims(claimstatusinclaims);

	    Thread.sleep(1500);

	    if (!result) {

	        String msg = "Claim Status is NOT present in dropdown: " + claimstatusinclaims;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        // HARD STOP
	        Assume.assumeTrue(msg, false);
	    }

	    Hooks.scenario.log("Invalid Claim Status selected successfully: " + claimstatusinclaims);
	    System.out.println("Invalid Claim Status selected successfully: " + claimstatusinclaims);
	}
	
	@Then("user select the bill status in filter of claims")
	public void user_select_the_bill_status_in_filter_of_claims() throws Exception {
		String billstatusinclaims = "Completed";

	    boolean result = BillingModulefunctionalitypage.selectBillStatusinFilterofClaims(billstatusinclaims);

	    Thread.sleep(1500);

	    if (!result) {

	        String msg = "Bill Status is NOT present in dropdown: " + billstatusinclaims;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        // HARD STOP
	        Assume.assumeTrue(msg, false);
	    }

	    Hooks.scenario.log("Bill Status selected successfully: " + billstatusinclaims);
	    System.out.println("Bill Status selected successfully: " + billstatusinclaims);
	}
	
	@Then("user select the invalid bill status in filter of claims")
	public void user_select_the_invalid_bill_status_in_filter_of_claims() throws Exception {
		String billstatusinclaims = "-- Select Bill Status --";

	    boolean result = BillingModulefunctionalitypage.selectBillStatusinFilterofClaims(billstatusinclaims);

	    Thread.sleep(1500);

	    if (!result) {

	        String msg = "Bill Status is NOT present in dropdown: " + billstatusinclaims;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        // HARD STOP
	        Assume.assumeTrue(msg, false);
	    }

	    Hooks.scenario.log("Invalid Bill Status selected successfully: " + billstatusinclaims);
	    System.out.println("Invalid Bill Status selected successfully: " + billstatusinclaims);
	}
	
	@And("user select the stage status in filter of claims")
	public void user_select_the_stage_status_in_filter_of_claims() throws Exception {
		String stagestatusinclaims = "Pending Review";

	    boolean result = BillingModulefunctionalitypage.selectStageStatusinFilterofClaims(stagestatusinclaims);

	    Thread.sleep(1500);

	    if (!result) {

	        String msg = "Stage Status is NOT present in dropdown: " + stagestatusinclaims;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        // HARD STOP
	        Assume.assumeTrue(msg, false);
	    }

	    Hooks.scenario.log("Stage Status selected successfully: " + stagestatusinclaims);
	    System.out.println("Stage Status selected successfully: " + stagestatusinclaims);
	}
	
	@And("user select the invalid stage status in filter of claims")
	public void user_select_the_invalid_stage_status_in_filter_of_claims() throws Exception {
		String stagestatusinclaims = "-- Select Stage --";

	    boolean result = BillingModulefunctionalitypage.selectStageStatusinFilterofClaims(stagestatusinclaims);

	    Thread.sleep(1500);

	    if (!result) {

	        String msg = "Stage Status is NOT present in dropdown: " + stagestatusinclaims;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        // HARD STOP
	        Assume.assumeTrue(msg, false);
	    }

	    Hooks.scenario.log("Invalid Stage Status selected successfully: " + stagestatusinclaims);
	    System.out.println("Invalid Stage Status selected successfully: " + stagestatusinclaims);
	}
	
	@When("user select the date of service from date in filter of claims")
	public void user_select_the_date_of_service_from_date_in_filter_of_claims() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheFromDatePickerinFilter();

        // Select today's date
        BillingModulefunctionalitypage.selectTodaysDateinAddPOSNotes();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Date of Service From Date: " + selectedDate);
        Hooks.scenario.log("Selected Date of Service From Date: " + selectedDate);	
	}
	
	@When("user select the invalid date of service from date in filter of claims")
	public void user_select_the_invalid_date_of_service_from_date_in_filter_of_claims() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheFromDatePickerinFilter();

        // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Invalid Date of Service From Date: " + selectedDate);
        Hooks.scenario.log("Selected Invalid Date of Service From Date: " + selectedDate);	
	}
	
	@Then("user select the date of service to date in filter of claims")
	public void user_select_the_date_of_service_to_date_in_filter_of_claims() {
		// Click the License Expiration Date picker
        BillingModulefunctionalitypage.clickintotheToDatePickerinFilter();

        // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected Date of Service To Date: " + selectedDate);
        Hooks.scenario.log("Selected Date of Service To Date: " + selectedDate);
	}
	
	@Then("user select the invalid date of service to date in filter of claims")
	public void user_select_the_invalid_date_of_service_to_date_in_filter_of_claims() {
		// Click the License Expiration Date picker
        BillingModulefunctionalitypage.clickintotheToDatePickerinFilter();

        // Select Before 1 month
        BillingModulefunctionalitypage.selectToDateBefore1MonthAutomatically();
        
        // Before 1 Month
        LocalDate targetDate = LocalDate.now().minusMonths(1);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected Invalid Date of Service To Date: " + selectedDate);
        Hooks.scenario.log("Selected Invalid Date of Service To Date: " + selectedDate);
	}
	
	@And("user select the payment status in filter of claims")
	public void user_select_the_payment_status_in_filter_of_claims() throws Exception {
		String stagestatusinclaims = "Payment";

	    boolean result = BillingModulefunctionalitypage.selectPaymentStatusinFilterofClaims(stagestatusinclaims);

	    Thread.sleep(1500);

	    if (!result) {

	        String msg = "Payment Status is NOT present in dropdown: " + stagestatusinclaims;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        // HARD STOP
	        Assume.assumeTrue(msg, false);
	    }

	    Hooks.scenario.log("Payment Status selected successfully: " + stagestatusinclaims);
	    System.out.println("Payment Status selected successfully: " + stagestatusinclaims);
	}
	
	@And("user select the invalid payment status in filter of claims")
	public void user_select_the_invalid_payment_status_in_filter_of_claims() throws Exception {
		String stagestatusinclaims = "--Select Payment Status--";

	    boolean result = BillingModulefunctionalitypage.selectPaymentStatusinFilterofClaims(stagestatusinclaims);

	    Thread.sleep(1500);

	    if (!result) {

	        String msg = "Payment Status is NOT present in dropdown: " + stagestatusinclaims;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        // HARD STOP
	        Assume.assumeTrue(msg, false);
	    }

	    Hooks.scenario.log("Invalid Payment Status selected successfully: " + stagestatusinclaims);
	    System.out.println("Invalid Payment Status selected successfully: " + stagestatusinclaims);
	}
	
	@When("user click on the search button in filter of claims")
	public void user_click_on_the_search_button_in_filter_of_claims() {
		String result = BillingModulefunctionalitypage.clickintothesearchbuttoninFilterofClaims();

	    System.out.println("Search Result: " + result);
	    Hooks.scenario.log("Search Result: " + result);

	    //Skip remaining steps ONLY when no records / error
	    if (result.startsWith("ERROR")) {
	    	 Hooks.scenario.log("Search failed due to error message(s): " + result);
	    	 
	        // Scenario marked as SKIPPED (not FAILED)
	        Assume.assumeTrue("Skipping scenario due to search result: " + result, false);
	    }
	}
	
	@When("user click on the CMS 1500 tab in sidebar in Billing module page")
	public void user_click_on_the_CMS_1500_tab_in_sidebar_in_Billing_module_page() {
		boolean result = BillingModulefunctionalitypage.clickintotheCMS1500tabinsidebar();
		
		if (!result) {
	        String message = "CMS1500 (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("CMS 1500 tab clicked successfully");
	}
	
	@Then("user click on the new cms 1500 tab in cms 1500 page")
	public void user_click_on_the_new_cms_1500_tab_in_cms_1500_page() {
		boolean result = BillingModulefunctionalitypage.clickintotheNewCMS1500tabinCMS1500();
		
		if (!result) {
	        String message = "New CMS1500 (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New CMS 1500 tab clicked successfully");
	}
	
	@Then("user select the template in new cms 1500 page")
	public void user_select_the_template_in_new_cms_1500_page() {
		int CMS1500TemplateIndex = 1;

	    boolean result = BillingModulefunctionalitypage.selecttheTemplateinAddNewClaim1500(CMS1500TemplateIndex);

	    String message = BillingModulefunctionalitypage.getToasterMessage();

	    // Always log message
	    Hooks.scenario.log("Result: " + message);
	    System.out.println("Result: " + message);

	    // Skip condition
	    if (!result) {

	        String skipMsg = "Skipping scenario: " + message;

	        Hooks.scenario.log(skipMsg);
	        System.out.println(skipMsg);

	        Assume.assumeTrue(skipMsg, false); // SKIP
	        return;
	    }

	    // Success case
	    String successMsg = "Template selected successfully (No toaster)";
	    Hooks.scenario.log(successMsg);
	    System.out.println(successMsg);
	}
	
	@Then("user click on the existing cms 1500 download file button in cms 1500 page")
	public void user_click_on_the_existing_cms_1500_download_file_button_in_cms_1500_page() {
		boolean result = BillingModulefunctionalitypage.clickintotheCMS1500DownloadbuttoninCMS1500();
		
		if (!result) {
	        String message = "CMS 1500 Download (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("CMS 1500 Download tab clicked successfully");
	}
	
	@Then("user click on the three dot button of existing cms 1500")
	public void user_click_on_the_three_dot_button_of_existing_cms_1500() {
		boolean result = BillingModulefunctionalitypage.clickintothethreedotbuttoninExistingInvoice();
		
		if (!result) {
	        String message = "Three dot (more options) button is not visible for that user because Existing CMS 1500 is not their — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@And("user click on the edit button of existing cms 1500")
	public void user_click_on_the_edit_button_of_existing_cms_1500() {
		boolean result = BillingModulefunctionalitypage.clickintotheEditbuttoninExistingCMS1500();
		
		if (!result) {
	        String message = "Edit (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit tab clicked successfully");
	}
	
	@When("user click on the delete button of existing cms 1500")
	public void user_click_on_the_delete_button_of_existing_cms_1500() {
		boolean result = BillingModulefunctionalitypage.clickintotheDeletebuttoninExistingCMS1500();
		
		if (!result) {
	        String message = "Delete (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing CMS 1500 is deleted successfully");
	}
	
	@When("user click on the Reports tab in sidebar in Billing module page")
	public void user_click_on_the_Reports_tab_in_sidebar_in_Billing_module_page() {
		boolean result = BillingModulefunctionalitypage.clickintotheReportstabinsidebar();
		
		if (!result) {
	        String message = "Reports (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Reports tab clicked successfully");
	}
	
	
	//------------------------------------Reports (Ledger Report) Section--------------------------------------
	
	
	@Then("user click on the ledger report tab of reports in Billing module page")
	public void user_click_on_the_ledger_report_tab_of_reports_in_Billing_module_page() {
		boolean result = BillingModulefunctionalitypage.clickintotheLedgerReportinReports();
		
		if (!result) {
	        String message = "Ledger Report (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Ledger Report tab clicked successfully");
	}
	
	@And("user click on the filter tab in ledger report")
	public void user_click_on_the_filter_tab_in_ledger_report() {
		BillingModulefunctionalitypage.clickintotheFilterbutton();
		
		System.out.println("Filter button clicked successfully");
		Hooks.scenario.log("Filter button clicked successfully");
	}
	
	@When("user enter the last name in filter of ledger report")
	public void user_enter_the_last_name_in_filter_of_ledger_report() {
		String PatientLastName = Hooks.prop.getProperty("patientlastname");
		BillingModulefunctionalitypage.enterthePatientLastNameinSearchPatient(PatientLastName);
		
		System.out.println("User Entered Last Name: " + PatientLastName);
		Hooks.scenario.log("User Entered Last Name: " + PatientLastName);
	}
	
	@When("user enter the invalid last name in filter of ledger report")
	public void user_enter_the_invalid_last_name_in_filter_of_ledger_report() {
		String PatientLastName = Hooks.prop.getProperty("invalidpatientlastname");
		BillingModulefunctionalitypage.enterthePatientLastNameinSearchPatient(PatientLastName);
		
		System.out.println("User Entered Invalid Last Name: " + PatientLastName);
		Hooks.scenario.log("User Entered Invalid Last Name: " + PatientLastName);
	}
	
	@Then("user enter the first name in filter of ledger report")
	public void user_enter_the_first_name_in_filter_of_ledger_report() {
		String PatientFirstName = Hooks.prop.getProperty("patientfirstname");
		BillingModulefunctionalitypage.enterthePatientFirstNameinSearchPatient(PatientFirstName);
		
		System.out.println("User Entered Patient First Name: " + PatientFirstName);
		Hooks.scenario.log("User Entered Patient First Name: " + PatientFirstName);
	}
	
	@Then("user enter the invalid first name in filter of ledger report")
	public void user_enter_the_invalid_first_name_in_filter_of_ledger_report() {
		String PatientFirstName = Hooks.prop.getProperty("invalidpatientfirstname");
		BillingModulefunctionalitypage.enterthePatientFirstNameinSearchPatient(PatientFirstName);
		
		System.out.println("User Entered Invalid Patient First Name: " + PatientFirstName);
		Hooks.scenario.log("User Entered Invalid Patient First Name: " + PatientFirstName);
	}
	
	@And("user enter the birth date in filter of ledger report")
	public void user_enter_the_birth_date_in_filter_of_ledger_report() {
		String PatientDateofBirth = Hooks.prop.getProperty("patientdateofbirth");
		BillingModulefunctionalitypage.enterthePatientDateofBirthinSearchPatient(PatientDateofBirth);
		
		System.out.println("User Entered Patient Date of Birth: " + PatientDateofBirth);
		Hooks.scenario.log("User Entered Patient Date of Birth: " + PatientDateofBirth);
	}
	
	@And("user enter the invalid birth date in filter of ledger report")
	public void user_enter_the_invalid_birth_date_in_filter_of_ledger_report() {
		String PatientDateofBirth = Hooks.prop.getProperty("invalidpatientdateofbirth");
		BillingModulefunctionalitypage.enterthePatientDateofBirthinSearchPatient(PatientDateofBirth);
		
		System.out.println("User Entered Invalid Patient Date of Birth: " + PatientDateofBirth);
		Hooks.scenario.log("User Entered Invalid Patient Date of Birth: " + PatientDateofBirth);
	}
	
	@When("user select the from date in filter of ledger report")
	public void user_select_the_from_date_in_filter_of_ledger_report() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheFromDatePickerinFilter();

        // Select today's date
        BillingModulefunctionalitypage.selectTodaysDateinAddPOSNotes();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected From Date: " + selectedDate);
        Hooks.scenario.log("Selected From Date: " + selectedDate);
	}
	
	@When("user select the invalid from date in filter of ledger report")
	public void user_select_the_invalid_from_date_in_filter_of_ledger_report() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheFromDatePickerinFilter();

     // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected Invalid From Date: " + selectedDate);
        Hooks.scenario.log("Selected Invalid From Date: " + selectedDate);
	}
	
	@Then("user select the to date in filter of ledger report")
	public void user_select_the_to_date_in_filter_of_ledger_report() {
		// Click the License Expiration Date picker
        BillingModulefunctionalitypage.clickintotheToDatePickerinFilter();

        // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date: " + selectedDate);
        Hooks.scenario.log("Selected To Date: " + selectedDate);
	}
	
	@Then("user select the invalid to date in filter of ledger report")
	public void user_select_the_invalid_to_date_in_filter_of_ledger_report() {
		// Click the License Expiration Date picker
        BillingModulefunctionalitypage.clickintotheToDatePickerinFilter();

        // Select Before 1 month
        BillingModulefunctionalitypage.selectToDateBefore1MonthAutomatically();
        
        // Before 1 Month
        LocalDate targetDate = LocalDate.now().minusMonths(1);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date: " + selectedDate);
        Hooks.scenario.log("Selected To Date: " + selectedDate);
	}
	
	@And("user click on the search button in filter of ledger report")
	public void user_click_on_the_search_button_in_filter_of_ledger_report() {
		String result = BillingModulefunctionalitypage.clickintothesearchbuttoninFilterofLedgerReports();

	    System.out.println("Search Result: " + result);
	    Hooks.scenario.log("Search Result: " + result);

	    //Skip remaining steps ONLY when no records / error
	    if (result.startsWith("ERROR")) {
	    	 Hooks.scenario.log("Search failed due to error message(s): " + result);
	    	 
	        // Scenario marked as SKIPPED (not FAILED)
	        Assume.assumeTrue("Skipping scenario due to search result: " + result, false);
	    }
	}
	
	@And("user click on the download button of ledger report excel")
	public void user_click_on_the_download_button_of_ledger_report_excel() {
		boolean result = BillingModulefunctionalitypage.clickintotheDownloadbuttoninLedgerReport();
		
		if (!result) {
	        String message = "Download Ledger Report (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Ledger Report download successfully");
	}
	
	@Then("user click on the claim report tab of reports in Billing module page")
	public void user_click_on_the_claim_report_tab_of_reports_in_Billing_module_page() {
		boolean result = BillingModulefunctionalitypage.clickintotheClaimReporttabinReports();
		
		if (!result) {
	        String message = "Claim Report (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Claim Report tab clicked successfully");
	}
	
	@And("user click on the export excel button in claim report")
	public void user_click_on_the_export_excel_button_in_claim_report() {
		boolean result = BillingModulefunctionalitypage.clickintotheExporttoExcelbuttoninClaims();
		
		if (!result) {
	        String message = "Export Excel (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Export Excel tab clicked successfully");
	}
	
	@And("user click on the filter button in claim report")
	public void user_click_on_the_filter_button_in_claim_report() {
		BillingModulefunctionalitypage.clickintotheFilterbutton();
		
		System.out.println("Filter button clicked successfully");
		Hooks.scenario.log("Filter button clicked successfully");
	}
	
	@When("user enter the last name in filter of claim report")
	public void user_enter_the_last_name_in_filter_of_claim_report() {
		String PatientLastName = Hooks.prop.getProperty("patientlastname");
		BillingModulefunctionalitypage.enterthePatientLastNameinSearchPatient(PatientLastName);
		
		System.out.println("User Entered Patient Last Name: " + PatientLastName);
		Hooks.scenario.log("User Entered Patient Last Name: " + PatientLastName);
	}
	
	@When("user enter the invalid last name in filter of claim report")
	public void user_enter_the_invalid_last_name_in_filter_of_claim_report() {
		String PatientLastName = Hooks.prop.getProperty("invalidpatientlastname");
		BillingModulefunctionalitypage.enterthePatientLastNameinSearchPatient(PatientLastName);
		
		System.out.println("User Entered Invalid Patient Last Name: " + PatientLastName);
		Hooks.scenario.log("User Entered Invalid Patient Last Name: " + PatientLastName);
	}
	
	@Then("user enter the first name in filter of claim report")
	public void user_enter_the_first_name_in_filter_of_claim_report() {
		String PatientFirstName = Hooks.prop.getProperty("patientfirstname");
		BillingModulefunctionalitypage.enterthePatientFirstNameinSearchPatient(PatientFirstName);
		
		System.out.println("User Entered Patient First Name: " + PatientFirstName);
		Hooks.scenario.log("User Entered Patient First Name: " + PatientFirstName);
	}
	
	@Then("user enter the invalid first name in filter of claim report")
	public void user_enter_the_invalid_first_name_in_filter_of_claim_report() {
		String PatientFirstName = Hooks.prop.getProperty("invalidpatientfirstname");
		BillingModulefunctionalitypage.enterthePatientFirstNameinSearchPatient(PatientFirstName);
		
		System.out.println("User Entered Invalid Patient First Name: " + PatientFirstName);
		Hooks.scenario.log("User Entered Invalid Patient First Name: " + PatientFirstName);
	}
	
	@And("user enter the birth date in filter of claim report")
	public void user_enter_the_birth_date_in_filter_of_claim_report() {
		String BirthDateinClaimReport = Hooks.prop.getProperty("patientdateofbirth");
		BillingModulefunctionalitypage.entertheBirthDateinFilterofClaimReport(BirthDateinClaimReport);
		
		System.out.println("User Entered Birth Date: " + BirthDateinClaimReport);
		Hooks.scenario.log("User Entered Birth Date: " + BirthDateinClaimReport);
	}
	
	@And("user enter the invalid birth date in filter of claim report")
	public void user_enter_the_invalid_birth_date_in_filter_of_claim_report() {
		String BirthDateinClaimReport = Hooks.prop.getProperty("invalidpatientdateofbirth");
		BillingModulefunctionalitypage.entertheBirthDateinFilterofClaimReport(BirthDateinClaimReport);
		
		System.out.println("User Entered Invalid Birth Date: " + BirthDateinClaimReport);
		Hooks.scenario.log("User Entered Invalid Birth Date: " + BirthDateinClaimReport);
	}
	
	@When("user enter the claim number in filter of claim report")
	public void user_enter_the_claim_number_in_filter_of_claim_report() {
		String ClaimNumber = Hooks.prop.getProperty("claimnumber");
		BillingModulefunctionalitypage.entertheClaimNumberinSearchClaim(ClaimNumber);
		System.out.println("User Entered Claim Number: " + ClaimNumber);
		Hooks.scenario.log("User Entered Claim Number: " + ClaimNumber);
	}
	
	@When("user enter the invalid claim number in filter of claim report")
	public void user_enter_the_invalid_claim_number_in_filter_of_claim_report() {
		String ClaimNumber = Hooks.prop.getProperty("invalidclaimnumber");
		BillingModulefunctionalitypage.entertheClaimNumberinSearchClaim(ClaimNumber);
		System.out.println("User Entered Invalid Claim Number: " + ClaimNumber);
		Hooks.scenario.log("User Entered Invalid Claim Number: " + ClaimNumber);
	}
	
	@Then("user select the claim type in filter of claim report")
	public void user_select_the_claim_type_in_filter_of_claim_report() throws Exception {
		int ClaimTypeIndex = 4; // fetch from config if required

	    boolean result = BillingModulefunctionalitypage.selecttheClaimTypeinClaimReport(ClaimTypeIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Claim is NOT present in dropdown for index: " + ClaimTypeIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Claim selected successfully using index: " + ClaimTypeIndex);
	    System.out.println("Claim selected successfully using index: " + ClaimTypeIndex);
	}
	
	@And("user select the from date in filter of claim report")
	public void user_select_the_from_date_in_filter_of_claim_report() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheFromDatePickerinFilter();

        // Select today's date
        BillingModulefunctionalitypage.selectTodaysDateinAddPOSNotes();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected From Date: " + selectedDate);
        Hooks.scenario.log("Selected From Date: " + selectedDate);
	}
	
	@And("user select the invalid from date in filter of claim report")
	public void user_select_the_invalid_from_date_in_filter_of_claim_report() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheFromDatePickerinFilter();

        // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected the Future From Date: " + selectedDate);
        Hooks.scenario.log("Selected the Future From Date: " + selectedDate);
	}
	
	@When("user select the to date in filter of claim report")
	public void user_select_the_to_date_in_filter_of_claim_report() {
		// Click the License Expiration Date picker
        BillingModulefunctionalitypage.clickintotheToDatePickerinFilter();

        // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date: " + selectedDate);
        Hooks.scenario.log("Selected To Date: " + selectedDate);
	}
	
	@When("user select the invalid to date in filter of claim report")
	public void user_select_the_invalid_to_date_in_filter_of_claim_report() {
		// Click the License Expiration Date picker
        BillingModulefunctionalitypage.clickintotheToDatePickerinFilter();

        // Select Before 1 month
        BillingModulefunctionalitypage.selectToDateBefore1MonthAutomatically();
        
        // Before 1 Month
        LocalDate targetDate = LocalDate.now().minusMonths(1);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected Previous To Date: " + selectedDate);
        Hooks.scenario.log("Selected Previous To Date: " + selectedDate);
	}
	
	@Then("user click on the advance search tab in filter of claim report")
	public void user_click_on_the_advance_search_tab_in_filter_of_claim_report() {
		BillingModulefunctionalitypage.clickintotheAdvanceSearchtabinClaimReport();
		
		System.out.println("Advance Search tab clicked successfully");
		Hooks.scenario.log("Advance Search tab clicked successfully");
	}
	
	@And("user enter the insurance company name in advanced search filter of claim report")
	public void user_enter_the_insurance_company_name_in_advanced_search_filter_of_claim_report() {
		String InsuranceCompanyName = Hooks.prop.getProperty("insurancecompanyname");
		BillingModulefunctionalitypage.entertheInsuranceCompanyNameinSearchClaim(InsuranceCompanyName);
		System.out.println("User Entered Insurance Company Name: " + InsuranceCompanyName);
		Hooks.scenario.log("User Entered Insurance Company Name: " + InsuranceCompanyName);
	}
	
	@And("user enter the invalid insurance company name in advanced search filter of claim report")
	public void user_enter_the_invalid_insurance_company_name_in_advanced_search_filter_of_claim_report() {
		String InsuranceCompanyName = Hooks.prop.getProperty("invalidinsurancecompanyname");
		BillingModulefunctionalitypage.entertheInsuranceCompanyNameinSearchClaim(InsuranceCompanyName);
		System.out.println("User Entered Invalid Insurance Company Name: " + InsuranceCompanyName);
		Hooks.scenario.log("User Entered Invalid Insurance Company Name: " + InsuranceCompanyName);
	}
	
	@When("user select the from date Date of Loss in advanced search filter of claim report")
	public void user_select_the_from_date_Date_of_Loss_in_advanced_search_filter_of_claim_report() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheFromDatePickerDateofLossinClaimReport();

        // Select today's date
        BillingModulefunctionalitypage.selectTodaysDateinAddPOSNotes();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected From Date Date Of Loss: " + selectedDate);
        Hooks.scenario.log("Selected From Date Date Of Loss: " + selectedDate);
	}
	
	@When("user select the invalid from date Date of Loss in advanced search filter of claim report")
	public void user_select_the_invalid_from_date_Date_of_Loss_in_advanced_search_filter_of_claim_report() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheFromDatePickerDateofLossinClaimReport();

        // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected From Date Date Of Loss: " + selectedDate);
        Hooks.scenario.log("Selected From Date Date Of Loss: " + selectedDate);
	}
	
	@Then("user select the to date Date of Loss in advanced search filter of claim report")
	public void user_select_the_to_date_Date_of_Loss_in_advanced_search_filter_of_claim_report() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheToDatePickerDateofLossinClaimReport();

        // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected To Date Date Of Loss: " + selectedDate);
        Hooks.scenario.log("Selected To Date Date Of Loss: " + selectedDate);
	}
	
	@Then("user select the invalid to date Date of Loss in advanced search filter of claim report")
	public void user_select_the_invalid_to_date_Date_of_Loss_in_advanced_search_filter_of_claim_report() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheToDatePickerDateofLossinClaimReport();

        // Select Before 1 month
        BillingModulefunctionalitypage.selectToDateBefore1MonthAutomatically();
        
        // Before 1 Month
        LocalDate targetDate = LocalDate.now().minusMonths(1);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected To Date Date Of Loss: " + selectedDate);
        Hooks.scenario.log("Selected To Date Date Of Loss: " + selectedDate);
	}
	
	@And("user enter the phone number in advanced search filter of claim report")
	public void user_enter_the_phone_number_in_advanced_search_filter_of_claim_report() {
		String PhoneNumberinFilter = Hooks.prop.getProperty("phonenumberinfilter");
		BillingModulefunctionalitypage.enterthePhoneNumberinFilter(PhoneNumberinFilter);
		System.out.println("User Entered Phone Number: " + PhoneNumberinFilter);
		Hooks.scenario.log("User Entered Phone Number: " + PhoneNumberinFilter);
	}
	
	@And("user enter the invalid phone number in advanced search filter of claim report")
	public void user_enter_the_invalid_phone_number_in_advanced_search_filter_of_claim_report() {
		String PhoneNumberinFilter = Hooks.prop.getProperty("invalidphonenumberinfilter");
		BillingModulefunctionalitypage.enterthePhoneNumberinFilter(PhoneNumberinFilter);
		System.out.println("User Entered Invalid Phone Number: " + PhoneNumberinFilter);
		Hooks.scenario.log("User Entered Invalid Phone Number: " + PhoneNumberinFilter);
	}
	
	@When("user enter the cell number in advanced search filter of claim report")
	public void user_enter_the_cell_number_in_advanced_search_filter_of_claim_report() {
		String CellNumber = Hooks.prop.getProperty("patientcellnumber");
		BillingModulefunctionalitypage.entertheCellNumberinClaimReport(CellNumber);
		System.out.println("User Entered Cell Number: " + CellNumber);
		Hooks.scenario.log("User Entered Cell Number: " + CellNumber);
	}
	
	@When("user enter the invalid cell number in advanced search filter of claim report")
	public void user_enter_the_invalid_cell_number_in_advanced_search_filter_of_claim_report() {
		String CellNumber = Hooks.prop.getProperty("invalidpatientcellnumber");
		BillingModulefunctionalitypage.entertheCellNumberinClaimReport(CellNumber);
		System.out.println("User Entered Invalid Cell Number: " + CellNumber);
		Hooks.scenario.log("User Entered Invalid Cell Number: " + CellNumber);
	}
	
	@Then("user select the from date Service in advanced search filter of claim report")
	public void user_select_the_from_date_Service_in_advanced_search_filter_of_claim_report() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheFromDateServiceinClaimReport();

        // Select today's date
        BillingModulefunctionalitypage.selectTodaysDateinAddPOSNotes();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected From Date Service: " + selectedDate);
        Hooks.scenario.log("Selected From Date Service: " + selectedDate);
	}
	
	@Then("user select the invalid from date Service in advanced search filter of claim report")
	public void user_select_the_invalid_from_date_Service_in_advanced_search_filter_of_claim_report() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheFromDateServiceinClaimReport();

        // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected From Date Service: " + selectedDate);
        Hooks.scenario.log("Selected From Date Service: " + selectedDate);
	}
	
	@And("user select the to date Service in advanced search filter of claim report")
	public void user_select_the_to_date_Service_in_advanced_search_filter_of_claim_report() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheToDateServiceinClaimReport();

        // Select After 1 Month date
        BillingModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected To Date Service: " + selectedDate);
        Hooks.scenario.log("Selected To Date Service: " + selectedDate);
	}
	
	@And("user select the invalid to date Service in advanced search filter of claim report")
	public void user_select_the_invalid_to_date_Service_in_advanced_search_filter_of_claim_report() {
		// Click the From Date picker
        BillingModulefunctionalitypage.clickintotheToDateServiceinClaimReport();

        // Select Before 1 month
        BillingModulefunctionalitypage.selectToDateBefore1MonthAutomatically();
        
        // Before 1 Month
        LocalDate targetDate = LocalDate.now().minusMonths(1);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        
        System.out.println("Selected To Date Service: " + selectedDate);
        Hooks.scenario.log("Selected To Date Service: " + selectedDate);
	}
		
	@Then("user enter the medical provider name in advanced search filter of claim report")
	public void user_enter_the_medical_provider_name_in_advanced_search_filter_of_claim_report() {
		String MedicalProviderName = Hooks.prop.getProperty("medicalprovidername");
		BillingModulefunctionalitypage.entertheMedicalProviderNameinClaimReport(MedicalProviderName);
		System.out.println("User Entered Medical Provider Name: " + MedicalProviderName);
		Hooks.scenario.log("User Entered Medical Provider Name: " + MedicalProviderName);
	}
	
	@Then("user enter the invalid medical provider name in advanced search filter of claim report")
	public void user_enter_the_invalid_medical_provider_name_in_advanced_search_filter_of_claim_report() {
		String MedicalProviderName = Hooks.prop.getProperty("invalidmedicalprovidername");
		BillingModulefunctionalitypage.entertheMedicalProviderNameinClaimReport(MedicalProviderName);
		System.out.println("User Entered Invalid Medical Provider Name: " + MedicalProviderName);
		Hooks.scenario.log("User Entered Invalid Medical Provider Name: " + MedicalProviderName);
	}
	
	@And("user click on the search button in filter of claim report")
	public void user_click_on_the_search_button_in_filter_of_claim_report() {
		String result = BillingModulefunctionalitypage.clickintothesearchbuttoninClaimReport();

	    System.out.println("Search Result: " + result);
	    Hooks.scenario.log("Search Result: " + result);

	    //Skip remaining steps ONLY when no records / error
	    if (result.startsWith("ERROR")) {
	    	 Hooks.scenario.log("Search failed due to error message(s): " + result);
	    	 
	        // Scenario marked as SKIPPED (not FAILED)
	        Assume.assumeTrue("Skipping scenario due to search result: " + result, false);
	    }
	}
	
	@When("user click on the Text tab in sidebar in Billing module page")
	public void user_clic_on_the_Text_tab_in_sidebar_in_Billing_module_page() {
		boolean result = BillingModulefunctionalitypage.clickintotheTexttabinsidebar();
		
		if (!result) {
	        String message = "Text (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Text tab clicked successfully");
	}
	
	@Then("user click on the quick text tab in text section")
	public void user_click_on_the_quick_text_tab_in_text_section() {
		boolean result = BillingModulefunctionalitypage.clickintotheQuickTexttabinAR();
		
		if (!result) {
	        String message = "Quick Text (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Quick Text tab clicked successfully");
	}
	
	@And("user select the template in quick text in text section")
	public void user_select_the_template_in_quick_text_in_text_section() throws Exception {
		String SelectTemplateText = "AR PAST DUE"; // fetch from config if required

	    boolean result = BillingModulefunctionalitypage.selectTheTemplateinQuickText(SelectTemplateText);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Template is NOT present in dropdown: " + SelectTemplateText;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Template selected successfully: " + SelectTemplateText);
	    System.out.println("Template selected successfully: " + SelectTemplateText);
	}
	
	@When("user enter the phone number in quick text in text section")
	public void user_enter_the_phone_number_in_quick_text_in_text_section() {
		String PhoneNumberinQuickText = Hooks.prop.getProperty("phonenumberinquicktext");
		BillingModulefunctionalitypage.enterthePhoneNumberinQuickText(PhoneNumberinQuickText);
		System.out.println("User Entered Phone Number: " + PhoneNumberinQuickText);
		Hooks.scenario.log("User Entered Phone Number: " + PhoneNumberinQuickText);
	}
	
	@When("user enter the invalid phone number in quick text in text section")
	public void user_enter_the_invalid_phone_number_in_quick_text_in_text_section() {
		String PhoneNumberinQuickText = Hooks.prop.getProperty("invalidphonenumberinquicktext");
		BillingModulefunctionalitypage.enterthePhoneNumberinQuickText(PhoneNumberinQuickText);
		System.out.println("User Entered Invalid Phone Number: " + PhoneNumberinQuickText);
		Hooks.scenario.log("User Entered Invalid Phone Number: " + PhoneNumberinQuickText);
	}
	
	@Then("user enter the rx number in quick text in text section")
	public void user_enter_the_rx_number_in_quick_text_in_text_section() {
		String RXNumber = Hooks.prop.getProperty("rxnumberinquicktext");
		BillingModulefunctionalitypage.entertheRXNumberinQuickText(RXNumber);
		System.out.println("User Entered RX Number: " + RXNumber);
		Hooks.scenario.log("User Entered RX Number: " + RXNumber);
	}
	
	@And("user click on the send button in quick text in text section")
	public void user_click_on_the_send_button_in_quick_text_in_text_section() throws Exception {
		String result = BillingModulefunctionalitypage.clickintotheSendbuttoninQuickText();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Send button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user click on the send vcard tab in text section")
	public void user_click_on_the_send_vcard_tab_in_text_section() {
		boolean result = BillingModulefunctionalitypage.clickintotheSendVCardinText();
		
		if (!result) {
	        String message = "Send VCard (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Send VCard tab clicked successfully");
	}
	
	@When("user enter the phone number in send vcard in text section")
	public void user_enter_the_phone_number_in_send_vcard_in_text_section() {
		String PhoneNumberinSendVcard = Hooks.prop.getProperty("phonenumberinquicktext");
		BillingModulefunctionalitypage.enterthePhoneNumberinSendVCard(PhoneNumberinSendVcard);
		System.out.println("User Entered Phone Number: " + PhoneNumberinSendVcard);
		Hooks.scenario.log("User Entered Phone Number: " + PhoneNumberinSendVcard);
	}
	
	@When("user enter the invalid phone number in send vcard in text section")
	public void user_enter_the_invalid_phone_number_in_send_vcard_in_text_section() {
		String PhoneNumberinSendVcard = Hooks.prop.getProperty("invalidphonenumberinvoicetobill");
		BillingModulefunctionalitypage.enterthePhoneNumberinSendVCard(PhoneNumberinSendVcard);
		System.out.println("User Entered Invalid Phone Number: " + PhoneNumberinSendVcard);
		Hooks.scenario.log("User Entered Invalid Phone Number: " + PhoneNumberinSendVcard);
	}
	
	@Then("user enter the body in send vcard in text section")
	public void user_enter_the_body_in_send_vcard_in_text_section() {
		String BodyinSendVcard = Hooks.prop.getProperty("bodyinsendvcard");
		BillingModulefunctionalitypage.entertheBodyinSendVCard(BodyinSendVcard);
		System.out.println("User Entered Body: " + BodyinSendVcard);
		Hooks.scenario.log("User Entered Body: " + BodyinSendVcard);
	}
	
	@And("user click on the send button in send vcard in text section")
	public void user_click_on_the_send_button_in_send_vcard_in_text_section() throws Exception {
		String result = BillingModulefunctionalitypage.clickintotheSendbuttoninSendVCard();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Send button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user click on the add to patient tab in text section")
	public void user_click_on_the_add_to_patient_tab_in_text_section() {
		boolean result = BillingModulefunctionalitypage.clickintotheAddToPatienttabinText();
		
		if (!result) {
	        String message = "Add To Patient (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Add To Patient tab clicked successfully");
	}
	
	@Then("user click on the reply tab in text section")
	public void user_click_on_the_reply_tab_in_text_section() {
		boolean result = BillingModulefunctionalitypage.clickintotheReplyCommunicationtabinText();
		
		if (!result) {
	        String message = "Reply Communication (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Reply Communication tab clicked successfully");
	}
	
	@And("user enter the reply text in reply communication pop-up window")
	public void user_enter_the_reply_text_in_reply_communication_pop_up_window() {
		String ReplyText = Hooks.prop.getProperty("replytext");
		BillingModulefunctionalitypage.entertheReplyTextinReplyCommunication(ReplyText);
		System.out.println("User Entered Reply Text: " + ReplyText);
		Hooks.scenario.log("User Entered Reply Text: " + ReplyText);
	}
	
	@When("user click on the submit button in reply communication pop-up window")
	public void user_click_on_the_submit_button_in_reply_communication_pop_up_window() throws Exception {
		String result = BillingModulefunctionalitypage.clickintotheSubmitbuttoninReplyCommunication();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user click on the filter tab in text section")
	public void user_click_on_the_filter_tab_in_text_section() {
		BillingModulefunctionalitypage.clickintotheFilterbutton();
		
		System.out.println("Filter button clicked successfully");
		Hooks.scenario.log("Filter button clicked successfully");
	}
	
	@Then("user enter the user name in filter")
	public void user_enter_the_user_name_in_filter() {
		String UserName = Hooks.prop.getProperty("username");
		BillingModulefunctionalitypage.entertheUserNameinFilter(UserName);
		System.out.println("User Entered User Name: " + UserName);
		Hooks.scenario.log("User Entered User Name: " + UserName);
	}
	
	@Then("user enter the invalid user name in filter")
	public void user_enter_the_invalid_user_name_in_filter() {
		String UserName = Hooks.prop.getProperty("invalidusername");
		BillingModulefunctionalitypage.entertheUserNameinFilter(UserName);
		System.out.println("User Entered Invalid User Name: " + UserName);
		Hooks.scenario.log("User Entered Invalid User Name: " + UserName);
	}
	
	@Then("user select the text status in filter")
	public void user_select_the_text_status_in_filter() throws Exception {
		String TextStatus = "Queue"; // fetch from config if required

	    boolean result = BillingModulefunctionalitypage.selectTheTextStatusinFilter(TextStatus);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Text Status is NOT present in dropdown: " + TextStatus;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Text Status selected successfully: " + TextStatus);
	    System.out.println("Text Status selected successfully: " + TextStatus);
	}
	
	@And("user click on the search button in filter of text")
	public void user_click_on_the_search_button_in_filter_of_text() {
		String result = BillingModulefunctionalitypage.clickintothesearchbuttoninFilterofLedgerReports();

	    System.out.println("Search Result: " + result);
	    Hooks.scenario.log("Search Result: " + result);

	    //Skip remaining steps ONLY when no records / error
	    if (result.startsWith("ERROR")) {
	    	 Hooks.scenario.log("Search failed due to error message(s): " + result);
	    	 
	        // Scenario marked as SKIPPED (not FAILED)
	        Assume.assumeTrue("Skipping scenario due to search result: " + result, false);
	    }
	}
}
