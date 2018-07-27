#Author: atrujill@bancolombia.com.co
@Regresion
Feature: Google Translate
  As a web user
  I want to use  Google Translate
  to translate words between diferent languages

  @traducir
  Scenario: Translate from source language to target language
    Given that Raga wants to use Google Translate
    When he translates the word table from english to spanish
    Then he should se the word mesa on the screen
