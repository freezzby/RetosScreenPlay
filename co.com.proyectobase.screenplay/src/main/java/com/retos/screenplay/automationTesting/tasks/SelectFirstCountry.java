package com.retos.screenplay.automationTesting.tasks;

import com.retos.screenplay.automationTesting.ui.AutomationSiteRegisterPage;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectFirstCountry implements Task {

	String country;

	public SelectFirstCountry(String country) {
		this.country = country;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(AutomationSiteRegisterPage.FIRST_COUNTRY_DROPDOWN_BUTTON));
		AutomationSiteRegisterPage.FIRST_COUNTRY_LIST.resolveFor(actor)
				.find(By.xpath("//option[contains(text(),'" + country + "')]")).click();
	}

	public static SelectFirstCountry fromThe(String country) {
		return Tasks.instrumented(SelectFirstCountry.class, country);
	}

}
