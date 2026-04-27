Feature: Entire Harbour Module.

# Audit View 
Scenario: User with View only access for General Audit View test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Harbour user should be able to view Profiles test
And I create a profile with View access only to Harbour Module General Audit View test
Then the user should be able to view Harbour Audit View settings in Setup Module test

Scenario: User with No access for General Audit View test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Harbour user should be able to view Profiles test
And I create a profile with No access for Harbour Module General Audit View test
Then the user should Not able to view Harbour Audit View settings in Setup Module test

# Package
Scenario: User with View only access for Package Harbour Module
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Harbour user should be able to view Profiles test
And I create a profile with View only access for Package Harbour Module
Then the user should be able to View only access for Package
Then the user should not have other Basic and Additional Access for package 

Scenario: User with All access for Package Harbour Module
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Harbour user should be able to view Profiles test
And I create a profile with All access for Package Harbour Module
Then the user should be able to View Package
Then the user should be able to Delete Package
Then the user should be able to View Package Details
Then the user should be able to Return Package Print
Then the user should be able to Download Reference Documents
Then the user should be able to Download Signature
Then the user should be able to Download Driver Attestation
Then the user should be able to Print Customer Signature
Then the user should be able to Update Delivery Date
Then the user should be able to Update Delivery Status

# Manifest
Scenario: User with view and Add access for Manifest Harbour Module
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Harbour user should be able to view Profiles test
And I create a profile with view and Add access for Manifest Harbour Module
Then the user should be able to View and Add manifest
Then the user should not have Edit Delete and Additional Access

Scenario: User with view and Edit access for Manifest Harbour Module
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Harbour user should be able to view Profiles test
And I create a profile with view and Edit access for Manifest Harbour Module
Then the user should be able to View and Edit manifest
Then the user should not have Add Delete and Additional Access

Scenario: User with view and Delete access for Manifest Harbour Module
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Harbour user should be able to view Profiles test
And I create a profile with view and Delete access for Manifest Harbour Module
Then the user should be able to View and Delete manifest
Then the user should not have Add Edit and Additional Access

Scenario: User with All Access for Manifest Harbour Module
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Harbour user should be able to view Profiles test
And I create a profile with All Access for Manifest Harbour Module
Then the user should be able to View manifest
Then the user should be able to Add manifest
Then the user should be able to Edit manifest
Then the user should be able to Delete manifest
Then the user should be able to View Detail
Then the user should be able to Skip Manifest Package
Then the user should be able to Delete Manifest Package
Then the user should be able to Manifest Print

# Customer Attestation
Scenario: User with Print Access for Customer Attestation Harbour Module
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Harbour user should be able to view Profiles test
And I create a profile with Print Access for Customer Attestation Harbour Module
Then the user should be able to Print Customer Attestation
Then the user should not able Send for Signature Customer Attestation

Scenario: User with Send for Signature Access for Customer Attestation Harbour Modul
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Harbour user should be able to view Profiles test
And I create a profile with Send for Signature Access for Customer Attestation Harbour Modul
Then the user should be able Send for Signature Customer Attestation
Then the user should not able to Print for Customer Attestation

# Delivery Report
Scenario: User with Export Access for Delivery Report Harbour Modul
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Harbour user should be able to view Profiles test
And I create a profile with Export Access for Delivery Report Harbour Modul
Then the user should be able Export for Delivery Report Harbour Modul

Scenario: User with No Export Access for Delivery Report Harbour Modul
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Harbour user should be able to view Profiles test
And I create a profile with No Export Access for Delivery Report Harbour Modul
Then the user should Not able Export for Delivery Report Harbour Modul

# Driver Detail Report
Scenario: User with Export Access for Driver Detail Report Harbour Modul
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Harbour user should be able to view Profiles test
And I create a profile with Export Access for Driver Detail Report Harbour Modul
Then the user should be able Export for Driver Detail Report Harbour Modul


Scenario: User with No Export Access for Driver Detail Report Harbour Modul
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Harbour user should be able to view Profiles test
And I create a profile with No Export Access for Driver Detail Report Harbour Modul
Then the user should be Not able Export for Driver Detail Report Harbour Modul

# Delivery Statistic Report
Scenario: User with Export Access for Delivery Statistic Report Harbour Modul
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Harbour user should be able to view Profiles test
And I create a profile with only Export Access for Delivery Statistic Report Harbour Modul
Then the user should be able Export Access for Delivery Statistic Report Harbour Modul
Then the user should not able to Detailed Report View Harbour Modul

Scenario: User with Detailed Report View Access for Delivery Statistic Report Harbour Modul
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Harbour user should be able to view Profiles test
And I create a profile with only Detailed Report View Access for Delivery Statistic Report Harbour Modul
Then the user should be able Check mark Detailed Report View Access for Delivery Statistic Report Harbour Modul
Then the user should not able to Export Harbour Modul

# Manifests
Scenario: Verify error message when required fields are missing
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then Leave all required fields empty
Then Appropriate error messages should be displayed for each missing required field

Scenario: Verify error message when Add Store Not Selected
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then user does not select any value in Add Store
Then an appropriate error message should be displayed for Add Store field

