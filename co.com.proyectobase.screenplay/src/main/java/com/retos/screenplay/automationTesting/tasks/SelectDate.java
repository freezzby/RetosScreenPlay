package com.retos.screenplay.automationTesting.tasks;

import com.retos.screenplay.automationTesting.ui.AutomationSiteRegisterPage;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectDate implements Task {

	String date;
	Target target;

	public SelectDate(String date) {
		this.date = date;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(target));
		target.resolveFor(actor)
				.find(By.xpath("/option[contains(text(),'" + date + "')]")).click();
	}

	public static SelectDate year(String date) {
		return Tasks.instrumented(SelectDate.class, date);
	}
	
	public SelectDate fromThe(Target target) {
		this.target=target;
		return this;
	}

}
