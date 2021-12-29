@SmokeTest @RegressionTest
Feature: Login as user and logouts

Scenario: Verify whether user can signin  and  signout
Given Access the website
When Enter credentials
And click on several links
Then Logout of the application


@RegressionTest
Scenario: To verify forgot password link
Given Access forgot password page

When Enter username and click on Reset button
Then System should display acknowledgement message




