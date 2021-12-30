Feature: User can register and Login
Scenario: To verify whether user can register and login
Given Access demoqa website Click on login
When Click on New User button and enter all details
And Click on Register button
Then User should be registered sucessfully


Scenario: To verify whether user can login
Given Access demoqa website and click on login button
When Enter username and password 
Then User should be able to access the website and verify title
Then perform logout  
