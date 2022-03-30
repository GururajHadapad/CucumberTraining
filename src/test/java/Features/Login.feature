Feature: Login module

@Regression
Scenario: User will login to application using valid credentials
And I will enter the URL
When Loginpage is displayed i will enter the valid username and password
And I will click on the login button
Then I will verify homepage is displayed or not

@Regression 
Scenario: User will login to application using invalidvalid credentials
And I will enter the URL
When Loginpage is displayed i will enter the invalid username and invalid password
And I will click on the login button
Then I will verify error message is displayed or not