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



















































  
  













  
  






  












  
  


  
  






















  
  
  
  
  






















  
  
  
  
  
  









  
  



  
  
   


  
  
  
  
  
  
  




  
  
  
  
  

  
  
  
  
  





























