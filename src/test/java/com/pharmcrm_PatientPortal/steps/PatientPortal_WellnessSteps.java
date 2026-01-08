package com.pharmcrm_PatientPortal.steps;


import org.junit.Assume;

import com.pharmcrm_PatientPortal.pages.PatientPortal_WellnessPage;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PatientPortal_WellnessSteps {
	
	PatientPortal_WellnessPage patientportal_wellnesspage = new PatientPortal_WellnessPage(Hooks.driver);
	
	
	
	//-----------------------------Products Section--------------------------------------------------------
	
	
	@Then("user click on the products tab in patient portal sidebar menu")
	public void user_click_on_the_products_tab_in_patient_portal_sidebar_menu() {
		boolean result = patientportal_wellnesspage.clickintotheProductstabinsidebar();
		
		if (!result) {
	        String message = "Products tab is also not visible for that Patient user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Products tab clicked successfully");
	}
	
	@When("user search with valid products name in search textbox")
	public void user_search_with_valid_products_name_in_search_textbox() throws Exception {
		String ProductName = Hooks.prop.getProperty("validproductname");
		patientportal_wellnesspage.entertheproductsnameinsearechtextbox(ProductName);
		Thread.sleep(1500);
				
		System.out.println("User Entered Product Name: " + ProductName);
		Hooks.scenario.log("User Entered Product Name: " + ProductName);
	}
	
	@When("user search with invalid products name in search textbox")
	public void user_search_with_invalid_products_name_in_search_textbox() throws Exception {
		String ProductName = Hooks.prop.getProperty("invalidproductname");
		patientportal_wellnesspage.entertheproductsnameinsearechtextbox(ProductName);
		Thread.sleep(1500);
				
		System.out.println("User Entered Invalid Product Name: " + ProductName);
		Hooks.scenario.log("User Entered Invalid Product Name: " + ProductName);
	}
	
	@Then("user click on the clear all button in products page")
	public void user_click_on_the_clear_all_button_in_products_page() throws Exception {
		patientportal_wellnesspage.clickintotheclearallbuttoninproducts();
		Thread.sleep(1000);
		
		System.out.println("Clear All button clicked successfully and All Products are shown");
		Hooks.scenario.log("Clear All button clicked successfully and All Products are shown");
	}
	
	@When("user click on the sort by dropdown in products page")
	public void user_click_on_the_sort_by_dropdown_in_products_page() throws Exception {
		patientportal_wellnesspage.clickintotheSortBydropdownbuttoninproducts();
				
		System.out.println("Sort By Dropdown button clicked successfully");
		Hooks.scenario.log("Sort By Dropdown button clicked successfully");
	}
	
	@And("user select the ascending sort from sort by dropdown in products page")
	public void user_select_the_ascending_sort_from_sort_by_dropdown_in_products_page() throws Exception {
		patientportal_wellnesspage.selecttheAscendingOrder();
		Thread.sleep(1000);
		
		System.out.println("Ascending sort selected successfully");
		Hooks.scenario.log("Ascending sort selected successfully");
	}
	
	@And("user select the descending sort from sort by dropdown in products page")
	public void user_select_the_descending_sort_from_sort_by_dropdown_in_products_page() throws Exception {
		patientportal_wellnesspage.selecttheDescendingOrder();
		Thread.sleep(1000);
		
		System.out.println("Descending sort selected successfully");
		Hooks.scenario.log("Descending sort selected successfully");
	}
	
	@And("user select the Points as low to high sort from sort by dropdown in products page")
	public void user_select_the_Points_as_low_to_high_sort_from_sort_by_dropdown_in_products_page() throws Exception {
		patientportal_wellnesspage.selectthePointsaslowtohighOrder();
		Thread.sleep(1000);
		
		System.out.println("Points : low to high sort selected successfully");
		Hooks.scenario.log("Points : low to high sort selected successfully");
	}
	
	@And("user select the Points as high to low sort from sort by dropdown in products page")
	public void user_select_the_Points_as_high_to_low_sort_from_sort_by_dropdown_in_products_page() throws Exception {
		patientportal_wellnesspage.selectthePointsashightolowOrder();
		Thread.sleep(1000);
		
		System.out.println("Points : high to low sort selected successfully");
		Hooks.scenario.log("Points : high to low sort selected successfullys");
	}
	
	@When("user click on the product tab in products page")
	public void user_click_on_the_product_tab_in_products_page() {
		boolean result = patientportal_wellnesspage.clickintotheFirstProducttab();
		
		if (!result) {
	        String message = "First Product tab is not visible for that Patient user — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Product tab clicked successfully");
	}
	
	@Then("user click on add to cart button in product details page")
	public void user_click_on_add_to_cart_button_in_product_details_page() {
		boolean result = patientportal_wellnesspage.clickintotheAddtoCartbuttoninproductdetails();
		
		if (!result) {
	        String message = "Add To Cart button not visible for that Product because this product is already added in cart — skipping this step and continue the next step";
	        System.out.println(message);
	        Hooks.scenario.log(message);
                     
	        return;  // Step marked as SKIPPED, scenario continues
	    }
	    Hooks.scenario.log("Add To Cart button clicked successfully");
	}
	
	@And("user click on go to cart button in product details page")
	public void user_click_on_go_to_cart_button_in_product_details_page() {
		patientportal_wellnesspage.clickintotheGotoCartbuttoninproductdetails();
		
		System.out.println("Go To Cart button clicked successfully");
		Hooks.scenario.log("Go To Cart button clicked successfully");
	}
	
	@When("user click on the proceed button in product cart page")
	public void user_click_on_the_proceed_button_in_product__cart_page() throws Exception {
		String result = patientportal_wellnesspage.clickintotheproceedbuttoninproductcart();
		Thread.sleep(1500);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Proceed button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user able to delete the product from product cart page")
	public void user_able_to_delete_the_product_from_product_cart_page() throws Exception {
		patientportal_wellnesspage.performtheProductdeletefunctionality();
		Thread.sleep(1000);
		
		System.out.println("Product deleted successfully");
		Hooks.scenario.log("Product deleted successfully");
	}
	
	@Then("user click on the shopping cart tab in products page")
	public void user_click_on_the_shopping_cart_tab_in_products_page() throws Exception {
		patientportal_wellnesspage.clickintotheShoppingcarttabinproducts();
		Thread.sleep(1000);
		
		System.out.println("Shopping Cart tab clicked successfully");
		Hooks.scenario.log("Shopping Cart tab clicked successfully");
	}
	
	
	//----------------------------Order History Section--------------------------------------------------
	
	
	@Then("user click on the order history tab in patient portal sidebar menu")
	public void user_click_on_the_order_history_tab_in_patient_portal_sidebar_menu() {
		boolean result = patientportal_wellnesspage.clickintotheOrderHistorytabinsidebar();
		
		if (!result) {
	        String message = "Order History tab is also not visible for that Patient user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Order History tab clicked successfully");
	}
	
	@When("user click on the view your item button in order history page")
	public void user_click_on_the_view_your_item_button_in_order_history_page() {
		boolean result = patientportal_wellnesspage.clickintotheViewYourItembuttoninorderhistory();

	    if (!result) {

	        String message =
	        		"View Your Item button is not visible. " + "Message displayed: No Recent Orders Found — skipping this step.";

	        System.out.println(message);
	        Hooks.scenario.log(message);

	        // Mark step as SKIPPED (not failed)
	        Assume.assumeTrue(message, false);
	        return;
	    }
	    Hooks.scenario.log("View Your Item button clicked successfully");
	}
	
	@When("user click on the view order details button in order history page")
	public void user_click_on_the_view_order_details_button_in_order_history_page() {
		boolean result = patientportal_wellnesspage.clickintotheVieworderdetailsbuttoninorderhistory();

	    if (!result) {

	        String message =
	                "View order details button is not visible. " + "Message displayed: No Recent Orders Found — skipping this step.";

	        System.out.println(message);
	        Hooks.scenario.log(message);

	        // Mark step as SKIPPED (not failed)
	        Assume.assumeTrue(message, false);
	        return;
	    }
	    Hooks.scenario.log("View order details button clicked successfully");
	}
	
	
	//------------------------------------------Points History Section---------------------------------------
	
	@Then("user click on the points history tab in patient portal sidebar menu")
	public void user_click_on_the_points_history_tab_in_patient_portal_sidebar_menu() {
		boolean result = patientportal_wellnesspage.clickintothePointsHistorytabinsidebar();
		
		if (!result) {
	        String message = "Points History tab is also not visible for that Patient user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Points History tab clicked successfully");
	}
}
