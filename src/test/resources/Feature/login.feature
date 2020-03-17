Feature: To validate the login functionality

  Scenario: To verify whether the user can able to login with valid user name and valid password
    Given User has to be in the login
    When User has to enter user name,password and click the login button
    |sridhar|98765|
    |sampath|12345678456789|
    Then User has to find error page

