Feature: MyHomeTestGherkin

  Scenario: 01 Missing data entered
    Given I open main page
    When the user does not enter data in the username and password fields
    And presses the Login button
    Then the user receives the error message

  Scenario Outline: Enter on the LogoPage username & password
    Given I open main page
    When the user enter wrong in the "<username>"
    And "<password>" fields
    Then the result should be Error
    Examples:
      | username | password    |
      | Lara     | 12345       |
      | 00000    | 1234        |
      | Petia    | 00000000000 |







