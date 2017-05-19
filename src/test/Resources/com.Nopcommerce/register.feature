@test
  Feature: User should able to register successfully
    Scenario: User can register with valid credentials
      Given User is on homepage
      When User enters all valid detaild for registration
      Then User should able to register successfully