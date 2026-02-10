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

@Provider
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






  
















































































































 






















  



































































































