@smoke
  Feature: New account feature
    As a user I want to sign up new account
    Scenario: User should click on sign up new account
      Given I am on Home page
      When  I click on sign up button
      And   I click on creat new button
      And   I send email"cart@yahoo,com" to email field
      And   I send password"abc123" to password field
      And   I send text"abc123" to confirm password field
      And   I click on creat button
      Then  I am at sign up page


