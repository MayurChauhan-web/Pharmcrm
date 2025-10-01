@Delivery
Feature: Delivery Module scenarios

Scenario: User with View only access for General (Audit View)
Given I log in as admin for Delivery Module 
When I create a new user with email for Delivery Module "testuser1_static@mailinator.com"    
And I create a profile with View access only to Delivery Module General Audit View 
And I assign the profile and workspace to the user for Delivery Module  
And I reset the user's password for Delivery Module 
And I log in using the new user for Delivery Module 
Then the user should be able to view General Audit View settings in Delivery Module 

Scenario: User with No access for General (Audit View)
Given I log in as admin for Delivery Module 
When I create a new user with email for Delivery Module "testuser2_static@mailinator.com"  
And I create a profile with No access to Delivery Module General Audit View     
And I assign the profile and workspace to the user for Delivery Module  
And I reset the user's password for Delivery Module 
And I log in using the new user for Delivery Module 
Then the user should not be able to view General Audit View settings in Delivery Module

Scenario: User with Update access for Package Settings
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser5_static@mailinator.com"
And I create a profile with Update access only to Delivery Module Package Settings
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to update Package Settings in Delivery Module

Scenario: User with No access for Package Settings
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser7_static@mailinator.com"
And I create a profile with No access to Delivery Module Package Settings
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should not be able to view or update Package Settings in Delivery Module

Scenario: User with View + Add access for Package Restriction
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser1_static@mailinator.com"
And I create a profile with View and Add access to Delivery Module Package Restriction
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view and add Package Restriction in Delivery Module

Scenario: User with View + Delete Package Restriction Plan access
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser2_static@mailinator.com"
And I create a profile with View and Delete Package Restriction Plan access to Delivery Module Package Restriction
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view and delete Package Restriction Plan in Delivery Module

Scenario: User with View + Delete Package Restriction State access
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser5_static@mailinator.com"
And I create a profile with View and Delete Package Restriction State access to Delivery Module Package Restriction
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view and delete Package Restriction State in Delivery Module

Scenario: User with View + Add access for Delivery Distances
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser1_static@mailinator.com"
And I create a profile with View and Add access only to Delivery Module Delivery Distances
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view and add Delivery Distances in Delivery Module
And the user should not be able to edit or delete Delivery Distances in Delivery Module

Scenario: User with View + Edit access for Delivery Distances
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser3_static@mailinator.com"
And I create a profile with View and Edit access only to Delivery Module Delivery Distances
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view and edit Delivery Distances in Delivery Module
And the user should not be able to add or delete Delivery Distances in Delivery Module

Scenario: User with View + Delete access for Delivery Distances
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser4_static@mailinator.com"
And I create a profile with View and Delete access only to Delivery Module Delivery Distances
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view and delete Delivery Distances in Delivery Module
And the user should not be able to add or edit Delivery Distances in Delivery Module

Scenario: User with View + Add access for Logistic Company
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser5_static@mailinator.com"
And I create a profile with View and Add access only to Delivery Module Logistic Company
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view and add Logistic Company in Delivery Module
And the user should not be able to edit or delete Logistic Company in Delivery Module

Scenario: User with View + Edit access for Logistic Company
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser6_static@mailinator.com"
And I create a profile with View and Edit access only to Delivery Module Logistic Company
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view and edit Logistic Company in Delivery Module
And the user should not be able to add or delete Logistic Company in Delivery Module

Scenario: User with View + Delete access for Logistic Company
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser7_static@mailinator.com"
And I create a profile with View and Delete access only to Delivery Module Logistic Company
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view and delete Logistic Company in Delivery Module
And the user should not be able to add or edit Logistic Company in Delivery Module

Scenario: User with View + Add access for Delivery Marker
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser8_static@mailinator.com"
And I create a profile with View and Add access only to Delivery Module Delivery Marker
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view and add Delivery Marker in Delivery Module
And the user should not be able to edit or delete Delivery Marker in Delivery Module

Scenario: User with View + Edit access for Delivery Marker
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser10_static@mailinator.com"
And I create a profile with View and Edit access only to Delivery Module Delivery Marker
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view and edit Delivery Marker in Delivery Module
And the user should not be able to add or delete Delivery Marker in Delivery Module

Scenario: User with View + Delete access for Delivery Marker
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser11_static@mailinator.com"
And I create a profile with View and Delete access only to Delivery Module Delivery Marker
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view and delete Delivery Marker in Delivery Module
And the user should not be able to add or edit Delivery Marker in Delivery Module

Scenario: User with View + Add access for Package
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser6_static@mailinator.com"
And I create a profile with View and Add access only to Delivery Module Package
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view and add Package in Delivery Module
And the user should not be able to edit or delete Package in Delivery Module

Scenario: User with View + Edit access for Package
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser7_static@mailinator.com"
And I create a profile with View and Edit access only to Delivery Module Package
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view and edit Package in Delivery Module
And the user should not be able to add or delete Package in Delivery Module

Scenario: User with View + Delete access for Package
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser8_static@mailinator.com"
And I create a profile with View and Delete access only to Delivery Module Package
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view and delete Package in Delivery Module
And the user should not be able to add or edit Package in Delivery Module

Scenario: User with Full Access for Package
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser7_static@mailinator.com"
And I create a profile with Full Access for Package to Delivery Module Package
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to access Package Detail in Delivery Module
Then the user should be able to generate Package Label in Delivery Module
Then the user should be able to update Delivery Status in Delivery Module
Then the user should be able to download Reference Documents in Delivery Module
Then the user should be able to upload Signature in Delivery Module
Then the user should be able to download Signature in Delivery Module
Then the user should be able to print Signature in Delivery Module
Then the user should be able to send Package for Signature in Delivery Module
Then the user should be able to download Attestation Documents in Delivery Module
Then the user should be able to generate Package Invoice in Delivery Module
Then the user should be able to print Package in Delivery Module
Then the user should be able to share Package in Delivery Module
Then the user should be able to print Pickup Package in Delivery Module
Then the user should be able to sync Logistic Tracking History in Delivery Module

Scenario: User with View + Update access for Delivery Setting (restricted actions)
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser3_static@mailinator.com"
And I create a profile with View and Update access to Delivery Module Delivery Setting
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view Delivery Setting in Delivery Module
Then the user should be able to update Delivery Setting in Delivery Module

Scenario: Create user without Delivery Setting access and check restrictions
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser4_static@mailinator.com"
And I create a profile without access to Delivery Module Delivery Setting
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should have no Delivery Setting access via UI or direct URL

Scenario: User with View + Update access for Package Plan Restriction
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser6_static@mailinator.com"
And I create a profile with View and Update access to Delivery Module Package Plan Restriction
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view Package Plan Restriction in Delivery Module
Then the user should be able to update Package Plan Restriction in Delivery Module

Scenario: Create user without Package Plan Restriction access and check restrictions
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser7_static@mailinator.com"
And I create a profile without access to Delivery Module Package Plan Restriction
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should have no Package Plan Restriction access via UI or direct URL

Scenario: User with View-only access for Delivery Identifier
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser1_static@mailinator.com"
And I create a profile with View-only access to Delivery Module Delivery Identifier
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view Delivery Identifier in Delivery Module

Scenario: Create user without Delivery Identifier access and check restrictions
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser1_static@mailinator.com"
And I create a profile without access to Delivery Module Delivery Identifier
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should have no Delivery Identifier access via UI or direct URL

Scenario: User with View + Add access for Manifest
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser8_static@mailinator.com"
And I create a profile with View and Add access only to Delivery Module Manifest
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view and add Manifest in Delivery Module
And the user should not be able to edit or delete Manifest in Delivery Module

Scenario: User with View + Edit access for Manifest
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser9_static@mailinator.com"
And I create a profile with View and Edit access only to Delivery Module Manifest
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view and edit Manifest in Delivery Module
And the user should not be able to add or delete Manifest in Delivery Module

Scenario: User with View + Delete access for Manifest
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser10_static@mailinator.com"
And I create a profile with View and Delete access only to Delivery Module Manifest
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view and delete Manifest in Delivery Module
And the user should not be able to add or edit Manifest in Delivery Module

Scenario: User with Full Access for Manifest
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser11_static@mailinator.com"
And I create a profile with Full Access for Manifest to Delivery Module Manifest
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to access Manifest Detail in Delivery Module
Then the user should be able to add Manifest Package in Delivery Module
Then the user should be able to delete Manifest Package in Delivery Module
Then the user should be able to skip Manifest Package in Delivery Module
Then the user should be able to add Manifest Bundle in Delivery Module
Then the user should be able to delete Manifest Bundle in Delivery Module
Then the user should be able to print Manifest in Delivery Module

Scenario: User with Add access for Customer Attestation
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser1_static@mailinator.com"
And I create a profile with Add access only to Delivery Module Customer Attestation
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to add Customer Attestation in Delivery Module
And the user should not be able to edit or delete Customer Attestation in Delivery Module

Scenario: User with Edit access for Customer Attestation
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser3_static@mailinator.com"
And I create a profile with Edit access only to Delivery Module Customer Attestation
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to edit Customer Attestation in Delivery Module
And the user should not be able to add or delete Customer Attestation in Delivery Module

Scenario: User with Delete access for Customer Attestation
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser4_static@mailinator.com"
And I create a profile with Delete access only to Delivery Module Customer Attestation
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to delete Customer Attestation in Delivery Module
And the user should not be able to add or edit Customer Attestation in Delivery Module

Scenario: User with Print and Send for Signature access for Customer Attestation
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser6_static@mailinator.com"
And I create a profile with Print and Send for Signature access to Delivery Module Customer Attestation
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to print Customer Attestation in Delivery Module
And the user should be able to send Customer Attestation for signature in Delivery Module

Scenario: User with Edit access for Delivery Job Setting
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser1_static@mailinator.com"
And I create a profile with Edit access only to Delivery Module Delivery Job Setting
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to edit Delivery Job Setting in Delivery Module
And the user should not be able to run triggers in Delivery Module

Scenario: User with Run Trigger access for Delivery Job Setting
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser1_static@mailinator.com"
And I create a profile with Run Trigger access only to Delivery Module Delivery Job Setting
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to run triggers in Delivery Module
And the user should not be able to edit Delivery Job Setting in Delivery Module

Scenario: User with View + Export access for Delivery Report
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser7_static@mailinator.com"
And I create a profile with View and Export access to Delivery Module Delivery Report
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view Delivery Report in Delivery Module
And the user should be able to export Delivery Report in Delivery Module

Scenario: User with View-only access for Delivery Report (no Export)
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser8_static@mailinator.com"
And I create a profile with View-only access to Delivery Module Delivery Report
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view Delivery Report in Delivery Module
And the user should not be able to export Delivery Report in Delivery Module

Scenario: User with View + Export access for Manifest Summary Report
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser9_static@mailinator.com"
And I create a profile with View and Export access to Delivery Module Manifest Summary Report
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view Manifest Summary Report in Delivery Module
And the user should be able to export Manifest Summary Report in Delivery Module

Scenario: User with View-only access for Manifest Summary Report (no Export)
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser10_static@mailinator.com"
And I create a profile with View-only access to Delivery Module Manifest Summary Report
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view Manifest Summary Report in Delivery Module
And the user should not be able to export Manifest Summary Report in Delivery Module

Scenario: User with View + Export access for Delivery Statistic Report
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser11_static@mailinator.com"
And I create a profile with View and Export access to Delivery Module Delivery Statistic Report
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view Delivery Statistic Report in Delivery Module
And the user should be able to export Delivery Statistic Report in Delivery Module

Scenario: User with View-only access for Delivery Statistic Report (no Export)
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser12_static@mailinator.com"
And I create a profile with View-only access to Delivery Module Delivery Statistic Report
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view Delivery Statistic Report in Delivery Module
And the user should not be able to export Delivery Statistic Report in Delivery Module























































































 












