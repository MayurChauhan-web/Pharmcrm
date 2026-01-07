Feature: Patient Module scenarios

  Scenario: User with View only access for Patient Module (General Audit View)
  Given I log in as admin for Patient module 
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"   
  And I create a profile with View access only to Patient Module General Audit View
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view Patient Module General Audit View
  
  Scenario: User with No access for Patient Module (General Audit View)
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with No access to Patient Module General Audit View  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should not be able to view Patient Module General Audit View
  
  Scenario: User with View only access for Patient
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View access only to Patient Module Patient  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view patients     
  But the user should not be able to add, edit, or delete patients  

  Scenario: User with View and Add access for Patient
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View and Add access to Patient Module Patient   
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view patients
  And the user should be able to add a new patient         
  But the user should not be able to edit or delete patients  
    
  Scenario: User with View, Add, and Edit access for Patient
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View, Add, and Edit access to Patient Module Patient 
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view patients
  And the user should be able to add a new patient
  And the user should be able to edit an existing patient 
  But the user should not be able to delete patients
  
  Scenario: User with full access (View, Add, Edit, Delete) for Patient
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with full access to Patient Module Patient 
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view patients
  And the user should be able to add a new patient
  And the user should be able to edit an existing patient
  And the user should be able to delete a patient
    
  Scenario: User with all additional access enabled
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with all additional access permissions enabled in Patient Module
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to send a patient for review  
  And the user should be able to send a patient for signature  
  And the user should be able to print a patient signature 
  And the user should be able to map a tag 
  And the user should be able to delete a mapped tag 
  And the user should be able to view patient prescriptions 
  And the user should be able to add a referrals  
  And the user should be able to delete a referrals 
  And the user should be able to add a referral source   
  And the user should be able to delete a referral source 
  And the user should be able to add a patient enrollment 
  And the user should be able to delete a patient enrollment 
  And the user should be able to update patient status 
  And the user should be able to set delivery preference 
  And the user should be able to make an outgoing call 
  And the user should be able to export patient data to excel 
  And the user should be able to add an RPM device 
  And the user should be able to edit an RPM device 
  And the user should be able to delete an RPM device 
  And the user should be able to reset a patient password
  
  Scenario: User with all additional access disabled
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with all additional access permissions disabled in Patient Module   
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should not be able to send a patient for review 
  And the user should not be able to send a patient for signature 
  And the user should not be able to print a patient signature 
  And the user should not be able to map a tag 
  And the user should not be able to delete a mapped tag 
  And the user should not be able to view patient prescriptions 
  And the user should not be able to add a referral source  
  And the user should not be able to delete a referral source 
  And the user should not be able to add a patient enrollment 
  And the user should not be able to delete a patient enrollment 
  And the user should not be able to update patient status 
  And the user should not be able to set delivery preference   
  And the user should not be able to make an outgoing call  
  And the user should not be able to export patient data to excel 
  And the user should not be able to add an RPM device 
  And the user should not be able to edit an RPM device 
  And the user should not be able to delete an RPM device 
  And the user should not be able to reset a patient password  
  
  Scenario: Create user with Update access to DeDupe and check permissions
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Update access to Partners Module DeDupe  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to update DeDupe records  

  Scenario: Create user without Update access to DeDupe and check restrictions
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile without Update access to Partners Module DeDupe  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should not be able to update DeDupe records via UI or direct URL  

  Scenario: User with View only access for Tag
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View access only to Patient Module Tag      
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view tags 
  But the user should not be able to add, edit, or delete tags
  
  Scenario: User with View and Add access for Tag
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View and Add access to Patient Module Tag           
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view tags
  And the user should be able to add a new tag  
  But the user should not be able to edit or delete tags  

  Scenario: User with View, Add, and Edit access for Tag
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View, Add, and Edit access to Patient Module Tag    
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view tags
  And the user should be able to add a new tag
  And the user should be able to edit an existing tag 
  But the user should not be able to delete tags
  
  Scenario: User with View, Add, Edit, and Delete access for Tag
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View, Add, Edit, and Delete access to Patient Module Tag    
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view tags
  And the user should be able to add a new tag
  And the user should be able to edit an existing tag
  And the user should be able to delete a tag  

  Scenario: User with View only access for Review Category
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View access only to Setup Module Review Category 
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view review categories   
  But the user should not be able to add, edit, or delete review categories   

  Scenario: User with View and Add access for Review Category
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View and Add access to Setup Module Review Category 
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view review categories
  And the user should be able to add a new review category   
  But the user should not be able to edit or delete review categories   
  
  Scenario: User with View, Add, and Edit access for Review Category
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View, Add, and Edit access to Setup Module Review Category 
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view review categories
  And the user should be able to add a new review category
  And the user should be able to edit an existing review category    
  But the user should not be able to delete review categories
  
  Scenario: User with View, Add, Edit, and Delete access for Review Category
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View, Add, Edit, and Delete access to Setup Module Review Category  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view review categories
  And the user should be able to add a new review category
  And the user should be able to edit an existing review category
  And the user should be able to delete a review category   
  
  Scenario: User with View only access for Referral Source
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View access only to Setup Module Referral Source    
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view referral sources       
  But the user should not be able to add, edit, or delete referral sources   

  Scenario: User with View and Add access for Referral Source
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View and Add access to Setup Module Referral Source 
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view referral sources
  And the user should be able to add a new referral source  
  But the user should not be able to edit or delete referral sources 
  
  Scenario: User with View, Add, and Edit access for Referral Source
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View, Add, and Edit access to Setup Module Referral Source  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view referral sources
  And the user should be able to add a new referral source
  And the user should be able to edit an existing referral source    
  But the user should not be able to delete referral sources   
  
  Scenario: User with View, Add, Edit, and Delete access for Referral Source
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View, Add, Edit, and Delete access to Setup Module Referral Source   
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view referral sources
  And the user should be able to add a new referral source
  And the user should be able to edit an existing referral source
  And the user should be able to delete a referral source

  Scenario: User with View only access for Enrollment
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View access only to Setup Module Enrollment   
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view enrollments    
  But the user should not be able to add, edit, or delete enrollments
  
  Scenario: User with View and Add access for Enrollment
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View and Add access to Setup Module Enrollment  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view enrollments
  And the user should be able to add a new enrollment   
  But the user should not be able to edit or delete enrollments   

  Scenario: User with View, Add, and Edit access for Enrollment
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View, Add, and Edit access to Setup Module Enrollment  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view enrollments
  And the user should be able to add a new enrollment
  And the user should be able to edit an existing enrollment   
  But the user should not be able to delete enrollments   

  Scenario: User with View, Add, Edit, and Delete access for Enrollment
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View, Add, Edit, and Delete access to Setup Module Enrollment  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view enrollments
  And the user should be able to add a new enrollment
  And the user should be able to edit an existing enrollment
  And the user should be able to delete an enrollment    
     
  Scenario: User with full Folder permissions for Bucket
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View, Add Folder, Edit Folder, and Delete Folder access to Setup Module Bucket   
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view buckets
  And the user should be able to add new folders
  And the user should be able to edit existing folders
  And the user should be able to delete folders  

  Scenario: User with File management access for Bucket
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View, Add File, Edit File, Delete File, and Download File access to Setup Module Bucket   
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view buckets
  And the user should be able to add new files to folders  
  And the user should be able to edit existing files   
  And the user should be able to delete files   
  And the user should be able to download files   
  But the user should not be able to add, edit, or delete folders    

  Scenario: User with Add only access for Patient Health Card
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add access only to Patient Module Patient Health Card  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add a patient health card    
  But the user should not be able to edit or delete patient health cards
  
  Scenario: User with Add and Edit access for Patient Health Card
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add and Edit access to Patient Module Patient Health Card  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add a patient health card
  And the user should be able to edit patient health cards   
  But the user should not be able to delete patient health cards   

  Scenario: User with Add, Edit, and Delete access for Patient Health Card
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add, Edit, and Delete access to Patient Module Patient Health Card    
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add a patient health card    
  And the user should be able to edit patient health cards
  And the user should be able to delete patient health cards   

  Scenario: User with Add only access for Patient Intake Form
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add access only to Patient Module Patient Intake Form     
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add a patient intake form   
  But the user should not be able to edit, print, or send for signature
  
  Scenario: User with Add and Edit access for Patient Intake Form
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add and Edit access to Patient Module Patient Intake Form          
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add a patient intake form
  And the user should be able to edit patient intake forms    
  But the user should not be able to print or send for signature   
  
  Scenario: User with Add, Edit, and Print access for Patient Intake Form
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add, Edit, and Print access to Patient Module Patient Intake Form  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add a patient intake form
  And the user should be able to edit patient intake forms
  And the user should be able to print patient intake forms   
  But the user should not be able to send for signature  

  # test
  Scenario: User with Add, Edit, Print, and Send For Signature access for Patient Intake Form
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add, Edit, Print, and Send For Signature access to Patient Module Patient Intake Form    
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add a patient intake form
  And the user should be able to edit patient intake forms
  And the user should be able to print patient intake forms
  And the user should be able to send patient intake forms for signature
  
  Scenario: User with Add only access for Patient Claim Verification
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add access only to Patient Module Patient Claim Verification 
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add a patient claim verification   
  But the user should not be able to edit, print, or send for signature for Patient Claim Verification 

  Scenario: User with Add and Edit access for Patient Claim Verification
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add and Edit access to Patient Module Patient Claim Verification  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add a patient claim verification
  And the user should be able to edit patient claim verifications  
  But the user should not be able to print or send for signature for Patient Claim Verification    

  Scenario: User with Add, Edit, and Print access for Patient Claim Verification
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add, Edit, and Print access to Patient Module Patient Claim Verification  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add a patient claim verification
  And the user should be able to edit patient claim verifications
  And the user should be able to print patient claim verifications  
  But the user should not be able to send for signature for Patient Claim Verification  
    
  Scenario: User with Add, Edit, Print, and Send For Signature access for Patient Claim Verification
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add, Edit, Print, and Send For Signature access to Patient Module Patient Claim Verification  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add a patient claim verification
  And the user should be able to edit patient claim verifications  
  And the user should be able to print patient claim verifications
  And the user should be able to send patient claim verifications for signature     

  Scenario: User with Add only access for Patient Medication
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add access only to Patient Module Patient Medication 
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient medication 
  But the user should not be able to edit, delete Patient Medication 

  Scenario: User with Add and Edit access for Patient Medication
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add and Edit access to Patient Module Patient Medication 
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient medication
  And the user should be able to edit patient medications  
  But the user should not be able to delete Patient Medication 
  
  Scenario: User with Add, Edit, and Delete access for Patient Medication
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add, Edit, and Delete access to Patient Module Patient Medication 
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient medication
  And the user should be able to edit patient medications
  And the user should be able to delete patient medications  

  Scenario: User with Add, Edit, Delete, View Gross Margin, Update Sync, and Update Gross Margin access for Patient Medication
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add, Edit, Delete, View Gross Margin, Update Sync, and Update Gross Margin access to Patient Module Patient Medication  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient medication
  And the user should be able to edit patient medications
  And the user should be able to delete patient medications
  And the user should be able to view patient medication gross margin
  And the user should be able to update patient medication sync
  And the user should be able to update patient medication gross margin  

  Scenario: User with Add only access for Patient Meds On Chart
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add access only to Patient Module Patient Meds On Chart 
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient meds on chart   
  But the user should not be able to edit, delete, Patient Meds On Chart
  
  Scenario: User with Add and Edit access for Patient Meds On Chart
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add and Edit access to Patient Module Patient Meds On Chart  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient meds on chart
  And the user should be able to edit patient meds on chart 
  But the user should not be able to delete meds on chart   

  Scenario: User with Add, Edit, and Delete access for Patient Meds On Chart
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add, Edit, and Delete access to Patient Module Patient Meds On Chart 
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient meds on chart
  And the user should be able to edit patient meds on chart
  And the user should be able to delete patient meds on chart  

  Scenario: User with Add, Edit, Delete, and Copied To Medication access for Patient Meds On Chart
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add, Edit, Delete, and Copied To Medication access to Patient Module Patient Meds On Chart 
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient meds on chart
  And the user should be able to edit patient meds on chart
  And the user should be able to delete patient meds on chart
  And the user should be able to copy patient meds to medication
  
  Scenario: User with Add only access for Patient Pharmacy
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add access only to Patient Module Patient Pharmacy 
   And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient pharmacy  
  But the user should not be able to edit or delete patient pharmacy   

  Scenario: User with Add and Edit access for Patient Pharmacy
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add and Edit access to Patient Module Patient Pharmacy  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient pharmacy
  And the user should be able to edit patient pharmacy   
  But the user should not be able to delete patient pharmacy  

  Scenario: User with Add, Edit, and Delete access for Patient Pharmacy
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add, Edit, and Delete access to Patient Module Patient Pharmacy 
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient pharmacy
  And the user should be able to edit patient pharmacy
  And the user should be able to delete patient pharmacy
  
  Scenario: User with Add only access for Patient Physician
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add access only to Patient Module Patient Physician  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient physician  
  But the user should not be able to edit or delete patient physician 

  Scenario: User with Add and Edit access for Patient Physician
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add and Edit access to Patient Module Patient Physician  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient physician
  And the user should be able to edit patient physician 
  But the user should not be able to delete patient physician  

  Scenario: User with Add, Edit, and Delete access for Patient Physician
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add, Edit, and Delete access to Patient Module Patient Physician 
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient physician
  And the user should be able to edit patient physician
  And the user should be able to delete patient physician
  
  Scenario: User with Add only access for Patient Communication
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add access only to Patient Module Patient Communication  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient communication 
  But the user should not be able to edit or delete patient communication  

  Scenario: User with Add and Edit access for Patient Communication
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add and Edit access to Patient Module Patient Communication       
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient communication
  And the user should be able to edit patient communication 
  But the user should not be able to delete patient communication  

  Scenario: User with Add, Edit, and Delete access for Patient Communication
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add, Edit, and Delete access to Patient Module Patient Communication  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient communication
  And the user should be able to edit patient communication
  And the user should be able to delete patient communication
  
  Scenario: User with Add only access for Patient Family
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add access only to Patient Module Patient Family  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient family    
  But the user should not be able to delete patient family  

  Scenario: User with Add and Delete access for Patient Family
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add and Delete access to Patient Module Patient Family  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient family
  And the user should be able to delete patient family  
  
  Scenario: User with Add only access for Patient External Source
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add access only to Patient Module Patient External Source 
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient external source 
  But the user should not be able to edit or delete patient external source
  
  Scenario: User with Add and Edit access for Patient External Source
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add and Edit access to Patient Module Patient External Source   
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient external source
  And the user should be able to edit patient external source   
  But the user should not be able to delete patient external source  

  Scenario: User with Add, Edit, and Delete access for Patient External Source
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add, Edit, and Delete access to Patient Module Patient External Source  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient external source
  And the user should be able to edit patient external source
  And the user should be able to delete patient external source  

  Scenario: User with Add only access for Generate New Access Code
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add access only to Generate New Access Code  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add generate new access code
  
  Scenario: User with no Add access cannot add Generate New Access Code
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with no Add access to Generate New Access Code  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should not be able to add generate new access code  
  
  Scenario: User with View only access for Patient Text
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View access only to Patient Text  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view patient text  
  But the user should not be able to use Quick Text, Reply, or Send VCard   
  
  Scenario: User with View and Quick Text access for Patient Text
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View and Quick Text access to Patient Text   
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view patient text
  And the user should be able to use Quick Text  
  But the user should not be able to Reply or Send VCard
  
  Scenario: User with View, Quick Text, and Reply access for Patient Text
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View, Quick Text, and Reply access to Patient Text   
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view patient text
  And the user should be able to use Quick Text
  And the user should be able to Reply  
  But the user should not be able to Send VCard     

  Scenario: User with full access for Patient Text
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View, Quick Text, Reply, and Send VCard access to Patient Text  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view patient text
  And the user should be able to use Quick Text
  And the user should be able to Reply
  And the user should be able to Send VCard   
  
  Scenario: User with View and Quick Text access for Text
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View and Quick Text access to Text   
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  And the user should be able to use Quick Text
  But the user should not be able to Reply, Add To Patient, or Send VCard
  
  Scenario: User with View, Quick Text, and Reply access for Text
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View, Quick Text, and Reply access to Text  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  And the user should be able to use Quick Text
  And the user should be able to Reply
  But the user should not be able to Add To Patient or Send VCard   

  Scenario: User with View, Quick Text, Reply, and Add To Patient access for Text
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View, Quick Text, Reply, and Add To Patient access to Text                        
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  And the user should be able to use Quick Text
  And the user should be able to Reply
  And the user should be able to Add To Patient
  But the user should not be able to Send VCard

  Scenario: User with full access for Text
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View, Quick Text, Reply, Add To Patient, and Send VCard access to Text  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  And the user should be able to use Quick Text
  And the user should be able to Reply
  And the user should be able to Add To Patient   
  And the user should be able to Send VCard
  
  Scenario: User with Add only access for CareGiver Name
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add access only to CareGiver Name  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add caregiver name  
  But the user should not be able to edit or delete caregiver name 

  Scenario: User with Add and Edit access for CareGiver Name
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add and Edit access to CareGiver Name
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add caregiver name
  And the user should be able to edit caregiver name   
  But the user should not be able to delete caregiver name  

  Scenario: User with Add, Edit, and Delete access for CareGiver Name
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add, Edit, and Delete access to CareGiver Name   
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add caregiver name
  And the user should be able to edit caregiver name
  And the user should be able to delete caregiver name 
  
  Scenario: User with Add only access for Medical Health Card
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add access only to Medical Health Card   
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add medical health card   
  But the user should not be able to edit or delete medical health card 

  Scenario: User with Add and Edit access for Medical Health Card
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add and Edit access to Medical Health Card   
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add medical health card
  And the user should be able to edit medical health card    
  But the user should not be able to delete medical health card   
  
  Scenario: User with Add, Edit, and Delete access for Medical Health Card
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add, Edit, and Delete access to Medical Health Card   
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add medical health card
  And the user should be able to edit medical health card
  And the user should be able to delete medical health card
  
  Scenario: User with View only access for Feedback Form
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View access only to Feedback Form  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view feedback form   
  But the user should not be able to add or delete feedback form 

  Scenario: User with View and Add access for Feedback Form
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View and Add access to Feedback Form
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view feedback form
  And the user should be able to add feedback form    
  Then the system should prevent the user from deleting the feedback form   

  Scenario: User with View, Add, and Delete access for Feedback Form
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View, Add, and Delete access to Feedback Form   
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view feedback form
  And the user should be able to add feedback form
  And the user should be able to delete feedback form
  
  Scenario: User with Add only access for Patient Vitals
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add access only to Patient Vitals  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient vitals     
  But the user should not be able to edit or delete patient vitals  

  Scenario: User with Add and Edit access for Patient Vitals
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add and Edit access to Patient Vitals  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient vitals
  And the user should be able to edit patient vitals    
  But the user should not be able to delete patient vitals   

  Scenario: User with Add, Edit, and Delete access for Patient Vitals
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add, Edit, and Delete access to Patient Vitals   
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient vitals
  And the user should be able to edit patient vitals
  And the user should be able to delete patient vitals
  
  Scenario: User with Add only access for Patient Appointment
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add access only to Patient Appointment   
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient appointment   
  But the user should not be able to edit or delete patient appointment  

  Scenario: User with Add and Edit access for Patient Appointment
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add and Edit access to Patient Appointment
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient appointment
  And the user should be able to edit patient appointment    
  But the user should not be able to delete patient appointment   

  Scenario: User with Add, Edit, and Delete access for Patient Appointment
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Add, Edit, and Delete access to Patient Appointment    
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to add patient appointment
  And the user should be able to edit patient appointment
  And the user should be able to delete patient appointment 
  
  Scenario: User with View only access for Patient Medication ColorCode Setting
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View access only to Patient Medication ColorCode Setting 
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view color codes 
  But the user should not be able to add, edit, or delete color codes 

  Scenario: User with View and Add access for Patient Medication ColorCode Setting
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View and Add access to Patient Medication ColorCode Setting  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view color codes
  And the user should be able to add a color code 
  But the user should not be able to edit or delete color codes   

  Scenario: User with View, Add, and Edit access for Patient Medication ColorCode Setting
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View, Add, and Edit access to Patient Medication ColorCode Setting 
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view color codes
  And the user should be able to add a color code
  And the user should be able to edit a color code  
  But the user should not be able to delete color codes
  
  Scenario: User with full access for Patient Medication ColorCode Setting
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View, Add, Edit, and Delete access to Patient Medication ColorCode Setting   
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view color codes
  And the user should be able to add a color code
  And the user should be able to edit a color code
  And the user should be able to delete a color code  
  
  Scenario: Create user with Consent Settings access and check permissions
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Consent Settings access 
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view and manage Consent Settings  

  Scenario: Create user without Consent Settings access and check restrictions
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile without Consent Settings access 
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should not have access to Consent Settings via UI or direct URL
  
  Scenario: Create user with Intake Form Settings access and check permissions
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with Intake Form Settings access    
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view and manage Intake Form Settings 

  Scenario: Create user without Intake Form Settings access and check restrictions
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile without Intake Form Settings access 
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should not have access to Intake Form Settings via UI or direct URL  
  
  Scenario: User with View only access for Outgoing Call
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View access only to Outgoing Call 
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view outgoing calls 
  But the user should not be able to access call records
  
  Scenario: User with View and Call Record access for Outgoing Call
  Given I log in as admin for Patient module
  When I create a new user with email for Patient Module "testuser1_static@mailinator.com"
  And I create a profile with View and Call Record access to Outgoing Call  
  And I assign the profile and workspace to the user for Patient Module 
  And I reset the user's password for Patient Module 
  And I log in using the new user for Patient Module 
  Then the user should be able to view outgoing calls
  And the user should be able to access call records
  
  Scenario: Quick Text Validation on Blank Submission for Patient Module
  Given I log in as admin for Patient module
  When I navigate to the Patient page
  And I click on Add Quick Text
  And I leave all required fields blank Patient Module
  And I click Send for Patient Quick Text
  Then I should see validation messages for all required fields Patient Module
  And the patient quick text should not be created or updated
  
  Scenario: Send VCard Validation on Blank Submission for Patient Module
  Given I log in as admin for Patient module
  When I navigate to the Patient page
  And I click on Send VCard Patient Module
  And I leave all required fields blank Patient Module
  And I click Send for Patient VCard
  Then I should see validation messages for all required fields Send VCard Patient Module
  And the patient VCard should not be created or sent
  
  Scenario: Cancel Delete Patient Validation for Patient Module
  Given I log in as admin for Patient module
  When I navigate to the Patient page
  And I click on Delete Patient
  And I click Cancel on Delete Patient confirmation
  Then the patient should not be deleted
  
  
  
	
	
	
  
  
  
  



  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    
  
    
    
  
  
   
   
  
  
  
  
  
  
  
  
   
  
   
  
  
  
 
    
  
  
  
  
   
    
    
    
    
  
  
   
    

   
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
     
  
     
  
  
  
  
  
  
  
  
  
  
  
  
  
  
     
  
     
