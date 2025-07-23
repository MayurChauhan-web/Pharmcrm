package com.pharmcrm.pharmcrm_product.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)  
@CucumberOptions(
    features = "src/test/resources/Features/UserManagement.feature",
    glue = "com.pharmcrm.pharmcrm_product.steps",
    plugin = {"pretty", "html:target/cucumber-report.html"},
    monochrome = true,
    tags = "@ProfileViewOnly"  
)
public class TestRunner {
}

