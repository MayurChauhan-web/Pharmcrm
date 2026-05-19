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

Scenario: Display validation message when clicking Confirm and Process without uploading a file
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select RX Report Dispensed test
When I click on the Confirm and Process button test
Then the system should display a popup message indicating Please upload a file before processing test

Scenario: Display validation message when clicking Download Error Records without uploading a file
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select RX Report Dispensed test
When I click on the Download Error Records button test
Then the system should display a popup message indicating Error file not found test

Scenario: Display validation message when uploading a file without selecting EHR Source in Clinical Report Appointment
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select Clinical Report Appointment test
When I click on the Upload File button without selecting EHR Source test
Then the system should display a popup message indicating Please select EHR Source test

Scenario: Display validation message when clicking Confirm and Process without selecting EHR Source in Clinical Report Appointment
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select Clinical Report Appointment test
When I click on the Confirm and Process button without selecting EHR Source test
Then the system should display a popup message indicating Please upload a file test

Scenario: Display validation message when clicking Download Error Records without selecting EHR Source in Clinical Report Appointment
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select Clinical Report Appointment test
When I click on the Download Error Records button without selecting EHR Source test
Then the system should display a popup message indicating Error file not found test

Scenario: Verify Download Error Records functionality on Clinical Report Appointment screen
Given the XFlow application is installed test 
And the application is open test
And I enter username and password and click OK test
And I Select Clinical Report Appointment test
When I select the EHR Source from the available options test 
And I upload a valid Clinical Report Appointment Excel file test
And I click on Confirm and Process test
And a success message should be displayed indicating that Data Upload Complated test

Scenario: Verify Confirm and Process functionality on Clinical Report Appointment screen
Given the XFlow application is installed test  
And the application is open test
And I enter username and password and click OK test
And I Select Clinical Report Appointment test
When I select the EHR Source from the available options test 
And I upload a valid Clinical Report Appointment Excel file test
And I click on Confirm and Process test
Then a success message should be displayed indicating that Data Upload Complated test

Scenario: Verify update notification and Download button when a new version is available
Given the XFlow application is installed test
And the application is open test
Then a text message should appear indicating New version is available for download test
And the Download button should be visible test

Scenario: Display validation message when uploading a file without selecting EHR Source in Demographic
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select Demographic test
When I click on the Upload File button without selecting EHR Source test
Then the system should display a popup message indicating Please select EHR Source test

Scenario: Display validation message when clicking Confirm and Process without selecting EHR Source in Demographic
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select Demographic test
When I click on the Confirm and Process button without selecting EHR Source test
Then the system should display a popup message indicating Please upload a file test

Scenario: Display validation message when clicking Download Error Records without selecting EHR Source in Demographic
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select Demographic test
When I click on the Download Error Records button without selecting EHR Source test
Then the system should display a popup message indicating Error file not found test

Scenario: Verify Download Error Records functionality on Demographic screen
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select Demographic test
When I select the EHR Source from the available options test
And I upload a valid Demographic Excel file test
And I click on Confirm and Process test
And a success message should be displayed indicating that Data Upload Complated test
And I click on Download Error Records test

Scenario: Verify Confirm and Process functionality on Demographic screen
Given the XFlow application is installed test 
And the application is open test
And I enter username and password and click OK test
And I Select Demographic test
When I select the EHR Source from the available options test
And I upload a valid Demographic Excel file test
And I click on Confirm and Process test
Then a success message should be displayed indicating that Data Upload Complated test

Scenario: Display validation message when clicking Confirm and Process without selecting POS Template
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select Rx Report POS test
When I click on the Confirm and Process button without selecting POS Source test
Then the system should display a popup message indicating Please upload a file test

Scenario: Display validation message when clicking Download Error Records without Uploading File 
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select Rx Report POS test
When I click on the Download Error Records button without selecting POS Source test
Then the system should display a popup message indicating Error file not found test

Scenario: Verify Confirm and Process functionality on Rx Report for POS
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select Rx Report POS test
And I upload a valid POS Excel file test
And I click on Confirm and Process test
Then a success message should be displayed indicating that Data Upload Complated test

Scenario: Verify Download Error Records functionality on Rx Report for POS
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select Rx Report POS test
And I upload a valid POS Excel file test
And I click on Confirm and Process test
Then a success message should be displayed indicating that Data Upload Complated test
And I click on Download Error Records test

Scenario: Display validation message when no file is uploaded
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select Data Lead test
When I click on the Confirm and Process button without selecting Upload File test
Then the system should display a popup message indicating Please upload a file test

Scenario: Display validation message when no file is uploaded for Provider
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select Data Provider test
When I click on the Confirm and Process button without selecting Upload File test
Then the system should display a popup message indicating Please upload a file test

Scenario: Verify successful database connection after login
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
When I click the Test Connection button test
Then the system should display a message indicating Database Connection Verified Successfully test

Scenario: Verify successful login and logout functionality
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
When I click the Logout button test
Then the system should log me out and display the login screen test

Scenario: Verify Confirm and Process functionality on Data Lead
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select Data Lead test
And I upload a valid Lead Excel file test
When I select the Audience Type from the available options test
And I click on Confirm and Process test
Then a success message should be displayed indicating that Data Upload Complated test

Scenario: Verify Confirm and Process functionality on Data Provider
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select Data Provider test
And I upload a valid Provider Excel file test
And I click on Confirm and Process test
Then a success message should be displayed indicating that Data Upload Complated test

Scenario: Display validation message when no Audience Type is selected for Provider
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select Data Lead test
And I upload a valid Lead Excel file test
When I click on the Confirm and Process button without selecting Audience Type test
Then the system should display a popup message indicating Please select an Audience Type test

Scenario: Verify Download Template functionality on Data Lead
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select Data Lead test
When I click on Download Template test
Then the system should download the Lead Template file successfully test

Scenario: Verify Download Template functionality on Data Provider
Given the XFlow application is installed test
And the application is open test
And I enter username and password and click OK test
And I Select Data Provider test
When I click on Download Template test
Then the system should download the Provider Template file successfully test

