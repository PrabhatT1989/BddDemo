Feature: User can login into OrangeHRM using multiple valid credentials
Scenario Outline: Verify login functionality using all valid credentials 
Given Access login screen
When enter credentials "<username>"  "<password>" and click on login button
Then Login functionality should work appropriately
Examples: 
|username|password|
|Admin|admin123|
|Admin|admin123|