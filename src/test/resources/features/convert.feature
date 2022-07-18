Feature: Chuyen doi nhiet do C va F

  Scenario Outline: Do F sang do C
    Given a calculator
    And user input <input>
    When user click button F=>C
    Then result is <result>

    Examples:
      | input  | result  |
      | 3.445  | -15.863 |
      | -10.56 | -23.644 |
      | 0      | -17.777 |
      | 100    | 37.777  |


  Scenario Outline: Do C sang do F
    Given a calculator
    And user input <input>
    When user click button C=>F
    Then result is <result>

    Examples:
      | input  | result |
      | 3.445  | 38.201 |
      | -10.56 | 12.992 |
      | 0      | 32     |
      | 100    | 212    |