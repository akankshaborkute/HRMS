Feature: Login into Monster


  Scenario: Log in functionality validation
    Given User lauches browser
    And User enters url "https://www.foundit.in/"
    And User press on Loginlink_first
    When User enters "akanksha.borkute@gmail.com" and  "jesus1"
    Then User clicks on login2 button