package com.pharmcrm.pharmcrm_product;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class UsermanagementTest {

	WebDriver driver;
	WebDriverWait wait;
	String createdEmail = "testuser11_static@mailinator.com";

	@Test
	public void testFullUserProfileFlow() throws InterruptedException {
		driver = DriverFactory.createDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// Login
		driver.get("http://qa01.pharmcrm.com/");
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

		// Assign Workspace to User
		driver.get("https://qa01.pharmcrm.com/Setup/Home/WorkspaceUsers");
		clickWhenClickable(By.xpath("//a[@id='liUsers']//span[@class='sidebar-icons']//*[name()='svg']"));
		clickWhenClickable(By.xpath("//span[normalize-space()='New User']"));

		WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUserSearch")));
		searchBox.clear();
		searchBox.sendKeys(createdEmail);
		System.out.println("Entered email in search box: " + createdEmail);
		sleep(5000);

		List<WebElement> dropdownItems = driver
				.findElements(By.xpath("//a[@class='list-group-item list-group-item-action']"));
		System.out.println("Dropdown result count: " + dropdownItems.size());
		for (WebElement item : dropdownItems) {
			System.out.println("Dropdown item: " + item.getText());
		}

		waitForDropdownItemsToLoad();
		By firstDropdownItem = By.xpath("(//a[@class='list-group-item list-group-item-action'])[1]");
		wait.until(ExpectedConditions.elementToBeClickable(firstDropdownItem));
		driver.findElement(firstDropdownItem).click();
		selectDropdownByIndexWhenReady(By.id("WorkspaceUser_Profile_Id"), 1);
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
		waitAndSendKeys(By.id("UserName"), "testuser_static@mailinator.com");
		waitAndSendKeys(By.id("Password"), "Admin@123");

		clickWhenClickable(By.xpath("(//input[@type='checkbox' and @id='chkgLoginAck'])[1]"));

		// clickWhenClickable(By.xpath("//label[@for='chkgLoginAck']"));

		clickWhenClickable(By.id("btnSubmit"));
		waitAndSendKeys(By.id("OldPassword"), "Admin@123");
		waitAndSendKeys(By.id("NewPassword"), "Admin@1234");
		waitAndSendKeys(By.id("ConfirmNewPassword"), "Admin@1234");
		clickWhenClickable(By.id("btnSubmit"));
		waitAndSendKeys(By.id("UserName"), "testuser_static@mailinator.com");
		waitAndSendKeys(By.id("Password"), "Admin@1234");
		clickWhenClickable(By.xpath("//label[@for='chkgLoginAck']"));
		clickWhenClickable(By.id("btnSubmit"));

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

}
