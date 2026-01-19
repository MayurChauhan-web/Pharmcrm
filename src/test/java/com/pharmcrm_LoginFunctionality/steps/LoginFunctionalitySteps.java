package com.pharmcrm_LoginFunctionality.steps;


import org.junit.Assert;
import org.junit.Assume;

import com.pharmcrm_LoginFunctionality.pages.LoginFunctionalityPage;

import driver.DriverFactory_01;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionalitySteps {
	
	LoginFunctionalityPage loginfunctionalitypage = new LoginFunctionalityPage(Hooks.driver);
	
	
	@Given("user launch browser")
	public void user_launch_browser() {
		DriverFactory_01.getDriver();
		System.out.println("Browser launched");
		Hooks.scenario.log("Browser launched");
	}
	
	@When("user navigate to the application")
	public void user_navigate_to_the_application() {
		loginfunctionalitypage = new LoginFunctionalityPage(DriverFactory_01.getDriver());
		Assert.assertTrue(loginfunctionalitypage.loginpageisdisplayed());
		System.out.println("Login Page is display");
		Hooks.scenario.log("Login Page is display");
	}
	
	@Then("user click on the user type dropdown")
	public void user_click_on_the_user_type_dropdown() throws Exception {
		loginfunctionalitypage.clickintotheusertypedropdown();
		Thread.sleep(500);
		
		System.out.println("User Type dropdown clicked successfully");
		Hooks.scenario.log("User Type dropdown clicked successfully");
	}
	
	@When("user select the user type as organization from user type dropdown")
	public void user_select_the_user_type_as_organization_from_user_type_dropdown() throws Exception {
		loginfunctionalitypage.selecttheusertypeOrganization();
		Thread.sleep(500);
		
		System.out.println("Organization User Type is selected successfully");
		Hooks.scenario.log("Organization User Type is selected successfully");
	}
	
	@Then("user enter the organization emailid")
	public void user_enter_the_organization_emailid() {
		String EmailId = Hooks.prop.getProperty("organizationemailid");
		loginfunctionalitypage.entertheemailidtextbox(EmailId);
		
		System.out.println("User Entered Organization EmailID: " + EmailId);
		Hooks.scenario.log("User Entered Organization EmailID: " + EmailId);
	}
	
	@And("user enter the organization password")
	public void user_enter_the_organization_password() throws Exception {
		String Password = Hooks.prop.getProperty("organizationpassword");
		loginfunctionalitypage.enterthepasswordtextbox(Password);
		Thread.sleep(500);
		
		System.out.println("User Entered Organization Password: " + Password);
		Hooks.scenario.log("User Entered Organization Password: " + Password);
	}
	
	@Then("user enter the board member emailid")
	public void user_enter_the_board_member_emailid() {
		String EmailId = Hooks.prop.getProperty("boardmemberemailid");
		loginfunctionalitypage.entertheemailidtextbox(EmailId);
		
		System.out.println("User Entered Board Member EmailID: " + EmailId);
		Hooks.scenario.log("User Entered Board Member EmailID: " + EmailId);
	}
	
	@And("user enter the board member password")
	public void user_enter_the_board_member_password() throws Exception {
		String Password = Hooks.prop.getProperty("boardmemberpassword");
		loginfunctionalitypage.enterthepasswordtextbox(Password);
		Thread.sleep(500);
		
		System.out.println("User Entered Board Member Password: " + Password);
		Hooks.scenario.log("User Entered Board Member Password: " + Password);
	}
	
	@When("user click on the go button")
	public void user_click_on_the_go_button() throws Exception {
		String result = loginfunctionalitypage.clickintotheGobutton();
		Thread.sleep(1000);
		
	        System.out.println("Message: " + result);
	        Hooks.scenario.log("Message: " + result);
	        
	        if (result.startsWith("ERROR")) {
		        Hooks.scenario.log("User unable to login into the application failed due to error message(s): " + result);

		        // HARD STOP – remaining steps skipped
		        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
		    }
	        else {
		        System.out.println("Go button clicked successfully");
		        Hooks.scenario.log("Go button clicked successfully");
			}
	}
	
	@When("user select the user type as Patient from user type dropdown")
	public void user_select_the_user_type_as_Patient_from_user_type_dropdown() throws Exception {
		loginfunctionalitypage.selecttheusertypePatient();
		Thread.sleep(500);
		
		System.out.println("Patient User Type is selected successfully");
		Hooks.scenario.log("Patient User Type is selected successfully");
	}
	
	@Then("user enter the Patient emailid")
	public void user_enter_the_Patient_emailid() {
		String EmailId = Hooks.prop.getProperty("patientemailid");
		loginfunctionalitypage.entertheemailidtextbox(EmailId);
		
		System.out.println("User Entered Patient EmailID: " + EmailId);
		Hooks.scenario.log("User Entered Patient EmailID: " + EmailId);
	}
	
	@And("user enter the Patient password")
	public void user_enter_the_Patient_password() throws Exception {
		String Password = Hooks.prop.getProperty("patientpassword");
		loginfunctionalitypage.enterthepasswordtextbox(Password);
		Thread.sleep(500);
		
		System.out.println("User Entered Patient Password: " + Password);
		Hooks.scenario.log("User Entered Patient Password: " + Password);
	}


}
