Feature: Partner Module scenarios

Scenario: User with View only access for General Audit View
Given I log in as admin for Partner Module 
When I create a new user with email for Partner Module "testuser1_static@mailinator.com"  
And I create a profile with View access only to Partner Module General Audit View 
And I assign the profile and workspace to the user for Partner Module  
And I reset the user's password for Partner Module 
And I log in using the new user for Partner Module 
Then the user should be able to view General Audit View settings in Partner Module

Scenario: User with No access for General Audit View
Given I log in as admin for Partner Module 
When I create a new user with email for Partner Module "testuser2_static@mailinator.com"  
And I create a profile with No access to Partner Module General Audit View     
And I assign the profile and workspace to the user for Partner Module  
And I reset the user's password for Partner Module 
And I log in using the new user for Partner Module 
Then the user should not be able to view General Audit View settings in Partner Module

Scenario: User with Add access for Partner Module Partner Type
Given I log in as admin for Partner Module
When I create a new user with email for Partner Module "testuser2_static@mailinator.com"
And I create a profile with Add access only to Partner Type in Partner Module
And I assign the profile and workspace to the user for Partner Module
And I reset the user's password for Partner Module
And I log in using the new user for Partner Module
Then the user should be able to add Partner Type in Partner Module
And the user should not be able to edit or delete Partner Type in Partner Module

Scenario: User with Edit access for Partner Module General Audit View
Given I log in as admin for Partner Module
When I create a new user with email for Partner Module "testuser3_static@mailinator.com"
And I create a profile with Edit access only to Partner Type in Partner Module
And I assign the profile and workspace to the user for Partner Module
And I reset the user's password for Partner Module
And I log in using the new user for Partner Module
Then the user should be able to edit Partner Type in Partner Module
And the user should not be able to add or delete Partner Type in Partner Module

Scenario: User with Delete access for Partner Module Partner Type
Given I log in as admin for Partner Module
When I create a new user with email for Partner Module "testuser4_static@mailinator.com"
And I create a profile with Delete access only to Partner Type in Partner Module
And I assign the profile and workspace to the user for Partner Module
And I reset the user's password for Partner Module
And I log in using the new user for Partner Module
Then the user should be able to delete Partner Type in Partner Module
And the user should not be able to add or edit Partner Type in Partner Module 

Scenario: User with Add access for Partner Module Special Service
Given I log in as admin for Partner Module
When I create a new user with email for Partner Module "testuser5_static@mailinator.com"
And I create a profile with Add access only to Special Service in Partner Module
And I assign the profile and workspace to the user for Partner Module
And I reset the user's password for Partner Module
And I log in using the new user for Partner Module
Then the user should be able to add Special Service in Partner Module
And the user should not be able to edit Special Service in Partner Module

Scenario: User with Edit access for Partner Module Special Service
Given I log in as admin for Partner Module
When I create a new user with email for Partner Module "testuser6_static@mailinator.com"
And I create a profile with Edit access only to Special Service in Partner Module
And I assign the profile and workspace to the user for Partner Module
And I reset the user's password for Partner Module
And I log in using the new user for Partner Module
Then the user should be able to edit Special Service in Partner Module
And the user should not be able to add Special Service in Partner Module

Scenario: User with Add access for Partner Module Custom Partners
Given I log in as admin for Partner Module
When I create a new user with email for Partner Module "testuser2_static@mailinator.com"
And I create a profile with Add access only to Custom Partners in Partner Module
And I assign the profile and workspace to the user for Partner Module
And I reset the user's password for Partner Module
And I log in using the new user for Partner Module
Then the user should be able to add Custom Partners in Partner Module
And the user should not be able to edit or delete Custom Partners in Partner Module

Scenario: User with Edit access for Partner Module Custom Partners
Given I log in as admin for Partner Module
When I create a new user with email for Partner Module "testuser5_static@mailinator.com"
And I create a profile with Edit access only to Custom Partners in Partner Module
And I assign the profile and workspace to the user for Partner Module
And I reset the user's password for Partner Module
And I log in using the new user for Partner Module
Then the user should be able to edit Custom Partners in Partner Module
And the user should not be able to add or delete Custom Partners in Partner Module

Scenario: User with Delete access for Partner Module Custom Partners
Given I log in as admin for Partner Module
When I create a new user with email for Partner Module "testuser6_static@mailinator.com"
And I create a profile with Delete access only to Custom Partners in Partner Module
And I assign the profile and workspace to the user for Partner Module
And I reset the user's password for Partner Module
And I log in using the new user for Partner Module
Then the user should be able to delete Custom Partners in Partner Module
And the user should not be able to add or edit Custom Partners in Partner Module

Scenario: User with View and Details access for Partner Module Custom Partners
Given I log in as admin for Partner Module
When I create a new user with email for Partner Module "testuser7_static@mailinator.com"
And I create a profile with View Details access only to Custom Partners in Partner Module
And I assign the profile and workspace to the user for Partner Module
And I reset the user's password for Partner Module
And I log in using the new user for Partner Module
Then the user should be able to view and see details of Custom Partners in Partner Module
And the user should not be able to add, edit, or delete Custom Partners in Partner Module

Scenario: User with Add access for Partner Module Business Address
Given I log in as admin for Partner Module
When I create a new user with email for Partner Module "testuser9_static@mailinator.com"
And I create a profile with Add access only to Business Address in Partner Module
And I assign the profile and workspace to the user for Partner Module
And I reset the user's password for Partner Module
And I log in using the new user for Partner Module
Then the user should be able to add Business Address in Partner Module
And the user should not be able to edit or delete Business Address in Partner Module

Scenario: User with Edit access for Partner Module Business Address
Given I log in as admin for Partner Module
When I create a new user with email for Partner Module "testuser2_static@mailinator.com"
And I create a profile with Edit access only to Business Address in Partner Module
And I assign the profile and workspace to the user for Partner Module
And I reset the user's password for Partner Module
And I log in using the new user for Partner Module
Then the user should be able to edit Business Address in Partner Module
And the user should not be able to add or delete Business Address in Partner Module

Scenario: User with Delete access for Partner Module Business Address
Given I log in as admin for Partner Module
When I create a new user with email for Partner Module "testuser4_static@mailinator.com"
And I create a profile with Delete access only to Business Address in Partner Module
And I assign the profile and workspace to the user for Partner Module
And I reset the user's password for Partner Module
And I log in using the new user for Partner Module
Then the user should be able to delete Business Address in Partner Module
And the user should not be able to add or edit Business Address in Partner Module

@Partner
Scenario: User with Add access for Partner Module Mailing Address
Given I log in as admin for Partner Module
When I create a new user with email for Partner Module "testuser4_static@mailinator.com"
And I create a profile with Add access only to Mailing Address in Partner Module
And I assign the profile and workspace to the user for Partner Module
And I reset the user's password for Partner Module
And I log in using the new user for Partner Module
Then the user should be able to add Mailing Address in Partner Module
And the user should not be able to edit or delete Mailing Address in Partner Module

Scenario: User with Edit access for Partner Module Mailing Address
Given I log in as admin for Partner Module
When I create a new user with email for Partner Module "testuser1_static@mailinator.com"
And I create a profile with Edit access only to Mailing Address in Partner Module
And I assign the profile and workspace to the user for Partner Module
And I reset the user's password for Partner Module
And I log in using the new user for Partner Module
Then the user should be able to edit Mailing Address in Partner Module
And the user should not be able to add or delete Mailing Address in Partner Module

Scenario: User with Delete access for Partner Module Mailing Address
Given I log in as admin for Partner Module
When I create a new user with email for Partner Module "testuser1_static@mailinator.com"
And I create a profile with Delete access only to Mailing Address in Partner Module
And I assign the profile and workspace to the user for Partner Module
And I reset the user's password for Partner Module
And I log in using the new user for Partner Module
Then the user should be able to delete Mailing Address in Partner Module
And the user should not be able to add or edit Mailing Address in Partner Module

Scenario: User with Add access for Partner Module Executive
Given I log in as admin for Partner Module
When I create a new user with email for Partner Module "testuser1_static@mailinator.com"
And I create a profile with Add access only to Executive in Partner Module
And I assign the profile and workspace to the user for Partner Module
And I reset the user's password for Partner Module
And I log in using the new user for Partner Module
Then the user should be able to add Executive in Partner Module
And the user should not be able to edit or delete Executive in Partner Module

Scenario: User with Edit access for Partner Module Executive
Given I log in as admin for Partner Module
When I create a new user with email for Partner Module "testuser1_static@mailinator.com"
And I create a profile with Edit access only to Executive in Partner Module
And I assign the profile and workspace to the user for Partner Module
And I reset the user's password for Partner Module
And I log in using the new user for Partner Module
Then the user should be able to edit Executive in Partner Module
And the user should not be able to add or delete Executive in Partner Module

Scenario: User with Delete access for Partner Module Executive
Given I log in as admin for Partner Module
When I create a new user with email for Partner Module "testuser1_static@mailinator.com"
And I create a profile with Delete access only to Executive in Partner Module
And I assign the profile and workspace to the user for Partner Module
And I reset the user's password for Partner Module
And I log in using the new user for Partner Module
Then the user should be able to delete Executive in Partner Module
And the user should not be able to add or edit Executive in Partner Module

Scenario: User with View and Reset Password access for Partner Module Executive
Given I log in as admin for Partner Module
When I create a new user with email for Partner Module "testuser1_static@mailinator.com"
And I create a profile with View + Reset Password access only to Executive in Partner Module
And I assign the profile and workspace to the user for Partner Module
And I reset the user's password for Partner Module
And I log in using the new user for Partner Module
Then the user should be able to view Executive in Partner Module
And the user should be able to reset password for Executive in Partner Module
And the user should not be able to add, edit, or delete Executive in Partner Module



























