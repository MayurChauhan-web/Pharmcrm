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

Scenario: Login without entering credentials
Given the XFlow application is installed  
And the application is open  
When I leave the username and password fields empty  
And I click OK  
Then the system should display an error message indicating that Please enter username and password
And I should remain on the login screen

Scenario: Validate and process RX Report Dispensed file from EHR source
Given the XFlow application is installed  
And the application is open  
And I enter username and password and click OK
And I Select RX Report Dispensed
When I select the EHR Source from the available options 
And I upload a valid RX Report Dispensed Excel file  
And I click on the Please Validate Excel format popup  
And I click on Confirm and Process  
And a success message should be displayed indicating that Data Upload Complated

Scenario: Verify Add+ button functionality on RX Report Dispensed screen
Given the XFlow application is installed  
And the application is open  
And I enter username and password and click OK
And I Select RX Report Dispensed
When I click on the Add+ button  
Then a Delete button should be displayed to allow deleting the newly added entry

Scenario: Verify Delete functionality on RX Report Dispensed screen
Given the XFlow application is installed
And the application is open
And I enter username and password and click OK
And I Select RX Report Dispensed
When I click on the Add+ button
Then the Delete button should be visible for removing the newly added RX Report entry

Scenario: Verify Download Error Records functionality on RX Report Dispensed screen
Given the XFlow application is installed  
And the application is open  
And I enter username and password and click OK
And I Select RX Report Dispensed
When I select the EHR Source from the available options 
When I select the Template from the available options
And I upload a valid RX Report Dispensed Excel file  
And I click on the Please Validate Excel format popup  
And I click on Confirm and Process  
And a success message should be displayed indicating that Data Upload Complated
And I click on Download Error Records  

Scenario: Display validation message when uploading file without selecting template
Given the XFlow application is installed  
And the application is open  
And I enter username and password and click OK
And I Select RX Report Dispensed
When I click on the Upload File button  
Then the system should display a popup message indicating Please Select Template 

Scenario: Display validation message when clicking Confirm and Process without uploading a file
Given the XFlow application is installed  
And the application is open  
And I enter username and password and click OK
And I Select RX Report Dispensed
When I click on the Confirm and Process button  
Then the system should display a popup message indicating Please upload a file before processing 

Scenario: Display validation message when clicking Download Error Records without uploading a file
Given the XFlow application is installed
And the application is open
And I enter username and password and click OK
And I Select RX Report Dispensed
When I click on the Download Error Records button
Then the system should display a popup message indicating Error file not found.

Scenario: Display validation message when uploading a file without selecting EHR Source in Clinical Report Appointment
Given the XFlow application is installed
And the application is open
And I enter username and password and click OK
And I Select Clinical Report Appointment
When I click on the Upload File button without selecting EHR Source
Then the system should display a popup message indicating Please select EHR Source.

Scenario: Display validation message when clicking Confirm and Process without selecting EHR Source in Clinical Report Appointment
Given the XFlow application is installed
And the application is open
And I enter username and password and click OK
And I Select Clinical Report Appointment
When I click on the Confirm and Process button without selecting EHR Source
Then the system should display a popup message indicating Please upload a file.

Scenario: Display validation message when clicking Download Error Records without selecting EHR Source in Clinical Report Appointment
Given the XFlow application is installed
And the application is open
And I enter username and password and click OK
And I Select Clinical Report Appointment
When I click on the Download Error Records button without selecting EHR Source
Then the system should display a popup message indicating Error file not found.

Scenario: Verify Download Error Records functionality on Clinical Report Appointment screen
Given the XFlow application is installed  
And the application is open  
And I enter username and password and click OK
And I Select Clinical Report Appointment
When I select the EHR Source from the available options 
And I upload a valid Clinical Report Appointment Excel file
And I click on Confirm and Process
And a success message should be displayed indicating that Data Upload Complated

Scenario: Verify Confirm and Process functionality on Clinical Report Appointment screen
Given the XFlow application is installed  
And the application is open  
And I enter username and password and click OK
And I Select Clinical Report Appointment
When I select the EHR Source from the available options 
And I upload a valid Clinical Report Appointment Excel file
And I click on Confirm and Process
Then a success message should be displayed indicating that Data Upload Complated

Scenario: Verify update notification and Download button when a new version is available
Given the XFlow application is installed
And the application is open
Then a text message should appear indicating New version is available for download
And the Download button should be visible

Scenario: Display validation message when uploading a file without selecting EHR Source in Demographic
Given the XFlow application is installed
And the application is open
And I enter username and password and click OK
And I Select Demographic
When I click on the Upload File button without selecting EHR Source
Then the system should display a popup message indicating Please select EHR Source.

Scenario: Display validation message when clicking Confirm and Process without selecting EHR Source in Demographic
Given the XFlow application is installed
And the application is open
And I enter username and password and click OK
And I Select Demographic
When I click on the Confirm and Process button without selecting EHR Source
Then the system should display a popup message indicating Please upload a file.

Scenario: Display validation message when clicking Download Error Records without selecting EHR Source in Demographic
Given the XFlow application is installed
And the application is open
And I enter username and password and click OK
And I Select Demographic
When I click on the Download Error Records button without selecting EHR Source
Then the system should display a popup message indicating Error file not found.

Scenario: Verify Download Error Records functionality on Demographic screen
Given the XFlow application is installed  
And the application is open  
And I enter username and password and click OK
And I Select Demographic
When I select the EHR Source from the available options 
And I upload a valid Demographic Excel file
And I click on Confirm and Process
And a success message should be displayed indicating that Data Upload Complated
And I click on Download Error Records

Scenario: Verify Confirm and Process functionality on Demographic screen
Given the XFlow application is installed  
And the application is open  
And I enter username and password and click OK
And I Select Demographic
When I select the EHR Source from the available options 
And I upload a valid Demographic Excel file
And I click on Confirm and Process
Then a success message should be displayed indicating that Data Upload Complated

Scenario: Display validation message when clicking Confirm and Process without selecting POS Template
Given the XFlow application is installed
And the application is open
And I enter username and password and click OK
And I Select Rx Report POS
When I click on the Confirm and Process button without selecting POS Source
Then the system should display a popup message indicating Please upload a file.

Scenario: Display validation message when clicking Download Error Records without Uploading File 
Given the XFlow application is installed
And the application is open
And I enter username and password and click OK
And I Select Rx Report POS
When I click on the Download Error Records button without selecting POS Source
Then the system should display a popup message indicating Error file not found.

Scenario: Verify Confirm and Process functionality on Rx Report for POS
Given the XFlow application is installed
And the application is open
And I enter username and password and click OK
And I Select Rx Report POS
And I upload a valid POS Excel file
And I click on Confirm and Process
Then a success message should be displayed indicating that Data Upload Complated

@XFlow
Scenario: Verify Download Error Records functionality on Rx Report for POS
Given the XFlow application is installed
And the application is open
And I enter username and password and click OK
And I Select Rx Report POS
And I upload a valid POS Excel file
And I click on Confirm and Process
Then a success message should be displayed indicating that Data Upload Complated
And I click on Download Error Records



















































































































































































































































































    