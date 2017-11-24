Feature: Hear Shout

  Shouts have a range of approximately 1000m

  Scenario: In range shout is heard
    Given Lucy is at 0, 0
    And Sean is at 0, 900
    When Sean shouts
    Then Lucy should hear Sean

  Scenario: Out of range shout is not heard
    Given Lucy is at 0, 0
    And Sean is at 800, 800
    # This means Sean is approximately 1130m from Lucy
    When Sean shouts
    Then Lucy should hear nothing
