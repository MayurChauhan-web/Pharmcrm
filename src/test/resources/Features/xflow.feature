Feature: XFlow Application
  
Scenario: Open XFlow desktop application
Given the XFlow application is installed
When I launch the XFlow application
Then the application should open successfully
And I enter username and password and click OK

Scenario: Login with incorrect password
Given the XFlow application is installed
And the application is open
When I enter a valid username and an incorrect password
And I click OK
Then the system should display an error message indicating Invalid username or password
And I should remain on the login screen

Scenario: Verify successful database connection
Given the XFlow application is installed  
And the application is open  
When I click the Test Connection button  
Then the system should display a message indicating Database Connection Verified Successfully
And I should remain on the connection screen

Scenario: Confirm exit by clicking Yes
Given the XFlow application is installed  
And the application is open  
When I click the Cancel button  
Then the system should display a confirmation message saying Are you sure you want to exit the application?  
And I click Yes  

Scenario: Cancel exit by clicking No
Given the XFlow application is installed  
And the application is open  
When I click the Cancel button  
Then the system should display a confirmation message saying Are you sure you want to exit the application? 
And I click No 
Then I should remain on the connection screen

@XFlow
Scenario: Login without entering credentials
Given the XFlow application is installed  
And the application is open  
When I leave the username and password fields empty  
And I click OK  
Then the system should display an error message indicating that Please enter username and password
And I should remain on the login screen



































    