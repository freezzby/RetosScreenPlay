package stepdefinitions;

import com.retos.screenplay.HospitalAdministration.questions.TheResult;
import com.retos.screenplay.HospitalAdministration.tasks.AddThe;
import com.retos.screenplay.HospitalAdministration.tasks.RegisterNew;
import com.retos.screenplay.HospitalAdministration.ui.HospitalAdministrationHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import cucumber.api.DataTable;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.Matchers.containsString;

public class HospitalAdministrationDefinition {


    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    private final Actor carlos = Actor.named("Carlos");



    @Before
    public void initialConfiguration() {
        carlos.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^that carlos needs to register a new doctor$")
    public void thatCarlosNeedsToRegisterANewDoctor() throws Throwable {
        carlos.wasAbleTo(Open.browserOn(HospitalAdministrationHomePage.webSite()));
        carlos.attemptsTo(Click.on(HospitalAdministrationHomePage.ADD_DOCTOR_LINK));

    }


    @Then("^he verifies that the system shows the message \"([^\"]*)\"$")
    public void heVerifiesThatTheSystemShowsTheMessage(String message) throws Throwable {
        carlos.should(GivenWhenThen.seeThat(TheResult.ofTheRegistration(), containsString(message)));
    }

    @When("^he makes the registration in the hospital administration application$")
    public void heMakesTheRegistrationInTheHospitalAdministrationApplication(DataTable data) throws Throwable {
        carlos.attemptsTo(AddThe.person(data));

        carlos.attemptsTo(RegisterNew.person());
    }

    @Given("^that carlos needs to register a new patient$")
    public void thatCarlosNeedsToRegisterANewPatient() throws Throwable {
        carlos.wasAbleTo(Open.browserOn(HospitalAdministrationHomePage.webSite()));
        carlos.attemptsTo(Click.on(HospitalAdministrationHomePage.ADD_PATIENT_LINK));

    }
}
