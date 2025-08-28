package com.pharmcrm.pharmcrm_product.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
    features = "src/test/resources/Features/UserManagement.feature",
    glue = "com.pharmcrm.pharmcrm_product.steps",
    plugin = {
        "pretty",
        "html:target/cucumber-report.html",
        "json:target/cucumber.json"
    },
    monochrome = true,
    tags = "@login"  
)
public class TestNGRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
