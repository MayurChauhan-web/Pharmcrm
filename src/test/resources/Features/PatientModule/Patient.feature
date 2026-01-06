Feature: Entire Patient Module.

#PatientPage
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

Scenario: Patient – Edit Cancel
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view patients
When user clicks on Edit Patient button in Patient module
And user updates patient details
Then user clicks on Cancel button in Edit Patient
Then the patient details should not be updated and patient list should remain unchanged

Scenario: Patient – Add to Trial Blank Submission when Next is Clicked
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view patients
When user clicks on Add to Trial button for a patient
When user clicks on Next button without entering any data
Then the system should display a validation message indicating that required fields are blank
Then the user should remain on the Add to Trial form without progressing to the next step

Scenario: Patient – Enable Login Validation when Email is Empty
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view patients
And user enables patient login option
Then the system should display a validation message indicating that Email is required

# TagPage
Scenario: Patient – Add Tag Blank Submission
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view tags
When user clicks on Add Tag button for a patient
And user clicks on Save button without entering any tag
Then the system should display a validation message indicating that Tag name is required
Then the user should remain on the Add Tag form without saving the tag

Scenario: Patient – Edit Tag Type Cancel
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view tags
When user clicks on Edit button for a Tag Type
And user updates the Tag Type details
Then user clicks on Cancel button in Edit Tag Type
Then the Tag Type details should not be updated and the tag list should remain unchanged

Scenario: Delete Tag – Cancel
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view tags
When user clicks on Action menu for a Tag
And user clicks on Delete Tag button
Then user clicks on Cancel button on Delete Tag confirmation message
Then the Tag should not be deleted and the tag list should remain unchanged

# ReviewCategoriesPage
Scenario: Add Review Category – Blank Submit
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view review categories
When user clicks on Add Review Category button
And user clicks on Save button without entering any data
Then the system should display a validation message indicating that required fields are blank
Then the user should remain on the Add Review Category form without saving the category

Scenario: Edit Review Category – Cancel
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view review categories
And user stores the Review Category details before edit
When user clicks on Edit button for a Review Category
And user updates the Review Category details
Then user clicks on Cancel button in Edit Review Category
Then the Review Category details should not be updated and the review category list should remain unchanged

Scenario: Delete Review Category – Cancel
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view review categories
And user stores the Review Category details before delete
When user clicks on Action menu for a Review Category
And user clicks on Delete Review Category button
Then user clicks on Cancel button on Delete Review Category confirmation message
Then the Review Category should not be deleted and the review category list should remain unchanged

# ReferralSourcesPage
Scenario: Add Referral Source – Blank Submit
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view referral sources
When user clicks on Add Referral Source button
And user clicks on Save button without entering any data
Then the system should display a validation message indicating that required fields are blank
Then the user should remain on the Add Referral Source form without saving the referral source

Scenario: Edit Referral Source – Cancel
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view referral sources
And user stores the Referral Source details before edit
When user clicks on Edit button for a Referral Source
And user updates the Referral Source details
Then user clicks on Cancel button in Edit Referral Source
Then the Referral Source details should not be updated and the referral source list should remain unchanged

Scenario: Delete Referral Source – Cancel
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view referral sources
And user stores the Referral Source details before delete
When user clicks on Action menu for a Referral Source
And user clicks on Delete Referral Source button
Then user clicks on Cancel button on Delete Referral Source confirmation message
Then the Referral Source should not be deleted and the referral source list should remain unchanged

# EnrollmentsPage
Scenario: Add Enrollment – Blank Submit
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view enrollments
When user clicks on Add Enrollment button
And user clicks on Save button without entering any data
Then the system should display a validation message indicating that required fields are blank
Then the user should remain on the Add Enrollment form without saving the enrollment

Scenario: Edit Enrollment – Cancel
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view enrollments
And user stores the Enrollment details before edit
When user clicks on Edit button for an Enrollment
And user updates the Enrollment details
Then user clicks on Cancel button in Edit Enrollment
Then the Enrollment details should not be updated and the enrollment list should remain unchanged

Scenario: Delete Enrollment – Cancel
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view enrollments
And user stores the Enrollment details before delete
When user clicks on Action menu for an Enrollment
And user clicks on Delete Enrollment button
Then user clicks on Cancel button on Delete Enrollment confirmation message
Then the Enrollment should not be deleted and the enrollment list should remain unchanged

# DeDupePage
Scenario: Patient – De Dupe Find Duplicate Validation for Selecting Checkbox
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view DeDupe patients page
When user clicks on De Dupe Find Duplicate option for a patient
Then the system should display a validation message for selecting checkbox

# General
Scenario: User with View only access for Patient Module (General Audit View)
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with View access only to Patient Module General Audit View test
Then the user should be able to view Patient Module General Audit View test

Scenario: User with No access for Patient Module (General Audit View)
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with No access to Patient Module General Audit View test
Then the user should not be able to view Patient Module General Audit View test

# Patinet
Scenario: User with View only access for Patient test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with View access only to Patient Module Patient test
Then the user should be able to view patients test   
But the user should not be able to add, edit, or delete patients test 

Scenario: User with View and Add access for Patient
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with View and Add access to Patient Module Patient test  
And the user should be able to add a new patient test        
But the patient user should not be able to edit or delete patients test

Scenario: User with View, Add, and Edit access for Patient
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with View, Add, and Edit access to Patient Module Patient test
And the user should be able to add a new patient test        
And the user should be able to edit an existing patient test
But the user should not be able to delete patients test 

Scenario: User with full access (View, Add, Edit, Delete) for Patient test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with full access to Patient Module Patient test
And the user should be able to add a new patient test        
And the user should be able to edit an existing patient test
And the user should be able to delete a patient test  

Scenario: User with all additional access enabled
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with full access to Patient Module Patient test
Then the user should be able to send a patient for review test
And the user should be able to send a patient for signature test
And the user should be able to print a patient signature test
And the user should be able to map a tag test
And the user should be able to delete a mapped tag test
And the user should be able to view patient prescriptions test
And the user should be able to add a referrals test 
And the user should be able to delete a referrals test
And the user should be able to add a referral source test 
And the user should be able to delete a referral source test 
And the user should be able to add a patient enrollment test
And the user should be able to delete a patient enrollment test
And the user should be able to update patient status test
And the user should be able to set delivery preference test
And the user should be able to make an outgoing call test
And the user should be able to export patient data to excel test
And the user should be able to add an RPM device test
And the user should be able to edit an RPM device test
And the user should be able to delete an RPM device test
And the user should be able to reset a patient password test

Scenario: User with all additional access disabled
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with all additional access permissions disabled in Patient Module test 
Then the user should not be able to send a patient for review test 
And the user should not be able to send a patient for signature test  
And the user should not be able to print a patient signature test 
And the user should not be able to map a tag test  
And the user should not be able to delete a mapped tag test
And the user should not be able to view patient prescriptions test
And the user should not be able to add a referral source test
And the user should not be able to delete a referral source test
And the user should not be able to add a patient enrollment test
And the user should not be able to delete a patient enrollment test
And the user should not be able to update patient status test
And the user should not be able to set delivery preference test 
And the user should not be able to make an outgoing call test
And the user should not be able to export patient data to excel test
And the user should not be able to add an RPM device test
And the user should not be able to edit an RPM device test
And the user should not be able to delete an RPM device test
And the user should not be able to reset a patient password test 

# DeDupe
Scenario: Create user with Update access to DeDupe and check permissions test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with Update access to Partners Module DeDupe test 
Then the user should be able to update DeDupe records test  

Scenario: Create user without Update access to DeDupe and check restrictions test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile without Update access to Partners Module DeDupe test 
Then the user should not be able to update DeDupe records via UI or direct URL test 

# Tag
Scenario: User with View only access for Tag test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with View access only to Patient Module Tag test  
Then the user can view tags but cannot add, edit, or delete them

Scenario: User with View and Add access for Tag test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with View and Add access to Patient Module Tag test  
Then the user should be able to view tags and add a new tag test
But the user should not be able to edit or delete tags test 

Scenario: User with View, Add, and Edit access for Tag test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with View, Add, and Edit access to Patient Module Tag test 
Then user should be able to view, add, and edit tags
But the user should not be able to delete tags test

Scenario: User with View, Add, Edit, and Delete access for Tag
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with View, Add, Edit, and Delete access to Patient Module Tag test
Then user should be able to view, add, edit, and delete tags   

Scenario: User with View only access for Review Category test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with View access only to Setup Module Review Category test 
Then the user should be able to view review categories test
But the user should not be able to add, edit, or delete review categories test

Scenario: User with View and Add access for Review Category test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with View and Add access to Setup Module Review Category test
And the user should be able to add a new review category test 
But the user should not be able to edit or delete review categories test  

Scenario: User with View, Add, and Edit access for Review Category test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with View, Add, and Edit access to Setup Module Review Category test
And the user should be able to add a new review category test 
And the user should be able to edit an existing review category test 
But the user should not be able to delete review categories test 

Scenario: User with View, Add, Edit, and Delete access for Review Category test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with View, Add, Edit, and Delete access to Setup Module Review Category test 
And the user should be able to add a new review category test 
And the user should be able to edit an existing review category test 
And the user should be able to delete a review category test    

Scenario: User with View only access for Referral Source test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with View access only to Setup Module Referral Source test 
Then the user should be able to view referral sources test      
But the user should not be able to add, edit, or delete referral sources test  

Scenario: User with View and Add access for Referral Source test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with View and Add access to Setup Module Referral Source test
Then the user should be able to view referral sources test      
And the user should be able to add a new referral source test
But the user should not be able to edit or delete referral sources test

Scenario: User with View, Add, and Edit access for Referral Source test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with View, Add, and Edit access to Setup Module Referral Source test
Then the user should be able to view referral sources test      
And the user should be able to add a new referral source test
And the user should be able to edit an existing referral source test 
But the user should not be able to delete referral sources test 

Scenario: User with View, Add, Edit, and Delete access for Referral Source
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with View, Add, Edit, and Delete access to Setup Module Referral Source test  
Then the user should be able to view referral sources test      
And the user should be able to add a new referral source test
And the user should be able to edit an existing referral source test 
And the user should be able to delete a referral source test

Scenario: User with View only access for Enrollment test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with View access only to Setup Module Enrollment test
Then the user should be able to view enrollments test
But the user should not be able to add, edit, or delete enrollments test

Scenario: User with View and Add access for Enrollment test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with View and Add access to Setup Module Enrollment test
Then the user should be able to view enrollments test
And the user should be able to add a new enrollment test  
But the user should not be able to edit or delete enrollments test  

Scenario: User with View, Add, and Edit access for Enrollment test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with View, Add, and Edit access to Setup Module Enrollment test
Then the user should be able to view enrollments test
And the user should be able to add a new enrollment test  
And the user should be able to edit an existing enrollment test  
But the user should not be able to delete enrollments test

@Patient
Scenario: User with View, Add, Edit, and Delete access for Enrollment test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the patient user should be able to view Profiles
And I create a profile with View, Add, Edit, and Delete access to Setup Module Enrollment test
Then the user should be able to view enrollments test
And the user should be able to add a new enrollment test  
And the user should be able to edit an existing enrollment test  
And the user should be able to delete an enrollment test 




 




















































  









































































 

























































































































    
































  







  



















 
















  




























  
  
  
  
  
  






















 
















































  




























































































































































































































































































































  
  
  




















































































































   









