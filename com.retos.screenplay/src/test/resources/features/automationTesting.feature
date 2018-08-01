#Author: atrujillo@choucairtesting.com
@Challenge1
Feature: First ScreenPlay challenge


  @Register
  Scenario Template: Register on Automation test site
    Given that Carlos wants to access the Web Automation Demo Site
    When he registers in the site
    |	FirstName		|	LastName	|	Address		|	Email	|	Phone		|	Gender		|	Hobbies		|	Languages		|	Skills		| FirstCountry 	| SecondCountry	    |	BirthYear	|	BirthMonth	    |	BirthDay	|	Password	|               EditText              |
    |	<FirstName>	    |	<LastName>	|	<Address>	|	<Email>	|	<Phone>	    |	<Gender>	|	<Hobbies>	|	<Languages>		|	<Skills>	| <FirstCountry> | <SecondCountry>	|	<BirthYear>	|	<BirthMonth>	|	<BirthDay>	|	<Password>	|               <EditText>              |
    Then he verifies that the screen loads with text <EditText>

    Examples: 
    |	FirstName	|	LastName	|	Address		    |	Email					|	Phone		|	Gender	    |	Hobbies	        |	Languages			|	Skills	    | FirstCountry 	| SecondCountry |	BirthYear	|	BirthMonth	|	BirthDay	|	Password	|                        EditText                       |
    | Alejandro	    |	Trujillo	| cll falsa 123	    |	correofalso@gmail.com	|	5558989321	|	Male		|	Movies,Hockey	|	English,Spanish	    | C++			| Colombia	    |	India       |	1990		|	August		|	12			|	pass1234F	| - Double Click on Edit Icon to EDIT the Table Row.  |