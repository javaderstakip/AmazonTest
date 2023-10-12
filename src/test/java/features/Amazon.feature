Feature: Amazon.com
  Scenario: Amazon.com adding product
    Given user is on home page
    When click accept cookies
    And click the search button
    And write product name
    And click search button
    And filter for Shipped by Amazon
    And filter for Appel
    And click the first product
    And add to cart
    Then check at cart page
