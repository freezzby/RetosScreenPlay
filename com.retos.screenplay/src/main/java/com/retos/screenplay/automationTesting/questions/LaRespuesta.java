package com.retos.screenplay.automationTesting.questions;

import com.retos.screenplay.traductorGoogle.ui.GoogleTraductorPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaRespuesta implements Question<String> {

	public static LaRespuesta es() {
		return new LaRespuesta();
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(GoogleTraductorPage.AREA_TRADUCIDA).viewedBy(actor).asString();
	}

}
