package com.pharmcrm_ProjectModule.pages;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectModuleFunctionalityPage {
	WebDriver driver;
	
	//By Locators
	private By projectmoduletab = By.xpath("//a[@href='/Project/Home/Dashboard']//div[@class='module-list-main']//div[@class='module-list-img']");
	private By boardssidebarmenu = By.xpath("//span[normalize-space()='Boards']");
	private By createnewboardbutton = By.xpath("//button[normalize-space()='Create New Board']");
	private By boardnametextboxfield = By.xpath("//input[@id='Board_Name']");
	private By boarddescription = By.xpath("//textarea[@id='Board_Description']");
	private By submitbutton = By.xpath("//button[@id='btnSave']");
	private By editboardbutton = By.xpath("(//*[name()='path' and @id='Path_23']/ancestor::*[self::button or @role='button' or self::a])[1]");
	private By deleteboardbutton = By.xpath("(//a[@id='btnDeleteBoard'])[1]");
	private By confirmbutton = By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']");
	private By settingbutton = By.xpath("(//a[@data-original-title='Board Details'])[1]");
	private By threedotverticalbuttoninboardmember = By.xpath("(//i[@class='fa-solid fa-ellipsis-vertical'])[1]");
	private By editbuttoninboardmember = By.xpath("//span[normalize-space()='Edit']");
	private By addpanelcheckbox = By.xpath("//label[normalize-space()='Add Panel']");
	private By editpanelcheckbox = By.xpath("//label[normalize-space()='Edit Panel']");
	private By deletepanelcheckbox = By.xpath("//label[normalize-space()='Delete Panel']");
	private By addtaskcheckbox = By.xpath("//label[normalize-space()='Add Task']");
	private By edittaskcheckbox = By.xpath("//label[normalize-space()='Edit Task']");
	private By deletetaskcheckbox = By.xpath("//label[normalize-space()='Delete Task']");
	private By addcommentcheckbox = By.xpath("//label[normalize-space()='Add Comment']");
	private By markclosedcheckbox = By.xpath("//label[normalize-space()='Mark Closed']");
	private By submitbuttoninedittaskpermission = By.xpath("//button[@id='btnSaveMemberTask']");
	private By newboardmemberbutton = By.xpath("//span[normalize-space()='New Board Member']");
	private By lastnametextboxfilter = By.xpath("//input[@id='Filter_LastName']");
	private By firstnametextboxfilter = By.xpath("//input[@id='Filter_FirstName']");
	private By searchbutton = By.xpath("//button[normalize-space()='Search']");
	private By firstradiobutton = By.xpath("//div[contains(@class,'searchUser-radio')]//input[@type='radio']");
	private By submitbuttoninsearchuser = By.xpath("//button[@id='btnUser']");
	private By threedotverticalbuttoninboardmember1 = By.xpath("(//i[@class='fa-solid fa-ellipsis-vertical'])[2]");
	private By editbuttoninboardmember1 = By.xpath("(//span[contains(text(),'Edit')])[2]");
	private By deleteboardmemberbutton = By.xpath("(//span[normalize-space()='Delete'])[1]");
	private By confirmbuttonindeleteboardmember = By.xpath("(//button[@id='btnDeleteConfirm'])[1]");
	private By assignboardleadbutton = By.xpath("(//a[@id='btnAssignBoardLead'])[1]");
	private By confirmbuttoninassignteamlead = By.xpath("//button[@id='btnAssignTeamLeadConfirm']");
	private By firstboardpaneltab = By.xpath("(//a[contains(@href,'BoardPanels')][.//h1])[1]");
	private By firstboardpaneltabinsidebar = By.xpath("(//nav[@id='sidebar']//a[contains(@href,'BoardPanels')])[1]");
	private By colourtabintaks = By.xpath("//button[@id='boardsBackground']");
	private By orangecolourtab = By.xpath("//a[@class='board-bg-color board-bg-color-orange']");
	private By greencolourtab = By.xpath("//a[@class='board-bg-color board-bg-color-green']");
	private By bluecolourtab = By.xpath("//a[@class='board-bg-color board-bg-color-blue']");
	private By pinkcolourtab = By.xpath("//a[@class='board-bg-color board-bg-color-pink']");
	private By boardfilterbutton = By.xpath("//button[@id='boardsFilter']");
	private By tasktitlefiltertextbox = By.xpath("//input[@id='Filter_Title']");
	private By assignfromdatetextbox = By.xpath("//input[@id='Filter_StartFromDate']");
	private By assigntodatetextbox = By.xpath("//input[@id='Filter_StartToDate']");
	private By userfilterdropdown = By.xpath("//select[@id='Filter_Assignee']");
	private By searchbuttonintasks = By.xpath("//button[@onclick='TaskSearch()']");
	private By addnewpanelbutton = By.xpath("//button[normalize-space()='Add New Panel']");
	private By boardpaneltextbox = By.xpath("//input[@id='BoardPanel_Name']");
	private By submitbuttoninaddboardpanel = By.xpath("//button[@id='btnSaveBoardPanel']");
	private By firsteditboardpanelbutton = By.xpath("(//div[contains(@class,'boards-btn')]//a[@data-original-title='Edit Board Panel'])[1]");
	private By firstdeleteboardpanelbutton = By.xpath("(//div[contains(@class,'boards-btn')]//a[@data-original-title='Delete Board Panel'])[1]");
	private By confirmdeletebutton = By.xpath("//div[@id='genericmodal']//button[@id='btnDeleteConfirm']");
	private By addcardtabinToDo = By.xpath("(//p[contains(text(),'Add a Card')])[1]");
	private By firstaddcardtextarea = By.xpath("(//textarea[starts-with(@id,'txtNewTask_')])[1]");
	private By addcardbutton = By.xpath("(//button[normalize-space()='Add Card'])[1]");
	private By firsttasktab = By.xpath("(//div[contains(@class,'task-card')]//p[@title])[1]");
	private By startdateinedittask = By.xpath("//a[@id='startDatePicker']");
	private By enddateinedittask = By.xpath("//a[@id='endDatePicker']");
	private By memberstabinedittask = By.xpath("//a[@id='assignEmployee']");
	private By prioritytabinedittask = By.xpath("(//a[normalize-space()='Priority'])");
	private By criticalpriority = By.xpath("(//a[@href='#'][normalize-space()='Critical'])[2]");
	private By markcompleteinedittask = By.xpath("//a[@id='IsMarkComplete']");
	private By taskdetailstextbox = By.xpath("//div[contains(@class,'ck-editor__main')]//div[@contenteditable='true']");
	private By commentstextbox = By.xpath("//textarea[@id='txtComment']");
	private By addcommentinedittask = By.xpath("//button[@id='btnSaveComment']");
	private By deletetaskbutton = By.xpath("//a[@id='deleteTaskCard']");
	private By deletecardbutton = By.xpath("//button[@id='btnDeleteTaskCard']");
	private By submitbuttoninedittask = By.xpath("//button[@id='btnSave']");
	
	
	
	
	public void GetuserControl() {
    	List<WebElement> users = driver.findElements(
                By.xpath("//div[contains(@class,'searchUser-radio')]/*[starts-with(@id, 'userName')]")
            );
            
            for (WebElement user : users) {
                String id = user.getAttribute("data-id");
                System.out.println("Print the ID:" +id);
               
                // Build dynamic locators using the predictable ID pattern
                firstradiobutton = By.xpath("//input[@class='searchUser-input" + id + "']");
            }
	}

	
	
	
	
	
	
	
	
	
	
	
	
	public ProjectModuleFunctionalityPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickintotheprojectmoduletab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement projectmoduleTab = wait.until(ExpectedConditions.elementToBeClickable(projectmoduletab));
	   
	    try {
	    	projectmoduleTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", projectmoduleTab);
	    }

	    System.out.println("Project Module Tab clicked successfully");
	}
	
	public void clickintotheboardssidebarmenu() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement boardssidebarmenuTab = wait.until(ExpectedConditions.elementToBeClickable(boardssidebarmenu));
	   
	    try {
	    	boardssidebarmenuTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", boardssidebarmenuTab);
	    }

	    System.out.println("Boards Sidebar Menu Tab clicked successfully");
	}
	
	
	//-------------------------Create a New Board--------------------------------------------
	
	
	public void clickintothecreatenewboardbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement createnewboardbuttonTab = wait.until(ExpectedConditions.elementToBeClickable(createnewboardbutton));
	   
	    try {
	    	createnewboardbuttonTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", createnewboardbuttonTab);
	    }

	    System.out.println("Create New Board button clicked successfully");
	}
	
	public void entertheBoardName(String BoardName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    WebElement BoardNameField = wait.until(
	            ExpectedConditions.elementToBeClickable(boardnametextboxfield));

	    // Extra safety for animation/overlay
	    wait.until(driver -> BoardNameField.isDisplayed()
	            && BoardNameField.isEnabled());

	    BoardNameField.click();
	    BoardNameField.clear();
	    BoardNameField.sendKeys(BoardName);

	    System.out.println("Board name entered: " + BoardName);
    }
	
	public void entertheBoardDescription(String BoardDescription) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    WebElement BoardDescriptionField = wait.until(
	            ExpectedConditions.elementToBeClickable(boarddescription));

	    // Extra safety for animation/overlay
	    wait.until(driver -> BoardDescriptionField.isDisplayed()
	            && BoardDescriptionField.isEnabled());

	    BoardDescriptionField.click();
	    BoardDescriptionField.clear();
	    BoardDescriptionField.sendKeys(BoardDescription);

	    System.out.println("Board Description entered: " + BoardDescription);
    }
	
	public String clickintothesubmitbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(submitbutton)).click();
	   
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
		return "New Board details are added successsfully";
	}
	
	
	//------------------------------Edit The Board--------------------------------------------
		
	
	public boolean clickintotheeditboardbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for edit button
	    List<WebElement> editButtons = driver.findElements(editboardbutton);

	    if (editButtons.isEmpty()) {
	        // Edit button NOT present → stop scenario
	        return false;
	    }

	    WebElement editButton = editButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(editButton));
	    editButton.click();

	    return true;
	}
	
	public void removetheBoardName() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    WebElement BoardNameField = wait.until(
	            ExpectedConditions.elementToBeClickable(boardnametextboxfield));

	    // Extra safety for animation/overlay
	    wait.until(driver -> BoardNameField.isDisplayed()
	            && BoardNameField.isEnabled());

	    BoardNameField.click();
	    BoardNameField.clear();
	    
	    System.out.println("Board name remove successfully ");
	}
	
	public void removetheBoardDescription() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    WebElement BoardDescriptionField = wait.until(
	            ExpectedConditions.elementToBeClickable(boarddescription));

	    // Extra safety for animation/overlay
	    wait.until(driver -> BoardDescriptionField.isDisplayed()
	            && BoardDescriptionField.isEnabled());

	    BoardDescriptionField.click();
	    BoardDescriptionField.clear();
	    
	    System.out.println("Board Description remove successfully");
	}
	
	
	//----------------------------------Delete The Board-----------------------------------------------
	
	
	public boolean clickintothedeleteboardbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deleteboardbutton);

	    if (deleteButtons.isEmpty()) {
	        // Delete button NOT present → stop scenario
	        return false;
	    }

	    WebElement deleteButton = deleteButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(deleteButton));
	    deleteButton.click();

	    return true;
	}
	
	public void clickintotheconfirmbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement confirmbuttonTab = wait.until(ExpectedConditions.elementToBeClickable(confirmbutton));
	   
	    try {
	    	confirmbuttonTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", confirmbuttonTab);
	    }

	    System.out.println("Confirm Button clicked successfully");
	}
	
	
	//------------------------------------------Setting The Board--------------------------------------
		
	
	public boolean clickintothesettingboardbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for setting button
	    List<WebElement> settingButtons = driver.findElements(settingbutton);

	    if (settingButtons.isEmpty()) {
	        // Setting button NOT present → stop scenario
	        return false;
	    }

	    WebElement settingButton = settingButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(settingButton));
	    settingButton.click();

	    return true;
	}
	
	public void clickintothethreedotbuttoninboardmember() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement threedotbutton = wait.until(ExpectedConditions.elementToBeClickable(threedotverticalbuttoninboardmember));
	   
	    try {
	    	threedotbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", threedotbutton);
	    }

	    System.out.println("Three dot vertical Button clicked successfully");
	}
	
	public void clickintotheeditbuttoninboardmember() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement editbutton = wait.until(ExpectedConditions.elementToBeClickable(editbuttoninboardmember));
	   
	    try {
	    	editbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", editbutton);
	    }
	    System.out.println("Edit Button clicked successfully");
	}
	
	
	
	//-------------------------------------Assign Task Permission-----------------------------------------------
	
	
	
	public void clickintotheaddpanelcheckbox() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement addpanelcheckboxTab = wait.until(ExpectedConditions.elementToBeClickable(addpanelcheckbox));
	   
	    try {
	    	addpanelcheckboxTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addpanelcheckboxTab);
	    }
	    System.out.println("Add Panel Checkbox clicked successfully");
	}
	
	public void clickintotheeditpanelcheckbox() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement editpanelcheckboxTab = wait.until(ExpectedConditions.elementToBeClickable(editpanelcheckbox));
	   
	    try {
	    	editpanelcheckboxTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", editpanelcheckboxTab);
	    }
	    System.out.println("Edit Panel Checkbox clicked successfully");
	}
	
	public void clickintothedeletepanelcheckbox() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement deletepanelcheckboxTab = wait.until(ExpectedConditions.elementToBeClickable(deletepanelcheckbox));
	   
	    try {
	    	deletepanelcheckboxTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", deletepanelcheckboxTab);
	    }
	    System.out.println("Delete Panel Checkbox clicked successfully");
	}
	
	public void clickintotheaddtaskcheckbox() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement addtaskcheckboxTab = wait.until(ExpectedConditions.elementToBeClickable(addtaskcheckbox));
	   
	    try {
	    	addtaskcheckboxTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addtaskcheckboxTab);
	    }
	    System.out.println("Add Task Checkbox clicked successfully");
	}
	
	public void clickintotheedittaskcheckbox() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement edittaskcheckboxTab = wait.until(ExpectedConditions.elementToBeClickable(edittaskcheckbox));
	   
	    try {
	    	edittaskcheckboxTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", edittaskcheckboxTab);
	    }
	    System.out.println("Edit Task Checkbox clicked successfully");
	}
	
	public void clickintothedeletetaskcheckbox() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement deletetaskcheckboxTab = wait.until(ExpectedConditions.elementToBeClickable(deletetaskcheckbox));
	   
	    try {
	    	deletetaskcheckboxTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", deletetaskcheckboxTab);
	    }
	    System.out.println("Delete Task Checkbox clicked successfully");
	}
	
	public void clickintotheaddcommentcheckbox() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement addcommentcheckboxTab = wait.until(ExpectedConditions.elementToBeClickable(addcommentcheckbox));
	   
	    try {
	    	addcommentcheckboxTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addcommentcheckboxTab);
	    }
	    System.out.println("Add Comment Checkbox clicked successfully");
	}
	
	public void clickintothemarkclosedcheckbox() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement  markclosedcheckboxTab = wait.until(ExpectedConditions.elementToBeClickable(markclosedcheckbox));
	   
	    try {
	    	markclosedcheckboxTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", markclosedcheckboxTab);
	    }
	    System.out.println("Mark Closed Checkbox clicked successfully");
	}
	
	public void clickintothesubmitbuttoninedittaskpermission() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement  submitbuttonTab = wait.until(ExpectedConditions.elementToBeClickable(submitbuttoninedittaskpermission));
	   
	    try {
	    	submitbuttonTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitbuttonTab);
	    }
	    System.out.println("Submit Button clicked successfully");
	}
	
	
	//----------------------------------Add New Board Member---------------------------------------------
	
		
	public void clickintothenewboardmemberbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement newboardmemberbuttonTab = wait.until(ExpectedConditions.elementToBeClickable(newboardmemberbutton));
	   
	    try {
	    	newboardmemberbuttonTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", newboardmemberbuttonTab);
	    }
	    System.out.println("New Board Member Button clicked successfully");
	}
	
	public void entertheLastNameinfilter(String LastName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    WebElement LastNametextboxfilter = wait.until(
	            ExpectedConditions.elementToBeClickable(lastnametextboxfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> LastNametextboxfilter.isDisplayed()
	            && LastNametextboxfilter.isEnabled());

	    LastNametextboxfilter.click();
	    LastNametextboxfilter.clear();
	    LastNametextboxfilter.sendKeys(LastName);

	    System.out.println("Last Name entered: " + LastName);
    }
	
	public void entertheFirstNameinfilter(String FirstName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    WebElement FirstNametextboxfilter = wait.until(
	            ExpectedConditions.elementToBeClickable(firstnametextboxfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> FirstNametextboxfilter.isDisplayed()
	            && FirstNametextboxfilter.isEnabled());

	    FirstNametextboxfilter.click();
	    FirstNametextboxfilter.clear();
	    FirstNametextboxfilter.sendKeys(FirstName);

	    System.out.println("First Name entered: " + FirstName);
    }
	
	public String clickintothesearchbuttoninsearchuser() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Click Search button
	    wait.until(ExpectedConditions.elementToBeClickable(searchbutton)).click();

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
	                ExpectedConditions.visibilityOfElementLocated(
	                        By.xpath("//label[@id='lblNoRecord']")));

	        return "ERROR: " + noRecordMsg.getText();

	    } catch (TimeoutException ignored) {}

	    // 3️⃣ User exists
	    return "SUCCESS: User is shown";
	}
	
	public void clickintotheuserradiobutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Click Search button
	    wait.until(ExpectedConditions.elementToBeClickable(firstradiobutton)).click();

	    System.out.println("Radio button clicked successfully");
	}
	
	public String clickintothesubmitbuttoninsearchuser() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(submitbuttoninsearchuser)).click();
	   
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
		return "New Board Member added successsfully";
	}
	
	public boolean clickintothethreedotbuttonboardmember1() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for setting button
	    List<WebElement> threedotButtons = driver.findElements(threedotverticalbuttoninboardmember1);

	    if (threedotButtons.isEmpty()) {
	        // Setting button NOT present → stop scenario
	        return false;
	    }

	    WebElement threedotButton = threedotButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(threedotButton));
	    threedotButton.click();

	    return true;
	}
	
	public void clickintotheeditbuttoninboardmember1() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement editbuttoninboardmember = wait.until(ExpectedConditions.elementToBeClickable(editbuttoninboardmember1));
	   
	    try {
	    	editbuttoninboardmember.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", editbuttoninboardmember);
	    }
	    System.out.println("Edit Button clicked successfully");
	}
	
	public void clickintothedeletebuttoninboardmember1() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement deleteboardmemberbuttonTab = wait.until(ExpectedConditions.elementToBeClickable(deleteboardmemberbutton));
	   
	    try {
	    	deleteboardmemberbuttonTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", deleteboardmemberbuttonTab);
	    }
	    System.out.println("Delete Button clicked successfully");
	}
	
	public void clickintotheconfirmdeletebuttoninboardmember1() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement confirmbuttonindeleteboardmemberTab = wait.until(ExpectedConditions.elementToBeClickable(confirmbuttonindeleteboardmember));
	   
	    try {
	    	confirmbuttonindeleteboardmemberTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", confirmbuttonindeleteboardmemberTab);
	    }
	    System.out.println("Confirm Button clicked successfully");
	}
	
	
	//---------------------------------Assign Team Lead Permission-----------------------------------------
	
		
	public boolean clickintotheassignboardleadbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    List<WebElement> assignboardleadButtonTab =
	            driver.findElements(assignboardleadbutton);

	    if (assignboardleadButtonTab.isEmpty()) {
	        System.out.println("Assign Board Lead button NOT found");
	        return false;
	    }

	    WebElement assignboardleadButton = assignboardleadButtonTab.get(0);

	    // scroll element to center (VERY IMPORTANT)
	    ((JavascriptExecutor) driver).executeScript(
	            "arguments[0].scrollIntoView({block:'center'});",
	            assignboardleadButton);

	    try {
	        // try normal click first
	        wait.until(ExpectedConditions.elementToBeClickable(assignboardleadButton));
	        assignboardleadButton.click();
	    } catch (ElementClickInterceptedException e) {
	        // fallback to JS click
	        ((JavascriptExecutor) driver).executeScript(
	                "arguments[0].click();", assignboardleadButton);
	    }

	    System.out.println("Assign Board Lead button clicked successfully");
	    return true;
	}
	
	public void clickintotheconfirmteamleadbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement confirmbuttoninassignteamleadTab = wait.until(ExpectedConditions.elementToBeClickable(confirmbuttoninassignteamlead));
	   
	    try {
	    	confirmbuttoninassignteamleadTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", confirmbuttoninassignteamleadTab);
	    }
	    System.out.println("Confirm Button clicked successfully");
	}
	
	public boolean clickintothefirstboardpaneltab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for board panel tab
	    List<WebElement> firstboardpaneltabs = driver.findElements(firstboardpaneltab);

	    if (firstboardpaneltabs.isEmpty()) {
	        // Board Panel tab NOT present → stop scenario
	        return false;
	    }

	    WebElement firstboardpaneltab = firstboardpaneltabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(firstboardpaneltab));
	    firstboardpaneltab.click();

	    return true;
	}
	
	public boolean clickintothefirstboardpanelsidebartab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for board panel tab
	    List<WebElement> firstboardpaneltabs = driver.findElements(firstboardpaneltabinsidebar);

	    if (firstboardpaneltabs.isEmpty()) {
	        // Board Panel tab NOT present in Sidebar → stop scenario
	        return false;
	    }

	    WebElement firstboardpaneltab = firstboardpaneltabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(firstboardpaneltab));
	    firstboardpaneltab.click();

	    return true;
	}
	
	public void clickintothecolourtabintasks() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement colourtabinTaks = wait.until(ExpectedConditions.elementToBeClickable(colourtabintaks));
	   
	    try {
	    	colourtabinTaks.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", colourtabinTaks);
	    }
	    System.out.println("Colour tab Button clicked successfully");
	}
	
	public void clickintotheorangecolourtab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement orangecolourTab = wait.until(ExpectedConditions.elementToBeClickable(orangecolourtab));
	   
	    try {
	    	orangecolourTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", orangecolourTab);
	    }
	    System.out.println("Orange colour tab clicked successfully");
	}
	
	public void clickintothegreencolourtab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement greencolourTab = wait.until(ExpectedConditions.elementToBeClickable(greencolourtab));
	   
	    try {
	    	greencolourTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", greencolourTab);
	    }
	    System.out.println("Green colour tab clicked successfully");
	}
	
	public void clickintothebluecolourtab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement bluecolourTab = wait.until(ExpectedConditions.elementToBeClickable(bluecolourtab));
	   
	    try {
	    	bluecolourTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", bluecolourTab);
	    }
	    System.out.println("Blue colour tab clicked successfully");
	}
	
	public void clickintothepinkcolourtab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement pinkcolourTab = wait.until(ExpectedConditions.elementToBeClickable(pinkcolourtab));
	   
	    try {
	    	pinkcolourTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", pinkcolourTab);
	    }
	    System.out.println("Pink colour tab clicked successfully");
	}
	
	public void clickintotheboardfilterbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement boardfilterbuttonTab = wait.until(ExpectedConditions.elementToBeClickable(boardfilterbutton));
	   
	    try {
	    	boardfilterbuttonTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", boardfilterbuttonTab);
	    }
	    System.out.println("Board filter button clicked successfully");
	}
	
	public void entertheTasktitlenamefilter(String TaskTitle) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    WebElement tasktitlefiltertextboxField = wait.until(
	            ExpectedConditions.elementToBeClickable(tasktitlefiltertextbox));

	    // Extra safety for animation/overlay
	    wait.until(driver -> tasktitlefiltertextboxField.isDisplayed()
	            && tasktitlefiltertextboxField.isEnabled());

	    tasktitlefiltertextboxField.click();
	    tasktitlefiltertextboxField.clear();
	    tasktitlefiltertextboxField.sendKeys(TaskTitle);

	    System.out.println("Task Title entered: " + TaskTitle);
    }
	
	public void selecttheassignfromdatefilter() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ProjectModuleFunctionalityPage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement assignfromdatetextboxTab = wait.until(ExpectedConditions.elementToBeClickable(assignfromdatetextbox));

        try {
            assignfromdatetextboxTab.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", assignfromdatetextboxTab);
        }

        System.out.println("Select from Date Filter clicked successfully");
    }

    public void selectTodaysDate() {
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
	
	public void selecttheassigntodatefilter() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ProjectModuleFunctionalityPage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement assigntodatetextboxTab = wait.until(ExpectedConditions.elementToBeClickable(assigntodatetextbox));

        try {
        	assigntodatetextboxTab.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", assigntodatetextboxTab);
        }

        System.out.println("Select to Date Filter clicked successfully");
	}
	
	public void selectToDateAfter10Days() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[contains(@class,'ui-datepicker-calendar')]")));

	    // Calculate future date
	    LocalDate futureDate = LocalDate.now().plusDays(10);
	    int day = futureDate.getDayOfMonth();
	    int month = futureDate.getMonthValue() - 1; // months in datepicker are 0-based
	    int year = futureDate.getYear();

	    // Build dynamic XPath for the date
	    String dynamicXpath = String.format(
	        "//td[@data-handler='selectDay' and @data-month='%d' and @data-year='%d']/a[text()='%d']",
	        month, year, day
	    );

	    WebElement futureElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
	    futureElement.click();

	    System.out.println("Selected date after " + 10 + " days: " + day + "-" + (month + 1) + "-" + year);
	}

	
	public void clickintotheuserfilterdropdown() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement userfilterdropdownTab = wait.until(ExpectedConditions.elementToBeClickable(userfilterdropdown));
	   
	    try {
	    	userfilterdropdownTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", userfilterdropdownTab);
	    }
	    System.out.println("User filter dropdown button clicked successfully");
	}
	
	public boolean selecttheusers(int index) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    WebElement dropdown = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(By.id("Filter_Assignee"))
	    );

	    Select select = new Select(dropdown);
	    int optionCount = select.getOptions().size();

	    if (index < optionCount) {
	        select.selectByIndex(index);
	        System.out.println("Dropdown value selected using index: " + index);
	        return true;
	    } else {
	        System.out.println(
	            "Index " + index + " is NOT present in dropdown. Total options: " + optionCount
	        );
	        return false;
	    }
	}
	
	public void clickintothesearchbuttonintasks() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement searchbuttonintasksTab = wait.until(ExpectedConditions.elementToBeClickable(searchbuttonintasks));
	   
	    try {
	    	searchbuttonintasksTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", searchbuttonintasksTab);
	    }
	    System.out.println("Search button clicked successfully");
	}
	
	
	//------------------------------------Add Panel Functionality------------------------------------------------
	
	
	public boolean clickintotheaddnewpanelbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for setting button
	    List<WebElement> addnewpanelbuttonTab = driver.findElements(addnewpanelbutton);

	    if (addnewpanelbuttonTab.isEmpty()) {
	        // Add Panel button NOT present → stop scenario
	        return false;
	    }

	    WebElement addnewpanelbuttonTabs = addnewpanelbuttonTab.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(addnewpanelbuttonTabs));
	    addnewpanelbuttonTabs.click();

	    return true;
	}
	
	public void entertheboardpanelname(String BoardPanel) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    WebElement BoardPanelField = wait.until(
	            ExpectedConditions.elementToBeClickable(boardpaneltextbox));

	    // Extra safety for animation/overlay
	    wait.until(driver -> BoardPanelField.isDisplayed()
	            && BoardPanelField.isEnabled());

	    BoardPanelField.click();
	    BoardPanelField.clear();
	    BoardPanelField.sendKeys(BoardPanel);

	    System.out.println("Board Panel entered: " + BoardPanel);
	}
	
	public void removetheboardpanelname() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    WebElement BoardPanelField = wait.until(
	            ExpectedConditions.elementToBeClickable(boardpaneltextbox));

	    // Extra safety for animation/overlay
	    wait.until(driver -> BoardPanelField.isDisplayed()
	            && BoardPanelField.isEnabled());

	    BoardPanelField.click();
	    BoardPanelField.clear();
	   
	    System.out.println("Remove the existing board panel name");
	}
	
	public String clickintothesubmitbuttoninaddboardpanel() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(submitbuttoninaddboardpanel)).click();
	   
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
		return "New Board Panel added successsfully";
	}
	
	
	//-------------------------------------------Edit Panel Functionality------------------------------------------------
	
	
	public boolean clickintothefirsteditboardpanelbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for setting button
	    List<WebElement> editButtons = driver.findElements(firsteditboardpanelbutton);

	    if (editButtons.isEmpty()) {
	        // Edit button NOT present → stop scenario
	        return false;
	    }

	    WebElement editButton = editButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(editButton));
	    editButton.click();

	    return true;
	}
	
	
	//-----------------------------------------Delete Panel Functionality---------------------------------------------
	
	
	public boolean clickintothefirstdeleteboardpanelbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for setting button
	    List<WebElement> deleteButtons = driver.findElements(firstdeleteboardpanelbutton);

	    if (deleteButtons.isEmpty()) {
	        // Setting button NOT present → stop scenario
	        return false;
	    }

	    WebElement deleteButton = deleteButtons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(deleteButton));
	    deleteButton.click();

	    return true;
	}
	
	public void clickintotheconfirmdeleteboardpanelbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement confirmdeletebuttonTab = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletebutton));
	   
	    try {
	    	confirmdeletebuttonTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", confirmdeletebuttonTab);
	    }
	    System.out.println("Confirm button clicked successfully");
	}
	
	
	//---------------------------------------Add Task Functionality----------------------------------------------
	
	
	public boolean clickintotheAddCardinToDobutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for add card button
	    List<WebElement> addcardbuttons = driver.findElements(addcardtabinToDo);

	    if (addcardbuttons.isEmpty()) {
	        // Add Card button NOT present → stop scenario
	        return false;
	    }

	    WebElement addcardbutton = addcardbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(addcardbutton));
	    addcardbutton.click();

	    return true;
	}
	
	public void enterthefirstaddcard(String AddaCard) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    WebElement AddaCardlField = wait.until(
	            ExpectedConditions.elementToBeClickable(firstaddcardtextarea));

	    // Extra safety for animation/overlay
	    wait.until(driver -> AddaCardlField.isDisplayed()
	            && AddaCardlField.isEnabled());

	    AddaCardlField.click();
	    AddaCardlField.clear();
	    AddaCardlField.sendKeys(AddaCard);

	    System.out.println("First Add a Card text area entered: " + AddaCard);
	}
	
	public String clickintotheAddCardbuttoninpanel() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(addcardbutton)).click();
	   
	    System.out.println("Add Card button clicked successfully");
	    
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
		return "New Card added successsfully";
	}
	
	public enum TaskTabStatus {
	    CLICKED,
	    NOT_PRESENT,
	    NOT_CLICKABLE
	}
	
	public TaskTabStatus clickintothefirsttasktab() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[contains(@class,'preloader')]")
	    ));

	    List<WebElement> tabs = driver.findElements(firsttasktab);

	    if (tabs.isEmpty()) {
	        return TaskTabStatus.NOT_PRESENT;
	    }

	    WebElement tab = tabs.get(0);

	    try {
	        // Click the task
	        tab.click();

	        // ✅ CRITICAL CHECK: Did edit popup open?
	        WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(3));

	        shortWait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//div[@id='addEditBoardModal']//div[@class='modal-body']")));

	        // Popup opened → permission exists
	        return TaskTabStatus.CLICKED;

	    } catch (TimeoutException e) {
	        // Click worked but popup didn't open → NO permission
	        return TaskTabStatus.NOT_CLICKABLE;

	    } catch (Exception e) {
	        return TaskTabStatus.NOT_CLICKABLE;
	    }
	}
	
	public void selectthestartdate() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ProjectModuleFunctionalityPage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement startdateinedittaskTab = wait.until(ExpectedConditions.elementToBeClickable(startdateinedittask));

        try {
        	startdateinedittaskTab.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", startdateinedittaskTab);
        }

        System.out.println("Select Start Date tab clicked successfully");
	}
	
	public void selecttheenddate() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in ProjectModuleFunctionalityPage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement enddateinedittaskTab = wait.until(ExpectedConditions.elementToBeClickable(enddateinedittask));

        try {
        	enddateinedittaskTab.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", enddateinedittaskTab);
        }

        System.out.println("Select End Date tab clicked successfully");
	}
	
	public void clickintothememberstabinedittask() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement memberstabinedittaskTab = wait.until(ExpectedConditions.elementToBeClickable(memberstabinedittask));
	   
	    try {
	    	memberstabinedittaskTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", memberstabinedittaskTab);
	    }
	    System.out.println("Members tab clicked successfully");
	}
	
	public boolean selecttheusersfrommembers(int index) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    // 1️⃣ Click the dropdown button
	    WebElement dropdownButton = wait.until(
	        ExpectedConditions.elementToBeClickable(By.id("assignEmployee"))
	    );
	    dropdownButton.click();

	    // 2️⃣ Get all user options
	    List<WebElement> users = wait.until(
	        ExpectedConditions.visibilityOfAllElementsLocatedBy(
	            By.xpath("//div[@class='dropdown-menu assign-dropdown show']")
	        )
	    );

	    int optionCount = users.size();

	    if (index < optionCount) {
	        users.get(index).click();
	        System.out.println("User selected using index: " + index);
	        return true;
	    } else {
	        System.out.println(
	            "Index " + index + " is NOT present. Total users: " + optionCount
	        );
	        return false;
	    }
	}
	
	
	//------------------------------Edit Task Functionality---------------------------------
	
	
	public void clickintotheprioritytabinedittask() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement prioritytabinedittaskTab = wait.until(ExpectedConditions.elementToBeClickable(prioritytabinedittask));
	   
	    try {
	    	prioritytabinedittaskTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", prioritytabinedittaskTab);
	    }
	    System.out.println("Priority tab clicked successfully");
	}
	
	public void clickintothecriticalprioritytabinedittask() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement criticalpriorityTab = wait.until(ExpectedConditions.elementToBeClickable(criticalpriority));
	   
	    try {
	    	criticalpriorityTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", criticalpriorityTab);
	    }
	    System.out.println("Critical Priority tab clicked successfully");
	}
	
	
	//---------------------------------------------Mark Complete Functionality-----------------------------------------
	
	
	public boolean clickintothemarkcompletetabinedittask() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for setting button
	    List<WebElement> markcompletebuttons = driver.findElements(markcompleteinedittask);

	    if (markcompletebuttons.isEmpty()) {
	        // Add Card button NOT present → stop scenario
	        return false;
	    }

	    WebElement markcompletebutton = markcompletebuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(markcompletebutton));
	    markcompletebutton.click();

	    return true;
	}
	
	public void enterthetaskdetails(String TaskDetails) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		    // 1️⃣ Wait for preloader to disappear
		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		// 2️⃣ Locate editor
		    WebElement editor = wait.until(ExpectedConditions.visibilityOfElementLocated(
		            taskdetailstextbox
		    ));

		    JavascriptExecutor js = (JavascriptExecutor) driver;

		    // 3️⃣ Focus editor
		    js.executeScript("arguments[0].focus();", editor);

		    // 4️⃣ Clear existing content correctly
		    js.executeScript("arguments[0].innerText = '';", editor);

		    // 5️⃣ Insert text as user input
		    js.executeScript(
		        "arguments[0].dispatchEvent(new Event('input', { bubbles: true }));",
		        editor
		    );

		    editor.sendKeys(TaskDetails);

		    System.out.println("Task Details entered successfully");
	}
	
	
	//-----------------------------------------Add Comments Functionality----------------------------------
	
	
	public boolean enterthecommentsinedittask(String Comments) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait until the textbox is present
	    WebElement CommentsField = wait.until(
	            ExpectedConditions.presenceOfElementLocated(commentstextbox));

	    // Check if textbox is enabled
	    if (!CommentsField.isEnabled()) {
	        System.out.println("⚠ User doesn't have permission to enter comments");
	        
	        return false; // textbox disabled → indicate no permission
	    }

	    // Wait until clickable and visible
	    wait.until(ExpectedConditions.elementToBeClickable(CommentsField));
	    wait.until(driver -> CommentsField.isDisplayed());

	    // Enter comments
	    CommentsField.click();
	    CommentsField.clear();
	    CommentsField.sendKeys(Comments);

	    System.out.println("✅ Comments text area entered: " + Comments);
	    

	    return true; // successfully entered comments
	}
	
	public boolean clickintotheaddcommenttabinedittask() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for setting button
	    List<WebElement> addcommentinedittasktabs = driver.findElements(addcommentinedittask);

	    if (addcommentinedittasktabs.isEmpty()) {
	        // Setting button NOT present → stop scenario
	        return false;
	    }

	    WebElement addcommentinedittasktabs1 = addcommentinedittasktabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(addcommentinedittasktabs1));
	    addcommentinedittasktabs1.click();

	    return true;
	}
	
	
	//-----------------------------------Delete Task Functionality----------------------------------------
	
	
	public boolean clickintothedeletetabinedittask() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for setting button
	    List<WebElement> deletetasktabs = driver.findElements(deletetaskbutton);

	    if (deletetasktabs.isEmpty()) {
	        // Delete button NOT present → stop scenario
	        return false;
	    }

	    WebElement deletetasktab = deletetasktabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(deletetasktab));
	    deletetasktab.click();

	    return true;
	}
		
	public void clickintothedeletecardtabinedittask() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement deletetaskbuttonTab = wait.until(ExpectedConditions.elementToBeClickable(deletecardbutton));
	   
	    try {
	    	deletetaskbuttonTab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", deletetaskbuttonTab);
	    }
	    System.out.println("Delete Card tab clicked successfully");
	}
	
	public void performthetaskdelete() {
		clickintothedeletetabinedittask();
		clickintothedeletecardtabinedittask();
	}
	
	public String clickintothesubmitbuttoninedittask() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(submitbuttoninedittask)).click();
	   
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
		return "Task details are added successsfully";
	}
}
