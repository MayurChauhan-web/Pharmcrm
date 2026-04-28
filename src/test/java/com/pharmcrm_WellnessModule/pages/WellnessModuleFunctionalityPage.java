package com.pharmcrm_WellnessModule.pages;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WellnessModuleFunctionalityPage {
	WebDriver driver;
	
	//By Locators
	private By wellnessmoduletab = By.xpath("//a[@href='/Wellness/Home/Dashboard']//div[@class='module-list-main']");
	private By sidebarcollapsebutton = By.xpath("//a[@class='sidebar-module tooltiped menuBlock-visible']");
	private By patienttabinsidebarmenu = By.xpath("//span[@class='sidebar-text'][normalize-space()='Patient']");
	private By newpatientbutton = By.xpath("//span[normalize-space()='New Patient']");
	private By patientlastnametextboxinaddpatient = By.xpath("//input[@id='Patient_LastName']");
	private By patientfirstnametextboxinaddpatient = By.xpath("//input[@id='Patient_FirstName']");
	private By patientbirthdatetextboxinaddpatient = By.xpath("//input[@id='Patient_BirthDate']");
	private By searchbuttoninaddpatient = By.xpath("//button[@id='btnFindPatient']");
	private By filterstab = By.xpath("//span[normalize-space()='Filter']");
	private By patientlastnameinfilters = By.xpath("//input[@id='Filter_LastName']");
	private By patientfirstnameinfilters = By.xpath("//input[@id='Filter_FirstName']");
	private By patientbirthdateinfilters = By.xpath("//input[@id='Filter_BirthDate']");
	private By patientidinfilters = By.xpath("//input[@id='Filter_PatientId']");
	private By searchbuttoninfilters = By.xpath("//button[@class='btn filterSearchBtn waves-effect waves-light']");
	private By clearbuttoninfilters = By.xpath("//button[@class='btn filterClearBtn waves-effect waves-light']");
	private By pointssettingtab = By.xpath("//tbody/tr[1]/td[11]/div[1]/a[1]//*[name()='svg']");
	private By pointstextbox = By.xpath("//input[@id='txtPointSetting']");
	private By savepointsbutton = By.xpath("//button[@id='btnSavePointSetting']");
	private By buypointsbutton = By.xpath("//tbody/tr[1]/td[11]/div[1]/a[2]//*[name()='svg']");
	private By pointstextboxinbuypoints = By.xpath("//input[@id='txtPoint']");
	private By recipientnumbertextboxinbuypoints = By.xpath("//input[@id='txtReceiptNumber']");
	private By buybuttoninbuyadditionalpoints = By.xpath("//button[@id='btnSaveAdditionalPoint']");
	private By orderhistorybutton = By.xpath("//tbody/tr[1]/td[11]/div[1]/a[3]//*[name()='svg']");
	private By cardbutton = By.xpath("//tbody/tr[1]/td[11]/div[1]/a[4]//*[name()='svg']");
	private By addproductsbutton = By.xpath("//button[normalize-space()='Add Products']");
	private By categorydropdown = By.xpath("//select[@id='ProductCategories']");
	private By productnametextbox = By.xpath("//input[@id='txtProductName']");
	private By searchbuttoninaddproduct = By.xpath("//button[normalize-space()='Search']");
	private By selectallcheckboxinaddproduct = By.xpath("//label[normalize-space()='Select All']");
	private By submitbuttoninaddproduct = By.xpath("//button[@id='addToCartProduct']");
	private By confirmbuttoninpatientcard = By.xpath("//button[@class='btn btn-primary btn-block waves-effect waves-light']");
	private By producttabinsidebarmenu = By.xpath("//span[normalize-space()='Product']");
	private By productnametextboxinproductspage = By.xpath("//input[@id='Filter_ProductName']");
	private By searchbuttoninproducts = By.xpath("//button[@class='btn filterSearchBtn waves-effect waves-light']");
	private By clearbuttoninprducts = By.xpath("//button[@class='btn filterClearBtn waves-effect waves-light']");
	private By newproductbuttoninproducts = By.xpath("//span[normalize-space()='New Product']");
	private By productnametextboxfieldinaddproduct = By.xpath("//input[@id='Product_Name']");
	private By productdescriptiontextbox = By.xpath("//div[@id='editor-block-content']");
	private By statusdropdown = By.xpath("//select[@id='Product_Status']");
	private By categorydropdowninaddproduct = By.xpath("//select[@id='Product_ProductCategory_Id']");
	private By pointstextboxfield = By.xpath("//input[@id='Product_Points']");
	private By stocktextboxfield = By.xpath("//input[@id='Product_Stock']");
	private By uploadimagestab = By.xpath("//label[@class='upload__btn mb-0']");
	private By saveproductbutton = By.xpath("//button[@id='btnSave']");
	private By threedotbuttoninproducts = By.xpath("(//button[@id='bucketDrop'])[1]");
	private By editbuttoninproducts = By.xpath("//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//a[@class='tooltiped user-access']//div[@class='gridRecordContextInner']");
	private By deletebuttoninproducts = By.xpath("//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	private By confirmdeleteproductsbutton = By.xpath("//div[@id='deleteProductModel']//button[@id='btnDeleteConfirm']");
	private By productcategorytabinsidebarmenu = By.xpath("//span[normalize-space()='Product Category']");
	private By newproductcategorybutton = By.xpath("//span[normalize-space()='New Product Category']");
	private By selectnewimagebuttoninproductcategory = By.xpath("//button[normalize-space()='Select new image']");
	private By productcategorynametextboxfield = By.xpath("//input[@id='ProductCategory_Name']");
	private By productcategorydescriptiontextboxfield = By.xpath("//textarea[@id='ProductCategory_Description']");
	private By submitbuttoninproductcategory = By.xpath("//button[@id='btnSave']");
	private By removebuttoninproductcategory = By.xpath("//button[normalize-space()='Remove']");
	private By confirmdeleteproductcategorybutton = By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']");
	
	
	
	
	public WellnessModuleFunctionalityPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean clickintothewellnessmoduletab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Wellness Module tab
	    List<WebElement> wellnessmoduletabs = driver.findElements(wellnessmoduletab);

	    if (wellnessmoduletabs.isEmpty()) {
	        // Wellness Module tab NOT present → stop scenario
	        return false;
	    }

	    WebElement wellnessmoduletab = wellnessmoduletabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(wellnessmoduletab));
	    wellnessmoduletab.click();

	    return true;
	}
	
	public void clickintothesidebarcollapsebutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement sidebarcollapsebuttonTab = wait.until(ExpectedConditions.elementToBeClickable(sidebarcollapsebutton));
	   
	    try {
	    	sidebarcollapsebuttonTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", sidebarcollapsebuttonTab);
	    }

	    System.out.println("Sidebarcollapse Tab clicked successfully");
	}
	
	
	//----------------------------------- Patient Section ----------------------------------------------------
	
	
	public boolean clickintothepatienttabinsidebarmenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Patients tab
	    List<WebElement> patientstabs = driver.findElements(patienttabinsidebarmenu);

	    if (patientstabs.isEmpty()) {
	        // Patients tab NOT present → stop scenario
	        return false;
	    }

	    WebElement patientstab = patientstabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(patientstab));
	    patientstab.click();

	    return true;
	}
	
	public void clickintothenewpatientbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement newpatientbuttonTab = wait.until(ExpectedConditions.elementToBeClickable(newpatientbutton));
	   
	    try {
	    	newpatientbuttonTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", newpatientbuttonTab);
	    }

	    System.out.println("New Patien button clicked successfully");
	}
	
	public void enterthePatientLastName(String PatientLastName) {
		WebElement PatientLastNametextboxfield = driver.findElement(patientlastnametextboxinaddpatient);
		PatientLastNametextboxfield.clear();
		PatientLastNametextboxfield.sendKeys(PatientLastName);
    }
	
	public void enterthePatientFirstName(String PatientFirstName) {
		WebElement PatientFirstNametextboxfield = driver.findElement(patientfirstnametextboxinaddpatient);
		PatientFirstNametextboxfield.clear();
		PatientFirstNametextboxfield.sendKeys(PatientFirstName);
    }
	
	public void enterthePatientBirthdate(String PatientBirthDate) {
		WebElement PatientBirthDatetextboxfield = driver.findElement(patientbirthdatetextboxinaddpatient);
		PatientBirthDatetextboxfield.clear();
		PatientBirthDatetextboxfield.sendKeys(PatientBirthDate);
    }
	
	public void clickintothesearchbuttoninaddpatientwindow() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement searchbuttonTab = wait.until(ExpectedConditions.elementToBeClickable(searchbuttoninaddpatient));
	   
	    try {
	    	searchbuttonTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", searchbuttonTab);
	    }
	    System.out.println("Search button clicked successfully");
	}
	
	public void clickintothefilterstab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement filtersTab = wait.until(ExpectedConditions.elementToBeClickable(filterstab));
	   
	    try {
	    	filtersTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", filtersTab);
	    }
	    System.out.println("Filters tab clicked successfully");
	}
	
	public void enterthePatientLastNameinFilter(String PatientLastName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement PatientLastNametextboxfield = wait.until(ExpectedConditions.elementToBeClickable(patientlastnameinfilters));
		PatientLastNametextboxfield.clear();
		PatientLastNametextboxfield.sendKeys(PatientLastName);
    }
	
	public void enterthePatientFirstNameinFilter(String PatientFirstName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement PatientFirstNametextboxfield = wait.until(ExpectedConditions.elementToBeClickable(patientfirstnameinfilters));
		PatientFirstNametextboxfield.clear();
		PatientFirstNametextboxfield.sendKeys(PatientFirstName);
    }
	
	public void enterthePatientBirthdateinFilter(String PatientBirthDateinFilter) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement PatientBirthDateinFiltertextboxfield = wait.until(ExpectedConditions.elementToBeClickable(patientbirthdateinfilters));
		PatientBirthDateinFiltertextboxfield.clear();
		PatientBirthDateinFiltertextboxfield.sendKeys(PatientBirthDateinFilter);
    }
	
	public void enterthePatientIdinFilter(String PatientId) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement PatientIdtextboxfield = wait.until(ExpectedConditions.elementToBeClickable(patientidinfilters));
		PatientIdtextboxfield.clear();
		PatientIdtextboxfield.sendKeys(PatientId);
    }
	
	public void enterthepoints(String Points) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement Pointstextboxfield = wait.until(ExpectedConditions.elementToBeClickable(pointstextbox));
		Pointstextboxfield.clear();
		Pointstextboxfield.sendKeys(Points);
    }
	
	public void removethepoints() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement Pointstextboxfield = wait.until(ExpectedConditions.elementToBeClickable(pointstextbox));
		Pointstextboxfield.clear();
	}
	
	public String clickintothesearchbuttoninFilters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(searchbuttoninfilters)).click();
	   
	    System.out.println("Search button clicked successfully");
	    
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

	    // 2️⃣ Check No Documents Found popup
	    try {
	        WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//p[@class='noRecordsText']")));
	        return msg.getText();
	    } catch (TimeoutException e) {
	        // No popup → continue workflow
	    }

	    // 3️⃣ Documents exist → return available
	    return "Records Are Available";
	}
	
	public void clickintotheclearbuttoninfilters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement clearbuttoninfiltersTab = wait.until(ExpectedConditions.elementToBeClickable(clearbuttoninfilters));
	   
	    try {
	    	clearbuttoninfiltersTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", clearbuttoninfiltersTab);
	    }
	    System.out.println("Clear button clicked successfully");
	}
	
	public boolean clickintothepointssettingbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit Button
	    List<WebElement> pointssettingstabs = driver.findElements(pointssettingtab);

	    if (pointssettingstabs.isEmpty()) {
	        // Edit Button NOT present → stop scenario
	        return false;
	    }

	    WebElement pointssettingstab = pointssettingstabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(pointssettingstab));
	    pointssettingstab.click();

	    return true;
	}
	
	public String clickintothesavepointsbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(savepointsbutton)).click();
	   
	    System.out.println("Save button clicked successfully");
	    
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
		return "Points are added";
	}
	
	public boolean clickintothebuypointsbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Buy Points Button
	    List<WebElement> buypointsbuttons = driver.findElements(buypointsbutton);

	    if (buypointsbuttons.isEmpty()) {
	        // Buy Points Button NOT present → stop scenario
	        return false;
	    }

	    WebElement buypointsbutton = buypointsbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(buypointsbutton));
	    buypointsbutton.click();

	    return true;
	}
	
	public void enterthePointsinbuyadditinalpoints(String Points) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement Pointstextboxfield = wait.until(ExpectedConditions.elementToBeClickable(pointstextboxinbuypoints));
		Pointstextboxfield.clear();
		Pointstextboxfield.sendKeys(Points);
    }
	
	public void entertheRecipientNumberinbuyadditinalpoints(String RecipientNumber) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement RecipientNumbertextboxfield = wait.until(ExpectedConditions.elementToBeClickable(recipientnumbertextboxinbuypoints));
		RecipientNumbertextboxfield.clear();
		RecipientNumbertextboxfield.sendKeys(RecipientNumber);
    }
	
	public String clickintothebuybuttoninadditionalpoints() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(buybuttoninbuyadditionalpoints)).click();
	   
	    System.out.println("Buy button clicked successfully");
	    
	    StringBuilder allMessages = new StringBuilder();

	    try {
	        // Wait for at least one toast
	        wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//div[@class='toast-message']")));

	        // Collect ALL visible toast messages
	        List<WebElement> toasts = driver.findElements(
	                By.xpath("//div[@class='toast-message']"));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                System.out.println("Toast Error Found: " + msg);
	                allMessages.append(msg).append(" | ");
	            }
	        }

	    } catch (TimeoutException e) {
	        // No toast displayed
	    }

	    if (allMessages.length() > 0) {
	        return "ERROR: " + allMessages.toString();
	    }

	    return "Points are Buy";
	}
	
	public boolean clickintotheorderhistorybutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit Button
	    List<WebElement> orderhistoryButtons = driver.findElements(orderhistorybutton);

	    if (orderhistoryButtons.isEmpty()) {
	        // Edit Button NOT present → stop scenario
	        return false;
	    }

	    WebElement orderhistoryButton = orderhistoryButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(orderhistoryButton));
	    orderhistoryButton.click();

	    return true;
	}
	
	public boolean clickintothecardbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Card Button
	    List<WebElement> cardButtons = driver.findElements(cardbutton);

	    if (cardButtons.isEmpty()) {
	        // Card Button NOT present → stop scenario
	        return false;
	    }

	    WebElement cardButton = cardButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(cardButton));
	    cardButton.click();

	    return true;
	}
	
	public boolean clickintotheaddproductsbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Add Products Button
	    List<WebElement> addproductsButtons = driver.findElements(addproductsbutton);

	    if (addproductsButtons.isEmpty()) {
	        // Add Products Button NOT present → stop scenario
	        return false;
	    }

	    WebElement addproductsButton = addproductsButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(addproductsButton));
	    addproductsButton.click();

	    return true;
	}
	
	public void clickintothecategorydropdownbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement categorydropdownTab = wait.until(ExpectedConditions.elementToBeClickable(categorydropdown));
	   
	    try {
	    	categorydropdownTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", categorydropdownTab);
	    }
	    System.out.println("Category Dropdown button clicked successfully");
	}
	
	public String selectFirstCategory() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    WebElement categoryDropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(By.id("ProductCategories")));

	    Select select = new Select(categoryDropdown);
	    List<WebElement> options = select.getOptions();

	    // Check if dropdown has more than only placeholder
	    if (options.size() > 1) {

	        select.selectByIndex(1);
	        return select.getFirstSelectedOption().getText();

	    } else {
	        // Only "--Select Category--" present
	        return null;
	    }
	}
	
	public void entertheProductName(String ProductName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement ProductNametextboxfield = wait.until(ExpectedConditions.elementToBeClickable(productnametextbox));
		ProductNametextboxfield.clear();
		ProductNametextboxfield.sendKeys(ProductName);
    }
	
	public String clickintothesearchbuttoninaddproduct() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Click Search button
	    wait.until(ExpectedConditions.elementToBeClickable(searchbuttoninaddproduct)).click();

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
	                        By.xpath("//td[normalize-space()='No Record(s) Found.']")));

	        System.out.println("No Records Message: " + noRecordMsg.getText());
	        return noRecordMsg.getText();

	    } catch (TimeoutException e) {
	        // No "No Records Found" message
	    }

	    // 3️⃣ Product is available
	    return "Product is shown";
	}
	
	public void clickintotheselectallcheckboxinaddproduct() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement selectallcheckboxinaddproductTab = wait.until(ExpectedConditions.elementToBeClickable(selectallcheckboxinaddproduct));
	   
	    try {
	    	selectallcheckboxinaddproductTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectallcheckboxinaddproductTab);
	    }
	    System.out.println("Select All Checkbox button clicked successfully");
	}
	
	public String clickintothesubmitbuttoninaddproduct() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(submitbuttoninaddproduct)).click();
	   
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
		return "Product is Added";
	}
	
	public String clickintotheconfirmbuttoninpatientcard() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(confirmbuttoninpatientcard)).click();
	   
	    System.out.println("Confirm button clicked successfully");
	    
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
		return "Order is placed successfully";
	}
	
	public void orderhistorypagescroll() throws InterruptedException {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	  	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
	  	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	  	    // Wait for preloader to disappear
	  	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	  	    System.out.println("[" + LocalTime.now().format(dtf) + "] Preloader disappeared.");

	  	    // Wait for document section
	  	    WebElement UserDirectorySection = wait.until(ExpectedConditions.visibilityOfElementLocated(
	  	            By.id("content")));
	  	    System.out.println("[" + LocalTime.now().format(dtf) + "] Wizard 3 page is visible.");

	  	    // Get scroll height and client height
	  	    long scrollHeight = (long) js.executeScript("return arguments[0].scrollHeight;", UserDirectorySection);
	  	    long clientHeight = (long) js.executeScript("return arguments[0].clientHeight;", UserDirectorySection);
	  	    long currentScroll = 0;

	  	    // --- Scroll Down ---
	  	    System.out.println("[" + LocalTime.now().format(dtf) + "] Scrolling down...");
	  	    while (currentScroll + clientHeight < scrollHeight) {
	  	        js.executeScript("arguments[0].scrollTop += arguments[1];", UserDirectorySection, 400);
	  	        Thread.sleep(500); // shorter wait for smoother scroll
	  	        currentScroll = (long) js.executeScript("return arguments[0].scrollTop;", UserDirectorySection);
	  	    }
	  	    System.out.println("[" + LocalTime.now().format(dtf) + "] Finished scrolling down");
	  	    	    
	          Thread.sleep(2000);
	  	    // --- Scroll Up ---
	  	    System.out.println("[" + LocalTime.now().format(dtf) + "] Scrolling up...");
	  	    while (currentScroll > 0) {
	  	        js.executeScript("arguments[0].scrollTop -= arguments[1];", UserDirectorySection, 400);
	  	        Thread.sleep(500);
	  	        currentScroll = (long) js.executeScript("return arguments[0].scrollTop;", UserDirectorySection);
	  	    }
	  	    System.out.println("[" + LocalTime.now().format(dtf) + "] Finished scrolling up");
	}
	
	
	//---------------------------------- Product Section ------------------------------------------------------------------
	
	
	public boolean clickintotheproductinsidebarmenutab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Product tab
	    List<WebElement> producttabs = driver.findElements(producttabinsidebarmenu);

	    if (producttabs.isEmpty()) {
	        // Product tab NOT present → stop scenario
	        return false;
	    }

	    WebElement producttab = producttabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(producttab));
	    producttab.click();

	    return true;
	}
	
	public void entertheProductNameinProducts(String ProductName1) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		    WebElement productNameField = wait.until(
		            ExpectedConditions.elementToBeClickable(productnametextboxinproductspage));

		    // Extra safety for animation/overlay
		    wait.until(driver -> productNameField.isDisplayed()
		            && productNameField.isEnabled());

		    productNameField.click();
		    productNameField.clear();
		    productNameField.sendKeys(ProductName1);

		    System.out.println("Product name entered: " + ProductName1);
	}
	
	public String clickintothesearchbuttoninproducts() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Click Search button
	    wait.until(ExpectedConditions.elementToBeClickable(searchbuttoninproducts)).click();

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
	                        By.xpath("//td[normalize-space()='No Record(s) Found.']")));

	        System.out.println("No Records Message: " + noRecordMsg.getText());
	        return noRecordMsg.getText();

	    } catch (TimeoutException e) {
	        // No "No Records Found" message
	    }

	    // 3️⃣ Product is available
	    return "Record is shown";
	}
	
	public void clickintotheclearbuttoninproducts() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement clearbuttoninprductsTab = wait.until(ExpectedConditions.elementToBeClickable(clearbuttoninprducts));
	   
	    try {
	    	clearbuttoninprductsTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", clearbuttoninprductsTab);
	    }
	    System.out.println("Clear button clicked successfully");
	}
	
	public boolean clickintothenewproductbuttoninproducts() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for New Product Button
	    List<WebElement> newproductButtons = driver.findElements(newproductbuttoninproducts);

	    if (newproductButtons.isEmpty()) {
	        // New Product Button NOT present → stop scenario
	        return false;
	    }

	    WebElement newproductButton = newproductButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newproductButton));
	    newproductButton.click();

	    return true;
	}
	
	public void entertheProductNameinAddProduct(String ProductName2) {
		WebElement ProductNametextboxfield = driver.findElement(productnametextboxfieldinaddproduct);
		ProductNametextboxfield.clear();
		ProductNametextboxfield.sendKeys(ProductName2);
    }
	
	public void removetheProductNameinAddProduct() {
		WebElement ProductNametextboxfield = driver.findElement(productnametextboxfieldinaddproduct);
		ProductNametextboxfield.clear();
	}
	
	public void entertheProductDescription(String ProductDescription) {
		WebElement ProductDescriptiontextboxfield = driver.findElement(productdescriptiontextbox);
		ProductDescriptiontextboxfield.clear();
		ProductDescriptiontextboxfield.sendKeys(ProductDescription);
    }
	
	public void removetheProductDescription() {
		WebElement ProductDescriptiontextboxfield = driver.findElement(productdescriptiontextbox);
		ProductDescriptiontextboxfield.clear();
	}
	
	public void clickintothestatusdropdown() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement statusdropdownTab = wait.until(ExpectedConditions.elementToBeClickable(statusdropdown));
	   
	    try {
	    	statusdropdownTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", statusdropdownTab);
	    }
	    System.out.println("Status Dropdown button clicked successfully");
	}
	
	public void selectthedraftstatus() {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	   // Wait for dropdown <select> to be visible
	   WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Product_Status")));

	   // Use Select class
	   Select select = new Select(dropdown);
	   select.selectByVisibleText("Draft");

	   System.out.println("Draft Status selected successfully.");
	}
	
	public void selectthepublishedstatus() {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		   // Wait for dropdown <select> to be visible
		   WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Product_Status")));

		   // Use Select class
		   Select select = new Select(dropdown);
		   select.selectByVisibleText("Published");

		   System.out.println("Published Status selected successfully.");
	}
	
	public void selectthenonestatus() {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		   // Wait for dropdown <select> to be visible
		   WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Product_Status")));

		   // Use Select class
		   Select select = new Select(dropdown);
		   select.selectByVisibleText("None");

		   System.out.println("None status selected successfully.");
		}
	
	public void clickintothecategorydropdowninaddproduct() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement categorydropdowninaddproductTab = wait.until(ExpectedConditions.elementToBeClickable(categorydropdowninaddproduct));
	   
	    try {
	    	categorydropdowninaddproductTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", categorydropdowninaddproductTab);
	    }
	    System.out.println("Category Dropdown button clicked successfully");
	}
	
	public String selectFirstCategoryinAddProduct() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    WebElement categoryDropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(By.id("Product_ProductCategory_Id")));

	    Select select = new Select(categoryDropdown);
	    List<WebElement> options = select.getOptions();

	    // Check if dropdown has more than only placeholder
	    if (options.size() > 1) {

	        select.selectByIndex(1);
	        return select.getFirstSelectedOption().getText();

	    } else {
	        // Only "--Select Category--" present
	        return null;
	    }
	}
	
	public String selectSecondCategoryinAddProduct() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    WebElement categoryDropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(By.id("Product_ProductCategory_Id")));

	    Select select = new Select(categoryDropdown);
	    List<WebElement> options = select.getOptions();

	    // Check if dropdown has more than only placeholder
	    if (options.size() > 1) {

	        select.selectByIndex(2);
	        return select.getFirstSelectedOption().getText();

	    } else {
	        // Only "--Select Category--" present
	        return null;
	    }
	}
	
	public String selectNoneCategoryinAddProduct() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    WebElement categoryDropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(By.id("Product_ProductCategory_Id")));

	    Select select = new Select(categoryDropdown);
	    List<WebElement> options = select.getOptions();

	    // Check if dropdown has more than only placeholder
	    if (options.size() > 1) {

	        select.selectByIndex(0);
	        return select.getFirstSelectedOption().getText();

	    } else {
	        // Only "--Select Category--" present
	        return null;
	    }
	}
	
	public void enterthePointsinAddProduct(String Points1) {
		WebElement Pointstextboxfield = driver.findElement(pointstextboxfield);
		Pointstextboxfield.clear();
		Pointstextboxfield.sendKeys(Points1);
    }
	
	public void removethePointsinAddProduct() {
		WebElement Pointstextboxfield = driver.findElement(pointstextboxfield);
		Pointstextboxfield.clear();
	}
	
	public void entertheStockinAddProduct(String Stock) {
		WebElement Stocktextboxfield = driver.findElement(stocktextboxfield);
		Stocktextboxfield.clear();
		Stocktextboxfield.sendKeys(Stock);
    }
	
	public void removetheStockinAddProduct() {
		WebElement Stocktextboxfield = driver.findElement(stocktextboxfield);
		Stocktextboxfield.clear();
	}
	
	public void clickintotheuploadimagestab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement uploadimagestabTab = wait.until(ExpectedConditions.elementToBeClickable(uploadimagestab));
	   
	    try {
	    	uploadimagestabTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", uploadimagestabTab);
	    }
	    System.out.println("Upload images button clicked successfully");
	}
	
	@FindBy(css = "input.upload__inputfile")
	WebElement uploadInput;

	public void uploadTheImages(String... filePaths) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    WebElement input = wait.until(
	            ExpectedConditions.presenceOfElementLocated(
	                    By.cssSelector("input.upload__inputfile")));

	    input.sendKeys(String.join("\n", filePaths));
	}
	
	public String clickintothesaveproductbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(saveproductbutton)).click();
	   
	    System.out.println("Save Product button clicked successfully");
	    
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
		return "Product is add successfully";
	}
	
	public void clickintothethreedotbuttoninproducts() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement threedotbuttoninproductsTab = wait.until(ExpectedConditions.elementToBeClickable(threedotbuttoninproducts));
	   
	    try {
	    	threedotbuttoninproductsTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", threedotbuttoninproductsTab);
	    }
	    System.out.println("Three dot button clicked successfully");
	}
	
	public boolean clickintotheeditbuttoninproducts() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit Button
	    List<WebElement> EditButtons = driver.findElements(editbuttoninproducts);

	    if (EditButtons.isEmpty()) {
	        // Edit Button NOT present → stop scenario
	        return false;
	    }

	    WebElement EditButton = EditButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(EditButton));
	    EditButton.click();

	    return true;
	}
	
	public boolean clickintothedeletebuttoninprducts() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletebuttoninproducts);

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
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeleteproductsbutton));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	
	//----------------------------------- Product Category -----------------------------------------------------------
	
	
	
	public boolean clickintotheproductcategorytabinsidebarmenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Product Category tab
	    List<WebElement> productcategorytabs = driver.findElements(productcategorytabinsidebarmenu);

	    if (productcategorytabs.isEmpty()) {
	        // Product Category tab NOT present → stop scenario
	        return false;
	    }

	    WebElement productcategorytab = productcategorytabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(productcategorytab));
	    productcategorytab.click();

	    return true;
	}
	
	public boolean clickintothenewproductcategorybutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for New Product Category Button
	    List<WebElement> newproductcategoryButtons = driver.findElements(newproductcategorybutton);

	    if (newproductcategoryButtons.isEmpty()) {
	        // New Product Category Button NOT present → stop scenario
	        return false;
	    }

	    WebElement newproductcategoryButton = newproductcategoryButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newproductcategoryButton));
	    newproductcategoryButton.click();

	    return true;
	}
	
	@FindBy(css = "input[type='file']")
	WebElement productCategoryImageInput;

	public void uploadTheProductCategoryImages(String filePath) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    WebElement input = wait.until(
	            ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='file']")));

	    input.sendKeys(filePath);
	}
	
	public void entertheProductCategoryName(String ProductCategoryName) {
		WebElement ProductCategoryNametextboxfield = driver.findElement(productcategorynametextboxfield);
		ProductCategoryNametextboxfield.clear();
		ProductCategoryNametextboxfield.sendKeys(ProductCategoryName);
    }
	
	public void removetheProductCategoryName() {
		WebElement ProductCategoryNametextboxfield = driver.findElement(productcategorynametextboxfield);
		ProductCategoryNametextboxfield.clear();
	}
	
	public void entertheProductCategoryDescription(String ProductCategoryDescription) {
		WebElement ProductCategoryDescriptiontextboxfield = driver.findElement(productcategorydescriptiontextboxfield);
		ProductCategoryDescriptiontextboxfield.clear();
		ProductCategoryDescriptiontextboxfield.sendKeys(ProductCategoryDescription);
    }
	
	public void removetheProductCategoryDescription() {
		WebElement ProductCategoryDescriptiontextboxfield = driver.findElement(productcategorydescriptiontextboxfield);
		ProductCategoryDescriptiontextboxfield.clear();
	}
	
	public String clickintothesubmitbuttoninproductcategory() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(submitbuttoninproductcategory)).click();
	   
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
		return "Product Category is Save successfully";
	}
	
	public void clickintotheselectnewimageinproductcategory() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement selectnewimagebuttoninproductcategoryTab = wait.until(ExpectedConditions.elementToBeClickable(selectnewimagebuttoninproductcategory));
	   
	    try {
	    	selectnewimagebuttoninproductcategoryTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectnewimagebuttoninproductcategoryTab);
	    }
	    System.out.println("Select New Image button clicked successfully");
	}
	
	public void clickintotheremovebuttoninproductcategory() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement removebuttoninproductcategoryTab = wait.until(ExpectedConditions.elementToBeClickable(removebuttoninproductcategory));
	   
	    try {
	    	removebuttoninproductcategoryTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", removebuttoninproductcategoryTab);
	    }
	    System.out.println("Remove button clicked successfully");
	}
	
	public void clickintotheconfirmdeleteproductcategorybutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement confirmdeleteproductcategorybuttonTab = wait.until(ExpectedConditions.elementToBeClickable(confirmdeleteproductcategorybutton));
	   
	    try {
	    	confirmdeleteproductcategorybuttonTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", confirmdeleteproductcategorybuttonTab);
	    }
	    System.out.println("Confirm button clicked successfully");
	}
}
