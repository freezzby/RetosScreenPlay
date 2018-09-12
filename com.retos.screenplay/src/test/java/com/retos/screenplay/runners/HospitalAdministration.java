package com.retos.screenplay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;


@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
        features="src/test/resources/features/HospitalAdministration.feature",
        glue = "stepdefinitions",
        snippets=SnippetType.CAMELCASE)
public class HospitalAdministration {


}
