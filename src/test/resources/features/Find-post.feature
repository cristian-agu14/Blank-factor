Feature: BlanckFactor Page

  @Find-a-post-by-post-name
  Scenario Outline: Find a post by post name on the posts list
    Given the user goes to blanckFactor page
    When the user goes to blog page
    And the user search a post called <postName>
    Then he should see the current url is <url>
    But the user goes to blog page
    And the user prints all the posts names

    Examples:
      | postName                                      | url                                                             |
      | Why Fintech in Latin America Is Having a Boom | https://blankfactor.com/insights/blog/fintech-in-latin-america/ |

  @Subscribe-to-the-newsletter
  Scenario Outline: Subscribe to the newsletter using the subscribe form
    Given the user goes to blanckFactor page
    When the user goes to blog page
    And the user subscribes to newsletter using the email <email>
    Then the user sees the confirmation message
    Examples:
      | email                        |
      | blanckfactortest50@gmail.com |
