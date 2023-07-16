# // Exercise01
Feature: test web browser
  Background: open a web browser
    Given open a web browser
  Scenario: user cant see images related to “panda”
    Given navigated to Google
    When enter “panda” in the search bar
    And clicks on the “Images” of Google
    Then images related to “panda” are shown

