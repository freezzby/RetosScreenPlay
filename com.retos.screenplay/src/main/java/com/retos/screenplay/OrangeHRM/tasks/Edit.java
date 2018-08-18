package com.retos.screenplay.OrangeHRM.tasks;

import com.retos.screenplay.OrangeHRM.interactions.Select;
import com.retos.screenplay.OrangeHRM.ui.OrangeHRMPersonalDetailPage;
import com.retos.screenplay.automationTesting.tasks.SelectGender;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.apache.xpath.operations.Or;

import java.util.Map;

public class Edit implements Task {


    public static Edit personalDetails() {
        return Tasks.instrumented(Edit.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Map<String, String> data = (Map<String, String>) Serenity.getCurrentSession().get("Data");
        actor.attemptsTo(
                WaitUntil.the(OrangeHRMPersonalDetailPage.DATE_OF_BIRTH_FIELD, WebElementStateMatchers.isCurrentlyEnabled()),
                Enter.theValue(data.get("DateOfBirth")).into(OrangeHRMPersonalDetailPage.DATE_OF_BIRTH_FIELD),
                Select.maritalStatus(data.get("MaritalStatus")).on(OrangeHRMPersonalDetailPage.MARITAL_STATUS_DROPDOWN),
                SelectGender.fromThe(data.get("Gender")),
                Select.nationality(data.get("Nationality")).on(OrangeHRMPersonalDetailPage.NATIONALITY_DROPDOWN),
                Enter.theValue(data.get("DriverLicense")).into(OrangeHRMPersonalDetailPage.DRIVER_LICENCE_FIELD),
                Enter.theValue(data.get("LicenseExpiration")).into(OrangeHRMPersonalDetailPage.LICENCE_EXPIRATION_FIELD),
                //Select.theRace(data.get("Race")).on(OrangeHRMPersonalDetailPage.RACE_DROPDOWN),
                Select.bloodGroup(data.get("BloodGroup")).on(OrangeHRMPersonalDetailPage.BLOOD_GROUP_DROPDOWN),
                Enter.theValue(data.get("Hobbies")).into(OrangeHRMPersonalDetailPage.HOBBIES_FIELD),
                Click.on(OrangeHRMPersonalDetailPage.SUBMIT_BUTTON)

                );
    }
}
