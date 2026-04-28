@ReportModduleFeature

Feature: Report Module Functionality 

Scenario: User able to login with user type as Organization in login page  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  
Scenario: Organizational user able to click on Report Module tab 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  
  
  #-------------------------- Workflow Section ----------------------------------------------
  
  
Scenario: Organizational user able to click on Workflow tab in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  
Scenario: Organizational user able to click on New Runningline tab in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the new runningline tab in workflow section
  
Scenario: Organizational user able to click on Export Excel button in New Runningline Subsection of Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the new runningline tab in workflow section
  And user click on the Export Excel button in new runningline
  
Scenario: Organizational user able to click on Star2 Fax tab in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the star2 fax tab in workflow section
  
Scenario: Organizational user able to perform the Export Excel functionality in Star2 Fax Subsection of Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the star2 fax tab in workflow section
  And user click on the export excel button in star2 fax
  
Scenario: Organizational user able to perform the Filter functionality in Star2 Fax Subsection of Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the star2 fax tab in workflow section
  And user click on the filter button in star2 fax
  When user select the from date in star2 fax
  Then user select the to date in star2 fax
  And user click on the search button in star2 fax
  
Scenario: Organizational user able to perform the Filter functionality with Selecting only From Date in Star2 Fax Subsection of Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the star2 fax tab in workflow section
  And user click on the filter button in star2 fax
  When user select the from date in star2 fax
  And user click on the search button in star2 fax
  
Scenario: Organizational user able to perform the Filter functionality with Selecting only To Date in Star2 Fax Subsection of Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the star2 fax tab in workflow section
  And user click on the filter button in star2 fax
  When user select the to date in star2 fax
  And user click on the search button in star2 fax
  
Scenario: Organizational user able perform the Filter functionality with Selecting To Date as Less than From Date in Star2 Fax Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the star2 fax tab in workflow section
  And user click on the filter button in star2 fax
  Then user select the from date in star2 fax
  And user select the to date is less than of from date in star2 fax
  When user click on the search button in star2 fax   
  
Scenario: Organizational user able to perform the View functionality in Star2 Fax Subsection of Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the star2 fax tab in workflow section
  And user click on the view button in star2 fax
  
Scenario: Organizational user able to click on the Team Action tab in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the team action tab in workflow section
  
Scenario: Organizational user able to click on the Export Excel button in Team Action Subsection of Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the team action tab in workflow section
  And user click on the export excel button in team action
  
Scenario: Organizational user able to perform the Filter functionality in Team Action Subsection of Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the team action tab in workflow section
  When user click on the filter button in team action
  Then user select the from date in team action
  And user select the to date in team action
  When user click on the search button in team action
  
Scenario: Organizational user able to perform the Filter functionality with Selecting only From Date in Team Action Subsection of Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the team action tab in workflow section
  When user click on the filter button in team action
  Then user select the from date in team action
  When user click on the search button in team action
  
Scenario: Organizational user able to perform the Filter functionality with Selecting only To Date in Team Action Subsection of Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the team action tab in workflow section
  When user click on the filter button in team action
  Then user select the to date in team action
  When user click on the search button in team action
  
Scenario: Organizational user able to perform the Filter functionality with filed any filled in Team Action Subsection of Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the team action tab in workflow section
  When user click on the filter button in team action
  Then user click on the search button in team action
  
Scenario: Organizational user able to perform the Filter functionality with click on Clear button in Team Action Subsection of Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the team action tab in workflow section
  When user click on the filter button in team action
  Then user select the from date in team action
  And user select the to date in team action
  When user click on the search button in team action
  Then user click on the clear button in team action
  
Scenario: Organizational user able to perform the Filter functionality with Selecting only From Date and click Clear button in Team Action Subsection of Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the team action tab in workflow section
  When user click on the filter button in team action
  Then user select the from date in team action
  When user click on the search button in team action
  Then user click on the clear button in team action
  
Scenario: Organizational user able to perform the Filter functionality with Selecting only To Date and click Clear button in Team Action Subsection of Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the team action tab in workflow section
  When user click on the filter button in team action
  Then user select the to date in team action
  When user click on the search button in team action
  Then user click on the clear button in team action
  
Scenario: Organizational user able perform the Filter functionality with Selecting To Date as Less than From Date in Team Action Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the team action tab in workflow section
  And user click on the filter button in team action
  Then user select the from date in team action
  And user select the to date is less than of from date in team action
  When user click on the search button in team action  
  
Scenario: Organizational user able click on the Text Audit tab in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the text audit tab in communication
  
Scenario: Organizational user able click on the Export Excel button in Text Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the text audit tab in communication
  When user click on the export excel button in text audit
  
Scenario: Organizational user able perform the Filter functionality in Text Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the text audit tab in communication
  When user click on the filter button in text audit
  Then user select the from date in text audit
  And user select the to date in text audit
  When user click on the search button in text audit
  
Scenario: Organizational user able perform the Filter functionality with Selecting only From Date in Text Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the text audit tab in communication
  When user click on the filter button in text audit
  Then user select the from date in text audit
  When user click on the search button in text audit
  
Scenario: Organizational user able perform the Filter functionality with Selecting only To Date in Text Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the text audit tab in communication
  When user click on the filter button in text audit
  Then user select the to date in text audit
  When user click on the search button in text audit
  
Scenario: Organizational user able perform the Filter functionality with click on the Clear button in Text Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the text audit tab in communication
  When user click on the filter button in text audit
  Then user select the from date in text audit
  And user select the to date in text audit
  When user click on the search button in text audit
  Then user click on the clear button in text audit
  
Scenario: Organizational user able perform the Filter functionality with Selecting only From Date and click on the Clear button in Text Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the text audit tab in communication
  When user click on the filter button in text audit
  Then user select the from date in text audit
  When user click on the search button in text audit
  Then user click on the clear button in text audit
  
Scenario: Organizational user able perform the Filter functionality with Selecting only To Date and click on the Clear button in Text Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the text audit tab in communication
  When user click on the filter button in text audit
  Then user select the to date in text audit
  When user click on the search button in text audit
  Then user click on the clear button in text audit
  
Scenario: Organizational user able perform the Filter functionality with Selecting To Date as Less than From Date in Text Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the text audit tab in communication
  When user click on the filter button in text audit
  Then user select the from date in text audit
  And user select the to date is less than of from date in text audit
  When user click on the search button in text audit 
  
Scenario: Organizational user able click on the BOT Call Audit tab in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the BOT Call Audit tab in communication
  
Scenario: Organizational user able perform the Export Excel functionality in BOT Call Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the BOT Call Audit tab in communication
  When user click on the export excel button in BOT Call Audit
  
Scenario: Organizational user able perform the Filter functionality in BOT Call Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the BOT Call Audit tab in communication
  When user click on the filter button in BOT Call Audit
  Then user select the from date in BOT Call Audit
  And user select the to date in BOT Call Audit
  When user click on the search button in BOT Call Audit
  
Scenario: Organizational user able perform the Filter functionality with click on the Clear button in BOT Call Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the BOT Call Audit tab in communication
  When user click on the filter button in BOT Call Audit
  Then user select the from date in BOT Call Audit
  And user select the to date in BOT Call Audit
  When user click on the search button in BOT Call Audit
  Then user click on the clear button in BOT Call Audit
  
Scenario: Organizational user able perform the Filter functionality with Selecting only From Date in BOT Call Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the BOT Call Audit tab in communication
  When user click on the filter button in BOT Call Audit
  Then user select the from date in BOT Call Audit
  When user click on the search button in BOT Call Audit
  
Scenario: Organizational user able perform the Filter functionality with Selecting only From Date and click on the Clear button in BOT Call Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the BOT Call Audit tab in communication
  When user click on the filter button in BOT Call Audit
  Then user select the from date in BOT Call Audit
  When user click on the search button in BOT Call Audit
  Then user click on the clear button in BOT Call Audit
  
Scenario: Organizational user able perform the Filter functionality with Selecting only To Date in BOT Call Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the BOT Call Audit tab in communication
  When user click on the filter button in BOT Call Audit
  Then user select the to date in BOT Call Audit
  When user click on the search button in BOT Call Audit
  
Scenario: Organizational user able perform the Filter functionality with Selecting only To Date and click on the Clear button in BOT Call Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the BOT Call Audit tab in communication
  When user click on the filter button in BOT Call Audit
  Then user select the to date in BOT Call Audit
  When user click on the search button in BOT Call Audit
  Then user click on the clear button in BOT Call Audit
  
Scenario: Organizational user able perform the Filter functionality with Selecting To Date as Less than From Date in Fax Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the BOT Call Audit tab in communication
  When user click on the filter button in BOT Call Audit
  Then user select the from date in BOT Call Audit
  And user select the to date is less than of from date in BOT Call Audit
  When user click on the search button in BOT Call Audit
  
Scenario: Organizational user able click on the Fax Audit tab in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the Fax Audit tab in communication
  
Scenario: Organizational user able perform the Export Excel functionality in Fax Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the Fax Audit tab in communication
  When user click on the export excel button in fax audit
  
Scenario: Organizational user able perform the Filter functionality in Fax Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the Fax Audit tab in communication
  When user click on the filter button in fax audit
  Then user select the from date in fax audit
  And user select the to date in fax audit
  When user click on the search button in fax audit
  
Scenario: Organizational user able perform the Filter functionality and click on the Clear button in Fax Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the Fax Audit tab in communication
  When user click on the filter button in fax audit
  Then user select the from date in fax audit
  And user select the to date in fax audit
  When user click on the search button in fax audit
  Then user click on the clear button in fax audit
  
Scenario: Organizational user able perform the Filter functionality with Selecting only From Date in Fax Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the Fax Audit tab in communication
  When user click on the filter button in fax audit
  Then user select the from date in fax audit
  When user click on the search button in fax audit
  
Scenario: Organizational user able perform the Filter functionality with Selecting only To Date in Fax Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the Fax Audit tab in communication
  When user click on the filter button in fax audit
  Then user select the to date in fax audit
  When user click on the search button in fax audit
  
Scenario: Organizational user able perform the Filter functionality with Selecting only From Date and click on the Clear button in Fax Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the Fax Audit tab in communication
  When user click on the filter button in fax audit
  Then user select the from date in fax audit
  When user click on the search button in fax audit
  Then user click on the clear button in fax audit
  
Scenario: Organizational user able perform the Filter functionality with Selecting only To Date and click on the Clear button in Fax Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the Fax Audit tab in communication
  When user click on the filter button in fax audit
  Then user select the to date in fax audit
  When user click on the search button in fax audit
  Then user click on the clear button in fax audit
  
Scenario: Organizational user able perform the Filter functionality with Selecting To Date as Less than From Date in Fax Audit Subsection in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the Fax Audit tab in communication
  When user click on the filter button in fax audit
  Then user select the from date in fax audit
  And user select the to date is less than of from date in fax audit
  When user click on the search button in fax audit
  
Scenario: Organizational user able click on the Mail Audit tab in Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the Mail Audit tab in communication
  
Scenario: Organizational user able perform the Export Excel Functionality in Mail Audit Subsection of Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the Mail Audit tab in communication
  When user click on the export excel button in mail audit
  
Scenario: Organizational user able perform the Filter Functionality in Mail Audit Subsection of Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the Mail Audit tab in communication
  When user click on the filter button in mail audit
  Then user select the from date in mail audit
  And user select the to date in mail audit
  When user click on the search button in mail audit
  
Scenario: Organizational user able perform the Filter Functionality with Selecting To Date less than of From Date in Mail Audit Subsection of Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the Mail Audit tab in communication
  When user click on the filter button in mail audit
  Then user select the from date in mail audit
  And user select the to date is less than of from date in mail audit
  When user click on the search button in mail audit
  
Scenario: Organizational user able perform the Filter Functionality and click on the Clear button in Mail Audit Subsection of Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the Mail Audit tab in communication
  When user click on the filter button in mail audit
  Then user select the from date in mail audit
  And user select the to date in mail audit
  When user click on the search button in mail audit
  Then user click on the clear button in mail audit
  
Scenario: Organizational user able perform the Filter Functionality in Mail Audit Subsection with Selecting only From Date of Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the Mail Audit tab in communication
  When user click on the filter button in mail audit
  Then user select the from date in mail audit
  When user click on the search button in mail audit
  
Scenario: Organizational user able perform the Filter Functionality in Mail Audit Subsection with Selecting only From Date and click on the Clear button of Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the Mail Audit tab in communication
  When user click on the filter button in mail audit
  Then user select the from date in mail audit
  When user click on the search button in mail audit
  Then user click on the clear button in mail audit
  
Scenario: Organizational user able perform the Filter Functionality in Mail Audit Subsection with Selecting only To Date of Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the Mail Audit tab in communication
  When user click on the filter button in mail audit
  Then user select the to date in mail audit
  When user click on the search button in mail audit
  
Scenario: Organizational user able perform the Filter Functionality in Mail Audit Subsection with Selecting only To Date and click on the Clear button of Workflow Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Workflow tab in sidebar in Report module page
  Then user click on the communication tab in workflow section
  And user click on the Mail Audit tab in communication
  When user click on the filter button in mail audit
  Then user select the to date in mail audit
  When user click on the search button in mail audit
  Then user click on the clear button in mail audit
     
     
    #-------------------------- Sales Rep Visit Section ----------------------------------------------
    
    
Scenario: Organizational user able to click on the Sales Rep tab in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep tab in sidebar in Report module page
  Then user click on the sales rep visit tab in sales rep
  
Scenario: Organizational user able to perform the Export Excel functionality in Sales Rep Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep tab in sidebar in Report module page
  Then user click on the sales rep visit tab in sales rep
  And user click on the export excel button in sales rep visit
  
Scenario: Organizational user able to perform the Filter functionality in Sales Rep Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep tab in sidebar in Report module page
  Then user click on the sales rep visit tab in sales rep
  And user click on the filter button in sales rep visit
  When user select the from date in sales rep visit
  Then user select the to date in sales rep visit
  And user click on the search button in sales rep visit
  
Scenario: Organizational user able to perform the Filter functionality and click on the Clear button  in Sales Rep Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep tab in sidebar in Report module page
  Then user click on the sales rep visit tab in sales rep
  And user click on the filter button in sales rep visit
  When user select the from date in sales rep visit
  Then user select the to date in sales rep visit
  And user click on the search button in sales rep visit
  When user click on the clear button in sales rep visit
  
Scenario: Organizational user able to perform the Filter functionality with Selecting To Date is less than From Date in Sales Rep Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep tab in sidebar in Report module page
  Then user click on the sales rep visit tab in sales rep
  And user click on the filter button in sales rep visit
  When user select the from date in sales rep visit
  Then user select the to date is less than from date in sales rep visit
  And user click on the search button in sales rep visit
  
Scenario: Organizational user able to perform the Filter functionality with Selecting To Date is less than From Date in Sales Rep Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep tab in sidebar in Report module page
  Then user click on the sales rep visit tab in sales rep
  And user click on the filter button in sales rep visit
  When user select the from date in sales rep visit
  Then user select the to date is less than from date in sales rep visit
  And user click on the search button in sales rep visit
  When user click on the clear button in sales rep visit
  
Scenario: Organizational user able to perform the Filter functionality with Selecting only From Date in Sales Rep Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep tab in sidebar in Report module page
  Then user click on the sales rep visit tab in sales rep
  And user click on the filter button in sales rep visit
  When user select the from date in sales rep visit
  And user click on the search button in sales rep visit
  
Scenario: Organizational user able to perform the Filter functionality with Selecting only From Date and click on the Clear button in Sales Rep Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep tab in sidebar in Report module page
  Then user click on the sales rep visit tab in sales rep
  And user click on the filter button in sales rep visit
  When user select the from date in sales rep visit
  And user click on the search button in sales rep visit
  Then user click on the clear button in sales rep visit
  
Scenario: Organizational user able to perform the Filter functionality with Selecting only To Date in Sales Rep Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep tab in sidebar in Report module page
  Then user click on the sales rep visit tab in sales rep
  And user click on the filter button in sales rep visit
  When user select the to date in sales rep visit
  And user click on the search button in sales rep visit
  
Scenario: Organizational user able to perform the Filter functionality with Selecting only To Date and click on the Clear button in Sales Rep Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep tab in sidebar in Report module page
  Then user click on the sales rep visit tab in sales rep
  And user click on the filter button in sales rep visit
  When user select the to date in sales rep visit
  And user click on the search button in sales rep visit
  Then user click on the clear button in sales rep visit
  
  
  #-------------------------- Drug Section ----------------------------------------------
  
  
Scenario: Organizational user able to click on the Drug tab in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Drug tab in sidebar in Report module page
  Then user click on the drug tab in Drug
  
Scenario: Organizational user able to perform the Export Excel functionality in Drug Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Drug tab in sidebar in Report module page
  Then user click on the drug tab in Drug
  And user click on the export excel button in drug
  
Scenario: Organizational user able to perform the Filter functionality in Drug Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Drug tab in sidebar in Report module page
  Then user click on the drug tab in Drug
  And user click on the filter button in drug
  When user select the from date in drug
  Then user select the to date in drug
  And user enter the drug name in drug
  When user enter the packager in drug
  Then user enter the NDC in drug
  And user click on the search button in drug
  
Scenario: Organizational user able to perform the Filter functionality and click on the Clear button in Drug Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Drug tab in sidebar in Report module page
  Then user click on the drug tab in Drug
  And user click on the filter button in drug
  When user select the from date in drug
  Then user select the to date in drug
  And user enter the drug name in drug
  When user enter the packager in drug
  Then user enter the NDC in drug
  And user click on the search button in drug
  When user click on the clear button in drug
  
Scenario: Organizational user able to perform the Filter functionality with Selecting only From Date in Drug Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Drug tab in sidebar in Report module page
  Then user click on the drug tab in Drug
  And user click on the filter button in drug
  When user select the from date in drug
  And user click on the search button in drug
  
Scenario: Organizational user able to perform the Filter functionality with Selecting only From Date and click on the Clear button in Drug Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Drug tab in sidebar in Report module page
  Then user click on the drug tab in Drug
  And user click on the filter button in drug
  When user select the from date in drug
  And user click on the search button in drug
  When user click on the clear button in drug
  
Scenario: Organizational user able to perform the Filter functionality with Selecting only To Date in Drug Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Drug tab in sidebar in Report module page
  Then user click on the drug tab in Drug
  And user click on the filter button in drug
  When user select the to date in drug
  And user click on the search button in drug    
  
Scenario: Organizational user able to perform the Filter functionality with Selecting only To Date and click on the Clear button in Drug Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Drug tab in sidebar in Report module page
  Then user click on the drug tab in Drug
  And user click on the filter button in drug
  When user select the to date in drug
  And user click on the search button in drug
  When user click on the clear button in drug  
  
Scenario: Organizational user able to perform the Filter functionality with entering only Drug Name in Drug Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Drug tab in sidebar in Report module page
  Then user click on the drug tab in Drug
  And user click on the filter button in drug
  When user enter the drug name in drug
  And user click on the search button in drug
  
Scenario: Organizational user able to perform the Filter functionality with entering only Drug Name and click on the Clear button in Drug Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Drug tab in sidebar in Report module page
  Then user click on the drug tab in Drug
  And user click on the filter button in drug
  When user enter the drug name in drug
  And user click on the search button in drug
  When user click on the clear button in drug
  
Scenario: Organizational user able to perform the Filter functionality with entering only Packager in Drug Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Drug tab in sidebar in Report module page
  Then user click on the drug tab in Drug
  And user click on the filter button in drug
  When user enter the packager in drug
  And user click on the search button in drug
  
Scenario: Organizational user able to perform the Filter functionality with entering only Packager and click on the Clear button in Drug Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Drug tab in sidebar in Report module page
  Then user click on the drug tab in Drug
  And user click on the filter button in drug
  When user enter the packager in drug
  And user click on the search button in drug
  When user click on the clear button in drug
  
Scenario: Organizational user able to perform the Filter functionality with entering only NDC in Drug Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Drug tab in sidebar in Report module page
  Then user click on the drug tab in Drug
  And user click on the filter button in drug
  Then user enter the NDC in drug
  And user click on the search button in drug
  
Scenario: Organizational user able to perform the Filter functionality with entering only NDC and click on the Clear button in Drug Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Drug tab in sidebar in Report module page
  Then user click on the drug tab in Drug
  And user click on the filter button in drug
  Then user enter the NDC in drug
  And user click on the search button in drug
  When user click on the clear button in drug                        
  
Scenario: Organizational user able to perform the Filter functionality with entering Invalid data in Drug Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Drug tab in sidebar in Report module page
  Then user click on the drug tab in Drug
  And user click on the filter button in drug
  When user select the from date in drug
  Then user select the to date as less than from date in drug
  And user enter the invalid drug name in drug
  When user enter the invalid packager in drug
  Then user enter the invalid NDC in drug
  And user click on the search button in drug
  
Scenario: Organizational user able to perform the Filter functionality with entering Invalid data and click on the Clear button in Drug Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Drug tab in sidebar in Report module page
  Then user click on the drug tab in Drug
  And user click on the filter button in drug
  When user select the from date in drug
  Then user select the to date as less than from date in drug
  And user enter the invalid drug name in drug
  When user enter the invalid packager in drug
  Then user enter the invalid NDC in drug
  And user click on the search button in drug
  When user click on the clear button in drug
  
Scenario: Organizational user able to perform the Filter functionality with Selecting To date as less than From Date in Drug Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Drug tab in sidebar in Report module page
  Then user click on the drug tab in Drug
  And user click on the filter button in drug
  When user select the from date in drug
  Then user select the to date as less than from date in drug
  And user click on the search button in drug
  
  
  #-------------------------- Billings (Payment Status) Section ----------------------------------------------
  
  
Scenario: Organizational user able to click on the Payment Status Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Billings tab in sidebar in Report module page
  Then user click on the payment status tab in Billings
  
Scenario: Organizational user able to perform the Export Excel functionality in Payment Status Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Billings tab in sidebar in Report module page
  Then user click on the payment status tab in Billings
  And user click on the export excel button in payment status
  
Scenario: Organizational user able to perform the Filter functionality in Payment Status Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Billings tab in sidebar in Report module page
  Then user click on the payment status tab in Billings
  And user click on the filter button in payment status
  When user select the from date in payment status
  Then user select the to date in payment status
  And user click on the search button in payment status
  
Scenario: Organizational user able to perform the Filter functionality and click on the Clear button in Payment Status Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Billings tab in sidebar in Report module page
  Then user click on the payment status tab in Billings
  And user click on the filter button in payment status
  When user select the from date in payment status
  Then user select the to date in payment status
  And user click on the search button in payment status
  When user click on the clear button in payment status
  
Scenario: Organizational user able to perform the Filter functionality with Selecting To date as less than From Date in Payment Status Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Billings tab in sidebar in Report module page
  Then user click on the payment status tab in Billings
  And user click on the filter button in payment status
  When user select the from date in payment status
  Then user select the to date as less than from date in payment status
  And user click on the search button in payment status
  
Scenario: Organizational user able to perform the Filter functionality with Selecting only From Date in Payment Status Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Billings tab in sidebar in Report module page
  Then user click on the payment status tab in Billings
  And user click on the filter button in payment status
  When user select the from date in payment status
  And user click on the search button in payment status
  
Scenario: Organizational user able to perform the Filter functionality with Selecting only From Date and click on the Clear button in Payment Status Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Billings tab in sidebar in Report module page
  Then user click on the payment status tab in Billings
  And user click on the filter button in payment status
  When user select the from date in payment status
  And user click on the search button in payment status
  When user click on the clear button in payment status
  
Scenario: Organizational user able to perform the Filter functionality with Selecting only To Date in Payment Status Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Billings tab in sidebar in Report module page
  Then user click on the payment status tab in Billings
  And user click on the filter button in payment status
  When user select the to date in payment status
  And user click on the search button in payment status
  
Scenario: Organizational user able to perform the Filter functionality with Selecting only To Date and click on the Clear button in Payment Status Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Billings tab in sidebar in Report module page
  Then user click on the payment status tab in Billings
  And user click on the filter button in payment status
  When user select the to date in payment status
  And user click on the search button in payment status
  When user click on the clear button in payment status
  
  
  #-------------------------- Patients Section ----------------------------------------------
  
  
Scenario: Organizational user able to click on the Patient ReSync tab in Patients Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Patients tab in sidebar in Report module page
  Then user click on the Patient ReSync tab in Patients
  
Scenario: Organizational user able to perform Export Excel functionality in Patient ReSync Subsection of Patients Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Patients tab in sidebar in Report module page
  Then user click on the Patient ReSync tab in Patients
  And user click on the export excel button in patient resync
  
Scenario: Organizational user able to perform Filter functionality in Patient ReSync Subsection of Patients Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Patients tab in sidebar in Report module page
  Then user click on the Patient ReSync tab in Patients
  And user click on the filter button in patient resync
  When user select the from select day of month by index in patient resync
  Then user select the to select day of month by index in patient resync
  And user click on the search button in patient resync
  
Scenario: Organizational user able to perform Filter functionality and click on the Clear button in Patient ReSync Subsection of Patients Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Patients tab in sidebar in Report module page
  Then user click on the Patient ReSync tab in Patients
  And user click on the filter button in patient resync
  When user select the from select day of month by index in patient resync
  Then user select the to select day of month by index in patient resync
  And user click on the search button in patient resync
  When user click on the clear button in patient resync
  
Scenario: Organizational user able to perform Filter functionality with Selecting the To day as less than From Day in Patient ReSync Subsection of Patients Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Patients tab in sidebar in Report module page
  Then user click on the Patient ReSync tab in Patients
  And user click on the filter button in patient resync
  When user select the from select day of month by index in patient resync
  Then user select the to select day of month as less from day by index in patient resync
  And user click on the search button in patient resync
  
Scenario: Organizational user able to perform Filter functionality with Selecting only From Day in Patient ReSync Subsection of Patients Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Patients tab in sidebar in Report module page
  Then user click on the Patient ReSync tab in Patients
  And user click on the filter button in patient resync
  When user select the from select day of month by index in patient resync
  And user click on the search button in patient resync
  
Scenario: Organizational user able to perform Filter functionality with Selecting only To Day in Patient ReSync Subsection of Patients Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Patients tab in sidebar in Report module page
  Then user click on the Patient ReSync tab in Patients
  And user click on the filter button in patient resync
  When user select the to select day of month by index in patient resync
  And user click on the search button in patient resync
  
Scenario: Organizational user able to click on the Patients By Ranking in Patients Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Patients tab in sidebar in Report module page
  Then user click on the Patients By Ranking tab in Patients
  
Scenario: Organizational user able to perform the Export Excel functionality in Patients By Ranking Subsection of Patients Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Patients tab in sidebar in Report module page
  Then user click on the Patients By Ranking tab in Patients
  And user click on the export excel button in patients by ranking
  
  
  #----------------------------- Provider Section ----------------------------------------------
  
  
Scenario: Organizational user able to click on the Providers By Ranking in Provider Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Provider tab in sidebar in Report module page
  Then user click on the Providers By Ranking tab in Patients
  
Scenario: Organizational user able to perform the Export Excel functionality in Providers By Ranking Subsection of Provider Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Provider tab in sidebar in Report module page
  Then user click on the Providers By Ranking tab in Patients
  And user click on the export excel button in providers by ranking
  
  
  #----------------------------- Clinical Section ----------------------------------------------
  
  
Scenario: Organizational user able to click on the Prior Authorization tab in Clinical Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Clinical tab in sidebar in Report module page
  Then user click on the prior authorization tab in Clinical
  
Scenario: Organizational user able to perform the Export to Document functionality on the Prior Authorization tab in Clinical Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Clinical tab in sidebar in Report module page
  Then user click on the prior authorization tab in Clinical
  And user click on the export to document button in prior authorization
  
Scenario: Organizational user able to perform the Filter functionality on the Prior Authorization tab in Clinical Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Clinical tab in sidebar in Report module page
  Then user click on the prior authorization tab in Clinical
  And user click on the filter button in prior authorization
  When user click on the add provider tab in filter of prior authorization
  Then user enter the provider last name in search provider pop-up window
  And user enter the provider first name in search provider pop-up window
  When user enter the provider phone number in search provider pop-up window
  Then user click on the search button in search provider pop-up window
  And user click on the first provider radio button in search provider pop-up window
  Then user click on the submit button in search provider pop-up window
  When user click on the add provider group tab in filter of prior authorization
  Then user enter the provider group name in search provider group pop-up window
  And user click on the search button in search provider group pop-up window
  And user click on the first provider radio button in search provider group pop-up window
  When user click on the submit button in search provider group pop-up window
  Then user select the from date in filter of prior authorization
  And user select the to date in filter of prior authorization
  When user click on the search button in filter of prior authorization
  
Scenario: Organizational user able to perform the Filter functionality with Selecting To date as less than From Date on the Prior Authorization tab in Clinical Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Clinical tab in sidebar in Report module page
  Then user click on the prior authorization tab in Clinical
  And user click on the filter button in prior authorization
  When user click on the add provider tab in filter of prior authorization
  Then user enter the provider last name in search provider pop-up window
  And user enter the provider first name in search provider pop-up window
  When user enter the provider phone number in search provider pop-up window
  Then user click on the search button in search provider pop-up window
  And user click on the first provider radio button in search provider pop-up window
  When user click on the submit button in search provider pop-up window
  When user click on the add provider group tab in filter of prior authorization
  Then user enter the provider group name in search provider group pop-up window
  And user click on the search button in search provider group pop-up window
  And user click on the first provider radio button in search provider group pop-up window
  When user click on the submit button in search provider group pop-up window
  Then user select the from date in filter of prior authorization
  And user select the to date as less than from date in filter of prior authorization
  When user click on the search button in filter of prior authorization
  
Scenario: Organizational user able to perform the Filter functionality with Selecting only Provider on the Prior Authorization tab in Clinical Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Clinical tab in sidebar in Report module page
  Then user click on the prior authorization tab in Clinical
  And user click on the filter button in prior authorization
  When user click on the add provider tab in filter of prior authorization
  Then user enter the provider last name in search provider pop-up window
  And user enter the provider first name in search provider pop-up window
  When user enter the provider phone number in search provider pop-up window
  Then user click on the search button in search provider pop-up window
  And user click on the first provider radio button in search provider pop-up window
  Then user click on the submit button in search provider pop-up window
  When user click on the search button in filter of prior authorization
  
Scenario: Organizational user able to perform the Filter functionality with Selecting only Provider and without entering Provider Name on the Prior Authorization tab in Clinical Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Clinical tab in sidebar in Report module page
  Then user click on the prior authorization tab in Clinical
  And user click on the filter button in prior authorization
  When user click on the add provider tab in filter of prior authorization
  Then user click on the search button in search provider pop-up window
  And user click on the first provider radio button in search provider pop-up window
  Then user click on the submit button in search provider pop-up window
  When user click on the search button in filter of prior authorization 
  
Scenario: Organizational user able to perform the Filter functionality click on the Submit button and without entering Provider Name on the Prior Authorization tab in Clinical Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Clinical tab in sidebar in Report module page
  Then user click on the prior authorization tab in Clinical
  And user click on the filter button in prior authorization
  When user click on the add provider tab in filter of prior authorization
  Then user click on the submit button in search provider pop-up window
  When user click on the search button in filter of prior authorization   
  
Scenario: Organizational user able to perform the Filter functionality with Selecting only Provider Group on the Prior Authorization tab in Clinical Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Clinical tab in sidebar in Report module page
  Then user click on the prior authorization tab in Clinical
  And user click on the filter button in prior authorization
  When user click on the add provider group tab in filter of prior authorization
  Then user enter the provider group name in search provider group pop-up window
  And user click on the search button in search provider group pop-up window
  And user click on the first provider radio button in search provider group pop-up window
  When user click on the submit button in search provider group pop-up window
  Then user select the from date in filter of prior authorization
  And user select the to date in filter of prior authorization
  When user click on the search button in filter of prior authorization
  
Scenario: Organizational user able to perform the Filter functionality with Selecting only From Date on the Prior Authorization tab in Clinical Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Clinical tab in sidebar in Report module page
  Then user click on the prior authorization tab in Clinical
  And user click on the filter button in prior authorization
  Then user select the from date in filter of prior authorization
  When user click on the search button in filter of prior authorization
  
Scenario: Organizational user able to perform the Filter functionality with Selecting only To Date on the Prior Authorization tab in Clinical Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Clinical tab in sidebar in Report module page
  Then user click on the prior authorization tab in Clinical
  And user click on the filter button in prior authorization
  Then user select the to date in filter of prior authorization
  When user click on the search button in filter of prior authorization
  
Scenario: Organizational user able to perform the Filter functionality with Selecting To Date as less than From Date on the Prior Authorization tab in Clinical Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Clinical tab in sidebar in Report module page
  Then user click on the prior authorization tab in Clinical
  And user click on the filter button in prior authorization
  Then user select the from date in filter of prior authorization
  And user select the to date as less than from date in filter of prior authorization
  When user click on the search button in filter of prior authorization
  
  
  #----------------------------- Referral Section ----------------------------------------------
  
  
Scenario: Organizational user able to click on the Referral tab in Referral Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Referral tab in sidebar in Report module page
  Then user click on the referral tab in Referral
  
Scenario: Organizational user able to perofrm the Export To Document functionality in Referral Subsection of Referral Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Referral tab in sidebar in Report module page
  Then user click on the referral tab in Referral
  And user click on the export to document button in referral
  
Scenario: Organizational user able to perofrm the Filter functionality in Referral Subsection of Referral Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Referral tab in sidebar in Report module page
  Then user click on the referral tab in Referral
  And user click on the filter button in referral
  When user click on the add provider tab in filter of referral
  Then user enter the provider last name in search provider pop-up window
  And user enter the provider first name in search provider pop-up window
  When user enter the provider phone number in search provider pop-up window
  Then user click on the search button in search provider pop-up window
  And user click on the first provider radio button in search provider pop-up window
  When user click on the submit button in search provider pop-up window
  And user click on the add provider group tab in filter of referral
  Then user enter the provider group name in search provider group pop-up window
  And user click on the search button in search provider group pop-up window
  And user click on the first provider radio button in search provider group pop-up window
  When user click on the submit button in search provider group pop-up window
  Then user select the from date in filter of referral
  And user select the to date in filter of referral
  When user click on the search button in filter of referral
  
Scenario: Organizational user able to perofrm the Filter functionality with Selecting To date as less than From Date in Referral Subsection of Referral Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Referral tab in sidebar in Report module page
  Then user click on the referral tab in Referral
  And user click on the filter button in referral
  When user click on the add provider tab in filter of referral
  Then user enter the provider last name in search provider pop-up window
  And user enter the provider first name in search provider pop-up window
  When user enter the provider phone number in search provider pop-up window
  Then user click on the search button in search provider pop-up window
  And user click on the first provider radio button in search provider pop-up window
  When user click on the submit button in search provider pop-up window
  And user click on the add provider group tab in filter of referral
  Then user enter the provider group name in search provider group pop-up window
  And user click on the search button in search provider group pop-up window
  And user click on the first provider radio button in search provider group pop-up window
  When user click on the submit button in search provider group pop-up window
  Then user select the from date in filter of referral
  And user select the to date as less than from date in filter of referral
  When user click on the search button in filter of referral
  
Scenario: Organizational user able to perofrm the Filter functionality with Selecting Provide Name in Referral Subsection of Referral Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Referral tab in sidebar in Report module page
  Then user click on the referral tab in Referral
  And user click on the filter button in referral
  When user click on the add provider tab in filter of referral
  Then user enter the provider last name in search provider pop-up window
  And user enter the provider first name in search provider pop-up window
  When user enter the provider phone number in search provider pop-up window
  Then user click on the search button in search provider pop-up window
  And user click on the first provider radio button in search provider pop-up window
  Then user click on the submit button in search provider pop-up window
  When user click on the search button in filter of referral
  
Scenario: Organizational user able to perofrm the Filter functionality without entering Provide Name in Referral Subsection of Referral Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Referral tab in sidebar in Report module page
  Then user click on the referral tab in Referral
  And user click on the filter button in referral
  When user click on the add provider tab in filter of referral
  Then user click on the search button in search provider pop-up window
  And user click on the first provider radio button in search provider pop-up window
  Then user click on the submit button in search provider pop-up window
  When user click on the search button in filter of referral
  
Scenario: Organizational user able to perofrm the Filter functionality with Selecting only Provider Group in Referral Subsection of Referral Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Referral tab in sidebar in Report module page
  Then user click on the referral tab in Referral
  And user click on the filter button in referral
  When user click on the add provider group tab in filter of referral
  Then user enter the provider group name in search provider group pop-up window
  And user click on the search button in search provider group pop-up window
  And user click on the first provider radio button in search provider group pop-up window
  When user click on the submit button in search provider group pop-up window
  Then user click on the search button in filter of referral
  
Scenario: Organizational user able to perofrm the Filter functionality without entering Provider Group Name in Referral Subsection of Referral Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Referral tab in sidebar in Report module page
  Then user click on the referral tab in Referral
  And user click on the filter button in referral
  When user click on the add provider group tab in filter of referral
  Then user click on the search button in search provider group pop-up window
  And user click on the first provider radio button in search provider group pop-up window
  When user click on the submit button in search provider group pop-up window
  Then user click on the search button in filter of referral
  
Scenario: Organizational user able to perofrm the Filter functionality with Advance Search in Referral Subsection of Referral Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Referral tab in sidebar in Report module page
  Then user click on the referral tab in Referral
  And user click on the filter button in referral
  When user click on the add provider tab in filter of referral
  Then user enter the provider last name in search provider pop-up window
  And user enter the provider first name in search provider pop-up window
  When user enter the provider phone number in search provider pop-up window
  Then user click on the search button in search provider pop-up window
  And user click on the first provider radio button in search provider pop-up window
  When user click on the submit button in search provider pop-up window
  And user click on the add provider group tab in filter of referral
  Then user enter the provider group name in search provider group pop-up window
  And user click on the search button in search provider group pop-up window
  And user click on the first provider radio button in search provider group pop-up window
  When user click on the submit button in search provider group pop-up window
  Then user select the from date in filter of referral
  And user select the to date in filter of referral
  Then user click on the advance search tab in referral
  When user enter the patient id in advance search
  Then user enter the last name in advance search
  And user enter the first name in advance search
  When user select the referral category by index in advance search
  Then user select the referral status by index in advance search
  And user select the referral type by index in advance search
  When user enter the referral id in advance search
  Then user select the generated from date in advance search
  And user select the generated to date in advance search
  When user select the referred from date in advance search
  Then user select the referred to date in advance search
  And user click on the search button in filter of referral
  
Scenario: Organizational user able to perofrm the Filter functionality with only Advance Search in Referral Subsection of Referral Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Referral tab in sidebar in Report module page
  Then user click on the referral tab in Referral
  And user click on the filter button in referral
  Then user click on the advance search tab in referral
  When user enter the patient id in advance search
  Then user enter the last name in advance search
  And user enter the first name in advance search
  When user select the referral category by index in advance search
  Then user select the referral status by index in advance search
  And user select the referral type by index in advance search
  When user enter the referral id in advance search
  Then user select the generated from date in advance search
  And user select the generated to date in advance search
  When user select the referred from date in advance search
  Then user select the referred to date in advance search
  And user click on the search button in filter of referral
  
Scenario: Organizational user able to perofrm the Filter functionality with Advance Search and entering only Patient Id in Referral Subsection of Referral Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Referral tab in sidebar in Report module page
  Then user click on the referral tab in Referral
  And user click on the filter button in referral
  When user click on the add provider tab in filter of referral
  Then user enter the provider last name in search provider pop-up window
  And user enter the provider first name in search provider pop-up window
  When user enter the provider phone number in search provider pop-up window
  Then user click on the search button in search provider pop-up window
  And user click on the first provider radio button in search provider pop-up window
  When user click on the submit button in search provider pop-up window
  And user click on the add provider group tab in filter of referral
  Then user enter the provider group name in search provider group pop-up window
  And user click on the search button in search provider group pop-up window
  And user click on the first provider radio button in search provider group pop-up window
  When user click on the submit button in search provider group pop-up window
  Then user select the from date in filter of referral
  And user select the to date in filter of referral
  Then user click on the advance search tab in referral
  When user enter the patient id in advance search
  And user click on the search button in filter of referral
  
Scenario: Organizational user able to perofrm the Filter functionality with Advance Search and entering only First Name in Referral Subsection of Referral Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Referral tab in sidebar in Report module page
  Then user click on the referral tab in Referral
  And user click on the filter button in referral
  When user click on the add provider tab in filter of referral
  Then user enter the provider last name in search provider pop-up window
  And user enter the provider first name in search provider pop-up window
  When user enter the provider phone number in search provider pop-up window
  Then user click on the search button in search provider pop-up window
  And user click on the first provider radio button in search provider pop-up window
  When user click on the submit button in search provider pop-up window
  And user click on the add provider group tab in filter of referral
  Then user enter the provider group name in search provider group pop-up window
  And user click on the search button in search provider group pop-up window
  And user click on the first provider radio button in search provider group pop-up window
  When user click on the submit button in search provider group pop-up window
  Then user select the from date in filter of referral
  And user select the to date in filter of referral
  Then user click on the advance search tab in referral
  And user enter the last name in advance search
  When user click on the search button in filter of referral
  
Scenario: Organizational user able to perofrm the Filter functionality with Advance Search and entering only Last Name in Referral Subsection of Referral Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Referral tab in sidebar in Report module page
  Then user click on the referral tab in Referral
  And user click on the filter button in referral
  When user click on the add provider tab in filter of referral
  Then user enter the provider last name in search provider pop-up window
  And user enter the provider first name in search provider pop-up window
  When user enter the provider phone number in search provider pop-up window
  Then user click on the search button in search provider pop-up window
  And user click on the first provider radio button in search provider pop-up window
  When user click on the submit button in search provider pop-up window
  And user click on the add provider group tab in filter of referral
  Then user enter the provider group name in search provider group pop-up window
  And user click on the search button in search provider group pop-up window
  And user click on the first provider radio button in search provider group pop-up window
  When user click on the submit button in search provider group pop-up window
  Then user select the from date in filter of referral
  And user select the to date in filter of referral
  Then user click on the advance search tab in referral
  And user enter the first name in advance search
  When user click on the search button in filter of referral
  
Scenario: Organizational user able to perofrm the Filter functionality with Advance Search and Selecting only Referral Category in Referral Subsection of Referral Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Referral tab in sidebar in Report module page
  Then user click on the referral tab in Referral
  And user click on the filter button in referral
  When user click on the add provider tab in filter of referral
  Then user enter the provider last name in search provider pop-up window
  And user enter the provider first name in search provider pop-up window
  When user enter the provider phone number in search provider pop-up window
  Then user click on the search button in search provider pop-up window
  And user click on the first provider radio button in search provider pop-up window
  When user click on the submit button in search provider pop-up window
  And user click on the add provider group tab in filter of referral
  Then user enter the provider group name in search provider group pop-up window
  And user click on the search button in search provider group pop-up window
  And user click on the first provider radio button in search provider group pop-up window
  When user click on the submit button in search provider group pop-up window
  Then user select the from date in filter of referral
  And user select the to date in filter of referral
  Then user click on the advance search tab in referral
  When user select the referral category by index in advance search
  And user click on the search button in filter of referral
  
Scenario: Organizational user able to perofrm the Filter functionality with Advance Search and Selecting only Referral Status in Referral Subsection of Referral Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Referral tab in sidebar in Report module page
  Then user click on the referral tab in Referral
  And user click on the filter button in referral
  When user click on the add provider tab in filter of referral
  Then user enter the provider last name in search provider pop-up window
  And user enter the provider first name in search provider pop-up window
  When user enter the provider phone number in search provider pop-up window
  Then user click on the search button in search provider pop-up window
  And user click on the first provider radio button in search provider pop-up window
  When user click on the submit button in search provider pop-up window
  And user click on the add provider group tab in filter of referral
  Then user enter the provider group name in search provider group pop-up window
  And user click on the search button in search provider group pop-up window
  And user click on the first provider radio button in search provider group pop-up window
  When user click on the submit button in search provider group pop-up window
  Then user select the from date in filter of referral
  And user select the to date in filter of referral
  Then user click on the advance search tab in referral
  When user select the referral status by index in advance search
  And user click on the search button in filter of referral
  
Scenario: Organizational user able to perofrm the Filter functionality with Advance Search and Selecting only Referral Type in Referral Subsection of Referral Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Referral tab in sidebar in Report module page
  Then user click on the referral tab in Referral
  And user click on the filter button in referral
  When user click on the add provider tab in filter of referral
  Then user enter the provider last name in search provider pop-up window
  And user enter the provider first name in search provider pop-up window
  When user enter the provider phone number in search provider pop-up window
  Then user click on the search button in search provider pop-up window
  And user click on the first provider radio button in search provider pop-up window
  When user click on the submit button in search provider pop-up window
  And user click on the add provider group tab in filter of referral
  Then user enter the provider group name in search provider group pop-up window
  And user click on the search button in search provider group pop-up window
  And user click on the first provider radio button in search provider group pop-up window
  When user click on the submit button in search provider group pop-up window
  Then user select the from date in filter of referral
  And user select the to date in filter of referral
  Then user click on the advance search tab in referral
  When user select the referral type by index in advance search
  And user click on the search button in filter of referral
  
Scenario: Organizational user able to perofrm the Filter functionality with Advance Search and entering only Referral Id in Referral Subsection of Referral Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Referral tab in sidebar in Report module page
  Then user click on the referral tab in Referral
  And user click on the filter button in referral
  When user click on the add provider tab in filter of referral
  Then user enter the provider last name in search provider pop-up window
  And user enter the provider first name in search provider pop-up window
  When user enter the provider phone number in search provider pop-up window
  Then user click on the search button in search provider pop-up window
  And user click on the first provider radio button in search provider pop-up window
  When user click on the submit button in search provider pop-up window
  And user click on the add provider group tab in filter of referral
  Then user enter the provider group name in search provider group pop-up window
  And user click on the search button in search provider group pop-up window
  And user click on the first provider radio button in search provider group pop-up window
  When user click on the submit button in search provider group pop-up window
  Then user select the from date in filter of referral
  And user select the to date in filter of referral
  Then user click on the advance search tab in referral
  When user enter the referral id in advance search
  And user click on the search button in filter of referral
  
Scenario: Organizational user able to perofrm the Filter functionality with Advance Search and Selecting only Generated From Date in Referral Subsection of Referral Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Referral tab in sidebar in Report module page
  Then user click on the referral tab in Referral
  And user click on the filter button in referral
  When user click on the add provider tab in filter of referral
  Then user enter the provider last name in search provider pop-up window
  And user enter the provider first name in search provider pop-up window
  When user enter the provider phone number in search provider pop-up window
  Then user click on the search button in search provider pop-up window
  And user click on the first provider radio button in search provider pop-up window
  When user click on the submit button in search provider pop-up window
  And user click on the add provider group tab in filter of referral
  Then user enter the provider group name in search provider group pop-up window
  And user click on the search button in search provider group pop-up window
  And user click on the first provider radio button in search provider group pop-up window
  When user click on the submit button in search provider group pop-up window
  Then user select the from date in filter of referral
  And user select the to date in filter of referral
  Then user click on the advance search tab in referral
  And user select the generated from date in advance search
  When user click on the search button in filter of referral
  
Scenario: Organizational user able to perofrm the Filter functionality with Advance Search and Selecting only Generated To Date in Referral Subsection of Referral Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Referral tab in sidebar in Report module page
  Then user click on the referral tab in Referral
  And user click on the filter button in referral
  When user click on the add provider tab in filter of referral
  Then user enter the provider last name in search provider pop-up window
  And user enter the provider first name in search provider pop-up window
  When user enter the provider phone number in search provider pop-up window
  Then user click on the search button in search provider pop-up window
  And user click on the first provider radio button in search provider pop-up window
  When user click on the submit button in search provider pop-up window
  And user click on the add provider group tab in filter of referral
  Then user enter the provider group name in search provider group pop-up window
  And user click on the search button in search provider group pop-up window
  And user click on the first provider radio button in search provider group pop-up window
  When user click on the submit button in search provider group pop-up window
  Then user select the from date in filter of referral
  And user select the to date in filter of referral
  Then user click on the advance search tab in referral
  And user select the generated to date in advance search
  When user click on the search button in filter of referral
  
Scenario: Organizational user able to perofrm the Filter functionality with Advance Search with Selecting only Referred From Date in Referral Subsection of Referral Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Referral tab in sidebar in Report module page
  Then user click on the referral tab in Referral
  And user click on the filter button in referral
  When user click on the add provider tab in filter of referral
  Then user enter the provider last name in search provider pop-up window
  And user enter the provider first name in search provider pop-up window
  When user enter the provider phone number in search provider pop-up window
  Then user click on the search button in search provider pop-up window
  And user click on the first provider radio button in search provider pop-up window
  When user click on the submit button in search provider pop-up window
  And user click on the add provider group tab in filter of referral
  Then user enter the provider group name in search provider group pop-up window
  And user click on the search button in search provider group pop-up window
  And user click on the first provider radio button in search provider group pop-up window
  When user click on the submit button in search provider group pop-up window
  Then user select the from date in filter of referral
  And user select the to date in filter of referral
  Then user click on the advance search tab in referral
  When user select the referred from date in advance search
  And user click on the search button in filter of referral
  
Scenario: Organizational user able to perofrm the Filter functionality with Advance Search with Selecting only Referred To Date in Referral Subsection of Referral Section in Report Module  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Report module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Referral tab in sidebar in Report module page
  Then user click on the referral tab in Referral
  And user click on the filter button in referral
  When user click on the add provider tab in filter of referral
  Then user enter the provider last name in search provider pop-up window
  And user enter the provider first name in search provider pop-up window
  When user enter the provider phone number in search provider pop-up window
  Then user click on the search button in search provider pop-up window
  And user click on the first provider radio button in search provider pop-up window
  When user click on the submit button in search provider pop-up window
  And user click on the add provider group tab in filter of referral
  Then user enter the provider group name in search provider group pop-up window
  And user click on the search button in search provider group pop-up window
  And user click on the first provider radio button in search provider group pop-up window
  When user click on the submit button in search provider group pop-up window
  Then user select the from date in filter of referral
  And user select the to date in filter of referral
  Then user click on the advance search tab in referral
  When user select the referred to date in advance search
  And user click on the search button in filter of referral                          