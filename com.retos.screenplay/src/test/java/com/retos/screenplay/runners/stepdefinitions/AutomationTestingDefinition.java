package com.retos.screenplay.runners.stepdefinitions;


import java.util.Map;

import com.retos.screenplay.automationTesting.questions.TheEditInstruction;
import org.openqa.selenium.WebDriver;

import com.retos.screenplay.automationTesting.tasks.SelectDate;
import com.retos.screenplay.automationTesting.tasks.SelectFirstCountry;
import com.retos.screenplay.automationTesting.tasks.SelectGender;
import com.retos.screenplay.automationTesting.tasks.SelectHobbies;
import com.retos.screenplay.automationTesting.tasks.SelectLanguages;
import com.retos.screenplay.automationTesting.tasks.SelectSecondCountry;
import com.retos.screenplay.automationTesting.tasks.SelectSkills;
import com.retos.screenplay.automationTesting.ui.AutomationSiteRegisterPage;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class AutomationTestingDefinition {


    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    private final Actor carlos = Actor.named("Carlos");


    @Before
    public void configuracionInicial() {
        carlos.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that Carlos wants to access the Web Automation Demo Site$")
    public void thatCarlosWantsToAccessTheWebAutomationDemoSite() {
        carlos.wasAbleTo(Open.browserOn(AutomationSiteRegisterPage.webSite()));
    }

    @When("^he registers in the site$")
    public void heRegistersInTheSite(DataTable data) {
        Map<String, String> registerData = data.asMaps(String.class, String.class).get(0);

        carlos.attemptsTo(

                Enter.theValue(registerData.get("FirstName")).into(AutomationSiteRegisterPage.FIRST_NAME_FIELD),
                Enter.theValue(registerData.get("LastName")).into(AutomationSiteRegisterPage.LAST_NAME_FIELD),

                Click.on(AutomationSiteRegisterPage.ADDRESS_FIELD),
                Enter.theValue(registerData.get("Address")).into(AutomationSiteRegisterPage.ADDRESS_FIELD),

                Enter.theValue(registerData.get("Email")).into(AutomationSiteRegisterPage.EMAIL_ADDRESS_FIELD),
                Enter.theValue(registerData.get("Phone")).into(AutomationSiteRegisterPage.PHONE_FIELD),
                SelectGender.fromThe(registerData.get("Gender")),
                SelectHobbies.fromThe(registerData.get("Hobbies")),
                SelectLanguages.fromThe(registerData.get("Languages")),
                SelectSkills.fromThe(registerData.get("Skills")),
                SelectFirstCountry.fromThe(registerData.get("FirstCountry")),
                SelectSecondCountry.fromThe(registerData.get("SecondCountry")),

                SelectDate.year(registerData.get("BirthYear")).fromThe(AutomationSiteRegisterPage.YEAR_DROPDOWN_LIST),
                SelectDate.month(registerData.get("BirthMonth")).fromThe(AutomationSiteRegisterPage.MONTH_DROPDOWN_LIST),
                SelectDate.day(registerData.get("BirthDay")).fromThe(AutomationSiteRegisterPage.DAY_DROPDOWN_LIST),

                Enter.theValue(registerData.get("Password")).into(AutomationSiteRegisterPage.PASSWORD_FIELD),
                Enter.theValue(registerData.get("Password")).into(AutomationSiteRegisterPage.CONFIRM_PASSWORD_FIELD),



                Click.on(AutomationSiteRegisterPage.SUBMIT_BUTTON)
                        );
    }

    @Then("^he verifies that the screen loads with text Double Click on Edit Icon to EDIT the Table Row$")
    public void heVerifiesThatTheScreenLoadsWithTextDoubleClickOnEditIconToEDITTheTableRow() {
        carlos.should(seeThat(TheEditInstruction.isVisible()));
    }
}
