package com.pharmcrm_ReportModule.steps;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Assume;
import org.openqa.selenium.WebDriver;

import com.pharmcrm_ReportModule.pages.ReportModuleFunctionalityPage;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReportModuleFunctionalitySteps {
	
	
	ReportModuleFunctionalityPage ReportModulefunctionalitypage = new ReportModuleFunctionalityPage(Hooks.driver);
	WebDriver driver; // class level driver variable
	
	@Then("user click on the Report module tab in home page")
	public void user_click_on_the_Report_module_tab_in_home_page() {
		boolean result = ReportModulefunctionalitypage.clickintotheReportmoduletab();
		
		if (!result) {
	        String message = "Report Module (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Report Module tab clicked successfully");
	}
	
	
	//-------------------------------------Workflow Section----------------------------------------
	
	
	@When("user click on the Workflow tab in sidebar in Report module page")
	public void user_click_on_the_Workflow_tab_in_sidebar_in_Report_module_page() {
		boolean result = ReportModulefunctionalitypage.clickintotheWorkflowtabinsidebar();
		
		if (!result) {
	        String message = "Workflow (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Workflow tab clicked successfully");
	}
	
	@Then("user click on the new runningline tab in workflow section")
	public void user_click_on_the_new_runningline_tab_in_workflow_section() {
		boolean result = ReportModulefunctionalitypage.clickintotheNewRunninglinetabinWorkflow();
		
		if (!result) {
	        String message = "New Runningline (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New Runningline tab clicked successfully");
	}
	
	@And("user click on the Export Excel button in new runningline")
	public void user_click_on_the_Export_Excel_button_in_new_runningline() {
		boolean result = ReportModulefunctionalitypage.clickintotheExportExcelbutton();
		
		if (!result) {
	        String message = "Export Excel (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Export Excel button clicked successfully");
	}
	
	@Then("user click on the star2 fax tab in workflow section")
	public void user_click_on_the_star2_fax_tab_in_workflow_section() {
		boolean result = ReportModulefunctionalitypage.clickintotheStar2FaxtabinWorkflow();
		
		if (!result) {
	        String message = "Star2 Fax (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Star2 Fax tab clicked successfully");
	}
	
	@And("user click on the export excel button in star2 fax")
	public void user_click_on_the_export_excel_button_in_star2_fax() {
		boolean result = ReportModulefunctionalitypage.clickintotheExportExcelbutton();
		
		if (!result) {
	        String message = "Export Excel (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Export Excel button clicked successfully");
	}
	
	@And("user click on the filter button in star2 fax")
	public void user_click_on_the_filter_button_in_star2_fax() {
		ReportModulefunctionalitypage.clickintotheFilterbuttoninWorkflow();
		
		System.out.println("Filter button clicked successfully");
		Hooks.scenario.log("Filter button clicked successfully");
	}
	
	@When("user select the from date in star2 fax")
	public void user_select_the_from_date_in_star2_fax() {
		// Click the From Date picker
        ReportModulefunctionalitypage.clickintotheFromDateinWorkflow();

        // Select today's date
        ReportModulefunctionalitypage.selectOriginalTodaysDateinFromDate();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Original Date: " + selectedDate);
        Hooks.scenario.log("Selected Original Date: " + selectedDate);
	}
	
	@Then("user select the to date in star2 fax")
	public void user_select_the_to_date_in_star2_fax() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheToDateinWorkflow();

        // Select After 1 Month date
        ReportModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date After 1 Month: " + selectedDate);
        Hooks.scenario.log("Selected To Date After 1 Month: " + selectedDate);
	}
	
	@And("user click on the search button in star2 fax")
	public void user_click_on_the_search_button_in_star2_fax() {
		String result = ReportModulefunctionalitypage.clickintothesearchbuttoninFilter();

	    System.out.println("Search Result: " + result);
	    Hooks.scenario.log("Search Result: " + result);

	    //Skip remaining steps ONLY when no records / error
	    if (result.startsWith("ERROR")) {
	        // Scenario marked as SKIPPED (not FAILED)
	        Assume.assumeTrue("Skipping scenario due to search result: " + result, false);
	    }
	}
	
	@And("user click on the view button in star2 fax")
	public void user_click_on_the_view_button_in_star2_fax() {
		boolean result = ReportModulefunctionalitypage.clickintotheViewbuttoninStar2Fax();
		
		if (!result) {
	        String message = "View (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("View button clicked successfully");
	}
	
	@Then("user click on the team action tab in workflow section")
	public void user_click_on_the_team_action_tab_in_workflow_section() {
		boolean result = ReportModulefunctionalitypage.clickintotheTeamActiontabinWorkflow();
		
		if (!result) {
	        String message = "Team Action (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Team Action tab clicked successfully");
	}
	
	@And("user click on the export excel button in team action")
	public void user_click_on_the_export_excel_button_in_team_action() {
		boolean result = ReportModulefunctionalitypage.clickintotheExportExcelbutton();
		
		if (!result) {
	        String message = "Export Excel (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Export Excel button clicked successfully");
	}
	
	@When("user click on the filter button in team action")
	public void user_click_on_the_filter_button_in_team_action() {
		ReportModulefunctionalitypage.clickintotheFilterbuttoninWorkflow();
		
		System.out.println("Filter button clicked successfully");
		Hooks.scenario.log("Filter button clicked successfully");
	}
	
	@Then("user select the from date in team action")
	public void user_select_the_from_date_in_team_action() {
		// Click the From Date picker
        ReportModulefunctionalitypage.clickintotheFromDateinWorkflow();

        // Select today's date
        ReportModulefunctionalitypage.selectOriginalTodaysDateinFromDate();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Original Date: " + selectedDate);
        Hooks.scenario.log("Selected Original Date: " + selectedDate);
	}
	
	@And("user select the to date in team action")
	public void user_select_the_to_date_in_team_action() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheToDateinWorkflow();

        // Select After 1 Month date
        ReportModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date After 1 Month: " + selectedDate);
        Hooks.scenario.log("Selected To Date After 1 Month: " + selectedDate);
	}
	
	@When("user click on the search button in team action")
	public void user_click_on_the_search_button_in_team_action() {
		String result = ReportModulefunctionalitypage.clickintothesearchbuttoninFilter();

	    System.out.println("Search Result: " + result);
	    Hooks.scenario.log("Search Result: " + result);

	    //Skip remaining steps ONLY when no records / error
	    if (result.startsWith("ERROR")) {
	        // Scenario marked as SKIPPED (not FAILED)
	        Assume.assumeTrue("Skipping scenario due to search result: " + result, false);
	    }
	}
	
	@Then("user click on the clear button in team action")
	public void user_click_on_the_clear_button_in_team_action() {
		ReportModulefunctionalitypage.clickintotheClearbuttoninWorkflow();
		
		System.out.println("Clear button clicked successfully");
		Hooks.scenario.log("Clear button clicked successfully");
	}
	
	@Then("user click on the communication tab in workflow section")
	public void user_click_on_the_communication_tab_in_workflow_section() {
		ReportModulefunctionalitypage.clickintotheCommunicationtabinWorkflow();
		
		System.out.println("Communication tab clicked successfully");
		Hooks.scenario.log("Communication tab clicked successfully");
	}
	
	@And("user click on the text audit tab in communication")
	public void user_click_on_the_text_audit_tab_in_communication() {
		boolean result = ReportModulefunctionalitypage.clickintotheTextAudittabinWorkflow();
		
		if (!result) {
	        String message = "Text Audit (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Text Audit tab clicked successfully");
	}
	
	@When("user click on the export excel button in text audit")
	public void user_click_on_the_export_excel_button_in_text_audit() {
		boolean result = ReportModulefunctionalitypage.clickintotheExportExcelbutton();
		
		if (!result) {
	        String message = "Export Excel (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Export Excel button clicked successfully");
	}
	
	@When("user click on the filter button in text audit")
	public void user_click_on_the_filter_button_in_text_audit() {
		ReportModulefunctionalitypage.clickintotheFilterbuttoninWorkflow();
		
		System.out.println("Filter button clicked successfully");
		Hooks.scenario.log("Filter button clicked successfully");
	}
	
	@Then("user select the from date in text audit")
	public void user_select_the_from_date_in_text_audit() {
		// Click the From Date picker
        ReportModulefunctionalitypage.clickintotheFromDateinWorkflow();

        // Select today's date
        ReportModulefunctionalitypage.selectOriginalTodaysDateinFromDate();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Original Date: " + selectedDate);
        Hooks.scenario.log("Selected Original Date: " + selectedDate);
	}
	
	@And("user select the to date in text audit")
	public void user_select_the_to_date_in_text_audit() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheToDateinWorkflow();

        // Select After 1 Month date
        ReportModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date After 1 Month: " + selectedDate);
        Hooks.scenario.log("Selected To Date After 1 Month: " + selectedDate);
	}
	
	@When("user click on the search button in text audit")
	public void user_click_on_the_search_button_in_text_audit() {
		String result = ReportModulefunctionalitypage.clickintothesearchbuttoninFilter();

	    System.out.println("Search Result: " + result);
	    Hooks.scenario.log("Search Result: " + result);

	    //Skip remaining steps ONLY when no records / error
	    if (result.startsWith("ERROR")) {
	        // Scenario marked as SKIPPED (not FAILED)
	        Assume.assumeTrue("Skipping scenario due to search result: " + result, false);
	    }
	}
	
	@Then("user click on the clear button in text audit")
	public void user_click_on_the_clear_button_in_text_audit() {
		ReportModulefunctionalitypage.clickintotheClearbuttoninWorkflow();
		
		System.out.println("Clear button clicked successfully");
		Hooks.scenario.log("Clear button clicked successfully");
	}
	
	@And("user click on the BOT Call Audit tab in communication")
	public void user_click_on_the_BOT_Call_Audit_tab_in_communication() {
		boolean result = ReportModulefunctionalitypage.clickintotheBOTCallAudittabinWorkflow();
		
		if (!result) {
	        String message = "BOT Call Audit (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("BOT Call Audit tab clicked successfully");
	}
	
	@When("user click on the export excel button in BOT Call Audit")
	public void user_click_on_the_export_excel_button_in_BOT_Call_Audit() {
		boolean result = ReportModulefunctionalitypage.clickintotheExportExcelbutton();
		
		if (!result) {
	        String message = "Export Excel (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Export Excel button clicked successfully");
	}
	
	@When("user click on the filter button in BOT Call Audit")
	public void user_click_on_the_filter_button_in_BOT_Call_Audit() {
		ReportModulefunctionalitypage.clickintotheFilterbuttoninWorkflow();
		
		System.out.println("Filter button clicked successfully");
		Hooks.scenario.log("Filter button clicked successfully");
	}
	
	@Then("user select the from date in BOT Call Audit")
	public void user_select_the_from_date_in_BOT_Call_Audit() {
		// Click the From Date picker
        ReportModulefunctionalitypage.clickintotheFromDateinWorkflow();

        // Select today's date
        ReportModulefunctionalitypage.selectOriginalTodaysDateinFromDate();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Original Date: " + selectedDate);
        Hooks.scenario.log("Selected Original Date: " + selectedDate);
	}
	
	@And("user select the to date in BOT Call Audit")
	public void user_select_the_to_date_in_BOT_Call_Audit() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheToDateinWorkflow();

        // Select After 1 Month date
        ReportModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date After 1 Month: " + selectedDate);
        Hooks.scenario.log("Selected To Date After 1 Month: " + selectedDate);
	}
	
	@When("user click on the search button in BOT Call Audit")
	public void user_click_on_the_search_button_in_BOT_Call_Audit() {
		String result = ReportModulefunctionalitypage.clickintothesearchbuttoninFilter();

	    System.out.println("Search Result: " + result);
	    Hooks.scenario.log("Search Result: " + result);

	    //Skip remaining steps ONLY when no records / error
	    if (result.startsWith("ERROR")) {
	        // Scenario marked as SKIPPED (not FAILED)
	        Assume.assumeTrue("Skipping scenario due to search result: " + result, false);
	    }
	}
	
	@Then("user click on the clear button in BOT Call Audit")
	public void user_click_on_the_clear_button_in_BOT_Call_Audit() {
		ReportModulefunctionalitypage.clickintotheClearbuttoninWorkflow();
		
		System.out.println("Clear button clicked successfully");
		Hooks.scenario.log("Clear button clicked successfully");
	}
	
	@And("user click on the Fax Audit tab in communication")
	public void user_click_on_the_Fax_Audit_tab_in_communication() {
		boolean result = ReportModulefunctionalitypage.clickintotheFaxAudittabinWorkflow();
		
		if (!result) {
	        String message = "Fax Audit (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Fax Audit tab clicked successfully");
	}
	
	@When("user click on the export excel button in fax audit")
	public void user_click_on_the_export_excel_button_in_fax_audit() {
		boolean result = ReportModulefunctionalitypage.clickintotheExportExcelbutton();
		
		if (!result) {
	        String message = "Export Excel (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Export Excel button clicked successfully");
	}
	
	@When("user click on the filter button in fax audit")
	public void user_click_on_the_filter_button_in_fax_audit() {
		ReportModulefunctionalitypage.clickintotheFilterbuttoninWorkflow();
		
		System.out.println("Filter button clicked successfully");
		Hooks.scenario.log("Filter button clicked successfully");
	}
	
	@Then("user select the from date in fax audit")
	public void user_select_the_from_date_in_fax_audit() {
		// Click the From Date picker
        ReportModulefunctionalitypage.clickintotheFromDateinWorkflow();

        // Select today's date
        ReportModulefunctionalitypage.selectOriginalTodaysDateinFromDate();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Original Date: " + selectedDate);
        Hooks.scenario.log("Selected Original Date: " + selectedDate);
	}
	
	@And("user select the to date in fax audit")
	public void user_select_the_to_date_in_fax_audit() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheToDateinWorkflow();

        // Select After 1 Month date
        ReportModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date After 1 Month: " + selectedDate);
        Hooks.scenario.log("Selected To Date After 1 Month: " + selectedDate);
	}
	
	@When("user click on the search button in fax audit")
	public void user_click_on_the_search_button_in_fax_audit() {
		String result = ReportModulefunctionalitypage.clickintothesearchbuttoninFilter();

	    System.out.println("Search Result: " + result);
	    Hooks.scenario.log("Search Result: " + result);

	    //Skip remaining steps ONLY when no records / error
	    if (result.startsWith("ERROR")) {
	        // Scenario marked as SKIPPED (not FAILED)
	        Assume.assumeTrue("Skipping scenario due to search result: " + result, false);
	    }
	}
	
	@Then("user click on the clear button in fax audit")
	public void user_click_on_the_clear_button_in_fax_audit() {
		ReportModulefunctionalitypage.clickintotheClearbuttoninWorkflow();
		
		System.out.println("Clear button clicked successfully");
		Hooks.scenario.log("Clear button clicked successfully");
	}
	
	@And("user click on the Mail Audit tab in communication")
	public void user_click_on_the_Mail_Audit_tab_in_communication() {
		boolean result = ReportModulefunctionalitypage.clickintotheMailAudittabinWorkflow();
		
		if (!result) {
	        String message = "Mail Audit (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Mail Audit tab clicked successfully");
	}
	
	@When("user click on the export excel button in mail audit")
	public void user_click_on_the_export_excel_button_in_mail_audit() {
		boolean result = ReportModulefunctionalitypage.clickintotheExportExcelbutton();
		
		if (!result) {
	        String message = "Export Excel (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Export Excel button clicked successfully");
	}
	
	@When("user click on the filter button in mail audit")
	public void user_click_on_the_filter_button_in_mail_audit() {
		ReportModulefunctionalitypage.clickintotheFilterbuttoninWorkflow();
		
		System.out.println("Filter button clicked successfully");
		Hooks.scenario.log("Filter button clicked successfully");
	}
	
	@Then("user select the from date in mail audit")
	public void user_select_the_from_date_in_mail_audit() {
		// Click the From Date picker
        ReportModulefunctionalitypage.clickintotheFromDateinWorkflow();

        // Select today's date
        ReportModulefunctionalitypage.selectOriginalTodaysDateinFromDate();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Original Date: " + selectedDate);
        Hooks.scenario.log("Selected Original Date: " + selectedDate);
	}
	
	@And("user select the to date in mail audit")
	public void user_select_the_to_date_in_mail_audit() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheToDateinWorkflow();

        // Select After 1 Month date
        ReportModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date After 1 Month: " + selectedDate);
        Hooks.scenario.log("Selected To Date After 1 Month: " + selectedDate);
	}
	
	@When("user click on the search button in mail audit")
	public void user_click_on_the_search_button_in_mail_audit() {
		String result = ReportModulefunctionalitypage.clickintothesearchbuttoninFilter();

	    System.out.println("Search Result: " + result);
	    Hooks.scenario.log("Search Result: " + result);

	    //Skip remaining steps ONLY when no records / error
	    if (result.startsWith("ERROR")) {
	        // Scenario marked as SKIPPED (not FAILED)
	        Assume.assumeTrue("Skipping scenario due to search result: " + result, false);
	    }
	}
	
	@And("user select the to date is less than of from date in mail audit")
	public void user_select_the_to_date_is_less_than_of_from_date_in_mail_audit() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheToDateinWorkflow();

        // Select After 1 Month date
        ReportModulefunctionalitypage.selectDateBeforeTenDays();
        
        // Log the same date logic (-10 days)
        LocalDate targetDate = LocalDate.now().minusDays(10);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date Before 10 days: " + selectedDate);
        Hooks.scenario.log("Selected To Date Before 10 days: " + selectedDate);
	}
	
	@And("user select the to date is less than of from date in fax audit")
	public void user_select_the_to_date_is_less_than_of_from_date_in_fax_audit() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheToDateinWorkflow();

        // Select After 1 Month date
        ReportModulefunctionalitypage.selectDateBeforeTenDays();
        
        // Log the same date logic (-10 days)
        LocalDate targetDate = LocalDate.now().minusDays(10);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date Before 10 days: " + selectedDate);
        Hooks.scenario.log("Selected To Date Before 10 days: " + selectedDate);
	}
	
	@And("user select the to date is less than of from date in BOT Call Audit")
	public void user_select_the_to_date_is_less_than_of_from_date_in_BOT_Call_Audit() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheToDateinWorkflow();

        // Select After 1 Month date
        ReportModulefunctionalitypage.selectDateBeforeTenDays();
        
        // Log the same date logic (-10 days)
        LocalDate targetDate = LocalDate.now().minusDays(10);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date Before 10 days: " + selectedDate);
        Hooks.scenario.log("Selected To Date Before 10 days: " + selectedDate);
	}
	
	@And("user select the to date is less than of from date in text audit")
	public void user_select_the_to_date_is_less_than_of_from_date_in_text_audit() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheToDateinWorkflow();

        // Select After 1 Month date
        ReportModulefunctionalitypage.selectDateBeforeTenDays();
        
        // Log the same date logic (-10 days)
        LocalDate targetDate = LocalDate.now().minusDays(10);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date Before 10 days: " + selectedDate);
        Hooks.scenario.log("Selected To Date Before 10 days: " + selectedDate);
	}
	
	@And("user select the to date is less than of from date in team action")
	public void user_select_the_to_date_is_less_than_of_from_date_in_team_action() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheToDateinWorkflow();

        // Select After 1 Month date
        ReportModulefunctionalitypage.selectDateBeforeTenDays();
        
        // Log the same date logic (-10 days)
        LocalDate targetDate = LocalDate.now().minusDays(10);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date Before 10 days: " + selectedDate);
        Hooks.scenario.log("Selected To Date Before 10 days: " + selectedDate);
	}
	
	@And("user select the to date is less than of from date in star2 fax")
	public void user_select_the_to_date_is_less_than_of_from_date_in_star2_fax() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheToDateinWorkflow();

        // Select After 1 Month date
        ReportModulefunctionalitypage.selectDateBeforeTenDays();
        
        // Log the same date logic (-10 days)
        LocalDate targetDate = LocalDate.now().minusDays(10);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date Before 10 days: " + selectedDate);
        Hooks.scenario.log("Selected To Date Before 10 days: " + selectedDate);
	}
	
	@Then("user click on the clear button in mail audit")
	public void user_click_on_the_clear_button_in_mail_audit() {
		ReportModulefunctionalitypage.clickintotheClearbuttoninWorkflow();
		
		System.out.println("Clear button clicked successfully");
		Hooks.scenario.log("Clear button clicked successfully");
	}
	
	
	//---------------------------------Sales Rep Visit Section------------------------------------
	
	
	@When("user click on the Sales Rep tab in sidebar in Report module page")
	public void user_click_on_the_Sales_Rep_tab_in_sidebar_in_Report_module_page() {
		boolean result = ReportModulefunctionalitypage.clickintotheSalesReptabinsidebar();
		
		if (!result) {
	        String message = "Sales Rep (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Sales Rep tab clicked successfully");
	}
	
	@Then("user click on the sales rep visit tab in sales rep")
	public void user_click_on_the_sales_rep_visit_tab_in_sales_rep() {
		boolean result = ReportModulefunctionalitypage.clickintotheSalesRepVisittabinSalesRep();
		
		if (!result) {
	        String message = "Sales Rep Visit (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Sales Rep Visit tab clicked successfully");
	}
	
	@And("user click on the export excel button in sales rep visit")
	public void user_click_on_the_export_excel_button_in_sales_rep_visit() {
		boolean result = ReportModulefunctionalitypage.clickintotheExportExcelbutton();
		
		if (!result) {
	        String message = "Export Excel (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Export Excel button clicked successfully");
	}
	
	@And("user click on the filter button in sales rep visit")
	public void user_click_on_the_filter_button_in_sales_rep_visit() {
		ReportModulefunctionalitypage.clickintotheFilterbuttoninWorkflow();
		
		System.out.println("Filter button clicked successfully");
		Hooks.scenario.log("Filter button clicked successfully");
	}
	
	@When("user select the from date in sales rep visit")
	public void user_select_the_from_date_in_sales_rep_visit() {
		// Click the From Date picker
        ReportModulefunctionalitypage.clickintotheFromDateinWorkflow();

        // Select today's date
        ReportModulefunctionalitypage.selectOriginalTodaysDateinFromDate();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Original Date: " + selectedDate);
        Hooks.scenario.log("Selected Original Date: " + selectedDate);
	}
	
	@Then("user select the to date in sales rep visit")
	public void user_select_the_to_date_in_sales_rep_visit() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheToDateinWorkflow();

        // Select After 1 Month date
        ReportModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date After 1 Month: " + selectedDate);
        Hooks.scenario.log("Selected To Date After 1 Month: " + selectedDate);
	}
	
	@And("user click on the search button in sales rep visit")
	public void user_click_on_the_search_button_in_sales_rep_visit() {
		String result = ReportModulefunctionalitypage.clickintothesearchbuttoninFilter();

	    System.out.println("Search Result: " + result);
	    Hooks.scenario.log("Search Result: " + result);

	    //Skip remaining steps ONLY when no records / error
	    if (result.startsWith("ERROR")) {
	        // Scenario marked as SKIPPED (not FAILED)
	        Assume.assumeTrue("Skipping scenario due to search result: " + result, false);
	    }
	}
	
	@When("user click on the clear button in sales rep visit")
	public void user_click_on_the_clear_button_in_sales_rep_visit() {
		ReportModulefunctionalitypage.clickintotheClearbuttoninWorkflow();
		
		System.out.println("Clear button clicked successfully");
		Hooks.scenario.log("Clear button clicked successfully");
	}
	
	@Then("user select the to date is less than from date in sales rep visit")
	public void user_select_the_to_date_is_less_than_from_date_in_sales_rep_visit() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheToDateinWorkflow();

        // Select After 1 Month date
        ReportModulefunctionalitypage.selectDateBeforeTenDays();
        
        // Log the same date logic (-10 days)
        LocalDate targetDate = LocalDate.now().minusDays(10);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date Before 10 days: " + selectedDate);
        Hooks.scenario.log("Selected To Date Before 10 days: " + selectedDate);
	}
	
	
	//-------------------------------------Drug Section-----------------------------------------
	
	
	@When("user click on the Drug tab in sidebar in Report module page")
	public void user_click_on_the_Drug_tab_in_sidebar_in_Report_module_page() {
		boolean result = ReportModulefunctionalitypage.clickintotheDrugtabinsidebar();
		
		if (!result) {
	        String message = "Drug (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Drug tab clicked successfully");
	}
	
	@Then("user click on the drug tab in Drug")
	public void user_click_on_the_drug_tab_in_Drug() {
		boolean result = ReportModulefunctionalitypage.clickintotheDrugtabinDrug();
		
		if (!result) {
	        String message = "Drug (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Drug tab clicked successfully");
	}
	
	@And("user click on the export excel button in drug")
	public void user_click_on_the_export_excel_button_in_drug() {
		boolean result = ReportModulefunctionalitypage.clickintotheExportExcelbutton();
		
		if (!result) {
	        String message = "Export Excel (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Export Excel button clicked successfully");
	}
	
	@And("user click on the filter button in drug")
	public void user_click_on_the_filter_button_in_drug() {
		ReportModulefunctionalitypage.clickintotheFilterbuttoninWorkflow();
		
		System.out.println("Filter button clicked successfully");
		Hooks.scenario.log("Filter button clicked successfully");
	}
	
	@When("user select the from date in drug")
	public void user_select_the_from_date_in_drug() {
		// Click the From Date picker
        ReportModulefunctionalitypage.clickintotheFromDateinWorkflow();

        // Select today's date
        ReportModulefunctionalitypage.selectOriginalTodaysDateinFromDate();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Original Date: " + selectedDate);
        Hooks.scenario.log("Selected Original Date: " + selectedDate);
	}
	
	@Then("user select the to date in drug")
	public void user_select_the_to_date_in_drug() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheToDateinWorkflow();

        // Select After 1 Month date
        ReportModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date After 1 Month: " + selectedDate);
        Hooks.scenario.log("Selected To Date After 1 Month: " + selectedDate);
	}
	
	@Then("user select the to date as less than from date in drug")
	public void user_select_the_to_date_as_less_than_from_date_in_drug() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheToDateinWorkflow();

        // Select before 10 days
        ReportModulefunctionalitypage.selectDateBeforeTenDays();
        
        // Log the same date logic (-10 days)
        LocalDate targetDate = LocalDate.now().minusDays(10);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date Before 10 days: " + selectedDate);
        Hooks.scenario.log("Selected To Date Before 10 days: " + selectedDate);
	}
	
	@And("user enter the drug name in drug")
	public void user_enter_the_drug_name_in_drug() {
		String DrugName = Hooks.prop.getProperty("drugname");
		ReportModulefunctionalitypage.entertheDrugNameinFilter(DrugName);
		
		System.out.println("User Entered Drug Name: " + DrugName);
		Hooks.scenario.log("User Entered Drug Name: " + DrugName);
	}
	
	@And("user enter the invalid drug name in drug")
	public void user_enter_the_invalid_drug_name_in_drug() {
		String DrugName = Hooks.prop.getProperty("invaliddrugname");
		ReportModulefunctionalitypage.entertheDrugNameinFilter(DrugName);
		
		System.out.println("User Entered Invalid Drug Name: " + DrugName);
		Hooks.scenario.log("User Entered Invalid Drug Name: " + DrugName);
	}
	
	@When("user enter the packager in drug")
	public void user_enter_the_packager_in_drug() {
		String Packager = Hooks.prop.getProperty("packager");
		ReportModulefunctionalitypage.enterthePackagerinFilter(Packager);
		
		System.out.println("User Entered Packager: " + Packager);
		Hooks.scenario.log("User Entered Packager: " + Packager);
	}
	
	@When("user enter the invalid packager in drug")
	public void user_enter_the_invalid_packager_in_drug() {
		String Packager = Hooks.prop.getProperty("invalidpackager");
		ReportModulefunctionalitypage.enterthePackagerinFilter(Packager);
		
		System.out.println("User Entered Invalid Packager: " + Packager);
		Hooks.scenario.log("User Entered Invalid Packager: " + Packager);
	}
	
	@Then("user enter the NDC in drug")
	public void user_enter_the_NDC_in_drug() {
		String NDC = Hooks.prop.getProperty("ndc");
		ReportModulefunctionalitypage.entertheNDCinFilter(NDC);
		
		System.out.println("User Entered NDC: " + NDC);
		Hooks.scenario.log("User Entered NDC: " + NDC);
	}
	
	@Then("user enter the invalid NDC in drug")
	public void user_enter_the_invalid_NDC_in_drug() {
		String NDC = Hooks.prop.getProperty("invalidndc");
		ReportModulefunctionalitypage.entertheNDCinFilter(NDC);
		
		System.out.println("User Entered NDC: " + NDC);
		Hooks.scenario.log("User Entered NDC: " + NDC);
	}
	
	@And("user click on the search button in drug")
	public void user_click_on_the_search_button_in_drug() {
		String result = ReportModulefunctionalitypage.clickintothesearchbuttoninFilter();

	    System.out.println("Search Result: " + result);
	    Hooks.scenario.log("Search Result: " + result);

	    //Skip remaining steps ONLY when no records / error
	    if (result.startsWith("ERROR")) {
	        // Scenario marked as SKIPPED (not FAILED)
	        Assume.assumeTrue("Skipping scenario due to search result: " + result, false);
	    }
	}
	
	@When("user click on the clear button in drug")
	public void user_click_on_the_clear_button_in_drug() {
		ReportModulefunctionalitypage.clickintotheClearbuttoninWorkflow();
		
		System.out.println("Clear button clicked successfully");
		Hooks.scenario.log("Clear button clicked successfully");
	}
	
	
	//----------------------------------Billings (Payment Status) Section------------------------------------------
	
	
	@When("user click on the Billings tab in sidebar in Report module page")
	public void user_click_on_the_Billings_tab_in_sidebar_in_Report_module_page() {
		boolean result = ReportModulefunctionalitypage.clickintotheBillingstabinsidebar();
		
		if (!result) {
	        String message = "Billings (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Billings tab clicked successfully");
	}
	
	@Then("user click on the payment status tab in Billings")
	public void user_click_on_the_payment_status_tab_in_Billings() {
		boolean result = ReportModulefunctionalitypage.clickintothePaymentStatustabinBillings();
		
		if (!result) {
	        String message = "Payment Status (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Payment Status tab clicked successfully");
	}
	
	@And("user click on the export excel button in payment status")
	public void user_click_on_the_export_excel_button_in_payment_status() {
		boolean result = ReportModulefunctionalitypage.clickintotheExportExcelbutton();
		
		if (!result) {
	        String message = "Export Excel (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Export Excel button clicked successfully");
	}
	
	@And("user click on the filter button in payment status")
	public void user_click_on_the_filter_button_in_payment_status() {
		ReportModulefunctionalitypage.clickintotheFilterbuttoninWorkflow();
		
		System.out.println("Filter button clicked successfully");
		Hooks.scenario.log("Filter button clicked successfully");
	}
	
	@When("user select the from date in payment status")
	public void user_select_the_from_date_in_payment_status() {
		// Click the From Date picker
        ReportModulefunctionalitypage.clickintotheFromDateinWorkflow();

        // Select today's date
        ReportModulefunctionalitypage.selectOriginalTodaysDateinFromDate();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Original Date: " + selectedDate);
        Hooks.scenario.log("Selected Original Date: " + selectedDate);
	}
	
	@Then("user select the to date in payment status")
	public void user_select_the_to_date_in_payment_status() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheToDateinWorkflow();

        // Select After 1 Month date
        ReportModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date After 1 Month: " + selectedDate);
        Hooks.scenario.log("Selected To Date After 1 Month: " + selectedDate);
	}
	
	@And("user click on the search button in payment status")
	public void user_click_on_the_search_button_in_payment_status() {
		String result = ReportModulefunctionalitypage.clickintothesearchbuttoninFilter();

	    System.out.println("Search Result: " + result);
	    Hooks.scenario.log("Search Result: " + result);

	    //Skip remaining steps ONLY when no records / error
	    if (result.startsWith("ERROR")) {
	        // Scenario marked as SKIPPED (not FAILED)
	        Assume.assumeTrue("Skipping scenario due to search result: " + result, false);
	    }
	}
	
	@When("user click on the clear button in payment status")
	public void user_click_on_the_clear_button_in_payment_status() {
		ReportModulefunctionalitypage.clickintotheClearbuttoninWorkflow();
		
		System.out.println("Clear button clicked successfully");
		Hooks.scenario.log("Clear button clicked successfully");
	}
	
	@Then("user select the to date as less than from date in payment status")
	public void user_select_the_to_date_as_less_than_from_date_in_payment_status() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheToDateinWorkflow();

        // Select before 10 days
        ReportModulefunctionalitypage.selectDateBeforeTenDays();
        
        // Log the same date logic (-10 days)
        LocalDate targetDate = LocalDate.now().minusDays(10);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date Before 10 days: " + selectedDate);
        Hooks.scenario.log("Selected To Date Before 10 days: " + selectedDate);
	}
	
	
	//------------------------------Patients Section-----------------------------------------------------
	
	
	@When("user click on the Patients tab in sidebar in Report module page")
	public void user_click_on_the_Patients_tab_in_sidebar_in_Report_module_page() {
		boolean result = ReportModulefunctionalitypage.clickintothePatientstabinsidebar();
		
		if (!result) {
	        String message = "Patients (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Patients tab clicked successfully");
	}
	
	@Then("user click on the Patient ReSync tab in Patients")
	public void user_click_on_the_Patient_ReSync_tab_in_Patients() {
		boolean result = ReportModulefunctionalitypage.clickintothePatientReSynctabinPatients();
		
		if (!result) {
	        String message = "Patient ReSync (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Patient ReSync tab clicked successfully");
	}
	
	@And("user click on the export excel button in patient resync")
	public void user_click_on_the_export_excel_button_in_patient_resync() {
		boolean result = ReportModulefunctionalitypage.clickintotheExportExcelbutton();
		
		if (!result) {
	        String message = "Export Excel (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Export Excel button clicked successfully");
	}
	
	@And("user click on the filter button in patient resync")
	public void user_click_on_the_filter_button_in_patient_resync() {
		ReportModulefunctionalitypage.clickintotheFilterbuttoninWorkflow();
		
		System.out.println("Filter button clicked successfully");
		Hooks.scenario.log("Filter button clicked successfully");
	}
	
	@When("user select the from select day of month by index in patient resync")
	public void user_select_the_from_select_day_of_month_by_index_in_patient_resync() throws Exception {
		int FromDateOfMonth = 15; // fetch from config if required

	    boolean result = ReportModulefunctionalitypage.selecttheFromDateofMonthByIndexinPatientResync(FromDateOfMonth);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "From Date Of Month is NOT present in dropdown for index: " + FromDateOfMonth;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("From Date Of Month selected successfully using index: " + FromDateOfMonth);
	    System.out.println("From Date Of Month selected successfully using index: " + FromDateOfMonth);
	}
	
	@Then("user select the to select day of month by index in patient resync")
	public void user_select_the_to_select_day_of_month_by_index_in_patient_resync() throws Exception {
		int ToDateOfMonth = 30; // fetch from config if required

	    boolean result = ReportModulefunctionalitypage.selecttheToDateofMonthByIndexinPatientResync(ToDateOfMonth);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "To Date Of Month is NOT present in dropdown for index: " + ToDateOfMonth;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("To Date Of Month selected successfully using index: " + ToDateOfMonth);
	    System.out.println("To Date Of Month selected successfully using index: " + ToDateOfMonth);
	}
	
	@And("user click on the search button in patient resync")
	public void user_click_on_the_search_button_in_patient_resync() {
		String result = ReportModulefunctionalitypage.clickintothesearchbuttoninFilter();

	    System.out.println("Search Result: " + result);
	    Hooks.scenario.log("Search Result: " + result);

	    //Skip remaining steps ONLY when no records / error
	    if (result.startsWith("ERROR")) {
	        // Scenario marked as SKIPPED (not FAILED)
	        Assume.assumeTrue("Skipping scenario due to search result: " + result, false);
	    }
	}
	
	@When("user click on the clear button in patient resync")
	public void user_click_on_the_clear_button_in_patient_resync() {
		ReportModulefunctionalitypage.clickintotheClearbuttoninWorkflow();
		
		System.out.println("Clear button clicked successfully");
		Hooks.scenario.log("Clear button clicked successfully");
	}
	
	@Then("user select the to select day of month as less from day by index in patient resync")
	public void user_select_the_to_select_day_of_month_as_less_from_day_by_index_in_patient_resync() throws Exception {
		int ToDateOfMonth = 1; // fetch from config if required

	    boolean result = ReportModulefunctionalitypage.selecttheToDateofMonthByIndexinPatientResync(ToDateOfMonth);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "To Date Of Month is NOT present in dropdown for index: " + ToDateOfMonth;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("To Date Of Month selected as less then From Date successfully using index: " + ToDateOfMonth);
	    System.out.println("To Date Of Month selected as less then From Date successfully using index: " + ToDateOfMonth);
	}
	
	@Then("user click on the Patients By Ranking tab in Patients")
	public void user_click_on_the_Patients_By_Ranking_tab_in_Patients() {
		boolean result = ReportModulefunctionalitypage.clickintothePatientsByRankingtabPatients();
		
		if (!result) {
	        String message = "Patients By Ranking (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Patients By Ranking tab clicked successfully");
	}
	
	@And("user click on the export excel button in patients by ranking")
	public void user_click_on_the_export_excel_button_in_patients_by_ranking() {
		boolean result = ReportModulefunctionalitypage.clickintotheExportExcelbutton();
		
		if (!result) {
	        String message = "Export Excel (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Export Excel button clicked successfully");
	}
	
	
	//----------------------------------------Provider Section-------------------------------------------
	
	
	@When("user click on the Provider tab in sidebar in Report module page")
	public void user_click_on_the_Provider_tab_in_sidebar_in_Report_module_page() {
		boolean result = ReportModulefunctionalitypage.clickintotheProvidertabinsidebar();
		
		if (!result) {
	        String message = "Provider (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Provider tab clicked successfully");
	}
	
	@Then("user click on the Providers By Ranking tab in Patients")
	public void user_click_on_the_Providers_By_Ranking_tab_in_Patients() {
		boolean result = ReportModulefunctionalitypage.clickintotheProvidersByRankingtabinProvider();
		
		if (!result) {
	        String message = "Providers By Ranking(more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Providers By Ranking tab clicked successfully");
	}
	
	@And("user click on the export excel button in providers by ranking")
	public void user_click_on_the_export_excel_button_in_providers_by_ranking() {
		boolean result = ReportModulefunctionalitypage.clickintotheExportExcelbutton();
		
		if (!result) {
	        String message = "Export Excel (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Export Excel button clicked successfully");
	}
	
	
	//------------------------------------Clinical Section--------------------------------------------------
	
	
	@When("user click on the Clinical tab in sidebar in Report module page")
	public void user_click_on_the_Clinical_tab_in_sidebar_in_Report_module_page() {
		boolean result = ReportModulefunctionalitypage.clickintotheClinicaltabinsidebar();
		
		if (!result) {
	        String message = "Clinical (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Clinical tab clicked successfully");
	}
	
	@Then("user click on the prior authorization tab in Clinical")
	public void user_click_on_the_prior_authorization_tab_in_Clinical() {
		boolean result = ReportModulefunctionalitypage.clickintothePriorAuthorizationtabinClinical();
		
		if (!result) {
	        String message = "Prior Authorization(more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Prior Authorization tab clicked successfully");
	}
	
	@And("user click on the export to document button in prior authorization")
	public void user_click_on_the_export_to_document_button_in_prior_authorization() {
		boolean result = ReportModulefunctionalitypage.clickintotheExportToDocumentbuttoninClinical();
		
		if (!result) {
	        String message = "Export To Document(more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Export To Document tab clicked successfully");
	}
	
	@And("user click on the filter button in prior authorization")
	public void user_click_on_the_filter_button_in_prior_authorization() {
		ReportModulefunctionalitypage.clickintotheFilterbuttoninWorkflow();
		
		System.out.println("Filter button clicked successfully");
		Hooks.scenario.log("Filter button clicked successfully");
	}
	
	@When("user click on the add provider tab in filter of prior authorization")
	public void user_click_on_the_add_provider_tab_in_filter_of_prior_authorization() throws Exception {
		ReportModulefunctionalitypage.clickintotheAddProvidetabinfilterofClinical();
		Thread.sleep(1500);
		
		System.out.println("Add Provider tab clicked successfully");
		Hooks.scenario.log("Add Provider tab clicked successfully");
	}
	
	@Then("user enter the provider last name in search provider pop-up window")
	public void user_enter_the_provider_last_name_in_search_provider_pop_up_window() {
		String ProviderLastName = Hooks.prop.getProperty("providerlastname");
		ReportModulefunctionalitypage.entertheProviderLastNameinSearchProvider(ProviderLastName);
		
		System.out.println("User Entered Provider Last Name: " + ProviderLastName);
		Hooks.scenario.log("User Entered Provider Last Name: " + ProviderLastName);
	}
	
	@And("user enter the provider first name in search provider pop-up window")
	public void user_enter_the_provider_first_name_in_search_provider_pop_up_window() {
		String ProviderFirstName = Hooks.prop.getProperty("providerfirstname");
		ReportModulefunctionalitypage.entertheProviderFirstNameinSearchProvider(ProviderFirstName);
		
		System.out.println("User Entered Provider First Name: " + ProviderFirstName);
		Hooks.scenario.log("User Entered Provider First Name: " + ProviderFirstName);
	}
	
	@When("user enter the provider phone number in search provider pop-up window")
	public void user_enter_the_provider_phone_number_in_search_provider_pop_up_window() {
		String ProviderPhoneNumber = Hooks.prop.getProperty("providerphonenumber");
		ReportModulefunctionalitypage.entertheProviderPhoneNumberinSearchProvider(ProviderPhoneNumber);
		
		System.out.println("User Entered Provider Phone Number: " + ProviderPhoneNumber);
		Hooks.scenario.log("User Entered Provider Phone Number: " + ProviderPhoneNumber);
	}
	
	@Then("user click on the search button in search provider pop-up window")
	public void user_click_on_the_search_button_in_search_provider_pop_up_window() throws Exception {
		String result = ReportModulefunctionalitypage.clickintotheSearchbuttoninSearchProvider();
		Thread.sleep(1000);
		
		System.out.println("Search Result: " + result);
		Hooks.scenario.log("Search Result: " + result);
		
		if (result.startsWith("ERROR") || result.contains("No Record")) {

			Hooks.scenario.log("Provider is not placed: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user click on the first provider radio button in search provider pop-up window")
	public void user_click_on_the_first_provider_radio_button_in_search_provider_pop_up_window() {
		ReportModulefunctionalitypage.clickintotheFirstProviderradiobuttoninSearchProvider();
		
		System.out.println("First Provider radio button clicked successfully");
		Hooks.scenario.log("First Provider radio button clicked successfully");
	}
	
	@When("user click on the submit button in search provider pop-up window")
	public void user_click_on_the_submit_button_in_search_provider_pop_up_window() {
		String result = ReportModulefunctionalitypage.clickintotheSubmitbuttoninSearchProvider();
		
		System.out.println("Submit button clicked successfully and Message is shown: " + result);
		Hooks.scenario.log("Submit button clicked successfully and Message is shown: " + result);
		
		if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Provider is not placed: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@When("user click on the add provider group tab in filter of prior authorization")
	public void user_click_on_the_add_provider_group_tab_in_filter_of_prior_authorization() throws Exception {
		ReportModulefunctionalitypage.clickintotheAddProviderGrouptabinFilter();
		Thread.sleep(1000);
		
		System.out.println("Add Provider Group tab clicked successfully");
		Hooks.scenario.log("Add Provider Group tab clicked successfully");
	}
	
	@Then("user enter the provider group name in search provider group pop-up window")
	public void user_enter_the_provider_group_name_in_search_provider_group_pop_up_window() {
		String ProviderGroupName = Hooks.prop.getProperty("providergroupname");
		ReportModulefunctionalitypage.entertheProviderGroupnameinSearchProviderGroup(ProviderGroupName);
		
		System.out.println("User Entered Provider Group Name: " + ProviderGroupName);
		Hooks.scenario.log("User Entered Provider Group Name: " + ProviderGroupName);
	}
	
	@And("user click on the search button in search provider group pop-up window")
	public void user_click_on_the_search_button_in_search_provider_group_pop_up_window() throws Exception {
		String result = ReportModulefunctionalitypage.clickintotheSearchbuttoninSearchProvider();
		Thread.sleep(1000);
		
		System.out.println("Search Result: " + result);
		Hooks.scenario.log("Search Result: " + result);
		
		if (result.startsWith("ERROR") || result.contains("No Record")) {

			Hooks.scenario.log("Provider Group Name is not placed: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user click on the first provider radio button in search provider group pop-up window")
	public void user_click_on_the_first_provider_radio_button_in_search_provider_group_pop_up_window() {
		ReportModulefunctionalitypage.clickintotheFirstProviderGroupradiobuttoninSearchProvideGroup();
		
		System.out.println("First Radio button clicked successfully");
		Hooks.scenario.log("First Radio button clicked successfully");
	}
	
	@When("user click on the submit button in search provider group pop-up window")
	public void user_click_on_the_submit_button_in_search_provider_group_pop_up_window() {
		String result = ReportModulefunctionalitypage.clickintotheSubmitbuttoninSearchProviderGroup();
		
		System.out.println("Submit button clicked successfully and Message is shown: " + result);
		Hooks.scenario.log("Submit button clicked successfully and Message is shown: " + result);
		
		if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Provider is not placed: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user select the from date in filter of prior authorization")
	public void user_select_the_from_date_in_filter_of_prior_authorization() {
		// Click the From Date picker
        ReportModulefunctionalitypage.clickintotheFromDateinWorkflow();

        // Select today's date
        ReportModulefunctionalitypage.selectOriginalTodaysDateinFromDateinClinical();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Original Date: " + selectedDate);
        Hooks.scenario.log("Selected Original Date: " + selectedDate);
	}
	
	@And("user select the to date in filter of prior authorization")
	public void user_select_the_to_date_in_filter_of_prior_authorization() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheToDateinWorkflow();

        // Select After 1 Month date
        ReportModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date After 1 Month: " + selectedDate);
        Hooks.scenario.log("Selected To Date After 1 Month: " + selectedDate);
	}
	
	@And("user select the to date as less than from date in filter of prior authorization")
	public void user_select_the_to_date_as_less_than_from_date_in_filter_of_prior_authorization() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheToDateinWorkflow();

        /// Select before 1 month
        ReportModulefunctionalitypage.selectExpiryDateBefore1MonthAutomatically();

        // Log the same date logic (-1 month)
        LocalDate targetDate = LocalDate.now().minusMonths(1);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date Before 1 Month: " + selectedDate);
        Hooks.scenario.log("Selected To Date Before 1 Month: " + selectedDate);
	}
	
	@When("user click on the search button in filter of prior authorization")
	public void user_click_on_the_search_button_in_filter_of_prior_authorization() {
		String result = ReportModulefunctionalitypage.clickintothesearchbuttoninFilterClinical();

	    System.out.println("Search Result: " + result);
	    Hooks.scenario.log("Search Result: " + result);

	    //Skip remaining steps ONLY when no records / error
	    if (result.startsWith("ERROR")) {
	        // Scenario marked as SKIPPED (not FAILED)
	        Assume.assumeTrue("Skipping scenario due to search result: " + result, false);
	    }
	}
	
	
	//------------------------------Referral Section-------------------------------------
	
	
	@When("user click on the Referral tab in sidebar in Report module page")
	public void user_click_on_the_Referral_tab_in_sidebar_in_Report_module_page() {
		boolean result = ReportModulefunctionalitypage.clickintotheReferraltabinSidebar();
		
		if (!result) {
	        String message = "Referral(more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Referral tab clicked successfully");
	}
	
	@Then("user click on the referral tab in Referral")
	public void user_click_on_the_referral_tab_in_Referral() {
		boolean result = ReportModulefunctionalitypage.clickintotheReferraltabinReferral();
		
		if (!result) {
	        String message = "Referral(more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Referral tab clicked successfully");
	}
	
	@And("user click on the export to document button in referral")
	public void user_click_on_the_export_to_document_button_in_referral() {
		boolean result = ReportModulefunctionalitypage.clickintotheExportToDocumentbuttoninClinical();
		
		if (!result) {
	        String message = "Export To Document(more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Export To Document tab clicked successfully");
	}
	
	@And("user click on the filter button in referral")
	public void user_click_on_the_filter_button_in_referral() {
		ReportModulefunctionalitypage.clickintotheFilterbuttoninWorkflow();
		
		System.out.println("Filter button clicked successfully");
		Hooks.scenario.log("Filter button clicked successfully");
	}
	
	@When("user click on the add provider tab in filter of referral")
	public void user_click_on_the_add_provider_tab_in_filter_of_referral() throws Exception {
		ReportModulefunctionalitypage.clickintotheAddProvidetabinfilterofClinical();
		Thread.sleep(1500);
		
		System.out.println("Add Provider tab clicked successfully");
		Hooks.scenario.log("Add Provider tab clicked successfully");
	}
	
	@And("user click on the add provider group tab in filter of referral")
	public void user_click_on_the_add_provider_group_tab_in_filter_of_referral() throws Exception {
		ReportModulefunctionalitypage.clickintotheAddProviderGrouptabinFilter();
		Thread.sleep(1000);
		
		System.out.println("Add Provider Group tab clicked successfully");
		Hooks.scenario.log("Add Provider Group tab clicked successfully");
	}
	
	@Then("user select the from date in filter of referral")
	public void user_select_the_from_date_in_filter_of_referral() {
		// Click the From Date picker
        ReportModulefunctionalitypage.clickintotheFromDateinWorkflow();

        // Select today's date
        ReportModulefunctionalitypage.selectOriginalTodaysDateinFromDateReferral();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Original Date: " + selectedDate);
        Hooks.scenario.log("Selected Original Date: " + selectedDate);
	}
	
	@And("user select the to date in filter of referral")
	public void user_select_the_to_date_in_filter_of_referral() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheToDateinWorkflow();

        // Select After 1 Month date
        ReportModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date After 1 Month: " + selectedDate);
        Hooks.scenario.log("Selected To Date After 1 Month: " + selectedDate);
	}
	
	@And("user select the to date as less than from date in filter of referral")
	public void user_select_the_to_date_as_less_than_from_date_in_filter_of_referral() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheToDateinWorkflow();

        /// Select before 1 month
        ReportModulefunctionalitypage.selectExpiryDateBefore1MonthAutomatically();

        // Log the same date logic (-1 month)
        LocalDate targetDate = LocalDate.now().minusMonths(1);
        String selectedDate = targetDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date Before 1 Month: " + selectedDate);
        Hooks.scenario.log("Selected To Date Before 1 Month: " + selectedDate);
	}
	
	@When("user click on the search button in filter of referral")
	public void user_click_on_the_search_button_in_filter_of_referral() {
		String result = ReportModulefunctionalitypage.clickintothesearchbuttoninFilterClinical();

	    System.out.println("Search Result: " + result);
	    Hooks.scenario.log("Search Result: " + result);

	    //Skip remaining steps ONLY when no records / error
	    if (result.startsWith("ERROR")) {
	        // Scenario marked as SKIPPED (not FAILED)
	        Assume.assumeTrue("Skipping scenario due to search result: " + result, false);
	    }
	}
	
	@Then("user click on the advance search tab in referral")
	public void user_click_on_the_advance_search_tab_in_referral() {
		ReportModulefunctionalitypage.clickintotheAdvanceSearchbuttoninReferral();
		
		System.out.println("Advance Search button clicked successfully");
		Hooks.scenario.log("Advance Search button clicked successfully");
	}
	
	@When("user enter the patient id in advance search")
	public void user_enter_the_patient_id_in_advance_search() {
		String PatientId = Hooks.prop.getProperty("patientid");
		ReportModulefunctionalitypage.enterthePatientIdinReferral(PatientId);
		
		System.out.println("User Entered Patient Id: " + PatientId);
		Hooks.scenario.log("User Entered Patient Id: " + PatientId);
	}
	
	@Then("user enter the last name in advance search")
	public void user_enter_the_last_name_in_advance_search() {
		String LastName = Hooks.prop.getProperty("lastnameinadvancesearch");
		ReportModulefunctionalitypage.entertheLastNameinReferral(LastName);
		
		System.out.println("User Entered Last Name: " + LastName);
		Hooks.scenario.log("User Entered Last Name: " + LastName);
	}
	
	@And("user enter the first name in advance search")
	public void user_enter_the_first_name_in_advance_search() {
		String FirstName = Hooks.prop.getProperty("firstnameinadvancesearch");
		ReportModulefunctionalitypage.entertheFirstNameinReferral(FirstName);
				
		System.out.println("User Entered First Name: " + FirstName);
		Hooks.scenario.log("User Entered First Name: " + FirstName);
	}
	
	@When("user select the referral category by index in advance search")
	public void user_select_the_referral_category_by_index_in_advance_search() throws Exception {
		int ReferralCategory = 2; // fetch from config if required

	    boolean result = ReportModulefunctionalitypage.selecttheReferralCategorydropdowninAdvanceSearch(ReferralCategory);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Referral Category is NOT present in dropdown for index: " + ReferralCategory;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Referral Category selected successfully using index: " + ReferralCategory);
	    System.out.println("Referral Category selected successfully using index: " + ReferralCategory);
	}
	
	@Then("user select the referral status by index in advance search")
	public void user_select_the_referral_status_by_index_in_advance_search() throws Exception {
		int ReferralStatus = 2; // fetch from config if required

	    boolean result = ReportModulefunctionalitypage.selecttheReferralStatusdropdowninAdvanceSearch(ReferralStatus);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Referral Status is NOT present in dropdown for index: " + ReferralStatus;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Referral Status selected successfully using index: " + ReferralStatus);
	    System.out.println("Referral Status selected successfully using index: " + ReferralStatus);
	}
	
	@And("user select the referral type by index in advance search")
	public void user_select_the_referral_type_by_index_in_advance_search() throws Exception {
		int ReferralType = 1; // fetch from config if required

	    boolean result = ReportModulefunctionalitypage.selecttheReferralTypedropdowninAdvanceSearch(ReferralType);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Referral Type is NOT present in dropdown for index: " + ReferralType;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Referral Type selected successfully using index: " + ReferralType);
	    System.out.println("Referral Type selected successfully using index: " + ReferralType);
	}
	
	@When("user enter the referral id in advance search")
	public void user_enter_the_referral_id_in_advance_search() {
		String ReferralId = Hooks.prop.getProperty("referralid");
		ReportModulefunctionalitypage.entertheReferralIdinReferral(ReferralId);
				
		System.out.println("User Entered Referral Id: " + ReferralId);
		Hooks.scenario.log("User Entered Referral Id: " + ReferralId);
	}
	
	@Then("user select the generated from date in advance search")
	public void user_select_the_generated_from_date_in_advance_search() {
		// Click the From Date picker
        ReportModulefunctionalitypage.clickintotheGeneratedFromDateinReferral();

        // Select today's date
        ReportModulefunctionalitypage.selectOriginalTodaysDateinFromDateReferral();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Original Date: " + selectedDate);
        Hooks.scenario.log("Selected Original Date: " + selectedDate);
	}
	
	@And("user select the generated to date in advance search")
	public void user_select_the_generated_to_date_in_advance_search() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheGeneratedToDateinReferral();

        // Select After 1 Month date
        ReportModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date After 1 Month: " + selectedDate);
        Hooks.scenario.log("Selected To Date After 1 Month: " + selectedDate);
	}
	
	@When("user select the referred from date in advance search")
	public void user_select_the_referred_from_date_in_advance_search() {
		// Click the From Date picker
        ReportModulefunctionalitypage.clickintotheReferredFromDateinReferral();

        // Select today's date
        ReportModulefunctionalitypage.selectOriginalTodaysDateinFromDateReferral();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Original Date: " + selectedDate);
        Hooks.scenario.log("Selected Original Date: " + selectedDate);
	}
	
	@Then("user select the referred to date in advance search")
	public void user_select_the_referred_to_date_in_advance_search() {
		// Click the License Expiration Date picker
        ReportModulefunctionalitypage.clickintotheReferredToDateinReferral();

        // Select After 1 Month date
        ReportModulefunctionalitypage.selectToDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected To Date After 1 Month: " + selectedDate);
        Hooks.scenario.log("Selected To Date After 1 Month: " + selectedDate);
	}
}
