Feature: F04_Checkout | users could remove products and go to Checkout

  Scenario Outline: user could add number of products to card
    #Given Open the browser and goto "https://www.saucedemo.com/"
    When user login with valid "standard_user" and "secret_sauce"
    And Press on Login button
    Then User go to product page
    And Add 5 product to the cart
    And go to the cart
    And remove 2 product from the cart
    Then go to checkout page
    When User check "<First name>" ,"<Last name>" and "<Zip Code>"
    Then Finally user press on Continue button and Finish
    Examples:
      |         First name        |      Last name       |      Zip Code     |
      |  Abdallah                 |  Hassan              |  12345            |
      |  12345678900              |  123456789           |  code             |