Feature: F03_Card | users could remove and Checkout

  Scenario: user could add number of products to card
    #Given Open the browser and goto "https://www.saucedemo.com/"
    When user login with valid "standard_user" and "secret_sauce"
    And Press on Login button
    Then User go to product page
    And Add 5 product to the cart
    And go to the cart
    And remove 2 product from the cart
    Then go to checkout page