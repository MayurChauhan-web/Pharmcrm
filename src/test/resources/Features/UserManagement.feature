Feature: Full User Management Flow

  Scenario: Create user with log-only access and check login
  Given I log in as admin
  When I create a new user with email "testuser1_static@mailinator.com"
  And I create a profile with log-only access 
  And I assign the profile and workspace to the user 
  And I reset the user's password   
  And I log in using the new user
  Then I should see only log access for the new user 

  Scenario: Create user without Setup Module access and check restrictions
  Given I log in as admin
  When I create a new user with email "testuser2_static@mailinator.com"
  And I create a profile without Setup Module access
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user   
  Then the user should have no Setup access via UI or direct URL   
     
  Scenario: Create user without Patient Module access and check restrictions
  Given I log in as admin
  When I create a new user with email "testuser3_static@mailinator.com"
  And I create a profile without Patient Module access   
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should have no patient access via UI or direct URL
  
  Scenario: Create user without Delivery Module access and check restrictions
  Given I log in as admin
  When I create a new user with email "testuser4_static@mailinator.com"
  And I create a profile without Delivery Module access     
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should have no Delivery access via UI or direct URL 
  
  Scenario: Create user without Drug Module access and check restrictions
  Given I log in as admin
  When I create a new user with email "testuser5_static@mailinator.com"
  And I create a profile without Drug Module access   
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should have no Drug access via UI or direct URL   
  
  Scenario: Create user without Workflow Module access and check restrictions
  Given I log in as admin
  When I create a new user with email "testuser6_static@mailinator.com"
  And I create a profile without Workflow Module access   
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should have no Workflow access via UI or direct URL    
  
  Scenario: User with only 'View' permission for Profile
  Given I log in as admin
  When I create a new user with email "testuser1_static@mailinator.com"
  And I create a profile with access only to the Setup Module → Profile with 'View' permission 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view profiles  
  And the user should not be able to add, edit, or delete any profiles 
 
  Scenario: User with full access (View, Add, Edit, Delete) for Profile
  Given I log in as admin
  When I create a new user with email "testuser1_static@mailinator.com"
  And I create a profile with full access to Setup Module → Profile 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view, add, edit, and delete profiles   
 
  Scenario: User with View only access for User
  Given I log in as admin
  When I create a new user with email "testuser1_static@mailinator.com"
  And I create a profile with View access only to Setup Module → User 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view users 
  But the user should not be able to add, edit, or delete users 
  
  Scenario: User with View and Add access for User
  Given I log in as admin
  When I create a new user with email "testuser2_static@mailinator.com"
  And I create a profile with View and Add access to Setup Module → User 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view users
  And the user should be able to add a new user 
  But the user should not be able to edit or delete users  
  
  Scenario: User with View, Add, and Edit access for User
  Given I log in as admin
  When I create a new user with email "testuser3_static@mailinator.com"
  And I create a profile with View, Add, and Edit access to Setup Module → User 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view users
  And the user should be able to add a new user
  And the user should be able to edit an existing user  
  But the user should not be able to delete users 

  Scenario: User with full access (View, Add, Edit, Delete) for User
  Given I log in as admin
  When I create a new user with email "testuser4_static@mailinator.com"
  And I create a profile with full access to Setup Module → User  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view users
  And the user should be able to add a new user
  And the user should be able to edit an existing user
  And the user should be able to delete a user 
  
  Scenario: User with View only access for Text Template
  Given I log in as admin
  When I create a new user with email "testuser2_static@mailinator.com"
  And I create a profile with View access only to Setup Module → Text Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view text templates 
  But the user should not be able to add, edit, or delete any text template 

  Scenario: User with View and Add access for Text Template
  Given I log in as admin
  When I create a new user with email "testuser9_static@mailinator.com"
  And I create a profile with View and Add access to Setup Module → Text Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view text templates
  And the user should be able to add a new text template 
  But the user should not be able to edit or delete any text template 
  
  Scenario: User with View, Add, and Edit access for Text Template
  Given I log in as admin
  When I create a new user with email "testuser10_static@mailinator.com"
  And I create a profile with View, Add, and Edit access to Setup Module → Text Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view text templates
  And the user should be able to add a new text template
  And the user should be able to edit an existing text template 
  But the user should not be able to delete any text template 
  
  Scenario: User with full access (View, Add, Edit, Delete) for Text Template
  Given I log in as admin
  When I create a new user with email "testuser11_static@mailinator.com"
  And I create a profile with full access to Setup Module → Text Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view text templates
  And the user should be able to add a new text template
  And the user should be able to edit an existing text template
  And the user should be able to delete a text template 
  
  Scenario: User with View only access for BOT Call Template
  Given I log in as admin
  When I create a new user with email "testuser1_static@mailinator.com"
  And I create a profile with View access only to Setup Module → BOT Call Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view BOT call templates 
  But the user should not be able to add, edit, or delete any BOT call template 
  
  Scenario: User with View and Add access for BOT Call Template
  Given I log in as admin
  When I create a new user with email "testuser3_static@mailinator.com"
  And I create a profile with View and Add access to Setup Module → BOT Call Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view BOT call templates
  And the user should be able to add a new BOT call template 
  But the user should not be able to edit or delete any BOT call template 
  
  Scenario: User with View, Add, and Edit access for BOT Call Template
  Given I log in as admin
  When I create a new user with email "testuser5_static@mailinator.com"
  And I create a profile with View, Add, and Edit access to Setup Module → BOT Call Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view BOT call templates
  And the user should be able to add a new BOT call template
  And the user should be able to edit an existing BOT call template 
  But the user should not be able to delete any BOT call template 
  
  Scenario: User with full access (View, Add, Edit, Delete) for BOT Call Template
  Given I log in as admin
  When I create a new user with email "testuser6_static@mailinator.com"
  And I create a profile with full access to Setup Module → BOT Call Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view BOT call templates
  And the user should be able to add a new BOT call template
  And the user should be able to edit an existing BOT call template
  And the user should be able to delete a BOT call template 
  
  Scenario: User with View only access for Mail Template
  Given I log in as admin
  When I create a new user with email "testuser1_static@mailinator.com"
  And I create a profile with View access only to Setup Module → Mail Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view mail templates  
  But the user should not be able to add, edit, or delete any mail template  

  Scenario: User with View and Add access for Mail Template
  Given I log in as admin
  When I create a new user with email "testuser3_static@mailinator.com"
  And I create a profile with View and Add access to Setup Module → Mail Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view mail templates
  And the user should be able to add a new mail template  
  But the user should not be able to edit or delete any mail template  

  Scenario: User with View, Add, and Edit access for Mail Template
  Given I log in as admin
  When I create a new user with email "testuser5_static@mailinator.com"
  And I create a profile with View, Add, and Edit access to Setup Module → Mail Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view mail templates
  And the user should be able to add a new mail template
  And the user should be able to edit an existing mail template  
  But the user should not be able to delete any mail template  

  Scenario: User with full access (View, Add, Edit, Delete) for Mail Template
  Given I log in as admin
  When I create a new user with email "testuser6_static@mailinator.com"
  And I create a profile with full access to Setup Module → Mail Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view mail templates
  And the user should be able to add a new mail template
  And the user should be able to edit an existing mail template
  And the user should be able to delete a mail template  

  Scenario: User with View only access for Fax Template
  Given I log in as admin
  When I create a new user with email "testuser1_static@mailinator.com"
  And I create a profile with View access only to Setup Module → Fax Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view fax templates  
  But the user should not be able to add, edit, or delete any fax template   

  Scenario: User with View and Add access for Fax Template
  Given I log in as admin
  When I create a new user with email "testuser4_static@mailinator.com"
  And I create a profile with View and Add access to Setup Module → Fax Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view fax templates
  And the user should be able to add a new fax template  
  But the user should not be able to edit or delete any fax template  
  
  Scenario: User with View, Add, and Edit access for Fax Template
  Given I log in as admin
  When I create a new user with email "testuser6_static@mailinator.com"
  And I create a profile with View, Add, and Edit access to Setup Module → Fax Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view fax templates
  And the user should be able to add a new fax template
  And the user should be able to edit an existing fax template   
  But the user should not be able to delete any fax template   

  Scenario: User with full access (View, Add, Edit, Delete) for Fax Template
  Given I log in as admin
  When I create a new user with email "testuser7_static@mailinator.com"
  And I create a profile with full access to Setup Module → Fax Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view fax templates
  And the user should be able to add a new fax template
  And the user should be able to edit an existing fax template
  And the user should be able to delete a fax template
    
  Scenario: User with View only access for Patient Signature Template
  Given I log in as admin
  When I create a new user with email "testuser2_static@mailinator.com"
  And I create a profile with View access only to Setup Module → Patient Signature Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view patient signature templates  
  But the user should not be able to add, edit, or delete any patient signature template  
  
  Scenario: User with View and Add access for Patient Signature Template
  Given I log in as admin
  When I create a new user with email "testuser4_static@mailinator.com"
  And I create a profile with View and Add access to Setup Module → Patient Signature Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view patient signature templates
  And the user should be able to add a new patient signature template   
  But the user should not be able to edit or delete any patient signature template  
  
  Scenario: User with View, Add, and Edit access for Patient Signature Template
  Given I log in as admin
  When I create a new user with email "testuser6_static@mailinator.com"
  And I create a profile with View, Add, and Edit access to Setup Module → Patient Signature Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view patient signature templates
  And the user should be able to add a new patient signature template
  And the user should be able to edit an existing patient signature template  
  But the user should not be able to delete any patient signature template  
  
  Scenario: User with full access (View, Add, Edit, Delete) for Patient Signature Template
  Given I log in as admin
  When I create a new user with email "testuser3_static@mailinator.com"
  And I create a profile with full access to Setup Module → Patient Signature Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view patient signature templates
  And the user should be able to add a new patient signature template
  And the user should be able to edit an existing patient signature template
  And the user should be able to delete a patient signature template  

  Scenario: User with View only access for Feedback Form
  Given I log in as admin
  When I create a new user with email "testuser5_static@mailinator.com"
  And I create a profile with View access only to Setup Module → Feedback Form 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view feedback forms  
  But the user should not be able to add, edit, or delete any feedback form  
  
  Scenario: User with View and Add access for Feedback Form
  Given I log in as admin
  When I create a new user with email "testuser3_static@mailinator.com"
  And I create a profile with View and Add access to Setup Module → Feedback Form 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view feedback forms
  And the user should be able to add a new feedback form  
  But the user should not be able to edit or delete any feedback form  

  Scenario: User with View, Add, and Edit access for Feedback Form
  Given I log in as admin
  When I create a new user with email "testuser3_static@mailinator.com"
  And I create a profile with View, Add, and Edit access to Setup Module → Feedback Form 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view feedback forms
  And the user should be able to add a new feedback form
  And the user should be able to edit an existing feedback form  
  But the user should not be able to delete any feedback form  

  Scenario: User with full access (View, Add, Edit, Delete) for Feedback Form
  Given I log in as admin
  When I create a new user with email "testuser6_static@mailinator.com"
  And I create a profile with full access to Setup Module → Feedback Form  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view feedback forms
  And the user should be able to add a new feedback form
  And the user should be able to edit an existing feedback form
  And the user should be able to delete a feedback form  
  
  Scenario: Create user without Update access to Default Mail Template and check restrictions
  Given I log in as admin
  When I create a new user with email "testuser22_static@mailinator.com"
  And I create a profile without Update access to Setup Module → Default Mail Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should have no Default Mail Template access via UI or direct URL     

  Scenario: Create user without Update access to Default Fax Template and check restrictions
  Given I log in as admin
  When I create a new user with email "testuser23_static@mailinator.com"
  And I create a profile without Update access to Setup Module → Default Fax Template   
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should have no Default Fax Template access via UI or direct URL   
  
  Scenario: User with View only access for Organization Bucket
  Given I log in as admin
  When I create a new user with email "testuser24_static@mailinator.com"
  And I create a profile with View access only to Organization Bucket 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view files in the Organization Bucket 
  But the user should not be able to add, edit, delete, or download any files 

  Scenario: User with View and Add File access for Organization Bucket
  Given I log in as admin
  When I create a new user with email "testuser2_static@mailinator.com"
  And I create a profile with View and Add File access to Organization Bucket
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view files in the Organization Bucket
  And the user should be able to add a new file  
  But the user should not be able to edit, delete, or download any files  

  Scenario: User with View, Add File, and Edit File access for Organization Bucket
  Given I log in as admin
  When I create a new user with email "testuser3_static@mailinator.com"
  And I create a profile with View, Add File, and Edit File access to Organization Bucket
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view files in the Organization Bucket
  And the user should be able to add a new file
  And the user should be able to edit an existing file 
  But the user should not be able to delete or download any files  

  Scenario: User with View, Add File, Edit File, and Delete File access for Organization Bucket
  Given I log in as admin
  When I create a new user with email "testuser6_static@mailinator.com"
  And I create a profile with View, Add, Edit, and Delete File access to Organization Bucket
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view files in the Organization Bucket
  And the user should be able to add a new file
  And the user should be able to edit an existing file
  And the user should be able to delete a file 
  But the user should not be able to download any file  

  Scenario: User with full access (View, Add, Edit, Delete, Download) for Organization Bucket
  Given I log in as admin
  When I create a new user with email "testuser8_static@mailinator.com"
  And I create a profile with full access to Organization Bucket
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view files in the Organization Bucket
  And the user should be able to add a new file
  And the user should be able to edit an existing file
  And the user should be able to delete a file
  And the user should be able to download a file 
  
  Scenario: Create user without Update access to Bucket Setting and check restrictions
  Given I log in as admin
  When I create a new user with email "testuser24_static@mailinator.com"
  And I create a profile without Update access to Setup Module → Bucket Setting    
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should have no Bucket Setting access via UI or direct URL    

  Scenario: User with View only access for Reminders
  Given I log in as admin
  When I create a new user with email "testuser25_static@mailinator.com"
  And I create a profile with only View access to Setup Module → Reminders 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view reminders  
  But the user should not see any action buttons for reminders 

  Scenario: User with View and Action View access for Reminders
  Given I log in as admin
  When I create a new user with email "testuser26_static@mailinator.com"
  And I create a profile with View and Action View access to Setup Module → Reminders 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view reminders
  And the user should see action buttons and perform allowed reminder actions   

  Scenario: Create user without Update access to Setup Module → Application Status and check restrictions
  Given I log in as admin
  When I create a new user with email "testuser1_static@mailinator.com"
  And I create a profile without Update access to Setup Module → Application Status   
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should have no Application Status update access via UI or direct URL 
  
  Scenario: Create user without Update access to Setup Module → Brand Management and check restrictions
  Given I log in as admin
  When I create a new user with email "testuser2_static@mailinator.com"
  And I create a profile without Update access to Setup Module → Brand Management 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should have no Brand Management update access via UI or direct URL 
  
  Scenario: Create user without Send VCard access to Setup Module → Brand Management and check restrictions
  Given I log in as admin
  When I create a new user with email "testuser3_static@mailinator.com"
  And I create a profile without Send VCard access to Setup Module → Brand Management 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should not see the Send VCard option in Brand Management 
  
  Scenario: User with only View access to Organization Calendar
  Given I log in as admin
  When I create a new user with email "testuser5_static@mailinator.com"
  And I create a profile with only View access to Organization Calendar
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view Organization Calendar entries 
  But the user should not be able to edit any Organization Calendar entry 

  Scenario: User with View and Edit access to Organization Calendar
  Given I log in as admin
  When I create a new user with email "testuser6_static@mailinator.com"
  And I create a profile with View and Edit access to Organization Calendar 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view Organization Calendar entries
  And the user should be able to edit an Organization Calendar entry  
  
  Scenario: User without Update access to Technical Setting
  Given I log in as admin
  When I create a new user with email "testuser7_static@mailinator.com"
  When I create a profile without Update access to Technical Setting 
  And I assign the profile and workspace to the user
  And I reset the user's password   
  And I log in using the new user
  Then the user should have no Technical Setting update access via UI or direct URL  
  
  Scenario: User without Update access to Notification Setting
  Given I log in as admin
  When I create a new user with email "testuser8_static@mailinator.com"
  When I create a profile without Update access to Notification Setting 
  And I assign the profile and workspace to the user
  And I reset the user's password   
  And I log in using the new user
  Then the user should have no Notification Setting update access via UI or direct URL 

  Scenario: User without Update access to Text Forward Setting
  Given I log in as admin
  When I create a new user with email "testuser9_static@mailinator.com"
  When I create a profile without Update access to Text Forward Setting 
  And I assign the profile and workspace to the user
  And I reset the user's password   
  And I log in using the new user
  Then the user should have no Text Forward Setting update access via UI or direct URL

  Scenario: User with View only access to EHR Types
  Given I log in as admin
  When I create a new user with email "testuser10_static@mailinator.com"
  And I create a profile with View access only to EHR Types 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view EHR Types   
  But the user should not be able to add, edit, or delete any EHR Types 

  Scenario: User with View and Add access to EHR Types
  Given I log in as admin
  When I create a new user with email "testuser11_static@mailinator.com"
  And I create a profile with View and Add access to EHR Types  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view EHR Types
  And the user should be able to add a new EHR Type 
  But the user should not be able to edit or delete any EHR Types 

  Scenario: User with View, Add, and Edit access to EHR Types
  Given I log in as admin
  When I create a new user with email "testuser13_static@mailinator.com"
  And I create a profile with View, Add, and Edit access to EHR Types  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view EHR Types
  And the user should be able to add a new EHR Type
  And the user should be able to edit an existing EHR Type  
  But the user should not be able to delete any EHR Types 

  Scenario: User with View, Add, Edit, and Delete access to EHR Types
  Given I log in as admin
  When I create a new user with email "testuser15_static@mailinator.com"
  And I create a profile with View, Add, Edit, and Delete access to EHR Types      
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view EHR Types
  And the user should be able to add a new EHR Type
  And the user should be able to edit an existing EHR Type
  And the user should be able to delete an EHR Type 

  Scenario: User with View only access for Progress Step
  Given I log in as admin
  When I create a new user with email "testuser16_static@mailinator.com"
  And I create a profile with View access only to Progress Step
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view entries in the Progress Step 
  But the user should not be able to add, edit, or delete any Progress Step entries 

  Scenario: User with View and Add access for Progress Step
  Given I log in as admin
  When I create a new user with email "testuser17_static@mailinator.com"
  And I create a profile with View and Add access to Progress Step 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view entries in the Progress Step
  And the user should be able to add a new Progress Step entry 
  But the user should not be able to edit or delete any Progress Step entries 

  Scenario: User with View, Add, and Edit access for Progress Step
  Given I log in as admin
  When I create a new user with email "testuser32_static@mailinator.com"
  And I create a profile with View, Add, and Edit access to Progress Step 
  And I assign the profile and workspace to the user  
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view entries in the Progress Step
  And the user should be able to add a new Progress Step entry
  And the user should be able to edit an existing Progress Step entry 
  But the user should not be able to delete any Progress Step entries 

  Scenario: User with full access to Progress Step
  Given I log in as admin
  When I create a new user with email "testuser34_static@mailinator.com"
  And I create a profile with View, Add, Edit, and Delete access to Progress Step 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view entries in the Progress Step
  And the user should be able to add a new Progress Step entry
  And the user should be able to edit an existing Progress Step entry
  And the user should be able to delete a Progress Step entry 
  
  Scenario: User with View only access for Whitelist IP
  Given I log in as admin
  When I create a new user with email "testuser1_static@mailinator.com"
  And I create a profile with View access only to Whitelist IP 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view the list of Whitelist IP entries 
  But the user should not be able to add or delete IPs 
  And the user should not be able to exclude or remove excluded users 
  
  Scenario: User with View and Add access for Whitelist IP
  Given I log in as admin
  When I create a new user with email "testuser2_static@mailinator.com"
  And I create a profile with View and Add access to Whitelist IP 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view the list of Whitelist IP entries
  And the user should be able to add a new Whitelist IP 
  But the user should not be able to delete IPs or manage excluded users 

  Scenario: User with View, Add, and Delete access for Whitelist IP
  Given I log in as admin
  When I create a new user with email "testuser4_static@mailinator.com"
  And I create a profile with View, Add, and Delete access to Whitelist IP  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view the list of Whitelist IP entries
  And the user should be able to add a new Whitelist IP
  And the user should be able to delete a Whitelist IP 
  But the user should not be able to exclude or remove excluded users

  Scenario: User with full access to Whitelist IP
  Given I log in as admin
  When I create a new user with email "testuser7_static@mailinator.com"
  And I create a profile with View, Add, Delete, Exclude User, and Remove Excluded User access to Whitelist IP 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view the list of Whitelist IP entries
  And the user should be able to add a new Whitelist IP
  And the user should be able to delete a Whitelist IP
  And the user should be able to exclude a user from Whitelist IP 
  And the user should be able to remove an excluded user 
  
  Scenario: User with View only access to Designation
  Given I log in as admin
  When I create a new user with email "testuser8_static@mailinator.com"
  And I create a profile with View access only to Designation
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view the Designation list 
  But the user should not be able to add, edit, or delete any Designation  

  Scenario: User with View and Add access to Designation
  Given I log in as admin
  When I create a new user with email "testuser9_static@mailinator.com"
  And I create a profile with View and Add access to Designation  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view the Designation list
  And the user should be able to add a new Designation 
  But the user should not be able to edit or delete any Designation 

  Scenario: User with View, Add, and Edit access to Designation
  Given I log in as admin
  When I create a new user with email "testuser11_static@mailinator.com"
  And I create a profile with View, Add, and Edit access to Designation 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view the Designation list
  And the user should be able to add a new Designation
  And the user should be able to edit an existing Designation 
  But the user should not be able to delete any Designation 

  Scenario: User with full access to Designation
  Given I log in as admin
  When I create a new user with email "testuser12_static@mailinator.com"
  And I create a profile with View, Add, Edit, and Delete access to Designation  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view the Designation list
  And the user should be able to add a new Designation
  And the user should be able to edit an existing Designation
  And the user should be able to delete a Designation 

  Scenario: User with View only access to Professional License Type
  Given I log in as admin
  When I create a new user with email "testuser13_static@mailinator.com"
  And I create a profile with View access only to Professional License Type 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view the Professional License Type list 
  But the user should not be able to add, edit, or delete any Professional License Type 

  Scenario: User with View and Add access to Professional License Type
  Given I log in as admin
  When I create a new user with email "testuser14_static@mailinator.com"
  And I create a profile with View and Add access to Professional License Type  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view the Professional License Type list
  And the user should be able to add a new Professional License Type 
  But the user should not be able to edit or delete any Professional License Type 

  Scenario: User with View, Add, and Edit access to Professional License Type
  Given I log in as admin
  When I create a new user with email "testuser15_static@mailinator.com"
  And I create a profile with View, Add, and Edit access to Professional License Type 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view the Professional License Type list
  And the user should be able to add a new Professional License Type
  And the user should be able to edit an existing Professional License Type 
  But the user should not be able to delete any Professional License Type 

  Scenario: User with full access to Professional License Type
  Given I log in as admin
  When I create a new user with email "testuser16_static@mailinator.com"
  And I create a profile with View, Add, Edit, and Delete access to Professional License Type 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view the Professional License Type list
  And the user should be able to add a new Professional License Type
  And the user should be able to edit an existing Professional License Type
  And the user should be able to delete a Professional License Type 
  
  Scenario: User with View only access to Fax Setting
  Given I log in as admin
  When I create a new user with email "testuser17_static@mailinator.com"
  And I create a profile with View access only to Fax Setting 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view the Fax Setting list 
  But the user should not be able to add, edit, or delete any Fax Setting 

  Scenario: User with View and Add access to Fax Setting
  Given I log in as admin
  When I create a new user with email "testuser18_static@mailinator.com"
  And I create a profile with View and Add access to Fax Setting 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view the Fax Setting list
  And the user should be able to add a new Fax Setting 
  But the user should not be able to edit or delete any Fax Setting 

  Scenario: User with View, Add, and Edit access to Fax Setting
  Given I log in as admin
  When I create a new user with email "testuser19_static@mailinator.com"
  And I create a profile with View, Add, and Edit access to Fax Setting  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view the Fax Setting list
  And the user should be able to add a new Fax Setting
  And the user should be able to edit an existing Fax Setting 
  But the user should not be able to delete any Fax Setting 

  Scenario: User with full access to Fax Setting
  Given I log in as admin
  When I create a new user with email "testuser20_static@mailinator.com"
  And I create a profile with View, Add, Edit, and Delete access to Fax Setting  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view the Fax Setting list
  And the user should be able to add a new Fax Setting
  And the user should be able to edit an existing Fax Setting
  And the user should be able to delete a Fax Setting 
  
  Scenario: User without access to Driver and SalesRep User
  Given I log in as admin
  When I create a new user with email "testuser21_static@mailinator.com"
  When I create a profile without any access to Driver and SalesRep User 
  And I assign the profile and workspace to the user
  And I reset the user's password   
  And I log in using the new user
  Then the user should not be able to access the Driver and SalesRep User page via direct URL  

  Scenario: User without Text View permission should not see the Text page
  Given I log in as admin
  When I create a new user with email "testuser27_static@mailinator.com"
  And I create a profile without View access to Text Page 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should have no Text page access via UI or direct URL    
  
  Scenario: User without Call Activity View permission should not see the Call Activity page
  Given I log in as admin
  When I create a new user with email "testuser28_static@mailinator.com"
  And I create a profile without Call Activity View permission to Call Activity Page 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should have no Call Activity access via UI or direct URL  

  Scenario: User without BOT Call View permission should not see the BOT Call page
  Given I log in as admin
  When I create a new user with email "testuser29_static@mailinator.com"
  And I create a profile without BOT Call View permission to BOT Call Page  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should have no BOT Call View access via UI or direct URL  
  
  Scenario: User without Fax View permission should not see the Fax page
  Given I log in as admin
  When I create a new user with email "testuser30_static@mailinator.com"
  And I create a profile without Fax View permission to Fax Page 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should have no Fax View access via UI or direct URL  

  Scenario: User without Mail View permission should not see the Mail page
  Given I log in as admin
  When I create a new user with email "testuser31_static@mailinator.com"
  And I create a profile without Mail View permission to Mail Page 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should have no Mail View access via UI or direct URL  

  Scenario: User with View Detail access only for Workspace User
  Given I log in as admin
  When I create a new user with email "testuser32_static@mailinator.com"
  And I create a profile with View Detail access only to Setup Module → Workspace User  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view workspace user details 
  But the user should not be able to reset password, change profile, link or delink employee to user 

  @Setup
  Scenario: User with View Detail and Reset Password access for Workspace User
  Given I log in as admin
  When I create a new user with email "testuser34_static@mailinator.com"
  And I create a profile with View Detail and Reset Password access to Setup Module → Workspace User 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view workspace user details
  And the user should be able to reset password for a workspace user 
  But the user should not be able to change profile, link or delink employee to user 

  Scenario: User with View Detail, Reset Password, and Change Profile access for Workspace User
  Given I log in as admin
  When I create a new user with email "testuser31_static@mailinator.com"
  And I create a profile with View Detail, Reset Password, and Change Profile access to Setup Module → Workspace User 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view workspace user details
  And the user should be able to reset password for a workspace user
  And the user should be able to change profile for a workspace user 
  But the user should not be able to link or delink employee to user 
  
  Scenario: User with full access for Workspace User
  Given I log in as admin
  When I create a new user with email "testuser31_static@mailinator.com"
  And I create a profile with View Detail, Reset Password, Change Profile, Link Employee To User, and DeLink Employee To User access to Setup Module → Workspace User  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view workspace user details
  And the user should be able to reset password for a workspace user
  And the user should be able to change profile for a workspace user
  And the user should be able to link and delink employee to a workspace user        





  
  
  
  