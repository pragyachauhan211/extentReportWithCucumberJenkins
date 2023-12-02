@browserstack
Feature: basic launch browser

  @basic
  Scenario: To check if error message is showing
    Given To check if error message is showing and for that,
    Given hit the url
    Given maximize it
    When enter username
    And and enter password
    Then error should come
    Then close the browser

  @basic
  Scenario: launch browser
    Given To check launching of browser and for that,
    Given hit the url
    Given maximize it
    Then close the browser
