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







































































































































































































































































































































































































































































































































































































































































































