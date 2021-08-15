Feature: Create Lead in LeafTaps application

#Background:
#Given Open the chrome browser
#And Load the application url 'http://leaftaps.com/opentaps/control/main'

@regression
Scenario: Create lead with mandatory informations
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on login button
Then Homepage should be displayed
When Click on 'CRM' link
Then 'MyHome' Page should be displayed
When Click on 'Leads' link
Then 'MyLeads' Page should be displayed
When Click on 'Create Lead' link
Then 'Create Lead' page should be displayed
#Given Enter the Company name as 'Testleaf'
#And Enter the FirstName as 'Hari'
#And Enter the LastName as 'R'
#When Click on Create Lead button
#Then New Lead should be created