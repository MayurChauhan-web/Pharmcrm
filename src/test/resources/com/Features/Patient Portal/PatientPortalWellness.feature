@PatientPortalWellnessFeature

Feature: Patient Portal Wellness Functionality 
 
Scenario: User able to login with user type as Patient in login page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as Patient from user type dropdown
  Then user enter the Patient emailid
  And user enter the Patient password
  When user click on the go button
  
  
  #------------------------------ Products Section ------------------------------------------------
  
  
Scenario: Patient user able to click on the Products tab in Patient Portal
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as Patient from user type dropdown
  Then user enter the Patient emailid
  And user enter the Patient password
  When user click on the go button
  And user click on the sidebar collpase button in module dashboard page
  Then user click on the products tab in patient portal sidebar menu
  
Scenario: Patient user able to perform the Search functionality in Products page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as Patient from user type dropdown
  Then user enter the Patient emailid
  And user enter the Patient password
  When user click on the go button
  And user click on the sidebar collpase button in module dashboard page
  Then user click on the products tab in patient portal sidebar menu
  When user search with valid products name in search textbox
  
Scenario: Patient user able to perform the Search functionality with invalid product name in Products page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as Patient from user type dropdown
  Then user enter the Patient emailid
  And user enter the Patient password
  When user click on the go button
  And user click on the sidebar collpase button in module dashboard page
  Then user click on the products tab in patient portal sidebar menu
  When user search with invalid products name in search textbox
  
Scenario: Patient user is able to click the Clear All button after using the search functionality on the Products page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as Patient from user type dropdown
  Then user enter the Patient emailid
  And user enter the Patient password
  When user click on the go button
  And user click on the sidebar collpase button in module dashboard page
  Then user click on the products tab in patient portal sidebar menu
  When user search with valid products name in search textbox
  Then user click on the clear all button in products page
  
Scenario: Patient user is able to perform the Product Sort By as Ascending functionality on the Products page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as Patient from user type dropdown
  Then user enter the Patient emailid
  And user enter the Patient password
  When user click on the go button
  And user click on the sidebar collpase button in module dashboard page
  Then user click on the products tab in patient portal sidebar menu
  And user select the ascending sort from sort by dropdown in products page
  
Scenario: Patient user is able to perform the Product Sort By as Descending functionality on the Products page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as Patient from user type dropdown
  Then user enter the Patient emailid
  And user enter the Patient password
  When user click on the go button
  And user click on the sidebar collpase button in module dashboard page
  Then user click on the products tab in patient portal sidebar menu
  And user select the descending sort from sort by dropdown in products page
  
Scenario: Patient user is able to perform the Product Sort By as Points : low to high functionality on the Products page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as Patient from user type dropdown
  Then user enter the Patient emailid
  And user enter the Patient password
  When user click on the go button
  And user click on the sidebar collpase button in module dashboard page
  Then user click on the products tab in patient portal sidebar menu
  And user select the Points as low to high sort from sort by dropdown in products page
  
Scenario: Patient user is able to perform the Product Sort By as Points : high to low functionality on the Products page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as Patient from user type dropdown
  Then user enter the Patient emailid
  And user enter the Patient password
  When user click on the go button
  And user click on the sidebar collpase button in module dashboard page
  Then user click on the products tab in patient portal sidebar menu
  And user select the Points as high to low sort from sort by dropdown in products page
  
Scenario: Patient user is able to Buy the product on the Products page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as Patient from user type dropdown
  Then user enter the Patient emailid
  And user enter the Patient password
  When user click on the go button
  And user click on the sidebar collpase button in module dashboard page
  Then user click on the products tab in patient portal sidebar menu
  When user click on the product tab in products page
  Then user click on add to cart button in product details page
  And user click on go to cart button in product details page
  When user click on the proceed button in product cart page
  
Scenario: Patient user is able to delete the product from the Product Cart page and click the Proceed button on the Product Cart page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as Patient from user type dropdown
  Then user enter the Patient emailid
  And user enter the Patient password
  When user click on the go button
  And user click on the sidebar collpase button in module dashboard page
  Then user click on the products tab in patient portal sidebar menu
  When user click on the product tab in products page
  Then user click on add to cart button in product details page
  And user click on go to cart button in product details page
  Then user able to delete the product from product cart page
  When user click on the proceed button in product cart page
  
Scenario: Patient user is able to click on the Shopping Cart tab on the Products page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as Patient from user type dropdown
  Then user enter the Patient emailid
  And user enter the Patient password
  When user click on the go button
  And user click on the sidebar collpase button in module dashboard page
  Then user click on the products tab in patient portal sidebar menu
  When user click on the shopping cart tab in products page
  
Scenario: Patient user is able to click the Proceed button on the Product Cart page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as Patient from user type dropdown
  Then user enter the Patient emailid
  And user enter the Patient password
  When user click on the go button
  And user click on the sidebar collpase button in module dashboard page
  Then user click on the products tab in patient portal sidebar menu
  When user click on the shopping cart tab in products page
  And user click on the proceed button in product cart page
  
  
  #------------------------------ Order History Section ------------------------------------------------
  
  
Scenario: Patient user able to click on the Order History tab in Patient Portal
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as Patient from user type dropdown
  Then user enter the Patient emailid
  And user enter the Patient password
  When user click on the go button
  And user click on the sidebar collpase button in module dashboard page
  Then user click on the order history tab in patient portal sidebar menu
  
Scenario: Patient user able to click on the View your Item button in Order History page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as Patient from user type dropdown
  Then user enter the Patient emailid
  And user enter the Patient password
  When user click on the go button
  And user click on the sidebar collpase button in module dashboard page
  Then user click on the order history tab in patient portal sidebar menu
  When user click on the view your item button in order history page
  
Scenario: Patient user able to click on the View order details button in Order History page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as Patient from user type dropdown
  Then user enter the Patient emailid
  And user enter the Patient password
  When user click on the go button
  And user click on the sidebar collpase button in module dashboard page
  Then user click on the order history tab in patient portal sidebar menu
  When user click on the view order details button in order history page
  
  
  #------------------------------ Points History Section ------------------------------------------------
  
   
Scenario: Patient user able to click on the Points History tab in Patient Portal
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as Patient from user type dropdown
  Then user enter the Patient emailid
  And user enter the Patient password
  When user click on the go button
  And user click on the sidebar collpase button in module dashboard page
  Then user click on the points history tab in patient portal sidebar menu      