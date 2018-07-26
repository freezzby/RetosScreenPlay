package co.com.proyectobase.screenplay.stepdefinitions;


import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.retos.screenplay.automationTesting.tasks.SelectGender;
import com.retos.screenplay.automationTesting.tasks.SelectHobbies;
import com.retos.screenplay.automationTesting.tasks.SelectLanguages;
import com.retos.screenplay.automationTesting.tasks.SelectSkills;
import com.retos.screenplay.automationTesting.ui.AutomationSiteRegisterPage;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
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

	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	
	private Actor carlos = Actor.named("Carlos");
	
	
	@Before
	public void configuracionInicial()
	{
		carlos.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^that Carlos wants to access the Web Automation Demo Site$")
	public void thatCarlosWantsToAccessTheWebAutomationDemoSite() throws Exception {
	    carlos.wasAbleTo(Open.browserOn(AutomationSiteRegisterPage.webSite()));
	}

	@When("^he registers in the site$")
	public void heRegistersInTheSite(DataTable data) throws Exception {
		Map<String, String> registerData = data.asMaps(String.class, String.class).get(0);
		carlos.attemptsTo(Enter.theValue(registerData.get("FirstName")).into(AutomationSiteRegisterPage.FIRST_NAME_FIELD));
		carlos.attemptsTo(Enter.theValue(registerData.get("LastName")).into(AutomationSiteRegisterPage.LAST_NAME_FIELD));
		
		carlos.attemptsTo(Click.on(AutomationSiteRegisterPage.ADDRESS_FIELD));
		carlos.attemptsTo(Enter.theValue(registerData.get("Address")).into(AutomationSiteRegisterPage.ADDRESS_FIELD));
		carlos.attemptsTo(Enter.theValue(registerData.get("Email")).into(AutomationSiteRegisterPage.EMAIL_ADDRESS_FIELD));
		carlos.attemptsTo(Enter.theValue(registerData.get("Phone")).into(AutomationSiteRegisterPage.PHONE_FIELD));
		
		carlos.attemptsTo(SelectGender.fromThe(registerData.get("Gender")));
		
		carlos.attemptsTo(SelectHobbies.fromThe(registerData.get("Hobbies")));
		carlos.attemptsTo(SelectLanguages.fromThe(registerData.get("Languages")));
		carlos.attemptsTo(SelectSkills.fromThe(registerData.get("Skills")));
	}

	@Then("^he verifies that the screen loads with text Double Click on Edit Icon to EDIT the Table Row$")
	public void heVerifiesThatTheScreenLoadsWithTextDoubleClickOnEditIconToEDITTheTableRow() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
