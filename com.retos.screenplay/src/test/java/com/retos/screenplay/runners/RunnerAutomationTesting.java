package com.retos.screenplay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
		features="src/test/resources/features/automationTesting.feature",
		snippets=SnippetType.CAMELCASE)
public class RunnerAutomationTesting {

}
