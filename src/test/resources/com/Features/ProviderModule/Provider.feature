Feature: Entire Provider Module.

# Audit View 
Scenario: User with View only access for General Audit View test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View access only to Provider Module General Audit View test
Then the user should be able to view Provider General Audit View settings test

Scenario: User with No access for General Audit View test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with No access to Provider Module General Audit View test  
Then the user should not be able to view General Audit View settings in Provider Module test

# Callback Request
Scenario: User with View only access for Callback Request test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View access only to Provider Module Callback Request test
Then the user should be able to view Callback Request in Provider Module test

Scenario: User with No access for Callback Request test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with No access to Provider Module Callback Request test
Then the user should not be able to view Callback Request in Provider Module test

# Demand Request
Scenario: User with View only access for Demand Request test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View access only to Provider Module Demand Request test
Then the user should be able to view Demand Request in Provider Module test

Scenario: User with No access for Demand Request test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with No access to Provider Module Demand Request test
Then the user should not be able to view Demand Request in Provider Module test

# NPI Request
Scenario: User with View and Merge access but no Approve for NPI Request
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Merge access but no Approve access to Provider Module NPI Request test
Then the user should be able to view NPI Request in Provider Module test
And the user should be able to merge NPI Request in Provider Module test
And the user should not be able to approve NPI Request in Provider Module test

Scenario: User with View and Approve access but no Merge for NPI Request test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Approve access but no Merge access to Provider Module NPI Request test
Then the user should be able to view NPI Request in Provider Module test
And the user should be able to approve NPI Request in Provider Module test
And the user should not be able to merge NPI Request in Provider Module test

# Text
Scenario: User with View and Send access but no Reply or Send VCard for Text
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Send access but no Reply or Send VCard access to Provider Module Text test
Then the user should be able to view Text in Provider Module test
And the user should be able to send Text in Provider Module test
And the user should not be able to send VCard in Provider Module test

Scenario: User with View and Send VCard access but no Send or Reply for Text test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Send VCard access but no Send or Reply access to Provider Module Text test
Then the user should be able to view Text in Provider Module test
And the user should be able to send VCard in Provider Module test
And the user should not be able to send Text in Provider Module test

# Provider
Scenario: User with View and Add access but no Edit, Delete or Detail for Provider test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Add access but no Edit, Delete or Detail access to Provider in Provider Module test
Then the user should be able to view Provider in Provider Module test
And the user should be able to add Provider in Provider Module test
And the user should not be able to edit Provider in Provider Module test   
And the user should not be able to delete Provider in Provider Module test
And the user should not be able to view Provider details in Provider Module test

Scenario: User with View and Edit access but no Add, Delete or Detail for Provider test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Edit access but no Add, Delete or Detail access to Provider in Provider Module test  
Then the user should be able to view Provider in Provider Module test
And the user should be able to edit Provider in Provider Module test
And the user should not be able to add Provider in Provider Module test
And the user should not be able to delete Provider in Provider Module test
And the user should not be able to view Provider details in Provider Module test

Scenario: User with View and Delete access but no Add, Edit or Detail for Provider test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Delete access but no Add, Edit or Detail access to Provider in Provider Module test
Then the user should be able to view Provider in Provider Module test
And the user should be able to delete Provider in Provider Module test
And the user should not be able to add Provider in Provider Module test
And the user should not be able to edit Provider in Provider Module test
And the user should not be able to view Provider details in Provider Module test

Scenario: User with View and Detail access but no Add, Edit or Delete for Provider test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Detail access but no Add, Edit or Delete access to Provider in Provider Module test
Then the user should be able to view Provider in Provider Module test
And the user should be able to view Provider details in Provider Module test 
And the user should not be able to add Provider in Provider Module test
And the user should not be able to edit Provider in Provider Module test
And the user should not be able to delete Provider in Provider Module test

# Provider Address
Scenario: User with View and Add access but no Edit or Delete for Provider Address test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Add access but no Edit or Delete access to Provider Address in Provider Module test
Then the user should be able to view Provider Address in Provider Module test
And the user should be able to add Provider Address in Provider Module test
And the user should not be able to edit Provider Address in Provider Module test 
And the user should not be able to delete Provider Address in Provider Module test

Scenario: User with View and Edit access but no Add or Delete for Provider Address test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Edit access but no Add or Delete access to Provider Address in Provider Module test
Then the user should be able to view Provider Address in Provider Module test
And the user should be able to edit Provider Address in Provider Module test
And the user should not be able to add Provider Address in Provider Module test
And the user should not be able to delete Provider Address in Provider Module test

Scenario: User with View and Delete access but no Add or Edit for Provider Address test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Delete access but no Add or Edit access to Provider Address in Provider Module test
Then the user should be able to view Provider Address in Provider Module test
And the user should be able to delete Provider Address in Provider Module test
And the user should not be able to add Provider Address in Provider Module test
And the user should not be able to edit Provider Address in Provider Module test

# Provider Communication
Scenario: User with View and Add access but no Edit or Delete for Provider Communication test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Add access but no Edit or Delete access to Provider Communication in Provider Module test
Then the user should be able to view Provider Communication in Provider Module test
And the user should be able to add Provider Communication in Provider Module test
And the user should not be able to edit Provider Communication in Provider Module test  
And the user should not be able to delete Provider Communication in Provider Module test

Scenario: User with View and Edit access but no Add or Delete for Provider Communication test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Edit access but no Add or Delete access to Provider Communication in Provider Module test
Then the user should be able to view Provider Communication in Provider Module test
And the user should be able to edit Provider Communication in Provider Module test
And the user should not be able to add Provider Communication in Provider Module test
And the user should not be able to delete Provider Communication in Provider Module test

Scenario: User with View and Delete access but no Add or Edit for Provider Communication test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Delete access but no Add or Edit access to Provider Communication in Provider Module test
Then the user should be able to view Provider Communication in Provider Module test
And the user should be able to delete Provider Communication in Provider Module test
And the user should not be able to add Provider Communication in Provider Module test
And the user should not be able to edit Provider Communication in Provider Module test

# Referrals
Scenario: User with View access but no Export Excel for Referrals test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View access but no Export Excel access to Referrals Provider test
Then the user should be able to view Referrals in Provider Module test
And the user should not be able to export Referrals to Excel in Provider Module test

Scenario: User with both View and Export Excel access for Referrals test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with both View and Export Excel access to Referrals Provider test
Then the user should be able to view Referrals in Provider Module test
And the user should be able to export Referrals to Excel in Provider Module test

# Executives
Scenario: User with View and Add access but no Edit or Delete for Executives test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Add access but no Edit or Delete access to Executives test
Then the user should be able to view Executives test
And the user should be able to add Executives test
And the user should not be able to edit Executives test
And the user should not be able to delete Executives test

Scenario: User with View and Edit access but no Add or Delete for Executives test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Edit access but no Add or Delete access to Executives test
Then the user should be able to view Executives test
And the user should be able to edit Executives test
And the user should not be able to add Executives test
And the user should not be able to delete Executives test

Scenario: User with View and Delete access but no Add or Edit for Executives test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Delete access but no Add or Edit access to Executives test
Then the user should be able to view Executives test
And the user should be able to delete Executives test
And the user should not be able to add Executives test
And the user should not be able to edit Executives test

# Referral Enrollment
Scenario: User with View and Add access but no Edit or Delete for Referral Enrollment test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Add access but no Edit or Delete access to Referral Enrollment test
Then the user should be able to view Referral Enrollment test
And the user should be able to add Referral Enrollment test
And the user should not be able to edit Referral Enrollment test  
And the user should not be able to delete Referral Enrollment test

Scenario: User with View and Edit access but no Add or Delete for Referral Enrollment test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Edit access but no Add or Delete access to Referral Enrollment test
Then the user should be able to view Referral Enrollment test
And the user should be able to edit Referral Enrollment test
And the user should not be able to add Referral Enrollment test
And the user should not be able to delete Referral Enrollment test

Scenario: User with View and Delete access but no Add or Edit for Referral Enrollment test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Delete access but no Add or Edit access to Referral Enrollment test
Then the user should be able to view Referral Enrollment test
And the user should be able to delete Referral Enrollment test
And the user should not be able to add Referral Enrollment test
And the user should not be able to edit Referral Enrollment test

# Bucket
Scenario: User with all Folder permissions but no File permissions in Bucket test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with full Folder permissions but no File permissions for Bucket test
Then the user should be able to view Folder in Bucket test
And the user should be able to add Folder in Bucket test
And the user should be able to edit Folder in Bucket test
And the user should be able to delete Folder in Bucket test
And the user should be able to favourite Folder in Bucket test
And the user should not be able to add File in Bucket test
And the user should not be able to edit File in Bucket test
And the user should not be able to delete File in Bucket test
And the user should not be able to favourite File in Bucket test
And the user should not be able to download File in Bucket test
And the user should not be able to view File in Bucket test

Scenario: User with all File permissions but no Folder permissions in Bucket test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with full File permissions but no Folder permissions for Bucket test
Then the user should be able to view File in Bucket test
And the user should be able to add File in Bucket test
And the user should be able to edit File in Bucket test
And the user should be able to delete File in Bucket test
And the user should be able to favourite File in Bucket test
And the user should be able to download File in Bucket test
And the user should not be able to view Folder in Bucket test
And the user should not be able to add Folder in Bucket test
And the user should not be able to edit Folder in Bucket test
And the user should not be able to delete Folder in Bucket test
And the user should not be able to favourite Folder in Bucket test

# Referral Patient History
Scenario: User with Download File permission in Referral Patient History test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with Download File permission for Referral Patient History test
Then the user should be able to view Referral Patient History test
And the user should be able to download File in Referral Patient History test

Scenario: User without Download File permission in Referral Patient History test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile without Download File permission for Referral Patient History test
Then the user should be able to view Referral Patient History test
And the user should not be able to download File in Referral Patient History test

# DeDupe
Scenario: Create user with Update access to DeDupe and check permissions test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with Update access to Provider Module DeDupe test
Then the user should be able to update DeDupe records for Provider Module test

Scenario: Create user without Update access to DeDupe and check restrictions test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile without Update access to Provider Module DeDupe test
Then the user should not be able to update DeDupe records via UI or direct URL for Provider Module test

# Provider Executive
Scenario: Create user with View but not Reset Password access to Provider Executive test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View access but without Reset Password access to Provider Executive test
Then the user should be able to view Provider Executive records test
And the user should not be able to reset passwords for Provider Executive test

Scenario: Create user with both View and Reset Password access to Provider Executive test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with both View and Reset Password access to Provider Executive test
Then the user should be able to view Provider Executive records test
And the user should be able to reset passwords for Provider Executive users test

# Provider Service
Scenario: User with View and Add access but no Edit, Delete for Provider Service test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Add access but no Edit, Delete to Provider Service in Provider Module test
Then the user should be able to view Provider Service in Provider Module test
And the user should be able to add Provider Service in Provider Module test
And the user should not be able to edit Provider Service in Provider Module test
And the user should not be able to delete Provider Service in Provider Module test

Scenario: User with View and Edit access but no Add, Delete for Provider Service test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Edit access but no Add, Delete to Provider Service in Provider Module test
Then the user should be able to view Provider Service in Provider Module test
And the user should be able to edit Provider Service in Provider Module test
And the user should not be able to add Provider Service in Provider Module test
And the user should not be able to delete Provider Service in Provider Module test

Scenario: User with View and Delete access but no Add, Edit for Provider Service test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Delete access but no Add, Edit to Provider Service in Provider Module test
Then the user should be able to view Provider Service in Provider Module test
And the user should be able to delete Provider Service in Provider Module test
And the user should not be able to add Provider Service in Provider Module test
And the user should not be able to edit Provider Service in Provider Module test

# Provider EHR
Scenario: User with Add access to Provider EHR but no Edit or Delete test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with Add access but no Edit or Delete access to Provider EHR in Provider Module test
Then the user should be able to add Provider EHR in Provider Module test
And the user should not be able to edit Provider EHR in Provider Module test
And the user should not be able to delete Provider EHR in Provider Module test

Scenario: User with Edit access to Provider EHR but no Add or Delete test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with Edit access but no Add or Delete access to Provider EHR in Provider Module test
Then the user should be able to edit Provider EHR in Provider Module test
And the user should not be able to add Provider EHR in Provider Module test
And the user should not be able to delete Provider EHR in Provider Module test

Scenario: User with Delete access to Provider EHR but no Add or Edit test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with Delete access but no Add or Edit access to Provider EHR in Provider Module test
Then the user should be able to delete Provider EHR in Provider Module test
And the user should not be able to add Provider EHR in Provider Module test
And the user should not be able to edit Provider EHR in Provider Module test

# Business Group
Scenario: User with View and Add access but no Edit, Delete or Make Partner for Business Group test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Add access but no Edit, Delete or Make Partner access to Business Group in Provider Module test 
Then the user should be able to view Business Group in Provider Module test
And the user should be able to add Business Group in Provider Module test
And the user should not be able to edit Business Group in Provider Module test
And the user should not be able to delete Business Group in Provider Module test
And the user should not be able to make Business Group a Partner in Provider Module test

Scenario: User with View and Edit access but no Add, Delete or Make Partner for Business Group test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Edit access but no Add, Delete or Make Partner access to Business Group in Provider Module test
Then the user should be able to view Business Group in Provider Module test
And the user should be able to edit Business Group in Provider Module test
And the user should not be able to add Business Group in Provider Module test
And the user should not be able to delete Business Group in Provider Module test
And the user should not be able to make Business Group a Partner in Provider Module test

Scenario: User with View and Delete access but no Add, Edit or Make Partner for Business Group test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Delete access but no Add, Edit or Make Partner access to Business Group in Provider Module test
Then the user should be able to view Business Group in Provider Module test
And the user should be able to delete Business Group in Provider Module test
And the user should not be able to add Business Group in Provider Module test
And the user should not be able to edit Business Group in Provider Module test
And the user should not be able to make Business Group a Partner in Provider Module test

Scenario: User with View and Make Partner access but no Add, Edit or Delete for Business Group test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Make Partner access but no Add, Edit or Delete access to Business Group in Provider Module test
Then the user should be able to view Business Group in Provider Module test
And the user should be able to make Business Group a Partner in Provider Module test
And the user should not be able to add Business Group in Provider Module test
And the user should not be able to edit Business Group in Provider Module test
And the user should not be able to delete Business Group in Provider Module test

# Business Group Address
Scenario: User with View and Add access but no Edit or Delete for Business Group Address test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Add access but no Edit or Delete access to Business Group Address in Provider Module test
Then the user should be able to view Business Group Address in Provider Module test
And the user should be able to add Business Group Address in Provider Module test
And the user should not be able to edit Business Group Address in Provider Module test
And the user should not be able to delete Business Group Address in Provider Module test

Scenario: User with View and Edit access but no Add or Delete for Business Group Address test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Edit access but no Add or Delete access to Business Group Address in Provider Module test
Then the user should be able to view Business Group Address in Provider Module test
And the user should be able to edit Business Group Address in Provider Module test
And the user should not be able to add Business Group Address in Provider Module test
And the user should not be able to delete Business Group Address in Provider Module test

Scenario: User with View and Delete access but no Add or Edit for Business Group Address test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Delete access but no Add or Edit access to Business Group Address in Provider Module test
Then the user should be able to view Business Group Address in Provider Module test
And the user should be able to delete Business Group Address in Provider Module test
And the user should not be able to add Business Group Address in Provider Module test
And the user should not be able to edit Business Group Address in Provider Module test

# Provider Referral Incoming Details
Scenario: User with Download File permission for Provider Referral Incoming Details test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with Download File permission for Provider Referral Incoming Details test
Then the user should be able to view Provider Referral Incoming Details test
And the user should be able to download files from Provider Referral Incoming Details test

Scenario: User without Download File permission for Provider Referral Incoming Details test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile without Download File permission for Provider Referral Incoming Details test
Then the user should be able to view Provider Referral Incoming Details test
And the user should not be able to download files from Provider Referral Incoming Details test

# Provider Referral Outgoing Details
Scenario: User with Download File permission for Provider Referral Outgoing Details test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with Download File permission for Provider Referral Outgoing Details test
Then the user should be able to view Provider Referral Outgoing Details test
And the user should be able to download files from Provider Referral Outgoing Details test

Scenario: User without Download File permission for Provider Referral Outgoing Details test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile without Download File permission for Provider Referral Outgoing Details test
Then the user should be able to view Provider Referral Outgoing Details test
And the user should not be able to download files from Provider Referral Outgoing Details test

# Provider Remote Monitoring Details
Scenario: User with Download File permission for Provider Remote Monitoring Details test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with Download File permission for Provider Remote Monitoring Details test
Then the user should be able to view Provider Remote Monitoring Details test
And the user should be able to download files from Provider Remote Monitoring Details test

Scenario: User without Download File permission for Provider Remote Monitoring Details test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile without Download File permission for Provider Remote Monitoring Details test
Then the user should be able to view Provider Remote Monitoring Details test
And the user should not be able to download files from Provider Remote Monitoring Details test

# Provider PA Details
Scenario: User with Export Excel permission for Provider PA Details test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with Export Excel permission for Provider PA Details test
Then the user should be able to view Provider PA Details test
And the user should be able to export Provider PA Details to Excel test

Scenario: User without Export Excel permission for Provider PA Details test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile without Export Excel permission for Provider PA Details test
Then the user should be able to view Provider PA Details test
And the user should not be able to export Provider PA Details to Excel test

# Provider Type
Scenario: User with View and Add access but no Edit or Delete for Provider Type test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Add access but no Edit or Delete access to Provider Type in Provider Module test
Then the user should be able to view Provider Type in Provider Module test
And the user should be able to add Provider Type in Provider Module test
And the user should not be able to edit Provider Type in Provider Module test
And the user should not be able to delete Provider Type in Provider Module test

Scenario: User with View and Edit access but no Add or Delete for Provider Type test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Edit access but no Add or Delete access to Provider Type in Provider Module test
Then the user should be able to view Provider Type in Provider Module test
And the user should be able to edit Provider Type in Provider Module test
And the user should not be able to add Provider Type in Provider Module test
And the user should not be able to delete Provider Type in Provider Module test

Scenario: User with View and Delete access but no Add or Edit for Provider Type test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Delete access but no Add or Edit access to Provider Type in Provider Module test
Then the user should be able to view Provider Type in Provider Module test
And the user should be able to delete Provider Type in Provider Module test
And the user should not be able to add Provider Type in Provider Module test
And the user should not be able to edit Provider Type in Provider Module test

# Category
Scenario: User with View and Add access but no Edit or Delete for Category test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Add access but no Edit or Delete access to Category in Provider Module test
Then the user should be able to view Category in Provider Module test
And the user should be able to add Category in Provider Module test
And the user should not be able to edit Category in Provider Module test
And the user should not be able to delete Category in Provider Module test

Scenario: User with View and Edit access but no Add or Delete for Category test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Edit access but no Add or Delete access to Category in Provider Module test
Then the user should be able to view Category in Provider Module test
And the user should be able to edit Category in Provider Module test
And the user should not be able to add Category in Provider Module test
And the user should not be able to delete Category in Provider Module test

Scenario: User with View and Delete access but no Add or Edit for Category test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Delete access but no Add or Edit access to Category in Provider Module test
Then the user should be able to view Category in Provider Module test
And the user should be able to delete Category in Provider Module test
And the user should not be able to add Category in Provider Module test
And the user should not be able to edit Category in Provider Module test

# Specialty
Scenario: User with View and Add access but no Edit or Delete for Specialty test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Add access but no Edit or Delete access to Specialty in Provider Module test
Then the user should be able to view Specialty in Provider Module test
And the user should be able to add Specialty in Provider Module test
And the user should not be able to edit Specialty in Provider Module test
And the user should not be able to delete Specialty in Provider Module test

Scenario: User with View and Edit access but no Add or Delete for Specialty test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Edit access but no Add or Delete access to Specialty in Provider Module test
Then the user should be able to view Specialty in Provider Module test
And the user should be able to edit Specialty in Provider Module test
And the user should not be able to add Specialty in Provider Module test
And the user should not be able to delete Specialty in Provider Module test

Scenario: User with View and Delete access but no Add or Edit for Specialty test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Delete access but no Add or Edit access to Specialty in Provider Module test
Then the user should be able to view Specialty in Provider Module test
And the user should be able to delete Specialty in Provider Module test
And the user should not be able to add Specialty in Provider Module test
And the user should not be able to edit Specialty in Provider Module test

# Service
Scenario: User with View and Add access but no Edit or Delete for Service test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Add access but no Edit or Delete access to Service in Provider Module test
Then the user should be able to view Service in Provider Module test
And the user should be able to add Service in Provider Module test
And the user should not be able to edit Service in Provider Module test
And the user should not be able to delete Service in Provider Module test

Scenario: User with View and Edit access but no Add or Delete for Service test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Edit access but no Add or Delete access to Service in Provider Module test
Then the user should be able to view Service in Provider Module test
And the user should be able to edit Service in Provider Module test
And the user should not be able to add Service in Provider Module test
And the user should not be able to delete Service in Provider Module test

Scenario: User with View and Delete access but no Add or Edit for Service test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Delete access but no Add or Edit access to Service in Provider Module test
Then the user should be able to view Service in Provider Module test
And the user should be able to delete Service in Provider Module test
And the user should not be able to add Service in Provider Module test
And the user should not be able to edit Service in Provider Module test

# Provider Template
Scenario: User with View and Add access but no Edit or Delete for Provider Template test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Add access but no Edit or Delete access to Provider Template in Provider Module test
Then the user should be able to view Provider Template in Provider Module test
And the user should be able to add Provider Template in Provider Module test
And the user should not be able to edit Provider Template in Provider Module test
And the user should not be able to delete Provider Template in Provider Module test

Scenario: User with View and Edit access but no Add or Delete for Provider Template test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Edit access but no Add or Delete access to Provider Template in Provider Module test
Then the user should be able to view Provider Template in Provider Module test
And the user should be able to edit Provider Template in Provider Module test
And the user should not be able to add Provider Template in Provider Module
And the user should not be able to delete Provider Template in Provider Module

Scenario: User with View and Delete access but no Add or Edit for Provider Template test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Provider user should be able to view Profiles test
And I create a profile with View and Delete access but no Add or Edit access to Provider Template in Provider Module test
Then the user should be able to view Provider Template in Provider Module test
And the user should be able to delete Provider Template in Provider Module test
And the user should not be able to add Provider Template in Provider Module test
And the user should not be able to edit Provider Template in Provider Module test

# # BusinessGroup
Scenario: BusinessGroup page required fields validation test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the user should see validation messages for all required fields: Email, Zone, Phone, and BusinessGroup Name

Scenario: BusinessGroup page invalid email ID validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the user should see a validation message indicating the email ID is invalid

Scenario: BusinessGroup page invalid phone number validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the user should see a validation message indicating the phone number is invalid

Scenario: BusinessGroup page filter with blank Business Group Name search
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the user should see a validation message indicating Business Group Name is required

Scenario: BusinessGroup page add address fields validation test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the user should see validation messages for all required address fields: Street, City, State, Zip Code, and Contact Number1

@Provider
Scenario: BusinessGroup page invalid Fax, Contact Numbers, and Zip Code validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then The user should see validation messages indicating Fax, Contact Number1, Contact Number2, and Zip Code are invalid








































































































































































































































































































































































 



























































































































































































  
















































































































 






















  



































































































