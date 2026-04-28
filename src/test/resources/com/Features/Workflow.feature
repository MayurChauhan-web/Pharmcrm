@Workflow
Feature: Workflow Module Scenarios

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
When I create a new user with email for Workflow Module "testuser1_static@mailinator.com"
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
When I create a new user with email for Workflow Module "testuser2_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Reminder Result Action in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Reminder Result Action in Workflow Module
And the user should be able to delete Reminder Result Action in Workflow Module
And the user should not be able to add Reminder Result Action in Workflow Module
And the user should not be able to edit Reminder Result Action in Workflow Module

Scenario: User with View and Add access but no Edit or Delete for Success Result Action
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser3_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Success Result Action in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Success Result Action in Workflow Module
And the user should be able to add Success Result Action in Workflow Module
And the user should not be able to edit Success Result Action in Workflow Module
And the user should not be able to delete Success Result Action in Workflow Module

Scenario: User with View and Edit access but no Add or Delete for Success Result Action
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser4_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Success Result Action in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Success Result Action in Workflow Module
And the user should be able to edit Success Result Action in Workflow Module
And the user should not be able to add Success Result Action in Workflow Module
And the user should not be able to delete Success Result Action in Workflow Module

Scenario: User with View and Delete access but no Add or Edit for Success Result Action
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser5_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Success Result Action in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Success Result Action in Workflow Module
And the user should be able to delete Success Result Action in Workflow Module
And the user should not be able to add Success Result Action in Workflow Module
And the user should not be able to edit Success Result Action in Workflow Module

Scenario: User with View and Add access but no Edit or Delete for Failure Result Action
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser6_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Failure Result Action in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Failure Result Action in Workflow Module
And the user should be able to add Failure Result Action in Workflow Module
And the user should not be able to edit Failure Result Action in Workflow Module
And the user should not be able to delete Failure Result Action in Workflow Module

Scenario: User with View and Edit access but no Add or Delete for Failure Result Action
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser7_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Failure Result Action in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Failure Result Action in Workflow Module
And the user should be able to edit Failure Result Action in Workflow Module
And the user should not be able to add Failure Result Action in Workflow Module
And the user should not be able to delete Failure Result Action in Workflow Module

Scenario: User with View and Delete access but no Add or Edit for Failure Result Action
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser8_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Failure Result Action in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Failure Result Action in Workflow Module
And the user should be able to delete Failure Result Action in Workflow Module
And the user should not be able to add Failure Result Action in Workflow Module
And the user should not be able to edit Failure Result Action in Workflow Module

Scenario: User with View and Add access but no Edit or Delete for Transfer Result Action
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser9_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Transfer Result Action in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Transfer Result Action in Workflow Module
And the user should be able to add Transfer Result Action in Workflow Module
And the user should not be able to edit Transfer Result Action in Workflow Module
And the user should not be able to delete Transfer Result Action in Workflow Module

Scenario: User with View and Edit access but no Add or Delete for Transfer Result Action
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser10_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Transfer Result Action in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Transfer Result Action in Workflow Module
And the user should be able to edit Transfer Result Action in Workflow Module
And the user should not be able to add Transfer Result Action in Workflow Module
And the user should not be able to delete Transfer Result Action in Workflow Module

Scenario: User with View and Delete access but no Add or Edit for Transfer Result Action
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser11_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Transfer Result Action in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Transfer Result Action in Workflow Module
And the user should be able to delete Transfer Result Action in Workflow Module
And the user should not be able to add Transfer Result Action in Workflow Module
And the user should not be able to edit Transfer Result Action in Workflow Module

Scenario: User with View and Add access but no Edit or Delete for Followup Trail Script
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser12_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Followup Trail Script in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Followup Trail Script in Workflow Module
And the user should be able to add Followup Trail Script in Workflow Module
And the user should not be able to edit Followup Trail Script in Workflow Module
And the user should not be able to delete Followup Trail Script in Workflow Module

Scenario: User with View and Edit access but no Add or Delete for Followup Trail Script
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser20_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Followup Trail Script in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Followup Trail Script in Workflow Module
And the user should be able to edit Followup Trail Script in Workflow Module
And the user should not be able to add Followup Trail Script in Workflow Module
And the user should not be able to delete Followup Trail Script in Workflow Module

Scenario: User with View and Delete access but no Add or Edit for Followup Trail Script
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser21_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Followup Trail Script in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Followup Trail Script in Workflow Module
And the user should be able to delete Followup Trail Script in Workflow Module
And the user should not be able to add Followup Trail Script in Workflow Module
And the user should not be able to edit Followup Trail Script in Workflow Module

Scenario: User with View and Add access but no Edit or Delete for Queue
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser1_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Queue in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Queue in Workflow Module
And the user should be able to add Queue in Workflow Module
And the user should not be able to edit Queue in Workflow Module
And the user should not be able to delete Queue in Workflow Module

Scenario: User with View and Edit access but no Add or Delete for Queue
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser2_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Queue in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Queue in Workflow Module
And the user should be able to edit Queue in Workflow Module
And the user should not be able to add Queue in Workflow Module
And the user should not be able to delete Queue in Workflow Module

Scenario: User with View and Delete access but no Add or Edit for Queue
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser4_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Queue in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Queue in Workflow Module
And the user should be able to delete Queue in Workflow Module
And the user should not be able to add Queue in Workflow Module
And the user should not be able to edit Queue in Workflow Module

Scenario: User with View and Add access but no Edit or Delete for Runningline Status
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser5_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Runningline Status in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Runningline Status in Workflow Module
And the user should be able to add Runningline Status in Workflow Module
And the user should not be able to edit Runningline Status in Workflow Module
And the user should not be able to delete Runningline Status in Workflow Module

Scenario: User with View and Edit access but no Add or Delete for Runningline Status
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser6_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Runningline Status in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Runningline Status in Workflow Module
And the user should be able to edit Runningline Status in Workflow Module
And the user should not be able to add Runningline Status in Workflow Module
And the user should not be able to delete Runningline Status in Workflow Module

Scenario: User with View and Delete access but no Add or Edit for Runningline Status
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser7_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Runningline Status in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Runningline Status in Workflow Module
And the user should be able to delete Runningline Status in Workflow Module
And the user should not be able to add Runningline Status in Workflow Module
And the user should not be able to edit Runningline Status in Workflow Module

Scenario: User with View and Add access but no Edit or Delete for Runningline Level1 Status
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser8_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Runningline Level1 Status in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Runningline Level1 Status in Workflow Module
And the user should be able to add Runningline Level1 Status in Workflow Module
And the user should not be able to edit Runningline Level1 Status in Workflow Module
And the user should not be able to delete Runningline Level1 Status in Workflow Module

Scenario: User with View and Edit access but no Add or Delete for Runningline Level1 Status
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser9_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Runningline Level1 Status in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Runningline Level1 Status in Workflow Module
And the user should be able to edit Runningline Level1 Status in Workflow Module
And the user should not be able to add Runningline Level1 Status in Workflow Module
And the user should not be able to delete Runningline Level1 Status in Workflow Module

Scenario: User with View and Delete access but no Add or Edit for Runningline Level1 Status
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser10_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Runningline Level1 Status in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Runningline Level1 Status in Workflow Module
And the user should be able to delete Runningline Level1 Status in Workflow Module
And the user should not be able to add Runningline Level1 Status in Workflow Module
And the user should not be able to edit Runningline Level1 Status in Workflow Module

Scenario: User with View and Add access but no Edit or Delete for Runningline Level2 Status
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser1_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Runningline Level2 Status in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Runningline Level2 Status in Workflow Module
And the user should be able to add Runningline Level2 Status in Workflow Module
And the user should not be able to edit Runningline Level2 Status in Workflow Module
And the user should not be able to delete Runningline Level2 Status in Workflow Module

Scenario: User with View and Edit access but no Add or Delete for Runningline Level2 Status
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser3_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Runningline Level2 Status in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Runningline Level2 Status in Workflow Module
And the user should be able to edit Runningline Level2 Status in Workflow Module
And the user should not be able to add Runningline Level2 Status in Workflow Module
And the user should not be able to delete Runningline Level2 Status in Workflow Module

Scenario: User with View and Delete access but no Add or Edit for Runningline Level2 Status
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser4_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Runningline Level2 Status in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Runningline Level2 Status in Workflow Module
And the user should be able to delete Runningline Level2 Status in Workflow Module
And the user should not be able to add Runningline Level2 Status in Workflow Module
And the user should not be able to edit Runningline Level2 Status in Workflow Module

Scenario: User with View and Add access but no Edit or Delete for Incoming Call Types
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser5_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Incoming Call Types in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Incoming Call Types in Workflow Module
And the user should be able to add Incoming Call Types in Workflow Module
And the user should not be able to edit Incoming Call Types in Workflow Module
And the user should not be able to delete Incoming Call Types in Workflow Module

Scenario: User with View and Edit access but no Add or Delete for Incoming Call Types
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser6_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Incoming Call Types in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Incoming Call Types in Workflow Module
And the user should be able to edit Incoming Call Types in Workflow Module
And the user should not be able to add Incoming Call Types in Workflow Module
And the user should not be able to deletes Incoming Call Types in Workflow Module 

Scenario: User with View and Delete access but no Add or Edit for Incoming Call Types
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser7_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Incoming Call Types in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Incoming Call Types in Workflow Module
And the user should be able to delete Incoming Call Types in Workflow Module
And the user should not be able to add Incoming Call Types in Workflow Module
And the user should not be able to edit Incoming Call Types in Workflow Module

Scenario: User with View and Add access but no Edit or Delete for Outgoing Call Types
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser8_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Outgoing Call Types in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Outgoing Call Types in Workflow Module
And the user should be able to add Outgoing Call Types in Workflow Module
And the user should not be able to edit Outgoing Call Types in Workflow Module
And the user should not be able to delete Outgoing Call Types in Workflow Module

Scenario: User with View and Edit access but no Add or Delete for Outgoing Call Types
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser9_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Outgoing Call Types in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Outgoing Call Types in Workflow Module
And the user should be able to edit Outgoing Call Types in Workflow Module
And the user should not be able to add Outgoing Call Types in Workflow Module
And the user should not be able to deletes Outgoing Call Types in Workflow Module 

Scenario: User with View and Delete access but no Add or Edit for Outgoing Call Types
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser10_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Outgoing Call Types in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Outgoing Call Types in Workflow Module
And the user should be able to delete Outgoing Call Types in Workflow Module
And the user should not be able to add Outgoing Call Types in Workflow Module
And the user should not be able to edit Outgoing Call Types in Workflow Module

Scenario: User with View and Add access but no Edit or Delete for Program 340B
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser11_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Program 340B in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Program 340B in Workflow Module
And the user should be able to add Program 340B in Workflow Module
And the user should not be able to edit Program 340B in Workflow Module
And the user should not be able to delete Program 340B in Workflow Module

Scenario: User with View and Edit access but no Add or Delete for Program 340B
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser12_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Program 340B in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Program 340B in Workflow Module
And the user should be able to edit Program 340B in Workflow Module
And the user should not be able to add Program 340B in Workflow Module
And the user should not be able to deletes Program 340B in Workflow Module 

Scenario: User with View and Delete access but no Add or Edit for Program 340B
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser13_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Program 340B in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Program 340B in Workflow Module
And the user should be able to delete Program 340B in Workflow Module
And the user should not be able to add Program 340B in Workflow Module
And the user should not be able to edit Program 340B in Workflow Module

Scenario: User with View and Add access but no Edit or Delete for Prescription Status
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser14_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Prescription Status in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Prescription Status in Workflow Module
And the user should be able to add Prescription Status in Workflow Module
And the user should not be able to edit Prescription Status in Workflow Module
And the user should not be able to delete Prescription Status in Workflow Module

Scenario: User with View and Edit access but no Add or Delete for Prescription Status
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser15_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Prescription Status in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Prescription Status in Workflow Module
And the user should be able to edit Prescription Status in Workflow Module
And the user should not be able to add Prescription Status in Workflow Module
And the user should not be able to delete Prescription Status in Workflow Module

Scenario: User with View and Delete access but no Add or Edit for Prescription Status
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser17_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Prescription Status in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Prescription Status in Workflow Module
And the user should be able to delete Prescription Status in Workflow Module
And the user should not be able to add Prescription Status in Workflow Module
And the user should not be able to edit Prescription Status in Workflow Module

Scenario: User with full access to Sync Workflow
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser1_static@mailinator.com"
And I create a profile with View, Comment, Alert, and Export Excel access to Sync Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Sync Workflow data
And the user should be able to comment in Sync Workflow
And the user should be able to receive alerts in Sync Workflow
And the user should be able to export Sync Workflow data to Excel

Scenario: User with View only access but no Comment, Alert, or Export Excel for Sync Workflow
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser2_static@mailinator.com"
And I create a profile with only View access and no Comment, Alert, or Export Excel access to Sync Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Sync Workflow data
And the user should not be able to comment in Sync Workflow
And the user should not be able to receive alerts in Sync Workflow
And the user should not be able to export Sync Workflow data to Excel

Scenario: User with all permissions in Display Workflow
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser3_static@mailinator.com"
And I create a profile with the all Additional Access permissions for Display Workflow Module:
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Display Workflow data
And the user should be able to see details in Display Workflow
And the user should be able to perform advanced searches in Display Workflow
And the user should be able to add Grid Templates in Display Workflow
And the user should be able to edit Grid Templates in Display Workflow
And the user should be able to delete Grid Templates in Display Workflow
And the user should be able to toggle Show All Runninglines checkbox
And the user should be able to toggle Show Past Runninglines checkbox
And the user should be able to set Grid Template - Company Default checkbox
And the user should have full program access in Display Workflow
And the user should be able to perform Pharmacy NABP searches
And the user should be able to export Display Workflow data to Excel

Scenario: User with View only permission in Display Workflow
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser7_static@mailinator.com"
And I create a profile with only View permission for Display Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Display Workflow data
And the user should not be able to see details in Display Workflow
And the user should not be able to perform advanced searches in Display Workflow
And the user should not be able to add Grid Templates in Display Workflow
And the user should not be able to edit Grid Templates in Display Workflow
And the user should not be able to delete Grid Templates in Display Workflow
And the user should not be able to toggle Show All Runninglines checkbox
And the user should not be able to toggle Show Past Runninglines checkbox
And the user should not be able to set Grid Template - Company Default checkbox
And the user should not have full program access in Display Workflow
And the user should not be able to perform Pharmacy NABP searches
And the user should not be able to export Display Workflow data to Excel

Scenario: User with all permissions in Action Workflow
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "actionuser4_static@mailinator.com"
And I create a profile with the following permissions for Action Workflow Module:
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Action Workflow data
And the user should be able to see details in Action Workflow
And the user should be able to send Text messages in Action Workflow
And the user should be able to perform BOT Calls in Action Workflow
And the user should be able to send Quick Text in Action Workflow
And the user should be able to toggle Show All Runninglines checkbox
And the user should be able to toggle Show Past Runninglines checkbox
And the user should be able to perform advanced searches in Action Workflow
And the user should be able to add Grid Templates in Action Workflow
And the user should be able to edit Grid Templates in Action Workflow
And the user should be able to delete Grid Templates in Action Workflow
And the user should be able to set Grid Template - Company Default checkbox
And the user should have full program access in Action Workflow
And the user should be able to send VCards in Action Workflow
And the user should be able to export Action Workflow data to Excel

Scenario: User with View only permission in Action Workflow
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser7_static@mailinator.com"
And I create a profile with only View permission for Action Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Action Workflow data
And the user should not be able to see details in Action Workflow
And the user should not be able to send Text messages in Action Workflow
And the user should not be able to perform BOT Calls in Action Workflow
And the user should not be able to send Quick Text in Action Workflow
And the user should not be able to toggle Show All Runninglines checkbox
And the user should not be able to toggle Show Past Runninglines checkbox
And the user should not be able to perform advanced searches in Action Workflow
And the user should not be able to add Grid Templates in Action Workflow
And the user should not be able to edit Grid Templates in Action Workflow
And the user should not be able to delete Grid Templates in Action Workflow
And the user should not be able to set Grid Template - Company Default checkbox
And the user should not have full program access in Action Workflow
And the user should not be able to send VCards in Action Workflow
And the user should not be able to export Action Workflow data to Excel

Scenario: User with all permissions in Followup Workflow
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser1_static@mailinator.com"
And I create a profile with the all permissions for Followup Workflow Module:
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Followup Workflow data
And the user should be able to see details in Followup Workflow
And the user should be able to perform Team Actions in Followup Workflow
And the user should be able to toggle Show All Runninglines checkbox
And the user should be able to toggle Show Past Runninglines checkbox
And the user should be able to perform advanced searches in Followup Workflow
And the user should be able to add Grid Templates in Followup Workflow
And the user should be able to edit Grid Templates in Followup Workflow
And the user should be able to delete Grid Templates in Followup Workflow
And the user should be able to set Grid Template - Company Default checkbox
And the user should have full program access in Followup Workflow
And the user should be able to export Followup Workflow data to Excel

Scenario: User with View only permission in Followup Workflow
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser1_static@mailinator.com"
And I create a profile with only View permission for Followup Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Followup Workflow data
And the user should not be able to see details in Followup Workflow
And the user should not be able to perform Team Actions in Followup Workflow
And the user should not be able to toggle Show All Runninglines checkbox
And the user should not be able to toggle Show Past Runninglines checkbox
And the user should not be able to perform advanced searches in Followup Workflow
And the user should not be able to add Grid Templates in Followup Workflow
And the user should not be able to edit Grid Templates in Followup Workflow
And the user should not be able to delete Grid Templates in Followup Workflow
And the user should not be able to set Grid Template - Company Default checkbox
And the user should not have full program access in Followup Workflow
And the user should not be able to export Followup Workflow data to Excel

Scenario: User with all permissions in Audit Workflow
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser4_static@mailinator.com"
And I create a profile with the following permissions for Audit Workflow Module:
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Audit Workflow data
And the user should be able to add and edit HardCopy in Audit Workflow
And the user should be able to delete HardCopy in Audit Workflow
And the user should be able to export Audit Workflow data

Scenario: User with View only permission in Audit Workflow
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser5_static@mailinator.com"
And I create a profile with only View permission for Audit Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Audit Workflow data
And the user should not be able to add or edit HardCopy in Audit Workflow
And the user should not be able to delete HardCopy in Audit Workflow
And the user should not be able to export Audit Workflow data

Scenario: Workflow Dashboard Add Template Validation on Blank Submission
Given I log in as admin for Workflow Module
When I navigate to the Workflow Dashboard
And I click on Add Template
And I leave all required fields blank
And I click Submit
Then I should see validation messages for all required fields
And the template should not be created

Scenario: Workflow Dashboard Quick Text Send Validation on Blank Submission
Given I log in as admin for Workflow Module
When I navigate to the Workflow Dashboard
And I go to Quick Text section
And I leave the message content field blank
And I click Send
Then I should see a validation message indicating the content is required
And the message should not be sent

Scenario: Workflow Dashboard Send VCard Validation on Blank Submission
Given I log in as admin for Workflow Module
When I navigate to the Workflow Dashboard
And I click on Send VCard
And I leave all required fields blank
And I click Send for Send VCard
Then I should see a validation message indicating the required fields must be filled
And the VCard should not be sent

Scenario: Workflow Dashboard Add Communication Validation on Blank Submission
Given I log in as admin for Workflow Module
When I navigate to the Workflow Dashboard
And I click on Add Communication
And I leave all required fields blank
And I click Submit for Add Communication
Then I should see validation messages for all required fields
And the communication should not be created

Scenario: Workflow Dashboard Quick Notes Validation on Blank Submission
Given I log in as admin for Workflow Module
When I navigate to the Workflow Dashboard
And I click on Add Note
And I leave all required fields blank
And I click Save for Quick Notes
Then I should see validation messages for all required fields for Quick Notes
And the note should not be created

Scenario: Action Workflow Page Add Template Validation on Blank Submission
Given I log in as admin for Workflow Module
When I navigate to the Action Workflow page
And I click on Add Template
And I leave all required fields blank
And I click Submit
Then I should see validation messages for all required fields
And the Template should not be created

Scenario: Action Workflow Add Communication Validation on Blank Submission
Given I log in as admin for Workflow Module
When I navigate to the Action Workflow page
And I click on Add Communication
And I leave all required fields blank
And I click Submit for Action workflow Add Communication
Then I should see validation messages for all required fields
And the Communication should not be created

Scenario: Action Workflow Quick Notes Validation on Blank Submission
Given I log in as admin for Workflow Module
When I navigate to the Action Workflow page
And I click on Add Quick
And I leave all required fields blank
And I click Send for Action Workflow Quick Notes
Then I should see validation messages for all required fields
And the action should not be updated

Scenario: Action Workflow Mail to Selected Validation for No Rx Number
Given I log in as admin for Workflow Module
When I navigate to the Action Workflow page
And I select No records using the check box
And I click on Mail to Selected
Then I should see a validation message indicating no record selected please selecct one
And the Mail action should not be performed

Scenario: Action Workflow Fax to Selected Validation for No Rx Number
Given I log in as admin for Workflow Module
When I navigate to the Action Workflow page
And I select No records using the check box
And I click on Fax to Selected
Then I should see a validation message indicating no record selected please select one
And the Fax action should not be performed

Scenario: Action Workflow Text to Selected Validation for No Record Selected
Given I log in as admin for Workflow Module
When I navigate to the Action Workflow page
And I select No records using the check box
And I click on Text to Selected
Then I should see a validation message indicating no record selected please select one
And the Text action should not be performed

Scenario: Action Workflow Callout to Selected Validation for No Record Selected
Given I log in as admin for Workflow Module
When I navigate to the Action Workflow page
And I select No records using the check box
And I click on Callout to Selected
Then I should see a validation message indicating no record selected please select one
And the Callout action should not be performed

Scenario: Quick Text Action Validation for No Record Selected
Given I log in as admin for Workflow Module
When I navigate to the Action Workflow page
And I click on Quick Text
Then I should see a validation message indicating no record is selected, please select one
And the Quick Text action should not be performed

Scenario: Send VCard Action Validation for No Record Selected
Given I log in as admin for Workflow Module
When I navigate to the Action Workflow page
And I click on Send VCard For Action Workflow
Then I should see a validation message indicating no record is selected, please select one
And the Send VCard action should not be performed

Scenario: Timeline Add Action Validation for No Record Selected
Given I log in as admin for Workflow Module
When I navigate to the Sync Workflow page
And I click on Timeline Add Action
Then I should see a validation message indicating no record is selected, please select one
And the Timeline Add action should not be performed

Scenario: Followup Workflow Add Template Validation on Blank Submission
Given I log in as admin for Workflow Module
When I navigate to the Followup Workflow page
And I click on Add Template
And I leave all required fields blank
And I click Submit
Then I should see validation messages for all required fields
And the Followup Workflow template should not be created

Scenario: Followup Workflow Quick Notes Validation on Blank Submission
Given I log in as admin for Workflow Module
When I navigate to the Followup Workflow page
And I click on Add Quick
And I leave all required fields blank
And I click Send for Followup Workflow Quick Notes
Then I should see validation messages for all required fields
And the followup workflow action should not be updated

































































































































































































































































  




  
  

  
  




































































