@bug_check
@regression
Feature: this feature does the regression check for bug no 12345

  Scenario Outline: Check if bug no 12345 haven't reoccurred
    Given I search on <url> for <keywords>
    When I get the search results
    Then I should find the answer "<answer>" among the search result

    Examples:
      | keywords                       | answer                              |url                       |
      | Selenium                       | Auotmation                          |https://www.google.com    |