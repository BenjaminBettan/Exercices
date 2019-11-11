Feature: Exercice 1

#

  Scenario Outline: exo 1
    Given je cherche <input>
    Then apres elimination des doublons en incrementant de un je trouve : <answer>

  Examples:
    | input           | answer |
    | "1,2,3,4"       |  10    |
    | "1,2,2,4"       |  10    |
    | "0,1,2,3,4"     |  10    |
    | "1,2,2,5"       |  11    |
    | "1,2,2,2"       |  10    |
    | "1,3,3,3"       |  13    |
    | "1,4,2,4"       |  12    |
