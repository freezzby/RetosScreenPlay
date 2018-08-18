package stepdefinitions;

import com.retos.screenplay.OrangeHRM.questions.TheID;
import com.retos.screenplay.OrangeHRM.tasks.*;
import com.retos.screenplay.OrangeHRM.ui.OrangeHRMEmployeeList;
import com.retos.screenplay.OrangeHRM.ui.OrangeHRMLoginPage;
import com.retos.screenplay.OrangeHRM.ui.OrangeHRMMenuPage;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matcher;
import org.hamcrest.core.IsEqual;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.*;

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

    @When("^he registers an employee on orangeHR$")
    public void heRegistersAnEmployeeOnOrangeHR(DataTable data) throws Throwable {
        Serenity.getCurrentSession().put("Data", data.asMaps(String.class, String.class).get(0));


        juan.attemptsTo(
                Login.now(),
                EnterTo.theMenu(OrangeHRMMenuPage.PIM_MENU),
                EnterTo.theMenu(OrangeHRMMenuPage.ADD_EMPLOYEE_MENU),
                Register.employee(),
                Edit.personalDetails(),

                Find.employee()
        );

    }

    @Then("^he sees the new employee on orangeHR$")
    public void heSeesTheNewEmployeeOnOrangeHR() throws Throwable {
        juan.should(seeThat(TheID.ofTheEmployee(),
                equalTo(juan.recall("EmployeeID"))));

    }
}
