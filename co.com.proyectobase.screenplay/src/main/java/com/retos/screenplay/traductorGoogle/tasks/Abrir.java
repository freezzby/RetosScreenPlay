package com.retos.screenplay.traductorGoogle.tasks;

import com.retos.screenplay.traductorGoogle.ui.GoogleHomePage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task{

	private GoogleHomePage googleHomePage;
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(googleHomePage));
	}

	public static Abrir LaPaginaDeGoogle() {
		return Tasks.instrumented(Abrir.class);
	}

}
