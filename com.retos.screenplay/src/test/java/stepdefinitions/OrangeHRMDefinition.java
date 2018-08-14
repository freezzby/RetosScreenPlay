package stepdefinitions;

import com.retos.screenplay.OrangeHRM.tasks.*;
import com.retos.screenplay.OrangeHRM.ui.OrangeHRMLoginPage;
import com.retos.screenplay.OrangeHRM.ui.OrangeHRMMenuPage;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class OrangeHRMDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    private final Actor juan = Actor.named("Juan");


    @Before
    public void initialConfiguration() {
        juan.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^that Juan needs to create an employee on orangeHR$")
    public void thatJuanNeedsToCreateAnEmployeeOnOrangeHR() throws Throwable {
        juan.wasAbleTo(Open.browserOn(OrangeHRMLoginPage.webSite()));
    }

    @Then("^he registers an employee on orangeHR$")
    public void heRegistersAnEmployeeOnOrangeHR(DataTable data) throws Throwable {
        Serenity.getCurrentSession().put("Data", data.asMaps(String.class, String.class).get(0));


        juan.attemptsTo(
                Login.now(),
                EnterTo.theMenu(OrangeHRMMenuPage.PIM_MENU),
                EnterTo.theMenu(OrangeHRMMenuPage.ADD_EMPLOYEE_MENU),
                Register.employee(),
                Edit.personalDetails()
        );

    }

    @Then("^he sees the new employee on orangeHR$")
    public void heSeesTheNewEmployeeOnOrangeHR() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }
}
