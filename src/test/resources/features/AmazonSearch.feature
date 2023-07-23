# ----------It is feature name-----------
@All
Feature: Amazon Search

Background:
Given user is on home page of amazon
And user will navigate to sign in page
When user proivde mobile number
And click on continue button
Then user provide password
And click on sign in button
And user will login successfully

# ----------It is first scenario-------------
@Smoke @US254
Scenario: Search product in Amazon

When user search "nokia" in amazon for 2000 quantity
Then user will get product search result

#-------------------scenario 2----------------------#
@Smoke @Sanity @US254 @Demohook
Scenario: Login To Amazon

Then verify user is loggedIn

#-------------------scenario 3----------------------#
@Prod
  Scenario: Add to card a product in Amazon
  
    When user select a product
    And user click on add to cart
    Then user proceed to checkout
    And user make the payment