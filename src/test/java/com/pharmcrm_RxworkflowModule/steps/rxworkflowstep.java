package com.pharmcrm_RxworkflowModule.steps;

import org.junit.Assert;
import com.pharmcrm_RxworkflowModule.pages.rxworkflowpage;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class rxworkflowstep {

	private rxworkflowpage rxworkflowPage;

	// Dashboard
	@Then("I navigate to the Workflow Dashboard test")
	public void iNavigateToWorkflowDashboardTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String dashboardUrl = Hooks.prop.getProperty("dashboardUrl");
		Assert.assertNotNull("dashboardUrl is missing in config", dashboardUrl);
		String fullUrl = baseUrl + dashboardUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openDashboardPage(fullUrl);
		Assert.assertTrue("Dashboard page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Workflow/Home/Dashboard"));

	}

	@Then("I click on Add Template test")
	public void iClickOnAddTemplateTest() {
		rxworkflowPage.verifyAddTemplateIsClicked();
		System.out.println("Error validation triggered: Validation messages are displayed for required fields");
		Hooks.scenario.log("Error validation triggered: Validation messages are displayed for required fields");
	}

	// Control Audit Class
	@Then("the user should NOT be able to Export Control Audit Class5 data to PDF")
	public void shouldNotExportControlAuditClass5DataToPdfTest() {
		rxworkflowPage.cannotExportControlAuditClass5DataToPdf();

	}

	@Then("the user should NOT be able to Export Control Audit Class5 data to Excel")
	public void shouldNotExportControlAuditClass5DataToExcelTest() {
		rxworkflowPage.cannotExportControlAuditClass5DataToExcel();

	}

	@Then("the user should NOT be able to perform Drug Audit Dispense Quantity Update in Control Audit Class5")
	public void shouldNotPerformDrugAuditDispenseQuantityUpdateInControlAuditClass5Test() {
		rxworkflowPage.cannotPerformDrugAuditDispenseQuantityUpdateInControlAuditClass5();

	}

	@Then("the user should NOT be able to perform Drug Audit Dispense Date Update in Control Audit Class5")
	public void verifyDrugAuditDispenseDateUpdateIsRestrictedInControlAuditClass5Test() {
		rxworkflowPage.cannotPerformDrugAuditDispenseDateUpdateInControlAuditClass5();

	}

	@Then("the user should NOT be able to perform Drug Dispense Audit Add action in Control Audit Class5")
	public void shouldNotPerformDrugDispenseAuditAddInControlAuditClass5Test() {
		rxworkflowPage.cannotPerformDrugDispenseAuditAddInControlAuditClass5();

	}

	@Then("the user should NOT be able to perform Drug Dispense Credit Add action in Control Audit Class5")
	public void verifyDrugDispenseCreditAddIsRestrictedInControlAuditClass5Test() {
		rxworkflowPage.cannotPerformDrugDispenseCreditAddInControlAuditClass5();

	}

	@Then("I create a profile with View Only permission for Control Audit Class5")
	public void shouldNotPerformDrugDispenseCreditAddInControlAuditClass5Test() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldNotExportControlAuditClass5DataToPdfTest();
		rxworkflowPage.clickSubmitButton();
	}

	@Then("the user should be able to Export Control Audit Class5 data to PDF")
	public void shouldExportControlAuditClass5DataToPdfTest() {
		rxworkflowPage.executeControlAuditClass5DataExportToPdf();

	}

	@Then("the user should be able to Export Control Audit Class5 data to Excel")
	public void shouldExportControlAuditClass5DataToExcelTest() {
		rxworkflowPage.executeControlAuditClass5DataExportToExcel();

	}

	@Then("the user should be able to perform Drug Audit Dispense Quantity Update in Control Audit Class5")
	public void shouldPerformDrugAuditDispenseQuantityUpdateInControlAuditClass5Test() {
		rxworkflowPage.executeDrugAuditDispenseQuantityUpdateInControlAuditClass5();

	}

	@Then("the user should be able to perform Drug Audit Dispense Date Update in Control Audit Class5")
	public void shouldPerformDrugAuditDispenseDateUpdateInControlAuditClass5Test() {
		rxworkflowPage.executeDrugAuditDispenseDateUpdateInControlAuditClass5();

	}

	@Then("the user should be able to perform Drug Dispense Audit Add action in Control Audit Class5")
	public void verifyDrugDispenseAuditAddIsPermittedInControlAuditClass5Test() {
		rxworkflowPage.executeDrugDispenseAuditAddInControlAuditClass5();

	}

	@Then("the user should be able to perform Drug Dispense Credit Add action in Control Audit Class5")
	public void verifyDrugDispenseCreditAddIsPermittedInControlAuditClass5Test() {
		rxworkflowPage.executeDrugDispenseCreditAddInControlAuditClass5();

	}

	@Then("the user should be able to open Details View in Control Audit Class5")
	public void shouldAllowOpenDetailsViewInControlAuditClass5Test() {
		rxworkflowPage.executeOpenDetailsViewInControlAuditClass5();

	}

	@Then("the user should be able to view Control Audit Class5 data")
	public void shouldViewControlAuditClass5DataTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String controlAuditClass5Url = Hooks.prop.getProperty("controlAuditClass5Url");
		Assert.assertNotNull("controlAuditClass5Url is missing in config", controlAuditClass5Url);
		String fullUrl = baseUrl + controlAuditClass5Url;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openControlAuditClass5Page(fullUrl);
		Assert.assertTrue("Control Audit Class 5 page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Workflow/Home/ControlAudit?drugClass=5"));
	}

	@Then("I create a profile with all permissions for Control Audit Class5")
	public void shouldPerformDrugDispenseCreditAddInControlAuditClass5Test() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldViewControlAuditClass5DataTest();
		rxworkflowPage.clickSubmitButton();
	}

	@Then("I create a profile with View Only permission for Control Audit Class4")
	public void shouldNotPerformDrugDispenseCreditAddInControlAuditClass4Test() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldNotExportControlAuditClass4DataToPdfTest();
		rxworkflowPage.clickSubmitButton();
	}

	@Then("the user should be able to Export Control Audit Class4 data to PDF")
	public void shouldExportControlAuditClass4DataToPdfTest() {
		rxworkflowPage.executeControlAuditClass4DataExportToPdf();

	}

	@Then("the user should be able to Export Control Audit Class4 data to Excel")
	public void shouldExportControlAuditClass4DataToExcelTest() {
		rxworkflowPage.executeControlAuditClass4DataExportToExcel();

	}

	@Then("the user should be able to perform Drug Audit Dispense Quantity Update in Control Audit Class4")
	public void shouldPerformDrugAuditDispenseQuantityUpdateInControlAuditClass4Test() {
		rxworkflowPage.executeDrugAuditDispenseQuantityUpdateInControlAuditClass4();

	}

	@Then("the user should be able to perform Drug Audit Dispense Date Update in Control Audit Class4")
	public void shouldPerformDrugAuditDispenseDateUpdateInControlAuditClass4Test() {
		rxworkflowPage.executeDrugAuditDispenseDateUpdateInControlAuditClass4();

	}

	@Then("the user should be able to perform Drug Dispense Audit Add action in Control Audit Class4")
	public void shouldAllowDrugDispenseAuditAddInControlAuditClass4Test() {
		rxworkflowPage.executeDrugDispenseAuditAddInControlAuditClass4();

	}

	@Then("the user should be able to perform Drug Dispense Credit Add action in Control Audit Class4")
	public void verifyDrugDispenseCreditAddIsPermittedInControlAuditClass4Test() {
		rxworkflowPage.executeDrugDispenseCreditAddInControlAuditClass4();

	}

	@Then("the user should NOT be able to Export Control Audit Class4 data to PDF")
	public void shouldNotExportControlAuditClass4DataToPdfTest() {
		rxworkflowPage.cannotExportControlAuditClass4DataToPdf();

	}

	@Then("the user should NOT be able to Export Control Audit Class4 data to Excel")
	public void shouldNotExportControlAuditClass4DataToExcelTest() {
		rxworkflowPage.cannotExportControlAuditClass4DataToExcel();

	}

	@Then("the user should NOT be able to perform Drug Audit Dispense Quantity Update in Control Audit Class4")
	public void shouldNotPerformDrugAuditDispenseQuantityUpdateInControlAuditClass4Test() {
		rxworkflowPage.cannotPerformDrugAuditDispenseQuantityUpdateInControlAuditClass4();

	}

	@Then("the user should NOT be able to perform Drug Audit Dispense Date Update in Control Audit Class4")
	public void shouldNotPerformDrugAuditDispenseDateUpdateInControlAuditClass4Test() {
		rxworkflowPage.cannotPerformDrugAuditDispenseDateUpdateInControlAuditClass4();

	}

	@Then("the user should NOT be able to perform Drug Dispense Audit Add action in Control Audit Class4")
	public void shouldNotPerformDrugDispenseAuditAddInControlAuditClass4Test() {
		rxworkflowPage.cannotPerformDrugDispenseAuditAddInControlAuditClass4();

	}

	@Then("the user should NOT be able to perform Drug Dispense Credit Add action in Control Audit Class4")
	public void verifyDrugDispenseCreditAddIsRestrictedInControlAuditClass4Test() {
		rxworkflowPage.cannotPerformDrugDispenseCreditAddInControlAuditClass4();

	}

	@Then("the user should be able to open Details View in Control Audit Class4")
	public void shouldOpenDetailsViewInControlAuditClass4Test() {
		rxworkflowPage.executeOpenDetailsViewInControlAuditClass4();

	}

	@Then("the user should be able to view Control Audit Class4 data")
	public void shouldViewControlAuditClass4DataTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String controlAuditClass4Url = Hooks.prop.getProperty("controlAuditClass4Url");
		Assert.assertNotNull("controlAuditClass4Url is missing in config", controlAuditClass4Url);
		String fullUrl = baseUrl + controlAuditClass4Url;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openControlAuditClass4Page(fullUrl);
		Assert.assertTrue("Control Audit Class 4 page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Workflow/Home/ControlAudit?drugClass=4"));
	}

	@Then("I create a profile with all permissions for Control Audit Class4")
	public void shouldPerformDrugDispenseCreditAddInControlAuditClass4Test() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldViewControlAuditClass4DataTest();
		rxworkflowPage.clickSubmitButton();
	}

	@Then("the user should NOT be able to Export Control Audit Class3 data to PDF")
	public void shouldNotExportControlAuditClass3DataToPdfTest() {
		rxworkflowPage.cannotExportControlAuditClass3DataToPdf();

	}

	@Then("the user should NOT be able to Export Control Audit Class3 data to Excel")
	public void shouldNotExportControlAuditClass3DataToExcelTest() {
		rxworkflowPage.cannotExportControlAuditClass3DataToExcel();

	}

	@Then("the user should NOT be able to perform Drug Audit Dispense Quantity Update in Control Audit Class3")
	public void shouldNotPerformDrugAuditDispenseQuantityUpdateInControlAuditClass3Test() {
		rxworkflowPage.cannotPerformDrugAuditDispenseQuantityUpdateInControlAuditClass3();

	}

	@Then("the user should NOT be able to perform Drug Audit Dispense Date Update in Control Audit Class3")
	public void shouldNotPerformDrugAuditDispenseDateUpdateInControlAuditClass3Test() {
		rxworkflowPage.cannotPerformDrugAuditDispenseDateUpdateInControlAuditClass3();

	}

	@Then("the user should NOT be able to perform Drug Dispense Audit Add action in Control Audit Class3")
	public void shouldNotPerformDrugDispenseAuditAddInControlAuditClass3Test() {
		rxworkflowPage.cannotPerformDrugDispenseAuditAddInControlAuditClass3();

	}

	@Then("the user should NOT be able to perform Drug Dispense Credit Add action in Control Audit Class3")
	public void testDrugDispenseCreditAddNotAllowedInControlAuditClass3() {
		rxworkflowPage.cannotPerformDrugDispenseCreditAddInControlAuditClass3();

	}

	@Then("the user should be able to view Control Audit Class3 data")
	public void verifyViewControlAuditClass3DataIsPermittedTest() {

	}

	@Then("I create a profile with View Only permission for Control Audit Class3 module")
	public void shouldNotPerformDrugDispenseCreditAddInControlAuditClass3Test() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldNotExportControlAuditClass3DataToPdfTest();
		rxworkflowPage.clickSubmitButton();
	}

	@Then("the user should be able to Export Control Audit Class3 data to PDF")
	public void shouldExportControlAuditClass3DataToPdfTest() {
		rxworkflowPage.executeControlAuditClass3DataExportToPdf();

	}

	@Then("the user should be able to Export Control Audit Class3 data to Excel")
	public void shouldExportControlAuditClass3DataToExcelTest() {
		rxworkflowPage.executeControlAuditClass3DataExportToExcel();

	}

	@Then("the user should be able to perform Drug Audit Dispense Quantity Update in Control Audit Class3")
	public void shouldPerformDrugAuditDispenseQuantityUpdateInControlAuditClass3Test() {
		rxworkflowPage.executeDrugAuditDispenseQuantityUpdateInControlAuditClass3();

	}

	@Then("the user should be able to perform Drug Audit Dispense Date Update in Control Audit Class3")
	public void shouldPerformDrugAuditDispenseDateUpdateInControlAuditClass3Test() {
		rxworkflowPage.executeDrugAuditDispenseDateUpdateInControlAuditClass3();

	}

	@Then("the user should be able to perform Drug Dispense Audit Add action in Control Audit Class3")
	public void shouldPerformDrugDispenseAuditAddInControlAuditClass3Test() {
		rxworkflowPage.executeDrugDispenseAuditAddInControlAuditClass3();

	}

	@Then("the user should be able to perform Drug Dispense Credit Add action in Control Audit Class3")
	public void verifyDrugDispenseCreditAddIsPermittedInControlAuditClass3Test() {
		rxworkflowPage.executeDrugDispenseCreditAddInControlAuditClass3();

	}

	@Then("the user should be able to open Details View in Control Audit Class3")
	public void shouldOpenDetailsViewInControlAuditClass3Test() {
		rxworkflowPage.executeOpenDetailsViewInControlAuditClass3();

	}

	@Then("the user should be able to view Control Audit Class3")
	public void shouldViewControlAuditClass3DataTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String controlAuditClass3Url = Hooks.prop.getProperty("controlAuditClass3Url");
		Assert.assertNotNull("controlAuditClass3Url is missing in config", controlAuditClass3Url);
		String fullUrl = baseUrl + controlAuditClass3Url;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openControlAuditClass3Page(fullUrl);
		Assert.assertTrue("Control Audit Class 3 page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Workflow/Home/ControlAudit?drugClass=3"));
	}

	@Then("I create a profile with all permissions for Control Audit Class3")
	public void shouldPerformDrugDispenseCreditAddInControlAuditClass3Test() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldExportControlAuditClass3DataToPdfTest();
		rxworkflowPage.clickSubmitButton();
	}

	@Then("the user should NOT be able to perform Drug Audit Dispense Quantity Update in Control Audit Class2")
	public void verifyDrugAuditDispenseQuantityUpdateIsRestrictedInControlAuditClass2Test() {
		rxworkflowPage.cannotPerformDrugAuditDispenseQuantityUpdateInControlAuditClass2();

	}

	@Then("the user should NOT be able to Export Control Audit Class2 data to PDF")
	public void shouldNotExportControlAuditClass2DataToPdfTest() {
		rxworkflowPage.cannotExportControlAuditClass2DataToPdf();

	}

	@Then("the user should NOT be able to Export Control Audit Class2 data to Excel")
	public void shouldNotExportControlAuditClass2DataToExcelTest() {
		rxworkflowPage.cannotExportControlAuditClass2DataToExcel();

	}

	@Then("should NOT be able to perform Drug Audit Dispense Quantity Update in Control Audit Class2")
	public void shouldNotPerformDrugAuditDispenseQuantityUpdateInControlAuditClass2Test() {

	}

	@Then("the user should NOT be able to perform Drug Audit Dispense Date Update in Control Audit Class2")
	public void shouldNotPerformDrugAuditDispenseDateUpdateInControlAuditClass2Test() {
		rxworkflowPage.cannotPerformDrugAuditDispenseDateUpdateInControlAuditClass2();

	}

	@Then("the user should NOT be able to perform Drug Dispense Audit Add action in Control Audit Class2")
	public void shouldNotPerformDrugDispenseAuditAddInControlAuditClass2Test() {
		rxworkflowPage.cannotPerformDrugDispenseAuditAddInControlAuditClass2();

	}

	@Then("the user should NOT be able to perform Drug Dispense Credit Add action in Control Audit Class2")
	public void shouldNotPerformDrugDispenseCreditAddInControlAuditClass2Test() {
		rxworkflowPage.cannotPerformDrugDispenseCreditAddInControlAuditClass2();

	}

	@Then("I create a profile with View Only permission for Control Audit Class2")
	public void shouldAccessControlAuditClass2RecordsTest() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.verifyViewControlAuditClass2DataIsAccessibleTest();
		rxworkflowPage.clickSubmitButton();
	}

	@Then("the user should be able to Export Control Audit Class2 data to PDF")
	public void shouldExportControlAuditClass2DataToPdfTest() {
		rxworkflowPage.canExportControlAuditClass2DataToPdf();

	}

	@Then("the user should be able to Export Control Audit Class2 data to Excel")
	public void shouldExportControlAuditClass2DataToExcelTest() {
		rxworkflowPage.canExportControlAuditClass2DataToExcel();

	}

	@Then("the user should be able to perform Drug Audit Dispense Quantity Update in Control Audit Class2")
	public void shouldPerformDrugAuditDispenseQuantityUpdateInControlAuditClass2Test() {
		rxworkflowPage.canPerformDrugAuditDispenseQuantityUpdateInControlAuditClass2();

	}

	@Then("the user should be able to perform Drug Audit Dispense Date Update in Control Audit Class2")
	public void shouldPerformDrugAuditDispenseDateUpdateInControlAuditClass2Test() {
		rxworkflowPage.canPerformDrugAuditDispenseDateUpdateInControlAuditClass2();

	}

	@Then("the user should be able to perform Drug Dispense Audit Add action in Control Audit Class2")
	public void verifyDrugDispenseAuditAddIsPermittedInControlAuditClass2Test() {
		rxworkflowPage.canPerformDrugDispenseAuditAddInControlAuditClass2();

	}

	@Then("the user should be able to perform Drug Dispense Credit Add action in Control Audit Class2")
	public void shouldPerformDrugDispenseCreditAddInControlAuditClass2Test() {
		rxworkflowPage.canPerformDrugDispenseCreditAddInControlAuditClass2();

	}

	@Then("the user should be able to open Details View in Control Audit Class2")
	public void shouldOpenDetailsViewInControlAuditClass2Test() {
		rxworkflowPage.canOpenDetailsViewInControlAuditClass2();

	}

	@Then("the user should be able to view Control Audit Class2 data")
	public void shouldViewControlAuditClass2DataTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String controlAuditClass2Url = Hooks.prop.getProperty("controlAuditClass2Url");
		Assert.assertNotNull("controlAuditClass2Url is missing in config", controlAuditClass2Url);
		String fullUrl = baseUrl + controlAuditClass2Url;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openControlAuditClass2Page(fullUrl);
		Assert.assertTrue("Control Audit Class 2 page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Workflow/Home/ControlAudit?drugClass=2"));
	}

	@Then("I create a profile with all permissions for Control Audit Class2")
	public void shouldPerformDrugDispenseAuditAddInControlAuditClass2Test() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldExportControlAuditClass2DataToPdfTest();
		rxworkflowPage.clickSubmitButton();
	}

	@Then("the user should NOT be able to Export Control Audit Class1 data to PDF")
	public void shouldNotExportControlAuditClassDataToPdfTest() {
		rxworkflowPage.cannotExportControlAuditClass1DataToPdf();

	}

	@Then("the user should NOT be able to Export Control Audit Class1 data to Excel")
	public void shouldNotExportControlAuditClassDataToExcelTest() {
		rxworkflowPage.cannotExportControlAuditClass1DataToExcel();

	}

	@Then("the user should NOT be able to perform Drug Audit Dispense Quantity Update in Control Audit Class1")
	public void shouldNotPerformDrugAuditDispenseQuantityUpdateInControlAuditTest() {
		rxworkflowPage.cannotPerformDrugAuditDispenseQuantityUpdateInControlAuditClass1();

	}

	@Then("the user should NOT be able to perform Drug Audit Dispense Date Update in Control Audit Class1")
	public void shouldNotPerformDrugAuditDispenseDateUpdateInControlAuditTest() {
		rxworkflowPage.cannotPerformDrugAuditDispenseDateUpdateInControlAuditClass1();

	}

	@Then("the user should NOT be able to perform Drug Dispense Audit Add action in Control Audit Class1")
	public void shouldNotPerformDrugDispenseAuditAddInControlAuditTest() {
		rxworkflowPage.cannotPerformDrugDispenseAuditAddInControlAuditClass1();

	}

	@Then("the user should NOT be able to perform Drug Dispense Credit Add action in Control Audit Class1")
	public void shouldNotPerformDrugDispenseCreditAddInControlAuditTest() {
		rxworkflowPage.cannotPerformDrugDispenseCreditAddInControlAuditClass1();

	}

	@Then("the user should be able to Export Control Audit Class1 data to PDF")
	public void shouldExportControlAuditClassDataToPdfTest() {
		rxworkflowPage.canExportControlAuditClass1DataToPdf();

	}

	@Then("the user should be able to Export Control Audit Class1 data to Excel")
	public void shouldExportControlAuditClassDataToExcelTest() {
		rxworkflowPage.canExportControlAuditClass1DataToExcel();

	}

	@Then("the user should be able to perform Drug Audit Dispense Quantity Update in Control Audit Class1")
	public void shouldPerformDrugAuditDispenseQuantityUpdateInControlAuditTest() {
		rxworkflowPage.canPerformDrugAuditDispenseQuantityUpdateInControlAuditClass1();

	}

	@Then("the user should be able to perform Drug Audit Dispense Date Update in Control Audit Class1")
	public void shouldPerformDrugAuditDispenseDateUpdateInControlAuditTest() {
		rxworkflowPage.canPerformDrugAuditDispenseDateUpdateInControlAuditClass1();

	}

	@Then("the user should be able to perform Drug Dispense Audit Add action in Control Audit Class1")
	public void shouldPerformDrugDispenseAuditAddInControlAuditTest() {
		rxworkflowPage.canPerformDrugDispenseAuditAddInControlAuditClass1();

	}

	@Then("the user should be able to perform Drug Dispense Credit Add action in Control Audit Class1")
	public void shouldPerformDrugDispenseCreditAddInControlAuditTest() {
		rxworkflowPage.addDrugDispenseCreditInControlAuditClass1();

	}

	@Then("the user should be able to open Details View in Control Audit Class1")
	public void openDetailsViewInControlAuditTest() {
		rxworkflowPage.shouldOpenDetailsViewInControlAuditTest();

	}

	@Then("the user should be able to view Control Audit Class1")
	public void enableControlAuditClassDataViewing() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String controlAuditClass1Url = Hooks.prop.getProperty("controlAuditClass1Url");
		Assert.assertNotNull("controlAuditClass1Url is missing in config", controlAuditClass1Url);
		String fullUrl = baseUrl + controlAuditClass1Url;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openControlAuditClass1Page(fullUrl);
		Assert.assertTrue("Control Audit Class 1 page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Workflow/Home/ControlAudit?drugClass=1"));
	}

	@And("I create a profile with View Only permission for Control Audit Class1")
	public void shouldViewControlAuditClass1DataTest() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldAccessControlAuditClass1RecordsTest();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with all permissions for Control Audit Class1")
	public void shouldPerformDrugDispenseCreditAddInControlAuditClass1Test() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldPerformDrugAuditDispenseDateUpdateInControlAuditClass1Test();
		rxworkflowPage.clickSubmitButton();

	}

	// Medication Activity
	@Then("the user should be able to view and Add Medication Activity")
	public void enableMedicationActivityViewAndAdd() {
		rxworkflowPage.allowMedicationActivityViewingAndAddition();

	}

	@Then("the user should not be able to add Medication Activity")
	public void restrictMedicationActivityAddition() {
		rxworkflowPage.disableMedicationActivityAdd();

	}

	@Then("the user should be able to view Medication Activity")
	public void enableMedicationActivityViewing() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String medicationSyncUrl = Hooks.prop.getProperty("medicationSyncUrl");
		Assert.assertNotNull("medicationSyncUrl is missing in config", medicationSyncUrl);
		String fullUrl = baseUrl + medicationSyncUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openMedicationSyncPage(fullUrl);
		Assert.assertTrue("Medication Sync page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Workflow/Home/MedicationSyncReminder"));
		rxworkflowPage.allowMedicationActivityDataAccess();

	}

	@And("I create a profile with View and Add permission for Medication Activity")
	public void createMedicationActivityProfileWithViewAndAddPermission() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.setupMedicationActivityProfileViewAndAdd();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with only View permission for Medication Activity")
	public void createMedicationActivityProfileWithViewPermission() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.setupMedicationActivityProfileViewOnly();
		rxworkflowPage.clickSubmitButton();

	}

	// Audit Work Flow
	@Then("the user should not be able to export Audit Workflow data test")
	public void restrictAuditWorkflowDataExport() {
		rxworkflowPage.disableAuditWorkflowDataExport();

	}

	@Then("the user should not be able to delete HardCopy in Audit Workflow test")
	public void restrictAuditWorkflowHardCopyDeletion() {
		rxworkflowPage.disableHardCopyDeleteInAuditWorkflow();

	}

	@Then("the user should not be able to add or edit HardCopy in Audit Workflow test")
	public void restrictAuditWorkflowHardCopyAddAndEdit() {
		rxworkflowPage.disableHardCopyModificationInAuditWorkflow();

	}

	@And("I create a profile with only View permission for Audit Workflow Module test")
	public void createAuditWorkflowProfileWithViewPermission() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.setupAuditWorkflowProfileViewOnly();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should be able to export Audit Workflow data test")
	public void enableAuditWorkflowDataExport() {
		rxworkflowPage.allowAuditWorkflowDataExport();

	}

	@Then("the user should be able to delete HardCopy in Audit Workflow test")
	public void enableAuditWorkflowHardCopyDeletion() {
		rxworkflowPage.allowHardCopyDeleteInAuditWorkflow();

	}

	@Then("the user should be able to add and edit HardCopy in Audit Workflow test")
	public void enableAuditWorkflowHardCopyAddAndEdit() {
		rxworkflowPage.allowHardCopyModificationInAuditWorkflow();

	}

	@Then("the user should be able to view Audit Workflow data test")
	public void enableAuditWorkflowDataViewing() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String auditWorkflowUrl = Hooks.prop.getProperty("auditWorkflowUrl");
		Assert.assertNotNull("auditWorkflowUrl is missing in config", auditWorkflowUrl);
		String fullUrl = baseUrl + auditWorkflowUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openAuditWorkflowPage(fullUrl);
		Assert.assertTrue("Dashboard page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Workflow/Home/AuditWorkflow"));
	}

	@And("I create a profile with the following permissions for Audit Workflow Module test")
	public void createAuditWorkflowProfileWithPermissions() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.setupAuditWorkflowProfilePermissions();
		rxworkflowPage.clickSubmitButton();

	}

	// Followup Work Flow
	@And("I create a profile with only View permission for Followup Workflow Module test")
	public void createFollowupWorkflowProfileWithViewPermission() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.setupFollowupWorkflowViewOnlyProfile();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should be able to export Followup Workflow data to Excel test")
	public void enableFollowupWorkflowDataExportToExcel() {
		rxworkflowPage.allowFollowupWorkflowExcelExport();

	}

	@Then("the user should have full program access in Followup Workflow test")
	public void grantFollowupWorkflowFullProgramAccess() {
		rxworkflowPage.enableFollowupWorkflowFullAccess();

	}

	@Then("the user should be able to set Grid Template Company Default checkbox Followup Work Flow test")
	public void enableFollowupWorkflowCompanyDefaultGridTemplateSetting() {
		rxworkflowPage.allowCompanyDefaultGridTemplateCheckboxInFollowupWorkflow();

	}

	@Then("the user should be able to delete Grid Templates in Followup Workflow test")
	public void enableFollowupWorkflowGridTemplateDeletion() {
		rxworkflowPage.allowGridTemplateDeleteInFollowupWorkflow();

	}

	@Then("the user should be able to edit Grid Templates in Followup Workflow test")
	public void enableFollowupWorkflowGridTemplateEditing() {
		rxworkflowPage.allowGridTemplateEditInFollowupWorkflow();

	}

	@Then("the user should be able to add Grid Templates in Followup Workflow test")
	public void enableFollowupWorkflowGridTemplateAddition() {
		rxworkflowPage.allowGridTemplateAddInFollowupWorkflow();

	}

	@Then("the user should be able to perform advanced searches in Followup Workflow test")
	public void enableFollowupWorkflowAdvancedSearch() {
		rxworkflowPage.allowAdvancedSearchInFollowupWorkflow();

	}

	@Then("the user should be able to toggle Show Past Runninglines checkbox Followup Work Flow test")
	public void enableFollowupWorkflowShowPastRunninglinesToggle() {
		rxworkflowPage.allowShowPastRunninglinesCheckboxInFollowupWorkflow();

	}

	@Then("the user should be able to toggle Show All Runninglines checkbox Followup Work Flow test")
	public void enableFollowupWorkflowShowAllRunninglinesToggle() {
		rxworkflowPage.allowShowAllRunninglinesCheckboxInFollowupWorkflow();

	}

	@Then("the user should be able to perform Team Actions in Followup Workflow test")
	public void enableFollowupWorkflowTeamActions() {
		rxworkflowPage.allowTeamActionsInFollowupWorkflow();

	}

	@Then("the user should be able to see details in Followup Workflow test")
	public void enableFollowupWorkflowDetailsView() {
		rxworkflowPage.allowFollowupWorkflowDetailsAccess();

	}

	@Then("the user should not be able to export Followup Workflow data to Excel test")
	public void restrictFollowupWorkflowDataExportToExcel() {
		rxworkflowPage.disableExcelExportInFollowupWorkflow();

	}

	@Then("the user should not have full program access in Followup Workflow test")
	public void restrictFollowupWorkflowFullProgramAccess() {
		rxworkflowPage.disableFullAccessInFollowupWorkflow();

	}

	@Then("the user should not be able to set Grid Template Company Default checkbox Followup Work Flow test")
	public void restrictFollowupWorkflowCompanyDefaultGridTemplateSetting() {
		rxworkflowPage.disableCompanyDefaultGridTemplateCheckboxInFollowupWorkflow();

	}

	@Then("the user should not be able to delete Grid Templates in Followup Workflow test")
	public void restrictFollowupWorkflowGridTemplateDeletion() {
		rxworkflowPage.disableGridTemplateDeleteInFollowupWorkflow();

	}

	@Then("the user should not be able to edit Grid Templates in Followup Workflow test")
	public void restrictFollowupWorkflowGridTemplateEditing() {
		rxworkflowPage.disableGridTemplateEditInFollowupWorkflow();

	}

	@Then("the user should not be able to add Grid Templates in Followup Workflow test")
	public void restrictFollowupWorkflowGridTemplateAddition() {
		rxworkflowPage.disableGridTemplateAddInFollowupWorkflow();

	}

	@Then("the user should not be able to perform advanced searches in Followup Workflow test")
	public void restrictFollowupWorkflowAdvancedSearch() {
		rxworkflowPage.disableAdvancedSearchInFollowupWorkflow();

	}

	@Then("the user should not be able to toggle Show Past Runninglines checkbox Followup Work Flow test")
	public void restrictFollowupWorkflowShowPastRunninglinesToggle() {
		rxworkflowPage.disableShowPastRunninglinesCheckboxInFollowupWorkflow();

	}

	@Then("the user should not be able to toggle Show All Runninglines checkbox Followup Work Flow test")
	public void restrictFollowupWorkflowShowAllRunninglinesToggle() {
		rxworkflowPage.disableShowAllRunninglinesCheckboxInFollowupWorkflow();

	}

	@Then("the user should not be able to perform Team Actions in Followup Workflow test")
	public void restrictFollowupWorkflowTeamActions() {
		rxworkflowPage.disableTeamActionsInFollowupWorkflow();

	}

	@Then("the user should not be able to see details in Followup Workflow test")
	public void restrictFollowupWorkflowDetailsView() {
		rxworkflowPage.disableFollowupWorkflowDetailsAccess();

	}

	@Then("the user should be able to view Followup Workflow data test")
	public void enableFollowupWorkflowDataView() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String followUpWorkflowUrl = Hooks.prop.getProperty("followUpWorkflowUrl");
		Assert.assertNotNull("followUpWorkflowUrl is missing in config", followUpWorkflowUrl);
		String fullUrl = baseUrl + followUpWorkflowUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openFollowUpWorkflowPage(fullUrl);
		Assert.assertTrue("Dashboard page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Workflow/Home/FollowUpWorkflow"));
	}

	@And("I create a profile with the all permissions for Followup Workflow Module test")
	public void createFollowupWorkflowProfileWithAllPermissions() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.setupFollowupWorkflowFullAccessProfile();
		rxworkflowPage.clickSubmitButton();

	}

	// Action Work Flow

	@And("I create a profile with only View permission for Action Workflow Module test")
	public void createViewOnlyWorkflowProfile() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.addWorkflowProfileWithViewPermission();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to export Action Workflow data to Excel test")
	public void restrictWorkflowDataExportToExcel() {
		rxworkflowPage.blockWorkflowDataExportToExcel();

	}

	@Then("the user should not be able to send VCards in Action Workflow test")
	public void restrictWorkflowVCardSending() {
		rxworkflowPage.shouldNotAllowVCardSendingInWorkflow();

	}

	@Then("the user should not have full program access in Action Workflow test")
	public void restrictFullProgramAccessInWorkflow() {
		rxworkflowPage.testRestrictFullProgramAccessInWorkflow();

	}

	@Then("the user should not be able to set Grid Template Company Default checkbox Action Work Flow test")
	public void restrictCompanyDefaultGridTemplateSetting() {
		rxworkflowPage.disableCompanyDefaultGridTemplateCheckbox();

	}

	@Then("the user should not be able to delete Grid Templates in Action Workflow test")
	public void restrictGridTemplateDeletionInWorkflow() {
		rxworkflowPage.disableActionWorkflowGridTemplateDelete();

	}

	@Then("the user should not be able to edit Grid Templates in Action Workflow test")
	public void restrictGridTemplateEditingInWorkflow() {
		rxworkflowPage.disableActionWorkflowGridTemplateEdit();

	}

	@Then("the user should not be able to add Grid Templates in Action Workflow test")
	public void restrictGridTemplateAdditionInWorkflow() {
		rxworkflowPage.disableActionWorkflowGridTemplateCreation();

	}

	@Then("the user should not be able to perform advanced searches in Action Workflow test")
	public void restrictAdvancedWorkflowSearch() {
		rxworkflowPage.disableActionWorkflowAdvancedSearch();

	}

	@Then("the user should not be able to toggle Show Past Runninglines checkbox Action Work Flow test")
	public void restrictShowPastRunninglinesToggle() {
		rxworkflowPage.disableShowPastRunninglinesCheckbox();

	}

	@Then("the user should not be able to toggle Show All Runninglines checkbox Action Work Flow test")
	public void restrictShowAllRunninglinesToggle() {
		rxworkflowPage.disableShowAllRunninglinesCheckbox();

	}

	@Then("the user should not be able to send Quick Text in Action Workflow test")
	public void restrictWorkflowQuickTextSending() {
		rxworkflowPage.disableActionWorkflowQuickText();

	}

	@Then("the user should be able to export Action Workflow data to Excel test")
	public void generateExcelFromActionWorkflow() {
		rxworkflowPage.saveWorkflowDataToExcelFile();

	}

	@Then("the user should be able to send VCards in Action Workflow test")
	public void sendActionWorkflowVCard() {
		rxworkflowPage.dispatchWorkflowVCard();

	}

	@Then("the user should have full program access in Action Workflow test")
	public void enableActionWorkflowFullAccess() {
		rxworkflowPage.provideWorkflowProgramAccess();

	}

	@Then("the user should be able to set Grid Template Company Default checkbox test")
	public void setGridTemplateCompanyDefault() {
		rxworkflowPage.enableCompanyDefaultGridTemplate();

	}

	@Then("the user should be able to delete Grid Templates in Action Workflow test")
	public void deleteActionWorkflowGridTemplate() {
		rxworkflowPage.removeWorkflowGridTemplate();

	}

	@Then("the user should be able to edit Grid Templates in Action Workflow test")
	public void editActionWorkflowGridTemplate() {
		rxworkflowPage.updateWorkflowGridTemplate();

	}

	@Then("the user should be able to add Grid Templates in Action Workflow test")
	public void addActionWorkflowGridTemplate() {
		rxworkflowPage.createWorkflowGridTemplate();

	}

	@Then("the user should be able to perform advanced searches in Action Workflow test")
	public void performAdvancedWorkflowSearch() {
		rxworkflowPage.executeActionWorkflowAdvancedSearch();

	}

	@Then("the user should be able to toggle Show Past Runninglines checkbox Action Work Flow test")
	public void toggleShowPastRunninglines() {
		rxworkflowPage.setShowPastRunninglinesCheckbox();

	}

	@Then("the user should be able to toggle Show All Runninglines checkbox Action Work Flow test")
	public void testToggleShowAllRunninglinesCheckbox() {
		rxworkflowPage.shouldToggleShowAllRunninglinesInWorkflow();

	}

	@Then("the user should be able to send Quick Text in Action Workflow test")
	public void sendActionWorkflowQuickText() {
		rxworkflowPage.dispatchQuickTextInWorkflow();

	}

	@Then("the user should be able to perform BOT Calls in Action Workflow test")
	public void performActionWorkflowBotCall() {
		rxworkflowPage.executeWorkflowBotCall();

	}

	@Then("the user should be able to send Text messages in Action Workflow test")
	public void sendActionWorkflowTextMessage() {
		rxworkflowPage.sendWorkflowText();

	}

	@Then("the user should be able to see details in Action Workflow test")
	public void viewActionWorkflowDetails() {
		rxworkflowPage.shouldDisplayActionWorkflowDetails();

	}

	@Then("the user should not be able to see details in Action Workflow test")
	public void restrictActionWorkflowDetailsView() {
		rxworkflowPage.denyWorkflowDetailsAccess();

	}

	@Then("the user should not be able to send Text messages in Action Workflow test")
	public void restrictWorkflowTextMessaging() {
		rxworkflowPage.disableActionWorkflowTextMessage();

	}

	@Then("the user should not be able to perform BOT Calls in Action Workflow test")
	public void restrictWorkflowBotCalls() {
		rxworkflowPage.disableActionWorkflowBotCall();

	}

	@Then("the user should be able to view Action Workflow data test")
	public void viewActionWorkflowDataTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String actionWorkflowUrl = Hooks.prop.getProperty("actionWorkflowUrl");
		Assert.assertNotNull("actionWorkflowUrl is missing in config", actionWorkflowUrl);
		String fullUrl = baseUrl + actionWorkflowUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openActionWorkflowPage(fullUrl);
		Assert.assertTrue("Dashboard page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Workflow/Home/ActionWorkflow"));

	}

	@And("I create a profile with the following permissions for Action Workflow Module test")
	public void createActionWorkflowProfile() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.initializeProfileWithPermissions();
		rxworkflowPage.clickSubmitButton();

	}

	// Display Work Flow
	@Then("the user should not be able to export Display Workflow data to Excel test")
	public void userShouldNotBeAbleToPerformPharmacyNabpSearchesInDisplayWorkflowModule() {
		rxworkflowPage.shouldRestrictPharmacyNabpSearchesInDisplayWorkflowModule();
	}

	@Then("the user should not be able to perform Pharmacy NABP searches test")
	public void userShouldNotBeAbleToExportDisplayWorkflowDataToExcel() {
		rxworkflowPage.shouldRestrictExportingDisplayWorkflowDataToExcel();
	}

	@And("I create a profile with only View permission for Display Workflow Module test")
	public void userProfileWithOnlyViewPermissionInDisplayWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldCreateProfileWithOnlyViewPermissionInDisplayWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should be able to export Display Workflow data to Excel test")
	public void userShouldBeAbleToExportDisplayWorkflowDataToExcel() {
		rxworkflowPage.shouldAllowExportingDisplayWorkflowDataToExcel();
	}

	@Then("the user should be able to perform Pharmacy NABP searches test")
	public void userShouldBeAbleToPerformPharmacyNabpSearchesInDisplayWorkflowModule() {
		rxworkflowPage.shouldAllowPharmacyNabpSearchesInDisplayWorkflowModule();
	}

	@Then("the user should have full program access in Display Workflow test")
	public void userShouldHaveFullProgramAccessInDisplayWorkflowModule() {
		rxworkflowPage.shouldAllowFullProgramAccessInDisplayWorkflowModule();
	}

	@Then("the user should be able to set Grid Template - Company Default checkbox test")
	public void userShouldBeAbleToSetGridTemplateCompanyDefaultCheckboxInDisplayWorkflowModule() {
		rxworkflowPage.shouldAllowSettingGridTemplateCompanyDefaultCheckboxInDisplayWorkflowModule();
	}

	@Then("the user should be able to toggle Show Past Runninglines checkbox test")
	public void userShouldBeAbleToToggleShowPastRunninglinesCheckboxInDisplayWorkflowModule() {
		rxworkflowPage.shouldAllowTogglingShowPastRunninglinesCheckboxInDisplayWorkflowModule();
	}

	@Then("the user should be able to toggle Show All Runninglines checkbox test")
	public void userShouldBeAbleToToggleShowAllRunninglinesCheckboxInDisplayWorkflowModule() {
		rxworkflowPage.shouldAllowTogglingShowAllRunninglinesCheckboxInDisplayWorkflowModule();
	}

	@Then("the user should be able to delete Grid Templates in Display Workflow test")
	public void userShouldBeAbleToDeleteGridTemplatesInDisplayWorkflowModule() {
		rxworkflowPage.shouldAllowDeletingGridTemplatesInDisplayWorkflowModule();
	}

	@Then("the user should be able to edit Grid Templates in Display Workflow test")
	public void userShouldBeAbleToEditGridTemplatesInDisplayWorkflowModule() {
		rxworkflowPage.shouldAllowEditingGridTemplatesInDisplayWorkflowModule();
	}

	@Then("the user should be able to add Grid Templates in Display Workflow test")
	public void userShouldBeAbleToAddGridTemplatesInDisplayWorkflowModule() {
		rxworkflowPage.shouldAllowAddingGridTemplatesInDisplayWorkflowModule();
	}

	@Then("the user should be able to perform advanced searches in Display Workflow test")
	public void userShouldBeAbleToPerformAdvancedSearchesInDisplayWorkflowModule() {
		rxworkflowPage.shouldAllowAdvancedSearchInDisplayWorkflowModule();
	}

	@Then("the user should be able to see details in Display Workflow test")
	public void userShouldBeAbleToSeeDetailsInDisplayWorkflowModule() {
		rxworkflowPage.shouldAllowViewingDetailsInDisplayWorkflowModule();
	}

	@Then("the user should not be able to perform advanced searches in Display Workflow test")
	public void userShouldNotBeAbleToPerformAdvancedSearchesInDisplayWorkflowModule() {
		rxworkflowPage.shouldRestrictAdvancedSearchesInDisplayWorkflowModule();
	}

	@Then("the user should not be able to add Grid Templates in Display Workflow test")
	public void userShouldNotBeAbleToAddGridTemplatesInDisplayWorkflowModule() {
		rxworkflowPage.shouldRestrictAddingGridTemplatesInDisplayWorkflowModule();
	}

	@Then("the user should not be able to edit Grid Templates in Display Workflow test")
	public void userShouldNotBeAbleToEditGridTemplatesInDisplayWorkflowModule() {
		rxworkflowPage.shouldRestrictEditingGridTemplatesInDisplayWorkflowModule();
	}

	@Then("the user should not be able to delete Grid Templates in Display Workflow test")
	public void userShouldNotBeAbleToDeleteGridTemplatesInDisplayWorkflowModule() {
		rxworkflowPage.shouldRestrictDeletingGridTemplatesInDisplayWorkflowModule();
	}

	@Then("the user should not be able to toggle Show All Runninglines checkbox test")
	public void userShouldNotBeAbleToToggleShowAllRunninglinesCheckboxInDisplayWorkflowModule() {
		rxworkflowPage.shouldRestrictTogglingShowAllRunninglinesCheckboxInDisplayWorkflowModule();
	}

	@Then("the user should not be able to toggle Show Past Runninglines checkbox test")
	public void userShouldNotBeAbleToToggleShowPastRunninglinesCheckboxInDisplayWorkflowModule() {
		rxworkflowPage.shouldRestrictTogglingShowPastRunninglinesCheckboxInDisplayWorkflowModule();
	}

	@Then("the user should not be able to set Grid Template - Company Default checkbox test")
	public void userShouldNotBeAbleToSetGridTemplateCompanyDefaultCheckboxInDisplayWorkflowModule() {
		rxworkflowPage.shouldRestrictSettingGridTemplateCompanyDefaultCheckboxInDisplayWorkflowModule();
	}

	@Then("the user should not have full program access in Display Workflow test")
	public void userShouldNotHaveFullProgramAccessInDisplayWorkflowModule() {
		rxworkflowPage.shouldRestrictFullProgramAccessInDisplayWorkflowModule();
	}

	@Then("the user should not be able to see details in Display Workflow test")
	public void userShouldNotBeAbleToSeeDetailsInDisplayWorkflowModule() {
		rxworkflowPage.shouldRestrictViewingDetailsInDisplayWorkflowModule();
	}

	@Then("the user should be able to view Display Workflow data test")
	public void userShouldBeAbleToViewDisplayWorkflowData() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String dashboardUrl = Hooks.prop.getProperty("dashboardUrl");
		Assert.assertNotNull("dashboardUrl is missing in config", dashboardUrl);
		String fullUrl = baseUrl + dashboardUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openDashboardPage(fullUrl);
		Assert.assertTrue("Dashboard page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Workflow/Home/Dashboard"));
		rxworkflowPage.shouldAllowViewingDisplayWorkflowData();
	}

	@And("I create a profile with the all Additional Access permissions for Display Workflow Module test")
	public void userWithAllAdditionalAccessShouldViewCommentAlertAndExportExcelInDisplayWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldAllowAllAdditionalAccessInDisplayWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	// Sync Workflow
	@Then("the user should not be able to export Sync Workflow data to Excel test")
	public void userShouldNotBeAbleToExportSyncWorkflowDataToExcel() {
		rxworkflowPage.shouldNotAllowExportingSyncWorkflowDataToExcel();

	}

	@Then("the user should not be able to receive alerts in Sync Workflow test")
	public void userShouldNotBeAbleToReceiveAlertsInSyncWorkflowModule() {
		rxworkflowPage.shouldNotAllowReceivingAlertsInSyncWorkflowModule();

	}

	@Then("the user should not be able to comment in Sync Workflow test")
	public void userShouldNotBeAbleToCommentInSyncWorkflowModule() {
		rxworkflowPage.shouldNotAllowCommentingInSyncWorkflowModule();

	}

	@And("I create a profile with only View access and no Comment, Alert, or Export Excel access to Sync Workflow Module test")
	public void userWithViewOnlyAccessShouldNotCommentAlertOrExportExcelInSyncWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testSyncWorkflowModulePermissionsViewOnlyNoCommentAlertExport();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should be able to export Sync Workflow data to Excel test")
	public void userShouldBeAbleToExportSyncWorkflowDataToExcel() {
		rxworkflowPage.shouldAllowExportingSyncWorkflowDataToExcel();

	}

	@Then("the user should be able to receive alerts in Sync Workflow test")
	public void userShouldBeAbleToReceiveAlertsInSyncWorkflowModule() {
		rxworkflowPage.shouldAllowReceivingAlertsInSyncWorkflowModule();

	}

	@Then("the user should be able to comment in Sync Workflow test")
	public void userShouldBeAbleToCommentInSyncWorkflowModule() {
		rxworkflowPage.shouldAllowCommentingInSyncWorkflowModule();

	}

	@Then("the user should be able to view Sync Workflow data test")
	public void userShouldBeAbleToViewSyncWorkflowData() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String medicationSyncUrl = Hooks.prop.getProperty("medicationSyncUrl");
		Assert.assertNotNull("medicationSyncUrl is missing in config", medicationSyncUrl);
		String fullUrl = baseUrl + medicationSyncUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openMedicationSyncPage(fullUrl);
		Assert.assertTrue("Medication Sync page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Workflow/Home/MedicationSyncReminder"));
		rxworkflowPage.shouldAllowViewingPrescriptionStatusInWorkflowModule();
	}

	@And("I create a profile with View, Comment, Alert, and Export Excel access to Sync Workflow Module test")
	public void userWithViewCommentAlertExportAccessShouldNotAddEditOrDeleteInSyncWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldAllowViewCommentAlertExportOnlyInSyncWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	// Prescription Status
	@Then("the user should be able to delete Prescription Status in Workflow Module test")
	public void userShouldBeAbleToDeletePrescriptionStatusInWorkflowModule() {
		rxworkflowPage.shouldAllowDeletingPrescriptionStatusInWorkflowModule();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Prescription Status in Workflow Module test")
	public void userWithViewAndDeleteAccessShouldNotAddOrEditPrescriptionStatusInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndEditForPrescriptionStatusInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to add Prescription Status in Workflow Module test")
	public void userShouldNotBeAbleToAddPrescriptionStatusInWorkflowModule() {
		rxworkflowPage.shouldNotAllowAddingPrescriptionStatusInWorkflowModule();

	}

	@Then("the user should be able to edit Prescription Status in Workflow Module test")
	public void userShouldBeAbleToEditPrescriptionStatusInWorkflowModule() {
		rxworkflowPage.shouldAllowEditingPrescriptionStatusInWorkflowModule();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Prescription Status in Workflow Module test")
	public void userWithViewAndEditAccessShouldNotAddOrDeletePrescriptionStatusInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndDeleteForPrescriptionStatusInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to delete Prescription Status in Workflow Module test")
	public void userShouldNotBeAbleToDeletePrescriptionStatusInWorkflowModule() {
		rxworkflowPage.shouldNotAllowDeletingPrescriptionStatusInWorkflowModule();

	}

	@Then("the user should not be able to edit Prescription Status in Workflow Module test")
	public void userShouldNotBeAbleToEditPrescriptionStatusInWorkflowModule() {
		rxworkflowPage.shouldNotAllowEditingPrescriptionStatusInWorkflowModule();

	}

	@Then("the user should be able to add Prescription Status in Workflow Module test")
	public void userShouldBeAbleToAddPrescriptionStatusInWorkflowModule() {
		rxworkflowPage.shouldAllowAddingPrescriptionStatusInWorkflowModule();

	}

	@Then("the user should be able to view Prescription Status in Workflow Module test")
	public void userShouldBeAbleToViewPrescriptionStatusInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String prescriptionStatusUrl = Hooks.prop.getProperty("prescriptionStatusUrl");
		Assert.assertNotNull("prescriptionStatusUrl is missing in config", prescriptionStatusUrl);
		String fullUrl = baseUrl + prescriptionStatusUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openPrescriptionStatusPage(fullUrl);
		Assert.assertTrue("Prescription Status page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/PrescriptionStatuses"));
		rxworkflowPage.shouldAllowViewingPrescriptionStatusInWorkflowModule();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Prescription Status in Workflow Module test")
	public void userWithViewAndAddAccessShouldNotEditOrDeletePrescriptionStatusInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictEditAndDeleteForPrescriptionStatusInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	// Program 340B
	@Then("the user should be able to delete Program 340B in Workflow Module test")
	public void userShouldBeAbleToDeleteProgram340BInWorkflowModule() {
		rxworkflowPage.shouldAllowDeletingProgram340BInWorkflowModule();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Program 340B in Workflow Module test")
	public void userWithViewAndDeleteAccessShouldNotAddOrEditProgram340BInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndEditForProgram340BInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to add Program 340B in Workflow Module test")
	public void userShouldNotBeAbleToAddProgram340BInWorkflowModule() {
		rxworkflowPage.shouldNotAllowAddingProgram340BInWorkflowModule();

	}

	@Then("the user should be able to edit Program 340B in Workflow Module test")
	public void userShouldBeAbleToEditProgram340BInWorkflowModule() {
		rxworkflowPage.shouldAllowEditingProgram340BInWorkflowModule();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Program 340B in Workflow Module test")
	public void userWithViewAndEditAccessShouldNotAddOrDeleteProgram340BInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndDeleteForProgram340BInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to delete Program 340B in Workflow Module test")
	public void userShouldNotBeAbleToDeleteProgram340BInWorkflowModule() {
		rxworkflowPage.shouldNotAllowDeletingProgram340BInWorkflowModule();

	}

	@Then("the user should not be able to edit Program 340B in Workflow Module test")
	public void userShouldNotBeAbleToEditProgram340BInWorkflowModule() {
		rxworkflowPage.shouldNotAllowEditingProgram340BInWorkflowModule();

	}

	@Then("the user should be able to add Program 340B in Workflow Module test")
	public void userShouldBeAbleToAddProgram340BInWorkflowModule() {
		rxworkflowPage.shouldAllowAddingProgram340BInWorkflowModule();

	}

	@Then("the user should be able to view Program 340B in Workflow Module test")
	public void shouldAllowViewingProgram340BInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String program340BUrl = Hooks.prop.getProperty("program340BUrl");
		Assert.assertNotNull("program340BUrl is missing in config", program340BUrl);
		String fullUrl = baseUrl + program340BUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openProgram340BPage(fullUrl);
		Assert.assertTrue("Program 340B page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Program340Bs"));
		rxworkflowPage.shouldAllowViewingOutgoingCallTypesInWorkflowModule();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Program 340B in Workflow Module test")
	public void userWithViewAndAddAccessShouldNotEditOrDeleteProgram340BInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictEditAndDeleteForProgram340BInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	// Outgoing Call Types
	@Then("the user should be able to delete Outgoing Call Types in Workflow Module test")
	public void userShouldBeAbleToDeleteOutgoingCallTypesInWorkflowModule() {
		rxworkflowPage.shouldAllowDeletingOutgoingCallTypesInWorkflowModule();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Outgoing Call Types in Workflow Module test")
	public void userWithViewAndDeleteAccessShouldNotAddOrEditOutgoingCallTypesInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndEditForOutgoingCallTypesInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to deletes Outgoing Call Types in Workflow Module test")
	public void verifyOutgoingCallTypesDeletionIsRestrictedInWorkflowModule() {
		rxworkflowPage.shouldNotAllowDeletingOutgoingCallTypesInWorkflowModule();

	}

	@Then("the user should not be able to add Outgoing Call Types in Workflow Module test")
	public void userShouldNotBeAbleToAddOutgoingCallTypesInWorkflowModule() {
		rxworkflowPage.shouldNotAllowAddingOutgoingCallTypesInWorkflowModule();

	}

	@Then("the user should be able to edit Outgoing Call Types in Workflow Module test")
	public void userShouldBeAbleToEditOutgoingCallTypesInWorkflowModule() {
		rxworkflowPage.shouldAllowEditingOutgoingCallTypesInWorkflowModule();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Outgoing Call Types in Workflow Module test")
	public void userWithViewAndEditAccessShouldNotAddOrDeleteOutgoingCallTypesInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndDeleteForOutgoingCallTypesInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to delete Outgoing Call Types in Workflow Module test")
	public void userShouldNotBeAbleToDeleteOutgoingCallTypesInWorkflowModule() {
		rxworkflowPage.shouldNotAllowDeletingOutgoingCallTypesInWorkflowModule();

	}

	@Then("the user should not be able to edit Outgoing Call Types in Workflow Module test")
	public void userShouldNotBeAbleToEditOutgoingCallTypesInWorkflowModule() {
		rxworkflowPage.shouldNotAllowEditingOutgoingCallTypesInWorkflowModule();

	}

	@Then("the user should be able to add Outgoing Call Types in Workflow Module test")
	public void userShouldBeAbleToAddOutgoingCallTypesInWorkflowModule() {
		rxworkflowPage.shouldAllowAddingOutgoingCallTypesInWorkflowModule();

	}

	@Then("the user should be able to view Outgoing Call Types in Workflow Module test")
	public void userShouldBeAbleToViewOutgoingCallTypesInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String outgoingCallTypesUrl = Hooks.prop.getProperty("outgoingCallTypesUrl");
		Assert.assertNotNull("outgoingCallTypesUrl is missing in config", outgoingCallTypesUrl);
		String fullUrl = baseUrl + outgoingCallTypesUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openOutgoingCallTypesPage(fullUrl);
		Assert.assertTrue("Outgoing Call Types page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/OutgoingCalls"));
		rxworkflowPage.shouldAllowViewingOutgoingCallTypesInWorkflowModule();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Outgoing Call Types in Workflow Module test")
	public void userWithViewAndAddAccessShouldNotEditOrDeleteOutgoingCallTypesInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictEditAndDeleteForOutgoingCallTypesInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	// Incoming Call Types
	@Then("the user should be able to delete Incoming Call Types in Workflow Module test")
	public void userShouldBeAbleToDeleteIncomingCallTypesInWorkflowModule() {
		rxworkflowPage.shouldAllowDeletingIncomingCallTypesInWorkflowModule();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Incoming Call Types in Workflow Module test")
	public void userWithViewAndDeleteAccessShouldNotAddOrEditIncomingCallTypesInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndEditForIncomingCallTypesInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to add Incoming Call Types in Workflow Module test")
	public void userShouldNotBeAbleToAddIncomingCallTypesInWorkflowModule() {
		rxworkflowPage.shouldNotAllowAddingIncomingCallTypesInWorkflowModule();

	}

	@Then("the user should be able to edit Incoming Call Types in Workflow Module test")
	public void userShouldBeAbleToEditIncomingCallTypesInWorkflowModule() {
		rxworkflowPage.shouldAllowEditingIncomingCallTypesInWorkflowModule();

	}

	@Then("the user should not be able to delete Incoming Call Types in Workflow Module test")
	public void userShouldNotBeAbleToDeleteIncomingCallTypesInWorkflowModule() {
		rxworkflowPage.shouldNotAllowDeletingIncomingCallTypesInWorkflowModule();

	}

	@Then("the user should not be able to edit Incoming Call Types in Workflow Module test")
	public void userShouldNotBeAbleToEditIncomingCallTypesInWorkflowModule() {
		rxworkflowPage.shouldNotAllowEditingIncomingCallTypesInWorkflowModule();

	}

	@Then("the user should be able to add Incoming Call Types in Workflow Module test")
	public void userShouldBeAbleToAddIncomingCallTypesInWorkflowModule() {
		rxworkflowPage.shouldAllowAddingIncomingCallTypesInWorkflowModule();

	}

	@Then("the user should be able to view Incoming Call Types in Workflow Module test")
	public void userShouldBeAbleToViewIncomingCallTypesInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String incomingCallTypesUrl = Hooks.prop.getProperty("incomingCallTypesUrl");
		Assert.assertNotNull("incomingCallTypesUrl is missing in config", incomingCallTypesUrl);
		String fullUrl = baseUrl + incomingCallTypesUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openIncomingCallTypesPage(fullUrl);
		Assert.assertTrue("Incoming Call Types page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/IncomingCalls"));
		rxworkflowPage.shouldAllowViewingIncomingCallTypesInWorkflowModule();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Incoming Call Types in Workflow Module test")
	public void userWithViewAndEditAccessShouldNotAddOrDeleteIncomingCallTypesInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndDeleteForIncomingCallTypesInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Incoming Call Types in Workflow Module test")
	public void userWithViewAndAddAccessShouldNotEditOrDeleteIncomingCallTypesInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictEditAndDeleteForIncomingCallTypesInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	// Runningline Level2 Status
	@Then("the user should be able to delete Runningline Level2 Status in Workflow Module test")
	public void verifyRunninglineLevel2StatusCanBeDeletedInWorkflowModule() {
		rxworkflowPage.shouldAllowDeletingRunninglineLevel2StatusInWorkflowModule();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Runningline Level2 Status in Workflow Module test")
	public void userWithViewAndDeleteAccessShouldNotAddOrEditRunninglineLevel2StatusInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndEditForRunninglineLevel2StatusInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Runningline Level2 Status in Workflow Module test")
	public void userWithViewAndEditAccessShouldNotAddOrDeleteRunninglineLevel2StatusInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndDeleteForRunninglineLevel2StatusInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to add Runningline Level2 Status in Workflow Module test")
	public void userShouldNotBeAbleToAddRunninglineLevel2StatusInWorkflowModule() {
		rxworkflowPage.shouldNotAllowAddingRunninglineLevel2StatusInWorkflowModule();

	}

	@Then("the user should not be able to delete Runningline Level2 Status in Workflow Module test")
	public void userShouldNotBeAbleToDeleteRunninglineLevel2StatusInWorkflowModule() {
		rxworkflowPage.shouldNotAllowDeletingRunninglineLevel2StatusInWorkflowModule();

	}

	@Then("the user should not be able to edit Runningline Level2 Status in Workflow Module test")
	public void userShouldNotBeAbleToEditRunninglineLevel2StatusInWorkflowModule() {
		rxworkflowPage.shouldNotAllowEditingRunninglineLevel2StatusInWorkflowModule();

	}

	@Then("the user should be able to edit Runningline Level2 Status in Workflow Module test")
	public void userShouldBeAbleToEditRunninglineLevel2StatusInWorkflowModule() {
		rxworkflowPage.shouldAllowEditingRunninglineLevel2StatusInWorkflowModule();

	}

	@Then("the user should be able to add Runningline Level2 Status in Workflow Module test")
	public void userShouldBeAbleToAddRunninglineLevel2StatusInWorkflowModule() {
		rxworkflowPage.shouldAllowAddingRunninglineLevel2StatusInWorkflowModule();

	}

	@Then("the user should be able to view Runningline Level2 Status in Workflow Module test")
	public void userShouldBeAbleToViewRunninglineLevel2StatusInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String runninglineLevel2StatusUrl = Hooks.prop.getProperty("runninglineLevel2StatusUrl");
		Assert.assertNotNull("runninglineLevel2StatusUrl is missing in config", runninglineLevel2StatusUrl);
		String fullUrl = baseUrl + runninglineLevel2StatusUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openRunninglineLevel2StatusPage(fullUrl);
		Assert.assertTrue("Runningline Level2 Status page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/RunninglineLevel2Statuses"));
		rxworkflowPage.shouldAllowViewingRunninglineLevel2StatusInWorkflowModule();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Runningline Level2 Status in Workflow Module test")
	public void userWithViewAndAddAccessShouldNotEditOrDeleteRunninglineLevel2StatusInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictEditAndDeleteForRunninglineLevel2StatusInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	// Runningline Level1 Status
	@Then("the user should be able to delete Runningline Level1 Status in Workflow Module test")
	public void userShouldBeAbleToDeleteRunninglineLevel1StatusInWorkflowModule() {
		rxworkflowPage.shouldAllowDeletingRunninglineLevel1StatusInWorkflowModule();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Runningline Level1 Status in Workflow Module test")
	public void userWithViewAndDeleteAccessShouldNotAddOrEditRunninglineLevel1StatusInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndEditForRunninglineLevel1StatusInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to add Runningline Level1 Status in Workflow Module test")
	public void userShouldNotBeAbleToAddRunninglineLevel1StatusInWorkflowModule() {
		rxworkflowPage.shouldNotAllowAddingRunninglineLevel1StatusInWorkflowModule();

	}

	@Then("the user should be able to edit Runningline Level1 Status in Workflow Module test")
	public void userShouldBeAbleToEditRunninglineLevel1StatusInWorkflowModule() {
		rxworkflowPage.shouldAllowEditingRunninglineLevel1StatusInWorkflowModule();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Runningline Level1 Status in Workflow Module test")
	public void userWithViewAndEditAccessShouldNotAddOrDeleteRunninglineLevel1StatusInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndDeleteForRunninglineLevel1StatusInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to delete Runningline Level1 Status in Workflow Module test")
	public void userShouldNotBeAbleToDeleteRunninglineLevel1StatusInWorkflowModule() {
		rxworkflowPage.shouldNotAllowDeletingRunninglineLevel1StatusInWorkflowModule();

	}

	@Then("the user should not be able to edit Runningline Level1 Status in Workflow Module test")
	public void userShouldNotBeAbleToEditRunninglineLevel1StatusInWorkflowModule() {
		rxworkflowPage.shouldNotAllowEditingRunninglineLevel1StatusInWorkflowModule();

	}

	@Then("the user should be able to add Runningline Level1 Status in Workflow Module test")
	public void userShouldBeAbleToAddRunninglineLevel1StatusInWorkflowModule() {
		rxworkflowPage.shouldAllowAddingRunninglineLevel1StatusInWorkflowModule();

	}

	@Then("the user should be able to view Runningline Level1 Status in Workflow Module test")
	public void userShouldBeAbleToViewRunninglineLevel1StatusInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String runninglineLevel1StatusUrl = Hooks.prop.getProperty("runninglineLevel1StatusUrl");
		Assert.assertNotNull("runninglineLevel1StatusUrl is missing in config", runninglineLevel1StatusUrl);
		String fullUrl = baseUrl + runninglineLevel1StatusUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openRunninglineLevel1StatusPage(fullUrl);
		Assert.assertTrue("Runningline Level1 Status page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/RunninglineLevel1Statuses"));
		rxworkflowPage.verifyRunninglineStatusCanBeViewedInWorkflowModule();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Runningline Level1 Status in Workflow Module test")
	public void userWithViewAndAddAccessShouldNotEditOrDeleteRunninglineLevel1StatusInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictEditAndDeleteForRunninglineLevel1StatusInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	// Runningline Status
	@Then("the user should be able to delete Runningline Status in Workflow Module test")
	public void userShouldBeAbleToDeleteRunninglineStatusInWorkflowModule() {
		rxworkflowPage.shouldAllowDeletingRunninglineStatusInWorkflowModule();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Runningline Status in Workflow Module test")
	public void userWithViewAndDeleteAccessShouldNotAddOrEditRunninglineStatusInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndEditForRunninglineStatusInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to add Runningline Status in Workflow Module test")
	public void userShouldNotBeAbleToAddRunninglineStatusInWorkflowModule() {
		rxworkflowPage.shouldNotAllowAddingRunninglineStatusInWorkflowModule();

	}

	@Then("the user should be able to edit Runningline Status in Workflow Module test")
	public void userShouldBeAbleToEditRunninglineStatusInWorkflowModule() {
		rxworkflowPage.shouldAllowEditingRunninglineStatusInWorkflowModule();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Runningline Status in Workflow Module test")
	public void userWithViewAndEditAccessShouldNotAddOrDeleteRunninglineStatusInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndDeleteForRunninglineStatusInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to delete Runningline Status in Workflow Module test")
	public void userShouldNotBeAbleToDeleteRunninglineStatusInWorkflowModule() {
		rxworkflowPage.shouldNotAllowDeletingRunninglineStatusInWorkflowModule();

	}

	@Then("the user should not be able to edit Runningline Status in Workflow Module test")
	public void userShouldNotBeAbleToEditRunninglineStatusInWorkflowModule() {
		rxworkflowPage.shouldNotAllowEditingRunninglineStatusInWorkflowModule();

	}

	@Then("the user should be able to add Runningline Status in Workflow Module test")
	public void userShouldBeAbleToAddRunninglineStatusInWorkflowModule() {
		rxworkflowPage.shouldAllowAddingRunninglineStatusInWorkflowModule();

	}

	@Then("the user should be able to view Runningline Status in Workflow Module test")
	public void userShouldBeAbleToViewRunninglineStatusInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String runninglineStatusUrl = Hooks.prop.getProperty("runninglineStatusUrl");
		Assert.assertNotNull("runninglineStatusUrl is missing in config", runninglineStatusUrl);
		String fullUrl = baseUrl + runninglineStatusUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openRunninglineStatusPage(fullUrl);
		Assert.assertTrue("Runningline Status page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/RunninglineStatuses"));
		rxworkflowPage.verifyRunninglineStatusCanBeViewedInWorkflowModule();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Runningline Status in Workflow Module test")
	public void userWithViewAndAddAccessShouldNotEditOrDeleteRunninglineStatusInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictEditAndDeleteForRunninglineStatusInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	// Queue
	@Then("the user should be able to delete Queue in Workflow Module test")
	public void userShouldBeAbleToDeleteQueueInWorkflowModule() {
		rxworkflowPage.shouldAllowDeletingQueueInWorkflowModule();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Queue in Workflow Module test")
	public void userWithViewAndDeleteAccessShouldNotAddOrEditQueueInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndEditForQueueInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to add Queue in Workflow Module test")
	public void userShouldNotBeAbleToAddQueueInWorkflowModule() {
		rxworkflowPage.shouldNotAllowAddingQueueInWorkflowModule();

	}

	@Then("the user should be able to edit Queue in Workflow Module test")
	public void userShouldBeAbleToEditQueueInWorkflowModule() {
		rxworkflowPage.shouldAllowEditingQueueInWorkflowModule();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Queue in Workflow Module test")
	public void userWithViewAndEditAccessShouldNotAddOrDeleteQueueInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndDeleteForQueueInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to delete Queue in Workflow Module test")
	public void userShouldNotBeAbleToDeleteQueueInWorkflowModule() {
		rxworkflowPage.shouldNotAllowDeletingQueueInWorkflowModule();

	}

	@Then("the user should not be able to edit Queue in Workflow Module test")
	public void userShouldNotBeAbleToEditQueueInWorkflowModule() {
		rxworkflowPage.shouldNotAllowEditingQueueInWorkflowModule();

	}

	@Then("the user should be able to add Queue in Workflow Module test")
	public void userShouldBeAbleToAddQueueInWorkflowModule() {
		rxworkflowPage.shouldAllowAddingQueueInWorkflowModule();

	}

	@Then("the user should be able to view Queue in Workflow Module test")
	public void userShouldBeAbleToViewQueueInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String queuesPageUrl = Hooks.prop.getProperty("queuesPageUrl");
		Assert.assertNotNull("queuesPageUrl is missing in config", queuesPageUrl);
		String fullUrl = baseUrl + queuesPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openQueuesPage(fullUrl);
		Assert.assertTrue("Queues page is not displayed", Hooks.driver.getCurrentUrl().contains("/Setup/Home/Queues"));
		rxworkflowPage.shouldAllowViewingQueueInWorkflowModule();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Queue in Workflow Module test")
	public void userWithViewAndAddAccessShouldNotEditOrDeleteQueueInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictEditAndDeleteForQueueInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	// Followup Trail Script
	@Then("the user should be able to delete Followup Trail Script in Workflow Module test")
	public void userShouldBeAbleToDeleteFollowupTrailScriptInWorkflowModule() {
		rxworkflowPage.shouldAllowDeletingFollowupTrailScriptInWorkflowModule();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Followup Trail Script in Workflow Module test")
	public void userWithViewAndDeleteAccessShouldNotAddOrEditFollowupTrailScriptInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndEditForFollowupTrailScriptInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to add Followup Trail Script in Workflow Module test")
	public void userShouldNotBeAbleToAddFollowupTrailScriptInWorkflowModule() {
		rxworkflowPage.shouldNotAllowAddingFollowupTrailScriptInWorkflowModule();

	}

	@Then("the user should be able to edit Followup Trail Script in Workflow Module test")
	public void userShouldBeAbleToEditFollowupTrailScriptInWorkflowModule() {
		rxworkflowPage.shouldAllowEditingFollowupTrailScriptInWorkflowModule();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Followup Trail Script in Workflow Module test")
	public void userWithViewAndEditAccessShouldNotAddOrDeleteFollowupTrailScriptInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.verifyProfileWithViewEditCannotAddOrDeleteFollowupTrailScript();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to delete Followup Trail Script in Workflow Module test")
	public void userShouldNotBeAbleToDeleteFollowupTrailScriptInWorkflowModule() {
		rxworkflowPage.shouldNotAllowDeletingFollowupTrailScriptInWorkflowModule();

	}

	@Then("the user should not be able to edit Followup Trail Script in Workflow Module test")
	public void userShouldNotBeAbleToEditFollowupTrailScriptInWorkflowModule() {
		rxworkflowPage.shouldNotAllowEditingFollowupTrailScriptInWorkflowModule();

	}

	@Then("the user should be able to add Followup Trail Script in Workflow Module test")
	public void userShouldBeAbleToAddFollowupTrailScriptInWorkflowModule() {
		rxworkflowPage.shouldAddFollowupTrailScriptInWorkflowModule();

	}

	@Then("the user should be able to view Followup Trail Script in Workflow Module test")
	public void shouldDisplayFollowupTrailScriptInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String callScriptsPageUrl = Hooks.prop.getProperty("callScriptsPageUrl");
		Assert.assertNotNull("callScriptsPageUrl is missing in config", callScriptsPageUrl);
		String fullUrl = baseUrl + callScriptsPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openCallScriptsPage(fullUrl);
		Assert.assertTrue("Call Scripts page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/CallScripts"));
		rxworkflowPage.verifyFollowupTrailScriptVisibleInWorkflowModule();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Followup Trail Script in Workflow Module test")
	public void testCreateProfileWithViewAndAddNoEditDeleteFollowupTrailScript() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testProfileAccessFollowupTrailScriptViewAddOnly();
		rxworkflowPage.clickSubmitButton();

	}

	// Transfer Result Action
	@Then("the user should be able to delete Transfer Result Action in Workflow Module test")
	public void testUserCanDeleteTransferResultActionInWorkflowModule() {
		rxworkflowPage.testProfileAccessTransferResultActionDeleteOnly();

	}

	@Then("the user should not be able to add Transfer Result Action in Workflow Module test")
	public void testUserCannotAddTransferResultActionInWorkflowModule() {
		rxworkflowPage.testProfileAccessTransferResultActionNoAdd();

	}

	@Then("the user should not be able to delete Transfer Result Action in Workflow Module test")
	public void testUserCannotDeleteTransferResultActionInWorkflowModule() {
		rxworkflowPage.testProfileAccessTransferResultActionNoDelete();

	}

	@Then("the user should not be able to edit Transfer Result Action in Workflow Module test")
	public void testUserCannotEditTransferResultActionInWorkflowModule() {
		rxworkflowPage.testProfileAccessTransferResultActionNoEdit();

	}

	@Then("the user should be able to edit Transfer Result Action in Workflow Module test")
	public void testUserCanEditTransferResultActionInWorkflowModule() {
		rxworkflowPage.testProfileAccessTransferResultActionEditOnly();

	}

	@Then("the user should be able to add Transfer Result Action in Workflow Module test")
	public void testUserCanAddTransferResultActionInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String transferResultActionsPageUrl = Hooks.prop.getProperty("transferResultActionsPageUrl");
		Assert.assertNotNull("transferResultActionsPageUrl is missing in config", transferResultActionsPageUrl);
		String fullUrl = baseUrl + transferResultActionsPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openTransferResultActionsPage(fullUrl);
		Assert.assertTrue("Transfer Result Actions page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/TransferResultActions"));
		rxworkflowPage.testProfileAccessTransferResultActionAddOnly();

	}

	@Then("the user should be able to view Transfer Result Action in Workflow Module test")
	public void testUserCanViewTransferResultActionInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String transferResultActionsPageUrl = Hooks.prop.getProperty("transferResultActionsPageUrl");
		Assert.assertNotNull("transferResultActionsPageUrl is missing in config", transferResultActionsPageUrl);
		String fullUrl = baseUrl + transferResultActionsPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openTransferResultActionsPage(fullUrl);
		Assert.assertTrue("Transfer Result Actions page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/TransferResultActions"));
		rxworkflowPage.testProfileAccessTransferResultActionViewOnly();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Transfer Result Action in Workflow Module test")
	public void testCreateProfileWithViewAndDeleteNoAddEditTransferResultAction() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testProfileAccessTransferResultActionViewDeleteOnly();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Transfer Result Action in Workflow Module test")
	public void testCreateProfileWithViewAndEditNoAddDeleteTransferResultAction() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testProfileAccessTransferResultActionViewEditOnly();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Transfer Result Action in Workflow Module test")
	public void testCreateProfileWithViewAndAddNoEditDeleteTransferResultAction() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testProfileAccessTransferResultActionViewAddOnly();
		rxworkflowPage.clickSubmitButton();

	}

	// Failure Result Action
	@Then("the user should be able to delete Failure Result Action in Workflow Module test")
	public void testUserCanDeleteFailureResultActionInWorkflowModule() {
		rxworkflowPage.testProfileAccessFailureResultActionDeleteOnly();

	}

	@Then("the user should not be able to add Failure Result Action in Workflow Module test")
	public void testUserCannotAddFailureResultActionInWorkflowModule() {
		rxworkflowPage.testProfileAccessFailureResultActionNoAdd();

	}

	@Then("the user should be able to edit Failure Result Action in Workflow Module test")
	public void testUserCanEditFailureResultActionInWorkflowModule() {
		rxworkflowPage.testProfileAccessFailureResultActionEditOnly();

	}

	@Then("the user should not be able to delete Failure Result Action in Workflow Module test")
	public void testUserCannotDeleteFailureResultActionInWorkflowModule() {
		rxworkflowPage.testProfileAccessFailureResultActionNoDelete();

	}

	@Then("the user should not be able to edit Failure Result Action in Workflow Module test")
	public void testUserCannotEditFailureResultActionInWorkflowModule() {
		rxworkflowPage.testProfileAccessFailureResultActionNoEdit();

	}

	@Then("the user should be able to add Failure Result Action in Workflow Module test")
	public void testUserCanAddFailureResultActionInWorkflowModule() {
		rxworkflowPage.testProfileAccessFailureResultActionAddOnly();

	}

	@Then("the user should be able to view Failure Result Action in Workflow Module test")
	public void testUserCanViewFailureResultActionInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String failureResultActionsPageUrl = Hooks.prop.getProperty("failureResultActionsPageUrl");
		Assert.assertNotNull("failureResultActionsPageUrl is missing in config", failureResultActionsPageUrl);
		String fullUrl = baseUrl + failureResultActionsPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openFailureResultActionsPage(fullUrl);
		Assert.assertTrue("Failure Result Actions page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/FailureResultActions"));
		rxworkflowPage.testSuccessResultActionIsViewableInWorkflowModule();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Failure Result Action in Workflow Module test")
	public void testCreateProfileWithViewAndDeleteNoAddEditFailureResultAction() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testProfileAccessFailureResultActionViewDeleteOnly();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Failure Result Action in Workflow Module test")
	public void testCreateProfileWithViewAndEditNoAddDeleteFailureResultAction() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testProfileAccessFailureResultActionViewEditOnly();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Failure Result Action in Workflow Module test")
	public void testCreateProfileWithViewAndAddNoEditDeleteFailureResultAction() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testProfileAccessFailureResultActionViewAddOnly();
		rxworkflowPage.clickSubmitButton();

	}

	// Success Result Action
	@Then("the user should not be able to add Success Result Action in Workflow Module test")
	public void shouldNotAllowAddingSuccessResultActionInWorkflowModule() {
		rxworkflowPage.testSuccessResultActionCannotBeAddedInWorkflowModule();

	}

	@Then("the user should not be able to delete Success Result Action in Workflow Module test")
	public void shouldNotAllowDeletingSuccessResultActionInWorkflowModule() {
		rxworkflowPage.testSuccessResultActionCannotBeDeletedInWorkflowModule();

	}

	@Then("the user should not be able to edit Success Result Action in Workflow Module test")
	public void shouldNotAllowEditingSuccessResultActionInWorkflowModule() {
		rxworkflowPage.testSuccessResultActionCannotBeEditedInWorkflowModule();

	}

	@Then("the user should be able to delete Success Result Action in Workflow Module test")
	public void shouldAllowDeletingSuccessResultActionInWorkflowModule() {
		rxworkflowPage.testSuccessResultActionIsDeletableInWorkflowModule();

	}

	@Then("the user should be able to edit Success Result Action in Workflow Module test")
	public void shouldAllowEditingSuccessResultActionInWorkflowModule() {
		rxworkflowPage.testSuccessResultActionIsEditableInWorkflowModule();

	}

	@Then("the user should be able to add Success Result Action in Workflow Module test")
	public void shouldAllowAddingSuccessResultActionInWorkflowModule() {
		rxworkflowPage.testSuccessResultActionIsAddableInWorkflowModule();

	}

	@Then("the user should be able to view Success Result Action in Workflow Module test")
	public void shouldAllowViewingSuccessResultActionInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String successResultActionsPageUrl = Hooks.prop.getProperty("successResultActionsPageUrl");
		Assert.assertNotNull("successResultActionsPageUrl is missing in config", successResultActionsPageUrl);
		String fullUrl = baseUrl + successResultActionsPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openSuccessResultActionsPage(fullUrl);
		Assert.assertTrue("Success Result Actions page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/SuccessResultActions"));
		rxworkflowPage.testSuccessResultActionIsViewableInWorkflowModule();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Success Result Action in Workflow Module test")
	public void shouldAllowViewAndEditButNotAddOrDeleteSuccessResultActionInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testSuccessResultActionViewEditOnlyNoAddDeleteInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Success Result Action in Workflow Module test")
	public void shouldAllowViewAndDeleteButNotAddOrEditSuccessResultActionInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testSuccessResultActionViewDeleteOnlyNoAddEditInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Success Result Action in Workflow Module test")
	public void shouldAllowViewAndAddButNotEditOrDeleteSuccessResultActionInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testSuccessResultActionViewAddOnlyNoEditDeleteInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	// Reminder Result Action
	@Then("the user should not be able to add Reminder Result Action in Workflow Module test")
	public void shouldNotAllowAddingReminderResultActionInWorkflowModule() {
		rxworkflowPage.testReminderResultActionCannotBeAddedInWorkflowModule();

	}

	@Then("the user should not be able to delete Reminder Result Action in Workflow Module test")
	public void shouldNotAllowDeletingReminderResultActionInWorkflowModule() {
		rxworkflowPage.reminderResultActionShouldNotBeDeletableInWorkflowModule();

	}

	@Then("the user should not be able to edit Reminder Result Action in Workflow Module test")
	public void shouldNotAllowEditingReminderResultActionInWorkflowModule() {
		rxworkflowPage.testReminderResultActionCannotBeEditedInWorkflowModule();

	}

	@Then("the user should be able to edit Reminder Result Action in Workflow Module test")
	public void shouldAllowEditingReminderResultActionInWorkflowModule() {
		rxworkflowPage.testReminderResultActionIsEditableInWorkflowModule();

	}

	@Then("the user should be able to add Reminder Result Action in Workflow Module test")
	public void shouldAllowAddingReminderResultActionInWorkflowModule() {
		rxworkflowPage.testReminderResultActionIsAddableInWorkflowModule();

	}

	@Then("the user should be able to delete Reminder Result Action in Workflow Module test")
	public void shouldAllowDeletingReminderResultActionInWorkflowModule() {
		rxworkflowPage.testReminderResultActionIsDeletableInWorkflowModule();

	}

	@Then("the user should be able to view Reminder Result Action in Workflow Module test")
	public void shouldAllowViewingReminderResultActionInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reminderResultActionsPageUrl = Hooks.prop.getProperty("reminderResultActionsPageUrl");
		Assert.assertNotNull("reminderResultActionsPageUrl is missing in config", reminderResultActionsPageUrl);
		String fullUrl = baseUrl + reminderResultActionsPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openReminderResultActionsPage(fullUrl);
		Assert.assertTrue("Reminder Result Actions page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ReminderResultActions"));
		rxworkflowPage.testReminderResultActionIsViewableInWorkflowModule();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Reminder Result Action in Workflow Module test")
	public void shouldAllowViewAndDeleteButNotAddOrEditReminderResultActionInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testReminderResultActionViewDeleteOnlyNoAddEditInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Reminder Result Action in Workflow Module test")
	public void shouldAllowViewAndEditButNotAddOrDeleteReminderResultActionInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testReminderResultActionViewEditOnlyNoAddDeleteInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Reminder Result Action in Workflow Module test")
	public void shouldAllowViewAndAddButNotEditOrDeleteReminderResultActionInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testReminderResultActionViewAddOnlyNoEditDeleteInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	// Medication SyncReminder Color Code
	@Then("the user should be able to delete Medication Sync Reminder Color Code in Workflow Module test")
	public void shouldAllowDeletingMedicationSyncReminderColorCodeInWorkflowModule() {
		rxworkflowPage.testMedicationSyncReminderColorCodeIsDeletableInWorkflowModule();

	}

	@Then("the user should not be able to add Medication Sync Reminder Color Code in Workflow Module test")
	public void shouldNotAllowAddingMedicationSyncReminderColorCodeInWorkflowModule() {
		rxworkflowPage.testMedicationSyncReminderColorCodeCannotBeAddedInWorkflowModule();

	}

	@Then("the user should not be able to delete Medication Sync Reminder Color Code in Workflow Module test")
	public void shouldNotAllowDeletingMedicationSyncReminderColorCodeInWorkflowModule() {
		rxworkflowPage.testMedicationSyncReminderColorCodeCannotBeDeletedInWorkflowModule();

	}

	@Then("the user should not be able to edit Medication Sync Reminder Color Code in Workflow Module test")
	public void shouldNotAllowEditingMedicationSyncReminderColorCodeInWorkflowModule() {
		rxworkflowPage.testMedicationSyncReminderColorCodeIsNotEditableInWorkflowModule();

	}

	@Then("the user should be able to add Medication Sync Reminder Color Code in Workflow Module test")
	public void userShouldBeAbleToAddMedicationSyncReminderColorCodeInWorkflowModuleTest() {
		rxworkflowPage.verifyUserCanAddMedicationSyncReminderColorCode();

	}

	@Then("the user should be able to edit Medication Sync Reminder Color Code in Workflow Module test")
	public void shouldAllowEditingMedicationSyncReminderColorCodeInWorkflowModule() {
		rxworkflowPage.testMedicationSyncReminderColorCodeIsEditableInWorkflowModule();

	}

	@Then("the user should be able to view Medication Sync Reminder Color Code in Workflow Module test")
	public void userShouldBeAbleToViewMedicationSyncReminderColorCodeInWorkflowModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String medicationSyncReminderColorCodesPageUrl = Hooks.prop
				.getProperty("medicationSyncReminderColorCodesPageUrl");
		Assert.assertNotNull("medicationSyncReminderColorCodesPageUrl is missing in config",
				medicationSyncReminderColorCodesPageUrl);
		String fullUrl = baseUrl + medicationSyncReminderColorCodesPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openMedicationSyncReminderColorCodesPage(fullUrl);
		Assert.assertTrue("Medication Sync Reminder Color Codes page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/MedicationSyncReminderColorCodes"));
		rxworkflowPage.verifyUserCanViewMedicationSyncReminderColorCode();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Medication Sync Reminder Color Code in Workflow Module test")
	public void testMedicationSyncReminderColorCodeViewDeleteOnlyNoAddEditInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.medicationSyncReminderColorCodeAccessControlViewDeleteOnlyInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Medication Sync Reminder Color Code in Workflow Module test")
	public void shouldAllowViewAndEditButNotAddOrDeleteMedicationSyncReminderColorCodeInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testMedicationSyncReminderColorCodeViewEditOnlyNoAddDeleteInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Medication Sync Reminder Color Code in Workflow Module test")
	public void createProfileWithViewAndAddAccessNoEditOrDeleteForMedicationSyncReminderColorCodeTest() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.createProfileWithViewAddOnlyAccessForMedicationSyncReminderColorCode();
		rxworkflowPage.clickSubmitButton();

	}

	// Sync Workflow Settings
	@Then("the user should be able to delete Sync Workflow Settings in Workflow Module test")
	public void userShouldBeAbleToDeleteSyncWorkflowSettingsInWorkflowModuleTest() {
		rxworkflowPage.verifyUserCanDeleteSyncWorkflowSettings();

	}

	@Then("the user should not be able to add Sync Workflow Settings in Workflow Module test")
	public void userShouldNotBeAbleToAddSyncWorkflowSettingsInWorkflowModuleTest() {
		rxworkflowPage.verifyUserCannotAddSyncWorkflowSettings();

	}

	@Then("the user should be able to edit Sync Workflow Settings in Workflow Module test")
	public void userShouldBeAbleToEditSyncWorkflowSettingsInWorkflowModuleTest() {
		rxworkflowPage.verifyUserCanEditSyncWorkflowSettings();

	}

	@Then("the user should not be able to delete Sync Workflow Settings in Workflow Module test")
	public void userShouldNotBeAbleToDeleteSyncWorkflowSettingsInWorkflowModuleTest() {
		rxworkflowPage.verifyUserCannotDeleteSyncWorkflowSettings();

	}

	@Then("the user should not be able to edit Sync Workflow Settings in Workflow Module test")
	public void userShouldNotBeAbleToEditSyncWorkflowSettingsInWorkflowModuleTest() {
		rxworkflowPage.assertNoEditAccessToSyncWorkflowSettings();

	}

	@Then("the user should be able to add Sync Workflow Settings in Workflow Module test")
	public void userShouldBeAbleToAddSyncWorkflowSettingsInWorkflowModuleTest() {
		rxworkflowPage.verifyUserCanAddSyncWorkflowSettings();

	}

	@Then("the user should be able to view Sync Workflow Settings in Workflow Module test")
	public void userShouldBeAbleToViewSyncWorkflowSettingsInWorkflowModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String medicationSyncReminderSettingPageUrl = Hooks.prop.getProperty("medicationSyncReminderSettingPageUrl");
		Assert.assertNotNull("medicationSyncReminderSettingPageUrl is missing in config",
				medicationSyncReminderSettingPageUrl);
		String fullUrl = baseUrl + medicationSyncReminderSettingPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openMedicationSyncReminderSettingPage(fullUrl);
		Assert.assertTrue("Sync Workflow Setting page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/MedicationSyncReminderSetting"));
		rxworkflowPage.assertUserViewAccessToSyncWorkflowSettings();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Sync Workflow Settings in Workflow Module test")
	public void createProfileWithViewAndDeleteAccessNoAddOrEditForSyncWorkflowSettingsTest() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.setupProfileViewDeleteNoAddEditSyncWorkflow();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Sync Workflow Settings in Workflow Module test")
	public void createProfileWithViewAndEditAccessNoAddOrDeleteForSyncWorkflowSettingsTest() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.setupProfileViewEditNoAddDeleteSyncWorkflow();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Sync Workflow Settings in Workflow Module test")
	public void createProfileWithViewAndAddAccessNoEditOrDeleteForSyncWorkflowSettingsTest() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.createProfileWithViewAddOnlyAccessForSyncWorkflowSettings();
		rxworkflowPage.clickSubmitButton();

	}

	// General
	@Then("the Rxworkflow user should be able to view Profiles")
	public void rxworkflowUserShouldBeAbleToViewProfiles() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String profilesPageUrl = Hooks.prop.getProperty("profilesPageUrl");
		String fullUrl = baseUrl + profilesPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openrxworkflowPage(fullUrl, "/Setup/Home/Profiles");
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Profiles"));
		System.out.println("Rxworkflow user should be able to view Profiles test");
		Hooks.scenario.log("Rxworkflow user should be able to view Profiles test");

	}

	@And("I create a profile with No access to Workflow Module General Audit View test")
	public void createProfileWithNoAccessToWorkflowGeneralAuditViewTest() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.createNoAccessProfileForWorkflowAuditViewTest();
		rxworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Rxworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Rxworkflow Module General Audit View");
	}

	@And("I create a profile with View access only to Rxworkflow Module General Audit View test")
	public void createProfileWithViewAccessOnlyToRxworkflowGeneralAuditView() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.createViewOnlyProfileForRxworkflowAuditView();
		rxworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Rxworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Rxworkflow Module General Audit View");
	}

	@Then("the user should not be able to view General Audit View settings in Workflow Module test")
	public void userShouldNotBeAbleToViewWorkflowGeneralAuditViewSettingsTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String workflowDashboardUrl = Hooks.prop.getProperty("workflowDashboardUrl");
		Assert.assertNotNull("workflowDashboardUrl is missing in config", workflowDashboardUrl);
		String fullUrl = baseUrl + workflowDashboardUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openWorkflowDashboardPage(fullUrl);
		Assert.assertTrue("Page is not displayed", Hooks.driver.getCurrentUrl().contains("/Workflow/Home/Dashboard"));
		rxworkflowPage.verifyUserCannotViewWorkflowAuditSettings();

	}

	@Then("the user should be able to view Rxworkflow Module General Audit View test")
	public void userShouldBeAbleToViewRxworkflowGeneralAuditViewTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String workflowDashboardUrl = Hooks.prop.getProperty("workflowDashboardUrl");
		Assert.assertNotNull("workflowDashboardUrl is missing in config", workflowDashboardUrl);
		String fullUrl = baseUrl + workflowDashboardUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openWorkflowDashboardPage(fullUrl);
		Assert.assertTrue("Page is not displayed", Hooks.driver.getCurrentUrl().contains("/Workflow/Home/Dashboard"));
		rxworkflowPage.assertUserViewAccessToRxworkflowAuditView();

	}
}
