Feature: Checking Login functionality of the application

Scenario: Checking Login functionality with valid login credentials
Given user is on Login Page
Then user enters username in  username textfield
Then user enters password in password textfield
Then user click on the Login button
Then user is on HomePage


#Feature: Checking Login functionality of the application

#  Scenario Outline: Checking Login functionality with valid login credentials
#    Given user is on Login Page
#    When enters the username "<username>" and enter the password "<password>"
#    And click on the Login button
#    Examples:
#    | standard_user | secret_sauce |
#    | problem_user  | secret_sauce |

 # Scenario Outline: Checking Login functionality with Invalid login credentials
    #Given user is on Login Page
    #When enters the username "<username1>" and enter the password "<password1>"
    #And click on the Login button
    #Examples:
    #  | username1       | password1    |
     # | standard_user1  | secret_sauce |
      #| problem         | secret_sauce |
      #| locked_out_user | secret_sauce |
#@smoke
 # Scenario Outline: Checking Logout functionality
  #  Given user is on Login Page
   # When enters the username "<username>" and enter the password "<password>"
    #And click on the Login button
    #Then Click on menu and then click on logout button
    #Examples:
     # | username      | password     |
      #| standard_user | secret_sauce |
      #| problem_user  | secret_sauce |











