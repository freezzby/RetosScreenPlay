package com.retos.screenplay.OrangeHRM.tasks;

import com.retos.screenplay.OrangeHRM.ui.OrangeHRMLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Login implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OrangeHRMLoginPage.BUTTON_LOGIN));
    }

    public static Login now(){
        return Tasks.instrumented(Login.class);
    }
}
