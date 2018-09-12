#Author: atrujillo@choucairtesting.com
@Challenge3
Feature: Third ScreenPlay challenge

Scenario Outline: Register a doctor

  Given that carlos needs to register a new doctor
  When he makes the registration in the hospital administration application
  | FirstNames    | LastNames   | Phone   | IdType    | Id    |
  | <FirstNames>  | <LastNames> | <Phone> | <IdType>  | <Id>  |
  Then he verifies that the system shows the message "Datos guardados correctamente"

  Examples:
    | FirstNames  | LastNames     | Phone   | IdType                  | Id        |
    | Diana       | Soto Alvarez  | 3553434 | Cédula de ciudadanía    | 104323122 |
    | Diana       | Soto Alvarez  | 3553434 | Cédula de extrangería   | 104323123 |


  Given that carlos needs to register a new patient
  When he makes the registration in the hospital administration application

    | FirstNames    | LastNames   | Phone   | IdType    | Id    |
    | <FirstNames>  | <LastNames> | <Phone> | <IdType>  | <Id>  |
  Then he verifies that the system shows the message "Datos guardados correctamente"

  Examples:
    | FirstNames  | LastNames     | Phone   | IdType                  | Id        |
    | Diana       | Soto Alvarez  | 3553434 | Cédula de ciudadanía    | 104323122 |
    | Diana       | Soto Alvarez  | 3553434 | Cédula de extrangería   | 104323123 |