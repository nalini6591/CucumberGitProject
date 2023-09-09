

Feature: LR Entry
  
  Scenario Outline: Save LR Entry
     Given User Launch Chrome Browser
    When User Open URL "http://103.224.243.180/"
    And user enter UserId "<userid>" and  Pass as  "1"
    And click on Login button
    Then Page title should be "Welcome to Webtrans"
    And Department "<dept>" and Branch "<Branch_Name>" and Fin_Year "<Fin_Yr>"
    And click on Submit button
    Then Page title should be	"Welcome To CTS Express Logistics Pvt. Ltd"
    When User Click on Options Menu
    And User Click On NEW Menu
    And User Click On LR Entry Page
    Then LR Entry Form will open
    And Validate is it "Create Or Modify GC" 
    And Validate Gc No Enable or Disable
    And Create Date Enable or Disable
    When User Enter LR Entry fields as  "<Gc_Type>" and  "<Coll_type>" and  "<Cons>" and  "<To_City>"and  "<con>" and  "<Del_Type"> and "<To_Br>" and "<Gc_PayableBy>"
    And  Click On Add Item
    Then Item Fields are open
    When User Enter "<item_type" and "<Pack_type" and "<Qty>" and "<wt>" and "<chrg_wt>" and "<units>" and "<rate>" and "<inv_no>" and "<inv_value>" and "<ewaybill>"
   And Click on Apply Rtae
   And Save Entry
   Then Save Entry Msg will appear "GC Entry Save Status"
   And Click On Ok.
   And Close Browser
    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
