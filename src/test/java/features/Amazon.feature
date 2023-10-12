#Feature: Amazon.com
#  Scenario: Amazon.com adding product
#    Given user is on home page
#    When click accept cookies
#    And click the search button
#    And write product name
#    And click search button
#    And filter for Shipped by Amazon
#    And filter for Appel
#    And click the first product
#    And add to cart
#    Then check at cart page
Feature: Amazon.com
  Scenario: Amazon.com Adding Product
    Given User is on homepage
    When Click accept cookies
    When Click the search button
    When Write product name
    When Click search button
    When Filter for Shipped by Amazon
    When Filter for Apple
    When Click the first product
    When Add to Cart
    When Check at cart page