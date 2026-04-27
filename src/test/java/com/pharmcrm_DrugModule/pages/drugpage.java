package com.pharmcrm_DrugModule.pages;

import java.time.Duration;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import hooks.Hooks;

public class drugpage {
	private WebDriver driver;
	private WebDriverWait wait;

	// Drug
	public By closeFamilyModalButton = By
			.xpath("//button[@onclick='javascript: CloseFamilyModal();']//i[@class='fa fa-times']");
	public By chooseProgramInput = By.xpath("//input[@id='chooseprogram']");
	public By selectExistingDrugButton = By.xpath("//button[normalize-space()='Select Existing Drug']");
	public By toastMessage = By.xpath("//div[@class='toast-message']");
	public By chooseDiseaseStateInput = By.xpath("//input[@id='choosediseasestate']");
	public By addProgramIconImage = By.xpath("//div[@id='btnAddProgram']//img[@class='v-align-middle']");
	public By searchCollapseSvgIcon = By.xpath("//a[@id='searchcollapse']//*[name()='svg']");
	public By closeTherapeuticModalButton = By
			.xpath("//button[@onclick='javascript: CloseTherapeuticModal();']//i[@class='fa fa-times']");

	// Program
	public By drugProgramDeleteLabel = By.xpath("//label[@for='chkg29DrugProgramDelete']");
	public By drugProgramAllLabel = By.xpath("//label[@for='chkg29DrugProgramAll']");
	public By drugProgramAddLabel = By.xpath("//label[@for='chkg29DrugProgramAdd']");
	public By deleteProgramIconPath = By
			.xpath("//a[@onclick='deleteRow(this)']//*[name()='svg']//*[name()='path' and @id='Union_3']");
	public By addProgramInput = By.id("addprogram");
	public By programNameField = By.id("Program_Name");
	public By addProgramButtonIcon = By.xpath("//div[@id='btnAddProgram']//img[@class='v-align-middle']");

	// Disease State
	public By drugDiseaseStateDeleteLabel = By.xpath("//label[@for='chkg29DrugDiseaseStateDelete']");
	public By addDiseaseStateInput = By.id("adddiseasestate");
	public By addDiseaseStateButtonIcon = By.xpath("//div[@id='btnAddDiseaseState']//img[@class='v-align-middle']");
	public By firstRowActionIcon = By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]");
	public By deleteIcon = By.xpath("//a[@class='gridListRoundIcon']//*[name()='svg']");
	public By drugDiseaseStateAllLabel = By.xpath("//label[@for='chkg29DrugDiseaseStateAll']");
	public By drugDiseaseStateAddLabel = By.xpath("//label[@for='chkg29DrugDiseaseStateAdd']");
	public By deleteDiseaseStateIcon = By
			.xpath("//a[@onclick='deleteDiseaseState(this)']//*[name()='svg']//*[name()='path' and @id='Union_3']");
	public By addDiseaseStateCheckbox = By.id("adddiseasestate");
	public By diseaseStateNameInput = By.id("DiseaseState_Name");
	public By addDiseaseStateButton = By.xpath("//div[@id='btnAddDiseaseState']//img[@class='v-align-middle']");
	public By saveDrugButton = By.id("btnSave");

	// Drug Approved Indication
	public By drugApprovedIndicationEditLabel = By.xpath("//label[@for='chkg28DrugApprovedIndicationEdit']");
	public By drugApprovedIndicationDeleteLabel = By.xpath("//label[@for='chkg28DrugApprovedIndicationDelete']");
	public By confirmDeleteApprovedIndicationButton = By.id("deleteApprovedIndication");
	public By approvedIndicationRowActionIcon = By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]");
	public By firstDrugActionIcon = By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]");
	public By drugApprovedIndicationAllCheckboxLabel = By.xpath("//label[@for='chkg28DrugApprovedIndicationAll']");
	public By drugApprovedIndicationAddCheckboxLabel = By.xpath("//label[@for='chkg28DrugApprovedIndicationAdd']");
	public By approvedIndicationRowActionButton = By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]");
	public By editApprovedIndicationOption = By
			.xpath("//div[contains(@class,'dropdown-menu') and contains(@class,'show')]//span[text()='Edit']");
	public By deleteApprovedIndicationOption = By
			.xpath("//div[contains(@class,'dropdown-menu') and contains(@class,'show')]//span[text()='Delete']");
	public By addApprovedIndicationButton = By.xpath("//span[normalize-space()='Add Approved Indication']");
	public By approvedIndicationInput = By.id("DrugApprovedIndication_ApprovedIndication");
	public By saveApprovedIndicationButton = By.id("btnSaveApprovedIndication");

	// Drug Family
	public By drugFamilyEditLabel = By.xpath("//label[@for='chkg28DrugFamilyEditt']");
	public By drugFamilyDeleteLabel = By.xpath("//label[@for='chkg28DrugFamilyDelete']");
	public By confirmDeleteFamilyButton = By.id("deleteFamily");
	public By drugFamilyViewLabel = By.xpath("//label[@for='chkg28DrugFamilyAll']");
	public By drugFamilyAddLabel = By.xpath("//label[@for='chkg28DrugFamilyAdd']");
	public By drugFamilyRowActionButton = By.xpath("//tbody/tr/td[8]/div[1]/div[1]/button[1]/i[1]");
	public By editFamilyOption = By
			.xpath("//div[contains(@class,'dropdown-menu') and contains(@class,'show')]//span[text()='Edit']");
	public By deleteFamilyOption = By.xpath("//a[@id='btnDeleteFamilyConfirm']//span[text()='Delete']");
	public By addFamilyButton = By.xpath("//span[normalize-space()='Add Family']");
	public By familyNameInput = By.id("DrugFamily_Family");
	public By familyCodeInput = By.id("DrugFamily_FamilyCode");
	public By saveFamilyButton = By.id("btnSaveFamily");

	// Drug Therapeutic
	public By drugTherapeuticEditLabel = By.xpath("//label[@for='chkg28DrugTherapeuticEdit']");
	public By drugTherapeuticDeleteLabel = By.xpath("//label[@for='chkg28DrugTherapeuticDelete']");
	public By confirmDeleteTherapeuticButton = By.id("deleteTherapeutic");
	public By drugTherapeuticAllCheckboxLabel = By.xpath("//label[@for='chkg27DrugTherapeuticAll']");
	public By drugTherapeuticAddCheckboxLabel = By.xpath("//label[@for='chkg27DrugTherapeuticAdd']");
	public By drugTherapeuticRowActionButton = By.xpath(
			"//body/div[@id='page-wrapper']/div[@id='content']/div[@class='detailBackgroundContainer pb-3']/div[@class='settings-main']/div[@class='container-fluid']/div[4]//i[@class='fa-solid fa-ellipsis-vertical']");
	public By editTherapeuticOption = By.xpath("//span[normalize-space()='Edit']");
	public By deleteTherapeuticOption = By.xpath("//span[normalize-space()='Delete']");
	public By firstDrugRowActionButton = By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]");
	public By editDrugOption = By
			.xpath("//div[contains(@class,'dropdown-menu') and contains(@class,'show')]//span[text()='Edit']");
	public By addTherapeuticButton = By.xpath("//span[normalize-space()='Add Therapeutic']");
	public By therapeuticClassInput = By.id("DrugTherapeutic_TherapeuticClass");
	public By therapeuticClassCodeInput = By.id("DrugTherapeutic_TherapeuticClassCode");
	public By saveTherapeuticButton = By.id("btnSaveTherapeutic");

	// ICD10
	public By icd10AddLabel = By.xpath("//label[@for='chkg27ICD10Add']");
	public By icd10EditLabel = By.xpath("//label[@for='chkg27ICD10Edit']");
	public By icd10DeleteLabel = By.xpath("//label[@for='chkg27ICD10Delete']");
	public By confirmDeleteICD10Button = By.xpath("//div[@id='icd10modal']//button[@id='btnDeleteConfirm']");
	public By icd10CodeInput = By.id("ICD10_Code");
	public By icd10DiagnosisInput = By.id("ICD10_Diagnosis");
	public By addGoalPopupButton = By.xpath("//a[@id='addGoalPopup']//img");
	public By filterDiseaseNameInput = By.id("Filter_DiseaseName");
	public By icd10CodesearchButton = By.xpath("//button[normalize-space()='Search']");
	public By selectDiseaseCheckbox = By.xpath("//input[@id='50b9ef96-8eff-432a-99b8-78d9a0100a62']");
	public By addGoalButton = By.xpath("//button[@id='btnGoal']");
	public By saveICD10Button = By.xpath("//button[@id='btnSave']");
	public By icd10AllCheckboxLabel = By.xpath("//label[@for='chkg27ICD10All']");
	public By icd10ViewCheckboxLabel = By.xpath("//label[@for='chkg27ICD10View']");
	public By newICD10Button = By.xpath("//span[normalize-space()='New ICD10']");
	public By icd10RowActionButton = By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']");
	public By editICD10Option = By.xpath("//span[normalize-space()='Edit']");
	public By deleteICD10Option = By.xpath("//span[normalize-space()='Delete']");

	// Allergy
	public By allergyAddLabel = By.xpath("//label[@for='chkg02AllergyAdd']");
	public By allergyDeleteLabel = By.xpath("//label[@for='chkg02AllergyDelete']");
	public By allergiesDownloadTemplateLabel = By.xpath("//label[@for='chkg29AllergiesDownloadTemplate']");
	public By allergiesUploadExcelLabel = By.xpath("//label[@for='chkg29AllergiesUploadExcel']");
	public By allergiesDownloadExcelLabel = By.xpath("//label[@for='chkg29AllergiesDownloadExcel']");
	public By downloadTemplateLabel = By.xpath("//label[@for='chkg29AllergiesDownloadTemplate']");
	public By allergyRowActionButton = By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]");
	public By editAllergyOption = By
			.xpath("//div[contains(@class,'dropdown-menu') and contains(@class,'show')]//span[text()='Edit']");
	public By allergyOptionsButton = By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]");
	public By deleteAllergyOption = By
			.xpath("//div[contains(@class,'dropdown-menu') and contains(@class,'show')]//span[text()='Delete']");
	public By confirmDeleteButton = By.id("btnDeleteConfirm");
	public By uploadExcel_Allergy = By.xpath("//span[normalize-space()='Upload Excel file']");
	public By exportExcel_Allergy = By.xpath("//span[normalize-space()='Export Excel']");
	public By downloadTemplate_Allergy = By.xpath("//span[normalize-space()='Download Template']");
	public By actionDropdown_FirstRow = By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]");
	public By deleteOption_Allergy = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	public By addAllergyButton = By.xpath("//span[normalize-space()='Add Allergy']");
	public By allergyNameInput = By.xpath("//input[@id='Allergy_Name']");
	public By saveButtonAllergy = By.xpath("//button[@id='btnSave']");
	public By addAllergyBtn = By.xpath("//span[normalize-space()='Add Allergy']");
	public By uploadExcelBtn = By.xpath("//span[normalize-space()='Upload Excel file']");
	public By exportExcelBtn = By.xpath("//span[normalize-space()='Export Excel']");
	public By downloadTemplateBtn = By.xpath("//span[normalize-space()='Download Template']");
	public By recordActionDropdown = By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/i[1]");
	public By editOptionAllergy = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By deleteOptionAllergy = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");
	public By allergyAllCheckbox = By.xpath("//label[@for='chkg02AllergyAll']");
	public By allergyAddCheckbox = By.xpath("//label[@for='chkg02AllergyAdd']");
	public By allergyViewCheckbox = By.xpath("//label[@for='chkg02AllergyView']");

	// Star 2 Drug
	public By star2DrugSaveButton = By.id("btnSave");
	public By star2DrugAllCheckboxLabel = By.xpath("//label[@for='chkg02Star2DrugAll']");
	public By star2DrugViewCheckboxLabel = By.xpath("//label[@for='chkg02Star2DrugView']");

	// Star 1 Drug
	public By star1DrugSelectAllCheckbox = By.xpath("//label[@for='chkSelectAllLeft']");
	public By star1DrugEditIcon = By.xpath("//button[@id='select-one']//*[name()='svg']");
	public By star1DrugAllCheckboxLabel = By.xpath("//label[@for='chkg02Star1DrugAll']");
	public By star1DrugViewCheckboxLabel = By.xpath("//label[@for='chkg02Star1DrugView']");
	public By star1DrugSaveButton = By.id("btnSave");

	// Drug
	public By drugDeleteLabel = By.xpath("//label[@for='chkg02DrugDelete']");
	public By drugsDownloadTemplateLabel = By.xpath("//label[@for='chkg28DrugsDownloadTemplate']");
	public By drugsUploadExcelLabel = By.xpath("//label[@for='chkg28DrugsUploadExcel']");
	public By drugsDownloadExcelLabel = By.xpath("//label[@for='chkg28DrugsDownloadExcel']");
	public By uploadFileInput = By.xpath("//input[@type='file']");
	public By deleteConfirmButton = By.xpath("//div[@id='deleteDrugsModal']//button[@id='btnDeleteConfirm']");
	public By filterButton = By.xpath("//span[normalize-space()='Filter']");
	public By addNewDrugButton = By.xpath("//button[normalize-space()='Add New Drug']");
	public By saveButton = By.xpath("//button[@id='btnSave']");
	public By drugNameFilterInput = By.xpath("//input[@id='Filter_DrugName']");
	public By ndcFilterInput = By.xpath("//input[@id='Filter_NDC']");
	public By drugAllCheckboxLabel = By.xpath("//label[@for='chkg02DrugAll']");
	public By drugAddCheckboxLabel = By.xpath("//label[@for='chkg02DrugAdd']");
	public By drugViewPermissionLabel = By.xpath("//label[@for='chkg02DrugView']");
	public By newDrugButton = By.xpath("//span[normalize-space()='New Drug']");
	public By uploadExcelButton = By.xpath("//span[normalize-space()='Upload Excel file']");
	public By exportExcelButton = By.xpath("//span[normalize-space()='Export Excel']");
	public By downloadTemplateButton = By.xpath("//span[normalize-space()='Download Template']");
	public By firstRowDropdown = By.xpath("//tbody/tr[1]/td[13]/div[1]/div[1]/a[1]/i[1]");
	public By editOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')]");
	public By deleteOption = By.xpath(
			"//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Delete')]");

	// Profile
	public By preloader = By.cssSelector("div.preloader");
	public By profileNameInput = By.xpath("//input[@id='Filter_Name']");
	public By searchButton = By.xpath("//i[@class='fa-solid fa-magnifying-glass']");
	public By actionMenu = By.xpath("//i[@class='fa-solid fa-ellipsis-vertical']");
	public By editButton = By.xpath("//span[normalize-space()='Edit']");
	public By selectAllModuleLabel = By.xpath("//label[normalize-space()='Select All Module']");
	public By submitButton = By.xpath("//button[@id='btnSave']");
	public By profilefilterButton = By.xpath("//*[name()='path' and @id='Union_73']");
	public By firstPatientLink = By.xpath("(//a[@class='gridLinkButton'])[1]");
	public By vitalsTab = By.xpath("//a[normalize-space()='Vitals']");
	public By addVitalsButton = By.xpath("//span[normalize-space()='Add Vitals']");
	public By bpInputField = By.xpath("//input[@id='PatientVital_BP']");
	public By saveVitalsButton = By.xpath("//button[@id='btnSaveVital']");
	public By updatedByColumn = By.xpath("//th[normalize-space()='Updated By']");
	public By updatedDateColumn = By.xpath("//th[normalize-space()='Updated Date']");
	public By priorAuthorizationProcessAllLabel = By.xpath("//label[@for='chkg23PriorAuthorizationProcessAll']");
	public By priorAuthorizationGenerateAddLabel = By.xpath("//label[@for='chkg23PriorAuthorizationGenerateAdd']");

	// Audit View
	public By updatedBy = By.xpath("//div[normalize-space()='Updated By']");
	public By updatedDate = By.xpath("//a[normalize-space()='Updated Date']");
	public By drugGeneralAllLabel = By.xpath("//label[@for='chkg37DrugGeneralAll']");

	// Drug Therapeutic
	public void denyDrugTherapeuticTestAddEdit() {
		sleep(2000);
		assertElementNotPresent(addTherapeuticButton);
		clickWhenClickable(drugTherapeuticRowActionButton);
		sleep(1000);
		assertElementNotPresent(editTherapeuticOption);
	}

	public void allowDrugTherapeuticTestViewDelete() {
		sleep(3000);
		clickWhenClickable(firstDrugRowActionButton);
		sleep(1000);
		clickWhenClickable(editDrugOption);
		sleep(2000);
		clickWhenClickable(drugTherapeuticRowActionButton);
		sleep(1000);
		clickWhenClickable(deleteTherapeuticOption);
		sleep(1000);
		clickWhenClickable(confirmDeleteTherapeuticButton);
		sleep(1000);
	}

	public void createDrugTherapeuticTestViewDeleteProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement allergyAllElement = wait
				.until(ExpectedConditions.elementToBeClickable(drugTherapeuticAllCheckboxLabel));
		allergyAllElement.click();
		sleep(3000);
		WebElement allergyViewElement = wait.until(ExpectedConditions.elementToBeClickable(drugTherapeuticDeleteLabel));
		allergyViewElement.click();
		sleep(3000);
	}

	public void userShouldNotBeAbleToAddOrDeleteDrugTherapeutic() {
		sleep(2000);
		assertElementNotPresent(addTherapeuticButton);
		clickWhenClickable(drugTherapeuticRowActionButton);
		sleep(1000);
		assertElementNotPresent(deleteTherapeuticOption);
	}

	public void allowOnlyViewAndEditForDrugTherapeuticTest() {
		sleep(2000);
		assertElementNotPresent(addTherapeuticButton);
		clickWhenClickable(drugTherapeuticRowActionButton);
		sleep(1000);
		assertElementNotPresent(deleteTherapeuticOption);
	}

	public void allowUserToViewAndEditDrugTherapeuticTest() {
		sleep(2000);
		clickWhenClickable(firstDrugRowActionButton);
		sleep(1000);
		clickWhenClickable(editDrugOption);
		sleep(2000);
		clickWhenClickable(drugTherapeuticRowActionButton);
		sleep(1000);
		clickWhenClickable(editTherapeuticOption);
		sleep(1000);
		driver.findElement(therapeuticClassInput).sendKeys(Hooks.prop.getProperty("therapeutic.class.name"));
		driver.findElement(therapeuticClassCodeInput).sendKeys(Hooks.prop.getProperty("therapeutic.class.code"));
		clickWhenClickable(saveTherapeuticButton);
		sleep(1000);
	}

	public void denyDrugTherapeuticTestEditDelete() {
		sleep(5000);
		driver.findElements(drugTherapeuticRowActionButton).get(0).click();
		sleep(2000);
		assertElementNotPresent(editTherapeuticOption);
		assertElementNotPresent(deleteTherapeuticOption);
	}

	public void createDrugTherapeuticTestViewEditProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement allergyAllElement = wait
				.until(ExpectedConditions.elementToBeClickable(drugTherapeuticAllCheckboxLabel));
		allergyAllElement.click();
		sleep(3000);
		WebElement allergyViewElement = wait.until(ExpectedConditions.elementToBeClickable(drugTherapeuticEditLabel));
		allergyViewElement.click();
		sleep(3000);
	}

	public void createDrugTherapeuticViewAddProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement allergyAllElement = wait
				.until(ExpectedConditions.elementToBeClickable(drugTherapeuticAllCheckboxLabel));
		allergyAllElement.click();
		sleep(3000);
		WebElement allergyViewElement = wait
				.until(ExpectedConditions.elementToBeClickable(drugTherapeuticAddCheckboxLabel));
		allergyViewElement.click();
		sleep(3000);
	}

	public void allowDrugTherapeuticTestViewAdd() {
		sleep(3000);
		clickWhenClickable(firstDrugRowActionButton);
		sleep(1000);
		clickWhenClickable(editDrugOption);
		sleep(1000);
		clickWhenClickable(addTherapeuticButton);
		sleep(1000);
		driver.findElement(therapeuticClassInput).sendKeys(Hooks.prop.getProperty("therapeutic.class.name"));
		driver.findElement(therapeuticClassCodeInput).sendKeys(Hooks.prop.getProperty("therapeutic.class.code"));
		clickWhenClickable(saveTherapeuticButton);
		sleep(1000);
	}

	// Drug Family
	public void denyDrugFamilyTestAddEdit() {
		sleep(2000);
		assertElementNotPresent(addFamilyButton);
		clickWhenClickable(drugFamilyRowActionButton);
		sleep(1000);
		assertElementNotPresent(editFamilyOption);
	}

	public void allowDrugFamilyTestViewDelete() {
		sleep(3000);
		clickWhenClickable(firstDrugRowActionButton);
		sleep(1000);
		clickWhenClickable(editDrugOption);
		sleep(2000);
		clickWhenClickable(drugFamilyRowActionButton);
		sleep(1000);
		clickWhenClickable(deleteFamilyOption);
		sleep(1000);
		clickWhenClickable(confirmDeleteFamilyButton);
		sleep(1000);
	}

	public void createDrugFamilyTestViewDeleteProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement allergyAllElement = wait.until(ExpectedConditions.elementToBeClickable(drugFamilyViewLabel));
		allergyAllElement.click();
		sleep(3000);
		WebElement allergyViewElement = wait.until(ExpectedConditions.elementToBeClickable(drugFamilyDeleteLabel));
		allergyViewElement.click();
		sleep(3000);
	}

	public void denyDrugFamilyTestAddDelete() {
		sleep(2000);
		assertElementNotPresent(addFamilyButton);
		clickWhenClickable(drugFamilyRowActionButton);
		sleep(1000);
		assertElementNotPresent(deleteFamilyOption);
	}

	public void userShouldBeAbleToViewAndEditDrugFamily() {
		sleep(2000);
		clickWhenClickable(firstDrugRowActionButton);
		sleep(1000);
		clickWhenClickable(editDrugOption);
		sleep(2000);
		clickWhenClickable(drugFamilyRowActionButton);
		sleep(1000);
		clickWhenClickable(editFamilyOption);
		sleep(1000);
		driver.findElement(familyNameInput).sendKeys(Hooks.prop.getProperty("family.name"));
		driver.findElement(familyCodeInput).sendKeys(Hooks.prop.getProperty("family.code"));
		clickWhenClickable(saveFamilyButton);
		sleep(1000);
	}

	public void createDrugFamilyTestViewEditProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement allergyAllElement = wait.until(ExpectedConditions.elementToBeClickable(drugFamilyViewLabel));
		allergyAllElement.click();
		sleep(3000);
		WebElement allergyViewElement = wait.until(ExpectedConditions.elementToBeClickable(drugFamilyEditLabel));
		allergyViewElement.click();
		sleep(3000);
	}

	public void userShouldNotBeAbleToEditOrDeleteDrugFamily() {
		sleep(2000);
		clickWhenClickable(drugFamilyRowActionButton);
		sleep(1000);
		assertElementNotPresent(editFamilyOption);
		assertElementNotPresent(deleteFamilyOption);
	}

	public void allowUserToViewAndAddDrugFamilyTest() {
		sleep(3000);
		clickWhenClickable(firstDrugRowActionButton);
		sleep(1000);
		clickWhenClickable(editDrugOption);
		sleep(1000);
		clickWhenClickable(addFamilyButton);
		sleep(1000);
		driver.findElement(familyNameInput).sendKeys(Hooks.prop.getProperty("family.name"));
		driver.findElement(familyCodeInput).sendKeys(Hooks.prop.getProperty("family.code"));
		clickWhenClickable(saveFamilyButton);
		sleep(1000);
	}

	public void createDrugFamilyViewAddProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement allergyAllElement = wait.until(ExpectedConditions.elementToBeClickable(drugFamilyViewLabel));
		allergyAllElement.click();
		sleep(3000);
		WebElement allergyViewElement = wait.until(ExpectedConditions.elementToBeClickable(drugFamilyAddLabel));
		allergyViewElement.click();
		sleep(3000);
	}

	// ICD10
	public void userShouldNotBeAbleToAddOrEditICD10() {
		sleep(2000);
		assertElementNotPresent(newICD10Button);
		clickWhenClickable(icd10RowActionButton);
		sleep(3000);
		assertElementNotPresent(editICD10Option);
	}

	public void allowUserToViewAndDeleteICD10Test() {
		sleep(3000);
		clickWhenClickable(icd10RowActionButton);
		sleep(3000);
		clickWhenClickable(deleteICD10Option);
		sleep(2000);
		clickWhenClickable(confirmDeleteICD10Button);

	}

	public void createICD10TestViewDeleteProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement allergyAllElement = wait.until(ExpectedConditions.elementToBeClickable(icd10AllCheckboxLabel));
		allergyAllElement.click();
		sleep(3000);
		WebElement allergyViewElement = wait.until(ExpectedConditions.elementToBeClickable(icd10DeleteLabel));
		allergyViewElement.click();
		sleep(3000);
	}

	public void restrictICD10TestToViewAndEditOnly() {
		sleep(2000);
		assertElementNotPresent(newICD10Button);
		clickWhenClickable(icd10RowActionButton);
		sleep(3000);
		assertElementNotPresent(deleteICD10Option);
	}

	public void createICD10TestViewEditProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement allergyAllElement = wait.until(ExpectedConditions.elementToBeClickable(icd10AllCheckboxLabel));
		allergyAllElement.click();
		sleep(3000);
		WebElement allergyViewElement = wait.until(ExpectedConditions.elementToBeClickable(icd10EditLabel));
		allergyViewElement.click();
		sleep(3000);
	}

	public void allowOnlyViewAndAddForICD10Test() {
		sleep(2000);
		clickWhenClickable(icd10RowActionButton);
		sleep(3000);
		assertElementNotPresent(editICD10Option);
		assertElementNotPresent(deleteICD10Option);
	}

	public void userShouldBeAbleToViewAndAddICD10() {
		sleep(3000);
		clickWhenClickable(newICD10Button);
		sleep(2000);
		driver.findElement(icd10CodeInput).sendKeys(Hooks.prop.getProperty("icd10.code"));
		driver.findElement(icd10DiagnosisInput).sendKeys(Hooks.prop.getProperty("icd10.diagnosis"));
		clickWhenClickable(addGoalPopupButton);
		sleep(2000);
		driver.findElement(filterDiseaseNameInput).sendKeys(Hooks.prop.getProperty("filter.disease.name"));
		clickWhenClickable(icd10CodesearchButton);
		sleep(2000);
		clickWhenClickable(selectDiseaseCheckbox);
		clickWhenClickable(addGoalButton);
		sleep(1000);
		clickWhenClickable(saveICD10Button);
	}

	public void createICD10TestAddAccessProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement allergyAllElement = wait.until(ExpectedConditions.elementToBeClickable(icd10AllCheckboxLabel));
		allergyAllElement.click();
		sleep(3000);
		WebElement allergyViewElement = wait.until(ExpectedConditions.elementToBeClickable(icd10AddLabel));
		allergyViewElement.click();
		sleep(3000);
	}

	public void userShouldNotBeAbleToModifyICD10() {
		sleep(3000);
		assertElementNotPresent(newICD10Button);
		sleep(1000);
		clickWhenClickable(icd10RowActionButton);
		sleep(3000);
		assertElementNotPresent(editICD10Option);
		assertElementNotPresent(deleteICD10Option);
	}

	public void createICD10TestViewOnlyProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement allergyAllElement = wait.until(ExpectedConditions.elementToBeClickable(icd10AllCheckboxLabel));
		allergyAllElement.click();
		sleep(3000);
		WebElement allergyViewElement = wait.until(ExpectedConditions.elementToBeClickable(icd10ViewCheckboxLabel));
		allergyViewElement.click();
		sleep(3000);
	}

	public void openICD10Page(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Drug/Home/ICD10s"));
	}

	// Allergy
	public void allowOnlyViewAndExportExcelForAllergyTest() {
		sleep(2000);
		assertElementNotPresent(addAllergyButton);
		assertElementNotPresent(uploadExcelButton);
		assertElementNotPresent(downloadTemplateLabel);
		clickWhenClickable(allergyRowActionButton);
		sleep(3000);
		assertElementNotPresent(editAllergyOption);
		assertElementNotPresent(deleteAllergyOption);
	}

	public void allowUserToViewAndExportAllergyTestExcel() {
		sleep(3000);
		clickWhenClickable(exportExcelButton);
	}

	public void createAllergyTestViewExportExcelProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement allergyAllElement = wait.until(ExpectedConditions.elementToBeClickable(allergyAllCheckbox));
		allergyAllElement.click();
		sleep(3000);
		WebElement allergyViewElement = wait
				.until(ExpectedConditions.elementToBeClickable(allergiesDownloadExcelLabel));
		allergyViewElement.click();
		sleep(3000);
	}

	public void allowOnlyViewAndUploadExcelForAllergyTest() {
		sleep(2000);
		assertElementNotPresent(addAllergyButton);
		assertElementNotPresent(downloadTemplateLabel);
		assertElementNotPresent(exportExcelButton);
		clickWhenClickable(allergyRowActionButton);
		sleep(3000);
		assertElementNotPresent(editAllergyOption);
		assertElementNotPresent(deleteAllergyOption);
	}

	public void allowUserToViewAndUploadAllergyTestExcel() {
		sleep(3000);
		clickWhenClickable(uploadExcelButton);
		WebElement uploadInput = driver.findElement(uploadFileInput);
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/DrugTemplate.xlsx";
		uploadInput.sendKeys(filePath);
		sleep(3000);
	}

	public void applyAllergyTestLimitedAccessPolicy() {
		sleep(2000);
		assertElementNotPresent(addAllergyButton);
		assertElementNotPresent(uploadExcelButton);
		assertElementNotPresent(exportExcelButton);
		clickWhenClickable(allergyRowActionButton);
		sleep(3000);
		assertElementNotPresent(editAllergyOption);
		assertElementNotPresent(deleteAllergyOption);
	}

	public void setAllergyTestViewTemplatePermissions() {
		sleep(3000);
		clickWhenClickable(downloadTemplateButton);
	}

	public void disableAllergyTestAddEditExportImport() {
		sleep(2000);
		assertElementNotPresent(addAllergyButton);
		assertElementNotPresent(uploadExcelButton);
		assertElementNotPresent(exportExcelButton);
		assertElementNotPresent(downloadTemplateButton);
		clickWhenClickable(allergyRowActionButton);
		sleep(3000);
		assertElementNotPresent(editAllergyOption);
	}

	public void allowUserToViewAndDeleteAllergyTest() {
		sleep(3000);
		clickWhenClickable(allergyOptionsButton);
		sleep(1000);
		clickWhenClickable(deleteAllergyOption);
		sleep(1000);
		clickWhenClickable(confirmDeleteButton);
	}

	public void createAllergyTestViewUploadExcelProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement allergyAllElement = wait.until(ExpectedConditions.elementToBeClickable(allergyAllCheckbox));
		allergyAllElement.click();
		sleep(3000);
		WebElement allergyViewElement = wait.until(ExpectedConditions.elementToBeClickable(allergiesUploadExcelLabel));
		allergyViewElement.click();
		sleep(3000);
	}

	public void createAllergyTestViewTemplateAccessProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement allergyAllElement = wait.until(ExpectedConditions.elementToBeClickable(allergyAllCheckbox));
		allergyAllElement.click();
		sleep(3000);
		WebElement allergyViewElement = wait
				.until(ExpectedConditions.elementToBeClickable(allergiesDownloadTemplateLabel));
		allergyViewElement.click();
		sleep(3000);
	}

	public void createAllergyTestViewDeleteProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement allergyAllElement = wait.until(ExpectedConditions.elementToBeClickable(allergyAllCheckbox));
		allergyAllElement.click();
		sleep(3000);
		WebElement allergyViewElement = wait.until(ExpectedConditions.elementToBeClickable(allergyDeleteLabel));
		allergyViewElement.click();
		sleep(3000);
	}

	public void verifyUserCannotDeleteDownloadUploadExportAllergy() {
		sleep(2000);
		assertElementNotPresent(uploadExcel_Allergy);
		assertElementNotPresent(exportExcel_Allergy);
		assertElementNotPresent(downloadTemplate_Allergy);
		clickWhenClickable(actionDropdown_FirstRow);
		sleep(3000);
		assertElementNotPresent(deleteOption_Allergy);
	}

	public void verifyUserCanViewAndAddAllergy() {
		sleep(3000);
		clickWhenClickable(addAllergyButton);
		sleep(1000);
		driver.findElement(allergyNameInput).sendKeys(Hooks.prop.getProperty("allergy.name"));
		clickWhenClickable(saveButtonAllergy);
	}

	public void createProfileWithViewAndAddAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement allergyAllElement = wait.until(ExpectedConditions.elementToBeClickable(allergyAllCheckbox));
		allergyAllElement.click();
		sleep(3000);
		WebElement allergyViewElement = wait.until(ExpectedConditions.elementToBeClickable(allergyAddLabel));
		allergyViewElement.click();
		sleep(3000);
	}

	public void createAllergyViewOnlyProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement allergyAllElement = wait.until(ExpectedConditions.elementToBeClickable(allergyAllCheckbox));
		allergyAllElement.click();
		sleep(3000);
		WebElement allergyViewElement = wait.until(ExpectedConditions.elementToBeClickable(allergyViewCheckbox));
		allergyViewElement.click();
		sleep(3000);
	}

	public void openAllergiesPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Allergies"));
	}

	public void verifyUserCannotAddEditDeleteDownloadUploadExportAllergy() {
		sleep(4000);
		assertElementNotPresent(addAllergyBtn);
		assertElementNotPresent(uploadExcelBtn);
		assertElementNotPresent(exportExcelBtn);
		assertElementNotPresent(downloadTemplateBtn);
		clickWhenClickable(recordActionDropdown);
		sleep(3000);
		assertElementNotPresent(editOptionAllergy);
		assertElementNotPresent(deleteOptionAllergy);
	}

	// Star 2 Drug
	public void verifyUserCanViewAndEditStar2Drug() {
		sleep(3000);
		clickWhenClickable(star2DrugSaveButton);
	}

	public void createStar2DrugViewAndEditProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(3000);

	}

	public void createStar2DrugViewOnlyProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(3000);
		WebElement drugSelectAll = wait.until(ExpectedConditions.elementToBeClickable(star2DrugAllCheckboxLabel));
		drugSelectAll.click();
		sleep(3000);
		WebElement drugAddPermission = wait.until(ExpectedConditions.elementToBeClickable(star2DrugViewCheckboxLabel));
		drugAddPermission.click();
		sleep(2000);

	}

	public void Star2toStar1Drugs(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Star2toStar1Drugs"));
	}

	public void openStar2DrugsPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Star2Drugs"));
	}

	public void verifyUserCannotEditStar2Drug() {
		sleep(3000);
		assertElementNotPresent(star2DrugSaveButton);
	}

	// Star 1 Drug
	public void viewAndEditStar1DrugTest() {
		sleep(3000);
		clickWhenClickable(star1DrugSelectAllCheckbox);
		clickWhenClickable(star1DrugEditIcon);
		clickWhenClickable(star1DrugSaveButton);
	}

	public void createStar1DrugViewAndEditProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(3000);

	}

	public void createStar1DrugViewOnlyProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(3000);
		WebElement drugSelectAll = wait.until(ExpectedConditions.elementToBeClickable(star1DrugAllCheckboxLabel));
		drugSelectAll.click();
		sleep(3000);
		WebElement drugAddPermission = wait.until(ExpectedConditions.elementToBeClickable(star1DrugViewCheckboxLabel));
		drugAddPermission.click();
		sleep(2000);

	}

	public void verifyUserCannotEditStar1Drug() {
		sleep(3000);
		assertElementNotPresent(star1DrugSaveButton);
	}

	public void openStar1DrugsPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Star1Drugs"));
	}

	// Audit View
	public void verifyGeneralAuditViewSettings() {
		sleep(2000);
		assertElementPresent(updatedBy);
		assertElementPresent(updatedDate);
	}

	public void userCannotViewDrugGeneralAuditViewSettings() {
		assertElementNotPresent(updatedBy);
		assertElementNotPresent(updatedDate);
	}

	public void createViewOnlyDrugGeneralAuditProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);

	}

	public void createDrugGeneralAuditNoAccessProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(2000);
		WebElement drugGeneralAllCheckbox = wait.until(ExpectedConditions.elementToBeClickable(drugGeneralAllLabel));
		drugGeneralAllCheckbox.click();
		sleep(2000);

	}

	// General
	public drugpage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	// Profile Page
	public void opendrugProfilesPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Setup/Home/Profiles"));
	}

	public void clickFilterButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(profilefilterButton)).click();
	}

	public void enterProfileName() {
		enterProfileName(Hooks.prop.getProperty("profile.name.value"));
	}

	public void enterProfileName(String profileName) {
		WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(profileNameInput));
		input.clear();
		input.sendKeys(profileName);
	}

	public void clickSearchButton() {
		wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
	}

	public void clickActionMenu() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(actionMenu)).click();
	}

	public void clickEditButton() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		wait.until(ExpectedConditions.elementToBeClickable(editButton)).click();
	}

	public void clickSubmitButton() {
		sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
	}

	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	// Drug Approved Indication
	public void allowOnlyViewAndDeleteForDrugApprovedIndicationTest() {
		sleep(2000);
		assertElementNotPresent(addApprovedIndicationButton);
		clickWhenClickable(approvedIndicationRowActionIcon);
		sleep(1000);
		assertElementNotPresent(editApprovedIndicationOption);
	}

	public void userShouldBeAbleToViewAndDeleteDrugApprovedIndication() {
		sleep(3000);
		clickWhenClickable(firstDrugActionIcon);
		sleep(1000);
		clickWhenClickable(editDrugOption);
		sleep(2000);
		clickWhenClickable(approvedIndicationRowActionIcon);
		sleep(1000);
		clickWhenClickable(deleteApprovedIndicationOption);
		sleep(1000);
		clickWhenClickable(confirmDeleteApprovedIndicationButton);
		sleep(1000);
	}

	public void createDrugApprovedIndicationTestViewDeleteProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement allergyAllElement = wait
				.until(ExpectedConditions.elementToBeClickable(drugApprovedIndicationAllCheckboxLabel));
		allergyAllElement.click();
		sleep(3000);
		WebElement allergyViewElement = wait
				.until(ExpectedConditions.elementToBeClickable(drugApprovedIndicationDeleteLabel));
		allergyViewElement.click();
		sleep(3000);
	}

	public void allowOnlyViewAndEditForDrugApprovedIndicationTest() {
		sleep(2000);
		assertElementNotPresent(addApprovedIndicationButton);
		clickWhenClickable(approvedIndicationRowActionIcon);
		sleep(1000);
		assertElementNotPresent(deleteApprovedIndicationOption);
	}

	public void allowUserToViewAndEditDrugApprovedIndicationTest() {
		sleep(3000);
		clickWhenClickable(firstDrugActionIcon);
		sleep(1000);
		clickWhenClickable(editDrugOption);
		sleep(2000);
		clickWhenClickable(approvedIndicationRowActionIcon);
		sleep(1000);
		clickWhenClickable(editApprovedIndicationOption);
		sleep(1000);
		driver.findElement(approvedIndicationInput).sendKeys(Hooks.prop.getProperty("approved.indication"));
		clickWhenClickable(saveApprovedIndicationButton);
		sleep(1000);
	}

	public void createDrugApprovedIndicationViewEditProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement allergyAllElement = wait
				.until(ExpectedConditions.elementToBeClickable(drugApprovedIndicationAllCheckboxLabel));
		allergyAllElement.click();
		sleep(3000);
		WebElement allergyViewElement = wait
				.until(ExpectedConditions.elementToBeClickable(drugApprovedIndicationEditLabel));
		allergyViewElement.click();
		sleep(3000);
	}

	public void isDrugApprovedIndicationTestViewAddOnlyUser() {
		sleep(2000);
		clickWhenClickable(approvedIndicationRowActionButton);
		sleep(1000);
		assertElementNotPresent(editApprovedIndicationOption);
		assertElementNotPresent(deleteApprovedIndicationOption);
	}

	public void createDrugApprovedIndicationTestViewAddProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement allergyAllElement = wait
				.until(ExpectedConditions.elementToBeClickable(drugApprovedIndicationAllCheckboxLabel));
		allergyAllElement.click();
		sleep(3000);
		WebElement allergyViewElement = wait
				.until(ExpectedConditions.elementToBeClickable(drugApprovedIndicationAddCheckboxLabel));
		allergyViewElement.click();
		sleep(3000);
	}

	public void canUserViewAndAddDrugApprovedIndicationTest() {
		sleep(2000);
		clickWhenClickable(firstDrugRowActionButton);
		sleep(1000);
		clickWhenClickable(editDrugOption);
		sleep(1000);
		clickWhenClickable(addApprovedIndicationButton);
		sleep(1000);
		driver.findElement(approvedIndicationInput).sendKeys(Hooks.prop.getProperty("approved.indication"));
		clickWhenClickable(saveApprovedIndicationButton);
		sleep(1000);
	}

	// Drug
	public String allergiesBlankFieldValidation() {

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(addAllergyButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(saveICD10Button)).click();
		String result1 = captureToastMessages();
		if (result1.startsWith("ERROR"))
			return result1;

		return captureToastMessages();
	}

	public String star2ToStar1DrugsFilterBlankValidation() {

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
		String result1 = captureToastMessages();
		if (result1.startsWith("ERROR"))
			return result1;

		return captureToastMessages();
	}

	public String star2DrugsFilterBlankValidation() {

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
		String result1 = captureToastMessages();
		if (result1.startsWith("ERROR"))
			return result1;

		return captureToastMessages();
	}

	public String star1DrugsFilterBlankValidation() {

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(searchCollapseSvgIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
		String result1 = captureToastMessages();
		if (result1.startsWith("ERROR"))
			return result1;

		return captureToastMessages();
	}

	public String icd10BlankFieldValidation() {

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newICD10Button)).click();
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(saveICD10Button)).click();

		String result1 = captureToastMessages();
		if (result1.startsWith("ERROR"))
			return result1;

		return captureToastMessages();
	}

	public String editDrugTherapeuticFamilyIndicationsBlankValidation() {

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(firstRowActionIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOptionAllergy)).click();
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(addTherapeuticButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(saveTherapeuticButton)).click();

		String result1 = captureToastMessages();
		if (result1.startsWith("ERROR"))
			return result1;
		wait.until(ExpectedConditions.elementToBeClickable(closeTherapeuticModalButton)).click();

		wait.until(ExpectedConditions.elementToBeClickable(addFamilyButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(saveFamilyButton)).click();

		String result2 = captureToastMessages();
		if (result2.startsWith("ERROR"))
			return result2;

		wait.until(ExpectedConditions.elementToBeClickable(closeFamilyModalButton)).click();

		wait.until(ExpectedConditions.elementToBeClickable(addApprovedIndicationButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(saveApprovedIndicationButton)).click();

		String result3 = captureToastMessages();
		if (result3.startsWith("ERROR"))
			return result3;

		return captureToastMessages();
	}

	public String editDrugDiseaseStateBlankValidation() {

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(firstRowActionIcon)).click();
		wait.until(ExpectedConditions.elementToBeClickable(editOptionAllergy)).click();
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(chooseDiseaseStateInput)).click();
		wait.until(ExpectedConditions.elementToBeClickable(addDiseaseStateButtonIcon)).click();
		String result1 = captureToastMessages();
		if (result1.startsWith("ERROR"))
			return result1;

		wait.until(ExpectedConditions.elementToBeClickable(addDiseaseStateInput)).click();
		wait.until(ExpectedConditions.elementToBeClickable(addDiseaseStateButtonIcon)).click();
		String result2 = captureToastMessages();
		if (result2.startsWith("ERROR"))
			return result2;

		wait.until(ExpectedConditions.elementToBeClickable(chooseProgramInput)).click();
		wait.until(ExpectedConditions.elementToBeClickable(addProgramButtonIcon)).click();
		String result3 = captureToastMessages();
		if (result3.startsWith("ERROR"))
			return result3;

		wait.until(ExpectedConditions.elementToBeClickable(addProgramInput)).click();
		wait.until(ExpectedConditions.elementToBeClickable(addProgramIconImage)).click();
		String result4 = captureToastMessages();
		if (result4.startsWith("ERROR"))
			return result4;

		return captureToastMessages();
	}

	private String captureToastMessages() {
		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}
	}

	public String newDrugBlankSubmissionValidation() {

		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}

		wait.until(ExpectedConditions.elementToBeClickable(newDrugButton)).click();
		try {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		} catch (Exception ignored) {
		}
		wait.until(ExpectedConditions.elementToBeClickable(selectExistingDrugButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(addNewDrugButton)).click();

		try {
			wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(toastMessage, 0));
			List<WebElement> toasts = driver.findElements(toastMessage);
			StringBuilder allMessages = new StringBuilder();
			for (WebElement toast : toasts) {
				if (toast.isDisplayed()) {
					allMessages.append(toast.getText().trim()).append(" | ");
				}
			}
			return "SUCCESS: Validations displayed -> " + allMessages.toString();
		} catch (TimeoutException e) {
			return "ERROR: Validation toast message(s) not displayed";
		}

	}

	public void opendrugsPage(String fullUrl) {
		driver.get(fullUrl);
		wait.until(ExpectedConditions.urlContains("/Drug/Home/Drugs"));
	}

	public void verifyUserCannotAddEditDeleteDownloadOrUploadDrug() {
		sleep(2000);
		assertElementNotPresent(newDrugButton);
		assertElementNotPresent(downloadTemplateButton);
		assertElementNotPresent(uploadExcelButton);
		clickWhenClickable(firstRowDropdown);
		sleep(3000);
		assertElementNotPresent(editOption);
		assertElementNotPresent(deleteOption);
	}

	public void verifyUserCanViewAndExportExcelInDrug() {
		sleep(3000);
		clickWhenClickable(exportExcelButton);
	}

	public void verifyProfileWithViewAndExportExcelAccessToDrug() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(3000);
		WebElement drugSelectAll = wait.until(ExpectedConditions.elementToBeClickable(drugAllCheckboxLabel));
		drugSelectAll.click();
		sleep(3000);
		WebElement drugAddPermission = wait.until(ExpectedConditions.elementToBeClickable(drugsDownloadExcelLabel));
		drugAddPermission.click();
		sleep(2000);

	}

	public void verifyUserCannotAddEditDeleteDownloadOrExportDrug() {
		sleep(2000);
		assertElementNotPresent(newDrugButton);
		assertElementNotPresent(exportExcelButton);
		assertElementNotPresent(downloadTemplateButton);
		clickWhenClickable(firstRowDropdown);
		sleep(3000);
		assertElementNotPresent(editOption);
		assertElementNotPresent(deleteOption);
	}

	public void verifyUserCanViewAndUploadExcelInDrug() {
		sleep(3000);
		clickWhenClickable(uploadExcelButton);
		WebElement uploadInput = driver.findElement(uploadFileInput);
		String filePath = System.getProperty("user.dir") + "/src/test/resources/com/Documents/DrugTemplate.xlsx";
		uploadInput.sendKeys(filePath);
		sleep(3000);
	}

	public void verifyUserCannotAddEditDeleteUploadOrExportDrug() {
		sleep(2000);
		assertElementNotPresent(newDrugButton);
		assertElementNotPresent(uploadExcelButton);
		assertElementNotPresent(exportExcelButton);
		clickWhenClickable(firstRowDropdown);
		sleep(3000);
		assertElementNotPresent(editOption);
		assertElementNotPresent(deleteOption);
	}

	public void verifyUserCanViewAndDownloadTemplateInDrug() {
		sleep(3000);
		clickWhenClickable(downloadTemplateButton);
	}

	public void verifyUserCannotAddEditDownloadUploadOrExportDrug() {
		sleep(2000);
		assertElementNotPresent(newDrugButton);
		assertElementNotPresent(uploadExcelButton);
		assertElementNotPresent(exportExcelButton);
		assertElementNotPresent(downloadTemplateButton);
		clickWhenClickable(firstRowDropdown);
		sleep(3000);
		assertElementNotPresent(editOption);
	}

	public void verifyUserCanViewAndDeleteInDrug() {
		sleep(3000);
		clickWhenClickable(firstRowDropdown);
		sleep(3000);
		clickWhenClickable(deleteOption);
		sleep(3000);
		clickWhenClickable(deleteConfirmButton);
	}

	public void verifyUserCannotDeleteDownloadUploadOrExportDrug() {
		sleep(4000);
		assertElementNotPresent(uploadExcelButton);
		assertElementNotPresent(exportExcelButton);
		assertElementNotPresent(downloadTemplateButton);
		clickWhenClickable(firstRowDropdown);
		sleep(3000);
		assertElementNotPresent(deleteOption);
	}

	public void verifyUserCanViewAndAddDrug() {
		sleep(3000);
		clickWhenClickable(newDrugButton);
		sleep(2000);
		clickWhenClickable(filterButton);
		driver.findElement(drugNameFilterInput).sendKeys(Hooks.prop.getProperty("drug.name.filter"));
		driver.findElement(ndcFilterInput).sendKeys(Hooks.prop.getProperty("ndc.filter"));
		clickWhenClickable(addNewDrugButton);
		sleep(2000);
		clickWhenClickable(saveButton);
	}

	public void verifyProfileWithViewAndUploadExcelAccessToDrug() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(3000);
		WebElement drugSelectAll = wait.until(ExpectedConditions.elementToBeClickable(drugAllCheckboxLabel));
		drugSelectAll.click();
		sleep(3000);
		WebElement drugAddPermission = wait.until(ExpectedConditions.elementToBeClickable(drugsUploadExcelLabel));
		drugAddPermission.click();
		sleep(2000);

	}

	public void verifyProfileWithViewAndDownloadTemplateAccessToDrug() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(3000);
		WebElement drugSelectAll = wait.until(ExpectedConditions.elementToBeClickable(drugAllCheckboxLabel));
		drugSelectAll.click();
		sleep(3000);
		WebElement drugAddPermission = wait.until(ExpectedConditions.elementToBeClickable(drugsDownloadTemplateLabel));
		drugAddPermission.click();
		sleep(2000);

	}

	public void createDrugViewAndDeleteProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(3000);
		WebElement drugSelectAll = wait.until(ExpectedConditions.elementToBeClickable(drugAllCheckboxLabel));
		drugSelectAll.click();
		sleep(3000);
		WebElement drugAddPermission = wait.until(ExpectedConditions.elementToBeClickable(drugDeleteLabel));
		drugAddPermission.click();
		sleep(2000);

	}

	public void createDrugViewAndAddProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(3000);
		WebElement drugSelectAll = wait.until(ExpectedConditions.elementToBeClickable(drugAllCheckboxLabel));
		drugSelectAll.click();
		sleep(3000);
		WebElement drugAddPermission = wait.until(ExpectedConditions.elementToBeClickable(drugAddCheckboxLabel));
		drugAddPermission.click();
		sleep(2000);

	}

	public void createDrugViewOnlyProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		sleep(3000);
		WebElement drugSelectAll = wait.until(ExpectedConditions.elementToBeClickable(drugAllCheckboxLabel));
		drugSelectAll.click();
		sleep(3000);
		WebElement drugAddPermission = wait.until(ExpectedConditions.elementToBeClickable(drugViewPermissionLabel));
		drugAddPermission.click();
		sleep(2000);

	}

	public void verifyUserCannotAddEditDeleteOrExportDrug() {
		sleep(4000);
		assertElementNotPresent(newDrugButton);
		assertElementNotPresent(uploadExcelButton);
		assertElementNotPresent(exportExcelButton);
		assertElementNotPresent(downloadTemplateButton);
		clickWhenClickable(firstRowDropdown);
		sleep(3000);
		assertElementNotPresent(editOption);
		assertElementNotPresent(deleteOption);
	}

	// Disease State
	public void verifyUserCannotAddDiseaseStateTest() {
		sleep(2000);
		clickWhenClickable(addDiseaseStateInput);
		sleep(1000);
		assertElementNotPresent(addDiseaseStateButtonIcon);
	}

	public void verifyUserCanViewAndDeleteDiseaseStateTest() {
		sleep(3000);
		clickWhenClickable(firstRowActionIcon);
		sleep(1000);
		clickWhenClickable(editOption);
		sleep(2000);
		clickWhenClickable(deleteIcon);
		sleep(1000);
	}

	public void createProfileWithDiseaseStateViewAndDeleteAccess() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement allergyAllElement = wait.until(ExpectedConditions.elementToBeClickable(drugDiseaseStateAllLabel));
		allergyAllElement.click();
		sleep(3000);
		WebElement allergyViewElement = wait
				.until(ExpectedConditions.elementToBeClickable(drugDiseaseStateDeleteLabel));
		allergyViewElement.click();
		sleep(3000);
	}

	public void setDiseaseStateTestNoDeletePermission() {
		sleep(3000);
		clickWhenClickable(firstDrugActionIcon);
		sleep(1000);
		clickWhenClickable(editDrugOption);
		sleep(2000);
		assertElementNotPresent(deleteDiseaseStateIcon);
	}

	public void allowUserToViewAndAddDiseaseStateTest() {
		sleep(3000);
		clickWhenClickable(firstDrugActionIcon);
		sleep(1000);
		clickWhenClickable(editDrugOption);
		sleep(1000);
		clickWhenClickable(addDiseaseStateCheckbox);
		sleep(1000);
		driver.findElement(diseaseStateNameInput).sendKeys(Hooks.prop.getProperty("disease.state.name"));
		clickWhenClickable(addDiseaseStateButton);
		sleep(1000);
		clickWhenClickable(saveDrugButton);
	}

	public void createDiseaseStateTestViewAddProfile() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement allergyAllElement = wait.until(ExpectedConditions.elementToBeClickable(drugDiseaseStateAllLabel));
		allergyAllElement.click();
		sleep(3000);
		WebElement allergyViewElement = wait.until(ExpectedConditions.elementToBeClickable(drugDiseaseStateAddLabel));
		allergyViewElement.click();
		sleep(3000);
	}

	// Program
	public void verifyUserCannotAddProgramTest() {
		sleep(2000);
		clickWhenClickable(addProgramInput);
		sleep(1000);
		assertElementNotPresent(addProgramButtonIcon);
	}

	public void verifyUserCanViewAndDeleteProgramTest() {
		sleep(2000);
		clickWhenClickable(firstRowActionIcon);
		sleep(1000);
		clickWhenClickable(editOption);
		sleep(2000);
		clickWhenClickable(deleteProgramIconPath);
		sleep(1000);
	}

	public void setupProfileWithProgramViewAndDeletePermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement allergyAllElement = wait.until(ExpectedConditions.elementToBeClickable(drugProgramAllLabel));
		allergyAllElement.click();
		sleep(3000);
		WebElement allergyViewElement = wait.until(ExpectedConditions.elementToBeClickable(drugProgramDeleteLabel));
		allergyViewElement.click();
		sleep(3000);
	}

	public void verifyUserCannotDeleteProgramTest() {
		sleep(2000);
		clickWhenClickable(firstRowActionIcon);
		sleep(1000);
		clickWhenClickable(editOption);
		sleep(2000);
		assertElementNotPresent(deleteProgramIconPath);
	}

	public void validateViewAndAddAccessForProgramTest() {
		sleep(2000);
		clickWhenClickable(firstRowActionIcon);
		sleep(1000);
		clickWhenClickable(editOption);
		sleep(1000);
		clickWhenClickable(addProgramInput);
		sleep(1000);
		driver.findElement(programNameField).sendKeys(Hooks.prop.getProperty("program.name"));
		clickWhenClickable(addProgramButtonIcon);
		sleep(1000);
		clickWhenClickable(saveButton);
	}

	public void setupProfileWithProgramViewAndAddPermissions() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(preloader));
		sleep(2000);
		WebElement allModules = wait.until(ExpectedConditions.elementToBeClickable(selectAllModuleLabel));
		allModules.click();
		WebElement allergyAllElement = wait.until(ExpectedConditions.elementToBeClickable(drugProgramAllLabel));
		allergyAllElement.click();
		sleep(3000);
		WebElement allergyViewElement = wait.until(ExpectedConditions.elementToBeClickable(drugProgramAddLabel));
		allergyViewElement.click();
		sleep(3000);
	}

	// ==== Utility Methods ====
	public void assertElementPresent(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (TimeoutException e) {
			Assert.fail("Element not present after wait: " + locator.toString());
		}
	}

	public void assertElementNotPresent(By locator) {
		List<WebElement> elements = driver.findElements(locator);
		Assert.assertTrue("Element should not be present: " + locator.toString(), elements.isEmpty());
	}

	public void clickWhenClickable(By locator) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
		} catch (ElementClickInterceptedException e) {
			System.out.println("Click intercepted for element: " + locator.toString() + ". Retrying with JS click.");
			try {
				WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				((JavascriptExecutor) driver).executeScript(
						"var evt = new MouseEvent('click', {bubbles: true, cancelable: true, view: window}); arguments[0].dispatchEvent(evt);",
						element);
			} catch (Exception ex) {
				System.out.println("JS click also failed for element: " + locator.toString());
				throw ex;
			}
		}
	}

}
