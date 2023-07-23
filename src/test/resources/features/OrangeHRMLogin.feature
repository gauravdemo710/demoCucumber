Feature: Orange HRM Login

Scenario: Login to Orange HRM

Given user is on login page
When user enters username as "Admin"
And user enters password as "admin123"
And user click on login button
Then user will be on dashboard page

Scenario: Login to Orange HRM By Invalid Credentials

Given user is on login page
When user enters username as "Gaurav"
And user enters password as "admin123"
And user click on login button
Then user will be on dashboard page