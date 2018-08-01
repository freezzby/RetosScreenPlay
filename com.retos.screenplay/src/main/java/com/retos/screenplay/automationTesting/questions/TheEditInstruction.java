package com.retos.screenplay.automationTesting.questions;

import com.retos.screenplay.automationTesting.ui.AutomationSiteWebTablePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheEditInstruction implements Question<Boolean> {

    String editText;

    public TheEditInstruction(String editText) {
        this.editText=editText;
    }

    public static TheEditInstruction isVisible(String editText) {
		return new TheEditInstruction(editText);
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		return AutomationSiteWebTablePage.DOUBLE_CLICK_TO_EDIT_TEXT.resolveFor(actor).isCurrentlyVisible() &&
				AutomationSiteWebTablePage.DOUBLE_CLICK_TO_EDIT_TEXT.resolveFor(actor).getText().equals(editText);
	}

}
