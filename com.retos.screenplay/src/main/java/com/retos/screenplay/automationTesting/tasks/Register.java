package com.retos.screenplay.automationTesting.tasks;

import com.retos.screenplay.automationTesting.ui.AutomationSiteRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.Map;

public class Register implements Task {

    Map<String, String> registerData;

    public Register(Map<String, String> registerData){
        this.registerData = registerData;
    }

    public static Register with(Map<String, String> registerData) {
        return Tasks.instrumented(Register.class,registerData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                Enter.theValue(registerData.get("FirstName")).into(AutomationSiteRegisterPage.FIRST_NAME_FIELD),
                Enter.theValue(registerData.get("LastName")).into(AutomationSiteRegisterPage.LAST_NAME_FIELD),

                Click.on(AutomationSiteRegisterPage.ADDRESS_FIELD),
                Enter.theValue(registerData.get("Address")).into(AutomationSiteRegisterPage.ADDRESS_FIELD),

                Enter.theValue(registerData.get("Email")).into(AutomationSiteRegisterPage.EMAIL_ADDRESS_FIELD),
                Enter.theValue(registerData.get("Phone")).into(AutomationSiteRegisterPage.PHONE_FIELD),
                SelectGender.fromThe(registerData.get("Gender")),
                SelectHobbies.fromThe(registerData.get("Hobbies")),
                SelectLanguages.fromThe(registerData.get("Languages")),
                SelectFromOptions.byVisibleText(registerData.get("Skills")).from(AutomationSiteRegisterPage.SKILL_DROPDOWN_BUTTON),
                SelectFromOptions.byVisibleText(registerData.get("FirstCountry")).from(AutomationSiteRegisterPage.FIRST_COUNTRY_DROPDOWN_BUTTON),
                SelectSecondCountry.fromThe(registerData.get("SecondCountry")),

                SelectFromOptions.byVisibleText(registerData.get("BirthYear")).from(AutomationSiteRegisterPage.YEAR_DROPDOWN_LIST),
                SelectFromOptions.byVisibleText(registerData.get("BirthMonth")).from(AutomationSiteRegisterPage.MONTH_DROPDOWN_LIST),
                SelectFromOptions.byVisibleText(registerData.get("BirthDay")).from(AutomationSiteRegisterPage.DAY_DROPDOWN_LIST),

                Enter.theValue(registerData.get("Password")).into(AutomationSiteRegisterPage.PASSWORD_FIELD),
                Enter.theValue(registerData.get("Password")).into(AutomationSiteRegisterPage.CONFIRM_PASSWORD_FIELD),



                Click.on(AutomationSiteRegisterPage.SUBMIT_BUTTON)
            );

    }
}
