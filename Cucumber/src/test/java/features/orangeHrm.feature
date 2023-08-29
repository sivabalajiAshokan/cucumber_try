  Feature: OrangeHrm App Testing
 
 Scenario: orangeHrm 
 
    Given Get Url 
    And Input UserName From Username Input Feield
    And Input Password From Password Field
    And Click The Login Button
    And Click The Pim Menu
    And Add Emplayee Details Menu Click 
    And Input The Value In Firstname 
    And Input The Middlename in Middlename field
    And Input The Lastname In Lastname field
    Then Click The Save Button And Navigate To Main Menu   
