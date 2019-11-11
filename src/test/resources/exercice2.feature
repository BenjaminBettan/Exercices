Feature: Exercice 2

#

  Scenario Outline: exo 2
    Given j ai des inputs <cost> <quantity> <solde>
    Then si je dois maximiser les achats je dois obtenir : <answer> produits

  Examples:
    | cost            | quantity           | solde | answer |
    | "1,2,3"         | "10,10,10"         | 30    |  20    |
    | "2,4,10"        | "7,3,13"           | 30    |  10    |
    | "1,2,3"         | "10,10,10"         | 100   |  30    |
    