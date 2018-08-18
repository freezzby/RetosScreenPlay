package com.retos.screenplay.OrangeHRM.tasks;

import com.retos.screenplay.OrangeHRM.interactions.Select;
import com.retos.screenplay.OrangeHRM.ui.OrangeHRMRegisterEmployeePage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DriverTask;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

public class Register implements Task {


    public static Register employee() {
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Map<String, String> data = (Map<String, String>) Serenity.getCurrentSession().get("Data");

        actor.attemptsTo(
                WaitUntil.the(OrangeHRMRegisterEmployeePage.FIRST_NAME_FIELD, WebElementStateMatchers.isCurrentlyEnabled()).forNoMoreThan(30).seconds()

                );
        actor.remember("EmployeeID",OrangeHRMRegisterEmployeePage.EMPLOYEE_ID_FIELD.resolveFor(actor).getValue());
        //Serenity.getCurrentSession().put("EmployeeID",OrangeHRMRegisterEmployeePage.EMPLOYEE_ID_FIELD.resolveFor(actor).getValue());
        actor.attemptsTo(
                Enter.theValue(data.get("FirstName")).into(OrangeHRMRegisterEmployeePage.FIRST_NAME_FIELD),
                Enter.theValue(data.get("MiddleName")).into(OrangeHRMRegisterEmployeePage.MIDDLE_NAME_FIELD),
                Enter.theValue(data.get("LastName")).into(OrangeHRMRegisterEmployeePage.LAST_NAME_FIELD),
                Select.location(data.get("Location")).on(OrangeHRMRegisterEmployeePage.DROP_DOWN_LOCATION),
                Click.on(OrangeHRMRegisterEmployeePage.SAVE_BUTTON)
                );

    }
}
