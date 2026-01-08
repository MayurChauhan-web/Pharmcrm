package com.pharmcrm.pharmcrm_product.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/com/Features/Patient Portal/PatientPortalWellness.feature",
    glue = {"com.pharmcrm_WellnessModule.steps", "com.pharmcrm_PatientPortal.steps", "com.pharmcrm_LoginFunctionality.steps",
    		"com.pharmcrm_ProjectModule.steps", "hooks"},
    plugin = {
    	"pretty",
        "html:target/cucumber-html-report.html",
        "json:target/cucumber-report.json"
    },
    monochrome = true
)

public class MasterRunner {

}
