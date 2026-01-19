@ProjectModuleFeature
Feature: Project Module Functionality 

Scenario: User able to login with user type as Organization in login page  
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  
Scenario: Organizational user able to click on Project Module tab 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  
Scenario: Organizational user able to click on Boards Section in Project Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  
#-------------------------- Create a New Board ----------------------------------------------  
  
Scenario: Organizational user able to create a New Board in Project Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the create new board button in boards page
  And user enter the board name in add board pop-up window
  Then user enter the board description in add board pop-up winodw
  When user click on the submit button in add board pop-up window
  
Scenario: Organizational user able to create a New Board without entering Board Name in Project Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the create new board button in boards page
  And user enter the board description in add board pop-up winodw
  When user click on the submit button in add board pop-up window
  
Scenario: Organizational user able to create a New Board without entering Board Description in Project Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the create new board button in boards page
  And user enter the board name in add board pop-up window
  When user click on the submit button in add board pop-up window
  
Scenario: Organizational user able to create a New Board without entering any details in Project Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the create new board button in boards page
  When user click on the submit button in add board pop-up window
  
#-------------------------- Edit The Board ----------------------------------------------  
  
Scenario: Organizational user able to perform the Edit Board functionality in Project Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the edit board button in boards page
  And user edit the board name in edit board pop-up window
  Then user edit the borad description in edit board pop-up window
  When user click on the submit button in add board pop-up window
  
Scenario: Organizational user able to perform the Edit Board functionality only Board Description in Project Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the edit board button in boards page
  And user edit the borad description in edit board pop-up window
  When user click on the submit button in add board pop-up window
  
Scenario: Organizational user able to perform the Edit Board functionality only Board Name in Project Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the edit board button in boards page
  And user edit the board name in edit board pop-up window
  When user click on the submit button in add board pop-up window
  
Scenario: Organizational user able to perform the Edit Board functionality with remove the Board Name in Project Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the edit board button in boards page
  And user remove the board name in edit board pop-up window
  When user click on the submit button in add board pop-up window
  
Scenario: Organizational user able to perform the Edit Board functionality with remove the Board Description in Project Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the edit board button in boards page
  And user remove the board description in edit board pop-up window
  When user click on the submit button in add board pop-up window
  
Scenario: Organizational user able to perform the Edit Board functionality with remove the Board Name and Description in Project Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the edit board button in boards page
  And user remove the board name in edit board pop-up window
  Then user remove the board description in edit board pop-up window
  When user click on the submit button in add board pop-up window
  
#-------------------------- Delete The Board ----------------------------------------------  
  
Scenario: Organizational user able to perform the Delete Board functionality in Project Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the delete board button in boards page
  And user click on the confirm button delete board pop-up window
  
  #--------------------- Setting The Board ------------------------------------------------
  
Scenario: Organizational user able to click on Setting button in Project Module tab
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the setting button in boards page
  
Scenario: Organizational user able to perform the Edit All Task Permission functionality for Team Lead in Board Details Page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the setting button in boards page
  And user click on the three dot button in board member section
  When user click on the edit button in board member section
  Then user uncheck the add panel permission in edit task permission pop-up window
  And user uncheck the edit panel permission in edit task permission pop-up window
  Then user uncheck the delete panel permission in edit task permission pop-up window
  And user uncheck the add task permission in edit task permission pop-up window
  Then user uncheck the edit task permission in edit task permission pop-up window
  And user uncheck the delete task permission in edit task permission pop-up window
  Then user uncheck the add comment permission in edit task permission pop-up window
  And user uncheck the mark closed permission in edit task permission pop-up window
  When user click on the submit button in edit task permission pop-up window
  
  
  #--------------------- Add New Board Member ------------------------------------------------  
  
  
Scenario: Team Lead user able to perform the Add New Board member functionality in Board Details Page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the setting button in boards page
  And user click on the new board member button in board member section
  Then user enter the last name in search user pop-up window
  And user enter the first name in search user pop-up window
  When user click on the search button in search user pop-up window
  Then user click on the user radio button in search user pop-up window
  And user click on the submit button in search user pop-up window
  
Scenario: Team Lead user able to perform the Add New Board member functionality with entering invalid details in Board Details Page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the setting button in boards page
  And user click on the new board member button in board member section
  Then user enter the invalid last name in search user pop-up window
  And user enter the invalid first name in search user pop-up window
  When user click on the search button in search user pop-up window
  Then user click on the user radio button in search user pop-up window
  And user click on the submit button in search user pop-up window
  
Scenario: Team Lead user able to perform the Add New Board member functionality without entering the details in Board Details Page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the setting button in boards page
  And user click on the new board member button in board member section
  When user click on the search button in search user pop-up window
  Then user click on the user radio button in search user pop-up window
  And user click on the submit button in search user pop-up window
  
  
  #--------------------- Assign Task Permission ------------------------------------------------
  
  
  
Scenario: Team Lead user able to perform the Assign All task Permission of Newly Added Member in Board Details Page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the setting button in boards page
  When user click on the newly added board member three dot vertical button
  Then user click on the edit button for newly added board member
  And user set the add panel permission for newly added board member
  Then user set the edit panel permission for newly added board member
  And user set the delete panel permission for newly added board member
  Then user set the add task permission for newly added board member
  And user set the edit task permission for newly added board member
  Then user set the delete task permission for newly added board member
  And user set the add comment permission for newly added board member
  Then user set the mark closed permission for newly added board member
  When user click on the submit button in edit task permission pop-up window
   
Scenario: Team Lead user able to assign the only Add Panel task Permission of Newly Added Member in Board Details Page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the setting button in boards page
  When user click on the newly added board member three dot vertical button
  Then user click on the edit button for newly added board member
  And user set the add panel permission for newly added board member
  When user click on the submit button in edit task permission pop-up window
  
Scenario: Team Lead user able to assign the only Edit Panel task Permission of Newly Added Member in Board Details Page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the setting button in boards page
  When user click on the newly added board member three dot vertical button
  Then user click on the edit button for newly added board member
  And user set the edit panel permission for newly added board member
  When user click on the submit button in edit task permission pop-up window
  
Scenario: Team Lead user able to assign the only Delete Panel task Permission of Newly Added Member in Board Details Page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the setting button in boards page
  When user click on the newly added board member three dot vertical button
  Then user click on the edit button for newly added board member
  And user set the delete panel permission for newly added board member
  When user click on the submit button in edit task permission pop-up window
  
Scenario: Team Lead user able to assign the only Add Task task Permission of Newly Added Member in Board Details Page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the setting button in boards page
  When user click on the newly added board member three dot vertical button
  Then user click on the edit button for newly added board member
  And user set the add task permission for newly added board member
  When user click on the submit button in edit task permission pop-up window
  
Scenario: Team Lead user able to assign the only Edit Task task Permission of Newly Added Member in Board Details Page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the setting button in boards page
  When user click on the newly added board member three dot vertical button
  Then user click on the edit button for newly added board member
  And user set the edit task permission for newly added board member
  When user click on the submit button in edit task permission pop-up window
  
Scenario: Team Lead user able to assign the only Delete Task task Permission of Newly Added Member in Board Details Page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the setting button in boards page
  When user click on the newly added board member three dot vertical button
  Then user click on the edit button for newly added board member
  And user set the delete task permission for newly added board member
  When user click on the submit button in edit task permission pop-up window
  
Scenario: Team Lead user able to assign the only Add Comment task Permission of Newly Added Member in Board Details Page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the setting button in boards page
  When user click on the newly added board member three dot vertical button
  Then user click on the edit button for newly added board member
  And user set the add comment permission for newly added board member
  When user click on the submit button in edit task permission pop-up window
  
Scenario: Team Lead user able to assign the only Mark Closed task Permission of Newly Added Member in Board Details Page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the setting button in boards page
  When user click on the newly added board member three dot vertical button
  Then user click on the edit button for newly added board member
  And user set the mark closed permission for newly added board member
  When user click on the submit button in edit task permission pop-up window
  
  
  #--------------------- Assign Team Lead Permission  ------------------------------------------------                
  
Scenario: Team Lead user able to assign the Board Lead Member for Newly Added Member in Board Details Page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the setting button in boards page
  When user click on the assign team lead button in board details page
  Then user click on the confirm button in assign team lead pop-up window
  
Scenario: Board created user able to Delete the Board Lead Member in Board Details Page 
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the setting button in boards page
  When user click on the newly added board member three dot vertical button
  Then user click on the delete button for newly added board member
  And user click on the confirm button in delete board member pop-up window
  
Scenario: Board created user able to click on the newly created board panel in Boards page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the newly created board panel in boards page
  
Scenario: Board created user able to click on the newly created board panel through sidebar in Boards page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the newly created board panel through sidebar in boards page
  
Scenario: Board created user able to change the BackGround Board Colour as Orange in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the newly created board panel in boards page
  When user click on the colour button in tasks section
  Then user change background colour as orange in tasks section
  
Scenario: Board created user able to change the BackGround Board Colour as Green in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the newly created board panel in boards page
  When user click on the colour button in tasks section
  Then user change background colour as green in tasks section
  
Scenario: Board created user able to change the BackGround Board Colour as Blue in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the newly created board panel in boards page
  When user click on the colour button in tasks section
  Then user change background colour as blue in tasks section
  
Scenario: Board created user able to change the BackGround Board Colour as Pink in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the newly created board panel in boards page
  When user click on the colour button in tasks section
  Then user change background colour as pink in tasks section
  
Scenario: Board created user able to perform the filter functionality with all details in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the newly created board panel in boards page
  And user click on the board filter button in tasks section
  When user enter the task title name in board filter
  Then user select the assign from date in board filter
  And user select the assign to date in board filter
  Then user select the users from user filter dropdown in board filter
  And user click on the search button in board filter
  
Scenario: Board created user able to perform the filter functionality with only task title in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the newly created board panel in boards page
  And user click on the board filter button in tasks section
  When user enter the task title name in board filter
  And user click on the search button in board filter
  
Scenario: Board created user able to perform the filter functionality with selecting only From Date in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the newly created board panel in boards page
  And user click on the board filter button in tasks section
  Then user select the assign from date in board filter
  And user click on the search button in board filter
  
Scenario: Board created user able to perform the filter functionality with selecting only To Date in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the newly created board panel in boards page
  And user click on the board filter button in tasks section
  When user select the assign to date in board filter
  And user click on the search button in board filter
  
Scenario: Board created user able to perform the filter functionality with selecting only users in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the newly created board panel in boards page
  And user click on the board filter button in tasks section
  Then user select the users from user filter dropdown in board filter
  And user click on the search button in board filter
  
  
  #--------------------- Add Panel Functionality  ------------------------------------------------ 
  
  
Scenario: Board created user able to Add the New Panel in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the newly created board panel in boards page
  And user click on the add new panel button in board panels page
  When user enter the board panel name in add board panel pop-up window
  Then user click on the submit button in add board panel pop-up window
  
Scenario: Board created user able to Add the New Panel with out entering name in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the newly created board panel in boards page
  And user click on the add new panel button in board panels page
  Then user click on the submit button in add board panel pop-up window
  
  
  #--------------------- Edit Panel Functionality  ------------------------------------------------
  
Scenario: Board created user able to Edit the existing board panel name in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the newly created board panel in boards page
  And user click on the edit button of existing panel in board panels page
  When user change the existing board panel name in board panels page
  Then user click on the submit button in add board panel pop-up window
  
Scenario: Board created user able to Edit the existing board panel name is remove in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the newly created board panel in boards page
  And user click on the edit button of existing panel in board panels page
  When user remove the existing board panel name in board panels page
  Then user click on the submit button in add board panel pop-up window
  
  
  #--------------------- Delete Panel Functionality  ------------------------------------------------
  
  
Scenario: Board created user able to Delete the existing board panel in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the newly created board panel in boards page
  And user click on the delete button of existing panel in board panels page
  When user click on the confirm button in delete panel pop-up window
  
  
    #--------------------- Add Task Functionality  ------------------------------------------------
      
  
Scenario: Board created user able to Add a Card with Card name in To Do Board panel in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the newly created board panel in boards page
  And user click on the add a card tab in to do board panel
  When user enter the new card name in board panel
  Then user click on the add card button in board panel
  
Scenario: Board created user able to Add a Card without entering card name in To Do Board panel in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the newly created board panel in boards page
  And user click on the add a card tab in to do board panel
  Then user click on the add card button in board panel
  
  
  #--------------------- Edit Task Functionality  ------------------------------------------------
  
Scenario: Board created user able the Task Details in existing Task for To Do Board panel in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the newly created board panel in boards page
  And user click on the existing task tab in To Do board panel
  When user add a task start date in edit task pop-up window
  Then user add a task end date in edit task pop-up window
  And user click on the priority tab in edit task pop-up window
  When user click on the critical priority in priority section
  And user enter the task details in edit task pop-up window
  When user enter the comments in edit task pop-up window
  Then user click on the add comment in edit task pop-up window
  And user click on the submit button in edit task pop-up window
  
  
  #--------------------- Mark Complete Functionality  ------------------------------------------------





  
  
  
Scenario: Board created user able the Task as Mark completed in existing Task for To Do Board panel in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the newly created board panel in boards page
  And user click on the existing task tab in To Do board panel
  Then user click on the mark complete tab in edit task pop-up window
  
  
  #--------------------- Add Comments Functionality  ------------------------------------------------
  
  
Scenario: Board created user able Add Comments in existing Task for To Do Board panel in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the newly created board panel in boards page
  And user click on the existing task tab in To Do board panel
  When user enter the comments in edit task pop-up window
  Then user click on the add comment in edit task pop-up window
  And user click on the submit button in edit task pop-up window
  
  
  #--------------------- Delete Task Functionality  ------------------------------------------------
    
  
Scenario: Board created user able Delete the existing Task for To Do Board panel in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the organization emailid
  And user enter the organization password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the boards section in project module sidebar menu
  Then user click on the newly created board panel in boards page
  And user click on the existing task tab in To Do board panel
  Then user click on the delete button in edit task pop-up window
  And user click on the delete card button in delete card in the edit task pop-up window
  
  
  #--------------------- Board Member Functionality  ------------------------------------------------
      
  
Scenario: Board member user able to perform the Add Panel action on the Board Panels page.
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the board member emailid
  And user enter the board member password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the newly created board panel through sidebar in boards page
  And user click on the add new panel button in board panels page
  When user enter the board panel name in add board panel pop-up window
  Then user click on the submit button in add board panel pop-up window
  
Scenario: Board member user able to perform the Add Panel action without entering board panel name on the Board Panels page.
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the board member emailid
  And user enter the board member password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the newly created board panel through sidebar in boards page
  And user click on the add new panel button in board panels page
  Then user click on the submit button in add board panel pop-up window  
  
Scenario: Board member user able to perform the Edit Panel action on the Board Panels page.
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the board member emailid
  And user enter the board member password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the newly created board panel through sidebar in boards page
  And user click on the edit button of existing panel in board panels page
  When user change the existing board panel name in board panels page
  Then user click on the submit button in add board panel pop-up window
  
Scenario: Board member user able to perform the Delete Panel action on the Board Panels page.
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the board member emailid
  And user enter the board member password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the newly created board panel through sidebar in boards page
  And user click on the delete button of existing panel in board panels page
  When user click on the confirm button in delete panel pop-up window
  
Scenario: Board member user able to Add a Card with Card name in To Do Board panel in Board Panels  page.
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the board member emailid
  And user enter the board member password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the newly created board panel through sidebar in boards page
  And user click on the add a card tab in to do board panel
  When user enter the new card name in board panel
  Then user click on the add card button in board panel
  
Scenario: Board member user able to Add a Card without entering Card name in To Do Board panel in Board Panels  page.
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the board member emailid
  And user enter the board member password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the newly created board panel through sidebar in boards page
  And user click on the add a card tab in to do board panel
  Then user click on the add card button in board panel     
   
Scenario: Board member user able the Task Details in existing Task for To Do Board panel in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the board member emailid
  And user enter the board member password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the newly created board panel through sidebar in boards page
  And user click on the existing task tab in To Do board panel
  When user add a task start date in edit task pop-up window
  Then user add a task end date in edit task pop-up window
  And user click on the priority tab in edit task pop-up window
  When user click on the critical priority in priority section
  And user enter the task details in edit task pop-up window
  Then user click on the submit button in edit task pop-up window
  
Scenario: Board member user able the Task as Mark completed in existing Task for To Do Board panel in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the board member emailid
  And user enter the board member password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the newly created board panel through sidebar in boards page
  And user click on the existing task tab in To Do board panel
  Then user click on the mark complete tab in edit task pop-up window
  
Scenario: Board member user able Add Comments in existing Task for To Do Board panel in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the board member emailid
  And user enter the board member password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the newly created board panel through sidebar in boards page
  And user click on the existing task tab in To Do board panel
  When user enter the comments in edit task pop-up window
  Then user click on the add comment in edit task pop-up window
  And user click on the submit button in edit task pop-up window
  
Scenario: Board member user able Delete the existing Task for To Do Board panel in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the board member emailid
  And user enter the board member password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the newly created board panel through sidebar in boards page
  And user click on the existing task tab in To Do board panel
  Then user click on the delete button in edit task pop-up window
  And user click on the delete card button in delete card in the edit task pop-up window
  
Scenario: Board member user able to change the BackGround Board Colour as Orange in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the board member emailid
  And user enter the board member password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the newly created board panel through sidebar in boards page
  When user click on the colour button in tasks section
  Then user change background colour as orange in tasks section
  
Scenario: Board member user able to change the BackGround Board Colour as Green in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the board member emailid
  And user enter the board member password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the newly created board panel through sidebar in boards page
  When user click on the colour button in tasks section
  Then user change background colour as green in tasks section
  
Scenario: Board member user able to change the BackGround Board Colour as Blue in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the board member emailid
  And user enter the board member password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the newly created board panel through sidebar in boards page
  When user click on the colour button in tasks section
  Then user change background colour as blue in tasks section
  
Scenario: Board member user able to change the BackGround Board Colour as Pink in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the board member emailid
  And user enter the board member password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the newly created board panel through sidebar in boards page
  When user click on the colour button in tasks section
  Then user change background colour as pink in tasks section
  
Scenario: Board member user able to perform the filter functionality with all details in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the board member emailid
  And user enter the board member password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the newly created board panel through sidebar in boards page
  And user click on the board filter button in tasks section
  When user enter the task title name in board filter
  Then user select the assign from date in board filter
  And user select the assign to date in board filter
  Then user select the users from user filter dropdown in board filter
  And user click on the search button in board filter
  
Scenario: Board member user able to perform the filter functionality with only task title in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the board member emailid
  And user enter the board member password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the newly created board panel through sidebar in boards page
  And user click on the board filter button in tasks section
  When user enter the task title name in board filter
  And user click on the search button in board filter
  
Scenario: Board member user able to perform the filter functionality with selecting only From Date in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the board member emailid
  And user enter the board member password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the newly created board panel through sidebar in boards page
  And user click on the board filter button in tasks section
  Then user select the assign from date in board filter
  And user click on the search button in board filter
  
Scenario: Board member user able to perform the filter functionality with selecting only To Date in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the board member emailid
  And user enter the board member password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the newly created board panel through sidebar in boards page
  And user click on the board filter button in tasks section
  When user select the assign to date in board filter
  And user click on the search button in board filter
 
Scenario: Board member user able to perform the filter functionality with selecting only users in Board Panels page
  Given user launch browser
  Then user click on the user type dropdown
  When user select the user type as organization from user type dropdown
  Then user enter the board member emailid
  And user enter the board member password
  When user click on the go button
  Then user click on the project module tab in home page
  And user click on the sidebar collpase button in module dashboard page
  When user click on the newly created board panel through sidebar in boards page
  And user click on the board filter button in tasks section
  Then user select the users from user filter dropdown in board filter
  And user click on the search button in board filter  