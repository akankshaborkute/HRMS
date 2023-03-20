  Feature: youtube search

 Scenario: search in youtube
    Given User lauches browser
    And User enters url "https://www.youtube.com/"
    When User enters "tara ram pam"
    Then User clicks on search button
    Then User plays song
     #And User closes the browser