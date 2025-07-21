
// Create Profile: Organization : Administrator

package com.pharmcrm.pharmcrm_product;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
import java.util.List;

public class UsermanagementTest1 {

	WebDriver driver;
	WebDriverWait wait;
	String createdEmail = "testuser7_static@mailinator.com";
	String baseUrl = "http://qa01.pharmcrm.com";

	@Test
	public void testFullUserProfileFlow() throws InterruptedException {
		driver = DriverFactory.createDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// Login
		driver.get(baseUrl);
		waitAndSendKeys(By.id("UserName"), "support@pharmcrm.com");
		waitAndSendKeys(By.id("Password"), "Admin@1234");
		clickWhenClickable(By.xpath("//button[@id='btnSubmit']//i[@class='fa fa-check']"));

		// Navigate to Users > New User
		clickWhenClickable(By.xpath("//a[@href='#']//span[@class='userTopIcon']//*[name()='svg']"));
		clickWhenClickable(By.xpath("//a[@id='liUsers']//span[@class='userTopIcon']//*[name()='svg']"));
		clickWhenClickable(By.xpath("//span[normalize-space()='New User']"));

		// Fill New User Form
		selectDropdownByIndexWhenReady(By.id("TenantRoleId"), 1);
		waitAndSendKeys(By.id("User_EmailId"), createdEmail);
		waitAndSendKeys(By.id("User_FirstName"), "John");
		waitAndSendKeys(By.id("User_LastName"), "Doe");
		waitAndSendKeys(By.id("User_Zone"), "500");
		waitAndSendKeys(By.id("User_PhoneNumber"), "1234567890");
		waitAndSendKeys(By.id("User_MailingAddress_Street"), "123 Main St");
		waitAndSendKeys(By.id("User_MailingAddress_City"), "Los Angeles");
		waitAndSendKeys(By.id("User_MailingAddress_State"), "California");
		waitAndSendKeys(By.id("User_MailingAddress_ZipCode"), "90001");
		waitAndSendKeys(By.id("User_MailingAddress_Country"), "USA");
		clickWhenClickable(By.xpath("//label[@for='User_MobileAccess_IsMobileUser']"));
		clickWhenClickable(By.xpath("//label[@for='User_MobileAccess_SalesAccess']"));
		clickWhenClickable(By.xpath("//label[@for='User_MobileAccess_DeliveryAccess']"));
		clickWhenClickable(By.id("btnSave"));
		sleep(3000);

		// Create Profile: Organization : Administrator
		driver.get(baseUrl + "/Setup/Home/Profiles");
		sleep(1000);
		clickWhenClickable(By.xpath("//span[normalize-space()='New Profile']"));
		selectDropdownByIndexWhenReady(By.id("ddProfileType"), 1);
		selectDropdownByIndexWhenReady(By.id("ddProfile"), 1);
		Select profileDropdown = new Select(driver.findElement(By.id("ddProfile")));
		String profileText = profileDropdown.getFirstSelectedOption().getText().trim();
		String emailPrefix = createdEmail.split("@")[0];
		emailPrefix = emailPrefix.replace("_static", "");
		String shortProfile = profileText.split("\\s+")[0].replaceAll("[\\[\\]]", "");
		String profileName = shortProfile + "_Administrator_" + emailPrefix;
		System.out.println("Final Profile Name: " + profileName);
		waitAndSendKeys(By.id("profilename"), profileName);
		clickWhenClickable(By.id("btnSaveProfile"));
		By setupModuleCheckbox = By.xpath("//label[normalize-space()='Setup Module']");
		clickWhenClickable(setupModuleCheckbox);
		sleep(2000);
		clickWhenClickable(setupModuleCheckbox);
		clickWhenClickable(By.id("btnSave"));
		sleep(3000);

		// Assign Workspace to User
		driver.get(baseUrl + "/Setup/Home/WorkspaceUsers");
		clickWhenClickable(By.xpath("//a[@id='liUsers']//span[@class='sidebar-icons']//*[name()='svg']"));
		clickWhenClickable(By.xpath("//span[normalize-space()='New User']"));
		WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUserSearch")));
		searchBox.clear();
		searchBox.sendKeys(createdEmail);
		System.out.println("Entered email in search box: " + createdEmail);
		sleep(5000);
		waitForDropdownItemsToLoad();
		List<WebElement> freshDropdownItems = driver
				.findElements(By.xpath("//a[@class='list-group-item list-group-item-action']"));
		System.out.println("Dropdown result count: " + freshDropdownItems.size());
		for (WebElement item : freshDropdownItems) {
			System.out.println("Dropdown item: " + item.getText());
		}

		By firstDropdownItem = By.xpath("(//a[@class='list-group-item list-group-item-action'])[1]");
		wait.until(ExpectedConditions.elementToBeClickable(firstDropdownItem));
		driver.findElement(firstDropdownItem).click();
		selectDropdownByVisibleTextWhenReady(By.id("WorkspaceUser_Profile_Id"), profileName);
		clickWhenClickable(By.id("btnSubmitUser"));

		// Workspace user ResetPassword
		sleep(5000);
		By workspacefilter = By.xpath("//span[normalize-space()='Filter']");
		wait.until(ExpectedConditions.elementToBeClickable(workspacefilter));
		driver.findElement(workspacefilter).click();
		waitAndSendKeys(By.id("Filter_Email"), createdEmail);
		clickWhenClickable(By.xpath("//i[@class='fa-solid fa-magnifying-glass']"));
		String email = createdEmail;
		By actionMenu = By.xpath("//tr[td[normalize-space()='" + email + "']]//td[@class='text-right']//button");
		clickWhenClickable(actionMenu);
		clickWhenClickable(By.xpath(
				"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Reset Password')]"));
		waitAndSendKeys(By.id("newPassword"), "Admin@123");
		waitAndSendKeys(By.id("confirmPassword"), "Admin@123");
		clickWhenClickable(By.xpath("//label[normalize-space()='Show Password']"));
		clickWhenClickable(By.id("btnResetPassword"));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='toast toast-success']")));
		sleep(500);
		WebElement initialsBtn = driver.findElement(By.cssSelector("button[id='userInitials'] span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", initialsBtn);
		clickWhenClickable(By.id("LogoutID"));

		// Workspace user login
		sleep(500);
		waitAndSendKeys(By.id("UserName"), createdEmail);
		waitAndSendKeys(By.id("Password"), "Admin@123");
		clickWhenClickable(By.id("btnSubmit"));
		waitAndSendKeys(By.id("OldPassword"), "Admin@123");
		waitAndSendKeys(By.id("NewPassword"), "Admin@1234");
		waitAndSendKeys(By.id("ConfirmNewPassword"), "Admin@1234");
		clickWhenClickable(By.id("btnSubmit"));
		waitAndSendKeys(By.id("UserName"), createdEmail);
		waitAndSendKeys(By.id("Password"), "Admin@1234");
		clickWhenClickable(By.id("btnSubmit"));
		driver.get(baseUrl + "/Setup/Home/Dashboard");
		List<WebElement> sidebarIcons = driver.findElements(By.xpath("//span[@class='sidebar-icons']"));
		if (sidebarIcons.isEmpty()) {
			System.out.println("Sidebar icons are NOT present on the page.");
		} else {
			System.out.println("Sidebar icons found: " + sidebarIcons.size());
		}
		driver.get(baseUrl + "/Setup/Home/WorkspaceUsers");
		sleep(2000);
		List<WebElement> errorHeaders = driver.findElements(By.xpath("//h2[normalize-space()='Error']"));
		if (!errorHeaders.isEmpty()) {
			System.out.println("Error is showing for >> Error: Don't have proper access to requested page");
		} else {
			System.out.println("No error. Page loaded successfully.");
		}

	}

	// ==== Utility Methods ====
	private void waitAndSendKeys(By locator, String value) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		element.clear();
		element.sendKeys(value);
	}

	private void clickWhenClickable(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}

	private void selectDropdownByIndexWhenReady(By locator, int index) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		Select dropdown = new Select(dropdownElement);
		waitUntilDropdownHasOptions(dropdown);
		dropdown.selectByIndex(index);
	}

	private void waitUntilDropdownHasOptions(Select dropdown) {
		for (int i = 0; i < 10; i++) {
			List<WebElement> options = dropdown.getOptions();
			if (options.size() > 1)
				return;
			sleep(1000);
		}
		throw new TimeoutException("Dropdown options not loaded in time.");
	}

	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	private void waitForDropdownItemsToLoad() {
		wait.until(ExpectedConditions
				.numberOfElementsToBeMoreThan(By.xpath("//a[@class='list-group-item list-group-item-action']"), 0));
	}

	public void selectDropdownByVisibleTextWhenReady(By locator, String visibleText) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(locator));
		Select select = new Select(dropdown);
		select.selectByVisibleText(visibleText);
	}

}
