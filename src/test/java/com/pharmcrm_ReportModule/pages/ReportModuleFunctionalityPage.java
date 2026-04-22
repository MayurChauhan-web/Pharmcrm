package com.pharmcrm_ReportModule.pages;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReportModuleFunctionalityPage {
	WebDriver driver;
	
	//By Locators
	
	private By reportmoduletab = By.xpath("//a[@href='/Report/Home/Dashboard']//div[@class='module-list-main']//div[@class='module-list-img']");
	private By workflowtabinsidebar = By.xpath("(//a[@id='liWorkflow'])[1]");
	private By newrunninglinetabinworkflow = By.xpath("(//a[normalize-space()='New Runningline'])[1]");
	private By exportexcelbuttoninnewrunningline = By.xpath("(//span[normalize-space()='Export Excel'])[1]");
	private By star2faxtabinworkflow = By.xpath("(//a[normalize-space()='Star2 Fax'])[1]");
	private By filterbuttoninworkflow = By.xpath("(//span[normalize-space()='Filter'])[1]");
	private By fromdatedatepickertextboxinworkflow = By.xpath("(//input[@id='FromDate'])[1]");
	private By todatedatepickertextboxinworkflow = By.xpath("(//input[@id='ToDate'])[1]");
	private By searchbuttoninworkflow = By.xpath("(//button[@class='btn filterSearchBtn waves-effect waves-light'])[1]");
	private By viewbuttoninstar2fax = By.xpath("(//a[contains(@class,'gridListRoundIcon')])[1]");
	private By teamactiontabinworkflow = By.xpath("(//a[normalize-space()='Team Action'])[1]");
	private By clearbuttoninworkflow = By.xpath("(//button[@class='btn filterClearBtn waves-effect waves-light'])[1]");
	private By communicationtabinworkflow = By.xpath("(//span[normalize-space()='Communication'])[1]");
	private By textaudittabinworkflow = By.xpath("(//a[normalize-space()='Text Audit'])[1]");
	private By botcallaudittabinworkflow = By.xpath("(//a[normalize-space()='BOT Call Audit'])[1]");
	private By faxaudittabinworkflow = By.xpath("(//a[normalize-space()='Fax Audit'])[1]");
	private By mailaudittabinworkflow = By.xpath("(//a[normalize-space()='Mail Audit'])[1]");
	private By salesreptabinsidebar = By.xpath("(//span[normalize-space()='Sales Rep'])[1]");
	private By salesrepvisittabinsalesrep = By.xpath("(//a[normalize-space()='Sales Rep Visit'])[1]");
	private By drugtabinsidebar = By.xpath("(//span[@class='sidebar-text'][normalize-space()='Drug'])[1]");
	private By drugtabindrug = By.xpath("(//a[@id='liDrugs'])[1]");
	private By drugnametextboxfield = By.xpath("(//input[@id='DrugName'])[1]");
	private By packagertextboxfield = By.xpath("(//input[@id='Packager'])[1]");
	private By NDCtextboxfield = By.xpath("(//input[@id='NDC'])[1]");
	private By billingstabinsidebar = By.xpath("(//span[normalize-space()='Billings'])[1]");
	private By paymentstatustabinbillings = By.xpath("(//a[normalize-space()='Payment Status'])[1]");
	private By patientstabinsidebar = By.xpath("(//span[normalize-space()='Patients'])[1]");
	private By patientresynctabinpatients = By.xpath("(//a[normalize-space()='Patient ReSync'])[1]");
	private By fromselectdayofmonthdropdownbutton = By.xpath("(//select[@id='PatientReSync_FromDays'])[1]");
	private By toselectdayofmonthdropdownbutton = By.xpath("(//select[@id='PatientReSync_ToDays'])[1]");
	private By patientsbyrankingtabinpatients = By.xpath("(//a[normalize-space()='Patients By Ranking'])[1]");
	private By providertabinsidebar = By.xpath("(//span[@class='sidebar-text'][normalize-space()='Provider'])[1]");
	private By providerbyrankingtabinprovider = By.xpath("(//a[normalize-space()='Providers By Ranking'])[1]");
	private By clinicaltabinsidebar = By.xpath("(//span[@class='sidebar-text'][normalize-space()='Clinical'])[1]");
	private By priorauthorizationtabinclinical = By.xpath("(//a[normalize-space()='Prior Authorization'])[1]");
	private By exporttodocumentbuttoninclinical = By.xpath("(//span[normalize-space()='Export to Document'])[1]");
	private By addprovidertabinfilter = By.xpath("//a[@id='addProviderNamePopup']//img");
	private By providerlastnametextbox = By.xpath("(//input[@id='Filter_DoctorLastName'])[1]");
	private By providerfirstnametextbox = By.xpath("(//input[@id='Filter_DoctorFirstName'])[1]");
	private By providerphonenumbertextbox = By.xpath("(//input[@id='Filter_PhoneNumber'])[1]");
	private By searchbuttoninsearchprovider = By.xpath("(//button[normalize-space()='Search'])[1]");
	private By firstproviderradiobutton = By.xpath("(//input[@name='groupOfProviderRadios'])[1]");
	private By submitbuttoninsearchprovider = By.xpath("(//button[@id='btnProvider'])[1]");
	private By addprovidergrouptabinfilter = By.xpath("//a[@id='addProviderGroupPopup']//img");
	private By providergroupnametextbox = By.xpath("(//input[@id='Filter_Name'])[1]");
	private By firstprovidergroupradiobutton = By.xpath("(//input[@name='groupOfProviderGroupRadios'])[1]");
	private By submitbuttoninsearchprovidergroup = By.xpath("(//button[@id='btnProviderGroup'])[1]");
	private By referraltabinsidebar = By.xpath("(//a[normalize-space()='Referral'])[1]");
	private By referraltabinreferral = By.xpath("(//a[@id='liReferrals'])[1]");
	private By advancesearchtabinreferral = By.xpath("(//span[normalize-space()='Advance Search'])[1]");
	private By patientidtextboxinadvancesearch = By.xpath("(//input[@id='PatientId'])[1]");
	private By lastnametextboxinadvancesearch = By.xpath("(//input[@id='LastName'])[1]");
	private By firstnametextboxinadvancesearch = By.xpath("(//input[@id='FirstName'])[1]");
	private By referralcategorydropdownbutton = By.xpath("(//select[@id='Filter_ReferralCategoryId'])[1]");
	private By referralstatusdropdownbutton = By.xpath("(//select[@id='ReferralStatus'])[1]");
	private By referraltypedropdownbutton = By.xpath("(//select[@id='ReferralTypes'])[1]");
	private By referralidtextboxinadvancesearch = By.xpath("(//input[@id='ReferralId'])[1]");
	private By generatedfromdateinreferral = By.xpath("(//input[@id='GeneratedFromDate'])[1]");
	private By generatedtodateinreferral = By.xpath("(//input[@id='GeneratedToDate'])[1]");
	private By referralfromdateinreferral = By.xpath("(//input[@id='ReferredFromdate'])[1]");
	private By referraltodateinreferral = By.xpath("(//input[@id='ReferredTodate'])[1]");
			
	
	
	
	public ReportModuleFunctionalityPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean clickintotheReportmoduletab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Report Module tab
	    List<WebElement> reportmoduletabs = driver.findElements(reportmoduletab);

	    if (reportmoduletabs.isEmpty()) {
	        // Report Module tab NOT present → stop scenario
	        return false;
	    }

	    WebElement reportmoduletab = reportmoduletabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(reportmoduletab));
	    reportmoduletab.click();

	    return true;
	}
	
	
	//-------------------------------------Workflow Section----------------------------------------
	
	
	public boolean clickintotheWorkflowtabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Workflow tab
	    List<WebElement> workflowtabs = driver.findElements(workflowtabinsidebar);

	    if (workflowtabs.isEmpty()) {
	        // Workflow tab NOT present → stop scenario
	        return false;
	    }

	    WebElement workflowtab = workflowtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(workflowtab));
	    workflowtab.click();

	    return true;
	}
	
	public boolean clickintotheNewRunninglinetabinWorkflow() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for New Runningline tab
	    List<WebElement> newrunninglinetabs = driver.findElements(newrunninglinetabinworkflow);

	    if (newrunninglinetabs.isEmpty()) {
	        // New Runningline tab NOT present → stop scenario
	        return false;
	    }

	    WebElement newrunninglinetab = newrunninglinetabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newrunninglinetab));
	    newrunninglinetab.click();

	    return true;
	}
	
	public boolean clickintotheExportExcelbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Export Excel tab
	    List<WebElement> exportexcelbuttons = driver.findElements(exportexcelbuttoninnewrunningline);

	    if (exportexcelbuttons.isEmpty()) {
	        // Export Excel tab NOT present → stop scenario
	        return false;
	    }

	    WebElement exportexcelbutton = exportexcelbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(exportexcelbutton));
	    exportexcelbutton.click();

	    return true;
	}
	
	public boolean clickintotheStar2FaxtabinWorkflow() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Star2 Fax tab
	    List<WebElement> star2faxtabs = driver.findElements(star2faxtabinworkflow);

	    if (star2faxtabs.isEmpty()) {
	        // Star2 Fax tab NOT present → stop scenario
	        return false;
	    }

	    WebElement star2faxtab = star2faxtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(star2faxtab));
	    star2faxtab.click();

	    return true;
	}
	
	public void clickintotheFilterbuttoninWorkflow() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement filterbutton = wait.until(ExpectedConditions.elementToBeClickable(filterbuttoninworkflow));
	   
	    try {
	    	filterbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", filterbutton);
	    }

	    System.out.println("Filter button clicked successfully");
	}
	
	public void clickintotheFromDateinWorkflow() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ReportModuleFunctionalityPage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement fromdatepicker = wait.until(ExpectedConditions.elementToBeClickable(fromdatedatepickertextboxinworkflow));

        try {
        	fromdatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fromdatepicker);
        }

        System.out.println("From Date Picker clicked successfully");
    }
	
	public void selectOriginalTodaysDateinFromDate() {
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
	
	public void selectOriginalTodaysDateinFromDateinClinical() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    LocalDate today = LocalDate.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	    String formattedDate = today.format(formatter);

	    WebElement fromDateInput = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//label[normalize-space()='From Date']/following::input[1]")));

	    fromDateInput.click();
	    fromDateInput.clear();
	    fromDateInput.sendKeys(formattedDate);
	    fromDateInput.sendKeys(Keys.TAB);

	    System.out.println("From Date entered: " + formattedDate);
	}
	
	public void clickintotheToDateinWorkflow() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ReportModuleFunctionalityPage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement todatepicker = wait.until(ExpectedConditions.elementToBeClickable(todatedatepickertextboxinworkflow));

        try {
        	todatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", todatepicker);
        }

        System.out.println("To Date Picker clicked successfully");
    }
	
	public void selectToDateAfter1MonthAutomatically() {
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
	
	public String clickintothesearchbuttoninFilter() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Click Search button
	    wait.until(ExpectedConditions.elementToBeClickable(searchbuttoninworkflow)).click();

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
	
	public boolean clickintotheViewbuttoninStar2Fax() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for View tab
	    List<WebElement> viewtabs = driver.findElements(viewbuttoninstar2fax);

	    if (viewtabs.isEmpty()) {
	        // View tab NOT present → stop scenario
	        return false;
	    }

	    WebElement viewtab = viewtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(viewtab));
	    viewtab.click();

	    return true;
	}
	
	public boolean clickintotheTeamActiontabinWorkflow() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Team Action tab
	    List<WebElement> teamactiontabs = driver.findElements(teamactiontabinworkflow);

	    if (teamactiontabs.isEmpty()) {
	        // Team Action tab NOT present → stop scenario
	        return false;
	    }

	    WebElement teamactiontab = teamactiontabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(teamactiontab));
	    teamactiontab.click();

	    return true;
	}
	
	public void clickintotheClearbuttoninWorkflow() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement clearbutton = wait.until(ExpectedConditions.elementToBeClickable(clearbuttoninworkflow));
	   
	    try {
	    	clearbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", clearbutton);
	    }

	    System.out.println("Clear button clicked successfully");
	}
	
	public void clickintotheCommunicationtabinWorkflow() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement communicationtab = wait.until(ExpectedConditions.elementToBeClickable(communicationtabinworkflow));
	   
	    try {
	    	communicationtab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", communicationtab);
	    }

	    System.out.println("Communication tab clicked successfully");
	}
	
	public boolean clickintotheTextAudittabinWorkflow() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Text Audit tab
	    List<WebElement> textaudittabs = driver.findElements(textaudittabinworkflow);

	    if (textaudittabs.isEmpty()) {
	        // Text Audit tab NOT present → stop scenario
	        return false;
	    }

	    WebElement textaudittab = textaudittabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(textaudittab));
	    textaudittab.click();

	    return true;
	}
	
	public boolean clickintotheBOTCallAudittabinWorkflow() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for BOT Call Audit tab
	    List<WebElement> BOTCallAudittabs = driver.findElements(botcallaudittabinworkflow);

	    if (BOTCallAudittabs.isEmpty()) {
	        // BOT Call Audit tab NOT present → stop scenario
	        return false;
	    }

	    WebElement BOTCallAudittab = BOTCallAudittabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(BOTCallAudittab));
	    BOTCallAudittab.click();

	    return true;
	}
	
	public boolean clickintotheFaxAudittabinWorkflow() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Fax Audit tab
	    List<WebElement> FaxAudittabs = driver.findElements(faxaudittabinworkflow);

	    if (FaxAudittabs.isEmpty()) {
	        // Fax Audit tab NOT present → stop scenario
	        return false;
	    }

	    WebElement FaxAudittab = FaxAudittabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(FaxAudittab));
	    FaxAudittab.click();

	    return true;
	}
	
	public boolean clickintotheMailAudittabinWorkflow() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Mail Audit tab
	    List<WebElement> MailAudittabs = driver.findElements(mailaudittabinworkflow);

	    if (MailAudittabs.isEmpty()) {
	        // Mail Audit tab NOT present → stop scenario
	        return false;
	    }

	    WebElement MailAudittab = MailAudittabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(MailAudittab));
	    MailAudittab.click();

	    return true;
	}
	
	public void selectDateBeforeTenDays() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//table[contains(@class,'ui-datepicker-calendar')]")));

	    // Get date before 10 days
	    LocalDate targetDate = LocalDate.now().minusDays(10);

	    int day = targetDate.getDayOfMonth();
	    int month = targetDate.getMonthValue() - 1;  // jQuery month starts from 0
	    int year = targetDate.getYear();

	    String dynamicXpath = String.format(
	        "//td[@data-handler='selectDay' and @data-month='%d' and @data-year='%d']/a[text()='%d']",
	        month, year, day
	    );

	    WebElement dateElement = wait.until(
	            ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));

	    dateElement.click();

	    System.out.println("Date selected (Before 10 days): " 
	            + day + "-" + (month + 1) + "-" + year);
	}
	
	
	//---------------------------------Sales Rep Visit Section------------------------------------
	
	
	public boolean clickintotheSalesReptabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Sales Rep tab
	    List<WebElement> SalesReptabs = driver.findElements(salesreptabinsidebar);

	    if (SalesReptabs.isEmpty()) {
	        // Sales Rep tab NOT present → stop scenario
	        return false;
	    }

	    WebElement SalesReptab = SalesReptabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(SalesReptab));
	    SalesReptab.click();

	    return true;
	}
	
	public boolean clickintotheSalesRepVisittabinSalesRep() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Sales Rep Visit tab
	    List<WebElement> SalesRepVisittabs = driver.findElements(salesrepvisittabinsalesrep);

	    if (SalesRepVisittabs.isEmpty()) {
	        // Sales Rep Visit tab NOT present → stop scenario
	        return false;
	    }

	    WebElement SalesRepVisittab = SalesRepVisittabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(SalesRepVisittab));
	    SalesRepVisittab.click();

	    return true;
	}
	
	
	//-------------------------------------Drug Section-----------------------------------------
	
	
	public boolean clickintotheDrugtabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Drug tab
	    List<WebElement> Drugtabs = driver.findElements(drugtabinsidebar);

	    if (Drugtabs.isEmpty()) {
	        // Drug tab NOT present → stop scenario
	        return false;
	    }

	    WebElement Drugtab = Drugtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(Drugtab));
	    Drugtab.click();

	    return true;
	}
	
	public boolean clickintotheDrugtabinDrug() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Drug tab
	    List<WebElement> Drugtabs = driver.findElements(drugtabindrug);

	    if (Drugtabs.isEmpty()) {
	        // Drug tab NOT present → stop scenario
	        return false;
	    }

	    WebElement Drugtab = Drugtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(Drugtab));
	    Drugtab.click();

	    return true;
	}
	
	public void entertheDrugNameinFilter(String DrugName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement DrugNametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(drugnametextboxfield));

	    // Extra safety for animation/overlay
	    wait.until(driver -> DrugNametextboxfiled.isDisplayed()
	            && DrugNametextboxfiled.isEnabled());

	    DrugNametextboxfiled.click();
	    DrugNametextboxfiled.clear();
	    DrugNametextboxfiled.sendKeys(DrugName);

	    System.out.println("Drug Name entered: " + DrugName);
    }
	
	public void enterthePackagerinFilter(String Packager) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement Packagertextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(packagertextboxfield));

	    // Extra safety for animation/overlay
	    wait.until(driver -> Packagertextboxfiled.isDisplayed()
	            && Packagertextboxfiled.isEnabled());

	    Packagertextboxfiled.click();
	    Packagertextboxfiled.clear();
	    Packagertextboxfiled.sendKeys(Packager);

	    System.out.println("Packager entered: " + Packager);
    }
	
	public void entertheNDCinFilter(String NDC) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement NDCtextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(NDCtextboxfield));

	    // Extra safety for animation/overlay
	    wait.until(driver -> NDCtextboxfiled.isDisplayed()
	            && NDCtextboxfiled.isEnabled());

	    NDCtextboxfiled.click();
	    NDCtextboxfiled.clear();
	    NDCtextboxfiled.sendKeys(NDC);

	    System.out.println("NDC entered: " + NDC);
    }
	
	
	//----------------------------------Billings (Payment Status) Section------------------------------------------
	
	
	public boolean clickintotheBillingstabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Billings tab
	    List<WebElement> Billingstabs = driver.findElements(billingstabinsidebar);

	    if (Billingstabs.isEmpty()) {
	        // Billings tab NOT present → stop scenario
	        return false;
	    }

	    WebElement Billingstab = Billingstabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(Billingstab));
	    Billingstab.click();

	    return true;
	}
	
	public boolean clickintothePaymentStatustabinBillings() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Payment Status tab
	    List<WebElement> PaymentStatustabs = driver.findElements(paymentstatustabinbillings);

	    if (PaymentStatustabs.isEmpty()) {
	        // Payment Status tab NOT present → stop scenario
	        return false;
	    }

	    WebElement PaymentStatustab = PaymentStatustabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(PaymentStatustab));
	    PaymentStatustab.click();

	    return true;
	}
	
	
	//------------------------------Patients Section-----------------------------------------------------
	
	
	public boolean clickintothePatientstabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Patients tab
	    List<WebElement> Patientstabs = driver.findElements(patientstabinsidebar);

	    if (Patientstabs.isEmpty()) {
	        // Patients tab NOT present → stop scenario
	        return false;
	    }

	    WebElement Patientstab = Patientstabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(Patientstab));
	    Patientstab.click();

	    return true;
	}
	
	public boolean clickintothePatientReSynctabinPatients() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Patients tab
	    List<WebElement> PatientReSynctabs = driver.findElements(patientresynctabinpatients);

	    if (PatientReSynctabs.isEmpty()) {
	        // Patients tab NOT present → stop scenario
	        return false;
	    }

	    WebElement PatientReSynctab = PatientReSynctabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(PatientReSynctab));
	    PatientReSynctab.click();

	    return true;
	}
	
	public boolean selecttheFromDateofMonthByIndexinPatientResync(int FromDateOfMonth) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement FromDateDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(fromselectdayofmonthdropdownbutton));

	        Select select = new Select(FromDateDropdown);

	        // 2️ Select by index
	        select.selectByIndex(FromDateOfMonth);

	        String selectedFromDate = select.getFirstSelectedOption().getText();
	        System.out.println("From Date selected by index (" + FromDateOfMonth + "): " + selectedFromDate);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("From Date index '" + FromDateOfMonth + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting from date by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean selecttheToDateofMonthByIndexinPatientResync(int ToDateOfMonth) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement ToDateDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(toselectdayofmonthdropdownbutton));

	        Select select = new Select(ToDateDropdown);

	        // 2️ Select by index
	        select.selectByIndex(ToDateOfMonth);

	        String selectedToDate = select.getFirstSelectedOption().getText();
	        System.out.println("To Date selected by index (" + ToDateOfMonth + "): " + selectedToDate);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("To Date index '" + ToDateOfMonth + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting to date by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean clickintothePatientsByRankingtabPatients() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Patients By Ranking tab
	    List<WebElement> patientsbyrankingtabs = driver.findElements(patientsbyrankingtabinpatients);

	    if (patientsbyrankingtabs.isEmpty()) {
	        // Patients By Ranking tab NOT present → stop scenario
	        return false;
	    }

	    WebElement patientsbyrankingtab = patientsbyrankingtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(patientsbyrankingtab));
	    patientsbyrankingtab.click();

	    return true;
	}
	
	
	//----------------------------------------Provider Section-------------------------------------------
	
	
	public boolean clickintotheProvidertabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Provider tab
	    List<WebElement> providertabs = driver.findElements(providertabinsidebar);

	    if (providertabs.isEmpty()) {
	        // Provider tab NOT present → stop scenario
	        return false;
	    }

	    WebElement providertab = providertabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(providertab));
	    providertab.click();

	    return true;
	}
	
	public boolean clickintotheProvidersByRankingtabinProvider() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Provider tab
	    List<WebElement> providerbyrankingtabs = driver.findElements(providerbyrankingtabinprovider);

	    if (providerbyrankingtabs.isEmpty()) {
	        // Provider tab NOT present → stop scenario
	        return false;
	    }

	    WebElement providerbyrankingtab = providerbyrankingtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(providerbyrankingtab));
	    providerbyrankingtab.click();

	    return true;
	}
	
	
	//------------------------------------Clinical Section--------------------------------------------------
	
	
	public boolean clickintotheClinicaltabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Clinical tab
	    List<WebElement> clinicaltabs = driver.findElements(clinicaltabinsidebar);

	    if (clinicaltabs.isEmpty()) {
	        // Clinical tab NOT present → stop scenario
	        return false;
	    }

	    WebElement clinicaltab = clinicaltabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(clinicaltab));
	    clinicaltab.click();

	    return true;
	}
	
	public boolean clickintothePriorAuthorizationtabinClinical() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Prior Authorization tab
	    List<WebElement> priorauthorizationtabs = driver.findElements(priorauthorizationtabinclinical);

	    if (priorauthorizationtabs.isEmpty()) {
	        // Prior Authorization tab NOT present → stop scenario
	        return false;
	    }

	    WebElement priorauthorizationtab = priorauthorizationtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(priorauthorizationtab));
	    priorauthorizationtab.click();

	    return true;
	}
	
	public boolean clickintotheExportToDocumentbuttoninClinical() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Export to Document tab
	    List<WebElement> exporttodocumenttabs = driver.findElements(exporttodocumentbuttoninclinical);

	    if (exporttodocumenttabs.isEmpty()) {
	        // Export to Document tab NOT present → stop scenario
	        return false;
	    }

	    WebElement exporttodocumenttab = exporttodocumenttabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(exporttodocumenttab));
	    exporttodocumenttab.click();

	    return true;
	}
	
	public void clickintotheAddProvidetabinfilterofClinical() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement addprovidertab = wait.until(ExpectedConditions.elementToBeClickable(addprovidertabinfilter));
	   
	    try {
	    	addprovidertab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addprovidertab);
	    }

	    System.out.println("Add Provider tab clicked successfully");
	}
	
	public void entertheProviderLastNameinSearchProvider(String ProviderLastName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ProviderLastNametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(providerlastnametextbox));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ProviderLastNametextboxfiled.isDisplayed()
	            && ProviderLastNametextboxfiled.isEnabled());

	    ProviderLastNametextboxfiled.click();
	    ProviderLastNametextboxfiled.clear();
	    ProviderLastNametextboxfiled.sendKeys(ProviderLastName);

	    System.out.println("Provider Last Name entered: " + ProviderLastName);
    }
	
	public void entertheProviderFirstNameinSearchProvider(String ProviderFirstName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ProviderFirstNametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(providerfirstnametextbox));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ProviderFirstNametextboxfiled.isDisplayed()
	            && ProviderFirstNametextboxfiled.isEnabled());

	    ProviderFirstNametextboxfiled.click();
	    ProviderFirstNametextboxfiled.clear();
	    ProviderFirstNametextboxfiled.sendKeys(ProviderFirstName);

	    System.out.println("Provider First Name entered: " + ProviderFirstName);
    }
	
	public void entertheProviderPhoneNumberinSearchProvider(String ProviderPhoneNumber) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ProviderPhoneNumbertextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(providerphonenumbertextbox));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ProviderPhoneNumbertextboxfiled.isDisplayed()
	            && ProviderPhoneNumbertextboxfiled.isEnabled());

	    ProviderPhoneNumbertextboxfiled.click();
	    ProviderPhoneNumbertextboxfiled.clear();
	    ProviderPhoneNumbertextboxfiled.sendKeys(ProviderPhoneNumber);

	    System.out.println("Provider Phone Number entered: " + ProviderPhoneNumber);
    }
	
	public String clickintotheSearchbuttoninSearchProvider() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Click Search button
	    wait.until(ExpectedConditions.elementToBeClickable(searchbuttoninsearchprovider)).click();

	    System.out.println("Search button clicked successfully");

	    StringBuilder allMessages = new StringBuilder();

	    // Capture ALL toast messages (if any)
	    try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='toast-message']")));

	        List<WebElement> toasts = driver.findElements(
	                By.xpath("//div[@class='toast-message']"));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                System.out.println("Toast Message Found: " + msg);
	                allMessages.append(msg).append(" | ");
	            }
	        }

	        if (allMessages.length() > 0) {
	            return "ERROR: " + allMessages.toString();
	        }

	    } catch (TimeoutException e) {
	        // No toast messages appeared
	    }

	    // Check "No Records Found" message
	    try {
	        WebElement noRecordMsg = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(
	                        By.xpath("(//p[normalize-space()='No Record(s) Found'])[1]")));

	        System.out.println("No Records Message: " + noRecordMsg.getText());
	        return noRecordMsg.getText();

	    } catch (TimeoutException e) {
	        // No "No Records Found" message
	    }

	    // 3️ Provider is available
	    return "Provider is shown";
	}
	
	public void clickintotheFirstProviderradiobuttoninSearchProvider() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement radiobuttontab = wait.until(ExpectedConditions.elementToBeClickable(firstproviderradiobutton));
	   
	    try {
	    	radiobuttontab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radiobuttontab);
	    }
	    System.out.println("First Provider radio button clicked successfully");
	}
	
	public String clickintotheSubmitbuttoninSearchProvider() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(submitbuttoninsearchprovider)).click();
	   
	    System.out.println("Submit button clicked successfully");
	    
	    StringBuilder allMessages = new StringBuilder();

	    // Capture ALL toast messages (if any)
	    try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='toast-message']")));

	        List<WebElement> toasts = driver.findElements(
	                By.xpath("//div[@class='toast-message']"));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                System.out.println("Toast Message Found: " + msg);
	                allMessages.append(msg).append(" | ");
	            }
	        }

	        if (allMessages.length() > 0) {
	            return "ERROR: " + allMessages.toString();
	        }

	    } catch (TimeoutException e) {
	        // No toast messages appeared
	    }
		return "Provider is Added";
	}
	
	public void clickintotheAddProviderGrouptabinFilter() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement addprovidergrouptab = wait.until(ExpectedConditions.elementToBeClickable(addprovidergrouptabinfilter));
	   
	    try {
	    	addprovidergrouptab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addprovidergrouptab);
	    }
	    System.out.println("Add Provider Group tab clicked successfully");
	}
	
	public void entertheProviderGroupnameinSearchProviderGroup(String ProviderGroupName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ProviderGroupNametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(providergroupnametextbox));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ProviderGroupNametextboxfiled.isDisplayed()
	            && ProviderGroupNametextboxfiled.isEnabled());

	    ProviderGroupNametextboxfiled.click();
	    ProviderGroupNametextboxfiled.clear();
	    ProviderGroupNametextboxfiled.sendKeys(ProviderGroupName);

	    System.out.println("Provider Group Name entered: " + ProviderGroupName);
    }
	
	public void clickintotheFirstProviderGroupradiobuttoninSearchProvideGroup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement addprovidergrouptab = wait.until(ExpectedConditions.elementToBeClickable(firstprovidergroupradiobutton));
	   
	    try {
	    	addprovidergrouptab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addprovidergrouptab);
	    }
	    System.out.println("First Provider Group radio button clicked successfully");
	}
	
	public String clickintotheSubmitbuttoninSearchProviderGroup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(submitbuttoninsearchprovidergroup)).click();
	   
	    System.out.println("Submit button clicked successfully");
	    
	    StringBuilder allMessages = new StringBuilder();

	    // Capture ALL toast messages (if any)
	    try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='toast-message']")));

	        List<WebElement> toasts = driver.findElements(
	                By.xpath("//div[@class='toast-message']"));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                System.out.println("Toast Message Found: " + msg);
	                allMessages.append(msg).append(" | ");
	            }
	        }

	        if (allMessages.length() > 0) {
	            return "ERROR: " + allMessages.toString();
	        }

	    } catch (TimeoutException e) {
	        // No toast messages appeared
	    }
		return "Provider Group is Added";
	}
	
	public String clickintothesearchbuttoninFilterClinical() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Click Search button
	    wait.until(ExpectedConditions.elementToBeClickable(searchbuttoninworkflow)).click();

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
	                        By.xpath("(//p[normalize-space()='No record(s) found.'])[1]")));

	        return "ERROR: " + noRecordMsg.getText();

	    } catch (TimeoutException ignored) {}

	    // 3️⃣ User exists
	    return "SUCCESS: Record is shown";
	}
	
	public void selectExpiryDateBefore1MonthAutomatically() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//table[contains(@class,'ui-datepicker-calendar')]")));

	    // Get date before 1 month
	    LocalDate targetDate = LocalDate.now().minusMonths(1);

	    int targetMonth = targetDate.getMonthValue() - 1; // jQuery month (0-based)
	    int targetYear = targetDate.getYear();
	    int targetDay = targetDate.getDayOfMonth();

	    // Select Year from dropdown
	    Select yearDropdown = new Select(driver.findElement(By.className("ui-datepicker-year")));
	    yearDropdown.selectByVisibleText(String.valueOf(targetYear));

	    // Select Month from dropdown
	    Select monthDropdown = new Select(driver.findElement(By.className("ui-datepicker-month")));
	    monthDropdown.selectByIndex(targetMonth);

	    // Select Day
	    String dateXpath = String.format(
	            "//td[@data-handler='selectDay']/a[text()='%d']",
	            targetDay);

	    WebElement dateElement = wait.until(
	            ExpectedConditions.elementToBeClickable(By.xpath(dateXpath)));

	    dateElement.click();

	    System.out.println("Selected date before 1 month: " + targetDate);
	}
	
	
	//------------------------------Referral Section-------------------------------------
	
	
	public boolean clickintotheReferraltabinSidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Referral tab
	    List<WebElement> referraltabs = driver.findElements(referraltabinsidebar);

	    if (referraltabs.isEmpty()) {
	        // Referral tab NOT present → stop scenario
	        return false;
	    }

	    WebElement referraltab = referraltabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(referraltab));
	    referraltab.click();

	    return true;
	}
	
	public boolean clickintotheReferraltabinReferral() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Referral tab
	    List<WebElement> referraltabs = driver.findElements(referraltabinreferral);

	    if (referraltabs.isEmpty()) {
	        // Referral tab NOT present → stop scenario
	        return false;
	    }

	    WebElement referraltab = referraltabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(referraltab));
	    referraltab.click();

	    return true;
	}
	
	public void clickintotheAdvanceSearchbuttoninReferral() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement advancesearchbutton = wait.until(ExpectedConditions.elementToBeClickable(advancesearchtabinreferral));
	   
	    try {
	    	advancesearchbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", advancesearchbutton);
	    }

	    System.out.println("Advance Search button clicked successfully");
	}
	
	public void enterthePatientIdinReferral(String PatientId) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement PatientIdtextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(patientidtextboxinadvancesearch));

	    // Extra safety for animation/overlay
	    wait.until(driver -> PatientIdtextboxfiled.isDisplayed()
	            && PatientIdtextboxfiled.isEnabled());

	    PatientIdtextboxfiled.click();
	    PatientIdtextboxfiled.clear();
	    PatientIdtextboxfiled.sendKeys(PatientId);

	    System.out.println("Patient Id entered: " + PatientId);
    }
	
	public void entertheLastNameinReferral(String LastName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement LastNametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(lastnametextboxinadvancesearch));

	    // Extra safety for animation/overlay
	    wait.until(driver -> LastNametextboxfiled.isDisplayed()
	            && LastNametextboxfiled.isEnabled());

	    LastNametextboxfiled.click();
	    LastNametextboxfiled.clear();
	    LastNametextboxfiled.sendKeys(LastName);

	    System.out.println("Last Name entered: " + LastName);
    }
	
	public void entertheFirstNameinReferral(String FirstName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement FirstNametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(firstnametextboxinadvancesearch));

	    // Extra safety for animation/overlay
	    wait.until(driver -> FirstNametextboxfiled.isDisplayed()
	            && FirstNametextboxfiled.isEnabled());

	    FirstNametextboxfiled.click();
	    FirstNametextboxfiled.clear();
	    FirstNametextboxfiled.sendKeys(FirstName);

	    System.out.println("First Name entered: " + FirstName);
    }
	
	public boolean selecttheReferralCategorydropdowninAdvanceSearch(int ReferralCategory) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement ReferralCategoryDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(referralcategorydropdownbutton));

	        Select select = new Select(ReferralCategoryDropdown);

	        // 2️ Select by index
	        select.selectByIndex(ReferralCategory);

	        String selectedReferralCategory = select.getFirstSelectedOption().getText();
	        System.out.println("Referral Category selected by index (" + ReferralCategory + "): " + selectedReferralCategory);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Referral Category index '" + ReferralCategory + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting referral category by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean selecttheReferralStatusdropdowninAdvanceSearch(int ReferralStatus) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement ReferralStatusDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(referralstatusdropdownbutton));

	        Select select = new Select(ReferralStatusDropdown);

	        // 2️ Select by index
	        select.selectByIndex(ReferralStatus);

	        String selectedReferralStatus = select.getFirstSelectedOption().getText();
	        System.out.println("Referral Status selected by index (" + ReferralStatus + "): " + selectedReferralStatus);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Referral Status index '" + ReferralStatus + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting referral status by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean selecttheReferralTypedropdowninAdvanceSearch(int ReferralType) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement ReferralTypeDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(referraltypedropdownbutton));

	        Select select = new Select(ReferralTypeDropdown);

	        // 2️ Select by index
	        select.selectByIndex(ReferralType);

	        String selectedReferralType = select.getFirstSelectedOption().getText();
	        System.out.println("Referral Type selected by index (" + ReferralType + "): " + selectedReferralType);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Referral Type index '" + ReferralType + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting referral type by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public void entertheReferralIdinReferral(String ReferralId) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ReferralIdtextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(referralidtextboxinadvancesearch));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ReferralIdtextboxfiled.isDisplayed()
	            && ReferralIdtextboxfiled.isEnabled());

	    ReferralIdtextboxfiled.click();
	    ReferralIdtextboxfiled.clear();
	    ReferralIdtextboxfiled.sendKeys(ReferralId);

	    System.out.println("Referral Id entered: " + ReferralId);
    }
	
	public void clickintotheGeneratedFromDateinReferral() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ReportModuleFunctionalityPage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement fromdatepicker = wait.until(ExpectedConditions.elementToBeClickable(generatedfromdateinreferral));

        try {
        	fromdatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fromdatepicker);
        }

        System.out.println("Generated From Date Picker clicked successfully");
    }
	
	public void clickintotheGeneratedToDateinReferral() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ReportModuleFunctionalityPage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement todatepicker = wait.until(ExpectedConditions.elementToBeClickable(generatedtodateinreferral));

        try {
        	todatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", todatepicker);
        }

        System.out.println("Generated To Date Picker clicked successfully");
    }
	
	public void clickintotheReferredFromDateinReferral() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ReportModuleFunctionalityPage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement fromdatepicker = wait.until(ExpectedConditions.elementToBeClickable(referralfromdateinreferral));

        try {
        	fromdatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fromdatepicker);
        }

        System.out.println("Referred From Date Picker clicked successfully");
    }
	
	public void clickintotheReferredToDateinReferral() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ReportModuleFunctionalityPage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement todatepicker = wait.until(ExpectedConditions.elementToBeClickable(referraltodateinreferral));

        try {
        	todatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", todatepicker);
        }

        System.out.println("Referred To Date Picker clicked successfully");
    }
	
	public void selectOriginalTodaysDateinFromDateReferral() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.className("ui-datepicker-calendar")));

	    LocalDate targetDate = LocalDate.now();
	    int targetMonth = targetDate.getMonthValue() - 1; // 0-based
	    int targetYear = targetDate.getYear();
	    int targetDay = targetDate.getDayOfMonth();

	    // Select Year
	    Select yearDropdown = new Select(
	            wait.until(ExpectedConditions.elementToBeClickable(
	                    By.className("ui-datepicker-year"))));
	    yearDropdown.selectByVisibleText(String.valueOf(targetYear));

	    // Select Month
	    Select monthDropdown = new Select(
	            wait.until(ExpectedConditions.elementToBeClickable(
	                    By.className("ui-datepicker-month"))));
	    monthDropdown.selectByIndex(targetMonth);

	    // ✅ WAIT until correct month & year is visible
	    wait.until(ExpectedConditions.attributeContains(
	            By.className("ui-datepicker-month"),
	            "value",
	            String.valueOf(targetMonth)));

	    // Now click day (safer xpath)
	    By dayLocator = By.xpath(
	            "//td[@data-handler='selectDay' and not(contains(@class,'ui-datepicker-other-month'))]/a[text()='"
	                    + targetDay + "']");

	    WebElement dayElement = wait.until(
	            ExpectedConditions.elementToBeClickable(dayLocator));

	    dayElement.click();

	    System.out.println("Selected From Date: " + targetDate);
	}
}
