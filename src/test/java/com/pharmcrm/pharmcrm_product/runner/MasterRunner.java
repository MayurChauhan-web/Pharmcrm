package com.pharmcrm.pharmcrm_product.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/com/Features/RxworkflowModule/Rxworkflow.feature", 
                 glue = {"com.pharmcrm_WellnessModule.steps", "com.pharmcrm_PatientPortal.steps","com.pharmcrm_LoginFunctionality.steps", 
                		 	"com.pharmcrm_ProjectModule.steps", "com.pharmcrm_HRModule.steps", "com.pharmcrm_SalesRepsModule.steps", 
                		 	"com.pharmcrm_ComplianceModule.steps", "com.pharmcrm_ReportModule.steps", "com.pharmcrm_BillingModule.steps",
                		 	"com.pharmcrm_PatientModule.steps", "com.pharmcrm_DeliveryModule.steps", "com.pharmcrm_ClinicalModule.steps", 
                		 	"com.pharmcrm_DrugModule.steps", "com.pharmcrm_ProviderModule.steps", "com.pharmcrm_PartnerModule.steps", 
                		 	"com.pharmcrm_SetupModule.steps", "com.pharmcrm_HarbourModule.steps", "com.pharmcrm_ClinicalworkflowModule.steps", 
                		 	"com.pharmcrm_RxworkflowModule.steps","com.pharmcrm_XflowApplication.steps",
                		 	"hooks" }, 
                 plugin = { 
                		 "pretty",
                		 "html:target/cucumber-html-report.html", 
                		 "json:target/cucumber-report.json" 
                		 }, 
                 monochrome = true,
                 tags = "@XflowApp"
)

public class MasterRunner {

}

