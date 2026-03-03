Feature: Entire Partner Module.

@Partner
# Audit View 
Scenario: User with View only access for General Audit View test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with View access only to Partner Module General Audit View test
Then the user should be able to view General Audit View settings in Partner Module test

Scenario: User with No access for General Audit View
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with No access to Partner Module General Audit View test 
Then the user should not be able to view General Audit View settings in Partner Module test

# Partner Type
Scenario: User with Add access for Partner Module Partner Type test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Add access only to Partner Type in Partner Module test
Then the user should be able to add Partner Type in Partner Module test
And the user should not be able to edit or delete Partner Type in Partner Module test

Scenario: User with Edit access for Partner Module General Audit View test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Edit access only to Partner Type in Partner Module test
Then the user should be able to edit Partner Type in Partner Module test
And the user should not be able to add or delete Partner Type in Partner Module test

Scenario: User with Delete access for Partner Module Partner Type test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Delete access only to Partner Type in Partner Module test
Then the user should be able to delete Partner Type in Partner Module test
And the user should not be able to add or edit Partner Type in Partner Module test

# Special Service
Scenario: User with Add access for Partner Module Special Service test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Add access only to Special Service in Partner Module test
Then the user should be able to add Special Service in Partner Module test
And the user should not be able to edit Special Service in Partner Module test

Scenario: User with Edit access for Partner Module Special Service test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Edit access only to Special Service in Partner Module test
Then the user should be able to edit Special Service in Partner Module test
And the user should not be able to add Special Service in Partner Module test

Scenario: User with Edit access for Partner Module Special Service test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Edit access only to Special Service in Partner Module test
Then the user should be able to edit Special Service in Partner Module test
And the user should not be able to add Special Service in Partner Module test

# Custom Partners
Scenario: User with Add access for Partner Module Custom Partners test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Add access only to Custom Partners in Partner Module test
Then the user should be able to add Custom Partners in Partner Module test
And the user should not be able to edit or delete Custom Partners in Partner Module test

Scenario: User with Edit access for Partner Module Custom Partners test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Edit access only to Custom Partners in Partner Module test
Then the user should be able to edit Custom Partners in Partner Module test
And the user should not be able to add or delete Custom Partners in Partner Module test

Scenario: User with Delete access for Partner Module Custom Partners test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Delete access only to Custom Partners in Partner Module test
Then the user should be able to delete Custom Partners in Partner Module test
And the user should not be able to add or edit Custom Partners in Partner Module test

Scenario: User with View and Details access for Partner Module Custom Partners test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with View Details access only to Custom Partners in Partner Module test
Then the user should be able to view and see details of Custom Partners in Partner Module test
And the user should not be able to add, edit, or delete Custom Partners in Partner Module test

# Business Address
Scenario: User with Add access for Partner Module Business Address test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Add access only to Business Address in Partner Module test
Then the user should be able to add Business Address in Partner Module test
And the user should not be able to edit or delete Business Address in Partner Module test

Scenario: User with Edit access for Partner Module Business Address test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Edit access only to Business Address in Partner Module test
Then the user should be able to edit Business Address in Partner Module test
And the user should not be able to add or delete Business Address in Partner Module test

Scenario: User with Delete access for Partner Module Business Address test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Delete access only to Business Address in Partner Module test
Then the user should be able to delete Business Address in Partner Module test
And the user should not be able to add or edit Business Address in Partner test

# Mailing Address
Scenario: User with Add access for Partner Module Mailing Address test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Add access only to Mailing Address in Partner Module test
Then the user should be able to add Mailing Address in Partner Module test
And the user should not be able to edit or delete Mailing Address in Partner Module test

Scenario: User with Edit access for Partner Module Mailing Address test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Edit access only to Mailing Address in Partner Module test
Then the user should be able to edit Mailing Address in Partner Module test
And the user should not be able to add or delete Mailing Address in Partner Module test

Scenario: User with Delete access for Partner Module Mailing Address test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Delete access only to Mailing Address in Partner Module test
Then the user should be able to delete Mailing Address in Partner Module test
And the user should not be able to add or edit Mailing Address in Partner Module test

# Executive
Scenario: User with Add access for Partner Module Executive test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Add access only to Executive in Partner Module test
Then the user should be able to add Executive in Partner Module test
And the user should not be able to edit or delete Executive in Partner Module test

Scenario: User with Edit access for Partner Module Executive test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Edit access only to Executive in Partner Module test
Then the user should be able to edit Executive in Partner Module test
And the user should not be able to add or delete Executive in Partner Module test

Scenario: User with Delete access for Partner Module Executive test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Delete access only to Executive in Partner Module test
Then the user should be able to delete Executive in Partner Module test
And the user should not be able to add or edit Executive in Partner Module test

Scenario: User with View and Reset Password access for Partner Module Executive test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with View + Reset Password access only to Executive in Partner Module test
Then the user should be able to view Executive in Partner Module test
And the user should be able to reset password for Executive in Partner Module test
And the user should not be able to add, edit, or delete Executive in Partner Module test

# Bucket
Scenario: User with all Folder permissions but no File permissions in Bucket Partner Module
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with full Folder permissions but no File permissions for Bucket in Partner Module
Then the user should be able to view Folder in Bucket for Partner Module
And the user should be able to add Folder in Bucket for Partner Module
And the user should be able to edit Folder in Bucket for Partner Module
And the user should be able to delete Folder in Bucket for Partner Module
And the user should be able to favourite Folder in Bucket for Partner Module
And the user should not be able to view File in Bucket for Partner Module
And the user should not be able to add File in Bucket for Partner Module
And the user should not be able to edit File in Bucket for Partner Module
And the user should not be able to delete File in Bucket for Partner Module
And the user should not be able to favourite File in Bucket for Partner Module
And the user should not be able to download File in Bucket for Partner Module













































































































































































































 


































































