Feature: Entire Partner Module.

# Audit View 
Scenario: Clinical User with View only access for General Audit View test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View access only to Clinical Module General Audit View test
Then the user should be able to view General Audit View settings in Clinical Module test















