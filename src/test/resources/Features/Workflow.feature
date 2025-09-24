Feature: Workflow Module scenarios

Scenario: User with View only access for General (Audit View)
Given I log in as admin for Workflow Module 
When I create a new user with email for Workflow Module "testuser1_static@mailinator.com"    
And I create a profile with View access only to Workflow Module General Audit View 
And I assign the profile and workspace to the user for Workflow Module  
And I reset the user's password for Workflow Module 
And I log in using the new user for Workflow Module 
Then the user should be able to view General Audit View settings in Workflow Module 

Scenario: User with No access for General (Audit View)
Given I log in as admin for Workflow Module 
When I create a new user with email for Workflow Module "testuser2_static@mailinator.com"  
And I create a profile with No access to Workflow Module General Audit View     
And I assign the profile and workspace to the user for Workflow Module  
And I reset the user's password for Workflow Module 
And I log in using the new user for Workflow Module 
Then the user should not be able to view General Audit View settings in Workflow Module 

Scenario: User with View and Add access but no Edit or Delete for Sync Workflow Settings
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser3_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Sync Workflow Settings in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Sync Workflow Settings in Workflow Module
And the user should be able to add Sync Workflow Settings in Workflow Module
And the user should not be able to edit Sync Workflow Settings in Workflow Module
And the user should not be able to delete Sync Workflow Settings in Workflow Module

Scenario: User with View and Edit access but no Add or Delete for Sync Workflow Settings
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser4_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Sync Workflow Settings in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Sync Workflow Settings in Workflow Module
And the user should be able to edit Sync Workflow Settings in Workflow Module
And the user should not be able to add Sync Workflow Settings in Workflow Module
And the user should not be able to delete Sync Workflow Settings in Workflow Module

Scenario: User with View and Delete access but no Add or Edit for Sync Workflow Settings
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser5_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Sync Workflow Settings in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Sync Workflow Settings in Workflow Module
And the user should be able to delete Sync Workflow Settings in Workflow Module
And the user should not be able to add Sync Workflow Settings in Workflow Module
And the user should not be able to edit Sync Workflow Settings in Workflow Module

Scenario: User with View and Add access but no Edit or Delete for Medication Sync Reminder Color Code
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser7_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Medication Sync Reminder Color Code in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Medication Sync Reminder Color Code in Workflow Module
And the user should be able to add Medication Sync Reminder Color Code in Workflow Module
And the user should not be able to edit Medication Sync Reminder Color Code in Workflow Module
And the user should not be able to delete Medication Sync Reminder Color Code in Workflow Module

Scenario: User with View and Edit access but no Add or Delete for Medication Sync Reminder Color Code
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser8_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Medication Sync Reminder Color Code in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Medication Sync Reminder Color Code in Workflow Module
And the user should be able to edit Medication Sync Reminder Color Code in Workflow Module
And the user should not be able to add Medication Sync Reminder Color Code in Workflow Module
And the user should not be able to delete Medication Sync Reminder Color Code in Workflow Module

Scenario: User with View and Delete access but no Add or Edit for Medication Sync Reminder Color Code
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser9_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Medication Sync Reminder Color Code in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Medication Sync Reminder Color Code in Workflow Module
And the user should be able to delete Medication Sync Reminder Color Code in Workflow Module
And the user should not be able to add Medication Sync Reminder Color Code in Workflow Module
And the user should not be able to edit Medication Sync Reminder Color Code in Workflow Module

@Workflow
Scenario: User with View and Add access but no Edit or Delete for Reminder Result Action
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser10_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Reminder Result Action in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Reminder Result Action in Workflow Module
And the user should be able to add Reminder Result Action in Workflow Module
And the user should not be able to edit Reminder Result Action in Workflow Module
And the user should not be able to delete Reminder Result Action in Workflow Module

Scenario: User with View and Edit access but no Add or Delete for Reminder Result Action
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser11_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Reminder Result Action in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Reminder Result Action in Workflow Module
And the user should be able to edit Reminder Result Action in Workflow Module
And the user should not be able to add Reminder Result Action in Workflow Module
And the user should not be able to delete Reminder Result Action in Workflow Module

Scenario: User with View and Delete access but no Add or Edit for Reminder Result Action
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser12_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Reminder Result Action in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Reminder Result Action in Workflow Module
And the user should be able to delete Reminder Result Action in Workflow Module
And the user should not be able to add Reminder Result Action in Workflow Module
And the user should not be able to edit Reminder Result Action in Workflow Module














































