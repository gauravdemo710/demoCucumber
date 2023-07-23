Feature: Registration in application

Scenario: Create new user into application

Given user is on registration page
When user enters following details
	| FirstName	| LastName	| EmailId 	| PhoneNum	| City	|
	| Rahul	| Gandhi	| Rahul.Gandhi@gmail.com	| 7235698745	| Banglore	|
Then user click on register button
And user generates successfully in application