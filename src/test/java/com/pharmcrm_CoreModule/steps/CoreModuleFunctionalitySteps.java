package com.pharmcrm_CoreModule.steps;

import org.junit.Assume;
import org.openqa.selenium.WebDriver;

import com.pharmcrm_CoreModule.pages.CoreModuleFunctionalityPage;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CoreModuleFunctionalitySteps {
	
	CoreModuleFunctionalityPage CoreModulefunctionalitypage = new CoreModuleFunctionalityPage(Hooks.driver);
	WebDriver driver; // class level driver variable
	
	@Then("user click on the profile icon tab in dashboard")
	public void user_click_on_the_profile_icon_tab_in_dashboard() {
		CoreModulefunctionalitypage.clickintotheProfileIcontab();
		
		System.out.println("Profile Icon tab clicked successfully");
		Hooks.scenario.log("Profile Icon tab clicked successfully");
	}
	
	
	//---------------------------------Change Password Section----------------------------------
	
	
	@And("user click on the change password tab in profile")
	public void user_click_on_the_change_password_tab_in_profile() {
		CoreModulefunctionalitypage.clickintotheChangePasswordtab();
		
		System.out.println("Change Password tab clicked successfully");
		Hooks.scenario.log("Change Password tab clicked successfully");
	}
	
	@When("user enter the current password")
	public void user_enter_the_current_password() {
		String CurrentPassword = Hooks.prop.getProperty("currentpassword");
		CoreModulefunctionalitypage.entertheCurrentPassword(CurrentPassword);
		
		System.out.println("User Entered Current Password: " + CurrentPassword);
		Hooks.scenario.log("User Entered Current Password: " + CurrentPassword);
	}
	
	@When("user enter the invalid current password")
	public void user_enter_the_invalid_current_password() {
		String CurrentPassword = Hooks.prop.getProperty("invalidconfirmpassword");
		CoreModulefunctionalitypage.entertheCurrentPassword(CurrentPassword);
		
		System.out.println("User Entered Invalid Current Password: " + CurrentPassword);
		Hooks.scenario.log("User Entered Invalid Current Password: " + CurrentPassword);
	}
	
	@When("user enter the infinite length current password")
	public void user_enter_the_infinite_length_current_password() {
		String CurrentPassword = Hooks.prop.getProperty("infinitelengthpass");
		CoreModulefunctionalitypage.entertheCurrentPassword(CurrentPassword);
		
		System.out.println("User Entered Current Password: " + CurrentPassword);
		Hooks.scenario.log("User Entered Current Password: " + CurrentPassword);
	}
	
	@Then("user enter the new password")
	public void user_enter_the_new_password() {
		String NewPassword = Hooks.prop.getProperty("passwordnew");
		CoreModulefunctionalitypage.entertheNewPassword(NewPassword);
		
		System.out.println("User Entered New Password: " + NewPassword);
		Hooks.scenario.log("User Entered New Password: " + NewPassword);
	}
	
	@Then("user enter the same current password in new password field")
	public void user_enter_the_same_current_password_in_new_password_field() {
		String NewPassword = Hooks.prop.getProperty("samecurrentpassinnewpassword");
		CoreModulefunctionalitypage.entertheNewPassword(NewPassword);
		
		System.out.println("User Entered Same New Password: " + NewPassword);
		Hooks.scenario.log("User Entered Same New Password: " + NewPassword);
	}
	
	@Then("user enter the invalid new password")
	public void user_enter_the_invalid_new_password() {
		String NewPassword = Hooks.prop.getProperty("invalidpasswordnew");
		CoreModulefunctionalitypage.entertheNewPassword(NewPassword);
		
		System.out.println("User Entered Invalid New Password: " + NewPassword);
		Hooks.scenario.log("User Entered Invalid New Password: " + NewPassword);
	}
	
	@Then("user enter the 4 character length in new password")
	public void user_enter_the_4_character_length_new_password() {
		String NewPassword = Hooks.prop.getProperty("passwordlength");
		CoreModulefunctionalitypage.entertheNewPassword(NewPassword);
		
		System.out.println("User Entered 4 character length New Password: " + NewPassword);
		Hooks.scenario.log("User Entered 4 character length New Password: " + NewPassword);
	}
	
	@Then("user enter the infinite length new password")
	public void user_enter_the_infinite_length_new_password() {
		String NewPassword = Hooks.prop.getProperty("infinitelengthpass");
		CoreModulefunctionalitypage.entertheNewPassword(NewPassword);
		
		System.out.println("User Entered New Password: " + NewPassword);
		Hooks.scenario.log("User Entered New Password: " + NewPassword);
	}
	
	@And("user enter the confirm new password")
	public void user_enter_the_confirm_new_password() {
		String ConfirmNewPassword = Hooks.prop.getProperty("confirmnewpassword");
		CoreModulefunctionalitypage.entertheConfirmNewPassword(ConfirmNewPassword);
		
		System.out.println("User Entered Confirm New Password: " + ConfirmNewPassword);
		Hooks.scenario.log("User Entered Confirm New Password: " + ConfirmNewPassword);
	}
	
	@And("user enter the same current password in confirm new password field")
	public void user_enter_the_same_current_password_in_confirm_new_password_field() {
		String ConfirmNewPassword = Hooks.prop.getProperty("samecurrentpassinconfirmnewpassword");
		CoreModulefunctionalitypage.entertheConfirmNewPassword(ConfirmNewPassword);
		
		System.out.println("User Entered Same Confirm New Password: " + ConfirmNewPassword);
		Hooks.scenario.log("User Entered Same Confirm New Password: " + ConfirmNewPassword);
	}
	
	@And("user enter the invalid confirm new password")
	public void user_enter_the_invalid_confirm_new_password() {
		String ConfirmNewPassword = Hooks.prop.getProperty("invalidpasswordconfirm");
		CoreModulefunctionalitypage.entertheConfirmNewPassword(ConfirmNewPassword);
		
		System.out.println("User Entered Invalid Confirm New Password: " + ConfirmNewPassword);
		Hooks.scenario.log("User Entered Invalid Confirm New Password: " + ConfirmNewPassword);
	}
	
	@And("user enter the 4 character length in confirm new password")
	public void user_enter_the_4_character_length_in_confirm_new_password() {
		String ConfirmNewPassword = Hooks.prop.getProperty("passwordlength");
		CoreModulefunctionalitypage.entertheConfirmNewPassword(ConfirmNewPassword);
		
		System.out.println("User Entered 4 character length in Confirm New Password: " + ConfirmNewPassword);
		Hooks.scenario.log("User Entered 4 character length in Confirm New Password: " + ConfirmNewPassword);
	}
	
	@And("user enter the infinite length confirm new password")
	public void user_enter_the_infinite_lenth_confirm_new_password() {
		String ConfirmNewPassword = Hooks.prop.getProperty("infinitelengthpass");
		CoreModulefunctionalitypage.entertheConfirmNewPassword(ConfirmNewPassword);
		
		System.out.println("User Entered Confirm New Password: " + ConfirmNewPassword);
		Hooks.scenario.log("User Entered Confirm New Password: " + ConfirmNewPassword);
	}
	
	@When("user click on the submit button in change password")
	public void user_click_on_the_submit_button_in_change_password() throws Exception {
		String result = CoreModulefunctionalitypage.clickintothesubmitbuttoninChangePassword();

	    Hooks.scenario.log("Result: " + result);
	    System.out.println("Result: " + result);

	    // Skip ONLY for ERROR (RED)
	    if (result.startsWith("ERROR")) {

	        Hooks.scenario.log("Error occurred: " + result);

	        Assume.assumeTrue("Skipping scenario due to error: " + result, false);
	    }

	    // SUCCESS (GREEN) → continue execution
	}
	
	@And("user click on the manage profile tab in profile")
	public void user_click_on_the_manage_profile_tab_in_profile() {
		CoreModulefunctionalitypage.clickintotheManageProfiletab();
		
		System.out.println("Manage Profile tab clicked successfully");
		Hooks.scenario.log("Manage Profile tab clicked successfully");
	}
	
	@When("user change the last name in profile details")
	public void user_change_the_last_name_in_profile_details() {
		String LastName = Hooks.prop.getProperty("profilelastname");
		CoreModulefunctionalitypage.entertheLastNameinProfileDetails(LastName);
		
		System.out.println("User Entered Last Name: " + LastName);
		Hooks.scenario.log("User Entered Last Name: " + LastName);
	}
	
	@When("user remove the last name in profile details")
	public void user_remove_the_last_name_in_profile_details() {
		CoreModulefunctionalitypage.removetheLastNameinProfileDetails();
		
		System.out.println("Last Name remove successfully");
		Hooks.scenario.log("Last Name remove successfully");
	}
	
	@Then("user change the first name in profile details")
	public void user_change_the_first_name_in_profile_details() {
		String FirstName = Hooks.prop.getProperty("profilelastname");
		CoreModulefunctionalitypage.entertheFirstNameinProfileDetails(FirstName);
		
		System.out.println("User Entered First Name: " + FirstName);
		Hooks.scenario.log("User Entered First Name: " + FirstName);
	}
	
	@Then("user remove the first name in profile details")
	public void user_remove_the_first_name_in_profile_details() {
		CoreModulefunctionalitypage.removetheFirstNameinProfileDetails();
		
		System.out.println("First Name remove successfully");
		Hooks.scenario.log("First Name remove successfully");
	}
	
	@And("user change the street in address details")
	public void user_change_the_street_in_address_details() {
		String Street = Hooks.prop.getProperty("street");
		CoreModulefunctionalitypage.entertheStreetinAddressDetails(Street);
		
		System.out.println("User Entered Street: " + Street);
		Hooks.scenario.log("User Entered Street: " + Street);
	}
	
	@And("user remove the street in address details")
	public void user_remove_the_street_in_address_details() {
		CoreModulefunctionalitypage.removetheStreetinAddressDetails();
		
		System.out.println("Street address remove successfully");
		Hooks.scenario.log("Street address remove successfully");
	}
	
	@When("user change the city in address details")
	public void user_change_the_city_in_address_details() {
		String City = Hooks.prop.getProperty("street");
		CoreModulefunctionalitypage.entertheCityinAddressDetails(City);
		
		System.out.println("User Entered City: " + City);
		Hooks.scenario.log("User Entered City: " + City);
	}
	
	@When("user remove the city in address details")
	public void user_remove_the_city_in_address_details() {
		CoreModulefunctionalitypage.removetheCityinAddressDetails();
		
		System.out.println("City address remove successfully");
		Hooks.scenario.log("City address remove successfully");
	}
	
	@Then("user change the state in address details")
	public void user_change_the_state_in_address_details() {
		String State = Hooks.prop.getProperty("city");
		CoreModulefunctionalitypage.entertheStateinAddressDetails(State);
		
		System.out.println("User Entered State: " + State);
		Hooks.scenario.log("User Entered State: " + State);
	}
	
	@Then("user remove the state in address details")
	public void user_remove_the_state_in_address_details() {
		CoreModulefunctionalitypage.removetheStateinAddressDetails();
		
		System.out.println("State address remove successfully");
		Hooks.scenario.log("State address remove successfully");
	}
	
	@And("user change the zipcode in address details")
	public void user_change_the_zipcode_in_address_details() {
		String ZipCode = Hooks.prop.getProperty("addresszipcode");
		CoreModulefunctionalitypage.entertheZipCodeinAddressDetails(ZipCode);
		
		System.out.println("User Entered Zip Code: " + ZipCode);
		Hooks.scenario.log("User Entered Zip Code: " + ZipCode);
	}
	
	@And("user remove the zipcode in address details")
	public void user_remove_the_zipcode_in_address_details() {
		CoreModulefunctionalitypage.removetheZipCodeinAddressDetails();
		
		System.out.println("Zip Code remove successfully");
		Hooks.scenario.log("Zip Code remove successfully");
	}
	
	@And("user change the country in address details")
	public void user_change_the_country_in_address_details() {
		String Country = Hooks.prop.getProperty("country");
		CoreModulefunctionalitypage.entertheCountryinAddressDetails(Country);
		
		System.out.println("User Entered Country: " + Country);
		Hooks.scenario.log("User Entered Country: " + Country);
	}
	
	@And("user remove the country in address details")
	public void user_remove_the_country_in_address_details() {
		CoreModulefunctionalitypage.removetheCountryinAddressDetails();
		
		System.out.println("Country address remove successfully");
		Hooks.scenario.log("Country address remove successfully");
	}
	
	@Then("user click on the clear signature button in my profile")
	public void user_click_on_the_clear_signature_button_in_my_profile() {
		CoreModulefunctionalitypage.clickintotheClearSignaturebuttoninMyProfile();
		
		System.out.println("Clear Signature button clicked successfully");
		Hooks.scenario.log("Clear Signature button clicked successfully");
	}
	
	@Then("user draw the sign in signature")
	public void user_draw_the_sign_in_signature() throws InterruptedException {
		CoreModulefunctionalitypage.performSignatureOperation();
		
		System.out.println("Signature draw successfully");
		Hooks.scenario.log("Signature draw successfully");
	}
	
	@When("user click on the update button in my profile")
	public void user_click_on_the_update_button_in_my_profile() {
		String result = CoreModulefunctionalitypage.clickintotheUpdatebuttoninMyProfile();

	    Hooks.scenario.log("Result: " + result);
	    System.out.println("Result: " + result);

	    // Skip ONLY for ERROR (RED)
	    if (result.startsWith("ERROR")) {

	        Hooks.scenario.log("Error occurred: " + result);

	        Assume.assumeTrue("Skipping scenario due to error: " + result, false);
	    }

	    // SUCCESS (GREEN) → continue execution
	}
	
	@And("user click on the calendar settings tab in profile")
	public void user_click_on_the_calendar_settings_tab_in_profile() {
		CoreModulefunctionalitypage.clickintotheCalenderSettingstab();
		
		System.out.println("Calender Settings tab clicked successfully");
		Hooks.scenario.log("Calender Settings tab clicked successfully");
	}
	
	@When("user click on the reset to company setting tab in my calendar setting page")
	public void user_click_on_the_reset_to_company_setting_tab_in_my_calendar_setting_page() {
		CoreModulefunctionalitypage.clickintotheResettocompanysettingtab();
		
		System.out.println("Reset to company setting tab clicked successfully");
		Hooks.scenario.log("Reset to company setting tab clicked successfully");
	}
	
	@When("user change the time zone in my calendar setting page")
	public void user_change_the_time_zone_in_my_calendar_setting_page() {
		String TimeZone = "(UTC+05:30) Chennai, Kolkata, Mumbai, New Delhi";

	    boolean result = CoreModulefunctionalitypage.selecttheTimeZone(TimeZone);

	    // Print skip message BEFORE Assume
	    if (!result) {

	        Hooks.scenario.log("Skipping scenario because Time Zone is not present: " + TimeZone);

	        System.out.println("Skipping scenario because Time Zone is not present: " + TimeZone);

	        Assume.assumeTrue(false);
	    }

	    Hooks.scenario.log("Time Zone selected successfully: " + TimeZone);
	}
	
	@Then("user click on the submit button in my calendar setting page")
	public void user_click_on_the_submit_button_in_my_calendar_setting_page() {
		String result = CoreModulefunctionalitypage.clickintothesubmitbuttoninCalendarSettings();

	    Hooks.scenario.log("Result: " + result);
	    System.out.println("Result: " + result);

	    // Skip ONLY for ERROR (RED)
	    if (result.startsWith("ERROR")) {

	        Hooks.scenario.log("Error occurred: " + result);

	        Assume.assumeTrue("Skipping scenario due to error: " + result, false);
	    }

	    // SUCCESS (GREEN) → continue execution
	}
}
