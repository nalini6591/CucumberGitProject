
Feature: Login
  @sanity
  Scenario: Successsfully login with valid credential
    Given User Launch Chrome Browser
    When User Open URL "http://178.63.40.241:2131/"
    And user enter unmae as "RCPL" and  pwd as  "rcplwebit1"
    And click on Login button
    Then Page title should be "WebTrans"
    When User Select Branch as "FURSUNGI"
    And Select Fin_Yr as "2023-2024"
    And Click on Submit Button.
    And Close Broswer