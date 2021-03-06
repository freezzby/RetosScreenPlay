package com.retos.screenplay.automationTesting.tasks;

import com.retos.screenplay.automationTesting.ui.AutomationSiteRegisterPage;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectLanguages implements Task {
	
	private final String languages;
	
	SelectLanguages(String languages) {
		this.languages=languages;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		String[] lstLanguages = languages.split(",");

		for (String lstLanguage : lstLanguages) {
			actor.attemptsTo(Click.on(AutomationSiteRegisterPage.LANGUAGES_DROPDOWN_BUTTON));
			AutomationSiteRegisterPage.LANGUAGES_LIST.resolveFor(actor)
					.find(By.xpath("//a[contains(text(),'" + lstLanguage + "')]")).click();
		}
		actor.attemptsTo(Click.on(AutomationSiteRegisterPage.PHONE_FIELD));
	}

	public static SelectLanguages fromThe(String languages) {

		return Tasks.instrumented(SelectLanguages.class, languages);
	}

}
