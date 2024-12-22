Feature: F02_Product | users could add number of products to card

  Scenario: user could add number of products to card
    #Given Open the browser and goto "https://www.saucedemo.com/"
    When user login with valid "standard_user" and "secret_sauce"
    And Press on Login button
    Then User go to product page
    And Add 3 product to the cart