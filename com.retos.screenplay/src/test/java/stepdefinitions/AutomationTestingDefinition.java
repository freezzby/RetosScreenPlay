package stepdefinitions;


import com.retos.screenplay.automationTesting.questions.TheEditInstruction;
import com.retos.screenplay.automationTesting.tasks.Register;
import com.retos.screenplay.automationTesting.ui.AutomationSiteRegisterPage;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AutomationTestingDefinition {


    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    private final Actor carlos = Actor.named("Carlos");


    @Before
    public void initialConfiguration() {
        carlos.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that Carlos wants to access the Web Automation Demo Site$")
    public void thatCarlosWantsToAccessTheWebAutomationDemoSite() {
        carlos.wasAbleTo(Open.browserOn(AutomationSiteRegisterPage.webSite()));
    }

    @When("^he registers in the site$")
    public void heRegistersInTheSite(DataTable data) {
        Map<String, String> registerData = data.asMaps(String.class, String.class).get(0);

        carlos.attemptsTo( Register.with(registerData));
    }

    @Then("^he verifies that the screen loads with text (.*)$")
    public void heVerifiesThatTheScreenLoadsWithText(String editText) {
        carlos.should(seeThat(TheEditInstruction.isVisible(editText)));

    }
}
