package com.pharmcrm.pharmcrm_product.runner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "/src/test/resources/Features/PatientModule/Patient.feature" }, glue = {
		"com.pharmcrm_LoginFunctionality.steps", "com.pharmcrm_PatientModule.steps", "hooks" }, plugin = { "pretty",
				"html:target/cucumber-report.html", "json:target/cucumber.json" }, monochrome = true, tags = "@Patient")
public class MasterRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
