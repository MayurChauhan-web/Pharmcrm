package com.pharmcrm.pharmcrm_product.runner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/com/Features/ProviderModule/Provider.feature" }, glue = {
		"com.pharmcrm_LoginFunctionality.steps", "com.pharmcrm_PatientModule.steps",
		"com.pharmcrm_DeliveryModule.steps", "com.pharmcrm_ClinicalModule.steps", "com.pharmcrm_DrugModule.steps",
		"com.pharmcrm_ProviderModule.steps", "com.pharmcrm_PatientPortal.steps", "com.pharmcrm_ProjectModule.steps",
		"com.pharmcrm_WellnessModule.steps", "hooks" }, plugin = { "pretty", "html:target/cucumber-report.html",
				"json:target/cucumber.json" }, monochrome = true, tags = "@Provider")
public class MasterRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}







