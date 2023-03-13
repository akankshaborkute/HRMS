  Feature: youtube search

 Scenario: search in youtube
    Given User lauches browser
    And User enters url "https://www.youtube.com/"
    When User enters "tarak mantra"
    Then User clicks on search button
    Then User plays song
     #And User closes the browser