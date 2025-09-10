package com.pharmcrm.pharmcrm_product.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
		// all feature files
		features = { "src/test/resources/Features/Patient.feature",
		// Patient.feature
		},
		// all step definitions
		glue = "com.pharmcrm.pharmcrm_product.steps", // contains DrugSteps.java, PatientSteps.java, SetupSteps.java
		plugin = { "pretty", "html:target/cucumber-report.html",
				"json:target/cucumber.json" }, monochrome = true, tags = "@Patient" // run specific modules by tags
)
public class MasterRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
