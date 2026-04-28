package com.pharmcrm_SalesRepsModule.pages;

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

public class SalesRepsModuleFunctionalityPage {
	WebDriver driver;
	
	//By Locators
	private By salesrepsmoduletab = By.xpath("//a[@href='/SalesRep/Home/Dashboard']//div[@class='module-list-main']//div[@class='module-list-img']");
	private By salesrepquestiontabinsidebar = By.xpath("(//span[normalize-space()='Sales Rep Questions'])[1]");
	private By addnewsalesrepquestionbutton = By.xpath("(//span[normalize-space()='Add New Sales Rep Question'])[1]");
	private By questionstextbox = By.xpath("(//input[@id='SalesRepQuestion_Question'])[1]");
	private By calculativecheckboxinsalesrepquestions = By.xpath("(//label[normalize-space()='Calculative'])[1]");
	private By mandatorycheckboxinsalesrepquestions = By.xpath("(//label[normalize-space()='Mandatory?'])[1]");
	private By submitbuttoninsalesrepquestions = By.xpath("(//button[@id='btnSave'])[1]");
	private By threedotbuttoninsalesrepquestions = By.xpath("//button[contains(@class,'bucket-icon-dropdown')]");
	private By editbuttoninsalesrepquestions = By.xpath("(//a[contains(@href,'SalesRepQuestion')]//span[normalize-space()='Edit'])[1]");
	private By deletebuttoninsalesrepquestions = By.xpath("(//a[contains(@id,'btnDeleteSalesRepQuestion')])[1]");
	private By confirmdeletebuttoninsalesrepquestions = By.xpath("//div[@id='deleteSalesRepQuestionModel']//button[@id='btnDeleteConfirm']");
	private By bucketstabinsidebar = By.xpath("(//span[normalize-space()='Buckets'])[1]");
	private By newfoldertabinbuckets = By.xpath("(//span[normalize-space()='New Folder'])[1]");
	private By foldernametextboxinbuckets = By.xpath("(//input[@id='BucketFolder_FolderName'])[1]");
	private By foldertypedropdowninbuckets = By.xpath("(//select[@id='SalesRepBucketFolder_Type'])[1]");
	private By submitbuttoninbuckets = By.xpath("(//button[@id='btnSave'])[1]");
	private By threedotbuttoninbuckets = By.xpath("(//button[contains(@class,'bucket-icon-dropdown')])[1]");
	private By editbuttoninexistingfolder = By.xpath("(//a[contains(@onclick,'editFolder')])[1]");
	private By deletebuttoninexistingfolder = By.xpath("(//a[contains(@id,'btnDeleteFolder')])[1]");
	private By confirmdeletebuttoninexistingfolder = By.xpath("//div[@id='deleteFolderModel']//button[@id='btnDeleteConfirm']");
	private By permissionbuttoninexistingfolder = By.xpath("//div[contains(@class,'bucketDropdownAction') and contains(@class,'show')]//a[@id='addPermissionPopup']");
	private By firstcheckboxofzoneinpermission = By.xpath("(//label[normalize-space()='500'])[1]");
	private By submitbuttoninpermission = By.xpath("(//button[@id='btnPermission'])[1]");
	private By userpermissionbuttoninexistingfolder = By.xpath("//div[contains(@class,'bucketDropdownAction') and contains(@class,'show')]//a[contains(@onclick,'SalesRepPermissionFolder')]");
	private By firstusercheckboxinuserpermission = By.xpath("(//ul[@id='uname']//div[contains(@class,'fillable-checkbox')]//label)[2]");
	private By submitbuttoninuserpermission = By.xpath("(//button[@id='btnUserPermission'])[1]");
	private By existingfoldertabinbuckets = By.xpath("(//div[@class='folder-name-main'])[1]");
	private By uploadtabinbuckets = By.xpath("(//span[normalize-space()='Upload'])[1]");
	private By choosefilestabinuploadfile = By.xpath("(//input[@id='file-3'])[1]");
	private By submitbuttoninuploadfile = By.xpath("(//button[@id='btnSaveFile'])[1]");
	private By editfilebuttoninbuckets = By.xpath("(//a[contains(@id,'btnEditFile')])[1]");
	private By filenametextboxineditfile = By.xpath("(//input[@id='fileNameTextBox'])[1]");
	private By submitbuttonineditfile = By.xpath("(//button[@id='btnSaveFile'])[1]");
	private By deletefilebuttoninbuckets = By.xpath("//div[@class='dropdown-menu bucket-dropdown-content bucketDropdownAction show']//a[@id='btnDeleteFile']");
	private By downloadfilebuttoninbuckets = By.xpath("(//div[contains(@class,'bucket-dropdown-content')]//a[contains(@href,'/Security/DownloadFile')])[1]");
	private By confirmdeletefilebuttoninbuckets = By.xpath("(//button[@id='btnDeleteFileConfirm'])[1]");
	private By salesrepvisittabinsidebar = By.xpath("(//span[normalize-space()='Sales Rep Visit'])[1]");
	private By quicktexttabinsalesrepvisits = By.xpath("(//span[normalize-space()='Quick Text'])[1]");
	private By userdropdowninquicktext = By.xpath("//input[@id='ddUser']");
	private By phonenumbertextboxinquicktext = By.xpath("//input[@id='selectedUserPhoneNumber']");
	private By templatedropdowninquicktext = By.xpath("(//select[@id='ddTemplate'])[1]");
	private By bodytextboxinquicktext = By.xpath("(//textarea[@id='templateBody'])[1]");
	private By sendbuttoninquicktext = By.xpath("(//button[@id='btnSave'])[1]");
	private By sendvcardtabinsalesrepvisits = By.xpath("(//span[normalize-space()='Send VCard'])[1]");
	private By phonenumbertextboxinsendvcard = By.xpath("(//input[@id='vCardPhoneNumber'])[1]");
	private By bodytextboxinsendvcard = By.xpath("(//textarea[@id='vcardBody'])[1]");
	private By sendbuttoninsendvcard = By.xpath("(//button[@id='btnSendVCard'])[1]");
	private By newsalesrepvisitstaninsalesrepvisits = By.xpath("(//span[normalize-space()='New Sales Rep Visits'])[1]");
	private By meetingtimetextboxinsalesrepvisit = By.xpath("(//input[@id='SalesRepVisit_MeetingTime'])[1]");
	private By hourValue(String hour) { return By.xpath("//div[contains(@class,'timepicker')]//a[text()='" + hour + "']");}
	private By minuteValue(String minute) { return By.xpath("//div[contains(@class,'timepicker')]//a[text()='" + minute + "']"); }
	private By providerdropdownbuttoninsalesrepvisit = By.xpath("(//select[@id='SalesRepVisit_Provider_Id'])[1]");
	private By providerexecutivedropdownbuttoninsales = By.xpath("(//select[@id='SalesRepVisit_ProviderExecutive_Id'])[1]");
	private By provideraddressdropdownbuttoninsales = By.xpath("(//select[@id='SalesRepVisit_ProviderAddress_Id'])[1]");
	private By providerlastnametextboxinsales = By.xpath("(//input[@id='SalesRepVisit_Provider_DoctorLastName'])[1]");
	private By providerfirstnametextboxinsales = By.xpath("(//input[@id='SalesRepVisit_Provider_DoctorFirstName'])[1]");
	private By NPINumbertextboxinsales = By.xpath("(//input[@id='SalesRepVisit_Provider_NPINumber'])[1]");
	private By provideremailidinsales = By.xpath("(//input[@id='SalesRepVisit_Provider_PrimaryEmail'])[1]");
	private By providerzoneinsales = By.xpath("(//input[@id='SalesRepVisit_Provider_Zone'])[1]");
	private By providerexecutivefirstnametextboxinsales = By.xpath("(//input[@id='SalesRepVisit_ProviderExecutive_FirstName'])[1]");
	private By providerexecutivelastnametextboxinsales = By.xpath("(//input[@id='SalesRepVisit_ProviderExecutive_LastName'])[1]");
	private By streetaddresstextboxinsales = By.xpath("(//input[@id='SalesRepVisit_ProviderAddress_Street'])[1]");
	private By cityaddresstextboxinsales = By.xpath("(//input[@id='SalesRepVisit_ProviderAddress_City'])[1]");
	private By stateaddresstextboxinsales = By.xpath("(//input[@id='SalesRepVisit_ProviderAddress_State'])[1]");
	private By zipcodeaddresstextboxinsales = By.xpath("(//input[@id='SalesRepVisit_ProviderAddress_ZipCode'])[1]");
	private By contactnumber1textboxinsales = By.xpath("(//input[@id='SalesRepVisit_ProviderAddress_ContactNumber1'])[1]");
	private By contactnumber2textboxinsales = By.xpath("(//input[@id='SalesRepVisit_ProviderAddress_ContactNumber2'])[1]");
	private By faxaddresstextboxinsales = By.xpath("(//input[@id='SalesRepVisit_ProviderAddress_Fax'])[1]");
	private By frontdesknametextboxinsales = By.xpath("(//input[@id='SalesRepVisit_ProviderAddress_FrontDeskName'])[1]");
	private By choosefilebuttonincardfrontimage = By.xpath("(//input[@id='file-3'])[1]");
	private By choosefilebuttonincardbackimage = By.xpath("(//input[@id='file-4'])[1]");
	private By notestextboxinsalesvisit = By.xpath("(//textarea[@id='SalesRepVisit_Notes'])[1]");
	private By submitbuttoninsalesvisit = By.xpath("(//button[@id='btnSave'])[1]");
	private By filtertabinsales = By.xpath("(//span[normalize-space()='Filter'])[1]");
	private By providernametextboxinfilter = By.xpath("(//input[@id='Filter_PrescriberName'])[1]");
	private By salesrepuserpintextboxinfilter = By.xpath("(//input[@id='Filter_SalesRepName'])[1]");
	private By zonetextboxinfilter = By.xpath("(//input[@id='Filter_Zone'])[1]");
	private By fromdatepickertextboxinfilter = By.xpath("(//input[@id='Filter_FromDate'])[1]");
	private By todatepicktertexboxinfilter = By.xpath("(//input[@id='Filter_ToDate'])[1]");
	private By providerexecutivenametextboxinfilter = By.xpath("(//input[@id='Filter_ProviderExecutiveName'])[1]");
	private By citytextboxinfilter = By.xpath("(//input[@id='Filter_City'])[1]");
	private By statetextboxinfilter = By.xpath("(//input[@id='Filter_State'])[1]");
	private By zipcodetextboxinfilter = By.xpath("(//input[@id='Filter_ZipCode'])[1]");
	private By meetinglocationtextboxinfilter = By.xpath("(//input[@id='Filter_MeetingLocation'])[1]");
	private By cardattachedcheckboxinfilter = By.xpath("(//label[normalize-space()='Card Attached'])[1]");
	private By notescheckboxinfilter = By.xpath("(//label[@for='Filter_IsNotes'])[1]");
	private By havingflashprovidercheckboxinfilter = By.xpath("(//label[normalize-space()='Having Flash Provider'])[1]");
	private By searchbuttoninfilter = By.xpath("(//button[@onclick='return VisitSearch()'])[1]");
	private By setupmoduletab = By.xpath("//a[@href='/Setup/Home/Dashboard']//div[@class='module-list-main']//div[@class='module-list-img']");
	private By profiletabinsidebar = By.xpath("(//span[normalize-space()='Profiles'])[1]");
	private By profilenametextboxinfilter = By.xpath("(//input[@id='Filter_Name'])[1]");
	
	
	private By firstQuestionTextbox ;
	private By secondQuestionTextbox ;
	private By thirdQuestionTextbox ;
	private By fourthQuestionTextbox ;
	private By fifthQuestionTextbox ;
	private By sixthQuestionTextbox ;
	private By seventhQuestionTextbox ;
	private By eighthQuestionTextbox ;
	private By ninthQuestionTextbox ;
	private By tenthQuestionTextbox ;
	
	
	
	
	
	public void GetQuestionsControl() {
        // Locate all question input fields under the questions div
        List<WebElement> questions = driver.findElements(
            By.xpath("//div[@id='questions']//input[@name='question']")
        );

        int i = 1;
        for (WebElement question : questions) {
            String dataQuestion = question.getAttribute("data-question");
            String questionId = question.getAttribute("id");
            System.out.println("Question " + i + ": " + dataQuestion);
            System.err.println("Question " + i + ": " + questionId);

            // Build dynamic By locators using data-question attribute
            By locator = By.xpath("//input[@data-question='" + dataQuestion + "']");

            // Assign locators to variables based on order
            switch(i) {
                case 1:
                    firstQuestionTextbox = locator;
                    break;
                case 2:
                    secondQuestionTextbox = locator;
                    break;
                case 3:
                    thirdQuestionTextbox = locator;
                    break;
                case 4:
                	fourthQuestionTextbox = locator;
                    break;
                case 5:
                	fifthQuestionTextbox = locator;
                    break;
                case 6:
                	sixthQuestionTextbox = locator;
                    break;
                case 7:
                	seventhQuestionTextbox = locator;
                    break;
                case 8:
                	eighthQuestionTextbox = locator;
                    break;
                case 9:
                	ninthQuestionTextbox = locator;
                    break;
                case 10:
                	tenthQuestionTextbox = locator;
                    break;    
                // Add more cases if you have more textboxes
            }
            i++;
        }
    }
	
	
	
	
	public SalesRepsModuleFunctionalityPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean clickintotheSalesRepsmoduletab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Sales Reps Module tab
	    List<WebElement> salesrepsmoduletabs = driver.findElements(salesrepsmoduletab);

	    if (salesrepsmoduletabs.isEmpty()) {
	        // Sales Reps Module tab NOT present → stop scenario
	        return false;
	    }

	    WebElement salesrepsmoduletab = salesrepsmoduletabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(salesrepsmoduletab));
	    salesrepsmoduletab.click();

	    return true;
	}
	
	
	//-------------------------Sales Rep Questions Section----------------------------------------
	
	
	public boolean clickintothesalesrepquestionstabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Sales Rep Questions tab
	    List<WebElement> SalesRepQuestionstabs = driver.findElements(salesrepquestiontabinsidebar);

	    if (SalesRepQuestionstabs.isEmpty()) {
	        // Sales Rep Questions tab NOT present → stop scenario
	        return false;
	    }

	    WebElement SalesRepQuestionstab = SalesRepQuestionstabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(SalesRepQuestionstab));
	    SalesRepQuestionstab.click();

	    return true;
	}
	
	public boolean clickintotheAddNewSalesRepQuestionbutton () {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Sales Reps Questions button
	    List<WebElement> addnewsalesquestionbuttons = driver.findElements(addnewsalesrepquestionbutton);

	    if (addnewsalesquestionbuttons.isEmpty()) {
	        // Sales Reps Questions button NOT present → stop scenario
	        return false;
	    }

	    WebElement addnewsalesquestionbutton = addnewsalesquestionbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(addnewsalesquestionbutton));
	    addnewsalesquestionbutton.click();

	    return true;
	}
	
	public void entertheSalesRepQuestions(String SalesRepQuestion) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement questionstextboxfield = wait.until(ExpectedConditions.elementToBeClickable(questionstextbox));

	    // Extra safety for animation/overlay
	    wait.until(driver -> questionstextboxfield.isDisplayed()
	            && questionstextboxfield.isEnabled());

	    questionstextboxfield.click();
	    questionstextboxfield.clear();
	    questionstextboxfield.sendKeys(SalesRepQuestion);

	    System.out.println("Sales Rep Question entered: " + SalesRepQuestion);
    }
	
	public void clickintotheCalculativecheckboxinSalesRepQuestions() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement calculativecheckboxinsalesrepquestionstab = wait.until(ExpectedConditions.elementToBeClickable(calculativecheckboxinsalesrepquestions));
	   
	    try {
	    	calculativecheckboxinsalesrepquestionstab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", calculativecheckboxinsalesrepquestionstab);
	    }

	    System.out.println("Calculative Checkbox clicked successfully");
	}
	
	public void clickintotheMandatorycheckboxinSalesRepQuestions() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement mandatorycheckboxinsalesrepquestionstab = wait.until(ExpectedConditions.elementToBeClickable(mandatorycheckboxinsalesrepquestions));
	   
	    try {
	    	mandatorycheckboxinsalesrepquestionstab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", mandatorycheckboxinsalesrepquestionstab);
	    }

	    System.out.println("Mandatory Checkbox clicked successfully");
	}
	
	public String clickintothesubmitbuttoninSalesRepQuestions() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='detailBackgroundContainer pb-3'])[1]")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninsalesrepquestions));

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

	    return "SUCCESS: New Sale Rep Question added successfully";
	}
	
	public boolean clickintothethreedotbuttoninSalesRepQuestions() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for three dot button
	    List<WebElement> threedotButtons = driver.findElements(threedotbuttoninsalesrepquestions);

	    if (threedotButtons.isEmpty()) {
	        // Three dot button NOT present → stop scenario
	        return false;
	    }

	    WebElement threedotButton = threedotButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(threedotButton));
	    threedotButton.click();

	    return true;
	}

	
	public boolean clickintotheEditbuttoninExistingSalesRepQuestion() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit button
	    List<WebElement> editbuttons = driver.findElements(editbuttoninsalesrepquestions);

	    if (editbuttons.isEmpty()) {
	        // Edit button NOT present → stop scenario
	        return false;
	    }

	    WebElement editbutton = editbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(editbutton));
	    editbutton.click();

	    return true;
	}
	
	public boolean clickintotheDeletebuttoninExistingSalesRepQuestion() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletebuttoninsalesrepquestions);

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
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletebuttoninsalesrepquestions));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	
	//-------------------------------------Buckets Section--------------------------------------------
	
	
	public boolean clickintotheBucketstabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Bucket Button
	    List<WebElement> bucketsButtons = driver.findElements(bucketstabinsidebar);

	    if (bucketsButtons.isEmpty()) {
	        // Bucket Button NOT present → stop scenario
	        return false;
	    }

	    WebElement bucketsButton = bucketsButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(bucketsButton));
	    bucketsButton.click();

	    return true;
	}
	
	public boolean clickintotheNewFoldertabinSalesRepDocuments() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for New Folder
	    List<WebElement> newfoldertabs = driver.findElements(newfoldertabinbuckets);

	    if (newfoldertabs.isEmpty()) {
	        // New Folder NOT present → stop scenario
	        return false;
	    }

	    WebElement newfoldertab = newfoldertabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newfoldertab));
	    newfoldertab.click();

	    return true;
	}
	
	public void entertheFolderNameinBuckets(String FolderName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement FolderNametextboxfield = wait.until(ExpectedConditions.elementToBeClickable(foldernametextboxinbuckets));

	    // Extra safety for animation/overlay
	    wait.until(driver -> FolderNametextboxfield.isDisplayed()
	            && FolderNametextboxfield.isEnabled());

	    FolderNametextboxfield.click();
	    FolderNametextboxfield.clear();
	    FolderNametextboxfield.sendKeys(FolderName);

	    System.out.println("Folder Name entered: " + FolderName);
    }
	
	public boolean selecttheFolderType(String FolderType) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement foldertypeDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(foldertypedropdowninbuckets));

	        Select select = new Select(foldertypeDropdown);

	        // 2️ Select by visible text
	        select.selectByVisibleText(FolderType);

	        System.out.println("Folder Type selected: " + FolderType);
	        return true;

	    } catch (NoSuchElementException e) {
	        // Folder Type not present → do NOT fail
	        System.out.println(" Type '" + FolderType + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(" Error selecting folder type — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public String clickintothesubmitbuttoninBuckets() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='addFolderToolTip']//div[@class='modal-content']")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninbuckets));

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

	    return "SUCCESS: New Folder is added successfully";
	}
	
	public boolean clickintothethreedotbuttoninExistingFolder() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for three dot button
	    List<WebElement> threedotButtons = driver.findElements(threedotbuttoninbuckets);

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

	    // IMPORTANT: NO wait for Edit Button
	    List<WebElement> EditButtons = driver.findElements(editbuttoninexistingfolder);

	    if (EditButtons.isEmpty()) {
	        // Edit Button NOT present → stop scenario
	        return false;
	    }

	    WebElement EditButton = EditButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(EditButton));
	    EditButton.click();

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
	
	public boolean clickintothepermissionbuttoninExistingFolder() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for permission button
	    List<WebElement> permissionbuttons = driver.findElements(permissionbuttoninexistingfolder);

	    if (permissionbuttons.isEmpty()) {
	        // Permission button NOT present → stop scenario
	        return false;
	    }

	    WebElement permissionbutton = permissionbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(permissionbutton));
	    permissionbutton.click();

	    return true;
	}
	
	public void clickintotheFirstZoneCheckboxinPermission() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement Firstzonecheckboxbutton = wait.until(ExpectedConditions.elementToBeClickable(firstcheckboxofzoneinpermission));
	   
	    try {
	    	Firstzonecheckboxbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Firstzonecheckboxbutton);
	    }

	    System.out.println("First Zone Checkbox button clicked successfully");
	}
	
	public String clickintothesubmitbuttoninPermission() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='divPrimarycontent'])[1]")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninpermission));

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

	    return "SUCCESS: Permission is added successfully";
	}
	
	public boolean clickintotheUserPermissionbuttoninExistingFolder() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for User permission button
	    List<WebElement> userpermissionbuttons = driver.findElements(userpermissionbuttoninexistingfolder);

	    if (userpermissionbuttons.isEmpty()) {
	        // User Permission button NOT present → stop scenario
	        return false;
	    }

	    WebElement userpermissionbutton = userpermissionbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(userpermissionbutton));
	    userpermissionbutton.click();

	    return true;
	}
	
	public void clickintotheFirstUserCheckboxinUserPermission() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement Firstusercheckboxbutton = wait.until(ExpectedConditions.elementToBeClickable(firstusercheckboxinuserpermission));
	   
	    try {
	    	Firstusercheckboxbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Firstusercheckboxbutton);
	    }

	    System.out.println("First User Checkbox button clicked successfully");
	}
	
	public String clickintothesubmitbuttoninUserPermission() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='divPrimaryUsercontent'])[1]")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninuserpermission));

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

	    return "SUCCESS: User Permission is added successfully";
	}
	
	public boolean clickintotheExistingfoldertabinBuckets() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for existing folder tab button
	    List<WebElement> existingfolderbuttons = driver.findElements(existingfoldertabinbuckets);

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
	
	public boolean clickintotheUploadtabinBuckets() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Upload tab
	    List<WebElement> uploadtabs = driver.findElements(uploadtabinbuckets);

	    if (uploadtabs.isEmpty()) {
	        // Upload tab NOT present → stop scenario
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

            WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(choosefilestabinuploadfile));

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
	
	public String clickintothesubmitbuttoninUploadFile() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='addFileToolTip']//div[@class='modal-content']")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninuploadfile));

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

	    return "SUCCESS: File is upload successfully";
	}
	
	public boolean clickintotheEditFilebuttoninBuckets() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit Button
	    List<WebElement> EditButtons = driver.findElements(editfilebuttoninbuckets);

	    if (EditButtons.isEmpty()) {
	        // Edit Button NOT present → stop scenario
	        return false;
	    }

	    WebElement EditButton = EditButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(EditButton));
	    EditButton.click();

	    return true;
	}
	
	public void entertheNewFileName(String FileName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement FileNametextboxfield = wait.until(ExpectedConditions.elementToBeClickable(filenametextboxineditfile));

	    // Extra safety for animation/overlay
	    wait.until(driver -> FileNametextboxfield.isDisplayed()
	            && FileNametextboxfield.isEnabled());

	    FileNametextboxfield.click();
	    FileNametextboxfield.clear();
	    FileNametextboxfield.sendKeys(FileName);

	    System.out.println("File Name entered: " + FileName);
    }
	
	public String clickintothesubmitbuttoninEditFile() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='addFileToolTip']//div[@class='modal-content']")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttonineditfile));

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

	    return "SUCCESS: File Name is change successfully";
	}
	
	public boolean clickintotheDeletebuttoninExistingFile() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletefilebuttoninbuckets);

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
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletefilebuttoninbuckets));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	public boolean clickintotheDownloadFilebuttoninBuckets() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Download Button
	    List<WebElement> DownloadButtons = driver.findElements(downloadfilebuttoninbuckets);

	    if (DownloadButtons.isEmpty()) {
	        // Download Button NOT present → stop scenario
	        return false;
	    }

	    WebElement DownloadButton = DownloadButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(DownloadButton));
	    DownloadButton.click();

	    return true;
	}
	
	
	//-----------------------------------Sales Rep Visit Section----------------------------------
	
	
	public boolean clickintotheSalesRepVisittabinsidebar () {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Sales Rep Visits tab
	    List<WebElement> salesrepvisittabs = driver.findElements(salesrepvisittabinsidebar);

	    if (salesrepvisittabs.isEmpty()) {
	        // Sales Rep Visits tab NOT present → stop scenario
	        return false;
	    }

	    WebElement salesrepvisittab = salesrepvisittabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(salesrepvisittab));
	    salesrepvisittab.click();

	    return true;
	}
	
	public boolean clickintotheQuickTexttabinsalesrepvisits() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for quicktext tab button
	    List<WebElement> quicktexttabs = driver.findElements(quicktexttabinsalesrepvisits);

	    if (quicktexttabs.isEmpty()) {
	        // Quick Text tab NOT present → stop scenario
	        return false;
	    }

	    WebElement quicktexttab = quicktexttabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(quicktexttab));
	    quicktexttab.click();

	    return true;
	}
	
	public boolean selecttheUserByIndexinQuickText(int index) {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	        // 1️⃣ User input box
	        WebElement userInput = wait.until(
	                ExpectedConditions.elementToBeClickable(userdropdowninquicktext));
	        userInput.click();

	        System.out.println("User dropdown clicked");

	        // 2️⃣ Wait for dropdown list to render
	        By userOptionsLocator = By.xpath("//ul[contains(@class,'es-list')]/li");

	        wait.until(driver -> driver.findElements(userOptionsLocator).size() > 0);

	        List<WebElement> users = driver.findElements(userOptionsLocator);
	        System.out.println("Total users available: " + users.size());

	        // 3️⃣ Validate index
	        if (users.size() <= index) {
	            System.err.println("User NOT present for index: " + index);
	            return false;
	        }

	        // 4️⃣ Scroll + click (safe for dynamic UI)
	        WebElement userToSelect = users.get(index);
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].scrollIntoView(true);", userToSelect);
	        userToSelect.click();

	        System.out.println("User selected at index: " + index);
	        return true;

	    } catch (Exception e) {
	        System.err.println("Exception while selecting user: " + e.getMessage());
	        return false;
	    }
	}
		
	public void enterthePhoneNumerinQuickText(String PhoneNumber) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    // 🔁 CRITICAL: wait until input is BOTH visible AND enabled
	    WebElement phoneInput = wait.until(driver -> {
	        WebElement el = driver.findElement(phonenumbertextboxinquicktext);
	        return (el.isDisplayed() && el.isEnabled()) ? el : null;
	    });

	    // Clear only if editable
	    phoneInput.clear();
	    phoneInput.sendKeys(PhoneNumber);

	    System.out.println("Phone number entered: " + PhoneNumber);
	}
	
	public boolean selecttheTemplateByIndexinQuickText(int TemplateByIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement TemplateDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(templatedropdowninquicktext));

	        Select select = new Select(TemplateDropdown);

	        // 2️ Select by index
	        select.selectByIndex(TemplateByIndex);

	        String selectedTemplate = select.getFirstSelectedOption().getText();
	        System.out.println("Template selected by index (" + TemplateByIndex + "): " + selectedTemplate);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Template index '" + TemplateByIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting template by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public void entertheBodyinQuickText(String Body) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// 1️ Wait for preloader to disappear
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		// 2️ Locate editor
		WebElement editor = wait.until(ExpectedConditions.visibilityOfElementLocated(bodytextboxinquicktext));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 3️ Focus editor
		js.executeScript("arguments[0].focus();", editor);

		// 4️ Clear existing content correctly
		js.executeScript("arguments[0].innerText = '';", editor);

		// 5️ Insert text as user input
		js.executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true }));", editor);
		    editor.sendKeys(Body);
		    System.out.println("Body entered successfully");
  	}
	
	public String clickintotheSendbuttoninQuickText() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-dialog modal-notify modalLaptopCenter']//div[@class='modal-content']")));

	    WebElement sendBtn = wait.until(ExpectedConditions.presenceOfElementLocated(sendbuttoninquicktext));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(sendBtn)).click();
	        System.out.println("Send button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", sendBtn);
	        System.out.println("Send button clicked using JS");
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

	    return "SUCCESS: Quick Text Send successfully";
	}
	
	public boolean clickintotheSendVCardtabinSalesRepVisits() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Send VCard tab
	    List<WebElement> sendvcardtabs = driver.findElements(sendvcardtabinsalesrepvisits);

	    if (sendvcardtabs.isEmpty()) {
	        // Send VCard tab NOT present → stop scenario
	        return false;
	    }

	    WebElement sendvcardtab = sendvcardtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(sendvcardtab));
	    sendvcardtab.click();

	    return true;
	}
	
	public void enterthePhoneNumberinSendVCard(String PhoneNumberinVCard) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    // CRITICAL: wait until input is BOTH visible AND enabled
	    WebElement phoneInput = wait.until(driver -> {
	        WebElement el = driver.findElement(phonenumbertextboxinsendvcard);
	        return (el.isDisplayed() && el.isEnabled()) ? el : null;
	    });

	    // Clear only if editable
	    phoneInput.clear();
	    phoneInput.sendKeys(PhoneNumberinVCard);

	    System.out.println("Phone number entered: " + PhoneNumberinVCard);
	}
	
	public void entertheBodyinSendVCard(String BodyinSendVcard) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// 1️ Wait for preloader to disappear
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		// 2️ Locate editor
		WebElement editor = wait.until(ExpectedConditions.visibilityOfElementLocated(bodytextboxinsendvcard));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 3️ Focus editor
		js.executeScript("arguments[0].focus();", editor);

		// 4️ Clear existing content correctly
		js.executeScript("arguments[0].innerText = '';", editor);

		// 5️ Insert text as user input
		js.executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true }));", editor);
		    editor.sendKeys(BodyinSendVcard);
		    System.out.println("Body entered successfully");
  	}
	
	public String clickintotheSendbuttoninSendVCard() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='vcardModal']//div[@class='modal-content']")));

	    WebElement sendBtn = wait.until(ExpectedConditions.presenceOfElementLocated(sendbuttoninsendvcard));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(sendBtn)).click();
	        System.out.println("Send button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", sendBtn);
	        System.out.println("Send button clicked using JS");
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

	    return "SUCCESS: VCard Send successfully";
	}
	
	public boolean clickintotheNewSalesRepVisitstabinSalesRepVisits() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for New Sales Rep Visits tab
	    List<WebElement> newsalesrepvisitstabs = driver.findElements(newsalesrepvisitstaninsalesrepvisits);

	    if (newsalesrepvisitstabs.isEmpty()) {
	        // Sales Rep Visits tab NOT present → stop scenario
	        return false;
	    }

	    WebElement newsalesrepvisitstab = newsalesrepvisitstabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newsalesrepvisitstab));
	    newsalesrepvisitstab.click();

	    return true;
	}
	
	public void selectMeetingTime(String hour, String minute) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        // Open time picker
        wait.until(ExpectedConditions.elementToBeClickable(meetingtimetextboxinsalesrepvisit)).click();

        // Select Hour
        WebElement hourElement = wait.until(ExpectedConditions.elementToBeClickable(hourValue(hour)));
        hourElement.click();

        // Select Minute
        WebElement minuteElement = wait.until(ExpectedConditions.elementToBeClickable(minuteValue(minute)));
        minuteElement.click();
    }
	
	public boolean selecttheProviderinSalesRepVisit(int ProviderIndex) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement ProviderDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(providerdropdownbuttoninsalesrepvisit));

	        Select select = new Select(ProviderDropdown);

	        // 2️ Select by index
	        select.selectByIndex(ProviderIndex);

	        String selectedProvider = select.getFirstSelectedOption().getText();
	        System.out.println("Provider selected by index (" + ProviderIndex + "): " + selectedProvider);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Provider index '" + ProviderIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println("Error selecting provider by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean selecttheProviderExecutiveinSalesRepVisit(int ProviderExecutiveIndex) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement ProviderExecutiveDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(providerexecutivedropdownbuttoninsales));

	        Select select = new Select(ProviderExecutiveDropdown);

	        // 2️ Select by index
	        select.selectByIndex(ProviderExecutiveIndex);

	        String selectedProviderExecutive = select.getFirstSelectedOption().getText();
	        System.out.println("Provider Executive selected by index (" + ProviderExecutiveIndex + "): " + selectedProviderExecutive);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Provider Executive index '" + ProviderExecutiveIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println("Error selecting provider executive by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean selecttheProviderAddressinSalesRepVisit(int ProviderAddressIndex) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement ProviderAddressDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(provideraddressdropdownbuttoninsales));

	        Select select = new Select(ProviderAddressDropdown);

	        // 2️ Select by index
	        select.selectByIndex(ProviderAddressIndex);

	        String selectedProviderAddress = select.getFirstSelectedOption().getText();
	        System.out.println("Provider Address selected by index (" + ProviderAddressIndex + "): " + selectedProviderAddress);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Provider Address index '" + ProviderAddressIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println("Error selecting provider address by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean entertheProviderLastName(String ProviderLName) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        WebElement ProviderLNameTextbox = wait.until(ExpectedConditions.elementToBeClickable(providerlastnametextboxinsales));

	        ProviderLNameTextbox.click();
	        ProviderLNameTextbox.clear();
	        ProviderLNameTextbox.sendKeys(ProviderLName);

	        System.out.println("Provider Last Name entered: " + ProviderLName);
	        return true;

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable: " + e.getMessage());
	        return false;
	    }
	}
	
	public boolean entertheProviderFirstName(String ProviderFName) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        WebElement ProviderFNameTextbox = wait.until(ExpectedConditions.elementToBeClickable(providerfirstnametextboxinsales));

	        ProviderFNameTextbox.click();
	        ProviderFNameTextbox.clear();
	        ProviderFNameTextbox.sendKeys(ProviderFName);

	        System.out.println("Provider First Name entered: " + ProviderFName);
	        return true;

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable: " + e.getMessage());
	        return false;
	    }
	}
	
	public boolean entertheNPINumber(String NPINumber) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        WebElement NPINumberTextbox = wait.until(ExpectedConditions.elementToBeClickable(NPINumbertextboxinsales));

	        NPINumberTextbox.click();
	        NPINumberTextbox.clear();
	        NPINumberTextbox.sendKeys(NPINumber);

	        System.out.println("NPI Number entered: " + NPINumber);
	        return true;

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable: " + e.getMessage());
	        return false;
	    }
	}
	
	public boolean entertheProviderEmailID(String ProviderEmailID) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        WebElement ProviderEmailIDTextbox = wait.until(ExpectedConditions.elementToBeClickable(provideremailidinsales));

	        ProviderEmailIDTextbox.click();
	        ProviderEmailIDTextbox.clear();
	        ProviderEmailIDTextbox.sendKeys(ProviderEmailID);

	        System.out.println("Provider EmailID entered: " + ProviderEmailID);
	        return true;

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable: " + e.getMessage());
	        return false;
	    }
	}
	
	public boolean entertheProviderZone(String ProviderZone) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        WebElement ProviderZoneTextbox = wait.until(ExpectedConditions.elementToBeClickable(providerzoneinsales));

	        ProviderZoneTextbox.click();
	        ProviderZoneTextbox.clear();
	        ProviderZoneTextbox.sendKeys(ProviderZone);

	        System.out.println("Provider Zone entered: " + ProviderZone);
	        return true;

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable: " + e.getMessage());
	        return false;
	    }
	}
	
	public boolean entertheProviderExecutiveFName(String ProviderExecutiveFName) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        WebElement ProviderExecutiveFNameTextbox = wait.until(ExpectedConditions.elementToBeClickable(providerexecutivefirstnametextboxinsales));

	        ProviderExecutiveFNameTextbox.click();
	        ProviderExecutiveFNameTextbox.clear();
	        ProviderExecutiveFNameTextbox.sendKeys(ProviderExecutiveFName);

	        System.out.println("Provider Executive First Name entered: " + ProviderExecutiveFName);
	        return true;

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable: " + e.getMessage());
	        return false;
	    }
	}
	
	public boolean entertheProviderExecutiveLName(String ProviderExecutiveLName) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        WebElement ProviderExecutiveLNameTextbox = wait.until(ExpectedConditions.elementToBeClickable(providerexecutivelastnametextboxinsales));

	        ProviderExecutiveLNameTextbox.click();
	        ProviderExecutiveLNameTextbox.clear();
	        ProviderExecutiveLNameTextbox.sendKeys(ProviderExecutiveLName);

	        System.out.println("Provider Executive Last Name entered: " + ProviderExecutiveLName);
	        return true;

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable: " + e.getMessage());
	        return false;
	    }
	}
	
	public boolean entertheStreetAddressDetailsinSales(String StreetAddress) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        WebElement StreetAddressTextbox = wait.until(ExpectedConditions.elementToBeClickable(streetaddresstextboxinsales));

	        StreetAddressTextbox.click();
	        StreetAddressTextbox.clear();
	        StreetAddressTextbox.sendKeys(StreetAddress);

	        System.out.println("Street Address entered: " + StreetAddress);
	        return true;

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable: " + e.getMessage());
	        return false;
	    }
	}
	
	public boolean entertheCityAddressDetailsinSales(String CityAddress) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        WebElement CityAddressTextbox = wait.until(ExpectedConditions.elementToBeClickable(cityaddresstextboxinsales));

	        CityAddressTextbox.click();
	        CityAddressTextbox.clear();
	        CityAddressTextbox.sendKeys(CityAddress);

	        System.out.println("City Address entered: " + CityAddress);
	        return true;

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable: " + e.getMessage());
	        return false;
	    }
	}
	
	public boolean entertheStateAddressDetailsinSales(String StateAddress) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        WebElement StateAddressTextbox = wait.until(ExpectedConditions.elementToBeClickable(stateaddresstextboxinsales));

	        StateAddressTextbox.click();
	        StateAddressTextbox.clear();
	        StateAddressTextbox.sendKeys(StateAddress);

	        System.out.println("State Address entered: " + StateAddress);
	        return true;

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable: " + e.getMessage());
	        return false;
	    }
	}
	
	public boolean entertheZipCodeAddressDetailsinSales(String ZipCodeAddress) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        WebElement ZipCodeAddressTextbox = wait.until(ExpectedConditions.elementToBeClickable(zipcodeaddresstextboxinsales));

	        ZipCodeAddressTextbox.click();
	        ZipCodeAddressTextbox.clear();
	        ZipCodeAddressTextbox.sendKeys(ZipCodeAddress);

	        System.out.println("ZipCode Address entered: " + ZipCodeAddress);
	        return true;

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable: " + e.getMessage());
	        return false;
	    }
	}
	
	public boolean entertheContactNumber1AddressDetailsinSales(String ContactNumberAddress) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        WebElement ContactNumberAddressTextbox = wait.until(ExpectedConditions.elementToBeClickable(contactnumber1textboxinsales));

	        ContactNumberAddressTextbox.click();
	        ContactNumberAddressTextbox.clear();
	        ContactNumberAddressTextbox.sendKeys(ContactNumberAddress);

	        System.out.println("Contact Number Address entered: " + ContactNumberAddress);
	        return true;

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable: " + e.getMessage());
	        return false;
	    }
	}
	
	public boolean entertheContactNumber2AddressDetailsinSales(String ContactNumber2Address) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        WebElement ContactNumber2AddressTextbox = wait.until(ExpectedConditions.elementToBeClickable(contactnumber2textboxinsales));

	        ContactNumber2AddressTextbox.click();
	        ContactNumber2AddressTextbox.clear();
	        ContactNumber2AddressTextbox.sendKeys(ContactNumber2Address);

	        System.out.println("Contact Number2 Address entered: " + ContactNumber2Address);
	        return true;

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable: " + e.getMessage());
	        return false;
	    }
	}
	
	public boolean entertheFAXAddressDetailsinSales(String FAXAddress) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        WebElement FAXAddressTextbox = wait.until(ExpectedConditions.elementToBeClickable(faxaddresstextboxinsales));

	        FAXAddressTextbox.click();
	        FAXAddressTextbox.clear();
	        FAXAddressTextbox.sendKeys(FAXAddress);

	        System.out.println("FAX Address entered: " + FAXAddress);
	        return true;

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable: " + e.getMessage());
	        return false;
	    }
	}
	
	public boolean entertheFrontDeskNameAddressDetailsinSales(String FrontDeskNameAddress) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        WebElement FrontDeskNameAddressTextbox = wait.until(ExpectedConditions.elementToBeClickable(frontdesknametextboxinsales));

	        FrontDeskNameAddressTextbox.click();
	        FrontDeskNameAddressTextbox.clear();
	        FrontDeskNameAddressTextbox.sendKeys(FrontDeskNameAddress);

	        System.out.println("Front Desk Name Address entered: " + FrontDeskNameAddress);
	        return true;

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable: " + e.getMessage());
	        return false;
	    }
	}
	
	public void bringProviderAvailabilityIntoView() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    By providerAvailabilitySection = By.id("providerName");

	    WebElement section =
	            wait.until(ExpectedConditions.visibilityOfElementLocated(providerAvailabilitySection));

	    js.executeScript(
	            "arguments[0].scrollIntoView({block:'center'});",
	            section
	    );

	    System.out.println("Provider Availability section is in view");
	}
	
	public void selectAvailabilityForDay(String day, String fromTime, String toTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    try {
	        // Day checkbox
	        By dayLabel = By.xpath("//label[normalize-space()='" + day + "']");
	        WebElement label = wait.until(ExpectedConditions.presenceOfElementLocated(dayLabel));

	        // From Time textbox
	        By fromTimeInput = By.id("SalesRepVisit_Provider_" + day + "FromTime");
	        WebElement fromTimeElement = wait.until(ExpectedConditions.presenceOfElementLocated(fromTimeInput));

	        // To Time textbox
	        By toTimeInput = By.id("SalesRepVisit_Provider_" + day + "ToTime");
	        WebElement toTimeElement = wait.until(ExpectedConditions.presenceOfElementLocated(toTimeInput));

	        // Scroll + click checkbox
	        js.executeScript("arguments[0].scrollIntoView({block:'center'});", label);
	        if (!label.isSelected()) {
	            label.click();
	        }

	        // Set From Time
	        js.executeScript(
	                "arguments[0].removeAttribute('readonly'); arguments[0].value=arguments[1];",
	                fromTimeElement, fromTime
	        );

	        // Set To Time
	        js.executeScript(
	                "arguments[0].removeAttribute('readonly'); arguments[0].value=arguments[1];",
	                toTimeElement, toTime
	        );

	        System.out.println(day + " availability set: " + fromTime + " - " + toTime);

	    } catch (TimeoutException e) {
	        throw new RuntimeException(
	                "❌ Availability fields are NOT present for day: " + day + ". Stopping execution.",
	                e
	        );
	    }
	}
	
	public boolean uploadTheCardFrontImageinSales(String filePath) {
		try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(choosefilebuttonincardfrontimage));

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
	
	public boolean uploadTheCardBackImageinSales(String filePath) {
		try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(choosefilebuttonincardbackimage));

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
	
	public boolean entertheNotesinSalesVisit(String NotesSalesVisit) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        WebElement NotesSalesVisitTextbox = wait.until(ExpectedConditions.elementToBeClickable(notestextboxinsalesvisit));

	        NotesSalesVisitTextbox.click();
	        NotesSalesVisitTextbox.clear();
	        NotesSalesVisitTextbox.sendKeys(NotesSalesVisit);

	        System.out.println("Notes Sales Visit entered: " + NotesSalesVisit);
	        return true;

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable: " + e.getMessage());
	        return false;
	    }
	}
	
	public boolean enterFirstQAnswerinSales(String FirstQAnswer) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        // Check if textbox exists
	        List<WebElement> elements = driver.findElements(firstQuestionTextbox);
	        if (elements.isEmpty()) {
	            System.out.println("First Q Answer textbox is not present. Skipping this step.");
	            return false; // textbox missing
	        }

	        WebElement FirstQAnswertextbox = wait.until(ExpectedConditions.elementToBeClickable(elements.get(0)));

	        FirstQAnswertextbox.click();
	        FirstQAnswertextbox.clear();
	        FirstQAnswertextbox.sendKeys(FirstQAnswer);

	        System.out.println("First Q Answer entered: " + FirstQAnswer);
	        return true; // success

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable. Skipping this step: " + e.getMessage());
	        return false; // cannot interact
	    }
	}
	
	public boolean enterSecondQAnswerinSales(String SecondQAnswer) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        // Check if textbox exists
	        List<WebElement> elements = driver.findElements(secondQuestionTextbox);
	        if (elements.isEmpty()) {
	            System.out.println("Second Q Answer textbox is not present. Skipping this step.");
	            return false; // textbox missing
	        }

	        WebElement SecondQAnswertextbox = wait.until(ExpectedConditions.elementToBeClickable(elements.get(0)));

	        SecondQAnswertextbox.click();
	        SecondQAnswertextbox.clear();
	        SecondQAnswertextbox.sendKeys(SecondQAnswer);

	        System.out.println("Second Q Answer entered: " + SecondQAnswer);
	        return true; // success

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable. Skipping this step: " + e.getMessage());
	        return false; // cannot interact
	    }
	}
	
	public boolean enterThirdQAnswerinSales(String ThirdQAnswer) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        // Check if textbox exists
	        List<WebElement> elements = driver.findElements(thirdQuestionTextbox);
	        if (elements.isEmpty()) {
	            System.out.println("Third Q Answer textbox is not present. Skipping this step.");
	            return false; // textbox missing
	        }

	        WebElement ThirdQAnswertextbox = wait.until(ExpectedConditions.elementToBeClickable(elements.get(0)));

	        ThirdQAnswertextbox.click();
	        ThirdQAnswertextbox.clear();
	        ThirdQAnswertextbox.sendKeys(ThirdQAnswer);

	        System.out.println("Third Q Answer entered: " + ThirdQAnswer);
	        return true; // success

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable. Skipping this step: " + e.getMessage());
	        return false; // cannot interact
	    }
	}
	
	public boolean enterFourthQAnswerinSales(String FourthQAnswer) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        // Check if textbox exists
	        List<WebElement> elements = driver.findElements(fourthQuestionTextbox);
	        if (elements.isEmpty()) {
	            System.out.println("Fourth Q Answer textbox is not present. Skipping this step.");
	            return false; // textbox missing
	        }

	        WebElement FourthQAnswertextbox = wait.until(ExpectedConditions.elementToBeClickable(elements.get(0)));

	        FourthQAnswertextbox.click();
	        FourthQAnswertextbox.clear();
	        FourthQAnswertextbox.sendKeys(FourthQAnswer);

	        System.out.println("Fourth Q Answer entered: " + FourthQAnswer);
	        return true; // success

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable. Skipping this step: " + e.getMessage());
	        return false; // cannot interact
	    }
	}
		
	public boolean enterFifthQAnswerinSales(String FifthQAnswer) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        // Check if textbox exists
	        List<WebElement> elements = driver.findElements(fifthQuestionTextbox);
	        if (elements.isEmpty()) {
	            System.out.println("Fifth Q Answer textbox is not present. Skipping this step.");
	            return false; // textbox missing
	        }

	        WebElement FifthQAnswertextbox = wait.until(ExpectedConditions.elementToBeClickable(elements.get(0)));

	        FifthQAnswertextbox.click();
	        FifthQAnswertextbox.clear();
	        FifthQAnswertextbox.sendKeys(FifthQAnswer);

	        System.out.println("Fifth Q Answer entered: " + FifthQAnswer);
	        return true; // success

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable. Skipping this step: " + e.getMessage());
	        return false; // cannot interact
	    }
	}
	
	public boolean enterSixthQAnswerinSales(String SixthQAnswer) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        // Check if textbox exists
	        List<WebElement> elements = driver.findElements(sixthQuestionTextbox);
	        if (elements.isEmpty()) {
	            System.out.println("Sixth Q Answer textbox is not present. Skipping this step.");
	            return false; // textbox missing
	        }

	        WebElement SixthQAnswertextbox = wait.until(ExpectedConditions.elementToBeClickable(elements.get(0)));

	        SixthQAnswertextbox.click();
	        SixthQAnswertextbox.clear();
	        SixthQAnswertextbox.sendKeys(SixthQAnswer);

	        System.out.println("Sixth Q Answer entered: " + SixthQAnswer);
	        return true; // success

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable. Skipping this step: " + e.getMessage());
	        return false; // cannot interact
	    }
	}
	
	public boolean enterSeventhQAnswerinSales(String SeventhQAnswer) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        // Check if textbox exists
	        List<WebElement> elements = driver.findElements(seventhQuestionTextbox);
	        if (elements.isEmpty()) {
	            System.out.println("Seventh Q Answer textbox is not present. Skipping this step.");
	            return false; // textbox missing
	        }

	        WebElement SeventhQAnswertextbox = wait.until(ExpectedConditions.elementToBeClickable(elements.get(0)));

	        SeventhQAnswertextbox.click();
	        SeventhQAnswertextbox.clear();
	        SeventhQAnswertextbox.sendKeys(SeventhQAnswer);

	        System.out.println("Seventh Q Answer entered: " + SeventhQAnswer);
	        return true; // success

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable. Skipping this step: " + e.getMessage());
	        return false; // cannot interact
	    }
	}
	
	public boolean enterEighthQAnswerinSales(String EighthQAnswer) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        // Check if textbox exists
	        List<WebElement> elements = driver.findElements(eighthQuestionTextbox);
	        if (elements.isEmpty()) {
	            System.out.println("Eighth Q Answer textbox is not present. Skipping this step.");
	            return false; // textbox missing
	        }

	        WebElement EighthQAnswertextbox = wait.until(ExpectedConditions.elementToBeClickable(elements.get(0)));

	        EighthQAnswertextbox.click();
	        EighthQAnswertextbox.clear();
	        EighthQAnswertextbox.sendKeys(EighthQAnswer);

	        System.out.println("Eighth Q Answer entered: " + EighthQAnswer);
	        return true; // success

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable. Skipping this step: " + e.getMessage());
	        return false; // cannot interact
	    }
	}
	
	public boolean enterNinthQAnswerinSales(String NinthQAnswer) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        // Check if textbox exists
	        List<WebElement> elements = driver.findElements(ninthQuestionTextbox);
	        if (elements.isEmpty()) {
	            System.out.println("Ninth Q Answer textbox is not present. Skipping this step.");
	            return false; // textbox missing
	        }

	        WebElement NinthQAnswertextbox = wait.until(ExpectedConditions.elementToBeClickable(elements.get(0)));

	        NinthQAnswertextbox.click();
	        NinthQAnswertextbox.clear();
	        NinthQAnswertextbox.sendKeys(NinthQAnswer);

	        System.out.println("Ninth Q Answer entered: " + NinthQAnswer);
	        return true; // success

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable. Skipping this step: " + e.getMessage());
	        return false; // cannot interact
	    }
	}
	
	public boolean enterTenthQAnswerinSales(String TenthQAnswer) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    try {
	        // Check if textbox exists
	        List<WebElement> elements = driver.findElements(tenthQuestionTextbox);
	        if (elements.isEmpty()) {
	            System.out.println("Tenth Q Answer textbox is not present. Skipping this step.");
	            return false; // textbox missing
	        }

	        WebElement TenthQAnswertextbox = wait.until(ExpectedConditions.elementToBeClickable(elements.get(0)));

	        TenthQAnswertextbox.click();
	        TenthQAnswertextbox.clear();
	        TenthQAnswertextbox.sendKeys(TenthQAnswer);

	        System.out.println("Tenth Q Answer entered: " + TenthQAnswer);
	        return true; // success

	    } catch (Exception e) {
	        System.err.println("Textbox is not clickable. Skipping this step: " + e.getMessage());
	        return false; // cannot interact
	    }
	}
	
	public String clickintotheSendbuttoninSalesVisit() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='detailInnerContainer maxHeight']")));

	    WebElement sendBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninsalesvisit));

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

	    return "SUCCESS: Sales Rep Visit Meeting details added successfully";
	}
	
	public void clickintotheFiltertabinSales() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement filtertab = wait.until(ExpectedConditions.elementToBeClickable(filtertabinsales));
	   
	    try {
	    	filtertab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", filtertab);
	    }

	    System.out.println("Filter Tab clicked successfully");
	}
	
	public void entertheProviderNameinFilterSales(String ProviderName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ProviderNametextboxfield = wait.until(ExpectedConditions.elementToBeClickable(providernametextboxinfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ProviderNametextboxfield.isDisplayed()
	            && ProviderNametextboxfield.isEnabled());

	    ProviderNametextboxfield.click();
	    ProviderNametextboxfield.clear();
	    ProviderNametextboxfield.sendKeys(ProviderName);

	    System.out.println("Provider Name entered: " + ProviderName);
    }
	
	public void entertheSalesRepUserPininFilterSales(String SalesRepUserPin) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement SalesRepUserPintextboxfield = wait.until(ExpectedConditions.elementToBeClickable(salesrepuserpintextboxinfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> SalesRepUserPintextboxfield.isDisplayed()
	            && SalesRepUserPintextboxfield.isEnabled());

	    SalesRepUserPintextboxfield.click();
	    SalesRepUserPintextboxfield.clear();
	    SalesRepUserPintextboxfield.sendKeys(SalesRepUserPin);

	    System.out.println("Sales Rep User Pin entered: " + SalesRepUserPin);
    }
	
	public void entertheZoneinFilterSales(String ZoneinFilter) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ZoneinFiltertextboxfield = wait.until(ExpectedConditions.elementToBeClickable(zonetextboxinfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ZoneinFiltertextboxfield.isDisplayed()
	            && ZoneinFiltertextboxfield.isEnabled());

	    ZoneinFiltertextboxfield.click();
	    ZoneinFiltertextboxfield.clear();
	    ZoneinFiltertextboxfield.sendKeys(ZoneinFilter);

	    System.out.println("Zone entered: " + ZoneinFilter);
    }
	
	public void clickintotheFromDateinFilter() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in SalesRepsModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement fromdatepicker = wait.until(ExpectedConditions.elementToBeClickable(fromdatepickertextboxinfilter));

        try {
        	fromdatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fromdatepicker);
        }

        System.out.println("From Date Picker clicked successfully");
    }
	
	public void selectFromTodaysDateinFilter() {
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
	
	public void clickintotheToDateinFilter() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in SalesRepsModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement todatepicker = wait.until(ExpectedConditions.elementToBeClickable(todatepicktertexboxinfilter));

        try {
        	todatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", todatepicker);
        }

        System.out.println("To Date Picker clicked successfully");
    }
	
	public void selectToDateAfter10Days() {

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
	
	public void entertheProviderExecutiveNameinFilterSales(String ProviderExecutiveName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ProviderExecutiveNametextboxfield = wait.until(ExpectedConditions.elementToBeClickable(providerexecutivenametextboxinfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ProviderExecutiveNametextboxfield.isDisplayed()
	            && ProviderExecutiveNametextboxfield.isEnabled());

	    ProviderExecutiveNametextboxfield.click();
	    ProviderExecutiveNametextboxfield.clear();
	    ProviderExecutiveNametextboxfield.sendKeys(ProviderExecutiveName);

	    System.out.println("Provider Executive Name entered: " + ProviderExecutiveName);
    }
	
	public void entertheCityinFilterSales(String CityinFilter) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement CityinFiltertextboxfield = wait.until(ExpectedConditions.elementToBeClickable(citytextboxinfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> CityinFiltertextboxfield.isDisplayed()
	            && CityinFiltertextboxfield.isEnabled());

	    CityinFiltertextboxfield.click();
	    CityinFiltertextboxfield.clear();
	    CityinFiltertextboxfield.sendKeys(CityinFilter);

	    System.out.println("City entered: " + CityinFilter);
    }
	
	public void entertheStateinFilterSales(String StateinFilter) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement StateinFiltertextboxfield = wait.until(ExpectedConditions.elementToBeClickable(statetextboxinfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> StateinFiltertextboxfield.isDisplayed()
	            && StateinFiltertextboxfield.isEnabled());

	    StateinFiltertextboxfield.click();
	    StateinFiltertextboxfield.clear();
	    StateinFiltertextboxfield.sendKeys(StateinFilter);

	    System.out.println("State entered: " + StateinFilter);
    }
	
	public void entertheZipcodeinFilterSales(String ZipcodeinFilter) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ZipcodeinFiltertextboxfield = wait.until(ExpectedConditions.elementToBeClickable(zipcodetextboxinfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ZipcodeinFiltertextboxfield.isDisplayed()
	            && ZipcodeinFiltertextboxfield.isEnabled());

	    ZipcodeinFiltertextboxfield.click();
	    ZipcodeinFiltertextboxfield.clear();
	    ZipcodeinFiltertextboxfield.sendKeys(ZipcodeinFilter);

	    System.out.println("Zip Code entered: " + ZipcodeinFilter);
    }
	
	public void entertheMeetinglocationinFilterSales(String MeetinglocationinFilter) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement MeetinglocationinFiltertextboxfield = wait.until(ExpectedConditions.elementToBeClickable(meetinglocationtextboxinfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> MeetinglocationinFiltertextboxfield.isDisplayed()
	            && MeetinglocationinFiltertextboxfield.isEnabled());

	    MeetinglocationinFiltertextboxfield.click();
	    MeetinglocationinFiltertextboxfield.clear();
	    MeetinglocationinFiltertextboxfield.sendKeys(MeetinglocationinFilter);

	    System.out.println("Meeting Location entered: " + MeetinglocationinFilter);
    }
	
	public void clickintotheCardAttachedCheckboxinFilter() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement cardattachedcheckboxtab = wait.until(ExpectedConditions.elementToBeClickable(cardattachedcheckboxinfilter));
	   
	    try {
	    	cardattachedcheckboxtab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", cardattachedcheckboxtab);
	    }

	    System.out.println("Card Attached Checkbox clicked successfully");
	}
	
	public void clickintotheNotesCheckboxinFilter() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement notescheckboxtab = wait.until(ExpectedConditions.elementToBeClickable(notescheckboxinfilter));
	   
	    try {
	    	notescheckboxtab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", notescheckboxtab);
	    }

	    System.out.println("Notes Checkbox clicked successfully");
	}
	
	public void clickintotheHavingFlashProviderCheckboxinFilter() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement havingflashprovidercheckboxtab = wait.until(ExpectedConditions.elementToBeClickable(havingflashprovidercheckboxinfilter));
	   
	    try {
	    	havingflashprovidercheckboxtab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", havingflashprovidercheckboxtab);
	    }

	    System.out.println("Having Flash Provider Checkbox clicked successfully");
	}
	
	public String clickintothesearchbuttoninFilter() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Click Search button
	    wait.until(ExpectedConditions.elementToBeClickable(searchbuttoninfilter)).click();

	    System.out.println("Search button clicked successfully");

	    try {
	        WebElement noRecordMsg = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='noRecordsText'])[1]")));

	        return "ERROR: " + noRecordMsg.getText();

	    } catch (TimeoutException ignored) {}

	    // User exists
	    return "SUCCESS: Record is shown";
	}
	
	public boolean clickintotheSetupmoduletab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Setup Module tab
	    List<WebElement> setupmoduletabs = driver.findElements(setupmoduletab);

	    if (setupmoduletabs.isEmpty()) {
	        // Setup Module tab NOT present → stop scenario
	        return false;
	    }

	    WebElement setupmoduletab = setupmoduletabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(setupmoduletab));
	    setupmoduletab.click();

	    return true;
	}
	
	public boolean clickintotheProfiletabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Profile tab
	    List<WebElement> profiletabs = driver.findElements(profiletabinsidebar);

	    if (profiletabs.isEmpty()) {
	        // Profile tab NOT present → stop scenario
	        return false;
	    }

	    WebElement profiletab = profiletabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(profiletab));
	    profiletab.click();

	    return true;
	}
	
	public void entertheProfileNameinFilter(String ProfileName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ProfileNametextboxfield = wait.until(ExpectedConditions.elementToBeClickable(profilenametextboxinfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ProfileNametextboxfield.isDisplayed()
	            && ProfileNametextboxfield.isEnabled());

	    ProfileNametextboxfield.click();
	    ProfileNametextboxfield.clear();
	    ProfileNametextboxfield.sendKeys(ProfileName);

	    System.out.println("Profile Name entered: " + ProfileName);
    }
}
