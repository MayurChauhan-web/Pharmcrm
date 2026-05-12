Feature: Entire Rxworkflow Module.

# General
Scenario: User with View only access for Rxworkflow Module General Audit View
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View access only to Rxworkflow Module General Audit View test
Then the user should be able to view Rxworkflow Module General Audit View test

Scenario: User with No access for General (Audit View)
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with No access to Workflow Module General Audit View test  
Then the user should not be able to view General Audit View settings in Workflow Module test

# Sync Workflow Settings
Scenario: User with View and Add access but no Edit or Delete for Sync Workflow Settings
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Add access but no Edit or Delete access to Sync Workflow Settings in Workflow Module test
Then the user should be able to view Sync Workflow Settings in Workflow Module test
And the user should be able to add Sync Workflow Settings in Workflow Module test
And the user should not be able to edit Sync Workflow Settings in Workflow Module test
And the user should not be able to delete Sync Workflow Settings in Workflow Module test

Scenario: User with View and Edit access but no Add or Delete for Sync Workflow Settings
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Edit access but no Add or Delete access to Sync Workflow Settings in Workflow Module test
Then the user should be able to view Sync Workflow Settings in Workflow Module test
And the user should be able to edit Sync Workflow Settings in Workflow Module test
And the user should not be able to add Sync Workflow Settings in Workflow Module test
And the user should not be able to delete Sync Workflow Settings in Workflow Module test

Scenario: User with View and Delete access but no Add or Edit for Sync Workflow Settings
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Delete access but no Add or Edit access to Sync Workflow Settings in Workflow Module test
Then the user should be able to view Sync Workflow Settings in Workflow Module test
And the user should be able to delete Sync Workflow Settings in Workflow Module test
And the user should not be able to add Sync Workflow Settings in Workflow Module test
And the user should not be able to edit Sync Workflow Settings in Workflow Module test

# Medication SyncReminder Color Code
Scenario: User with View and Add access but no Edit or Delete for Medication Sync Reminder Color Code
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Add access but no Edit or Delete access to Medication Sync Reminder Color Code in Workflow Module test
Then the user should be able to view Medication Sync Reminder Color Code in Workflow Module test
And the user should be able to add Medication Sync Reminder Color Code in Workflow Module test
And the user should not be able to edit Medication Sync Reminder Color Code in Workflow Module test
And the user should not be able to delete Medication Sync Reminder Color Code in Workflow Module test

Scenario: User with View and Edit access but no Add or Delete for Medication Sync Reminder Color Code
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Edit access but no Add or Delete access to Medication Sync Reminder Color Code in Workflow Module test
Then the user should be able to view Medication Sync Reminder Color Code in Workflow Module test
And the user should be able to edit Medication Sync Reminder Color Code in Workflow Module test
And the user should not be able to add Medication Sync Reminder Color Code in Workflow Module test
And the user should not be able to delete Medication Sync Reminder Color Code in Workflow Module test

Scenario: User with View and Delete access but no Add or Edit for Medication Sync Reminder Color Code
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Delete access but no Add or Edit access to Medication Sync Reminder Color Code in Workflow Module test
Then the user should be able to view Medication Sync Reminder Color Code in Workflow Module test
And the user should be able to delete Medication Sync Reminder Color Code in Workflow Module test
And the user should not be able to add Medication Sync Reminder Color Code in Workflow Module test
And the user should not be able to edit Medication Sync Reminder Color Code in Workflow Module test

# Reminder Result Action
Scenario: User with View and Add access but no Edit or Delete for Reminder Result Action
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Add access but no Edit or Delete access to Reminder Result Action in Workflow Module test
Then the user should be able to view Reminder Result Action in Workflow Module test
And the user should be able to add Reminder Result Action in Workflow Module test
And the user should not be able to edit Reminder Result Action in Workflow Module test
And the user should not be able to delete Reminder Result Action in Workflow Module test

Scenario: User with View and Edit access but no Add or Delete for Reminder Result Action
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Edit access but no Add or Delete access to Reminder Result Action in Workflow Module test
Then the user should be able to view Reminder Result Action in Workflow Module test
And the user should be able to edit Reminder Result Action in Workflow Module test
And the user should not be able to add Reminder Result Action in Workflow Module test
And the user should not be able to delete Reminder Result Action in Workflow Module test

Scenario: User with View and Delete access but no Add or Edit for Reminder Result Action
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Delete access but no Add or Edit access to Reminder Result Action in Workflow Module test
Then the user should be able to view Reminder Result Action in Workflow Module test
And the user should be able to delete Reminder Result Action in Workflow Module test
And the user should not be able to add Reminder Result Action in Workflow Module test
And the user should not be able to edit Reminder Result Action in Workflow Module test

# Success Result Action
Scenario: User with View and Add access but no Edit or Delete for Success Result Action
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Add access but no Edit or Delete access to Success Result Action in Workflow Module test
Then the user should be able to view Success Result Action in Workflow Module test
And the user should be able to add Success Result Action in Workflow Module test
And the user should not be able to edit Success Result Action in Workflow Module test
And the user should not be able to delete Success Result Action in Workflow Module test

Scenario: User with View and Edit access but no Add or Delete for Success Result Action
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Edit access but no Add or Delete access to Success Result Action in Workflow Module test
Then the user should be able to view Success Result Action in Workflow Module test
And the user should be able to edit Success Result Action in Workflow Module test
And the user should not be able to add Success Result Action in Workflow Module test
And the user should not be able to delete Success Result Action in Workflow Module test

Scenario: User with View and Delete access but no Add or Edit for Success Result Action
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Delete access but no Add or Edit access to Success Result Action in Workflow Module test
Then the user should be able to view Success Result Action in Workflow Module test
And the user should be able to delete Success Result Action in Workflow Module test
And the user should not be able to add Success Result Action in Workflow Module test
And the user should not be able to edit Success Result Action in Workflow Module test

# Failure Result Action 
Scenario: User with View and Add access but no Edit or Delete for Failure Result Action
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Add access but no Edit or Delete access to Failure Result Action in Workflow Module test
Then the user should be able to view Failure Result Action in Workflow Module test
And the user should be able to add Failure Result Action in Workflow Module test
And the user should not be able to edit Failure Result Action in Workflow Module test
And the user should not be able to delete Failure Result Action in Workflow Module test

Scenario: User with View and Edit access but no Add or Delete for Failure Result Action
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Edit access but no Add or Delete access to Failure Result Action in Workflow Module test
Then the user should be able to view Failure Result Action in Workflow Module test
And the user should be able to edit Failure Result Action in Workflow Module test
And the user should not be able to add Failure Result Action in Workflow Module test
And the user should not be able to delete Failure Result Action in Workflow Module test

Scenario: User with View and Delete access but no Add or Edit for Failure Result Action
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Delete access but no Add or Edit access to Failure Result Action in Workflow Module test
Then the user should be able to view Failure Result Action in Workflow Module test
And the user should be able to delete Failure Result Action in Workflow Module test
And the user should not be able to add Failure Result Action in Workflow Module test
And the user should not be able to edit Failure Result Action in Workflow Module test

# Transfer Result Action
Scenario: User with View and Add access but no Edit or Delete for Transfer Result Action
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Add access but no Edit or Delete access to Transfer Result Action in Workflow Module test
Then the user should be able to view Transfer Result Action in Workflow Module test
And the user should be able to add Transfer Result Action in Workflow Module test
And the user should not be able to edit Transfer Result Action in Workflow Module test
And the user should not be able to delete Transfer Result Action in Workflow Module test

Scenario: User with View and Edit access but no Add or Delete for Transfer Result Action
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Edit access but no Add or Delete access to Transfer Result Action in Workflow Module test
Then the user should be able to view Transfer Result Action in Workflow Module test
And the user should be able to edit Transfer Result Action in Workflow Module test
And the user should not be able to add Transfer Result Action in Workflow Module test
And the user should not be able to delete Transfer Result Action in Workflow Module test

Scenario: User with View and Delete access but no Add or Edit for Transfer Result Action
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Delete access but no Add or Edit access to Transfer Result Action in Workflow Module test
Then the user should be able to view Transfer Result Action in Workflow Module test
And the user should be able to delete Transfer Result Action in Workflow Module test
And the user should not be able to add Transfer Result Action in Workflow Module test
And the user should not be able to edit Transfer Result Action in Workflow Module test

# Followup Trail Script
Scenario: User with View and Add access but no Edit or Delete for Followup Trail Script
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Add access but no Edit or Delete access to Followup Trail Script in Workflow Module test
Then the user should be able to view Followup Trail Script in Workflow Module test
And the user should be able to add Followup Trail Script in Workflow Module test
And the user should not be able to edit Followup Trail Script in Workflow Module test
And the user should not be able to delete Followup Trail Script in Workflow Module test

Scenario: User with View and Edit access but no Add or Delete for Followup Trail Script
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Edit access but no Add or Delete access to Followup Trail Script in Workflow Module test
Then the user should be able to view Followup Trail Script in Workflow Module test
And the user should be able to edit Followup Trail Script in Workflow Module test
And the user should not be able to add Followup Trail Script in Workflow Module test
And the user should not be able to delete Followup Trail Script in Workflow Module test

Scenario: User with View and Delete access but no Add or Edit for Followup Trail Script
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Delete access but no Add or Edit access to Followup Trail Script in Workflow Module test
Then the user should be able to view Followup Trail Script in Workflow Module test
And the user should be able to delete Followup Trail Script in Workflow Module test
And the user should not be able to add Followup Trail Script in Workflow Module test
And the user should not be able to edit Followup Trail Script in Workflow Module test

# Queue
Scenario: User with View and Add access but no Edit or Delete for Queue
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Add access but no Edit or Delete access to Queue in Workflow Module test
Then the user should be able to view Queue in Workflow Module test
And the user should be able to add Queue in Workflow Module test
And the user should not be able to edit Queue in Workflow Module test
And the user should not be able to delete Queue in Workflow Module test

Scenario: User with View and Edit access but no Add or Delete for Queue
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Edit access but no Add or Delete access to Queue in Workflow Module test
Then the user should be able to view Queue in Workflow Module test 
And the user should be able to edit Queue in Workflow Module test
And the user should not be able to add Queue in Workflow Module test
And the user should not be able to delete Queue in Workflow Module test

Scenario: User with View and Delete access but no Add or Edit for Queue
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Delete access but no Add or Edit access to Queue in Workflow Module test
Then the user should be able to view Queue in Workflow Module test
And the user should be able to delete Queue in Workflow Module test
And the user should not be able to add Queue in Workflow Module test
And the user should not be able to edit Queue in Workflow Module test

# Runningline Status
Scenario: User with View and Add access but no Edit or Delete for Runningline Status
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Add access but no Edit or Delete access to Runningline Status in Workflow Module test
Then the user should be able to view Runningline Status in Workflow Module test
And the user should be able to add Runningline Status in Workflow Module test
And the user should not be able to edit Runningline Status in Workflow Module test
And the user should not be able to delete Runningline Status in Workflow Module test

Scenario: User with View and Edit access but no Add or Delete for Runningline Status
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Edit access but no Add or Delete access to Runningline Status in Workflow Module test
Then the user should be able to view Runningline Status in Workflow Module test
And the user should be able to edit Runningline Status in Workflow Module test
And the user should not be able to add Runningline Status in Workflow Module test
And the user should not be able to delete Runningline Status in Workflow Module test

Scenario: User with View and Delete access but no Add or Edit for Runningline Status
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Delete access but no Add or Edit access to Runningline Status in Workflow Module test
Then the user should be able to view Runningline Status in Workflow Module test
And the user should be able to delete Runningline Status in Workflow Module test
And the user should not be able to add Runningline Status in Workflow Module test
And the user should not be able to edit Runningline Status in Workflow Module test

# Runningline Level1 Status
Scenario: User with View and Add access but no Edit or Delete for Runningline Level1 Status
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Add access but no Edit or Delete access to Runningline Level1 Status in Workflow Module test
Then the user should be able to view Runningline Level1 Status in Workflow Module test
And the user should be able to add Runningline Level1 Status in Workflow Module test
And the user should not be able to edit Runningline Level1 Status in Workflow Module test
And the user should not be able to delete Runningline Level1 Status in Workflow Module test

Scenario: User with View and Edit access but no Add or Delete for Runningline Level1 Status
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Edit access but no Add or Delete access to Runningline Level1 Status in Workflow Module test
Then the user should be able to view Runningline Level1 Status in Workflow Module test
And the user should be able to edit Runningline Level1 Status in Workflow Module test
And the user should not be able to add Runningline Level1 Status in Workflow Module test
And the user should not be able to delete Runningline Level1 Status in Workflow Module test

Scenario: User with View and Delete access but no Add or Edit for Runningline Level1 Status
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Delete access but no Add or Edit access to Runningline Level1 Status in Workflow Module test
Then the user should be able to view Runningline Level1 Status in Workflow Module test
And the user should be able to delete Runningline Level1 Status in Workflow Module test
And the user should not be able to add Runningline Level1 Status in Workflow Module test
And the user should not be able to edit Runningline Level1 Status in Workflow Module test

# Runningline Level2 Status
Scenario: User with View and Add access but no Edit or Delete for Runningline Level2 Status
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Add access but no Edit or Delete access to Runningline Level2 Status in Workflow Module test
Then the user should be able to view Runningline Level2 Status in Workflow Module test
And the user should be able to add Runningline Level2 Status in Workflow Module test
And the user should not be able to edit Runningline Level2 Status in Workflow Module test
And the user should not be able to delete Runningline Level2 Status in Workflow Module test

Scenario: User with View and Edit access but no Add or Delete for Runningline Level2 Status
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Edit access but no Add or Delete access to Runningline Level2 Status in Workflow Module test
Then the user should be able to view Runningline Level2 Status in Workflow Module test
And the user should be able to edit Runningline Level2 Status in Workflow Module test
And the user should not be able to add Runningline Level2 Status in Workflow Module test
And the user should not be able to delete Runningline Level2 Status in Workflow Module test

Scenario: User with View and Delete access but no Add or Edit for Runningline Level2 Status
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Delete access but no Add or Edit access to Runningline Level2 Status in Workflow Module test
Then the user should be able to view Runningline Level2 Status in Workflow Module test
And the user should be able to delete Runningline Level2 Status in Workflow Module test
And the user should not be able to add Runningline Level2 Status in Workflow Module test
And the user should not be able to edit Runningline Level2 Status in Workflow Module test

# Incoming Call Types
Scenario: User with View and Add access but no Edit or Delete for Incoming Call Types
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Add access but no Edit or Delete access to Incoming Call Types in Workflow Module test
Then the user should be able to view Incoming Call Types in Workflow Module test
And the user should be able to add Incoming Call Types in Workflow Module test
And the user should not be able to edit Incoming Call Types in Workflow Module test
And the user should not be able to delete Incoming Call Types in Workflow Module test

Scenario: User with View and Edit access but no Add or Delete for Incoming Call Types
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Edit access but no Add or Delete access to Incoming Call Types in Workflow Module test
Then the user should be able to view Incoming Call Types in Workflow Module test
And the user should be able to edit Incoming Call Types in Workflow Module test
And the user should not be able to add Incoming Call Types in Workflow Module test
And the user should not be able to delete Incoming Call Types in Workflow Module test

Scenario: User with View and Delete access but no Add or Edit for Incoming Call Types
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Delete access but no Add or Edit access to Incoming Call Types in Workflow Module test
Then the user should be able to view Incoming Call Types in Workflow Module test
And the user should be able to delete Incoming Call Types in Workflow Module test
And the user should not be able to add Incoming Call Types in Workflow Module test
And the user should not be able to edit Incoming Call Types in Workflow Module test

# Outgoing Call Types
Scenario: User with View and Add access but no Edit or Delete for Outgoing Call Types
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Add access but no Edit or Delete access to Outgoing Call Types in Workflow Module test
Then the user should be able to view Outgoing Call Types in Workflow Module test
And the user should be able to add Outgoing Call Types in Workflow Module test
And the user should not be able to edit Outgoing Call Types in Workflow Module test
And the user should not be able to delete Outgoing Call Types in Workflow Module test

Scenario: User with View and Edit access but no Add or Delete for Outgoing Call Types
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Edit access but no Add or Delete access to Outgoing Call Types in Workflow Module test
Then the user should be able to view Outgoing Call Types in Workflow Module test
And the user should be able to edit Outgoing Call Types in Workflow Module test
And the user should not be able to add Outgoing Call Types in Workflow Module test
And the user should not be able to deletes Outgoing Call Types in Workflow Module test

Scenario: User with View and Delete access but no Add or Edit for Outgoing Call Types
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Delete access but no Add or Edit access to Outgoing Call Types in Workflow Module test
Then the user should be able to view Outgoing Call Types in Workflow Module test 
And the user should be able to delete Outgoing Call Types in Workflow Module test
And the user should not be able to add Outgoing Call Types in Workflow Module test
And the user should not be able to edit Outgoing Call Types in Workflow Module test

# Program 340B
Scenario: User with View and Add access but no Edit or Delete for Program 340B
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Add access but no Edit or Delete access to Program 340B in Workflow Module test
Then the user should be able to view Program 340B in Workflow Module test
And the user should be able to add Program 340B in Workflow Module test
And the user should not be able to edit Program 340B in Workflow Module test
And the user should not be able to delete Program 340B in Workflow Module test

Scenario: User with View and Edit access but no Add or Delete for Program 340B
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Edit access but no Add or Delete access to Program 340B in Workflow Module test
Then the user should be able to view Program 340B in Workflow Module test
And the user should be able to edit Program 340B in Workflow Module test
And the user should not be able to add Program 340B in Workflow Module test
And the user should not be able to delete Program 340B in Workflow Module test

Scenario: User with View and Delete access but no Add or Edit for Program 340B
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Delete access but no Add or Edit access to Program 340B in Workflow Module test
Then the user should be able to view Program 340B in Workflow Module test
And the user should be able to delete Program 340B in Workflow Module test
And the user should not be able to add Program 340B in Workflow Module test
And the user should not be able to edit Program 340B in Workflow Module test

# Prescription Status
Scenario: User with View and Add access but no Edit or Delete for Prescription Status
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Add access but no Edit or Delete access to Prescription Status in Workflow Module test
Then the user should be able to view Prescription Status in Workflow Module test
And the user should be able to add Prescription Status in Workflow Module test
And the user should not be able to edit Prescription Status in Workflow Module test
And the user should not be able to delete Prescription Status in Workflow Module test

Scenario: User with View and Edit access but no Add or Delete for Prescription Status
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Edit access but no Add or Delete access to Prescription Status in Workflow Module test
Then the user should be able to view Prescription Status in Workflow Module test
And the user should be able to edit Prescription Status in Workflow Module test
And the user should not be able to add Prescription Status in Workflow Module test
And the user should not be able to delete Prescription Status in Workflow Module test

Scenario: User with View and Delete access but no Add or Edit for Prescription Status
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Delete access but no Add or Edit access to Prescription Status in Workflow Module test
Then the user should be able to view Prescription Status in Workflow Module test
And the user should be able to delete Prescription Status in Workflow Module test
And the user should not be able to add Prescription Status in Workflow Module test
And the user should not be able to edit Prescription Status in Workflow Module test

# Sync Workflow
Scenario: User with full access to Sync Workflow
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View, Comment, Alert, and Export Excel access to Sync Workflow Module test
Then the user should be able to view Sync Workflow data test
And the user should be able to comment in Sync Workflow test
And the user should be able to receive alerts in Sync Workflow test
And the user should be able to export Sync Workflow data to Excel test

Scenario: User with View only access but no Comment, Alert, or Export Excel for Sync Workflow
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with only View access and no Comment, Alert, or Export Excel access to Sync Workflow Module test
Then the user should be able to view Sync Workflow data test
And the user should not be able to comment in Sync Workflow test
And the user should not be able to receive alerts in Sync Workflow test
And the user should not be able to export Sync Workflow data to Excel test

# Display Work Flow
Scenario: User with all permissions in Display Workflow
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with the all Additional Access permissions for Display Workflow Module test
Then the user should be able to view Display Workflow data test
And the user should be able to see details in Display Workflow test
And the user should be able to perform advanced searches in Display Workflow test
And the user should be able to add Grid Templates in Display Workflow test
And the user should be able to edit Grid Templates in Display Workflow test
And the user should be able to delete Grid Templates in Display Workflow test
And the user should be able to toggle Show All Runninglines checkbox test
And the user should be able to toggle Show Past Runninglines checkbox test
And the user should be able to set Grid Template - Company Default checkbox test
And the user should have full program access in Display Workflow test
And the user should be able to perform Pharmacy NABP searches test
And the user should be able to export Display Workflow data to Excel test

Scenario: User with View only permission in Display Workflow
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with only View permission for Display Workflow Module test
Then the user should be able to view Display Workflow data test
And the user should not be able to see details in Display Workflow test
And the user should not be able to perform advanced searches in Display Workflow test
And the user should not be able to add Grid Templates in Display Workflow test
And the user should not be able to edit Grid Templates in Display Workflow test
And the user should not be able to delete Grid Templates in Display Workflow test
And the user should not be able to toggle Show All Runninglines checkbox test
And the user should not be able to toggle Show Past Runninglines checkbox test
And the user should not be able to set Grid Template - Company Default checkbox test
And the user should not have full program access in Display Workflow test
And the user should not be able to perform Pharmacy NABP searches test
And the user should not be able to export Display Workflow data to Excel test

# Action Work Flow
Scenario: User with all permissions in Action Workflow
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with the following permissions for Action Workflow Module test
Then the user should be able to view Action Workflow data test
And the user should be able to see details in Action Workflow test
And the user should be able to send Text messages in Action Workflow test
And the user should be able to perform BOT Calls in Action Workflow test
And the user should be able to send Quick Text in Action Workflow test
And the user should be able to toggle Show All Runninglines checkbox Action Work Flow test
And the user should be able to toggle Show Past Runninglines checkbox Action Work Flow test
And the user should be able to perform advanced searches in Action Workflow test
And the user should be able to add Grid Templates in Action Workflow test
And the user should be able to edit Grid Templates in Action Workflow test
And the user should be able to delete Grid Templates in Action Workflow test
And the user should be able to set Grid Template Company Default checkbox test
And the user should have full program access in Action Workflow test
And the user should be able to send VCards in Action Workflow test
And the user should be able to export Action Workflow data to Excel test

Scenario: User with View only permission in Action Workflow
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with only View permission for Action Workflow Module test
Then the user should be able to view Action Workflow data test
And the user should not be able to see details in Action Workflow test
And the user should not be able to send Text messages in Action Workflow test
And the user should not be able to perform BOT Calls in Action Workflow test
And the user should not be able to send Quick Text in Action Workflow test
And the user should not be able to toggle Show All Runninglines checkbox Action Work Flow test
And the user should not be able to toggle Show Past Runninglines checkbox Action Work Flow test
And the user should not be able to perform advanced searches in Action Workflow test
And the user should not be able to add Grid Templates in Action Workflow test
And the user should not be able to edit Grid Templates in Action Workflow test
And the user should not be able to delete Grid Templates in Action Workflow test
And the user should not be able to set Grid Template Company Default checkbox Action Work Flow test
And the user should not have full program access in Action Workflow test
And the user should not be able to send VCards in Action Workflow test
And the user should not be able to export Action Workflow data to Excel test

# Followup Work Flow
Scenario: User with all permissions in Followup Workflow
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with the all permissions for Followup Workflow Module test
Then the user should be able to view Followup Workflow data test
And the user should be able to see details in Followup Workflow test
And the user should be able to perform Team Actions in Followup Workflow test
And the user should be able to toggle Show All Runninglines checkbox Followup Work Flow test
And the user should be able to toggle Show Past Runninglines checkbox Followup Work Flow test
And the user should be able to perform advanced searches in Followup Workflow test
And the user should be able to add Grid Templates in Followup Workflow test
And the user should be able to edit Grid Templates in Followup Workflow test
And the user should be able to delete Grid Templates in Followup Workflow test
And the user should be able to set Grid Template Company Default checkbox Followup Work Flow test
And the user should have full program access in Followup Workflow test
And the user should be able to export Followup Workflow data to Excel test

Scenario: User with View only permission in Followup Workflow
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with only View permission for Followup Workflow Module test
Then the user should be able to view Followup Workflow data test
And the user should not be able to see details in Followup Workflow test
And the user should not be able to perform Team Actions in Followup Workflow test
And the user should not be able to toggle Show All Runninglines checkbox Followup Work Flow test
And the user should not be able to toggle Show Past Runninglines checkbox Followup Work Flow test
And the user should not be able to perform advanced searches in Followup Workflow test
And the user should not be able to add Grid Templates in Followup Workflow test
And the user should not be able to edit Grid Templates in Followup Workflow test
And the user should not be able to delete Grid Templates in Followup Workflow test
And the user should not be able to set Grid Template Company Default checkbox Followup Work Flow test
And the user should not have full program access in Followup Workflow test
And the user should not be able to export Followup Workflow data to Excel test

# Audit Work Flow
Scenario: User with all permissions in Audit Workflow
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with the following permissions for Audit Workflow Module test
Then the user should be able to view Audit Workflow data test
And the user should be able to add and edit HardCopy in Audit Workflow test
And the user should be able to delete HardCopy in Audit Workflow test
And the user should be able to export Audit Workflow data test

Scenario: User with View only permission in Audit Workflow
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with only View permission for Audit Workflow Module test
Then the user should be able to view Audit Workflow data test
And the user should not be able to add or edit HardCopy in Audit Workflow test
And the user should not be able to delete HardCopy in Audit Workflow test
And the user should not be able to export Audit Workflow data test

# Medication Activity
Scenario: User with View only permission Medication Activity
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with only View permission for Medication Activity
Then the user should be able to view Medication Activity
And the user should not be able to add Medication Activity

Scenario: User with View and Add permission Medication Activity
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View and Add permission for Medication Activity
Then the user should be able to view and Add Medication Activity

# Control Audit Class
Scenario: User with all permissions in Control Audit Class1
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with all permissions for Control Audit Class1 
Then the user should be able to view Control Audit Class1
And the user should be able to open Details View in Control Audit Class1
And the user should be able to perform Drug Dispense Credit Add action in Control Audit Class1
And the user should be able to perform Drug Dispense Audit Add action in Control Audit Class1
And the user should be able to perform Drug Audit Dispense Date Update in Control Audit Class1
And the user should be able to perform Drug Audit Dispense Quantity Update in Control Audit Class1
And the user should be able to Export Control Audit Class1 data to Excel
And the user should be able to Export Control Audit Class1 data to PDF

Scenario: User with View Only permission in Control Audit Class1
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View Only permission for Control Audit Class1
Then the user should be able to view Control Audit Class1
And the user should be able to open Details View in Control Audit Class1
And the user should NOT be able to perform Drug Dispense Credit Add action in Control Audit Class1
And the user should NOT be able to perform Drug Dispense Audit Add action in Control Audit Class1
And the user should NOT be able to perform Drug Audit Dispense Date Update in Control Audit Class1
And the user should NOT be able to perform Drug Audit Dispense Quantity Update in Control Audit Class1
And the user should NOT be able to Export Control Audit Class1 data to Excel
And the user should NOT be able to Export Control Audit Class1 data to PDF

Scenario: User with all permissions in Control Audit Class2
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with all permissions for Control Audit Class2
Then the user should be able to view Control Audit Class2 data
And the user should be able to open Details View in Control Audit Class2
And the user should be able to perform Drug Dispense Credit Add action in Control Audit Class2
And the user should be able to perform Drug Dispense Audit Add action in Control Audit Class2
And the user should be able to perform Drug Audit Dispense Date Update in Control Audit Class2
And the user should be able to perform Drug Audit Dispense Quantity Update in Control Audit Class2
And the user should be able to Export Control Audit Class2 data to Excel
And the user should be able to Export Control Audit Class2 data to PDF

Scenario: User with View Only permission in Control Audit Class2
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View Only permission for Control Audit Class2
Then the user should be able to view Control Audit Class2 data
And the user should be able to open Details View in Control Audit Class2
And the user should NOT be able to perform Drug Dispense Credit Add action in Control Audit Class2
And the user should NOT be able to perform Drug Dispense Audit Add action in Control Audit Class2
And the user should NOT be able to perform Drug Audit Dispense Date Update in Control Audit Class2
And the user should NOT be able to perform Drug Audit Dispense Quantity Update in Control Audit Class2
And the user should NOT be able to Export Control Audit Class2 data to Excel
And the user should NOT be able to Export Control Audit Class2 data to PDF

Scenario: User with all permissions in Control Audit Class3
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with all permissions for Control Audit Class3
Then the user should be able to view Control Audit Class3
And the user should be able to open Details View in Control Audit Class3
And the user should be able to perform Drug Dispense Credit Add action in Control Audit Class3
And the user should be able to perform Drug Dispense Audit Add action in Control Audit Class3
And the user should be able to perform Drug Audit Dispense Date Update in Control Audit Class3
And the user should be able to perform Drug Audit Dispense Quantity Update in Control Audit Class3
And the user should be able to Export Control Audit Class3 data to Excel
And the user should be able to Export Control Audit Class3 data to PDF

Scenario: User with View Only permission in Control Audit Class3
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View Only permission for Control Audit Class3 module
Then the user should be able to view Control Audit Class3
And the user should be able to open Details View in Control Audit Class3
And the user should NOT be able to perform Drug Dispense Credit Add action in Control Audit Class3
And the user should NOT be able to perform Drug Dispense Audit Add action in Control Audit Class3
And the user should NOT be able to perform Drug Audit Dispense Date Update in Control Audit Class3
And the user should NOT be able to perform Drug Audit Dispense Quantity Update in Control Audit Class3
And the user should NOT be able to Export Control Audit Class3 data to Excel
And the user should NOT be able to Export Control Audit Class3 data to PDF

Scenario: User with all permissions in Control Audit Class4
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with all permissions for Control Audit Class4
Then the user should be able to view Control Audit Class4 data
And the user should be able to open Details View in Control Audit Class4
And the user should be able to perform Drug Dispense Credit Add action in Control Audit Class4
And the user should be able to perform Drug Dispense Audit Add action in Control Audit Class4
And the user should be able to perform Drug Audit Dispense Date Update in Control Audit Class4
And the user should be able to perform Drug Audit Dispense Quantity Update in Control Audit Class4
And the user should be able to Export Control Audit Class4 data to Excel
And the user should be able to Export Control Audit Class4 data to PDF

Scenario: User with View Only permission in Control Audit Class4
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View Only permission for Control Audit Class4
Then the user should be able to view Control Audit Class4 data
And the user should be able to open Details View in Control Audit Class4
And the user should NOT be able to perform Drug Dispense Credit Add action in Control Audit Class4
And the user should NOT be able to perform Drug Dispense Audit Add action in Control Audit Class4
And the user should NOT be able to perform Drug Audit Dispense Date Update in Control Audit Class4
And the user should NOT be able to perform Drug Audit Dispense Quantity Update in Control Audit Class4
And the user should NOT be able to Export Control Audit Class4 data to Excel
And the user should NOT be able to Export Control Audit Class4 data to PDF

Scenario: User with all permissions in Control Audit Class5
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with all permissions for Control Audit Class5
Then the user should be able to view Control Audit Class5 data
And the user should be able to open Details View in Control Audit Class5
And the user should be able to perform Drug Dispense Credit Add action in Control Audit Class5
And the user should be able to perform Drug Dispense Audit Add action in Control Audit Class5
And the user should be able to perform Drug Audit Dispense Date Update in Control Audit Class5
And the user should be able to perform Drug Audit Dispense Quantity Update in Control Audit Class5
And the user should be able to Export Control Audit Class5 data to Excel
And the user should be able to Export Control Audit Class5 data to PDF

Scenario: User with View Only permission in Control Audit Class5
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Rxworkflow user should be able to view Profiles
And I create a profile with View Only permission for Control Audit Class5
Then the user should be able to view Control Audit Class5 data
And the user should be able to open Details View in Control Audit Class5
And the user should NOT be able to perform Drug Dispense Credit Add action in Control Audit Class5
And the user should NOT be able to perform Drug Dispense Audit Add action in Control Audit Class5
And the user should NOT be able to perform Drug Audit Dispense Date Update in Control Audit Class5
And the user should NOT be able to perform Drug Audit Dispense Quantity Update in Control Audit Class5
And the user should NOT be able to Export Control Audit Class5 data to Excel
And the user should NOT be able to Export Control Audit Class5 data to PDF

# Dashboard
Scenario: Workflow Dashboard Add Template Validation on Blank Submission
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
When I navigate to the Workflow Dashboard test
And I click on Add Template test
And I leave all required fields blank test
And I click Submit test
Then I should see validation messages for all required fields test
And the template should not be created test

























































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































