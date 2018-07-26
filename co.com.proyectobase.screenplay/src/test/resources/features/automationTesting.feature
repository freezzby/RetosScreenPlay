#Author: atrujillo@choucairtesting.com
@Challenge1
Feature: First ScreenPlay challenge


  @Register
  Scenario Outline: Register on the Automation Demo Site
    Given that Carlos wants to access the Web Automation Demo Site
    When he registers in the site
    |	FirstName		|	LastName		|	Address				|	Email									|	Phone		|	Gender		|	Hobbies		|	Languages				|	Skills		| Country 	| SelectCountry	|	BirthYear	|	BirthMonth	|	BirthDay	|	Password	|
    |	<FirstName>	|	<LastName>	|	<Address>			|	<Email>								|	<Phone>	|	<Gender>	|	<Hobbies>	|	<Languages>			|	<Skills>	| <Country> | <SelectCountry>	|	<BirthYear>	|	<BirthMonth>	|	<BirthDay>	|	<Password>	|
    Then he verifies that the screen loads with text Double Click on Edit Icon to EDIT the Table Row

    Examples: 
    |	FirstName	|	LastName	|	Address				|	Email									|	Phone		|	Gender	|	Hobbies	|	Languages				|	Skills	| Country 	| SelectCountry	|	BirthYear	|	BirthMonth	|	BirthDay	|	Password	|  
    | Alejandro	|	Trujillo	| cll falsa 123	|	correofalso@gmail.com	|	5558989	|	Male		|	Movies,Hockey	|	English,Spanish	| C++			| Colombia	|	India					|	1990			|	August			|	12				|	pass1234F	|