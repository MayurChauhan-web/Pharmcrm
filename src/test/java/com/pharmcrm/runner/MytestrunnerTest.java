package com.pharmcrm.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Features/DeliveryModule/Delivery.feature" },

		glue = { "com.pharmcrm_LoginFunctionality.steps", "com.pharmcrm_PatientModule.steps",
				"com.pharmcrm_DeliveryModule.steps", "hooks" }, tags = "@Delivery",

		plugin = { "pretty", "html:target/cucumber-html-report.html",
				"json:target/cucumber-report.json" }, monochrome = true)

public class MytestrunnerTest {

}


