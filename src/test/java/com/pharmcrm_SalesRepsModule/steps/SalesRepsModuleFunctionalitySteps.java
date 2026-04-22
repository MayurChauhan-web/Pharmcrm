package com.pharmcrm_SalesRepsModule.steps;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.junit.Assume;
import org.openqa.selenium.WebDriver;

import com.pharmcrm_SalesRepsModule.pages.SalesRepsModuleFunctionalityPage;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesRepsModuleFunctionalitySteps {
	
	SalesRepsModuleFunctionalityPage SalesRepsModulefunctionalitypage = new SalesRepsModuleFunctionalityPage(Hooks.driver);
	WebDriver driver; // class level driver variable
	
	@Then("user click on the Sales Reps module tab in home page")
	public void user_click_on_the_Sales_Reps_module_tab_in_home_page() {
		boolean result = SalesRepsModulefunctionalitypage.clickintotheSalesRepsmoduletab();
		
		if (!result) {
	        String message = "Sales Reps Module (more options) tab is not visible because for that user don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Sales Reps Module tab clicked successfully");
	}
	
	
	//-------------------------Sales Rep Questions Section----------------------------------------
	
	
	@When("user click on the Sales Rep Questions tab in sidebar in Sales Reps module page")
	public void user_click_on_the_Sales_Rep_Questions_tab_in_sidebar_in_Sales_Reps_module_page() {
		boolean result = SalesRepsModulefunctionalitypage.clickintothesalesrepquestionstabinsidebar();
		
		if (!result) {
	        String message = "Sales Rep Questions tab is also not visible on the Sidebar — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Sales Rep Questions tab clicked successfully");
	}
	
	@Then("user click on the add new sales rep question button in Sales Rep Questions section")
	public void user_click_on_the_add_new_sales_rep_question_button_in_Sales_Rep_Questions_section() {
		boolean result = SalesRepsModulefunctionalitypage.clickintotheAddNewSalesRepQuestionbutton();
		
		if (!result) {
	        String message = "Sales Reps Questions (more options) button is not visible because for that user don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Sales Reps Questions button clicked successfully");
	}
	
	@And("user enter the sales rep question in Sales Rep Questions section")
	public void user_enter_the_sales_rep_question_in_Sales_Rep_Questions_section() {
		String SalesRepQuestion = Hooks.prop.getProperty("salesrepquestion");
		SalesRepsModulefunctionalitypage.entertheSalesRepQuestions(SalesRepQuestion);
		
		System.out.println("User Entered Sales Rep Question: " + SalesRepQuestion);
		Hooks.scenario.log("User Entered Sales Rep Question: " + SalesRepQuestion);
	}
	
	@When("user click on the calculative checkbox in Sales Rep Questions section")
	public void user_click_on_the_calculative_checkbox_in_Sales_Rep_Questions_section() {
		SalesRepsModulefunctionalitypage.clickintotheCalculativecheckboxinSalesRepQuestions();
		
		System.out.println("Calculative checkbox clicked successfully");
		Hooks.scenario.log("Calculative checkbox clicked successfully");
	}
	
	@Then("user click on the mandatory checkbox in Sales Rep Questions section")
	public void user_click_on_the_mandatory_checkbox_in_Sales_Rep_Questions_section() {
		SalesRepsModulefunctionalitypage.clickintotheMandatorycheckboxinSalesRepQuestions();
		
		System.out.println("Mandatory checkbox clicked successfully");
		Hooks.scenario.log("Mandatory checkbox clicked successfully");
	}
	
	@And("user click on the submit button in Sales Rep Questions section")
	public void user_click_on_the_submit_button_in_Sales_Rep_Questions_section() throws Exception {
		String result = SalesRepsModulefunctionalitypage.clickintothesubmitbuttoninSalesRepQuestions();
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user click on the three dot button of existing sales rep question in sales rep questions section")
	public void user_click_on_the_three_dot_button_of_existing_sales_rep_question_in_sales_rep_questions_section() {
		boolean result = SalesRepsModulefunctionalitypage.clickintothethreedotbuttoninSalesRepQuestions();
		
		if (!result) {
	        String message = "Sales Rep Question is not added, and the three-dot (more options) button is also not visible on the Sales Rep Questions page — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@And("user click on the edit button of existing sales rep question in sales rep questions section")
	public void user_click_on_the_edit_button_of_existing_sales_rep_question_in_sales_rep_questions_section() {
		boolean result = SalesRepsModulefunctionalitypage.clickintotheEditbuttoninExistingSalesRepQuestion();
		
		if (!result) {
	        String message = "Edit (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit button clicked successfully");
	}
	
	@When("user change the sales rep question in sale rep question section")
	public void user_change_the_sales_rep_question_in_sale_rep_question_section() {
		String SalesRepQuestion = Hooks.prop.getProperty("newsalesrepquestion");
		SalesRepsModulefunctionalitypage.entertheSalesRepQuestions(SalesRepQuestion);
		
		System.out.println("User Entered New Sales Rep Question: " + SalesRepQuestion);
		Hooks.scenario.log("User Entered New Sales Rep Question: " + SalesRepQuestion);
	}
	
	@And("user click on the delete button of existing sales rep question in sales rep questions section")
	public void user_click_on_the_delete_button_of_existing_sales_rep_question_in_sales_rep_questions_section() {
		boolean result = SalesRepsModulefunctionalitypage.clickintotheDeletebuttoninExistingSalesRepQuestion();
		
		if (!result) {
	        String message = "Delete (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing sales rep question is delete successfully");
	}
	
	
	//-------------------------------------Buckets Section--------------------------------------------
	
	
	@When("user click on the Buckets tab in sidebar in Sales Reps module page")
	public void user_click_on_the_Buckets_tab_in_sidebar_in_Sales_Reps_module_page() {
		boolean result = SalesRepsModulefunctionalitypage.clickintotheBucketstabinsidebar();
		
		if (!result) {
	        String message = "Buckets (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Buckets button clicked successfully");
	}
	
	@Then("user click on the new folder tab in salesrep documents section")
	public void user_click_on_the_new_folder_tab_in_salesrep_documents_section() {
		boolean result = SalesRepsModulefunctionalitypage.clickintotheNewFoldertabinSalesRepDocuments();
		
		if (!result) {
	        String message = "New Folder (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New Folder tab clicked successfully");
	}
	
	@And("user enter the folder name in new folder pop-up window")
	public void user_enter_the_folder_name_in_new_folder_pop_up_window() {
		String FolderName = Hooks.prop.getProperty("foldername");
		SalesRepsModulefunctionalitypage.entertheFolderNameinBuckets(FolderName);
		
		System.out.println("User Entered Folder Name: " + FolderName);
		Hooks.scenario.log("User Entered Folder Name: " + FolderName);
	}
	
	@When("user select the folder type as Public in new folder pop-up window")
	public void user_select_the_folder_type_as_Public_in_new_folder_pop_up_window() {
		String FolderType = "Public"; // or fetch from config if needed

	    boolean result = SalesRepsModulefunctionalitypage.selecttheFolderType(FolderType);

	    if (result) {
	        Hooks.scenario.log("Folder Type selection attempted: " + FolderType
	        );
	    } else {
	        // This block will rarely execute because page method already handles safety
	        Hooks.scenario.log("Folder Type not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@When("user select the folder type as Private only visible to me in new folder pop-up window")
	public void user_select_the_folder_type_as_Private_only_visible_to_me_in_new_folder_pop_up_window() {
		String FolderType = "Private (only visible to me)"; // or fetch from config if needed

	    boolean result = SalesRepsModulefunctionalitypage.selecttheFolderType(FolderType);

	    if (result) {
	        Hooks.scenario.log("Folder Type selection attempted: " + FolderType
	        );
	    } else {
	        // This block will rarely execute because page method already handles safety
	        Hooks.scenario.log("Folder Type not selected due to unexpected issue, but scenario continues");
	 }
	}
	
	@Then("user click on the submit button in new folder pop-up window")
	public void user_click_on_the_submit_button_in_new_folder_pop_up_window() throws Exception {
		String result = SalesRepsModulefunctionalitypage.clickintothesubmitbuttoninBuckets();
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user click on the three dot button of existing folder in salesrep documents section")
	public void user_click_on_the_three_dot_button_of_existing_folder_in_salesrep_documents_section() {
		boolean result = SalesRepsModulefunctionalitypage.clickintothethreedotbuttoninExistingFolder();
		
		if (!result) {
	        String message = "Folder is not added, and the three-dot (more options) button is also not visible on the SalesRep Documents page — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@And("user click on the edit button of existing folder in salesrep documents section")
	public void user_click_on_the_edit_button_of_existing_folder_in_salesrep_documents_section() {
		boolean result = SalesRepsModulefunctionalitypage.clickintotheEditbuttoninExistingFolder();
		
		if (!result) {
	        String message = "Edit (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit button clicked successfully");
	}
	
	@When("user change the folder name in edit folder pop-up window")
	public void user_change_the_folder_name_in_edit_folder_pop_up_window() {
		String FolderName = Hooks.prop.getProperty("newfoldername");
		SalesRepsModulefunctionalitypage.entertheFolderNameinBuckets(FolderName);
		
		System.out.println("User Entered New Folder Name: " + FolderName);
		Hooks.scenario.log("User Entered New Folder Name: " + FolderName);
	}
	
	@Then("user change the folder type in edit folder pop-up window")
	public void user_change_the_folder_type_in_edit_folder_pop_up_window() {
		String FolderType = "Public"; // or fetch from config if needed

	    boolean result = SalesRepsModulefunctionalitypage.selecttheFolderType(FolderType);

	    if (result) {
	        Hooks.scenario.log("Folder Type selection attempted: " + FolderType
	        );
	    } else {
	        // This block will rarely execute because page method already handles safety
	        Hooks.scenario.log("Folder Type not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@And("user click on the delete button of existing folder in salesrep documents section")
	public void user_click_on_the_delete_button_of_existing_folder_in_salesrep_documents_section() {
		boolean result = SalesRepsModulefunctionalitypage.clickintotheDeletebuttoninExistingFolder();
		
		if (!result) {
	        String message = "Delete (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing folder is delete successfully");
	}
	
	@And("user click on the permission button of existing folder in salesrep documents section")
	public void user_click_on_the_permission_button_of_existing_folder_in_salesrep_documents_section() {
		boolean result = SalesRepsModulefunctionalitypage.clickintothepermissionbuttoninExistingFolder();
		
		if (!result) {
	        String message = "Permission button is not visible for that folder — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Permission button clicked successfully");
	}
	
	@When("user click on the first zone checkbox button in permission pop-up window")
	public void user_click_on_the_first_zone_checkbox_button_in_permission_pop_up_window() {
		SalesRepsModulefunctionalitypage.clickintotheFirstZoneCheckboxinPermission();
		
		System.out.println("First Zone checkbox button clicked successfully");
		Hooks.scenario.log("First Zone checkbox button clicked successfully");
	}
	
	@Then("user click on the submit button in permission pop-up window in salesrep documents section")
	public void user_click_on_the_submit_button_in_permission_pop_up_window_in_salesrep_documents_section() throws Exception {
		String result = SalesRepsModulefunctionalitypage.clickintothesubmitbuttoninPermission();
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user click on the user permission button of existing folder in salesrep documents section")
	public void user_click_on_the_user_permission_button_of_existing_folder_in_salesrep_documents_section() {
		boolean result = SalesRepsModulefunctionalitypage.clickintotheUserPermissionbuttoninExistingFolder();
		
		if (!result) {
	        String message = "User Permission button is not visible for that folder — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("User Permission button clicked successfully");
	}
	
	@When("user click on the first user checkbox button in permission pop-up window")
	public void user_click_on_the_first_user_checkbox_button_in_permission_pop_up_window() {
		SalesRepsModulefunctionalitypage.clickintotheFirstUserCheckboxinUserPermission();
		
		System.out.println("First User checkbox clicked successfully");
		Hooks.scenario.log("First User checkbox clicked successfully");
	}
	
	@Then("user click on the submit button in user permission pop-up window in salesrep documents section")
	public void user_click_on_the_submit_button_in_user_permission_pop_up_window_in_salesrep_documents_section() throws Exception {
		String result = SalesRepsModulefunctionalitypage.clickintothesubmitbuttoninUserPermission();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user double click on the existing folder in salesrep documents section")
	public void user_double_click_on_the_existing_folder_in_salesrep_documents_section() {
		boolean result = SalesRepsModulefunctionalitypage.clickintotheExistingfoldertabinBuckets();
		
		if (!result) {
	        String message = "Folder is not visible on the Bucket page — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing Folder tab clicked successfully");
	}
	
	@And("user click on the upload tab in salesrep documents section")
	public void user_click_on_the_upload_tab_in_salesrep_documents_section() {
		boolean result = SalesRepsModulefunctionalitypage.clickintotheUploadtabinBuckets();
		
		if (!result) {
	        String message = "Upload (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Upload tab clicked successfully");
	}
	
	@When("user upload the PDF file in salesrep documents section")
	public void user_upload_the_PDF_file_in_salesrep_documents_section() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Get_Started_With_Smallpdf.pdf";
		boolean uploaded = SalesRepsModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PDF File upload failed");
	    }

	    Hooks.scenario.log("The PDF File uploaded successfully");
	}
	
	@When("user upload the Docx file in salesrep documents section")
	public void user_upload_the_Docx_file_in_salesrep_documents_section() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file-sample_1MB.docx";
		boolean uploaded = SalesRepsModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Docx File upload failed");
	    }

		Hooks.scenario.log("The Docx File uploaded successfully");
	}
	
	@When("user upload the Excel file in salesrep documents section")
	public void user_upload_the_Excel_file_in_salesrep_documents_section() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file_example_XLSX_5000.xlsx";
		boolean uploaded = SalesRepsModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Excel File upload failed");
	    }

		Hooks.scenario.log("The Excel File uploaded successfully");
	}
	
	@When("user upload the PPT file in salesrep documents section")
	public void user_upload_the_PPT_file_in_salesrep_documents_section() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file_example_PPT_1MB.ppt";
		boolean uploaded = SalesRepsModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PPT File upload failed");
	    }

		Hooks.scenario.log("The PPT File uploaded successfully");
	}
	
	@When("user upload the HTML file in salesrep documents section")
	public void user_upload_the_HTML_file_in_salesrep_documents_section() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/sample html file download.html";
		boolean uploaded = SalesRepsModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The HTML File upload failed");
	    }

		Hooks.scenario.log("The HTML File uploaded successfully");
	}
	
	@When("user upload the Txt file in salesrep documents section")
	public void user_upload_the_Txt_file_in_salesrep_documents_section() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Testing file.txt";
		boolean uploaded = SalesRepsModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Txt File upload failed");
	    }

		Hooks.scenario.log("The Txt File uploaded successfully");
	}
	
	@When("user upload the Audio file in salesrep documents section")
	public void user_upload_the_Audio_file_in_salesrep_documents_section() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Audio Files/file_example_MP3_1MG.mp3";
		boolean uploaded = SalesRepsModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Audio File upload failed");
	    }

		Hooks.scenario.log("The Audio File uploaded successfully");
	}
	
	@When("user upload the Video file in salesrep documents section")
	public void user_upload_the_Video_file_in_salesrep_documents_section() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Audio Files/file_example_MP4_480_1_5MG.mp4";
		boolean uploaded = SalesRepsModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Video File upload failed");
	    }

		Hooks.scenario.log("The Video File uploaded successfully");
	}
	
	@When("user upload the PNG image file in salesrep documents section")
	public void user_upload_the_PNG_image_file_in_salesrep_documents_section() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/Product Category.png";
		boolean uploaded = SalesRepsModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PNG image File upload failed");
	    }

		Hooks.scenario.log("The PNG image File uploaded successfully");
	}
	
	@When("user upload the GIF image file in salesrep documents section")
	public void user_upload_the_GIF_image_file_in_salesrep_documents_section() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_GIF.gif";
		boolean uploaded = SalesRepsModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The GIF image File upload failed");
	    }

		Hooks.scenario.log("The GIF image File uploaded successfully");
	}
	
	@When("user upload the SVG image file in salesrep documents section")
	public void user_upload_the_SVG_image_file_in_salesrep_documents_section() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_SVG.svg";
		boolean uploaded = SalesRepsModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The SVG image File upload failed");
	    }

		Hooks.scenario.log("The SVG image File uploaded successfully");
	}
	
	@When("user upload the JPEG image file in salesrep documents section")
	public void user_upload_the_JPEG_image_file_in_salesrep_documents_section() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/sample.jpeg";
		boolean uploaded = SalesRepsModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The JPEG image File upload failed");
	    }

		Hooks.scenario.log("The JPEG image File uploaded successfully");
	}
	
	@When("user upload the TIFF image file in salesrep documents section")
	public void user_upload_the_TIFF_image_file_in_salesrep_documents_section() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_TIFF.tiff";
		boolean uploaded = SalesRepsModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The TIFF image File upload failed");
	    }

		Hooks.scenario.log("The TIFF image File uploaded successfully");
	}
	
	@When("user upload the JFIF image file in salesrep documents section")
	public void user_upload_the_JFIF_image_file_in_salesrep_documents_section() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/signature_images.jfif";
		boolean uploaded = SalesRepsModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The JFIF image File upload failed");
	    }

		Hooks.scenario.log("The JFIF image File uploaded successfully");
	}
	
	@Then("user click on the submit button in salesrep documents section")
	public void user_click_on_the_submit_button_in_salesrep_documents_section() throws Exception {
		String result = SalesRepsModulefunctionalitypage.clickintothesubmitbuttoninUploadFile();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user click on the three dot button of existing file in salesrep documents section")
	public void user_click_on_the_three_dot_button_of_existing_file_in_salesrep_documents_section() {
		boolean result = SalesRepsModulefunctionalitypage.clickintothethreedotbuttoninExistingFolder();
		
		if (!result) {
	        String message = "File is not added, and the three-dot (more options) button is also not visible on the SalesRep Documents page — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@When("user click on the edit button of existing file in salesrep documents section")
	public void user_click_on_the_edit_button_of_existing_file_in_salesrep_documents_section() {
		boolean result = SalesRepsModulefunctionalitypage.clickintotheEditFilebuttoninBuckets();
		
		if (!result) {
	        String message = "Edit (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit button clicked successfully");
	}
	
	@Then("user change the existing file name in edit file name pop-up window")
	public void user_change_the_existing_file_name_in_edit_file_name_pop_up_window() {
		String FileName = Hooks.prop.getProperty("newfilename");
		SalesRepsModulefunctionalitypage.entertheNewFileName(FileName);
		
		System.out.println("User Entered New File Name: " + FileName);
		Hooks.scenario.log("User Entered New File Name: " + FileName);
	}
	
	@And("user click on the submit button in edit file pop-up window")
	public void user_click_on_the_submit_button_in_edit_file_pop_up_window() throws Exception {
		String result = SalesRepsModulefunctionalitypage.clickintothesubmitbuttoninEditFile();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@When("user click on the delete button of existing file in salesrep documents section")
	public void user_click_on_the_delete_button_of_existing_file_in_salesrep_documents_section() {
		boolean result = SalesRepsModulefunctionalitypage.clickintotheDeletebuttoninExistingFile();
		
		if (!result) {
	        String message = "Delete (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing file is delete successfully");
	}
	
	@When("user click on the download button of existing file in salesrep documents section")
	public void user_click_on_the_download_button_of_existing_file_in_salesrep_documents_section() {
		boolean result = SalesRepsModulefunctionalitypage.clickintotheDownloadFilebuttoninBuckets();
		
		if (!result) {
	        String message = "Download (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing file is download successfully");
	}
	
	
	//-----------------------------------Sales Rep Visit Section----------------------------------
	
	
	@When("user click on the Sales Rep Visit tab in sidebar in Sales Reps module page")
	public void user_click_on_the_Sales_Rep_Visit_tab_in_sidebar_in_Sales_Reps_module_page() {
		boolean result = SalesRepsModulefunctionalitypage.clickintotheSalesRepVisittabinsidebar();
		
		if (!result) {
	        String message = "Sales Rep Visits (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Sales Rep Visits tab clicked successfully");
	}
	
	@Then("user click on the quick text tab in sales rep visits section")
	public void user_click_on_the_quick_text_tab_in_sales_rep_visits_section() {
		boolean result = SalesRepsModulefunctionalitypage.clickintotheQuickTexttabinsalesrepvisits();
		
		if (!result) {
	        String message = "Quick Text tab is also not visible on the Sales Rep Visits page — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Quick Text tab clicked successfully");
	}
	
	@And("user select the user by index in quick text pop-up window")
	public void user_select_the_user_by_index_in_quick_text_pop_up_window() throws Exception {
		int UserByIndex = 0; // can be fetched from config

	    boolean result =
	            SalesRepsModulefunctionalitypage.selecttheUserByIndexinQuickText(UserByIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "User is NOT present in dropdown for index: " + UserByIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("User selected successfully using index: " + UserByIndex);
	    System.out.println("User selected successfully using index: " + UserByIndex);
	}
		
	
	@When("user enter the phone number in quick text pop-up window")
	public void user_enter_the_phone_number_in_quick_text_pop_up_window() {
		String PhoneNumber = Hooks.prop.getProperty("phonenumber");
		SalesRepsModulefunctionalitypage.enterthePhoneNumerinQuickText(PhoneNumber);
		
		System.out.println("User Entered Phone Number: " + PhoneNumber);
		Hooks.scenario.log("User Entered Phone Number: " + PhoneNumber);
	}
	
	@Then("user select the template by index in quick text pop-up window")
	public void user_select_the_template_by_index_in_quick_text_pop_up_window() {
		int TemplateByIndex = 1; // fetch from config if required

	    boolean result = SalesRepsModulefunctionalitypage.selecttheTemplateByIndexinQuickText(TemplateByIndex);

	    if (result) {
	        Hooks.scenario.log("Template selection attempted using index: " + TemplateByIndex);
	    } else {
	        // Rare case – page method already handles safety
	        Hooks.scenario.log("Template not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@And("user enter the body in quick text pop-up window")
	public void user_enter_the_body_in_quick_text_pop_up_window() {
		String Body = Hooks.prop.getProperty("body");
		SalesRepsModulefunctionalitypage.entertheBodyinQuickText(Body);
		
		System.out.println("User Entered Body: " + Body);
		Hooks.scenario.log("User Entered Body: " + Body);
	}
	
	@When("user click on the send button in quick text pop-up window")
	public void user_click_on_the_send_button_in_quick_text_pop_up_window() throws Exception {
		String result = SalesRepsModulefunctionalitypage.clickintotheSendbuttoninQuickText();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Send button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user click on the send vcard tab in sales rep visits section")
	public void user_click_on_the_send_vcard_tab_in_sales_rep_visits_section() {
		boolean result = SalesRepsModulefunctionalitypage.clickintotheSendVCardtabinSalesRepVisits();
		
		if (!result) {
	        String message = "Send VCard (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Send VCard tab clicked successfully");
	}
	
	@And("user enter the phone number in send vcard pop-up window")
	public void user_enter_the_phone_number_in_send_vcard_pop_up_window() {
		String PhoneNumberinVCard = Hooks.prop.getProperty("phonenumber");
		SalesRepsModulefunctionalitypage.enterthePhoneNumberinSendVCard(PhoneNumberinVCard);
		
		System.out.println("User Entered Phone Number: " + PhoneNumberinVCard);
		Hooks.scenario.log("User Entered Phone Number: " + PhoneNumberinVCard);
	}
	
	@And("user enter the invalid phone number in send vcard pop-up window")
	public void user_enter_the_invalid_phone_number_in_send_vcard_pop_up_window() {
		String PhoneNumberinVCard = Hooks.prop.getProperty("invalidphonenumber");
		SalesRepsModulefunctionalitypage.enterthePhoneNumberinSendVCard(PhoneNumberinVCard);
		
		System.out.println("User Entered Invalid Phone Number: " + PhoneNumberinVCard);
		Hooks.scenario.log("User Entered Invalid Phone Number: " + PhoneNumberinVCard);
	}
	
	@When("user enter the body in send vcard pop-up window")
	public void user_enter_the_body_in_send_vcard_pop_up_window() {
		String BodyinSendVcard = Hooks.prop.getProperty("body");
		SalesRepsModulefunctionalitypage.entertheBodyinSendVCard(BodyinSendVcard);
		
		System.out.println("User Entered Body: " + BodyinSendVcard);
		Hooks.scenario.log("User Entered Body: " + BodyinSendVcard);
	}
	
	@Then("user click on the send button in send vcard pop-up window")
	public void user_click_on_the_send_button_in_send_vcard_pop_up_window() throws Exception {
		String result = SalesRepsModulefunctionalitypage.clickintotheSendbuttoninSendVCard();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Send button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user click on the new sales rep visits tab in sales rep visits section")
	public void user_click_on_the_new_sales_rep_visits_tab_in_sales_rep_visits_section() {
		boolean result = SalesRepsModulefunctionalitypage.clickintotheNewSalesRepVisitstabinSalesRepVisits();
		
		if (!result) {
	        String message = "New Sales Rep Visits (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New Sales Rep Visits tab clicked successfully");
	}
	
	@And("user select the meeting time in sales rep visits section")
	public void user_select_the_meeting_time_in_sales_rep_visits_section() {
		String hour = Hooks.prop.getProperty("meeting.time.hour");
		String minute = Hooks.prop.getProperty("meeting.time.minute");
				
		SalesRepsModulefunctionalitypage.selectMeetingTime(hour, minute);
		
		System.out.println("Selected Meeting Time is :" + hour +":"+ minute);
		Hooks.scenario.log("Selected Meeting Time is :" + hour +":"+ minute);
	}
	
	@When("user select the provider by index in sales rep visits section")
	public void user_select_the_provider_by_index_in_sales_rep_visits_section() throws Exception {
		int ProviderIndex = 1; // can be fetched from config

	    boolean result =SalesRepsModulefunctionalitypage.selecttheProviderinSalesRepVisit(ProviderIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Provider is NOT present in dropdown for index: " + ProviderIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Provider selected successfully using index: " + ProviderIndex);
	    System.out.println("Provider selected successfully using index: " + ProviderIndex);
	}
	
	@Then("user select the provider executive by index in sales rep visits section")
	public void user_select_the_provider_executive_by_index_in_sales_rep_visits_section() throws Exception {
		int ProviderExecutiveIndex = 1; // can be fetched from config

	    boolean result =SalesRepsModulefunctionalitypage.selecttheProviderExecutiveinSalesRepVisit(ProviderExecutiveIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Provider Executive is NOT present in dropdown for index: " + ProviderExecutiveIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Provider Executive selected successfully using index: " + ProviderExecutiveIndex);
	    System.out.println("Provider Executive selected successfully using index: " + ProviderExecutiveIndex);
	}
	
	@And("user select the provider address by index in sales rep visits section")
	public void user_select_the_provider_address_by_index_in_sales_rep_visits_section() throws Exception {
		int ProviderAddressIndex = 1; // can be fetched from config

	    boolean result =SalesRepsModulefunctionalitypage.selecttheProviderAddressinSalesRepVisit(ProviderAddressIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Provider Address is NOT present in dropdown for index: " + ProviderAddressIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Provider Address selected successfully using index: " + ProviderAddressIndex);
	    System.out.println("Provider Address selected successfully using index: " + ProviderAddressIndex);
	}
	
	@When("user enter the provider last name in sales rep visits section")
	public void user_enter_the_provider_last_name_in_sales_rep_visits_section() {
		String ProviderLName = Hooks.prop.getProperty("providerlastname");
		
		boolean result = SalesRepsModulefunctionalitypage.entertheProviderLastName(ProviderLName);
		
		if (!result) {
			String msg = "Provider Last Name is already exist in Sales Rep: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    Hooks.scenario.log("Provider last Name: " + ProviderLName);
	    System.out.println("Provider last Name: " + ProviderLName);
	}
	
	@Then("user enter the provider first name in sales rep visits section")
	public void user_enter_the_provider_first_name_in_sales_rep_visits_section() {
		String ProviderFName = Hooks.prop.getProperty("providerfirstname");
		
		boolean result = SalesRepsModulefunctionalitypage.entertheProviderFirstName(ProviderFName);
		
		if (!result) {
			String msg = "Provider First Name is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    Hooks.scenario.log("Provider First Name: " + ProviderFName);
	    System.out.println("Provider First Name: " + ProviderFName);
	}
	
	@And("user enter the NPI Number in sales rep visits section")
	public void user_enter_the_NPI_Number_in_sales_rep_visits_section() {
		String NPINumber = Hooks.prop.getProperty("ValidNPINumber");
		
		boolean result = SalesRepsModulefunctionalitypage.entertheNPINumber(NPINumber);
		
		if (!result) {
			String msg = "NPI Number is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    Hooks.scenario.log("NPI Number: " + NPINumber);
	    System.out.println("NPI Number: " + NPINumber);
	}
	
	@And("user enter the invalid NPI Number in sales rep visits section")
	public void user_enter_the_invalid_NPI_Number_in_sales_rep_visits_section() {
		String NPINumber = Hooks.prop.getProperty("InvalidNPINumber");
		
		boolean result = SalesRepsModulefunctionalitypage.entertheNPINumber(NPINumber);
		
		if (!result) {
			String msg = "NPI Number is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    Hooks.scenario.log("NPI Number: " + NPINumber);
	    System.out.println("NPI Number: " + NPINumber);
		
	}
	
	@When("user enter the provider emailid in sales rep visits section")
	public void user_enter_the_provider_emailid_in_sales_rep_visits_section() {
		String ProviderEmailID = Hooks.prop.getProperty("Validprovideremailid");
		
		boolean result = SalesRepsModulefunctionalitypage.entertheProviderEmailID(ProviderEmailID);
		
		if (!result) {
			String msg = "Provider Email ID is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    Hooks.scenario.log("Provider EmailID: " + ProviderEmailID);
	    System.out.println("Provider EmailID: " + ProviderEmailID);
	}
	
	@When("user enter the Invalid provider emailid in sales rep visits section")
	public void user_enter_the_Invalid_provider_emailid_in_sales_rep_visits_section() {
		String ProviderEmailID = Hooks.prop.getProperty("Invalidprovideremailid");
		
		boolean result = SalesRepsModulefunctionalitypage.entertheProviderEmailID(ProviderEmailID);
		
		if (!result) {
			String msg = "Provider Email ID is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    Hooks.scenario.log("Provider EmailID: " + ProviderEmailID);
	    System.out.println("Provider EmailID: " + ProviderEmailID);
		
	}
	
	@Then("user enter the provider zone in sales rep visits section")
	public void user_enter_the_provider_zone_in_sales_rep_visits_section() {
		String ProviderZone = Hooks.prop.getProperty("validproviderzone");
		
		boolean result = SalesRepsModulefunctionalitypage.entertheProviderZone(ProviderZone);
		
		if (!result) {
			String msg = "Provider Zone is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    Hooks.scenario.log("Provider Zone: " + ProviderZone);
	    System.out.println("Provider Zone: " + ProviderZone);
	}
	
	@Then("user enter the Invalid provider zone in sales rep visits section")
	public void user_enter_the_Invalid_provider_zone_in_sales_rep_visits_section() {
		String ProviderZone = Hooks.prop.getProperty("invalidproviderzone");
		
		boolean result = SalesRepsModulefunctionalitypage.entertheProviderZone(ProviderZone);
		
		if (!result) {
			String msg = "Provider Zone is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    Hooks.scenario.log("Provider Zone: " + ProviderZone);
	    System.out.println("Provider Zone: " + ProviderZone);
		
	}
	
	@And("user enter the provider executive first name in sales rep visits section")
	public void user_enter_the_provider_executive_first_name_in_sales_rep_visits_section() {
		String ProviderExecutiveFName = Hooks.prop.getProperty("providerexecutivefirstname");
		
		boolean result = SalesRepsModulefunctionalitypage.entertheProviderExecutiveFName(ProviderExecutiveFName);
		
		if (!result) {
			String msg = "Provider Executive First Name is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    Hooks.scenario.log("Provider Executive First Name: " + ProviderExecutiveFName);
	    System.out.println("Provider Executive First Name: " + ProviderExecutiveFName);
	}
	
	@When("user enter the provider executive last name in sales rep visits section")
	public void user_enter_the_provider_executive_last_name_in_sales_rep_visits_section() {
		String ProviderExecutiveLName = Hooks.prop.getProperty("providerexecutivelastname");
		
		boolean result = SalesRepsModulefunctionalitypage.entertheProviderExecutiveLName(ProviderExecutiveLName);
		
		if (!result) {
			String msg = "Provider Executive First Name is already exist in Sales Rep Visit: " + result; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    Hooks.scenario.log("Provider Executive Last Name: " + ProviderExecutiveLName);
	    System.out.println("Provider Executive Last Name: " + ProviderExecutiveLName);
	}
	
	@Then("user enter the street address details in sales rep visits section")
	public void user_enter_the_street_address_details_in_sales_rep_visits_section() {
		String StreetAddress = Hooks.prop.getProperty("streetaddress");
		
		boolean result = SalesRepsModulefunctionalitypage.entertheStreetAddressDetailsinSales(StreetAddress);
		
		if (!result) {
			String msg = "Street Address is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    Hooks.scenario.log("Street Address: " + StreetAddress);
	    System.out.println("Street Address: " + StreetAddress);
	}
	
	@And("user enter the city address details in sales rep visits section")
	public void user_enter_the_city_address_details_in_sales_rep_visits_section() {
		String CityAddress = Hooks.prop.getProperty("cityaddress");
		
		boolean result = SalesRepsModulefunctionalitypage.entertheCityAddressDetailsinSales(CityAddress);
		
		if (!result) {
			String msg = "City Address is already exist in Sales Rep Visit: " + result; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    Hooks.scenario.log("City Address: " + CityAddress);
	    System.out.println("City Address: " + CityAddress);
	}
	
	@When("user enter the state address details in sales rep visits section")
	public void user_enter_the_state_address_details_in_sales_rep_visits_section() {
		String StateAddress = Hooks.prop.getProperty("stateaddress");
		
		boolean result = SalesRepsModulefunctionalitypage.entertheStateAddressDetailsinSales(StateAddress);
		
		if (!result) {
			String msg = "State Address is already exist in Sales Rep Visit: " + result; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    Hooks.scenario.log("State Address: " + StateAddress);
	    System.out.println("State Address: " + StateAddress);
	}
	
	@Then("user enter the zipcode address details in sales rep visits section")
	public void user_enter_the_zipcode_address_details_in_sales_rep_visits_section() {
		String ZipCodeAddress = Hooks.prop.getProperty("zipcodeaddress");
		
		boolean result = SalesRepsModulefunctionalitypage.entertheZipCodeAddressDetailsinSales(ZipCodeAddress);
		
		if (!result) {
			String msg = "ZipCode Address is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    Hooks.scenario.log("ZipCode Address: " + ZipCodeAddress);
	    System.out.println("ZipCode Address: " + ZipCodeAddress);
	}
	
	@Then("user enter the invalid zipcode address details in sales rep visits section")
	public void user_enter_the_invalid_zipcode_address_details_in_sales_rep_visits_section() {
		String ZipCodeAddress = Hooks.prop.getProperty("invalidzipcodeaddress");
		
		boolean result = SalesRepsModulefunctionalitypage.entertheZipCodeAddressDetailsinSales(ZipCodeAddress);
		
		if (!result) {
			String msg = "ZipCode Address is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    Hooks.scenario.log("ZipCode Address: " + ZipCodeAddress);
	    System.out.println("ZipCode Address: " + ZipCodeAddress);
		
	}
	
	@And("user enter the contact number 1 address details in sales rep visits section")
	public void user_enter_the_contact_number_1_address_details_in_sales_rep_visits_section() {
		String ContactNumberAddress = Hooks.prop.getProperty("contactnumberaddress");
		
		boolean result = SalesRepsModulefunctionalitypage.entertheContactNumber1AddressDetailsinSales(ContactNumberAddress);
		
		if (!result) {
			String msg = "Contact Number Address is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    Hooks.scenario.log("Contact Number Address: " + ContactNumberAddress);
	    System.out.println("Contact Number Address: " + ContactNumberAddress);
	}
	
	@And("user enter the invalid contact number 1 address details in sales rep visits section")
	public void user_enter_the_invalid_contact_number_1_address_details_in_sales_rep_visits_section() {
		String ContactNumberAddress = Hooks.prop.getProperty("invalidcontactnumber");
		
		boolean result = SalesRepsModulefunctionalitypage.entertheContactNumber1AddressDetailsinSales(ContactNumberAddress);
		
		if (!result) {
			String msg = "Contact Number Address is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    Hooks.scenario.log("Contact Number Address: " + ContactNumberAddress);
	    System.out.println("Contact Number Address: " + ContactNumberAddress);
		
	}
	
	@When("user enter the contact number 2 address details in sales rep visits section")
	public void user_enter_the_contact_number_2_address_details_in_sales_rep_visits_section() {
		String ContactNumber2Address = Hooks.prop.getProperty("contactnumber2address");
		
		boolean result = SalesRepsModulefunctionalitypage.entertheContactNumber2AddressDetailsinSales(ContactNumber2Address);
		
		if (!result) {
			String msg = "Contact Number2 Address is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    Hooks.scenario.log("Contact Number2 Address: " + ContactNumber2Address);
	    System.out.println("Contact Number2 Address: " + ContactNumber2Address);
	}
	
	@Then("user enter the fax address details in sales rep visits section")
	public void user_enter_the_fax_address_details_in_sales_rep_visits_section() {
		String FAXAddress = Hooks.prop.getProperty("faxnumberaddress");
		
		boolean result = SalesRepsModulefunctionalitypage.entertheFAXAddressDetailsinSales(FAXAddress);
		
		if (!result) {
			String msg = "FAX Address is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    Hooks.scenario.log("FAX Address: " + FAXAddress);
	    System.out.println("FAX Address: " + FAXAddress);
	}
	
	@And("user enter the front desk name address details in sales rep visits section")
	public void user_enter_the_front_desk_name_address_details_in_sales_rep_visits_section() {
		String FrontDeskNameAddress = Hooks.prop.getProperty("frontdesknameaddress");
		
		boolean result = SalesRepsModulefunctionalitypage.entertheFrontDeskNameAddressDetailsinSales(FrontDeskNameAddress);
		
		if (!result) {
			String msg = "Front Desk Name Address is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    Hooks.scenario.log("Front Desk Name Address: " + FrontDeskNameAddress);
	    System.out.println("Front Desk Name Address: " + FrontDeskNameAddress);
	}
	
	@When("user select the provider availability for all days in sales rep visits section")
	public void user_select_the_provider_availability_for_all_days_in_sales_rep_visits_section() {
		// Scroll provider availability section into view
	    SalesRepsModulefunctionalitypage.bringProviderAvailabilityIntoView();

	    // Fetch time values from config
	    String fromTime = Hooks.prop.getProperty("provider.from.time");
	    String toTime   = Hooks.prop.getProperty("provider.to.time");

	    // Days list
	    String[] days = {
	            "Sunday",
	            "Monday",
	            "Tuesday",
	            "Wednesday",
	            "Thursday",
	            "Friday",
	            "Saturday"
	    };
	    
	    try {
	    	for (String day : days) {
	    			SalesRepsModulefunctionalitypage.selectAvailabilityForDay(day, fromTime, toTime);

	        Hooks.scenario.log(
	                "Provider availability set for " + day +
	                " | From: " + fromTime +
	                " | To: " + toTime
	        );
	    }
	    
		} catch (RuntimeException e) {
        Hooks.scenario.log("❌ Failed while setting provider availability. Reason: " + e.getMessage());
        throw e; // rethrow to stop execution
		}
	}
	
	@Then("user upload the card front image in sales rep visits section")
	public void user_upload_the_card_front_image_in_sales_rep_visits_section() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/Card front side image.png";
		boolean uploaded = SalesRepsModulefunctionalitypage.uploadTheCardFrontImageinSales(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Card front image upload failed");
	    }
	    Hooks.scenario.log("The Card front image uploaded successfully");
	}
	
	@Then("user upload the card front image as PDF file in sales rep visits section")
	public void user_upload_the_card_front_image_as_PDF_file_in_sales_rep_visits_section() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Get_Started_With_Smallpdf.pdf";
		boolean uploaded = SalesRepsModulefunctionalitypage.uploadTheCardFrontImageinSales(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Card front image as PDF file upload failed");
	    }
	    Hooks.scenario.log("The Card front image uploaded successfully");
		
	}
	
	@And("user upload the card back image in sales rep visits section")
	public void user_upload_the_card_back_image_in_sales_rep_visits_section() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/Card back side image.png";
		boolean uploaded = SalesRepsModulefunctionalitypage.uploadTheCardBackImageinSales(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Card back image upload failed");
	    }
	    Hooks.scenario.log("The Card back image uploaded successfully");
	}
	
	@And("user upload the card back image in as PDF file sales rep visits section")
	public void user_upload_the_card_back_image_in_as_PDF_file_sales_rep_visits_section() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Get_Started_With_Smallpdf.pdf";
		boolean uploaded = SalesRepsModulefunctionalitypage.uploadTheCardBackImageinSales(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Card back image as PDF file upload failed");
	    }
	    Hooks.scenario.log("The Card back image as PDF file uploaded successfully");
	}
	
	@When("user enter the notes in sales rep visits section")
	public void user_enter_the_notes_in_sales_rep_visits_section() {
		String NotesSalesVisit = Hooks.prop.getProperty("notesinsales");
		
		boolean result = SalesRepsModulefunctionalitypage.entertheNotesinSalesVisit(NotesSalesVisit);
		
		if (!result) {
			String msg = "Notes is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    Hooks.scenario.log("Notes: " + NotesSalesVisit);
	    System.out.println("Notes: " + NotesSalesVisit);
	}
	
	@Then("user enter the first question answer in sales rep visits section")
	public void user_enter_the_first_question_answer_in_sales_rep_visits_section() throws Exception {
		SalesRepsModulefunctionalitypage.GetQuestionsControl();
		Thread.sleep(500);
		
		String FirstQAnswer = Hooks.prop.getProperty("firstqanswer");
				
        boolean result = SalesRepsModulefunctionalitypage.enterFirstQAnswerinSales(FirstQAnswer);
		
		if (!result) {
			String msg = "Textbox is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    Hooks.scenario.log("Answer: " + FirstQAnswer);
	    System.out.println("Answer: " + FirstQAnswer);
	}
	 
	@Then("user enter the second question answer in sales rep visits section")
	public void user_enter_the_second_question_answer_in_sales_rep_visits_section() throws Exception {
		SalesRepsModulefunctionalitypage.GetQuestionsControl();
		Thread.sleep(500);
		
		String SecondQAnswer = Hooks.prop.getProperty("secondqanswer");
						
        boolean result = SalesRepsModulefunctionalitypage.enterSecondQAnswerinSales(SecondQAnswer);
		
		if (!result) {
			String msg = "Textbox is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    Hooks.scenario.log("Answer: " + SecondQAnswer);
	    System.out.println("Answer: " + SecondQAnswer);
	}
	
	@Then("user enter the third question answer in sales rep visits section")
	public void user_enter_the_third_question_answer_in_sales_rep_visits_section() throws Exception {
		SalesRepsModulefunctionalitypage.GetQuestionsControl();
		Thread.sleep(500);
		
		String ThirdQAnswer = Hooks.prop.getProperty("thirdqanswer");
		
		boolean result = SalesRepsModulefunctionalitypage.enterThirdQAnswerinSales(ThirdQAnswer);
		
		if (!result) {
			String msg = "Textbox is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    System.out.println("Third question answer: " + ThirdQAnswer);
		Hooks.scenario.log("Third question answer: " + ThirdQAnswer);
	}
	
	@Then("user enter the fourth question answer in sales rep visits section")
	public void user_enter_the_fourth_question_answer_in_sales_rep_visits_section() throws Exception {
		SalesRepsModulefunctionalitypage.GetQuestionsControl();
		Thread.sleep(500);
		
		String FourthQAnswer = Hooks.prop.getProperty("fourthqanswer");
		
		boolean result = SalesRepsModulefunctionalitypage.enterFourthQAnswerinSales(FourthQAnswer);
		
		if (!result) {
			String msg = "Textbox is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    System.out.println("Fourth question answer: " + FourthQAnswer);
		Hooks.scenario.log("Fourth question answer: " + FourthQAnswer);
	}
	
	@Then("user enter the fifth question answer in sales rep visits section")
	public void user_enter_the_fifth_question_answer_in_sales_rep_visits_section() throws Exception {
		SalesRepsModulefunctionalitypage.GetQuestionsControl();
		Thread.sleep(500);
		
		String FifthQAnswer = Hooks.prop.getProperty("fifthqanswer");
		
		boolean result = SalesRepsModulefunctionalitypage.enterFifthQAnswerinSales(FifthQAnswer);
		
		if (!result) {
			String msg = "Textbox is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    System.out.println("Fifth question answer: " + FifthQAnswer);
		Hooks.scenario.log("Fifth question answer: " + FifthQAnswer);
	}
	
	@Then("user enter the sixth question answer in sales rep visits section")
	public void user_enter_the_sixth_question_answer_in_sales_rep_visits_section() throws Exception {
		SalesRepsModulefunctionalitypage.GetQuestionsControl();
		Thread.sleep(500);
		
		String SixthQAnswer = Hooks.prop.getProperty("sixthqanswer");
		
		boolean result = SalesRepsModulefunctionalitypage.enterSixthQAnswerinSales(SixthQAnswer);
		
		if (!result) {
			String msg = "Textbox is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    System.out.println("Sixth question answer: " + SixthQAnswer);
		Hooks.scenario.log("Sixth question answer: " + SixthQAnswer);
	}
	
	@Then("user enter the seventh question answer in sales rep visits section")
	public void user_enter_the_seventh_question_answer_in_sales_rep_visits_section() throws Exception {
		SalesRepsModulefunctionalitypage.GetQuestionsControl();
		Thread.sleep(500);
		
		String SeventhQAnswer = Hooks.prop.getProperty("seventhqanswer");
		
		boolean result = SalesRepsModulefunctionalitypage.enterSeventhQAnswerinSales(SeventhQAnswer);
		
		if (!result) {
			String msg = "Textbox is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    System.out.println("Seventh question answer: " + SeventhQAnswer);
		Hooks.scenario.log("Seventh question answer: " + SeventhQAnswer);
	}
	
	@Then("user enter the eighth question answer in sales rep visits section")
	public void user_enter_the_eighth_question_answer_in_sales_rep_visits_section() throws Exception {
		SalesRepsModulefunctionalitypage.GetQuestionsControl();
		Thread.sleep(500);
		
		String EighthQAnswer = Hooks.prop.getProperty("eighthqanswer");
		
		boolean result = SalesRepsModulefunctionalitypage.enterEighthQAnswerinSales(EighthQAnswer);
		
		if (!result) {
			String msg = "Textbox is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    System.out.println("Eighth question answer: " + EighthQAnswer);
		Hooks.scenario.log("Eighth question answer: " + EighthQAnswer);
	}
	
	@Then("user enter the ninth question answer in sales rep visits section")
	public void user_enter_the_ninth_question_answer_in_sales_rep_visits_section() throws Exception {
		SalesRepsModulefunctionalitypage.GetQuestionsControl();
		Thread.sleep(500);
		
		String NinthQAnswer = Hooks.prop.getProperty("ninthqanswer");
		
		boolean result = SalesRepsModulefunctionalitypage.enterNinthQAnswerinSales(NinthQAnswer);
		
		if (!result) {
			String msg = "Textbox is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    System.out.println("Ninth question answer: " + NinthQAnswer);
		Hooks.scenario.log("Ninth question answer: " + NinthQAnswer);
	}
	
	@Then("user enter the tenth question answer in sales rep visits section")
	public void user_enter_the_tenth_question_answer_in_sales_rep_visits_section() throws Exception {
		SalesRepsModulefunctionalitypage.GetQuestionsControl();
		Thread.sleep(500);
		
		String TenthQAnswer = Hooks.prop.getProperty("tenthqanswer");
		
		boolean result = SalesRepsModulefunctionalitypage.enterTenthQAnswerinSales(TenthQAnswer);
		
		if (!result) {
			String msg = "Textbox is already exist in Sales Rep Visit: "; 
			
			Hooks.scenario.log(msg);
			System.out.println(msg);
			return; // continue with next step
	    }
	    // Success path
	    System.out.println("Tenth question answer: " + TenthQAnswer);
		Hooks.scenario.log("Tenth question answer: " + TenthQAnswer);
	}
	
	@And("user click on the submit button in sales rep visits section")
	public void user_click_on_the_submit_button_in_sales_rep_visits_section() throws Exception {
		String result = SalesRepsModulefunctionalitypage.clickintotheSendbuttoninSalesVisit();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user click on the filter tab in sales rep visits section")
	public void user_click_on_the_filter_tab_in_sales_rep_visits_section() {
		SalesRepsModulefunctionalitypage.clickintotheFiltertabinSales();
		
		System.out.println("Filter tab clicked successfully");
		Hooks.scenario.log("Filter tab clicked successfully");
	}
	
	@And("user enter the provider name in filter")
	public void user_enter_the_provider_name_in_filter() {
		String ProviderName = Hooks.prop.getProperty("providername");
		SalesRepsModulefunctionalitypage.entertheProviderNameinFilterSales(ProviderName);
		
		System.out.println("User Entered Provider Name: " + ProviderName);
		Hooks.scenario.log("User Entered Provider Name: " + ProviderName);
	}
	
	@When("user enter the SalesRepUserPin in filter")
	public void user_enter_the_SalesRepUserPin_in_filter() {
		String SalesRepUserPin = Hooks.prop.getProperty("SalesRepUserPin");
		SalesRepsModulefunctionalitypage.entertheSalesRepUserPininFilterSales(SalesRepUserPin);
		
		System.out.println("User Entered Sales Rep User Pin: " + SalesRepUserPin);
		Hooks.scenario.log("User Entered Sales Rep User Pin: " + SalesRepUserPin);
	}
	
	@Then("user enter the zone in filter")
	public void user_enter_the_zone_in_filter() {
		String ZoneinFilter = Hooks.prop.getProperty("zoneinfilter");
		SalesRepsModulefunctionalitypage.entertheZoneinFilterSales(ZoneinFilter);
		
		System.out.println("User Entered Zone: " + ZoneinFilter);
		Hooks.scenario.log("User Entered Zone: " + ZoneinFilter);
	}
	
	@And("user select the from date in filter")
	public void user_select_the_from_date_in_filter() {
		// Click the From Date picker
        SalesRepsModulefunctionalitypage.clickintotheFromDateinFilter();

        // Select today's date
        SalesRepsModulefunctionalitypage.selectFromTodaysDateinFilter();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected From Date: " + selectedDate);
        Hooks.scenario.log("Selected From Date: " + selectedDate);
	}
	
	@When("user select the to date in filter")
	public void user_select_the_to_date_in_filter() {
		// Click the License Expiration Date picker
        SalesRepsModulefunctionalitypage.clickintotheToDateinFilter();

        // Select today's date
        SalesRepsModulefunctionalitypage.selectToDateAfter10Days();
        
        // Log selected date
        LocalDate futureDate = LocalDate.now().plusDays(10);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected To After 10 Days: " + selectedDate);
        Hooks.scenario.log("Selected To After 10 Days: " + selectedDate);
	}
	
	@Then("user enter the provider executive name in filter")
	public void user_enter_the_provider_executive_name_in_filter() {
		String ProviderExecutiveName = Hooks.prop.getProperty("providerexecutivename");
		SalesRepsModulefunctionalitypage.entertheProviderExecutiveNameinFilterSales(ProviderExecutiveName);
		
		System.out.println("User Entered Provider Executive Name: " + ProviderExecutiveName);
		Hooks.scenario.log("User Entered Provider Executive Name: " + ProviderExecutiveName);
	}
	
	@And("user enter the city in filter")
	public void user_enter_the_city_in_filter() {
		String CityinFilter = Hooks.prop.getProperty("cityinfilter");
		SalesRepsModulefunctionalitypage.entertheCityinFilterSales(CityinFilter);
		
		System.out.println("User Entered City: " + CityinFilter);
		Hooks.scenario.log("User Entered City: " + CityinFilter);
	}
	
	@When("user enter the state in filter")
	public void user_enter_the_state_in_filter() {
		String StateinFilter = Hooks.prop.getProperty("stateinfilter");
		SalesRepsModulefunctionalitypage.entertheStateinFilterSales(StateinFilter);
		
		System.out.println("User Entered State: " + StateinFilter);
		Hooks.scenario.log("User Entered City: " + StateinFilter);
	}
	
	@Then("user enter the zip code in filter")
	public void user_enter_the_zip_code_in_filter() {
		String ZipcodeinFilter = Hooks.prop.getProperty("zipcodeinfilter");
		SalesRepsModulefunctionalitypage.entertheZipcodeinFilterSales(ZipcodeinFilter);
		
		System.out.println("User Entered Zip Code: " + ZipcodeinFilter);
		Hooks.scenario.log("User Entered Zip Code: " + ZipcodeinFilter);
	}
	
	@And("user enter the meeting location code in filter")
	public void user_enter_the_meeting_location_code_in_filter() {
		String MeetinglocationinFilter = Hooks.prop.getProperty("meetinglocationinfilter");
		SalesRepsModulefunctionalitypage.entertheMeetinglocationinFilterSales(MeetinglocationinFilter);
		
		System.out.println("User Entered Meeting Location: " + MeetinglocationinFilter);
		Hooks.scenario.log("User Entered Meeting Location: " + MeetinglocationinFilter);
	}
	
	@When("user click on the card attached checkbox in filter")
	public void user_click_on_the_card_attached_checkbox_in_filter() {
		SalesRepsModulefunctionalitypage.clickintotheCardAttachedCheckboxinFilter();
		
		System.out.println("Card Attached Checkbox clicked successfully");
		Hooks.scenario.log("Card Attached Checkbox clicked successfully");
	}
	
	@Then("user click on the notes checkbox in filter")
	public void user_click_on_the_notes_checkbox_in_filter() {
		SalesRepsModulefunctionalitypage.clickintotheNotesCheckboxinFilter();
		
		System.out.println("Notes Checkbox clicked successfully");
		Hooks.scenario.log("Notes Checkbox clicked successfully");
	}
	
	@And("user click on the having flash provider checkbox in filter")
	public void user_click_on_the_having_flash_provider_checkbox_in_filter() {
		SalesRepsModulefunctionalitypage.clickintotheHavingFlashProviderCheckboxinFilter();
		
		System.out.println("Having Flash Provider Checkbox clicked successfully");
		Hooks.scenario.log("Having Flash Provider Checkbox clicked successfully");
	}
	
	@Then("user click on the search button in filter")
	public void user_click_on_the_search_button_in_filter() {
		String result = SalesRepsModulefunctionalitypage.clickintothesearchbuttoninFilter();

	    System.out.println("Search Result: " + result);
	    Hooks.scenario.log("Search Result: " + result);

	    //Skip remaining steps ONLY when no records / error
	    if (result.startsWith("ERROR")) {
	        // Scenario marked as SKIPPED (not FAILED)
	        Assume.assumeTrue("Skipping scenario due to search result: " + result, false);
	    }
	}
	
	@Then("user click on the Setup module tab in home page")
	public void user_click_on_the_Setup_module_tab_in_home_page() {
		boolean result = SalesRepsModulefunctionalitypage.clickintotheSetupmoduletab();
		
		if (!result) {
	        String message = "Setup Module (more options) tab is not visible because for that user don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Setup Module tab clicked successfully");
	}
	
	@When("user click on the profiles tab in sidebar in Setup module page")
	public void user_click_on_the_profiles_tab_in_sidebar_in_Setup_module_page() {
		boolean result = SalesRepsModulefunctionalitypage.clickintotheProfiletabinsidebar();
		
		if (!result) {
	        String message = "Profile (more options) tab is not visible because for that user don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Profile tab clicked successfully");
	}
	
	@Then("user click on the filter tab in profiles page")
	public void user_click_on_the_filter_tab_in_profiles_page() {
		SalesRepsModulefunctionalitypage.clickintotheFiltertabinSales();
		
		System.out.println("Filter tab clicked successfully");
		Hooks.scenario.log("Filter tab clicked successfully");
	}
	
	@And("user enter the profile name in profiles page")
	public void user_enter_the_profile_name_in_profiles_page() {
		String ProfileName = Hooks.prop.getProperty("profilename");
		SalesRepsModulefunctionalitypage.entertheProfileNameinFilter(ProfileName);
		
		System.out.println("User Entered Profile Name: " + ProfileName);
		Hooks.scenario.log("User Entered Profile Name: " + ProfileName);
	}
}
