package com.retos.screenplay.automationTesting.tasks;

import com.retos.screenplay.automationTesting.ui.AutomationSiteRegisterPage;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectSecondCountry implements Task {

	String country;

	public SelectSecondCountry(String country) {
		this.country = country;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(AutomationSiteRegisterPage.SECOND_COUNTRY_DROPDOWN_BUTTON));
		AutomationSiteRegisterPage.SECOND_COUNTRY_LIST.resolveFor(actor)
				.find(By.xpath("//li[contains(text(),'" + country + "')]")).click();
	}

	public static SelectSecondCountry fromThe(String country) {
		return Tasks.instrumented(SelectSecondCountry.class, country);
	}

}
