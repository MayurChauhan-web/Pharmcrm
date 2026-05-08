package com.pharmcrm_CoreModule.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoreModuleFunctionalityPage {
	WebDriver driver;
	
	//By Locators
	private By profileicontabindashboard = By.xpath("(//li[@class='userInitials-main'])[1]");
	private By changepasswordtabinprofileicon = By.xpath("(//a[normalize-space()='Change Password'])[1]");
	private By currentpasswordtextbox = By.xpath("(//input[@id='OldPassword'])[1]");
	private By newpasswordtextbox = By.xpath("(//input[@id='NewPassword'])[1]");
	private By confirmnewpasswordtextbox = By.xpath("(//input[@id='ConfirmNewPassword'])[1]");
	private By submitbuttoninchangepassword = By.xpath("(//button[@class='btn btn-primary waves-effect waves-light'][normalize-space()='Submit'])[1]");
	private By manageprofiletabinprofileicon = By.xpath("(//a[normalize-space()='Manage Profile'])[1]");
	private By lastnametextboxinprofiledetails = By.xpath("(//input[@id='User_LastName'])[1]");
	private By firstnametextboxinprofiledetails = By.xpath("(//input[@id='User_FirstName'])[1]");
	private By streettextboxinaddressdetails = By.xpath("(//input[@id='User_MailingAddress_Street'])[1]");
	private By citytextboxinaddressdetails = By.xpath("(//input[@id='User_MailingAddress_City'])[1]");
	private By statetextboxinaddressdetails = By.xpath("(//input[@id='User_MailingAddress_State'])[1]");
	private By zipcodetextboxinaddressdetails = By.xpath("(//input[@id='User_MailingAddress_ZipCode'])[1]");
	private By countrytextboxinaddressdetails = By.xpath("(//input[@id='User_MailingAddress_Country'])[1]");
	private By clearsignaturebuttoninmyprofile = By.xpath("(//button[normalize-space()='Clear Signature'])[1]");
	private By signaturedrawarea = By.xpath("//canvas[@id='signature-pad']");
	private By updatebuttoninmyprofile = By.xpath("(//button[normalize-space()='Update'])[1]");
	private By calendersettingstabinprofileicon = By.xpath("(//a[normalize-space()='Calendar Settings'])[1]");
	private By resettocompanysettingtab = By.xpath("(//button[normalize-space()='Reset to company setting'])[1]");
	private By timezonedropdownbutton = By.xpath("(//select[@id='User_TimeZone'])[1]");
	private By submitbuttonincalendarsetting = By.xpath("(//button[@class='btn btn-primary waves-effect waves-light'][normalize-space()='Submit'])[1]");
	
	
	
	
	
	public CoreModuleFunctionalityPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickintotheProfileIcontab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement profileicontab = wait.until(ExpectedConditions.elementToBeClickable(profileicontabindashboard));
	   
	    try {
	    	profileicontab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", profileicontab);
	    }

	    System.out.println("Profile icon tab clicked successfully");
	}
	
	
	//---------------------------------Change Password Section----------------------------------
	
	
	public void clickintotheChangePasswordtab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement changepasswordtab = wait.until(ExpectedConditions.elementToBeClickable(changepasswordtabinprofileicon ));
	   
	    try {
	    	changepasswordtab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", changepasswordtab );
	    }

	    System.out.println("Change Password tab clicked successfully");
	}
	
	public void entertheCurrentPassword(String CurrentPassword) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement CurrentPasswordtextboxfield = wait.until(ExpectedConditions.elementToBeClickable(currentpasswordtextbox));

	    // Extra safety for animation/overlay
	    wait.until(driver -> CurrentPasswordtextboxfield.isDisplayed()
	            && CurrentPasswordtextboxfield.isEnabled());

	    CurrentPasswordtextboxfield.click();
	    CurrentPasswordtextboxfield.clear();
	    CurrentPasswordtextboxfield.sendKeys(CurrentPassword);

	    System.out.println("Current Password entered: " + CurrentPassword);
    }
	
	public void entertheNewPassword(String NewPassword) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement NewPasswordtextboxfield = wait.until(ExpectedConditions.elementToBeClickable(newpasswordtextbox));

	    // Extra safety for animation/overlay
	    wait.until(driver -> NewPasswordtextboxfield.isDisplayed()
	            && NewPasswordtextboxfield.isEnabled());

	    NewPasswordtextboxfield.click();
	    NewPasswordtextboxfield.clear();
	    NewPasswordtextboxfield.sendKeys(NewPassword);

	    System.out.println("New Password entered: " + NewPassword);
    }
	
	public void entertheConfirmNewPassword(String ConfirmNewPassword) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ConfirmNewPasswordtextboxfield = wait.until(ExpectedConditions.elementToBeClickable(confirmnewpasswordtextbox));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ConfirmNewPasswordtextboxfield.isDisplayed()
	            && ConfirmNewPasswordtextboxfield.isEnabled());

	    ConfirmNewPasswordtextboxfield.click();
	    ConfirmNewPasswordtextboxfield.clear();
	    ConfirmNewPasswordtextboxfield.sendKeys(ConfirmNewPassword);

	    System.out.println("Confirm New Password entered: " + ConfirmNewPassword);
    }
	
	public String clickintothesubmitbuttoninChangePassword() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninchangepassword));

	    // Click button
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Submit button clicked");
	    } catch (ElementClickInterceptedException e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Clicked using JS");
	    }

	    // ===============================
	    // TOAST HANDLING STARTS HERE
	    // ===============================

	    List<String> errorMessages = new ArrayList<>();
	    List<String> successMessages = new ArrayList<>();

	    // Robust locators (covers multiple UI frameworks)
	    By errorToast = By.xpath(
	        "//div[contains(@class,'toast') and (contains(@class,'error') or contains(@class,'danger'))]" +
	        "//div[contains(@class,'toast-message') or contains(@class,'message')]");

	    By successToast = By.xpath(
	        "//div[contains(@class,'toast') and contains(@class,'success')]" +
	        "//div[contains(@class,'toast-message') or contains(@class,'message')]");

	    try {
	        // WAIT until any toast appears
	        wait.until(ExpectedConditions.or(
	                ExpectedConditions.visibilityOfElementLocated(errorToast),
	                ExpectedConditions.visibilityOfElementLocated(successToast)));
	    } catch (TimeoutException e) {
	        System.out.println("No toast appeared");
	    }

	    // Capture ERROR (RED)
	    List<WebElement> errorToasts = driver.findElements(errorToast);

	    for (WebElement e : errorToasts) {
	        String msg = e.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // Capture SUCCESS (GREEN)
	    List<WebElement> successToasts = driver.findElements(successToast);

	    for (WebElement e : successToasts) {
	        String msg = e.getText().trim();
	        if (!msg.isEmpty()) {
	            successMessages.add(msg);
	        }
	    }

	    // FIELD LEVEL ERRORS (fallback)
	    List<WebElement> fieldErrors = driver.findElements(
	            By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement e : fieldErrors) {
	        String msg = e.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // ===============================
	    // FINAL DECISION
	    // ===============================

	    if (!errorMessages.isEmpty()) {
	        return "ERROR: " + String.join(" | ", errorMessages);
	    }

	    if (!successMessages.isEmpty()) {
	        return "SUCCESS: " + String.join(" | ", successMessages);
	    }

	    return "NO MESSAGE";
	}
	
	public void clickintotheManageProfiletab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement manageprofiletab = wait.until(ExpectedConditions.elementToBeClickable(manageprofiletabinprofileicon));
	   
	    try {
	    	manageprofiletab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", manageprofiletab);
	    }

	    System.out.println("Manage Profile tab clicked successfully");
	}
	
	public void entertheLastNameinProfileDetails(String LastName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement LastNametextboxfield = wait.until(ExpectedConditions.elementToBeClickable(lastnametextboxinprofiledetails));

	    // Extra safety for animation/overlay
	    wait.until(driver -> LastNametextboxfield.isDisplayed()
	            && LastNametextboxfield.isEnabled());

	    LastNametextboxfield.click();
	    LastNametextboxfield.clear();
	    LastNametextboxfield.sendKeys(LastName);

	    System.out.println("Last Name entered: " + LastName);
    }
	
	public void removetheLastNameinProfileDetails() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement LastNametextboxfield = wait.until(ExpectedConditions.elementToBeClickable(lastnametextboxinprofiledetails));

	    // Extra safety for animation/overlay
	    wait.until(driver -> LastNametextboxfield.isDisplayed()
	            && LastNametextboxfield.isEnabled());

	    LastNametextboxfield.click();
	    LastNametextboxfield.clear();
	}
	
	public void entertheFirstNameinProfileDetails(String FirstName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement FirstNametextboxfield = wait.until(ExpectedConditions.elementToBeClickable(firstnametextboxinprofiledetails));

	    // Extra safety for animation/overlay
	    wait.until(driver -> FirstNametextboxfield.isDisplayed()
	            && FirstNametextboxfield.isEnabled());

	    FirstNametextboxfield.click();
	    FirstNametextboxfield.clear();
	    FirstNametextboxfield.sendKeys(FirstName);

	    System.out.println("First Name entered: " + FirstName);
    }
	
	public void removetheFirstNameinProfileDetails() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement FirstNametextboxfield = wait.until(ExpectedConditions.elementToBeClickable(firstnametextboxinprofiledetails));

	    // Extra safety for animation/overlay
	    wait.until(driver -> FirstNametextboxfield.isDisplayed()
	            && FirstNametextboxfield.isEnabled());

	    FirstNametextboxfield.click();
	    FirstNametextboxfield.clear();
	}
	
	public void entertheStreetinAddressDetails(String Street) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement Streettextboxfield = wait.until(ExpectedConditions.elementToBeClickable(streettextboxinaddressdetails));

	    // Extra safety for animation/overlay
	    wait.until(driver -> Streettextboxfield.isDisplayed()
	            && Streettextboxfield.isEnabled());

	    Streettextboxfield.click();
	    Streettextboxfield.clear();
	    Streettextboxfield.sendKeys(Street);

	    System.out.println("Street entered: " + Street);
    }
	
	public void removetheStreetinAddressDetails() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement Streettextboxfield = wait.until(ExpectedConditions.elementToBeClickable(streettextboxinaddressdetails));

	    // Extra safety for animation/overlay
	    wait.until(driver -> Streettextboxfield.isDisplayed()
	            && Streettextboxfield.isEnabled());

	    Streettextboxfield.click();
	    Streettextboxfield.clear();
	}
	
	public void entertheCityinAddressDetails(String City) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement Citytextboxfield = wait.until(ExpectedConditions.elementToBeClickable(citytextboxinaddressdetails));

	    // Extra safety for animation/overlay
	    wait.until(driver -> Citytextboxfield.isDisplayed()
	            && Citytextboxfield.isEnabled());

	    Citytextboxfield.click();
	    Citytextboxfield.clear();
	    Citytextboxfield.sendKeys(City);

	    System.out.println("City entered: " + City);
    }
	
	public void removetheCityinAddressDetails() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement Citytextboxfield = wait.until(ExpectedConditions.elementToBeClickable(citytextboxinaddressdetails));

	    // Extra safety for animation/overlay
	    wait.until(driver -> Citytextboxfield.isDisplayed()
	            && Citytextboxfield.isEnabled());

	    Citytextboxfield.click();
	    Citytextboxfield.clear();
	}
	
	public void entertheStateinAddressDetails(String State) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement Statetextboxfield = wait.until(ExpectedConditions.elementToBeClickable(statetextboxinaddressdetails));

	    // Extra safety for animation/overlay
	    wait.until(driver -> Statetextboxfield.isDisplayed()
	            && Statetextboxfield.isEnabled());

	    Statetextboxfield.click();
	    Statetextboxfield.clear();
	    Statetextboxfield.sendKeys(State);

	    System.out.println("State entered: " + State);
    }
	
	public void removetheStateinAddressDetails() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement Statetextboxfield = wait.until(ExpectedConditions.elementToBeClickable(statetextboxinaddressdetails));

	    // Extra safety for animation/overlay
	    wait.until(driver -> Statetextboxfield.isDisplayed()
	            && Statetextboxfield.isEnabled());

	    Statetextboxfield.click();
	    Statetextboxfield.clear();
	}
	
	public void entertheZipCodeinAddressDetails(String ZipCode) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ZipCodetextboxfield = wait.until(ExpectedConditions.elementToBeClickable(zipcodetextboxinaddressdetails));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ZipCodetextboxfield.isDisplayed()
	            && ZipCodetextboxfield.isEnabled());

	    ZipCodetextboxfield.click();
	    ZipCodetextboxfield.clear();
	    ZipCodetextboxfield.sendKeys(ZipCode);

	    System.out.println("Zip Code entered: " + ZipCode);
    }
	
	public void removetheZipCodeinAddressDetails() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ZipCodetextboxfield = wait.until(ExpectedConditions.elementToBeClickable(zipcodetextboxinaddressdetails));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ZipCodetextboxfield.isDisplayed()
	            && ZipCodetextboxfield.isEnabled());

	    ZipCodetextboxfield.click();
	    ZipCodetextboxfield.clear();
	}
	
	public void entertheCountryinAddressDetails(String Country) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement Countrytextboxfield = wait.until(ExpectedConditions.elementToBeClickable(countrytextboxinaddressdetails));

	    // Extra safety for animation/overlay
	    wait.until(driver -> Countrytextboxfield.isDisplayed()
	            && Countrytextboxfield.isEnabled());

	    Countrytextboxfield.click();
	    Countrytextboxfield.clear();
	    Countrytextboxfield.sendKeys(Country);

	    System.out.println("Country entered: " + Country);
    }
	
	public void removetheCountryinAddressDetails() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement Countrytextboxfield = wait.until(ExpectedConditions.elementToBeClickable(countrytextboxinaddressdetails));

	    // Extra safety for animation/overlay
	    wait.until(driver -> Countrytextboxfield.isDisplayed()
	            && Countrytextboxfield.isEnabled());

	    Countrytextboxfield.click();
	    Countrytextboxfield.clear();
	}
	
	public void clickintotheClearSignaturebuttoninMyProfile() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement clearsignaturebutton = wait.until(ExpectedConditions.elementToBeClickable(clearsignaturebuttoninmyprofile));
	   
	    try {
	    	clearsignaturebutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", clearsignaturebutton);
	    }

	    System.out.println("Clear Signature button clicked successfully");
	}
	
	public void drawsignature() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Wait until canvas visible
        WebElement canvas = wait.until(
                ExpectedConditions.visibilityOfElementLocated(signaturedrawarea));

        // Scroll to canvas
        js.executeScript("arguments[0].scrollIntoView({block:'center'});", canvas);

        Thread.sleep(1000);

        // Debug size
        System.out.println("Canvas Width  : " + canvas.getSize().width);
        System.out.println("Canvas Height : " + canvas.getSize().height);

        // Create Actions class
        Actions action = new Actions(driver);

        // Draw signature
        action.moveToElement(canvas, 20, 20)
                .clickAndHold()
                .pause(Duration.ofMillis(300))

                .moveByOffset(50, 10)
                .pause(Duration.ofMillis(100))

                .moveByOffset(30, -20)
                .pause(Duration.ofMillis(100))

                .moveByOffset(40, 15)
                .pause(Duration.ofMillis(100))

                .moveByOffset(20, -10)
                .pause(Duration.ofMillis(100))

                .moveByOffset(35, 20)
                .pause(Duration.ofMillis(100))

                .moveByOffset(25, -15)
                .pause(Duration.ofMillis(100))

                .moveByOffset(30, 10)
                .pause(Duration.ofMillis(100))

                .release()
                .build()
                .perform();

        Thread.sleep(2000);

        System.out.println("Signature drawn successfully.");
    }

    // ---------------------------------------------------
    // VERIFY SIGNATURE DRAWN
    // ---------------------------------------------------
    public boolean verifySignatureDrawn() {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement canvas = driver.findElement(signaturedrawarea);

        Boolean isSigned = (Boolean) js.executeScript(

                "var canvas = arguments[0];" +
                "var blank = document.createElement('canvas');" +
                "blank.width = canvas.width;" +
                "blank.height = canvas.height;" +
                "return canvas.toDataURL() !== blank.toDataURL();",

                canvas);

        System.out.println("Signature Present => " + isSigned);

        return isSigned;
    }
    
    public void performSignatureOperation() throws InterruptedException {

        // Draw Signature
        drawsignature();

        // Verify Signature
        boolean status = verifySignatureDrawn();

        if (status) {
            System.out.println("PASS : Signature successfully drawn.");
        } else {
            System.out.println("FAIL : Signature not drawn.");
        }
    }
    
    public String clickintotheUpdatebuttoninMyProfile() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(updatebuttoninmyprofile));

	    // Click button
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Update button clicked");
	    } catch (ElementClickInterceptedException e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Clicked using JS");
	    }

	    // ===============================
	    // TOAST HANDLING STARTS HERE
	    // ===============================

	    List<String> errorMessages = new ArrayList<>();
	    List<String> successMessages = new ArrayList<>();

	    // Robust locators (covers multiple UI frameworks)
	    By errorToast = By.xpath(
	        "//div[contains(@class,'toast') and (contains(@class,'error') or contains(@class,'danger'))]" +
	        "//div[contains(@class,'toast-message') or contains(@class,'message')]");

	    By successToast = By.xpath(
	        "//div[contains(@class,'toast') and contains(@class,'success')]" +
	        "//div[contains(@class,'toast-message') or contains(@class,'message')]");

	    try {
	        // WAIT until any toast appears
	        wait.until(ExpectedConditions.or(
	                ExpectedConditions.visibilityOfElementLocated(errorToast),
	                ExpectedConditions.visibilityOfElementLocated(successToast)));
	    } catch (TimeoutException e) {
	        System.out.println("No toast appeared");
	    }

	    // Capture ERROR (RED)
	    List<WebElement> errorToasts = driver.findElements(errorToast);

	    for (WebElement e : errorToasts) {
	        String msg = e.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // Capture SUCCESS (GREEN)
	    List<WebElement> successToasts = driver.findElements(successToast);

	    for (WebElement e : successToasts) {
	        String msg = e.getText().trim();
	        if (!msg.isEmpty()) {
	            successMessages.add(msg);
	        }
	    }

	    // FIELD LEVEL ERRORS (fallback)
	    List<WebElement> fieldErrors = driver.findElements(
	            By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement e : fieldErrors) {
	        String msg = e.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // ===============================
	    // FINAL DECISION
	    // ===============================

	    if (!errorMessages.isEmpty()) {
	        return "ERROR: " + String.join(" | ", errorMessages);
	    }

	    if (!successMessages.isEmpty()) {
	        return "SUCCESS: " + String.join(" | ", successMessages);
	    }

	    return "NO MESSAGE";
	}
    
    public void clickintotheCalenderSettingstab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement calendersettingstab = wait.until(ExpectedConditions.elementToBeClickable(calendersettingstabinprofileicon ));
	   
	    try {
	    	calendersettingstab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", calendersettingstab );
	    }

	    System.out.println("Calender Settings tab clicked successfully");
	}
    
    public void clickintotheResettocompanysettingtab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement resettocompanysettingbutton = wait.until(ExpectedConditions.elementToBeClickable(resettocompanysettingtab ));
	   
	    try {
	    	resettocompanysettingbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", resettocompanysettingbutton );
	    }

	    System.out.println("Reset to company setting tab clicked successfully");
	}
    
    public boolean selecttheTimeZone(String TimeZone) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {

            // Wait for dropdown
            WebElement timeZoneDropdown =
                    wait.until(ExpectedConditions.visibilityOfElementLocated(timezonedropdownbutton));

            Select select = new Select(timeZoneDropdown);

            // Check whether option exists
            boolean isPresent = select.getOptions()
                                      .stream()
                                      .anyMatch(option ->option.getText().trim().equalsIgnoreCase(TimeZone));

            // If value not present → skip scenario
            if (!isPresent) {
                System.out.println("Time Zone '" + TimeZone + "' not found — skipping scenario");
                return false;
            }

            // Select dropdown value
            select.selectByVisibleText(TimeZone);

            System.out.println("Time Zone selected: " + TimeZone);
            return true;

        } catch (Exception e) {

            System.out.println("Error while selecting Time Zone: " + e.getMessage());
            return false;
        }
    }
    
    public String clickintothesubmitbuttoninCalendarSettings() {

    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttonincalendarsetting));

	    // Click button
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Submit button clicked");
	    } catch (ElementClickInterceptedException e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Clicked using JS");
	    }

	    // ===============================
	    // TOAST HANDLING STARTS HERE
	    // ===============================

	    List<String> errorMessages = new ArrayList<>();
	    List<String> successMessages = new ArrayList<>();

	    // Robust locators (covers multiple UI frameworks)
	    By errorToast = By.xpath(
	        "//div[contains(@class,'toast') and (contains(@class,'error') or contains(@class,'danger'))]" +
	        "//div[contains(@class,'toast-message') or contains(@class,'message')]");

	    By successToast = By.xpath(
	        "//div[contains(@class,'toast') and contains(@class,'success')]" +
	        "//div[contains(@class,'toast-message') or contains(@class,'message')]");

	    try {
	        // WAIT until any toast appears
	        wait.until(ExpectedConditions.or(
	                ExpectedConditions.visibilityOfElementLocated(errorToast),
	                ExpectedConditions.visibilityOfElementLocated(successToast)));
	    } catch (TimeoutException e) {
	        System.out.println("No toast appeared");
	    }

	    // Capture ERROR (RED)
	    List<WebElement> errorToasts = driver.findElements(errorToast);

	    for (WebElement e : errorToasts) {
	        String msg = e.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // Capture SUCCESS (GREEN)
	    List<WebElement> successToasts = driver.findElements(successToast);

	    for (WebElement e : successToasts) {
	        String msg = e.getText().trim();
	        if (!msg.isEmpty()) {
	            successMessages.add(msg);
	        }
	    }

	    // FIELD LEVEL ERRORS (fallback)
	    List<WebElement> fieldErrors = driver.findElements(
	            By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement e : fieldErrors) {
	        String msg = e.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // ===============================
	    // FINAL DECISION
	    // ===============================

	    if (!errorMessages.isEmpty()) {
	        return "ERROR: " + String.join(" | ", errorMessages);
	    }

	    if (!successMessages.isEmpty()) {
	        return "SUCCESS: " + String.join(" | ", successMessages);
	    }

	    return "NO MESSAGE";
	}

}
