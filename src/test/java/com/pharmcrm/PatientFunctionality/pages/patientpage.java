package com.pharmcrm.PatientFunctionality.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class patientpage {
	private WebDriver driver;
	private WebDriverWait wait;

	// LocatorPatinetPage
	private By quickTextButton = By.xpath("//span[normalize-space()='Quick Text']");
	private By sendButton = By.id("btnSave");
	private By bodyRequiredValidation = By.xpath("//div[contains(text(),'Body should not be empty.')]");
	private By phoneRequiredValidation = By.xpath("//div[contains(text(),'Please enter phone number.')]");
	private By saveButton = By.id("btnSave");
	private By preloader = By.cssSelector("div.preloader");
	private By sendVCardButton = By.xpath("//span[normalize-space()='Send VCard']");
	private By sendVCardSubmitButton = By.id("btnSendVCard");
	private By vcardValidationToastMessage = By.xpath("//div[@class='toast-message']");
	private By patientActionMenuButton = By.xpath("//tbody/tr[1]/td[12]//button//i");
	private By deletePatientOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[normalize-space()='Delete']");
	private By cancelDeletePatientButton = By
			.xpath("//button[contains(@onclick,'CloseDeletePopup')]//i[contains(@class,'fa-times')]");
	private By deletePatientToastMessage = By.xpath("//div[@class='toast-message']");
	private By addToFollowupButton = By.xpath("//span[normalize-space()='Add To Followup']");
	private By nextButton = By.xpath("//a[normalize-space()='Next']");
	private By blankSubmissionErrorToast = By.xpath("//div[@class='toast toast-error']");
	private By newPatientButton = By.xpath("//span[normalize-space()='New Patient']");
	private By searchPatientButton = By.xpath("//button[@id='btnFindPatient']");
	private By selectExistingPatientButton = By.xpath("//button[normalize-space()='Select Existing Patient']");
	private By addNewPatientButton = By.xpath("//button[normalize-space()='Add New Patient']");
	private By filterButton = By.xpath("//span[normalize-space()='Filter']");
	private By filterLastNameInput = By.xpath("//input[@id='Filter_LastName']");
	private By filterCancelButton = By.xpath("//button[@type='button']//i[@class='fa-solid fa-xmark']");
	private By patientListTable = By.xpath("//table");
	private By editPatientOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	private By nextOfKinLastNameInput = By.xpath("//input[@id='Patient_NextofKinLastName']");
	private By editPatientCancelButton = By.xpath("//a[normalize-space()='Cancel']");
	private By addToTrialOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Add To Trail')]");
	private By patientActionMenuButtonBlankEmail = By.xpath("//tbody/tr[2]/td[12]/div[1]/div[1]/button[1]/i[1]");
	private By enableLoginOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Enable Login')]");
	private By validationToastMessage = By.xpath("//div[@class='toast-message']");
	private By addTagButton = By.xpath("//span[normalize-space()='New Tag']");
	private By saveTagButton = By.xpath("//button[@id='btnSave']");

	// LocatorTagPage
	private By tagNameInput = By.xpath("//input[@id='Tag_Name']");
	private By cancelEditTagTypeButton = By
			.xpath("//button[@onclick='javascript: CloseaddTagModal();']//i[@class='fa fa-times']");
	private By tagTypeNameInList = By.xpath("//table//tbody/tr[1]/td[1]");
	private By tagActionMenuButton = By.xpath(
			"//tbody/tr[1]/td[last()]//button//i[contains(@class,'ellipsis') or contains(@class,'fa-ellipsis')]");
	private By editTagTypeOption = By.xpath(
			"//div[contains(@class,'bucket-dropdown-content') and contains(@class,'show')]//span[contains(text(),'Edit')]");
	private By deleteTagOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	private By cancelDeleteTagButton = By
			.xpath("//button[@onclick='javascript: CloseDeletePopup();']//i[@class='fa fa-times']");

	// LocatorReviewCategoriesPage
	private By addReviewCategoryButton = By.xpath("//span[normalize-space()='New Review Categories']");
	private By saveReviewCategoryButton = By.xpath("//button[@id='btnSave']");
	private By addReviewCategoryModal = By.xpath("//div[@id='addReviewCategoryModal']//div[@class='modal-header']");
	private By reviewCategoryActionMenuButton = By.xpath("//tbody/tr[1]/td[6]/div[1]/div[1]/button[1]/i[1]");
	private By editReviewCategoryOption = By.xpath("//span[normalize-space()='Edit']");
	private By reviewCategoryNameInput = By.xpath("//input[@id='ReviewCategory_Name']");
	private By cancelEditReviewCategoryButton = By
			.xpath("//button[@onclick='javascript: CloseaddReviewCategoryModal();']//i[@class='fa fa-times']");
	private By reviewCategoryName = By.xpath("//tbody/tr[1]/td[2]");
	private By deleteReviewCategoryButton = By.xpath("//span[normalize-space()='Delete']");
	private By cancelDeleteReviewCategoryButton = By
			.xpath("//button[@onclick='javascript: CloseDeletePopup();']//i[@class='fa fa-times']");

	// LocatorReferralSourcesPage
	private By addReferralSourceButton = By.xpath("//span[normalize-space()='New Referral Source']");
	private By addReferralSourceSaveButton = By.xpath("//button[@id='btnSave']");
	private By editReferralSourceOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	private By referralSourceNameInput = By.xpath("//input[@id='ReferralSource_Name']");
	private By cancelEditReferralSourceButton = By
			.xpath("//button[@onclick='javascript: CloseaddReferralSourceModal();']//i[@class='fa fa-times']");
	private By actionMenuForReferralSource = By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/i[1]");
	private By deleteReferralSourceOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	private By cancelDeleteReferralSourceButton = By
			.xpath("//button[@onclick='javascript: CloseDeletePopup();']//i[@class='fa fa-times']");

	// PatientPage
	public boolean isOnAddTagForm() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(saveTagButton));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public boolean isTagNameRequiredValidationDisplayed() {
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(validationToastMessage));

			return toast.getText().toLowerCase().contains("tag");
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnSaveTagButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement saveBtn = wait.until(ExpectedConditions.elementToBeClickable(saveTagButton));

		saveBtn.click();
	}

	public void clickOnAddTagButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement tagBtn = wait.until(ExpectedConditions.elementToBeClickable(addTagButton));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tagBtn);

		tagBtn.click();
	}

	public boolean isEmailRequiredValidationDisplayed() {
		try {
			WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(validationToastMessage));

			return toast.getText().toLowerCase().contains("email");
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnPatientActionMenuForBlankEmail() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement menuBtn = wait.until(ExpectedConditions.elementToBeClickable(patientActionMenuButtonBlankEmail));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menuBtn);
		menuBtn.click();
	}

	public void clickOnEnableLoginOption() {
		WebElement enableLoginBtn = wait.until(ExpectedConditions.elementToBeClickable(enableLoginOption));
		enableLoginBtn.click();
	}

	public boolean isOnAddToTrialForm() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(nextButton));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnAddToTrialOption() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement addToTrialBtn = wait.until(ExpectedConditions.elementToBeClickable(addToTrialOption));
		addToTrialBtn.click();
	}

	public boolean isPatientDetailsNotUpdatedAndListUnchanged(String originalValue) {
		try {
			boolean isPatientListVisible = wait.until(ExpectedConditions.visibilityOfElementLocated(patientListTable))
					.isDisplayed();
			clickOnPatientActionMenu();
			clickOnEditPatientOption();
			WebElement kinLastName = wait.until(ExpectedConditions.visibilityOfElementLocated(nextOfKinLastNameInput));
			boolean isValueUnchanged = kinLastName.getAttribute("value").equals(originalValue);
			return isPatientListVisible && isValueUnchanged;
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnEditPatientCancelButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement cancelBtn = wait.until(ExpectedConditions.elementToBeClickable(editPatientCancelButton));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cancelBtn);

		cancelBtn.click();
	}

	public void updateNextOfKinLastName(String lastName) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement kinLastName = wait.until(ExpectedConditions.visibilityOfElementLocated(nextOfKinLastNameInput));

		kinLastName.clear();
		kinLastName.sendKeys(lastName);
	}

	public void clickOnEditPatientOption() {
		WebElement editBtn = wait.until(ExpectedConditions.elementToBeClickable(editPatientOption));

		editBtn.click();
	}

	public boolean isFilterClearedAndPatientListVisible() {
		try {
			WebElement filterInput = wait.until(ExpectedConditions.visibilityOfElementLocated(filterLastNameInput));
			boolean isFilterCleared = filterInput.getAttribute("value").isEmpty();
			boolean isPatientListVisible = wait.until(ExpectedConditions.visibilityOfElementLocated(patientListTable))
					.isDisplayed();
			return isFilterCleared && isPatientListVisible;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnFilterCancelButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement cancelBtn = wait.until(ExpectedConditions.elementToBeClickable(filterCancelButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cancelBtn);
		cancelBtn.click();
	}

	public void enterFilterLastName(String lastName) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement lastNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(filterLastNameInput));
		lastNameInput.clear();
		lastNameInput.sendKeys(lastName);
	}

	public void clickOnFilterButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement filterBtn = wait.until(ExpectedConditions.elementToBeClickable(filterButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", filterBtn);
		filterBtn.click();
	}

	public boolean isOnAddNewPatientForm() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(addNewPatientButton));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnAddNewPatientButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement addNewBtn = wait.until(ExpectedConditions.elementToBeClickable(addNewPatientButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addNewBtn);
		addNewBtn.click();
	}

	public boolean isOnSelectExistingPatientForm() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(selectExistingPatientButton));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnSelectExistingPatientButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement selectBtn = wait.until(ExpectedConditions.elementToBeClickable(selectExistingPatientButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectBtn);
		selectBtn.click();
	}

	public boolean isOnSearchPatientForm() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(searchPatientButton));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnSearchPatientButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(searchPatientButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", searchBtn);
		searchBtn.click();
	}

	public void clickOnNewPatientButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement newPatientBtn = wait.until(ExpectedConditions.elementToBeClickable(newPatientButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", newPatientBtn);
		newPatientBtn.click();
	}

	public boolean isStillOnAddToFollowupForm() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(nextButton));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public boolean isBlankSubmissionErrorDisplayed() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(blankSubmissionErrorToast));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnNextWithoutData() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement nextBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(nextButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextBtn);
	}

	public void clickOnAddToFollowup() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(addToFollowupButton)).click();
	}

	public void clickCancelDeletePatientConfirmation() {
		wait.until(ExpectedConditions.elementToBeClickable(cancelDeletePatientButton)).click();
	}

	public boolean isDeletePatientToastMessageAbsent() {
		try {
			wait.withTimeout(Duration.ofSeconds(5))
					.until(ExpectedConditions.visibilityOfElementLocated(deletePatientToastMessage));
			return false;
		} catch (TimeoutException e) {
			return true;
		}
	}

	public void clickOnPatientActionMenu() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(patientActionMenuButton)).click();
	}

	public void clickOnDeletePatient() {
		wait.until(ExpectedConditions.elementToBeClickable(deletePatientOption)).click();
	}

	public boolean isSendVCardButtonDisplayed() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(sendVCardButton)).isDisplayed();
	}

	public boolean isSendVCardValidationMessageDisplayed() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(vcardValidationToastMessage)).isDisplayed();
	}

	public void clickSendForPatientVCard() {
		wait.until(ExpectedConditions.elementToBeClickable(sendVCardSubmitButton)).click();
	}

	public patientpage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void clickOnSendVCard() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(sendVCardButton)).click();
	}

	public void openPatientsPage(String fullUrl, String expectedUrlFragment) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains(expectedUrlFragment));
	}

	public boolean isOnPatientsPage() {
		return driver.getCurrentUrl().contains("/Patient/Home/Patients");
	}

	public boolean isOnTagsPage() {
		return driver.getCurrentUrl().contains("/Patient/Home/Tags");
	}

	public void clickOnAddQuickText() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(quickTextButton)).click();
	}

	public void leaveAllRequiredFieldsEmptyInPatientQuickText() {

	}

	public void clickSendForPatientQuickText() {
		wait.until(ExpectedConditions.elementToBeClickable(sendButton)).click();
	}

	public boolean isBodyRequiredValidationDisplayed() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(bodyRequiredValidation)).isDisplayed();
	}

	public boolean isPhoneRequiredValidationDisplayed() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(phoneRequiredValidation)).isDisplayed();
	}

	public boolean isSaveButtonDisplayed() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(saveButton)).isDisplayed();
	}

	// TagPage
	public void clickOnEditTagType() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement actionMenu = wait.until(ExpectedConditions.elementToBeClickable(tagActionMenuButton));
		actionMenu.click();
		WebElement editBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(editTagTypeOption));
		editBtn.click();
	}

	public void updateTagTypeDetails(String newTagName) {
		WebElement tagInput = wait.until(ExpectedConditions.visibilityOfElementLocated(tagNameInput));
		tagInput.clear();
		tagInput.sendKeys(newTagName);
	}

	public void clickOnCancelEditTagType() {
		WebElement cancelBtn = wait.until(ExpectedConditions.elementToBeClickable(cancelEditTagTypeButton));
		cancelBtn.click();
	}

	public String getTagTypeNameFromList() {
		WebElement tagName = wait.until(ExpectedConditions.visibilityOfElementLocated(tagTypeNameInList));
		return tagName.getText().trim();
	}

	public void clickOnTagActionMenu() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement actionMenu = wait.until(ExpectedConditions.elementToBeClickable(tagActionMenuButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", actionMenu);
		actionMenu.click();
	}

	public void clickOnDeleteTag() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement deleteBtn = wait.until(ExpectedConditions.elementToBeClickable(deleteTagOption));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", deleteBtn);
		deleteBtn.click();
	}

	public void clickOnCancelDeleteTag() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement cancelBtn = wait.until(ExpectedConditions.elementToBeClickable(cancelDeleteTagButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cancelBtn);
		cancelBtn.click();
	}

	public String getTagNameFromTagList() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[1]"))).getText()
				.trim();
	}

	// ReviewCategoriesPage
	public boolean isOnReviewCategoriesPage() {
		return driver.getCurrentUrl().contains("/Patient/Home/ReviewCategories");
	}

	public void clickOnAddReviewCategory() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement addBtn = wait.until(ExpectedConditions.elementToBeClickable(addReviewCategoryButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addBtn);
		addBtn.click();
	}

	public void clickOnSaveReviewCategory() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement saveBtn = wait.until(ExpectedConditions.elementToBeClickable(saveReviewCategoryButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", saveBtn);
		saveBtn.click();
	}

	public boolean isAddReviewCategoryFormDisplayed() {
		try {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(addReviewCategoryModal)).isDisplayed();
		} catch (TimeoutException e) {
			return false;
		}
	}

	public void clickOnEditReviewCategory() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement actionMenu = wait.until(ExpectedConditions.elementToBeClickable(reviewCategoryActionMenuButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", actionMenu);
		actionMenu.click();
		WebElement editBtn = wait.until(ExpectedConditions.elementToBeClickable(editReviewCategoryOption));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", editBtn);
		editBtn.click();
	}

	public void updateReviewCategoryDetails(String updatedName) {
		WebElement nameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(reviewCategoryNameInput));
		nameInput.clear();
		nameInput.sendKeys(updatedName);
	}

	public void clickOnCancelEditReviewCategory() {
		WebElement cancelBtn = wait.until(ExpectedConditions.elementToBeClickable(cancelEditReviewCategoryButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cancelBtn);
		cancelBtn.click();
	}

	public String getReviewCategoryNameFromList() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(reviewCategoryName));
		return driver.findElement(reviewCategoryName).getText().trim();
	}

	public void clickOnReviewCategoryActionMenu() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement actionMenu = wait.until(ExpectedConditions.elementToBeClickable(reviewCategoryActionMenuButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", actionMenu);
		actionMenu.click();
	}

	public void clickOnDeleteReviewCategory() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement deleteBtn = wait.until(ExpectedConditions.elementToBeClickable(deleteReviewCategoryButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", deleteBtn);
		deleteBtn.click();
	}

	public void clickOnCancelDeleteReviewCategory() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement cancelBtn = wait.until(ExpectedConditions.elementToBeClickable(cancelDeleteReviewCategoryButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cancelBtn);
		cancelBtn.click();
	}

// ReferralSourcesPage
	public boolean isOnReferralSourcesPage() {
		return driver.getCurrentUrl().contains("/Patient/Home/ReferralSources");
	}

	public void clickOnAddReferralSource() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement addBtn = wait.until(ExpectedConditions.elementToBeClickable(addReferralSourceButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addBtn);
		addBtn.click();
	}

	public boolean isAddReferralSourceFormDisplayed() {
		try {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(addReferralSourceSaveButton)).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOnEditReferralSource() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement actionMenuBtn = wait.until(ExpectedConditions.elementToBeClickable(actionMenuForReferralSource));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", actionMenuBtn);
		actionMenuBtn.click();
		WebElement editBtn = wait.until(ExpectedConditions.elementToBeClickable(editReferralSourceOption));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", editBtn);
		editBtn.click();
	}

	public void updateReferralSourceName(String name) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(referralSourceNameInput));
		input.clear();
		input.sendKeys(name);
	}

	public void clickOnCancelEditReferralSource() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement cancelBtn = wait.until(ExpectedConditions.elementToBeClickable(cancelEditReferralSourceButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cancelBtn);
		cancelBtn.click();
	}

	public String getReferralSourceNameFromList() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement nameElement = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[1]")));
		return nameElement.getText().trim();
	}

	public void clickOnActionMenuForReferralSource() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement actionMenuBtn = wait.until(ExpectedConditions.elementToBeClickable(actionMenuForReferralSource));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", actionMenuBtn);
		actionMenuBtn.click();
	}

	public void clickOnDeleteReferralSource() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement deleteBtn = wait.until(ExpectedConditions.elementToBeClickable(deleteReferralSourceOption));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", deleteBtn);
		deleteBtn.click();
	}

	public void clickOnCancelDeleteReferralSource() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		WebElement cancelBtn = wait.until(ExpectedConditions.elementToBeClickable(cancelDeleteReferralSourceButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cancelBtn);
		cancelBtn.click();
	}

}
