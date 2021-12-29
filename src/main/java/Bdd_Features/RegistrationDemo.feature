Feature: User can register an account
Scenario: To verify whether user can perfrom registration
Given User can access the registration form
When User enters all the details
|firstname|lastname|email|Mobile|Company|City|JobTitle|
|Prabhat|Tavag|Prabhat.Tavag@gmail.com|LTI Infotech|Ghansoli|Senior QA|
Then User can register sucessfully
