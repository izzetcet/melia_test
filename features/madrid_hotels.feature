
Feature: melia_find_madrid_test

  @find_madrid
Scenario: TestScenario
  Given open the webpage
  And click cookies agree button
  When send "madrid" in the search box
  And click select dates
  And select date of enter and date of exit
  And Click buscar botton
  Then verify text is displayed
