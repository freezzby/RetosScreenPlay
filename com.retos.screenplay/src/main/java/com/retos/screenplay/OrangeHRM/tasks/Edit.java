package com.retos.screenplay.OrangeHRM.tasks;

import com.retos.screenplay.OrangeHRM.interactions.Select;
import com.retos.screenplay.OrangeHRM.ui.OrangeHRMPersonalDetailPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

public class Edit implements Task {


    public static Edit personalDetails() {
        return Tasks.instrumented(Edit.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Map<String, String> data = (Map<String, String>) Serenity.getCurrentSession().get("Data");
        actor.attemptsTo(
                WaitUntil.the(OrangeHRMPersonalDetailPage.DATE_OF_BIRTCH_FIELD, WebElementStateMatchers.isCurrentlyEnabled()),
                Enter.theValue(data.get("DateOfBirth")).into(OrangeHRMPersonalDetailPage.DATE_OF_BIRTCH_FIELD),
                Select.maritalStatus(data.get("MaritalStatus")).on(OrangeHRMPersonalDetailPage.MARITAL_STATUS_DROPDOWN)


                );
    }
}
