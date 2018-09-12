package com.retos.screenplay.HospitalAdministration.questions;

import com.retos.screenplay.HospitalAdministration.ui.HospitalAdministrationDoctorRegisterResultPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheResult implements Question<String> {


    public static TheResult ofTheRegistration() {
        return new TheResult();
    }

    @Override
    public String answeredBy(Actor actor) {
        return HospitalAdministrationDoctorRegisterResultPage.RESULT_MESSAGE.resolveFor(actor).getText();
    }
}
