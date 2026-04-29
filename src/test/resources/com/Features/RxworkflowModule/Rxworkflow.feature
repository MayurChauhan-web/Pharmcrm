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









































































































































