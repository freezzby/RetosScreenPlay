package com.retos.screenplay.automationTesting.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectDate implements Task {

	private final String date;
	private Target target;

	SelectDate(String date) {
		this.date = date;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(target));
		actor.attemptsTo(Click.on((WebElementFacade) target.resolveFor(actor).selectByVisibleText(date)));
		target.resolveFor(actor)
				.selectByVisibleText(date);
	}

	public static SelectDate year(String date) {
		return Tasks.instrumented(SelectDate.class, date);
	}

	public static SelectDate month(String date) {
		return Tasks.instrumented(SelectDate.class, date);
	}

	public static SelectDate day(String date) {
		return Tasks.instrumented(SelectDate.class, date);
	}
	
	public SelectDate fromThe(Target target) {
		this.target=target;
		return this;
	}

}
