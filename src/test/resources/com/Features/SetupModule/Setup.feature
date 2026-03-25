Feature: Entire Setup Module.

# Audit View 
@Setup
Scenario: User with View only access for General Audit View test
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Setup Module General Audit View test
Then the user should be able to view General Audit View settings in Setup Module test

Scenario: User with No access for General (Audit View)
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with No access to Setup Module General Audit View test
Then the user should not be able to view General Audit View settings test

# Dashboard
Scenario: Create user with log-only access and check login
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with log-only access test
Then I should see only log access for the new user test

Scenario: Create user without Setup Module access and check restrictions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile without Setup Module access test
Then the user should have no Setup access via UI or direct URL test
  
Scenario: Create user without Patient Module access and check restrictions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile without Patient Module access test
Then the user should have no patient access via UI or direct URL test

Scenario: Create user without Delivery Module access and check restrictions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile without Delivery Module access test  
Then the user should have no Delivery access via UI or direct URL test
  
Scenario: Create user without Drug Module access and check restrictions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile without Drug Module access test
Then the user should have no Drug access via UI or direct URL test

Scenario: Create user without Workflow Module access and check restrictions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile without Workflow Module access test
Then the user should have no Workflow access via UI or direct URL test

# Profile
Scenario: User with only 'View' permission for Profile
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with access only to the Setup Module → Profile with 'View' permission test
Then the user should be able to view profiles test
And the user should not be able to add, edit, or delete any profiles test

Scenario: User with full access (View, Add, Edit, Delete) for Profile
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with full access to Setup Module → Profile test
Then the user should be able to view, add, edit, and delete profiles test

# User
Scenario: User with View only access for User
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Setup Module → User test
Then the user should be able to view users test
But the user should not be able to add, edit, or delete users test

Scenario: User with View and Add access for User
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Add access to Setup Module → User test
Then the user should be able to view users test
And the user should be able to add a new user test
But the user should not be able to edit or delete users test

Scenario: User with View, Add, and Edit access for User
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, and Edit access to Setup Module → User test
Then the user should be able to view users test
And the user should be able to add a new user test
And the user should be able to edit an existing user test
But the user should not be able to delete users test

Scenario: User with full access (View, Add, Edit, Delete) for User
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with full access to Setup Module → User test
Then the user should be able to view users test
And the user should be able to add a new user test
And the user should be able to edit an existing user test
And the user should be able to delete a user test

# Text Template
Scenario: User with View only access for Text Template
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Setup Module → Text Template test
Then the user should be able to view text templates test
But the user should not be able to add, edit, or delete any text template test

Scenario: User with View and Add access for Text Template
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Add access to Setup Module → Text Template test
Then the user should be able to view text templates test
And the user should be able to add a new text template test
But the user should not be able to edit or delete any text template test

Scenario: User with View, Add, and Edit access for Text Template
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, and Edit access to Setup Module → Text Template test
Then the user should be able to view text templates test
And the user should be able to add a new text template test
And the user should be able to edit an existing text template test 
But the user should not be able to delete any text template test

Scenario: User with full access (View, Add, Edit, Delete) for Text Template
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with full access to Setup Module → Text Template test
Then the user should be able to view text templates test
And the user should be able to add a new text template test
And the user should be able to edit an existing text template test
And the user should be able to delete a text template test

# BOT Call Template
Scenario: User with View only access for BOT Call Template
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Setup Module → BOT Call Template test
Then the user should be able to view BOT call templates test
But the user should not be able to add, edit, or delete any BOT call template test

Scenario: User with View and Add access for BOT Call Template
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Add access to Setup Module → BOT Call Template test
Then the user should be able to view BOT call templates test
And the user should be able to add a new BOT call template test
But the user should not be able to edit or delete any BOT call template test

Scenario: User with View, Add, and Edit access for BOT Call Template
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, and Edit access to Setup Module → BOT Call Template test
Then the user should be able to view BOT call templates test
And the user should be able to add a new BOT call template test
And the user should be able to edit an existing BOT call template test
But the user should not be able to delete any BOT call template test

Scenario: User with full access (View, Add, Edit, Delete) for BOT Call Template
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with full access to Setup Module → BOT Call Template test
Then the user should be able to view BOT call templates test
And the user should be able to add a new BOT call template test
And the user should be able to edit an existing BOT call template test
And the user should be able to delete a BOT call template test

# Mail Template
Scenario: User with View only access for Mail Template
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Setup Module → Mail Template test
Then the user should be able to view mail templates test
But the user should not be able to add, edit, or delete any mail template test

Scenario: User with View and Add access for Mail Template
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Add access to Setup Module → Mail Template test
Then the user should be able to view mail templates test
And the user should be able to add a new mail template test
But the user should not be able to edit or delete any mail template test

Scenario: User with View, Add, and Edit access for Mail Template
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, and Edit access to Setup Module → Mail Template test
Then the user should be able to view mail templates test
And the user should be able to add a new mail template test
And the user should be able to edit an existing mail template test
But the user should not be able to delete any mail template test

Scenario: User with full access (View, Add, Edit, Delete) for Mail Template
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with full access to Setup Module → Mail Template test
Then the user should be able to view mail templates test
And the user should be able to add a new mail template test
And the user should be able to edit an existing mail template test
And the user should be able to delete a mail template test

# Fax Template
Scenario: User with View only access for Fax Template
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Setup Module → Fax Template test
Then the user should be able to view fax templates test
But the user should not be able to add, edit, or delete any fax template test

Scenario: User with View and Add access for Fax Template
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Add access to Setup Module → Fax Template test
Then the user should be able to view fax templates test
And the user should be able to add a new fax template test
But the user should not be able to edit or delete any fax template test

Scenario: User with View, Add, and Edit access for Fax Template
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, and Edit access to Setup Module → Fax Template test
Then the user should be able to view fax templates test
And the user should be able to add a new fax template test
And the user should be able to edit an existing fax template test
But the user should not be able to delete any fax template test

Scenario: User with full access (View, Add, Edit, Delete) for Fax Template
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with full access to Setup Module → Fax Template test
Then the user should be able to view fax templates test
And the user should be able to add a new fax template test
And the user should be able to edit an existing fax template test
And the user should be able to delete a fax template test
  
# Patient Signature Template 
Scenario: User with View only access for Patient Signature Template
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Setup Module → Patient Signature Template test
Then the user should be able to view patient signature templates test
But the user should not be able to add, edit, or delete any patient signature template test

Scenario: User with View and Add access for Patient Signature Template
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Add access to Setup Module → Patient Signature Template test
Then the user should be able to view patient signature templates test
And the user should be able to add a new patient signature template test 
But the user should not be able to edit or delete any patient signature template test
  
Scenario: User with View, Add, and Edit access for Patient Signature Template
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, and Edit access to Setup Module → Patient Signature Template test
Then the user should be able to view patient signature templates test
And the user should be able to add a new patient signature template test
And the user should be able to edit an existing patient signature template test
But the user should not be able to delete any patient signature template test

Scenario: User with full access (View, Add, Edit, Delete) for Patient Signature Template
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with full access to Setup Module → Patient Signature Template test
Then the user should be able to view patient signature templates test
And the user should be able to add a new patient signature template test
And the user should be able to edit an existing patient signature template test
And the user should be able to delete a patient signature template test

# Feedback Form
Scenario: User with View only access for Feedback Form
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Setup Module → Feedback Form test
Then the user should be able to view feedback forms test
But the user should not be able to add, edit, or delete any feedback form test

Scenario: User with View and Add access for Feedback Form
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Add access to Setup Module → Feedback Form test
Then the user should be able to view feedback forms test
And the user should be able to add a new feedback form test
But the user should not be able to edit or delete any feedback form test

Scenario: User with View, Add, and Edit access for Feedback Form
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, and Edit access to Setup Module → Feedback Form test
Then the user should be able to view feedback forms test
And the user should be able to add a new feedback form test
And the user should be able to edit an existing feedback form test 
But the user should not be able to delete any feedback form test

Scenario: User with full access (View, Add, Edit, Delete) for Feedback Form
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with full access to Setup Module → Feedback Form test
Then the user should be able to view feedback forms test
And the user should be able to add a new feedback form test
And the user should be able to edit an existing feedback form test
And the user should be able to delete a feedback form test

# Default Mail Template
Scenario: Create user without Update access to Default Mail Template and check restrictions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile without Update access to Setup Module → Default Mail Template test
Then the user should have no Default Mail Template access via UI or direct URL test

# Default Fax Template
Scenario: Create user without Update access to Default Fax Template and check restrictions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile without Update access to Setup Module → Default Fax Template test
Then the user should have no Default Fax Template access via UI or direct URL test

# Organization Bucket
Scenario: User with View only access for Organization Bucket
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Organization Bucket test
Then the user should be able to view files in the Organization Bucket test
But the user should not be able to add, edit, delete, or download any files test

Scenario: User with View and Add File access for Organization Bucket
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Add File access to Organization Bucket test
Then the user should be able to view files in the Organization Bucket test
And the user should be able to add a new file test
But the user should not be able to edit, delete, or download any files test

Scenario: User with View, Add File, and Edit File access for Organization Bucket
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add File, and Edit File access to Organization Bucket test
Then the user should be able to view files in the Organization Bucket test
And the user should be able to add a new file test
And the user should be able to edit an existing file test 
But the user should not be able to delete or download any files test  

Scenario: User with View, Add File, Edit File, and Delete File access for Organization Bucket
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, Edit, and Delete File access to Organization Bucket test
Then the user should be able to view files in the Organization Bucket test
And the user should be able to add a new file test
And the user should be able to edit an existing file test
And the user should be able to delete a file test
But the user should not be able to download any file test

Scenario: User with full access (View, Add, Edit, Delete, Download) for Organization Bucket
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with full access to Organization Bucket test
Then the user should be able to view files in the Organization Bucket test
And the user should be able to add a new file test
And the user should be able to edit an existing file test
And the user should be able to delete a file test
And the user should be able to download a file test

# Bucket Setting
Scenario: Create user without Update access to Bucket Setting and check restrictions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile without Update access to Setup Module → Bucket Setting test 
Then the user should have no Bucket Setting access via UI or direct URL test

# Reminders
Scenario: User with View only access for Reminders
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with only View access to Setup Module → Reminders test
Then the user should be able to view reminders test
But the user should not see any action buttons for reminders test

Scenario: User with View and Action View access for Reminders
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Action View access to Setup Module → Reminders test
Then the user should be able to view reminders test
And the user should see action buttons and perform allowed reminder actions test
  
# Application Status
Scenario: Create user without Update access to Setup Module → Application Status and check restrictions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile without Update access to Setup Module → Application Status test
Then the user should have no Application Status update access via UI or direct URL test

# Brand Management
Scenario: Create user without Update access to Setup Module → Brand Management and check restrictions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile without Update access to Setup Module → Brand Management test
Then the user should have no Brand Management update access via UI or direct URL test

Scenario: Create user without Send VCard access to Setup Module → Brand Management and check restrictions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile without Send VCard access to Setup Module → Brand Management test
Then the user should not see the Send VCard option in Brand Management test

# Organization Calendar
Scenario: User with only View access to Organization Calendar
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with only View access to Organization Calendar test
Then the user should be able to view Organization Calendar entries test
But the user should not be able to edit any Organization Calendar entry test

Scenario: User with View and Edit access to Organization Calendar
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Edit access to Organization Calendar test
Then the user should be able to view Organization Calendar entries test
And the user should be able to edit an Organization Calendar entry test

# Technical Setting
Scenario: User without Update access to Technical Setting
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
When I create a profile without Update access to Technical Setting test
Then the user should have no Technical Setting update access via UI or direct URL test

# Notification Setting
Scenario: User without Update access to Notification Setting
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
When I create a profile without Update access to Notification Setting test
Then the user should have no Notification Setting update access via UI or direct URL test

# Text Forward Setting
Scenario: User without Update access to Text Forward Setting
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
When I create a profile without Update access to Text Forward Setting test
Then the user should have no Text Forward Setting update access via UI or direct URL test

# EHR Types
Scenario: User with View only access to EHR Types
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to EHR Types test
Then the user should be able to view EHR Types test
But the user should not be able to add, edit, or delete any EHR Types test

Scenario: User with View and Add access to EHR Types
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Add access to EHR Types test
Then the user should be able to view EHR Types test
And the user should be able to add a new EHR Type test
But the user should not be able to edit or delete any EHR Types test

Scenario: User with View, Add, and Edit access to EHR Types
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, and Edit access to EHR Types test
Then the user should be able to view EHR Types test
And the user should be able to add a new EHR Type test
And the user should be able to edit an existing EHR Type test  
But the user should not be able to delete any EHR Types test

Scenario: User with View, Add, Edit, and Delete access to EHR Types
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, Edit, and Delete access to EHR Types test   
Then the user should be able to view EHR Types test
And the user should be able to add a new EHR Type test
And the user should be able to edit an existing EHR Type test
And the user should be able to delete an EHR Type test

# Progress Step
Scenario: User with View only access for Progress Step
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Progress Step test
Then the user should be able to view entries in the Progress Step test
But the user should not be able to add, edit, or delete any Progress Step entries test

Scenario: User with View and Add access for Progress Step
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Add access to Progress Step test
Then the user should be able to view entries in the Progress Step test
And the user should be able to add a new Progress Step entry test
But the user should not be able to edit or delete any Progress Step entries test

Scenario: User with View, Add, and Edit access for Progress Step
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, and Edit access to Progress Step test
Then the user should be able to view entries in the Progress Step test
And the user should be able to add a new Progress Step entry test
And the user should be able to edit an existing Progress Step entry test 
But the user should not be able to delete any Progress Step entries test

Scenario: User with full access to Progress Step
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, Edit, and Delete access to Progress Step test
Then the user should be able to view entries in the Progress Step test
And the user should be able to add a new Progress Step entry test
And the user should be able to edit an existing Progress Step entry test
And the user should be able to delete a Progress Step entry test

# Whitelist IP
Scenario: User with View only access for Whitelist IP
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Whitelist IP test
Then the user should be able to view the list of Whitelist IP entries test 
But the user should not be able to add or delete IPs test
And the user should not be able to exclude or remove excluded users test

Scenario: User with View and Add access for Whitelist IP
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Add access to Whitelist IP test
Then the user should be able to view the list of Whitelist IP entries test
And the user should be able to add a new Whitelist IP test
But the user should not be able to delete IPs or manage excluded users test

Scenario: User with View, Add, and Delete access for Whitelist IP
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, and Delete access to Whitelist IP test
Then the user should be able to view the list of Whitelist IP entries test
And the user should be able to add a new Whitelist IP test
And the user should be able to delete a Whitelist IP test
But the user should not be able to exclude or remove excluded users test
  
Scenario: User with full access to Whitelist IP
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, Delete, Exclude User, and Remove Excluded User access to Whitelist IP test
Then the user should be able to view the list of Whitelist IP entries test
And the user should be able to add a new Whitelist IP test
And the user should be able to delete a Whitelist IP test
And the user should be able to exclude a user from Whitelist IP test
And the user should be able to remove an excluded user test

# Designation
Scenario: User with View only access to Designation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Designation test
Then the user should be able to view the Designation list test
But the user should not be able to add, edit, or delete any Designation test

Scenario: User with View and Add access to Designation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Add access to Designation test
Then the user should be able to view the Designation list test
And the user should be able to add a new Designation test
But the user should not be able to edit or delete any Designation test
  
Scenario: User with View, Add, and Edit access to Designation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Add access to Designation test
Then the user should be able to view the Designation list test
And the user should be able to add a new Designation test
But the user should not be able to edit or delete any Designation test  
 
Scenario: User with full access to Designation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, Edit, and Delete access to Designation test
Then the user should be able to view the Designation list test
And the user should be able to add a new Designation test
And the user should be able to edit an existing Designation test
And the user should be able to delete a Designation test

# Professional License Type
Scenario: User with View only access to Professional License Type
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Professional License Type test
Then the user should be able to view the Professional License Type list test
But the user should not be able to add, edit, or delete any Professional License Type test

Scenario: User with View and Add access to Professional License Type
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Add access to Professional License Type test
Then the user should be able to view the Professional License Type list test
And the user should be able to add a new Professional License Type test
But the user should not be able to edit or delete any Professional License Type test

Scenario: User with View, Add, and Edit access to Professional License Type
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, and Edit access to Professional License Type test
Then the user should be able to view the Professional License Type list test
And the user should be able to add a new Professional License Type test
And the user should be able to edit an existing Professional License Type test
But the user should not be able to delete any Professional License Type test
 
Scenario: User with full access to Professional License Type
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, Edit, and Delete access to Professional License Type test
Then the user should be able to view the Professional License Type list test
And the user should be able to add a new Professional License Type test
And the user should be able to edit an existing Professional License Type test
And the user should be able to delete a Professional License Type test

# Fax Setting
Scenario: User with View only access to Fax Setting
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Fax Setting test
Then the user should be able to view the Fax Setting list test
But the user should not be able to add, edit, or delete any Fax Setting test

Scenario: User with View and Add access to Fax Setting
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Add access to Fax Setting test
Then the user should be able to view the Fax Setting list test
And the user should be able to add a new Fax Setting test
But the user should not be able to edit or delete any Fax Setting test

Scenario: User with View, Add, and Edit access to Fax Setting
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, and Edit access to Fax Setting test
Then the user should be able to view the Fax Setting list test
And the user should be able to add a new Fax Setting test
And the user should be able to edit an existing Fax Setting test
But the user should not be able to delete any Fax Setting test

Scenario: User with full access to Fax Setting
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, Edit, and Delete access to Fax Setting test
Then the user should be able to view the Fax Setting list test
And the user should be able to add a new Fax Setting test
And the user should be able to edit an existing Fax Setting test
And the user should be able to delete a Fax Setting test

# Driver And SalesRep User
Scenario: User without access to Driver and SalesRep User
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
When I create a profile without any access to Driver and SalesRep User test
Then the user should not be able to access the Driver and SalesRep User page via direct URL test

# Texts
Scenario: User without Text View permission should not see the Text page
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile without View access to Text Page test
Then the user should have no Text page access via UI or direct URL test

# CallActivities
Scenario: User without Call Activity View permission should not see the Call Activity page
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile without Call Activity View permission to Call Activity Page test
Then the user should have no Call Activity access via UI or direct URL test

# BOTCalls
Scenario: User without BOT Call View permission should not see the BOT Call page
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile without BOT Call View permission to BOT Call Page test
Then the user should have no BOT Call View access via UI or direct URL test

# Faxes
Scenario: User without Fax View permission should not see the Fax page
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile without Fax View permission to Fax Page test
Then the user should have no Fax View access via UI or direct URL test

# Mails
Scenario: User without Mail View permission should not see the Mail page
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile without Mail View permission to Mail Page test
Then the user should have no Mail View access via UI or direct URL test

# WorkspaceUsers
Scenario: User with View Detail access only for Workspace User
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View Detail access only to Setup Module → Workspace User test
Then the user should be able to view workspace user details test
But the user should not be able to reset password, change profile, link or delink employee to user test

Scenario: User with View Detail and Reset Password access for Workspace User
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View Detail and Reset Password access to Setup Module → Workspace User test
Then the user should be able to view workspace user details test
And the user should be able to reset password for a workspace user test 
But the user should not be able to change profile, link or delink employee to user test

Scenario: User with View Detail, Reset Password, and Change Profile access for Workspace User
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View Detail, Reset Password, and Change Profile access to Setup Module → Workspace User test
Then the user should be able to view workspace user details test
And the user should be able to reset password for a workspace user test     
And the user should be able to change profile for a workspace user test
But the user should not be able to link or delink employee to user test

Scenario: User with full access for Workspace User
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View Detail, Reset Password, Change Profile, Link Employee To User, and DeLink Employee To User access to Setup Module Workspace User test 
Then the user should be able to view workspace user details test
And the user should be able to reset password for a workspace user test
And the user should be able to change profile for a workspace user test
And the user should be able to link and delink employee to a workspace user test

# CentralPASettings
Scenario: User with View only access for Central PA Setting
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Setup Module → Central PA Setting test
Then the user should be able to view Central PA Setting test
But the user should not be able to add Central PA Setting test

Scenario: User with View and Add access for Central PA Setting
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Add access to Setup Module → Central PA Setting test
Then the user should be able to view Central PA Setting test
And the user should be able to add a new Central PA entry test

Scenario: Create user without Central PA Setting access and check restrictions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile without Central PA Setting access test 
Then the user should have no Central PA Setting access via UI or direct URL test

# MailSetting
Scenario: Create user without Mail Setting access and check restrictions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile without Mail Setting access test
Then the user should have no Mail Setting access via UI or direct URL test

# Show On Dashboard
Scenario: User with View only access for Show On Dashboard
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Setup Module Show On Dashboard test
Then the user should be able to view Show On Dashboard settings test
But the user should not be able to add, edit, or delete Show On Dashboard settings test

Scenario: User with View and Add access for Show On Dashboard
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Add access to Setup Module Show On Dashboard test
Then the user should be able to view Show On Dashboard settings test
And the user should be able to add a new Show On Dashboard entry test
But the user should not be able to edit or delete Show On Dashboard settings test

Scenario: User with View, Add, and Edit access for Show On Dashboard
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, and Edit access to Setup Module Show On Dashboard test
Then the user should be able to view Show On Dashboard settings test
And the user should be able to add a new Show On Dashboard entry test
And the user should be able to edit an existing Show On Dashboard entry test 
But the user should not be able to delete Show On Dashboard settings test

Scenario: User with full access (View, Add, Edit, Delete) for Show On Dashboard
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with full access to Setup Module Show On Dashboard test
Then the user should be able to view Show On Dashboard settings test
And the user should be able to add a new Show On Dashboard entry test
And the user should be able to edit an existing Show On Dashboard entry test
And the user should be able to delete a Show On Dashboard entry test

# Email Notification
Scenario: User with View only access for Email Notification
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Setup Module Email Notification test
Then the user should be able to view Email Notification settings test
But the user should not be able to add, edit, or delete Email Notification settings test

Scenario: User with View and Add access for Email Notification
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Add access to Setup Module Email Notification test
Then the user should be able to view Email Notification settings test
And the user should be able to add a new Email Notification entry test
But the user should not be able to edit or delete Email Notification settings test

Scenario: User with View, Add, and Edit access for Email Notification
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, and Edit access to Setup Module Email Notification test
Then the user should be able to view Email Notification settings test
And the user should be able to add a new Email Notification entry test
And the user should be able to edit an existing Email Notification entry test     
But the user should not be able to delete Email Notification settings test
 
Scenario: User with full access (View, Add, Edit, Delete) for Email Notification
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with full access to Setup Module Email Notification test
Then the user should be able to view Email Notification settings test
And the user should be able to add a new Email Notification entry test
And the user should be able to edit an existing Email Notification entry test
And the user should be able to delete an Email Notification entry test

# Auto Text
Scenario: User with View only access for Auto Text
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Setup Module Auto Text test
Then the user should be able to view Auto Text settings test
But the user should not be able to add, edit, or delete Auto Text entries test

Scenario: User with View and Add access for Auto Text
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Add access to Setup Module Auto Text test
Then the user should be able to view Auto Text settings test
And the user should be able to add a new Auto Text entry test
But the user should not be able to edit or delete Auto Text entries test

Scenario: User with View, Add, and Edit access for Auto Text
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, and Edit access to Setup Module Auto Text test
Then the user should be able to view Auto Text settings test
And the user should be able to add a new Auto Text entry test
And the user should be able to edit an existing Auto Text entry test 
But the user should not be able to delete Auto Text entries test
  
Scenario: User with full access (View, Add, Edit, Delete) for Auto Text
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with full access to Setup Module Auto Text test
Then the user should be able to view Auto Text settings test
And the user should be able to add a new Auto Text entry test
And the user should be able to edit an existing Auto Text entry test
And the user should be able to delete an Auto Text entry test

# Auto Call
Scenario: User with View only access for Auto Call
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Setup Module Auto Call test
Then the user should be able to view Auto Call settings test
But the user should not be able to add, edit, or delete Auto Call entries test

Scenario: User with View and Add access for Auto Call
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Add access to Setup Module Auto Call test
Then the user should be able to view Auto Call settings test
And the user should be able to add a new Auto Call entry test
But the user should not be able to edit or delete Auto Call entries test
 
Scenario: User with View, Add, and Edit access for Auto Call
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, and Edit access to Setup Module Auto Call test
Then the user should be able to view Auto Call settings test
And the user should be able to add a new Auto Call entry test
And the user should be able to edit an existing Auto Call entry test
But the user should not be able to delete Auto Call entries test

Scenario: User with full access (View, Add, Edit, Delete) for Auto Call
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with full access to Setup Module Auto Call test
Then the user should be able to view Auto Call settings test
And the user should be able to add a new Auto Call entry test
And the user should be able to edit an existing Auto Call entry test
And the user should be able to delete an Auto Call entry test

# Connector App
Scenario: Create user without Connector App access and check restrictions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile without Connector App access test
Then the user should have no Connector App access via UI or direct URL test

# Spam Email
Scenario: User with View only access for Spam Email
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Setup Module Spam Email test
Then the user should be able to view Spam Email settings test
But the user should not be able to delete Spam Email entries test

Scenario: User with View and Delete access for Spam Email
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Delete access to Setup Module Spam Email test
Then the user should be able to view Spam Email settings test
And the user should be able to delete a Spam Email entry test

# Bounce Email
Scenario: User with View only access for Bounce Email
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Setup Module Bounce Email test
Then the user should be able to view Bounce Email settings test
But the user should not be able to delete Bounce Email entries test

Scenario: User with View and Delete access for Bounce Email
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Delete access to Setup Module Bounce Email test
Then the user should be able to view Bounce Email settings test
And the user should be able to delete a Bounce Email entry test

# Block Email
Scenario: User with View only access for Block Email
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Setup Module Block Email test
Then the user should be able to view Block Email settings test
But the user should not be able to delete Block Email entries test

Scenario: User with View and Delete access for Block Email
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Delete access to Setup Module Block Email test  
Then the user should be able to view Block Email settings test
And the user should be able to delete a Block Email entry test

# Sender Authentication
Scenario: User with View only access for Sender Authentication
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Setup Module Sender Authentication test
Then the user should be able to view Sender Authentication settings test
But the user should not be able to add or delete Sender Authentication entries test

Scenario: User with View and Add access for Sender Authentication
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Add access to Setup Module Sender Authentication test   
Then the user should be able to view Sender Authentication settings test
And the user should be able to add a Sender Authentication entry test
But the user should not be able to delete Sender Authentication entries test

Scenario: User with View, Add, and Delete access for Sender Authentication
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, and Delete access to Setup Module Sender Authentication test
Then the user should be able to view Sender Authentication settings test
And the user should be able to add a Sender Authentication entry test
And the user should be able to delete a Sender Authentication entry test

# XFlow
Scenario: User with Download access for XFlow
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with Download access to Setup Module XFlow test 
Then the user should be able to download from XFlow test

Scenario: User with No access for XFlow
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with No access to Setup Module XFlow test
Then the user should not be able to view or download from XFlow test 

#Profile
Scenario: Verify that Select All Module checkbox saves all permissions
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with all modules and all permissions selected test
And I reopen the profile in edit mode test
Then all module permission checkboxes should be selected test

# Dashboard
Scenario: User with View only access for Quick Links
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View access only to Setup Module → Quick Links test
Then the user should be able to view quick links test
But the user should not be able to add, edit, or delete any quick link test

Scenario: User with View and Add access for Quick Links
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Add access to Setup Module → Quick Links test
Then the user should be able to view quick links test
And the user should be able to add a new quick link test
But the user should not be able to edit or delete any quick link test 

Scenario: User with View, Add, and Edit access for Quick Links
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View, Add, and Edit access to Setup Module → Quick Links  test 
Then the user should be able to view quick links test
And the user should be able to add a new quick link test
And the user should be able to edit an existing quick link test  
But the user should not be able to delete any quick link test
  
Scenario: User with full access (View, Add, Edit, Delete) for Quick Links
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with full access to Setup Module → Quick Links test 
Then the user should be able to view quick links test
And the user should be able to add a new quick link test
And the user should be able to edit an existing quick link test
And the user should be able to delete a quick link test

# T&C
Scenario: User with View and Update access for T&C
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Update access to Setup Module → T&C test
Then the user should be able to view Provider, Manufacturer, Patient, and Partner T&C labels test

Scenario: User with No access for T&C
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with no access to Setup Module → T&C test
Then the user should not see the T&C section for Provider, Manufacturer, Patient, or Partner test

# Privacy Policy & Terms of Use
Scenario: User with View and Update access for Privacy Policy & Terms of Use
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with View and Update access to Setup Module Privacy Policy & Terms of Use test
Then the user should be able to view and update Privacy Policy and Terms of Use content test

Scenario: User with No access for Privacy Policy & Terms of Use
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
Then the Setup user should be able to view Profiles test
And I create a profile with no access to Setup Module Privacy Policy & Terms of Use test
Then the user should not see the Privacy Policy & Terms of Use section test

# Dashboard
Scenario: Add Quicklink Group Blank Submission Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
And the user should be able to view Dashboard page 
Then Add Quicklink Group Blank Submission should have to show validation

# Profile
Scenario: Add Profile Blank Submission Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
And the user should be able to view Profile page 
Then Add Profile Blank Submission should have to show validation

# Workspace Users
Scenario: Workspace Users Blank Submission Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
And the user should be able to view Workspace Users page 
Then Workspace Users Blank Submission should have to show validation

Scenario: Associated Employee Name Blank Search Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
And the user should be able to view Workspace Users page 
Then Associated Employee Name Blank Search Validation should have to display

Scenario: Reset Password Blank Submit Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
And the user should be able to view Workspace Users page 
Then Reset Password Blank Submit should have to show Validation

# Text Template
Scenario: Text Templates Blank Submit Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
And the user should be able to view Text Templates page 
Then Text Templates Blank Submit Validation should have to display

# Mail Templates
Scenario: Mail Templates Blank Submit Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
And the user should be able to view Mail Templates page 
Then Mail Templates Blank Submit Validation should have to display

# BOT Call Templates
Scenario: BOT Call Templates Blank Submit Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
And the user should be able to view BOT Call Templates page 
Then BOT Call Templates Blank Submit Validation should have to display

# Fax Templates
Scenario: Fax Call Templates Blank Submit Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
And the user should be able to view Fax Templates page 
Then Fax Templates Blank Submit Validation should have to display

# Patient Signature Templates
Scenario: Patient Signature Templates Blank Submit Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
And the user should be able to view Patient Signature Templates page 
Then Patient Signature Templates Blank Submit Validation should have to display

# Feedback Forms
Scenario: Feedback Forms Blank Submit Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
And the user should be able to view Feedback Forms page 
Then Feedback Forms Blank Submit Validation should have to display

# Bucket
Scenario: File Upload Blank Submit Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
And the user should be able to view File Upload page 
Then File Upload Blank Submit Validation should have to display

# Reminders
Scenario: Reminders Blank Submit Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
And the user should be able to view Reminders page 
Then Reminders Blank Submit Validation should have to display

# Settings
Scenario: Brand Management Blank Submit Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
And the user should be able to view Brand Management page 
Then Brand Management Blank Submit Validation should have to display

Scenario: Send VCard Blank Submit Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
And the user should be able to view Brand Management page 
Then Send VCard Blank Submit Validation should have to display

Scenario: Technical Setting Blank Submit Validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
And the user should be able to view Technical Setting page 
Then Technical Setting Blank Submit Validation should have to display

Scenario: Notification Setting invalid email id validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
And the user should be able to view Notification Setting page 
Then Notification Setting invalid email id validation should have to display

Scenario: Text Forward Setting invalid email id validation
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
And the user should be able to view Text Forward Setting page 
Then Text Forward Setting invalid email id validation should have to display

Scenario: Add EHR Type Blank field Validation 
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
And the user should be able to view EHR Types page 
Then Add EHR Type Blank field Validation should have to display

Scenario: Progress Steps Blank field Validation 
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
And the user should be able to view Progress Steps page 
Then Progress Steps Blank field Validation should have to display

Scenario: Add New IP Blank field Validation 
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
And the user should be able to view Whitelist IP page 
Then Add New IP Blank field Validation should have to display

Scenario: Exclude User Blank field Validation 
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
And the user should be able to view Whitelist IP page 
Then Exclude User Blank field Validation should have to display

Scenario: Add Designation Blank field Validation 
Given user launch browser
Then user click on the user type dropdown
When user select the user type as organization from user type dropdown
Then user enter the organization emailid
And user enter the organization password
When user click on the go button
And the user should be able to view Designations page 
Then Add Designation Blank field Validation should have to display











































































































































  
  
  
  
  





  
  
  
  
  
  
     







  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  




 































  
  
  
  






















  
  
  













  
   












  
  
   
  
  
  
  
  
  








  
   
 
 
 
  
  
  







  
   
















  
  


 
 
 
  
  



 
 
  
  




  
  
  
  
  
  
  
  
  
  
  
  
  












 

  
  
  
  
  
  
  
  
  
  






  
    






  
  
  



 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  











  
  






  
  

  
  








  
  












  
  
  










  
  








  
  
  















  
  

















  
  






  
  








  
  




  
  
  
  










  
  


  



  
  












  
   


























  
  
  
  




















  

  
  
  






















  
  









 
  
  
  
  
  
  
  
  
  
  









  



  
  
  
  
  
  







  
  









  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
















  
  






  
  
  
  
  
  








  
  




















  
  


  
  
  
  
  






















  
  
  
  
  
  









  
  



  
  
   


  
  
  
  
  
  
  




  
  
  
  
  

  
  
  
  
  





























