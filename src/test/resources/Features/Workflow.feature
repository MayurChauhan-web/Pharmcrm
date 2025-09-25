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

@Workflow
Scenario: User with View and Add access but no Edit or Delete for Incoming Call Types
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser34_static@mailinator.com"
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
When I create a new user with email for Workflow Module "testuser35_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Incoming Call Types in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Incoming Call Types in Workflow Module
And the user should be able to edit Incoming Call Types in Workflow Module
And the user should not be able to add Incoming Call Types in Workflow Module
And the user should not be able to delete Incoming Call Types in Workflow Module

Scenario: User with View and Delete access but no Add or Edit for Incoming Call Types
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser36_static@mailinator.com"
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
When I create a new user with email for Workflow Module "testuser37_static@mailinator.com"
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
When I create a new user with email for Workflow Module "testuser38_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Outgoing Call Types in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Outgoing Call Types in Workflow Module
And the user should be able to edit Outgoing Call Types in Workflow Module
And the user should not be able to add Outgoing Call Types in Workflow Module
And the user should not be able to delete Outgoing Call Types in Workflow Module

Scenario: User with View and Delete access but no Add or Edit for Outgoing Call Types
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser39_static@mailinator.com"
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
When I create a new user with email for Workflow Module "testuser40_static@mailinator.com"
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
When I create a new user with email for Workflow Module "testuser41_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Program 340B in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Program 340B in Workflow Module
And the user should be able to edit Program 340B in Workflow Module
And the user should not be able to add Program 340B in Workflow Module
And the user should not be able to delete Program 340B in Workflow Module

Scenario: User with View and Delete access but no Add or Edit for Program 340B
Given I log in as admin for Workflow Module
When I create a new user with email for Workflow Module "testuser42_static@mailinator.com"
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
When I create a new user with email for Workflow Module "testuser43_static@mailinator.com"
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
When I create a new user with email for Workflow Module "testuser44_static@mailinator.com"
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
When I create a new user with email for Workflow Module "testuser45_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Prescription Status in Workflow Module
And I assign the profile and workspace to the user for Workflow Module
And I reset the user's password for Workflow Module
And I log in using the new user for Workflow Module
Then the user should be able to view Prescription Status in Workflow Module
And the user should be able to delete Prescription Status in Workflow Module
And the user should not be able to add Prescription Status in Workflow Module
And the user should not be able to edit Prescription Status in Workflow Module
































  




  
  

  
  




































































