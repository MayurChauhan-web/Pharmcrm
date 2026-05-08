@SalesRepsModuleFeature

Feature: Sales Reps Module Functionality  
 
Scenario: User able to login with user type as Organization in login page  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  
Scenario: Organizational user able to click on Sales Reps Module tab 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  
  
  #-------------------------- Sales Rep Questions Section ----------------------------------------------
  
  
Scenario: Organizational user able to click on Sales Rep Questions tab in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Questions tab in sidebar in Sales Reps module page
  
Scenario: Organizational user able to Add New Sales Rep Question with Selecting Configuration as Calculative and Mandatory in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Questions tab in sidebar in Sales Reps module page
  Then user click on the add new sales rep question button in Sales Rep Questions section
  And user enter the sales rep question in Sales Rep Questions section
  When user click on the calculative checkbox in Sales Rep Questions section
  Then user click on the mandatory checkbox in Sales Rep Questions section
  And user click on the submit button in Sales Rep Questions section
  
Scenario: Organizational user able to Add New Sales Rep Question with Selecting Configuration as only Calculative in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Questions tab in sidebar in Sales Reps module page
  Then user click on the add new sales rep question button in Sales Rep Questions section
  And user enter the sales rep question in Sales Rep Questions section
  When user click on the calculative checkbox in Sales Rep Questions section
  And user click on the submit button in Sales Rep Questions section
  
Scenario: Organizational user able to Add New Sales Rep Question with Selecting Configuration as Only Mandatory in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Questions tab in sidebar in Sales Reps module page
  Then user click on the add new sales rep question button in Sales Rep Questions section
  And user enter the sales rep question in Sales Rep Questions section
  Then user click on the mandatory checkbox in Sales Rep Questions section
  And user click on the submit button in Sales Rep Questions section
    
Scenario: Organizational user able to Add New Sales Rep Question without Selecting Configuration as Calculative and Mandatory in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Questions tab in sidebar in Sales Reps module page
  Then user click on the add new sales rep question button in Sales Rep Questions section
  And user enter the sales rep question in Sales Rep Questions section
  When user click on the submit button in Sales Rep Questions section
  
Scenario: Organizational user able to Add New Sales Rep Question without entering the Sales Rep Question in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Questions tab in sidebar in Sales Reps module page
  Then user click on the add new sales rep question button in Sales Rep Questions section
  When user click on the calculative checkbox in Sales Rep Questions section
  Then user click on the mandatory checkbox in Sales Rep Questions section
  And user click on the submit button in Sales Rep Questions section
  
Scenario: Organizational user able to Add New Sales Rep Question without entering the Sales Rep Question and Selecting Configuration only Calculative in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Questions tab in sidebar in Sales Reps module page
  Then user click on the add new sales rep question button in Sales Rep Questions section
  When user click on the calculative checkbox in Sales Rep Questions section
  And user click on the submit button in Sales Rep Questions section
  
Scenario: Organizational user able to Add New Sales Rep Question without entering the Sales Rep Question and Selecting Configuration only Mandatory in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Questions tab in sidebar in Sales Reps module page
  Then user click on the add new sales rep question button in Sales Rep Questions section
  When user click on the mandatory checkbox in Sales Rep Questions section
  And user click on the submit button in Sales Rep Questions section
  
Scenario: Organizational user able to Add New Sales Rep Question without entering the Sales Rep Question and without Selecting Configurations in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Questions tab in sidebar in Sales Reps module page
  Then user click on the add new sales rep question button in Sales Rep Questions section
  And user click on the submit button in Sales Rep Questions section
  
Scenario: Organizational user able to perform the Edit functionality of Existing Sales Rep Question in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Questions tab in sidebar in Sales Reps module page
  Then user click on the three dot button of existing sales rep question in sales rep questions section
  And user click on the edit button of existing sales rep question in sales rep questions section
  When user change the sales rep question in sale rep question section
  When user click on the calculative checkbox in Sales Rep Questions section
  Then user click on the mandatory checkbox in Sales Rep Questions section
  And user click on the submit button in Sales Rep Questions section
  
Scenario: Organizational user able to perform the Delete functionality of Existing Sales Rep Question in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Questions tab in sidebar in Sales Reps module page
  Then user click on the three dot button of existing sales rep question in sales rep questions section
  And user click on the delete button of existing sales rep question in sales rep questions section
  
  
  #-------------------------- Buckets Section ----------------------------------------------
  
  
Scenario: Organizational user able to click on Buckets tab in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  
Scenario: Organizational user able to create a New Folder with Selecting Folder Type as Public in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user click on the new folder tab in salesrep documents section
  And user enter the folder name in new folder pop-up window
  When user select the folder type as Public in new folder pop-up window
  Then user click on the submit button in new folder pop-up window
  
Scenario: Organizational user able to create a New Folder with Selecting Folder Type as Private (only visible to me) in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user click on the new folder tab in salesrep documents section
  And user enter the folder name in new folder pop-up window
  When user select the folder type as Private only visible to me in new folder pop-up window
  Then user click on the submit button in new folder pop-up window
  
Scenario: Organizational user able to create a New Folder without Selecting Folder Type in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user click on the new folder tab in salesrep documents section
  And user enter the folder name in new folder pop-up window
  Then user click on the submit button in new folder pop-up window
  
Scenario: Organizational user able to create a New Folder without entering Folder Name and Selecting Folder Type as Private (only visible to me) in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user click on the new folder tab in salesrep documents section
  When user select the folder type as Private only visible to me in new folder pop-up window
  Then user click on the submit button in new folder pop-up window
  
Scenario: Organizational user able to create a New Folder without filled any details in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user click on the new folder tab in salesrep documents section
  And user click on the submit button in new folder pop-up window
  
Scenario: Organizational user able to perform the Edit functionality of Existing Folder in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user click on the three dot button of existing folder in salesrep documents section
  And user click on the edit button of existing folder in salesrep documents section
  When user change the folder name in edit folder pop-up window
  Then user change the folder type in edit folder pop-up window
  And user click on the submit button in new folder pop-up window
  
Scenario: Organizational user able to perform the Delete functionality of Existing Folder in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user click on the three dot button of existing folder in salesrep documents section
  And user click on the delete button of existing folder in salesrep documents section
  
Scenario: Organizational user able to perform the Zone Permission functionality of Existing Folder in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user click on the three dot button of existing folder in salesrep documents section
  And user click on the permission button of existing folder in salesrep documents section
  When user click on the first zone checkbox button in permission pop-up window
  Then user click on the submit button in permission pop-up window in salesrep documents section
  
Scenario: Organizational user able to perform the Zone Permission functionality of Existing Folder without Selecting Zone in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user click on the three dot button of existing folder in salesrep documents section
  And user click on the permission button of existing folder in salesrep documents section
  Then user click on the submit button in permission pop-up window in salesrep documents section
  
Scenario: Organizational user able to perform the User Permission functionality of Existing Folder in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user click on the three dot button of existing folder in salesrep documents section
  And user click on the user permission button of existing folder in salesrep documents section
  When user click on the first user checkbox button in permission pop-up window
  Then user click on the submit button in user permission pop-up window in salesrep documents section
  
Scenario: Organizational user able to perform the User Permission functionality of Existing Folder without Selecting User in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user click on the three dot button of existing folder in salesrep documents section
  And user click on the user permission button of existing folder in salesrep documents section
  Then user click on the submit button in user permission pop-up window in salesrep documents section
  
Scenario: Organizational user able to Upload the PDF file of Existing Folder in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user double click on the existing folder in salesrep documents section
  And user click on the upload tab in salesrep documents section
  When user upload the PDF file in salesrep documents section
  Then user click on the submit button in salesrep documents section
  
Scenario: Organizational user able to Perform the Upload the file functionality of Existing Folder without uploading any file in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user double click on the existing folder in salesrep documents section
  And user click on the upload tab in salesrep documents section
  Then user click on the submit button in salesrep documents section
  
Scenario: Organizational user able to Upload the Docx file of Existing Folder in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user double click on the existing folder in salesrep documents section
  And user click on the upload tab in salesrep documents section
  When user upload the Docx file in salesrep documents section
  Then user click on the submit button in salesrep documents section
  
Scenario: Organizational user able to Upload the Excel file of Existing Folder in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user double click on the existing folder in salesrep documents section
  And user click on the upload tab in salesrep documents section
  When user upload the Excel file in salesrep documents section
  Then user click on the submit button in salesrep documents section
  
Scenario: Organizational user able to Upload the PPT file of Existing Folder in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user double click on the existing folder in salesrep documents section
  And user click on the upload tab in salesrep documents section
  When user upload the PPT file in salesrep documents section
  Then user click on the submit button in salesrep documents section
  
Scenario: Organizational user able to Upload the HTML file of Existing Folder in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user double click on the existing folder in salesrep documents section
  And user click on the upload tab in salesrep documents section
  When user upload the HTML file in salesrep documents section
  Then user click on the submit button in salesrep documents section
  
Scenario: Organizational user able to Upload the Txt file of Existing Folder in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user double click on the existing folder in salesrep documents section
  And user click on the upload tab in salesrep documents section
  When user upload the Txt file in salesrep documents section
  Then user click on the submit button in salesrep documents section
  
Scenario: Organizational user able to Upload the Audio file of Existing Folder in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user double click on the existing folder in salesrep documents section
  And user click on the upload tab in salesrep documents section
  When user upload the Audio file in salesrep documents section
  Then user click on the submit button in salesrep documents section
  
Scenario: Organizational user able to Upload the Video file of Existing Folder in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user double click on the existing folder in salesrep documents section
  And user click on the upload tab in salesrep documents section
  When user upload the Video file in salesrep documents section
  Then user click on the submit button in salesrep documents section
  
Scenario: Organizational user able to Upload the PNG image file of Existing Folder in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user double click on the existing folder in salesrep documents section
  And user click on the upload tab in salesrep documents section
  When user upload the PNG image file in salesrep documents section
  Then user click on the submit button in salesrep documents section
  
Scenario: Organizational user able to Upload the GIF image file of Existing Folder in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user double click on the existing folder in salesrep documents section
  And user click on the upload tab in salesrep documents section
  When user upload the GIF image file in salesrep documents section
  Then user click on the submit button in salesrep documents section
  
Scenario: Organizational user able to Upload the SVG image file of Existing Folder in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user double click on the existing folder in salesrep documents section
  And user click on the upload tab in salesrep documents section
  When user upload the SVG image file in salesrep documents section
  Then user click on the submit button in salesrep documents section
  
Scenario: Organizational user able to Upload the JPEG image file of Existing Folder in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user double click on the existing folder in salesrep documents section
  And user click on the upload tab in salesrep documents section
  When user upload the JPEG image file in salesrep documents section
  Then user click on the submit button in salesrep documents section
  
Scenario: Organizational user able to Upload the TIFF image file of Existing Folder in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user double click on the existing folder in salesrep documents section
  And user click on the upload tab in salesrep documents section
  When user upload the TIFF image file in salesrep documents section
  Then user click on the submit button in salesrep documents section
  
Scenario: Organizational user able to Upload the JFIF image file of Existing Folder in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user double click on the existing folder in salesrep documents section
  And user click on the upload tab in salesrep documents section
  When user upload the JFIF image file in salesrep documents section
  Then user click on the submit button in salesrep documents section
  
Scenario: Organizational user able to peform the Existing File Edit functionality in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user double click on the existing folder in salesrep documents section
  And user click on the three dot button of existing file in salesrep documents section
  When user click on the edit button of existing file in salesrep documents section
  Then user change the existing file name in edit file name pop-up window
  And user click on the submit button in edit file pop-up window
  
Scenario: Organizational user able to peform the Existing File Delete functionality in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user double click on the existing folder in salesrep documents section
  And user click on the three dot button of existing file in salesrep documents section
  When user click on the delete button of existing file in salesrep documents section
  
Scenario: Organizational user able to peform the Existing File Download functionality in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Buckets tab in sidebar in Sales Reps module page
  Then user double click on the existing folder in salesrep documents section
  And user click on the three dot button of existing file in salesrep documents section
  When user click on the download button of existing file in salesrep documents section
  
  
  #-------------------------- Sales Rep Visit Section ----------------------------------------------
  
  
Scenario: Organizational user able to click on Sales Rep Visit tab in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  
Scenario: Organizational user able to perform the Quick Text functionality in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the quick text tab in sales rep visits section
  And user select the user by index in quick text pop-up window
  When user enter the phone number in quick text pop-up window
  Then user select the template by index in quick text pop-up window
  And user enter the body in quick text pop-up window
  When user click on the send button in quick text pop-up window
  
Scenario: Organizational user able to perform the Quick Text functionality without entering Phone Number in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the quick text tab in sales rep visits section
  And user select the user by index in quick text pop-up window
  Then user select the template by index in quick text pop-up window
  And user enter the body in quick text pop-up window
  When user click on the send button in quick text pop-up window
  
Scenario: Organizational user able to perform the Quick Text functionality without Selecting user in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the quick text tab in sales rep visits section
  And user select the template by index in quick text pop-up window
  Then user enter the body in quick text pop-up window
  When user click on the send button in quick text pop-up window
  
Scenario: Organizational user able to perform the Quick Text functionality without selecting Template in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the quick text tab in sales rep visits section
  And user select the user by index in quick text pop-up window
  When user enter the phone number in quick text pop-up window
  And user enter the body in quick text pop-up window
  When user click on the send button in quick text pop-up window
  
Scenario: Organizational user able to perform the Quick Text functionality without entering Body content in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the quick text tab in sales rep visits section
  And user select the user by index in quick text pop-up window
  When user enter the phone number in quick text pop-up window
  Then user select the template by index in quick text pop-up window
  When user click on the send button in quick text pop-up window
  
Scenario: Organizational user able to perform the Quick Text functionality without filled any details in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the quick text tab in sales rep visits section
  When user click on the send button in quick text pop-up window
  
Scenario: Organizational user able to perform the Send VCard functionality in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the send vcard tab in sales rep visits section
  And user enter the phone number in send vcard pop-up window
  When user enter the body in send vcard pop-up window
  Then user click on the send button in send vcard pop-up window
  
Scenario: Organizational user able to perform the Send VCard functionality with entering invalid Phone Number in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the send vcard tab in sales rep visits section
  And user enter the invalid phone number in send vcard pop-up window
  When user enter the body in send vcard pop-up window
  Then user click on the send button in send vcard pop-up window
  
Scenario: Organizational user able to perform the Send VCard functionality without entering Phone Number in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the send vcard tab in sales rep visits section
  When user enter the body in send vcard pop-up window
  Then user click on the send button in send vcard pop-up window
  
Scenario: Organizational user able to perform the Send VCard functionality without entering Body in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the send vcard tab in sales rep visits section
  And user enter the phone number in send vcard pop-up window
  Then user click on the send button in send vcard pop-up window
  
Scenario: Organizational user able to perform the Send VCard functionality without entering any details in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the send vcard tab in sales rep visits section
  When user click on the send button in send vcard pop-up window
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality without Adding Meeting Time in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality without Selecting Provider in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality without entering Provider Last Name in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality without entering Provider First Name in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality with entering Invalid NPI Number in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the invalid NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality without entering NPI Number in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality with entering Invalid Provider EmailID in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the Invalid provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality without entering Provider EmailID in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality with entering Invalid Provider Zone in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the Invalid provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality without entering Provider Zone in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality without entering Provider Executive First Name in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality without entering Provider Executive Last Name in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality without entering Street Address in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality without entering City Address in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality without entering State Address in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality with entering Invalid ZipCode Address in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the invalid zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality without entering ZipCode Address in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality with entering Invalid Contact Number in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the invalid contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality without entering Contact Number in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality without selecting Provider Availability in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality without Uploading the Cards Image in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  And user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality with Uploading Card front Image as PDF Files in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image as PDF file in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality with Uploading Card front Image as PDF Files in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image as PDF file in sales rep visits section
  And user upload the card back image in as PDF file sales rep visits section
  When user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality without entering Notes in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality without entering Questions Answer in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the New Sales Rep Visit functionality without entering Any details in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Organizational user able to perform the Filter functionality in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the filter tab in sales rep visits section
  And user enter the provider name in filter
  When user enter the SalesRepUserPin in filter
  Then user enter the zone in filter
  And user select the from date in filter
  When user select the to date in filter
  Then user enter the provider executive name in filter
  And user enter the city in filter
  When user enter the state in filter
  Then user enter the zip code in filter
  And user enter the meeting location code in filter
  When user click on the card attached checkbox in filter
  Then user click on the notes checkbox in filter
  And user click on the having flash provider checkbox in filter
  When user click on the search button in filter
  
Scenario: Sales Rep user able to perform the New Sales Rep Visit functionality in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the sales user emailid
  And user enter the sales user password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  Then user enter the first question answer in sales rep visits section
  And user enter the second question answer in sales rep visits section
  When user enter the third question answer in sales rep visits section
  Then user enter the fourth question answer in sales rep visits section
  And user enter the fifth question answer in sales rep visits section
  When user enter the sixth question answer in sales rep visits section
  Then user enter the seventh question answer in sales rep visits section
  And user enter the eighth question answer in sales rep visits section
  When user enter the ninth question answer in sales rep visits section
  Then user enter the tenth question answer in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Sales Rep user able to perform the New Sales Rep Visit functionality without entering Questions Answer in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the sales user emailid
  And user enter the sales user password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user select the meeting time in sales rep visits section
  When user select the provider by index in sales rep visits section
  Then user select the provider executive by index in sales rep visits section
  And user select the provider address by index in sales rep visits section
  When user enter the provider last name in sales rep visits section
  Then user enter the provider first name in sales rep visits section
  And user enter the NPI Number in sales rep visits section
  When user enter the provider emailid in sales rep visits section
  Then user enter the provider zone in sales rep visits section
  And user enter the provider executive first name in sales rep visits section
  When user enter the provider executive last name in sales rep visits section
  Then user enter the street address details in sales rep visits section
  And user enter the city address details in sales rep visits section
  When user enter the state address details in sales rep visits section
  Then user enter the zipcode address details in sales rep visits section
  And user enter the contact number 1 address details in sales rep visits section
  When user enter the contact number 2 address details in sales rep visits section
  Then user enter the fax address details in sales rep visits section
  And user enter the front desk name address details in sales rep visits section
  When user select the provider availability for all days in sales rep visits section
  Then user upload the card front image in sales rep visits section
  And user upload the card back image in sales rep visits section
  When user enter the notes in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Sales Rep user able to perform the New Sales Rep Visit functionality without entering Any details in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the sales user emailid
  And user enter the sales user password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the new sales rep visits tab in sales rep visits section
  And user click on the submit button in sales rep visits section
  
Scenario: Sales Rep user able to perform the Filter functionality in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the sales user emailid
  And user enter the sales user password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the filter tab in sales rep visits section
  And user enter the provider name in filter
  When user enter the SalesRepUserPin in filter
  Then user enter the zone in filter
  And user select the from date in filter
  When user select the to date in filter
  Then user enter the provider executive name in filter
  And user enter the city in filter
  When user enter the state in filter
  Then user enter the zip code in filter
  And user enter the meeting location code in filter
  When user click on the card attached checkbox in filter
  Then user click on the notes checkbox in filter
  And user click on the having flash provider checkbox in filter
  When user click on the search button in filter
  
Scenario: Sales Rep user able to perform the Filter functionality Search with only Provider Name in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the sales user emailid
  And user enter the sales user password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the filter tab in sales rep visits section
  And user enter the provider name in filter
  Then user click on the search button in filter
  
Scenario: Sales Rep user able to perform the Filter functionality Search with only Sales Rep User Pin in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the sales user emailid
  And user enter the sales user password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the filter tab in sales rep visits section
  When user enter the SalesRepUserPin in filter
  Then user click on the search button in filter
  
Scenario: Sales Rep user able to perform the Filter functionality Search with only Zone in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the sales user emailid
  And user enter the sales user password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the filter tab in sales rep visits section
  And user enter the zone in filter
  Then user click on the search button in filter
  
Scenario: Sales Rep user able to perform the Filter functionality Search with only From Date in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the sales user emailid
  And user enter the sales user password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the filter tab in sales rep visits section
  And user select the from date in filter
  Then user click on the search button in filter
  
Scenario: Sales Rep user able to perform the Filter functionality Search with only To Date in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the sales user emailid
  And user enter the sales user password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the filter tab in sales rep visits section
  When user select the to date in filter
  Then user click on the search button in filter
  
Scenario: Sales Rep user able to perform the Filter functionality Search with only Provider Executive Name in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the sales user emailid
  And user enter the sales user password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the filter tab in sales rep visits section
  And user enter the provider executive name in filter
  When user click on the search button in filter
  
Scenario: Sales Rep user able to perform the Filter functionality Search with only City in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the sales user emailid
  And user enter the sales user password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the filter tab in sales rep visits section
  And user enter the city in filter
  When user click on the search button in filter
  
Scenario: Sales Rep user able to perform the Filter functionality Search with only State in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the sales user emailid
  And user enter the sales user password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the filter tab in sales rep visits section
  When user enter the state in filter
  Then user click on the search button in filter
  
Scenario: Sales Rep user able to perform the Filter functionality Search with only Zip Code in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the sales user emailid
  And user enter the sales user password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the filter tab in sales rep visits section
  And user enter the zip code in filter
  When user click on the search button in filter
 
Scenario: Sales Rep user able to perform the Filter functionality Search with only Meeting Location in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the sales user emailid
  And user enter the sales user password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the filter tab in sales rep visits section
  And user enter the meeting location code in filter
  When user click on the search button in filter
  
Scenario: Sales Rep user able to perform the Filter functionality Search with only Card Attached in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the sales user emailid
  And user enter the sales user password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the filter tab in sales rep visits section
  When user click on the card attached checkbox in filter
  Then user click on the search button in filter
  
Scenario: Sales Rep user able to perform the Filter functionality Search with only Notes in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the sales user emailid
  And user enter the sales user password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the filter tab in sales rep visits section
  And user click on the notes checkbox in filter
  When user click on the search button in filter
  
Scenario: Sales Rep user able to perform the Filter functionality Search with only Having Flash Provider in Sales Rep Visits section in Sales Reps Module page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the sales user emailid
  And user enter the sales user password
  When user click on the go button
  Then user click on the Sales Reps module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the filter tab in sales rep visits section
  And user click on the having flash provider checkbox in filter
  When user click on the search button in filter
  
  
  
  
  
#---------------------- Sales Reps Module (Profile Permission) --------------------------


 
Scenario: User able to click on the Setup Module tab 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  
Scenario: Verify that the user cannot access the Add Folder Functionality in Buckets Section, when permission is not granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user uncheck the add folder checkbox button in bucket section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Buckets tab in sidebar in Sales Reps module page
  Then user click on the new folder tab in salesrep documents section
  And user enter the folder name in new folder pop-up window
  When user select the folder type as Public in new folder pop-up window
  Then user click on the submit button in new folder pop-up window
  
Scenario: Verify that the user can access the Add Folder Functionality in Buckets Section, when permission is granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user check the add folder checkbox button in bucket section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Buckets tab in sidebar in Sales Reps module page
  Then user click on the new folder tab in salesrep documents section
  And user enter the folder name in new folder pop-up window
  When user select the folder type as Public in new folder pop-up window
  Then user click on the submit button in new folder pop-up window
  
Scenario: Verify that the user cannot access the Edit Folder Functionality in Buckets Section, when permission is not granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user uncheck the edit folder checkbox button in bucket section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Buckets tab in sidebar in Sales Reps module page
  Then user click on the three dot button of existing folder in salesrep documents section
  And user click on the edit button of existing folder in salesrep documents section
  When user change the folder name in edit folder pop-up window
  Then user change the folder type in edit folder pop-up window
  And user click on the submit button in new folder pop-up window
  
Scenario: Verify that the user can access the Edit Folder Functionality in Buckets Section, when permission is granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user check the edit folder checkbox button in bucket section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Buckets tab in sidebar in Sales Reps module page
  Then user click on the three dot button of existing folder in salesrep documents section
  And user click on the edit button of existing folder in salesrep documents section
  When user change the folder name in edit folder pop-up window
  Then user change the folder type in edit folder pop-up window
  And user click on the submit button in new folder pop-up window
  
Scenario: Verify that the user cannot access the Delete Folder Functionality in Buckets Section, when permission is not granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user uncheck the delete folder checkbox button in bucket section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Buckets tab in sidebar in Sales Reps module page
  When user click on the three dot button of existing folder in salesrep documents section
  Then user click on the delete button of existing folder in salesrep documents section
  
Scenario: Verify that the user can access the Delete Folder Functionality in Buckets Section, when permission is granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user check the delete folder checkbox button in bucket section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Buckets tab in sidebar in Sales Reps module page
  When user click on the three dot button of existing folder in salesrep documents section
  Then user click on the delete button of existing folder in salesrep documents section
  
Scenario: Verify that the user cannot access the Add File Functionality in Buckets Section, when permission is not granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user uncheck the add file checkbox button in bucket section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Buckets tab in sidebar in Sales Reps module page
  Then user double click on the existing folder in salesrep documents section
  And user click on the upload tab in salesrep documents section
  When user upload the PDF file in salesrep documents section
  Then user click on the submit button in salesrep documents section
  
Scenario: Verify that the user can access the Add File Functionality in Buckets Section, when permission is granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user check the add file checkbox button in bucket section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Buckets tab in sidebar in Sales Reps module page
  Then user double click on the existing folder in salesrep documents section
  And user click on the upload tab in salesrep documents section
  When user upload the PDF file in salesrep documents section
  Then user click on the submit button in salesrep documents section
  
Scenario: Verify that the user cannot access the Edit File Functionality in Buckets Section, when permission is not granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user uncheck the edit file checkbox button in bucket section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Buckets tab in sidebar in Sales Reps module page
  Then user double click on the existing folder in salesrep documents section
  And user click on the three dot button of existing file in salesrep documents section
  When user click on the edit button of existing file in salesrep documents section
  Then user change the existing file name in edit file name pop-up window
  And user click on the submit button in edit file pop-up window
  
Scenario: Verify that the user can access the Edit File Functionality in Buckets Section, when permission is granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user check the edit file checkbox button in bucket section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Buckets tab in sidebar in Sales Reps module page
  Then user double click on the existing folder in salesrep documents section
  And user click on the three dot button of existing file in salesrep documents section
  When user click on the edit button of existing file in salesrep documents section
  Then user change the existing file name in edit file name pop-up window
  And user click on the submit button in edit file pop-up window
  
Scenario: Verify that the user cannot access the Delete File Functionality in Buckets Section, when permission is not granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user uncheck the delete file checkbox button in bucket section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Buckets tab in sidebar in Sales Reps module page
  When user double click on the existing folder in salesrep documents section
  Then user click on the three dot button of existing file in salesrep documents section
  And user click on the delete button of existing file in salesrep documents section
  
Scenario: Verify that the user can access the Delete File Functionality in Buckets Section, when permission is granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user check the delete file checkbox button in bucket section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Buckets tab in sidebar in Sales Reps module page
  When user double click on the existing folder in salesrep documents section
  Then user click on the three dot button of existing file in salesrep documents section
  And user click on the delete button of existing file in salesrep documents section
  
Scenario: Verify that the user cannot access the Download File Functionality in Buckets Section, when permission is not granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user uncheck the download file checkbox button in bucket section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Buckets tab in sidebar in Sales Reps module page
  When user double click on the existing folder in salesrep documents section
  Then user click on the three dot button of existing file in salesrep documents section
  And user click on the download button of existing file in salesrep documents section
  
Scenario: Verify that the user can access the Download File Functionality in Buckets Section, when permission is granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user check the download file checkbox button in bucket section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Buckets tab in sidebar in Sales Reps module page
  When user double click on the existing folder in salesrep documents section
  Then user click on the three dot button of existing file in salesrep documents section
  And user click on the download button of existing file in salesrep documents section
  
Scenario: Verify that the user cannot access the Folder Permission (Zone Permission) Functionality in Buckets Section, when permission is not granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user uncheck the folder permission checkbox button in bucket section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Buckets tab in sidebar in Sales Reps module page
  Then user click on the three dot button of existing folder in salesrep documents section
  And user click on the permission button of existing folder in salesrep documents section
  When user click on the first zone checkbox button in permission pop-up window
  Then user click on the submit button in permission pop-up window in salesrep documents section
  
Scenario: Verify that the user can access the Folder Permission (Zone Permission) Functionality in Buckets Section, when permission is granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user check the folder permission checkbox button in bucket section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Buckets tab in sidebar in Sales Reps module page
  Then user click on the three dot button of existing folder in salesrep documents section
  And user click on the permission button of existing folder in salesrep documents section
  When user click on the first zone checkbox button in permission pop-up window
  Then user click on the submit button in permission pop-up window in salesrep documents section
  
Scenario: Verify that the user cannot access the Folder Permission (User Permission) Functionality in Buckets Section, when permission is not granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user uncheck the folder permission checkbox button in bucket section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Buckets tab in sidebar in Sales Reps module page
  Then user click on the three dot button of existing folder in salesrep documents section
  And user click on the user permission button of existing folder in salesrep documents section
  When user click on the first user checkbox button in permission pop-up window
  Then user click on the submit button in user permission pop-up window in salesrep documents section
  
Scenario: Verify that the user can access the Folder Permission (User Permission) Functionality in Buckets Section, when permission is granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user check the folder permission checkbox button in bucket section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Buckets tab in sidebar in Sales Reps module page
  Then user click on the three dot button of existing folder in salesrep documents section
  And user click on the user permission button of existing folder in salesrep documents section
  When user click on the first user checkbox button in permission pop-up window
  Then user click on the submit button in user permission pop-up window in salesrep documents section
  
Scenario: Verify that the user cannot access the Bucket Section Functionality, when permission is not granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user uncheck the bucket section checkbox of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Buckets tab in sidebar in Sales Reps module page
  
Scenario: Verify that the user can access the Bucket Section Functionality, when permission is granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user check the bucket section checkbox of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Buckets tab in sidebar in Sales Reps module page
  
Scenario: Verify that the user cannot access the Sales Rep Visits Section Functionality, when permission is not granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user uncheck the sales rep visits section checkbox of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  
Scenario: Verify that the user can access the Sales Rep Visits Section Functionality, when permission is granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user check the sales rep visits section checkbox of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  
Scenario: Verify that the user cannot access the Add Functionality in Sales Rep Questions Section, when permission is not granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user uncheck the Add checkbox button in sales rep questions section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Questions tab in sidebar in Sales Reps module page
  Then user click on the add new sales rep question button in Sales Rep Questions section
  And user enter the sales rep question in Sales Rep Questions section
  When user click on the calculative checkbox in Sales Rep Questions section
  Then user click on the mandatory checkbox in Sales Rep Questions section
  And user click on the submit button in Sales Rep Questions section
  
Scenario: Verify that the user can access the Add Functionality in Sales Rep Questions Section, when permission is granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user check the Add checkbox button in sales rep questions section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Questions tab in sidebar in Sales Reps module page
  Then user click on the add new sales rep question button in Sales Rep Questions section
  And user enter the sales rep question in Sales Rep Questions section
  When user click on the calculative checkbox in Sales Rep Questions section
  Then user click on the mandatory checkbox in Sales Rep Questions section
  And user click on the submit button in Sales Rep Questions section
  
Scenario: Verify that the user cannot access the Edit Functionality in Sales Rep Questions Section, when permission is not granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user uncheck the Edit checkbox button in sales rep questions section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Questions tab in sidebar in Sales Reps module page
  Then user click on the three dot button of existing sales rep question in sales rep questions section
  And user click on the edit button of existing sales rep question in sales rep questions section
  When user change the sales rep question in sale rep question section
  Then user click on the calculative checkbox in Sales Rep Questions section
  And user click on the mandatory checkbox in Sales Rep Questions section
  Then user click on the submit button in Sales Rep Questions section
  
Scenario: Verify that the user can access the Edit Functionality in Sales Rep Questions Section, when permission is granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user check the Edit checkbox button in sales rep questions section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Questions tab in sidebar in Sales Reps module page
  Then user click on the three dot button of existing sales rep question in sales rep questions section
  And user click on the edit button of existing sales rep question in sales rep questions section
  When user change the sales rep question in sale rep question section
  Then user click on the calculative checkbox in Sales Rep Questions section
  And user click on the mandatory checkbox in Sales Rep Questions section
  Then user click on the submit button in Sales Rep Questions section
  
Scenario: Verify that the user cannot access the Delete Functionality in Sales Rep Questions Section, when permission is not granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user uncheck the Delete checkbox button in sales rep questions section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Questions tab in sidebar in Sales Reps module page
  Then user click on the three dot button of existing sales rep question in sales rep questions section
  And user click on the delete button of existing sales rep question in sales rep questions section
  
Scenario: Verify that the user can access the Delete Functionality in Sales Rep Questions Section, when permission is granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user check the Delete checkbox button in sales rep questions section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Questions tab in sidebar in Sales Reps module page
  Then user click on the three dot button of existing sales rep question in sales rep questions section
  And user click on the delete button of existing sales rep question in sales rep questions section
  
Scenario: Verify that the user cannot access the Sales Rep Questions Section Functionality, when permission is not granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user uncheck the sales rep questions section checkbox of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Sales Rep Questions tab in sidebar in Sales Reps module page
  
Scenario: Verify that the user can access the Sales Rep Questions Section Functionality, when permission is granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user check the sales rep questions section checkbox of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  And user click on the Sales Rep Questions tab in sidebar in Sales Reps module page
  
Scenario: Verify that the user cannot access the Send Text Functionality in Text (Sales Rep Visits) Section, when permission is not granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user uncheck the Send checkbox button in sales rep visits section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the quick text tab in sales rep visits section
  And user select the user by index in quick text pop-up window
  When user enter the phone number in quick text pop-up window
  Then user select the template by index in quick text pop-up window
  And user enter the body in quick text pop-up window
  When user click on the send button in quick text pop-up window
  
Scenario: Verify that the user can access the Send Text Functionality in Text (Sales Rep Visits) Section, when permission is granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user check the Send checkbox button in sales rep visits section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the quick text tab in sales rep visits section
  And user select the user by index in quick text pop-up window
  When user enter the phone number in quick text pop-up window
  Then user select the template by index in quick text pop-up window
  And user enter the body in quick text pop-up window
  When user click on the send button in quick text pop-up window
  
Scenario: Verify that the user cannot access the Sales Rep Visible Number Functionality in Text (Sales Rep Visits) Section, when permission is not granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user uncheck the Sales Rep Visible Number checkbox button in sales rep visits section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the quick text tab in sales rep visits section
  And user select the user by index in quick text pop-up window
  When user enter the phone number in quick text pop-up window
  Then user select the template by index in quick text pop-up window
  And user enter the body in quick text pop-up window
  When user click on the send button in quick text pop-up window
  
Scenario: Verify that the user can access the Sales Rep Visible Number Functionality in Text (Sales Rep Visits) Section, when permission is granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user check the Sales Rep Visible Number checkbox button in sales rep visits section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the quick text tab in sales rep visits section
  And user select the user by index in quick text pop-up window
  When user enter the phone number in quick text pop-up window
  Then user select the template by index in quick text pop-up window
  And user enter the body in quick text pop-up window
  When user click on the send button in quick text pop-up window
  
Scenario: Verify that the user cannot access the Send VCard Functionality in Text (Sales Rep Visits) Section, when permission is not granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user uncheck the Send VCard checkbox button in sales rep visits section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the send vcard tab in sales rep visits section
  And user enter the phone number in send vcard pop-up window
  When user enter the body in send vcard pop-up window
  Then user click on the send button in send vcard pop-up window
  
Scenario: Verify that the user can access the Send VCard Functionality in Text (Sales Rep Visits) Section, when permission is granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user check the Send VCard checkbox button in sales rep visits section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user click on the send vcard tab in sales rep visits section
  And user enter the phone number in send vcard pop-up window
  When user enter the body in send vcard pop-up window
  Then user click on the send button in send vcard pop-up window
  
Scenario: Verify that the user cannot access the Text Functionality in Text (Sales Rep Visits) Section, when permission is not granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user uncheck the Text checkbox button in sales rep visits section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user check the text subsection is display
  
Scenario: Verify that the user cannot access the Text Functionality in Text (Sales Rep Visits) Section, when permission is not granted 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Setup module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the profiles tab in sidebar in Setup module page
  Then user click on the filter tab in profiles page
  And user enter the profile name in profiles page
  Then user click on the search button in profiles page
  When user click on three dot button in existing profile name
  Then user click on the edit button of existing profile
  And user click on the sales reps module tab in profile details
  When user check the Text checkbox button in sales rep visits section of sales reps module
  Then user click on the submit button in profile details page
  And user click on the pharm crm logo
  When user click on the Sales Reps module tab in home page
  Then user click on the sidebar collpase button in module dashboard page
  When user click on the Sales Rep Visit tab in sidebar in Sales Reps module page
  Then user check the text subsection is display                