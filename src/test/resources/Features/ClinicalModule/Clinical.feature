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

# CPT Code
Scenario: User with Add access for CPT Code test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Add access only to Clinical Module CPT Code test
Then the user should be able to add CPT Code in Clinical Module test
And the user should not be able to edit or delete CPT Code in Clinical Module test

Scenario: User with Edit access for CPT Code test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Edit access only to Clinical Module CPT Code test
Then the user should be able to edit CPT Code in Clinical Module test
And the user should not be able to add or delete CPT Code in Clinical Module test

Scenario: User with Delete access for CPT Code test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Delete access only to Clinical Module CPT Code test
Then the user should be able to delete CPT Code in Clinical Module test
And the user should not be able to add or edit CPT Code in Clinical Module test

# Patients
Scenario: User with Add access for Patients test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Add access only to Patients Module test
Then the user should be able to add Patients in Patients Module test
And the user should not be able to edit or delete Patients in Patients Module test

Scenario: User with Edit access for Patients test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Edit access only to Patients Module test
Then the user should be able to edit Patients in Patients Module test
And the user should not be able to add or delete Patients in Patients Module test

Scenario: User with Delete access for Patients test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Delete access only to Patients Module test
Then the user should be able to delete Patients in Patients Module test
And the user should not be able to add or edit Patients in Patients Module test

Scenario: User with full permissions in Clinical Module test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with All Access to Clinical Module test
And the user should be able to View Link and Sync Link in Clinical Module test

# SOAP Components
Scenario: User with Add access for SOAP Components test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Add access only to SOAP Components test
Then the user should be able to add SOAP Components in Clinical Module test
And the user should not be able to edit or delete SOAP Components in Clinical Module test

Scenario: User with Edit access for SOAP Components test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Edit access only to SOAP Components test
Then the user should be able to edit SOAP Components in Clinical Module test
And the user should not be able to add or delete SOAP Components in Clinical Module test

Scenario: User with Delete access for SOAP Components test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Delete access only to SOAP Components test
Then the user should be able to delete SOAP Components in Clinical Module test
And the user should not be able to add or edit SOAP Components in Clinical Module test

# Patients / Clinical Encounter
Scenario: User with Add access for Patients / Clinical Encounter test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Add access only to Patients Clinical Encounter test
Then the user should be able to add Patients Clinical Encounter in Clinical Module test
And the user should not be able to edit or delete Patients Clinical Encounter in Clinical Module test

Scenario: User with Edit access for Patients / Clinical Encounter test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Edit access only to Patients Clinical Encounter test
Then the user should be able to edit Patients Clinical Encounter in Clinical Module test
And the user should not be able to add or delete Patients Clinical Encounter in Clinical Module test

Scenario: User with Delete access for Patients / Clinical Encounter test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Delete access only to Patients Clinical Encounter test
Then the user should be able to delete Patients Clinical Encounter in Clinical Module test
And the user should not be able to add or edit Patients Clinical Encounter in Clinical Module test

# Patients / Clinical Encounter Review
Scenario: User with View and View Star1 Drug access for Patients / Clinical Encounter Review test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View and View Star1 Drug access to Patients Clinical Encounter Review test
Then the user should be able to view Patients Clinical Encounter Review in Clinical Module test
And the user should be able to view Star1 Drug in Patients Clinical Encounter Review in Clinical Module test

Scenario: User with No Access for Patients / Clinical Encounter Review test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with No Access to Patients Clinical Encounter Review test
Then the user should not be able to access Patients Clinical Encounter Review in Clinical Module test

# Reports / Status Log
Scenario: User with View and Download File access for Reports / Status Log test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View and Download File access to Reports Status Log test
Then the user should be able to view Reports Status Log in Reports Module test
And the user should be able to download files from Reports Status Log in Reports Module test

Scenario: User with View but no Download File access for Reports / Status Log test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View but no Download File access to Reports Status Log test
Then the user should be able to view Reports Status Log in Reports Module test
But the user should not be able to download files from Reports Status Log in Reports Module test

# Reports / Medication Recommendation and Suggestions
Scenario: User with View and Download File access for Reports / Medication Recommendation And Suggestions test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View and Download File access to Reports Medication Recommendation And Suggestions test
Then the user should be able to view Reports Medication Recommendation And Suggestions in Reports Module test
And the user should be able to download files from Reports Medication Recommendation And Suggestions in Reports Module test

Scenario: User with View but no Download File access for Reports / Medication Recommendation And Suggestions test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View but no Download File access to Reports Medication Recommendation And Suggestions test
Then the user should be able to view Reports Medication Recommendation And Suggestions in Reports Module test
But the user should not be able to download files from Reports Medication Recommendation And Suggestions in Reports Module test

# Reports / CCM Encounter Log
Scenario: User with View and Download File access for Reports / CCM Encounter Log test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View and Download File access to Reports CCM Encounter Log test
Then the user should be able to view Reports CCM Encounter Log in Reports Module test
And the user should be able to download files from Reports CCM Encounter Log in Reports Module test

Scenario: User with View but no Download File access for Reports / CCM Encounter Log test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View but no Download File access to Reports CCM Encounter Log test
Then the user should be able to view Reports CCM Encounter Log in Reports Module test
But the user should not be able to download files from Reports CCM Encounter Log in Reports Module test

# Reports / Call Log
Scenario: User with View and Download File access for Reports / Call Log test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View and Download File access to Reports Call Log test
Then the user should be able to view Reports Call Log in Reports Module test
And the user should be able to download files from Reports Call Log in Reports Module test

Scenario: User with View but no Download File access for Reports / Call Log test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View but no Download File access to Reports Call Log test
Then the user should be able to view Reports Call Log in Reports Module test
But the user should not be able to download files from Reports Call Log in Reports Module test

# Patient / Provider Referral
Scenario: User with View and Referred To New Provider access for Patient / Provider Referral test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View and Referred To New Provider access to Patient Provider Referral test
Then the user should be able to view Patient Provider Referral in Clinical Module test
And the user should be able to refer to a new provider in Patient Provider Referral in Clinical Module test

Scenario: User with View but no Referred To New Provider access for Patient / Provider Referral
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View but no Referred To New Provider access to Patient Provider Referral test
Then the user should be able to view Patient Provider Referral in Clinical Module test
But the user should not be able to refer to a new provider in Patient Provider Referral in Clinical Module test

# CareGiver Name
Scenario: User with Add access for CareGiver Name test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Add access only to CareGiver Name in Clinical Module test
Then the user should be able to add CareGiver Name in Clinical Module test
And the user should not be able to edit or delete CareGiver Name in Clinical Module test

Scenario: User with Edit access for CareGiver Name test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Edit access only to CareGiver Name in Clinical Module test
Then the user should be able to edit CareGiver Name in Clinical Module test
And the user should not be able to add or delete CareGiver Name in Clinical Module test

Scenario: User with Delete access for CareGiver Name test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Delete access only to CareGiver Name in Clinical Module test
Then the user should be able to delete CareGiver Name in Clinical Module test
And the user should not be able to add or edit CareGiver Name in Clinical Module test

# Prior Authorization
Scenario: User with Add access for Prior Authorization test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Add access only to Prior Authorization in Clinical Module test
Then the user should be able to add Prior Authorization in Clinical Module test
And the user should not be able to edit or delete Prior Authorization in Clinical Module test

Scenario: User with Edit access for Prior Authorization test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Edit access only to Prior Authorization in Clinical Module test
Then the user should be able to edit Prior Authorization in Clinical Module test
And the user should not be able to add or delete Prior Authorization in Clinical Module test

Scenario: User with Delete access for Prior Authorization test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Delete access only to Prior Authorization in Clinical Module test
Then the user should be able to delete Prior Authorization in Clinical Module test
And the user should not be able to add or edit Prior Authorization in Clinical Module test

Scenario: User with Full access for Prior Authorization test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with full Acess to Prior Authorization in Clinical Module test
Then the user should be able to Export Excel in Clinical Module test
Then the user should be able to access Details in Clinical Module test
Then the user should be able to Archive in Clinical Module test
Then the user should be able to Unarchive in Clinical Module test
Then the user should be able to view Grid View in Clinical Module test

# Med Recons
Scenario: User with Add access for Med Recons test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Add access only to Med Recons in Clinical Module test
Then the user should be able to add Med Recons in Clinical Module test
And the user should not be able to edit or delete Med Recons in Clinical Module test

Scenario: User with Delete access for Med Recons test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Delete access only to Med Recons in Clinical Module test
Then the user should be able to delete Med Recons in Clinical Module test
And the user should not be able to add or edit Med Recons in Clinical Module test

Scenario: User can access Download File test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with access only to Download File in Clinical Module test
Then the user should be able to access Details in Clinical Module test
Then the user should be able to access Download File in Clinical Module test

# Med Recons / Meds On Chart
Scenario: User with Add access for Med Recons / Meds On Chart test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Add access only to Med Recons Meds On Chart in Clinical Module test
Then the user should be able to add Med Recons Meds On Chart in Clinical Module test
And the user should not be able to edit or delete Med Recons Meds On Chart in Clinical Module test

Scenario: User with Edit access for Med Recons / Meds On Chart test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Edit access only to Med Recons Meds On Chart in Clinical Module test
Then the user should be able to edit Med Recons Meds On Chart in Clinical Module test
And the user should not be able to add or delete Med Recons Meds On Chart in Clinical Module test

Scenario: User with Delete access for Med Recons / Meds On Chart test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Delete access only to Med Recons Meds On Chart in Clinical Module test
Then the user should be able to delete Med Recons Meds On Chart in Clinical Module test
And the user should not be able to add or edit Med Recons Meds On Chart in Clinical Module test

# Med Recons / Current Medication
Scenario: User with Add access for Med Recons / Current Medication test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Add access only to Med Recons Current Medication in Clinical Module test
Then the user should be able to add Med Recons Current Medication in Clinical Module test
And the user should not be able to edit or delete Med Recons Current Medication in Clinical Module test

Scenario: User with Edit access for Med Recons / Current Medication test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Edit access only to Med Recons Current Medication in Clinical Module test
Then the user should be able to edit Med Recons Current Medication in Clinical Module test
And the user should not be able to add or delete Med Recons Current Medication in Clinical Module test

Scenario: User with Delete access for Med Recons / Current Medication test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Delete access only to Med Recons Current Medication in Clinical Module test
Then the user should be able to delete Med Recons Current Medication in Clinical Module test
And the user should not be able to add or edit Med Recons Current Medication in Clinical Module test

# Reports / MTM Encounter Log
Scenario: User with View, Export Excel, and Details access for Reports / MTM Encounter Log test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View, Export Excel, and Details access to Reports MTM Encounter Log in Clinical Module test
Then the user should be able to view Reports MTM Encounter Log in Clinical Module test
And the user should be able to export Reports MTM Encounter Log to Excel in Clinical Module test
And the user should be able to view Details for Reports MTM Encounter Log in Clinical Module test

Scenario: User with View access only for Reports / MTM Encounter Log test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View access only to Reports MTM Encounter Log in Clinical Module test
Then the user should be able to view Reports MTM Encounter Log in Clinical Module test
And the user should not have access to Export Excel or Details for Reports MTM Encounter Log in Clinical Module test

@Clinical
# Remote Patient Monitoring (RPM)
Scenario: User with Add access for Remote Patient Monitoring RPM test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Add access only to Remote Patient Monitoring RPM in Clinical Module test
Then the user should be able to add Remote Patient Monitoring RPM in Clinical Module test
And the user should not be able to edit or delete Remote Patient Monitoring RPM in Clinical Module test

Scenario: User with Edit access for Remote Patient Monitoring RPM test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Edit access only to Remote Patient Monitoring RPM in Clinical Module test
Then the user should be able to edit Remote Patient Monitoring RPM in Clinical Module test
And the user should not be able to add or delete Remote Patient Monitoring RPM in Clinical Module test

Scenario: User with Delete access for Remote Patient Monitoring (RPM) test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Delete access only to Remote Patient Monitoring RPM in Clinical Module test
Then the user should be able to delete Remote Patient Monitoring RPM in Clinical Module test
And the user should not be able to add or edit Remote Patient Monitoring RPM in Clinical Module test

Scenario: User with Export Excel and Outgoing Call access test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with Export Excel and Outgoing Call access in Clinical Module test
Then the user should be able to export data to Excel in Clinical Module test
And the user should be able to make Outgoing Calls in Clinical Module test

























































































































































































































 




































































































































































































































































































































































































































































































































































































































































































































































































































































































