Feature: Entire Clinical Module.

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

Scenario: User with No access for General Audit View test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with No access to Clinical Module General Audit View test   
Then the user should not be able to view General Audit View settings in Clinical Module test

# Component Information
Scenario: User with Update access for Component Information test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Update access only to Clinical Module Component Information test
Then the user should be able to update Component Information in Clinical Module test

Scenario: User with No Update access for Component Information test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with No Update access to Clinical Module Component Information test
Then the user should not be able to update Component Information in Clinical Module test

# Prior Authorization Types
Scenario: User with View + Add access for Prior Authorization Types test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View and Add access only to Clinical Module Prior Authorization Types test
Then the user should be able to view and add Prior Authorization Types in Clinical Module test
And the user should not be able to edit or delete Prior Authorization Type test

Scenario: User with View + Edit access for Prior Authorization Types test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View and Edit access only to Clinical Module Prior Authorization Types test
Then the user should be able to view and edit Prior Authorization Types in Clinical Module test
And the user should not be able to add or delete Prior Authorization Types in Clinical Module test

Scenario: User with View + Delete access for Prior Authorization Types test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View and Delete access only to Clinical Module Prior Authorization Types test
Then the user should be able to view and delete Prior Authorization Types in Clinical Module test
And the user should not be able to add or edit Prior Authorization Types in Clinical Module test

# Goals Of Treatment
Scenario: User with View + Add access for Goals Of Treatment test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View and Add access only to Clinical Module Goals Of Treatment test
Then the user should be able to view and add Goals Of Treatment in Clinical Module test
And the user should not be able to edit or delete Goals Of Treatment in Clinical Module test

Scenario: User with View + Edit access for Goals Of Treatment
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View and Edit access only to Clinical Module Goals Of Treatment test
Then the user should be able to view and edit Goals Of Treatment in Clinical Module test
And the user should not be able to add or delete Goals Of Treatment in Clinical Module test

Scenario: User with View + Delete access for Goals Of Treatment
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View and Delete access only to Clinical Module Goals Of Treatment test
Then the user should be able to view and delete Goals Of Treatment in Clinical Module test
And the user should not be able to add or edit Goals Of Treatment in Clinical Module test

# Barriers
Scenario: User with Add access for Barriers test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Add access only to Clinical Module Barriers test
Then the user should be able to add Barriers in Clinical Module test
And the user should not be able to edit or delete Barriers in Clinical Module test

Scenario: User with Edit access for Barriers test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Edit access only to Clinical Module Barriers test
Then the user should be able to edit Barriers in Clinical Module test
And the user should not be able to add or delete Barriers in Clinical Module test

Scenario: User with Delete access for Barriers test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Delete access only to Clinical Module Barriers test
Then the user should be able to delete Barriers in Clinical Module test
And the user should not be able to add or edit Barriers in Clinical Module test

@Clinical
# Community Resource
Scenario: User with Add access for Community Resource test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Add access only to Clinical Module Community Resource test
Then the user should be able to add Community Resource in Clinical Module test
And the user should not be able to edit or delete Community Resource in Clinical Module test

Scenario: User with Edit access for Community Resource test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Edit access only to Clinical Module Community Resource test
Then the user should be able to edit Community Resource in Clinical Module test
And the user should not be able to add or delete Community Resource in Clinical Module test

Scenario: User with Delete access for Community Resource test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Delete access only to Clinical Module Community Resource test
Then the user should be able to delete Community Resource in Clinical Module test
And the user should not be able to add or edit Community Resource in Clinical Module test


























































































































































































































