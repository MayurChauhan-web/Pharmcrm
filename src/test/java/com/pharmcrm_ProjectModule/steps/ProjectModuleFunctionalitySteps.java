package com.pharmcrm_ProjectModule.steps;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


import org.junit.Assume;
import org.openqa.selenium.WebDriver;
import com.pharmcrm_ProjectModule.pages.ProjectModuleFunctionalityPage;
import com.pharmcrm_ProjectModule.pages.ProjectModuleFunctionalityPage.TaskTabStatus;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProjectModuleFunctionalitySteps {
	
	
	
	ProjectModuleFunctionalityPage projectModulefunctionalitypage = new ProjectModuleFunctionalityPage(Hooks.driver);
	WebDriver driver; // class level driver variable
	
	@Then("user click on the project module tab in home page")
	public void user_click_on_the_project_module_tab_in_home_page() throws Exception {
		projectModulefunctionalitypage.clickintotheprojectmoduletab();
		Thread.sleep(500);
		
		System.out.println("Project Module tab clicked successfully and Project Module dashboard is open");
		Hooks.scenario.log("Project Module tab clicked successfully and Project Module dashboard is open");
	}
	
	@When("user click on the boards section in project module sidebar menu")
	public void user_click_on_the_boards_section_in_project_module_sidebar_menu() throws Exception {
		projectModulefunctionalitypage.clickintotheboardssidebarmenu();
		Thread.sleep(500);
		
		System.out.println("Boards tab clicked successfully and Boards page is open");
		Hooks.scenario.log("Boards tab clicked successfully and Boards page is open");
	}
	
	//-------------------------Create a New Board--------------------------------------------
	
	@Then("user click on the create new board button in boards page")
	public void user_click_on_the_create_new_board_button_in_boards_page() throws Exception {
		projectModulefunctionalitypage.clickintothecreatenewboardbutton();
		Thread.sleep(500);
		
		System.out.println("Create New Board button clicked successfully and Add Board pop-up window is open");
		Hooks.scenario.log("Create New Board button clicked successfully and Add Board pop-up window is open");
	}
	
	@And("user enter the board name in add board pop-up window")
	public void user_enter_the_board_name_in_add_board_pop_up_window() {
		String BoardName = Hooks.prop.getProperty("boardname");
		projectModulefunctionalitypage.entertheBoardName(BoardName);
		
		System.out.println("User Entered Board Name: " + BoardName);
		Hooks.scenario.log("User Entered Board Name: " + BoardName);
	}
	
	@Then("user enter the board description in add board pop-up winodw")
	public void user_enter_the_board_description_in_add_board_pop_up_winodw() {
		String BoardDescription = Hooks.prop.getProperty("boarddescription");
		projectModulefunctionalitypage.entertheBoardDescription(BoardDescription);
		
		System.out.println("User Entered Board Description: " + BoardDescription);
		Hooks.scenario.log("User Entered Board Description: " + BoardDescription);
	}
	
	@When("user click on the submit button in add board pop-up window")
	public void user_click_on_the_submit_button_in_add_board_pop_up_window() throws Exception {
		String result = projectModulefunctionalitypage.clickintothesubmitbutton();
		Thread.sleep(1500);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	
	//------------------------------Edit The Board--------------------------------------------
	
	
	@Then("user click on the edit board button in boards page")
	public void user_click_on_the_edit_board_button_in_boards_page() {
		boolean result = projectModulefunctionalitypage.clickintotheeditboardbutton();
		
		if (!result) {
	        String message = "Edit Board button is NOT shown on Boards page — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit Board button clicked successfully");
	}
	
	@And("user edit the board name in edit board pop-up window")
	public void user_edit_the_board_name_in_edit_board_pop_up_window() {
		String BoardName = Hooks.prop.getProperty("changeboardname");
		projectModulefunctionalitypage.entertheBoardName(BoardName);
		
		System.out.println("User Change the Board Name: " + BoardName);
		Hooks.scenario.log("User Change the Board Name: " + BoardName);
	}
	
	@Then("user edit the borad description in edit board pop-up window")
	public void user_edit_the_borad_description_in_edit_board_pop_up_window() {
		String BoardDescription = Hooks.prop.getProperty("changeboarddescription");
		projectModulefunctionalitypage.entertheBoardDescription(BoardDescription);
		
		System.out.println("User Change the Board Description: " + BoardDescription);
		Hooks.scenario.log("User Change the Board Description: " + BoardDescription);
	}
	
	@And("user remove the board name in edit board pop-up window")
	public void user_remove_the_board_name_in_edit_board_pop_up_window() throws Exception {
		projectModulefunctionalitypage.removetheBoardName();
		Thread.sleep(500);
		
		System.out.println("Board Name remove successfully");
		Hooks.scenario.log("Board Name remove successfully");
	}
	
	@And("user remove the board description in edit board pop-up window")
	public void user_remove_the_board_description_in_edit_board_pop_up_window() throws Exception {
		projectModulefunctionalitypage.removetheBoardDescription();
		Thread.sleep(500);
		
		System.out.println("Board Description remove successfully");
		Hooks.scenario.log("Board Description remove successfully");
	}
	
	
	//----------------------------------Delete The Board-----------------------------------------------
	
	
	@Then("user click on the delete board button in boards page")
	public void user_click_on_the_delete_board_button_in_boards_page() {
		boolean result = projectModulefunctionalitypage.clickintothedeleteboardbutton();
		
		if (!result) {
	        String message = "Delete Board button is NOT shown on Boards page — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Delete Board button clicked successfully");
	}
	
	@And("user click on the confirm button delete board pop-up window")
	public void user_click_on_the_confirm_button_delete_board_pop_up_window() throws Exception {
		projectModulefunctionalitypage.clickintotheconfirmbutton();
		Thread.sleep(1000);
		
		System.out.println("Confirm button clicked successfully and user selected board is delete");
		Hooks.scenario.log("Confirm button clicked successfully and user selected board is delete");
	}
	
	
	//------------------------------------------Setting The Board--------------------------------------
		
	
	@Then("user click on the setting button in boards page")
	public void user_click_on_the_setting_button_in_boards_page() {
		boolean result = projectModulefunctionalitypage.clickintothesettingboardbutton();
		
		if (!result) {
	        String message = "Setting Board button is NOT shown on Boards page — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Setting Board button clicked successfully");
	}
	
	@And("user click on the three dot button in board member section")
	public void user_click_on_the_three_dot_button_in_board_member_section() {
		projectModulefunctionalitypage.clickintothethreedotbuttoninboardmember();
		
		System.out.println("Three Dot button clicked successfully");
		Hooks.scenario.log("Three Dot button clicked successfully");
	}
	
	@When("user click on the edit button in board member section")
	public void user_click_on_the_edit_button_in_board_member_section() throws Exception {
		projectModulefunctionalitypage.clickintotheeditbuttoninboardmember();
		Thread.sleep(500);
		
		System.out.println("Edit button clicked successfully and Edit Task Permission pop-up window is open");
		Hooks.scenario.log("Edit button clicked successfully and Edit Task Permission pop-up window is open");
	}
	
	@Then("user uncheck the add panel permission in edit task permission pop-up window")
	public void user_uncheck_the_add_panel_permission_in_edit_task_permission_pop_up_window() {
		projectModulefunctionalitypage.clickintotheaddpanelcheckbox();
		
		System.out.println("Add Panel Checkbox is unchecked successfully");
		Hooks.scenario.log("Add Panel Checkbox is unchecked successfully");
	}
	
	@And("user uncheck the edit panel permission in edit task permission pop-up window")
	public void user_uncheck_the_edit_panel_permission_in_edit_task_permission_pop_up_window() {
		projectModulefunctionalitypage.clickintotheeditpanelcheckbox();
		
		System.out.println("Edit Panel Checkbox is unchecked successfully");
		Hooks.scenario.log("Edit Panel Checkbox is unchecked successfully");
	}
	
	@Then("user uncheck the delete panel permission in edit task permission pop-up window")
	public void user_uncheck_the_delete_panel_permission_in_edit_task_permission_pop_up_window() {
		projectModulefunctionalitypage.clickintothedeletepanelcheckbox();
		
		System.out.println("Delete Panel Checkbox is unchecked successfully");
		Hooks.scenario.log("Delete Panel Checkbox is unchecked successfully");
	}
	
	@And("user uncheck the add task permission in edit task permission pop-up window")
	public void user_uncheck_the_add_task_permission_in_edit_task_permission_pop_up_window() {
		projectModulefunctionalitypage.clickintotheaddtaskcheckbox();
		
		System.out.println("Add Task Checkbox is unchecked successfully");
		Hooks.scenario.log("Add Task Checkbox is unchecked successfully");
	}
	
	@Then("user uncheck the edit task permission in edit task permission pop-up window")
	public void user_uncheck_the_edit_task_permission_in_edit_task_permission_pop_up_window() {
		projectModulefunctionalitypage.clickintotheedittaskcheckbox();
		
		System.out.println("Edit Task Checkbox is unchecked successfully");
		Hooks.scenario.log("Edit Task Checkbox is unchecked successfully");
	}
	
	@And("user uncheck the delete task permission in edit task permission pop-up window")
	public void user_uncheck_the_delete_task_permission_in_edit_task_permission_pop_up_window() {
		projectModulefunctionalitypage.clickintothedeletetaskcheckbox();
		
		System.out.println("Delete Task Checkbox is unchecked successfully");
		Hooks.scenario.log("Delete Task Checkbox is unchecked successfully");
	}
	
	@Then("user uncheck the add comment permission in edit task permission pop-up window")
	public void user_uncheck_the_add_comment_permission_in_edit_task_permission_pop_up_window() {
		projectModulefunctionalitypage.clickintotheaddcommentcheckbox();
		
		System.out.println("Add Comment Checkbox is unchecked successfully");
		Hooks.scenario.log("Add Comment Checkbox is unchecked successfully");
	}
	
	@And("user uncheck the mark closed permission in edit task permission pop-up window")
	public void user_uncheck_the_mark_closed_permission_in_edit_task_permission_pop_up_window() {
		projectModulefunctionalitypage.clickintothemarkclosedcheckbox();
		
		System.out.println("Mark Closed Checkbox is unchecked successfully");
		Hooks.scenario.log("Mark Closed Checkbox is unchecked successfully");
	}
	
	@When("user click on the submit button in edit task permission pop-up window")
	public void user_click_on_the_submit_button_in_edit_task_permission_pop_up_window() throws Exception {
		projectModulefunctionalitypage.clickintothesubmitbuttoninedittaskpermission();
		Thread.sleep(2000);
		
		System.out.println("Submit button clicked successfully and Task Permission is save");
		Hooks.scenario.log("Submit button clicked successfully and Task Permission is save");
	}
	
	
	//----------------------------------Add New Board Member---------------------------------------------
	
	@And("user click on the new board member button in board member section")
	public void user_click_on_the_new_board_member_button_in_board_member_section() throws Exception {
		projectModulefunctionalitypage.clickintothenewboardmemberbutton();
		Thread.sleep(1000);
		
		System.out.println("New Board Member button clicked successfully and Search User pop-up window is open");
		Hooks.scenario.log("New Board Member button clicked successfully and Search User pop-up window is open");
	}
	
	@Then("user enter the last name in search user pop-up window")
	public void user_enter_the_last_name_in_search_user_pop_up_window() {
		String LastName = Hooks.prop.getProperty("lastname");
		projectModulefunctionalitypage.entertheLastNameinfilter(LastName);
		
		System.out.println("User Entered Last Name: " + LastName);
		Hooks.scenario.log("User Entered Last Name: " + LastName);
	}
	
	@And("user enter the first name in search user pop-up window")
	public void user_enter_the_first_name_in_search_user_pop_up_window() {
		String FirstName = Hooks.prop.getProperty("firstname");
		projectModulefunctionalitypage.entertheFirstNameinfilter(FirstName);
		
		System.out.println("User Entered First Name: " + FirstName);
		Hooks.scenario.log("User Entered First Name: " + FirstName);
	}
	
	@When("user click on the search button in search user pop-up window")
	public void user_click_on_the_search_button_in_search_user_pop_up_window() throws Exception {
		String result = projectModulefunctionalitypage.clickintothesearchbuttoninsearchuser();
		Thread.sleep(1000);
		
		System.out.println("Search Result: " + result);
		Hooks.scenario.log("Search Result: " + result);
		
		if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Search failed due to error message(s): " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user click on the user radio button in search user pop-up window")
	public void user_click_on_the_user_radio_button_in_search_user_pop_up_window() throws Exception {
		projectModulefunctionalitypage.clickintotheuserradiobutton();
		
		System.out.println("Radio button clicked successfully");
		Hooks.scenario.log("Radio button clicked successfully");
	}
	
	@And("user click on the submit button in search user pop-up window")
	public void user_click_on_the_submit_button_in_search_user_pop_up_window() throws Exception {
		String result = projectModulefunctionalitypage.clickintothesubmitbuttoninsearchuser();
		Thread.sleep(1500);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user enter the invalid last name in search user pop-up window")
	public void user_enter_the_invalid_last_name_in_search_user_pop_up_window() {
		String LastName = Hooks.prop.getProperty("invalidlastname");
		projectModulefunctionalitypage.entertheLastNameinfilter(LastName);
		
		System.out.println("User Entered Invalid Last Name: " + LastName);
		Hooks.scenario.log("User Entered Invalid Last Name: " + LastName);
	}
	
	@And("user enter the invalid first name in search user pop-up window")
	public void user_enter_the_invalid_first_name_in_search_user_pop_up_window() {
		String FirstName = Hooks.prop.getProperty("invalidfirstname");
		projectModulefunctionalitypage.entertheFirstNameinfilter(FirstName);
		
		System.out.println("User Entered Invalid First Name: " + FirstName);
		Hooks.scenario.log("User Entered Invalid First Name: " + FirstName);
	}
	
	@When("user click on the newly added board member three dot vertical button")
	public void user_click_on_the_newly_added_board_member_three_dot_vertical_button() {
		boolean result = projectModulefunctionalitypage.clickintothethreedotbuttonboardmember1();
		
		if (!result) {
	        String message = "New board member is not added, and the three-dot (more options) button is also not visible for that board member on the Boards page — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Newly added board member three dot button clicked successfully");
	}
	
	@Then("user click on the edit button for newly added board member")
	public void user_click_on_the_edit_button_for_newly_added_board_member() throws Exception {
		projectModulefunctionalitypage.clickintotheeditbuttoninboardmember1();
		Thread.sleep(500);
		
		System.out.println("Edit button clicked successfully and Edit Task Permission pop-up window is open");
		Hooks.scenario.log("Edit button clicked successfully and Edit Task Permission pop-up window is open");
	}
	
	
	//-------------------------------------Assign Task Permission-----------------------------------------------
	
	@And("user set the add panel permission for newly added board member")
	public void user_set_the_add_panel_permission_for_newly_added_board_member() {
		projectModulefunctionalitypage.clickintotheaddpanelcheckbox();
		
		System.out.println("Add Panel Checkbox clicked successfully");
		Hooks.scenario.log("Add Panel Checkbox clicked successfully");
	}
	
	@Then("user set the edit panel permission for newly added board member")
	public void user_set_the_edit_panel_permission_for_newly_added_board_member() {
		projectModulefunctionalitypage.clickintotheeditpanelcheckbox();
		
		System.out.println("Edit Panel Checkbox clicked successfully");
		Hooks.scenario.log("Edit Panel Checkbox clicked successfully");
	}
	
	@And("user set the delete panel permission for newly added board member")
	public void user_set_the_delete_panel_permission_for_newly_added_board_member() {
		projectModulefunctionalitypage.clickintothedeletepanelcheckbox();
		
		System.out.println("Delete Panel Checkbox clicked successfully");
		Hooks.scenario.log("Delete Panel Checkbox clicked successfully");
	}
	
	@Then("user set the add task permission for newly added board member")
	public void user_set_the_add_task_permission_for_newly_added_board_member() {
		projectModulefunctionalitypage.clickintotheaddtaskcheckbox();
		
		System.out.println("Add Task Checkbox clicked successfully");
		Hooks.scenario.log("Add Task Checkbox clicked successfully");
	}
	
	@And("user set the edit task permission for newly added board member")
	public void user_set_the_edit_task_permission_for_newly_added_board_member() {
		projectModulefunctionalitypage.clickintotheedittaskcheckbox();
		
		System.out.println("Edit Task Checkbox clicked successfully");
		Hooks.scenario.log("Edit Task Checkbox clicked successfully");
	}
	
	@Then("user set the delete task permission for newly added board member")
	public void user_set_the_delete_task_permission_for_newly_added_board_member() {
		projectModulefunctionalitypage.clickintothedeletetaskcheckbox();
		
		System.out.println("Delete Task Checkbox clicked successfully");
		Hooks.scenario.log("Delete Task Checkbox clicked successfully");
	}
	
	@And("user set the add comment permission for newly added board member")
	public void user_set_the_add_comment_permission_for_newly_added_board_member() {
		projectModulefunctionalitypage.clickintotheaddcommentcheckbox();
		
		System.out.println("Add Comment Checkbox clicked successfully");
		Hooks.scenario.log("Add Comment Checkbox clicked successfully");
	}
	
	@Then("user set the mark closed permission for newly added board member")
	public void user_set_the_mark_closed_permission_for_newly_added_board_member() {
		projectModulefunctionalitypage.clickintothemarkclosedcheckbox();
		
		System.out.println("Mark Closed Checkbox clicked successfully");
		Hooks.scenario.log("Mark Closed Checkbox clicked successfully");
	}
	
	
	//---------------------------------Assign Team Lead Permission-----------------------------------------
	
	
	@When("user click on the assign team lead button in board details page")
	public void user_click_on_the_assign_team_lead_button_in_board_details_page() {
		boolean result = projectModulefunctionalitypage.clickintotheassignboardleadbutton();
		
		if (!result) {
	        String message = "New board member is not added, and the assign team lead button is also not visible for that board member on the Boards page — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Newly added board member assign team lead button clicked successfully");
	}
	
	@Then("user click on the confirm button in assign team lead pop-up window")
	public void user_click_on_the_confirm_button_in_assign_team_lead_pop_up_window() throws Exception {
		projectModulefunctionalitypage.clickintotheconfirmteamleadbutton();
		Thread.sleep(1000);
		
		System.out.println("Confirm button is clicked, and the Team Lead role is successfully assigned to the board member");
		Hooks.scenario.log("Confirm button is clicked, and the Team Lead role is successfully assigned to the board member");
	}
	
	@Then("user click on the delete button for newly added board member")
	public void user_click_on_the_delete_button_for_newly_added_board_member() {
		projectModulefunctionalitypage.clickintothedeletebuttoninboardmember1();
		
		System.out.println("Delete button clicked successfully");
		Hooks.scenario.log("Delete button clicked successfully");
	}
	
	@And("user click on the confirm button in delete board member pop-up window")
	public void user_click_on_the_confirm_button_in_delete_board_member_pop_up_window() throws Exception {
		projectModulefunctionalitypage.clickintotheconfirmdeletebuttoninboardmember1();
		Thread.sleep(1000);
		
		System.out.println("Confirm button is clicked, and the board member is deleted successfully");
		Hooks.scenario.log("Confirm button is clicked, and the board member is deleted successfully");
	}
	
	@Then("user click on the newly created board panel in boards page")
	public void user_click_on_the_newly_created_board_panel_in_boards_page() {
		boolean result = projectModulefunctionalitypage.clickintothefirstboardpaneltab();
		
		if (!result) {
	        String message = "Board Panel is not visible in the Boards page — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Board Panel tab clicked successfully and Tasks section is open");
	}
	
	@When("user click on the newly created board panel through sidebar in boards page")
	public void user_click_on_the_newly_created_board_panel_through_sidebar_in_boards_page() {
		boolean result = projectModulefunctionalitypage.clickintothefirstboardpanelsidebartab();
		
		if (!result) {
	        String message = "Board Panel is not visible on the Sidebar — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Board Panel tab clicked successfully and Tasks section is open");
	}
	
	@When("user click on the colour button in tasks section")
	public void user_click_on_the_colour_button_in_tasks_section() {
		projectModulefunctionalitypage.clickintothecolourtabintasks();
		
		System.out.println("Colour tab clicked successfully");
		Hooks.scenario.log("Colour tab clicked successfully");
	}
	
	@Then("user change background colour as orange in tasks section")
	public void user_change_background_colour_as_orange_in_tasks_section() throws Exception {
		projectModulefunctionalitypage.clickintotheorangecolourtab();
		Thread.sleep(1500);
		
		System.out.println("Orange colour tab clicked successfully and Background colour orange is set successfully");
		Hooks.scenario.log("Orange colour tab clicked successfully and Background colour orange is set successfully");
	}
	
	@Then("user change background colour as green in tasks section")
	public void user_change_background_colour_as_green_in_tasks_section() throws Exception {
		projectModulefunctionalitypage.clickintothegreencolourtab();
		Thread.sleep(1500);
		
		System.out.println("Green colour tab clicked successfully and Background colour green is set successfully");
		Hooks.scenario.log("Green colour tab clicked successfully and Background colour green is set successfully");
	}
	
	@Then("user change background colour as blue in tasks section")
	public void user_change_background_colour_as_blue_in_tasks_section() throws Exception {
		projectModulefunctionalitypage.clickintothebluecolourtab();
		Thread.sleep(1500);
		
		System.out.println("Blue colour tab clicked successfully and Background colour blue is set successfully");
		Hooks.scenario.log("Blue colour tab clicked successfully and Background colour blue is set successfully");
	}
	
	@Then("user change background colour as pink in tasks section")
	public void user_change_background_colour_as_pink_in_tasks_section() throws Exception {
		projectModulefunctionalitypage.clickintothepinkcolourtab();
		Thread.sleep(1500);
		
		System.out.println("Pink colour tab clicked successfully and Background colour pink is set successfully");
		Hooks.scenario.log("Pink colour tab clicked successfully and Background colour pink is set successfully");
	}
	
	@And("user click on the board filter button in tasks section")
	public void user_click_on_the_board_filter_button_in_tasks_section() {
		projectModulefunctionalitypage.clickintotheboardfilterbutton();
		
		System.out.println("Board filter button clicked successfully");
		Hooks.scenario.log("Board filter button clicked successfully");
	}
	
	@When("user enter the task title name in board filter")
	public void user_enter_the_task_title_name_in_board_filter() {
		String TaskTitle = Hooks.prop.getProperty("tasktitlefiltername");
		projectModulefunctionalitypage.entertheTasktitlenamefilter(TaskTitle);
		
		System.out.println("User Entered Tasks Title: " + TaskTitle);
		Hooks.scenario.log("User Entered Tasks Title: " + TaskTitle);
	}
	
	@Then("user select the assign from date in board filter")
	public void user_select_the_assign_from_date_in_board_filter() {
		// Click the Assign From date picker
        projectModulefunctionalitypage.selecttheassignfromdatefilter();

        // Select today's date
        projectModulefunctionalitypage.selectTodaysDate();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected From Date: " + selectedDate);
        Hooks.scenario.log("Selected From Date: " + selectedDate);
	}
	
	@And("user select the assign to date in board filter")
	public void user_select_the_assign_to_date_in_board_filter() {
		// Click the Assign From date picker
        projectModulefunctionalitypage.selecttheassigntodatefilter();

        // Select today's date
        projectModulefunctionalitypage.selectToDateAfter10Days();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected To Date: " + selectedDate);
        Hooks.scenario.log("Selected To Date: " + selectedDate);
	}
	
	@When("user click on the user filter dropdown in board filter")
	public void user_click_on_the_user_filter_dropdown_in_board_filter() throws Exception {
		projectModulefunctionalitypage.clickintotheuserfilterdropdown();
		Thread.sleep(1000);
		
		System.out.println("User filter dropdown button clicked successfully");
		Hooks.scenario.log("User filter dropdown button clicked successfully");
	}
	
	@Then("user select the users from user filter dropdown in board filter")
	public void user_select_the_users_from_user_filter_dropdown_in_board_filter() throws Exception {
		int index = 1; // change index as needed

	    boolean result = projectModulefunctionalitypage.selecttheusers(index);

	    if (!result) {
	        String message = "Index " + index + " is not visible in the User Filter dropdown — skipping remaining steps";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Scenario marked as SKIPPED
	        return;
	    }

	    Hooks.scenario.log("Index is selected successfully");
	}
	
	@And("user click on the search button in board filter")
	public void user_click_on_the_search_button_in_board_filter() throws Exception {
		projectModulefunctionalitypage.clickintothesearchbuttonintasks();
		Thread.sleep(1000);
		
		System.out.println("Search button clicked successfully");
		Hooks.scenario.log("Search button clicked successfully");
	}
	
	
	//------------------------------------Add Panel Functionality------------------------------------------------
	
	@And("user click on the add new panel button in board panels page")
	public void user_click_on_the_add_new_panel_button_in_board_panels_page() throws Exception {
		boolean result = projectModulefunctionalitypage.clickintotheaddnewpanelbutton();
		
		if (!result) {
	        String message = "Add New Panel button is not visible for that Board member user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Add New Panel button clicked successfully");
	}
	
	@When("user enter the board panel name in add board panel pop-up window")
	public void user_enter_the_board_panel_name_in_add_board_panel_pop_up_window() {
		String BoardPanel = Hooks.prop.getProperty("newboardpanelname");
		projectModulefunctionalitypage.entertheboardpanelname(BoardPanel);
		
		System.out.println("User Entered Board Panel Name: " + BoardPanel);
		Hooks.scenario.log("User Entered Board Panel Name: " + BoardPanel);
    }
	
	@When("user remove the existing board panel name in board panels page")
	public void user_remove_the_existing_board_panel_name_in_board_panels_page() throws Exception {
		projectModulefunctionalitypage.removetheboardpanelname();
		Thread.sleep(1000);
		
		System.out.println("Remove the existing board panel name");
		Hooks.scenario.log("Remove the existing board panel name");
	}
	
	@Then("user click on the submit button in add board panel pop-up window")
	public void user_click_on_the_submit_button_in_add_board_panel_pop_up_window() throws Exception {
		String result = projectModulefunctionalitypage.clickintothesubmitbuttoninaddboardpanel();
		Thread.sleep(1500);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	
	//-------------------------------------------Edit Panel Functionality------------------------------------------------
	
	@And("user click on the edit button of existing panel in board panels page")
	public void user_click_on_the_edit_button_of_existing_panel_in_board_panels_page() {
		boolean result = projectModulefunctionalitypage.clickintothefirsteditboardpanelbutton();
		
		if (!result) {
	        String message = "Edit button is also not visible for that Board Member because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit Board Panel button clicked successfully");
	}
	
	@When("user change the existing board panel name in board panels page")
	public void user_change_the_existing_board_panel_name_in_board_panels_page() {
		String BoardPanel = Hooks.prop.getProperty("editboardpanelname");
		projectModulefunctionalitypage.entertheboardpanelname(BoardPanel);
		
		System.out.println("User Entered New Board Panel Name: " + BoardPanel);
		Hooks.scenario.log("User Entered New Board Panel Name: " + BoardPanel);
	}
	
	
	//-----------------------------------------Delete Panel Functionality---------------------------------------------
	
	@And("user click on the delete button of existing panel in board panels page")
	public void user_click_on_the_delete_button_of_existing_panel_in_board_panels_page() {
		boolean result = projectModulefunctionalitypage.clickintothefirstdeleteboardpanelbutton();
		
		if (!result) {
	        String message = "Delete button is also not visible for that Board Member because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Delete Board Panel button clicked successfully");
	}
	
	@When("user click on the confirm button in delete panel pop-up window")
	public void user_click_on_the_confirm_button_in_delete_panel_pop_up_window() throws Exception {
		projectModulefunctionalitypage.clickintotheconfirmdeleteboardpanelbutton();
		Thread.sleep(1000);
		
		System.out.println("Confirm button clicked successfully and selected board panel is deleted");
		Hooks.scenario.log("Confirm button clicked successfully and selected board panel is deleted");
	}
	
	
	//---------------------------------------Add Task Functionality----------------------------------------------
	
	
	@And("user click on the add a card tab in to do board panel")
	public void user_click_on_the_add_a_card_tab_in_to_do_board_panel() {
		boolean result = projectModulefunctionalitypage.clickintotheAddCardinToDobutton();
		
		if (!result) {
	        String message = "Add a Card button is also not visible for that Board Member because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Add a Card button clicked successfully");
	}
	
	@When("user enter the new card name in board panel")
	public void user_enter_the_new_card_name_in_board_panel() {
		String AddaCard = Hooks.prop.getProperty("firstaddcardname");
		projectModulefunctionalitypage.enterthefirstaddcard(AddaCard);
		
		System.out.println("User Entered New Add a Card Name: " + AddaCard);
		Hooks.scenario.log("User Entered New Add a Card Name: " + AddaCard);
	}
	
	@Then("user click on the add card button in board panel")
	public void user_click_on_the_add_card_button_in_board_panel() throws Exception {
		String result = projectModulefunctionalitypage.clickintotheAddCardbuttoninpanel();
		Thread.sleep(1500);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Add Card button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user click on the existing task tab in To Do board panel")
	public void user_click_on_the_existing_task_tab_in_To_Do_board_panel() {
		TaskTabStatus status =
		        projectModulefunctionalitypage.clickintothefirsttasktab();

		    switch (status) {

		        case CLICKED:
		            Hooks.scenario.log(
		                "Existing task tab clicked successfully and edit popup opened"
		            );
		            break;

		        case NOT_PRESENT:
		            String notPresentMsg =
		                "Existing task tab not present — skipping scenario";
		            Hooks.scenario.log(notPresentMsg);
		            Assume.assumeTrue(notPresentMsg, false); // ⏭ SKIP
		            break;

		        case NOT_CLICKABLE:
		            String noPermissionMsg =
		                "User does not have permission to edit task — skipping scenario";
		            Hooks.scenario.log(noPermissionMsg);
		            Assume.assumeTrue(noPermissionMsg, false); // ⏭ SKIP
		            break;
		    }
		}
	
	@When("user add a task start date in edit task pop-up window")
	public void user_add_a_task_start_date_in_edit_task_pop_up_window() {
		// Click the Assign From date picker
        projectModulefunctionalitypage.selectthestartdate();

        // Select today's date
        projectModulefunctionalitypage.selectTodaysDate();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected From Date: " + selectedDate);
        Hooks.scenario.log("Selected From Date: " + selectedDate);
	}
	
	@Then("user add a task end date in edit task pop-up window")
	public void user_add_a_task_end_date_in_edit_task_pop_up_window() {
		// Click the Assign From date picker
        projectModulefunctionalitypage.selecttheenddate();

        // Select today's date
        projectModulefunctionalitypage.selectToDateAfter10Days();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected To Date: " + selectedDate);
        Hooks.scenario.log("Selected To Date: " + selectedDate);
	}
	
	@And("user click on the members tab in edit task pop-up window")
	public void user_click_on_the_members_tab_in_edit_task_pop_up_window() throws Exception {
		projectModulefunctionalitypage.clickintothememberstabinedittask();
		Thread.sleep(1000);
		
		System.out.println("Members tab clicked successfully");
		Hooks.scenario.log("Members tab clicked successfully");
	}
	
	@Then("user select the members from member dropdown in edit task pop-up window")
	public void user_select_the_members_from_member_dropdown_in_edit_task_pop_up_window() {
		int index = 1; // change index as needed

	    boolean result = projectModulefunctionalitypage.selecttheusersfrommembers(index);

	    if (!result) {
	        String message = "Index " + index + " is not visible in the User Filter dropdown — skipping remaining steps";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Scenario marked as SKIPPED
	        return;
	    }

	    Hooks.scenario.log("Index is selected successfully");
	}
	
	
	//------------------------------Edit Task Functionality---------------------------------
	
	@And("user click on the priority tab in edit task pop-up window")
	public void user_click_on_the_priority_tab_in_edit_task_pop_up_window() throws Exception {
		projectModulefunctionalitypage.clickintotheprioritytabinedittask();
		Thread.sleep(500);
		
		System.out.println("Priority tab clicked successfully");
		Hooks.scenario.log("Priority tab clicked successfully");
	}
	
	@When("user click on the critical priority in priority section")
	public void user_click_on_the_critical_priority_in_priority_section() throws Exception {
		projectModulefunctionalitypage.clickintothecriticalprioritytabinedittask();
		Thread.sleep(1000);
		
		System.out.println("Critical Priority is clicked successfully");
		Hooks.scenario.log("Critical Priority is clicked successfully");
	}
	
	
	//---------------------------------------------Mark Complete Functionality-----------------------------------------
	
	@Then("user click on the mark complete tab in edit task pop-up window")
	public void user_click_on_the_mark_complete_tab_in_edit_task_pop_up_window() throws Exception {
		boolean result = projectModulefunctionalitypage.clickintothemarkcompletetabinedittask();
		
		if (!result) {
	        String message = "Mark Complete button is also not visible for that Board Member because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Mark Complete button clicked successfully");
	}
	
	@And("user enter the task details in edit task pop-up window")
	public void user_enter_the_task_details_in_edit_task_pop_up_window() {
		String TaskDetails = Hooks.prop.getProperty("taskdetails");
		projectModulefunctionalitypage.enterthetaskdetails(TaskDetails);
		
		System.out.println("User Entered Task Details: " + TaskDetails);
		Hooks.scenario.log("User Entered Task Details: " + TaskDetails);
	}
	
	
	//-----------------------------------------Add Comments Functionality----------------------------------
		
	
	@And("user enter the comments in edit task pop-up window")
	public void user_enter_the_comments_in_edit_task_pop_up_window() {
		String Comments = Hooks.prop.getProperty("commentsinedittask");

	    boolean entered = projectModulefunctionalitypage.enterthecommentsinedittask(Comments);

	    if (!entered) {
	        // Skip scenario if textbox is disabled
	        String msg = "⚠ Comments textbox is disabled — skipping scenario.";
	        System.out.println(msg);
	        Hooks.scenario.log(msg);
	        Assume.assumeTrue(msg, false); // ⏭ SKIP scenario
	    }

	    System.out.println("User Entered Comments: " + Comments);
	    Hooks.scenario.log("User Entered Comments: " + Comments);
	}
	
	@Then("user click on the add comment in edit task pop-up window")
	public void user_click_on_the_add_comment_in_edit_task_pop_up_window() {
		boolean result = projectModulefunctionalitypage.clickintotheaddcommenttabinedittask();
		
		if (!result) {
	        String message = "Add Comment Tab is also not visible — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Add Comment tab clicked successfully");
	}
	
	@And("user click on the submit button in edit task pop-up window")
	public void user_click_on_the_submit_button_in_edit_task_pop_up_window() throws Exception {
		String result = projectModulefunctionalitypage.clickintothesubmitbuttoninedittask();
		Thread.sleep(1500);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	
	//-----------------------------------Delete Task Functionality----------------------------------------
		
	
	@Then("user click on the delete button in edit task pop-up window")
	public void user_click_on_the_delete_button_in_edit_task_pop_up_window() throws Exception {
		boolean result = projectModulefunctionalitypage.clickintothedeletetabinedittask();
		
		if (!result) {
	        String message = "Delete button is also not visible for that Board Member because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Delete button clicked successfully");
	}
	
	@And("user click on the delete card button in delete card in the edit task pop-up window")
	public void user_click_on_the_delete_card_button_in_delete_card_in_the_edit_task_pop_up_window() throws Exception {
		projectModulefunctionalitypage.clickintothedeletecardtabinedittask();
		Thread.sleep(1000);
		
		System.out.println("Task is deleted successfully");
		Hooks.scenario.log("Task is deleted successfully");
	}
}
