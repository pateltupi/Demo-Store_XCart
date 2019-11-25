@sale
  Feature: Sale feature
    As a user I want to  explore product
  Scenario: User should click on product on sale department
    Given I am on Home page
    And   I hover on hotdeals and see dropdown list
    When  I click on sale  i see product
    And   I click on StarTrek product
    Then  I see product description