Feature: Authorization Action

  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User closes Add popup
    And User Navigate to Register Page
    And User enters Credentials to Register
      | Infinity Team | infinity-new@mail.com | aitu123456 |
    Then Message displayed Login Successfully

  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User closes Add popup
    And User Navigate to Login Page
    And User enters Credentials to Login
      | infinity@mail.com | aitu123456 |
    Then Message displayed Login Successfully

  Scenario: Failed Login with Valid Credentials
    Given User is on Home Page
    When User closes Add popup
    And User Navigate to Login Page
    And User enters Credentials to Login
      | infinity-fail@mail.com | aitu123456 |
    Then Message displayed Login Failed

  Scenario: Successful Logout
    Given User is on Home Page
    When User closes Add popup
    And User Navigate to Login Page
    And User enters Credentials to Login
      | infinity@mail.com | aitu123456 |
    And User opens userDropdown
    And User Logout from the Application
    Then Message displayed Logout Successfully