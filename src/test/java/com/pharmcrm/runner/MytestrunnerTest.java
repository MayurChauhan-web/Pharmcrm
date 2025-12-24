package com.pharmcrm.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Features" },

		glue = { "com.pharmcrm.LoginFunctionality.steps", "com.pharmcrm.PatientFunctionality.steps",
				"hooks" }, tags = "@Patient", plugin = { "pretty", "html:target/cucumber-html-report.html",
						"json:target/cucumber-report.json" }, monochrome = true)

public class MytestrunnerTest {

}
