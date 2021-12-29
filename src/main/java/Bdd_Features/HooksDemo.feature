Feature: to verify login of account
Scenario: To verify whether user can login
Given enter credentials
When click on login button
Then user should be logged in 

Scenario: To verify forgoton password 
Given Access forgotten password link
When Enter emailid and click on Search
Then  Click on Not you button 


Scenario: To verify signup
Given Access signup page  
When enter details
Then click on close
