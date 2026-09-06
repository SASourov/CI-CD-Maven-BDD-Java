Feature: CiCd Practice
  Background:
    Given user open url

    Scenario: Signup Functionality
      When user click signup menu
      And user input name
      And user input mail address
      Then click signup button
