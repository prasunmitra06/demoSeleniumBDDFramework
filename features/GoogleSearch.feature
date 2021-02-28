@UATTesting
Feature: Number validations of Employees, Offices, Licensees, Jurisdictions
  Scenario: Number of validations through homepage aboutus button
    Given Open Chrome browser and enter Playtech url
    When Select day, month and year in legal page and enter Site 
    Then Home page will be displayed 
    When Click About Us button in home page 
    Then About Us page will be opened 
    When Check Number of Employees Tiles 
    Then Number of Employees will be displayed 
    When Check Number of Countries Playtech Offices Tiles 
    Then Number of Playtech Offices will be displayed 
    When Check Number of Global licensees Tiles 
    Then Number of Global licensees will be displayed 
    When Check Number of Regulated Jurisdictions Tiles 
    Then Number of Regulated Jurisdictions will be displayed and close browser 
    
  Scenario: Number of validations through footer about us link
    Given Open 2nd time Chrome browser and enter Playtech url
    When Select day, month and year in legal page and enter Site 
    Then Home page will be displayed 
    When Click About Us button in home page footer 
    Then About Us page will be opened 
    When Check Number of Employees Tiles 
    Then Number of Employees will be displayed 
    When Check Number of Countries Playtech Offices Tiles 
    Then Number of Playtech Offices will be displayed 
    When Check Number of Global licensees Tiles 
    Then Number of Global licensees will be displayed 
    When Check Number of Regulated Jurisdictions Tiles 
    Then Number of Regulated Jurisdictions will be displayed and close browser