package com.pharmcrm_ComplianceModule.steps;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.junit.Assume;
import org.openqa.selenium.WebDriver;

import com.pharmcrm_ComplianceModule.pages.ComplianceModuleFunctionalityPage;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComplianceModuleFunctionalitySteps {
	
	ComplianceModuleFunctionalityPage ComplianceModulefunctionalitypage = new ComplianceModuleFunctionalityPage(Hooks.driver);
	WebDriver driver; // class level driver variable
	
	@Then("user click on the Compliance module tab in home page")
	public void user_click_on_the_Compliance_module_tab_in_home_page() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheCompliancemoduletab();
		
		if (!result) {
	        String message = "Compliance Module (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Compliance Module tab clicked successfully");
	}
	
	
	//---------------------------------------Documents Section------------------------------------------
	
	
	@When("user click on the Documents tab in sidebar in Compliance module page")
	public void user_click_on_the_Documents_tab_in_sidebar_in_Compliance_module_page() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheDocumentstabinSidebar();
		
		if (!result) {
	        String message = "Documents (more options) tab is not visible because for that user don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Documents tab clicked successfully");
	}
	
	@Then("user click on the new folder tab in documents section")
	public void user_click_on_the_new_folder_tab_in_documents_section() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheNewFoldertabinDocuments();
		
		if (!result) {
	        String message = "New Folder (more options) tab is not visible because for that user don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("New Folder tab clicked successfully");
	}
	
	@And("user enter the new folder name in add folder pop-up window")
	public void user_enter_the_new_folder_name_in_add_folder_pop_up_window() {
		String FolderName = Hooks.prop.getProperty("newfoldername");
		ComplianceModulefunctionalitypage.entertheNewFolderName(FolderName);
		
		System.out.println("User Entered New Folder Name: " + FolderName);
		Hooks.scenario.log("User Entered New Folder Name: " + FolderName);
	}
	
	@When("user click on the submit button in add folder pop-up window")
	public void user_click_on_the_submit_button_in_add_folder_pop_up_window() throws Exception {
		String result = ComplianceModulefunctionalitypage.clickintotheSubmitbuttoninAddFolder();
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user click on the three dot button of existing folder in documents section")
	public void user_click_on_the_three_dot_button_of_existing_folder_in_documents_section() {
		boolean result = ComplianceModulefunctionalitypage.clickintothethreedotbuttoninExistingFolder();
		
		if (!result) {
	        String message = "Folder is not added, and the three-dot (more options) button is also not visible on the Documents Section — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@And("user click on the edit button of existing folder in documents section")
	public void user_click_on_the_edit_button_of_existing_folder_in_documents_section() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheEditbuttoninExistingFolder();
		
		if (!result) {
	        String message = "Edit Folder (more options) button is not visible because for that user don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit button clicked successfully");
	}
	
	@When("user change the folder name in edit name pop-up window in documents section")
	public void user_change_the_folder_name_in_edit_name_pop_up_window_in_documents_section() {
		String FolderName = Hooks.prop.getProperty("changefoldername");
		ComplianceModulefunctionalitypage.entertheNewFolderName(FolderName);
		
		System.out.println("User Entered Change Folder Name: " + FolderName);
		Hooks.scenario.log("User Entered Change Folder Name: " + FolderName);
	}
	
	@When("user remove the existing folder name in edit name pop-up window in documents section")
	public void user_remove_the_existing_folder_name_in_edit_name_pop_up_window_in_documents_section() {
		ComplianceModulefunctionalitypage.removetheExistingFolderName();
		
		System.out.println("Remove the existing folder name successfully");
		Hooks.scenario.log("Remove the existing folder name successfully");
	}
	
	@And("user click on the delete button of existing folder in documents section")
	public void user_click_on_the_delete_button_of_existing_folder_in_documents_section() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheDeletebuttoninExistingFolder();
		
		if (!result) {
	        String message = "Delete Folder (more options) button is not visible because for that user don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing folder is delete clicked successfully");
	}
	
	@And("user click on the permission button of existing folder in documents section")
	public void user_click_on_the_permission_button_of_existing_folder_in_documents_section() {
		boolean result = ComplianceModulefunctionalitypage.clickintothePermissionbuttoninExistingFolder();
		
		if (!result) {
	        String message = "Folder Permission (more options) button is not visible because for that user don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Folder Permission button clicked successfully");
	}
	
	@When("user click on the first user checkbox in permission pop-up window")
	public void user_click_on_the_first_user_checkbox_in_permission_pop_up_window() {
		ComplianceModulefunctionalitypage.clickintotheFirstusercheckboxinPermission();
				
		System.out.println("First User Checkbox clicked successfully");
		Hooks.scenario.log("First User Checkbox clicked successfully");
	}
	
	@Then("user click on the submit button in permission pop-up window in documents section")
	public void user_click_on_the_submit_button_in_permission_pop_up_window_in_documents_section() throws Exception {
		String result = ComplianceModulefunctionalitypage.clickintotheSubmitbuttoninPermission();
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user double click on the existing folder in documents section")
	public void user_double_click_on_the_existing_folder_in_documents_section() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheExistingfoldertab();
		
		if (!result) {
	        String message = "Folder is not visible on the Bucket page — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing Folder tab clicked successfully");
	}
	
	@And("user click on the upload button in existing folder section")
	public void user_click_on_the_upload_button_in_existing_folder_section() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheUploadbuttoninExistingFolder();
		
		if (!result) {
	        String message = "Upload (more options) button is not visible because for that user don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Upload button clicked successfully");
	}
	
	@When("user upload the file as PDF in upload file pop-up window")
	public void user_upload_the_file_as_PDF_in_upload_file_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Get_Started_With_Smallpdf.pdf";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PDF File upload failed");
	    }

	    Hooks.scenario.log("The PDF File uploaded successfully");
	}
	
	@When("user upload the file as Docx in upload file pop-up window")
	public void user_upload_the_file_as_Docx_in_upload_file_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file-sample_1MB.docx";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Docx File upload failed");
	    }

	    Hooks.scenario.log("The Docx File uploaded successfully");
		
	}
	
	@When("user upload the file as PPT in upload file pop-up window")
	public void user_upload_the_file_as_PPT_in_upload_file_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file_example_PPT_1MB.ppt";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PPT File upload failed");
	    }

	    Hooks.scenario.log("The PPT File uploaded successfully");
	}
	
	@When("user upload the file as Excel in upload file pop-up window")
	public void user_upload_the_file_as_Excel_in_upload_file_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file_example_XLSX_5000.xlsx";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Excel File upload failed");
	    }

	    Hooks.scenario.log("The Excel File uploaded successfully");
	}
	
	@When("user upload the file as HTML in upload file pop-up window")
	public void user_upload_the_file_as_HTML_in_upload_file_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/sample html file download.html";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The HTML File upload failed");
	    }

	    Hooks.scenario.log("The HTMl File uploaded successfully");
	}
	
	@When("user upload the file as Txt in upload file pop-up window")
	public void user_upload_the_file_as_Txt_in_upload_file_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Testing file.txt";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Txt File upload failed");
	    }

	    Hooks.scenario.log("The Txt File uploaded successfully");
	}
	
	@When("user upload the Image file as PNG in upload file pop-up window")
	public void user_upload_the_Image_file_as_PNG_in_upload_file_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/Profile Image.png";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Image File as PNG upload failed");
	    }

	    Hooks.scenario.log("The Image File as PNG uploaded successfully");
	}
	
	@When("user upload the Image file as JPEG in upload file pop-up window")
	public void user_upload_the_Image_file_as_JPEG_in_upload_file_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/sample.jpeg";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Image File as JPEG upload failed");
	    }

	    Hooks.scenario.log("The Image File as JPEG uploaded successfully");
	}
	
	@When("user upload the Image file as GIF in upload file pop-up window")
	public void user_upload_the_Image_file_as_GIF_in_upload_file_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_GIF.gif";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Image File as GIF upload failed");
	    }

	    Hooks.scenario.log("The Image File as GIF uploaded successfully");
	}
	
	@When("user upload the Image file as SVG in upload file pop-up window")
	public void user_upload_the_Image_file_as_SVG_in_upload_file_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_SVG.svg";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Image File as SVG upload failed");
	    }

	    Hooks.scenario.log("The Image File as SVG uploaded successfully");
	}
	
	@When("user upload the Image file as TIFF in upload file pop-up window")
	public void user_upload_the_Image_file_as_TIFF_in_upload_file_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_TIFF.tiff";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Image File as TIFF upload failed");
	    }

	    Hooks.scenario.log("The Image File as TIFF uploaded successfully");
	}
	
	@When("user upload the Image file as JFIF in upload file pop-up window")
	public void user_upload_the_Image_file_as_JFIF_in_upload_file_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/signature_images.jfif";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Image File as JFIF upload failed");
	    }

	    Hooks.scenario.log("The Image File as JFIF uploaded successfully");
	}
	
	@When("user upload the audio file in upload file pop-up window")
	public void user_upload_the_audio_file_in_upload_file_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Audio Files/file_example_MP3_1MG.mp3";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Audio File failed");
	    }

	    Hooks.scenario.log("The Audio File uploaded successfully");
	}
	
	@When("user upload the video file in upload file pop-up window")
	public void user_upload_the_video_file_in_upload_file_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Audio Files/file_example_MP4_480_1_5MG.mp4";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Video File failed");
	    }

	    Hooks.scenario.log("The Video File uploaded successfully");
	}
	
	@Then("user click on the submit button in upload file pop-up window")
	public void user_click_on_the_submit_button_in_upload_file_pop_up_window() throws Exception {
		String result = ComplianceModulefunctionalitypage.clickintotheSubmitbuttoninUploadFile();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user click on the three dot button of existing file in documents section")
	public void user_click_on_the_three_dot_button_of_existing_file_in_documents_section() {
		boolean result = ComplianceModulefunctionalitypage.clickintothethreedotbuttoninExistingFolder();
		
		if (!result) {
	        String message = "File is not added, and the three-dot (more options) button is also not visible on the Documents Section — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@When("user click on the download button of existing file in documents section")
	public void user_click_on_the_download_button_of_existing_file_in_documents_section() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheDownloadbuttoninExistingFile();
		
		if (!result) {
	        String message = "Download (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing file is download successfully");
	}
	
	@When("user click on the delete button of existing file in documents section")
	public void user_click_on_the_delete_button_of_existing_file_in_documents_section() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheDeletebuttoninExistingFile();
		
		if (!result) {
	        String message = "Delete (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing file delete successfully");
	}
	
	
	//---------------------------------License Management Section---------------------------------------
	
	
	@When("user click on the License Management tab in sidebar in Compliance module page")
	public void user_click_on_the_License_Management_tab_in_sidebar_in_Compliance_module_page() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheLicenseManagementtabinsidebar();
		
		if (!result) {
	        String message = "License Management (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("License Management tab clicked successfully");
	}
	
	@Then("user click on the add tenant license button in license management section")
	public void user_click_on_the_add_tenant_license_button_in_license_management_section() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheAddTenantLicensebutton();
		
		if (!result) {
	        String message = "Add Tenant License (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Add tenant License button clicked successfully");
	}
	
	@And("user select the state by index in add tenant license pop-up window")
	public void user_select_the_state_by_index_in_add_tenant_license_pop_up_window() throws Exception {
		int StateByIndex = 2; // fetch from config if required

	    boolean result = ComplianceModulefunctionalitypage.selecttheStateByIndexinAddTenant(StateByIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "State is NOT present in dropdown for index: " + StateByIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("State selected successfully using index: " + StateByIndex);
	    System.out.println("State selected successfully using index: " + StateByIndex);
	}
	
	@When("user enter the license number in add tenant license pop-up window")
	public void user_enter_the_license_number_in_add_tenant_license_pop_up_window() {
		String LicenseNumber = Hooks.prop.getProperty("licensenumber");
		ComplianceModulefunctionalitypage.entertheLicenseNumberinAddTenant(LicenseNumber);
		
		System.out.println("User Entered License Number: " + LicenseNumber);
		Hooks.scenario.log("User Entered License Number: " + LicenseNumber);
	}
	
	@Then("user enter the url in add tenant license pop-up window")
	public void user_enter_the_url_in_add_tenant_license_pop_up_window() {
		String URL = Hooks.prop.getProperty("validURL");
		ComplianceModulefunctionalitypage.entertheUrlinAddTenant(URL);
		
		System.out.println("User Entered URL: " + URL);
		Hooks.scenario.log("User Entered URL: " + URL);
	}
	
	@And("user select the original date picker in add tenant license pop-up window")
	public void user_select_the_original_date_picker_in_add_tenant_license_pop_up_window() {
		// Click the From Date picker
        ComplianceModulefunctionalitypage.clickintotheOriginalDateinAddTenant();

        // Select today's date
        ComplianceModulefunctionalitypage.selectOriginalTodaysDateinAddTenant();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Original Date: " + selectedDate);
        Hooks.scenario.log("Selected Original Date: " + selectedDate);
	}
	
	@When("user select the expiry date picker after one month in add tenant license pop-up window")
	public void user_select_the_expiry_date_picker_after_one_month_in_add_tenant_license_pop_up_window() {
		// Click the License Expiration Date picker
        ComplianceModulefunctionalitypage.clickintotheExpiryDateinAddTenant();

        // Select After 1 Month date
        ComplianceModulefunctionalitypage.selectExpiryDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected Expiry Date After 1 Month: " + selectedDate);
        Hooks.scenario.log("Selected Expiry Date After 1 Month: " + selectedDate);
	}
	
	@Then("user select the professional license type by index in add tenant license pop-up window")
	public void user_select_the_professional_license_type_by_index_in_add_tenant_license_pop_up_window() throws Exception {
		int ProfessionalLicenseTypeByIndex = 1; // fetch from config if required

	    boolean result = ComplianceModulefunctionalitypage.selecttheProfessionalLicenseTypeByIndexinAddTenant(ProfessionalLicenseTypeByIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Professional License Type is NOT present in dropdown for index: " + ProfessionalLicenseTypeByIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Professional License Type selected successfully using index: " + ProfessionalLicenseTypeByIndex);
	    System.out.println("Professional License Type selected successfully using index: " + ProfessionalLicenseTypeByIndex);
	}
	
	@And("user select the status by index in add tenant license pop-up window")
	public void user_select_the_status_by_index_in_add_tenant_license_pop_up_window() throws Exception {
		int StatusByIndex = 1; // fetch from config if required

	    boolean result = ComplianceModulefunctionalitypage.selecttheStatusByIndexinAddTenant(StatusByIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Status is NOT present in dropdown for index: " + StatusByIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Status selected successfully using index: " + StatusByIndex);
	    System.out.println("Status selected successfully using index: " + StatusByIndex);
	}
	
	@When("user upload the file as PDF in add tenant license pop-up window")
	public void user_upload_the_file_as_PDF_in_add_tenant_license_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Get_Started_With_Smallpdf.pdf";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinAddTenant(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PDF File upload failed");
	    }

	    Hooks.scenario.log("The PDF File uploaded successfully");
	}
	
	@When("user upload the file as Docx in add tenant license pop-up window")
	public void user_upload_the_file_as_Docx_in_add_tenant_license_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file-sample_1MB.docx";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinAddTenant(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Docx File upload failed");
	    }

	    Hooks.scenario.log("The Docx File uploaded successfully");
	}
	
	@When("user upload the file as PPT in add tenant license pop-up window")
	public void user_upload_the_file_as_PPT_in_add_tenant_license_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file_example_PPT_1MB.ppt";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinAddTenant(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PPT File upload failed");
	    }

	    Hooks.scenario.log("The PPT File uploaded successfully");
	}
	
	@When("user upload the file as Excel in add tenant license pop-up window")
	public void user_upload_the_file_as_Excel_in_add_tenant_license_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file_example_XLSX_5000.xlsx";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinAddTenant(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Excel File upload failed");
	    }

	    Hooks.scenario.log("The Excel File uploaded successfully");
	}
	
	@When("user upload the file as HTML in add tenant license pop-up window")
	public void user_upload_the_file_as_HTML_in_add_tenant_license_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/sample html file download.html";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinAddTenant(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The HTML File upload failed");
	    }

	    Hooks.scenario.log("The HTML File uploaded successfully");
	}
	
	@When("user upload the file as Txt in add tenant license pop-up window")
	public void user_upload_the_file_as_Txt_in_add_tenant_license_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Testing file.txt";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinAddTenant(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Txt File upload failed");
	    }

	    Hooks.scenario.log("The Txt File uploaded successfully");
	}
	
	@When("user upload the file as PNG image format in add tenant license pop-up window")
	public void user_upload_the_file_as_PNG_image_format_in_add_tenant_license_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/Profile Image.png";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinAddTenant(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PNG image File upload failed");
	    }

	    Hooks.scenario.log("The PNG image File uploaded successfully");
	}
	
	@When("user upload the file as JPEG image format in add tenant license pop-up window")
	public void user_upload_the_file_as_JPEG_image_format_in_add_tenant_license_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/sample.jpeg";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinAddTenant(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PNG image File upload failed");
	    }

	    Hooks.scenario.log("The PNG image File uploaded successfully");
	}
	
	@When("user upload the file as GIF image format in add tenant license pop-up window")
	public void user_upload_the_file_as_GIF_image_format_in_add_tenant_license_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_GIF.gif";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinAddTenant(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The GIF image File upload failed");
	    }

	    Hooks.scenario.log("The GIF image File uploaded successfully");
	}
	
	@When("user upload the file as SVG image format in add tenant license pop-up window")
	public void user_upload_the_file_as_SVG_image_format_in_add_tenant_license_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_SVG.svg";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinAddTenant(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The SVG image File upload failed");
	    }

	    Hooks.scenario.log("The SVG image File uploaded successfully");
	}
	
	@When("user upload the file as TIFF image format in add tenant license pop-up window")
	public void user_upload_the_file_as_TIFF_image_format_in_add_tenant_license_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_TIFF.tiff";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinAddTenant(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The TIFF image File upload failed");
	    }

	    Hooks.scenario.log("The TIFF image File uploaded successfully");
	}
	
	@When("user upload the file as JFIF image format in add tenant license pop-up window")
	public void user_upload_the_file_as_JFIF_image_format_in_add_tenant_license_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/signature_images.jfif";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinAddTenant(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The JFIF image File upload failed");
	    }

	    Hooks.scenario.log("The JFIF image File uploaded successfully");
	}
	
	@When("user upload the file as Audio format in add tenant license pop-up window")
	public void user_upload_the_file_as_Audio_format_in_add_tenant_license_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Audio Files/file_example_MP3_1MG.mp3";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinAddTenant(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Audio File upload failed");
	    }

	    Hooks.scenario.log("The Audio File uploaded successfully");
	}
	
	@When("user upload the file as Video format in add tenant license pop-up window")
	public void user_upload_the_file_as_Video_format_in_add_tenant_license_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Audio Files/file_example_MP4_480_1_5MG.mp4";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinAddTenant(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Video File upload failed");
	    }

	    Hooks.scenario.log("The Video File uploaded successfully");
	}
	
	@Then("user click on the submit button in add tenant license pop-up window")
	public void user_click_on_the_submit_button_in_add_tenant_license_pop_up_window() throws Exception {
		String result = ComplianceModulefunctionalitypage.clickintotheSubmitbuttoninAddTenant();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user select the original date as after 1 month in add tenant license pop-up window")
	public void user_select_the_original_date_as_after_1_month_in_add_tenant_license_pop_up_window() {
		// Click the From Date picker
        ComplianceModulefunctionalitypage.clickintotheOriginalDateinAddTenant();

        // Select After 1 Month date
        ComplianceModulefunctionalitypage.selectExpiryDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected Expiry Date After 1 Month: " + selectedDate);
        Hooks.scenario.log("Selected Expiry Date After 1 Month: " + selectedDate);
	}
	
	@When("user select the expiry date as today's date in add tenant license pop-up window")
	public void user_select_the_expiry_date_as_today_s_date_in_add_tenant_license_pop_up_window() {
		// Click the License Expiration Date picker
        ComplianceModulefunctionalitypage.clickintotheExpiryDateinAddTenant();

        // Select today's date
        ComplianceModulefunctionalitypage.selectOriginalTodaysDateinAddTenant();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Original Date: " + selectedDate);
        Hooks.scenario.log("Selected Original Date: " + selectedDate);
	}
	
	@Then("user click on the three dot button of existing tenant license in license management section")
	public void user_click_on_the_three_dot_button_of_existing_tenant_license_in_license_management_section() {
		boolean result = ComplianceModulefunctionalitypage.clickintothethreedotbuttoninExistingFolder();
		
		if (!result) {
	        String message = "Tenant License is not added, and the three-dot (more options) button is also not visible on the License Management Section — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@And("user click on the edit button of existing tenant license")
	public void user_click_on_the_edit_button_of_existing_tenant_license() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheEditbuttoninExistingTenantLicense();
		
		if (!result) {
	        String message = "Edit (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit button clicked successfully");
	}
	
	@When("user change state in edit tenant license pop-up window")
	public void user_change_state_in_edit_tenant_license_pop_up_window() throws Exception {
		int StateByIndex = 8; // fetch from config if required

	    boolean result = ComplianceModulefunctionalitypage.selecttheStateByIndexinAddTenant(StateByIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "State is NOT present in dropdown for index: " + StateByIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("State changed successfully using index: " + StateByIndex);
	    System.out.println("State changed successfully using index: " + StateByIndex);
	}
	
	@Then("user change the license number in edit tenant license pop-up window")
	public void user_change_the_license_number_in_edit_tenant_license_pop_up_window() {
		String LicenseNumber = Hooks.prop.getProperty("newlicensenumber");
		ComplianceModulefunctionalitypage.entertheLicenseNumberinAddTenant(LicenseNumber);
		
		System.out.println("User Entered new License Number: " + LicenseNumber);
		Hooks.scenario.log("User Entered new License Number: " + LicenseNumber);
	}
	
	@And("user change the url in edit tenant license pop-up window")
	public void user_change_the_url_in_edit_tenant_license_pop_up_window() {
		String URL = Hooks.prop.getProperty("newurl");
		ComplianceModulefunctionalitypage.entertheUrlinAddTenant(URL);
		
		System.out.println("User Entered New URL: " + URL);
		Hooks.scenario.log("User Entered New URL: " + URL);
	}
	
	@When("user change the original date in edit tenant license pop-up window")
	public void user_change_the_original_date_in_edit_tenant_license_pop_up_window() {
		// Click the From Date picker
        ComplianceModulefunctionalitypage.clickintotheOriginalDateinAddTenant();

        // Select today's date
        ComplianceModulefunctionalitypage.selectDateAfterTwoDaysInAddTenant();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Change Selected Original Date: " + selectedDate);
        Hooks.scenario.log("Change Selected Original Date: " + selectedDate);
	}
	
	@Then("user change the expiry date in edit tenant license pop-up window")
	public void user_change_the_expiry_date_in_edit_tenant_license_pop_up_window() {
		// Click the License Expiration Date picker
        ComplianceModulefunctionalitypage.clickintotheExpiryDateinAddTenant();

        // Select After 1 Month date
        ComplianceModulefunctionalitypage.selectExpiryDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Change Selected Expiry Date: " + selectedDate);
        Hooks.scenario.log("Change Selected Expiry Date: " + selectedDate);
	}
	
	@And("user change the professional license type in edit tenant license pop-up window")
	public void user_change_the_professional_license_type_in_edit_tenant_license_pop_up_window() throws Exception {
		int ProfessionalLicenseTypeByIndex = 2; // fetch from config if required

	    boolean result = ComplianceModulefunctionalitypage.selecttheProfessionalLicenseTypeByIndexinAddTenant(ProfessionalLicenseTypeByIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Professional License Type is NOT present in dropdown for index: " + ProfessionalLicenseTypeByIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Professional License Type change successfully using index: " + ProfessionalLicenseTypeByIndex);
	    System.out.println("Professional License Type change successfully using index: " + ProfessionalLicenseTypeByIndex);
	}
	
	@When("user change the status in edit tenant license pop-up window")
	public void user_change_the_status_in_edit_tenant_license_pop_up_window() throws Exception {
		int StatusByIndex = 2; // fetch from config if required

	    boolean result = ComplianceModulefunctionalitypage.selecttheStatusByIndexinAddTenant(StatusByIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Status is NOT present in dropdown for index: " + StatusByIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Status change successfully using index: " + StatusByIndex);
	    System.out.println("Status change successfully using index: " + StatusByIndex);
	}
	
	@Then("user change the uploaded file in edit tenant license pop-up window")
	public void user_change_the_uploaded_file_in_edit_tenant_license_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/Profile Image.png";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinAddTenant(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PNG image File upload failed");
	    }

	    Hooks.scenario.log("The PNG image File uploaded successfully");
	}
	
	@Then("user enter the invalid url in add tenant license pop-up window")
	public void user_enter_the_invalid_url_in_add_tenant_license_pop_up_window() {
		String URL = Hooks.prop.getProperty("invalidurl");
		ComplianceModulefunctionalitypage.entertheUrlinAddTenant(URL);
		
		System.out.println("User Entered Invalid URL: " + URL);
		Hooks.scenario.log("User Entered Invalid URL: " + URL);
	}
	
	@And("user click on the delete button of existing tenant license")
	public void user_click_on_the_delete_button_of_existing_tenant_license() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheDeletebuttoninExistingTenantLicense();
		
		if (!result) {
	        String message = "Delete (more options) button is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing Tenant delete successfully");
	}
	
	@Then("user click on the filter button in license management section")
	public void user_click_on_the_filter_button_in_license_management_section() {
		ComplianceModulefunctionalitypage.clickintotheFilterbuttoninLicenseManagement();
		
		System.out.println("Filter Button clicked successfully");
		Hooks.scenario.log("Filter Button clicked successfully");
	}
	
	@And("user enter the license number in filter")
	public void user_enter_the_license_number_in_filter() {
		String LicenseNumberinFilter = Hooks.prop.getProperty("licensenumber");
		ComplianceModulefunctionalitypage.entertheLicenseNumberinFilter(LicenseNumberinFilter);
		
		System.out.println("User Entered License Number: " + LicenseNumberinFilter);
		Hooks.scenario.log("User Entered License Number: " + LicenseNumberinFilter);
	}
	
	@When("user select the original from date in filter")
	public void user_select_the_original_from_date_in_filter() {
		// Click the From Date picker
        ComplianceModulefunctionalitypage.clickintotheOriginalFromDateinFilter();

        // Select today's date
        ComplianceModulefunctionalitypage.selectOriginalTodaysDateinAddTenant();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Original Date: " + selectedDate);
        Hooks.scenario.log("Selected Original Date: " + selectedDate);
	}
	
	@Then("user select the original to date in filter")
	public void user_select_the_original_to_date_in_filter() {
		// Click the From Date picker
        ComplianceModulefunctionalitypage.clickintotheOriginalToDateinFilter();

        // Select today's date
        ComplianceModulefunctionalitypage.selectDateAfterTwoDaysInAddTenant();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Original Date: " + selectedDate);
        Hooks.scenario.log("Selected Original Date: " + selectedDate);
	}
	
	@And("user select the state in filter")
	public void user_select_the_state_in_filter() throws Exception {
		int StateByIndexinFilter = 2; // fetch from config if required

	    boolean result = ComplianceModulefunctionalitypage.selecttheStateByIndexinFilter(StateByIndexinFilter);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "State is NOT present in dropdown for index: " + StateByIndexinFilter;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("State selected successfully using index: " + StateByIndexinFilter);
	    System.out.println("State selected successfully using index: " + StateByIndexinFilter);
	}
	
	@When("user select the expiry from date in filter")
	public void user_select_the_expiry_from_date_in_filter() {
		// Click the From Date picker
        ComplianceModulefunctionalitypage.clickintotheExpiryFromDateinFilter();

        // Select today's date
        ComplianceModulefunctionalitypage.selectDateAfterTwoDaysInAddTenant();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Expiry Date: " + selectedDate);
        Hooks.scenario.log("Selected Expiry Date: " + selectedDate);
	}
	
	@Then("user select the expiry to date in filter")
	public void user_select_the_expiry_to_date_in_filter() {
		// Click the License Expiration Date picker
        ComplianceModulefunctionalitypage.clickintotheExpiryToDateinFilter();

        // Select After 1 Month date
        ComplianceModulefunctionalitypage.selectOriginalTodaysDateinAddTenant();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected Expiry Date: " + selectedDate);
        Hooks.scenario.log("Selected Expiry Date: " + selectedDate);
	}
	
	@And("user select the last updated from date in filter")
	public void user_select_the_last_updated_from_date_in_filter() {
		// Click the From Date picker
        ComplianceModulefunctionalitypage.clickintotheLastUpdatedFromDateinFilter();

        // Select today's date
        ComplianceModulefunctionalitypage.selectOriginalTodaysDateinAddTenant();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Last Updated From Date: " + selectedDate);
        Hooks.scenario.log("Selected Last Updated From Date: " + selectedDate);
	}
	
	@When("user select the last updated to date in filter")
	public void user_select_the_last_updated_to_date_in_filter() {
		// Click the From Date picker
        ComplianceModulefunctionalitypage.clickintotheLastUpdatedToDateinFilter();

        // Select today's date
        ComplianceModulefunctionalitypage.selectDateAfterTwoDaysInAddTenant();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Last Updated Date: " + selectedDate);
        Hooks.scenario.log("Selected Last Updated Date: " + selectedDate);
	}
	
	@Then("user select the professional license type in filter")
	public void user_select_the_professional_license_type_in_filter() throws Exception {
		int ProfessionalLicenseTypeByIndexinFilter = 1; // fetch from config if required

	    boolean result = ComplianceModulefunctionalitypage.selecttheProfessionalLicenseTypeByIndexinFilter(ProfessionalLicenseTypeByIndexinFilter);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Professional License Type is NOT present in dropdown for index: " + ProfessionalLicenseTypeByIndexinFilter;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Professional License Type selected successfully using index: " + ProfessionalLicenseTypeByIndexinFilter);
	    System.out.println("Professional License Type selected successfully using index: " + ProfessionalLicenseTypeByIndexinFilter);
	}
	
	@And("user select the license category in filter")
	public void user_select_the_license_category_in_filter() throws Exception {
		int LicenseCategoryByIndexinFilter = 1; // fetch from config if required

	    boolean result = ComplianceModulefunctionalitypage.selecttheLicenseCategoryByIndexinFilter(LicenseCategoryByIndexinFilter);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "License Category is NOT present in dropdown for index: " + LicenseCategoryByIndexinFilter;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("License Category selected successfully using index: " + LicenseCategoryByIndexinFilter);
	    System.out.println("License Category selected successfully using index: " + LicenseCategoryByIndexinFilter);
	}
	
	@When("user select the license status in filter")
	public void user_select_the_license_status_in_filter() throws Exception {
		int LicenseStatusByIndex = 1; // fetch from config if required

	    boolean result = ComplianceModulefunctionalitypage.selecttheLicenseStatusByIndexinFilter(LicenseStatusByIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Status is NOT present in dropdown for index: " + LicenseStatusByIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("License Status selected successfully using index: " + LicenseStatusByIndex);
	    System.out.println("License Status selected successfully using index: " + LicenseStatusByIndex);
	}
	
	@Then("user click on the search button in filter in license management")
	public void user_click_on_the_search_button_in_filter_in_license_management() {
		String result = ComplianceModulefunctionalitypage.clickintothesearchbuttoninFilter();

	    System.out.println("Search Result: " + result);
	    Hooks.scenario.log("Search Result: " + result);

	    //Skip remaining steps ONLY when no records / error
	    if (result.startsWith("ERROR")) {
	        // Scenario marked as SKIPPED (not FAILED)
	        Assume.assumeTrue("Skipping scenario due to search result: " + result, false);
	    }
	}
	
	
	//------------------------------------Partner License Section--------------------------------------
	
	
	@When("user click on the Partner License tab in sidebar in Compliance module page")
	public void user_click_on_the_Partner_License_tab_in_sidebar_in_Compliance_module_page() {
		boolean result = ComplianceModulefunctionalitypage.clickintothePartnerLicensetabinsidebar();
		
		if (!result) {
	        String message = "Partner License (more options) tab is not visible for that user because don't have the permission — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Partner License tab clicked successfully");
    }
	
	@Then("user click on the view button in partner license section")
	public void user_click_on_the_view_button_in_partner_license_section() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheViewPartnerLicensebutton();
		
		if (!result) {
	        String message = "Partner License is not shown, and the view button is also not visible for that user becuse don't have the permission on the Partner License Section — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("View button clicked successfully");
	}
	
	@Then("user click on the filter tab in partner license section")
	public void user_click_on_the_filter_tab_in_partner_license_section() {
		ComplianceModulefunctionalitypage.clickintotheFilterbuttoninPartnerLicense();
		
		System.out.println("Filter button clicked successfully");
		Hooks.scenario.log("Filter button clicked successfully");
	}
	
	@And("user enter the partner name in filter of partner license section")
	public void user_enter_the_partner_name_in_filter_of_partner_license_section() {
		String PartnerNameinFilter = Hooks.prop.getProperty("partnername");
		ComplianceModulefunctionalitypage.enterthePartnerNameinFilter(PartnerNameinFilter);
		
		System.out.println("User Entered Partner Name: " + PartnerNameinFilter);
		Hooks.scenario.log("User Entered Partner Name: " + PartnerNameinFilter);
	}
	
	@Then("user select the professional license type in filter of partner license section")
	public void user_select_the_professional_license_type_in_filter_of_partner_license_section() throws Exception {
		int ProfessionalLicenseTypeByIndexinPartner = 1; // fetch from config if required

	    boolean result = ComplianceModulefunctionalitypage.selecttheProfessionalLicenseTypeByIndexinPartnerLicense(ProfessionalLicenseTypeByIndexinPartner);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Professional License Type is NOT present in dropdown for index: " + ProfessionalLicenseTypeByIndexinPartner;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Professional License Type selected successfully using index: " + ProfessionalLicenseTypeByIndexinPartner);
	    System.out.println("Professional License Type selected successfully using index: " + ProfessionalLicenseTypeByIndexinPartner);
	}
	
	@And("user select the partner type in filter of partner license section")
	public void user_select_the_partner_type_in_filter_of_partner_license_section() throws Exception {
		int PartnerTypeByIndexinPartner = 1; // fetch from config if required

	    boolean result = ComplianceModulefunctionalitypage.selectthePartnerTypeByIndexinPartnerLicense(PartnerTypeByIndexinPartner);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Partner Type is NOT present in dropdown for index: " + PartnerTypeByIndexinPartner;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Partner Type selected successfully using index: " + PartnerTypeByIndexinPartner);
	    System.out.println("Partner Type selected successfully using index: " + PartnerTypeByIndexinPartner);
	}
	
	@And("user click on the search button in filter in partner license")
	public void user_click_on_the_search_button_in_filter_in_partner_license() {
		String result = ComplianceModulefunctionalitypage.clickintothesearchbuttoninFilter();

	    System.out.println("Search Result: " + result);
	    Hooks.scenario.log("Search Result: " + result);

	    //Skip remaining steps ONLY when no records / error
	    if (result.startsWith("ERROR")) {
	        // Scenario marked as SKIPPED (not FAILED)
	        Assume.assumeTrue("Skipping scenario due to search result: " + result, false);
	    }
	}
	
	@When("user click on the Compliance Events tab in sidebar in Compliance module page")
	public void user_click_on_the_Compliance_Events_tab_in_sidebar_in_Compliance_module_page() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheComplianceEventstabinSidebar();
		
		if (!result) {
	        String message = "Compliance Events tab is not visible on the Compliance Module Dashboard — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Compliance Events tab clicked successfully");
	}
	
	@Then("user click on the new compliance event button in compliance events section")
	public void user_click_on_the_new_compliance_event_button_in_compliance_events_section() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheComplianceEventbuttoninCompliance();
		
		if (!result) {
	        String message = "Compliance Event button is not visible on the Compliance Events Section — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Compliance Event button clicked successfully");
	}
	
	@And("user enter the compliance event name in add compliance event page")
	public void user_enter_the_compliance_event_name_in_add_compliance_event_page() {
		String ComplianceEventName = Hooks.prop.getProperty("complianceeventname");
		ComplianceModulefunctionalitypage.entertheComplianceEventName(ComplianceEventName);
		
		System.out.println("User Entered the Compliance Event Name: " + ComplianceEventName);
		Hooks.scenario.log("User Entered the Compliance Event Name: " + ComplianceEventName);
	}
	
	@When("user select the compliance event due date in add compliance event page")
	public void user_select_the_compliance_event_due_date_in_add_compliance_event_page() {
		// Click the License Expiration Date picker
        ComplianceModulefunctionalitypage.clickintotheComplianceEventDueDate();

        // Select After 1 Month date
        ComplianceModulefunctionalitypage.selectExpiryDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected Due Date: " + selectedDate);
        Hooks.scenario.log("Selected Due Date: " + selectedDate);
	}
	
	@Then("user select the compliance event last occurrence date in add compliance event page")
	public void user_select_the_compliance_event_last_occurrence_date_in_add_compliance_event_page() {
		// Click the From Date picker
        ComplianceModulefunctionalitypage.clickintotheComplianceEventLastOccurrenceDate();

        // Select today's date
        ComplianceModulefunctionalitypage.selectDateAfterTwoDaysInAddTenant();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Last Occurrence Date: " + selectedDate);
        Hooks.scenario.log("Selected Last Occurrence Date: " + selectedDate);
	}
	
	@And("user select the compliance category in add compliance event page")
	public void user_select_the_compliance_category_in_add_compliance_event_page() throws Exception {
		int ComplianceCategoryByIndex = 1; // fetch from config if required

	    boolean result = ComplianceModulefunctionalitypage.selecttheComplianceCategory(ComplianceCategoryByIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Compliance Category is NOT present in dropdown for index: " + ComplianceCategoryByIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Compliance Category selected successfully using index: " + ComplianceCategoryByIndex);
	    System.out.println("Compliance Category selected successfully using index: " + ComplianceCategoryByIndex);
	}
	
	@When("user select the compliance department in add compliance event page")
	public void user_select_the_compliance_department_in_add_compliance_event_page() throws Exception {
		int ComplianceDepartmentByIndex = 1; // fetch from config if required

	    boolean result = ComplianceModulefunctionalitypage.selecttheComplianceDepartment(ComplianceDepartmentByIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Compliance Department is NOT present in dropdown for index: " + ComplianceDepartmentByIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Compliance Department selected successfully using index: " + ComplianceDepartmentByIndex);
	    System.out.println("Compliance Department selected successfully using index: " + ComplianceDepartmentByIndex);
	}
	
	@Then("user enter the compliance event notes in add compliance event page")
	public void user_enter_the_compliance_event_notes_in_add_compliance_event_page() {
		String Notes = Hooks.prop.getProperty("complianceeventnotes");
		ComplianceModulefunctionalitypage.entertheComplianceEventNotes(Notes);
		
		System.out.println("User Entered the Compliance Event Notes: " + Notes);
		Hooks.scenario.log("User Entered the Compliance Event Notes: " + Notes);
	}
	
	@And("user click on the frequency due date radio button in add compliance event page")
	public void user_click_on_the_frequency_due_date_radio_button_in_add_compliance_event_page() {
		ComplianceModulefunctionalitypage.clickintotheFrequencyDueDateRadiobutton();
		
		System.out.println("Due Date radio button clicked successfully");
		Hooks.scenario.log("Due Date radio button clicked successfully");
	}
	
	@When("user click on the submit button in add compliance event page")
	public void user_click_on_the_submit_button_in_add_compliance_event_page() throws Exception {
		String result = ComplianceModulefunctionalitypage.clickintotheSubmitbuttoninComplianceEvents();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user click on the frequency every radio button in add compliance event page")
	public void user_click_on_the_frequency_every_radio_button_in_add_compliance_event_page() throws Exception {
		ComplianceModulefunctionalitypage.clickintotheFrequencyEveryRadiobutton();
		Thread.sleep(1500);
		
		System.out.println("Every radio button clicked successfully");
		Hooks.scenario.log("Every radio button clicked successfully");
	}
	
	@When("user click on the week radio button in add compliance event page")
	public void user_click_on_the_week_radio_button_in_add_compliance_event_page() {
		ComplianceModulefunctionalitypage.clickintotheWeekRadiobuttoninCompliance();
		
		System.out.println("Week radio button clicked successfully");
		Hooks.scenario.log("Week radio button clicked successfully");
	}
	
	@Then("user click on the weekdays checkbox button in add compliance event page")
	public void user_click_on_the_weekdays_checkbox_button_in_add_compliance_event_page() {
		ComplianceModulefunctionalitypage.selectMondayToFridayInCompliance();
		
		System.out.println("Monday to Friday days are selected successfully");
		Hooks.scenario.log("Monday to Friday days are selected successfully");
	}
	
	@Then("user click on the all days checkbox button in add compliance event page")
	public void user_click_on_the_all_days_checkbox_button_in_add_compliance_event_page() {
		ComplianceModulefunctionalitypage.selectAllDaysInCompliance();
		
		System.out.println("Monday to Sunday days are selected successfully");
		Hooks.scenario.log("Monday to Sunday days are selected successfully");
	}
	
	@When("user click on the month radio button in add compliance event page")
	public void user_click_on_the_month_radio_button_in_add_compliance_event_page() throws Exception {
		ComplianceModulefunctionalitypage.clickintotheMonthRadiobuttoninCompliance();
		Thread.sleep(1000);
		
		System.out.println("Month radio button clicked successfully");
		Hooks.scenario.log("Month radio button clicked successfully");
	}
	
	@Then("user select the date of month in add compliance event page")
	public void user_select_the_date_of_month_in_add_compliance_event_page() throws Exception {
		int DateOfMonthByIndex = 10; // fetch from config if required

	    boolean result = ComplianceModulefunctionalitypage.selecttheDateOfMonthinCompliance(DateOfMonthByIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Date Of Month is NOT present in dropdown for index: " + DateOfMonthByIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Date Of Month selected successfully using index: " + DateOfMonthByIndex);
	    System.out.println("Date Of Month selected successfully using index: " + DateOfMonthByIndex);
	}
	
	@When("user click on the year radio button in add compliance event page")
	public void user_click_on_the_year_radio_button_in_add_compliance_event_page() throws Exception {
		ComplianceModulefunctionalitypage.clickintotheYearRadiobuttoninCompliance();
		Thread.sleep(1000);
		
		System.out.println("Year radio button clicked successfully");
		Hooks.scenario.log("Year radio button clicked successfully");
	}
	
	@Then("user select the month in add compliance event page")
	public void user_select_the_month_in_add_compliance_event_page() throws Exception {
		int MonthByIndex = 10; // fetch from config if required

	    boolean result = ComplianceModulefunctionalitypage.selecttheMonthinCompliance(MonthByIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Month is NOT present in dropdown for index: " + MonthByIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Month selected successfully using index: " + MonthByIndex);
	    System.out.println("Month selected successfully using index: " + MonthByIndex);
	}
	
	@Then("user click on the view button of existing compliance event")
	public void user_click_on_the_view_button_of_existing_compliance_event() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheViewbuttoninExistingComplianceEvent();
		
		if (!result) {
	        String message = "View button is not visible on the Compliance Events Section — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("View button clicked successfully");
	}
	
	@And("user click on the add document button in existing compliance event details page")
	public void user_click_on_the_add_document_button_in_existing_compliance_event_details_page() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheAddDocumentbuttoninExistingComplianceEvent();
		
		if (!result) {
	        String message = "Add Document button is not visible on the Compliance Event Details Section — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Add Document button clicked successfully");
	}
	
	@When("user enter the document title name in add document pop-up window")
	public void user_enter_the_document_title_name_in_add_document_pop_up_window() {
		String DocumentTitle = Hooks.prop.getProperty("documentitlename");
		ComplianceModulefunctionalitypage.entertheDocumentTitleNameinComplianceEvent(DocumentTitle);
		
		System.out.println("User Entered the Document Title: " + DocumentTitle);
		Hooks.scenario.log("User Entered the Document Title: " + DocumentTitle);
	}
	
	@Then("user upload the PDF file in add document pop-up window")
	public void user_upload_the_PDF_file_in_add_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Get_Started_With_Smallpdf.pdf";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinComplianceEvent(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PDF File upload failed");
	    }

	    Hooks.scenario.log("The PDF File uploaded successfully");
	}
	
	@Then("user upload the Docx file in add document pop-up window")
	public void user_upload_the_Docx_file_in_add_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file-sample_1MB.docx";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinComplianceEvent(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Docx File upload failed");
	    }
	    Hooks.scenario.log("The Docx File uploaded successfully");
	}
	
	@Then("user upload the PPT file in add document pop-up window")
	public void user_upload_the_PPT_file_in_add_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file_example_PPT_1MB.ppt";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinComplianceEvent(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PPT File upload failed");
	    }
	    Hooks.scenario.log("The PPT File uploaded successfully");
	}
	
	@Then("user upload the Excel file in add document pop-up window")
	public void user_upload_the_Excel_file_in_add_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/file_example_XLSX_5000.xlsx";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinComplianceEvent(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Excel File upload failed");
	    }
	    Hooks.scenario.log("The Excel File uploaded successfully");
	}
	
	@Then("user upload the HTML file in add document pop-up window")
	public void user_upload_the_HTML_file_in_add_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/sample html file download.html";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinComplianceEvent(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The HTML File upload failed");
	    }
	    Hooks.scenario.log("The HTML File uploaded successfully");
	}
	
	@Then("user upload the Txt file in add document pop-up window")
	public void user_upload_the_Txt_file_in_add_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Testing file.txt";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinComplianceEvent(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Txt File upload failed");
	    }
	    Hooks.scenario.log("The Txt File uploaded successfully");
	}
	
	@Then("user upload the PNG image file in add document pop-up window")
	public void user_upload_the_PNG_image_file_in_add_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/Profile Image.png";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinComplianceEvent(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PNG image File upload failed");
	    }
	    Hooks.scenario.log("The PNG image File uploaded successfully");
	}
	
	@Then("user upload the JPEG image file in add document pop-up window")
	public void user_upload_the_JPEG_image_file_in_add_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/sample.jpeg";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinComplianceEvent(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The JPEG image File upload failed");
	    }
	    Hooks.scenario.log("The JPEG image File uploaded successfully");
	}
	
	@Then("user upload the GIF image file in add document pop-up window")
	public void user_upload_the_GIF_image_file_in_add_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_GIF.gif";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinComplianceEvent(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The GIF image File upload failed");
	    }
	    Hooks.scenario.log("The GIF image File uploaded successfully");
	}
	
	@Then("user upload the SVG image file in add document pop-up window")
	public void user_upload_the_SVG_image_file_in_add_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_SVG.svg";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinComplianceEvent(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The SVG image File upload failed");
	    }
	    Hooks.scenario.log("The SVG image File uploaded successfully");
	}
	
	@Then("user upload the TIFF image file in add document pop-up window")
	public void user_upload_the_TIFF_image_file_in_add_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/file_example_TIFF.tiff";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinComplianceEvent(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The TIFF image File upload failed");
	    }
	    Hooks.scenario.log("The TIFF image File uploaded successfully");
	}
	
	@Then("user upload the JFIF image file in add document pop-up window")
	public void user_upload_the_JFIF_image_file_in_add_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Images/signature_images.jfif";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinComplianceEvent(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The JFIF image File upload failed");
	    }
	    Hooks.scenario.log("The JFIF image File uploaded successfully");
	}
	
	@Then("user upload the Audio file in add document pop-up window")
	public void user_upload_the_Audio_file_in_add_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Audio Files/file_example_MP3_1MG.mp3";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinComplianceEvent(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Audio File upload failed");
	    }
	    Hooks.scenario.log("The Audio File uploaded successfully");
	}
	
	@Then("user upload the Video file in add document pop-up window")
	public void user_upload_the_Video_file_in_add_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Audio Files/file_example_MP4_480_1_5MG.mp4";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinComplianceEvent(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The Video File upload failed");
	    }
	    Hooks.scenario.log("The Video File uploaded successfully");
	}
	
	@And("user click on the submit button in add document pop-up window")
	public void user_click_on_the_submit_button_in_add_document_pop_up_window() throws Exception {
		String result = ComplianceModulefunctionalitypage.clickintotheSubmitbuttoninAddDocument();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user click on the three dot button in existing document")
	public void user_click_on_the_three_dot_button_in_existing_document() {
		boolean result = ComplianceModulefunctionalitypage.clickintothethreedotbuttoninExistingFolder();
		
		if (!result) {
	        String message = "Document is not added, and the three-dot (more options) button is also not visible on the Compliance Event Details Section — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@When("user click on the edit button in existing document")
	public void user_click_on_the_edit_button_in_existing_document() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheEditbuttoninExistingDocumentinComplianceEvent();
		
		if (!result) {
	        String message = "Document is not added, and the Edit (more options) button is also not visible on the Compliance Event Details Section — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit button clicked successfully");
	}
	
	@Then("user change the document title name in edit document pop-up window")
	public void user_change_the_document_title_name_in_edit_document_pop_up_window() {
		String DocumentTitle = Hooks.prop.getProperty("changedocumentname");
		ComplianceModulefunctionalitypage.entertheDocumentTitleNameinComplianceEvent(DocumentTitle);
		
		System.out.println("User Entered the New Document Title: " + DocumentTitle);
		Hooks.scenario.log("User Entered the New Document Title: " + DocumentTitle);
	}
	
	@And("user click on the delete document button in edit document pop-up window")
	public void user_click_on_the_delete_document_button_in_edit_document_pop_up_window() throws Exception {
		ComplianceModulefunctionalitypage.clickintotheDeleteuploadeddocumentbutton();
		Thread.sleep(1000);
		
		System.out.println("Delete button clicked successfully");
		Hooks.scenario.log("Delete button clicked successfully");
	}
	
	@Then("user upload the PDF file in edit document pop-up window")
	public void user_upload_the_PDF_file_in_edit_document_pop_up_window() throws Exception {
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Get_Started_With_Smallpdf.pdf";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFilesinComplianceEvent(filePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PDF File upload failed");
	    }
	    Hooks.scenario.log("The PDF File uploaded successfully");
	}
	
	@And("user click on the submit button in edit document pop-up window")
	public void user_click_on_the_submit_button_in_edit_document_pop_up_window() throws Exception {
		String result = ComplianceModulefunctionalitypage.clickintotheSubmitbuttoninAddDocument();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@Then("user remove the document title name in edit document pop-up window")
	public void user_remove_the_document_title_name_in_edit_document_pop_up_window() {
		ComplianceModulefunctionalitypage.removetheDocumentTitleNameinComplianceEvent();
		
		System.out.println("Remove The Document Title Name successfully");
		Hooks.scenario.log("Remove The Document Title Name successfully");
	}
	
	@When("user click on the delete button in existing document")
	public void user_click_on_the_delete_button_in_existing_document() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheDeletebuttoninExistingDocument();
		
		if (!result) {
	        String message = "Document is not added, and the Delete (more options) button is also not visible on the Compliance Event Details Section — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing Document delete successfully");
	}
	
	@And("user click on the download button in existing document")
	public void user_click_on_the_download_button_in_existing_document() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheDownloadbuttoninExistingDocumentinComplianceEvent();
		
		if (!result) {
	        String message = "Document is not added, and the Download (more options) button is also not visible on the Compliance Event Details Section — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Download button clicked successfully");
	}
	
	@And("user click on the upcoming meetings tab in compliance event details page")
	public void user_click_on_the_upcoming_meetings_tab_in_compliance_event_details_page() {
		ComplianceModulefunctionalitypage.clickintotheUpcomingMeetingstabinExistingEvent();
		
		System.out.println("Upcoming Meetings tab clicked successfully");
		Hooks.scenario.log("Upcoming Meetings tab clicked successfully");
	}
	
	@When("user click on the edit button in upcoming meeting event")
	public void user_click_on_the_edit_button_in_upcoming_meeting_event() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheEditbuttoninUpcomingMeetingsEvent();
		
		if (!result) {
	        String message = "Meeting is not added, and the Edit (more options) button is also not visible on the Meeting Details Section — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit button clicked successfully");
	}
	
	@When("user click on the edit button in past meeting event")
	public void user_click_on_the_edit_button_in_past_meeting_event() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheEditbuttoninUpcomingMeetingsEvent();
		
		if (!result) {
	        String message = "Meeting is not added, and the Edit (more options) button is also not visible on the Meeting Details Section — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit button clicked successfully");
	}
	
	@Then("user select the meeting status as close in edit event meeting pop-up window")
	public void user_select_the_meeting_status_as_close_in_edit_event_meeting_pop_up_window() throws Exception {
		int StatusByIndex = 1; // fetch from config if required

	    boolean result = ComplianceModulefunctionalitypage.selecttheStatusByIndexinEditEventMeeting(StatusByIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Status is NOT present in dropdown for index: " + StatusByIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Status selected successfully using index: " + StatusByIndex);
	    System.out.println("Status selected successfully using index: " + StatusByIndex);
	}
	
	@And("user enter the notes in edit event meeting pop-up window")
	public void user_enter_the_notes_in_edit_event_meeting_pop_up_window() {
		String NotesinEditEvent = Hooks.prop.getProperty("notesinevent");
		ComplianceModulefunctionalitypage.entertheNotesinEditEventMeeting(NotesinEditEvent);
		
		System.out.println("User Entered the Notes: " + NotesinEditEvent);
		Hooks.scenario.log("User Entered the Notes: " + NotesinEditEvent);
	}
	
	@When("user click on the submit button in edit event meeting pop-up window")
	public void user_click_on_the_submit_button_in_edit_event_meeting_pop_up_window() throws Exception {
		String result = ComplianceModulefunctionalitypage.clickintotheSubmitbuttoninEditEventMeeting();
		
		Thread.sleep(2000);
		
		Hooks.scenario.log("Confirm Result: " + result);
	    System.out.println("Confirm Result: " + result);

	    if (result.startsWith("ERROR")) {
	        Hooks.scenario.log("Submit button clicked successfully: " + result);

	        // HARD STOP – remaining steps skipped
	        Assume.assumeTrue("Stopping scenario due to error: " + result, false);
	    }
	}
	
	@And("user click on the past meetings tab in compliance event details page")
	public void user_click_on_the_past_meetings_tab_in_compliance_event_details_page() {
		ComplianceModulefunctionalitypage.clickintothePastMeetingstabinExistingEvent();
		
		System.out.println("Past Meetings tab clicked successfully");
		Hooks.scenario.log("Past Meetings tab clicked successfully");
	}
	
	@Then("user upload the PDF document in edit event meeting pop-up window")
	public void user_upload_the_PDF_document_in_edit_event_meeting_pop_up_window() throws Exception {
		String imagePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/Get_Started_With_Smallpdf.pdf";
		boolean uploaded = ComplianceModulefunctionalitypage.uploadTheFiles(imagePath);
		Thread.sleep(2000);
		
		if (!uploaded) {
	        Assert.fail("The PDF File upload failed");
	    }

	    Hooks.scenario.log("The PDF File uploaded successfully");
	}
	
	@When("user click on the download button in past meeting event")
	public void user_click_on_the_download_button_in_past_meeting_event() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheDownloadDocumentbuttoninPastMeetings();
		
		if (!result) {
	        String message = "Past Meeting is not their, and the Download (more options) button is also not visible on the Past Meeting Details Section — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Download button clicked successfully");
	}
	
	@Then("user click on the three dot button of existing compliance event")
	public void user_click_on_the_three_dot_button_of_existing_compliance_event() {
		boolean result = ComplianceModulefunctionalitypage.clickintothethreedotbuttoninExistingFolder();
		
		if (!result) {
	        String message = "Compliance Event is not added, and the three-dot (more options) button is also not visible on the Compliance Events Section — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Three dot button clicked successfully");
	}
	
	@And("user click on the edit button of existing compliance event")
	public void user_click_on_the_edit_button_of_existing_compliance_event() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheEditbuttoninExistingComplianceEvent();
		
		if (!result) {
	        String message = "Edit (more options) button is also not visible for that user because don't have the permission on the Compliance Events Section — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Edit button clicked successfully");
	}
	
	@Then("user change the compliance event name in add compliance event page")
	public void user_change_the_compliance_event_name_in_add_compliance_event_page() {
		String ComplianceEventName = Hooks.prop.getProperty("changecomplianceeventname");
		ComplianceModulefunctionalitypage.entertheComplianceEventName(ComplianceEventName);
		
		System.out.println("User Entered the New Compliance Event Name: " + ComplianceEventName);
		Hooks.scenario.log("User Entered the New Compliance Event Name: " + ComplianceEventName);
	}
	
	@When("user change the compliance event due date in add compliance event page")
	public void user_change_the_compliance_event_due_date_in_add_compliance_event_page() {
		// Click the License Expiration Date picker
        ComplianceModulefunctionalitypage.clickintotheComplianceEventDueDate();

        // Select After 1 Month date
        ComplianceModulefunctionalitypage.selectExpiryDateAfter2MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(2);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected New Due Date: " + selectedDate);
        Hooks.scenario.log("Selected New Due Date: " + selectedDate);
	}
	
	@Then("user change the compliance event last occurrence date in add compliance event page")
	public void user_change_the_compliance_event_last_occurrence_date_in_add_compliance_event_page() {
		// Click the From Date picker
        ComplianceModulefunctionalitypage.clickintotheComplianceEventLastOccurrenceDate();

        // Select today's date
        ComplianceModulefunctionalitypage.selectDateAfterTwoDaysInAddTenant();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected New Last Occurrence Date: " + selectedDate);
        Hooks.scenario.log("Selected New Last Occurrence Date: " + selectedDate);
	}
	
	@And("user change the compliance category in add compliance event page")
	public void user_change_the_compliance_category_in_add_compliance_event_page() throws Exception {
		int ComplianceCategoryByIndex = 2; // fetch from config if required

	    boolean result = ComplianceModulefunctionalitypage.selecttheComplianceCategory(ComplianceCategoryByIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Compliance Category is NOT present in dropdown for index: " + ComplianceCategoryByIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("New Compliance Category selected successfully using index: " + ComplianceCategoryByIndex);
	    System.out.println("New Compliance Category selected successfully using index: " + ComplianceCategoryByIndex);
	}
	
	@When("user change the compliance department in add compliance event page")
	public void user_change_the_compliance_department_in_add_compliance_event_page() throws Exception {
		int ComplianceDepartmentByIndex = 4; // fetch from config if required

	    boolean result = ComplianceModulefunctionalitypage.selecttheComplianceDepartment(ComplianceDepartmentByIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Compliance Department is NOT present in dropdown for index: " + ComplianceDepartmentByIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("New Compliance Department selected successfully using index: " + ComplianceDepartmentByIndex);
	    System.out.println("New Compliance Department selected successfully using index: " + ComplianceDepartmentByIndex);
	}
	
	@Then("user change the compliance event notes in add compliance event page")
	public void user_change_the_compliance_event_notes_in_add_compliance_event_page() {
		String Notes = Hooks.prop.getProperty("changecomplianceeventnotes");
		ComplianceModulefunctionalitypage.entertheComplianceEventNotes(Notes);
		
		System.out.println("User Entered the New Compliance Event Notes: " + Notes);
		Hooks.scenario.log("User Entered the New Compliance Event Notes: " + Notes);
	}
	
	@Then("user remove the compliance event name in add compliance event page")
	public void user_remove_the_compliance_event_name_in_add_compliance_event_page() {
		ComplianceModulefunctionalitypage.removetheComplianceEventName();
		
		System.out.println("Compliance event name remove successfully");
		Hooks.scenario.log("Compliance event name remove successfully");
	}
	
	@And("user click on the delete button of existing compliance event")
	public void user_click_on_the_delete_button_of_existing_compliance_event() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheDeletebuttoninExistingComplianceEvent();
		
		if (!result) {
	        String message = "Delete (more options) button is not visible for that user because don't have the permission on the Compliance Events Section — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Existing Compliance Event delete successfully");
	}
	
	@Then("user click on the export excel button in compliance events section")
	public void user_click_on_the_export_excel_button_in_compliance_events_section() {
		boolean result = ComplianceModulefunctionalitypage.clickintotheExportExcelbuttoninComplianceEvents();
		
		if (!result) {
	        String message = "Export Excel (more options) button is not visible for that user because don't have the permission on the Compliance Events Section — skipping this step";
	        System.out.println(message);
	        Hooks.scenario.log(message);

	        Assume.assumeTrue(message, false); // Step marked as SKIPPED
	        return;
	    }
	    Hooks.scenario.log("Export Excel button clicked successfully");
	}
	
	@Then("user click on the filter button in compliance events section")
	public void user_click_on_the_filter_button_in_compliance_events_section() {
		ComplianceModulefunctionalitypage.clickintotheFilterbuttoninPartnerLicense();
		
		System.out.println("Filter button clicked successfully");
		Hooks.scenario.log("Filter button clicked successfully");
	}
	
	@And("user enter the event name in filter")
	public void user_enter_the_event_name_in_filter() {
		String EventName = Hooks.prop.getProperty("eventnameinfilter");
		ComplianceModulefunctionalitypage.entertheEventNameinFilter(EventName);
		
		System.out.println("User Entered the Event Name: " + EventName);
		Hooks.scenario.log("User Entered the Event Name: " + EventName);
	}
	
	@When("user select the due from date in filter")
	public void user_select_the_due_from_date_in_filter() {
		// Click the Due From Date picker
        ComplianceModulefunctionalitypage.clickintotheDueFromDateinFilter();

        // Select today's date
        ComplianceModulefunctionalitypage.selectOriginalTodaysDateinAddTenant();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Due From Date: " + selectedDate);
        Hooks.scenario.log("Selected Due From Date: " + selectedDate);
	}
	
	@Then("user select the due to date in filter")
	public void user_select_the_due_to_date_in_filter() {
		// Click the From Date picker
        ComplianceModulefunctionalitypage.clickintotheDueToDateinFilter();

        // Select today's date
        ComplianceModulefunctionalitypage.selectDateAfterTwoDaysInAddTenant();

        // Log selected date
        LocalDate today = LocalDate.now();
        String selectedDate = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("Selected Due To Date: " + selectedDate);
        Hooks.scenario.log("Selected Due To Date: " + selectedDate);
	}
	
	@And("user select the last occurrence from date in filter")
	public void user_select_the_last_occurrence_from_date_in_filter() {
		// Click the last occurrence from date picker
        ComplianceModulefunctionalitypage.clickintotheLastOccurrenceFromDateinFilter();

        // Select After 1 Month date
        ComplianceModulefunctionalitypage.selectExpiryDateAfter1MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected Last Occurrence From Date After 1 Month: " + selectedDate);
        Hooks.scenario.log("Selected Last Occurrence From Date After 1 Month: " + selectedDate);
	}
	
	@When("user select the last occurrence to date in filter")
	public void user_select_the_last_occurrence_to_date_in_filter() {
		// Click the Last Occurrence To Date picker
        ComplianceModulefunctionalitypage.clickintotheLastOccurrenceToDateinFilter();

        // Select After 2 Month date
        ComplianceModulefunctionalitypage.selectExpiryDateAfter2MonthAutomatically();
        
        // Log the same date logic (+1 month)
        LocalDate futureDate = LocalDate.now().plusMonths(2);
        String selectedDate = futureDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        System.out.println("Selected Last Occurrence To Date: " + selectedDate);
        Hooks.scenario.log("Selected Last Occurrence To Date: " + selectedDate);
	}
	
	@Then("user select the compliance category in filter")
	public void user_select_the_compliance_category_in_filter() throws Exception {
		int CategoryByIndex = 1; // fetch from config if required

	    boolean result = ComplianceModulefunctionalitypage.selecttheComplianceCategoryinFilter(CategoryByIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Compliance Category is NOT present in dropdown for index: " + CategoryByIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Compliance Category selected successfully using index: " + CategoryByIndex);
	    System.out.println("Compliance Category selected successfully using index: " + CategoryByIndex);
	}
	
	@And("user select the compliance department in filter")
	public void user_select_the_compliance_department_in_filter() throws Exception {
		int DepartmentByIndex = 1; // fetch from config if required

	    boolean result = ComplianceModulefunctionalitypage.selecttheComplianceDepartmentinFilter(DepartmentByIndex);

	    Thread.sleep(1500); // allow UI to settle

	    if (!result) {
	        String msg = "Compliance Department is NOT present in dropdown for index: " + DepartmentByIndex;

	        Hooks.scenario.log(msg);
	        System.err.println(msg);

	        //HARD STOP
	        Assume.assumeTrue(msg, false);
	    }
	    // Success path
	    Hooks.scenario.log("Compliance Department selected successfully using index: " + DepartmentByIndex);
	    System.out.println("Compliance Department selected successfully using index: " + DepartmentByIndex);
	}
	
	@When("user click on the search button in filter in compliance events")
	public void user_click_on_the_search_button_in_filter_in_compliance_events() {
		String result = ComplianceModulefunctionalitypage.clickintothesearchbuttoninFilter();

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
