Feature: Free CRM Login Feature

  Scenario Outline: Free CRM Login Test Scenario

    Given user visits website
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user is on home page
    Then Close the browser


    Examples:
      | username                   | password |
      | username  | password |