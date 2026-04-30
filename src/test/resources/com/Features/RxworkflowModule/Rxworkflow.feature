Feature: Entire Rxworkflow Module.

@Rxworkflow
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

# Failure Result Action 30042026
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






























































































































































































































































































































































































































































































































































