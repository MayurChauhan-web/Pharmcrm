Feature: Full User Management Flow

  @Setup
  Scenario: Create user with log-only access and check login
  Given I log in as admin for Setup Module
  When I create a new user with email for Setup Module "testuser4_static@mailinator.com"
  And I create a profile with log-only access 
  And I assign the profile and workspace to the user for Setup Module 
  And I reset the user's password for Setup Module 
  And I log in using the new user for Setup Module  
  Then I should see only log access for the new user
  
  
  
  
  
   
  
  
  
  