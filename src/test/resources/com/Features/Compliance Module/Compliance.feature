@ComplianceModuleFeature

Feature: Compliance Module Functionality 

Scenario: User able to login with user type as Organization in login page  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  
Scenario: Organizational user able to click on Compliance Module tab 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  
  
  #-------------------------- Documents Section ----------------------------------------------
  
  
Scenario: Organizational user able to click on the Documents tab in Compliance Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  
Scenario: Organizational user able to create a New Folder in Documents Section in the Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  Then user click on the new folder tab in documents section
  And user enter the new folder name in add folder pop-up window
  When user click on the submit button in add folder pop-up window
  
Scenario: Organizational user able to create a New Folder without entering Folder Name in Documents Section in the Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  Then user click on the new folder tab in documents section
  When user click on the submit button in add folder pop-up window
  
Scenario: Organizational user able to perform the Edit functionality of Existing Folder Name in Documents Section in the Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  Then user click on the three dot button of existing folder in documents section
  And user click on the edit button of existing folder in documents section
  When user change the folder name in edit name pop-up window in documents section
  Then user click on the submit button in add folder pop-up window
  
Scenario: Organizational user able to perform the Edit functionality of Existing Folder Name with remove the Folder Name in Documents Section in the Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  Then user click on the three dot button of existing folder in documents section
  And user click on the edit button of existing folder in documents section
  When user remove the existing folder name in edit name pop-up window in documents section
  Then user click on the submit button in add folder pop-up window
  
Scenario: Organizational user able to perform the Delete functionality of Existing Folder in Documents Section in the Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  Then user click on the three dot button of existing folder in documents section
  And user click on the delete button of existing folder in documents section
  
Scenario: Organizational user able to perform the Folder Permission functionality of Existing Folder in Documents Section in the Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  Then user click on the three dot button of existing folder in documents section
  And user click on the permission button of existing folder in documents section
  When user click on the first user checkbox in permission pop-up window
  Then user click on the submit button in permission pop-up window in documents section
  
Scenario: Organizational user able to perform the File Upload functionality of Existing Folder in Documents Section in the Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  Then user double click on the existing folder in documents section
  And user click on the upload button in existing folder section
  When user upload the file as PDF in upload file pop-up window
  Then user click on the submit button in upload file pop-up window
  
Scenario: Organizational user able to perform the File Upload functionality of Existing Folder without upload any file in Documents Section in the Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  Then user double click on the existing folder in documents section
  And user click on the upload button in existing folder section
  Then user click on the submit button in upload file pop-up window
  
Scenario: Organizational user able to perform the File Upload functionality like Docx file in Existing Folder in Documents Section in the Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  Then user double click on the existing folder in documents section
  And user click on the upload button in existing folder section
  When user upload the file as Docx in upload file pop-up window
  Then user click on the submit button in upload file pop-up window
  
Scenario: Organizational user able to perform the File Upload functionality like PPT file in Existing Folder in Documents Section in the Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  Then user double click on the existing folder in documents section
  And user click on the upload button in existing folder section
  When user upload the file as PPT in upload file pop-up window
  Then user click on the submit button in upload file pop-up window
  
Scenario: Organizational user able to perform the File Upload functionality like Excel file in Existing Folder in Documents Section in the Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  Then user double click on the existing folder in documents section
  And user click on the upload button in existing folder section
  When user upload the file as Excel in upload file pop-up window
  Then user click on the submit button in upload file pop-up window
  
Scenario: Organizational user able to perform the File Upload functionality like HTML file in Existing Folder in Documents Section in the Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  Then user double click on the existing folder in documents section
  And user click on the upload button in existing folder section
  When user upload the file as HTML in upload file pop-up window
  Then user click on the submit button in upload file pop-up window
  
Scenario: Organizational user able to perform the File Upload functionality like Txt file in Existing Folder in Documents Section in the Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  Then user double click on the existing folder in documents section
  And user click on the upload button in existing folder section
  When user upload the file as Txt in upload file pop-up window
  Then user click on the submit button in upload file pop-up window
  
Scenario: Organizational user able to perform the File Upload functionality like Image file as PNG in Existing Folder in Documents Section in the Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  Then user double click on the existing folder in documents section
  And user click on the upload button in existing folder section
  When user upload the Image file as PNG in upload file pop-up window
  Then user click on the submit button in upload file pop-up window
  
Scenario: Organizational user able to perform the File Upload functionality like Image file as JPEG in Existing Folder in Documents Section in the Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  Then user double click on the existing folder in documents section
  And user click on the upload button in existing folder section
  When user upload the Image file as JPEG in upload file pop-up window
  Then user click on the submit button in upload file pop-up window
  
Scenario: Organizational user able to perform the File Upload functionality like Image file as GIF in Existing Folder in Documents Section in the Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  Then user double click on the existing folder in documents section
  And user click on the upload button in existing folder section
  When user upload the Image file as GIF in upload file pop-up window
  Then user click on the submit button in upload file pop-up window
  
Scenario: Organizational user able to perform the File Upload functionality like Image file as SVG in Existing Folder in Documents Section in the Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  Then user double click on the existing folder in documents section
  And user click on the upload button in existing folder section
  When user upload the Image file as SVG in upload file pop-up window
  Then user click on the submit button in upload file pop-up window
  
Scenario: Organizational user able to perform the File Upload functionality like Image file as TIFF in Existing Folder in Documents Section in the Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  Then user double click on the existing folder in documents section
  And user click on the upload button in existing folder section
  When user upload the Image file as TIFF in upload file pop-up window
  Then user click on the submit button in upload file pop-up window
  
Scenario: Organizational user able to perform the File Upload functionality like Image file as JFIF in Existing Folder in Documents Section in the Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  Then user double click on the existing folder in documents section
  And user click on the upload button in existing folder section
  When user upload the Image file as JFIF in upload file pop-up window
  Then user click on the submit button in upload file pop-up window
  
Scenario: Organizational user able to perform the File Upload functionality like Audio file in Existing Folder in Documents Section in the Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  Then user double click on the existing folder in documents section
  And user click on the upload button in existing folder section
  When user upload the audio file in upload file pop-up window
  Then user click on the submit button in upload file pop-up window
  
Scenario: Organizational user able to perform the File Upload functionality like Video file in Existing Folder in Documents Section in the Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  Then user double click on the existing folder in documents section
  And user click on the upload button in existing folder section
  When user upload the video file in upload file pop-up window
  Then user click on the submit button in upload file pop-up window
  
Scenario: Organizational user able to perform the Download functionality of Existing File in Documents Section in the Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  Then user double click on the existing folder in documents section
  And user click on the three dot button of existing file in documents section
  When user click on the download button of existing file in documents section
  
Scenario: Organizational user able to perform the Delete functionality of Existing File in Documents Section in the Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Documents tab in sidebar in Compliance module page
  Then user double click on the existing folder in documents section
  And user click on the three dot button of existing file in documents section
  When user click on the delete button of existing file in documents section
  
  
  #-------------------------- License Management Section ----------------------------------------------
  
  
Scenario: Organizational user able to click on the License Management tab in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  
Scenario: Organizational user able to Add New Tenant License in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  And user select the state by index in add tenant license pop-up window
  When user enter the license number in add tenant license pop-up window
  Then user enter the url in add tenant license pop-up window
  And user select the original date picker in add tenant license pop-up window
  When user select the expiry date picker after one month in add tenant license pop-up window
  Then user select the professional license type by index in add tenant license pop-up window
  And user select the status by index in add tenant license pop-up window
  When user upload the file as PDF in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License with uploading file as Docx in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  And user select the state by index in add tenant license pop-up window
  When user enter the license number in add tenant license pop-up window
  Then user enter the url in add tenant license pop-up window
  And user select the original date picker in add tenant license pop-up window
  When user select the expiry date picker after one month in add tenant license pop-up window
  Then user select the professional license type by index in add tenant license pop-up window
  And user select the status by index in add tenant license pop-up window
  When user upload the file as Docx in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License with uploading file as PPT in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  And user select the state by index in add tenant license pop-up window
  When user enter the license number in add tenant license pop-up window
  Then user enter the url in add tenant license pop-up window
  And user select the original date picker in add tenant license pop-up window
  When user select the expiry date picker after one month in add tenant license pop-up window
  Then user select the professional license type by index in add tenant license pop-up window
  And user select the status by index in add tenant license pop-up window
  When user upload the file as PPT in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License with uploading file as Excel in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  And user select the state by index in add tenant license pop-up window
  When user enter the license number in add tenant license pop-up window
  Then user enter the url in add tenant license pop-up window
  And user select the original date picker in add tenant license pop-up window
  When user select the expiry date picker after one month in add tenant license pop-up window
  Then user select the professional license type by index in add tenant license pop-up window
  And user select the status by index in add tenant license pop-up window
  When user upload the file as Excel in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License with uploading file as HTML in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  And user select the state by index in add tenant license pop-up window
  When user enter the license number in add tenant license pop-up window
  Then user enter the url in add tenant license pop-up window
  And user select the original date picker in add tenant license pop-up window
  When user select the expiry date picker after one month in add tenant license pop-up window
  Then user select the professional license type by index in add tenant license pop-up window
  And user select the status by index in add tenant license pop-up window
  When user upload the file as HTML in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License with uploading file as Txt in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  And user select the state by index in add tenant license pop-up window
  When user enter the license number in add tenant license pop-up window
  Then user enter the url in add tenant license pop-up window
  And user select the original date picker in add tenant license pop-up window
  When user select the expiry date picker after one month in add tenant license pop-up window
  Then user select the professional license type by index in add tenant license pop-up window
  And user select the status by index in add tenant license pop-up window
  When user upload the file as Txt in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License with uploading file as PNG image format in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  And user select the state by index in add tenant license pop-up window
  When user enter the license number in add tenant license pop-up window
  Then user enter the url in add tenant license pop-up window
  And user select the original date picker in add tenant license pop-up window
  When user select the expiry date picker after one month in add tenant license pop-up window
  Then user select the professional license type by index in add tenant license pop-up window
  And user select the status by index in add tenant license pop-up window
  When user upload the file as PNG image format in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License with uploading file as JPEG image format in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  And user select the state by index in add tenant license pop-up window
  When user enter the license number in add tenant license pop-up window
  Then user enter the url in add tenant license pop-up window
  And user select the original date picker in add tenant license pop-up window
  When user select the expiry date picker after one month in add tenant license pop-up window
  Then user select the professional license type by index in add tenant license pop-up window
  And user select the status by index in add tenant license pop-up window
  When user upload the file as JPEG image format in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License with uploading file as GIF image format in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  And user select the state by index in add tenant license pop-up window
  When user enter the license number in add tenant license pop-up window
  Then user enter the url in add tenant license pop-up window
  And user select the original date picker in add tenant license pop-up window
  When user select the expiry date picker after one month in add tenant license pop-up window
  Then user select the professional license type by index in add tenant license pop-up window
  And user select the status by index in add tenant license pop-up window
  When user upload the file as GIF image format in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License with uploading file as SVG image format in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  And user select the state by index in add tenant license pop-up window
  When user enter the license number in add tenant license pop-up window
  Then user enter the url in add tenant license pop-up window
  And user select the original date picker in add tenant license pop-up window
  When user select the expiry date picker after one month in add tenant license pop-up window
  Then user select the professional license type by index in add tenant license pop-up window
  And user select the status by index in add tenant license pop-up window
  When user upload the file as SVG image format in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License with uploading file as TIFF image format in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  And user select the state by index in add tenant license pop-up window
  When user enter the license number in add tenant license pop-up window
  Then user enter the url in add tenant license pop-up window
  And user select the original date picker in add tenant license pop-up window
  When user select the expiry date picker after one month in add tenant license pop-up window
  Then user select the professional license type by index in add tenant license pop-up window
  And user select the status by index in add tenant license pop-up window
  When user upload the file as TIFF image format in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License with uploading file as JFIF image format in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  And user select the state by index in add tenant license pop-up window
  When user enter the license number in add tenant license pop-up window
  Then user enter the url in add tenant license pop-up window
  And user select the original date picker in add tenant license pop-up window
  When user select the expiry date picker after one month in add tenant license pop-up window
  Then user select the professional license type by index in add tenant license pop-up window
  And user select the status by index in add tenant license pop-up window
  When user upload the file as JFIF image format in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License with uploading file as Audio format in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  And user select the state by index in add tenant license pop-up window
  When user enter the license number in add tenant license pop-up window
  Then user enter the url in add tenant license pop-up window
  And user select the original date picker in add tenant license pop-up window
  When user select the expiry date picker after one month in add tenant license pop-up window
  Then user select the professional license type by index in add tenant license pop-up window
  And user select the status by index in add tenant license pop-up window
  When user upload the file as Audio format in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License with uploading file as Video format in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  And user select the state by index in add tenant license pop-up window
  When user enter the license number in add tenant license pop-up window
  Then user enter the url in add tenant license pop-up window
  And user select the original date picker in add tenant license pop-up window
  When user select the expiry date picker after one month in add tenant license pop-up window
  Then user select the professional license type by index in add tenant license pop-up window
  And user select the status by index in add tenant license pop-up window
  When user upload the file as Video format in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License without Selecting State in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  When user enter the license number in add tenant license pop-up window
  Then user enter the url in add tenant license pop-up window
  And user select the original date picker in add tenant license pop-up window
  When user select the expiry date picker after one month in add tenant license pop-up window
  Then user select the professional license type by index in add tenant license pop-up window
  And user select the status by index in add tenant license pop-up window
  When user upload the file as PDF in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License without entering License Number in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  And user select the state by index in add tenant license pop-up window
  Then user enter the url in add tenant license pop-up window
  And user select the original date picker in add tenant license pop-up window
  When user select the expiry date picker after one month in add tenant license pop-up window
  Then user select the professional license type by index in add tenant license pop-up window
  And user select the status by index in add tenant license pop-up window
  When user upload the file as PDF in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License in without entering Url License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  And user select the state by index in add tenant license pop-up window
  When user enter the license number in add tenant license pop-up window
  And user select the original date picker in add tenant license pop-up window
  When user select the expiry date picker after one month in add tenant license pop-up window
  Then user select the professional license type by index in add tenant license pop-up window
  And user select the status by index in add tenant license pop-up window
  When user upload the file as PDF in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License without Selecting Original Date in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  And user select the state by index in add tenant license pop-up window
  When user enter the license number in add tenant license pop-up window
  Then user enter the url in add tenant license pop-up window
  When user select the expiry date picker after one month in add tenant license pop-up window
  Then user select the professional license type by index in add tenant license pop-up window
  And user select the status by index in add tenant license pop-up window
  When user upload the file as PDF in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License without Selecting Expiry Date in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  And user select the state by index in add tenant license pop-up window
  When user enter the license number in add tenant license pop-up window
  Then user enter the url in add tenant license pop-up window
  And user select the original date picker in add tenant license pop-up window
  Then user select the professional license type by index in add tenant license pop-up window
  And user select the status by index in add tenant license pop-up window
  When user upload the file as PDF in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License without Selecting Professional License Type in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  And user select the state by index in add tenant license pop-up window
  When user enter the license number in add tenant license pop-up window
  Then user enter the url in add tenant license pop-up window
  And user select the original date picker in add tenant license pop-up window
  When user select the expiry date picker after one month in add tenant license pop-up window
  And user select the status by index in add tenant license pop-up window
  When user upload the file as PDF in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License without Selecting Status in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  And user select the state by index in add tenant license pop-up window
  When user enter the license number in add tenant license pop-up window
  Then user enter the url in add tenant license pop-up window
  And user select the original date picker in add tenant license pop-up window
  When user select the expiry date picker after one month in add tenant license pop-up window
  Then user select the professional license type by index in add tenant license pop-up window
  When user upload the file as PDF in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License without Uploading File in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  And user select the state by index in add tenant license pop-up window
  When user enter the license number in add tenant license pop-up window
  Then user enter the url in add tenant license pop-up window
  And user select the original date picker in add tenant license pop-up window
  When user select the expiry date picker after one month in add tenant license pop-up window
  Then user select the professional license type by index in add tenant license pop-up window
  And user select the status by index in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License without filled any details in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  When user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License With Selecting Original Date as After 1 Months and Expiry date is Selectin today's date in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  And user select the state by index in add tenant license pop-up window
  When user enter the license number in add tenant license pop-up window
  Then user enter the url in add tenant license pop-up window
  And user select the original date as after 1 month in add tenant license pop-up window
  When user select the expiry date as today's date in add tenant license pop-up window
  Then user select the professional license type by index in add tenant license pop-up window
  And user select the status by index in add tenant license pop-up window
  When user upload the file as PDF in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to Add New Tenant License with entering Invalid Url in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the add tenant license button in license management section
  And user select the state by index in add tenant license pop-up window
  When user enter the license number in add tenant license pop-up window
  Then user enter the invalid url in add tenant license pop-up window
  And user select the original date picker in add tenant license pop-up window
  When user select the expiry date picker after one month in add tenant license pop-up window
  Then user select the professional license type by index in add tenant license pop-up window
  And user select the status by index in add tenant license pop-up window
  When user upload the file as PNG image format in add tenant license pop-up window
  Then user click on the submit button in add tenant license pop-up window  
  
Scenario: Organizational user able to perform the Edit Functionality of Existing Tenant License in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the three dot button of existing tenant license in license management section
  And user click on the edit button of existing tenant license
  When user change state in edit tenant license pop-up window
  Then user change the license number in edit tenant license pop-up window
  And user change the url in edit tenant license pop-up window
  When user change the original date in edit tenant license pop-up window
  Then user change the expiry date in edit tenant license pop-up window
  And user change the professional license type in edit tenant license pop-up window
  When user change the status in edit tenant license pop-up window
  Then user change the uploaded file in edit tenant license pop-up window
  And user click on the submit button in add tenant license pop-up window
  
Scenario: Organizational user able to perform the Delete Functionality of Existing Tenant License in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the three dot button of existing tenant license in license management section
  And user click on the delete button of existing tenant license
  
Scenario: Organizational user able to perform the Filter Functionality in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the filter button in license management section
  And user enter the license number in filter
  When user select the original from date in filter
  Then user select the original to date in filter
  And user select the state in filter
  When user select the expiry from date in filter
  Then user select the expiry to date in filter
  And user select the last updated from date in filter
  When user select the last updated to date in filter
  Then user select the professional license type in filter
  And user select the license category in filter
  When user select the license status in filter
  Then user click on the search button in filter in license management
  
Scenario: Organizational user able to perform the Filter Functionality with entering only License Number in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the filter button in license management section
  And user enter the license number in filter
  Then user click on the search button in filter in license management
  
Scenario: Organizational user able to perform the Filter Functionality with only Selecting Original From Date in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the filter button in license management section
  When user select the original from date in filter
  Then user click on the search button in filter in license management
  
Scenario: Organizational user able to perform the Filter Functionality with only Selecting Original To Date in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the filter button in license management section
  When user select the original to date in filter
  Then user click on the search button in filter in license management
  
Scenario: Organizational user able to perform the Filter Functionality with Selecting only State in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the filter button in license management section
  And user select the state in filter
  Then user click on the search button in filter in license management
  
Scenario: Organizational user able to perform the Filter Functionality with Selecting only Expiry From Date in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the filter button in license management section
  When user select the expiry from date in filter
  Then user click on the search button in filter in license management
  
Scenario: Organizational user able to perform the Filter Functionality with Selecting only Expiry To Date in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the filter button in license management section
  When user select the expiry to date in filter
  Then user click on the search button in filter in license management
  
Scenario: Organizational user able to perform the Filter Functionality with Selecting only Last Updated From Date in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the filter button in license management section
  And user select the last updated from date in filter
  Then user click on the search button in filter in license management
  
Scenario: Organizational user able to perform the Filter Functionality with Selecting only Last Updated To Date in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the filter button in license management section
  And user select the last updated to date in filter
  Then user click on the search button in filter in license management
  
Scenario: Organizational user able to perform the Filter Functionality with Selecting only Professional License Type in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the filter button in license management section
  And user select the professional license type in filter
  Then user click on the search button in filter in license management
  
Scenario: Organizational user able to perform the Filter Functionality with Selecting only License Category in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the filter button in license management section
  And user select the license category in filter
  Then user click on the search button in filter in license management
  
Scenario: Organizational user able to perform the Filter Functionality with Selecting only License Status in License Management Section in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the License Management tab in sidebar in Compliance module page
  Then user click on the filter button in license management section
  When user select the license status in filter
  Then user click on the search button in filter in license management
  
  
  #-------------------------- Partner License Section ----------------------------------------------
  
  
Scenario: Organizational user able to click on the Partner License tab in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Partner License tab in sidebar in Compliance module page
  
Scenario: Organizational user able to click on the View Partner License button in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Partner License tab in sidebar in Compliance module page
  Then user click on the view button in partner license section
  
Scenario: Organizational user able to perform the Filter Functionality in Partner License in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Partner License tab in sidebar in Compliance module page
  Then user click on the filter tab in partner license section
  And user enter the partner name in filter of partner license section
  Then user enter the license number in filter
  When user select the original from date in filter
  Then user select the original to date in filter
  And user select the state in filter
  When user select the expiry from date in filter
  Then user select the expiry to date in filter
  And user select the last updated from date in filter
  When user select the last updated to date in filter
  Then user select the professional license type in filter of partner license section
  And user select the partner type in filter of partner license section
  When user click on the search button in filter in partner license
  
Scenario: Organizational user able to perform the Filter Functionality with entering only Partner Name in Partner License in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Partner License tab in sidebar in Compliance module page
  Then user click on the filter tab in partner license section
  And user enter the partner name in filter of partner license section
  When user click on the search button in filter in partner license
  
Scenario: Organizational user able to perform the Filter Functionality with entering only License Number in Partner License in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Partner License tab in sidebar in Compliance module page
  Then user click on the filter tab in partner license section
  And user enter the license number in filter
  When user click on the search button in filter in partner license
  
Scenario: Organizational user able to perform the Filter Functionality with Selecting only Original From Date in Partner License in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Partner License tab in sidebar in Compliance module page
  Then user click on the filter tab in partner license section
  And user select the original from date in filter
  When user click on the search button in filter in partner license
  
Scenario: Organizational user able to perform the Filter Functionality with Selecting only Original To Date in Partner License in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Partner License tab in sidebar in Compliance module page
  Then user click on the filter tab in partner license section
  And user select the original to date in filter
  When user click on the search button in filter in partner license
  
Scenario: Organizational user able to perform the Filter Functionality with Selecting only State in Partner License in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Partner License tab in sidebar in Compliance module page
  Then user click on the filter tab in partner license section
  And user select the state in filter
  When user click on the search button in filter in partner license

Scenario: Organizational user able to perform the Filter Functionality with Selecting only Expiry From Date in Partner License in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Partner License tab in sidebar in Compliance module page
  Then user click on the filter tab in partner license section
  When user select the expiry from date in filter
  Then user click on the search button in filter in partner license
  
Scenario: Organizational user able to perform the Filter Functionality with Selecting only Expiry To Date in Partner License in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Partner License tab in sidebar in Compliance module page
  Then user click on the filter tab in partner license section
  When user select the expiry to date in filter
  Then user click on the search button in filter in partner license
  
Scenario: Organizational user able to perform the Filter Functionality with Selecting Last Updated From Date in Partner License in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Partner License tab in sidebar in Compliance module page
  Then user click on the filter tab in partner license section
  And user select the last updated from date in filter
  When user click on the search button in filter in partner license
  
Scenario: Organizational user able to perform the Filter Functionality with Selecting Last Updated To Date in Partner License in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Partner License tab in sidebar in Compliance module page
  Then user click on the filter tab in partner license section
  And user select the last updated to date in filter
  When user click on the search button in filter in partner license
  
Scenario: Organizational user able to perform the Filter Functionality with Selecting only Professional License Type in Partner License in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Partner License tab in sidebar in Compliance module page
  Then user click on the filter tab in partner license section
  And user select the professional license type in filter of partner license section
  When user click on the search button in filter in partner license
  
Scenario: Organizational user able to perform the Filter Functionality with Selecting only Partner Type in Partner License in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Partner License tab in sidebar in Compliance module page
  Then user click on the filter tab in partner license section
  And user select the partner type in filter of partner license section
  When user click on the search button in filter in partner license
  
  
  #-------------------------- Compliance Events Section ----------------------------------------------
  
  
Scenario: Organizational user able to click on the Compliance Events tab in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  
Scenario: Organizational user able to create a New Compliance Events with set the Frequency as Due Date in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the new compliance event button in compliance events section
  And user enter the compliance event name in add compliance event page
  When user select the compliance event due date in add compliance event page
  Then user select the compliance event last occurrence date in add compliance event page
  And user select the compliance category in add compliance event page
  When user select the compliance department in add compliance event page
  Then user enter the compliance event notes in add compliance event page
  And user click on the frequency due date radio button in add compliance event page
  When user click on the submit button in add compliance event page
  
Scenario: Organizational user able to create a New Compliance Events with set the Frequency as Due Date with entering only Compliance Event Name in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the new compliance event button in compliance events section
  And user enter the compliance event name in add compliance event page
  When user click on the submit button in add compliance event page
  
Scenario: Organizational user able to create a New Compliance Events with set the Frequency as Due Date with Selecting only Compliance Due Date in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the new compliance event button in compliance events section
  And user select the compliance event due date in add compliance event page
  When user click on the submit button in add compliance event page
  
Scenario: Organizational user able to create a New Compliance Events with set the Frequency as Due Date with Selecting only Last Occurrence Date in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the new compliance event button in compliance events section
  And user select the compliance event last occurrence date in add compliance event page
  When user click on the submit button in add compliance event page
  
Scenario: Organizational user able to create a New Compliance Events with set the Frequency as Due Date with Selecting only Compliance Event Category in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the new compliance event button in compliance events section
  And user select the compliance category in add compliance event page
  When user click on the submit button in add compliance event page
  
Scenario: Organizational user able to create a New Compliance Events with set the Frequency as Due Date with Selecting only Compliance Event Department in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the new compliance event button in compliance events section
  And user select the compliance department in add compliance event page
  When user click on the submit button in add compliance event page
  
Scenario: Organizational user able to create a New Compliance Events with set the Frequency as Due Date with entering only Notes in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the new compliance event button in compliance events section
  And user enter the compliance event notes in add compliance event page
  When user click on the submit button in add compliance event page
  
Scenario: Organizational user able to create a New Compliance Events with set the Frequency as Due Date without filled any details in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the new compliance event button in compliance events section
  When user click on the submit button in add compliance event page              
  
Scenario: Organizational user able to create a New Compliance Events with set the Frequency as Every Week (Week days) in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the new compliance event button in compliance events section
  And user enter the compliance event name in add compliance event page
  When user select the compliance event due date in add compliance event page
  Then user select the compliance event last occurrence date in add compliance event page
  And user select the compliance category in add compliance event page
  When user select the compliance department in add compliance event page
  Then user enter the compliance event notes in add compliance event page
  And user click on the frequency every radio button in add compliance event page
  When user click on the week radio button in add compliance event page
  Then user click on the weekdays checkbox button in add compliance event page
  When user click on the submit button in add compliance event page
    
Scenario: Organizational user able to create a New Compliance Events with set the Frequency as Every Week (All days) in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the new compliance event button in compliance events section
  And user enter the compliance event name in add compliance event page
  When user select the compliance event due date in add compliance event page
  Then user select the compliance event last occurrence date in add compliance event page
  And user select the compliance category in add compliance event page
  When user select the compliance department in add compliance event page
  Then user enter the compliance event notes in add compliance event page
  And user click on the frequency every radio button in add compliance event page
  When user click on the week radio button in add compliance event page
  Then user click on the all days checkbox button in add compliance event page
  When user click on the submit button in add compliance event page
  
Scenario: Organizational user able to create a New Compliance Events with set the Frequency as Every Month of days in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the new compliance event button in compliance events section
  And user enter the compliance event name in add compliance event page
  When user select the compliance event due date in add compliance event page
  Then user select the compliance event last occurrence date in add compliance event page
  And user select the compliance category in add compliance event page
  When user select the compliance department in add compliance event page
  Then user enter the compliance event notes in add compliance event page
  And user click on the frequency every radio button in add compliance event page
  When user click on the month radio button in add compliance event page
  Then user select the date of month in add compliance event page
  When user click on the submit button in add compliance event page
  
Scenario: Organizational user able to create a New Compliance Events with set the Frequency as Every Year in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the new compliance event button in compliance events section
  And user enter the compliance event name in add compliance event page
  When user select the compliance event due date in add compliance event page
  Then user select the compliance event last occurrence date in add compliance event page
  And user select the compliance category in add compliance event page
  When user select the compliance department in add compliance event page
  Then user enter the compliance event notes in add compliance event page
  And user click on the frequency every radio button in add compliance event page
  When user click on the year radio button in add compliance event page
  Then user select the month in add compliance event page
  And user select the date of month in add compliance event page
  When user click on the submit button in add compliance event page
  
Scenario: Organizational user able to create a New Compliance Events with set the Frequency as Every Week but without select any days in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the new compliance event button in compliance events section
  And user enter the compliance event name in add compliance event page
  When user select the compliance event due date in add compliance event page
  Then user select the compliance event last occurrence date in add compliance event page
  And user select the compliance category in add compliance event page
  When user select the compliance department in add compliance event page
  Then user enter the compliance event notes in add compliance event page
  And user click on the frequency every radio button in add compliance event page
  When user click on the week radio button in add compliance event page
  Then user click on the submit button in add compliance event page
  
Scenario: Organizational user able to create a New Compliance Events with set the Frequency as Every Month but without select any days in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the new compliance event button in compliance events section
  And user enter the compliance event name in add compliance event page
  When user select the compliance event due date in add compliance event page
  Then user select the compliance event last occurrence date in add compliance event page
  And user select the compliance category in add compliance event page
  When user select the compliance department in add compliance event page
  Then user enter the compliance event notes in add compliance event page
  And user click on the frequency every radio button in add compliance event page
  When user click on the month radio button in add compliance event page
  Then user click on the submit button in add compliance event page
  
Scenario: Organizational user able to create a New Compliance Events with set the Frequency as Every year but without select any months and days in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the new compliance event button in compliance events section
  And user enter the compliance event name in add compliance event page
  When user select the compliance event due date in add compliance event page
  Then user select the compliance event last occurrence date in add compliance event page
  And user select the compliance category in add compliance event page
  When user select the compliance department in add compliance event page
  Then user enter the compliance event notes in add compliance event page
  And user click on the frequency every radio button in add compliance event page
  When user click on the year radio button in add compliance event page
  Then user click on the submit button in add compliance event page
  
Scenario: Organizational user able to create a New Compliance Events with set the Frequency as Every year but without select any days in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the new compliance event button in compliance events section
  And user enter the compliance event name in add compliance event page
  When user select the compliance event due date in add compliance event page
  Then user select the compliance event last occurrence date in add compliance event page
  And user select the compliance category in add compliance event page
  When user select the compliance department in add compliance event page
  Then user enter the compliance event notes in add compliance event page
  And user click on the frequency every radio button in add compliance event page
  When user click on the year radio button in add compliance event page
  Then user select the month in add compliance event page
  And user click on the submit button in add compliance event page
  
Scenario: Organizational user able to create a New Compliance Events with set the Frequency as Every year but without select any months in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the new compliance event button in compliance events section
  And user enter the compliance event name in add compliance event page
  When user select the compliance event due date in add compliance event page
  Then user select the compliance event last occurrence date in add compliance event page
  And user select the compliance category in add compliance event page
  When user select the compliance department in add compliance event page
  Then user enter the compliance event notes in add compliance event page
  And user click on the frequency every radio button in add compliance event page
  When user click on the year radio button in add compliance event page
  Then user select the date of month in add compliance event page
  And user click on the submit button in add compliance event page
  
Scenario: Organizational user able to create a New Compliance Events with set the Frequency as Every year but without select any months without filled any details in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the new compliance event button in compliance events section
  And user click on the frequency every radio button in add compliance event page
  When user click on the year radio button in add compliance event page
  Then user select the date of month in add compliance event page
  And user click on the submit button in add compliance event page    
  
Scenario: Organizational user able to create a New Compliance Events with set the Frequency as Every year but without select any months in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the new compliance event button in compliance events section
  And user enter the compliance event name in add compliance event page
  When user select the compliance event due date in add compliance event page
  Then user select the compliance event last occurrence date in add compliance event page
  And user select the compliance category in add compliance event page
  When user select the compliance department in add compliance event page
  Then user enter the compliance event notes in add compliance event page
  And user click on the frequency every radio button in add compliance event page
  When user click on the year radio button in add compliance event page
  Then user select the date of month in add compliance event page
  And user click on the submit button in add compliance event page  
  
Scenario: Organizational user able to create a New Compliance Events with set the Frequency as Every year but without select any months and without filed any details in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the new compliance event button in compliance events section
  And user click on the frequency every radio button in add compliance event page
  When user click on the year radio button in add compliance event page
  Then user select the date of month in add compliance event page
  And user click on the submit button in add compliance event page
  
Scenario: Organizational user able to click on the View button of Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  
Scenario: Organizational user able to Add New Document in Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the add document button in existing compliance event details page
  When user enter the document title name in add document pop-up window
  Then user upload the PDF file in add document pop-up window
  And user click on the submit button in add document pop-up window
  
Scenario: Organizational user able to Add New Document with Docx file in Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the add document button in existing compliance event details page
  When user enter the document title name in add document pop-up window
  Then user upload the Docx file in add document pop-up window
  And user click on the submit button in add document pop-up window
  
Scenario: Organizational user able to Add New Document with PPT file in Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the add document button in existing compliance event details page
  When user enter the document title name in add document pop-up window
  Then user upload the PPT file in add document pop-up window
  And user click on the submit button in add document pop-up window
  
Scenario: Organizational user able to Add New Document with Excel file in Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the add document button in existing compliance event details page
  When user enter the document title name in add document pop-up window
  Then user upload the Excel file in add document pop-up window
  And user click on the submit button in add document pop-up window
  
Scenario: Organizational user able to Add New Document with HTML file in Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the add document button in existing compliance event details page
  When user enter the document title name in add document pop-up window
  Then user upload the HTML file in add document pop-up window
  And user click on the submit button in add document pop-up window
  
Scenario: Organizational user able to Add New Document with Txt file in Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the add document button in existing compliance event details page
  When user enter the document title name in add document pop-up window
  Then user upload the Txt file in add document pop-up window
  And user click on the submit button in add document pop-up window
  
Scenario: Organizational user able to Add New Document with PNG Image file in Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the add document button in existing compliance event details page
  When user enter the document title name in add document pop-up window
  Then user upload the PNG image file in add document pop-up window
  And user click on the submit button in add document pop-up window
  
Scenario: Organizational user able to Add New Document with JPEG Image file in Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the add document button in existing compliance event details page
  When user enter the document title name in add document pop-up window
  Then user upload the JPEG image file in add document pop-up window
  And user click on the submit button in add document pop-up window
  
Scenario: Organizational user able to Add New Document with GIF Image file in Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the add document button in existing compliance event details page
  When user enter the document title name in add document pop-up window
  Then user upload the GIF image file in add document pop-up window
  And user click on the submit button in add document pop-up window
  
Scenario: Organizational user able to Add New Document with SVG Image file in Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the add document button in existing compliance event details page
  When user enter the document title name in add document pop-up window
  Then user upload the SVG image file in add document pop-up window
  And user click on the submit button in add document pop-up window
  
Scenario: Organizational user able to Add New Document with TIFF Image file in Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the add document button in existing compliance event details page
  When user enter the document title name in add document pop-up window
  Then user upload the TIFF image file in add document pop-up window
  And user click on the submit button in add document pop-up window
  
Scenario: Organizational user able to Add New Document with JFIF Image file in Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the add document button in existing compliance event details page
  When user enter the document title name in add document pop-up window
  Then user upload the JFIF image file in add document pop-up window
  And user click on the submit button in add document pop-up window
  
Scenario: Organizational user able to Add New Document with Audio file in Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the add document button in existing compliance event details page
  When user enter the document title name in add document pop-up window
  Then user upload the Audio file in add document pop-up window
  And user click on the submit button in add document pop-up window
  
Scenario: Organizational user able to Add New Document with Video file in Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the add document button in existing compliance event details page
  When user enter the document title name in add document pop-up window
  Then user upload the Video file in add document pop-up window
  And user click on the submit button in add document pop-up window
  
Scenario: Organizational user able to Add New Document without entering Document Title Name in Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the add document button in existing compliance event details page
  Then user upload the PDF file in add document pop-up window
  And user click on the submit button in add document pop-up window
  
Scenario: Organizational user able to Add New Document without Upload any file in Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the add document button in existing compliance event details page
  When user enter the document title name in add document pop-up window
  And user click on the submit button in add document pop-up window
  
Scenario: Organizational user able to Add New Document without filled any details in Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the add document button in existing compliance event details page
  Then user click on the submit button in add document pop-up window      
  
Scenario: Organizational user able to perform the Edit functionality of Existing document in Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the three dot button in existing document
  When user click on the edit button in existing document
  Then user change the document title name in edit document pop-up window
  And user click on the delete document button in edit document pop-up window
  When user upload the PDF file in edit document pop-up window
  Then user click on the submit button in edit document pop-up window
  
Scenario: Organizational user able to perform the Edit functionality of Existing document with only change the Title Name in Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the three dot button in existing document
  When user click on the edit button in existing document
  Then user change the document title name in edit document pop-up window
  And user click on the submit button in edit document pop-up window
  
Scenario: Organizational user able to perform the Edit functionality of Existing document with change only document in Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the three dot button in existing document
  When user click on the edit button in existing document
  And user click on the delete document button in edit document pop-up window
  When user upload the PDF file in edit document pop-up window
  Then user click on the submit button in edit document pop-up window
  
Scenario: Organizational user able to perform the Edit functionality of Existing document with remove all the filled in Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the three dot button in existing document
  When user click on the edit button in existing document
  Then user remove the document title name in edit document pop-up window
  And user click on the delete document button in edit document pop-up window
  Then user click on the submit button in edit document pop-up window
  
Scenario: Organizational user able to perform the Delete functionality of Existing document in Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the three dot button in existing document
  When user click on the delete button in existing document
  
Scenario: Organizational user able to perform the Download the Existing document in Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the download button in existing document
  
Scenario: Organizational user able to perform the Edit functionality of Compliance Upcoming Meetings Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the upcoming meetings tab in compliance event details page
  When user click on the edit button in upcoming meeting event
  Then user select the meeting status as close in edit event meeting pop-up window
  And user enter the notes in edit event meeting pop-up window
  When user click on the submit button in edit event meeting pop-up window
  
Scenario: Organizational user able to perform the Edit functionality of Compliance Upcoming Meetings Event with Selecting only Status in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the upcoming meetings tab in compliance event details page
  When user click on the edit button in upcoming meeting event
  Then user select the meeting status as close in edit event meeting pop-up window
  When user click on the submit button in edit event meeting pop-up window
  
Scenario: Organizational user able to perform the Edit functionality of Compliance Upcoming Meetings Event with entering Notes only in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the upcoming meetings tab in compliance event details page
  When user click on the edit button in upcoming meeting event
  And user enter the notes in edit event meeting pop-up window
  When user click on the submit button in edit event meeting pop-up window
  
Scenario: Organizational user able to perform the Edit functionality of Compliance Upcoming Meetings Event without filled any details in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the upcoming meetings tab in compliance event details page
  When user click on the edit button in upcoming meeting event
  Then user click on the submit button in edit event meeting pop-up window
  
Scenario: Organizational user able to perform the Edit functionality of Compliance Past Meetings Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the past meetings tab in compliance event details page
  When user click on the edit button in past meeting event
  Then user select the meeting status as close in edit event meeting pop-up window
  And user enter the notes in edit event meeting pop-up window
  Then user upload the PDF document in edit event meeting pop-up window
  When user click on the submit button in edit event meeting pop-up window
  
Scenario: Organizational user able to perform the Download functionality of Uploaded Document in Compliance Past Meetings Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the view button of existing compliance event
  And user click on the past meetings tab in compliance event details page
  When user click on the download button in past meeting event
  
Scenario: Organizational user able to perform the Edit functionality of Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the three dot button of existing compliance event
  And user click on the edit button of existing compliance event
  Then user change the compliance event name in add compliance event page
  When user change the compliance event due date in add compliance event page
  Then user change the compliance event last occurrence date in add compliance event page
  And user change the compliance category in add compliance event page
  When user change the compliance department in add compliance event page
  Then user change the compliance event notes in add compliance event page
  And user click on the frequency due date radio button in add compliance event page
  When user click on the submit button in add compliance event page
  
Scenario: Organizational user able to perform the Edit functionality of Existing Compliance Event with only Event Name in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the three dot button of existing compliance event
  And user click on the edit button of existing compliance event
  Then user change the compliance event name in add compliance event page
  When user click on the submit button in add compliance event page
  
Scenario: Organizational user able to perform the Edit functionality of Existing Compliance Event with only Due Date in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the three dot button of existing compliance event
  And user click on the edit button of existing compliance event
  Then user change the compliance event due date in add compliance event page
  When user click on the submit button in add compliance event page
  
Scenario: Organizational user able to perform the Edit functionality of Existing Compliance Event with only Last Occurance Date in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the three dot button of existing compliance event
  And user click on the edit button of existing compliance event
  Then user change the compliance event last occurrence date in add compliance event page
  When user click on the submit button in add compliance event page
  
Scenario: Organizational user able to perform the Edit functionality of Existing Compliance Event with only Compliance Category in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the three dot button of existing compliance event
  And user click on the edit button of existing compliance event
  Then user change the compliance category in add compliance event page
  When user click on the submit button in add compliance event page
  
Scenario: Organizational user able to perform the Edit functionality of Existing Compliance Event with only Compliance Department in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the three dot button of existing compliance event
  And user click on the edit button of existing compliance event
  Then user change the compliance department in add compliance event page
  When user click on the submit button in add compliance event page
  
Scenario: Organizational user able to perform the Edit functionality of Existing Compliance Event with only Compliance Event Notes in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the three dot button of existing compliance event
  And user click on the edit button of existing compliance event
  Then user change the compliance event notes in add compliance event page
  When user click on the submit button in add compliance event page
  
Scenario: Organizational user able to perform the Edit functionality of Existing Compliance Event with remove the Compliance Event Name in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the three dot button of existing compliance event
  And user click on the edit button of existing compliance event
  Then user remove the compliance event name in add compliance event page
  When user click on the submit button in add compliance event page
  
Scenario: Organizational user able to perform the Edit functionality of Existing Compliance Event with Set the Frequency as Every Weekdays in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the three dot button of existing compliance event
  And user click on the edit button of existing compliance event
  Then user change the compliance event name in add compliance event page
  When user change the compliance event due date in add compliance event page
  Then user change the compliance event last occurrence date in add compliance event page
  And user change the compliance category in add compliance event page
  When user change the compliance department in add compliance event page
  Then user change the compliance event notes in add compliance event page
  And user click on the frequency every radio button in add compliance event page
  When user click on the week radio button in add compliance event page
  Then user click on the weekdays checkbox button in add compliance event page
  When user click on the submit button in add compliance event page
  
Scenario: Organizational user able to perform the Edit functionality of Existing Compliance Event with Set the Frequency as Every Months in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the three dot button of existing compliance event
  And user click on the edit button of existing compliance event
  Then user change the compliance event name in add compliance event page
  When user change the compliance event due date in add compliance event page
  Then user change the compliance event last occurrence date in add compliance event page
  And user change the compliance category in add compliance event page
  When user change the compliance department in add compliance event page
  Then user change the compliance event notes in add compliance event page
  And user click on the frequency every radio button in add compliance event page
  When user click on the month radio button in add compliance event page
  Then user select the date of month in add compliance event page
  When user click on the submit button in add compliance event page
  
Scenario: Organizational user able to perform the Edit functionality of Existing Compliance Event with Set the Frequency as Every Year in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the three dot button of existing compliance event
  And user click on the edit button of existing compliance event
  Then user change the compliance event name in add compliance event page
  When user change the compliance event due date in add compliance event page
  Then user change the compliance event last occurrence date in add compliance event page
  And user change the compliance category in add compliance event page
  When user change the compliance department in add compliance event page
  Then user change the compliance event notes in add compliance event page
  And user click on the frequency every radio button in add compliance event page
  When user click on the year radio button in add compliance event page
  Then user select the month in add compliance event page
  And user select the date of month in add compliance event page
  When user click on the submit button in add compliance event page
  
Scenario: Organizational user able to perform the Delete functionality of Existing Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the three dot button of existing compliance event
  And user click on the delete button of existing compliance event
  
Scenario: Organizational user able to perform the Export Excel functionality in Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the export excel button in compliance events section
  
Scenario: Organizational user able to perform the Filter functionality in Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the filter button in compliance events section
  And user enter the event name in filter
  When user select the due from date in filter
  Then user select the due to date in filter
  And user select the last occurrence from date in filter
  When user select the last occurrence to date in filter
  Then user select the compliance category in filter
  And user select the compliance department in filter
  When user click on the search button in filter in compliance events
  
Scenario: Organizational user able to perform the Filter functionality search with only Event Name in Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the filter button in compliance events section
  And user enter the event name in filter
  When user click on the search button in filter in compliance events
  
Scenario: Organizational user able to perform the Filter functionality search with only Due From Date in Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the filter button in compliance events section
  And user select the due from date in filter
  When user click on the search button in filter in compliance events
 
Scenario: Organizational user able to perform the Filter functionality search with only Due To Date in Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the filter button in compliance events section
  And user select the due to date in filter
  When user click on the search button in filter in compliance events
   
Scenario: Organizational user able to perform the Filter functionality search with only Last Occurrence From Date in Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the filter button in compliance events section
  And user select the last occurrence from date in filter
  When user click on the search button in filter in compliance events
  
Scenario: Organizational user able to perform the Filter functionality search with only Last Occurrence To Date in Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the filter button in compliance events section
  And user select the last occurrence to date in filter
  When user click on the search button in filter in compliance events
  
Scenario: Organizational user able to perform the Filter functionality search with only Compliance Category in Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the filter button in compliance events section
  And user select the compliance category in filter
  When user click on the search button in filter in compliance events
  
Scenario: Organizational user able to perform the Filter functionality search with only Compliance Department in Compliance Event in Compliance Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the Compliance module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the Compliance Events tab in sidebar in Compliance module page
  Then user click on the filter button in compliance events section
  And user select the compliance department in filter
  When user click on the search button in filter in compliance events                                                                                                    