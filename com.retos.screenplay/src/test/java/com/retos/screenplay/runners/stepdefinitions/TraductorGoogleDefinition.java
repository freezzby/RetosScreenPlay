package com.retos.screenplay.runners.stepdefinitions;

import static org.hamcrest.Matchers.equalTo;
import org.openqa.selenium.WebDriver;

import com.retos.screenplay.traductorGoogle.questions.LaRespuesta;
import com.retos.screenplay.traductorGoogle.tasks.Abrir;
import com.retos.screenplay.traductorGoogle.tasks.Traducir;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class TraductorGoogleDefinition {
	
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	
	private final Actor rafa = Actor.named("Rafa");
	
	
	@Before
	public void configuracionInicial()
	{
		rafa.can(BrowseTheWeb.with(hisBrowser));
	}
	
	
	@Given("^that Raga wants to use Google Translate$")
	public void thatRagaWantsToUseGoogleTranslate() {
		rafa.wasAbleTo(Abrir.LaPaginaDeGoogle());
	}


	@When("^he translates the word (.*) from english to spanish$")
	public void heTranslatesTheWordTableFromEnglishToSpanish(String palabra) {
	   rafa.attemptsTo(Traducir.DeInglesAEspanolLa(palabra));
	}

	@Then("^he should se the word (.*) on the screen$")
	public void heShouldSeTheWordMesaOnTheScreen(String palabraEsperada) {
		rafa.should(seeThat(LaRespuesta.es(), equalTo(palabraEsperada)));
	}

	
}
