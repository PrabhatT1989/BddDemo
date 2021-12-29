Feature: buy now option

Background: 
Given Access phptravels website
When select a product and click on buy now option
Then enter details 

Scenario: To verify whether user can buy a product
Given Acess website
When click on Confirm Order button
Then System should redirect the user to payment gateway page
  