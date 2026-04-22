@HRModuleFeature

Feature: HR Module Functionality 

Scenario: User able to login with user type as Organization in login page  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  
Scenario: Organizational user able to click on HR Module tab 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  
  
  #-------------------------- Documents Section ----------------------------------------------
  
  
Scenario: Organizational user able to click on Documents tab in HR Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  
Scenario: Organizational user able to create a New Folder in Documents page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  Then user click on the new folder tab in documents page
  And user enter the new folder name in add new folder pop-up window
  When user click on the submit button in add new folder pop-up window
  
Scenario: Organizational user able to create a New Folder without entering folder name in Documents page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  Then user click on the new folder tab in documents page
  When user click on the submit button in add new folder pop-up window
  
Scenario: Organizational user able to Change the existing Folder name in Documents page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  Then user click on the existing folder three dot button in documents page
  And user click on edit folder button in three dot
  Then user change the folder name in edit name pop-up window
  When user click on the submit button in add new folder pop-up window
  
Scenario: Organizational user able to Remove the existing Folder name in Documents page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  Then user click on the existing folder three dot button in documents page
  And user click on edit folder button in three dot
  Then user remove the folder name in edit name pop-up window
  When user click on the submit button in add new folder pop-up window
  
Scenario: Organizational user able to Delete the existing Folder in Documents page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  Then user click on the existing folder three dot button in documents page
  When user delete the folder name in edit name pop-up window
  
Scenario: Organizational user able to Upload the PDF file in existing Folder in Documents page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  Then user click on the existing folder tab in documents page
  And user click on the file upload tab in documents page
  When user able to upload the PDF file in documents page
  Then user click on the submit button in file upload pop-up window
  
Scenario: Organizational user able to Edit the Newly Uploaded the PDF file name in existing Folder in Documents page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  Then user click on the existing folder tab in documents page
  And user click on the three dot button in newly uploaded file
  When user click on the edit tab in uploaded file
  Then user enter the new file name in file upload pop-up window
  Then user click on the submit button in file upload pop-up window
  
Scenario: Organizational user able to Delete the Newly Uploaded file in Documents page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  And user click on the three dot button in newly uploaded file
  When user able to perform the delete file action
  
Scenario: Organizational user able to Download the Newly Uploaded file in Documents page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  And user click on the three dot button in newly uploaded file
  When user able to perform the download file action
  
Scenario: Organizational user able to View the Newly Uploaded file in Documents page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  And user click on the three dot button in newly uploaded file
  When user click on the view file button
  
Scenario: Organizational user able to Upload the Docx file in existing Folder in Documents page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  And user click on the file upload tab in documents page
  When user able to upload the Docx file in documents page
  Then user click on the submit button in file upload pop-up window
  
Scenario: Organizational user able to Edit the Newly Uploaded the Docx file name in existing Folder in Documents page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  And user click on the three dot button in newly uploaded file
  When user click on the edit tab in uploaded file
  Then user enter the new file name in docx file upload pop-up window
  And user click on the submit button in file upload pop-up window
  
Scenario: Organizational user able to Upload the Excel file in existing Folder in Documents page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  And user click on the file upload tab in documents page
  When user able to upload the Excel file in documents page
  Then user click on the submit button in file upload pop-up window
  
Scenario: Organizational user able to Upload the Txt file in existing Folder in Documents page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  And user click on the file upload tab in documents page
  When user able to upload the Txt file in documents page
  Then user click on the submit button in file upload pop-up window
  
Scenario: Organizational user able to Upload the HTML file in existing Folder in Documents page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  And user click on the file upload tab in documents page
  When user able to upload the HTML file in documents page
  Then user click on the submit button in file upload pop-up window
  
Scenario: Organizational user able to Upload the PPT file in existing Folder in Documents page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  And user click on the file upload tab in documents page
  When user able to upload the PPT file in documents page
  Then user click on the submit button in file upload pop-up window
  
Scenario: Organizational user able to Upload the file as PNG image in existing Folder in Documents page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  And user click on the file upload tab in documents page
  When user able to upload the PNG image file in documents page
  Then user click on the submit button in file upload pop-up window
  
Scenario: Organizational user able to Upload the file as JPEG image in existing Folder in Documents page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  And user click on the file upload tab in documents page
  When user able to upload the JPEG image file in documents page
  Then user click on the submit button in file upload pop-up window
  
Scenario: Organizational user able to Upload the file as GIF image in existing Folder in Documents page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  And user click on the file upload tab in documents page
  When user able to upload the GIF image file in documents page
  Then user click on the submit button in file upload pop-up window
  
Scenario: Organizational user able to Upload the file as TIFF image in existing Folder in Documents page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  And user click on the file upload tab in documents page
  When user able to upload the TIFF image file in documents page
  Then user click on the submit button in file upload pop-up window
  
Scenario: Organizational user able to Upload the file as JFIF image in existing Folder in Documents page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  And user click on the file upload tab in documents page
  When user able to upload the JFIF image file in documents page
  Then user click on the submit button in file upload pop-up window
  
Scenario: Organizational user able to Perform the Folder Permission in Documents page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  Then user click on the existing folder three dot button in documents page
  When user click on the folder permission button
  Then user click on the particular user checkbox in permission pop-up window
  And user click on the submit button in permission pop-up window
  
Scenario: Organizational user able to Perform the Search Functionality in Documents page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the documents tab in sidebar in HR module page
  Then user able to perform the search functionality in documents page
  
  
  #-------------------------- Employees Section ----------------------------------------------
  
  
Scenario: Organizational user able to click on Employees tab in HR Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  
Scenario: Organizational user able to perform the filter functionality in Employees page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the filter tab in employees page
  And user enter the last name in filter section
  Then user enter the first name in filter section
  And user enter the birth date in filter section
  When user select the designation as employee
  Then user enter the employee id in filter section
  And user enter the cell phone1 in filter section
  When user select the employee status as active
  Then user select the access code type
  And user enter the license number in filter section
  Then user enter the ssn in filter section
  And user enter the tax id in filter section
  When user click on the search button in filter section
  
Scenario: Organizational user able to perform the Add New Employee functionality in Employees page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the new employee tab in employees page
  And user select the title as Mr in employee information section
  When user enter the employee first name in employee information section
  Then user enter the employee middle name in employee information section
  And user enter the employee last name in employee information section
  When user select the employee designation in employee information section
  Then user enter the employee cell phone1 in employee information section
  And user enter the employee business email in employee information section
  Then user able to upload the new employee profile image in employee information section
  When user select the employee start date in employee information section
  Then user select the employment type as Employee in employee information section
  And user select the employment status as Active in employee information section
  Then user select the employee blood group as O in employee information section
  When user select the employee birth date in employee information section
  Then user select the employee gender as male in employee information section
  When user click on the submit button in employee information section
  
Scenario: Organizational user able to perform the Add New Employee functionality without selecting Title in Employees page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the new employee tab in employees page
  When user enter the employee first name in employee information section
  Then user enter the employee middle name in employee information section
  And user enter the employee last name in employee information section
  When user select the employee designation in employee information section
  Then user enter the employee cell phone1 in employee information section
  And user enter the employee business email in employee information section
  When user select the employee start date in employee information section
  Then user select the employment type as Employee in employee information section
  And user select the employment status as Active in employee information section
  Then user select the employee blood group as O in employee information section
  When user select the employee birth date in employee information section
  Then user select the employee gender as male in employee information section
  When user click on the submit button in employee information section
  
Scenario: Organizational user able to perform the Add New Employee functionality without entering First Name in Employees page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the new employee tab in employees page
  And user select the title as Mr in employee information section
  Then user enter the employee middle name in employee information section
  And user enter the employee last name in employee information section
  When user select the employee designation in employee information section
  Then user enter the employee cell phone1 in employee information section
  And user enter the employee business email in employee information section
  When user select the employee start date in employee information section
  Then user select the employment type as Employee in employee information section
  And user select the employment status as Active in employee information section
  Then user select the employee blood group as O in employee information section
  When user select the employee birth date in employee information section
  Then user select the employee gender as male in employee information section
  When user click on the submit button in employee information section
  
Scenario: Organizational user able to perform the Add New Employee functionality without entering Middle Name in Employees page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the new employee tab in employees page
  And user select the title as Mr in employee information section
  When user enter the employee first name in employee information section
  And user enter the employee last name in employee information section
  When user select the employee designation in employee information section
  Then user enter the employee cell phone1 in employee information section
  And user enter the employee business email in employee information section
  When user select the employee start date in employee information section
  Then user select the employment type as Employee in employee information section
  And user select the employment status as Active in employee information section
  Then user select the employee blood group as O in employee information section
  When user select the employee birth date in employee information section
  Then user select the employee gender as male in employee information section
  When user click on the submit button in employee information section
  
Scenario: Organizational user able to perform the Add New Employee functionality without entering Last Name in Employees page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the new employee tab in employees page
  And user select the title as Mr in employee information section
  When user enter the employee first name in employee information section
  Then user enter the employee middle name in employee information section
  When user select the employee designation in employee information section
  Then user enter the employee cell phone1 in employee information section
  And user enter the employee business email in employee information section
  When user select the employee start date in employee information section
  Then user select the employment type as Employee in employee information section
  And user select the employment status as Active in employee information section
  Then user select the employee blood group as O in employee information section
  When user select the employee birth date in employee information section
  Then user select the employee gender as male in employee information section
  When user click on the submit button in employee information section
  
Scenario: Organizational user able to perform the Add New Employee functionality without Selecting Designation in Employees page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the new employee tab in employees page
  And user select the title as Mr in employee information section
  When user enter the employee first name in employee information section
  Then user enter the employee middle name in employee information section
  And user enter the employee last name in employee information section
  Then user enter the employee cell phone1 in employee information section
  And user enter the employee business email in employee information section
  When user select the employee start date in employee information section
  Then user select the employment type as Employee in employee information section
  And user select the employment status as Active in employee information section
  Then user select the employee blood group as O in employee information section
  When user select the employee birth date in employee information section
  Then user select the employee gender as male in employee information section
  When user click on the submit button in employee information section
  
Scenario: Organizational user able to perform the Add New Employee functionality without entering Cell Phone1 in Employees page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the new employee tab in employees page
  And user select the title as Mr in employee information section
  When user enter the employee first name in employee information section
  Then user enter the employee middle name in employee information section
  And user enter the employee last name in employee information section
  When user select the employee designation in employee information section
  And user enter the employee business email in employee information section
  When user select the employee start date in employee information section
  Then user select the employment type as Employee in employee information section
  And user select the employment status as Active in employee information section
  Then user select the employee blood group as O in employee information section
  When user select the employee birth date in employee information section
  Then user select the employee gender as male in employee information section
  When user click on the submit button in employee information section
  
Scenario: Organizational user able to perform the Add New Employee functionality without entering Business Email in Employees page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the new employee tab in employees page
  And user select the title as Mr in employee information section
  When user enter the employee first name in employee information section
  Then user enter the employee middle name in employee information section
  And user enter the employee last name in employee information section
  When user select the employee designation in employee information section
  Then user enter the employee cell phone1 in employee information section
  When user select the employee start date in employee information section
  Then user select the employment type as Employee in employee information section
  And user select the employment status as Active in employee information section
  Then user select the employee blood group as O in employee information section
  When user select the employee birth date in employee information section
  Then user select the employee gender as male in employee information section
  When user click on the submit button in employee information section
  
Scenario: Organizational user able to perform the Add New Employee functionality without entering Employee Start Date in Employees page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the new employee tab in employees page
  And user select the title as Mr in employee information section
  When user enter the employee first name in employee information section
  Then user enter the employee middle name in employee information section
  And user enter the employee last name in employee information section
  When user select the employee designation in employee information section
  Then user enter the employee cell phone1 in employee information section
  And user enter the employee business email in employee information section
  Then user select the employment type as Employee in employee information section
  And user select the employment status as Active in employee information section
  Then user select the employee blood group as O in employee information section
  When user select the employee birth date in employee information section
  Then user select the employee gender as male in employee information section
  When user click on the submit button in employee information section
  
Scenario: Organizational user able to perform the Add New Employee functionality without selecting Employment Type in Employees page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the new employee tab in employees page
  And user select the title as Mr in employee information section
  When user enter the employee first name in employee information section
  Then user enter the employee middle name in employee information section
  And user enter the employee last name in employee information section
  When user select the employee designation in employee information section
  Then user enter the employee cell phone1 in employee information section
  And user enter the employee business email in employee information section
  When user select the employee start date in employee information section
  And user select the employment status as Active in employee information section
  Then user select the employee blood group as O in employee information section
  When user select the employee birth date in employee information section
  Then user select the employee gender as male in employee information section
  When user click on the submit button in employee information section
  
Scenario: Organizational user able to perform the Add New Employee functionality without Selecting Employee Status in Employees page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the new employee tab in employees page
  And user select the title as Mr in employee information section
  When user enter the employee first name in employee information section
  Then user enter the employee middle name in employee information section
  And user enter the employee last name in employee information section
  When user select the employee designation in employee information section
  Then user enter the employee cell phone1 in employee information section
  And user enter the employee business email in employee information section
  When user select the employee start date in employee information section
  Then user select the employment type as Employee in employee information section
  And user select the employee blood group as O in employee information section
  When user select the employee birth date in employee information section
  Then user select the employee gender as male in employee information section
  When user click on the submit button in employee information section
  
Scenario: Organizational user able to perform the Add New Employee functionality without Selecting Blood Group in Employees page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the new employee tab in employees page
  And user select the title as Mr in employee information section
  When user enter the employee first name in employee information section
  Then user enter the employee middle name in employee information section
  And user enter the employee last name in employee information section
  When user select the employee designation in employee information section
  Then user enter the employee cell phone1 in employee information section
  And user enter the employee business email in employee information section
  When user select the employee start date in employee information section
  Then user select the employment type as Employee in employee information section
  And user select the employment status as Active in employee information section
  When user select the employee birth date in employee information section
  Then user select the employee gender as male in employee information section
  When user click on the submit button in employee information section
  
Scenario: Organizational user able to perform the Add New Employee functionality without entering Date of Birth in Employees page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the new employee tab in employees page
  And user select the title as Mr in employee information section
  When user enter the employee first name in employee information section
  Then user enter the employee middle name in employee information section
  And user enter the employee last name in employee information section
  When user select the employee designation in employee information section
  Then user enter the employee cell phone1 in employee information section
  And user enter the employee business email in employee information section
  When user select the employee start date in employee information section
  Then user select the employment type as Employee in employee information section
  And user select the employment status as Active in employee information section
  Then user select the employee blood group as O in employee information section
  And user select the employee gender as male in employee information section
  When user click on the submit button in employee information section
  
Scenario: Organizational user able to perform the Add New Employee functionality without Selecting Gender in Employees page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the new employee tab in employees page
  And user select the title as Mr in employee information section
  When user enter the employee first name in employee information section
  Then user enter the employee middle name in employee information section
  And user enter the employee last name in employee information section
  When user select the employee designation in employee information section
  Then user enter the employee cell phone1 in employee information section
  And user enter the employee business email in employee information section
  When user select the employee start date in employee information section
  Then user select the employment type as Employee in employee information section
  And user select the employment status as Active in employee information section
  Then user select the employee blood group as O in employee information section
  When user select the employee birth date in employee information section
  When user click on the submit button in employee information section
  
Scenario: Organizational user able to perform the Edit Employee functionality with change the Employee Last Name in Employees page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the three dot button in existing employee in employees page
  And user click on the edit tab in three dot in employees page
  Then user change the employee last name in edit employee page
  When user click on the submit button in employee information section
  
Scenario: Organizational user able to perform the Delete Employee functionality in Employees page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the three dot button in existing employee in employees page
  When user perform the existing employee delete functionality
  
Scenario: Organizational user able to click on the View Existing Employee button in Employees page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  
  
  #-------------------------- Employees Details ----------------------------------------------
  
  
Scenario: Organizational user able to click on the Edit button in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the edit button in employee details page
  
Scenario: Organizational user able to perform the Delete functionality in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user perform delete employee functionality in employee details page
  
Scenario: Organizational user able to perform Associated User link functionality in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on associated user link in employee details page
  When user enter the user last name in search user pop-up window
  Then user click on the search button for user link in search user pop-up window
  And user click on the first user radio button in search user pop-up window
  When user click on the submit button for user link in search user pop-up window
  
Scenario: Organizational user able to perform Associated User link functionality without enter the Last Name in Search User in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on associated user link in employee details page
  Then user click on the search button for user link in search user pop-up window
  And user click on the first user radio button in search user pop-up window
  When user click on the submit button for user link in search user pop-up window
  
Scenario: Organizational user able to perform Associated User link functionality without enter the details and click on the submit button in Search User in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on associated user link in employee details page
  When user click on the submit button for user link in search user pop-up window  
  
Scenario: Organizational user able to perform Delink User functionality in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the delink user button in employee details page  
  
Scenario: Organizational user able to click on the Licenses tab in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  
  
  #-------------------------- Licenses Section in Employees Details ----------------------------------------------
  
  
Scenario: Organizational user able to add new Licenses with Upload Employee License File Image format as JPEG in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  When user click on the new licenses button of licenses section in employee details page
  Then user select the license type as Professional License in add employee license pop-up window
  And user enter the license number in add employee license pop-up window
  When user select the license expiration date in add employee license pop-up window
  Then user select the state as Florida in add employee license pop-up window
  And user select the status as Active in add employee license pop-up window
  When user upload the employee license file in add employee license pop-up window
  Then user click on the submit button in add employee license pop-up window
  
Scenario: Organizational user able to add new Licenses with Upload Employee License File Image format as PNG in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  When user click on the new licenses button of licenses section in employee details page
  Then user select the license type as Professional License in add employee license pop-up window
  And user enter the license number in add employee license pop-up window
  When user select the license expiration date in add employee license pop-up window
  Then user select the state as Florida in add employee license pop-up window
  And user select the status as Active in add employee license pop-up window
  When user upload the employee license file image format as PNG in add employee license pop-up window
  Then user click on the submit button in add employee license pop-up window
  
Scenario: Organizational user able to add new Licenses with Upload Employee License File Image format as GIF in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  When user click on the new licenses button of licenses section in employee details page
  Then user select the license type as Professional License in add employee license pop-up window
  And user enter the license number in add employee license pop-up window
  When user select the license expiration date in add employee license pop-up window
  Then user select the state as Florida in add employee license pop-up window
  And user select the status as Active in add employee license pop-up window
  When user upload the employee license file image format as GIF in add employee license pop-up window
  Then user click on the submit button in add employee license pop-up window
  
Scenario: Organizational user able to add new Licenses with Upload Employee License File Image format as TIFF in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  When user click on the new licenses button of licenses section in employee details page
  Then user select the license type as Professional License in add employee license pop-up window
  And user enter the license number in add employee license pop-up window
  When user select the license expiration date in add employee license pop-up window
  Then user select the state as Florida in add employee license pop-up window
  And user select the status as Active in add employee license pop-up window
  When user upload the employee license file image format as TIFF in add employee license pop-up window
  Then user click on the submit button in add employee license pop-up window
  
Scenario: Organizational user able to add new Licenses with Upload Employee License File Image format as JFIF in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  When user click on the new licenses button of licenses section in employee details page
  Then user select the license type as Professional License in add employee license pop-up window
  And user enter the license number in add employee license pop-up window
  When user select the license expiration date in add employee license pop-up window
  Then user select the state as Florida in add employee license pop-up window
  And user select the status as Active in add employee license pop-up window
  When user upload the employee license file image format as JFIF in add employee license pop-up window
  Then user click on the submit button in add employee license pop-up window
  
Scenario: Organizational user able to add new Licenses with Upload Employee License File Image format as SVG in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  When user click on the new licenses button of licenses section in employee details page
  Then user select the license type as Professional License in add employee license pop-up window
  And user enter the license number in add employee license pop-up window
  When user select the license expiration date in add employee license pop-up window
  Then user select the state as Florida in add employee license pop-up window
  And user select the status as Active in add employee license pop-up window
  When user upload the employee license file image format as SVG in add employee license pop-up window
  Then user click on the submit button in add employee license pop-up window
  
Scenario: Organizational user able to add new Licenses with Upload Employee License File as PDF format in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  When user click on the new licenses button of licenses section in employee details page
  Then user select the license type as Professional License in add employee license pop-up window
  And user enter the license number in add employee license pop-up window
  When user select the license expiration date in add employee license pop-up window
  Then user select the state as Florida in add employee license pop-up window
  And user select the status as Active in add employee license pop-up window
  When user upload the employee license file format as PDF in add employee license pop-up window
  Then user click on the submit button in add employee license pop-up window
  
Scenario: Organizational user able to add new Licenses with Upload Employee License File as Docx format in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  When user click on the new licenses button of licenses section in employee details page
  Then user select the license type as Professional License in add employee license pop-up window
  And user enter the license number in add employee license pop-up window
  When user select the license expiration date in add employee license pop-up window
  Then user select the state as Florida in add employee license pop-up window
  And user select the status as Active in add employee license pop-up window
  When user upload the employee license file format as Docx in add employee license pop-up window
  Then user click on the submit button in add employee license pop-up window
  
Scenario: Organizational user able to add new Licenses with Upload Employee License File as PPT format in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  When user click on the new licenses button of licenses section in employee details page
  Then user select the license type as Professional License in add employee license pop-up window
  And user enter the license number in add employee license pop-up window
  When user select the license expiration date in add employee license pop-up window
  Then user select the state as Florida in add employee license pop-up window
  And user select the status as Active in add employee license pop-up window
  When user upload the employee license file format as PPT in add employee license pop-up window
  Then user click on the submit button in add employee license pop-up window
  
Scenario: Organizational user able to add new Licenses with Upload Employee License File as Xls format in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  When user click on the new licenses button of licenses section in employee details page
  Then user select the license type as Professional License in add employee license pop-up window
  And user enter the license number in add employee license pop-up window
  When user select the license expiration date in add employee license pop-up window
  Then user select the state as Florida in add employee license pop-up window
  And user select the status as Active in add employee license pop-up window
  When user upload the employee license file format as Xls in add employee license pop-up window
  Then user click on the submit button in add employee license pop-up window
  
Scenario: Organizational user able to add new Licenses with Upload Employee License File as Xlsx format in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  When user click on the new licenses button of licenses section in employee details page
  Then user select the license type as Professional License in add employee license pop-up window
  And user enter the license number in add employee license pop-up window
  When user select the license expiration date in add employee license pop-up window
  Then user select the state as Florida in add employee license pop-up window
  And user select the status as Active in add employee license pop-up window
  When user upload the employee license file format as Xlsx in add employee license pop-up window
  Then user click on the submit button in add employee license pop-up window
  
Scenario: Organizational user able to add new Licenses with Upload Employee License File as HTML format in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  When user click on the new licenses button of licenses section in employee details page
  Then user select the license type as Professional License in add employee license pop-up window
  And user enter the license number in add employee license pop-up window
  When user select the license expiration date in add employee license pop-up window
  Then user select the state as Florida in add employee license pop-up window
  And user select the status as Active in add employee license pop-up window
  When user upload the employee license file format as HTML in add employee license pop-up window
  Then user click on the submit button in add employee license pop-up window
  
Scenario: Organizational user able to add new Licenses with Upload Employee License File as Txt format in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  When user click on the new licenses button of licenses section in employee details page
  Then user select the license type as Professional License in add employee license pop-up window
  And user enter the license number in add employee license pop-up window
  When user select the license expiration date in add employee license pop-up window
  Then user select the state as Florida in add employee license pop-up window
  And user select the status as Active in add employee license pop-up window
  When user upload the employee license file format as Txt in add employee license pop-up window
  Then user click on the submit button in add employee license pop-up window
  
Scenario: Organizational user able to add new Licenses without selecting License Type in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  When user click on the new licenses button of licenses section in employee details page
  And user enter the license number in add employee license pop-up window
  When user select the license expiration date in add employee license pop-up window
  Then user select the state as Florida in add employee license pop-up window
  And user select the status as Active in add employee license pop-up window
  When user upload the employee license file format as PDF in add employee license pop-up window
  Then user click on the submit button in add employee license pop-up window
  
Scenario: Organizational user able to add new License without entering License Number in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  When user click on the new licenses button of licenses section in employee details page
  Then user select the license type as Professional License in add employee license pop-up window
  When user select the license expiration date in add employee license pop-up window
  Then user select the state as Florida in add employee license pop-up window
  And user select the status as Active in add employee license pop-up window
  When user upload the employee license file format as Txt in add employee license pop-up window
  Then user click on the submit button in add employee license pop-up window
  
Scenario: Organizational user able to add new Licenses without selecting License Expiration Date in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  When user click on the new licenses button of licenses section in employee details page
  Then user select the license type as Professional License in add employee license pop-up window
  And user enter the license number in add employee license pop-up window
  Then user select the state as Florida in add employee license pop-up window
  And user select the status as Active in add employee license pop-up window
  When user upload the employee license file format as Txt in add employee license pop-up window
  Then user click on the submit button in add employee license pop-up window
  
Scenario: Organizational user able to add new Licenses without Selecting State in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  When user click on the new licenses button of licenses section in employee details page
  Then user select the license type as Professional License in add employee license pop-up window
  And user enter the license number in add employee license pop-up window
  When user select the license expiration date in add employee license pop-up window
  And user select the status as Active in add employee license pop-up window
  When user upload the employee license file format as Txt in add employee license pop-up window
  Then user click on the submit button in add employee license pop-up window
  
Scenario: Organizational user able to add new Licenses without Selecting Status in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  When user click on the new licenses button of licenses section in employee details page
  Then user select the license type as Professional License in add employee license pop-up window
  And user enter the license number in add employee license pop-up window
  When user select the license expiration date in add employee license pop-up window
  Then user select the state as Florida in add employee license pop-up window
  When user upload the employee license file format as Txt in add employee license pop-up window
  Then user click on the submit button in add employee license pop-up window
  
Scenario: Organizational user able to add new Licenses without Upload Employee License File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  When user click on the new licenses button of licenses section in employee details page
  Then user select the license type as Professional License in add employee license pop-up window
  And user enter the license number in add employee license pop-up window
  When user select the license expiration date in add employee license pop-up window
  Then user select the state as Florida in add employee license pop-up window
  And user select the status as Active in add employee license pop-up window
  Then user click on the submit button in add employee license pop-up window
  
Scenario: Organizational user able to add new Licenses without Filled any details in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  When user click on the new licenses button of licenses section in employee details page
  Then user click on the submit button in add employee license pop-up window
  
Scenario: Organizational user able to perform Edit functionality of existing License in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  When user click on the three dot button of existing license in license section
  Then user click on the edit tab in existing license in license section
  And user change the license type Professional License to Organization_Administrator_testuser14 in add employee license pop-up window
  When user change the license number in add employee pop-up window
  Then user change the license expiration date in add employee pop-up window
  And user change the state in add employee pop-up window
  When user change the status in add employee pop-up window
  Then user click on the submit button in add employee license pop-up window
  
Scenario: Organizational user able to perform Delete functionality of existing License in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  When user click on the three dot button of existing license in license section
  Then user click on the delete tab in existing license in license section
  
Scenario: Organizational user able to perform Download functionality of existing License in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the licenses tab in employee details page
  When user click on the three dot button of existing license in license section
  Then user click on the download tab in existing license in license section
  
  
  #-------------------------- Access Code Section in Employees Details ----------------------------------------------
  
  
  
Scenario: Organizational user able to click on the Access Code tab in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the access code tab in employee details page
  
Scenario: Organizational user able to add New Access Code in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the access code tab in employee details page
  When user click on the new access code button in access code section
  Then user select the access code type by index in add employee access code pop-up window
  And user select the today's date in add employee access code pop-up window
  When user enter the notes in add employee access code pop-up window
  Then user click on the submit button in add employee access code pop-up window
  
Scenario: Organizational user able to add New Access Code without Selecting Access Code Type in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the access code tab in employee details page
  When user click on the new access code button in access code section
  And user select the today's date in add employee access code pop-up window
  When user enter the notes in add employee access code pop-up window
  Then user click on the submit button in add employee access code pop-up window
  
Scenario: Organizational user able to add New Access Code without Selecting Date in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the access code tab in employee details page
  When user click on the new access code button in access code section
  Then user select the access code type by index in add employee access code pop-up window
  When user enter the notes in add employee access code pop-up window
  Then user click on the submit button in add employee access code pop-up window
  
Scenario: Organizational user able to add New Access Code without entering Notes in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the access code tab in employee details page
  When user click on the new access code button in access code section
  Then user select the access code type by index in add employee access code pop-up window
  And user select the today's date in add employee access code pop-up window
  Then user click on the submit button in add employee access code pop-up window
  
Scenario: Organizational user able to add New Access Code without filled any details in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the access code tab in employee details page
  When user click on the new access code button in access code section
  Then user click on the submit button in add employee access code pop-up window
  
Scenario: Organizational user able to perform the Edit Access Code functionality in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the access code tab in employee details page
  When user click on the three dot button of existing access code in access code section
  Then user click on the edit tab in access code section
  And user change the date in edit employee access code pop-up window
  When user change the notes in edit employee access code pop-up window
  Then user click on the submit button in add employee access code pop-up window
  
Scenario: Organizational user able to perform the Delete Existing Access Code functionality in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the access code tab in employee details page
  When user click on the three dot button of existing access code in access code section
  Then user click on the delete tab in access code section
  
  
  #-------------------------- Docs Section in Employees Details ----------------------------------------------
  
  
Scenario: Organizational user able to click on the Docs tab in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the docs tab in employee details page
  
Scenario: Organizational user able to add New Employee Document with uploading PDF File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the docs tab in employee details page
  When user click on the new document button in docs section
  Then user enter the title name in add employee document pop-up window
  And user upload the PDF document in add employee document pop-up window
  When user click on the submit button in add employee document pop-up window
  
Scenario: Organizational user able to add New Employee Document with uploading Docx File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the docs tab in employee details page
  When user click on the new document button in docs section
  Then user enter the title name in add employee document pop-up window
  And user upload the Docx document in add employee document pop-up window
  When user click on the submit button in add employee document pop-up window
  
Scenario: Organizational user able to add New Employee Document with uploading Excel File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the docs tab in employee details page
  When user click on the new document button in docs section
  Then user enter the title name in add employee document pop-up window
  And user upload the Excel document in add employee document pop-up window
  When user click on the submit button in add employee document pop-up window
  
Scenario: Organizational user able to add New Employee Document with uploading PPT File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the docs tab in employee details page
  When user click on the new document button in docs section
  Then user enter the title name in add employee document pop-up window
  And user upload the PPT document in add employee document pop-up window
  When user click on the submit button in add employee document pop-up window
  
Scenario: Organizational user able to add New Employee Document with uploading HTML File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the docs tab in employee details page
  When user click on the new document button in docs section
  Then user enter the title name in add employee document pop-up window
  And user upload the HTML document in add employee document pop-up window
  When user click on the submit button in add employee document pop-up window
  
Scenario: Organizational user able to add New Employee Document with uploading TXT File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the docs tab in employee details page
  When user click on the new document button in docs section
  Then user enter the title name in add employee document pop-up window
  And user upload the TXT document in add employee document pop-up window
  When user click on the submit button in add employee document pop-up window
  
Scenario: Organizational user able to add New Employee Document with uploading PNG Image File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the docs tab in employee details page
  When user click on the new document button in docs section
  Then user enter the title name in add employee document pop-up window
  And user upload the PNG image file in add employee document pop-up window
  When user click on the submit button in add employee document pop-up window
  
Scenario: Organizational user able to add New Employee Document with uploading GIF Image File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the docs tab in employee details page
  When user click on the new document button in docs section
  Then user enter the title name in add employee document pop-up window
  And user upload the GIF image file in add employee document pop-up window
  When user click on the submit button in add employee document pop-up window
  
Scenario: Organizational user able to add New Employee Document with uploading SVG Image File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the docs tab in employee details page
  When user click on the new document button in docs section
  Then user enter the title name in add employee document pop-up window
  And user upload the SVG image file in add employee document pop-up window
  When user click on the submit button in add employee document pop-up window
  
Scenario: Organizational user able to add New Employee Document with uploading TIFF Image File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the docs tab in employee details page
  When user click on the new document button in docs section
  Then user enter the title name in add employee document pop-up window
  And user upload the TIFF image file in add employee document pop-up window
  When user click on the submit button in add employee document pop-up window
  
Scenario: Organizational user able to add New Employee Document with uploading JPEG Image File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the docs tab in employee details page
  When user click on the new document button in docs section
  Then user enter the title name in add employee document pop-up window
  And user upload the JPEG image file in add employee document pop-up window
  When user click on the submit button in add employee document pop-up window
  
Scenario: Organizational user able to add New Employee Document with uploading JFIF Image File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the docs tab in employee details page
  When user click on the new document button in docs section
  Then user enter the title name in add employee document pop-up window
  And user upload the JFIF image file in add employee document pop-up window
  When user click on the submit button in add employee document pop-up window
  
Scenario: Organizational user able to add New Employee Document with uploading Audio File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the docs tab in employee details page
  When user click on the new document button in docs section
  Then user enter the title name in add employee document pop-up window
  And user upload the audio file in add employee document pop-up window
  When user click on the submit button in add employee document pop-up window
  
Scenario: Organizational user able to add New Employee Document with uploading Video File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the docs tab in employee details page
  When user click on the new document button in docs section
  Then user enter the title name in add employee document pop-up window
  And user upload the video file in add employee document pop-up window
  When user click on the submit button in add employee document pop-up window   
  
Scenario: Organizational user able to add New Employee Document without entering Title Name in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the docs tab in employee details page
  When user click on the new document button in docs section
  And user upload the JFIF image file in add employee document pop-up window
  When user click on the submit button in add employee document pop-up window
  
Scenario: Organizational user able to add New Employee Document without uploading File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the docs tab in employee details page
  When user click on the new document button in docs section
  Then user enter the title name in add employee document pop-up window
  When user click on the submit button in add employee document pop-up window
  
Scenario: Organizational user able to add New Employee Document without filled any details in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the docs tab in employee details page
  When user click on the new document button in docs section
  Then user click on the submit button in add employee document pop-up window
  
Scenario: Organizational user able to perform the Edit Existing Document functionality in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the docs tab in employee details page
  When user click on the three dot tab in existing document in docs section
  Then user click on the edit tab in existing document in docs section
  And user change the title in existing document in docs section
  Then user upload the JFIF image file in add employee document pop-up window
  When user click on the submit button in add employee document pop-up window
  
Scenario: Organizational user able to perform the delete Existing Document functionality in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the docs tab in employee details page
  When user click on the three dot tab in existing document in docs section
  Then user click on the delete tab in existing document in docs section
  
Scenario: Organizational user able to perform the download Existing Document functionality in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the docs tab in employee details page
  When user click on the three dot tab in existing document in docs section
  Then user click on the download tab in existing document in docs section   
  
  
  #-------------------------- CheckList Section in Employees Details ----------------------------------------------
  
  
Scenario: Organizational user able to click on the CheckList tab in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the checklist tab in employee details page
  
Scenario: Organizational user able to add New Employee CheckList with uploading PDF File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the checklist tab in employee details page
  When user click on the new checklist button in checklist section
  Then user select the checklist in add employee checklist pop-up window
  And user upload PDF file in add employee checklist pop-up window
  When user enter the notes in add employee checklist pop-up window
  Then user click on the submit button in add employee checklist pop-up window
  
Scenario: Organizational user able to add New Employee CheckList with uploading Docx File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the checklist tab in employee details page
  When user click on the new checklist button in checklist section
  Then user select the checklist in add employee checklist pop-up window
  And user upload Docx file in add employee checklist pop-up window
  When user enter the notes in add employee checklist pop-up window
  Then user click on the submit button in add employee checklist pop-up window
  
Scenario: Organizational user able to add New Employee CheckList with uploading Excel File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the checklist tab in employee details page
  When user click on the new checklist button in checklist section
  Then user select the checklist in add employee checklist pop-up window
  And user upload Excel file in add employee checklist pop-up window
  When user enter the notes in add employee checklist pop-up window
  Then user click on the submit button in add employee checklist pop-up window
  
Scenario: Organizational user able to add New Employee CheckList with uploading PPT File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the checklist tab in employee details page
  When user click on the new checklist button in checklist section
  Then user select the checklist in add employee checklist pop-up window
  And user upload PPT file in add employee checklist pop-up window
  When user enter the notes in add employee checklist pop-up window
  Then user click on the submit button in add employee checklist pop-up window
  
Scenario: Organizational user able to add New Employee CheckList with uploading Txt File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the checklist tab in employee details page
  When user click on the new checklist button in checklist section
  Then user select the checklist in add employee checklist pop-up window
  And user upload Txt file in add employee checklist pop-up window
  When user enter the notes in add employee checklist pop-up window
  Then user click on the submit button in add employee checklist pop-up window
  
Scenario: Organizational user able to add New Employee CheckList with uploading HTML File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the checklist tab in employee details page
  When user click on the new checklist button in checklist section
  Then user select the checklist in add employee checklist pop-up window
  And user upload HTML file in add employee checklist pop-up window
  When user enter the notes in add employee checklist pop-up window
  Then user click on the submit button in add employee checklist pop-up window
  
Scenario: Organizational user able to add New Employee CheckList with uploading PNG image File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the checklist tab in employee details page
  When user click on the new checklist button in checklist section
  Then user select the checklist in add employee checklist pop-up window
  And user upload PNG image file in add employee checklist pop-up window
  When user enter the notes in add employee checklist pop-up window
  Then user click on the submit button in add employee checklist pop-up window
  
Scenario: Organizational user able to add New Employee CheckList with uploading JPEG image File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the checklist tab in employee details page
  When user click on the new checklist button in checklist section
  Then user select the checklist in add employee checklist pop-up window
  And user upload JPEG image file in add employee checklist pop-up window
  When user enter the notes in add employee checklist pop-up window
  Then user click on the submit button in add employee checklist pop-up window
  
Scenario: Organizational user able to add New Employee CheckList with uploading SVG image File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the checklist tab in employee details page
  When user click on the new checklist button in checklist section
  Then user select the checklist in add employee checklist pop-up window
  And user upload SVG image file in add employee checklist pop-up window
  When user enter the notes in add employee checklist pop-up window
  Then user click on the submit button in add employee checklist pop-up window
  
Scenario: Organizational user able to add New Employee CheckList with uploading GIF image File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the checklist tab in employee details page
  When user click on the new checklist button in checklist section
  Then user select the checklist in add employee checklist pop-up window
  And user upload GIF image file in add employee checklist pop-up window
  When user enter the notes in add employee checklist pop-up window
  Then user click on the submit button in add employee checklist pop-up window
  
Scenario: Organizational user able to add New Employee CheckList with uploading TIFF image File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the checklist tab in employee details page
  When user click on the new checklist button in checklist section
  Then user select the checklist in add employee checklist pop-up window
  And user upload TIFF image file in add employee checklist pop-up window
  When user enter the notes in add employee checklist pop-up window
  Then user click on the submit button in add employee checklist pop-up window
  
Scenario: Organizational user able to add New Employee CheckList with uploading JFIF image File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the checklist tab in employee details page
  When user click on the new checklist button in checklist section
  Then user select the checklist in add employee checklist pop-up window
  And user upload JFIF image file in add employee checklist pop-up window
  When user enter the notes in add employee checklist pop-up window
  Then user click on the submit button in add employee checklist pop-up window
  
Scenario: Organizational user able to add New Employee CheckList with uploading Audio File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the checklist tab in employee details page
  When user click on the new checklist button in checklist section
  Then user select the checklist in add employee checklist pop-up window
  And user upload audio file in add employee checklist pop-up window
  When user enter the notes in add employee checklist pop-up window
  Then user click on the submit button in add employee checklist pop-up window
  
Scenario: Organizational user able to add New Employee CheckList with uploading Video File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the checklist tab in employee details page
  When user click on the new checklist button in checklist section
  Then user select the checklist in add employee checklist pop-up window
  And user upload video file in add employee checklist pop-up window
  When user enter the notes in add employee checklist pop-up window
  Then user click on the submit button in add employee checklist pop-up window
  
Scenario: Organizational user able to add New Employee CheckList without uploading File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the checklist tab in employee details page
  When user click on the new checklist button in checklist section
  Then user select the checklist in add employee checklist pop-up window
  When user enter the notes in add employee checklist pop-up window
  Then user click on the submit button in add employee checklist pop-up window
  
Scenario: Organizational user able to add New Employee CheckList without Selecting CheckList in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the checklist tab in employee details page
  When user click on the new checklist button in checklist section
  And user upload PNG image file in add employee checklist pop-up window
  When user enter the notes in add employee checklist pop-up window
  Then user click on the submit button in add employee checklist pop-up window
  
Scenario: Organizational user able to add New Employee CheckList without entering Notes in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the checklist tab in employee details page
  When user click on the new checklist button in checklist section
  Then user select the checklist in add employee checklist pop-up window
  And user upload PNG image file in add employee checklist pop-up window
  Then user click on the submit button in add employee checklist pop-up window
  
Scenario: Organizational user able to add New Employee CheckList without filled any details in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the checklist tab in employee details page
  When user click on the new checklist button in checklist section
  Then user click on the submit button in add employee checklist pop-up window
  
Scenario: Organizational user able to perform the Existing Employee Checklist Edit functionality in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the checklist tab in employee details page
  When user click on the three dot button in checklist section
  Then user click on the edit button in existing employee checklist in checklist section
  And user change the checklist in edit employee checklist pop-up window
  When user change the file in edit employee checklist pop-up window
  Then user change the notes in edit employee checklist pop-up window
  And user click on the submit button in add employee checklist pop-up window
  
Scenario: Organizational user able to perform the Existing Employee Checklist Delete functionality in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the checklist tab in employee details page
  When user click on the three dot button in checklist section
  Then user click on the delete button in existing employee checklist in checklist section
  
Scenario: Organizational user able to perform the Existing Employee Checklist Download functionality in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the checklist tab in employee details page
  When user click on the three dot button in checklist section
  Then user click on the download button in existing employee checklist in checklist section
  
  
  #-------------------------- Note Section in Employees Details ----------------------------------------------
  
  
Scenario: Organizational user able to click on the Note tab in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the note tab in employee details page
  
Scenario: Organizational user able to Add a New Employee Note with Uploading PDF File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the note tab in employee details page
  When user click on the new note button in note section
  Then user enter the subject in add employee note pop-up window
  And user enter the notes in add employee note pop-up window
  When user upload the PDF file in add employee note pop-up window
  Then user click on the submit button in add employee note pop-up window
  
Scenario: Organizational user able to Add a New Employee Note with Uploading Docx File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the note tab in employee details page
  When user click on the new note button in note section
  Then user enter the subject in add employee note pop-up window
  And user enter the notes in add employee note pop-up window
  When user upload the Docx file in add employee note pop-up window
  Then user click on the submit button in add employee note pop-up window
  
Scenario: Organizational user able to Add a New Employee Note with Uploading Excel File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the note tab in employee details page
  When user click on the new note button in note section
  Then user enter the subject in add employee note pop-up window
  And user enter the notes in add employee note pop-up window
  When user upload the Excel file in add employee note pop-up window
  Then user click on the submit button in add employee note pop-up window
  
Scenario: Organizational user able to Add a New Employee Note with Uploading PPT File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the note tab in employee details page
  When user click on the new note button in note section
  Then user enter the subject in add employee note pop-up window
  And user enter the notes in add employee note pop-up window
  When user upload the PPT file in add employee note pop-up window
  Then user click on the submit button in add employee note pop-up window
  
Scenario: Organizational user able to Add a New Employee Note with Uploading HTML File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the note tab in employee details page
  When user click on the new note button in note section
  Then user enter the subject in add employee note pop-up window
  And user enter the notes in add employee note pop-up window
  When user upload the HTML file in add employee note pop-up window
  Then user click on the submit button in add employee note pop-up window
  
Scenario: Organizational user able to Add a New Employee Note with Uploading Txt File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the note tab in employee details page
  When user click on the new note button in note section
  Then user enter the subject in add employee note pop-up window
  And user enter the notes in add employee note pop-up window
  When user upload the Txt file in add employee note pop-up window
  Then user click on the submit button in add employee note pop-up window
  
Scenario: Organizational user able to Add a New Employee Note with Uploading PNG image File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the note tab in employee details page
  When user click on the new note button in note section
  Then user enter the subject in add employee note pop-up window
  And user enter the notes in add employee note pop-up window
  When user upload the PNG image file in add employee note pop-up window
  Then user click on the submit button in add employee note pop-up window
  
Scenario: Organizational user able to Add a New Employee Note with Uploading JPEG image File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the note tab in employee details page
  When user click on the new note button in note section
  Then user enter the subject in add employee note pop-up window
  And user enter the notes in add employee note pop-up window
  When user upload the JPEG image file in add employee note pop-up window
  Then user click on the submit button in add employee note pop-up window
  
Scenario: Organizational user able to Add a New Employee Note with Uploading GIF image File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the note tab in employee details page
  When user click on the new note button in note section
  Then user enter the subject in add employee note pop-up window
  And user enter the notes in add employee note pop-up window
  When user upload the GIF image file in add employee note pop-up window
  Then user click on the submit button in add employee note pop-up window
  
Scenario: Organizational user able to Add a New Employee Note with Uploading SVG image File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the note tab in employee details page
  When user click on the new note button in note section
  Then user enter the subject in add employee note pop-up window
  And user enter the notes in add employee note pop-up window
  When user upload the SVG image file in add employee note pop-up window
  Then user click on the submit button in add employee note pop-up window
  
Scenario: Organizational user able to Add a New Employee Note with Uploading Audio File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the note tab in employee details page
  When user click on the new note button in note section
  Then user enter the subject in add employee note pop-up window
  And user enter the notes in add employee note pop-up window
  When user upload the audio file in add employee note pop-up window
  Then user click on the submit button in add employee note pop-up window
  
Scenario: Organizational user able to Add a New Employee Note with Uploading Video File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the note tab in employee details page
  When user click on the new note button in note section
  Then user enter the subject in add employee note pop-up window
  And user enter the notes in add employee note pop-up window
  When user upload the video file in add employee note pop-up window
  Then user click on the submit button in add employee note pop-up window
  
Scenario: Organizational user able to Add a New Employee Note without entering Subject in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the note tab in employee details page
  When user click on the new note button in note section
  And user enter the notes in add employee note pop-up window
  When user upload the SVG image file in add employee note pop-up window
  Then user click on the submit button in add employee note pop-up window
  
Scenario: Organizational user able to Add a New Employee Note without entering Notes in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the note tab in employee details page
  When user click on the new note button in note section
  Then user enter the subject in add employee note pop-up window
  When user upload the SVG image file in add employee note pop-up window
  Then user click on the submit button in add employee note pop-up window
  
Scenario: Organizational user able to Add a New Employee Note without Uploading File in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the note tab in employee details page
  When user click on the new note button in note section
  Then user enter the subject in add employee note pop-up window
  And user enter the notes in add employee note pop-up window
  Then user click on the submit button in add employee note pop-up window
  
Scenario: Organizational user able to Add a New Employee Note without filled any details in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the note tab in employee details page
  When user click on the new note button in note section
  Then user click on the submit button in add employee note pop-up window
  
Scenario: Organizational user able to perform the Existing Employee Note Edit functionality in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the note tab in employee details page
  When user click on the three dot button in existing employee note in note section
  Then user click on the edit button in note section
  And user change the subject in edit employee note pop-up window
  When user change the notes in edit employee note pop-up window
  Then user change the file in edit employee note pop-up window
  And user click on the submit button in add employee note pop-up window
  
Scenario: Organizational user able to perform the Existing Employee Note Delete functionality in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the note tab in employee details page
  When user click on the three dot button in existing employee note in note section
  Then user click on the delete button in note section
  
Scenario: Organizational user able to perform the Existing Employee Note Download functionality in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the note tab in employee details page
  When user click on the three dot button in existing employee note in note section
  Then user click on the download button in note section
  
  
  #-------------------------- TimeLine Section in Employees Details ----------------------------------------------
  
  
Scenario: Organizational user able to click on the TimeLine tab in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the timeline tab in employee details page
  
Scenario: Organizational user able to Add Employee New Timeline with Selecting Status as Active in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the timeline tab in employee details page
  When user click on the new timeline button in timeline section
  Then user enter the event in add employee timeline pop-up window
  And user select the event date as today's in add employee timeline pop-up window
  When user enter the notes in add employee timeline pop-up window
  Then user select the status as Active in add employee timeline pop-up window
  And user click on the submit button in add employee timeline pop-up window
  
Scenario: Organizational user able to Add Employee New Timeline with Selecting Status as NotOnPayroll in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the timeline tab in employee details page
  When user click on the new timeline button in timeline section
  Then user enter the event in add employee timeline pop-up window
  And user select the event date as today's in add employee timeline pop-up window
  When user enter the notes in add employee timeline pop-up window
  Then user select the status as NotOnPayroll in add employee timeline pop-up window
  And user click on the submit button in add employee timeline pop-up window
  
Scenario: Organizational user able to Add Employee New Timeline with Selecting Status as Terminated in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the timeline tab in employee details page
  When user click on the new timeline button in timeline section
  Then user enter the event in add employee timeline pop-up window
  And user select the event date as today's in add employee timeline pop-up window
  When user enter the notes in add employee timeline pop-up window
  Then user select the status as Terminated in add employee timeline pop-up window
  And user click on the submit button in add employee timeline pop-up window
  
Scenario: Organizational user able to Add Employee New Timeline with Selecting Status as Deceased in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the timeline tab in employee details page
  When user click on the new timeline button in timeline section
  Then user enter the event in add employee timeline pop-up window
  And user select the event date as today's in add employee timeline pop-up window
  When user enter the notes in add employee timeline pop-up window
  Then user select the status as Deceased in add employee timeline pop-up window
  And user click on the submit button in add employee timeline pop-up window                                                                                                                  
  
Scenario: Organizational user able to Add Employee New Timeline with Selecting Status as Resigned in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the timeline tab in employee details page
  When user click on the new timeline button in timeline section
  Then user enter the event in add employee timeline pop-up window
  And user select the event date as today's in add employee timeline pop-up window
  When user enter the notes in add employee timeline pop-up window
  Then user select the status as Resigned in add employee timeline pop-up window
  And user click on the submit button in add employee timeline pop-up window
  
Scenario: Organizational user able to Add Employee New Timeline without entering Event in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the timeline tab in employee details page
  When user click on the new timeline button in timeline section
  And user select the event date as today's in add employee timeline pop-up window
  When user enter the notes in add employee timeline pop-up window
  Then user select the status as Resigned in add employee timeline pop-up window
  And user click on the submit button in add employee timeline pop-up window
  
Scenario: Organizational user able to Add Employee New Timeline without Selecting Event Date in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the timeline tab in employee details page
  When user click on the new timeline button in timeline section
  Then user enter the event in add employee timeline pop-up window
  When user enter the notes in add employee timeline pop-up window
  Then user select the status as Resigned in add employee timeline pop-up window
  And user click on the submit button in add employee timeline pop-up window
  
Scenario: Organizational user able to Add Employee New Timeline without entering Notes in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the timeline tab in employee details page
  When user click on the new timeline button in timeline section
  Then user enter the event in add employee timeline pop-up window
  And user select the event date as today's in add employee timeline pop-up window
  Then user select the status as Resigned in add employee timeline pop-up window
  And user click on the submit button in add employee timeline pop-up window
  
Scenario: Organizational user able to Add Employee New Timeline without Selecting Status in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the timeline tab in employee details page
  When user click on the new timeline button in timeline section
  Then user enter the event in add employee timeline pop-up window
  And user select the event date as today's in add employee timeline pop-up window
  When user enter the notes in add employee timeline pop-up window
  And user click on the submit button in add employee timeline pop-up window
  
Scenario: Organizational user able to Add Employee New Timeline without filled any details in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the timeline tab in employee details page
  When user click on the new timeline button in timeline section
  And user click on the submit button in add employee timeline pop-up window
  
  
  #-------------------------- WorkBench Section in Employees Details ----------------------------------------------
  
  
Scenario: Organizational user able to click on the WorkBench tab in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the workbench tab in employee details page
  
Scenario: Organizational user able to Add New Workbench in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the workbench tab in employee details page
  When user click on the new workbench button in workbench section
  Then user enter the workbench name in add new workbench pop-up window
  And user click on the checkbox of workbench name in add new workbench pop-up window
  Then user click on the submit button in add new workbench pop-up window
  
Scenario: Organizational user able to Add New Workbench using search with invalid workbench name in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the workbench tab in employee details page
  When user click on the new workbench button in workbench section
  Then user enter the invalid workbench name in add new workbench pop-up window
  And user click on the checkbox of workbench name in add new workbench pop-up window
  Then user click on the submit button in add new workbench pop-up window
  
Scenario: Organizational user able to Add New Workbench without search using workbench name in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the workbench tab in employee details page
  When user click on the new workbench button in workbench section
  And user click on the checkbox of workbench name in add new workbench pop-up window
  Then user click on the submit button in add new workbench pop-up window
  
Scenario: Organizational user able to Add New Workbench without click on the workbench name checkbox in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the workbench tab in employee details page
  When user click on the new workbench button in workbench section
  Then user enter the workbench name in add new workbench pop-up window
  And user click on the submit button in add new workbench pop-up window
  
Scenario: Organizational user able to Add New Workbench without filled any details in Employee Details page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the employees tab in sidebar in HR module page
  Then user click on the view button in existing employee in employees page
  And user click on the workbench tab in employee details page
  When user click on the new workbench button in workbench section
  And user click on the submit button in add new workbench pop-up window
  
  
  #-------------------------- WorkBenches Section ----------------------------------------------
  
  
Scenario: Organizational user able to click on the Workbenches tab in HR Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the workbenches tab in sidebar in HR module page
  
Scenario: Organizational user able to perform the Search functionality in Workbenches page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the workbenches tab in sidebar in HR module page
  Then user click on the filter tab in workbenches page
  And user enter the workbeches name in search textbox in workbenches page
  When user click on the search button in workbenches page
  
Scenario: Organizational user able to perform the Search functionality with entering invalid workbenches name in Workbenches page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the workbenches tab in sidebar in HR module page
  Then user click on the filter tab in workbenches page
  And user enter the invalid workbeches name in search textbox in workbenches page
  When user click on the search button in workbenches page
  
Scenario: Organizational user able to Add New Workbench in Workbenches page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the workbenches tab in sidebar in HR module page
  Then user click on the new workbench button in workbenches page
  And user enter the workbench name in add new workbench pop-up window in workbenches page
  When user enter the workbench description in add new workbench pop-up window in workbenches page
  Then user click on the submit button in add new workbench pop-up window in workbenches page
  
Scenario: Organizational user able to Add New Workbench with enter only Workbench Name in Workbenches page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the workbenches tab in sidebar in HR module page
  Then user click on the new workbench button in workbenches page
  And user enter the workbench name in add new workbench pop-up window in workbenches page
  Then user click on the submit button in add new workbench pop-up window in workbenches page
  
Scenario: Organizational user able to Add New Workbench with enter only Workbench Description in Workbenches page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the workbenches tab in sidebar in HR module page
  Then user click on the new workbench button in workbenches page
  When user enter the workbench description in add new workbench pop-up window in workbenches page
  Then user click on the submit button in add new workbench pop-up window in workbenches page
  
Scenario: Organizational user able to Add New Workbench without entering any details in Workbenches page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the workbenches tab in sidebar in HR module page
  Then user click on the new workbench button in workbenches page
  When user click on the submit button in add new workbench pop-up window in workbenches page
  
Scenario: Organizational user able to perform the Existing Workbench Edit functionality in Workbenches page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the workbenches tab in sidebar in HR module page
  Then user click on the three dot button in existing workbench in workbenches page
  And user click on the edit button in existing workbench in workbenches page
  When user change the workbench name in edit workbench pop-up window
  Then user change the workbench descriptions in edit workbench pop-up window
  When user click on the submit button in add new workbench pop-up window in workbenches page
  
Scenario: Organizational user able to perform the Existing Workbench Delete functionality in Workbenches page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the workbenches tab in sidebar in HR module page
  Then user click on the three dot button in existing workbench in workbenches page
  And user click on the delete button in existing workbench in workbenches page
   
    
   #-------------------------- Timesheet Section ----------------------------------------------
   
   
Scenario: Organizational user able to click on the Timesheet tab in HR Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the timesheet tab in sidebar in HR module page
  
Scenario: Organizational user able to perform the Add Timeline for particular Employee in HR Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the timesheet tab in sidebar in HR module page
  Then user click on the add line button in timesheet section
  And user select the today's task date in add task efforts pop-up window
  When user select the project in add task efforts pop-up window
  Then user select the task in add task efforts pop-up window
  And user enter the task hours in add task efforts pop-up window
  When user click on the submit button in add task efforts pop-up window
  
Scenario: Organizational user able to perform the Add Timeline for particular Employee without Select Task Date in HR Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the timesheet tab in sidebar in HR module page
  Then user click on the add line button in timesheet section
  When user select the project in add task efforts pop-up window
  Then user select the task in add task efforts pop-up window
  And user enter the task hours in add task efforts pop-up window
  When user click on the submit button in add task efforts pop-up window
  
Scenario: Organizational user able to perform the Add Timeline for particular Employee without select Project in HR Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the timesheet tab in sidebar in HR module page
  Then user click on the add line button in timesheet section
  And user select the today's task date in add task efforts pop-up window
  Then user select the task in add task efforts pop-up window
  And user enter the task hours in add task efforts pop-up window
  When user click on the submit button in add task efforts pop-up window
  
Scenario: Organizational user able to perform the Add Timeline for particular Employee withput Selecting Task in HR Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the timesheet tab in sidebar in HR module page
  Then user click on the add line button in timesheet section
  And user select the today's task date in add task efforts pop-up window
  When user select the project in add task efforts pop-up window
  And user enter the task hours in add task efforts pop-up window
  When user click on the submit button in add task efforts pop-up window
  
Scenario: Organizational user able to perform the Add Timeline for particular Employee without entering Task Hours in HR Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the timesheet tab in sidebar in HR module page
  Then user click on the add line button in timesheet section
  And user select the today's task date in add task efforts pop-up window
  When user select the project in add task efforts pop-up window
  Then user select the task in add task efforts pop-up window
  When user click on the submit button in add task efforts pop-up window
  
Scenario: Organizational user able to perform the Add Timeline for particular Employee without filled any details in HR Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the timesheet tab in sidebar in HR module page
  Then user click on the add line button in timesheet section
  When user click on the submit button in add task efforts pop-up window
  
Scenario: Organizational user able to Change the Existing Employee Task Hours in Timesheet page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the timesheet tab in sidebar in HR module page
  And user click on the today button in timesheet section
  Then user able to change the existing employee task hours in timesheet section
  And user click on the today button in timesheet section
  
Scenario: Organizational user able to Change the Existing Employee Task Hours using invalid value like character in Timesheet page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the timesheet tab in sidebar in HR module page
  And user click on the today button in timesheet section
  Then user able to change the existing employee task hours using invalid value like character in timesheet section
  And user click on the today button in timesheet section 
  
Scenario: Organizational user able to perform the Export To Excel functionality in Timesheet page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the HR module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the timesheet tab in sidebar in HR module page
  Then user click on the export to excel button  