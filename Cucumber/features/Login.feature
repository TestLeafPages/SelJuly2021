Feature: Login functionality of LeafTaps


Background:
Given Open the chrome browser
And Load the application url 'http://leaftaps.com/opentaps/control/main'



#scenario1
Scenario Outline: Login with positive credentials
Given Enter the username as <username>
And Enter the password as <password>
When Click on login button
Then Homepage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|


#scenario2
Scenario: Login with negative credentials
And Enter the username as 'Demo123!'
And Enter the password as 'crmsfa'
When Click on login button
But Error message should be displayed

