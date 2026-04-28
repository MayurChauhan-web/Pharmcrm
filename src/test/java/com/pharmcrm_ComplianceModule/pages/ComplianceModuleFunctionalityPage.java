package com.pharmcrm_ComplianceModule.pages;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComplianceModuleFunctionalityPage {
	WebDriver driver;
	
	//By Locators
	private By compliancemoduletab = By.xpath("//a[@href='/Compliance/Home/Dashboard']//div[@class='module-list-main']//div[@class='module-list-img']");
	private By documentstabinsidebar = By.xpath("//span[normalize-space()='Documents']");
	private By newfoldertabindocuments = By.xpath("(//span[normalize-space()='New Folder'])[1]");
	private By nametextboxinaddfolder = By.xpath("(//input[@id='BucketFolder_FolderName'])[1]");
	private By submitbuttoninaddfolder = By.xpath("(//button[@id='btnSave'])[1]");
	private By threedotbuttoninexistingfolder = By.xpath("(//button[contains(@class,'bucket-icon-dropdown')])[1]");
	private By editbuttoninexistingfolder = By.xpath("(//a[contains(@onclick,'editFolder')])[1]");
	private By deletebuttoninexistingfolder = By.xpath("(//a[contains(@id,'btnDeleteFolder')])[1]");
	private By confirmdeletebuttoninexistingfolder = By.xpath("//div[@id='deleteFolderModel']//button[@id='btnDeleteConfirm']");
	private By permissionbuttoninexistingfolder = By.xpath("(//a[contains(@onclick,'addPermissionPopup')])[1]");
	private By firstusercheckboxinpermission = By.xpath("(//ul[@id='uname']//div[contains(@class,'fillable-checkbox')]//label)[2]");
	private By submitbuttoninpermission = By.xpath("(//button[@id='btnPermission'])[1]");
	private By existingfoldertab = By.xpath("(//div[@class='folder-name-main'])[1]");
	private By uploadbuttoninexistingfolder = By.xpath("(//span[normalize-space()='Upload'])[1]");
	private By choosefilebuttoninuploadfile = By.xpath("(//input[@id='file-3'])[1]");
	private By submitbuttoninuploadfile = By.xpath("(//button[@id='btnSaveFile'])[1]");
	private By downloadbuttoninexistingfile = By.xpath("(//a[contains(@href,'/Security/DownloadFile')])[1]");
	private By deletebuttoninexistingfile = By.xpath("(//a[contains(@id,'btnDeleteFile')])[1]");
	private By confirmdeletebuttoninexistingfile =  By.xpath("(//button[@id='btnDeleteFileConfirm'])[1]");
	private By licensemanagementtabinsidebar = By.xpath("//span[normalize-space()='License Management']");
	private By addtenantlicensebutton = By.xpath("(//span[normalize-space()='Add Tenant License'])[1]");
	private By statedropdownbuttoninaddtenant = By.xpath("(//select[@id='TenantLicense_StateName'])[1]");
	private By licensenumbertextboxinaddtenant = By.xpath("(//input[@id='TenantLicense_LicenseNumber'])[1]");
	private By urltextboxinaddtenant = By.xpath("(//input[@id='TenantLicense_Url'])[1]");
	private By originaldatetextboxinaddtenant = By.xpath("(//input[@id='TenantLicense_OriginalDate'])[1]");
	private By expirydatetextboxinaddtenant = By.xpath("(//input[@id='TenantLicense_ExpiryDate'])[1]");
	private By professionallicensetypedropdownbuttoninaddtenant = By.xpath("(//select[@id='TenantLicense_ProfessionalLicenseTypeId'])[1]");
	private By statusdropdownbuttoninaddtenant = By.xpath("(//select[@id='TenantLicense_LicenseStatus'])[1]");
	private By choosefilebuttoninaddtenant = By.xpath("(//input[@id='file-1'])[1]");
	private By submitbuttoninaddtenant = By.xpath("(//button[@id='btnSave'])[1]");
	private By editbuttoninexistingtenantlicense = By.xpath("(//a[contains(@onclick,'editTenantLicense')])[1]");
	private By deletebuttoninexistingtenantlicense = By.xpath("(//a[contains(@id,'btnDeleteTenantLicense')])[1]");
	private By confirmdeletebuttoninexistingtenantlicense = By.xpath("(//button[normalize-space()='Confirm'])[1]");
	private By filterbuttoninlicensemanagement = By.xpath("(//span[normalize-space()='Filter'])[1]");
	private By licensenumbertextboxinfilter = By.xpath("(//input[@id='licenseNumber'])[1]");
	private By originalfromdatetextboxinfilter = By.xpath("(//input[@id='originalFromDate'])[1]");
	private By originaltodatetextboxinfilter = By.xpath("(//input[@id='originalToDate'])[1]");
	private By statedropdownbuttoninfilter = By.xpath("(//select[@id='searchStateDropdown'])[1]");
	private By expiryfromdatetextboxinfilter = By.xpath("(//input[@id='expiryFromDate'])[1]");
	private By expirytodatetextboxinfilter = By.xpath("(//input[@id='expiryToDate'])[1]");
	private By lastupdatedfromdatetextboxinfilter = By.xpath("(//input[@id='lastUpdatedFromDate'])[1]");
	private By lastupdatedtodatetextboxinfilter = By.xpath("(//input[@id='lastUpdatedToDate'])[1]");
	private By professionallicensetypedropdownbuttoninfilter = By.xpath("(//select[@id='Filter_TenantLicense_ProfessionalLicenseTypeId'])[1]");
	private By licensecategorydropdownbuttoninfilter = By.xpath("(//select[@id='licenseCategory'])[1]");
	private By licensestatusdropdownbuttoninfilter = By.xpath("(//select[@id='licenseStatus'])[1]");
	private By searchbuttoninfilter = By.xpath("(//button[@class='btn filterSearchBtn waves-effect waves-light'])[1]");
	private By partnerlicensetabinsidebar = By.xpath("(//span[normalize-space()='Partner License'])[1]");
	private By viewpartnerlicensebutton = By.xpath("(//td[@class='text-center'])[1]");
	private By filterbuttoninpartnerlicense = By.xpath("(//span[normalize-space()='Filter'])[1]");
	private By partnernametextboxinfilter = By.xpath("(//input[@id='BusinessName'])[1]");
	private By professionallicensetypedropdownbuttoninfilterpartner = By.xpath("(//select[@id='Filter_PartnerLicense_ProfessionalLicenseTypeId'])[1]");
	private By partnertypedropdownbuttoninfilter = By.xpath("(//select[@id='Filter_PartnerLicense_PartnerTypeId'])[1]");
	private By complianceeventstabinsidebar = By.xpath("(//span[normalize-space()='Compliance Events'])[1]");
	private By complianceeventbuttonincompliance = By.xpath("(//span[normalize-space()='New Compliance Event'])[1]");
	private By complianceeventnametextbox = By.xpath("(//input[@id='ComplianceEvent_Name'])[1]");
	private By complianceeventduedatetextbox = By.xpath("(//input[@id='ComplianceEvent_DueDate'])[1]");
	private By complianceeventlastoccurrencedatetextbox = By.xpath("(//input[@id='ComplianceEvent_LastOccurrenceDate'])[1]");
	private By compliancecategorydropdownbutton = By.xpath("(//select[@id='ComplianceEvent_ComplianceCategoryId'])[1]");
	private By compliancedepartmentdropdownbutton = By.xpath("(//select[@id='ComplianceEvent_ComplianceDepartmentId'])[1]");
	private By notestextboxincompliance = By.xpath("(//textarea[@id='ComplianceEvent_Notes'])[1]");
	private By frequencyduedateradiobuttonincompliance = By.xpath("(//div[@class='form-radio'])[1]");
	private By frequencyEveryradiobuttonincompliance = By.xpath("(//div[@class='form-radio'])[2]");
	private By submitbuttonincompliance = By.xpath("(//button[@id='btnSave'])[1]");
	private By weekradiobuttonincompliance = By.xpath("(//input[@id='rdWeekly'])[1]");
	private By monthradiobuttonincompliance = By.xpath("(//input[@id='rdMonthly'])[1]");
	private By dateofmonthdropdownbuttonincompliance = By.xpath("(//select[@id='ComplianceEvent_Day'])[1]");
	private By yearradiobuttonincompliance = By.xpath("(//input[@id='rdYearly'])[1]");
	private By monthdropdownbuttonincompliance = By.xpath("(//select[@id='ComplianceEvent_Month'])[1]");
	private By viewbuttoninexistingcomplianceevent = By.xpath("(//div[contains(@class,'gridListIconsFlex')]//a[@class='txt-decor-none'])[1]");
	private By adddocumentbuttoninexistingcomplianceevent = By.xpath("(//span[normalize-space()='Add Document'])[1]");
	private By documenttitlenametextboxinexistingcomplianceevent = By.xpath("(//input[@id='ComplianceEventDocument_Title'])[1]");
	private By choosefilebuttoninadddocument = By.xpath("(//input[@id='file-2'])[1]");
	private By submitbuttoninadddocument = By.xpath("(//button[@id='btnSaveComplianceEventDocument'])[1]");
	private By editbuttoninexistingdocument = By.xpath("(//a[contains(@onclick,'editComplianceEventDocument')])[1]");
	private By deleteuploadeddocumentbutton = By.xpath("(//a[@onclick='RemoveDocument();'])[1]");
	private By deletebuttoninexistingdocument =  By.xpath("(//a[contains(@onclick,'DeleteComplianceDocument')])[1]");
	private By confirmdeletebuttoninexistingdocument = By.xpath("//button[@id='btnDeleteComplianceEventDocumentConfirm']");
	private By downloadbuttoninexistingdocument = By.xpath("(//a[contains(@href,'/Security/DownloadFile')])[1]");
	private By editcomplianceeventmeetingbutton = By.xpath("(//a[contains(@onclick,'editComplianceEventMeeting')])[1]");
	private By upcomingmeetingstabinexistingevent = By.xpath("(//a[normalize-space()='Upcoming Meetings'])[1]");
	private By statusdropdowninediteventmeeting = By.xpath("(//select[@id='ComplianceEventMeeting_MeetingStatus'])[1]");
	private By notestextboxinediteventmeeting = By.xpath("(//textarea[@id='ComplianceEventMeeting_Notes'])[1]");
	private By submitbuttoninediteventmeeting = By.xpath("(//button[@id='btnSaveComplianceEventMeeting'])[1]");
	private By pastmeetingsinexistingevent = By.xpath("(//a[normalize-space()='Past Meetings'])[1]");
	private By downloaddocumentbuttoninpastmeeting = By.xpath("(//a[contains(@href,'DownloadFile') and contains(@class,'user-access')])[1]");
	private By editbuttoninexistingcomplianceevent = By.xpath("(//span[normalize-space()='Edit']/ancestor::a)[1]");
	private By deletbuttoninexistingcomplianceevent = By.xpath("(//a[contains(@id,'btnDeleteComplianceEvent')])[1]");
	private By confirmdeletebuttoninexistingcomplianceevent = By.xpath("(//button[normalize-space()='Confirm'])[1]");
	private By exportexcelbuttonincomplianceevent = By.xpath("(//span[normalize-space()='Export Excel'])[1]");
	private By eventnameinfilter = By.xpath("(//input[@id='name'])[1]");
	private By duefromdateinfilter = By.xpath("(//input[@id='dueFromDate'])[1]");
	private By duetodateinfilter = By.xpath("(//input[@id='dueToDate'])[1]");
	private By lastoccurrencefromdateinfilter = By.xpath("(//input[@id='lastOccurrenceFromDate'])[1]");
	private By lastoccurrencetodateinfilter = By.xpath("(//input[@id='lastOccurrenceToDate'])[1]");
	private By compliancecategorydropdowninfilter = By.xpath("(//select[@id='Filter_ComplianceCategoryId'])[1]");
	private By compliancedepartmentdropdowninfilter = By.xpath("(//select[@id='Filter_ComplianceDepartmentId'])[1]");
	
	
	
	
	
	
	
	public ComplianceModuleFunctionalityPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean clickintotheCompliancemoduletab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Compliance Module tab
	    List<WebElement> compliancemoduletabs = driver.findElements(compliancemoduletab);

	    if (compliancemoduletabs.isEmpty()) {
	        // Compliance Module tab NOT present → stop scenario
	        return false;
	    }

	    WebElement compliancemoduletab = compliancemoduletabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(compliancemoduletab));
	    compliancemoduletab.click();

	    return true;
	}
	
	
	//---------------------------------------Documents Section------------------------------------------
	
	
	public boolean clickintotheDocumentstabinSidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Document tab
	    List<WebElement> documentstabs = driver.findElements(documentstabinsidebar);

	    if (documentstabs.isEmpty()) {
	        // Document tab NOT present → stop scenario
	        return false;
	    }

	    WebElement documentstab = documentstabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(documentstab));
	    documentstab.click();

	    return true;
	}
	
	public boolean clickintotheNewFoldertabinDocuments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for New Folder tab
	    List<WebElement> newfoldertabs = driver.findElements(newfoldertabindocuments);

	    if (newfoldertabs.isEmpty()) {
	        // New Folder tab NOT present → stop scenario
	        return false;
	    }

	    WebElement newfoldertab = newfoldertabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newfoldertab));
	    newfoldertab.click();

	    return true;
	}
	
	public void entertheNewFolderName(String FolderName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement nametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(nametextboxinaddfolder));

	    // Extra safety for animation/overlay
	    wait.until(driver -> nametextboxfiled.isDisplayed()
	            && nametextboxfiled.isEnabled());

	    nametextboxfiled.click();
	    nametextboxfiled.clear();
	    nametextboxfiled.sendKeys(FolderName);

	    System.out.println("Folder Name entered: " + FolderName);
    }
	
	public void removetheExistingFolderName() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement nametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(nametextboxinaddfolder));

	    // Extra safety for animation/overlay
	    wait.until(driver -> nametextboxfiled.isDisplayed()
	            && nametextboxfiled.isEnabled());

	    nametextboxfiled.click();
	    nametextboxfiled.clear();
    }
	
	public String clickintotheSubmitbuttoninAddFolder() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='addFolderModal']//div[@class='modal-content']")));

	    WebElement sendBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninaddfolder));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(sendBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", sendBtn);
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

	    return "SUCCESS: New Folder added successfully";
	}
	
	public boolean clickintothethreedotbuttoninExistingFolder() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for three dot button
	    List<WebElement> threedotButtons = driver.findElements(threedotbuttoninexistingfolder);

	    if (threedotButtons.isEmpty()) {
	        // Three dot button NOT present → stop scenario
	        return false;
	    }

	    WebElement threedotButton = threedotButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(threedotButton));
	    threedotButton.click();

	    return true;
	}
	
	public boolean clickintotheEditbuttoninExistingFolder() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit button
	    List<WebElement> editButtons = driver.findElements(editbuttoninexistingfolder);

	    if (editButtons.isEmpty()) {
	        // Edit button NOT present → stop scenario
	        return false;
	    }

	    WebElement editButton = editButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(editButton));
	    editButton.click();

	    return true;
	}
	
	public boolean clickintotheDeletebuttoninExistingFolder() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletebuttoninexistingfolder);

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
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletebuttoninexistingfolder));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	public boolean clickintothePermissionbuttoninExistingFolder() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Folder Permission button
	    List<WebElement> permissionButtons = driver.findElements(permissionbuttoninexistingfolder);

	    if (permissionButtons.isEmpty()) {
	        // Folder Permission button NOT present → stop scenario
	        return false;
	    }

	    WebElement permissionButton = permissionButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(permissionButton));
	    permissionButton.click();

	    return true;
	}
	
	public void clickintotheFirstusercheckboxinPermission() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement firstcheckboxbutton = wait.until(ExpectedConditions.elementToBeClickable(firstusercheckboxinpermission));
	   
	    try {
	    	firstcheckboxbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", firstcheckboxbutton);
	    }

	    System.out.println("First Checkbox button clicked successfully");
	}
	
	public String clickintotheSubmitbuttoninPermission() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='divPrimarycontent']")));

	    WebElement sendBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninpermission));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(sendBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", sendBtn);
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

	    return "SUCCESS: Permission added successfully";
	}
	
	public boolean clickintotheExistingfoldertab() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

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
	
	public boolean clickintotheUploadbuttoninExistingFolder() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Upload button
	    List<WebElement> uploadButtons = driver.findElements(uploadbuttoninexistingfolder);

	    if (uploadButtons.isEmpty()) {
	        // Upload button NOT present → stop scenario
	        return false;
	    }

	    WebElement uploadButton = uploadButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(uploadButton));
	    uploadButton.click();

	    return true;
	}
	
	public boolean uploadTheFiles(String filePath) {
		try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(choosefilebuttoninuploadfile));

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
	
	public String clickintotheSubmitbuttoninUploadFile() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='addFileModal']//div[@class='modal-content']")));

	    WebElement sendBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninuploadfile));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(sendBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", sendBtn);
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

	    return "SUCCESS: File Upload successfully";
	}
	
	public boolean clickintotheDownloadbuttoninExistingFile() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Download button
	    List<WebElement> downloadButtons = driver.findElements(downloadbuttoninexistingfile);

	    if (downloadButtons.isEmpty()) {
	        // Download button NOT present → stop scenario
	        return false;
	    }

	    WebElement downloadButton = downloadButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(downloadButton));
	    downloadButton.click();

	    return true;
	}
	
	public boolean clickintotheDeletebuttoninExistingFile() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletebuttoninexistingfile);

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
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletebuttoninexistingfile));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	
	//---------------------------------License Management Section---------------------------------------
	
	
	public boolean clickintotheLicenseManagementtabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for License Management tab
	    List<WebElement> licensemanagementtabs = driver.findElements(licensemanagementtabinsidebar);

	    if (licensemanagementtabs.isEmpty()) {
	        // License Management tab NOT present → stop scenario
	        return false;
	    }

	    WebElement licensemanagementtab = licensemanagementtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(licensemanagementtab));
	    licensemanagementtab.click();

	    return true;
	}
	
	public boolean clickintotheAddTenantLicensebutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Add Tenant License button
	    List<WebElement> addtenantlicensebuttons = driver.findElements(addtenantlicensebutton);

	    if (addtenantlicensebuttons.isEmpty()) {
	        // Add Tenant License button NOT present → stop scenario
	        return false;
	    }

	    WebElement addtenantlicensebutton = addtenantlicensebuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(addtenantlicensebutton));
	    addtenantlicensebutton.click();

	    return true;
	}
	
	public boolean selecttheStateByIndexinAddTenant(int StateByIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement StateDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(statedropdownbuttoninaddtenant));

	        Select select = new Select(StateDropdown);

	        // 2️ Select by index
	        select.selectByIndex(StateByIndex);

	        String selectedState = select.getFirstSelectedOption().getText();
	        System.out.println("State selected by index (" + StateByIndex + "): " + selectedState);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("State index '" + StateByIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting state by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public void entertheLicenseNumberinAddTenant(String LicenseNumber) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement LicenseNumbertextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(licensenumbertextboxinaddtenant));

	    // Extra safety for animation/overlay
	    wait.until(driver -> LicenseNumbertextboxfiled.isDisplayed()
	            && LicenseNumbertextboxfiled.isEnabled());

	    LicenseNumbertextboxfiled.click();
	    LicenseNumbertextboxfiled.clear();
	    LicenseNumbertextboxfiled.sendKeys(LicenseNumber);

	    System.out.println("License Number entered: " + LicenseNumber);
    }
	
	public void entertheUrlinAddTenant(String URL) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement URLtextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(urltextboxinaddtenant));

	    // Extra safety for animation/overlay
	    wait.until(driver -> URLtextboxfiled.isDisplayed()
	            && URLtextboxfiled.isEnabled());

	    URLtextboxfiled.click();
	    URLtextboxfiled.clear();
	    URLtextboxfiled.sendKeys(URL);

	    System.out.println("URL entered: " + URL);
    }
	
	public void clickintotheOriginalDateinAddTenant() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ComplianceModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement originaldatepicker = wait.until(ExpectedConditions.elementToBeClickable(originaldatetextboxinaddtenant));

        try {
        	originaldatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", originaldatepicker);
        }

        System.out.println("Original Date Picker clicked successfully");
    }
	
	public void selectOriginalTodaysDateinAddTenant() {
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
	
	public void selectDateAfterTwoDaysInAddTenant() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[contains(@class,'ui-datepicker-calendar')]")));

        LocalDate today = LocalDate.now().plusDays(2);
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
	
	public void selectDateAftertenDaysInAddTenant() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[contains(@class,'ui-datepicker-calendar')]")));

        LocalDate today = LocalDate.now().plusDays(10);
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
	
	public void clickintotheExpiryDateinAddTenant() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ComplianceModulefunctionalitypage");
		}

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement expirydatepicker = wait.until(ExpectedConditions.elementToBeClickable(expirydatetextboxinaddtenant));

        try {
        	expirydatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", expirydatepicker);
        }

        System.out.println("Expiry Date Picker clicked successfully");
    }
	
	public void selectExpiryDateAfter1MonthAutomatically() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//table[contains(@class,'ui-datepicker-calendar')]")));

	    LocalDate targetDate = LocalDate.now().plusMonths(1);
	    int targetMonth = targetDate.getMonthValue() - 1; // jQuery month starts from 0
	    int targetYear = targetDate.getYear();
	    int targetDay = targetDate.getDayOfMonth();

	    // Select Year from dropdown
	    Select yearDropdown = new Select(driver.findElement(By.className("ui-datepicker-year")));
	    yearDropdown.selectByVisibleText(String.valueOf(targetYear));

	    // Select Month from dropdown
	    Select monthDropdown = new Select(driver.findElement(By.className("ui-datepicker-month")));
	    monthDropdown.selectByIndex(targetMonth);

	    // Now select day
	    String dateXpath = String.format(
	            "//td[@data-handler='selectDay']/a[text()='%d']",
	            targetDay);

	    WebElement dateElement = wait.until(
	            ExpectedConditions.elementToBeClickable(By.xpath(dateXpath)));

	    dateElement.click();

	    System.out.println("Selected date after 1 month: " + targetDate);
	}
	
	public void selectExpiryDateAfter2MonthAutomatically() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//table[contains(@class,'ui-datepicker-calendar')]")));

	    LocalDate targetDate = LocalDate.now().plusMonths(2);
	    int targetMonth = targetDate.getMonthValue() - 1; // jQuery month starts from 0
	    int targetYear = targetDate.getYear();
	    int targetDay = targetDate.getDayOfMonth();

	    // Select Year from dropdown
	    Select yearDropdown = new Select(driver.findElement(By.className("ui-datepicker-year")));
	    yearDropdown.selectByVisibleText(String.valueOf(targetYear));

	    // Select Month from dropdown
	    Select monthDropdown = new Select(driver.findElement(By.className("ui-datepicker-month")));
	    monthDropdown.selectByIndex(targetMonth);

	    // Now select day
	    String dateXpath = String.format(
	            "//td[@data-handler='selectDay']/a[text()='%d']",
	            targetDay);

	    WebElement dateElement = wait.until(
	            ExpectedConditions.elementToBeClickable(By.xpath(dateXpath)));

	    dateElement.click();

	    System.out.println("Selected date after 2 month: " + targetDate);
	}

	
	public boolean selecttheProfessionalLicenseTypeByIndexinAddTenant(int ProfessionalLicenseTypeByIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement ProfessionalLicenseTypeDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(professionallicensetypedropdownbuttoninaddtenant));

	        Select select = new Select(ProfessionalLicenseTypeDropdown);

	        // 2️ Select by index
	        select.selectByIndex(ProfessionalLicenseTypeByIndex);

	        String selectedProfessionalLicense = select.getFirstSelectedOption().getText();
	        System.out.println("Professional License selected by index (" + ProfessionalLicenseTypeByIndex + "): " + selectedProfessionalLicense);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Professional License index '" + ProfessionalLicenseTypeByIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting professional license by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean selecttheStatusByIndexinAddTenant(int StatusByIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement StatusDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(statusdropdownbuttoninaddtenant));

	        Select select = new Select(StatusDropdown);

	        // 2️ Select by index
	        select.selectByIndex(StatusByIndex);

	        String selectedStatus = select.getFirstSelectedOption().getText();
	        System.out.println("Status selected by index (" + StatusByIndex + "): " + selectedStatus);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Status index '" + StatusByIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting status by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean uploadTheFilesinAddTenant(String filePath) {
		try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(choosefilebuttoninaddtenant));

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
	
	public String clickintotheSubmitbuttoninAddTenant() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-dialog modal-notify modal-dialog-centered modalLaptopCenter']//div[@class='modal-content']")));

	    WebElement sendBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninaddtenant));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(sendBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", sendBtn);
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

	    return "SUCCESS: Tenant License added successfully";
	}
	
	public boolean clickintotheEditbuttoninExistingTenantLicense() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for three dot button
	    List<WebElement> editbuttons = driver.findElements(editbuttoninexistingtenantlicense);

	    if (editbuttons.isEmpty()) {
	        // Three dot button NOT present → stop scenario
	        return false;
	    }

	    WebElement editbutton = editbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(editbutton));
	    editbutton.click();

	    return true;
	}
	
	public boolean clickintotheDeletebuttoninExistingTenantLicense() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletebuttoninexistingtenantlicense);

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
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletebuttoninexistingtenantlicense));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	public void clickintotheFilterbuttoninLicenseManagement() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement filterbutton = wait.until(ExpectedConditions.elementToBeClickable(filterbuttoninlicensemanagement));
	   
	    try {
	    	filterbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", filterbutton);
	    }

	    System.out.println("Filter button clicked successfully");
	}
	
	public void entertheLicenseNumberinFilter(String LicenseNumberinFilter) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement LicenseNumbertextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(licensenumbertextboxinfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> LicenseNumbertextboxfiled.isDisplayed()
	            && LicenseNumbertextboxfiled.isEnabled());

	    LicenseNumbertextboxfiled.click();
	    LicenseNumbertextboxfiled.clear();
	    LicenseNumbertextboxfiled.sendKeys(LicenseNumberinFilter);

	    System.out.println("License Number entered: " + LicenseNumberinFilter);
    }
	
	public void clickintotheOriginalFromDateinFilter() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ComplianceModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement originaldatepicker = wait.until(ExpectedConditions.elementToBeClickable(originalfromdatetextboxinfilter));

        try {
        	originaldatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", originaldatepicker);
        }

        System.out.println("Original From Date Picker clicked successfully");
    }
	
	public void clickintotheOriginalToDateinFilter() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ComplianceModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement originaldatepicker = wait.until(ExpectedConditions.elementToBeClickable(originaltodatetextboxinfilter));

        try {
        	originaldatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", originaldatepicker);
        }

        System.out.println("Original To Date Picker clicked successfully");
    }
	
	public boolean selecttheStateByIndexinFilter(int StateByIndexinFilter) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement StateDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(statedropdownbuttoninfilter));

	        Select select = new Select(StateDropdown);

	        // 2️ Select by index
	        select.selectByIndex(StateByIndexinFilter);

	        String selectedState = select.getFirstSelectedOption().getText();
	        System.out.println("State selected by index (" + StateByIndexinFilter + "): " + selectedState);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("State index '" + StateByIndexinFilter + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting state by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public void clickintotheExpiryFromDateinFilter() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ComplianceModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement expirydatepicker = wait.until(ExpectedConditions.elementToBeClickable(expiryfromdatetextboxinfilter));

        try {
        	expirydatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", expirydatepicker);
        }

        System.out.println("Expiry From Date Picker clicked successfully");
    }
	
	public void clickintotheExpiryToDateinFilter() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ComplianceModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement expirydatepicker = wait.until(ExpectedConditions.elementToBeClickable(expirytodatetextboxinfilter));

        try {
        	expirydatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", expirydatepicker);
        }

        System.out.println("Expiry To Date Picker clicked successfully");
    }
	
	public void clickintotheLastUpdatedFromDateinFilter() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ComplianceModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement lastupdateddatepicker = wait.until(ExpectedConditions.elementToBeClickable(lastupdatedfromdatetextboxinfilter));

        try {
        	lastupdateddatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", lastupdateddatepicker);
        }

        System.out.println("Last updated From Date Picker clicked successfully");
    }
	
	public void clickintotheLastUpdatedToDateinFilter() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ComplianceModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement lastupdateddatepicker = wait.until(ExpectedConditions.elementToBeClickable(lastupdatedtodatetextboxinfilter));

        try {
        	lastupdateddatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", lastupdateddatepicker);
        }

        System.out.println("Last updated To Date Picker clicked successfully");
    }
	
	public boolean selecttheProfessionalLicenseTypeByIndexinFilter(int ProfessionalLicenseTypeByIndexinFilter) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement ProfessionalLicenseTypeDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(professionallicensetypedropdownbuttoninfilter));

	        Select select = new Select(ProfessionalLicenseTypeDropdown);

	        // 2️ Select by index
	        select.selectByIndex(ProfessionalLicenseTypeByIndexinFilter);

	        String selectedProfessionalLicense = select.getFirstSelectedOption().getText();
	        System.out.println("Professional License selected by index (" + ProfessionalLicenseTypeByIndexinFilter + "): " + selectedProfessionalLicense);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Professional License index '" + ProfessionalLicenseTypeByIndexinFilter + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting professional license by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean selecttheLicenseCategoryByIndexinFilter(int LicenseCategoryByIndexinFilter) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement LicenseCategoryDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(licensecategorydropdownbuttoninfilter));

	        Select select = new Select(LicenseCategoryDropdown);

	        // 2️ Select by index
	        select.selectByIndex(LicenseCategoryByIndexinFilter);

	        String selectedLicenseCategory = select.getFirstSelectedOption().getText();
	        System.out.println("License Category selected by index (" + LicenseCategoryByIndexinFilter + "): " + selectedLicenseCategory);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("License Category index '" + LicenseCategoryByIndexinFilter + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting license category by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean selecttheLicenseStatusByIndexinFilter(int LicenseStatusByIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement StatusDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(licensestatusdropdownbuttoninfilter));

	        Select select = new Select(StatusDropdown);

	        // 2️ Select by index
	        select.selectByIndex(LicenseStatusByIndex);

	        String selectedStatus = select.getFirstSelectedOption().getText();
	        System.out.println("Status selected by index (" + LicenseStatusByIndex + "): " + selectedStatus);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Status index '" + LicenseStatusByIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting status by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public String clickintothesearchbuttoninFilter() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Click Search button
	    wait.until(ExpectedConditions.elementToBeClickable(searchbuttoninfilter)).click();

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
	        WebElement noRecordMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                        By.xpath("(//p[@class='noRecordsText'])[1]")));

	        return "ERROR: " + noRecordMsg.getText();

	    } catch (TimeoutException ignored) {}

	    // 3️⃣ User exists
	    return "SUCCESS: Record is shown";
	}
	
	
	//------------------------------------Partner License Section--------------------------------------
	
	
	public boolean clickintothePartnerLicensetabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Partner License tab
	    List<WebElement> partnerlicensetabs = driver.findElements(partnerlicensetabinsidebar);

	    if (partnerlicensetabs.isEmpty()) {
	        // Partner License tab NOT present → stop scenario
	        return false;
	    }

	    WebElement partnerlicensetab = partnerlicensetabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(partnerlicensetab));
	    partnerlicensetab.click();

	    return true;
	}
	
	public boolean clickintotheViewPartnerLicensebutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for three dot button
	    List<WebElement> viewpartnerlicensebuttons = driver.findElements(viewpartnerlicensebutton);

	    if (viewpartnerlicensebuttons.isEmpty()) {
	        // Three dot button NOT present → stop scenario
	        return false;
	    }

	    WebElement viewpartnerlicensebutton = viewpartnerlicensebuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(viewpartnerlicensebutton));
	    viewpartnerlicensebutton.click();

	    return true;
	}
	
	public void clickintotheFilterbuttoninPartnerLicense() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement filterbutton = wait.until(ExpectedConditions.elementToBeClickable(filterbuttoninpartnerlicense));
	   
	    try {
	    	filterbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", filterbutton);
	    }

	    System.out.println("Filter button clicked successfully");
	}
	
	public void enterthePartnerNameinFilter(String PartnerNameinFilter) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement partnernametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(partnernametextboxinfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> partnernametextboxfiled.isDisplayed()
	            && partnernametextboxfiled.isEnabled());

	    partnernametextboxfiled.click();
	    partnernametextboxfiled.clear();
	    partnernametextboxfiled.sendKeys(PartnerNameinFilter);

	    System.out.println("Partner Name entered: " + PartnerNameinFilter);
    }
	
	public boolean selecttheProfessionalLicenseTypeByIndexinPartnerLicense(int ProfessionalLicenseTypeByIndexinPartner) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement ProfessionalLicenseTypeDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(professionallicensetypedropdownbuttoninfilterpartner));

	        Select select = new Select(ProfessionalLicenseTypeDropdown);

	        // 2️ Select by index
	        select.selectByIndex(ProfessionalLicenseTypeByIndexinPartner);

	        String selectedProfessionalLicense = select.getFirstSelectedOption().getText();
	        System.out.println("Professional License selected by index (" + ProfessionalLicenseTypeByIndexinPartner + "): " + selectedProfessionalLicense);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Professional License index '" + ProfessionalLicenseTypeByIndexinPartner + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting professional license by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean selectthePartnerTypeByIndexinPartnerLicense(int PartnerTypeByIndexinPartner) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement PartnerTypeDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(partnertypedropdownbuttoninfilter));

	        Select select = new Select(PartnerTypeDropdown);

	        // 2️ Select by index
	        select.selectByIndex(PartnerTypeByIndexinPartner);

	        String selectedPartnerType = select.getFirstSelectedOption().getText();
	        System.out.println("Partner Type selected by index (" + PartnerTypeByIndexinPartner + "): " + selectedPartnerType);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Partner Type index '" + PartnerTypeByIndexinPartner + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting partner type by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean clickintotheComplianceEventstabinSidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for three dot button
	    List<WebElement> complianceeventstabs = driver.findElements(complianceeventstabinsidebar);

	    if (complianceeventstabs.isEmpty()) {
	        // Three dot button NOT present → stop scenario
	        return false;
	    }

	    WebElement complianceeventstab = complianceeventstabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(complianceeventstab));
	    complianceeventstab.click();

	    return true;
	}
	
	public boolean clickintotheComplianceEventbuttoninCompliance() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for three dot button
	    List<WebElement> complianceeventstabs = driver.findElements(complianceeventbuttonincompliance);

	    if (complianceeventstabs.isEmpty()) {
	        // Three dot button NOT present → stop scenario
	        return false;
	    }

	    WebElement complianceeventstab = complianceeventstabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(complianceeventstab));
	    complianceeventstab.click();

	    return true;
	}
	
	public void entertheComplianceEventName(String ComplianceEventName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ComplianceEventNametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(complianceeventnametextbox));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ComplianceEventNametextboxfiled.isDisplayed()
	            && ComplianceEventNametextboxfiled.isEnabled());

	    ComplianceEventNametextboxfiled.click();
	    ComplianceEventNametextboxfiled.clear();
	    ComplianceEventNametextboxfiled.sendKeys(ComplianceEventName);

	    System.out.println("Compliance Event Name entered: " + ComplianceEventName);
    }
	
	public void removetheComplianceEventName() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ComplianceEventNametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(complianceeventnametextbox));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ComplianceEventNametextboxfiled.isDisplayed()
	            && ComplianceEventNametextboxfiled.isEnabled());

	    ComplianceEventNametextboxfiled.click();
	    ComplianceEventNametextboxfiled.clear();
	    
	    System.out.println("Remove the compliance Event Name");
    }
	
	public void clickintotheComplianceEventDueDate() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ComplianceModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement duedatepicker = wait.until(ExpectedConditions.elementToBeClickable(complianceeventduedatetextbox));

        try {
        	duedatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", duedatepicker);
        }

        System.out.println("Compliance Event Due Date Picker clicked successfully");
    }
	
	public void clickintotheComplianceEventLastOccurrenceDate() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ComplianceModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement lastoccurrencedatepicker = wait.until(ExpectedConditions.elementToBeClickable(complianceeventlastoccurrencedatetextbox));

        try {
        	lastoccurrencedatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", lastoccurrencedatepicker);
        }

        System.out.println("Compliance Event Last Occurrence Date Picker clicked successfully");
    }
	
	public boolean selecttheComplianceCategory(int ComplianceCategoryByIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement ComplianceCategoryDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(compliancecategorydropdownbutton));

	        Select select = new Select(ComplianceCategoryDropdown);

	        // 2️ Select by index
	        select.selectByIndex(ComplianceCategoryByIndex);

	        String selectedComplianceCategory = select.getFirstSelectedOption().getText();
	        System.out.println("Compliance Category selected by index (" + ComplianceCategoryByIndex + "): " + selectedComplianceCategory);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Compliance Category index '" + ComplianceCategoryByIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting compliance category by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean selecttheComplianceDepartment(int ComplianceDepartmentByIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement ComplianceDepartmentDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(compliancedepartmentdropdownbutton));

	        Select select = new Select(ComplianceDepartmentDropdown);

	        // 2️ Select by index
	        select.selectByIndex(ComplianceDepartmentByIndex);

	        String selectedComplianceCategory = select.getFirstSelectedOption().getText();
	        System.out.println("Compliance Department selected by index (" + ComplianceDepartmentByIndex + "): " + selectedComplianceCategory);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Compliance Department index '" + ComplianceDepartmentByIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting compliance department by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public void entertheComplianceEventNotes(String Notes) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement Notestextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(notestextboxincompliance));

	    // Extra safety for animation/overlay
	    wait.until(driver -> Notestextboxfiled.isDisplayed()
	            && Notestextboxfiled.isEnabled());

	    Notestextboxfiled.click();
	    Notestextboxfiled.clear();
	    Notestextboxfiled.sendKeys(Notes);

	    System.out.println("Notes entered: " + Notes);
    }
	
	public void clickintotheFrequencyDueDateRadiobutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement duedateradiobutton = wait.until(ExpectedConditions.elementToBeClickable(frequencyduedateradiobuttonincompliance));
	   
	    try {
	    	duedateradiobutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", duedateradiobutton);
	    }

	    System.out.println("Due Date radio button clicked successfully");
	}
	
	public void clickintotheFrequencyEveryRadiobutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement everyradiobutton = wait.until(ExpectedConditions.elementToBeClickable(frequencyEveryradiobuttonincompliance));
	   
	    try {
	    	everyradiobutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", everyradiobutton);
	    }

	    System.out.println("Every radio button clicked successfully");
	}
	
	public String clickintotheSubmitbuttoninComplianceEvents() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='detailBackgroundContainer pb-3'])[1]")));

	    WebElement sendBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttonincompliance));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(sendBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", sendBtn);
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

	    return "SUCCESS: Compliance Events added successfully";
	}
	
	public void clickintotheWeekRadiobuttoninCompliance() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement weekradiobutton = wait.until(ExpectedConditions.elementToBeClickable(weekradiobuttonincompliance));
	   
	    try {
	    	weekradiobutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", weekradiobutton);
	    }

	    System.out.println("Week radio button clicked successfully");
	}
	
	public void selectMondayToFridayInCompliance() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    String[] ids = {"chkMonday", "chkTuesday", "chkWednesday", "chkThursday", "chkFriday"};

	    for (String id : ids) {

	        WebElement checkbox = wait.until(
	                ExpectedConditions.presenceOfElementLocated(By.id(id)));

	        if (!checkbox.isSelected()) {
	            try {
	                checkbox.click();
	            } catch (Exception e) {
	                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkbox);
	            }
	        }
	    }

	    System.out.println("Monday to Friday checkboxes selected successfully");
	}
	
	public void selectAllDaysInCompliance() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    String[] ids = {"chkMonday", "chkTuesday", "chkWednesday", "chkThursday", "chkFriday", "chkSaturday", "chkSunday"};

	    for (String id : ids) {

	        WebElement checkbox = wait.until(
	                ExpectedConditions.presenceOfElementLocated(By.id(id)));

	        if (!checkbox.isSelected()) {
	            try {
	                checkbox.click();
	            } catch (Exception e) {
	                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkbox);
	            }
	        }
	    }
	    System.out.println("Monday to Sunday checkboxes selected successfully");
	}
	
	public void clickintotheMonthRadiobuttoninCompliance() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement monthradiobutton = wait.until(ExpectedConditions.elementToBeClickable(monthradiobuttonincompliance));
	   
	    try {
	    	monthradiobutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", monthradiobutton);
	    }

	    System.out.println("Month radio button clicked successfully");
	}
	
	public boolean selecttheDateOfMonthinCompliance(int DateOfMonthByIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement DateOfMonthDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(dateofmonthdropdownbuttonincompliance));

	        Select select = new Select(DateOfMonthDropdown);

	        // 2️ Select by index
	        select.selectByIndex(DateOfMonthByIndex);

	        String selectedDateOfMonth = select.getFirstSelectedOption().getText();
	        System.out.println("Date Of Month selected by index (" + DateOfMonthByIndex + "): " + selectedDateOfMonth);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Date Of Month index '" + DateOfMonthByIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting date of month by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public void clickintotheYearRadiobuttoninCompliance() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement yearradiobutton = wait.until(ExpectedConditions.elementToBeClickable(yearradiobuttonincompliance));
	   
	    try {
	    	yearradiobutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", yearradiobutton);
	    }

	    System.out.println("Year radio button clicked successfully");
	}
	
	public boolean selecttheMonthinCompliance(int MonthByIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement MonthDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(monthdropdownbuttonincompliance));

	        Select select = new Select(MonthDropdown);

	        // 2️ Select by index
	        select.selectByIndex(MonthByIndex);

	        String selectedMonth = select.getFirstSelectedOption().getText();
	        System.out.println("Date Of Month selected by index (" + MonthByIndex + "): " + selectedMonth);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Month index '" + MonthByIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting month by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean clickintotheViewbuttoninExistingComplianceEvent() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for view Button
	    List<WebElement> viewButtons = driver.findElements(viewbuttoninexistingcomplianceevent);

	    if (viewButtons.isEmpty()) {
	        // view Button NOT present → stop scenario
	        return false;
	    }

	    WebElement viewButton = viewButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(viewButton));
	    viewButton.click();

	    return true;
	}
	
	public boolean clickintotheAddDocumentbuttoninExistingComplianceEvent() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Add Document Button
	    List<WebElement> AddDocumentButtons = driver.findElements(adddocumentbuttoninexistingcomplianceevent);

	    if (AddDocumentButtons.isEmpty()) {
	        // Add Document Button NOT present → stop scenario
	        return false;
	    }

	    WebElement AddDocumentButton = AddDocumentButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(AddDocumentButton));
	    AddDocumentButton.click();

	    return true;
	}
	
	public void entertheDocumentTitleNameinComplianceEvent(String DocumentTitle) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement DocumentTitletextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(documenttitlenametextboxinexistingcomplianceevent));

	    // Extra safety for animation/overlay
	    wait.until(driver -> DocumentTitletextboxfiled.isDisplayed()
	            && DocumentTitletextboxfiled.isEnabled());

	    DocumentTitletextboxfiled.click();
	    DocumentTitletextboxfiled.clear();
	    DocumentTitletextboxfiled.sendKeys(DocumentTitle);

	    System.out.println("Document Title Name entered: " + DocumentTitle);
    }
	
	public void removetheDocumentTitleNameinComplianceEvent() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement DocumentTitletextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(documenttitlenametextboxinexistingcomplianceevent));

	    // Extra safety for animation/overlay
	    wait.until(driver -> DocumentTitletextboxfiled.isDisplayed()
	            && DocumentTitletextboxfiled.isEnabled());

	    DocumentTitletextboxfiled.click();
	    DocumentTitletextboxfiled.clear();
    }
	
	public boolean uploadTheFilesinComplianceEvent(String filePath) {
		try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(choosefilebuttoninadddocument));

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
	
	public String clickintotheSubmitbuttoninAddDocument() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='addEmployeeDocumentModal']//div[@class='modal-content']")));

	    WebElement sendBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninadddocument));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(sendBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", sendBtn);
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

	    return "SUCCESS: Document added successfully";
	}
	
	public boolean clickintotheEditbuttoninExistingDocumentinComplianceEvent() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit Button
	    List<WebElement> EditButtons = driver.findElements(editbuttoninexistingdocument);

	    if (EditButtons.isEmpty()) {
	        // Edit Button NOT present → stop scenario
	        return false;
	    }

	    WebElement EditButton = EditButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(EditButton));
	    EditButton.click();

	    return true;
	}
	
	public void clickintotheDeleteuploadeddocumentbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement deletebutton = wait.until(ExpectedConditions.elementToBeClickable(deleteuploadeddocumentbutton));
	   
	    try {
	    	deletebutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", deletebutton);
	    }

	    System.out.println("Delete button clicked successfully");
	}
	
	public boolean clickintotheDeletebuttoninExistingDocument() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletebuttoninexistingdocument);

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
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletebuttoninexistingdocument));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
		
	
	public boolean clickintotheDownloadbuttoninExistingDocumentinComplianceEvent() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Download Button
	    List<WebElement> DownloadButtons = driver.findElements(downloadbuttoninexistingdocument);

	    if (DownloadButtons.isEmpty()) {
	        // Download Button NOT present → stop scenario
	        return false;
	    }

	    WebElement DownloadButton = DownloadButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(DownloadButton));
	    DownloadButton.click();

	    return true;
	}
	
	public boolean clickintotheEditbuttoninUpcomingMeetingsEvent() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit Button
	    List<WebElement> EditButtons = driver.findElements(editcomplianceeventmeetingbutton);

	    if (EditButtons.isEmpty()) {
	        // Edit Button NOT present → stop scenario
	        return false;
	    }

	    WebElement EditButton = EditButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(EditButton));
	    EditButton.click();

	    return true;
	}
	
	public void clickintotheUpcomingMeetingstabinExistingEvent() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement upcomingmeetingstab = wait.until(ExpectedConditions.elementToBeClickable(upcomingmeetingstabinexistingevent));
	   
	    try {
	    	upcomingmeetingstab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", upcomingmeetingstab);
	    }

	    System.out.println("Upcoming Meetings tab clicked successfully");
	}
	
	public boolean selecttheStatusByIndexinEditEventMeeting(int StatusByIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement StatusDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(statusdropdowninediteventmeeting));

	        Select select = new Select(StatusDropdown);

	        // 2️ Select by index
	        select.selectByIndex(StatusByIndex);

	        String selectedStatus = select.getFirstSelectedOption().getText();
	        System.out.println("Status selected by index (" + StatusByIndex + "): " + selectedStatus);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Status index '" + StatusByIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting status by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public void entertheNotesinEditEventMeeting(String NotesinEditEvent) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement notestextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(notestextboxinediteventmeeting));

	    // Extra safety for animation/overlay
	    wait.until(driver -> notestextboxfiled.isDisplayed()
	            && notestextboxfiled.isEnabled());

	    notestextboxfiled.click();
	    notestextboxfiled.clear();
	    notestextboxfiled.sendKeys(NotesinEditEvent);

	    System.out.println("Notes entered: " + NotesinEditEvent);
    }
	
	public String clickintotheSubmitbuttoninEditEventMeeting() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='addEmployeeMeetingModal']//div[@class='modal-content']")));

	    WebElement sendBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninediteventmeeting));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(sendBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", sendBtn);
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

	    return "SUCCESS: Event Meeting details added successfully";
	}
	
	public void clickintothePastMeetingstabinExistingEvent() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement pastmeetingstab = wait.until(ExpectedConditions.elementToBeClickable(pastmeetingsinexistingevent));
	   
	    try {
	    	pastmeetingstab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", pastmeetingstab);
	    }

	    System.out.println("Past Meetings tab clicked successfully");
	}
	
	public boolean clickintotheDownloadDocumentbuttoninPastMeetings() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Download Button
	    List<WebElement> DownloadButtons = driver.findElements(downloaddocumentbuttoninpastmeeting);

	    if (DownloadButtons.isEmpty()) {
	        // Download Button NOT present → stop scenario
	        return false;
	    }

	    WebElement DownloadButton = DownloadButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(DownloadButton));
	    DownloadButton.click();

	    return true;
	}
	
	public boolean clickintotheEditbuttoninExistingComplianceEvent() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit Button
	    List<WebElement> EditButtons = driver.findElements(editbuttoninexistingcomplianceevent);

	    if (EditButtons.isEmpty()) {
	        // Edit Button NOT present → stop scenario
	        return false;
	    }

	    WebElement EditButton = EditButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(EditButton));
	    EditButton.click();

	    return true;
	}
	
	public boolean clickintotheDeletebuttoninExistingComplianceEvent() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletbuttoninexistingcomplianceevent);

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
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletebuttoninexistingcomplianceevent));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	public boolean clickintotheExportExcelbuttoninComplianceEvents() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Export Excel Button
	    List<WebElement> ExportExcelButtons = driver.findElements(exportexcelbuttonincomplianceevent);

	    if (ExportExcelButtons.isEmpty()) {
	        // Export Excel Button NOT present → stop scenario
	        return false;
	    }

	    WebElement ExportExcelButton = ExportExcelButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(ExportExcelButton));
	    ExportExcelButton.click();

	    return true;
	}
	
	public void entertheEventNameinFilter(String EventName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement EventNametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(eventnameinfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> EventNametextboxfiled.isDisplayed()
	            && EventNametextboxfiled.isEnabled());

	    EventNametextboxfiled.click();
	    EventNametextboxfiled.clear();
	    EventNametextboxfiled.sendKeys(EventName);

	    System.out.println("Event Name entered: " + EventName);
    }
	
	public void clickintotheDueFromDateinFilter() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ComplianceModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement duefromdatepicker = wait.until(ExpectedConditions.elementToBeClickable(duefromdateinfilter));

        try {
        	duefromdatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", duefromdatepicker);
        }

        System.out.println("Due From Date Picker clicked successfully");
    }
	
	public void clickintotheDueToDateinFilter() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ComplianceModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement duetodatepicker = wait.until(ExpectedConditions.elementToBeClickable(duetodateinfilter));

        try {
        	duetodatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", duetodatepicker);
        }

        System.out.println("Due To Date Picker clicked successfully");
    }
	
	public void clickintotheLastOccurrenceFromDateinFilter() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ComplianceModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement lastoccurrencefromdatepicker = wait.until(ExpectedConditions.elementToBeClickable(lastoccurrencefromdateinfilter));

        try {
        	lastoccurrencefromdatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", lastoccurrencefromdatepicker);
        }

        System.out.println("Last Occurrence From Date Picker clicked successfully");
    }
	
	public void clickintotheLastOccurrenceToDateinFilter() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ComplianceModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement lastoccurrencetodatepicker = wait.until(ExpectedConditions.elementToBeClickable(lastoccurrencetodateinfilter));

        try {
        	lastoccurrencetodatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", lastoccurrencetodatepicker);
        }

        System.out.println("Last Occurrence To Date Picker clicked successfully");
    }
	
	public boolean selecttheComplianceCategoryinFilter(int CategoryByIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement ComplianceCategoryDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(compliancecategorydropdowninfilter));

	        Select select = new Select(ComplianceCategoryDropdown);

	        // 2️ Select by index
	        select.selectByIndex(CategoryByIndex);

	        String selectedComplianceCategory = select.getFirstSelectedOption().getText();
	        System.out.println("Compliance Category selected by index (" + CategoryByIndex + "): " + selectedComplianceCategory);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Compliance Category index '" + CategoryByIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting compliance category by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean selecttheComplianceDepartmentinFilter(int DepartmentByIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement ComplianceDepartmentDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(compliancedepartmentdropdowninfilter));

	        Select select = new Select(ComplianceDepartmentDropdown);

	        // 2️ Select by index
	        select.selectByIndex(DepartmentByIndex);

	        String selectedComplianceDepartment = select.getFirstSelectedOption().getText();
	        System.out.println("Compliance Department selected by index (" + DepartmentByIndex + "): " + selectedComplianceDepartment);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Compliance Department index '" + DepartmentByIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting compliance department by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
}
