Feature: Passing arguments with gherkin


  Scenario: Passing simple arguments
    Given I start an scenario
    When I fill my credentials object with user Perico and password 1234
    Then I say goodbye


  Scenario: Passing arguments through DataTable using lists
    Given I start an scenario
    When I fill my Credentials objects using lists
      | user    | password |
      | Perico  | 1234     |
      | Alfredo | miPass   |
    Then I say goodbye


  Scenario: Passing arguments through DataTable using maps
    Given I start an scenario
    When I fill my Credentials objects using maps
      | user    | password |
      | Perico  | 1234     |
      | Alfredo | miPass   |
    Then I say goodbye