@CoreModuleFeature

Feature: Core Module Functionality 
 
Scenario: User able to login with user type as Organization in login page  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  
Scenario: User able to click on the Profile Icon tab in Dashboard 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  
Scenario: User able to click on the Change Password tab in Profile Section 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the change password tab in profile
  
  
  #----------------------------------- Change Password Section -------------------------------------
  
  
Scenario: User able to perform the Change Password Functionality with valid credentials 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the change password tab in profile
  When user enter the current password
  Then user enter the new password
  And user enter the confirm new password
  When user click on the submit button in change password
  
Scenario: User able to perform the Change Password Functionality with entering same current password in new password field 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the change password tab in profile
  When user enter the current password
  Then user enter the same current password in new password field
  And user enter the confirm new password
  When user click on the submit button in change password
  
Scenario: User able to perform the Change Password Functionality with entering same current password in confirm new password field 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the change password tab in profile
  When user enter the current password
  Then user enter the new password
  And user enter the same current password in confirm new password field
  When user click on the submit button in change password
  
Scenario: User able to perform the Change Password Functionality with entering same current password in both password field 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the change password tab in profile
  When user enter the current password
  Then user enter the same current password in new password field
  And user enter the same current password in confirm new password field
  When user click on the submit button in change password
  
Scenario: User able to perform the Change Password Functionality without entering current password 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the change password tab in profile
  Then user enter the new password
  And user enter the confirm new password
  When user click on the submit button in change password
  
Scenario: User able to perform the Change Password Functionality without entering current password and entering invalid new password 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the change password tab in profile
  Then user enter the invalid new password
  And user enter the confirm new password
  When user click on the submit button in change password
  
Scenario: User able to perform the Change Password Functionality without entering current password and entering new password length as 4 character 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the change password tab in profile
  Then user enter the 4 character length in new password
  And user enter the confirm new password
  When user click on the submit button in change password
  
Scenario: User able to perform the Change Password Functionality without entering current password and entering invalid confirm new password 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the change password tab in profile
  Then user enter the new password
  And user enter the invalid confirm new password
  When user click on the submit button in change password
  
Scenario: User able to perform the Change Password Functionality without entering current password and entering confirm new password length as 4 character 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the change password tab in profile
  Then user enter the new password
  And user enter the 4 character length in confirm new password
  When user click on the submit button in change password
  
Scenario: User able to perform the Change Password Functionality without entering current password and entering invalid new and confirm new password 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the change password tab in profile
  Then user enter the invalid new password
  And user enter the invalid confirm new password
  When user click on the submit button in change password
  
Scenario: User able to perform the Change Password Functionality without entering new password 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the change password tab in profile
  When user enter the invalid current password
  And user enter the confirm new password
  When user click on the submit button in change password
  
Scenario: User able to perform the Change Password Functionality without entering confirm new password 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the change password tab in profile
  When user enter the invalid current password
  And user enter the new password
  When user click on the submit button in change password
  
Scenario: User able to perform the Change Password Functionality without entering any password fields 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the change password tab in profile
  When user click on the submit button in change password
  
Scenario: User able to perform the Change Password Functionality with entering infinite length passwords 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the change password tab in profile
  When user enter the infinite length current password
  Then user enter the infinite length new password
  And user enter the infinite length confirm new password
  When user click on the submit button in change password
  
  
  #----------------------------------- Manage Profile Section -------------------------------------
  
  
Scenario: User able to click on the Manage Profile tab in Profile Section 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the manage profile tab in profile
  
Scenario: User able to perform the Manage Profile functionality in Profile Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the manage profile tab in profile
  When user change the last name in profile details
  Then user change the first name in profile details
  And user change the street in address details
  When user change the city in address details
  Then user change the state in address details
  And user change the zipcode in address details
  When user change the country in address details
  Then user click on the clear signature button in my profile
  And user draw the sign in signature
  When user click on the update button in my profile
  
Scenario: User able to perform the Manage Profile functionality with Changing Last Name in Profile Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the manage profile tab in profile
  When user change the last name in profile details
  Then user click on the update button in my profile
  
Scenario: User able to perform the Manage Profile functionality with Changing First Name in Profile Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the manage profile tab in profile
  When user change the first name in profile details
  Then user click on the update button in my profile
  
Scenario: User able to perform the Manage Profile functionality with Changing Street Address in Profile Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the manage profile tab in profile
  When user change the street in address details
  Then user click on the update button in my profile
  
Scenario: User able to perform the Manage Profile functionality with Changing City Address in Profile Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the manage profile tab in profile
  When user change the city in address details
  Then user click on the update button in my profile
  
Scenario: User able to perform the Manage Profile functionality with Changing State Address in Profile Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the manage profile tab in profile
  When user change the state in address details
  Then user click on the update button in my profile
  
Scenario: User able to perform the Manage Profile functionality with Changing ZipCode Address in Profile Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the manage profile tab in profile
  When user change the zipcode in address details
  Then user click on the update button in my profile
  
Scenario: User able to perform the Manage Profile functionality with Changing Country Address in Profile Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the manage profile tab in profile
  When user change the country in address details
  Then user click on the update button in my profile
  
Scenario: User able to perform the Manage Profile functionality with Changing Signature in Profile Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the manage profile tab in profile
  When user click on the clear signature button in my profile
  Then user draw the sign in signature
  And user click on the update button in my profile
  
Scenario: User able to remove the all Manage Profile Details 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the manage profile tab in profile
  When user remove the last name in profile details
  Then user remove the first name in profile details
  And user remove the street in address details
  When user remove the city in address details
  Then user remove the state in address details
  And user remove the zipcode in address details
  When user remove the country in address details
  Then user click on the clear signature button in my profile
  When user click on the update button in my profile
  
  
  #----------------------------------- Calender Settings Section -------------------------------------
  
  
Scenario: User able to click on the Calendar Settings tab in Profile Section 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the calendar settings tab in profile
  
Scenario: User able to Perform the Reset to company setting in My Calendar Settings page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the calendar settings tab in profile
  When user click on the reset to company setting tab in my calendar setting page
 
Scenario: User able to Perform the calendar setting in My Calendar Settings page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid for core module
  And user enter the organization password for core module
  When user click on the go button
  Then user click on the profile icon tab in dashboard
  And user click on the calendar settings tab in profile
  When user change the time zone in my calendar setting page
  Then user click on the submit button in my calendar setting page                          