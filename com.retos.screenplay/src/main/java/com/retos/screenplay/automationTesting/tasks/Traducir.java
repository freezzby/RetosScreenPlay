package com.retos.screenplay.automationTesting.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import com.retos.screenplay.traductorGoogle.ui.*;

public class Traducir implements Task {

	private String palabra;
	
	public Traducir(String palabra) {
		super();
		this.palabra = palabra;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleHomePage.BOTON_APLICACIONES));
		actor.attemptsTo(Click.on(GoogleHomePage.BOTON_GOOGLE_TRANSLATE));
		
		
		actor.attemptsTo(Click.on(GoogleTraductorPage.BOTON_LENGUAJE_ORIGEN));
		actor.attemptsTo(Click.on(GoogleTraductorPage.OPCION_INGLES));
		
		actor.attemptsTo(Click.on(GoogleTraductorPage.BOTON_LENGUAJE_DESTINO));
		actor.attemptsTo(Click.on(GoogleTraductorPage.OPCION_ESPANOL));
		
		actor.attemptsTo(Enter.theValue(palabra).into(GoogleTraductorPage.AREA_DE_TRADUCCION));
		actor.attemptsTo(Click.on(GoogleTraductorPage.BOTON_TRADUCIR));
		
//		actor.attemptsTo(WaitUntil.the(GoogleTraductorPage.BOTON_TRADUCIR, WebElementStateMatchers.isNotVisible()).forNoMoreThan(10).seconds());
	}
	
	public static Traducir DeInglesAEspanolLa(String palabra) {
		
		return Tasks.instrumented(Traducir.class, palabra);
	}
	
	

}
