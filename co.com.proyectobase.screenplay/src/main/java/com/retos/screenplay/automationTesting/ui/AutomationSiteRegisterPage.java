package com.retos.screenplay.automationTesting.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.automationtesting.in/Register.html")
public class AutomationSiteRegisterPage extends PageObject {
	

	public static final Target FIRST_NAME_FIELD = 
			Target.the("Field to input the first name").located(By.xpath("//input[@type = 'text' and @placeholder='First Name']"));
	
	public static final Target LAST_NAME_FIELD = 
			Target.the("Field to input the last name").located(By.xpath("//input[@type = 'text' and @placeholder='Last Name']"));
	
	public static final Target ADDRESS_FIELD = 
			Target.the("Field to input the address").located(By.xpath("//textarea"));
	
	public static final Target EMAIL_ADDRESS_FIELD = 
			Target.the("Field to input the email").located(By.xpath("//input[@type = 'email' ]"));

	public static final Target PHONE_FIELD = 
			Target.the("Field to input the phone number").located(By.xpath("//input[@type = 'tel']"));
	
	public static final Target GENDER_LIST = 
			Target.the("List of genders").located(By.xpath("//input[@name = 'radiooptions' ]"));
	
	public static final Target HOBBIES_LIST = 
			Target.the("List of hobbies").located(By.xpath("//input[contains(@id , 'checkbox' )]"));
	
	public static final Target LANGUAGES_DROPDOWN_BUTTON = 
	Target.the("Button to drop down the list of languages").located(By.id("msdd"));
	
	public static final Target LANGUAGES_LIST = 
			Target.the("List of languages").located(By.xpath("//a[@class='ui-corner-all']"));

	public static final Target SKILL_DROPDOWN_BUTTON = 
			Target.the("Button to drop down the list of skills").located(By.id("Skills"));
	
	public static final Target SKILLS_LIST = 
			Target.the("Button to drop down the list of skills").located(By.xpath("//select[@id = 'Skills']//option"));

	
	public static AutomationSiteRegisterPage webSite()
	{
		return new AutomationSiteRegisterPage();
		
		
	}

	
}
