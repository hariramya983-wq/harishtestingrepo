Feature: feature to test login functionality
Scenario: check login is succesfull with valid credentials
Given user is on login page 
When user enters username and password
Then user is navigated to the home page
