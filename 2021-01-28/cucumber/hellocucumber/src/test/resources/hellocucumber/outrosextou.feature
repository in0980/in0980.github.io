Feature: Outra forma de Sextou?
  Todo mundo se prepara para este momento, e espera ansiosamente.

  Scenario: Hoje é sexta ou não é?
    Given today is "<day>"
    When I ask whether it's Friday yet
    Then I should be told "<answer>"

  Examples: 
    | day       |   answer  |
    | Friday    |   Sextou  |
    | Sunday    |   Nope  |
    | Tuesday    |   Nope  |