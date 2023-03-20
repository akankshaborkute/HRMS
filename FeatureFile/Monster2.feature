  Feature: Searching job
  Scenario: Searching functionality verification
    Given User lauches browser
    And User enters url "https://www.foundit.in/"
    And User press on Loginlink_first
    When User enters "akanksha.borkute@gmail.com" and  "jesus1"
    Then User clicks on login2 button
    Then User search BY JOB title  "Doctor"
    And User enters location "Delhi"
    And User enters experiance
    Then User clicks on Search button