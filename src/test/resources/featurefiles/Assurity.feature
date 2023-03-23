Feature: Automate API test

  Scenario Outline: Verify the response of the API
    When User performs a GET call on the API "<url>"
    Then User verifies the name as "<name>"
    And The CanRelist is "<true/false>"
    And The promotions element with name Gallery has a description "<description>"
    Examples:
      | url                                                         | name           | true/false | description               |
      | https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json | Carbon credits | true       | Good position in category |