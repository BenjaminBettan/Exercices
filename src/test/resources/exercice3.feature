Feature: Exercice 3

#

  Scenario Outline: exo 3
    Given j ai les inputs <dict>
    Then Resolution : <answer>

  Examples:
    | dict                  | answer |
    | "a,aa,baa,cbaa"       |  4     |
    | "a,aa,bba,cbaa"       |  2     |
    | "a,aa,baa,caaa"       |  3     |
    | "a,bb,ccc,dddd"       |  1     |
    