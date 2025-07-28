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
  When I create a new user with email "testuser3_static@mailinator.com"
  And I create a profile with View and Add access to Setup Module → Text Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view text templates
  And the user should be able to add a new text template 
  But the user should not be able to edit or delete any text template 

  Scenario: User with View, Add, and Edit access for Text Template
  Given I log in as admin
  When I create a new user with email "testuser4_static@mailinator.com"
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
  When I create a new user with email "testuser5_static@mailinator.com"
  And I create a profile with full access to Setup Module → Text Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view text templates
  And the user should be able to add a new text template
  And the user should be able to edit an existing text template
  And the user should be able to delete a text template 
  
  @Templates
  Scenario: User with View only access for BOT Call Template
  Given I log in as admin
  When I create a new user with email "testuser2_static@mailinator.com"
  And I create a profile with View access only to Setup Module → BOT Call Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view BOT call templates 
  But the user should not be able to add, edit, or delete any BOT call template 

  Scenario: User with View and Add access for BOT Call Template
  Given I log in as admin
  When I create a new user with email "testuser2_static@mailinator.com"
  And I create a profile with View and Add access to Setup Module → BOT Call Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view BOT call templates
  And the user should be able to add a new BOT call template 
  But the user should not be able to edit or delete any BOT call template 
  
  Scenario: User with View, Add, and Edit access for BOT Call Template
  Given I log in as admin
  When I create a new user with email "testuser3_static@mailinator.com"
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
  When I create a new user with email "testuser4_static@mailinator.com"
  And I create a profile with full access to Setup Module → BOT Call Template 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view BOT call templates
  And the user should be able to add a new BOT call template
  And the user should be able to edit an existing BOT call template
  And the user should be able to delete a BOT call template 
  
  





     
     
     
     
  	
  	
  	
  
  
  
  