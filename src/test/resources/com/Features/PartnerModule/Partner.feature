Feature: Entire Partner Module.

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
And I create a profile with full Folder permissions but no File permissions for Bucket in Partner Module test
Then the user should be able to view Folder in Bucket for Partner Module test
And the user should be able to add Folder in Bucket for Partner Module test
And the user should be able to edit Folder in Bucket for Partner Module test
And the user should be able to delete Folder in Bucket for Partner Module test
And the user should be able to favourite Folder in Bucket for Partner Module test
And the user should not be able to view File in Bucket for Partner Module test
And the user should not be able to add File in Bucket for Partner Module test
And the user should not be able to edit File in Bucket for Partner Module test
And the user should not be able to delete File in Bucket for Partner Module test
And the user should not be able to favourite File in Bucket for Partner Module test
And the user should not be able to download File in Bucket for Partner Module test

Scenario: User with all File permissions but no Folder permissions in Bucket Partner Module
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with full File permissions but no Folder permissions for Bucket in Partner Module test
Then the user should be able to view File in Bucket for Partner Module test
And the user should be able to add File in Bucket for Partner Module test
And the user should be able to edit File in Bucket for Partner Module test
And the user should be able to delete File in Bucket for Partner Module test
And the user should be able to favourite File in Bucket for Partner Module test
And the user should be able to download File in Bucket for Partner Module test
And the user should not be able to view Folder in Bucket for Partner Module test
And the user should not be able to add Folder in Bucket for Partner Module test
And the user should not be able to edit Folder in Bucket for Partner Module test
And the user should not be able to delete Folder in Bucket for Partner Module test
And the user should not be able to favourite Folder in Bucket for Partner Module test

# Attorney
Scenario: User with Add access for Partner Module Attorney test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Add access only to Attorney in Partner Module test
Then the user should be able to add Attorney in Partner Module test
And the user should not be able to edit or delete Attorney in Partner Module test
And the user should not be able to view Attorney details in Partner Module test

Scenario: User with Edit access for Partner Module Attorney
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Edit access only to Attorney in Partner Module test
Then the user should be able to edit Attorney in Partner Module test
And the user should not be able to add or delete Attorney in Partner Module test
And the user should not be able to view Attorney details in Partner Module test

Scenario: User with Delete access for Partner Module Attorney
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Delete access only to Attorney in Partner Module test
Then the user should be able to delete Attorney in Partner Module test
And the user should not be able to add or edit Attorney in Partner Module test
And the user should not be able to view Attorney details in Partner Module test

Scenario: User with Details access for Partner Module Attorney
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Details access only to Attorney in Partner Module test
Then the user should be able to view Attorney details in Partner Module test
And the user should not be able to add, edit, or delete Attorney in Partner Module test

# Pharmacies
Scenario: User with Add access for Partner Module Pharmacies
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Add access only to Pharmacies in Partner Module test
Then the user should be able to add Pharmacies in Partner Module test
And the user should not be able to edit or delete Pharmacies in Partner Module test
And the user should not be able to view Pharmacies details in Partner Module test
And the user should not be able to access Pharmacy Vetting in Partner Module test

Scenario: User with Edit access for Partner Module Pharmacies
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Edit access only to Pharmacies in Partner Module test
Then the user should be able to edit Pharmacies in Partner Module test
And the user should not be able to add or delete Pharmacies in Partner Module test
And the user should not be able to view Pharmacies details in Partner Module test
And the user should not be able to access Pharmacy Vetting in Partner Module test

Scenario: User with Delete access for Partner Module Pharmacies
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Delete access only to Pharmacies in Partner Module test
Then the user should be able to delete Pharmacies in Partner Module test
And the user should not be able to add or edit Pharmacies in Partner Module test
And the user should not be able to view Pharmacies details in Partner Module test
And the user should not be able to access Pharmacy Vetting in Partner Module test

Scenario: User with Details access for Partner Module Pharmacies
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Details access only to Pharmacies in Partner Module test
Then the user should be able to view Pharmacies details in Partner Module test
And the user should not be able to add, edit, or delete Pharmacies in Partner Module test
And the user should not be able to access Pharmacy Vetting in Partner Module test

Scenario: User with Pharmacy Vetting access for Partner Module Pharmacies
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Pharmacy Vetting access only to Pharmacies in Partner Module test
Then the user should be able to access Pharmacy Vetting in Partner Module test
And the user should not be able to add, edit, delete, or view Pharmacies details in Partner Module test

# DME Provider
Scenario: User with Add access for Partner Module DME Provider
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Add access only to DME Provider in Partner Module test
Then the user should be able to add DME Provider in Partner Module test
And the user should not be able to edit or delete DME Provider in Partner Module test
And the user should not be able to view DME Provider details in Partner Module test

Scenario: User with Edit access for Partner Module DME Provider
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Edit access only to DME Provider in Partner Module test
Then the user should be able to edit DME Provider in Partner Module test
And the user should not be able to add or delete DME Provider in Partner Module test
And the user should not be able to view DME Provider details in Partner Module test

Scenario: User with Delete access for Partner Module DME Provider
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Delete access only to DME Provider in Partner Module test
Then the user should be able to delete DME Provider in Partner Module test
And the user should not be able to add or edit DME Provider in Partner Module test
And the user should not be able to view DME Provider details in Partner Module test

Scenario: User with Details access for Partner Module DME Provider
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Details access only to DME Provider in Partner Module test
Then the user should be able to view DME Provider details in Partner Module test
And the user should not be able to add, edit, or delete DME Provider in Partner Module test

# Rx HUB
Scenario: User with Add access for Partner Module Rx HUB
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Add access only to Rx HUB in Partner Module test
Then the user should be able to add Rx HUB in Partner Module test
And the user should not be able to edit or delete Rx HUB in Partner Module test
And the user should not be able to view Rx HUB details in Partner Module test

Scenario: User with Edit access for Partner Module Rx HUB
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Edit access only to Rx HUB in Partner Module test
Then the user should be able to edit Rx HUB in Partner Module test
And the user should not be able to add or delete Rx HUB in Partner Module test
And the user should not be able to view Rx HUB details in Partner Module test

Scenario: User with Delete access for Partner Module Rx HUB
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Delete access only to Rx HUB in Partner Module test
Then the user should be able to delete Rx HUB in Partner Module test
And the user should not be able to add or edit Rx HUB in Partner Module test
And the user should not be able to view Rx HUB details in Partner Module test

# Federal And State Government
Scenario: User with Add access for Partner Module Federal and State Government
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Add access only to Federal and State Government in Partner Module test
Then the user should be able to add Federal and State Government in Partner Module test
And the user should not be able to edit or delete Federal and State Government in Partner Module test
And the user should not be able to view Federal and State Government details in Partner Module test

Scenario: User with Edit access for Partner Module Federal and State Government
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Edit access only to Federal and State Government in Partner Module test
Then the user should be able to edit Federal and State Government in Partner Module test
And the user should not be able to add or delete Federal and State Government in Partner Module test
And the user should not be able to view Federal and State Government details in Partner Module test

Scenario: User with Delete access for Partner Module Federal and State Government
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Delete access only to Federal and State Government in Partner Module test
Then the user should be able to delete Federal and State Government in Partner Module test
And the user should not be able to add or edit Federal and State Government in Partner Module test
And the user should not be able to view Federal and State Government details in Partner Module test

Scenario: User with Details access for Partner Module Federal and State Government
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Details access only to Federal and State Government in Partner Module test
Then the user should be able to view Federal and State Government details in Partner Module test
And the user should not be able to add, edit, or delete Federal and State Government in Partner Module test

# Employers
Scenario: User with Add access for Partner Module Employers
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Add access only to Employers in Partner Module test
Then the user should be able to add Employers in Partner Module test
And the user should not be able to edit or delete Employers in Partner Module test
And the user should not be able to view Employers details in Partner Module test

Scenario: User with Edit access for Partner Module Employers
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Edit access only to Employers in Partner Module test
Then the user should be able to edit Employers in Partner Module test
And the user should not be able to add or delete Employers in Partner Module test
And the user should not be able to view Employers details in Partner Module test

Scenario: User with Delete access for Partner Module Employers
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Delete access only to Employers in Partner Module test
Then the user should be able to delete Employers in Partner Module test
And the user should not be able to add or edit Employers in Partner Module test
And the user should not be able to view Employers details in Partner Module test

Scenario: User with Details access for Partner Module Employers
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Details access only to Employers in Partner Module test
Then the user should be able to view Employers details in Partner Module test
And the user should not be able to add, edit, or delete Employers in Partner Module test

# Referral Enrollment
Scenario: User with Add access for Partner Module Referral Enrollment
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Add access only to Referral Enrollment in Partner Module test
Then the user should be able to add Referral Enrollment in Partner Module test
And the user should not be able to edit or delete Referral Enrollment in Partner Module test

Scenario: User with Edit access for Partner Module Referral Enrollment
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Edit access only to Referral Enrollment in Partner Module test
Then the user should be able to edit Referral Enrollment in Partner Module test
And the user should not be able to add or delete Referral Enrollment in Partner Module test

Scenario: User with Delete access for Partner Module Referral Enrollment
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Delete access only to Referral Enrollment in Partner Module test
Then the user should be able to delete Referral Enrollment in Partner Module test
And the user should not be able to add or edit Referral Enrollment in Partner Module test

# Referral Patient History
Scenario: User with Download File access for Partner Module Referral Patient History
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Download File access only to Referral Patient History in Partner Module test
Then the user should be able to download files in Referral Patient History in Partner Module test

Scenario: User without Download File access for Partner Module Referral Patient History
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile without Download File access to Referral Patient History in Partner Module test
Then the user should not be able to download files in Referral Patient History in Partner Module test

# Partner Referral Incoming Details
Scenario: User with Download File access for Partner Module Referral Incoming Details
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Download File access only to Referral Incoming Details in Partner Module test
Then the user should be able to download files in Referral Incoming Details in Partner Module test

Scenario: User without Download File access for Partner Module Referral Incoming Details
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile without Download File access to Referral Incoming Details in Partner Module test
Then the user should not be able to download files in Referral Incoming Details in Partner Module test

# Partner Referral Outgoing Details
Scenario: User with Download File access for Partner Module Referral Outgoing Details
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Download File access only to Referral Outgoing Details in Partner Module test
Then the user should be able to download files in Referral Outgoing Details in Partner Module test

Scenario: User without Download File access for Partner Module Referral Outgoing Details
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile without Download File access to Referral Outgoing Details in Partner Module test
Then the user should not be able to download files in Referral Outgoing Details in Partner Module test

# Partner PA Details
Scenario: User with Export Excel access for Partner Module Partner PA Details
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Export Excel access only to Partner PA Details in Partner Module test
Then the user should be able to export Excel files in Partner PA Details in Partner Module test

Scenario: User without Export Excel access for Partner Module Partner PA Details
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile without Export Excel access to Partner PA Details in Partner Module test
Then the user should not be able to export Excel files in Partner PA Details in Partner Module test

# Funding Company
Scenario: User with Add access for Partner Module Funding Company
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Add access only to Funding Company in Partner Module test
Then the user should be able to add Funding Company in Partner Module test
And the user should not be able to edit or delete Funding Company in Partner Module test
And the user should not be able to view Funding Company details in Partner Module test

Scenario: User with Edit access for Partner Module Funding Company
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Edit access only to Funding Company in Partner Module test
Then the user should be able to edit Funding Company in Partner Module test
And the user should not be able to add or delete Funding Company in Partner Module test
And the user should not be able to view Funding Company details in Partner Module test

Scenario: User with Delete access for Partner Module Funding Company
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Delete access only to Funding Company in Partner Module test
Then the user should be able to delete Funding Company in Partner Module test
And the user should not be able to add or edit Funding Company in Partner Module test
And the user should not be able to view Funding Company details in Partner Module test

Scenario: User with Details access for Partner Module Funding Company
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Details access only to Funding Company in Partner Module test
Then the user should be able to view Funding Company details in Partner Module test
And the user should not be able to add, edit, or delete Funding Company in Partner Module test

# Partner License
Scenario: User with Add access for Partner Module Partner License
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Add access only to Partner License in Partner Module test
Then the user should be able to add Partner License in Partner Module test
And the user should not be able to edit or delete Partner License in Partner Module test
And the user should not be able to view Partner License details in Partner Module test
And the user should not be able to download files in Partner License in Partner Module test

Scenario: User with Edit access for Partner Module Partner License
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Edit access only to Partner License in Partner Module test
Then the user should be able to edit Partner License in Partner Module test
And the user should not be able to add or delete Partner License in Partner Module test
And the user should not be able to view Partner License details in Partner Module test
And the user should not be able to download files in Partner License in Partner Module test

Scenario: User with Delete access for Partner Module Partner License
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Delete access only to Partner License in Partner Module test
Then the user should be able to delete Partner License in Partner Module test
And the user should not be able to add or edit Partner License in Partner Module test
And the user should not be able to view Partner License details in Partner Module test
And the user should not be able to download files in Partner License in Partner Module test

Scenario: User with Details access for Partner Module Partner License
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Details access only to Partner License in Partner Module test
Then the user should be able to view Partner License details in Partner Module test
And the user should not be able to add, edit, or delete Partner License in Partner Module test
And the user should not be able to download files in Partner License in Partner Module test

Scenario: User with Download File access for Partner Module Partner License
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Download File access only to Partner License in Partner Module test
Then the user should be able to download files in Partner License in Partner Module test
And the user should not be able to add, delete Partner License in Partner Module test

# Partner Special Event
Scenario: User with Add access for Partner Module Partner Special Event
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Add access only to Partner Special Event in Partner Module test
Then the user should be able to add Partner Special Event in Partner Module test
And the user should not be able to edit or delete Partner Special Event in Partner Module test

Scenario: User with Edit access for Partner Module Partner Special Event
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Edit access only to Partner Special Event in Partner Module test
Then the user should be able to edit Partner Special Event in Partner Module test
And the user should not be able to add or delete Partner Special Event in Partner Module test

Scenario: User with Delete access for Partner Module Partner Special Event
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Delete access only to Partner Special Event in Partner Module test
Then the user should be able to delete Partner Special Event in Partner Module test
And the user should not be able to add or edit Partner Special Event in Partner Module test

# Partner Special Service
Scenario: User with Add access for Partner Module Partner Special Service
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Add access only to Partner Special Service in Partner Module test
Then the user should be able to add Partner Special Service in Partner Module test
And the user should not be able to edit or delete Partner Special Service in Partner Module test

Scenario: User with Edit access for Partner Module Partner Special Service
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Edit access only to Partner Special Service in Partner Module test
Then the user should be able to edit Partner Special Service in Partner Module test
And the user should not be able to add or delete Partner Special Service in Partner Module test

Scenario: User with Delete access for Partner Module Partner Special Service
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Delete access only to Partner Special Service in Partner Module test
Then the user should be able to delete Partner Special Service in Partner Module test
And the user should not be able to add or edit Partner Special Service in Partner Module test

# Partner Special Hour
Scenario: User with Add access for Partner Module Partner Special Hour
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Add access only to Partner Special Hour in Partner Module test
Then the user should be able to add Partner Special Hour in Partner Module test
And the user should not be able to edit or delete Partner Special Hour in Partner Module test

Scenario: User with Edit access for Partner Module Partner Special Hour
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Edit access only to Partner Special Hour in Partner Module test
Then the user should be able to edit Partner Special Hour in Partner Module test
And the user should not be able to add or delete Partner Special Hour in Partner Module test

Scenario: User with Delete access for Partner Module Partner Special Hour
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Delete access only to Partner Special Hour in Partner Module test
Then the user should be able to delete Partner Special Hour in Partner Module test
And the user should not be able to add or edit Partner Special Hour in Partner Module test

# Partner Agreement
Scenario: User with Add access for Partner Module Partner Agreement
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Add access only to Partner Agreement in Partner Module test
Then the user should be able to add Partner Agreement in Partner Module test
And the user should not be able to edit or delete Partner Agreement in Partner Module test

Scenario: User with Edit access for Partner Module Partner Agreement
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Edit access only to Partner Agreement in Partner Module test
Then the user should be able to edit Partner Agreement in Partner Module test
And the user should not be able to add or delete Partner Agreement in Partner Module test

Scenario: User with Delete access for Partner Module Partner Agreement
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Delete access only to Partner Agreement in Partner Module test
Then the user should be able to delete Partner Agreement in Partner Module test
And the user should not be able to add or edit Partner Agreement in Partner Module test

# DeDupe
Scenario: Create user with Update access to DeDupe in Partners Module and check permissions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile with Update access to DeDupe in Partners Module test
Then the user should be able to update DeDupe records in Partners Module test

Scenario: Create user without Update access to DeDupe in Partners Module and check restrictions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Partner user should be able to view Profiles test
And I create a profile without Update access to DeDupe in Partners Module test
Then the user should not be able to update DeDupe records in Partners Module via UI or direct URL test

Scenario: DeDupe Find Duplicate Checkbox Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then Checkbox Validation should have to show if not selected test

# Partners 
Scenario: New Partner Blank Submission Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then New Partner Blank Submission Validation should have to show

Scenario: New Partner Validation for Invalid Phone Number,Alternate Phone Number,Email Id
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then Validation for Invalid Phone Number, Alternate Phone Number, Email Id should have to display

Scenario: New Special Hour Blank Submission Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then Validation should have to show for New Special Hour Blank Submission

Scenario: Add Business Address Blank Submission Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then Validation should have to show for Add Business Address

Scenario: Add Business Address Invalid Zipcode Submission Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then Validation should have to show Invalid Zipcode

Scenario: Add Mailing Address Blank Submission Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then Validation should have to show for Mailing Address Blank Submission

Scenario: Add Mailing Address Invalid Zipcode Submission Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then Validation should have to show Mailing Address Invalid Zipcode

Scenario: Add Executive Blank Submission Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then Validation should have to show for Add Executive Blank Submission

Scenario: Add Executive Invalid Phone Number,Cell Number,Email Id Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then Validation should have to show for Invalid Phone Number,Cell Number,Email Id

Scenario: Add Referral Enrollment Blank Submission Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then Validation should have to show for Add Referral Enrollment

Scenario: Add Referral Enrollment Invalid Phone Number, Email Id Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then Validation should have to show for Invalid Phone Number, Email Id

Scenario: Add Partner License Blank Field Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then Validation should have to show for Add Partner License Blank Field

Scenario: Add Partner License Validation for Invalid Url, Original Date and Expiry Date
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then Validation should have to show for Invalid Url, Original Date and Expiry Date

Scenario: Add Partner License Validation for Invalid Url, Original Date and Expiry Date
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then Validation should have to show for Invalid Url, Original Date and Expiry Date

Scenario: Add Special Event Blank Field Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then Validation should have to show for Add Special Event Blank Field

Scenario: Special Service Blank Field Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then Validation should have to show for Special Service Blank Field

