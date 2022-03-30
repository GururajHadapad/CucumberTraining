Feature: organization module

Background:

And I will enter the URL "http://localhost:8888/"
And In Loginpage i will enter username "admin" and password "admin"
And Click on login button
When In Homepage click on organization link

@Regression
Scenario: As a user i will login to application and create a organization
And In create organization page i will click on create organization image
And I will enter organization name as "TCS" and click on save button
Then I will verify Organization "TCS" is created or not

@smoke
Scenario Outline: As a user i will login to application and create Multiple organization organization
And In create organization page i will click on create organization image
And I will enter organization name as "<OrganizationName>" 
And i will choose Industry type as "<IndustryType>"
And I will verify organization is created with "<OrganizationName>" and "<IndustryType>"

Examples:
|OrganizationName|IndustryType|
|Google					 |Insurance		|
|Ajio						 |Shipping		|
|Pintrest				 |Media       |
