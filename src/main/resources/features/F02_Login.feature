Feature: F02_Login | users could use login functionality to use their accounts

  Scenario: user could login with valid email and password
    #Given Open the browser and goto "https://www.saucedemo.com/"
  When user login with valid "standard_user" and "secret_sauce"
    And Press on Login button
      Then User go to product page
  @smoke
  Scenario Outline: user could not login with Invalid email and password
    #Given Open the browser and goto "https://www.saucedemo.com/"
    When user login with Invalid "<username>" and "<password>"
    And Press on Login button
    Then User can not go to product page
    Examples:
      | username        | password      |
      | invalid_user    | secret_sauce  |
      | standard_user   | wrong_pass    |
      | empty_user      | empty_pass    |

