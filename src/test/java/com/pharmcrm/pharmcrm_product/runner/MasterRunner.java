package com.pharmcrm.pharmcrm_product.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features =  {
						"src/test/resources/com/Features/Security/LoginFunctionality.feature",
						"src/test/resources/com/Features/SalesReps Module/SalesReps.feature",
						"src/test/resources/com/Features/DrugModule/Drug.feature",
						"src/test/resources/com/Features/DeliveryModule/Delivery.feature",
						"src/test/resources/com/Features/Report Module/Report.feature",
						"src/test/resources/com/Features/SetupModule/Setup.feature",
						"src/test/resources/com/Features/ProviderModule/Provider.feature",
						"src/test/resources/com/Features/PatientModule/Patient.feature",
						"src/test/resources/com/Features/Core Module/Core.feature"
		     	   },
		
		glue = {"com.pharmcrm_WellnessModule.steps", "com.pharmcrm_PatientPortal.steps", "com.pharmcrm_LoginFunctionality.steps", "com.pharmcrm_ProjectModule.steps", "com.pharmcrm_HRModule.steps",
					"com.pharmcrm_SalesRepsModule.steps", "com.pharmcrm_ComplianceModule.steps", "com.pharmcrm_ReportModule.steps",
					"com.pharmcrm_BillingModule.steps", "com.pharmcrm_PatientModule.steps", "com.pharmcrm_DeliveryModule.steps",
					"com.pharmcrm_ClinicalModule.steps", "com.pharmcrm_DrugModule.steps", "com.pharmcrm_ProviderModule.steps",
					"com.pharmcrm_PartnerModule.steps", "com.pharmcrm_SetupModule.steps", "com.pharmcrm_HarbourModule.steps",
					"com.pharmcrm_ClinicalworkflowModule.steps", "com.pharmcrm_CoreModule.steps", 
					"hooks"
					},
		plugin = {
				"pretty",
				"html:target/cucumber-html-report.html",
				"json:target/cucumber-report.json"
		}, 
		monochrome = true
)

public class MasterRunner {

}
