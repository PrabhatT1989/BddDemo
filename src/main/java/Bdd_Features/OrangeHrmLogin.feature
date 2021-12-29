Feature: User can login to OrangeHRM portal using valid credentials
Scenario: To verify whether user can login using valid credentials

Given Access the orange HRM website
When Enter "u_name" and "password" and click on login button
Then User should be logged in