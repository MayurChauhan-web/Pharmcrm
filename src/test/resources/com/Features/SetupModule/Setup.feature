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





  
  
  
  
  






















  
  
  
  
  
  









  
  



  
  
   


  
  
  
  
  
  
  




  
  
  
  
  

  
  
  
  
  





























