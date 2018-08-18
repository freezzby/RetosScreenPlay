package com.retos.screenplay.OrangeHRM.questions;

import com.retos.screenplay.OrangeHRM.ui.OrangeHRMEmployeeList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.Wait;

public class TheID implements Question<String> {


    public static TheID ofTheEmployee() {
        return new TheID();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(OrangeHRMEmployeeList.LOADING_BAR, WebElementStateMatchers.isNotVisible()));

        return OrangeHRMEmployeeList.EMPLOYEE_RESULT_ID.resolveFor(actor).getText();
    }
}
