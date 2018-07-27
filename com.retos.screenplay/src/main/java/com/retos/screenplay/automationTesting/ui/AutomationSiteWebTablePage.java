package com.retos.screenplay.automationTesting.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.automationtesting.in/WebTable.html")
public class AutomationSiteWebTablePage extends PageObject {
	

	public static final Target DOUBLE_CLICK_TO_EDIT_TEXT =
			Target.the("Text field to show the user how to edit on the web table").located(By.xpath("/html/body/section/div[1]/div/div[2]/h4[1]"));
	

    public static AutomationSiteWebTablePage webSite()
	{
		return new AutomationSiteWebTablePage();
		
		
	}

	
}
