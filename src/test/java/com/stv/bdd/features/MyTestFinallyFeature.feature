Feature: MyFinallyTest
  Scenario: 01 Click Servises Link and Find Available Bookstore SOAP services
    Given I open main page
    When I click on the Services
    Then open the page with text Available Bookstore SOAP services


  Scenario: 02 On the open page, scroll to Bookstore services
    Given Open service page
    When Find Available Bookstore SOAP services
    Then Scroll to Bookstore services

  Scenario: 03 Once Bookstore services is found I scroll to the top of the page
    Given Open service page again
    When Find Bookstore services
    Then Scroll to the top of the page

Scenario: 04 Open the  main page and click on the Admin Page link
          and find the test Administration on the opened page
  Given I open Main page
  When I click on the Admin Page
  Then Find the test Administration on the opened page