package com.pharmcrm_PatientPortal.pages;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PatientPortal_WellnessPage {
	WebDriver driver;
	
	//By Locators
	private By productstabinsidebar = By.xpath("//span[normalize-space()='Products']");
	private By searchtextboxinproducts = By.xpath("//input[@id='Filter_ProductName']");
	private By clearallbuttoninproducts = By.xpath("//p[normalize-space()='Clear All']");
	private By sortbydropdownbuttoninproducts = By.xpath("//select[@id='ddlSortBy']");
	private By producttabinproducts = By.xpath("(//a[@id='productMain'])[1]");
	private By addtocartbuttoninproductdetails = By.xpath("//button[@id='AddToCart']");
	private By gotocartbuttoninproductdetails = By.xpath("//button[@id='GoToCart']");
	private By proceedbuttoninproductcart = By.xpath("//button[normalize-space()='Proceed']");
	private By deleteproductbuttoninproductcart = By.xpath("(//button[@id='btnDeleteProduct'])[1]");
	private By confirmbuttonindeleteproduct = By.xpath("//button[@id='btnDeleteConfirm']");
	private By shoppingcarttabinproducts = By.xpath("//i[@class='fa-solid fa-cart-shopping']");
	private By orderhistorytabinsidebar = By.xpath("//span[normalize-space()='Order History']");
	private By viewyouritembuttoninorderhistory = By.xpath("(//button[@type='button'][normalize-space()='View your item'])[1]");
	private By vieworderdetailsbuttoninorderhistory = By.xpath("(//a[@class='view-order'][normalize-space()='View order details'])[1]");
	private By pointshistorytabinsidebar = By.xpath("//span[normalize-space()='Points History']");
	
	
	
	
	
	public PatientPortal_WellnessPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//-----------------------------Products Section--------------------------------------------------------
	
	
	public boolean clickintotheProductstabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for products tab
	    List<WebElement> productstabs = driver.findElements(productstabinsidebar);

	    if (productstabs.isEmpty()) {
	        // Products tab NOT present → stop scenario
	        return false;
	    }

	    WebElement productstab = productstabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(productstab));
	    productstab.click();

	    return true;
	}
	
	public void entertheproductsnameinsearechtextbox(String ProductName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement SearchtextboxField = wait.until(ExpectedConditions.elementToBeClickable(searchtextboxinproducts));

	    // Extra safety for animation/overlay
	    wait.until(driver -> SearchtextboxField.isDisplayed()
	            && SearchtextboxField.isEnabled());

	    SearchtextboxField.click();
	    SearchtextboxField.clear();
	    SearchtextboxField.sendKeys(ProductName, Keys.ENTER);

	    System.out.println("Products entered: " + ProductName);
    }
	
	public void clickintotheclearallbuttoninproducts() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement clearallbutton = wait.until(ExpectedConditions.elementToBeClickable(clearallbuttoninproducts));
	   
	    try {
	    	clearallbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", clearallbutton);
	    }

	    System.out.println("Clear All Button clicked successfully");
	}
	
	public void clickintotheSortBydropdownbuttoninproducts() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    WebElement sortbybutton = wait.until(ExpectedConditions.elementToBeClickable(sortbydropdownbuttoninproducts));

	    try {
	        sortbybutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", sortbybutton);
	    }
	    System.out.println("Sort By Dropdown Button clicked successfully");
	}
	
	public void selecttheAscendingOrder() {
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		   // Wait for dropdown <select> to be visible
		   WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ddlSortBy")));

		   // Use Select class
		   Select select = new Select(dropdown);
		   select.selectByVisibleText("Name : Ascending");

		   System.out.println("Ascending sort selected and dropdown closed.");
	}
	
	public void selecttheDescendingOrder() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		   // Wait for dropdown <select> to be visible
		   WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ddlSortBy")));

		   // Use Select class
		   Select select = new Select(dropdown);
		   select.selectByVisibleText("Name : Descending");

		   System.out.println("Name : Descending selected successfully.");
	}
	
	public void selectthePointsaslowtohighOrder() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		   // Wait for dropdown <select> to be visible
		   WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ddlSortBy")));

		   // Use Select class
		   Select select = new Select(dropdown);
		   select.selectByVisibleText("Points : low to high");

		   System.out.println("Points : low to high selected successfully.");
	}
	
	public void selectthePointsashightolowOrder() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		   // Wait for dropdown <select> to be visible
		   WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ddlSortBy")));

		   // Use Select class
		   Select select = new Select(dropdown);
		   select.selectByVisibleText("Points : high to low");

		   System.out.println("Points : high to low selected successfully.");
	}
	
	public boolean clickintotheFirstProducttab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for first product tab
	    List<WebElement> productstabs = driver.findElements(producttabinproducts);

	    if (productstabs.isEmpty()) {
	        // First Product tab NOT present → stop scenario
	        return false;
	    }

	    WebElement productstab = productstabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(productstab));
	    productstab.click();

	    return true;
	}
	
	public boolean clickintotheAddtoCartbuttoninproductdetails() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for add to cart button
	    List<WebElement> addtocartbutton = driver.findElements(addtocartbuttoninproductdetails);

	    if (addtocartbutton.isEmpty()) {
	        // Add to Cart button NOT present → stop scenario
	        return false;
	    }

	    WebElement addtocartbuttontab = addtocartbutton.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(addtocartbuttontab));
	    addtocartbuttontab.click();

	    return true;
	}
	
	public void clickintotheGotoCartbuttoninproductdetails() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement gotocartbutton = wait.until(ExpectedConditions.elementToBeClickable(gotocartbuttoninproductdetails));
	   
	    try {
	    	gotocartbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", gotocartbutton);
	    }
	    System.out.println("Go to Cart Button clicked successfully");
	}
	
	public String clickintotheproceedbuttoninproductcart() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(proceedbuttoninproductcart)).click();
	   
	    System.out.println("Proceed button clicked successfully");
	    
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
		return "Order is placed successsfully";
	}
	
	public void clickintothedeleteproductbuttoninproductcart() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement deletebutton = wait.until(ExpectedConditions.elementToBeClickable(deleteproductbuttoninproductcart));
	   
	    try {
	    	deletebutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", deletebutton);
	    }
	    System.out.println("Delete Button clicked successfully");
	}
	
	public void clickintotheconfirmbuttonindeleteproduct() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement confirmbutton = wait.until(ExpectedConditions.elementToBeClickable(confirmbuttonindeleteproduct));
	   
	    try {
	    	confirmbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", confirmbutton);
	    }
	    System.out.println("Confirm Button clicked successfully");
	}
	
	public void performtheProductdeletefunctionality() {
		clickintothedeleteproductbuttoninproductcart();
		clickintotheconfirmbuttonindeleteproduct();
	}
	
	public void clickintotheShoppingcarttabinproducts() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement carttab = wait.until(ExpectedConditions.elementToBeClickable(shoppingcarttabinproducts));
	   
	    try {
	    	carttab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", carttab);
	    }
	    System.out.println("Cart tab clicked successfully");
	}
	
	
	//----------------------------Order History Section--------------------------------------------------
	
	
	public boolean clickintotheOrderHistorytabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for order history tab
	    List<WebElement> orderhistorytabs = driver.findElements(orderhistorytabinsidebar);

	    if (orderhistorytabs.isEmpty()) {
	        // Order History tab NOT present → stop scenario
	        return false;
	    }

	    WebElement orderhistorytab = orderhistorytabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(orderhistorytab));
	    orderhistorytab.click();

	    return true;
	}
	
	public boolean clickintotheViewYourItembuttoninorderhistory() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Find "View Your Item" button WITHOUT wait
	    List<WebElement> viewYourItemButtons = driver.findElements(viewyouritembuttoninorderhistory);

	    if (viewYourItemButtons.isEmpty()) {

	        // Check and print "No Recent Orders Found" message
	        List<WebElement> noOrdersMessage = driver.findElements(By.xpath("//h1[normalize-space()='No Recent Orders Found']"));

	        if (!noOrdersMessage.isEmpty()) {
	            System.out.println("Message displayed: No Recent Orders Found");
	        } else {
	            System.out.println("View Your Item button not found, and no message displayed");
	        }

	        return false; // stop scenario / skip next steps
	    }

	    // Click View Your Item button
	    WebElement viewYourItemButton = viewYourItemButtons.get(0);
	    wait.until(ExpectedConditions.elementToBeClickable(viewYourItemButton));
	    viewYourItemButton.click();

	    return true;
	}
	
	public boolean clickintotheVieworderdetailsbuttoninorderhistory() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Find "View order details" button WITHOUT wait
	    List<WebElement> vieworderdetailsButtons = driver.findElements(vieworderdetailsbuttoninorderhistory);

	    if (vieworderdetailsButtons.isEmpty()) {

	        // Check and print "No Recent Orders Found" message
	        List<WebElement> noOrdersMessage = driver.findElements(By.xpath("//h1[normalize-space()='No Recent Orders Found']"));

	        if (!noOrdersMessage.isEmpty()) {
	            System.out.println("Message displayed: No Recent Orders Found");
	        } else {
	            System.out.println("View order details button not found, and no message displayed");
	        }

	        return false; // stop scenario / skip next steps
	    }

	    // Click View order details button
	    WebElement vieworderdetailsButton = vieworderdetailsButtons.get(0);
	    wait.until(ExpectedConditions.elementToBeClickable(vieworderdetailsButton));
	    vieworderdetailsButton.click();

	    return true;
	}
	
	
	//------------------------------------------Points History Section---------------------------------------
	
	
	public boolean clickintothePointsHistorytabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for points history tab
	    List<WebElement> pointshistorytabs = driver.findElements(pointshistorytabinsidebar);

	    if (pointshistorytabs.isEmpty()) {
	        // Points History tab NOT present → stop scenario
	        return false;
	    }

	    WebElement pointshistorytab = pointshistorytabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(pointshistorytab));
	    pointshistorytab.click();

	    return true;
	}
}
