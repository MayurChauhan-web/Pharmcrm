Feature: Entire Clinical workflow Module.

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











