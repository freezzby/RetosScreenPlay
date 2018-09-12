package com.retos.screenplay.HospitalAdministration.tasks;

import com.retos.screenplay.HospitalAdministration.ui.HospitalAdministrationDoctorRegisterPage;
import com.retos.screenplay.HospitalAdministration.ui.HospitalAdministrationHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegisterNew implements Task {
    public static RegisterNew person() {
        return new RegisterNew();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(actor.recall("FirstNames")).into(HospitalAdministrationDoctorRegisterPage.DOCTOR_FIRST_NAME_FIELD),
                Enter.theValue(actor.recall("LastNames")).into(HospitalAdministrationDoctorRegisterPage.DOCTOR_LAST_NAME_FIELD),
                Enter.theValue(actor.recall("Phone")).into(HospitalAdministrationDoctorRegisterPage.DOCTOR_PHONE_FIELD),
                SelectFromOptions.byValue(actor.recall("IdType")).from(HospitalAdministrationDoctorRegisterPage.DOCTOR_ID_TYPE_DROP_DOWN),
                Enter.theValue(actor.recall("Id")).into(HospitalAdministrationDoctorRegisterPage.DOCTOR_ID_FIELD),
                Click.on(HospitalAdministrationDoctorRegisterPage.SUBMIT_BUTTON)
        );

    }
}
