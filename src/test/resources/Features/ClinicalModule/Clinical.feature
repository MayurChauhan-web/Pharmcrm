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

# Clinical Intervention
Scenario: User with Add access for Clinical Intervention test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Add access only to Clinical Module Clinical Intervention test
Then the user should be able to add Clinical Intervention in Clinical Module test
And the user should not be able to edit or delete Clinical Intervention in Clinical Module test

Scenario: User with Edit access for Clinical Intervention test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Edit access only to Clinical Module Clinical Intervention test
Then the user should be able to edit Clinical Intervention in Clinical Module test
And the user should not be able to add or delete Clinical Intervention in Clinical Module test

Scenario: User with Delete access for Clinical Intervention test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Delete access only to Clinical Module Clinical Intervention test
Then the user should be able to delete Clinical Intervention in Clinical Module test
And the user should not be able to add or edit Clinical Intervention in Clinical Module test

# ROS
Scenario: User with Add access for ROS test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Add access only to Clinical Module ROS test
Then the user should be able to add ROS in Clinical Module test
And the user should not be able to edit or delete ROS in Clinical Module test

Scenario: User with Edit access for ROS test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Edit access only to Clinical Module ROS test
Then the user should be able to edit ROS in Clinical Module test
And the user should not be able to add or delete ROS in Clinical Module test

Scenario: User with Delete access for ROS test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Delete access only to Clinical Module ROS test
Then the user should be able to delete ROS in Clinical Module test
And the user should not be able to add or edit ROS in Clinical Module test

# Outcome Action
Scenario: User with Add access for Outcome Action test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Add access only to Clinical Module Outcome Action test
Then the user should be able to add Outcome Action in Clinical Module test
And the user should not be able to edit or delete Outcome Action in Clinical Module test

Scenario: User with Edit access for Outcome Action test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Edit access only to Clinical Module Outcome Action test
Then the user should be able to edit Outcome Action in Clinical Module test
And the user should not be able to add or delete Outcome Action in Clinical Module test

Scenario: User with Delete access for Outcome Action test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Delete access only to Clinical Module Outcome Action test
Then the user should be able to delete Outcome Action in Clinical Module test
And the user should not be able to add or edit Outcome Action in Clinical Module test

# Remote Monitoring Parameters (RMP)
Scenario: User with Add access for RMP test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Add access only to Clinical Module RMP test
Then the user should be able to add RMP in Clinical Module test
And the user should not be able to edit or delete RMP in Clinical Module test

Scenario: User with Edit access for RMP test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Edit access only to Clinical Module RMP test
Then the user should be able to edit RMP in Clinical Module test
And the user should not be able to add or delete RMP in Clinical Module test

Scenario: User with Delete access for RMP test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Delete access only to Clinical Module RMP test
Then the user should be able to delete RMP in Clinical Module test
And the user should not be able to add or edit RMP in Clinical Module test

# ROS Group Type
Scenario: User with Add access for ROS Group Type test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Add access only to Clinical Module ROS Group Type test
Then the user should be able to add ROS Group Type in Clinical Module test
And the user should not be able to edit or delete ROS Group Type in Clinical Module test

Scenario: User with Edit access for ROS Group Type test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Edit access only to Clinical Module ROS Group Type test
Then the user should be able to edit ROS Group Type in Clinical Module test
And the user should not be able to add or delete ROS Group Type in Clinical Module test

Scenario: User with Delete access for ROS Group Type test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Delete access only to Clinical Module ROS Group Type test
Then the user should be able to delete ROS Group Type in Clinical Module test
And the user should not be able to add or edit ROS Group Type in Clinical Module test

# Encounter Status
Scenario: User with Add access for Encounter Status test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Add access only to Clinical Module Encounter Status test
Then the user should be able to add Encounter Status in Clinical Module test
And the user should not be able to edit or delete Encounter Status in Clinical Module test

Scenario: User with Edit access for Encounter Status test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Edit access only to Clinical Module Encounter Status test
Then the user should be able to edit Encounter Status in Clinical Module test
And the user should not be able to add or delete Encounter Status in Clinical Module test

Scenario: User with Delete access for Encounter Status test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Delete access only to Clinical Module Encounter Status test
Then the user should be able to delete Encounter Status in Clinical Module test
And the user should not be able to add or edit Encounter Status in Clinical Module test

# Device Master
Scenario: User with View access for Device Master test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View access only to Clinical Module Device Master test
Then the user should be able to view Device Master in Clinical Module test
And the user should not be able to edit Device Master in Clinical Module test

Scenario: User with Edit access for Device Master test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Edit access only to Clinical Module Device Master test
Then the user should be able to view Device Master in Clinical Module test
And the user should be able to edit Device Master in Clinical Module test

# Registered Device
Scenario: User with Add access for Registered Device test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Add access only to Clinical Module Registered Device test
Then the user should be able to add Registered Device in Clinical Module test
And the user should not be able to edit or delete Registered Device in Clinical Module test

Scenario: User with Edit access for Registered Device test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Edit access only to Clinical Module Registered Device test
Then the user should be able to edit Registered Device in Clinical Module test
And the user should not be able to add or delete Registered Device in Clinical Module test

Scenario: User with Delete access for Registered Device test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Delete access only to Clinical Module Registered Device test
Then the user should be able to delete Registered Device in Clinical Module test
And the user should not be able to add or edit Registered Device in Clinical Module test

Scenario: User with Full Access for Registered Device test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test 
And I create a profile with full access to Clinical Module Registered Device test
Then the user should be able to add Registered Device in Clinical Module test
And the user should be able to edit Registered Device in Clinical Module test
And the user should be able to delete Registered Device in Clinical Module test
And the user should be able to download Registered Device template in Clinical Module test
And the user should be able to upload Excel for Registered Device in Clinical Module test
And the user should be able to view Registered Device History in Clinical Module test
And the user should be able to allocate Provider RPM Device in Clinical Module test
And the user should be able to deallocate Provider RPM Device in Clinical Module test
And the user should be able to allocate BusinessGroup RPM Device in Clinical Module test
And the user should be able to deallocate BusinessGroup RPM Device in Clinical Module test
And the user should be able to view Register Device Activity in Clinical Module test

@Clinical
# RPM Status
Scenario: User with Add access for RPM Status test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Add access only to Clinical Module RPM Status test
Then the user should be able to add RPM Status in Clinical Module test
And the user should not be able to edit or delete RPM Status in Clinical Module test

Scenario: User with Edit access for RPM Status test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Edit access only to Clinical Module RPM Status test
Then the user should be able to edit RPM Status in Clinical Module test
And the user should not be able to add or delete RPM Status in Clinical Module test

Scenario: User with Delete access for RPM Status test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Delete access only to Clinical Module RPM Status test
Then the user should be able to delete RPM Status in Clinical Module test
And the user should not be able to add or edit RPM Status in Clinical Module test

























































































































































































































































































































































































































































































































































