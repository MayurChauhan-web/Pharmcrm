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

@Patient
Scenario: Send VCard Validation message on Blank Submission for Patient Module
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view patients
























































































   
















