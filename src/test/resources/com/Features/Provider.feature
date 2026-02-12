Feature: Provider Module scenarios

Scenario: User with View only access for General (Audit View)
Given I log in as admin for Provider Module 
When I create a new user with email for Provider Module "testuser1_static@mailinator.com"    
And I create a profile with View access only to Provider Module General Audit View 
And I assign the profile and workspace to the user for Provider Module  
And I reset the user's password for Provider Module 
And I log in using the new user for Provider Module 
Then the user should be able to view General Audit View settings in Provider Module  

Scenario: User with No access for General (Audit View)
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser3_static@mailinator.com"
And I create a profile with No access to Provider Module General Audit View     
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should not be able to view General Audit View settings in Provider Module 

Scenario: User with View only access for Callback Request
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser4_static@mailinator.com"
And I create a profile with View access only to Provider Module Callback Request 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Callback Request in Provider Module  


Scenario: User with No access for Callback Request
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser6_static@mailinator.com"
And I create a profile with No access to Provider Module Callback Request 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should not be able to view Callback Request in Provider Module  


Scenario: User with View only access for Demand Request
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser7_static@mailinator.com"
And I create a profile with View access only to Provider Module Demand Request 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Demand Request in Provider Module  


Scenario: User with No access for Demand Request
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser8_static@mailinator.com"
And I create a profile with No access to Provider Module Demand Request 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should not be able to view Demand Request in Provider Module  


Scenario: User with View and Merge access but no Approve for NPI Request
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser12_static@mailinator.com"
And I create a profile with View and Merge access but no Approve access to Provider Module NPI Request 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view NPI Request in Provider Module  
And the user should be able to merge NPI Request in Provider Module 
And the user should not be able to approve NPI Request in Provider Module  

Scenario: User with View and Approve access but no Merge for NPI Request
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser13_static@mailinator.com"
And I create a profile with View and Approve access but no Merge access to Provider Module NPI Request 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view NPI Request in Provider Module
And the user should be able to approve NPI Request in Provider Module 
And the user should not be able to merge NPI Request in Provider Module  


Scenario: User with View and Send access but no Reply or Send VCard for Text
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser9_static@mailinator.com"
And I create a profile with View and Send access but no Reply or Send VCard access to Provider Module Text  
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Text in Provider Module 
And the user should be able to send Text in Provider Module  
And the user should not be able to send VCard in Provider Module   


Scenario: User with View and Send VCard access but no Send or Reply for Text
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser9_static@mailinator.com"
And I create a profile with View and Send VCard access but no Send or Reply access to Provider Module Text 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Text in Provider Module
And the user should be able to send VCard in Provider Module 
And the user should not be able to send Text in Provider Module  


Scenario: User with View and Add access but no Edit, Delete or Detail for Provider
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser11_static@mailinator.com"
And I create a profile with View and Add access but no Edit, Delete or Detail access to Provider in Provider Module 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider in Provider Module  
And the user should be able to add Provider in Provider Module  
And the user should not be able to edit Provider in Provider Module   
And the user should not be able to delete Provider in Provider Module   
And the user should not be able to view Provider details in Provider Module   
    
Scenario: User with View and Edit access but no Add, Delete or Detail for Provider
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser12_static@mailinator.com"
And I create a profile with View and Edit access but no Add, Delete or Detail access to Provider in Provider Module  
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider in Provider Module
And the user should be able to edit Provider in Provider Module 
And the user should not be able to add Provider in Provider Module  
And the user should not be able to delete Provider in Provider Module
And the user should not be able to view Provider details in Provider Module
    
Scenario: User with View and Delete access but no Add, Edit or Detail for Provider
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser1_static@mailinator.com"
And I create a profile with View and Delete access but no Add, Edit or Detail access to Provider in Provider Module 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider in Provider Module
And the user should be able to delete Provider in Provider Module 
And the user should not be able to add Provider in Provider Module
And the user should not be able to edit Provider in Provider Module
And the user should not be able to view Provider details in Provider Module

Scenario: User with View and Detail access but no Add, Edit or Delete for Provider
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser2_static@mailinator.com"
And I create a profile with View and Detail access but no Add, Edit or Delete access to Provider in Provider Module  
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider in Provider Module
And the user should be able to view Provider details in Provider Module 
And the user should not be able to add Provider in Provider Module
And the user should not be able to edit Provider in Provider Module
And the user should not be able to delete Provider in Provider Module

Scenario: User with View and Add access but no Edit or Delete for Provider Address
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser3_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Provider Address in Provider Module  
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider Address in Provider Module 
And the user should be able to add Provider Address in Provider Module 
And the user should not be able to edit Provider Address in Provider Module 
And the user should not be able to delete Provider Address in Provider Module 

Scenario: User with View and Edit access but no Add or Delete for Provider Address
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser4_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Provider Address in Provider Module  
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider Address in Provider Module
And the user should be able to edit Provider Address in Provider Module  
And the user should not be able to add Provider Address in Provider Module  
And the user should not be able to delete Provider Address in Provider Module

Scenario: User with View and Delete access but no Add or Edit for Provider Address
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser5_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Provider Address in Provider Module  
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider Address in Provider Module
And the user should be able to delete Provider Address in Provider Module   
And the user should not be able to add Provider Address in Provider Module
And the user should not be able to edit Provider Address in Provider Module

Scenario: User with View and Add access but no Edit or Delete for Provider Communication
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser7_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Provider Communication in Provider Module 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider Communication in Provider Module  
And the user should be able to add Provider Communication in Provider Module  
And the user should not be able to edit Provider Communication in Provider Module  
And the user should not be able to delete Provider Communication in Provider Module 


Scenario: User with View and Edit access but no Add or Delete for Provider Communication
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser9_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Provider Communication in Provider Module 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider Communication in Provider Module
And the user should be able to edit Provider Communication in Provider Module 
And the user should not be able to add Provider Communication in Provider Module  
And the user should not be able to delete Provider Communication in Provider Module

Scenario: User with View and Delete access but no Add or Edit for Provider Communication
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser10_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Provider Communication in Provider Module  
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider Communication in Provider Module
And the user should be able to delete Provider Communication in Provider Module 
And the user should not be able to add Provider Communication in Provider Module
And the user should not be able to edit Provider Communication in Provider Module
 

Scenario: User with View access but no Export Excel for Referrals
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser1_static@mailinator.com"
And I create a profile with View access but no Export Excel access to Referrals Provider 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Referrals in Provider Module   
And the user should not be able to export Referrals to Excel in Provider Module 


Scenario: User with both View and Export Excel access for Referrals
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser2_static@mailinator.com"
And I create a profile with both View and Export Excel access to Referrals Provider 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Referrals in Provider Module
And the user should be able to export Referrals to Excel in Provider Module  


Scenario: User with View and Add access but no Edit or Delete for Executives
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser7_static@mailinator.com" 
And I create a profile with View and Add access but no Edit or Delete access to Executives  
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module 
Then the user should be able to view Executives 
And the user should be able to add Executives  
And the user should not be able to edit Executives  
And the user should not be able to delete Executives 


Scenario: User with View and Edit access but no Add or Delete for Executives
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser8_static@mailinator.com"  
And I create a profile with View and Edit access but no Add or Delete access to Executives 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module 
Then the user should be able to view Executives
And the user should be able to edit Executives  
And the user should not be able to add Executives 
And the user should not be able to delete Executives

Scenario: User with View and Delete access but no Add or Edit for Executives
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser9_static@mailinator.com"  
And I create a profile with View and Delete access but no Add or Edit access to Executives 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module  
Then the user should be able to view Executives
And the user should be able to delete Executives 
And the user should not be able to add Executives
And the user should not be able to edit Executives


Scenario: User with View and Add access but no Edit or Delete for Referral Enrollment
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser1_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Referral Enrollment
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Referral Enrollment 
And the user should be able to add Referral Enrollment 
And the user should not be able to edit Referral Enrollment  
And the user should not be able to delete Referral Enrollment 

Scenario: User with View and Edit access but no Add or Delete for Referral Enrollment
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser2_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Referral Enrollment 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Referral Enrollment
And the user should be able to edit Referral Enrollment 
And the user should not be able to add Referral Enrollment 
And the user should not be able to delete Referral Enrollment

Scenario: User with View and Delete access but no Add or Edit for Referral Enrollment
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser3_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Referral Enrollment 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Referral Enrollment
And the user should be able to delete Referral Enrollment 
And the user should not be able to add Referral Enrollment
And the user should not be able to edit Referral Enrollment


Scenario: User with all Folder permissions but no File permissions in Bucket
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser4_static@mailinator.com"
And I create a profile with full Folder permissions but no File permissions for Bucket 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Folder in Bucket 
And the user should be able to add Folder in Bucket 
And the user should be able to edit Folder in Bucket 
And the user should be able to delete Folder in Bucket 
And the user should be able to favourite Folder in Bucket 
And the user should not be able to add File in Bucket 
And the user should not be able to edit File in Bucket 
And the user should not be able to delete File in Bucket 
And the user should not be able to favourite File in Bucket 
And the user should not be able to download File in Bucket 
And the user should not be able to view File in Bucket 


Scenario: User with all File permissions but no Folder permissions in Bucket
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser5_static@mailinator.com"
And I create a profile with full File permissions but no Folder permissions for Bucket 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view File in Bucket 
And the user should be able to add File in Bucket 
And the user should be able to edit File in Bucket 
And the user should be able to delete File in Bucket 
And the user should be able to favourite File in Bucket 
And the user should be able to download File in Bucket 
And the user should not be able to view Folder in Bucket 
And the user should not be able to add Folder in Bucket 
And the user should not be able to edit Folder in Bucket 
And the user should not be able to delete Folder in Bucket 
And the user should not be able to favourite Folder in Bucket


Scenario: User with Download File permission in Referral Patient History
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser6_static@mailinator.com"
And I create a profile with Download File permission for Referral Patient History 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Referral Patient History 
And the user should be able to download File in Referral Patient History 

Scenario: User without Download File permission in Referral Patient History
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser8_static@mailinator.com"
And I create a profile without Download File permission for Referral Patient History 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Referral Patient History
And the user should not be able to download File in Referral Patient History 

Scenario: Create user with Update access to DeDupe and check permissions
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser9_static@mailinator.com"
And I create a profile with Update access to Provider Module DeDupe 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to update DeDupe records for Provider Module 

Scenario: Create user without Update access to DeDupe and check restrictions
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser10_static@mailinator.com"
And I create a profile without Update access to Provider Module DeDupe 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should not be able to update DeDupe records via UI or direct URL for Provider Module


Scenario: Create user with View but not Reset Password access to Provider Executive
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser1_static@mailinator.com"
And I create a profile with View access but without Reset Password access to Provider Executive 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider Executive records 
And the user should not be able to reset passwords for Provider Executive 


Scenario: Create user with both View and Reset Password access to Provider Executive
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser2_static@mailinator.com"
And I create a profile with both View and Reset Password access to Provider Executive 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider Executive records
And the user should be able to reset passwords for Provider Executive users 


Scenario: User with View and Add access but no Edit, Delete for Provider Service
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser5_static@mailinator.com"
And I create a profile with View and Add access but no Edit, Delete to Provider Service in Provider Module 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider Service in Provider Module 
And the user should be able to add Provider Service in Provider Module 
And the user should not be able to edit Provider Service in Provider Module 
And the user should not be able to delete Provider Service in Provider Module 


Scenario: User with View and Edit access but no Add, Delete for Provider Service
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser6_static@mailinator.com"
And I create a profile with View and Edit access but no Add, Delete to Provider Service in Provider Module 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider Service in Provider Module
And the user should be able to edit Provider Service in Provider Module 
And the user should not be able to add Provider Service in Provider Module 
And the user should not be able to delete Provider Service in Provider Module


Scenario: User with View and Delete access but no Add, Edit for Provider Service
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser8_static@mailinator.com"
And I create a profile with View and Delete access but no Add, Edit to Provider Service in Provider Module 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider Service in Provider Module
And the user should be able to delete Provider Service in Provider Module 
And the user should not be able to add Provider Service in Provider Module
And the user should not be able to edit Provider Service in Provider Module


Scenario: User with Add access to Provider EHR but no Edit or Delete
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser10_static@mailinator.com"
And I create a profile with Add access but no Edit or Delete access to Provider EHR in Provider Module 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to add Provider EHR in Provider Module 
And the user should not be able to edit Provider EHR in Provider Module 
And the user should not be able to delete Provider EHR in Provider Module 

Scenario: User with Edit access to Provider EHR but no Add or Delete
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser11_static@mailinator.com"
And I create a profile with Edit access but no Add or Delete access to Provider EHR in Provider Module 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to edit Provider EHR in Provider Module 
And the user should not be able to add Provider EHR in Provider Module 
And the user should not be able to delete Provider EHR in Provider Module


Scenario: User with Delete access to Provider EHR but no Add or Edit
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser12_static@mailinator.com"
And I create a profile with Delete access but no Add or Edit access to Provider EHR in Provider Module 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to delete Provider EHR in Provider Module 
And the user should not be able to add Provider EHR in Provider Module
And the user should not be able to edit Provider EHR in Provider Module

Scenario: User with View and Add access but no Edit, Delete or Make Partner for Business Group
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser1_static@mailinator.com"
And I create a profile with View and Add access but no Edit, Delete or Make Partner access to Business Group in Provider Module 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Business Group in Provider Module 
And the user should be able to add Business Group in Provider Module
And the user should not be able to edit Business Group in Provider Module
And the user should not be able to delete Business Group in Provider Module
And the user should not be able to make Business Group a Partner in Provider Module


Scenario: User with View and Edit access but no Add, Delete or Make Partner for Business Group
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser2_static@mailinator.com"
And I create a profile with View and Edit access but no Add, Delete or Make Partner access to Business Group in Provider Module 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Business Group in Provider Module
And the user should be able to edit Business Group in Provider Module
And the user should not be able to add Business Group in Provider Module
And the user should not be able to delete Business Group in Provider Module
And the user should not be able to make Business Group a Partner in Provider Module

Scenario: User with View and Delete access but no Add, Edit or Make Partner for Business Group
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser3_static@mailinator.com"
And I create a profile with View and Delete access but no Add, Edit or Make Partner access to Business Group in Provider Module 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Business Group in Provider Module
And the user should be able to delete Business Group in Provider Module
And the user should not be able to add Business Group in Provider Module
And the user should not be able to edit Business Group in Provider Module
And the user should not be able to make Business Group a Partner in Provider Module

Scenario: User with View and Make Partner access but no Add, Edit or Delete for Business Group
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser5_static@mailinator.com"
And I create a profile with View and Make Partner access but no Add, Edit or Delete access to Business Group in Provider Module 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Business Group in Provider Module
And the user should be able to make Business Group a Partner in Provider Module
And the user should not be able to add Business Group in Provider Module
And the user should not be able to edit Business Group in Provider Module
And the user should not be able to delete Business Group in Provider Module


Scenario: User with View and Add access but no Edit or Delete for Business Group Address
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser6_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Business Group Address in Provider Module 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Business Group Address in Provider Module
And the user should be able to add Business Group Address in Provider Module
And the user should not be able to edit Business Group Address in Provider Module
And the user should not be able to delete Business Group Address in Provider Module


Scenario: User with View and Edit access but no Add or Delete for Business Group Address
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser7_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Business Group Address in Provider Module 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Business Group Address in Provider Module
And the user should be able to edit Business Group Address in Provider Module 
And the user should not be able to add Business Group Address in Provider Module 
And the user should not be able to delete Business Group Address in Provider Module

Scenario: User with View and Delete access but no Add or Edit for Business Group Address
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser1_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Business Group Address in Provider Module 
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Business Group Address in Provider Module
And the user should be able to delete Business Group Address in Provider Module
And the user should not be able to add Business Group Address in Provider Module
And the user should not be able to edit Business Group Address in Provider Module

Scenario: User with Download File permission for Provider Referral Incoming Details
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser2_static@mailinator.com"
And I create a profile with Download File permission for Provider Referral Incoming Details
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider Referral Incoming Details
And the user should be able to download files from Provider Referral Incoming Details

Scenario: User without Download File permission for Provider Referral Incoming Details
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser3_static@mailinator.com"
And I create a profile without Download File permission for Provider Referral Incoming Details
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider Referral Incoming Details
And the user should not be able to download files from Provider Referral Incoming Details

Scenario: User with Download File permission for Provider Referral Outgoing Details
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser6_static@mailinator.com"
And I create a profile with Download File permission for Provider Referral Outgoing Details
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider Referral Outgoing Details
And the user should be able to download files from Provider Referral Outgoing Details

Scenario: User without Download File permission for Provider Referral Outgoing Details
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser8_static@mailinator.com"
And I create a profile without Download File permission for Provider Referral Outgoing Details
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider Referral Outgoing Details
And the user should not be able to download files from Provider Referral Outgoing Details

Scenario: User with Download File permission for Provider Remote Monitoring Details
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser9_static@mailinator.com"
And I create a profile with Download File permission for Provider Remote Monitoring Details
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider Remote Monitoring Details
And the user should be able to download files from Provider Remote Monitoring Details

Scenario: User without Download File permission for Provider Remote Monitoring Details
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser1_static@mailinator.com"
And I create a profile without Download File permission for Provider Remote Monitoring Details
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider Remote Monitoring Details
And the user should not be able to download files from Provider Remote Monitoring Details


Scenario: User with Export Excel permission for Provider PA Details
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser2_static@mailinator.com"
And I create a profile with Export Excel permission for Provider PA Details
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider PA Details
And the user should be able to export Provider PA Details to Excel

Scenario: User without Export Excel permission for Provider PA Details
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser3_static@mailinator.com"
And I create a profile without Export Excel permission for Provider PA Details
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider PA Details
And the user should not be able to export Provider PA Details to Excel


Scenario: User with View and Add access but no Edit or Delete for Provider Type
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser3_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Provider Type in Provider Module
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider Type in Provider Module
And the user should be able to add Provider Type in Provider Module
And the user should not be able to edit Provider Type in Provider Module
And the user should not be able to delete Provider Type in Provider Module


Scenario: User with View and Edit access but no Add or Delete for Provider Type
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser4_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Provider Type in Provider Module
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider Type in Provider Module
And the user should be able to edit Provider Type in Provider Module
And the user should not be able to add Provider Type in Provider Module
And the user should not be able to delete Provider Type in Provider Module

Scenario: User with View and Delete access but no Add or Edit for Provider Type
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser5_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Provider Type in Provider Module
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider Type in Provider Module
And the user should be able to delete Provider Type in Provider Module
And the user should not be able to add Provider Type in Provider Module
And the user should not be able to edit Provider Type in Provider Module


Scenario: User with View and Add access but no Edit or Delete for Category
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser6_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Category in Provider Module
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Category in Provider Module
And the user should be able to add Category in Provider Module
And the user should not be able to edit Category in Provider Module
And the user should not be able to delete Category in Provider Module


Scenario: User with View and Edit access but no Add or Delete for Category
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser11_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Category in Provider Module
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Category in Provider Module
And the user should be able to edit Category in Provider Module
And the user should not be able to add Category in Provider Module
And the user should not be able to delete Category in Provider Module


Scenario: User with View and Delete access but no Add or Edit for Category
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser10_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Category in Provider Module
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Category in Provider Module
And the user should be able to delete Category in Provider Module
And the user should not be able to add Category in Provider Module
And the user should not be able to edit Category in Provider Module


Scenario: User with View and Add access but no Edit or Delete for Specialty
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser1_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Specialty in Provider Module
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Specialty in Provider Module
And the user should be able to add Specialty in Provider Module
And the user should not be able to edit Specialty in Provider Module
And the user should not be able to delete Specialty in Provider Module

Scenario: User with View and Edit access but no Add or Delete for Specialty
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser2_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Specialty in Provider Module
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Specialty in Provider Module
And the user should be able to edit Specialty in Provider Module
And the user should not be able to add Specialty in Provider Module
And the user should not be able to delete Specialty in Provider Module

Scenario: User with View and Delete access but no Add or Edit for Specialty
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser4_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Specialty in Provider Module
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Specialty in Provider Module
And the user should be able to delete Specialty in Provider Module
And the user should not be able to add Specialty in Provider Module
And the user should not be able to edit Specialty in Provider Module


Scenario: User with View and Add access but no Edit or Delete for Service
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser5_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Service in Provider Module
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Service in Provider Module
And the user should be able to add Service in Provider Module
And the user should not be able to edit Service in Provider Module
And the user should not be able to delete Service in Provider Module

Scenario: User with View and Edit access but no Add or Delete for Service
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser8_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Service in Provider Module
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Service in Provider Module
And the user should be able to edit Service in Provider Module
And the user should not be able to add Service in Provider Module
And the user should not be able to delete Service in Provider Module


Scenario: User with View and Delete access but no Add or Edit for Service
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser9_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Service in Provider Module
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Service in Provider Module
And the user should be able to delete Service in Provider Module
And the user should not be able to add Service in Provider Module
And the user should not be able to edit Service in Provider Module

#
Scenario: User with View and Add access but no Edit or Delete for Provider Template
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser10_static@mailinator.com"
And I create a profile with View and Add access but no Edit or Delete access to Provider Template in Provider Module
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider Template in Provider Module
And the user should be able to add Provider Template in Provider Module
And the user should not be able to edit Provider Template in Provider Module
And the user should not be able to delete Provider Template in Provider Module

Scenario: User with View and Edit access but no Add or Delete for Provider Template
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser11_static@mailinator.com"
And I create a profile with View and Edit access but no Add or Delete access to Provider Template in Provider Module
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider Template in Provider Module
And the user should be able to edit Provider Template in Provider Module
And the user should not be able to add Provider Template in Provider Module
And the user should not be able to delete Provider Template in Provider Module

Scenario: User with View and Delete access but no Add or Edit for Provider Template
Given I log in as admin for Provider Module
When I create a new user with email for Provider Module "testuser12_static@mailinator.com"
And I create a profile with View and Delete access but no Add or Edit access to Provider Template in Provider Module
And I assign the profile and workspace to the user for Provider Module
And I reset the user's password for Provider Module
And I log in using the new user for Provider Module
Then the user should be able to view Provider Template in Provider Module
And the user should be able to delete Provider Template in Provider Module
And the user should not be able to add Provider Template in Provider Module
And the user should not be able to edit Provider Template in Provider Module
