Feature: Entire Clinical workflow Module.

@Clinicalworkflow
# General
Scenario: User with View only access for Clinical workflow Module General Audit View
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinicalworkflow user should be able to view Profiles
And I create a profile with View access only to Clinicalworkflow Module General Audit View test
Then the user should be able to view Clinicalworkflow Module General Audit View test

Scenario: User with No access for General Audit View test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinicalworkflow user should be able to view Profiles
And I create a profile with no access to Clinicalworkflow Module General Audit View test
Then the user should not able to view Clinicalworkflow Module General Audit View test

# Dashboard
Scenario: Full Dashboard Access with All Permissions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinicalworkflow user should be able to view Profiles
And I create a profile Full Dashboard Access with All Permissions
Then the user should be able to view Dashboard
Then the user should be able to Mail
Then the user should be able to Text
Then the user should be able to BOT Call
Then the user should be able to Export To Excel
Then the user should be able to All Communication View
Then the user should be able to Update Appointment Action

Scenario: Dashboard Access with View Permission Only
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinicalworkflow user should be able to view Profiles
And I create a profile View Only Access
Then the user should be able to view Dashboard
Then the user should not be able to send Mail
Then the user should not be able to send Text
Then the user should not be able to initiate BOT Call
Then the user should not be able to Export To Excel
Then the user should not be able to All Communication View
Then the user should not be able to Update Appointment Action

# Action Work Flow
Scenario: Full Action Work Flow Access with All Permissions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinicalworkflow user should be able to view Profiles
And I create a profile Full Action Work Flow Access with All Permissions
Then the user should be able to view Action Work Flow
Then the user should be able to Action Work Flow Mail
Then the user should be able to Fax
Then the user should be able to Action Work Flow Text
Then the user should be able to Action Work Flow BOT Call
Then the user should be able to Quick Text
Then the user should be able to Show All Runninglines Checkbox
Then the user should be able to Show Past Runninglines Checkbox
Then the user should be able to Grid Template Add
Then the user should be able to Grid Template Edit
Then the user should be able to Grid Template Delete
Then the user should be able to Grid Template - Company Default Checkbox
Then the user should be able to Send VCard
Then the user should be able to Action Work Flow Export To Excel

Scenario: Full Action Work Flow Access with view only Access
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinicalworkflow user should be able to view Profiles
And I create a profile with view only Access
Then the user should be able to view Action Work Flow
Then the user should not be able to Send Mail, Fax, Text, BOT Call
Then the user should not be able to Quick Text
Then the user should not be able to Show All Runninglines Checkbox
Then the user should not be able to Show Past Runninglines Checkbox
Then the user should not be able to Grid Template Add
Then the user should not be able to Grid Template Edit
Then the user should not be able to Grid Template Delete
Then the user should not be able to Grid Template Company Default Checkbox
Then the user should not be able to Send VCard
Then the user should not be able to Action Work Flow Export To Excel

# Appointment Outreach
Scenario: Appointment Outreach Access with All Permissions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinicalworkflow user should be able to view Profiles
And I create a profile Full Appointment Outreach Access with All Permissions
Then the user should be able to view Appointment Outreach
Then the user should be able to Appointment Outreach Mail
Then the user should be able to Appointment Outreach Fax
Then the user should be able to Appointment Outreach Text
Then the user should be able to Appointment Outreach BOT Call
Then the user should be able to Appointment Outreach Quick Text
Then the user should be able to Appointment Outreach Send VCard
Then the user should be able to Appointment Outreach Export To Excel
Then the user should be able to Appointment Status Update
Then the user should be able to Appointment OutReach Notes View
Then the user should be able to Appointment OutReach Notes Add
Then the user should be able to Appointment All Communication View

Scenario: Appointment Outreach Access with view only Access
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinicalworkflow user should be able to view Profiles
And I create a profile with view only Access Appointment Outreach
Then the user should be able to view Appointment Outreach
Then the user should not be able to Appointment Outreach Mail
Then the user should not be able to Appointment Outreach Fax
Then the user should not be able to Appointment Outreach Text
Then the user should not be able to Appointment Outreach BOT Call
Then the user should not be able to Appointment Outreach Quick Text
Then the user should not be able to Appointment Outreach Send VCard
Then the user should not be able to Appointment Outreach Export To Excel
Then the user should not be able to Appointment Status Update
Then the user should not be able to Appointment OutReach Notes View
Then the user should not be able to Appointment OutReach Notes Add
Then the user should not be able to Appointment All Communication View

# RPM Followup
Scenario: RPM Followup Access with All Permissions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinicalworkflow user should be able to view Profiles
And I create a profile Full RPM Followup Access with All Permissions
Then the user should be able to view RPM Followup
Then the user should be able to RPM Followup Mail
Then the user should be able to RPM Followup Fax
Then the user should be able to RPM Followup Text
Then the user should be able to RPM Followup BOT Call
Then the user should be able to RPM Followup Quick Text
Then the user should be able to RPM Followup Send VCard
Then the user should be able to RPM Followup Export To Excel
Then the user should be able to RPM Followup Status Update
Then the user should be able to RPM Followup Notes View
Then the user should be able to RPM Followup Notes Add
Then the user should be able to RPM Followup All Communication View

Scenario: RPM Followup Access with View Permissions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinicalworkflow user should be able to view Profiles
And I create a profile RPM Followup Access with view only Permissions
Then the user should be able to view RPM Followup
Then the user should not be able to RPM Followup Mail
Then the user should not be able to RPM Followup Fax
Then the user should not be able to RPM Followup Text
Then the user should not be able to RPM Followup BOT Call
Then the user should not be able to RPM Followup Quick Text
Then the user should not be able to RPM Followup Send VCard
Then the user should not be able to RPM Followup Export To Excel
Then the user should not be able to RPM Followup Status Update
Then the user should not be able to RPM Followup Notes View
Then the user should not be able to RPM Followup Notes Add
Then the user should not be able to RPM Followup All Communication View

# Clinical Queues
Scenario: User with Add access for Clinical Queues
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View and Add access to Clinical Queues
Then the user should be able to view and add Clinical Queues
And the user should not be able to edit or delete Clinical Queues

Scenario: User with Edit access for Clinical Queues
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View and Edit access to Clinical Queues
Then the user should be able to view and edit Clinical Queues
And the user should not be able to add or delete Clinical Queues

Scenario: User with Delete access for Clinical Queues
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View and Delete access to Clinical Queues
Then the user should be able to view and delete Clinical Queues
And the user should not be able to add or edit Clinical Queues

Scenario: User with View access only for Clinical Queues
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View access to Clinical Queues
Then the user should be able to view Clinical Queues
And the user should not be able to add or edit or delete Clinical Queues

# Upload Wizard Template Setting
Scenario: User with Add access for Upload Wizard Template Setting
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View and Add access to Upload Wizard Template Setting
Then the user should be able to view and add Upload Wizard Template Setting
And the user should not be able to edit or delete Upload Wizard Template Setting

Scenario: User with Edit access for Upload Wizard Template Setting
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View and Edit access to Upload Wizard Template Setting
Then the user should be able to view and edit Upload Wizard Template Setting
And the user should not be able to add or delete Upload Wizard Template Setting

Scenario: User with Delete access for Upload Wizard Template Setting
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View and Delete access to Upload Wizard Template Setting
Then the user should be able to view and delete Upload Wizard Template Setting
And the user should not be able to add or edit Upload Wizard Template Setting

Scenario: User with View access only for Upload Wizard Template Setting
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View access to Upload Wizard Template Setting
Then the user should be able to view Upload Wizard Template Setting
And the user should not be able to add or edit or delete Upload Wizard Template Setting

# Appointment Reminder Setting
Scenario: User with Add access for Appointment Reminder Setting
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View and Add access to Appointment Reminder Setting
Then the user should be able to view and add Appointment Reminder Setting
And the user should not be able to edit or delete Appointment Reminder Setting

Scenario: User with Edit access for Appointment Reminder Setting
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View and Edit access to Appointment Reminder Setting
Then the user should be able to view and edit Appointment Reminder Setting
And the user should not be able to add or delete Appointment Reminder Setting

Scenario: User with Delete access for Appointment Reminder Setting
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View and Delete access to Appointment Reminder Setting
Then the user should be able to view and delete Appointment Reminder Setting
And the user should not be able to add or edit Appointment Reminder Setting

Scenario: User with View access only for Appointment Reminder Setting
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinical user should be able to view Profiles test
And I create a profile with View access to Appointment Reminder Setting
Then the user should be able to view Appointment Reminder Setting
And the user should not be able to add or edit or delete Appointment Reminder Setting

# Upload Wizard Setting
Scenario: Clinical Queue Access with All Permissions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Clinicalworkflow user should be able to view Profiles
And I create a profile Clinical Queue Access with All Permissions
Then the user should be able to view Clinical Queue Columns
Then the user should be able to Clinical Queue Column Add
Then the user should be able to Copy Clinical Queue Column
Then the user should be able to Clinical Queue Column Delete
Then the user should be able to Clinical Column SortOrder Update
Then the user should be able to Clinical Queue Rule View
Then the user should be able to Clinical Queue Rule Add
Then the user should be able to Clinical Queue Rule Edit
Then the user should be able to Clinical Queue Rule Delete






























































































































































































































































































































































































































































































































































































































































































































