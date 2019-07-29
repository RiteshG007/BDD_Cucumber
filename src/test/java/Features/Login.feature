Feature: Valid login functionality

* url = "http://localhost:100";
#Background: 


Scenario Outline: User should be login successfully with valid credentials
Given User should on login page
When User enter valid user id "<username>" and valid password "<password>"
Then User will be landed on home page
And Logout link should be visible on home page
And Run multiple time
|TestData1| TestData2|
|abc|xyz|
|abc|xyz|

Examples:
|username|password|
|admin   |admin   |


