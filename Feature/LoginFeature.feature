Feature: Login

@sanity
Scenario: Successful login with valid credential

Given User should launch chrome browser
When User open URL "https://admin-demo.nopcommerce.com/login"
And User enters Email "admin@yourstore.com" and password "admin"
And click on login
Then Page title should be "Dashboard / nopCommerce administration"
When User click on logout 
Then Page title should be "Your store. Login"
And Close browser

@regression
Scenario Outline: Successful login with valid credential DDT

Given User should launch chrome browser
When User open URL "https://admin-demo.nopcommerce.com/login"
And User enters Email "<email>" and password "<password>"
And click on login
Then Page title should be "Dashboard / nopCommerce administration"
When User click on logout 
Then Page title should be "Your store. Login"
And Close browser

Examples: 
|email|password|
|admin@yourstore.com|admin|
|Test@yourstore.com|admin|