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

@Delivery
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
When I create a new user with email for Delivery Module "testuser6_static@mailinator.com"
And I create a profile with View and Edit access only to Delivery Module Delivery Marker
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view and edit Delivery Marker in Delivery Module
And the user should not be able to add or delete Delivery Marker in Delivery Module

Scenario: User with View + Delete access for Delivery Marker
Given I log in as admin for Delivery Module
When I create a new user with email for Delivery Module "testuser6_static@mailinator.com"
And I create a profile with View and Delete access only to Delivery Module Delivery Marker
And I assign the profile and workspace to the user for Delivery Module
And I reset the user's password for Delivery Module
And I log in using the new user for Delivery Module
Then the user should be able to view and delete Delivery Marker in Delivery Module
And the user should not be able to add or edit Delivery Marker in Delivery Module






































































 












