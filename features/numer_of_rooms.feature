Feature:  Get the number of rooms listed
@number_of_rooms
  Scenario: Number of rooms
    Given open the webpage
    And click cookies agree button
    Then verify if number of rooms equals 18