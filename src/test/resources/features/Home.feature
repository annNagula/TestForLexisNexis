Feature: Access Home Page
As a user, I should be able to access Home Page
  @suite
  Scenario Outline: Access Home page
    Given I navigate to LexisNexis home page
    Then Im on "LexisNexis Risk Solutions | Transform Your Risk Decision Making" page
    When I see the cookies pop-up accepts cookies
    Then I see Cookies pop-up should be closed
    And I see "<heading>" and click
    Then Im on "<pageTitle>" page

  Examples:
    | heading                          | pageTitle                                                 |
    | Financial Services               | Financial Services \| LexisNexis Risk Solutions           |
    | Insurance                        | Insurance                                                 |
    | Life and Pensions                | Life and Pensions \| LexisNexis Risk Solutions            |
    | Corporations and Non-Profits     | Corporations and Non-Profits \| LexisNexis Risk Solutions |

  @suite
  Scenario Outline: Access Home page
    Given I navigate to LexisNexis home page
    Then Im on "LexisNexis Risk Solutions | Transform Your Risk Decision Making" page
    When I see the cookies pop-up accepts cookies
    Then I see Cookies pop-up should be closed
    Given I click on Choose your Industry option
    Given I choose Financial services option
    And I see the "<option>" and click
    Then Im on "<pageTitles>" page

    Examples:
      | option                           | pageTitles                                                       |
      | Financial Crime Compliance       | Financial Crime Compliance \| LexisNexis Risk Solutions          |
      | Fraud and Identity Management    | Fraud and Identity Management \| LexisNexis Risk Solutions       |
      | Customer Data Management         | Customer Data Management \| LexisNexis Risk Solutions            |
      | Credit Risk Assessment           | Credit Risk Assessment \| LexisNexis Risk Solutions              |
      | Collections and Recovery         | Collections and Recovery \| LexisNexis Risk Solutions            |
      | Investigations and Due Diligence | Investigations and Due Diligence \| LexisNexis Risk Solutions    |
      | Risk Orchestration               | Risk Orchestration \| LexisNexis Risk Solutions                  |
