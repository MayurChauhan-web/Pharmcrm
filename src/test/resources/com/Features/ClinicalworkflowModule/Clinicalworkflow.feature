Feature: Entire Clinical workflow Module.

@Clinicalworkflow
# General
Scenario: User with View only access for Clinical workflow Module General Audit View
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinicalworkflow user should be able to view Profiles
And I create a profile with View access only to Clinicalworkflow Module General Audit View test
Then the user should be able to view Clinicalworkflow Module General Audit View test

Scenario: User with No access for General Audit View test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinicalworkflow user should be able to view Profiles
And I create a profile with no access to Clinicalworkflow Module General Audit View test
Then the user should not able to view Clinicalworkflow Module General Audit View test

# Dashboard
Scenario: Full Dashboard Access with All Permissions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinicalworkflow user should be able to view Profiles
And I create a profile Full Dashboard Access with All Permissions
Then the user should be able to view Dashboard
Then the user should be able to Mail
Then the user should be able to Text
Then the user should be able to BOT Call
Then the user should be able to Export To Excel
Then the user should be able to All Communication View
Then the user should be able to Update Appointment Action

Scenario: Dashboard Access with View Permission Only
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinicalworkflow user should be able to view Profiles
And I create a profile View Only Access
Then the user should be able to view Dashboard
Then the user should not be able to send Mail
Then the user should not be able to send Text
Then the user should not be able to initiate BOT Call
Then the user should not be able to Export To Excel
Then the user should not be able to All Communication View
Then the user should not be able to Update Appointment Action

# Action Work Flow
Scenario: Full Action Work Flow Access with All Permissions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinicalworkflow user should be able to view Profiles
And I create a profile Full Action Work Flow Access with All Permissions
Then the user should be able to view Action Work Flow
Then the user should be able to Action Work Flow Mail
Then the user should be able to Fax
Then the user should be able to Action Work Flow Text
Then the user should be able to Action Work Flow BOT Call
Then the user should be able to Quick Text
Then the user should be able to Show All Runninglines Checkbox
Then the user should be able to Show Past Runninglines Checkbox
Then the user should be able to Grid Template Add
Then the user should be able to Grid Template Edit
Then the user should be able to Grid Template Delete
Then the user should be able to Grid Template - Company Default Checkbox
Then the user should be able to Send VCard
Then the user should be able to Action Work Flow Export To Excel











































































































































































































