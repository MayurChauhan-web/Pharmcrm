@LoginFunctionlaityFeature
Feature: Login to the application

Scenario: User opens the application and logs in successfully 
  Given user launch browser
  When user navigate to the application
  
Scenario: User able to login with user type as Organization in login page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  
Scenario: User able to login with user type as Patient in login page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as Patient from user type dropdown
  Then user enter the Patient emailid
  And user enter the Patient password
  When user click on the go button
 
Scenario: Scenario: Sales User able to login with user type as Organization in login page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the sales user emailid
  And user enter the sales user password
  When user click on the go button   
      