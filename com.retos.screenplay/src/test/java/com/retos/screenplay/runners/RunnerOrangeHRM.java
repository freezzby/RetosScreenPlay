package com.retos.screenplay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;


@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
        features="src/test/resources/features/orangeHRM.feature",
        glue = "stepdefinitions",
        snippets=SnippetType.CAMELCASE)
public class RunnerOrangeHRM {


}
