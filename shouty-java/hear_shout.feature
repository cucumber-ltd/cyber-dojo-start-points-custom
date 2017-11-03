Feature: Hearing a shout

    Shouts have a range of approximately 1000 metres

    Scenario: In range shout is heard
        Given Lucy is at 0, 0
        And Sean is at 0, 900
        When Sean shouts
        Then Lucy should hear him

      Scenario: Out of range shout is not heard
        Given Lucy is at 0, 0
        And Sean is at 800, 800
        When Sean shouts
        Then Lucy should hear nothing
