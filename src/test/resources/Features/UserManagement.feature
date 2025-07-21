Feature: Full User Management Flow

  Scenario: Create user, assign profile, workspace and verify login
    Given I log in as admin
    When I create a new user
    And I create a profile for the user
    And I assign a workspace and profile to the user
    And I reset the user password
    And I log in with the new user
    Then I should see proper permissions for the new user
