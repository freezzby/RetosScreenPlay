#Author: atrujillo@choucairtesting.com
@Challenge2
Feature: Second ScreenPlay challenge


  @AddEmployee
  Scenario Outline: Add an employee with oreange HRM
    Given that Juan needs to create an employee on orangeHR
    When he registers an employee on orangeHR
      | FirstName     | MiddleName  | LastName    | Location   |  DateOfBirth |  MaritalStatus  | Gender | Nationality | DriverLicense          | LicenseExpiration     | Race      | BloodGroup    | Hobbies |
      | <FirstName>  | <MiddleName> | <LastName>  | <Location> | <DateOfBirth>| <MaritalStatus> |  <Gender> | <Nationality> | <DriverLicense>   | <LicenseExpiration>   | <Race>    | <BloodGroup>  | <Hobbies>|
    Then he sees the new employee on orangeHR
    Examples:
      | FirstName | MiddleName | LastName |     Location            | DateOfBirth |  MaritalStatus  | Gender | Nationality | DriverLicense  | LicenseExpiration | Race  | BloodGroup    | Hobbies   |
      |   Juan    |   Camilo   | Cardona  | Australian Regional HQ  | 1995-12-12  |  Single         |  Female  |            Afghan    | 23278712      | 2020-02-02        | White |   A           | Travelling, Reading, Hunting and Sketching    |