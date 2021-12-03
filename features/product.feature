@Automobile
Feature: Send Product Data form

  Background:
    Given the user selected the Automobile Insurance menu
    And the user is in the Vehicle Data Form
    And the user submits Vehicle Form correctly
      | make        | Porsche    |
      | performance | 125        |
      | date        | 11/30/2021 |
      | number      | 4          |
      | type        | Gas        |
      | price       | 100000     |
      | mileage     | 200        |
    And the user presses the Next button in the Vehicle Page
    And the user is sent to the Insurant Data form
    And the user submits Insurant Form correctly
      | firstName   | Daenerys     |
      | lastName    | Targaryen    |
      | birthDate   | 04/15/2000   |
      | country     | Morocco      |
      | zipcode     | 1234         |
      | occupation  | Selfemployed |
      | hobbies     | Skydiving    |
    And the user presses the Next button in the Insurant Page

  Scenario: TC003 - Send Product Data form for automobile product
    And the user is sent to the Product Data form
    And the user submits Product Form correctly
      | startDate   | 01/03/2022              |
      | sum         | 7000000                 |
      | merit       | Bonus 3                 |
      | damage      | Partial Coverage        |
      | optional    | Legal Defense Insurance |
      | courtesy    | Yes                     |
    And the user presses the Next button in the Product Page