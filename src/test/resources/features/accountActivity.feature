@wip
Feature:

  Background:
    Given The user is on the login page
    When The user enters with "username" and "password" credentials


  Scenario: The user should be able to see following menu
    And  The user selects the "Account Activity" menu

    Then The user should be able to see as a page header "Zero - Account Activity"
    And  The default option in the Account menu should be "Savings"
#
#  Scenario Outline:
#    And The account menu should also contain the following "<Options>"
#    Examples:
#      | Options     |
#      | Savings     |
#      | Checking    |
#      | Savings     |
#      | Loan        |
#      | Credit Card |
#      | Brokerage   |
#
#  Scenario Outline:
#    Then The user should be able to see "<TransactionsTableHeaders>" with <TransactionTableLocNumber>
#    Examples:
#      | TransactionsTableHeaders | TransactionTableLocNumber |
#      | Date                     | 1                         |
#      | Description              | 2                         |
#      | Deposit                  | 3                         |
#      | Withdrawal               | 4                         |











