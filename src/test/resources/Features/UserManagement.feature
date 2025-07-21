Feature: Full User Management Flow

  Scenario: Create user with log-only access and check login
    Given I log in as admin
    When I create a new user with email "testuser1_static@mailinator.com"
    And I create a profile with log-only access 
    And I assign the profile and workspace to the user 
    And I reset the user's password   
    And I log in using the new user
    Then I should see only log access for the new user 

  Scenario: Create user without Setup access and check restrictions
    Given I log in as admin
    When I create a new user with email "testuser2_static@mailinator.com"
    And I create a profile without Setup access
    And I assign the profile and workspace to the user
    And I reset the user's password
    And I log in using the new user   
    Then the user should not see or edit any Setup pages
