package com.retos.screenplay.automationTesting.questions;

import com.retos.screenplay.automationTesting.ui.AutomationSiteWebTablePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheEditInstruction implements Question<Boolean> {


	public static TheEditInstruction isVisible() {
		return new TheEditInstruction();
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		return AutomationSiteWebTablePage.DOUBLE_CLICK_TO_EDIT_TEXT.resolveFor(actor).isCurrentlyVisible();
	}

}
