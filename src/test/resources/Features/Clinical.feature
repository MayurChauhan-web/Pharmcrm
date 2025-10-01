
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

@Clinical
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





































































