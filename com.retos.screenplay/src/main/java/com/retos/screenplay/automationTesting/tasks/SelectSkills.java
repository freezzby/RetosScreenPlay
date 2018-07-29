package com.retos.screenplay.automationTesting.tasks;

import com.retos.screenplay.automationTesting.ui.AutomationSiteRegisterPage;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectSkills implements Task {
	private final String skill;

	SelectSkills(String skill) {
		this.skill = skill;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(AutomationSiteRegisterPage.SKILL_DROPDOWN_BUTTON));
		AutomationSiteRegisterPage.HOBBIES_LIST.resolveFor(actor)
		.find(By.xpath("//option[text() ='" + skill + "']")).click();

	}

	public static SelectSkills fromThe(String skill) {
		return Tasks.instrumented(SelectSkills.class, skill);
	}

}
