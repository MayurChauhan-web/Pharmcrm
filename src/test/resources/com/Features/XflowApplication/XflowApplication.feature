Feature: XFlow Application

Scenario: Open XFlow desktop application
Given the XFlow application is installed test
When I launch the XFlow application test
Then the application should open successfully test
And I enter username and password and click OK test

Scenario: Login with incorrect password
Given the XFlow application is installed test
And the application is open test
When I enter a valid username and an incorrect password test
And I click OK test
Then the system should display an error message indicating Invalid username or password test
And I should remain on the login screen test

Scenario: Verify successful database connection
Given the XFlow application is installed test
And the application is open test
When I click the Test Connection button test
Then the system should display a message indicating Database Connection Verified Successfully test
And I should remain on the connection screen test

Scenario: Confirm exit by clicking Yes
Given the XFlow application is installed test
And the application is open test
When I click the Cancel button test
Then the system should display a confirmation message saying Are you sure you want to exit the application? test
And I click Yes test

Scenario: Cancel exit by clicking No
Given the XFlow application is installed test
And the application is open test
When I click the Cancel button test
Then the system should display a confirmation message saying Are you sure you want to exit the application? test
And I click No test
Then I should remain on the connection screen test

Scenario: Login without entering credentials
Given the XFlow application is installed test 
And the application is open test
When I leave the username and password fields empty test
And I click OK test
Then the system should display an error message indicating that Please enter username and password test
And I should remain on the login screen test

Scenario: Validate and process RX Report Dispensed file from EHR source
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select RX Report Dispensed test
When I select the EHR Source from the available options test
And I upload a valid RX Report Dispensed Excel file test
And I click on the Please Validate Excel format popup test
And I click on Confirm and Process test
And a success message should be displayed indicating that Data Upload Complated test

Scenario: Verify Add+ button functionality on RX Report Dispensed screen
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select RX Report Dispensed test
When I click on the Add+ button test
Then a Delete button should be displayed to allow deleting the newly added entry test

Scenario: Verify Delete functionality on RX Report Dispensed screen
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select RX Report Dispensed test
When I click on the Add+ button test
Then the Delete button should be visible for removing the newly added RX Report entry test

Scenario: Verify Download Error Records functionality on RX Report Dispensed screen
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select RX Report Dispensed test
When I select the EHR Source from the available options test
When I select the Template from the available options test
And I upload a valid RX Report Dispensed Excel file test
And I click on the Please Validate Excel format popup test
And I click on Confirm and Process test
And a success message should be displayed indicating that Data Upload Complated test
And I click on Download Error Records test

Scenario: Display validation message when uploading file without selecting template
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select RX Report Dispensed test
When I click on the Upload File button test
Then the system should display a popup message indicating Please Select Template test


































