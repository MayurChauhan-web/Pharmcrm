@WellnessModuleFeature
Feature: Wellness Module Functionality

Scenario: User able to login with user type as Organization in login page  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  
Scenario: Organizational user able to click on Wellness Module tab 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  
  
  #------------------------------ Patient Section ------------------------------------------------
  
Scenario: Organizational user able to search with valid patient last name in filters functionality on Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the filters button of wellness module
  And user enter the patient last name in filters section
  Then user click on the search button in filters section
  
Scenario: Organizational user able to search with valid patient first name in filters functionality on Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the filters button of wellness module
  And user enter the patient first name in filters section
  Then user click on the search button in filters section
  
Scenario: Organizational user able to search with Invalid patient first name in filters functionality on Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the filters button of wellness module
  And user enter the invalid patient first name in filters section
  Then user click on the search button in filters section  
  
Scenario: Organizational user able to search with Invalid patient first name in filters functionality on Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the filters button of wellness module
  And user enter the invalid patient first name in filters section
  Then user click on the search button in filters section  
  
Scenario: Organizational user able to search with valid patient birth date in filters functionality on Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the filters button of wellness module
  And user enter the patient birth date in filters section
  Then user click on the search button in filters section
  
Scenario: Organizational user able to search with Invalid patient birth date in filters functionality on Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the filters button of wellness module
  And user enter the invalid patient birth date in filters section
  Then user click on the search button in filters section  
  
Scenario: Organizational user able to search with valid patient Id in filters functionality on Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the filters button of wellness module
  And user enter the patient id in filters section
  Then user click on the search button in filters section
  
Scenario: Organizational user able to search with Invalid patient Id in filters functionality on Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the filters button of wellness module
  And user enter the invalid patient id in filters section
  Then user click on the search button in filters section  
  
Scenario: Organizational user able to search with valid patient Birth Date and Id in filters functionality on Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the filters button of wellness module
  When user enter the patient birth date in filters section
  And user enter the patient id in filters section
  Then user click on the search button in filters section
  
Scenario: Organizational user able to search with valid patient first name and Id in filters functionality on Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the filters button of wellness module
  When user enter the patient first name in filters section
  And user enter the patient id in filters section
  Then user click on the search button in filters section
  
Scenario: Organizational user able to search with valid patient last name and Id in filters functionality on Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the filters button of wellness module
  When user enter the patient last name in filters section
  And user enter the patient id in filters section
  Then user click on the search button in filters section
  
Scenario: Organizational user able to search with valid patient last name, first name and Id in filters functionality on Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the filters button of wellness module
  When user enter the patient last name in filters section
  Then user enter the patient first name in filters section
  And user enter the patient id in filters section
  Then user click on the search button in filters section
  
Scenario: Organizational user able to search with valid patient last name, first name, birth date and Id in filters functionality on Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the filters button of wellness module
  When user enter the patient last name in filters section
  Then user enter the patient first name in filters section
  When user enter the patient birth date in filters section
  And user enter the patient id in filters section
  Then user click on the search button in filters section
  
Scenario: Organizational user able to search with Invalid patient last name, first name, birth date and Id in filters functionality on Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the filters button of wellness module
  When user enter the invalid patient last name in filters section
  Then user enter the invalid patient first name in filters section
  When user enter the invalid patient birth date in filters section
  And user enter the invalid patient id in filters section
  Then user click on the search button in filters section  
  
Scenario: Organizational user able to search with Invalid patient last name, first name, birth date and Id in filters functionality on Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the filters button of wellness module
  When user enter the invalid patient last name in filters section
  Then user enter the invalid patient first name in filters section
  When user enter the invalid patient birth date in filters section
  And user enter the invalid patient id in filters section
  Then user click on the search button in filters section
  
Scenario: Organizational user able to click on the clear button after entering with all valid patient last name, first name, birth date and Id in filters functionality on Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the filters button of wellness module
  When user enter the patient last name in filters section
  Then user enter the patient first name in filters section
  When user enter the patient birth date in filters section
  And user enter the patient id in filters section
  Then user click on the search button in filters section
  When user click on the clear button in filters section
  
Scenario: Organizational user able perform the points setting functionality in patient section of Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the points setting button in patient section
  And user enter the points in points setting pop-up winodw
  Then user click on the save button in points setting pop-up window

Scenario: Organizational user able click on the save button without entering the points in points setting functionality in patient section of Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the points setting button in patient section
  And user remove the ponits in points setting pop-up winodw
  Then user click on the save button in points setting pop-up window  
  
Scenario: Organizational user able perform the Buy Points functionality in patient section of Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the buy points button in patient section
  And user enter the points in buy additional points pop-up window
  Then user enter the recipient number in buy additional points pop-up window
  When user click on the buy button in buy additional points pop-up window
  
Scenario: Organizational user able perform the Buy Points functionality without entering Recipient Number in patient section of Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the buy points button in patient section
  And user enter the points in buy additional points pop-up window
  When user click on the buy button in buy additional points pop-up window
  
Scenario: Organizational user able perform the Buy Points functionality without entering Points in patient section of Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the buy points button in patient section
  And user enter the recipient number in buy additional points pop-up window
  When user click on the buy button in buy additional points pop-up window
  
Scenario: Organizational user able perform the Buy Points functionality without entering Points and Recipient Number in patient section of Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the buy points button in patient section
  When user click on the buy button in buy additional points pop-up window
  
Scenario: Organizational user able to click on the Order History button in patient section of Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the order history button in patient section
  
Scenario: Organizational user able to click on the Card button in patient section of Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the card button in patient section
  
Scenario: Organizational user able to Add New Products for that particular patient of Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the card button in patient section
  And user click on the add products button in patient card page
  When user click on the category dropdown button in patient card page
  Then user select the first product category from category dropdown in add product pop-up window
  And user enter the product name in add product pop-up window
  When user click on the search button in add product pop-up window
  Then user click on the select all check box in add product pop-up window
  And user click on the submit button in add product pop-up window
  When user click on the confirm button in patient card page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the order history button in patient section
  And user scroll the order history page
  
Scenario: Organizational user able to Add New Products with out entering product name for that particular patient of Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the card button in patient section
  And user click on the add products button in patient card page
  When user click on the category dropdown button in patient card page
  Then user select the first product category from category dropdown in add product pop-up window
  When user click on the search button in add product pop-up window
  Then user click on the select all check box in add product pop-up window
  And user click on the submit button in add product pop-up window
  When user click on the confirm button in patient card page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the order history button in patient section
  And user scroll the order history page
  
Scenario: Organizational user able to Add New Products with entering invalid product name for that particular patient of Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the card button in patient section
  And user click on the add products button in patient card page
  When user click on the category dropdown button in patient card page
  Then user select the first product category from category dropdown in add product pop-up window
  And user enter the invalid product name in add product pop-up window
  When user click on the search button in add product pop-up window
  Then user click on the select all check box in add product pop-up window
  And user click on the submit button in add product pop-up window
  When user click on the confirm button in patient card page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the order history button in patient section
  And user scroll the order history page
  
Scenario: Organizational user able to Add New Products without selecting the product category for that particular patient of Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the card button in patient section
  And user click on the add products button in patient card page
  Then user enter the product name in add product pop-up window
  When user click on the search button in add product pop-up window
  Then user click on the select all check box in add product pop-up window
  And user click on the submit button in add product pop-up window
  When user click on the confirm button in patient card page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the order history button in patient section
  And user scroll the order history page
  
Scenario: Organizational user able to Add New Products without selecting the product category and without entering product name for that particular patient of Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the card button in patient section
  And user click on the add products button in patient card page
  When user click on the search button in add product pop-up window
  Then user click on the select all check box in add product pop-up window
  And user click on the submit button in add product pop-up window
  When user click on the confirm button in patient card page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the order history button in patient section
  And user scroll the order history page
  
Scenario: Organizational user able to Add New Products without selecting check box for that particular patient of Wellness Module
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the card button in patient section
  And user click on the add products button in patient card page
  When user click on the category dropdown button in patient card page
  Then user select the first product category from category dropdown in add product pop-up window
  And user enter the product name in add product pop-up window
  When user click on the search button in add product pop-up window
  And user click on the submit button in add product pop-up window
  When user click on the confirm button in patient card page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the patient tab in wellness module sidebar menu
  Then user click on the order history button in patient section
  And user scroll the order history page


#------------------------------ Product Section ------------------------------------------------

  
Scenario: Organizational user able to click on the Product tab in Wellness Module Sidebar menu
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  
Scenario: Organizational user able to search products in Products page in Wellness Module Sidebar menu
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  Then user click on the filters button of wellness module
  When user click on the category dropdown button in products page
  Then user select the first product category from category dropdown in products page
  And user enter the product name in products page
  When user click on the search button in products page
  
Scenario: Organizational user able to search with products category in Products page in Wellness Module Sidebar menu
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  Then user click on the filters button of wellness module
  When user click on the category dropdown button in products page
  Then user select the first product category from category dropdown in products page
  When user click on the search button in products page
  
Scenario: Organizational user able to search with product name in Products page in Wellness Module Sidebar menu
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  Then user click on the filters button of wellness module
  And user enter the product name in products page
  When user click on the search button in products page
  
Scenario: Organizational user able to search with invalid product name in Products page in Wellness Module Sidebar menu
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  Then user click on the filters button of wellness module
  And user enter the invalid product name in products page
  When user click on the search button in products page
  
Scenario: Organizational user able to search with product name and click on the clear button in Products page in Wellness Module Sidebar menu
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  Then user click on the filters button of wellness module
  And user enter the product name in products page
  When user click on the search button in products page
  Then user click on the clear button in products page
  
Scenario: Organizational user able to add New Product in Products page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  Then user click on the new product button in products page
  And user enter the new product name in add product section
  When user enter the product description in add product section
  Then user click on the status dropdown button in add product section
  And user select the draft status value from status dropdown
  Then user click on the category dropdown in add product section
  When user select the first category in add product section
  Then user enter the points in add product section
  And user enter the stock in add product section
  Then user able to upload multiple product images in add product section
  And user click on the save product button in add product section
  
Scenario: Organizational user able to add New Product with selecting Published Status in Products page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  Then user click on the new product button in products page
  And user enter the new product name in add product section
  When user enter the product description in add product section
  Then user click on the status dropdown button in add product section
  And user select the published status value from status dropdown
  Then user click on the category dropdown in add product section
  When user select the first category in add product section
  Then user enter the points in add product section
  And user enter the stock in add product section
  Then user able to upload multiple product images in add product section
  And user click on the save product button in add product section
  
Scenario: Organizational user able to add New Product without entering Product Name in Products page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  Then user click on the new product button in products page
  When user enter the product description in add product section
  Then user click on the status dropdown button in add product section
  And user select the published status value from status dropdown
  Then user click on the category dropdown in add product section
  When user select the first category in add product section
  Then user enter the points in add product section
  And user enter the stock in add product section
  Then user able to upload multiple product images in add product section
  And user click on the save product button in add product section
  
Scenario: Organizational user able to add New Product without entering Product Description in Products page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  Then user click on the new product button in products page
  And user enter the new product name in add product section
  Then user click on the status dropdown button in add product section
  And user select the published status value from status dropdown
  Then user click on the category dropdown in add product section
  When user select the first category in add product section
  Then user enter the points in add product section
  And user enter the stock in add product section
  Then user able to upload multiple product images in add product section
  And user click on the save product button in add product section
  
Scenario: Organizational user able to add New Product without selecting the Status in Products page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  Then user click on the new product button in products page
  And user enter the new product name in add product section
  When user enter the product description in add product section
  Then user click on the status dropdown button in add product section
  And user click on the category dropdown in add product section
  When user select the first category in add product section
  Then user enter the points in add product section
  And user enter the stock in add product section
  Then user able to upload multiple product images in add product section
  And user click on the save product button in add product section
  
Scenario: Organizational user able to add New Product without selecting Category in Products page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  Then user click on the new product button in products page
  And user enter the new product name in add product section
  When user enter the product description in add product section
  Then user click on the status dropdown button in add product section
  And user select the published status value from status dropdown
  Then user click on the category dropdown in add product section
  When user enter the points in add product section
  And user enter the stock in add product section
  Then user able to upload multiple product images in add product section
  And user click on the save product button in add product section
  
Scenario: Organizational user able to add New Product without entering points in Products page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  Then user click on the new product button in products page
  And user enter the new product name in add product section
  When user enter the product description in add product section
  Then user click on the status dropdown button in add product section
  And user select the published status value from status dropdown
  Then user click on the category dropdown in add product section
  When user select the first category in add product section
  And user enter the stock in add product section
  Then user able to upload multiple product images in add product section
  And user click on the save product button in add product section
  
Scenario: Organizational user able to add New Product without entering stock in Products page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  Then user click on the new product button in products page
  And user enter the new product name in add product section
  When user enter the product description in add product section
  Then user click on the status dropdown button in add product section
  And user select the published status value from status dropdown
  Then user click on the category dropdown in add product section
  When user select the first category in add product section
  Then user enter the points in add product section
  When user able to upload multiple product images in add product section
  And user click on the save product button in add product section
  
Scenario: Organizational user able to add New Product without uploading Images in Products page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  Then user click on the new product button in products page
  And user enter the new product name in add product section
  When user enter the product description in add product section
  Then user click on the status dropdown button in add product section
  And user select the published status value from status dropdown
  Then user click on the category dropdown in add product section
  When user select the first category in add product section
  Then user enter the points in add product section
  And user enter the stock in add product section
  When user click on the save product button in add product section
  
Scenario: Organizational user able to add New Product without entering the details in Products page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  Then user click on the new product button in products page
  And user click on the save product button in add product section
  
Scenario: Organizational user able to click on the Product Edit button in Products page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  And user click on the three-dot button in products page
  Then user click on the edit button of any particular product in products page
  
Scenario:  Organizational user able to perform the Product Edit functionality with editing Product Name in Products page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  And user click on the three-dot button in products page
  Then user click on the edit button of any particular product in products page
  And user able to edit product name in add product section
  When user click on the save product button in add product section
  
Scenario: Organizational user able to perform the Product Edit functionality with remove Product Name in Products page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  And user click on the three-dot button in products page
  Then user click on the edit button of any particular product in products page
  And user able to remove product name in add product section
  When user click on the save product button in add product section
  
Scenario: Organizational user able to perform the Product Edit functionality with editing Product Description in Products page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  And user click on the three-dot button in products page
  Then user click on the edit button of any particular product in products page
  And user able to edit product description in add product section
  When user click on the save product button in add product section
  
Scenario: Organizational user able to perform the Product Edit functionality with remove Product Description in Products page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  And user click on the three-dot button in products page
  Then user click on the edit button of any particular product in products page
  And user able to remove product description in add product section
  When user click on the save product button in add product section
  
Scenario: Organizational user able to perform the Product Edit functionality with editing Product Status as Draft in Products page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  And user click on the three-dot button in products page
  Then user click on the edit button of any particular product in products page
  Then user click on the status dropdown button in add product section
  And user select the draft status value from status dropdown
  When user click on the save product button in add product section
  
Scenario: Organizational user able to perform the Product Edit functionality with editing Product Status as None in Products page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  And user click on the three-dot button in products page
  Then user click on the edit button of any particular product in products page
  Then user click on the status dropdown button in add product section
  And user select the none status value from status dropdown
  When user click on the save product button in add product section
  
Scenario: Organizational user able to perform the Product Edit functionality with editing Product Category in Products page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  And user click on the three-dot button in products page
  Then user click on the edit button of any particular product in products page
  And user click on the category dropdown in add product section
  Then user select the second category in add product section
  When user click on the save product button in add product section
  
Scenario: Organizational user able to perform the Product Edit functionality with editing Product Category as None in Products page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  And user click on the three-dot button in products page
  Then user click on the edit button of any particular product in products page
  And user click on the category dropdown in add product section
  Then user select the none category in add product section
  When user click on the save product button in add product section
  
Scenario: Organizational user able to perform the Product Edit functionality with editing Product Points in Products page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  And user click on the three-dot button in products page
  Then user click on the edit button of any particular product in products page
  And user edit the points in add product section
  When user click on the save product button in add product section
  
Scenario: Organizational user able to perform the Product Edit functionality with editing Product Points in Products page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  And user click on the three-dot button in products page
  Then user click on the edit button of any particular product in products page
  And user remove the points in add product section
  When user click on the save product button in add product section
  
Scenario: Organizational user able to perform the Product Edit functionality with editing Product Stock in Products page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  And user click on the three-dot button in products page
  Then user click on the edit button of any particular product in products page
  And user edit the stock in add product section
  When user click on the save product button in add product section
  
Scenario: Organizational user able to perform the Product Edit functionality with editing Product Stock in Products page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  And user click on the three-dot button in products page
  Then user click on the edit button of any particular product in products page
  And user remove the stock in add product section
  When user click on the save product button in add product section
  
Scenario: Organizational user able to perform the Product Delete functionality in Products page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product tab in wellness module sidebar menu
  And user click on the three-dot button in products page
  Then user click on the delete button of any particular product in products page
  And user click on the confirm button in delete patient pop-up window                        


#------------------------------ Product Category ------------------------------------------------

  
Scenario: Organizational user able to click on the Product Category tab in Wellness Module sidebar 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product category tab in wellness module sidebar menu
  
Scenario: Organizational user able to Add A New Product Category in Wellness Module 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product category tab in wellness module sidebar menu
  Then user click on the new product category button in product category section
  And user able to upload the product category image in product category section
  When user enter the product category name in product category section
  Then user enter the product category description in product category section
  When user click on the submit button in product category section
  
Scenario: Organizational user able to Add A New Product Category without uploading Product Category Image in Wellness Module 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product category tab in wellness module sidebar menu
  Then user click on the new product category button in product category section
  When user enter the product category name in product category section
  Then user enter the product category description in product category section
  When user click on the submit button in product category section
  
Scenario: Organizational user able to Add A New Product Category without entering product category name in Wellness Module 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product category tab in wellness module sidebar menu
  Then user click on the new product category button in product category section
  And user able to upload the product category image in product category section
  Then user enter the product category description in product category section
  When user click on the submit button in product category section
  
Scenario: Organizational user able to Add A New Product Category without entering product category description in Wellness Module 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product category tab in wellness module sidebar menu
  Then user click on the new product category button in product category section
  And user able to upload the product category image in product category section
  When user enter the product category name in product category section
  Then user click on the submit button in product category section
  
Scenario: Organizational user able to Add A New Product Category without filling any details in Wellness Module 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product category tab in wellness module sidebar menu
  Then user click on the new product category button in product category section
  When user click on the submit button in product category section
  
Scenario: Organizational user able to click on the Product Category Edit button in Products Category page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product category tab in wellness module sidebar menu
  Then user click on the three dot button in product category section
  And user click on the edit button for any particular product category
  
Scenario: Organizational user able to perform the Edit functionality of Product Category with change the product Category image 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product category tab in wellness module sidebar menu
  Then user click on the three dot button in product category section
  And user click on the edit button for any particular product category
  When user able to change the product category image
  Then user click on the submit button in product category section
  
Scenario: Organizational user able to perform the Edit functionality of Product Category with remove the product Category image 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product category tab in wellness module sidebar menu
  Then user click on the three dot button in product category section
  And user click on the edit button for any particular product category
  When user click on the remove button in add product category section
  Then user click on the submit button in product category section
  
Scenario: Organizational user able to perform the Edit functionality of Product Category with change the product Category name 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product category tab in wellness module sidebar menu
  Then user click on the three dot button in product category section
  And user click on the edit button for any particular product category
  When user able to change the product category name
  Then user click on the submit button in product category section
  
Scenario: Organizational user able to perform the Edit functionality of Product Category with remove the product Category name 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product category tab in wellness module sidebar menu
  Then user click on the three dot button in product category section
  And user click on the edit button for any particular product category
  When user remove the product category name
  Then user click on the submit button in product category section
  
Scenario: Organizational user able to perform the Edit functionality of Product Category with change the product Category description 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product category tab in wellness module sidebar menu
  Then user click on the three dot button in product category section
  And user click on the edit button for any particular product category
  When user able to change the product category description
  Then user click on the submit button in product category section
  
Scenario: Organizational user able to perform the Edit functionality of Product Category with remove the product Category description 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product category tab in wellness module sidebar menu
  Then user click on the three dot button in product category section
  And user click on the edit button for any particular product category
  When user remove the product category description
  Then user click on the submit button in product category section
  
Scenario: Organizational user able to perform the Delete functionality of Product Category 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the wellness module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the product category tab in wellness module sidebar menu
  Then user click on the three dot button in product category section
  And user click on the delete button of any particular product in product category
  When user click on the confirm button in delete product category pop-up window                                                