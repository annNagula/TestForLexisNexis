Feature: Login
As a user, I should be able to login to VSIP service
  @suite
  Scenario Outline: Access DPS homepage
    Given I navigate to DPS service
    And Im on "HMPPS Digital Services - Sign in" page
    And I enter "<userName>"
    And I enter the "<password>"
    And click on submit button
    Then Im on "Home - Digital Prison Services" page
    And I sign out of the service

    Examples:
      | userName                    | password                   |
      | VSIP1_TST                   | Unitedstatesofamerica10    |

