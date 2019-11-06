Feature: Perform Multiple User Login
Scenario Outline:  Use DataTable for TestMeApp
Behavior of the scenario
Given The URL of the TestMeApp "http://10.232.237.143:443/TestMeApp/login.htm"
When User enters <username> as <usertype> username
And User enters <password> as password
And User clicks on login button
Then User is in valid page

Examples:
|username|password|usertype|
|lalitha|Password123|user|
|john123|abc123|user|






