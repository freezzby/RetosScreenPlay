package com.retos.screenplay.automationTesting.tasks;


import com.retos.screenplay.automationTesting.ui.AutomationSiteRegisterPage;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SelectHobbies implements Task {
	private final String hobbies;

	SelectHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		String[] lstHobbies = hobbies.split(",");

		for (String lstHobby : lstHobbies) {
			AutomationSiteRegisterPage.HOBBIES_LIST.resolveFor(actor)
					.find(By.xpath("//input[contains(@value,'" + lstHobby + "')]")).click();
		}
		
	}

	public static SelectHobbies fromThe(String hobbies) {
		return Tasks.instrumented(SelectHobbies.class, hobbies);
	}
}
