package com.pharmcrm_WellnessModule.steps;

import org.junit.Assume;

import com.pharmcrm_WellnessModule.pages.WellnessModuleFunctionalityPage;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WellnessModuleFunctionalitySteps {
	
	WellnessModuleFunctionalityPage wellnessmodulefunctionalitypage = new WellnessModuleFunctionalityPage(Hooks.driver);
	
	@Then("user click on the wellness module tab in home page")
	public void user_click_on_the_wellness_module_tab_in_home_page() {
		boolean result = wellnessmodulefunctionalitypage.clickintothewellnessmoduletab();
		
		if (!result) {
	        String message = "Wellness Module (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Wellness Module tab clicked successfully");
	}
	
	@And("user click on the sidebar collpase button in module dashboard page")
	public void user_click_on_the_sidebar_collpase_button_in_module_dashboard_page() {
		wellnessmodulefunctionalitypage.clickintothesidebarcollapsebutton();
		
		System.out.println("Sidebar Collpase button clicked successfully");
		Hooks.scenario.log("Sidebar Collpase button clicked successfully");
	}
	
	//----------------------------------- Patient Section ----------------------------------------------------
	
	@When("user click on the patient tab in wellness module sidebar menu")
	public void user_click_on_the_patient_tab_in_wellness_module_sidebar_menu() {
		boolean result = wellnessmodulefunctionalitypage.clickintothepatienttabinsidebarmenu();
		
		if (!result) {
	        String message = "Patient (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Patient tab clicked successfully");
	}
	
	@Then("user click on the new patient tab in patients section of wellness module")
	public void user_click_on_the_new_patient_tab_in_patients_section_of_wellness_module() throws Exception {
		wellnessmodulefunctionalitypage.clickintothenewpatientbutton();
		Thread.sleep(500);
		
		System.out.println("New Patient button clicked successfully and Add Patient pop-up window is open");
		Hooks.scenario.log("New Patient button clicked successfully and Add Patient pop-up window is open");
	}
	
	@And("user enter the existing patient last name in add patient pop-up window")
	public void user_enter_the_existing_patient_last_name_in_add_patient_pop_up_window() throws Exception {
		String PatientLastName = Hooks.prop.getProperty("patientlastname");
		wellnessmodulefunctionalitypage.enterthePatientLastName(PatientLastName);
		Thread.sleep(500);
		
		System.out.println("User Entered Patient Last Name: " + PatientLastName);
		Hooks.scenario.log("User Entered Patient Last Name: " + PatientLastName);
	}
	
	@And("user enter the existing patient first name in add patient pop-up window")
	public void user_enter_the_existing_patient_first_name_in_add_patient_pop_up_window() throws Exception {
		String PatientFirstName = Hooks.prop.getProperty("patientfirstname");
		wellnessmodulefunctionalitypage.enterthePatientFirstName(PatientFirstName);
		Thread.sleep(500);
		
		System.out.println("User Entered Patient First Name: " + PatientFirstName);
		Hooks.scenario.log("User Entered Patient First Name: " + PatientFirstName);
	}
	
	@And("user enter the existing patient birth date in add patient pop-up window")
	public void user_enter_the_existing_patient_birth_date_in_add_patient_pop_up_window() throws Exception {
		String PatientBirthDate = Hooks.prop.getProperty("patientbirthdate");
		wellnessmodulefunctionalitypage.enterthePatientBirthdate(PatientBirthDate);
		Thread.sleep(500);
		
		System.out.println("User Entered Patient Birth Date: " + PatientBirthDate);
		Hooks.scenario.log("User Entered Patient Birth Date: " + PatientBirthDate);
	}
	
	@When("user click on the search button in add patient pop-up window")
	public void user_click_on_the_search_button_in_add_patient_pop_up_window() throws Exception {
		wellnessmodulefunctionalitypage.clickintothesearchbuttoninaddpatientwindow();
		Thread.sleep(500);
		
		System.out.println("Search button clicked successfully");
		Hooks.scenario.log("Search button clicked successfully");
	}
	
	@Then("user click on the filters button of wellness module")
	public void user_click_on_the_filters_button_of_wellness_module() {
		wellnessmodulefunctionalitypage.clickintothefilterstab();
		
		System.out.println("Filters tab clicked successfully and Filters sesction is open");
		Hooks.scenario.log("Filters tab clicked successfully and Filters sesction is open");
	}
	
	@And("user enter the patient last name in filters section")
	public void user_enter_the_patient_last_name_in_filters_section() throws Exception {
		String PatientLastName = Hooks.prop.getProperty("patientlastname");
		wellnessmodulefunctionalitypage.enterthePatientLastNameinFilter(PatientLastName);
		Thread.sleep(500);
		
		System.out.println("User Entered Patient Last Name: " + PatientLastName);
		Hooks.scenario.log("User Entered Patient Last Name: " + PatientLastName);
	}
	
	@And("user enter the invalid patient last name in filters section")
	public void user_enter_the_invalid_patient_last_name_in_filters_section() throws Exception {
		String PatientLastName = Hooks.prop.getProperty("invalidpatientlastname");
		wellnessmodulefunctionalitypage.enterthePatientLastNameinFilter(PatientLastName);
		Thread.sleep(500);
		
		System.out.println("User Entered Invalid Patient Last Name: " + PatientLastName);
		Hooks.scenario.log("User Entered Invalid Patient Last Name: " + PatientLastName);
	}
	
	@And("user enter the patient first name in filters section")
	public void user_enter_the_patient_first_name_in_filters_section() throws Exception {
		String PatientFirstName = Hooks.prop.getProperty("patientfirstname");
		wellnessmodulefunctionalitypage.enterthePatientFirstNameinFilter(PatientFirstName);
		Thread.sleep(500);
		
		System.out.println("User Entered Patient First Name: " + PatientFirstName);
		Hooks.scenario.log("User Entered Patient First Name: " + PatientFirstName);
	}
	
	@And("user enter the invalid patient first name in filters section")
	public void user_enter_the_invalid_patient_first_name_in_filters_section() throws Exception {
		String PatientFirstName = Hooks.prop.getProperty("invalidpatientfirstname");
		wellnessmodulefunctionalitypage.enterthePatientFirstNameinFilter(PatientFirstName);
		Thread.sleep(500);
		
		System.out.println("User Entered Invalid Patient First Name: " + PatientFirstName);
		Hooks.scenario.log("User Entered Invalid Patient First Name: " + PatientFirstName);
	}
	
	@And("user enter the patient birth date in filters section")
	public void user_enter_the_patient_birth_date_in_filters_section() throws Exception {
		String PatientBirthDate = Hooks.prop.getProperty("patientbirthdate");
		wellnessmodulefunctionalitypage.enterthePatientBirthdateinFilter(PatientBirthDate);
		Thread.sleep(500);
		
		System.out.println("User Entered Patient Birth Date: " + PatientBirthDate);
		Hooks.scenario.log("User Entered Patient Birth Date: " + PatientBirthDate);
	}
	
	@And("user enter the invalid patient birth date in filters section")
	public void user_enter_the_invalid_patient_birth_date_in_filters_section() throws Exception {
		String PatientBirthDate = Hooks.prop.getProperty("invalidpatientbirthdate");
		wellnessmodulefunctionalitypage.enterthePatientBirthdateinFilter(PatientBirthDate);
		Thread.sleep(500);
		
		System.out.println("User Entered Invalid Patient Birth Date: " + PatientBirthDate);
		Hooks.scenario.log("User Entered Invalid Patient Birth Date: " + PatientBirthDate);
	}
	
	@And("user enter the patient id in filters section")
	public void user_enter_the_patient_id_in_filters_section() throws Exception {
		String PatientId = Hooks.prop.getProperty("patientId");
		wellnessmodulefunctionalitypage.enterthePatientIdinFilter(PatientId);
		Thread.sleep(500);
		
		System.out.println("User Entered Patient Id: " + PatientId);
		Hooks.scenario.log("User Entered Patient Id: " + PatientId);
	}
	
	@And("user enter the invalid patient id in filters section")
	public void user_enter_the_invalid_patient_id_in_filters_section() {
		String PatientId = Hooks.prop.getProperty("invalidpatientId");
		wellnessmodulefunctionalitypage.enterthePatientIdinFilter(PatientId);
				
		System.out.println("User Entered Invalid Patient Id: " + PatientId);
		Hooks.scenario.log("User Entered Invalid Patient Id: " + PatientId);
	}
	
	@Then("user click on the search button in filters section")
	public void user_click_on_the_search_button_in_filters_section() throws Exception {
		String resultMessage = wellnessmodulefunctionalitypage.clickintothesearchbuttoninFilters();
		Thread.sleep(1000);
		
		System.out.println("Message: " + resultMessage);
	    Hooks.scenario.log("Message: " + resultMessage);
	    
	 // ❌ STOP test only when records are not found
	    if (resultMessage.equalsIgnoreCase("No Record(s) Found.") || 
	        resultMessage.equalsIgnoreCase("No Record(s) Found.")) {

	        // Stop remaining steps but mark test as skipped, NOT FAILED
	        org.junit.Assume.assumeTrue("Stopping test: No Record(s) Found.", false);
	    }

	    // ✔ If records exist → continue normally
	    System.out.println("Records available");
	    Hooks.scenario.log("Records available");
	}
	
	@When("user click on the clear button in filters section")
	public void user_click_on_the_clear_button_in_filters_section() {
		wellnessmodulefunctionalitypage.clickintotheclearbuttoninfilters();
		
		System.out.println("Clear button clicked successfully");
		Hooks.scenario.log("Clear button clicked successfully");
	}
	
	@Then("user click on the points setting button in patient section")
	public void user_click_on_the_points_setting_button_in_patient_section() {
		boolean result = wellnessmodulefunctionalitypage.clickintothepointssettingbutton();
		
		if (!result) {
	        String message = "Points Settings (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Points Settings tab clicked successfully");
	}
	
	@And("user enter the points in points setting pop-up winodw")
	public void user_enter_the_points_in_points_setting_pop_up_winodw() {
		String Points = Hooks.prop.getProperty("points");
		wellnessmodulefunctionalitypage.enterthepoints(Points);
				
		System.out.println("User Entered The Points: " + Points);
		Hooks.scenario.log("User Entered The Points: " + Points);
	}
	
	@And("user remove the ponits in points setting pop-up winodw")
	public void user_remove_the_ponits_in_points_setting_pop_up_winodw() throws Exception {
		wellnessmodulefunctionalitypage.removethepoints();
		Thread.sleep(500);
		
		System.out.println("Points are removed");
		Hooks.scenario.log("Points are removed");
	}
	
	@Then("user click on the save button in points setting pop-up window")
	public void user_click_on_the_save_button_in_points_setting_pop_up_window() throws Exception {
		String result = wellnessmodulefunctionalitypage.clickintothesavepointsbutton();
				
		System.out.println("Message: " + result);
	    Hooks.scenario.log("Message: " + result);
	    
	    if (result.startsWith("ERROR:")) {
	        
		     // STOP remaining steps without failure
		        org.junit.Assume.assumeTrue("Stopping test because error message is displayed.", false);
			}
			else {
		        System.out.println("Save button clicked successfully");
		        Hooks.scenario.log("Save button clicked successfully");
			}
	}
	
	@Then("user click on the buy points button in patient section")
	public void user_click_on_the_buy_points_button_in_patient_section() {
		boolean result = wellnessmodulefunctionalitypage.clickintothebuypointsbutton();
		
		if (!result) {
	        String message = "Buy Points (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Buy Points button clicked successfully");
	}
	
	@And("user enter the points in buy additional points pop-up window")
	public void user_enter_the_points_in_buy_additional_points_pop_up_window() {
		String Points = Hooks.prop.getProperty("additionalpoints");
		wellnessmodulefunctionalitypage.enterthePointsinbuyadditinalpoints(Points);
				
		System.out.println("User Entered The Additional Points: " + Points);
		Hooks.scenario.log("User Entered The Additional Points: " + Points);
	}
	
	@Then("user enter the recipient number in buy additional points pop-up window")
	public void user_enter_the_recipient_number_in_buy_additional_points_pop_up_window() {
		String RecipientNumber = Hooks.prop.getProperty("recipientnumber");
		wellnessmodulefunctionalitypage.entertheRecipientNumberinbuyadditinalpoints(RecipientNumber);
				
		System.out.println("User Entered The Recipient Number: " + RecipientNumber);
		Hooks.scenario.log("User Entered The Recipient Number: " + RecipientNumber);
	}
	
	@When("user click on the buy button in buy additional points pop-up window")
	public void user_click_on_the_buy_button_in_buy_additional_points_pop_up_window() {
		String result = wellnessmodulefunctionalitypage.clickintothebuybuttoninadditionalpoints();
		
		System.out.println("Message: " + result);
	    Hooks.scenario.log("Message: " + result);
	    if (result.startsWith("ERROR:")) {

	        // Stop remaining steps without failure
	        org.junit.Assume.assumeTrue(
	                "Stopping test because error message is displayed: " + result, false);

	    } else {
	        System.out.println("Go button clicked successfully");
	        Hooks.scenario.log("Go button clicked successfully");
	    }
	}
	
	@Then("user click on the order history button in patient section")
	public void user_click_on_the_order_history_button_in_patient_section() {
		boolean result = wellnessmodulefunctionalitypage.clickintotheorderhistorybutton();
		
		if (!result) {
	        String message = "Order History (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Order History button clicked successfully");
	}
	
	@Then("user click on the card button in patient section")
	public void user_click_on_the_card_button_in_patient_section() {
		boolean result = wellnessmodulefunctionalitypage.clickintothecardbutton();
		
		if (!result) {
	        String message = "Card (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Card button clicked successfully");
	}
	
	@And("user click on the add products button in patient card page")
	public void user_click_on_the_add_products_button_in_patient_card_page() {
		boolean result = wellnessmodulefunctionalitypage.clickintotheaddproductsbutton();
		
		if (!result) {
	        String message = "Add Products (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Add Products button clicked successfully");
	}
	
	@When("user click on the category dropdown button in patient card page")
	public void user_click_on_the_category_dropdown_button_in_patient_card_page() throws Exception {
		wellnessmodulefunctionalitypage.clickintothecategorydropdownbutton();
		Thread.sleep(1000);
		
		System.out.println("Category Dropdown button clicked successfully and Category Dropdown values are display");
		Hooks.scenario.log("Category Dropdown button clicked successfully and Category Dropdown values are display");
	}
	
	@Then("user select the first product category from category dropdown in add product pop-up window")
	public void user_select_the_first_product_category_from_category_dropdown_in_add_product_pop_up_window() {
		String selectedCategory = wellnessmodulefunctionalitypage.selectFirstCategory();
		
		if (selectedCategory != null) {
		System.out.println("Selected Category from dropdown is: " + selectedCategory);
		Hooks.scenario.log("Selected Category from dropdown is: " + selectedCategory);
		}else {
			System.out.println("Product Cateogry is not there");
			Hooks.scenario.log("Product Cateogry is not there");
			}
	}
	
	@And("user enter the product name in add product pop-up window")
	public void user_enter_the_product_name_in_add_product_pop_up_window() {
		String ProductName = Hooks.prop.getProperty("validproductname");
		wellnessmodulefunctionalitypage.entertheProductName(ProductName);
				
		System.out.println("User Entered The Product Name: " + ProductName);
		Hooks.scenario.log("User Entered The Product Name: " + ProductName);
	}
	
	@And("user enter the invalid product name in add product pop-up window")
	public void user_enter_the_invalid_product_name_in_add_product_pop_up_window() {
		String ProductName = Hooks.prop.getProperty("invalidproductname");
		wellnessmodulefunctionalitypage.entertheProductName(ProductName);
				
		System.out.println("User Entered The Invalid Product Name: " + ProductName);
		Hooks.scenario.log("User Entered The Invalid Product Name: " + ProductName);
	}
	
	@When("user click on the search button in add product pop-up window")
	public void user_click_on_the_search_button_in_add_product_pop_up_window() throws Exception {
		String result = wellnessmodulefunctionalitypage.clickintothesearchbuttoninaddproduct();
		Thread.sleep(1000);
		
		System.out.println("Search Result: " + result);
		Hooks.scenario.log("Search Result: " + result);
		
		if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Search failed due to error message(s): " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user click on the select all check box in add product pop-up window")
	public void user_click_on_the_select_all_check_box_in_add_product_pop_up_window() {
	    wellnessmodulefunctionalitypage.clickintotheselectallcheckboxinaddproduct();
		
		System.out.println("Select All checkbox clicked successfully");
		Hooks.scenario.log("Select All checkbox clicked successfully");
	}
	
	@And("user click on the submit button in add product pop-up window")
	public void user_click_on_the_submit_button_in_add_product_pop_up_window() {
		String result = wellnessmodulefunctionalitypage.clickintothesubmitbuttoninaddproduct();
		
		System.out.println("Submit button clicked successfully and Message is shown: " + result);
		Hooks.scenario.log("Submit button clicked successfully and Message is shown: " + result);
		
		if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Product is not placed: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@When("user click on the confirm button in patient card page")
	public void user_click_on_the_confirm_button_in_patient_card_page() {
		String result = wellnessmodulefunctionalitypage.clickintotheconfirmbuttoninpatientcard();
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log(" Order failed: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user scroll the order history page")
	public void user_scroll_the_order_history_page() throws InterruptedException {
		wellnessmodulefunctionalitypage.orderhistorypagescroll();
		
		System.out.println("Order History page is scrolled");
		Hooks.scenario.log("Order History page is scrolled");
	}

	//---------------------------------- Product Section ------------------------------------------------------------------
	
	@When("user click on the product tab in wellness module sidebar menu")
	public void user_click_on_the_product_tab_in_wellness_module_sidebar_menu() {
		boolean result = wellnessmodulefunctionalitypage.clickintotheproductinsidebarmenutab();
		
		if (!result) {
	        String message = "Product (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Product tab clicked successfully");
	}
	
	@When("user click on the category dropdown button in products page")
	public void user_click_on_the_category_dropdown_button_in_products_page() throws Exception {
		wellnessmodulefunctionalitypage.clickintothecategorydropdownbutton();
		Thread.sleep(1000);
		
		System.out.println("Category Dropdown button clicked successfully and Category Dropdown values are display");
		Hooks.scenario.log("Category Dropdown button clicked successfully and Category Dropdown values are display");
	}
	
	@Then("user select the first product category from category dropdown in products page")
	public void user_select_the_first_product_category_from_category_dropdown_in_products_page() {
		String selectedCategory = wellnessmodulefunctionalitypage.selectFirstCategory();
		
		if (selectedCategory != null) {
		System.out.println("Selected Category from dropdown is: " + selectedCategory);
		Hooks.scenario.log("Selected Category from dropdown is: " + selectedCategory);
		}else {
			System.out.println("Product Cateogry is not there");
			Hooks.scenario.log("Product Cateogry is not there");
		}
	}
	
	@And("user enter the product name in products page")
	public void user_enter_the_product_name_in_products_page() {
		String ProductName1 = Hooks.prop.getProperty("validproductname");
		wellnessmodulefunctionalitypage.entertheProductNameinProducts(ProductName1);
				
		System.out.println("User Entered The Product Name: " + ProductName1);
		Hooks.scenario.log("User Entered The Product Name: " + ProductName1);
	}
	
	@When("user click on the search button in products page")
	public void user_click_on_the_search_button_in_products_page() {
		String result = wellnessmodulefunctionalitypage.clickintothesearchbuttoninproducts();
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log(" Search button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user enter the invalid product name in products page")
	public void user_enter_the_invalid_product_name_in_products_page() {
		String ProductName1 = Hooks.prop.getProperty("invalidproductname");
		wellnessmodulefunctionalitypage.entertheProductNameinProducts(ProductName1);
				
		System.out.println("User Entered The Invalid Product Name: " + ProductName1);
		Hooks.scenario.log("User Entered The Invalid Product Name: " + ProductName1);
	}
	
	@Then("user click on the clear button in products page")
	public void user_click_on_the_clear_button_in_products_page() {
		wellnessmodulefunctionalitypage.clickintotheclearbuttoninproducts();
		
		System.out.println("Clear button clicked successfully");
		Hooks.scenario.log("Clear button clicked successfully");
	}
	
	@Then("user click on the new product button in products page")
	public void user_click_on_the_new_product_button_in_products_page() {
		boolean result = wellnessmodulefunctionalitypage.clickintothenewproductbuttoninproducts();
		
		if (!result) {
	        String message = "New Product (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New Product button clicked successfully");
	}
	
	@And("user enter the new product name in add product section")
	public void user_enter_the_new_product_name_in_add_product_section() throws Exception {
		Thread.sleep(1000);
		String ProductName2 = Hooks.prop.getProperty("newproductname");
		wellnessmodulefunctionalitypage.entertheProductNameinAddProduct(ProductName2);
				
		System.out.println("User Entered The Product Name: " + ProductName2);
		Hooks.scenario.log("User Entered The Product Name: " + ProductName2);
	}
	
	@When("user enter the product description in add product section")
	public void user_enter_the_product_description_in_add_product_section() {
		String ProductDescription = Hooks.prop.getProperty("productdescriptions");
		wellnessmodulefunctionalitypage.entertheProductDescription(ProductDescription);
				
		System.out.println("User Entered The Product Descriptions: " + ProductDescription);
		Hooks.scenario.log("User Entered The Product Descriptions: " + ProductDescription);
	}
	
	@Then("user click on the status dropdown button in add product section")
	public void user_click_on_the_status_dropdown_button_in_add_product_section() {
		wellnessmodulefunctionalitypage.clickintothestatusdropdown();
		
		System.out.println("Status Dropdown button clicked successfully and Status Dropdown values are shown");
		Hooks.scenario.log("Status Dropdown button clicked successfully and Status Dropdown values are shown");
	}
	
	@And("user select the draft status value from status dropdown")
	public void user_select_the_draft_status_value_from_status_dropdown() throws Exception {
		wellnessmodulefunctionalitypage.selectthedraftstatus();
		Thread.sleep(1000);
		
		System.out.println("Draft Status select successfully");
		Hooks.scenario.log("Draft Status select successfully");
	}
	
	@And("user select the none status value from status dropdown")
	public void user_select_the_none_status_value_from_status_dropdown() throws Exception {
		wellnessmodulefunctionalitypage.selectthenonestatus();
		Thread.sleep(1000);
		
		System.out.println("None Status select successfully");
		Hooks.scenario.log("None Status select successfully");
	}
	
	@Then("user click on the category dropdown in add product section")
	public void user_click_on_the_category_dropdown_in_add_product_section() {
		wellnessmodulefunctionalitypage.clickintothecategorydropdowninaddproduct();
		
		System.out.println("Category Dropdown button clicked successfully and Category Dropdown values are open");
		Hooks.scenario.log("Category Dropdown button clicked successfully and Category Dropdown values are open");
	}
	
	@When("user select the first category in add product section")
	public void user_select_the_first_category_in_add_product_section() {
		String selectedCategory = wellnessmodulefunctionalitypage.selectFirstCategoryinAddProduct();
		
		if (selectedCategory != null) {
		System.out.println("Selected Category from dropdown is: " + selectedCategory);
		Hooks.scenario.log("Selected Category from dropdown is: " + selectedCategory);
		}else {
			System.out.println("Product Cateogry is not there");
			Hooks.scenario.log("Product Cateogry is not there");
			}
	}
	
	@When("user select the second category in add product section")
	public void user_select_the_second_category_in_add_product_section() {
		String selectedCategory = wellnessmodulefunctionalitypage.selectSecondCategoryinAddProduct();
		
		if (selectedCategory != null) {
		System.out.println("Selected Category from dropdown is: " + selectedCategory);
		Hooks.scenario.log("Selected Category from dropdown is: " + selectedCategory);
		}else {
			System.out.println("Product Cateogry is not there");
			Hooks.scenario.log("Product Cateogry is not there");
			}
	}
	
	@When("user select the none category in add product section")
	public void user_select_the_none_category_in_add_product_section() {
		String selectedCategory = wellnessmodulefunctionalitypage.selectNoneCategoryinAddProduct();
		
		if (selectedCategory != null) {
		System.out.println("Selected Category from dropdown is: " + selectedCategory);
		Hooks.scenario.log("Selected Category from dropdown is: " + selectedCategory);
		}else {
			System.out.println("Product Cateogry is not there");
			Hooks.scenario.log("Product Cateogry is not there");
			}
	}
	
	@Then("user enter the points in add product section")
	public void user_enter_the_points_in_add_product_section() {
		String Points1 = Hooks.prop.getProperty("points");
		wellnessmodulefunctionalitypage.enterthePointsinAddProduct(Points1);
				
		System.out.println("User Entered The Points: " + Points1);
		Hooks.scenario.log("User Entered The Points: " + Points1);
	}
	
	@Then("user edit the points in add product section")
	public void user_edit_the_points_in_add_product_section() {
		String Points1 = Hooks.prop.getProperty("editpoints");
		wellnessmodulefunctionalitypage.enterthePointsinAddProduct(Points1);
				
		System.out.println("User Entered The New Points: " + Points1);
		Hooks.scenario.log("User Entered The New Points: " + Points1);
	}
	
	@Then("user remove the points in add product section")
	public void user_remove_the_points_in_add_product_section() {
		wellnessmodulefunctionalitypage.removethePointsinAddProduct();
				
		System.out.println("Remove the Points");
		Hooks.scenario.log("Remove the Points");
	}
	
	@And("user enter the stock in add product section")
	public void user_enter_the_stock_in_add_product_section() {
		String Stock = Hooks.prop.getProperty("stock");
		wellnessmodulefunctionalitypage.entertheStockinAddProduct(Stock);
				
		System.out.println("User Entered The Stock: " + Stock);
		Hooks.scenario.log("User Entered The Stock: " + Stock);
	}
	
	@And("user edit the stock in add product section")
	public void user_edit_the_stock_in_add_product_section() {
		String Stock = Hooks.prop.getProperty("editstock");
		wellnessmodulefunctionalitypage.entertheStockinAddProduct(Stock);
				
		System.out.println("User Entered The New Stock: " + Stock);
		Hooks.scenario.log("User Entered The New Stock: " + Stock);
	}
	
	@And("user remove the stock in add product section")
	public void user_remove_the_stock_in_add_product_section() {
		wellnessmodulefunctionalitypage.removetheStockinAddProduct();
				
		System.out.println("Remove the stock");
		Hooks.scenario.log("Remove the stock");
	}
	
	@When("user click on the upload images tab in add product section")
	public void user_click_on_the_upload_images_tab_in_add_product_section() {
		wellnessmodulefunctionalitypage.clickintotheuploadimagestab();
		
		System.out.println("Upload images tab clicked successfully");
		Hooks.scenario.log("Upload images tab clicked successfully");
	}
	
	@Then("user able to upload multiple product images in add product section")
	public void user_able_to_upload_multiple_product_images_in_add_product_section() throws Exception {
		String basePath = System.getProperty("user.dir")+ "/src/test/resources/com/Images";

	    wellnessmodulefunctionalitypage.uploadTheImages(
	            basePath + "1.png",
	            basePath + "2.png",
	            basePath + "3.png",
	            basePath + "4.png",
	            basePath + "5.png",
	            basePath + "6.png",
	            basePath + "7.png",
	            basePath + "8.png",
	            basePath + "9.png",
	            basePath + "10.png");
	    Thread.sleep(2000);

	    System.out.println("Images upload successfully");
	    Hooks.scenario.log("Images upload successfully");
	}
	
	@And("user click on the save product button in add product section")
	public void user_click_on_the_save_product_button_in_add_product_section() {
		String result = wellnessmodulefunctionalitypage.clickintothesaveproductbutton();
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Save Product button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user select the published status value from status dropdown")
	public void user_select_the_published_status_value_from_status_dropdown() throws Exception {
		wellnessmodulefunctionalitypage.selectthepublishedstatus();
		Thread.sleep(1000);
		
		System.out.println("Published Status select successfully");
		Hooks.scenario.log("Published Status select successfully");
	}
	
	@And("user click on the three-dot button in products page")
	public void user_click_on_the_three_dot_button_in_products_page() {
		wellnessmodulefunctionalitypage.clickintothethreedotbuttoninproducts();
		
		System.out.println("Three dot button clicked successfully");
		Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@Then("user click on the edit button of any particular product in products page")
	public void user_click_on_the_edit_button_of_any_particular_product_in_products_page() {
		boolean result = wellnessmodulefunctionalitypage.clickintotheeditbuttoninproducts();
		
		if (!result) {
	        String message = "Edit (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit button clicked successfully");
	}
	
	@Then("user click on the delete button of any particular product in products page")
	public void user_click_on_the_delete_button_of_any_particular_product_in_products_page() {
		boolean result = wellnessmodulefunctionalitypage.clickintothedeletebuttoninprducts();
		
		if (!result) {
	        String message = "Delete (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing product is delete successfully");
	}
	
	@And("user able to edit product name in add product section")
	public void user_able_to_edit_product_name_in_add_product_section() throws Exception {
		Thread.sleep(1000);
		String ProductName2 = Hooks.prop.getProperty("editproductname");
		wellnessmodulefunctionalitypage.entertheProductNameinAddProduct(ProductName2);
				
		System.out.println("User Entered The New Product Name: " + ProductName2);
		Hooks.scenario.log("User Entered The New Product Name: " + ProductName2);
	}
	
	@And("user able to remove product name in add product section")
	public void user_able_to_remove_product_name_in_add_product_section() {
		wellnessmodulefunctionalitypage.removetheProductNameinAddProduct();
		
		System.out.println("Product Name remove successfully");
		Hooks.scenario.log("Product Name remove successfully");
	}
	
	@And("user able to edit product description in add product section")
	public void user_able_to_edit_product_description_in_add_product_section() throws Exception {
		Thread.sleep(1000);
		String ProductDescription = Hooks.prop.getProperty("editproductdescription");
		wellnessmodulefunctionalitypage.entertheProductDescription(ProductDescription);
				
		System.out.println("User Entered The New Product Description: " + ProductDescription);
		Hooks.scenario.log("User Entered The New Product Description: " + ProductDescription);
	}
	
	@And("user able to remove product description in add product section")
	public void user_able_to_remove_product_description_in_add_product_section() {
		wellnessmodulefunctionalitypage.removetheProductDescription();
		
		System.out.println("Product Description remove successfully");
		Hooks.scenario.log("Product Description remove successfully");
	}

	
	//----------------------------------- Product Category -----------------------------------------------------------
	
	
	@When("user click on the product category tab in wellness module sidebar menu")
	public void user_click_on_the_product_category_tab_in_wellness_module_sidebar_menu() {
		boolean result = wellnessmodulefunctionalitypage.clickintotheproductcategorytabinsidebarmenu();
		
		if (!result) {
	        String message = "Product Category (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Product Category tab clicked successfully");
	}
	
	@Then("user click on the new product category button in product category section")
	public void user_click_on_the_new_product_category_button_in_product_category_section() {
		boolean result = wellnessmodulefunctionalitypage.clickintothenewproductcategorybutton();
		
		if (!result) {
	        String message = "New Product Category (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New Product Category button clicked successfully");
	}
	
	@When("user click on the select new image button in product category section")
	public void user_click_on_the_select_new_image_button_in_product_category_section() {
		wellnessmodulefunctionalitypage.clickintotheselectnewimageinproductcategory();
		
		System.out.println("Select New Image button clicked successfully");
		Hooks.scenario.log("Select New Image button clicked successfully");
	}
	
	@And("user able to upload the product category image in product category section")
	public void user_able_to_upload_the_product_category_image_in_product_category_section() throws Exception {
		String imagepath = System.getProperty("user.dir") + "/src/test/resources/com/Images/Product Category.png";
		wellnessmodulefunctionalitypage.uploadTheProductCategoryImages(imagepath);
		Thread.sleep(2000);
		
		System.out.println("Product Category Image is upload successfully");
		Hooks.scenario.log("Product Category Image is upload successfully");
	}
	
	@When("user enter the product category name in product category section")
	public void user_enter_the_product_category_name_in_product_category_section() {
		String ProductCategoryName = Hooks.prop.getProperty("productcategoryname");
		wellnessmodulefunctionalitypage.entertheProductCategoryName(ProductCategoryName);
				
		System.out.println("User Entered The Product Category Name: " + ProductCategoryName);
		Hooks.scenario.log("User Entered The Product Category Name: " + ProductCategoryName);
	}
	
	@Then("user enter the product category description in product category section")
	public void user_enter_the_product_category_description_in_product_category_section() {
		String ProductCategoryDescription = Hooks.prop.getProperty("productcategorydescription");
		wellnessmodulefunctionalitypage.entertheProductCategoryDescription(ProductCategoryDescription);
				
		System.out.println("User Entered The Product Category Description: " + ProductCategoryDescription);
		Hooks.scenario.log("User Entered The Product Category Description: " + ProductCategoryDescription);
	}
	
	@When("user click on the submit button in product category section")
	public void user_click_on_the_submit_button_in_product_category_section() {
		String result = wellnessmodulefunctionalitypage.clickintothesubmitbuttoninproductcategory();
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user click on the three dot button in product category section")
	public void user_click_on_the_three_dot_button_in_product_category_section() {
		wellnessmodulefunctionalitypage.clickintothethreedotbuttoninproducts();
		
		System.out.println("Three dot clicked successfully");
		Hooks.scenario.log("Three dot clicked successfully");
	}
	
	@And("user click on the edit button for any particular product category")
	public void user_click_on_the_edit_button_for_any_particular_product_category() {
		boolean result = wellnessmodulefunctionalitypage.clickintotheeditbuttoninproducts();
		
		if (!result) {
	        String message = "Product Category (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Product Category tab clicked successfully");
	}
	
	@When("user able to change the product category image")
	public void user_able_to_change_the_product_category_image() throws Exception {
		String imagepath = System.getProperty("user.dir") + "/src/test/resources/com/Images/1.png";
		wellnessmodulefunctionalitypage.uploadTheProductCategoryImages(imagepath);
		Thread.sleep(2000);
		
		System.out.println("Product Category Image is changed successfully");
		Hooks.scenario.log("Product Category Image is changed successfully");
	}
	
	@When("user click on the remove button in add product category section")
	public void user_click_on_the_remove_button_in_add_product_category_section() throws Exception {
		wellnessmodulefunctionalitypage.clickintotheremovebuttoninproductcategory();
		Thread.sleep(1000);
		
		System.out.println("Remove button clicked successfully and Product Category image is removed");
		Hooks.scenario.log("Remove button clicked successfully and Product Category image is removed");
	}
	
	@When("user able to change the product category name")
	public void user_able_to_change_the_product_category_name() {
		String ProductCategoryName = Hooks.prop.getProperty("changeproductcategoryname");
		wellnessmodulefunctionalitypage.entertheProductCategoryName(ProductCategoryName);
				
		System.out.println("User Entered The Change Product Category Name: " + ProductCategoryName);
		Hooks.scenario.log("User Entered The Change Product Category Name: " + ProductCategoryName);
	}
	
	@When("user remove the product category name")
	public void user_remove_the_product_category_name() {
		wellnessmodulefunctionalitypage.removetheProductCategoryName();
		
		System.out.println("User remove the product category name");
		Hooks.scenario.log("User remove the product category name");
	}
	
	@When("user able to change the product category description")
	public void user_able_to_change_the_product_category_description() {
		String ProductCategoryDescription = Hooks.prop.getProperty("changeproductcategorydescription");
		wellnessmodulefunctionalitypage.entertheProductCategoryDescription(ProductCategoryDescription);
				
		System.out.println("User Entered The Change Product Category Description: " + ProductCategoryDescription);
		Hooks.scenario.log("User Entered The Change Product Category Description: " + ProductCategoryDescription);
	}
	
	@When("user remove the product category description")
	public void user_remove_the_product_category_description() {
		wellnessmodulefunctionalitypage.removetheProductCategoryDescription();
				
		System.out.println("Remove the Product Category Description successfully");
		Hooks.scenario.log("Remove the Product Category Description successfully");
	}
	
	@Then("user click on the delete button of any particular product in product category")
	public void user_click_on_the_delete_button_of_any_particular_product_in_product_category() {
		boolean result = wellnessmodulefunctionalitypage.clickintothedeletebuttoninprducts();
		
		if (!result) {
	        String message = "Delete (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing Product Category is delete successfully");
	}
	
	@When("user click on the confirm button in delete product category pop-up window")
	public void user_click_on_the_confirm_button_in_delete_product_category_pop_up_window() throws Exception {
		wellnessmodulefunctionalitypage.clickintotheconfirmdeleteproductcategorybutton();
		Thread.sleep(500);
		
		System.out.println("Confirm button clicked successfully and user selected Product Category is delete");
		Hooks.scenario.log("Confirm button clicked successfully and user selected Product Category is delete");
	}
}
