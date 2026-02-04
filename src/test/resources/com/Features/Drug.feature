Feature: Drug Module scenarios

  Scenario: User with View only access for Drug (Audit View)
  Given I log in as admin 
  When I create a new user with email "testuser3_static@mailinator.com"   
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
  
  #
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
  
  Scenario: User with View only access for ICD10
  Given I log in as admin
  When I create a new user with email "testuser2_static@mailinator.com"
  And I create a profile with View access only to ICD10 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view ICD10 
  And the user should not be able to add, edit, or delete ICD10 

  Scenario: User with Add access for ICD10
  Given I log in as admin
  When I create a new user with email "testuser5_static@mailinator.com"
  And I create a profile with View and Add access to ICD10  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and add ICD10 
  And the user should not be able to edit or delete ICD10 
  
  Scenario: User with Edit access for ICD10
  Given I log in as admin
  When I create a new user with email "testuser6_static@mailinator.com"
  And I create a profile with View and Edit access to ICD10 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and edit ICD10  
  And the user should not be able to add or delete ICD10 

  Scenario: User with Delete access for ICD10
  Given I log in as admin
  When I create a new user with email "testuser7_static@mailinator.com"
  And I create a profile with View and Delete access to ICD10 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and delete ICD10  
  And the user should not be able to add or edit ICD10 
  
  Scenario: User with Add access for Drug Therapeutic
  Given I log in as admin
  When I create a new user with email "testuser10_static@mailinator.com"
  And I create a profile with View and Add access to Drug Therapeutic  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and add Drug Therapeutic 
  And the user should not be able to edit or delete Drug Therapeutic 

  Scenario: User with Edit access for Drug Therapeutic
  Given I log in as admin
  When I create a new user with email "testuser11_static@mailinator.com"
  And I create a profile with View and Edit access to Drug Therapeutic 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and edit Drug Therapeutic 
  And the user should not be able to add or delete Drug Therapeutic 

  Scenario: User with Delete access for Drug Therapeutic
  Given I log in as admin
  When I create a new user with email "testuser13_static@mailinator.com"
  And I create a profile with View and Delete access to Drug Therapeutic 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and delete Drug Therapeutic 
  And the user should not be able to add or edit Drug Therapeutic 
  
  Scenario: User with Add access for Drug Family
  Given I log in as admin
  When I create a new user with email "testuser1_static@mailinator.com"
  And I create a profile with View and Add access to Drug Family 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and add Drug Family 
  And the user should not be able to edit or delete Drug Family 

  Scenario: User with Edit access for Drug Family
  Given I log in as admin
  When I create a new user with email "testuser2_static@mailinator.com"
  And I create a profile with View and Edit access to Drug Family 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and edit Drug Family 
  And the user should not be able to add or delete Drug Family 

  Scenario: User with Delete access for Drug Family
  Given I log in as admin
  When I create a new user with email "testuser3_static@mailinator.com"
  And I create a profile with View and Delete access to Drug Family 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and delete Drug Family  
  And the user should not be able to add or edit Drug Family  
  
  Scenario: User with Add access for Drug Approved Indication
  Given I log in as admin
  When I create a new user with email "testuser4_static@mailinator.com"
  And I create a profile with View and Add access to Drug Approved Indication 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and add Drug Approved Indication 
  And the user should not be able to edit or delete Drug Approved Indication 

  Scenario: User with Edit access for Drug Approved Indication
  Given I log in as admin
  When I create a new user with email "testuser5_static@mailinator.com"
  And I create a profile with View and Edit access to Drug Approved Indication 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and edit Drug Approved Indication 
  And the user should not be able to add or delete Drug Approved Indication 

  Scenario: User with Delete access for Drug Approved Indication
  Given I log in as admin
  When I create a new user with email "testuser6_static@mailinator.com"
  And I create a profile with View and Delete access to Drug Approved Indication 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and delete Drug Approved Indication 
  And the user should not be able to add or edit Drug Approved Indication  
  
  Scenario: User with Add access for Disease State
  Given I log in as admin
  When I create a new user with email "testuser8_static@mailinator.com"
  And I create a profile with View and Add access to Disease State 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and add Disease State 
  And the user should not be able to delete Disease State 
  
  Scenario: User with Delete access for Disease State
  Given I log in as admin
  When I create a new user with email "testuser10_static@mailinator.com"
  And I create a profile with View and Delete access to Disease State  
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and delete Disease State 
  And the user should not be able to add Disease State 
  
  Scenario: User with Add access for Program
  Given I log in as admin
  When I create a new user with email "testuser11_static@mailinator.com"
  And I create a profile with View and Add access to Program 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and add Program 
  And the user should not be able to delete Program 

  Scenario: User with Delete access for Program
  Given I log in as admin
  When I create a new user with email "testuser12_static@mailinator.com"
  And I create a profile with View and Delete access to Program 
  And I assign the profile and workspace to the user
  And I reset the user's password
  And I log in using the new user
  Then the user should be able to view and delete Program 
  And the user should not be able to add Program  
  
  
  
  
  
  
  
  
  
  
  
   
  
   
  
  

    
  
   
  
  
  
   
  
  
  
  
  
  
  
  
  
  
  

  
    

  
  
  
  