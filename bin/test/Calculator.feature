
Feature: Arithmetic operations on numbers
  I want to use this feature file for basic arithmetic operation

  Scenario: Add two numbers
    Given user enters the values <operand1> and <operand2>
    When adding entered numbers
    Then the result should be <total>

    Examples: 
      | operand1  | operand2 | total  |
      | 10        |  10      | 20     |


  Scenario: Subtract two numbers
    Given user enters the values <operand1> and <operand2>
    When subtracting entered numbers
    Then the result should be <total>

    Examples: 
      | operand1  | operand2 | total  |
      | 10        |  5       | 5      |


  Scenario: Multiply two numbers
    Given user enters the values <operand1> and <operand2>
    When multiplying entered numbers
    Then the result should be <total>

    Examples: 
      | operand1  | operand2 | total  |
      | 10        | 10       | 100    |      


  Scenario: Divide two numbers
    Given user enters the values <operand1> and <operand2>
    When dividing entered numbers
    Then the result should be <total>

    Examples: 
      | operand1  | operand2 | total  |
      | 10        | 2        | 5      |


  Scenario: Dividing by zero
    Given user enters the values <operand1> and <operand2>
    When division is requested with divide by zero
    Then the operation leads to exception

    Examples: 
      | operand1  | operand2 | total  |
      | 15        |  0       |   0    |

      
  Scenario: Incorrect Result
    Given user enters the values <operand1> and <operand2>
    When multiplication is requested
    Then multiplication result is incorrect

    Examples: 
      | operand1  | operand2 | total  |
      | 10        | 10       | 50     |