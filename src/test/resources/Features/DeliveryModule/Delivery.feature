
Feature: Entire Delivery Module.

#General
Scenario: User with View only access for General Audit View test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Delivery user should be able to view Profiles
And I create a profile with View access only to Delivery Module General Audit View test
Then the user should be able to view General Audit View settings in Delivery Module test

Scenario: User with No access for General Audit View test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Delivery user should be able to view Profiles
And I create a profile with No access to Delivery Module General Audit View test  
Then the user should not be able to view General Audit View settings in Delivery Module test

# Package Setting
Scenario: User with Update access for Package Settings test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Delivery user should be able to view Profiles
And I create a profile with Update access only to Delivery Module Package Settings test
Then the user should be able to update Package Settings in Delivery Module test

Scenario: User with No access for Package Settings test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Delivery user should be able to view Profiles
And I create a profile with No access to Delivery Module Package Settings test
Then the user should not be able to view or update Package Settings in Delivery Module test

# Package Restriction
Scenario: User with View + Add access for Package Restriction test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Delivery user should be able to view Profiles
And I create a profile with View and Add access to Delivery Module Package Restriction test
Then the user should be able to view and add Package Restriction in Delivery Module test

Scenario: User with View + Delete Package Restriction Plan access test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Delivery user should be able to view Profiles
And I create a profile with View and Delete Package Restriction Plan access to Delivery Module Package Restriction test
Then the user should be able to view and delete Package Restriction Plan in Delivery Module test

Scenario: User with View + Delete Package Restriction State access test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Delivery user should be able to view Profiles
And I create a profile with View and Delete Package Restriction State access to Delivery Module Package Restriction test
Then the user should be able to view and delete Package Restriction State in Delivery Module test

# Delivery Distances
Scenario: User with View + Add access for Delivery Distances test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Delivery user should be able to view Profiles
And I create a profile with View and Add access only to Delivery Module Delivery Distances test
Then the user should be able to view and add Delivery Distances in Delivery Module test
And the user should not be able to edit or delete Delivery Distances in Delivery Module test

Scenario: User with View + Edit access for Delivery Distances test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Delivery user should be able to view Profiles
And I create a profile with View and Edit access only to Delivery Module Delivery Distances test
Then the user should be able to view and edit Delivery Distances in Delivery Module test
And the user should not be able to add or delete Delivery Distances in Delivery Module test

Scenario: User with View + Delete access for Delivery Distances test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Delivery user should be able to view Profiles
And I create a profile with View and Delete access only to Delivery Module Delivery Distances test
Then the user should be able to view and delete Delivery Distances in Delivery Module test
And the user should not be able to add or edit Delivery Distances in Delivery Module test

# Logistic Company
Scenario: User with View + Add access for Logistic Company test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Delivery user should be able to view Profiles
And I create a profile with View and Add access only to Delivery Module Logistic Company test
Then the user should be able to view and add Logistic Company in Delivery Module test
And the user should not be able to edit or delete Logistic Company in Delivery Module test 

Scenario: User with View + Edit access for Logistic Company test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Delivery user should be able to view Profiles
And I create a profile with View and Edit access only to Delivery Module Logistic Company test
Then the user should be able to view and edit Logistic Company in Delivery Module test
And the user should not be able to add or delete Logistic Company in Delivery Module test

Scenario: User with View + Delete access for Logistic Company test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Delivery user should be able to view Profiles
And I create a profile with View and Delete access only to Delivery Module Logistic Company test
Then the user should be able to view and delete Logistic Company in Delivery Module test
And the user should not be able to add or edit Logistic Company in Delivery Module test








































































































































































































































