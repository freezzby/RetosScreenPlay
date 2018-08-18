package com.retos.screenplay.OrangeHRM.tasks;

import com.retos.screenplay.OrangeHRM.ui.OrangeHRMEmployeeList;
import com.retos.screenplay.OrangeHRM.ui.OrangeHRMMenuPage;
import com.retos.screenplay.OrangeHRM.ui.OrangeHRMPersonalDetailPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.KeyNames;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.Map;

public class Find implements Task {
    public static Find employee() {
        return new Find();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Map<String, String> data = (Map<String, String>) Serenity.getCurrentSession().get("Data");

        actor.attemptsTo(
                EnterTo.theMenu(OrangeHRMMenuPage.EMPLOYEE_LIST_MENU),
                WaitUntil.the(OrangeHRMEmployeeList.SEARCH_FIELD, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(actor.recall("EmployeeID")).into(OrangeHRMEmployeeList.SEARCH_FIELD),
                Hit.the(Keys.ENTER).into(OrangeHRMEmployeeList.SEARCH_FIELD)
        );
    }
}
