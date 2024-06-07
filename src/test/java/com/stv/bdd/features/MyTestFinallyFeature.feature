Feature: MyFinallyTest

  Scenario: 01 Click Servises Link and Find Available Bookstore SOAP services
    Given I open main page
    When I click on the Services
    Then open the page with text Available Bookstore SOAP services

  Scenario: 02 On the open page, scroll to Bookstore services
    Given I open main page
    When I click on the Services
    And Find Available Bookstore SOAP services
    Then Scroll to Bookstore services

  Scenario: 03 Found Bookstore services.Scroll to the top
    Given I open main page
    When I click on the Services
    And Scroll to Bookstore services
    Then Scroll to the top of the page

  Scenario: 04 Open main page, click AdminPage link
    Given I open main page
    When I click on the Admin Page
    Then Find the test Administration on the opened page