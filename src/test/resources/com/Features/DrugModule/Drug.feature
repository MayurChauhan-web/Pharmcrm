Feature: Entire Drug Module.

# Audit View 
Scenario: User with View only access for Drug Audit View test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View access only to Drug Module General Audit View test
Then the user should be able to view Drug General Audit View settings test

Scenario: User with No access for Drug Audit View test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with No access to Drug Module General Audit View test
Then the user should not be able to view Drug General Audit View settings test

# Drug
Scenario: User with View only access for Drug
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View access only to Drug test
Then the user should be able to view Drug test
And the user should not be able to add, edit, delete, download template, upload excel, or export excel test

Scenario: User with Add access for Drug test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Add access to Drug test
Then the user should be able to view and add in Drug test
And the user should not be able to delete, download template, upload excel, or export excel test

Scenario: User with Delete access for Drug test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Delete access to Drug test
Then the user should be able to view and delete in Drug test
And the user should not be able to add, edit, download template, upload excel, or export excel test

Scenario: User with Download Template access for Drug test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Download Template access to Drug test
Then the user should be able to view and download template in Drug test
And the user should not be able to add, edit, delete, upload excel, or export excel test

Scenario: User with Upload Excel access for Drug test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Upload Excel access to Drug test
Then the user should be able to view and upload excel in Drug test
And the user should not be able to add, edit, delete, download template, or export excel test

Scenario: User with Export Excel access for Drug test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Export Excel access to Drug test
Then the user should be able to view and export excel in Drug test
And the user should not be able to add, edit, delete, download template, or upload excel test

# Star 1 Drug
Scenario: User with View only access for Star 1 Drug test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View access only to Star 1 Drug test
Then the user should be able to view Star 1 Drug test
And the user should not be able to edit Star 1 Drug test

Scenario: User with Edit access for Star 1 Drug test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Edit access to Star 1 Drug test
Then the user should be able to view and edit Star 1 Drug test

# Star 2 Drug
Scenario: User with View only access for Star 2 Drug test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View access only to Star 2 Drug test
Then the user should be able to view Star 2 Drug test
And the user should not be able to edit Star 2 Drug test

Scenario: User with Edit access for Star 2 Drug test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Edit access to Star 2 Drug test
Then the user should be able to view and edit Star 2 Drug test

# Allergy
Scenario: User with View only access for Allergy test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View access only to Allergy test
Then the user should be able to view Allergy test
And the user should not be able to add, edit, delete, download template, upload excel, or export excel for Allergy test

Scenario: User with Add access for Allergy test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Add access to Allergy test
Then the user should be able to view and add Allergy test
And the user should not be able to delete, download template, upload excel, or export excel for Allergy test

Scenario: User with Delete access for Allergy test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Delete access to Allergy test
Then the user should be able to view and delete Allergy test
And the user should not be able to add, edit, download template, upload excel, or export excel for Allergy test

Scenario: User with Download Template access for Allergy test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Download Template access to Allergy test
Then the user should be able to view and download template in Allergy test
And the user should not be able to add, edit, delete, upload excel, or export excel for Allergy test

Scenario: User with Upload Excel access for Allergy test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Upload Excel access to Allergy test
Then the user should be able to view and upload excel in Allergy test
And the user should not be able to add, edit, delete, download template, or export excel for Allergy test

Scenario: User with Export Excel access for Allergy test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Export Excel access to Allergy test
Then the user should be able to view and export excel in Allergy test
And the user should not be able to add, edit, delete, download template, or upload excel for Allergy test

# ICD10
Scenario: User with View only access for ICD10 test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View access only to ICD10 test
Then the user should be able to view ICD10 test
And the user should not be able to add, edit, or delete ICD10 test

Scenario: User with Add access for ICD10 test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Add access to ICD10 test
Then the user should be able to view and add ICD10 test
And the user should not be able to edit or delete ICD10 test 

Scenario: User with Edit access for ICD10 test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Edit access to ICD10 test
Then the user should be able to view and edit ICD10 test
And the user should not be able to add or delete ICD10 test

Scenario: User with Delete access for ICD10 test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Delete access to ICD10 test
Then the user should be able to view and delete ICD10 test
And the user should not be able to add or edit ICD10 test

# Drug Therapeutic
Scenario: User with Add access for Drug Therapeutic test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Add access to Drug Therapeutic test
Then the user should be able to view and add Drug Therapeutic test
And the user should not be able to edit or delete Drug Therapeutic test

Scenario: User with Edit access for Drug Therapeutic test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Edit access to Drug Therapeutic test
Then the user should be able to view and edit Drug Therapeutic test
And the user should not be able to add or delete Drug Therapeutic test

Scenario: User with Delete access for Drug Therapeutic test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Delete access to Drug Therapeutic test
Then the user should be able to view and delete Drug Therapeutic test
And the user should not be able to add or edit Drug Therapeutic test

# Drug Family
Scenario: User with Add access for Drug Family test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Add access to Drug Family test
Then the user should be able to view and add Drug Family test
And the user should not be able to edit or delete Drug Family test 

Scenario: User with Edit access for Drug Family test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Edit access to Drug Family test
Then the user should be able to view and edit Drug Family test
And the user should not be able to add or delete Drug Family test

Scenario: User with Delete access for Drug Family test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Delete access to Drug Family test
Then the user should be able to view and delete Drug Family test
And the user should not be able to add or edit Drug Family test

# Drug Approved Indication
Scenario: User with Add access for Drug Approved Indication test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Add access to Drug Approved Indication test
Then the user should be able to view and add Drug Approved Indication test
And the user should not be able to edit or delete Drug Approved Indication test

Scenario: User with Edit access for Drug Approved Indication test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Edit access to Drug Approved Indication test
Then the user should be able to view and edit Drug Approved Indication test
And the user should not be able to add or delete Drug Approved Indication test

Scenario: User with Delete access for Drug Approved Indication test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Delete access to Drug Approved Indication test
Then the user should be able to view and delete Drug Approved Indication test
And the user should not be able to add or edit Drug Approved Indication test

# Disease State
Scenario: User with Add access for Disease State test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Add access to Disease State test
Then the user should be able to view and add Disease State test
And the user should not be able to delete Disease State test

Scenario: User with Delete access for Disease State test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Delete access to Disease State test
Then the user should be able to view and delete Disease State test
And the user should not be able to add Disease State test

# Program
Scenario: User with Add access for Program test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Add access to Program test
Then the user should be able to view and add Program test
And the user should not be able to delete Program test

Scenario: User with Delete access for Program test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Drug user should be able to view Profiles test
And I create a profile with View and Delete access to Program test
Then the user should be able to view and delete Program test
And the user should not be able to add Program test
