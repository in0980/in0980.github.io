Feature: Sextou?
  Todo mundo se prepara para este momento, e espera ansiosamente.

  Scenario: Quinta não é sexta
    Given today is Thursday
    When I ask whether it's Friday yet
    Then I should be told "Nope"

  Scenario: Sexta é sexta
    Given today is Friday
    When I ask whether it's Friday yet
    Then I should be told "Sextou"