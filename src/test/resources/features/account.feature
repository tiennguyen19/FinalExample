Feature: Credit, Debit, Transfer
  Background:
    Given create user A with "01" and "Use A" and create user B with "02" and "User B"
    And user A: credit 200 USD
    And user B: credit 300 USD


    Scenario:
      When user A debit 125 USD
      And user B transfer 50 USD to userA
      Then check balance user A
      And the balance is 125 USD
      Then check balance user B
      And the balance is 250 USD

    Scenario:
      When user A debit 300 USD
      Then the balance is not enough


