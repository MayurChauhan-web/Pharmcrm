Feature: Full User Management Flow

  @Patient
  Scenario: User with View only access for Patient Module (General Audit View)
  Given I log in as admin  
  When I create a new user with email "testuser8_static@mailinator.com"
  And I create a profile with View access only to Patient Module General Audit View
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view Patient Module General Audit View
  
  
  
  
  
  
  
  
  
     
  
     
  
  
  
  
  
  
  
  
  
  
  
  
  
  
     
  
     
