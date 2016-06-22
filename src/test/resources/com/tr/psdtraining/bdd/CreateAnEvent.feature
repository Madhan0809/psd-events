Feature: Create an Event

  @event
  Scenario Outline: Creating an Event
    Given I go to Event creation page
    When I see the "New Events" form
    And I type the "<Location>", "<Time>" and "<LocationDetails>"
    And I click on Submit button
    Then I should navigate to the "Current Events" page

    Examples:
      | Location | Time     | LocationDetails |
      | Nandos   | 12:00 PM | Canary Whary    |
      | KFC      | 12:00 PM | Canary Whary    |
      | Byron    | 13:00 PM | Canary Whary    |

