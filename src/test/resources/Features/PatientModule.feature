Feature: Entire Patient Module.

Scenario: Quick Text Validation message on Blank Submission for Patient Module
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view patients
Then I click on Add Quick Text button
Then I do not fill any required fields in the Patient Quick Text form
Then I click Send button for Patient Quick Text
Then I should see validation messages for all quick text required fields Patient Module
Then the patient module quick text should not be created or updated

Scenario: Send VCard Validation message on Blank Submission for Patient Module
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view patients
Then I click on Send VCard Button Patient Module 
Then I do not fill any required fields in the Patient Quick Text form
Then I click Send button for Patient VCard
Then I should see validation messages for all required fields Send VCard button Patient Module
Then the patient VCard should not be created or sent for patient module

Scenario: Send VCard Validation message on Blank Submission for Patient Module
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view patients
Then I click on Delete Patient button
Then I click Cancel button on Delete Patient confirmation message
Then the patient should not be deleted from list

Scenario: Add To Follow-up Blank Submission when Next is Clicked
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view patients  
Then user clicks on Add to Follow-up button for a patient module
When user clicks on Next button without entering any data  
Then the system should display a validation message indicating that required fields are blank  
Then the user should remain on the Add to Follow-up form without progressing to the next step

Scenario: Add Patient – Search Blank Submission
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view patients
When user clicks on New Patient button
Then user clicks on Search Patient button in Add Patient
Then the system should display a validation message indicating that required fields are blank
Then the user should remain on the Search Patient form without progressing to the next step

Scenario: Add Patient – Select Existing Patient Blank Submission
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view patients
When user clicks on New Patient button
Then user clicks on Select Existing Patient button in Add Patient
Then the system should display a validation message indicating that required fields are blank
Then the user should remain on the Select Existing Patient form without progressing to the next step

Scenario: Add Patient – Add New Patient Blank Submission
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view patients
When user clicks on New Patient button
Then user clicks on Add New Patient button in Add Patient
Then the system should display a validation message indicating that required fields are blank
Then the user should remain on the Add New Patient form without progressing to the next step

@Patient
Scenario: Patient – Filter Cancel
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view patients
When user clicks on Filter button in Patient module
And user enters filter criteria
Then user clicks on Cancel button in Filter
Then the filter should be cleared and patient list should remain unchanged







































  
  
  




















































































































   
















