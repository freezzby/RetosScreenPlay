package com.retos.screenplay.automationTesting.tasks;

import com.retos.screenplay.automationTesting.ui.AutomationSiteRegisterPage;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SelectGender implements Task {

	private final String gender;

	SelectGender(String gender) {
		this.gender = gender;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		AutomationSiteRegisterPage.GENDER_LIST.resolveFor(actor)
				.find(By.xpath("//input[contains(@value,'" + gender + "')]")).click();

	}

	public static SelectGender fromThe(String gender) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(SelectGender.class, gender);
	}

}
