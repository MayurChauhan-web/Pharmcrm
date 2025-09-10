Feature: Full User Management Flow

  @Drug
  Scenario: User with View only access for Drug (Audit View)
  Given I log in as admin 
  When I create a new user with email "testuser1_static@mailinator.com"   
  And I create a profile with View access only to Drug Module General Audit View  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view Drug General Audit View settings  
  
  Scenario: User with No access for Drug (Audit View)
  Given I log in as admin
  When I create a new user with email "testuser2_static@mailinator.com"
  And I create a profile with No access to Drug Module General Audit View 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should not be able to view Drug General Audit View settings 
  
  Scenario: User with View only access for Drug
  Given I log in as admin
  When I create a new user with email "testuser1_static@mailinator.com"
  And I create a profile with View access only to Drug  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view Drug 
  And the user should not be able to add, edit, delete, download template, upload excel, or export excel
   
  Scenario: User with Add access for Drug
  Given I log in as admin
  When I create a new user with email "testuser1_static@mailinator.com"
  And I create a profile with View and Add access to Drug 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and add in Drug   
  And the user should not be able to delete, download template, upload excel, or export excel 
  
  Scenario: User with Edit access for Drug
  Given I log in as admin
  When I create a new user with email "testuser2_static@mailinator.com"
  And I create a profile with View and Edit access to Drug  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and edit in Drug  
  And the user should not be able to delete, download template, upload excel, or export excel for Drug
  
  Scenario: User with Delete access for Drug
  Given I log in as admin
  When I create a new user with email "testuser3_static@mailinator.com"
  And I create a profile with View and Delete access to Drug 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and delete in Drug  
  And the user should not be able to add, edit, download template, upload excel, or export excel  
  
  Scenario: User with Download Template access for Drug
  Given I log in as admin
  When I create a new user with email "testuser4_static@mailinator.com"
  And I create a profile with View and Download Template access to Drug     
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and download template in Drug 
  And the user should not be able to add, edit, delete, upload excel, or export excel
  
  Scenario: User with Upload Excel access for Drug
  Given I log in as admin
  When I create a new user with email "testuser5_static@mailinator.com"
  And I create a profile with View and Upload Excel access to Drug  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and upload excel in Drug  
  And the user should not be able to add, edit, delete, download template, or export excel
  
  Scenario: User with Export Excel access for Drug
  Given I log in as admin
  When I create a new user with email "testuser6_static@mailinator.com"
  And I create a profile with View and Export Excel access to Drug 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and export excel in Drug  
  And the user should not be able to add, edit, delete, download template, or upload excel
  
  Scenario: User with View only access for Star 1 Drug
  Given I log in as admin
  When I create a new user with email "testuser7_static@mailinator.com"
  And I create a profile with View access only to Star 1 Drug   
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view Star 1 Drug  
  And the user should not be able to edit Star 1 Drug
  
  Scenario: User with Edit access for Star 1 Drug
  Given I log in as admin
  When I create a new user with email "testuser9_static@mailinator.com"
  And I create a profile with View and Edit access to Star 1 Drug 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and edit Star 1 Drug
  
  Scenario: User with View only access for Star 2 Drug
  Given I log in as admin
  When I create a new user with email "testuser1_static@mailinator.com"
  And I create a profile with View access only to Star 2 Drug  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view Star 2 Drug 
  And the user should not be able to edit Star 2 Drug
  
  Scenario: User with Edit access for Star 2 Drug
  Given I log in as admin
  When I create a new user with email "testuser1_static@mailinator.com"
  And I create a profile with View and Edit access to Star 2 Drug  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and edit Star 2 Drug
  
  Scenario: User with View only access for Allergy
  Given I log in as admin
  When I create a new user with email "testuser5_static@mailinator.com"
  And I create a profile with View access only to Allergy  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view Allergy 
  And the user should not be able to add, edit, delete, download template, upload excel, or export excel for Allergy
  
  Scenario: User with Add access for Allergy
  Given I log in as admin
  When I create a new user with email "testuser7_static@mailinator.com"
  And I create a profile with View and Add access to Allergy  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and add Allergy  
  And the user should not be able to delete, download template, upload excel, or export excel for Allergy
  
  Scenario: User with Edit access for Allergy
  Given I log in as admin
  When I create a new user with email "testuser8_static@mailinator.com"
  And I create a profile with View and Edit access to Allergy
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and edit Allergy 
  And the user should not be able to delete, download template, upload excel, or export excel for Allergy
  
  Scenario: User with Delete access for Allergy
  Given I log in as admin
  When I create a new user with email "testuser9_static@mailinator.com"
  And I create a profile with View and Delete access to Allergy  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and delete Allergy  
  And the user should not be able to add, edit, download template, upload excel, or export excel for Allergy
  
  Scenario: User with Download Template access for Allergy
  Given I log in as admin
  When I create a new user with email "testuser10_static@mailinator.com"
  And I create a profile with View and Download Template access to Allergy 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and download template in Allergy  
  And the user should not be able to add, edit, delete, upload excel, or export excel for Allergy 
  
  Scenario: User with Upload Excel access for Allergy
  Given I log in as admin
  When I create a new user with email "testuser11_static@mailinator.com"
  And I create a profile with View and Upload Excel access to Allergy 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and upload excel in Allergy 
  And the user should not be able to add, edit, delete, download template, or export excel for Allergy
  
  Scenario: User with Export Excel access for Allergy
  Given I log in as admin
  When I create a new user with email "testuser1_static@mailinator.com"
  And I create a profile with View and Export Excel access to Allergy  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and export excel in Allergy 
  And the user should not be able to add, edit, delete, download template, or upload excel for Allergy
  
  
   
  
   
  
  

    
  
   
  
  
  
   
  
  
  
  
  
  
  
  
  
  
  

  
    

  
  
  
  