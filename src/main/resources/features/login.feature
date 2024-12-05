@LoginTest
Feature: Login function

  Scenario: user can login using valid credential
    Given user open Vconnct website
    When user add valid user email
    And user add valid password
    And user clicks on sign in button
    Then user is logged in to the vconnct