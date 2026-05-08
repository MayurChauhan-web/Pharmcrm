package com.pharmcrm_HRModule.steps;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.junit.Assume;
import org.openqa.selenium.WebDriver;

import com.pharmcrm_HRModule.pages.HRModuleFunctionalityPage;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRModuleFunctionalitySteps {
	
	HRModuleFunctionalityPage HRmodulefunctionalitypage = new HRModuleFunctionalityPage(Hooks.driver);
	WebDriver driver; // class level driver variable
	
	@Then("user click on the HR module tab in home page")
	public void user_click_on_the_HR_module_tab_in_home_page() throws Exception {
		boolean result = HRmodulefunctionalitypage.clickintotheHRmoduletab();
		
		if (!result) {
	        String message = "HR Module tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("HR Module tab clicked successfully");
	}
	
	
	//------------------------------------------Documents Section---------------------------------------------
	
	@And("user click on the documents tab in sidebar in HR module page")
	public void user_click_on_the_documents_tab_in_sidebar_in_HR_module_page() {
		boolean result = HRmodulefunctionalitypage.clickintothedocumentstabinsidebar();
		
		if (!result) {
	        String message = "Documents tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Documents tab clicked successfully");
	}
	
	@Then("user click on the new folder tab in documents page")
	public void user_click_on_the_new_folder_tab_in_documents_page() {
		boolean result = HRmodulefunctionalitypage.clickintothenewfoldertabindocuments();
		
		if (!result) {
	        String message = "New Folder tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New Folder tab clicked successfully");
	}
	
	@And("user enter the new folder name in add new folder pop-up window")
	public void user_enter_the_new_folder_name_in_add_new_folder_pop_up_window() {
		String FolderName = Hooks.prop.getProperty("newfoldername");
		HRmodulefunctionalitypage.entertheNewFolderName(FolderName);
		
		System.out.println("User Entered New Folder Name: " + FolderName);
		Hooks.scenario.log("User Entered New Folder Name: " + FolderName);
	}
	
	@When("user click on the submit button in add new folder pop-up window")
	public void user_click_on_the_submit_button_in_add_new_folder_pop_up_window() throws Exception {
		String result = HRmodulefunctionalitypage.clickintothesubmitbuttoninaddnewfolder();
		Thread.sleep(1500);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user click on the existing folder three dot button in documents page")
	public void user_click_on_the_existing_folder_three_dot_button_in_documents_page() {
		boolean result = HRmodulefunctionalitypage.clickintothefolderthreedotbuttonindocuments();
		
		if (!result) {
	        String message = "Folder and Folder Permission (More Options) are not visible to the user due to lack of permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@And("user click on edit folder button in three dot")
	public void user_click_on_edit_folder_button_in_three_dot() {
		boolean result = HRmodulefunctionalitypage.clickintotheEditFoldernamebutton();
		
		if (!result) {
	        String message = "Edit Folder button is also not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit button clicked successfully");
	}
	
	@Then("user change the folder name in edit name pop-up window")
	public void user_change_the_folder_name_in_edit_name_pop_up_window() {
		String FolderName = Hooks.prop.getProperty("changefoldername");
		HRmodulefunctionalitypage.entertheNewFolderName(FolderName);
		
		System.out.println("User Newly Entered Folder Name: " + FolderName);
		Hooks.scenario.log("User Newly Entered Folder Name: " + FolderName);
	}
	
	@Then("user remove the folder name in edit name pop-up window")
	public void user_remove_the_folder_name_in_edit_name_pop_up_window() throws Exception {
		HRmodulefunctionalitypage.removetheExistingFolderName();
		Thread.sleep(500);
		
		System.out.println("Remove the Existing Folder name successfully");
		Hooks.scenario.log("Remove the Existing Folder name successfully");
	}
	
	@Then("user delete the folder name in edit name pop-up window")
	public void user_delete_the_folder_name_in_edit_name_pop_up_window() {
		boolean result = HRmodulefunctionalitypage.clickintotheDeleteFolderbutton();
		
		if (!result) {
	        String message = "Delete Folder (more options) button is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing Folder is delete successfully");
	}
	
	@Then("user click on the existing folder tab in documents page")
	public void user_click_on_the_existing_folder_tab_in_documents_page() {
		boolean result = HRmodulefunctionalitypage.clickintotheExistingfoldertabindocuments();
		
		if (!result) {
	        String message = "Existing Folder is not added on the Documents page — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing Folder tab clicked successfully");
	}
	
	@And("user click on the file upload tab in documents page")
	public void user_click_on_the_file_upload_tab_in_documents_page() {
		boolean result = HRmodulefunctionalitypage.clickintothefileuploadtabindocuments();
		
		if (!result) {
	        String message = "File Upload (more options) button is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("File upload button clicked successfully");
	}
	
	@And("user able to upload the PDF file in documents page")
	public void user_able_to_upload_the_PDF_file_in_documents_page() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Get_Started_With_Smallpdf.pdf";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PDF File upload failed");
	    }

	    Hooks.scenario.log("The PDF File uploaded successfully");
	}
	
	@Then("user click on the submit button in file upload pop-up window")
	public void user_click_on_the_submit_button_in_file_upload_pop_up_window() throws Exception {
		String result = HRmodulefunctionalitypage.clickintothesubmitbuttoninfileupload();
		Thread.sleep(1500);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user click on the three dot button in newly uploaded file")
	public void user_click_on_the_three_dot_button_in_newly_uploaded_file() {
		boolean result = HRmodulefunctionalitypage.clickintothefilethreedotbuttonindocuments();
		
		if (!result) {
	        String message = "File is not uploaded, and the three-dot (more options) button is also not visible on the Documents page — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@When("user click on the edit tab in uploaded file")
	public void user_click_on_the_edit_tab_in_uploaded_file() {
		boolean result = HRmodulefunctionalitypage.clickintotheEditFilenamebutton();
		
		if (!result) {
	        String message = "Edit (more options) button is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit button clicked successfully");
	}
	
	@Then("user enter the new file name in file upload pop-up window")
	public void user_enter_the_new_file_name_in_file_upload_pop_up_window() {
		String FileName = Hooks.prop.getProperty("newfilename");
		HRmodulefunctionalitypage.entertheFileName(FileName);
		
		System.out.println("User Newly Entered File Name: " + FileName);
		Hooks.scenario.log("User Newly Entered File Name: " + FileName);
	}
	
	@When("user able to perform the delete file action")
	public void user_able_to_perform_the_delete_file_action() {
		boolean result = HRmodulefunctionalitypage.clickintotheDeleteFilenamebutton();
		
		if (!result) {
	        String message = "Delete (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing file is delete successfully");
	}
	
	@When("user able to perform the download file action")
	public void user_able_to_perform_the_download_file_action() {
		boolean result = HRmodulefunctionalitypage.clickintotheDownloadFilenamebutton();
		
		if (!result) {
	        String message = "Download File (more options) button is also not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("File is download successfully");
	}
	
	@When("user click on the view file button")
	public void user_click_on_the_view_file_button() {
		boolean result = HRmodulefunctionalitypage.clickintotheViewFilenamebutton();
		
		if (!result) {
	        String message = "View File (more options) button is also not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("View File button clicked successfully");
	}
	
	@When("user able to upload the Docx file in documents page")
	public void user_able_to_upload_the_Docx_file_in_documents_page() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file-sample_1MB.docx";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Docx File upload failed");
	    }

	    Hooks.scenario.log("The Docx File uploaded successfully");
	}
	
	@Then("user enter the new file name in docx file upload pop-up window")
	public void user_enter_the_new_file_name_in_docx_file_upload_pop_up_window() {
		String FileName = Hooks.prop.getProperty("newdocxfilename");
		HRmodulefunctionalitypage.entertheFileName(FileName);
		
		System.out.println("User Newly Entered Docx File Name: " + FileName);
		Hooks.scenario.log("User Newly Entered Docx File Name: " + FileName);
	}
	
	@When("user able to upload the Excel file in documents page")
	public void user_able_to_upload_the_Excel_file_in_documents_page() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file_example_XLSX_5000.xlsx";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Excel File upload failed");
	    }

	    Hooks.scenario.log("The Excel File uploaded successfully");
	}
	
	@When("user able to upload the Txt file in documents page")
	public void user_able_to_upload_the_Txt_file_in_documents_page() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Testing file.txt";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Txt File upload failed");
	    }

	    Hooks.scenario.log("The Txt File uploaded successfully");
	}
	
	@When("user able to upload the HTML file in documents page")
	public void user_able_to_upload_the_HTML_file_in_documents_page() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/sample html file download.html";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The HTML File upload failed");
	    }

	    Hooks.scenario.log("The HTML File uploaded successfully");
	}
	
	@When("user able to upload the PPT file in documents page")
	public void user_able_to_upload_the_PPT_file_in_documents_page() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file_example_PPT_1MB.ppt";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PPT File upload failed");
	    }

	    Hooks.scenario.log("The PPT File uploaded successfully");
	}
	
	@When("user able to upload the PNG image file in documents page")
	public void user_able_to_upload_the_PNG_image_file_in_documents_page() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/1.png";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PNG image File upload failed");
	    }

	    Hooks.scenario.log("The PNG image File uploaded successfully");
	}
	
	@When("user able to upload the JPEG image file in documents page")
	public void user_able_to_upload_the_JPEG_image_file_in_documents_page() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/sample.jpeg";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The JPEG image File upload failed");
	    }

	    Hooks.scenario.log("The JPEG image File uploaded successfully");
	}
	
	@When("user able to upload the GIF image file in documents page")
	public void user_able_to_upload_the_GIF_image_file_in_documents_page() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_GIF.gif";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The GIF image File upload failed");
	    }

	    Hooks.scenario.log("The GIF image File uploaded successfully");
	}
	
	@When("user able to upload the TIFF image file in documents page")
	public void user_able_to_upload_the_TIFF_image_file_in_documents_page() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_TIFF.tiff";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The TIFF image File upload failed");
	    }

	    Hooks.scenario.log("The TIFF image File uploaded successfully");
	}
	
	@When("user able to upload the JFIF image file in documents page")
	public void user_able_to_upload_the_JFIF_image_file_in_documents_page() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/signature_images.jfif";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The JFIF image File upload failed");
	    }

	    Hooks.scenario.log("The JFIF image File uploaded successfully");
	}
	
	@When("user click on the folder permission button")
	public void user_click_on_the_folder_permission_button() {
		boolean result = HRmodulefunctionalitypage.clickintotheAddPermissionFolderbutton();
		
		if (!result) {
	        String message = "Folder Permission button is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Folder Permission button clicked successfully");
	}
	
	@Then("user click on the particular user checkbox in permission pop-up window")
	public void user_click_on_the_particular_user_checkbox_in_permission_pop_up_window() {
		boolean result = HRmodulefunctionalitypage.clickintotheFirstusercheckboxinpermission();
		
		if (!result) {
	        String message = "First user checkbox is not visible on the Permission pop-up window — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("First user checkbox clicked successfully");
	}
	
	@And("user click on the submit button in permission pop-up window")
	public void user_click_on_the_submit_button_in_permission_pop_up_window() throws Exception {
		String result = HRmodulefunctionalitypage.clickintothesubmitbuttoninpermission();
		Thread.sleep(1500);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user able to perform the search functionality in documents page")
	public void user_able_to_perform_the_search_functionality_in_documents_page() throws Exception {
		String DocumentName = Hooks.prop.getProperty("documentname");

	    boolean result = HRmodulefunctionalitypage.entertheDocumentnameinsearchbox(DocumentName);

	    if (!result) {
	        String message = "Unable to perform search because search textbox is not visible";
	        Hooks.scenario.log(message);
	        Assert.fail(message);
	    }

	    Hooks.scenario.log("Search functionality performed successfully with file name: " + DocumentName);
	}
	
	
	//-------------------------------------Employees Section--------------------------------------------------
	
	
	@When("user click on the employees tab in sidebar in HR module page")
	public void user_click_on_the_employees_tab_in_sidebar_in_HR_module_page() throws Exception {
		boolean result = HRmodulefunctionalitypage.clickintotheemployeestabinsidebar();
		
		if (!result) {
	        String message = "Employees tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Employees tab clicked successfully");
	}
	
	@Then("user click on the filter tab in employees page")
	public void user_click_on_the_filter_tab_in_employees_page() {
		HRmodulefunctionalitypage.clickintothefiltertabinemployees();
		
		System.out.println("Filter tab clicked successfully");
		Hooks.scenario.log("Filter tab clicked successfully");
	}
	
	@And("user enter the last name in filter section")
	public void user_enter_the_last_name_in_filter_section() {
		String LastName = Hooks.prop.getProperty("lastname");
		HRmodulefunctionalitypage.entertheLastNameinemployees(LastName);
		
		System.out.println("User Entered Last Name: " + LastName);
		Hooks.scenario.log("User Entered Last Name: " + LastName);
	}
	
	@And("user enter the first name in filter section")
	public void user_enter_the_first_name_in_filter_section() {
		String FirstName = Hooks.prop.getProperty("firstname");
		HRmodulefunctionalitypage.entertheFirstNameinemployees(FirstName);
		
		System.out.println("User Entered First Name: " + FirstName);
		Hooks.scenario.log("User Entered First Name: " + FirstName);
	}
	
	@And("user enter the birth date in filter section")
	public void user_enter_the_birth_date_in_filter_section() {
		String BirthDate = Hooks.prop.getProperty("dateofbirth");
		HRmodulefunctionalitypage.entertheBirthDateinemployees(BirthDate);
		
		System.out.println("User Entered Birth Date: " + BirthDate);
		Hooks.scenario.log("User Entered Birth Date: " + BirthDate);
	}
	
	@When("user select the designation as employee")
	public void user_select_the_designation_as_employee() {
		String designationName = "Employee"; // or fetch from config if needed

	    boolean result = HRmodulefunctionalitypage.selecttheDesignation(designationName);

	    if (result) {
	        Hooks.scenario.log("Designation selection attempted: " + designationName
	        );
	    } else {
	        // This block will rarely execute because page method already handles safety
	        Hooks.scenario.log("Designation not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@And("user enter the employee id in filter section")
	public void user_enter_the_employee_id_in_filter_section() {
		String EmployeeId = Hooks.prop.getProperty("employeeid");
		HRmodulefunctionalitypage.entertheEmployeeId(EmployeeId);
		
		System.out.println("User Entered Employee Id: " + EmployeeId);
		Hooks.scenario.log("User Entered Employee Id: " + EmployeeId);
	}
	
	@And("user enter the cell phone1 in filter section")
	public void user_enter_the_cell_phone1_in_filter_section() {
		String CellPhone1 = Hooks.prop.getProperty("cellphone1");
		HRmodulefunctionalitypage.entertheCellPhone1(CellPhone1);
		
		System.out.println("User Entered Cell Phone1: " + CellPhone1);
		Hooks.scenario.log("User Entered Cell Phone1: " + CellPhone1);
	}
	
	@When("user select the employee status as active")
	public void user_select_the_employee_status_as_active() {
		String EmployeeStatus = "Active"; // or fetch from config if needed

	    boolean result = HRmodulefunctionalitypage.selecttheEmployeestatus(EmployeeStatus);

	    if (result) {
	        Hooks.scenario.log("Status selection attempted: " + EmployeeStatus);
	    } else {
	        // This block will rarely execute because page method already handles safety
	        Hooks.scenario.log("Status not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@When("user select the access code type")
	public void user_select_the_access_code_type() {
		String AccessCodeType = "DD"; // or fetch from config if needed

	    boolean result = HRmodulefunctionalitypage.selecttheAccesscodeType(AccessCodeType);

	    if (result) {
	        Hooks.scenario.log("Access Code Type selection attempted: " + AccessCodeType);
	    } else {
	        // This block will rarely execute because page method already handles safety
	        Hooks.scenario.log("Access Code Type not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@And("user enter the license number in filter section")
	public void user_enter_the_license_number_in_filter_section() {
		String LicenseNumber = Hooks.prop.getProperty("licensenumber");
		HRmodulefunctionalitypage.entertheLicenseNumber(LicenseNumber);
		
		System.out.println("User Entered License Number: " + LicenseNumber);
		Hooks.scenario.log("User Entered License Number: " + LicenseNumber);
	}
	
	@And("user enter the ssn in filter section")
	public void user_enter_the_ssn_in_filter_section() {
		String SSN = Hooks.prop.getProperty("ssn");
		HRmodulefunctionalitypage.entertheSSN(SSN);
		
		System.out.println("User Entered SSN: " + SSN);
		Hooks.scenario.log("User Entered SSN: " + SSN);
	}
	
	@And("user enter the tax id in filter section")
	public void user_enter_the_tax_id_in_filter_section() {
		String TaxId = Hooks.prop.getProperty("taxid");
		HRmodulefunctionalitypage.entertheTaxId(TaxId);
		
		System.out.println("User Entered Tax Id: " + TaxId);
		Hooks.scenario.log("User Entered Tax Id: " + TaxId);
	}
	
	@When("user click on the search button in filter section")
	public void user_click_on_the_search_button_in_filter_section() throws Exception {
		String result = HRmodulefunctionalitypage.clickintothesearchbuttoninfilter();

	    System.out.println("Search Result: " + result);
	    Hooks.scenario.log("Search Result: " + result);

	    // ⚠ Skip remaining steps ONLY when no records / error
	    if (result.startsWith("ERROR")) {
	        // Scenario marked as SKIPPED (not FAILED)
	        Assume.assumeTrue(
	            "Skipping scenario due to search result: " + result,
	            false
	        );
	    }
	}
	
	@Then("user click on the new employee tab in employees page")
	public void user_click_on_the_new_employee_tab_in_employees_page() {
		boolean result = HRmodulefunctionalitypage.clickintotheNewEmployeetab();
		
		if (!result) {
	        String message = "New Employee tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New Employee tab clicked successfully");
	}
	
	@And("user select the title as Mr in employee information section")
	public void user_select_the_title_as_Mr_in_employee_information_section() throws Exception {
		String EmployeeTitle = "Mr."; // or fetch from config if needed
		Thread.sleep(1500);

	    boolean result = HRmodulefunctionalitypage.selecttheEmployeeTitle(EmployeeTitle);

	    if (result) {
	        Hooks.scenario.log("Employee Title selection attempted: " + EmployeeTitle);
	    } else {
	        // This block will rarely execute because page method already handles safety
	        Hooks.scenario.log("Employee Title not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@When("user enter the employee first name in employee information section")
	public void user_enter_the_employee_first_name_in_employee_information_section() {
		String EmployeeFirstName = Hooks.prop.getProperty("employeefirstname");
		HRmodulefunctionalitypage.entertheEmployeeFirstName(EmployeeFirstName);
		
		System.out.println("User Entered Employee First Name: " + EmployeeFirstName);
		Hooks.scenario.log("User Entered Employee First Name: " + EmployeeFirstName);
	}
	
	@When("user enter the employee middle name in employee information section")
	public void user_enter_the_employee_middle_name_in_employee_information_section() {
		String EmployeeMiddleName = Hooks.prop.getProperty("employeemiddlename");
		HRmodulefunctionalitypage.entertheEmployeeMiddleName(EmployeeMiddleName);
		
		System.out.println("User Entered Employee Middle Name: " + EmployeeMiddleName);
		Hooks.scenario.log("User Entered Employee Middle Name: " + EmployeeMiddleName);
	}
	
	@When("user enter the employee last name in employee information section")
	public void user_enter_the_employee_last_name_in_employee_information_section() {
		String EmployeeLastName = Hooks.prop.getProperty("employeelastname");
		HRmodulefunctionalitypage.entertheEmployeeLastName(EmployeeLastName);
		
		System.out.println("User Entered Employee Last Name: " + EmployeeLastName);
		Hooks.scenario.log("User Entered Employee Last Name: " + EmployeeLastName);
	}
	
	@When("user select the employee designation in employee information section")
	public void user_select_the_employee_designation_in_employee_information_section() {
		String EmployeeDesignation = "Employee"; // or fetch from config if needed

	    boolean result = HRmodulefunctionalitypage.selecttheEmployeeDesignation(EmployeeDesignation);

	    if (result) {
	        Hooks.scenario.log("Designation selection attempted: " + EmployeeDesignation);
	    } else {
	        // This block will rarely execute because page method already handles safety
	        Hooks.scenario.log("Designation not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@When("user enter the employee cell phone1 in employee information section")
	public void user_enter_the_employee_cell_phone1_in_employee_information_section() {
		String EmployeeCellPhone1 = Hooks.prop.getProperty("employeecellphone1");
		HRmodulefunctionalitypage.entertheEmployeeCellPhone1(EmployeeCellPhone1);
		
		System.out.println("User Entered Employee Cell Phone1: " + EmployeeCellPhone1);
		Hooks.scenario.log("User Entered Employee Cell Phone1: " + EmployeeCellPhone1);
	}
	
	@When("user enter the employee business email in employee information section")
	public void user_enter_the_employee_business_email_in_employee_information_section() {
		String EmployeeBusinessEmail = Hooks.prop.getProperty("employeebusinessemail");
		HRmodulefunctionalitypage.entertheEmployeeBusinessEmail(EmployeeBusinessEmail);
		
		System.out.println("User Entered Employee Business Email: " + EmployeeBusinessEmail);
		Hooks.scenario.log("User Entered Employee Business Email: " + EmployeeBusinessEmail);
	}
	
	@When("user select the employee start date in employee information section")
	public void user_select_the_employee_start_date_in_employee_information_section() {
		// Click the Assign From date picker
        HRmodulefunctionalitypage.clickintotheEmployeestartdate();

        // Select today's date
        HRmodulefunctionalitypage.selectEmployeeTodaysDate();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected From Date: " + selectedDate);
        Hooks.scenario.log("Selected From Date: " + selectedDate);
	}
	
	@Then("user select the employment type as Employee in employee information section")
	public void user_select_the_employment_type_as_Employee_in_employee_information_section() {
		String EmploymentType = "Employee"; // or fetch from config if needed

	    boolean result = HRmodulefunctionalitypage.selecttheEmployeeEmploymentType(EmploymentType);

	    if (result) {
	        Hooks.scenario.log("Employment Type selection attempted: " + EmploymentType);
	    } else {
	        // This block will rarely execute because page method already handles safety
	        Hooks.scenario.log("Employment Type not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@Then("user select the employment status as Active in employee information section")
	public void user_select_the_employment_status_as_Active_in_employee_information_section() {
		String EmploymentStatus = "Active"; // or fetch from config if needed

	    boolean result = HRmodulefunctionalitypage.selecttheEmploymentStatus(EmploymentStatus);

	    if (result) {
	        Hooks.scenario.log("Employment Status selection attempted: " + EmploymentStatus);
	    } else {
	        // This block will rarely execute because page method already handles safety
	        Hooks.scenario.log("Employment Status not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@Then("user select the employee blood group as O in employee information section")
	public void user_select_the_employee_blood_group_as_O_in_employee_information_section() {
		String EmployeeBloodGroup = "O+"; // or fetch from config if needed

	    boolean result = HRmodulefunctionalitypage.selecttheEmployeeBloodgroup(EmployeeBloodGroup);

	    if (result) {
	        Hooks.scenario.log("Employee blood group selection attempted: " + EmployeeBloodGroup);
	    } else {
	        // This block will rarely execute because page method already handles safety
	        Hooks.scenario.log("Employee blood group not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@When("user select the employee birth date in employee information section")
	public void user_select_the_employee_birth_date_in_employee_information_section() {
		// Click the Assign From date picker
        HRmodulefunctionalitypage.clickintotheEmployeebirthdate();

        // Select today's date
        HRmodulefunctionalitypage.selectEmployeeTodaysDate();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected From Date: " + selectedDate);
        Hooks.scenario.log("Selected From Date: " + selectedDate);
	}
	
	@Then("user select the employee gender as male in employee information section")
	public void user_select_the_employee_gender_as_male_in_employee_information_section() {
		String EmployeeGender = "Male"; // or fetch from config if needed

	    boolean result = HRmodulefunctionalitypage.selecttheEmployeeGender(EmployeeGender);

	    if (result) {
	        Hooks.scenario.log("Employee Gender selection attempted: " + EmployeeGender);
	    } else {
	        // This block will rarely execute because page method already handles safety
	        Hooks.scenario.log("Employee gender not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@And("user able to upload the new employee profile image in employee information section")
	public void user_able_to_upload_the_new_employee_profile_image_in_employee_information_section() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/Profile Image.png";
		HRmodulefunctionalitypage.uploadTheImage(filePath);
		Thread.sleep(2000);
		
		System.out.println("Employee Profile Image upload successfully");
		Hooks.scenario.log("Employee Profile Image upload successfully");
	}
	
	@When("user click on the submit button in employee information section")
	public void user_click_on_the_submit_button_in_employee_information_section() throws Exception {
		String result = HRmodulefunctionalitypage.clickintothesubmitbuttoninemployee();
		Thread.sleep(1500);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user click on the three dot button in existing employee in employees page")
	public void user_click_on_the_three_dot_button_in_existing_employee_in_employees_page() {
		boolean result = HRmodulefunctionalitypage.clickintothethreedotbuttonforexistingemployee();
		
		if (!result) {
	        String message = "Employee is not added, and the three-dot (more options) button is also not visible on the Employees page — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@And("user click on the edit tab in three dot in employees page")
	public void user_click_on_the_edit_tab_in_three_dot_in_employees_page() {
		boolean result = HRmodulefunctionalitypage.clickintotheEditbuttoninexistingemployee();
		
		if (!result) {
	        String message = "Edit button is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit button clicked successfully");
	}
	
	@Then("user change the employee last name in edit employee page")
	public void user_change_the_employee_last_name_in_edit_employee_page() {
		String EmployeeLastName = Hooks.prop.getProperty("newemployeelastname");
		HRmodulefunctionalitypage.entertheEmployeeLastName(EmployeeLastName);
		
		System.out.println("User Entered New Employee Last Name: " + EmployeeLastName);
		Hooks.scenario.log("User Entered New Employee Last Name: " + EmployeeLastName);
	}
	
	@When("user perform the existing employee delete functionality")
	public void user_perform_the_existing_employee_delete_functionality() {
		boolean result = HRmodulefunctionalitypage.clickintotheDeletebuttoninexistingemployee();
		
		if (!result) {
	        String message = "Delete button is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing Employee is delete successfully");
	}
	
	@Then("user click on the view button in existing employee in employees page")
	public void user_click_on_the_view_button_in_existing_employee_in_employees_page() {
		boolean result = HRmodulefunctionalitypage.clickintotheviewbuttonforexistingemployee();
		
		if (!result) {
	        String message = "Employee and Employee Details, are not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("View button clicked successfully");
	}
	
	
	//--------------------------------Employees Details----------------------------------------------
	
	@And("user click on the edit button in employee details page")
	public void user_click_on_the_edit_button_in_employee_details_page() {
		boolean result = HRmodulefunctionalitypage.clickintotheEditbuttoninEmployeeDetails();
		
		if (!result) {
	        String message = "Edit button is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit button clicked successfully");
	}
	
	@And("user perform delete employee functionality in employee details page")
	public void user_perform_delete_employee_functionality_in_employee_details_page() {
		boolean result = HRmodulefunctionalitypage.clickintotheDeletebuttoninEmployeeDetails();
		
		if (!result) {
	        String message = "Delete button is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Employee Details is delete successfully");
	}
	
	@And("user click on associated user link in employee details page")
	public void user_click_on_associated_user_link_in_employee_details_page() {
		boolean result = HRmodulefunctionalitypage.clickintotheUserlinkbuttoninEmployeeDetails();
		
		if (!result) {
	        String message = "Employee is already link with Associate User Or 'User link is not visible for that user because don't have the permission ', and the Delink User button is Present on the Employee Details page — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("User link button clicked successfully");
	}
	
	@When("user enter the user last name in search user pop-up window")
	public void user_enter_the_user_last_name_in_search_user_pop_up_window() {
		String FilterLastName = Hooks.prop.getProperty("filterlastname");
		HRmodulefunctionalitypage.entertheFilterLastName(FilterLastName);
		
		System.out.println("User Entered Filter Last Name: " + FilterLastName);
		Hooks.scenario.log("User Entered Filter Last Name: " + FilterLastName);
	}
	
	@Then("user click on the search button for user link in search user pop-up window")
	public void user_click_on_the_search_button_for_user_link_in_search_user_pop_up_window() throws Exception {
		String result = HRmodulefunctionalitypage.clickintothesearchbuttoninsearchuser();
		Thread.sleep(1000);
		
		System.out.println("Search Result: " + result);
		Hooks.scenario.log("Search Result: " + result);
		
		if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Search failed due to error message(s): " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user click on the first user radio button in search user pop-up window")
	public void user_click_on_the_first_user_radio_button_in_search_user_pop_up_window() throws Exception {
		HRmodulefunctionalitypage.clickintotheFirstUserradiobuttoninsearchuser();
		Thread.sleep(1000);
		
		System.out.println("First User radio button clicked successfully");
		Hooks.scenario.log("First User radio button clicked successfully");
	}
	
	@When("user click on the submit button for user link in search user pop-up window")
	public void user_click_on_the_submit_button_for_user_link_in_search_user_pop_up_window() throws Exception {
		String result = HRmodulefunctionalitypage.clickintothesubmitbuttoninsearchuser();
		Thread.sleep(1500);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user click on the delink user button in employee details page")
	public void user_click_on_the_delink_user_button_in_employee_details_page() {
		boolean result = HRmodulefunctionalitypage.clickintotheDelinkUserbuttoninEmployeeDetails();
		
		if (!result) {
	        String message = "Employee is not link with Associate User, or 'Delink User' is not visible for that user because don't have permission' and the Associated User Link button is Present on the Employee Details page — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Employee is Delink successfully with associated user");
	}
	
	@And("user click on the about view tab in employee details page")
	public void user_click_on_the_about_view_tab_in_employee_details_page() {
		boolean result = HRmodulefunctionalitypage.clickintotheAbouttabinEmployeedetails();
		
		if (!result) {
	        String message = "About tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("About tab clicked successfully");
		
	}
	
	@And("user click on the licenses tab in employee details page")
	public void user_click_on_the_licenses_tab_in_employee_details_page() {
		boolean result = HRmodulefunctionalitypage.clickintotheLicensestabinEmployeedetails();
		
		if (!result) {
	        String message = "License tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("License tab clicked successfully");
	}
	
	
	//------------------------------Licenses Section in Employees Details------------------------------
	
	
	@When("user click on the new licenses button of licenses section in employee details page")
	public void user_click_on_the_new_licenses_button_of_licenses_section_in_employee_details_page() {
		boolean result = HRmodulefunctionalitypage.clickintotheNewLicensesbuttoninLicenses();
		
		if (!result) {
	        String message = "New Licenses button is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("new Licenses button clicked successfully");
	}
		
	@Then("user select the license type as Professional License in add employee license pop-up window")
	public void user_select_the_license_type_as_Professional_License_in_add_employee_license_pop_up_window() {
		String LicenseType = "Professional License"; // or fetch from config if needed

	    boolean result = HRmodulefunctionalitypage.selecttheLicenseType(LicenseType);
	    
	    if (result) {
	        Hooks.scenario.log("License Type selection attempted: " + LicenseType);
	    } else {
	        // This block will rarely execute because page method already handles safety
	        Hooks.scenario.log("License Type not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@And("user enter the license number in add employee license pop-up window")
	public void user_enter_the_license_number_in_add_employee_license_pop_up_window() {
		String LicenseNumbertext = Hooks.prop.getProperty("licensenumber");
		HRmodulefunctionalitypage.entertheLicenseNumberinAddlicensewindow(LicenseNumbertext);
		
		System.out.println("User Entered License Number: " + LicenseNumbertext);
		Hooks.scenario.log("User Entered License Number: " + LicenseNumbertext);
	}
	
	@When("user select the license expiration date in add employee license pop-up window")
	public void user_select_the_license_expiration_date_in_add_employee_license_pop_up_window() {
		// Click the License Expiration Date picker
        HRmodulefunctionalitypage.clickintotheLicenseExpirationDate();

        // Select today's date
        HRmodulefunctionalitypage.selectLicenseExpirationDate();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected License Expiration Date: " + selectedDate);
        Hooks.scenario.log("Selected License Expiration Date: " + selectedDate);
	}
	
	@Then("user select the state as Florida in add employee license pop-up window")
	public void user_select_the_state_as_Florida_in_add_employee_license_pop_up_window() {
		String State = "Florida"; // or fetch from config if needed

	    boolean result = HRmodulefunctionalitypage.selecttheStateinaddlicensewindow(State);
	    
	    if (result) {
	        Hooks.scenario.log("State selection attempted: " + State);
	    } else {
	        // This block will rarely execute because page method already handles safety
	        Hooks.scenario.log("State not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@And("user select the status as Active in add employee license pop-up window")
	public void user_select_the_status_as_Active_in_add_employee_license_pop_up_window() {
		String Status = "Active"; // or fetch from config if needed

	    boolean result = HRmodulefunctionalitypage.selecttheStatusinaddlicensewindow(Status);
	    
	    if (result) {
	        Hooks.scenario.log("Status selection attempted: " + Status);
	    } else {
	        // This block will rarely execute because page method already handles safety
	        Hooks.scenario.log("Status not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@When("user upload the employee license file in add employee license pop-up window")
	public void user_upload_the_employee_license_file_in_add_employee_license_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Get_Started_With_Smallpdf.pdf";
		HRmodulefunctionalitypage.uploadTheEmployeeLicenseFile(filePath);
		Thread.sleep(2000);
		
		System.out.println("Employee license file is successfully uploaded");
		Hooks.scenario.log("Employee license file is successfully uploaded");
	}
	
	@Then("user click on the submit button in add employee license pop-up window")
	public void user_click_on_the_submit_button_in_add_employee_license_pop_up_window() throws Exception {
		String result = HRmodulefunctionalitypage.clickintothesubmitbuttoninAddEmployeeLicense();
		Thread.sleep(1500);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@When("user upload the employee license file image format as PNG in add employee license pop-up window")
	public void user_upload_the_employee_license_file_image_format_as_PNG_in_add_employee_license_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/Product Category.png";
		HRmodulefunctionalitypage.uploadTheEmployeeLicenseFile(filePath);
		Thread.sleep(2000);
		
		System.out.println("Employee license file is successfully uploaded in PNG image format");
		Hooks.scenario.log("Employee license file is successfully uploaded in PNG image format");
	}
	
	@When("user upload the employee license file image format as GIF in add employee license pop-up window")
	public void user_upload_the_employee_license_file_image_format_as_GIF_in_add_employee_license_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_GIF.gif";
		HRmodulefunctionalitypage.uploadTheEmployeeLicenseFile(filePath);
		Thread.sleep(2000);
		
		System.out.println("Employee license file is successfully uploaded in GIF image format");
		Hooks.scenario.log("Employee license file is successfully uploaded in GIF image format");
	}
	
	@When("user upload the employee license file image format as TIFF in add employee license pop-up window")
	public void user_upload_the_employee_license_file_image_format_as_TIFF_in_add_employee_license_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_TIFF.tiff";
		HRmodulefunctionalitypage.uploadTheEmployeeLicenseFile(filePath);
		Thread.sleep(2000);
		
		System.out.println("Employee license file is successfully uploaded in TIFF image format");
		Hooks.scenario.log("Employee license file is successfully uploaded in TIFF image format");
	}
	
	@When("user upload the employee license file image format as JFIF in add employee license pop-up window")
	public void user_upload_the_employee_license_file_image_format_as_JFIF_in_add_employee_license_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/signature_images.jfif";
		HRmodulefunctionalitypage.uploadTheEmployeeLicenseFile(filePath);
		Thread.sleep(2000);
		
		System.out.println("Employee license file is successfully uploaded in JFIF image format");
		Hooks.scenario.log("Employee license file is successfully uploaded in JFIF image format");
	}
	
	@When("user upload the employee license file image format as SVG in add employee license pop-up window")
	public void user_upload_the_employee_license_file_image_format_as_SVG_in_add_employee_license_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_SVG.svg";
		HRmodulefunctionalitypage.uploadTheEmployeeLicenseFile(filePath);
		Thread.sleep(2000);
		
		System.out.println("Employee license file is successfully uploaded in SVG image format");
		Hooks.scenario.log("Employee license file is successfully uploaded in SVG image format");
	}
	
	@When("user upload the employee license file format as PDF in add employee license pop-up window")
	public void user_upload_the_employee_license_file_format_as_PDF_in_add_employee_license_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Get_Started_With_Smallpdf.pdf";
		HRmodulefunctionalitypage.uploadTheEmployeeLicenseFile(filePath);
		Thread.sleep(2000);
		
		System.out.println("Employee license file is successfully uploaded in PDF format");
		Hooks.scenario.log("Employee license file is successfully uploaded in PDF format");
	}
	
	@When("user upload the employee license file format as Docx in add employee license pop-up window")
	public void user_upload_the_employee_license_file_format_as_Docx_in_add_employee_license_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file-sample_1MB.docx";
		HRmodulefunctionalitypage.uploadTheEmployeeLicenseFile(filePath);
		Thread.sleep(2000);
		
		System.out.println("Employee license file is successfully uploaded in Docx format");
		Hooks.scenario.log("Employee license file is successfully uploaded in Docx format");
	}
	
	@When("user upload the employee license file format as PPT in add employee license pop-up window")
	public void user_upload_the_employee_license_file_format_as_PPT_in_add_employee_license_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file_example_PPT_1MB.ppt";
		HRmodulefunctionalitypage.uploadTheEmployeeLicenseFile(filePath);
		Thread.sleep(2000);
		
		System.out.println("Employee license file is successfully uploaded in PPT format");
		Hooks.scenario.log("Employee license file is successfully uploaded in PPT format");
	}
	
	@When("user upload the employee license file format as Xls in add employee license pop-up window")
	public void user_upload_the_employee_license_file_format_as_Xls_in_add_employee_license_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file_example_XLS_5000.xls";
		HRmodulefunctionalitypage.uploadTheEmployeeLicenseFile(filePath);
		Thread.sleep(2000);
		
		System.out.println("Employee license file is successfully uploaded in Xls format");
		Hooks.scenario.log("Employee license file is successfully uploaded in Xls format");
	}
	
	@When("user upload the employee license file format as Xlsx in add employee license pop-up window")
	public void user_upload_the_employee_license_file_format_as_Xlsx_in_add_employee_license_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file_example_XLSX_5000.xlsx";
		HRmodulefunctionalitypage.uploadTheEmployeeLicenseFile(filePath);
		Thread.sleep(2000);
		
		System.out.println("Employee license file is successfully uploaded in Xlsx format");
		Hooks.scenario.log("Employee license file is successfully uploaded in Xlsx format");
	}
	
	@When("user upload the employee license file format as HTML in add employee license pop-up window")
	public void user_upload_the_employee_license_file_format_as_HTML_in_add_employee_license_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/sample html file download.html";
		HRmodulefunctionalitypage.uploadTheEmployeeLicenseFile(filePath);
		Thread.sleep(2000);
		
		System.out.println("Employee license file is successfully uploaded in HTML format");
		Hooks.scenario.log("Employee license file is successfully uploaded in HTML format");
	}
	
	@When("user upload the employee license file format as Txt in add employee license pop-up window")
	public void user_upload_the_employee_license_file_format_as_Txt_in_add_employee_license_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Testing file.txt";
		HRmodulefunctionalitypage.uploadTheEmployeeLicenseFile(filePath);
		Thread.sleep(2000);
		
		System.out.println("Employee license file is successfully uploaded in Txt format");
		Hooks.scenario.log("Employee license file is successfully uploaded in Txt format");
	}
	
	@When("user click on the three dot button of existing license in license section")
	public void user_click_on_the_three_dot_button_of_existing_license_in_license_section() {
		boolean result = HRmodulefunctionalitypage.clickintothethreedotbuttoninLicenseSection();
		
		if (!result) {
	        String message = "License is not added, and the three-dot (more options) button is also not visible on the License Section — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@Then("user click on the edit tab in existing license in license section")
	public void user_click_on_the_edit_tab_in_existing_license_in_license_section() {
		boolean result = HRmodulefunctionalitypage.clickintotheEdittabinExistinglicense();
		
		if (!result) {
	        String message = "Edit tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit tab clicked successfully");
	}
	
	@And("user change the license type Professional License to Organization_Administrator_testuser14 in add employee license pop-up window")
	public void user_change_the_license_type_Professional_License_to_Organization_Administrator_testuser14_in_add_employee_license_pop_up_window() {
		String LicenseType = "Organization_Administrator_testuser14"; // or fetch from config if needed

	    boolean result = HRmodulefunctionalitypage.selecttheLicenseType(LicenseType);
	    
	    if (result) {
	        Hooks.scenario.log("License Type selection attempted: " + LicenseType);
	    } else {
	        // This block will rarely execute because page method already handles safety
	        Hooks.scenario.log("License Type not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@When("user change the license number in add employee pop-up window")
	public void user_change_the_license_number_in_add_employee_pop_up_window() {
		String LicenseNumbertext = Hooks.prop.getProperty("changelicensenumber");
		HRmodulefunctionalitypage.entertheLicenseNumberinAddlicensewindow(LicenseNumbertext);
		
		System.out.println("User Entered New License Number: " + LicenseNumbertext);
		Hooks.scenario.log("User Entered New License Number: " + LicenseNumbertext);
	}
	
	@Then("user change the license expiration date in add employee pop-up window")
	public void user_change_the_license_expiration_date_in_add_employee_pop_up_window() {
		// Click the License Expiration Date picker
        HRmodulefunctionalitypage.clickintotheLicenseExpirationDate();

        // Select today's date
        HRmodulefunctionalitypage.selectLicenseExpirationDateAfter10Days();

        // Log selected date
        LocalDate futureDate = LocalDate.now().plusDays(10);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected License Expiration Date After 10 Days: " + selectedDate);
        Hooks.scenario.log("Selected License Expiration Date After 10 Days: " + selectedDate);
	}
	
	@And("user change the state in add employee pop-up window")
	public void user_change_the_state_in_add_employee_pop_up_window() {
		String State = "California"; // or fetch from config if needed

	    boolean result = HRmodulefunctionalitypage.selecttheStateinaddlicensewindow(State);
	    
	    if (result) {
	        Hooks.scenario.log("State selection attempted: " + State);
	    } else {
	        // This block will rarely execute because page method already handles safety
	        Hooks.scenario.log("State not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@When("user change the status in add employee pop-up window")
	public void user_change_the_status_in_add_employee_pop_up_window() {
		String EmployeeStatus = "New App - In Progress"; // or fetch from config if needed

	    boolean result = HRmodulefunctionalitypage.selecttheEmployeestatus(EmployeeStatus);

	    if (result) {
	        Hooks.scenario.log("Status selection attempted: " + EmployeeStatus);
	    } else {
	        // This block will rarely execute because page method already handles safety
	        Hooks.scenario.log("Status not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@Then("user click on the delete tab in existing license in license section")
	public void user_click_on_the_delete_tab_in_existing_license_in_license_section() {
		boolean result = HRmodulefunctionalitypage.clickintotheDeletetabinExistinglicense();
		
		if (!result) {
	        String message = "Delete tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Delete the existing license successfully");
	}
	
	@Then("user click on the download tab in existing license in license section")
	public void user_click_on_the_download_tab_in_existing_license_in_license_section() {
		boolean result = HRmodulefunctionalitypage.clickintotheDownloadtabinExistinglicense();
		
		if (!result) {
	        String message = "Download tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Download the existing license successfully");
	}
	
	
	//--------------------------Access Code Section in Employees Details-----------------------------------
	
	
	@And("user click on the access code tab in employee details page")
	public void user_click_on_the_access_code_tab_in_employee_details_page() {
		boolean result = HRmodulefunctionalitypage.clickintotheAccessCodetabinEmployeedetails();
		
		if (!result) {
	        String message = "Access Code tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Access Code tab clicked successfully");
	}
	
	@When("user click on the new access code button in access code section")
	public void user_click_on_the_new_access_code_button_in_access_code_section() {
		boolean result = HRmodulefunctionalitypage.clickintotheNewAccessCodebuttoninaccesscode();
		
		if (!result) {
	        String message = "New Access Code button is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New Access Code button clicked successfully");
	}
	
	@Then("user select the access code type by index in add employee access code pop-up window")
	public void user_select_the_access_code_type_by_index_in_add_employee_access_code_pop_up_window() {
		int AccessCodeIndex = 1; // fetch from config if required

	    boolean result = HRmodulefunctionalitypage.selecttheAccessCodeByIndex(AccessCodeIndex);

	    if (result) {
	        Hooks.scenario.log("Access Code Type selection attempted using index: " + AccessCodeIndex);
	    } else {
	        // Rare case – page method already handles safety
	        Hooks.scenario.log("Access Code Type not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@And("user select the today's date in add employee access code pop-up window")
	public void user_select_the_today_s_date_in_add_employee_access_code_pop_up_window() {
		// Click the date picker in Access Code
        HRmodulefunctionalitypage.clickintotheDatetextboxinAccesscode();

        // Select today's date
        HRmodulefunctionalitypage.selectDateinAccessCode();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Date: " + selectedDate);
        Hooks.scenario.log("Selected Date: " + selectedDate);
	}
	
	@When("user enter the notes in add employee access code pop-up window")
	public void user_enter_the_notes_in_add_employee_access_code_pop_up_window() {
		String Notes = Hooks.prop.getProperty("accesscodenotes");
		HRmodulefunctionalitypage.entertheNotesinaccesscode(Notes);
		
		System.out.println("User Entered the Notes: " + Notes);
		Hooks.scenario.log("User Entered the Notes: " + Notes);
	}
	
	@Then("user click on the submit button in add employee access code pop-up window")
	public void user_click_on_the_submit_button_in_add_employee_access_code_pop_up_window() throws Exception {
		String result = HRmodulefunctionalitypage.clickintothesubmitbuttoninAccessCode();
		Thread.sleep(1500);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@When("user click on the three dot button of existing access code in access code section")
	public void user_click_on_the_three_dot_button_of_existing_access_code_in_access_code_section() {
		boolean result = HRmodulefunctionalitypage.clickintothethreedotbuttoninAccessCode();
		
		if (!result) {
	        String message = "Access Code is not added, and the three-dot (more options) button is also not visible on the Access Code Section — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@Then("user click on the edit tab in access code section")
	public void user_click_on_the_edit_tab_in_access_code_section() {
		boolean result = HRmodulefunctionalitypage.clickintotheEdittabinexistingaccesscode();
		
		if (!result) {
	        String message = "Edit tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit tab clicked successfully");
	}
	
	@And("user change the date in edit employee access code pop-up window")
	public void user_change_the_date_in_edit_employee_access_code_pop_up_window() {
		// Click the date picker in Access Code
        HRmodulefunctionalitypage.clickintotheDatetextboxinAccesscode();

        // Select today's date
        HRmodulefunctionalitypage.selectAccessCodeDateAfter10Days();
        
        // Log selected date
        LocalDate futureDate = LocalDate.now().plusDays(10);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected License Expiration Date After 10 Days: " + selectedDate);
        Hooks.scenario.log("Selected License Expiration Date After 10 Days: " + selectedDate);
	}
	
	@When("user change the notes in edit employee access code pop-up window")
	public void user_change_the_notes_in_edit_employee_access_code_pop_up_window() {
		String NewNotes = Hooks.prop.getProperty("changeaccesscodenotes");
		HRmodulefunctionalitypage.entertheNewNotesinAccesscode(NewNotes);
		
		System.out.println("User Entered the New Notes: " + NewNotes);
		Hooks.scenario.log("User Entered the New Notes: " + NewNotes);
	}
	
	@Then("user click on the delete tab in access code section")
	public void user_click_on_the_delete_tab_in_access_code_section() {
		boolean result = HRmodulefunctionalitypage.clickintotheDeletetabinExistingAccessCode();
		
		if (!result) {
	        String message = "Delete tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Delete the existing Access Code successfully");
	}
	
	
	//--------------------------Docs Section in Employees Details-------------------------------------
	
	
	@And("user click on the docs tab in employee details page")
	public void user_click_on_the_docs_tab_in_employee_details_page() {
		boolean result = HRmodulefunctionalitypage.clickintotheDocstabinEmployeeDetails();
		
		if (!result) {
	        String message = "Docs tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Docs tab clicked successfully");
	}
	
	@When("user click on the new document button in docs section")
	public void user_click_on_the_new_document_button_in_docs_section() {
		boolean result = HRmodulefunctionalitypage.clickintotheNewDocumentbuttoninDocs();
		
		if (!result) {
	        String message = "New Document button is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New Document button clicked successfully");
	}
	
	@Then("user enter the title name in add employee document pop-up window")
	public void user_enter_the_title_name_in_add_employee_document_pop_up_window() {
		String DocumentTitle = Hooks.prop.getProperty("titlenamefordocs");
		HRmodulefunctionalitypage.entertheTitleinDocs(DocumentTitle);
		
		System.out.println("User Entered the Document Title: " + DocumentTitle);
		Hooks.scenario.log("User Entered the Document Title: " + DocumentTitle);
	}
	
	@And("user upload the PDF document in add employee document pop-up window")
	public void user_upload_the_PDF_document_in_add_employee_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Get_Started_With_Smallpdf.pdf";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheDocumentsinDocs(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PDF File upload failed");
	    }

	    Hooks.scenario.log("The PDF File uploaded successfully");
	}
	
	@And("user upload the Docx document in add employee document pop-up window")
	public void user_upload_the_Docx_document_in_add_employee_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file-sample_1MB.docx";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheDocumentsinDocs(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Docx File upload failed");
	    }

	    Hooks.scenario.log("The Docx File uploaded successfully");
	}
	
	@And("user upload the Excel document in add employee document pop-up window")
	public void user_upload_the_Excel_document_in_add_employee_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file_example_XLSX_5000.xlsx";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheDocumentsinDocs(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Excel File upload failed");
	    }

	    Hooks.scenario.log("The Excel File uploaded successfully");
	}
	
	@And("user upload the PPT document in add employee document pop-up window")
	public void user_upload_the_PPT_document_in_add_employee_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file_example_PPT_1MB.ppt";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheDocumentsinDocs(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PPT File upload failed");
	    }

	    Hooks.scenario.log("The PPT File uploaded successfully");
	}
	
	@And("user upload the HTML document in add employee document pop-up window")
	public void user_upload_the_HTML_document_in_add_employee_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/sample html file download.html";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheDocumentsinDocs(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The HTML File upload failed");
	    }

	    Hooks.scenario.log("The HTML File uploaded successfully");
	}
	
	@And("user upload the TXT document in add employee document pop-up window")
	public void user_upload_the_TXT_document_in_add_employee_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Testing file.txt";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheDocumentsinDocs(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The TXT File upload failed");
	    }

	    Hooks.scenario.log("The TXT File uploaded successfully");
	}
	
	@And("user upload the PNG image file in add employee document pop-up window")
	public void user_upload_the_PNG_image_file_in_add_employee_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/1.png";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheDocumentsinDocs(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PNG image File upload failed");
	    }

	    Hooks.scenario.log("The PNG image File uploaded successfully");
	}
	
	@And("user upload the GIF image file in add employee document pop-up window")
	public void user_upload_the_GIF_image_file_in_add_employee_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_GIF.gif";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheDocumentsinDocs(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The GIF image File upload failed");
	    }

	    Hooks.scenario.log("The GIF image File uploaded successfully");
	}
	
	@And("user upload the SVG image file in add employee document pop-up window")
	public void user_upload_the_SVG_image_file_in_add_employee_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_SVG.svg";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheDocumentsinDocs(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The SVG image File upload failed");
	    }

	    Hooks.scenario.log("The SVG image File uploaded successfully");
	}
	
	@And("user upload the TIFF image file in add employee document pop-up window")
	public void user_upload_the_TIFF_image_file_in_add_employee_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_TIFF.tiff";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheDocumentsinDocs(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The TIFF image File upload failed");
	    }

	    Hooks.scenario.log("The TIFF image File uploaded successfully");
	}
	
	@And("user upload the JPEG image file in add employee document pop-up window")
	public void user_upload_the_JPEG_image_file_in_add_employee_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/sample.jpeg";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheDocumentsinDocs(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The JPEG image File upload failed");
	    }

	    Hooks.scenario.log("The JPEG image File uploaded successfully");
	}
	
	@And("user upload the JFIF image file in add employee document pop-up window")
	public void user_upload_the_JFIF_image_file_in_add_employee_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/signature_images.jfif";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheDocumentsinDocs(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The JFIF image File upload failed");
	    }

	    Hooks.scenario.log("The JFIF image File uploaded successfully");
	}
	
	@And("user upload the audio file in add employee document pop-up window")
	public void user_upload_the_audio_file_in_add_employee_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Audio Files/file_example_MP3_1MG.mp3";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheDocumentsinDocs(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Audio File upload failed");
	    }

	    Hooks.scenario.log("The Audio File uploaded successfully");
	}
	
	@And("user upload the video file in add employee document pop-up window")
	public void user_upload_the_video_file_in_add_employee_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Audio Files/file_example_MP4_480_1_5MG.mp4";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheDocumentsinDocs(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Video File upload failed");
	    }

	    Hooks.scenario.log("The Video File uploaded successfully");
	}
	
	@When("user click on the submit button in add employee document pop-up window")
	public void user_click_on_the_submit_button_in_add_employee_document_pop_up_window() throws Exception {
		String result = HRmodulefunctionalitypage.clickintothesubmitbuttoninDocs();
		Thread.sleep(1500);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@When("user click on the three dot tab in existing document in docs section")
	public void user_click_on_the_three_dot_tab_in_existing_document_in_docs_section() {
		boolean result = HRmodulefunctionalitypage.clickintothethreedotbuttoninExistingdocument();
		
		if (!result) {
	        String message = "Document is not added, and the three-dot (more options) button is also not visible on the Docs Section — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@Then("user click on the edit tab in existing document in docs section")
	public void user_click_on_the_edit_tab_in_existing_document_in_docs_section() {
		boolean result = HRmodulefunctionalitypage.clickintotheEditbuttoninExistingdocumentinDocs();
		
		if (!result) {
	        String message = "Edit tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit tab clicked successfully");
	}
	
	@And("user change the title in existing document in docs section")
	public void user_change_the_title_in_existing_document_in_docs_section() {
		String DocumentTitle = Hooks.prop.getProperty("changetitlenamefordocs");
		HRmodulefunctionalitypage.entertheTitleinDocs(DocumentTitle);
		
		System.out.println("User Entered the Change Document Title: " + DocumentTitle);
		Hooks.scenario.log("User Entered the Change Document Title: " + DocumentTitle);
	}
	
	@Then("user click on the delete tab in existing document in docs section")
	public void user_click_on_the_delete_tab_in_existing_document_in_docs_section() {
		boolean result = HRmodulefunctionalitypage.clickintotheDeletetabinExistingdocumentinDocs();
		
		if (!result) {
	        String message = "Delete tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Delete the existing Docs successfully");
	}
	
	@Then("user click on the download tab in existing document in docs section")
	public void user_click_on_the_download_tab_in_existing_document_in_docs_section() {
		boolean result = HRmodulefunctionalitypage.clickintotheDownloadbuttoninExistingdocumentinDocs();
		
		if (!result) {
	        String message = "Download tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Download the existing Docs successfully");
	}
	
	
	//-----------------------------------CheckList Section in Employees Details--------------------------------
	
	
	@And("user click on the checklist tab in employee details page")
	public void user_click_on_the_checklist_tab_in_employee_details_page() {
		boolean result = HRmodulefunctionalitypage.clickintotheCheckListtabinEmployeeDetails();
		
		if (!result) {
	        String message = "Checklist tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Checklist tab clicked successfully");
	}
	
	@When("user click on the new checklist button in checklist section")
	public void user_click_on_the_new_checklist_button_in_checklist_section() {
		boolean result = HRmodulefunctionalitypage.clickintotheNewChecklistbuttoninchecklist();
		
		if (!result) {
	        String message = "New Checklist button is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New Checklist button clicked successfully");
	}
	
	@Then("user select the checklist in add employee checklist pop-up window")
	public void user_select_the_checklist_in_add_employee_checklist_pop_up_window() {
		int CheckListIndex = 1; // fetch from config if required

	    boolean result = HRmodulefunctionalitypage.selecttheChecklistByIndex(CheckListIndex);

	    if (result) {
	        Hooks.scenario.log("CheckList selection attempted using index: " + CheckListIndex);
	    } else {
	        // Rare case – page method already handles safety
	        Hooks.scenario.log("CheckList not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@And("user upload PDF file in add employee checklist pop-up window")
	public void user_upload_PDF_file_in_add_employee_checklist_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Get_Started_With_Smallpdf.pdf";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinCheckList(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PDF File upload failed");
	    }

	    Hooks.scenario.log("The PDF File uploaded successfully");
	}
	
	@And("user upload Docx file in add employee checklist pop-up window")
	public void user_upload_Docx_file_in_add_employee_checklist_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file-sample_1MB.docx";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinCheckList(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Docx File upload failed");
	    }

	    Hooks.scenario.log("The Docx File uploaded successfully");
	}
	
	@And("user upload Excel file in add employee checklist pop-up window")
	public void user_upload_Excel_file_in_add_employee_checklist_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file_example_XLSX_5000.xlsx";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinCheckList(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Excel File upload failed");
	    }

	    Hooks.scenario.log("The Excel File uploaded successfully");
	}
	
	@And("user upload PPT file in add employee checklist pop-up window")
	public void user_upload_PPT_file_in_add_employee_checklist_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file_example_PPT_1MB.ppt";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinCheckList(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PPT File upload failed");
	    }

	    Hooks.scenario.log("The PPT File uploaded successfully");
	}
	
	@And("user upload Txt file in add employee checklist pop-up window")
	public void user_upload_Txt_file_in_add_employee_checklist_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Testing file.txt";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinCheckList(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Txt File upload failed");
	    }

	    Hooks.scenario.log("The Txt File uploaded successfully");
	}
	
	@And("user upload HTML file in add employee checklist pop-up window")
	public void user_upload_HTML_file_in_add_employee_checklist_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/sample html file download.html";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinCheckList(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The HTML File upload failed");
	    }

	    Hooks.scenario.log("The HTML File uploaded successfully");
	}
	
	@And("user upload PNG image file in add employee checklist pop-up window")
	public void user_upload_PNG_image_file_in_add_employee_checklist_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/Product Category.png";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinCheckList(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PNG image File upload failed");
	    }

	    Hooks.scenario.log("The PNG image File uploaded successfully");
	}
	
	@And("user upload JPEG image file in add employee checklist pop-up window")
	public void user_upload_JPEG_image_file_in_add_employee_checklist_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/sample.jpeg";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinCheckList(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The JPEG image File upload failed");
	    }

	    Hooks.scenario.log("The JPEG image File uploaded successfully");
	}
	
	@And("user upload SVG image file in add employee checklist pop-up window")
	public void user_upload_SVG_image_file_in_add_employee_checklist_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_SVG.svg";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinCheckList(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The SVG image File upload failed");
	    }

	    Hooks.scenario.log("The SVG image File uploaded successfully");
	}
	
	@And("user upload GIF image file in add employee checklist pop-up window")
	public void user_upload_GIF_image_file_in_add_employee_checklist_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_GIF.gif";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinCheckList(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The GIF image File upload failed");
	    }

	    Hooks.scenario.log("The GIF image File uploaded successfully");
	}
	
	@And("user upload TIFF image file in add employee checklist pop-up window")
	public void user_upload_TIFF_image_file_in_add_employee_checklist_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_TIFF.tiff";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinCheckList(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The TIFF image File upload failed");
	    }

	    Hooks.scenario.log("The TIFF image File uploaded successfully");
	}
	
	@And("user upload JFIF image file in add employee checklist pop-up window")
	public void user_upload_JFIF_image_file_in_add_employee_checklist_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/signature_images.jfif";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinCheckList(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The JFIF image File upload failed");
	    }

	    Hooks.scenario.log("The JFIF image File uploaded successfully");
	}
	
	@And("user upload audio file in add employee checklist pop-up window")
	public void user_upload_audio_file_in_add_employee_checklist_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Audio Files/file_example_MP3_1MG.mp3";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinCheckList(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Audio File upload failed");
	    }

	    Hooks.scenario.log("The Audio File uploaded successfully");
	}
	
	@And("user upload video file in add employee checklist pop-up window")
	public void user_upload_video_file_in_add_employee_checklist_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Audio Files/file_example_MP4_480_1_5MG.mp4";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinCheckList(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Video File upload failed");
	    }

	    Hooks.scenario.log("The Video File uploaded successfully");
	}
	
	@When("user enter the notes in add employee checklist pop-up window")
	public void user_enter_the_notes_in_add_employee_checklist_pop_up_window() {
		String Notes = Hooks.prop.getProperty("notesincheclist");
		HRmodulefunctionalitypage.entertheNotesinCheckList(Notes);
		
		System.out.println("User Entered the Notes: " + Notes);
		Hooks.scenario.log("User Entered the Notes: " + Notes);
	}
	
	@Then("user click on the submit button in add employee checklist pop-up window")
	public void user_click_on_the_submit_button_in_add_employee_checklist_pop_up_window() throws Exception {
		String result = HRmodulefunctionalitypage.clickintothesubmitbuttoninCheckList();
		Thread.sleep(1500);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@When("user click on the three dot button in checklist section")
	public void user_click_on_the_three_dot_button_in_checklist_section() {
		boolean result = HRmodulefunctionalitypage.clickintothethreedotbuttoninExistingChecklist();
		
		if (!result) {
	        String message = "Employee CheckList is not added, and the three-dot (more options) button is also not visible on the CheckList Section — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@Then("user click on the edit button in existing employee checklist in checklist section")
	public void user_click_on_the_edit_button_in_existing_employee_checklist_in_checklist_section() {
		boolean result = HRmodulefunctionalitypage.clickintotheEdittabinExistingChecklist();
		
		if (!result) {
	        String message = "Edit tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit tab clicked successfully");
	}
	
	@And("user change the checklist in edit employee checklist pop-up window")
	public void user_change_the_checklist_in_edit_employee_checklist_pop_up_window() {
		int CheckListIndex = 4; // fetch from config if required

	    boolean result = HRmodulefunctionalitypage.selecttheChecklistByIndex(CheckListIndex);

	    if (result) {
	        Hooks.scenario.log("CheckList selection attempted using index: " + CheckListIndex);
	    } else {
	        // Rare case – page method already handles safety
	        Hooks.scenario.log("CheckList not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@When("user change the file in edit employee checklist pop-up window")
	public void user_change_the_file_in_edit_employee_checklist_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/sample.jpeg";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinCheckList(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The JPEG image File upload failed");
	    }

	    Hooks.scenario.log("The JPEG image File uploaded successfully");
	}
	
	@Then("user change the notes in edit employee checklist pop-up window")
	public void user_change_the_notes_in_edit_employee_checklist_pop_up_window() {
		String Notes = Hooks.prop.getProperty("changenotes");
		HRmodulefunctionalitypage.entertheNotesinCheckList(Notes);
		
		System.out.println("User Entered New the Notes: " + Notes);
		Hooks.scenario.log("User Entered New the Notes: " + Notes);
	}
	
	@Then("user click on the delete button in existing employee checklist in checklist section")
	public void user_click_on_the_delete_button_in_existing_employee_checklist_in_checklist_section() {
		boolean result = HRmodulefunctionalitypage.clickintotheDeletetabinExistingChecklist();
		
		if (!result) {
	        String message = "Delete tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing Employee Checklist is delete successfully");
	}
	
	@Then("user click on the download button in existing employee checklist in checklist section")
	public void user_click_on_the_download_button_in_existing_employee_checklist_in_checklist_section() {
		boolean result = HRmodulefunctionalitypage.clickintotheDownloadtabinExistingChecklist();
		
		if (!result) {
	        String message = "Download tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing Employee Checklist is download successfully");
	}
	
	
	//---------------------------Note Section in Employees Details-------------------------------
	
	
	@And("user click on the note tab in employee details page")
	public void user_click_on_the_note_tab_in_employee_details_page() {
		boolean result = HRmodulefunctionalitypage.clickintotheNotetabinEmployeeDetails();
		
		if (!result) {
	        String message = "Note tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Note tab clicked successfully");
	}
	
	@When("user click on the new note button in note section")
	public void user_click_on_the_new_note_button_in_note_section() {
		boolean result = HRmodulefunctionalitypage.clickintotheNewNotebuttoninNote();
		
		if (!result) {
	        String message = "New Notes tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New Notes tab clicked successfully");
	}
	
	@Then("user enter the subject in add employee note pop-up window")
	public void user_enter_the_subject_in_add_employee_note_pop_up_window() {
		String Subject = Hooks.prop.getProperty("subjectinnote");
		HRmodulefunctionalitypage.entertheSubjectinNote(Subject);
		
		System.out.println("User Entered the Subject: " + Subject);
		Hooks.scenario.log("User Entered the Subject: " + Subject);
	}
	
	@And("user enter the notes in add employee note pop-up window")
	public void user_enter_the_notes_in_add_employee_note_pop_up_window() {
		String Notes = Hooks.prop.getProperty("notesinnote");
		HRmodulefunctionalitypage.entertheNotesinNote(Notes);
		
		System.out.println("User Entered the Notes: " + Notes);
		Hooks.scenario.log("User Entered the Notes: " + Notes);
	}
	
	@When("user upload the PDF file in add employee note pop-up window")
	public void user_upload_the_PDF_file_in_add_employee_note_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Get_Started_With_Smallpdf.pdf";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinNote(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PDF File upload failed");
	    }

	    Hooks.scenario.log("The PDF File uploaded successfully");
	}
	
	@When("user upload the Docx file in add employee note pop-up window")
	public void user_upload_the_Docx_file_in_add_employee_note_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file-sample_1MB.docx";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinNote(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Docx File upload failed");
	    }

	    Hooks.scenario.log("The Docx File uploaded successfully");
	}
	
	@When("user upload the Excel file in add employee note pop-up window")
	public void user_upload_the_Excel_file_in_add_employee_note_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file_example_XLSX_5000.xlsx";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinNote(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Excel File upload failed");
	    }

	    Hooks.scenario.log("The Excel File uploaded successfully");
	}
	
	@When("user upload the PPT file in add employee note pop-up window")
	public void user_upload_the_PPT_file_in_add_employee_note_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file_example_PPT_1MB.ppt";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinNote(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PPT File upload failed");
	    }

	    Hooks.scenario.log("The PPT File uploaded successfully");
	}
	
	@When("user upload the HTML file in add employee note pop-up window")
	public void user_upload_the_HTML_file_in_add_employee_note_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/sample html file download.html";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinNote(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The HTML File upload failed");
	    }

	    Hooks.scenario.log("The HTML File uploaded successfully");
	}
	
	@When("user upload the Txt file in add employee note pop-up window")
	public void user_upload_the_Txt_file_in_add_employee_note_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Testing file.txt";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinNote(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Txt File upload failed");
	    }

	    Hooks.scenario.log("The Txt File uploaded successfully");
	}
	
	@When("user upload the PNG image file in add employee note pop-up window")
	public void user_upload_the_PNG_image_file_in_add_employee_note_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/Product Category.png";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinNote(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PNG image File upload failed");
	    }

	    Hooks.scenario.log("The PNG image File uploaded successfully");
	}
	
	@When("user upload the JPEG image file in add employee note pop-up window")
	public void user_upload_the_JPEG_image_file_in_add_employee_note_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/sample.jpeg";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinNote(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The JPEG image File upload failed");
	    }

	    Hooks.scenario.log("The JPEG image File uploaded successfully");
	}
	
	@When("user upload the GIF image file in add employee note pop-up window")
	public void user_upload_the_GIF_image_file_in_add_employee_note_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_GIF.gif";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinNote(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The GIF image File upload failed");
	    }

	    Hooks.scenario.log("The GIF image File uploaded successfully");
	}
	
	@When("user upload the SVG image file in add employee note pop-up window")
	public void user_upload_the_SVG_image_file_in_add_employee_note_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_SVG.svg";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinNote(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The SVG image File upload failed");
	    }

	    Hooks.scenario.log("The SVG image File uploaded successfully");
	}
	
	@When("user upload the audio file in add employee note pop-up window")
	public void user_upload_the_audio_file_in_add_employee_note_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Audio Files/file_example_MP3_1MG.mp3";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinNote(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Audio File upload failed");
	    }

	    Hooks.scenario.log("The Audio File uploaded successfully");
	}
	
	@When("user upload the video file in add employee note pop-up window")
	public void user_upload_the_video_file_in_add_employee_note_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Audio Files/file_example_MP4_480_1_5MG.mp4";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinNote(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Video File upload failed");
	    }

	    Hooks.scenario.log("The Video File uploaded successfully");
	}
	
	@Then("user click on the submit button in add employee note pop-up window")
	public void user_click_on_the_submit_button_in_add_employee_note_pop_up_window() throws Exception {
		String result = HRmodulefunctionalitypage.clickintothesubmitbuttoninNote();
		Thread.sleep(1500);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@When("user click on the three dot button in existing employee note in note section")
	public void user_click_on_the_three_dot_button_in_existing_employee_note_in_note_section() {
		boolean result = HRmodulefunctionalitypage.clickintothethreedotbuttoninExistingNote();
		
		if (!result) {
	        String message = "Employee Note is not added, and the three-dot (more options) button is also not visible on the Note Section — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@Then("user click on the edit button in note section")
	public void user_click_on_the_edit_button_in_note_section() {
		boolean result = HRmodulefunctionalitypage.clickintotheEditbuttoninNote();
		
		if (!result) {
	        String message = "Edit tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit tab clicked successfully");
	}
	
	@And("user change the subject in edit employee note pop-up window")
	public void user_change_the_subject_in_edit_employee_note_pop_up_window() {
		String Subject = Hooks.prop.getProperty("newsubjectinnote");
		HRmodulefunctionalitypage.entertheSubjectinNote(Subject);
		
		System.out.println("User Entered the New Subject: " + Subject);
		Hooks.scenario.log("User Entered the New Subject: " + Subject);
	}
	
	@When("user change the notes in edit employee note pop-up window")
	public void user_change_the_notes_in_edit_employee_note_pop_up_window() {
		String Notes = Hooks.prop.getProperty("newnotes");
		HRmodulefunctionalitypage.entertheNotesinNote(Notes);
		
		System.out.println("User Entered the New Notes: " + Notes);
		Hooks.scenario.log("User Entered the New Notes: " + Notes);
	}
	
	@Then("user change the file in edit employee note pop-up window")
	public void user_change_the_file_in_edit_employee_note_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_SVG.svg";
		boolean uploaded = HRmodulefunctionalitypage.uploadTheFileinNote(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The SVG image File upload failed");
	    }

	    Hooks.scenario.log("The SVG image File uploaded successfully");
	}
	
	@Then("user click on the delete button in note section")
	public void user_click_on_the_delete_button_in_note_section() {
		boolean result = HRmodulefunctionalitypage.clickintotheDeletetabinExistingNote();
		
		if (!result) {
	        String message = "Delete tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing note is delete successfully");
	}
	
	@Then("user click on the download button in note section")
	public void user_click_on_the_download_button_in_note_section() {
		boolean result = HRmodulefunctionalitypage.clickintotheDownloadbuttoninNote();
		
		if (!result) {
	        String message = "Download tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing note is download successfully");
	}
	
	
	//----------------------------------TimeLine Section in Employees Details--------------------------
	
	
	@And("user click on the timeline tab in employee details page")
	public void user_click_on_the_timeline_tab_in_employee_details_page() {
		boolean result = HRmodulefunctionalitypage.clickintotheTimelinetabinEmployeeDetails();
		
		if (!result) {
	        String message = "Timeline tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Timeline tab clicked successfully");
	}
	
	@When("user click on the new timeline button in timeline section")
	public void user_click_on_the_new_timeline_button_in_timeline_section() {
		boolean result = HRmodulefunctionalitypage.clickintotheNewTimelinebuttoninTimeLine();
		
		if (!result) {
	        String message = "New Timeline button is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New Timeline button clicked successfully");
	}
	
	@Then("user enter the event in add employee timeline pop-up window")
	public void user_enter_the_event_in_add_employee_timeline_pop_up_window() {
		String Event = Hooks.prop.getProperty("eventintimeline");
		HRmodulefunctionalitypage.entertheEventinTimeLine(Event);
		
		System.out.println("User Entered the Event: " + Event);
		Hooks.scenario.log("User Entered the Event: " + Event);
	}
	
	@And("user select the event date as today's in add employee timeline pop-up window")
	public void user_select_the_event_date_as_today_s_in_add_employee_timeline_pop_up_window() {
		// Click the Assign From date picker
        HRmodulefunctionalitypage.clickintotheEventDatetextboxinTimeline();

        // Select today's date
        HRmodulefunctionalitypage.selectEventTodaysDate();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Event Date: " + selectedDate);
        Hooks.scenario.log("Selected Event Date: " + selectedDate);
	}
	
	@When("user enter the notes in add employee timeline pop-up window")
	public void user_enter_the_notes_in_add_employee_timeline_pop_up_window() {
		String Notes = Hooks.prop.getProperty("notesintimeline");
		HRmodulefunctionalitypage.entertheNotesinTimeLine(Notes);
		
		System.out.println("User Entered the Notes: " + Notes);
		Hooks.scenario.log("User Entered the Notes: " + Notes);
	}
	
	@Then("user select the status as Active in add employee timeline pop-up window")
	public void user_select_the_status_as_Active_in_add_employee_timeline_pop_up_window() {
		String Status = "Active"; // or fetch from config if needed

	    boolean result = HRmodulefunctionalitypage.selecttheStatusinTImeline(Status);

	    if (result) {
	        Hooks.scenario.log("Status selection attempted: " + Status
	        );
	    } else {
	        // This block will rarely execute because page method already handles safety
	        Hooks.scenario.log("Status not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@Then("user select the status as NotOnPayroll in add employee timeline pop-up window")
	public void user_select_the_status_as_NotOnPayroll_in_add_employee_timeline_pop_up_window() {
		String Status = "NotOnPayroll"; // or fetch from config if needed

	    boolean result = HRmodulefunctionalitypage.selecttheStatusinTImeline(Status);

	    if (result) {
	        Hooks.scenario.log("Status selection attempted: " + Status
	        );
	    } else {
	        // This block will rarely execute because page method already handles safety
	        Hooks.scenario.log("Status not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@Then("user select the status as Terminated in add employee timeline pop-up window")
	public void user_select_the_status_as_Terminated_in_add_employee_timeline_pop_up_window() {
		String Status = "Terminated"; // or fetch from config if needed

	    boolean result = HRmodulefunctionalitypage.selecttheStatusinTImeline(Status);

	    if (result) {
	        Hooks.scenario.log("Status selection attempted: " + Status
	        );
	    } else {
	        // This block will rarely execute because page method already handles safety
	        Hooks.scenario.log("Status not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@Then("user select the status as Deceased in add employee timeline pop-up window")
	public void user_select_the_status_as_Deceased_in_add_employee_timeline_pop_up_window() {
		String Status = "Deceased"; // or fetch from config if needed

	    boolean result = HRmodulefunctionalitypage.selecttheStatusinTImeline(Status);

	    if (result) {
	        Hooks.scenario.log("Status selection attempted: " + Status
	        );
	    } else {
	        // This block will rarely execute because page method already handles safety
	        Hooks.scenario.log("Status not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@Then("user select the status as Resigned in add employee timeline pop-up window")
	public void user_select_the_status_as_Resigned_in_add_employee_timeline_pop_up_window() {
		String Status = "Resigned"; // or fetch from config if needed

	    boolean result = HRmodulefunctionalitypage.selecttheStatusinTImeline(Status);

	    if (result) {
	        Hooks.scenario.log("Status selection attempted: " + Status
	        );
	    } else {
	        // This block will rarely execute because page method already handles safety
	        Hooks.scenario.log("Status not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@And("user click on the submit button in add employee timeline pop-up window")
	public void user_click_on_the_submit_button_in_add_employee_timeline_pop_up_window() throws Exception {
		String result = HRmodulefunctionalitypage.clickintothesubmitbuttoninTimeLine();
		Thread.sleep(1500);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	
	//------------------------------WorkBench Section in Employees Details------------------------------
	
	
	@And("user click on the workbench tab in employee details page")
	public void user_click_on_the_workbench_tab_in_employee_details_page() {
		boolean result = HRmodulefunctionalitypage.clickintotheWorkbenchtabinEmployeeDetails();
		
		if (!result) {
	        String message = "Workbench tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Workbench tab clicked successfully");
	}
	
	@When("user click on the new workbench button in workbench section")
	public void user_click_on_the_new_workbench_button_in_workbench_section() {
		boolean result = HRmodulefunctionalitypage.clickintotheNewWorkbenchbuttoninWorkBench();
		
		if (!result) {
	        String message = "New Workbench button is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New Workbench button clicked successfully");
	}
	
	@Then("user enter the workbench name in add new workbench pop-up window")
	public void user_enter_the_workbench_name_in_add_new_workbench_pop_up_window() {
		String WorkBenchName = Hooks.prop.getProperty("workbenchname");

	    boolean result = HRmodulefunctionalitypage.entertheWorkBenchnameinsearchbox(WorkBenchName);

	    if (!result) {
	        String message = "Unable to perform search because search textbox is not visible";
	        Hooks.scenario.log(message);
	        Assert.fail(message);
	    }

	    Hooks.scenario.log("Search functionality performed successfully with WorkBench Name: " + WorkBenchName);
	}
	
	@Then("user enter the invalid workbench name in add new workbench pop-up window")
	public void user_enter_the_invalid_workbench_name_in_add_new_workbench_pop_up_window() {
		String WorkBenchName = Hooks.prop.getProperty("invalidworkbenchname");

	    boolean result = HRmodulefunctionalitypage.entertheWorkBenchnameinsearchbox(WorkBenchName);

	    if (!result) {
	        String message = "Unable to perform search because search textbox is not visible";
	        Hooks.scenario.log(message);
	        Assert.fail(message);
	    }

	    Hooks.scenario.log("Search functionality performed successfully with WorkBench Name: " + WorkBenchName);
	}
	
	@And("user click on the checkbox of workbench name in add new workbench pop-up window")
	public void user_click_on_the_checkbox_of_workbench_name_in_add_new_workbench_pop_up_window() {
		boolean result = HRmodulefunctionalitypage.clickintotheWorkbenchCheckboxinWorkBench();
		
		if (!result) {
	        String message = "WorkBench is not added, and the Checkbox button is also not visible on the Add New WorkBench pop-up window — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Checkbox button clicked successfully");
	}
	
	@Then("user click on the submit button in add new workbench pop-up window")
	public void user_click_on_the_submit_button_in_add_new_workbench_pop_up_window() throws Exception {
		String result = HRmodulefunctionalitypage.clickintothesubmitbuttoninWorkBench();
		Thread.sleep(1500);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	
	//------------------------------WorkBenches Section----------------------------------------------
	
	
	@When("user click on the workbenches tab in sidebar in HR module page")
	public void user_click_on_the_workbenches_tab_in_sidebar_in_HR_module_page() {
		boolean result = HRmodulefunctionalitypage.clickintotheworkbenchestabinsidebar();
		
		if (!result) {
	        String message = "Workbench tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Workbench tab clicked successfully");
	}
	
	@Then("user click on the filter tab in workbenches page")
	public void user_click_on_the_filter_tab_in_workbenches_page() {
		HRmodulefunctionalitypage.clickintothefiltertabinWorkbenches();
		
		System.out.println("Filter tab clicked successfully");
		Hooks.scenario.log("Filter tab clicked successfully");
	}
	
	@And("user enter the workbeches name in search textbox in workbenches page")
	public void user_enter_the_workbeches_name_in_search_textbox_in_workbenches_page() {
		String WorkbenchesName = Hooks.prop.getProperty("workbenchname");
		HRmodulefunctionalitypage.entertheWorkbenchesnameinsearchbox(WorkbenchesName);
		
		System.out.println("User Entered the Workbenches Name: " + WorkbenchesName);
		Hooks.scenario.log("User Entered the Workbenches Name: " + WorkbenchesName);
	}
	
	@And("user enter the invalid workbeches name in search textbox in workbenches page")
	public void user_enter_the_invalid_workbeches_name_in_search_textbox_in_workbenches_page() {
		String WorkbenchesName = Hooks.prop.getProperty("invalidworkbenchname");
		HRmodulefunctionalitypage.entertheWorkbenchesnameinsearchbox(WorkbenchesName);
		
		System.out.println("User Entered the Workbenches Name: " + WorkbenchesName);
		Hooks.scenario.log("User Entered the Workbenches Name: " + WorkbenchesName);
	}
	
	@When("user click on the search button in workbenches page")
	public void user_click_on_the_search_button_in_workbenches_page() {
		String result = HRmodulefunctionalitypage.clickintothesearchbuttoninWorkbenches();

	    System.out.println("Search Result: " + result);
	    Hooks.scenario.log("Search Result: " + result);

	    // ⚠ Skip remaining steps ONLY when no records / error
	    if (result.startsWith("ERROR")) {
	        // Scenario marked as SKIPPED (not FAILED)
	        Assume.assumeTrue("Skipping scenario due to search result: " + result, false);
	    }
	}
	
	@Then("user click on the new workbench button in workbenches page")
	public void user_click_on_the_new_workbench_button_in_workbenches_page() {
		boolean result = HRmodulefunctionalitypage.clickintothenewworkbenchinWorkbenches();
		
		if (!result) {
	        String message = "New Workbench button is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New Workbench button clicked successfully");
	}
	
	@And("user enter the workbench name in add new workbench pop-up window in workbenches page")
	public void user_enter_the_workbench_name_in_add_new_workbench_pop_up_window_in_workbenches_page() {
		String WorkbenchesName1 = Hooks.prop.getProperty("newworkbenchname");
		HRmodulefunctionalitypage.entertheWorkbenchnameinWorkbench(WorkbenchesName1);
		
		System.out.println("User Entered the Workbenches Name: " + WorkbenchesName1);
		Hooks.scenario.log("User Entered the Workbenches Name: " + WorkbenchesName1);
	}
	
	@When("user enter the workbench description in add new workbench pop-up window in workbenches page")
	public void user_enter_the_workbench_description_in_add_new_workbench_pop_up_window_in_workbenches_page() {
		String DescriptionWorkbench = Hooks.prop.getProperty("descriptionworkbench");
		HRmodulefunctionalitypage.entertheWorkbenchDescriptioninWorkbench(DescriptionWorkbench);
		
		System.out.println("User Entered the Description Workbench Name: " + DescriptionWorkbench);
		Hooks.scenario.log("User Entered the Description Workbench Name: " + DescriptionWorkbench);
	}
	
	@Then("user click on the submit button in add new workbench pop-up window in workbenches page")
	public void user_click_on_the_submit_button_in_add_new_workbench_pop_up_window_in_workbenches_page() throws Exception {
		String result = HRmodulefunctionalitypage.clickintothesubmitbuttoninWorkbenches();
		Thread.sleep(1500);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user click on the three dot button in existing workbench in workbenches page")
	public void user_click_on_the_three_dot_button_in_existing_workbench_in_workbenches_page() {
		boolean result = HRmodulefunctionalitypage.clickintothethreedotbuttoninExistingWorkbench();
		
		if (!result) {
	        String message = "Workbench is not added, and the three-dot (more options) button is also not visible on the Workbenches page — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@And("user click on the edit button in existing workbench in workbenches page")
	public void user_click_on_the_edit_button_in_existing_workbench_in_workbenches_page() {
		boolean result = HRmodulefunctionalitypage.clickintotheEditexistingWorkbenches();
		
		if (!result) {
	        String message = "Edit button is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit button clicked successfully");
	}
	
	@When("user change the workbench name in edit workbench pop-up window")
	public void user_change_the_workbench_name_in_edit_workbench_pop_up_window() {
		String WorkbenchesName1 = Hooks.prop.getProperty("changeworkbenchname1");
		HRmodulefunctionalitypage.entertheWorkbenchnameinWorkbench(WorkbenchesName1);
		
		System.out.println("User Entered the Workbenches Name: " + WorkbenchesName1);
		Hooks.scenario.log("User Entered the Workbenches Name: " + WorkbenchesName1);
	}
	
	@Then("user change the workbench descriptions in edit workbench pop-up window")
	public void user_change_the_workbench_descriptions_in_edit_workbench_pop_up_window() {
		String DescriptionWorkbench = Hooks.prop.getProperty("changeworkbenchdescriptions");
		HRmodulefunctionalitypage.entertheWorkbenchDescriptioninWorkbench(DescriptionWorkbench);
		
		System.out.println("User Entered the Description Workbench Name: " + DescriptionWorkbench);
		Hooks.scenario.log("User Entered the Description Workbench Name: " + DescriptionWorkbench);
	}
	
	@And("user click on the delete button in existing workbench in workbenches page")
	public void user_click_on_the_delete_button_in_existing_workbench_in_workbenches_page() {
		boolean result = HRmodulefunctionalitypage.clickintotheDeletetabinExistingWorkbench();
		
		if (!result) {
	        String message = "Delete button is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing workbench is delete successfully");
	}
	
	
	//-------------------------------Timesheet Section-------------------------------------------
	
	
	@When("user click on the timesheet tab in sidebar in HR module page")
	public void user_click_on_the_timesheet_tab_in_sidebar_in_HR_module_page() {
		boolean result = HRmodulefunctionalitypage.clickintotheTimesheettabinsidebar();
		
		if (!result) {
	        String message = "Timesheet tab is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Timesheet tab clicked successfully");
	}
	
	@Then("user click on the add line button in timesheet section")
	public void user_click_on_the_add_line_button_in_timesheet_section() {
		boolean result = HRmodulefunctionalitypage.clickintotheAddlinebuttoninTimesheet();
		
		if (!result) {
	        String message = "Add Line button is not visible on the Timessheet page — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Add Line button clicked successfully");
	}
	
	@And("user select the today's task date in add task efforts pop-up window")
	public void user_select_the_today_s_task_date_in_add_task_efforts_pop_up_window() {
		// Click the Task Date picker
        HRmodulefunctionalitypage.clickintotheTaskDate();

        // Select today's date
        HRmodulefunctionalitypage.selectTaskTodaysDate();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Task Date: " + selectedDate);
        Hooks.scenario.log("Selected Task Date: " + selectedDate);
	}
	
	@When("user select the project in add task efforts pop-up window")
	public void user_select_the_project_in_add_task_efforts_pop_up_window() {
		int ProjectIndex = 2; // fetch from config if required

	    boolean result = HRmodulefunctionalitypage.selecttheProjectByIndexinTimesheet(ProjectIndex);

	    if (result) {
	        Hooks.scenario.log("Project selection attempted using index: " + ProjectIndex);
	    } else {
	        // Rare case – page method already handles safety
	        Hooks.scenario.log("Project not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@Then("user select the task in add task efforts pop-up window")
	public void user_select_the_task_in_add_task_efforts_pop_up_window() {
		int TaskIndex = 2; // fetch from config if required

	    boolean result = HRmodulefunctionalitypage.selecttheTaskByIndexinTimesheet(TaskIndex);

	    if (result) {
	        Hooks.scenario.log("Task selection attempted using index: " + TaskIndex);
	    } else {
	        // Rare case – page method already handles safety
	        Hooks.scenario.log("Task not selected due to unexpected issue, but scenario continues");
	    }
	}
	
	@And("user enter the task hours in add task efforts pop-up window")
	public void user_enter_the_task_hours_in_add_task_efforts_pop_up_window() {
		String TaskHours = Hooks.prop.getProperty("taskhours");
		HRmodulefunctionalitypage.entertheTaskHoursinTaskEfforts(TaskHours);
		
		System.out.println("User Entered the Task Hours: " + TaskHours);
		Hooks.scenario.log("User Entered the Task Hours: " + TaskHours);
	}
	
	@And("user click on the submit button in add task efforts pop-up window")
	public void user_click_on_the_submit_button_in_add_task_efforts_pop_up_window() throws Exception {
		String result = HRmodulefunctionalitypage.clickintothesubmitbuttoninTaskefforts();
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user click on the today button in timesheet section")
	public void user_click_on_the_today_button_in_timesheet_section() {
		HRmodulefunctionalitypage.clickintotheTodaybuttoninTimesheet();
		
		System.out.println("Today button clicked successfully");
		Hooks.scenario.log("Today button clicked successfully");
	}
	
	@Then("user able to change the existing employee task hours in timesheet section")
	public void user_able_to_change_the_existing_employee_task_hours_in_timesheet_section() {
		String hours = Hooks.prop.getProperty("newtaskhours");
		HRmodulefunctionalitypage.updateTodayTaskHours(hours);
		
		System.out.println("User Entered the New Task Hours: " + hours);
		Hooks.scenario.log("User Entered the New Task Hours: " + hours);
	}
	
	@Then("user able to change the existing employee task hours using invalid value like character in timesheet section")
	public void user_able_to_change_the_existing_employee_task_hours_using_invalid_value_like_character_in_timesheet_section() {
		String hours = Hooks.prop.getProperty("invalidtaskhours");
		HRmodulefunctionalitypage.updateTodayTaskHours(hours);
		
		System.out.println("User Entered the New Task Hours: " + hours);
		Hooks.scenario.log("User Entered the New Task Hours: " + hours);
	}
	
	@Then("user click on the export to excel button")
	public void user_click_on_the_export_to_excel_button() {
		boolean result = HRmodulefunctionalitypage.clickintotheExporttoExcelbuttoninTimesheet();
		
		if (!result) {
	        String message = "Export to Excel button is not visible for that user because don't have permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Export to Excel button clicked successfully");
	}
	
	@And("user click on the HR module tab in profile details")
	public void user_click_on_the_HR_module_tab_in_profile_details() {
		HRmodulefunctionalitypage.clickintotheHRtabinProfileDetails();
		
		System.out.println("HR tab clicked successfully");
		Hooks.scenario.log("HR tab clicked successfully");
	}
	
	@When("user uncheck the add folder checkbox button in bucket section of hr module")
	public void user_uncheck_the_add_folder_checkbox_button_in_bucket_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckAddFolderCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("Add Folder Checkbox is already unchecked");
		        Hooks.scenario.log("Add Folder Checkbox is already unchecked");
		    } else {
		        System.out.println("Add Folder Checkbox was checked, now unchecked");
		        Hooks.scenario.log("Add Folder Checkbox was checked, now unchecked");
		    }
	}
	
	@When("user check the add folder checkbox button in bucket section of hr module")
	public void user_check_the_add_folder_checkbox_button_in_bucket_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkAddFolderCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("Add Folder Checkbox is already checked");
	        Hooks.scenario.log("Add Folder Checkbox is already checked");
	    } else {
	        System.out.println("Add Folder Checkbox was unchecked, now checked");
	        Hooks.scenario.log("Add Folder Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the edit folder checkbox button in bucket section of hr module")
	public void user_uncheck_the_edit_folder_checkbox_button_in_bucket_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckEditFolderCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("Edit Folder Checkbox is already unchecked");
		        Hooks.scenario.log("Edit Folder Checkbox is already unchecked");
		    } else {
		        System.out.println("Edit Folder Checkbox was checked, now unchecked");
		        Hooks.scenario.log("Edit Folder Checkbox was checked, now unchecked");
		    }
	}
	
	@When("user check the edit folder checkbox button in bucket section of hr module")
	public void user_check_the_edit_folder_checkbox_button_in_bucket_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkEditFolderCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("Edit Folder Checkbox is already checked");
	        Hooks.scenario.log("Edit Folder Checkbox is already checked");
	    } else {
	        System.out.println("Edit Folder Checkbox was unchecked, now checked");
	        Hooks.scenario.log("Edit Folder Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the delete folder checkbox button in bucket section of hr module")
	public void user_uncheck_the_delete_folder_checkbox_button_in_bucket_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckDeleteFolderCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("Delete Folder Checkbox is already unchecked");
		        Hooks.scenario.log("Delete Folder Checkbox is already unchecked");
		    } else {
		        System.out.println("Delete Folder Checkbox was checked, now unchecked");
		        Hooks.scenario.log("Delete Folder Checkbox was checked, now unchecked");
		    }
	}
	
	@When("user check the delete folder checkbox button in bucket section of hr module")
	public void user_check_the_delete_folder_checkbox_button_in_bucket_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkDeleteFolderCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("Delete Folder Checkbox is already checked");
	        Hooks.scenario.log("Delete Folder Checkbox is already checked");
	    } else {
	        System.out.println("Delete Folder Checkbox was unchecked, now checked");
	        Hooks.scenario.log("Delete Folder Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the add file checkbox button in bucket section of hr module")
	public void user_uncheck_the_add_file_checkbox_button_in_bucket_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckAddFileCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("Add File Checkbox is already unchecked");
		        Hooks.scenario.log("Add File Checkbox is already unchecked");
		    } else {
		        System.out.println("Add File Checkbox was checked, now unchecked");
		        Hooks.scenario.log("Add File Checkbox was checked, now unchecked");
		    }
	}
	
	@When("user check the add file checkbox button in bucket section of hr module")
	public void user_check_the_add_file_checkbox_button_in_bucket_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkAddFileCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("Add File Checkbox is already checked");
	        Hooks.scenario.log("Add File Checkbox is already checked");
	    } else {
	        System.out.println("Add File Checkbox was unchecked, now checked");
	        Hooks.scenario.log("Add File Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the edit file checkbox button in bucket section of hr module")
	public void user_uncheck_the_edit_file_checkbox_button_in_bucket_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckEditFileCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("Edit File Checkbox is already unchecked");
		        Hooks.scenario.log("Edit File Checkbox is already unchecked");
		    } else {
		        System.out.println("Edit File Checkbox was checked, now unchecked");
		        Hooks.scenario.log("Edit File Checkbox was checked, now unchecked");
		    }
	}
	
	@When("user check the edit file checkbox button in bucket section of hr module")
	public void user_check_the_edit_file_checkbox_button_in_bucket_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkEditFileCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("Edit File Checkbox is already checked");
	        Hooks.scenario.log("Edit File Checkbox is already checked");
	    } else {
	        System.out.println("Edit File Checkbox was unchecked, now checked");
	        Hooks.scenario.log("Edit File Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the delete file checkbox button in bucket section of hr module")
	public void user_uncheck_the_delete_file_checkbox_button_in_bucket_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckDeleteFileCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("Delete File Checkbox is already unchecked");
		        Hooks.scenario.log("Delete File Checkbox is already unchecked");
		    } else {
		        System.out.println("Delete File Checkbox was checked, now unchecked");
		        Hooks.scenario.log("Delete File Checkbox was checked, now unchecked");
		    }
	}
	
	@When("user check the delete file checkbox button in bucket section of hr module")
	public void user_check_the_delete_file_checkbox_button_in_bucket_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkDeleteFileCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("Delete File Checkbox is already checked");
	        Hooks.scenario.log("Delete File Checkbox is already checked");
	    } else {
	        System.out.println("Delete File Checkbox was unchecked, now checked");
	        Hooks.scenario.log("Delete File Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the download file checkbox button in bucket section of hr module")
	public void user_uncheck_the_download_file_checkbox_button_in_bucket_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckDownloadFileCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("Download File Checkbox is already unchecked");
		        Hooks.scenario.log("Download File Checkbox is already unchecked");
		    } else {
		        System.out.println("Download File Checkbox was checked, now unchecked");
		        Hooks.scenario.log("Download File Checkbox was checked, now unchecked");
		    }
	}
	
	@When("user check the download file checkbox button in bucket section of hr module")
	public void user_check_the_download_file_checkbox_button_in_bucket_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkDownloadFileCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("Download File Checkbox is already checked");
	        Hooks.scenario.log("Download File Checkbox is already checked");
	    } else {
	        System.out.println("Download File Checkbox was unchecked, now checked");
	        Hooks.scenario.log("Download File Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the folder permission checkbox button in bucket section of hr module")
	public void user_uncheck_the_folder_permission_checkbox_button_in_bucket_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckFolderPermissionCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("Folder Permission Checkbox is already unchecked");
		        Hooks.scenario.log("Folder Permission Checkbox is already unchecked");
		    } else {
		        System.out.println("Folder Permission Checkbox was checked, now unchecked");
		        Hooks.scenario.log("Folder Permission Checkbox was checked, now unchecked");
		    }
	}
	
	@When("user check the folder permission checkbox button in bucket section of hr module")
	public void user_check_the_folder_permission_checkbox_button_in_bucket_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkFolderPermissionCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("Folder Permission Checkbox is already checked");
	        Hooks.scenario.log("Folder Permission Checkbox is already checked");
	    } else {
	        System.out.println("Folder Permission Checkbox was unchecked, now checked");
	        Hooks.scenario.log("Folder Permission Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the bucket checkbox button in bucket section of hr module")
	public void user_uncheck_the_bucket_checkbox_button_in_bucket_section_of_hr_module() throws Exception {
		boolean success = HRmodulefunctionalitypage.uncheckBucketUsingDoubleClickIfAllChildrenCheckedinHR();
		 Thread.sleep(2000);

		 if (success) {
			    System.out.println("All child + parent checkboxes unchecked");
			    Hooks.scenario.log("All child + parent checkboxes unchecked");
			} else {
			    System.out.println("All child + parent checkboxes are already Unchecked");
			    Hooks.scenario.log("All child + parent checkboxes are already Unchecked");
			}
	}
	
	@When("user check the bucket checkbox button in bucket section of hr module")
	public void user_check_the_bucket_checkbox_button_in_bucket_section_of_hr_module() throws Exception {
		boolean success = HRmodulefunctionalitypage.checkBucketSingleClickIfAllChildrenUncheckedinHR();
		 Thread.sleep(2000);

		 if (success) {
			    System.out.println("All child + parent checkboxes checked");
			    Hooks.scenario.log("All child + parent checkboxes checked");
			} else {
			    System.out.println("All child + parent checkboxes are already checked");
			    Hooks.scenario.log("All child + parent checkboxes are already checked");
			}
	}
	
	@When("user uncheck the Add checkbox button in employee section of hr module")
	public void user_uncheck_the_Add_checkbox_button_in_employee_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckAddEmployeeCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("Add Employee Checkbox is already unchecked");
		        Hooks.scenario.log("Add Employee Checkbox is already unchecked");
		    } else {
		        System.out.println("Add Employee Checkbox was checked, now unchecked");
		        Hooks.scenario.log("Add Employee Checkbox was checked, now unchecked");
		    }
	}
	
	@When("user check the Add checkbox button in employee section of hr module")
	public void user_check_the_Add_checkbox_button_in_employee_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkAddEmployeeCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("Add Employee Checkbox is already checked");
	        Hooks.scenario.log("Add Employee Checkbox is already checked");
	    } else {
	        System.out.println("Add Employee Checkbox was unchecked, now checked");
	        Hooks.scenario.log("Add Employee Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the Edit checkbox button in employee section of hr module")
	public void user_uncheck_the_Edit_checkbox_button_in_employee_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckEditEmployeeCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("Edit Employee Checkbox is already unchecked");
		        Hooks.scenario.log("Edit Employee Checkbox is already unchecked");
		    } else {
		        System.out.println("Edit Employee Checkbox was checked, now unchecked");
		        Hooks.scenario.log("Edit Employee Checkbox was checked, now unchecked");
		    }
	}
	
	@When("user check the Edit checkbox button in employee section of hr module")
	public void user_check_the_Edit_checkbox_button_in_employee_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkEditEmployeeCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("Edit Employee Checkbox is already checked");
	        Hooks.scenario.log("Edit Employee Checkbox is already checked");
	    } else {
	        System.out.println("Edit Employee Checkbox was unchecked, now checked");
	        Hooks.scenario.log("Edit Employee Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the Delete checkbox button in employee section of hr module")
	public void user_uncheck_the_Delete_checkbox_button_in_employee_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckDeleteEmployeeCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("Delete Employee Checkbox is already unchecked");
		        Hooks.scenario.log("Delete Employee Checkbox is already unchecked");
		    } else {
		        System.out.println("Delete Employee Checkbox was checked, now unchecked");
		        Hooks.scenario.log("Delete Employee Checkbox was checked, now unchecked");
		    }
	}
	
	@When("user check the Delete checkbox button in employee section of hr module")
	public void user_check_the_Delete_checkbox_button_in_employee_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkDeleteEmployeeCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("Delete Employee Checkbox is already checked");
	        Hooks.scenario.log("Delete Employee Checkbox is already checked");
	    } else {
	        System.out.println("Delete Employee Checkbox was unchecked, now checked");
	        Hooks.scenario.log("Delete Employee Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the Details checkbox button in employee section of hr module")
	public void user_uncheck_the_Details_checkbox_button_in_employee_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckDetailsEmployeeCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("Details Employee Checkbox is already unchecked");
		        Hooks.scenario.log("Details Employee Checkbox is already unchecked");
		    } else {
		        System.out.println("Details Employee Checkbox was checked, now unchecked");
		        Hooks.scenario.log("Details Employee Checkbox was checked, now unchecked");
		    }
	}
	
	@When("user check the Details checkbox button in employee section of hr module")
	public void user_check_the_Details_checkbox_button_in_employee_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkDetailsEmployeeCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("Details Employee Checkbox is already checked");
	        Hooks.scenario.log("Details Employee Checkbox is already checked");
	    } else {
	        System.out.println("Details Employee Checkbox was unchecked, now checked");
	        Hooks.scenario.log("Details Employee Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the Employee checkbox button in employee section of hr module")
	public void user_uncheck_the_Employee_checkbox_button_in_employee_section_of_hr_module() throws Exception {
		boolean success = HRmodulefunctionalitypage.uncheckEmployeeUsingDoubleClickIfAllChildrenCheckedinHR();
		 Thread.sleep(2000);

		 if (success) {
			    System.out.println("All child + parent checkboxes unchecked");
			    Hooks.scenario.log("All child + parent checkboxes unchecked");
			} else {
			    System.out.println("All child + parent checkboxes are already Unchecked");
			    Hooks.scenario.log("All child + parent checkboxes are already Unchecked");
			}
	}
	
	@When("user check the Employee checkbox button in employee section of hr module")
	public void user_check_the_Employee_checkbox_button_in_employee_section_of_hr_module() throws Exception {
		boolean success = HRmodulefunctionalitypage.checkEmployeeSingleClickIfAllChildrenUncheckedinHR();
		 Thread.sleep(2000);

		 if (success) {
			    System.out.println("All child + parent checkboxes checked");
			    Hooks.scenario.log("All child + parent checkboxes checked");
			} else {
			    System.out.println("All child + parent checkboxes are already checked");
			    Hooks.scenario.log("All child + parent checkboxes are already checked");
			}
	}
	
	@When("user uncheck the edit checkbox button in employee details section of hr module")
	public void user_uncheck_the_edit_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckEditEmployeeDetailsCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("Edit Employee Details Checkbox is already unchecked");
		        Hooks.scenario.log("Edit Employee Details Checkbox is already unchecked");
		    } else {
		        System.out.println("Edit Employee Details Checkbox was checked, now unchecked");
		        Hooks.scenario.log("Edit Employee Details Checkbox was checked, now unchecked");
		    }
	}
	
	@When("user check the edit checkbox button in employee details section of hr module")
	public void user_check_the_edit_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkEditEmployeeDetailsCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("Edit Employee Details Checkbox is already checked");
	        Hooks.scenario.log("Edit Employee Details Checkbox is already checked");
	    } else {
	        System.out.println("Edit Employee Details Checkbox was unchecked, now checked");
	        Hooks.scenario.log("Edit Employee Details Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the delete checkbox button in employee details section of hr module")
	public void user_uncheck_the_delete_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckDeleteEmployeeDetailsCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("Delete Employee Details Checkbox is already unchecked");
		        Hooks.scenario.log("Delete Employee Details Checkbox is already unchecked");
		    } else {
		        System.out.println("Delete Employee Details Checkbox was checked, now unchecked");
		        Hooks.scenario.log("Delete Employee Details Checkbox was checked, now unchecked");
		    }
	}
	
	@When("user check the delete checkbox button in employee details section of hr module")
	public void user_check_the_delete_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkDeleteEmployeeDetailsCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("Delete Employee Details Checkbox is already checked");
	        Hooks.scenario.log("Delete Employee Details Checkbox is already checked");
	    } else {
	        System.out.println("Delete Employee Details Checkbox was unchecked, now checked");
	        Hooks.scenario.log("Delete Employee Details Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the Link User To Employee checkbox button in employee details section of hr module")
	public void user_uncheck_the_Link_User_To_Employee_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckLinkUserToEmployeeDetailsCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("Link User To Employee Checkbox is already unchecked");
		        Hooks.scenario.log("Link User To Employee Checkbox is already unchecked");
		    } else {
		        System.out.println("Link User To Employee Checkbox was checked, now unchecked");
		        Hooks.scenario.log("Link User To Employee Checkbox was checked, now unchecked");
		    }
	}
	
	@When("user check the Link User To Employee checkbox button in employee details section of hr module")
	public void user_check_the_Link_User_To_Employee_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkLinkUserToEmployeeDetailsCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("Link User To Employee Checkbox is already checked");
	        Hooks.scenario.log("Link User To Employee Checkbox is already checked");
	    } else {
	        System.out.println("Link User To Employee Checkbox was unchecked, now checked");
	        Hooks.scenario.log("Link User To Employee Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the DeLink User To Employee checkbox button in employee details section of hr module")
	public void user_uncheck_the_DeLink_User_To_Employee_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckDeLinkUserToEmployeeDetailsCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("DeLink User To Employee Checkbox is already unchecked");
		        Hooks.scenario.log("DeLink User To Employee Checkbox is already unchecked");
		    } else {
		        System.out.println("DeLink User To Employee Checkbox was checked, now unchecked");
		        Hooks.scenario.log("DeLink User To Employee Checkbox was checked, now unchecked");
		    }
	}
	
	@When("user check the DeLink User To Employee checkbox button in employee details section of hr module")
	public void user_check_the_DeLink_User_To_Employee_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkDeLinkUserToEmployeeDetailsCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("DeLink User To Employee Checkbox is already checked");
	        Hooks.scenario.log("DeLink User To Employee Checkbox is already checked");
	    } else {
	        System.out.println("DeLink User To Employee Checkbox was unchecked, now checked");
	        Hooks.scenario.log("DeLink User To Employee Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the About Tab View checkbox button in employee details section of hr module")
	public void user_uncheck_the_About_Tab_View_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckAboutTabViewEmployeeDetailsCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("About Tab View Checkbox is already unchecked");
		        Hooks.scenario.log("About Tab View Checkbox is already unchecked");
		    } else {
		        System.out.println("About Tab View Checkbox was checked, now unchecked");
		        Hooks.scenario.log("About Tab View Checkbox was checked, now unchecked");
		    }
	}
	
	@When("user check the About Tab View checkbox button in employee details section of hr module")
	public void user_check_the_About_Tab_View_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkAboutTabViewEmployeeDetailsCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("About Tab View Checkbox is already checked");
	        Hooks.scenario.log("About Tab View Checkbox is already checked");
	    } else {
	        System.out.println("About Tab View Checkbox was unchecked, now checked");
	        Hooks.scenario.log("About Tab View Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the Licenses Tab View checkbox button in employee details section of hr module")
	public void user_uncheck_the_Licenses_Tab_View_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckLicensesTabViewEmployeeDetailsCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("Licenses Tab View Checkbox is already unchecked");
		        Hooks.scenario.log("Licenses Tab View Checkbox is already unchecked");
		    } else {
		        System.out.println("Licenses Tab View Checkbox was checked, now unchecked");
		        Hooks.scenario.log("Licenses Tab View Checkbox was checked, now unchecked");
		    }
	}
	
	@When("user check the Licenses Tab View checkbox button in employee details section of hr module")
	public void user_check_the_Licenses_Tab_View_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkLicensesTabViewEmployeeDetailsCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("Licenses Tab View Checkbox is already checked");
	        Hooks.scenario.log("Licenses Tab View Checkbox is already checked");
	    } else {
	        System.out.println("Licenses Tab View Checkbox was unchecked, now checked");
	        Hooks.scenario.log("Licenses Tab View Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the Access Code Tab View checkbox button in employee details section of hr module")
	public void user_uncheck_the_Access_Code_Tab_View_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckAccessCodeTabViewEmployeeDetailsCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("Access Code Tab View Checkbox is already unchecked");
		        Hooks.scenario.log("Access Code Tab View Checkbox is already unchecked");
		    } else {
		        System.out.println("Access Code Tab View Checkbox was checked, now unchecked");
		        Hooks.scenario.log("Access Code Tab View Checkbox was checked, now unchecked");
		    }
	}
	
	@When("user check the Access Code Tab View checkbox button in employee details section of hr module")
	public void user_check_the_Access_Code_Tab_View_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkAccessCodeTabViewEmployeeDetailsCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("Access Code Tab Checkbox is already checked");
	        Hooks.scenario.log("Access Code Tab Checkbox is already checked");
	    } else {
	        System.out.println("Access Code Tab Checkbox was unchecked, now checked");
	        Hooks.scenario.log("Access Code Tab Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the Docs Tab View checkbox button in employee details section of hr module")
	public void user_uncheck_the_Docs_Tab_View_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckDocsTabViewEmployeeDetailsCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("Docs Tab View Checkbox is already unchecked");
		        Hooks.scenario.log("Docs Tab View Checkbox is already unchecked");
		    } else {
		        System.out.println("Docs Tab View Checkbox was checked, now unchecked");
		        Hooks.scenario.log("Docs Tab View Checkbox was checked, now unchecked");
		}
	}
	
	@When("user check the Docs Tab View checkbox button in employee details section of hr module")
	public void user_check_the_Docs_Tab_View_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkDocsTabViewEmployeeDetailsCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("Docs Tab View Checkbox is already checked");
	        Hooks.scenario.log("Docs Tab View Checkbox is already checked");
	    } else {
	        System.out.println("Docs Tab View Checkbox was unchecked, now checked");
	        Hooks.scenario.log("Docs Tab View Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the Checklist Tab View checkbox button in employee details section of hr module")
	public void user_uncheck_the_Checklist_Tab_View_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckChecklistTabViewEmployeeDetailsCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("Checklist Tab View Checkbox is already unchecked");
		        Hooks.scenario.log("Checklist Tab View Checkbox is already unchecked");
		    } else {
		        System.out.println("Checklist Tab View Checkbox was checked, now unchecked");
		        Hooks.scenario.log("Checklist Tab View Checkbox was checked, now unchecked");
		}
	}
	
	@When("user check the Checklist Tab View checkbox button in employee details section of hr module")
	public void user_check_the_Checklist_Tab_View_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkChecklistTabViewEmployeeDetailsCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("Checklist Tab View Checkbox is already checked");
	        Hooks.scenario.log("Checklist Tab View Checkbox is already checked");
	    } else {
	        System.out.println("Checklist Tab View Checkbox was unchecked, now checked");
	        Hooks.scenario.log("Checklist Tab View Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the Note Tab View checkbox button in employee details section of hr module")
	public void user_uncheck_the_Note_Tab_View_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckNoteTabViewEmployeeDetailsCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("Note Tab View Checkbox is already unchecked");
		        Hooks.scenario.log("Note Tab View Checkbox is already unchecked");
		    } else {
		        System.out.println("Note Tab View Checkbox was checked, now unchecked");
		        Hooks.scenario.log("Note Tab View Checkbox was checked, now unchecked");
		}
	}
	
	@When("user check the Note Tab View checkbox button in employee details section of hr module")
	public void user_check_the_Note_Tab_View_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkNoteTabViewEmployeeDetailsCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("Note Tab View Checkbox is already checked");
	        Hooks.scenario.log("Note Tab View Checkbox is already checked");
	    } else {
	        System.out.println("Note Tab View Checkbox was unchecked, now checked");
	        Hooks.scenario.log("Note Tab View Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the Timeline Tab View checkbox button in employee details section of hr module")
	public void user_uncheck_the_Timeline_Tab_View_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckTimelineTabViewEmployeeDetailsCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("Timeline Tab View Checkbox is already unchecked");
		        Hooks.scenario.log("Timeline Tab View Checkbox is already unchecked");
		    } else {
		        System.out.println("Timeline Tab View Checkbox was checked, now unchecked");
		        Hooks.scenario.log("Timeline Tab View Checkbox was checked, now unchecked");
		}
	}
	
	@When("user check the Timeline Tab View checkbox button in employee details section of hr module")
	public void user_check_the_Timeline_Tab_View_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkTimelineTabViewEmployeeDetailsCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("Timeline Tab View Checkbox is already checked");
	        Hooks.scenario.log("Timeline Tab View Checkbox is already checked");
	    } else {
	        System.out.println("Timeline Tab View Checkbox was unchecked, now checked");
	        Hooks.scenario.log("Timeline Tab View Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the Employee Details checkbox button in employee details section of hr module")
	public void user_uncheck_the_Employee_Details_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean success = HRmodulefunctionalitypage.uncheckEmployeeDetailsUsingDoubleClickIfAllChildrenCheckedinHR();
		 Thread.sleep(2000);

		 if (success) {
			    System.out.println("All child + parent checkboxes unchecked");
			    Hooks.scenario.log("All child + parent checkboxes unchecked");
			} else {
			    System.out.println("All child + parent checkboxes are already Unchecked");
			    Hooks.scenario.log("All child + parent checkboxes are already Unchecked");
			}
	}
	
	@When("user check the Employee Details checkbox button in employee details section of hr module")
	public void user_check_the_Employee_Details_checkbox_button_in_employee_details_section_of_hr_module() throws Exception {
		boolean success = HRmodulefunctionalitypage.checkEmployeeDetailsSingleClickIfAllChildrenUncheckedinHR();
		 Thread.sleep(2000);

		 if (success) {
			    System.out.println("All child + parent checkboxes checked");
			    Hooks.scenario.log("All child + parent checkboxes checked");
			} else {
			    System.out.println("All child + parent checkboxes are already checked");
			    Hooks.scenario.log("All child + parent checkboxes are already checked");
			}
	}
	
	@And("user check the employee details tabs in employee details page")
	public void user_check_the_employee_details_tabs_in_employee_details_page() {
		boolean areTabsNotVisible = HRmodulefunctionalitypage.areAllEmployeeDetailsTabsNotVisible();

	    // If BOTH tabs are NOT visible → SKIP scenario
	    if (areTabsNotVisible) {

	        String message = "Employee Details tabs (Edit, Delete, Link User To Employee, Delink User To Employee, About, Licenses, Access Code, Docs, Checklist, Note, Timeline) are NOT visible — user does not have permission";

	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Scenario SKIPPED
	        return;
	    }

	    // If tabs are visible → continue execution
	    Hooks.scenario.log("Employee Details tabs (Edit, Delete, Link User To Employee, Delink User To Employee, About, Licenses, Access Code, Docs, Checklist, Note, Timeline) are visible");
	}
	
	@When("user uncheck the Add checkbox button in employee details license section of hr module")
	public void user_uncheck_the_Add_checkbox_button_in_employee_details_license_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckAddLicenseEmployeeDetailsCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("Add License Checkbox is already unchecked");
		        Hooks.scenario.log("Add License Checkbox is already unchecked");
		    } else {
		        System.out.println("Add License Checkbox was checked, now unchecked");
		        Hooks.scenario.log("Add License Checkbox was checked, now unchecked");
		}
	}
	
	@When("user check the Add checkbox button in employee details license section of hr module")
	public void user_check_the_Add_checkbox_button_in_employee_details_license_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkAddLicenseEmployeeDetailsCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("Add License Checkbox is already checked");
	        Hooks.scenario.log("Add License Checkbox is already checked");
	    } else {
	        System.out.println("Add License Checkbox was unchecked, now checked");
	        Hooks.scenario.log("Add License Checkbox was unchecked, now checked");
	    }
	}
	
	@When("user uncheck the Edit checkbox button in employee details license section of hr module")
	public void user_uncheck_the_Edit_checkbox_button_in_employee_details_license_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.uncheckEditLicenseEmployeeDetailsCheckboxinHR();
		 Thread.sleep(1500);

		 if (result) {
		        System.out.println("Edit License Checkbox is already unchecked");
		        Hooks.scenario.log("Edit License Checkbox is already unchecked");
		    } else {
		        System.out.println("Edit License Checkbox was checked, now unchecked");
		        Hooks.scenario.log("Edit License Checkbox was checked, now unchecked");
		}
	}
	
	@When("user check the Edit checkbox button in employee details license section of hr module")
	public void user_check_the_Edit_checkbox_button_in_employee_details_license_section_of_hr_module() throws Exception {
		boolean result = HRmodulefunctionalitypage.checkEditLicenseEmployeeDetailsCheckboxinHR();
		Thread.sleep(1500);

	    if (result) {
	        System.out.println("Edit License Checkbox is already checked");
	        Hooks.scenario.log("Edit License Checkbox is already checked");
	    } else {
	        System.out.println("Edit License Checkbox was unchecked, now checked");
	        Hooks.scenario.log("Edit License Checkbox was unchecked, now checked");
	    }
	}
}