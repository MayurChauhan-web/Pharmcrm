@Clinical
Feature: Clinical Module scenarios

Scenario: User with View only access for General (Audit View)
Given I log in as admin for Clinical Module 
When I create a new user with email for Clinical Module "testuser3_static@mailinator.com"  
And I create a profile with View access only to Clinical Module General Audit View 
And I assign the profile and workspace to the user for Clinical Module  
And I reset the user's password for Clinical Module 
And I log in using the new user for Clinical Module 
Then the user should be able to view General Audit View settings in Clinical Module

Scenario: User with No access for General (Audit View)
Given I log in as admin for Clinical Module 
When I create a new user with email for Clinical Module "testuser4_static@mailinator.com"  
And I create a profile with No access to Clinical Module General Audit View     
And I assign the profile and workspace to the user for Clinical Module  
And I reset the user's password for Clinical Module 
And I log in using the new user for Clinical Module 
Then the user should not be able to view General Audit View settings in Clinical Module


Scenario: User with Update access for Component Information
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser5_static@mailinator.com"
And I create a profile with Update access only to Clinical Module Component Information
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to update Component Information in Clinical Module

Scenario: User with No Update access for Component Information
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser7_static@mailinator.com"
And I create a profile with No Update access to Clinical Module Component Information
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should not be able to update Component Information in Clinical Module

Scenario: User with View + Add access for Prior Authorization Types
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser8_static@mailinator.com"
And I create a profile with View and Add access only to Clinical Module Prior Authorization Types
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view and add Prior Authorization Types in Clinical Module
And the user should not be able to edit or delete Prior Authorization Types in Clinical Module

Scenario: User with View + Edit access for Prior Authorization Types
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser9_static@mailinator.com"
And I create a profile with View and Edit access only to Clinical Module Prior Authorization Types
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view and edit Prior Authorization Types in Clinical Module
And the user should not be able to add or delete Prior Authorization Types in Clinical Module

Scenario: User with View + Delete access for Prior Authorization Types
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser10_static@mailinator.com"
And I create a profile with View and Delete access only to Clinical Module Prior Authorization Types
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view and delete Prior Authorization Types in Clinical Module
And the user should not be able to add or edit Prior Authorization Types in Clinical Module

Scenario: User with View + Add access for Goals Of Treatment
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser11_static@mailinator.com"
And I create a profile with View and Add access only to Clinical Module Goals Of Treatment
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view and add Goals Of Treatment in Clinical Module
And the user should not be able to edit or delete Goals Of Treatment in Clinical Module

Scenario: User with View + Edit access for Goals Of Treatment
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser12_static@mailinator.com"
And I create a profile with View and Edit access only to Clinical Module Goals Of Treatment
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view and edit Goals Of Treatment in Clinical Module
And the user should not be able to add or delete Goals Of Treatment in Clinical Module

Scenario: User with View + Delete access for Goals Of Treatment
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser13_static@mailinator.com"
And I create a profile with View and Delete access only to Clinical Module Goals Of Treatment
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view and delete Goals Of Treatment in Clinical Module
And the user should not be able to add or edit Goals Of Treatment in Clinical Module

Scenario: User with Add access for Barriers
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser1_static@mailinator.com"
And I create a profile with Add access only to Clinical Module Barriers
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add Barriers in Clinical Module
And the user should not be able to edit or delete Barriers in Clinical Module

Scenario: User with Edit access for Barriers
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser2_static@mailinator.com"
And I create a profile with Edit access only to Clinical Module Barriers
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit Barriers in Clinical Module
And the user should not be able to add or delete Barriers in Clinical Module

Scenario: User with Delete access for Barriers
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser3_static@mailinator.com"
And I create a profile with Delete access only to Clinical Module Barriers
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete Barriers in Clinical Module
And the user should not be able to add or edit Barriers in Clinical Module

Scenario: User with Add access for Community Resource
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser4_static@mailinator.com"
And I create a profile with Add access only to Clinical Module Community Resource
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add Community Resource in Clinical Module
And the user should not be able to edit or delete Community Resource in Clinical Module

Scenario: User with Edit access for Community Resource
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser5_static@mailinator.com"
And I create a profile with Edit access only to Clinical Module Community Resource
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit Community Resource in Clinical Module
And the user should not be able to add or delete Community Resource in Clinical Module

Scenario: User with Delete access for Community Resource
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser6_static@mailinator.com"
And I create a profile with Delete access only to Clinical Module Community Resource
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete Community Resource in Clinical Module
And the user should not be able to add or edit Community Resource in Clinical Module

#
Scenario: User with Add access for Clinical Intervention
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser7_static@mailinator.com"
And I create a profile with Add access only to Clinical Module Clinical Intervention
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add Clinical Intervention in Clinical Module
And the user should not be able to edit or delete Clinical Intervention in Clinical Module

Scenario: User with Edit access for Clinical Intervention
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser8_static@mailinator.com"
And I create a profile with Edit access only to Clinical Module Clinical Intervention
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit Clinical Intervention in Clinical Module
And the user should not be able to add or delete Clinical Intervention in Clinical Module

Scenario: User with Delete access for Clinical Intervention
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser9_static@mailinator.com"
And I create a profile with Delete access only to Clinical Module Clinical Intervention
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete Clinical Intervention in Clinical Module
And the user should not be able to add or edit Clinical Intervention in Clinical Module

Scenario: User with Add access for ROS
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser1_static@mailinator.com"
And I create a profile with Add access only to Clinical Module ROS
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add ROS in Clinical Module
And the user should not be able to edit or delete ROS in Clinical Module

Scenario: User with Edit access for ROS
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser2_static@mailinator.com"
And I create a profile with Edit access only to Clinical Module ROS
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit ROS in Clinical Module
And the user should not be able to add or delete ROS in Clinical Module

Scenario: User with Delete access for ROS
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser3_static@mailinator.com"
And I create a profile with Delete access only to Clinical Module ROS
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete ROS in Clinical Module
And the user should not be able to add or edit ROS in Clinical Module

Scenario: User with Add access for Outcome Action
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser4_outcome@mailinator.com"
And I create a profile with Add access only to Clinical Module Outcome Action
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add Outcome Action in Clinical Module
And the user should not be able to edit or delete Outcome Action in Clinical Module

Scenario: User with Edit access for Outcome Action
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser5_outcome@mailinator.com"
And I create a profile with Edit access only to Clinical Module Outcome Action
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit Outcome Action in Clinical Module
And the user should not be able to add or delete Outcome Action in Clinical Module

Scenario: User with Delete access for Outcome Action
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser6_outcome@mailinator.com"
And I create a profile with Delete access only to Clinical Module Outcome Action
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete Outcome Action in Clinical Module
And the user should not be able to add or edit Outcome Action in Clinical Module

Scenario: User with Add access for RMP
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser7_rmp@mailinator.com"
And I create a profile with Add access only to Clinical Module RMP
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add RMP in Clinical Module
And the user should not be able to edit or delete RMP in Clinical Module

Scenario: User with Edit access for RMP
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser8_rmp@mailinator.com"
And I create a profile with Edit access only to Clinical Module RMP
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit RMP in Clinical Module
And the user should not be able to add or delete RMP in Clinical Module

Scenario: User with Delete access for RMP
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser9_rmp@mailinator.com"
And I create a profile with Delete access only to Clinical Module RMP
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete RMP in Clinical Module
And the user should not be able to add or edit RMP in Clinical Module

Scenario: User with Add access for ROS Group Type
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser10_rosgroup@mailinator.com"
And I create a profile with Add access only to Clinical Module ROS Group Type
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add ROS Group Type in Clinical Module
And the user should not be able to edit or delete ROS Group Type in Clinical Module

Scenario: User with Edit access for ROS Group Type
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser11_rosgroup@mailinator.com"
And I create a profile with Edit access only to Clinical Module ROS Group Type
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit ROS Group Type in Clinical Module
And the user should not be able to add or delete ROS Group Type in Clinical Module

Scenario: User with Delete access for ROS Group Type
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser12_rosgroup@mailinator.com"
And I create a profile with Delete access only to Clinical Module ROS Group Type
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete ROS Group Type in Clinical Module
And the user should not be able to add or edit ROS Group Type in Clinical Module

Scenario: User with Add access for Encounter Status
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser13_encounter@mailinator.com"
And I create a profile with Add access only to Clinical Module Encounter Status
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add Encounter Status in Clinical Module
And the user should not be able to edit or delete Encounter Status in Clinical Module

Scenario: User with Edit access for Encounter Status
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser14_encounter@mailinator.com"
And I create a profile with Edit access only to Clinical Module Encounter Status
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit Encounter Status in Clinical Module
And the user should not be able to add or delete Encounter Status in Clinical Module

Scenario: User with Delete access for Encounter Status
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser15_encounter@mailinator.com"
And I create a profile with Delete access only to Clinical Module Encounter Status
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete Encounter Status in Clinical Module
And the user should not be able to add or edit Encounter Status in Clinical Module


Scenario: User with View access for Device Master
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser16_device@mailinator.com"
And I create a profile with View access only to Clinical Module Device Master
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view Device Master in Clinical Module
And the user should not be able to edit Device Master in Clinical Module

Scenario: User with Edit access for Device Master
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser1_device@mailinator.com"
And I create a profile with Edit access only to Clinical Module Device Master
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view Device Master in Clinical Module
And the user should be able to edit Device Master in Clinical Module

Scenario: User with Add access for Registered Device
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser4_static@mailinator.com"
And I create a profile with Add access only to Clinical Module Registered Device
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add Registered Device in Clinical Module
And the user should not be able to edit or delete Registered Device in Clinical Module

Scenario: User with Edit access for Registered Device
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser5_static@mailinator.com"
And I create a profile with Edit access only to Clinical Module Registered Device
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit Registered Device in Clinical Module
And the user should not be able to add or delete Registered Device in Clinical Module

Scenario: User with Delete access for Registered Device
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser6_static@mailinator.com"
And I create a profile with Delete access only to Clinical Module Registered Device
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete Registered Device in Clinical Module
And the user should not be able to add or edit Registered Device in Clinical Module


Scenario: User with Full Access for Registered Device
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser4_static@mailinator.com"
And I create a profile with full access to Clinical Module Registered Device
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add Registered Device in Clinical Module
And the user should be able to edit Registered Device in Clinical Module
And the user should be able to delete Registered Device in Clinical Module
And the user should be able to download Registered Device template in Clinical Module
And the user should be able to upload Excel for Registered Device in Clinical Module
And the user should be able to view Registered Device History in Clinical Module
And the user should be able to allocate Provider RPM Device in Clinical Module
And the user should be able to deallocate Provider RPM Device in Clinical Module
And the user should be able to allocate BusinessGroup RPM Device in Clinical Module
And the user should be able to deallocate BusinessGroup RPM Device in Clinical Module
And the user should be able to view Register Device Activity in Clinical Module

Scenario: User with Add access for RPM Status
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser10_static@mailinator.com"
And I create a profile with Add access only to Clinical Module RPM Status
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add RPM Status in Clinical Module
And the user should not be able to edit or delete RPM Status in Clinical Module

Scenario: User with Edit access for RPM Status
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser1_static@mailinator.com"
And I create a profile with Edit access only to Clinical Module RPM Status
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit RPM Status in Clinical Module
And the user should not be able to add or delete RPM Status in Clinical Module

Scenario: User with Delete access for RPM Status
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser2_static@mailinator.com"
And I create a profile with Delete access only to Clinical Module RPM Status
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete RPM Status in Clinical Module
And the user should not be able to add or edit RPM Status in Clinical Module

Scenario: User with Add access for CPT Code
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser3_static@mailinator.com"
And I create a profile with Add access only to Clinical Module CPT Code
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add CPT Code in Clinical Module
And the user should not be able to edit or delete CPT Code in Clinical Module

Scenario: User with Edit access for CPT Code
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser4_static@mailinator.com"
And I create a profile with Edit access only to Clinical Module CPT Code
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit CPT Code in Clinical Module
And the user should not be able to add or delete CPT Code in Clinical Module

Scenario: User with Delete access for CPT Code
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser5_static@mailinator.com"
And I create a profile with Delete access only to Clinical Module CPT Code
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete CPT Code in Clinical Module
And the user should not be able to add or edit CPT Code in Clinical Module

Scenario: User with Add access for Patients
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser6_static@mailinator.com"
And I create a profile with Add access only to Patients Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add Patients in Patients Module
And the user should not be able to edit or delete Patients in Patients Module


Scenario: User with Edit access for Patients
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser7_static@mailinator.com"
And I create a profile with Edit access only to Patients Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit Patients in Patients Module
And the user should not be able to add or delete Patients in Patients Module


Scenario: User with Delete access for Patients
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser8_static@mailinator.com"
And I create a profile with Delete access only to Patients Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete Patients in Patients Module
And the user should not be able to add or edit Patients in Patients Module

Scenario: User with full permissions in Clinical Module
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser9_static@mailinator.com"
And I create a profile with All Access to Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
And the user should be able to View Link and Sync Link in Clinical Module

Scenario: User with Add access for SOAP Components
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser9_static@mailinator.com"
And I create a profile with Add access only to SOAP Components
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add SOAP Components in Clinical Module 
And the user should not be able to edit or delete SOAP Components in Clinical Module

Scenario: User with Edit access for SOAP Components
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser10_static@mailinator.com"
And I create a profile with Edit access only to SOAP Components
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit SOAP Components in Clinical Module
And the user should not be able to add or delete SOAP Components in Clinical Module

Scenario: User with Delete access for SOAP Components
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser9_static@mailinator.com"
And I create a profile with Delete access only to SOAP Components
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete SOAP Components in Clinical Module
And the user should not be able to add or edit SOAP Components in Clinical Module

Scenario: User with Add access for Patients / Clinical Encounter
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser8_static@mailinator.com"
And I create a profile with Add access only to Patients Clinical Encounter
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add Patients Clinical Encounter in Clinical Module
And the user should not be able to edit or delete Patients Clinical Encounter in Clinical Module

Scenario: User with Edit access for Patients / Clinical Encounter
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser5_static@mailinator.com"
And I create a profile with Edit access only to Patients Clinical Encounter
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit Patients Clinical Encounter in Clinical Module
And the user should not be able to add or delete Patients Clinical Encounter in Clinical Module

Scenario: User with Delete access for Patients / Clinical Encounter
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser4_static@mailinator.com"
And I create a profile with Delete access only to Patients Clinical Encounter
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete Patients Clinical Encounter in Clinical Module
And the user should not be able to add or edit Patients Clinical Encounter in Clinical Module

Scenario: User with View and View Star1 Drug access for Patients / Clinical Encounter Review
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser3_static@mailinator.com"
And I create a profile with View and View Star1 Drug access to Patients Clinical Encounter Review
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view Patients Clinical Encounter Review in Clinical Module
And the user should be able to view Star1 Drug in Patients Clinical Encounter Review in Clinical Module

Scenario: User with No Access for Patients / Clinical Encounter Review
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser1_static@mailinator.com"
And I create a profile with No Access to Patients Clinical Encounter Review
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should not be able to access Patients Clinical Encounter Review in Clinical Module

Scenario: User with View and Download File access for Reports / Status Log
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser1_static@mailinator.com"
And I create a profile with View and Download File access to Reports Status Log
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view Reports Status Log in Reports Module
And the user should be able to download files from Reports Status Log in Reports Module

Scenario: User with View but no Download File access for Reports / Status Log
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser2_static@mailinator.com"
And I create a profile with View but no Download File access to Reports Status Log
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view Reports Status Log in Reports Module
But the user should not be able to download files from Reports Status Log in Reports Module

Scenario: User with View and Download File access for Reports / Medication Recommendation And Suggestions
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser3_static@mailinator.com"
And I create a profile with View and Download File access to Reports Medication Recommendation And Suggestions
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view Reports Medication Recommendation And Suggestions in Reports Module
And the user should be able to download files from Reports Medication Recommendation And Suggestions in Reports Module

Scenario: User with View but no Download File access for Reports / Medication Recommendation And Suggestions
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser4_static@mailinator.com"
And I create a profile with View but no Download File access to Reports Medication Recommendation And Suggestions
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view Reports Medication Recommendation And Suggestions in Reports Module
But the user should not be able to download files from Reports Medication Recommendation And Suggestions in Reports Module

Scenario: User with View and Download File access for Reports / CCM Encounter Log
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser5_static@mailinator.com"
And I create a profile with View and Download File access to Reports CCM Encounter Log
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view Reports CCM Encounter Log in Reports Module
And the user should be able to download files from Reports CCM Encounter Log in Reports Module

Scenario: User with View but no Download File access for Reports / CCM Encounter Log
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser6_static@mailinator.com"
And I create a profile with View but no Download File access to Reports CCM Encounter Log
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view Reports CCM Encounter Log in Reports Module
But the user should not be able to download files from Reports CCM Encounter Log in Reports Module

Scenario: User with View and Download File access for Reports / Call Log
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser7_static@mailinator.com"
And I create a profile with View and Download File access to Reports Call Log
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view Reports Call Log in Reports Module
And the user should be able to download files from Reports Call Log in Reports Module

Scenario: User with View but no Download File access for Reports / Call Log
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser8_static@mailinator.com"
And I create a profile with View but no Download File access to Reports Call Log
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view Reports Call Log in Reports Module
But the user should not be able to download files from Reports Call Log in Reports Module

Scenario: User with View and Referred To New Provider access for Patient / Provider Referral
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser2_static@mailinator.com"
And I create a profile with View and Referred To New Provider access to Patient Provider Referral
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view Patient Provider Referral in Clinical Module
And the user should be able to refer to a new provider in Patient Provider Referral in Clinical Module

Scenario: User with View but no Referred To New Provider access for Patient / Provider Referral
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser3_static@mailinator.com"
And I create a profile with View but no Referred To New Provider access to Patient Provider Referral
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view Patient Provider Referral in Clinical Module
But the user should not be able to refer to a new provider in Patient Provider Referral in Clinical Module

Scenario: User with Add access for CareGiver Name
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser4_static@mailinator.com"
And I create a profile with Add access only to CareGiver Name in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add CareGiver Name in Clinical Module
And the user should not be able to edit or delete CareGiver Name in Clinical Module

Scenario: User with Edit access for CareGiver Name
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser6_static@mailinator.com"
And I create a profile with Edit access only to CareGiver Name in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit CareGiver Name in Clinical Module
And the user should not be able to add or delete CareGiver Name in Clinical Module

Scenario: User with Delete access for CareGiver Name
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser9_static@mailinator.com"
And I create a profile with Delete access only to CareGiver Name in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete CareGiver Name in Clinical Module
And the user should not be able to add or edit CareGiver Name in Clinical Module

Scenario: User with Add access for Prior Authorization
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser5_static@mailinator.com"
And I create a profile with Add access only to Prior Authorization in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add Prior Authorization in Clinical Module
And the user should not be able to edit or delete Prior Authorization in Clinical Module

Scenario: User with Edit access for Prior Authorization
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser6_static@mailinator.com"
And I create a profile with Edit access only to Prior Authorization in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit Prior Authorization in Clinical Module
And the user should not be able to add or delete Prior Authorization in Clinical Module


Scenario: User with Delete access for Prior Authorization
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser7_static@mailinator.com"
And I create a profile with Delete access only to Prior Authorization in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete Prior Authorization in Clinical Module
And the user should not be able to add or edit Prior Authorization in Clinical Module

Scenario: User with Full access for Prior Authorization
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser3_static@mailinator.com"
And I create a profile with full Acess to Prior Authorization in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to Export Excel in Clinical Module
Then the user should be able to access Details in Clinical Module
Then the user should be able to Archive in Clinical Module
Then the user should be able to Unarchive in Clinical Module
Then the user should be able to view Grid View in Clinical Module

Scenario: User with Add access for Med Recons
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser9_static@mailinator.com"
And I create a profile with Add access only to Med Recons in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add Med Recons in Clinical Module
And the user should not be able to edit or delete Med Recons in Clinical Module

Scenario: User with Delete access for Med Recons
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser11_static@mailinator.com"
And I create a profile with Delete access only to Med Recons in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete Med Recons in Clinical Module
And the user should not be able to add or edit Med Recons in Clinical Module

Scenario: User can access Download File
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser1_static@mailinator.com"
And I create a profile with access only to Download File in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to access Details in Clinical Module
Then the user should be able to access Download File in Clinical Module

Scenario: User with Add access for Med Recons / Meds On Chart
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser1_static@mailinator.com"
And I create a profile with Add access only to Med Recons Meds On Chart in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add Med Recons Meds On Chart in Clinical Module
And the user should not be able to edit or delete Med Recons Meds On Chart in Clinical Module


Scenario: User with Edit access for Med Recons / Meds On Chart
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser2_static@mailinator.com"
And I create a profile with Edit access only to Med Recons Meds On Chart in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit Med Recons Meds On Chart in Clinical Module
And the user should not be able to add or delete Med Recons Meds On Chart in Clinical Module

Scenario: User with Delete access for Med Recons / Meds On Chart
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser3_static@mailinator.com"
And I create a profile with Delete access only to Med Recons Meds On Chart in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete Med Recons Meds On Chart in Clinical Module
And the user should not be able to add or edit Med Recons Meds On Chart in Clinical Module

Scenario: User with Add access for Med Recons / Current Medication
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser4_static@mailinator.com"
And I create a profile with Add access only to Med Recons Current Medication in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add Med Recons Current Medication in Clinical Module
And the user should not be able to edit or delete Med Recons Current Medication in Clinical Module

Scenario: User with Edit access for Med Recons / Current Medication
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser18_static@mailinator.com"
And I create a profile with Edit access only to Med Recons Current Medication in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit Med Recons Current Medication in Clinical Module
And the user should not be able to add or delete Med Recons Current Medication in Clinical Module

Scenario: User with Delete access for Med Recons / Current Medication
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser19_static@mailinator.com"
And I create a profile with Delete access only to Med Recons Current Medication in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete Med Recons Current Medication in Clinical Module
And the user should not be able to add or edit Med Recons Current Medication in Clinical Module

Scenario: User with View, Export Excel, and Details access for Reports / MTM Encounter Log
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser2_static@mailinator.com"
And I create a profile with View, Export Excel, and Details access to Reports MTM Encounter Log in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view Reports MTM Encounter Log in Clinical Module
And the user should be able to export Reports MTM Encounter Log to Excel in Clinical Module
And the user should be able to view Details for Reports MTM Encounter Log in Clinical Module

Scenario: User with View access only for Reports / MTM Encounter Log
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser4_static@mailinator.com"
And I create a profile with View access only to Reports MTM Encounter Log in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view Reports MTM Encounter Log in Clinical Module
And the user should not have access to Export Excel or Details for Reports MTM Encounter Log in Clinical Module


Scenario: User with Add access for Remote Patient Monitoring RPM
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser5_static@mailinator.com"
And I create a profile with Add access only to Remote Patient Monitoring RPM in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add Remote Patient Monitoring RPM in Clinical Module
And the user should not be able to edit or delete Remote Patient Monitoring RPM in Clinical Module

Scenario: User with Edit access for Remote Patient Monitoring RPM
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser6_static@mailinator.com"
And I create a profile with Edit access only to Remote Patient Monitoring RPM in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit Remote Patient Monitoring RPM in Clinical Module
And the user should not be able to add or delete Remote Patient Monitoring RPM in Clinical Module

Scenario: User with Delete access for Remote Patient Monitoring (RPM)
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser7_static@mailinator.com"
And I create a profile with Delete access only to Remote Patient Monitoring RPM in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete Remote Patient Monitoring RPM in Clinical Module
And the user should not be able to add or edit Remote Patient Monitoring RPM in Clinical Module

Scenario: User with Export Excel and Outgoing Call access
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser8_static@mailinator.com"
And I create a profile with Export Excel and Outgoing Call access in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to export data to Excel in Clinical Module
And the user should be able to make Outgoing Calls in Clinical Module


Scenario: User with Add access for RPM / Remote Monitoring Parameter
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser9_static@mailinator.com"
And I create a profile with Add access only to RPM Remote Monitoring Parameter in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add RPM Remote Monitoring Parameter in Clinical Module
And the user should not be able to edit or delete RPM Remote Monitoring Parameter in Clinical Module


Scenario: User with Edit access for RPM / Remote Monitoring Parameter
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser1_static@mailinator.com"
And I create a profile with Edit access only to RPM Remote Monitoring Parameter in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit RPM Remote Monitoring Parameter in Clinical Module
And the user should not be able to add or delete RPM Remote Monitoring Parameter in Clinical Module


Scenario: User with Delete access for RPM / Remote Monitoring Parameter
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser31_static@mailinator.com"
And I create a profile with Delete access only to RPM Remote Monitoring Parameter in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete RPM Remote Monitoring Parameter in Clinical Module
And the user should not be able to add or edit RPM Remote Monitoring Parameter in Clinical Module

Scenario: User with Edit access for RPM / RMP Details
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser32_static@mailinator.com"
And I create a profile with Edit access only to RPM RMP Details in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit RPM RMP Details in Clinical Module
And the user should not have access to Add or Delete RPM RMP Details in Clinical Module

Scenario: User with no Edit access for RPM / RMP Details
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser34_static@mailinator.com"
And I create a profile with no Edit access to RPM RMP Details in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should not be able to edit RPM RMP Details in Clinical Module


Scenario: User with Add access for RPM External Details for Alert
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser2_static@mailinator.com"
And I create a profile with Add access only to RPM External Details for Alert in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add RPM External Details for Alert in Clinical Module
And the user should not be able to edit or delete RPM External Details for Alert in Clinical Module

Scenario: User with Edit access for RPM External Details for Alert
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser3_static@mailinator.com"
And I create a profile with Edit access only to RPM External Details for Alert in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit RPM External Details for Alert in Clinical Module
And the user should not be able to add or delete RPM External Details for Alert in Clinical Module

Scenario: User with Delete access for RPM External Details for Alert
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser4_static@mailinator.com"
And I create a profile with Delete access only to RPM External Details for Alert in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete RPM External Details for Alert in Clinical Module
And the user should not be able to add or edit RPM External Details for Alert in Clinical Module


Scenario: User with Add access for RPM Trigger Alert for Time
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser7_static@mailinator.com"
And I create a profile with Add access only to RPM Trigger Alert for Time in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add RPM Trigger Alert for Time in Clinical Module
And the user should not be able to edit or delete RPM Trigger Alert for Time in Clinical Module

Scenario: User with Edit access for RPM Trigger Alert for Time
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser1_static@mailinator.com"
And I create a profile with Edit access only to RPM Trigger Alert for Time in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit RPM Trigger Alert for Time in Clinical Module
And the user should not be able to add or delete RPM Trigger Alert for Time in Clinical Module


Scenario: User with Delete access for RPM Trigger Alert for Time
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser2_static@mailinator.com"
And I create a profile with Delete access only to RPM Trigger Alert for Time in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete RPM Trigger Alert for Time in Clinical Module
And the user should not be able to add or edit RPM Trigger Alert for Time in Clinical Module


Scenario: User with all access for Reports Remote Monitoring Report
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser5_static@mailinator.com"
And I create a profile with all access for Reports Remote Monitoring Report
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view Reports Remote Monitoring Report in Clinical Module
And the user should be able to drill down Reports Remote Monitoring Report in Clinical Module
And the user should be able to download Reports Remote Monitoring Report file in Clinical Module
And the user should be able to send Reports Remote Monitoring Report for signature in Clinical Module
And the user should be able to export Reports Remote Monitoring Report to Excel in Clinical Module
And the user should be able to download drilldown report for Reports Remote Monitoring Report in Clinical Module


Scenario: User with View access for Reports Remote Monitoring Report
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser8_static@mailinator.com"
And I create a profile with View access only to Reports Remote Monitoring Report in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view Reports Remote Monitoring Report in Clinical Module
And the user should not be able to drill down Reports Remote Monitoring Report in Clinical Module
And the user should not be able to download Reports Remote Monitoring Report file in Clinical Module
And the user should not be able to send Reports Remote Monitoring Report for signature in Clinical Module
And the user should not be able to export Reports Remote Monitoring Report to Excel in Clinical Module
And the user should not be able to download drilldown report for Reports Remote Monitoring Report in Clinical Module

Scenario: User with all access for PA All PA
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser1_static@mailinator.com"
And I create a profile with all access for PA All PA
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view PA All PA in Clinical Module
And the user should be able to generate PA All PA in Clinical Module
And the user should be able to verify PA All PA in Clinical Module
And the user should be able to submit PA All PA in Clinical Module
And the user should be able to view PA All PA outcome in Clinical Module
And the user should be able to export PA All PA to Excel in Clinical Module
And the user should be able to show generated PA by all in Clinical Module
And the user should be able to delete PA status in Clinical Module
And the user should be able to delete PA outcome status in Clinical Module
And the user should be able to delete generated incoming attachment in Clinical Module
And the user should be able to delete PA ChartNote attachment in Clinical Module
And the user should be able to send Clinical PA Insurance in Clinical Module

Scenario: User with View access for PA All PA
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser6_static@mailinator.com"
And I create a profile with View access only to PA All PA in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view PA All PA in Clinical Module
And the user should not be able to generate PA All PA in Clinical Module
And the user should not be able to verify PA All PA in Clinical Module
And the user should not be able to submit PA All PA in Clinical Module
And the user should not be able to view PA All PA outcome in Clinical Module
And the user should not be able to export PA All PA to Excel in Clinical Module
And the user should not be able to show generated PA by all in Clinical Module
And the user should not be able to delete PA status in Clinical Module
And the user should not be able to delete PA outcome status in Clinical Module
And the user should not be able to delete generated incoming attachment in Clinical Module
And the user should not be able to delete PA ChartNote attachment in Clinical Module
And the user should not be able to send Clinical PA Insurance in Clinical Module

Scenario: User with Add access for RPM Status
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser4_static@mailinator.com"
And I create a profile with Add access only to RPM Status in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add RPM RPM Status in Clinical Module
And the user should not be able to edit or delete RPM RPM Status in Clinical Module


Scenario: User with Edit access for RPM Status
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser5_static@mailinator.com"
And I create a profile with Edit access only to RPM Status in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit RPM RPM Status in Clinical Module
And the user should not be able to add or delete RPM RPM Status in Clinical Module


Scenario: User with Delete access for RPM Status
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser1_static@mailinator.com"
And I create a profile with Delete access only to RPM Status in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete RPM RPM Status in Clinical Module
And the user should not be able to add or edit RPM RPM Status in Clinical Module


Scenario: User with Add access for RPM Progress Step
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser1_static@mailinator.com"
And I create a profile with Add access only to RPM Progress Step in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add RPM Progress Step in Clinical Module
And the user should not be able to edit or delete RPM Progress Step in Clinical Module

Scenario: User with Edit access for RPM Progress Step
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser2_static@mailinator.com"
And I create a profile with Edit access only to RPM Progress Step in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit RPM Progress Step in Clinical Module
And the user should not be able to add or delete RPM Progress Step in Clinical Module

Scenario: User with Delete access for RPM Progress Step
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser3_static@mailinator.com"
And I create a profile with Delete access only to RPM Progress Step in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete RPM Progress Step in Clinical Module
And the user should not be able to add or edit RPM Progress Step in Clinical Module

Scenario: User with Add access for PA Progress Step
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser8_static@mailinator.com"
And I create a profile with Add access only to PA Progress Step in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add PA Progress Step in Clinical Module
And the user should not be able to edit or delete PA Progress Step in Clinical Module


Scenario: User with Edit access for PA Progress Step
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser10_static@mailinator.com"
And I create a profile with Edit access only to PA Progress Step in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit PA Progress Step in Clinical Module
And the user should not be able to add or delete PA Progress Step in Clinical Module

Scenario: User with Delete access for PA Progress Step
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser1_static@mailinator.com"
And I create a profile with Delete access only to PA Progress Step in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete PA Progress Step in Clinical Module
And the user should not be able to add or edit PA Progress Step in Clinical Module

Scenario: User with Edit access for Digital Signature
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser6_static@mailinator.com"
And I create a profile with Edit access only to Digital Signature in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit Digital Signature in Clinical Module
And the user should not be able to delete or download Digital Signature in Clinical Module

Scenario: User with Delete access for Digital Signature
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser7_static@mailinator.com"
And I create a profile with Delete access only to Digital Signature in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete Digital Signature in Clinical Module
And the user should not be able to edit or download Digital Signature in Clinical Module

Scenario: User with Download access for Digital Signature
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser8_static@mailinator.com"
And I create a profile with Download access only to Digital Signature in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to download Digital Signature in Clinical Module
And the user should not be able to edit or delete Digital Signature in Clinical Module


Scenario: User with Add access for CPT Code
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser3_static@mailinator.com"
And I create a profile with Add access only to CPT Code in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to add RPM CPT Code in Clinical Module
And the user should not be able to edit or delete RPM CPT Code in Clinical Module


Scenario: User with Edit access for CPT Code
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser4_static@mailinator.com"
And I create a profile with Edit access only to CPT Code in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to edit RPM CPT Code in Clinical Module
And the user should not be able to add or delete RPM CPT Code in Clinical Module

Scenario: User with Delete access for CPT Code
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser5_static@mailinator.com"
And I create a profile with Delete access only to CPT Code in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to delete RPM CPT Code in Clinical Module
And the user should not be able to add or edit RPM CPT Code in Clinical Module

Scenario: User with View and Export access for Device Usage Statistic Report
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser1_static@mailinator.com"
And I create a profile with View and Export access to Device Usage Statistic Report in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view Device Usage Statistic Report in Clinical Module
And the user should be able to export Device Usage Statistic Report in Clinical Module

#
Scenario: User with View-only access for Device Usage Statistic Report
Given I log in as admin for Clinical Module
When I create a new user with email for Clinical Module "testuser2_static@mailinator.com"
And I create a profile with View access only to Device Usage Statistic Report in Clinical Module
And I assign the profile and workspace to the user for Clinical Module
And I reset the user's password for Clinical Module
And I log in using the new user for Clinical Module
Then the user should be able to view Device Usage Statistic Report in Clinical Module
And the user should not be able to export Device Usage Statistic Report in Clinical Module


































































































































































    
    
    
    



    
    










  
  
  





































































































