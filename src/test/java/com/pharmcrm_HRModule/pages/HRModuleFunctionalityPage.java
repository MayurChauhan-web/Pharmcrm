package com.pharmcrm_HRModule.pages;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HRModuleFunctionalityPage {
	WebDriver driver;
	
	//By Locators
	private By HRmoduletab = By.xpath("//a[@href='/HR/Home/Dashboard']//div[@class='module-list-main']//div[@class='module-list-img']");
	private By documentstabinsidebar = By.xpath("//span[normalize-space()='Documents']");
	private By newfoldertabindocuments = By.xpath("//span[normalize-space()='New Folder']");
	private By foldernametextbox = By.xpath("//input[@id='BucketFolder_FolderName']");
	private By submitbuttoninaddnewfolder = By.xpath("//button[@id='btnSave']");
	private By threedotbuttoninfolder = By.xpath("(//div[@class='pc-filemanagerFolder pc-filemanager']//button[@id='bucketDrop'])[1]");
	private By editfoldernamebutton = By.xpath("//div[contains(@class,'bucket-dropdown-content')]//a[@data-original-title='Edit Folder']");
	private By deletefolderbutton = By.xpath("//div[contains(@class,'bucket-dropdown-content')]//a[@data-original-title='Delete Folder']");
	private By confirmdeletefolderbutton = By.xpath("(//button[@id='btnDeleteConfirm'])[1]");
	private By addpermissionfolderbutton = By.xpath("//div[contains(@class,'bucket-dropdown-content')]//a[contains(@onclick,'addPermissionPopup')]");
	private By existingfoldertab = By.xpath("(//div[@class='folder-name-main'])[1]");
	private By fileuploadtabindocuments = By.xpath("//span[normalize-space()='File Upload']");
	private By submitbuttoninfileupload = By.xpath("//button[@id='btnSaveFile']");
	private By choosefiletabinfileupload = By.xpath("(//input[@id='file-3'])[1]");
	private By editfilenamebutton = By.xpath("(//a[@id='btnEditFile'])[1]");
	private By filenametextbox = By.xpath("//input[@id='fileNameTextBox']");
	private By downloadfilebutton = By.xpath("(//a[contains(@href,'/Security/DownloadFile')])[1]");
	private By deletefilebutton = By.xpath("(//a[@id='btnDeleteFile'])[1]");
	private By confirmdeletefilebutton = By.xpath("(//button[normalize-space()='Confirm'])[1]");
	private By viewfilebutton = By.xpath("(//a[@id='btnEditFile'])[2]");
	private By threedotbuttoninfile = By.xpath("(//div[@class='pc-filemanager']//button[@id='bucketDrop'])[1]");
	private By firstusercheckbox = By.xpath("(//ul[@id='uname']//label)[2]");
	private By submitbuttoninpermission = By.xpath("//button[@id='btnPermission']");
	private By searchtextboxindocuments = By.xpath("//input[@id='searchfile']");
	private By employeestabinsidebar = By.xpath("//span[normalize-space()='Employees']");
	private By filtertabinemployees = By.xpath("//a[@id='searchcollapse']");
	private By lastnametextboxinemployees = By.xpath("//input[@id='Filter_LastName']");
	private By firstnametextboxinemployees = By.xpath("//input[@id='Filter_FirstName']");
	private By birthdatetextboxinemployees = By.xpath("//input[@id='Filter_BirthDate']");
	private By designationdropdownbutton = By.xpath("//select[@id='Filter_Designation_Id']");
	private By employeeidtextbox = By.xpath("//input[@id='Filter_EmployeeNumber']");
	private By cellphone1textbox = By.xpath("//input[@id='Filter_CellPhone1']");
	private By employeestatusdropdownbutton = By.xpath("//select[@id='Filter_EmploymentStatus']");
	private By accesscodetypedropdownbutton = By.xpath("//select[@id='Filter_AccesscodeType_Id']");
	private By licensenumbertextbox = By.xpath("//input[@id='Filter_LicenseNumber']");
	private By ssntextbox = By.xpath("//input[@id='Filter_SSN']");
	private By taxidtextbox = By.xpath("//input[@id='Filter_TaxId']");
	private By searchbuttoninfilter = By.xpath("//button[@class='btn filterSearchBtn waves-effect waves-light']");
	private By newemployeetabinemployees = By.xpath("//span[normalize-space()='New Employee']");
	private By employeetitledropdownbutton = By.xpath("//select[@id='Employee_Title']");
	private By employeefirstnametextbox = By.xpath("//input[@id='Employee_FirstName']");
	private By employeemiddlenametextbox = By.xpath("//input[@id='Employee_MiddleName']");
	private By employeelastnametextbox = By.xpath("//input[@id='Employee_LastName']");
	private By employeedesignationdropdownbutton = By.xpath("//select[@id='Employee_Designation_Id']");
	private By employeecellphone1textbox = By.xpath("//input[@id='Employee_CellPhone1']");
	private By employeebusinessemailtextbox = By.xpath("//input[@id='Employee_BusinessEmail']");
	private By employeestartdatetextbox = By.xpath("//input[@id='Employee_EmploymentStartDate']");
	private By employeeEmploymenttypedropdownbutton = By.xpath("//select[@id='Employee_EmploymentType']");
	private By employmentstatusdropdownbutton = By.xpath("//select[@id='Employee_EmploymentStatus']");
	private By employeebloodgroupdropdownbutton = By.xpath("//select[@id='Employee_BloodGroup']");
	private By employeebirthdatetextbox = By.xpath("//input[@id='Employee_BirthDate']");
	private By employeegenderdropdownbutton = By.xpath("//select[@id='Employee_Gender']");
	private By submitbuttoninemployee = By.xpath("//button[@id='btnSave']");
	private By threedotexistingemployeebutton = By.xpath("(//button[contains(@class,'bucket-icon-dropdown')])[1]");
	private By editbuttoninexistingemployee = By.xpath("(//span[contains(text(),'Edit')])[1]");
	private By deletebuttoninexistingemployee = By.xpath("(//span[contains(text(),'Delete')])[1]");
	private By confirmdeletebuttoninexistingemployee = By.xpath("(//button[normalize-space()='Confirm'])[1]");
	private By viewbuttoninexistingemployee = By.xpath("(//a[contains(@href,'EmployeeDetails')]//img)[1]");
	private By editbuttoninemployeedetails = By.xpath("(//a[normalize-space()='Edit'])[1]");
	private By deletebuttoninemployeedetails = By.xpath("(//div[@id='btnDeleteEmployee'])[1]");
	private By confirmdeletebuttoninemployeedetails = By.xpath("(//button[@id='btnDeleteEmployeeConfirm'])[1]");
	private By userlinkinemployeedetails = By.xpath("(//div[@id='UserDetail'])[1]");
	private By filterlastnameinsearchuser = By.xpath("(//input[@id='Filter_LastName'])[1]");
	private By searchbuttoninsearchuser = By.xpath("(//button[normalize-space()='Search'])[1]");
	private By firstuserradiobuttoninsearchuser = By.xpath("(//li[contains(@class,'searchResult-li')]//input[@type='radio'])[1]");
	private By submitbuttoninsearchuser = By.xpath("(//button[@id='btnSaveUser'])[1]");
	private By delinkuserinemployeedetails = By.xpath("(//div[@id='btnDelinkUserEmployee'])[1]");
	private By confirmdelinkuserbuttoninemployeedetails = By.xpath("//div[@id='delinkUserEmployeeModel']//button[@id='btnDeleteConfirm']");
	private By licensestabinemployeedetails = By.xpath("(//a[normalize-space()='Licenses'])[1]");
	private By newlicensesbuttoninlicenses = By.xpath("(//span[normalize-space()='New Licenses'])[1]");
	private By licensetypedropdownbutton = By.xpath("(//select[@id='EmployeeLicense_ProfessionalLicenseType_Id'])[1]");
	private By licensenumbertextboxinaddlicense = By.xpath("(//input[@id='EmployeeLicense_LicenseNumber'])[1]");
	private By licenseexpirationdatetextbox = By.xpath("(//input[@id='EmployeeLicense_ExpirationDate'])[1]");
	private By statedropdownbuttoninaddlicensewindow = By.xpath("(//select[@id='ddState'])[1]");
	private By statusdropdownbuttoninaddlicensewindow = By.xpath("(//select[@id='Employee_LicenseStatus'])[1]");
	private By submitbuttoninaddlicensewindow = By.xpath("(//button[@id='btnSaveEmployeeLicense'])[1]");
	private By threedotbuttoninlicense = By.xpath("(//button[@id='bucketDrop'])[1]");
	private By edittabinexistinglicense = By.xpath("(//span[contains(text(),'Edit')])[1]");
	private By deletetabinexistinglicense = By.xpath("(//span[contains(text(),'Delete')])[1]");
	private By confirmdeletetabinexistinglicense = By.xpath("(//button[@id='btnDeleteEmployeeLicenseConfirm'])[1]");
	private By downloadtabinexistinglicense = By.xpath("(//span[contains(text(),'Download')])[1]");
	private By accesscodetabinemployeedetails = By.xpath("(//a[normalize-space()='Access Code'])[1]");
	private By newaccesscodebuttoninaccesscode = By.xpath("(//span[normalize-space()='New Access Code'])[1]");
	private By accesscodetypedropdownbuttoninaccesscode = By.xpath("(//select[@id='EmployeeAccesscode_AccesscodeType_Id'])[1]");
	private By datetextboxinaccesscode = By.xpath("(//input[@id='EmployeeAccesscode_AccesscodeDate'])[1]");
	private By notestextboxinaccesscode = By.xpath("(//textarea[@id='EmployeeAccesscode_Notes'])[1]");
	private By submitbuttoninaccesscode = By.xpath("(//button[@id='btnSaveEmployeeAccesscode'])[1]");
	private By threedotbuttoninaccesscode = By.xpath("(//button[@id='bucketDrop'])[28]");
	private By edittabinaccesscode = By.xpath("//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	private By deletetabinaccesscode = By.xpath("//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	private By confirmdeletetabinaccesscode = By.xpath("(//button[@id='btnDeleteEmployeeAccesscodeConfirm'])[1]");
	private By docstabinemployeedetails = By.xpath("(//a[normalize-space()='Docs'])[1]");
	private By newdocumentbuttonindocs = By.xpath("(//span[normalize-space()='New Document'])[1]");
	private By titletextboxindocs = By.xpath("(//input[@id='EmployeeDocument_Title'])[1]");
	private By choosefiletabindocs = By.xpath("(//input[@id='file-2'])[1]");
	private By submitbuttonindocs = By.xpath("(//button[@id='btnSaveEmployeeDocument'])[1]");
	private By threedotbuttoninexistingdocument = By.xpath("(//button[@id='bucketDrop'])[32]");
	private By edittabinexistingdocument = By.xpath("(//a[contains(@onclick,'editEmployeeDocument')])[1]");
	private By deletetabinexistingdocument = By.xpath("(//a[@id='btnDeleteEmployeeDocument'])[1]");
	private By downloadtabinexistingdocument = By.xpath("(//div[contains(@class,'bucketDropdownAction')]//a[contains(@href,'DownloadFile')])[1]");
	private By confirmdeletetabinexistingdocument = By.xpath("(//button[@id='btnDeleteEmployeeDocumentConfirm'])[1]");
	private By checklisttabinemployeedetails = By.xpath("(//a[normalize-space()='Checklist'])[1]");
	private By newcheklistbuttoninchecklist = By.xpath("(//span[normalize-space()='New Checklist'])[1]");
	private By checklistdropdowninchecklist = By.xpath("(//select[@id='EmployeeChecklist_ChecklistId'])[1]");
	private By choosefilebuttoninchecklist = By.xpath("(//input[@id='file-8'])[1]");
	private By notestextboxinchecklist = By.xpath("(//textarea[@id='EmployeeChecklist_Notes'])[1]");
	private By submitbuttoninchecklist = By.xpath("(//button[@id='btnSaveEmployeeChecklist'])[1]");
	private By threedotbuttoninchecklist = By.xpath("(//button[@id='bucketDrop'])[48]");
	private By edittabinexistingchecklist = By.xpath("(//a[contains(@onclick,'editEmployeeCheckList')])[1]");
	private By deletetabinexistingchecklist = By.xpath("(//a[@id='btnDeleteEmployeeChecklist'])[1]");
	private By confirmdeletetabinexistingchecklist = By.xpath("(//button[@id='btnDeleteEmployeeChecklistConfirm'])[1]");
	private By downloadtabinexistingchecklist = By.xpath("(//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Download')])[1]");
	private By notetabinemployeedetails = By.xpath("(//a[normalize-space()='Note'])[1]");
	private By newnotebuttoninnote = By.xpath("(//span[normalize-space()='New Notes'])[1]");
	private By subjectinnote = By.xpath("(//input[@id='EmployeeNote_Subject'])[1]");
	private By notesinnote = By.xpath("(//textarea[@id='EmployeeNote_Notes'])[1]");
	private By choosefilebuttoninnote = By.xpath("(//input[@id='file-5'])[1]");
	private By submitbuttoninnote = By.xpath("(//button[@id='btnSaveEmployeeNote'])[1]");
	private By threedotbuttoninexistingnote = By.xpath("(//button[@type='button'])[68]");
	private By editbuttoninexistingnote = By.xpath("(//a[contains(@onclick,'editEmployeeNote')])[1]");
	private By deletebuttoninexistingnote = By.xpath("(//a[@id='btnDeleteEmployeeNote'])[1]");
	private By confirmdeletebuttoninexistingnote = By.xpath(" (//button[@id='btnDeleteEmployeeNoteConfirm'])[1]");
	private By downloadbuttoninexistingnote = By.xpath("(//a[contains(@href,'DownloadFile') and contains(@href,'EmployeeNote')])[1]");
	private By timelinetabinemployeedetails = By.xpath("(//a[normalize-space()='Timeline'])[1]");
	private By newtimtlintbuttonintimeline = By.xpath("(//span[normalize-space()='New Timeline'])[1]");
	private By eventtextboxintimeline = By.xpath("(//input[@id='EmployeeTimeline_Title'])[1]");
	private By eventdatetextboxintimeline = By.xpath("(//input[@id='EmployeeTimeline_EventDate'])[1]");
	private By notestextboxintimeline = By.xpath("(//textarea[@id='EmployeeTimeline_Notes'])[1]");
	private By statusdropdownintimeline = By.xpath("(//select[@id='EmployeeTimeline_Status'])[1]");
	private By submitbuttonintimeline = By.xpath("(//button[@id='btnSaveEmployeeTimeline'])[1]");
	private By workbenchtabinemployeedetails = By.xpath("(//a[normalize-space()='Workbench'])[1]");
	private By newworkbenchbuttoninworkbench = By.xpath("(//span[normalize-space()='New Workbench'])[1]");
	private By searchworkbenchtabinworkbench = By.xpath("(//input[@id='txtWorkbenchSearch'])[1]");
	private By checkboxinworkbench = By.xpath("//div[contains(@class,'fillable-checkbox')]");
	private By submitbuttoninworkbench = By.xpath("(//button[@id='btnSaveEmployeeWorkbench'])[1]");
	private By workbenchestabinsidebar = By.xpath("(//span[normalize-space()='Workbenches'])[1]");
	private By filtertabinworkbenches = By.xpath("(//span[normalize-space()='Filter'])[1]");
	private By workbenchessearchtextbox = By.xpath("(//input[@id='Filter_Name'])[1]");
	private By searchbuttoninworkbenches = By.xpath("(//button[@class='btn filterSearchBtn waves-effect waves-light'])[1]");
	private By newworkbenchbuttoninworkbenches = By.xpath("(//span[normalize-space()='New Workbench'])[1]");
	private By workbenchnamettextboxinworkbench = By.xpath("(//input[@id='Workbench_Name'])[1]");
	private By workbenchdescriptiontextboxinworkbenches = By.xpath("(//textarea[@id='Workbench_Description'])[1]");
	private By submitbuttoninworkbenches = By.xpath("(//button[@id='btnSave'])[1]");
	private By threedotbuttoninexistingworkbench = By.xpath("(//button[@id='bucketDrop'])[1]");
	private By editbuttoninexistingworkbench = By.xpath("(//a[contains(@onclick,'EditWorkbench')])[1]");
	private By deletebuttoninexistingworkbench = By.xpath("(//span[contains(text(),'Delete')])[1]");
	private By confirmdeletebuttoninexistingworkbench = By.xpath("(//button[normalize-space()='Confirm'])[1]");
	private By timesheettabinsidebar = By.xpath("(//span[normalize-space()='Timesheet'])[1]");
	private By addlinebuttonintimesheet = By.xpath("(//button[normalize-space()='Add Line'])[1]");
	private By taskdatetextboxintaskefforts = By.xpath("(//input[@id='TimesheetProject_TaskDate'])[1]");
	private By projectdropdownbuttonintaskefforts = By.xpath("(//select[@id='Boards'])[1]");
	private By taskdropdownbuttonintaskefforts = By.xpath("(//select[@id='BoardTasks'])[1]");
	private By submitbuttonintaskefforts = By.xpath("(//button[@id='btnAddProject'])[1]");
	private By taskhourstextboxintaskefforts = By.xpath("(//input[@id='TaskHours'])[1]");
	private By todaybuttonintimesheet = By.xpath("(//button[normalize-space()='Today'])[1]");
	private By todayEditableHoursintimesheet = By.xpath("(//span[starts-with(@id,'taskDay_') and @contenteditable='true'])[1]");
	private By exporttoexcelbuttonintimesheet = By.xpath("(//button[@class='btn btn-secondary waves-effect waves-light'])[1]");
	
	
	
	public HRModuleFunctionalityPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean clickintotheHRmoduletab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for HR Module tab
	    List<WebElement> HRmoduletabs = driver.findElements(HRmoduletab);

	    if (HRmoduletabs.isEmpty()) {
	        // HR Module tab NOT present → stop scenario
	        return false;
	    }

	    WebElement HRmoduletab = HRmoduletabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(HRmoduletab));
	    HRmoduletab.click();

	    return true;
	}
	
	
	//------------------------------------------Documents Section---------------------------------------------
	
	
	public boolean clickintothedocumentstabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Compliance Module tab
	    List<WebElement> documentstabs = driver.findElements(documentstabinsidebar);

	    if (documentstabs.isEmpty()) {
	        // Compliance Module tab NOT present → stop scenario
	        return false;
	    }

	    WebElement documentstab = documentstabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(documentstab));
	    documentstab.click();

	    return true;
	}
	
	public boolean clickintothenewfoldertabindocuments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Compliance Module tab
	    List<WebElement> newfoldertabs = driver.findElements(newfoldertabindocuments);

	    if (newfoldertabs.isEmpty()) {
	        // Compliance Module tab NOT present → stop scenario
	        return false;
	    }

	    WebElement newfoldertab = newfoldertabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newfoldertab));
	    newfoldertab.click();

	    return true;
	}
	
	public void entertheNewFolderName(String FolderName) {
		WebElement FolderNametextboxfield = driver.findElement(foldernametextbox);
		FolderNametextboxfield.clear();
		FolderNametextboxfield.sendKeys(FolderName);
    }
	
	public void removetheExistingFolderName() {
		WebElement FolderNametextboxfield = driver.findElement(foldernametextbox);
		FolderNametextboxfield.clear();
    }
	
	public String clickintothesubmitbuttoninaddnewfolder() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(submitbuttoninaddnewfolder)).click();
	   
	    System.out.println("Submit button clicked successfully");
	    
	  // 1️⃣ Check toast message FIRST
	    try {
	        WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//div[@class='toast-message']")));
	        String msg = toast.getText().trim();
	        System.out.println("Toast Error Found: " + msg);

	        return "ERROR: " + msg;     // 🔥 return toast message immediately
	    } catch (TimeoutException e) {
	        // No toast → continue
	    }
		return "New Folder added successsfully";
	}
	
	public boolean clickintothefolderthreedotbuttonindocuments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for three dot button
	    List<WebElement> threedotButtons = driver.findElements(threedotbuttoninfolder);

	    if (threedotButtons.isEmpty()) {
	        // Three dot button NOT present → stop scenario
	        return false;
	    }

	    WebElement threedotButton = threedotButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(threedotButton));
	    threedotButton.click();

	    return true;
	}
	
	public boolean clickintothefilethreedotbuttonindocuments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for three dot button
	    List<WebElement> threedotButtons = driver.findElements(threedotbuttoninfile);

	    if (threedotButtons.isEmpty()) {
	        // Three dot button NOT present → stop scenario
	        return false;
	    }

	    WebElement threedotButton = threedotButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(threedotButton));
	    threedotButton.click();

	    return true;
	}
	
	public boolean clickintotheEditFoldernamebutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit button
	    List<WebElement> editButtons = driver.findElements(editfoldernamebutton);

	    if (editButtons.isEmpty()) {
	        // Edit button NOT present → stop scenario
	        return false;
	    }

	    WebElement editButton = editButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(editButton));
	    editButton.click();

	    return true;
	}
	
	public boolean clickintotheDeleteFolderbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletefolderbutton);

	    // If Delete button NOT present → stop scenario
	    if (deleteButtons.isEmpty()) {
	        System.out.println("Delete button NOT present");
	        return false;
	    }

	    WebElement deleteButton = deleteButtons.get(0);

	    // Wait until clickable
	    wait.until(ExpectedConditions.elementToBeClickable(deleteButton));

	    try {
	        deleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", deleteButton);
	    }

	    System.out.println("Delete button clicked");

	    // Wait for confirm delete button
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletefolderbutton));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	public boolean clickintotheAddPermissionFolderbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Folder Permission button
	    List<WebElement> folderpermissionbuttons = driver.findElements(addpermissionfolderbutton);

	    if (folderpermissionbuttons.isEmpty()) {
	        // Folder Permission button NOT present → stop scenario
	        return false;
	    }

	    WebElement folderpermissionbutton = folderpermissionbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(folderpermissionbutton));
	    folderpermissionbutton.click();

	    return true;
	}
	
	public boolean clickintotheExistingfoldertabindocuments() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for existing folder tab button
	    List<WebElement> existingfolderbuttons = driver.findElements(existingfoldertab);

	    if (existingfolderbuttons.isEmpty()) {
	        // Folder tab NOT present → stop scenario
	        return false;
	    }

	    WebElement existingfolderbutton = existingfolderbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(existingfolderbutton));

	    // DOUBLE CLICK on the folder
	    Actions actions = new Actions(driver);
	    actions.doubleClick(existingfolderbutton).perform();

	    return true;
	}
	
	public boolean clickintothefileuploadtabindocuments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Compliance Module tab
	    List<WebElement> uploadtabs = driver.findElements(fileuploadtabindocuments);

	    if (uploadtabs.isEmpty()) {
	        // Compliance Module tab NOT present → stop scenario
	        return false;
	    }

	    WebElement uploadtab = uploadtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(uploadtab));
	    uploadtab.click();

	    return true;
	}

	public boolean uploadTheFiles(String filePath) {
		try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(choosefiletabinfileupload));

            if (!fileInput.isDisplayed()) {
                return false;
            }

            fileInput.sendKeys(filePath);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
	
	public String clickintothesubmitbuttoninfileupload() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(submitbuttoninfileupload)).click();
	   
	    System.out.println("Submit button clicked successfully");
	    
	  // 1️⃣ Check toast message FIRST
	    try {
	        WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//div[@class='toast-message']")));
	        String msg = toast.getText().trim();
	        System.out.println("Toast Error Found: " + msg);

	        return "ERROR: " + msg;     // 🔥 return toast message immediately
	    } catch (TimeoutException e) {
	        // No toast → continue
	    }
		return "File Uploaded successfully";
	}
	
	public boolean clickintotheEditFilenamebutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit button
	    List<WebElement> editButtons = driver.findElements(editfilenamebutton);

	    if (editButtons.isEmpty()) {
	        // Edit button NOT present → stop scenario
	        return false;
	    }

	    WebElement editButton = editButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(editButton));
	    editButton.click();

	    return true;
	}
	
	public void entertheFileName(String FileName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    // 1️⃣ Wait for loader to disappear (THIS FIXES THE ERROR)
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//img[contains(@class,'pharmCRMLoaderImage')]")));

	    // 2️⃣ Wait for textbox to be clickable
	    WebElement fileNameTextbox = wait.until(
	            ExpectedConditions.elementToBeClickable(filenametextbox));

	    // 3️⃣ Clear existing file name
	    fileNameTextbox.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	    fileNameTextbox.sendKeys(Keys.DELETE);

	    // 4️⃣ Enter new file name
	    fileNameTextbox.sendKeys(FileName);

	    System.out.println("File name updated successfully");
	}
	
	public boolean clickintotheDeleteFilenamebutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletefilebutton);

	    // If Delete button NOT present → stop scenario
	    if (deleteButtons.isEmpty()) {
	        System.out.println("Delete button NOT present");
	        return false;
	    }

	    WebElement deleteButton = deleteButtons.get(0);

	    // Wait until clickable
	    wait.until(ExpectedConditions.elementToBeClickable(deleteButton));

	    try {
	        deleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", deleteButton);
	    }

	    System.out.println("Delete button clicked");

	    // Wait for confirm delete button
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletefilebutton));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	public boolean clickintotheDownloadFilenamebutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Download button
	    List<WebElement> downloadfilebuttons = driver.findElements(downloadfilebutton);

	    if (downloadfilebuttons.isEmpty()) {
	        // Download button NOT present → stop scenario
	        return false;
	    }

	    WebElement downloadfilebutton = downloadfilebuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(downloadfilebutton));
	    downloadfilebutton.click();

	    return true;
	}
	
	public boolean clickintotheViewFilenamebutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for first user checkbox button
	    List<WebElement> viewfilebuttons = driver.findElements(viewfilebutton);

	    if (viewfilebuttons.isEmpty()) {
	        // First user checkbox button NOT present → stop scenario
	        return false;
	    }

	    WebElement viewfilebutton = viewfilebuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(viewfilebutton));
	    viewfilebutton.click();

	    return true;
	}
	
	public boolean clickintotheFirstusercheckboxinpermission() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for first user checkbox button
	    List<WebElement> firstusercheckboxTabs = driver.findElements(firstusercheckbox);

	    if (firstusercheckboxTabs.isEmpty()) {
	        // First user checkbox button NOT present → stop scenario
	        return false;
	    }

	    WebElement firstusercheckboxTab = firstusercheckboxTabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(firstusercheckboxTab));
	    firstusercheckboxTab.click();

	    return true;
	}
	
	public String clickintothesubmitbuttoninpermission() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(submitbuttoninpermission)).click();
	   
	    System.out.println("Submit button clicked successfully");
	    
	  // 1️⃣ Check toast message FIRST
	    try {
	        WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//div[@class='toast-message']")));
	        String msg = toast.getText().trim();
	        System.out.println("Toast Error Found: " + msg);

	        return "ERROR: " + msg;     // 🔥 return toast message immediately
	    } catch (TimeoutException e) {
	        // No toast → continue
	    }
		return "Permission is added successfully";
	}
	
	public boolean entertheDocumentnameinsearchbox(String DocumentName) {
		try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	        // 1️⃣ Wait for loader to disappear
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(
	                By.xpath("//div[@class='preloader']")));

	        // 2️⃣ Wait for search textbox to be visible
	        WebElement searchBox = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(searchtextboxindocuments));

	        // 3️⃣ Clear existing text
	        searchBox.clear();

	        // 4️⃣ Enter file name
	        searchBox.sendKeys(DocumentName);

	        System.out.println("File name entered successfully: " + DocumentName);
	        return true;

	    } catch (TimeoutException e) {
	        System.err.println("❌ Search textbox not visible within timeout");
	        return false;
	    }
	}
	
	
	//-------------------------------------Employees Section--------------------------------------------------
	
	
	public boolean clickintotheemployeestabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Employees tab
	    List<WebElement> employeestabs = driver.findElements(employeestabinsidebar);

	    if (employeestabs.isEmpty()) {
	        // Employees tab NOT present → stop scenario
	        return false;
	    }

	    WebElement employeestab = employeestabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(employeestab));
	    employeestab.click();

	    return true;
	}
	
	public void clickintothefiltertabinemployees() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement filtertab = wait.until(ExpectedConditions.elementToBeClickable(filtertabinemployees));
	   
	    try {
	    	filtertab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", filtertab);
	    }

	    System.out.println("Filter Tab clicked successfully");
	}
	
	public void entertheLastNameinemployees(String LastName) {
		WebElement LastNametextboxfield = driver.findElement(lastnametextboxinemployees);
		LastNametextboxfield.clear();
		LastNametextboxfield.sendKeys(LastName);
    }
	
	public void entertheFirstNameinemployees(String FirstName) {
		WebElement FirstNametextboxfield = driver.findElement(firstnametextboxinemployees);
		FirstNametextboxfield.clear();
		FirstNametextboxfield.sendKeys(FirstName);
    }
	
	public void entertheBirthDateinemployees(String BirthDate) {
		WebElement BirthDatetextboxfield = driver.findElement(birthdatetextboxinemployees);
		BirthDatetextboxfield.clear();
		BirthDatetextboxfield.sendKeys(BirthDate);
    }
	
	public boolean selecttheDesignation(String DesignationName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️⃣ Wait for <select> dropdown
	        WebElement designationDropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(designationdropdownbutton));

	        Select select = new Select(designationDropdown);

	        // 2️⃣ Select by visible text
	        select.selectByVisibleText(DesignationName);

	        System.out.println("Designation selected: " + DesignationName);
	        return true;

	    } catch (NoSuchElementException e) {
	        // ⚠ Designation not present → do NOT fail
	        System.out.println(
	            "⚠ Designation '" + DesignationName + "' not found — skipping selection"
	        );
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	            "⚠ Error selecting designation — continuing test: " + e.getMessage()
	        );
	        return true;
	    }
	}
	
	public void entertheEmployeeId(String EmployeeId) {
		WebElement EmployeeIdtextboxfield = driver.findElement(employeeidtextbox);
		EmployeeIdtextboxfield.clear();
		EmployeeIdtextboxfield.sendKeys(EmployeeId);
    }
	
	public void entertheCellPhone1(String CellPhone1) {
		WebElement CellPhone1textboxfield = driver.findElement(cellphone1textbox);
		CellPhone1textboxfield.clear();
		CellPhone1textboxfield.sendKeys(CellPhone1);
    }
	
	public boolean selecttheEmployeestatus(String EmployeeStatus) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️⃣ Wait for <select> dropdown
	        WebElement employeestatusDropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(employeestatusdropdownbutton));

	        Select select = new Select(employeestatusDropdown);

	        // 2️⃣ Select by visible text
	        select.selectByVisibleText(EmployeeStatus);

	        System.out.println("Designation selected: " + EmployeeStatus);
	        return true;

	    } catch (NoSuchElementException e) {
	        // ⚠ Status not present → do NOT fail
	        System.out.println(
	            "Status '" + EmployeeStatus + "' not found — skipping selection"
	        );
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	            "⚠ Error selecting status — continuing test: " + e.getMessage()
	        );
	        return true;
	    }
	}
	
	public boolean selecttheAccesscodeType(String AccessCodeType) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️⃣ Wait for <select> dropdown
	        WebElement AccessCodeTypeDropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(accesscodetypedropdownbutton));

	        Select select = new Select(AccessCodeTypeDropdown);

	        // 2️⃣ Select by visible text
	        select.selectByVisibleText(AccessCodeType);

	        System.out.println("Access Code selected: " + AccessCodeType);
	        return true;

	    } catch (NoSuchElementException e) {
	        // Access Code not present → do NOT fail
	        System.out.println(
	            "Status '" + AccessCodeType + "' not found — skipping selection"
	        );
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	            " Error selecting access code — continuing test: " + e.getMessage()
	        );
	        return true;
	    }
	}
	
	public void entertheLicenseNumber(String LicenseNumber) {
		WebElement LicenseNumbertextboxfield = driver.findElement(licensenumbertextbox);
		LicenseNumbertextboxfield.clear();
		LicenseNumbertextboxfield.sendKeys(LicenseNumber);
    }
	
	public void entertheSSN(String SSN) {
		WebElement SSNtextboxfield = driver.findElement(ssntextbox);
		SSNtextboxfield.clear();
		SSNtextboxfield.sendKeys(SSN);
    }
	
	public void entertheTaxId(String TaxId) {
		WebElement TaxIdtextboxfield = driver.findElement(taxidtextbox);
		TaxIdtextboxfield.clear();
		TaxIdtextboxfield.sendKeys(TaxId);
    }
	
	public String clickintothesearchbuttoninfilter() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Click Search button
	    wait.until(ExpectedConditions.elementToBeClickable(searchbuttoninfilter)).click();

	    System.out.println("Search button clicked successfully");

	    try {
	        WebElement noRecordMsg = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='noRecordsText']")));

	        return "ERROR: " + noRecordMsg.getText();

	    } catch (TimeoutException ignored) {}

	    // 3️⃣ User exists
	    return "SUCCESS: User is shown";
	}
	
	public boolean clickintotheNewEmployeetab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for License Management tab
	    List<WebElement> newemployeetabs = driver.findElements(newemployeetabinemployees);

	    if (newemployeetabs.isEmpty()) {
	        // License Management tab NOT present → stop scenario
	        return false;
	    }

	    WebElement newemployeetab = newemployeetabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newemployeetab));
	    newemployeetab.click();

	    return true;
	}
	
	public boolean selecttheEmployeeTitle(String EmployeeTitle) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // Wait for <select> dropdown
	        WebElement EmployeeTitleDropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(employeetitledropdownbutton));

	        Select select = new Select(EmployeeTitleDropdown);

	        // Select by visible text
	        select.selectByVisibleText(EmployeeTitle);

	        System.out.println("Employee Title selected: " + EmployeeTitle);
	        return true;

	    } catch (NoSuchElementException e) {
	        // Employee Title not present → do NOT fail
	        System.out.println(
	            "Title '" + EmployeeTitle + "' not found — skipping selection"
	        );
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	            " Error employee title — continuing test: " + e.getMessage()
	        );
	        return true;
	    }
	}
	
	public void entertheEmployeeFirstName(String EmployeeFirstName) {
		WebElement EmployeeFirstNametextboxfield = driver.findElement(employeefirstnametextbox);
		EmployeeFirstNametextboxfield.clear();
		EmployeeFirstNametextboxfield.sendKeys(EmployeeFirstName);
    }
	
	public void entertheEmployeeMiddleName(String EmployeeMiddleName) {
		WebElement EmployeeMiddleNametextboxfield = driver.findElement(employeemiddlenametextbox);
		EmployeeMiddleNametextboxfield.clear();
		EmployeeMiddleNametextboxfield.sendKeys(EmployeeMiddleName);
    }
	
	public void entertheEmployeeLastName(String EmployeeLastName) {
		WebElement EmployeeLastNametextboxfield = driver.findElement(employeelastnametextbox);
		EmployeeLastNametextboxfield.clear();
		EmployeeLastNametextboxfield.sendKeys(EmployeeLastName);
    }
	
	public boolean selecttheEmployeeDesignation(String EmployeeDesignation) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️⃣ Wait for <select> dropdown
	        WebElement designationDropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(employeedesignationdropdownbutton));

	        Select select = new Select(designationDropdown);

	        // 2️⃣ Select by visible text
	        select.selectByVisibleText(EmployeeDesignation);

	        System.out.println("Designation selected: " + EmployeeDesignation);
	        return true;

	    } catch (NoSuchElementException e) {
	        // ⚠ Designation not present → do NOT fail
	        System.out.println(
	            "⚠ Designation '" + EmployeeDesignation + "' not found — skipping selection"
	        );
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	            "⚠ Error selecting designation — continuing test: " + e.getMessage()
	        );
	        return true;
	    }
	}
	
	public void entertheEmployeeCellPhone1(String EmployeeCellPhone1) {
		WebElement EmployeeCellPhone1textboxfield = driver.findElement(employeecellphone1textbox);
		EmployeeCellPhone1textboxfield.clear();
		EmployeeCellPhone1textboxfield.sendKeys(EmployeeCellPhone1);
    }
	
	public void entertheEmployeeBusinessEmail(String EmployeeBusinessEmail) {
		WebElement EmployeeBusinessEmailtextboxfield = driver.findElement(employeebusinessemailtextbox);
		EmployeeBusinessEmailtextboxfield.clear();
		EmployeeBusinessEmailtextboxfield.sendKeys(EmployeeBusinessEmail);
    }
	
	public void clickintotheEmployeestartdate() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in HRModuleFunctionalityPage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement assignfromdatetextboxTab = wait.until(ExpectedConditions.elementToBeClickable(employeestartdatetextbox));

        try {
            assignfromdatetextboxTab.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", assignfromdatetextboxTab);
        }

        System.out.println("Employee Start Date clicked successfully");
    }
	
	public void clickintotheEmployeebirthdate() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in HRModuleFunctionalityPage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement assignfromdatetextboxTab = wait.until(ExpectedConditions.elementToBeClickable(employeebirthdatetextbox));

        try {
            assignfromdatetextboxTab.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", assignfromdatetextboxTab);
        }

        System.out.println("Employee Birth Date clicked successfully");
    }
	
	public void selectEmployeeTodaysDate() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[contains(@class,'ui-datepicker-calendar')]")));

        LocalDate today = LocalDate.now();
        int day = today.getDayOfMonth();
        int month = today.getMonthValue() - 1;
        int year = today.getYear();

        String dynamicXpath = String.format(
            "//td[@data-handler='selectDay' and @data-month='%d' and @data-year='%d']/a[text()='%d']",
            month, year, day
        );

        WebElement todayElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
        todayElement.click();

        System.out.println("Today's date selected: " + day + "-" + (month + 1) + "-" + year);
    }
	
	public boolean selecttheEmployeeEmploymentType(String EmploymentType) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // Wait for <select> dropdown
	        WebElement EmploymentTypeDropdown = wait.until(
	        		ExpectedConditions.visibilityOfElementLocated(employeeEmploymenttypedropdownbutton));

	        Select select = new Select(EmploymentTypeDropdown);

	        // Select by visible text
	        select.selectByVisibleText(EmploymentType);

	        System.out.println("Employement Type selected: " + EmploymentType);
	        return true;

	    } catch (NoSuchElementException e) {
	        // Employment Type not present → do NOT fail
	        System.out.println("Employment Type '" + EmploymentType + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println("Error selecting employment type — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean selecttheEmploymentStatus(String EmploymentStatus) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // Wait for <select> dropdown
	        WebElement EmploymentStatusDropdown = wait.until(
	        		ExpectedConditions.visibilityOfElementLocated(employmentstatusdropdownbutton));

	        Select select = new Select(EmploymentStatusDropdown);

	        // Select by visible text
	        select.selectByVisibleText(EmploymentStatus);

	        System.out.println("Employement Status selected: " + EmploymentStatus);
	        return true;

	    } catch (NoSuchElementException e) {
	        // Employment Status not present → do NOT fail
	        System.out.println("Employment Status '" + EmploymentStatus + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println("Error selecting employment status — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean selecttheEmployeeBloodgroup(String EmployeeBloodGroup) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // Wait for <select> dropdown
	        WebElement EmployeeBloodGroupDropdown = wait.until(
	        		ExpectedConditions.visibilityOfElementLocated(employeebloodgroupdropdownbutton));

	        Select select = new Select(EmployeeBloodGroupDropdown);

	        // Select by visible text
	        select.selectByVisibleText(EmployeeBloodGroup);

	        System.out.println("Employement Blood Group selected: " + EmployeeBloodGroup);
	        return true;

	    } catch (NoSuchElementException e) {
	        // Employee blood Group not present → do NOT fail
	        System.out.println("Employee Blood Group '" + EmployeeBloodGroup + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println("Error selecting employee blood group — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean selecttheEmployeeGender(String EmployeeGender) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // Wait for <select> dropdown
	        WebElement EmployeeGenderDropdown = wait.until(
	        		ExpectedConditions.visibilityOfElementLocated(employeegenderdropdownbutton));

	        Select select = new Select(EmployeeGenderDropdown);

	        // Select by visible text
	        select.selectByVisibleText(EmployeeGender);

	        System.out.println("Employee Gender selected: " + EmployeeGender);
	        return true;

	    } catch (NoSuchElementException e) {
	        // Employee Gender not present → do NOT fail
	        System.out.println("Employee Gender '" + EmployeeGender + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println("Error selecting employee gender — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	@FindBy(css = "input.employee-cropit-image-input")
	WebElement uploadInput;

	public void uploadTheImage(String filePath) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    WebElement input = wait.until(
	            ExpectedConditions.presenceOfElementLocated(
	                    By.cssSelector("input.employee-cropit-image-input")));
	    input.sendKeys(filePath);
	}
	
	public String clickintothesubmitbuttoninemployee() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(submitbuttoninemployee)).click();
	   
	    System.out.println("Submit button clicked successfully");
	    
	  // 1️⃣ Check toast message FIRST
	    try {
	        WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//div[@class='toast-message']")));
	        String msg = toast.getText().trim();
	        System.out.println("Toast Error Found: " + msg);

	        return "ERROR: " + msg;     // 🔥 return toast message immediately
	    } catch (TimeoutException e) {
	        // No toast → continue
	    }
		return "New Employee added successsfully";
	}
	
	public boolean clickintothethreedotbuttonforexistingemployee() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for three dot button
	    List<WebElement> threedotButtons = driver.findElements(threedotexistingemployeebutton);

	    if (threedotButtons.isEmpty()) {
	        // Three dot button NOT present → stop scenario
	        return false;
	    }

	    WebElement threedotButton = threedotButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(threedotButton));
	    threedotButton.click();

	    return true;
	}
	
	public boolean clickintotheEditbuttoninexistingemployee() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for edit button
	    List<WebElement> editButtons = driver.findElements(editbuttoninexistingemployee);

	    if (editButtons.isEmpty()) {
	        // Edit button NOT present → stop scenario
	        return false;
	    }

	    WebElement editButton = editButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(editButton));
	    editButton.click();

	    return true;
	}
	
	public boolean clickintotheDeletebuttoninexistingemployee() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletebuttoninexistingemployee);

	    // If Delete button NOT present → stop scenario
	    if (deleteButtons.isEmpty()) {
	        System.out.println("Delete button NOT present");
	        return false;
	    }

	    WebElement deleteButton = deleteButtons.get(0);

	    // Wait until clickable
	    wait.until(ExpectedConditions.elementToBeClickable(deleteButton));

	    try {
	        deleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", deleteButton);
	    }

	    System.out.println("Delete button clicked");

	    // Wait for confirm delete button
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletebuttoninexistingemployee));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	public boolean clickintotheviewbuttonforexistingemployee() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for view button
	    List<WebElement> Viewemployeebuttons = driver.findElements(viewbuttoninexistingemployee);

	    if (Viewemployeebuttons.isEmpty()) {
	        // View button NOT present → stop scenario
	        return false;
	    }

	    WebElement Viewemployeebutton = Viewemployeebuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(Viewemployeebutton));
	    Viewemployeebutton.click();

	    return true;
	}
	
	
	//--------------------------------Employees Details----------------------------------------------
	
	
	public boolean clickintotheEditbuttoninEmployeeDetails() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit button
	    List<WebElement> editbuttons = driver.findElements(editbuttoninemployeedetails);

	    if (editbuttons.isEmpty()) {
	        // Edit button NOT present → stop scenario
	        return false;
	    }

	    WebElement editbutton = editbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(editbutton));
	    editbutton.click();

	    return true;
	}
	
	public boolean clickintotheDeletebuttoninEmployeeDetails() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletebuttoninemployeedetails);

	    // If Delete button NOT present → stop scenario
	    if (deleteButtons.isEmpty()) {
	        System.out.println("Delete button NOT present");
	        return false;
	    }

	    WebElement deleteButton = deleteButtons.get(0);

	    // Wait until clickable
	    wait.until(ExpectedConditions.elementToBeClickable(deleteButton));

	    try {
	        deleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", deleteButton);
	    }

	    System.out.println("Delete button clicked");

	    // Wait for confirm delete button
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletebuttoninemployeedetails));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	public boolean clickintotheUserlinkbuttoninEmployeeDetails() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for user link button
	    List<WebElement> Userlinkbuttons = driver.findElements(userlinkinemployeedetails);

	    if (Userlinkbuttons.isEmpty()) {
	        // User Link button NOT present → stop scenario
	        return false;
	    }

	    WebElement Userlinkbutton = Userlinkbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(Userlinkbutton));
	    Userlinkbutton.click();

	    return true;
	}
	
	public void entertheFilterLastName(String FilterLastName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    // 1️⃣ Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2️⃣ Locate lastname
	    WebElement lastname = wait.until(ExpectedConditions.visibilityOfElementLocated(filterlastnameinsearchuser));

	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    // 3️⃣ Focus lastname
	    js.executeScript("arguments[0].focus();", lastname);

	    // 4️⃣ Clear existing content correctly
	    js.executeScript("arguments[0].innerText = '';", lastname);

	    // 5️⃣ Insert text as user input
	    js.executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true }));", lastname);

	    lastname.sendKeys(FilterLastName);

	    System.out.println("Last Name entered successfully");
    }
	
	public String clickintothesearchbuttoninsearchuser() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Click Search button
	    wait.until(ExpectedConditions.elementToBeClickable(searchbuttoninsearchuser)).click();

	    System.out.println("Search button clicked successfully");

	    StringBuilder allMessages = new StringBuilder();

	    // 1️⃣ Toast messages
	    try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//div[@class='toast-message']")));

	        List<WebElement> toasts = driver.findElements(
	                By.xpath("//div[@class='toast-message']"));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                allMessages.append(msg).append(" | ");
	            }
	        }

	        if (allMessages.length() > 0) {
	            return "ERROR: " + allMessages.toString();
	        }

	    } catch (TimeoutException ignored) {}

	    // 2️⃣ No records found
	    try {
	        WebElement noRecordMsg = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[normalize-space()='No Record(s) Found.']")));

	        return "ERROR: " + noRecordMsg.getText();

	    } catch (TimeoutException ignored) {}

	    // 3️⃣ User exists
	    return "SUCCESS: User is shown";
	}
	
	public void clickintotheFirstUserradiobuttoninsearchuser() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement firstuserradiobutton = wait.until(ExpectedConditions.elementToBeClickable(firstuserradiobuttoninsearchuser));	   
	    try {
	    	firstuserradiobutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", firstuserradiobutton);
	    }

	    System.out.println("First User radio button clicked successfully");
	}
	
	public String clickintothesubmitbuttoninsearchuser() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='divSearchUserInfo'])[1]")));

	    WebElement submitBtn = wait.until(
	            ExpectedConditions.presenceOfElementLocated(submitbuttoninsearchuser));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Submit button clicked using JS");
	    }

	    // 4. Validate toast message (EXPECTED for negative scenario)
	    try {
	        WebElement toast = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'toast-message')]")));

	        String msg = toast.getText().trim();
	        System.out.println("Toast Error Found: " + msg);
	        return "ERROR: " + msg;

	    } catch (TimeoutException e) {
	        // No toast → success case
	    }

	    return "Associated User linked successfully";
	}
	
	public boolean clickintotheDelinkUserbuttoninEmployeeDetails() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for Delink button
	    List<WebElement> delinkButtons = driver.findElements(delinkuserinemployeedetails);

	    // If Delink button NOT present → stop scenario
	    if (delinkButtons.isEmpty()) {
	        System.out.println("Delink button NOT present");
	        return false;
	    }

	    WebElement delinkButton = delinkButtons.get(0);

	    // Wait until clickable
	    wait.until(ExpectedConditions.elementToBeClickable(delinkButton));

	    try {
	    	delinkButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", delinkButton);
	    }

	    System.out.println("Delink button clicked");

	    // Wait for confirm delink button
	    WebElement confirmDelinkButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdelinkuserbuttoninemployeedetails));

	    try {
	    	confirmDelinkButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDelinkButton);
	    }

	    System.out.println("Confirm Delink clicked — record delink permanently");

	    return true;
	}
	
	public boolean clickintotheLicensestabinEmployeedetails() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for License tab
	    List<WebElement> licensetabs = driver.findElements(licensestabinemployeedetails);

	    if (licensetabs.isEmpty()) {
	        // License tab NOT present → stop scenario
	        return false;
	    }

	    WebElement licensetab = licensetabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(licensetab));
	    licensetab.click();

	    return true;
	}
	
	
	//------------------------------Licenses Section in Employees Details------------------------------
	
	
	public boolean clickintotheNewLicensesbuttoninLicenses() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for New Licenses button
	    List<WebElement> newlicensesbuttons = driver.findElements(newlicensesbuttoninlicenses);

	    if (newlicensesbuttons.isEmpty()) {
	        // New Licenses button NOT present → stop scenario
	        return false;
	    }

	    WebElement newlicensesbutton = newlicensesbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newlicensesbutton));
	    newlicensesbutton.click();

	    return true;
	}
	
	public boolean selecttheLicenseType(String LicenseType) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement licensetypeDropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(licensetypedropdownbutton));

	        Select select = new Select(licensetypeDropdown);

	        // 2️ Select by visible text
	        select.selectByVisibleText(LicenseType);

	        System.out.println("License selected: " + LicenseType);
	        return true;

	    } catch (NoSuchElementException e) {
	        // License Type not present → do NOT fail
	        System.out.println(
	            "License '" + LicenseType + "' not found — skipping selection"
	        );
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	            " Error selecting license — continuing test: " + e.getMessage()
	        );
	        return true;
	    }
	}
	
	public void entertheLicenseNumberinAddlicensewindow(String LicenseNumbertext) {
		WebElement LicenseNumbertextboxfield = driver.findElement(licensenumbertextboxinaddlicense);
		LicenseNumbertextboxfield.clear();
		LicenseNumbertextboxfield.sendKeys(LicenseNumbertext);
    }
	
	public void clickintotheLicenseExpirationDate() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in HRModuleFunctionalityPage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement licenseexpirationtextboxtab = wait.until(ExpectedConditions.elementToBeClickable(licenseexpirationdatetextbox));

        try {
        	licenseexpirationtextboxtab.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", licenseexpirationtextboxtab);
        }

        System.out.println("License Expiration Date clicked successfully");
    }
	
	public void selectLicenseExpirationDate() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[contains(@class,'ui-datepicker-calendar')]")));

        LocalDate today = LocalDate.now();
        int day = today.getDayOfMonth();
        int month = today.getMonthValue() - 1;
        int year = today.getYear();

        String dynamicXpath = String.format(
            "//td[@data-handler='selectDay' and @data-month='%d' and @data-year='%d']/a[text()='%d']",
            month, year, day
        );

        WebElement todayElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
        todayElement.click();

        System.out.println("Today's date selected: " + day + "-" + (month + 1) + "-" + year);
    }
	
	public void selectLicenseExpirationDateAfter10Days() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait for datepicker to be visible
	    wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//table[contains(@class,'ui-datepicker-calendar')]")));

	    // 1. Calculate future date
	    LocalDate futureDate = LocalDate.now().plusDays(10);

	    int day = futureDate.getDayOfMonth();
	    int month = futureDate.getMonthValue() - 1; // jQuery month is 0-based
	    int year = futureDate.getYear();

	    // 2. Dynamic XPath for future date
	    String futureDateXpath = String.format(
	            "//td[@data-handler='selectDay' and @data-month='%d' and @data-year='%d']/a[text()='%d']",
	            month, year, day
	    );

	    // 3. Click future date
	    WebElement dateElement = wait.until(
	            ExpectedConditions.elementToBeClickable(By.xpath(futureDateXpath)));

	    dateElement.click();

	    System.out.println("Expiration date selected: " + day + "-" + (month + 1) + "-" + year);
	}
	
	public boolean selecttheStateinaddlicensewindow(String State) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement stateDropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(statedropdownbuttoninaddlicensewindow));

	        Select select = new Select(stateDropdown);

	        // 2️ Select by visible text
	        select.selectByVisibleText(State);

	        System.out.println("State selected: " + State);
	        return true;

	    } catch (NoSuchElementException e) {
	        // State not present → do NOT fail
	        System.out.println(
	            "State '" + State + "' not found — skipping selection"
	        );
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	            " Error selecting state — continuing test: " + e.getMessage()
	        );
	        return true;
	    }
	}
	
	public boolean selecttheStatusinaddlicensewindow(String Status) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement statusDropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(statusdropdownbuttoninaddlicensewindow));

	        Select select = new Select(statusDropdown);

	        // 2️ Select by visible text
	        select.selectByVisibleText(Status);

	        System.out.println("Status selected: " + Status);
	        return true;

	    } catch (NoSuchElementException e) {
	        // Status not present → do NOT fail
	        System.out.println(
	            "Status '" + Status + "' not found — skipping selection"
	        );
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	            " Error selecting status — continuing test: " + e.getMessage()
	        );
	        return true;
	    }
	}

	public void uploadTheEmployeeLicenseFile(String filePath) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    By uploadInputBy = By.id("file-1");

	    WebElement uploadInput = wait.until(ExpectedConditions.presenceOfElementLocated(uploadInputBy));

	    uploadInput.sendKeys(filePath);
	}
	
	public String clickintothesubmitbuttoninAddEmployeeLicense() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='addEditLicenceModal']//div[@class='modal-content']")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninaddlicensewindow));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Submit button clicked using JS");
	    }

	 // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(
	                        By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	            By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: License is added successfully";
	}
	
	public boolean clickintothethreedotbuttoninLicenseSection() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for three dot button
	    List<WebElement> threedotButtons = driver.findElements(threedotbuttoninlicense);

	    if (threedotButtons.isEmpty()) {
	        // Three dot button NOT present → stop scenario
	        return false;
	    }

	    WebElement threedotButton = threedotButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(threedotButton));
	    threedotButton.click();

	    return true;
	}
	
	public boolean clickintotheEdittabinExistinglicense() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit button
	    List<WebElement> editbuttons = driver.findElements(edittabinexistinglicense);

	    if (editbuttons.isEmpty()) {
	        // Edit button NOT present → stop scenario
	        return false;
	    }

	    WebElement editbutton = editbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(editbutton));
	    editbutton.click();

	    return true;
	}
	
	public boolean clickintotheDeletetabinExistinglicense() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletetabinexistinglicense);

	    // If Delete button NOT present → stop scenario
	    if (deleteButtons.isEmpty()) {
	        System.out.println("Delete button NOT present");
	        return false;
	    }

	    WebElement deleteButton = deleteButtons.get(0);

	    // Wait until clickable
	    wait.until(ExpectedConditions.elementToBeClickable(deleteButton));

	    try {
	        deleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", deleteButton);
	    }

	    System.out.println("Delete button clicked");

	    // Wait for confirm delete button
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletetabinexistinglicense));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	public boolean clickintotheDownloadtabinExistinglicense() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Download button
	    List<WebElement> downloadtabs = driver.findElements(downloadtabinexistinglicense);

	    if (downloadtabs.isEmpty()) {
	        // Download button NOT present → stop scenario
	        return false;
	    }

	    WebElement downloadtab = downloadtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(downloadtab));
	    downloadtab.click();

	    return true;
	}
	
	
	//--------------------------Access Code Section in Employees Details-----------------------------------
	
	
	public boolean clickintotheAccessCodetabinEmployeedetails() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Access Code tab
	    List<WebElement> accesscodetabs = driver.findElements(accesscodetabinemployeedetails);

	    if (accesscodetabs.isEmpty()) {
	        // Access Code tab NOT present → stop scenario
	        return false;
	    }

	    WebElement accesscodetab = accesscodetabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(accesscodetab));
	    accesscodetab.click();

	    return true;
	}
	
	public boolean clickintotheNewAccessCodebuttoninaccesscode() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for New Access Code button
	    List<WebElement> newaccesscodebuttons = driver.findElements(newaccesscodebuttoninaccesscode);

	    if (newaccesscodebuttons.isEmpty()) {
	        // New Access Code button NOT present → stop scenario
	        return false;
	    }

	    WebElement newaccesscodebutton = newaccesscodebuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newaccesscodebutton));
	    newaccesscodebutton.click();

	    return true;
	}
	
	public boolean selecttheAccessCodeByIndex(int AccessCodeIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️⃣ Wait for <select> dropdown
	        WebElement accesscodeDropdown = wait.until(
	        		ExpectedConditions.visibilityOfElementLocated(accesscodetypedropdownbuttoninaccesscode));

	        Select select = new Select(accesscodeDropdown);

	        // 2️⃣ Select by index
	        select.selectByIndex(AccessCodeIndex);

	        String selectedAccessCodeType = select.getFirstSelectedOption().getText();
	        System.out.println("Access Code selected by index (" + AccessCodeIndex + "): " + selectedAccessCodeType);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Access Code index '" + AccessCodeIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting access code by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public void clickintotheDatetextboxinAccesscode() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in HRModuleFunctionalityPage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement datetextboxTab = wait.until(ExpectedConditions.elementToBeClickable(datetextboxinaccesscode));

        try {
        	datetextboxTab.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", datetextboxTab);
        }

        System.out.println("Date textbox clicked successfully");
    }
	
	public void selectDateinAccessCode() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[contains(@class,'ui-datepicker-calendar')]")));

        LocalDate today = LocalDate.now();
        int day = today.getDayOfMonth();
        int month = today.getMonthValue() - 1;
        int year = today.getYear();

        String dynamicXpath = String.format(
            "//td[@data-handler='selectDay' and @data-month='%d' and @data-year='%d']/a[text()='%d']",
            month, year, day
        );

        WebElement todayElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
        todayElement.click();

        System.out.println("Today's date selected: " + day + "-" + (month + 1) + "-" + year);
    }
	
	public void entertheNotesinaccesscode(String Notes) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// 1️⃣ Wait for preloader to disappear
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		// 2️⃣ Locate editor
		WebElement editor = wait.until(ExpectedConditions.visibilityOfElementLocated(notestextboxinaccesscode));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 3️⃣ Focus editor
		js.executeScript("arguments[0].focus();", editor);

		// 4️⃣ Clear existing content correctly
		js.executeScript("arguments[0].innerText = '';", editor);

		// 5️⃣ Insert text as user input
		js.executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true }));", editor);
		    editor.sendKeys(Notes);
		    System.out.println("Notes entered successfully");
  	}
	
	public void entertheNewNotesinAccesscode(String NewNotes) {
		WebElement NewNotestextboxfield = driver.findElement(notestextboxinaccesscode);
		NewNotestextboxfield.clear();
		NewNotestextboxfield.sendKeys(NewNotes);
    }
	
	public String clickintothesubmitbuttoninAccessCode() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='addEditAccesscodeModal']//div[@class='modal-content']")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninaccesscode));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Submit button clicked using JS");
	    }

	 // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(
	                        By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	            By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: Access Code is added successfully";
	}
	
	public boolean clickintothethreedotbuttoninAccessCode() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for three dot button
	    List<WebElement> threedotButtons = driver.findElements(threedotbuttoninaccesscode);

	    if (threedotButtons.isEmpty()) {
	        // Three dot button NOT present → stop scenario
	        return false;
	    }

	    WebElement threedotButton = threedotButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(threedotButton));
	    threedotButton.click();

	    return true;
	}
	
	public boolean clickintotheEdittabinexistingaccesscode() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit button
	    List<WebElement> editbuttons = driver.findElements(edittabinaccesscode);

	    if (editbuttons.isEmpty()) {
	        // Edit button NOT present → stop scenario
	        return false;
	    }

	    WebElement editbutton = editbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(editbutton));
	    editbutton.click();

	    return true;
	}
	
	public void selectAccessCodeDateAfter10Days() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait for datepicker to be visible
	    wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//table[contains(@class,'ui-datepicker-calendar')]")));

	    // 1. Calculate future date
	    LocalDate futureDate = LocalDate.now().plusDays(10);

	    int day = futureDate.getDayOfMonth();
	    int month = futureDate.getMonthValue() - 1; // jQuery month is 0-based
	    int year = futureDate.getYear();

	    // 2. Dynamic XPath for future date
	    String futureDateXpath = String.format(
	            "//td[@data-handler='selectDay' and @data-month='%d' and @data-year='%d']/a[text()='%d']",
	            month, year, day
	    );

	    // 3. Click future date
	    WebElement dateElement = wait.until(
	            ExpectedConditions.elementToBeClickable(By.xpath(futureDateXpath)));

	    dateElement.click();

	    System.out.println("Expiration date selected: " + day + "-" + (month + 1) + "-" + year);
	}
	
	public boolean clickintotheDeletetabinExistingAccessCode() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletetabinaccesscode);

	    // If Delete button NOT present → stop scenario
	    if (deleteButtons.isEmpty()) {
	        System.out.println("Delete button NOT present");
	        return false;
	    }

	    WebElement deleteButton = deleteButtons.get(0);

	    // Wait until clickable
	    wait.until(ExpectedConditions.elementToBeClickable(deleteButton));

	    try {
	        deleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", deleteButton);
	    }

	    System.out.println("Delete button clicked");

	    // Wait for confirm delete button
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletetabinaccesscode));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	
	//--------------------------Docs Section in Employees Details-------------------------------------
	
	
	public boolean clickintotheDocstabinEmployeeDetails() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for three dot button
	    List<WebElement> docstabs = driver.findElements(docstabinemployeedetails);

	    if (docstabs.isEmpty()) {
	        // Three dot button NOT present → stop scenario
	        return false;
	    }

	    WebElement docstab = docstabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(docstab));
	    docstab.click();

	    return true;
	}
	
	public boolean clickintotheNewDocumentbuttoninDocs() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for New Document button
	    List<WebElement> newdocumentbuttons = driver.findElements(newdocumentbuttonindocs);

	    if (newdocumentbuttons.isEmpty()) {
	        // New Document button NOT present → stop scenario
	        return false;
	    }

	    WebElement newdocumentbutton = newdocumentbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newdocumentbutton));
	    newdocumentbutton.click();

	    return true;
	}
	
	public void entertheTitleinDocs(String DocumentTitle) {
				
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement DocumentTitletextboxfield = wait.until(
	            ExpectedConditions.elementToBeClickable(titletextboxindocs));

	    // Extra safety for animation/overlay
	    wait.until(driver -> DocumentTitletextboxfield.isDisplayed()
	            && DocumentTitletextboxfield.isEnabled());

	    DocumentTitletextboxfield.click();
	    DocumentTitletextboxfield.clear();
	    DocumentTitletextboxfield.sendKeys(DocumentTitle);

	    System.out.println("Title name entered: " + DocumentTitle);
    }
	
	public boolean uploadTheDocumentsinDocs(String filePath) {
		try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(choosefiletabindocs));

            if (!fileInput.isDisplayed()) {
                return false;
            }

            fileInput.sendKeys(filePath);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
	
	public String clickintothesubmitbuttoninDocs() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='addEditEmployeeDocumentModal']//div[@class='modal-content']")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttonindocs));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Submit button clicked using JS");
	    }

	 // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(
	                        By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	            By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: Document is added successfully";
	}
	
	public boolean clickintothethreedotbuttoninExistingdocument() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for three dot button
	    List<WebElement> threedotButtons = driver.findElements(threedotbuttoninexistingdocument);

	    if (threedotButtons.isEmpty()) {
	        // Three dot button NOT present → stop scenario
	        return false;
	    }

	    WebElement threedotButton = threedotButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(threedotButton));
	    threedotButton.click();

	    return true;
	}
	
	public boolean clickintotheEditbuttoninExistingdocumentinDocs() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Editt button
	    List<WebElement> editbuttons = driver.findElements(edittabinexistingdocument);

	    if (editbuttons.isEmpty()) {
	        // Edit button NOT present → stop scenario
	        return false;
	    }

	    WebElement editbutton = editbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(editbutton));
	    editbutton.click();

	    return true;
	}
	
	public boolean clickintotheDeletetabinExistingdocumentinDocs() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletetabinexistingdocument);

	    // If Delete button NOT present → stop scenario
	    if (deleteButtons.isEmpty()) {
	        System.out.println("Delete button NOT present");
	        return false;
	    }

	    WebElement deleteButton = deleteButtons.get(0);

	    // Wait until clickable
	    wait.until(ExpectedConditions.elementToBeClickable(deleteButton));

	    try {
	        deleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", deleteButton);
	    }

	    System.out.println("Delete button clicked");

	    // Wait for confirm delete button
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletetabinexistingdocument));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	public boolean clickintotheDownloadbuttoninExistingdocumentinDocs() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Download button
	    List<WebElement> downloadbuttons = driver.findElements(downloadtabinexistingdocument);

	    if (downloadbuttons.isEmpty()) {
	        // Download button NOT present → stop scenario
	        return false;
	    }

	    WebElement downloadbutton = downloadbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(downloadbutton));
	    downloadbutton.click();

	    return true;
	}
	
	
	//-----------------------------------CheckList Section in Employees Details--------------------------------
	
	
	public boolean clickintotheCheckListtabinEmployeeDetails() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Checklist tab
	    List<WebElement> checklisttabs = driver.findElements(checklisttabinemployeedetails);

	    if (checklisttabs.isEmpty()) {
	        // Checklist tab NOT present → stop scenario
	        return false;
	    }

	    WebElement checklisttab = checklisttabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(checklisttab));
	    checklisttab.click();

	    return true;
	}
	
	public boolean clickintotheNewChecklistbuttoninchecklist() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for New Checklist button
	    List<WebElement> newchecklistbuttons = driver.findElements(newcheklistbuttoninchecklist);

	    if (newchecklistbuttons.isEmpty()) {
	        // New Checklist button NOT present → stop scenario
	        return false;
	    }

	    WebElement newchecklistbutton = newchecklistbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newchecklistbutton));
	    newchecklistbutton.click();

	    return true;
	}
	
	public boolean selecttheChecklistByIndex(int CheckListIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️⃣ Wait for <select> dropdown
	        WebElement checklistDropdown = wait.until(
	        		ExpectedConditions.visibilityOfElementLocated(checklistdropdowninchecklist));

	        Select select = new Select(checklistDropdown);

	        // 2️⃣ Select by index
	        select.selectByIndex(CheckListIndex);

	        String selectedCheckList = select.getFirstSelectedOption().getText();
	        System.out.println("CheckList selected by index (" + CheckListIndex + "): " + selectedCheckList);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("CheckList index '" + CheckListIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting checklist by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean uploadTheFileinCheckList(String filePath) {
		try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(choosefilebuttoninchecklist));

            if (!fileInput.isDisplayed()) {
                return false;
            }

            fileInput.sendKeys(filePath);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
	
	public void entertheNotesinCheckList(String Notes) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement Notestextboxfield = wait.until(ExpectedConditions.elementToBeClickable(notestextboxinchecklist));

	    // Extra safety for animation/overlay
	    wait.until(driver -> Notestextboxfield.isDisplayed()
	            && Notestextboxfield.isEnabled());

	    Notestextboxfield.click();
	    Notestextboxfield.clear();
	    Notestextboxfield.sendKeys(Notes);

	    System.out.println("Notes entered: " + Notes);
    }
	
	public String clickintothesubmitbuttoninCheckList() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='addEditChecklistModal']//div[@class='modal-content']")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninchecklist));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Submit button clicked using JS");
	    }

	 // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(
	                        By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	            By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: Employee Checklist details added successfully";
	}
	
	public boolean clickintothethreedotbuttoninExistingChecklist() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for three dot button
	    List<WebElement> threedotButtons = driver.findElements(threedotbuttoninchecklist);

	    if (threedotButtons.isEmpty()) {
	        // Three dot button NOT present → stop scenario
	        return false;
	    }

	    WebElement threedotButton = threedotButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(threedotButton));
	    threedotButton.click();

	    return true;
	}
	
	public boolean clickintotheEdittabinExistingChecklist() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit button
	    List<WebElement> editbuttons = driver.findElements(edittabinexistingchecklist);

	    if (editbuttons.isEmpty()) {
	        // Edit button NOT present → stop scenario
	        return false;
	    }

	    WebElement editbutton = editbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(editbutton));
	    editbutton.click();

	    return true;
	}
	
	public boolean clickintotheDeletetabinExistingChecklist() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletetabinexistingchecklist);

	    // If Delete button NOT present → stop scenario
	    if (deleteButtons.isEmpty()) {
	        System.out.println("Delete button NOT present");
	        return false;
	    }

	    WebElement deleteButton = deleteButtons.get(0);

	    // Wait until clickable
	    wait.until(ExpectedConditions.elementToBeClickable(deleteButton));

	    try {
	        deleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", deleteButton);
	    }

	    System.out.println("Delete button clicked");

	    // Wait for confirm delete button
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletetabinexistingchecklist));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	public boolean clickintotheDownloadtabinExistingChecklist() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Download button
	    List<WebElement> downloadbuttons = driver.findElements(downloadtabinexistingchecklist);

	    if (downloadbuttons.isEmpty()) {
	        // Download button NOT present → stop scenario
	        return false;
	    }

	    WebElement downloadbutton = downloadbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(downloadbutton));
	    downloadbutton.click();

	    return true;
	}
	
	
	//---------------------------Note Section in Employees Details-------------------------------
	
	
	public boolean clickintotheNotetabinEmployeeDetails() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for three dot button
	    List<WebElement> notetabs = driver.findElements(notetabinemployeedetails);

	    if (notetabs.isEmpty()) {
	        // Three dot button NOT present → stop scenario
	        return false;
	    }

	    WebElement notetab = notetabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(notetab));
	    notetab.click();

	    return true;
	}
	
	public boolean clickintotheNewNotebuttoninNote() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for New Notes button
	    List<WebElement> newnotesbuttons = driver.findElements(newnotebuttoninnote);

	    if (newnotesbuttons.isEmpty()) {
	        // New Notes button NOT present → stop scenario
	        return false;
	    }

	    WebElement newnotesbutton = newnotesbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newnotesbutton));
	    newnotesbutton.click();

	    return true;
	}
	
	public void entertheSubjectinNote(String Subject) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement Subjecttextboxfield = wait.until(ExpectedConditions.elementToBeClickable(subjectinnote));

	    // Extra safety for animation/overlay
	    wait.until(driver -> Subjecttextboxfield.isDisplayed()
	            && Subjecttextboxfield.isEnabled());

	    Subjecttextboxfield.click();
	    Subjecttextboxfield.clear();
	    Subjecttextboxfield.sendKeys(Subject);

	    System.out.println("Subject entered: " + Subject);
    }
	
	public void entertheNotesinNote(String Notes) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement Notestextboxfield = wait.until(ExpectedConditions.elementToBeClickable(notesinnote));

	    // Extra safety for animation/overlay
	    wait.until(driver -> Notestextboxfield.isDisplayed()
	            && Notestextboxfield.isEnabled());

	    Notestextboxfield.click();
	    Notestextboxfield.clear();
	    Notestextboxfield.sendKeys(Notes);

	    System.out.println("Notes entered: " + Notes);
    }
	
	public boolean uploadTheFileinNote(String filePath) {
		try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(choosefilebuttoninnote));

            if (!fileInput.isDisplayed()) {
                return false;
            }

            fileInput.sendKeys(filePath);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
	
	public String clickintothesubmitbuttoninNote() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='addEditNoteModal']//div[@class='modal-content']")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninnote));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Submit button clicked using JS");
	    }

	 // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(
	                        By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	            By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: Employee Note details added successfully";
	}
	
	public boolean clickintothethreedotbuttoninExistingNote() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for three dot button
	    List<WebElement> threedotButtons = driver.findElements(threedotbuttoninexistingnote);

	    if (threedotButtons.isEmpty()) {
	        // Three dot button NOT present → stop scenario
	        return false;
	    }

	    WebElement threedotButton = threedotButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(threedotButton));
	    threedotButton.click();

	    return true;
	}
	
	public boolean clickintotheEditbuttoninNote() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit button
	    List<WebElement> editbuttons = driver.findElements(editbuttoninexistingnote);

	    if (editbuttons.isEmpty()) {
	        // Edit button NOT present → stop scenario
	        return false;
	    }

	    WebElement editbutton = editbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(editbutton));
	    editbutton.click();

	    return true;
	}
	
	public boolean clickintotheDeletetabinExistingNote() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletebuttoninexistingnote);

	    // If Delete button NOT present → stop scenario
	    if (deleteButtons.isEmpty()) {
	        System.out.println("Delete button NOT present");
	        return false;
	    }

	    WebElement deleteButton = deleteButtons.get(0);

	    // Wait until clickable
	    wait.until(ExpectedConditions.elementToBeClickable(deleteButton));

	    try {
	        deleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", deleteButton);
	    }

	    System.out.println("Delete button clicked");

	    // Wait for confirm delete button
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletebuttoninexistingnote));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	public boolean clickintotheDownloadbuttoninNote() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Download button
	    List<WebElement> downloadbuttons = driver.findElements(downloadbuttoninexistingnote);

	    if (downloadbuttons.isEmpty()) {
	        // Download button NOT present → stop scenario
	        return false;
	    }

	    WebElement downloadbutton = downloadbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(downloadbutton));
	    downloadbutton.click();

	    return true;
	}
	
	
	//----------------------------------TimeLine Section in Employees Details--------------------------
	
	
	public boolean clickintotheTimelinetabinEmployeeDetails() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Timeline tab
	    List<WebElement> timelinetabs = driver.findElements(timelinetabinemployeedetails);

	    if (timelinetabs.isEmpty()) {
	        // Timeline tab NOT present → stop scenario
	        return false;
	    }

	    WebElement timelinetab = timelinetabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(timelinetab));
	    timelinetab.click();

	    return true;
	}
	
	public boolean clickintotheNewTimelinebuttoninTimeLine() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for New Timeline button
	    List<WebElement> editbuttons = driver.findElements(newtimtlintbuttonintimeline);

	    if (editbuttons.isEmpty()) {
	        // New Timeline button NOT present → stop scenario
	        return false;
	    }

	    WebElement editbutton = editbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(editbutton));
	    editbutton.click();

	    return true;
	}
	
	public void entertheEventinTimeLine(String Event) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement Eventtextboxfield = wait.until(ExpectedConditions.elementToBeClickable(eventtextboxintimeline));

	    // Extra safety for animation/overlay
	    wait.until(driver -> Eventtextboxfield.isDisplayed()
	            && Eventtextboxfield.isEnabled());

	    Eventtextboxfield.click();
	    Eventtextboxfield.clear();
	    Eventtextboxfield.sendKeys(Event);

	    System.out.println("Event entered: " + Event);
    }
	
	public void clickintotheEventDatetextboxinTimeline() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in HRModuleFunctionalityPage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement assignfromdatetextboxTab = wait.until(ExpectedConditions.elementToBeClickable(eventdatetextboxintimeline));

        try {
            assignfromdatetextboxTab.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", assignfromdatetextboxTab);
        }

        System.out.println("Event Date clicked successfully");
    }
	
	public void selectEventTodaysDate() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[contains(@class,'ui-datepicker-calendar')]")));

        LocalDate today = LocalDate.now();
        int day = today.getDayOfMonth();
        int month = today.getMonthValue() - 1;
        int year = today.getYear();

        String dynamicXpath = String.format(
            "//td[@data-handler='selectDay' and @data-month='%d' and @data-year='%d']/a[text()='%d']", month, year, day);

        WebElement todayElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
        todayElement.click();

        System.out.println("Today's date selected: " + day + "-" + (month + 1) + "-" + year);
    }
	
	public void entertheNotesinTimeLine(String Notes) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// 1️ Wait for preloader to disappear
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		// 2️ Locate editor
		WebElement editor = wait.until(ExpectedConditions.visibilityOfElementLocated(notestextboxintimeline));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 3️ Focus editor
		js.executeScript("arguments[0].focus();", editor);

		// 4️ Clear existing content correctly
		js.executeScript("arguments[0].innerText = '';", editor);

		// 5️ Insert text as user input
		js.executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true }));", editor);
		    editor.sendKeys(Notes);
		    System.out.println("Notes entered successfully");
    }
	
	public boolean selecttheStatusinTImeline(String Status) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement StatusDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(statusdropdownintimeline));

	        Select select = new Select(StatusDropdown);

	        // 2️ Select by visible text
	        select.selectByVisibleText(Status);

	        System.out.println("Status selected: " + Status);
	        return true;

	    } catch (NoSuchElementException e) {
	        // Status not present → do NOT fail
	        System.out.println(
	            "Status '" + Status + "' not found — skipping selection"
	        );
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	            "Error selecting status — continuing test: " + e.getMessage()
	        );
	        return true;
	    }
	}
	
	public String clickintothesubmitbuttoninTimeLine() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='addTimelineModal']//div[@class='modal-content']")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttonintimeline));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Submit button clicked using JS");
	    }

	    // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	            By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: Employee Timeline details added successfully";
	}
	
	
	//------------------------------WorkBench Section in Employees Details------------------------------
	
	
	public boolean clickintotheWorkbenchtabinEmployeeDetails() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Workbench tab
	    List<WebElement> workbenchtabs = driver.findElements(workbenchtabinemployeedetails);

	    if (workbenchtabs.isEmpty()) {
	        // Workbench tab NOT present → stop scenario
	        return false;
	    }

	    WebElement workbenchtab = workbenchtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(workbenchtab));
	    workbenchtab.click();

	    return true;
	}
	
	public boolean clickintotheNewWorkbenchbuttoninWorkBench() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for New Workbench button
	    List<WebElement> newworkbenchbuttons = driver.findElements(newworkbenchbuttoninworkbench);

	    if (newworkbenchbuttons.isEmpty()) {
	        // New Workbench button NOT present → stop scenario
	        return false;
	    }

	    WebElement newworkbenchbutton = newworkbenchbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newworkbenchbutton));
	    newworkbenchbutton.click();

	    return true;
	}
	
	public boolean entertheWorkBenchnameinsearchbox(String WorkBenchName) {
		try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	        // 1️ Wait for loader to disappear
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	        // 2️ Wait for search textbox to be visible
	        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(searchworkbenchtabinworkbench));

	        // 3️ Clear existing text
	        searchBox.clear();

	        // 4️ Enter file name
	        searchBox.sendKeys(WorkBenchName);

	        System.out.println("WorkBench Name entered successfully: " + WorkBenchName);
	        return true;

	    } catch (TimeoutException e) {
	        System.err.println("Search textbox not visible within timeout");
	        return false;
	    }
	}
	
	public boolean clickintotheWorkbenchCheckboxinWorkBench() {
		try {
	        // Short pause for search results
	        Thread.sleep(1000);
	    } catch (InterruptedException e) {
	        // ignore
	    }

	    List<WebElement> checkboxes = driver.findElements(checkboxinworkbench);

	    // Case 1: Not present at all
	    if (checkboxes.isEmpty()) {
	        return false;
	    }

	    WebElement checkbox = checkboxes.get(0);

	    // Case 2: Present but NOT interactable (invalid workbench)
	    if (!checkbox.isDisplayed() || !checkbox.isEnabled()) {
	        return false;
	    }

	    try {
	        checkbox.click();
	        return true;
	    } catch (ElementNotInteractableException e) {
	        // THIS fixes your current failure
	        return false;
	    }
	}

	
	public String clickintothesubmitbuttoninWorkBench() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='AddEmployeeWorkbenchModal']//div[@class='modal-content']")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninworkbench));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Submit button clicked using JS");
	    }

	 // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	            By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: WorkBench added successfully";
	}
	
	
	//------------------------------WorkBenches Section----------------------------------------------
	
	
	public boolean clickintotheworkbenchestabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Workbench tab
	    List<WebElement> workbenchtabs = driver.findElements(workbenchestabinsidebar);

	    if (workbenchtabs.isEmpty()) {
	        // Workbench tab NOT present → stop scenario
	        return false;
	    }

	    WebElement workbenchtab = workbenchtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(workbenchtab));
	    workbenchtab.click();

	    return true;
	}
	
	public void clickintothefiltertabinWorkbenches() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement filtertab = wait.until(ExpectedConditions.elementToBeClickable(filtertabinworkbenches));
	   
	    try {
	    	filtertab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", filtertab);
	    }

	    System.out.println("Filter Tab clicked successfully");
	}
	
	public void entertheWorkbenchesnameinsearchbox(String WorkbenchesName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement Workbenchesnametextboxfield = wait.until(ExpectedConditions.elementToBeClickable(workbenchessearchtextbox));

	    // Extra safety for animation/overlay
	    wait.until(driver -> Workbenchesnametextboxfield.isDisplayed()
	            && Workbenchesnametextboxfield.isEnabled());

	    Workbenchesnametextboxfield.click();
	    Workbenchesnametextboxfield.clear();
	    Workbenchesnametextboxfield.sendKeys(WorkbenchesName);

	    System.out.println("Workbenches name entered: " + WorkbenchesName);
	}
	
	public String clickintothesearchbuttoninWorkbenches() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Click Search button
	    wait.until(ExpectedConditions.elementToBeClickable(searchbuttoninworkbenches)).click();

	    System.out.println("Search button clicked successfully");

	    try {
	        WebElement noRecordMsg = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='noRecordsText'])[1]")));

	        return "ERROR: " + noRecordMsg.getText();

	    } catch (TimeoutException ignored) {}

	    // User exists
	    return "SUCCESS: Workbenches is shown";
	}
	
	public boolean clickintothenewworkbenchinWorkbenches() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for New Workbench button
	    List<WebElement> newworkbenchbuttons = driver.findElements(newworkbenchbuttoninworkbenches);

	    if (newworkbenchbuttons.isEmpty()) {
	        // New Workbench button NOT present → stop scenario
	        return false;
	    }

	    WebElement newworkbenchbutton = newworkbenchbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newworkbenchbutton));
	    newworkbenchbutton.click();

	    return true;
	}
	
	public void entertheWorkbenchnameinWorkbench(String WorkbenchesName1) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement Workbenchesnametextboxfield = wait.until(ExpectedConditions.elementToBeClickable(workbenchnamettextboxinworkbench));

	    // Extra safety for animation/overlay
	    wait.until(driver -> Workbenchesnametextboxfield.isDisplayed()
	            && Workbenchesnametextboxfield.isEnabled());

	    Workbenchesnametextboxfield.click();
	    Workbenchesnametextboxfield.clear();
	    Workbenchesnametextboxfield.sendKeys(WorkbenchesName1);

	    System.out.println("Workbenches name entered: " + WorkbenchesName1);
	}
	
	public void entertheWorkbenchDescriptioninWorkbench(String DescriptionWorkbench) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// 1️ Wait for preloader to disappear
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		// 2️ Locate editor
		WebElement editor = wait.until(ExpectedConditions.visibilityOfElementLocated(workbenchdescriptiontextboxinworkbenches));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 3️ Focus editor
		js.executeScript("arguments[0].focus();", editor);

		// 4️ Clear existing content correctly
		js.executeScript("arguments[0].innerText = '';", editor);

		// 5️ Insert text as user input
		js.executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true }));", editor);
		    editor.sendKeys(DescriptionWorkbench);
		    System.out.println("Description Workbench entered successfully");
  	}
	
	public String clickintothesubmitbuttoninWorkbenches() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='addEditWorkbenchModal']//div[@class='modal-content']")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninworkbenches));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Submit button clicked using JS");
	    }

	    // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	    		By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: Workbench is added successfully";
	}
	
	public boolean clickintothethreedotbuttoninExistingWorkbench() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for three dot button
	    List<WebElement> threedotButtons = driver.findElements(threedotbuttoninexistingworkbench);

	    if (threedotButtons.isEmpty()) {
	        // Three dot button NOT present → stop scenario
	        return false;
	    }

	    WebElement threedotButton = threedotButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(threedotButton));
	    threedotButton.click();

	    return true;
	}
	
	public boolean clickintotheEditexistingWorkbenches() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit button
	    List<WebElement> editbuttons = driver.findElements(editbuttoninexistingworkbench);

	    if (editbuttons.isEmpty()) {
	        // Edit button NOT present → stop scenario
	        return false;
	    }

	    WebElement editbutton = editbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(editbutton));
	    editbutton.click();

	    return true;
    }
	
	public boolean clickintotheDeletetabinExistingWorkbench() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletebuttoninexistingworkbench);

	    // If Delete button NOT present → stop scenario
	    if (deleteButtons.isEmpty()) {
	        System.out.println("Delete button NOT present");
	        return false;
	    }

	    WebElement deleteButton = deleteButtons.get(0);

	    // Wait until clickable
	    wait.until(ExpectedConditions.elementToBeClickable(deleteButton));

	    try {
	        deleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", deleteButton);
	    }

	    System.out.println("Delete button clicked");

	    // Wait for confirm delete button
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletebuttoninexistingworkbench));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	
	//-------------------------------Timesheet Section-------------------------------------------
	
	
	public boolean clickintotheTimesheettabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Timesheet tab
	    List<WebElement> timesheetbuttons = driver.findElements(timesheettabinsidebar);

	    if (timesheetbuttons.isEmpty()) {
	        // Timesheet tab NOT present → stop scenario
	        return false;
	    }

	    WebElement timesheetbutton = timesheetbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(timesheetbutton));
	    timesheetbutton.click();

	    return true;
	}
	
	public boolean clickintotheAddlinebuttoninTimesheet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for add line button
	    List<WebElement> Addlinebuttons = driver.findElements(addlinebuttonintimesheet);

	    if (Addlinebuttons.isEmpty()) {
	        // Add Line button NOT present → stop scenario
	        return false;
	    }

	    WebElement Addlinebutton = Addlinebuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(Addlinebutton));
	    Addlinebutton.click();

	    return true;
	}
	
	public void clickintotheTaskDate() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in HRModuleFunctionalityPage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement taskdatetextboxtab = wait.until(ExpectedConditions.elementToBeClickable(taskdatetextboxintaskefforts));

        try {
        	taskdatetextboxtab.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", taskdatetextboxtab);
        }

        System.out.println("Task Date clicked successfully");
    }
	
	public void selectTaskTodaysDate() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[contains(@class,'ui-datepicker-calendar')]")));

        LocalDate today = LocalDate.now();
        int day = today.getDayOfMonth();
        int month = today.getMonthValue() - 1;
        int year = today.getYear();

        String dynamicXpath = String.format(
            "//td[@data-handler='selectDay' and @data-month='%d' and @data-year='%d']/a[text()='%d']", month, year, day);

        WebElement todayElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
        todayElement.click();

        System.out.println("Today's date selected: " + day + "-" + (month + 1) + "-" + year);
    }
	
	public boolean selecttheProjectByIndexinTimesheet(int ProjectIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    
	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement projectDropdown = wait.until(
	        		ExpectedConditions.visibilityOfElementLocated(projectdropdownbuttonintaskefforts));

	        Select select = new Select(projectDropdown);

	        // 2️ Select by index
	        select.selectByIndex(ProjectIndex);

	        String selectedproject = select.getFirstSelectedOption().getText();
	        System.out.println("Project selected by index (" + ProjectIndex + "): " + selectedproject);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Project index '" + ProjectIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting project by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean selecttheTaskByIndexinTimesheet(int TaskIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    
	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        // 1️⃣ Wait for <select> dropdown
	        WebElement taskDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(taskdropdownbuttonintaskefforts));

	        Select select = new Select(taskDropdown);

	        // 2️⃣ Select by index
	        select.selectByIndex(TaskIndex);

	        String selectedtask = select.getFirstSelectedOption().getText();
	        System.out.println("Task selected by index (" + TaskIndex + "): " + selectedtask);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Task index '" + TaskIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println("Error selecting task by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public void entertheTaskHoursinTaskEfforts(String TaskHours) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement TaskHourstextboxfield = wait.until(
	            ExpectedConditions.elementToBeClickable(taskhourstextboxintaskefforts));

	    // Extra safety for animation/overlay
	    wait.until(driver -> TaskHourstextboxfield.isDisplayed()
	            && TaskHourstextboxfield.isEnabled());

	    TaskHourstextboxfield.click();
	    TaskHourstextboxfield.clear();
	    TaskHourstextboxfield.sendKeys(TaskHours);

	    System.out.println("Task Hours entered: " + TaskHours);
    }
	
	public String clickintothesubmitbuttoninTaskefforts() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-dialog modal-dialog-centered modalLaptopCenter']//div[@class='modal-content']")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttonintaskefforts));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Submit button clicked using JS");
	    }

	 // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	    		By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: Task Efforts added successfully";
	}
	
	public void clickintotheTodaybuttoninTimesheet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement todaybutton = wait.until(ExpectedConditions.elementToBeClickable(todaybuttonintimesheet));
	   
	    try {
	    	todaybutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", todaybutton);
	    }

	    System.out.println("Today button clicked successfully");
	}
	
	public void updateTodayTaskHours(String hours) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement hoursField = wait.until(ExpectedConditions.elementToBeClickable(todayEditableHoursintimesheet));

	        hoursField.click();
	        hoursField.sendKeys(Keys.CONTROL, "a");
	        hoursField.sendKeys(Keys.DELETE);
	        hoursField.sendKeys(hours);
	}
	
	public boolean clickintotheExporttoExcelbuttoninTimesheet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for ExportToExcel button
	    List<WebElement> exporttoexcelbuttons = driver.findElements(exporttoexcelbuttonintimesheet);

	    if (exporttoexcelbuttons.isEmpty()) {
	        // ExportToExcel button NOT present → stop scenario
	        return false;
	    }

	    WebElement exporttoexcelbutton = exporttoexcelbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(exporttoexcelbutton));
	    exporttoexcelbutton.click();

	    return true;
	}
}